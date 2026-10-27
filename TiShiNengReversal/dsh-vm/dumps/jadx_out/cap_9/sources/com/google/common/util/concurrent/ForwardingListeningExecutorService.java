package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.errorprone.annotations.CanIgnoreReturnValue
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ForwardingListeningExecutorService extends com.google.common.util.concurrent.ForwardingExecutorService implements com.google.common.util.concurrent.ListeningExecutorService {
    protected ForwardingListeningExecutorService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, com.google.common.collect.ForwardingObject
    protected abstract com.google.common.util.concurrent.ListeningExecutorService delegate();

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            com.google.common.util.concurrent.ListeningExecutorService r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.util.concurrent.ExecutorService delegate() {
            r1 = this;
            com.google.common.util.concurrent.ListeningExecutorService r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public com.google.common.util.concurrent.ListenableFuture<?> submit(java.lang.Runnable r2) {
            r1 = this;
            com.google.common.util.concurrent.ListeningExecutorService r0 = r1.delegate()
            com.google.common.util.concurrent.ListenableFuture r2 = r0.submit(r2)
            return r2
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public <T> com.google.common.util.concurrent.ListenableFuture<T> submit(java.lang.Runnable r2, T r3) {
            r1 = this;
            com.google.common.util.concurrent.ListeningExecutorService r0 = r1.delegate()
            com.google.common.util.concurrent.ListenableFuture r2 = r0.submit(r2, r3)
            return r2
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public <T> com.google.common.util.concurrent.ListenableFuture<T> submit(java.util.concurrent.Callable<T> r2) {
            r1 = this;
            com.google.common.util.concurrent.ListeningExecutorService r0 = r1.delegate()
            com.google.common.util.concurrent.ListenableFuture r2 = r0.submit(r2)
            return r2
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.Future submit(java.lang.Runnable r1) {
            r0 = this;
            com.google.common.util.concurrent.ListenableFuture r1 = r0.submit(r1)
            return r1
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.Future submit(java.lang.Runnable r1, java.lang.Object r2) {
            r0 = this;
            com.google.common.util.concurrent.ListenableFuture r1 = r0.submit(r1, r2)
            return r1
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.Future submit(java.util.concurrent.Callable r1) {
            r0 = this;
            com.google.common.util.concurrent.ListenableFuture r1 = r0.submit(r1)
            return r1
    }
}
