package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class j1 implements com.huawei.hms.scankit.p.l8 {
    public j1() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.huawei.hms.scankit.p.s a(com.huawei.hms.scankit.p.c0 r9, int r10, int r11, int r12) {
            int r0 = r9.c()
            int r1 = r9.b()
            int r12 = r12 * 2
            int r2 = r0 + r12
            int r12 = r12 + r1
            int r3 = java.lang.Math.max(r10, r2)
            int r4 = java.lang.Math.max(r11, r12)
            int r2 = r3 / r2
            int r12 = r4 / r12
            int r12 = java.lang.Math.min(r2, r12)
            int r2 = r0 * r12
            int r3 = r3 - r2
            int r3 = r3 / 2
            int r2 = r1 * r12
            int r4 = r4 - r2
            int r4 = r4 / 2
            r2 = 0
            if (r11 < r1) goto L33
            if (r10 >= r0) goto L2d
            goto L33
        L2d:
            com.huawei.hms.scankit.p.s r5 = new com.huawei.hms.scankit.p.s
            r5.<init>(r10, r11)
            goto L3a
        L33:
            com.huawei.hms.scankit.p.s r5 = new com.huawei.hms.scankit.p.s
            r5.<init>(r0, r1)
            r3 = 0
            r4 = 0
        L3a:
            r5.a()
            r10 = 0
        L3e:
            if (r10 >= r1) goto L56
            r6 = r3
            r11 = 0
        L42:
            if (r11 >= r0) goto L52
            byte r7 = r9.a(r11, r10)
            r8 = 1
            if (r7 != r8) goto L4e
            r5.a(r6, r4, r12, r12)
        L4e:
            int r11 = r11 + 1
            int r6 = r6 + r12
            goto L42
        L52:
            int r10 = r10 + 1
            int r4 = r4 + r12
            goto L3e
        L56:
            return r5
    }

    private static com.huawei.hms.scankit.p.s a(com.huawei.hms.scankit.p.y1 r12, com.huawei.hms.scankit.p.d7 r13, int r14, int r15, int r16) {
            int r0 = r13.f()
            int r1 = r13.e()
            com.huawei.hms.scankit.p.c0 r2 = new com.huawei.hms.scankit.p.c0
            int r3 = r13.h()
            int r4 = r13.g()
            r2.<init>(r3, r4)
            r3 = 0
            r4 = 0
            r5 = 0
        L18:
            if (r4 >= r1) goto L88
            int r6 = r13.e
            int r6 = r4 % r6
            r7 = 1
            if (r6 != 0) goto L39
            r6 = 0
            r8 = 0
        L23:
            int r9 = r13.h()
            if (r6 >= r9) goto L37
            int r9 = r6 % 2
            if (r9 != 0) goto L2f
            r9 = 1
            goto L30
        L2f:
            r9 = 0
        L30:
            r2.a(r8, r5, r9)
            int r8 = r8 + r7
            int r6 = r6 + 1
            goto L23
        L37:
            int r5 = r5 + 1
        L39:
            r6 = 0
            r8 = 0
        L3b:
            if (r6 >= r0) goto L69
            int r9 = r13.d
            int r9 = r6 % r9
            if (r9 != 0) goto L48
            r2.a(r8, r5, r7)
            int r8 = r8 + 1
        L48:
            boolean r9 = r12.a(r6, r4)
            r2.a(r8, r5, r9)
            int r9 = r8 + 1
            int r10 = r13.d
            int r11 = r6 % r10
            int r10 = r10 - r7
            if (r11 != r10) goto L65
            int r10 = r4 % 2
            if (r10 != 0) goto L5e
            r10 = 1
            goto L5f
        L5e:
            r10 = 0
        L5f:
            r2.a(r9, r5, r10)
            int r8 = r8 + 2
            goto L66
        L65:
            r8 = r9
        L66:
            int r6 = r6 + 1
            goto L3b
        L69:
            int r6 = r5 + 1
            int r8 = r13.e
            int r9 = r4 % r8
            int r8 = r8 - r7
            if (r9 != r8) goto L84
            r8 = 0
            r9 = 0
        L74:
            int r10 = r13.h()
            if (r8 >= r10) goto L81
            r2.a(r9, r6, r7)
            int r9 = r9 + r7
            int r8 = r8 + 1
            goto L74
        L81:
            int r5 = r5 + 2
            goto L85
        L84:
            r5 = r6
        L85:
            int r4 = r4 + 1
            goto L18
        L88:
            r6 = r16
            com.huawei.hms.scankit.p.s r12 = a(r2, r14, r15, r6)
            return r12
    }

    @Override // com.huawei.hms.scankit.p.l8
    public com.huawei.hms.scankit.p.s a(java.lang.String r6, com.huawei.hms.scankit.aiscan.common.BarcodeFormat r7, int r8, int r9, java.util.Map<com.huawei.hms.scankit.p.u2, ?> r10) {
            r5 = this;
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto Laa
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.f
            if (r7 != r0) goto L93
            if (r8 < 0) goto L74
            if (r9 < 0) goto L74
            com.huawei.hms.scankit.p.e7 r7 = com.huawei.hms.scankit.p.e7.b
            r0 = 0
            r1 = 4
            if (r10 == 0) goto L4d
            com.huawei.hms.scankit.p.u2 r2 = com.huawei.hms.scankit.p.u2.c
            java.lang.Object r2 = r10.get(r2)
            com.huawei.hms.scankit.p.e7 r2 = (com.huawei.hms.scankit.p.e7) r2
            if (r2 == 0) goto L1f
            r7 = r2
        L1f:
            com.huawei.hms.scankit.p.u2 r2 = com.huawei.hms.scankit.p.u2.d
            java.lang.Object r2 = r10.get(r2)
            com.huawei.hms.scankit.p.l2 r2 = (com.huawei.hms.scankit.p.l2) r2
            if (r2 == 0) goto L2a
            goto L2b
        L2a:
            r2 = r0
        L2b:
            com.huawei.hms.scankit.p.u2 r3 = com.huawei.hms.scankit.p.u2.e
            java.lang.Object r3 = r10.get(r3)
            com.huawei.hms.scankit.p.l2 r3 = (com.huawei.hms.scankit.p.l2) r3
            if (r3 == 0) goto L36
            r0 = r3
        L36:
            com.huawei.hms.scankit.p.u2 r3 = com.huawei.hms.scankit.p.u2.f
            boolean r4 = r10.containsKey(r3)
            if (r4 == 0) goto L4a
            java.lang.Object r10 = r10.get(r3)
            java.lang.String r10 = r10.toString()
            int r1 = java.lang.Integer.parseInt(r10)
        L4a:
            r10 = r0
            r0 = r2
            goto L4e
        L4d:
            r10 = r0
        L4e:
            java.lang.String r6 = com.huawei.hms.scankit.p.d4.a(r6, r7, r0, r10)
            int r2 = r6.length()
            r3 = 1
            com.huawei.hms.scankit.p.d7 r7 = com.huawei.hms.scankit.p.d7.a(r2, r7, r0, r10, r3)
            java.lang.String r6 = com.huawei.hms.scankit.p.z2.a(r6, r7)
            com.huawei.hms.scankit.p.y1 r10 = new com.huawei.hms.scankit.p.y1
            int r0 = r7.f()
            int r2 = r7.e()
            r10.<init>(r6, r0, r2)
            r10.a()
            com.huawei.hms.scankit.p.s r6 = a(r10, r7, r8, r9, r1)
            return r6
        L74:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "Requested dimensions can't be negative: "
            r7.append(r10)
            r7.append(r8)
            r8 = 120(0x78, float:1.68E-43)
            r7.append(r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L93:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Can only encode DATA_MATRIX, but got "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        Laa:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Found empty contents"
            r6.<init>(r7)
            throw r6
    }
}
