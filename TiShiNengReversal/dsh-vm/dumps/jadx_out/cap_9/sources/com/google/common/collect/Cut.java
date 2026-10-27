package com.google.common.collect;

import java.lang.Comparable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class Cut<C extends java.lang.Comparable> implements java.lang.Comparable<com.google.common.collect.Cut<C>>, java.io.Serializable {
    private static final long serialVersionUID = 0;

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    final C endpoint;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.collect.Cut$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$collect$BoundType = null;

        static {
                com.google.common.collect.BoundType[] r0 = com.google.common.collect.BoundType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.common.collect.Cut.AnonymousClass1.$SwitchMap$com$google$common$collect$BoundType = r0
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.CLOSED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.common.collect.Cut.AnonymousClass1.$SwitchMap$com$google$common$collect$BoundType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.OPEN     // Catch: java.lang.NoSuchFieldError -> L1d
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
    private static final class AboveAll extends com.google.common.collect.Cut<java.lang.Comparable<?>> {
        private static final com.google.common.collect.Cut.AboveAll INSTANCE = null;
        private static final long serialVersionUID = 0;

        static {
                com.google.common.collect.Cut$AboveAll r0 = new com.google.common.collect.Cut$AboveAll
                r0.<init>()
                com.google.common.collect.Cut.AboveAll.INSTANCE = r0
                return
        }

        private AboveAll() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        static /* synthetic */ com.google.common.collect.Cut.AboveAll access$100() {
                com.google.common.collect.Cut$AboveAll r0 = com.google.common.collect.Cut.AboveAll.INSTANCE
                return r0
        }

        private java.lang.Object readResolve() {
                r1 = this;
                com.google.common.collect.Cut$AboveAll r0 = com.google.common.collect.Cut.AboveAll.INSTANCE
                return r0
        }

        @Override // com.google.common.collect.Cut
        public int compareTo(com.google.common.collect.Cut<java.lang.Comparable<?>> r1) {
                r0 = this;
                if (r1 != r0) goto L4
                r1 = 0
                return r1
            L4:
                r1 = 1
                return r1
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
                r0 = this;
                com.google.common.collect.Cut r1 = (com.google.common.collect.Cut) r1
                int r1 = r0.compareTo(r1)
                return r1
        }

        @Override // com.google.common.collect.Cut
        void describeAsLowerBound(java.lang.StringBuilder r1) {
                r0 = this;
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.Cut
        void describeAsUpperBound(java.lang.StringBuilder r2) {
                r1 = this;
                java.lang.String r0 = "+∞)"
                r2.append(r0)
                return
        }

        @Override // com.google.common.collect.Cut
        java.lang.Comparable<?> endpoint() {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "range unbounded on this side"
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.common.collect.Cut
        java.lang.Comparable<?> greatestValueBelow(com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> r1) {
                r0 = this;
                java.lang.Comparable r1 = r1.maxValue()
                return r1
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
                r1 = this;
                int r0 = java.lang.System.identityHashCode(r1)
                return r0
        }

        @Override // com.google.common.collect.Cut
        boolean isLessThan(java.lang.Comparable<?> r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.google.common.collect.Cut
        java.lang.Comparable<?> leastValueAbove(com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> r1) {
                r0 = this;
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "+∞"
                return r0
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.BoundType typeAsLowerBound() {
                r2 = this;
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.String r1 = "this statement should be unreachable"
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.BoundType typeAsUpperBound() {
                r1 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.Cut<java.lang.Comparable<?>> withLowerBoundType(com.google.common.collect.BoundType r1, com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> r2) {
                r0 = this;
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.String r2 = "this statement should be unreachable"
                r1.<init>(r2)
                throw r1
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.Cut<java.lang.Comparable<?>> withUpperBoundType(com.google.common.collect.BoundType r1, com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> r2) {
                r0 = this;
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>()
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class AboveValue<C extends java.lang.Comparable> extends com.google.common.collect.Cut<C> {
        private static final long serialVersionUID = 0;

        AboveValue(C r1) {
                r0 = this;
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.lang.Comparable r1 = (java.lang.Comparable) r1
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.Cut<C> canonical(com.google.common.collect.DiscreteDomain<C> r1) {
                r0 = this;
                java.lang.Comparable r1 = r0.leastValueAbove(r1)
                if (r1 == 0) goto Lb
                com.google.common.collect.Cut r1 = com.google.common.collect.Cut.belowValue(r1)
                return r1
            Lb:
                com.google.common.collect.Cut r1 = com.google.common.collect.Cut.aboveAll()
                return r1
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
                r0 = this;
                com.google.common.collect.Cut r1 = (com.google.common.collect.Cut) r1
                int r1 = super.compareTo(r1)
                return r1
        }

        @Override // com.google.common.collect.Cut
        void describeAsLowerBound(java.lang.StringBuilder r2) {
                r1 = this;
                r0 = 40
                r2.append(r0)
                C extends java.lang.Comparable r0 = r1.endpoint
                r2.append(r0)
                return
        }

        @Override // com.google.common.collect.Cut
        void describeAsUpperBound(java.lang.StringBuilder r2) {
                r1 = this;
                C extends java.lang.Comparable r0 = r1.endpoint
                r2.append(r0)
                r0 = 93
                r2.append(r0)
                return
        }

        @Override // com.google.common.collect.Cut
        C greatestValueBelow(com.google.common.collect.DiscreteDomain<C> r1) {
                r0 = this;
                C extends java.lang.Comparable r1 = r0.endpoint
                return r1
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
                r1 = this;
                C extends java.lang.Comparable r0 = r1.endpoint
                int r0 = r0.hashCode()
                int r0 = ~r0
                return r0
        }

        @Override // com.google.common.collect.Cut
        boolean isLessThan(C r2) {
                r1 = this;
                C extends java.lang.Comparable r0 = r1.endpoint
                int r2 = com.google.common.collect.Range.compareOrThrow(r0, r2)
                if (r2 >= 0) goto La
                r2 = 1
                return r2
            La:
                r2 = 0
                return r2
        }

        @Override // com.google.common.collect.Cut
        C leastValueAbove(com.google.common.collect.DiscreteDomain<C> r2) {
                r1 = this;
                C extends java.lang.Comparable r0 = r1.endpoint
                java.lang.Comparable r2 = r2.next(r0)
                return r2
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "/"
                r0.append(r1)
                C extends java.lang.Comparable r1 = r2.endpoint
                r0.append(r1)
                java.lang.String r1 = "\\"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.BoundType typeAsLowerBound() {
                r1 = this;
                com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
                return r0
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.BoundType typeAsUpperBound() {
                r1 = this;
                com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.CLOSED
                return r0
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.Cut<C> withLowerBoundType(com.google.common.collect.BoundType r2, com.google.common.collect.DiscreteDomain<C> r3) {
                r1 = this;
                int[] r0 = com.google.common.collect.Cut.AnonymousClass1.$SwitchMap$com$google$common$collect$BoundType
                int r2 = r2.ordinal()
                r2 = r0[r2]
                r0 = 1
                if (r2 == r0) goto L15
                r3 = 2
                if (r2 != r3) goto Lf
                return r1
            Lf:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                r2.<init>()
                throw r2
            L15:
                C extends java.lang.Comparable r2 = r1.endpoint
                java.lang.Comparable r2 = r3.next(r2)
                if (r2 != 0) goto L22
                com.google.common.collect.Cut r2 = com.google.common.collect.Cut.belowAll()
                return r2
            L22:
                com.google.common.collect.Cut r2 = com.google.common.collect.Cut.belowValue(r2)
                return r2
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.Cut<C> withUpperBoundType(com.google.common.collect.BoundType r2, com.google.common.collect.DiscreteDomain<C> r3) {
                r1 = this;
                int[] r0 = com.google.common.collect.Cut.AnonymousClass1.$SwitchMap$com$google$common$collect$BoundType
                int r2 = r2.ordinal()
                r2 = r0[r2]
                r0 = 1
                if (r2 == r0) goto L26
                r0 = 2
                if (r2 != r0) goto L20
                C extends java.lang.Comparable r2 = r1.endpoint
                java.lang.Comparable r2 = r3.next(r2)
                if (r2 != 0) goto L1b
                com.google.common.collect.Cut r2 = com.google.common.collect.Cut.aboveAll()
                return r2
            L1b:
                com.google.common.collect.Cut r2 = com.google.common.collect.Cut.belowValue(r2)
                return r2
            L20:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                r2.<init>()
                throw r2
            L26:
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class BelowAll extends com.google.common.collect.Cut<java.lang.Comparable<?>> {
        private static final com.google.common.collect.Cut.BelowAll INSTANCE = null;
        private static final long serialVersionUID = 0;

        static {
                com.google.common.collect.Cut$BelowAll r0 = new com.google.common.collect.Cut$BelowAll
                r0.<init>()
                com.google.common.collect.Cut.BelowAll.INSTANCE = r0
                return
        }

        private BelowAll() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        static /* synthetic */ com.google.common.collect.Cut.BelowAll access$000() {
                com.google.common.collect.Cut$BelowAll r0 = com.google.common.collect.Cut.BelowAll.INSTANCE
                return r0
        }

        private java.lang.Object readResolve() {
                r1 = this;
                com.google.common.collect.Cut$BelowAll r0 = com.google.common.collect.Cut.BelowAll.INSTANCE
                return r0
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.Cut<java.lang.Comparable<?>> canonical(com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> r1) {
                r0 = this;
                java.lang.Comparable r1 = r1.minValue()     // Catch: java.util.NoSuchElementException -> L9
                com.google.common.collect.Cut r1 = com.google.common.collect.Cut.belowValue(r1)     // Catch: java.util.NoSuchElementException -> L9
                return r1
            L9:
                return r0
        }

        @Override // com.google.common.collect.Cut
        public int compareTo(com.google.common.collect.Cut<java.lang.Comparable<?>> r1) {
                r0 = this;
                if (r1 != r0) goto L4
                r1 = 0
                return r1
            L4:
                r1 = -1
                return r1
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
                r0 = this;
                com.google.common.collect.Cut r1 = (com.google.common.collect.Cut) r1
                int r1 = r0.compareTo(r1)
                return r1
        }

        @Override // com.google.common.collect.Cut
        void describeAsLowerBound(java.lang.StringBuilder r2) {
                r1 = this;
                java.lang.String r0 = "(-∞"
                r2.append(r0)
                return
        }

        @Override // com.google.common.collect.Cut
        void describeAsUpperBound(java.lang.StringBuilder r1) {
                r0 = this;
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.Cut
        java.lang.Comparable<?> endpoint() {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "range unbounded on this side"
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.common.collect.Cut
        java.lang.Comparable<?> greatestValueBelow(com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> r1) {
                r0 = this;
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
                r1 = this;
                int r0 = java.lang.System.identityHashCode(r1)
                return r0
        }

        @Override // com.google.common.collect.Cut
        boolean isLessThan(java.lang.Comparable<?> r1) {
                r0 = this;
                r1 = 1
                return r1
        }

        @Override // com.google.common.collect.Cut
        java.lang.Comparable<?> leastValueAbove(com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> r1) {
                r0 = this;
                java.lang.Comparable r1 = r1.minValue()
                return r1
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "-∞"
                return r0
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.BoundType typeAsLowerBound() {
                r1 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.BoundType typeAsUpperBound() {
                r2 = this;
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.String r1 = "this statement should be unreachable"
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.Cut<java.lang.Comparable<?>> withLowerBoundType(com.google.common.collect.BoundType r1, com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> r2) {
                r0 = this;
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.Cut<java.lang.Comparable<?>> withUpperBoundType(com.google.common.collect.BoundType r1, com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> r2) {
                r0 = this;
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.String r2 = "this statement should be unreachable"
                r1.<init>(r2)
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class BelowValue<C extends java.lang.Comparable> extends com.google.common.collect.Cut<C> {
        private static final long serialVersionUID = 0;

        BelowValue(C r1) {
                r0 = this;
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.lang.Comparable r1 = (java.lang.Comparable) r1
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
                r0 = this;
                com.google.common.collect.Cut r1 = (com.google.common.collect.Cut) r1
                int r1 = super.compareTo(r1)
                return r1
        }

        @Override // com.google.common.collect.Cut
        void describeAsLowerBound(java.lang.StringBuilder r2) {
                r1 = this;
                r0 = 91
                r2.append(r0)
                C extends java.lang.Comparable r0 = r1.endpoint
                r2.append(r0)
                return
        }

        @Override // com.google.common.collect.Cut
        void describeAsUpperBound(java.lang.StringBuilder r2) {
                r1 = this;
                C extends java.lang.Comparable r0 = r1.endpoint
                r2.append(r0)
                r0 = 41
                r2.append(r0)
                return
        }

        @Override // com.google.common.collect.Cut
        C greatestValueBelow(com.google.common.collect.DiscreteDomain<C> r2) {
                r1 = this;
                C extends java.lang.Comparable r0 = r1.endpoint
                java.lang.Comparable r2 = r2.previous(r0)
                return r2
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
                r1 = this;
                C extends java.lang.Comparable r0 = r1.endpoint
                int r0 = r0.hashCode()
                return r0
        }

        @Override // com.google.common.collect.Cut
        boolean isLessThan(C r2) {
                r1 = this;
                C extends java.lang.Comparable r0 = r1.endpoint
                int r2 = com.google.common.collect.Range.compareOrThrow(r0, r2)
                if (r2 > 0) goto La
                r2 = 1
                return r2
            La:
                r2 = 0
                return r2
        }

        @Override // com.google.common.collect.Cut
        C leastValueAbove(com.google.common.collect.DiscreteDomain<C> r1) {
                r0 = this;
                C extends java.lang.Comparable r1 = r0.endpoint
                return r1
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "\\"
                r0.append(r1)
                C extends java.lang.Comparable r1 = r2.endpoint
                r0.append(r1)
                java.lang.String r1 = "/"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.BoundType typeAsLowerBound() {
                r1 = this;
                com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.CLOSED
                return r0
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.BoundType typeAsUpperBound() {
                r1 = this;
                com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
                return r0
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.Cut<C> withLowerBoundType(com.google.common.collect.BoundType r2, com.google.common.collect.DiscreteDomain<C> r3) {
                r1 = this;
                int[] r0 = com.google.common.collect.Cut.AnonymousClass1.$SwitchMap$com$google$common$collect$BoundType
                int r2 = r2.ordinal()
                r2 = r0[r2]
                r0 = 1
                if (r2 == r0) goto L27
                r0 = 2
                if (r2 != r0) goto L21
                C extends java.lang.Comparable r2 = r1.endpoint
                java.lang.Comparable r2 = r3.previous(r2)
                if (r2 != 0) goto L1b
                com.google.common.collect.Cut r2 = com.google.common.collect.Cut.belowAll()
                return r2
            L1b:
                com.google.common.collect.Cut$AboveValue r3 = new com.google.common.collect.Cut$AboveValue
                r3.<init>(r2)
                return r3
            L21:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                r2.<init>()
                throw r2
            L27:
                return r1
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.Cut<C> withUpperBoundType(com.google.common.collect.BoundType r2, com.google.common.collect.DiscreteDomain<C> r3) {
                r1 = this;
                int[] r0 = com.google.common.collect.Cut.AnonymousClass1.$SwitchMap$com$google$common$collect$BoundType
                int r2 = r2.ordinal()
                r2 = r0[r2]
                r0 = 1
                if (r2 == r0) goto L15
                r3 = 2
                if (r2 != r3) goto Lf
                return r1
            Lf:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                r2.<init>()
                throw r2
            L15:
                C extends java.lang.Comparable r2 = r1.endpoint
                java.lang.Comparable r2 = r3.previous(r2)
                if (r2 != 0) goto L22
                com.google.common.collect.Cut r2 = com.google.common.collect.Cut.aboveAll()
                return r2
            L22:
                com.google.common.collect.Cut$AboveValue r3 = new com.google.common.collect.Cut$AboveValue
                r3.<init>(r2)
                return r3
        }
    }

    Cut(@org.checkerframework.checker.nullness.compatqual.NullableDecl C r1) {
            r0 = this;
            r0.<init>()
            r0.endpoint = r1
            return
    }

    static <C extends java.lang.Comparable> com.google.common.collect.Cut<C> aboveAll() {
            com.google.common.collect.Cut$AboveAll r0 = com.google.common.collect.Cut.AboveAll.access$100()
            return r0
    }

    static <C extends java.lang.Comparable> com.google.common.collect.Cut<C> aboveValue(C r1) {
            com.google.common.collect.Cut$AboveValue r0 = new com.google.common.collect.Cut$AboveValue
            r0.<init>(r1)
            return r0
    }

    static <C extends java.lang.Comparable> com.google.common.collect.Cut<C> belowAll() {
            com.google.common.collect.Cut$BelowAll r0 = com.google.common.collect.Cut.BelowAll.access$000()
            return r0
    }

    static <C extends java.lang.Comparable> com.google.common.collect.Cut<C> belowValue(C r1) {
            com.google.common.collect.Cut$BelowValue r0 = new com.google.common.collect.Cut$BelowValue
            r0.<init>(r1)
            return r0
    }

    com.google.common.collect.Cut<C> canonical(com.google.common.collect.DiscreteDomain<C> r1) {
            r0 = this;
            return r0
    }

    public int compareTo(com.google.common.collect.Cut<C> r3) {
            r2 = this;
            com.google.common.collect.Cut r0 = belowAll()
            if (r3 != r0) goto L8
            r3 = 1
            return r3
        L8:
            com.google.common.collect.Cut r0 = aboveAll()
            if (r3 != r0) goto L10
            r3 = -1
            return r3
        L10:
            C extends java.lang.Comparable r0 = r2.endpoint
            C extends java.lang.Comparable r1 = r3.endpoint
            int r0 = com.google.common.collect.Range.compareOrThrow(r0, r1)
            if (r0 == 0) goto L1b
            return r0
        L1b:
            boolean r0 = r2 instanceof com.google.common.collect.Cut.AboveValue
            boolean r3 = r3 instanceof com.google.common.collect.Cut.AboveValue
            int r3 = com.google.common.primitives.Booleans.compare(r0, r3)
            return r3
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.Cut r1 = (com.google.common.collect.Cut) r1
            int r1 = r0.compareTo(r1)
            return r1
    }

    abstract void describeAsLowerBound(java.lang.StringBuilder r1);

    abstract void describeAsUpperBound(java.lang.StringBuilder r1);

    C endpoint() {
            r1 = this;
            C extends java.lang.Comparable r0 = r1.endpoint
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.google.common.collect.Cut
            r1 = 0
            if (r0 == 0) goto Lf
            com.google.common.collect.Cut r3 = (com.google.common.collect.Cut) r3
            int r3 = r2.compareTo(r3)     // Catch: java.lang.ClassCastException -> Lf
            if (r3 != 0) goto Lf
            r3 = 1
            return r3
        Lf:
            return r1
    }

    abstract C greatestValueBelow(com.google.common.collect.DiscreteDomain<C> r1);

    public abstract int hashCode();

    abstract boolean isLessThan(C r1);

    abstract C leastValueAbove(com.google.common.collect.DiscreteDomain<C> r1);

    abstract com.google.common.collect.BoundType typeAsLowerBound();

    abstract com.google.common.collect.BoundType typeAsUpperBound();

    abstract com.google.common.collect.Cut<C> withLowerBoundType(com.google.common.collect.BoundType r1, com.google.common.collect.DiscreteDomain<C> r2);

    abstract com.google.common.collect.Cut<C> withUpperBoundType(com.google.common.collect.BoundType r1, com.google.common.collect.DiscreteDomain<C> r2);
}
