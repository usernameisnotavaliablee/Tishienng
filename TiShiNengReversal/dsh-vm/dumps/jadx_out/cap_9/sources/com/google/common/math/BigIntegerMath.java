package com.google.common.math;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class BigIntegerMath {
    private static final double LN_10 = 0.0d;
    private static final double LN_2 = 0.0d;

    @com.google.common.annotations.VisibleForTesting
    static final java.math.BigInteger SQRT2_PRECOMPUTED_BITS = null;

    @com.google.common.annotations.VisibleForTesting
    static final int SQRT2_PRECOMPUTE_THRESHOLD = 256;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.math.BigIntegerMath$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode = null;

        static {
                java.math.RoundingMode[] r0 = java.math.RoundingMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode = r0
                java.math.RoundingMode r1 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L1d
                java.math.RoundingMode r1 = java.math.RoundingMode.DOWN     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L28
                java.math.RoundingMode r1 = java.math.RoundingMode.FLOOR     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L33
                java.math.RoundingMode r1 = java.math.RoundingMode.UP     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L3e
                java.math.RoundingMode r1 = java.math.RoundingMode.CEILING     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L49
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_DOWN     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L54
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_UP     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L60
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
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a"
            r2 = 16
            r0.<init>(r1, r2)
            com.google.common.math.BigIntegerMath.SQRT2_PRECOMPUTED_BITS = r0
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r0 = java.lang.Math.log(r0)
            com.google.common.math.BigIntegerMath.LN_10 = r0
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.log(r0)
            com.google.common.math.BigIntegerMath.LN_2 = r0
            return
    }

    private BigIntegerMath() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.math.BigInteger binomial(int r10, int r11) {
            java.lang.String r0 = "n"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r10)
            java.lang.String r0 = "k"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r11)
            r0 = 1
            if (r11 > r10) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            java.lang.String r2 = "k (%s) > n (%s)"
            com.google.common.base.Preconditions.checkArgument(r1, r2, r11, r10)
            int r1 = r10 >> 1
            if (r11 <= r1) goto L1b
            int r11 = r10 - r11
        L1b:
            int[] r1 = com.google.common.math.LongMath.biggestBinomials
            int r2 = r1.length
            if (r11 >= r2) goto L2d
            r1 = r1[r11]
            if (r10 > r1) goto L2d
            long r10 = com.google.common.math.LongMath.binomial(r10, r11)
            java.math.BigInteger r10 = java.math.BigInteger.valueOf(r10)
            return r10
        L2d:
            java.math.BigInteger r1 = java.math.BigInteger.ONE
            long r2 = (long) r10
            java.math.RoundingMode r4 = java.math.RoundingMode.CEILING
            int r4 = com.google.common.math.LongMath.log2(r2, r4)
            r5 = 1
        L38:
            r7 = r4
        L39:
            if (r0 >= r11) goto L5e
            int r8 = r10 - r0
            int r0 = r0 + 1
            int r7 = r7 + r4
            r9 = 63
            if (r7 < r9) goto L57
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r2)
            java.math.BigInteger r1 = r1.multiply(r2)
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r5)
            java.math.BigInteger r1 = r1.divide(r2)
            long r2 = (long) r8
            long r5 = (long) r0
            goto L38
        L57:
            long r8 = (long) r8
            long r2 = r2 * r8
            long r8 = (long) r0
            long r5 = r5 * r8
            goto L39
        L5e:
            java.math.BigInteger r10 = java.math.BigInteger.valueOf(r2)
            java.math.BigInteger r10 = r1.multiply(r10)
            java.math.BigInteger r11 = java.math.BigInteger.valueOf(r5)
            java.math.BigInteger r10 = r10.divide(r11)
            return r10
    }

    @com.google.common.annotations.Beta
    public static java.math.BigInteger ceilingPowerOfTwo(java.math.BigInteger r2) {
            java.math.BigInteger r0 = java.math.BigInteger.ZERO
            java.math.RoundingMode r1 = java.math.RoundingMode.CEILING
            int r2 = log2(r2, r1)
            java.math.BigInteger r2 = r0.setBit(r2)
            return r2
    }

    @com.google.common.annotations.GwtIncompatible
    public static java.math.BigInteger divide(java.math.BigInteger r1, java.math.BigInteger r2, java.math.RoundingMode r3) {
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1)
            java.math.BigDecimal r1 = new java.math.BigDecimal
            r1.<init>(r2)
            r2 = 0
            java.math.BigDecimal r1 = r0.divide(r1, r2, r3)
            java.math.BigInteger r1 = r1.toBigIntegerExact()
            return r1
    }

    public static java.math.BigInteger factorial(int r19) {
            r0 = r19
            java.lang.String r1 = "n"
            com.google.common.math.MathPreconditions.checkNonNegative(r1, r0)
            long[] r1 = com.google.common.math.LongMath.factorials
            int r2 = r1.length
            if (r0 >= r2) goto L13
            r0 = r1[r0]
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            return r0
        L13:
            java.math.RoundingMode r2 = java.math.RoundingMode.CEILING
            int r3 = com.google.common.math.IntMath.log2(r0, r2)
            int r3 = r3 * r0
            r4 = 64
            int r2 = com.google.common.math.IntMath.divide(r3, r4, r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            int r2 = r1.length
            int r5 = r2 + (-1)
            r5 = r1[r5]
            int r1 = java.lang.Long.numberOfTrailingZeros(r5)
            long r5 = r5 >> r1
            java.math.RoundingMode r7 = java.math.RoundingMode.FLOOR
            int r8 = com.google.common.math.LongMath.log2(r5, r7)
            r9 = 1
            int r8 = r8 + r9
            long r10 = (long) r2
            int r2 = com.google.common.math.LongMath.log2(r10, r7)
            int r7 = r2 + 1
            int r2 = r9 << r2
        L41:
            long r12 = (long) r0
            r14 = 1
            int r16 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r16 > 0) goto L73
            long r12 = (long) r2
            long r12 = r12 & r10
            r16 = 0
            int r18 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r18 == 0) goto L54
            int r2 = r2 << 1
            int r7 = r7 + 1
        L54:
            int r12 = java.lang.Long.numberOfTrailingZeros(r10)
            long r16 = r10 >> r12
            int r1 = r1 + r12
            int r12 = r7 - r12
            int r12 = r12 + r8
            if (r12 < r4) goto L68
            java.math.BigInteger r5 = java.math.BigInteger.valueOf(r5)
            r3.add(r5)
            r5 = r14
        L68:
            long r5 = r5 * r16
            java.math.RoundingMode r8 = java.math.RoundingMode.FLOOR
            int r8 = com.google.common.math.LongMath.log2(r5, r8)
            int r8 = r8 + r9
            long r10 = r10 + r14
            goto L41
        L73:
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 <= 0) goto L7e
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r5)
            r3.add(r0)
        L7e:
            java.math.BigInteger r0 = listProduct(r3)
            java.math.BigInteger r0 = r0.shiftLeft(r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    static boolean fitsInLong(java.math.BigInteger r1) {
            int r1 = r1.bitLength()
            r0 = 63
            if (r1 > r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    @com.google.common.annotations.Beta
    public static java.math.BigInteger floorPowerOfTwo(java.math.BigInteger r2) {
            java.math.BigInteger r0 = java.math.BigInteger.ZERO
            java.math.RoundingMode r1 = java.math.RoundingMode.FLOOR
            int r2 = log2(r2, r1)
            java.math.BigInteger r2 = r0.setBit(r2)
            return r2
    }

    public static boolean isPowerOfTwo(java.math.BigInteger r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r0 = r2.signum()
            if (r0 <= 0) goto L16
            int r0 = r2.getLowestSetBit()
            int r2 = r2.bitLength()
            r1 = 1
            int r2 = r2 - r1
            if (r0 != r2) goto L16
            return r1
        L16:
            r2 = 0
            return r2
    }

    static java.math.BigInteger listProduct(java.util.List<java.math.BigInteger> r2) {
            r0 = 0
            int r1 = r2.size()
            java.math.BigInteger r2 = listProduct(r2, r0, r1)
            return r2
    }

    static java.math.BigInteger listProduct(java.util.List<java.math.BigInteger> r4, int r5, int r6) {
            int r0 = r6 - r5
            if (r0 == 0) goto L54
            r1 = 1
            if (r0 == r1) goto L4d
            r2 = 2
            if (r0 == r2) goto L3b
            r3 = 3
            if (r0 == r3) goto L1d
            int r0 = r6 + r5
            int r0 = r0 >>> r1
            java.math.BigInteger r5 = listProduct(r4, r5, r0)
            java.math.BigInteger r4 = listProduct(r4, r0, r6)
            java.math.BigInteger r4 = r5.multiply(r4)
            return r4
        L1d:
            java.lang.Object r6 = r4.get(r5)
            java.math.BigInteger r6 = (java.math.BigInteger) r6
            int r0 = r5 + 1
            java.lang.Object r0 = r4.get(r0)
            java.math.BigInteger r0 = (java.math.BigInteger) r0
            java.math.BigInteger r6 = r6.multiply(r0)
            int r5 = r5 + r2
            java.lang.Object r4 = r4.get(r5)
            java.math.BigInteger r4 = (java.math.BigInteger) r4
            java.math.BigInteger r4 = r6.multiply(r4)
            return r4
        L3b:
            java.lang.Object r6 = r4.get(r5)
            java.math.BigInteger r6 = (java.math.BigInteger) r6
            int r5 = r5 + r1
            java.lang.Object r4 = r4.get(r5)
            java.math.BigInteger r4 = (java.math.BigInteger) r4
            java.math.BigInteger r4 = r6.multiply(r4)
            return r4
        L4d:
            java.lang.Object r4 = r4.get(r5)
            java.math.BigInteger r4 = (java.math.BigInteger) r4
            return r4
        L54:
            java.math.BigInteger r4 = java.math.BigInteger.ONE
            return r4
    }

    @com.google.common.annotations.GwtIncompatible
    public static int log10(java.math.BigInteger r6, java.math.RoundingMode r7) {
            java.lang.String r0 = "x"
            com.google.common.math.MathPreconditions.checkPositive(r0, r6)
            boolean r0 = fitsInLong(r6)
            if (r0 == 0) goto L14
            long r0 = r6.longValue()
            int r6 = com.google.common.math.LongMath.log10(r0, r7)
            return r6
        L14:
            java.math.RoundingMode r0 = java.math.RoundingMode.FLOOR
            int r0 = log2(r6, r0)
            double r0 = (double) r0
            double r2 = com.google.common.math.BigIntegerMath.LN_2
            double r0 = r0 * r2
            double r2 = com.google.common.math.BigIntegerMath.LN_10
            double r0 = r0 / r2
            int r0 = (int) r0
            java.math.BigInteger r1 = java.math.BigInteger.TEN
            java.math.BigInteger r2 = r1.pow(r0)
            int r3 = r2.compareTo(r6)
            if (r3 <= 0) goto L3e
        L2f:
            int r0 = r0 + (-1)
            java.math.BigInteger r1 = java.math.BigInteger.TEN
            java.math.BigInteger r2 = r2.divide(r1)
            int r1 = r2.compareTo(r6)
            if (r1 > 0) goto L2f
            goto L5c
        L3e:
            java.math.BigInteger r1 = r1.multiply(r2)
            int r4 = r1.compareTo(r6)
        L46:
            r5 = r4
            r4 = r3
            r3 = r5
            if (r3 > 0) goto L5b
            int r0 = r0 + 1
            java.math.BigInteger r2 = java.math.BigInteger.TEN
            java.math.BigInteger r2 = r2.multiply(r1)
            int r4 = r2.compareTo(r6)
            r5 = r2
            r2 = r1
            r1 = r5
            goto L46
        L5b:
            r1 = r4
        L5c:
            int[] r3 = com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode
            int r7 = r7.ordinal()
            r7 = r3[r7]
            r3 = 1
            switch(r7) {
                case 1: goto L8f;
                case 2: goto L8e;
                case 3: goto L8e;
                case 4: goto L86;
                case 5: goto L86;
                case 6: goto L6e;
                case 7: goto L6e;
                case 8: goto L6e;
                default: goto L68;
            }
        L68:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L6e:
            r7 = 2
            java.math.BigInteger r6 = r6.pow(r7)
            java.math.BigInteger r7 = r2.pow(r7)
            java.math.BigInteger r1 = java.math.BigInteger.TEN
            java.math.BigInteger r7 = r7.multiply(r1)
            int r6 = r6.compareTo(r7)
            if (r6 > 0) goto L84
            goto L8e
        L84:
            int r0 = r0 + r3
            return r0
        L86:
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L8d
            goto L8e
        L8d:
            int r0 = r0 + r3
        L8e:
            return r0
        L8f:
            if (r1 != 0) goto L92
            goto L93
        L92:
            r3 = 0
        L93:
            com.google.common.math.MathPreconditions.checkRoundingUnnecessary(r3)
            return r0
    }

    public static int log2(java.math.BigInteger r3, java.math.RoundingMode r4) {
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r3)
            java.math.BigInteger r0 = (java.math.BigInteger) r0
            java.lang.String r1 = "x"
            com.google.common.math.MathPreconditions.checkPositive(r1, r0)
            int r0 = r3.bitLength()
            int r1 = r0 + (-1)
            int[] r2 = com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode
            int r4 = r4.ordinal()
            r4 = r2[r4]
            switch(r4) {
                case 1: goto L52;
                case 2: goto L51;
                case 3: goto L51;
                case 4: goto L49;
                case 5: goto L49;
                case 6: goto L22;
                case 7: goto L22;
                case 8: goto L22;
                default: goto L1c;
            }
        L1c:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L22:
            r4 = 256(0x100, float:3.59E-43)
            if (r1 >= r4) goto L36
            java.math.BigInteger r4 = com.google.common.math.BigIntegerMath.SQRT2_PRECOMPUTED_BITS
            int r2 = 256 - r1
            java.math.BigInteger r4 = r4.shiftRight(r2)
            int r3 = r3.compareTo(r4)
            if (r3 > 0) goto L35
            goto L51
        L35:
            return r0
        L36:
            r4 = 2
            java.math.BigInteger r3 = r3.pow(r4)
            int r3 = r3.bitLength()
            int r3 = r3 + (-1)
            int r4 = r1 * 2
            int r4 = r4 + 1
            if (r3 >= r4) goto L48
            goto L51
        L48:
            return r0
        L49:
            boolean r3 = isPowerOfTwo(r3)
            if (r3 == 0) goto L50
            goto L51
        L50:
            return r0
        L51:
            return r1
        L52:
            boolean r3 = isPowerOfTwo(r3)
            com.google.common.math.MathPreconditions.checkRoundingUnnecessary(r3)
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    public static java.math.BigInteger sqrt(java.math.BigInteger r3, java.math.RoundingMode r4) {
            java.lang.String r0 = "x"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r3)
            boolean r0 = fitsInLong(r3)
            if (r0 == 0) goto L18
            long r0 = r3.longValue()
            long r3 = com.google.common.math.LongMath.sqrt(r0, r4)
            java.math.BigInteger r3 = java.math.BigInteger.valueOf(r3)
            return r3
        L18:
            java.math.BigInteger r0 = sqrtFloor(r3)
            int[] r1 = com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode
            int r4 = r4.ordinal()
            r4 = r1[r4]
            r1 = 2
            switch(r4) {
                case 1: goto L63;
                case 2: goto L62;
                case 3: goto L62;
                case 4: goto L44;
                case 5: goto L44;
                case 6: goto L2e;
                case 7: goto L2e;
                case 8: goto L2e;
                default: goto L28;
            }
        L28:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L2e:
            java.math.BigInteger r4 = r0.pow(r1)
            java.math.BigInteger r4 = r4.add(r0)
            int r3 = r4.compareTo(r3)
            if (r3 < 0) goto L3d
            return r0
        L3d:
            java.math.BigInteger r3 = java.math.BigInteger.ONE
            java.math.BigInteger r3 = r0.add(r3)
            return r3
        L44:
            int r4 = r0.intValue()
            int r4 = r4 * r4
            int r2 = r3.intValue()
            if (r4 != r2) goto L5b
            java.math.BigInteger r4 = r0.pow(r1)
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L5b
            return r0
        L5b:
            java.math.BigInteger r3 = java.math.BigInteger.ONE
            java.math.BigInteger r3 = r0.add(r3)
            return r3
        L62:
            return r0
        L63:
            java.math.BigInteger r4 = r0.pow(r1)
            boolean r3 = r4.equals(r3)
            com.google.common.math.MathPreconditions.checkRoundingUnnecessary(r3)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    private static java.math.BigInteger sqrtApproxWithDoubles(java.math.BigInteger r2) {
            double r0 = com.google.common.math.DoubleUtils.bigToDouble(r2)
            double r0 = java.lang.Math.sqrt(r0)
            java.math.RoundingMode r2 = java.math.RoundingMode.HALF_EVEN
            java.math.BigInteger r2 = com.google.common.math.DoubleMath.roundToBigInteger(r0, r2)
            return r2
    }

    @com.google.common.annotations.GwtIncompatible
    private static java.math.BigInteger sqrtFloor(java.math.BigInteger r4) {
            java.math.RoundingMode r0 = java.math.RoundingMode.FLOOR
            int r0 = log2(r4, r0)
            r1 = 1023(0x3ff, float:1.434E-42)
            r2 = 1
            if (r0 >= r1) goto L10
            java.math.BigInteger r0 = sqrtApproxWithDoubles(r4)
            goto L21
        L10:
            int r0 = r0 + (-52)
            r0 = r0 & (-2)
            java.math.BigInteger r1 = r4.shiftRight(r0)
            java.math.BigInteger r1 = sqrtApproxWithDoubles(r1)
            int r0 = r0 >> r2
            java.math.BigInteger r0 = r1.shiftLeft(r0)
        L21:
            java.math.BigInteger r1 = r4.divide(r0)
            java.math.BigInteger r1 = r0.add(r1)
            java.math.BigInteger r1 = r1.shiftRight(r2)
            boolean r3 = r0.equals(r1)
            if (r3 == 0) goto L34
            return r0
        L34:
            java.math.BigInteger r0 = r4.divide(r1)
            java.math.BigInteger r0 = r1.add(r0)
            java.math.BigInteger r0 = r0.shiftRight(r2)
            int r3 = r0.compareTo(r1)
            if (r3 < 0) goto L47
            return r1
        L47:
            r1 = r0
            goto L34
    }
}
