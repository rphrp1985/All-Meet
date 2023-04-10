package com.google.mlkit.samples.vision.digitalink.kotlin;

import java.lang.System;

/**
 * Main view for rendering content.
 *
 *
 * The view accepts touch inputs, renders them on screen, and passes the content to the
 * StrokeManager. The view is also able to draw content from the StrokeManager.
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013B\u001d\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u0016\u001a\u00020\u0017J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000bH\u0002J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u000bH\u0002J \u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010$\u001a\u00020\u0017H\u0016J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0010H\u0014J(\u0010\'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)H\u0014J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J\u0006\u00101\u001a\u00020\u0017J\u000e\u00102\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/google/mlkit/samples/vision/digitalink/kotlin/DrawingView;", "Landroid/view/View;", "Lcom/google/mlkit/samples/vision/digitalink/kotlin/StrokeManager$ContentChangedListener;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "canvasBitmap", "Landroid/graphics/Bitmap;", "canvasPaint", "Landroid/graphics/Paint;", "currentStroke", "Landroid/graphics/Path;", "currentStrokePaint", "drawCanvas", "Landroid/graphics/Canvas;", "recognizedStrokePaint", "strokeManager", "Lcom/google/mlkit/samples/vision/digitalink/kotlin/StrokeManager;", "textPaint", "Landroid/text/TextPaint;", "clear", "", "drawInk", "ink", "Lcom/google/mlkit/vision/digitalink/Ink;", "paint", "drawStroke", "s", "Lcom/google/mlkit/vision/digitalink/Ink$Stroke;", "drawTextIntoBoundingBox", "text", "", "bb", "Landroid/graphics/Rect;", "onContentChanged", "onDraw", "canvas", "onSizeChanged", "width", "", "height", "oldWidth", "oldHeight", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "redrawContent", "setStrokeManager", "Companion", "vision-digital-ink_debug"})
public final class DrawingView extends android.view.View implements com.google.mlkit.samples.vision.digitalink.kotlin.StrokeManager.ContentChangedListener {
    private final android.graphics.Paint recognizedStrokePaint = null;
    private final android.text.TextPaint textPaint = null;
    private final android.graphics.Paint currentStrokePaint = null;
    private final android.graphics.Paint canvasPaint = null;
    private final android.graphics.Path currentStroke = null;
    private android.graphics.Canvas drawCanvas;
    private android.graphics.Bitmap canvasBitmap;
    private com.google.mlkit.samples.vision.digitalink.kotlin.StrokeManager strokeManager;
    @org.jetbrains.annotations.NotNull()
    public static final com.google.mlkit.samples.vision.digitalink.kotlin.DrawingView.Companion Companion = null;
    private static final java.lang.String TAG = "MLKD.DrawingView";
    private static final int STROKE_WIDTH_DP = 3;
    private static final int MIN_BB_WIDTH = 10;
    private static final int MIN_BB_HEIGHT = 10;
    private static final int MAX_BB_WIDTH = 256;
    private static final int MAX_BB_HEIGHT = 256;
    private java.util.HashMap _$_findViewCache;
    
    @kotlin.jvm.JvmOverloads()
    public DrawingView(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public DrawingView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet) {
        super(null);
    }
    
    public final void setStrokeManager(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.samples.vision.digitalink.kotlin.StrokeManager strokeManager) {
    }
    
    @java.lang.Override()
    protected void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
    }
    
    public final void redrawContent() {
    }
    
    private final void drawTextIntoBoundingBox(java.lang.String text, android.graphics.Rect bb, android.text.TextPaint textPaint) {
    }
    
    private final void drawInk(com.google.mlkit.vision.digitalink.Ink ink, android.graphics.Paint paint) {
    }
    
    private final void drawStroke(com.google.mlkit.vision.digitalink.Ink.Stroke s, android.graphics.Paint paint) {
    }
    
    public final void clear() {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    @java.lang.Override()
    public void onContentChanged() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/google/mlkit/samples/vision/digitalink/kotlin/DrawingView$Companion;", "", "()V", "MAX_BB_HEIGHT", "", "MAX_BB_WIDTH", "MIN_BB_HEIGHT", "MIN_BB_WIDTH", "STROKE_WIDTH_DP", "TAG", "", "computeBoundingBox", "Landroid/graphics/Rect;", "ink", "Lcom/google/mlkit/vision/digitalink/Ink;", "vision-digital-ink_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final android.graphics.Rect computeBoundingBox(com.google.mlkit.vision.digitalink.Ink ink) {
            return null;
        }
    }
}