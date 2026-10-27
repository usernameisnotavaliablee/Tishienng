package com.google.common.math;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.errorprone.annotations.CanIgnoreReturnValue
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class MathPreconditions {
    private MathPreconditions() {
            r0 = this;
            r0.<init>()
            return
    }

    static void checkInRangeForRoundingInputs(boolean r2, double r3, java.math.RoundingMode r5) {
            if (r2 == 0) goto L3
            return
        L3:
            java.lang.ArithmeticException r2 = new java.lang.ArithmeticException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "rounded value is out of range for input "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " and rounding mode "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    static void checkNoOverflow(boolean r2, java.lang.String r3, int r4, int r5) {
            if (r2 == 0) goto L3
            return
        L3:
            java.lang.ArithmeticException r2 = new java.lang.ArithmeticException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "overflow: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "("
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = ", "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    static void checkNoOverflow(boolean r2, java.lang.String r3, long r4, long r6) {
            if (r2 == 0) goto L3
            return
        L3:
            java.lang.ArithmeticException r2 = new java.lang.ArithmeticException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "overflow: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "("
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = ", "
            r0.append(r3)
            r0.append(r6)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    static double checkNonNegative(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r3, double r4) {
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L7
            return r4
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " ("
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = ") must be >= 0"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    static int checkNonNegative(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r2, int r3) {
            if (r3 < 0) goto L3
            return r3
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = " ("
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = ") must be >= 0"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    static long checkNonNegative(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r3, long r4) {
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L7
            return r4
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " ("
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = ") must be >= 0"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    static java.math.BigInteger checkNonNegative(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r2, java.math.BigInteger r3) {
            int r0 = r3.signum()
            if (r0 < 0) goto L7
            return r3
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = " ("
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = ") must be >= 0"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    static int checkPositive(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r2, int r3) {
            if (r3 <= 0) goto L3
            return r3
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = " ("
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = ") must be > 0"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    static long checkPositive(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r3, long r4) {
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L7
            return r4
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " ("
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = ") must be > 0"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    static java.math.BigInteger checkPositive(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r2, java.math.BigInteger r3) {
            int r0 = r3.signum()
            if (r0 <= 0) goto L7
            return r3
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = " ("
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = ") must be > 0"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    static void checkRoundingUnnecessary(boolean r1) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r0 = "mode was UNNECESSARY, but rounding was necessary"
            r1.<init>(r0)
            throw r1
    }
}
