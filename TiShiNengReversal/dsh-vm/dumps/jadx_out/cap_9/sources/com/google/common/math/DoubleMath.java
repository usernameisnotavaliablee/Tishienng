package com.google.common.math;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class DoubleMath {
    private static final double LN_2 = 0.0d;

    @com.google.common.annotations.VisibleForTesting
    static final int MAX_FACTORIAL = 170;
    private static final double MAX_INT_AS_DOUBLE = 2.147483647E9d;
    private static final double MAX_LONG_AS_DOUBLE_PLUS_ONE = 9.223372036854776E18d;
    private static final double MIN_INT_AS_DOUBLE = -2.147483648E9d;
    private static final double MIN_LONG_AS_DOUBLE = -9.223372036854776E18d;

    @com.google.common.annotations.VisibleForTesting
    static final double[] everySixteenthFactorial = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.math.DoubleMath$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode = null;

        static {
                java.math.RoundingMode[] r0 = java.math.RoundingMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.common.math.DoubleMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode = r0
                java.math.RoundingMode r1 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.common.math.DoubleMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L1d
                java.math.RoundingMode r1 = java.math.RoundingMode.FLOOR     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.common.math.DoubleMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L28
                java.math.RoundingMode r1 = java.math.RoundingMode.CEILING     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.common.math.DoubleMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L33
                java.math.RoundingMode r1 = java.math.RoundingMode.DOWN     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.common.math.DoubleMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L3e
                java.math.RoundingMode r1 = java.math.RoundingMode.UP     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.common.math.DoubleMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L49
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_EVEN     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.google.common.math.DoubleMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L54
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_UP     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = com.google.common.math.DoubleMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L60
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_DOWN     // Catch: java.lang.NoSuchFieldError -> L60
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
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.log(r0)
            com.google.common.math.DoubleMath.LN_2 = r0
            r0 = 11
            double[] r0 = new double[r0]
            r0 = {x0012: FILL_ARRAY_DATA , data: [4607182418800017408, 4806193436988276736, 5136732151201280932, 5521103744329526454, 5940217641568601162, 6385085645306309631, 6850928919021708103, 7334053451020625155, 7832293976156725733, 8343145384538501246, 8865720005091823326} // fill-array
            com.google.common.math.DoubleMath.everySixteenthFactorial = r0
            return
    }

    private DoubleMath() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.annotations.GwtIncompatible
    private static double checkFinite(double r1) {
            boolean r0 = com.google.common.math.DoubleUtils.isFinite(r1)
            com.google.common.base.Preconditions.checkArgument(r0)
            return r1
    }

    public static double factorial(int r5) {
            java.lang.String r0 = "n"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r5)
            r0 = 170(0xaa, float:2.38E-43)
            if (r5 <= r0) goto Lc
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            return r0
        Lc:
            r0 = r5 & (-16)
            int r0 = r0 + 1
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L12:
            if (r0 > r5) goto L1a
            double r3 = (double) r0
            double r1 = r1 * r3
            int r0 = r0 + 1
            goto L12
        L1a:
            double[] r0 = com.google.common.math.DoubleMath.everySixteenthFactorial
            int r5 = r5 >> 4
            r3 = r0[r5]
            double r1 = r1 * r3
            return r1
    }

    public static int fuzzyCompare(double r0, double r2, double r4) {
            boolean r4 = fuzzyEquals(r0, r2, r4)
            if (r4 == 0) goto L8
            r0 = 0
            return r0
        L8:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Le
            r0 = -1
            return r0
        Le:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L14
            r0 = 1
            return r0
        L14:
            boolean r0 = java.lang.Double.isNaN(r0)
            boolean r1 = java.lang.Double.isNaN(r2)
            int r0 = com.google.common.primitives.Booleans.compare(r0, r1)
            return r0
    }

    public static boolean fuzzyEquals(double r4, double r6, double r8) {
            java.lang.String r0 = "tolerance"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r8)
            double r0 = r4 - r6
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = java.lang.Math.copySign(r0, r2)
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 <= 0) goto L24
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L24
            boolean r4 = java.lang.Double.isNaN(r4)
            if (r4 == 0) goto L22
            boolean r4 = java.lang.Double.isNaN(r6)
            if (r4 == 0) goto L22
            goto L24
        L22:
            r4 = 0
            return r4
        L24:
            r4 = 1
            return r4
    }

    @com.google.common.annotations.GwtIncompatible
    public static boolean isMathematicalInteger(double r3) {
            boolean r0 = com.google.common.math.DoubleUtils.isFinite(r3)
            if (r0 == 0) goto L1e
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L1c
            long r0 = com.google.common.math.DoubleUtils.getSignificand(r3)
            int r0 = java.lang.Long.numberOfTrailingZeros(r0)
            int r0 = 52 - r0
            int r3 = java.lang.Math.getExponent(r3)
            if (r0 > r3) goto L1e
        L1c:
            r3 = 1
            return r3
        L1e:
            r3 = 0
            return r3
    }

    @com.google.common.annotations.GwtIncompatible
    public static boolean isPowerOfTwo(double r4) {
            r0 = 0
            r2 = 0
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 <= 0) goto L1e
            boolean r0 = com.google.common.math.DoubleUtils.isFinite(r4)
            if (r0 == 0) goto L1e
            long r4 = com.google.common.math.DoubleUtils.getSignificand(r4)
            r0 = 1
            long r0 = r4 - r0
            long r4 = r4 & r0
            r0 = 0
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 != 0) goto L1e
            r4 = 1
            return r4
        L1e:
            return r2
    }

    public static double log2(double r2) {
            double r2 = java.lang.Math.log(r2)
            double r0 = com.google.common.math.DoubleMath.LN_2
            double r2 = r2 / r0
            return r2
    }

    @com.google.common.annotations.GwtIncompatible
    public static int log2(double r6, java.math.RoundingMode r8) {
            r0 = 0
            r2 = 0
            r3 = 1
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 <= 0) goto L10
            boolean r0 = com.google.common.math.DoubleUtils.isFinite(r6)
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            java.lang.String r1 = "x must be positive and finite"
            com.google.common.base.Preconditions.checkArgument(r0, r1)
            int r0 = java.lang.Math.getExponent(r6)
            boolean r1 = com.google.common.math.DoubleUtils.isNormal(r6)
            if (r1 != 0) goto L2b
            r0 = 4841369599423283200(0x4330000000000000, double:4.503599627370496E15)
            double r6 = r6 * r0
            int r6 = log2(r6, r8)
            int r6 = r6 + (-52)
            return r6
        L2b:
            int[] r1 = com.google.common.math.DoubleMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode
            int r8 = r8.ordinal()
            r8 = r1[r8]
            switch(r8) {
                case 1: goto L63;
                case 2: goto L6a;
                case 3: goto L5c;
                case 4: goto L54;
                case 5: goto L4a;
                case 6: goto L3c;
                case 7: goto L3c;
                case 8: goto L3c;
                default: goto L36;
            }
        L36:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L3c:
            double r6 = com.google.common.math.DoubleUtils.scaleNormalize(r6)
            double r6 = r6 * r6
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 <= 0) goto L6a
            r2 = 1
            goto L6a
        L4a:
            if (r0 < 0) goto L4d
            r2 = 1
        L4d:
            boolean r6 = isPowerOfTwo(r6)
        L51:
            r6 = r6 ^ r3
            r2 = r2 & r6
            goto L6a
        L54:
            if (r0 >= 0) goto L57
            r2 = 1
        L57:
            boolean r6 = isPowerOfTwo(r6)
            goto L51
        L5c:
            boolean r6 = isPowerOfTwo(r6)
            r2 = r6 ^ 1
            goto L6a
        L63:
            boolean r6 = isPowerOfTwo(r6)
            com.google.common.math.MathPreconditions.checkRoundingUnnecessary(r6)
        L6a:
            if (r2 == 0) goto L6d
            int r0 = r0 + r3
        L6d:
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    @java.lang.Deprecated
    public static double mean(java.lang.Iterable<? extends java.lang.Number> r2) {
            java.util.Iterator r2 = r2.iterator()
            double r0 = mean(r2)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    @java.lang.Deprecated
    public static double mean(java.util.Iterator<? extends java.lang.Number> r10) {
            boolean r0 = r10.hasNext()
            java.lang.String r1 = "Cannot take mean of 0 values"
            com.google.common.base.Preconditions.checkArgument(r0, r1)
            java.lang.Object r0 = r10.next()
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            double r0 = checkFinite(r0)
            r2 = 1
            r4 = r2
        L1a:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L34
            java.lang.Object r6 = r10.next()
            java.lang.Number r6 = (java.lang.Number) r6
            double r6 = r6.doubleValue()
            double r6 = checkFinite(r6)
            long r4 = r4 + r2
            double r6 = r6 - r0
            double r8 = (double) r4
            double r6 = r6 / r8
            double r0 = r0 + r6
            goto L1a
        L34:
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    @java.lang.Deprecated
    public static double mean(double... r11) {
            int r0 = r11.length
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            java.lang.String r3 = "Cannot take mean of 0 values"
            com.google.common.base.Preconditions.checkArgument(r0, r3)
            r0 = r11[r1]
            double r0 = checkFinite(r0)
            r3 = 1
            r5 = r3
        L16:
            int r7 = r11.length
            if (r2 >= r7) goto L28
            r7 = r11[r2]
            checkFinite(r7)
            long r5 = r5 + r3
            r7 = r11[r2]
            double r7 = r7 - r0
            double r9 = (double) r5
            double r7 = r7 / r9
            double r0 = r0 + r7
            int r2 = r2 + 1
            goto L16
        L28:
            return r0
    }

    @java.lang.Deprecated
    public static double mean(int... r6) {
            int r0 = r6.length
            r1 = 0
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            java.lang.String r2 = "Cannot take mean of 0 values"
            com.google.common.base.Preconditions.checkArgument(r0, r2)
            r2 = 0
        Le:
            int r0 = r6.length
            if (r1 >= r0) goto L18
            r0 = r6[r1]
            long r4 = (long) r0
            long r2 = r2 + r4
            int r1 = r1 + 1
            goto Le
        L18:
            double r0 = (double) r2
            int r6 = r6.length
            double r2 = (double) r6
            double r0 = r0 / r2
            return r0
    }

    @java.lang.Deprecated
    public static double mean(long... r11) {
            int r0 = r11.length
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            java.lang.String r3 = "Cannot take mean of 0 values"
            com.google.common.base.Preconditions.checkArgument(r0, r3)
            r0 = r11[r1]
            double r0 = (double) r0
            r3 = 1
            r5 = r3
        L13:
            int r7 = r11.length
            if (r2 >= r7) goto L21
            long r5 = r5 + r3
            r7 = r11[r2]
            double r7 = (double) r7
            double r7 = r7 - r0
            double r9 = (double) r5
            double r7 = r7 / r9
            double r0 = r0 + r7
            int r2 = r2 + 1
            goto L13
        L21:
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    static double roundIntermediate(double r6, java.math.RoundingMode r8) {
            boolean r0 = com.google.common.math.DoubleUtils.isFinite(r6)
            if (r0 == 0) goto L80
            int[] r0 = com.google.common.math.DoubleMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode
            int r8 = r8.ordinal()
            r8 = r0[r8]
            r0 = 1
            r2 = 0
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            switch(r8) {
                case 1: goto L78;
                case 2: goto L69;
                case 3: goto L5a;
                case 4: goto L77;
                case 5: goto L47;
                case 6: goto L42;
                case 7: goto L2d;
                case 8: goto L1d;
                default: goto L17;
            }
        L17:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L1d:
            double r0 = java.lang.Math.rint(r6)
            double r2 = r6 - r0
            double r2 = java.lang.Math.abs(r2)
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto L2c
            goto L77
        L2c:
            return r0
        L2d:
            double r0 = java.lang.Math.rint(r6)
            double r2 = r6 - r0
            double r2 = java.lang.Math.abs(r2)
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto L41
            double r0 = java.lang.Math.copySign(r4, r6)
            double r6 = r6 + r0
            return r6
        L41:
            return r0
        L42:
            double r6 = java.lang.Math.rint(r6)
            return r6
        L47:
            boolean r8 = isMathematicalInteger(r6)
            if (r8 == 0) goto L4e
            goto L77
        L4e:
            long r0 = (long) r6
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 <= 0) goto L55
            r6 = 1
            goto L56
        L55:
            r6 = -1
        L56:
            long r6 = (long) r6
            long r0 = r0 + r6
            double r6 = (double) r0
            return r6
        L5a:
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 <= 0) goto L77
            boolean r8 = isMathematicalInteger(r6)
            if (r8 == 0) goto L65
            goto L77
        L65:
            long r6 = (long) r6
            long r6 = r6 + r0
            double r6 = (double) r6
            return r6
        L69:
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 >= 0) goto L77
            boolean r8 = isMathematicalInteger(r6)
            if (r8 == 0) goto L74
            goto L77
        L74:
            long r6 = (long) r6
            long r6 = r6 - r0
            double r6 = (double) r6
        L77:
            return r6
        L78:
            boolean r8 = isMathematicalInteger(r6)
            com.google.common.math.MathPreconditions.checkRoundingUnnecessary(r8)
            return r6
        L80:
            java.lang.ArithmeticException r6 = new java.lang.ArithmeticException
            java.lang.String r7 = "input is infinite or NaN"
            r6.<init>(r7)
            throw r6
    }

    @com.google.common.annotations.GwtIncompatible
    public static java.math.BigInteger roundToBigInteger(double r6, java.math.RoundingMode r8) {
            double r6 = roundIntermediate(r6, r8)
            r0 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            double r0 = r0 - r6
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r8 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            r1 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 >= 0) goto L19
            r8 = 1
        L19:
            r8 = r8 & r0
            if (r8 == 0) goto L22
            long r6 = (long) r6
            java.math.BigInteger r6 = java.math.BigInteger.valueOf(r6)
            return r6
        L22:
            int r8 = java.lang.Math.getExponent(r6)
            long r0 = com.google.common.math.DoubleUtils.getSignificand(r6)
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            int r8 = r8 + (-52)
            java.math.BigInteger r8 = r0.shiftLeft(r8)
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 >= 0) goto L3f
            java.math.BigInteger r6 = r8.negate()
            return r6
        L3f:
            return r8
    }

    @com.google.common.annotations.GwtIncompatible
    public static int roundToInt(double r8, java.math.RoundingMode r10) {
            double r0 = roundIntermediate(r8, r10)
            r2 = -4476578029604175872(0xc1e0000000200000, double:-2.147483649E9)
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L11
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            r6 = 4746794007248502784(0x41e0000000000000, double:2.147483648E9)
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 >= 0) goto L19
            r4 = 1
        L19:
            r2 = r2 & r4
            com.google.common.math.MathPreconditions.checkInRangeForRoundingInputs(r2, r8, r10)
            int r8 = (int) r0
            return r8
    }

    @com.google.common.annotations.GwtIncompatible
    public static long roundToLong(double r9, java.math.RoundingMode r11) {
            double r0 = roundIntermediate(r9, r11)
            r2 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            double r2 = r2 - r0
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r6 = 0
            r7 = 1
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 >= 0) goto L11
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            r3 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto L19
            r6 = 1
        L19:
            r2 = r2 & r6
            com.google.common.math.MathPreconditions.checkInRangeForRoundingInputs(r2, r9, r11)
            long r9 = (long) r0
            return r9
    }
}
