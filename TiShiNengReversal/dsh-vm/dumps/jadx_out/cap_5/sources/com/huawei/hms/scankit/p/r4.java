package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class r4 {
    public r4() {
            r1 = this;
            r1.<init>()
            return
    }

    static int a(com.huawei.hms.scankit.p.c0 r2) {
            r0 = 1
            int r0 = a(r2, r0)
            r1 = 0
            int r2 = a(r2, r1)
            int r0 = r0 + r2
            return r0
    }

    private static int a(com.huawei.hms.scankit.p.c0 r10, boolean r11) {
            if (r11 == 0) goto L7
            int r0 = r10.b()
            goto Lb
        L7:
            int r0 = r10.c()
        Lb:
            if (r11 == 0) goto L12
            int r1 = r10.c()
            goto L16
        L12:
            int r1 = r10.b()
        L16:
            byte[][] r10 = r10.a()
            r2 = 0
            r3 = 0
            r4 = 0
        L1d:
            if (r3 >= r0) goto L48
            r5 = -1
            r6 = 0
            r7 = 0
        L22:
            r8 = 5
            if (r6 >= r1) goto L40
            if (r11 == 0) goto L2c
            r9 = r10[r3]
            r9 = r9[r6]
            goto L30
        L2c:
            r9 = r10[r6]
            r9 = r9[r3]
        L30:
            if (r9 != r5) goto L35
            int r7 = r7 + 1
            goto L3d
        L35:
            if (r7 < r8) goto L3a
            int r7 = r7 + (-2)
            int r4 = r4 + r7
        L3a:
            r5 = 1
            r5 = r9
            r7 = 1
        L3d:
            int r6 = r6 + 1
            goto L22
        L40:
            if (r7 < r8) goto L45
            int r7 = r7 + (-2)
            int r4 = r4 + r7
        L45:
            int r3 = r3 + 1
            goto L1d
        L48:
            return r4
    }

    static boolean a(int r1, int r2, int r3) {
            r0 = 1
            switch(r1) {
                case 0: goto L39;
                case 1: goto L3a;
                case 2: goto L41;
                case 3: goto L3d;
                case 4: goto L35;
                case 5: goto L2d;
                case 6: goto L25;
                case 7: goto L1b;
                default: goto L4;
            }
        L4:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Invalid mask pattern: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L1b:
            int r1 = r3 * r2
            int r1 = r1 % 3
            int r3 = r3 + r2
            r2 = r3 & 1
            int r1 = r1 + r2
        L23:
            r1 = r1 & r0
            goto L43
        L25:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
            goto L23
        L2d:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
            goto L43
        L35:
            int r3 = r3 / 2
            int r2 = r2 / 3
        L39:
            int r3 = r3 + r2
        L3a:
            r1 = r3 & 1
            goto L43
        L3d:
            int r3 = r3 + r2
            int r1 = r3 % 3
            goto L43
        L41:
            int r1 = r2 % 3
        L43:
            if (r1 != 0) goto L46
            return r0
        L46:
            r1 = 0
            return r1
    }

    private static boolean a(byte[] r3, int r4, int r5) {
            r0 = 0
            int r4 = java.lang.Math.max(r4, r0)
            int r1 = r3.length
            int r5 = java.lang.Math.min(r5, r1)
        La:
            r1 = 1
            if (r4 >= r5) goto L15
            r2 = r3[r4]
            if (r2 != r1) goto L12
            return r0
        L12:
            int r4 = r4 + 1
            goto La
        L15:
            return r1
    }

    private static boolean a(byte[][] r3, int r4, int r5, int r6) {
            r0 = 0
            int r5 = java.lang.Math.max(r5, r0)
            int r1 = r3.length
            int r6 = java.lang.Math.min(r6, r1)
        La:
            r1 = 1
            if (r5 >= r6) goto L1f
            int r2 = r3.length
            if (r5 >= r2) goto L1c
            r2 = r3[r0]
            int r2 = r2.length
            if (r4 >= r2) goto L1c
            r2 = r3[r5]
            r2 = r2[r4]
            if (r2 != r1) goto L1c
            return r0
        L1c:
            int r5 = r5 + 1
            goto La
        L1f:
            return r1
    }

    static int b(com.huawei.hms.scankit.p.c0 r10) {
            byte[][] r0 = r10.a()
            int r1 = r10.c()
            int r10 = r10.b()
            r2 = 0
            r3 = 0
            r4 = 0
        Lf:
            int r5 = r10 + (-1)
            if (r3 >= r5) goto L35
            r5 = r0[r3]
            r6 = 0
        L16:
            int r7 = r1 + (-1)
            if (r6 >= r7) goto L32
            r7 = r5[r6]
            int r8 = r6 + 1
            r9 = r5[r8]
            if (r7 != r9) goto L30
            int r9 = r3 + 1
            r9 = r0[r9]
            r6 = r9[r6]
            if (r7 != r6) goto L30
            r6 = r9[r8]
            if (r7 != r6) goto L30
            int r4 = r4 + 1
        L30:
            r6 = r8
            goto L16
        L32:
            int r3 = r3 + 1
            goto Lf
        L35:
            int r4 = r4 * 3
            return r4
    }

    static int c(com.huawei.hms.scankit.p.c0 r10) {
            byte[][] r0 = r10.a()
            int r1 = r10.c()
            int r10 = r10.b()
            r2 = 0
            r3 = 0
            r4 = 0
        Lf:
            if (r3 >= r10) goto La9
            r5 = 0
        L12:
            if (r5 >= r1) goto La5
            r6 = r0[r3]
            int r7 = r5 + 6
            r8 = 1
            if (r7 >= r1) goto L55
            r9 = r6[r5]
            if (r9 != r8) goto L55
            int r9 = r5 + 1
            r9 = r6[r9]
            if (r9 != 0) goto L55
            int r9 = r5 + 2
            r9 = r6[r9]
            if (r9 != r8) goto L55
            int r9 = r5 + 3
            r9 = r6[r9]
            if (r9 != r8) goto L55
            int r9 = r5 + 4
            r9 = r6[r9]
            if (r9 != r8) goto L55
            int r9 = r5 + 5
            r9 = r6[r9]
            if (r9 != 0) goto L55
            r7 = r6[r7]
            if (r7 != r8) goto L55
            int r7 = r5 + (-4)
            boolean r7 = a(r6, r7, r5)
            if (r7 != 0) goto L53
            int r7 = r5 + 7
            int r9 = r5 + 11
            boolean r6 = a(r6, r7, r9)
            if (r6 == 0) goto L55
        L53:
            int r4 = r4 + 1
        L55:
            int r6 = r3 + 6
            if (r6 >= r10) goto La1
            r7 = r0[r3]
            r7 = r7[r5]
            if (r7 != r8) goto La1
            int r7 = r3 + 1
            r7 = r0[r7]
            r7 = r7[r5]
            if (r7 != 0) goto La1
            int r7 = r3 + 2
            r7 = r0[r7]
            r7 = r7[r5]
            if (r7 != r8) goto La1
            int r7 = r3 + 3
            r7 = r0[r7]
            r7 = r7[r5]
            if (r7 != r8) goto La1
            int r7 = r3 + 4
            r7 = r0[r7]
            r7 = r7[r5]
            if (r7 != r8) goto La1
            int r7 = r3 + 5
            r7 = r0[r7]
            r7 = r7[r5]
            if (r7 != 0) goto La1
            r6 = r0[r6]
            r6 = r6[r5]
            if (r6 != r8) goto La1
            int r6 = r3 + (-4)
            boolean r6 = a(r0, r5, r6, r3)
            if (r6 != 0) goto L9f
            int r6 = r3 + 7
            int r7 = r3 + 11
            boolean r6 = a(r0, r5, r6, r7)
            if (r6 == 0) goto La1
        L9f:
            int r4 = r4 + 1
        La1:
            int r5 = r5 + 1
            goto L12
        La5:
            int r3 = r3 + 1
            goto Lf
        La9:
            int r4 = r4 * 40
            return r4
    }

    static int d(com.huawei.hms.scankit.p.c0 r10) {
            byte[][] r0 = r10.a()
            int r1 = r10.c()
            int r2 = r10.b()
            r3 = 0
            r4 = 0
            r5 = 0
        Lf:
            if (r4 >= r2) goto L23
            r6 = r0[r4]
            r7 = 0
        L14:
            if (r7 >= r1) goto L20
            r8 = r6[r7]
            r9 = 1
            if (r8 != r9) goto L1d
            int r5 = r5 + 1
        L1d:
            int r7 = r7 + 1
            goto L14
        L20:
            int r4 = r4 + 1
            goto Lf
        L23:
            int r0 = r10.b()
            int r10 = r10.c()
            int r0 = r0 * r10
            int r5 = r5 * 2
            int r5 = r5 - r0
            int r10 = java.lang.Math.abs(r5)
            int r10 = r10 * 10
            int r10 = r10 / r0
            int r10 = r10 * 10
            return r10
    }
}
