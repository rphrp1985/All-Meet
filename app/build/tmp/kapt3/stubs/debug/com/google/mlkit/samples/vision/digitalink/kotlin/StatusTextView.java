package com.google.mlkit.samples.vision.digitalink.kotlin;

import java.lang.System;

/**
 * Status bar for the test app.
 *
 *
 * It is updated upon status changes announced by the StrokeManager.
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/google/mlkit/samples/vision/digitalink/kotlin/StatusTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lcom/google/mlkit/samples/vision/digitalink/kotlin/StrokeManager$StatusChangedListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "strokeManager", "Lcom/google/mlkit/samples/vision/digitalink/kotlin/StrokeManager;", "onStatusChanged", "", "setStrokeManager", "vision-digital-ink_debug"})
public final class StatusTextView extends androidx.appcompat.widget.AppCompatTextView implements com.google.mlkit.samples.vision.digitalink.kotlin.StrokeManager.StatusChangedListener {
    private com.google.mlkit.samples.vision.digitalink.kotlin.StrokeManager strokeManager;
    private java.util.HashMap _$_findViewCache;
    
    public StatusTextView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    public StatusTextView(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attributeSet) {
        super(null);
    }
    
    @java.lang.Override
    public void onStatusChanged() {
    }
    
    public final void setStrokeManager(@org.jetbrains.annotations.Nullable
    com.google.mlkit.samples.vision.digitalink.kotlin.StrokeManager strokeManager) {
    }
}