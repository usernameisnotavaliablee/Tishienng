package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Tables {
    private static final com.google.common.base.Function<? extends java.util.Map<?, ?>, ? extends java.util.Map<?, ?>> UNMODIFIABLE_WRAPPER = null;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class AbstractCell<R, C, V> implements com.google.common.collect.Table.Cell<R, C, V> {
        AbstractCell() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.collect.Table.Cell
        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r5 != r4) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.google.common.collect.Table.Cell
                r2 = 0
                if (r1 == 0) goto L36
                com.google.common.collect.Table$Cell r5 = (com.google.common.collect.Table.Cell) r5
                java.lang.Object r1 = r4.getRowKey()
                java.lang.Object r3 = r5.getRowKey()
                boolean r1 = com.google.common.base.Objects.equal(r1, r3)
                if (r1 == 0) goto L36
                java.lang.Object r1 = r4.getColumnKey()
                java.lang.Object r3 = r5.getColumnKey()
                boolean r1 = com.google.common.base.Objects.equal(r1, r3)
                if (r1 == 0) goto L36
                java.lang.Object r1 = r4.getValue()
                java.lang.Object r5 = r5.getValue()
                boolean r5 = com.google.common.base.Objects.equal(r1, r5)
                if (r5 == 0) goto L36
                return r0
            L36:
                return r2
        }

        @Override // com.google.common.collect.Table.Cell
        public int hashCode() {
                r5 = this;
                java.lang.Object r0 = r5.getRowKey()
                java.lang.Object r1 = r5.getColumnKey()
                java.lang.Object r2 = r5.getValue()
                r3 = 3
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r4 = 0
                r3[r4] = r0
                r0 = 1
                r3[r0] = r1
                r0 = 2
                r3[r0] = r2
                int r0 = com.google.common.base.Objects.hashCode(r3)
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "("
                r0.append(r1)
                java.lang.Object r1 = r2.getRowKey()
                r0.append(r1)
                java.lang.String r1 = ","
                r0.append(r1)
                java.lang.Object r1 = r2.getColumnKey()
                r0.append(r1)
                java.lang.String r1 = ")="
                r0.append(r1)
                java.lang.Object r1 = r2.getValue()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ImmutableCell<R, C, V> extends com.google.common.collect.Tables.AbstractCell<R, C, V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        private final C columnKey;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        private final R rowKey;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        private final V value;

        ImmutableCell(@org.checkerframework.checker.nullness.compatqual.NullableDecl R r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl C r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r3) {
                r0 = this;
                r0.<init>()
                r0.rowKey = r1
                r0.columnKey = r2
                r0.value = r3
                return
        }

        @Override // com.google.common.collect.Table.Cell
        public C getColumnKey() {
                r1 = this;
                C r0 = r1.columnKey
                return r0
        }

        @Override // com.google.common.collect.Table.Cell
        public R getRowKey() {
                r1 = this;
                R r0 = r1.rowKey
                return r0
        }

        @Override // com.google.common.collect.Table.Cell
        public V getValue() {
                r1 = this;
                V r0 = r1.value
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class TransformedTable<R, C, V1, V2> extends com.google.common.collect.AbstractTable<R, C, V2> {
        final com.google.common.collect.Table<R, C, V1> fromTable;
        final com.google.common.base.Function<? super V1, V2> function;




        TransformedTable(com.google.common.collect.Table<R, C, V1> r1, com.google.common.base.Function<? super V1, V2> r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.collect.Table r1 = (com.google.common.collect.Table) r1
                r0.fromTable = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.base.Function r1 = (com.google.common.base.Function) r1
                r0.function = r1
                return
        }

        com.google.common.base.Function<com.google.common.collect.Table.Cell<R, C, V1>, com.google.common.collect.Table.Cell<R, C, V2>> cellFunction() {
                r1 = this;
                com.google.common.collect.Tables$TransformedTable$1 r0 = new com.google.common.collect.Tables$TransformedTable$1
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.collect.AbstractTable
        java.util.Iterator<com.google.common.collect.Table.Cell<R, C, V2>> cellIterator() {
                r2 = this;
                com.google.common.collect.Table<R, C, V1> r0 = r2.fromTable
                java.util.Set r0 = r0.cellSet()
                java.util.Iterator r0 = r0.iterator()
                com.google.common.base.Function r1 = r2.cellFunction()
                java.util.Iterator r0 = com.google.common.collect.Iterators.transform(r0, r1)
                return r0
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public void clear() {
                r1 = this;
                com.google.common.collect.Table<R, C, V1> r0 = r1.fromTable
                r0.clear()
                return
        }

        @Override // com.google.common.collect.Table
        public java.util.Map<R, V2> column(C r2) {
                r1 = this;
                com.google.common.collect.Table<R, C, V1> r0 = r1.fromTable
                java.util.Map r2 = r0.column(r2)
                com.google.common.base.Function<? super V1, V2> r0 = r1.function
                java.util.Map r2 = com.google.common.collect.Maps.transformValues(r2, r0)
                return r2
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public java.util.Set<C> columnKeySet() {
                r1 = this;
                com.google.common.collect.Table<R, C, V1> r0 = r1.fromTable
                java.util.Set r0 = r0.columnKeySet()
                return r0
        }

        @Override // com.google.common.collect.Table
        public java.util.Map<C, java.util.Map<R, V2>> columnMap() {
                r2 = this;
                com.google.common.collect.Tables$TransformedTable$3 r0 = new com.google.common.collect.Tables$TransformedTable$3
                r0.<init>(r2)
                com.google.common.collect.Table<R, C, V1> r1 = r2.fromTable
                java.util.Map r1 = r1.columnMap()
                java.util.Map r0 = com.google.common.collect.Maps.transformValues(r1, r0)
                return r0
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public boolean contains(java.lang.Object r2, java.lang.Object r3) {
                r1 = this;
                com.google.common.collect.Table<R, C, V1> r0 = r1.fromTable
                boolean r2 = r0.contains(r2, r3)
                return r2
        }

        @Override // com.google.common.collect.AbstractTable
        java.util.Collection<V2> createValues() {
                r2 = this;
                com.google.common.collect.Table<R, C, V1> r0 = r2.fromTable
                java.util.Collection r0 = r0.values()
                com.google.common.base.Function<? super V1, V2> r1 = r2.function
                java.util.Collection r0 = com.google.common.collect.Collections2.transform(r0, r1)
                return r0
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public V2 get(java.lang.Object r3, java.lang.Object r4) {
                r2 = this;
                boolean r0 = r2.contains(r3, r4)
                if (r0 == 0) goto L13
                com.google.common.base.Function<? super V1, V2> r0 = r2.function
                com.google.common.collect.Table<R, C, V1> r1 = r2.fromTable
                java.lang.Object r3 = r1.get(r3, r4)
                java.lang.Object r3 = r0.apply(r3)
                return r3
            L13:
                r3 = 0
                return r3
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public V2 put(R r1, C r2, V2 r3) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public void putAll(com.google.common.collect.Table<? extends R, ? extends C, ? extends V2> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public V2 remove(java.lang.Object r3, java.lang.Object r4) {
                r2 = this;
                boolean r0 = r2.contains(r3, r4)
                if (r0 == 0) goto L13
                com.google.common.base.Function<? super V1, V2> r0 = r2.function
                com.google.common.collect.Table<R, C, V1> r1 = r2.fromTable
                java.lang.Object r3 = r1.remove(r3, r4)
                java.lang.Object r3 = r0.apply(r3)
                return r3
            L13:
                r3 = 0
                return r3
        }

        @Override // com.google.common.collect.Table
        public java.util.Map<C, V2> row(R r2) {
                r1 = this;
                com.google.common.collect.Table<R, C, V1> r0 = r1.fromTable
                java.util.Map r2 = r0.row(r2)
                com.google.common.base.Function<? super V1, V2> r0 = r1.function
                java.util.Map r2 = com.google.common.collect.Maps.transformValues(r2, r0)
                return r2
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public java.util.Set<R> rowKeySet() {
                r1 = this;
                com.google.common.collect.Table<R, C, V1> r0 = r1.fromTable
                java.util.Set r0 = r0.rowKeySet()
                return r0
        }

        @Override // com.google.common.collect.Table
        public java.util.Map<R, java.util.Map<C, V2>> rowMap() {
                r2 = this;
                com.google.common.collect.Tables$TransformedTable$2 r0 = new com.google.common.collect.Tables$TransformedTable$2
                r0.<init>(r2)
                com.google.common.collect.Table<R, C, V1> r1 = r2.fromTable
                java.util.Map r1 = r1.rowMap()
                java.util.Map r0 = com.google.common.collect.Maps.transformValues(r1, r0)
                return r0
        }

        @Override // com.google.common.collect.Table
        public int size() {
                r1 = this;
                com.google.common.collect.Table<R, C, V1> r0 = r1.fromTable
                int r0 = r0.size()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class TransposeTable<C, R, V> extends com.google.common.collect.AbstractTable<C, R, V> {
        private static final com.google.common.base.Function<com.google.common.collect.Table.Cell<?, ?, ?>, com.google.common.collect.Table.Cell<?, ?, ?>> TRANSPOSE_CELL = null;
        final com.google.common.collect.Table<R, C, V> original;


        static {
                com.google.common.collect.Tables$TransposeTable$1 r0 = new com.google.common.collect.Tables$TransposeTable$1
                r0.<init>()
                com.google.common.collect.Tables.TransposeTable.TRANSPOSE_CELL = r0
                return
        }

        TransposeTable(com.google.common.collect.Table<R, C, V> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.collect.Table r1 = (com.google.common.collect.Table) r1
                r0.original = r1
                return
        }

        @Override // com.google.common.collect.AbstractTable
        java.util.Iterator<com.google.common.collect.Table.Cell<C, R, V>> cellIterator() {
                r2 = this;
                com.google.common.collect.Table<R, C, V> r0 = r2.original
                java.util.Set r0 = r0.cellSet()
                java.util.Iterator r0 = r0.iterator()
                com.google.common.base.Function<com.google.common.collect.Table$Cell<?, ?, ?>, com.google.common.collect.Table$Cell<?, ?, ?>> r1 = com.google.common.collect.Tables.TransposeTable.TRANSPOSE_CELL
                java.util.Iterator r0 = com.google.common.collect.Iterators.transform(r0, r1)
                return r0
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public void clear() {
                r1 = this;
                com.google.common.collect.Table<R, C, V> r0 = r1.original
                r0.clear()
                return
        }

        @Override // com.google.common.collect.Table
        public java.util.Map<C, V> column(R r2) {
                r1 = this;
                com.google.common.collect.Table<R, C, V> r0 = r1.original
                java.util.Map r2 = r0.row(r2)
                return r2
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public java.util.Set<R> columnKeySet() {
                r1 = this;
                com.google.common.collect.Table<R, C, V> r0 = r1.original
                java.util.Set r0 = r0.rowKeySet()
                return r0
        }

        @Override // com.google.common.collect.Table
        public java.util.Map<R, java.util.Map<C, V>> columnMap() {
                r1 = this;
                com.google.common.collect.Table<R, C, V> r0 = r1.original
                java.util.Map r0 = r0.rowMap()
                return r0
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
                r1 = this;
                com.google.common.collect.Table<R, C, V> r0 = r1.original
                boolean r2 = r0.contains(r3, r2)
                return r2
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public boolean containsColumn(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.Table<R, C, V> r0 = r1.original
                boolean r2 = r0.containsRow(r2)
                return r2
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public boolean containsRow(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.Table<R, C, V> r0 = r1.original
                boolean r2 = r0.containsColumn(r2)
                return r2
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public boolean containsValue(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.Table<R, C, V> r0 = r1.original
                boolean r2 = r0.containsValue(r2)
                return r2
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public V get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
                r1 = this;
                com.google.common.collect.Table<R, C, V> r0 = r1.original
                java.lang.Object r2 = r0.get(r3, r2)
                return r2
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public V put(C r2, R r3, V r4) {
                r1 = this;
                com.google.common.collect.Table<R, C, V> r0 = r1.original
                java.lang.Object r2 = r0.put(r3, r2, r4)
                return r2
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public void putAll(com.google.common.collect.Table<? extends C, ? extends R, ? extends V> r2) {
                r1 = this;
                com.google.common.collect.Table<R, C, V> r0 = r1.original
                com.google.common.collect.Table r2 = com.google.common.collect.Tables.transpose(r2)
                r0.putAll(r2)
                return
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public V remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
                r1 = this;
                com.google.common.collect.Table<R, C, V> r0 = r1.original
                java.lang.Object r2 = r0.remove(r3, r2)
                return r2
        }

        @Override // com.google.common.collect.Table
        public java.util.Map<R, V> row(C r2) {
                r1 = this;
                com.google.common.collect.Table<R, C, V> r0 = r1.original
                java.util.Map r2 = r0.column(r2)
                return r2
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public java.util.Set<C> rowKeySet() {
                r1 = this;
                com.google.common.collect.Table<R, C, V> r0 = r1.original
                java.util.Set r0 = r0.columnKeySet()
                return r0
        }

        @Override // com.google.common.collect.Table
        public java.util.Map<C, java.util.Map<R, V>> rowMap() {
                r1 = this;
                com.google.common.collect.Table<R, C, V> r0 = r1.original
                java.util.Map r0 = r0.columnMap()
                return r0
        }

        @Override // com.google.common.collect.Table
        public int size() {
                r1 = this;
                com.google.common.collect.Table<R, C, V> r0 = r1.original
                int r0 = r0.size()
                return r0
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public java.util.Collection<V> values() {
                r1 = this;
                com.google.common.collect.Table<R, C, V> r0 = r1.original
                java.util.Collection r0 = r0.values()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class UnmodifiableRowSortedMap<R, C, V> extends com.google.common.collect.Tables.UnmodifiableTable<R, C, V> implements com.google.common.collect.RowSortedTable<R, C, V> {
        private static final long serialVersionUID = 0;

        public UnmodifiableRowSortedMap(com.google.common.collect.RowSortedTable<R, ? extends C, ? extends V> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        protected com.google.common.collect.RowSortedTable<R, C, V> delegate() {
                r1 = this;
                com.google.common.collect.Table r0 = super.delegate()
                com.google.common.collect.RowSortedTable r0 = (com.google.common.collect.RowSortedTable) r0
                return r0
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ com.google.common.collect.Table delegate() {
                r1 = this;
                com.google.common.collect.RowSortedTable r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                com.google.common.collect.RowSortedTable r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public /* bridge */ /* synthetic */ java.util.Set rowKeySet() {
                r1 = this;
                java.util.SortedSet r0 = r1.rowKeySet()
                return r0
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public java.util.SortedSet<R> rowKeySet() {
                r1 = this;
                com.google.common.collect.RowSortedTable r0 = r1.delegate()
                java.util.SortedSet r0 = r0.rowKeySet()
                java.util.SortedSet r0 = java.util.Collections.unmodifiableSortedSet(r0)
                return r0
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public /* bridge */ /* synthetic */ java.util.Map rowMap() {
                r1 = this;
                java.util.SortedMap r0 = r1.rowMap()
                return r0
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public java.util.SortedMap<R, java.util.Map<C, V>> rowMap() {
                r2 = this;
                com.google.common.base.Function r0 = com.google.common.collect.Tables.access$000()
                com.google.common.collect.RowSortedTable r1 = r2.delegate()
                java.util.SortedMap r1 = r1.rowMap()
                java.util.SortedMap r0 = com.google.common.collect.Maps.transformValues(r1, r0)
                java.util.SortedMap r0 = java.util.Collections.unmodifiableSortedMap(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class UnmodifiableTable<R, C, V> extends com.google.common.collect.ForwardingTable<R, C, V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.collect.Table<? extends R, ? extends C, ? extends V> delegate;

        UnmodifiableTable(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.collect.Table r1 = (com.google.common.collect.Table) r1
                r0.delegate = r1
                return
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> cellSet() {
                r1 = this;
                java.util.Set r0 = super.cellSet()
                java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
                return r0
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public void clear() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public java.util.Map<R, V> column(@org.checkerframework.checker.nullness.compatqual.NullableDecl C r1) {
                r0 = this;
                java.util.Map r1 = super.column(r1)
                java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
                return r1
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public java.util.Set<C> columnKeySet() {
                r1 = this;
                java.util.Set r0 = super.columnKeySet()
                java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
                return r0
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public java.util.Map<C, java.util.Map<R, V>> columnMap() {
                r2 = this;
                com.google.common.base.Function r0 = com.google.common.collect.Tables.access$000()
                java.util.Map r1 = super.columnMap()
                java.util.Map r0 = com.google.common.collect.Maps.transformValues(r1, r0)
                java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
                return r0
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        protected com.google.common.collect.Table<R, C, V> delegate() {
                r1 = this;
                com.google.common.collect.Table<? extends R, ? extends C, ? extends V> r0 = r1.delegate
                return r0
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                com.google.common.collect.Table r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public V put(@org.checkerframework.checker.nullness.compatqual.NullableDecl R r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl C r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r3) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public void putAll(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public V remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public java.util.Map<C, V> row(@org.checkerframework.checker.nullness.compatqual.NullableDecl R r1) {
                r0 = this;
                java.util.Map r1 = super.row(r1)
                java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
                return r1
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public java.util.Set<R> rowKeySet() {
                r1 = this;
                java.util.Set r0 = super.rowKeySet()
                java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
                return r0
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public java.util.Map<R, java.util.Map<C, V>> rowMap() {
                r2 = this;
                com.google.common.base.Function r0 = com.google.common.collect.Tables.access$000()
                java.util.Map r1 = super.rowMap()
                java.util.Map r0 = com.google.common.collect.Maps.transformValues(r1, r0)
                java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
                return r0
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public java.util.Collection<V> values() {
                r1 = this;
                java.util.Collection r0 = super.values()
                java.util.Collection r0 = java.util.Collections.unmodifiableCollection(r0)
                return r0
        }
    }

    static {
            com.google.common.collect.Tables$1 r0 = new com.google.common.collect.Tables$1
            r0.<init>()
            com.google.common.collect.Tables.UNMODIFIABLE_WRAPPER = r0
            return
    }

    private Tables() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ com.google.common.base.Function access$000() {
            com.google.common.base.Function r0 = unmodifiableWrapper()
            return r0
    }

    static boolean equalsImpl(com.google.common.collect.Table<?, ?, ?> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            if (r2 != r1) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof com.google.common.collect.Table
            if (r0 == 0) goto L17
            com.google.common.collect.Table r2 = (com.google.common.collect.Table) r2
            java.util.Set r1 = r1.cellSet()
            java.util.Set r2 = r2.cellSet()
            boolean r1 = r1.equals(r2)
            return r1
        L17:
            r1 = 0
            return r1
    }

    public static <R, C, V> com.google.common.collect.Table.Cell<R, C, V> immutableCell(@org.checkerframework.checker.nullness.compatqual.NullableDecl R r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl C r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r3) {
            com.google.common.collect.Tables$ImmutableCell r0 = new com.google.common.collect.Tables$ImmutableCell
            r0.<init>(r1, r2, r3)
            return r0
    }

    @com.google.common.annotations.Beta
    public static <R, C, V> com.google.common.collect.Table<R, C, V> newCustomTable(java.util.Map<R, java.util.Map<C, V>> r1, com.google.common.base.Supplier<? extends java.util.Map<C, V>> r2) {
            boolean r0 = r1.isEmpty()
            com.google.common.base.Preconditions.checkArgument(r0)
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.collect.StandardTable r0 = new com.google.common.collect.StandardTable
            r0.<init>(r1, r2)
            return r0
    }

    public static <R, C, V> com.google.common.collect.Table<R, C, V> synchronizedTable(com.google.common.collect.Table<R, C, V> r1) {
            r0 = 0
            com.google.common.collect.Table r1 = com.google.common.collect.Synchronized.table(r1, r0)
            return r1
    }

    @com.google.common.annotations.Beta
    public static <R, C, V1, V2> com.google.common.collect.Table<R, C, V2> transformValues(com.google.common.collect.Table<R, C, V1> r1, com.google.common.base.Function<? super V1, V2> r2) {
            com.google.common.collect.Tables$TransformedTable r0 = new com.google.common.collect.Tables$TransformedTable
            r0.<init>(r1, r2)
            return r0
    }

    public static <R, C, V> com.google.common.collect.Table<C, R, V> transpose(com.google.common.collect.Table<R, C, V> r1) {
            boolean r0 = r1 instanceof com.google.common.collect.Tables.TransposeTable
            if (r0 == 0) goto L9
            com.google.common.collect.Tables$TransposeTable r1 = (com.google.common.collect.Tables.TransposeTable) r1
            com.google.common.collect.Table<R, C, V> r1 = r1.original
            return r1
        L9:
            com.google.common.collect.Tables$TransposeTable r0 = new com.google.common.collect.Tables$TransposeTable
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.Beta
    public static <R, C, V> com.google.common.collect.RowSortedTable<R, C, V> unmodifiableRowSortedTable(com.google.common.collect.RowSortedTable<R, ? extends C, ? extends V> r1) {
            com.google.common.collect.Tables$UnmodifiableRowSortedMap r0 = new com.google.common.collect.Tables$UnmodifiableRowSortedMap
            r0.<init>(r1)
            return r0
    }

    public static <R, C, V> com.google.common.collect.Table<R, C, V> unmodifiableTable(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> r1) {
            com.google.common.collect.Tables$UnmodifiableTable r0 = new com.google.common.collect.Tables$UnmodifiableTable
            r0.<init>(r1)
            return r0
    }

    private static <K, V> com.google.common.base.Function<java.util.Map<K, V>, java.util.Map<K, V>> unmodifiableWrapper() {
            com.google.common.base.Function<? extends java.util.Map<?, ?>, ? extends java.util.Map<?, ?>> r0 = com.google.common.collect.Tables.UNMODIFIABLE_WRAPPER
            return r0
    }
}
