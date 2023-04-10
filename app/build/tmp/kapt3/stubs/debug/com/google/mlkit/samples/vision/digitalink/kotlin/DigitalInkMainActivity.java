package com.google.mlkit.samples.vision.digitalink.kotlin;

import java.lang.System;

/**
 * Main activity which creates a StrokeManager and connects it to the DrawingView.
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\u0018\u0000 82\u00020\u00012\u00020\u0002:\u000289B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,J\u0010\u0010-\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,J\u0010\u0010.\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,J\u0006\u0010/\u001a\u00020*J\u0012\u00100\u001a\u00020*2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0016\u00103\u001a\u00020*2\f\u00104\u001a\b\u0012\u0004\u0012\u00020(05H\u0016J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0010\u00107\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR$\u0010\u0014\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a8\u0006:"}, d2 = {"Lcom/google/mlkit/samples/vision/digitalink/kotlin/DigitalInkMainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/google/mlkit/samples/vision/digitalink/kotlin/StrokeManager$DownloadedModelsChangedListener;", "()V", "languageAdapter1", "Landroid/widget/ArrayAdapter;", "Lcom/google/mlkit/samples/vision/digitalink/kotlin/DigitalInkMainActivity$ModelLanguageContainer;", "languageAdapter2", "languageAdapter3", "strokeManager1", "Lcom/google/mlkit/samples/vision/digitalink/kotlin/StrokeManager;", "getStrokeManager1$annotations", "getStrokeManager1", "()Lcom/google/mlkit/samples/vision/digitalink/kotlin/StrokeManager;", "setStrokeManager1", "(Lcom/google/mlkit/samples/vision/digitalink/kotlin/StrokeManager;)V", "strokeManager2", "getStrokeManager2$annotations", "getStrokeManager2", "setStrokeManager2", "strokeManager3", "getStrokeManager3$annotations", "getStrokeManager3", "setStrokeManager3", "textToSpeech", "Landroid/speech/tts/TextToSpeech;", "getTextToSpeech", "()Landroid/speech/tts/TextToSpeech;", "setTextToSpeech", "(Landroid/speech/tts/TextToSpeech;)V", "time", "", "getTime", "()I", "setTime", "(I)V", "buildModelContainer", "modelIdentifier", "Lcom/google/mlkit/vision/digitalink/DigitalInkRecognitionModelIdentifier;", "labelSuffix", "", "clearClick", "", "v", "Landroid/view/View;", "deleteClick", "downloadClick", "observe", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDownloadedModelsChanged", "downloadedLanguageTags", "", "populateLanguageAdapter", "recognizeClick", "Companion", "ModelLanguageContainer", "vision-digital-ink_debug"})
public final class DigitalInkMainActivity extends androidx.appcompat.app.AppCompatActivity implements com.google.mlkit.samples.vision.digitalink.kotlin.StrokeManager.DownloadedModelsChangedListener {
    @org.jetbrains.annotations.Nullable()
    private android.speech.tts.TextToSpeech textToSpeech;
    public com.google.mlkit.samples.vision.digitalink.kotlin.StrokeManager strokeManager1;
    private android.widget.ArrayAdapter<com.google.mlkit.samples.vision.digitalink.kotlin.DigitalInkMainActivity.ModelLanguageContainer> languageAdapter1;
    public com.google.mlkit.samples.vision.digitalink.kotlin.StrokeManager strokeManager2;
    private android.widget.ArrayAdapter<com.google.mlkit.samples.vision.digitalink.kotlin.DigitalInkMainActivity.ModelLanguageContainer> languageAdapter2;
    public com.google.mlkit.samples.vision.digitalink.kotlin.StrokeManager strokeManager3;
    private android.widget.ArrayAdapter<com.google.mlkit.samples.vision.digitalink.kotlin.DigitalInkMainActivity.ModelLanguageContainer> languageAdapter3;
    private int time = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.google.mlkit.samples.vision.digitalink.kotlin.DigitalInkMainActivity.Companion Companion = null;
    private static final java.lang.String TAG = "MLKDI.Activity";
    private static final com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> NON_TEXT_MODELS = null;
    private static final java.lang.String GESTURE_EXTENSION = "-x-gesture";
    private java.util.HashMap _$_findViewCache;
    
    public DigitalInkMainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.speech.tts.TextToSpeech getTextToSpeech() {
        return null;
    }
    
    public final void setTextToSpeech(@org.jetbrains.annotations.Nullable()
    android.speech.tts.TextToSpeech p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.mlkit.samples.vision.digitalink.kotlin.StrokeManager getStrokeManager1() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getStrokeManager1$annotations() {
    }
    
    public final void setStrokeManager1(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.samples.vision.digitalink.kotlin.StrokeManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.mlkit.samples.vision.digitalink.kotlin.StrokeManager getStrokeManager2() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getStrokeManager2$annotations() {
    }
    
    public final void setStrokeManager2(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.samples.vision.digitalink.kotlin.StrokeManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.mlkit.samples.vision.digitalink.kotlin.StrokeManager getStrokeManager3() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getStrokeManager3$annotations() {
    }
    
    public final void setStrokeManager3(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.samples.vision.digitalink.kotlin.StrokeManager p0) {
    }
    
    public final int getTime() {
        return 0;
    }
    
    public final void setTime(int p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void observe() {
    }
    
    public final void downloadClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    public final void recognizeClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    public final void clearClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    public final void deleteClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final android.widget.ArrayAdapter<com.google.mlkit.samples.vision.digitalink.kotlin.DigitalInkMainActivity.ModelLanguageContainer> populateLanguageAdapter() {
        return null;
    }
    
    private final com.google.mlkit.samples.vision.digitalink.kotlin.DigitalInkMainActivity.ModelLanguageContainer buildModelContainer(com.google.mlkit.vision.digitalink.DigitalInkRecognitionModelIdentifier modelIdentifier, java.lang.String labelSuffix) {
        return null;
    }
    
    @java.lang.Override()
    public void onDownloadedModelsChanged(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> downloadedLanguageTags) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u0011\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0013"}, d2 = {"Lcom/google/mlkit/samples/vision/digitalink/kotlin/DigitalInkMainActivity$ModelLanguageContainer;", "", "label", "", "languageTag", "(Ljava/lang/String;Ljava/lang/String;)V", "downloaded", "", "getDownloaded", "()Z", "setDownloaded", "(Z)V", "getLanguageTag", "()Ljava/lang/String;", "compareTo", "", "other", "toString", "Companion", "vision-digital-ink_debug"})
    static final class ModelLanguageContainer implements java.lang.Comparable<com.google.mlkit.samples.vision.digitalink.kotlin.DigitalInkMainActivity.ModelLanguageContainer> {
        private final java.lang.String label = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String languageTag = null;
        private boolean downloaded = false;
        @org.jetbrains.annotations.NotNull()
        public static final com.google.mlkit.samples.vision.digitalink.kotlin.DigitalInkMainActivity.ModelLanguageContainer.Companion Companion = null;
        
        private ModelLanguageContainer(java.lang.String label, java.lang.String languageTag) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLanguageTag() {
            return null;
        }
        
        public final boolean getDownloaded() {
            return false;
        }
        
        public final void setDownloaded(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int compareTo(@org.jetbrains.annotations.NotNull()
        com.google.mlkit.samples.vision.digitalink.kotlin.DigitalInkMainActivity.ModelLanguageContainer other) {
            return 0;
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/google/mlkit/samples/vision/digitalink/kotlin/DigitalInkMainActivity$ModelLanguageContainer$Companion;", "", "()V", "createLabelOnly", "Lcom/google/mlkit/samples/vision/digitalink/kotlin/DigitalInkMainActivity$ModelLanguageContainer;", "label", "", "createModelContainer", "languageTag", "vision-digital-ink_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            /**
             * Populates and returns a real model identifier, with label and language tag.
             */
            @org.jetbrains.annotations.NotNull()
            public final com.google.mlkit.samples.vision.digitalink.kotlin.DigitalInkMainActivity.ModelLanguageContainer createModelContainer(@org.jetbrains.annotations.NotNull()
            java.lang.String label, @org.jetbrains.annotations.Nullable()
            java.lang.String languageTag) {
                return null;
            }
            
            /**
             * Populates and returns a label only, without a language tag.
             */
            @org.jetbrains.annotations.NotNull()
            public final com.google.mlkit.samples.vision.digitalink.kotlin.DigitalInkMainActivity.ModelLanguageContainer createLabelOnly(@org.jetbrains.annotations.NotNull()
            java.lang.String label) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000RN\u0010\u0005\u001aB\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00040\u0004 \u0007* \u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/google/mlkit/samples/vision/digitalink/kotlin/DigitalInkMainActivity$Companion;", "", "()V", "GESTURE_EXTENSION", "", "NON_TEXT_MODELS", "Lcom/google/common/collect/ImmutableMap;", "kotlin.jvm.PlatformType", "TAG", "vision-digital-ink_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}