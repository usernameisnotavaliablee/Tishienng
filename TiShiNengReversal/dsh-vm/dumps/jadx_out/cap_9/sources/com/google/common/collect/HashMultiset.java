package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class HashMultiset<E> extends com.google.common.collect.AbstractMapBasedMultiset<E> {

    @com.google.common.annotations.GwtIncompatible
    private static final long serialVersionUID = 0;

    HashMultiset(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static <E> com.google.common.collect.HashMultiset<E> create() {
            r0 = 3
            com.google.common.collect.HashMultiset r0 = create(r0)
            return r0
    }

    public static <E> com.google.common.collect.HashMultiset<E> create(int r1) {
            com.google.common.collect.HashMultiset r0 = new com.google.common.collect.HashMultiset
            r0.<init>(r1)
            return r0
    }

    public static <E> com.google.common.collect.HashMultiset<E> create(java.lang.Iterable<? extends E> r1) {
            int r0 = com.google.common.collect.Multisets.inferDistinctElements(r1)
            com.google.common.collect.HashMultiset r0 = create(r0)
            com.google.common.collect.Iterables.addAll(r0, r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.contains(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.Set elementSet() {
            r1 = this;
            java.util.Set r0 = super.elementSet()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.Set entrySet() {
            r1 = this;
            java.util.Set r0 = super.entrySet()
            return r0
    }

    @Override // com.google.common.collect.AbstractMapBasedMultiset
    void init(int r2) {
            r1 = this;
            com.google.common.collect.ObjectCountHashMap r0 = new com.google.common.collect.ObjectCountHashMap
            r0.<init>(r2)
            r1.backingMap = r0
            return
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
            r1 = this;
            boolean r0 = super.isEmpty()
            return r0
    }
}
