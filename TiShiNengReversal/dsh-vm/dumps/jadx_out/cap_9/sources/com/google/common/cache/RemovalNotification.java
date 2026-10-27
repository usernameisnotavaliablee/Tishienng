package com.google.common.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class RemovalNotification<K, V> extends java.util.AbstractMap.SimpleImmutableEntry<K, V> {
    private static final long serialVersionUID = 0;
    private final com.google.common.cache.RemovalCause cause;

    private RemovalNotification(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r2, com.google.common.cache.RemovalCause r3) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.cache.RemovalCause r1 = (com.google.common.cache.RemovalCause) r1
            r0.cause = r1
            return
    }

    public static <K, V> com.google.common.cache.RemovalNotification<K, V> create(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r2, com.google.common.cache.RemovalCause r3) {
            com.google.common.cache.RemovalNotification r0 = new com.google.common.cache.RemovalNotification
            r0.<init>(r1, r2, r3)
            return r0
    }

    public com.google.common.cache.RemovalCause getCause() {
            r1 = this;
            com.google.common.cache.RemovalCause r0 = r1.cause
            return r0
    }

    public boolean wasEvicted() {
            r1 = this;
            com.google.common.cache.RemovalCause r0 = r1.cause
            boolean r0 = r0.wasEvicted()
            return r0
    }
}
