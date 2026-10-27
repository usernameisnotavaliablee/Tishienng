package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.errorprone.annotations.CanIgnoreReturnValue
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ForwardingListenableFuture<V> extends com.google.common.util.concurrent.ForwardingFuture<V> implements com.google.common.util.concurrent.ListenableFuture<V> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class SimpleForwardingListenableFuture<V> extends com.google.common.util.concurrent.ForwardingListenableFuture<V> {
        private final com.google.common.util.concurrent.ListenableFuture<V> delegate;

        protected SimpleForwardingListenableFuture(com.google.common.util.concurrent.ListenableFuture<V> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
                r0.delegate = r1
                return
        }

        @Override // com.google.common.util.concurrent.ForwardingListenableFuture, com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        protected final com.google.common.util.concurrent.ListenableFuture<V> delegate() {
                r1 = this;
                com.google.common.util.concurrent.ListenableFuture<V> r0 = r1.delegate
                return r0
        }

        @Override // com.google.common.util.concurrent.ForwardingListenableFuture, com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                com.google.common.util.concurrent.ListenableFuture r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.util.concurrent.ForwardingListenableFuture, com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ java.util.concurrent.Future delegate() {
                r1 = this;
                com.google.common.util.concurrent.ListenableFuture r0 = r1.delegate()
                return r0
        }
    }

    protected ForwardingListenableFuture() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(java.lang.Runnable r2, java.util.concurrent.Executor r3) {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r1.delegate()
            r0.addListener(r2, r3)
            return
    }

    @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
    protected abstract com.google.common.util.concurrent.ListenableFuture<? extends V> delegate();

    @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.util.concurrent.Future delegate() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r1.delegate()
            return r0
    }
}
