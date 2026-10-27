package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class g6 extends com.huawei.hms.scankit.p.t6 {
    private static final java.util.regex.Pattern b = null;

    static {
            java.lang.String r0 = "\\d+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.huawei.hms.scankit.p.g6.b = r0
            return
    }

    public g6() {
            r0 = this;
            r0.<init>()
            return
    }

    protected static boolean a(java.lang.CharSequence r1, int r2) {
            if (r1 == 0) goto L18
            if (r2 <= 0) goto L18
            int r0 = r1.length()
            if (r2 != r0) goto L18
            java.util.regex.Pattern r2 = com.huawei.hms.scankit.p.g6.b
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L18
            r1 = 1
            return r1
        L18:
            r1 = 0
            return r1
    }

    @Override // com.huawei.hms.scankit.p.t6
    public com.huawei.hms.ml.scan.HmsScan b(com.huawei.hms.scankit.p.s6 r13) {
            r12 = this;
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = r13.c()
            int r0 = com.huawei.hms.scankit.p.t6.a(r0)
            int r1 = com.huawei.hms.ml.scan.HmsScanBase.EAN13_SCAN_TYPE
            r2 = 0
            if (r0 == r1) goto L1a
            int r1 = com.huawei.hms.ml.scan.HmsScanBase.EAN8_SCAN_TYPE
            if (r0 == r1) goto L1a
            int r1 = com.huawei.hms.ml.scan.HmsScanBase.UPCCODE_A_SCAN_TYPE
            if (r0 == r1) goto L1a
            int r1 = com.huawei.hms.ml.scan.HmsScanBase.UPCCODE_E_SCAN_TYPE
            if (r0 == r1) goto L1a
            return r2
        L1a:
            java.lang.String r4 = com.huawei.hms.scankit.p.t6.a(r13)
            int r0 = r4.length()
            boolean r0 = a(r4, r0)
            if (r0 != 0) goto L29
            return r2
        L29:
            com.huawei.hms.ml.scan.HmsScan r3 = new com.huawei.hms.ml.scan.HmsScan
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = r13.c()
            int r5 = com.huawei.hms.scankit.p.t6.a(r0)
            int r7 = com.huawei.hms.ml.scan.HmsScan.ARTICLE_NUMBER_FORM
            byte[] r8 = r13.i()
            com.huawei.hms.scankit.p.u6[] r13 = r13.j()
            android.graphics.Point[] r9 = com.huawei.hms.scankit.p.t6.a(r13)
            r10 = 0
            r11 = 0
            r6 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r3
    }
}
