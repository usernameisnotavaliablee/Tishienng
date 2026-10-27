package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class p6 {
    private final com.huawei.hms.scankit.p.o3 a;

    public p6(com.huawei.hms.scankit.p.o3 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private int[] a(com.huawei.hms.scankit.p.p3 r6) throws com.huawei.hms.scankit.p.a {
            r5 = this;
            int r0 = r6.b()
            r1 = 1
            if (r0 != r1) goto L10
            int r6 = r6.b(r1)
            int[] r6 = new int[]{r6}
            return r6
        L10:
            int[] r2 = new int[r0]
            r3 = 0
        L13:
            com.huawei.hms.scankit.p.o3 r4 = r5.a
            int r4 = r4.c()
            if (r1 >= r4) goto L30
            if (r3 >= r0) goto L30
            int r4 = r6.a(r1)
            if (r4 != 0) goto L2d
            com.huawei.hms.scankit.p.o3 r4 = r5.a
            int r4 = r4.b(r1)
            r2[r3] = r4
            int r3 = r3 + 1
        L2d:
            int r1 = r1 + 1
            goto L13
        L30:
            if (r3 != r0) goto L33
            return r2
        L33:
            java.lang.String r6 = "Error locator degree does not match number of roots"
            com.huawei.hms.scankit.p.a r6 = com.huawei.hms.scankit.p.a.a(r6)
            throw r6
    }

    private int[] a(com.huawei.hms.scankit.p.p3 r10, int[] r11) {
            r9 = this;
            int r0 = r11.length
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r0) goto L56
            com.huawei.hms.scankit.p.o3 r4 = r9.a
            r5 = r11[r3]
            int r4 = r4.b(r5)
            r5 = 1
            r6 = 0
        L11:
            if (r6 >= r0) goto L2f
            if (r3 == r6) goto L2c
            com.huawei.hms.scankit.p.o3 r7 = r9.a
            r8 = r11[r6]
            int r7 = r7.c(r8, r4)
            r8 = r7 & 1
            if (r8 != 0) goto L24
            r7 = r7 | 1
            goto L26
        L24:
            r7 = r7 & (-2)
        L26:
            com.huawei.hms.scankit.p.o3 r8 = r9.a
            int r5 = r8.c(r5, r7)
        L2c:
            int r6 = r6 + 1
            goto L11
        L2f:
            com.huawei.hms.scankit.p.o3 r6 = r9.a
            int r7 = r10.a(r4)
            com.huawei.hms.scankit.p.o3 r8 = r9.a
            int r5 = r8.b(r5)
            int r5 = r6.c(r7, r5)
            r1[r3] = r5
            com.huawei.hms.scankit.p.o3 r5 = r9.a
            int r5 = r5.a()
            if (r5 == 0) goto L53
            com.huawei.hms.scankit.p.o3 r5 = r9.a
            r6 = r1[r3]
            int r4 = r5.c(r6, r4)
            r1[r3] = r4
        L53:
            int r3 = r3 + 1
            goto L5
        L56:
            return r1
    }

    private com.huawei.hms.scankit.p.p3[] a(com.huawei.hms.scankit.p.p3 r9, com.huawei.hms.scankit.p.p3 r10, int r11) throws com.huawei.hms.scankit.p.a {
            r8 = this;
            int r0 = r9.b()
            int r1 = r10.b()
            if (r0 >= r1) goto Lb
            goto Le
        Lb:
            r7 = r10
            r10 = r9
            r9 = r7
        Le:
            com.huawei.hms.scankit.p.o3 r0 = r8.a
            com.huawei.hms.scankit.p.p3 r0 = r0.d()
            com.huawei.hms.scankit.p.o3 r1 = r8.a
            com.huawei.hms.scankit.p.p3 r1 = r1.b()
        L1a:
            r7 = r1
            r1 = r0
            r0 = r7
            int r2 = r9.b()
            r3 = 2
            int r4 = r11 / 2
            if (r2 < r4) goto L9f
            boolean r2 = r9.c()
            if (r2 != 0) goto L98
            com.huawei.hms.scankit.p.o3 r2 = r8.a
            com.huawei.hms.scankit.p.p3 r2 = r2.d()
            int r3 = r9.b()
            int r3 = r9.b(r3)
            com.huawei.hms.scankit.p.o3 r4 = r8.a
            int r3 = r4.b(r3)
        L40:
            int r4 = r10.b()
            int r5 = r9.b()
            if (r4 < r5) goto L7a
            boolean r4 = r10.c()
            if (r4 != 0) goto L7a
            int r4 = r10.b()
            int r5 = r9.b()
            int r4 = r4 - r5
            com.huawei.hms.scankit.p.o3 r5 = r8.a
            int r6 = r10.b()
            int r6 = r10.b(r6)
            int r5 = r5.c(r6, r3)
            com.huawei.hms.scankit.p.o3 r6 = r8.a
            com.huawei.hms.scankit.p.p3 r6 = r6.b(r4, r5)
            com.huawei.hms.scankit.p.p3 r2 = r2.a(r6)
            com.huawei.hms.scankit.p.p3 r4 = r9.a(r4, r5)
            com.huawei.hms.scankit.p.p3 r10 = r10.a(r4)
            goto L40
        L7a:
            com.huawei.hms.scankit.p.p3 r2 = r2.c(r0)
            com.huawei.hms.scankit.p.p3 r1 = r2.a(r1)
            int r2 = r10.b()
            int r3 = r9.b()
            if (r2 >= r3) goto L90
            r7 = r10
            r10 = r9
            r9 = r7
            goto L1a
        L90:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Division algorithm failed to reduce polynomial?"
            r9.<init>(r10)
            throw r9
        L98:
            java.lang.String r9 = "r_{i-1} was zero"
            com.huawei.hms.scankit.p.a r9 = com.huawei.hms.scankit.p.a.a(r9)
            throw r9
        L9f:
            r10 = 0
            int r11 = r0.b(r10)
            if (r11 == 0) goto Lbc
            com.huawei.hms.scankit.p.o3 r1 = r8.a
            int r11 = r1.b(r11)
            com.huawei.hms.scankit.p.p3 r0 = r0.c(r11)
            com.huawei.hms.scankit.p.p3 r9 = r9.c(r11)
            com.huawei.hms.scankit.p.p3[] r11 = new com.huawei.hms.scankit.p.p3[r3]
            r11[r10] = r0
            r10 = 1
            r11[r10] = r9
            return r11
        Lbc:
            java.lang.String r9 = "sigmaTilde(0) was zero"
            com.huawei.hms.scankit.p.a r9 = com.huawei.hms.scankit.p.a.a(r9)
            throw r9
    }

    public void a(int[] r9, int r10) throws com.huawei.hms.scankit.p.a {
            r8 = this;
            com.huawei.hms.scankit.p.p3 r0 = new com.huawei.hms.scankit.p.p3
            com.huawei.hms.scankit.p.o3 r1 = r8.a
            r0.<init>(r1, r9)
            int[] r1 = new int[r10]
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
        Ld:
            if (r4 >= r10) goto L29
            com.huawei.hms.scankit.p.o3 r6 = r8.a
            int r7 = r6.a()
            int r7 = r7 + r4
            int r6 = r6.a(r7)
            int r6 = r0.a(r6)
            int r7 = r10 + (-1)
            int r7 = r7 - r4
            r1[r7] = r6
            if (r6 == 0) goto L26
            r5 = 0
        L26:
            int r4 = r4 + 1
            goto Ld
        L29:
            if (r5 == 0) goto L2c
            goto L6d
        L2c:
            com.huawei.hms.scankit.p.p3 r0 = new com.huawei.hms.scankit.p.p3
            com.huawei.hms.scankit.p.o3 r4 = r8.a
            r0.<init>(r4, r1)
            com.huawei.hms.scankit.p.o3 r1 = r8.a
            com.huawei.hms.scankit.p.p3 r1 = r1.b(r10, r2)
            com.huawei.hms.scankit.p.p3[] r10 = r8.a(r1, r0, r10)
            r0 = r10[r3]
            r10 = r10[r2]
            int[] r0 = r8.a(r0)
            int[] r10 = r8.a(r10, r0)
        L49:
            int r1 = r0.length
            if (r3 >= r1) goto L6d
            int r1 = r9.length
            int r1 = r1 - r2
            com.huawei.hms.scankit.p.o3 r4 = r8.a
            r5 = r0[r3]
            int r4 = r4.c(r5)
            int r1 = r1 - r4
            if (r1 < 0) goto L66
            r4 = r9[r1]
            r5 = r10[r3]
            int r4 = com.huawei.hms.scankit.p.o3.a(r4, r5)
            r9[r1] = r4
            int r3 = r3 + 1
            goto L49
        L66:
            java.lang.String r9 = "Bad error location"
            com.huawei.hms.scankit.p.a r9 = com.huawei.hms.scankit.p.a.a(r9)
            throw r9
        L6d:
            return
    }
}
