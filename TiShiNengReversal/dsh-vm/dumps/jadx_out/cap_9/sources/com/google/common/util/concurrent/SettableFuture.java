package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class SettableFuture<V> extends com.google.common.util.concurrent.AbstractFuture.TrustedFuture<V> {
    private SettableFuture() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <V> com.google.common.util.concurrent.SettableFuture<V> create() {
            com.google.common.util.concurrent.SettableFuture r0 = new com.google.common.util.concurrent.SettableFuture
            r0.<init>()
            return r0
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean set(@org.checkerframework.checker.nullness.compatqual.NullableDecl V r1) {
            r0 = this;
            boolean r1 = super.set(r1)
            return r1
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean setException(java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = super.setException(r1)
            return r1
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.annotations.Beta
    public boolean setFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> r1) {
            r0 = this;
            boolean r1 = super.setFuture(r1)
            return r1
    }
}
