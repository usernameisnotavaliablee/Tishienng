package com.google.common.math;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class DoubleUtils {
    static final int EXPONENT_BIAS = 1023;
    static final long EXPONENT_MASK = 9218868437227405312L;
    static final long IMPLICIT_BIT = 4503599627370496L;

    @com.google.common.annotations.VisibleForTesting
    static final long ONE_BITS = 4607182418800017408L;
    static final int SIGNIFICAND_BITS = 52;
    static final long SIGNIFICAND_MASK = 4503599627370495L;
    static final long SIGN_MASK = Long.MIN_VALUE;

    private DoubleUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static double bigToDouble(java.math.BigInteger r14) {
            java.math.BigInteger r0 = r14.abs()
            int r1 = r0.bitLength()
            int r2 = r1 + (-1)
            r3 = 63
            if (r2 >= r3) goto L14
            long r0 = r14.longValue()
            double r0 = (double) r0
            return r0
        L14:
            r3 = 1023(0x3ff, float:1.434E-42)
            if (r2 <= r3) goto L22
            int r14 = r14.signum()
            double r0 = (double) r14
            r2 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            double r0 = r0 * r2
            return r0
        L22:
            int r2 = r1 + (-54)
            java.math.BigInteger r3 = r0.shiftRight(r2)
            long r3 = r3.longValue()
            r5 = 1
            long r5 = r3 >> r5
            r7 = 4503599627370495(0xfffffffffffff, double:2.225073858507201E-308)
            long r7 = r7 & r5
            r9 = 1
            long r3 = r3 & r9
            r11 = 0
            int r13 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r13 == 0) goto L4b
            long r3 = r5 & r9
            int r5 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r5 != 0) goto L4a
            int r0 = r0.getLowestSetBit()
            if (r0 >= r2) goto L4b
        L4a:
            long r7 = r7 + r9
        L4b:
            int r1 = r1 + 1022
            long r0 = (long) r1
            r2 = 52
            long r0 = r0 << r2
            long r0 = r0 + r7
            int r14 = r14.signum()
            long r2 = (long) r14
            r4 = -9223372036854775808
            long r2 = r2 & r4
            long r0 = r0 | r2
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    static double ensureNonNegative(double r3) {
            boolean r0 = java.lang.Double.isNaN(r3)
            r0 = r0 ^ 1
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L10
            return r3
        L10:
            return r0
    }

    static long getSignificand(double r3) {
            boolean r0 = isFinite(r3)
            java.lang.String r1 = "not a normal value"
            com.google.common.base.Preconditions.checkArgument(r0, r1)
            int r0 = java.lang.Math.getExponent(r3)
            long r3 = java.lang.Double.doubleToRawLongBits(r3)
            r1 = 4503599627370495(0xfffffffffffff, double:2.225073858507201E-308)
            long r3 = r3 & r1
            r1 = -1023(0xfffffffffffffc01, float:NaN)
            if (r0 != r1) goto L1e
            r0 = 1
            long r3 = r3 << r0
            return r3
        L1e:
            r0 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            long r3 = r3 | r0
            return r3
    }

    static boolean isFinite(double r0) {
            int r0 = java.lang.Math.getExponent(r0)
            r1 = 1023(0x3ff, float:1.434E-42)
            if (r0 > r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    static boolean isNormal(double r0) {
            int r0 = java.lang.Math.getExponent(r0)
            r1 = -1022(0xfffffffffffffc02, float:NaN)
            if (r0 < r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    static double nextDown(double r0) {
            double r0 = -r0
            double r0 = java.lang.Math.nextUp(r0)
            double r0 = -r0
            return r0
    }

    static double scaleNormalize(double r2) {
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            r0 = 4503599627370495(0xfffffffffffff, double:2.225073858507201E-308)
            long r2 = r2 & r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r2 = r2 | r0
            double r2 = java.lang.Double.longBitsToDouble(r2)
            return r2
    }
}
