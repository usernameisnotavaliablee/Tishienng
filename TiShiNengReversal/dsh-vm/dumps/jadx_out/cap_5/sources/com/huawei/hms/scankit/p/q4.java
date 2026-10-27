package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class q4 extends com.huawei.hms.scankit.p.t6 {
    private static final java.util.regex.Pattern b = null;

    static {
            java.lang.String r0 = "market://[\\s\\S]*"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            com.huawei.hms.scankit.p.q4.b = r0
            return
    }

    public q4() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.huawei.hms.scankit.p.t6
    public com.huawei.hms.ml.scan.HmsScan b(com.huawei.hms.scankit.p.s6 r10) {
            r9 = this;
            java.lang.String r3 = com.huawei.hms.scankit.p.t6.a(r10)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto Lc
            return r1
        Lc:
            java.util.regex.Pattern r0 = com.huawei.hms.scankit.p.q4.b
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r0 = r0.matches()
            if (r0 != 0) goto L19
            return r1
        L19:
            com.huawei.hms.ml.scan.HmsScan$LinkUrl r0 = new com.huawei.hms.ml.scan.HmsScan$LinkUrl
            java.lang.String r1 = ""
            r0.<init>(r1, r1)
            r1 = r0
            com.huawei.hms.ml.scan.HmsScan r0 = new com.huawei.hms.ml.scan.HmsScan
            r2 = r1
            java.lang.String r1 = r10.k()
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r4 = r10.c()
            int r4 = com.huawei.hms.scankit.p.t6.a(r4)
            r5 = r2
            r2 = r4
            int r4 = com.huawei.hms.ml.scan.HmsScan.URL_FORM
            r6 = r5
            byte[] r5 = r10.i()
            com.huawei.hms.scankit.p.u6[] r10 = r10.j()
            android.graphics.Point[] r10 = com.huawei.hms.scankit.p.t6.a(r10)
            com.huawei.hms.scankit.p.z6 r8 = new com.huawei.hms.scankit.p.z6
            r8.<init>(r6)
            r7 = 0
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }
}
