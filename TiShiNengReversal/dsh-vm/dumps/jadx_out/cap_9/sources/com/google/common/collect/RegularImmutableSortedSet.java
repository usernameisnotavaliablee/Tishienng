package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class RegularImmutableSortedSet<E> extends com.google.common.collect.ImmutableSortedSet<E> {
    static final com.google.common.collect.RegularImmutableSortedSet<java.lang.Comparable> NATURAL_EMPTY_SET = null;

    @com.google.common.annotations.VisibleForTesting
    final transient com.google.common.collect.ImmutableList<E> elements;

    static {
            com.google.common.collect.RegularImmutableSortedSet r0 = new com.google.common.collect.RegularImmutableSortedSet
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
            com.google.common.collect.Ordering r2 = com.google.common.collect.Ordering.natural()
            r0.<init>(r1, r2)
            com.google.common.collect.RegularImmutableSortedSet.NATURAL_EMPTY_SET = r0
            return
    }

    RegularImmutableSortedSet(com.google.common.collect.ImmutableList<E> r1, java.util.Comparator<? super E> r2) {
            r0 = this;
            r0.<init>(r2)
            r0.elements = r1
            return
    }

    private int unsafeBinarySearch(java.lang.Object r3) throws java.lang.ClassCastException {
            r2 = this;
            com.google.common.collect.ImmutableList<E> r0 = r2.elements
            java.util.Comparator r1 = r2.unsafeComparator()
            int r3 = java.util.Collections.binarySearch(r0, r3, r1)
            return r3
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public com.google.common.collect.ImmutableList<E> asList() {
            r1 = this;
            com.google.common.collect.ImmutableList<E> r0 = r1.elements
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E ceiling(E r2) {
            r1 = this;
            r0 = 1
            int r2 = r1.tailIndex(r2, r0)
            int r0 = r1.size()
            if (r2 != r0) goto Ld
            r2 = 0
            return r2
        Ld:
            com.google.common.collect.ImmutableList<E> r0 = r1.elements
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            r0 = 0
            if (r2 == 0) goto Lb
            int r2 = r1.unsafeBinarySearch(r2)     // Catch: java.lang.ClassCastException -> Lb
            if (r2 < 0) goto Lb
            r2 = 1
            return r2
        Lb:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection<?> r7) {
            r6 = this;
            boolean r0 = r7 instanceof com.google.common.collect.Multiset
            if (r0 == 0) goto La
            com.google.common.collect.Multiset r7 = (com.google.common.collect.Multiset) r7
            java.util.Set r7 = r7.elementSet()
        La:
            java.util.Comparator r0 = r6.comparator()
            boolean r0 = com.google.common.collect.SortedIterables.hasSameComparator(r0, r7)
            if (r0 == 0) goto L57
            int r0 = r7.size()
            r1 = 1
            if (r0 > r1) goto L1c
            goto L57
        L1c:
            com.google.common.collect.UnmodifiableIterator r0 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 != 0) goto L2c
            return r3
        L2c:
            java.lang.Object r2 = r7.next()
            java.lang.Object r4 = r0.next()
        L34:
            int r5 = r6.unsafeCompare(r4, r2)     // Catch: java.lang.Throwable -> L56
            if (r5 >= 0) goto L46
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L56
            if (r4 != 0) goto L41
            return r3
        L41:
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L56
            goto L34
        L46:
            if (r5 != 0) goto L54
            boolean r2 = r7.hasNext()     // Catch: java.lang.Throwable -> L56
            if (r2 != 0) goto L4f
            return r1
        L4f:
            java.lang.Object r2 = r7.next()     // Catch: java.lang.Throwable -> L56
            goto L34
        L54:
            if (r5 <= 0) goto L34
        L56:
            return r3
        L57:
            boolean r7 = super.containsAll(r7)
            return r7
    }

    @Override // com.google.common.collect.ImmutableCollection
    int copyIntoArray(java.lang.Object[] r2, int r3) {
            r1 = this;
            com.google.common.collect.ImmutableList<E> r0 = r1.elements
            int r2 = r0.copyIntoArray(r2, r3)
            return r2
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    com.google.common.collect.ImmutableSortedSet<E> createDescendingSet() {
            r3 = this;
            java.util.Comparator<? super E> r0 = r3.comparator
            java.util.Comparator r0 = java.util.Collections.reverseOrder(r0)
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L11
            com.google.common.collect.RegularImmutableSortedSet r0 = com.google.common.collect.ImmutableSortedSet.emptySet(r0)
            return r0
        L11:
            com.google.common.collect.RegularImmutableSortedSet r1 = new com.google.common.collect.RegularImmutableSortedSet
            com.google.common.collect.ImmutableList<E> r2 = r3.elements
            com.google.common.collect.ImmutableList r2 = r2.reverse()
            r1.<init>(r2, r0)
            return r1
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @com.google.common.annotations.GwtIncompatible
    public com.google.common.collect.UnmodifiableIterator<E> descendingIterator() {
            r1 = this;
            com.google.common.collect.ImmutableList<E> r0 = r1.elements
            com.google.common.collect.ImmutableList r0 = r0.reverse()
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
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
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof java.util.Set
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.util.Set r6 = (java.util.Set) r6
            int r1 = r5.size()
            int r3 = r6.size()
            if (r1 == r3) goto L17
            return r2
        L17:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L1e
            return r0
        L1e:
            java.util.Comparator<? super E> r1 = r5.comparator
            boolean r1 = com.google.common.collect.SortedIterables.hasSameComparator(r1, r6)
            if (r1 == 0) goto L47
            java.util.Iterator r6 = r6.iterator()
            com.google.common.collect.UnmodifiableIterator r1 = r5.iterator()     // Catch: java.lang.Throwable -> L46
        L2e:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L45
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L46
            java.lang.Object r4 = r6.next()     // Catch: java.lang.Throwable -> L46
            if (r4 == 0) goto L44
            int r3 = r5.unsafeCompare(r3, r4)     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L2e
        L44:
            return r2
        L45:
            return r0
        L46:
            return r2
        L47:
            boolean r6 = r5.containsAll(r6)
            return r6
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public E first() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Le
            com.google.common.collect.ImmutableList<E> r0 = r2.elements
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            return r0
        Le:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E floor(E r2) {
            r1 = this;
            r0 = 1
            int r2 = r1.headIndex(r2, r0)
            int r2 = r2 - r0
            r0 = -1
            if (r2 != r0) goto Lb
            r2 = 0
            return r2
        Lb:
            com.google.common.collect.ImmutableList<E> r0 = r1.elements
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    com.google.common.collect.RegularImmutableSortedSet<E> getSubSet(int r3, int r4) {
            r2 = this;
            if (r3 != 0) goto L9
            int r0 = r2.size()
            if (r4 != r0) goto L9
            return r2
        L9:
            if (r3 >= r4) goto L19
            com.google.common.collect.RegularImmutableSortedSet r0 = new com.google.common.collect.RegularImmutableSortedSet
            com.google.common.collect.ImmutableList<E> r1 = r2.elements
            com.google.common.collect.ImmutableList r3 = r1.subList(r3, r4)
            java.util.Comparator<? super E> r4 = r2.comparator
            r0.<init>(r3, r4)
            return r0
        L19:
            java.util.Comparator<? super E> r3 = r2.comparator
            com.google.common.collect.RegularImmutableSortedSet r3 = com.google.common.collect.ImmutableSortedSet.emptySet(r3)
            return r3
    }

    int headIndex(E r3, boolean r4) {
            r2 = this;
            com.google.common.collect.ImmutableList<E> r0 = r2.elements
            java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3)
            java.util.Comparator r1 = r2.comparator()
            int r3 = java.util.Collections.binarySearch(r0, r3, r1)
            if (r3 < 0) goto L15
            if (r4 == 0) goto L14
            int r3 = r3 + 1
        L14:
            return r3
        L15:
            int r3 = ~r3
            return r3
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    com.google.common.collect.ImmutableSortedSet<E> headSetImpl(E r2, boolean r3) {
            r1 = this;
            r0 = 0
            int r2 = r1.headIndex(r2, r3)
            com.google.common.collect.RegularImmutableSortedSet r2 = r1.getSubSet(r0, r2)
            return r2
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E higher(E r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.tailIndex(r2, r0)
            int r0 = r1.size()
            if (r2 != r0) goto Ld
            r2 = 0
            return r2
        Ld:
            com.google.common.collect.ImmutableList<E> r0 = r1.elements
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    int indexOf(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
            r3 = this;
            r0 = -1
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.common.collect.ImmutableList<E> r1 = r3.elements     // Catch: java.lang.ClassCastException -> L11
            java.util.Comparator r2 = r3.unsafeComparator()     // Catch: java.lang.ClassCastException -> L11
            int r4 = java.util.Collections.binarySearch(r1, r4, r2)     // Catch: java.lang.ClassCastException -> L11
            if (r4 < 0) goto L11
            return r4
        L11:
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection
    java.lang.Object[] internalArray() {
            r1 = this;
            com.google.common.collect.ImmutableList<E> r0 = r1.elements
            java.lang.Object[] r0 = r0.internalArray()
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection
    int internalArrayEnd() {
            r1 = this;
            com.google.common.collect.ImmutableList<E> r0 = r1.elements
            int r0 = r0.internalArrayEnd()
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection
    int internalArrayStart() {
            r1 = this;
            com.google.common.collect.ImmutableList<E> r0 = r1.elements
            int r0 = r0.internalArrayStart()
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
            r1 = this;
            com.google.common.collect.ImmutableList<E> r0 = r1.elements
            boolean r0 = r0.isPartialView()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public com.google.common.collect.UnmodifiableIterator<E> iterator() {
            r1 = this;
            com.google.common.collect.ImmutableList<E> r0 = r1.elements
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public E last() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L13
            com.google.common.collect.ImmutableList<E> r0 = r2.elements
            int r1 = r2.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            return r0
        L13:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E lower(E r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.headIndex(r2, r0)
            int r2 = r2 + (-1)
            r0 = -1
            if (r2 != r0) goto Lc
            r2 = 0
            return r2
        Lc:
            com.google.common.collect.ImmutableList<E> r0 = r1.elements
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            com.google.common.collect.ImmutableList<E> r0 = r1.elements
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    com.google.common.collect.ImmutableSortedSet<E> subSetImpl(E r1, boolean r2, E r3, boolean r4) {
            r0 = this;
            com.google.common.collect.ImmutableSortedSet r1 = r0.tailSetImpl(r1, r2)
            com.google.common.collect.ImmutableSortedSet r1 = r1.headSetImpl(r3, r4)
            return r1
    }

    int tailIndex(E r3, boolean r4) {
            r2 = this;
            com.google.common.collect.ImmutableList<E> r0 = r2.elements
            java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3)
            java.util.Comparator r1 = r2.comparator()
            int r3 = java.util.Collections.binarySearch(r0, r3, r1)
            if (r3 < 0) goto L16
            if (r4 == 0) goto L13
            return r3
        L13:
            int r3 = r3 + 1
            return r3
        L16:
            int r3 = ~r3
            return r3
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    com.google.common.collect.ImmutableSortedSet<E> tailSetImpl(E r1, boolean r2) {
            r0 = this;
            int r1 = r0.tailIndex(r1, r2)
            int r2 = r0.size()
            com.google.common.collect.RegularImmutableSortedSet r1 = r0.getSubSet(r1, r2)
            return r1
    }

    java.util.Comparator<java.lang.Object> unsafeComparator() {
            r1 = this;
            java.util.Comparator<? super E> r0 = r1.comparator
            return r0
    }
}
