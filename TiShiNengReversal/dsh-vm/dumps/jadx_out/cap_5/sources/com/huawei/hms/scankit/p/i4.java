package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class i4 extends com.huawei.hms.scankit.p.t6 {
    public i4() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.huawei.hms.scankit.p.t6
    public com.huawei.hms.ml.scan.HmsScan b(com.huawei.hms.scankit.p.s6 r13) {
            r12 = this;
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = r13.c()
            int r0 = com.huawei.hms.scankit.p.t6.a(r0)
            int r1 = com.huawei.hms.ml.scan.HmsScanBase.EAN13_SCAN_TYPE
            r2 = 0
            if (r0 == r1) goto Le
            return r2
        Le:
            java.lang.String r6 = com.huawei.hms.scankit.p.t6.a(r13)
            int r0 = r6.length()
            r1 = 13
            if (r0 == r1) goto L1b
            return r2
        L1b:
            java.lang.String r0 = "978"
            boolean r0 = r6.startsWith(r0)
            if (r0 != 0) goto L2c
            java.lang.String r0 = "979"
            boolean r0 = r6.startsWith(r0)
            if (r0 != 0) goto L2c
            return r2
        L2c:
            com.huawei.hms.ml.scan.HmsScan r3 = new com.huawei.hms.ml.scan.HmsScan
            java.lang.String r4 = r13.k()
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = r13.c()
            int r5 = com.huawei.hms.scankit.p.t6.a(r0)
            int r7 = com.huawei.hms.ml.scan.HmsScan.ISBN_NUMBER_FORM
            byte[] r8 = r13.i()
            com.huawei.hms.scankit.p.u6[] r13 = r13.j()
            android.graphics.Point[] r9 = com.huawei.hms.scankit.p.t6.a(r13)
            r10 = 0
            r11 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r3
    }
}
