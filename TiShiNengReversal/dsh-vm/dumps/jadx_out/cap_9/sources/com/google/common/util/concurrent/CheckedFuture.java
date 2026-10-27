package com.google.common.util.concurrent;

import java.lang.Exception;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
@java.lang.Deprecated
@com.google.errorprone.annotations.CanIgnoreReturnValue
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface CheckedFuture<V, X extends java.lang.Exception> extends com.google.common.util.concurrent.ListenableFuture<V> {
    V checkedGet() throws java.lang.Exception;

    V checkedGet(long r1, java.util.concurrent.TimeUnit r3) throws java.util.concurrent.TimeoutException, java.lang.Exception;
}
