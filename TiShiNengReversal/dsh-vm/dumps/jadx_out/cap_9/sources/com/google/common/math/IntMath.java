package com.google.common.math;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class IntMath {

    @com.google.common.annotations.VisibleForTesting
    static final int FLOOR_SQRT_MAX_INT = 46340;

    @com.google.common.annotations.VisibleForTesting
    static final int MAX_POWER_OF_SQRT2_UNSIGNED = -1257966797;

    @com.google.common.annotations.VisibleForTesting
    static final int MAX_SIGNED_POWER_OF_TWO = 1073741824;

    @com.google.common.annotations.VisibleForTesting
    static int[] biggestBinomials;
    private static final int[] factorials = null;

    @com.google.common.annotations.VisibleForTesting
    static final int[] halfPowersOf10 = null;

    @com.google.common.annotations.VisibleForTesting
    static final byte[] maxLog10ForLeadingZeros = null;

    @com.google.common.annotations.VisibleForTesting
    static final int[] powersOf10 = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.math.IntMath$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode = null;

        static {
                java.math.RoundingMode[] r0 = java.math.RoundingMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.common.math.IntMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode = r0
                java.math.RoundingMode r1 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.common.math.IntMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L1d
                java.math.RoundingMode r1 = java.math.RoundingMode.DOWN     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.common.math.IntMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L28
                java.math.RoundingMode r1 = java.math.RoundingMode.FLOOR     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.common.math.IntMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L33
                java.math.RoundingMode r1 = java.math.RoundingMode.UP     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.common.math.IntMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L3e
                java.math.RoundingMode r1 = java.math.RoundingMode.CEILING     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.common.math.IntMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L49
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_DOWN     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.google.common.math.IntMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L54
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_UP     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = com.google.common.math.IntMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L60
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

    static {
            r0 = 33
            byte[] r0 = new byte[r0]
            r0 = {x002c: FILL_ARRAY_DATA , data: [9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0} // fill-array
            com.google.common.math.IntMath.maxLog10ForLeadingZeros = r0
            r0 = 10
            int[] r1 = new int[r0]
            r1 = {x0042: FILL_ARRAY_DATA , data: [1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000} // fill-array
            com.google.common.math.IntMath.powersOf10 = r1
            int[] r0 = new int[r0]
            r0 = {x005a: FILL_ARRAY_DATA , data: [3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 2147483647} // fill-array
            com.google.common.math.IntMath.halfPowersOf10 = r0
            r0 = 13
            int[] r0 = new int[r0]
            r0 = {x0072: FILL_ARRAY_DATA , data: [1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600} // fill-array
            com.google.common.math.IntMath.factorials = r0
            r0 = 17
            int[] r0 = new int[r0]
            r0 = {x0090: FILL_ARRAY_DATA , data: [2147483647, 2147483647, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33} // fill-array
            com.google.common.math.IntMath.biggestBinomials = r0
            return
    }

    private IntMath() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int binomial(int r5, int r6) {
            java.lang.String r0 = "n"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r5)
            java.lang.String r0 = "k"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r6)
            r0 = 0
            r1 = 1
            if (r6 > r5) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            java.lang.String r3 = "k (%s) > n (%s)"
            com.google.common.base.Preconditions.checkArgument(r2, r3, r6, r5)
            int r2 = r5 >> 1
            if (r6 <= r2) goto L1c
            int r6 = r5 - r6
        L1c:
            int[] r2 = com.google.common.math.IntMath.biggestBinomials
            int r3 = r2.length
            if (r6 >= r3) goto L3b
            r2 = r2[r6]
            if (r5 <= r2) goto L26
            goto L3b
        L26:
            if (r6 == 0) goto L3a
            if (r6 == r1) goto L39
            r1 = 1
        L2c:
            if (r0 >= r6) goto L38
            int r3 = r5 - r0
            long r3 = (long) r3
            long r1 = r1 * r3
            int r0 = r0 + 1
            long r3 = (long) r0
            long r1 = r1 / r3
            goto L2c
        L38:
            int r5 = (int) r1
        L39:
            return r5
        L3a:
            return r1
        L3b:
            r5 = 2147483647(0x7fffffff, float:NaN)
            return r5
    }

    @com.google.common.annotations.Beta
    public static int ceilingPowerOfTwo(int r3) {
            java.lang.String r0 = "x"
            com.google.common.math.MathPreconditions.checkPositive(r0, r3)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r3 > r0) goto L13
            r0 = 1
            int r3 = r3 - r0
            int r3 = java.lang.Integer.numberOfLeadingZeros(r3)
            int r3 = -r3
            int r3 = r0 << r3
            return r3
        L13:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ceilingPowerOfTwo("
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = ") not representable as an int"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static int checkedAdd(int r6, int r7) {
            long r0 = (long) r6
            long r2 = (long) r7
            long r0 = r0 + r2
            int r2 = (int) r0
            long r3 = (long) r2
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            java.lang.String r1 = "checkedAdd"
            com.google.common.math.MathPreconditions.checkNoOverflow(r0, r1, r6, r7)
            return r2
    }

    public static int checkedMultiply(int r6, int r7) {
            long r0 = (long) r6
            long r2 = (long) r7
            long r0 = r0 * r2
            int r2 = (int) r0
            long r3 = (long) r2
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            java.lang.String r1 = "checkedMultiply"
            com.google.common.math.MathPreconditions.checkNoOverflow(r0, r1, r6, r7)
            return r2
    }

    public static int checkedPow(int r6, int r7) {
            java.lang.String r0 = "exponent"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r7)
            r0 = -2
            java.lang.String r1 = "checkedPow"
            r2 = -1
            r3 = 0
            r4 = 1
            if (r6 == r0) goto L5a
            if (r6 == r2) goto L54
            if (r6 == 0) goto L50
            if (r6 == r4) goto L4f
            r0 = 2
            if (r6 == r0) goto L44
            r0 = 1
        L17:
            if (r7 == 0) goto L43
            if (r7 == r4) goto L3e
            r2 = r7 & 1
            if (r2 == 0) goto L23
            int r0 = checkedMultiply(r0, r6)
        L23:
            int r7 = r7 >> 1
            if (r7 <= 0) goto L17
            r2 = -46340(0xffffffffffff4afc, float:NaN)
            if (r2 > r6) goto L2e
            r2 = 1
            goto L2f
        L2e:
            r2 = 0
        L2f:
            r5 = 46340(0xb504, float:6.4936E-41)
            if (r6 > r5) goto L36
            r5 = 1
            goto L37
        L36:
            r5 = 0
        L37:
            r2 = r2 & r5
            com.google.common.math.MathPreconditions.checkNoOverflow(r2, r1, r6, r7)
            int r6 = r6 * r6
            goto L17
        L3e:
            int r6 = checkedMultiply(r0, r6)
            return r6
        L43:
            return r0
        L44:
            r0 = 31
            if (r7 >= r0) goto L49
            r3 = 1
        L49:
            com.google.common.math.MathPreconditions.checkNoOverflow(r3, r1, r6, r7)
            int r6 = r4 << r7
            return r6
        L4f:
            return r4
        L50:
            if (r7 != 0) goto L53
            return r4
        L53:
            return r3
        L54:
            r6 = r7 & 1
            if (r6 != 0) goto L59
            return r4
        L59:
            return r2
        L5a:
            r0 = 32
            if (r7 >= r0) goto L5f
            r3 = 1
        L5f:
            com.google.common.math.MathPreconditions.checkNoOverflow(r3, r1, r6, r7)
            r6 = r7 & 1
            if (r6 != 0) goto L69
            int r6 = r4 << r7
            return r6
        L69:
            int r6 = r2 << r7
            return r6
    }

    public static int checkedSubtract(int r6, int r7) {
            long r0 = (long) r6
            long r2 = (long) r7
            long r0 = r0 - r2
            int r2 = (int) r0
            long r3 = (long) r2
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            java.lang.String r1 = "checkedSubtract"
            com.google.common.math.MathPreconditions.checkNoOverflow(r0, r1, r6, r7)
            return r2
    }

    public static int divide(int r5, int r6, java.math.RoundingMode r7) {
            com.google.common.base.Preconditions.checkNotNull(r7)
            if (r6 == 0) goto L5b
            int r0 = r5 / r6
            int r1 = r6 * r0
            int r1 = r5 - r1
            if (r1 != 0) goto Le
            return r0
        Le:
            r5 = r5 ^ r6
            int r5 = r5 >> 31
            r2 = 1
            r5 = r5 | r2
            int[] r3 = com.google.common.math.IntMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode
            int r4 = r7.ordinal()
            r3 = r3[r4]
            r4 = 0
            switch(r3) {
                case 1: goto L53;
                case 2: goto L5a;
                case 3: goto L4f;
                case 4: goto L51;
                case 5: goto L4b;
                case 6: goto L25;
                case 7: goto L25;
                case 8: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L25:
            int r1 = java.lang.Math.abs(r1)
            int r6 = java.lang.Math.abs(r6)
            int r6 = r6 - r1
            int r1 = r1 - r6
            if (r1 != 0) goto L47
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_UP
            if (r7 == r6) goto L51
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_EVEN
            if (r7 != r6) goto L3b
            r6 = 1
            goto L3c
        L3b:
            r6 = 0
        L3c:
            r7 = r0 & 1
            if (r7 == 0) goto L41
            goto L42
        L41:
            r2 = 0
        L42:
            r6 = r6 & r2
            if (r6 == 0) goto L46
            goto L51
        L46:
            return r0
        L47:
            if (r1 <= 0) goto L4a
            goto L51
        L4a:
            return r0
        L4b:
            if (r5 <= 0) goto L4e
            goto L51
        L4e:
            return r0
        L4f:
            if (r5 >= 0) goto L52
        L51:
            int r0 = r0 + r5
        L52:
            return r0
        L53:
            if (r1 != 0) goto L56
            goto L57
        L56:
            r2 = 0
        L57:
            com.google.common.math.MathPreconditions.checkRoundingUnnecessary(r2)
        L5a:
            return r0
        L5b:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            java.lang.String r6 = "/ by zero"
            r5.<init>(r6)
            throw r5
    }

    public static int factorial(int r2) {
            java.lang.String r0 = "n"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r2)
            int[] r0 = com.google.common.math.IntMath.factorials
            int r1 = r0.length
            if (r2 >= r1) goto Ld
            r2 = r0[r2]
            return r2
        Ld:
            r2 = 2147483647(0x7fffffff, float:NaN)
            return r2
    }

    @com.google.common.annotations.Beta
    public static int floorPowerOfTwo(int r1) {
            java.lang.String r0 = "x"
            com.google.common.math.MathPreconditions.checkPositive(r0, r1)
            int r1 = java.lang.Integer.highestOneBit(r1)
            return r1
    }

    public static int gcd(int r3, int r4) {
            java.lang.String r0 = "a"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r3)
            java.lang.String r0 = "b"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r4)
            if (r3 != 0) goto Ld
            return r4
        Ld:
            if (r4 != 0) goto L10
            return r3
        L10:
            int r0 = java.lang.Integer.numberOfTrailingZeros(r3)
            int r3 = r3 >> r0
            int r1 = java.lang.Integer.numberOfTrailingZeros(r4)
            int r4 = r4 >> r1
        L1a:
            if (r3 == r4) goto L29
            int r3 = r3 - r4
            int r2 = r3 >> 31
            r2 = r2 & r3
            int r3 = r3 - r2
            int r3 = r3 - r2
            int r4 = r4 + r2
            int r2 = java.lang.Integer.numberOfTrailingZeros(r3)
            int r3 = r3 >> r2
            goto L1a
        L29:
            int r4 = java.lang.Math.min(r0, r1)
            int r3 = r3 << r4
            return r3
    }

    public static boolean isPowerOfTwo(int r4) {
            r0 = 0
            r1 = 1
            if (r4 <= 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            int r3 = r4 + (-1)
            r4 = r4 & r3
            if (r4 != 0) goto Ld
            r0 = 1
        Ld:
            r4 = r2 & r0
            return r4
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static boolean isPrime(int r2) {
            long r0 = (long) r2
            boolean r2 = com.google.common.math.LongMath.isPrime(r0)
            return r2
    }

    @com.google.common.annotations.VisibleForTesting
    static int lessThanBranchFree(int r0, int r1) {
            int r0 = r0 - r1
            int r0 = ~r0
            int r0 = ~r0
            int r0 = r0 >>> 31
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static int log10(int r3, java.math.RoundingMode r4) {
            java.lang.String r0 = "x"
            com.google.common.math.MathPreconditions.checkPositive(r0, r3)
            int r0 = log10Floor(r3)
            int[] r1 = com.google.common.math.IntMath.powersOf10
            r1 = r1[r0]
            int[] r2 = com.google.common.math.IntMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode
            int r4 = r4.ordinal()
            r4 = r2[r4]
            switch(r4) {
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
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L1e:
            int[] r4 = com.google.common.math.IntMath.halfPowersOf10
            r4 = r4[r0]
            int r3 = lessThanBranchFree(r4, r3)
        L26:
            int r0 = r0 + r3
            return r0
        L28:
            int r3 = lessThanBranchFree(r1, r3)
            goto L26
        L2d:
            return r0
        L2e:
            if (r3 != r1) goto L32
            r3 = 1
            goto L33
        L32:
            r3 = 0
        L33:
            com.google.common.math.MathPreconditions.checkRoundingUnnecessary(r3)
            return r0
    }

    private static int log10Floor(int r2) {
            byte[] r0 = com.google.common.math.IntMath.maxLog10ForLeadingZeros
            int r1 = java.lang.Integer.numberOfLeadingZeros(r2)
            r0 = r0[r1]
            int[] r1 = com.google.common.math.IntMath.powersOf10
            r1 = r1[r0]
            int r2 = lessThanBranchFree(r2, r1)
            int r0 = r0 - r2
            return r0
    }

    public static int log2(int r1, java.math.RoundingMode r2) {
            java.lang.String r0 = "x"
            com.google.common.math.MathPreconditions.checkPositive(r0, r1)
            int[] r0 = com.google.common.math.IntMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode
            int r2 = r2.ordinal()
            r2 = r0[r2]
            switch(r2) {
                case 1: goto L2f;
                case 2: goto L36;
                case 3: goto L36;
                case 4: goto L26;
                case 5: goto L26;
                case 6: goto L16;
                case 7: goto L16;
                case 8: goto L16;
                default: goto L10;
            }
        L10:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L16:
            int r2 = java.lang.Integer.numberOfLeadingZeros(r1)
            r0 = -1257966797(0xffffffffb504f333, float:-4.9527733E-7)
            int r0 = r0 >>> r2
            int r2 = 31 - r2
            int r1 = lessThanBranchFree(r0, r1)
            int r2 = r2 + r1
            return r2
        L26:
            int r1 = r1 + (-1)
            int r1 = java.lang.Integer.numberOfLeadingZeros(r1)
            int r1 = 32 - r1
            return r1
        L2f:
            boolean r2 = isPowerOfTwo(r1)
            com.google.common.math.MathPreconditions.checkRoundingUnnecessary(r2)
        L36:
            int r1 = java.lang.Integer.numberOfLeadingZeros(r1)
            int r1 = 31 - r1
            return r1
    }

    public static int mean(int r1, int r2) {
            r0 = r1 & r2
            r1 = r1 ^ r2
            int r1 = r1 >> 1
            int r0 = r0 + r1
            return r0
    }

    public static int mod(int r2, int r3) {
            if (r3 <= 0) goto L8
            int r2 = r2 % r3
            if (r2 < 0) goto L6
            return r2
        L6:
            int r2 = r2 + r3
            return r2
        L8:
            java.lang.ArithmeticException r2 = new java.lang.ArithmeticException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Modulus "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " must be > 0"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    @com.google.common.annotations.GwtIncompatible
    public static int pow(int r4, int r5) {
            java.lang.String r0 = "exponent"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r5)
            r0 = -2
            r1 = 32
            r2 = 0
            r3 = 1
            if (r4 == r0) goto L3e
            r0 = -1
            if (r4 == r0) goto L38
            if (r4 == 0) goto L34
            if (r4 == r3) goto L33
            r0 = 2
            if (r4 == r0) goto L2d
            r0 = 1
        L17:
            if (r5 == 0) goto L2c
            if (r5 == r3) goto L29
            r1 = r5 & 1
            if (r1 != 0) goto L21
            r1 = 1
            goto L22
        L21:
            r1 = r4
        L22:
            int r0 = r0 * r1
            int r4 = r4 * r4
            int r5 = r5 >> 1
            goto L17
        L29:
            int r4 = r4 * r0
            return r4
        L2c:
            return r0
        L2d:
            if (r5 >= r1) goto L32
            int r4 = r3 << r5
            return r4
        L32:
            return r2
        L33:
            return r3
        L34:
            if (r5 != 0) goto L37
            return r3
        L37:
            return r2
        L38:
            r4 = r5 & 1
            if (r4 != 0) goto L3d
            return r3
        L3d:
            return r0
        L3e:
            if (r5 >= r1) goto L4b
            r4 = r5 & 1
            if (r4 != 0) goto L47
            int r4 = r3 << r5
            return r4
        L47:
            int r4 = r3 << r5
            int r4 = -r4
            return r4
        L4b:
            return r2
    }

    @com.google.common.annotations.Beta
    public static int saturatedAdd(int r2, int r3) {
            long r0 = (long) r2
            long r2 = (long) r3
            long r0 = r0 + r2
            int r2 = com.google.common.primitives.Ints.saturatedCast(r0)
            return r2
    }

    @com.google.common.annotations.Beta
    public static int saturatedMultiply(int r2, int r3) {
            long r0 = (long) r2
            long r2 = (long) r3
            long r0 = r0 * r2
            int r2 = com.google.common.primitives.Ints.saturatedCast(r0)
            return r2
    }

    @com.google.common.annotations.Beta
    public static int saturatedPow(int r6, int r7) {
            java.lang.String r0 = "exponent"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r7)
            r0 = -2
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = -1
            r3 = 1
            if (r6 == r0) goto L5e
            if (r6 == r2) goto L58
            r0 = 0
            if (r6 == 0) goto L54
            if (r6 == r3) goto L53
            r2 = 2
            if (r6 == r2) goto L4b
            int r2 = r6 >>> 31
            r4 = r7 & 1
            r2 = r2 & r4
            int r2 = r2 + r1
            r1 = 1
        L1e:
            if (r7 == 0) goto L4a
            if (r7 == r3) goto L45
            r4 = r7 & 1
            if (r4 == 0) goto L2a
            int r1 = saturatedMultiply(r1, r6)
        L2a:
            int r7 = r7 >> 1
            if (r7 <= 0) goto L1e
            r4 = -46340(0xffffffffffff4afc, float:NaN)
            if (r4 <= r6) goto L35
            r4 = 1
            goto L36
        L35:
            r4 = 0
        L36:
            r5 = 46340(0xb504, float:6.4936E-41)
            if (r6 <= r5) goto L3d
            r5 = 1
            goto L3e
        L3d:
            r5 = 0
        L3e:
            r4 = r4 | r5
            if (r4 == 0) goto L42
            return r2
        L42:
            int r6 = r6 * r6
            goto L1e
        L45:
            int r6 = saturatedMultiply(r1, r6)
            return r6
        L4a:
            return r1
        L4b:
            r6 = 31
            if (r7 < r6) goto L50
            return r1
        L50:
            int r6 = r3 << r7
            return r6
        L53:
            return r3
        L54:
            if (r7 != 0) goto L57
            return r3
        L57:
            return r0
        L58:
            r6 = r7 & 1
            if (r6 != 0) goto L5d
            return r3
        L5d:
            return r2
        L5e:
            r6 = 32
            if (r7 < r6) goto L66
            r6 = r7 & 1
            int r6 = r6 + r1
            return r6
        L66:
            r6 = r7 & 1
            if (r6 != 0) goto L6d
            int r6 = r3 << r7
            return r6
        L6d:
            int r6 = r2 << r7
            return r6
    }

    @com.google.common.annotations.Beta
    public static int saturatedSubtract(int r2, int r3) {
            long r0 = (long) r2
            long r2 = (long) r3
            long r0 = r0 - r2
            int r2 = com.google.common.primitives.Ints.saturatedCast(r0)
            return r2
    }

    @com.google.common.annotations.GwtIncompatible
    public static int sqrt(int r2, java.math.RoundingMode r3) {
            java.lang.String r0 = "x"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r2)
            int r0 = sqrtFloor(r2)
            int[] r1 = com.google.common.math.IntMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode
            int r3 = r3.ordinal()
            r3 = r1[r3]
            switch(r3) {
                case 1: goto L2b;
                case 2: goto L2a;
                case 3: goto L2a;
                case 4: goto L23;
                case 5: goto L23;
                case 6: goto L1a;
                case 7: goto L1a;
                case 8: goto L1a;
                default: goto L14;
            }
        L14:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L1a:
            int r3 = r0 * r0
            int r3 = r3 + r0
            int r2 = lessThanBranchFree(r3, r2)
        L21:
            int r0 = r0 + r2
            return r0
        L23:
            int r3 = r0 * r0
            int r2 = lessThanBranchFree(r3, r2)
            goto L21
        L2a:
            return r0
        L2b:
            int r3 = r0 * r0
            if (r3 != r2) goto L31
            r2 = 1
            goto L32
        L31:
            r2 = 0
        L32:
            com.google.common.math.MathPreconditions.checkRoundingUnnecessary(r2)
            return r0
    }

    private static int sqrtFloor(int r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.sqrt(r0)
            int r2 = (int) r0
            return r2
    }
}
