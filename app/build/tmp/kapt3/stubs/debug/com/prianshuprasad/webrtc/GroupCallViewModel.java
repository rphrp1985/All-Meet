package com.prianshuprasad.webrtc;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\n\u0018\u0000 %2\u00020\u0001:\u0002%&B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001a\u001a\u00020\u001bJ\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u001dJ\u0006\u0010\u001e\u001a\u00020\u001bJ\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u0007J\u0006\u0010!\u001a\u00020\u001bJ\u0006\u0010\"\u001a\u00020\u001bJ\u0006\u0010#\u001a\u00020\u001bJ\u0006\u0010$\u001a\u00020\u001bR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006\'"}, d2 = {"Lcom/prianshuprasad/webrtc/GroupCallViewModel;", "Landroidx/lifecycle/ViewModel;", "roomId", "", "(Ljava/lang/String;)V", "_currentAudioDevice", "Landroidx/lifecycle/MutableLiveData;", "Lcom/sendbird/calls/AudioDevice;", "_localParticipant", "Lcom/sendbird/calls/LocalParticipant;", "_participants", "", "Lcom/sendbird/calls/Participant;", "currentAudioDevice", "Landroidx/lifecycle/LiveData;", "getCurrentAudioDevice", "()Landroidx/lifecycle/LiveData;", "localParticipant", "getLocalParticipant", "participants", "getParticipants", "room", "Lcom/sendbird/calls/Room;", "sortedParticipants", "getSortedParticipants", "()Ljava/util/List;", "exit", "", "getAvailableAudioDevices", "", "muteMicrophone", "selectAudioDevice", "audioDevice", "startLocalVideo", "stopLocalVideo", "switchCamera", "unmuteMicrophone", "Companion", "RoomListenerImpl", "vision-digital-ink_debug"})
public final class GroupCallViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.sendbird.calls.Participant>> _participants = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.sendbird.calls.Participant>> participants = null;
    private final androidx.lifecycle.MutableLiveData<com.sendbird.calls.LocalParticipant> _localParticipant = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.sendbird.calls.LocalParticipant> localParticipant = null;
    private final androidx.lifecycle.MutableLiveData<com.sendbird.calls.AudioDevice> _currentAudioDevice = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.sendbird.calls.AudioDevice> currentAudioDevice = null;
    private final com.sendbird.calls.Room room = null;
    @org.jetbrains.annotations.NotNull
    public static final com.prianshuprasad.webrtc.GroupCallViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = null;
    
    public GroupCallViewModel(@org.jetbrains.annotations.NotNull
    java.lang.String roomId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.sendbird.calls.Participant>> getParticipants() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.sendbird.calls.LocalParticipant> getLocalParticipant() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.sendbird.calls.AudioDevice> getCurrentAudioDevice() {
        return null;
    }
    
    public final void exit() {
    }
    
    public final void muteMicrophone() {
    }
    
    public final void unmuteMicrophone() {
    }
    
    public final void stopLocalVideo() {
    }
    
    public final void startLocalVideo() {
    }
    
    public final void switchCamera() {
    }
    
    public final void selectAudioDevice(@org.jetbrains.annotations.NotNull
    com.sendbird.calls.AudioDevice audioDevice) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Set<com.sendbird.calls.AudioDevice> getAvailableAudioDevices() {
        return null;
    }
    
    private final java.util.List<com.sendbird.calls.Participant> getSortedParticipants() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0016\u0010\r\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u001a\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0015H\u0016\u00a8\u0006\u001a"}, d2 = {"Lcom/prianshuprasad/webrtc/GroupCallViewModel$RoomListenerImpl;", "Lcom/sendbird/calls/RoomListener;", "(Lcom/prianshuprasad/webrtc/GroupCallViewModel;)V", "onAudioDeviceChanged", "", "currentAudioDevice", "Lcom/sendbird/calls/AudioDevice;", "availableAudioDevices", "", "onCustomItemsDeleted", "deletedKeys", "", "", "onCustomItemsUpdated", "updatedKeys", "onError", "e", "Lcom/sendbird/calls/SendBirdException;", "participant", "Lcom/sendbird/calls/Participant;", "onRemoteAudioSettingsChanged", "Lcom/sendbird/calls/RemoteParticipant;", "onRemoteParticipantEntered", "onRemoteParticipantExited", "onRemoteParticipantStreamStarted", "onRemoteVideoSettingsChanged", "vision-digital-ink_debug"})
    public final class RoomListenerImpl implements com.sendbird.calls.RoomListener {
        
        public RoomListenerImpl() {
            super();
        }
        
        @java.lang.Override
        public void onAudioDeviceChanged(@org.jetbrains.annotations.Nullable
        com.sendbird.calls.AudioDevice currentAudioDevice, @org.jetbrains.annotations.NotNull
        java.util.Set<? extends com.sendbird.calls.AudioDevice> availableAudioDevices) {
        }
        
        @java.lang.Override
        public void onCustomItemsDeleted(@org.jetbrains.annotations.NotNull
        java.util.List<java.lang.String> deletedKeys) {
        }
        
        @java.lang.Override
        public void onCustomItemsUpdated(@org.jetbrains.annotations.NotNull
        java.util.List<java.lang.String> updatedKeys) {
        }
        
        @java.lang.Override
        public void onError(@org.jetbrains.annotations.NotNull
        com.sendbird.calls.SendBirdException e, @org.jetbrains.annotations.Nullable
        com.sendbird.calls.Participant participant) {
        }
        
        @java.lang.Override
        public void onRemoteAudioSettingsChanged(@org.jetbrains.annotations.NotNull
        com.sendbird.calls.RemoteParticipant participant) {
        }
        
        @java.lang.Override
        public void onRemoteParticipantEntered(@org.jetbrains.annotations.NotNull
        com.sendbird.calls.RemoteParticipant participant) {
        }
        
        @java.lang.Override
        public void onRemoteParticipantExited(@org.jetbrains.annotations.NotNull
        com.sendbird.calls.RemoteParticipant participant) {
        }
        
        @java.lang.Override
        public void onRemoteParticipantStreamStarted(@org.jetbrains.annotations.NotNull
        com.sendbird.calls.RemoteParticipant participant) {
        }
        
        @java.lang.Override
        public void onRemoteVideoSettingsChanged(@org.jetbrains.annotations.NotNull
        com.sendbird.calls.RemoteParticipant participant) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/prianshuprasad/webrtc/GroupCallViewModel$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "vision-digital-ink_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTAG() {
            return null;
        }
    }
}