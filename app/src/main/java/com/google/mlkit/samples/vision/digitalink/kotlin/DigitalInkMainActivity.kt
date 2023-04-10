package com.google.mlkit.samples.vision.digitalink.kotlin

import android.media.AudioManager
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.annotation.VisibleForTesting
import androidx.appcompat.app.AppCompatActivity
import com.google.common.collect.ImmutableMap
import com.google.common.collect.ImmutableSortedSet
import com.google.mlkit.samples.vision.digitalink.R
import com.google.mlkit.vision.digitalink.DigitalInkRecognitionModelIdentifier
import java.lang.Thread.sleep
import java.util.*
import kotlin.concurrent.thread
//import kotlin.coroutines.jvm.internal.CompletedContinuation.context


/** Main activity which creates a StrokeManager and connects it to the DrawingView. */
class DigitalInkMainActivity : AppCompatActivity(), StrokeManager.DownloadedModelsChangedListener {


  var textToSpeech: TextToSpeech? = null

   @VisibleForTesting lateinit var strokeManager1:StrokeManager
  private lateinit var languageAdapter1: ArrayAdapter<ModelLanguageContainer>

  @VisibleForTesting lateinit var strokeManager2:StrokeManager
  private lateinit var languageAdapter2: ArrayAdapter<ModelLanguageContainer>

  @VisibleForTesting lateinit var strokeManager3:StrokeManager
  private lateinit var languageAdapter3: ArrayAdapter<ModelLanguageContainer>

  var time=0;



  public override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_digital_ink_main_kotlin)

    supportActionBar?.hide()

    textToSpeech = TextToSpeech(applicationContext
    ) { i ->
      // if No error is found then only it will run
      if (i != TextToSpeech.ERROR) {
        // To Choose language of speech
        textToSpeech!!.language = Locale.ENGLISH
      }
    }

    strokeManager1  = StrokeManager(textToSpeech)
    strokeManager2  = StrokeManager(textToSpeech)
    strokeManager3  = StrokeManager(textToSpeech)

    val audioManager = this.getSystemService(AUDIO_SERVICE) as AudioManager
    audioManager.isSpeakerphoneOn = true

    val languageSpinner = findViewById<Spinner>(R.id.languages_spinner)
    val drawingView1 = findViewById<DrawingView>(R.id.drawing_view1)
    val drawingView2 = findViewById<DrawingView>(R.id.drawing_view2)
    val drawingView3 = findViewById<DrawingView>(R.id.drawing_view3)

    val statusTextView = findViewById<StatusTextView>(R.id.status_text_view)
    drawingView1.setStrokeManager(strokeManager1)
    drawingView2.setStrokeManager(strokeManager2)
    drawingView3.setStrokeManager(strokeManager3)
//    statusTextView.setStrokeManager(strokeManager)

//    strokeManager1.setStatusChangedListener(statusTextView)
    strokeManager1.setContentChangedListener(drawingView1)
    strokeManager1.setDownloadedModelsChangedListener(this)
    strokeManager1.setClearCurrentInkAfterRecognition(true)
    strokeManager1.setTriggerRecognitionAfterInput(false)
    languageAdapter1 = populateLanguageAdapter()
    languageAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
    languageSpinner.adapter = languageAdapter1
    strokeManager1.refreshDownloadedModelsStatus()





//    strokeManager2.setStatusChangedListener(statusTextView)
//    strokeManager.setContentChangedListener(drawingView1)
    strokeManager2.setContentChangedListener(drawingView2)
//    strokeManager.setContentChangedListener(drawingView3)
    strokeManager2.setDownloadedModelsChangedListener(this)
    strokeManager2.setClearCurrentInkAfterRecognition(true)
    strokeManager2.setTriggerRecognitionAfterInput(false)
    languageAdapter2 = populateLanguageAdapter()
//    languageAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//    languageSpinner.adapter = languageAdapter
    strokeManager2.refreshDownloadedModelsStatus()





//    strokeManager.setStatusChangedListener(statusTextView)
//    strokeManager.setContentChangedListener(drawingView1)
//    strokeManager3.setContentChangedListener(drawingView2)
    strokeManager3.setContentChangedListener(drawingView3)
    strokeManager3.setDownloadedModelsChangedListener(this)
    strokeManager3.setClearCurrentInkAfterRecognition(true)
    strokeManager3.setTriggerRecognitionAfterInput(false)
//    languageAdapter = populateLanguageAdapter()
//    languageAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//    languageSpinner.adapter = languageAdapter
    strokeManager3.refreshDownloadedModelsStatus()




    observe()

   drawingView1.setOnTouchListener { v, event ->
     runOnUiThread {
        time= System.currentTimeMillis().toInt()
     }

     return@setOnTouchListener false
   }

    drawingView2.setOnTouchListener { v, event ->
      runOnUiThread {
        time= System.currentTimeMillis().toInt()
      }

      return@setOnTouchListener false
    }

    drawingView3.setOnTouchListener { v, event ->
      runOnUiThread {
        time= System.currentTimeMillis().toInt()
      }

      return@setOnTouchListener false
    }




    strokeManager1.setActiveModel("en-IN")
    strokeManager2.setActiveModel("en-IN")
    strokeManager3.setActiveModel("en-IN")

    languageSpinner.onItemSelectedListener =
      object : OnItemSelectedListener {
        override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
          val languageCode =
            (parent.adapter.getItem(position) as ModelLanguageContainer).languageTag ?: return
          Log.i(TAG, "Selected language: $languageCode")
          strokeManager1.setActiveModel("en-IN")
        }

        override fun onNothingSelected(parent: AdapterView<*>?) {
          Log.i(TAG, "No language selected")
        }
      }
    strokeManager1.reset()
  }

  fun observe(){
    thread {

      while (true){
      val temp =System.currentTimeMillis()

      if(temp-time>500 && time!=0)
      {
        runOnUiThread { strokeManager1.recognize()
          strokeManager2.recognize()
          strokeManager3.recognize()
          time=0

        }
      }

        sleep(50)

      }
    }
  }

  fun downloadClick(v: View?) {
    strokeManager1.download()
  }

  fun recognizeClick(v: View?) {
    strokeManager1.recognize()
  }

  fun clearClick(v: View?) {
    strokeManager1.reset()
    val drawingView = findViewById<DrawingView>(R.id.drawing_view)
    drawingView.clear()
  }

  fun deleteClick(v: View?) {
    strokeManager1.deleteActiveModel()
  }

  private class ModelLanguageContainer
  private constructor(private val label: String, val languageTag: String?) :
    Comparable<ModelLanguageContainer> {

    var downloaded: Boolean = false

    override fun toString(): String {
      return when {
        languageTag == null -> label
        downloaded -> "   [D] $label"
        else -> "   $label"
      }
    }

    override fun compareTo(other: ModelLanguageContainer): Int {
      return label.compareTo(other.label)
    }

    companion object {
      /** Populates and returns a real model identifier, with label and language tag. */
      fun createModelContainer(label: String, languageTag: String?): ModelLanguageContainer {
        // Offset the actual language labels for better readability
        return ModelLanguageContainer(label, languageTag)
      }

      /** Populates and returns a label only, without a language tag. */
      fun createLabelOnly(label: String): ModelLanguageContainer {
        return ModelLanguageContainer(label, null)
      }
    }
  }

  private fun populateLanguageAdapter(): ArrayAdapter<ModelLanguageContainer> {
    val languageAdapter =
      ArrayAdapter<ModelLanguageContainer>(this, android.R.layout.simple_spinner_item)
    languageAdapter.add(ModelLanguageContainer.createLabelOnly("Select language"))
    languageAdapter.add(ModelLanguageContainer.createLabelOnly("Non-text Models"))

    // Manually add non-text models first
    for (languageTag in NON_TEXT_MODELS.keys) {
      languageAdapter.add(
        ModelLanguageContainer.createModelContainer(NON_TEXT_MODELS[languageTag]!!, languageTag)
      )
    }
    languageAdapter.add(ModelLanguageContainer.createLabelOnly("Text Models"))
    val textModels = ImmutableSortedSet.naturalOrder<ModelLanguageContainer>()
    for (modelIdentifier in DigitalInkRecognitionModelIdentifier.allModelIdentifiers()) {
      if (NON_TEXT_MODELS.containsKey(modelIdentifier.languageTag)) {
        continue
      }
      if (modelIdentifier.languageTag.endsWith(Companion.GESTURE_EXTENSION)) {
        continue
      }
      textModels.add(buildModelContainer(modelIdentifier, "Script"))
    }
    languageAdapter.addAll(textModels.build())
    languageAdapter.add(ModelLanguageContainer.createLabelOnly("Gesture Models"))
    val gestureModels = ImmutableSortedSet.naturalOrder<ModelLanguageContainer>()
    for (modelIdentifier in DigitalInkRecognitionModelIdentifier.allModelIdentifiers()) {
      if (!modelIdentifier.languageTag.endsWith(Companion.GESTURE_EXTENSION)) {
        continue
      }
      gestureModels.add(buildModelContainer(modelIdentifier, "Script gesture classifier"))
    }
    languageAdapter.addAll(gestureModels.build())
    return languageAdapter
  }

  private fun buildModelContainer(
    modelIdentifier: DigitalInkRecognitionModelIdentifier,
    labelSuffix: String,
  ): ModelLanguageContainer {
    val label = StringBuilder()
    label.append(Locale(modelIdentifier.languageSubtag).displayName)
    if (modelIdentifier.regionSubtag != null) {
      label.append(" (").append(modelIdentifier.regionSubtag).append(")")
    }
    if (modelIdentifier.scriptSubtag != null) {
      label.append(", ").append(modelIdentifier.scriptSubtag).append(" ").append(labelSuffix)
    }
    return ModelLanguageContainer.createModelContainer(
      label.toString(),
      modelIdentifier.languageTag
    )
  }

  override fun onDownloadedModelsChanged(downloadedLanguageTags: Set<String>) {
    for (i in 0 until languageAdapter1.count) {
      val container = languageAdapter1.getItem(i)!!
      container.downloaded = downloadedLanguageTags.contains(container.languageTag)
    }
    languageAdapter1.notifyDataSetChanged()
  }

  companion object {
    private const val TAG = "MLKDI.Activity"
    private val NON_TEXT_MODELS =
      ImmutableMap.of(
        "zxx-Zsym-x-autodraw",
        "Autodraw",
        "zxx-Zsye-x-emoji",
        "Emoji",
        "zxx-Zsym-x-shapes",
        "Shapes"
      )
    private const val GESTURE_EXTENSION = "-x-gesture"
  }
}
