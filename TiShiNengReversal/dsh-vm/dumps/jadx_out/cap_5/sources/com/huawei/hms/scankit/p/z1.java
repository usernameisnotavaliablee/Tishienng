package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class z1 {
    private final com.huawei.hms.scankit.p.k a;
    private final com.huawei.hms.scankit.p.a2[] b;
    private com.huawei.hms.scankit.p.a0 c;
    private final int d;

    z1(com.huawei.hms.scankit.p.k r1, com.huawei.hms.scankit.p.a0 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            int r1 = r1.a()
            r0.d = r1
            r0.c = r2
            int r1 = r1 + 2
            com.huawei.hms.scankit.p.a2[] r1 = new com.huawei.hms.scankit.p.a2[r1]
            r0.b = r1
            return
    }

    private int a() {
            r7 = this;
            int r0 = r7.b()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r2 = 1
            r3 = 1
        La:
            int r4 = r7.d
            int r4 = r4 + r2
            if (r3 >= r4) goto L2f
            com.huawei.hms.scankit.p.a2[] r4 = r7.b
            r4 = r4[r3]
            com.huawei.hms.scankit.p.x0[] r4 = r4.b()
            r5 = 0
        L18:
            int r6 = r4.length
            if (r5 >= r6) goto L2c
            r6 = r4[r5]
            if (r6 != 0) goto L20
            goto L29
        L20:
            boolean r6 = r6.g()
            if (r6 != 0) goto L29
            r7.a(r3, r5, r4)
        L29:
            int r5 = r5 + 1
            goto L18
        L2c:
            int r3 = r3 + 1
            goto La
        L2f:
            return r0
    }

    private static int a(int r1, int r2, com.huawei.hms.scankit.p.x0 r3) {
            if (r3 != 0) goto L3
            goto L16
        L3:
            boolean r0 = r3.g()
            if (r0 != 0) goto L16
            boolean r0 = r3.a(r1)
            if (r0 == 0) goto L14
            r3.b(r1)
            r1 = 0
            return r1
        L14:
            int r2 = r2 + 1
        L16:
            return r2
    }

    private void a(int r11, int r12, com.huawei.hms.scankit.p.x0[] r13) {
            r10 = this;
            r0 = r13[r12]
            com.huawei.hms.scankit.p.a2[] r1 = r10.b
            int r2 = r11 + (-1)
            r1 = r1[r2]
            com.huawei.hms.scankit.p.x0[] r1 = r1.b()
            com.huawei.hms.scankit.p.a2[] r2 = r10.b
            r3 = 1
            int r11 = r11 + r3
            r11 = r2[r11]
            if (r11 == 0) goto L19
            com.huawei.hms.scankit.p.x0[] r11 = r11.b()
            goto L1a
        L19:
            r11 = r1
        L1a:
            r2 = 14
            com.huawei.hms.scankit.p.x0[] r4 = new com.huawei.hms.scankit.p.x0[r2]
            r5 = r1[r12]
            r6 = 2
            r4[r6] = r5
            r5 = r11[r12]
            r7 = 3
            r4[r7] = r5
            r5 = 0
            if (r12 <= 0) goto L3b
            int r7 = r12 + (-1)
            r8 = r13[r7]
            r4[r5] = r8
            r8 = r1[r7]
            r9 = 4
            r4[r9] = r8
            r7 = r11[r7]
            r8 = 5
            r4[r8] = r7
        L3b:
            if (r12 <= r3) goto L51
            int r7 = r12 + (-2)
            r8 = r13[r7]
            r9 = 8
            r4[r9] = r8
            r8 = r1[r7]
            r9 = 10
            r4[r9] = r8
            r7 = r11[r7]
            r8 = 11
            r4[r8] = r7
        L51:
            int r7 = r13.length
            int r7 = r7 - r3
            if (r12 >= r7) goto L65
            int r7 = r12 + 1
            r8 = r13[r7]
            r4[r3] = r8
            r3 = r1[r7]
            r8 = 6
            r4[r8] = r3
            r3 = r11[r7]
            r7 = 7
            r4[r7] = r3
        L65:
            int r3 = r13.length
            int r3 = r3 - r6
            if (r12 >= r3) goto L7c
            int r12 = r12 + r6
            r13 = r13[r12]
            r3 = 9
            r4[r3] = r13
            r13 = r1[r12]
            r1 = 12
            r4[r1] = r13
            r11 = r11[r12]
            r12 = 13
            r4[r12] = r11
        L7c:
            if (r5 >= r2) goto L8a
            r11 = r4[r5]
            boolean r11 = a(r0, r11)
            if (r11 == 0) goto L87
            goto L8a
        L87:
            int r5 = r5 + 1
            goto L7c
        L8a:
            return
    }

    private void a(com.huawei.hms.scankit.p.a2 r2) throws com.huawei.hms.scankit.p.a {
            r1 = this;
            if (r2 == 0) goto Lf
            com.huawei.hms.scankit.p.b2 r2 = (com.huawei.hms.scankit.p.b2) r2     // Catch: java.lang.ClassCastException -> La
            com.huawei.hms.scankit.p.k r0 = r1.a     // Catch: java.lang.ClassCastException -> La
            r2.a(r0)     // Catch: java.lang.ClassCastException -> La
            return
        La:
            com.huawei.hms.scankit.p.a r2 = com.huawei.hms.scankit.p.a.a()
            throw r2
        Lf:
            return
    }

    private static boolean a(com.huawei.hms.scankit.p.x0 r3, com.huawei.hms.scankit.p.x0 r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            boolean r1 = r4.g()
            if (r1 == 0) goto L1d
            int r1 = r4.a()
            int r2 = r3.a()
            if (r1 != r2) goto L1d
            int r4 = r4.c()
            r3.b(r4)
            r3 = 1
            return r3
        L1d:
            return r0
    }

    private int b() {
            r2 = this;
            r2.c()
            int r0 = r2.d()
            int r1 = r2.e()
            int r0 = r0 + r1
            return r0
    }

    private void c() {
            r7 = this;
            com.huawei.hms.scankit.p.a2[] r0 = r7.b
            r1 = 0
            r2 = r0[r1]
            if (r2 == 0) goto L68
            int r3 = r7.d
            r4 = 1
            int r3 = r3 + r4
            r0 = r0[r3]
            if (r0 != 0) goto L10
            goto L68
        L10:
            com.huawei.hms.scankit.p.x0[] r0 = r2.b()
            com.huawei.hms.scankit.p.a2[] r2 = r7.b
            int r3 = r7.d
            int r3 = r3 + r4
            r2 = r2[r3]
            com.huawei.hms.scankit.p.x0[] r2 = r2.b()
        L1f:
            int r3 = r0.length
            if (r1 >= r3) goto L68
            r3 = r0[r1]
            if (r3 == 0) goto L65
            r5 = r2[r1]
            if (r5 == 0) goto L65
            int r3 = r3.c()
            r5 = r2[r1]
            int r5 = r5.c()
            if (r3 != r5) goto L65
            r3 = 1
        L37:
            int r5 = r7.d
            if (r3 > r5) goto L65
            com.huawei.hms.scankit.p.a2[] r5 = r7.b
            r5 = r5[r3]
            com.huawei.hms.scankit.p.x0[] r5 = r5.b()
            r5 = r5[r1]
            if (r5 != 0) goto L48
            goto L62
        L48:
            r6 = r0[r1]
            int r6 = r6.c()
            r5.b(r6)
            boolean r5 = r5.g()
            if (r5 != 0) goto L62
            com.huawei.hms.scankit.p.a2[] r5 = r7.b
            r5 = r5[r3]
            com.huawei.hms.scankit.p.x0[] r5 = r5.b()
            r6 = 0
            r5[r1] = r6
        L62:
            int r3 = r3 + 1
            goto L37
        L65:
            int r1 = r1 + 1
            goto L1f
        L68:
            return
    }

    private int d() {
            r9 = this;
            com.huawei.hms.scankit.p.a2[] r0 = r9.b
            r1 = 0
            r0 = r0[r1]
            if (r0 != 0) goto L8
            return r1
        L8:
            com.huawei.hms.scankit.p.x0[] r0 = r0.b()
            r2 = 0
            r3 = 0
        Le:
            int r4 = r0.length
            if (r2 >= r4) goto L43
            r4 = r0[r2]
            if (r4 != 0) goto L16
            goto L40
        L16:
            int r4 = r4.c()
            r5 = 1
            r6 = 1
            r7 = 0
        L1d:
            int r8 = r9.d
            int r8 = r8 + r5
            if (r6 >= r8) goto L40
            r8 = 2
            if (r7 >= r8) goto L40
            com.huawei.hms.scankit.p.a2[] r8 = r9.b
            r8 = r8[r6]
            com.huawei.hms.scankit.p.x0[] r8 = r8.b()
            r8 = r8[r2]
            if (r8 == 0) goto L3d
            int r7 = a(r4, r7, r8)
            boolean r8 = r8.g()
            if (r8 != 0) goto L3d
            int r3 = r3 + 1
        L3d:
            int r6 = r6 + 1
            goto L1d
        L40:
            int r2 = r2 + 1
            goto Le
        L43:
            return r3
    }

    private int e() {
            r8 = this;
            com.huawei.hms.scankit.p.a2[] r0 = r8.b
            int r1 = r8.d
            int r1 = r1 + 1
            r0 = r0[r1]
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            com.huawei.hms.scankit.p.x0[] r0 = r0.b()
            r2 = 0
            r3 = 0
        L12:
            int r4 = r0.length
            if (r2 >= r4) goto L46
            r4 = r0[r2]
            if (r4 != 0) goto L1a
            goto L43
        L1a:
            int r4 = r4.c()
            int r5 = r8.d
            int r5 = r5 + 1
            r6 = 0
        L23:
            if (r5 <= 0) goto L43
            r7 = 2
            if (r6 >= r7) goto L43
            com.huawei.hms.scankit.p.a2[] r7 = r8.b
            r7 = r7[r5]
            com.huawei.hms.scankit.p.x0[] r7 = r7.b()
            r7 = r7[r2]
            if (r7 == 0) goto L40
            int r6 = a(r4, r6, r7)
            boolean r7 = r7.g()
            if (r7 != 0) goto L40
            int r3 = r3 + 1
        L40:
            int r5 = r5 + (-1)
            goto L23
        L43:
            int r2 = r2 + 1
            goto L12
        L46:
            return r3
    }

    com.huawei.hms.scankit.p.a2 a(int r2) {
            r1 = this;
            com.huawei.hms.scankit.p.a2[] r0 = r1.b
            r2 = r0[r2]
            return r2
    }

    void a(int r2, com.huawei.hms.scankit.p.a2 r3) {
            r1 = this;
            com.huawei.hms.scankit.p.a2[] r0 = r1.b
            r0[r2] = r3
            return
    }

    void a(com.huawei.hms.scankit.p.a0 r1) {
            r0 = this;
            r0.c = r1
            return
    }

    int f() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    int g() {
            r1 = this;
            com.huawei.hms.scankit.p.k r0 = r1.a
            int r0 = r0.b()
            return r0
    }

    int h() {
            r1 = this;
            com.huawei.hms.scankit.p.k r0 = r1.a
            int r0 = r0.c()
            return r0
    }

    com.huawei.hms.scankit.p.a0 i() {
            r1 = this;
            com.huawei.hms.scankit.p.a0 r0 = r1.c
            return r0
    }

    com.huawei.hms.scankit.p.a2[] j() throws com.huawei.hms.scankit.p.a {
            r2 = this;
            com.huawei.hms.scankit.p.a2[] r0 = r2.b
            r1 = 0
            r0 = r0[r1]
            r2.a(r0)
            com.huawei.hms.scankit.p.a2[] r0 = r2.b
            int r1 = r2.d
            int r1 = r1 + 1
            r0 = r0[r1]
            r2.a(r0)
            r0 = 928(0x3a0, float:1.3E-42)
        L15:
            int r1 = r2.a()
            if (r1 <= 0) goto L20
            if (r1 < r0) goto L1e
            goto L20
        L1e:
            r0 = r1
            goto L15
        L20:
            com.huawei.hms.scankit.p.a2[] r0 = r2.b
            return r0
    }

    public java.lang.String toString() {
            r10 = this;
            com.huawei.hms.scankit.p.a2[] r0 = r10.b
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != 0) goto Ld
            int r2 = r10.d
            int r2 = r2 + r3
            r2 = r0[r2]
        Ld:
            java.util.Formatter r0 = new java.util.Formatter
            r0.<init>()
            r4 = 0
        L13:
            com.huawei.hms.scankit.p.x0[] r5 = r2.b()     // Catch: java.lang.Throwable -> L3c
            int r5 = r5.length     // Catch: java.lang.Throwable -> L3c
            if (r4 >= r5) goto L74
            java.lang.String r5 = "CW %3d:"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L3c
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L3c
            r7[r1] = r6     // Catch: java.lang.Throwable -> L3c
            r0.format(r5, r7)     // Catch: java.lang.Throwable -> L3c
            r5 = 0
        L28:
            int r6 = r10.d     // Catch: java.lang.Throwable -> L3c
            r7 = 2
            int r6 = r6 + r7
            if (r5 >= r6) goto L6a
            com.huawei.hms.scankit.p.a2[] r6 = r10.b     // Catch: java.lang.Throwable -> L3c
            r6 = r6[r5]     // Catch: java.lang.Throwable -> L3c
            java.lang.String r8 = "    |   "
            if (r6 != 0) goto L3e
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L3c
            r0.format(r8, r6)     // Catch: java.lang.Throwable -> L3c
            goto L67
        L3c:
            r1 = move-exception
            goto L7c
        L3e:
            com.huawei.hms.scankit.p.x0[] r6 = r6.b()     // Catch: java.lang.Throwable -> L3c
            r6 = r6[r4]     // Catch: java.lang.Throwable -> L3c
            if (r6 != 0) goto L4c
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L3c
            r0.format(r8, r6)     // Catch: java.lang.Throwable -> L3c
            goto L67
        L4c:
            java.lang.String r8 = " %3d|%3d"
            int r9 = r6.c()     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L3c
            int r6 = r6.e()     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L3c
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L3c
            r7[r1] = r9     // Catch: java.lang.Throwable -> L3c
            r7[r3] = r6     // Catch: java.lang.Throwable -> L3c
            r0.format(r8, r7)     // Catch: java.lang.Throwable -> L3c
        L67:
            int r5 = r5 + 1
            goto L28
        L6a:
            java.lang.String r5 = "%n"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L3c
            r0.format(r5, r6)     // Catch: java.lang.Throwable -> L3c
            int r4 = r4 + 1
            goto L13
        L74:
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> L3c
            r0.close()
            return r1
        L7c:
            r0.close()     // Catch: java.lang.Throwable -> L80
            goto L84
        L80:
            r0 = move-exception
            r1.addSuppressed(r0)
        L84:
            throw r1
    }
}
