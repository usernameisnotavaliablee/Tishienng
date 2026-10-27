package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface ListeningExecutorService extends java.util.concurrent.ExecutorService {
    @Override // java.util.concurrent.ExecutorService
    <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> r1) throws java.lang.InterruptedException;

    @Override // java.util.concurrent.ExecutorService
    <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> r1, long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException;

    com.google.common.util.concurrent.ListenableFuture<?> submit(java.lang.Runnable r1);

    <T> com.google.common.util.concurrent.ListenableFuture<T> submit(java.lang.Runnable r1, T r2);

    <T> com.google.common.util.concurrent.ListenableFuture<T> submit(java.util.concurrent.Callable<T> r1);
}
