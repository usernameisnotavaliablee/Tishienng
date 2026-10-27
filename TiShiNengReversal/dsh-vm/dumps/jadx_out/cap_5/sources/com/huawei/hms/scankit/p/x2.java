package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class x2 {
    private static final int[] a = null;

    static {
            r0 = 33
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12} // fill-array
            com.huawei.hms.scankit.p.x2.a = r0
            return
    }

    public x2() {
            r1 = this;
            r1.<init>()
            return
    }

    private static int a(int r1, boolean r2) {
            if (r2 == 0) goto L5
            r2 = 88
            goto L7
        L5:
            r2 = 112(0x70, float:1.57E-43)
        L7:
            int r0 = r1 * 16
            int r2 = r2 + r0
            int r2 = r2 * r1
            return r2
    }

    public static com.huawei.hms.scankit.p.f a(byte[] r21, int r22, int r23) {
            com.huawei.hms.scankit.p.c4 r0 = new com.huawei.hms.scankit.p.c4
            r1 = r21
            r0.<init>(r1)
            com.huawei.hms.scankit.p.r r0 = r0.a()
            int r1 = r0.e()
            int r1 = r1 * r22
            int r1 = r1 / 100
            r2 = 11
            int r1 = r1 + r2
            int r3 = r0.e()
            int r3 = r3 + r1
            r4 = 32
            r5 = 4
            r6 = 0
            r7 = 1
            if (r23 == 0) goto L77
            if (r23 >= 0) goto L26
            r3 = 1
            goto L27
        L26:
            r3 = 0
        L27:
            int r8 = java.lang.Math.abs(r23)
            if (r3 == 0) goto L2e
            r4 = 4
        L2e:
            if (r8 > r4) goto L61
            int r4 = a(r8, r3)
            int[] r9 = com.huawei.hms.scankit.p.x2.a
            r9 = r9[r8]
            int r10 = r4 % r9
            int r10 = r4 - r10
            com.huawei.hms.scankit.p.r r0 = a(r0, r9)
            int r11 = r0.e()
            int r11 = r11 + r1
            java.lang.String r1 = "Data to large for user specified layer"
            if (r11 > r10) goto L5b
            if (r3 == 0) goto Lc2
            int r10 = r0.e()
            int r11 = r9 * 64
            if (r10 > r11) goto L55
            goto Lc2
        L55:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L5b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L61:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.Integer r2 = java.lang.Integer.valueOf(r23)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r3[r6] = r2
            java.lang.String r2 = "Illegal value %s for layers"
            java.lang.String r1 = java.lang.String.format(r1, r2, r3)
            r0.<init>(r1)
            throw r0
        L77:
            r8 = 0
            r9 = 0
            r10 = 0
        L7a:
            if (r9 > r4) goto L212
            r11 = 3
            if (r9 > r11) goto L81
            r11 = 1
            goto L82
        L81:
            r11 = 0
        L82:
            if (r11 == 0) goto L87
            int r12 = r9 + 1
            goto L88
        L87:
            r12 = r9
        L88:
            int r13 = a(r12, r11)
            if (r3 <= r13) goto L92
        L8e:
            r19 = 1
            goto L209
        L92:
            if (r8 == 0) goto L9a
            int[] r14 = com.huawei.hms.scankit.p.x2.a
            r14 = r14[r12]
            if (r10 == r14) goto La7
        L9a:
            int[] r8 = com.huawei.hms.scankit.p.x2.a
            r8 = r8[r12]
            com.huawei.hms.scankit.p.r r10 = a(r0, r8)
            r20 = r10
            r10 = r8
            r8 = r20
        La7:
            int r14 = r13 % r10
            int r14 = r13 - r14
            if (r11 == 0) goto Lb6
            int r15 = r8.e()
            int r2 = r10 * 64
            if (r15 <= r2) goto Lb6
            goto L8e
        Lb6:
            int r2 = r8.e()
            int r2 = r2 + r1
            if (r2 > r14) goto L8e
            r0 = r8
            r9 = r10
            r3 = r11
            r8 = r12
            r4 = r13
        Lc2:
            com.huawei.hms.scankit.p.r r1 = b(r0, r4, r9)
            int r0 = r0.e()
            int r0 = r0 / r9
            com.huawei.hms.scankit.p.r r2 = a(r3, r8, r0)
            if (r3 == 0) goto Ld4
            r4 = 11
            goto Ld6
        Ld4:
            r4 = 14
        Ld6:
            int r9 = r8 * 4
            int r4 = r4 + r9
            int[] r9 = new int[r4]
            r10 = 2
            if (r3 == 0) goto Le8
            r11 = 0
        Ldf:
            if (r11 >= r4) goto Le6
            r9[r11] = r11
            int r11 = r11 + 1
            goto Ldf
        Le6:
            r11 = r4
            goto L10e
        Le8:
            int r11 = r4 + 1
            int r12 = r4 / 2
            int r13 = r12 + (-1)
            int r13 = r13 / 15
            int r13 = r13 * 2
            int r11 = r11 + r13
            int r13 = r11 / 2
            r14 = 0
        Lf6:
            if (r14 >= r12) goto L10e
            int r15 = r14 / 15
            int r15 = r15 + r14
            int r16 = r12 - r14
            int r16 = r16 + (-1)
            int r17 = r13 - r15
            int r17 = r17 + (-1)
            r9[r16] = r17
            int r16 = r12 + r14
            int r15 = r15 + r13
            int r15 = r15 + r7
            r9[r16] = r15
            int r14 = r14 + 1
            goto Lf6
        L10e:
            com.huawei.hms.scankit.p.s r12 = new com.huawei.hms.scankit.p.s
            r12.<init>(r11)
            r13 = 0
            r14 = 0
        L115:
            if (r13 >= r8) goto L1b9
            int r15 = r8 - r13
            int r15 = r15 * 4
            if (r3 == 0) goto L120
            r16 = 9
            goto L122
        L120:
            r16 = 12
        L122:
            int r15 = r15 + r16
            r5 = 0
        L125:
            if (r5 >= r15) goto L1aa
            int r16 = r5 * 2
        L129:
            if (r6 >= r10) goto L19f
            int r18 = r14 + r16
            r19 = 1
            int r7 = r18 + r6
            boolean r7 = r1.b(r7)
            if (r7 == 0) goto L146
            int r7 = r13 * 2
            int r18 = r7 + r6
            r21 = 2
            r10 = r9[r18]
            int r7 = r7 + r5
            r7 = r9[r7]
            r12.c(r10, r7)
            goto L148
        L146:
            r21 = 2
        L148:
            int r7 = r15 * 2
            int r7 = r7 + r14
            int r7 = r7 + r16
            int r7 = r7 + r6
            boolean r7 = r1.b(r7)
            if (r7 == 0) goto L165
            int r7 = r13 * 2
            int r10 = r7 + r5
            r10 = r9[r10]
            int r18 = r4 + (-1)
            int r18 = r18 - r7
            int r18 = r18 - r6
            r7 = r9[r18]
            r12.c(r10, r7)
        L165:
            int r7 = r15 * 4
            int r7 = r7 + r14
            int r7 = r7 + r16
            int r7 = r7 + r6
            boolean r7 = r1.b(r7)
            if (r7 == 0) goto L180
            int r7 = r4 + (-1)
            int r10 = r13 * 2
            int r7 = r7 - r10
            int r10 = r7 - r6
            r10 = r9[r10]
            int r7 = r7 - r5
            r7 = r9[r7]
            r12.c(r10, r7)
        L180:
            int r7 = r15 * 6
            int r7 = r7 + r14
            int r7 = r7 + r16
            int r7 = r7 + r6
            boolean r7 = r1.b(r7)
            if (r7 == 0) goto L19a
            int r7 = r4 + (-1)
            int r10 = r13 * 2
            int r7 = r7 - r10
            int r7 = r7 - r5
            r7 = r9[r7]
            int r10 = r10 + r6
            r10 = r9[r10]
            r12.c(r7, r10)
        L19a:
            int r6 = r6 + 1
            r7 = 1
            r10 = 2
            goto L129
        L19f:
            r21 = 2
            r19 = 1
            int r5 = r5 + 1
            r6 = 0
            r7 = 1
            r10 = 2
            goto L125
        L1aa:
            r21 = 2
            r19 = 1
            int r15 = r15 * 8
            int r14 = r14 + r15
            int r13 = r13 + 1
            r5 = 4
            r6 = 0
            r7 = 1
            r10 = 2
            goto L115
        L1b9:
            r21 = 2
            r19 = 1
            a(r12, r3, r11, r2)
            if (r3 == 0) goto L1c9
            int r1 = r11 / 2
            r2 = 5
            a(r12, r1, r2)
            goto L1f4
        L1c9:
            int r1 = r11 / 2
            r2 = 7
            a(r12, r1, r2)
            r6 = 0
            r17 = 0
        L1d2:
            int r2 = r4 / 2
            int r2 = r2 + (-1)
            if (r6 >= r2) goto L1f4
            r2 = r1 & 1
        L1da:
            if (r2 >= r11) goto L1ef
            int r5 = r1 - r17
            r12.c(r5, r2)
            int r7 = r1 + r17
            r12.c(r7, r2)
            r12.c(r2, r5)
            r12.c(r2, r7)
            int r2 = r2 + 2
            goto L1da
        L1ef:
            int r6 = r6 + 15
            int r17 = r17 + 16
            goto L1d2
        L1f4:
            com.huawei.hms.scankit.p.f r1 = new com.huawei.hms.scankit.p.f
            r1.<init>()
            r1.a(r3)
            r1.c(r11)
            r1.b(r8)
            r1.a(r0)
            r1.a(r12)
            return r1
        L209:
            int r9 = r9 + 1
            r2 = 11
            r5 = 4
            r6 = 0
            r7 = 1
            goto L7a
        L212:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Data too large for an Aztec code"
            r0.<init>(r1)
            throw r0
    }

    private static com.huawei.hms.scankit.p.o3 a(int r3) {
            r0 = 4
            if (r3 == r0) goto L35
            r0 = 6
            if (r3 == r0) goto L32
            r0 = 8
            if (r3 == r0) goto L2f
            r0 = 10
            if (r3 == r0) goto L2c
            r0 = 12
            if (r3 != r0) goto L15
            com.huawei.hms.scankit.p.o3 r3 = com.huawei.hms.scankit.p.o3.h
            return r3
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported word size "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L2c:
            com.huawei.hms.scankit.p.o3 r3 = com.huawei.hms.scankit.p.o3.i
            return r3
        L2f:
            com.huawei.hms.scankit.p.o3 r3 = com.huawei.hms.scankit.p.o3.n
            return r3
        L32:
            com.huawei.hms.scankit.p.o3 r3 = com.huawei.hms.scankit.p.o3.j
            return r3
        L35:
            com.huawei.hms.scankit.p.o3 r3 = com.huawei.hms.scankit.p.o3.k
            return r3
    }

    static com.huawei.hms.scankit.p.r a(com.huawei.hms.scankit.p.r r9, int r10) {
            com.huawei.hms.scankit.p.r r0 = new com.huawei.hms.scankit.p.r
            r0.<init>()
            int r1 = r9.e()
            r2 = 1
            int r3 = r2 << r10
            int r3 = r3 + (-2)
            r4 = 0
            r5 = 0
        L10:
            if (r5 >= r1) goto L40
            r6 = 0
            r7 = 0
        L14:
            if (r6 >= r10) goto L29
            int r8 = r5 + r6
            if (r8 >= r1) goto L20
            boolean r8 = r9.b(r8)
            if (r8 == 0) goto L26
        L20:
            int r8 = r10 + (-1)
            int r8 = r8 - r6
            int r8 = r2 << r8
            r7 = r7 | r8
        L26:
            int r6 = r6 + 1
            goto L14
        L29:
            r6 = r7 & r3
            if (r6 != r3) goto L33
            r0.a(r6, r10)
        L30:
            int r5 = r5 + (-1)
            goto L3e
        L33:
            if (r6 != 0) goto L3b
            r6 = r7 | 1
            r0.a(r6, r10)
            goto L30
        L3b:
            r0.a(r7, r10)
        L3e:
            int r5 = r5 + r10
            goto L10
        L40:
            return r0
    }

    static com.huawei.hms.scankit.p.r a(boolean r2, int r3, int r4) {
            com.huawei.hms.scankit.p.r r0 = new com.huawei.hms.scankit.p.r
            r0.<init>()
            r1 = 4
            if (r2 == 0) goto L1b
            int r3 = r3 + (-1)
            r2 = 2
            r0.a(r3, r2)
            int r4 = r4 + (-1)
            r2 = 6
            r0.a(r4, r2)
            r2 = 28
            com.huawei.hms.scankit.p.r r2 = b(r0, r2, r1)
            return r2
        L1b:
            int r3 = r3 + (-1)
            r2 = 5
            r0.a(r3, r2)
            int r4 = r4 + (-1)
            r2 = 11
            r0.a(r4, r2)
            r2 = 40
            com.huawei.hms.scankit.p.r r2 = b(r0, r2, r1)
            return r2
    }

    private static void a(com.huawei.hms.scankit.p.s r4, int r5, int r6) {
            r0 = 0
        L1:
            if (r0 >= r6) goto L1c
            int r1 = r5 - r0
            r2 = r1
        L6:
            int r3 = r5 + r0
            if (r2 > r3) goto L19
            r4.c(r2, r1)
            r4.c(r2, r3)
            r4.c(r1, r2)
            r4.c(r3, r2)
            int r2 = r2 + 1
            goto L6
        L19:
            int r0 = r0 + 2
            goto L1
        L1c:
            int r0 = r5 - r6
            r4.c(r0, r0)
            int r1 = r0 + 1
            r4.c(r1, r0)
            r4.c(r0, r1)
            int r5 = r5 + r6
            r4.c(r5, r0)
            r4.c(r5, r1)
            int r6 = r5 + (-1)
            r4.c(r5, r6)
            return
    }

    private static void a(com.huawei.hms.scankit.p.s r2, boolean r3, int r4, com.huawei.hms.scankit.p.r r5) {
            int r4 = r4 / 2
            r0 = 0
            if (r3 == 0) goto L40
        L5:
            r3 = 7
            if (r0 >= r3) goto L7f
            int r3 = r4 + (-3)
            int r3 = r3 + r0
            boolean r1 = r5.b(r0)
            if (r1 == 0) goto L16
            int r1 = r4 + (-5)
            r2.c(r3, r1)
        L16:
            int r1 = r0 + 7
            boolean r1 = r5.b(r1)
            if (r1 == 0) goto L23
            int r1 = r4 + 5
            r2.c(r1, r3)
        L23:
            int r1 = 20 - r0
            boolean r1 = r5.b(r1)
            if (r1 == 0) goto L30
            int r1 = r4 + 5
            r2.c(r3, r1)
        L30:
            int r1 = 27 - r0
            boolean r1 = r5.b(r1)
            if (r1 == 0) goto L3d
            int r1 = r4 + (-5)
            r2.c(r1, r3)
        L3d:
            int r0 = r0 + 1
            goto L5
        L40:
            r3 = 10
            if (r0 >= r3) goto L7f
            int r3 = r4 + (-5)
            int r3 = r3 + r0
            int r1 = r0 / 5
            int r3 = r3 + r1
            boolean r1 = r5.b(r0)
            if (r1 == 0) goto L55
            int r1 = r4 + (-7)
            r2.c(r3, r1)
        L55:
            int r1 = r0 + 10
            boolean r1 = r5.b(r1)
            if (r1 == 0) goto L62
            int r1 = r4 + 7
            r2.c(r1, r3)
        L62:
            int r1 = 29 - r0
            boolean r1 = r5.b(r1)
            if (r1 == 0) goto L6f
            int r1 = r4 + 7
            r2.c(r3, r1)
        L6f:
            int r1 = 39 - r0
            boolean r1 = r5.b(r1)
            if (r1 == 0) goto L7c
            int r1 = r4 + (-7)
            r2.c(r1, r3)
        L7c:
            int r0 = r0 + 1
            goto L40
        L7f:
            return
    }

    private static int[] a(com.huawei.hms.scankit.p.r r7, int r8, int r9) {
            int[] r9 = new int[r9]
            int r0 = r7.e()
            int r0 = r0 / r8
            r1 = 0
            r2 = 0
        L9:
            if (r2 >= r0) goto L29
            r3 = 0
            r4 = 0
        Ld:
            if (r3 >= r8) goto L24
            int r5 = r2 * r8
            int r5 = r5 + r3
            boolean r5 = r7.b(r5)
            if (r5 == 0) goto L1f
            int r5 = r8 - r3
            r6 = 1
            int r5 = r5 - r6
            int r5 = r6 << r5
            goto L20
        L1f:
            r5 = 0
        L20:
            r4 = r4 | r5
            int r3 = r3 + 1
            goto Ld
        L24:
            r9[r2] = r4
            int r2 = r2 + 1
            goto L9
        L29:
            return r9
    }

    private static com.huawei.hms.scankit.p.r b(com.huawei.hms.scankit.p.r r3, int r4, int r5) {
            int r0 = r3.e()
            int r0 = r0 / r5
            com.huawei.hms.scankit.p.q6 r1 = new com.huawei.hms.scankit.p.q6
            com.huawei.hms.scankit.p.o3 r2 = a(r5)
            r1.<init>(r2)
            int r2 = r4 / r5
            int[] r3 = a(r3, r5, r2)
            int r2 = r2 - r0
            r1.a(r3, r2)
            int r4 = r4 % r5
            com.huawei.hms.scankit.p.r r0 = new com.huawei.hms.scankit.p.r
            r0.<init>()
            r1 = 0
            r0.a(r1, r4)
            int r4 = r3.length
        L23:
            if (r1 >= r4) goto L2d
            r2 = r3[r1]
            r0.a(r2, r5)
            int r1 = r1 + 1
            goto L23
        L2d:
            return r0
    }
}
