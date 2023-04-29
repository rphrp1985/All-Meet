package com.google.mlkit.samples.vision.digitalink.kotlin;

import java.lang.System;

/**
 * Manages the recognition logic and the content that has been added to the current page.
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0012\u0018\u0000 I2\u00020\u0001:\u0004IJKLB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u000203J\b\u00104\u001a\u000205H\u0002J\u000e\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010807J\u000e\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010807J\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\t0;J\u000e\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c07J\u0006\u0010=\u001a\u000205J\u0006\u0010>\u001a\u000205J\b\u0010?\u001a\u000205H\u0002J\u000e\u0010@\u001a\u0002052\u0006\u0010A\u001a\u00020\u001cJ\u000e\u0010B\u001a\u0002052\u0006\u0010C\u001a\u00020\u0006J\u0010\u0010D\u001a\u0002052\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010E\u001a\u0002052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010F\u001a\u0002052\b\u0010\"\u001a\u0004\u0018\u00010#J\u000e\u0010G\u001a\u0002052\u0006\u0010H\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u000e\u0010(\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u00020,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100\u00a8\u0006M"}, d2 = {"Lcom/google/mlkit/samples/vision/digitalink/kotlin/StrokeManager;", "", "textToSpeech", "Landroid/speech/tts/TextToSpeech;", "(Landroid/speech/tts/TextToSpeech;)V", "clearCurrentInkAfterRecognition", "", "content", "", "Lcom/google/mlkit/samples/vision/digitalink/kotlin/RecognitionTask$RecognizedInk;", "contentChangedListener", "Lcom/google/mlkit/samples/vision/digitalink/kotlin/StrokeManager$ContentChangedListener;", "currentInk", "Lcom/google/mlkit/vision/digitalink/Ink;", "getCurrentInk", "()Lcom/google/mlkit/vision/digitalink/Ink;", "downloadedModelsChangedListener", "Lcom/google/mlkit/samples/vision/digitalink/kotlin/StrokeManager$DownloadedModelsChangedListener;", "inkBuilder", "Lcom/google/mlkit/vision/digitalink/Ink$Builder;", "modelManager", "Lcom/google/mlkit/samples/vision/digitalink/kotlin/ModelManager;", "getModelManager$annotations", "()V", "recognitionTask", "Lcom/google/mlkit/samples/vision/digitalink/kotlin/RecognitionTask;", "stateChangedSinceLastRequest", "newStatus", "", "status", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "statusChangedListener", "Lcom/google/mlkit/samples/vision/digitalink/kotlin/StrokeManager$StatusChangedListener;", "strokeBuilder", "Lcom/google/mlkit/vision/digitalink/Ink$Stroke$Builder;", "getTextToSpeech", "()Landroid/speech/tts/TextToSpeech;", "triggerRecognitionAfterInput", "uiHandler", "Landroid/os/Handler;", "y", "", "getY", "()I", "setY", "(I)V", "addNewTouchEvent", "event", "Landroid/view/MotionEvent;", "commitResult", "", "deleteActiveModel", "Lcom/google/android/gms/tasks/Task;", "", "download", "getContent", "", "recognize", "refreshDownloadedModelsStatus", "reset", "resetCurrentInk", "setActiveModel", "languageTag", "setClearCurrentInkAfterRecognition", "shouldClear", "setContentChangedListener", "setDownloadedModelsChangedListener", "setStatusChangedListener", "setTriggerRecognitionAfterInput", "shouldTrigger", "Companion", "ContentChangedListener", "DownloadedModelsChangedListener", "StatusChangedListener", "vision-digital-ink_debug"})
public final class StrokeManager {
    @org.jetbrains.annotations.Nullable
    private final android.speech.tts.TextToSpeech textToSpeech = null;
    private com.google.mlkit.samples.vision.digitalink.kotlin.RecognitionTask recognitionTask;
    private int y = 0;
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmField
    public com.google.mlkit.samples.vision.digitalink.kotlin.ModelManager modelManager;
    private final java.util.List<com.google.mlkit.samples.vision.digitalink.kotlin.RecognitionTask.RecognizedInk> content = null;
    private com.google.mlkit.vision.digitalink.Ink.Stroke.Builder strokeBuilder;
    private com.google.mlkit.vision.digitalink.Ink.Builder inkBuilder;
    private boolean stateChangedSinceLastRequest = false;
    private com.google.mlkit.samples.vision.digitalink.kotlin.StrokeManager.ContentChangedListener contentChangedListener;
    private com.google.mlkit.samples.vision.digitalink.kotlin.StrokeManager.StatusChangedListener statusChangedListener;
    private com.google.mlkit.samples.vision.digitalink.kotlin.StrokeManager.DownloadedModelsChangedListener downloadedModelsChangedListener;
    private boolean triggerRecognitionAfterInput = true;
    private boolean clearCurrentInkAfterRecognition = true;
    @org.jetbrains.annotations.Nullable
    private java.lang.String status = "";
    private final android.os.Handler uiHandler = null;
    @org.jetbrains.annotations.NotNull
    public static final com.google.mlkit.samples.vision.digitalink.kotlin.StrokeManager.Companion Companion = null;
    @kotlin.jvm.JvmField
    public static final long CONVERSION_TIMEOUT_MS = 1000L;
    private static final java.lang.String TAG = "MLKD.StrokeManager";
    private static final int TIMEOUT_TRIGGER = 1;
    
    public StrokeManager(@org.jetbrains.annotations.Nullable
    android.speech.tts.TextToSpeech textToSpeech) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.speech.tts.TextToSpeech getTextToSpeech() {
        return null;
    }
    
    public final int getY() {
        return 0;
    }
    
    public final void setY(int p0) {
    }
    
    @androidx.annotation.VisibleForTesting
    @java.lang.Deprecated
    public static void getModelManager$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStatus() {
        return null;
    }
    
    private final void setStatus(java.lang.String newStatus) {
    }
    
    public final void setTriggerRecognitionAfterInput(boolean shouldTrigger) {
    }
    
    public final void setClearCurrentInkAfterRecognition(boolean shouldClear) {
    }
    
    private final void commitResult() {
    }
    
    public final void reset() {
    }
    
    private final void resetCurrentInk() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.mlkit.vision.digitalink.Ink getCurrentInk() {
        return null;
    }
    
    /**
     * This method is called when a new touch event happens on the drawing client and notifies the
     * StrokeManager of new content being added.
     *
     *
     * This method takes care of triggering the UI timeout and scheduling recognitions on the
     * background thread.
     *
     * @return whether the touch event was handled.
     */
    public final boolean addNewTouchEvent(@org.jetbrains.annotations.NotNull
    android.view.MotionEvent event) {
        return false;
    }
    
    public final void setContentChangedListener(@org.jetbrains.annotations.Nullable
    com.google.mlkit.samples.vision.digitalink.kotlin.StrokeManager.ContentChangedListener contentChangedListener) {
    }
    
    public final void setStatusChangedListener(@org.jetbrains.annotations.Nullable
    com.google.mlkit.samples.vision.digitalink.kotlin.StrokeManager.StatusChangedListener statusChangedListener) {
    }
    
    public final void setDownloadedModelsChangedListener(@org.jetbrains.annotations.Nullable
    com.google.mlkit.samples.vision.digitalink.kotlin.StrokeManager.DownloadedModelsChangedListener downloadedModelsChangedListener) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.google.mlkit.samples.vision.digitalink.kotlin.RecognitionTask.RecognizedInk> getContent() {
        return null;
    }
    
    public final void setActiveModel(@org.jetbrains.annotations.NotNull
    java.lang.String languageTag) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.gms.tasks.Task deleteActiveModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.gms.tasks.Task download() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.gms.tasks.Task<java.lang.String> recognize() {
        return null;
    }
    
    public final void refreshDownloadedModelsStatus() {
    }
    
    /**
     * Interface to register to be notified of changes in the recognized content.
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/google/mlkit/samples/vision/digitalink/kotlin/StrokeManager$ContentChangedListener;", "", "onContentChanged", "", "vision-digital-ink_debug"})
    public static abstract interface ContentChangedListener {
        
        /**
         * This method is called when the recognized content changes.
         */
        public abstract void onContentChanged();
    }
    
    /**
     * Interface to register to be notified of changes in the status.
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/google/mlkit/samples/vision/digitalink/kotlin/StrokeManager$StatusChangedListener;", "", "onStatusChanged", "", "vision-digital-ink_debug"})
    public static abstract interface StatusChangedListener {
        
        /**
         * This method is called when the recognized content changes.
         */
        public abstract void onStatusChanged();
    }
    
    /**
     * Interface to register to be notified of changes in the downloaded model state.
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/google/mlkit/samples/vision/digitalink/kotlin/StrokeManager$DownloadedModelsChangedListener;", "", "onDownloadedModelsChanged", "", "downloadedLanguageTags", "", "", "vision-digital-ink_debug"})
    public static abstract interface DownloadedModelsChangedListener {
        
        /**
         * This method is called when the downloaded models changes.
         */
        public abstract void onDownloadedModelsChanged(@org.jetbrains.annotations.NotNull
        java.util.Set<java.lang.String> downloadedLanguageTags);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/google/mlkit/samples/vision/digitalink/kotlin/StrokeManager$Companion;", "", "()V", "CONVERSION_TIMEOUT_MS", "", "getCONVERSION_TIMEOUT_MS$annotations", "TAG", "", "TIMEOUT_TRIGGER", "", "vision-digital-ink_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @androidx.annotation.VisibleForTesting
        @java.lang.Deprecated
        public static void getCONVERSION_TIMEOUT_MS$annotations() {
        }
    }
}