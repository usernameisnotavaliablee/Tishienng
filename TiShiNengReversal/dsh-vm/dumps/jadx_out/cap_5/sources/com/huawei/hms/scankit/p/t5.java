package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class t5 {
    private static final com.huawei.hms.scankit.p.a3 a = null;

    static {
            com.huawei.hms.scankit.p.a3 r0 = new com.huawei.hms.scankit.p.a3
            r0.<init>()
            com.huawei.hms.scankit.p.t5.a = r0
            return
    }

    public t5() {
            r1 = this;
            r1.<init>()
            return
    }

    private static int a(com.huawei.hms.scankit.p.s r5, int r6, int r7, boolean r8, int r9, int r10) {
            if (r8 == 0) goto L4
            r0 = -1
            goto L5
        L4:
            r0 = 1
        L5:
            r1 = 0
            r2 = r9
        L7:
            r3 = 2
            if (r1 >= r3) goto L28
        La:
            if (r8 == 0) goto Lf
            if (r2 < r6) goto L22
            goto L11
        Lf:
            if (r2 >= r7) goto L22
        L11:
            boolean r4 = r5.b(r2, r10)
            if (r8 != r4) goto L22
            int r4 = r9 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r4 <= r3) goto L20
            return r9
        L20:
            int r2 = r2 + r0
            goto La
        L22:
            int r0 = -r0
            r8 = r8 ^ 1
            int r1 = r1 + 1
            goto L7
        L28:
            return r2
    }

    private static int a(com.huawei.hms.scankit.p.z1 r6, int r7, int r8, boolean r9) {
            if (r9 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = -1
        L5:
            int r1 = r7 - r0
            boolean r2 = a(r6, r1)
            if (r2 == 0) goto L16
            com.huawei.hms.scankit.p.a2 r2 = r6.a(r1)
            com.huawei.hms.scankit.p.x0 r2 = r2.a(r8)
            goto L17
        L16:
            r2 = 0
        L17:
            if (r2 == 0) goto L25
            if (r9 == 0) goto L20
            int r6 = r2.b()
            return r6
        L20:
            int r6 = r2.d()
            return r6
        L25:
            com.huawei.hms.scankit.p.a2 r2 = r6.a(r7)
            com.huawei.hms.scankit.p.x0 r2 = r2.b(r8)
            if (r2 == 0) goto L3b
            if (r9 == 0) goto L36
            int r6 = r2.d()
            return r6
        L36:
            int r6 = r2.b()
            return r6
        L3b:
            boolean r3 = a(r6, r1)
            if (r3 == 0) goto L49
            com.huawei.hms.scankit.p.a2 r1 = r6.a(r1)
            com.huawei.hms.scankit.p.x0 r2 = r1.b(r8)
        L49:
            if (r2 == 0) goto L57
            if (r9 == 0) goto L52
            int r6 = r2.b()
            return r6
        L52:
            int r6 = r2.d()
            return r6
        L57:
            r8 = 0
            r1 = 0
        L59:
            int r7 = r7 - r0
            boolean r2 = a(r6, r7)
            if (r2 == 0) goto L90
            com.huawei.hms.scankit.p.a2 r2 = r6.a(r7)
            com.huawei.hms.scankit.p.x0[] r2 = r2.b()
            int r3 = r2.length
            r4 = 0
        L6a:
            if (r4 >= r3) goto L8d
            r5 = r2[r4]
            if (r5 == 0) goto L8a
            if (r9 == 0) goto L77
            int r6 = r5.b()
            goto L7b
        L77:
            int r6 = r5.d()
        L7b:
            int r0 = r0 * r1
            int r7 = r5.b()
            int r8 = r5.d()
            int r7 = r7 - r8
            int r0 = r0 * r7
            int r6 = r6 + r0
            return r6
        L8a:
            int r4 = r4 + 1
            goto L6a
        L8d:
            int r1 = r1 + 1
            goto L59
        L90:
            if (r9 == 0) goto L9b
            com.huawei.hms.scankit.p.a0 r6 = r6.i()
            int r6 = r6.e()
            return r6
        L9b:
            com.huawei.hms.scankit.p.a0 r6 = r6.i()
            int r6 = r6.c()
            return r6
    }

    private static int a(int[] r2) {
            r0 = 0
            r0 = r2[r0]
            r1 = 2
            r1 = r2[r1]
            int r0 = r0 - r1
            r1 = 4
            r1 = r2[r1]
            int r0 = r0 + r1
            r1 = 6
            r2 = r2[r1]
            int r0 = r0 - r2
            int r0 = r0 + 9
            int r0 = r0 % 9
            return r0
    }

    private static int a(int[] r2, int[] r3, int r4) throws com.huawei.hms.scankit.p.a {
            if (r3 == 0) goto L9
            int r0 = r3.length
            int r1 = r4 / 2
            int r1 = r1 + 3
            if (r0 > r1) goto L16
        L9:
            if (r4 < 0) goto L16
            r0 = 512(0x200, float:7.17E-43)
            if (r4 > r0) goto L16
            com.huawei.hms.scankit.p.a3 r0 = com.huawei.hms.scankit.p.t5.a
            int r2 = r0.a(r2, r4, r3)
            return r2
        L16:
            com.huawei.hms.scankit.p.a r2 = com.huawei.hms.scankit.p.a.a()
            throw r2
    }

    private static com.huawei.hms.scankit.p.a0 a(com.huawei.hms.scankit.p.b2 r8) throws com.huawei.hms.scankit.p.a {
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            int[] r1 = r8.d()
            if (r1 != 0) goto Lb
            return r0
        Lb:
            int r0 = b(r1)
            int r2 = r1.length
            r3 = 0
            r4 = 0
            r5 = 0
        L13:
            if (r4 >= r2) goto L20
            r6 = r1[r4]
            int r7 = r0 - r6
            int r5 = r5 + r7
            if (r6 <= 0) goto L1d
            goto L20
        L1d:
            int r4 = r4 + 1
            goto L13
        L20:
            com.huawei.hms.scankit.p.x0[] r2 = r8.b()
            r4 = 0
        L25:
            if (r5 <= 0) goto L30
            r6 = r2[r4]
            if (r6 != 0) goto L30
            int r5 = r5 + (-1)
            int r4 = r4 + 1
            goto L25
        L30:
            int r4 = r1.length
            int r4 = r4 + (-1)
        L33:
            if (r4 < 0) goto L40
            r6 = r1[r4]
            int r7 = r0 - r6
            int r3 = r3 + r7
            if (r6 <= 0) goto L3d
            goto L40
        L3d:
            int r4 = r4 + (-1)
            goto L33
        L40:
            int r0 = r2.length
            int r0 = r0 + (-1)
        L43:
            if (r3 <= 0) goto L4e
            r1 = r2[r0]
            if (r1 != 0) goto L4e
            int r3 = r3 + (-1)
            int r0 = r0 + (-1)
            goto L43
        L4e:
            com.huawei.hms.scankit.p.a0 r0 = r8.a()
            boolean r8 = r8.e()
            com.huawei.hms.scankit.p.a0 r8 = r0.a(r5, r3, r8)
            return r8
    }

    private static com.huawei.hms.scankit.p.b2 a(com.huawei.hms.scankit.p.s r11, com.huawei.hms.scankit.p.a0 r12, com.huawei.hms.scankit.p.u6 r13, boolean r14, int r15, int r16) {
            com.huawei.hms.scankit.p.b2 r8 = new com.huawei.hms.scankit.p.b2
            r8.<init>(r12, r14)
            r0 = 0
            r9 = 0
        L7:
            r0 = 2
            if (r9 >= r0) goto L4e
            if (r9 != 0) goto Lf
            r0 = 1
            r10 = 1
            goto L11
        Lf:
            r0 = -1
            r10 = -1
        L11:
            float r0 = r13.b()
            int r0 = (int) r0
            float r1 = r13.c()
            int r1 = (int) r1
            r4 = r0
            r5 = r1
        L1d:
            int r0 = r12.d()
            if (r5 > r0) goto L4b
            int r0 = r12.f()
            if (r5 < r0) goto L4b
            int r2 = r11.e()
            r1 = 0
            r0 = r11
            r3 = r14
            r6 = r15
            r7 = r16
            com.huawei.hms.scankit.p.x0 r1 = a(r0, r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L49
            r8.a(r5, r1)
            if (r14 == 0) goto L44
            int r0 = r1.d()
        L42:
            r4 = r0
            goto L49
        L44:
            int r0 = r1.b()
            goto L42
        L49:
            int r5 = r5 + r10
            goto L1d
        L4b:
            int r9 = r9 + 1
            goto L7
        L4e:
            return r8
    }

    private static com.huawei.hms.scankit.p.k a(com.huawei.hms.scankit.p.b2 r3, com.huawei.hms.scankit.p.b2 r4) throws com.huawei.hms.scankit.p.a {
            r0 = 0
            if (r3 == 0) goto L33
            com.huawei.hms.scankit.p.k r3 = r3.c()
            if (r3 != 0) goto La
            goto L33
        La:
            if (r4 == 0) goto L32
            com.huawei.hms.scankit.p.k r4 = r4.c()
            if (r4 != 0) goto L13
            goto L32
        L13:
            int r1 = r3.a()
            int r2 = r4.a()
            if (r1 == r2) goto L32
            int r1 = r3.b()
            int r2 = r4.b()
            if (r1 == r2) goto L32
            int r1 = r3.c()
            int r4 = r4.c()
            if (r1 == r4) goto L32
            return r0
        L32:
            return r3
        L33:
            if (r4 != 0) goto L36
            return r0
        L36:
            com.huawei.hms.scankit.p.k r3 = r4.c()
            return r3
    }

    private static com.huawei.hms.scankit.p.w1 a(int r8, int[] r9, int[] r10, int[] r11, int[][] r12, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r13) throws com.huawei.hms.scankit.p.a {
            int r0 = r11.length
            int[] r1 = new int[r0]
            r2 = 100
        L5:
            int r3 = r2 + (-1)
            if (r2 <= 0) goto L47
            r2 = 0
            r4 = 0
        Lb:
            if (r4 >= r0) goto L1a
            r5 = r11[r4]
            r6 = r12[r4]
            r7 = r1[r4]
            r6 = r6[r7]
            r9[r5] = r6
            int r4 = r4 + 1
            goto Lb
        L1a:
            com.huawei.hms.scankit.p.w1 r8 = a(r9, r8, r10, r13)     // Catch: com.huawei.hms.scankit.p.a -> L1f
            return r8
        L1f:
            if (r0 == 0) goto L42
            r4 = 0
        L22:
            if (r4 >= r0) goto L40
            r5 = r1[r4]
            r6 = r12[r4]
            int r6 = r6.length
            int r6 = r6 + (-1)
            if (r5 >= r6) goto L32
            int r5 = r5 + 1
            r1[r4] = r5
            goto L40
        L32:
            r1[r4] = r2
            int r5 = r0 + (-1)
            if (r4 == r5) goto L3b
            int r4 = r4 + 1
            goto L22
        L3b:
            com.huawei.hms.scankit.p.a r8 = com.huawei.hms.scankit.p.a.a()
            throw r8
        L40:
            r2 = r3
            goto L5
        L42:
            com.huawei.hms.scankit.p.a r8 = com.huawei.hms.scankit.p.a.a()
            throw r8
        L47:
            com.huawei.hms.scankit.p.a r8 = com.huawei.hms.scankit.p.a.a()
            throw r8
    }

    public static com.huawei.hms.scankit.p.w1 a(com.huawei.hms.scankit.p.s r7, com.huawei.hms.scankit.p.u6 r8, com.huawei.hms.scankit.p.u6 r9, com.huawei.hms.scankit.p.u6 r10, com.huawei.hms.scankit.p.u6 r11, int r12, int r13, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r14) throws com.huawei.hms.scankit.p.a {
            com.huawei.hms.scankit.p.a0 r0 = new com.huawei.hms.scankit.p.a0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r9 = r2
            r8 = 0
            r1 = 1
            r10 = r0
            r2 = 1
            r0 = r8
        L10:
            if (r9 == 0) goto L1d
            r8 = r10
            r10 = 1
            r11 = r12
            r12 = r13
            com.huawei.hms.scankit.p.b2 r10 = a(r7, r8, r9, r10, r11, r12)
        L1a:
            r13 = r9
            r3 = r10
            goto L23
        L1d:
            r11 = r10
            r10 = r8
            r8 = r11
            r11 = r12
            r12 = r13
            goto L1a
        L23:
            if (r4 == 0) goto L2c
            r10 = 0
            r9 = r4
            com.huawei.hms.scankit.p.b2 r10 = a(r7, r8, r9, r10, r11, r12)
            r0 = r10
        L2c:
            r9 = r13
            r13 = r12
            r12 = r11
            r11 = r7
            com.huawei.hms.scankit.p.z1 r7 = b(r3, r0)
            if (r7 == 0) goto L70
            com.huawei.hms.scankit.p.a0 r10 = r7.i()
            r5 = 0
            if (r2 == 0) goto L57
            if (r10 == 0) goto L57
            int r2 = r10.f()
            int r6 = r8.f()
            if (r2 < r6) goto L53
            int r2 = r10.d()
            int r6 = r8.d()
            if (r2 <= r6) goto L57
        L53:
            r7 = r11
            r8 = r3
            r2 = 0
            goto L10
        L57:
            r7.a(r8)
            int r9 = r7.f()
            int r10 = r9 + 1
            r7.a(r5, r3)
            r7.a(r10, r0)
            r9 = r8
            r8 = r3
            a(r7, r8, r9, r10, r11, r12, r13)
            com.huawei.hms.scankit.p.w1 r7 = a(r7, r14)
            return r7
        L70:
            com.huawei.hms.scankit.p.a r7 = com.huawei.hms.scankit.p.a.a()
            throw r7
    }

    private static com.huawei.hms.scankit.p.w1 a(com.huawei.hms.scankit.p.z1 r12, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r13) throws com.huawei.hms.scankit.p.a {
            com.huawei.hms.scankit.p.m[][] r0 = a(r12)
            a(r12, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r12.h()
            int r3 = r12.f()
            int r2 = r2 * r3
            int[] r4 = new int[r2]
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5 = 0
            r6 = 0
        L24:
            int r7 = r12.h()
            if (r6 >= r7) goto L65
            r7 = 0
        L2b:
            int r8 = r12.f()
            if (r7 >= r8) goto L62
            r8 = r0[r6]
            int r9 = r7 + 1
            r8 = r8[r9]
            int[] r8 = r8.a()
            int r10 = r12.f()
            int r10 = r10 * r6
            int r10 = r10 + r7
            int r7 = r8.length
            if (r7 != 0) goto L4d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r1.add(r7)
            goto L60
        L4d:
            int r7 = r8.length
            r11 = 1
            if (r7 != r11) goto L56
            r7 = r8[r5]
            r4[r10] = r7
            goto L60
        L56:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r3.add(r7)
            r2.add(r8)
        L60:
            r7 = r9
            goto L2b
        L62:
            int r6 = r6 + 1
            goto L24
        L65:
            int r0 = r2.size()
            int[][] r7 = new int[r0][]
        L6b:
            if (r5 >= r0) goto L78
            java.lang.Object r6 = r2.get(r5)
            int[] r6 = (int[]) r6
            r7[r5] = r6
            int r5 = r5 + 1
            goto L6b
        L78:
            int r12 = r12.g()
            int[] r5 = com.huawei.hms.scankit.p.n5.a(r1)
            int[] r6 = com.huawei.hms.scankit.p.n5.a(r3)
            r3 = r12
            r8 = r13
            com.huawei.hms.scankit.p.w1 r12 = a(r3, r4, r5, r6, r7, r8)
            return r12
    }

    private static com.huawei.hms.scankit.p.w1 a(int[] r2, int r3, int[] r4, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r5) throws com.huawei.hms.scankit.p.a, com.huawei.hms.scankit.p.a {
            int r0 = r2.length
            if (r0 == 0) goto L27
            int r0 = r3 + 1
            r1 = 1
            int r0 = r1 << r0
            int r1 = a(r2, r4, r0)
            a(r2, r0)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            com.huawei.hms.scankit.p.w1 r2 = com.huawei.hms.scankit.p.q1.a(r2, r3, r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r2.b(r3)
            int r3 = r4.length
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.a(r3)
            return r2
        L27:
            com.huawei.hms.scankit.p.a r2 = com.huawei.hms.scankit.p.a.a()
            throw r2
    }

    private static com.huawei.hms.scankit.p.x0 a(com.huawei.hms.scankit.p.s r2, int r3, int r4, boolean r5, int r6, int r7, int r8, int r9) {
            int r6 = a(r2, r3, r4, r5, r6, r7)
            int[] r2 = b(r2, r3, r4, r5, r6, r7)
            r3 = 0
            if (r2 != 0) goto Lc
            return r3
        Lc:
            int r4 = com.huawei.hms.scankit.p.s4.a(r2)
            if (r5 == 0) goto L15
            int r5 = r6 + r4
            goto L33
        L15:
            r5 = 0
        L16:
            int r7 = r2.length
            int r7 = r7 / 2
            if (r5 >= r7) goto L2e
            r7 = r2[r5]
            int r0 = r2.length
            int r0 = r0 + (-1)
            int r0 = r0 - r5
            r0 = r2[r0]
            r2[r5] = r0
            int r0 = r2.length
            int r0 = r0 + (-1)
            int r0 = r0 - r5
            r2[r0] = r7
            int r5 = r5 + 1
            goto L16
        L2e:
            int r5 = r6 - r4
            r1 = r6
            r6 = r5
            r5 = r1
        L33:
            boolean r4 = a(r4, r8, r9)
            if (r4 != 0) goto L3a
            return r3
        L3a:
            int r2 = com.huawei.hms.scankit.p.m5.d(r2)
            int r4 = com.huawei.hms.scankit.p.n5.a(r2)
            r7 = -1
            if (r4 != r7) goto L46
            return r3
        L46:
            com.huawei.hms.scankit.p.x0 r3 = new com.huawei.hms.scankit.p.x0
            int r2 = b(r2)
            r3.<init>(r6, r5, r2, r4)
            return r3
    }

    private static void a(com.huawei.hms.scankit.p.z1 r18, com.huawei.hms.scankit.p.b2 r19, com.huawei.hms.scankit.p.a0 r20, int r21, com.huawei.hms.scankit.p.s r22, int r23, int r24) {
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = 0
            r4 = 1
            if (r19 == 0) goto Lc
            r8 = 1
            goto Ld
        Lc:
            r8 = 0
        Ld:
            r5 = r23
            r6 = r24
            r13 = 1
        L12:
            if (r13 > r2) goto L9b
            if (r8 == 0) goto L18
            r14 = r13
            goto L1b
        L18:
            int r7 = r2 - r13
            r14 = r7
        L1b:
            com.huawei.hms.scankit.p.a2 r7 = r0.a(r14)
            if (r7 == 0) goto L23
            goto L97
        L23:
            if (r14 == 0) goto L2f
            if (r14 != r2) goto L28
            goto L2f
        L28:
            com.huawei.hms.scankit.p.a2 r7 = new com.huawei.hms.scankit.p.a2
            r7.<init>(r1)
        L2d:
            r15 = r7
            goto L3a
        L2f:
            com.huawei.hms.scankit.p.b2 r7 = new com.huawei.hms.scankit.p.b2
            if (r14 != 0) goto L35
            r9 = 1
            goto L36
        L35:
            r9 = 0
        L36:
            r7.<init>(r1, r9)
            goto L2d
        L3a:
            r0.a(r14, r15)
            int r7 = r1.f()
            r9 = -1
            r11 = r5
            r12 = r6
            r10 = r7
            r5 = -1
        L46:
            int r6 = r1.d()
            if (r10 > r6) goto L95
            int r6 = a(r0, r14, r10, r8)
            if (r6 < 0) goto L58
            int r7 = r1.c()
            if (r6 <= r7) goto L60
        L58:
            if (r5 != r9) goto L5f
            r16 = r5
            r17 = -1
            goto L8f
        L5f:
            r6 = r5
        L60:
            int r7 = r1.e()
            r9 = r6
            r6 = r7
            r16 = -1
            int r7 = r1.c()
            r16 = r5
            r17 = -1
            r5 = r22
            com.huawei.hms.scankit.p.x0 r6 = a(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r6 == 0) goto L8f
            r15.a(r10, r6)
            int r5 = r6.f()
            int r5 = java.lang.Math.min(r11, r5)
            int r6 = r6.f()
            int r6 = java.lang.Math.max(r12, r6)
            r11 = r5
            r12 = r6
            r5 = r9
            goto L91
        L8f:
            r5 = r16
        L91:
            int r10 = r10 + 1
            r9 = -1
            goto L46
        L95:
            r5 = r11
            r6 = r12
        L97:
            int r13 = r13 + 1
            goto L12
        L9b:
            return
    }

    private static void a(com.huawei.hms.scankit.p.z1 r5, com.huawei.hms.scankit.p.m[][] r6) throws com.huawei.hms.scankit.p.a {
            r0 = 0
            r6 = r6[r0]
            r1 = 1
            r6 = r6[r1]
            int[] r2 = r6.a()
            int r3 = r5.f()
            int r4 = r5.h()
            int r3 = r3 * r4
            int r5 = r5.g()
            int r5 = c(r5)
            int r3 = r3 - r5
            int r5 = r2.length
            if (r5 != 0) goto L2f
            if (r3 < r1) goto L2a
            r5 = 928(0x3a0, float:1.3E-42)
            if (r3 > r5) goto L2a
            r6.a(r3)
            return
        L2a:
            com.huawei.hms.scankit.p.a r5 = com.huawei.hms.scankit.p.a.a()
            throw r5
        L2f:
            r5 = r2[r0]
            if (r5 == r3) goto L36
            r6.a(r3)
        L36:
            return
    }

    private static void a(int[] r3, int r4) throws com.huawei.hms.scankit.p.a {
            int r0 = r3.length
            r1 = 4
            if (r0 < r1) goto L1f
            r0 = 0
            r1 = r3[r0]
            int r2 = r3.length
            if (r1 > r2) goto L1a
            if (r1 != 0) goto L19
            int r1 = r3.length
            if (r4 >= r1) goto L14
            int r1 = r3.length
            int r1 = r1 - r4
            r3[r0] = r1
            return
        L14:
            com.huawei.hms.scankit.p.a r3 = com.huawei.hms.scankit.p.a.a()
            throw r3
        L19:
            return
        L1a:
            com.huawei.hms.scankit.p.a r3 = com.huawei.hms.scankit.p.a.a()
            throw r3
        L1f:
            com.huawei.hms.scankit.p.a r3 = com.huawei.hms.scankit.p.a.a()
            throw r3
    }

    private static boolean a(int r0, int r1, int r2) {
            int r1 = r1 + (-2)
            if (r1 > r0) goto La
            int r2 = r2 + 2
            if (r0 > r2) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    private static boolean a(com.huawei.hms.scankit.p.z1 r1, int r2) {
            if (r2 < 0) goto Lb
            int r1 = r1.f()
            r0 = 1
            int r1 = r1 + r0
            if (r2 > r1) goto Lb
            return r0
        Lb:
            r1 = 0
            return r1
    }

    private static int[] a(int r4) {
            r0 = 8
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 7
        L6:
            r3 = r4 & 1
            if (r3 == r1) goto L10
            int r2 = r2 + (-1)
            if (r2 >= 0) goto Lf
            return r0
        Lf:
            r1 = r3
        L10:
            r3 = r0[r2]
            int r3 = r3 + 1
            r0[r2] = r3
            int r4 = r4 >> 1
            goto L6
    }

    private static com.huawei.hms.scankit.p.m[][] a(com.huawei.hms.scankit.p.z1 r11) throws com.huawei.hms.scankit.p.a {
            int r0 = r11.h()
            int r1 = r11.f()
            r2 = 2
            int r1 = r1 + r2
            int[] r2 = new int[r2]
            r3 = 1
            r2[r3] = r1
            r1 = 0
            r2[r1] = r0
            java.lang.Class<com.huawei.hms.scankit.p.m> r0 = com.huawei.hms.scankit.p.m.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r2)
            com.huawei.hms.scankit.p.m[][] r0 = (com.huawei.hms.scankit.p.m[][]) r0
            r2 = 0
        L1b:
            int r3 = r0.length
            if (r2 >= r3) goto L31
            r3 = 0
        L1f:
            r4 = r0[r2]
            int r5 = r4.length
            if (r3 >= r5) goto L2e
            com.huawei.hms.scankit.p.m r5 = new com.huawei.hms.scankit.p.m
            r5.<init>()
            r4[r3] = r5
            int r3 = r3 + 1
            goto L1f
        L2e:
            int r2 = r2 + 1
            goto L1b
        L31:
            com.huawei.hms.scankit.p.a2[] r11 = r11.j()
            int r2 = r11.length
            r3 = 0
            r4 = 0
        L38:
            if (r3 >= r2) goto L67
            r5 = r11[r3]
            if (r5 == 0) goto L62
            com.huawei.hms.scankit.p.x0[] r5 = r5.b()
            int r6 = r5.length
            r7 = 0
        L44:
            if (r7 >= r6) goto L62
            r8 = r5[r7]
            if (r8 == 0) goto L5f
            int r9 = r8.c()
            if (r9 < 0) goto L5f
            int r10 = r0.length
            if (r9 < r10) goto L54
            goto L5f
        L54:
            r9 = r0[r9]
            r9 = r9[r4]
            int r8 = r8.e()
            r9.a(r8)
        L5f:
            int r7 = r7 + 1
            goto L44
        L62:
            int r4 = r4 + 1
            int r3 = r3 + 1
            goto L38
        L67:
            return r0
    }

    private static int b(int r0) {
            int[] r0 = a(r0)
            int r0 = a(r0)
            return r0
    }

    private static int b(int[] r4) {
            int r0 = r4.length
            r1 = -1
            r2 = 0
        L3:
            if (r2 >= r0) goto Le
            r3 = r4[r2]
            int r1 = java.lang.Math.max(r1, r3)
            int r2 = r2 + 1
            goto L3
        Le:
            return r1
    }

    private static com.huawei.hms.scankit.p.z1 b(com.huawei.hms.scankit.p.b2 r2, com.huawei.hms.scankit.p.b2 r3) throws com.huawei.hms.scankit.p.a {
            r0 = 0
            if (r2 != 0) goto L6
            if (r3 != 0) goto L6
            return r0
        L6:
            com.huawei.hms.scankit.p.k r1 = a(r2, r3)
            if (r1 != 0) goto Ld
            return r0
        Ld:
            com.huawei.hms.scankit.p.a0 r2 = a(r2)
            com.huawei.hms.scankit.p.a0 r3 = a(r3)
            com.huawei.hms.scankit.p.a0 r2 = com.huawei.hms.scankit.p.a0.a(r2, r3)
            com.huawei.hms.scankit.p.z1 r3 = new com.huawei.hms.scankit.p.z1
            r3.<init>(r1, r2)
            return r3
    }

    private static int[] b(com.huawei.hms.scankit.p.s r7, int r8, int r9, boolean r10, int r11, int r12) {
            r0 = 8
            int[] r1 = new int[r0]
            r2 = 1
            if (r10 == 0) goto L9
            r3 = 1
            goto La
        L9:
            r3 = -1
        La:
            r4 = 0
            r5 = r10
        Lc:
            if (r10 == 0) goto L11
            if (r11 >= r9) goto L27
            goto L13
        L11:
            if (r11 < r8) goto L27
        L13:
            if (r4 >= r0) goto L27
            boolean r6 = r7.b(r11, r12)
            if (r6 != r5) goto L22
            r6 = r1[r4]
            int r6 = r6 + r2
            r1[r4] = r6
            int r11 = r11 + r3
            goto Lc
        L22:
            int r4 = r4 + 1
            r5 = r5 ^ 1
            goto Lc
        L27:
            if (r4 == r0) goto L34
            if (r10 == 0) goto L2c
            r8 = r9
        L2c:
            if (r11 != r8) goto L32
            r7 = 7
            if (r4 != r7) goto L32
            goto L34
        L32:
            r7 = 0
            return r7
        L34:
            return r1
    }

    private static int c(int r1) {
            r0 = 2
            int r1 = r0 << r1
            return r1
    }
}
