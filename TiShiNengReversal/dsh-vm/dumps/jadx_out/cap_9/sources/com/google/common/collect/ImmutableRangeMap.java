package com.google.common.collect;

import java.lang.Comparable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ImmutableRangeMap<K extends java.lang.Comparable<?>, V> implements com.google.common.collect.RangeMap<K, V>, java.io.Serializable {
    private static final com.google.common.collect.ImmutableRangeMap<java.lang.Comparable<?>, java.lang.Object> EMPTY = null;
    private static final long serialVersionUID = 0;
    private final transient com.google.common.collect.ImmutableList<com.google.common.collect.Range<K>> ranges;
    private final transient com.google.common.collect.ImmutableList<V> values;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder<K extends java.lang.Comparable<?>, V> {
        private final java.util.List<java.util.Map.Entry<com.google.common.collect.Range<K>, V>> entries;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = com.google.common.collect.Lists.newArrayList()
                r1.entries = r0
                return
        }

        public com.google.common.collect.ImmutableRangeMap<K, V> build() {
                r6 = this;
                java.util.List<java.util.Map$Entry<com.google.common.collect.Range<K extends java.lang.Comparable<?>>, V>> r0 = r6.entries
                com.google.common.collect.Ordering r1 = com.google.common.collect.Range.rangeLexOrdering()
                com.google.common.collect.Ordering r1 = r1.onKeys()
                java.util.Collections.sort(r0, r1)
                com.google.common.collect.ImmutableList$Builder r0 = new com.google.common.collect.ImmutableList$Builder
                java.util.List<java.util.Map$Entry<com.google.common.collect.Range<K extends java.lang.Comparable<?>>, V>> r1 = r6.entries
                int r1 = r1.size()
                r0.<init>(r1)
                com.google.common.collect.ImmutableList$Builder r1 = new com.google.common.collect.ImmutableList$Builder
                java.util.List<java.util.Map$Entry<com.google.common.collect.Range<K extends java.lang.Comparable<?>>, V>> r2 = r6.entries
                int r2 = r2.size()
                r1.<init>(r2)
                r2 = 0
            L24:
                java.util.List<java.util.Map$Entry<com.google.common.collect.Range<K extends java.lang.Comparable<?>>, V>> r3 = r6.entries
                int r3 = r3.size()
                if (r2 >= r3) goto L91
                java.util.List<java.util.Map$Entry<com.google.common.collect.Range<K extends java.lang.Comparable<?>>, V>> r3 = r6.entries
                java.lang.Object r3 = r3.get(r2)
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r3 = r3.getKey()
                com.google.common.collect.Range r3 = (com.google.common.collect.Range) r3
                if (r2 <= 0) goto L7c
                java.util.List<java.util.Map$Entry<com.google.common.collect.Range<K extends java.lang.Comparable<?>>, V>> r4 = r6.entries
                int r5 = r2 + (-1)
                java.lang.Object r4 = r4.get(r5)
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r4 = r4.getKey()
                com.google.common.collect.Range r4 = (com.google.common.collect.Range) r4
                boolean r5 = r3.isConnected(r4)
                if (r5 == 0) goto L7c
                com.google.common.collect.Range r5 = r3.intersection(r4)
                boolean r5 = r5.isEmpty()
                if (r5 == 0) goto L5d
                goto L7c
            L5d:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Overlapping ranges: range "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r2 = " overlaps with entry "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L7c:
                r0.add(r3)
                java.util.List<java.util.Map$Entry<com.google.common.collect.Range<K extends java.lang.Comparable<?>>, V>> r3 = r6.entries
                java.lang.Object r3 = r3.get(r2)
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r3 = r3.getValue()
                r1.add(r3)
                int r2 = r2 + 1
                goto L24
            L91:
                com.google.common.collect.ImmutableRangeMap r2 = new com.google.common.collect.ImmutableRangeMap
                com.google.common.collect.ImmutableList r0 = r0.build()
                com.google.common.collect.ImmutableList r1 = r1.build()
                r2.<init>(r0, r1)
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableRangeMap.Builder<K, V> put(com.google.common.collect.Range<K> r3, V r4) {
                r2 = this;
                com.google.common.base.Preconditions.checkNotNull(r3)
                com.google.common.base.Preconditions.checkNotNull(r4)
                boolean r0 = r3.isEmpty()
                r0 = r0 ^ 1
                java.lang.String r1 = "Range must not be empty, but was %s"
                com.google.common.base.Preconditions.checkArgument(r0, r1, r3)
                java.util.List<java.util.Map$Entry<com.google.common.collect.Range<K extends java.lang.Comparable<?>>, V>> r0 = r2.entries
                java.util.Map$Entry r3 = com.google.common.collect.Maps.immutableEntry(r3, r4)
                r0.add(r3)
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableRangeMap.Builder<K, V> putAll(com.google.common.collect.RangeMap<K, ? extends V> r3) {
                r2 = this;
                java.util.Map r3 = r3.asMapOfRanges()
                java.util.Set r3 = r3.entrySet()
                java.util.Iterator r3 = r3.iterator()
            Lc:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L26
                java.lang.Object r0 = r3.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
                java.lang.Object r0 = r0.getValue()
                r2.put(r1, r0)
                goto Lc
            L26:
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SerializedForm<K extends java.lang.Comparable<?>, V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.collect.ImmutableMap<com.google.common.collect.Range<K>, V> mapOfRanges;

        SerializedForm(com.google.common.collect.ImmutableMap<com.google.common.collect.Range<K>, V> r1) {
                r0 = this;
                r0.<init>()
                r0.mapOfRanges = r1
                return
        }

        java.lang.Object createRangeMap() {
                r4 = this;
                com.google.common.collect.ImmutableRangeMap$Builder r0 = new com.google.common.collect.ImmutableRangeMap$Builder
                r0.<init>()
                com.google.common.collect.ImmutableMap<com.google.common.collect.Range<K extends java.lang.Comparable<?>>, V> r1 = r4.mapOfRanges
                com.google.common.collect.ImmutableSet r1 = r1.entrySet()
                com.google.common.collect.UnmodifiableIterator r1 = r1.iterator()
            Lf:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L29
                java.lang.Object r2 = r1.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getKey()
                com.google.common.collect.Range r3 = (com.google.common.collect.Range) r3
                java.lang.Object r2 = r2.getValue()
                r0.put(r3, r2)
                goto Lf
            L29:
                com.google.common.collect.ImmutableRangeMap r0 = r0.build()
                return r0
        }

        java.lang.Object readResolve() {
                r1 = this;
                com.google.common.collect.ImmutableMap<com.google.common.collect.Range<K extends java.lang.Comparable<?>>, V> r0 = r1.mapOfRanges
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto Ld
                com.google.common.collect.ImmutableRangeMap r0 = com.google.common.collect.ImmutableRangeMap.of()
                return r0
            Ld:
                java.lang.Object r0 = r1.createRangeMap()
                return r0
        }
    }

    static {
            com.google.common.collect.ImmutableRangeMap r0 = new com.google.common.collect.ImmutableRangeMap
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of()
            r0.<init>(r1, r2)
            com.google.common.collect.ImmutableRangeMap.EMPTY = r0
            return
    }

    ImmutableRangeMap(com.google.common.collect.ImmutableList<com.google.common.collect.Range<K>> r1, com.google.common.collect.ImmutableList<V> r2) {
            r0 = this;
            r0.<init>()
            r0.ranges = r1
            r0.values = r2
            return
    }

    static /* synthetic */ com.google.common.collect.ImmutableList access$000(com.google.common.collect.ImmutableRangeMap r0) {
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r0 = r0.ranges
            return r0
    }

    public static <K extends java.lang.Comparable<?>, V> com.google.common.collect.ImmutableRangeMap.Builder<K, V> builder() {
            com.google.common.collect.ImmutableRangeMap$Builder r0 = new com.google.common.collect.ImmutableRangeMap$Builder
            r0.<init>()
            return r0
    }

    public static <K extends java.lang.Comparable<?>, V> com.google.common.collect.ImmutableRangeMap<K, V> copyOf(com.google.common.collect.RangeMap<K, ? extends V> r4) {
            boolean r0 = r4 instanceof com.google.common.collect.ImmutableRangeMap
            if (r0 == 0) goto L7
            com.google.common.collect.ImmutableRangeMap r4 = (com.google.common.collect.ImmutableRangeMap) r4
            return r4
        L7:
            java.util.Map r4 = r4.asMapOfRanges()
            com.google.common.collect.ImmutableList$Builder r0 = new com.google.common.collect.ImmutableList$Builder
            int r1 = r4.size()
            r0.<init>(r1)
            com.google.common.collect.ImmutableList$Builder r1 = new com.google.common.collect.ImmutableList$Builder
            int r2 = r4.size()
            r1.<init>(r2)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L25:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r4.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            r0.add(r3)
            java.lang.Object r2 = r2.getValue()
            r1.add(r2)
            goto L25
        L40:
            com.google.common.collect.ImmutableRangeMap r4 = new com.google.common.collect.ImmutableRangeMap
            com.google.common.collect.ImmutableList r0 = r0.build()
            com.google.common.collect.ImmutableList r1 = r1.build()
            r4.<init>(r0, r1)
            return r4
    }

    public static <K extends java.lang.Comparable<?>, V> com.google.common.collect.ImmutableRangeMap<K, V> of() {
            com.google.common.collect.ImmutableRangeMap<java.lang.Comparable<?>, java.lang.Object> r0 = com.google.common.collect.ImmutableRangeMap.EMPTY
            return r0
    }

    public static <K extends java.lang.Comparable<?>, V> com.google.common.collect.ImmutableRangeMap<K, V> of(com.google.common.collect.Range<K> r1, V r2) {
            com.google.common.collect.ImmutableRangeMap r0 = new com.google.common.collect.ImmutableRangeMap
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r1)
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of(r2)
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.common.collect.RangeMap
    public com.google.common.collect.ImmutableMap<com.google.common.collect.Range<K>, V> asDescendingMapOfRanges() {
            r3 = this;
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r0 = r3.ranges
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.of()
            return r0
        Ld:
            com.google.common.collect.RegularImmutableSortedSet r0 = new com.google.common.collect.RegularImmutableSortedSet
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r1 = r3.ranges
            com.google.common.collect.ImmutableList r1 = r1.reverse()
            com.google.common.collect.Ordering r2 = com.google.common.collect.Range.rangeLexOrdering()
            com.google.common.collect.Ordering r2 = r2.reverse()
            r0.<init>(r1, r2)
            com.google.common.collect.ImmutableSortedMap r1 = new com.google.common.collect.ImmutableSortedMap
            com.google.common.collect.ImmutableList<V> r2 = r3.values
            com.google.common.collect.ImmutableList r2 = r2.reverse()
            r1.<init>(r0, r2)
            return r1
    }

    @Override // com.google.common.collect.RangeMap
    public /* bridge */ /* synthetic */ java.util.Map asDescendingMapOfRanges() {
            r1 = this;
            com.google.common.collect.ImmutableMap r0 = r1.asDescendingMapOfRanges()
            return r0
    }

    @Override // com.google.common.collect.RangeMap
    public com.google.common.collect.ImmutableMap<com.google.common.collect.Range<K>, V> asMapOfRanges() {
            r3 = this;
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r0 = r3.ranges
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.of()
            return r0
        Ld:
            com.google.common.collect.RegularImmutableSortedSet r0 = new com.google.common.collect.RegularImmutableSortedSet
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r1 = r3.ranges
            com.google.common.collect.Ordering r2 = com.google.common.collect.Range.rangeLexOrdering()
            r0.<init>(r1, r2)
            com.google.common.collect.ImmutableSortedMap r1 = new com.google.common.collect.ImmutableSortedMap
            com.google.common.collect.ImmutableList<V> r2 = r3.values
            r1.<init>(r0, r2)
            return r1
    }

    @Override // com.google.common.collect.RangeMap
    public /* bridge */ /* synthetic */ java.util.Map asMapOfRanges() {
            r1 = this;
            com.google.common.collect.ImmutableMap r0 = r1.asMapOfRanges()
            return r0
    }

    @Override // com.google.common.collect.RangeMap
    @java.lang.Deprecated
    public void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.google.common.collect.RangeMap
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.common.collect.RangeMap
            if (r0 == 0) goto L13
            com.google.common.collect.RangeMap r2 = (com.google.common.collect.RangeMap) r2
            com.google.common.collect.ImmutableMap r0 = r1.asMapOfRanges()
            java.util.Map r2 = r2.asMapOfRanges()
            boolean r2 = r0.equals(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    @Override // com.google.common.collect.RangeMap
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public V get(K r6) {
            r5 = this;
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r0 = r5.ranges
            com.google.common.base.Function r1 = com.google.common.collect.Range.lowerBoundFn()
            com.google.common.collect.Cut r2 = com.google.common.collect.Cut.belowValue(r6)
            com.google.common.collect.SortedLists$KeyPresentBehavior r3 = com.google.common.collect.SortedLists.KeyPresentBehavior.ANY_PRESENT
            com.google.common.collect.SortedLists$KeyAbsentBehavior r4 = com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_LOWER
            int r0 = com.google.common.collect.SortedLists.binarySearch(r0, r1, r2, r3, r4)
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L17
            return r2
        L17:
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r1 = r5.ranges
            java.lang.Object r1 = r1.get(r0)
            com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
            boolean r6 = r1.contains(r6)
            if (r6 == 0) goto L2c
            com.google.common.collect.ImmutableList<V> r6 = r5.values
            java.lang.Object r6 = r6.get(r0)
            return r6
        L2c:
            return r2
    }

    @Override // com.google.common.collect.RangeMap
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public java.util.Map.Entry<com.google.common.collect.Range<K>, V> getEntry(K r6) {
            r5 = this;
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r0 = r5.ranges
            com.google.common.base.Function r1 = com.google.common.collect.Range.lowerBoundFn()
            com.google.common.collect.Cut r2 = com.google.common.collect.Cut.belowValue(r6)
            com.google.common.collect.SortedLists$KeyPresentBehavior r3 = com.google.common.collect.SortedLists.KeyPresentBehavior.ANY_PRESENT
            com.google.common.collect.SortedLists$KeyAbsentBehavior r4 = com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_LOWER
            int r0 = com.google.common.collect.SortedLists.binarySearch(r0, r1, r2, r3, r4)
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L17
            return r2
        L17:
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r1 = r5.ranges
            java.lang.Object r1 = r1.get(r0)
            com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
            boolean r6 = r1.contains(r6)
            if (r6 == 0) goto L30
            com.google.common.collect.ImmutableList<V> r6 = r5.values
            java.lang.Object r6 = r6.get(r0)
            java.util.Map$Entry r6 = com.google.common.collect.Maps.immutableEntry(r1, r6)
            return r6
        L30:
            return r2
    }

    @Override // com.google.common.collect.RangeMap
    public int hashCode() {
            r1 = this;
            com.google.common.collect.ImmutableMap r0 = r1.asMapOfRanges()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.google.common.collect.RangeMap
    @java.lang.Deprecated
    public void put(com.google.common.collect.Range<K> r1, V r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.RangeMap
    @java.lang.Deprecated
    public void putAll(com.google.common.collect.RangeMap<K, V> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.RangeMap
    @java.lang.Deprecated
    public void putCoalescing(com.google.common.collect.Range<K> r1, V r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.RangeMap
    @java.lang.Deprecated
    public void remove(com.google.common.collect.Range<K> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.RangeMap
    public com.google.common.collect.Range<K> span() {
            r3 = this;
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r0 = r3.ranges
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L28
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r0 = r3.ranges
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.common.collect.Range r0 = (com.google.common.collect.Range) r0
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r1 = r3.ranges
            int r2 = r1.size()
            int r2 = r2 + (-1)
            java.lang.Object r1 = r1.get(r2)
            com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r0.lowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r1.upperBound
            com.google.common.collect.Range r0 = com.google.common.collect.Range.create(r0, r1)
            return r0
        L28:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // com.google.common.collect.RangeMap
    public com.google.common.collect.ImmutableRangeMap<K, V> subRangeMap(com.google.common.collect.Range<K> r10) {
            r9 = this;
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r10)
            com.google.common.collect.Range r0 = (com.google.common.collect.Range) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            com.google.common.collect.ImmutableRangeMap r10 = of()
            return r10
        L11:
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r0 = r9.ranges
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L23
            com.google.common.collect.Range r0 = r9.span()
            boolean r0 = r10.encloses(r0)
            if (r0 == 0) goto L25
        L23:
            r4 = r9
            goto L60
        L25:
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r0 = r9.ranges
            com.google.common.base.Function r1 = com.google.common.collect.Range.upperBoundFn()
            com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r10.lowerBound
            com.google.common.collect.SortedLists$KeyPresentBehavior r3 = com.google.common.collect.SortedLists.KeyPresentBehavior.FIRST_AFTER
            com.google.common.collect.SortedLists$KeyAbsentBehavior r4 = com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_HIGHER
            int r0 = com.google.common.collect.SortedLists.binarySearch(r0, r1, r2, r3, r4)
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r1 = r9.ranges
            com.google.common.base.Function r2 = com.google.common.collect.Range.lowerBoundFn()
            com.google.common.collect.Cut<C extends java.lang.Comparable> r3 = r10.upperBound
            com.google.common.collect.SortedLists$KeyPresentBehavior r5 = com.google.common.collect.SortedLists.KeyPresentBehavior.ANY_PRESENT
            int r1 = com.google.common.collect.SortedLists.binarySearch(r1, r2, r3, r5, r4)
            if (r0 < r1) goto L4a
            com.google.common.collect.ImmutableRangeMap r10 = of()
            return r10
        L4a:
            int r2 = r1 - r0
            com.google.common.collect.ImmutableRangeMap$1 r5 = new com.google.common.collect.ImmutableRangeMap$1
            r5.<init>(r9, r2, r0, r10)
            com.google.common.collect.ImmutableRangeMap$2 r3 = new com.google.common.collect.ImmutableRangeMap$2
            com.google.common.collect.ImmutableList<V> r2 = r9.values
            com.google.common.collect.ImmutableList r6 = r2.subList(r0, r1)
            r8 = r9
            r4 = r9
            r7 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L60:
            return r4
    }

    @Override // com.google.common.collect.RangeMap
    public /* bridge */ /* synthetic */ com.google.common.collect.RangeMap subRangeMap(com.google.common.collect.Range r1) {
            r0 = this;
            com.google.common.collect.ImmutableRangeMap r1 = r0.subRangeMap(r1)
            return r1
    }

    @Override // com.google.common.collect.RangeMap
    public java.lang.String toString() {
            r1 = this;
            com.google.common.collect.ImmutableMap r0 = r1.asMapOfRanges()
            java.lang.String r0 = r0.toString()
            return r0
    }

    java.lang.Object writeReplace() {
            r2 = this;
            com.google.common.collect.ImmutableRangeMap$SerializedForm r0 = new com.google.common.collect.ImmutableRangeMap$SerializedForm
            com.google.common.collect.ImmutableMap r1 = r2.asMapOfRanges()
            r0.<init>(r1)
            return r0
    }
}
