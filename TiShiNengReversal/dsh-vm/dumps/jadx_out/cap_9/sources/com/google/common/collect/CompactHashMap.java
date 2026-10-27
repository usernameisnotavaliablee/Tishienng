package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class CompactHashMap<K, V> extends java.util.AbstractMap<K, V> implements java.io.Serializable {
    static final float DEFAULT_LOAD_FACTOR = 1.0f;
    static final int DEFAULT_SIZE = 3;
    private static final long HASH_MASK = -4294967296L;
    private static final int MAXIMUM_CAPACITY = 1073741824;
    private static final long NEXT_MASK = 4294967295L;
    static final int UNSET = -1;

    @com.google.common.annotations.VisibleForTesting
    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    transient long[] entries;

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    private transient java.util.Set<java.util.Map.Entry<K, V>> entrySetView;

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    private transient java.util.Set<K> keySetView;

    @com.google.common.annotations.VisibleForTesting
    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    transient java.lang.Object[] keys;
    transient float loadFactor;
    transient int modCount;
    private transient int size;

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    private transient int[] table;
    private transient int threshold;

    @com.google.common.annotations.VisibleForTesting
    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    transient java.lang.Object[] values;

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    private transient java.util.Collection<V> valuesView;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class EntrySetView extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        final /* synthetic */ com.google.common.collect.CompactHashMap this$0;

        EntrySetView(com.google.common.collect.CompactHashMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.google.common.collect.CompactHashMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L26
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                com.google.common.collect.CompactHashMap r0 = r3.this$0
                java.lang.Object r2 = r4.getKey()
                int r0 = com.google.common.collect.CompactHashMap.access$200(r0, r2)
                r2 = -1
                if (r0 == r2) goto L26
                com.google.common.collect.CompactHashMap r2 = r3.this$0
                java.lang.Object[] r2 = r2.values
                r0 = r2[r0]
                java.lang.Object r4 = r4.getValue()
                boolean r4 = com.google.common.base.Objects.equal(r0, r4)
                if (r4 == 0) goto L26
                r4 = 1
                return r4
            L26:
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r1 = this;
                com.google.common.collect.CompactHashMap r0 = r1.this$0
                java.util.Iterator r0 = r0.entrySetIterator()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof java.util.Map.Entry
                if (r0 == 0) goto L2a
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                com.google.common.collect.CompactHashMap r0 = r2.this$0
                java.lang.Object r1 = r3.getKey()
                int r0 = com.google.common.collect.CompactHashMap.access$200(r0, r1)
                r1 = -1
                if (r0 == r1) goto L2a
                com.google.common.collect.CompactHashMap r1 = r2.this$0
                java.lang.Object[] r1 = r1.values
                r1 = r1[r0]
                java.lang.Object r3 = r3.getValue()
                boolean r3 = com.google.common.base.Objects.equal(r1, r3)
                if (r3 == 0) goto L2a
                com.google.common.collect.CompactHashMap r3 = r2.this$0
                com.google.common.collect.CompactHashMap.access$000(r3, r0)
                r3 = 1
                return r3
            L2a:
                r3 = 0
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.common.collect.CompactHashMap r0 = r1.this$0
                int r0 = com.google.common.collect.CompactHashMap.access$100(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private abstract class Itr<T> implements java.util.Iterator<T> {
        int currentIndex;
        int expectedModCount;
        int indexToRemove;
        final /* synthetic */ com.google.common.collect.CompactHashMap this$0;

        private Itr(com.google.common.collect.CompactHashMap r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                int r0 = r2.modCount
                r1.expectedModCount = r0
                int r2 = r2.firstEntryIndex()
                r1.currentIndex = r2
                r2 = -1
                r1.indexToRemove = r2
                return
        }

        /* synthetic */ Itr(com.google.common.collect.CompactHashMap r1, com.google.common.collect.CompactHashMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void checkForConcurrentModification() {
                r2 = this;
                com.google.common.collect.CompactHashMap r0 = r2.this$0
                int r0 = r0.modCount
                int r1 = r2.expectedModCount
                if (r0 != r1) goto L9
                return
            L9:
                java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                r0.<init>()
                throw r0
        }

        abstract T getOutput(int r1);

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                int r0 = r1.currentIndex
                if (r0 < 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r3 = this;
                r3.checkForConcurrentModification()
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L1c
                int r0 = r3.currentIndex
                r3.indexToRemove = r0
                java.lang.Object r0 = r3.getOutput(r0)
                com.google.common.collect.CompactHashMap r1 = r3.this$0
                int r2 = r3.currentIndex
                int r1 = r1.getSuccessor(r2)
                r3.currentIndex = r1
                return r0
            L1c:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r3 = this;
                r3.checkForConcurrentModification()
                int r0 = r3.indexToRemove
                r1 = 1
                if (r0 < 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                com.google.common.collect.CollectPreconditions.checkRemove(r0)
                int r0 = r3.expectedModCount
                int r0 = r0 + r1
                r3.expectedModCount = r0
                com.google.common.collect.CompactHashMap r0 = r3.this$0
                int r1 = r3.indexToRemove
                com.google.common.collect.CompactHashMap.access$000(r0, r1)
                com.google.common.collect.CompactHashMap r0 = r3.this$0
                int r1 = r3.currentIndex
                int r2 = r3.indexToRemove
                int r0 = r0.adjustAfterRemove(r1, r2)
                r3.currentIndex = r0
                r0 = -1
                r3.indexToRemove = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class KeySetView extends java.util.AbstractSet<K> {
        final /* synthetic */ com.google.common.collect.CompactHashMap this$0;

        KeySetView(com.google.common.collect.CompactHashMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.google.common.collect.CompactHashMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.CompactHashMap r0 = r1.this$0
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<K> iterator() {
                r1 = this;
                com.google.common.collect.CompactHashMap r0 = r1.this$0
                java.util.Iterator r0 = r0.keySetIterator()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.CompactHashMap r0 = r1.this$0
                int r2 = com.google.common.collect.CompactHashMap.access$200(r0, r2)
                r0 = -1
                if (r2 != r0) goto Lb
                r2 = 0
                return r2
            Lb:
                com.google.common.collect.CompactHashMap r0 = r1.this$0
                com.google.common.collect.CompactHashMap.access$000(r0, r2)
                r2 = 1
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.common.collect.CompactHashMap r0 = r1.this$0
                int r0 = com.google.common.collect.CompactHashMap.access$100(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class MapEntry extends com.google.common.collect.AbstractMapEntry<K, V> {

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        private final K key;
        private int lastKnownIndex;
        final /* synthetic */ com.google.common.collect.CompactHashMap this$0;

        MapEntry(com.google.common.collect.CompactHashMap r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.lang.Object[] r1 = r1.keys
                r1 = r1[r2]
                r0.key = r1
                r0.lastKnownIndex = r2
                return
        }

        private void updateLastKnownIndex() {
                r3 = this;
                int r0 = r3.lastKnownIndex
                r1 = -1
                if (r0 == r1) goto L1f
                com.google.common.collect.CompactHashMap r1 = r3.this$0
                int r1 = r1.size()
                if (r0 >= r1) goto L1f
                K r0 = r3.key
                com.google.common.collect.CompactHashMap r1 = r3.this$0
                java.lang.Object[] r1 = r1.keys
                int r2 = r3.lastKnownIndex
                r1 = r1[r2]
                boolean r0 = com.google.common.base.Objects.equal(r0, r1)
                if (r0 != 0) goto L1e
                goto L1f
            L1e:
                return
            L1f:
                com.google.common.collect.CompactHashMap r0 = r3.this$0
                K r1 = r3.key
                int r0 = com.google.common.collect.CompactHashMap.access$200(r0, r1)
                r3.lastKnownIndex = r0
                return
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public K getKey() {
                r1 = this;
                K r0 = r1.key
                return r0
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V getValue() {
                r2 = this;
                r2.updateLastKnownIndex()
                int r0 = r2.lastKnownIndex
                r1 = -1
                if (r0 != r1) goto La
                r0 = 0
                return r0
            La:
                com.google.common.collect.CompactHashMap r1 = r2.this$0
                java.lang.Object[] r1 = r1.values
                r0 = r1[r0]
                return r0
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V setValue(V r4) {
                r3 = this;
                r3.updateLastKnownIndex()
                int r0 = r3.lastKnownIndex
                r1 = -1
                if (r0 != r1) goto L11
                com.google.common.collect.CompactHashMap r0 = r3.this$0
                K r1 = r3.key
                r0.put(r1, r4)
                r4 = 0
                return r4
            L11:
                com.google.common.collect.CompactHashMap r1 = r3.this$0
                java.lang.Object[] r1 = r1.values
                r2 = r1[r0]
                r1[r0] = r4
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class ValuesView extends java.util.AbstractCollection<V> {
        final /* synthetic */ com.google.common.collect.CompactHashMap this$0;

        ValuesView(com.google.common.collect.CompactHashMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
                r1 = this;
                com.google.common.collect.CompactHashMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
                r1 = this;
                com.google.common.collect.CompactHashMap r0 = r1.this$0
                java.util.Iterator r0 = r0.valuesIterator()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
                r1 = this;
                com.google.common.collect.CompactHashMap r0 = r1.this$0
                int r0 = com.google.common.collect.CompactHashMap.access$100(r0)
                return r0
        }
    }

    CompactHashMap() {
            r2 = this;
            r2.<init>()
            r0 = 3
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.init(r0, r1)
            return
    }

    CompactHashMap(int r2) {
            r1 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r2, r0)
            return
    }

    CompactHashMap(int r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.init(r1, r2)
            return
    }

    static /* synthetic */ java.lang.Object access$000(com.google.common.collect.CompactHashMap r0, int r1) {
            java.lang.Object r0 = r0.removeEntry(r1)
            return r0
    }

    static /* synthetic */ int access$100(com.google.common.collect.CompactHashMap r0) {
            int r0 = r0.size
            return r0
    }

    static /* synthetic */ int access$200(com.google.common.collect.CompactHashMap r0, java.lang.Object r1) {
            int r0 = r0.indexOf(r1)
            return r0
    }

    public static <K, V> com.google.common.collect.CompactHashMap<K, V> create() {
            com.google.common.collect.CompactHashMap r0 = new com.google.common.collect.CompactHashMap
            r0.<init>()
            return r0
    }

    public static <K, V> com.google.common.collect.CompactHashMap<K, V> createWithExpectedSize(int r1) {
            com.google.common.collect.CompactHashMap r0 = new com.google.common.collect.CompactHashMap
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

    private int indexOf(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r6) {
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

    private void readObject(java.io.ObjectInputStream r4) throws java.io.IOException, java.lang.ClassNotFoundException {
            r3 = this;
            r4.defaultReadObject()
            r0 = 3
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.init(r0, r1)
            int r0 = r4.readInt()
        Ld:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L1d
            java.lang.Object r1 = r4.readObject()
            java.lang.Object r2 = r4.readObject()
            r3.put(r1, r2)
            goto Ld
        L1d:
            return
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private V remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r10, int r11) {
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
            java.lang.Object[] r10 = r9.values
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

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    private V removeEntry(int r5) {
            r4 = this;
            java.lang.Object[] r0 = r4.keys
            r0 = r0[r5]
            long[] r1 = r4.entries
            r2 = r1[r5]
            int r5 = getHash(r2)
            java.lang.Object r5 = r4.remove(r0, r5)
            return r5
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
            r0 = 0
        L9:
            int r1 = r2.size
            if (r0 >= r1) goto L1e
            java.lang.Object[] r1 = r2.keys
            r1 = r1[r0]
            r3.writeObject(r1)
            java.lang.Object[] r1 = r2.values
            r1 = r1[r0]
            r3.writeObject(r1)
            int r0 = r0 + 1
            goto L9
        L1e:
            return
    }

    void accessEntry(int r1) {
            r0 = this;
            return
    }

    int adjustAfterRemove(int r1, int r2) {
            r0 = this;
            int r1 = r1 + (-1)
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
            r5 = this;
            int r0 = r5.modCount
            int r0 = r0 + 1
            r5.modCount = r0
            java.lang.Object[] r0 = r5.keys
            int r1 = r5.size
            r2 = 0
            r3 = 0
            java.util.Arrays.fill(r0, r2, r1, r3)
            java.lang.Object[] r0 = r5.values
            int r1 = r5.size
            java.util.Arrays.fill(r0, r2, r1, r3)
            int[] r0 = r5.table
            r1 = -1
            java.util.Arrays.fill(r0, r1)
            long[] r0 = r5.entries
            r3 = -1
            java.util.Arrays.fill(r0, r3)
            r5.size = r2
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
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

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r3.size
            if (r1 >= r2) goto L15
            java.lang.Object[] r2 = r3.values
            r2 = r2[r1]
            boolean r2 = com.google.common.base.Objects.equal(r4, r2)
            if (r2 == 0) goto L12
            r4 = 1
            return r4
        L12:
            int r1 = r1 + 1
            goto L2
        L15:
            return r0
    }

    java.util.Set<java.util.Map.Entry<K, V>> createEntrySet() {
            r1 = this;
            com.google.common.collect.CompactHashMap$EntrySetView r0 = new com.google.common.collect.CompactHashMap$EntrySetView
            r0.<init>(r1)
            return r0
    }

    java.util.Set<K> createKeySet() {
            r1 = this;
            com.google.common.collect.CompactHashMap$KeySetView r0 = new com.google.common.collect.CompactHashMap$KeySetView
            r0.<init>(r1)
            return r0
    }

    java.util.Collection<V> createValues() {
            r1 = this;
            com.google.common.collect.CompactHashMap$ValuesView r0 = new com.google.common.collect.CompactHashMap$ValuesView
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            java.util.Set<java.util.Map$Entry<K, V>> r0 = r1.entrySetView
            if (r0 != 0) goto La
            java.util.Set r0 = r1.createEntrySet()
            r1.entrySetView = r0
        La:
            return r0
    }

    java.util.Iterator<java.util.Map.Entry<K, V>> entrySetIterator() {
            r1 = this;
            com.google.common.collect.CompactHashMap$2 r0 = new com.google.common.collect.CompactHashMap$2
            r0.<init>(r1)
            return r0
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

    @Override // java.util.AbstractMap, java.util.Map
    public V get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            int r2 = r1.indexOf(r2)
            r1.accessEntry(r2)
            r0 = -1
            if (r2 != r0) goto Lc
            r2 = 0
            return r2
        Lc:
            java.lang.Object[] r0 = r1.values
            r2 = r0[r2]
            return r2
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
            r4.keys = r2
            java.lang.Object[] r2 = new java.lang.Object[r5]
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

    void insertEntry(int r6, @org.checkerframework.checker.nullness.compatqual.NullableDecl K r7, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r8, int r9) {
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
            java.lang.Object[] r7 = r5.values
            r7[r6] = r8
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
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

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<K> keySet() {
            r1 = this;
            java.util.Set<K> r0 = r1.keySetView
            if (r0 != 0) goto La
            java.util.Set r0 = r1.createKeySet()
            r1.keySetView = r0
        La:
            return r0
    }

    java.util.Iterator<K> keySetIterator() {
            r1 = this;
            com.google.common.collect.CompactHashMap$1 r0 = new com.google.common.collect.CompactHashMap$1
            r0.<init>(r1)
            return r0
    }

    void moveLastEntry(int r8) {
            r7 = this;
            int r0 = r7.size()
            int r0 = r0 + (-1)
            r1 = -1
            r3 = 0
            if (r8 >= r0) goto L4a
            java.lang.Object[] r4 = r7.keys
            r5 = r4[r0]
            r4[r8] = r5
            java.lang.Object[] r5 = r7.values
            r6 = r5[r0]
            r5[r8] = r6
            r4[r0] = r3
            r5[r0] = r3
            long[] r3 = r7.entries
            r4 = r3[r0]
            r3[r8] = r4
            r3[r0] = r1
            int r1 = getHash(r4)
            int r2 = r7.hashTableMask()
            r1 = r1 & r2
            int[] r2 = r7.table
            r3 = r2[r1]
            if (r3 != r0) goto L35
            r2[r1] = r8
            return
        L35:
            long[] r1 = r7.entries
            r4 = r1[r3]
            int r1 = getNext(r4)
            if (r1 != r0) goto L48
            long[] r0 = r7.entries
            long r1 = swapNext(r4, r8)
            r0[r3] = r1
            return
        L48:
            r3 = r1
            goto L35
        L4a:
            java.lang.Object[] r0 = r7.keys
            r0[r8] = r3
            java.lang.Object[] r0 = r7.values
            r0[r8] = r3
            long[] r0 = r7.entries
            r0[r8] = r1
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public V put(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r12, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r13) {
            r11 = this;
            long[] r0 = r11.entries
            java.lang.Object[] r1 = r11.keys
            java.lang.Object[] r2 = r11.values
            int r3 = com.google.common.collect.Hashing.smearedHash(r12)
            int r4 = r11.hashTableMask()
            r4 = r4 & r3
            int r5 = r11.size
            int[] r6 = r11.table
            r7 = r6[r4]
            r8 = -1
            if (r7 != r8) goto L1b
            r6[r4] = r5
            goto L3f
        L1b:
            r9 = r0[r7]
            int r4 = getHash(r9)
            if (r4 != r3) goto L33
            r4 = r1[r7]
            boolean r4 = com.google.common.base.Objects.equal(r12, r4)
            if (r4 == 0) goto L33
            r12 = r2[r7]
            r2[r7] = r13
            r11.accessEntry(r7)
            return r12
        L33:
            int r4 = getNext(r9)
            if (r4 != r8) goto L6a
            long r1 = swapNext(r9, r5)
            r0[r7] = r1
        L3f:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r0) goto L62
            int r0 = r5 + 1
            r11.resizeMeMaybe(r0)
            r11.insertEntry(r5, r12, r13, r3)
            r11.size = r0
            int r12 = r11.threshold
            if (r5 < r12) goto L5a
            int[] r12 = r11.table
            int r12 = r12.length
            int r12 = r12 * 2
            r11.resizeTable(r12)
        L5a:
            int r12 = r11.modCount
            int r12 = r12 + 1
            r11.modCount = r12
            r12 = 0
            return r12
        L62:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Cannot contain more than Integer.MAX_VALUE elements!"
            r12.<init>(r13)
            throw r12
        L6a:
            r7 = r4
            goto L1b
    }

    @Override // java.util.AbstractMap, java.util.Map
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public V remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            int r0 = com.google.common.collect.Hashing.smearedHash(r2)
            java.lang.Object r2 = r1.remove(r2, r0)
            return r2
    }

    void resizeEntries(int r5) {
            r4 = this;
            java.lang.Object[] r0 = r4.keys
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            r4.keys = r0
            java.lang.Object[] r0 = r4.values
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
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

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
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

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Collection<V> values() {
            r1 = this;
            java.util.Collection<V> r0 = r1.valuesView
            if (r0 != 0) goto La
            java.util.Collection r0 = r1.createValues()
            r1.valuesView = r0
        La:
            return r0
    }

    java.util.Iterator<V> valuesIterator() {
            r1 = this;
            com.google.common.collect.CompactHashMap$3 r0 = new com.google.common.collect.CompactHashMap$3
            r0.<init>(r1)
            return r0
    }
}
