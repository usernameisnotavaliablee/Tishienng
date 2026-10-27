package kotlin.math;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class d extends kotlin.math.c {
    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double A(double r0) {
            double r0 = java.lang.Math.cos(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double A0(double r0, double r2) {
            double r0 = java.lang.Math.nextAfter(r0, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float B(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.cos(r0)
            float r2 = (float) r0
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float B0(float r2, float r3) {
            double r0 = (double) r3
            float r2 = java.lang.Math.nextAfter(r2, r0)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double C(double r0) {
            double r0 = java.lang.Math.cosh(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double C0(double r0) {
            double r0 = java.lang.Math.nextUp(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float D(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.cosh(r0)
            float r2 = (float) r0
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float D0(float r0) {
            float r0 = java.lang.Math.nextUp(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double E(double r0) {
            double r0 = java.lang.Math.exp(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double E0(double r0, double r2) {
            double r0 = java.lang.Math.pow(r0, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float F(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.exp(r0)
            float r2 = (float) r0
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double F0(double r2, int r4) {
            double r0 = (double) r4
            double r2 = java.lang.Math.pow(r2, r0)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double G(double r0) {
            double r0 = java.lang.Math.expm1(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float G0(float r2, float r3) {
            double r0 = (double) r2
            double r2 = (double) r3
            double r2 = java.lang.Math.pow(r0, r2)
            float r2 = (float) r2
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float H(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.expm1(r0)
            float r2 = (float) r0
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float H0(float r2, int r3) {
            double r0 = (double) r2
            double r2 = (double) r3
            double r2 = java.lang.Math.pow(r0, r2)
            float r2 = (float) r2
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double I(double r0) {
            double r0 = java.lang.Math.floor(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double I0(double r0) {
            double r0 = java.lang.Math.rint(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float J(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.floor(r0)
            float r2 = (float) r0
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float J0(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.rint(r0)
            float r2 = (float) r0
            return r2
    }

    private static final double K(double r0) {
            double r0 = java.lang.Math.abs(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    public static int K0(double r3) {
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 != 0) goto L22
            r0 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L13
            r3 = 2147483647(0x7fffffff, float:NaN)
            return r3
        L13:
            r0 = -4476578029606273024(0xc1e0000000000000, double:-2.147483648E9)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L1c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            return r3
        L1c:
            long r3 = java.lang.Math.round(r3)
            int r4 = (int) r3
            return r4
        L22:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Cannot round NaN value."
            r3.<init>(r4)
            throw r3
    }

    private static final float L(float r0) {
            float r0 = java.lang.Math.abs(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    public static final int L0(float r1) {
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto Lb
            int r1 = java.lang.Math.round(r1)
            return r1
        Lb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot round NaN value."
            r1.<init>(r0)
            throw r1
    }

    private static final int M(int r0) {
            int r0 = java.lang.Math.abs(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    public static long M0(double r1) {
            boolean r0 = java.lang.Double.isNaN(r1)
            if (r0 != 0) goto Lb
            long r1 = java.lang.Math.round(r1)
            return r1
        Lb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Cannot round NaN value."
            r1.<init>(r2)
            throw r1
    }

    private static final long N(long r0) {
            long r0 = java.lang.Math.abs(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    public static final long N0(float r2) {
            double r0 = (double) r2
            long r0 = M0(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    public static /* synthetic */ void O(double r0) {
            return
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double O0(double r0) {
            double r0 = java.lang.Math.signum(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    public static /* synthetic */ void P(float r0) {
            return
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float P0(float r0) {
            float r0 = java.lang.Math.signum(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    public static /* synthetic */ void Q(int r0) {
            return
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double Q0(double r0) {
            double r0 = java.lang.Math.sin(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    public static /* synthetic */ void R(long r0) {
            return
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float R0(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.sin(r0)
            float r2 = (float) r0
            return r2
    }

    private static final double S(double r0) {
            double r0 = java.lang.Math.signum(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double S0(double r0) {
            double r0 = java.lang.Math.sinh(r0)
            return r0
    }

    private static final float T(float r0) {
            float r0 = java.lang.Math.signum(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float T0(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.sinh(r0)
            float r2 = (float) r0
            return r2
    }

    public static int U(int r0) {
            int r0 = java.lang.Integer.signum(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double U0(double r0) {
            double r0 = java.lang.Math.sqrt(r0)
            return r0
    }

    public static int V(long r0) {
            int r0 = java.lang.Long.signum(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float V0(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.sqrt(r0)
            float r2 = (float) r0
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    public static /* synthetic */ void W(double r0) {
            return
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double W0(double r0) {
            double r0 = java.lang.Math.tan(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    public static /* synthetic */ void X(float r0) {
            return
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float X0(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.tan(r0)
            float r2 = (float) r0
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    public static /* synthetic */ void Y(int r0) {
            return
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double Y0(double r0) {
            double r0 = java.lang.Math.tanh(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    public static /* synthetic */ void Z(long r0) {
            return
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float Z0(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.tanh(r0)
            float r2 = (float) r0
            return r2
    }

    private static final double a0(double r0) {
            double r0 = java.lang.Math.ulp(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    public static final double a1(double r3) {
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 != 0) goto L1c
            boolean r0 = java.lang.Double.isInfinite(r3)
            if (r0 == 0) goto Ld
            goto L1c
        Ld:
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L18
            double r3 = java.lang.Math.floor(r3)
            return r3
        L18:
            double r3 = java.lang.Math.ceil(r3)
        L1c:
            return r3
    }

    private static final float b0(float r0) {
            float r0 = java.lang.Math.ulp(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    public static final float b1(float r2) {
            boolean r0 = java.lang.Float.isNaN(r2)
            if (r0 != 0) goto L1f
            boolean r0 = java.lang.Float.isInfinite(r2)
            if (r0 == 0) goto Ld
            goto L1f
        Ld:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L19
            double r0 = (double) r2
            double r0 = java.lang.Math.floor(r0)
        L17:
            float r2 = (float) r0
            return r2
        L19:
            double r0 = (double) r2
            double r0 = java.lang.Math.ceil(r0)
            goto L17
        L1f:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double c(double r0, double r2) {
            double r0 = java.lang.Math.IEEEremainder(r0, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    public static /* synthetic */ void c0(double r0) {
            return
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double c1(double r0, double r2) {
            double r0 = java.lang.Math.copySign(r0, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float d(float r2, float r3) {
            double r0 = (double) r2
            double r2 = (double) r3
            double r2 = java.lang.Math.IEEEremainder(r0, r2)
            float r2 = (float) r2
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    public static /* synthetic */ void d0(float r0) {
            return
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double d1(double r2, int r4) {
            double r0 = (double) r4
            double r2 = java.lang.Math.copySign(r2, r0)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double e(double r0) {
            double r0 = java.lang.Math.abs(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double e0(double r0, double r2) {
            double r0 = java.lang.Math.hypot(r0, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float e1(float r0, float r1) {
            float r0 = java.lang.Math.copySign(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float f(float r0) {
            float r0 = java.lang.Math.abs(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float f0(float r2, float r3) {
            double r0 = (double) r2
            double r2 = (double) r3
            double r2 = java.lang.Math.hypot(r0, r2)
            float r2 = (float) r2
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float f1(float r0, int r1) {
            float r1 = (float) r1
            float r0 = java.lang.Math.copySign(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final int g(int r0) {
            int r0 = java.lang.Math.abs(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double g0(double r0) {
            double r0 = java.lang.Math.log(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final long h(long r0) {
            long r0 = java.lang.Math.abs(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float h0(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.log(r0)
            float r2 = (float) r0
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double i(double r0) {
            double r0 = java.lang.Math.acos(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double i0(double r0) {
            double r0 = java.lang.Math.log1p(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float j(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.acos(r0)
            float r2 = (float) r0
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float j0(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.log1p(r0)
            float r2 = (float) r0
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    public static final double k(double r7) {
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L9
            r7 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r7
        L9:
            double r0 = kotlin.math.a.f
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L17
            double r7 = java.lang.Math.log(r7)
            double r0 = kotlin.math.a.b
            double r7 = r7 + r0
            return r7
        L17:
            r0 = 1
            double r0 = (double) r0
            double r2 = r7 - r0
            double r4 = kotlin.math.a.e
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L2e
            double r2 = r7 * r7
            double r2 = r2 - r0
            double r0 = java.lang.Math.sqrt(r2)
            double r7 = r7 + r0
            double r7 = java.lang.Math.log(r7)
            return r7
        L2e:
            double r7 = java.lang.Math.sqrt(r2)
            double r0 = kotlin.math.a.d
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 < 0) goto L41
            double r0 = r7 * r7
            double r0 = r0 * r7
            r2 = 12
            double r2 = (double) r2
            double r0 = r0 / r2
            double r7 = r7 - r0
        L41:
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.sqrt(r0)
            double r0 = r0 * r7
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    public static final double k0(double r3, double r5) {
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L17
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto Ld
            goto L17
        Ld:
            double r3 = java.lang.Math.log(r3)
            double r5 = java.lang.Math.log(r5)
            double r3 = r3 / r5
            return r3
        L17:
            r3 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r3
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float l(float r2) {
            double r0 = (double) r2
            double r0 = k(r0)
            float r2 = (float) r0
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    public static final float l0(float r2, float r3) {
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L19
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto Lc
            goto L19
        Lc:
            double r0 = (double) r2
            double r0 = java.lang.Math.log(r0)
            double r2 = (double) r3
            double r2 = java.lang.Math.log(r2)
            double r0 = r0 / r2
            float r2 = (float) r0
            return r2
        L19:
            r2 = 2143289344(0x7fc00000, float:NaN)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double m(double r0) {
            double r0 = java.lang.Math.asin(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double m0(double r0) {
            double r0 = java.lang.Math.log10(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float n(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.asin(r0)
            float r2 = (float) r0
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float n0(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.log10(r0)
            float r2 = (float) r0
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    public static final double o(double r5) {
            double r0 = kotlin.math.a.e
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L35
            double r0 = kotlin.math.a.g
            r2 = 1
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 <= 0) goto L27
            double r0 = kotlin.math.a.f
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 <= 0) goto L1b
            double r5 = java.lang.Math.log(r5)
            double r0 = kotlin.math.a.b
            double r5 = r5 + r0
            return r5
        L1b:
            r0 = 2
            double r0 = (double) r0
            double r5 = r5 * r0
            double r0 = (double) r2
            double r0 = r0 / r5
            double r5 = r5 + r0
            double r5 = java.lang.Math.log(r5)
            return r5
        L27:
            double r0 = r5 * r5
            double r2 = (double) r2
            double r0 = r0 + r2
            double r0 = java.lang.Math.sqrt(r0)
            double r5 = r5 + r0
            double r5 = java.lang.Math.log(r5)
            return r5
        L35:
            double r0 = -r0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto L41
            double r5 = -r5
            double r5 = o(r5)
            double r5 = -r5
            return r5
        L41:
            double r0 = java.lang.Math.abs(r5)
            double r2 = kotlin.math.a.d
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L53
            double r0 = r5 * r5
            double r0 = r0 * r5
            r2 = 6
            double r2 = (double) r2
            double r0 = r0 / r2
            double r5 = r5 - r0
        L53:
            return r5
    }

    @kotlin.SinceKotlin(version = "1.2")
    public static final double o0(double r2) {
            double r2 = java.lang.Math.log(r2)
            double r0 = kotlin.math.a.b
            double r2 = r2 / r0
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float p(float r2) {
            double r0 = (double) r2
            double r0 = o(r0)
            float r2 = (float) r0
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    public static final float p0(float r4) {
            double r0 = (double) r4
            double r0 = java.lang.Math.log(r0)
            double r2 = kotlin.math.a.b
            double r0 = r0 / r2
            float r4 = (float) r0
            return r4
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double q(double r0) {
            double r0 = java.lang.Math.atan(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double q0(double r0, double r2) {
            double r0 = java.lang.Math.max(r0, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float r(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.atan(r0)
            float r2 = (float) r0
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float r0(float r0, float r1) {
            float r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double s(double r0, double r2) {
            double r0 = java.lang.Math.atan2(r0, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final int s0(int r0, int r1) {
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float t(float r2, float r3) {
            double r0 = (double) r2
            double r2 = (double) r3
            double r2 = java.lang.Math.atan2(r0, r2)
            float r2 = (float) r2
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final long t0(long r0, long r2) {
            long r0 = java.lang.Math.max(r0, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    public static final double u(double r5) {
            double r0 = java.lang.Math.abs(r5)
            double r2 = kotlin.math.a.e
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L1d
            double r0 = java.lang.Math.abs(r5)
            double r2 = kotlin.math.a.d
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1c
            double r0 = r5 * r5
            double r0 = r0 * r5
            r2 = 3
            double r2 = (double) r2
            double r0 = r0 / r2
            double r5 = r5 + r0
        L1c:
            return r5
        L1d:
            r0 = 1
            double r0 = (double) r0
            double r2 = r0 + r5
            double r0 = r0 - r5
            double r2 = r2 / r0
            double r5 = java.lang.Math.log(r2)
            r0 = 2
            double r0 = (double) r0
            double r5 = r5 / r0
            return r5
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double u0(double r0, double r2) {
            double r0 = java.lang.Math.min(r0, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float v(float r2) {
            double r0 = (double) r2
            double r0 = u(r0)
            float r2 = (float) r0
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float v0(float r0, float r1) {
            float r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.8")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    private static final double w(double r0) {
            double r0 = java.lang.Math.cbrt(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final int w0(int r0, int r1) {
            int r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.8")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    private static final float x(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.cbrt(r0)
            float r2 = (float) r0
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final long x0(long r0, long r2) {
            long r0 = java.lang.Math.min(r0, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double y(double r0) {
            double r0 = java.lang.Math.ceil(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double y0(double r2) {
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            double r2 = java.lang.Math.nextAfter(r2, r0)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float z(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.ceil(r0)
            float r2 = (float) r0
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float z0(float r2) {
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            float r2 = java.lang.Math.nextAfter(r2, r0)
            return r2
    }
}
