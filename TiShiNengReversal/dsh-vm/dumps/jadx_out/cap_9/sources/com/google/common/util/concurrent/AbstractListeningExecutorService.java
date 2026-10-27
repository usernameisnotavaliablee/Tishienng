package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.errorprone.annotations.CanIgnoreReturnValue
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class AbstractListeningExecutorService extends java.util.concurrent.AbstractExecutorService implements com.google.common.util.concurrent.ListeningExecutorService {
    public AbstractListeningExecutorService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final <T> java.util.concurrent.RunnableFuture<T> newTaskFor(java.lang.Runnable r1, T r2) {
            r0 = this;
            com.google.common.util.concurrent.TrustedListenableFutureTask r1 = com.google.common.util.concurrent.TrustedListenableFutureTask.create(r1, r2)
            return r1
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final <T> java.util.concurrent.RunnableFuture<T> newTaskFor(java.util.concurrent.Callable<T> r1) {
            r0 = this;
            com.google.common.util.concurrent.TrustedListenableFutureTask r1 = com.google.common.util.concurrent.TrustedListenableFutureTask.create(r1)
            return r1
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.ListeningExecutorService
    public com.google.common.util.concurrent.ListenableFuture<?> submit(java.lang.Runnable r1) {
            r0 = this;
            java.util.concurrent.Future r1 = super.submit(r1)
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            return r1
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.ListeningExecutorService
    public <T> com.google.common.util.concurrent.ListenableFuture<T> submit(java.lang.Runnable r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl T r2) {
            r0 = this;
            java.util.concurrent.Future r1 = super.submit(r1, r2)
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            return r1
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.ListeningExecutorService
    public <T> com.google.common.util.concurrent.ListenableFuture<T> submit(java.util.concurrent.Callable<T> r1) {
            r0 = this;
            java.util.concurrent.Future r1 = super.submit(r1)
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            return r1
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.Future submit(java.lang.Runnable r1) {
            r0 = this;
            com.google.common.util.concurrent.ListenableFuture r1 = r0.submit(r1)
            return r1
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.Future submit(java.lang.Runnable r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r0 = this;
            com.google.common.util.concurrent.ListenableFuture r1 = r0.submit(r1, r2)
            return r1
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.Future submit(java.util.concurrent.Callable r1) {
            r0 = this;
            com.google.common.util.concurrent.ListenableFuture r1 = r0.submit(r1)
            return r1
    }
}
