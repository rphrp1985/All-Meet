package com.google.mlkit.samples.vision.digitalink.epoxy;

import java.lang.System;

@com.airbnb.epoxy.EpoxyModelClass(layout = com.google.mlkit.samples.vision.digitalink.R.layout.item_users)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\'\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0002R\u00020\u0000H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lcom/google/mlkit/samples/vision/digitalink/epoxy/ParticipantModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lcom/google/mlkit/samples/vision/digitalink/epoxy/ParticipantModel$Holder;", "()V", "height", "", "getHeight", "()I", "setHeight", "(I)V", "participant", "Lcom/sendbird/calls/Participant;", "getParticipant", "()Lcom/sendbird/calls/Participant;", "setParticipant", "(Lcom/sendbird/calls/Participant;)V", "width", "getWidth", "setWidth", "bind", "", "holder", "getDefaultLayout", "Holder", "vision-digital-ink_debug"})
public abstract class ParticipantModel extends com.airbnb.epoxy.EpoxyModelWithHolder<com.google.mlkit.samples.vision.digitalink.epoxy.ParticipantModel.Holder> {
    @com.airbnb.epoxy.EpoxyAttribute
    public com.sendbird.calls.Participant participant;
    @com.airbnb.epoxy.EpoxyAttribute
    private int height = 0;
    @com.airbnb.epoxy.EpoxyAttribute
    private int width = 0;
    
    public ParticipantModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sendbird.calls.Participant getParticipant() {
        return null;
    }
    
    public final void setParticipant(@org.jetbrains.annotations.NotNull
    com.sendbird.calls.Participant p0) {
    }
    
    public final int getHeight() {
        return 0;
    }
    
    public final void setHeight(int p0) {
    }
    
    public final int getWidth() {
        return 0;
    }
    
    public final void setWidth(int p0) {
    }
    
    @java.lang.Override
    public void bind(@org.jetbrains.annotations.NotNull
    com.google.mlkit.samples.vision.digitalink.epoxy.ParticipantModel.Holder holder) {
    }
    
    @java.lang.Override
    protected int getDefaultLayout() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001f"}, d2 = {"Lcom/google/mlkit/samples/vision/digitalink/epoxy/ParticipantModel$Holder;", "Lcom/airbnb/epoxy/EpoxyHolder;", "(Lcom/google/mlkit/samples/vision/digitalink/epoxy/ParticipantModel;)V", "layouts", "Landroid/widget/LinearLayout;", "getLayouts", "()Landroid/widget/LinearLayout;", "setLayouts", "(Landroid/widget/LinearLayout;)V", "profile", "Landroid/widget/ImageView;", "getProfile", "()Landroid/widget/ImageView;", "setProfile", "(Landroid/widget/ImageView;)V", "sendbird", "Lcom/sendbird/calls/SendBirdVideoView;", "getSendbird", "()Lcom/sendbird/calls/SendBirdVideoView;", "setSendbird", "(Lcom/sendbird/calls/SendBirdVideoView;)V", "userid", "Landroid/widget/TextView;", "getUserid", "()Landroid/widget/TextView;", "setUserid", "(Landroid/widget/TextView;)V", "bindView", "", "itemView", "Landroid/view/View;", "vision-digital-ink_debug"})
    public final class Holder extends com.airbnb.epoxy.EpoxyHolder {
        public com.sendbird.calls.SendBirdVideoView sendbird;
        public android.widget.TextView userid;
        public android.widget.ImageView profile;
        public android.widget.LinearLayout layouts;
        
        public Holder() {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.sendbird.calls.SendBirdVideoView getSendbird() {
            return null;
        }
        
        public final void setSendbird(@org.jetbrains.annotations.NotNull
        com.sendbird.calls.SendBirdVideoView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getUserid() {
            return null;
        }
        
        public final void setUserid(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getProfile() {
            return null;
        }
        
        public final void setProfile(@org.jetbrains.annotations.NotNull
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.LinearLayout getLayouts() {
            return null;
        }
        
        public final void setLayouts(@org.jetbrains.annotations.NotNull
        android.widget.LinearLayout p0) {
        }
        
        @java.lang.Override
        protected void bindView(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
        }
    }
}