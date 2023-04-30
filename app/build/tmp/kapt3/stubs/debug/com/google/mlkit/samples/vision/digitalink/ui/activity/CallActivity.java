package com.google.mlkit.samples.vision.digitalink.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\"2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010$\u001a\u00020\"H\u0002J\u0012\u0010%\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0014J\u0010\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u0010H\u0002J\u0010\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020\"2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010.\u001a\u00020\"H\u0002J\u0006\u0010/\u001a\u00020\"J\u0010\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\u0010H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u00062"}, d2 = {"Lcom/google/mlkit/samples/vision/digitalink/ui/activity/CallActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/google/mlkit/samples/vision/digitalink/databinding/ActivityCallBinding;", "getBinding", "()Lcom/google/mlkit/samples/vision/digitalink/databinding/ActivityCallBinding;", "setBinding", "(Lcom/google/mlkit/samples/vision/digitalink/databinding/ActivityCallBinding;)V", "groupCallViewModel", "Lcom/prianshuprasad/webrtc/GroupCallViewModel;", "getGroupCallViewModel", "()Lcom/prianshuprasad/webrtc/GroupCallViewModel;", "setGroupCallViewModel", "(Lcom/prianshuprasad/webrtc/GroupCallViewModel;)V", "roomId", "", "getRoomId", "()Ljava/lang/String;", "setRoomId", "(Ljava/lang/String;)V", "storage", "Lcom/google/firebase/storage/FirebaseStorage;", "getStorage", "()Lcom/google/firebase/storage/FirebaseStorage;", "setStorage", "(Lcom/google/firebase/storage/FirebaseStorage;)V", "storageReference", "Lcom/google/firebase/storage/StorageReference;", "getStorageReference", "()Lcom/google/firebase/storage/StorageReference;", "setStorageReference", "(Lcom/google/firebase/storage/StorageReference;)V", "initRecyclerView", "", "initView", "observeViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "postDataUsingVolley", "url", "setAudioEnabledImage", "isEnabled", "", "setVideoEnabledImage", "showSelectingAudioDeviceDialog", "startrecording", "uploadtoFB", "filePath", "vision-digital-ink_debug"})
public final class CallActivity extends androidx.appcompat.app.AppCompatActivity {
    public com.google.mlkit.samples.vision.digitalink.databinding.ActivityCallBinding binding;
    public com.prianshuprasad.webrtc.GroupCallViewModel groupCallViewModel;
    @org.jetbrains.annotations.NotNull
    private java.lang.String roomId = "";
    @org.jetbrains.annotations.Nullable
    private com.google.firebase.storage.FirebaseStorage storage;
    @org.jetbrains.annotations.Nullable
    private com.google.firebase.storage.StorageReference storageReference;
    private java.util.HashMap _$_findViewCache;
    
    public CallActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.mlkit.samples.vision.digitalink.databinding.ActivityCallBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.google.mlkit.samples.vision.digitalink.databinding.ActivityCallBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.prianshuprasad.webrtc.GroupCallViewModel getGroupCallViewModel() {
        return null;
    }
    
    public final void setGroupCallViewModel(@org.jetbrains.annotations.NotNull
    com.prianshuprasad.webrtc.GroupCallViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRoomId() {
        return null;
    }
    
    public final void setRoomId(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.google.firebase.storage.FirebaseStorage getStorage() {
        return null;
    }
    
    public final void setStorage(@org.jetbrains.annotations.Nullable
    com.google.firebase.storage.FirebaseStorage p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.google.firebase.storage.StorageReference getStorageReference() {
        return null;
    }
    
    public final void setStorageReference(@org.jetbrains.annotations.Nullable
    com.google.firebase.storage.StorageReference p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView(java.lang.String roomId) {
    }
    
    private final void initRecyclerView() {
    }
    
    private final void observeViewModel() {
    }
    
    private final void setAudioEnabledImage(boolean isEnabled) {
    }
    
    private final void setVideoEnabledImage(boolean isEnabled) {
    }
    
    private final void showSelectingAudioDeviceDialog() {
    }
    
    public final void startrecording() {
    }
    
    private final void postDataUsingVolley(java.lang.String url) {
    }
    
    private final void uploadtoFB(java.lang.String filePath) {
    }
}