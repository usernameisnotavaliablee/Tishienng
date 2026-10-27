package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class i implements com.huawei.hms.scankit.p.l8 {
    public i() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.huawei.hms.scankit.p.s a(com.huawei.hms.scankit.p.f r8, int r9, int r10, int r11) {
            com.huawei.hms.scankit.p.s r8 = r8.a()
            if (r8 == 0) goto L4e
            int r0 = r8.e()
            int r1 = r8.c()
            int r11 = r11 * 2
            int r2 = r0 + r11
            int r11 = r11 + r1
            int r9 = java.lang.Math.max(r9, r2)
            int r10 = java.lang.Math.max(r10, r11)
            int r2 = r9 / r2
            int r11 = r10 / r11
            int r11 = java.lang.Math.min(r2, r11)
            int r2 = r0 * r11
            int r2 = r9 - r2
            int r2 = r2 / 2
            int r3 = r1 * r11
            int r3 = r10 - r3
            int r3 = r3 / 2
            com.huawei.hms.scankit.p.s r4 = new com.huawei.hms.scankit.p.s
            r4.<init>(r9, r10)
            r9 = 0
            r10 = 0
        L36:
            if (r10 >= r1) goto L4d
            r6 = r2
            r5 = 0
        L3a:
            if (r5 >= r0) goto L49
            boolean r7 = r8.b(r5, r10)
            if (r7 == 0) goto L45
            r4.a(r6, r3, r11, r11)
        L45:
            int r5 = r5 + 1
            int r6 = r6 + r11
            goto L3a
        L49:
            int r10 = r10 + 1
            int r3 = r3 + r11
            goto L36
        L4d:
            return r4
        L4e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
    }

    private static com.huawei.hms.scankit.p.s a(java.lang.String r1, com.huawei.hms.scankit.aiscan.common.BarcodeFormat r2, int r3, int r4, java.nio.charset.Charset r5, int r6, int r7, int r8) {
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.a
            if (r2 != r0) goto L11
            byte[] r1 = r1.getBytes(r5)
            com.huawei.hms.scankit.p.f r1 = com.huawei.hms.scankit.p.x2.a(r1, r6, r7)
            com.huawei.hms.scankit.p.s r1 = a(r1, r3, r4, r8)
            return r1
        L11:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Can only encode AZTEC, but got "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
    }

    @Override // com.huawei.hms.scankit.p.l8
    public com.huawei.hms.scankit.p.s a(java.lang.String r14, com.huawei.hms.scankit.aiscan.common.BarcodeFormat r15, int r16, int r17, java.util.Map<com.huawei.hms.scankit.p.u2, ?> r18) {
            r13 = this;
            r0 = r18
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.ISO_8859_1
            r2 = 33
            r3 = 0
            r4 = 4
            if (r0 == 0) goto L70
            com.huawei.hms.scankit.p.u2 r5 = com.huawei.hms.scankit.p.u2.b
            boolean r6 = r0.containsKey(r5)
            if (r6 == 0) goto L1e
            java.lang.Object r1 = r0.get(r5)
            java.lang.String r1 = r1.toString()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
        L1e:
            com.huawei.hms.scankit.p.u2 r5 = com.huawei.hms.scankit.p.u2.a
            boolean r6 = r0.containsKey(r5)
            if (r6 == 0) goto L32
            java.lang.Object r2 = r0.get(r5)
            java.lang.String r2 = r2.toString()
            int r2 = java.lang.Integer.parseInt(r2)
        L32:
            com.huawei.hms.scankit.p.u2 r5 = com.huawei.hms.scankit.p.u2.j
            boolean r6 = r0.containsKey(r5)
            if (r6 == 0) goto L46
            java.lang.Object r3 = r0.get(r5)
            java.lang.String r3 = r3.toString()
            int r3 = java.lang.Integer.parseInt(r3)
        L46:
            com.huawei.hms.scankit.p.u2 r5 = com.huawei.hms.scankit.p.u2.f
            boolean r6 = r0.containsKey(r5)
            if (r6 == 0) goto L65
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = r0.toString()
            int r4 = java.lang.Integer.parseInt(r0)
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            goto L7b
        L65:
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r1
            r10 = r2
            r11 = r3
        L6e:
            r12 = 4
            goto L7b
        L70:
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r1
            r10 = 33
            r11 = 0
            goto L6e
        L7b:
            com.huawei.hms.scankit.p.s r14 = a(r5, r6, r7, r8, r9, r10, r11, r12)
            return r14
    }
}
