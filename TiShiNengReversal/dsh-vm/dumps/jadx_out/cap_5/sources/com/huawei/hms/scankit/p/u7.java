package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class u7 extends com.huawei.hms.scankit.p.t6 {
    private static final java.util.regex.Pattern b = null;
    private static final java.util.regex.Pattern c = null;

    static {
            java.lang.String r0 = "(?:uri|url):([\\s\\S]*)"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            com.huawei.hms.scankit.p.u7.b = r0
            java.lang.String r0 = "(?:http:/?(?!/)|http//)([\\s\\S]+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            com.huawei.hms.scankit.p.u7.c = r0
            return
    }

    public u7() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.huawei.hms.scankit.p.t6
    public com.huawei.hms.ml.scan.HmsScan b(com.huawei.hms.scankit.p.s6 r11) {
            r10 = this;
            java.lang.String r0 = com.huawei.hms.scankit.p.t6.a(r11)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto Lc
            return r2
        Lc:
            java.util.regex.Pattern r1 = com.huawei.hms.scankit.p.u7.b
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r1 = r1.matches()
            if (r1 != 0) goto L19
            return r2
        L19:
            r1 = 4
            java.lang.String r0 = r0.substring(r1)
            java.util.regex.Pattern r2 = com.huawei.hms.scankit.p.u7.c
            java.util.regex.Matcher r2 = r2.matcher(r0)
            boolean r3 = r2.matches()
            if (r3 == 0) goto L48
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 0
            java.lang.String r0 = r0.substring(r4, r1)
            r3.append(r0)
            java.lang.String r0 = "://"
            r3.append(r0)
            r0 = 1
            java.lang.String r0 = r2.group(r0)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L48:
            java.lang.String r4 = com.huawei.hms.scankit.p.t6.a(r0)
            com.huawei.hms.ml.scan.HmsScan$LinkUrl r0 = new com.huawei.hms.ml.scan.HmsScan$LinkUrl
            java.lang.String r1 = ""
            r0.<init>(r1, r1)
            com.huawei.hms.ml.scan.HmsScan r1 = new com.huawei.hms.ml.scan.HmsScan
            java.lang.String r2 = r11.k()
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r3 = r11.c()
            int r3 = com.huawei.hms.scankit.p.t6.a(r3)
            int r5 = com.huawei.hms.ml.scan.HmsScan.URL_FORM
            byte[] r6 = r11.i()
            com.huawei.hms.scankit.p.u6[] r11 = r11.j()
            android.graphics.Point[] r7 = com.huawei.hms.scankit.p.t6.a(r11)
            com.huawei.hms.scankit.p.z6 r9 = new com.huawei.hms.scankit.p.z6
            r9.<init>(r0)
            r8 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
    }
}
