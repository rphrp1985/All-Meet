package com.prianshuprasad.webrtc.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/prianshuprasad/webrtc/utils/MyCallback;", "", "fail", "", "msg", "", "success", "vision-digital-ink_debug"})
public abstract interface MyCallback {
    
    public abstract void success(@org.jetbrains.annotations.NotNull
    java.lang.String msg);
    
    public abstract void fail(@org.jetbrains.annotations.NotNull
    java.lang.String msg);
}