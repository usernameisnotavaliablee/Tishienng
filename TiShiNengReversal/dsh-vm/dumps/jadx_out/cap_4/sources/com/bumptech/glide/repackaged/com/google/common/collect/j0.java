package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class j0<E> extends com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> {
    private final transient com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> a;

    j0(com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r1, java.util.Comparator<? super E> r2) {
            r0 = this;
            r0.<init>(r2)
            r0.a = r1
            return
    }

    private int f(java.lang.Object r3) throws java.lang.ClassCastException {
            r2 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r0 = r2.a
            java.util.Comparator r1 = r2.g()
            int r3 = java.util.Collections.binarySearch(r0, r3, r1)
            return r3
    }

    com.bumptech.glide.repackaged.com.google.common.collect.j0<E> a(int r3, int r4) {
            r2 = this;
            if (r3 != 0) goto L9
            int r0 = r2.size()
            if (r4 != r0) goto L9
            return r2
        L9:
            if (r3 >= r4) goto L19
            com.bumptech.glide.repackaged.com.google.common.collect.j0 r0 = new com.bumptech.glide.repackaged.com.google.common.collect.j0
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r1 = r2.a
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r3 = r1.subList(r3, r4)
            java.util.Comparator<? super E> r4 = r2.comparator
            r0.<init>(r3, r4)
            return r0
        L19:
            java.util.Comparator<? super E> r3 = r2.comparator
            com.bumptech.glide.repackaged.com.google.common.collect.j0 r3 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet.emptySet(r3)
            return r3
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E ceiling(E r2) {
            r1 = this;
            r0 = 1
            int r2 = r1.e(r2, r0)
            int r0 = r1.size()
            if (r2 != r0) goto Ld
            r2 = 0
            return r2
        Ld:
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            r0 = 0
            if (r2 == 0) goto Lb
            int r2 = r1.f(r2)     // Catch: java.lang.ClassCastException -> Lb
            if (r2 < 0) goto Lb
            r2 = 1
            return r2
        Lb:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection<?> r6) {
            r5 = this;
            boolean r0 = r6 instanceof com.bumptech.glide.repackaged.com.google.common.collect.y
            if (r0 == 0) goto La
            com.bumptech.glide.repackaged.com.google.common.collect.y r6 = (com.bumptech.glide.repackaged.com.google.common.collect.y) r6
            java.util.Set r6 = r6.elementSet()
        La:
            java.util.Comparator r0 = r5.comparator()
            boolean r0 = com.bumptech.glide.repackaged.com.google.common.collect.r0.b(r0, r6)
            if (r0 == 0) goto L52
            int r0 = r6.size()
            r1 = 1
            if (r0 > r1) goto L1c
            goto L52
        L1c:
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = r5.iterator()
            com.bumptech.glide.repackaged.com.google.common.collect.c0 r0 = com.bumptech.glide.repackaged.com.google.common.collect.v.m(r0)
            java.util.Iterator r6 = r6.iterator()
            java.lang.Object r2 = r6.next()
        L2c:
            r3 = 0
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L51
            java.lang.Object r4 = r0.peek()     // Catch: java.lang.Throwable -> L51
            int r4 = r5.unsafeCompare(r4, r2)     // Catch: java.lang.Throwable -> L51
            if (r4 >= 0) goto L41
            r0.next()     // Catch: java.lang.Throwable -> L51
            goto L2c
        L41:
            if (r4 != 0) goto L4f
            boolean r2 = r6.hasNext()     // Catch: java.lang.Throwable -> L51
            if (r2 != 0) goto L4a
            return r1
        L4a:
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Throwable -> L51
            goto L2c
        L4f:
            if (r4 <= 0) goto L2c
        L51:
            return r3
        L52:
            boolean r6 = super.containsAll(r6)
            return r6
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection
    int copyIntoArray(java.lang.Object[] r2, int r3) {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r0 = r1.a
            int r2 = r0.copyIntoArray(r2, r3)
            return r2
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection
    com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> createAsList() {
            r2 = this;
            int r0 = r2.size()
            r1 = 1
            if (r0 > r1) goto La
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r0 = r2.a
            return r0
        La:
            com.bumptech.glide.repackaged.com.google.common.collect.s r0 = new com.bumptech.glide.repackaged.com.google.common.collect.s
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r1 = r2.a
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet
    com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> createDescendingSet() {
            r3 = this;
            java.util.Comparator<? super E> r0 = r3.comparator
            com.bumptech.glide.repackaged.com.google.common.collect.b0 r0 = com.bumptech.glide.repackaged.com.google.common.collect.b0.a(r0)
            com.bumptech.glide.repackaged.com.google.common.collect.b0 r0 = r0.d()
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L15
            com.bumptech.glide.repackaged.com.google.common.collect.j0 r0 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet.emptySet(r0)
            return r0
        L15:
            com.bumptech.glide.repackaged.com.google.common.collect.j0 r1 = new com.bumptech.glide.repackaged.com.google.common.collect.j0
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r2 = r3.a
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r2 = r2.reverse()
            r1.<init>(r2, r0)
            return r1
    }

    int d(E r4, boolean r5) {
            r3 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r0 = r3.a
            java.lang.Object r4 = com.bumptech.glide.repackaged.com.google.common.base.d.i(r4)
            java.util.Comparator r1 = r3.comparator()
            if (r5 == 0) goto Lf
            com.bumptech.glide.repackaged.com.google.common.collect.SortedLists$KeyPresentBehavior r5 = com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior.FIRST_AFTER
            goto L11
        Lf:
            com.bumptech.glide.repackaged.com.google.common.collect.SortedLists$KeyPresentBehavior r5 = com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior.FIRST_PRESENT
        L11:
            com.bumptech.glide.repackaged.com.google.common.collect.SortedLists$KeyAbsentBehavior r2 = com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_HIGHER
            int r4 = com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.a(r0, r4, r1, r5, r2)
            return r4
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public com.bumptech.glide.repackaged.com.google.common.collect.u0<E> descendingIterator() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r0 = r1.a
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r0 = r0.reverse()
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = r0.iterator()
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public /* bridge */ /* synthetic */ java.util.Iterator descendingIterator() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = r1.descendingIterator()
            return r0
    }

    int e(E r4, boolean r5) {
            r3 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r0 = r3.a
            java.lang.Object r4 = com.bumptech.glide.repackaged.com.google.common.base.d.i(r4)
            java.util.Comparator r1 = r3.comparator()
            if (r5 == 0) goto Lf
            com.bumptech.glide.repackaged.com.google.common.collect.SortedLists$KeyPresentBehavior r5 = com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior.FIRST_PRESENT
            goto L11
        Lf:
            com.bumptech.glide.repackaged.com.google.common.collect.SortedLists$KeyPresentBehavior r5 = com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior.FIRST_AFTER
        L11:
            com.bumptech.glide.repackaged.com.google.common.collect.SortedLists$KeyAbsentBehavior r2 = com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_HIGHER
            int r4 = com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.a(r0, r4, r1, r5, r2)
            return r4
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object r6) {
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
            boolean r1 = com.bumptech.glide.repackaged.com.google.common.collect.r0.b(r1, r6)
            if (r1 == 0) goto L47
            java.util.Iterator r6 = r6.iterator()
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r1 = r5.iterator()     // Catch: java.lang.Throwable -> L46
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

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public E first() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Le
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r0 = r2.a
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            return r0
        Le:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E floor(E r2) {
            r1 = this;
            r0 = 1
            int r2 = r1.d(r2, r0)
            int r2 = r2 - r0
            r0 = -1
            if (r2 != r0) goto Lb
            r2 = 0
            return r2
        Lb:
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    java.util.Comparator<java.lang.Object> g() {
            r1 = this;
            java.util.Comparator<? super E> r0 = r1.comparator
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet
    com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> headSetImpl(E r2, boolean r3) {
            r1 = this;
            r0 = 0
            int r2 = r1.d(r2, r3)
            com.bumptech.glide.repackaged.com.google.common.collect.j0 r2 = r1.a(r0, r2)
            return r2
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E higher(E r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.e(r2, r0)
            int r0 = r1.size()
            if (r2 != r0) goto Ld
            r2 = 0
            return r2
        Ld:
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet
    int indexOf(java.lang.Object r6) {
            r5 = this;
            r0 = -1
            if (r6 != 0) goto L4
            return r0
        L4:
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r1 = r5.a     // Catch: java.lang.ClassCastException -> L15
            java.util.Comparator r2 = r5.g()     // Catch: java.lang.ClassCastException -> L15
            com.bumptech.glide.repackaged.com.google.common.collect.SortedLists$KeyPresentBehavior r3 = com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior.ANY_PRESENT     // Catch: java.lang.ClassCastException -> L15
            com.bumptech.glide.repackaged.com.google.common.collect.SortedLists$KeyAbsentBehavior r4 = com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyAbsentBehavior.INVERTED_INSERTION_INDEX     // Catch: java.lang.ClassCastException -> L15
            int r6 = com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.a(r1, r6, r2, r3, r4)     // Catch: java.lang.ClassCastException -> L15
            if (r6 < 0) goto L15
            return r6
        L15:
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r0 = r1.a
            boolean r0 = r0.isPartialView()
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public com.bumptech.glide.repackaged.com.google.common.collect.u0<E> iterator() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r0 = r1.a
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = r0.iterator()
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = r1.iterator()
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public E last() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L13
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r0 = r2.a
            int r1 = r2.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            return r0
        L13:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E lower(E r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.d(r2, r0)
            int r2 = r2 + (-1)
            r0 = -1
            if (r2 != r0) goto Lc
            r2 = 0
            return r2
        Lc:
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r0 = r1.a
            int r0 = r0.size()
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet
    com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> subSetImpl(E r1, boolean r2, E r3, boolean r4) {
            r0 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r1 = r0.tailSetImpl(r1, r2)
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r1 = r1.headSetImpl(r3, r4)
            return r1
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet
    com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> tailSetImpl(E r1, boolean r2) {
            r0 = this;
            int r1 = r0.e(r1, r2)
            int r2 = r0.size()
            com.bumptech.glide.repackaged.com.google.common.collect.j0 r1 = r0.a(r1, r2)
            return r1
    }
}
