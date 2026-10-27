package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface ListenableFuture<V> extends java.util.concurrent.Future<V> {
    void addListener(java.lang.Runnable r1, java.util.concurrent.Executor r2);
}
