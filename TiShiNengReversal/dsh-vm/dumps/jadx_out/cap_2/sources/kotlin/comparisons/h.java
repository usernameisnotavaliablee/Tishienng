package kotlin.comparisons;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class h extends kotlin.comparisons.g {
    public h() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final byte I(byte r0, byte r1) {
            int r0 = java.lang.Math.max(r0, r1)
            byte r0 = (byte) r0
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final byte J(byte r0, byte r1, byte r2) {
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = java.lang.Math.max(r0, r1)
            byte r0 = (byte) r0
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static final byte K(byte r3, @org.jetbrains.annotations.NotNull byte... r4) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L13
            r2 = r4[r1]
            int r3 = java.lang.Math.max(r3, r2)
            byte r3 = (byte) r3
            int r1 = r1 + 1
            goto L7
        L13:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final double L(double r0, double r2) {
            double r0 = java.lang.Math.max(r0, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final double M(double r0, double r2, double r4) {
            double r2 = java.lang.Math.max(r2, r4)
            double r0 = java.lang.Math.max(r0, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static final double N(double r4, @org.jetbrains.annotations.NotNull double... r6) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r6.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L12
            r2 = r6[r1]
            double r4 = java.lang.Math.max(r4, r2)
            int r1 = r1 + 1
            goto L7
        L12:
            return r4
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final float O(float r0, float r1) {
            float r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final float P(float r0, float r1, float r2) {
            float r1 = java.lang.Math.max(r1, r2)
            float r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static final float Q(float r3, @org.jetbrains.annotations.NotNull float... r4) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L12
            r2 = r4[r1]
            float r3 = java.lang.Math.max(r3, r2)
            int r1 = r1 + 1
            goto L7
        L12:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final int R(int r0, int r1) {
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final int S(int r0, int r1, int r2) {
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static final int T(int r3, @org.jetbrains.annotations.NotNull int... r4) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L12
            r2 = r4[r1]
            int r3 = java.lang.Math.max(r3, r2)
            int r1 = r1 + 1
            goto L7
        L12:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final long U(long r0, long r2) {
            long r0 = java.lang.Math.max(r0, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final long V(long r0, long r2, long r4) {
            long r2 = java.lang.Math.max(r2, r4)
            long r0 = java.lang.Math.max(r0, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static final long W(long r4, @org.jetbrains.annotations.NotNull long... r6) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r6.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L12
            r2 = r6[r1]
            long r4 = java.lang.Math.max(r4, r2)
            int r1 = r1 + 1
            goto L7
        L12:
            return r4
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static <T extends java.lang.Comparable<? super T>> T X(@org.jetbrains.annotations.NotNull T r1, @org.jetbrains.annotations.NotNull T r2) {
            java.lang.String r0 = "a"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "b"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1.compareTo(r2)
            if (r0 < 0) goto L11
            return r1
        L11:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> T Y(@org.jetbrains.annotations.NotNull T r1, @org.jetbrains.annotations.NotNull T r2, @org.jetbrains.annotations.NotNull T r3) {
            java.lang.String r0 = "a"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "b"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.Comparable r2 = X(r2, r3)
            java.lang.Comparable r1 = X(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> T Z(@org.jetbrains.annotations.NotNull T r3, @org.jetbrains.annotations.NotNull T... r4) {
            java.lang.String r0 = "a"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.length
            r1 = 0
        Lc:
            if (r1 >= r0) goto L17
            r2 = r4[r1]
            java.lang.Comparable r3 = X(r3, r2)
            int r1 = r1 + 1
            goto Lc
        L17:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final short a0(short r0, short r1) {
            int r0 = java.lang.Math.max(r0, r1)
            short r0 = (short) r0
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final short b0(short r0, short r1, short r2) {
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = java.lang.Math.max(r0, r1)
            short r0 = (short) r0
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static final short c0(short r3, @org.jetbrains.annotations.NotNull short... r4) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L13
            short r2 = r4[r1]
            int r3 = java.lang.Math.max(r3, r2)
            short r3 = (short) r3
            int r1 = r1 + 1
            goto L7
        L13:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final byte d0(byte r0, byte r1) {
            int r0 = java.lang.Math.min(r0, r1)
            byte r0 = (byte) r0
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final byte e0(byte r0, byte r1, byte r2) {
            int r1 = java.lang.Math.min(r1, r2)
            int r0 = java.lang.Math.min(r0, r1)
            byte r0 = (byte) r0
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static final byte f0(byte r3, @org.jetbrains.annotations.NotNull byte... r4) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L13
            r2 = r4[r1]
            int r3 = java.lang.Math.min(r3, r2)
            byte r3 = (byte) r3
            int r1 = r1 + 1
            goto L7
        L13:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final double g0(double r0, double r2) {
            double r0 = java.lang.Math.min(r0, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final double h0(double r0, double r2, double r4) {
            double r2 = java.lang.Math.min(r2, r4)
            double r0 = java.lang.Math.min(r0, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static final double i0(double r4, @org.jetbrains.annotations.NotNull double... r6) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r6.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L12
            r2 = r6[r1]
            double r4 = java.lang.Math.min(r4, r2)
            int r1 = r1 + 1
            goto L7
        L12:
            return r4
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final float j0(float r0, float r1) {
            float r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final float k0(float r0, float r1, float r2) {
            float r1 = java.lang.Math.min(r1, r2)
            float r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static final float l0(float r3, @org.jetbrains.annotations.NotNull float... r4) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L12
            r2 = r4[r1]
            float r3 = java.lang.Math.min(r3, r2)
            int r1 = r1 + 1
            goto L7
        L12:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final int m0(int r0, int r1) {
            int r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final int n0(int r0, int r1, int r2) {
            int r1 = java.lang.Math.min(r1, r2)
            int r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static final int o0(int r3, @org.jetbrains.annotations.NotNull int... r4) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L12
            r2 = r4[r1]
            int r3 = java.lang.Math.min(r3, r2)
            int r1 = r1 + 1
            goto L7
        L12:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final long p0(long r0, long r2) {
            long r0 = java.lang.Math.min(r0, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final long q0(long r0, long r2, long r4) {
            long r2 = java.lang.Math.min(r2, r4)
            long r0 = java.lang.Math.min(r0, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static final long r0(long r4, @org.jetbrains.annotations.NotNull long... r6) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r6.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L12
            r2 = r6[r1]
            long r4 = java.lang.Math.min(r4, r2)
            int r1 = r1 + 1
            goto L7
        L12:
            return r4
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> T s0(@org.jetbrains.annotations.NotNull T r1, @org.jetbrains.annotations.NotNull T r2) {
            java.lang.String r0 = "a"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "b"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1.compareTo(r2)
            if (r0 > 0) goto L11
            return r1
        L11:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> T t0(@org.jetbrains.annotations.NotNull T r1, @org.jetbrains.annotations.NotNull T r2, @org.jetbrains.annotations.NotNull T r3) {
            java.lang.String r0 = "a"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "b"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.Comparable r2 = s0(r2, r3)
            java.lang.Comparable r1 = s0(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> T u0(@org.jetbrains.annotations.NotNull T r3, @org.jetbrains.annotations.NotNull T... r4) {
            java.lang.String r0 = "a"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.length
            r1 = 0
        Lc:
            if (r1 >= r0) goto L17
            r2 = r4[r1]
            java.lang.Comparable r3 = s0(r3, r2)
            int r1 = r1 + 1
            goto Lc
        L17:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final short v0(short r0, short r1) {
            int r0 = java.lang.Math.min(r0, r1)
            short r0 = (short) r0
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final short w0(short r0, short r1, short r2) {
            int r1 = java.lang.Math.min(r1, r2)
            int r0 = java.lang.Math.min(r0, r1)
            short r0 = (short) r0
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static final short x0(short r3, @org.jetbrains.annotations.NotNull short... r4) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L13
            short r2 = r4[r1]
            int r3 = java.lang.Math.min(r3, r2)
            short r3 = (short) r3
            int r1 = r1 + 1
            goto L7
        L13:
            return r3
    }
}
