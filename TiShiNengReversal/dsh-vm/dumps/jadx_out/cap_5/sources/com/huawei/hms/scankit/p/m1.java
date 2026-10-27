package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class m1 {
    private static boolean a = true;
    private static boolean b;
    private static boolean c;
    private static int d;
    private static java.util.LinkedList<com.huawei.hms.scankit.p.i2> e;
    private static java.util.LinkedList<com.huawei.hms.scankit.p.c6> f;
    private static java.util.LinkedList<com.huawei.hms.scankit.p.c6> g;
    private static boolean h;
    private static boolean i;
    private static long j;
    private static boolean k;

    static {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            com.huawei.hms.scankit.p.m1.e = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            com.huawei.hms.scankit.p.m1.f = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            com.huawei.hms.scankit.p.m1.g = r0
            boolean r0 = com.huawei.hms.scankit.p.r3.a
            r1 = 0
            if (r0 == 0) goto L21
            boolean r0 = com.huawei.hms.scankit.p.r3.c
            if (r0 == 0) goto L1f
            goto L21
        L1f:
            r0 = 0
            goto L22
        L21:
            r0 = 1
        L22:
            com.huawei.hms.scankit.p.m1.h = r0
            com.huawei.hms.scankit.p.m1.i = r1
            com.huawei.hms.scankit.p.m1.k = r1
            android.content.Context r0 = com.huawei.hms.feature.DynamicModuleInitializer.getContext()
            if (r0 == 0) goto L49
            android.content.Context r0 = com.huawei.hms.feature.DynamicModuleInitializer.getContext()
            java.lang.String r1 = "detect.ms"
            com.huawei.hms.scankit.p.y4.c(r0, r1)
            android.content.Context r0 = com.huawei.hms.feature.DynamicModuleInitializer.getContext()
            java.lang.String r1 = "angle.ms"
            com.huawei.hms.scankit.p.y4.a(r0, r1)
            android.content.Context r0 = com.huawei.hms.feature.DynamicModuleInitializer.getContext()
            java.lang.String r1 = "corner.ms"
            com.huawei.hms.scankit.p.y4.b(r0, r1)
        L49:
            return
    }

    public m1() {
            r1 = this;
            r1.<init>()
            return
    }

    private static com.huawei.hms.scankit.p.p4 a(byte[] r12, com.huawei.hms.scankit.p.x6 r13) {
            int r2 = r13.a
            int r3 = r13.b
            boolean r0 = r13.d
            if (r0 == 0) goto L50
            int r0 = r2 * r3
            byte[] r1 = new byte[r0]
            r4 = 0
            r5 = 0
            r6 = 0
        Lf:
            r7 = 1
            if (r6 >= r3) goto L2b
            r8 = 0
        L13:
            if (r8 >= r2) goto L28
            int r9 = r6 * r2
            int r9 = r9 + r8
            r9 = r12[r9]
            r10 = r9 & 255(0xff, float:3.57E-43)
            float r10 = (float) r10
            float r5 = r5 + r10
            int r10 = r8 * r3
            int r10 = r10 + r3
            int r10 = r10 - r6
            int r10 = r10 - r7
            r1[r10] = r9
            int r8 = r8 + 1
            goto L13
        L28:
            int r6 = r6 + 1
            goto Lf
        L2b:
            float r12 = (float) r0
            float r5 = r5 / r12
            r12 = 1103626240(0x41c80000, float:25.0)
            int r12 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r12 >= 0) goto L36
            com.huawei.hms.scankit.p.r3.e = r7
            goto L3e
        L36:
            r12 = 1129775104(0x43570000, float:215.0)
            int r12 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r12 <= 0) goto L3e
            com.huawei.hms.scankit.p.r3.d = r7
        L3e:
            r13.a = r3
            r13.b = r2
            com.huawei.hms.scankit.p.e6 r0 = new com.huawei.hms.scankit.p.e6
            r5 = 0
            r8 = 0
            r4 = 0
            r6 = r3
            r7 = r2
            r11 = r3
            r3 = r2
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        L50:
            com.huawei.hms.scankit.p.e6 r0 = new com.huawei.hms.scankit.p.e6
            r5 = 0
            r8 = 0
            r4 = 0
            r6 = r2
            r7 = r3
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    private static com.huawei.hms.scankit.p.s6 a(com.huawei.hms.scankit.p.n1 r2, java.util.List<com.huawei.hms.scankit.aiscan.common.BarcodeFormat> r3, java.util.List<com.huawei.hms.scankit.aiscan.common.BarcodeFormat> r4, java.util.List<com.huawei.hms.scankit.aiscan.common.BarcodeFormat> r5, java.util.List<com.huawei.hms.scankit.aiscan.common.BarcodeFormat> r6) {
            int r0 = r3.size()
            r1 = 0
            if (r0 <= 0) goto Lc
            com.huawei.hms.scankit.p.s6 r3 = r2.f(r3, r1)
            goto Ld
        Lc:
            r3 = r1
        Ld:
            boolean r0 = a(r3)
            if (r0 == 0) goto L1d
            int r0 = r5.size()
            if (r0 <= 0) goto L1d
            com.huawei.hms.scankit.p.s6 r3 = r2.d(r5, r1)
        L1d:
            boolean r5 = a(r3)
            if (r5 == 0) goto L31
            int r5 = r4.size()
            if (r5 <= 0) goto L31
            boolean r5 = com.huawei.hms.scankit.p.m1.h
            if (r5 == 0) goto L31
            com.huawei.hms.scankit.p.s6 r3 = r2.a(r4, r1)
        L31:
            boolean r4 = a(r3)
            if (r4 == 0) goto L42
            int r4 = r6.size()
            if (r4 <= 0) goto L42
            com.huawei.hms.scankit.p.s6 r2 = r2.b(r6, r1)
            return r2
        L42:
            return r3
    }

    private static com.huawei.hms.scankit.p.s6 a(com.huawei.hms.scankit.p.p4 r0, com.huawei.hms.scankit.p.x6 r1, java.util.LinkedList<com.huawei.hms.scankit.p.s6> r2, boolean r3, boolean r4, int r5) {
            com.huawei.hms.scankit.p.n1 r4 = new com.huawei.hms.scankit.p.n1
            r4.<init>(r0)
            int r0 = r1.c
            java.util.List r0 = com.huawei.hms.scankit.p.n3.a(r0)
            if (r3 == 0) goto L1c
            java.util.LinkedList<com.huawei.hms.scankit.p.i2> r1 = com.huawei.hms.scankit.p.m1.e
            com.huawei.hms.scankit.p.s6 r0 = b(r1, r4, r0)
            if (r0 == 0) goto L36
            java.lang.String r1 = r0.k()
            if (r1 == 0) goto L36
            return r0
        L1c:
            java.util.LinkedList<com.huawei.hms.scankit.p.i2> r1 = com.huawei.hms.scankit.p.m1.e
            java.util.List r0 = a(r1, r4, r0)
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            com.huawei.hms.scankit.p.s6 r1 = (com.huawei.hms.scankit.p.s6) r1
            r2.offer(r1)
            goto L26
        L36:
            r0 = 0
            return r0
    }

    public static com.huawei.hms.scankit.p.s6 a(java.util.List<com.huawei.hms.scankit.aiscan.common.BarcodeFormat> r2, com.huawei.hms.scankit.p.n1 r3) {
            int r0 = r2.size()
            r1 = 0
            if (r0 <= 0) goto Lc
            com.huawei.hms.scankit.p.s6 r2 = r3.e(r2, r1)
            return r2
        Lc:
            return r1
    }

    public static java.util.List<com.huawei.hms.scankit.p.s6> a(java.util.List<com.huawei.hms.scankit.p.i2> r25, com.huawei.hms.scankit.p.n1 r26, java.util.List<java.util.List<com.huawei.hms.scankit.aiscan.common.BarcodeFormat>> r27) {
            r0 = r26
            r1 = r27
            r2 = 0
            java.lang.Object r3 = r1.get(r2)
            java.util.List r3 = (java.util.List) r3
            r4 = 1
            java.lang.Object r5 = r1.get(r4)
            java.util.List r5 = (java.util.List) r5
            r6 = 2
            java.lang.Object r6 = r1.get(r6)
            java.util.List r6 = (java.util.List) r6
            r7 = 3
            java.lang.Object r7 = r1.get(r7)
            java.util.List r7 = (java.util.List) r7
            r8 = 4
            java.lang.Object r8 = r1.get(r8)
            java.util.List r8 = (java.util.List) r8
            r9 = 5
            java.lang.Object r9 = r1.get(r9)
            java.util.List r9 = (java.util.List) r9
            r10 = 6
            java.lang.Object r1 = r1.get(r10)
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r11 = 0
        L3b:
            int r12 = r25.size()
            java.lang.String r14 = "scankit mul"
            if (r11 >= r12) goto L20c
            com.huawei.hms.scankit.p.m4 r12 = r0.i
            r12.a()
            r12 = r25
            java.lang.Object r15 = r12.get(r11)
            com.huawei.hms.scankit.p.i2 r15 = (com.huawei.hms.scankit.p.i2) r15
            float r16 = r15.g()
            r17 = 1084227584(0x40a00000, float:5.0)
            int r16 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r16 != 0) goto L5d
            r16 = 1
            goto L5f
        L5d:
            r16 = 0
        L5f:
            float r17 = r15.g()
            r2 = 1065353216(0x3f800000, float:1.0)
            int r17 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r17 != 0) goto L6c
            r17 = 1
            goto L6e
        L6c:
            r17 = 0
        L6e:
            float r18 = r15.g()
            r19 = 1077936128(0x40400000, float:3.0)
            int r18 = (r18 > r19 ? 1 : (r18 == r19 ? 0 : -1))
            if (r18 != 0) goto L7b
            r18 = 1
            goto L7d
        L7b:
            r18 = 0
        L7d:
            float r19 = r15.g()
            r20 = 1073741824(0x40000000, float:2.0)
            int r19 = (r19 > r20 ? 1 : (r19 == r20 ? 0 : -1))
            if (r19 != 0) goto L8a
            r19 = 1
            goto L8c
        L8a:
            r19 = 0
        L8c:
            float r21 = r15.g()
            r22 = 1082130432(0x40800000, float:4.0)
            int r21 = (r21 > r22 ? 1 : (r21 == r22 ? 0 : -1))
            if (r21 != 0) goto L99
            r21 = 1
            goto L9b
        L99:
            r21 = 0
        L9b:
            float r22 = r15.g()
            r23 = 1086324736(0x40c00000, float:6.0)
            int r22 = (r22 > r23 ? 1 : (r22 == r23 ? 0 : -1))
            if (r22 != 0) goto La8
            r22 = 1
            goto Laa
        La8:
            r22 = 0
        Laa:
            float r23 = r15.g()
            r24 = 1088421888(0x40e00000, float:7.0)
            int r23 = (r23 > r24 ? 1 : (r23 == r24 ? 0 : -1))
            if (r23 != 0) goto Lb7
            r23 = 1
            goto Lb9
        Lb7:
            r23 = 0
        Lb9:
            boolean r24 = com.huawei.hms.scankit.p.r3.b
            if (r24 == 0) goto L101
            float r16 = r15.g()
            int r16 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r16 != 0) goto Lc8
            r16 = 1
            goto Lca
        Lc8:
            r16 = 0
        Lca:
            float r17 = r15.g()
            int r17 = (r17 > r20 ? 1 : (r17 == r20 ? 0 : -1))
            if (r17 != 0) goto Ld5
            r17 = 1
            goto Ld7
        Ld5:
            r17 = 0
        Ld7:
            float r18 = r15.g()
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 != 0) goto Le2
            r18 = 1
            goto Le4
        Le2:
            r18 = 0
        Le4:
            float r19 = r15.g()
            int r19 = (r19 > r2 ? 1 : (r19 == r2 ? 0 : -1))
            if (r19 != 0) goto Lef
            r21 = 1
            goto Lf1
        Lef:
            r21 = 0
        Lf1:
            float r19 = r15.g()
            int r19 = (r19 > r20 ? 1 : (r19 == r20 ? 0 : -1))
            r27 = 0
            if (r19 != 0) goto Lfe
            r19 = 1
            goto L103
        Lfe:
            r19 = 0
            goto L103
        L101:
            r27 = 0
        L103:
            java.lang.String r13 = "start cropAndRotate"
            com.huawei.hms.scankit.p.o4.d(r14, r13)
            r0.b(r15)
            java.lang.String r13 = "end cropAndRotate"
            com.huawei.hms.scankit.p.o4.d(r14, r13)
            java.lang.String r13 = "start decode"
            com.huawei.hms.scankit.p.o4.d(r14, r13)
            boolean r13 = a(r27)
            if (r13 == 0) goto L128
            int r13 = r3.size()
            if (r13 <= 0) goto L128
            if (r17 == 0) goto L128
            com.huawei.hms.scankit.p.s6 r13 = r0.e(r3, r15)
            goto L12a
        L128:
            r13 = r27
        L12a:
            boolean r14 = a(r13)
            if (r14 == 0) goto L13c
            int r14 = r7.size()
            if (r14 <= 0) goto L13c
            if (r18 == 0) goto L13c
            com.huawei.hms.scankit.p.s6 r13 = r0.b(r7, r15)
        L13c:
            boolean r14 = a(r13)
            if (r14 == 0) goto L14e
            int r14 = r6.size()
            if (r14 <= 0) goto L14e
            if (r21 == 0) goto L14e
            com.huawei.hms.scankit.p.s6 r13 = r0.d(r6, r15)
        L14e:
            boolean r14 = a(r13)
            if (r14 == 0) goto L160
            int r14 = r8.size()
            if (r14 <= 0) goto L160
            if (r19 == 0) goto L160
            com.huawei.hms.scankit.p.s6 r13 = r0.b(r8, r15)
        L160:
            boolean r14 = a(r13)
            if (r14 == 0) goto L172
            int r14 = r5.size()
            if (r14 <= 0) goto L172
            if (r16 == 0) goto L172
            com.huawei.hms.scankit.p.s6 r13 = r0.a(r5, r15)
        L172:
            boolean r14 = a(r13)
            if (r14 == 0) goto L184
            int r14 = r9.size()
            if (r14 <= 0) goto L184
            if (r23 == 0) goto L184
            com.huawei.hms.scankit.p.s6 r13 = r0.c(r9, r15)
        L184:
            boolean r14 = a(r13)
            if (r14 == 0) goto L1bb
            int r14 = r1.size()
            if (r14 <= 0) goto L1bb
            if (r22 == 0) goto L1bb
            float r14 = r15.h()
            r17 = r5
            double r4 = (double) r14
            r18 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            int r14 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r14 > 0) goto L1a6
            boolean r4 = com.huawei.hms.scankit.p.r3.c
            if (r4 == 0) goto L1bd
        L1a6:
            com.huawei.hms.scankit.p.s6 r4 = r0.h(r1, r15)
            if (r4 == 0) goto L1b9
            com.huawei.hms.scankit.p.p r5 = r0.a()
            boolean r5 = com.huawei.hms.scankit.p.n1.b(r5, r15)
            if (r5 != 0) goto L1b9
            r13 = r27
            goto L1bd
        L1b9:
            r13 = r4
            goto L1bd
        L1bb:
            r17 = r5
        L1bd:
            boolean r4 = com.huawei.hms.scankit.p.r3.g
            if (r4 == 0) goto L1f8
            if (r13 == 0) goto L1f8
            boolean r4 = r0.b()
            if (r4 == 0) goto L1f8
            float r4 = r0.e()
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L1db
            float r4 = r0.e()
            float r2 = java.lang.Math.max(r2, r4)
            goto L1eb
        L1db:
            float r4 = r0.c()
            float r5 = r0.d()
            float r4 = java.lang.Math.max(r4, r5)
            float r2 = java.lang.Math.max(r2, r4)
        L1eb:
            com.huawei.hms.scankit.p.s6 r4 = new com.huawei.hms.scankit.p.s6
            r4.<init>(r2)
            r2 = 1
            r4.c(r2)
            r10.add(r4)
            goto L204
        L1f8:
            r2 = 1
            if (r13 == 0) goto L204
            java.lang.String r4 = r13.k()
            if (r4 == 0) goto L204
            r10.add(r13)
        L204:
            int r11 = r11 + 1
            r5 = r17
            r2 = 0
            r4 = 1
            goto L3b
        L20c:
            r27 = 0
            int r1 = r10.size()
            if (r1 != 0) goto L22f
            int r1 = r3.size()
            if (r1 <= 0) goto L22f
            boolean r1 = com.huawei.hms.scankit.p.r3.g
            if (r1 != 0) goto L22f
            r1 = r27
            com.huawei.hms.scankit.p.s6 r0 = r0.g(r3, r1)
            if (r0 == 0) goto L22f
            java.lang.String r1 = r0.k()
            if (r1 == 0) goto L22f
            r10.add(r0)
        L22f:
            java.lang.String r0 = "end decode"
            com.huawei.hms.scankit.p.o4.d(r14, r0)
            return r10
    }

    private static void a() {
            r0 = 0
            com.huawei.hms.scankit.p.m1.c = r0
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            com.huawei.hms.scankit.p.m1.e = r1
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            com.huawei.hms.scankit.p.m1.f = r1
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            com.huawei.hms.scankit.p.m1.g = r1
            com.huawei.hms.scankit.p.r3.d = r0
            com.huawei.hms.scankit.p.r3.e = r0
            return
    }

    private static void a(com.huawei.hms.scankit.p.p4 r9, int r10, int r11, com.huawei.hms.scankit.p.x6 r12) {
            com.huawei.hms.scankit.p.r3.a(r12)
            com.huawei.hms.scankit.p.e6 r0 = new com.huawei.hms.scankit.p.e6
            int r1 = r12.a
            int r2 = r12.b
            com.huawei.hms.scankit.p.p4 r9 = r9.a(r10, r11, r1, r2)
            byte[] r1 = r9.b()
            int r2 = r12.a
            int r3 = r12.b
            r5 = 0
            r8 = 0
            r4 = 0
            r6 = r2
            r7 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            com.huawei.hms.scankit.p.n1 r9 = new com.huawei.hms.scankit.p.n1
            r9.<init>(r0)
            boolean r10 = com.huawei.hms.scankit.p.r3.q
            r11 = 0
            java.util.List r9 = r9.a(r11, r10)
            boolean r10 = r12.j
            if (r10 != 0) goto L30
            a(r9, r12)
        L30:
            java.util.Iterator r9 = r9.iterator()
        L34:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L4f
            java.lang.Object r10 = r9.next()
            com.huawei.hms.scankit.p.i2 r10 = (com.huawei.hms.scankit.p.i2) r10
            int r11 = r12.h
            float r11 = (float) r11
            int r0 = r12.i
            float r0 = (float) r0
            r10.a(r11, r0)
            java.util.LinkedList<com.huawei.hms.scankit.p.i2> r11 = com.huawei.hms.scankit.p.m1.e
            r11.offer(r10)
            goto L34
        L4f:
            return
    }

    private static void a(java.util.List<com.huawei.hms.scankit.p.i2> r7, com.huawei.hms.scankit.p.x6 r8) {
            java.util.Iterator r7 = r7.iterator()
        L4:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L8a
            java.lang.Object r0 = r7.next()
            com.huawei.hms.scankit.p.i2 r0 = (com.huawei.hms.scankit.p.i2) r0
            float r1 = r0.d()
            int r2 = r8.a
            float r2 = (float) r2
            r3 = 1036831949(0x3dcccccd, float:0.1)
            float r2 = r2 * r3
            r4 = 1063675494(0x3f666666, float:0.9)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L30
            java.util.LinkedList<com.huawei.hms.scankit.p.c6> r1 = com.huawei.hms.scankit.p.m1.f
            com.huawei.hms.scankit.p.c6 r2 = new com.huawei.hms.scankit.p.c6
            int r5 = r8.h
            r2.<init>(r0, r5)
            r1.offer(r2)
            goto L4f
        L30:
            float r1 = r0.d()
            float r2 = r0.f()
            float r1 = r1 + r2
            int r2 = r8.a
            float r5 = (float) r2
            float r5 = r5 * r4
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L4f
            java.util.LinkedList<com.huawei.hms.scankit.p.c6> r1 = com.huawei.hms.scankit.p.m1.f
            com.huawei.hms.scankit.p.c6 r5 = new com.huawei.hms.scankit.p.c6
            int r6 = r8.h
            int r6 = r6 + r2
            r5.<init>(r0, r6)
            r1.offer(r5)
        L4f:
            float r1 = r0.e()
            int r2 = r8.b
            float r2 = (float) r2
            float r2 = r2 * r3
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L69
            java.util.LinkedList<com.huawei.hms.scankit.p.c6> r1 = com.huawei.hms.scankit.p.m1.g
            com.huawei.hms.scankit.p.c6 r2 = new com.huawei.hms.scankit.p.c6
            int r3 = r8.i
            r2.<init>(r0, r3)
            r1.offer(r2)
            goto L4
        L69:
            float r1 = r0.e()
            float r2 = r0.c()
            float r1 = r1 + r2
            int r2 = r8.b
            float r3 = (float) r2
            float r3 = r3 * r4
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L4
            java.util.LinkedList<com.huawei.hms.scankit.p.c6> r1 = com.huawei.hms.scankit.p.m1.g
            com.huawei.hms.scankit.p.c6 r3 = new com.huawei.hms.scankit.p.c6
            int r4 = r8.i
            int r4 = r4 + r2
            r3.<init>(r0, r4)
            r1.offer(r3)
            goto L4
        L8a:
            return
    }

    public static void a(boolean r0) {
            com.huawei.hms.scankit.p.r3.a = r0
            return
    }

    private static boolean a(com.huawei.hms.scankit.p.s6 r0) {
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.k()
            if (r0 != 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public static com.huawei.hms.scankit.p.s6[] a(android.graphics.Bitmap r6, com.huawei.hms.scankit.p.x6 r7) {
            java.lang.String r0 = "exception"
            java.lang.String r1 = "start decodeMultiCode pre"
            java.lang.String r2 = "scankit mul"
            com.huawei.hms.scankit.p.o4.b(r2, r1)
            r1 = 0
            int r3 = r6.getWidth()     // Catch: java.lang.OutOfMemoryError -> L35 java.lang.Exception -> L3b java.lang.UnsatisfiedLinkError -> L41 java.lang.UnsupportedOperationException -> L47 java.lang.IllegalArgumentException -> L4d
            r7.a = r3     // Catch: java.lang.OutOfMemoryError -> L35 java.lang.Exception -> L3b java.lang.UnsatisfiedLinkError -> L41 java.lang.UnsupportedOperationException -> L47 java.lang.IllegalArgumentException -> L4d
            int r3 = r6.getHeight()     // Catch: java.lang.OutOfMemoryError -> L35 java.lang.Exception -> L3b java.lang.UnsatisfiedLinkError -> L41 java.lang.UnsupportedOperationException -> L47 java.lang.IllegalArgumentException -> L4d
            r7.b = r3     // Catch: java.lang.OutOfMemoryError -> L35 java.lang.Exception -> L3b java.lang.UnsatisfiedLinkError -> L41 java.lang.UnsupportedOperationException -> L47 java.lang.IllegalArgumentException -> L4d
            int r3 = r6.getByteCount()     // Catch: java.lang.OutOfMemoryError -> L35 java.lang.Exception -> L3b java.lang.UnsatisfiedLinkError -> L41 java.lang.UnsupportedOperationException -> L47 java.lang.IllegalArgumentException -> L4d
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)     // Catch: java.lang.OutOfMemoryError -> L35 java.lang.Exception -> L3b java.lang.UnsatisfiedLinkError -> L41 java.lang.UnsupportedOperationException -> L47 java.lang.IllegalArgumentException -> L4d
            r6.copyPixelsToBuffer(r3)     // Catch: java.lang.OutOfMemoryError -> L35 java.lang.Exception -> L3b java.lang.UnsatisfiedLinkError -> L41 java.lang.UnsupportedOperationException -> L47 java.lang.IllegalArgumentException -> L4d
            r3.flip()     // Catch: java.lang.OutOfMemoryError -> L35 java.lang.Exception -> L3b java.lang.UnsatisfiedLinkError -> L41 java.lang.UnsupportedOperationException -> L47 java.lang.IllegalArgumentException -> L4d
            com.huawei.hms.scankit.p.m6 r6 = new com.huawei.hms.scankit.p.m6     // Catch: java.lang.OutOfMemoryError -> L35 java.lang.Exception -> L3b java.lang.UnsatisfiedLinkError -> L41 java.lang.UnsupportedOperationException -> L47 java.lang.IllegalArgumentException -> L4d
            int r4 = r7.a     // Catch: java.lang.OutOfMemoryError -> L35 java.lang.Exception -> L3b java.lang.UnsatisfiedLinkError -> L41 java.lang.UnsupportedOperationException -> L47 java.lang.IllegalArgumentException -> L4d
            int r5 = r7.b     // Catch: java.lang.OutOfMemoryError -> L35 java.lang.Exception -> L3b java.lang.UnsatisfiedLinkError -> L41 java.lang.UnsupportedOperationException -> L47 java.lang.IllegalArgumentException -> L4d
            r6.<init>(r4, r5, r3)     // Catch: java.lang.OutOfMemoryError -> L35 java.lang.Exception -> L3b java.lang.UnsatisfiedLinkError -> L41 java.lang.UnsupportedOperationException -> L47 java.lang.IllegalArgumentException -> L4d
            byte[] r1 = r6.b()     // Catch: java.lang.OutOfMemoryError -> L35 java.lang.Exception -> L3b java.lang.UnsatisfiedLinkError -> L41 java.lang.UnsupportedOperationException -> L47 java.lang.IllegalArgumentException -> L4d
            r3.clear()     // Catch: java.lang.OutOfMemoryError -> L35 java.lang.Exception -> L3b java.lang.UnsatisfiedLinkError -> L41 java.lang.UnsupportedOperationException -> L47 java.lang.IllegalArgumentException -> L4d
            goto L52
        L35:
            java.lang.String r6 = "OutOfMemoryError"
            com.huawei.hms.scankit.p.o4.b(r0, r6)
            goto L52
        L3b:
            java.lang.String r6 = "Exception"
            com.huawei.hms.scankit.p.o4.b(r0, r6)
            goto L52
        L41:
            java.lang.String r6 = "UnsatisfiedLinkError"
            com.huawei.hms.scankit.p.o4.b(r0, r6)
            goto L52
        L47:
            java.lang.String r6 = "UnsupportedArgumentException"
            com.huawei.hms.scankit.p.o4.b(r0, r6)
            goto L52
        L4d:
            java.lang.String r6 = "IllegalArgumentException"
            com.huawei.hms.scankit.p.o4.b(r0, r6)
        L52:
            java.lang.String r6 = "end decodeMultiCode pre"
            com.huawei.hms.scankit.p.o4.b(r2, r6)
            com.huawei.hms.scankit.p.s6[] r6 = b(r1, r7)
            return r6
    }

    public static com.huawei.hms.scankit.p.s6[] a(com.huawei.hms.scankit.p.p4 r10, com.huawei.hms.scankit.p.x6 r11) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.huawei.hms.scankit.p.r3.a(r11)
            r1 = 1
            com.huawei.hms.scankit.p.r3.a(r1)
            int r2 = r11.a
            r3 = 30
            if (r2 < r3) goto L126
            int r2 = r11.b
            if (r2 < r3) goto L126
            if (r10 == 0) goto L126
            int r11 = r11.c
            java.util.List r11 = com.huawei.hms.scankit.p.n3.a(r11)
            r2 = 0
            java.lang.Object r3 = r11.get(r2)
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r11.get(r1)
            java.util.List r4 = (java.util.List) r4
            r5 = 2
            java.lang.Object r5 = r11.get(r5)
            java.util.List r5 = (java.util.List) r5
            r6 = 3
            java.lang.Object r6 = r11.get(r6)
            java.util.List r6 = (java.util.List) r6
            com.huawei.hms.scankit.p.n1 r7 = new com.huawei.hms.scankit.p.n1
            r7.<init>(r10)
            java.lang.String r10 = "start detectCodes"
            java.lang.String r8 = "scankit mul"
            com.huawei.hms.scankit.p.o4.b(r8, r10)
            boolean r10 = com.huawei.hms.scankit.p.r3.q
            java.util.List r10 = r7.a(r1, r10)
            java.lang.String r9 = "end detectCodes"
            com.huawei.hms.scankit.p.o4.b(r8, r9)
            int r8 = r10.size()
            if (r8 <= 0) goto L5b
            java.util.List r0 = a(r10, r7, r11)
            goto L72
        L5b:
            boolean r11 = com.huawei.hms.scankit.p.r3.c
            if (r11 != 0) goto L63
            boolean r11 = com.huawei.hms.scankit.p.r3.a
            if (r11 != 0) goto L72
        L63:
            com.huawei.hms.scankit.p.s6 r11 = a(r7, r3, r4, r5, r6)
            if (r11 == 0) goto L72
            java.lang.String r3 = r11.k()
            if (r3 == 0) goto L72
            r0.add(r11)
        L72:
            java.util.List r11 = com.huawei.hms.scankit.p.v7.a(r0)
            boolean r0 = com.huawei.hms.scankit.p.r3.g
            if (r0 == 0) goto L95
            int r0 = r11.size()
            if (r0 <= 0) goto L95
            java.lang.Object r0 = r11.get(r2)
            com.huawei.hms.scankit.p.s6 r0 = (com.huawei.hms.scankit.p.s6) r0
            java.lang.String r0 = r0.k()
            if (r0 == 0) goto L95
            com.huawei.hms.scankit.p.s6[] r10 = new com.huawei.hms.scankit.p.s6[r2]
            java.lang.Object[] r10 = r11.toArray(r10)
            com.huawei.hms.scankit.p.s6[] r10 = (com.huawei.hms.scankit.p.s6[]) r10
            return r10
        L95:
            boolean r0 = com.huawei.hms.scankit.p.r3.c
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto Lf6
            boolean r0 = com.huawei.hms.scankit.p.r3.g
            if (r0 == 0) goto Lf6
            int r0 = r11.size()
            if (r0 <= 0) goto Lbe
            java.lang.Object r0 = r11.get(r2)
            com.huawei.hms.scankit.p.s6 r0 = (com.huawei.hms.scankit.p.s6) r0
            boolean r0 = r0.p()
            java.lang.Object r4 = r11.get(r2)
            com.huawei.hms.scankit.p.s6 r4 = (com.huawei.hms.scankit.p.s6) r4
            float r4 = r4.l()
            float r3 = java.lang.Math.max(r3, r4)
            goto Lbf
        Lbe:
            r0 = 0
        Lbf:
            int r4 = com.huawei.hms.scankit.p.r3.k
            int r4 = r4 - r1
            if (r4 <= 0) goto Lc5
            goto Lc6
        Lc5:
            r4 = 0
        Lc6:
            com.huawei.hms.scankit.p.r3.k = r4
            int r4 = r10.size()
            if (r4 <= 0) goto Lda
            if (r0 != 0) goto Ld9
            boolean r10 = r7.c(r10)
            if (r10 == 0) goto Ld7
            goto Ld9
        Ld7:
            r0 = 0
            goto Lda
        Ld9:
            r0 = 1
        Lda:
            if (r0 == 0) goto Leb
            com.huawei.hms.scankit.p.p r10 = r7.a()
            float r10 = r7.c(r10)
            r4 = 1101004800(0x41a00000, float:20.0)
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 >= 0) goto Leb
            r0 = 0
        Leb:
            if (r0 == 0) goto Lf7
            float r10 = r7.e()
            float r3 = java.lang.Math.max(r3, r10)
            goto Lf7
        Lf6:
            r0 = 0
        Lf7:
            boolean r10 = com.huawei.hms.scankit.p.r3.g
            if (r10 == 0) goto L114
            if (r0 == 0) goto L114
            com.huawei.hms.scankit.p.s6 r10 = new com.huawei.hms.scankit.p.s6
            r10.<init>(r3)
            r10.c(r1)
            r11.clear()
            r11.add(r10)
            com.huawei.hms.scankit.p.s6[] r10 = new com.huawei.hms.scankit.p.s6[r2]
            java.lang.Object[] r10 = r11.toArray(r10)
            com.huawei.hms.scankit.p.s6[] r10 = (com.huawei.hms.scankit.p.s6[]) r10
            return r10
        L114:
            int r10 = r11.size()
            if (r10 <= 0) goto L123
            com.huawei.hms.scankit.p.s6[] r10 = new com.huawei.hms.scankit.p.s6[r2]
            java.lang.Object[] r10 = r11.toArray(r10)
            com.huawei.hms.scankit.p.s6[] r10 = (com.huawei.hms.scankit.p.s6[]) r10
            return r10
        L123:
            com.huawei.hms.scankit.p.s6[] r10 = new com.huawei.hms.scankit.p.s6[r2]
            return r10
        L126:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "width or Height is Illeagle"
            r10.<init>(r11)
            throw r10
    }

    public static com.huawei.hms.scankit.p.s6[] a(java.nio.ByteBuffer r0, com.huawei.hms.scankit.p.x6 r1) {
            byte[] r0 = r0.array()
            com.huawei.hms.scankit.p.s6[] r0 = b(r0, r1)
            return r0
    }

    public static com.huawei.hms.scankit.p.s6[] a(byte[] r11, com.huawei.hms.scankit.p.x6 r12, boolean r13) {
            java.lang.String r0 = "start pre"
            java.lang.String r1 = "scankit mul"
            com.huawei.hms.scankit.p.o4.d(r1, r0)
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            a()
            int r0 = r12.a
            int r2 = r12.b
            int r0 = java.lang.Math.min(r0, r2)
            int r2 = r12.a
            int r3 = r12.b
            int r2 = java.lang.Math.max(r2, r3)
            float r2 = (float) r2
            float r3 = (float) r0
            float r2 = r2 / r3
            r5 = 1071896330(0x3fe3d70a, float:1.78)
            float r3 = r3 * r5
            int r7 = (int) r3
            com.huawei.hms.scankit.p.p4 r11 = a(r11, r12)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "init "
            r3.append(r5)
            boolean r5 = com.huawei.hms.scankit.p.m1.k
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "Scankit"
            com.huawei.hms.scankit.p.o4.d(r5, r3)
            boolean r3 = com.huawei.hms.scankit.p.r3.d
            r8 = 0
            if (r3 != 0) goto L4d
            boolean r3 = com.huawei.hms.scankit.p.r3.e
            if (r3 == 0) goto L54
        L4d:
            boolean r3 = com.huawei.hms.scankit.p.m1.k
            if (r3 == 0) goto L54
            com.huawei.hms.scankit.p.s6[] r11 = new com.huawei.hms.scankit.p.s6[r8]
            return r11
        L54:
            r9 = 1
            com.huawei.hms.scankit.p.m1.k = r9
            com.huawei.hms.scankit.p.x6 r3 = new com.huawei.hms.scankit.p.x6
            r3.<init>(r12)
            java.lang.String r5 = "end pre"
            com.huawei.hms.scankit.p.o4.d(r1, r5)
            r1 = 1077936128(0x40400000, float:3.0)
            r5 = 500(0x1f4, float:7.0E-43)
            if (r0 <= r5) goto Lf9
            int r6 = r12.a
            int r10 = r12.b
            if (r6 < r10) goto Lf9
            boolean r6 = r12.e
            if (r6 == 0) goto Lf9
            int r6 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r6 <= 0) goto Lf9
            com.huawei.hms.scankit.p.m1.c = r9
            r3.a = r7
            int r0 = r12.a
            int r0 = r0 - r9
        L7c:
            if (r0 < 0) goto L8c
            int r0 = r0 - r7
            if (r0 < 0) goto L83
            r1 = r0
            goto L84
        L83:
            r1 = 0
        L84:
            r3.h = r1
            r3.i = r8
            a(r11, r1, r8, r3)
            goto L7c
        L8c:
            java.util.LinkedList<com.huawei.hms.scankit.p.i2> r0 = com.huawei.hms.scankit.p.m1.e
            java.util.Collections.sort(r0)
            r6 = 1
            r2 = r11
            r5 = r13
            com.huawei.hms.scankit.p.s6 r11 = a(r2, r3, r4, r5, r6, r7)
            if (r11 == 0) goto L9f
            com.huawei.hms.scankit.p.s6[] r12 = new com.huawei.hms.scankit.p.s6[r9]
            r12[r8] = r11
            return r12
        L9f:
            java.util.LinkedList r11 = new java.util.LinkedList
            r11.<init>()
            com.huawei.hms.scankit.p.m1.e = r11
            java.util.LinkedList<com.huawei.hms.scankit.p.c6> r11 = com.huawei.hms.scankit.p.m1.f
            java.util.Collections.sort(r11)
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            java.util.LinkedList<com.huawei.hms.scankit.p.c6> r13 = com.huawei.hms.scankit.p.m1.f
            java.util.Iterator r13 = r13.iterator()
        Lb6:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto Le8
            java.lang.Object r0 = r13.next()
            com.huawei.hms.scankit.p.c6 r0 = (com.huawei.hms.scankit.p.c6) r0
            int r1 = r0.b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r11.add(r1)
            if (r1 == 0) goto Lb6
            int r0 = r0.b
            if (r0 < r7) goto Lb6
            int r1 = r12.a
            int r1 = r1 - r9
            int r1 = r1 - r7
            if (r0 <= r1) goto Ld9
            goto Lb6
        Ld9:
            r3.a = r7
            r3.j = r9
            int r1 = r7 / 2
            int r0 = r0 - r1
            r3.h = r0
            r3.i = r8
            a(r2, r0, r8, r3)
            goto Lb6
        Le8:
            java.util.LinkedList<com.huawei.hms.scankit.p.i2> r11 = com.huawei.hms.scankit.p.m1.e
            java.util.Collections.sort(r11)
            r6 = 1
            com.huawei.hms.scankit.p.s6 r11 = a(r2, r3, r4, r5, r6, r7)
            if (r11 == 0) goto L18d
            com.huawei.hms.scankit.p.s6[] r12 = new com.huawei.hms.scankit.p.s6[r9]
            r12[r8] = r11
            return r12
        Lf9:
            r5 = r2
            r2 = r11
            r11 = r5
            r5 = r13
            r13 = r3
            r3 = 500(0x1f4, float:7.0E-43)
            if (r0 <= r3) goto L197
            boolean r0 = r12.e
            if (r0 == 0) goto L197
            int r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r11 <= 0) goto L197
            com.huawei.hms.scankit.p.m1.c = r9
            r13.b = r7
            int r11 = r12.b
            int r11 = r11 - r9
        L111:
            if (r11 < 0) goto L121
            int r11 = r11 - r7
            if (r11 < 0) goto L118
            r0 = r11
            goto L119
        L118:
            r0 = 0
        L119:
            r13.h = r8
            r13.i = r0
            a(r2, r8, r0, r13)
            goto L111
        L121:
            java.util.LinkedList<com.huawei.hms.scankit.p.i2> r11 = com.huawei.hms.scankit.p.m1.e
            java.util.Collections.sort(r11)
            r6 = 0
            r3 = r12
            com.huawei.hms.scankit.p.s6 r11 = a(r2, r3, r4, r5, r6, r7)
            if (r11 == 0) goto L133
            com.huawei.hms.scankit.p.s6[] r12 = new com.huawei.hms.scankit.p.s6[r9]
            r12[r8] = r11
            return r12
        L133:
            java.util.LinkedList r11 = new java.util.LinkedList
            r11.<init>()
            com.huawei.hms.scankit.p.m1.e = r11
            java.util.LinkedList<com.huawei.hms.scankit.p.c6> r11 = com.huawei.hms.scankit.p.m1.g
            java.util.Collections.sort(r11)
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            java.util.LinkedList<com.huawei.hms.scankit.p.c6> r12 = com.huawei.hms.scankit.p.m1.g
            java.util.Iterator r12 = r12.iterator()
        L14a:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L17c
            java.lang.Object r0 = r12.next()
            com.huawei.hms.scankit.p.c6 r0 = (com.huawei.hms.scankit.p.c6) r0
            int r1 = r0.b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r11.add(r1)
            if (r1 == 0) goto L14a
            int r0 = r0.b
            if (r0 < r7) goto L14a
            int r1 = r3.b
            int r1 = r1 - r9
            int r1 = r1 - r7
            if (r0 <= r1) goto L16d
            goto L14a
        L16d:
            int r1 = r7 / 2
            int r0 = r0 - r1
            r13.b = r7
            r13.j = r9
            r13.h = r8
            r13.i = r0
            a(r2, r8, r0, r13)
            goto L14a
        L17c:
            java.util.LinkedList<com.huawei.hms.scankit.p.i2> r11 = com.huawei.hms.scankit.p.m1.e
            java.util.Collections.sort(r11)
            r6 = 0
            com.huawei.hms.scankit.p.s6 r11 = a(r2, r3, r4, r5, r6, r7)
            if (r11 == 0) goto L18d
            com.huawei.hms.scankit.p.s6[] r12 = new com.huawei.hms.scankit.p.s6[r9]
            r12[r8] = r11
            return r12
        L18d:
            int r11 = r4.size()
            com.huawei.hms.scankit.p.s6[] r11 = new com.huawei.hms.scankit.p.s6[r11]
            r4.toArray(r11)
            return r11
        L197:
            r3 = r12
            com.huawei.hms.scankit.p.m1.c = r8
            if (r5 == 0) goto L1a1
            com.huawei.hms.scankit.p.s6[] r11 = b(r2, r3)
            return r11
        L1a1:
            com.huawei.hms.scankit.p.s6[] r11 = a(r2, r3)
            return r11
    }

    public static com.huawei.hms.scankit.p.s6 b(java.util.List<com.huawei.hms.scankit.p.i2> r25, com.huawei.hms.scankit.p.n1 r26, java.util.List<java.util.List<com.huawei.hms.scankit.aiscan.common.BarcodeFormat>> r27) {
            r0 = r26
            r1 = r27
            r2 = 0
            java.lang.Object r3 = r1.get(r2)
            java.util.List r3 = (java.util.List) r3
            r4 = 1
            java.lang.Object r5 = r1.get(r4)
            java.util.List r5 = (java.util.List) r5
            r6 = 2
            java.lang.Object r6 = r1.get(r6)
            java.util.List r6 = (java.util.List) r6
            r7 = 3
            java.lang.Object r7 = r1.get(r7)
            java.util.List r7 = (java.util.List) r7
            r8 = 4
            java.lang.Object r8 = r1.get(r8)
            java.util.List r8 = (java.util.List) r8
            r9 = 5
            java.lang.Object r9 = r1.get(r9)
            java.util.List r9 = (java.util.List) r9
            r10 = 6
            java.lang.Object r1 = r1.get(r10)
            java.util.List r1 = (java.util.List) r1
            r10 = 0
            r12 = r10
            r11 = 0
        L38:
            int r13 = r25.size()
            if (r11 >= r13) goto L1b0
            if (r11 <= 0) goto L45
            com.huawei.hms.scankit.p.m4 r13 = r0.i
            r13.a()
        L45:
            r13 = r25
            java.lang.Object r14 = r13.get(r11)
            com.huawei.hms.scankit.p.i2 r14 = (com.huawei.hms.scankit.p.i2) r14
            float r15 = r14.g()
            r16 = 1084227584(0x40a00000, float:5.0)
            int r15 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r15 != 0) goto L59
            r15 = 1
            goto L5a
        L59:
            r15 = 0
        L5a:
            float r16 = r14.g()
            r17 = 1065353216(0x3f800000, float:1.0)
            int r16 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r16 != 0) goto L67
            r16 = 1
            goto L69
        L67:
            r16 = 0
        L69:
            float r18 = r14.g()
            r19 = 1073741824(0x40000000, float:2.0)
            int r18 = (r18 > r19 ? 1 : (r18 == r19 ? 0 : -1))
            if (r18 != 0) goto L76
            r18 = 1
            goto L78
        L76:
            r18 = 0
        L78:
            float r20 = r14.g()
            r21 = 1077936128(0x40400000, float:3.0)
            int r20 = (r20 > r21 ? 1 : (r20 == r21 ? 0 : -1))
            if (r20 != 0) goto L85
            r20 = 1
            goto L87
        L85:
            r20 = 0
        L87:
            float r21 = r14.g()
            r22 = 1082130432(0x40800000, float:4.0)
            int r21 = (r21 > r22 ? 1 : (r21 == r22 ? 0 : -1))
            if (r21 != 0) goto L94
            r21 = 1
            goto L96
        L94:
            r21 = 0
        L96:
            float r22 = r14.g()
            r23 = 1086324736(0x40c00000, float:6.0)
            int r22 = (r22 > r23 ? 1 : (r22 == r23 ? 0 : -1))
            if (r22 != 0) goto La3
            r22 = 1
            goto La5
        La3:
            r22 = 0
        La5:
            float r23 = r14.g()
            r24 = 1088421888(0x40e00000, float:7.0)
            int r23 = (r23 > r24 ? 1 : (r23 == r24 ? 0 : -1))
            if (r23 != 0) goto Lb2
            r23 = 1
            goto Lb4
        Lb2:
            r23 = 0
        Lb4:
            boolean r24 = com.huawei.hms.scankit.p.r3.b
            if (r24 == 0) goto Lf7
            float r15 = r14.g()
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 != 0) goto Lc2
            r15 = 1
            goto Lc3
        Lc2:
            r15 = 0
        Lc3:
            float r16 = r14.g()
            int r16 = (r16 > r19 ? 1 : (r16 == r19 ? 0 : -1))
            if (r16 != 0) goto Lce
            r16 = 1
            goto Ld0
        Lce:
            r16 = 0
        Ld0:
            float r18 = r14.g()
            int r18 = (r18 > r19 ? 1 : (r18 == r19 ? 0 : -1))
            if (r18 != 0) goto Ldb
            r18 = 1
            goto Ldd
        Ldb:
            r18 = 0
        Ldd:
            float r20 = r14.g()
            int r19 = (r20 > r19 ? 1 : (r20 == r19 ? 0 : -1))
            if (r19 != 0) goto Le8
            r20 = 1
            goto Lea
        Le8:
            r20 = 0
        Lea:
            float r19 = r14.g()
            int r17 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r17 != 0) goto Lf5
            r21 = 1
            goto Lf7
        Lf5:
            r21 = 0
        Lf7:
            r0.b(r14)
            boolean r17 = a(r12)
            if (r17 == 0) goto L10e
            int r17 = r3.size()
            if (r17 <= 0) goto L10e
            if (r16 == 0) goto L10e
            com.huawei.hms.scankit.p.m1.b = r4
            com.huawei.hms.scankit.p.s6 r12 = r0.e(r3, r14)
        L10e:
            boolean r16 = a(r12)
            if (r16 == 0) goto L120
            int r16 = r7.size()
            if (r16 <= 0) goto L120
            if (r20 == 0) goto L120
            com.huawei.hms.scankit.p.s6 r12 = r0.b(r7, r14)
        L120:
            boolean r16 = a(r12)
            if (r16 == 0) goto L132
            int r16 = r8.size()
            if (r16 <= 0) goto L132
            if (r18 == 0) goto L132
            com.huawei.hms.scankit.p.s6 r12 = r0.b(r8, r14)
        L132:
            boolean r16 = a(r12)
            if (r16 == 0) goto L144
            int r16 = r6.size()
            if (r16 <= 0) goto L144
            if (r21 == 0) goto L144
            com.huawei.hms.scankit.p.s6 r12 = r0.d(r6, r14)
        L144:
            boolean r16 = a(r12)
            if (r16 == 0) goto L156
            int r16 = r5.size()
            if (r16 <= 0) goto L156
            if (r15 == 0) goto L156
            com.huawei.hms.scankit.p.s6 r12 = r0.a(r5, r14)
        L156:
            boolean r15 = a(r12)
            if (r15 == 0) goto L168
            int r15 = r9.size()
            if (r15 <= 0) goto L168
            if (r23 == 0) goto L168
            com.huawei.hms.scankit.p.s6 r12 = r0.c(r9, r14)
        L168:
            boolean r15 = a(r12)
            if (r15 == 0) goto L19e
            int r15 = r1.size()
            if (r15 <= 0) goto L19e
            if (r22 == 0) goto L19e
            float r15 = r14.h()
            r17 = r3
            double r2 = (double) r15
            r18 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            int r15 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r15 > 0) goto L18a
            boolean r2 = com.huawei.hms.scankit.p.r3.c
            if (r2 == 0) goto L1a0
        L18a:
            com.huawei.hms.scankit.p.s6 r2 = r0.h(r1, r14)
            if (r2 == 0) goto L19c
            com.huawei.hms.scankit.p.p r3 = r0.a()
            boolean r3 = com.huawei.hms.scankit.p.n1.b(r3, r14)
            if (r3 != 0) goto L19c
            r12 = r10
            goto L1a0
        L19c:
            r12 = r2
            goto L1a0
        L19e:
            r17 = r3
        L1a0:
            if (r12 == 0) goto L1a9
            java.lang.String r2 = r12.k()
            if (r2 == 0) goto L1a9
            return r12
        L1a9:
            int r11 = r11 + 1
            r3 = r17
            r2 = 0
            goto L38
        L1b0:
            return r12
    }

    public static com.huawei.hms.scankit.p.s6[] b(android.graphics.Bitmap r5, com.huawei.hms.scankit.p.x6 r6) {
            java.lang.String r0 = "exception"
            r1 = 0
            int r2 = r5.getWidth()     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.Exception -> L34 java.lang.UnsatisfiedLinkError -> L3a java.lang.UnsupportedOperationException -> L40 java.lang.IllegalArgumentException -> L46
            r6.a = r2     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.Exception -> L34 java.lang.UnsatisfiedLinkError -> L3a java.lang.UnsupportedOperationException -> L40 java.lang.IllegalArgumentException -> L46
            int r2 = r5.getHeight()     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.Exception -> L34 java.lang.UnsatisfiedLinkError -> L3a java.lang.UnsupportedOperationException -> L40 java.lang.IllegalArgumentException -> L46
            r6.b = r2     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.Exception -> L34 java.lang.UnsatisfiedLinkError -> L3a java.lang.UnsupportedOperationException -> L40 java.lang.IllegalArgumentException -> L46
            int r2 = r5.getByteCount()     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.Exception -> L34 java.lang.UnsatisfiedLinkError -> L3a java.lang.UnsupportedOperationException -> L40 java.lang.IllegalArgumentException -> L46
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.Exception -> L34 java.lang.UnsatisfiedLinkError -> L3a java.lang.UnsupportedOperationException -> L40 java.lang.IllegalArgumentException -> L46
            r5.copyPixelsToBuffer(r2)     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.Exception -> L34 java.lang.UnsatisfiedLinkError -> L3a java.lang.UnsupportedOperationException -> L40 java.lang.IllegalArgumentException -> L46
            r2.flip()     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.Exception -> L34 java.lang.UnsatisfiedLinkError -> L3a java.lang.UnsupportedOperationException -> L40 java.lang.IllegalArgumentException -> L46
            com.huawei.hms.scankit.p.m6 r5 = new com.huawei.hms.scankit.p.m6     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.Exception -> L34 java.lang.UnsatisfiedLinkError -> L3a java.lang.UnsupportedOperationException -> L40 java.lang.IllegalArgumentException -> L46
            int r3 = r6.a     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.Exception -> L34 java.lang.UnsatisfiedLinkError -> L3a java.lang.UnsupportedOperationException -> L40 java.lang.IllegalArgumentException -> L46
            int r4 = r6.b     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.Exception -> L34 java.lang.UnsatisfiedLinkError -> L3a java.lang.UnsupportedOperationException -> L40 java.lang.IllegalArgumentException -> L46
            r5.<init>(r3, r4, r2)     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.Exception -> L34 java.lang.UnsatisfiedLinkError -> L3a java.lang.UnsupportedOperationException -> L40 java.lang.IllegalArgumentException -> L46
            byte[] r1 = r5.b()     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.Exception -> L34 java.lang.UnsatisfiedLinkError -> L3a java.lang.UnsupportedOperationException -> L40 java.lang.IllegalArgumentException -> L46
            r2.clear()     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.Exception -> L34 java.lang.UnsatisfiedLinkError -> L3a java.lang.UnsupportedOperationException -> L40 java.lang.IllegalArgumentException -> L46
            goto L4b
        L2e:
            java.lang.String r5 = "OutOfMemoryError"
            com.huawei.hms.scankit.p.o4.b(r0, r5)
            goto L4b
        L34:
            java.lang.String r5 = "Exception"
            com.huawei.hms.scankit.p.o4.b(r0, r5)
            goto L4b
        L3a:
            java.lang.String r5 = "UnsatisfiedLinkError"
            com.huawei.hms.scankit.p.o4.b(r0, r5)
            goto L4b
        L40:
            java.lang.String r5 = "UnsupportedArgumentException"
            com.huawei.hms.scankit.p.o4.b(r0, r5)
            goto L4b
        L46:
            java.lang.String r5 = "IllegalArgumentException"
            com.huawei.hms.scankit.p.o4.b(r0, r5)
        L4b:
            com.huawei.hms.scankit.p.s6[] r5 = c(r1, r6)
            return r5
    }

    public static com.huawei.hms.scankit.p.s6[] b(com.huawei.hms.scankit.p.p4 r32, com.huawei.hms.scankit.p.x6 r33) {
            r0 = r32
            r1 = r33
            java.lang.String r2 = "scankit mode:FULLSDK21200301 VERSION_NAME: 2.12.0.301"
            java.lang.String r3 = "ScankitDecode"
            com.huawei.hms.scankit.p.o4.d(r3, r2)
            com.huawei.hms.scankit.p.r3.a(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r4 = r1.a
            r5 = 30
            if (r4 < r5) goto L25e
            int r4 = r1.b
            if (r4 < r5) goto L25e
            if (r0 == 0) goto L25e
            int r4 = r1.c
            java.util.List r4 = com.huawei.hms.scankit.p.n3.a(r4)
            r5 = 0
            java.lang.Object r6 = r4.get(r5)
            java.util.List r6 = (java.util.List) r6
            r7 = 1
            java.lang.Object r8 = r4.get(r7)
            java.util.List r8 = (java.util.List) r8
            r9 = 2
            java.lang.Object r10 = r4.get(r9)
            java.util.List r10 = (java.util.List) r10
            r11 = 3
            java.lang.Object r12 = r4.get(r11)
            java.util.List r12 = (java.util.List) r12
            r13 = 4
            java.lang.Object r13 = r4.get(r13)
            java.util.List r13 = (java.util.List) r13
            com.huawei.hms.scankit.p.n1 r14 = new com.huawei.hms.scankit.p.n1
            r14.<init>(r0)
            java.lang.String r0 = "Start decoding the full image"
            java.lang.String r15 = "Scankit"
            com.huawei.hms.scankit.p.o4.d(r15, r0)
            boolean r0 = com.huawei.hms.scankit.p.m1.a
            r16 = 2
            r9 = 0
            if (r0 == 0) goto L6c
            boolean r0 = com.huawei.hms.scankit.p.m1.c
            if (r0 != 0) goto L6c
            com.huawei.hms.scankit.p.s6 r0 = a(r6, r14)
            com.huawei.hms.scankit.p.m1.i = r5
            long r17 = java.lang.System.currentTimeMillis()
            com.huawei.hms.scankit.p.m1.j = r17
            goto L6d
        L6c:
            r0 = r9
        L6d:
            boolean r17 = a(r0)
            if (r17 == 0) goto L100
            java.lang.String r2 = "detection start."
            com.huawei.hms.scankit.p.o4.d(r15, r2)
            boolean r2 = com.huawei.hms.scankit.p.r3.q
            java.util.List r2 = r14.a(r5, r2)
            r17 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r11 = "detection results size: "
            r5.append(r11)
            int r11 = r2.size()
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            com.huawei.hms.scankit.p.o4.d(r15, r5)
            int r5 = r2.size()
            if (r5 <= 0) goto Laa
            java.lang.String r0 = "Start decoding  with detection"
            com.huawei.hms.scankit.p.o4.d(r15, r0)
            com.huawei.hms.scankit.p.s6 r0 = b(r2, r14, r4)
            com.huawei.hms.scankit.p.m1.i = r7
            goto L102
        Laa:
            java.lang.String r4 = "Start decoding  without detection"
            com.huawei.hms.scankit.p.o4.d(r15, r4)
            boolean r4 = com.huawei.hms.scankit.p.r3.c
            if (r4 != 0) goto Lbb
            boolean r4 = com.huawei.hms.scankit.p.r3.a
            if (r4 == 0) goto Lbb
            boolean r4 = com.huawei.hms.scankit.p.r3.b
            if (r4 == 0) goto L102
        Lbb:
            boolean r4 = a(r0)
            if (r4 == 0) goto Lcb
            int r4 = r10.size()
            if (r4 <= 0) goto Lcb
            com.huawei.hms.scankit.p.s6 r0 = r14.d(r10, r9)
        Lcb:
            boolean r4 = a(r0)
            if (r4 == 0) goto Ldf
            int r4 = r8.size()
            if (r4 <= 0) goto Ldf
            boolean r4 = com.huawei.hms.scankit.p.m1.h
            if (r4 == 0) goto Ldf
            com.huawei.hms.scankit.p.s6 r0 = r14.a(r8, r9)
        Ldf:
            boolean r4 = a(r0)
            if (r4 == 0) goto Lef
            int r4 = r13.size()
            if (r4 <= 0) goto Lef
            com.huawei.hms.scankit.p.s6 r0 = r14.b(r13, r9)
        Lef:
            boolean r4 = a(r0)
            if (r4 == 0) goto L102
            int r4 = r12.size()
            if (r4 <= 0) goto L102
            com.huawei.hms.scankit.p.s6 r0 = r14.b(r12, r9)
            goto L102
        L100:
            r17 = 0
        L102:
            java.lang.String r4 = "Decoding completed"
            com.huawei.hms.scankit.p.o4.d(r15, r4)
            boolean r4 = com.huawei.hms.scankit.p.m1.a
            if (r4 != 0) goto L115
            boolean r4 = com.huawei.hms.scankit.p.m1.b
            if (r4 == 0) goto L115
            boolean r4 = com.huawei.hms.scankit.p.m1.c
            if (r4 != 0) goto L115
            r4 = 1
            goto L116
        L115:
            r4 = 0
        L116:
            boolean r1 = r1.e
            if (r1 == 0) goto L128
            boolean r1 = a(r0)
            if (r1 == 0) goto L128
            if (r4 == 0) goto L128
            com.huawei.hms.scankit.p.s6 r0 = a(r6, r14)
            com.huawei.hms.scankit.p.m1.b = r17
        L128:
            boolean r1 = com.huawei.hms.scankit.p.r3.c
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r1 != 0) goto L19d
            boolean r1 = r14.b()
            int r5 = com.huawei.hms.scankit.p.r3.k
            int r5 = r5 - r7
            if (r5 <= 0) goto L138
            goto L139
        L138:
            r5 = 0
        L139:
            com.huawei.hms.scankit.p.r3.k = r5
            int r5 = r2.size()
            if (r5 <= 0) goto L14d
            if (r1 != 0) goto L14c
            boolean r1 = r14.b(r2)
            if (r1 == 0) goto L14a
            goto L14c
        L14a:
            r1 = 0
            goto L14d
        L14c:
            r1 = 1
        L14d:
            if (r1 == 0) goto L15e
            com.huawei.hms.scankit.p.p r5 = r14.a()
            float r5 = r14.c(r5)
            r6 = 1101004800(0x41a00000, float:20.0)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L15e
            r1 = 0
        L15e:
            float r5 = r14.e()
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L170
            float r5 = r14.e()
            float r5 = java.lang.Math.max(r4, r5)
            goto L180
        L170:
            float r5 = r14.c()
            float r6 = r14.d()
            float r5 = java.lang.Math.max(r5, r6)
            float r5 = java.lang.Math.max(r4, r5)
        L180:
            com.huawei.hms.scankit.p.s6 r9 = com.huawei.hms.scankit.p.n1.a(r2, r14)
            com.huawei.hms.scankit.p.s6 r6 = com.huawei.hms.scankit.p.n1.a(r14)
            int r8 = r2.size()
            if (r8 <= 0) goto L198
            boolean r8 = com.huawei.hms.scankit.p.n1.a(r2, r1)
            r31 = r9
            r9 = r6
            r6 = r31
            goto L1a2
        L198:
            r8 = r9
            r9 = r6
            r6 = r8
        L19b:
            r8 = 0
            goto L1a2
        L19d:
            r6 = r9
            r1 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L19b
        L1a2:
            if (r9 == 0) goto L1b1
            int r10 = r9.h()
            r11 = -2
            if (r10 != r11) goto L1b1
            int r10 = com.huawei.hms.scankit.p.m1.d
            int r10 = r10 + r7
            com.huawei.hms.scankit.p.m1.d = r10
            goto L1b3
        L1b1:
            com.huawei.hms.scankit.p.m1.d = r17
        L1b3:
            java.lang.String r10 = "end zoom and expose cal"
            com.huawei.hms.scankit.p.o4.d(r15, r10)
            if (r0 == 0) goto L1dd
            java.lang.String r10 = r0.k()
            if (r10 == 0) goto L1dd
            java.lang.String r1 = "ScanCode successful"
            com.huawei.hms.scankit.p.o4.d(r3, r1)
            com.huawei.hms.scankit.p.m1.d = r17
            long r1 = com.huawei.hms.scankit.p.m1.j
            r0.b(r1)
            long r1 = java.lang.System.currentTimeMillis()
            r0.a(r1)
            boolean r1 = com.huawei.hms.scankit.p.m1.i
            r0.a(r1)
            com.huawei.hms.scankit.p.s6[] r1 = new com.huawei.hms.scankit.p.s6[r7]
            r1[r17] = r0
            return r1
        L1dd:
            if (r1 == 0) goto L1f3
            java.lang.String r0 = "ScanCode need zoom"
            com.huawei.hms.scankit.p.o4.d(r3, r0)
            com.huawei.hms.scankit.p.s6 r0 = new com.huawei.hms.scankit.p.s6
            r0.<init>(r5)
            r0.c(r7)
            com.huawei.hms.scankit.p.m1.d = r17
            com.huawei.hms.scankit.p.s6[] r1 = new com.huawei.hms.scankit.p.s6[r7]
            r1[r17] = r0
            return r1
        L1f3:
            int r0 = r2.size()
            if (r0 <= 0) goto L207
            if (r6 == 0) goto L207
            java.lang.String r0 = "ScanCode need exposure"
            com.huawei.hms.scankit.p.o4.d(r3, r0)
            com.huawei.hms.scankit.p.m1.d = r17
            com.huawei.hms.scankit.p.s6[] r0 = new com.huawei.hms.scankit.p.s6[r7]
            r0[r17] = r6
            return r0
        L207:
            if (r9 == 0) goto L221
            int r0 = com.huawei.hms.scankit.p.m1.d
            r1 = 3
            if (r0 != r1) goto L221
            r9.b(r7)
            r0 = -1
            r9.a(r0)
            java.lang.String r0 = "ScanCode need globalexposure"
            com.huawei.hms.scankit.p.o4.d(r3, r0)
            com.huawei.hms.scankit.p.m1.d = r17
            com.huawei.hms.scankit.p.s6[] r0 = new com.huawei.hms.scankit.p.s6[r7]
            r0[r17] = r9
            return r0
        L221:
            if (r8 == 0) goto L255
            com.huawei.hms.scankit.p.s6 r0 = new com.huawei.hms.scankit.p.s6
            r0.<init>(r4, r7)
            com.huawei.hms.scankit.p.i2 r19 = new com.huawei.hms.scankit.p.i2
            float[] r1 = com.huawei.hms.scankit.p.r3.y
            r21 = r1[r17]
            r22 = r1[r7]
            r2 = r1[r16]
            float r23 = r2 - r21
            r18 = 3
            r1 = r1[r18]
            float r24 = r1 - r22
            r29 = 0
            r30 = 0
            r20 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r1 = r19
            r0.a(r1)
            com.huawei.hms.scankit.p.s6[] r1 = new com.huawei.hms.scankit.p.s6[r7]
            r1[r17] = r0
            return r1
        L255:
            java.lang.String r0 = "ScanCode null"
            com.huawei.hms.scankit.p.o4.d(r3, r0)
            r0 = 0
            com.huawei.hms.scankit.p.s6[] r0 = new com.huawei.hms.scankit.p.s6[r0]
            return r0
        L25e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "widthOrHeight is Illeagle"
            r0.<init>(r1)
            throw r0
    }

    public static com.huawei.hms.scankit.p.s6[] b(byte[] r17, com.huawei.hms.scankit.p.x6 r18) {
            java.lang.String r0 = "exception"
            java.lang.String r1 = "start decodeMultiCode"
            java.lang.String r2 = "scankit mul"
            com.huawei.hms.scankit.p.o4.b(r2, r1)
            r1 = 0
            com.huawei.hms.scankit.p.s6[] r3 = new com.huawei.hms.scankit.p.s6[r1]
            r4 = r17
            r5 = r18
            com.huawei.hms.scankit.p.s6[] r4 = a(r4, r5, r1)     // Catch: java.lang.OutOfMemoryError -> L6d java.lang.Exception -> L73 java.lang.UnsatisfiedLinkError -> L79 java.lang.UnsupportedOperationException -> L7f java.lang.IllegalArgumentException -> L85
            boolean r5 = com.huawei.hms.scankit.p.r3.g     // Catch: java.lang.OutOfMemoryError -> L6d java.lang.Exception -> L73 java.lang.UnsatisfiedLinkError -> L79 java.lang.UnsupportedOperationException -> L7f java.lang.IllegalArgumentException -> L85
            if (r5 == 0) goto L24
            int r5 = r4.length     // Catch: java.lang.OutOfMemoryError -> L6d java.lang.Exception -> L73 java.lang.UnsatisfiedLinkError -> L79 java.lang.UnsupportedOperationException -> L7f java.lang.IllegalArgumentException -> L85
            if (r5 <= 0) goto L24
            r5 = r4[r1]     // Catch: java.lang.OutOfMemoryError -> L6d java.lang.Exception -> L73 java.lang.UnsatisfiedLinkError -> L79 java.lang.UnsupportedOperationException -> L7f java.lang.IllegalArgumentException -> L85
            boolean r5 = r5.p()     // Catch: java.lang.OutOfMemoryError -> L6d java.lang.Exception -> L73 java.lang.UnsatisfiedLinkError -> L79 java.lang.UnsupportedOperationException -> L7f java.lang.IllegalArgumentException -> L85
            if (r5 == 0) goto L24
            return r4
        L24:
            int r5 = r4.length     // Catch: java.lang.OutOfMemoryError -> L6d java.lang.Exception -> L73 java.lang.UnsatisfiedLinkError -> L79 java.lang.UnsupportedOperationException -> L7f java.lang.IllegalArgumentException -> L85
            int[] r6 = new int[r5]     // Catch: java.lang.OutOfMemoryError -> L6d java.lang.Exception -> L73 java.lang.UnsatisfiedLinkError -> L79 java.lang.UnsupportedOperationException -> L7f java.lang.IllegalArgumentException -> L85
            r7 = 0
            r8 = 0
        L29:
            int r9 = r4.length     // Catch: java.lang.OutOfMemoryError -> L6d java.lang.Exception -> L73 java.lang.UnsatisfiedLinkError -> L79 java.lang.UnsupportedOperationException -> L7f java.lang.IllegalArgumentException -> L85
            r10 = 1
            if (r7 >= r9) goto L56
            int r9 = r7 + 1
            r11 = r9
        L30:
            int r12 = r4.length     // Catch: java.lang.OutOfMemoryError -> L6d java.lang.Exception -> L73 java.lang.UnsatisfiedLinkError -> L79 java.lang.UnsupportedOperationException -> L7f java.lang.IllegalArgumentException -> L85
            if (r11 >= r12) goto L54
            r12 = r4[r7]     // Catch: java.lang.OutOfMemoryError -> L6d java.lang.Exception -> L73 java.lang.UnsatisfiedLinkError -> L79 java.lang.UnsupportedOperationException -> L7f java.lang.IllegalArgumentException -> L85
            com.huawei.hms.scankit.p.u6[] r12 = r12.j()     // Catch: java.lang.OutOfMemoryError -> L6d java.lang.Exception -> L73 java.lang.UnsatisfiedLinkError -> L79 java.lang.UnsupportedOperationException -> L7f java.lang.IllegalArgumentException -> L85
            r13 = r4[r11]     // Catch: java.lang.OutOfMemoryError -> L6d java.lang.Exception -> L73 java.lang.UnsatisfiedLinkError -> L79 java.lang.UnsupportedOperationException -> L7f java.lang.IllegalArgumentException -> L85
            com.huawei.hms.scankit.p.u6[] r13 = r13.j()     // Catch: java.lang.OutOfMemoryError -> L6d java.lang.Exception -> L73 java.lang.UnsatisfiedLinkError -> L79 java.lang.UnsupportedOperationException -> L7f java.lang.IllegalArgumentException -> L85
            float r12 = com.huawei.hms.scankit.p.v7.a(r12, r13)     // Catch: java.lang.OutOfMemoryError -> L6d java.lang.Exception -> L73 java.lang.UnsatisfiedLinkError -> L79 java.lang.UnsupportedOperationException -> L7f java.lang.IllegalArgumentException -> L85
            double r12 = (double) r12     // Catch: java.lang.OutOfMemoryError -> L6d java.lang.Exception -> L73 java.lang.UnsatisfiedLinkError -> L79 java.lang.UnsupportedOperationException -> L7f java.lang.IllegalArgumentException -> L85
            r14 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 <= 0) goto L51
            r6[r11] = r10     // Catch: java.lang.OutOfMemoryError -> L6d java.lang.Exception -> L73 java.lang.UnsatisfiedLinkError -> L79 java.lang.UnsupportedOperationException -> L7f java.lang.IllegalArgumentException -> L85
            int r8 = r8 + 1
        L51:
            int r11 = r11 + 1
            goto L30
        L54:
            r7 = r9
            goto L29
        L56:
            int r7 = r4.length     // Catch: java.lang.OutOfMemoryError -> L6d java.lang.Exception -> L73 java.lang.UnsatisfiedLinkError -> L79 java.lang.UnsupportedOperationException -> L7f java.lang.IllegalArgumentException -> L85
            int r7 = r7 - r8
            com.huawei.hms.scankit.p.s6[] r3 = new com.huawei.hms.scankit.p.s6[r7]     // Catch: java.lang.OutOfMemoryError -> L6d java.lang.Exception -> L73 java.lang.UnsatisfiedLinkError -> L79 java.lang.UnsupportedOperationException -> L7f java.lang.IllegalArgumentException -> L85
        L5a:
            if (r1 >= r7) goto L8a
            r8 = r1
        L5d:
            if (r8 >= r5) goto L66
            r9 = r6[r8]     // Catch: java.lang.OutOfMemoryError -> L6d java.lang.Exception -> L73 java.lang.UnsatisfiedLinkError -> L79 java.lang.UnsupportedOperationException -> L7f java.lang.IllegalArgumentException -> L85
            if (r9 != r10) goto L66
            int r8 = r8 + 1
            goto L5d
        L66:
            r8 = r4[r8]     // Catch: java.lang.OutOfMemoryError -> L6d java.lang.Exception -> L73 java.lang.UnsatisfiedLinkError -> L79 java.lang.UnsupportedOperationException -> L7f java.lang.IllegalArgumentException -> L85
            r3[r1] = r8     // Catch: java.lang.OutOfMemoryError -> L6d java.lang.Exception -> L73 java.lang.UnsatisfiedLinkError -> L79 java.lang.UnsupportedOperationException -> L7f java.lang.IllegalArgumentException -> L85
            int r1 = r1 + 1
            goto L5a
        L6d:
            java.lang.String r1 = "OutOfMemoryError"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
            goto L8a
        L73:
            java.lang.String r1 = "Exception"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
            goto L8a
        L79:
            java.lang.String r1 = "UnsatisfiedLinkError"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
            goto L8a
        L7f:
            java.lang.String r1 = "UnsupportedArgumentException"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
            goto L8a
        L85:
            java.lang.String r1 = "IllegalArgumentException"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
        L8a:
            java.lang.String r0 = "end decodeMultiCode"
            com.huawei.hms.scankit.p.o4.b(r2, r0)
            return r3
    }

    public static com.huawei.hms.scankit.p.s6[] c(byte[] r3, com.huawei.hms.scankit.p.x6 r4) {
            java.lang.String r0 = "exception"
            r1 = 0
            com.huawei.hms.scankit.p.s6[] r1 = new com.huawei.hms.scankit.p.s6[r1]
            r2 = 1
            com.huawei.hms.scankit.p.s6[] r3 = a(r3, r4, r2)     // Catch: java.lang.OutOfMemoryError -> Lb java.lang.Exception -> L11 java.lang.UnsatisfiedLinkError -> L17 java.lang.UnsupportedOperationException -> L1d java.lang.IllegalArgumentException -> L23
            return r3
        Lb:
            java.lang.String r3 = "OutOfMemoryError"
            com.huawei.hms.scankit.p.o4.b(r0, r3)
            goto L28
        L11:
            java.lang.String r3 = "Exception"
            com.huawei.hms.scankit.p.o4.b(r0, r3)
            goto L28
        L17:
            java.lang.String r3 = "UnsatisfiedLinkError"
            com.huawei.hms.scankit.p.o4.b(r0, r3)
            goto L28
        L1d:
            java.lang.String r3 = "UnsupportedArgumentException"
            com.huawei.hms.scankit.p.o4.b(r0, r3)
            goto L28
        L23:
            java.lang.String r3 = "IllegalArgumentException"
            com.huawei.hms.scankit.p.o4.b(r0, r3)
        L28:
            return r1
    }
}
