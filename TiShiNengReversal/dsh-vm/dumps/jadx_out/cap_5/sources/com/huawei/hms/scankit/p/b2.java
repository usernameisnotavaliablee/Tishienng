package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class b2 extends com.huawei.hms.scankit.p.a2 {
    private final boolean c;

    b2(com.huawei.hms.scankit.p.a0 r1, boolean r2) {
            r0 = this;
            r0.<init>(r1)
            r0.c = r2
            return
    }

    private void a(com.huawei.hms.scankit.p.x0[] r6, com.huawei.hms.scankit.p.k r7) throws com.huawei.hms.scankit.p.a {
            r5 = this;
            r0 = 0
        L1:
            int r1 = r6.length
            if (r0 >= r1) goto L5e
            r1 = r6[r0]
            if (r1 != 0) goto L9
            goto L5b
        L9:
            int r2 = r1.e()
            int r2 = r2 % 30
            int r1 = r1.c()
            int r3 = r7.c()
            r4 = 0
            if (r1 <= r3) goto L1d
            r6[r0] = r4
            goto L5b
        L1d:
            boolean r3 = r5.c
            if (r3 != 0) goto L23
            int r1 = r1 + 2
        L23:
            int r1 = r1 % 3
            r3 = 1
            if (r1 == 0) goto L50
            if (r1 == r3) goto L3d
            r3 = 2
            if (r1 != r3) goto L38
            int r2 = r2 + 1
            int r1 = r7.a()
            if (r2 == r1) goto L5b
            r6[r0] = r4
            goto L5b
        L38:
            com.huawei.hms.scankit.p.a r6 = com.huawei.hms.scankit.p.a.a()
            throw r6
        L3d:
            int r1 = r2 / 3
            int r3 = r7.b()
            if (r1 != r3) goto L4d
            int r2 = r2 % 3
            int r1 = r7.d()
            if (r2 == r1) goto L5b
        L4d:
            r6[r0] = r4
            goto L5b
        L50:
            int r2 = r2 * 3
            int r2 = r2 + r3
            int r1 = r7.e()
            if (r2 == r1) goto L5b
            r6[r0] = r4
        L5b:
            int r0 = r0 + 1
            goto L1
        L5e:
            return
    }

    private void b(com.huawei.hms.scankit.p.k r11) {
            r10 = this;
            com.huawei.hms.scankit.p.a0 r0 = r10.a()
            boolean r1 = r10.c
            if (r1 == 0) goto Ld
            com.huawei.hms.scankit.p.u6 r1 = r0.g()
            goto L11
        Ld:
            com.huawei.hms.scankit.p.u6 r1 = r0.h()
        L11:
            boolean r2 = r10.c
            if (r2 == 0) goto L1a
            com.huawei.hms.scankit.p.u6 r0 = r0.a()
            goto L1e
        L1a:
            com.huawei.hms.scankit.p.u6 r0 = r0.b()
        L1e:
            float r1 = r1.c()
            int r1 = (int) r1
            int r1 = r10.c(r1)
            float r0 = r0.c()
            int r0 = (int) r0
            int r0 = r10.c(r0)
            com.huawei.hms.scankit.p.x0[] r2 = r10.b()
            r3 = 1
            r4 = -1
            r5 = 0
            r6 = 1
        L38:
            if (r1 >= r0) goto L6e
            r7 = r2[r1]
            if (r7 != 0) goto L3f
            goto L6b
        L3f:
            r7.h()
            int r8 = r7.c()
            int r8 = r8 - r4
            if (r8 != 0) goto L4c
            int r5 = r5 + 1
            goto L6b
        L4c:
            if (r8 != r3) goto L58
            int r6 = java.lang.Math.max(r6, r5)
            int r4 = r7.c()
        L56:
            r5 = 1
            goto L6b
        L58:
            int r8 = r7.c()
            int r9 = r11.c()
            if (r8 < r9) goto L66
            r7 = 0
            r2[r1] = r7
            goto L6b
        L66:
            int r4 = r7.c()
            goto L56
        L6b:
            int r1 = r1 + 1
            goto L38
        L6e:
            return
    }

    private void f() {
            r4 = this;
            com.huawei.hms.scankit.p.x0[] r0 = r4.b()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            if (r3 == 0) goto Lf
            r3.h()
        Lf:
            int r2 = r2 + 1
            goto L6
        L12:
            return
    }

    void a(com.huawei.hms.scankit.p.k r14) throws com.huawei.hms.scankit.p.a {
            r13 = this;
            com.huawei.hms.scankit.p.x0[] r0 = r13.b()
            r13.f()
            r13.a(r0, r14)
            com.huawei.hms.scankit.p.a0 r1 = r13.a()
            boolean r2 = r13.c
            if (r2 == 0) goto L17
            com.huawei.hms.scankit.p.u6 r2 = r1.g()
            goto L1b
        L17:
            com.huawei.hms.scankit.p.u6 r2 = r1.h()
        L1b:
            boolean r3 = r13.c
            if (r3 == 0) goto L24
            com.huawei.hms.scankit.p.u6 r1 = r1.a()
            goto L28
        L24:
            com.huawei.hms.scankit.p.u6 r1 = r1.b()
        L28:
            float r2 = r2.c()
            int r2 = (int) r2
            int r2 = r13.c(r2)
            float r1 = r1.c()
            int r1 = (int) r1
            int r1 = r13.c(r1)
            r3 = 0
            r4 = 1
            r5 = -1
            r6 = 0
            r7 = 1
        L3f:
            if (r2 >= r1) goto L98
            r8 = r0[r2]
            if (r8 != 0) goto L46
            goto L95
        L46:
            int r9 = r8.c()
            int r9 = r9 - r5
            if (r9 != 0) goto L50
            int r6 = r6 + 1
            goto L95
        L50:
            if (r9 != r4) goto L5c
            int r7 = java.lang.Math.max(r7, r6)
            int r5 = r8.c()
        L5a:
            r6 = 1
            goto L95
        L5c:
            r10 = 0
            if (r9 < 0) goto L93
            int r11 = r8.c()
            int r12 = r14.c()
            if (r11 >= r12) goto L93
            if (r9 <= r2) goto L6c
            goto L93
        L6c:
            r11 = 2
            if (r7 <= r11) goto L73
            int r11 = r7 + (-2)
            int r9 = r9 * r11
        L73:
            if (r9 < r2) goto L77
            r11 = 1
            goto L78
        L77:
            r11 = 0
        L78:
            r12 = 1
        L79:
            if (r12 > r9) goto L89
            if (r11 != 0) goto L89
            int r11 = r2 - r12
            r11 = r0[r11]
            if (r11 == 0) goto L85
            r11 = 1
            goto L86
        L85:
            r11 = 0
        L86:
            int r12 = r12 + 1
            goto L79
        L89:
            if (r11 == 0) goto L8e
            r0[r2] = r10
            goto L95
        L8e:
            int r5 = r8.c()
            goto L5a
        L93:
            r0[r2] = r10
        L95:
            int r2 = r2 + 1
            goto L3f
        L98:
            return
    }

    com.huawei.hms.scankit.p.k c() throws com.huawei.hms.scankit.p.a {
            r13 = this;
            com.huawei.hms.scankit.p.x0[] r0 = r13.b()
            com.huawei.hms.scankit.p.m r1 = new com.huawei.hms.scankit.p.m
            r1.<init>()
            com.huawei.hms.scankit.p.m r2 = new com.huawei.hms.scankit.p.m
            r2.<init>()
            com.huawei.hms.scankit.p.m r3 = new com.huawei.hms.scankit.p.m
            r3.<init>()
            com.huawei.hms.scankit.p.m r4 = new com.huawei.hms.scankit.p.m
            r4.<init>()
            int r5 = r0.length
            r6 = 0
            r7 = 0
        L1b:
            r8 = 1
            r9 = 3
            if (r7 >= r5) goto L5e
            r10 = r0[r7]
            if (r10 != 0) goto L24
            goto L5b
        L24:
            r10.h()
            int r11 = r10.e()
            int r11 = r11 % 30
            int r10 = r10.c()
            boolean r12 = r13.c
            if (r12 != 0) goto L37
            int r10 = r10 + 2
        L37:
            int r10 = r10 % r9
            if (r10 == 0) goto L55
            if (r10 == r8) goto L4a
            r8 = 2
            if (r10 != r8) goto L45
            int r11 = r11 + 1
            r1.a(r11)
            goto L5b
        L45:
            com.huawei.hms.scankit.p.a r0 = com.huawei.hms.scankit.p.a.a()
            throw r0
        L4a:
            int r8 = r11 / 3
            r4.a(r8)
            int r11 = r11 % 3
            r3.a(r11)
            goto L5b
        L55:
            int r11 = r11 * 3
            int r11 = r11 + r8
            r2.a(r11)
        L5b:
            int r7 = r7 + 1
            goto L1b
        L5e:
            int[] r5 = r1.a()
            int r5 = r5.length
            if (r5 == 0) goto Lc4
            int[] r5 = r2.a()
            int r5 = r5.length
            if (r5 == 0) goto Lc4
            int[] r5 = r3.a()
            int r5 = r5.length
            if (r5 == 0) goto Lc4
            int[] r5 = r4.a()
            int r5 = r5.length
            if (r5 == 0) goto Lc4
            int[] r5 = r1.a()
            r5 = r5[r6]
            if (r5 < r8) goto Lc4
            int[] r5 = r2.a()
            r5 = r5[r6]
            int[] r7 = r3.a()
            r7 = r7[r6]
            int r5 = r5 + r7
            if (r5 < r9) goto Lc4
            int[] r5 = r2.a()
            r5 = r5[r6]
            int[] r7 = r3.a()
            r7 = r7[r6]
            int r5 = r5 + r7
            r7 = 90
            if (r5 <= r7) goto La3
            goto Lc4
        La3:
            com.huawei.hms.scankit.p.k r5 = new com.huawei.hms.scankit.p.k
            int[] r1 = r1.a()
            r1 = r1[r6]
            int[] r2 = r2.a()
            r2 = r2[r6]
            int[] r3 = r3.a()
            r3 = r3[r6]
            int[] r4 = r4.a()
            r4 = r4[r6]
            r5.<init>(r1, r2, r3, r4)
            r13.a(r0, r5)
            return r5
        Lc4:
            r0 = 0
            return r0
    }

    int[] d() throws com.huawei.hms.scankit.p.a {
            r7 = this;
            com.huawei.hms.scankit.p.k r0 = r7.c()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            r7.b(r0)
            int r0 = r0.c()
            int[] r1 = new int[r0]
            com.huawei.hms.scankit.p.x0[] r2 = r7.b()
            int r3 = r2.length
            r4 = 0
        L17:
            if (r4 >= r3) goto L2d
            r5 = r2[r4]
            if (r5 == 0) goto L2a
            int r5 = r5.c()
            if (r5 < r0) goto L24
            goto L2a
        L24:
            r6 = r1[r5]
            int r6 = r6 + 1
            r1[r5] = r6
        L2a:
            int r4 = r4 + 1
            goto L17
        L2d:
            return r1
    }

    boolean e() {
            r1 = this;
            boolean r0 = r1.c
            return r0
    }

    @Override // com.huawei.hms.scankit.p.a2
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "IsLeft: "
            r0.append(r1)
            boolean r1 = r2.c
            r0.append(r1)
            r1 = 10
            r0.append(r1)
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
