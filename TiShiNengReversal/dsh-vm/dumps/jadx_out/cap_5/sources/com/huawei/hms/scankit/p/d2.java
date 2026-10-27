package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d2 {
    private final com.huawei.hms.scankit.p.s a;
    private final com.huawei.hms.scankit.p.j8 b;

    public d2(com.huawei.hms.scankit.p.s r2) throws com.huawei.hms.scankit.p.a {
            r1 = this;
            r1.<init>()
            r1.a = r2
            com.huawei.hms.scankit.p.j8 r0 = new com.huawei.hms.scankit.p.j8
            r0.<init>(r2)
            r1.b = r0
            return
    }

    private int a(com.huawei.hms.scankit.p.u6 r23, com.huawei.hms.scankit.p.u6 r24) {
            r22 = this;
            r0 = r22
            float r1 = r23.b()
            int r1 = (int) r1
            float r2 = r23.c()
            int r2 = (int) r2
            float r3 = r24.b()
            int r3 = (int) r3
            float r4 = r24.c()
            int r4 = (int) r4
            int r5 = r4 - r2
            int r5 = java.lang.Math.abs(r5)
            int r6 = r3 - r1
            int r6 = java.lang.Math.abs(r6)
            if (r5 <= r6) goto L26
            r5 = 1
            goto L27
        L26:
            r5 = 0
        L27:
            if (r5 == 0) goto L2a
            goto L34
        L2a:
            r21 = r2
            r2 = r1
            r1 = r21
            r21 = r4
            r4 = r3
            r3 = r21
        L34:
            int r6 = r4 - r2
            int r6 = java.lang.Math.abs(r6)
            int r9 = r3 - r1
            int r9 = java.lang.Math.abs(r9)
            int r10 = -r6
            int r10 = r10 / 2
            r11 = -1
            if (r1 >= r3) goto L48
            r12 = 1
            goto L49
        L48:
            r12 = -1
        L49:
            if (r2 >= r4) goto L4c
            r11 = 1
        L4c:
            com.huawei.hms.scankit.p.s r13 = r0.a
            if (r5 == 0) goto L52
            r14 = r1
            goto L53
        L52:
            r14 = r2
        L53:
            if (r5 == 0) goto L57
            r15 = r2
            goto L58
        L57:
            r15 = r1
        L58:
            boolean r13 = r13.b(r14, r15)
            r14 = 0
            r15 = 0
            r16 = 0
        L60:
            if (r2 == r4) goto La8
            r23 = 1
            com.huawei.hms.scankit.p.s r7 = r0.a
            if (r5 == 0) goto L6a
            r8 = r1
            goto L6b
        L6a:
            r8 = r2
        L6b:
            if (r5 == 0) goto L6f
            r0 = r2
            goto L70
        L6f:
            r0 = r1
        L70:
            boolean r0 = r7.b(r8, r0)
            int r14 = r14 + 1
            if (r0 == r13) goto L94
            double r7 = (double) r14
            r18 = r4
            r17 = r5
            double r4 = (double) r15
            r19 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r4 = r4 / r19
            double r4 = java.lang.Math.ceil(r4)
            int r19 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r19 <= 0) goto L98
            int r16 = r16 + 1
            int r4 = r15 - r14
            int r4 = r4 / r16
            int r15 = r15 - r4
            r13 = r0
            r14 = 0
            goto L98
        L94:
            r18 = r4
            r17 = r5
        L98:
            int r10 = r10 + r9
            if (r10 <= 0) goto La0
            if (r1 != r3) goto L9e
            return r16
        L9e:
            int r1 = r1 + r12
            int r10 = r10 - r6
        La0:
            int r2 = r2 + r11
            r0 = r22
            r5 = r17
            r4 = r18
            goto L60
        La8:
            return r16
    }

    private static com.huawei.hms.scankit.p.s a(com.huawei.hms.scankit.p.s r21, com.huawei.hms.scankit.p.u6 r22, com.huawei.hms.scankit.p.u6 r23, com.huawei.hms.scankit.p.u6 r24, com.huawei.hms.scankit.p.u6 r25, int r26, int r27) throws com.huawei.hms.scankit.p.a {
            com.huawei.hms.scankit.p.s3 r1 = com.huawei.hms.scankit.p.s3.a()
            r3 = r26
            float r0 = (float) r3
            r2 = 1056964608(0x3f000000, float:0.5)
            float r7 = r0 - r2
            r4 = r27
            float r0 = (float) r4
            float r10 = r0 - r2
            float r13 = r22.b()
            float r14 = r22.c()
            float r15 = r25.b()
            float r16 = r25.c()
            float r17 = r24.b()
            float r18 = r24.c()
            float r19 = r23.b()
            float r20 = r23.c()
            r8 = 1056964608(0x3f000000, float:0.5)
            r11 = 1056964608(0x3f000000, float:0.5)
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 1056964608(0x3f000000, float:0.5)
            r9 = r7
            r12 = r10
            r2 = r21
            com.huawei.hms.scankit.p.s r0 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
    }

    private static com.huawei.hms.scankit.p.u6 a(com.huawei.hms.scankit.p.u6 r2, float r3, float r4) {
            float r0 = r2.b()
            float r2 = r2.c()
            r1 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L10
            float r0 = r0 - r1
            goto L11
        L10:
            float r0 = r0 + r1
        L11:
            int r3 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r3 >= 0) goto L17
            float r2 = r2 - r1
            goto L18
        L17:
            float r2 = r2 + r1
        L18:
            com.huawei.hms.scankit.p.u6 r3 = new com.huawei.hms.scankit.p.u6
            r3.<init>(r0, r2)
            return r3
    }

    private static com.huawei.hms.scankit.p.u6 a(com.huawei.hms.scankit.p.u6 r2, com.huawei.hms.scankit.p.u6 r3, int r4) {
            float r0 = r3.b()
            float r1 = r2.b()
            float r0 = r0 - r1
            int r4 = r4 + 1
            float r4 = (float) r4
            float r0 = r0 / r4
            float r3 = r3.c()
            float r1 = r2.c()
            float r3 = r3 - r1
            float r3 = r3 / r4
            com.huawei.hms.scankit.p.u6 r4 = new com.huawei.hms.scankit.p.u6
            float r1 = r2.b()
            float r1 = r1 + r0
            float r2 = r2.c()
            float r2 = r2 + r3
            r4.<init>(r1, r2)
            return r4
    }

    private com.huawei.hms.scankit.p.u6 a(com.huawei.hms.scankit.p.u6[] r13) {
            r12 = this;
            r0 = 0
            r0 = r13[r0]
            r1 = 1
            r2 = r13[r1]
            r3 = 2
            r3 = r13[r3]
            r4 = 3
            r13 = r13[r4]
            int r4 = r12.a(r0, r13)
            int r5 = r12.a(r2, r13)
            int r5 = r5 + r1
            int r5 = r5 * 4
            com.huawei.hms.scankit.p.u6 r5 = a(r0, r2, r5)
            int r4 = r4 + r1
            int r4 = r4 * 4
            com.huawei.hms.scankit.p.u6 r4 = a(r3, r2, r4)
            int r6 = r12.a(r5, r13)
            int r7 = r12.a(r4, r13)
            com.huawei.hms.scankit.p.u6 r8 = new com.huawei.hms.scankit.p.u6
            float r9 = r13.b()
            float r10 = r3.b()
            float r11 = r2.b()
            float r10 = r10 - r11
            int r6 = r6 + r1
            float r6 = (float) r6
            float r10 = r10 / r6
            float r9 = r9 + r10
            float r10 = r13.c()
            float r3 = r3.c()
            float r11 = r2.c()
            float r3 = r3 - r11
            float r3 = r3 / r6
            float r10 = r10 + r3
            r8.<init>(r9, r10)
            com.huawei.hms.scankit.p.u6 r3 = new com.huawei.hms.scankit.p.u6
            float r6 = r13.b()
            float r9 = r0.b()
            float r10 = r2.b()
            float r9 = r9 - r10
            int r7 = r7 + r1
            float r1 = (float) r7
            float r9 = r9 / r1
            float r6 = r6 + r9
            float r13 = r13.c()
            float r0 = r0.c()
            float r2 = r2.c()
            float r0 = r0 - r2
            float r0 = r0 / r1
            float r13 = r13 + r0
            r3.<init>(r6, r13)
            boolean r13 = r12.a(r8)
            if (r13 != 0) goto L83
            boolean r13 = r12.a(r3)
            if (r13 == 0) goto L81
            goto L9f
        L81:
            r13 = 0
            return r13
        L83:
            boolean r13 = r12.a(r3)
            if (r13 != 0) goto L8a
            goto L9e
        L8a:
            int r13 = r12.a(r5, r8)
            int r0 = r12.a(r4, r8)
            int r13 = r13 + r0
            int r0 = r12.a(r5, r3)
            int r1 = r12.a(r4, r3)
            int r0 = r0 + r1
            if (r13 <= r0) goto L9f
        L9e:
            return r8
        L9f:
            return r3
    }

    private boolean a(com.huawei.hms.scankit.p.u6 r4) {
            r3 = this;
            float r0 = r4.b()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L31
            float r0 = r4.b()
            com.huawei.hms.scankit.p.s r2 = r3.a
            int r2 = r2.e()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L31
            float r0 = r4.c()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L31
            float r4 = r4.c()
            com.huawei.hms.scankit.p.s r0 = r3.a
            int r0 = r0.c()
            float r0 = (float) r0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 >= 0) goto L31
            r4 = 1
            return r4
        L31:
            r4 = 0
            return r4
    }

    private com.huawei.hms.scankit.p.u6[] b(com.huawei.hms.scankit.p.u6[] r13) {
            r12 = this;
            r0 = 0
            r1 = r13[r0]
            r2 = 1
            r3 = r13[r2]
            r4 = 3
            r5 = r13[r4]
            r6 = 2
            r13 = r13[r6]
            int r7 = r12.a(r1, r3)
            int r8 = r12.a(r3, r5)
            int r9 = r12.a(r5, r13)
            int r10 = r12.a(r13, r1)
            r11 = 4
            com.huawei.hms.scankit.p.u6[] r11 = new com.huawei.hms.scankit.p.u6[r11]
            r11[r0] = r13
            r11[r2] = r1
            r11[r6] = r3
            r11[r4] = r5
            if (r7 <= r8) goto L32
            r11[r0] = r1
            r11[r2] = r3
            r11[r6] = r5
            r11[r4] = r13
            r7 = r8
        L32:
            if (r7 <= r9) goto L3d
            r11[r0] = r3
            r11[r2] = r5
            r11[r6] = r13
            r11[r4] = r1
            goto L3e
        L3d:
            r9 = r7
        L3e:
            if (r9 <= r10) goto L48
            r11[r0] = r5
            r11[r2] = r13
            r11[r6] = r1
            r11[r4] = r3
        L48:
            return r11
    }

    private com.huawei.hms.scankit.p.u6[] c(com.huawei.hms.scankit.p.u6[] r11) {
            r10 = this;
            r0 = 0
            r1 = r11[r0]
            r2 = 1
            r3 = r11[r2]
            r4 = 2
            r5 = r11[r4]
            r6 = 3
            r7 = r11[r6]
            int r8 = r10.a(r1, r7)
            int r8 = r8 + r2
            int r8 = r8 * 4
            com.huawei.hms.scankit.p.u6 r9 = a(r3, r5, r8)
            com.huawei.hms.scankit.p.u6 r8 = a(r5, r3, r8)
            int r9 = r10.a(r9, r1)
            int r8 = r10.a(r8, r7)
            if (r9 >= r8) goto L2e
            r11[r0] = r1
            r11[r2] = r3
            r11[r4] = r5
            r11[r6] = r7
            return r11
        L2e:
            r11[r0] = r3
            r11[r2] = r5
            r11[r4] = r7
            r11[r6] = r1
            return r11
    }

    private com.huawei.hms.scankit.p.u6[] d(com.huawei.hms.scankit.p.u6[] r15) {
            r14 = this;
            r0 = 0
            r1 = r15[r0]
            r2 = 1
            r3 = r15[r2]
            r4 = 2
            r5 = r15[r4]
            r6 = 3
            r15 = r15[r6]
            int r7 = r14.a(r1, r15)
            int r7 = r7 + r2
            int r8 = r14.a(r5, r15)
            int r8 = r8 + r2
            r9 = 4
            int r8 = r8 * 4
            com.huawei.hms.scankit.p.u6 r8 = a(r1, r3, r8)
            int r7 = r7 * 4
            com.huawei.hms.scankit.p.u6 r7 = a(r5, r3, r7)
            int r8 = r14.a(r8, r15)
            int r10 = r8 + 1
            int r7 = r14.a(r7, r15)
            int r11 = r7 + 1
            r12 = r10 & 1
            if (r12 != r2) goto L35
            int r10 = r8 + 2
        L35:
            r8 = r11 & 1
            if (r8 != r2) goto L3b
            int r11 = r7 + 2
        L3b:
            float r7 = r1.b()
            float r8 = r3.b()
            float r7 = r7 + r8
            float r8 = r5.b()
            float r7 = r7 + r8
            float r8 = r15.b()
            float r7 = r7 + r8
            r8 = 1082130432(0x40800000, float:4.0)
            float r7 = r7 / r8
            float r12 = r1.c()
            float r13 = r3.c()
            float r12 = r12 + r13
            float r13 = r5.c()
            float r12 = r12 + r13
            float r13 = r15.c()
            float r12 = r12 + r13
            float r12 = r12 / r8
            com.huawei.hms.scankit.p.u6 r1 = a(r1, r7, r12)
            com.huawei.hms.scankit.p.u6 r3 = a(r3, r7, r12)
            com.huawei.hms.scankit.p.u6 r5 = a(r5, r7, r12)
            com.huawei.hms.scankit.p.u6 r15 = a(r15, r7, r12)
            int r11 = r11 * 4
            com.huawei.hms.scankit.p.u6 r7 = a(r1, r3, r11)
            int r10 = r10 * 4
            com.huawei.hms.scankit.p.u6 r7 = a(r7, r15, r10)
            com.huawei.hms.scankit.p.u6 r8 = a(r3, r1, r11)
            com.huawei.hms.scankit.p.u6 r8 = a(r8, r5, r10)
            com.huawei.hms.scankit.p.u6 r12 = a(r5, r15, r11)
            com.huawei.hms.scankit.p.u6 r3 = a(r12, r3, r10)
            com.huawei.hms.scankit.p.u6 r15 = a(r15, r5, r11)
            com.huawei.hms.scankit.p.u6 r15 = a(r15, r1, r10)
            com.huawei.hms.scankit.p.u6[] r1 = new com.huawei.hms.scankit.p.u6[r9]
            r1[r0] = r7
            r1[r2] = r8
            r1[r4] = r3
            r1[r6] = r15
            return r1
    }

    public com.huawei.hms.scankit.p.j2 a() throws com.huawei.hms.scankit.p.a {
            r13 = this;
            com.huawei.hms.scankit.p.j8 r0 = r13.b
            com.huawei.hms.scankit.p.u6[] r0 = r0.a()
            com.huawei.hms.scankit.p.u6[] r0 = r13.b(r0)
            com.huawei.hms.scankit.p.u6[] r0 = r13.c(r0)
            com.huawei.hms.scankit.p.u6 r1 = r13.a(r0)
            r2 = 3
            r0[r2] = r1
            if (r1 == 0) goto L69
            com.huawei.hms.scankit.p.u6[] r0 = r13.d(r0)
            r1 = 0
            r4 = r0[r1]
            r10 = 1
            r5 = r0[r10]
            r11 = 2
            r6 = r0[r11]
            r7 = r0[r2]
            int r0 = r13.a(r4, r7)
            int r3 = r0 + 1
            int r8 = r13.a(r6, r7)
            int r9 = r8 + 1
            r12 = r3 & 1
            if (r12 != r10) goto L38
            int r3 = r0 + 2
        L38:
            r0 = r9 & 1
            if (r0 != r10) goto L3e
            int r9 = r8 + 2
        L3e:
            int r0 = r3 * 4
            int r8 = r9 * 7
            if (r0 >= r8) goto L51
            int r0 = r9 * 4
            int r8 = r3 * 7
            if (r0 >= r8) goto L51
            int r3 = java.lang.Math.max(r3, r9)
            r8 = r3
            r9 = r8
            goto L52
        L51:
            r8 = r3
        L52:
            com.huawei.hms.scankit.p.s r3 = r13.a
            com.huawei.hms.scankit.p.s r0 = a(r3, r4, r5, r6, r7, r8, r9)
            com.huawei.hms.scankit.p.j2 r3 = new com.huawei.hms.scankit.p.j2
            r8 = 4
            com.huawei.hms.scankit.p.u6[] r8 = new com.huawei.hms.scankit.p.u6[r8]
            r8[r1] = r4
            r8[r10] = r5
            r8[r11] = r6
            r8[r2] = r7
            r3.<init>(r0, r8)
            return r3
        L69:
            com.huawei.hms.scankit.p.a r0 = com.huawei.hms.scankit.p.a.a()
            throw r0
    }
}
