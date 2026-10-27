package kotlin.comparisons;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class n {
    public n() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final short a(short r2, short r3) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r2 & r0
            r0 = r0 & r3
            int r0 = kotlin.jvm.internal.g0.t(r1, r0)
            if (r0 < 0) goto Ld
            return r2
        Ld:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static int b(int r1, int r2) {
            int r0 = kotlin.u0.a(r1, r2)
            if (r0 < 0) goto L7
            return r1
        L7:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final byte c(byte r2, byte r3) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            r1 = r3 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.jvm.internal.g0.t(r0, r1)
            if (r0 < 0) goto Lb
            return r2
        Lb:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    public static final int d(int r3, @org.jetbrains.annotations.NotNull int... r4) {
            java.lang.String r0 = "$v$c$kotlin-UIntArray$-other$0"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = kotlin.a1.r(r4)
            r1 = 0
        La:
            if (r1 >= r0) goto L17
            int r2 = kotlin.a1.p(r4, r1)
            int r3 = b(r3, r2)
            int r1 = r1 + 1
            goto La
        L17:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    public static final long e(long r4, @org.jetbrains.annotations.NotNull long... r6) {
            java.lang.String r0 = "$v$c$kotlin-ULongArray$-other$0"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = kotlin.e1.r(r6)
            r1 = 0
        La:
            if (r1 >= r0) goto L17
            long r2 = kotlin.e1.p(r6, r1)
            long r4 = j(r4, r2)
            int r1 = r1 + 1
            goto La
        L17:
            return r4
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final short f(short r0, short r1, short r2) {
            short r1 = a(r1, r2)
            short r0 = a(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final int g(int r0, int r1, int r2) {
            int r1 = b(r1, r2)
            int r0 = b(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    public static final byte h(byte r3, @org.jetbrains.annotations.NotNull byte... r4) {
            java.lang.String r0 = "$v$c$kotlin-UByteArray$-other$0"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = kotlin.w0.r(r4)
            r1 = 0
        La:
            if (r1 >= r0) goto L17
            byte r2 = kotlin.w0.p(r4, r1)
            byte r3 = c(r3, r2)
            int r1 = r1 + 1
            goto La
        L17:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final byte i(byte r0, byte r1, byte r2) {
            byte r1 = c(r1, r2)
            byte r0 = c(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static long j(long r1, long r3) {
            int r0 = androidx.collection.a.a(r1, r3)
            if (r0 < 0) goto L7
            return r1
        L7:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final long k(long r0, long r2, long r4) {
            long r2 = j(r2, r4)
            long r0 = j(r0, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    public static final short l(short r3, @org.jetbrains.annotations.NotNull short... r4) {
            java.lang.String r0 = "$v$c$kotlin-UShortArray$-other$0"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = kotlin.k1.r(r4)
            r1 = 0
        La:
            if (r1 >= r0) goto L17
            short r2 = kotlin.k1.p(r4, r1)
            short r3 = a(r3, r2)
            int r1 = r1 + 1
            goto La
        L17:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final short m(short r2, short r3) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r2 & r0
            r0 = r0 & r3
            int r0 = kotlin.jvm.internal.g0.t(r1, r0)
            if (r0 > 0) goto Ld
            return r2
        Ld:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static int n(int r1, int r2) {
            int r0 = kotlin.u0.a(r1, r2)
            if (r0 > 0) goto L7
            return r1
        L7:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final byte o(byte r2, byte r3) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            r1 = r3 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.jvm.internal.g0.t(r0, r1)
            if (r0 > 0) goto Lb
            return r2
        Lb:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    public static final int p(int r3, @org.jetbrains.annotations.NotNull int... r4) {
            java.lang.String r0 = "$v$c$kotlin-UIntArray$-other$0"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = kotlin.a1.r(r4)
            r1 = 0
        La:
            if (r1 >= r0) goto L17
            int r2 = kotlin.a1.p(r4, r1)
            int r3 = n(r3, r2)
            int r1 = r1 + 1
            goto La
        L17:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    public static final long q(long r4, @org.jetbrains.annotations.NotNull long... r6) {
            java.lang.String r0 = "$v$c$kotlin-ULongArray$-other$0"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = kotlin.e1.r(r6)
            r1 = 0
        La:
            if (r1 >= r0) goto L17
            long r2 = kotlin.e1.p(r6, r1)
            long r4 = v(r4, r2)
            int r1 = r1 + 1
            goto La
        L17:
            return r4
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final short r(short r0, short r1, short r2) {
            short r1 = m(r1, r2)
            short r0 = m(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final int s(int r0, int r1, int r2) {
            int r1 = n(r1, r2)
            int r0 = n(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    public static final byte t(byte r3, @org.jetbrains.annotations.NotNull byte... r4) {
            java.lang.String r0 = "$v$c$kotlin-UByteArray$-other$0"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = kotlin.w0.r(r4)
            r1 = 0
        La:
            if (r1 >= r0) goto L17
            byte r2 = kotlin.w0.p(r4, r1)
            byte r3 = o(r3, r2)
            int r1 = r1 + 1
            goto La
        L17:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final byte u(byte r0, byte r1, byte r2) {
            byte r1 = o(r1, r2)
            byte r0 = o(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static long v(long r1, long r3) {
            int r0 = androidx.collection.a.a(r1, r3)
            if (r0 > 0) goto L7
            return r1
        L7:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final long w(long r0, long r2, long r4) {
            long r2 = v(r2, r4)
            long r0 = v(r0, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    public static final short x(short r3, @org.jetbrains.annotations.NotNull short... r4) {
            java.lang.String r0 = "$v$c$kotlin-UShortArray$-other$0"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = kotlin.k1.r(r4)
            r1 = 0
        La:
            if (r1 >= r0) goto L17
            short r2 = kotlin.k1.p(r4, r1)
            short r3 = m(r3, r2)
            int r1 = r1 + 1
            goto La
        L17:
            return r3
    }
}
