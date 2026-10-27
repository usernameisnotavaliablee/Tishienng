package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c2 {
    private static final int[] g = null;
    private final com.huawei.hms.scankit.p.s a;
    private boolean b;
    private int c;
    private int d;
    private int e;
    private int f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a {
        private final int a;
        private final int b;

        a(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        static /* synthetic */ int a(com.huawei.hms.scankit.p.c2.a r0) {
                int r0 = r0.a
                return r0
        }

        static /* synthetic */ int b(com.huawei.hms.scankit.p.c2.a r0) {
                int r0 = r0.b
                return r0
        }

        int a() {
                r1 = this;
                int r0 = r1.a
                return r0
        }

        int b() {
                r1 = this;
                int r0 = r1.b
                return r0
        }

        com.huawei.hms.scankit.p.u6 c() {
                r3 = this;
                com.huawei.hms.scankit.p.u6 r0 = new com.huawei.hms.scankit.p.u6
                int r1 = r3.a
                float r1 = (float) r1
                int r2 = r3.b
                float r2 = (float) r2
                r0.<init>(r1, r2)
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "<"
                r0.append(r1)
                int r1 = r2.a
                r0.append(r1)
                r1 = 32
                r0.append(r1)
                int r1 = r2.b
                r0.append(r1)
                r1 = 62
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            r0 = 2107(0x83b, float:2.953E-42)
            r1 = 1799(0x707, float:2.521E-42)
            r2 = 3808(0xee0, float:5.336E-42)
            r3 = 476(0x1dc, float:6.67E-43)
            int[] r0 = new int[]{r2, r3, r0, r1}
            com.huawei.hms.scankit.p.c2.g = r0
            return
    }

    public c2(com.huawei.hms.scankit.p.s r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private static float a(com.huawei.hms.scankit.p.c2.a r2, com.huawei.hms.scankit.p.c2.a r3) {
            int r0 = r2.a()
            int r2 = r2.b()
            int r1 = r3.a()
            int r3 = r3.b()
            float r2 = com.huawei.hms.scankit.p.s4.a(r0, r2, r1, r3)
            return r2
    }

    private static float a(com.huawei.hms.scankit.p.u6 r2, com.huawei.hms.scankit.p.u6 r3) {
            float r0 = r2.b()
            float r2 = r2.c()
            float r1 = r3.b()
            float r3 = r3.c()
            float r2 = com.huawei.hms.scankit.p.s4.a(r0, r2, r1, r3)
            return r2
    }

    private int a() {
            r3 = this;
            boolean r0 = r3.b
            r1 = 4
            if (r0 == 0) goto Lc
            int r0 = r3.c
            int r0 = r0 * 4
            int r0 = r0 + 11
            return r0
        Lc:
            int r0 = r3.c
            if (r0 > r1) goto L15
            int r0 = r0 * 4
            int r0 = r0 + 15
            return r0
        L15:
            int r2 = r0 * 4
            int r0 = r0 - r1
            int r0 = r0 / 8
            int r0 = r0 + 1
            int r0 = r0 * 2
            int r2 = r2 + r0
            int r2 = r2 + 15
            return r2
    }

    private static int a(long r5, boolean r7) throws com.huawei.hms.scankit.p.a {
            r0 = 4
            if (r7 == 0) goto L6
            r7 = 7
            r1 = 2
            goto L9
        L6:
            r7 = 10
            r1 = 4
        L9:
            int r2 = r7 - r1
            int[] r3 = new int[r7]
            int r7 = r7 + (-1)
        Lf:
            if (r7 < 0) goto L1a
            int r4 = (int) r5
            r4 = r4 & 15
            r3[r7] = r4
            long r5 = r5 >> r0
            int r7 = r7 + (-1)
            goto Lf
        L1a:
            com.huawei.hms.scankit.p.p6 r5 = new com.huawei.hms.scankit.p.p6     // Catch: com.huawei.hms.scankit.p.a -> L31
            com.huawei.hms.scankit.p.o3 r6 = com.huawei.hms.scankit.p.o3.k     // Catch: com.huawei.hms.scankit.p.a -> L31
            r5.<init>(r6)     // Catch: com.huawei.hms.scankit.p.a -> L31
            r5.a(r3, r2)     // Catch: com.huawei.hms.scankit.p.a -> L31
            r5 = 0
            r6 = 0
        L26:
            if (r5 >= r1) goto L30
            int r6 = r6 << 4
            r7 = r3[r5]
            int r6 = r6 + r7
            int r5 = r5 + 1
            goto L26
        L30:
            return r6
        L31:
            com.huawei.hms.scankit.p.a r5 = com.huawei.hms.scankit.p.a.a()
            throw r5
    }

    private int a(com.huawei.hms.scankit.p.u6 r8, com.huawei.hms.scankit.p.u6 r9, int r10) {
            r7 = this;
            float r0 = a(r8, r9)
            float r1 = (float) r10
            float r1 = r0 / r1
            float r2 = r8.b()
            float r3 = r8.c()
            float r4 = r9.b()
            float r5 = r8.b()
            float r4 = r4 - r5
            float r4 = r4 * r1
            float r4 = r4 / r0
            float r9 = r9.c()
            float r8 = r8.c()
            float r9 = r9 - r8
            float r1 = r1 * r9
            float r1 = r1 / r0
            r8 = 0
            r9 = 0
        L29:
            if (r8 >= r10) goto L4c
            com.huawei.hms.scankit.p.s r0 = r7.a
            float r5 = (float) r8
            float r6 = r5 * r4
            float r6 = r6 + r2
            int r6 = com.huawei.hms.scankit.p.s4.a(r6)
            float r5 = r5 * r1
            float r5 = r5 + r3
            int r5 = com.huawei.hms.scankit.p.s4.a(r5)
            boolean r0 = r0.b(r6, r5)
            if (r0 == 0) goto L49
            int r0 = r10 - r8
            r5 = 1
            int r0 = r0 - r5
            int r0 = r5 << r0
            r9 = r9 | r0
        L49:
            int r8 = r8 + 1
            goto L29
        L4c:
            return r9
    }

    private static int a(int[] r6, int r7) throws com.huawei.hms.scankit.p.a {
            int r0 = r6.length
            r1 = 0
            r2 = 0
            r3 = 0
        L4:
            r4 = 2
            if (r2 >= r0) goto L18
            r5 = r6[r2]
            int r4 = r7 + (-2)
            int r4 = r5 >> r4
            int r4 = r4 << 1
            r5 = r5 & 1
            int r4 = r4 + r5
            int r3 = r3 << 3
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L4
        L18:
            r6 = r3 & 1
            int r6 = r6 << 11
            int r7 = r3 >> 1
            int r6 = r6 + r7
        L1f:
            r7 = 4
            if (r1 >= r7) goto L31
            int[] r7 = com.huawei.hms.scankit.p.c2.g
            r7 = r7[r1]
            r7 = r7 ^ r6
            int r7 = java.lang.Integer.bitCount(r7)
            if (r7 > r4) goto L2e
            return r1
        L2e:
            int r1 = r1 + 1
            goto L1f
        L31:
            com.huawei.hms.scankit.p.a r6 = com.huawei.hms.scankit.p.a.a()
            throw r6
    }

    private com.huawei.hms.scankit.p.c2.a a(com.huawei.hms.scankit.p.c2.a r3, boolean r4, int r5, int r6) {
            r2 = this;
            int r0 = r3.a()
            int r0 = r0 + r5
            int r3 = r3.b()
        L9:
            int r3 = r3 + r6
            boolean r1 = r2.a(r0, r3)
            if (r1 == 0) goto L1a
            com.huawei.hms.scankit.p.s r1 = r2.a
            boolean r1 = r1.b(r0, r3)
            if (r1 != r4) goto L1a
            int r0 = r0 + r5
            goto L9
        L1a:
            int r0 = r0 - r5
            int r3 = r3 - r6
        L1c:
            boolean r1 = r2.a(r0, r3)
            if (r1 == 0) goto L2c
            com.huawei.hms.scankit.p.s r1 = r2.a
            boolean r1 = r1.b(r0, r3)
            if (r1 != r4) goto L2c
            int r0 = r0 + r5
            goto L1c
        L2c:
            int r0 = r0 - r5
        L2d:
            boolean r5 = r2.a(r0, r3)
            if (r5 == 0) goto L3d
            com.huawei.hms.scankit.p.s r5 = r2.a
            boolean r5 = r5.b(r0, r3)
            if (r5 != r4) goto L3d
            int r3 = r3 + r6
            goto L2d
        L3d:
            int r3 = r3 - r6
            com.huawei.hms.scankit.p.c2$a r4 = new com.huawei.hms.scankit.p.c2$a
            r4.<init>(r0, r3)
            return r4
    }

    private com.huawei.hms.scankit.p.s a(com.huawei.hms.scankit.p.s r22, com.huawei.hms.scankit.p.u6 r23, com.huawei.hms.scankit.p.u6 r24, com.huawei.hms.scankit.p.u6 r25, com.huawei.hms.scankit.p.u6 r26) throws com.huawei.hms.scankit.p.a {
            r21 = this;
            com.huawei.hms.scankit.p.s3 r1 = com.huawei.hms.scankit.p.s3.a()
            int r3 = r21.a()
            float r0 = (float) r3
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            r2 = r21
            int r4 = r2.e
            float r4 = (float) r4
            float r5 = r0 - r4
            float r7 = r0 + r4
            float r13 = r23.b()
            float r14 = r23.c()
            float r15 = r24.b()
            float r16 = r24.c()
            float r17 = r25.b()
            float r18 = r25.c()
            float r19 = r26.b()
            float r20 = r26.c()
            r4 = r3
            r6 = r5
            r8 = r5
            r9 = r7
            r10 = r7
            r11 = r5
            r12 = r7
            r2 = r22
            com.huawei.hms.scankit.p.s r0 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
    }

    private void a(com.huawei.hms.scankit.p.u6[] r9) throws com.huawei.hms.scankit.p.a {
            r8 = this;
            r0 = 0
            r1 = r9[r0]
            boolean r1 = r8.a(r1)
            if (r1 == 0) goto L9b
            r1 = 1
            r2 = r9[r1]
            boolean r2 = r8.a(r2)
            if (r2 == 0) goto L9b
            r2 = 2
            r3 = r9[r2]
            boolean r3 = r8.a(r3)
            if (r3 == 0) goto L9b
            r3 = 3
            r4 = r9[r3]
            boolean r4 = r8.a(r4)
            if (r4 == 0) goto L9b
            int r4 = r8.e
            int r4 = r4 * 2
            r5 = r9[r0]
            r6 = r9[r1]
            int r5 = r8.a(r5, r6, r4)
            r6 = r9[r1]
            r7 = r9[r2]
            int r6 = r8.a(r6, r7, r4)
            r2 = r9[r2]
            r7 = r9[r3]
            int r2 = r8.a(r2, r7, r4)
            r3 = r9[r3]
            r9 = r9[r0]
            int r9 = r8.a(r3, r9, r4)
            int[] r9 = new int[]{r5, r6, r2, r9}
            int r2 = a(r9, r4)
            r8.f = r2
            r2 = 0
        L54:
            r4 = 4
            if (r0 >= r4) goto L7b
            int r5 = r8.f
            int r5 = r5 + r0
            int r5 = r5 % r4
            r4 = r9[r5]
            boolean r5 = r8.b
            if (r5 == 0) goto L6a
            r5 = 7
            long r2 = r2 << r5
            int r4 = r4 >> 1
            r4 = r4 & 127(0x7f, float:1.78E-43)
            long r4 = (long) r4
        L68:
            long r2 = r2 + r4
            goto L78
        L6a:
            r5 = 10
            long r2 = r2 << r5
            int r5 = r4 >> 2
            r5 = r5 & 992(0x3e0, float:1.39E-42)
            int r4 = r4 >> 1
            r4 = r4 & 31
            int r5 = r5 + r4
            long r4 = (long) r5
            goto L68
        L78:
            int r0 = r0 + 1
            goto L54
        L7b:
            boolean r9 = r8.b
            int r9 = a(r2, r9)
            boolean r0 = r8.b
            if (r0 == 0) goto L90
            int r0 = r9 >> 6
            int r0 = r0 + r1
            r8.c = r0
            r9 = r9 & 63
            int r9 = r9 + r1
            r8.d = r9
            return
        L90:
            int r0 = r9 >> 11
            int r0 = r0 + r1
            r8.c = r0
            r9 = r9 & 2047(0x7ff, float:2.868E-42)
            int r9 = r9 + r1
            r8.d = r9
            return
        L9b:
            com.huawei.hms.scankit.p.a r9 = com.huawei.hms.scankit.p.a.a()
            throw r9
    }

    private boolean a(int r2, int r3) {
            r1 = this;
            if (r2 < 0) goto L16
            com.huawei.hms.scankit.p.s r0 = r1.a
            int r0 = r0.e()
            if (r2 >= r0) goto L16
            if (r3 <= 0) goto L16
            com.huawei.hms.scankit.p.s r2 = r1.a
            int r2 = r2.c()
            if (r3 >= r2) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    private boolean a(com.huawei.hms.scankit.p.c2.a r7, com.huawei.hms.scankit.p.c2.a r8, com.huawei.hms.scankit.p.c2.a r9, com.huawei.hms.scankit.p.c2.a r10) {
            r6 = this;
            int r0 = com.huawei.hms.scankit.p.c2.a.a(r7)
            int r1 = com.huawei.hms.scankit.p.c2.a.a(r8)
            int r0 = r0 + r1
            int r1 = com.huawei.hms.scankit.p.c2.a.a(r9)
            int r0 = r0 + r1
            int r1 = com.huawei.hms.scankit.p.c2.a.a(r10)
            int r0 = r0 + r1
            float r0 = (float) r0
            r1 = 1082130432(0x40800000, float:4.0)
            float r0 = r0 / r1
            int r2 = com.huawei.hms.scankit.p.c2.a.b(r7)
            int r3 = com.huawei.hms.scankit.p.c2.a.b(r8)
            int r2 = r2 + r3
            int r3 = com.huawei.hms.scankit.p.c2.a.b(r9)
            int r2 = r2 + r3
            int r3 = com.huawei.hms.scankit.p.c2.a.b(r10)
            int r2 = r2 + r3
            float r2 = (float) r2
            float r2 = r2 / r1
            com.huawei.hms.scankit.p.c2$a r1 = new com.huawei.hms.scankit.p.c2$a
            double r3 = (double) r0
            double r3 = java.lang.Math.ceil(r3)
            int r0 = (int) r3
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r1.<init>(r0, r2)
            float r7 = a(r1, r7)
            float r8 = a(r1, r8)
            float r9 = a(r1, r9)
            float r10 = a(r1, r10)
            float r8 = r7 / r8
            double r0 = (double) r8
            r2 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 <= 0) goto L73
            r4 = 4608308318706860032(0x3ff4000000000000, double:1.25)
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 >= 0) goto L73
            float r8 = r7 / r9
            double r8 = (double) r8
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 <= 0) goto L73
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 >= 0) goto L73
            float r7 = r7 / r10
            double r7 = (double) r7
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 <= 0) goto L73
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 >= 0) goto L73
            r7 = 1
            return r7
        L73:
            r7 = 0
            return r7
    }

    private boolean a(com.huawei.hms.scankit.p.u6 r2) {
            r1 = this;
            float r0 = r2.b()
            int r0 = com.huawei.hms.scankit.p.s4.a(r0)
            float r2 = r2.c()
            int r2 = com.huawei.hms.scankit.p.s4.a(r2)
            boolean r2 = r1.a(r0, r2)
            return r2
    }

    private com.huawei.hms.scankit.p.u6[] a(com.huawei.hms.scankit.p.c2.a r20) throws com.huawei.hms.scankit.p.a {
            r19 = this;
            r0 = r19
            r1 = 1
            r0.e = r1
            r2 = r20
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = 1
        Lb:
            int r7 = r0.e
            r8 = 9
            r9 = 7
            r10 = 5
            r11 = 2
            if (r7 >= r8) goto L6f
            r7 = -1
            com.huawei.hms.scankit.p.c2$a r8 = r0.a(r5, r6, r1, r7)
            com.huawei.hms.scankit.p.c2$a r12 = r0.a(r4, r6, r1, r1)
            com.huawei.hms.scankit.p.c2$a r13 = r0.a(r3, r6, r7, r1)
            com.huawei.hms.scankit.p.c2$a r7 = r0.a(r2, r6, r7, r7)
            int r14 = r0.e
            if (r14 <= r11) goto L5f
            float r14 = a(r7, r8)
            int r15 = r0.e
            float r15 = (float) r15
            float r14 = r14 * r15
            float r15 = a(r2, r5)
            r16 = 1
            int r1 = r0.e
            int r1 = r1 + r11
            float r1 = (float) r1
            float r15 = r15 * r1
            float r14 = r14 / r15
            double r14 = (double) r14
            r17 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            int r1 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r1 < 0) goto L71
            r17 = 4608308318706860032(0x3ff4000000000000, double:1.25)
            int r1 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r1 > 0) goto L71
            boolean r1 = r0.a(r8, r12, r13, r7)
            if (r1 == 0) goto L71
            boolean r1 = r0.b(r8, r12, r13, r7)
            if (r1 != 0) goto L61
            int r1 = r0.e
            if (r1 == r10) goto L71
            if (r1 != r9) goto L61
            goto L71
        L5f:
            r16 = 1
        L61:
            r6 = r6 ^ 1
            int r1 = r0.e
            int r1 = r1 + 1
            r0.e = r1
            r2 = r7
            r5 = r8
            r4 = r12
            r3 = r13
            r1 = 1
            goto Lb
        L6f:
            r16 = 1
        L71:
            int r1 = r0.e
            if (r1 == r10) goto L7d
            if (r1 != r9) goto L78
            goto L7d
        L78:
            com.huawei.hms.scankit.p.a r1 = com.huawei.hms.scankit.p.a.a()
            throw r1
        L7d:
            r6 = 0
            if (r1 != r10) goto L82
            r1 = 1
            goto L83
        L82:
            r1 = 0
        L83:
            r0.b = r1
            com.huawei.hms.scankit.p.u6 r1 = new com.huawei.hms.scankit.p.u6
            int r7 = r5.a()
            float r7 = (float) r7
            r8 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r8
            int r5 = r5.b()
            float r5 = (float) r5
            float r5 = r5 - r8
            r1.<init>(r7, r5)
            com.huawei.hms.scankit.p.u6 r5 = new com.huawei.hms.scankit.p.u6
            int r7 = r4.a()
            float r7 = (float) r7
            float r7 = r7 + r8
            int r4 = r4.b()
            float r4 = (float) r4
            float r4 = r4 + r8
            r5.<init>(r7, r4)
            com.huawei.hms.scankit.p.u6 r4 = new com.huawei.hms.scankit.p.u6
            int r7 = r3.a()
            float r7 = (float) r7
            float r7 = r7 - r8
            int r3 = r3.b()
            float r3 = (float) r3
            float r3 = r3 + r8
            r4.<init>(r7, r3)
            com.huawei.hms.scankit.p.u6 r3 = new com.huawei.hms.scankit.p.u6
            int r7 = r2.a()
            float r7 = (float) r7
            float r7 = r7 - r8
            int r2 = r2.b()
            float r2 = (float) r2
            float r2 = r2 - r8
            r3.<init>(r7, r2)
            r2 = 4
            com.huawei.hms.scankit.p.u6[] r2 = new com.huawei.hms.scankit.p.u6[r2]
            r2[r6] = r1
            r2[r16] = r5
            r2[r11] = r4
            r1 = 3
            r2[r1] = r3
            int r1 = r0.e
            int r1 = r1 * 2
            int r3 = r1 + (-3)
            com.huawei.hms.scankit.p.u6[] r1 = a(r2, r3, r1)
            return r1
    }

    private static com.huawei.hms.scankit.p.u6[] a(com.huawei.hms.scankit.p.u6[] r10, int r11, int r12) {
            float r12 = (float) r12
            float r11 = (float) r11
            r0 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 * r0
            float r12 = r12 / r11
            r11 = 0
            r1 = r10[r11]
            float r1 = r1.b()
            r2 = 2
            r3 = r10[r2]
            float r3 = r3.b()
            float r1 = r1 - r3
            r3 = r10[r11]
            float r3 = r3.c()
            r4 = r10[r2]
            float r4 = r4.c()
            float r3 = r3 - r4
            r4 = r10[r11]
            float r4 = r4.b()
            r5 = r10[r2]
            float r5 = r5.b()
            float r4 = r4 + r5
            float r4 = r4 / r0
            r5 = r10[r11]
            float r5 = r5.c()
            r6 = r10[r2]
            float r6 = r6.c()
            float r5 = r5 + r6
            float r5 = r5 / r0
            com.huawei.hms.scankit.p.u6 r6 = new com.huawei.hms.scankit.p.u6
            float r1 = r1 * r12
            float r7 = r4 + r1
            float r3 = r3 * r12
            float r8 = r5 + r3
            r6.<init>(r7, r8)
            com.huawei.hms.scankit.p.u6 r7 = new com.huawei.hms.scankit.p.u6
            float r4 = r4 - r1
            float r5 = r5 - r3
            r7.<init>(r4, r5)
            r1 = 1
            r3 = r10[r1]
            float r3 = r3.b()
            r4 = 3
            r5 = r10[r4]
            float r5 = r5.b()
            float r3 = r3 - r5
            r5 = r10[r1]
            float r5 = r5.c()
            r8 = r10[r4]
            float r8 = r8.c()
            float r5 = r5 - r8
            r8 = r10[r1]
            float r8 = r8.b()
            r9 = r10[r4]
            float r9 = r9.b()
            float r8 = r8 + r9
            float r8 = r8 / r0
            r9 = r10[r1]
            float r9 = r9.c()
            r10 = r10[r4]
            float r10 = r10.c()
            float r9 = r9 + r10
            float r9 = r9 / r0
            com.huawei.hms.scankit.p.u6 r10 = new com.huawei.hms.scankit.p.u6
            float r3 = r3 * r12
            float r0 = r8 + r3
            float r12 = r12 * r5
            float r5 = r9 + r12
            r10.<init>(r0, r5)
            com.huawei.hms.scankit.p.u6 r0 = new com.huawei.hms.scankit.p.u6
            float r8 = r8 - r3
            float r9 = r9 - r12
            r0.<init>(r8, r9)
            r12 = 4
            com.huawei.hms.scankit.p.u6[] r12 = new com.huawei.hms.scankit.p.u6[r12]
            r12[r11] = r6
            r12[r1] = r10
            r12[r2] = r7
            r12[r4] = r0
            return r12
    }

    private int b(com.huawei.hms.scankit.p.c2.a r12, com.huawei.hms.scankit.p.c2.a r13) {
            r11 = this;
            float r0 = a(r12, r13)
            int r1 = r13.a()
            int r2 = r12.a()
            int r1 = r1 - r2
            float r1 = (float) r1
            float r1 = r1 / r0
            int r13 = r13.b()
            int r2 = r12.b()
            int r13 = r13 - r2
            float r13 = (float) r13
            float r13 = r13 / r0
            int r2 = r12.a()
            float r2 = (float) r2
            int r3 = r12.b()
            float r3 = (float) r3
            com.huawei.hms.scankit.p.s r4 = r11.a
            int r5 = r12.a()
            int r12 = r12.b()
            boolean r12 = r4.b(r5, r12)
            double r4 = (double) r0
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
            r5 = 0
            r6 = 0
            r7 = 0
        L3b:
            if (r6 >= r4) goto L54
            float r2 = r2 + r1
            float r3 = r3 + r13
            com.huawei.hms.scankit.p.s r8 = r11.a
            int r9 = com.huawei.hms.scankit.p.s4.a(r2)
            int r10 = com.huawei.hms.scankit.p.s4.a(r3)
            boolean r8 = r8.b(r9, r10)
            if (r8 == r12) goto L51
            int r7 = r7 + 1
        L51:
            int r6 = r6 + 1
            goto L3b
        L54:
            float r13 = (float) r7
            float r13 = r13 / r0
            r0 = 1036831949(0x3dcccccd, float:0.1)
            int r1 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r1 <= 0) goto L65
            r1 = 1063675494(0x3f666666, float:0.9)
            int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r1 >= 0) goto L65
            return r5
        L65:
            r1 = 1
            int r13 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r13 > 0) goto L6b
            r5 = 1
        L6b:
            if (r5 != r12) goto L6e
            return r1
        L6e:
            r12 = -1
            return r12
    }

    private com.huawei.hms.scankit.p.c2.a b() {
            r12 = this;
            r0 = 3
            r1 = 2
            r2 = -1
            r3 = 1
            r4 = 0
            com.huawei.hms.scankit.p.j8 r5 = new com.huawei.hms.scankit.p.j8     // Catch: com.huawei.hms.scankit.p.a -> L19
            com.huawei.hms.scankit.p.s r6 = r12.a     // Catch: com.huawei.hms.scankit.p.a -> L19
            r5.<init>(r6)     // Catch: com.huawei.hms.scankit.p.a -> L19
            com.huawei.hms.scankit.p.u6[] r5 = r5.a()     // Catch: com.huawei.hms.scankit.p.a -> L19
            r6 = r5[r4]     // Catch: com.huawei.hms.scankit.p.a -> L19
            r7 = r5[r3]     // Catch: com.huawei.hms.scankit.p.a -> L19
            r8 = r5[r1]     // Catch: com.huawei.hms.scankit.p.a -> L19
            r5 = r5[r0]     // Catch: com.huawei.hms.scankit.p.a -> L19
            goto L67
        L19:
            com.huawei.hms.scankit.p.s r5 = r12.a
            int r5 = r5.e()
            int r5 = r5 / r1
            com.huawei.hms.scankit.p.s r6 = r12.a
            int r6 = r6.c()
            int r6 = r6 / r1
            com.huawei.hms.scankit.p.c2$a r7 = new com.huawei.hms.scankit.p.c2$a
            int r8 = r5 + 7
            int r9 = r6 + (-7)
            r7.<init>(r8, r9)
            com.huawei.hms.scankit.p.c2$a r7 = r12.a(r7, r4, r3, r2)
            com.huawei.hms.scankit.p.u6 r7 = r7.c()
            com.huawei.hms.scankit.p.c2$a r10 = new com.huawei.hms.scankit.p.c2$a
            int r6 = r6 + 7
            r10.<init>(r8, r6)
            com.huawei.hms.scankit.p.c2$a r8 = r12.a(r10, r4, r3, r3)
            com.huawei.hms.scankit.p.u6 r8 = r8.c()
            com.huawei.hms.scankit.p.c2$a r10 = new com.huawei.hms.scankit.p.c2$a
            int r5 = r5 + (-7)
            r10.<init>(r5, r6)
            com.huawei.hms.scankit.p.c2$a r6 = r12.a(r10, r4, r2, r3)
            com.huawei.hms.scankit.p.u6 r6 = r6.c()
            com.huawei.hms.scankit.p.c2$a r10 = new com.huawei.hms.scankit.p.c2$a
            r10.<init>(r5, r9)
            com.huawei.hms.scankit.p.c2$a r5 = r12.a(r10, r4, r2, r2)
            com.huawei.hms.scankit.p.u6 r5 = r5.c()
            r11 = r8
            r8 = r6
            r6 = r7
            r7 = r11
        L67:
            float r9 = r6.b()
            float r10 = r5.b()
            float r9 = r9 + r10
            float r10 = r7.b()
            float r9 = r9 + r10
            float r10 = r8.b()
            float r9 = r9 + r10
            r10 = 1082130432(0x40800000, float:4.0)
            float r9 = r9 / r10
            int r9 = com.huawei.hms.scankit.p.s4.a(r9)
            float r6 = r6.c()
            float r5 = r5.c()
            float r6 = r6 + r5
            float r5 = r7.c()
            float r6 = r6 + r5
            float r5 = r8.c()
            float r6 = r6 + r5
            float r6 = r6 / r10
            int r5 = com.huawei.hms.scankit.p.s4.a(r6)
            com.huawei.hms.scankit.p.j8 r6 = new com.huawei.hms.scankit.p.j8     // Catch: com.huawei.hms.scankit.p.a -> Laf
            com.huawei.hms.scankit.p.s r7 = r12.a     // Catch: com.huawei.hms.scankit.p.a -> Laf
            r8 = 15
            r6.<init>(r7, r8, r9, r5)     // Catch: com.huawei.hms.scankit.p.a -> Laf
            com.huawei.hms.scankit.p.u6[] r6 = r6.a()     // Catch: com.huawei.hms.scankit.p.a -> Laf
            r7 = r6[r4]     // Catch: com.huawei.hms.scankit.p.a -> Laf
            r8 = r6[r3]     // Catch: com.huawei.hms.scankit.p.a -> Laf
            r1 = r6[r1]     // Catch: com.huawei.hms.scankit.p.a -> Laf
            r0 = r6[r0]     // Catch: com.huawei.hms.scankit.p.a -> Laf
            goto Leb
        Laf:
            com.huawei.hms.scankit.p.c2$a r0 = new com.huawei.hms.scankit.p.c2$a
            int r1 = r9 + 7
            int r6 = r5 + (-7)
            r0.<init>(r1, r6)
            com.huawei.hms.scankit.p.c2$a r0 = r12.a(r0, r4, r3, r2)
            com.huawei.hms.scankit.p.u6 r7 = r0.c()
            com.huawei.hms.scankit.p.c2$a r0 = new com.huawei.hms.scankit.p.c2$a
            int r5 = r5 + 7
            r0.<init>(r1, r5)
            com.huawei.hms.scankit.p.c2$a r0 = r12.a(r0, r4, r3, r3)
            com.huawei.hms.scankit.p.u6 r8 = r0.c()
            com.huawei.hms.scankit.p.c2$a r0 = new com.huawei.hms.scankit.p.c2$a
            int r9 = r9 + (-7)
            r0.<init>(r9, r5)
            com.huawei.hms.scankit.p.c2$a r0 = r12.a(r0, r4, r2, r3)
            com.huawei.hms.scankit.p.u6 r1 = r0.c()
            com.huawei.hms.scankit.p.c2$a r0 = new com.huawei.hms.scankit.p.c2$a
            r0.<init>(r9, r6)
            com.huawei.hms.scankit.p.c2$a r0 = r12.a(r0, r4, r2, r2)
            com.huawei.hms.scankit.p.u6 r0 = r0.c()
        Leb:
            float r2 = r7.b()
            float r3 = r0.b()
            float r2 = r2 + r3
            float r3 = r8.b()
            float r2 = r2 + r3
            float r3 = r1.b()
            float r2 = r2 + r3
            float r2 = r2 / r10
            int r2 = com.huawei.hms.scankit.p.s4.a(r2)
            float r3 = r7.c()
            float r0 = r0.c()
            float r3 = r3 + r0
            float r0 = r8.c()
            float r3 = r3 + r0
            float r0 = r1.c()
            float r3 = r3 + r0
            float r3 = r3 / r10
            int r0 = com.huawei.hms.scankit.p.s4.a(r3)
            com.huawei.hms.scankit.p.c2$a r1 = new com.huawei.hms.scankit.p.c2$a
            r1.<init>(r2, r0)
            return r1
    }

    private boolean b(com.huawei.hms.scankit.p.c2.a r3, com.huawei.hms.scankit.p.c2.a r4, com.huawei.hms.scankit.p.c2.a r5, com.huawei.hms.scankit.p.c2.a r6) {
            r2 = this;
            com.huawei.hms.scankit.p.c2$a r0 = new com.huawei.hms.scankit.p.c2$a
            int r1 = r3.a()
            int r1 = r1 + (-3)
            int r3 = r3.b()
            int r3 = r3 + 3
            r0.<init>(r1, r3)
            com.huawei.hms.scankit.p.c2$a r3 = new com.huawei.hms.scankit.p.c2$a
            int r1 = r4.a()
            int r1 = r1 + (-3)
            int r4 = r4.b()
            int r4 = r4 + (-3)
            r3.<init>(r1, r4)
            com.huawei.hms.scankit.p.c2$a r4 = new com.huawei.hms.scankit.p.c2$a
            int r1 = r5.a()
            int r1 = r1 + 3
            int r5 = r5.b()
            int r5 = r5 + (-3)
            r4.<init>(r1, r5)
            com.huawei.hms.scankit.p.c2$a r5 = new com.huawei.hms.scankit.p.c2$a
            int r1 = r6.a()
            int r1 = r1 + 3
            int r6 = r6.b()
            int r6 = r6 + 3
            r5.<init>(r1, r6)
            int r6 = r2.b(r5, r0)
            r1 = 0
            if (r6 != 0) goto L4c
            return r1
        L4c:
            int r0 = r2.b(r0, r3)
            if (r0 == r6) goto L53
            return r1
        L53:
            int r3 = r2.b(r3, r4)
            if (r3 == r6) goto L5a
            return r1
        L5a:
            int r3 = r2.b(r4, r5)
            if (r3 != r6) goto L62
            r3 = 1
            return r3
        L62:
            return r1
    }

    private com.huawei.hms.scankit.p.u6[] b(com.huawei.hms.scankit.p.u6[] r3) {
            r2 = this;
            int r0 = r2.e
            int r0 = r0 * 2
            int r1 = r2.a()
            com.huawei.hms.scankit.p.u6[] r3 = a(r3, r0, r1)
            return r3
    }

    public com.huawei.hms.scankit.p.g a(boolean r14) throws com.huawei.hms.scankit.p.a {
            r13 = this;
            com.huawei.hms.scankit.p.c2$a r1 = r13.b()
            com.huawei.hms.scankit.p.u6[] r6 = r13.a(r1)
            if (r14 == 0) goto L14
            r1 = 0
            r2 = r6[r1]
            r3 = 2
            r4 = r6[r3]
            r6[r1] = r4
            r6[r3] = r2
        L14:
            r13.a(r6)
            com.huawei.hms.scankit.p.s r1 = r13.a
            int r2 = r13.f
            int r3 = r2 % 4
            r3 = r6[r3]
            int r4 = r2 + 1
            int r4 = r4 % 4
            r4 = r6[r4]
            int r5 = r2 + 2
            int r5 = r5 % 4
            r5 = r6[r5]
            int r2 = r2 + 3
            int r2 = r2 % 4
            r2 = r6[r2]
            r0 = r5
            r5 = r2
            r2 = r3
            r3 = r4
            r4 = r0
            r0 = r13
            com.huawei.hms.scankit.p.s r8 = r0.a(r1, r2, r3, r4, r5)
            com.huawei.hms.scankit.p.u6[] r9 = r13.b(r6)
            com.huawei.hms.scankit.p.g r7 = new com.huawei.hms.scankit.p.g
            boolean r10 = r13.b
            int r11 = r13.d
            int r12 = r13.c
            r7.<init>(r8, r9, r10, r11, r12)
            return r7
    }
}
