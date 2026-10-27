package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(serializable = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class HashBasedTable<R, C, V> extends com.google.common.collect.StandardTable<R, C, V> {
    private static final long serialVersionUID = 0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class Factory<C, V> implements com.google.common.base.Supplier<java.util.Map<C, V>>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final int expectedSize;

        Factory(int r1) {
                r0 = this;
                r0.<init>()
                r0.expectedSize = r1
                return
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ java.lang.Object get() {
                r1 = this;
                java.util.Map r0 = r1.get()
                return r0
        }

        @Override // com.google.common.base.Supplier
        public java.util.Map<C, V> get() {
                r1 = this;
                int r0 = r1.expectedSize
                java.util.LinkedHashMap r0 = com.google.common.collect.Maps.newLinkedHashMapWithExpectedSize(r0)
                return r0
        }
    }

    HashBasedTable(java.util.Map<R, java.util.Map<C, V>> r1, com.google.common.collect.HashBasedTable.Factory<C, V> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static <R, C, V> com.google.common.collect.HashBasedTable<R, C, V> create() {
            com.google.common.collect.HashBasedTable r0 = new com.google.common.collect.HashBasedTable
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            com.google.common.collect.HashBasedTable$Factory r2 = new com.google.common.collect.HashBasedTable$Factory
            r3 = 0
            r2.<init>(r3)
            r0.<init>(r1, r2)
            return r0
    }

    public static <R, C, V> com.google.common.collect.HashBasedTable<R, C, V> create(int r2, int r3) {
            java.lang.String r0 = "expectedCellsPerRow"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r3, r0)
            java.util.LinkedHashMap r2 = com.google.common.collect.Maps.newLinkedHashMapWithExpectedSize(r2)
            com.google.common.collect.HashBasedTable r0 = new com.google.common.collect.HashBasedTable
            com.google.common.collect.HashBasedTable$Factory r1 = new com.google.common.collect.HashBasedTable$Factory
            r1.<init>(r3)
            r0.<init>(r2, r1)
            return r0
    }

    public static <R, C, V> com.google.common.collect.HashBasedTable<R, C, V> create(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> r1) {
            com.google.common.collect.HashBasedTable r0 = create()
            r0.putAll(r1)
            return r0
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Set cellSet() {
            r1 = this;
            java.util.Set r0 = super.cellSet()
            return r0
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ void clear() {
            r0 = this;
            super.clear()
            return
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map column(java.lang.Object r1) {
            r0 = this;
            java.util.Map r1 = super.column(r1)
            return r1
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Set columnKeySet() {
            r1 = this;
            java.util.Set r0 = super.columnKeySet()
            return r0
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map columnMap() {
            r1 = this;
            java.util.Map r0 = super.columnMap()
            return r0
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r0 = this;
            boolean r1 = super.contains(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsColumn(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.containsColumn(r1)
            return r1
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsRow(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.containsRow(r1)
            return r1
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsValue(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.containsValue(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.equals(r1)
            return r1
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public V get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r0 = this;
            java.lang.Object r1 = super.get(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean isEmpty() {
            r1 = this;
            boolean r0 = super.isEmpty()
            return r0
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            java.lang.Object r1 = super.put(r1, r2, r3)
            return r1
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ void putAll(com.google.common.collect.Table r1) {
            r0 = this;
            super.putAll(r1)
            return
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r0 = this;
            java.lang.Object r1 = super.remove(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map row(java.lang.Object r1) {
            r0 = this;
            java.util.Map r1 = super.row(r1)
            return r1
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Set rowKeySet() {
            r1 = this;
            java.util.Set r0 = super.rowKeySet()
            return r0
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map rowMap() {
            r1 = this;
            java.util.Map r0 = super.rowMap()
            return r0
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int size() {
            r1 = this;
            int r0 = super.size()
            return r0
    }

    @Override // com.google.common.collect.AbstractTable
    public /* bridge */ /* synthetic */ java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            return r0
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Collection values() {
            r1 = this;
            java.util.Collection r0 = super.values()
            return r0
    }
}
