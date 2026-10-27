package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class x {
    public x() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal a(java.math.BigDecimal r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.math.BigDecimal r0 = java.math.BigDecimal.ONE
            java.math.BigDecimal r1 = r1.subtract(r0)
            java.lang.String r0 = "subtract(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal b(java.math.BigDecimal r1, java.math.BigDecimal r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.math.RoundingMode r0 = java.math.RoundingMode.HALF_EVEN
            java.math.BigDecimal r1 = r1.divide(r2, r0)
            java.lang.String r2 = "divide(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal c(java.math.BigDecimal r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.math.BigDecimal r0 = java.math.BigDecimal.ONE
            java.math.BigDecimal r1 = r1.add(r0)
            java.lang.String r0 = "add(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal d(java.math.BigDecimal r1, java.math.BigDecimal r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.math.BigDecimal r1 = r1.subtract(r2)
            java.lang.String r2 = "subtract(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal e(java.math.BigDecimal r1, java.math.BigDecimal r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.math.BigDecimal r1 = r1.add(r2)
            java.lang.String r2 = "add(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal f(java.math.BigDecimal r1, java.math.BigDecimal r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.math.BigDecimal r1 = r1.remainder(r2)
            java.lang.String r2 = "remainder(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal g(java.math.BigDecimal r1, java.math.BigDecimal r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.math.BigDecimal r1 = r1.multiply(r2)
            java.lang.String r2 = "multiply(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal h(double r1) {
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal i(double r1, java.math.MathContext r3) {
            java.lang.String r0 = "mathContext"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1, r3)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal j(float r1) {
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal k(float r1, java.math.MathContext r2) {
            java.lang.String r0 = "mathContext"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal l(int r2) {
            long r0 = (long) r2
            java.math.BigDecimal r2 = java.math.BigDecimal.valueOf(r0)
            java.lang.String r0 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal m(int r1, java.math.MathContext r2) {
            java.lang.String r0 = "mathContext"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal n(long r0) {
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal o(long r1, java.math.MathContext r3) {
            java.lang.String r0 = "mathContext"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1, r3)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal p(java.math.BigDecimal r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.math.BigDecimal r1 = r1.negate()
            java.lang.String r0 = "negate(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }
}
