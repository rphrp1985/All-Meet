package com.google.mlkit.samples.vision.digitalink.ui.activity



//import androidx.databinding.DataBindingUtil
//import com.google.mlkit.samples.vision.digitalink.databinding.ActivityCallBinding
//import com.prianshuprasad.webrtc.R
//import com.prianshuprasad.webrtc.databinding.ActivityCallBinding

//import kotlinx.coroutines.DefaultExecutor.thread

//import com.google.mlkit.samples.vision.digitalink.DigitalInkMainActivity
//import com.sendbird.android.shadow.okhttp3.MultipartBody
import android.content.Intent
import android.content.res.Resources
import android.media.MediaRecorder
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import com.google.mlkit.samples.vision.digitalink.R
import com.google.mlkit.samples.vision.digitalink.databinding.ActivityCallBinding
import com.google.mlkit.samples.vision.digitalink.epoxy.EpoxyController
import com.google.mlkit.samples.vision.digitalink.kotlin.DigitalInkMainActivity
import com.prianshuprasad.webrtc.GroupCallViewModel
import com.sendbird.calls.Participant
import com.sendbird.calls.SendBirdCall
import java.io.File
import java.lang.Thread.sleep
import kotlin.concurrent.thread


class CallActivity : AppCompatActivity() {

    lateinit var binding: ActivityCallBinding
    lateinit var groupCallViewModel: GroupCallViewModel
    var roomId: String = ""
    var storage: FirebaseStorage? = null

    var storageReference: StorageReference? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_call)

        storage = FirebaseStorage.getInstance();
        storageReference = storage?.reference;

        supportActionBar?.hide()
        roomId = intent.getStringExtra("room").toString()

        groupCallViewModel = GroupCallViewModel(roomId)

        initView(roomId)
        initiateRec()
        sendText()

    }


    private fun initView(roomId: String) {
        val room = SendBirdCall.getCachedRoomById(roomId)

        // views
        binding.groupCallTextViewRoomId.text = roomId
        setAudioEnabledImage(room?.localParticipant?.isAudioEnabled ?: false)
        setVideoEnabledImage(room?.localParticipant?.isVideoEnabled ?: false)

        // RecyclerView
        initRecyclerView()

        // ViewModel
        observeViewModel()

        // events
        binding.groupCallImageViewSpeaker.setOnClickListener {
            showSelectingAudioDeviceDialog()
        }

        binding.groupCallImageViewCameraFlip.setOnClickListener {
//            viewModel.switchCamera()
        }

        binding.groupCallImageViewExit.setOnClickListener {
            groupCallViewModel.exit()
            finish()
        }


        binding.groupCallImageViewAudioOnOff.setOnClickListener {
            val isAudioEnabled = room?.localParticipant?.isAudioEnabled ?: return@setOnClickListener
            if (isAudioEnabled) {
                groupCallViewModel.muteMicrophone()
            } else {
                groupCallViewModel.unmuteMicrophone()
            }
        }

        binding.groupCallImageViewVideoOnOff.setOnClickListener {
            val isAudioEnabled = room?.localParticipant?.isAudioEnabled ?: return@setOnClickListener
            if (isAudioEnabled) {
                groupCallViewModel.stopLocalVideo()
            } else {
                groupCallViewModel.startLocalVideo()
            }
        }

        binding.groupCallImageViewExit.setOnClickListener {
            groupCallViewModel.exit()
        }
        binding.handwritting.setOnClickListener {
            val intent= Intent(this, DigitalInkMainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun initRecyclerView() {
        val width: Int = Resources.getSystem().displayMetrics.widthPixels
        val height: Int = (Resources.getSystem().displayMetrics.heightPixels * 8) / 10;
        val recyclerView = binding.groupCallRecyclerViewParticipants

        recyclerView.layoutManager = GridLayoutManager(this, 1)
        val controller = EpoxyController(height, width)
        recyclerView.adapter = controller.adapter
        controller.requestModelBuild()

        groupCallViewModel.participants.observeForever {

            val x = ArrayList<Participant>()

            for (i in it) {
//                Toast.makeText(this@CallActivity, "${i.toString()}", Toast.LENGTH_SHORT).show()
                x.add(i);
            }
            controller.update(x)
            controller.requestModelBuild()

        }
    }

    private fun observeViewModel() {
        groupCallViewModel.localParticipant.observe(this) {
            if (it != null) {
                setAudioEnabledImage(it.isAudioEnabled)
                setVideoEnabledImage(it.isVideoEnabled)
            }
        }
//
//        groupCallViewModel.isExited.observe(viewLifecycleOwner) {
//            if (it.status == Status.SUCCESS) {
//                activity?.finish()
//            } else {
//                val message = it.message ?: return@observe
//                activity?.showToast(message)
//            }
//        }
//
//        viewModel.currentAudioDevice.observe(viewLifecycleOwner) {
//            if (it != null) {
//                val resource = when (it) {
//                    AudioDevice.EARPIECE -> R.drawable.icon_bluetooth_white
//                    AudioDevice.SPEAKERPHONE -> R.drawable.icon_speaker
//                    AudioDevice.WIRED_HEADSET -> R.drawable.icon_headset_white
//                    AudioDevice.BLUETOOTH -> R.drawable.icon_bluetooth_white
//                }
//
//                binding.groupCallImageViewSpeaker.setImageResource(resource)
//            }
//        }
    }

    private fun setAudioEnabledImage(isEnabled: Boolean) {
        binding.groupCallImageViewAudioOnOff.setImageResource(
            if (isEnabled) {
                R.drawable.ic_baseline_mic_24
            } else {
                R.drawable.ic_baseline_mic_off_24
            }
        )
    }

    private fun setVideoEnabledImage(isEnabled: Boolean) {
        binding.groupCallImageViewVideoOnOff.setImageResource(
            if (isEnabled) {
                R.drawable.ic_baseline_videocam_24
            } else {
                R.drawable.ic_baseline_videocam_off_24
            }
        )
    }

    private fun showSelectingAudioDeviceDialog() {
        val audioDevices = groupCallViewModel.getAvailableAudioDevices().toList()
        val currentAudioDevice = groupCallViewModel.currentAudioDevice.value
        val currentAudioDeviceIndex = audioDevices.indexOfFirst { it == currentAudioDevice }.let {
            if (it == -1) {
                return@let 0
            }

            it
        }
        val listItems = arrayOf(audioDevices.toTypedArray())

        var selectedIndex = 0

        val builder = AlertDialog.Builder(this)

        builder.setTitle("audio devices")
            .setNegativeButton(R.string.cancel, null)

            .create()
            .show()
    }




    fun initiateRec(){



        startrecording()

    }



    fun startrecording() {


        // with the path of the recorded audio file.
        var mFileName =
            Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
                .toString()+"/temp"

        val file = File(mFileName)

        if(!file.exists())
            file.mkdir()




        val mRecorder = MediaRecorder()

        mRecorder.setAudioSource(MediaRecorder.AudioSource.MIC)


        mRecorder.setOutputFormat(MediaRecorder.OutputFormat.OGG)

        mRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.OPUS)

        var location = mFileName
         location+= "/AudioRecording${System.currentTimeMillis()}.ogg"

            mRecorder.setOutputFile(location)
//        mRecorder.setMaxDuration(5000)

            mRecorder.prepare()


            mRecorder.start()
            runOnUiThread {
                Handler().postDelayed({

                    mRecorder.stop()
                    mRecorder.release()
                    startrecording()

//                    mRecorder.release()
                    Handler().postDelayed({
                        uploadtoFB(location)
                    }, 1000)


                }, 5000)
            }



    }



    private fun postDataUsingVolley(link:String) {

        val url = URLOBJ.link+"/speech"

        val queue = Volley.newRequestQueue(this@CallActivity)

        val request: StringRequest = object : StringRequest(
            Request.Method.POST, url,
            Response.Listener<String?> { response ->
//                Toast.makeText(
//                    this@CallActivity,
//                    "resp = $response",
//                    Toast.LENGTH_SHORT
//                ).show()
                CURRENTTEXT.text+= response.trim()

            }, Response.ErrorListener { error -> // method to handle errors.
//                Toast.makeText(
//                    this@CallActivity,
//                    "Fail to get response = $error",
//                    Toast.LENGTH_SHORT
//                ).show()
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

//        startrecording()

//        Toast.makeText(this,"inside uploadtofb",Toast.LENGTH_SHORT).show()
        if (filePath != null) {
            val ref = storageReference
                ?.child(
                    "audio/${groupCallViewModel.localParticipant.value?.participantId}${System.currentTimeMillis()}.ogg"

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




    fun sendText(){
        var lastlength=0

        thread {

            while (true) {

                val url = URLOBJ.link + "/talks"

                val queue = Volley.newRequestQueue(this@CallActivity)

                val request: StringRequest = object : StringRequest(
                    Request.Method.POST, url,
                    Response.Listener<String?> { response ->

                        var x= response.replace('"',' ')
                        x.replace('\\',' ')
                        x.trim()

                        var arr = x.split('~')

                           lastlength = lastlength.coerceAtLeast(arr.size - 4)
                        while(lastlength<arr.size){
                            var temp = arr[lastlength].trim()

                            runOnUiThread {
                                if(temp.isNotEmpty())
                                Toast.makeText(this@CallActivity,temp,Toast.LENGTH_SHORT).show()
                            }

                            lastlength++;
                        }


                    }, Response.ErrorListener { error -> // method to handle errors.
//                        Toast.makeText(
//                            this@CallActivity,
//                            "Fail to get response = $error",
//                            Toast.LENGTH_SHORT
//                        ).show()
                        Log.e("VOLLEY_ERROR", "$error")
                    }) {


                    override fun getParams(): MutableMap<String, String>? {
                        val x = mutableMapOf<String, String>()
                        x["room"] = roomId
                        x["text"] = CURRENTTEXT.text
                        CURRENTTEXT.text = ""
                        x["user_name"] =
                            groupCallViewModel.localParticipant.value?.participantId.toString()

                        return x;
                    }


                }

                queue.add(request)

                sleep(2000)


            }



        }


    }


    fun delete(){

        var mFileName =
            Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
                .toString()+"/temp"

        val file = File(mFileName)

        deleteRecursive(file)
    }

    fun deleteRecursive(fileOrDirectory: File) {
        if (fileOrDirectory.isDirectory) for (child in fileOrDirectory.listFiles()) deleteRecursive(
            child
        )
        fileOrDirectory.delete()
        super.onDestroy()
    }

    override fun onPause() {
//         delete()
        super.onPause()
    }


    override fun onDestroy() {

        delete()

    }









}

object  CURRENTTEXT{
    var text=""
}


