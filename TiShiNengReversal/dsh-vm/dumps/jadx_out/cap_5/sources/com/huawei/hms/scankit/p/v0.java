package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class v0 extends com.huawei.hms.scankit.p.g5 {
    private static final char[] c = null;
    public static final int[] d = null;
    private static final int e = 0;
    private final java.lang.StringBuilder a;
    private final int[] b;

    static {
            java.lang.String r0 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*"
            char[] r0 = r0.toCharArray()
            com.huawei.hms.scankit.p.v0.c = r0
            r0 = 48
            int[] r0 = new int[r0]
            r0 = {x0018: FILL_ARRAY_DATA , data: [276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350} // fill-array
            com.huawei.hms.scankit.p.v0.d = r0
            r1 = 47
            r0 = r0[r1]
            com.huawei.hms.scankit.p.v0.e = r0
            return
    }

    public v0() {
            r2 = this;
            r2.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 20
            r0.<init>(r1)
            r2.a = r0
            r0 = 6
            int[] r0 = new int[r0]
            r2.b = r0
            return
    }

    private static char a(char r3, char r4) throws com.huawei.hms.scankit.p.a {
            r0 = 79
            r1 = 90
            r2 = 65
            switch(r3) {
                case 97: goto L5f;
                case 98: goto L29;
                case 99: goto L18;
                case 100: goto Lb;
                default: goto L9;
            }
        L9:
            r3 = 0
            return r3
        Lb:
            if (r4 < r2) goto L13
            if (r4 > r1) goto L13
            int r4 = r4 + 32
        L11:
            char r3 = (char) r4
            return r3
        L13:
            com.huawei.hms.scankit.p.a r3 = com.huawei.hms.scankit.p.a.a()
            throw r3
        L18:
            if (r4 < r2) goto L1f
            if (r4 > r0) goto L1f
            int r4 = r4 + (-32)
            goto L11
        L1f:
            if (r4 != r1) goto L24
            r3 = 58
            return r3
        L24:
            com.huawei.hms.scankit.p.a r3 = com.huawei.hms.scankit.p.a.a()
            throw r3
        L29:
            if (r4 < r2) goto L32
            r3 = 69
            if (r4 > r3) goto L32
            int r4 = r4 + (-38)
            goto L11
        L32:
            r3 = 70
            if (r4 < r3) goto L3d
            r3 = 74
            if (r4 > r3) goto L3d
            int r4 = r4 + (-11)
            goto L11
        L3d:
            r3 = 75
            if (r4 < r3) goto L46
            if (r4 > r0) goto L46
            int r4 = r4 + 16
            goto L11
        L46:
            r3 = 80
            if (r4 < r3) goto L51
            r3 = 83
            if (r4 > r3) goto L51
            int r4 = r4 + 43
            goto L11
        L51:
            r3 = 84
            if (r4 < r3) goto L5a
            if (r4 > r1) goto L5a
            r3 = 127(0x7f, float:1.78E-43)
            return r3
        L5a:
            com.huawei.hms.scankit.p.a r3 = com.huawei.hms.scankit.p.a.a()
            throw r3
        L5f:
            if (r4 < r2) goto L66
            if (r4 > r1) goto L66
            int r4 = r4 + (-64)
            goto L11
        L66:
            com.huawei.hms.scankit.p.a r3 = com.huawei.hms.scankit.p.a.a()
            throw r3
    }

    private static char a(int r3) throws com.huawei.hms.scankit.p.a {
            r0 = 0
        L1:
            int[] r1 = com.huawei.hms.scankit.p.v0.d
            int r2 = r1.length
            if (r0 >= r2) goto L12
            r1 = r1[r0]
            if (r1 != r3) goto Lf
            char[] r3 = com.huawei.hms.scankit.p.v0.c
            char r3 = r3[r0]
            return r3
        Lf:
            int r0 = r0 + 1
            goto L1
        L12:
            com.huawei.hms.scankit.p.a r3 = com.huawei.hms.scankit.p.a.a()
            throw r3
    }

    private static void a(java.lang.CharSequence r3) throws com.huawei.hms.scankit.p.a {
            int r0 = r3.length()
            int r1 = r0 + (-2)
            r2 = 20
            a(r3, r1, r2)
            int r0 = r0 + (-1)
            r1 = 15
            a(r3, r0, r1)
            return
    }

    private static void a(java.lang.CharSequence r6, int r7, int r8) throws com.huawei.hms.scankit.p.a {
            int r0 = r7 + (-1)
            r1 = 1
            r2 = 0
            r3 = 1
        L5:
            if (r0 < 0) goto L1b
            char r4 = r6.charAt(r0)
            java.lang.String r5 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*"
            int r4 = r5.indexOf(r4)
            int r4 = r4 * r3
            int r2 = r2 + r4
            int r3 = r3 + r1
            if (r3 <= r8) goto L18
            r3 = 1
        L18:
            int r0 = r0 + (-1)
            goto L5
        L1b:
            char r6 = r6.charAt(r7)
            char[] r7 = com.huawei.hms.scankit.p.v0.c
            int r2 = r2 % 47
            char r7 = r7[r2]
            if (r6 != r7) goto L28
            return
        L28:
            com.huawei.hms.scankit.p.a r6 = com.huawei.hms.scankit.p.a.a()
            throw r6
    }

    private int[] a(com.huawei.hms.scankit.p.r r12) throws com.huawei.hms.scankit.p.a {
            r11 = this;
            int r0 = r12.e()
            r1 = 0
            int r2 = r12.c(r1)
            int[] r3 = r11.b
            java.util.Arrays.fill(r3, r1)
            int[] r3 = r11.b
            int r4 = r3.length
            r5 = r2
            r6 = 0
            r7 = 0
        L14:
            if (r2 >= r0) goto L5a
            boolean r8 = r12.b(r2)
            r9 = 1
            if (r8 == r6) goto L2d
            if (r7 < 0) goto L28
            int r8 = r3.length
            if (r7 >= r8) goto L28
            r8 = r3[r7]
            int r8 = r8 + r9
            r3[r7] = r8
            goto L57
        L28:
            com.huawei.hms.scankit.p.a r12 = com.huawei.hms.scankit.p.a.a()
            throw r12
        L2d:
            int r8 = r4 + (-1)
            if (r7 != r8) goto L51
            int r8 = b(r3)
            int r10 = com.huawei.hms.scankit.p.v0.e
            if (r8 != r10) goto L3e
            int[] r12 = new int[]{r5, r2}
            return r12
        L3e:
            r8 = r3[r1]
            r10 = r3[r9]
            int r8 = r8 + r10
            int r5 = r5 + r8
            int r8 = r7 + (-1)
            r10 = 2
            java.lang.System.arraycopy(r3, r10, r3, r1, r8)
            r3[r8] = r1
            r3[r7] = r1
            int r7 = r7 + (-1)
            goto L53
        L51:
            int r7 = r7 + 1
        L53:
            r3[r7] = r9
            r6 = r6 ^ 1
        L57:
            int r2 = r2 + 1
            goto L14
        L5a:
            com.huawei.hms.scankit.p.a r12 = com.huawei.hms.scankit.p.a.a()
            throw r12
    }

    private static int b(int[] r8) {
            int r0 = r8.length
            r1 = 0
            r2 = 0
            r3 = 0
        L4:
            if (r2 >= r0) goto Lc
            r4 = r8[r2]
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L4
        Lc:
            int r0 = r8.length
            r2 = 0
            r4 = 0
        Lf:
            if (r2 >= r0) goto L38
            r5 = r8[r2]
            float r5 = (float) r5
            r6 = 1091567616(0x41100000, float:9.0)
            float r5 = r5 * r6
            float r6 = (float) r3
            float r5 = r5 / r6
            int r5 = java.lang.Math.round(r5)
            r6 = 1
            if (r5 < r6) goto L36
            r7 = 4
            if (r5 <= r7) goto L25
            goto L36
        L25:
            r7 = r2 & 1
            if (r7 != 0) goto L32
            r7 = 0
        L2a:
            if (r7 >= r5) goto L33
            int r4 = r4 << 1
            r4 = r4 | r6
            int r7 = r7 + 1
            goto L2a
        L32:
            int r4 = r4 << r5
        L33:
            int r2 = r2 + 1
            goto Lf
        L36:
            r8 = -1
            return r8
        L38:
            return r4
    }

    private static java.lang.String b(java.lang.CharSequence r5) throws com.huawei.hms.scankit.p.a {
            int r0 = r5.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = 0
        La:
            if (r2 >= r0) goto L35
            char r3 = r5.charAt(r2)
            r4 = 97
            if (r3 < r4) goto L2f
            r4 = 100
            if (r3 > r4) goto L2f
            int r4 = r0 + (-1)
            if (r2 >= r4) goto L2a
            int r2 = r2 + 1
            char r4 = r5.charAt(r2)
            char r3 = a(r3, r4)
            r1.append(r3)
            goto L32
        L2a:
            com.huawei.hms.scankit.p.a r5 = com.huawei.hms.scankit.p.a.a()
            throw r5
        L2f:
            r1.append(r3)
        L32:
            int r2 = r2 + 1
            goto La
        L35:
            java.lang.String r5 = r1.toString()
            return r5
    }

    @Override // com.huawei.hms.scankit.p.g5
    public com.huawei.hms.scankit.p.s6 a(int r12, com.huawei.hms.scankit.p.r r13, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r14) throws com.huawei.hms.scankit.p.a {
            r11 = this;
            int[] r14 = r11.a(r13)
            r0 = 1
            r1 = r14[r0]
            int r1 = r13.c(r1)
            int r2 = r13.e()
            int[] r3 = r11.b
            r4 = 0
            java.util.Arrays.fill(r3, r4)
            java.lang.StringBuilder r5 = r11.a
            r5.setLength(r4)
        L1a:
            com.huawei.hms.scankit.p.g5.a(r13, r1, r3)
            int r6 = b(r3)
            if (r6 < 0) goto L9e
            char r6 = a(r6)
            r5.append(r6)
            int r7 = r3.length
            r9 = r1
            r8 = 0
        L2d:
            if (r8 >= r7) goto L35
            r10 = r3[r8]
            int r9 = r9 + r10
            int r8 = r8 + 1
            goto L2d
        L35:
            int r7 = r13.c(r9)
            r8 = 42
            if (r6 != r8) goto L9b
            int r6 = r5.length()
            int r6 = r6 - r0
            r5.deleteCharAt(r6)
            int r6 = r3.length
            r8 = 0
            r9 = 0
        L48:
            if (r8 >= r6) goto L50
            r10 = r3[r8]
            int r9 = r9 + r10
            int r8 = r8 + 1
            goto L48
        L50:
            if (r7 == r2) goto L96
            boolean r13 = r13.b(r7)
            if (r13 == 0) goto L96
            int r13 = r5.length()
            r2 = 2
            if (r13 < r2) goto L91
            a(r5)
            int r13 = r5.length()
            int r13 = r13 - r2
            r5.setLength(r13)
            java.lang.String r13 = b(r5)
            r14 = r14[r4]
            float r14 = (float) r14
            int r9 = r9 * 10
            int r9 = r9 / 9
            int r1 = r1 + r9
            float r1 = (float) r1
            com.huawei.hms.scankit.p.s6 r3 = new com.huawei.hms.scankit.p.s6
            com.huawei.hms.scankit.p.u6 r5 = new com.huawei.hms.scankit.p.u6
            float r12 = (float) r12
            r5.<init>(r14, r12)
            com.huawei.hms.scankit.p.u6 r14 = new com.huawei.hms.scankit.p.u6
            r14.<init>(r1, r12)
            com.huawei.hms.scankit.p.u6[] r12 = new com.huawei.hms.scankit.p.u6[r2]
            r12[r4] = r5
            r12[r0] = r14
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r14 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.d
            r0 = 0
            r3.<init>(r13, r0, r12, r14)
            return r3
        L91:
            com.huawei.hms.scankit.p.a r12 = com.huawei.hms.scankit.p.a.a()
            throw r12
        L96:
            com.huawei.hms.scankit.p.a r12 = com.huawei.hms.scankit.p.a.a()
            throw r12
        L9b:
            r1 = r7
            goto L1a
        L9e:
            com.huawei.hms.scankit.p.a r12 = com.huawei.hms.scankit.p.a.a()
            throw r12
    }
}
