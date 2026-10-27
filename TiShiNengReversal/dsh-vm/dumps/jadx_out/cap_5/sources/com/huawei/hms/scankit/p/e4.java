package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e4 extends com.huawei.hms.scankit.p.q3 {
    private static int f = 3;
    private static int g = 8;
    private static int h = 7;
    private static int i = 40;
    private static int j = 24;
    private com.huawei.hms.scankit.p.s e;

    static {
            return
    }

    public e4(com.huawei.hms.scankit.p.p4 r1) {
            r0 = this;
            r0.<init>(r1)
            boolean r1 = com.huawei.hms.scankit.p.r3.n
            r0.a(r1)
            return
    }

    private static int a(int r0, int r1, int r2) {
            if (r0 >= r1) goto L3
            return r1
        L3:
            if (r0 <= r2) goto L6
            return r2
        L6:
            return r0
    }

    private static com.huawei.hms.scankit.p.s a(byte[] r13, int r14, int r15, int r16, int r17, int[][] r18) {
            int r0 = r14 * r15
            int[] r1 = new int[r0]
            r6 = 0
            r0 = 0
        L6:
            if (r0 >= r15) goto L58
            int r2 = r15 + (-3)
            r4 = 2
            int r2 = a(r0, r4, r2)
            r5 = 0
        L10:
            if (r5 >= r14) goto L55
            int r7 = r14 + (-3)
            int r7 = a(r5, r4, r7)
            int r8 = r2 + 2
            r8 = r18[r8]
            int r9 = r7 + 2
            r10 = r8[r9]
            if (r2 != r4) goto L28
            if (r7 != r4) goto L28
            r7 = 0
        L25:
            r8 = 0
        L26:
            r12 = 0
            goto L48
        L28:
            if (r2 != r4) goto L31
            int r7 = r7 + (-3)
            r7 = r8[r7]
            r8 = r7
            r7 = 0
            goto L26
        L31:
            if (r7 != r4) goto L3a
            int r7 = r2 + (-3)
            r7 = r18[r7]
            r7 = r7[r9]
            goto L25
        L3a:
            int r11 = r2 + (-3)
            r11 = r18[r11]
            int r7 = r7 + (-3)
            r12 = r11[r7]
            r9 = r11[r9]
            r7 = r8[r7]
            r8 = r7
            r7 = r9
        L48:
            int r9 = r0 * r14
            int r9 = r9 + r5
            int r10 = r10 + r12
            int r10 = r10 - r7
            int r10 = r10 - r8
            int r10 = r10 / 25
            r1[r9] = r10
            int r5 = r5 + 1
            goto L10
        L55:
            int r0 = r0 + 1
            goto L6
        L58:
            r0 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            int[] r13 = a(r0, r1, r2, r3, r4, r5)
            com.huawei.hms.scankit.p.s r14 = new com.huawei.hms.scankit.p.s
            int r0 = r4 + 31
            int r0 = r0 / 32
            r14.<init>(r4, r5, r0, r13)
            return r14
    }

    private void a(boolean r2) {
            r1 = this;
            r0 = 3
            if (r2 == 0) goto L10
            r2 = 2
            com.huawei.hms.scankit.p.e4.f = r2
            r2 = 4
            com.huawei.hms.scankit.p.e4.g = r2
            com.huawei.hms.scankit.p.e4.h = r0
            r2 = 20
            com.huawei.hms.scankit.p.e4.i = r2
            return
        L10:
            com.huawei.hms.scankit.p.e4.f = r0
            r2 = 8
            com.huawei.hms.scankit.p.e4.g = r2
            r2 = 7
            com.huawei.hms.scankit.p.e4.h = r2
            r2 = 40
            com.huawei.hms.scankit.p.e4.i = r2
            return
    }

    private static int[] a(int r7, int r8, int r9, byte[] r10) {
            int r8 = r8 * r9
            int r8 = r8 + r7
            r7 = 0
            r0 = 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 0
            r3 = 255(0xff, float:3.57E-43)
            r4 = 0
        Lb:
            int r5 = com.huawei.hms.scankit.p.e4.g
            if (r1 >= r5) goto L42
            r5 = 0
        L10:
            int r6 = com.huawei.hms.scankit.p.e4.g
            if (r5 >= r6) goto L23
            int r6 = r8 + r5
            r6 = r10[r6]
            r6 = r6 & r0
            int r2 = r2 + r6
            if (r6 >= r3) goto L1d
            r3 = r6
        L1d:
            if (r6 <= r4) goto L20
            r4 = r6
        L20:
            int r5 = r5 + 1
            goto L10
        L23:
            int r5 = r4 - r3
            int r6 = com.huawei.hms.scankit.p.e4.j
            if (r5 <= r6) goto L3e
        L29:
            int r1 = r1 + 1
            int r8 = r8 + r9
            int r5 = com.huawei.hms.scankit.p.e4.g
            if (r1 >= r5) goto L3e
            r5 = 0
        L31:
            int r6 = com.huawei.hms.scankit.p.e4.g
            if (r5 >= r6) goto L29
            int r6 = r8 + r5
            r6 = r10[r6]
            r6 = r6 & r0
            int r2 = r2 + r6
            int r5 = r5 + 1
            goto L31
        L3e:
            int r1 = r1 + 1
            int r8 = r8 + r9
            goto Lb
        L42:
            int[] r7 = new int[]{r2, r3, r4}
            return r7
    }

    private static int[] a(byte[] r14, int[] r15, int r16, int r17, int r18, int r19) {
            r0 = r18
            r1 = r19
            int r2 = r0 + 31
            int r2 = r2 / 32
            int r3 = r2 * r1
            int[] r4 = new int[r3]
            r5 = 0
            r6 = 0
        Le:
            if (r6 >= r3) goto L15
            r4[r6] = r5
            int r6 = r6 + 1
            goto Le
        L15:
            int r6 = com.huawei.hms.scankit.p.e4.g
            r7 = 0
        L18:
            if (r7 >= r1) goto L46
            int r8 = r7 / r6
            r9 = 0
        L1d:
            if (r9 >= r0) goto L43
            int r10 = r9 / r6
            int r11 = r7 * r0
            int r11 = r11 + r9
            r11 = r14[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r12 = r8 * r16
            int r12 = r12 + r10
            r10 = r15[r12]
            if (r11 > r10) goto L40
            int r10 = r7 * r2
            int r11 = r9 / 32
            int r10 = r10 + r11
            if (r10 >= r3) goto L40
            r11 = r4[r10]
            r12 = r9 & 31
            r13 = 1
            int r12 = r13 << r12
            r11 = r11 | r12
            r4[r10] = r11
        L40:
            int r9 = r9 + 1
            goto L1d
        L43:
            int r7 = r7 + 1
            goto L18
        L46:
            return r4
    }

    private static int[][] a(byte[] r20, int r21, int r22, int r23, int r24) {
            r0 = r21
            r1 = r22
            r2 = r23
            int r3 = com.huawei.hms.scankit.p.e4.g
            int r4 = r24 - r3
            int r3 = r2 - r3
            r5 = 2
            int[] r6 = new int[r5]
            r7 = 1
            r6[r7] = r0
            r8 = 0
            r6[r8] = r1
            java.lang.Class r9 = java.lang.Integer.TYPE
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r9, r6)
            int[][] r6 = (int[][]) r6
            int[] r10 = new int[r5]
            r10[r7] = r0
            r10[r8] = r1
            java.lang.Object r9 = java.lang.reflect.Array.newInstance(r9, r10)
            int[][] r9 = (int[][]) r9
            r10 = 0
        L2a:
            if (r10 >= r1) goto La5
            int r11 = com.huawei.hms.scankit.p.e4.f
            int r11 = r10 << r11
            if (r11 <= r4) goto L33
            r11 = r4
        L33:
            r12 = 0
            r13 = 0
        L35:
            if (r12 >= r0) goto L9c
            int r14 = com.huawei.hms.scankit.p.e4.f
            int r14 = r12 << r14
            if (r14 <= r3) goto L3e
            r14 = r3
        L3e:
            r15 = r20
            int[] r14 = a(r14, r11, r2, r15)
            r16 = r14[r8]
            r24 = 2
            r5 = r14[r7]
            r14 = r14[r24]
            int r17 = com.huawei.hms.scankit.p.e4.f
            int r17 = r17 * 2
            int r16 = r16 >> r17
            int r14 = r14 - r5
            int r7 = com.huawei.hms.scankit.p.e4.j
            if (r14 > r7) goto L76
            int r16 = r5 / 2
            if (r10 <= 0) goto L76
            if (r12 <= 0) goto L76
            int r7 = r10 + (-1)
            r7 = r9[r7]
            r14 = r7[r12]
            r18 = r9[r10]
            int r19 = r12 + (-1)
            r18 = r18[r19]
            int r18 = r18 * 2
            int r14 = r14 + r18
            r7 = r7[r19]
            int r14 = r14 + r7
            int r7 = r14 / 4
            if (r5 >= r7) goto L76
            r16 = r7
        L76:
            int r13 = r13 + r16
            r5 = r9[r10]
            r5[r12] = r16
            if (r10 != 0) goto L85
            if (r12 != 0) goto L85
            r5 = r6[r10]
            r5[r12] = r16
            goto L97
        L85:
            if (r10 != 0) goto L8c
            r5 = r6[r10]
            r5[r12] = r13
            goto L97
        L8c:
            r5 = r6[r10]
            int r7 = r10 + (-1)
            r7 = r6[r7]
            r7 = r7[r12]
            int r7 = r7 + r13
            r5[r12] = r7
        L97:
            int r12 = r12 + 1
            r5 = 2
            r7 = 1
            goto L35
        L9c:
            r15 = r20
            r24 = 2
            int r10 = r10 + 1
            r5 = 2
            r7 = 1
            goto L2a
        La5:
            return r6
    }

    @Override // com.huawei.hms.scankit.p.q3, com.huawei.hms.scankit.p.o
    public com.huawei.hms.scankit.p.o a(com.huawei.hms.scankit.p.p4 r2) {
            r1 = this;
            com.huawei.hms.scankit.p.e4 r0 = new com.huawei.hms.scankit.p.e4
            r0.<init>(r2)
            return r0
    }

    @Override // com.huawei.hms.scankit.p.q3, com.huawei.hms.scankit.p.o
    public com.huawei.hms.scankit.p.s a() throws com.huawei.hms.scankit.p.a {
            r7 = this;
            com.huawei.hms.scankit.p.s r0 = r7.e
            if (r0 == 0) goto L5
            return r0
        L5:
            com.huawei.hms.scankit.p.p4 r0 = r7.c()
            int r4 = r0.c()
            int r5 = r0.a()
            int r1 = com.huawei.hms.scankit.p.e4.i
            if (r4 < r1) goto L3a
            if (r5 < r1) goto L3a
            byte[] r1 = r0.b()
            int r0 = com.huawei.hms.scankit.p.e4.f
            int r2 = r4 >> r0
            int r3 = com.huawei.hms.scankit.p.e4.h
            r6 = r4 & r3
            if (r6 == 0) goto L27
            int r2 = r2 + 1
        L27:
            int r0 = r5 >> r0
            r3 = r3 & r5
            if (r3 == 0) goto L2e
            int r0 = r0 + 1
        L2e:
            r3 = r0
            int[][] r6 = a(r1, r2, r3, r4, r5)
            com.huawei.hms.scankit.p.s r0 = a(r1, r2, r3, r4, r5, r6)
            r7.e = r0
            goto L40
        L3a:
            com.huawei.hms.scankit.p.s r0 = super.a()
            r7.e = r0
        L40:
            com.huawei.hms.scankit.p.s r0 = r7.e
            return r0
    }
}
