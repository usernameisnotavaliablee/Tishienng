package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class k2 {
    private static com.huawei.hms.scankit.p.d5 a;
    private static com.huawei.hms.scankit.p.p b;

    public k2() {
            r1 = this;
            r1.<init>()
            return
    }

    private static com.huawei.hms.scankit.p.u6 a(float r11, float r12, com.huawei.hms.scankit.p.i2 r13) {
            float[] r0 = r13.m
            if (r0 == 0) goto L66
            int r1 = r0.length
            r2 = 5
            if (r1 != r2) goto L66
            r1 = 4
            r1 = r0[r1]
            float r1 = -r1
            r2 = 0
            r0 = r0[r2]
            float r0 = r11 - r0
            double r3 = (double) r0
            double r0 = (double) r1
            double r5 = java.lang.Math.cos(r0)
            double r3 = r3 * r5
            float[] r5 = r13.m
            r6 = 1
            r5 = r5[r6]
            float r5 = r12 - r5
            double r7 = (double) r5
            double r9 = java.lang.Math.sin(r0)
            double r7 = r7 * r9
            double r3 = r3 + r7
            float[] r5 = r13.m
            r2 = r5[r2]
            double r7 = (double) r2
            double r3 = r3 + r7
            int r3 = (int) r3
            float r11 = r11 - r2
            float r11 = -r11
            double r4 = (double) r11
            double r7 = java.lang.Math.sin(r0)
            double r4 = r4 * r7
            float[] r11 = r13.m
            r11 = r11[r6]
            float r12 = r12 - r11
            double r11 = (double) r12
            double r0 = java.lang.Math.cos(r0)
            double r11 = r11 * r0
            double r4 = r4 + r11
            float[] r11 = r13.m
            r11 = r11[r6]
            double r11 = (double) r11
            double r4 = r4 + r11
            int r11 = (int) r4
            com.huawei.hms.scankit.p.u6 r12 = new com.huawei.hms.scankit.p.u6
            float r0 = (float) r3
            float[] r1 = r13.m
            r2 = 2
            r2 = r1[r2]
            float r0 = r0 - r2
            int r2 = r13.r
            float r2 = (float) r2
            float r0 = r0 + r2
            float r11 = (float) r11
            r2 = 3
            r1 = r1[r2]
            float r11 = r11 - r1
            int r13 = r13.s
            float r13 = (float) r13
            float r11 = r11 + r13
            r12.<init>(r0, r11)
            return r12
        L66:
            com.huawei.hms.scankit.p.u6 r13 = new com.huawei.hms.scankit.p.u6
            r13.<init>(r11, r12)
            return r13
    }

    public static java.util.List<com.huawei.hms.scankit.p.i2> a(boolean r7, com.huawei.hms.scankit.p.p r8, int r9, boolean r10) {
            int r4 = r8.e()
            int r3 = r8.c()
            com.huawei.hms.scankit.p.o r8 = r8.a()
            com.huawei.hms.scankit.p.p4 r8 = r8.c()
            byte[] r2 = r8.b()
            com.huawei.hms.scankit.p.d5 r0 = new com.huawei.hms.scankit.p.d5
            r0.<init>()
            com.huawei.hms.scankit.p.k2.a = r0
            r1 = r7
            r5 = r9
            r6 = r10
            r0.a(r1, r2, r3, r4, r5, r6)
            com.huawei.hms.scankit.p.d5 r7 = com.huawei.hms.scankit.p.k2.a
            java.util.List<com.huawei.hms.scankit.p.i2> r7 = r7.a
            return r7
    }

    private static void a(com.huawei.hms.scankit.p.p r29, float r30, com.huawei.hms.scankit.p.i2 r31, float[] r32) {
            r5 = r30
            r8 = r31
            double r0 = (double) r5
            double r0 = java.lang.Math.toRadians(r0)
            float r0 = (float) r0
            int r1 = r8.p
            double r1 = (double) r1
            double r3 = (double) r0
            double r6 = java.lang.Math.sin(r3)
            double r6 = java.lang.Math.abs(r6)
            double r1 = r1 * r6
            int r6 = r8.q
            double r6 = (double) r6
            double r9 = java.lang.Math.cos(r3)
            double r9 = java.lang.Math.abs(r9)
            double r6 = r6 * r9
            double r1 = r1 + r6
            int r12 = (int) r1
            int r1 = r8.q
            double r1 = (double) r1
            double r6 = java.lang.Math.sin(r3)
            double r6 = java.lang.Math.abs(r6)
            double r1 = r1 * r6
            int r6 = r8.p
            double r6 = (double) r6
            double r3 = java.lang.Math.cos(r3)
            double r3 = java.lang.Math.abs(r3)
            double r6 = r6 * r3
            double r1 = r1 + r6
            int r4 = (int) r1
            float[] r1 = r8.m
            float r2 = (float) r4
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r3
            r6 = 0
            r1[r6] = r2
            float r2 = (float) r12
            float r2 = r2 * r3
            r7 = 1
            r1[r7] = r2
            int r2 = r8.p
            int r2 = r4 - r2
            float r2 = (float) r2
            float r2 = r2 * r3
            r18 = 2
            r1[r18] = r2
            int r2 = r8.q
            int r2 = r12 - r2
            float r2 = (float) r2
            float r2 = r2 * r3
            r19 = 3
            r1[r19] = r2
            r2 = 4
            r1[r2] = r0
            boolean r0 = com.huawei.hms.scankit.p.r3.b
            if (r0 != 0) goto L85
            com.huawei.hms.scankit.p.o r0 = r29.a()
            com.huawei.hms.scankit.p.p4 r0 = r0.c()
            byte[] r0 = r0.b()
            int r1 = r8.q
            int r2 = r8.p
            byte[] r0 = com.huawei.hms.scankit.util.LoadOpencvJNIUtil.removeMoirePattern(r0, r1, r2)
            goto L91
        L85:
            com.huawei.hms.scankit.p.o r0 = r29.a()
            com.huawei.hms.scankit.p.p4 r0 = r0.c()
            byte[] r0 = r0.b()
        L91:
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto Lc2
            r8.t = r6
            r8.u = r6
            com.huawei.hms.scankit.p.e6 r20 = new com.huawei.hms.scankit.p.e6
            int r1 = r8.p
            int r2 = r8.q
            r25 = 0
            r28 = 0
            r24 = 0
            r26 = r1
            r27 = r2
            r21 = r0
            r22 = r1
            r23 = r2
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            r0 = r20
            com.huawei.hms.scankit.p.q3 r1 = new com.huawei.hms.scankit.p.q3
            r1.<init>(r0)
            com.huawei.hms.scankit.p.p r0 = new com.huawei.hms.scankit.p.p
            r0.<init>(r1)
            r8.l = r0
            return
        Lc2:
            int r1 = r8.q
            int r2 = r8.p
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r3 = r12
            byte[] r10 = com.huawei.hms.scankit.util.LoadOpencvJNIUtil.imageRotate(r0, r1, r2, r3, r4, r5, r6)
            com.huawei.hms.scankit.p.e6 r9 = new com.huawei.hms.scankit.p.e6
            r14 = 0
            r17 = 0
            r13 = 0
            r15 = r4
            r16 = r12
            r11 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            com.huawei.hms.scankit.p.q3 r0 = new com.huawei.hms.scankit.p.q3
            r0.<init>(r9)
            com.huawei.hms.scankit.p.p r1 = new com.huawei.hms.scankit.p.p
            r1.<init>(r0)
            float r0 = r8.g()
            r2 = 1077936128(0x40400000, float:3.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lf8
            float r0 = r8.g()
            r2 = 1082130432(0x40800000, float:4.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L113
        Lf8:
            int r0 = r1.c()
            int r2 = r1.e()
            if (r0 <= r2) goto L113
            r0 = r32[r18]
            r2 = r32[r19]
            float r0 = java.lang.Math.min(r0, r2)
            r2 = r32[r18]
            r3 = r32[r19]
            float r2 = java.lang.Math.max(r2, r3)
            goto L123
        L113:
            r0 = r32[r18]
            r2 = r32[r19]
            float r0 = java.lang.Math.max(r0, r2)
            r2 = r32[r18]
            r3 = r32[r19]
            float r2 = java.lang.Math.min(r2, r3)
        L123:
            double r5 = (double) r4
            r9 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r5 = r5 * r9
            double r13 = (double) r0
            double r13 = r13 * r9
            double r5 = r5 - r13
            r13 = 0
            double r5 = java.lang.Math.max(r5, r13)
            int r3 = (int) r5
            r8.t = r3
            double r5 = (double) r12
            double r5 = r5 * r9
            r29 = r9
            double r9 = (double) r2
            double r9 = r9 * r29
            double r5 = r5 - r9
            double r5 = java.lang.Math.max(r5, r13)
            int r3 = (int) r5
            r8.u = r3
            int r3 = r8.t
            int r4 = r4 - r3
            int r0 = (int) r0
            int r0 = java.lang.Math.min(r4, r0)
            int r3 = r8.u
            int r12 = r12 - r3
            int r2 = (int) r2
            int r2 = java.lang.Math.min(r12, r2)
            int r3 = r8.t
            int r4 = r8.u
            com.huawei.hms.scankit.p.p r0 = r1.a(r3, r4, r0, r2)
            r8.l = r0
            return
    }

    public static void a(com.huawei.hms.scankit.p.s r9, com.huawei.hms.scankit.p.s6 r10, float r11, com.huawei.hms.scankit.p.i2 r12) {
            com.huawei.hms.scankit.p.u6[] r1 = r10.j()
            r7 = 0
            r0 = r1[r7]
            float r0 = r0.b()
            r8 = 1
            r2 = r1[r8]
            float r2 = r2.b()
            float r2 = java.lang.Math.min(r0, r2)
            r0 = r1[r7]
            float r0 = r0.b()
            r3 = r1[r8]
            float r3 = r3.b()
            float r0 = java.lang.Math.max(r0, r3)
            r3 = r1[r7]
            float r3 = r3.c()
            int r4 = r9.e()
            int r4 = r4 - r8
            float r4 = (float) r4
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L3c
            int r0 = r9.e()
            int r0 = r0 - r8
            float r0 = (float) r0
        L3c:
            int r4 = r9.c()
            int r4 = r4 - r8
            float r4 = (float) r4
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L4c
            int r3 = r9.c()
            int r3 = r3 - r8
            float r3 = (float) r3
        L4c:
            r4 = r3
            int r5 = r9.c()
            int[] r6 = new int[r5]
            r3 = r0
            r0 = r9
            int[] r9 = a(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L5e
            r0 = r9[r7]     // Catch: java.lang.IndexOutOfBoundsException -> L5e
            r9 = r9[r8]     // Catch: java.lang.IndexOutOfBoundsException -> L5e
            goto L6c
        L5e:
            r9 = r1[r7]
            float r9 = r9.c()
            int r0 = (int) r9
            r9 = r1[r7]
            float r9 = r9.c()
            int r9 = (int) r9
        L6c:
            com.huawei.hms.scankit.p.u6 r1 = new com.huawei.hms.scankit.p.u6
            float r0 = (float) r0
            r1.<init>(r2, r0)
            com.huawei.hms.scankit.p.u6 r4 = new com.huawei.hms.scankit.p.u6
            r4.<init>(r3, r0)
            com.huawei.hms.scankit.p.u6 r0 = new com.huawei.hms.scankit.p.u6
            float r9 = (float) r9
            r0.<init>(r3, r9)
            com.huawei.hms.scankit.p.u6 r3 = new com.huawei.hms.scankit.p.u6
            r3.<init>(r2, r9)
            r9 = 4
            com.huawei.hms.scankit.p.u6[] r9 = new com.huawei.hms.scankit.p.u6[r9]
            r9[r7] = r1
            r9[r8] = r4
            r1 = 2
            r9[r1] = r0
            r0 = 3
            r9[r0] = r3
            if (r12 == 0) goto L94
            a(r9, r11, r12)
        L94:
            r10.a()
            r10.a(r9)
            return
    }

    public static void a(com.huawei.hms.scankit.p.u6[] r4, float r5, com.huawei.hms.scankit.p.i2 r6) {
            if (r6 != 0) goto L3
            goto L2a
        L3:
            if (r4 == 0) goto L2a
            r0 = 0
        L6:
            int r1 = r4.length
            if (r0 >= r1) goto L2a
            r1 = r4[r0]
            float r1 = r1.b()
            float r1 = r1 * r5
            int r2 = r6.t
            float r2 = (float) r2
            float r1 = r1 + r2
            r2 = r4[r0]
            float r2 = r2.c()
            float r2 = r2 * r5
            int r3 = r6.u
            float r3 = (float) r3
            float r2 = r2 + r3
            com.huawei.hms.scankit.p.u6 r1 = a(r1, r2, r6)
            r4[r0] = r1
            int r0 = r0 + 1
            goto L6
        L2a:
            return
    }

    public static boolean a(boolean r16, com.huawei.hms.scankit.p.p r17, com.huawei.hms.scankit.p.i2 r18) throws com.huawei.hms.scankit.p.a {
            r0 = r18
            int r1 = r17.e()
            int r2 = r17.c()
            float r3 = r0.j()
            float r4 = r0.k()
            float r5 = r0.f()
            float r6 = r0.c()
            r7 = 4
            float[] r7 = new float[r7]
            r8 = 0
            r7[r8] = r3
            r3 = 1
            r7[r3] = r4
            r4 = 2
            r7[r4] = r5
            r5 = 3
            r7[r5] = r6
            if (r16 == 0) goto L8e
            float r6 = r0.m()
            float r9 = r0.l()
            float r6 = java.lang.Math.max(r6, r9)
            r0.n = r6
            float r6 = r0.m()
            float r9 = r0.l()
            float r6 = java.lang.Math.min(r6, r9)
            r0.o = r6
            float r6 = r0.i()
            float r9 = r0.g()
            r10 = 1093664768(0x41300000, float:11.0)
            r11 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 == 0) goto L5e
            float r9 = r0.g()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L5f
        L5e:
            r6 = 0
        L5f:
            r9 = r7[r4]
            r10 = r7[r5]
            float r9 = java.lang.Math.max(r9, r10)
            r0.v = r9
            r8 = r7[r8]
            double r8 = (double) r8
            r10 = r7[r4]
            double r10 = (double) r10
            r12 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r10 = r10 * r12
            double r8 = r8 - r10
            r10 = 0
            double r8 = java.lang.Math.max(r8, r10)
            int r8 = (int) r8
            r0.r = r8
            r8 = r7[r3]
            double r8 = (double) r8
            r14 = r7[r5]
            double r14 = (double) r14
            double r14 = r14 * r12
            double r8 = r8 - r14
            double r8 = java.lang.Math.max(r8, r10)
            int r8 = (int) r8
            r0.s = r8
            goto Laa
        L8e:
            float r6 = r0.i()
            r8 = r7[r4]
            r9 = r7[r5]
            float r8 = java.lang.Math.max(r8, r9)
            r0.v = r8
            float r8 = r0.d()
            int r8 = (int) r8
            r0.r = r8
            float r8 = r0.e()
            int r8 = (int) r8
            r0.s = r8
        Laa:
            int r8 = r0.r
            int r1 = r1 - r8
            r4 = r7[r4]
            int r4 = (int) r4
            int r1 = java.lang.Math.min(r1, r4)
            r0.p = r1
            int r1 = r0.s
            int r2 = r2 - r1
            r1 = r7[r5]
            int r1 = (int) r1
            int r1 = java.lang.Math.min(r2, r1)
            r0.q = r1
            int r2 = r0.p
            if (r2 <= 0) goto Ld8
            if (r1 <= 0) goto Ld8
            int r4 = r0.r
            int r5 = r0.s
            r8 = r17
            com.huawei.hms.scankit.p.p r1 = r8.a(r4, r5, r2, r1)
            com.huawei.hms.scankit.p.k2.b = r1
            a(r1, r6, r0, r7)
            return r3
        Ld8:
            java.lang.String r0 = "crop_w <= 0 || crop_h <= 0"
            com.huawei.hms.scankit.p.a r0 = com.huawei.hms.scankit.p.a.a(r0)
            throw r0
    }

    private static int[] a(com.huawei.hms.scankit.p.s r8, com.huawei.hms.scankit.p.u6[] r9, float r10, float r11, float r12, int r13, int[] r14) {
            int r10 = (int) r10
            r0 = 0
            r1 = r10
            r2 = 0
        L4:
            int r3 = (int) r11
            int r3 = r3 + (-1)
            if (r1 >= r3) goto L1a
            int r3 = (int) r12
            boolean r4 = r8.b(r1, r3)
            int r1 = r1 + 1
            boolean r3 = r8.b(r1, r3)
            r3 = r3 ^ r4
            if (r3 == 0) goto L4
            int r2 = r2 + 1
            goto L4
        L1a:
            r11 = 0
            r1 = 0
        L1c:
            if (r11 >= r13) goto L4f
            r4 = r10
            r5 = 0
        L20:
            if (r4 >= r3) goto L32
            boolean r6 = r8.b(r4, r11)
            int r4 = r4 + 1
            boolean r7 = r8.b(r4, r11)
            r6 = r6 ^ r7
            if (r6 == 0) goto L20
            int r5 = r5 + 1
            goto L20
        L32:
            float r4 = (float) r5
            float r6 = (float) r2
            r7 = 1069547520(0x3fc00000, float:1.5)
            float r7 = r7 * r6
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 <= 0) goto L3d
            r5 = 0
        L3d:
            float r4 = (float) r5
            r7 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 * r7
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L47
            r5 = 0
        L47:
            r14[r11] = r5
            if (r5 <= r1) goto L4c
            r1 = r5
        L4c:
            int r11 = r11 + 1
            goto L1c
        L4f:
            if (r1 <= 0) goto L93
            float[] r8 = new float[r13]
            r10 = 0
        L54:
            if (r10 >= r13) goto L60
            r11 = r14[r10]
            float r11 = (float) r11
            float r2 = (float) r1
            float r11 = r11 / r2
            r8[r10] = r11
            int r10 = r10 + 1
            goto L54
        L60:
            r10 = 0
            r11 = 0
        L62:
            if (r11 >= r13) goto L6a
            r14 = r8[r11]
            float r10 = r10 + r14
            int r11 = r11 + 1
            goto L62
        L6a:
            float r11 = (float) r13
            float r10 = r10 / r11
            double r1 = (double) r10
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r11 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r11 <= 0) goto L76
            r10 = 1065185444(0x3f7d70a4, float:0.99)
        L76:
            int r11 = (int) r12
            r12 = r11
        L78:
            if (r12 < 0) goto L84
            r14 = r8[r12]
            int r14 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r14 >= 0) goto L81
            goto L85
        L81:
            int r12 = r12 + (-1)
            goto L78
        L84:
            r12 = 0
        L85:
            if (r11 >= r13) goto L91
            r14 = r8[r11]
            int r14 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r14 >= 0) goto L8e
            goto L95
        L8e:
            int r11 = r11 + 1
            goto L85
        L91:
            r11 = 0
            goto L95
        L93:
            r11 = 0
            r12 = 0
        L95:
            if (r12 != 0) goto Lc7
            if (r11 != 0) goto Lc7
            r8 = r9[r0]
            float r8 = r8.c()
            int r8 = (int) r8
            int r8 = r8 + (-10)
            if (r8 >= 0) goto La6
            r12 = 0
            goto Lb0
        La6:
            r8 = r9[r0]
            float r8 = r8.c()
            int r8 = (int) r8
            int r8 = r8 + (-10)
            r12 = r8
        Lb0:
            r8 = r9[r0]
            float r8 = r8.c()
            int r8 = (int) r8
            int r8 = r8 + 10
            int r11 = r13 + (-1)
            if (r8 <= r11) goto Lbe
            goto Lc7
        Lbe:
            r8 = r9[r0]
            float r8 = r8.c()
            int r8 = (int) r8
            int r11 = r8 + 10
        Lc7:
            int[] r8 = new int[]{r12, r11}
            return r8
    }
}
