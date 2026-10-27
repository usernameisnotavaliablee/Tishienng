package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ImmutableSetMultimap<K, V> extends com.google.common.collect.ImmutableMultimap<K, V> implements com.google.common.collect.SetMultimap<K, V> {

    @com.google.common.annotations.GwtIncompatible
    private static final long serialVersionUID = 0;
    private final transient com.google.common.collect.ImmutableSet<V> emptySet;

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    private transient com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> entries;

    @com.google.j2objc.annotations.RetainedWith
    @com.google.errorprone.annotations.concurrent.LazyInit
    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    private transient com.google.common.collect.ImmutableSetMultimap<V, K> inverse;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder<K, V> extends com.google.common.collect.ImmutableMultimap.Builder<K, V> {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap build() {
                r1 = this;
                com.google.common.collect.ImmutableSetMultimap r0 = r1.build()
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public com.google.common.collect.ImmutableSetMultimap<K, V> build() {
                r2 = this;
                java.util.Map<K, java.util.Collection<V>> r0 = r2.builderMap
                java.util.Set r0 = r0.entrySet()
                java.util.Comparator<? super K> r1 = r2.keyComparator
                if (r1 == 0) goto L16
                com.google.common.collect.Ordering r1 = com.google.common.collect.Ordering.from(r1)
                com.google.common.collect.Ordering r1 = r1.onKeys()
                com.google.common.collect.ImmutableList r0 = r1.immutableSortedCopy(r0)
            L16:
                java.util.Comparator<? super V> r1 = r2.valueComparator
                com.google.common.collect.ImmutableSetMultimap r0 = com.google.common.collect.ImmutableSetMultimap.fromMapEntries(r0, r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        java.util.Collection<V> newMutableValueCollection() {
                r1 = this;
                java.util.Set r0 = com.google.common.collect.Platform.preservesInsertionOrderOnAddsSet()
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder orderKeysBy(java.util.Comparator r1) {
                r0 = this;
                com.google.common.collect.ImmutableSetMultimap$Builder r1 = r0.orderKeysBy(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSetMultimap.Builder<K, V> orderKeysBy(java.util.Comparator<? super K> r1) {
                r0 = this;
                super.orderKeysBy(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder orderValuesBy(java.util.Comparator r1) {
                r0 = this;
                com.google.common.collect.ImmutableSetMultimap$Builder r1 = r0.orderValuesBy(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSetMultimap.Builder<K, V> orderValuesBy(java.util.Comparator<? super V> r1) {
                r0 = this;
                super.orderValuesBy(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder put(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                com.google.common.collect.ImmutableSetMultimap$Builder r1 = r0.put(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder put(java.util.Map.Entry r1) {
                r0 = this;
                com.google.common.collect.ImmutableSetMultimap$Builder r1 = r0.put(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSetMultimap.Builder<K, V> put(K r1, V r2) {
                r0 = this;
                super.put(r1, r2)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSetMultimap.Builder<K, V> put(java.util.Map.Entry<? extends K, ? extends V> r1) {
                r0 = this;
                super.put(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder putAll(com.google.common.collect.Multimap r1) {
                r0 = this;
                com.google.common.collect.ImmutableSetMultimap$Builder r1 = r0.putAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.common.annotations.Beta
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder putAll(java.lang.Iterable r1) {
                r0 = this;
                com.google.common.collect.ImmutableSetMultimap$Builder r1 = r0.putAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder putAll(java.lang.Object r1, java.lang.Iterable r2) {
                r0 = this;
                com.google.common.collect.ImmutableSetMultimap$Builder r1 = r0.putAll(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder putAll(java.lang.Object r1, java.lang.Object[] r2) {
                r0 = this;
                com.google.common.collect.ImmutableSetMultimap$Builder r1 = r0.putAll(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSetMultimap.Builder<K, V> putAll(com.google.common.collect.Multimap<? extends K, ? extends V> r3) {
                r2 = this;
                java.util.Map r3 = r3.asMap()
                java.util.Set r3 = r3.entrySet()
                java.util.Iterator r3 = r3.iterator()
            Lc:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L26
                java.lang.Object r0 = r3.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                java.lang.Object r0 = r0.getValue()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                r2.putAll(r1, r0)
                goto Lc
            L26:
                return r2
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.common.annotations.Beta
        public com.google.common.collect.ImmutableSetMultimap.Builder<K, V> putAll(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> r1) {
                r0 = this;
                super.putAll(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSetMultimap.Builder<K, V> putAll(K r1, java.lang.Iterable<? extends V> r2) {
                r0 = this;
                super.putAll(r1, r2)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSetMultimap.Builder<K, V> putAll(K r1, V... r2) {
                r0 = this;
                java.util.List r2 = java.util.Arrays.asList(r2)
                com.google.common.collect.ImmutableSetMultimap$Builder r1 = r0.putAll(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class EntrySet<K, V> extends com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> {

        @com.google.j2objc.annotations.Weak
        private final transient com.google.common.collect.ImmutableSetMultimap<K, V> multimap;

        EntrySet(com.google.common.collect.ImmutableSetMultimap<K, V> r1) {
                r0 = this;
                r0.<init>()
                r0.multimap = r1
                return
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof java.util.Map.Entry
                if (r0 == 0) goto L15
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                com.google.common.collect.ImmutableSetMultimap<K, V> r0 = r2.multimap
                java.lang.Object r1 = r3.getKey()
                java.lang.Object r3 = r3.getValue()
                boolean r3 = r0.containsEntry(r1, r3)
                return r3
            L15:
                r3 = 0
                return r3
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> iterator() {
                r1 = this;
                com.google.common.collect.ImmutableSetMultimap<K, V> r0 = r1.multimap
                com.google.common.collect.UnmodifiableIterator r0 = r0.entryIterator()
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
                com.google.common.collect.ImmutableSetMultimap<K, V> r0 = r1.multimap
                int r0 = r0.size()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.GwtIncompatible
    private static final class SetFieldSettersHolder {
        static final com.google.common.collect.Serialization.FieldSetter<com.google.common.collect.ImmutableSetMultimap> EMPTY_SET_FIELD_SETTER = null;

        static {
                java.lang.Class<com.google.common.collect.ImmutableSetMultimap> r0 = com.google.common.collect.ImmutableSetMultimap.class
                java.lang.String r1 = "emptySet"
                com.google.common.collect.Serialization$FieldSetter r0 = com.google.common.collect.Serialization.getFieldSetter(r0, r1)
                com.google.common.collect.ImmutableSetMultimap.SetFieldSettersHolder.EMPTY_SET_FIELD_SETTER = r0
                return
        }

        private SetFieldSettersHolder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    ImmutableSetMultimap(com.google.common.collect.ImmutableMap<K, com.google.common.collect.ImmutableSet<V>> r1, int r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.util.Comparator<? super V> r3) {
            r0 = this;
            r0.<init>(r1, r2)
            com.google.common.collect.ImmutableSet r1 = emptySet(r3)
            r0.emptySet = r1
            return
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap.Builder<K, V> builder() {
            com.google.common.collect.ImmutableSetMultimap$Builder r0 = new com.google.common.collect.ImmutableSetMultimap$Builder
            r0.<init>()
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> copyOf(com.google.common.collect.Multimap<? extends K, ? extends V> r1) {
            r0 = 0
            com.google.common.collect.ImmutableSetMultimap r1 = copyOf(r1, r0)
            return r1
    }

    private static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> copyOf(com.google.common.collect.Multimap<? extends K, ? extends V> r2, java.util.Comparator<? super V> r3) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L10
            if (r3 != 0) goto L10
            com.google.common.collect.ImmutableSetMultimap r2 = of()
            return r2
        L10:
            boolean r0 = r2 instanceof com.google.common.collect.ImmutableSetMultimap
            if (r0 == 0) goto L1e
            r0 = r2
            com.google.common.collect.ImmutableSetMultimap r0 = (com.google.common.collect.ImmutableSetMultimap) r0
            boolean r1 = r0.isPartialView()
            if (r1 != 0) goto L1e
            return r0
        L1e:
            java.util.Map r2 = r2.asMap()
            java.util.Set r2 = r2.entrySet()
            com.google.common.collect.ImmutableSetMultimap r2 = fromMapEntries(r2, r3)
            return r2
    }

    @com.google.common.annotations.Beta
    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> r1) {
            com.google.common.collect.ImmutableSetMultimap$Builder r0 = new com.google.common.collect.ImmutableSetMultimap$Builder
            r0.<init>()
            com.google.common.collect.ImmutableSetMultimap$Builder r1 = r0.putAll(r1)
            com.google.common.collect.ImmutableSetMultimap r1 = r1.build()
            return r1
    }

    private static <V> com.google.common.collect.ImmutableSet<V> emptySet(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.util.Comparator<? super V> r0) {
            if (r0 != 0) goto L7
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of()
            return r0
        L7:
            com.google.common.collect.RegularImmutableSortedSet r0 = com.google.common.collect.ImmutableSortedSet.emptySet(r0)
            return r0
    }

    static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> fromMapEntries(java.util.Collection<? extends java.util.Map.Entry<? extends K, ? extends java.util.Collection<? extends V>>> r5, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.util.Comparator<? super V> r6) {
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto Lb
            com.google.common.collect.ImmutableSetMultimap r5 = of()
            return r5
        Lb:
            com.google.common.collect.ImmutableMap$Builder r0 = new com.google.common.collect.ImmutableMap$Builder
            int r1 = r5.size()
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
            r1 = 0
        L19:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            java.util.Collection r2 = (java.util.Collection) r2
            com.google.common.collect.ImmutableSet r2 = valueSet(r6, r2)
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L19
            r0.put(r3, r2)
            int r2 = r2.size()
            int r1 = r1 + r2
            goto L19
        L42:
            com.google.common.collect.ImmutableSetMultimap r5 = new com.google.common.collect.ImmutableSetMultimap
            com.google.common.collect.ImmutableMap r0 = r0.build()
            r5.<init>(r0, r1, r6)
            return r5
    }

    private com.google.common.collect.ImmutableSetMultimap<V, K> invert() {
            r4 = this;
            com.google.common.collect.ImmutableSetMultimap$Builder r0 = builder()
            com.google.common.collect.ImmutableSet r1 = r4.entries()
            com.google.common.collect.UnmodifiableIterator r1 = r1.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.lang.Object r2 = r2.getKey()
            r0.put(r3, r2)
            goto Lc
        L24:
            com.google.common.collect.ImmutableSetMultimap r0 = r0.build()
            r0.inverse = r4
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> of() {
            com.google.common.collect.EmptyImmutableSetMultimap r0 = com.google.common.collect.EmptyImmutableSetMultimap.INSTANCE
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> of(K r1, V r2) {
            com.google.common.collect.ImmutableSetMultimap$Builder r0 = builder()
            r0.put(r1, r2)
            com.google.common.collect.ImmutableSetMultimap r1 = r0.build()
            return r1
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> of(K r1, V r2, K r3, V r4) {
            com.google.common.collect.ImmutableSetMultimap$Builder r0 = builder()
            r0.put(r1, r2)
            r0.put(r3, r4)
            com.google.common.collect.ImmutableSetMultimap r1 = r0.build()
            return r1
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> of(K r1, V r2, K r3, V r4, K r5, V r6) {
            com.google.common.collect.ImmutableSetMultimap$Builder r0 = builder()
            r0.put(r1, r2)
            r0.put(r3, r4)
            r0.put(r5, r6)
            com.google.common.collect.ImmutableSetMultimap r1 = r0.build()
            return r1
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> of(K r1, V r2, K r3, V r4, K r5, V r6, K r7, V r8) {
            com.google.common.collect.ImmutableSetMultimap$Builder r0 = builder()
            r0.put(r1, r2)
            r0.put(r3, r4)
            r0.put(r5, r6)
            r0.put(r7, r8)
            com.google.common.collect.ImmutableSetMultimap r1 = r0.build()
            return r1
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> of(K r1, V r2, K r3, V r4, K r5, V r6, K r7, V r8, K r9, V r10) {
            com.google.common.collect.ImmutableSetMultimap$Builder r0 = builder()
            r0.put(r1, r2)
            r0.put(r3, r4)
            r0.put(r5, r6)
            r0.put(r7, r8)
            r0.put(r9, r10)
            com.google.common.collect.ImmutableSetMultimap r1 = r0.build()
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    private void readObject(java.io.ObjectInputStream r12) throws java.io.IOException, java.lang.ClassNotFoundException {
            r11 = this;
            r12.defaultReadObject()
            java.lang.Object r0 = r12.readObject()
            java.util.Comparator r0 = (java.util.Comparator) r0
            int r1 = r12.readInt()
            if (r1 < 0) goto L9b
            com.google.common.collect.ImmutableMap$Builder r2 = com.google.common.collect.ImmutableMap.builder()
            r3 = 0
            r4 = 0
            r5 = 0
        L16:
            if (r4 >= r1) goto L72
            java.lang.Object r6 = r12.readObject()
            int r7 = r12.readInt()
            if (r7 <= 0) goto L5b
            com.google.common.collect.ImmutableSet$Builder r8 = valuesBuilder(r0)
            r9 = 0
        L27:
            if (r9 >= r7) goto L33
            java.lang.Object r10 = r12.readObject()
            r8.add(r10)
            int r9 = r9 + 1
            goto L27
        L33:
            com.google.common.collect.ImmutableSet r8 = r8.build()
            int r9 = r8.size()
            if (r9 != r7) goto L44
            r2.put(r6, r8)
            int r5 = r5 + r7
            int r4 = r4 + 1
            goto L16
        L44:
            java.io.InvalidObjectException r12 = new java.io.InvalidObjectException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Duplicate key-value pairs exist for key "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        L5b:
            java.io.InvalidObjectException r12 = new java.io.InvalidObjectException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid value count "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        L72:
            com.google.common.collect.ImmutableMap r12 = r2.build()     // Catch: java.lang.IllegalArgumentException -> L8a
            com.google.common.collect.Serialization$FieldSetter<com.google.common.collect.ImmutableMultimap> r1 = com.google.common.collect.ImmutableMultimap.FieldSettersHolder.MAP_FIELD_SETTER
            r1.set(r11, r12)
            com.google.common.collect.Serialization$FieldSetter<com.google.common.collect.ImmutableMultimap> r12 = com.google.common.collect.ImmutableMultimap.FieldSettersHolder.SIZE_FIELD_SETTER
            r12.set(r11, r5)
            com.google.common.collect.Serialization$FieldSetter<com.google.common.collect.ImmutableSetMultimap> r12 = com.google.common.collect.ImmutableSetMultimap.SetFieldSettersHolder.EMPTY_SET_FIELD_SETTER
            com.google.common.collect.ImmutableSet r0 = emptySet(r0)
            r12.set(r11, r0)
            return
        L8a:
            r12 = move-exception
            java.io.InvalidObjectException r0 = new java.io.InvalidObjectException
            java.lang.String r1 = r12.getMessage()
            r0.<init>(r1)
            java.lang.Throwable r12 = r0.initCause(r12)
            java.io.InvalidObjectException r12 = (java.io.InvalidObjectException) r12
            throw r12
        L9b:
            java.io.InvalidObjectException r12 = new java.io.InvalidObjectException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Invalid key count "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
    }

    private static <V> com.google.common.collect.ImmutableSet<V> valueSet(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.util.Comparator<? super V> r0, java.util.Collection<? extends V> r1) {
            if (r0 != 0) goto L7
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.copyOf(r1)
            return r0
        L7:
            com.google.common.collect.ImmutableSortedSet r0 = com.google.common.collect.ImmutableSortedSet.copyOf(r0, r1)
            return r0
    }

    private static <V> com.google.common.collect.ImmutableSet.Builder<V> valuesBuilder(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.util.Comparator<? super V> r1) {
            if (r1 != 0) goto L8
            com.google.common.collect.ImmutableSet$Builder r1 = new com.google.common.collect.ImmutableSet$Builder
            r1.<init>()
            return r1
        L8:
            com.google.common.collect.ImmutableSortedSet$Builder r0 = new com.google.common.collect.ImmutableSortedSet$Builder
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    private void writeObject(java.io.ObjectOutputStream r2) throws java.io.IOException {
            r1 = this;
            r2.defaultWriteObject()
            java.util.Comparator r0 = r1.valueComparator()
            r2.writeObject(r0)
            com.google.common.collect.Serialization.writeMultimap(r1, r2)
            return
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection entries() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.entries()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> entries() {
            r1 = this;
            com.google.common.collect.ImmutableSet<java.util.Map$Entry<K, V>> r0 = r1.entries
            if (r0 != 0) goto Lb
            com.google.common.collect.ImmutableSetMultimap$EntrySet r0 = new com.google.common.collect.ImmutableSetMultimap$EntrySet
            r0.<init>(r1)
            r1.entries = r0
        Lb:
            return r0
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection entries() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.entries()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Set entries() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.entries()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableSet r1 = r0.get(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    public com.google.common.collect.ImmutableSet<V> get(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r2) {
            r1 = this;
            com.google.common.collect.ImmutableMap<K, ? extends com.google.common.collect.ImmutableCollection<V>> r0 = r1.map
            java.lang.Object r2 = r0.get(r2)
            com.google.common.collect.ImmutableSet r2 = (com.google.common.collect.ImmutableSet) r2
            com.google.common.collect.ImmutableSet<V> r0 = r1.emptySet
            java.lang.Object r2 = com.google.common.base.MoreObjects.firstNonNull(r2, r0)
            com.google.common.collect.ImmutableSet r2 = (com.google.common.collect.ImmutableSet) r2
            return r2
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableSet r1 = r0.get(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Set get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableSet r1 = r0.get(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap inverse() {
            r1 = this;
            com.google.common.collect.ImmutableSetMultimap r0 = r1.inverse()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public com.google.common.collect.ImmutableSetMultimap<V, K> inverse() {
            r1 = this;
            com.google.common.collect.ImmutableSetMultimap<V, K> r0 = r1.inverse
            if (r0 != 0) goto La
            com.google.common.collect.ImmutableSetMultimap r0 = r1.invert()
            r1.inverse = r0
        La:
            return r0
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection removeAll(java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableSet r1 = r0.removeAll(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public com.google.common.collect.ImmutableSet<V> removeAll(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.util.Collection removeAll(java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableSet r1 = r0.removeAll(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.util.Set removeAll(java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableSet r1 = r0.removeAll(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection replaceValues(java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            com.google.common.collect.ImmutableSet r1 = r0.replaceValues(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public com.google.common.collect.ImmutableSet<V> replaceValues(K r1, java.lang.Iterable<? extends V> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.util.Collection replaceValues(java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            com.google.common.collect.ImmutableSet r1 = r0.replaceValues(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.util.Set replaceValues(java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            com.google.common.collect.ImmutableSet r1 = r0.replaceValues(r1, r2)
            return r1
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    java.util.Comparator<? super V> valueComparator() {
            r2 = this;
            com.google.common.collect.ImmutableSet<V> r0 = r2.emptySet
            boolean r1 = r0 instanceof com.google.common.collect.ImmutableSortedSet
            if (r1 == 0) goto Ld
            com.google.common.collect.ImmutableSortedSet r0 = (com.google.common.collect.ImmutableSortedSet) r0
            java.util.Comparator r0 = r0.comparator()
            return r0
        Ld:
            r0 = 0
            return r0
    }
}
