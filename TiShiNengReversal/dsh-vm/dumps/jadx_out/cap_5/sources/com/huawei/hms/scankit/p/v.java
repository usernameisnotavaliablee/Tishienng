package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class v {
    private final com.huawei.hms.scankit.p.s a;
    private final com.huawei.hms.scankit.p.s b;
    private final com.huawei.hms.scankit.p.z7 c;

    v(com.huawei.hms.scankit.p.s r3) throws com.huawei.hms.scankit.p.a {
            r2 = this;
            r2.<init>()
            int r0 = r3.c()
            r1 = 8
            if (r0 < r1) goto L2f
            r1 = 144(0x90, float:2.02E-43)
            if (r0 > r1) goto L2f
            r0 = r0 & 1
            if (r0 != 0) goto L2f
            com.huawei.hms.scankit.p.z7 r0 = b(r3)
            r2.c = r0
            com.huawei.hms.scankit.p.s r3 = r2.a(r3)
            r2.a = r3
            com.huawei.hms.scankit.p.s r0 = new com.huawei.hms.scankit.p.s
            int r1 = r3.e()
            int r3 = r3.c()
            r0.<init>(r1, r3)
            r2.b = r0
            return
        L2f:
            com.huawei.hms.scankit.p.a r3 = com.huawei.hms.scankit.p.a.a()
            throw r3
    }

    private int a(int r6, int r7) {
            r5 = this;
            int r0 = r6 + (-1)
            r1 = 0
            boolean r2 = r5.a(r0, r1, r6, r7)
            r3 = 1
            int r2 = r2 << r3
            boolean r4 = r5.a(r0, r3, r6, r7)
            if (r4 == 0) goto L11
            r2 = r2 | 1
        L11:
            int r2 = r2 << r3
            r4 = 2
            boolean r0 = r5.a(r0, r4, r6, r7)
            if (r0 == 0) goto L1b
            r2 = r2 | 1
        L1b:
            int r0 = r2 << 1
            int r2 = r7 + (-2)
            boolean r2 = r5.a(r1, r2, r6, r7)
            if (r2 == 0) goto L27
            r0 = r0 | 1
        L27:
            int r0 = r0 << r3
            int r2 = r7 + (-1)
            boolean r1 = r5.a(r1, r2, r6, r7)
            if (r1 == 0) goto L32
            r0 = r0 | 1
        L32:
            int r0 = r0 << r3
            boolean r1 = r5.a(r3, r2, r6, r7)
            if (r1 == 0) goto L3b
            r0 = r0 | 1
        L3b:
            int r0 = r0 << r3
            boolean r1 = r5.a(r4, r2, r6, r7)
            if (r1 == 0) goto L44
            r0 = r0 | 1
        L44:
            int r0 = r0 << r3
            r1 = 3
            boolean r6 = r5.a(r1, r2, r6, r7)
            if (r6 == 0) goto L4f
            r6 = r0 | 1
            return r6
        L4f:
            return r0
    }

    private com.huawei.hms.scankit.p.s a(com.huawei.hms.scankit.p.s r17) {
            r16 = this;
            r0 = r16
            com.huawei.hms.scankit.p.z7 r1 = r0.c
            int r1 = r1.f()
            com.huawei.hms.scankit.p.z7 r2 = r0.c
            int r2 = r2.e()
            int r3 = r17.c()
            if (r3 != r1) goto L6b
            com.huawei.hms.scankit.p.z7 r3 = r0.c
            int r3 = r3.c()
            com.huawei.hms.scankit.p.z7 r4 = r0.c
            int r4 = r4.b()
            int r1 = r1 / r3
            int r2 = r2 / r4
            int r5 = r1 * r3
            int r6 = r2 * r4
            com.huawei.hms.scankit.p.s r7 = new com.huawei.hms.scankit.p.s
            r7.<init>(r6, r5)
            r6 = 0
        L2c:
            if (r6 >= r1) goto L6a
            int r8 = r6 * r3
            r9 = 0
        L31:
            if (r9 >= r2) goto L65
            int r10 = r9 * r4
            r11 = 0
        L36:
            if (r11 >= r3) goto L60
            int r12 = r3 + 2
            int r12 = r12 * r6
            int r12 = r12 + 1
            int r12 = r12 + r11
            int r13 = r8 + r11
            r14 = 0
        L42:
            if (r14 >= r4) goto L5b
            int r15 = r4 + 2
            int r15 = r15 * r9
            int r15 = r15 + 1
            int r15 = r15 + r14
            r5 = r17
            boolean r15 = r5.b(r15, r12)
            if (r15 == 0) goto L58
            int r15 = r10 + r14
            r7.c(r15, r13)
        L58:
            int r14 = r14 + 1
            goto L42
        L5b:
            r5 = r17
            int r11 = r11 + 1
            goto L36
        L60:
            r5 = r17
            int r9 = r9 + 1
            goto L31
        L65:
            r5 = r17
            int r6 = r6 + 1
            goto L2c
        L6a:
            return r7
        L6b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Dimension of bitMatrix must match the version size"
            r1.<init>(r2)
            throw r1
    }

    private boolean a(int r1, int r2, int r3, int r4) {
            r0 = this;
            if (r1 >= 0) goto La
            int r1 = r1 + r3
            int r3 = r3 + 4
            r3 = r3 & 7
            int r3 = 4 - r3
            int r2 = r2 + r3
        La:
            if (r2 >= 0) goto L14
            int r2 = r2 + r4
            int r4 = r4 + 4
            r3 = r4 & 7
            int r3 = 4 - r3
            int r1 = r1 + r3
        L14:
            com.huawei.hms.scankit.p.s r3 = r0.b
            r3.c(r2, r1)
            com.huawei.hms.scankit.p.s r3 = r0.a
            boolean r1 = r3.b(r2, r1)
            return r1
    }

    private int[] a(int r3, int r4, int r5, int r6, byte[] r7, int r8) {
            r2 = this;
        L0:
            if (r3 >= r4) goto L16
            if (r5 < 0) goto L16
            com.huawei.hms.scankit.p.s r0 = r2.b
            boolean r0 = r0.b(r5, r3)
            if (r0 != 0) goto L16
            int r0 = r8 + 1
            int r1 = r2.b(r3, r5, r4, r6)
            byte r1 = (byte) r1
            r7[r8] = r1
            r8 = r0
        L16:
            int r0 = r3 + (-2)
            int r1 = r5 + 2
            if (r0 < 0) goto L22
            if (r1 < r6) goto L1f
            goto L22
        L1f:
            r3 = r0
            r5 = r1
            goto L0
        L22:
            int r3 = r3 + (-1)
            int r5 = r5 + 5
        L26:
            if (r3 < 0) goto L3c
            if (r5 >= r6) goto L3c
            com.huawei.hms.scankit.p.s r0 = r2.b
            boolean r0 = r0.b(r5, r3)
            if (r0 != 0) goto L3c
            int r0 = r8 + 1
            int r1 = r2.b(r3, r5, r4, r6)
            byte r1 = (byte) r1
            r7[r8] = r1
            r8 = r0
        L3c:
            int r0 = r3 + 2
            int r1 = r5 + (-2)
            if (r0 >= r4) goto L48
            if (r1 >= 0) goto L45
            goto L48
        L45:
            r3 = r0
            r5 = r1
            goto L26
        L48:
            int r3 = r3 + 5
            int r5 = r5 + (-1)
            int[] r3 = new int[]{r3, r5, r8}
            return r3
    }

    private int b(int r5, int r6) {
            r4 = this;
            int r0 = r5 + (-3)
            r1 = 0
            boolean r0 = r4.a(r0, r1, r5, r6)
            r2 = 1
            int r0 = r0 << r2
            int r3 = r5 + (-2)
            boolean r3 = r4.a(r3, r1, r5, r6)
            if (r3 == 0) goto L13
            r0 = r0 | 1
        L13:
            int r0 = r0 << r2
            int r3 = r5 + (-1)
            boolean r3 = r4.a(r3, r1, r5, r6)
            if (r3 == 0) goto L1e
            r0 = r0 | 1
        L1e:
            int r0 = r0 << r2
            int r3 = r6 + (-4)
            boolean r3 = r4.a(r1, r3, r5, r6)
            if (r3 == 0) goto L29
            r0 = r0 | 1
        L29:
            int r0 = r0 << r2
            int r3 = r6 + (-3)
            boolean r3 = r4.a(r1, r3, r5, r6)
            if (r3 == 0) goto L34
            r0 = r0 | 1
        L34:
            int r0 = r0 << r2
            int r3 = r6 + (-2)
            boolean r3 = r4.a(r1, r3, r5, r6)
            if (r3 == 0) goto L3f
            r0 = r0 | 1
        L3f:
            int r0 = r0 << r2
            int r3 = r6 + (-1)
            boolean r1 = r4.a(r1, r3, r5, r6)
            if (r1 == 0) goto L4a
            r0 = r0 | 1
        L4a:
            int r0 = r0 << r2
            boolean r5 = r4.a(r2, r3, r5, r6)
            if (r5 == 0) goto L54
            r5 = r0 | 1
            return r5
        L54:
            return r0
    }

    private int b(int r6, int r7, int r8, int r9) {
            r5 = this;
            int r0 = r6 + (-2)
            int r1 = r7 + (-2)
            boolean r2 = r5.a(r0, r1, r8, r9)
            int r2 = r2 << 1
            int r3 = r7 + (-1)
            boolean r0 = r5.a(r0, r3, r8, r9)
            if (r0 == 0) goto L14
            r2 = r2 | 1
        L14:
            int r0 = r2 << 1
            int r2 = r6 + (-1)
            boolean r4 = r5.a(r2, r1, r8, r9)
            if (r4 == 0) goto L20
            r0 = r0 | 1
        L20:
            int r0 = r0 << 1
            boolean r4 = r5.a(r2, r3, r8, r9)
            if (r4 == 0) goto L2a
            r0 = r0 | 1
        L2a:
            int r0 = r0 << 1
            boolean r2 = r5.a(r2, r7, r8, r9)
            if (r2 == 0) goto L34
            r0 = r0 | 1
        L34:
            int r0 = r0 << 1
            boolean r1 = r5.a(r6, r1, r8, r9)
            if (r1 == 0) goto L3e
            r0 = r0 | 1
        L3e:
            int r0 = r0 << 1
            boolean r1 = r5.a(r6, r3, r8, r9)
            if (r1 == 0) goto L48
            r0 = r0 | 1
        L48:
            int r0 = r0 << 1
            boolean r6 = r5.a(r6, r7, r8, r9)
            if (r6 == 0) goto L53
            r6 = r0 | 1
            return r6
        L53:
            return r0
    }

    private static com.huawei.hms.scankit.p.z7 b(com.huawei.hms.scankit.p.s r1) throws com.huawei.hms.scankit.p.a {
            int r0 = r1.c()
            int r1 = r1.e()
            com.huawei.hms.scankit.p.z7 r1 = com.huawei.hms.scankit.p.z7.a(r0, r1)
            return r1
    }

    private int c(int r8, int r9) {
            r7 = this;
            int r0 = r8 + (-1)
            r1 = 0
            boolean r2 = r7.a(r0, r1, r8, r9)
            r3 = 1
            int r2 = r2 << r3
            int r4 = r9 + (-1)
            boolean r0 = r7.a(r0, r4, r8, r9)
            if (r0 == 0) goto L13
            r2 = r2 | 1
        L13:
            int r0 = r2 << 1
            int r2 = r9 + (-3)
            boolean r5 = r7.a(r1, r2, r8, r9)
            if (r5 == 0) goto L1f
            r0 = r0 | 1
        L1f:
            int r0 = r0 << r3
            int r5 = r9 + (-2)
            boolean r6 = r7.a(r1, r5, r8, r9)
            if (r6 == 0) goto L2a
            r0 = r0 | 1
        L2a:
            int r0 = r0 << r3
            boolean r1 = r7.a(r1, r4, r8, r9)
            if (r1 == 0) goto L33
            r0 = r0 | 1
        L33:
            int r0 = r0 << r3
            boolean r1 = r7.a(r3, r2, r8, r9)
            if (r1 == 0) goto L3c
            r0 = r0 | 1
        L3c:
            int r0 = r0 << r3
            boolean r1 = r7.a(r3, r5, r8, r9)
            if (r1 == 0) goto L45
            r0 = r0 | 1
        L45:
            int r0 = r0 << r3
            boolean r8 = r7.a(r3, r4, r8, r9)
            if (r8 == 0) goto L4f
            r8 = r0 | 1
            return r8
        L4f:
            return r0
    }

    private int d(int r5, int r6) {
            r4 = this;
            int r0 = r5 + (-3)
            r1 = 0
            boolean r0 = r4.a(r0, r1, r5, r6)
            r2 = 1
            int r0 = r0 << r2
            int r3 = r5 + (-2)
            boolean r3 = r4.a(r3, r1, r5, r6)
            if (r3 == 0) goto L13
            r0 = r0 | 1
        L13:
            int r0 = r0 << r2
            int r3 = r5 + (-1)
            boolean r3 = r4.a(r3, r1, r5, r6)
            if (r3 == 0) goto L1e
            r0 = r0 | 1
        L1e:
            int r0 = r0 << r2
            int r3 = r6 + (-2)
            boolean r3 = r4.a(r1, r3, r5, r6)
            if (r3 == 0) goto L29
            r0 = r0 | 1
        L29:
            int r0 = r0 << r2
            int r3 = r6 + (-1)
            boolean r1 = r4.a(r1, r3, r5, r6)
            if (r1 == 0) goto L34
            r0 = r0 | 1
        L34:
            int r0 = r0 << r2
            boolean r1 = r4.a(r2, r3, r5, r6)
            if (r1 == 0) goto L3d
            r0 = r0 | 1
        L3d:
            int r0 = r0 << r2
            r1 = 2
            boolean r1 = r4.a(r1, r3, r5, r6)
            if (r1 == 0) goto L47
            r0 = r0 | 1
        L47:
            int r0 = r0 << r2
            r1 = 3
            boolean r5 = r4.a(r1, r3, r5, r6)
            if (r5 == 0) goto L52
            r5 = r0 | 1
            return r5
        L52:
            return r0
    }

    com.huawei.hms.scankit.p.z7 a() {
            r1 = this;
            com.huawei.hms.scankit.p.z7 r0 = r1.c
            return r0
    }

    byte[] b() throws com.huawei.hms.scankit.p.a {
            r18 = this;
            r0 = r18
            com.huawei.hms.scankit.p.z7 r1 = r0.c
            int r1 = r1.g()
            byte[] r5 = new byte[r1]
            com.huawei.hms.scankit.p.s r1 = r0.a
            int r2 = r1.c()
            com.huawei.hms.scankit.p.s r1 = r0.a
            int r4 = r1.e()
            r8 = 4
            r1 = 4
            r3 = 0
            r6 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
        L1e:
            r13 = 1
            if (r1 != r2) goto L38
            if (r3 != 0) goto L38
            if (r9 != 0) goto L38
            int r9 = r6 + 1
            int r14 = r0.a(r2, r4)
            byte r14 = (byte) r14
            r5[r6] = r14
            int r1 = r1 + (-2)
            int r3 = r3 + 2
            r6 = r9
            r9 = 1
        L34:
            r16 = 0
            goto L9d
        L38:
            int r14 = r2 + (-2)
            if (r1 != r14) goto L54
            if (r3 != 0) goto L54
            r15 = r4 & 3
            if (r15 == 0) goto L54
            if (r10 != 0) goto L54
            int r10 = r6 + 1
            int r14 = r0.b(r2, r4)
            byte r14 = (byte) r14
            r5[r6] = r14
            int r1 = r1 + (-2)
            int r3 = r3 + 2
            r6 = r10
            r10 = 1
            goto L34
        L54:
            int r15 = r2 + 4
            r16 = 0
            r7 = 2
            if (r1 != r15) goto L73
            if (r3 != r7) goto L73
            r15 = r4 & 7
            if (r15 != 0) goto L73
            if (r11 != 0) goto L73
            int r7 = r6 + 1
            int r11 = r0.c(r2, r4)
            byte r11 = (byte) r11
            r5[r6] = r11
            int r1 = r1 + (-2)
            int r3 = r3 + 2
            r6 = r7
            r11 = 1
            goto L9d
        L73:
            if (r1 != r14) goto L8d
            if (r3 != 0) goto L8d
            r14 = r4 & 7
            if (r14 != r8) goto L8d
            if (r12 != 0) goto L8d
            int r7 = r6 + 1
            int r12 = r0.d(r2, r4)
            byte r12 = (byte) r12
            r5[r6] = r12
            int r1 = r1 + (-2)
            int r3 = r3 + 2
            r6 = r7
            r12 = 1
            goto L9d
        L8d:
            int[] r1 = r0.a(r1, r2, r3, r4, r5, r6)
            r3 = r1[r16]
            r6 = r1[r13]
            r1 = r1[r7]
            r17 = r6
            r6 = r1
            r1 = r3
            r3 = r17
        L9d:
            if (r1 < r2) goto L1e
            if (r3 < r4) goto L1e
            com.huawei.hms.scankit.p.z7 r1 = r0.c
            int r1 = r1.g()
            if (r6 != r1) goto Laa
            return r5
        Laa:
            com.huawei.hms.scankit.p.a r1 = com.huawei.hms.scankit.p.a.a()
            throw r1
    }
}
