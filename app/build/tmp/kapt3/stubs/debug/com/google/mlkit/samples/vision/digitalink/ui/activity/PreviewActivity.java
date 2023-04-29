package com.google.mlkit.samples.vision.digitalink.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\b\u0010\u0019\u001a\u00020\u0013H\u0002J\u0012\u0010\u001a\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J+\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010%\u001a\u00020&H\u0016\u00a2\u0006\u0002\u0010\'J\b\u0010(\u001a\u00020\u0013H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/google/mlkit/samples/vision/digitalink/ui/activity/PreviewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "REQUEST_ID_MULTIPLE_PERMISSIONS", "", "getREQUEST_ID_MULTIPLE_PERMISSIONS", "()I", "binding", "Lcom/google/mlkit/samples/vision/digitalink/databinding/ActivityPreviewBinding;", "cameraProviderFuture", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "preview", "Landroidx/camera/core/Preview;", "previewView", "Landroidx/camera/view/PreviewView;", "viewModel", "Lcom/prianshuprasad/webrtc/ui/viewmodel/PreviewViewModel;", "bindPreview", "", "cameraProvider", "checkAndRequestPermissions", "", "goToRoomActivity", "initCameraPreview", "observeViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onEnterButtonClicked", "v", "Landroid/view/View;", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "setViewEventListeners", "vision-digital-ink_debug"})
public final class PreviewActivity extends androidx.appcompat.app.AppCompatActivity {
    private final com.prianshuprasad.webrtc.ui.viewmodel.PreviewViewModel viewModel = null;
    private com.google.mlkit.samples.vision.digitalink.databinding.ActivityPreviewBinding binding;
    private com.google.common.util.concurrent.ListenableFuture<androidx.camera.lifecycle.ProcessCameraProvider> cameraProviderFuture;
    private androidx.camera.view.PreviewView previewView;
    private androidx.camera.core.Preview preview;
    private final int REQUEST_ID_MULTIPLE_PERMISSIONS = 10;
    private java.util.HashMap _$_findViewCache;
    
    public PreviewActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initCameraPreview() {
    }
    
    private final void setViewEventListeners() {
    }
    
    private final void observeViewModel() {
    }
    
    private final void onEnterButtonClicked(android.view.View v) {
    }
    
    private final void bindPreview(androidx.camera.lifecycle.ProcessCameraProvider cameraProvider) {
    }
    
    private final void goToRoomActivity() {
    }
    
    public final int getREQUEST_ID_MULTIPLE_PERMISSIONS() {
        return 0;
    }
    
    private final boolean checkAndRequestPermissions() {
        return false;
    }
    
    @java.lang.Override
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
}