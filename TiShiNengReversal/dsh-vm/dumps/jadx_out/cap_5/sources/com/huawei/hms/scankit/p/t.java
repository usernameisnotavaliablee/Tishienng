package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class t {
    private final com.huawei.hms.scankit.p.s a;
    private com.huawei.hms.scankit.p.a8 b;
    private com.huawei.hms.scankit.p.m3 c;
    private boolean d;

    t(com.huawei.hms.scankit.p.s r3) throws com.huawei.hms.scankit.p.a {
            r2 = this;
            r2.<init>()
            int r0 = r3.c()
            r1 = 21
            if (r0 < r1) goto L13
            r0 = r0 & 3
            r1 = 1
            if (r0 != r1) goto L13
            r2.a = r3
            return
        L13:
            com.huawei.hms.scankit.p.a r3 = com.huawei.hms.scankit.p.a.a()
            throw r3
    }

    private int a(int r2, int r3, int r4) {
            r1 = this;
            boolean r0 = r1.d
            if (r0 == 0) goto Lb
            com.huawei.hms.scankit.p.s r0 = r1.a
            boolean r2 = r0.b(r3, r2)
            goto L11
        Lb:
            com.huawei.hms.scankit.p.s r0 = r1.a
            boolean r2 = r0.b(r2, r3)
        L11:
            if (r2 == 0) goto L18
            int r2 = r4 << 1
            r2 = r2 | 1
            return r2
        L18:
            int r2 = r4 << 1
            return r2
    }

    void a() throws com.huawei.hms.scankit.p.a {
            r5 = this;
            com.huawei.hms.scankit.p.s r0 = r5.a
            if (r0 == 0) goto L36
            r0 = 0
        L5:
            com.huawei.hms.scankit.p.s r1 = r5.a
            int r1 = r1.e()
            if (r0 >= r1) goto L35
            int r1 = r0 + 1
            r2 = r1
        L10:
            com.huawei.hms.scankit.p.s r3 = r5.a
            int r3 = r3.c()
            if (r2 >= r3) goto L33
            com.huawei.hms.scankit.p.s r3 = r5.a
            boolean r3 = r3.b(r0, r2)
            com.huawei.hms.scankit.p.s r4 = r5.a
            boolean r4 = r4.b(r2, r0)
            if (r3 == r4) goto L30
            com.huawei.hms.scankit.p.s r3 = r5.a
            r3.a(r2, r0)
            com.huawei.hms.scankit.p.s r3 = r5.a
            r3.a(r0, r2)
        L30:
            int r2 = r2 + 1
            goto L10
        L33:
            r0 = r1
            goto L5
        L35:
            return
        L36:
            com.huawei.hms.scankit.p.a r0 = com.huawei.hms.scankit.p.a.a()
            throw r0
    }

    void a(boolean r2) {
            r1 = this;
            r0 = 0
            r1.b = r0
            r1.c = r0
            r1.d = r2
            return
    }

    byte[] b() throws com.huawei.hms.scankit.p.a {
            r17 = this;
            r0 = r17
            com.huawei.hms.scankit.p.m3 r1 = r0.c()
            com.huawei.hms.scankit.p.a8 r2 = r0.d()
            com.huawei.hms.scankit.p.f1[] r3 = com.huawei.hms.scankit.p.f1.values()
            byte r1 = r1.b()
            r1 = r3[r1]
            com.huawei.hms.scankit.p.s r3 = r0.a
            int r3 = r3.c()
            com.huawei.hms.scankit.p.s r4 = r0.a
            r1.a(r4, r3)
            com.huawei.hms.scankit.p.s r1 = r2.a()
            int r4 = r2.l()
            byte[] r4 = new byte[r4]
            int r5 = r3 + (-1)
            r6 = 1
            r8 = r5
            r9 = 0
            r10 = 0
            r11 = 0
        L30:
            if (r8 <= 0) goto L72
            r12 = 6
            if (r8 != r12) goto L37
            int r8 = r8 + (-1)
        L37:
            r12 = 0
        L38:
            if (r12 >= r3) goto L6d
            if (r6 == 0) goto L3f
            int r13 = r5 - r12
            goto L40
        L3f:
            r13 = r12
        L40:
            r14 = 0
        L41:
            r15 = 2
            if (r14 >= r15) goto L6a
            int r15 = r8 - r14
            boolean r16 = r1.b(r15, r13)
            if (r16 != 0) goto L67
            int r11 = r11 + 1
            int r10 = r10 << 1
            com.huawei.hms.scankit.p.s r7 = r0.a
            boolean r7 = r7.b(r15, r13)
            if (r7 == 0) goto L5b
            r7 = r10 | 1
            r10 = r7
        L5b:
            r7 = 8
            if (r11 != r7) goto L67
            int r7 = r9 + 1
            byte r10 = (byte) r10
            r4[r9] = r10
            r9 = r7
            r10 = 0
            r11 = 0
        L67:
            int r14 = r14 + 1
            goto L41
        L6a:
            int r12 = r12 + 1
            goto L38
        L6d:
            r6 = r6 ^ 1
            int r8 = r8 + (-2)
            goto L30
        L72:
            int r1 = r2.l()
            if (r9 != r1) goto L79
            return r4
        L79:
            com.huawei.hms.scankit.p.a r1 = com.huawei.hms.scankit.p.a.a()
            throw r1
    }

    com.huawei.hms.scankit.p.m3 c() throws com.huawei.hms.scankit.p.a {
            r6 = this;
            com.huawei.hms.scankit.p.m3 r0 = r6.c
            if (r0 == 0) goto L5
            return r0
        L5:
            r0 = 0
            r1 = 0
            r2 = 0
        L8:
            r3 = 6
            r4 = 8
            if (r1 >= r3) goto L14
            int r2 = r6.a(r1, r4, r2)
            int r1 = r1 + 1
            goto L8
        L14:
            r1 = 7
            int r2 = r6.a(r1, r4, r2)
            int r2 = r6.a(r4, r4, r2)
            int r1 = r6.a(r4, r1, r2)
            r2 = 5
        L22:
            if (r2 < 0) goto L2b
            int r1 = r6.a(r4, r2, r1)
            int r2 = r2 + (-1)
            goto L22
        L2b:
            com.huawei.hms.scankit.p.s r2 = r6.a
            int r2 = r2.c()
            int r3 = r2 + (-7)
            int r5 = r2 + (-1)
        L35:
            if (r5 < r3) goto L3e
            int r0 = r6.a(r4, r5, r0)
            int r5 = r5 + (-1)
            goto L35
        L3e:
            int r3 = r2 + (-8)
        L40:
            if (r3 >= r2) goto L49
            int r0 = r6.a(r3, r4, r0)
            int r3 = r3 + 1
            goto L40
        L49:
            com.huawei.hms.scankit.p.m3 r0 = com.huawei.hms.scankit.p.m3.a(r1, r0)
            r6.c = r0
            if (r0 == 0) goto L52
            return r0
        L52:
            com.huawei.hms.scankit.p.a r0 = com.huawei.hms.scankit.p.a.a()
            throw r0
    }

    com.huawei.hms.scankit.p.a8 d() throws com.huawei.hms.scankit.p.a {
            r7 = this;
            com.huawei.hms.scankit.p.a8 r0 = r7.b
            if (r0 == 0) goto L5
            return r0
        L5:
            com.huawei.hms.scankit.p.s r0 = r7.a
            int r0 = r0.c()
            int r1 = r0 + (-17)
            int r1 = r1 / 4
            r2 = 6
            if (r1 > r2) goto L17
            com.huawei.hms.scankit.p.a8 r0 = com.huawei.hms.scankit.p.a8.b(r1)
            return r0
        L17:
            int r1 = r0 + (-11)
            r2 = 5
            r3 = 0
            r4 = 5
            r5 = 0
        L1d:
            if (r4 < 0) goto L2d
            int r6 = r0 + (-9)
        L21:
            if (r6 < r1) goto L2a
            int r5 = r7.a(r6, r4, r5)
            int r6 = r6 + (-1)
            goto L21
        L2a:
            int r4 = r4 + (-1)
            goto L1d
        L2d:
            com.huawei.hms.scankit.p.a8 r4 = com.huawei.hms.scankit.p.a8.a(r5)
            if (r4 == 0) goto L3c
            int r5 = r4.k()
            if (r5 != r0) goto L3c
            r7.b = r4
            return r4
        L3c:
            if (r2 < 0) goto L4c
            int r4 = r0 + (-9)
        L40:
            if (r4 < r1) goto L49
            int r3 = r7.a(r2, r4, r3)
            int r4 = r4 + (-1)
            goto L40
        L49:
            int r2 = r2 + (-1)
            goto L3c
        L4c:
            com.huawei.hms.scankit.p.a8 r1 = com.huawei.hms.scankit.p.a8.a(r3)
            if (r1 == 0) goto L5b
            int r2 = r1.k()
            if (r2 != r0) goto L5b
            r7.b = r1
            return r1
        L5b:
            com.huawei.hms.scankit.p.a r0 = com.huawei.hms.scankit.p.a.a()
            throw r0
    }

    void e() {
            r3 = this;
            com.huawei.hms.scankit.p.m3 r0 = r3.c
            if (r0 != 0) goto L5
            return
        L5:
            com.huawei.hms.scankit.p.f1[] r0 = com.huawei.hms.scankit.p.f1.values()
            com.huawei.hms.scankit.p.m3 r1 = r3.c
            byte r1 = r1.b()
            r0 = r0[r1]
            com.huawei.hms.scankit.p.s r1 = r3.a
            int r1 = r1.c()
            com.huawei.hms.scankit.p.s r2 = r3.a
            r0.a(r2, r1)
            return
    }
}
