package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class CompactLinkedHashSet<E> extends com.google.common.collect.CompactHashSet<E> {
    private static final int ENDPOINT = -2;
    private transient int firstEntry;
    private transient int lastEntry;

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    private transient int[] predecessor;

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    private transient int[] successor;

    CompactLinkedHashSet() {
            r0 = this;
            r0.<init>()
            return
    }

    CompactLinkedHashSet(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static <E> com.google.common.collect.CompactLinkedHashSet<E> create() {
            com.google.common.collect.CompactLinkedHashSet r0 = new com.google.common.collect.CompactLinkedHashSet
            r0.<init>()
            return r0
    }

    public static <E> com.google.common.collect.CompactLinkedHashSet<E> create(java.util.Collection<? extends E> r1) {
            int r0 = r1.size()
            com.google.common.collect.CompactLinkedHashSet r0 = createWithExpectedSize(r0)
            r0.addAll(r1)
            return r0
    }

    public static <E> com.google.common.collect.CompactLinkedHashSet<E> create(E... r1) {
            int r0 = r1.length
            com.google.common.collect.CompactLinkedHashSet r0 = createWithExpectedSize(r0)
            java.util.Collections.addAll(r0, r1)
            return r0
    }

    public static <E> com.google.common.collect.CompactLinkedHashSet<E> createWithExpectedSize(int r1) {
            com.google.common.collect.CompactLinkedHashSet r0 = new com.google.common.collect.CompactLinkedHashSet
            r0.<init>(r1)
            return r0
    }

    private void succeeds(int r3, int r4) {
            r2 = this;
            r0 = -2
            if (r3 != r0) goto L6
            r2.firstEntry = r4
            goto La
        L6:
            int[] r1 = r2.successor
            r1[r3] = r4
        La:
            if (r4 != r0) goto Lf
            r2.lastEntry = r3
            return
        Lf:
            int[] r0 = r2.predecessor
            r0[r4] = r3
            return
    }

    @Override // com.google.common.collect.CompactHashSet
    int adjustAfterRemove(int r2, int r3) {
            r1 = this;
            int r0 = r1.size()
            if (r2 != r0) goto L7
            return r3
        L7:
            return r2
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
            r2 = this;
            super.clear()
            r0 = -2
            r2.firstEntry = r0
            r2.lastEntry = r0
            int[] r0 = r2.predecessor
            r1 = -1
            java.util.Arrays.fill(r0, r1)
            int[] r0 = r2.successor
            java.util.Arrays.fill(r0, r1)
            return
    }

    @Override // com.google.common.collect.CompactHashSet
    int firstEntryIndex() {
            r1 = this;
            int r0 = r1.firstEntry
            return r0
    }

    @Override // com.google.common.collect.CompactHashSet
    int getSuccessor(int r2) {
            r1 = this;
            int[] r0 = r1.successor
            r2 = r0[r2]
            return r2
    }

    @Override // com.google.common.collect.CompactHashSet
    void init(int r1, float r2) {
            r0 = this;
            super.init(r1, r2)
            int[] r2 = new int[r1]
            r0.predecessor = r2
            int[] r1 = new int[r1]
            r0.successor = r1
            r1 = -1
            java.util.Arrays.fill(r2, r1)
            int[] r2 = r0.successor
            java.util.Arrays.fill(r2, r1)
            r1 = -2
            r0.firstEntry = r1
            r0.lastEntry = r1
            return
    }

    @Override // com.google.common.collect.CompactHashSet
    void insertEntry(int r1, E r2, int r3) {
            r0 = this;
            super.insertEntry(r1, r2, r3)
            int r2 = r0.lastEntry
            r0.succeeds(r2, r1)
            r2 = -2
            r0.succeeds(r1, r2)
            return
    }

    @Override // com.google.common.collect.CompactHashSet
    void moveEntry(int r4) {
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + (-1)
            super.moveEntry(r4)
            int[] r1 = r3.predecessor
            r1 = r1[r4]
            int[] r2 = r3.successor
            r2 = r2[r4]
            r3.succeeds(r1, r2)
            if (r0 == r4) goto L24
            int[] r1 = r3.predecessor
            r1 = r1[r0]
            r3.succeeds(r1, r4)
            int[] r1 = r3.successor
            r1 = r1[r0]
            r3.succeeds(r4, r1)
        L24:
            int[] r4 = r3.predecessor
            r1 = -1
            r4[r0] = r1
            int[] r4 = r3.successor
            r4[r0] = r1
            return
    }

    @Override // com.google.common.collect.CompactHashSet
    void resizeEntries(int r4) {
            r3 = this;
            super.resizeEntries(r4)
            int[] r0 = r3.predecessor
            int r1 = r0.length
            int[] r0 = java.util.Arrays.copyOf(r0, r4)
            r3.predecessor = r0
            int[] r0 = r3.successor
            int[] r0 = java.util.Arrays.copyOf(r0, r4)
            r3.successor = r0
            if (r1 >= r4) goto L21
            int[] r0 = r3.predecessor
            r2 = -1
            java.util.Arrays.fill(r0, r1, r4, r2)
            int[] r0 = r3.successor
            java.util.Arrays.fill(r0, r1, r4, r2)
        L21:
            return
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = com.google.common.collect.ObjectArrays.toArrayImpl(r1)
            return r0
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] r1) {
            r0 = this;
            java.lang.Object[] r1 = com.google.common.collect.ObjectArrays.toArrayImpl(r0, r1)
            return r1
    }
}
