package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class o7 {
    private static final int[] c = null;
    private final int[] a;
    private final java.lang.StringBuilder b;

    static {
            r0 = 10
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [24, 20, 18, 17, 12, 6, 3, 10, 9, 5} // fill-array
            com.huawei.hms.scankit.p.o7.c = r0
            return
    }

    o7() {
            r1 = this;
            r1.<init>()
            r0 = 4
            int[] r0 = new int[r0]
            r1.a = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.b = r0
            return
    }

    private static int a(int r2) throws com.huawei.hms.scankit.p.a {
            r0 = 0
        L1:
            r1 = 10
            if (r0 >= r1) goto Lf
            int[] r1 = com.huawei.hms.scankit.p.o7.c
            r1 = r1[r0]
            if (r2 != r1) goto Lc
            return r0
        Lc:
            int r0 = r0 + 1
            goto L1
        Lf:
            com.huawei.hms.scankit.p.a r2 = com.huawei.hms.scankit.p.a.a()
            throw r2
    }

    private int a(com.huawei.hms.scankit.p.r r11, int[] r12, java.lang.StringBuilder r13) throws com.huawei.hms.scankit.p.a {
            r10 = this;
            int[] r0 = r10.a
            r1 = 0
            r0[r1] = r1
            r2 = 1
            r0[r2] = r1
            r3 = 2
            r0[r3] = r1
            r3 = 3
            r0[r3] = r1
            int r3 = r11.e()
            r12 = r12[r2]
            r4 = 0
            r5 = 0
        L16:
            r6 = 5
            if (r4 >= r6) goto L4a
            if (r12 >= r3) goto L4a
            int[][] r6 = com.huawei.hms.scankit.p.q7.g
            int r6 = com.huawei.hms.scankit.p.q7.a(r11, r0, r12, r6)
            int r7 = r6 % 10
            int r7 = r7 + 48
            char r7 = (char) r7
            r13.append(r7)
            int r7 = r0.length
            r8 = 0
        L2b:
            if (r8 >= r7) goto L33
            r9 = r0[r8]
            int r12 = r12 + r9
            int r8 = r8 + 1
            goto L2b
        L33:
            r7 = 10
            if (r6 < r7) goto L3c
            int r6 = 4 - r4
            int r6 = r2 << r6
            r5 = r5 | r6
        L3c:
            r6 = 4
            if (r4 == r6) goto L47
            int r12 = r11.c(r12)
            int r12 = r11.d(r12)
        L47:
            int r4 = r4 + 1
            goto L16
        L4a:
            int r11 = r13.length()
            if (r11 != r6) goto L64
            int r11 = a(r5)
            java.lang.String r13 = r13.toString()
            int r13 = a(r13)
            if (r13 != r11) goto L5f
            return r12
        L5f:
            com.huawei.hms.scankit.p.a r11 = com.huawei.hms.scankit.p.a.a()
            throw r11
        L64:
            com.huawei.hms.scankit.p.a r11 = com.huawei.hms.scankit.p.a.a()
            throw r11
    }

    private static int a(java.lang.CharSequence r4) {
            int r0 = r4.length()
            int r1 = r0 + (-2)
            r2 = 0
        L7:
            if (r1 < 0) goto L13
            char r3 = r4.charAt(r1)
            int r3 = r3 + (-48)
            int r2 = r2 + r3
            int r1 = r1 + (-2)
            goto L7
        L13:
            int r2 = r2 * 3
            int r0 = r0 + (-1)
        L17:
            if (r0 < 0) goto L23
            char r1 = r4.charAt(r0)
            int r1 = r1 + (-48)
            int r2 = r2 + r1
            int r0 = r0 + (-2)
            goto L17
        L23:
            int r2 = r2 * 3
            int r2 = r2 % 10
            return r2
    }

    com.huawei.hms.scankit.p.s6 a(int r7, com.huawei.hms.scankit.p.r r8, int[] r9) throws com.huawei.hms.scankit.p.a {
            r6 = this;
            java.lang.StringBuilder r0 = r6.b
            r1 = 0
            r0.setLength(r1)
            int r8 = r6.a(r8, r9, r0)
            java.lang.String r0 = r0.toString()
            com.huawei.hms.scankit.p.s6 r2 = new com.huawei.hms.scankit.p.s6
            com.huawei.hms.scankit.p.u6 r3 = new com.huawei.hms.scankit.p.u6
            r4 = r9[r1]
            r5 = 1
            r9 = r9[r5]
            int r4 = r4 + r9
            float r9 = (float) r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r4
            float r7 = (float) r7
            r3.<init>(r9, r7)
            com.huawei.hms.scankit.p.u6 r9 = new com.huawei.hms.scankit.p.u6
            float r8 = (float) r8
            r9.<init>(r8, r7)
            r7 = 2
            com.huawei.hms.scankit.p.u6[] r7 = new com.huawei.hms.scankit.p.u6[r7]
            r7[r1] = r3
            r7[r5] = r9
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r8 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.n
            r9 = 0
            r2.<init>(r0, r9, r7, r8)
            return r2
    }
}
