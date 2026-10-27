package com.google.common.collect;

import java.lang.Comparable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class DiscreteDomain<C extends java.lang.Comparable> {
    final boolean supportsFastOffset;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.collect.DiscreteDomain$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class BigIntegerDomain extends com.google.common.collect.DiscreteDomain<java.math.BigInteger> implements java.io.Serializable {
        private static final com.google.common.collect.DiscreteDomain.BigIntegerDomain INSTANCE = null;
        private static final java.math.BigInteger MAX_LONG = null;
        private static final java.math.BigInteger MIN_LONG = null;
        private static final long serialVersionUID = 0;

        static {
                com.google.common.collect.DiscreteDomain$BigIntegerDomain r0 = new com.google.common.collect.DiscreteDomain$BigIntegerDomain
                r0.<init>()
                com.google.common.collect.DiscreteDomain.BigIntegerDomain.INSTANCE = r0
                r0 = -9223372036854775808
                java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
                com.google.common.collect.DiscreteDomain.BigIntegerDomain.MIN_LONG = r0
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
                com.google.common.collect.DiscreteDomain.BigIntegerDomain.MAX_LONG = r0
                return
        }

        BigIntegerDomain() {
                r2 = this;
                r0 = 1
                r1 = 0
                r2.<init>(r0, r1)
                return
        }

        static /* synthetic */ com.google.common.collect.DiscreteDomain.BigIntegerDomain access$300() {
                com.google.common.collect.DiscreteDomain$BigIntegerDomain r0 = com.google.common.collect.DiscreteDomain.BigIntegerDomain.INSTANCE
                return r0
        }

        private java.lang.Object readResolve() {
                r1 = this;
                com.google.common.collect.DiscreteDomain$BigIntegerDomain r0 = com.google.common.collect.DiscreteDomain.BigIntegerDomain.INSTANCE
                return r0
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ long distance(java.math.BigInteger r1, java.math.BigInteger r2) {
                r0 = this;
                java.math.BigInteger r1 = (java.math.BigInteger) r1
                java.math.BigInteger r2 = (java.math.BigInteger) r2
                long r1 = r0.distance2(r1, r2)
                return r1
        }

        /* renamed from: distance, reason: avoid collision after fix types in other method */
        public long distance2(java.math.BigInteger r1, java.math.BigInteger r2) {
                r0 = this;
                java.math.BigInteger r1 = r2.subtract(r1)
                java.math.BigInteger r2 = com.google.common.collect.DiscreteDomain.BigIntegerDomain.MIN_LONG
                java.math.BigInteger r1 = r1.max(r2)
                java.math.BigInteger r2 = com.google.common.collect.DiscreteDomain.BigIntegerDomain.MAX_LONG
                java.math.BigInteger r1 = r1.min(r2)
                long r1 = r1.longValue()
                return r1
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ java.math.BigInteger next(java.math.BigInteger r1) {
                r0 = this;
                java.math.BigInteger r1 = (java.math.BigInteger) r1
                java.math.BigInteger r1 = r0.next2(r1)
                return r1
        }

        /* renamed from: next, reason: avoid collision after fix types in other method */
        public java.math.BigInteger next2(java.math.BigInteger r2) {
                r1 = this;
                java.math.BigInteger r0 = java.math.BigInteger.ONE
                java.math.BigInteger r2 = r2.add(r0)
                return r2
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* bridge */ /* synthetic */ java.math.BigInteger offset(java.math.BigInteger r1, long r2) {
                r0 = this;
                java.math.BigInteger r1 = (java.math.BigInteger) r1
                java.math.BigInteger r1 = r0.offset2(r1, r2)
                return r1
        }

        /* renamed from: offset, reason: avoid collision after fix types in other method */
        java.math.BigInteger offset2(java.math.BigInteger r2, long r3) {
                r1 = this;
                java.lang.String r0 = "distance"
                com.google.common.collect.CollectPreconditions.checkNonnegative(r3, r0)
                java.math.BigInteger r3 = java.math.BigInteger.valueOf(r3)
                java.math.BigInteger r2 = r2.add(r3)
                return r2
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ java.math.BigInteger previous(java.math.BigInteger r1) {
                r0 = this;
                java.math.BigInteger r1 = (java.math.BigInteger) r1
                java.math.BigInteger r1 = r0.previous2(r1)
                return r1
        }

        /* renamed from: previous, reason: avoid collision after fix types in other method */
        public java.math.BigInteger previous2(java.math.BigInteger r2) {
                r1 = this;
                java.math.BigInteger r0 = java.math.BigInteger.ONE
                java.math.BigInteger r2 = r2.subtract(r0)
                return r2
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "DiscreteDomain.bigIntegers()"
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class IntegerDomain extends com.google.common.collect.DiscreteDomain<java.lang.Integer> implements java.io.Serializable {
        private static final com.google.common.collect.DiscreteDomain.IntegerDomain INSTANCE = null;
        private static final long serialVersionUID = 0;

        static {
                com.google.common.collect.DiscreteDomain$IntegerDomain r0 = new com.google.common.collect.DiscreteDomain$IntegerDomain
                r0.<init>()
                com.google.common.collect.DiscreteDomain.IntegerDomain.INSTANCE = r0
                return
        }

        IntegerDomain() {
                r2 = this;
                r0 = 1
                r1 = 0
                r2.<init>(r0, r1)
                return
        }

        static /* synthetic */ com.google.common.collect.DiscreteDomain.IntegerDomain access$000() {
                com.google.common.collect.DiscreteDomain$IntegerDomain r0 = com.google.common.collect.DiscreteDomain.IntegerDomain.INSTANCE
                return r0
        }

        private java.lang.Object readResolve() {
                r1 = this;
                com.google.common.collect.DiscreteDomain$IntegerDomain r0 = com.google.common.collect.DiscreteDomain.IntegerDomain.INSTANCE
                return r0
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ long distance(java.lang.Integer r1, java.lang.Integer r2) {
                r0 = this;
                java.lang.Integer r1 = (java.lang.Integer) r1
                java.lang.Integer r2 = (java.lang.Integer) r2
                long r1 = r0.distance2(r1, r2)
                return r1
        }

        /* renamed from: distance, reason: avoid collision after fix types in other method */
        public long distance2(java.lang.Integer r3, java.lang.Integer r4) {
                r2 = this;
                int r4 = r4.intValue()
                long r0 = (long) r4
                int r3 = r3.intValue()
                long r3 = (long) r3
                long r0 = r0 - r3
                return r0
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ java.lang.Integer maxValue() {
                r1 = this;
                java.lang.Integer r0 = r1.maxValue2()
                return r0
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* renamed from: maxValue, reason: avoid collision after fix types in other method */
        public java.lang.Integer maxValue2() {
                r1 = this;
                r0 = 2147483647(0x7fffffff, float:NaN)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                return r0
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ java.lang.Integer minValue() {
                r1 = this;
                java.lang.Integer r0 = r1.minValue2()
                return r0
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* renamed from: minValue, reason: avoid collision after fix types in other method */
        public java.lang.Integer minValue2() {
                r1 = this;
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                return r0
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ java.lang.Integer next(java.lang.Integer r1) {
                r0 = this;
                java.lang.Integer r1 = (java.lang.Integer) r1
                java.lang.Integer r1 = r0.next2(r1)
                return r1
        }

        /* renamed from: next, reason: avoid collision after fix types in other method */
        public java.lang.Integer next2(java.lang.Integer r2) {
                r1 = this;
                int r2 = r2.intValue()
                r0 = 2147483647(0x7fffffff, float:NaN)
                if (r2 != r0) goto Lb
                r2 = 0
                return r2
            Lb:
                int r2 = r2 + 1
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                return r2
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* bridge */ /* synthetic */ java.lang.Integer offset(java.lang.Integer r1, long r2) {
                r0 = this;
                java.lang.Integer r1 = (java.lang.Integer) r1
                java.lang.Integer r1 = r0.offset2(r1, r2)
                return r1
        }

        /* renamed from: offset, reason: avoid collision after fix types in other method */
        java.lang.Integer offset2(java.lang.Integer r3, long r4) {
                r2 = this;
                java.lang.String r0 = "distance"
                com.google.common.collect.CollectPreconditions.checkNonnegative(r4, r0)
                long r0 = r3.longValue()
                long r0 = r0 + r4
                int r3 = com.google.common.primitives.Ints.checkedCast(r0)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                return r3
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ java.lang.Integer previous(java.lang.Integer r1) {
                r0 = this;
                java.lang.Integer r1 = (java.lang.Integer) r1
                java.lang.Integer r1 = r0.previous2(r1)
                return r1
        }

        /* renamed from: previous, reason: avoid collision after fix types in other method */
        public java.lang.Integer previous2(java.lang.Integer r2) {
                r1 = this;
                int r2 = r2.intValue()
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r2 != r0) goto La
                r2 = 0
                return r2
            La:
                int r2 = r2 + (-1)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                return r2
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "DiscreteDomain.integers()"
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class LongDomain extends com.google.common.collect.DiscreteDomain<java.lang.Long> implements java.io.Serializable {
        private static final com.google.common.collect.DiscreteDomain.LongDomain INSTANCE = null;
        private static final long serialVersionUID = 0;

        static {
                com.google.common.collect.DiscreteDomain$LongDomain r0 = new com.google.common.collect.DiscreteDomain$LongDomain
                r0.<init>()
                com.google.common.collect.DiscreteDomain.LongDomain.INSTANCE = r0
                return
        }

        LongDomain() {
                r2 = this;
                r0 = 1
                r1 = 0
                r2.<init>(r0, r1)
                return
        }

        static /* synthetic */ com.google.common.collect.DiscreteDomain.LongDomain access$200() {
                com.google.common.collect.DiscreteDomain$LongDomain r0 = com.google.common.collect.DiscreteDomain.LongDomain.INSTANCE
                return r0
        }

        private java.lang.Object readResolve() {
                r1 = this;
                com.google.common.collect.DiscreteDomain$LongDomain r0 = com.google.common.collect.DiscreteDomain.LongDomain.INSTANCE
                return r0
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ long distance(java.lang.Long r1, java.lang.Long r2) {
                r0 = this;
                java.lang.Long r1 = (java.lang.Long) r1
                java.lang.Long r2 = (java.lang.Long) r2
                long r1 = r0.distance2(r1, r2)
                return r1
        }

        /* renamed from: distance, reason: avoid collision after fix types in other method */
        public long distance2(java.lang.Long r10, java.lang.Long r11) {
                r9 = this;
                long r0 = r11.longValue()
                long r2 = r10.longValue()
                long r0 = r0 - r2
                long r2 = r11.longValue()
                long r4 = r10.longValue()
                r6 = 0
                int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r8 <= 0) goto L21
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 >= 0) goto L21
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                return r10
            L21:
                long r2 = r11.longValue()
                long r10 = r10.longValue()
                int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
                if (r4 >= 0) goto L34
                int r10 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r10 <= 0) goto L34
                r10 = -9223372036854775808
                return r10
            L34:
                return r0
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ java.lang.Long maxValue() {
                r1 = this;
                java.lang.Long r0 = r1.maxValue2()
                return r0
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* renamed from: maxValue, reason: avoid collision after fix types in other method */
        public java.lang.Long maxValue2() {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                return r0
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ java.lang.Long minValue() {
                r1 = this;
                java.lang.Long r0 = r1.minValue2()
                return r0
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* renamed from: minValue, reason: avoid collision after fix types in other method */
        public java.lang.Long minValue2() {
                r2 = this;
                r0 = -9223372036854775808
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                return r0
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ java.lang.Long next(java.lang.Long r1) {
                r0 = this;
                java.lang.Long r1 = (java.lang.Long) r1
                java.lang.Long r1 = r0.next2(r1)
                return r1
        }

        /* renamed from: next, reason: avoid collision after fix types in other method */
        public java.lang.Long next2(java.lang.Long r5) {
                r4 = this;
                long r0 = r5.longValue()
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 != 0) goto Lf
                r5 = 0
                return r5
            Lf:
                r2 = 1
                long r0 = r0 + r2
                java.lang.Long r5 = java.lang.Long.valueOf(r0)
                return r5
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* bridge */ /* synthetic */ java.lang.Long offset(java.lang.Long r1, long r2) {
                r0 = this;
                java.lang.Long r1 = (java.lang.Long) r1
                java.lang.Long r1 = r0.offset2(r1, r2)
                return r1
        }

        /* renamed from: offset, reason: avoid collision after fix types in other method */
        java.lang.Long offset2(java.lang.Long r5, long r6) {
                r4 = this;
                java.lang.String r0 = "distance"
                com.google.common.collect.CollectPreconditions.checkNonnegative(r6, r0)
                long r0 = r5.longValue()
                long r0 = r0 + r6
                r6 = 0
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 >= 0) goto L20
                long r2 = r5.longValue()
                int r5 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r5 >= 0) goto L1a
                r5 = 1
                goto L1b
            L1a:
                r5 = 0
            L1b:
                java.lang.String r6 = "overflow"
                com.google.common.base.Preconditions.checkArgument(r5, r6)
            L20:
                java.lang.Long r5 = java.lang.Long.valueOf(r0)
                return r5
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ java.lang.Long previous(java.lang.Long r1) {
                r0 = this;
                java.lang.Long r1 = (java.lang.Long) r1
                java.lang.Long r1 = r0.previous2(r1)
                return r1
        }

        /* renamed from: previous, reason: avoid collision after fix types in other method */
        public java.lang.Long previous2(java.lang.Long r5) {
                r4 = this;
                long r0 = r5.longValue()
                r2 = -9223372036854775808
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 != 0) goto Lc
                r5 = 0
                return r5
            Lc:
                r2 = 1
                long r0 = r0 - r2
                java.lang.Long r5 = java.lang.Long.valueOf(r0)
                return r5
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "DiscreteDomain.longs()"
                return r0
        }
    }

    protected DiscreteDomain() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    private DiscreteDomain(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.supportsFastOffset = r1
            return
    }

    /* synthetic */ DiscreteDomain(boolean r1, com.google.common.collect.DiscreteDomain.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static com.google.common.collect.DiscreteDomain<java.math.BigInteger> bigIntegers() {
            com.google.common.collect.DiscreteDomain$BigIntegerDomain r0 = com.google.common.collect.DiscreteDomain.BigIntegerDomain.access$300()
            return r0
    }

    public static com.google.common.collect.DiscreteDomain<java.lang.Integer> integers() {
            com.google.common.collect.DiscreteDomain$IntegerDomain r0 = com.google.common.collect.DiscreteDomain.IntegerDomain.access$000()
            return r0
    }

    public static com.google.common.collect.DiscreteDomain<java.lang.Long> longs() {
            com.google.common.collect.DiscreteDomain$LongDomain r0 = com.google.common.collect.DiscreteDomain.LongDomain.access$200()
            return r0
    }

    public abstract long distance(C r1, C r2);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public C maxValue() {
            r1 = this;
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public C minValue() {
            r1 = this;
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    public abstract C next(C r1);

    C offset(C r5, long r6) {
            r4 = this;
            java.lang.String r0 = "distance"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r6, r0)
            r0 = 0
        L7:
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L13
            java.lang.Comparable r5 = r4.next(r5)
            r2 = 1
            long r0 = r0 + r2
            goto L7
        L13:
            return r5
    }

    public abstract C previous(C r1);
}
