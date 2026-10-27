package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class IndexedImmutableSet<E> extends com.google.common.collect.ImmutableSet<E> {


    IndexedImmutableSet() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.collect.ImmutableCollection
    @com.google.common.annotations.GwtIncompatible
    int copyIntoArray(java.lang.Object[] r2, int r3) {
            r1 = this;
            com.google.common.collect.ImmutableList r0 = r1.asList()
            int r2 = r0.copyIntoArray(r2, r3)
            return r2
    }

    @Override // com.google.common.collect.ImmutableSet
    com.google.common.collect.ImmutableList<E> createAsList() {
            r1 = this;
            com.google.common.collect.IndexedImmutableSet$1 r0 = new com.google.common.collect.IndexedImmutableSet$1
            r0.<init>(r1)
            return r0
    }

    abstract E get(int r1);

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public com.google.common.collect.UnmodifiableIterator<E> iterator() {
            r1 = this;
            com.google.common.collect.ImmutableList r0 = r1.asList()
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
            return r0
    }
}
