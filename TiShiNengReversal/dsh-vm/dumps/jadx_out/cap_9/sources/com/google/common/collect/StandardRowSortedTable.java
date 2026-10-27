package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class StandardRowSortedTable<R, C, V> extends com.google.common.collect.StandardTable<R, C, V> implements com.google.common.collect.RowSortedTable<R, C, V> {
    private static final long serialVersionUID = 0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.collect.StandardRowSortedTable$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class RowSortedMap extends com.google.common.collect.StandardTable<R, C, V>.RowMap implements java.util.SortedMap<R, java.util.Map<C, V>> {
        final /* synthetic */ com.google.common.collect.StandardRowSortedTable this$0;

        private RowSortedMap(com.google.common.collect.StandardRowSortedTable r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        /* synthetic */ RowSortedMap(com.google.common.collect.StandardRowSortedTable r1, com.google.common.collect.StandardRowSortedTable.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.SortedMap
        public java.util.Comparator<? super R> comparator() {
                r1 = this;
                com.google.common.collect.StandardRowSortedTable r0 = r1.this$0
                java.util.SortedMap r0 = com.google.common.collect.StandardRowSortedTable.access$100(r0)
                java.util.Comparator r0 = r0.comparator()
                return r0
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* bridge */ /* synthetic */ java.util.Set createKeySet() {
                r1 = this;
                java.util.SortedSet r0 = r1.createKeySet()
                return r0
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        java.util.SortedSet<R> createKeySet() {
                r1 = this;
                com.google.common.collect.Maps$SortedKeySet r0 = new com.google.common.collect.Maps$SortedKeySet
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.SortedMap
        public R firstKey() {
                r1 = this;
                com.google.common.collect.StandardRowSortedTable r0 = r1.this$0
                java.util.SortedMap r0 = com.google.common.collect.StandardRowSortedTable.access$100(r0)
                java.lang.Object r0 = r0.firstKey()
                return r0
        }

        @Override // java.util.SortedMap
        public java.util.SortedMap<R, java.util.Map<C, V>> headMap(R r3) {
                r2 = this;
                com.google.common.base.Preconditions.checkNotNull(r3)
                com.google.common.collect.StandardRowSortedTable r0 = new com.google.common.collect.StandardRowSortedTable
                com.google.common.collect.StandardRowSortedTable r1 = r2.this$0
                java.util.SortedMap r1 = com.google.common.collect.StandardRowSortedTable.access$100(r1)
                java.util.SortedMap r3 = r1.headMap(r3)
                com.google.common.collect.StandardRowSortedTable r1 = r2.this$0
                com.google.common.base.Supplier<? extends java.util.Map<C, V>> r1 = r1.factory
                r0.<init>(r3, r1)
                java.util.SortedMap r3 = r0.rowMap()
                return r3
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ java.util.Set keySet() {
                r1 = this;
                java.util.SortedSet r0 = r1.keySet()
                return r0
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public java.util.SortedSet<R> keySet() {
                r1 = this;
                java.util.Set r0 = super.keySet()
                java.util.SortedSet r0 = (java.util.SortedSet) r0
                return r0
        }

        @Override // java.util.SortedMap
        public R lastKey() {
                r1 = this;
                com.google.common.collect.StandardRowSortedTable r0 = r1.this$0
                java.util.SortedMap r0 = com.google.common.collect.StandardRowSortedTable.access$100(r0)
                java.lang.Object r0 = r0.lastKey()
                return r0
        }

        @Override // java.util.SortedMap
        public java.util.SortedMap<R, java.util.Map<C, V>> subMap(R r3, R r4) {
                r2 = this;
                com.google.common.base.Preconditions.checkNotNull(r3)
                com.google.common.base.Preconditions.checkNotNull(r4)
                com.google.common.collect.StandardRowSortedTable r0 = new com.google.common.collect.StandardRowSortedTable
                com.google.common.collect.StandardRowSortedTable r1 = r2.this$0
                java.util.SortedMap r1 = com.google.common.collect.StandardRowSortedTable.access$100(r1)
                java.util.SortedMap r3 = r1.subMap(r3, r4)
                com.google.common.collect.StandardRowSortedTable r4 = r2.this$0
                com.google.common.base.Supplier<? extends java.util.Map<C, V>> r4 = r4.factory
                r0.<init>(r3, r4)
                java.util.SortedMap r3 = r0.rowMap()
                return r3
        }

        @Override // java.util.SortedMap
        public java.util.SortedMap<R, java.util.Map<C, V>> tailMap(R r3) {
                r2 = this;
                com.google.common.base.Preconditions.checkNotNull(r3)
                com.google.common.collect.StandardRowSortedTable r0 = new com.google.common.collect.StandardRowSortedTable
                com.google.common.collect.StandardRowSortedTable r1 = r2.this$0
                java.util.SortedMap r1 = com.google.common.collect.StandardRowSortedTable.access$100(r1)
                java.util.SortedMap r3 = r1.tailMap(r3)
                com.google.common.collect.StandardRowSortedTable r1 = r2.this$0
                com.google.common.base.Supplier<? extends java.util.Map<C, V>> r1 = r1.factory
                r0.<init>(r3, r1)
                java.util.SortedMap r3 = r0.rowMap()
                return r3
        }
    }

    StandardRowSortedTable(java.util.SortedMap<R, java.util.Map<C, V>> r1, com.google.common.base.Supplier<? extends java.util.Map<C, V>> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static /* synthetic */ java.util.SortedMap access$100(com.google.common.collect.StandardRowSortedTable r0) {
            java.util.SortedMap r0 = r0.sortedBackingMap()
            return r0
    }

    private java.util.SortedMap<R, java.util.Map<C, V>> sortedBackingMap() {
            r1 = this;
            java.util.Map<R, java.util.Map<C, V>> r0 = r1.backingMap
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            return r0
    }

    @Override // com.google.common.collect.StandardTable
    /* bridge */ /* synthetic */ java.util.Map createRowMap() {
            r1 = this;
            java.util.SortedMap r0 = r1.createRowMap()
            return r0
    }

    @Override // com.google.common.collect.StandardTable
    java.util.SortedMap<R, java.util.Map<C, V>> createRowMap() {
            r2 = this;
            com.google.common.collect.StandardRowSortedTable$RowSortedMap r0 = new com.google.common.collect.StandardRowSortedTable$RowSortedMap
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Set rowKeySet() {
            r1 = this;
            java.util.SortedSet r0 = r1.rowKeySet()
            return r0
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public java.util.SortedSet<R> rowKeySet() {
            r1 = this;
            java.util.SortedMap r0 = r1.rowMap()
            java.util.Set r0 = r0.keySet()
            java.util.SortedSet r0 = (java.util.SortedSet) r0
            return r0
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map rowMap() {
            r1 = this;
            java.util.SortedMap r0 = r1.rowMap()
            return r0
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public java.util.SortedMap<R, java.util.Map<C, V>> rowMap() {
            r1 = this;
            java.util.Map r0 = super.rowMap()
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            return r0
    }
}
