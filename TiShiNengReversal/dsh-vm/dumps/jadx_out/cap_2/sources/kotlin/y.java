package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class y extends kotlin.x {
    public y() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigInteger A(java.math.BigInteger r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.math.BigInteger r1 = r1.shiftRight(r2)
            java.lang.String r2 = "shiftRight(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.math.BigInteger B(java.math.BigInteger r1, java.math.BigInteger r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.math.BigInteger r1 = r1.multiply(r2)
            java.lang.String r2 = "multiply(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal C(java.math.BigInteger r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal D(java.math.BigInteger r1, int r2, java.math.MathContext r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "mathContext"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1, r2, r3)
            return r0
    }

    static /* synthetic */ java.math.BigDecimal E(java.math.BigInteger r0, int r1, java.math.MathContext r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto L10
            java.math.MathContext r2 = java.math.MathContext.UNLIMITED
            java.lang.String r3 = "UNLIMITED"
            kotlin.jvm.internal.g0.o(r2, r3)
        L10:
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r3)
            java.lang.String r3 = "mathContext"
            kotlin.jvm.internal.g0.p(r2, r3)
            java.math.BigDecimal r3 = new java.math.BigDecimal
            r3.<init>(r0, r1, r2)
            return r3
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigInteger F(int r2) {
            long r0 = (long) r2
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r0)
            java.lang.String r0 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigInteger G(long r0) {
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.math.BigInteger H(java.math.BigInteger r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.math.BigInteger r1 = r1.negate()
            java.lang.String r0 = "negate(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigInteger I(java.math.BigInteger r1, java.math.BigInteger r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.math.BigInteger r1 = r1.xor(r2)
            java.lang.String r2 = "xor(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigInteger q(java.math.BigInteger r1, java.math.BigInteger r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.math.BigInteger r1 = r1.and(r2)
            java.lang.String r2 = "and(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigInteger r(java.math.BigInteger r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.math.BigInteger r0 = java.math.BigInteger.ONE
            java.math.BigInteger r1 = r1.subtract(r0)
            java.lang.String r0 = "subtract(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.math.BigInteger s(java.math.BigInteger r1, java.math.BigInteger r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.math.BigInteger r1 = r1.divide(r2)
            java.lang.String r2 = "divide(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigInteger t(java.math.BigInteger r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.math.BigInteger r0 = java.math.BigInteger.ONE
            java.math.BigInteger r1 = r1.add(r0)
            java.lang.String r0 = "add(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigInteger u(java.math.BigInteger r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.math.BigInteger r1 = r1.not()
            java.lang.String r0 = "not(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.math.BigInteger v(java.math.BigInteger r1, java.math.BigInteger r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.math.BigInteger r1 = r1.subtract(r2)
            java.lang.String r2 = "subtract(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigInteger w(java.math.BigInteger r1, java.math.BigInteger r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.math.BigInteger r1 = r1.or(r2)
            java.lang.String r2 = "or(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.math.BigInteger x(java.math.BigInteger r1, java.math.BigInteger r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.math.BigInteger r1 = r1.add(r2)
            java.lang.String r2 = "add(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final java.math.BigInteger y(java.math.BigInteger r1, java.math.BigInteger r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.math.BigInteger r1 = r1.remainder(r2)
            java.lang.String r2 = "remainder(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigInteger z(java.math.BigInteger r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.math.BigInteger r1 = r1.shiftLeft(r2)
            java.lang.String r2 = "shiftLeft(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }
}
