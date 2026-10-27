package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class SingletonImmutableSet<E> extends com.google.common.collect.ImmutableSet<E> {

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient int cachedHashCode;
    final transient E element;

    SingletonImmutableSet(E r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            r0.element = r1
            return
    }

    SingletonImmutableSet(E r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.element = r1
            r0.cachedHashCode = r2
            return
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            E r0 = r1.element
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // com.google.common.collect.ImmutableCollection
    int copyIntoArray(java.lang.Object[] r2, int r3) {
            r1 = this;
            E r0 = r1.element
            r2[r3] = r0
            int r3 = r3 + 1
            return r3
    }

    @Override // com.google.common.collect.ImmutableSet
    com.google.common.collect.ImmutableList<E> createAsList() {
            r1 = this;
            E r0 = r1.element
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r0)
            return r0
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
            r1 = this;
            int r0 = r1.cachedHashCode
            if (r0 != 0) goto Lc
            E r0 = r1.element
            int r0 = r0.hashCode()
            r1.cachedHashCode = r0
        Lc:
            return r0
    }

    @Override // com.google.common.collect.ImmutableSet
    boolean isHashCodeFast() {
            r1 = this;
            int r0 = r1.cachedHashCode
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public com.google.common.collect.UnmodifiableIterator<E> iterator() {
            r1 = this;
            E r0 = r1.element
            com.google.common.collect.UnmodifiableIterator r0 = com.google.common.collect.Iterators.singletonIterator(r0)
            return r0
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            E r1 = r2.element
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
