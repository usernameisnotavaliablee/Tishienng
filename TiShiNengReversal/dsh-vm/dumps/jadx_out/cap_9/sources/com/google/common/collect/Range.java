package com.google.common.collect;

import java.lang.Comparable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Range<C extends java.lang.Comparable> extends com.google.common.collect.RangeGwtSerializationDependencies implements com.google.common.base.Predicate<C>, java.io.Serializable {
    private static final com.google.common.collect.Range<java.lang.Comparable> ALL = null;
    private static final long serialVersionUID = 0;
    final com.google.common.collect.Cut<C> lowerBound;
    final com.google.common.collect.Cut<C> upperBound;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.collect.Range$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$collect$BoundType = null;

        static {
                com.google.common.collect.BoundType[] r0 = com.google.common.collect.BoundType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.common.collect.Range.AnonymousClass1.$SwitchMap$com$google$common$collect$BoundType = r0
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.OPEN     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.common.collect.Range.AnonymousClass1.$SwitchMap$com$google$common$collect$BoundType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.CLOSED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class LowerBoundFn implements com.google.common.base.Function<com.google.common.collect.Range, com.google.common.collect.Cut> {
        static final com.google.common.collect.Range.LowerBoundFn INSTANCE = null;

        static {
                com.google.common.collect.Range$LowerBoundFn r0 = new com.google.common.collect.Range$LowerBoundFn
                r0.<init>()
                com.google.common.collect.Range.LowerBoundFn.INSTANCE = r0
                return
        }

        LowerBoundFn() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: apply, reason: avoid collision after fix types in other method */
        public com.google.common.collect.Cut apply2(com.google.common.collect.Range r1) {
                r0 = this;
                com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r1.lowerBound
                return r1
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ com.google.common.collect.Cut apply(com.google.common.collect.Range r1) {
                r0 = this;
                com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
                com.google.common.collect.Cut r1 = r0.apply2(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class RangeLexOrdering extends com.google.common.collect.Ordering<com.google.common.collect.Range<?>> implements java.io.Serializable {
        static final com.google.common.collect.Ordering<com.google.common.collect.Range<?>> INSTANCE = null;
        private static final long serialVersionUID = 0;

        static {
                com.google.common.collect.Range$RangeLexOrdering r0 = new com.google.common.collect.Range$RangeLexOrdering
                r0.<init>()
                com.google.common.collect.Range.RangeLexOrdering.INSTANCE = r0
                return
        }

        private RangeLexOrdering() {
                r0 = this;
                r0.<init>()
                return
        }

        public int compare(com.google.common.collect.Range<?> r4, com.google.common.collect.Range<?> r5) {
                r3 = this;
                com.google.common.collect.ComparisonChain r0 = com.google.common.collect.ComparisonChain.start()
                com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r4.lowerBound
                com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r5.lowerBound
                com.google.common.collect.ComparisonChain r0 = r0.compare(r1, r2)
                com.google.common.collect.Cut<C extends java.lang.Comparable> r4 = r4.upperBound
                com.google.common.collect.Cut<C extends java.lang.Comparable> r5 = r5.upperBound
                com.google.common.collect.ComparisonChain r4 = r0.compare(r4, r5)
                int r4 = r4.result()
                return r4
        }

        @Override // com.google.common.collect.Ordering, java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
                com.google.common.collect.Range r2 = (com.google.common.collect.Range) r2
                int r1 = r0.compare(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class UpperBoundFn implements com.google.common.base.Function<com.google.common.collect.Range, com.google.common.collect.Cut> {
        static final com.google.common.collect.Range.UpperBoundFn INSTANCE = null;

        static {
                com.google.common.collect.Range$UpperBoundFn r0 = new com.google.common.collect.Range$UpperBoundFn
                r0.<init>()
                com.google.common.collect.Range.UpperBoundFn.INSTANCE = r0
                return
        }

        UpperBoundFn() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: apply, reason: avoid collision after fix types in other method */
        public com.google.common.collect.Cut apply2(com.google.common.collect.Range r1) {
                r0 = this;
                com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r1.upperBound
                return r1
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ com.google.common.collect.Cut apply(com.google.common.collect.Range r1) {
                r0 = this;
                com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
                com.google.common.collect.Cut r1 = r0.apply2(r1)
                return r1
        }
    }

    static {
            com.google.common.collect.Range r0 = new com.google.common.collect.Range
            com.google.common.collect.Cut r1 = com.google.common.collect.Cut.belowAll()
            com.google.common.collect.Cut r2 = com.google.common.collect.Cut.aboveAll()
            r0.<init>(r1, r2)
            com.google.common.collect.Range.ALL = r0
            return
    }

    private Range(com.google.common.collect.Cut<C> r4, com.google.common.collect.Cut<C> r5) {
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.collect.Cut r0 = (com.google.common.collect.Cut) r0
            r3.lowerBound = r0
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r5)
            com.google.common.collect.Cut r0 = (com.google.common.collect.Cut) r0
            r3.upperBound = r0
            int r0 = r4.compareTo(r5)
            if (r0 > 0) goto L26
            com.google.common.collect.Cut r0 = com.google.common.collect.Cut.aboveAll()
            if (r4 == r0) goto L26
            com.google.common.collect.Cut r0 = com.google.common.collect.Cut.belowAll()
            if (r5 == r0) goto L26
            return
        L26:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid range: "
            r1.append(r2)
            java.lang.String r4 = toString(r4, r5)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> all() {
            com.google.common.collect.Range<java.lang.Comparable> r0 = com.google.common.collect.Range.ALL
            return r0
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> atLeast(C r1) {
            com.google.common.collect.Cut r1 = com.google.common.collect.Cut.belowValue(r1)
            com.google.common.collect.Cut r0 = com.google.common.collect.Cut.aboveAll()
            com.google.common.collect.Range r1 = create(r1, r0)
            return r1
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> atMost(C r1) {
            com.google.common.collect.Cut r0 = com.google.common.collect.Cut.belowAll()
            com.google.common.collect.Cut r1 = com.google.common.collect.Cut.aboveValue(r1)
            com.google.common.collect.Range r1 = create(r0, r1)
            return r1
    }

    private static <T> java.util.SortedSet<T> cast(java.lang.Iterable<T> r0) {
            java.util.SortedSet r0 = (java.util.SortedSet) r0
            return r0
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> closed(C r0, C r1) {
            com.google.common.collect.Cut r0 = com.google.common.collect.Cut.belowValue(r0)
            com.google.common.collect.Cut r1 = com.google.common.collect.Cut.aboveValue(r1)
            com.google.common.collect.Range r0 = create(r0, r1)
            return r0
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> closedOpen(C r0, C r1) {
            com.google.common.collect.Cut r0 = com.google.common.collect.Cut.belowValue(r0)
            com.google.common.collect.Cut r1 = com.google.common.collect.Cut.belowValue(r1)
            com.google.common.collect.Range r0 = create(r0, r1)
            return r0
    }

    static int compareOrThrow(java.lang.Comparable r0, java.lang.Comparable r1) {
            int r0 = r0.compareTo(r1)
            return r0
    }

    static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> create(com.google.common.collect.Cut<C> r1, com.google.common.collect.Cut<C> r2) {
            com.google.common.collect.Range r0 = new com.google.common.collect.Range
            r0.<init>(r1, r2)
            return r0
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> downTo(C r1, com.google.common.collect.BoundType r2) {
            int[] r0 = com.google.common.collect.Range.AnonymousClass1.$SwitchMap$com$google$common$collect$BoundType
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L19
            r0 = 2
            if (r2 != r0) goto L13
            com.google.common.collect.Range r1 = atLeast(r1)
            return r1
        L13:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L19:
            com.google.common.collect.Range r1 = greaterThan(r1)
            return r1
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> encloseAll(java.lang.Iterable<C> r4) {
            com.google.common.base.Preconditions.checkNotNull(r4)
            boolean r0 = r4 instanceof java.util.SortedSet
            if (r0 == 0) goto L2c
            java.util.SortedSet r0 = cast(r4)
            java.util.Comparator r1 = r0.comparator()
            com.google.common.collect.Ordering r2 = com.google.common.collect.Ordering.natural()
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L1b
            if (r1 != 0) goto L2c
        L1b:
            java.lang.Object r4 = r0.first()
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            java.lang.Object r0 = r0.last()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            com.google.common.collect.Range r4 = closed(r4, r0)
            return r4
        L2c:
            java.util.Iterator r4 = r4.iterator()
            java.lang.Object r0 = r4.next()
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r0)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            r1 = r0
        L3b:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L60
            java.lang.Object r2 = r4.next()
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            com.google.common.collect.Ordering r3 = com.google.common.collect.Ordering.natural()
            java.lang.Object r0 = r3.min(r0, r2)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            com.google.common.collect.Ordering r3 = com.google.common.collect.Ordering.natural()
            java.lang.Object r1 = r3.max(r1, r2)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            goto L3b
        L60:
            com.google.common.collect.Range r4 = closed(r0, r1)
            return r4
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> greaterThan(C r1) {
            com.google.common.collect.Cut r1 = com.google.common.collect.Cut.aboveValue(r1)
            com.google.common.collect.Cut r0 = com.google.common.collect.Cut.aboveAll()
            com.google.common.collect.Range r1 = create(r1, r0)
            return r1
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> lessThan(C r1) {
            com.google.common.collect.Cut r0 = com.google.common.collect.Cut.belowAll()
            com.google.common.collect.Cut r1 = com.google.common.collect.Cut.belowValue(r1)
            com.google.common.collect.Range r1 = create(r0, r1)
            return r1
    }

    static <C extends java.lang.Comparable<?>> com.google.common.base.Function<com.google.common.collect.Range<C>, com.google.common.collect.Cut<C>> lowerBoundFn() {
            com.google.common.collect.Range$LowerBoundFn r0 = com.google.common.collect.Range.LowerBoundFn.INSTANCE
            return r0
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> open(C r0, C r1) {
            com.google.common.collect.Cut r0 = com.google.common.collect.Cut.aboveValue(r0)
            com.google.common.collect.Cut r1 = com.google.common.collect.Cut.belowValue(r1)
            com.google.common.collect.Range r0 = create(r0, r1)
            return r0
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> openClosed(C r0, C r1) {
            com.google.common.collect.Cut r0 = com.google.common.collect.Cut.aboveValue(r0)
            com.google.common.collect.Cut r1 = com.google.common.collect.Cut.aboveValue(r1)
            com.google.common.collect.Range r0 = create(r0, r1)
            return r0
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> range(C r1, com.google.common.collect.BoundType r2, C r3, com.google.common.collect.BoundType r4) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            if (r2 != r0) goto Lf
            com.google.common.collect.Cut r1 = com.google.common.collect.Cut.aboveValue(r1)
            goto L13
        Lf:
            com.google.common.collect.Cut r1 = com.google.common.collect.Cut.belowValue(r1)
        L13:
            if (r4 != r0) goto L1a
            com.google.common.collect.Cut r2 = com.google.common.collect.Cut.belowValue(r3)
            goto L1e
        L1a:
            com.google.common.collect.Cut r2 = com.google.common.collect.Cut.aboveValue(r3)
        L1e:
            com.google.common.collect.Range r1 = create(r1, r2)
            return r1
    }

    static <C extends java.lang.Comparable<?>> com.google.common.collect.Ordering<com.google.common.collect.Range<C>> rangeLexOrdering() {
            com.google.common.collect.Ordering<com.google.common.collect.Range<?>> r0 = com.google.common.collect.Range.RangeLexOrdering.INSTANCE
            return r0
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> singleton(C r0) {
            com.google.common.collect.Range r0 = closed(r0, r0)
            return r0
    }

    private static java.lang.String toString(com.google.common.collect.Cut<?> r2, com.google.common.collect.Cut<?> r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 16
            r0.<init>(r1)
            r2.describeAsLowerBound(r0)
            java.lang.String r2 = ".."
            r0.append(r2)
            r3.describeAsUpperBound(r0)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> upTo(C r1, com.google.common.collect.BoundType r2) {
            int[] r0 = com.google.common.collect.Range.AnonymousClass1.$SwitchMap$com$google$common$collect$BoundType
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L19
            r0 = 2
            if (r2 != r0) goto L13
            com.google.common.collect.Range r1 = atMost(r1)
            return r1
        L13:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L19:
            com.google.common.collect.Range r1 = lessThan(r1)
            return r1
    }

    static <C extends java.lang.Comparable<?>> com.google.common.base.Function<com.google.common.collect.Range<C>, com.google.common.collect.Cut<C>> upperBoundFn() {
            com.google.common.collect.Range$UpperBoundFn r0 = com.google.common.collect.Range.UpperBoundFn.INSTANCE
            return r0
    }

    @java.lang.Deprecated
    public boolean apply(C r1) {
            r0 = this;
            boolean r1 = r0.contains(r1)
            return r1
    }

    @Override // com.google.common.base.Predicate
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ boolean apply(java.lang.Object r1) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            boolean r1 = r0.apply(r1)
            return r1
    }

    public com.google.common.collect.Range<C> canonical(com.google.common.collect.DiscreteDomain<C> r3) {
            r2 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r2.lowerBound
            com.google.common.collect.Cut r0 = r0.canonical(r3)
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r2.upperBound
            com.google.common.collect.Cut r3 = r1.canonical(r3)
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r2.lowerBound
            if (r0 != r1) goto L18
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r2.upperBound
            if (r3 != r1) goto L18
            return r2
        L18:
            com.google.common.collect.Range r3 = create(r0, r3)
            return r3
    }

    public boolean contains(C r2) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r1.lowerBound
            boolean r0 = r0.isLessThan(r2)
            if (r0 == 0) goto L15
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r1.upperBound
            boolean r2 = r0.isLessThan(r2)
            if (r2 != 0) goto L15
            r2 = 1
            return r2
        L15:
            r2 = 0
            return r2
    }

    public boolean containsAll(java.lang.Iterable<? extends C> r6) {
            r5 = this;
            boolean r0 = com.google.common.collect.Iterables.isEmpty(r6)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r6 instanceof java.util.SortedSet
            r2 = 0
            if (r0 == 0) goto L3b
            java.util.SortedSet r0 = cast(r6)
            java.util.Comparator r3 = r0.comparator()
            com.google.common.collect.Ordering r4 = com.google.common.collect.Ordering.natural()
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L21
            if (r3 != 0) goto L3b
        L21:
            java.lang.Object r6 = r0.first()
            java.lang.Comparable r6 = (java.lang.Comparable) r6
            boolean r6 = r5.contains(r6)
            if (r6 == 0) goto L3a
            java.lang.Object r6 = r0.last()
            java.lang.Comparable r6 = (java.lang.Comparable) r6
            boolean r6 = r5.contains(r6)
            if (r6 == 0) goto L3a
            return r1
        L3a:
            return r2
        L3b:
            java.util.Iterator r6 = r6.iterator()
        L3f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L52
            java.lang.Object r0 = r6.next()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L3f
            return r2
        L52:
            return r1
    }

    public boolean encloses(com.google.common.collect.Range<C> r3) {
            r2 = this;
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r2.lowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r3.lowerBound
            int r0 = r0.compareTo(r1)
            if (r0 > 0) goto L16
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r2.upperBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r3 = r3.upperBound
            int r3 = r0.compareTo(r3)
            if (r3 < 0) goto L16
            r3 = 1
            return r3
        L16:
            r3 = 0
            return r3
    }

    @Override // com.google.common.base.Predicate
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.common.collect.Range
            r1 = 0
            if (r0 == 0) goto L1d
            com.google.common.collect.Range r4 = (com.google.common.collect.Range) r4
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r3.lowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r4.lowerBound
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1d
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r3.upperBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r4 = r4.upperBound
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L1d
            r4 = 1
            return r4
        L1d:
            return r1
    }

    public com.google.common.collect.Range<C> gap(com.google.common.collect.Range<C> r3) {
            r2 = this;
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r2.lowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r3.lowerBound
            int r0 = r0.compareTo(r1)
            if (r0 >= 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L11
            r1 = r2
            goto L12
        L11:
            r1 = r3
        L12:
            if (r0 == 0) goto L15
            goto L16
        L15:
            r3 = r2
        L16:
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r1.upperBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r3 = r3.lowerBound
            com.google.common.collect.Range r3 = create(r0, r3)
            return r3
    }

    public boolean hasLowerBound() {
            r2 = this;
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r2.lowerBound
            com.google.common.collect.Cut r1 = com.google.common.collect.Cut.belowAll()
            if (r0 == r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public boolean hasUpperBound() {
            r2 = this;
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r2.upperBound
            com.google.common.collect.Cut r1 = com.google.common.collect.Cut.aboveAll()
            if (r0 == r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public int hashCode() {
            r2 = this;
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r2.lowerBound
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r2.upperBound
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public com.google.common.collect.Range<C> intersection(com.google.common.collect.Range<C> r4) {
            r3 = this;
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r3.lowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r4.lowerBound
            int r0 = r0.compareTo(r1)
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r3.upperBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r4.upperBound
            int r1 = r1.compareTo(r2)
            if (r0 < 0) goto L15
            if (r1 > 0) goto L15
            return r3
        L15:
            if (r0 > 0) goto L1a
            if (r1 < 0) goto L1a
            return r4
        L1a:
            if (r0 < 0) goto L1f
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r3.lowerBound
            goto L21
        L1f:
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r4.lowerBound
        L21:
            if (r1 > 0) goto L26
            com.google.common.collect.Cut<C extends java.lang.Comparable> r4 = r3.upperBound
            goto L28
        L26:
            com.google.common.collect.Cut<C extends java.lang.Comparable> r4 = r4.upperBound
        L28:
            com.google.common.collect.Range r4 = create(r0, r4)
            return r4
    }

    public boolean isConnected(com.google.common.collect.Range<C> r3) {
            r2 = this;
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r2.lowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r3.upperBound
            int r0 = r0.compareTo(r1)
            if (r0 > 0) goto L16
            com.google.common.collect.Cut<C extends java.lang.Comparable> r3 = r3.lowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r2.upperBound
            int r3 = r3.compareTo(r0)
            if (r3 > 0) goto L16
            r3 = 1
            return r3
        L16:
            r3 = 0
            return r3
    }

    public boolean isEmpty() {
            r2 = this;
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r2.lowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r2.upperBound
            boolean r0 = r0.equals(r1)
            return r0
    }

    public com.google.common.collect.BoundType lowerBoundType() {
            r1 = this;
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r1.lowerBound
            com.google.common.collect.BoundType r0 = r0.typeAsLowerBound()
            return r0
    }

    public C lowerEndpoint() {
            r1 = this;
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r1.lowerBound
            java.lang.Comparable r0 = r0.endpoint()
            return r0
    }

    java.lang.Object readResolve() {
            r1 = this;
            com.google.common.collect.Range<java.lang.Comparable> r0 = com.google.common.collect.Range.ALL
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            com.google.common.collect.Range r0 = all()
            return r0
        Ld:
            return r1
    }

    public com.google.common.collect.Range<C> span(com.google.common.collect.Range<C> r4) {
            r3 = this;
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r3.lowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r4.lowerBound
            int r0 = r0.compareTo(r1)
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r3.upperBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r4.upperBound
            int r1 = r1.compareTo(r2)
            if (r0 > 0) goto L15
            if (r1 < 0) goto L15
            return r3
        L15:
            if (r0 < 0) goto L1a
            if (r1 > 0) goto L1a
            return r4
        L1a:
            if (r0 > 0) goto L1f
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r3.lowerBound
            goto L21
        L1f:
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r4.lowerBound
        L21:
            if (r1 < 0) goto L26
            com.google.common.collect.Cut<C extends java.lang.Comparable> r4 = r3.upperBound
            goto L28
        L26:
            com.google.common.collect.Cut<C extends java.lang.Comparable> r4 = r4.upperBound
        L28:
            com.google.common.collect.Range r4 = create(r0, r4)
            return r4
    }

    public java.lang.String toString() {
            r2 = this;
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r2.lowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r2.upperBound
            java.lang.String r0 = toString(r0, r1)
            return r0
    }

    public com.google.common.collect.BoundType upperBoundType() {
            r1 = this;
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r1.upperBound
            com.google.common.collect.BoundType r0 = r0.typeAsUpperBound()
            return r0
    }

    public C upperEndpoint() {
            r1 = this;
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r1.upperBound
            java.lang.Comparable r0 = r0.endpoint()
            return r0
    }
}
