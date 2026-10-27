package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "UNumbersKt")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class i1 {
    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final int A(int r0) {
            int r0 = java.lang.Integer.lowestOneBit(r0)
            int r0 = kotlin.z0.k(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final short B(short r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = java.lang.Integer.lowestOneBit(r1)
            short r1 = (short) r1
            short r1 = kotlin.j1.k(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final int a(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)
            int r0 = r0 + (-24)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final int b(long r0) {
            int r0 = java.lang.Long.numberOfLeadingZeros(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final int c(int r0) {
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final int d(short r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = java.lang.Integer.numberOfLeadingZeros(r1)
            int r1 = r1 + (-16)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final int e(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.z0.k(r0)
            int r0 = java.lang.Integer.bitCount(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final int f(long r0) {
            int r0 = java.lang.Long.bitCount(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final int g(int r0) {
            int r0 = java.lang.Integer.bitCount(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final int h(short r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = kotlin.z0.k(r1)
            int r1 = java.lang.Integer.bitCount(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final int i(byte r0) {
            r0 = r0 | 256(0x100, float:3.59E-43)
            int r0 = java.lang.Integer.numberOfTrailingZeros(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final int j(long r0) {
            int r0 = java.lang.Long.numberOfTrailingZeros(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final int k(int r0) {
            int r0 = java.lang.Integer.numberOfTrailingZeros(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final int l(short r1) {
            r0 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 | r0
            int r1 = java.lang.Integer.numberOfTrailingZeros(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.internal.InlineOnly
    private static final long m(long r0, int r2) {
            long r0 = java.lang.Long.rotateLeft(r0, r2)
            long r0 = kotlin.d1.k(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.internal.InlineOnly
    private static final byte n(byte r0, int r1) {
            byte r0 = kotlin.b0.Z0(r0, r1)
            byte r0 = kotlin.v0.k(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.internal.InlineOnly
    private static final int o(int r0, int r1) {
            int r0 = java.lang.Integer.rotateLeft(r0, r1)
            int r0 = kotlin.z0.k(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.internal.InlineOnly
    private static final short p(short r0, int r1) {
            short r0 = kotlin.b0.a1(r0, r1)
            short r0 = kotlin.j1.k(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.internal.InlineOnly
    private static final long q(long r0, int r2) {
            long r0 = java.lang.Long.rotateRight(r0, r2)
            long r0 = kotlin.d1.k(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.internal.InlineOnly
    private static final byte r(byte r0, int r1) {
            byte r0 = kotlin.b0.b1(r0, r1)
            byte r0 = kotlin.v0.k(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.internal.InlineOnly
    private static final int s(int r0, int r1) {
            int r0 = java.lang.Integer.rotateRight(r0, r1)
            int r0 = kotlin.z0.k(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.internal.InlineOnly
    private static final short t(short r0, int r1) {
            short r0 = kotlin.b0.c1(r0, r1)
            short r0 = kotlin.j1.k(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final byte u(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = java.lang.Integer.highestOneBit(r0)
            byte r0 = (byte) r0
            byte r0 = kotlin.v0.k(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final long v(long r0) {
            long r0 = java.lang.Long.highestOneBit(r0)
            long r0 = kotlin.d1.k(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final int w(int r0) {
            int r0 = java.lang.Integer.highestOneBit(r0)
            int r0 = kotlin.z0.k(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final short x(short r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = java.lang.Integer.highestOneBit(r1)
            short r1 = (short) r1
            short r1 = kotlin.j1.k(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final byte y(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = java.lang.Integer.lowestOneBit(r0)
            byte r0 = (byte) r0
            byte r0 = kotlin.v0.k(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final long z(long r0) {
            long r0 = java.lang.Long.lowestOneBit(r0)
            long r0 = kotlin.d1.k(r0)
            return r0
    }
}
