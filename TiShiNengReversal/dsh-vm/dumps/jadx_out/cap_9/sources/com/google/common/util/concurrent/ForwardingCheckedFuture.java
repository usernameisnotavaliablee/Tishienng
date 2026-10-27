package com.google.common.util.concurrent;

import java.lang.Exception;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ForwardingCheckedFuture<V, X extends java.lang.Exception> extends com.google.common.util.concurrent.ForwardingListenableFuture<V> implements com.google.common.util.concurrent.CheckedFuture<V, X> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.Beta
    @java.lang.Deprecated
    public static abstract class SimpleForwardingCheckedFuture<V, X extends java.lang.Exception> extends com.google.common.util.concurrent.ForwardingCheckedFuture<V, X> {
        private final com.google.common.util.concurrent.CheckedFuture<V, X> delegate;

        protected SimpleForwardingCheckedFuture(com.google.common.util.concurrent.CheckedFuture<V, X> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.util.concurrent.CheckedFuture r1 = (com.google.common.util.concurrent.CheckedFuture) r1
                r0.delegate = r1
                return
        }

        @Override // com.google.common.util.concurrent.ForwardingCheckedFuture, com.google.common.util.concurrent.ForwardingListenableFuture, com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        protected final com.google.common.util.concurrent.CheckedFuture<V, X> delegate() {
                r1 = this;
                com.google.common.util.concurrent.CheckedFuture<V, X extends java.lang.Exception> r0 = r1.delegate
                return r0
        }

        @Override // com.google.common.util.concurrent.ForwardingCheckedFuture, com.google.common.util.concurrent.ForwardingListenableFuture, com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ com.google.common.util.concurrent.ListenableFuture delegate() {
                r1 = this;
                com.google.common.util.concurrent.CheckedFuture r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.util.concurrent.ForwardingCheckedFuture, com.google.common.util.concurrent.ForwardingListenableFuture, com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                com.google.common.util.concurrent.CheckedFuture r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.util.concurrent.ForwardingCheckedFuture, com.google.common.util.concurrent.ForwardingListenableFuture, com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ java.util.concurrent.Future delegate() {
                r1 = this;
                com.google.common.util.concurrent.CheckedFuture r0 = r1.delegate()
                return r0
        }
    }

    public ForwardingCheckedFuture() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.util.concurrent.CheckedFuture
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V checkedGet() throws java.lang.Exception {
            r1 = this;
            com.google.common.util.concurrent.CheckedFuture r0 = r1.delegate()
            java.lang.Object r0 = r0.checkedGet()
            return r0
    }

    @Override // com.google.common.util.concurrent.CheckedFuture
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V checkedGet(long r2, java.util.concurrent.TimeUnit r4) throws java.util.concurrent.TimeoutException, java.lang.Exception {
            r1 = this;
            com.google.common.util.concurrent.CheckedFuture r0 = r1.delegate()
            java.lang.Object r2 = r0.checkedGet(r2, r4)
            return r2
    }

    @Override // com.google.common.util.concurrent.ForwardingListenableFuture, com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
    protected abstract com.google.common.util.concurrent.CheckedFuture<V, X> delegate();

    @Override // com.google.common.util.concurrent.ForwardingListenableFuture, com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ com.google.common.util.concurrent.ListenableFuture delegate() {
            r1 = this;
            com.google.common.util.concurrent.CheckedFuture r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.util.concurrent.ForwardingListenableFuture, com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            com.google.common.util.concurrent.CheckedFuture r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.util.concurrent.ForwardingListenableFuture, com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.util.concurrent.Future delegate() {
            r1 = this;
            com.google.common.util.concurrent.CheckedFuture r0 = r1.delegate()
            return r0
    }
}
