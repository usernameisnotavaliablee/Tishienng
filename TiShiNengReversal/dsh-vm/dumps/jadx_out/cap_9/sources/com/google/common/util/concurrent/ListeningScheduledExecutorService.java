package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface ListeningScheduledExecutorService extends java.util.concurrent.ScheduledExecutorService, com.google.common.util.concurrent.ListeningExecutorService {
    @Override // java.util.concurrent.ScheduledExecutorService
    com.google.common.util.concurrent.ListenableScheduledFuture<?> schedule(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4);

    @Override // java.util.concurrent.ScheduledExecutorService
    <V> com.google.common.util.concurrent.ListenableScheduledFuture<V> schedule(java.util.concurrent.Callable<V> r1, long r2, java.util.concurrent.TimeUnit r4);

    @Override // java.util.concurrent.ScheduledExecutorService
    com.google.common.util.concurrent.ListenableScheduledFuture<?> scheduleAtFixedRate(java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6);

    @Override // java.util.concurrent.ScheduledExecutorService
    com.google.common.util.concurrent.ListenableScheduledFuture<?> scheduleWithFixedDelay(java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6);
}
