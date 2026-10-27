package com.google.common.math;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class LongMath {

    @com.google.common.annotations.VisibleForTesting
    static final long FLOOR_SQRT_MAX_LONG = 3037000499L;

    @com.google.common.annotations.VisibleForTesting
    static final long MAX_POWER_OF_SQRT2_UNSIGNED = -5402926248376769404L;

    @com.google.common.annotations.VisibleForTesting
    static final long MAX_SIGNED_POWER_OF_TWO = 4611686018427387904L;
    private static final int SIEVE_30 = -545925251;
    static final int[] biggestBinomials = null;

    @com.google.common.annotations.VisibleForTesting
    static final int[] biggestSimpleBinomials = null;
    static final long[] factorials = null;

    @com.google.common.annotations.VisibleForTesting
    @com.google.common.annotations.GwtIncompatible
    static final long[] halfPowersOf10 = null;

    @com.google.common.annotations.VisibleForTesting
    static final byte[] maxLog10ForLeadingZeros = null;
    private static final long[][] millerRabinBaseSets = null;

    @com.google.common.annotations.VisibleForTesting
    @com.google.common.annotations.GwtIncompatible
    static final long[] powersOf10 = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.math.LongMath$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode = null;

        static {
                java.math.RoundingMode[] r0 = java.math.RoundingMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode = r0
                java.math.RoundingMode r1 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L1d
                java.math.RoundingMode r1 = java.math.RoundingMode.DOWN     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L28
                java.math.RoundingMode r1 = java.math.RoundingMode.FLOOR     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L33
                java.math.RoundingMode r1 = java.math.RoundingMode.UP     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L3e
                java.math.RoundingMode r1 = java.math.RoundingMode.CEILING     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L49
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_DOWN     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L54
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_UP     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L60
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_EVEN     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum MillerRabinTester extends java.lang.Enum<com.google.common.math.LongMath.MillerRabinTester> {
        private static final /* synthetic */ com.google.common.math.LongMath.MillerRabinTester[] $VALUES = null;
        public static final com.google.common.math.LongMath.MillerRabinTester LARGE = null;
        public static final com.google.common.math.LongMath.MillerRabinTester SMALL = null;



        static {
                com.google.common.math.LongMath$MillerRabinTester$1 r0 = new com.google.common.math.LongMath$MillerRabinTester$1
                java.lang.String r1 = "SMALL"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.math.LongMath.MillerRabinTester.SMALL = r0
                com.google.common.math.LongMath$MillerRabinTester$2 r1 = new com.google.common.math.LongMath$MillerRabinTester$2
                java.lang.String r3 = "LARGE"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.common.math.LongMath.MillerRabinTester.LARGE = r1
                r3 = 2
                com.google.common.math.LongMath$MillerRabinTester[] r3 = new com.google.common.math.LongMath.MillerRabinTester[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.google.common.math.LongMath.MillerRabinTester.$VALUES = r3
                return
        }

        MillerRabinTester(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ MillerRabinTester(java.lang.String r1, int r2, com.google.common.math.LongMath.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private long powMod(long r10, long r12, long r14) {
                r9 = this;
                r0 = 1
                r5 = r10
                r3 = r0
            L4:
                r10 = 0
                int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r2 == 0) goto L21
                long r7 = r12 & r0
                int r2 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
                if (r2 == 0) goto L17
                r2 = r9
                r7 = r14
                long r3 = r2.mulMod(r3, r5, r7)
                goto L19
            L17:
                r2 = r9
                r7 = r14
            L19:
                long r5 = r9.squareMod(r5, r7)
                r10 = 1
                long r12 = r12 >> r10
                r14 = r7
                goto L4
            L21:
                r2 = r9
                return r3
        }

        static boolean test(long r3, long r5) {
                r0 = 3037000499(0xb504f333, double:1.500477613E-314)
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 > 0) goto Lc
                com.google.common.math.LongMath$MillerRabinTester r0 = com.google.common.math.LongMath.MillerRabinTester.SMALL
                goto Le
            Lc:
                com.google.common.math.LongMath$MillerRabinTester r0 = com.google.common.math.LongMath.MillerRabinTester.LARGE
            Le:
                boolean r3 = r0.testWitness(r3, r5)
                return r3
        }

        private boolean testWitness(long r14, long r16) {
                r13 = this;
                r7 = 1
                long r9 = r16 - r7
                int r11 = java.lang.Long.numberOfTrailingZeros(r9)
                long r3 = r9 >> r11
                long r1 = r14 % r16
                r14 = 0
                r12 = 1
                int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
                if (r0 != 0) goto L14
                return r12
            L14:
                r0 = r13
                r5 = r16
                long r14 = r0.powMod(r1, r3, r5)
                int r1 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
                if (r1 != 0) goto L20
                return r12
            L20:
                r1 = 0
                r2 = 0
            L22:
                int r3 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
                if (r3 == 0) goto L2f
                int r2 = r2 + r12
                if (r2 != r11) goto L2a
                return r1
            L2a:
                long r14 = r13.squareMod(r14, r5)
                goto L22
            L2f:
                return r12
        }

        public static com.google.common.math.LongMath.MillerRabinTester valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.math.LongMath$MillerRabinTester> r0 = com.google.common.math.LongMath.MillerRabinTester.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.math.LongMath$MillerRabinTester r1 = (com.google.common.math.LongMath.MillerRabinTester) r1
                return r1
        }

        public static com.google.common.math.LongMath.MillerRabinTester[] values() {
                com.google.common.math.LongMath$MillerRabinTester[] r0 = com.google.common.math.LongMath.MillerRabinTester.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.math.LongMath$MillerRabinTester[] r0 = (com.google.common.math.LongMath.MillerRabinTester[]) r0
                return r0
        }

        abstract long mulMod(long r1, long r3, long r5);

        abstract long squareMod(long r1, long r3);
    }

    static {
            r0 = 64
            byte[] r0 = new byte[r0]
            r0 = {x0074: FILL_ARRAY_DATA , data: [19, 18, 18, 18, 18, 17, 17, 17, 16, 16, 16, 15, 15, 15, 15, 14, 14, 14, 13, 13, 13, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0} // fill-array
            com.google.common.math.LongMath.maxLog10ForLeadingZeros = r0
            r0 = 19
            long[] r1 = new long[r0]
            r1 = {x0098: FILL_ARRAY_DATA , data: [1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000, 100000000000, 1000000000000, 10000000000000, 100000000000000, 1000000000000000, 10000000000000000, 100000000000000000, 1000000000000000000} // fill-array
            com.google.common.math.LongMath.powersOf10 = r1
            long[] r0 = new long[r0]
            r0 = {x00e8: FILL_ARRAY_DATA , data: [3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660, 31622776601, 316227766016, 3162277660168, 31622776601683, 316227766016837, 3162277660168379, 31622776601683793, 316227766016837933, 3162277660168379331} // fill-array
            com.google.common.math.LongMath.halfPowersOf10 = r0
            r0 = 21
            long[] r0 = new long[r0]
            r0 = {x0138: FILL_ARRAY_DATA , data: [1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800, 87178291200, 1307674368000, 20922789888000, 355687428096000, 6402373705728000, 121645100408832000, 2432902008176640000} // fill-array
            com.google.common.math.LongMath.factorials = r0
            r0 = 34
            int[] r0 = new int[r0]
            r0 = {x0190: FILL_ARRAY_DATA , data: [2147483647, 2147483647, 2147483647, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, 206, 169, 143, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66} // fill-array
            com.google.common.math.LongMath.biggestBinomials = r0
            r0 = 31
            int[] r0 = new int[r0]
            r0 = {x01d8: FILL_ARRAY_DATA , data: [2147483647, 2147483647, 2147483647, 2642246, 86251, 11724, 3218, 1313, 684, 419, 287, 214, 169, 139, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61} // fill-array
            com.google.common.math.LongMath.biggestSimpleBinomials = r0
            r0 = 2
            long[] r1 = new long[r0]
            r1 = {x021a: FILL_ARRAY_DATA , data: [291830, 126401071349994536} // fill-array
            r2 = 3
            long[] r3 = new long[r2]
            r3 = {x0226: FILL_ARRAY_DATA , data: [885594168, 725270293939359937, 3569819667048198375} // fill-array
            r4 = 4
            long[] r5 = new long[r4]
            r5 = {x0236: FILL_ARRAY_DATA , data: [273919523040, 15, 7363882082, 992620450144556} // fill-array
            r6 = 5
            long[] r7 = new long[r6]
            r7 = {x024a: FILL_ARRAY_DATA , data: [47636622961200, 2, 2570940, 211991001, 3749873356} // fill-array
            r8 = 6
            long[] r9 = new long[r8]
            r9 = {x0262: FILL_ARRAY_DATA , data: [7999252175582850, 2, 4130806001517, 149795463772692060, 186635894390467037, 3967304179347715805} // fill-array
            r10 = 7
            long[] r11 = new long[r10]
            r11 = {x027e: FILL_ARRAY_DATA , data: [585226005592931976, 2, 123635709730000, 9233062284813009, 43835965440333360, 761179012939631437, 1263739024124850375} // fill-array
            r12 = 8
            long[] r12 = new long[r12]
            r12 = {x029e: FILL_ARRAY_DATA , data: [9223372036854775807, 2, 325, 9375, 28178, 450775, 9780504, 1795265022} // fill-array
            long[][] r10 = new long[r10][]
            r13 = 0
            r10[r13] = r1
            r1 = 1
            r10[r1] = r3
            r10[r0] = r5
            r10[r2] = r7
            r10[r4] = r9
            r10[r6] = r11
            r10[r8] = r12
            com.google.common.math.LongMath.millerRabinBaseSets = r10
            return
    }

    private LongMath() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long binomial(int r11, int r12) {
            java.lang.String r0 = "n"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r11)
            java.lang.String r0 = "k"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r12)
            r0 = 1
            if (r12 > r11) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            java.lang.String r2 = "k (%s) > n (%s)"
            com.google.common.base.Preconditions.checkArgument(r1, r2, r12, r11)
            int r1 = r11 >> 1
            if (r12 <= r1) goto L1b
            int r12 = r11 - r12
        L1b:
            r1 = 1
            if (r12 == 0) goto L89
            if (r12 == r0) goto L87
            long[] r0 = com.google.common.math.LongMath.factorials
            int r3 = r0.length
            if (r11 >= r3) goto L31
            r1 = r0[r11]
            r3 = r0[r12]
            int r11 = r11 - r12
            r11 = r0[r11]
            long r3 = r3 * r11
            long r1 = r1 / r3
            return r1
        L31:
            int[] r0 = com.google.common.math.LongMath.biggestBinomials
            int r3 = r0.length
            if (r12 >= r3) goto L81
            r0 = r0[r12]
            if (r11 <= r0) goto L3b
            goto L81
        L3b:
            int[] r0 = com.google.common.math.LongMath.biggestSimpleBinomials
            int r3 = r0.length
            r4 = 2
            if (r12 >= r3) goto L55
            r0 = r0[r12]
            if (r11 > r0) goto L55
            int r0 = r11 + (-1)
            long r1 = (long) r11
        L48:
            if (r4 > r12) goto L54
            long r5 = (long) r0
            long r1 = r1 * r5
            long r5 = (long) r4
            long r1 = r1 / r5
            int r0 = r0 + (-1)
            int r4 = r4 + 1
            goto L48
        L54:
            return r1
        L55:
            long r5 = (long) r11
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            int r0 = log2(r5, r0)
            int r11 = r11 + (-1)
            r8 = r0
            r3 = r5
            r7 = 2
            r5 = r1
        L62:
            if (r7 > r12) goto L7c
            int r8 = r8 + r0
            r9 = 63
            if (r8 >= r9) goto L70
            long r9 = (long) r11
            long r3 = r3 * r9
            long r9 = (long) r7
            long r5 = r5 * r9
            goto L77
        L70:
            long r1 = multiplyFraction(r1, r3, r5)
            long r3 = (long) r11
            long r5 = (long) r7
            r8 = r0
        L77:
            int r7 = r7 + 1
            int r11 = r11 + (-1)
            goto L62
        L7c:
            long r11 = multiplyFraction(r1, r3, r5)
            return r11
        L81:
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r11
        L87:
            long r11 = (long) r11
            return r11
        L89:
            return r1
    }

    @com.google.common.annotations.Beta
    public static long ceilingPowerOfTwo(long r3) {
            java.lang.String r0 = "x"
            com.google.common.math.MathPreconditions.checkPositive(r0, r3)
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L16
            r0 = 1
            long r3 = r3 - r0
            int r3 = java.lang.Long.numberOfLeadingZeros(r3)
            int r3 = -r3
            long r3 = r0 << r3
            return r3
        L16:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ceilingPowerOfTwo("
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = ") is not representable as a long"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static long checkedAdd(long r11, long r13) {
            long r0 = r11 + r13
            long r2 = r11 ^ r13
            r4 = 0
            r5 = 1
            r6 = 0
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 >= 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            long r8 = r11 ^ r0
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 < 0) goto L16
            r4 = 1
        L16:
            r5 = r2 | r4
            java.lang.String r6 = "checkedAdd"
            r7 = r11
            r9 = r13
            com.google.common.math.MathPreconditions.checkNoOverflow(r5, r6, r7, r9)
            return r0
    }

    public static long checkedMultiply(long r12, long r14) {
            int r0 = java.lang.Long.numberOfLeadingZeros(r12)
            long r1 = ~r12
            int r1 = java.lang.Long.numberOfLeadingZeros(r1)
            int r0 = r0 + r1
            int r1 = java.lang.Long.numberOfLeadingZeros(r14)
            int r0 = r0 + r1
            long r1 = ~r14
            int r1 = java.lang.Long.numberOfLeadingZeros(r1)
            int r0 = r0 + r1
            r1 = 65
            if (r0 <= r1) goto L1c
            long r12 = r12 * r14
            return r12
        L1c:
            r1 = 64
            r2 = 0
            r3 = 1
            if (r0 < r1) goto L24
            r4 = 1
            goto L25
        L24:
            r4 = 0
        L25:
            java.lang.String r5 = "checkedMultiply"
            r6 = r12
            r8 = r14
            com.google.common.math.MathPreconditions.checkNoOverflow(r4, r5, r6, r8)
            r10 = r8
            r8 = r6
            r12 = 0
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 < 0) goto L36
            r12 = 1
            goto L37
        L36:
            r12 = 0
        L37:
            r0 = -9223372036854775808
            int r13 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r13 == 0) goto L3f
            r13 = 1
            goto L40
        L3f:
            r13 = 0
        L40:
            r6 = r12 | r13
            java.lang.String r7 = "checkedMultiply"
            com.google.common.math.MathPreconditions.checkNoOverflow(r6, r7, r8, r10)
            long r12 = r8 * r10
            if (r14 == 0) goto L54
            long r14 = r12 / r8
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 != 0) goto L52
            goto L54
        L52:
            r6 = 0
            goto L55
        L54:
            r6 = 1
        L55:
            java.lang.String r7 = "checkedMultiply"
            com.google.common.math.MathPreconditions.checkNoOverflow(r6, r7, r8, r10)
            return r12
    }

    @com.google.common.annotations.GwtIncompatible
    public static long checkedPow(long r15, int r17) {
            r2 = r15
            r6 = r17
            java.lang.String r0 = "exponent"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r6)
            r0 = -2
            r4 = 0
            r5 = 1
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 < 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            r7 = 2
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r1 > 0) goto L1b
            r1 = 1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            r0 = r0 & r1
            r7 = 1
            if (r0 == 0) goto L6c
            int r0 = (int) r2
            r1 = -2
            r9 = -1
            if (r0 == r1) goto L54
            r1 = -1
            if (r0 == r1) goto L4e
            if (r0 == 0) goto L48
            if (r0 == r5) goto L47
            r1 = 2
            if (r0 != r1) goto L41
            r0 = 63
            if (r6 >= r0) goto L37
            r0 = 1
            goto L38
        L37:
            r0 = 0
        L38:
            java.lang.String r1 = "checkedPow"
            long r4 = (long) r6
            com.google.common.math.MathPreconditions.checkNoOverflow(r0, r1, r2, r4)
            long r0 = r7 << r6
            return r0
        L41:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L47:
            return r7
        L48:
            if (r6 != 0) goto L4b
            return r7
        L4b:
            r0 = 0
            return r0
        L4e:
            r0 = r6 & 1
            if (r0 != 0) goto L53
            return r7
        L53:
            return r9
        L54:
            r0 = 64
            if (r6 >= r0) goto L5a
            r0 = 1
            goto L5b
        L5a:
            r0 = 0
        L5b:
            java.lang.String r1 = "checkedPow"
            long r4 = (long) r6
            r2 = r15
            com.google.common.math.MathPreconditions.checkNoOverflow(r0, r1, r2, r4)
            r0 = r6 & 1
            if (r0 != 0) goto L69
            long r0 = r7 << r6
            return r0
        L69:
            long r0 = r9 << r6
            return r0
        L6c:
            r11 = r15
        L6d:
            if (r6 == 0) goto La1
            if (r6 == r5) goto L9c
            r0 = r6 & 1
            if (r0 == 0) goto L7a
            long r0 = checkedMultiply(r7, r11)
            r7 = r0
        L7a:
            int r6 = r6 >> 1
            if (r6 <= 0) goto L6d
            r0 = -3037000499(0xffffffff4afb0ccd, double:NaN)
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 > 0) goto L92
            r0 = 3037000499(0xb504f333, double:1.500477613E-314)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 > 0) goto L92
            r9 = 1
            goto L93
        L92:
            r9 = 0
        L93:
            java.lang.String r10 = "checkedPow"
            long r13 = (long) r6
            com.google.common.math.MathPreconditions.checkNoOverflow(r9, r10, r11, r13)
            long r11 = r11 * r11
            goto L6d
        L9c:
            long r0 = checkedMultiply(r7, r11)
            return r0
        La1:
            return r7
    }

    @com.google.common.annotations.GwtIncompatible
    public static long checkedSubtract(long r11, long r13) {
            long r0 = r11 - r13
            long r2 = r11 ^ r13
            r4 = 0
            r5 = 1
            r6 = 0
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 < 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            long r8 = r11 ^ r0
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 < 0) goto L16
            r4 = 1
        L16:
            r5 = r2 | r4
            java.lang.String r6 = "checkedSubtract"
            r7 = r11
            r9 = r13
            com.google.common.math.MathPreconditions.checkNoOverflow(r5, r6, r7, r9)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static long divide(long r9, long r11, java.math.RoundingMode r13) {
            com.google.common.base.Preconditions.checkNotNull(r13)
            long r0 = r9 / r11
            long r2 = r11 * r0
            long r2 = r9 - r2
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L10
            goto L66
        L10:
            long r9 = r9 ^ r11
            r7 = 63
            long r9 = r9 >> r7
            int r10 = (int) r9
            r9 = 1
            r10 = r10 | r9
            int[] r7 = com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode
            int r8 = r13.ordinal()
            r7 = r7[r8]
            r8 = 0
            switch(r7) {
                case 1: goto L5a;
                case 2: goto L61;
                case 3: goto L57;
                case 4: goto L62;
                case 5: goto L54;
                case 6: goto L29;
                case 7: goto L29;
                case 8: goto L29;
                default: goto L23;
            }
        L23:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L29:
            long r2 = java.lang.Math.abs(r2)
            long r11 = java.lang.Math.abs(r11)
            long r11 = r11 - r2
            long r2 = r2 - r11
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 != 0) goto L51
            java.math.RoundingMode r11 = java.math.RoundingMode.HALF_UP
            if (r13 != r11) goto L3d
            r11 = 1
            goto L3e
        L3d:
            r11 = 0
        L3e:
            java.math.RoundingMode r12 = java.math.RoundingMode.HALF_EVEN
            if (r13 != r12) goto L44
            r12 = 1
            goto L45
        L44:
            r12 = 0
        L45:
            r2 = 1
            long r2 = r2 & r0
            int r13 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r13 == 0) goto L4d
            goto L4e
        L4d:
            r9 = 0
        L4e:
            r9 = r9 & r12
            r9 = r9 | r11
            goto L62
        L51:
            if (r11 <= 0) goto L61
            goto L62
        L54:
            if (r10 <= 0) goto L61
            goto L62
        L57:
            if (r10 >= 0) goto L61
            goto L62
        L5a:
            if (r6 != 0) goto L5d
            goto L5e
        L5d:
            r9 = 0
        L5e:
            com.google.common.math.MathPreconditions.checkRoundingUnnecessary(r9)
        L61:
            r9 = 0
        L62:
            if (r9 == 0) goto L66
            long r9 = (long) r10
            long r0 = r0 + r9
        L66:
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static long factorial(int r3) {
            java.lang.String r0 = "n"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r3)
            long[] r0 = com.google.common.math.LongMath.factorials
            int r1 = r0.length
            if (r3 >= r1) goto Ld
            r1 = r0[r3]
            return r1
        Ld:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
    }

    static boolean fitsInInt(long r3) {
            int r0 = (int) r3
            long r0 = (long) r0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L8
            r3 = 1
            return r3
        L8:
            r3 = 0
            return r3
    }

    @com.google.common.annotations.Beta
    public static long floorPowerOfTwo(long r2) {
            java.lang.String r0 = "x"
            com.google.common.math.MathPreconditions.checkPositive(r0, r2)
            int r2 = java.lang.Long.numberOfLeadingZeros(r2)
            int r2 = 63 - r2
            r0 = 1
            long r2 = r0 << r2
            return r2
    }

    public static long gcd(long r4, long r6) {
            java.lang.String r0 = "a"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r4)
            java.lang.String r0 = "b"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r6)
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L11
            return r6
        L11:
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 != 0) goto L16
            return r4
        L16:
            int r0 = java.lang.Long.numberOfTrailingZeros(r4)
            long r4 = r4 >> r0
            int r1 = java.lang.Long.numberOfTrailingZeros(r6)
            long r6 = r6 >> r1
        L20:
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L33
            long r4 = r4 - r6
            r2 = 63
            long r2 = r4 >> r2
            long r2 = r2 & r4
            long r4 = r4 - r2
            long r4 = r4 - r2
            long r6 = r6 + r2
            int r2 = java.lang.Long.numberOfTrailingZeros(r4)
            long r4 = r4 >> r2
            goto L20
        L33:
            int r6 = java.lang.Math.min(r0, r1)
            long r4 = r4 << r6
            return r4
    }

    public static boolean isPowerOfTwo(long r7) {
            r0 = 0
            r1 = 1
            r2 = 0
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 <= 0) goto La
            r4 = 1
            goto Lb
        La:
            r4 = 0
        Lb:
            r5 = 1
            long r5 = r7 - r5
            long r7 = r7 & r5
            int r5 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r5 != 0) goto L15
            r0 = 1
        L15:
            r7 = r4 & r0
            return r7
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static boolean isPrime(long r11) {
            r0 = 2
            r2 = 0
            int r3 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r3 >= 0) goto Ld
            java.lang.String r0 = "n"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r11)
            return r2
        Ld:
            r0 = 1
            if (r3 == 0) goto L82
            r3 = 3
            int r1 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r1 == 0) goto L82
            r3 = 5
            int r1 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r1 == 0) goto L82
            r3 = 7
            int r1 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r1 == 0) goto L82
            r5 = 11
            int r1 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r1 == 0) goto L82
            r7 = 13
            int r1 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r1 != 0) goto L2f
            goto L82
        L2f:
            r9 = 30
            long r9 = r11 % r9
            int r1 = (int) r9
            int r1 = r0 << r1
            r9 = -545925251(0xffffffffdf75d77d, float:-1.7714765E19)
            r1 = r1 & r9
            if (r1 == 0) goto L3d
            return r2
        L3d:
            long r3 = r11 % r3
            r9 = 0
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r1 == 0) goto L81
            long r3 = r11 % r5
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r1 == 0) goto L81
            long r3 = r11 % r7
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r1 != 0) goto L52
            goto L81
        L52:
            r3 = 289(0x121, double:1.43E-321)
            int r1 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r1 >= 0) goto L59
            return r0
        L59:
            long[][] r1 = com.google.common.math.LongMath.millerRabinBaseSets
            int r3 = r1.length
            r4 = 0
        L5d:
            if (r4 >= r3) goto L7b
            r5 = r1[r4]
            r6 = r5[r2]
            int r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r8 > 0) goto L78
            r1 = 1
        L68:
            int r3 = r5.length
            if (r1 >= r3) goto L77
            r3 = r5[r1]
            boolean r3 = com.google.common.math.LongMath.MillerRabinTester.test(r3, r11)
            if (r3 != 0) goto L74
            return r2
        L74:
            int r1 = r1 + 1
            goto L68
        L77:
            return r0
        L78:
            int r4 = r4 + 1
            goto L5d
        L7b:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            r11.<init>()
            throw r11
        L81:
            return r2
        L82:
            return r0
    }

    @com.google.common.annotations.VisibleForTesting
    static int lessThanBranchFree(long r0, long r2) {
            long r0 = r0 - r2
            long r0 = ~r0
            long r0 = ~r0
            r2 = 63
            long r0 = r0 >>> r2
            int r1 = (int) r0
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    public static int log10(long r4, java.math.RoundingMode r6) {
            java.lang.String r0 = "x"
            com.google.common.math.MathPreconditions.checkPositive(r0, r4)
            int r0 = log10Floor(r4)
            long[] r1 = com.google.common.math.LongMath.powersOf10
            r2 = r1[r0]
            int[] r1 = com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode
            int r6 = r6.ordinal()
            r6 = r1[r6]
            switch(r6) {
                case 1: goto L2e;
                case 2: goto L2d;
                case 3: goto L2d;
                case 4: goto L28;
                case 5: goto L28;
                case 6: goto L1e;
                case 7: goto L1e;
                case 8: goto L1e;
                default: goto L18;
            }
        L18:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L1e:
            long[] r6 = com.google.common.math.LongMath.halfPowersOf10
            r1 = r6[r0]
            int r4 = lessThanBranchFree(r1, r4)
        L26:
            int r0 = r0 + r4
            return r0
        L28:
            int r4 = lessThanBranchFree(r2, r4)
            goto L26
        L2d:
            return r0
        L2e:
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L34
            r4 = 1
            goto L35
        L34:
            r4 = 0
        L35:
            com.google.common.math.MathPreconditions.checkRoundingUnnecessary(r4)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    static int log10Floor(long r4) {
            byte[] r0 = com.google.common.math.LongMath.maxLog10ForLeadingZeros
            int r1 = java.lang.Long.numberOfLeadingZeros(r4)
            r0 = r0[r1]
            long[] r1 = com.google.common.math.LongMath.powersOf10
            r2 = r1[r0]
            int r4 = lessThanBranchFree(r4, r2)
            int r0 = r0 - r4
            return r0
    }

    public static int log2(long r2, java.math.RoundingMode r4) {
            java.lang.String r0 = "x"
            com.google.common.math.MathPreconditions.checkPositive(r0, r2)
            int[] r0 = com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode
            int r4 = r4.ordinal()
            r4 = r0[r4]
            switch(r4) {
                case 1: goto L34;
                case 2: goto L3b;
                case 3: goto L3b;
                case 4: goto L2a;
                case 5: goto L2a;
                case 6: goto L18;
                case 7: goto L18;
                case 8: goto L18;
                default: goto L10;
            }
        L10:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "impossible"
            r2.<init>(r3)
            throw r2
        L18:
            int r4 = java.lang.Long.numberOfLeadingZeros(r2)
            r0 = -5402926248376769404(0xb504f333f9de6484, double:-2.734104117489491E-53)
            long r0 = r0 >>> r4
            int r4 = 63 - r4
            int r2 = lessThanBranchFree(r0, r2)
            int r4 = r4 + r2
            return r4
        L2a:
            r0 = 1
            long r2 = r2 - r0
            int r2 = java.lang.Long.numberOfLeadingZeros(r2)
            int r2 = 64 - r2
            return r2
        L34:
            boolean r4 = isPowerOfTwo(r2)
            com.google.common.math.MathPreconditions.checkRoundingUnnecessary(r4)
        L3b:
            int r2 = java.lang.Long.numberOfLeadingZeros(r2)
            int r2 = 63 - r2
            return r2
    }

    public static long mean(long r2, long r4) {
            long r0 = r2 & r4
            long r2 = r2 ^ r4
            r4 = 1
            long r2 = r2 >> r4
            long r0 = r0 + r2
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static int mod(long r2, int r4) {
            long r0 = (long) r4
            long r2 = mod(r2, r0)
            int r3 = (int) r2
            return r3
    }

    @com.google.common.annotations.GwtIncompatible
    public static long mod(long r3, long r5) {
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto Le
            long r3 = r3 % r5
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto Lc
            return r3
        Lc:
            long r3 = r3 + r5
            return r3
        Le:
            java.lang.ArithmeticException r3 = new java.lang.ArithmeticException
            java.lang.String r4 = "Modulus must be positive"
            r3.<init>(r4)
            throw r3
    }

    static long multiplyFraction(long r3, long r5, long r7) {
            r0 = 1
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L8
            long r5 = r5 / r7
            return r5
        L8:
            long r0 = gcd(r3, r7)
            long r3 = r3 / r0
            long r7 = r7 / r0
            long r5 = r5 / r7
            long r3 = r3 * r5
            return r3
    }

    @com.google.common.annotations.GwtIncompatible
    public static long pow(long r7, int r9) {
            java.lang.String r0 = "exponent"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r9)
            r0 = -2
            r2 = 1
            r3 = 1
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 > 0) goto L4d
            r0 = 2
            int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r5 > 0) goto L4d
            int r8 = (int) r7
            r7 = -2
            r0 = 64
            r5 = 0
            if (r8 == r7) goto L3f
            r7 = -1
            if (r8 == r7) goto L37
            if (r8 == 0) goto L33
            if (r8 == r2) goto L32
            r7 = 2
            if (r8 != r7) goto L2c
            if (r9 >= r0) goto L2b
            long r7 = r3 << r9
            return r7
        L2b:
            return r5
        L2c:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L32:
            return r3
        L33:
            if (r9 != 0) goto L36
            return r3
        L36:
            return r5
        L37:
            r7 = r9 & 1
            if (r7 != 0) goto L3c
            return r3
        L3c:
            r7 = -1
            return r7
        L3f:
            if (r9 >= r0) goto L4c
            r7 = r9 & 1
            if (r7 != 0) goto L48
            long r7 = r3 << r9
            return r7
        L48:
            long r7 = r3 << r9
            long r7 = -r7
            return r7
        L4c:
            return r5
        L4d:
            r0 = r3
        L4e:
            if (r9 == 0) goto L62
            if (r9 == r2) goto L60
            r5 = r9 & 1
            if (r5 != 0) goto L58
            r5 = r3
            goto L59
        L58:
            r5 = r7
        L59:
            long r0 = r0 * r5
            long r7 = r7 * r7
            int r9 = r9 >> 1
            goto L4e
        L60:
            long r0 = r0 * r7
        L62:
            return r0
    }

    @com.google.common.annotations.Beta
    public static long saturatedAdd(long r7, long r9) {
            long r0 = r7 + r9
            long r9 = r9 ^ r7
            r2 = 0
            r3 = 1
            r4 = 0
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 >= 0) goto Ld
            r9 = 1
            goto Le
        Ld:
            r9 = 0
        Le:
            long r7 = r7 ^ r0
            int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r10 < 0) goto L14
            r2 = 1
        L14:
            r7 = r9 | r2
            if (r7 == 0) goto L19
            return r0
        L19:
            r7 = 63
            long r7 = r0 >>> r7
            r9 = 1
            long r7 = r7 ^ r9
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r7 = r7 + r9
            return r7
    }

    @com.google.common.annotations.Beta
    public static long saturatedMultiply(long r10, long r12) {
            int r0 = java.lang.Long.numberOfLeadingZeros(r10)
            long r1 = ~r10
            int r1 = java.lang.Long.numberOfLeadingZeros(r1)
            int r0 = r0 + r1
            int r1 = java.lang.Long.numberOfLeadingZeros(r12)
            int r0 = r0 + r1
            long r1 = ~r12
            int r1 = java.lang.Long.numberOfLeadingZeros(r1)
            int r0 = r0 + r1
            r1 = 65
            if (r0 <= r1) goto L1c
            long r10 = r10 * r12
            return r10
        L1c:
            long r1 = r10 ^ r12
            r3 = 63
            long r1 = r1 >>> r3
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r1 = r1 + r3
            r3 = 64
            r4 = 0
            r5 = 1
            if (r0 >= r3) goto L2f
            r0 = 1
            goto L30
        L2f:
            r0 = 0
        L30:
            r6 = 0
            int r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r3 >= 0) goto L38
            r6 = 1
            goto L39
        L38:
            r6 = 0
        L39:
            r7 = -9223372036854775808
            int r9 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r9 != 0) goto L40
            r4 = 1
        L40:
            r4 = r4 & r6
            r0 = r0 | r4
            if (r0 == 0) goto L45
            goto L50
        L45:
            long r4 = r10 * r12
            if (r3 == 0) goto L51
            long r10 = r4 / r10
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 != 0) goto L50
            goto L51
        L50:
            return r1
        L51:
            return r4
    }

    @com.google.common.annotations.Beta
    public static long saturatedPow(long r10, int r12) {
            java.lang.String r0 = "exponent"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r12)
            r0 = -2
            r2 = 0
            r3 = 1
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 < 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            r4 = 2
            int r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r1 > 0) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            r0 = r0 & r1
            r1 = 63
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 1
            if (r0 == 0) goto L61
            int r11 = (int) r10
            r10 = -2
            r8 = -1
            if (r11 == r10) goto L4e
            r10 = -1
            if (r11 == r10) goto L48
            if (r11 == 0) goto L42
            if (r11 == r3) goto L41
            r10 = 2
            if (r11 != r10) goto L3b
            if (r12 < r1) goto L38
            return r4
        L38:
            long r10 = r6 << r12
            return r10
        L3b:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            r10.<init>()
            throw r10
        L41:
            return r6
        L42:
            if (r12 != 0) goto L45
            return r6
        L45:
            r10 = 0
            return r10
        L48:
            r10 = r12 & 1
            if (r10 != 0) goto L4d
            return r6
        L4d:
            return r8
        L4e:
            r10 = 64
            if (r12 < r10) goto L57
            r10 = r12 & 1
            long r10 = (long) r10
            long r10 = r10 + r4
            return r10
        L57:
            r10 = r12 & 1
            if (r10 != 0) goto L5e
            long r10 = r6 << r12
            return r10
        L5e:
            long r10 = r8 << r12
            return r10
        L61:
            long r0 = r10 >>> r1
            r8 = r12 & 1
            long r8 = (long) r8
            long r0 = r0 & r8
            long r0 = r0 + r4
        L68:
            if (r12 == 0) goto L9d
            if (r12 == r3) goto L98
            r4 = r12 & 1
            if (r4 == 0) goto L75
            long r4 = saturatedMultiply(r6, r10)
            r6 = r4
        L75:
            int r12 = r12 >> 1
            if (r12 <= 0) goto L68
            r4 = -3037000499(0xffffffff4afb0ccd, double:NaN)
            int r8 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r8 <= 0) goto L84
            r4 = 1
            goto L85
        L84:
            r4 = 0
        L85:
            r8 = 3037000499(0xb504f333, double:1.500477613E-314)
            int r5 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r5 <= 0) goto L90
            r5 = 1
            goto L91
        L90:
            r5 = 0
        L91:
            r4 = r4 | r5
            if (r4 == 0) goto L95
            return r0
        L95:
            long r10 = r10 * r10
            goto L68
        L98:
            long r10 = saturatedMultiply(r6, r10)
            return r10
        L9d:
            return r6
    }

    @com.google.common.annotations.Beta
    public static long saturatedSubtract(long r7, long r9) {
            long r0 = r7 - r9
            long r9 = r9 ^ r7
            r2 = 0
            r3 = 1
            r4 = 0
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 < 0) goto Ld
            r9 = 1
            goto Le
        Ld:
            r9 = 0
        Le:
            long r7 = r7 ^ r0
            int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r10 < 0) goto L14
            r2 = 1
        L14:
            r7 = r9 | r2
            if (r7 == 0) goto L19
            return r0
        L19:
            r7 = 63
            long r7 = r0 >>> r7
            r9 = 1
            long r7 = r7 ^ r9
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r7 = r7 + r9
            return r7
    }

    @com.google.common.annotations.GwtIncompatible
    public static long sqrt(long r8, java.math.RoundingMode r10) {
            java.lang.String r0 = "x"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r8)
            boolean r0 = fitsInInt(r8)
            if (r0 == 0) goto L12
            int r9 = (int) r8
            int r8 = com.google.common.math.IntMath.sqrt(r9, r10)
            long r8 = (long) r8
            return r8
        L12:
            double r0 = (double) r8
            double r0 = java.lang.Math.sqrt(r0)
            long r0 = (long) r0
            long r2 = r0 * r0
            int[] r4 = com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode
            int r10 = r10.ordinal()
            r10 = r4[r10]
            r4 = 1
            r6 = 0
            r7 = 1
            switch(r10) {
                case 1: goto L4c;
                case 2: goto L46;
                case 3: goto L46;
                case 4: goto L40;
                case 5: goto L40;
                case 6: goto L2f;
                case 7: goto L2f;
                case 8: goto L2f;
                default: goto L29;
            }
        L29:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L2f:
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 >= 0) goto L34
            r6 = 1
        L34:
            long r2 = (long) r6
            long r0 = r0 - r2
            long r2 = r0 * r0
            long r2 = r2 + r0
            int r8 = lessThanBranchFree(r2, r8)
            long r8 = (long) r8
            long r0 = r0 + r8
            return r0
        L40:
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 <= 0) goto L4b
            long r0 = r0 + r4
            return r0
        L46:
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 >= 0) goto L4b
            long r0 = r0 - r4
        L4b:
            return r0
        L4c:
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 != 0) goto L51
            r6 = 1
        L51:
            com.google.common.math.MathPreconditions.checkRoundingUnnecessary(r6)
            return r0
    }
}
