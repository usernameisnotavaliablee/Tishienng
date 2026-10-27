package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class RegularImmutableSet<E> extends com.google.common.collect.ImmutableSet<E> {
    static final com.google.common.collect.RegularImmutableSet<java.lang.Object> EMPTY = null;

    @com.google.common.annotations.VisibleForTesting
    final transient java.lang.Object[] elements;
    private final transient int hashCode;
    private final transient int mask;
    private final transient int size;

    @com.google.common.annotations.VisibleForTesting
    final transient java.lang.Object[] table;

    static {
            com.google.common.collect.RegularImmutableSet r0 = new com.google.common.collect.RegularImmutableSet
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r4 = 0
            r5 = 0
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.common.collect.RegularImmutableSet.EMPTY = r0
            return
    }

    RegularImmutableSet(java.lang.Object[] r1, int r2, java.lang.Object[] r3, int r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.elements = r1
            r0.table = r3
            r0.mask = r4
            r0.hashCode = r2
            r0.size = r5
            return
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r5) {
            r4 = this;
            java.lang.Object[] r0 = r4.table
            r1 = 0
            if (r5 == 0) goto L1f
            if (r0 != 0) goto L8
            goto L1f
        L8:
            int r2 = com.google.common.collect.Hashing.smearedHash(r5)
        Lc:
            int r3 = r4.mask
            r2 = r2 & r3
            r3 = r0[r2]
            if (r3 != 0) goto L14
            return r1
        L14:
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L1c
            r5 = 1
            return r5
        L1c:
            int r2 = r2 + 1
            goto Lc
        L1f:
            return r1
    }

    @Override // com.google.common.collect.ImmutableCollection
    int copyIntoArray(java.lang.Object[] r4, int r5) {
            r3 = this;
            java.lang.Object[] r0 = r3.elements
            r1 = 0
            int r2 = r3.size
            java.lang.System.arraycopy(r0, r1, r4, r5, r2)
            int r4 = r3.size
            int r5 = r5 + r4
            return r5
    }

    @Override // com.google.common.collect.ImmutableSet
    com.google.common.collect.ImmutableList<E> createAsList() {
            r2 = this;
            java.lang.Object[] r0 = r2.elements
            int r1 = r2.size
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.asImmutableList(r0, r1)
            return r0
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
            r1 = this;
            int r0 = r1.hashCode
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection
    java.lang.Object[] internalArray() {
            r1 = this;
            java.lang.Object[] r0 = r1.elements
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection
    int internalArrayEnd() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection
    int internalArrayStart() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.common.collect.ImmutableSet
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }
}
