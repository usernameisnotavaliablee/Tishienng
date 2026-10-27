package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class j8 {
    private final com.huawei.hms.scankit.p.s a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public j8(com.huawei.hms.scankit.p.s r4) throws com.huawei.hms.scankit.p.a {
            r3 = this;
            int r0 = r4.e()
            int r0 = r0 / 2
            int r1 = r4.c()
            int r1 = r1 / 2
            r2 = 10
            r3.<init>(r4, r2, r0, r1)
            return
    }

    public j8(com.huawei.hms.scankit.p.s r4, int r5, int r6, int r7) throws com.huawei.hms.scankit.p.a {
            r3 = this;
            r3.<init>()
            r3.a = r4
            int r0 = r4.c()
            r3.b = r0
            int r4 = r4.e()
            r3.c = r4
            int r5 = r5 / 2
            int r1 = r6 - r5
            r3.d = r1
            int r6 = r6 + r5
            r3.e = r6
            int r2 = r7 - r5
            r3.g = r2
            int r7 = r7 + r5
            r3.f = r7
            if (r2 < 0) goto L2a
            if (r1 < 0) goto L2a
            if (r7 >= r0) goto L2a
            if (r6 >= r4) goto L2a
            return
        L2a:
            com.huawei.hms.scankit.p.a r4 = com.huawei.hms.scankit.p.a.a()
            throw r4
    }

    private com.huawei.hms.scankit.p.u6 a(float r6, float r7, float r8, float r9) {
            r5 = this;
            float r0 = com.huawei.hms.scankit.p.s4.a(r6, r7, r8, r9)
            int r0 = com.huawei.hms.scankit.p.s4.a(r0)
            float r8 = r8 - r6
            float r1 = (float) r0
            float r8 = r8 / r1
            float r9 = r9 - r7
            float r9 = r9 / r1
            r1 = 0
        Le:
            if (r1 >= r0) goto L32
            float r2 = (float) r1
            float r3 = r2 * r8
            float r3 = r3 + r6
            int r3 = com.huawei.hms.scankit.p.s4.a(r3)
            float r2 = r2 * r9
            float r2 = r2 + r7
            int r2 = com.huawei.hms.scankit.p.s4.a(r2)
            com.huawei.hms.scankit.p.s r4 = r5.a
            boolean r4 = r4.b(r3, r2)
            if (r4 == 0) goto L2f
            com.huawei.hms.scankit.p.u6 r6 = new com.huawei.hms.scankit.p.u6
            float r7 = (float) r3
            float r8 = (float) r2
            r6.<init>(r7, r8)
            return r6
        L2f:
            int r1 = r1 + 1
            goto Le
        L32:
            r6 = 0
            return r6
    }

    private void a(int[] r7) {
            r6 = this;
            r0 = 1
            r1 = 1
        L2:
            r2 = 8
            if (r1 != 0) goto La
            r1 = r7[r2]
            if (r1 == r0) goto L32
        La:
            r1 = 3
            r3 = r7[r1]
            int r4 = r6.b
            if (r3 >= r4) goto L32
            r4 = 0
            r4 = r7[r4]
            r5 = r7[r0]
            boolean r3 = r6.a(r4, r5, r3, r0)
            if (r3 == 0) goto L27
            r4 = r7[r1]
            int r4 = r4 + r0
            r7[r1] = r4
            r1 = 5
            r7[r1] = r0
            r7[r2] = r0
            goto L30
        L27:
            r2 = r7[r2]
            if (r2 == r0) goto L30
            r2 = r7[r1]
            int r2 = r2 + r0
            r7[r1] = r2
        L30:
            r1 = r3
            goto L2
        L32:
            return
    }

    private boolean a(int r2, int r3, int r4, boolean r5) {
            r1 = this;
            r0 = 1
            if (r5 == 0) goto L11
        L3:
            if (r2 > r3) goto L1f
            com.huawei.hms.scankit.p.s r5 = r1.a
            boolean r5 = r5.b(r2, r4)
            if (r5 == 0) goto Le
            return r0
        Le:
            int r2 = r2 + 1
            goto L3
        L11:
            if (r2 > r3) goto L1f
            com.huawei.hms.scankit.p.s r5 = r1.a
            boolean r5 = r5.b(r4, r2)
            if (r5 == 0) goto L1c
            return r0
        L1c:
            int r2 = r2 + 1
            goto L11
        L1f:
            r2 = 0
            return r2
    }

    private com.huawei.hms.scankit.p.u6[] a(com.huawei.hms.scankit.p.u6 r12, com.huawei.hms.scankit.p.u6 r13, com.huawei.hms.scankit.p.u6 r14, com.huawei.hms.scankit.p.u6 r15) {
            r11 = this;
            float r0 = r12.b()
            float r12 = r12.c()
            float r1 = r13.b()
            float r13 = r13.c()
            float r2 = r14.b()
            float r14 = r14.c()
            float r3 = r15.b()
            float r15 = r15.c()
            int r4 = r11.c
            float r4 = (float) r4
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 4
            r10 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L58
            com.huawei.hms.scankit.p.u6 r4 = new com.huawei.hms.scankit.p.u6
            float r3 = r3 - r10
            float r15 = r15 + r10
            r4.<init>(r3, r15)
            com.huawei.hms.scankit.p.u6 r15 = new com.huawei.hms.scankit.p.u6
            float r1 = r1 + r10
            float r13 = r13 + r10
            r15.<init>(r1, r13)
            com.huawei.hms.scankit.p.u6 r13 = new com.huawei.hms.scankit.p.u6
            float r2 = r2 - r10
            float r14 = r14 - r10
            r13.<init>(r2, r14)
            com.huawei.hms.scankit.p.u6 r14 = new com.huawei.hms.scankit.p.u6
            float r0 = r0 + r10
            float r12 = r12 - r10
            r14.<init>(r0, r12)
            com.huawei.hms.scankit.p.u6[] r12 = new com.huawei.hms.scankit.p.u6[r9]
            r12[r8] = r4
            r12[r7] = r15
            r12[r6] = r13
            r12[r5] = r14
            return r12
        L58:
            com.huawei.hms.scankit.p.u6 r4 = new com.huawei.hms.scankit.p.u6
            float r3 = r3 + r10
            float r15 = r15 + r10
            r4.<init>(r3, r15)
            com.huawei.hms.scankit.p.u6 r15 = new com.huawei.hms.scankit.p.u6
            float r1 = r1 + r10
            float r13 = r13 - r10
            r15.<init>(r1, r13)
            com.huawei.hms.scankit.p.u6 r13 = new com.huawei.hms.scankit.p.u6
            float r2 = r2 - r10
            float r14 = r14 + r10
            r13.<init>(r2, r14)
            com.huawei.hms.scankit.p.u6 r14 = new com.huawei.hms.scankit.p.u6
            float r0 = r0 - r10
            float r12 = r12 - r10
            r14.<init>(r0, r12)
            com.huawei.hms.scankit.p.u6[] r12 = new com.huawei.hms.scankit.p.u6[r9]
            r12[r8] = r4
            r12[r7] = r15
            r12[r6] = r13
            r12[r5] = r14
            return r12
    }

    private com.huawei.hms.scankit.p.u6[] b(int[] r13) throws com.huawei.hms.scankit.p.a {
            r12 = this;
            r0 = 1
            r1 = r13[r0]
            r2 = 0
            r3 = r13[r2]
            int r1 = r1 - r3
            r3 = 0
            r4 = r3
            r5 = 1
        La:
            r6 = 3
            if (r4 != 0) goto L21
            if (r5 >= r1) goto L21
            r4 = r13[r2]
            float r7 = (float) r4
            r6 = r13[r6]
            int r8 = r6 - r5
            float r8 = (float) r8
            int r4 = r4 + r5
            float r4 = (float) r4
            float r6 = (float) r6
            com.huawei.hms.scankit.p.u6 r4 = r12.a(r7, r8, r4, r6)
            int r5 = r5 + 1
            goto La
        L21:
            if (r4 == 0) goto L85
            r5 = r3
            r7 = 1
        L25:
            r8 = 2
            if (r5 != 0) goto L3c
            if (r7 >= r1) goto L3c
            r5 = r13[r2]
            float r9 = (float) r5
            r8 = r13[r8]
            int r10 = r8 + r7
            float r10 = (float) r10
            int r5 = r5 + r7
            float r5 = (float) r5
            float r8 = (float) r8
            com.huawei.hms.scankit.p.u6 r5 = r12.a(r9, r10, r5, r8)
            int r7 = r7 + 1
            goto L25
        L3c:
            if (r5 == 0) goto L80
            r2 = r3
            r7 = 1
        L40:
            if (r2 != 0) goto L56
            if (r7 >= r1) goto L56
            r2 = r13[r0]
            float r9 = (float) r2
            r10 = r13[r8]
            int r11 = r10 + r7
            float r11 = (float) r11
            int r2 = r2 - r7
            float r2 = (float) r2
            float r10 = (float) r10
            com.huawei.hms.scankit.p.u6 r2 = r12.a(r9, r11, r2, r10)
            int r7 = r7 + 1
            goto L40
        L56:
            if (r2 == 0) goto L7b
            r7 = 1
        L59:
            if (r3 != 0) goto L6f
            if (r7 >= r1) goto L6f
            r3 = r13[r0]
            float r8 = (float) r3
            r9 = r13[r6]
            int r10 = r9 - r7
            float r10 = (float) r10
            int r3 = r3 - r7
            float r3 = (float) r3
            float r9 = (float) r9
            com.huawei.hms.scankit.p.u6 r3 = r12.a(r8, r10, r3, r9)
            int r7 = r7 + 1
            goto L59
        L6f:
            if (r3 == 0) goto L76
            com.huawei.hms.scankit.p.u6[] r13 = r12.a(r3, r4, r2, r5)
            return r13
        L76:
            com.huawei.hms.scankit.p.a r13 = com.huawei.hms.scankit.p.a.a()
            throw r13
        L7b:
            com.huawei.hms.scankit.p.a r13 = com.huawei.hms.scankit.p.a.a()
            throw r13
        L80:
            com.huawei.hms.scankit.p.a r13 = com.huawei.hms.scankit.p.a.a()
            throw r13
        L85:
            com.huawei.hms.scankit.p.a r13 = com.huawei.hms.scankit.p.a.a()
            throw r13
    }

    private void c(int[] r7) {
            r6 = this;
            r0 = 1
            r1 = 1
        L2:
            r2 = 9
            if (r1 != 0) goto La
            r1 = r7[r2]
            if (r1 == r0) goto L31
        La:
            r1 = 0
            r3 = r7[r1]
            if (r3 < 0) goto L31
            r4 = 2
            r4 = r7[r4]
            r5 = 3
            r5 = r7[r5]
            boolean r3 = r6.a(r4, r5, r3, r1)
            if (r3 == 0) goto L26
            r4 = r7[r1]
            int r4 = r4 - r0
            r7[r1] = r4
            r1 = 5
            r7[r1] = r0
            r7[r2] = r0
            goto L2f
        L26:
            r2 = r7[r2]
            if (r2 == r0) goto L2f
            r2 = r7[r1]
            int r2 = r2 - r0
            r7[r1] = r2
        L2f:
            r1 = r3
            goto L2
        L31:
            return
    }

    private void d(int[] r7) {
            r6 = this;
            r0 = 1
            r1 = 1
        L2:
            r2 = 7
            if (r1 != 0) goto L9
            r1 = r7[r2]
            if (r1 == r0) goto L31
        L9:
            r1 = r7[r0]
            int r3 = r6.c
            if (r1 >= r3) goto L31
            r3 = 2
            r3 = r7[r3]
            r4 = 3
            r4 = r7[r4]
            r5 = 0
            boolean r1 = r6.a(r3, r4, r1, r5)
            if (r1 == 0) goto L27
            r3 = r7[r0]
            int r3 = r3 + r0
            r7[r0] = r3
            r3 = 5
            r7[r3] = r0
            r7[r2] = r0
            goto L2
        L27:
            r2 = r7[r2]
            if (r2 == r0) goto L2
            r2 = r7[r0]
            int r2 = r2 + r0
            r7[r0] = r2
            goto L2
        L31:
            return
    }

    private void e(int[] r7) {
            r6 = this;
            r0 = 1
            r1 = 1
        L2:
            r2 = 10
            if (r1 != 0) goto La
            r1 = r7[r2]
            if (r1 == r0) goto L30
        La:
            r1 = 2
            r3 = r7[r1]
            if (r3 < 0) goto L30
            r4 = 0
            r4 = r7[r4]
            r5 = r7[r0]
            boolean r3 = r6.a(r4, r5, r3, r0)
            if (r3 == 0) goto L25
            r4 = r7[r1]
            int r4 = r4 - r0
            r7[r1] = r4
            r1 = 5
            r7[r1] = r0
            r7[r2] = r0
            goto L2e
        L25:
            r2 = r7[r2]
            if (r2 == r0) goto L2e
            r2 = r7[r1]
            int r2 = r2 - r0
            r7[r1] = r2
        L2e:
            r1 = r3
            goto L2
        L30:
            return
    }

    public com.huawei.hms.scankit.p.u6[] a() throws com.huawei.hms.scankit.p.a {
            r10 = this;
            r0 = 11
            int[] r0 = new int[r0]
            int r1 = r10.d
            r2 = 0
            r0[r2] = r1
            int r1 = r10.e
            r3 = 1
            r0[r3] = r1
            int r1 = r10.g
            r4 = 2
            r0[r4] = r1
            int r1 = r10.f
            r5 = 3
            r0[r5] = r1
            r1 = 4
            r0[r1] = r2
            r6 = 5
            r0[r6] = r3
            r7 = 6
            r0[r7] = r2
            r8 = 7
            r0[r8] = r2
            r8 = 8
            r0[r8] = r2
            r8 = 9
            r0[r8] = r2
            r8 = 10
            r0[r8] = r2
        L30:
            r8 = r0[r6]
            if (r8 != r3) goto L69
            r0[r6] = r2
            r10.d(r0)
            r8 = r0[r3]
            int r9 = r10.c
            if (r8 < r9) goto L42
            r0[r1] = r3
            goto L69
        L42:
            r10.a(r0)
            r8 = r0[r5]
            int r9 = r10.b
            if (r8 < r9) goto L4e
            r0[r1] = r3
            goto L69
        L4e:
            r10.c(r0)
            r8 = r0[r2]
            if (r8 >= 0) goto L58
            r0[r1] = r3
            goto L69
        L58:
            r10.e(r0)
            r8 = r0[r4]
            if (r8 >= 0) goto L62
            r0[r1] = r3
            goto L69
        L62:
            r8 = r0[r6]
            if (r8 != r3) goto L30
            r0[r7] = r3
            goto L30
        L69:
            r1 = r0[r1]
            if (r1 == r3) goto L76
            r1 = r0[r7]
            if (r1 != r3) goto L76
            com.huawei.hms.scankit.p.u6[] r0 = r10.b(r0)
            return r0
        L76:
            com.huawei.hms.scankit.p.a r0 = com.huawei.hms.scankit.p.a.a()
            throw r0
    }
}
