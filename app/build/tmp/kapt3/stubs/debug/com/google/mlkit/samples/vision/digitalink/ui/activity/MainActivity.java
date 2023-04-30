package com.google.mlkit.samples.vision.digitalink.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0014J\u0006\u0010\u001d\u001a\u00020\u001aJ\u0012\u0010\u001e\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\u0006\u0010!\u001a\u00020\u001aJ\u000e\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0014X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016\u00a8\u0006#"}, d2 = {"Lcom/google/mlkit/samples/vision/digitalink/ui/activity/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "dashboardFragment", "Lcom/prianshuprasad/webrtc/ui/fragmnet/DashboardFragment;", "mainActivityViewModel", "Lcom/prianshuprasad/webrtc/ui/viewmodel/MainActivityViewModel;", "storage", "Lcom/google/firebase/storage/FirebaseStorage;", "getStorage", "()Lcom/google/firebase/storage/FirebaseStorage;", "setStorage", "(Lcom/google/firebase/storage/FirebaseStorage;)V", "storageReference", "Lcom/google/firebase/storage/StorageReference;", "getStorageReference", "()Lcom/google/firebase/storage/StorageReference;", "setStorageReference", "(Lcom/google/firebase/storage/StorageReference;)V", "token", "", "getToken", "()Ljava/lang/String;", "userId", "getUserId", "createAndEnterRoom", "", "fetchRoomById", "roomId", "observe", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openDashBoard", "openPreview", "vision-digital-ink_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private final com.prianshuprasad.webrtc.ui.fragmnet.DashboardFragment dashboardFragment = null;
    private final com.prianshuprasad.webrtc.ui.viewmodel.MainActivityViewModel mainActivityViewModel = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String userId = "jj";
    @org.jetbrains.annotations.NotNull
    private final java.lang.String token = "536c698a1390e4d39970875d834f2faf1d3a811a";
    @org.jetbrains.annotations.Nullable
    private com.google.firebase.storage.FirebaseStorage storage;
    @org.jetbrains.annotations.Nullable
    private com.google.firebase.storage.StorageReference storageReference;
    private java.util.HashMap _$_findViewCache;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getToken() {
        return null;
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
    
    public final void createAndEnterRoom() {
    }
    
    public final void fetchRoomById(@org.jetbrains.annotations.NotNull
    java.lang.String roomId) {
    }
    
    public final void openDashBoard() {
    }
    
    public final void observe() {
    }
    
    public final void openPreview(@org.jetbrains.annotations.NotNull
    java.lang.String roomId) {
    }
}