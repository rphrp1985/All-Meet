package com.google.mlkit.samples.vision.digitalink.kotlin;

import java.lang.System;

/**
 * Task to run asynchronously to obtain recognition results.
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000b\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/google/mlkit/samples/vision/digitalink/kotlin/RecognitionTask;", "", "recognizer", "Lcom/google/mlkit/vision/digitalink/DigitalInkRecognizer;", "ink", "Lcom/google/mlkit/vision/digitalink/Ink;", "(Lcom/google/mlkit/vision/digitalink/DigitalInkRecognizer;Lcom/google/mlkit/vision/digitalink/Ink;)V", "cancelled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "currentResult", "Lcom/google/mlkit/samples/vision/digitalink/kotlin/RecognitionTask$RecognizedInk;", "done", "cancel", "", "", "result", "run", "Lcom/google/android/gms/tasks/Task;", "", "Companion", "RecognizedInk", "vision-digital-ink_debug"})
public final class RecognitionTask {
    private final com.google.mlkit.vision.digitalink.DigitalInkRecognizer recognizer = null;
    private final com.google.mlkit.vision.digitalink.Ink ink = null;
    private com.google.mlkit.samples.vision.digitalink.kotlin.RecognitionTask.RecognizedInk currentResult;
    private final java.util.concurrent.atomic.AtomicBoolean cancelled = null;
    private final java.util.concurrent.atomic.AtomicBoolean done = null;
    @org.jetbrains.annotations.NotNull
    public static final com.google.mlkit.samples.vision.digitalink.kotlin.RecognitionTask.Companion Companion = null;
    private static final java.lang.String TAG = "MLKD.RecognitionTask";
    
    public RecognitionTask(@org.jetbrains.annotations.Nullable
    com.google.mlkit.vision.digitalink.DigitalInkRecognizer recognizer, @org.jetbrains.annotations.NotNull
    com.google.mlkit.vision.digitalink.Ink ink) {
        super();
    }
    
    public final void cancel() {
    }
    
    public final boolean done() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.google.mlkit.samples.vision.digitalink.kotlin.RecognitionTask.RecognizedInk result() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.gms.tasks.Task<java.lang.String> run() {
        return null;
    }
    
    /**
     * Helper class that stores an ink along with the corresponding recognized text.
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/google/mlkit/samples/vision/digitalink/kotlin/RecognitionTask$RecognizedInk;", "", "ink", "Lcom/google/mlkit/vision/digitalink/Ink;", "text", "", "(Lcom/google/mlkit/vision/digitalink/Ink;Ljava/lang/String;)V", "getInk", "()Lcom/google/mlkit/vision/digitalink/Ink;", "getText", "()Ljava/lang/String;", "vision-digital-ink_debug"})
    public static final class RecognizedInk {
        @org.jetbrains.annotations.NotNull
        private final com.google.mlkit.vision.digitalink.Ink ink = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String text = null;
        
        public RecognizedInk(@org.jetbrains.annotations.NotNull
        com.google.mlkit.vision.digitalink.Ink ink, @org.jetbrains.annotations.Nullable
        java.lang.String text) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.google.mlkit.vision.digitalink.Ink getInk() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getText() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/google/mlkit/samples/vision/digitalink/kotlin/RecognitionTask$Companion;", "", "()V", "TAG", "", "vision-digital-ink_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}