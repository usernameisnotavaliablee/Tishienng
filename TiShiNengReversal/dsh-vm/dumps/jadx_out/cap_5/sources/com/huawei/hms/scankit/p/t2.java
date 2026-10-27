package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class t2 extends com.huawei.hms.scankit.p.t6 {
    private static final java.util.regex.Pattern b = null;
    private static final java.util.regex.Pattern c = null;
    private static final java.util.regex.Pattern d = null;
    private static final java.util.regex.Pattern e = null;

    static {
            java.lang.String r0 = "(?:MATMSG:TO:|mailto:|SMTP:)([\\s\\S]+)"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            com.huawei.hms.scankit.p.t2.b = r0
            java.lang.String r0 = "mailto:([\\s\\S]+)\\?subject=([\\s\\S]+)&body=([\\s\\S]+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            com.huawei.hms.scankit.p.t2.c = r0
            java.lang.String r0 = "MATMSG:TO:([\\s\\S]+);SUB:([\\s\\S]+);BODY:([\\s\\S]+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            com.huawei.hms.scankit.p.t2.d = r0
            java.lang.String r0 = "SMTP:([\\s\\S]+):([\\s\\S]+):([\\s\\S]+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            com.huawei.hms.scankit.p.t2.e = r0
            return
    }

    public t2() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.lang.String c(java.lang.String r1) {
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = java.net.URLDecoder.decode(r1, r0)     // Catch: java.io.UnsupportedEncodingException -> L6
        L6:
            return r1
    }

    @Override // com.huawei.hms.scankit.p.t6
    public com.huawei.hms.ml.scan.HmsScan b(com.huawei.hms.scankit.p.s6 r14) {
            r13 = this;
            java.lang.String r0 = com.huawei.hms.scankit.p.t6.a(r14)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto Lc
            return r2
        Lc:
            java.util.regex.Pattern r1 = com.huawei.hms.scankit.p.t2.b
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r1 = r1.matches()
            if (r1 != 0) goto L19
            return r2
        L19:
            java.util.regex.Pattern r1 = com.huawei.hms.scankit.p.t2.c     // Catch: java.lang.Throwable -> La1
            java.util.regex.Matcher r1 = r1.matcher(r0)     // Catch: java.lang.Throwable -> La1
            java.util.regex.Pattern r3 = com.huawei.hms.scankit.p.t2.d     // Catch: java.lang.Throwable -> La1
            java.util.regex.Matcher r3 = r3.matcher(r0)     // Catch: java.lang.Throwable -> La1
            java.util.regex.Pattern r4 = com.huawei.hms.scankit.p.t2.e     // Catch: java.lang.Throwable -> La1
            java.util.regex.Matcher r0 = r4.matcher(r0)     // Catch: java.lang.Throwable -> La1
            boolean r4 = r1.matches()     // Catch: java.lang.Throwable -> La1
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L42
            java.lang.String r0 = r1.group(r7)     // Catch: java.lang.Throwable -> La1
            java.lang.String r3 = r1.group(r6)     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = r1.group(r5)     // Catch: java.lang.Throwable -> La1
        L40:
            r7 = r0
            goto L6c
        L42:
            boolean r1 = r3.matches()     // Catch: java.lang.Throwable -> La1
            if (r1 == 0) goto L58
            java.lang.String r0 = r3.group(r7)     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = r3.group(r6)     // Catch: java.lang.Throwable -> La1
            java.lang.String r3 = r3.group(r5)     // Catch: java.lang.Throwable -> La1
            r7 = r3
            r3 = r1
            r1 = r7
            goto L40
        L58:
            boolean r1 = r0.matches()     // Catch: java.lang.Throwable -> La1
            if (r1 == 0) goto La1
            java.lang.String r1 = r0.group(r7)     // Catch: java.lang.Throwable -> La1
            java.lang.String r3 = r0.group(r6)     // Catch: java.lang.Throwable -> La1
            java.lang.String r0 = r0.group(r5)     // Catch: java.lang.Throwable -> La1
            r7 = r1
            r1 = r0
        L6c:
            com.huawei.hms.ml.scan.HmsScan$EmailContent r0 = new com.huawei.hms.ml.scan.HmsScan$EmailContent     // Catch: java.lang.Throwable -> La1
            java.lang.String r3 = c(r3)     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = c(r1)     // Catch: java.lang.Throwable -> La1
            int r4 = com.huawei.hms.ml.scan.HmsScan.EmailContent.OTHER_USE_TYPE     // Catch: java.lang.Throwable -> La1
            r0.<init>(r7, r3, r1, r4)     // Catch: java.lang.Throwable -> La1
            com.huawei.hms.ml.scan.HmsScan r4 = new com.huawei.hms.ml.scan.HmsScan     // Catch: java.lang.Throwable -> La1
            java.lang.String r5 = r14.k()     // Catch: java.lang.Throwable -> La1
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = r14.c()     // Catch: java.lang.Throwable -> La1
            int r6 = com.huawei.hms.scankit.p.t6.a(r1)     // Catch: java.lang.Throwable -> La1
            int r8 = com.huawei.hms.ml.scan.HmsScan.EMAIL_CONTENT_FORM     // Catch: java.lang.Throwable -> La1
            byte[] r9 = r14.i()     // Catch: java.lang.Throwable -> La1
            com.huawei.hms.scankit.p.u6[] r14 = r14.j()     // Catch: java.lang.Throwable -> La1
            android.graphics.Point[] r10 = com.huawei.hms.scankit.p.t6.a(r14)     // Catch: java.lang.Throwable -> La1
            com.huawei.hms.scankit.p.z6 r12 = new com.huawei.hms.scankit.p.z6     // Catch: java.lang.Throwable -> La1
            r12.<init>(r0)     // Catch: java.lang.Throwable -> La1
            r11 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> La1
            return r4
        La1:
            return r2
    }
}
