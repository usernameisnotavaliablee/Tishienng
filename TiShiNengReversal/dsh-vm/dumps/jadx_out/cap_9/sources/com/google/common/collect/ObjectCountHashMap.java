package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class ObjectCountHashMap<K> {
    static final float DEFAULT_LOAD_FACTOR = 1.0f;
    static final int DEFAULT_SIZE = 3;
    private static final long HASH_MASK = -4294967296L;
    private static final int MAXIMUM_CAPACITY = 1073741824;
    private static final long NEXT_MASK = 4294967295L;
    static final int UNSET = -1;

    @com.google.common.annotations.VisibleForTesting
    transient long[] entries;
    transient java.lang.Object[] keys;
    private transient float loadFactor;
    transient int modCount;
    transient int size;
    private transient int[] table;
    private transient int threshold;
    transient int[] values;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class MapEntry extends com.google.common.collect.Multisets.AbstractEntry<K> {

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        final K key;
        int lastKnownIndex;
        final /* synthetic */ com.google.common.collect.ObjectCountHashMap this$0;

        MapEntry(com.google.common.collect.ObjectCountHashMap r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.lang.Object[] r1 = r1.keys
                r1 = r1[r2]
                r0.key = r1
                r0.lastKnownIndex = r2
                return
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int getCount() {
                r2 = this;
                r2.updateLastKnownIndex()
                int r0 = r2.lastKnownIndex
                r1 = -1
                if (r0 != r1) goto La
                r0 = 0
                return r0
            La:
                com.google.common.collect.ObjectCountHashMap r1 = r2.this$0
                int[] r1 = r1.values
                r0 = r1[r0]
                return r0
        }

        @Override // com.google.common.collect.Multiset.Entry
        public K getElement() {
                r1 = this;
                K r0 = r1.key
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public int setCount(int r4) {
                r3 = this;
                r3.updateLastKnownIndex()
                int r0 = r3.lastKnownIndex
                r1 = -1
                if (r0 != r1) goto L11
                com.google.common.collect.ObjectCountHashMap r0 = r3.this$0
                K r1 = r3.key
                r0.put(r1, r4)
                r4 = 0
                return r4
            L11:
                com.google.common.collect.ObjectCountHashMap r1 = r3.this$0
                int[] r1 = r1.values
                r2 = r1[r0]
                r1[r0] = r4
                return r2
        }

        void updateLastKnownIndex() {
                r3 = this;
                int r0 = r3.lastKnownIndex
                r1 = -1
                if (r0 == r1) goto L1f
                com.google.common.collect.ObjectCountHashMap r1 = r3.this$0
                int r1 = r1.size()
                if (r0 >= r1) goto L1f
                K r0 = r3.key
                com.google.common.collect.ObjectCountHashMap r1 = r3.this$0
                java.lang.Object[] r1 = r1.keys
                int r2 = r3.lastKnownIndex
                r1 = r1[r2]
                boolean r0 = com.google.common.base.Objects.equal(r0, r1)
                if (r0 != 0) goto L1e
                goto L1f
            L1e:
                return
            L1f:
                com.google.common.collect.ObjectCountHashMap r0 = r3.this$0
                K r1 = r3.key
                int r0 = r0.indexOf(r1)
                r3.lastKnownIndex = r0
                return
        }
    }

    ObjectCountHashMap() {
            r2 = this;
            r2.<init>()
            r0 = 3
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.init(r0, r1)
            return
    }

    ObjectCountHashMap(int r2) {
            r1 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r2, r0)
            return
    }

    ObjectCountHashMap(int r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.init(r1, r2)
            return
    }

    ObjectCountHashMap(com.google.common.collect.ObjectCountHashMap<? extends K> r4) {
            r3 = this;
            r3.<init>()
            int r0 = r4.size()
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.init(r0, r1)
            int r0 = r4.firstIndex()
        L10:
            r1 = -1
            if (r0 == r1) goto L23
            java.lang.Object r1 = r4.getKey(r0)
            int r2 = r4.getValue(r0)
            r3.put(r1, r2)
            int r0 = r4.nextIndex(r0)
            goto L10
        L23:
            return
    }

    public static <K> com.google.common.collect.ObjectCountHashMap<K> create() {
            com.google.common.collect.ObjectCountHashMap r0 = new com.google.common.collect.ObjectCountHashMap
            r0.<init>()
            return r0
    }

    public static <K> com.google.common.collect.ObjectCountHashMap<K> createWithExpectedSize(int r1) {
            com.google.common.collect.ObjectCountHashMap r0 = new com.google.common.collect.ObjectCountHashMap
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

    private int remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r10, int r11) {
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
            if (r5 != r11) goto L56
            java.lang.Object[] r5 = r9.keys
            r5 = r5[r1]
            boolean r5 = com.google.common.base.Objects.equal(r10, r5)
            if (r5 == 0) goto L56
            int[] r10 = r9.values
            r10 = r10[r1]
            if (r4 != r3) goto L36
            int[] r11 = r9.table
            long[] r2 = r9.entries
            r3 = r2[r1]
            int r2 = getNext(r3)
            r11[r0] = r2
            goto L46
        L36:
            long[] r11 = r9.entries
            r2 = r11[r4]
            r5 = r11[r1]
            int r0 = getNext(r5)
            long r2 = swapNext(r2, r0)
            r11[r4] = r2
        L46:
            r9.moveLastEntry(r1)
            int r11 = r9.size
            int r11 = r11 + (-1)
            r9.size = r11
            int r11 = r9.modCount
            int r11 = r11 + 1
            r9.modCount = r11
            return r10
        L56:
            long[] r4 = r9.entries
            r5 = r4[r1]
            int r4 = getNext(r5)
            if (r4 != r3) goto L61
            return r2
        L61:
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

    public void clear() {
            r4 = this;
            int r0 = r4.modCount
            int r0 = r0 + 1
            r4.modCount = r0
            java.lang.Object[] r0 = r4.keys
            int r1 = r4.size
            r2 = 0
            r3 = 0
            java.util.Arrays.fill(r0, r3, r1, r2)
            int[] r0 = r4.values
            int r1 = r4.size
            java.util.Arrays.fill(r0, r3, r1, r3)
            int[] r0 = r4.table
            r1 = -1
            java.util.Arrays.fill(r0, r1)
            long[] r0 = r4.entries
            r1 = -1
            java.util.Arrays.fill(r0, r1)
            r4.size = r3
            return
    }

    public boolean containsKey(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 == r0) goto L9
            r2 = 1
            return r2
        L9:
            r2 = 0
            return r2
    }

    void ensureCapacity(int r2) {
            r1 = this;
            long[] r0 = r1.entries
            int r0 = r0.length
            if (r2 <= r0) goto L8
            r1.resizeEntries(r2)
        L8:
            int r0 = r1.threshold
            if (r2 < r0) goto L1c
            int r2 = r2 + (-1)
            int r2 = java.lang.Integer.highestOneBit(r2)
            int r2 = r2 << 1
            r0 = 2
            int r2 = java.lang.Math.max(r0, r2)
            r1.resizeTable(r2)
        L1c:
            return
    }

    int firstIndex() {
            r1 = this;
            int r0 = r1.size
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public int get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 != r0) goto L9
            r2 = 0
            return r2
        L9:
            int[] r0 = r1.values
            r2 = r0[r2]
            return r2
    }

    com.google.common.collect.Multiset.Entry<K> getEntry(int r2) {
            r1 = this;
            int r0 = r1.size
            com.google.common.base.Preconditions.checkElementIndex(r2, r0)
            com.google.common.collect.ObjectCountHashMap$MapEntry r0 = new com.google.common.collect.ObjectCountHashMap$MapEntry
            r0.<init>(r1, r2)
            return r0
    }

    K getKey(int r2) {
            r1 = this;
            int r0 = r1.size
            com.google.common.base.Preconditions.checkElementIndex(r2, r0)
            java.lang.Object[] r0 = r1.keys
            r2 = r0[r2]
            return r2
    }

    int getValue(int r2) {
            r1 = this;
            int r0 = r1.size
            com.google.common.base.Preconditions.checkElementIndex(r2, r0)
            int[] r0 = r1.values
            r2 = r0[r2]
            return r2
    }

    int indexOf(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r6) {
            r5 = this;
            int r0 = com.google.common.collect.Hashing.smearedHash(r6)
            int[] r1 = r5.table
            int r2 = r5.hashTableMask()
            r2 = r2 & r0
            r1 = r1[r2]
        Ld:
            r2 = -1
            if (r1 == r2) goto L2a
            long[] r2 = r5.entries
            r3 = r2[r1]
            int r2 = getHash(r3)
            if (r2 != r0) goto L25
            java.lang.Object[] r2 = r5.keys
            r2 = r2[r1]
            boolean r2 = com.google.common.base.Objects.equal(r6, r2)
            if (r2 == 0) goto L25
            return r1
        L25:
            int r1 = getNext(r3)
            goto Ld
        L2a:
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
            r4.keys = r2
            int[] r2 = new int[r5]
            r4.values = r2
            long[] r5 = newEntries(r5)
            r4.entries = r5
            float r5 = (float) r0
            float r5 = r5 * r6
            int r5 = (int) r5
            int r5 = java.lang.Math.max(r1, r5)
            r4.threshold = r5
            return
    }

    void insertEntry(int r6, @org.checkerframework.checker.nullness.compatqual.NullableDecl K r7, int r8, int r9) {
            r5 = this;
            long[] r0 = r5.entries
            long r1 = (long) r9
            r9 = 32
            long r1 = r1 << r9
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 | r3
            r0[r6] = r1
            java.lang.Object[] r9 = r5.keys
            r9[r6] = r7
            int[] r7 = r5.values
            r7[r6] = r8
            return
    }

    void moveLastEntry(int r9) {
            r8 = this;
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = -1
            r3 = 0
            r4 = 0
            if (r9 >= r0) goto L4b
            java.lang.Object[] r5 = r8.keys
            r6 = r5[r0]
            r5[r9] = r6
            int[] r6 = r8.values
            r7 = r6[r0]
            r6[r9] = r7
            r5[r0] = r4
            r6[r0] = r3
            long[] r3 = r8.entries
            r4 = r3[r0]
            r3[r9] = r4
            r3[r0] = r1
            int r1 = getHash(r4)
            int r2 = r8.hashTableMask()
            r1 = r1 & r2
            int[] r2 = r8.table
            r3 = r2[r1]
            if (r3 != r0) goto L36
            r2[r1] = r9
            return
        L36:
            long[] r1 = r8.entries
            r4 = r1[r3]
            int r1 = getNext(r4)
            if (r1 != r0) goto L49
            long[] r0 = r8.entries
            long r1 = swapNext(r4, r9)
            r0[r3] = r1
            return
        L49:
            r3 = r1
            goto L36
        L4b:
            java.lang.Object[] r0 = r8.keys
            r0[r9] = r4
            int[] r0 = r8.values
            r0[r9] = r3
            long[] r0 = r8.entries
            r0[r9] = r1
            return
    }

    int nextIndex(int r2) {
            r1 = this;
            int r2 = r2 + 1
            int r0 = r1.size
            if (r2 >= r0) goto L7
            return r2
        L7:
            r2 = -1
            return r2
    }

    int nextIndexAfterRemove(int r1, int r2) {
            r0 = this;
            int r1 = r1 + (-1)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int put(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r12, int r13) {
            r11 = this;
            java.lang.String r0 = "count"
            com.google.common.collect.CollectPreconditions.checkPositive(r13, r0)
            long[] r0 = r11.entries
            java.lang.Object[] r1 = r11.keys
            int[] r2 = r11.values
            int r3 = com.google.common.collect.Hashing.smearedHash(r12)
            int r4 = r11.hashTableMask()
            r4 = r4 & r3
            int r5 = r11.size
            int[] r6 = r11.table
            r7 = r6[r4]
            r8 = -1
            if (r7 != r8) goto L20
            r6[r4] = r5
            goto L41
        L20:
            r9 = r0[r7]
            int r4 = getHash(r9)
            if (r4 != r3) goto L35
            r4 = r1[r7]
            boolean r4 = com.google.common.base.Objects.equal(r12, r4)
            if (r4 == 0) goto L35
            r12 = r2[r7]
            r2[r7] = r13
            return r12
        L35:
            int r4 = getNext(r9)
            if (r4 != r8) goto L6c
            long r1 = swapNext(r9, r5)
            r0[r7] = r1
        L41:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r0) goto L64
            int r0 = r5 + 1
            r11.resizeMeMaybe(r0)
            r11.insertEntry(r5, r12, r13, r3)
            r11.size = r0
            int r12 = r11.threshold
            if (r5 < r12) goto L5c
            int[] r12 = r11.table
            int r12 = r12.length
            int r12 = r12 * 2
            r11.resizeTable(r12)
        L5c:
            int r12 = r11.modCount
            int r12 = r12 + 1
            r11.modCount = r12
            r12 = 0
            return r12
        L64:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Cannot contain more than Integer.MAX_VALUE elements!"
            r12.<init>(r13)
            throw r12
        L6c:
            r7 = r4
            goto L20
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            int r0 = com.google.common.collect.Hashing.smearedHash(r2)
            int r2 = r1.remove(r2, r0)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    int removeEntry(int r5) {
            r4 = this;
            java.lang.Object[] r0 = r4.keys
            r0 = r0[r5]
            long[] r1 = r4.entries
            r2 = r1[r5]
            int r5 = getHash(r2)
            int r5 = r4.remove(r0, r5)
            return r5
    }

    void resizeEntries(int r5) {
            r4 = this;
            java.lang.Object[] r0 = r4.keys
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            r4.keys = r0
            int[] r0 = r4.values
            int[] r0 = java.util.Arrays.copyOf(r0, r5)
            r4.values = r0
            long[] r0 = r4.entries
            int r1 = r0.length
            long[] r0 = java.util.Arrays.copyOf(r0, r5)
            if (r5 <= r1) goto L1e
            r2 = -1
            java.util.Arrays.fill(r0, r1, r5, r2)
        L1e:
            r4.entries = r0
            return
    }

    void setValue(int r2, int r3) {
            r1 = this;
            int r0 = r1.size
            com.google.common.base.Preconditions.checkElementIndex(r2, r0)
            int[] r0 = r1.values
            r0[r2] = r3
            return
    }

    int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }
}
