package com.google.common.collect;

import java.lang.Enum;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class ImmutableEnumMap<K extends java.lang.Enum<K>, V> extends com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap<K, V> {
    private final transient java.util.EnumMap<K, V> delegate;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.collect.ImmutableEnumMap$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class EnumSerializedForm<K extends java.lang.Enum<K>, V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final java.util.EnumMap<K, V> delegate;

        EnumSerializedForm(java.util.EnumMap<K, V> r1) {
                r0 = this;
                r0.<init>()
                r0.delegate = r1
                return
        }

        java.lang.Object readResolve() {
                r3 = this;
                com.google.common.collect.ImmutableEnumMap r0 = new com.google.common.collect.ImmutableEnumMap
                java.util.EnumMap<K extends java.lang.Enum<K>, V> r1 = r3.delegate
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }
    }

    private ImmutableEnumMap(java.util.EnumMap<K, V> r1) {
            r0 = this;
            r0.<init>()
            r0.delegate = r1
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            com.google.common.base.Preconditions.checkArgument(r1)
            return
    }

    /* synthetic */ ImmutableEnumMap(java.util.EnumMap r1, com.google.common.collect.ImmutableEnumMap.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static <K extends java.lang.Enum<K>, V> com.google.common.collect.ImmutableMap<K, V> asImmutable(java.util.EnumMap<K, V> r2) {
            int r0 = r2.size()
            if (r0 == 0) goto L26
            r1 = 1
            if (r0 == r1) goto Lf
            com.google.common.collect.ImmutableEnumMap r0 = new com.google.common.collect.ImmutableEnumMap
            r0.<init>(r2)
            return r0
        Lf:
            java.util.Set r2 = r2.entrySet()
            java.lang.Object r2 = com.google.common.collect.Iterables.getOnlyElement(r2)
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            com.google.common.collect.ImmutableMap r2 = com.google.common.collect.ImmutableMap.of(r0, r2)
            return r2
        L26:
            com.google.common.collect.ImmutableMap r2 = com.google.common.collect.ImmutableMap.of()
            return r2
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public boolean containsKey(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            java.util.EnumMap<K extends java.lang.Enum<K>, V> r0 = r1.delegate
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
    com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> entryIterator() {
            r1 = this;
            java.util.EnumMap<K extends java.lang.Enum<K>, V> r0 = r1.delegate
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            com.google.common.collect.UnmodifiableIterator r0 = com.google.common.collect.Maps.unmodifiableEntryIterator(r0)
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.common.collect.ImmutableEnumMap
            if (r0 == 0) goto Lc
            com.google.common.collect.ImmutableEnumMap r2 = (com.google.common.collect.ImmutableEnumMap) r2
            java.util.EnumMap<K extends java.lang.Enum<K>, V> r2 = r2.delegate
        Lc:
            java.util.EnumMap<K extends java.lang.Enum<K>, V> r0 = r1.delegate
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public V get(java.lang.Object r2) {
            r1 = this;
            java.util.EnumMap<K extends java.lang.Enum<K>, V> r0 = r1.delegate
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // com.google.common.collect.ImmutableMap
    boolean isPartialView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap
    com.google.common.collect.UnmodifiableIterator<K> keyIterator() {
            r1 = this;
            java.util.EnumMap<K extends java.lang.Enum<K>, V> r0 = r1.delegate
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            com.google.common.collect.UnmodifiableIterator r0 = com.google.common.collect.Iterators.unmodifiableIterator(r0)
            return r0
    }

    @Override // java.util.Map
    public int size() {
            r1 = this;
            java.util.EnumMap<K extends java.lang.Enum<K>, V> r0 = r1.delegate
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap
    java.lang.Object writeReplace() {
            r2 = this;
            com.google.common.collect.ImmutableEnumMap$EnumSerializedForm r0 = new com.google.common.collect.ImmutableEnumMap$EnumSerializedForm
            java.util.EnumMap<K extends java.lang.Enum<K>, V> r1 = r2.delegate
            r0.<init>(r1)
            return r0
    }
}
