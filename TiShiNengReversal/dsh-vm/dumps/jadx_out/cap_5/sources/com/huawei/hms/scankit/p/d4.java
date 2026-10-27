package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d4 {
    public d4() {
            r1 = this;
            r1.<init>()
            return
    }

    private static char a(char r0, int r1) {
            int r1 = r1 * 149
            int r1 = r1 % 253
            int r1 = r1 + 1
            int r0 = r0 + r1
            r1 = 254(0xfe, float:3.56E-43)
            if (r0 > r1) goto Lc
            goto Le
        Lc:
            int r0 = r0 + (-254)
        Le:
            char r0 = (char) r0
            return r0
    }

    public static int a(java.lang.CharSequence r4, int r5) {
            int r0 = r4.length()
            r1 = 0
            if (r5 >= r0) goto L1e
            char r2 = r4.charAt(r5)
        Lb:
            boolean r3 = b(r2)
            if (r3 == 0) goto L1e
            if (r5 >= r0) goto L1e
            int r1 = r1 + 1
            int r5 = r5 + 1
            if (r5 >= r0) goto Lb
            char r2 = r4.charAt(r5)
            goto Lb
        L1e:
            return r1
    }

    static int a(java.lang.CharSequence r20, int r21, int r22) {
            r0 = r20
            r1 = r21
            int r2 = r0.length()
            if (r1 < r2) goto Lb
            return r22
        Lb:
            r2 = 0
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 6
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 5
            r7 = 2
            r8 = 0
            r9 = 4
            r10 = 3
            r11 = 1
            if (r22 != 0) goto L2a
            float[] r12 = new float[r4]
            r12[r8] = r2
            r12[r11] = r5
            r12[r7] = r5
            r12[r10] = r5
            r12[r9] = r5
            r2 = 1067450368(0x3fa00000, float:1.25)
            r12[r6] = r2
            goto L3c
        L2a:
            float[] r12 = new float[r4]
            r12[r8] = r5
            r12[r11] = r3
            r12[r7] = r3
            r12[r10] = r3
            r12[r9] = r3
            r13 = 1074790400(0x40100000, float:2.25)
            r12[r6] = r13
            r12[r22] = r2
        L3c:
            r2 = 0
        L3d:
            int r13 = r1 + r2
            int r14 = r0.length()
            r15 = 2147483647(0x7fffffff, float:NaN)
            if (r13 != r14) goto L94
            byte[] r0 = new byte[r4]
            int[] r1 = new int[r4]
            int r2 = a(r12, r1, r15, r0)
            int r3 = a(r0)
            boolean r4 = com.huawei.hms.scankit.p.w7.a(r1, r8)
            if (r4 == 0) goto L5f
            r1 = r1[r8]
            if (r1 != r2) goto L5f
            return r8
        L5f:
            if (r3 != r11) goto L6c
            boolean r1 = com.huawei.hms.scankit.p.w7.a(r0, r6)
            if (r1 == 0) goto L6c
            r1 = r0[r6]
            if (r1 <= 0) goto L6c
            return r6
        L6c:
            if (r3 != r11) goto L79
            boolean r1 = com.huawei.hms.scankit.p.w7.a(r0, r9)
            if (r1 == 0) goto L79
            r1 = r0[r9]
            if (r1 <= 0) goto L79
            return r9
        L79:
            if (r3 != r11) goto L86
            boolean r1 = com.huawei.hms.scankit.p.w7.a(r0, r7)
            if (r1 == 0) goto L86
            r1 = r0[r7]
            if (r1 <= 0) goto L86
            return r7
        L86:
            if (r3 != r11) goto L93
            boolean r1 = com.huawei.hms.scankit.p.w7.a(r0, r10)
            if (r1 == 0) goto L93
            r0 = r0[r10]
            if (r0 <= 0) goto L93
            return r10
        L93:
            return r11
        L94:
            char r13 = r0.charAt(r13)
            int r2 = r2 + 1
            boolean r14 = b(r13)
            if (r14 == 0) goto Lab
            r14 = r12[r8]
            r16 = 1056964608(0x3f000000, float:0.5)
            float r14 = r14 + r16
            r12[r8] = r14
            r16 = 1073741824(0x40000000, float:2.0)
            goto Ld1
        Lab:
            boolean r14 = c(r13)
            if (r14 == 0) goto Lc2
            r14 = r12[r8]
            r16 = 1073741824(0x40000000, float:2.0)
            double r3 = (double) r14
            double r3 = java.lang.Math.ceil(r3)
            float r3 = (float) r3
            r12[r8] = r3
            float r3 = r3 + r16
            r12[r8] = r3
            goto Ld1
        Lc2:
            r16 = 1073741824(0x40000000, float:2.0)
            r3 = r12[r8]
            double r3 = (double) r3
            double r3 = java.lang.Math.ceil(r3)
            float r3 = (float) r3
            r12[r8] = r3
            float r3 = r3 + r5
            r12[r8] = r3
        Ld1:
            int r3 = r12.length
            r4 = 1068149419(0x3faaaaab, float:1.3333334)
            r14 = 1076538027(0x402aaaab, float:2.6666667)
            r17 = 1059760811(0x3f2aaaab, float:0.6666667)
            if (r11 >= r3) goto Lfb
            boolean r3 = d(r13)
            if (r3 == 0) goto Lea
            r3 = r12[r11]
            float r3 = r3 + r17
            r12[r11] = r3
            goto Lfb
        Lea:
            boolean r3 = c(r13)
            if (r3 == 0) goto Lf6
            r3 = r12[r11]
            float r3 = r3 + r14
            r12[r11] = r3
            goto Lfb
        Lf6:
            r3 = r12[r11]
            float r3 = r3 + r4
            r12[r11] = r3
        Lfb:
            int r3 = r12.length
            if (r7 >= r3) goto L11c
            boolean r3 = f(r13)
            if (r3 == 0) goto L10b
            r3 = r12[r7]
            float r3 = r3 + r17
            r12[r7] = r3
            goto L11c
        L10b:
            boolean r3 = c(r13)
            if (r3 == 0) goto L117
            r3 = r12[r7]
            float r3 = r3 + r14
            r12[r7] = r3
            goto L11c
        L117:
            r3 = r12[r7]
            float r3 = r3 + r4
            r12[r7] = r3
        L11c:
            int r3 = r12.length
            if (r10 >= r3) goto L143
            boolean r3 = g(r13)
            if (r3 == 0) goto L12c
            r3 = r12[r10]
            float r3 = r3 + r17
            r12[r10] = r3
            goto L143
        L12c:
            boolean r3 = c(r13)
            if (r3 == 0) goto L13b
            r3 = r12[r10]
            r4 = 1082829483(0x408aaaab, float:4.3333335)
            float r3 = r3 + r4
            r12[r10] = r3
            goto L143
        L13b:
            r3 = r12[r10]
            r4 = 1079334229(0x40555555, float:3.3333333)
            float r3 = r3 + r4
            r12[r10] = r3
        L143:
            int r3 = r12.length
            if (r9 >= r3) goto L169
            boolean r3 = e(r13)
            if (r3 == 0) goto L154
            r3 = r12[r9]
            r4 = 1061158912(0x3f400000, float:0.75)
            float r3 = r3 + r4
            r12[r9] = r3
            goto L169
        L154:
            boolean r3 = c(r13)
            if (r3 == 0) goto L162
            r3 = r12[r9]
            r4 = 1082654720(0x40880000, float:4.25)
            float r3 = r3 + r4
            r12[r9] = r3
            goto L169
        L162:
            r3 = r12[r9]
            r4 = 1078984704(0x40500000, float:3.25)
            float r3 = r3 + r4
            r12[r9] = r3
        L169:
            int r3 = r12.length
            if (r6 >= r3) goto L17f
            boolean r3 = h(r13)
            if (r3 == 0) goto L17a
            r3 = r12[r6]
            r4 = 1082130432(0x40800000, float:4.0)
            float r3 = r3 + r4
            r12[r6] = r3
            goto L17f
        L17a:
            r3 = r12[r6]
            float r3 = r3 + r5
            r12[r6] = r3
        L17f:
            if (r2 < r9) goto L201
            r3 = 6
            int[] r4 = new int[r3]
            byte[] r13 = new byte[r3]
            a(r12, r4, r15, r13)
            int r14 = a(r13)
            r15 = r4[r8]
            r3 = r4[r6]
            if (r15 >= r3) goto L1a4
            r5 = r4[r11]
            if (r15 >= r5) goto L1a4
            r5 = r4[r7]
            if (r15 >= r5) goto L1a4
            r5 = r4[r10]
            if (r15 >= r5) goto L1a4
            r5 = r4[r9]
            if (r15 >= r5) goto L1a4
            return r8
        L1a4:
            if (r3 < r15) goto L200
            r5 = r13[r11]
            r18 = r13[r7]
            int r5 = r5 + r18
            r19 = r13[r10]
            int r5 = r5 + r19
            r13 = r13[r9]
            int r5 = r5 + r13
            if (r5 != 0) goto L1b6
            goto L200
        L1b6:
            if (r14 != r11) goto L1bb
            if (r13 <= 0) goto L1bb
            return r9
        L1bb:
            if (r14 != r11) goto L1c0
            if (r18 <= 0) goto L1c0
            return r7
        L1c0:
            if (r14 != r11) goto L1c5
            if (r19 <= 0) goto L1c5
            return r10
        L1c5:
            r5 = r4[r11]
            int r13 = r5 + 1
            if (r13 >= r15) goto L201
            int r13 = r5 + 1
            if (r13 >= r3) goto L201
            int r3 = r5 + 1
            r13 = r4[r9]
            if (r3 >= r13) goto L201
            int r3 = r5 + 1
            r13 = r4[r7]
            if (r3 >= r13) goto L201
            r3 = r4[r10]
            if (r5 >= r3) goto L1e0
            return r11
        L1e0:
            if (r5 != r3) goto L201
            int r1 = r1 + r2
            int r1 = r1 + r11
        L1e4:
            int r2 = r0.length()
            if (r1 >= r2) goto L1ff
            char r2 = r0.charAt(r1)
            boolean r3 = i(r2)
            if (r3 == 0) goto L1f5
            return r10
        L1f5:
            boolean r2 = g(r2)
            if (r2 != 0) goto L1fc
            goto L1ff
        L1fc:
            int r1 = r1 + 1
            goto L1e4
        L1ff:
            return r11
        L200:
            return r6
        L201:
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 6
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L3d
    }

    private static int a(byte[] r3) {
            r0 = 0
            r1 = 0
        L2:
            r2 = 6
            if (r0 >= r2) goto Lb
            r2 = r3[r0]
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L2
        Lb:
            return r1
    }

    private static int a(float[] r4, int[] r5, int r6, byte[] r7) {
            r0 = 0
            java.util.Arrays.fill(r7, r0)
            r1 = 0
        L5:
            r2 = 6
            if (r1 >= r2) goto L24
            r2 = r4[r1]
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r5[r1] = r2
            if (r6 <= r2) goto L18
            java.util.Arrays.fill(r7, r0)
            r6 = r2
        L18:
            if (r6 != r2) goto L21
            r2 = r7[r1]
            int r2 = r2 + 1
            byte r2 = (byte) r2
            r7[r1] = r2
        L21:
            int r1 = r1 + 1
            goto L5
        L24:
            return r6
    }

    public static java.lang.String a(java.lang.String r9, com.huawei.hms.scankit.p.e7 r10, com.huawei.hms.scankit.p.l2 r11, com.huawei.hms.scankit.p.l2 r12) {
            com.huawei.hms.scankit.p.b r0 = new com.huawei.hms.scankit.p.b
            r0.<init>()
            com.huawei.hms.scankit.p.d0 r1 = new com.huawei.hms.scankit.p.d0
            r1.<init>()
            com.huawei.hms.scankit.p.g7 r2 = new com.huawei.hms.scankit.p.g7
            r2.<init>()
            com.huawei.hms.scankit.p.n8 r3 = new com.huawei.hms.scankit.p.n8
            r3.<init>()
            com.huawei.hms.scankit.p.s2 r4 = new com.huawei.hms.scankit.p.s2
            r4.<init>()
            com.huawei.hms.scankit.p.n r5 = new com.huawei.hms.scankit.p.n
            r5.<init>()
            r6 = 6
            com.huawei.hms.scankit.p.v2[] r7 = new com.huawei.hms.scankit.p.v2[r6]
            r8 = 0
            r7[r8] = r0
            r0 = 1
            r7[r0] = r1
            r1 = 2
            r7[r1] = r2
            r2 = 3
            r7[r2] = r3
            r2 = 4
            r7[r2] = r4
            r3 = 5
            r7[r3] = r5
            com.huawei.hms.scankit.p.y2 r4 = new com.huawei.hms.scankit.p.y2
            r4.<init>(r9)
            r4.a(r10)
            r4.a(r11, r12)
            java.lang.String r10 = "[)>\u001e05\u001d"
            boolean r10 = r9.startsWith(r10)
            java.lang.String r11 = "\u001e\u0004"
            if (r10 == 0) goto L5d
            boolean r10 = r9.endsWith(r11)
            if (r10 == 0) goto L5d
            r9 = 236(0xec, float:3.31E-43)
            r4.a(r9)
            r4.a(r1)
            int r9 = r4.f
            int r9 = r9 + 7
            r4.f = r9
            goto L79
        L5d:
            java.lang.String r10 = "[)>\u001e06\u001d"
            boolean r10 = r9.startsWith(r10)
            if (r10 == 0) goto L79
            boolean r9 = r9.endsWith(r11)
            if (r9 == 0) goto L79
            r9 = 237(0xed, float:3.32E-43)
            r4.a(r9)
            r4.a(r1)
            int r9 = r4.f
            int r9 = r9 + 7
            r4.f = r9
        L79:
            boolean r9 = r4.i()
            if (r9 == 0) goto L96
            if (r8 < 0) goto L88
            if (r8 >= r6) goto L88
            r9 = r7[r8]
            r9.a(r4)
        L88:
            int r9 = r4.e()
            if (r9 < 0) goto L79
            int r8 = r4.e()
            r4.j()
            goto L79
        L96:
            int r9 = r4.a()
            r4.l()
            com.huawei.hms.scankit.p.d7 r10 = r4.g()
            int r10 = r10.a()
            if (r9 >= r10) goto Lb2
            if (r8 == 0) goto Lb2
            if (r8 == r3) goto Lb2
            if (r8 == r2) goto Lb2
            r9 = 254(0xfe, float:3.56E-43)
            r4.a(r9)
        Lb2:
            java.lang.StringBuilder r9 = r4.b()
            int r11 = r9.length()
            r12 = 129(0x81, float:1.81E-43)
            if (r11 >= r10) goto Lc1
            r9.append(r12)
        Lc1:
            int r11 = r9.length()
            if (r11 >= r10) goto Ld4
            int r11 = r9.length()
            int r11 = r11 + r0
            char r11 = a(r12, r11)
            r9.append(r11)
            goto Lc1
        Ld4:
            java.lang.StringBuilder r9 = r4.b()
            java.lang.String r9 = r9.toString()
            return r9
    }

    static void a(char r5) {
            java.lang.String r0 = java.lang.Integer.toHexString(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r0.length()
            int r2 = 4 - r2
            java.lang.String r3 = "0000"
            r4 = 0
            java.lang.String r2 = r3.substring(r4, r2)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Illegal character: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = " (0x"
            r2.append(r5)
            r2.append(r0)
            r5 = 41
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
    }

    static boolean b(char r1) {
            r0 = 48
            if (r1 < r0) goto La
            r0 = 57
            if (r1 > r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    static boolean c(char r1) {
            r0 = 128(0x80, float:1.8E-43)
            if (r1 < r0) goto La
            r0 = 255(0xff, float:3.57E-43)
            if (r1 > r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    private static boolean d(char r1) {
            r0 = 32
            if (r1 == r0) goto L17
            r0 = 48
            if (r1 < r0) goto Lc
            r0 = 57
            if (r1 <= r0) goto L17
        Lc:
            r0 = 65
            if (r1 < r0) goto L15
            r0 = 90
            if (r1 > r0) goto L15
            goto L17
        L15:
            r1 = 0
            return r1
        L17:
            r1 = 1
            return r1
    }

    private static boolean e(char r1) {
            r0 = 32
            if (r1 < r0) goto La
            r0 = 94
            if (r1 > r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    private static boolean f(char r1) {
            r0 = 32
            if (r1 == r0) goto L17
            r0 = 48
            if (r1 < r0) goto Lc
            r0 = 57
            if (r1 <= r0) goto L17
        Lc:
            r0 = 97
            if (r1 < r0) goto L15
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 > r0) goto L15
            goto L17
        L15:
            r1 = 0
            return r1
        L17:
            r1 = 1
            return r1
    }

    private static boolean g(char r1) {
            boolean r0 = i(r1)
            if (r0 != 0) goto L1d
            r0 = 32
            if (r1 == r0) goto L1d
            r0 = 48
            if (r1 < r0) goto L12
            r0 = 57
            if (r1 <= r0) goto L1d
        L12:
            r0 = 65
            if (r1 < r0) goto L1b
            r0 = 90
            if (r1 > r0) goto L1b
            goto L1d
        L1b:
            r1 = 0
            return r1
        L1d:
            r1 = 1
            return r1
    }

    private static boolean h(char r0) {
            r0 = 0
            return r0
    }

    private static boolean i(char r1) {
            r0 = 13
            if (r1 == r0) goto Lf
            r0 = 42
            if (r1 == r0) goto Lf
            r0 = 62
            if (r1 != r0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }
}
