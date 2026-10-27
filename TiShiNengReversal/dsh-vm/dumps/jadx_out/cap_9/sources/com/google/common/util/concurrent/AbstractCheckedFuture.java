package com.google.common.util.concurrent;

import java.lang.Exception;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class AbstractCheckedFuture<V, X extends java.lang.Exception> extends com.google.common.util.concurrent.ForwardingListenableFuture.SimpleForwardingListenableFuture<V> implements com.google.common.util.concurrent.CheckedFuture<V, X> {
    protected AbstractCheckedFuture(com.google.common.util.concurrent.ListenableFuture<V> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.common.util.concurrent.CheckedFuture
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V checkedGet() throws java.lang.Exception {
            r2 = this;
            java.lang.Object r0 = r2.get()     // Catch: java.util.concurrent.ExecutionException -> L5 java.util.concurrent.CancellationException -> L7 java.lang.InterruptedException -> Ld
            return r0
        L5:
            r0 = move-exception
            goto L8
        L7:
            r0 = move-exception
        L8:
            java.lang.Exception r0 = r2.mapException(r0)
            throw r0
        Ld:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            java.lang.Exception r0 = r2.mapException(r0)
            throw r0
    }

    @Override // com.google.common.util.concurrent.CheckedFuture
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V checkedGet(long r1, java.util.concurrent.TimeUnit r3) throws java.util.concurrent.TimeoutException, java.lang.Exception {
            r0 = this;
            java.lang.Object r1 = r0.get(r1, r3)     // Catch: java.util.concurrent.ExecutionException -> L5 java.util.concurrent.CancellationException -> L7 java.lang.InterruptedException -> Ld
            return r1
        L5:
            r1 = move-exception
            goto L8
        L7:
            r1 = move-exception
        L8:
            java.lang.Exception r1 = r0.mapException(r1)
            throw r1
        Ld:
            r1 = move-exception
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
            java.lang.Exception r1 = r0.mapException(r1)
            throw r1
    }

    protected abstract X mapException(java.lang.Exception r1);
}
