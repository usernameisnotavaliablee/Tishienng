package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class ImmutableSortedMap<K, V> extends com.google.common.collect.ImmutableSortedMapFauxverideShim<K, V> implements java.util.NavigableMap<K, V> {
    private static final com.google.common.collect.ImmutableSortedMap<java.lang.Comparable, java.lang.Object> NATURAL_EMPTY_MAP = null;
    private static final java.util.Comparator<java.lang.Comparable> NATURAL_ORDER = null;
    private static final long serialVersionUID = 0;
    private transient com.google.common.collect.ImmutableSortedMap<K, V> descendingMap;
    private final transient com.google.common.collect.RegularImmutableSortedSet<K> keySet;
    private final transient com.google.common.collect.ImmutableList<V> valueList;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder<K, V> extends com.google.common.collect.ImmutableMap.Builder<K, V> {
        private final java.util.Comparator<? super K> comparator;
        private transient java.lang.Object[] keys;
        private transient java.lang.Object[] values;

        public Builder(java.util.Comparator<? super K> r2) {
                r1 = this;
                r0 = 4
                r1.<init>(r2, r0)
                return
        }

        private Builder(java.util.Comparator<? super K> r1, int r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.Comparator r1 = (java.util.Comparator) r1
                r0.comparator = r1
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r0.keys = r1
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r0.values = r1
                return
        }

        private void ensureCapacity(int r3) {
                r2 = this;
                java.lang.Object[] r0 = r2.keys
                int r1 = r0.length
                if (r3 <= r1) goto L1a
                int r0 = r0.length
                int r3 = com.google.common.collect.ImmutableCollection.Builder.expandedCapacity(r0, r3)
                java.lang.Object[] r0 = r2.keys
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
                r2.keys = r0
                java.lang.Object[] r0 = r2.values
                java.lang.Object[] r3 = java.util.Arrays.copyOf(r0, r3)
                r2.values = r3
            L1a:
                return
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMap build() {
                r1 = this;
                com.google.common.collect.ImmutableSortedMap r0 = r1.build()
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public com.google.common.collect.ImmutableSortedMap<K, V> build() {
                r7 = this;
                int r0 = r7.size
                if (r0 == 0) goto L86
                r1 = 0
                r2 = 1
                if (r0 == r2) goto L77
                java.lang.Object[] r2 = r7.keys
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
                java.util.Comparator<? super K> r2 = r7.comparator
                java.util.Arrays.sort(r0, r2)
                int r2 = r7.size
                java.lang.Object[] r2 = new java.lang.Object[r2]
            L17:
                int r3 = r7.size
                if (r1 >= r3) goto L62
                if (r1 <= 0) goto L4f
                java.util.Comparator<? super K> r3 = r7.comparator
                int r4 = r1 + (-1)
                r5 = r0[r4]
                r6 = r0[r1]
                int r3 = r3.compare(r5, r6)
                if (r3 == 0) goto L2c
                goto L4f
            L2c:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "keys required to be distinct but compared as equal: "
                r3.append(r5)
                r4 = r0[r4]
                r3.append(r4)
                java.lang.String r4 = " and "
                r3.append(r4)
                r0 = r0[r1]
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r2.<init>(r0)
                throw r2
            L4f:
                java.lang.Object[] r3 = r7.keys
                r3 = r3[r1]
                java.util.Comparator<? super K> r4 = r7.comparator
                int r3 = java.util.Arrays.binarySearch(r0, r3, r4)
                java.lang.Object[] r4 = r7.values
                r4 = r4[r1]
                r2[r3] = r4
                int r1 = r1 + 1
                goto L17
            L62:
                com.google.common.collect.ImmutableSortedMap r1 = new com.google.common.collect.ImmutableSortedMap
                com.google.common.collect.RegularImmutableSortedSet r3 = new com.google.common.collect.RegularImmutableSortedSet
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.asImmutableList(r0)
                java.util.Comparator<? super K> r4 = r7.comparator
                r3.<init>(r0, r4)
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.asImmutableList(r2)
                r1.<init>(r3, r0)
                return r1
            L77:
                java.util.Comparator<? super K> r0 = r7.comparator
                java.lang.Object[] r2 = r7.keys
                r2 = r2[r1]
                java.lang.Object[] r3 = r7.values
                r1 = r3[r1]
                com.google.common.collect.ImmutableSortedMap r0 = com.google.common.collect.ImmutableSortedMap.access$000(r0, r2, r1)
                return r0
            L86:
                java.util.Comparator<? super K> r0 = r7.comparator
                com.google.common.collect.ImmutableSortedMap r0 = com.google.common.collect.ImmutableSortedMap.emptyMap(r0)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.common.annotations.Beta
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMap.Builder orderEntriesByValue(java.util.Comparator r1) {
                r0 = this;
                com.google.common.collect.ImmutableSortedMap$Builder r1 = r0.orderEntriesByValue(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.common.annotations.Beta
        @java.lang.Deprecated
        public com.google.common.collect.ImmutableSortedMap.Builder<K, V> orderEntriesByValue(java.util.Comparator<? super V> r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Not available on ImmutableSortedMap.Builder"
                r2.<init>(r0)
                throw r2
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMap.Builder put(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                com.google.common.collect.ImmutableSortedMap$Builder r1 = r0.put(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMap.Builder put(java.util.Map.Entry r1) {
                r0 = this;
                com.google.common.collect.ImmutableSortedMap$Builder r1 = r0.put(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSortedMap.Builder<K, V> put(K r3, V r4) {
                r2 = this;
                int r0 = r2.size
                int r0 = r0 + 1
                r2.ensureCapacity(r0)
                com.google.common.collect.CollectPreconditions.checkEntryNotNull(r3, r4)
                java.lang.Object[] r0 = r2.keys
                int r1 = r2.size
                r0[r1] = r3
                java.lang.Object[] r3 = r2.values
                r3[r1] = r4
                int r1 = r1 + 1
                r2.size = r1
                return r2
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSortedMap.Builder<K, V> put(java.util.Map.Entry<? extends K, ? extends V> r1) {
                r0 = this;
                super.put(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.common.annotations.Beta
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMap.Builder putAll(java.lang.Iterable r1) {
                r0 = this;
                com.google.common.collect.ImmutableSortedMap$Builder r1 = r0.putAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMap.Builder putAll(java.util.Map r1) {
                r0 = this;
                com.google.common.collect.ImmutableSortedMap$Builder r1 = r0.putAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.common.annotations.Beta
        public com.google.common.collect.ImmutableSortedMap.Builder<K, V> putAll(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> r1) {
                r0 = this;
                super.putAll(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSortedMap.Builder<K, V> putAll(java.util.Map<? extends K, ? extends V> r1) {
                r0 = this;
                super.putAll(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SerializedForm extends com.google.common.collect.ImmutableMap.SerializedForm {
        private static final long serialVersionUID = 0;
        private final java.util.Comparator<java.lang.Object> comparator;

        SerializedForm(com.google.common.collect.ImmutableSortedMap<?, ?> r1) {
                r0 = this;
                r0.<init>(r1)
                java.util.Comparator r1 = r1.comparator()
                r0.comparator = r1
                return
        }

        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        java.lang.Object readResolve() {
                r2 = this;
                com.google.common.collect.ImmutableSortedMap$Builder r0 = new com.google.common.collect.ImmutableSortedMap$Builder
                java.util.Comparator<java.lang.Object> r1 = r2.comparator
                r0.<init>(r1)
                java.lang.Object r0 = r2.createMap(r0)
                return r0
        }
    }

    static {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            com.google.common.collect.ImmutableSortedMap.NATURAL_ORDER = r0
            com.google.common.collect.ImmutableSortedMap r0 = new com.google.common.collect.ImmutableSortedMap
            com.google.common.collect.Ordering r1 = com.google.common.collect.Ordering.natural()
            com.google.common.collect.RegularImmutableSortedSet r1 = com.google.common.collect.ImmutableSortedSet.emptySet(r1)
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of()
            r0.<init>(r1, r2)
            com.google.common.collect.ImmutableSortedMap.NATURAL_EMPTY_MAP = r0
            return
    }

    ImmutableSortedMap(com.google.common.collect.RegularImmutableSortedSet<K> r2, com.google.common.collect.ImmutableList<V> r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    ImmutableSortedMap(com.google.common.collect.RegularImmutableSortedSet<K> r1, com.google.common.collect.ImmutableList<V> r2, com.google.common.collect.ImmutableSortedMap<K, V> r3) {
            r0 = this;
            r0.<init>()
            r0.keySet = r1
            r0.valueList = r2
            r0.descendingMap = r3
            return
    }

    static /* synthetic */ com.google.common.collect.ImmutableSortedMap access$000(java.util.Comparator r0, java.lang.Object r1, java.lang.Object r2) {
            com.google.common.collect.ImmutableSortedMap r0 = of(r0, r1, r2)
            return r0
    }

    static /* synthetic */ com.google.common.collect.RegularImmutableSortedSet access$100(com.google.common.collect.ImmutableSortedMap r0) {
            com.google.common.collect.RegularImmutableSortedSet<K> r0 = r0.keySet
            return r0
    }

    static /* synthetic */ com.google.common.collect.ImmutableList access$200(com.google.common.collect.ImmutableSortedMap r0) {
            com.google.common.collect.ImmutableList<V> r0 = r0.valueList
            return r0
    }

    @com.google.common.annotations.Beta
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> r1) {
            java.util.Comparator<java.lang.Comparable> r0 = com.google.common.collect.ImmutableSortedMap.NATURAL_ORDER
            com.google.common.collect.Ordering r0 = (com.google.common.collect.Ordering) r0
            com.google.common.collect.ImmutableSortedMap r1 = copyOf(r1, r0)
            return r1
    }

    @com.google.common.annotations.Beta
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> r1, java.util.Comparator<? super K> r2) {
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.util.Comparator r2 = (java.util.Comparator) r2
            r0 = 0
            com.google.common.collect.ImmutableSortedMap r1 = fromEntries(r2, r0, r1)
            return r1
    }

    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> copyOf(java.util.Map<? extends K, ? extends V> r1) {
            java.util.Comparator<java.lang.Comparable> r0 = com.google.common.collect.ImmutableSortedMap.NATURAL_ORDER
            com.google.common.collect.Ordering r0 = (com.google.common.collect.Ordering) r0
            com.google.common.collect.ImmutableSortedMap r1 = copyOfInternal(r1, r0)
            return r1
    }

    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> copyOf(java.util.Map<? extends K, ? extends V> r0, java.util.Comparator<? super K> r1) {
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.Comparator r1 = (java.util.Comparator) r1
            com.google.common.collect.ImmutableSortedMap r0 = copyOfInternal(r0, r1)
            return r0
    }

    private static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> copyOfInternal(java.util.Map<? extends K, ? extends V> r3, java.util.Comparator<? super K> r4) {
            boolean r0 = r3 instanceof java.util.SortedMap
            r1 = 0
            if (r0 == 0) goto L18
            r0 = r3
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            java.util.Comparator r0 = r0.comparator()
            if (r0 != 0) goto L14
            java.util.Comparator<java.lang.Comparable> r0 = com.google.common.collect.ImmutableSortedMap.NATURAL_ORDER
            if (r4 != r0) goto L18
            r1 = 1
            goto L18
        L14:
            boolean r1 = r4.equals(r0)
        L18:
            if (r1 == 0) goto L28
            boolean r0 = r3 instanceof com.google.common.collect.ImmutableSortedMap
            if (r0 == 0) goto L28
            r0 = r3
            com.google.common.collect.ImmutableSortedMap r0 = (com.google.common.collect.ImmutableSortedMap) r0
            boolean r2 = r0.isPartialView()
            if (r2 != 0) goto L28
            return r0
        L28:
            java.util.Set r3 = r3.entrySet()
            com.google.common.collect.ImmutableSortedMap r3 = fromEntries(r4, r1, r3)
            return r3
    }

    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> copyOfSorted(java.util.SortedMap<K, ? extends V> r3) {
            java.util.Comparator r0 = r3.comparator()
            if (r0 != 0) goto L8
            java.util.Comparator<java.lang.Comparable> r0 = com.google.common.collect.ImmutableSortedMap.NATURAL_ORDER
        L8:
            boolean r1 = r3 instanceof com.google.common.collect.ImmutableSortedMap
            if (r1 == 0) goto L16
            r1 = r3
            com.google.common.collect.ImmutableSortedMap r1 = (com.google.common.collect.ImmutableSortedMap) r1
            boolean r2 = r1.isPartialView()
            if (r2 != 0) goto L16
            return r1
        L16:
            r1 = 1
            java.util.Set r3 = r3.entrySet()
            com.google.common.collect.ImmutableSortedMap r3 = fromEntries(r0, r1, r3)
            return r3
    }

    static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> emptyMap(java.util.Comparator<? super K> r2) {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lf
            com.google.common.collect.ImmutableSortedMap r2 = of()
            return r2
        Lf:
            com.google.common.collect.ImmutableSortedMap r0 = new com.google.common.collect.ImmutableSortedMap
            com.google.common.collect.RegularImmutableSortedSet r2 = com.google.common.collect.ImmutableSortedSet.emptySet(r2)
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
            r0.<init>(r2, r1)
            return r0
    }

    private static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> fromEntries(java.util.Comparator<? super K> r1, boolean r2, java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> r3) {
            java.util.Map$Entry<?, ?>[] r0 = com.google.common.collect.ImmutableMap.EMPTY_ENTRY_ARRAY
            java.lang.Object[] r3 = com.google.common.collect.Iterables.toArray(r3, r0)
            java.util.Map$Entry[] r3 = (java.util.Map.Entry[]) r3
            java.util.Map$Entry[] r3 = (java.util.Map.Entry[]) r3
            int r0 = r3.length
            com.google.common.collect.ImmutableSortedMap r1 = fromEntries(r1, r2, r3, r0)
            return r1
    }

    private static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> fromEntries(java.util.Comparator<? super K> r9, boolean r10, java.util.Map.Entry<K, V>[] r11, int r12) {
            if (r12 == 0) goto L93
            r0 = 1
            r1 = 0
            if (r12 == r0) goto L82
            java.lang.Object[] r2 = new java.lang.Object[r12]
            java.lang.Object[] r3 = new java.lang.Object[r12]
            if (r10 == 0) goto L24
        Lc:
            if (r1 >= r12) goto L6f
            r10 = r11[r1]
            java.lang.Object r10 = r10.getKey()
            r0 = r11[r1]
            java.lang.Object r0 = r0.getValue()
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r10, r0)
            r2[r1] = r10
            r3[r1] = r0
            int r1 = r1 + 1
            goto Lc
        L24:
            com.google.common.collect.ImmutableSortedMap$1 r10 = new com.google.common.collect.ImmutableSortedMap$1
            r10.<init>(r9)
            java.util.Arrays.sort(r11, r1, r12, r10)
            r10 = r11[r1]
            java.lang.Object r10 = r10.getKey()
            r2[r1] = r10
            r4 = r11[r1]
            java.lang.Object r4 = r4.getValue()
            r3[r1] = r4
            r5 = r2[r1]
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r5, r4)
            r4 = 1
        L42:
            if (r4 >= r12) goto L6f
            r5 = r11[r4]
            java.lang.Object r5 = r5.getKey()
            r6 = r11[r4]
            java.lang.Object r6 = r6.getValue()
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r5, r6)
            r2[r4] = r5
            r3[r4] = r6
            int r10 = r9.compare(r10, r5)
            if (r10 == 0) goto L5f
            r10 = 1
            goto L60
        L5f:
            r10 = 0
        L60:
            int r6 = r4 + (-1)
            r6 = r11[r6]
            r7 = r11[r4]
            java.lang.String r8 = "key"
            com.google.common.collect.ImmutableMap.checkNoConflict(r10, r8, r6, r7)
            int r4 = r4 + 1
            r10 = r5
            goto L42
        L6f:
            com.google.common.collect.ImmutableSortedMap r10 = new com.google.common.collect.ImmutableSortedMap
            com.google.common.collect.RegularImmutableSortedSet r11 = new com.google.common.collect.RegularImmutableSortedSet
            com.google.common.collect.ImmutableList r12 = com.google.common.collect.ImmutableList.asImmutableList(r2)
            r11.<init>(r12, r9)
            com.google.common.collect.ImmutableList r9 = com.google.common.collect.ImmutableList.asImmutableList(r3)
            r10.<init>(r11, r9)
            return r10
        L82:
            r10 = r11[r1]
            java.lang.Object r10 = r10.getKey()
            r11 = r11[r1]
            java.lang.Object r11 = r11.getValue()
            com.google.common.collect.ImmutableSortedMap r9 = of(r9, r10, r11)
            return r9
        L93:
            com.google.common.collect.ImmutableSortedMap r9 = emptyMap(r9)
            return r9
    }

    private com.google.common.collect.ImmutableSortedMap<K, V> getSubMap(int r4, int r5) {
            r3 = this;
            if (r4 != 0) goto L9
            int r0 = r3.size()
            if (r5 != r0) goto L9
            return r3
        L9:
            if (r4 != r5) goto L14
            java.util.Comparator r4 = r3.comparator()
            com.google.common.collect.ImmutableSortedMap r4 = emptyMap(r4)
            return r4
        L14:
            com.google.common.collect.ImmutableSortedMap r0 = new com.google.common.collect.ImmutableSortedMap
            com.google.common.collect.RegularImmutableSortedSet<K> r1 = r3.keySet
            com.google.common.collect.RegularImmutableSortedSet r1 = r1.getSubSet(r4, r5)
            com.google.common.collect.ImmutableList<V> r2 = r3.valueList
            com.google.common.collect.ImmutableList r4 = r2.subList(r4, r5)
            r0.<init>(r1, r4)
            return r0
    }

    public static <K extends java.lang.Comparable<?>, V> com.google.common.collect.ImmutableSortedMap.Builder<K, V> naturalOrder() {
            com.google.common.collect.ImmutableSortedMap$Builder r0 = new com.google.common.collect.ImmutableSortedMap$Builder
            com.google.common.collect.Ordering r1 = com.google.common.collect.Ordering.natural()
            r0.<init>(r1)
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> of() {
            com.google.common.collect.ImmutableSortedMap<java.lang.Comparable, java.lang.Object> r0 = com.google.common.collect.ImmutableSortedMap.NATURAL_EMPTY_MAP
            return r0
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable r1, java.lang.Object r2) {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            com.google.common.collect.ImmutableSortedMap r1 = of(r0, r1, r2)
            return r1
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable r0, java.lang.Object r1, java.lang.Comparable r2, java.lang.Object r3) {
            java.util.Map$Entry r0 = com.google.common.collect.ImmutableMap.entryOf(r0, r1)
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r2, r3)
            r2 = 2
            java.util.Map$Entry[] r2 = new java.util.Map.Entry[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            com.google.common.collect.ImmutableSortedMap r0 = ofEntries(r2)
            return r0
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable r0, java.lang.Object r1, java.lang.Comparable r2, java.lang.Object r3, java.lang.Comparable r4, java.lang.Object r5) {
            java.util.Map$Entry r0 = com.google.common.collect.ImmutableMap.entryOf(r0, r1)
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r2, r3)
            java.util.Map$Entry r2 = com.google.common.collect.ImmutableMap.entryOf(r4, r5)
            r3 = 3
            java.util.Map$Entry[] r3 = new java.util.Map.Entry[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r2
            com.google.common.collect.ImmutableSortedMap r0 = ofEntries(r3)
            return r0
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable r0, java.lang.Object r1, java.lang.Comparable r2, java.lang.Object r3, java.lang.Comparable r4, java.lang.Object r5, java.lang.Comparable r6, java.lang.Object r7) {
            java.util.Map$Entry r0 = com.google.common.collect.ImmutableMap.entryOf(r0, r1)
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r2, r3)
            java.util.Map$Entry r2 = com.google.common.collect.ImmutableMap.entryOf(r4, r5)
            java.util.Map$Entry r3 = com.google.common.collect.ImmutableMap.entryOf(r6, r7)
            r4 = 4
            java.util.Map$Entry[] r4 = new java.util.Map.Entry[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r0 = 2
            r4[r0] = r2
            r0 = 3
            r4[r0] = r3
            com.google.common.collect.ImmutableSortedMap r0 = ofEntries(r4)
            return r0
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable r0, java.lang.Object r1, java.lang.Comparable r2, java.lang.Object r3, java.lang.Comparable r4, java.lang.Object r5, java.lang.Comparable r6, java.lang.Object r7, java.lang.Comparable r8, java.lang.Object r9) {
            java.util.Map$Entry r0 = com.google.common.collect.ImmutableMap.entryOf(r0, r1)
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r2, r3)
            java.util.Map$Entry r2 = com.google.common.collect.ImmutableMap.entryOf(r4, r5)
            java.util.Map$Entry r3 = com.google.common.collect.ImmutableMap.entryOf(r6, r7)
            java.util.Map$Entry r4 = com.google.common.collect.ImmutableMap.entryOf(r8, r9)
            r5 = 5
            java.util.Map$Entry[] r5 = new java.util.Map.Entry[r5]
            r6 = 0
            r5[r6] = r0
            r0 = 1
            r5[r0] = r1
            r0 = 2
            r5[r0] = r2
            r0 = 3
            r5[r0] = r3
            r0 = 4
            r5[r0] = r4
            com.google.common.collect.ImmutableSortedMap r0 = ofEntries(r5)
            return r0
    }

    private static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> of(java.util.Comparator<? super K> r2, K r3, V r4) {
            com.google.common.collect.ImmutableSortedMap r0 = new com.google.common.collect.ImmutableSortedMap
            com.google.common.collect.RegularImmutableSortedSet r1 = new com.google.common.collect.RegularImmutableSortedSet
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.of(r3)
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.util.Comparator r2 = (java.util.Comparator) r2
            r1.<init>(r3, r2)
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of(r4)
            r0.<init>(r1, r2)
            return r0
    }

    private static <K extends java.lang.Comparable<? super K>, V> com.google.common.collect.ImmutableSortedMap<K, V> ofEntries(java.util.Map.Entry<K, V>... r3) {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            r1 = 0
            int r2 = r3.length
            com.google.common.collect.ImmutableSortedMap r3 = fromEntries(r0, r1, r3, r2)
            return r3
    }

    public static <K, V> com.google.common.collect.ImmutableSortedMap.Builder<K, V> orderedBy(java.util.Comparator<K> r1) {
            com.google.common.collect.ImmutableSortedMap$Builder r0 = new com.google.common.collect.ImmutableSortedMap$Builder
            r0.<init>(r1)
            return r0
    }

    public static <K extends java.lang.Comparable<?>, V> com.google.common.collect.ImmutableSortedMap.Builder<K, V> reverseOrder() {
            com.google.common.collect.ImmutableSortedMap$Builder r0 = new com.google.common.collect.ImmutableSortedMap$Builder
            com.google.common.collect.Ordering r1 = com.google.common.collect.Ordering.natural()
            com.google.common.collect.Ordering r1 = r1.reverse()
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> ceilingEntry(K r2) {
            r1 = this;
            r0 = 1
            com.google.common.collect.ImmutableSortedMap r2 = r1.tailMap(r2, r0)
            java.util.Map$Entry r2 = r2.firstEntry()
            return r2
    }

    @Override // java.util.NavigableMap
    public K ceilingKey(K r1) {
            r0 = this;
            java.util.Map$Entry r1 = r0.ceilingEntry(r1)
            java.lang.Object r1 = com.google.common.collect.Maps.keyOrNull(r1)
            return r1
    }

    @Override // java.util.SortedMap
    public java.util.Comparator<? super K> comparator() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet r0 = r1.keySet()
            java.util.Comparator r0 = r0.comparator()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap
    com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> createEntrySet() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lb
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of()
            return r0
        Lb:
            com.google.common.collect.ImmutableSortedMap$1EntrySet r0 = new com.google.common.collect.ImmutableSortedMap$1EntrySet
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap
    com.google.common.collect.ImmutableSet<K> createKeySet() {
            r2 = this;
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "should never be called"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.common.collect.ImmutableMap
    com.google.common.collect.ImmutableCollection<V> createValues() {
            r2 = this;
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "should never be called"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.NavigableMap
    public com.google.common.collect.ImmutableSortedSet<K> descendingKeySet() {
            r1 = this;
            com.google.common.collect.RegularImmutableSortedSet<K> r0 = r1.keySet
            com.google.common.collect.ImmutableSortedSet r0 = r0.descendingSet()
            return r0
    }

    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ java.util.NavigableSet descendingKeySet() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet r0 = r1.descendingKeySet()
            return r0
    }

    @Override // java.util.NavigableMap
    public com.google.common.collect.ImmutableSortedMap<K, V> descendingMap() {
            r3 = this;
            com.google.common.collect.ImmutableSortedMap<K, V> r0 = r3.descendingMap
            if (r0 != 0) goto L2e
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L1b
            java.util.Comparator r0 = r3.comparator()
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.from(r0)
            com.google.common.collect.Ordering r0 = r0.reverse()
            com.google.common.collect.ImmutableSortedMap r0 = emptyMap(r0)
            return r0
        L1b:
            com.google.common.collect.ImmutableSortedMap r0 = new com.google.common.collect.ImmutableSortedMap
            com.google.common.collect.RegularImmutableSortedSet<K> r1 = r3.keySet
            com.google.common.collect.ImmutableSortedSet r1 = r1.descendingSet()
            com.google.common.collect.RegularImmutableSortedSet r1 = (com.google.common.collect.RegularImmutableSortedSet) r1
            com.google.common.collect.ImmutableList<V> r2 = r3.valueList
            com.google.common.collect.ImmutableList r2 = r2.reverse()
            r0.<init>(r1, r2, r3)
        L2e:
            return r0
    }

    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ java.util.NavigableMap descendingMap() {
            r1 = this;
            com.google.common.collect.ImmutableSortedMap r0 = r1.descendingMap()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = super.entrySet()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public /* bridge */ /* synthetic */ java.util.Set entrySet() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.entrySet()
            return r0
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> firstEntry() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            return r0
        L8:
            com.google.common.collect.ImmutableSet r0 = r2.entrySet()
            com.google.common.collect.ImmutableList r0 = r0.asList()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
    }

    @Override // java.util.SortedMap
    public K firstKey() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet r0 = r1.keySet()
            java.lang.Object r0 = r0.first()
            return r0
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> floorEntry(K r2) {
            r1 = this;
            r0 = 1
            com.google.common.collect.ImmutableSortedMap r2 = r1.headMap(r2, r0)
            java.util.Map$Entry r2 = r2.lastEntry()
            return r2
    }

    @Override // java.util.NavigableMap
    public K floorKey(K r1) {
            r0 = this;
            java.util.Map$Entry r1 = r0.floorEntry(r1)
            java.lang.Object r1 = com.google.common.collect.Maps.keyOrNull(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public V get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.RegularImmutableSortedSet<K> r0 = r1.keySet
            int r2 = r0.indexOf(r2)
            r0 = -1
            if (r2 != r0) goto Lb
            r2 = 0
            return r2
        Lb:
            com.google.common.collect.ImmutableList<V> r0 = r1.valueList
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public com.google.common.collect.ImmutableSortedMap<K, V> headMap(K r2) {
            r1 = this;
            r0 = 0
            com.google.common.collect.ImmutableSortedMap r2 = r1.headMap(r2, r0)
            return r2
    }

    @Override // java.util.NavigableMap
    public com.google.common.collect.ImmutableSortedMap<K, V> headMap(K r2, boolean r3) {
            r1 = this;
            com.google.common.collect.RegularImmutableSortedSet<K> r0 = r1.keySet
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            int r2 = r0.headIndex(r2, r3)
            r3 = 0
            com.google.common.collect.ImmutableSortedMap r2 = r1.getSubMap(r3, r2)
            return r2
    }

    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ java.util.NavigableMap headMap(java.lang.Object r1, boolean r2) {
            r0 = this;
            com.google.common.collect.ImmutableSortedMap r1 = r0.headMap(r1, r2)
            return r1
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public /* bridge */ /* synthetic */ java.util.SortedMap headMap(java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableSortedMap r1 = r0.headMap(r1)
            return r1
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> higherEntry(K r2) {
            r1 = this;
            r0 = 0
            com.google.common.collect.ImmutableSortedMap r2 = r1.tailMap(r2, r0)
            java.util.Map$Entry r2 = r2.firstEntry()
            return r2
    }

    @Override // java.util.NavigableMap
    public K higherKey(K r1) {
            r0 = this;
            java.util.Map$Entry r1 = r0.higherEntry(r1)
            java.lang.Object r1 = com.google.common.collect.Maps.keyOrNull(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMap
    boolean isPartialView() {
            r1 = this;
            com.google.common.collect.RegularImmutableSortedSet<K> r0 = r1.keySet
            boolean r0 = r0.isPartialView()
            if (r0 != 0) goto L13
            com.google.common.collect.ImmutableList<V> r0 = r1.valueList
            boolean r0 = r0.isPartialView()
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            return r0
        L13:
            r0 = 1
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableSet keySet() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet r0 = r1.keySet()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public com.google.common.collect.ImmutableSortedSet<K> keySet() {
            r1 = this;
            com.google.common.collect.RegularImmutableSortedSet<K> r0 = r1.keySet
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public /* bridge */ /* synthetic */ java.util.Set keySet() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet r0 = r1.keySet()
            return r0
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> lastEntry() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            return r0
        L8:
            com.google.common.collect.ImmutableSet r0 = r2.entrySet()
            com.google.common.collect.ImmutableList r0 = r0.asList()
            int r1 = r2.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
    }

    @Override // java.util.SortedMap
    public K lastKey() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet r0 = r1.keySet()
            java.lang.Object r0 = r0.last()
            return r0
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> lowerEntry(K r2) {
            r1 = this;
            r0 = 0
            com.google.common.collect.ImmutableSortedMap r2 = r1.headMap(r2, r0)
            java.util.Map$Entry r2 = r2.lastEntry()
            return r2
    }

    @Override // java.util.NavigableMap
    public K lowerKey(K r1) {
            r0 = this;
            java.util.Map$Entry r1 = r0.lowerEntry(r1)
            java.lang.Object r1 = com.google.common.collect.Maps.keyOrNull(r1)
            return r1
    }

    @Override // java.util.NavigableMap
    public com.google.common.collect.ImmutableSortedSet<K> navigableKeySet() {
            r1 = this;
            com.google.common.collect.RegularImmutableSortedSet<K> r0 = r1.keySet
            return r0
    }

    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ java.util.NavigableSet navigableKeySet() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet r0 = r1.navigableKeySet()
            return r0
    }

    @Override // java.util.NavigableMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public final java.util.Map.Entry<K, V> pollFirstEntry() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.NavigableMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public final java.util.Map.Entry<K, V> pollLastEntry() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Map
    public int size() {
            r1 = this;
            com.google.common.collect.ImmutableList<V> r0 = r1.valueList
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public com.google.common.collect.ImmutableSortedMap<K, V> subMap(K r3, K r4) {
            r2 = this;
            r0 = 1
            r1 = 0
            com.google.common.collect.ImmutableSortedMap r3 = r2.subMap(r3, r0, r4, r1)
            return r3
    }

    @Override // java.util.NavigableMap
    public com.google.common.collect.ImmutableSortedMap<K, V> subMap(K r3, boolean r4, K r5, boolean r6) {
            r2 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.base.Preconditions.checkNotNull(r5)
            java.util.Comparator r0 = r2.comparator()
            int r0 = r0.compare(r3, r5)
            if (r0 > 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            java.lang.String r1 = "expected fromKey <= toKey but %s > %s"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r3, r5)
            com.google.common.collect.ImmutableSortedMap r5 = r2.headMap(r5, r6)
            com.google.common.collect.ImmutableSortedMap r3 = r5.tailMap(r3, r4)
            return r3
    }

    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ java.util.NavigableMap subMap(java.lang.Object r1, boolean r2, java.lang.Object r3, boolean r4) {
            r0 = this;
            com.google.common.collect.ImmutableSortedMap r1 = r0.subMap(r1, r2, r3, r4)
            return r1
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public /* bridge */ /* synthetic */ java.util.SortedMap subMap(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            com.google.common.collect.ImmutableSortedMap r1 = r0.subMap(r1, r2)
            return r1
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public com.google.common.collect.ImmutableSortedMap<K, V> tailMap(K r2) {
            r1 = this;
            r0 = 1
            com.google.common.collect.ImmutableSortedMap r2 = r1.tailMap(r2, r0)
            return r2
    }

    @Override // java.util.NavigableMap
    public com.google.common.collect.ImmutableSortedMap<K, V> tailMap(K r2, boolean r3) {
            r1 = this;
            com.google.common.collect.RegularImmutableSortedSet<K> r0 = r1.keySet
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            int r2 = r0.tailIndex(r2, r3)
            int r3 = r1.size()
            com.google.common.collect.ImmutableSortedMap r2 = r1.getSubMap(r2, r3)
            return r2
    }

    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ java.util.NavigableMap tailMap(java.lang.Object r1, boolean r2) {
            r0 = this;
            com.google.common.collect.ImmutableSortedMap r1 = r0.tailMap(r1, r2)
            return r1
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public /* bridge */ /* synthetic */ java.util.SortedMap tailMap(java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableSortedMap r1 = r0.tailMap(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public com.google.common.collect.ImmutableCollection<V> values() {
            r1 = this;
            com.google.common.collect.ImmutableList<V> r0 = r1.valueList
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public /* bridge */ /* synthetic */ java.util.Collection values() {
            r1 = this;
            com.google.common.collect.ImmutableCollection r0 = r1.values()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap
    java.lang.Object writeReplace() {
            r1 = this;
            com.google.common.collect.ImmutableSortedMap$SerializedForm r0 = new com.google.common.collect.ImmutableSortedMap$SerializedForm
            r0.<init>(r1)
            return r0
    }
}
