package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.errorprone.annotations.Immutable(containerOf = {"R", "C", "V"})
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class DenseImmutableTable<R, C, V> extends com.google.common.collect.RegularImmutableTable<R, C, V> {
    private final int[] cellColumnIndices;
    private final int[] cellRowIndices;
    private final int[] columnCounts;
    private final com.google.common.collect.ImmutableMap<C, java.lang.Integer> columnKeyToIndex;
    private final com.google.common.collect.ImmutableMap<C, com.google.common.collect.ImmutableMap<R, V>> columnMap;
    private final int[] rowCounts;
    private final com.google.common.collect.ImmutableMap<R, java.lang.Integer> rowKeyToIndex;
    private final com.google.common.collect.ImmutableMap<R, com.google.common.collect.ImmutableMap<C, V>> rowMap;
    private final V[][] values;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.collect.DenseImmutableTable$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class Column extends com.google.common.collect.DenseImmutableTable.ImmutableArrayMap<R, V> {
        private final int columnIndex;
        final /* synthetic */ com.google.common.collect.DenseImmutableTable this$0;

        Column(com.google.common.collect.DenseImmutableTable r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                int[] r1 = com.google.common.collect.DenseImmutableTable.access$500(r1)
                r1 = r1[r2]
                r0.<init>(r1)
                r0.columnIndex = r2
                return
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        V getValue(int r2) {
                r1 = this;
                com.google.common.collect.DenseImmutableTable r0 = r1.this$0
                java.lang.Object[][] r0 = com.google.common.collect.DenseImmutableTable.access$400(r0)
                r2 = r0[r2]
                int r0 = r1.columnIndex
                r2 = r2[r0]
                return r2
        }

        @Override // com.google.common.collect.ImmutableMap
        boolean isPartialView() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        com.google.common.collect.ImmutableMap<R, java.lang.Integer> keyToIndex() {
                r1 = this;
                com.google.common.collect.DenseImmutableTable r0 = r1.this$0
                com.google.common.collect.ImmutableMap r0 = com.google.common.collect.DenseImmutableTable.access$600(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class ColumnMap extends com.google.common.collect.DenseImmutableTable.ImmutableArrayMap<C, com.google.common.collect.ImmutableMap<R, V>> {
        final /* synthetic */ com.google.common.collect.DenseImmutableTable this$0;

        private ColumnMap(com.google.common.collect.DenseImmutableTable r1) {
                r0 = this;
                r0.this$0 = r1
                int[] r1 = com.google.common.collect.DenseImmutableTable.access$500(r1)
                int r1 = r1.length
                r0.<init>(r1)
                return
        }

        /* synthetic */ ColumnMap(com.google.common.collect.DenseImmutableTable r1, com.google.common.collect.DenseImmutableTable.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        com.google.common.collect.ImmutableMap<R, V> getValue(int r3) {
                r2 = this;
                com.google.common.collect.DenseImmutableTable$Column r0 = new com.google.common.collect.DenseImmutableTable$Column
                com.google.common.collect.DenseImmutableTable r1 = r2.this$0
                r0.<init>(r1, r3)
                return r0
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        /* bridge */ /* synthetic */ java.lang.Object getValue(int r1) {
                r0 = this;
                com.google.common.collect.ImmutableMap r1 = r0.getValue(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMap
        boolean isPartialView() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        com.google.common.collect.ImmutableMap<C, java.lang.Integer> keyToIndex() {
                r1 = this;
                com.google.common.collect.DenseImmutableTable r0 = r1.this$0
                com.google.common.collect.ImmutableMap r0 = com.google.common.collect.DenseImmutableTable.access$300(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static abstract class ImmutableArrayMap<K, V> extends com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap<K, V> {
        private final int size;


        ImmutableArrayMap(int r1) {
                r0 = this;
                r0.<init>()
                r0.size = r1
                return
        }

        private boolean isFull() {
                r2 = this;
                int r0 = r2.size
                com.google.common.collect.ImmutableMap r1 = r2.keyToIndex()
                int r1 = r1.size()
                if (r0 != r1) goto Le
                r0 = 1
                return r0
            Le:
                r0 = 0
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        com.google.common.collect.ImmutableSet<K> createKeySet() {
                r1 = this;
                boolean r0 = r1.isFull()
                if (r0 == 0) goto Lf
                com.google.common.collect.ImmutableMap r0 = r1.keyToIndex()
                com.google.common.collect.ImmutableSet r0 = r0.keySet()
                return r0
            Lf:
                com.google.common.collect.ImmutableSet r0 = super.createKeySet()
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> entryIterator() {
                r1 = this;
                com.google.common.collect.DenseImmutableTable$ImmutableArrayMap$1 r0 = new com.google.common.collect.DenseImmutableTable$ImmutableArrayMap$1
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public V get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.ImmutableMap r0 = r1.keyToIndex()
                java.lang.Object r2 = r0.get(r2)
                java.lang.Integer r2 = (java.lang.Integer) r2
                if (r2 != 0) goto Le
                r2 = 0
                return r2
            Le:
                int r2 = r2.intValue()
                java.lang.Object r2 = r1.getValue(r2)
                return r2
        }

        K getKey(int r2) {
                r1 = this;
                com.google.common.collect.ImmutableMap r0 = r1.keyToIndex()
                com.google.common.collect.ImmutableSet r0 = r0.keySet()
                com.google.common.collect.ImmutableList r0 = r0.asList()
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        abstract V getValue(int r1);

        abstract com.google.common.collect.ImmutableMap<K, java.lang.Integer> keyToIndex();

        @Override // java.util.Map
        public int size() {
                r1 = this;
                int r0 = r1.size
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class Row extends com.google.common.collect.DenseImmutableTable.ImmutableArrayMap<C, V> {
        private final int rowIndex;
        final /* synthetic */ com.google.common.collect.DenseImmutableTable this$0;

        Row(com.google.common.collect.DenseImmutableTable r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                int[] r1 = com.google.common.collect.DenseImmutableTable.access$200(r1)
                r1 = r1[r2]
                r0.<init>(r1)
                r0.rowIndex = r2
                return
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        V getValue(int r3) {
                r2 = this;
                com.google.common.collect.DenseImmutableTable r0 = r2.this$0
                java.lang.Object[][] r0 = com.google.common.collect.DenseImmutableTable.access$400(r0)
                int r1 = r2.rowIndex
                r0 = r0[r1]
                r3 = r0[r3]
                return r3
        }

        @Override // com.google.common.collect.ImmutableMap
        boolean isPartialView() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        com.google.common.collect.ImmutableMap<C, java.lang.Integer> keyToIndex() {
                r1 = this;
                com.google.common.collect.DenseImmutableTable r0 = r1.this$0
                com.google.common.collect.ImmutableMap r0 = com.google.common.collect.DenseImmutableTable.access$300(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class RowMap extends com.google.common.collect.DenseImmutableTable.ImmutableArrayMap<R, com.google.common.collect.ImmutableMap<C, V>> {
        final /* synthetic */ com.google.common.collect.DenseImmutableTable this$0;

        private RowMap(com.google.common.collect.DenseImmutableTable r1) {
                r0 = this;
                r0.this$0 = r1
                int[] r1 = com.google.common.collect.DenseImmutableTable.access$200(r1)
                int r1 = r1.length
                r0.<init>(r1)
                return
        }

        /* synthetic */ RowMap(com.google.common.collect.DenseImmutableTable r1, com.google.common.collect.DenseImmutableTable.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        com.google.common.collect.ImmutableMap<C, V> getValue(int r3) {
                r2 = this;
                com.google.common.collect.DenseImmutableTable$Row r0 = new com.google.common.collect.DenseImmutableTable$Row
                com.google.common.collect.DenseImmutableTable r1 = r2.this$0
                r0.<init>(r1, r3)
                return r0
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        /* bridge */ /* synthetic */ java.lang.Object getValue(int r1) {
                r0 = this;
                com.google.common.collect.ImmutableMap r1 = r0.getValue(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMap
        boolean isPartialView() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        com.google.common.collect.ImmutableMap<R, java.lang.Integer> keyToIndex() {
                r1 = this;
                com.google.common.collect.DenseImmutableTable r0 = r1.this$0
                com.google.common.collect.ImmutableMap r0 = com.google.common.collect.DenseImmutableTable.access$600(r0)
                return r0
        }
    }

    DenseImmutableTable(com.google.common.collect.ImmutableList<com.google.common.collect.Table.Cell<R, C, V>> r10, com.google.common.collect.ImmutableSet<R> r11, com.google.common.collect.ImmutableSet<C> r12) {
            r9 = this;
            r9.<init>()
            int r0 = r11.size()
            int r1 = r12.size()
            r2 = 2
            int[] r2 = new int[r2]
            r3 = 1
            r2[r3] = r1
            r1 = 0
            r2[r1] = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r2)
            java.lang.Object[][] r0 = (java.lang.Object[][]) r0
            r9.values = r0
            com.google.common.collect.ImmutableMap r11 = com.google.common.collect.Maps.indexMap(r11)
            r9.rowKeyToIndex = r11
            com.google.common.collect.ImmutableMap r12 = com.google.common.collect.Maps.indexMap(r12)
            r9.columnKeyToIndex = r12
            int r11 = r11.size()
            int[] r11 = new int[r11]
            r9.rowCounts = r11
            int r11 = r12.size()
            int[] r11 = new int[r11]
            r9.columnCounts = r11
            int r11 = r10.size()
            int[] r11 = new int[r11]
            int r12 = r10.size()
            int[] r12 = new int[r12]
        L46:
            int r0 = r10.size()
            if (r1 >= r0) goto L9e
            java.lang.Object r0 = r10.get(r1)
            com.google.common.collect.Table$Cell r0 = (com.google.common.collect.Table.Cell) r0
            java.lang.Object r2 = r0.getRowKey()
            java.lang.Object r4 = r0.getColumnKey()
            com.google.common.collect.ImmutableMap<R, java.lang.Integer> r5 = r9.rowKeyToIndex
            java.lang.Object r5 = r5.get(r2)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            com.google.common.collect.ImmutableMap<C, java.lang.Integer> r6 = r9.columnKeyToIndex
            java.lang.Object r6 = r6.get(r4)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            V[][] r7 = r9.values
            r7 = r7[r5]
            r7 = r7[r6]
            java.lang.Object r8 = r0.getValue()
            r9.checkNoDuplicate(r2, r4, r7, r8)
            V[][] r2 = r9.values
            r2 = r2[r5]
            java.lang.Object r0 = r0.getValue()
            r2[r6] = r0
            int[] r0 = r9.rowCounts
            r2 = r0[r5]
            int r2 = r2 + r3
            r0[r5] = r2
            int[] r0 = r9.columnCounts
            r2 = r0[r6]
            int r2 = r2 + r3
            r0[r6] = r2
            r11[r1] = r5
            r12[r1] = r6
            int r1 = r1 + 1
            goto L46
        L9e:
            r9.cellRowIndices = r11
            r9.cellColumnIndices = r12
            com.google.common.collect.DenseImmutableTable$RowMap r10 = new com.google.common.collect.DenseImmutableTable$RowMap
            r11 = 0
            r10.<init>(r9, r11)
            r9.rowMap = r10
            com.google.common.collect.DenseImmutableTable$ColumnMap r10 = new com.google.common.collect.DenseImmutableTable$ColumnMap
            r10.<init>(r9, r11)
            r9.columnMap = r10
            return
    }

    static /* synthetic */ int[] access$200(com.google.common.collect.DenseImmutableTable r0) {
            int[] r0 = r0.rowCounts
            return r0
    }

    static /* synthetic */ com.google.common.collect.ImmutableMap access$300(com.google.common.collect.DenseImmutableTable r0) {
            com.google.common.collect.ImmutableMap<C, java.lang.Integer> r0 = r0.columnKeyToIndex
            return r0
    }

    static /* synthetic */ java.lang.Object[][] access$400(com.google.common.collect.DenseImmutableTable r0) {
            V[][] r0 = r0.values
            return r0
    }

    static /* synthetic */ int[] access$500(com.google.common.collect.DenseImmutableTable r0) {
            int[] r0 = r0.columnCounts
            return r0
    }

    static /* synthetic */ com.google.common.collect.ImmutableMap access$600(com.google.common.collect.DenseImmutableTable r0) {
            com.google.common.collect.ImmutableMap<R, java.lang.Integer> r0 = r0.rowKeyToIndex
            return r0
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableMap<C, java.util.Map<R, V>> columnMap() {
            r1 = this;
            com.google.common.collect.ImmutableMap<C, com.google.common.collect.ImmutableMap<R, V>> r0 = r1.columnMap
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.copyOf(r0)
            return r0
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map columnMap() {
            r1 = this;
            com.google.common.collect.ImmutableMap r0 = r1.columnMap()
            return r0
    }

    @Override // com.google.common.collect.ImmutableTable
    com.google.common.collect.ImmutableTable.SerializedForm createSerializedForm() {
            r2 = this;
            int[] r0 = r2.cellRowIndices
            int[] r1 = r2.cellColumnIndices
            com.google.common.collect.ImmutableTable$SerializedForm r0 = com.google.common.collect.ImmutableTable.SerializedForm.create(r2, r0, r1)
            return r0
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public V get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
            r1 = this;
            com.google.common.collect.ImmutableMap<R, java.lang.Integer> r0 = r1.rowKeyToIndex
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            com.google.common.collect.ImmutableMap<C, java.lang.Integer> r0 = r1.columnKeyToIndex
            java.lang.Object r3 = r0.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r2 == 0) goto L24
            if (r3 != 0) goto L15
            goto L24
        L15:
            V[][] r0 = r1.values
            int r2 = r2.intValue()
            r2 = r0[r2]
            int r3 = r3.intValue()
            r2 = r2[r3]
            return r2
        L24:
            r2 = 0
            return r2
    }

    @Override // com.google.common.collect.RegularImmutableTable
    com.google.common.collect.Table.Cell<R, C, V> getCell(int r5) {
            r4 = this;
            int[] r0 = r4.cellRowIndices
            r0 = r0[r5]
            int[] r1 = r4.cellColumnIndices
            r5 = r1[r5]
            com.google.common.collect.ImmutableSet r1 = r4.rowKeySet()
            com.google.common.collect.ImmutableList r1 = r1.asList()
            java.lang.Object r1 = r1.get(r0)
            com.google.common.collect.ImmutableSet r2 = r4.columnKeySet()
            com.google.common.collect.ImmutableList r2 = r2.asList()
            java.lang.Object r2 = r2.get(r5)
            V[][] r3 = r4.values
            r0 = r3[r0]
            r5 = r0[r5]
            com.google.common.collect.Table$Cell r5 = com.google.common.collect.ImmutableTable.cellOf(r1, r2, r5)
            return r5
    }

    @Override // com.google.common.collect.RegularImmutableTable
    V getValue(int r3) {
            r2 = this;
            V[][] r0 = r2.values
            int[] r1 = r2.cellRowIndices
            r1 = r1[r3]
            r0 = r0[r1]
            int[] r1 = r2.cellColumnIndices
            r3 = r1[r3]
            r3 = r0[r3]
            return r3
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableMap<R, java.util.Map<C, V>> rowMap() {
            r1 = this;
            com.google.common.collect.ImmutableMap<R, com.google.common.collect.ImmutableMap<C, V>> r0 = r1.rowMap
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.copyOf(r0)
            return r0
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map rowMap() {
            r1 = this;
            com.google.common.collect.ImmutableMap r0 = r1.rowMap()
            return r0
    }

    @Override // com.google.common.collect.Table
    public int size() {
            r1 = this;
            int[] r0 = r1.cellRowIndices
            int r0 = r0.length
            return r0
    }
}
