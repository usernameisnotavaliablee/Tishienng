package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.errorprone.annotations.Immutable(containerOf = {"R", "C", "V"})
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class SparseImmutableTable<R, C, V> extends com.google.common.collect.RegularImmutableTable<R, C, V> {
    static final com.google.common.collect.ImmutableTable<java.lang.Object, java.lang.Object, java.lang.Object> EMPTY = null;
    private final int[] cellColumnInRowIndices;
    private final int[] cellRowIndices;
    private final com.google.common.collect.ImmutableMap<C, com.google.common.collect.ImmutableMap<R, V>> columnMap;
    private final com.google.common.collect.ImmutableMap<R, com.google.common.collect.ImmutableMap<C, V>> rowMap;

    static {
            com.google.common.collect.SparseImmutableTable r0 = new com.google.common.collect.SparseImmutableTable
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
            com.google.common.collect.ImmutableSet r2 = com.google.common.collect.ImmutableSet.of()
            com.google.common.collect.ImmutableSet r3 = com.google.common.collect.ImmutableSet.of()
            r0.<init>(r1, r2, r3)
            com.google.common.collect.SparseImmutableTable.EMPTY = r0
            return
    }

    SparseImmutableTable(com.google.common.collect.ImmutableList<com.google.common.collect.Table.Cell<R, C, V>> r10, com.google.common.collect.ImmutableSet<R> r11, com.google.common.collect.ImmutableSet<C> r12) {
            r9 = this;
            r9.<init>()
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.Maps.indexMap(r11)
            java.util.LinkedHashMap r1 = com.google.common.collect.Maps.newLinkedHashMap()
            com.google.common.collect.UnmodifiableIterator r11 = r11.iterator()
        Lf:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r11.next()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r1.put(r2, r3)
            goto Lf
        L22:
            java.util.LinkedHashMap r11 = com.google.common.collect.Maps.newLinkedHashMap()
            com.google.common.collect.UnmodifiableIterator r12 = r12.iterator()
        L2a:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r12.next()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r11.put(r2, r3)
            goto L2a
        L3d:
            int r12 = r10.size()
            int[] r12 = new int[r12]
            int r2 = r10.size()
            int[] r2 = new int[r2]
            r3 = 0
        L4a:
            int r4 = r10.size()
            if (r3 >= r4) goto L8d
            java.lang.Object r4 = r10.get(r3)
            com.google.common.collect.Table$Cell r4 = (com.google.common.collect.Table.Cell) r4
            java.lang.Object r5 = r4.getRowKey()
            java.lang.Object r6 = r4.getColumnKey()
            java.lang.Object r4 = r4.getValue()
            java.lang.Object r7 = r0.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r12[r3] = r7
            java.lang.Object r7 = r1.get(r5)
            java.util.Map r7 = (java.util.Map) r7
            int r8 = r7.size()
            r2[r3] = r8
            java.lang.Object r7 = r7.put(r6, r4)
            r9.checkNoDuplicate(r5, r6, r7, r4)
            java.lang.Object r6 = r11.get(r6)
            java.util.Map r6 = (java.util.Map) r6
            r6.put(r5, r4)
            int r3 = r3 + 1
            goto L4a
        L8d:
            r9.cellRowIndices = r12
            r9.cellColumnInRowIndices = r2
            com.google.common.collect.ImmutableMap$Builder r10 = new com.google.common.collect.ImmutableMap$Builder
            int r12 = r1.size()
            r10.<init>(r12)
            java.util.Set r12 = r1.entrySet()
            java.util.Iterator r12 = r12.iterator()
        La2:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto Lc0
            java.lang.Object r0 = r12.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.copyOf(r0)
            r10.put(r1, r0)
            goto La2
        Lc0:
            com.google.common.collect.ImmutableMap r10 = r10.build()
            r9.rowMap = r10
            com.google.common.collect.ImmutableMap$Builder r10 = new com.google.common.collect.ImmutableMap$Builder
            int r12 = r11.size()
            r10.<init>(r12)
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        Ld7:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lf5
            java.lang.Object r12 = r11.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r0 = r12.getKey()
            java.lang.Object r12 = r12.getValue()
            java.util.Map r12 = (java.util.Map) r12
            com.google.common.collect.ImmutableMap r12 = com.google.common.collect.ImmutableMap.copyOf(r12)
            r10.put(r0, r12)
            goto Ld7
        Lf5:
            com.google.common.collect.ImmutableMap r10 = r10.build()
            r9.columnMap = r10
            return
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
            r6 = this;
            com.google.common.collect.ImmutableSet r0 = r6.columnKeySet()
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.Maps.indexMap(r0)
            com.google.common.collect.ImmutableSet r1 = r6.cellSet()
            int r1 = r1.size()
            int[] r1 = new int[r1]
            com.google.common.collect.ImmutableSet r2 = r6.cellSet()
            com.google.common.collect.UnmodifiableIterator r2 = r2.iterator()
            r3 = 0
        L1b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L3b
            java.lang.Object r4 = r2.next()
            com.google.common.collect.Table$Cell r4 = (com.google.common.collect.Table.Cell) r4
            int r5 = r3 + 1
            java.lang.Object r4 = r4.getColumnKey()
            java.lang.Object r4 = r0.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1[r3] = r4
            r3 = r5
            goto L1b
        L3b:
            int[] r0 = r6.cellRowIndices
            com.google.common.collect.ImmutableTable$SerializedForm r0 = com.google.common.collect.ImmutableTable.SerializedForm.create(r6, r0, r1)
            return r0
    }

    @Override // com.google.common.collect.RegularImmutableTable
    com.google.common.collect.Table.Cell<R, C, V> getCell(int r4) {
            r3 = this;
            int[] r0 = r3.cellRowIndices
            r0 = r0[r4]
            com.google.common.collect.ImmutableMap<R, com.google.common.collect.ImmutableMap<C, V>> r1 = r3.rowMap
            com.google.common.collect.ImmutableSet r1 = r1.entrySet()
            com.google.common.collect.ImmutableList r1 = r1.asList()
            java.lang.Object r0 = r1.get(r0)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            com.google.common.collect.ImmutableMap r1 = (com.google.common.collect.ImmutableMap) r1
            int[] r2 = r3.cellColumnInRowIndices
            r4 = r2[r4]
            com.google.common.collect.ImmutableSet r1 = r1.entrySet()
            com.google.common.collect.ImmutableList r1 = r1.asList()
            java.lang.Object r4 = r1.get(r4)
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r0.getKey()
            java.lang.Object r1 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            com.google.common.collect.Table$Cell r4 = com.google.common.collect.ImmutableTable.cellOf(r0, r1, r4)
            return r4
    }

    @Override // com.google.common.collect.RegularImmutableTable
    V getValue(int r3) {
            r2 = this;
            int[] r0 = r2.cellRowIndices
            r0 = r0[r3]
            com.google.common.collect.ImmutableMap<R, com.google.common.collect.ImmutableMap<C, V>> r1 = r2.rowMap
            com.google.common.collect.ImmutableCollection r1 = r1.values()
            com.google.common.collect.ImmutableList r1 = r1.asList()
            java.lang.Object r0 = r1.get(r0)
            com.google.common.collect.ImmutableMap r0 = (com.google.common.collect.ImmutableMap) r0
            int[] r1 = r2.cellColumnInRowIndices
            r3 = r1[r3]
            com.google.common.collect.ImmutableCollection r0 = r0.values()
            com.google.common.collect.ImmutableList r0 = r0.asList()
            java.lang.Object r3 = r0.get(r3)
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
