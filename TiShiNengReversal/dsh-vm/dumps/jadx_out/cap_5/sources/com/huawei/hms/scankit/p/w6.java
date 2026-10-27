package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class w6 extends com.huawei.hms.scankit.p.t6 {
    private static final java.util.regex.Pattern b = null;

    static {
            java.lang.String r0 = "(?:mmsto|smsto):([\\s\\S]+)"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            com.huawei.hms.scankit.p.w6.b = r0
            return
    }

    public w6() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.huawei.hms.scankit.p.t6
    public com.huawei.hms.ml.scan.HmsScan b(com.huawei.hms.scankit.p.s6 r13) {
            r12 = this;
            java.lang.String r0 = com.huawei.hms.scankit.p.t6.a(r13)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto Lc
            return r2
        Lc:
            java.util.regex.Pattern r1 = com.huawei.hms.scankit.p.w6.b
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r1 = r1.matches()
            if (r1 != 0) goto L19
            return r2
        L19:
            r1 = 6
            java.lang.String r0 = r0.substring(r1)
            r1 = 58
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L32
            r2 = 0
            java.lang.String r2 = r0.substring(r2, r1)
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
            goto L36
        L32:
            java.lang.String r1 = ""
            r2 = r0
            r0 = r1
        L36:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L3e
            r6 = r2
            goto L53
        L3e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r3 = "\n"
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r6 = r1
        L53:
            com.huawei.hms.ml.scan.HmsScan$SmsContent r1 = new com.huawei.hms.ml.scan.HmsScan$SmsContent
            r1.<init>(r0, r2)
            com.huawei.hms.ml.scan.HmsScan r3 = new com.huawei.hms.ml.scan.HmsScan
            java.lang.String r4 = r13.k()
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = r13.c()
            int r5 = com.huawei.hms.scankit.p.t6.a(r0)
            int r7 = com.huawei.hms.ml.scan.HmsScan.SMS_FORM
            byte[] r8 = r13.i()
            com.huawei.hms.scankit.p.u6[] r13 = r13.j()
            android.graphics.Point[] r9 = com.huawei.hms.scankit.p.t6.a(r13)
            com.huawei.hms.scankit.p.z6 r11 = new com.huawei.hms.scankit.p.z6
            r11.<init>(r1)
            r10 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r3
    }
}
