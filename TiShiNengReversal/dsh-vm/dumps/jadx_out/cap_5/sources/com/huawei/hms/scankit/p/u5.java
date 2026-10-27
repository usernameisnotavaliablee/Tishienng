package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class u5 implements com.huawei.hms.scankit.p.l8 {
    public u5() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.huawei.hms.scankit.p.s a(com.huawei.hms.scankit.p.l5 r1, java.lang.String r2, int r3, int r4, int r5, int r6) throws com.huawei.hms.hmsscankit.WriterException {
            r1.a(r2, r3)
            com.huawei.hms.scankit.p.j r2 = r1.a()
            r3 = 1
            r0 = 4
            byte[][] r2 = r2.a(r3, r0)
            r0 = 0
            r0 = r2[r0]
            int r0 = r0.length
            int r4 = r4 / r0
            int r0 = r2.length
            int r5 = r5 / r0
            if (r4 >= r5) goto L17
            goto L18
        L17:
            r4 = r5
        L18:
            if (r4 <= r3) goto L29
            com.huawei.hms.scankit.p.j r1 = r1.a()
            int r2 = r4 * 4
            byte[][] r1 = r1.a(r4, r2)
            com.huawei.hms.scankit.p.s r1 = a(r1, r6)
            return r1
        L29:
            com.huawei.hms.scankit.p.s r1 = a(r2, r6)
            return r1
    }

    private static com.huawei.hms.scankit.p.s a(byte[][] r8, int r9) {
            com.huawei.hms.scankit.p.s r0 = new com.huawei.hms.scankit.p.s
            r1 = 0
            r2 = r8[r1]
            int r2 = r2.length
            int r3 = r9 * 2
            int r2 = r2 + r3
            int r4 = r8.length
            int r4 = r4 + r3
            r0.<init>(r2, r4)
            r0.a()
            int r2 = r0.c()
            int r2 = r2 - r9
            r3 = 1
            int r2 = r2 - r3
            r4 = 0
        L19:
            int r5 = r8.length
            if (r4 >= r5) goto L35
            r5 = r8[r4]
            r6 = 0
        L1f:
            r7 = r8[r1]
            int r7 = r7.length
            if (r6 >= r7) goto L30
            r7 = r5[r6]
            if (r7 != r3) goto L2d
            int r7 = r6 + r9
            r0.c(r7, r2)
        L2d:
            int r6 = r6 + 1
            goto L1f
        L30:
            int r4 = r4 + 1
            int r2 = r2 + (-1)
            goto L19
        L35:
            return r0
    }

    @Override // com.huawei.hms.scankit.p.l8
    public com.huawei.hms.scankit.p.s a(java.lang.String r8, com.huawei.hms.scankit.aiscan.common.BarcodeFormat r9, int r10, int r11, java.util.Map<com.huawei.hms.scankit.p.u2, ?> r12) throws com.huawei.hms.hmsscankit.WriterException {
            r7 = this;
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.j
            if (r9 != r0) goto Laf
            com.huawei.hms.scankit.p.l5 r1 = new com.huawei.hms.scankit.p.l5
            r1.<init>()
            r9 = 30
            r0 = 2
            if (r12 == 0) goto La6
            com.huawei.hms.scankit.p.u2 r2 = com.huawei.hms.scankit.p.u2.g
            boolean r3 = r12.containsKey(r2)
            if (r3 == 0) goto L29
            java.lang.Object r2 = r12.get(r2)
            java.lang.String r2 = r2.toString()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r2.booleanValue()
            r1.a(r2)
        L29:
            com.huawei.hms.scankit.p.u2 r2 = com.huawei.hms.scankit.p.u2.h
            boolean r3 = r12.containsKey(r2)
            if (r3 == 0) goto L40
            java.lang.Object r2 = r12.get(r2)
            java.lang.String r2 = r2.toString()
            com.huawei.hms.scankit.p.y0 r2 = com.huawei.hms.scankit.p.y0.valueOf(r2)
            r1.a(r2)
        L40:
            com.huawei.hms.scankit.p.u2 r2 = com.huawei.hms.scankit.p.u2.i
            boolean r3 = r12.containsKey(r2)
            if (r3 == 0) goto L61
            java.lang.Object r2 = r12.get(r2)
            com.huawei.hms.scankit.p.m2 r2 = (com.huawei.hms.scankit.p.m2) r2
            int r3 = r2.a()
            int r4 = r2.c()
            int r5 = r2.b()
            int r2 = r2.d()
            r1.b(r3, r4, r5, r2)
        L61:
            com.huawei.hms.scankit.p.u2 r2 = com.huawei.hms.scankit.p.u2.f
            boolean r3 = r12.containsKey(r2)
            if (r3 == 0) goto L75
            java.lang.Object r9 = r12.get(r2)
            java.lang.String r9 = r9.toString()
            int r9 = java.lang.Integer.parseInt(r9)
        L75:
            com.huawei.hms.scankit.p.u2 r2 = com.huawei.hms.scankit.p.u2.a
            boolean r3 = r12.containsKey(r2)
            if (r3 == 0) goto L89
            java.lang.Object r0 = r12.get(r2)
            java.lang.String r0 = r0.toString()
            int r0 = java.lang.Integer.parseInt(r0)
        L89:
            com.huawei.hms.scankit.p.u2 r2 = com.huawei.hms.scankit.p.u2.b
            boolean r3 = r12.containsKey(r2)
            if (r3 == 0) goto La0
            java.lang.Object r12 = r12.get(r2)
            java.lang.String r12 = r12.toString()
            java.nio.charset.Charset r12 = java.nio.charset.Charset.forName(r12)
            r1.a(r12)
        La0:
            r6 = r9
            r3 = r0
        La2:
            r2 = r8
            r4 = r10
            r5 = r11
            goto Laa
        La6:
            r3 = 2
            r6 = 30
            goto La2
        Laa:
            com.huawei.hms.scankit.p.s r8 = a(r1, r2, r3, r4, r5, r6)
            return r8
        Laf:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Can only encode PDF_417, but got "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
    }
}
