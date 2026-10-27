package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class ImmutableMapKeySet<K, V> extends com.google.common.collect.IndexedImmutableSet<K> {
    private final com.google.common.collect.ImmutableMap<K, V> map;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.GwtIncompatible
    private static class KeySetSerializedForm<K> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.collect.ImmutableMap<K, ?> map;

        KeySetSerializedForm(com.google.common.collect.ImmutableMap<K, ?> r1) {
                r0 = this;
                r0.<init>()
                r0.map = r1
                return
        }

        java.lang.Object readResolve() {
                r1 = this;
                com.google.common.collect.ImmutableMap<K, ?> r0 = r1.map
                com.google.common.collect.ImmutableSet r0 = r0.keySet()
                return r0
        }
    }

    ImmutableMapKeySet(com.google.common.collect.ImmutableMap<K, V> r1) {
            r0 = this;
            r0.<init>()
            r0.map = r1
            return
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.ImmutableMap<K, V> r0 = r1.map
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // com.google.common.collect.IndexedImmutableSet
    K get(int r2) {
            r1 = this;
            com.google.common.collect.ImmutableMap<K, V> r0 = r1.map
            com.google.common.collect.ImmutableSet r0 = r0.entrySet()
            com.google.common.collect.ImmutableList r0 = r0.asList()
            java.lang.Object r2 = r0.get(r2)
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getKey()
            return r2
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public com.google.common.collect.UnmodifiableIterator<K> iterator() {
            r1 = this;
            com.google.common.collect.ImmutableMap<K, V> r0 = r1.map
            com.google.common.collect.UnmodifiableIterator r0 = r0.keyIterator()
            return r0
    }

    @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            com.google.common.collect.ImmutableMap<K, V> r0 = r1.map
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @com.google.common.annotations.GwtIncompatible
    java.lang.Object writeReplace() {
            r2 = this;
            com.google.common.collect.ImmutableMapKeySet$KeySetSerializedForm r0 = new com.google.common.collect.ImmutableMapKeySet$KeySetSerializedForm
            com.google.common.collect.ImmutableMap<K, V> r1 = r2.map
            r0.<init>(r1)
            return r0
    }
}
