package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface TimeLimiter {
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    <T> T callUninterruptiblyWithTimeout(java.util.concurrent.Callable<T> r1, long r2, java.util.concurrent.TimeUnit r4) throws java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException;

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    <T> T callWithTimeout(java.util.concurrent.Callable<T> r1, long r2, java.util.concurrent.TimeUnit r4) throws java.util.concurrent.TimeoutException, java.lang.InterruptedException, java.util.concurrent.ExecutionException;

    <T> T newProxy(T r1, java.lang.Class<T> r2, long r3, java.util.concurrent.TimeUnit r5);

    void runUninterruptiblyWithTimeout(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4) throws java.util.concurrent.TimeoutException;

    void runWithTimeout(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4) throws java.util.concurrent.TimeoutException, java.lang.InterruptedException;
}
