package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface BiMap<K, V> extends java.util.Map<K, V> {
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    V forcePut(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r2);

    com.google.common.collect.BiMap<V, K> inverse();

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    V put(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r2);

    void putAll(java.util.Map<? extends K, ? extends V> r1);

    @Override // java.util.Map
    java.util.Set<V> values();
}
