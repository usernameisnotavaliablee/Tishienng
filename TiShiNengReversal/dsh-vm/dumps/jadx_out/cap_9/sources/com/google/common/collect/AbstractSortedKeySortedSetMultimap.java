package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class AbstractSortedKeySortedSetMultimap<K, V> extends com.google.common.collect.AbstractSortedSetMultimap<K, V> {
    AbstractSortedKeySortedSetMultimap(java.util.SortedMap<K, java.util.Collection<V>> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Map asMap() {
            r1 = this;
            java.util.SortedMap r0 = r1.asMap()
            return r0
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.SortedMap<K, java.util.Collection<V>> asMap() {
            r1 = this;
            java.util.Map r0 = super.asMap()
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            return r0
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* bridge */ /* synthetic */ java.util.Map backingMap() {
            r1 = this;
            java.util.SortedMap r0 = r1.backingMap()
            return r0
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    java.util.SortedMap<K, java.util.Collection<V>> backingMap() {
            r1 = this;
            java.util.Map r0 = super.backingMap()
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            return r0
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
    java.util.Set<K> createKeySet() {
            r1 = this;
            java.util.Set r0 = r1.createMaybeNavigableKeySet()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Set keySet() {
            r1 = this;
            java.util.SortedSet r0 = r1.keySet()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.SortedSet<K> keySet() {
            r1 = this;
            java.util.Set r0 = super.keySet()
            java.util.SortedSet r0 = (java.util.SortedSet) r0
            return r0
    }
}
