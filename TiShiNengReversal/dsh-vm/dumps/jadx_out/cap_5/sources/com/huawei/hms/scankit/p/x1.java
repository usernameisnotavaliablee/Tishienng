package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class x1 extends com.huawei.hms.scankit.p.s3 {
    public x1() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.huawei.hms.scankit.p.s3
    public com.huawei.hms.scankit.p.s a(com.huawei.hms.scankit.p.s r1, int r2, int r3, float r4, float r5, float r6, float r7, float r8, float r9, float r10, float r11, float r12, float r13, float r14, float r15, float r16, float r17, float r18, float r19) throws com.huawei.hms.scankit.p.a {
            r0 = this;
            com.huawei.hms.scankit.p.d6 r8 = com.huawei.hms.scankit.p.d6.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r9 = 0
            r4 = r0
            r5 = r1
            r6 = r2
            r7 = r3
            com.huawei.hms.scankit.p.s r1 = r4.a(r5, r6, r7, r8, r9)
            return r1
    }

    public com.huawei.hms.scankit.p.s a(com.huawei.hms.scankit.p.s r17, int r18, int r19, com.huawei.hms.scankit.p.d6 r20) throws com.huawei.hms.scankit.p.a {
            r16 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            if (r0 <= 0) goto La7
            if (r1 <= 0) goto La7
            com.huawei.hms.scankit.p.s r3 = new com.huawei.hms.scankit.p.s
            r3.<init>(r0, r1)
            r4 = 0
            r5 = 0
        L11:
            if (r5 >= r1) goto La6
            r6 = 0
        L14:
            if (r6 >= r0) goto L9f
            float r7 = (float) r6
            r8 = 1045220557(0x3e4ccccd, float:0.2)
            float r9 = r7 - r8
            r10 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 + r10
            float r11 = (float) r5
            float r12 = r11 + r10
            float r13 = r7 + r8
            float r13 = r13 + r10
            float r7 = r7 + r10
            float r14 = r11 - r8
            float r14 = r14 + r10
            float r11 = r11 + r8
            float r11 = r11 + r10
            r8 = 10
            float[] r8 = new float[r8]
            r8[r4] = r9
            r9 = 1
            r8[r9] = r12
            r9 = 2
            r8[r9] = r13
            r9 = 3
            r8[r9] = r12
            r10 = 4
            r8[r10] = r7
            r10 = 5
            r8[r10] = r14
            r13 = 6
            r8[r13] = r7
            r13 = 7
            r8[r13] = r11
            r11 = 8
            r8[r11] = r7
            r7 = 9
            r8[r7] = r12
            boolean r7 = com.huawei.hms.scankit.p.r3.p
            if (r7 == 0) goto L5a
            boolean r7 = com.huawei.hms.scankit.p.r3.m
            if (r7 == 0) goto L5a
            r2.b(r8)
            goto L5d
        L5a:
            r2.a(r8)
        L5d:
            int r7 = r17.e()
            int r11 = r17.c()
            r12 = 0
            r13 = 0
        L67:
            if (r12 >= r10) goto L8d
            int r14 = r12 * 2
            r15 = r8[r14]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L95
            int r15 = (int) r15     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L95
            int r14 = r14 + 1
            r14 = r8[r14]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L95
            int r14 = (int) r14     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L95
            r4 = -1
            if (r15 < r4) goto L7c
            if (r15 > r7) goto L7c
            if (r14 < r4) goto L7c
            if (r14 <= r11) goto L7f
        L7c:
            r4 = r17
            goto L89
        L7f:
            r4 = r17
            boolean r14 = r4.b(r15, r14)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L95
            if (r14 == 0) goto L89
            int r13 = r13 + 1
        L89:
            int r12 = r12 + 1
            r4 = 0
            goto L67
        L8d:
            r4 = r17
            if (r13 < r9) goto L9a
            r3.c(r6, r5)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L95
            goto L9a
        L95:
            com.huawei.hms.scankit.p.a r0 = com.huawei.hms.scankit.p.a.a()
            throw r0
        L9a:
            int r6 = r6 + 1
            r4 = 0
            goto L14
        L9f:
            r4 = r17
            int r5 = r5 + 1
            r4 = 0
            goto L11
        La6:
            return r3
        La7:
            com.huawei.hms.scankit.p.a r0 = com.huawei.hms.scankit.p.a.a()
            throw r0
    }

    @Override // com.huawei.hms.scankit.p.s3
    public com.huawei.hms.scankit.p.s a(com.huawei.hms.scankit.p.s r2, int r3, int r4, com.huawei.hms.scankit.p.d6 r5, boolean r6) throws com.huawei.hms.scankit.p.a {
            r1 = this;
            boolean r0 = com.huawei.hms.scankit.p.r3.n
            if (r0 == 0) goto L6
            if (r6 != 0) goto Le
        L6:
            if (r0 != 0) goto La
            if (r6 == 0) goto Le
        La:
            boolean r6 = com.huawei.hms.scankit.p.r3.u
            if (r6 == 0) goto L13
        Le:
            com.huawei.hms.scankit.p.s r2 = r1.b(r2, r3, r4, r5)
            return r2
        L13:
            com.huawei.hms.scankit.p.s r2 = r1.a(r2, r3, r4, r5)
            return r2
    }

    public com.huawei.hms.scankit.p.s b(com.huawei.hms.scankit.p.s r11, int r12, int r13, com.huawei.hms.scankit.p.d6 r14) throws com.huawei.hms.scankit.p.a {
            r10 = this;
            if (r12 <= 0) goto L6e
            if (r13 <= 0) goto L6e
            com.huawei.hms.scankit.p.s r0 = new com.huawei.hms.scankit.p.s
            r0.<init>(r12, r13)
            int r12 = r12 * 2
            float[] r1 = new float[r12]
            r2 = 0
            r3 = 0
        Lf:
            if (r3 >= r13) goto L6d
            float r4 = (float) r3
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r5
            r6 = 0
        L16:
            if (r6 >= r12) goto L25
            int r7 = r6 / 2
            float r7 = (float) r7
            float r7 = r7 + r5
            r1[r6] = r7
            int r7 = r6 + 1
            r1[r7] = r4
            int r6 = r6 + 2
            goto L16
        L25:
            boolean r4 = com.huawei.hms.scankit.p.r3.p
            if (r4 == 0) goto L31
            boolean r4 = com.huawei.hms.scankit.p.r3.m
            if (r4 == 0) goto L31
            r14.b(r1)
            goto L34
        L31:
            r14.a(r1)
        L34:
            int r4 = r11.e()
            int r5 = r11.c()
            r6 = 0
        L3d:
            if (r6 >= r12) goto L6a
            r7 = r1[r6]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L65
            int r7 = (int) r7     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L65
            int r8 = r6 + 1
            r8 = r1[r8]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L65
            int r8 = (int) r8     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L65
            r9 = -1
            if (r7 < r9) goto L5d
            if (r7 > r4) goto L5d
            if (r8 < r9) goto L5d
            if (r8 <= r5) goto L51
            goto L5d
        L51:
            boolean r7 = r11.b(r7, r8)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L65
            if (r7 == 0) goto L62
            int r7 = r6 / 2
            r0.c(r7, r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L65
            goto L62
        L5d:
            int r7 = r6 / 2
            r0.c(r7, r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L65
        L62:
            int r6 = r6 + 2
            goto L3d
        L65:
            com.huawei.hms.scankit.p.a r11 = com.huawei.hms.scankit.p.a.a()
            throw r11
        L6a:
            int r3 = r3 + 1
            goto Lf
        L6d:
            return r0
        L6e:
            com.huawei.hms.scankit.p.a r11 = com.huawei.hms.scankit.p.a.a()
            throw r11
    }
}
