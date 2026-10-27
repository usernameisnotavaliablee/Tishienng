package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class i<E> extends com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> {
    private final com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> a;

    i(com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> r2) {
            r1 = this;
            java.util.Comparator r0 = r2.comparator()
            com.bumptech.glide.repackaged.com.google.common.collect.b0 r0 = com.bumptech.glide.repackaged.com.google.common.collect.b0.a(r0)
            com.bumptech.glide.repackaged.com.google.common.collect.b0 r0 = r0.d()
            r1.<init>(r0)
            r1.a = r2
            return
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E ceiling(E r2) {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> r0 = r1.a
            java.lang.Object r2 = r0.floor(r2)
            return r2
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> r0 = r1.a
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet
    com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> createDescendingSet() {
            r2 = this;
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "should never be called"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public com.bumptech.glide.repackaged.com.google.common.collect.u0<E> descendingIterator() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> r0 = r1.a
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = r0.iterator()
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public /* bridge */ /* synthetic */ java.util.Iterator descendingIterator() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = r1.descendingIterator()
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> descendingSet() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> r0 = r1.a
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public /* bridge */ /* synthetic */ java.util.NavigableSet descendingSet() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r0 = r1.descendingSet()
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E floor(E r2) {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> r0 = r1.a
            java.lang.Object r2 = r0.ceiling(r2)
            return r2
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet
    com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> headSetImpl(E r2, boolean r3) {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> r0 = r1.a
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r2 = r0.tailSet(r2, r3)
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r2 = r2.descendingSet()
            return r2
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E higher(E r2) {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> r0 = r1.a
            java.lang.Object r2 = r0.lower(r2)
            return r2
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet
    int indexOf(java.lang.Object r2) {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> r0 = r1.a
            int r2 = r0.indexOf(r2)
            r0 = -1
            if (r2 != r0) goto La
            return r2
        La:
            int r0 = r1.size()
            int r0 = r0 + (-1)
            int r0 = r0 - r2
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> r0 = r1.a
            boolean r0 = r0.isPartialView()
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public com.bumptech.glide.repackaged.com.google.common.collect.u0<E> iterator() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> r0 = r1.a
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = r0.descendingIterator()
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = r1.iterator()
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E lower(E r2) {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> r0 = r1.a
            java.lang.Object r2 = r0.higher(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> r0 = r1.a
            int r0 = r0.size()
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet
    com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> subSetImpl(E r2, boolean r3, E r4, boolean r5) {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> r0 = r1.a
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r2 = r0.subSet(r4, r5, r2, r3)
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r2 = r2.descendingSet()
            return r2
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet
    com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> tailSetImpl(E r2, boolean r3) {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> r0 = r1.a
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r2 = r0.headSet(r2, r3)
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r2 = r2.descendingSet()
            return r2
    }
}
