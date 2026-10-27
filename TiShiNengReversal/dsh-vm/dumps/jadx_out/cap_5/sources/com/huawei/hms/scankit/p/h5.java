package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class h5 implements com.huawei.hms.scankit.p.l8 {
    public h5() {
            r0 = this;
            r0.<init>()
            return
    }

    protected static int a(boolean[] r7, int r8, int[] r9, boolean r10) {
            int r0 = r9.length
            r1 = 0
            r2 = 0
            r3 = 0
        L4:
            if (r2 >= r0) goto L19
            r4 = r9[r2]
            r5 = 0
        L9:
            if (r5 >= r4) goto L13
            int r6 = r8 + 1
            r7[r8] = r10
            int r5 = r5 + 1
            r8 = r6
            goto L9
        L13:
            int r3 = r3 + r4
            r10 = r10 ^ 1
            int r2 = r2 + 1
            goto L4
        L19:
            return r3
    }

    private static com.huawei.hms.scankit.p.s a(boolean[] r5, int r6, int r7, int r8) {
            int r0 = r5.length
            int r8 = r8 + r0
            int r6 = java.lang.Math.max(r6, r8)
            r1 = 1
            int r7 = java.lang.Math.max(r1, r7)
            int r8 = r6 / r8
            int r1 = r0 * r8
            int r1 = r6 - r1
            int r1 = r1 / 2
            com.huawei.hms.scankit.p.s r2 = new com.huawei.hms.scankit.p.s
            r2.<init>(r6, r7)
            r6 = 0
            r3 = 0
        L1a:
            if (r3 >= r0) goto L27
            boolean r4 = r5[r3]
            if (r4 == 0) goto L23
            r2.a(r1, r6, r8, r7)
        L23:
            int r3 = r3 + 1
            int r1 = r1 + r8
            goto L1a
        L27:
            return r2
    }

    public int a() {
            r1 = this;
            r0 = 10
            return r0
    }

    @Override // com.huawei.hms.scankit.p.l8
    public com.huawei.hms.scankit.p.s a(java.lang.String r3, com.huawei.hms.scankit.aiscan.common.BarcodeFormat r4, int r5, int r6, java.util.Map<com.huawei.hms.scankit.p.u2, ?> r7) throws com.huawei.hms.hmsscankit.WriterException {
            r2 = this;
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L55
            if (r5 < 0) goto L36
            if (r6 < 0) goto L36
            int r4 = r2.a()
            if (r7 == 0) goto L2d
            com.huawei.hms.scankit.p.u2 r0 = com.huawei.hms.scankit.p.u2.f
            boolean r1 = r7.containsKey(r0)
            if (r1 == 0) goto L2d
            java.lang.Object r4 = r7.get(r0)     // Catch: java.lang.NumberFormatException -> L25
            java.lang.String r4 = r4.toString()     // Catch: java.lang.NumberFormatException -> L25
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L25
            goto L2d
        L25:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "EncodeHintType MARGIN can not format integer"
            r3.<init>(r4)
            throw r3
        L2d:
            boolean[] r3 = r2.a(r3)
            com.huawei.hms.scankit.p.s r3 = a(r3, r5, r6, r4)
            return r3
        L36:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "Negative size is not allowed. Input: "
            r4.append(r7)
            r4.append(r5)
            r5 = 120(0x78, float:1.68E-43)
            r4.append(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L55:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Found empty contents"
            r3.<init>(r4)
            throw r3
    }

    public abstract boolean[] a(java.lang.String r1);
}
