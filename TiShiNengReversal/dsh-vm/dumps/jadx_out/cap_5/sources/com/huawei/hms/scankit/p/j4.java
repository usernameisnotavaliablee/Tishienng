package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class j4 extends com.huawei.hms.scankit.p.g5 {
    private static final int[] c = null;
    private static final int[] d = null;
    private static final int[][] e = null;
    public static final int[][] f = null;
    private int a;
    private int b;

    static {
            r0 = 6
            r1 = 8
            r2 = 10
            r3 = 12
            r4 = 14
            int[] r5 = new int[]{r0, r1, r2, r3, r4}
            com.huawei.hms.scankit.p.j4.c = r5
            r5 = 1
            int[] r6 = new int[]{r5, r5, r5, r5}
            com.huawei.hms.scankit.p.j4.d = r6
            r6 = 2
            int[][] r7 = new int[r6][]
            int[] r8 = new int[]{r5, r5, r6}
            r9 = 0
            r7[r9] = r8
            r8 = 3
            int[] r10 = new int[]{r5, r5, r8}
            r7[r5] = r10
            com.huawei.hms.scankit.p.j4.e = r7
            r7 = 20
            int[][] r7 = new int[r7][]
            int[] r10 = new int[]{r5, r5, r6, r6, r5}
            r7[r9] = r10
            int[] r9 = new int[]{r6, r5, r5, r5, r6}
            r7[r5] = r9
            int[] r9 = new int[]{r5, r6, r5, r5, r6}
            r7[r6] = r9
            int[] r9 = new int[]{r6, r6, r5, r5, r5}
            r7[r8] = r9
            int[] r9 = new int[]{r5, r5, r6, r5, r6}
            r10 = 4
            r7[r10] = r9
            int[] r9 = new int[]{r6, r5, r6, r5, r5}
            r10 = 5
            r7[r10] = r9
            int[] r9 = new int[]{r5, r6, r6, r5, r5}
            r7[r0] = r9
            int[] r0 = new int[]{r5, r5, r5, r6, r6}
            r9 = 7
            r7[r9] = r0
            int[] r0 = new int[]{r6, r5, r5, r6, r5}
            r7[r1] = r0
            int[] r0 = new int[]{r5, r6, r5, r6, r5}
            r1 = 9
            r7[r1] = r0
            int[] r0 = new int[]{r5, r5, r8, r8, r5}
            r7[r2] = r0
            int[] r0 = new int[]{r8, r5, r5, r5, r8}
            r1 = 11
            r7[r1] = r0
            int[] r0 = new int[]{r5, r8, r5, r5, r8}
            r7[r3] = r0
            int[] r0 = new int[]{r8, r8, r5, r5, r5}
            r1 = 13
            r7[r1] = r0
            int[] r0 = new int[]{r5, r5, r8, r5, r8}
            r7[r4] = r0
            int[] r0 = new int[]{r8, r5, r8, r5, r5}
            r1 = 15
            r7[r1] = r0
            int[] r0 = new int[]{r5, r8, r8, r5, r5}
            r1 = 16
            r7[r1] = r0
            int[] r0 = new int[]{r5, r5, r5, r8, r8}
            r1 = 17
            r7[r1] = r0
            int[] r0 = new int[]{r8, r5, r5, r8, r5}
            r1 = 18
            r7[r1] = r0
            int[] r0 = new int[]{r5, r8, r5, r8, r5}
            r1 = 19
            r7[r1] = r0
            com.huawei.hms.scankit.p.j4.f = r7
            return
    }

    public j4() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.a = r0
            r1.b = r0
            return
    }

    private static void a(com.huawei.hms.scankit.p.r r10, int r11, int r12, java.lang.StringBuilder r13) throws com.huawei.hms.scankit.p.a {
            r0 = 10
            int[] r1 = new int[r0]
            r2 = 5
            int[] r3 = new int[r2]
            int[] r4 = new int[r2]
        L9:
            if (r11 >= r12) goto L5a
            com.huawei.hms.scankit.p.g5.a(r10, r11, r1)
            r5 = 0
            r6 = -1
            r7 = 10000(0x2710, float:1.4013E-41)
            r8 = 0
        L13:
            if (r8 >= r0) goto L22
            r9 = r1[r8]
            if (r6 <= r9) goto L1a
            goto L1b
        L1a:
            r6 = r9
        L1b:
            if (r7 >= r9) goto L1e
            goto L1f
        L1e:
            r7 = r9
        L1f:
            int r8 = r8 + 1
            goto L13
        L22:
            int r6 = r6 / r7
            r7 = 8
            if (r6 > r7) goto L55
            r6 = 0
        L28:
            if (r6 >= r2) goto L39
            int r7 = r6 * 2
            r8 = r1[r7]
            r3[r6] = r8
            int r7 = r7 + 1
            r7 = r1[r7]
            r4[r6] = r7
            int r6 = r6 + 1
            goto L28
        L39:
            int r6 = b(r3)
            int r6 = r6 + 48
            char r6 = (char) r6
            r13.append(r6)
            int r6 = b(r4)
            int r6 = r6 + 48
            char r6 = (char) r6
            r13.append(r6)
        L4d:
            if (r5 >= r0) goto L9
            r6 = r1[r5]
            int r11 = r11 + r6
            int r5 = r5 + 1
            goto L4d
        L55:
            com.huawei.hms.scankit.p.a r10 = com.huawei.hms.scankit.p.a.a()
            throw r10
        L5a:
            if (r11 != r12) goto L5d
            return
        L5d:
            com.huawei.hms.scankit.p.a r10 = com.huawei.hms.scankit.p.a.a()
            throw r10
    }

    private boolean a(com.huawei.hms.scankit.p.r r6, int r7) {
            r5 = this;
            int r0 = r5.a
            int r0 = r0 * 10
            int r1 = r5.b
            double r1 = (double) r1
            r3 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r1 = r1 * r3
            int r1 = (int) r1
            if (r0 >= r1) goto Lf
            r0 = r1
        Lf:
            r1 = 1
            int r7 = r7 - r1
        L11:
            if (r0 <= 0) goto L21
            if (r7 < 0) goto L21
            boolean r2 = r6.b(r7)
            if (r2 == 0) goto L1c
            goto L21
        L1c:
            int r0 = r0 + (-1)
            int r7 = r7 + (-1)
            goto L11
        L21:
            if (r0 == 0) goto L25
            r6 = 0
            return r6
        L25:
            return r1
    }

    private int[] a(com.huawei.hms.scankit.p.r r7) throws com.huawei.hms.scankit.p.a {
            r6 = this;
            r7.h()     // Catch: java.lang.Throwable -> L2f
            int r0 = c(r7)     // Catch: java.lang.Throwable -> L2f
        L7:
            int[][] r1 = com.huawei.hms.scankit.p.j4.e     // Catch: java.lang.Throwable -> L2f
            r2 = 0
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L2f
            int[] r0 = r6.b(r7, r0, r1)     // Catch: java.lang.Throwable -> L2f
            r1 = r0[r2]     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r6.a(r7, r1)     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L31
            r1 = r0[r2]     // Catch: java.lang.Throwable -> L2f
            int r3 = r7.e()     // Catch: java.lang.Throwable -> L2f
            r4 = 1
            r5 = r0[r4]     // Catch: java.lang.Throwable -> L2f
            int r3 = r3 - r5
            r0[r2] = r3     // Catch: java.lang.Throwable -> L2f
            int r2 = r7.e()     // Catch: java.lang.Throwable -> L2f
            int r2 = r2 - r1
            r0[r4] = r2     // Catch: java.lang.Throwable -> L2f
            r7.h()
            return r0
        L2f:
            r0 = move-exception
            goto L35
        L31:
            r1 = 2
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L2f
            goto L7
        L35:
            r7.h()
            throw r0
    }

    private static int b(int[] r10) throws com.huawei.hms.scankit.p.a {
            int[][] r0 = com.huawei.hms.scankit.p.j4.f
            int r0 = r0.length
            r1 = 1050253722(0x3e99999a, float:0.3)
            r2 = -1
            r3 = 0
            r4 = -1
        L9:
            if (r3 >= r0) goto L2f
            int[][] r5 = com.huawei.hms.scankit.p.j4.f
            r5 = r5[r3]
            r6 = 1061158912(0x3f400000, float:0.75)
            float r5 = com.huawei.hms.scankit.p.g5.a(r10, r5, r6)
            int r6 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r6 >= 0) goto L1c
            r4 = r3
            r1 = r5
            goto L2c
        L1c:
            float r5 = r5 - r1
            float r5 = java.lang.Math.abs(r5)
            double r5 = (double) r5
            r7 = 4502148214488346440(0x3e7ad7f29abcaf48, double:1.0E-7)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L2c
            r4 = -1
        L2c:
            int r3 = r3 + 1
            goto L9
        L2f:
            if (r4 < 0) goto L34
            int r4 = r4 % 10
            return r4
        L34:
            com.huawei.hms.scankit.p.a r10 = com.huawei.hms.scankit.p.a.a()
            throw r10
    }

    private int[] b(com.huawei.hms.scankit.p.r r4) throws com.huawei.hms.scankit.p.a {
            r3 = this;
            int r0 = c(r4)
        L4:
            int[] r1 = com.huawei.hms.scankit.p.j4.d
            int[] r0 = r3.c(r4, r0, r1)
            r1 = 1
            r1 = r0[r1]
            r2 = 0
            r2 = r0[r2]
            int r1 = r1 - r2
            int r1 = r1 / 4
            r3.a = r1
            boolean r1 = r3.a(r4, r2)
            if (r1 == 0) goto L1c
            return r0
        L1c:
            r1 = 2
            r0 = r0[r1]
            goto L4
    }

    private int[] b(com.huawei.hms.scankit.p.r r18, int r19, int[] r20) throws com.huawei.hms.scankit.p.a {
            r17 = this;
            r0 = r20
            int r0 = r0.length
            int[] r1 = new int[r0]
            int r2 = r18.e()
            r3 = 0
            r4 = r19
            r5 = r4
            r6 = 0
            r7 = 0
        Lf:
            if (r4 >= r2) goto La1
            r8 = r18
            boolean r9 = r8.b(r4)
            r10 = 1
            if (r9 == r6) goto L2a
            if (r7 < 0) goto L25
            if (r7 >= r0) goto L25
            r9 = r1[r7]
            int r9 = r9 + r10
            r1[r7] = r9
            goto L9d
        L25:
            com.huawei.hms.scankit.p.a r0 = com.huawei.hms.scankit.p.a.a()
            throw r0
        L2a:
            int r9 = r0 + (-1)
            if (r7 != r9) goto L95
            r9 = r1[r3]
            r11 = r1[r10]
            int r9 = java.lang.Math.min(r9, r11)
            if (r9 == 0) goto L90
            r9 = r1[r3]
            r11 = r1[r10]
            int r9 = java.lang.Math.max(r9, r11)
            if (r9 == 0) goto L90
            r9 = r1[r3]
            r11 = r1[r10]
            int r9 = java.lang.Math.max(r9, r11)
            float r9 = (float) r9
            r11 = r1[r3]
            r12 = r1[r10]
            int r11 = java.lang.Math.min(r11, r12)
            float r11 = (float) r11
            float r9 = r9 / r11
            r11 = 2
            r12 = r1[r11]
            float r12 = (float) r12
            r13 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 * r13
            r13 = r1[r3]
            r14 = r1[r10]
            int r15 = r13 + r14
            float r15 = (float) r15
            float r12 = r12 / r15
            r15 = 1077936128(0x40400000, float:3.0)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            r19 = 1
            if (r9 > 0) goto L81
            double r10 = (double) r12
            r15 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            int r9 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r9 <= 0) goto L81
            r9 = 1082130432(0x40800000, float:4.0)
            int r9 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r9 >= 0) goto L81
            int r13 = r13 + r5
            int r13 = r13 + r14
            int[] r0 = new int[]{r5, r4, r13}
            return r0
        L81:
            int r13 = r13 + r14
            int r5 = r5 + r13
            int r9 = r7 + (-1)
            r10 = 2
            java.lang.System.arraycopy(r1, r10, r1, r3, r9)
            r1[r9] = r3
            r1[r7] = r3
            int r7 = r7 + (-1)
            goto L99
        L90:
            com.huawei.hms.scankit.p.a r0 = com.huawei.hms.scankit.p.a.a()
            throw r0
        L95:
            r19 = 1
            int r7 = r7 + 1
        L99:
            r1[r7] = r19
            r6 = r6 ^ 1
        L9d:
            int r4 = r4 + 1
            goto Lf
        La1:
            com.huawei.hms.scankit.p.a r0 = com.huawei.hms.scankit.p.a.a()
            throw r0
    }

    private static int c(com.huawei.hms.scankit.p.r r2) throws com.huawei.hms.scankit.p.a {
            int r0 = r2.e()
            r1 = 0
            int r2 = r2.c(r1)
            if (r2 == r0) goto Lc
            return r2
        Lc:
            com.huawei.hms.scankit.p.a r2 = com.huawei.hms.scankit.p.a.a()
            throw r2
    }

    private int[] c(com.huawei.hms.scankit.p.r r21, int r22, int[] r23) throws com.huawei.hms.scankit.p.a {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r23
            int r2 = r2.length
            int[] r3 = new int[r2]
            int r4 = r1.e()
            r5 = 0
            r6 = r22
            r7 = r6
            r8 = 0
            r9 = 0
        L13:
            if (r6 >= r4) goto Lb6
            boolean r10 = r1.b(r6)
            r11 = 1
            if (r10 == r8) goto L2e
            if (r9 < 0) goto L29
            if (r9 >= r2) goto L29
            r10 = r3[r9]
            int r10 = r10 + r11
            r3[r9] = r10
            r5 = r6
            r10 = 0
            goto Lb1
        L29:
            com.huawei.hms.scankit.p.a r1 = com.huawei.hms.scankit.p.a.a()
            throw r1
        L2e:
            int r10 = r2 + (-1)
            if (r9 != r10) goto La7
            java.lang.Object r10 = r3.clone()
            int[] r10 = (int[]) r10
            java.util.Arrays.sort(r10)
            r12 = r10[r5]
            r13 = r10[r11]
            int r13 = r13 + r12
            double r13 = (double) r13
            r15 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r13 = r13 * r15
            r22 = 1
            r11 = 2
            r17 = r10[r11]
            r18 = 3
            r10 = r10[r18]
            r18 = r15
            int r15 = r17 + r10
            r16 = r6
            r23 = 0
            double r5 = (double) r15
            double r5 = r5 * r18
            double r5 = r5 / r13
            r13 = 4616189618054758400(0x4010000000000000, double:4.0)
            int r15 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r15 >= 0) goto L92
            double r5 = (double) r10
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r5 = r5 * r13
            double r12 = (double) r12
            double r5 = r5 / r12
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r10 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r10 > 0) goto L92
            r2 = 10
            int[] r4 = new int[r2]
            r5 = r16
            com.huawei.hms.scankit.p.g5.a(r1, r5, r4)
            r1 = -1
            r0.b = r1
            r1 = 0
        L7a:
            if (r1 >= r2) goto L87
            r6 = r4[r1]
            int r8 = r0.b
            if (r6 <= r8) goto L84
            r0.b = r6
        L84:
            int r1 = r1 + 1
            goto L7a
        L87:
            r1 = r3[r23]
            int r1 = r1 + r7
            r2 = r3[r22]
            int r1 = r1 + r2
            int[] r1 = new int[]{r7, r5, r1}
            return r1
        L92:
            r5 = r16
            r6 = r3[r23]
            r10 = r3[r22]
            int r6 = r6 + r10
            int r7 = r7 + r6
            int r6 = r9 + (-1)
            r10 = 0
            java.lang.System.arraycopy(r3, r11, r3, r10, r6)
            r3[r6] = r10
            r3[r9] = r10
            int r9 = r9 + (-1)
            goto Lad
        La7:
            r5 = r6
            r22 = 1
            r10 = 0
            int r9 = r9 + 1
        Lad:
            r3[r9] = r22
            r8 = r8 ^ 1
        Lb1:
            int r6 = r5 + 1
            r5 = 0
            goto L13
        Lb6:
            com.huawei.hms.scankit.p.a r1 = com.huawei.hms.scankit.p.a.a()
            throw r1
    }

    @Override // com.huawei.hms.scankit.p.g5
    public com.huawei.hms.scankit.p.s6 a(int r10, com.huawei.hms.scankit.p.r r11, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r12) throws com.huawei.hms.scankit.p.a, com.huawei.hms.scankit.p.a {
            r9 = this;
            int[] r12 = r9.b(r11)
            int[] r0 = r9.a(r11)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 20
            r1.<init>(r2)
            r2 = 1
            r3 = r12[r2]
            r4 = 0
            r5 = r0[r4]
            a(r11, r3, r5, r1)
            java.lang.String r11 = r1.toString()
            int[] r1 = com.huawei.hms.scankit.p.j4.c
            int r3 = r11.length()
            int r5 = r1.length
            r6 = 0
            r7 = 0
        L25:
            if (r6 >= r5) goto L33
            r8 = r1[r6]
            if (r3 != r8) goto L2d
            r1 = 1
            goto L34
        L2d:
            if (r8 <= r7) goto L30
            r7 = r8
        L30:
            int r6 = r6 + 1
            goto L25
        L33:
            r1 = 0
        L34:
            if (r1 != 0) goto L39
            if (r3 <= r7) goto L39
            r1 = 1
        L39:
            if (r1 == 0) goto L5c
            com.huawei.hms.scankit.p.s6 r1 = new com.huawei.hms.scankit.p.s6
            com.huawei.hms.scankit.p.u6 r3 = new com.huawei.hms.scankit.p.u6
            r12 = r12[r4]
            float r12 = (float) r12
            float r10 = (float) r10
            r3.<init>(r12, r10)
            com.huawei.hms.scankit.p.u6 r12 = new com.huawei.hms.scankit.p.u6
            r0 = r0[r2]
            float r0 = (float) r0
            r12.<init>(r0, r10)
            r10 = 2
            com.huawei.hms.scankit.p.u6[] r10 = new com.huawei.hms.scankit.p.u6[r10]
            r10[r4] = r3
            r10[r2] = r12
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r12 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.i
            r0 = 0
            r1.<init>(r11, r0, r10, r12)
            return r1
        L5c:
            com.huawei.hms.scankit.p.a r10 = com.huawei.hms.scankit.p.a.a()
            throw r10
    }
}
