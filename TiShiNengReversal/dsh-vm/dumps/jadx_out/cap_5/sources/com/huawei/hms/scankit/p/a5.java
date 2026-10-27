package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a5 implements com.huawei.hms.scankit.p.o6 {
    public a5() {
            r0 = this;
            r0.<init>()
            return
    }

    private com.huawei.hms.scankit.p.s6 a(int r6, com.huawei.hms.scankit.p.m4 r7, com.huawei.hms.scankit.p.p r8, com.huawei.hms.scankit.p.p r9, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r10) throws com.huawei.hms.scankit.p.a {
            r5 = this;
            com.huawei.hms.scankit.p.o6[] r0 = r5.a(r10)
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            boolean r3 = com.huawei.hms.scankit.p.r3.a     // Catch: com.huawei.hms.scankit.p.a -> L34
            if (r3 == 0) goto L36
            float r3 = (float) r6     // Catch: com.huawei.hms.scankit.p.a -> L34
            float r3 = r3 * r2
            r4 = 1140457472(0x43fa0000, float:500.0)
            float r3 = r3 / r4
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 <= 0) goto L16
            goto L18
        L16:
            r3 = 1065353216(0x3f800000, float:1.0)
        L18:
            com.huawei.hms.scankit.p.p r8 = r7.g(r8, r3)     // Catch: com.huawei.hms.scankit.p.a -> L34
            com.huawei.hms.scankit.p.p r8 = r7.g(r8)     // Catch: com.huawei.hms.scankit.p.a -> L34
            com.huawei.hms.scankit.p.s6 r8 = r5.a(r8, r0, r10)     // Catch: com.huawei.hms.scankit.p.a -> L34
            if (r8 == 0) goto L36
            java.lang.String r4 = r8.k()     // Catch: com.huawei.hms.scankit.p.a -> L34
            if (r4 == 0) goto L36
            com.huawei.hms.scankit.p.u6[] r4 = r8.j()     // Catch: com.huawei.hms.scankit.p.a -> L34
            com.huawei.hms.scankit.p.k2.a(r4, r3, r1)     // Catch: com.huawei.hms.scankit.p.a -> L34
            return r8
        L34:
            goto L3b
        L36:
            com.huawei.hms.scankit.p.a r8 = com.huawei.hms.scankit.p.a.a()     // Catch: com.huawei.hms.scankit.p.a -> L34
            throw r8     // Catch: com.huawei.hms.scankit.p.a -> L34
        L3b:
            float r6 = (float) r6
            float r6 = r6 * r2
            r8 = 1149698048(0x44870000, float:1080.0)
            float r6 = r6 / r8
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 <= 0) goto L46
            r2 = r6
        L46:
            com.huawei.hms.scankit.p.p r6 = r7.b(r9, r2)
            com.huawei.hms.scankit.p.s6 r6 = r5.a(r6, r0, r10)
            if (r6 == 0) goto L5d
            java.lang.String r7 = r6.k()
            if (r7 == 0) goto L5d
            com.huawei.hms.scankit.p.u6[] r7 = r6.j()
            com.huawei.hms.scankit.p.k2.a(r7, r2, r1)
        L5d:
            return r6
    }

    private com.huawei.hms.scankit.p.s6 a(int r6, com.huawei.hms.scankit.p.p r7, com.huawei.hms.scankit.p.m4 r8, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r9, com.huawei.hms.scankit.p.i2 r10) throws com.huawei.hms.scankit.p.a {
            r5 = this;
            float r6 = (float) r6
            r0 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 * r0
            r1 = 1132068864(0x437a0000, float:250.0)
            float r6 = r6 / r1
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 >= 0) goto Le
            r6 = 1065353216(0x3f800000, float:1.0)
        Le:
            com.huawei.hms.scankit.p.p r1 = r8.f(r7, r6)
            com.huawei.hms.scankit.p.o6[] r2 = r5.a(r9)
            com.huawei.hms.scankit.p.p r3 = r8.e(r1)     // Catch: com.huawei.hms.scankit.p.a -> L33
            com.huawei.hms.scankit.p.s6 r3 = r5.a(r3, r2, r9)     // Catch: com.huawei.hms.scankit.p.a -> L33
            if (r3 == 0) goto L2e
            java.lang.String r4 = r3.k()     // Catch: com.huawei.hms.scankit.p.a -> L33
            if (r4 == 0) goto L2e
            com.huawei.hms.scankit.p.u6[] r4 = r3.j()     // Catch: com.huawei.hms.scankit.p.a -> L33
            com.huawei.hms.scankit.p.k2.a(r4, r6, r10)     // Catch: com.huawei.hms.scankit.p.a -> L33
            return r3
        L2e:
            com.huawei.hms.scankit.p.a r3 = com.huawei.hms.scankit.p.a.a()     // Catch: com.huawei.hms.scankit.p.a -> L33
            throw r3     // Catch: com.huawei.hms.scankit.p.a -> L33
        L33:
            com.huawei.hms.scankit.p.p r8 = r8.f(r1)     // Catch: com.huawei.hms.scankit.p.a -> L4b
            com.huawei.hms.scankit.p.s6 r8 = r5.a(r8, r2, r9)     // Catch: com.huawei.hms.scankit.p.a -> L4b
            if (r8 == 0) goto L4d
            java.lang.String r1 = r8.k()     // Catch: com.huawei.hms.scankit.p.a -> L4b
            if (r1 == 0) goto L4d
            com.huawei.hms.scankit.p.u6[] r1 = r8.j()     // Catch: com.huawei.hms.scankit.p.a -> L4b
            com.huawei.hms.scankit.p.k2.a(r1, r6, r10)     // Catch: com.huawei.hms.scankit.p.a -> L4b
            return r8
        L4b:
            goto L52
        L4d:
            com.huawei.hms.scankit.p.a r6 = com.huawei.hms.scankit.p.a.a()     // Catch: com.huawei.hms.scankit.p.a -> L4b
            throw r6     // Catch: com.huawei.hms.scankit.p.a -> L4b
        L52:
            com.huawei.hms.scankit.p.p r6 = new com.huawei.hms.scankit.p.p
            com.huawei.hms.scankit.p.e4 r8 = new com.huawei.hms.scankit.p.e4
            com.huawei.hms.scankit.p.o r7 = r7.a()
            com.huawei.hms.scankit.p.p4 r7 = r7.c()
            r8.<init>(r7)
            r6.<init>(r8)
            com.huawei.hms.scankit.p.s6 r6 = r5.a(r6, r2, r9)
            if (r6 == 0) goto L77
            java.lang.String r7 = r6.k()
            if (r7 == 0) goto L77
            com.huawei.hms.scankit.p.u6[] r7 = r6.j()
            com.huawei.hms.scankit.p.k2.a(r7, r0, r10)
        L77:
            return r6
    }

    private com.huawei.hms.scankit.p.s6 a(com.huawei.hms.scankit.p.p r9, com.huawei.hms.scankit.p.m4 r10, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r11, com.huawei.hms.scankit.p.i2 r12) throws com.huawei.hms.scankit.p.a {
            r8 = this;
            int r0 = r9.e()
            int r1 = r9.c()
            if (r0 >= r1) goto Lb
            goto Lc
        Lb:
            r0 = r1
        Lc:
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 * r1
            r1 = 1147207680(0x44610000, float:900.0)
            float r0 = r0 / r1
            com.huawei.hms.scankit.p.p r9 = r10.i(r9, r0)
            r10 = 0
            r1 = 0
            com.huawei.hms.scankit.p.o6[] r2 = r8.a(r11)     // Catch: com.huawei.hms.scankit.p.a -> L62
            com.huawei.hms.scankit.p.s6 r2 = r8.a(r9, r2, r11)     // Catch: com.huawei.hms.scankit.p.a -> L62
            if (r2 == 0) goto L32
            java.lang.String r3 = r2.k()     // Catch: com.huawei.hms.scankit.p.a -> L5d
            if (r3 == 0) goto L32
            com.huawei.hms.scankit.p.u6[] r3 = r2.j()     // Catch: com.huawei.hms.scankit.p.a -> L5d
            com.huawei.hms.scankit.p.k2.a(r3, r0, r12)     // Catch: com.huawei.hms.scankit.p.a -> L5d
            return r2
        L32:
            boolean r3 = com.huawei.hms.scankit.p.r3.c     // Catch: com.huawei.hms.scankit.p.a -> L5d
            if (r3 != 0) goto L57
            if (r2 == 0) goto L57
            java.lang.String r3 = r2.k()     // Catch: com.huawei.hms.scankit.p.a -> L5d
            if (r3 != 0) goto L57
            com.huawei.hms.scankit.p.u6[] r3 = r2.j()     // Catch: com.huawei.hms.scankit.p.a -> L5d
            int r3 = r3.length     // Catch: com.huawei.hms.scankit.p.a -> L5d
            r4 = 3
            if (r3 < r4) goto L57
            r3 = 1
            com.huawei.hms.scankit.p.u6[] r4 = r2.j()     // Catch: com.huawei.hms.scankit.p.a -> L53
            java.lang.Object r4 = r4.clone()     // Catch: com.huawei.hms.scankit.p.a -> L53
            com.huawei.hms.scankit.p.u6[] r4 = (com.huawei.hms.scankit.p.u6[]) r4     // Catch: com.huawei.hms.scankit.p.a -> L53
            r10 = r4
            goto L58
        L53:
            r7 = r2
            r2 = r10
            r10 = r7
            goto L64
        L57:
            r3 = 0
        L58:
            com.huawei.hms.scankit.p.a r4 = com.huawei.hms.scankit.p.a.a()     // Catch: com.huawei.hms.scankit.p.a -> L53
            throw r4     // Catch: com.huawei.hms.scankit.p.a -> L53
        L5d:
            r3 = r2
            r2 = r10
            r10 = r3
        L60:
            r3 = 0
            goto L64
        L62:
            r2 = r10
            goto L60
        L64:
            byte[] r4 = r9.d()     // Catch: com.huawei.hms.scankit.p.a -> L8f
            int r5 = r9.e()     // Catch: com.huawei.hms.scankit.p.a -> L8f
            int r6 = r9.c()     // Catch: com.huawei.hms.scankit.p.a -> L8f
            com.huawei.hms.scankit.p.s r1 = com.huawei.hms.scankit.p.n1.a(r4, r5, r6, r1)     // Catch: com.huawei.hms.scankit.p.a -> L8f
            r9.a(r1)     // Catch: com.huawei.hms.scankit.p.a -> L8f
            com.huawei.hms.scankit.p.o6[] r1 = r8.a(r11)     // Catch: com.huawei.hms.scankit.p.a -> L8f
            com.huawei.hms.scankit.p.s6 r10 = r8.a(r9, r1, r11)     // Catch: com.huawei.hms.scankit.p.a -> L8f
            if (r10 == 0) goto L91
            java.lang.String r9 = r10.k()     // Catch: com.huawei.hms.scankit.p.a -> L8f
            if (r9 == 0) goto L91
            com.huawei.hms.scankit.p.u6[] r9 = r10.j()     // Catch: com.huawei.hms.scankit.p.a -> L8f
            com.huawei.hms.scankit.p.k2.a(r9, r0, r12)     // Catch: com.huawei.hms.scankit.p.a -> L8f
            return r10
        L8f:
            goto L96
        L91:
            com.huawei.hms.scankit.p.a r9 = com.huawei.hms.scankit.p.a.a()     // Catch: com.huawei.hms.scankit.p.a -> L8f
            throw r9     // Catch: com.huawei.hms.scankit.p.a -> L8f
        L96:
            if (r10 == 0) goto La8
            if (r3 == 0) goto La7
            r10.a()
            r10.b(r2)
            com.huawei.hms.scankit.p.u6[] r9 = r10.j()
            com.huawei.hms.scankit.p.k2.a(r9, r0, r12)
        La7:
            return r10
        La8:
            com.huawei.hms.scankit.p.a r9 = com.huawei.hms.scankit.p.a.a()
            throw r9
    }

    private com.huawei.hms.scankit.p.s6 a(com.huawei.hms.scankit.p.p r9, com.huawei.hms.scankit.p.m4 r10, java.util.Map<com.huawei.hms.scankit.p.l1, java.lang.Object> r11, float[] r12) throws com.huawei.hms.scankit.p.a {
            r8 = this;
            int r0 = r9.c()
            int r1 = r9.e()
            int r0 = java.lang.Math.min(r0, r1)
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 * r1
            r2 = 1149698048(0x44870000, float:1080.0)
            float r0 = r0 / r2
            boolean r2 = com.huawei.hms.scankit.p.r3.a
            if (r2 == 0) goto L1d
            com.huawei.hms.scankit.p.p r9 = r10.a(r9, r0)
            goto L29
        L1d:
            r2 = 1069547520(0x3fc00000, float:1.5)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L24
            r1 = r0
        L24:
            com.huawei.hms.scankit.p.p r9 = r10.a(r9, r1)
            r0 = r1
        L29:
            com.huawei.hms.scankit.p.o6[] r1 = r8.a(r11)
            boolean r2 = com.huawei.hms.scankit.p.r3.b
            r3 = 0
            r4 = 0
            if (r2 != 0) goto L45
            boolean r2 = com.huawei.hms.scankit.p.r3.a
            if (r2 == 0) goto L45
            com.huawei.hms.scankit.p.l1 r10 = com.huawei.hms.scankit.p.l1.e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r11.put(r10, r2)
            com.huawei.hms.scankit.p.s6 r10 = r8.a(r9, r1, r11)
            goto L81
        L45:
            r5 = r4
            r2 = 0
        L47:
            r6 = 2
            if (r2 >= r6) goto L5d
            r6 = 1
            if (r2 != r6) goto L5f
            com.huawei.hms.scankit.p.p r7 = com.huawei.hms.scankit.p.l4.a(r9)
            com.huawei.hms.scankit.p.p r7 = r10.c(r7)     // Catch: com.huawei.hms.scankit.p.a -> L7e
            com.huawei.hms.scankit.p.s6 r5 = r8.a(r7, r1, r11)     // Catch: com.huawei.hms.scankit.p.a -> L7e
            r7 = 1073741824(0x40000000, float:2.0)
            r12[r6] = r7     // Catch: com.huawei.hms.scankit.p.a -> L7e
        L5d:
            r10 = r5
            goto L81
        L5f:
            com.huawei.hms.scankit.p.p r7 = r10.b(r9)     // Catch: com.huawei.hms.scankit.p.a -> L68
            com.huawei.hms.scankit.p.s6 r10 = r8.a(r7, r1, r11)     // Catch: com.huawei.hms.scankit.p.a -> L68
            goto L81
        L68:
            boolean r7 = com.huawei.hms.scankit.p.r3.p     // Catch: com.huawei.hms.scankit.p.a -> L7e
            if (r7 == 0) goto L7e
            com.huawei.hms.scankit.p.l1 r7 = com.huawei.hms.scankit.p.l1.e     // Catch: com.huawei.hms.scankit.p.a -> L7e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: com.huawei.hms.scankit.p.a -> L7e
            r11.put(r7, r6)     // Catch: com.huawei.hms.scankit.p.a -> L7e
            com.huawei.hms.scankit.p.p r6 = r10.d(r9)     // Catch: com.huawei.hms.scankit.p.a -> L7e
            com.huawei.hms.scankit.p.s6 r10 = r8.a(r6, r1, r11)     // Catch: com.huawei.hms.scankit.p.a -> L7e
            goto L81
        L7e:
            int r2 = r2 + 1
            goto L47
        L81:
            if (r10 == 0) goto L8a
            com.huawei.hms.scankit.p.s r9 = r9.b()
            com.huawei.hms.scankit.p.k2.a(r9, r10, r0, r4)
        L8a:
            r12[r3] = r0
            return r10
    }

    private com.huawei.hms.scankit.p.s6 a(com.huawei.hms.scankit.p.p r11, com.huawei.hms.scankit.p.m4 r12, java.util.Map<com.huawei.hms.scankit.p.l1, java.lang.Object> r13, float[] r14, com.huawei.hms.scankit.p.i2 r15) throws com.huawei.hms.scankit.p.a {
            r10 = this;
            float r0 = r15.n()
            int r1 = r11.e()
            int r2 = r11.c()
            if (r1 >= r2) goto L13
            int r1 = r11.e()
            goto L17
        L13:
            int r1 = r11.c()
        L17:
            float r1 = (float) r1
            r2 = 1140457472(0x43fa0000, float:500.0)
            float r2 = r1 / r2
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto L24
            r2 = 1065353216(0x3f800000, float:1.0)
        L24:
            com.huawei.hms.scankit.p.p r4 = r12.g(r11, r2)
            com.huawei.hms.scankit.p.o6[] r5 = r10.a(r13)
            float r6 = r15.a()
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L3f
            float r6 = r15.b()
            float r7 = r15.a()
            float r6 = r6 / r7
            goto L41
        L3f:
            r6 = 1065353216(0x3f800000, float:1.0)
        L41:
            r7 = 0
            com.huawei.hms.scankit.p.s6 r8 = r10.a(r4, r5, r13)     // Catch: com.huawei.hms.scankit.p.a -> L57
            float r9 = r0 / r2
            boolean r9 = a(r8, r9, r6)     // Catch: com.huawei.hms.scankit.p.a -> L54
            if (r9 != 0) goto L4f
            goto Lab
        L4f:
            com.huawei.hms.scankit.p.a r8 = com.huawei.hms.scankit.p.a.a()     // Catch: com.huawei.hms.scankit.p.a -> L57
            throw r8     // Catch: com.huawei.hms.scankit.p.a -> L57
        L54:
            r7 = r8
            goto L58
        L57:
        L58:
            boolean r8 = com.huawei.hms.scankit.p.r3.p
            if (r8 == 0) goto Laa
            r2 = 1132068864(0x437a0000, float:250.0)
            float r1 = r1 / r2
            int r2 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r2 >= 0) goto L64
            goto L65
        L64:
            r3 = r1
        L65:
            com.huawei.hms.scankit.p.p r4 = r12.f(r11, r3)
            com.huawei.hms.scankit.p.l1 r11 = com.huawei.hms.scankit.p.l1.e     // Catch: com.huawei.hms.scankit.p.a -> L8a
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: com.huawei.hms.scankit.p.a -> L8a
            r13.put(r11, r1)     // Catch: com.huawei.hms.scankit.p.a -> L8a
            com.huawei.hms.scankit.p.p r11 = r12.e(r4)     // Catch: com.huawei.hms.scankit.p.a -> L8a
            com.huawei.hms.scankit.p.s6 r8 = r10.a(r11, r5, r13)     // Catch: com.huawei.hms.scankit.p.a -> L8a
            float r11 = r0 / r3
            boolean r11 = a(r8, r11, r6)     // Catch: com.huawei.hms.scankit.p.a -> L8a
            if (r11 != 0) goto L85
        L83:
            r2 = r3
            goto Lab
        L85:
            com.huawei.hms.scankit.p.a r11 = com.huawei.hms.scankit.p.a.a()     // Catch: com.huawei.hms.scankit.p.a -> L8a
            throw r11     // Catch: com.huawei.hms.scankit.p.a -> L8a
        L8a:
            com.huawei.hms.scankit.p.l1 r11 = com.huawei.hms.scankit.p.l1.e
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13.put(r11, r1)
            com.huawei.hms.scankit.p.p r11 = r12.f(r4)
            com.huawei.hms.scankit.p.s6 r8 = r10.a(r11, r5, r13)
            float r0 = r0 / r3
            boolean r11 = a(r8, r0, r6)
            if (r11 != 0) goto La5
            goto L83
        La5:
            com.huawei.hms.scankit.p.a r11 = com.huawei.hms.scankit.p.a.a()
            throw r11
        Laa:
            r8 = r7
        Lab:
            r11 = 0
            r14[r11] = r2
            if (r8 == 0) goto Lb7
            com.huawei.hms.scankit.p.s r11 = r4.b()
            com.huawei.hms.scankit.p.k2.a(r11, r8, r2, r15)
        Lb7:
            return r8
    }

    private com.huawei.hms.scankit.p.s6 a(com.huawei.hms.scankit.p.p r10, com.huawei.hms.scankit.p.o6[] r11, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r12) throws com.huawei.hms.scankit.p.a {
            r9 = this;
            if (r11 == 0) goto L3b
            int r0 = r11.length
            r1 = 0
            r2 = 0
        L5:
            if (r2 >= r0) goto L3b
            r3 = r11[r2]
            com.huawei.hms.scankit.p.s6 r3 = r3.a(r10, r12)     // Catch: com.huawei.hms.scankit.p.a -> L38
            if (r3 == 0) goto L37
            com.huawei.hms.scankit.p.u6[] r4 = r3.j()     // Catch: com.huawei.hms.scankit.p.a -> L38
            if (r4 == 0) goto L37
            com.huawei.hms.scankit.p.u6[] r4 = r3.j()     // Catch: com.huawei.hms.scankit.p.a -> L38
            int r5 = r4.length     // Catch: com.huawei.hms.scankit.p.a -> L38
            r6 = 0
            r7 = 0
        L1c:
            if (r6 >= r5) goto L27
            r8 = r4[r6]     // Catch: com.huawei.hms.scankit.p.a -> L38
            if (r8 == 0) goto L24
            int r7 = r7 + 1
        L24:
            int r6 = r6 + 1
            goto L1c
        L27:
            if (r7 != 0) goto L37
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r4 = r3.c()     // Catch: com.huawei.hms.scankit.p.a -> L38
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r5 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.j     // Catch: com.huawei.hms.scankit.p.a -> L38
            if (r4 == r5) goto L32
            goto L37
        L32:
            com.huawei.hms.scankit.p.a r3 = com.huawei.hms.scankit.p.a.a()     // Catch: com.huawei.hms.scankit.p.a -> L38
            throw r3     // Catch: com.huawei.hms.scankit.p.a -> L38
        L37:
            return r3
        L38:
            int r2 = r2 + 1
            goto L5
        L3b:
            com.huawei.hms.scankit.p.a r10 = com.huawei.hms.scankit.p.a.a()
            throw r10
    }

    public static boolean a(com.huawei.hms.scankit.p.s6 r7, float r8, float r9) {
            com.huawei.hms.scankit.p.u6[] r0 = r7.j()
            r1 = 0
            r0 = r0[r1]
            float r0 = r0.b()
            com.huawei.hms.scankit.p.u6[] r7 = r7.j()
            r2 = 1
            r7 = r7[r2]
            float r7 = r7.b()
            float r0 = r0 - r7
            float r7 = java.lang.Math.abs(r0)
            float r7 = r7 / r8
            double r7 = (double) r7
            r3 = 4603129179135383962(0x3fe199999999999a, double:0.55)
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 >= 0) goto L2d
            double r3 = (double) r9
            r5 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 > 0) goto L36
        L2d:
            r3 = 4599075939470750515(0x3fd3333333333333, double:0.3)
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 >= 0) goto L37
        L36:
            return r2
        L37:
            return r1
    }

    public com.huawei.hms.scankit.p.s6 a(com.huawei.hms.scankit.p.p r10, com.huawei.hms.scankit.p.p r11, com.huawei.hms.scankit.p.m4 r12, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r13) throws com.huawei.hms.scankit.p.a {
            r9 = this;
            int r0 = r10.e()
            int r1 = r10.c()
            if (r0 >= r1) goto Lc
            r3 = r0
            goto Ld
        Lc:
            r3 = r1
        Ld:
            float r0 = (float) r3
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 * r1
            r2 = 1149698048(0x44870000, float:1080.0)
            float r0 = r0 / r2
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L1a
            goto L1c
        L1a:
            r0 = 1065353216(0x3f800000, float:1.0)
        L1c:
            boolean r2 = com.huawei.hms.scankit.p.r3.a
            if (r2 == 0) goto L25
            com.huawei.hms.scankit.p.p r1 = r12.a(r10, r0)
            goto L33
        L25:
            r2 = 1069547520(0x3fc00000, float:1.5)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L2c
            r1 = r0
        L2c:
            com.huawei.hms.scankit.p.p r0 = r12.a(r10, r1)
            r8 = r1
            r1 = r0
            r0 = r8
        L33:
            com.huawei.hms.scankit.p.o6[] r2 = r9.a(r13)
            r4 = 0
            r5 = 0
            com.huawei.hms.scankit.p.s6 r1 = r9.a(r1, r2, r13)     // Catch: com.huawei.hms.scankit.p.a -> L4d
            if (r1 == 0) goto L4f
            java.lang.String r2 = r1.k()     // Catch: com.huawei.hms.scankit.p.a -> L4d
            if (r2 == 0) goto L4f
            com.huawei.hms.scankit.p.u6[] r2 = r1.j()     // Catch: com.huawei.hms.scankit.p.a -> L4d
            com.huawei.hms.scankit.p.k2.a(r2, r0, r4)     // Catch: com.huawei.hms.scankit.p.a -> L4d
            return r1
        L4d:
            goto L86
        L4f:
            boolean r0 = com.huawei.hms.scankit.p.r3.c     // Catch: com.huawei.hms.scankit.p.a -> L4d
            if (r0 != 0) goto L79
            if (r1 == 0) goto L79
            java.lang.String r0 = r1.k()     // Catch: com.huawei.hms.scankit.p.a -> L4d
            if (r0 != 0) goto L79
            com.huawei.hms.scankit.p.u6[] r0 = r1.j()     // Catch: com.huawei.hms.scankit.p.a -> L4d
            int r0 = r0.length     // Catch: com.huawei.hms.scankit.p.a -> L4d
            r2 = 3
            if (r0 < r2) goto L79
            r5 = 1
            com.huawei.hms.scankit.p.u6[] r0 = r1.j()     // Catch: com.huawei.hms.scankit.p.a -> L70
            java.lang.Object r0 = r0.clone()     // Catch: com.huawei.hms.scankit.p.a -> L70
            com.huawei.hms.scankit.p.u6[] r0 = (com.huawei.hms.scankit.p.u6[]) r0     // Catch: com.huawei.hms.scankit.p.a -> L70
            r4 = r0
            goto L79
        L70:
            r2 = r9
            r5 = r10
            r6 = r11
            r7 = r13
            r10 = r4
            r11 = 1
        L77:
            r4 = r12
            goto L8d
        L79:
            com.huawei.hms.scankit.p.a r0 = com.huawei.hms.scankit.p.a.a()     // Catch: com.huawei.hms.scankit.p.a -> L7e
            throw r0     // Catch: com.huawei.hms.scankit.p.a -> L7e
        L7e:
            r2 = r9
            r6 = r11
            r7 = r13
            r11 = r5
            r5 = r10
            r10 = r4
            goto L77
        L86:
            r2 = r9
            r5 = r10
            r6 = r11
            r7 = r13
            r10 = r4
            r11 = 0
            goto L77
        L8d:
            com.huawei.hms.scankit.p.s6 r12 = r2.a(r3, r4, r5, r6, r7)
            if (r12 == 0) goto L9c
            if (r11 == 0) goto L9b
            r12.a()
            r12.b(r10)
        L9b:
            return r12
        L9c:
            com.huawei.hms.scankit.p.a r10 = com.huawei.hms.scankit.p.a.a()
            throw r10
    }

    public com.huawei.hms.scankit.p.s6 a(com.huawei.hms.scankit.p.p r1, com.huawei.hms.scankit.p.p r2, com.huawei.hms.scankit.p.p r3, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r4, com.huawei.hms.scankit.p.m4 r5, com.huawei.hms.scankit.p.i2 r6) throws com.huawei.hms.scankit.p.a {
            r0 = this;
            if (r3 == 0) goto L7
            com.huawei.hms.scankit.p.s6 r1 = r0.a(r3, r5, r4, r6)
            goto L8
        L7:
            r1 = 0
        L8:
            if (r1 == 0) goto Lb
            return r1
        Lb:
            com.huawei.hms.scankit.p.a r1 = com.huawei.hms.scankit.p.a.a()
            throw r1
    }

    public com.huawei.hms.scankit.p.s6 a(com.huawei.hms.scankit.p.p r10, com.huawei.hms.scankit.p.p r11, java.util.Map<com.huawei.hms.scankit.p.l1, java.lang.Object> r12, com.huawei.hms.scankit.p.m4 r13, com.huawei.hms.scankit.p.i2 r14) throws com.huawei.hms.scankit.p.a {
            r9 = this;
            com.huawei.hms.scankit.p.l1 r0 = com.huawei.hms.scankit.p.l1.d
            boolean r0 = r12.containsKey(r0)
            r1 = 2
            float[] r6 = new float[r1]
            r6 = {x0068: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            r1 = 1
            r8 = 0
            if (r11 == 0) goto L1b
            r2 = r9
            r3 = r11
            r5 = r12
            r4 = r13
            r7 = r14
            com.huawei.hms.scankit.p.s6 r11 = r2.a(r3, r4, r5, r6, r7)
        L19:
            r12 = 0
            goto L34
        L1b:
            r2 = r9
            r5 = r12
            r4 = r13
            if (r0 != 0) goto L27
            boolean r11 = com.huawei.hms.scankit.p.r3.a
            if (r11 != 0) goto L25
            goto L27
        L25:
            r11 = 0
            goto L19
        L27:
            com.huawei.hms.scankit.p.s6 r11 = r9.a(r10, r4, r5, r6)
            r12 = r6[r1]
            r13 = 1065353216(0x3f800000, float:1.0)
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 <= 0) goto L19
            r12 = 1
        L34:
            if (r11 == 0) goto L63
            if (r12 == 0) goto L62
            com.huawei.hms.scankit.p.u6[] r12 = r11.j()
            if (r12 == 0) goto L62
        L3e:
            int r13 = r12.length
            if (r8 >= r13) goto L62
            r13 = r12[r8]
            if (r13 == 0) goto L5f
            com.huawei.hms.scankit.p.u6 r13 = new com.huawei.hms.scankit.p.u6
            r14 = r12[r8]
            float r14 = r14.c()
            int r0 = r10.c()
            int r0 = r0 - r1
            float r0 = (float) r0
            r3 = r12[r8]
            float r3 = r3.b()
            float r0 = r0 - r3
            r13.<init>(r14, r0)
            r12[r8] = r13
        L5f:
            int r8 = r8 + 1
            goto L3e
        L62:
            return r11
        L63:
            com.huawei.hms.scankit.p.a r10 = com.huawei.hms.scankit.p.a.a()
            throw r10
    }

    @Override // com.huawei.hms.scankit.p.o6
    public com.huawei.hms.scankit.p.s6 a(com.huawei.hms.scankit.p.p r2, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r3) throws com.huawei.hms.scankit.p.a {
            r1 = this;
            com.huawei.hms.scankit.p.o6[] r0 = r1.a(r3)
            com.huawei.hms.scankit.p.s6 r2 = r1.a(r2, r0, r3)
            return r2
    }

    public com.huawei.hms.scankit.p.o6[] a(java.util.Map<com.huawei.hms.scankit.p.l1, ?> r4) {
            r3 = this;
            if (r4 != 0) goto L4
            r0 = 0
            goto Lc
        L4:
            com.huawei.hms.scankit.p.l1 r0 = com.huawei.hms.scankit.p.l1.c
            java.lang.Object r0 = r4.get(r0)
            java.util.Collection r0 = (java.util.Collection) r0
        Lc:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r0 == 0) goto Lc3
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r2 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.l
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L5b
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r2 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.m
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L5b
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r2 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.h
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L5b
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r2 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.g
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L5b
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r2 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.b
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L5b
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r2 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.c
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L5b
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r2 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.d
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L5b
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r2 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.e
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L5b
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r2 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.i
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L63
        L5b:
            com.huawei.hms.scankit.p.z4 r2 = new com.huawei.hms.scankit.p.z4
            r2.<init>(r4)
            r1.add(r2)
        L63:
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r4 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.k
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L73
            com.huawei.hms.scankit.p.j6 r4 = new com.huawei.hms.scankit.p.j6
            r4.<init>()
            r1.add(r4)
        L73:
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r4 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.f
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L83
            com.huawei.hms.scankit.p.h1 r4 = new com.huawei.hms.scankit.p.h1
            r4.<init>()
            r1.add(r4)
        L83:
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r4 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.a
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L93
            com.huawei.hms.scankit.p.h r4 = new com.huawei.hms.scankit.p.h
            r4.<init>()
            r1.add(r4)
        L93:
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r4 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.j
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto La3
            com.huawei.hms.scankit.p.r5 r4 = new com.huawei.hms.scankit.p.r5
            r4.<init>()
            r1.add(r4)
        La3:
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r4 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.p
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto Lb3
            com.huawei.hms.scankit.p.z3 r4 = new com.huawei.hms.scankit.p.z3
            r4.<init>()
            r1.add(r4)
        Lb3:
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r4 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.q
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto Lc3
            com.huawei.hms.scankit.p.m8 r4 = new com.huawei.hms.scankit.p.m8
            r4.<init>()
            r1.add(r4)
        Lc3:
            int r4 = r1.size()
            com.huawei.hms.scankit.p.o6[] r4 = new com.huawei.hms.scankit.p.o6[r4]
            java.lang.Object[] r4 = r1.toArray(r4)
            com.huawei.hms.scankit.p.o6[] r4 = (com.huawei.hms.scankit.p.o6[]) r4
            return r4
    }

    public com.huawei.hms.scankit.p.s6 b(com.huawei.hms.scankit.p.p r9, com.huawei.hms.scankit.p.m4 r10, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r11, com.huawei.hms.scankit.p.i2 r12) throws com.huawei.hms.scankit.p.a {
            r8 = this;
            int r0 = r9.e()
            int r1 = r9.c()
            if (r0 >= r1) goto Lc
            r3 = r0
            goto Ld
        Lc:
            r3 = r1
        Ld:
            float r0 = (float) r3
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 * r1
            r2 = 1124073472(0x43000000, float:128.0)
            float r2 = r0 / r2
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 >= 0) goto L22
            boolean r4 = com.huawei.hms.scankit.p.r3.c
            if (r4 == 0) goto L22
            com.huawei.hms.scankit.p.p r9 = r10.e(r9, r2)
        L22:
            r4 = r9
            r9 = 1140457472(0x43fa0000, float:500.0)
            float r0 = r0 / r9
            int r9 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r9 >= 0) goto L2b
            goto L2c
        L2b:
            r1 = r0
        L2c:
            r9 = 0
            r0 = 0
            com.huawei.hms.scankit.p.p r2 = r10.g(r4, r1)     // Catch: com.huawei.hms.scankit.p.a -> L6b
            com.huawei.hms.scankit.p.o6[] r5 = r8.a(r11)     // Catch: com.huawei.hms.scankit.p.a -> L6b
            com.huawei.hms.scankit.p.s6 r2 = r8.a(r2, r5, r11)     // Catch: com.huawei.hms.scankit.p.a -> L6b
            if (r2 == 0) goto L4a
            java.lang.String r5 = r2.k()     // Catch: com.huawei.hms.scankit.p.a -> L6b
            if (r5 == 0) goto L4a
            com.huawei.hms.scankit.p.u6[] r5 = r2.j()     // Catch: com.huawei.hms.scankit.p.a -> L6b
            com.huawei.hms.scankit.p.k2.a(r5, r1, r12)     // Catch: com.huawei.hms.scankit.p.a -> L6b
            return r2
        L4a:
            boolean r5 = com.huawei.hms.scankit.p.r3.c     // Catch: com.huawei.hms.scankit.p.a -> L6b
            if (r5 != 0) goto L71
            if (r2 == 0) goto L71
            java.lang.String r5 = r2.k()     // Catch: com.huawei.hms.scankit.p.a -> L6b
            if (r5 != 0) goto L71
            com.huawei.hms.scankit.p.u6[] r5 = r2.j()     // Catch: com.huawei.hms.scankit.p.a -> L6b
            int r5 = r5.length     // Catch: com.huawei.hms.scankit.p.a -> L6b
            r6 = 3
            if (r5 < r6) goto L71
            r0 = 1
            com.huawei.hms.scankit.p.u6[] r2 = r2.j()     // Catch: com.huawei.hms.scankit.p.a -> L6b
            java.lang.Object r2 = r2.clone()     // Catch: com.huawei.hms.scankit.p.a -> L6b
            com.huawei.hms.scankit.p.u6[] r2 = (com.huawei.hms.scankit.p.u6[]) r2     // Catch: com.huawei.hms.scankit.p.a -> L6b
            r9 = r2
            goto L71
        L6b:
            r2 = r8
            r5 = r10
            r6 = r11
            r7 = r12
            goto L76
        L71:
            com.huawei.hms.scankit.p.a r2 = com.huawei.hms.scankit.p.a.a()     // Catch: com.huawei.hms.scankit.p.a -> L6b
            throw r2     // Catch: com.huawei.hms.scankit.p.a -> L6b
        L76:
            com.huawei.hms.scankit.p.s6 r10 = r2.a(r3, r4, r5, r6, r7)
            if (r10 == 0) goto L8c
            if (r0 == 0) goto L8b
            r10.a()
            r10.b(r9)
            com.huawei.hms.scankit.p.u6[] r9 = r10.j()
            com.huawei.hms.scankit.p.k2.a(r9, r1, r7)
        L8b:
            return r10
        L8c:
            com.huawei.hms.scankit.p.a r9 = com.huawei.hms.scankit.p.a.a()
            throw r9
    }

    public com.huawei.hms.scankit.p.s6 b(com.huawei.hms.scankit.p.p r1, com.huawei.hms.scankit.p.p r2, com.huawei.hms.scankit.p.p r3, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r4, com.huawei.hms.scankit.p.m4 r5, com.huawei.hms.scankit.p.i2 r6) throws com.huawei.hms.scankit.p.a {
            r0 = this;
            if (r3 == 0) goto L7
            com.huawei.hms.scankit.p.s6 r1 = r0.b(r3, r5, r4, r6)
            return r1
        L7:
            com.huawei.hms.scankit.p.s6 r1 = r0.a(r1, r2, r5, r4)
            return r1
    }

    public com.huawei.hms.scankit.p.s6 c(com.huawei.hms.scankit.p.p r6, com.huawei.hms.scankit.p.m4 r7, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r8, com.huawei.hms.scankit.p.i2 r9) throws com.huawei.hms.scankit.p.a {
            r5 = this;
            int r0 = r6.e()
            int r1 = r6.c()
            if (r0 >= r1) goto Lb
            goto Lc
        Lb:
            r0 = r1
        Lc:
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 * r1
            r1 = 1140457472(0x43fa0000, float:500.0)
            float r0 = r0 / r1
            com.huawei.hms.scankit.p.p r6 = r7.g(r6, r0)
            com.huawei.hms.scankit.p.o6[] r7 = r5.a(r8)     // Catch: com.huawei.hms.scankit.p.a -> L35
            com.huawei.hms.scankit.p.s6 r7 = r5.a(r6, r7, r8)     // Catch: com.huawei.hms.scankit.p.a -> L35
            if (r7 == 0) goto L30
            java.lang.String r1 = r7.k()     // Catch: com.huawei.hms.scankit.p.a -> L36
            if (r1 == 0) goto L30
            com.huawei.hms.scankit.p.u6[] r1 = r7.j()     // Catch: com.huawei.hms.scankit.p.a -> L36
            com.huawei.hms.scankit.p.k2.a(r1, r0, r9)     // Catch: com.huawei.hms.scankit.p.a -> L36
            return r7
        L30:
            com.huawei.hms.scankit.p.a r1 = com.huawei.hms.scankit.p.a.a()     // Catch: com.huawei.hms.scankit.p.a -> L36
            throw r1     // Catch: com.huawei.hms.scankit.p.a -> L36
        L35:
            r7 = 0
        L36:
            byte[] r1 = r6.d()     // Catch: com.huawei.hms.scankit.p.a -> L62
            int r2 = r6.e()     // Catch: com.huawei.hms.scankit.p.a -> L62
            int r3 = r6.c()     // Catch: com.huawei.hms.scankit.p.a -> L62
            r4 = 1
            com.huawei.hms.scankit.p.s r1 = com.huawei.hms.scankit.p.n1.a(r1, r2, r3, r4)     // Catch: com.huawei.hms.scankit.p.a -> L62
            r6.a(r1)     // Catch: com.huawei.hms.scankit.p.a -> L62
            com.huawei.hms.scankit.p.o6[] r1 = r5.a(r8)     // Catch: com.huawei.hms.scankit.p.a -> L62
            com.huawei.hms.scankit.p.s6 r7 = r5.a(r6, r1, r8)     // Catch: com.huawei.hms.scankit.p.a -> L62
            if (r7 == 0) goto L64
            java.lang.String r6 = r7.k()     // Catch: com.huawei.hms.scankit.p.a -> L62
            if (r6 == 0) goto L64
            com.huawei.hms.scankit.p.u6[] r6 = r7.j()     // Catch: com.huawei.hms.scankit.p.a -> L62
            com.huawei.hms.scankit.p.k2.a(r6, r0, r9)     // Catch: com.huawei.hms.scankit.p.a -> L62
            return r7
        L62:
            goto L69
        L64:
            com.huawei.hms.scankit.p.a r6 = com.huawei.hms.scankit.p.a.a()     // Catch: com.huawei.hms.scankit.p.a -> L62
            throw r6     // Catch: com.huawei.hms.scankit.p.a -> L62
        L69:
            if (r7 == 0) goto L6c
            return r7
        L6c:
            com.huawei.hms.scankit.p.a r6 = com.huawei.hms.scankit.p.a.a()
            throw r6
    }
}
