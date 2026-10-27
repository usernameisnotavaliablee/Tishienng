package com.google.common.collect;

import java.lang.Comparable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class RegularContiguousSet<C extends java.lang.Comparable> extends com.google.common.collect.ContiguousSet<C> {
    private static final long serialVersionUID = 0;
    private final com.google.common.collect.Range<C> range;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.GwtIncompatible
    private static final class SerializedForm<C extends java.lang.Comparable> implements java.io.Serializable {
        final com.google.common.collect.DiscreteDomain<C> domain;
        final com.google.common.collect.Range<C> range;

        private SerializedForm(com.google.common.collect.Range<C> r1, com.google.common.collect.DiscreteDomain<C> r2) {
                r0 = this;
                r0.<init>()
                r0.range = r1
                r0.domain = r2
                return
        }

        /* synthetic */ SerializedForm(com.google.common.collect.Range r1, com.google.common.collect.DiscreteDomain r2, com.google.common.collect.RegularContiguousSet.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private java.lang.Object readResolve() {
                r3 = this;
                com.google.common.collect.RegularContiguousSet r0 = new com.google.common.collect.RegularContiguousSet
                com.google.common.collect.Range<C extends java.lang.Comparable> r1 = r3.range
                com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> r2 = r3.domain
                r0.<init>(r1, r2)
                return r0
        }
    }

    RegularContiguousSet(com.google.common.collect.Range<C> r1, com.google.common.collect.DiscreteDomain<C> r2) {
            r0 = this;
            r0.<init>(r2)
            r0.range = r1
            return
    }

    static /* synthetic */ boolean access$000(java.lang.Comparable r0, java.lang.Comparable r1) {
            boolean r0 = equalsOrThrow(r0, r1)
            return r0
    }

    private static boolean equalsOrThrow(java.lang.Comparable<?> r0, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Comparable<?> r1) {
            if (r1 == 0) goto La
            int r0 = com.google.common.collect.Range.compareOrThrow(r0, r1)
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    private com.google.common.collect.ContiguousSet<C> intersectionInCurrentDomain(com.google.common.collect.Range<C> r2) {
            r1 = this;
            com.google.common.collect.Range<C extends java.lang.Comparable> r0 = r1.range
            boolean r0 = r0.isConnected(r2)
            if (r0 == 0) goto L15
            com.google.common.collect.Range<C extends java.lang.Comparable> r0 = r1.range
            com.google.common.collect.Range r2 = r0.intersection(r2)
            com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> r0 = r1.domain
            com.google.common.collect.ContiguousSet r2 = com.google.common.collect.ContiguousSet.create(r2, r0)
            return r2
        L15:
            com.google.common.collect.EmptyContiguousSet r2 = new com.google.common.collect.EmptyContiguousSet
            com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> r0 = r1.domain
            r2.<init>(r0)
            return r2
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            com.google.common.collect.Range<C extends java.lang.Comparable> r1 = r2.range     // Catch: java.lang.ClassCastException -> Ld
            java.lang.Comparable r3 = (java.lang.Comparable) r3     // Catch: java.lang.ClassCastException -> Ld
            boolean r3 = r1.contains(r3)     // Catch: java.lang.ClassCastException -> Ld
            return r3
        Ld:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection<?> r1) {
            r0 = this;
            boolean r1 = com.google.common.collect.Collections2.containsAllImpl(r0, r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableSet
    com.google.common.collect.ImmutableList<C> createAsList() {
            r1 = this;
            com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> r0 = r1.domain
            boolean r0 = r0.supportsFastOffset
            if (r0 == 0) goto Lc
            com.google.common.collect.RegularContiguousSet$3 r0 = new com.google.common.collect.RegularContiguousSet$3
            r0.<init>(r1)
            return r0
        Lc:
            com.google.common.collect.ImmutableList r0 = super.createAsList()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @com.google.common.annotations.GwtIncompatible
    public com.google.common.collect.UnmodifiableIterator<C> descendingIterator() {
            r2 = this;
            com.google.common.collect.RegularContiguousSet$2 r0 = new com.google.common.collect.RegularContiguousSet$2
            java.lang.Comparable r1 = r2.last()
            r0.<init>(r2, r1)
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
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.common.collect.RegularContiguousSet
            if (r1 == 0) goto L34
            r1 = r5
            com.google.common.collect.RegularContiguousSet r1 = (com.google.common.collect.RegularContiguousSet) r1
            com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> r2 = r4.domain
            com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> r3 = r1.domain
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L34
            java.lang.Comparable r5 = r4.first()
            java.lang.Comparable r2 = r1.first()
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L32
            java.lang.Comparable r5 = r4.last()
            java.lang.Comparable r1 = r1.last()
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L32
            return r0
        L32:
            r5 = 0
            return r5
        L34:
            boolean r5 = super.equals(r5)
            return r5
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public C first() {
            r2 = this;
            com.google.common.collect.Range<C extends java.lang.Comparable> r0 = r2.range
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r0.lowerBound
            com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> r1 = r2.domain
            java.lang.Comparable r0 = r0.leastValueAbove(r1)
            return r0
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
            int r0 = com.google.common.collect.Sets.hashCodeImpl(r1)
            return r0
    }

    @Override // com.google.common.collect.ContiguousSet
    com.google.common.collect.ContiguousSet<C> headSetImpl(C r1, boolean r2) {
            r0 = this;
            com.google.common.collect.BoundType r2 = com.google.common.collect.BoundType.forBoolean(r2)
            com.google.common.collect.Range r1 = com.google.common.collect.Range.upTo(r1, r2)
            com.google.common.collect.ContiguousSet r1 = r0.intersectionInCurrentDomain(r1)
            return r1
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
    int indexOf(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r2.contains(r3)
            if (r0 == 0) goto L14
            com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> r0 = r2.domain
            java.lang.Comparable r1 = r2.first()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            long r0 = r0.distance(r1, r3)
            int r3 = (int) r0
            return r3
        L14:
            r3 = -1
            return r3
    }

    @Override // com.google.common.collect.ContiguousSet
    public com.google.common.collect.ContiguousSet<C> intersection(com.google.common.collect.ContiguousSet<C> r4) {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> r0 = r3.domain
            com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> r1 = r4.domain
            boolean r0 = r0.equals(r1)
            com.google.common.base.Preconditions.checkArgument(r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L15
            return r4
        L15:
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            java.lang.Comparable r1 = r3.first()
            java.lang.Object r2 = r4.first()
            java.lang.Object r0 = r0.max(r1, r2)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            com.google.common.collect.Ordering r1 = com.google.common.collect.Ordering.natural()
            java.lang.Comparable r2 = r3.last()
            java.lang.Object r4 = r4.last()
            java.lang.Object r4 = r1.min(r2, r4)
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            int r1 = r0.compareTo(r4)
            if (r1 > 0) goto L4a
            com.google.common.collect.Range r4 = com.google.common.collect.Range.closed(r0, r4)
            com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> r0 = r3.domain
            com.google.common.collect.ContiguousSet r4 = com.google.common.collect.ContiguousSet.create(r4, r0)
            return r4
        L4a:
            com.google.common.collect.EmptyContiguousSet r4 = new com.google.common.collect.EmptyContiguousSet
            com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> r0 = r3.domain
            r4.<init>(r0)
            return r4
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
            r1 = this;
            r0 = 0
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
            r2 = this;
            com.google.common.collect.RegularContiguousSet$1 r0 = new com.google.common.collect.RegularContiguousSet$1
            java.lang.Comparable r1 = r2.first()
            r0.<init>(r2, r1)
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
            r2 = this;
            com.google.common.collect.Range<C extends java.lang.Comparable> r0 = r2.range
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r0.upperBound
            com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> r1 = r2.domain
            java.lang.Comparable r0 = r0.greatestValueBelow(r1)
            return r0
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
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.CLOSED
            com.google.common.collect.Range r0 = r1.range(r0, r0)
            return r0
    }

    @Override // com.google.common.collect.ContiguousSet
    public com.google.common.collect.Range<C> range(com.google.common.collect.BoundType r3, com.google.common.collect.BoundType r4) {
            r2 = this;
            com.google.common.collect.Range<C extends java.lang.Comparable> r0 = r2.range
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r0.lowerBound
            com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> r1 = r2.domain
            com.google.common.collect.Cut r3 = r0.withLowerBoundType(r3, r1)
            com.google.common.collect.Range<C extends java.lang.Comparable> r0 = r2.range
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r0.upperBound
            com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> r1 = r2.domain
            com.google.common.collect.Cut r4 = r0.withUpperBoundType(r4, r1)
            com.google.common.collect.Range r3 = com.google.common.collect.Range.create(r3, r4)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r5 = this;
            com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> r0 = r5.domain
            java.lang.Comparable r1 = r5.first()
            java.lang.Comparable r2 = r5.last()
            long r0 = r0.distance(r1, r2)
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L19
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
        L19:
            int r1 = (int) r0
            int r1 = r1 + 1
            return r1
    }

    @Override // com.google.common.collect.ContiguousSet
    com.google.common.collect.ContiguousSet<C> subSetImpl(C r2, boolean r3, C r4, boolean r5) {
            r1 = this;
            int r0 = r2.compareTo(r4)
            if (r0 != 0) goto L12
            if (r3 != 0) goto L12
            if (r5 != 0) goto L12
            com.google.common.collect.EmptyContiguousSet r2 = new com.google.common.collect.EmptyContiguousSet
            com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> r3 = r1.domain
            r2.<init>(r3)
            return r2
        L12:
            com.google.common.collect.BoundType r3 = com.google.common.collect.BoundType.forBoolean(r3)
            com.google.common.collect.BoundType r5 = com.google.common.collect.BoundType.forBoolean(r5)
            com.google.common.collect.Range r2 = com.google.common.collect.Range.range(r2, r3, r4, r5)
            com.google.common.collect.ContiguousSet r2 = r1.intersectionInCurrentDomain(r2)
            return r2
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
            com.google.common.collect.BoundType r2 = com.google.common.collect.BoundType.forBoolean(r2)
            com.google.common.collect.Range r1 = com.google.common.collect.Range.downTo(r1, r2)
            com.google.common.collect.ContiguousSet r1 = r0.intersectionInCurrentDomain(r1)
            return r1
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* bridge */ /* synthetic */ com.google.common.collect.ImmutableSortedSet tailSetImpl(java.lang.Object r1, boolean r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            com.google.common.collect.ContiguousSet r1 = r0.tailSetImpl(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @com.google.common.annotations.GwtIncompatible
    java.lang.Object writeReplace() {
            r4 = this;
            com.google.common.collect.RegularContiguousSet$SerializedForm r0 = new com.google.common.collect.RegularContiguousSet$SerializedForm
            com.google.common.collect.Range<C extends java.lang.Comparable> r1 = r4.range
            com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> r2 = r4.domain
            r3 = 0
            r0.<init>(r1, r2, r3)
            return r0
    }
}
