package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class g2 {
    private final com.huawei.hms.scankit.p.s a;
    private com.huawei.hms.scankit.p.v6 b;

    public g2(com.huawei.hms.scankit.p.s r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private float a(int r18, int r19, int r20, int r21) {
            r17 = this;
            int r0 = r21 - r19
            int r0 = java.lang.Math.abs(r0)
            int r1 = r20 - r18
            int r1 = java.lang.Math.abs(r1)
            r3 = 1
            if (r0 <= r1) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L1d
            r4 = r18
            r1 = r19
            r6 = r20
            r5 = r21
            goto L25
        L1d:
            r1 = r18
            r4 = r19
            r5 = r20
            r6 = r21
        L25:
            int r7 = r5 - r1
            int r7 = java.lang.Math.abs(r7)
            int r8 = r6 - r4
            int r8 = java.lang.Math.abs(r8)
            int r9 = -r7
            r10 = 2
            int r9 = r9 / r10
            r11 = -1
            if (r1 >= r5) goto L39
            r12 = 1
            goto L3a
        L39:
            r12 = -1
        L3a:
            if (r4 >= r6) goto L3d
            r11 = 1
        L3d:
            int r5 = r5 + r12
            r13 = r1
            r14 = r4
            r15 = 0
        L41:
            if (r13 == r5) goto L7d
            if (r0 == 0) goto L47
            r2 = r14
            goto L48
        L47:
            r2 = r13
        L48:
            if (r0 == 0) goto L4c
            r10 = r13
            goto L4d
        L4c:
            r10 = r14
        L4d:
            r16 = r0
            if (r15 != r3) goto L57
            r0 = 1
        L52:
            r3 = r17
            r19 = r7
            goto L59
        L57:
            r0 = 0
            goto L52
        L59:
            com.huawei.hms.scankit.p.s r7 = r3.a
            boolean r2 = r7.b(r2, r10)
            if (r0 != r2) goto L6b
            r0 = 2
            if (r15 != r0) goto L69
            float r0 = com.huawei.hms.scankit.p.s4.a(r13, r14, r1, r4)
            return r0
        L69:
            int r15 = r15 + 1
        L6b:
            int r9 = r9 + r8
            if (r9 <= 0) goto L75
            if (r14 != r6) goto L72
        L70:
            r0 = 2
            goto L80
        L72:
            int r14 = r14 + r11
            int r9 = r9 - r19
        L75:
            int r13 = r13 + r12
            r7 = r19
            r0 = r16
            r3 = 1
            r10 = 2
            goto L41
        L7d:
            r3 = r17
            goto L70
        L80:
            if (r15 != r0) goto L87
            float r0 = com.huawei.hms.scankit.p.s4.a(r5, r6, r1, r4)
            return r0
        L87:
            r0 = 2143289344(0x7fc00000, float:NaN)
            return r0
    }

    private float a(com.huawei.hms.scankit.p.u6 r5, com.huawei.hms.scankit.p.u6 r6) {
            r4 = this;
            float r0 = r5.b()
            int r0 = (int) r0
            float r1 = r5.c()
            int r1 = (int) r1
            float r2 = r6.b()
            int r2 = (int) r2
            float r3 = r6.c()
            int r3 = (int) r3
            float r0 = r4.b(r0, r1, r2, r3)
            float r1 = r6.b()
            int r1 = (int) r1
            float r6 = r6.c()
            int r6 = (int) r6
            float r2 = r5.b()
            int r2 = (int) r2
            float r5 = r5.c()
            int r5 = (int) r5
            float r5 = r4.b(r1, r6, r2, r5)
            boolean r6 = java.lang.Float.isNaN(r0)
            r1 = 1088421888(0x40e00000, float:7.0)
            if (r6 == 0) goto L3a
            float r5 = r5 / r1
            return r5
        L3a:
            boolean r6 = java.lang.Float.isNaN(r5)
            if (r6 == 0) goto L42
            float r0 = r0 / r1
            return r0
        L42:
            float r0 = r0 + r5
            r5 = 1096810496(0x41600000, float:14.0)
            float r0 = r0 / r5
            return r0
    }

    private int a(com.huawei.hms.scankit.p.b8 r20, int r21, com.huawei.hms.scankit.p.e3 r22, com.huawei.hms.scankit.p.e3 r23, com.huawei.hms.scankit.p.e3 r24, float r25, int r26, int r27, com.huawei.hms.scankit.p.d[] r28, com.huawei.hms.scankit.p.d[] r29) {
            r19 = this;
            r0 = r26
            r2 = r27
            r3 = 0
        L5:
            if (r3 >= r0) goto Le7
            r4 = 1
            if (r3 != 0) goto Le
            int r5 = r0 + (-1)
            r6 = 1
            goto L10
        Le:
            r5 = r0
            r6 = 0
        L10:
            int r7 = r0 + (-1)
            if (r3 != r7) goto L15
            goto L16
        L15:
            r4 = r6
        L16:
            int[] r6 = r20.c()
            r6 = r6[r3]
            float r6 = (float) r6
            r7 = 1077936128(0x40400000, float:3.0)
            float r6 = r6 - r7
            float r8 = r22.b()
            float r9 = r23.b()
            float r8 = r8 - r9
            float r6 = r6 * r8
            r8 = r21
            float r9 = (float) r8
            float r6 = r6 / r9
            float r10 = r23.b()
            float r6 = r6 + r10
            int[] r10 = r20.c()
            r10 = r10[r3]
            float r10 = (float) r10
            float r10 = r10 - r7
            float r11 = r22.c()
            float r12 = r23.c()
            float r11 = r11 - r12
            float r10 = r10 * r11
            float r10 = r10 / r9
            float r11 = r23.c()
            float r10 = r10 + r11
        L4d:
            if (r4 >= r5) goto Ld9
            int[] r11 = r20.c()
            r11 = r11[r4]
            float r11 = (float) r11
            float r11 = r11 - r7
            float r12 = r23.c()
            float r13 = r24.c()
            float r12 = r12 - r13
            float r11 = r11 * r12
            float r11 = r11 / r9
            float r11 = r10 - r11
            int r11 = (int) r11
            int[] r12 = r20.c()
            r12 = r12[r4]
            float r12 = (float) r12
            float r12 = r12 - r7
            float r13 = r23.b()
            float r14 = r24.b()
            float r13 = r13 - r14
            float r12 = r12 * r13
            float r12 = r12 / r9
            float r12 = r6 - r12
            int r12 = (int) r12
            r13 = 4
            r14 = 4
        L7f:
            if (r14 > r13) goto Lc7
            int r15 = r3 * r0
            int r15 = r15 + r4
            float r1 = (float) r14
            r7 = r19
            r13 = r25
            com.huawei.hms.scankit.p.d r1 = r7.a(r13, r12, r11, r1)     // Catch: com.huawei.hms.scankit.p.a -> Lb8
            r28[r15] = r1     // Catch: com.huawei.hms.scankit.p.a -> Lb8
            com.huawei.hms.scankit.p.d r1 = new com.huawei.hms.scankit.p.d     // Catch: com.huawei.hms.scankit.p.a -> Lb8
            int[] r16 = r20.c()     // Catch: com.huawei.hms.scankit.p.a -> Lb8
            r0 = r16[r3]     // Catch: com.huawei.hms.scankit.p.a -> Lb8
            float r0 = (float) r0     // Catch: com.huawei.hms.scankit.p.a -> Lb8
            r16 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r16
            int[] r17 = r20.c()     // Catch: com.huawei.hms.scankit.p.a -> Lb8
            r18 = r2
            r2 = r17[r4]     // Catch: com.huawei.hms.scankit.p.a -> Lb5
            float r2 = (float) r2
            float r2 = r2 + r16
            r16 = r3
            float r3 = r24.e()     // Catch: com.huawei.hms.scankit.p.a -> Lbb
            r1.<init>(r0, r2, r3)     // Catch: com.huawei.hms.scankit.p.a -> Lbb
            r29[r15] = r1     // Catch: com.huawei.hms.scankit.p.a -> Lbb
            int r2 = r18 + 1
            goto Lcf
        Lb5:
            r16 = r3
            goto Lbb
        Lb8:
            r18 = r2
            goto Lb5
        Lbb:
            int r14 = r14 << 1
            r0 = r26
            r3 = r16
            r2 = r18
            r7 = 1077936128(0x40400000, float:3.0)
            r13 = 4
            goto L7f
        Lc7:
            r7 = r19
            r13 = r25
            r18 = r2
            r16 = r3
        Lcf:
            int r4 = r4 + 1
            r0 = r26
            r3 = r16
            r7 = 1077936128(0x40400000, float:3.0)
            goto L4d
        Ld9:
            r7 = r19
            r13 = r25
            r18 = r2
            r16 = r3
            int r3 = r16 + 1
            r0 = r26
            goto L5
        Le7:
            r7 = r19
            return r2
    }

    private int a(com.huawei.hms.scankit.p.e3 r21, com.huawei.hms.scankit.p.e3 r22, com.huawei.hms.scankit.p.e3 r23, float r24, int r25, com.huawei.hms.scankit.p.b8 r26, com.huawei.hms.scankit.p.d[] r27, com.huawei.hms.scankit.p.d[] r28, int r29, int r30, com.huawei.hms.scankit.p.d[] r31) {
            r20 = this;
            r0 = r20
            r6 = r24
            r7 = r29
            r2 = r30
            float r1 = r22.b()
            float r3 = r21.b()
            float r1 = r1 - r3
            float r3 = r23.b()
            float r1 = r1 + r3
            float r3 = r22.c()
            float r4 = r21.c()
            float r3 = r3 - r4
            float r4 = r23.c()
            float r3 = r3 + r4
            float r4 = (float) r2
            r5 = 1077936128(0x40400000, float:3.0)
            float r8 = r5 / r4
            r9 = 1065353216(0x3f800000, float:1.0)
            float r9 = r9 - r8
            float r10 = r21.b()
            float r11 = r21.b()
            float r1 = r1 - r11
            float r1 = r1 * r9
            float r10 = r10 + r1
            int r1 = (int) r10
            float r10 = r21.c()
            float r11 = r21.c()
            float r3 = r3 - r11
            float r9 = r9 * r3
            float r10 = r10 + r9
            int r3 = (int) r10
            boolean[] r9 = com.huawei.hms.scankit.p.r3.v
            r10 = 0
            boolean r9 = r9[r10]
            r11 = 2
            if (r9 == 0) goto L58
            r9 = 22
            if (r2 != r9) goto L58
            r9 = 8
            r9 = 2
            r12 = 8
            goto L5b
        L58:
            r9 = 4
            r12 = 16
        L5b:
            r13 = r9
        L5c:
            if (r13 > r12) goto L69
            float r14 = (float) r13
            com.huawei.hms.scankit.p.d r14 = r0.a(r6, r1, r3, r14)     // Catch: com.huawei.hms.scankit.p.a -> L66
            r31[r10] = r14     // Catch: com.huawei.hms.scankit.p.a -> L66
            goto L69
        L66:
            int r13 = r13 << 1
            goto L5c
        L69:
            com.huawei.hms.scankit.p.d r13 = new com.huawei.hms.scankit.p.d
            r14 = r25
            float r14 = (float) r14
            r15 = 1087373312(0x40d00000, float:6.5)
            float r14 = r14 - r15
            float r15 = r23.e()
            r13.<init>(r14, r14, r15)
            r15 = 1
            r31[r15] = r13
            r13 = r31[r10]
            r16 = 0
            r17 = 1082130432(0x40800000, float:4.0)
            if (r13 == 0) goto L9e
            float r1 = (float) r1
            float r3 = (float) r3
            float r13 = r13.b()
            r18 = r31[r10]
            r19 = 1077936128(0x40400000, float:3.0)
            float r5 = r18.c()
            float r1 = com.huawei.hms.scankit.p.s4.a(r1, r3, r13, r5)
            float r3 = r6 * r17
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto La0
            r31[r10] = r16
            goto La0
        L9e:
            r19 = 1077936128(0x40400000, float:3.0)
        La0:
            r1 = r31[r10]
            if (r1 != 0) goto L112
            if (r7 <= r11) goto L112
            com.huawei.hms.scankit.p.d r1 = new com.huawei.hms.scankit.p.d
            int[] r3 = r26.c()
            int r5 = r7 + (-2)
            r3 = r3[r5]
            float r3 = (float) r3
            r11 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r11
            float r11 = r23.e()
            r1.<init>(r3, r14, r11)
            r31[r15] = r1
            float r1 = r23.c()
            float r3 = r23.c()
            float r11 = r21.c()
            float r3 = r3 - r11
            float r8 = r8 * r3
            float r1 = r1 - r8
            int r1 = (int) r1
            int[] r3 = r26.c()
            r3 = r3[r5]
            float r3 = (float) r3
            float r3 = r3 - r19
            float r3 = r3 / r4
            float r4 = r22.b()
            float r5 = r21.b()
            float r4 = r4 - r5
            float r3 = r3 * r4
            float r4 = r23.b()
            float r3 = r3 + r4
            int r3 = (int) r3
        Le9:
            if (r9 > r12) goto Lf6
            float r4 = (float) r9
            com.huawei.hms.scankit.p.d r4 = r0.a(r6, r3, r1, r4)     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            r31[r10] = r4     // Catch: com.huawei.hms.scankit.p.a -> Lf3
            goto Lf6
        Lf3:
            int r9 = r9 << 1
            goto Le9
        Lf6:
            r4 = r31[r10]
            if (r4 == 0) goto L112
            float r3 = (float) r3
            float r1 = (float) r1
            float r4 = r4.b()
            r5 = r31[r10]
            float r5 = r5.c()
            float r1 = com.huawei.hms.scankit.p.s4.a(r3, r1, r4, r5)
            float r3 = r6 * r17
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L112
            r31[r10] = r16
        L112:
            boolean r1 = com.huawei.hms.scankit.p.r3.p
            r8 = 0
            if (r1 == 0) goto L12b
            boolean r1 = com.huawei.hms.scankit.p.r3.m
            if (r1 == 0) goto L12b
            r4 = r21
            r3 = r22
            r5 = r23
            r1 = r26
            r9 = r27
            r10 = r28
            int r8 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L12b:
            return r8
    }

    private static int a(com.huawei.hms.scankit.p.u6 r4, com.huawei.hms.scankit.p.u6 r5, com.huawei.hms.scankit.p.u6 r6, float r7) throws com.huawei.hms.scankit.p.a {
            r0 = 3
            r1 = 2
            float r2 = com.huawei.hms.scankit.p.u6.a(r4, r5)     // Catch: com.huawei.hms.scankit.p.a -> L26
            float r2 = r2 / r7
            int r2 = com.huawei.hms.scankit.p.s4.a(r2)     // Catch: com.huawei.hms.scankit.p.a -> L26
            float r3 = com.huawei.hms.scankit.p.u6.a(r4, r6)     // Catch: com.huawei.hms.scankit.p.a -> L26
            float r3 = r3 / r7
            int r3 = com.huawei.hms.scankit.p.s4.a(r3)     // Catch: com.huawei.hms.scankit.p.a -> L26
            int r2 = r2 + r3
            int r2 = r2 / r1
            int r2 = r2 + 7
            r3 = r2 & 3
            if (r3 == 0) goto L46
            if (r3 == r1) goto L43
            if (r3 == r0) goto L21
            return r2
        L21:
            com.huawei.hms.scankit.p.a r2 = com.huawei.hms.scankit.p.a.a()     // Catch: com.huawei.hms.scankit.p.a -> L26
            throw r2     // Catch: com.huawei.hms.scankit.p.a -> L26
        L26:
            float r5 = com.huawei.hms.scankit.p.u6.a(r4, r5)
            float r5 = r5 / r7
            int r5 = (int) r5
            float r4 = com.huawei.hms.scankit.p.u6.a(r4, r6)
            float r4 = r4 / r7
            int r4 = (int) r4
            int r5 = r5 + r4
            int r5 = r5 / r1
            int r2 = r5 + 7
            r4 = r2 & 3
            if (r4 == 0) goto L46
            if (r4 == r1) goto L43
            if (r4 == r0) goto L40
            goto L48
        L40:
            int r2 = r5 + 9
            goto L48
        L43:
            int r2 = r2 + (-1)
            goto L48
        L46:
            int r2 = r2 + 1
        L48:
            return r2
    }

    private static com.huawei.hms.scankit.p.d6 a(com.huawei.hms.scankit.p.u6 r18, com.huawei.hms.scankit.p.u6 r19, com.huawei.hms.scankit.p.u6 r20, com.huawei.hms.scankit.p.u6 r21, com.huawei.hms.scankit.p.u6 r22, int r23) {
            r0 = r23
            float r0 = (float) r0
            r1 = 1080033280(0x40600000, float:3.5)
            float r4 = r0 - r1
            if (r21 == 0) goto L1e
            float r0 = r21.b()
            float r1 = r21.c()
            float r2 = r22.b()
            float r3 = r22.c()
            r6 = r2
            r7 = r3
        L1b:
            r14 = r0
            r15 = r1
            goto L3d
        L1e:
            float r0 = r19.b()
            float r1 = r18.b()
            float r0 = r0 - r1
            float r1 = r20.b()
            float r0 = r0 + r1
            float r1 = r19.c()
            float r2 = r18.c()
            float r1 = r1 - r2
            float r2 = r20.c()
            float r1 = r1 + r2
            r6 = r4
            r7 = r6
            goto L1b
        L3d:
            float r10 = r18.b()
            float r11 = r18.c()
            float r12 = r19.b()
            float r13 = r19.c()
            float r16 = r20.b()
            float r17 = r20.c()
            r5 = 1080033280(0x40600000, float:3.5)
            r8 = 1080033280(0x40600000, float:3.5)
            r2 = 1080033280(0x40600000, float:3.5)
            r3 = 1080033280(0x40600000, float:3.5)
            r9 = r4
            com.huawei.hms.scankit.p.d6 r0 = com.huawei.hms.scankit.p.d6.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
    }

    private com.huawei.hms.scankit.p.j2 a(com.huawei.hms.scankit.p.e3 r18, com.huawei.hms.scankit.p.e3 r19, com.huawei.hms.scankit.p.e3 r20, float r21) throws com.huawei.hms.scankit.p.a {
            r17 = this;
            int r5 = a(r18, r19, r20, r21)
            java.util.Stack<java.lang.Integer> r0 = com.huawei.hms.scankit.p.r3.w
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0.push(r1)
            com.huawei.hms.scankit.p.b8 r6 = com.huawei.hms.scankit.p.b8.b(r5)
            boolean r0 = com.huawei.hms.scankit.p.r3.s
            if (r0 == 0) goto L28
            boolean r0 = com.huawei.hms.scankit.p.r3.c
            if (r0 == 0) goto L28
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            com.huawei.hms.scankit.p.j2 r1 = r0.a(r1, r2, r3, r4, r5)
            return r1
        L28:
            int r0 = r6.d()
            r12 = 7
            int r10 = r0 + (-7)
            int[] r0 = r6.c()
            int r2 = r0.length
            int r0 = r2 * r2
            com.huawei.hms.scankit.p.d[] r7 = new com.huawei.hms.scankit.p.d[r0]
            com.huawei.hms.scankit.p.d[] r8 = new com.huawei.hms.scankit.p.d[r0]
            r13 = 2
            com.huawei.hms.scankit.p.d[] r11 = new com.huawei.hms.scankit.p.d[r13]
            int[] r0 = r6.c()
            int r0 = r0.length
            r14 = 0
            if (r0 <= 0) goto L55
            r0 = r17
            r1 = r18
            r3 = r20
            r4 = r21
            r9 = r2
            r2 = r19
            int r6 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L57
        L55:
            r9 = r2
            r6 = 0
        L57:
            r3 = r11[r14]
            r10 = 1
            r4 = r11[r10]
            r0 = r18
            r1 = r19
            r2 = r20
            com.huawei.hms.scankit.p.d6 r4 = a(r0, r1, r2, r3, r4, r5)
            r11 = r3
            boolean r0 = com.huawei.hms.scankit.p.r3.p
            if (r0 == 0) goto L81
            boolean r0 = com.huawei.hms.scankit.p.r3.m
            if (r0 == 0) goto L81
            r0 = r17
            r1 = r4
            r3 = r5
            r2 = r9
            r4 = r18
            r5 = r19
            r9 = r8
            r8 = r6
            r6 = r20
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r5 = r3
            goto L84
        L81:
            r0 = r17
            r1 = r4
        L84:
            com.huawei.hms.scankit.p.s r2 = r0.a
            com.huawei.hms.scankit.p.s r2 = a(r2, r1, r5)
            r3 = 4
            r4 = 3
            if (r11 != 0) goto L97
            com.huawei.hms.scankit.p.u6[] r6 = new com.huawei.hms.scankit.p.u6[r4]
            r6[r14] = r20
            r6[r10] = r18
            r6[r13] = r19
            goto La1
        L97:
            com.huawei.hms.scankit.p.u6[] r6 = new com.huawei.hms.scankit.p.u6[r3]
            r6[r14] = r20
            r6[r10] = r18
            r6[r13] = r19
            r6[r4] = r11
        La1:
            float r5 = (float) r5
            r7 = 8
            float[] r7 = new float[r7]
            r8 = 0
            r7[r14] = r8
            r7[r10] = r8
            r7[r13] = r5
            r7[r4] = r8
            r7[r3] = r5
            r9 = 5
            r7[r9] = r5
            r11 = 6
            r7[r11] = r8
            r7[r12] = r5
            r1.a(r7)
            com.huawei.hms.scankit.p.u6 r1 = new com.huawei.hms.scankit.p.u6
            r5 = r7[r14]
            r8 = r7[r10]
            boolean r15 = r18.d()
            r1.<init>(r5, r8, r15)
            com.huawei.hms.scankit.p.u6 r5 = new com.huawei.hms.scankit.p.u6
            r8 = r7[r13]
            r15 = r7[r4]
            r16 = 3
            boolean r4 = r19.d()
            r5.<init>(r8, r15, r4)
            com.huawei.hms.scankit.p.u6 r4 = new com.huawei.hms.scankit.p.u6
            r8 = r7[r3]
            r9 = r7[r9]
            boolean r15 = r20.d()
            r4.<init>(r8, r9, r15)
            com.huawei.hms.scankit.p.u6 r8 = new com.huawei.hms.scankit.p.u6
            r9 = r7[r11]
            r7 = r7[r12]
            r8.<init>(r9, r7)
            com.huawei.hms.scankit.p.u6 r7 = r0.a(r8)
            com.huawei.hms.scankit.p.u6 r1 = r0.a(r1)
            com.huawei.hms.scankit.p.u6 r5 = r0.a(r5)
            com.huawei.hms.scankit.p.u6 r4 = r0.a(r4)
            com.huawei.hms.scankit.p.u6[] r3 = new com.huawei.hms.scankit.p.u6[r3]
            r3[r14] = r7
            r3[r10] = r1
            r3[r13] = r5
            r3[r16] = r4
            com.huawei.hms.scankit.p.j2 r1 = new com.huawei.hms.scankit.p.j2
            r4 = r21
            r1.<init>(r2, r6, r3, r4)
            return r1
    }

    private com.huawei.hms.scankit.p.j2 a(com.huawei.hms.scankit.p.e3 r17, com.huawei.hms.scankit.p.e3 r18, com.huawei.hms.scankit.p.e3 r19, float r20, int r21) {
            r16 = this;
            r0 = r16
            r6 = r21
            com.huawei.hms.scankit.p.s r7 = new com.huawei.hms.scankit.p.s
            r7.<init>(r6, r6)
            com.huawei.hms.scankit.p.s r1 = r0.a
            int r1 = r1.c()
            float r1 = (float) r1
            float r8 = (float) r6
            float r1 = r1 / r8
            r9 = 0
            r2 = 0
        L14:
            if (r2 >= r6) goto L55
            r3 = 0
        L17:
            if (r3 >= r6) goto L52
            float r4 = (float) r3
            float r4 = r4 * r1
            double r4 = (double) r4
            double r10 = (double) r1
            r12 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r10 = r10 * r12
            double r4 = r4 + r10
            int r4 = (int) r4
            float r5 = (float) r2
            float r5 = r5 * r1
            double r12 = (double) r5
            double r12 = r12 + r10
            int r5 = (int) r12
            r10 = -1
            if (r4 < r10) goto L4c
            com.huawei.hms.scankit.p.s r11 = r0.a
            int r11 = r11.e()
            if (r4 > r11) goto L4c
            if (r5 < r10) goto L4c
            com.huawei.hms.scankit.p.s r10 = r0.a
            int r10 = r10.c()
            if (r5 <= r10) goto L40
            goto L4c
        L40:
            com.huawei.hms.scankit.p.s r10 = r0.a
            boolean r4 = r10.b(r4, r5)
            if (r4 == 0) goto L4f
            r7.c(r3, r2)
            goto L4f
        L4c:
            r7.c(r3, r2)
        L4f:
            int r3 = r3 + 1
            goto L17
        L52:
            int r2 = r2 + 1
            goto L14
        L55:
            r4 = 0
            r5 = 0
            r1 = r17
            r2 = r18
            r3 = r19
            com.huawei.hms.scankit.p.d6 r4 = a(r1, r2, r3, r4, r5, r6)
            r1 = 3
            com.huawei.hms.scankit.p.u6[] r2 = new com.huawei.hms.scankit.p.u6[r1]
            r2[r9] = r19
            r3 = 1
            r2[r3] = r17
            r5 = 2
            r2[r5] = r18
            r6 = 8
            float[] r6 = new float[r6]
            r10 = 0
            r6[r9] = r10
            r6[r3] = r10
            r6[r5] = r8
            r6[r1] = r10
            r11 = 4
            r6[r11] = r8
            r12 = 5
            r6[r12] = r8
            r13 = 6
            r6[r13] = r10
            r10 = 7
            r6[r10] = r8
            r4.a(r6)
            com.huawei.hms.scankit.p.u6 r4 = new com.huawei.hms.scankit.p.u6
            r8 = r6[r9]
            r14 = r6[r3]
            r4.<init>(r8, r14)
            com.huawei.hms.scankit.p.u6 r8 = new com.huawei.hms.scankit.p.u6
            r14 = r6[r5]
            r15 = r6[r1]
            r8.<init>(r14, r15)
            com.huawei.hms.scankit.p.u6 r14 = new com.huawei.hms.scankit.p.u6
            r15 = r6[r11]
            r12 = r6[r12]
            r14.<init>(r15, r12)
            com.huawei.hms.scankit.p.u6 r12 = new com.huawei.hms.scankit.p.u6
            r13 = r6[r13]
            r6 = r6[r10]
            r12.<init>(r13, r6)
            com.huawei.hms.scankit.p.u6 r6 = r0.a(r12)
            com.huawei.hms.scankit.p.u6 r4 = r0.a(r4)
            com.huawei.hms.scankit.p.u6 r8 = r0.a(r8)
            com.huawei.hms.scankit.p.u6 r10 = r0.a(r14)
            com.huawei.hms.scankit.p.u6[] r11 = new com.huawei.hms.scankit.p.u6[r11]
            r11[r9] = r6
            r11[r3] = r4
            r11[r5] = r8
            r11[r1] = r10
            com.huawei.hms.scankit.p.j2 r1 = new com.huawei.hms.scankit.p.j2
            r3 = r20
            r1.<init>(r7, r2, r11, r3)
            return r1
    }

    private static com.huawei.hms.scankit.p.s a(com.huawei.hms.scankit.p.s r6, com.huawei.hms.scankit.p.d6 r7, int r8) throws com.huawei.hms.scankit.p.a {
            com.huawei.hms.scankit.p.s3 r0 = com.huawei.hms.scankit.p.s3.a()
            r5 = 1
            r3 = r8
            r1 = r6
            r4 = r7
            r2 = r8
            com.huawei.hms.scankit.p.s r6 = r0.a(r1, r2, r3, r4, r5)
            return r6
    }

    private com.huawei.hms.scankit.p.u6 a(com.huawei.hms.scankit.p.u6 r7) {
            r6 = this;
            float r0 = r7.b()
            float r1 = r7.c()
            com.huawei.hms.scankit.p.s r2 = r6.a
            int r2 = r2.e()
            int r2 = r2 + (-1)
            com.huawei.hms.scankit.p.s r3 = r6.a
            int r3 = r3.c()
            int r3 = r3 + (-1)
            r4 = 0
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 >= 0) goto L1e
            r0 = 0
        L1e:
            float r2 = (float) r2
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L24
            r0 = r2
        L24:
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 >= 0) goto L29
            r1 = 0
        L29:
            float r2 = (float) r3
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 <= 0) goto L2f
            r1 = r2
        L2f:
            com.huawei.hms.scankit.p.u6 r2 = new com.huawei.hms.scankit.p.u6
            boolean r7 = r7.d()
            r2.<init>(r0, r1, r7)
            return r2
    }

    private void a(com.huawei.hms.scankit.p.d6 r26, int r27, int r28, com.huawei.hms.scankit.p.e3 r29, com.huawei.hms.scankit.p.e3 r30, com.huawei.hms.scankit.p.e3 r31, com.huawei.hms.scankit.p.d[] r32, int r33, com.huawei.hms.scankit.p.d[] r34) {
            r25 = this;
            r0 = 3
            int r1 = r33 + 3
            int r2 = r1 * 2
            float[] r3 = new float[r2]
            float[] r2 = new float[r2]
            float r4 = r29.b()
            r5 = 0
            r3[r5] = r4
            float r4 = r29.c()
            r6 = 1
            r3[r6] = r4
            float r4 = r30.b()
            r7 = 2
            r3[r7] = r4
            float r4 = r30.c()
            r3[r0] = r4
            float r4 = r31.b()
            r8 = 4
            r3[r8] = r4
            float r4 = r31.c()
            r9 = 5
            r3[r9] = r4
            r4 = 1080033280(0x40600000, float:3.5)
            r2[r5] = r4
            r2[r6] = r4
            r10 = r28
            float r10 = (float) r10
            float r10 = r10 - r4
            r2[r7] = r10
            r2[r0] = r4
            r2[r8] = r4
            r2[r9] = r10
            r4 = 6
            r10 = 0
            r11 = 6
            r12 = 6
        L48:
            int r13 = r27 * r27
            if (r10 >= r13) goto L79
            r13 = r32[r10]
            if (r13 == 0) goto L76
            int r14 = r12 + 1
            float r13 = r13.b()
            r3[r12] = r13
            int r12 = r12 + 2
            r13 = r32[r10]
            float r13 = r13.c()
            r3[r14] = r13
            int r13 = r11 + 1
            r14 = r34[r10]
            float r14 = r14.b()
            r2[r11] = r14
            int r11 = r11 + 2
            r14 = r34[r10]
            float r14 = r14.c()
            r2[r13] = r14
        L76:
            int r10 = r10 + 1
            goto L48
        L79:
            float[] r1 = com.huawei.hms.scankit.util.LoadOpencvJNIUtil.QuadFitting(r2, r1, r3)
            int r2 = r1.length
            if (r2 == 0) goto Lae
            r11 = r1[r5]
            r12 = r1[r6]
            r13 = r1[r7]
            r14 = r1[r0]
            r15 = r1[r8]
            r16 = r1[r9]
            r17 = r1[r4]
            r0 = 7
            r18 = r1[r0]
            r0 = 8
            r19 = r1[r0]
            r0 = 9
            r20 = r1[r0]
            r0 = 10
            r21 = r1[r0]
            r0 = 11
            r22 = r1[r0]
            r0 = 12
            r23 = r1[r0]
            r0 = 13
            r24 = r1[r0]
            r10 = r26
            r10.a(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        Lae:
            return
    }

    private float b(int r9, int r10, int r11, int r12) {
            r8 = this;
            float r0 = r8.a(r9, r10, r11, r12)
            int r11 = r11 - r9
            int r11 = r9 - r11
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r9 != r11) goto Lc
            return r1
        Lc:
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r11 >= 0) goto L18
            float r4 = (float) r9
            int r11 = r9 - r11
            float r11 = (float) r11
            float r4 = r4 / r11
            r11 = 0
            goto L38
        L18:
            com.huawei.hms.scankit.p.s r4 = r8.a
            int r4 = r4.e()
            if (r11 < r4) goto L36
            com.huawei.hms.scankit.p.s r4 = r8.a
            int r4 = r4.e()
            int r4 = r4 + (-1)
            int r4 = r4 - r9
            float r4 = (float) r4
            int r11 = r11 - r9
            float r11 = (float) r11
            float r4 = r4 / r11
            com.huawei.hms.scankit.p.s r11 = r8.a
            int r11 = r11.e()
            int r11 = r11 + (-1)
            goto L38
        L36:
            r4 = 1065353216(0x3f800000, float:1.0)
        L38:
            float r5 = (float) r10
            int r12 = r12 - r10
            float r12 = (float) r12
            float r12 = r12 * r4
            float r12 = r5 - r12
            int r12 = (int) r12
            if (r10 != r12) goto L43
            return r1
        L43:
            if (r12 >= 0) goto L4a
            int r12 = r10 - r12
            float r12 = (float) r12
            float r5 = r5 / r12
            goto L6c
        L4a:
            com.huawei.hms.scankit.p.s r2 = r8.a
            int r2 = r2.c()
            if (r12 < r2) goto L69
            com.huawei.hms.scankit.p.s r2 = r8.a
            int r2 = r2.c()
            int r2 = r2 + (-1)
            int r2 = r2 - r10
            float r2 = (float) r2
            int r12 = r12 - r10
            float r12 = (float) r12
            float r5 = r2 / r12
            com.huawei.hms.scankit.p.s r12 = r8.a
            int r12 = r12.c()
            int r2 = r12 + (-1)
            goto L6c
        L69:
            r2 = r12
            r5 = 1065353216(0x3f800000, float:1.0)
        L6c:
            float r12 = (float) r9
            int r11 = r11 - r9
            float r11 = (float) r11
            float r11 = r11 * r5
            float r12 = r12 + r11
            int r11 = (int) r12
            float r9 = r8.a(r9, r10, r11, r2)
            float r10 = java.lang.Math.max(r0, r9)
            double r10 = (double) r10
            float r12 = java.lang.Math.min(r0, r9)
            double r4 = (double) r12
            r6 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r4 = r4 * r6
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 <= 0) goto L8a
            return r1
        L8a:
            float r0 = r0 + r9
            float r0 = r0 - r3
            return r0
    }

    protected final float a(com.huawei.hms.scankit.p.u6 r1, com.huawei.hms.scankit.p.u6 r2, com.huawei.hms.scankit.p.u6 r3) {
            r0 = this;
            float r2 = r0.a(r1, r2)
            float r1 = r0.a(r1, r3)
            float r2 = r2 + r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r1
            return r2
    }

    protected final com.huawei.hms.scankit.p.d a(float r11, int r12, int r13, float r14) throws com.huawei.hms.scankit.p.a {
            r10 = this;
            float r14 = r14 * r11
            int r14 = (int) r14
            int r0 = r12 - r14
            r1 = 0
            int r4 = java.lang.Math.max(r1, r0)
            com.huawei.hms.scankit.p.s r0 = r10.a
            int r0 = r0.e()
            int r0 = r0 + (-1)
            int r12 = r12 + r14
            int r12 = java.lang.Math.min(r0, r12)
            int r6 = r12 - r4
            float r12 = (float) r6
            r0 = 1077936128(0x40400000, float:3.0)
            float r0 = r0 * r11
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 < 0) goto L50
            int r12 = r13 - r14
            int r5 = java.lang.Math.max(r1, r12)
            com.huawei.hms.scankit.p.s r12 = r10.a
            int r12 = r12.c()
            int r12 = r12 + (-1)
            int r13 = r13 + r14
            int r12 = java.lang.Math.min(r12, r13)
            int r7 = r12 - r5
            float r12 = (float) r7
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 < 0) goto L4b
            com.huawei.hms.scankit.p.e r2 = new com.huawei.hms.scankit.p.e
            com.huawei.hms.scankit.p.s r3 = r10.a
            com.huawei.hms.scankit.p.v6 r9 = r10.b
            r8 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            com.huawei.hms.scankit.p.d r11 = r2.a()
            return r11
        L4b:
            com.huawei.hms.scankit.p.a r11 = com.huawei.hms.scankit.p.a.a()
            throw r11
        L50:
            com.huawei.hms.scankit.p.a r11 = com.huawei.hms.scankit.p.a.a()
            throw r11
    }

    protected final com.huawei.hms.scankit.p.j2 a(com.huawei.hms.scankit.p.k3 r6) throws com.huawei.hms.scankit.p.a {
            r5 = this;
            com.huawei.hms.scankit.p.e3 r0 = r6.b()
            com.huawei.hms.scankit.p.e3 r1 = r6.c()
            com.huawei.hms.scankit.p.e3 r6 = r6.a()
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r5.a(r0, r1, r6)     // Catch: com.huawei.hms.scankit.p.a -> L1b
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 < 0) goto L1d
            com.huawei.hms.scankit.p.j2 r6 = r5.a(r0, r1, r6, r3)     // Catch: com.huawei.hms.scankit.p.a -> L1b
            return r6
        L1b:
            goto L22
        L1d:
            com.huawei.hms.scankit.p.a r3 = com.huawei.hms.scankit.p.a.a()     // Catch: com.huawei.hms.scankit.p.a -> L1b
            throw r3     // Catch: com.huawei.hms.scankit.p.a -> L1b
        L22:
            float r3 = r0.e()
            float r4 = r1.e()
            float r3 = r3 + r4
            float r4 = r6.e()
            float r3 = r3 + r4
            r4 = 1077936128(0x40400000, float:3.0)
            float r3 = r3 / r4
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 < 0) goto L3c
            com.huawei.hms.scankit.p.j2 r6 = r5.a(r0, r1, r6, r3)
            return r6
        L3c:
            com.huawei.hms.scankit.p.a r6 = com.huawei.hms.scankit.p.a.a()
            throw r6
    }

    public final com.huawei.hms.scankit.p.j2 a(java.util.Map<com.huawei.hms.scankit.p.l1, ?> r3) throws com.huawei.hms.scankit.p.a {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            goto Lc
        L4:
            com.huawei.hms.scankit.p.l1 r0 = com.huawei.hms.scankit.p.l1.j
            java.lang.Object r3 = r3.get(r0)
            com.huawei.hms.scankit.p.v6 r3 = (com.huawei.hms.scankit.p.v6) r3
        Lc:
            r2.b = r3
            com.huawei.hms.scankit.p.i3 r3 = new com.huawei.hms.scankit.p.i3
            com.huawei.hms.scankit.p.s r0 = r2.a
            com.huawei.hms.scankit.p.v6 r1 = r2.b
            r3.<init>(r0, r1)
            com.huawei.hms.scankit.p.k3 r3 = r3.b()
            com.huawei.hms.scankit.p.j2 r3 = r2.a(r3)
            return r3
    }
}
