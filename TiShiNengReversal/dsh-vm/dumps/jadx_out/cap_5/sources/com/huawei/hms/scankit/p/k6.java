package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class k6 implements com.huawei.hms.scankit.p.l8 {
    public k6() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.huawei.hms.scankit.p.s a(com.huawei.hms.scankit.p.h6 r8, int r9, int r10, int r11, boolean r12) {
            com.huawei.hms.scankit.p.c0 r8 = r8.a()
            if (r8 == 0) goto L66
            int r0 = r8.c()
            int r1 = r8.b()
            if (r12 == 0) goto L25
            int r9 = java.lang.Math.max(r9, r0)
            int r10 = java.lang.Math.max(r10, r1)
            int r11 = r11 * 2
            int r12 = r9 - r11
            int r12 = r12 / r0
            int r11 = r10 - r11
            int r11 = r11 / r1
            int r11 = java.lang.Math.min(r12, r11)
            goto L3a
        L25:
            int r11 = r11 * 2
            int r12 = r0 + r11
            int r11 = r11 + r1
            int r9 = java.lang.Math.max(r9, r12)
            int r10 = java.lang.Math.max(r10, r11)
            int r12 = r9 / r12
            int r11 = r10 / r11
            int r11 = java.lang.Math.min(r12, r11)
        L3a:
            int r12 = r0 * r11
            int r12 = r9 - r12
            int r12 = r12 / 2
            int r2 = r1 * r11
            int r2 = r10 - r2
            int r2 = r2 / 2
            com.huawei.hms.scankit.p.s r3 = new com.huawei.hms.scankit.p.s
            r3.<init>(r9, r10)
            r9 = 0
            r10 = 0
        L4d:
            if (r10 >= r1) goto L65
            r5 = r12
            r4 = 0
        L51:
            if (r4 >= r0) goto L61
            byte r6 = r8.a(r4, r10)
            r7 = 1
            if (r6 != r7) goto L5d
            r3.a(r5, r2, r11, r11)
        L5d:
            int r4 = r4 + 1
            int r5 = r5 + r11
            goto L51
        L61:
            int r10 = r10 + 1
            int r2 = r2 + r11
            goto L4d
        L65:
            return r3
        L66:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
    }

    @Override // com.huawei.hms.scankit.p.l8
    public com.huawei.hms.scankit.p.s a(java.lang.String r5, com.huawei.hms.scankit.aiscan.common.BarcodeFormat r6, int r7, int r8, java.util.Map<com.huawei.hms.scankit.p.u2, ?> r9) throws com.huawei.hms.hmsscankit.WriterException {
            r4 = this;
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L8e
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.k
            if (r6 != r0) goto L77
            if (r7 < 0) goto L58
            if (r8 < 0) goto L58
            com.huawei.hms.scankit.p.b3 r6 = com.huawei.hms.scankit.p.b3.b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1 = 4
            if (r9 == 0) goto L4b
            com.huawei.hms.scankit.p.u2 r2 = com.huawei.hms.scankit.p.u2.a
            boolean r3 = r9.containsKey(r2)
            if (r3 == 0) goto L29
            java.lang.Object r6 = r9.get(r2)
            java.lang.String r6 = r6.toString()
            com.huawei.hms.scankit.p.b3 r6 = com.huawei.hms.scankit.p.b3.valueOf(r6)
        L29:
            com.huawei.hms.scankit.p.u2 r2 = com.huawei.hms.scankit.p.u2.f
            boolean r3 = r9.containsKey(r2)
            if (r3 == 0) goto L3d
            java.lang.Object r1 = r9.get(r2)
            java.lang.String r1 = r1.toString()
            int r1 = java.lang.Integer.parseInt(r1)
        L3d:
            com.huawei.hms.scankit.p.u2 r2 = com.huawei.hms.scankit.p.u2.m
            boolean r3 = r9.containsKey(r2)
            if (r3 == 0) goto L4b
            java.lang.Object r0 = r9.get(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L4b:
            com.huawei.hms.scankit.p.h6 r5 = com.huawei.hms.scankit.p.w2.a(r5, r6, r9)
            boolean r6 = r0.booleanValue()
            com.huawei.hms.scankit.p.s r5 = a(r5, r7, r8, r1, r6)
            return r5
        L58:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "Requested dimensions are too small: "
            r6.append(r9)
            r6.append(r7)
            r7 = 120(0x78, float:1.68E-43)
            r6.append(r7)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L77:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Can only encode QR_CODE, but got "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        L8e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Found empty contents"
            r5.<init>(r6)
            throw r5
    }
}
