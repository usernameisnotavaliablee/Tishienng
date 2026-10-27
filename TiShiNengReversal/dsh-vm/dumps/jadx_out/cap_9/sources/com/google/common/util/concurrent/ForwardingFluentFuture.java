package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class ForwardingFluentFuture<V> extends com.google.common.util.concurrent.FluentFuture<V> {
    private final com.google.common.util.concurrent.ListenableFuture<V> delegate;

    ForwardingFluentFuture(com.google.common.util.concurrent.ListenableFuture<V> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            r0.delegate = r1
            return
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.ListenableFuture
    public void addListener(java.lang.Runnable r2, java.util.concurrent.Executor r3) {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<V> r0 = r1.delegate
            r0.addListener(r2, r3)
            return
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public boolean cancel(boolean r2) {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<V> r0 = r1.delegate
            boolean r2 = r0.cancel(r2)
            return r2
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<V> r0 = r1.delegate
            java.lang.Object r0 = r0.get()
            return r0
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public V get(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<V> r0 = r1.delegate
            java.lang.Object r2 = r0.get(r2, r4)
            return r2
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public boolean isCancelled() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<V> r0 = r1.delegate
            boolean r0 = r0.isCancelled()
            return r0
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public boolean isDone() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<V> r0 = r1.delegate
            boolean r0 = r0.isDone()
            return r0
    }
}
