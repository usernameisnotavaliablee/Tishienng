package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class t0 extends com.huawei.hms.scankit.p.g5 {
    public static final int[] e = null;
    private final boolean a;
    private final boolean b;
    private final java.lang.StringBuilder c;
    private final int[] d;

    static {
            r0 = 43
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 168, 162, 138, 42} // fill-array
            com.huawei.hms.scankit.p.t0.e = r0
            return
    }

    public t0() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public t0(boolean r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public t0(boolean r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 20
            r1.<init>(r2)
            r0.c = r1
            r1 = 9
            int[] r1 = new int[r1]
            r0.d = r1
            return
    }

    private static char a(char r7, char r8) throws com.huawei.hms.scankit.p.a {
            r0 = 36
            r1 = 64
            r2 = 90
            r3 = 65
            if (r7 == r0) goto L83
            r0 = 37
            r4 = 79
            r5 = 43
            r6 = 0
            if (r7 == r0) goto L38
            if (r7 == r5) goto L2c
            r0 = 47
            if (r7 == r0) goto L1a
            return r6
        L1a:
            if (r8 < r3) goto L22
            if (r8 > r4) goto L22
            int r8 = r8 + (-32)
        L20:
            char r7 = (char) r8
            return r7
        L22:
            if (r8 != r2) goto L27
            r7 = 58
            return r7
        L27:
            com.huawei.hms.scankit.p.a r7 = com.huawei.hms.scankit.p.a.a()
            throw r7
        L2c:
            if (r8 < r3) goto L33
            if (r8 > r2) goto L33
            int r8 = r8 + 32
            goto L20
        L33:
            com.huawei.hms.scankit.p.a r7 = com.huawei.hms.scankit.p.a.a()
            throw r7
        L38:
            if (r8 < r3) goto L41
            r7 = 69
            if (r8 > r7) goto L41
            int r8 = r8 + (-38)
            goto L20
        L41:
            r7 = 70
            if (r8 < r7) goto L4c
            r7 = 74
            if (r8 > r7) goto L4c
            int r8 = r8 + (-11)
            goto L20
        L4c:
            r7 = 75
            if (r8 < r7) goto L55
            if (r8 > r4) goto L55
            int r8 = r8 + 16
            goto L20
        L55:
            r7 = 80
            if (r8 < r7) goto L5f
            r7 = 84
            if (r8 > r7) goto L5f
            int r8 = r8 + r5
            goto L20
        L5f:
            r7 = 85
            if (r8 != r7) goto L64
            return r6
        L64:
            r7 = 86
            if (r8 != r7) goto L69
            return r1
        L69:
            r7 = 87
            if (r8 != r7) goto L70
            r7 = 96
            return r7
        L70:
            r7 = 88
            if (r8 == r7) goto L80
            r7 = 89
            if (r8 == r7) goto L80
            if (r8 != r2) goto L7b
            goto L80
        L7b:
            com.huawei.hms.scankit.p.a r7 = com.huawei.hms.scankit.p.a.a()
            throw r7
        L80:
            r7 = 127(0x7f, float:1.78E-43)
            return r7
        L83:
            if (r8 < r3) goto L89
            if (r8 > r2) goto L89
            int r8 = r8 - r1
            goto L20
        L89:
            com.huawei.hms.scankit.p.a r7 = com.huawei.hms.scankit.p.a.a()
            throw r7
    }

    private static char a(int r3) throws com.huawei.hms.scankit.p.a {
            r0 = 0
        L1:
            int[] r1 = com.huawei.hms.scankit.p.t0.e
            int r2 = r1.length
            if (r0 >= r2) goto L14
            r1 = r1[r0]
            if (r1 != r3) goto L11
            java.lang.String r3 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%"
            char r3 = r3.charAt(r0)
            return r3
        L11:
            int r0 = r0 + 1
            goto L1
        L14:
            r0 = 148(0x94, float:2.07E-43)
            if (r3 != r0) goto L1b
            r3 = 42
            return r3
        L1b:
            com.huawei.hms.scankit.p.a r3 = com.huawei.hms.scankit.p.a.a()
            throw r3
    }

    private com.huawei.hms.scankit.p.s6 a(java.lang.StringBuilder r8, int[] r9, int r10, int r11, int r12) throws com.huawei.hms.scankit.p.a {
            r7 = this;
            boolean r0 = r7.a
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L34
            int r0 = r8.length()
            int r0 = r0 - r1
            r3 = 0
            r4 = 0
        Ld:
            java.lang.String r5 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%"
            if (r3 >= r0) goto L1f
            java.lang.StringBuilder r6 = r7.c
            char r6 = r6.charAt(r3)
            int r5 = r5.indexOf(r6)
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto Ld
        L1f:
            char r3 = r8.charAt(r0)
            int r4 = r4 % 43
            char r4 = r5.charAt(r4)
            if (r3 != r4) goto L2f
            r8.setLength(r0)
            goto L34
        L2f:
            com.huawei.hms.scankit.p.a r8 = com.huawei.hms.scankit.p.a.a()
            throw r8
        L34:
            int r0 = r8.length()
            if (r0 == 0) goto L67
            boolean r0 = r7.b
            if (r0 == 0) goto L43
            java.lang.String r8 = a(r8)
            goto L47
        L43:
            java.lang.String r8 = r8.toString()
        L47:
            r9 = r9[r2]
            float r9 = (float) r9
            int r10 = r10 + r11
            float r10 = (float) r10
            com.huawei.hms.scankit.p.s6 r11 = new com.huawei.hms.scankit.p.s6
            com.huawei.hms.scankit.p.u6 r0 = new com.huawei.hms.scankit.p.u6
            float r12 = (float) r12
            r0.<init>(r9, r12)
            com.huawei.hms.scankit.p.u6 r9 = new com.huawei.hms.scankit.p.u6
            r9.<init>(r10, r12)
            r10 = 2
            com.huawei.hms.scankit.p.u6[] r10 = new com.huawei.hms.scankit.p.u6[r10]
            r10[r2] = r0
            r10[r1] = r9
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r9 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.c
            r12 = 0
            r11.<init>(r8, r12, r10, r9)
            return r11
        L67:
            com.huawei.hms.scankit.p.a r8 = com.huawei.hms.scankit.p.a.a()
            throw r8
    }

    private static java.lang.String a(java.lang.CharSequence r5) throws com.huawei.hms.scankit.p.a {
            int r0 = r5.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = 0
        La:
            if (r2 >= r0) goto L35
            char r3 = r5.charAt(r2)
            r4 = 43
            if (r3 == r4) goto L25
            r4 = 36
            if (r3 == r4) goto L25
            r4 = 37
            if (r3 == r4) goto L25
            r4 = 47
            if (r3 != r4) goto L21
            goto L25
        L21:
            r1.append(r3)
            goto L32
        L25:
            int r2 = r2 + 1
            char r4 = r5.charAt(r2)
            char r3 = a(r3, r4)
            r1.append(r3)
        L32:
            int r2 = r2 + 1
            goto La
        L35:
            java.lang.String r5 = r1.toString()
            return r5
    }

    private static int[] a(com.huawei.hms.scankit.p.r r10, int[] r11) throws com.huawei.hms.scankit.p.a {
            int r0 = r10.e()
            r1 = 0
            int r2 = r10.c(r1)
            int r3 = r11.length
            r4 = r2
            r5 = 0
            r6 = 0
        Ld:
            if (r2 >= r0) goto L63
            boolean r7 = r10.b(r2)
            r8 = 1
            if (r7 == r5) goto L26
            if (r6 < 0) goto L21
            int r7 = r11.length
            if (r6 >= r7) goto L21
            r7 = r11[r6]
            int r7 = r7 + r8
            r11[r6] = r7
            goto L60
        L21:
            com.huawei.hms.scankit.p.a r10 = com.huawei.hms.scankit.p.a.a()
            throw r10
        L26:
            int r7 = r3 + (-1)
            if (r6 != r7) goto L5a
            int r7 = c(r11)
            r9 = 148(0x94, float:2.07E-43)
            if (r7 != r9) goto L47
            int r7 = r2 - r4
            int r7 = r7 / 5
            int r7 = r4 - r7
            int r7 = java.lang.Math.max(r1, r7)
            boolean r7 = r10.a(r7, r4, r1, r8)
            if (r7 == 0) goto L47
            int[] r10 = new int[]{r4, r2}
            return r10
        L47:
            r7 = r11[r1]
            r9 = r11[r8]
            int r7 = r7 + r9
            int r4 = r4 + r7
            int r7 = r6 + (-1)
            r9 = 2
            java.lang.System.arraycopy(r11, r9, r11, r1, r7)
            r11[r7] = r1
            r11[r6] = r1
            int r6 = r6 + (-1)
            goto L5c
        L5a:
            int r6 = r6 + 1
        L5c:
            r11[r6] = r8
            r5 = r5 ^ 1
        L60:
            int r2 = r2 + 1
            goto Ld
        L63:
            com.huawei.hms.scankit.p.a r10 = com.huawei.hms.scankit.p.a.a()
            throw r10
    }

    private static boolean b(int[] r6) {
            int r0 = r6.length
            r1 = 0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            r4 = 0
        L7:
            if (r3 >= r0) goto L14
            r5 = r6[r3]
            if (r5 >= r2) goto Le
            r2 = r5
        Le:
            if (r5 <= r4) goto L11
            r4 = r5
        L11:
            int r3 = r3 + 1
            goto L7
        L14:
            int r4 = r4 / r2
            r6 = 6
            if (r4 <= r6) goto L1a
            r6 = 1
            return r6
        L1a:
            return r1
    }

    private static int c(int[] r11) {
            int r0 = r11.length
            boolean r1 = b(r11)
            r2 = -1
            if (r1 == 0) goto L9
            return r2
        L9:
            r1 = 0
            r3 = 0
        Lb:
            int r4 = r11.length
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = 0
        L10:
            if (r6 >= r4) goto L1c
            r7 = r11[r6]
            if (r7 >= r5) goto L19
            if (r7 <= r3) goto L19
            r5 = r7
        L19:
            int r6 = r6 + 1
            goto L10
        L1c:
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
        L20:
            if (r3 >= r0) goto L33
            r8 = r11[r3]
            if (r8 <= r5) goto L30
            int r9 = r0 + (-1)
            int r9 = r9 - r3
            r10 = 1
            int r9 = r10 << r9
            r7 = r7 | r9
            int r4 = r4 + 1
            int r6 = r6 + r8
        L30:
            int r3 = r3 + 1
            goto L20
        L33:
            r3 = 3
            if (r4 != r3) goto L49
        L36:
            if (r1 >= r0) goto L48
            if (r4 <= 0) goto L48
            r3 = r11[r1]
            if (r3 <= r5) goto L45
            int r4 = r4 + (-1)
            int r3 = r3 * 2
            if (r3 < r6) goto L45
            return r2
        L45:
            int r1 = r1 + 1
            goto L36
        L48:
            return r7
        L49:
            if (r4 > r3) goto L4c
            return r2
        L4c:
            r3 = r5
            goto Lb
    }

    @Override // com.huawei.hms.scankit.p.g5
    public com.huawei.hms.scankit.p.s6 a(int r12, com.huawei.hms.scankit.p.r r13, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r14) throws com.huawei.hms.scankit.p.a {
            r11 = this;
            int[] r14 = r11.d
            r0 = 0
            java.util.Arrays.fill(r14, r0)
            java.lang.StringBuilder r2 = r11.c
            r2.setLength(r0)
            int[] r3 = a(r13, r14)
            r1 = 1
            r4 = r3[r1]
            int r4 = r13.c(r4)
            int r5 = r13.e()
        L1a:
            com.huawei.hms.scankit.p.g5.a(r13, r4, r14)
            int r6 = c(r14)
            if (r6 < 0) goto L68
            char r6 = a(r6)
            r2.append(r6)
            int r7 = r14.length
            r9 = r4
            r8 = 0
        L2d:
            if (r8 >= r7) goto L35
            r10 = r14[r8]
            int r9 = r9 + r10
            int r8 = r8 + 1
            goto L2d
        L35:
            int r7 = r13.c(r9)
            r8 = 42
            if (r6 != r8) goto L66
            int r13 = r2.length()
            int r13 = r13 - r1
            r2.setLength(r13)
            int r13 = r14.length
            r6 = r5
            r5 = 0
        L48:
            if (r0 >= r13) goto L50
            r1 = r14[r0]
            int r5 = r5 + r1
            int r0 = r0 + 1
            goto L48
        L50:
            int r13 = r7 - r4
            int r13 = r13 - r5
            if (r7 == r6) goto L59
            int r13 = r13 * 5
            if (r13 < r5) goto L5c
        L59:
            r1 = r11
            r6 = r12
            goto L61
        L5c:
            com.huawei.hms.scankit.p.a r12 = com.huawei.hms.scankit.p.a.a()
            throw r12
        L61:
            com.huawei.hms.scankit.p.s6 r12 = r1.a(r2, r3, r4, r5, r6)
            return r12
        L66:
            r4 = r7
            goto L1a
        L68:
            com.huawei.hms.scankit.p.a r12 = com.huawei.hms.scankit.p.a.a()
            throw r12
    }
}
