package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class n7 {
    private final int[] a;
    private final java.lang.StringBuilder b;

    n7() {
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

    private int a(com.huawei.hms.scankit.p.r r12, int[] r13, java.lang.StringBuilder r14) throws com.huawei.hms.scankit.p.a {
            r11 = this;
            int[] r0 = r11.a
            r1 = 0
            r0[r1] = r1
            r2 = 1
            r0[r2] = r1
            r3 = 2
            r0[r3] = r1
            r4 = 3
            r0[r4] = r1
            int r4 = r12.e()
            r13 = r13[r2]
            r5 = 0
            r6 = 0
        L16:
            if (r5 >= r3) goto L48
            if (r13 >= r4) goto L48
            int[][] r7 = com.huawei.hms.scankit.p.q7.g
            int r7 = com.huawei.hms.scankit.p.q7.a(r12, r0, r13, r7)
            int r8 = r7 % 10
            int r8 = r8 + 48
            char r8 = (char) r8
            r14.append(r8)
            int r8 = r0.length
            r9 = 0
        L2a:
            if (r9 >= r8) goto L32
            r10 = r0[r9]
            int r13 = r13 + r10
            int r9 = r9 + 1
            goto L2a
        L32:
            r8 = 10
            if (r7 < r8) goto L3b
            int r7 = 1 - r5
            int r7 = r2 << r7
            r6 = r6 | r7
        L3b:
            if (r5 == r2) goto L45
            int r13 = r12.c(r13)
            int r13 = r12.d(r13)
        L45:
            int r5 = r5 + 1
            goto L16
        L48:
            int r12 = r14.length()
            if (r12 != r3) goto L65
            java.lang.String r12 = r14.toString()     // Catch: java.lang.NumberFormatException -> L60
            int r12 = java.lang.Integer.parseInt(r12)     // Catch: java.lang.NumberFormatException -> L60
            int r12 = r12 % 4
            if (r12 != r6) goto L5b
            return r13
        L5b:
            com.huawei.hms.scankit.p.a r12 = com.huawei.hms.scankit.p.a.a()     // Catch: java.lang.NumberFormatException -> L60
            throw r12     // Catch: java.lang.NumberFormatException -> L60
        L60:
            com.huawei.hms.scankit.p.a r12 = com.huawei.hms.scankit.p.a.a()
            throw r12
        L65:
            com.huawei.hms.scankit.p.a r12 = com.huawei.hms.scankit.p.a.a()
            throw r12
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
