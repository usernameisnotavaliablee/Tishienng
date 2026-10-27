package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class RegularImmutableTable<R, C, V> extends com.google.common.collect.ImmutableTable<R, C, V> {


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class CellSet extends com.google.common.collect.IndexedImmutableSet<com.google.common.collect.Table.Cell<R, C, V>> {
        final /* synthetic */ com.google.common.collect.RegularImmutableTable this$0;

        private CellSet(com.google.common.collect.RegularImmutableTable r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ CellSet(com.google.common.collect.RegularImmutableTable r1, com.google.common.collect.RegularImmutableTable.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r5) {
                r4 = this;
                boolean r0 = r5 instanceof com.google.common.collect.Table.Cell
                r1 = 0
                if (r0 == 0) goto L23
                com.google.common.collect.Table$Cell r5 = (com.google.common.collect.Table.Cell) r5
                com.google.common.collect.RegularImmutableTable r0 = r4.this$0
                java.lang.Object r2 = r5.getRowKey()
                java.lang.Object r3 = r5.getColumnKey()
                java.lang.Object r0 = r0.get(r2, r3)
                if (r0 == 0) goto L23
                java.lang.Object r5 = r5.getValue()
                boolean r5 = r0.equals(r5)
                if (r5 == 0) goto L23
                r5 = 1
                return r5
            L23:
                return r1
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        com.google.common.collect.Table.Cell<R, C, V> get(int r2) {
                r1 = this;
                com.google.common.collect.RegularImmutableTable r0 = r1.this$0
                com.google.common.collect.Table$Cell r2 = r0.getCell(r2)
                return r2
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                com.google.common.collect.Table$Cell r1 = r0.get(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.common.collect.RegularImmutableTable r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class Values extends com.google.common.collect.ImmutableList<V> {
        final /* synthetic */ com.google.common.collect.RegularImmutableTable this$0;

        private Values(com.google.common.collect.RegularImmutableTable r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ Values(com.google.common.collect.RegularImmutableTable r1, com.google.common.collect.RegularImmutableTable.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.List
        public V get(int r2) {
                r1 = this;
                com.google.common.collect.RegularImmutableTable r0 = r1.this$0
                java.lang.Object r2 = r0.getValue(r2)
                return r2
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
                com.google.common.collect.RegularImmutableTable r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }
    }

    RegularImmutableTable() {
            r0 = this;
            r0.<init>()
            return
    }

    static <R, C, V> com.google.common.collect.RegularImmutableTable<R, C, V> forCells(java.lang.Iterable<com.google.common.collect.Table.Cell<R, C, V>> r1) {
            r0 = 0
            com.google.common.collect.RegularImmutableTable r1 = forCellsInternal(r1, r0, r0)
            return r1
    }

    static <R, C, V> com.google.common.collect.RegularImmutableTable<R, C, V> forCells(java.util.List<com.google.common.collect.Table.Cell<R, C, V>> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.util.Comparator<? super R> r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.util.Comparator<? super C> r3) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            if (r2 != 0) goto L7
            if (r3 == 0) goto Lf
        L7:
            com.google.common.collect.RegularImmutableTable$1 r0 = new com.google.common.collect.RegularImmutableTable$1
            r0.<init>(r2, r3)
            java.util.Collections.sort(r1, r0)
        Lf:
            com.google.common.collect.RegularImmutableTable r1 = forCellsInternal(r1, r2, r3)
            return r1
    }

    private static <R, C, V> com.google.common.collect.RegularImmutableTable<R, C, V> forCellsInternal(java.lang.Iterable<com.google.common.collect.Table.Cell<R, C, V>> r5, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.util.Comparator<? super R> r6, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.util.Comparator<? super C> r7) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf(r5)
            java.util.Iterator r5 = r5.iterator()
        L12:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r5.next()
            com.google.common.collect.Table$Cell r3 = (com.google.common.collect.Table.Cell) r3
            java.lang.Object r4 = r3.getRowKey()
            r0.add(r4)
            java.lang.Object r3 = r3.getColumnKey()
            r1.add(r3)
            goto L12
        L2d:
            if (r6 != 0) goto L34
            com.google.common.collect.ImmutableSet r5 = com.google.common.collect.ImmutableSet.copyOf(r0)
            goto L3c
        L34:
            com.google.common.collect.ImmutableList r5 = com.google.common.collect.ImmutableList.sortedCopyOf(r6, r0)
            com.google.common.collect.ImmutableSet r5 = com.google.common.collect.ImmutableSet.copyOf(r5)
        L3c:
            if (r7 != 0) goto L43
            com.google.common.collect.ImmutableSet r6 = com.google.common.collect.ImmutableSet.copyOf(r1)
            goto L4b
        L43:
            com.google.common.collect.ImmutableList r6 = com.google.common.collect.ImmutableList.sortedCopyOf(r7, r1)
            com.google.common.collect.ImmutableSet r6 = com.google.common.collect.ImmutableSet.copyOf(r6)
        L4b:
            com.google.common.collect.RegularImmutableTable r5 = forOrderedComponents(r2, r5, r6)
            return r5
    }

    static <R, C, V> com.google.common.collect.RegularImmutableTable<R, C, V> forOrderedComponents(com.google.common.collect.ImmutableList<com.google.common.collect.Table.Cell<R, C, V>> r6, com.google.common.collect.ImmutableSet<R> r7, com.google.common.collect.ImmutableSet<C> r8) {
            int r0 = r6.size()
            long r0 = (long) r0
            int r2 = r7.size()
            long r2 = (long) r2
            int r4 = r8.size()
            long r4 = (long) r4
            long r2 = r2 * r4
            r4 = 2
            long r2 = r2 / r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1e
            com.google.common.collect.DenseImmutableTable r0 = new com.google.common.collect.DenseImmutableTable
            r0.<init>(r6, r7, r8)
            return r0
        L1e:
            com.google.common.collect.SparseImmutableTable r0 = new com.google.common.collect.SparseImmutableTable
            r0.<init>(r6, r7, r8)
            return r0
    }

    final void checkNoDuplicate(R r8, C r9, V r10, V r11) {
            r7 = this;
            if (r10 != 0) goto L5
            r0 = 1
            r1 = 1
            goto L7
        L5:
            r0 = 0
            r1 = 0
        L7:
            java.lang.String r2 = "Duplicate key: (row=%s, column=%s), values: [%s, %s]."
            r3 = r8
            r4 = r9
            r6 = r10
            r5 = r11
            com.google.common.base.Preconditions.checkArgument(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    final com.google.common.collect.ImmutableSet<com.google.common.collect.Table.Cell<R, C, V>> createCellSet() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lb
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of()
            return r0
        Lb:
            com.google.common.collect.RegularImmutableTable$CellSet r0 = new com.google.common.collect.RegularImmutableTable$CellSet
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    /* bridge */ /* synthetic */ java.util.Set createCellSet() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.createCellSet()
            return r0
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    final com.google.common.collect.ImmutableCollection<V> createValues() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lb
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            return r0
        Lb:
            com.google.common.collect.RegularImmutableTable$Values r0 = new com.google.common.collect.RegularImmutableTable$Values
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    /* bridge */ /* synthetic */ java.util.Collection createValues() {
            r1 = this;
            com.google.common.collect.ImmutableCollection r0 = r1.createValues()
            return r0
    }

    abstract com.google.common.collect.Table.Cell<R, C, V> getCell(int r1);

    abstract V getValue(int r1);
}
