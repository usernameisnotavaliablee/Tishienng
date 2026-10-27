package com.google.common.collect;

import java.lang.Comparable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class EmptyContiguousSet<C extends java.lang.Comparable> extends com.google.common.collect.ContiguousSet<C> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.collect.EmptyContiguousSet$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.GwtIncompatible
    private static final class SerializedForm<C extends java.lang.Comparable> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.collect.DiscreteDomain<C> domain;

        private SerializedForm(com.google.common.collect.DiscreteDomain<C> r1) {
                r0 = this;
                r0.<init>()
                r0.domain = r1
                return
        }

        /* synthetic */ SerializedForm(com.google.common.collect.DiscreteDomain r1, com.google.common.collect.EmptyContiguousSet.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private java.lang.Object readResolve() {
                r2 = this;
                com.google.common.collect.EmptyContiguousSet r0 = new com.google.common.collect.EmptyContiguousSet
                com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> r1 = r2.domain
                r0.<init>(r1)
                return r0
        }
    }

    EmptyContiguousSet(com.google.common.collect.DiscreteDomain<C> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public com.google.common.collect.ImmutableList<C> asList() {
            r1 = this;
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    @com.google.common.annotations.GwtIncompatible
    com.google.common.collect.ImmutableSortedSet<C> createDescendingSet() {
            r1 = this;
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            com.google.common.collect.Ordering r0 = r0.reverse()
            com.google.common.collect.RegularImmutableSortedSet r0 = com.google.common.collect.ImmutableSortedSet.emptySet(r0)
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @com.google.common.annotations.GwtIncompatible
    public com.google.common.collect.UnmodifiableIterator<C> descendingIterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = com.google.common.collect.Iterators.emptyIterator()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @com.google.common.annotations.GwtIncompatible
    public /* bridge */ /* synthetic */ java.util.Iterator descendingIterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r1.descendingIterator()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.Set
            if (r0 == 0) goto Lb
            java.util.Set r2 = (java.util.Set) r2
            boolean r2 = r2.isEmpty()
            return r2
        Lb:
            r2 = 0
            return r2
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public C first() {
            r1 = this;
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ java.lang.Object first() {
            r1 = this;
            java.lang.Comparable r0 = r1.first()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.common.collect.ContiguousSet
    com.google.common.collect.ContiguousSet<C> headSetImpl(C r1, boolean r2) {
            r0 = this;
            return r0
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* bridge */ /* synthetic */ com.google.common.collect.ImmutableSortedSet headSetImpl(java.lang.Object r1, boolean r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            com.google.common.collect.ContiguousSet r1 = r0.headSetImpl(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @com.google.common.annotations.GwtIncompatible
    int indexOf(java.lang.Object r1) {
            r0 = this;
            r1 = -1
            return r1
    }

    @Override // com.google.common.collect.ContiguousSet
    public com.google.common.collect.ContiguousSet<C> intersection(com.google.common.collect.ContiguousSet<C> r1) {
            r0 = this;
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.common.collect.ImmutableSet
    @com.google.common.annotations.GwtIncompatible
    boolean isHashCodeFast() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public com.google.common.collect.UnmodifiableIterator<C> iterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = com.google.common.collect.Iterators.emptyIterator()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public C last() {
            r1 = this;
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ java.lang.Object last() {
            r1 = this;
            java.lang.Comparable r0 = r1.last()
            return r0
    }

    @Override // com.google.common.collect.ContiguousSet
    public com.google.common.collect.Range<C> range() {
            r1 = this;
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // com.google.common.collect.ContiguousSet
    public com.google.common.collect.Range<C> range(com.google.common.collect.BoundType r1, com.google.common.collect.BoundType r2) {
            r0 = this;
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.common.collect.ContiguousSet
    com.google.common.collect.ContiguousSet<C> subSetImpl(C r1, boolean r2, C r3, boolean r4) {
            r0 = this;
            return r0
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* bridge */ /* synthetic */ com.google.common.collect.ImmutableSortedSet subSetImpl(java.lang.Object r1, boolean r2, java.lang.Object r3, boolean r4) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            com.google.common.collect.ContiguousSet r1 = r0.subSetImpl(r1, r2, r3, r4)
            return r1
    }

    @Override // com.google.common.collect.ContiguousSet
    com.google.common.collect.ContiguousSet<C> tailSetImpl(C r1, boolean r2) {
            r0 = this;
            return r0
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* bridge */ /* synthetic */ com.google.common.collect.ImmutableSortedSet tailSetImpl(java.lang.Object r1, boolean r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            com.google.common.collect.ContiguousSet r1 = r0.tailSetImpl(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.ContiguousSet, java.util.AbstractCollection
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "[]"
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @com.google.common.annotations.GwtIncompatible
    java.lang.Object writeReplace() {
            r3 = this;
            com.google.common.collect.EmptyContiguousSet$SerializedForm r0 = new com.google.common.collect.EmptyContiguousSet$SerializedForm
            com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> r1 = r3.domain
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }
}
