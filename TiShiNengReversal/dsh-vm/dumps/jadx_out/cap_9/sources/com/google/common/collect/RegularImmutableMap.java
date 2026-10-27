package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class RegularImmutableMap<K, V> extends com.google.common.collect.ImmutableMap<K, V> {
    private static final int ABSENT = -1;
    static final com.google.common.collect.ImmutableMap<java.lang.Object, java.lang.Object> EMPTY = null;
    private static final long serialVersionUID = 0;

    @com.google.common.annotations.VisibleForTesting
    final transient java.lang.Object[] alternatingKeysAndValues;
    private final transient int[] hashTable;
    private final transient int size;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class EntrySet<K, V> extends com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> {
        private final transient java.lang.Object[] alternatingKeysAndValues;
        private final transient int keyOffset;
        private final transient com.google.common.collect.ImmutableMap<K, V> map;
        private final transient int size;


        EntrySet(com.google.common.collect.ImmutableMap<K, V> r1, java.lang.Object[] r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.map = r1
                r0.alternatingKeysAndValues = r2
                r0.keyOffset = r3
                r0.size = r4
                return
        }

        static /* synthetic */ int access$000(com.google.common.collect.RegularImmutableMap.EntrySet r0) {
                int r0 = r0.size
                return r0
        }

        static /* synthetic */ java.lang.Object[] access$100(com.google.common.collect.RegularImmutableMap.EntrySet r0) {
                java.lang.Object[] r0 = r0.alternatingKeysAndValues
                return r0
        }

        static /* synthetic */ int access$200(com.google.common.collect.RegularImmutableMap.EntrySet r0) {
                int r0 = r0.keyOffset
                return r0
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L1f
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                java.lang.Object r4 = r4.getValue()
                if (r4 == 0) goto L1f
                com.google.common.collect.ImmutableMap<K, V> r2 = r3.map
                java.lang.Object r0 = r2.get(r0)
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L1f
                r4 = 1
                return r4
            L1f:
                return r1
        }

        @Override // com.google.common.collect.ImmutableCollection
        int copyIntoArray(java.lang.Object[] r2, int r3) {
                r1 = this;
                com.google.common.collect.ImmutableList r0 = r1.asList()
                int r2 = r0.copyIntoArray(r2, r3)
                return r2
        }

        @Override // com.google.common.collect.ImmutableSet
        com.google.common.collect.ImmutableList<java.util.Map.Entry<K, V>> createAsList() {
                r1 = this;
                com.google.common.collect.RegularImmutableMap$EntrySet$1 r0 = new com.google.common.collect.RegularImmutableMap$EntrySet$1
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> iterator() {
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

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class KeySet<K> extends com.google.common.collect.ImmutableSet<K> {
        private final transient com.google.common.collect.ImmutableList<K> list;
        private final transient com.google.common.collect.ImmutableMap<K, ?> map;

        KeySet(com.google.common.collect.ImmutableMap<K, ?> r1, com.google.common.collect.ImmutableList<K> r2) {
                r0 = this;
                r0.<init>()
                r0.map = r1
                r0.list = r2
                return
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public com.google.common.collect.ImmutableList<K> asList() {
                r1 = this;
                com.google.common.collect.ImmutableList<K> r0 = r1.list
                return r0
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.ImmutableMap<K, ?> r0 = r1.map
                java.lang.Object r2 = r0.get(r2)
                if (r2 == 0) goto La
                r2 = 1
                return r2
            La:
                r2 = 0
                return r2
        }

        @Override // com.google.common.collect.ImmutableCollection
        int copyIntoArray(java.lang.Object[] r2, int r3) {
                r1 = this;
                com.google.common.collect.ImmutableList r0 = r1.asList()
                int r2 = r0.copyIntoArray(r2, r3)
                return r2
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public com.google.common.collect.UnmodifiableIterator<K> iterator() {
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
                com.google.common.collect.ImmutableMap<K, ?> r0 = r1.map
                int r0 = r0.size()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class KeysOrValuesAsList extends com.google.common.collect.ImmutableList<java.lang.Object> {
        private final transient java.lang.Object[] alternatingKeysAndValues;
        private final transient int offset;
        private final transient int size;

        KeysOrValuesAsList(java.lang.Object[] r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.alternatingKeysAndValues = r1
                r0.offset = r2
                r0.size = r3
                return
        }

        @Override // java.util.List
        public java.lang.Object get(int r3) {
                r2 = this;
                int r0 = r2.size
                com.google.common.base.Preconditions.checkElementIndex(r3, r0)
                java.lang.Object[] r0 = r2.alternatingKeysAndValues
                int r3 = r3 * 2
                int r1 = r2.offset
                int r3 = r3 + r1
                r3 = r0[r3]
                return r3
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                int r0 = r1.size
                return r0
        }
    }

    static {
            com.google.common.collect.RegularImmutableMap r0 = new com.google.common.collect.RegularImmutableMap
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r0.<init>(r3, r2, r1)
            com.google.common.collect.RegularImmutableMap.EMPTY = r0
            return
    }

    private RegularImmutableMap(int[] r1, java.lang.Object[] r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.hashTable = r1
            r0.alternatingKeysAndValues = r2
            r0.size = r3
            return
    }

    static <K, V> com.google.common.collect.RegularImmutableMap<K, V> create(int r3, java.lang.Object[] r4) {
            if (r3 != 0) goto L7
            com.google.common.collect.ImmutableMap<java.lang.Object, java.lang.Object> r3 = com.google.common.collect.RegularImmutableMap.EMPTY
            com.google.common.collect.RegularImmutableMap r3 = (com.google.common.collect.RegularImmutableMap) r3
            return r3
        L7:
            r0 = 0
            r1 = 1
            if (r3 != r1) goto L19
            r3 = r4[r0]
            r0 = r4[r1]
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r3, r0)
            com.google.common.collect.RegularImmutableMap r3 = new com.google.common.collect.RegularImmutableMap
            r0 = 0
            r3.<init>(r0, r4, r1)
            return r3
        L19:
            int r2 = r4.length
            int r1 = r2 >> 1
            com.google.common.base.Preconditions.checkPositionIndex(r3, r1)
            int r1 = com.google.common.collect.ImmutableSet.chooseTableSize(r3)
            int[] r0 = createHashTable(r4, r3, r1, r0)
            com.google.common.collect.RegularImmutableMap r1 = new com.google.common.collect.RegularImmutableMap
            r1.<init>(r0, r4, r3)
            return r1
    }

    static int[] createHashTable(java.lang.Object[] r10, int r11, int r12, int r13) {
            r0 = 1
            if (r11 != r0) goto Le
            r11 = r10[r13]
            r12 = r13 ^ 1
            r10 = r10[r12]
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r11, r10)
            r10 = 0
            return r10
        Le:
            int r1 = r12 + (-1)
            int[] r12 = new int[r12]
            r2 = -1
            java.util.Arrays.fill(r12, r2)
            r3 = 0
        L17:
            if (r3 >= r11) goto L77
            int r4 = r3 * 2
            int r5 = r4 + r13
            r6 = r10[r5]
            r7 = r13 ^ 1
            int r4 = r4 + r7
            r4 = r10[r4]
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r6, r4)
            int r7 = r6.hashCode()
            int r7 = com.google.common.collect.Hashing.smear(r7)
        L2f:
            r7 = r7 & r1
            r8 = r12[r7]
            if (r8 != r2) goto L39
            r12[r7] = r5
            int r3 = r3 + 1
            goto L17
        L39:
            r9 = r10[r8]
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L44
            int r7 = r7 + 1
            goto L2f
        L44:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Multiple entries with same key: "
            r12.append(r13)
            r12.append(r6)
            java.lang.String r13 = "="
            r12.append(r13)
            r12.append(r4)
            java.lang.String r1 = " and "
            r12.append(r1)
            r1 = r10[r8]
            r12.append(r1)
            r12.append(r13)
            r13 = r8 ^ 1
            r10 = r10[r13]
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L77:
            return r12
    }

    static java.lang.Object get(@org.checkerframework.checker.nullness.compatqual.NullableDecl int[] r4, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object[] r5, int r6, int r7, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r8) {
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r6 != r1) goto L15
            r4 = r5[r7]
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L14
            r4 = r7 ^ 1
            r4 = r5[r4]
            return r4
        L14:
            return r0
        L15:
            if (r4 != 0) goto L18
            return r0
        L18:
            int r6 = r4.length
            int r6 = r6 - r1
            int r7 = r8.hashCode()
            int r7 = com.google.common.collect.Hashing.smear(r7)
        L22:
            r7 = r7 & r6
            r2 = r4[r7]
            r3 = -1
            if (r2 != r3) goto L29
            return r0
        L29:
            r3 = r5[r2]
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L36
            r4 = r2 ^ 1
            r4 = r5[r4]
            return r4
        L36:
            int r7 = r7 + 1
            goto L22
    }

    @Override // com.google.common.collect.ImmutableMap
    com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> createEntrySet() {
            r4 = this;
            com.google.common.collect.RegularImmutableMap$EntrySet r0 = new com.google.common.collect.RegularImmutableMap$EntrySet
            java.lang.Object[] r1 = r4.alternatingKeysAndValues
            r2 = 0
            int r3 = r4.size
            r0.<init>(r4, r1, r2, r3)
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap
    com.google.common.collect.ImmutableSet<K> createKeySet() {
            r4 = this;
            com.google.common.collect.RegularImmutableMap$KeysOrValuesAsList r0 = new com.google.common.collect.RegularImmutableMap$KeysOrValuesAsList
            java.lang.Object[] r1 = r4.alternatingKeysAndValues
            r2 = 0
            int r3 = r4.size
            r0.<init>(r1, r2, r3)
            com.google.common.collect.RegularImmutableMap$KeySet r1 = new com.google.common.collect.RegularImmutableMap$KeySet
            r1.<init>(r4, r0)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMap
    com.google.common.collect.ImmutableCollection<V> createValues() {
            r4 = this;
            com.google.common.collect.RegularImmutableMap$KeysOrValuesAsList r0 = new com.google.common.collect.RegularImmutableMap$KeysOrValuesAsList
            java.lang.Object[] r1 = r4.alternatingKeysAndValues
            r2 = 1
            int r3 = r4.size
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public V get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r5) {
            r4 = this;
            int[] r0 = r4.hashTable
            java.lang.Object[] r1 = r4.alternatingKeysAndValues
            int r2 = r4.size
            r3 = 0
            java.lang.Object r5 = get(r0, r1, r2, r3, r5)
            return r5
    }

    @Override // com.google.common.collect.ImmutableMap
    boolean isPartialView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Map
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }
}
