package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class p {
    private final com.huawei.hms.scankit.p.o a;
    private com.huawei.hms.scankit.p.s b;

    public p(com.huawei.hms.scankit.p.o r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.a = r2
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Binarizer must be non-null."
            r2.<init>(r0)
            throw r2
    }

    private com.huawei.hms.scankit.p.r a(int r16, int r17, int[] r18, int[] r19, byte[] r20, int r21) {
            r15 = this;
            r0 = r16
            r1 = r17
            com.huawei.hms.scankit.p.r r2 = new com.huawei.hms.scankit.p.r
            r2.<init>(r1)
            r3 = 1
            r4 = 1
        Lb:
            if (r4 >= r1) goto L1f
            int r5 = r4 + (-1)
            r5 = r19[r5]
            r6 = r20[r4]
            r7 = r6 & 255(0xff, float:3.57E-43)
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r7 = r7 * r6
            int r5 = r5 + r7
            r19[r4] = r5
            int r4 = r4 + 1
            goto Lb
        L1f:
            int r4 = r21 + 1
            r5 = r4
        L22:
            int r6 = r1 - r21
            if (r5 >= r6) goto L62
            int r6 = r5 + r21
            r7 = r18[r6]
            int r8 = r5 - r21
            int r8 = r8 - r3
            r9 = r18[r8]
            int r7 = r7 - r9
            double r9 = (double) r7
            r6 = r19[r6]
            r7 = r19[r8]
            int r6 = r6 - r7
            double r6 = (double) r6
            double r11 = r9 * r9
            double r13 = (double) r0
            double r11 = r11 / r13
            double r6 = r6 - r11
            int r8 = r0 + (-1)
            double r11 = (double) r8
            double r6 = r6 / r11
            double r6 = java.lang.Math.sqrt(r6)
            double r9 = r9 / r13
            r8 = 1056964608(0x3f000000, float:0.5)
            double r11 = (double) r8
            r8 = 127(0x7f, float:1.78E-43)
            double r13 = (double) r8
            double r6 = r6 / r13
            double r11 = r11 * r6
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r11 = r11 + r6
            double r9 = r9 * r11
            r6 = r20[r5]
            r6 = r6 & 255(0xff, float:3.57E-43)
            double r6 = (double) r6
            int r8 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r8 > 0) goto L5f
            r2.g(r5)
        L5f:
            int r5 = r5 + 1
            goto L22
        L62:
            boolean r0 = r2.b(r4)
            if (r0 == 0) goto L6c
            r0 = 0
            r2.c(r0, r4)
        L6c:
            int r0 = r6 + (-1)
            boolean r0 = r2.b(r0)
            if (r0 == 0) goto L77
            r2.c(r6, r1)
        L77:
            return r2
    }

    public com.huawei.hms.scankit.p.o a() {
            r1 = this;
            com.huawei.hms.scankit.p.o r0 = r1.a
            return r0
    }

    public com.huawei.hms.scankit.p.p a(int r2, int r3, int r4, int r5) {
            r1 = this;
            com.huawei.hms.scankit.p.o r0 = r1.a
            com.huawei.hms.scankit.p.p4 r0 = r0.c()
            com.huawei.hms.scankit.p.p4 r2 = r0.a(r2, r3, r4, r5)
            com.huawei.hms.scankit.p.p r3 = new com.huawei.hms.scankit.p.p
            com.huawei.hms.scankit.p.o r4 = r1.a
            com.huawei.hms.scankit.p.o r2 = r4.a(r2)
            r3.<init>(r2)
            return r3
    }

    public com.huawei.hms.scankit.p.r a(int r10, int r11) throws com.huawei.hms.scankit.p.a {
            r9 = this;
            int r2 = r9.e()
            r0 = 45
            if (r2 < r0) goto L7b
            com.huawei.hms.scankit.p.r r1 = new com.huawei.hms.scankit.p.r
            r1.<init>(r2)
            byte[] r5 = new byte[r2]
            com.huawei.hms.scankit.p.o r3 = r9.a()
            com.huawei.hms.scankit.p.p4 r3 = r3.c()
            r3.a(r10, r5)
            int[] r3 = new int[r2]
            int[] r4 = new int[r2]
            r10 = 0
            r6 = r5[r10]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r3[r10] = r6
            int r6 = r6 * r6
            r4[r10] = r6
            r6 = 1
        L2a:
            if (r6 >= r2) goto L3a
            int r7 = r6 + (-1)
            r7 = r3[r7]
            r8 = r5[r6]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r7 = r7 + r8
            r3[r6] = r7
            int r6 = r6 + 1
            goto L2a
        L3a:
            if (r11 != 0) goto L71
            r11 = 23
            r4 = 23
        L40:
            int r6 = r2 + (-22)
            if (r4 >= r6) goto L5c
            r6 = r5[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 + 5
            int r7 = r4 + 22
            r7 = r3[r7]
            int r8 = r4 + (-23)
            r8 = r3[r8]
            int r7 = r7 - r8
            int r7 = r7 / r0
            if (r6 >= r7) goto L59
            r1.g(r4)
        L59:
            int r4 = r4 + 1
            goto L40
        L5c:
            boolean r0 = r1.b(r11)
            if (r0 == 0) goto L65
            r1.c(r10, r11)
        L65:
            int r10 = r2 + (-23)
            boolean r10 = r1.b(r10)
            if (r10 == 0) goto L70
            r1.c(r6, r2)
        L70:
            return r1
        L71:
            r1 = 45
            r6 = 22
            r0 = r9
            com.huawei.hms.scankit.p.r r10 = r0.a(r1, r2, r3, r4, r5, r6)
            return r10
        L7b:
            com.huawei.hms.scankit.p.a r10 = com.huawei.hms.scankit.p.a.a()
            throw r10
    }

    public com.huawei.hms.scankit.p.r a(int r2, com.huawei.hms.scankit.p.r r3) throws com.huawei.hms.scankit.p.a {
            r1 = this;
            com.huawei.hms.scankit.p.o r0 = r1.a
            com.huawei.hms.scankit.p.r r2 = r0.a(r2, r3)
            return r2
    }

    public void a(com.huawei.hms.scankit.p.s r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public com.huawei.hms.scankit.p.s b() throws com.huawei.hms.scankit.p.a {
            r1 = this;
            com.huawei.hms.scankit.p.s r0 = r1.b
            if (r0 != 0) goto Lc
            com.huawei.hms.scankit.p.o r0 = r1.a
            com.huawei.hms.scankit.p.s r0 = r0.a()
            r1.b = r0
        Lc:
            com.huawei.hms.scankit.p.s r0 = r1.b
            return r0
    }

    public int c() {
            r1 = this;
            com.huawei.hms.scankit.p.o r0 = r1.a
            int r0 = r0.b()
            return r0
    }

    public byte[] d() {
            r1 = this;
            com.huawei.hms.scankit.p.o r0 = r1.a
            com.huawei.hms.scankit.p.p4 r0 = r0.c()
            byte[] r0 = r0.b()
            return r0
    }

    public int e() {
            r1 = this;
            com.huawei.hms.scankit.p.o r0 = r1.a
            int r0 = r0.d()
            return r0
    }
}
