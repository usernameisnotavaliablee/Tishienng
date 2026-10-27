package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class b0 extends kotlin.a0 {
    public b0() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final int T0(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)
            int r0 = r0 + (-24)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final int U0(short r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = java.lang.Integer.numberOfLeadingZeros(r1)
            int r1 = r1 + (-16)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final int V0(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = java.lang.Integer.bitCount(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final int W0(short r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = java.lang.Integer.bitCount(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final int X0(byte r0) {
            r0 = r0 | 256(0x100, float:3.59E-43)
            int r0 = java.lang.Integer.numberOfTrailingZeros(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final int Y0(short r1) {
            r0 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 | r0
            int r1 = java.lang.Integer.numberOfTrailingZeros(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.6")
    public static final byte Z0(byte r1, int r2) {
            r2 = r2 & 7
            int r0 = r1 << r2
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = 8 - r2
            int r1 = r1 >>> r2
            r1 = r1 | r0
            byte r1 = (byte) r1
            return r1
    }

    @kotlin.SinceKotlin(version = "1.6")
    public static final short a1(short r2, int r3) {
            r3 = r3 & 15
            int r0 = r2 << r3
            r1 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            int r3 = 16 - r3
            int r2 = r2 >>> r3
            r2 = r2 | r0
            short r2 = (short) r2
            return r2
    }

    @kotlin.SinceKotlin(version = "1.6")
    public static final byte b1(byte r1, int r2) {
            r2 = r2 & 7
            int r0 = 8 - r2
            int r0 = r1 << r0
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 >>> r2
            r1 = r1 | r0
            byte r1 = (byte) r1
            return r1
    }

    @kotlin.SinceKotlin(version = "1.6")
    public static final short c1(short r2, int r3) {
            r3 = r3 & 15
            int r0 = 16 - r3
            int r0 = r2 << r0
            r1 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            int r2 = r2 >>> r3
            r2 = r2 | r0
            short r2 = (short) r2
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final byte d1(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = java.lang.Integer.highestOneBit(r0)
            byte r0 = (byte) r0
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final short e1(short r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = java.lang.Integer.highestOneBit(r1)
            short r1 = (short) r1
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final byte f1(byte r0) {
            int r0 = java.lang.Integer.lowestOneBit(r0)
            byte r0 = (byte) r0
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final short g1(short r0) {
            int r0 = java.lang.Integer.lowestOneBit(r0)
            short r0 = (short) r0
            return r0
    }
}
