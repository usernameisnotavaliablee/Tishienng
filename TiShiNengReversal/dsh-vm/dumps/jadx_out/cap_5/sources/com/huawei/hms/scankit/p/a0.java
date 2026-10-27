package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class a0 {
    private final com.huawei.hms.scankit.p.s a;
    private final com.huawei.hms.scankit.p.u6 b;
    private final com.huawei.hms.scankit.p.u6 c;
    private final com.huawei.hms.scankit.p.u6 d;
    private final com.huawei.hms.scankit.p.u6 e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;

    a0(com.huawei.hms.scankit.p.a0 r2) {
            r1 = this;
            r1.<init>()
            com.huawei.hms.scankit.p.s r0 = r2.a
            r1.a = r0
            com.huawei.hms.scankit.p.u6 r0 = r2.g()
            r1.b = r0
            com.huawei.hms.scankit.p.u6 r0 = r2.a()
            r1.c = r0
            com.huawei.hms.scankit.p.u6 r0 = r2.h()
            r1.d = r0
            com.huawei.hms.scankit.p.u6 r0 = r2.b()
            r1.e = r0
            int r0 = r2.e()
            r1.f = r0
            int r0 = r2.c()
            r1.g = r0
            int r0 = r2.f()
            r1.h = r0
            int r2 = r2.d()
            r1.i = r2
            return
    }

    a0(com.huawei.hms.scankit.p.s r4, com.huawei.hms.scankit.p.u6 r5, com.huawei.hms.scankit.p.u6 r6, com.huawei.hms.scankit.p.u6 r7, com.huawei.hms.scankit.p.u6 r8) throws com.huawei.hms.scankit.p.a {
            r3 = this;
            r3.<init>()
            r0 = 0
            r1 = 1
            if (r5 == 0) goto Lc
            if (r6 != 0) goto La
            goto Lc
        La:
            r2 = 0
            goto Ld
        Lc:
            r2 = 1
        Ld:
            if (r7 == 0) goto L11
            if (r8 != 0) goto L12
        L11:
            r0 = 1
        L12:
            if (r2 == 0) goto L1c
            if (r0 != 0) goto L17
            goto L1c
        L17:
            com.huawei.hms.scankit.p.a r4 = com.huawei.hms.scankit.p.a.a()
            throw r4
        L1c:
            if (r2 == 0) goto L32
            com.huawei.hms.scankit.p.u6 r5 = new com.huawei.hms.scankit.p.u6
            float r6 = r7.c()
            r0 = 0
            r5.<init>(r0, r6)
            com.huawei.hms.scankit.p.u6 r6 = new com.huawei.hms.scankit.p.u6
            float r1 = r8.c()
            r6.<init>(r0, r1)
            goto L52
        L32:
            if (r0 == 0) goto L52
            com.huawei.hms.scankit.p.u6 r7 = new com.huawei.hms.scankit.p.u6
            int r8 = r4.e()
            int r8 = r8 - r1
            float r8 = (float) r8
            float r0 = r5.c()
            r7.<init>(r8, r0)
            com.huawei.hms.scankit.p.u6 r8 = new com.huawei.hms.scankit.p.u6
            int r0 = r4.e()
            int r0 = r0 - r1
            float r0 = (float) r0
            float r1 = r6.c()
            r8.<init>(r0, r1)
        L52:
            r3.a = r4
            r3.b = r5
            r3.c = r6
            r3.d = r7
            r3.e = r8
            float r4 = r5.b()
            float r0 = r6.b()
            float r4 = java.lang.Math.min(r4, r0)
            int r4 = (int) r4
            r3.f = r4
            float r4 = r7.b()
            float r0 = r8.b()
            float r4 = java.lang.Math.max(r4, r0)
            int r4 = (int) r4
            r3.g = r4
            float r4 = r5.c()
            float r5 = r7.c()
            float r4 = java.lang.Math.min(r4, r5)
            int r4 = (int) r4
            r3.h = r4
            float r4 = r6.c()
            float r5 = r8.c()
            float r4 = java.lang.Math.max(r4, r5)
            int r4 = (int) r4
            r3.i = r4
            return
    }

    static com.huawei.hms.scankit.p.a0 a(com.huawei.hms.scankit.p.a0 r6, com.huawei.hms.scankit.p.a0 r7) throws com.huawei.hms.scankit.p.a {
            if (r6 != 0) goto L3
            return r7
        L3:
            if (r7 != 0) goto L6
            return r6
        L6:
            com.huawei.hms.scankit.p.a0 r0 = new com.huawei.hms.scankit.p.a0
            com.huawei.hms.scankit.p.s r1 = r6.a
            com.huawei.hms.scankit.p.u6 r2 = r6.b
            com.huawei.hms.scankit.p.u6 r3 = r6.c
            com.huawei.hms.scankit.p.u6 r4 = r7.d
            com.huawei.hms.scankit.p.u6 r5 = r7.e
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    com.huawei.hms.scankit.p.a0 a(int r13, int r14, boolean r15) throws com.huawei.hms.scankit.p.a {
            r12 = this;
            com.huawei.hms.scankit.p.u6 r0 = r12.b
            com.huawei.hms.scankit.p.u6 r1 = r12.c
            com.huawei.hms.scankit.p.u6 r2 = r12.d
            com.huawei.hms.scankit.p.u6 r3 = r12.e
            if (r13 <= 0) goto L2a
            if (r15 == 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r2
        Lf:
            float r5 = r4.c()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L18
            r5 = 0
        L18:
            com.huawei.hms.scankit.p.u6 r13 = new com.huawei.hms.scankit.p.u6
            float r4 = r4.b()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L27
            r8 = r13
        L25:
            r10 = r2
            goto L2c
        L27:
            r10 = r13
            r8 = r0
            goto L2c
        L2a:
            r8 = r0
            goto L25
        L2c:
            if (r14 <= 0) goto L5d
            if (r15 == 0) goto L33
            com.huawei.hms.scankit.p.u6 r13 = r12.c
            goto L35
        L33:
            com.huawei.hms.scankit.p.u6 r13 = r12.e
        L35:
            float r0 = r13.c()
            int r0 = (int) r0
            int r0 = r0 + r14
            com.huawei.hms.scankit.p.s r14 = r12.a
            int r14 = r14.c()
            if (r0 < r14) goto L4b
            com.huawei.hms.scankit.p.s r14 = r12.a
            int r14 = r14.c()
            int r0 = r14 + (-1)
        L4b:
            com.huawei.hms.scankit.p.u6 r14 = new com.huawei.hms.scankit.p.u6
            float r13 = r13.b()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L5a
            r9 = r14
        L58:
            r11 = r3
            goto L5f
        L5a:
            r11 = r14
            r9 = r1
            goto L5f
        L5d:
            r9 = r1
            goto L58
        L5f:
            com.huawei.hms.scankit.p.a0 r6 = new com.huawei.hms.scankit.p.a0
            com.huawei.hms.scankit.p.s r7 = r12.a
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
    }

    com.huawei.hms.scankit.p.u6 a() {
            r1 = this;
            com.huawei.hms.scankit.p.u6 r0 = r1.c
            return r0
    }

    com.huawei.hms.scankit.p.u6 b() {
            r1 = this;
            com.huawei.hms.scankit.p.u6 r0 = r1.e
            return r0
    }

    int c() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    int d() {
            r1 = this;
            int r0 = r1.i
            return r0
    }

    int e() {
            r1 = this;
            int r0 = r1.f
            return r0
    }

    int f() {
            r1 = this;
            int r0 = r1.h
            return r0
    }

    com.huawei.hms.scankit.p.u6 g() {
            r1 = this;
            com.huawei.hms.scankit.p.u6 r0 = r1.b
            return r0
    }

    com.huawei.hms.scankit.p.u6 h() {
            r1 = this;
            com.huawei.hms.scankit.p.u6 r0 = r1.d
            return r0
    }
}
