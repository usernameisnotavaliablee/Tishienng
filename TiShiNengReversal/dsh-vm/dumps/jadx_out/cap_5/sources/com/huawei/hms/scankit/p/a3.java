package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a3 {
    private final com.huawei.hms.scankit.p.w4 a;

    public a3() {
            r1 = this;
            r1.<init>()
            com.huawei.hms.scankit.p.w4 r0 = com.huawei.hms.scankit.p.w4.f
            r1.a = r0
            return
    }

    private int[] a(com.huawei.hms.scankit.p.x4 r6) throws com.huawei.hms.scankit.p.a {
            r5 = this;
            int r0 = r6.a()
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 1
        L8:
            com.huawei.hms.scankit.p.w4 r4 = r5.a
            int r4 = r4.b()
            if (r3 >= r4) goto L25
            if (r2 >= r0) goto L25
            int r4 = r6.a(r3)
            if (r4 != 0) goto L22
            com.huawei.hms.scankit.p.w4 r4 = r5.a
            int r4 = r4.b(r3)
            r1[r2] = r4
            int r2 = r2 + 1
        L22:
            int r3 = r3 + 1
            goto L8
        L25:
            if (r2 != r0) goto L28
            return r1
        L28:
            com.huawei.hms.scankit.p.a r6 = com.huawei.hms.scankit.p.a.a()
            throw r6
    }

    private int[] a(com.huawei.hms.scankit.p.x4 r8, com.huawei.hms.scankit.p.x4 r9, int[] r10) {
            r7 = this;
            int r0 = r9.a()
            int[] r1 = new int[r0]
            r2 = 1
        L7:
            if (r2 > r0) goto L1a
            int r3 = r0 - r2
            com.huawei.hms.scankit.p.w4 r4 = r7.a
            int r5 = r9.b(r2)
            int r4 = r4.c(r2, r5)
            r1[r3] = r4
            int r2 = r2 + 1
            goto L7
        L1a:
            com.huawei.hms.scankit.p.x4 r9 = new com.huawei.hms.scankit.p.x4
            com.huawei.hms.scankit.p.w4 r0 = r7.a
            r9.<init>(r0, r1)
            int r0 = r10.length
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 0
        L26:
            if (r3 >= r0) goto L4f
            com.huawei.hms.scankit.p.w4 r4 = r7.a
            r5 = r10[r3]
            int r4 = r4.b(r5)
            com.huawei.hms.scankit.p.w4 r5 = r7.a
            int r6 = r8.a(r4)
            int r5 = r5.d(r2, r6)
            com.huawei.hms.scankit.p.w4 r6 = r7.a
            int r4 = r9.a(r4)
            int r4 = r6.b(r4)
            com.huawei.hms.scankit.p.w4 r6 = r7.a
            int r4 = r6.c(r5, r4)
            r1[r3] = r4
            int r3 = r3 + 1
            goto L26
        L4f:
            return r1
    }

    private com.huawei.hms.scankit.p.x4[] a(com.huawei.hms.scankit.p.x4 r9, com.huawei.hms.scankit.p.x4 r10, int r11) throws com.huawei.hms.scankit.p.a {
            r8 = this;
            int r0 = r9.a()
            int r1 = r10.a()
            if (r0 >= r1) goto Lb
            goto Le
        Lb:
            r7 = r10
            r10 = r9
            r9 = r7
        Le:
            com.huawei.hms.scankit.p.w4 r0 = r8.a
            com.huawei.hms.scankit.p.x4 r0 = r0.c()
            com.huawei.hms.scankit.p.w4 r1 = r8.a
            com.huawei.hms.scankit.p.x4 r1 = r1.a()
        L1a:
            r7 = r1
            r1 = r0
            r0 = r7
            int r2 = r9.a()
            r3 = 2
            int r4 = r11 / 2
            if (r2 < r4) goto L8f
            boolean r2 = r9.b()
            if (r2 != 0) goto L8a
            com.huawei.hms.scankit.p.w4 r2 = r8.a
            com.huawei.hms.scankit.p.x4 r2 = r2.c()
            int r3 = r9.a()
            int r3 = r9.b(r3)
            com.huawei.hms.scankit.p.w4 r4 = r8.a
            int r3 = r4.b(r3)
        L40:
            int r4 = r10.a()
            int r5 = r9.a()
            if (r4 < r5) goto L7a
            boolean r4 = r10.b()
            if (r4 != 0) goto L7a
            int r4 = r10.a()
            int r5 = r9.a()
            int r4 = r4 - r5
            com.huawei.hms.scankit.p.w4 r5 = r8.a
            int r6 = r10.a()
            int r6 = r10.b(r6)
            int r5 = r5.c(r6, r3)
            com.huawei.hms.scankit.p.w4 r6 = r8.a
            com.huawei.hms.scankit.p.x4 r6 = r6.b(r4, r5)
            com.huawei.hms.scankit.p.x4 r2 = r2.a(r6)
            com.huawei.hms.scankit.p.x4 r4 = r9.a(r4, r5)
            com.huawei.hms.scankit.p.x4 r10 = r10.c(r4)
            goto L40
        L7a:
            com.huawei.hms.scankit.p.x4 r2 = r2.b(r0)
            com.huawei.hms.scankit.p.x4 r1 = r2.c(r1)
            com.huawei.hms.scankit.p.x4 r1 = r1.c()
            r7 = r10
            r10 = r9
            r9 = r7
            goto L1a
        L8a:
            com.huawei.hms.scankit.p.a r9 = com.huawei.hms.scankit.p.a.a()
            throw r9
        L8f:
            r10 = 0
            int r11 = r0.b(r10)
            if (r11 == 0) goto Lac
            com.huawei.hms.scankit.p.w4 r1 = r8.a
            int r11 = r1.b(r11)
            com.huawei.hms.scankit.p.x4 r0 = r0.c(r11)
            com.huawei.hms.scankit.p.x4 r9 = r9.c(r11)
            com.huawei.hms.scankit.p.x4[] r11 = new com.huawei.hms.scankit.p.x4[r3]
            r11[r10] = r0
            r10 = 1
            r11[r10] = r9
            return r11
        Lac:
            com.huawei.hms.scankit.p.a r9 = com.huawei.hms.scankit.p.a.a()
            throw r9
    }

    public int a(int[] r10, int r11, int[] r12) throws com.huawei.hms.scankit.p.a {
            r9 = this;
            com.huawei.hms.scankit.p.x4 r0 = new com.huawei.hms.scankit.p.x4
            com.huawei.hms.scankit.p.w4 r1 = r9.a
            r0.<init>(r1, r10)
            int[] r1 = new int[r11]
            r2 = 0
            r3 = r11
            r4 = 0
        Lc:
            r5 = 1
            if (r3 <= 0) goto L23
            com.huawei.hms.scankit.p.w4 r6 = r9.a
            int r6 = r6.a(r3)
            int r6 = r0.a(r6)
            int r7 = r11 - r3
            r1[r7] = r6
            if (r6 == 0) goto L20
            r4 = 1
        L20:
            int r3 = r3 + (-1)
            goto Lc
        L23:
            if (r4 != 0) goto L26
            return r2
        L26:
            com.huawei.hms.scankit.p.w4 r0 = r9.a
            com.huawei.hms.scankit.p.x4 r0 = r0.a()
            if (r12 == 0) goto L53
            int r3 = r12.length
            r4 = 0
        L30:
            if (r4 >= r3) goto L53
            r6 = r12[r4]
            com.huawei.hms.scankit.p.w4 r7 = r9.a
            int r8 = r10.length
            int r8 = r8 - r5
            int r8 = r8 - r6
            int r6 = r7.a(r8)
            com.huawei.hms.scankit.p.x4 r7 = new com.huawei.hms.scankit.p.x4
            com.huawei.hms.scankit.p.w4 r8 = r9.a
            int r6 = r8.d(r2, r6)
            int[] r6 = new int[]{r6, r5}
            r7.<init>(r8, r6)
            com.huawei.hms.scankit.p.x4 r0 = r0.b(r7)
            int r4 = r4 + 1
            goto L30
        L53:
            com.huawei.hms.scankit.p.x4 r12 = new com.huawei.hms.scankit.p.x4
            com.huawei.hms.scankit.p.w4 r0 = r9.a
            r12.<init>(r0, r1)
            com.huawei.hms.scankit.p.w4 r0 = r9.a
            com.huawei.hms.scankit.p.x4 r0 = r0.b(r11, r5)
            com.huawei.hms.scankit.p.x4[] r11 = r9.a(r0, r12, r11)
            r12 = r11[r2]
            r11 = r11[r5]
            int[] r0 = r9.a(r12)
            int[] r11 = r9.a(r11, r12, r0)
        L70:
            int r12 = r0.length
            if (r2 >= r12) goto L94
            int r12 = r10.length
            int r12 = r12 - r5
            com.huawei.hms.scankit.p.w4 r1 = r9.a
            r3 = r0[r2]
            int r1 = r1.c(r3)
            int r12 = r12 - r1
            if (r12 < 0) goto L8f
            com.huawei.hms.scankit.p.w4 r1 = r9.a
            r3 = r10[r12]
            r4 = r11[r2]
            int r1 = r1.d(r3, r4)
            r10[r12] = r1
            int r2 = r2 + 1
            goto L70
        L8f:
            com.huawei.hms.scankit.p.a r10 = com.huawei.hms.scankit.p.a.a()
            throw r10
        L94:
            int r10 = r0.length
            return r10
    }
}
