package com.prianshuprasad.webrtc.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tJ\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\tR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/prianshuprasad/webrtc/ui/viewmodel/MainActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "authDetails", "Landroidx/lifecycle/MutableLiveData;", "Lcom/prianshuprasad/webrtc/utils/RoomDetails;", "getAuthDetails", "()Landroidx/lifecycle/MutableLiveData;", "notify", "", "getNotify", "auth", "", "userId", "token", "createAndEnterRoom", "fetchRoomById", "roomId", "vision-digital-ink_debug"})
public final class MainActivityViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> notify = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.prianshuprasad.webrtc.utils.RoomDetails> authDetails = null;
    
    public MainActivityViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getNotify() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.prianshuprasad.webrtc.utils.RoomDetails> getAuthDetails() {
        return null;
    }
    
    public final void auth(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    public final void createAndEnterRoom() {
    }
    
    public final void fetchRoomById(@org.jetbrains.annotations.NotNull()
    java.lang.String roomId) {
    }
}