package cn.bluemobi.dylan.base.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class b {
    private static final int a = 128;

    /* renamed from: b, reason: collision with root package name */
    private static final int f102b = 64;

    /* renamed from: c, reason: collision with root package name */
    private static final int f103c = 24;

    /* renamed from: d, reason: collision with root package name */
    private static final int f104d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final int f105e = 16;

    /* renamed from: f, reason: collision with root package name */
    private static final int f106f = 4;

    /* renamed from: g, reason: collision with root package name */
    private static final int f107g = -128;

    /* renamed from: h, reason: collision with root package name */
    private static final char f108h = '=';

    /* renamed from: i, reason: collision with root package name */
    private static final boolean f109i = false;

    /* renamed from: j, reason: collision with root package name */
    private static final byte[] f110j = null;

    /* renamed from: k, reason: collision with root package name */
    private static final char[] f111k = null;

    static {
            r0 = 128(0x80, float:1.8E-43)
            byte[] r1 = new byte[r0]
            cn.bluemobi.dylan.base.utils.b.f110j = r1
            r1 = 64
            char[] r1 = new char[r1]
            cn.bluemobi.dylan.base.utils.b.f111k = r1
            r1 = 0
            r2 = 0
        Le:
            if (r2 >= r0) goto L18
            byte[] r3 = cn.bluemobi.dylan.base.utils.b.f110j
            r4 = -1
            r3[r2] = r4
            int r2 = r2 + 1
            goto Le
        L18:
            r0 = 90
        L1a:
            r2 = 65
            if (r0 < r2) goto L28
            byte[] r2 = cn.bluemobi.dylan.base.utils.b.f110j
            int r3 = r0 + (-65)
            byte r3 = (byte) r3
            r2[r0] = r3
            int r0 = r0 + (-1)
            goto L1a
        L28:
            r0 = 122(0x7a, float:1.71E-43)
        L2a:
            r2 = 97
            if (r0 < r2) goto L38
            byte[] r2 = cn.bluemobi.dylan.base.utils.b.f110j
            int r3 = r0 + (-71)
            byte r3 = (byte) r3
            r2[r0] = r3
            int r0 = r0 + (-1)
            goto L2a
        L38:
            r0 = 57
        L3a:
            r2 = 48
            if (r0 < r2) goto L48
            byte[] r2 = cn.bluemobi.dylan.base.utils.b.f110j
            int r3 = r0 + 4
            byte r3 = (byte) r3
            r2[r0] = r3
            int r0 = r0 + (-1)
            goto L3a
        L48:
            byte[] r0 = cn.bluemobi.dylan.base.utils.b.f110j
            r2 = 43
            r3 = 62
            r0[r2] = r3
            r4 = 47
            r5 = 63
            r0[r4] = r5
            r0 = 0
        L57:
            r6 = 25
            if (r0 > r6) goto L65
            char[] r6 = cn.bluemobi.dylan.base.utils.b.f111k
            int r7 = r0 + 65
            char r7 = (char) r7
            r6[r0] = r7
            int r0 = r0 + 1
            goto L57
        L65:
            r0 = 26
            r6 = 0
        L68:
            r7 = 51
            if (r0 > r7) goto L78
            char[] r7 = cn.bluemobi.dylan.base.utils.b.f111k
            int r8 = r6 + 97
            char r8 = (char) r8
            r7[r0] = r8
            int r0 = r0 + 1
            int r6 = r6 + 1
            goto L68
        L78:
            r0 = 52
        L7a:
            r6 = 61
            if (r0 > r6) goto L8a
            char[] r6 = cn.bluemobi.dylan.base.utils.b.f111k
            int r7 = r1 + 48
            char r7 = (char) r7
            r6[r0] = r7
            int r0 = r0 + 1
            int r1 = r1 + 1
            goto L7a
        L8a:
            char[] r0 = cn.bluemobi.dylan.base.utils.b.f111k
            r0[r3] = r2
            r0[r5] = r4
            return
    }

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] a(java.lang.String r13) {
            r0 = 0
            if (r13 != 0) goto L4
            return r0
        L4:
            char[] r13 = r13.toCharArray()
            int r1 = f(r13)
            int r2 = r1 % 4
            if (r2 == 0) goto L11
            return r0
        L11:
            int r1 = r1 / 4
            r2 = 0
            if (r1 != 0) goto L19
            byte[] r13 = new byte[r2]
            return r13
        L19:
            int r3 = r1 * 3
            byte[] r3 = new byte[r3]
            r4 = 0
            r5 = 0
            r6 = 0
        L20:
            int r7 = r1 + (-1)
            if (r4 >= r7) goto L7b
            int r7 = r5 + 1
            char r8 = r13[r5]
            boolean r9 = c(r8)
            if (r9 == 0) goto L7a
            int r9 = r5 + 2
            char r7 = r13[r7]
            boolean r10 = c(r7)
            if (r10 == 0) goto L7a
            int r10 = r5 + 3
            char r9 = r13[r9]
            boolean r11 = c(r9)
            if (r11 == 0) goto L7a
            int r5 = r5 + 4
            char r10 = r13[r10]
            boolean r11 = c(r10)
            if (r11 != 0) goto L4d
            goto L7a
        L4d:
            byte[] r11 = cn.bluemobi.dylan.base.utils.b.f110j
            r8 = r11[r8]
            r7 = r11[r7]
            r9 = r11[r9]
            r10 = r11[r10]
            int r11 = r6 + 1
            int r8 = r8 << 2
            int r12 = r7 >> 4
            r8 = r8 | r12
            byte r8 = (byte) r8
            r3[r6] = r8
            int r8 = r6 + 2
            r7 = r7 & 15
            int r7 = r7 << 4
            int r12 = r9 >> 2
            r12 = r12 & 15
            r7 = r7 | r12
            byte r7 = (byte) r7
            r3[r11] = r7
            int r6 = r6 + 3
            int r7 = r9 << 6
            r7 = r7 | r10
            byte r7 = (byte) r7
            r3[r8] = r7
            int r4 = r4 + 1
            goto L20
        L7a:
            return r0
        L7b:
            int r1 = r5 + 1
            char r7 = r13[r5]
            boolean r8 = c(r7)
            if (r8 == 0) goto L122
            int r8 = r5 + 2
            char r1 = r13[r1]
            boolean r9 = c(r1)
            if (r9 != 0) goto L91
            goto L122
        L91:
            byte[] r9 = cn.bluemobi.dylan.base.utils.b.f110j
            r7 = r9[r7]
            r1 = r9[r1]
            int r5 = r5 + 3
            char r8 = r13[r8]
            char r13 = r13[r5]
            boolean r5 = c(r8)
            if (r5 == 0) goto Lcd
            boolean r5 = c(r13)
            if (r5 != 0) goto Laa
            goto Lcd
        Laa:
            r0 = r9[r8]
            r13 = r9[r13]
            int r2 = r6 + 1
            int r4 = r7 << 2
            int r5 = r1 >> 4
            r4 = r4 | r5
            byte r4 = (byte) r4
            r3[r6] = r4
            int r6 = r6 + 2
            r1 = r1 & 15
            int r1 = r1 << 4
            int r4 = r0 >> 2
            r4 = r4 & 15
            r1 = r1 | r4
            byte r1 = (byte) r1
            r3[r2] = r1
            int r0 = r0 << 6
            r13 = r13 | r0
            byte r13 = (byte) r13
            r3[r6] = r13
            return r3
        Lcd:
            boolean r5 = d(r8)
            if (r5 == 0) goto Lf0
            boolean r5 = d(r13)
            if (r5 == 0) goto Lf0
            r13 = r1 & 15
            if (r13 == 0) goto Lde
            return r0
        Lde:
            int r4 = r4 * 3
            int r13 = r4 + 1
            byte[] r13 = new byte[r13]
            java.lang.System.arraycopy(r3, r2, r13, r2, r4)
            int r0 = r7 << 2
            int r1 = r1 >> 4
            r0 = r0 | r1
            byte r0 = (byte) r0
            r13[r6] = r0
            return r13
        Lf0:
            boolean r5 = d(r8)
            if (r5 != 0) goto L122
            boolean r13 = d(r13)
            if (r13 == 0) goto L122
            r13 = r9[r8]
            r5 = r13 & 3
            if (r5 == 0) goto L103
            return r0
        L103:
            int r4 = r4 * 3
            int r0 = r4 + 2
            byte[] r0 = new byte[r0]
            java.lang.System.arraycopy(r3, r2, r0, r2, r4)
            int r2 = r6 + 1
            int r3 = r7 << 2
            int r4 = r1 >> 4
            r3 = r3 | r4
            byte r3 = (byte) r3
            r0[r6] = r3
            r1 = r1 & 15
            int r1 = r1 << 4
            int r13 = r13 >> 2
            r13 = r13 & 15
            r13 = r13 | r1
            byte r13 = (byte) r13
            r0[r2] = r13
        L122:
            return r0
    }

    public static java.lang.String b(byte[] r15) {
            if (r15 != 0) goto L4
            r15 = 0
            return r15
        L4:
            int r0 = r15.length
            r1 = 8
            int r0 = r0 * 8
            if (r0 != 0) goto Le
            java.lang.String r15 = ""
            return r15
        Le:
            int r2 = r0 % 24
            int r0 = r0 / 24
            if (r2 == 0) goto L17
            int r3 = r0 + 1
            goto L18
        L17:
            r3 = r0
        L18:
            int r3 = r3 * 4
            char[] r3 = new char[r3]
            r4 = 0
            r5 = 0
            r6 = 0
        L1f:
            if (r4 >= r0) goto L7b
            int r7 = r5 + 1
            r8 = r15[r5]
            int r9 = r5 + 2
            r7 = r15[r7]
            int r5 = r5 + 3
            r9 = r15[r9]
            r10 = r7 & 15
            byte r10 = (byte) r10
            r11 = r8 & 3
            byte r11 = (byte) r11
            r12 = r8 & (-128(0xffffffffffffff80, float:NaN))
            int r8 = r8 >> 2
            if (r12 != 0) goto L3b
        L39:
            byte r8 = (byte) r8
            goto L3e
        L3b:
            r8 = r8 ^ 192(0xc0, float:2.69E-43)
            goto L39
        L3e:
            r12 = r7 & (-128(0xffffffffffffff80, float:NaN))
            int r7 = r7 >> 4
            if (r12 != 0) goto L46
        L44:
            byte r7 = (byte) r7
            goto L49
        L46:
            r7 = r7 ^ 240(0xf0, float:3.36E-43)
            goto L44
        L49:
            r12 = r9 & (-128(0xffffffffffffff80, float:NaN))
            if (r12 != 0) goto L51
            int r12 = r9 >> 6
        L4f:
            byte r12 = (byte) r12
            goto L56
        L51:
            int r12 = r9 >> 6
            r12 = r12 ^ 252(0xfc, float:3.53E-43)
            goto L4f
        L56:
            int r13 = r6 + 1
            char[] r14 = cn.bluemobi.dylan.base.utils.b.f111k
            char r8 = r14[r8]
            r3[r6] = r8
            int r8 = r6 + 2
            int r11 = r11 << 4
            r7 = r7 | r11
            char r7 = r14[r7]
            r3[r13] = r7
            int r7 = r6 + 3
            int r10 = r10 << 2
            r10 = r10 | r12
            char r10 = r14[r10]
            r3[r8] = r10
            int r6 = r6 + 4
            r8 = r9 & 63
            char r8 = r14[r8]
            r3[r7] = r8
            int r4 = r4 + 1
            goto L1f
        L7b:
            r0 = 61
            if (r2 != r1) goto La6
            r15 = r15[r5]
            r1 = r15 & 3
            byte r1 = (byte) r1
            r2 = r15 & (-128(0xffffffffffffff80, float:NaN))
            int r15 = r15 >> 2
            if (r2 != 0) goto L8c
        L8a:
            byte r15 = (byte) r15
            goto L8f
        L8c:
            r15 = r15 ^ 192(0xc0, float:2.69E-43)
            goto L8a
        L8f:
            int r2 = r6 + 1
            char[] r4 = cn.bluemobi.dylan.base.utils.b.f111k
            char r15 = r4[r15]
            r3[r6] = r15
            int r15 = r6 + 2
            int r1 = r1 << 4
            char r1 = r4[r1]
            r3[r2] = r1
            int r6 = r6 + 3
            r3[r15] = r0
            r3[r6] = r0
            goto Le7
        La6:
            r1 = 16
            if (r2 != r1) goto Le7
            r1 = r15[r5]
            int r5 = r5 + 1
            r15 = r15[r5]
            r2 = r15 & 15
            byte r2 = (byte) r2
            r4 = r1 & 3
            byte r4 = (byte) r4
            r5 = r1 & (-128(0xffffffffffffff80, float:NaN))
            int r1 = r1 >> 2
            if (r5 != 0) goto Lbe
        Lbc:
            byte r1 = (byte) r1
            goto Lc1
        Lbe:
            r1 = r1 ^ 192(0xc0, float:2.69E-43)
            goto Lbc
        Lc1:
            r5 = r15 & (-128(0xffffffffffffff80, float:NaN))
            int r15 = r15 >> 4
            if (r5 != 0) goto Lc9
        Lc7:
            byte r15 = (byte) r15
            goto Lcc
        Lc9:
            r15 = r15 ^ 240(0xf0, float:3.36E-43)
            goto Lc7
        Lcc:
            int r5 = r6 + 1
            char[] r7 = cn.bluemobi.dylan.base.utils.b.f111k
            char r1 = r7[r1]
            r3[r6] = r1
            int r1 = r6 + 2
            int r4 = r4 << 4
            r15 = r15 | r4
            char r15 = r7[r15]
            r3[r5] = r15
            int r6 = r6 + 3
            int r15 = r2 << 2
            char r15 = r7[r15]
            r3[r1] = r15
            r3[r6] = r0
        Le7:
            java.lang.String r15 = new java.lang.String
            r15.<init>(r3)
            return r15
    }

    private static boolean c(char r1) {
            r0 = 128(0x80, float:1.8E-43)
            if (r1 >= r0) goto Ld
            byte[] r0 = cn.bluemobi.dylan.base.utils.b.f110j
            r1 = r0[r1]
            r0 = -1
            if (r1 == r0) goto Ld
            r1 = 1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    private static boolean d(char r1) {
            r0 = 61
            if (r1 != r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    private static boolean e(char r1) {
            r0 = 32
            if (r1 == r0) goto L13
            r0 = 13
            if (r1 == r0) goto L13
            r0 = 10
            if (r1 == r0) goto L13
            r0 = 9
            if (r1 != r0) goto L11
            goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    private static int f(char[] r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r5.length
            r2 = 0
        L6:
            if (r0 >= r1) goto L1a
            char r3 = r5[r0]
            boolean r3 = e(r3)
            if (r3 != 0) goto L17
            int r3 = r2 + 1
            char r4 = r5[r0]
            r5[r2] = r4
            r2 = r3
        L17:
            int r0 = r0 + 1
            goto L6
        L1a:
            return r2
    }
}
