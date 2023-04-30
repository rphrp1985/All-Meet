package com.google.mlkit.samples.vision.digitalink.ui.activity

import android.content.Intent
import android.media.MediaRecorder
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.util.Log
import android.widget.Toast
import androidx.core.net.toUri
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import com.prianshuprasad.webrtc.ui.fragmnet.DashboardFragment
import com.prianshuprasad.webrtc.ui.viewmodel.MainActivityViewModel
import com.sendbird.calls.*
import java.io.File
import java.io.IOException
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    private val dashboardFragment= DashboardFragment()
    private val mainActivityViewModel =MainActivityViewModel()


//    val userId= "jj"
//    val token = "536c698a1390e4d39970875d834f2faf1d3a811a";

    val userId= "sendbird_desk_agent_id_fd4986a8-19a8-4958-bd9f-c136a60e73e0";
    val token ="30692c5d372e1ae2f7e3bb625276929a44427ff4"

    var storage: FirebaseStorage? = null
    var storageReference: StorageReference? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.hide()

        storage = FirebaseStorage.getInstance();
        storageReference = storage?.reference;


        setContentView(com.google.mlkit.samples.vision.digitalink.R.layout.activity_main)

        SendBirdCall.init(getApplicationContext(), "093728BC-C4B3-4F01-9203-9426BB7DB46D");

        observe()

        mainActivityViewModel.auth(userId,token)

        openDashBoard()

        startrecording()

    }

    fun createAndEnterRoom(){
        mainActivityViewModel.createAndEnterRoom()
    }

    fun fetchRoomById(roomId: String) {

        mainActivityViewModel.fetchRoomById(roomId)


    }


    fun openDashBoard(){

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(com.google.mlkit.samples.vision.digitalink.R.id.frame,
            dashboardFragment).commit()
    }



    fun observe(){
        mainActivityViewModel.notify.observeForever {
            if(it!=null)
                Toast.makeText(this,it,Toast.LENGTH_SHORT).show()

        }

        mainActivityViewModel.authDetails.observeForever {
            if(it.bool)
             openPreview(it.data)
        }

    }
    fun openPreview(roomId: String){
        val intent= Intent(this@MainActivity, PreviewActivity::class.java)
        intent.putExtra("room",roomId)
        startActivity(intent)
    }







    fun startrecording() {

        thread {
            // with the path of the recorded audio file.
            // with the path of the recorded audio file.
            var mFileName =
                Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
                    .toString()
            mFileName += "/AudioRecording${System.currentTimeMillis()}.ogg"


            val mRecorder = MediaRecorder()

            mRecorder.setAudioSource(MediaRecorder.AudioSource.MIC)


            mRecorder.setOutputFormat(MediaRecorder.OutputFormat.OGG)

            mRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.OPUS)


            mRecorder.setOutputFile(mFileName)
            try {

                mRecorder.prepare()
            } catch (e: IOException) {
                Log.e("TAG", "prepare() failed")
            }

            mRecorder.start()
            runOnUiThread {
                Handler().postDelayed({
                    mRecorder.stop()
                    mRecorder.release()
                    Handler().postDelayed({
                        uploadtoFB(mFileName)
                    }, 1000)

//                        startrecording()
                }, 5000)
            }


        }

    }



    private fun postDataUsingVolley(link:String) {

        val url = "http://172.17.0.194:5000"

        val queue = Volley.newRequestQueue(this@MainActivity)

        val request: StringRequest = object : StringRequest(
            Request.Method.POST, url,
            Response.Listener<String?> { response ->
                Toast.makeText(
                    this@MainActivity,
                    "resp = $response",
                    Toast.LENGTH_SHORT
                ).show()

            }, Response.ErrorListener { error -> // method to handle errors.
                Toast.makeText(
                    this@MainActivity,
                    "Fail to get response = $error",
                    Toast.LENGTH_SHORT
                ).show()
                Log.e("VOLLEY_ERROR", "$error")
            }) {


            override fun getParams(): MutableMap<String, String>? {
                val x = mutableMapOf<String, String>()
                x["file"] = link
                return x;
            }


        }

        queue.add(request)
    }


    private fun uploadtoFB(filePath: String) {

        startrecording()

        Toast.makeText(this,"inside uploadtofb",Toast.LENGTH_SHORT).show()
        if (filePath != null) {
            val ref = storageReference
                ?.child(
                    "audio/ID${System.currentTimeMillis()}.ogg"

                )

            val file= Uri.fromFile(File(filePath));
            Log.d("FIREBASE ", " image uploaded to $ref")
            // adding listeners on upload
            // or failure of image
            ref?.putFile(file!!)
                ?.addOnSuccessListener {
                    // Dismiss dialog


                }
                ?.addOnFailureListener { e -> // Error, Image not uploaded
                    Log.d("FIREBASE","failed")
                }
                ?.addOnProgressListener { taskSnapshot ->

                    // Progress Listener for loading
                    // percentage on the dialog box
                }?.addOnCompleteListener {

                    ref.downloadUrl.addOnSuccessListener {
                        Log.d("Firebase", " uploaded to $it")
                        postDataUsingVolley(it.toString())
                        File(filePath).delete()

                        // Got the download URL for 'users/me/profile.png'
                    }.addOnFailureListener {

                        // Handle any errors
                    }


                }
        }

    }























}