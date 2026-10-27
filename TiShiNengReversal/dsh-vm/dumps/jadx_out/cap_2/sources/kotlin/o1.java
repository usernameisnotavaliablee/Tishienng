package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "UnsignedKt")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class o1 {
    @kotlin.PublishedApi
    public static final int a(double r4) {
            boolean r0 = java.lang.Double.isNaN(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            double r2 = h(r1)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L11
            return r1
        L11:
            r0 = -1
            double r1 = h(r0)
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 < 0) goto L1b
            return r0
        L1b:
            r0 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L2a
            int r4 = (int) r4
            int r4 = kotlin.z0.k(r4)
            return r4
        L2a:
            r0 = 2147483647(0x7fffffff, float:NaN)
            double r1 = (double) r0
            double r4 = r4 - r1
            int r4 = (int) r4
            int r4 = kotlin.z0.k(r4)
            int r5 = kotlin.z0.k(r0)
            int r4 = r4 + r5
            int r4 = kotlin.z0.k(r4)
            return r4
    }

    @kotlin.PublishedApi
    public static final long b(double r5) {
            boolean r0 = java.lang.Double.isNaN(r5)
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            double r3 = q(r1)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L12
            return r1
        L12:
            r0 = -1
            double r2 = q(r0)
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 < 0) goto L1d
            return r0
        L1d:
            r0 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto L29
            long r5 = (long) r5
            long r5 = kotlin.d1.k(r5)
            return r5
        L29:
            double r5 = r5 - r0
            long r5 = (long) r5
            long r5 = kotlin.d1.k(r5)
            r0 = -9223372036854775808
            long r5 = r5 + r0
            long r5 = kotlin.d1.k(r5)
            return r5
    }

    @kotlin.PublishedApi
    @kotlin.internal.InlineOnly
    private static final int c(float r2) {
            double r0 = (double) r2
            int r2 = a(r0)
            return r2
    }

    @kotlin.PublishedApi
    @kotlin.internal.InlineOnly
    private static final long d(float r2) {
            double r0 = (double) r2
            long r0 = b(r0)
            return r0
    }

    @kotlin.PublishedApi
    public static final int e(int r1, int r2) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 ^ r0
            r2 = r2 ^ r0
            int r1 = kotlin.jvm.internal.g0.t(r1, r2)
            return r1
    }

    @kotlin.PublishedApi
    public static final int f(int r4, int r5) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r4 = (long) r5
            long r4 = r4 & r2
            long r0 = r0 / r4
            int r4 = (int) r0
            int r4 = kotlin.z0.k(r4)
            return r4
    }

    @kotlin.PublishedApi
    public static final int g(int r4, int r5) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r4 = (long) r5
            long r4 = r4 & r2
            long r0 = r0 % r4
            int r4 = (int) r0
            int r4 = kotlin.z0.k(r4)
            return r4
    }

    @kotlin.PublishedApi
    public static final double h(int r6) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r6
            double r0 = (double) r0
            int r6 = r6 >>> 31
            int r6 = r6 << 30
            double r2 = (double) r6
            r6 = 2
            double r4 = (double) r6
            double r2 = r2 * r4
            double r0 = r0 + r2
            return r0
    }

    @kotlin.PublishedApi
    @kotlin.internal.InlineOnly
    private static final float i(int r2) {
            double r0 = h(r2)
            float r2 = (float) r0
            return r2
    }

    @kotlin.PublishedApi
    @kotlin.internal.InlineOnly
    private static final long j(int r4) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String k(int r4) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            java.lang.String r4 = java.lang.String.valueOf(r0)
            return r4
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String l(int r4, int r5) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            java.lang.String r4 = t(r0, r5)
            return r4
    }

    @kotlin.PublishedApi
    @kotlin.internal.InlineOnly
    private static final long m(int r4) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = kotlin.d1.k(r0)
            return r0
    }

    @kotlin.PublishedApi
    public static final int n(long r2, long r4) {
            r0 = -9223372036854775808
            long r2 = r2 ^ r0
            long r4 = r4 ^ r0
            int r2 = kotlin.jvm.internal.g0.u(r2, r4)
            return r2
    }

    @kotlin.PublishedApi
    public static final long o(long r5, long r7) {
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L18
            int r5 = androidx.collection.a.a(r5, r7)
            if (r5 >= 0) goto L11
            long r5 = kotlin.d1.k(r0)
            return r5
        L11:
            r5 = 1
            long r5 = kotlin.d1.k(r5)
            return r5
        L18:
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L22
            long r5 = r5 / r7
            long r5 = kotlin.d1.k(r5)
            return r5
        L22:
            r0 = 1
            long r1 = r5 >>> r0
            long r1 = r1 / r7
            long r1 = r1 << r0
            long r3 = r1 * r7
            long r5 = r5 - r3
            long r5 = kotlin.d1.k(r5)
            long r7 = kotlin.d1.k(r7)
            int r5 = androidx.collection.a.a(r5, r7)
            if (r5 < 0) goto L39
            goto L3a
        L39:
            r0 = 0
        L3a:
            long r5 = (long) r0
            long r1 = r1 + r5
            long r5 = kotlin.d1.k(r1)
            return r5
    }

    @kotlin.PublishedApi
    public static final long p(long r6, long r8) {
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 >= 0) goto L13
            int r0 = androidx.collection.a.a(r6, r8)
            if (r0 >= 0) goto Ld
            return r6
        Ld:
            long r6 = r6 - r8
            long r6 = kotlin.d1.k(r6)
            return r6
        L13:
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L1d
            long r6 = r6 % r8
            long r6 = kotlin.d1.k(r6)
            return r6
        L1d:
            r2 = 1
            long r3 = r6 >>> r2
            long r3 = r3 / r8
            long r2 = r3 << r2
            long r2 = r2 * r8
            long r6 = r6 - r2
            long r2 = kotlin.d1.k(r6)
            long r4 = kotlin.d1.k(r8)
            int r2 = androidx.collection.a.a(r2, r4)
            if (r2 < 0) goto L35
            goto L36
        L35:
            r8 = r0
        L36:
            long r6 = r6 - r8
            long r6 = kotlin.d1.k(r6)
            return r6
    }

    @kotlin.PublishedApi
    public static final double q(long r4) {
            r0 = 11
            long r0 = r4 >>> r0
            double r0 = (double) r0
            r2 = 2048(0x800, float:2.87E-42)
            double r2 = (double) r2
            double r0 = r0 * r2
            r2 = 2047(0x7ff, double:1.0114E-320)
            long r4 = r4 & r2
            double r4 = (double) r4
            double r0 = r0 + r4
            return r0
    }

    @kotlin.PublishedApi
    @kotlin.internal.InlineOnly
    private static final float r(long r0) {
            double r0 = q(r0)
            float r0 = (float) r0
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String s(long r1) {
            r0 = 10
            java.lang.String r1 = t(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String t(long r7, int r9) {
            r0 = 0
            java.lang.String r2 = "toString(...)"
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 < 0) goto L14
            int r9 = kotlin.text.b.a(r9)
            java.lang.String r7 = java.lang.Long.toString(r7, r9)
            kotlin.jvm.internal.g0.o(r7, r2)
            return r7
        L14:
            r0 = 1
            long r3 = r7 >>> r0
            long r5 = (long) r9
            long r3 = r3 / r5
            long r0 = r3 << r0
            long r3 = r0 * r5
            long r7 = r7 - r3
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 < 0) goto L26
            long r7 = r7 - r5
            r3 = 1
            long r0 = r0 + r3
        L26:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r4 = kotlin.text.b.a(r9)
            java.lang.String r0 = java.lang.Long.toString(r0, r4)
            kotlin.jvm.internal.g0.o(r0, r2)
            r3.append(r0)
            int r9 = kotlin.text.b.a(r9)
            java.lang.String r7 = java.lang.Long.toString(r7, r9)
            kotlin.jvm.internal.g0.o(r7, r2)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            return r7
    }
}
