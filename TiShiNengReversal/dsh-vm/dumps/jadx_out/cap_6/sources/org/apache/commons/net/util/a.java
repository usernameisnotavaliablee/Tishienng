package org.apache.commons.net.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    private static final int m = 2;
    private static final int n = 8192;
    static final int o = 76;
    private static final byte[] p = null;

    /* renamed from: q, reason: collision with root package name */
    private static final byte[] f66q = null;
    private static final byte[] r = null;
    private static final byte[] s = null;
    private static final byte t = 61;
    private static final byte[] u = null;
    private static final int v = 63;
    private static final int w = 255;
    private final byte[] a;
    private final int b;
    private final byte[] c;
    private final int d;
    private final int e;
    private byte[] f;
    private int g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private int l;

    static {
            r0 = 2
            byte[] r0 = new byte[r0]
            r0 = {x002a: FILL_ARRAY_DATA , data: [13, 10} // fill-array
            org.apache.commons.net.util.a.p = r0
            r0 = 0
            byte[] r0 = new byte[r0]
            org.apache.commons.net.util.a.f66q = r0
            r0 = 64
            byte[] r0 = new byte[r0]
            r0 = {x0030: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47} // fill-array
            org.apache.commons.net.util.a.r = r0
            r0 = 64
            byte[] r0 = new byte[r0]
            r0 = {x0054: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95} // fill-array
            org.apache.commons.net.util.a.s = r0
            r0 = 123(0x7b, float:1.72E-43)
            byte[] r0 = new byte[r0]
            r0 = {x0078: FILL_ARRAY_DATA , data: [-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51} // fill-array
            org.apache.commons.net.util.a.u = r0
            return
    }

    public a() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public a(int r2) {
            r1 = this;
            byte[] r0 = org.apache.commons.net.util.a.p
            r1.<init>(r2, r0)
            return
    }

    public a(int r2, byte[] r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public a(int r5, byte[] r6, boolean r7) {
            r4 = this;
            r4.<init>()
            r0 = 0
            if (r6 != 0) goto L9
            byte[] r6 = org.apache.commons.net.util.a.f66q
            r5 = 0
        L9:
            r1 = 4
            if (r5 <= 0) goto L11
            int r2 = r5 / 4
            int r2 = r2 * 4
            goto L12
        L11:
            r2 = 0
        L12:
            r4.b = r2
            int r2 = r6.length
            byte[] r2 = new byte[r2]
            r4.c = r2
            int r3 = r6.length
            java.lang.System.arraycopy(r6, r0, r2, r0, r3)
            if (r5 <= 0) goto L24
            int r5 = r6.length
            int r5 = r5 + r1
            r4.e = r5
            goto L26
        L24:
            r4.e = r1
        L26:
            int r5 = r4.e
            int r5 = r5 + (-1)
            r4.d = r5
            boolean r5 = b(r6)
            if (r5 != 0) goto L3c
            if (r7 == 0) goto L37
            byte[] r5 = org.apache.commons.net.util.a.s
            goto L39
        L37:
            byte[] r5 = org.apache.commons.net.util.a.r
        L39:
            r4.a = r5
            return
        L3c:
            java.lang.String r5 = F(r6)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "lineSeperator must not contain base64 characters: ["
            r7.append(r0)
            r7.append(r5)
            java.lang.String r5 = "]"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
    }

    public a(boolean r3) {
            r2 = this;
            r0 = 76
            byte[] r1 = org.apache.commons.net.util.a.p
            r2.<init>(r0, r1, r3)
            return
    }

    public static boolean B(byte[] r3) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r3.length
            if (r1 >= r2) goto L19
            r2 = r3[r1]
            boolean r2 = C(r2)
            if (r2 != 0) goto L16
            r2 = r3[r1]
            boolean r2 = E(r2)
            if (r2 != 0) goto L16
            return r0
        L16:
            int r1 = r1 + 1
            goto L2
        L19:
            r3 = 1
            return r3
    }

    public static boolean C(byte r2) {
            r0 = 61
            if (r2 == r0) goto L13
            if (r2 < 0) goto L11
            byte[] r0 = org.apache.commons.net.util.a.u
            int r1 = r0.length
            if (r2 >= r1) goto L11
            r2 = r0[r2]
            r0 = -1
            if (r2 == r0) goto L11
            goto L13
        L11:
            r2 = 0
            return r2
        L13:
            r2 = 1
            return r2
    }

    private static boolean E(byte r1) {
            r0 = 9
            if (r1 == r0) goto L12
            r0 = 10
            if (r1 == r0) goto L12
            r0 = 13
            if (r1 == r0) goto L12
            r0 = 32
            if (r1 == r0) goto L12
            r1 = 0
            return r1
        L12:
            r1 = 1
            return r1
    }

    private static java.lang.String F(byte[] r2) {
            java.lang.String r0 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L8
            java.lang.String r1 = "UTF8"
            r0.<init>(r2, r1)     // Catch: java.io.UnsupportedEncodingException -> L8
            return r0
        L8:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
    }

    private void H() {
            r1 = this;
            r0 = 0
            r1.f = r0
            r0 = 0
            r1.g = r0
            r1.h = r0
            r1.i = r0
            r1.j = r0
            r1.k = r0
            return
    }

    private void I() {
            r4 = this;
            byte[] r0 = r4.f
            r1 = 0
            if (r0 != 0) goto L10
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            r4.f = r0
            r4.g = r1
            r4.h = r1
            return
        L10:
            int r2 = r0.length
            int r2 = r2 * 2
            byte[] r2 = new byte[r2]
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r3)
            r4.f = r2
            return
    }

    static byte[] K(java.math.BigInteger r5) {
            int r0 = r5.bitLength()
            int r0 = r0 + 7
            int r0 = r0 >> 3
            int r0 = r0 << 3
            byte[] r1 = r5.toByteArray()
            int r2 = r5.bitLength()
            int r2 = r2 % 8
            r3 = 1
            if (r2 == 0) goto L23
            int r2 = r5.bitLength()
            int r2 = r2 / 8
            int r2 = r2 + r3
            int r4 = r0 / 8
            if (r2 != r4) goto L23
            return r1
        L23:
            int r2 = r1.length
            int r5 = r5.bitLength()
            int r5 = r5 % 8
            if (r5 != 0) goto L2f
            int r2 = r2 + (-1)
            goto L30
        L2f:
            r3 = 0
        L30:
            int r0 = r0 / 8
            int r5 = r0 - r2
            byte[] r0 = new byte[r0]
            java.lang.System.arraycopy(r1, r3, r0, r5, r2)
            return r0
    }

    private static boolean b(byte[] r4) {
            int r0 = r4.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto L12
            r3 = r4[r2]
            boolean r3 = C(r3)
            if (r3 == 0) goto Lf
            r4 = 1
            return r4
        Lf:
            int r2 = r2 + 1
            goto L3
        L12:
            return r1
    }

    public static byte[] f(java.lang.String r1) {
            org.apache.commons.net.util.a r0 = new org.apache.commons.net.util.a
            r0.<init>()
            byte[] r1 = r0.d(r1)
            return r1
    }

    public static byte[] g(byte[] r1) {
            org.apache.commons.net.util.a r0 = new org.apache.commons.net.util.a
            r0.<init>()
            byte[] r1 = r0.e(r1)
            return r1
    }

    public static java.math.BigInteger h(byte[] r2) {
            java.math.BigInteger r0 = new java.math.BigInteger
            r1 = 1
            byte[] r2 = g(r2)
            r0.<init>(r1, r2)
            return r0
    }

    public static byte[] k(byte[] r1) {
            r0 = 0
            byte[] r1 = l(r1, r0)
            return r1
    }

    public static byte[] l(byte[] r1, boolean r2) {
            r0 = 0
            byte[] r1 = m(r1, r2, r0)
            return r1
    }

    public static byte[] m(byte[] r1, boolean r2, boolean r3) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            byte[] r1 = n(r1, r2, r3, r0)
            return r1
    }

    public static byte[] n(byte[] r6, boolean r7, boolean r8, int r9) {
            if (r6 == 0) goto L50
            int r0 = r6.length
            if (r0 != 0) goto L6
            goto L50
        L6:
            r0 = 0
            if (r7 == 0) goto Lc
            r1 = 76
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r7 == 0) goto L12
            byte[] r2 = org.apache.commons.net.util.a.p
            goto L14
        L12:
            byte[] r2 = org.apache.commons.net.util.a.f66q
        L14:
            long r1 = x(r6, r1, r2)
            long r3 = (long) r9
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L31
            if (r7 == 0) goto L25
            org.apache.commons.net.util.a r7 = new org.apache.commons.net.util.a
            r7.<init>(r8)
            goto L2c
        L25:
            org.apache.commons.net.util.a r7 = new org.apache.commons.net.util.a
            byte[] r9 = org.apache.commons.net.util.a.p
            r7.<init>(r0, r9, r8)
        L2c:
            byte[] r6 = r7.j(r6)
            return r6
        L31:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Input array too big, the output array would be bigger ("
            r7.append(r8)
            r7.append(r1)
            java.lang.String r8 = ") than the specified maxium size of "
            r7.append(r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L50:
            return r6
    }

    public static byte[] o(byte[] r1) {
            r0 = 1
            byte[] r1 = l(r1, r0)
            return r1
    }

    public static java.lang.String p(byte[] r1) {
            r0 = 1
            byte[] r1 = l(r1, r0)
            java.lang.String r1 = F(r1)
            return r1
    }

    public static java.lang.String q(byte[] r0, boolean r1) {
            byte[] r0 = l(r0, r1)
            java.lang.String r0 = F(r0)
            return r0
    }

    public static java.lang.String r(byte[] r1) {
            r0 = 0
            byte[] r1 = l(r1, r0)
            java.lang.String r1 = F(r1)
            return r1
    }

    public static byte[] s(byte[] r2) {
            r0 = 0
            r1 = 1
            byte[] r2 = m(r2, r0, r1)
            return r2
    }

    public static java.lang.String t(byte[] r2) {
            r0 = 0
            r1 = 1
            byte[] r2 = m(r2, r0, r1)
            java.lang.String r2 = F(r2)
            return r2
    }

    public static byte[] u(java.math.BigInteger r1) {
            if (r1 == 0) goto Lc
            byte[] r1 = K(r1)
            r0 = 0
            byte[] r1 = l(r1, r0)
            return r1
        Lc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "encodeInteger called with null parameter"
            r1.<init>(r0)
            throw r1
    }

    private byte[] w(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "UTF8"
            byte[] r2 = r2.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L7
            return r2
        L7:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
    }

    private static long x(byte[] r8, int r9, byte[] r10) {
            int r9 = r9 / 4
            int r9 = r9 * 4
            int r8 = r8.length
            int r8 = r8 * 4
            int r8 = r8 / 3
            long r0 = (long) r8
            r2 = 4
            long r4 = r0 % r2
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L16
            long r2 = r2 - r4
            long r0 = r0 + r2
        L16:
            if (r9 <= 0) goto L2e
            long r8 = (long) r9
            long r2 = r0 % r8
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 != 0) goto L21
            r2 = 1
            goto L22
        L21:
            r2 = 0
        L22:
            long r8 = r0 / r8
            int r3 = r10.length
            long r3 = (long) r3
            long r8 = r8 * r3
            long r0 = r0 + r8
            if (r2 != 0) goto L2e
            int r8 = r10.length
            long r8 = (long) r8
            long r0 = r0 + r8
        L2e:
            return r0
    }

    boolean A() {
            r1 = this;
            byte[] r0 = r1.f
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public boolean D() {
            r2 = this;
            byte[] r0 = r2.a
            byte[] r1 = org.apache.commons.net.util.a.s
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    int G(byte[] r4, int r5, int r6) {
            r3 = this;
            byte[] r0 = r3.f
            if (r0 == 0) goto L25
            int r0 = r3.a()
            int r6 = java.lang.Math.min(r0, r6)
            byte[] r0 = r3.f
            r1 = 0
            if (r0 == r4) goto L22
            int r2 = r3.h
            java.lang.System.arraycopy(r0, r2, r4, r5, r6)
            int r4 = r3.h
            int r4 = r4 + r6
            r3.h = r4
            int r5 = r3.g
            if (r4 < r5) goto L21
            r3.f = r1
        L21:
            return r6
        L22:
            r3.f = r1
            return r6
        L25:
            boolean r4 = r3.k
            if (r4 == 0) goto L2b
            r4 = -1
            return r4
        L2b:
            r4 = 0
            return r4
    }

    void J(byte[] r2, int r3, int r4) {
            r1 = this;
            if (r2 == 0) goto Lb
            int r0 = r2.length
            if (r0 != r4) goto Lb
            r1.f = r2
            r1.g = r3
            r1.h = r3
        Lb:
            return
    }

    int a() {
            r2 = this;
            byte[] r0 = r2.f
            if (r0 == 0) goto La
            int r0 = r2.g
            int r1 = r2.h
            int r0 = r0 - r1
            return r0
        La:
            r0 = 0
            return r0
    }

    void c(byte[] r10, int r11, int r12) {
            r9 = this;
            boolean r0 = r9.k
            if (r0 == 0) goto L6
            goto Lab
        L6:
            r0 = 1
            if (r12 >= 0) goto Lb
            r9.k = r0
        Lb:
            r1 = 0
        Lc:
            r2 = 3
            if (r1 >= r12) goto L6a
            byte[] r3 = r9.f
            if (r3 == 0) goto L1b
            int r3 = r3.length
            int r4 = r9.g
            int r3 = r3 - r4
            int r4 = r9.d
            if (r3 >= r4) goto L1e
        L1b:
            r9.I()
        L1e:
            int r3 = r11 + 1
            r11 = r10[r11]
            r4 = 61
            if (r11 != r4) goto L29
            r9.k = r0
            goto L6a
        L29:
            if (r11 < 0) goto L66
            byte[] r4 = org.apache.commons.net.util.a.u
            int r5 = r4.length
            if (r11 >= r5) goto L66
            r11 = r4[r11]
            if (r11 < 0) goto L66
            int r4 = r9.j
            int r4 = r4 + r0
            int r4 = r4 % 4
            r9.j = r4
            int r5 = r9.l
            int r5 = r5 << 6
            int r5 = r5 + r11
            r9.l = r5
            if (r4 != 0) goto L66
            byte[] r11 = r9.f
            int r4 = r9.g
            int r6 = r4 + 1
            r9.g = r6
            int r7 = r5 >> 16
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            r11[r4] = r7
            int r7 = r4 + 2
            r9.g = r7
            int r8 = r5 >> 8
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r11[r6] = r8
            int r4 = r4 + r2
            r9.g = r4
            r2 = r5 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r11[r7] = r2
        L66:
            int r1 = r1 + 1
            r11 = r3
            goto Lc
        L6a:
            boolean r10 = r9.k
            if (r10 == 0) goto Lab
            int r10 = r9.j
            if (r10 == 0) goto Lab
            int r11 = r9.l
            int r12 = r11 << 6
            r9.l = r12
            r0 = 2
            if (r10 == r0) goto L98
            if (r10 == r2) goto L7e
            goto Lab
        L7e:
            byte[] r10 = r9.f
            int r11 = r9.g
            int r1 = r11 + 1
            r9.g = r1
            int r2 = r12 >> 16
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r10[r11] = r2
            int r11 = r11 + r0
            r9.g = r11
            int r11 = r12 >> 8
            r11 = r11 & 255(0xff, float:3.57E-43)
            byte r11 = (byte) r11
            r10[r1] = r11
            return
        L98:
            int r10 = r11 << 12
            r9.l = r10
            byte[] r11 = r9.f
            int r12 = r9.g
            int r0 = r12 + 1
            r9.g = r0
            int r10 = r10 >> 16
            r10 = r10 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r10
            r11[r12] = r10
        Lab:
            return
    }

    public byte[] d(java.lang.String r1) {
            r0 = this;
            byte[] r1 = r0.w(r1)
            byte[] r1 = r0.e(r1)
            return r1
    }

    public byte[] e(byte[] r4) {
            r3 = this;
            r3.H()
            if (r4 == 0) goto L26
            int r0 = r4.length
            if (r0 != 0) goto L9
            goto L26
        L9:
            int r0 = r4.length
            int r0 = r0 * 3
            int r0 = r0 / 4
            long r0 = (long) r0
            int r1 = (int) r0
            byte[] r0 = new byte[r1]
            r2 = 0
            r3.J(r0, r2, r1)
            int r0 = r4.length
            r3.c(r4, r2, r0)
            r0 = -1
            r3.c(r4, r2, r0)
            int r4 = r3.g
            byte[] r0 = new byte[r4]
            r3.G(r0, r2, r4)
            return r0
        L26:
            return r4
    }

    void i(byte[] r11, int r12, int r13) {
            r10 = this;
            boolean r0 = r10.k
            if (r0 == 0) goto L6
            goto L123
        L6:
            r0 = 0
            r1 = 1
            if (r13 >= 0) goto La5
            r10.k = r1
            byte[] r11 = r10.f
            if (r11 == 0) goto L18
            int r11 = r11.length
            int r12 = r10.g
            int r11 = r11 - r12
            int r12 = r10.e
            if (r11 >= r12) goto L1b
        L18:
            r10.I()
        L1b:
            int r11 = r10.j
            r12 = 61
            if (r11 == r1) goto L5c
            r13 = 2
            if (r11 == r13) goto L25
            goto L8c
        L25:
            byte[] r11 = r10.f
            int r1 = r10.g
            int r2 = r1 + 1
            r10.g = r2
            byte[] r3 = r10.a
            int r4 = r10.l
            int r5 = r4 >> 10
            r5 = r5 & 63
            r5 = r3[r5]
            r11[r1] = r5
            int r5 = r1 + 2
            r10.g = r5
            int r6 = r4 >> 4
            r6 = r6 & 63
            r6 = r3[r6]
            r11[r2] = r6
            int r2 = r1 + 3
            r10.g = r2
            int r13 = r4 << 2
            r13 = r13 & 63
            r13 = r3[r13]
            r11[r5] = r13
            byte[] r13 = org.apache.commons.net.util.a.r
            if (r3 != r13) goto L8c
            int r1 = r1 + 4
            r10.g = r1
            r11[r2] = r12
            goto L8c
        L5c:
            byte[] r11 = r10.f
            int r13 = r10.g
            int r1 = r13 + 1
            r10.g = r1
            byte[] r2 = r10.a
            int r3 = r10.l
            int r4 = r3 >> 2
            r4 = r4 & 63
            r4 = r2[r4]
            r11[r13] = r4
            int r4 = r13 + 2
            r10.g = r4
            int r3 = r3 << 4
            r3 = r3 & 63
            r3 = r2[r3]
            r11[r1] = r3
            byte[] r1 = org.apache.commons.net.util.a.r
            if (r2 != r1) goto L8c
            int r1 = r13 + 3
            r10.g = r1
            r11[r4] = r12
            int r13 = r13 + 4
            r10.g = r13
            r11[r1] = r12
        L8c:
            int r11 = r10.b
            if (r11 <= 0) goto L123
            int r11 = r10.g
            if (r11 <= 0) goto L123
            byte[] r12 = r10.c
            byte[] r13 = r10.f
            int r1 = r12.length
            java.lang.System.arraycopy(r12, r0, r13, r11, r1)
            int r11 = r10.g
            byte[] r12 = r10.c
            int r12 = r12.length
            int r11 = r11 + r12
            r10.g = r11
            return
        La5:
            r2 = 0
        La6:
            if (r2 >= r13) goto L123
            byte[] r3 = r10.f
            if (r3 == 0) goto Lb4
            int r3 = r3.length
            int r4 = r10.g
            int r3 = r3 - r4
            int r4 = r10.e
            if (r3 >= r4) goto Lb7
        Lb4:
            r10.I()
        Lb7:
            int r3 = r10.j
            int r3 = r3 + r1
            int r3 = r3 % 3
            r10.j = r3
            int r4 = r12 + 1
            r12 = r11[r12]
            if (r12 >= 0) goto Lc6
            int r12 = r12 + 256
        Lc6:
            int r5 = r10.l
            int r5 = r5 << 8
            int r5 = r5 + r12
            r10.l = r5
            if (r3 != 0) goto L11f
            byte[] r12 = r10.f
            int r3 = r10.g
            int r6 = r3 + 1
            r10.g = r6
            byte[] r7 = r10.a
            int r8 = r5 >> 18
            r8 = r8 & 63
            r8 = r7[r8]
            r12[r3] = r8
            int r8 = r3 + 2
            r10.g = r8
            int r9 = r5 >> 12
            r9 = r9 & 63
            r9 = r7[r9]
            r12[r6] = r9
            int r6 = r3 + 3
            r10.g = r6
            int r9 = r5 >> 6
            r9 = r9 & 63
            r9 = r7[r9]
            r12[r8] = r9
            int r3 = r3 + 4
            r10.g = r3
            r5 = r5 & 63
            r5 = r7[r5]
            r12[r6] = r5
            int r5 = r10.i
            int r5 = r5 + 4
            r10.i = r5
            int r6 = r10.b
            if (r6 <= 0) goto L11f
            if (r6 > r5) goto L11f
            byte[] r5 = r10.c
            int r6 = r5.length
            java.lang.System.arraycopy(r5, r0, r12, r3, r6)
            int r12 = r10.g
            byte[] r3 = r10.c
            int r3 = r3.length
            int r12 = r12 + r3
            r10.g = r12
            r10.i = r0
        L11f:
            int r2 = r2 + 1
            r12 = r4
            goto La6
        L123:
            return
    }

    public byte[] j(byte[] r5) {
            r4 = this;
            r4.H()
            if (r5 == 0) goto L38
            int r0 = r5.length
            if (r0 != 0) goto L9
            goto L38
        L9:
            int r0 = r4.b
            byte[] r1 = r4.c
            long r0 = x(r5, r0, r1)
            int r1 = (int) r0
            byte[] r0 = new byte[r1]
            r2 = 0
            r4.J(r0, r2, r1)
            int r3 = r5.length
            r4.i(r5, r2, r3)
            r3 = -1
            r4.i(r5, r2, r3)
            byte[] r5 = r4.f
            if (r5 == r0) goto L27
            r4.G(r0, r2, r1)
        L27:
            boolean r5 = r4.D()
            if (r5 == 0) goto L37
            int r5 = r4.g
            if (r5 >= r1) goto L37
            byte[] r1 = new byte[r5]
            java.lang.System.arraycopy(r0, r2, r1, r2, r5)
            return r1
        L37:
            return r0
        L38:
            return r5
    }

    public java.lang.String v(byte[] r1) {
            r0 = this;
            byte[] r1 = r0.j(r1)
            java.lang.String r1 = F(r1)
            return r1
    }

    int y() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    byte[] z() {
            r1 = this;
            byte[] r0 = r1.c
            java.lang.Object r0 = r0.clone()
            byte[] r0 = (byte[]) r0
            return r0
    }
}
