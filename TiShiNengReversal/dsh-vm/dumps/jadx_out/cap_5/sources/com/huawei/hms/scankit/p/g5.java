package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class g5 implements com.huawei.hms.scankit.p.o6 {
    public g5() {
            r0 = this;
            r0.<init>()
            return
    }

    protected static float a(int[] r9, int[] r10, float r11) {
            int r0 = r9.length
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
        L5:
            if (r2 >= r0) goto L10
            r5 = r9[r2]
            int r3 = r3 + r5
            r5 = r10[r2]
            int r4 = r4 + r5
            int r2 = r2 + 1
            goto L5
        L10:
            r2 = 2139095040(0x7f800000, float:Infinity)
            if (r3 >= r4) goto L15
            return r2
        L15:
            float r3 = (float) r3
            float r4 = (float) r4
            float r4 = r3 / r4
            float r11 = r11 * r4
            r5 = 0
        L1c:
            if (r1 >= r0) goto L37
            r6 = r9[r1]
            r7 = r10[r1]
            float r7 = (float) r7
            float r7 = r7 * r4
            float r6 = (float) r6
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 <= 0) goto L2c
            float r6 = r6 - r7
            goto L2e
        L2c:
            float r6 = r7 - r6
        L2e:
            int r7 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r7 <= 0) goto L33
            return r2
        L33:
            float r5 = r5 + r6
            int r1 = r1 + 1
            goto L1c
        L37:
            float r5 = r5 / r3
            return r5
    }

    private com.huawei.hms.scankit.p.s6 a(com.huawei.hms.scankit.p.p r10, com.huawei.hms.scankit.p.r r11, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r12, int r13, int r14) throws com.huawei.hms.scankit.p.a {
            r9 = this;
            r0 = 0
        L1:
            r1 = 3
            if (r0 >= r1) goto L58
            r2 = 1
            if (r0 != 0) goto Ld
            com.huawei.hms.scankit.p.r r11 = r10.a(r13, r11)     // Catch: com.huawei.hms.scankit.p.a -> L21
        Lb:
            r4 = r11
            goto L2a
        Ld:
            if (r0 != r2) goto L1a
            com.huawei.hms.scankit.p.s r1 = r10.b()
            com.huawei.hms.scankit.p.r r11 = r1.a(r13, r11)
            r4 = r11
            r1 = 1
            goto L2a
        L1a:
            r3 = 2
            if (r0 != r3) goto Lb
            boolean r3 = com.huawei.hms.scankit.p.r3.t
            if (r3 != 0) goto L25
        L21:
            r6 = r12
            r7 = r13
            r8 = r14
            goto L52
        L25:
            com.huawei.hms.scankit.p.r r11 = r10.a(r13, r2)
            goto Lb
        L2a:
            int[] r11 = r4.d()
            boolean r11 = a(r11)
            if (r11 != 0) goto L38
            r6 = r12
            r7 = r13
            r8 = r14
            goto L51
        L38:
            boolean r11 = com.huawei.hms.scankit.p.r3.c
            if (r11 != 0) goto L42
            r5 = 1
        L3d:
            r3 = r9
            r6 = r12
            r7 = r13
            r8 = r14
            goto L44
        L42:
            r5 = r1
            goto L3d
        L44:
            com.huawei.hms.scankit.p.s6 r11 = r3.a(r4, r5, r6, r7, r8)
            if (r11 == 0) goto L51
            java.lang.String r12 = r11.k()
            if (r12 == 0) goto L51
            return r11
        L51:
            r11 = r4
        L52:
            int r0 = r0 + 1
            r12 = r6
            r13 = r7
            r14 = r8
            goto L1
        L58:
            r10 = 0
            return r10
    }

    private com.huawei.hms.scankit.p.s6 a(com.huawei.hms.scankit.p.r r20, int r21, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r22, int r23, int r24) {
            r19 = this;
            r0 = r24
            r1 = 0
            r3 = r21
            r2 = r22
            r4 = 0
        L8:
            if (r4 >= r3) goto Lb0
            if (r4 != 0) goto Lf
            r20.c()
        Lf:
            r5 = 1
            if (r4 != r5) goto L15
            r20.i()
        L15:
            r6 = 2
            if (r4 != r6) goto L1e
            r20.g()
            r20.j()
        L1e:
            r7 = 0
        L1f:
            if (r7 >= r6) goto La3
            if (r7 != r5) goto L45
            r20.h()
            if (r2 == 0) goto L45
            com.huawei.hms.scankit.p.l1 r8 = com.huawei.hms.scankit.p.l1.j
            boolean r9 = r2.containsKey(r8)
            if (r9 == 0) goto L45
            java.util.EnumMap r9 = new java.util.EnumMap
            java.lang.Class<com.huawei.hms.scankit.p.l1> r10 = com.huawei.hms.scankit.p.l1.class
            r9.<init>(r10)
            r9.putAll(r2)
            r9.remove(r8)
            r2 = r9
            r8 = r19
            r10 = r23
            r9 = r20
            goto L4b
        L45:
            r8 = r19
            r9 = r20
            r10 = r23
        L4b:
            com.huawei.hms.scankit.p.s6 r11 = r8.a(r10, r9, r2)     // Catch: com.huawei.hms.scankit.p.a -> L8c
            if (r7 != r5) goto L8f
            com.huawei.hms.scankit.p.u6[] r12 = r11.j()     // Catch: com.huawei.hms.scankit.p.a -> L8c
            if (r12 == 0) goto L8f
            com.huawei.hms.scankit.p.u6 r13 = new com.huawei.hms.scankit.p.u6     // Catch: com.huawei.hms.scankit.p.a -> L8c
            float r14 = (float) r0     // Catch: com.huawei.hms.scankit.p.a -> L8c
            r15 = r12[r1]     // Catch: com.huawei.hms.scankit.p.a -> L8c
            float r15 = r15.b()     // Catch: com.huawei.hms.scankit.p.a -> L8c
            float r15 = r14 - r15
            r16 = 1065353216(0x3f800000, float:1.0)
            float r15 = r15 - r16
            r17 = r12[r1]     // Catch: com.huawei.hms.scankit.p.a -> L8c
            r18 = 0
            float r1 = r17.c()     // Catch: com.huawei.hms.scankit.p.a -> L8a
            r13.<init>(r15, r1)     // Catch: com.huawei.hms.scankit.p.a -> L8a
            r12[r18] = r13     // Catch: com.huawei.hms.scankit.p.a -> L8a
            com.huawei.hms.scankit.p.u6 r1 = new com.huawei.hms.scankit.p.u6     // Catch: com.huawei.hms.scankit.p.a -> L8a
            r13 = r12[r5]     // Catch: com.huawei.hms.scankit.p.a -> L8a
            float r13 = r13.b()     // Catch: com.huawei.hms.scankit.p.a -> L8a
            float r14 = r14 - r13
            float r14 = r14 - r16
            r13 = r12[r5]     // Catch: com.huawei.hms.scankit.p.a -> L8a
            float r13 = r13.c()     // Catch: com.huawei.hms.scankit.p.a -> L8a
            r1.<init>(r14, r13)     // Catch: com.huawei.hms.scankit.p.a -> L8a
            r12[r5] = r1     // Catch: com.huawei.hms.scankit.p.a -> L8a
            goto L91
        L8a:
            goto L99
        L8c:
            r18 = 0
            goto L8a
        L8f:
            r18 = 0
        L91:
            boolean r1 = a(r11, r0)     // Catch: com.huawei.hms.scankit.p.a -> L8a
            if (r1 != 0) goto L98
            goto L9e
        L98:
            return r11
        L99:
            if (r7 != r5) goto L9e
            r9.h()
        L9e:
            int r7 = r7 + 1
            r1 = 0
            goto L1f
        La3:
            r8 = r19
            r9 = r20
            r10 = r23
            r18 = 0
            int r4 = r4 + 1
            r1 = 0
            goto L8
        Lb0:
            r8 = r19
            r0 = 0
            return r0
    }

    protected static void a(com.huawei.hms.scankit.p.r r6, int r7, int[] r8) throws com.huawei.hms.scankit.p.a {
            int r0 = r8.length
            r1 = 0
            java.util.Arrays.fill(r8, r1, r0, r1)
            int r2 = r6.e()
            if (r7 >= r2) goto L4d
            boolean r3 = r6.b(r7)
            r4 = 1
            r3 = r3 ^ r4
        L11:
            if (r7 >= r2) goto L3f
            boolean r5 = r6.b(r7)
            if (r5 == r3) goto L29
            if (r1 < 0) goto L24
            int r5 = r8.length
            if (r1 >= r5) goto L24
            r5 = r8[r1]
            int r5 = r5 + r4
            r8[r1] = r5
            goto L37
        L24:
            com.huawei.hms.scankit.p.a r6 = com.huawei.hms.scankit.p.a.a()
            throw r6
        L29:
            int r1 = r1 + 1
            if (r1 != r0) goto L2e
            goto L3f
        L2e:
            if (r1 < 0) goto L3a
            int r5 = r8.length
            if (r1 >= r5) goto L3a
            r8[r1] = r4
            r3 = r3 ^ 1
        L37:
            int r7 = r7 + 1
            goto L11
        L3a:
            com.huawei.hms.scankit.p.a r6 = com.huawei.hms.scankit.p.a.a()
            throw r6
        L3f:
            if (r1 == r0) goto L4c
            int r0 = r0 - r4
            if (r1 != r0) goto L47
            if (r7 != r2) goto L47
            goto L4c
        L47:
            com.huawei.hms.scankit.p.a r6 = com.huawei.hms.scankit.p.a.a()
            throw r6
        L4c:
            return
        L4d:
            com.huawei.hms.scankit.p.a r6 = com.huawei.hms.scankit.p.a.a()
            throw r6
    }

    private static boolean a(com.huawei.hms.scankit.p.s6 r6, int r7) {
            com.huawei.hms.scankit.p.u6[] r6 = r6.j()
            r0 = 0
            r1 = r6[r0]
            float r1 = r1.b()
            double r1 = (double) r1
            r3 = 1
            r6 = r6[r3]
            float r6 = r6.b()
            double r4 = (double) r6
            double r4 = r4 - r1
            double r1 = java.lang.Math.abs(r4)
            double r6 = (double) r7
            double r1 = r1 / r6
            r6 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 <= 0) goto L25
            return r3
        L25:
            return r0
    }

    private static boolean a(int[] r7) {
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
        L4:
            int r4 = r7.length
            r5 = 20
            r6 = 1
            if (r1 >= r4) goto L1f
            if (r2 >= r5) goto L1f
            r4 = r7[r1]
            int r5 = r4 << 1
            r3 = r3 | r5
            r3 = r3 ^ r4
            int r3 = java.lang.Integer.bitCount(r3)
            int r2 = r2 + r3
            r3 = r7[r1]
            int r3 = r3 >> 31
            r3 = r3 & r6
            int r1 = r1 + 1
            goto L4
        L1f:
            if (r2 < r5) goto L22
            return r6
        L22:
            return r0
    }

    private com.huawei.hms.scankit.p.s6 b(com.huawei.hms.scankit.p.p r11, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r12) throws com.huawei.hms.scankit.p.a {
            r10 = this;
            int r5 = r11.e()
            int r6 = r11.c()
            com.huawei.hms.scankit.p.r r2 = new com.huawei.hms.scankit.p.r
            r2.<init>(r5)
            int r0 = r6 >> 5
            r1 = 1
            int r7 = java.lang.Math.max(r1, r0)
            int r0 = r6 / 2
            if (r12 == 0) goto L2f
            com.huawei.hms.scankit.p.l1 r1 = com.huawei.hms.scankit.p.l1.e
            boolean r3 = r12.containsKey(r1)
            if (r3 == 0) goto L2f
            java.lang.Object r1 = r12.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = r1 * r7
            int r1 = r1 / 3
            int r0 = r0 + r1
        L2f:
            r8 = r0
            r0 = 0
        L31:
            r1 = 15
            if (r0 >= r1) goto L5b
            int r9 = r0 + 1
            int r1 = r9 / 2
            r0 = r0 & 1
            if (r0 != 0) goto L3e
            goto L3f
        L3e:
            int r1 = -r1
        L3f:
            int r1 = r1 * r7
            int r4 = r8 + r1
            if (r4 < 0) goto L5b
            if (r4 >= r6) goto L5b
            r0 = r10
            r1 = r11
            r3 = r12
            com.huawei.hms.scankit.p.s6 r11 = r0.a(r1, r2, r3, r4, r5)
            if (r11 == 0) goto L57
            java.lang.String r12 = r11.k()
            if (r12 == 0) goto L57
            return r11
        L57:
            r11 = r1
            r12 = r3
            r0 = r9
            goto L31
        L5b:
            com.huawei.hms.scankit.p.a r11 = com.huawei.hms.scankit.p.a.a()
            throw r11
    }

    public abstract com.huawei.hms.scankit.p.s6 a(int r1, com.huawei.hms.scankit.p.r r2, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r3) throws com.huawei.hms.scankit.p.a;

    @Override // com.huawei.hms.scankit.p.o6
    public com.huawei.hms.scankit.p.s6 a(com.huawei.hms.scankit.p.p r1, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r2) throws com.huawei.hms.scankit.p.a {
            r0 = this;
            com.huawei.hms.scankit.p.s6 r1 = r0.b(r1, r2)
            return r1
    }
}
