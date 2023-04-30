package com.google.mlkit.samples.vision.digitalink.ui.activity



//import androidx.databinding.DataBindingUtil
//import com.google.mlkit.samples.vision.digitalink.databinding.ActivityCallBinding
//import com.prianshuprasad.webrtc.R
//import com.prianshuprasad.webrtc.databinding.ActivityCallBinding

//import kotlinx.coroutines.DefaultExecutor.thread

import android.content.res.Resources
import android.media.MediaRecorder
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
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
import com.prianshuprasad.webrtc.GroupCallViewModel
//import com.sendbird.android.shadow.okhttp3.MultipartBody
import com.sendbird.calls.Participant
import com.sendbird.calls.SendBirdCall
import okhttp3.Call
import okhttp3.Callback
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.ResponseBody
import org.json.JSONObject
import retrofit2.Retrofit
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import java.io.BufferedInputStream
import java.io.File
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.IOException
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
        startrecording()

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
                Toast.makeText(this@CallActivity, "${i.toString()}", Toast.LENGTH_SHORT).show()
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

    fun startrecording() {

        thread {
            // with the path of the recorded audio file.
            // with the path of the recorded audio file.
            var mFileName =
                Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
                    .toString()
            mFileName += "/AudioRecording.ogg"


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



    private fun postDataUsingVolley(url:String) {

        val url = "http://172.17.0.194:5000"

        val queue = Volley.newRequestQueue(this@CallActivity)

        val request: StringRequest = object : StringRequest(
            Request.Method.POST, url,
            Response.Listener<String?> { response ->
                Toast.makeText(
                    this@CallActivity,
                    "resp = $response",
                    Toast.LENGTH_SHORT
                ).show()

            }, Response.ErrorListener { error -> // method to handle errors.
                Toast.makeText(
                    this@CallActivity,
                    "Fail to get response = $error",
                    Toast.LENGTH_SHORT
                ).show()
                Log.e("VOLLEY_ERROR", "$error")
            }) {


            override fun getParams(): MutableMap<String, String>? {
                val x = mutableMapOf<String, String>()
                x["file"] = url
                return x;
            }


        }

        queue.add(request)
    }


    private fun uploadtoFB(filePath: String) {

        startrecording()
        if (filePath != null) {
            val ref = storageReference
                ?.child(
                    "audio/${groupCallViewModel.localParticipant.value?.participantId}"

                )

            Log.d("Camera ", " image uploaded to $ref")
            // adding listeners on upload
            // or failure of image
            ref?.putFile(filePath.toUri()!!)
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
                        Log.d("Camera ", " image uploaded to $it")
                        postDataUsingVolley(it.toString())

                        // Got the download URL for 'users/me/profile.png'
                    }.addOnFailureListener {

                        // Handle any errors
                    }


                }
        }

    }


}









internal interface Service {
    @Multipart
    @POST("/")
    fun postaudio(
        @Part image: MultipartBody.Part?,
        @Part("name") name: RequestBody?,
    ): retrofit2.Call<ResponseBody>
}