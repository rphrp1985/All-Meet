package com.google.mlkit.samples.vision.digitalink.kotlin;

import java.lang.System;

/**
 * Class to manage model downloading, deletion, and selection.
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0004J\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004J\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004J\u000e\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001c"}, d2 = {"Lcom/google/mlkit/samples/vision/digitalink/kotlin/ModelManager;", "", "()V", "downloadedModelLanguages", "Lcom/google/android/gms/tasks/Task;", "", "", "getDownloadedModelLanguages", "()Lcom/google/android/gms/tasks/Task;", "model", "Lcom/google/mlkit/vision/digitalink/DigitalInkRecognitionModel;", "recognizer", "Lcom/google/mlkit/vision/digitalink/DigitalInkRecognizer;", "getRecognizer", "()Lcom/google/mlkit/vision/digitalink/DigitalInkRecognizer;", "setRecognizer", "(Lcom/google/mlkit/vision/digitalink/DigitalInkRecognizer;)V", "remoteModelManager", "Lcom/google/mlkit/common/model/RemoteModelManager;", "getRemoteModelManager", "()Lcom/google/mlkit/common/model/RemoteModelManager;", "checkIsModelDownloaded", "", "deleteActiveModel", "download", "setModel", "languageTag", "Companion", "vision-digital-ink_debug"})
public final class ModelManager {
    private com.google.mlkit.vision.digitalink.DigitalInkRecognitionModel model;
    @org.jetbrains.annotations.Nullable
    private com.google.mlkit.vision.digitalink.DigitalInkRecognizer recognizer;
    @org.jetbrains.annotations.NotNull
    private final com.google.mlkit.common.model.RemoteModelManager remoteModelManager = null;
    @org.jetbrains.annotations.NotNull
    public static final com.google.mlkit.samples.vision.digitalink.kotlin.ModelManager.Companion Companion = null;
    private static final java.lang.String TAG = "MLKD.ModelManager";
    
    public ModelManager() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.google.mlkit.vision.digitalink.DigitalInkRecognizer getRecognizer() {
        return null;
    }
    
    public final void setRecognizer(@org.jetbrains.annotations.Nullable
    com.google.mlkit.vision.digitalink.DigitalInkRecognizer p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.mlkit.common.model.RemoteModelManager getRemoteModelManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String setModel(@org.jetbrains.annotations.NotNull
    java.lang.String languageTag) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> checkIsModelDownloaded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.gms.tasks.Task<java.lang.String> deleteActiveModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.gms.tasks.Task<java.util.Set<java.lang.String>> getDownloadedModelLanguages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.gms.tasks.Task<java.lang.String> download() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/google/mlkit/samples/vision/digitalink/kotlin/ModelManager$Companion;", "", "()V", "TAG", "", "vision-digital-ink_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}