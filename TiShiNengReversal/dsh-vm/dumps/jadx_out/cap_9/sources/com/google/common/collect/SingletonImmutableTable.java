package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class SingletonImmutableTable<R, C, V> extends com.google.common.collect.ImmutableTable<R, C, V> {
    final C singleColumnKey;
    final R singleRowKey;
    final V singleValue;

    SingletonImmutableTable(com.google.common.collect.Table.Cell<R, C, V> r3) {
            r2 = this;
            java.lang.Object r0 = r3.getRowKey()
            java.lang.Object r1 = r3.getColumnKey()
            java.lang.Object r3 = r3.getValue()
            r2.<init>(r0, r1, r3)
            return
    }

    SingletonImmutableTable(R r1, C r2, V r3) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            r0.singleRowKey = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
            r0.singleColumnKey = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r3)
            r0.singleValue = r1
            return
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableMap<R, V> column(C r2) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r2 = r1.containsColumn(r2)
            if (r2 == 0) goto L12
            R r2 = r1.singleRowKey
            V r0 = r1.singleValue
            com.google.common.collect.ImmutableMap r2 = com.google.common.collect.ImmutableMap.of(r2, r0)
            return r2
        L12:
            com.google.common.collect.ImmutableMap r2 = com.google.common.collect.ImmutableMap.of()
            return r2
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map column(java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableMap r1 = r0.column(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableMap<C, java.util.Map<R, V>> columnMap() {
            r3 = this;
            C r0 = r3.singleColumnKey
            R r1 = r3.singleRowKey
            V r2 = r3.singleValue
            com.google.common.collect.ImmutableMap r1 = com.google.common.collect.ImmutableMap.of(r1, r2)
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.of(r0, r1)
            return r0
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map columnMap() {
            r1 = this;
            com.google.common.collect.ImmutableMap r0 = r1.columnMap()
            return r0
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    com.google.common.collect.ImmutableSet<com.google.common.collect.Table.Cell<R, C, V>> createCellSet() {
            r3 = this;
            R r0 = r3.singleRowKey
            C r1 = r3.singleColumnKey
            V r2 = r3.singleValue
            com.google.common.collect.Table$Cell r0 = com.google.common.collect.ImmutableTable.cellOf(r0, r1, r2)
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of(r0)
            return r0
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    /* bridge */ /* synthetic */ java.util.Set createCellSet() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.createCellSet()
            return r0
    }

    @Override // com.google.common.collect.ImmutableTable
    com.google.common.collect.ImmutableTable.SerializedForm createSerializedForm() {
            r2 = this;
            r0 = 0
            int[] r1 = new int[]{r0}
            int[] r0 = new int[]{r0}
            com.google.common.collect.ImmutableTable$SerializedForm r0 = com.google.common.collect.ImmutableTable.SerializedForm.create(r2, r1, r0)
            return r0
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    com.google.common.collect.ImmutableCollection<V> createValues() {
            r1 = this;
            V r0 = r1.singleValue
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of(r0)
            return r0
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    /* bridge */ /* synthetic */ java.util.Collection createValues() {
            r1 = this;
            com.google.common.collect.ImmutableCollection r0 = r1.createValues()
            return r0
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableMap<R, java.util.Map<C, V>> rowMap() {
            r3 = this;
            R r0 = r3.singleRowKey
            C r1 = r3.singleColumnKey
            V r2 = r3.singleValue
            com.google.common.collect.ImmutableMap r1 = com.google.common.collect.ImmutableMap.of(r1, r2)
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.of(r0, r1)
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
            r0 = 1
            return r0
    }
}
