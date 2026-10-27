package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class CompactHashSet<E> extends java.util.AbstractSet<E> implements java.io.Serializable {
    private static final float DEFAULT_LOAD_FACTOR = 1.0f;
    private static final int DEFAULT_SIZE = 3;
    private static final long HASH_MASK = -4294967296L;
    private static final int MAXIMUM_CAPACITY = 1073741824;
    private static final long NEXT_MASK = 4294967295L;
    static final int UNSET = -1;

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    transient java.lang.Object[] elements;

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    private transient long[] entries;
    transient float loadFactor;
    transient int modCount;
    private transient int size;

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    private transient int[] table;
    private transient int threshold;


    CompactHashSet() {
            r2 = this;
            r2.<init>()
            r0 = 3
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.init(r0, r1)
            return
    }

    CompactHashSet(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.init(r2, r0)
            return
    }

    static /* synthetic */ long[] access$000(com.google.common.collect.CompactHashSet r0) {
            long[] r0 = r0.entries
            return r0
    }

    static /* synthetic */ int access$100(long r0) {
            int r0 = getHash(r0)
            return r0
    }

    static /* synthetic */ boolean access$200(com.google.common.collect.CompactHashSet r0, java.lang.Object r1, int r2) {
            boolean r0 = r0.remove(r1, r2)
            return r0
    }

    public static <E> com.google.common.collect.CompactHashSet<E> create() {
            com.google.common.collect.CompactHashSet r0 = new com.google.common.collect.CompactHashSet
            r0.<init>()
            return r0
    }

    public static <E> com.google.common.collect.CompactHashSet<E> create(java.util.Collection<? extends E> r1) {
            int r0 = r1.size()
            com.google.common.collect.CompactHashSet r0 = createWithExpectedSize(r0)
            r0.addAll(r1)
            return r0
    }

    public static <E> com.google.common.collect.CompactHashSet<E> create(E... r1) {
            int r0 = r1.length
            com.google.common.collect.CompactHashSet r0 = createWithExpectedSize(r0)
            java.util.Collections.addAll(r0, r1)
            return r0
    }

    public static <E> com.google.common.collect.CompactHashSet<E> createWithExpectedSize(int r1) {
            com.google.common.collect.CompactHashSet r0 = new com.google.common.collect.CompactHashSet
            r0.<init>(r1)
            return r0
    }

    private static int getHash(long r1) {
            r0 = 32
            long r1 = r1 >>> r0
            int r2 = (int) r1
            return r2
    }

    private static int getNext(long r0) {
            int r1 = (int) r0
            return r1
    }

    private int hashTableMask() {
            r1 = this;
            int[] r0 = r1.table
            int r0 = r0.length
            int r0 = r0 + (-1)
            return r0
    }

    private static long[] newEntries(int r2) {
            long[] r2 = new long[r2]
            r0 = -1
            java.util.Arrays.fill(r2, r0)
            return r2
    }

    private static int[] newTable(int r1) {
            int[] r1 = new int[r1]
            r0 = -1
            java.util.Arrays.fill(r1, r0)
            return r1
    }

    private void readObject(java.io.ObjectInputStream r3) throws java.io.IOException, java.lang.ClassNotFoundException {
            r2 = this;
            r3.defaultReadObject()
            r0 = 3
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.init(r0, r1)
            int r0 = r3.readInt()
        Ld:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L19
            java.lang.Object r1 = r3.readObject()
            r2.add(r1)
            goto Ld
        L19:
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    private boolean remove(java.lang.Object r10, int r11) {
            r9 = this;
            int r0 = r9.hashTableMask()
            r0 = r0 & r11
            int[] r1 = r9.table
            r1 = r1[r0]
            r2 = 0
            r3 = -1
            if (r1 != r3) goto Le
            return r2
        Le:
            r4 = -1
        Lf:
            long[] r5 = r9.entries
            r6 = r5[r1]
            int r5 = getHash(r6)
            if (r5 != r11) goto L51
            java.lang.Object[] r5 = r9.elements
            r5 = r5[r1]
            boolean r5 = com.google.common.base.Objects.equal(r10, r5)
            if (r5 == 0) goto L51
            if (r4 != r3) goto L32
            int[] r10 = r9.table
            long[] r11 = r9.entries
            r2 = r11[r1]
            int r11 = getNext(r2)
            r10[r0] = r11
            goto L42
        L32:
            long[] r10 = r9.entries
            r2 = r10[r4]
            r5 = r10[r1]
            int r11 = getNext(r5)
            long r2 = swapNext(r2, r11)
            r10[r4] = r2
        L42:
            r9.moveEntry(r1)
            int r10 = r9.size
            r11 = 1
            int r10 = r10 - r11
            r9.size = r10
            int r10 = r9.modCount
            int r10 = r10 + r11
            r9.modCount = r10
            return r11
        L51:
            long[] r4 = r9.entries
            r5 = r4[r1]
            int r4 = getNext(r5)
            if (r4 != r3) goto L5c
            return r2
        L5c:
            r8 = r4
            r4 = r1
            r1 = r8
            goto Lf
    }

    private void resizeMeMaybe(int r3) {
            r2 = this;
            long[] r0 = r2.entries
            int r0 = r0.length
            if (r3 <= r0) goto L17
            int r3 = r0 >>> 1
            r1 = 1
            int r3 = java.lang.Math.max(r1, r3)
            int r3 = r3 + r0
            if (r3 >= 0) goto L12
            r3 = 2147483647(0x7fffffff, float:NaN)
        L12:
            if (r3 == r0) goto L17
            r2.resizeEntries(r3)
        L17:
            return
    }

    private void resizeTable(int r12) {
            r11 = this;
            int[] r0 = r11.table
            int r0 = r0.length
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 < r1) goto Ld
            r12 = 2147483647(0x7fffffff, float:NaN)
            r11.threshold = r12
            return
        Ld:
            float r0 = (float) r12
            float r1 = r11.loadFactor
            float r0 = r0 * r1
            int r0 = (int) r0
            int r0 = r0 + 1
            int[] r12 = newTable(r12)
            long[] r1 = r11.entries
            int r2 = r12.length
            int r2 = r2 + (-1)
            r3 = 0
        L1f:
            int r4 = r11.size
            if (r3 >= r4) goto L40
            r4 = r1[r3]
            int r4 = getHash(r4)
            r5 = r4 & r2
            r6 = r12[r5]
            r12[r5] = r3
            long r4 = (long) r4
            r7 = 32
            long r4 = r4 << r7
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = (long) r6
            long r7 = r7 & r9
            long r4 = r4 | r7
            r1[r3] = r4
            int r3 = r3 + 1
            goto L1f
        L40:
            r11.threshold = r0
            r11.table = r12
            return
    }

    private static long swapNext(long r4, int r6) {
            r0 = -4294967296(0xffffffff00000000, double:NaN)
            long r4 = r4 & r0
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = (long) r6
            long r0 = r0 & r2
            long r4 = r4 | r0
            return r4
    }

    private void writeObject(java.io.ObjectOutputStream r3) throws java.io.IOException {
            r2 = this;
            r3.defaultWriteObject()
            int r0 = r2.size
            r3.writeInt(r0)
            java.util.Iterator r0 = r2.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            r3.writeObject(r1)
            goto Lc
        L1a:
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean add(@org.checkerframework.checker.nullness.compatqual.NullableDecl E r11) {
            r10 = this;
            long[] r0 = r10.entries
            java.lang.Object[] r1 = r10.elements
            int r2 = com.google.common.collect.Hashing.smearedHash(r11)
            int r3 = r10.hashTableMask()
            r3 = r3 & r2
            int r4 = r10.size
            int[] r5 = r10.table
            r6 = r5[r3]
            r7 = -1
            if (r6 != r7) goto L19
            r5[r3] = r4
            goto L37
        L19:
            r8 = r0[r6]
            int r3 = getHash(r8)
            if (r3 != r2) goto L2b
            r3 = r1[r6]
            boolean r3 = com.google.common.base.Objects.equal(r11, r3)
            if (r3 == 0) goto L2b
            r11 = 0
            return r11
        L2b:
            int r3 = getNext(r8)
            if (r3 != r7) goto L61
            long r7 = swapNext(r8, r4)
            r0[r6] = r7
        L37:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r0) goto L59
            int r0 = r4 + 1
            r10.resizeMeMaybe(r0)
            r10.insertEntry(r4, r11, r2)
            r10.size = r0
            int r11 = r10.threshold
            if (r4 < r11) goto L52
            int[] r11 = r10.table
            int r11 = r11.length
            int r11 = r11 * 2
            r10.resizeTable(r11)
        L52:
            int r11 = r10.modCount
            r0 = 1
            int r11 = r11 + r0
            r10.modCount = r11
            return r0
        L59:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot contain more than Integer.MAX_VALUE elements!"
            r11.<init>(r0)
            throw r11
        L61:
            r6 = r3
            goto L19
    }

    int adjustAfterRemove(int r1, int r2) {
            r0 = this;
            int r1 = r1 + (-1)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
            r4 = this;
            int r0 = r4.modCount
            int r0 = r0 + 1
            r4.modCount = r0
            java.lang.Object[] r0 = r4.elements
            int r1 = r4.size
            r2 = 0
            r3 = 0
            java.util.Arrays.fill(r0, r3, r1, r2)
            int[] r0 = r4.table
            r1 = -1
            java.util.Arrays.fill(r0, r1)
            long[] r0 = r4.entries
            r1 = -1
            java.util.Arrays.fill(r0, r1)
            r4.size = r3
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r6) {
            r5 = this;
            int r0 = com.google.common.collect.Hashing.smearedHash(r6)
            int[] r1 = r5.table
            int r2 = r5.hashTableMask()
            r2 = r2 & r0
            r1 = r1[r2]
        Ld:
            r2 = -1
            if (r1 == r2) goto L2b
            long[] r2 = r5.entries
            r3 = r2[r1]
            int r2 = getHash(r3)
            if (r2 != r0) goto L26
            java.lang.Object[] r2 = r5.elements
            r1 = r2[r1]
            boolean r1 = com.google.common.base.Objects.equal(r6, r1)
            if (r1 == 0) goto L26
            r6 = 1
            return r6
        L26:
            int r1 = getNext(r3)
            goto Ld
        L2b:
            r6 = 0
            return r6
    }

    int firstEntryIndex() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            return r0
        L8:
            r0 = 0
            return r0
    }

    int getSuccessor(int r2) {
            r1 = this;
            int r2 = r2 + 1
            int r0 = r1.size
            if (r2 >= r0) goto L7
            return r2
        L7:
            r2 = -1
            return r2
    }

    void init(int r5, float r6) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 < 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            java.lang.String r3 = "Initial capacity must be non-negative"
            com.google.common.base.Preconditions.checkArgument(r2, r3)
            r2 = 0
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L12
            r0 = 1
        L12:
            java.lang.String r2 = "Illegal load factor"
            com.google.common.base.Preconditions.checkArgument(r0, r2)
            double r2 = (double) r6
            int r0 = com.google.common.collect.Hashing.closedTableSize(r5, r2)
            int[] r2 = newTable(r0)
            r4.table = r2
            r4.loadFactor = r6
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r4.elements = r2
            long[] r5 = newEntries(r5)
            r4.entries = r5
            float r5 = (float) r0
            float r5 = r5 * r6
            int r5 = (int) r5
            int r5 = java.lang.Math.max(r1, r5)
            r4.threshold = r5
            return
    }

    void insertEntry(int r6, E r7, int r8) {
            r5 = this;
            long[] r0 = r5.entries
            long r1 = (long) r8
            r8 = 32
            long r1 = r1 << r8
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 | r3
            r0[r6] = r1
            java.lang.Object[] r8 = r5.elements
            r8[r6] = r7
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<E> iterator() {
            r1 = this;
            com.google.common.collect.CompactHashSet$1 r0 = new com.google.common.collect.CompactHashSet$1
            r0.<init>(r1)
            return r0
    }

    void moveEntry(int r7) {
            r6 = this;
            int r0 = r6.size()
            int r0 = r0 + (-1)
            r1 = -1
            r3 = 0
            if (r7 >= r0) goto L42
            java.lang.Object[] r4 = r6.elements
            r5 = r4[r0]
            r4[r7] = r5
            r4[r0] = r3
            long[] r3 = r6.entries
            r4 = r3[r0]
            r3[r7] = r4
            r3[r0] = r1
            int r1 = getHash(r4)
            int r2 = r6.hashTableMask()
            r1 = r1 & r2
            int[] r2 = r6.table
            r3 = r2[r1]
            if (r3 != r0) goto L2d
            r2[r1] = r7
            return
        L2d:
            long[] r1 = r6.entries
            r4 = r1[r3]
            int r1 = getNext(r4)
            if (r1 != r0) goto L40
            long[] r0 = r6.entries
            long r1 = swapNext(r4, r7)
            r0[r3] = r1
            return
        L40:
            r3 = r1
            goto L2d
        L42:
            java.lang.Object[] r0 = r6.elements
            r0[r7] = r3
            long[] r0 = r6.entries
            r0[r7] = r1
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            int r0 = com.google.common.collect.Hashing.smearedHash(r2)
            boolean r2 = r1.remove(r2, r0)
            return r2
    }

    void resizeEntries(int r5) {
            r4 = this;
            java.lang.Object[] r0 = r4.elements
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            r4.elements = r0
            long[] r0 = r4.entries
            int r1 = r0.length
            long[] r0 = java.util.Arrays.copyOf(r0, r5)
            if (r5 <= r1) goto L16
            r2 = -1
            java.util.Arrays.fill(r0, r1, r5, r2)
        L16:
            r4.entries = r0
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public java.lang.Object[] toArray() {
            r2 = this;
            java.lang.Object[] r0 = r2.elements
            int r1 = r2.size
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public <T> T[] toArray(T[] r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.elements
            r1 = 0
            int r2 = r3.size
            java.lang.Object[] r4 = com.google.common.collect.ObjectArrays.toArrayImpl(r0, r1, r2, r4)
            return r4
    }

    public void trimToSize() {
            r6 = this;
            int r0 = r6.size
            long[] r1 = r6.entries
            int r1 = r1.length
            if (r0 >= r1) goto La
            r6.resizeEntries(r0)
        La:
            float r1 = (float) r0
            float r2 = r6.loadFactor
            float r1 = r1 / r2
            int r1 = (int) r1
            int r1 = java.lang.Integer.highestOneBit(r1)
            r2 = 1
            int r1 = java.lang.Math.max(r2, r1)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 >= r2) goto L28
            double r2 = (double) r0
            double r4 = (double) r1
            double r2 = r2 / r4
            float r0 = r6.loadFactor
            double r4 = (double) r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L28
            int r1 = r1 << 1
        L28:
            int[] r0 = r6.table
            int r0 = r0.length
            if (r1 >= r0) goto L30
            r6.resizeTable(r1)
        L30:
            return
    }
}
