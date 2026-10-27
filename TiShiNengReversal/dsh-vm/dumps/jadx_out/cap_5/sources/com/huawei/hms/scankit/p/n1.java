package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class n1 {
    private com.huawei.hms.scankit.p.p4 a;
    private com.huawei.hms.scankit.p.p b;
    private com.huawei.hms.scankit.p.p c;
    private com.huawei.hms.scankit.p.p d;
    private boolean e;
    private float f;
    private float g;
    private float h;
    public com.huawei.hms.scankit.p.m4 i;
    private float j;
    private int k;
    private int l;

    n1(com.huawei.hms.scankit.p.p4 r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.e = r0
            r1 = 0
            r3.f = r1
            r3.g = r1
            r3.h = r1
            r2 = 1071879553(0x3fe39581, float:1.778)
            r3.j = r2
            r3.k = r0
            r3.l = r0
            r3.a = r4
            com.huawei.hms.scankit.p.q3 r4 = new com.huawei.hms.scankit.p.q3
            com.huawei.hms.scankit.p.p4 r2 = r3.a
            r4.<init>(r2)
            com.huawei.hms.scankit.p.p r2 = new com.huawei.hms.scankit.p.p
            r2.<init>(r4)
            r3.b = r2
            com.huawei.hms.scankit.p.e4 r4 = new com.huawei.hms.scankit.p.e4
            com.huawei.hms.scankit.p.p4 r2 = r3.a
            r4.<init>(r2)
            com.huawei.hms.scankit.p.p r2 = new com.huawei.hms.scankit.p.p
            r2.<init>(r4)
            r3.c = r2
            com.huawei.hms.scankit.p.m4 r4 = new com.huawei.hms.scankit.p.m4
            r4.<init>()
            r3.i = r4
            r3.e = r0
            r3.g = r1
            return
    }

    public static float a(float[] r12) {
            float[] r0 = com.huawei.hms.scankit.p.r3.y
            r1 = 2
            r2 = r0[r1]
            r3 = 0
            r4 = r0[r3]
            float r2 = r2 - r4
            r4 = 3
            r5 = r0[r4]
            r6 = 1
            r0 = r0[r6]
            float r5 = r5 - r0
            float r2 = r2 * r5
            double r7 = (double) r2
            r9 = 0
            r5 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L1b
            return r5
        L1b:
            r7 = r12[r1]
            r8 = r12[r3]
            float r7 = r7 - r8
            r8 = r12[r4]
            r6 = r12[r6]
            float r8 = r8 - r6
            float r7 = r7 * r8
            float r2 = r2 + r7
            float r0 = java.lang.Math.max(r0, r6)
            float[] r6 = com.huawei.hms.scankit.p.r3.y
            r6 = r6[r4]
            r4 = r12[r4]
            float r4 = java.lang.Math.min(r6, r4)
            float[] r6 = com.huawei.hms.scankit.p.r3.y
            r6 = r6[r3]
            r3 = r12[r3]
            float r3 = java.lang.Math.max(r6, r3)
            float[] r6 = com.huawei.hms.scankit.p.r3.y
            r6 = r6[r1]
            r12 = r12[r1]
            float r12 = java.lang.Math.min(r6, r12)
            int r1 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r1 >= 0) goto L5e
            int r1 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r1 < 0) goto L53
            goto L5e
        L53:
            float r4 = r4 - r0
            float r12 = r12 - r3
            float r4 = r4 * r12
            float r2 = r2 - r4
            float r4 = r4 / r2
            r12 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 * r12
            return r4
        L5e:
            return r5
    }

    private com.huawei.hms.scankit.p.p a(com.huawei.hms.scankit.p.p r9) {
            r8 = this;
            int r0 = r9.e()
            int r1 = r9.c()
            double r2 = (double) r0
            r4 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            double r2 = r2 * r4
            int r2 = (int) r2
            double r6 = (double) r1
            double r6 = r6 * r4
            int r3 = (int) r6
            int r4 = r8.k
            int r0 = r0 - r2
            int r0 = r0 / 2
            int r4 = r4 + r0
            r8.k = r4
            int r4 = r8.l
            int r1 = r1 - r3
            int r1 = r1 / 2
            int r4 = r4 + r1
            r8.l = r4
            com.huawei.hms.scankit.p.p r9 = r9.a(r0, r1, r2, r3)
            return r9
    }

    public static com.huawei.hms.scankit.p.p a(byte[] r9, int r10, int r11) throws com.huawei.hms.scankit.p.a {
            byte[] r1 = com.huawei.hms.scankit.util.LoadOpencvJNIUtil.sharpen(r9, r11, r10)
            if (r1 == 0) goto L1d
            com.huawei.hms.scankit.p.e6 r0 = new com.huawei.hms.scankit.p.e6
            r5 = 0
            r8 = 0
            r4 = 0
            r6 = r10
            r7 = r11
            r2 = r10
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            com.huawei.hms.scankit.p.e4 r9 = new com.huawei.hms.scankit.p.e4
            r9.<init>(r0)
            com.huawei.hms.scankit.p.p r10 = new com.huawei.hms.scankit.p.p
            r10.<init>(r9)
            return r10
        L1d:
            com.huawei.hms.scankit.p.a r9 = com.huawei.hms.scankit.p.a.a()
            throw r9
    }

    private com.huawei.hms.scankit.p.s6 a(com.huawei.hms.scankit.p.a5 r6, com.huawei.hms.scankit.p.p4 r7, com.huawei.hms.scankit.p.p r8, java.util.Map<com.huawei.hms.scankit.p.l1, java.lang.Object> r9, float r10, com.huawei.hms.scankit.p.i2 r11) throws com.huawei.hms.scankit.p.a {
            r5 = this;
            boolean r0 = com.huawei.hms.scankit.p.r3.a
            r1 = 6
            r2 = 3
            r3 = 0
            if (r0 == 0) goto L56
            boolean r0 = com.huawei.hms.scankit.p.r3.b
            if (r0 != 0) goto L56
            com.huawei.hms.scankit.p.q3 r0 = new com.huawei.hms.scankit.p.q3     // Catch: com.huawei.hms.scankit.p.a -> L2c
            r0.<init>(r7)     // Catch: com.huawei.hms.scankit.p.a -> L2c
            com.huawei.hms.scankit.p.p r4 = new com.huawei.hms.scankit.p.p     // Catch: com.huawei.hms.scankit.p.a -> L2c
            r4.<init>(r0)     // Catch: com.huawei.hms.scankit.p.a -> L2c
            com.huawei.hms.scankit.p.s6 r3 = r6.a(r4, r9)     // Catch: com.huawei.hms.scankit.p.a -> L29
            if (r3 == 0) goto L2e
            java.lang.String r8 = r3.k()     // Catch: com.huawei.hms.scankit.p.a -> L29
            if (r8 == 0) goto L2e
            com.huawei.hms.scankit.p.u6[] r8 = r3.j()     // Catch: com.huawei.hms.scankit.p.a -> L29
            com.huawei.hms.scankit.p.k2.a(r8, r10, r11)     // Catch: com.huawei.hms.scankit.p.a -> L29
            return r3
        L29:
            r8 = r4
            goto L2d
        L2c:
        L2d:
            r4 = r8
        L2e:
            if (r3 == 0) goto L56
            com.huawei.hms.scankit.p.u6[] r8 = r3.j()
            if (r8 == 0) goto L56
            com.huawei.hms.scankit.p.u6[] r8 = r3.j()
            int r8 = r8.length
            if (r8 < r2) goto L56
            double[] r8 = new double[r1]
            r8 = {x00aa: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 4607182418800017408} // fill-array
            com.huawei.hms.scankit.p.s6 r3 = r5.a(r4, r9, r3, r8)     // Catch: com.huawei.hms.scankit.p.a -> L56
            if (r3 == 0) goto L56
            java.lang.String r8 = r3.k()     // Catch: com.huawei.hms.scankit.p.a -> L56
            if (r8 == 0) goto L56
            com.huawei.hms.scankit.p.u6[] r8 = r3.j()     // Catch: com.huawei.hms.scankit.p.a -> L56
            com.huawei.hms.scankit.p.k2.a(r8, r10, r11)     // Catch: com.huawei.hms.scankit.p.a -> L56
            return r3
        L56:
            com.huawei.hms.scankit.p.e4 r8 = new com.huawei.hms.scankit.p.e4
            r8.<init>(r7)
            com.huawei.hms.scankit.p.p r7 = new com.huawei.hms.scankit.p.p
            r7.<init>(r8)
            com.huawei.hms.scankit.p.s6 r3 = r6.a(r7, r9)     // Catch: com.huawei.hms.scankit.p.a -> L79
            if (r3 == 0) goto L74
            java.lang.String r6 = r3.k()     // Catch: com.huawei.hms.scankit.p.a -> L79
            if (r6 == 0) goto L74
            com.huawei.hms.scankit.p.u6[] r6 = r3.j()     // Catch: com.huawei.hms.scankit.p.a -> L79
            com.huawei.hms.scankit.p.k2.a(r6, r10, r11)     // Catch: com.huawei.hms.scankit.p.a -> L79
            return r3
        L74:
            com.huawei.hms.scankit.p.a r6 = com.huawei.hms.scankit.p.a.a()     // Catch: com.huawei.hms.scankit.p.a -> L79
            throw r6     // Catch: com.huawei.hms.scankit.p.a -> L79
        L79:
            boolean r6 = com.huawei.hms.scankit.p.r3.a
            if (r6 == 0) goto La9
            boolean r6 = com.huawei.hms.scankit.p.r3.b
            if (r6 != 0) goto La9
            if (r3 == 0) goto La9
            com.huawei.hms.scankit.p.u6[] r6 = r3.j()
            if (r6 == 0) goto La9
            com.huawei.hms.scankit.p.u6[] r6 = r3.j()
            int r6 = r6.length
            if (r6 < r2) goto La9
            double[] r6 = new double[r1]
            r6 = {x00c6: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 4607182418800017408} // fill-array
            com.huawei.hms.scankit.p.s6 r3 = r5.a(r7, r9, r3, r6)
            if (r3 == 0) goto La9
            java.lang.String r6 = r3.k()
            if (r6 == 0) goto La9
            com.huawei.hms.scankit.p.u6[] r6 = r3.j()
            com.huawei.hms.scankit.p.k2.a(r6, r10, r11)
        La9:
            return r3
    }

    private com.huawei.hms.scankit.p.s6 a(com.huawei.hms.scankit.p.a5 r5, com.huawei.hms.scankit.p.p4 r6, com.huawei.hms.scankit.p.s6 r7, java.util.Map<com.huawei.hms.scankit.p.l1, java.lang.Object> r8, float r9, int r10, int r11) {
            r4 = this;
            boolean r0 = com.huawei.hms.scankit.p.r3.a
            r1 = 0
            if (r0 == 0) goto L74
            r0 = 3
            com.huawei.hms.scankit.p.q3 r2 = new com.huawei.hms.scankit.p.q3     // Catch: com.huawei.hms.scankit.p.a -> L3c
            r2.<init>(r6)     // Catch: com.huawei.hms.scankit.p.a -> L3c
            com.huawei.hms.scankit.p.p r3 = new com.huawei.hms.scankit.p.p     // Catch: com.huawei.hms.scankit.p.a -> L3c
            r3.<init>(r2)     // Catch: com.huawei.hms.scankit.p.a -> L3c
            com.huawei.hms.scankit.p.s6 r1 = r5.a(r3, r8)     // Catch: com.huawei.hms.scankit.p.a -> L21
            if (r1 == 0) goto L23
            java.lang.String r2 = r1.k()     // Catch: com.huawei.hms.scankit.p.a -> L21
            if (r2 == 0) goto L23
            com.huawei.hms.scankit.p.s6 r5 = r4.a(r1, r9, r10, r11)     // Catch: com.huawei.hms.scankit.p.a -> L21
            return r5
        L21:
            goto L3a
        L23:
            if (r1 == 0) goto L3e
            com.huawei.hms.scankit.p.u6[] r2 = r1.j()     // Catch: com.huawei.hms.scankit.p.a -> L21
            if (r2 == 0) goto L3e
            com.huawei.hms.scankit.p.u6[] r2 = r1.j()     // Catch: com.huawei.hms.scankit.p.a -> L21
            int r2 = r2.length     // Catch: com.huawei.hms.scankit.p.a -> L21
            if (r2 < r0) goto L3e
            com.huawei.hms.scankit.p.u6[] r1 = r1.j()     // Catch: com.huawei.hms.scankit.p.a -> L21
            r7.b(r1)     // Catch: com.huawei.hms.scankit.p.a -> L21
            goto L3e
        L3a:
            r1 = r3
            goto L3d
        L3c:
        L3d:
            r3 = r1
        L3e:
            if (r7 == 0) goto L68
            com.huawei.hms.scankit.p.u6[] r1 = r7.j()     // Catch: com.huawei.hms.scankit.p.a -> L68
            if (r1 == 0) goto L68
            com.huawei.hms.scankit.p.u6[] r1 = r7.j()     // Catch: com.huawei.hms.scankit.p.a -> L68
            int r1 = r1.length     // Catch: com.huawei.hms.scankit.p.a -> L68
            if (r1 < r0) goto L68
            boolean r0 = com.huawei.hms.scankit.p.r3.m     // Catch: com.huawei.hms.scankit.p.a -> L68
            if (r0 != 0) goto L68
            r0 = 6
            double[] r0 = new double[r0]     // Catch: com.huawei.hms.scankit.p.a -> L68
            r0 = {x0076: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 4607182418800017408} // fill-array     // Catch: com.huawei.hms.scankit.p.a -> L68
            com.huawei.hms.scankit.p.s6 r0 = r4.a(r3, r8, r7, r0)     // Catch: com.huawei.hms.scankit.p.a -> L68
            if (r0 == 0) goto L68
            java.lang.String r1 = r0.k()     // Catch: com.huawei.hms.scankit.p.a -> L68
            if (r1 == 0) goto L68
            com.huawei.hms.scankit.p.s6 r5 = r4.a(r0, r9, r10, r11)     // Catch: com.huawei.hms.scankit.p.a -> L68
            return r5
        L68:
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r3
            r7 = r5
            r5 = r4
            com.huawei.hms.scankit.p.s6 r6 = r5.a(r6, r7, r8, r9, r10, r11)
            return r6
        L74:
            return r1
    }

    static com.huawei.hms.scankit.p.s6 a(com.huawei.hms.scankit.p.n1 r15) {
            com.huawei.hms.scankit.p.p r0 = r15.b
            float r0 = r15.c(r0)
            com.huawei.hms.scankit.p.s6 r1 = new com.huawei.hms.scankit.p.s6
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r2)
            r1.b(r0)
            com.huawei.hms.scankit.p.i2 r3 = new com.huawei.hms.scankit.p.i2
            com.huawei.hms.scankit.p.p r0 = r15.b
            int r0 = r0.e()
            float r7 = (float) r0
            com.huawei.hms.scankit.p.p r15 = r15.b
            int r15 = r15.e()
            float r8 = (float) r15
            r13 = 0
            r14 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.b(r3)
            return r1
    }

    private com.huawei.hms.scankit.p.s6 a(com.huawei.hms.scankit.p.p r8, com.huawei.hms.scankit.p.a5 r9, com.huawei.hms.scankit.p.p4 r10, com.huawei.hms.scankit.p.s6 r11, java.util.Map<com.huawei.hms.scankit.p.l1, java.lang.Object> r12, float r13) {
            r7 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            com.huawei.hms.scankit.p.p4 r3 = r7.a     // Catch: com.huawei.hms.scankit.p.a -> L29
            com.huawei.hms.scankit.p.j6.a(r3, r11)     // Catch: com.huawei.hms.scankit.p.a -> L29
            boolean r11 = com.huawei.hms.scankit.p.r3.c     // Catch: com.huawei.hms.scankit.p.a -> L29
            if (r11 == 0) goto L2b
            boolean[] r11 = com.huawei.hms.scankit.p.r3.v     // Catch: com.huawei.hms.scankit.p.a -> L29
            boolean r11 = r11[r0]     // Catch: com.huawei.hms.scankit.p.a -> L29
            if (r11 == 0) goto L2b
            com.huawei.hms.scankit.p.r3.s = r0     // Catch: com.huawei.hms.scankit.p.a -> L29
            com.huawei.hms.scankit.p.p r11 = r7.b     // Catch: com.huawei.hms.scankit.p.a -> L29
            com.huawei.hms.scankit.p.s6 r2 = r9.a(r11, r12)     // Catch: com.huawei.hms.scankit.p.a -> L29
            com.huawei.hms.scankit.p.r3.s = r1     // Catch: com.huawei.hms.scankit.p.a -> L29
            if (r2 == 0) goto L2b
            java.lang.String r11 = r2.k()     // Catch: com.huawei.hms.scankit.p.a -> L29
            if (r11 == 0) goto L2b
            com.huawei.hms.scankit.p.s6 r8 = r7.a(r2, r13, r1, r1)     // Catch: com.huawei.hms.scankit.p.a -> L29
            return r8
        L29:
            com.huawei.hms.scankit.p.r3.s = r1
        L2b:
            int r11 = r8.e()
            float r11 = (float) r11
            int r8 = r8.c()
            float r8 = (float) r8
            float r11 = r11 / r8
            r8 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r3 >= 0) goto L3e
            float r11 = r8 / r11
        L3e:
            boolean r8 = com.huawei.hms.scankit.p.r3.m
            if (r8 != 0) goto L78
            boolean r8 = com.huawei.hms.scankit.p.r3.n
            if (r8 != 0) goto L78
            double r3 = (double) r11
            r5 = 4608398390699407442(0x3ff451eb851eb852, double:1.27)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L78
            r5 = 4608407397898662183(0x3ff45a1cac083127, double:1.272)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 >= 0) goto L78
            com.huawei.hms.scankit.p.r3.u = r0
            com.huawei.hms.scankit.p.e4 r8 = new com.huawei.hms.scankit.p.e4     // Catch: com.huawei.hms.scankit.p.a -> L76
            r8.<init>(r10)     // Catch: com.huawei.hms.scankit.p.a -> L76
            com.huawei.hms.scankit.p.p r10 = new com.huawei.hms.scankit.p.p     // Catch: com.huawei.hms.scankit.p.a -> L76
            r10.<init>(r8)     // Catch: com.huawei.hms.scankit.p.a -> L76
            com.huawei.hms.scankit.p.s6 r2 = r9.a(r10, r12)     // Catch: com.huawei.hms.scankit.p.a -> L76
            if (r2 == 0) goto L76
            java.lang.String r8 = r2.k()     // Catch: com.huawei.hms.scankit.p.a -> L76
            if (r8 == 0) goto L76
            com.huawei.hms.scankit.p.s6 r8 = r7.a(r2, r13, r1, r1)     // Catch: com.huawei.hms.scankit.p.a -> L76
            return r8
        L76:
            com.huawei.hms.scankit.p.r3.u = r1
        L78:
            return r2
    }

    private com.huawei.hms.scankit.p.s6 a(com.huawei.hms.scankit.p.p r21, com.huawei.hms.scankit.p.s6 r22, com.huawei.hms.scankit.p.s6 r23, com.huawei.hms.scankit.p.a5 r24, java.util.Map<com.huawei.hms.scankit.p.l1, java.lang.Object> r25, float r26, com.huawei.hms.scankit.p.i2 r27) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = 0
            boolean r7 = com.huawei.hms.scankit.p.r3.a     // Catch: com.huawei.hms.scankit.p.a -> L6d
            if (r7 == 0) goto L6f
            byte[] r7 = r1.d()     // Catch: com.huawei.hms.scankit.p.a -> L6d
            int r8 = r1.e()     // Catch: com.huawei.hms.scankit.p.a -> L6d
            int r9 = r1.c()     // Catch: com.huawei.hms.scankit.p.a -> L6d
            com.huawei.hms.scankit.p.s r7 = a(r7, r8, r9, r6)     // Catch: com.huawei.hms.scankit.p.a -> L6d
            r1.a(r7)     // Catch: com.huawei.hms.scankit.p.a -> L6d
            com.huawei.hms.scankit.p.s6 r7 = r2.a(r1, r3)     // Catch: com.huawei.hms.scankit.p.a -> L6d
            if (r7 == 0) goto L5b
            java.lang.String r8 = r7.k()     // Catch: com.huawei.hms.scankit.p.a -> L57
            if (r8 != 0) goto L5b
            com.huawei.hms.scankit.p.u6[] r8 = r7.j()     // Catch: com.huawei.hms.scankit.p.a -> L57
            if (r8 == 0) goto L5b
            com.huawei.hms.scankit.p.u6[] r8 = r7.j()     // Catch: com.huawei.hms.scankit.p.a -> L57
            int r8 = r8.length     // Catch: com.huawei.hms.scankit.p.a -> L57
            r9 = 3
            if (r8 < r9) goto L5b
            com.huawei.hms.scankit.p.s6 r8 = new com.huawei.hms.scankit.p.s6     // Catch: com.huawei.hms.scankit.p.a -> L57
            com.huawei.hms.scankit.p.u6[] r9 = r7.j()     // Catch: com.huawei.hms.scankit.p.a -> L57
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r10 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.k     // Catch: com.huawei.hms.scankit.p.a -> L57
            r11 = 0
            r8.<init>(r11, r11, r9, r10)     // Catch: com.huawei.hms.scankit.p.a -> L57
            r9 = 6
            double[] r9 = new double[r9]     // Catch: com.huawei.hms.scankit.p.a -> L55
            r9 = {x01e8: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 4607182418800017408} // fill-array     // Catch: com.huawei.hms.scankit.p.a -> L55
            com.huawei.hms.scankit.p.s6 r7 = r0.a(r1, r3, r7, r9)     // Catch: com.huawei.hms.scankit.p.a -> L55
            goto L5d
        L55:
            goto L7b
        L57:
        L58:
            r8 = r23
            goto L7b
        L5b:
            r8 = r23
        L5d:
            if (r7 == 0) goto L73
            java.lang.String r9 = r7.k()     // Catch: com.huawei.hms.scankit.p.a -> L55
            if (r9 == 0) goto L73
            com.huawei.hms.scankit.p.u6[] r9 = r7.j()     // Catch: com.huawei.hms.scankit.p.a -> L55
            com.huawei.hms.scankit.p.k2.a(r9, r4, r5)     // Catch: com.huawei.hms.scankit.p.a -> L55
            return r7
        L6d:
            goto L78
        L6f:
            r7 = r22
            r8 = r23
        L73:
            com.huawei.hms.scankit.p.a r9 = com.huawei.hms.scankit.p.a.a()     // Catch: com.huawei.hms.scankit.p.a -> L55
            throw r9     // Catch: com.huawei.hms.scankit.p.a -> L55
        L78:
            r7 = r22
            goto L58
        L7b:
            if (r7 == 0) goto L83
            java.lang.String r9 = r7.k()
            if (r9 != 0) goto Lb6
        L83:
            boolean r9 = com.huawei.hms.scankit.p.r3.c
            if (r9 == 0) goto Lb6
            boolean r9 = com.huawei.hms.scankit.p.r3.b
            if (r9 != 0) goto Lb6
            byte[] r9 = r1.d()     // Catch: com.huawei.hms.scankit.p.a -> Laf
            int r10 = r1.e()     // Catch: com.huawei.hms.scankit.p.a -> Laf
            int r11 = r1.c()     // Catch: com.huawei.hms.scankit.p.a -> Laf
            com.huawei.hms.scankit.p.p r9 = a(r9, r10, r11)     // Catch: com.huawei.hms.scankit.p.a -> Laf
            com.huawei.hms.scankit.p.s6 r9 = r2.a(r9, r3)     // Catch: com.huawei.hms.scankit.p.a -> Laf
            if (r9 == 0) goto Lb1
            java.lang.String r10 = r9.k()     // Catch: com.huawei.hms.scankit.p.a -> Laf
            if (r10 == 0) goto Lb1
            com.huawei.hms.scankit.p.u6[] r10 = r9.j()     // Catch: com.huawei.hms.scankit.p.a -> Laf
            com.huawei.hms.scankit.p.k2.a(r10, r4, r5)     // Catch: com.huawei.hms.scankit.p.a -> Laf
            return r9
        Laf:
            goto Lb6
        Lb1:
            com.huawei.hms.scankit.p.a r9 = com.huawei.hms.scankit.p.a.a()     // Catch: com.huawei.hms.scankit.p.a -> Laf
            throw r9     // Catch: com.huawei.hms.scankit.p.a -> Laf
        Lb6:
            if (r7 == 0) goto Lbe
            java.lang.String r9 = r7.k()
            if (r9 != 0) goto L102
        Lbe:
            boolean r9 = com.huawei.hms.scankit.p.r3.x
            if (r9 != 0) goto Lca
            boolean r9 = com.huawei.hms.scankit.p.r3.c
            if (r9 != 0) goto L102
            boolean r9 = com.huawei.hms.scankit.p.r3.q
            if (r9 == 0) goto L102
        Lca:
            com.huawei.hms.scankit.p.e4 r9 = new com.huawei.hms.scankit.p.e4     // Catch: com.huawei.hms.scankit.p.a -> Lfb
            com.huawei.hms.scankit.p.o r10 = r1.a()     // Catch: com.huawei.hms.scankit.p.a -> Lfb
            com.huawei.hms.scankit.p.p4 r10 = r10.c()     // Catch: com.huawei.hms.scankit.p.a -> Lfb
            r9.<init>(r10)     // Catch: com.huawei.hms.scankit.p.a -> Lfb
            com.huawei.hms.scankit.p.p r10 = new com.huawei.hms.scankit.p.p     // Catch: com.huawei.hms.scankit.p.a -> Lfb
            r10.<init>(r9)     // Catch: com.huawei.hms.scankit.p.a -> Lfb
            com.huawei.hms.scankit.p.s r1 = r1.b()     // Catch: com.huawei.hms.scankit.p.a -> Lfb
            com.huawei.hms.scankit.p.s r1 = r1.d()     // Catch: com.huawei.hms.scankit.p.a -> Lfb
            r10.a(r1)     // Catch: com.huawei.hms.scankit.p.a -> Lfb
            com.huawei.hms.scankit.p.s6 r1 = r2.a(r10, r3)     // Catch: com.huawei.hms.scankit.p.a -> Lfb
            if (r1 == 0) goto Lfd
            java.lang.String r9 = r1.k()     // Catch: com.huawei.hms.scankit.p.a -> Lfb
            if (r9 == 0) goto Lfd
            com.huawei.hms.scankit.p.u6[] r9 = r1.j()     // Catch: com.huawei.hms.scankit.p.a -> Lfb
            com.huawei.hms.scankit.p.k2.a(r9, r4, r5)     // Catch: com.huawei.hms.scankit.p.a -> Lfb
            return r1
        Lfb:
            goto L102
        Lfd:
            com.huawei.hms.scankit.p.a r1 = com.huawei.hms.scankit.p.a.a()     // Catch: com.huawei.hms.scankit.p.a -> Lfb
            throw r1     // Catch: com.huawei.hms.scankit.p.a -> Lfb
        L102:
            if (r7 == 0) goto L10a
            java.lang.String r1 = r7.k()
            if (r1 != 0) goto L1e6
        L10a:
            boolean r1 = com.huawei.hms.scankit.p.r3.l
            if (r1 == 0) goto L1e6
            boolean r1 = com.huawei.hms.scankit.p.r3.b
            if (r1 != 0) goto L1e6
            float r1 = r5.d()     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            r4 = 0
            float r1 = java.lang.Math.max(r1, r4)     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            int r1 = (int) r1     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            float r7 = r5.e()     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            float r4 = java.lang.Math.max(r7, r4)     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            int r4 = (int) r4     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            float r7 = r5.f()     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            com.huawei.hms.scankit.p.p4 r9 = r0.a     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            int r9 = r9.c()     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            int r9 = r9 - r1
            float r9 = (float) r9     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            float r7 = java.lang.Math.min(r7, r9)     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            int r7 = (int) r7     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            float r5 = r5.c()     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            com.huawei.hms.scankit.p.p4 r9 = r0.a     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            int r9 = r9.a()     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            int r9 = r9 - r4
            float r9 = (float) r9     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            float r5 = java.lang.Math.min(r5, r9)     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            int r5 = (int) r5     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            com.huawei.hms.scankit.p.p4 r9 = r0.a     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            com.huawei.hms.scankit.p.p4 r9 = r9.a(r1, r4, r7, r5)     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            byte[] r9 = r9.b()     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            r10 = 8
            float[] r10 = new float[r10]     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            byte[] r12 = com.huawei.hms.scankit.util.LoadOpencvJNIUtil.QRCornerDetect(r9, r7, r5, r10)     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            int r5 = r12.length     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            if (r5 == 0) goto L1e6
            com.huawei.hms.scankit.p.e6 r11 = new com.huawei.hms.scankit.p.e6     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            r18 = 256(0x100, float:3.59E-43)
            r19 = 0
            r13 = 256(0x100, float:3.59E-43)
            r14 = 256(0x100, float:3.59E-43)
            r15 = 0
            r16 = 0
            r17 = 256(0x100, float:3.59E-43)
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            com.huawei.hms.scankit.p.k5 r5 = new com.huawei.hms.scankit.p.k5     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            r5.<init>(r11)     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            com.huawei.hms.scankit.p.p r7 = new com.huawei.hms.scankit.p.p     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            r7.<init>(r5)     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            r5 = 4
            com.huawei.hms.scankit.p.s6 r9 = r2.a(r7, r3)     // Catch: com.huawei.hms.scankit.p.a -> L1ac
            if (r9 == 0) goto L1a7
            java.lang.String r11 = r9.k()     // Catch: com.huawei.hms.scankit.p.a -> L1ac
            if (r11 == 0) goto L1a7
            com.huawei.hms.scankit.p.u6[] r11 = new com.huawei.hms.scankit.p.u6[r5]     // Catch: com.huawei.hms.scankit.p.a -> L1ac
            r13 = 0
        L188:
            if (r13 >= r5) goto L1a3
            com.huawei.hms.scankit.p.u6 r14 = new com.huawei.hms.scankit.p.u6     // Catch: com.huawei.hms.scankit.p.a -> L1ac
            int r15 = r13 * 2
            r16 = r10[r15]     // Catch: com.huawei.hms.scankit.p.a -> L1ac
            float r5 = (float) r1     // Catch: com.huawei.hms.scankit.p.a -> L1ac
            float r5 = r16 + r5
            int r15 = r15 + 1
            r15 = r10[r15]     // Catch: com.huawei.hms.scankit.p.a -> L1ac
            float r6 = (float) r4     // Catch: com.huawei.hms.scankit.p.a -> L1ac
            float r15 = r15 + r6
            r14.<init>(r5, r15)     // Catch: com.huawei.hms.scankit.p.a -> L1ac
            r11[r13] = r14     // Catch: com.huawei.hms.scankit.p.a -> L1ac
            int r13 = r13 + 1
            r5 = 4
            r6 = 0
            goto L188
        L1a3:
            r9.b(r11)     // Catch: com.huawei.hms.scankit.p.a -> L1ac
            return r9
        L1a7:
            com.huawei.hms.scankit.p.a r5 = com.huawei.hms.scankit.p.a.a()     // Catch: com.huawei.hms.scankit.p.a -> L1ac
            throw r5     // Catch: com.huawei.hms.scankit.p.a -> L1ac
        L1ac:
            r5 = 256(0x100, float:3.59E-43)
            r6 = 0
            com.huawei.hms.scankit.p.s r5 = a(r12, r5, r5, r6)     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            r7.a(r5)     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            com.huawei.hms.scankit.p.s6 r2 = r2.a(r7, r3)     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            if (r2 == 0) goto L1e1
            java.lang.String r3 = r2.k()     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            if (r3 == 0) goto L1e1
            r3 = 4
            com.huawei.hms.scankit.p.u6[] r5 = new com.huawei.hms.scankit.p.u6[r3]     // Catch: com.huawei.hms.scankit.p.a -> L1e6
        L1c5:
            if (r6 >= r3) goto L1dd
            com.huawei.hms.scankit.p.u6 r7 = new com.huawei.hms.scankit.p.u6     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            int r9 = r6 * 2
            r11 = r10[r9]     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            float r12 = (float) r1     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            float r11 = r11 + r12
            int r9 = r9 + 1
            r9 = r10[r9]     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            float r12 = (float) r4     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            float r9 = r9 + r12
            r7.<init>(r11, r9)     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            r5[r6] = r7     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            int r6 = r6 + 1
            goto L1c5
        L1dd:
            r2.b(r5)     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            return r2
        L1e1:
            com.huawei.hms.scankit.p.a r1 = com.huawei.hms.scankit.p.a.a()     // Catch: com.huawei.hms.scankit.p.a -> L1e6
            throw r1     // Catch: com.huawei.hms.scankit.p.a -> L1e6
        L1e6:
            return r8
    }

    private com.huawei.hms.scankit.p.s6 a(com.huawei.hms.scankit.p.p r17, java.util.Map<com.huawei.hms.scankit.p.l1, java.lang.Object> r18, com.huawei.hms.scankit.p.s6 r19, double[] r20) throws com.huawei.hms.scankit.p.a {
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            com.huawei.hms.scankit.p.a5 r3 = new com.huawei.hms.scankit.p.a5
            r3.<init>()
            r4 = 0
            int[] r5 = new int[]{r4, r4}
            r6 = r19
            byte[] r8 = com.huawei.hms.scankit.p.k7.a(r0, r1, r6, r5, r2)
            com.huawei.hms.scankit.p.e6 r7 = new com.huawei.hms.scankit.p.e6
            r9 = r5[r4]
            r10 = 1
            r10 = r5[r10]
            r12 = 0
            r15 = 0
            r11 = 0
            r13 = r9
            r14 = r10
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            com.huawei.hms.scankit.p.p r5 = new com.huawei.hms.scankit.p.p
            com.huawei.hms.scankit.p.q3 r8 = new com.huawei.hms.scankit.p.q3
            r8.<init>(r7)
            r5.<init>(r8)
            com.huawei.hms.scankit.p.s6 r5 = r3.a(r5, r1)     // Catch: com.huawei.hms.scankit.p.a -> L5b
            if (r5 == 0) goto L56
            java.lang.String r6 = r5.k()     // Catch: com.huawei.hms.scankit.p.a -> L5c
            if (r6 == 0) goto L56
            com.huawei.hms.scankit.p.u6[] r6 = r5.j()     // Catch: com.huawei.hms.scankit.p.a -> L5c
            int r8 = r0.e()     // Catch: com.huawei.hms.scankit.p.a -> L5c
            int r9 = r0.c()     // Catch: com.huawei.hms.scankit.p.a -> L5c
            com.huawei.hms.scankit.p.u6[] r6 = com.huawei.hms.scankit.p.k7.a(r6, r8, r9, r2)     // Catch: com.huawei.hms.scankit.p.a -> L5c
            r5.a()     // Catch: com.huawei.hms.scankit.p.a -> L5c
            r5.b(r6)     // Catch: com.huawei.hms.scankit.p.a -> L5c
            return r5
        L56:
            com.huawei.hms.scankit.p.a r6 = com.huawei.hms.scankit.p.a.a()     // Catch: com.huawei.hms.scankit.p.a -> L5c
            throw r6     // Catch: com.huawei.hms.scankit.p.a -> L5c
        L5b:
            r5 = r6
        L5c:
            com.huawei.hms.scankit.p.p r6 = new com.huawei.hms.scankit.p.p
            com.huawei.hms.scankit.p.e4 r8 = new com.huawei.hms.scankit.p.e4
            r8.<init>(r7)
            r6.<init>(r8)
            com.huawei.hms.scankit.p.s6 r5 = r3.a(r6, r1)     // Catch: com.huawei.hms.scankit.p.a -> L8e
            if (r5 == 0) goto L89
            java.lang.String r8 = r5.k()     // Catch: com.huawei.hms.scankit.p.a -> L8e
            if (r8 == 0) goto L89
            com.huawei.hms.scankit.p.u6[] r8 = r5.j()     // Catch: com.huawei.hms.scankit.p.a -> L8e
            int r9 = r0.e()     // Catch: com.huawei.hms.scankit.p.a -> L8e
            int r10 = r0.c()     // Catch: com.huawei.hms.scankit.p.a -> L8e
            com.huawei.hms.scankit.p.u6[] r8 = com.huawei.hms.scankit.p.k7.a(r8, r9, r10, r2)     // Catch: com.huawei.hms.scankit.p.a -> L8e
            r5.a()     // Catch: com.huawei.hms.scankit.p.a -> L8e
            r5.b(r8)     // Catch: com.huawei.hms.scankit.p.a -> L8e
            return r5
        L89:
            com.huawei.hms.scankit.p.a r8 = com.huawei.hms.scankit.p.a.a()     // Catch: com.huawei.hms.scankit.p.a -> L8e
            throw r8     // Catch: com.huawei.hms.scankit.p.a -> L8e
        L8e:
            byte[] r8 = r7.b()
            int r9 = r7.c()
            int r7 = r7.a()
            com.huawei.hms.scankit.p.s r4 = a(r8, r9, r7, r4)
            r6.a(r4)
            com.huawei.hms.scankit.p.s6 r5 = r3.a(r6, r1)     // Catch: com.huawei.hms.scankit.p.a -> Lc9
            if (r5 == 0) goto Lc4
            java.lang.String r1 = r5.k()     // Catch: com.huawei.hms.scankit.p.a -> Lc9
            if (r1 == 0) goto Lc4
            com.huawei.hms.scankit.p.u6[] r1 = r5.j()     // Catch: com.huawei.hms.scankit.p.a -> Lc9
            int r3 = r0.e()     // Catch: com.huawei.hms.scankit.p.a -> Lc9
            int r0 = r0.c()     // Catch: com.huawei.hms.scankit.p.a -> Lc9
            com.huawei.hms.scankit.p.u6[] r0 = com.huawei.hms.scankit.p.k7.a(r1, r3, r0, r2)     // Catch: com.huawei.hms.scankit.p.a -> Lc9
            r5.a()     // Catch: com.huawei.hms.scankit.p.a -> Lc9
            r5.b(r0)     // Catch: com.huawei.hms.scankit.p.a -> Lc9
            return r5
        Lc4:
            com.huawei.hms.scankit.p.a r0 = com.huawei.hms.scankit.p.a.a()     // Catch: com.huawei.hms.scankit.p.a -> Lc9
            throw r0     // Catch: com.huawei.hms.scankit.p.a -> Lc9
        Lc9:
            return r5
    }

    private com.huawei.hms.scankit.p.s6 a(com.huawei.hms.scankit.p.s6 r8, float r9, int r10, int r11) {
            r7 = this;
            if (r8 == 0) goto L4e
            com.huawei.hms.scankit.p.u6[] r0 = r8.j()
            int r0 = r0.length
            r1 = 4
            if (r0 != r1) goto L4e
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r9 - r0
            float r0 = java.lang.Math.abs(r0)
            r2 = 897988541(0x358637bd, float:1.0E-6)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L1d
            if (r10 != 0) goto L1d
            if (r11 == 0) goto L4e
        L1d:
            com.huawei.hms.scankit.p.u6[] r0 = new com.huawei.hms.scankit.p.u6[r1]
            r2 = 0
        L20:
            if (r2 >= r1) goto L48
            com.huawei.hms.scankit.p.u6 r3 = new com.huawei.hms.scankit.p.u6
            com.huawei.hms.scankit.p.u6[] r4 = r8.j()
            r4 = r4[r2]
            float r4 = r4.b()
            float r4 = r4 * r9
            float r5 = (float) r10
            float r4 = r4 + r5
            com.huawei.hms.scankit.p.u6[] r5 = r8.j()
            r5 = r5[r2]
            float r5 = r5.c()
            float r5 = r5 * r9
            float r6 = (float) r11
            float r5 = r5 + r6
            r3.<init>(r4, r5)
            r0[r2] = r3
            int r2 = r2 + 1
            goto L20
        L48:
            r8.a()
            r8.a(r0)
        L4e:
            return r8
    }

    static com.huawei.hms.scankit.p.s6 a(java.util.List<com.huawei.hms.scankit.p.i2> r6, com.huawei.hms.scankit.p.n1 r7) {
            java.util.Iterator r6 = r6.iterator()
        L4:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L6c
            java.lang.Object r0 = r6.next()
            com.huawei.hms.scankit.p.i2 r0 = (com.huawei.hms.scankit.p.i2) r0
            boolean r1 = com.huawei.hms.scankit.p.r3.b
            if (r1 != 0) goto L22
            float r1 = r0.h()
            double r1 = (double) r1
            r3 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L4
        L22:
            float r1 = r0.j()
            int r1 = (int) r1
            float r2 = r0.k()
            int r2 = (int) r2
            com.huawei.hms.scankit.p.p4 r3 = r7.a
            int r3 = r3.c()
            int r3 = r3 / 3
            if (r1 <= r3) goto L4
            com.huawei.hms.scankit.p.p4 r3 = r7.a
            int r3 = r3.c()
            int r3 = r3 * 2
            int r3 = r3 / 3
            if (r1 >= r3) goto L4
            com.huawei.hms.scankit.p.p4 r1 = r7.a
            int r1 = r1.a()
            int r1 = r1 / 3
            if (r2 <= r1) goto L4
            com.huawei.hms.scankit.p.p4 r1 = r7.a
            int r1 = r1.a()
            int r1 = r1 * 2
            int r1 = r1 / 3
            if (r2 >= r1) goto L4
            com.huawei.hms.scankit.p.p r6 = r7.d
            float r6 = r7.c(r6)
            com.huawei.hms.scankit.p.s6 r7 = new com.huawei.hms.scankit.p.s6
            r1 = 1065353216(0x3f800000, float:1.0)
            r7.<init>(r1)
            r7.a(r6)
            r7.a(r0)
            return r7
        L6c:
            r6 = 0
            return r6
    }

    public static com.huawei.hms.scankit.p.s a(byte[] r4, int r5, int r6, boolean r7) throws com.huawei.hms.scankit.p.a {
            int r0 = r5 / 11
            int r1 = r0 % 2
            int r0 = r0 + r1
            int r0 = r0 + (-1)
            byte[] r4 = com.huawei.hms.scankit.util.LoadOpencvJNIUtil.adaptivebinary(r4, r6, r5, r0, r7)
            if (r4 == 0) goto L2a
            com.huawei.hms.scankit.p.s r7 = new com.huawei.hms.scankit.p.s
            r7.<init>(r5, r6)
            r0 = 0
            r1 = 0
        L14:
            if (r1 >= r6) goto L29
            r2 = 0
        L17:
            if (r2 >= r5) goto L26
            int r3 = r1 * r5
            int r3 = r3 + r2
            r3 = r4[r3]
            if (r3 != 0) goto L23
            r7.c(r2, r1)
        L23:
            int r2 = r2 + 1
            goto L17
        L26:
            int r1 = r1 + 1
            goto L14
        L29:
            return r7
        L2a:
            com.huawei.hms.scankit.p.a r4 = com.huawei.hms.scankit.p.a.a()
            throw r4
    }

    private void a(java.util.List<com.huawei.hms.scankit.p.i2> r6) {
            r5 = this;
            java.util.Iterator r6 = r6.iterator()
        L4:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r6.next()
            com.huawei.hms.scankit.p.i2 r0 = (com.huawei.hms.scankit.p.i2) r0
            com.huawei.hms.scankit.p.p4 r1 = r5.a
            int r1 = r1.c()
            com.huawei.hms.scankit.p.p4 r2 = r5.a
            int r2 = r2.a()
            int r3 = r5.k
            float r3 = (float) r3
            int r4 = r5.l
            float r4 = (float) r4
            r0.a(r1, r2, r3, r4)
            float r1 = r0.i()
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 % r2
            float r1 = java.lang.Math.abs(r1)
            float r3 = r0.i()
            float r3 = r3 % r2
            float r3 = java.lang.Math.abs(r3)
            float r2 = r2 - r3
            float r1 = java.lang.Math.min(r1, r2)
            float r2 = r0.c()
            float r3 = r0.f()
            float r2 = r2 * r3
            com.huawei.hms.scankit.p.p4 r3 = r5.a
            int r3 = r3.a()
            float r3 = (float) r3
            r4 = 1063675494(0x3f666666, float:0.9)
            float r3 = r3 * r4
            com.huawei.hms.scankit.p.p4 r4 = r5.a
            int r4 = r4.c()
            float r4 = (float) r4
            float r3 = r3 * r4
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L4
            r2 = 1084227584(0x40a00000, float:5.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L4
            com.huawei.hms.scankit.p.p4 r1 = r5.a
            int r1 = r1.c()
            float r1 = (float) r1
            com.huawei.hms.scankit.p.p4 r2 = r5.a
            int r2 = r2.a()
            float r2 = (float) r2
            r0.b(r1, r2)
            goto L4
        L79:
            return
    }

    private static boolean a(com.huawei.hms.scankit.p.p r12, com.huawei.hms.scankit.p.i2 r13) {
            boolean r0 = com.huawei.hms.scankit.p.r3.a
            r1 = 1
            if (r0 == 0) goto L12b
            boolean r0 = com.huawei.hms.scankit.p.r3.b
            if (r0 != 0) goto L12b
            float r0 = r13.d()
            float r2 = r13.e()
            float r3 = r13.f()
            float r4 = r13.c()
            r5 = 1045220557(0x3e4ccccd, float:0.2)
            float r6 = r3 * r5
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r7
            float r0 = r0 - r6
            r6 = 0
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 >= 0) goto L28
            r0 = 0
        L28:
            float r5 = r5 * r4
            float r5 = r5 / r7
            float r2 = r2 - r5
            int r5 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r5 >= 0) goto L31
            goto L32
        L31:
            r6 = r2
        L32:
            r2 = 1067030938(0x3f99999a, float:1.2)
            float r3 = r3 * r2
            float r3 = r3 + r0
            int r5 = r12.e()
            float r5 = (float) r5
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L46
            int r3 = r12.e()
            float r3 = (float) r3
        L46:
            float r4 = r4 * r2
            float r4 = r4 + r6
            int r2 = r12.c()
            float r2 = (float) r2
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L57
            int r2 = r12.c()
            float r4 = (float) r2
        L57:
            float r3 = r3 - r0
            float r4 = r4 - r6
            int r2 = r12.e()
            float r2 = (float) r2
            float r2 = r2 / r7
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L12b
            int r2 = r12.c()
            float r2 = (float) r2
            float r2 = r2 / r7
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L12b
            int r0 = (int) r0
            int r2 = (int) r6
            int r3 = (int) r3
            int r4 = (int) r4
            com.huawei.hms.scankit.p.p r12 = r12.a(r0, r2, r3, r4)
            boolean r0 = com.huawei.hms.scankit.p.r3.b
            r2 = 0
            java.util.List r12 = com.huawei.hms.scankit.p.k2.a(r0, r12, r2, r1)
            java.util.Iterator r12 = r12.iterator()
        L80:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L12a
            java.lang.Object r0 = r12.next()
            com.huawei.hms.scankit.p.i2 r0 = (com.huawei.hms.scankit.p.i2) r0
            float r3 = r0.g()
            r4 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto La3
            float r3 = r0.h()
            double r3 = (double) r3
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto La3
            r3 = 1
            goto La4
        La3:
            r3 = 0
        La4:
            float r4 = r13.g()
            r5 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 != 0) goto Lc4
            float r4 = r0.g()
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 != 0) goto Lc4
            float r4 = r0.h()
            double r8 = (double) r4
            int r4 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lc4
            r4 = 1
            goto Lc5
        Lc4:
            r4 = 0
        Lc5:
            float r8 = r13.g()
            r9 = 1077936128(0x40400000, float:3.0)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 != 0) goto Le2
            float r8 = r0.g()
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 != 0) goto Le2
            float r8 = r0.h()
            double r8 = (double) r8
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 <= 0) goto Le2
            r8 = 1
            goto Le3
        Le2:
            r8 = 0
        Le3:
            float r9 = r13.g()
            r10 = 1088421888(0x40e00000, float:7.0)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 != 0) goto L100
            float r9 = r0.g()
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 != 0) goto L100
            float r9 = r0.h()
            double r9 = (double) r9
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 <= 0) goto L100
            r9 = 1
            goto L101
        L100:
            r9 = 0
        L101:
            float r10 = r13.g()
            r11 = 1086324736(0x40c00000, float:6.0)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 != 0) goto L11e
            float r10 = r0.g()
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 != 0) goto L11e
            float r0 = r0.h()
            double r10 = (double) r0
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 <= 0) goto L11e
            r0 = 1
            goto L11f
        L11e:
            r0 = 0
        L11f:
            if (r3 != 0) goto L129
            if (r4 != 0) goto L129
            if (r8 != 0) goto L129
            if (r9 != 0) goto L129
            if (r0 == 0) goto L80
        L129:
            return r1
        L12a:
            return r2
        L12b:
            return r1
    }

    public static boolean a(java.util.List<com.huawei.hms.scankit.p.i2> r3, boolean r4) {
            r0 = 0
            if (r4 != 0) goto L57
            boolean r4 = com.huawei.hms.scankit.p.r3.b
            if (r4 == 0) goto L8
            goto L57
        L8:
            java.lang.Object r3 = r3.get(r0)
            com.huawei.hms.scankit.p.i2 r3 = (com.huawei.hms.scankit.p.i2) r3
            float[] r3 = a(r3)
            float r4 = a(r3)
            com.huawei.hms.scankit.p.r3.y = r3
            r3 = 1058642330(0x3f19999a, float:0.6)
            r1 = 1
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 < 0) goto L26
            int r3 = com.huawei.hms.scankit.p.r3.z
            int r3 = r3 + r1
            com.huawei.hms.scankit.p.r3.z = r3
            goto L28
        L26:
            com.huawei.hms.scankit.p.r3.z = r1
        L28:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "iou: "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r4 = " focusAreaFrameCount: "
            r3.append(r4)
            int r4 = com.huawei.hms.scankit.p.r3.z
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "DecodeProcessor"
            com.huawei.hms.scankit.p.o4.d(r4, r3)
            int r3 = com.huawei.hms.scankit.p.r3.z
            r2 = 8
            if (r3 < r2) goto L56
            java.lang.String r3 = "need area focus"
            com.huawei.hms.scankit.p.o4.d(r4, r3)
            com.huawei.hms.scankit.p.r3.z = r1
            return r1
        L56:
            return r0
        L57:
            r3 = 4
            float[] r3 = new float[r3]
            r3 = {x0062: FILL_ARRAY_DATA , data: [0, 0, 0, 0} // fill-array
            com.huawei.hms.scankit.p.r3.y = r3
            com.huawei.hms.scankit.p.r3.z = r0
            return r0
    }

    public static float[] a(com.huawei.hms.scankit.p.i2 r5) {
            int r0 = r5.s
            float r1 = (float) r0
            int r2 = r5.r
            float r3 = (float) r2
            int r4 = r5.q
            int r0 = r0 + r4
            float r0 = (float) r0
            int r5 = r5.p
            int r2 = r2 + r5
            float r5 = (float) r2
            r2 = 4
            float[] r2 = new float[r2]
            r4 = 0
            r2[r4] = r1
            r1 = 1
            r2[r1] = r3
            r1 = 2
            r2[r1] = r0
            r0 = 3
            r2[r0] = r5
            return r2
    }

    private com.huawei.hms.scankit.p.p b(com.huawei.hms.scankit.p.p r9) {
            r8 = this;
            int r0 = r9.e()
            int r1 = r9.c()
            r2 = 0
            r3 = 4608083138725491507(0x3ff3333333333333, double:1.2)
            if (r0 >= r1) goto L26
            float r5 = (float) r1
            float r6 = (float) r0
            float r5 = r5 / r6
            double r5 = (double) r5
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L3b
            double r5 = (double) r0
            double r5 = r5 * r3
            int r3 = (int) r5
            int r1 = r1 - r3
            int r1 = r1 / 2
            r8.l = r1
            com.huawei.hms.scankit.p.p r9 = r9.a(r2, r1, r0, r3)
            return r9
        L26:
            float r5 = (float) r0
            float r6 = (float) r1
            float r5 = r5 / r6
            double r5 = (double) r5
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L3b
            double r5 = (double) r1
            double r5 = r5 * r3
            int r3 = (int) r5
            int r0 = r0 - r3
            int r0 = r0 / 2
            r8.k = r0
            com.huawei.hms.scankit.p.p r9 = r9.a(r0, r2, r3, r1)
        L3b:
            return r9
    }

    static boolean b(com.huawei.hms.scankit.p.p r8, com.huawei.hms.scankit.p.i2 r9) {
            boolean r0 = com.huawei.hms.scankit.p.r3.a
            r1 = 0
            if (r0 == 0) goto L7f
            boolean r0 = com.huawei.hms.scankit.p.r3.b
            if (r0 != 0) goto L7f
            float r0 = r9.d()
            float r2 = r9.e()
            float r3 = r9.f()
            float r9 = r9.c()
            r4 = 1045220557(0x3e4ccccd, float:0.2)
            float r5 = r3 * r4
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r0 = r0 - r5
            r5 = 0
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 >= 0) goto L28
            r0 = 0
        L28:
            float r4 = r4 * r9
            float r4 = r4 / r6
            float r2 = r2 - r4
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 >= 0) goto L31
            goto L32
        L31:
            r5 = r2
        L32:
            r2 = 1067030938(0x3f99999a, float:1.2)
            float r3 = r3 * r2
            float r3 = r3 + r0
            int r4 = r8.e()
            float r4 = (float) r4
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L46
            int r3 = r8.e()
            float r3 = (float) r3
        L46:
            float r9 = r9 * r2
            float r9 = r9 + r5
            int r2 = r8.c()
            float r2 = (float) r2
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 <= 0) goto L57
            int r9 = r8.c()
            float r9 = (float) r9
        L57:
            float r3 = r3 - r0
            float r9 = r9 - r5
            int r0 = (int) r0
            int r2 = (int) r5
            int r3 = (int) r3
            int r9 = (int) r9
            com.huawei.hms.scankit.p.p r8 = r8.a(r0, r2, r3, r9)
            boolean r9 = com.huawei.hms.scankit.p.r3.b
            r0 = 1
            java.util.List r8 = com.huawei.hms.scankit.p.k2.a(r9, r8, r1, r0)
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L7f
            java.lang.Object r8 = r8.get(r1)
            com.huawei.hms.scankit.p.i2 r8 = (com.huawei.hms.scankit.p.i2) r8
            float r8 = r8.g()
            r9 = 1086324736(0x40c00000, float:6.0)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 != 0) goto L7f
            return r0
        L7f:
            return r1
    }

    public com.huawei.hms.scankit.p.p a() {
            r1 = this;
            com.huawei.hms.scankit.p.p r0 = r1.b
            return r0
    }

    public com.huawei.hms.scankit.p.s6 a(java.util.List<com.huawei.hms.scankit.aiscan.common.BarcodeFormat> r14, com.huawei.hms.scankit.p.i2 r15) {
            r13 = this;
            com.huawei.hms.scankit.p.a5 r0 = new com.huawei.hms.scankit.p.a5
            r0.<init>()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            com.huawei.hms.scankit.p.l1 r1 = com.huawei.hms.scankit.p.l1.c
            r3.put(r1, r14)
            boolean r14 = com.huawei.hms.scankit.p.r3.c
            if (r14 == 0) goto L1e
            com.huawei.hms.scankit.p.l1 r14 = com.huawei.hms.scankit.p.l1.d
            boolean r1 = com.huawei.hms.scankit.p.r3.c
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3.put(r14, r1)
        L1e:
            if (r15 == 0) goto L2f
            com.huawei.hms.scankit.p.p r1 = r13.b     // Catch: com.huawei.hms.scankit.p.a -> L3a
            com.huawei.hms.scankit.p.p r2 = r13.d     // Catch: com.huawei.hms.scankit.p.a -> L3a
            com.huawei.hms.scankit.p.m4 r4 = r13.i     // Catch: com.huawei.hms.scankit.p.a -> L3a
            r5 = r15
            com.huawei.hms.scankit.p.s6 r14 = r0.a(r1, r2, r3, r4, r5)     // Catch: com.huawei.hms.scankit.p.a -> L2d
            r15 = r5
            goto L3b
        L2d:
            r15 = r5
            goto L3a
        L2f:
            com.huawei.hms.scankit.p.p r1 = r13.b     // Catch: com.huawei.hms.scankit.p.a -> L3a
            com.huawei.hms.scankit.p.m4 r4 = r13.i     // Catch: com.huawei.hms.scankit.p.a -> L3a
            r5 = 0
            r2 = 0
            com.huawei.hms.scankit.p.s6 r14 = r0.a(r1, r2, r3, r4, r5)     // Catch: com.huawei.hms.scankit.p.a -> L3a
            goto L3b
        L3a:
            r14 = 0
        L3b:
            if (r14 != 0) goto Lce
            boolean r1 = com.huawei.hms.scankit.p.r3.b
            if (r1 != 0) goto Lce
            if (r15 == 0) goto Lce
            boolean r1 = com.huawei.hms.scankit.p.r3.c
            if (r1 == 0) goto Lce
            float r1 = r15.h()
            double r1 = (double) r1
            r4 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 >= 0) goto Lce
            float r1 = r15.i()
            r2 = 1127481344(0x43340000, float:180.0)
            float r1 = r1 % r2
            float r2 = r15.c()
            double r4 = (double) r2
            com.huawei.hms.scankit.p.p r2 = r13.b
            int r2 = r2.c()
            double r6 = (double) r2
            r8 = 4606912202822375178(0x3fef0a3d70a3d70a, double:0.97)
            double r6 = r6 * r8
            r2 = 0
            r10 = 1
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 <= 0) goto L8f
            r4 = 1084227584(0x40a00000, float:5.0)
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 >= 0) goto L81
            r4 = -1063256064(0xffffffffc0a00000, float:-5.0)
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 > 0) goto L8d
        L81:
            r4 = -1020329984(0xffffffffc32f0000, float:-175.0)
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 < 0) goto L8d
            r4 = 1127153664(0x432f0000, float:175.0)
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 <= 0) goto L8f
        L8d:
            r4 = 1
            goto L90
        L8f:
            r4 = 0
        L90:
            float r15 = r15.b()
            double r5 = (double) r15
            com.huawei.hms.scankit.p.p r15 = r13.b
            int r15 = r15.e()
            double r11 = (double) r15
            double r11 = r11 * r8
            int r15 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r15 <= 0) goto Lbb
            r15 = 1119748096(0x42be0000, float:95.0)
            int r15 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r15 >= 0) goto Lae
            r15 = 1118437376(0x42aa0000, float:85.0)
            int r15 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r15 > 0) goto Lba
        Lae:
            r15 = -1029046272(0xffffffffc2aa0000, float:-85.0)
            int r15 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r15 >= 0) goto Lbb
            r15 = -1027735552(0xffffffffc2be0000, float:-95.0)
            int r15 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r15 <= 0) goto Lbb
        Lba:
            r2 = 1
        Lbb:
            if (r4 != 0) goto Lbf
            if (r2 == 0) goto Lce
        Lbf:
            com.huawei.hms.scankit.p.m4 r15 = r13.i
            r15.a()
            com.huawei.hms.scankit.p.p r1 = r13.b     // Catch: com.huawei.hms.scankit.p.a -> Lce
            com.huawei.hms.scankit.p.m4 r4 = r13.i     // Catch: com.huawei.hms.scankit.p.a -> Lce
            r5 = 0
            r2 = 0
            com.huawei.hms.scankit.p.s6 r14 = r0.a(r1, r2, r3, r4, r5)     // Catch: com.huawei.hms.scankit.p.a -> Lce
        Lce:
            return r14
    }

    public com.huawei.hms.scankit.p.s6 a(java.util.Map<com.huawei.hms.scankit.p.l1, java.lang.Object> r13) {
            r12 = this;
            com.huawei.hms.scankit.p.a5 r1 = new com.huawei.hms.scankit.p.a5
            r1.<init>()
            com.huawei.hms.scankit.p.p4 r0 = r12.a
            boolean r2 = com.huawei.hms.scankit.p.r3.a
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L89
            com.huawei.hms.scankit.p.p r2 = r12.b
            int r2 = r2.e()
            r3 = 800(0x320, float:1.121E-42)
            if (r2 > r3) goto L1f
            com.huawei.hms.scankit.p.p r2 = r12.b
            int r2 = r2.c()
            if (r2 <= r3) goto L89
        L1f:
            com.huawei.hms.scankit.p.p r0 = r12.b
            int r0 = r0.e()
            com.huawei.hms.scankit.p.p r2 = r12.b
            int r2 = r2.c()
            int r0 = java.lang.Math.max(r0, r2)
            float r0 = (float) r0
            r2 = 1145569280(0x44480000, float:800.0)
            float r0 = r0 / r2
            boolean r2 = com.huawei.hms.scankit.p.r3.c
            if (r2 == 0) goto L77
            com.huawei.hms.scankit.p.p r2 = r12.b
            int r2 = r2.e()
            float r2 = (float) r2
            com.huawei.hms.scankit.p.p r3 = r12.b
            int r3 = r3.c()
            float r3 = (float) r3
            float r4 = r12.j
            float r3 = r3 * r4
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L63
            com.huawei.hms.scankit.p.p r2 = r12.b
            int r2 = r2.c()
            float r2 = (float) r2
            com.huawei.hms.scankit.p.p r3 = r12.b
            int r3 = r3.e()
            float r3 = (float) r3
            float r4 = r12.j
            float r3 = r3 * r4
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L77
        L63:
            com.huawei.hms.scankit.p.p r0 = r12.b
            int r0 = r0.e()
            com.huawei.hms.scankit.p.p r2 = r12.b
            int r2 = r2.c()
            int r0 = java.lang.Math.min(r0, r2)
            float r0 = (float) r0
            r2 = 1146552320(0x44570000, float:860.0)
            float r0 = r0 / r2
        L77:
            com.huawei.hms.scankit.p.m4 r2 = r12.i
            com.huawei.hms.scankit.p.p r3 = r12.b
            com.huawei.hms.scankit.p.p r2 = r2.d(r3, r0)
            com.huawei.hms.scankit.p.o r2 = r2.a()
            com.huawei.hms.scankit.p.p4 r2 = r2.c()
            r5 = r0
            goto L8c
        L89:
            r2 = r0
            r5 = 1065353216(0x3f800000, float:1.0)
        L8c:
            r0 = 0
            if (r2 != 0) goto L90
            return r0
        L90:
            com.huawei.hms.scankit.p.p r3 = new com.huawei.hms.scankit.p.p
            com.huawei.hms.scankit.p.q3 r4 = new com.huawei.hms.scankit.p.q3
            r4.<init>(r2)
            r3.<init>(r4)
            com.huawei.hms.scankit.p.p4 r4 = r12.a
            com.huawei.hms.scankit.p.j6.a(r4)
            r9 = 3
            r10 = 0
            boolean r4 = com.huawei.hms.scankit.p.r3.a     // Catch: com.huawei.hms.scankit.p.a -> Lb9
            if (r4 == 0) goto Lbb
            byte[] r4 = r2.b()     // Catch: com.huawei.hms.scankit.p.a -> Lb9
            int r6 = r2.c()     // Catch: com.huawei.hms.scankit.p.a -> Lb9
            int r7 = r2.a()     // Catch: com.huawei.hms.scankit.p.a -> Lb9
            com.huawei.hms.scankit.p.s r4 = a(r4, r6, r7, r10)     // Catch: com.huawei.hms.scankit.p.a -> Lb9
            r3.a(r4)     // Catch: com.huawei.hms.scankit.p.a -> Lb9
            goto Lbb
        Lb9:
            goto Le8
        Lbb:
            com.huawei.hms.scankit.p.s6 r3 = r1.a(r3, r13)     // Catch: com.huawei.hms.scankit.p.a -> Lb9
            if (r3 == 0) goto Lcc
            java.lang.String r4 = r3.k()     // Catch: com.huawei.hms.scankit.p.a -> Lb9
            if (r4 == 0) goto Lcc
            com.huawei.hms.scankit.p.s6 r13 = r12.a(r3, r5, r10, r10)     // Catch: com.huawei.hms.scankit.p.a -> Lb9
            return r13
        Lcc:
            if (r3 == 0) goto Le8
            com.huawei.hms.scankit.p.u6[] r4 = r3.j()     // Catch: com.huawei.hms.scankit.p.a -> Lb9
            if (r4 == 0) goto Le8
            com.huawei.hms.scankit.p.u6[] r4 = r3.j()     // Catch: com.huawei.hms.scankit.p.a -> Lb9
            int r4 = r4.length     // Catch: com.huawei.hms.scankit.p.a -> Lb9
            if (r4 < r9) goto Le8
            com.huawei.hms.scankit.p.s6 r4 = new com.huawei.hms.scankit.p.s6     // Catch: com.huawei.hms.scankit.p.a -> Lb9
            com.huawei.hms.scankit.p.u6[] r3 = r3.j()     // Catch: com.huawei.hms.scankit.p.a -> Lb9
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r6 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.k     // Catch: com.huawei.hms.scankit.p.a -> Lb9
            r4.<init>(r0, r0, r3, r6)     // Catch: com.huawei.hms.scankit.p.a -> Lb9
            r11 = r4
            goto Le9
        Le8:
            r11 = r0
        Le9:
            if (r11 != 0) goto Lf3
            com.huawei.hms.scankit.p.s6 r3 = new com.huawei.hms.scankit.p.s6
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r4 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.k
            r3.<init>(r0, r0, r0, r4)
            goto Lf4
        Lf3:
            r3 = r11
        Lf4:
            boolean r0 = com.huawei.hms.scankit.p.r3.c
            if (r0 == 0) goto L101
            r6 = 0
            r7 = 0
            r0 = r12
            r4 = r13
            com.huawei.hms.scankit.p.s6 r3 = r0.a(r1, r2, r3, r4, r5, r6, r7)
            goto L102
        L101:
            r0 = r12
        L102:
            if (r3 == 0) goto L10b
            java.lang.String r13 = r3.k()
            if (r13 == 0) goto L10b
            return r3
        L10b:
            if (r3 == 0) goto L114
            com.huawei.hms.scankit.p.u6[] r13 = r3.j()
            if (r13 == 0) goto L114
            r11 = r3
        L114:
            boolean r13 = com.huawei.hms.scankit.p.r3.c
            if (r13 != 0) goto L152
            if (r11 == 0) goto L152
            com.huawei.hms.scankit.p.u6[] r13 = r11.j()
            if (r13 == 0) goto L152
            com.huawei.hms.scankit.p.u6[] r13 = r11.j()
            int r13 = r13.length
            if (r13 < r9) goto L152
            r12.a(r11, r5, r10, r10)
            com.huawei.hms.scankit.p.p4 r13 = r0.a
            int r13 = r13.c()
            com.huawei.hms.scankit.p.p4 r1 = r0.a
            int r1 = r1.a()
            com.huawei.hms.scankit.p.u6[] r2 = r11.j()
            float r13 = com.huawei.hms.scankit.p.o8.a(r13, r1, r2)
            float r8 = r8 - r13
            float r1 = java.lang.Math.abs(r8)
            double r1 = (double) r1
            r3 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L152
            r0.f = r13
            r13 = 1
            r0.e = r13
        L152:
            return r11
    }

    public com.huawei.hms.scankit.p.s6 a(java.util.Map<com.huawei.hms.scankit.p.l1, java.lang.Object> r12, com.huawei.hms.scankit.p.i2 r13) {
            r11 = this;
            com.huawei.hms.scankit.p.a5 r4 = new com.huawei.hms.scankit.p.a5
            r4.<init>()
            com.huawei.hms.scankit.p.p r0 = r11.d
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            r8 = 1
            com.huawei.hms.scankit.p.r3.h = r8
            int r0 = r0.e()
            com.huawei.hms.scankit.p.p r2 = r11.d
            int r2 = r2.c()
            if (r0 <= r2) goto L21
            com.huawei.hms.scankit.p.p r0 = r11.d
            int r0 = r0.e()
            goto L27
        L21:
            com.huawei.hms.scankit.p.p r0 = r11.d
            int r0 = r0.c()
        L27:
            boolean r2 = com.huawei.hms.scankit.p.r3.a
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L45
            r2 = 500(0x1f4, float:7.0E-43)
            if (r0 <= r2) goto L45
            float r0 = (float) r0
            r2 = 1140457472(0x43fa0000, float:500.0)
            float r0 = r0 / r2
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 >= 0) goto L3b
            r0 = 1065353216(0x3f800000, float:1.0)
        L3b:
            com.huawei.hms.scankit.p.m4 r2 = r11.i
            com.huawei.hms.scankit.p.p r3 = r11.d
            com.huawei.hms.scankit.p.p r2 = r2.g(r3, r0)
            r6 = r0
            goto L49
        L45:
            com.huawei.hms.scankit.p.p r2 = r11.d
            r6 = 1065353216(0x3f800000, float:1.0)
        L49:
            r10 = 3
            boolean r0 = com.huawei.hms.scankit.p.r3.o     // Catch: com.huawei.hms.scankit.p.a -> Lb9
            if (r0 == 0) goto L65
            com.huawei.hms.scankit.p.o r0 = r2.a()     // Catch: com.huawei.hms.scankit.p.a -> Lb9
            com.huawei.hms.scankit.p.p4 r0 = r0.c()     // Catch: com.huawei.hms.scankit.p.a -> Lb9
            com.huawei.hms.scankit.p.p4 r0 = com.huawei.hms.scankit.p.j7.b(r0)     // Catch: com.huawei.hms.scankit.p.a -> Lb9
            com.huawei.hms.scankit.p.p r3 = new com.huawei.hms.scankit.p.p     // Catch: com.huawei.hms.scankit.p.a -> Lb9
            com.huawei.hms.scankit.p.q3 r5 = new com.huawei.hms.scankit.p.q3     // Catch: com.huawei.hms.scankit.p.a -> Lb9
            r5.<init>(r0)     // Catch: com.huawei.hms.scankit.p.a -> Lb9
            r3.<init>(r5)     // Catch: com.huawei.hms.scankit.p.a -> Lb9
            r2 = r3
        L65:
            com.huawei.hms.scankit.p.s6 r0 = r4.a(r2, r12)     // Catch: com.huawei.hms.scankit.p.a -> Lb9
            if (r0 == 0) goto La0
            java.lang.String r3 = r0.k()     // Catch: com.huawei.hms.scankit.p.a -> L9c
            if (r3 != 0) goto La0
            com.huawei.hms.scankit.p.u6[] r3 = r0.j()     // Catch: com.huawei.hms.scankit.p.a -> L9c
            if (r3 == 0) goto La0
            com.huawei.hms.scankit.p.u6[] r3 = r0.j()     // Catch: com.huawei.hms.scankit.p.a -> L9c
            int r3 = r3.length     // Catch: com.huawei.hms.scankit.p.a -> L9c
            if (r3 < r10) goto La0
            com.huawei.hms.scankit.p.s6 r3 = new com.huawei.hms.scankit.p.s6     // Catch: com.huawei.hms.scankit.p.a -> L9c
            com.huawei.hms.scankit.p.u6[] r5 = r0.j()     // Catch: com.huawei.hms.scankit.p.a -> L9c
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r7 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.k     // Catch: com.huawei.hms.scankit.p.a -> L9c
            r3.<init>(r1, r1, r5, r7)     // Catch: com.huawei.hms.scankit.p.a -> L9c
            r1 = 6
            double[] r1 = new double[r1]     // Catch: com.huawei.hms.scankit.p.a -> L95
            r1 = {x0110: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 4607182418800017408} // fill-array     // Catch: com.huawei.hms.scankit.p.a -> L95
            com.huawei.hms.scankit.p.s6 r0 = r11.a(r2, r12, r0, r1)     // Catch: com.huawei.hms.scankit.p.a -> L95
        L93:
            r1 = r0
            goto La2
        L95:
            r1 = r2
            r2 = r0
            r5 = r12
            r7 = r13
            r0 = r11
            goto Lc1
        L9c:
            r3 = r1
            r1 = r0
            goto Lbb
        La0:
            r3 = r1
            goto L93
        La2:
            if (r1 == 0) goto Lb4
            java.lang.String r0 = r1.k()     // Catch: com.huawei.hms.scankit.p.a -> Lb2
            if (r0 == 0) goto Lb4
            com.huawei.hms.scankit.p.u6[] r0 = r1.j()     // Catch: com.huawei.hms.scankit.p.a -> Lb2
            com.huawei.hms.scankit.p.k2.a(r0, r6, r13)     // Catch: com.huawei.hms.scankit.p.a -> Lb2
            return r1
        Lb2:
            goto Lbb
        Lb4:
            com.huawei.hms.scankit.p.a r0 = com.huawei.hms.scankit.p.a.a()     // Catch: com.huawei.hms.scankit.p.a -> Lb2
            throw r0     // Catch: com.huawei.hms.scankit.p.a -> Lb2
        Lb9:
            r3 = r1
        Lbb:
            r0 = r2
            r2 = r1
            r1 = r0
            r0 = r11
            r5 = r12
            r7 = r13
        Lc1:
            com.huawei.hms.scankit.p.s6 r12 = r0.a(r1, r2, r3, r4, r5, r6, r7)
            if (r12 == 0) goto Lce
            java.lang.String r13 = r12.k()
            if (r13 == 0) goto Lce
            return r12
        Lce:
            boolean r13 = com.huawei.hms.scankit.p.r3.c
            if (r13 != 0) goto L10f
            if (r12 == 0) goto L10f
            com.huawei.hms.scankit.p.u6[] r13 = r12.j()
            if (r13 == 0) goto L10f
            com.huawei.hms.scankit.p.u6[] r13 = r12.j()
            int r13 = r13.length
            if (r13 < r10) goto L10f
            com.huawei.hms.scankit.p.u6[] r13 = r12.j()
            com.huawei.hms.scankit.p.k2.a(r13, r6, r7)
            com.huawei.hms.scankit.p.p4 r13 = r0.a
            int r13 = r13.c()
            com.huawei.hms.scankit.p.p4 r1 = r0.a
            int r1 = r1.a()
            com.huawei.hms.scankit.p.u6[] r2 = r12.j()
            float r13 = com.huawei.hms.scankit.p.o8.a(r13, r1, r2)
            float r9 = r9 - r13
            float r1 = java.lang.Math.abs(r9)
            double r1 = (double) r1
            r3 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L10f
            r0.f = r13
            r0.e = r8
        L10f:
            return r12
    }

    public java.util.List<com.huawei.hms.scankit.p.i2> a(int r12, boolean r13) {
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = com.huawei.hms.scankit.p.r3.a
            if (r1 == 0) goto L71
            boolean r0 = com.huawei.hms.scankit.p.r3.b
            if (r0 != 0) goto L67
            byte[] r1 = com.huawei.hms.scankit.p.y4.c()
            byte[] r3 = com.huawei.hms.scankit.p.y4.a()
            byte[] r5 = com.huawei.hms.scankit.p.y4.b()
            int r2 = r1.length
            int r4 = r3.length
            int r6 = r5.length
            com.huawei.hms.scankit.util.LoadOpencvJNIUtil.setModel(r1, r2, r3, r4, r5, r6)
            com.huawei.hms.scankit.p.p r0 = r11.b
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 10
            long r1 = r1 % r3
            r3 = 2
            long r3 = r1 % r3
            r5 = 0
            r6 = 1
            r7 = 0
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 != 0) goto L36
            r3 = 1
            goto L37
        L36:
            r3 = 0
        L37:
            r9 = 3
            long r1 = r1 % r9
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 != 0) goto L3f
            r5 = 1
        L3f:
            if (r12 != 0) goto L4e
            boolean r1 = com.huawei.hms.scankit.p.r3.c
            if (r1 != 0) goto L4e
            if (r3 == 0) goto L4e
            com.huawei.hms.scankit.p.p r0 = r11.b
            com.huawei.hms.scankit.p.p r0 = r11.b(r0)
            goto L60
        L4e:
            if (r12 != 0) goto L60
            boolean r1 = com.huawei.hms.scankit.p.r3.c
            if (r1 != 0) goto L60
            if (r5 == 0) goto L60
            com.huawei.hms.scankit.p.p r0 = r11.b
            com.huawei.hms.scankit.p.p r0 = r11.b(r0)
            com.huawei.hms.scankit.p.p r0 = r11.a(r0)
        L60:
            boolean r1 = com.huawei.hms.scankit.p.r3.b
            java.util.List r12 = com.huawei.hms.scankit.p.k2.a(r1, r0, r12, r13)
            goto L6d
        L67:
            com.huawei.hms.scankit.p.p r1 = r11.b
            java.util.List r12 = com.huawei.hms.scankit.p.k2.a(r0, r1, r12, r13)
        L6d:
            r11.a(r12)
            return r12
        L71:
            return r0
    }

    public com.huawei.hms.scankit.p.s6 b(java.util.List<com.huawei.hms.scankit.aiscan.common.BarcodeFormat> r8, com.huawei.hms.scankit.p.i2 r9) {
            r7 = this;
            com.huawei.hms.scankit.p.a5 r0 = new com.huawei.hms.scankit.p.a5
            r0.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            com.huawei.hms.scankit.p.l1 r1 = com.huawei.hms.scankit.p.l1.c
            r4.put(r1, r8)
            if (r9 == 0) goto L1f
            com.huawei.hms.scankit.p.p r1 = r7.b     // Catch: com.huawei.hms.scankit.p.a -> L70
            com.huawei.hms.scankit.p.p r2 = r7.c     // Catch: com.huawei.hms.scankit.p.a -> L70
            com.huawei.hms.scankit.p.p r3 = r7.d     // Catch: com.huawei.hms.scankit.p.a -> L70
            com.huawei.hms.scankit.p.m4 r5 = r7.i     // Catch: com.huawei.hms.scankit.p.a -> L70
            r6 = r9
            com.huawei.hms.scankit.p.s6 r8 = r0.b(r1, r2, r3, r4, r5, r6)     // Catch: com.huawei.hms.scankit.p.a -> L70
            goto L2b
        L1f:
            com.huawei.hms.scankit.p.p r1 = r7.b     // Catch: com.huawei.hms.scankit.p.a -> L70
            com.huawei.hms.scankit.p.p r2 = r7.c     // Catch: com.huawei.hms.scankit.p.a -> L70
            com.huawei.hms.scankit.p.m4 r5 = r7.i     // Catch: com.huawei.hms.scankit.p.a -> L70
            r6 = 0
            r3 = 0
            com.huawei.hms.scankit.p.s6 r8 = r0.b(r1, r2, r3, r4, r5, r6)     // Catch: com.huawei.hms.scankit.p.a -> L70
        L2b:
            boolean r9 = com.huawei.hms.scankit.p.r3.c     // Catch: com.huawei.hms.scankit.p.a -> L71
            if (r9 != 0) goto L6f
            if (r8 == 0) goto L6f
            java.lang.String r9 = r8.k()     // Catch: com.huawei.hms.scankit.p.a -> L71
            if (r9 != 0) goto L6f
            com.huawei.hms.scankit.p.u6[] r9 = r8.j()     // Catch: com.huawei.hms.scankit.p.a -> L71
            if (r9 == 0) goto L6f
            com.huawei.hms.scankit.p.u6[] r9 = r8.j()     // Catch: com.huawei.hms.scankit.p.a -> L71
            int r9 = r9.length     // Catch: com.huawei.hms.scankit.p.a -> L71
            r0 = 3
            if (r9 < r0) goto L6f
            com.huawei.hms.scankit.p.p4 r9 = r7.a     // Catch: com.huawei.hms.scankit.p.a -> L71
            int r9 = r9.c()     // Catch: com.huawei.hms.scankit.p.a -> L71
            com.huawei.hms.scankit.p.p4 r0 = r7.a     // Catch: com.huawei.hms.scankit.p.a -> L71
            int r0 = r0.a()     // Catch: com.huawei.hms.scankit.p.a -> L71
            com.huawei.hms.scankit.p.u6[] r1 = r8.j()     // Catch: com.huawei.hms.scankit.p.a -> L71
            float r9 = com.huawei.hms.scankit.p.o8.b(r9, r0, r1)     // Catch: com.huawei.hms.scankit.p.a -> L71
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r9
            float r0 = java.lang.Math.abs(r0)     // Catch: com.huawei.hms.scankit.p.a -> L71
            double r0 = (double) r0     // Catch: com.huawei.hms.scankit.p.a -> L71
            r2 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L6f
            r7.h = r9     // Catch: com.huawei.hms.scankit.p.a -> L71
            r9 = 1
            r7.e = r9     // Catch: com.huawei.hms.scankit.p.a -> L71
        L6f:
            return r8
        L70:
            r8 = 0
        L71:
            return r8
    }

    public void b(com.huawei.hms.scankit.p.i2 r3) {
            r2 = this;
            boolean r0 = com.huawei.hms.scankit.p.r3.a     // Catch: com.huawei.hms.scankit.p.a -> Lf
            if (r0 == 0) goto Lf
            boolean r0 = com.huawei.hms.scankit.p.r3.b     // Catch: com.huawei.hms.scankit.p.a -> Lf
            com.huawei.hms.scankit.p.p r1 = r2.b     // Catch: com.huawei.hms.scankit.p.a -> Lf
            com.huawei.hms.scankit.p.k2.a(r0, r1, r3)     // Catch: com.huawei.hms.scankit.p.a -> Lf
            com.huawei.hms.scankit.p.p r3 = r3.l     // Catch: com.huawei.hms.scankit.p.a -> Lf
            r2.d = r3     // Catch: com.huawei.hms.scankit.p.a -> Lf
        Lf:
            return
    }

    public boolean b() {
            r1 = this;
            boolean r0 = r1.e
            return r0
    }

    public boolean b(java.util.List<com.huawei.hms.scankit.p.i2> r14) {
            r13 = this;
            java.util.Iterator r14 = r14.iterator()
        L4:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L118
            java.lang.Object r0 = r14.next()
            com.huawei.hms.scankit.p.i2 r0 = (com.huawei.hms.scankit.p.i2) r0
            float r1 = r0.g()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            r5 = 0
            r6 = 1
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L2c
            float r1 = r0.h()
            double r7 = (double) r1
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 <= 0) goto L2c
            r1 = 1
            goto L2d
        L2c:
            r1 = 0
        L2d:
            float r7 = r0.g()
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 != 0) goto L45
            float r2 = r0.h()
            double r7 = (double) r2
            r9 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 <= 0) goto L45
            r2 = 1
            goto L46
        L45:
            r2 = 0
        L46:
            float r7 = r0.g()
            r8 = 1073741824(0x40000000, float:2.0)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L5b
            float r7 = r0.h()
            double r7 = (double) r7
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 <= 0) goto L5b
            r7 = 1
            goto L5c
        L5b:
            r7 = 0
        L5c:
            float r8 = r0.g()
            r9 = 1077936128(0x40400000, float:3.0)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 != 0) goto L71
            float r8 = r0.h()
            double r8 = (double) r8
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r10 <= 0) goto L71
            r8 = 1
            goto L72
        L71:
            r8 = 0
        L72:
            float r9 = r0.g()
            r10 = 1086324736(0x40c00000, float:6.0)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 != 0) goto L87
            float r9 = r0.h()
            double r9 = (double) r9
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 <= 0) goto L87
            r9 = 1
            goto L88
        L87:
            r9 = 0
        L88:
            float r10 = r0.g()
            r11 = 1088421888(0x40e00000, float:7.0)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 != 0) goto L9d
            float r10 = r0.h()
            double r10 = (double) r10
            int r12 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r12 <= 0) goto L9d
            r3 = 1
            goto L9e
        L9d:
            r3 = 0
        L9e:
            if (r2 != 0) goto La8
            if (r7 != 0) goto La8
            if (r8 != 0) goto La8
            if (r9 != 0) goto La8
            if (r3 == 0) goto L4
        La8:
            if (r1 != 0) goto Lbe
            com.huawei.hms.scankit.p.p r1 = r13.b
            boolean r1 = a(r1, r0)
            if (r1 != 0) goto Lbe
            int r1 = com.huawei.hms.scankit.p.r3.k
            r2 = 4
            if (r1 <= r2) goto Lb8
            goto Lbe
        Lb8:
            int r1 = r1 + 2
            com.huawei.hms.scankit.p.r3.k = r1
            goto L4
        Lbe:
            com.huawei.hms.scankit.p.r3.k = r5
            com.huawei.hms.scankit.p.u6 r1 = new com.huawei.hms.scankit.p.u6
            float r2 = r0.d()
            float r3 = r0.e()
            r1.<init>(r2, r3)
            com.huawei.hms.scankit.p.u6 r2 = new com.huawei.hms.scankit.p.u6
            float r3 = r0.d()
            float r4 = r0.f()
            float r3 = r3 + r4
            float r4 = r0.e()
            r2.<init>(r3, r4)
            com.huawei.hms.scankit.p.u6 r3 = new com.huawei.hms.scankit.p.u6
            float r4 = r0.d()
            float r7 = r0.e()
            float r0 = r0.c()
            float r7 = r7 + r0
            r3.<init>(r4, r7)
            r0 = 3
            com.huawei.hms.scankit.p.u6[] r0 = new com.huawei.hms.scankit.p.u6[r0]
            r0[r5] = r1
            r0[r6] = r2
            r1 = 2
            r0[r1] = r3
            com.huawei.hms.scankit.p.p4 r1 = r13.a
            int r1 = r1.c()
            com.huawei.hms.scankit.p.p4 r2 = r13.a
            int r2 = r2.a()
            float r0 = com.huawei.hms.scankit.p.o8.b(r1, r2, r0)
            r1 = 1065361605(0x3f8020c5, float:1.001)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L4
            r13.g = r0
            r13.e = r6
            goto L4
        L118:
            boolean r14 = r13.e
            return r14
    }

    public float c() {
            r1 = this;
            float r0 = r1.f
            return r0
    }

    public float c(com.huawei.hms.scankit.p.p r9) {
            r8 = this;
            if (r9 == 0) goto L1f
            com.huawei.hms.scankit.p.o r0 = r9.a()
            if (r0 != 0) goto L12
            com.huawei.hms.scankit.p.o r0 = r9.a()
            com.huawei.hms.scankit.p.p4 r0 = r0.c()
            if (r0 == 0) goto L1f
        L12:
            com.huawei.hms.scankit.p.o r0 = r9.a()
            com.huawei.hms.scankit.p.p4 r0 = r0.c()
            byte[] r0 = r0.b()
            goto L20
        L1f:
            r0 = 0
        L20:
            if (r0 != 0) goto L25
            r9 = 1065353216(0x3f800000, float:1.0)
            return r9
        L25:
            int r1 = r9.e()
            int r9 = r9.c()
            int r2 = r9 / 4
            r3 = 0
        L31:
            int r5 = r9 * 3
            int r5 = r5 / 4
            if (r2 >= r5) goto L4e
            int r5 = r1 / 4
        L39:
            int r6 = r1 * 3
            int r6 = r6 / 4
            if (r5 >= r6) goto L4b
            int r6 = r2 * r1
            int r6 = r6 + r5
            r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            long r6 = (long) r6
            long r3 = r3 + r6
            int r5 = r5 + 1
            goto L39
        L4b:
            int r2 = r2 + 1
            goto L31
        L4e:
            int r9 = r0.length
            long r0 = (long) r9
            long r3 = r3 / r0
            r0 = 4
            long r3 = r3 * r0
            float r9 = (float) r3
            return r9
    }

    public com.huawei.hms.scankit.p.s6 c(java.util.List<com.huawei.hms.scankit.aiscan.common.BarcodeFormat> r8, com.huawei.hms.scankit.p.i2 r9) {
            r7 = this;
            com.huawei.hms.scankit.p.a5 r0 = new com.huawei.hms.scankit.p.a5
            r0.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            com.huawei.hms.scankit.p.l1 r1 = com.huawei.hms.scankit.p.l1.c
            r4.put(r1, r8)
            r8 = 0
            if (r9 == 0) goto L20
            com.huawei.hms.scankit.p.p r1 = r7.b     // Catch: com.huawei.hms.scankit.p.a -> L9c
            com.huawei.hms.scankit.p.p r2 = r7.c     // Catch: com.huawei.hms.scankit.p.a -> L9c
            com.huawei.hms.scankit.p.p r3 = r7.d     // Catch: com.huawei.hms.scankit.p.a -> L9c
            com.huawei.hms.scankit.p.m4 r5 = r7.i     // Catch: com.huawei.hms.scankit.p.a -> L9c
            r6 = r9
            com.huawei.hms.scankit.p.s6 r8 = r0.a(r1, r2, r3, r4, r5, r6)     // Catch: com.huawei.hms.scankit.p.a -> L9c
            goto L21
        L20:
            r6 = r9
        L21:
            boolean r9 = com.huawei.hms.scankit.p.r3.c     // Catch: com.huawei.hms.scankit.p.a -> L9c
            if (r9 != 0) goto L9c
            if (r8 == 0) goto L9c
            java.lang.String r9 = r8.k()     // Catch: com.huawei.hms.scankit.p.a -> L9c
            if (r9 != 0) goto L9c
            com.huawei.hms.scankit.p.u6[] r9 = r8.j()     // Catch: com.huawei.hms.scankit.p.a -> L9c
            if (r9 == 0) goto L9c
            com.huawei.hms.scankit.p.u6[] r9 = r8.j()     // Catch: com.huawei.hms.scankit.p.a -> L9c
            int r9 = r9.length     // Catch: com.huawei.hms.scankit.p.a -> L9c
            r0 = 3
            if (r9 < r0) goto L9c
            com.huawei.hms.scankit.p.u6 r9 = new com.huawei.hms.scankit.p.u6     // Catch: com.huawei.hms.scankit.p.a -> L9c
            float r1 = r6.d()     // Catch: com.huawei.hms.scankit.p.a -> L9c
            float r2 = r6.e()     // Catch: com.huawei.hms.scankit.p.a -> L9c
            r9.<init>(r1, r2)     // Catch: com.huawei.hms.scankit.p.a -> L9c
            com.huawei.hms.scankit.p.u6 r1 = new com.huawei.hms.scankit.p.u6     // Catch: com.huawei.hms.scankit.p.a -> L9c
            float r2 = r6.d()     // Catch: com.huawei.hms.scankit.p.a -> L9c
            float r3 = r6.f()     // Catch: com.huawei.hms.scankit.p.a -> L9c
            float r2 = r2 + r3
            float r3 = r6.e()     // Catch: com.huawei.hms.scankit.p.a -> L9c
            r1.<init>(r2, r3)     // Catch: com.huawei.hms.scankit.p.a -> L9c
            com.huawei.hms.scankit.p.u6 r2 = new com.huawei.hms.scankit.p.u6     // Catch: com.huawei.hms.scankit.p.a -> L9c
            float r3 = r6.d()     // Catch: com.huawei.hms.scankit.p.a -> L9c
            float r4 = r6.e()     // Catch: com.huawei.hms.scankit.p.a -> L9c
            float r5 = r6.c()     // Catch: com.huawei.hms.scankit.p.a -> L9c
            float r4 = r4 + r5
            r2.<init>(r3, r4)     // Catch: com.huawei.hms.scankit.p.a -> L9c
            com.huawei.hms.scankit.p.u6[] r0 = new com.huawei.hms.scankit.p.u6[r0]     // Catch: com.huawei.hms.scankit.p.a -> L9c
            r3 = 0
            r0[r3] = r9     // Catch: com.huawei.hms.scankit.p.a -> L9c
            r9 = 1
            r0[r9] = r1     // Catch: com.huawei.hms.scankit.p.a -> L9c
            r1 = 2
            r0[r1] = r2     // Catch: com.huawei.hms.scankit.p.a -> L9c
            com.huawei.hms.scankit.p.p4 r1 = r7.a     // Catch: com.huawei.hms.scankit.p.a -> L9c
            int r1 = r1.c()     // Catch: com.huawei.hms.scankit.p.a -> L9c
            com.huawei.hms.scankit.p.p4 r2 = r7.a     // Catch: com.huawei.hms.scankit.p.a -> L9c
            int r2 = r2.a()     // Catch: com.huawei.hms.scankit.p.a -> L9c
            float r0 = com.huawei.hms.scankit.p.o8.b(r1, r2, r0)     // Catch: com.huawei.hms.scankit.p.a -> L9c
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)     // Catch: com.huawei.hms.scankit.p.a -> L9c
            double r1 = (double) r1     // Catch: com.huawei.hms.scankit.p.a -> L9c
            r3 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L9c
            r7.h = r0     // Catch: com.huawei.hms.scankit.p.a -> L9c
            r7.e = r9     // Catch: com.huawei.hms.scankit.p.a -> L9c
        L9c:
            return r8
    }

    public boolean c(java.util.List<com.huawei.hms.scankit.p.i2> r18) {
            r17 = this;
            r0 = r17
            java.util.Iterator r1 = r18.iterator()
        L6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L147
            java.lang.Object r2 = r1.next()
            com.huawei.hms.scankit.p.i2 r2 = (com.huawei.hms.scankit.p.i2) r2
            float r3 = r2.g()
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            r7 = 0
            r8 = 1
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L2e
            float r3 = r2.h()
            double r9 = (double) r3
            int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r3 <= 0) goto L2e
            r3 = 1
            goto L2f
        L2e:
            r3 = 0
        L2f:
            float r9 = r2.g()
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 != 0) goto L47
            float r4 = r2.h()
            double r9 = (double) r4
            r11 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 <= 0) goto L47
            r4 = 1
            goto L48
        L47:
            r4 = 0
        L48:
            float r9 = r2.g()
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 != 0) goto L5d
            float r9 = r2.h()
            double r9 = (double) r9
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 <= 0) goto L5d
            r9 = 1
            goto L5e
        L5d:
            r9 = 0
        L5e:
            float r10 = r2.g()
            r11 = 1077936128(0x40400000, float:3.0)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 != 0) goto L73
            float r10 = r2.h()
            double r10 = (double) r10
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 <= 0) goto L73
            r10 = 1
            goto L74
        L73:
            r10 = 0
        L74:
            float r11 = r2.g()
            r12 = 1082130432(0x40800000, float:4.0)
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 != 0) goto L89
            float r11 = r2.h()
            double r11 = (double) r11
            int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r13 <= 0) goto L89
            r11 = 1
            goto L8a
        L89:
            r11 = 0
        L8a:
            float r12 = r2.g()
            r13 = 1084227584(0x40a00000, float:5.0)
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 != 0) goto L9f
            float r12 = r2.h()
            double r12 = (double) r12
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 <= 0) goto L9f
            r12 = 1
            goto La0
        L9f:
            r12 = 0
        La0:
            float r13 = r2.g()
            r14 = 1086324736(0x40c00000, float:6.0)
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 != 0) goto Lb5
            float r13 = r2.h()
            double r13 = (double) r13
            int r15 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r15 <= 0) goto Lb5
            r13 = 1
            goto Lb6
        Lb5:
            r13 = 0
        Lb6:
            float r14 = r2.g()
            r15 = 1088421888(0x40e00000, float:7.0)
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 != 0) goto Lcb
            float r14 = r2.h()
            double r14 = (double) r14
            int r16 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r16 <= 0) goto Lcb
            r5 = 1
            goto Lcc
        Lcb:
            r5 = 0
        Lcc:
            if (r4 != 0) goto Lda
            if (r9 != 0) goto Lda
            if (r10 != 0) goto Lda
            if (r13 != 0) goto Lda
            if (r5 != 0) goto Lda
            if (r11 != 0) goto Lda
            if (r12 == 0) goto L6
        Lda:
            if (r3 != 0) goto Lf0
            com.huawei.hms.scankit.p.p r3 = r0.b
            boolean r3 = a(r3, r2)
            if (r3 != 0) goto Lf0
            int r3 = com.huawei.hms.scankit.p.r3.k
            r4 = 4
            if (r3 <= r4) goto Lea
            goto Lf0
        Lea:
            int r3 = r3 + 2
            com.huawei.hms.scankit.p.r3.k = r3
            goto L6
        Lf0:
            com.huawei.hms.scankit.p.r3.k = r7
            com.huawei.hms.scankit.p.u6 r3 = new com.huawei.hms.scankit.p.u6
            float r4 = r2.d()
            float r5 = r2.e()
            r3.<init>(r4, r5)
            com.huawei.hms.scankit.p.u6 r4 = new com.huawei.hms.scankit.p.u6
            float r5 = r2.d()
            float r6 = r2.f()
            float r5 = r5 + r6
            float r6 = r2.e()
            r4.<init>(r5, r6)
            com.huawei.hms.scankit.p.u6 r5 = new com.huawei.hms.scankit.p.u6
            float r6 = r2.d()
            float r9 = r2.e()
            float r2 = r2.c()
            float r9 = r9 + r2
            r5.<init>(r6, r9)
            r2 = 3
            com.huawei.hms.scankit.p.u6[] r2 = new com.huawei.hms.scankit.p.u6[r2]
            r2[r7] = r3
            r2[r8] = r4
            r3 = 2
            r2[r3] = r5
            com.huawei.hms.scankit.p.p4 r3 = r0.a
            int r3 = r3.c()
            com.huawei.hms.scankit.p.p4 r4 = r0.a
            int r4 = r4.a()
            float r2 = com.huawei.hms.scankit.p.o8.b(r3, r4, r2)
            r3 = 1065361605(0x3f8020c5, float:1.001)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L6
            r0.g = r2
            return r8
        L147:
            boolean r1 = r0.e
            return r1
    }

    public float d() {
            r1 = this;
            float r0 = r1.h
            return r0
    }

    public com.huawei.hms.scankit.p.s6 d(java.util.List<com.huawei.hms.scankit.aiscan.common.BarcodeFormat> r27, com.huawei.hms.scankit.p.i2 r28) {
            r26 = this;
            r0 = r26
            r1 = r28
            com.huawei.hms.scankit.p.a5 r2 = new com.huawei.hms.scankit.p.a5
            r2.<init>()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            com.huawei.hms.scankit.p.l1 r4 = com.huawei.hms.scankit.p.l1.c
            r5 = r27
            r3.put(r4, r5)
            r4 = 1067450368(0x3fa00000, float:1.25)
            r5 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto Lf5
            com.huawei.hms.scankit.p.p r7 = r0.d     // Catch: com.huawei.hms.scankit.p.a -> L12e
            if (r7 == 0) goto Le0
            int r7 = r7.e()     // Catch: com.huawei.hms.scankit.p.a -> L12e
            com.huawei.hms.scankit.p.p r8 = r0.d     // Catch: com.huawei.hms.scankit.p.a -> L12e
            int r8 = r8.c()     // Catch: com.huawei.hms.scankit.p.a -> L12e
            int r7 = java.lang.Math.min(r7, r8)     // Catch: com.huawei.hms.scankit.p.a -> L12e
            float r7 = (float) r7
            r8 = 1145569280(0x44480000, float:800.0)
            float r7 = r7 / r8
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 >= 0) goto L38
            r7 = 1065353216(0x3f800000, float:1.0)
        L38:
            com.huawei.hms.scankit.p.m4 r4 = r0.i     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            com.huawei.hms.scankit.p.p r8 = r0.d     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            com.huawei.hms.scankit.p.p r4 = r4.h(r8, r7)     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            com.huawei.hms.scankit.p.s6 r2 = r2.a(r4, r3)     // Catch: com.huawei.hms.scankit.p.a -> L46
            goto Le8
        L46:
            boolean r8 = com.huawei.hms.scankit.p.r3.q     // Catch: com.huawei.hms.scankit.p.a -> L56
            if (r8 == 0) goto L56
            com.huawei.hms.scankit.p.m4 r8 = r0.i     // Catch: com.huawei.hms.scankit.p.a -> L56
            com.huawei.hms.scankit.p.p r9 = r0.d     // Catch: com.huawei.hms.scankit.p.a -> L56
            com.huawei.hms.scankit.p.p r8 = r8.g(r9, r7)     // Catch: com.huawei.hms.scankit.p.a -> L56
            com.huawei.hms.scankit.p.s6 r5 = r2.a(r8, r3)     // Catch: com.huawei.hms.scankit.p.a -> L56
        L56:
            float r8 = r1.i()     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            r9 = 1127481344(0x43340000, float:180.0)
            float r8 = r8 + r9
            r9 = 1119092736(0x42b40000, float:90.0)
            float r8 = r8 % r9
            boolean r10 = com.huawei.hms.scankit.p.r3.c     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            if (r10 == 0) goto Le9
            float r10 = r1.h()     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            double r10 = (double) r10     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            r12 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto Le9
            r10 = 1077936128(0x40400000, float:3.0)
            r11 = 1118699520(0x42ae0000, float:87.0)
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 < 0) goto L7e
            int r12 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r12 <= 0) goto Le9
        L7e:
            com.huawei.hms.scankit.p.o r4 = r4.a()     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            com.huawei.hms.scankit.p.p4 r4 = r4.c()     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            if (r10 >= 0) goto L8e
            r9 = -1073741824(0xffffffffc0000000, float:-2.0)
            float r8 = r8 * r9
        L8c:
            r14 = r8
            goto L9a
        L8e:
            int r10 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r10 <= 0) goto L98
            float r9 = r9 - r8
            r8 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 * r9
            goto L8c
        L98:
            r8 = 0
            r14 = 0
        L9a:
            byte[] r9 = r4.b()     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            int r10 = r4.a()     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            int r11 = r4.c()     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            int r12 = r4.a()     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            int r13 = r4.c()     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            byte[] r18 = com.huawei.hms.scankit.util.LoadOpencvJNIUtil.imageRotate(r9, r10, r11, r12, r13, r14, r15)     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            com.huawei.hms.scankit.p.e6 r17 = new com.huawei.hms.scankit.p.e6     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            int r19 = r4.c()     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            int r20 = r4.a()     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            int r23 = r4.c()     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            int r24 = r4.a()     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            r25 = 0
            r21 = 0
            r22 = 0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            r4 = r17
            com.huawei.hms.scankit.p.p r8 = new com.huawei.hms.scankit.p.p     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            com.huawei.hms.scankit.p.e4 r9 = new com.huawei.hms.scankit.p.e4     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            r9.<init>(r4)     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            r8.<init>(r9)     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            com.huawei.hms.scankit.p.s6 r2 = r2.a(r8, r3)     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            goto Le8
        Le0:
            com.huawei.hms.scankit.p.p r4 = r0.b     // Catch: com.huawei.hms.scankit.p.a -> L12e
            com.huawei.hms.scankit.p.s6 r2 = r2.a(r4, r3)     // Catch: com.huawei.hms.scankit.p.a -> L12e
            r7 = 1065353216(0x3f800000, float:1.0)
        Le8:
            r5 = r2
        Le9:
            if (r5 == 0) goto Lf3
            com.huawei.hms.scankit.p.u6[] r2 = r5.j()     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            com.huawei.hms.scankit.p.k2.a(r2, r7, r1)     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            goto L12e
        Lf3:
            r6 = r7
            goto L12e
        Lf5:
            com.huawei.hms.scankit.p.p r1 = r0.b     // Catch: com.huawei.hms.scankit.p.a -> L12e
            int r1 = r1.e()     // Catch: com.huawei.hms.scankit.p.a -> L12e
            com.huawei.hms.scankit.p.p r7 = r0.b     // Catch: com.huawei.hms.scankit.p.a -> L12e
            int r7 = r7.c()     // Catch: com.huawei.hms.scankit.p.a -> L12e
            int r1 = java.lang.Math.min(r1, r7)     // Catch: com.huawei.hms.scankit.p.a -> L12e
            r7 = 1080(0x438, float:1.513E-42)
            if (r1 <= r7) goto L113
            float r1 = (float) r1
            r7 = 1149698048(0x44870000, float:1080.0)
            float r1 = r1 / r7
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 >= 0) goto L112
            goto L113
        L112:
            r6 = r1
        L113:
            com.huawei.hms.scankit.p.m4 r1 = r0.i     // Catch: com.huawei.hms.scankit.p.a -> L121
            com.huawei.hms.scankit.p.p r4 = r0.b     // Catch: com.huawei.hms.scankit.p.a -> L121
            com.huawei.hms.scankit.p.p r1 = r1.a(r4, r6)     // Catch: com.huawei.hms.scankit.p.a -> L121
            com.huawei.hms.scankit.p.s6 r1 = r2.a(r1, r3)     // Catch: com.huawei.hms.scankit.p.a -> L121
        L11f:
            r5 = r1
            goto L12e
        L121:
            com.huawei.hms.scankit.p.m4 r1 = r0.i     // Catch: com.huawei.hms.scankit.p.a -> L12e
            com.huawei.hms.scankit.p.p r4 = r0.c     // Catch: com.huawei.hms.scankit.p.a -> L12e
            com.huawei.hms.scankit.p.p r1 = r1.b(r4, r6)     // Catch: com.huawei.hms.scankit.p.a -> L12e
            com.huawei.hms.scankit.p.s6 r1 = r2.a(r1, r3)     // Catch: com.huawei.hms.scankit.p.a -> L12e
            goto L11f
        L12e:
            r1 = 0
            com.huawei.hms.scankit.p.s6 r1 = r0.a(r5, r6, r1, r1)
            return r1
    }

    public float e() {
            r1 = this;
            float r0 = r1.g
            return r0
    }

    public com.huawei.hms.scankit.p.s6 e(java.util.List<com.huawei.hms.scankit.aiscan.common.BarcodeFormat> r6, com.huawei.hms.scankit.p.i2 r7) {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.huawei.hms.scankit.p.l1 r1 = com.huawei.hms.scankit.p.l1.c
            r0.put(r1, r6)
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L54
            com.huawei.hms.scankit.p.r3.l = r2
            com.huawei.hms.scankit.p.s6 r3 = r5.a(r0, r7)
            com.huawei.hms.scankit.p.r3.l = r1
            if (r3 == 0) goto L2a
            java.lang.String r4 = r3.k()
            if (r4 != 0) goto L2a
            boolean r4 = com.huawei.hms.scankit.p.r3.p
            if (r4 == 0) goto L2a
            com.huawei.hms.scankit.p.r3.m = r2
            com.huawei.hms.scankit.p.s6 r3 = r5.g(r6, r7)
            com.huawei.hms.scankit.p.r3.m = r1
        L2a:
            if (r3 == 0) goto L3e
            java.lang.String r6 = r3.k()
            if (r6 != 0) goto L3e
            boolean r6 = com.huawei.hms.scankit.p.r3.q
            if (r6 == 0) goto L3e
            com.huawei.hms.scankit.p.r3.n = r2
            com.huawei.hms.scankit.p.s6 r3 = r5.a(r0, r7)
            com.huawei.hms.scankit.p.r3.n = r1
        L3e:
            if (r3 == 0) goto L46
            java.lang.String r6 = r3.k()
            if (r6 != 0) goto L53
        L46:
            boolean r6 = com.huawei.hms.scankit.p.r3.r
            if (r6 == 0) goto L53
            com.huawei.hms.scankit.p.r3.o = r2
            com.huawei.hms.scankit.p.s6 r6 = r5.a(r0, r7)
            com.huawei.hms.scankit.p.r3.o = r1
            return r6
        L53:
            return r3
        L54:
            com.huawei.hms.scankit.p.s6 r6 = r5.a(r0)
            if (r6 == 0) goto L6c
            java.lang.String r7 = r6.k()
            if (r7 != 0) goto L6c
            boolean r7 = com.huawei.hms.scankit.p.r3.q
            if (r7 == 0) goto L6c
            com.huawei.hms.scankit.p.r3.m = r2
            com.huawei.hms.scankit.p.s6 r6 = r5.a(r0)
            com.huawei.hms.scankit.p.r3.m = r1
        L6c:
            if (r6 == 0) goto L80
            java.lang.String r7 = r6.k()
            if (r7 != 0) goto L80
            boolean r7 = com.huawei.hms.scankit.p.r3.r
            if (r7 == 0) goto L80
            com.huawei.hms.scankit.p.r3.n = r2
            com.huawei.hms.scankit.p.s6 r6 = r5.a(r0)
            com.huawei.hms.scankit.p.r3.n = r1
        L80:
            return r6
    }

    public com.huawei.hms.scankit.p.s6 f(java.util.List<com.huawei.hms.scankit.aiscan.common.BarcodeFormat> r8, com.huawei.hms.scankit.p.i2 r9) {
            r7 = this;
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            com.huawei.hms.scankit.p.l1 r0 = com.huawei.hms.scankit.p.l1.c
            r4.put(r0, r8)
            r8 = 0
            if (r9 == 0) goto L18
            com.huawei.hms.scankit.p.p r0 = r7.d     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            com.huawei.hms.scankit.p.o r0 = r0.a()     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            com.huawei.hms.scankit.p.p4 r0 = r0.c()     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            goto L1a
        L18:
            com.huawei.hms.scankit.p.p4 r0 = r7.a     // Catch: com.huawei.hms.scankit.p.a -> Lcc
        L1a:
            boolean r1 = com.huawei.hms.scankit.p.r3.a     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            if (r1 == 0) goto L6a
            com.huawei.hms.scankit.p.p r1 = r7.b     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            int r1 = r1.e()     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            r2 = 800(0x320, float:1.121E-42)
            if (r1 > r2) goto L30
            com.huawei.hms.scankit.p.p r1 = r7.b     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            int r1 = r1.c()     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            if (r1 <= r2) goto L6a
        L30:
            com.huawei.hms.scankit.p.p r1 = r7.b     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            int r1 = r1.e()     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            com.huawei.hms.scankit.p.p r2 = r7.b     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            int r2 = r2.c()     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            if (r1 <= r2) goto L45
            com.huawei.hms.scankit.p.p r1 = r7.b     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            int r1 = r1.e()     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            goto L4b
        L45:
            com.huawei.hms.scankit.p.p r1 = r7.b     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            int r1 = r1.c()     // Catch: com.huawei.hms.scankit.p.a -> Lcc
        L4b:
            float r1 = (float) r1     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            r2 = 1145569280(0x44480000, float:800.0)
            float r1 = r1 / r2
            com.huawei.hms.scankit.p.m4 r2 = r7.i     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            com.huawei.hms.scankit.p.p r3 = new com.huawei.hms.scankit.p.p     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            com.huawei.hms.scankit.p.q3 r5 = new com.huawei.hms.scankit.p.q3     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            r5.<init>(r0)     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            r3.<init>(r5)     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            com.huawei.hms.scankit.p.p r0 = r2.h(r3, r1)     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            com.huawei.hms.scankit.p.o r0 = r0.a()     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            com.huawei.hms.scankit.p.p4 r0 = r0.c()     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            r5 = r1
        L68:
            r2 = r0
            goto L6f
        L6a:
            r1 = 1065353216(0x3f800000, float:1.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L68
        L6f:
            if (r2 == 0) goto Lc7
            boolean r0 = com.huawei.hms.scankit.p.r3.a     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            if (r0 == 0) goto L98
            boolean r0 = com.huawei.hms.scankit.p.r3.b     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            if (r0 != 0) goto L98
            byte[] r0 = r2.b()     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            int r1 = r2.c()     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            int r3 = r2.a()     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            r6 = 0
            com.huawei.hms.scankit.p.s r0 = a(r0, r1, r3, r6)     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            com.huawei.hms.scankit.p.q3 r1 = new com.huawei.hms.scankit.p.q3     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            r1.<init>(r2)     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            com.huawei.hms.scankit.p.p r3 = new com.huawei.hms.scankit.p.p     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            r3.<init>(r1)     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            r3.a(r0)     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            goto La2
        L98:
            com.huawei.hms.scankit.p.p r3 = new com.huawei.hms.scankit.p.p     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            com.huawei.hms.scankit.p.q3 r0 = new com.huawei.hms.scankit.p.q3     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            r0.<init>(r2)     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            r3.<init>(r0)     // Catch: com.huawei.hms.scankit.p.a -> Lcc
        La2:
            com.huawei.hms.scankit.p.a5 r1 = new com.huawei.hms.scankit.p.a5     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            r1.<init>()     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            com.huawei.hms.scankit.p.s6 r8 = r1.a(r3, r4)     // Catch: com.huawei.hms.scankit.p.a -> Lc0
            if (r8 == 0) goto Lbb
            java.lang.String r0 = r8.k()     // Catch: com.huawei.hms.scankit.p.a -> Lc0
            if (r0 == 0) goto Lbb
            com.huawei.hms.scankit.p.u6[] r0 = r8.j()     // Catch: com.huawei.hms.scankit.p.a -> Lc0
            com.huawei.hms.scankit.p.k2.a(r0, r5, r9)     // Catch: com.huawei.hms.scankit.p.a -> Lc0
            return r8
        Lbb:
            com.huawei.hms.scankit.p.a r0 = com.huawei.hms.scankit.p.a.a()     // Catch: com.huawei.hms.scankit.p.a -> Lc0
            throw r0     // Catch: com.huawei.hms.scankit.p.a -> Lc0
        Lc0:
            r0 = r7
            r6 = r9
            com.huawei.hms.scankit.p.s6 r8 = r0.a(r1, r2, r3, r4, r5, r6)     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            goto Lcc
        Lc7:
            com.huawei.hms.scankit.p.a r9 = com.huawei.hms.scankit.p.a.a()     // Catch: com.huawei.hms.scankit.p.a -> Lcc
            throw r9     // Catch: com.huawei.hms.scankit.p.a -> Lcc
        Lcc:
            return r8
    }

    public com.huawei.hms.scankit.p.s6 g(java.util.List<com.huawei.hms.scankit.aiscan.common.BarcodeFormat> r6, com.huawei.hms.scankit.p.i2 r7) {
            r5 = this;
            com.huawei.hms.scankit.p.a5 r0 = new com.huawei.hms.scankit.p.a5
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.huawei.hms.scankit.p.l1 r2 = com.huawei.hms.scankit.p.l1.c
            r1.put(r2, r6)
            r6 = 1140457472(0x43fa0000, float:500.0)
            r2 = 500(0x1f4, float:7.0E-43)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r7 != 0) goto L55
            boolean r4 = com.huawei.hms.scankit.p.r3.a
            if (r4 == 0) goto L52
            com.huawei.hms.scankit.p.p r4 = r5.b
            int r4 = r4.e()
            if (r4 > r2) goto L2b
            com.huawei.hms.scankit.p.p r4 = r5.b
            int r4 = r4.c()
            if (r4 <= r2) goto L52
        L2b:
            com.huawei.hms.scankit.p.p r2 = r5.b
            int r2 = r2.e()
            com.huawei.hms.scankit.p.p r3 = r5.b
            int r3 = r3.c()
            if (r2 <= r3) goto L40
            com.huawei.hms.scankit.p.p r2 = r5.b
            int r2 = r2.e()
            goto L46
        L40:
            com.huawei.hms.scankit.p.p r2 = r5.b
            int r2 = r2.c()
        L46:
            float r2 = (float) r2
            float r3 = r2 / r6
            com.huawei.hms.scankit.p.m4 r6 = r5.i
            com.huawei.hms.scankit.p.p r2 = r5.b
            com.huawei.hms.scankit.p.p r6 = r6.c(r2, r3)
            goto L94
        L52:
            com.huawei.hms.scankit.p.p r6 = r5.b
            goto L94
        L55:
            boolean r4 = com.huawei.hms.scankit.p.r3.a
            if (r4 == 0) goto L92
            com.huawei.hms.scankit.p.p r4 = r5.d
            if (r4 == 0) goto L92
            int r4 = r4.e()
            if (r4 > r2) goto L6b
            com.huawei.hms.scankit.p.p r4 = r5.d
            int r4 = r4.c()
            if (r4 <= r2) goto L92
        L6b:
            com.huawei.hms.scankit.p.p r2 = r5.d
            int r2 = r2.e()
            com.huawei.hms.scankit.p.p r3 = r5.d
            int r3 = r3.c()
            if (r2 <= r3) goto L80
            com.huawei.hms.scankit.p.p r2 = r5.d
            int r2 = r2.e()
            goto L86
        L80:
            com.huawei.hms.scankit.p.p r2 = r5.d
            int r2 = r2.c()
        L86:
            float r2 = (float) r2
            float r3 = r2 / r6
            com.huawei.hms.scankit.p.m4 r6 = r5.i
            com.huawei.hms.scankit.p.p r2 = r5.d
            com.huawei.hms.scankit.p.p r6 = r6.g(r2, r3)
            goto L94
        L92:
            com.huawei.hms.scankit.p.p r6 = r5.d
        L94:
            com.huawei.hms.scankit.p.s6 r6 = r0.a(r6, r1)     // Catch: com.huawei.hms.scankit.p.a -> La8
            if (r6 == 0) goto La7
            java.lang.String r0 = r6.k()     // Catch: com.huawei.hms.scankit.p.a -> La9
            if (r0 == 0) goto La7
            com.huawei.hms.scankit.p.u6[] r0 = r6.j()     // Catch: com.huawei.hms.scankit.p.a -> La9
            com.huawei.hms.scankit.p.k2.a(r0, r3, r7)     // Catch: com.huawei.hms.scankit.p.a -> La9
        La7:
            return r6
        La8:
            r6 = 0
        La9:
            return r6
    }

    public com.huawei.hms.scankit.p.s6 h(java.util.List<com.huawei.hms.scankit.aiscan.common.BarcodeFormat> r6, com.huawei.hms.scankit.p.i2 r7) {
            r5 = this;
            com.huawei.hms.scankit.p.a5 r0 = new com.huawei.hms.scankit.p.a5
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.huawei.hms.scankit.p.l1 r2 = com.huawei.hms.scankit.p.l1.c
            r1.put(r2, r6)
            r6 = 0
            if (r7 == 0) goto L1a
            com.huawei.hms.scankit.p.p r2 = r5.d     // Catch: com.huawei.hms.scankit.p.a -> L5e
            com.huawei.hms.scankit.p.m4 r3 = r5.i     // Catch: com.huawei.hms.scankit.p.a -> L5e
            com.huawei.hms.scankit.p.s6 r6 = r0.c(r2, r3, r1, r7)     // Catch: com.huawei.hms.scankit.p.a -> L5e
        L1a:
            boolean r7 = com.huawei.hms.scankit.p.r3.c     // Catch: com.huawei.hms.scankit.p.a -> L5e
            if (r7 != 0) goto L5e
            if (r6 == 0) goto L5e
            java.lang.String r7 = r6.k()     // Catch: com.huawei.hms.scankit.p.a -> L5e
            if (r7 != 0) goto L5e
            com.huawei.hms.scankit.p.u6[] r7 = r6.j()     // Catch: com.huawei.hms.scankit.p.a -> L5e
            if (r7 == 0) goto L5e
            com.huawei.hms.scankit.p.u6[] r7 = r6.j()     // Catch: com.huawei.hms.scankit.p.a -> L5e
            int r7 = r7.length     // Catch: com.huawei.hms.scankit.p.a -> L5e
            r0 = 3
            if (r7 < r0) goto L5e
            com.huawei.hms.scankit.p.p4 r7 = r5.a     // Catch: com.huawei.hms.scankit.p.a -> L5e
            int r7 = r7.c()     // Catch: com.huawei.hms.scankit.p.a -> L5e
            com.huawei.hms.scankit.p.p4 r0 = r5.a     // Catch: com.huawei.hms.scankit.p.a -> L5e
            int r0 = r0.a()     // Catch: com.huawei.hms.scankit.p.a -> L5e
            com.huawei.hms.scankit.p.u6[] r1 = r6.j()     // Catch: com.huawei.hms.scankit.p.a -> L5e
            float r7 = com.huawei.hms.scankit.p.o8.b(r7, r0, r1)     // Catch: com.huawei.hms.scankit.p.a -> L5e
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r7
            float r0 = java.lang.Math.abs(r0)     // Catch: com.huawei.hms.scankit.p.a -> L5e
            double r0 = (double) r0     // Catch: com.huawei.hms.scankit.p.a -> L5e
            r2 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L5e
            r5.h = r7     // Catch: com.huawei.hms.scankit.p.a -> L5e
            r7 = 1
            r5.e = r7     // Catch: com.huawei.hms.scankit.p.a -> L5e
        L5e:
            return r6
    }
}
