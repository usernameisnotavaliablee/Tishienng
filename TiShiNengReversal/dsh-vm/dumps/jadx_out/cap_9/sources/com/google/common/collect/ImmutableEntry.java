package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(serializable = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class ImmutableEntry<K, V> extends com.google.common.collect.AbstractMapEntry<K, V> implements java.io.Serializable {
    private static final long serialVersionUID = 0;

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    final K key;

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    final V value;

    ImmutableEntry(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r2) {
            r0 = this;
            r0.<init>()
            r0.key = r1
            r0.value = r2
            return
    }

    @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public final K getKey() {
            r1 = this;
            K r0 = r1.key
            return r0
    }

    @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public final V getValue() {
            r1 = this;
            V r0 = r1.value
            return r0
    }

    @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
    public final V setValue(V r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
