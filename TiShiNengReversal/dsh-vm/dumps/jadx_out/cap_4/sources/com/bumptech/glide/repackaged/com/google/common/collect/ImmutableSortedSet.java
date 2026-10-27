package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class ImmutableSortedSet<E> extends com.bumptech.glide.repackaged.com.google.common.collect.t<E> implements com.bumptech.glide.repackaged.com.google.common.collect.q0<E>, java.util.NavigableSet<E> {
    private static final com.bumptech.glide.repackaged.com.google.common.collect.j0<java.lang.Comparable> NATURAL_EMPTY_SET = null;
    private static final java.util.Comparator<java.lang.Comparable> NATURAL_ORDER = null;
    final transient java.util.Comparator<? super E> comparator;
    transient com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> descendingSet;

    static {
            com.bumptech.glide.repackaged.com.google.common.collect.b0 r0 = com.bumptech.glide.repackaged.com.google.common.collect.b0.b()
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet.NATURAL_ORDER = r0
            com.bumptech.glide.repackaged.com.google.common.collect.j0 r1 = new com.bumptech.glide.repackaged.com.google.common.collect.j0
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r2 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList.of()
            r1.<init>(r2, r0)
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet.NATURAL_EMPTY_SET = r1
            return
    }

    ImmutableSortedSet(java.util.Comparator<? super E> r1) {
            r0 = this;
            r0.<init>()
            r0.comparator = r1
            return
    }

    static <E> com.bumptech.glide.repackaged.com.google.common.collect.j0<E> emptySet(java.util.Comparator<? super E> r2) {
            java.util.Comparator<java.lang.Comparable> r0 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet.NATURAL_ORDER
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lb
            com.bumptech.glide.repackaged.com.google.common.collect.j0<java.lang.Comparable> r2 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet.NATURAL_EMPTY_SET
            return r2
        Lb:
            com.bumptech.glide.repackaged.com.google.common.collect.j0 r0 = new com.bumptech.glide.repackaged.com.google.common.collect.j0
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r1 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList.of()
            r0.<init>(r1, r2)
            return r0
    }

    static int unsafeCompare(java.util.Comparator<?> r0, java.lang.Object r1, java.lang.Object r2) {
            int r0 = r0.compare(r1, r2)
            return r0
    }

    @Override // java.util.NavigableSet
    public E ceiling(E r2) {
            r1 = this;
            r0 = 1
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r2 = r1.tailSet(r2, r0)
            r0 = 0
            java.lang.Object r2 = com.bumptech.glide.repackaged.com.google.common.collect.u.c(r2, r0)
            return r2
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.q0, java.util.SortedSet
    public java.util.Comparator<? super E> comparator() {
            r1 = this;
            java.util.Comparator<? super E> r0 = r1.comparator
            return r0
    }

    com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> createDescendingSet() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.i r0 = new com.bumptech.glide.repackaged.com.google.common.collect.i
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.NavigableSet
    public abstract com.bumptech.glide.repackaged.com.google.common.collect.u0<E> descendingIterator();

    @Override // java.util.NavigableSet
    public /* bridge */ /* synthetic */ java.util.Iterator descendingIterator() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = r1.descendingIterator()
            return r0
    }

    @Override // java.util.NavigableSet
    public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> descendingSet() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> r0 = r1.descendingSet
            if (r0 != 0) goto Lc
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r0 = r1.createDescendingSet()
            r1.descendingSet = r0
            r0.descendingSet = r1
        Lc:
            return r0
    }

    @Override // java.util.NavigableSet
    public /* bridge */ /* synthetic */ java.util.NavigableSet descendingSet() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r0 = r1.descendingSet()
            return r0
    }

    @Override // java.util.SortedSet
    public E first() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = r1.iterator()
            java.lang.Object r0 = r0.next()
            return r0
    }

    @Override // java.util.NavigableSet
    public E floor(E r2) {
            r1 = this;
            r0 = 1
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r2 = r1.headSet(r2, r0)
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r2 = r2.descendingIterator()
            r0 = 0
            java.lang.Object r2 = com.bumptech.glide.repackaged.com.google.common.collect.v.j(r2, r0)
            return r2
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> headSet(E r2) {
            r1 = this;
            r0 = 0
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r2 = r1.headSet(r2, r0)
            return r2
    }

    @Override // java.util.NavigableSet
    public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> headSet(E r1, boolean r2) {
            r0 = this;
            java.lang.Object r1 = com.bumptech.glide.repackaged.com.google.common.base.d.i(r1)
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r1 = r0.headSetImpl(r1, r2)
            return r1
    }

    @Override // java.util.NavigableSet
    public /* bridge */ /* synthetic */ java.util.NavigableSet headSet(java.lang.Object r1, boolean r2) {
            r0 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r1 = r0.headSet(r1, r2)
            return r1
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ java.util.SortedSet headSet(java.lang.Object r1) {
            r0 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r1 = r0.headSet(r1)
            return r1
    }

    abstract com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> headSetImpl(E r1, boolean r2);

    @Override // java.util.NavigableSet
    public E higher(E r2) {
            r1 = this;
            r0 = 0
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r2 = r1.tailSet(r2, r0)
            r0 = 0
            java.lang.Object r2 = com.bumptech.glide.repackaged.com.google.common.collect.u.c(r2, r0)
            return r2
    }

    abstract int indexOf(java.lang.Object r1);

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract com.bumptech.glide.repackaged.com.google.common.collect.u0<E> iterator();

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = r1.iterator()
            return r0
    }

    @Override // java.util.SortedSet
    public E last() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = r1.descendingIterator()
            java.lang.Object r0 = r0.next()
            return r0
    }

    @Override // java.util.NavigableSet
    public E lower(E r2) {
            r1 = this;
            r0 = 0
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r2 = r1.headSet(r2, r0)
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r2 = r2.descendingIterator()
            r0 = 0
            java.lang.Object r2 = com.bumptech.glide.repackaged.com.google.common.collect.v.j(r2, r0)
            return r2
    }

    @Override // java.util.NavigableSet
    @java.lang.Deprecated
    public final E pollFirst() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.NavigableSet
    @java.lang.Deprecated
    public final E pollLast() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> subSet(E r3, E r4) {
            r2 = this;
            r0 = 1
            r1 = 0
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r3 = r2.subSet(r3, r0, r4, r1)
            return r3
    }

    @Override // java.util.NavigableSet
    public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> subSet(E r2, boolean r3, E r4, boolean r5) {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.base.d.i(r2)
            com.bumptech.glide.repackaged.com.google.common.base.d.i(r4)
            java.util.Comparator<? super E> r0 = r1.comparator
            int r0 = r0.compare(r2, r4)
            if (r0 > 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            com.bumptech.glide.repackaged.com.google.common.base.d.d(r0)
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r2 = r1.subSetImpl(r2, r3, r4, r5)
            return r2
    }

    @Override // java.util.NavigableSet
    public /* bridge */ /* synthetic */ java.util.NavigableSet subSet(java.lang.Object r1, boolean r2, java.lang.Object r3, boolean r4) {
            r0 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r1 = r0.subSet(r1, r2, r3, r4)
            return r1
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ java.util.SortedSet subSet(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r1 = r0.subSet(r1, r2)
            return r1
    }

    abstract com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> subSetImpl(E r1, boolean r2, E r3, boolean r4);

    @Override // java.util.NavigableSet, java.util.SortedSet
    public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> tailSet(E r2) {
            r1 = this;
            r0 = 1
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r2 = r1.tailSet(r2, r0)
            return r2
    }

    @Override // java.util.NavigableSet
    public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> tailSet(E r1, boolean r2) {
            r0 = this;
            java.lang.Object r1 = com.bumptech.glide.repackaged.com.google.common.base.d.i(r1)
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r1 = r0.tailSetImpl(r1, r2)
            return r1
    }

    @Override // java.util.NavigableSet
    public /* bridge */ /* synthetic */ java.util.NavigableSet tailSet(java.lang.Object r1, boolean r2) {
            r0 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r1 = r0.tailSet(r1, r2)
            return r1
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ java.util.SortedSet tailSet(java.lang.Object r1) {
            r0 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r1 = r0.tailSet(r1)
            return r1
    }

    abstract com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> tailSetImpl(E r1, boolean r2);

    int unsafeCompare(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            java.util.Comparator<? super E> r0 = r1.comparator
            int r2 = unsafeCompare(r0, r2, r3)
            return r2
    }
}
