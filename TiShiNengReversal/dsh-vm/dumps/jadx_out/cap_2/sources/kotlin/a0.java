package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class a0 extends kotlin.z {
    public a0() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final float A0(kotlin.jvm.internal.z r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            float r1 = java.lang.Float.intBitsToFloat(r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final boolean B0(double r3) {
            double r3 = java.lang.Math.abs(r3)
            r0 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto Lf
            r3 = 1
            return r3
        Lf:
            r3 = 0
            return r3
    }

    @kotlin.internal.InlineOnly
    private static final boolean C0(float r1) {
            float r1 = java.lang.Math.abs(r1)
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 > 0) goto Ld
            r1 = 1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final boolean D0(double r0) {
            boolean r0 = java.lang.Double.isInfinite(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean E0(float r0) {
            boolean r0 = java.lang.Float.isInfinite(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean F0(double r0) {
            boolean r0 = java.lang.Double.isNaN(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean G0(float r0) {
            boolean r0 = java.lang.Float.isNaN(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.internal.InlineOnly
    private static final int H0(int r0, int r1) {
            int r0 = java.lang.Integer.rotateLeft(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.internal.InlineOnly
    private static final long I0(long r0, int r2) {
            long r0 = java.lang.Long.rotateLeft(r0, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.internal.InlineOnly
    private static final int J0(int r0, int r1) {
            int r0 = java.lang.Integer.rotateRight(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.internal.InlineOnly
    private static final long K0(long r0, int r2) {
            long r0 = java.lang.Long.rotateRight(r0, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final int L0(int r0) {
            int r0 = java.lang.Integer.highestOneBit(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final long M0(long r0) {
            long r0 = java.lang.Long.highestOneBit(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final int N0(int r0) {
            int r0 = java.lang.Integer.lowestOneBit(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final long O0(long r0) {
            long r0 = java.lang.Long.lowestOneBit(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final int P0(float r0) {
            int r0 = java.lang.Float.floatToIntBits(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final long Q0(double r0) {
            long r0 = java.lang.Double.doubleToLongBits(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final int R0(float r0) {
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final long S0(double r0) {
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final int t0(int r0) {
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final int u0(long r0) {
            int r0 = java.lang.Long.numberOfLeadingZeros(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final int v0(int r0) {
            int r0 = java.lang.Integer.bitCount(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final int w0(long r0) {
            int r0 = java.lang.Long.bitCount(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final int x0(int r0) {
            int r0 = java.lang.Integer.numberOfTrailingZeros(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final int y0(long r0) {
            int r0 = java.lang.Long.numberOfTrailingZeros(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final double z0(kotlin.jvm.internal.w r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            double r1 = java.lang.Double.longBitsToDouble(r2)
            return r1
    }
}
