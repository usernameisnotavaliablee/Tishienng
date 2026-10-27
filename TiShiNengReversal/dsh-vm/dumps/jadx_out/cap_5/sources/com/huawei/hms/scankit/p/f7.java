package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class f7 extends com.huawei.hms.scankit.p.t6 {
    private static final java.util.regex.Pattern b = null;

    static {
            java.lang.String r0 = "tel:([\\s\\S]+)"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            com.huawei.hms.scankit.p.f7.b = r0
            return
    }

    public f7() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.huawei.hms.scankit.p.t6
    public com.huawei.hms.ml.scan.HmsScan b(com.huawei.hms.scankit.p.s6 r12) {
            r11 = this;
            java.lang.String r0 = com.huawei.hms.scankit.p.t6.a(r12)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto Lc
            return r2
        Lc:
            java.util.regex.Pattern r1 = com.huawei.hms.scankit.p.f7.b
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r1 = r0.matches()
            if (r1 != 0) goto L19
            return r2
        L19:
            r1 = 1
            java.lang.String r5 = r0.group(r1)
            com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber r0 = new com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber
            int r1 = com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.OTHER_USE_TYPE
            r0.<init>(r1, r5)
            com.huawei.hms.ml.scan.HmsScan r2 = new com.huawei.hms.ml.scan.HmsScan
            java.lang.String r3 = r12.k()
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = r12.c()
            int r4 = com.huawei.hms.scankit.p.t6.a(r1)
            int r6 = com.huawei.hms.ml.scan.HmsScan.TEL_PHONE_NUMBER_FORM
            byte[] r7 = r12.i()
            com.huawei.hms.scankit.p.u6[] r12 = r12.j()
            android.graphics.Point[] r8 = com.huawei.hms.scankit.p.t6.a(r12)
            com.huawei.hms.scankit.p.z6 r10 = new com.huawei.hms.scankit.p.z6
            r10.<init>(r0)
            r9 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r2
    }
}
