package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class z extends com.huawei.hms.scankit.p.t6 {
    private static final java.util.regex.Pattern b = null;
    private static final java.util.regex.Pattern c = null;

    static {
            java.lang.String r0 = "(?:MEBKM:)([\\s\\S]+)"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            com.huawei.hms.scankit.p.z.b = r0
            java.lang.String r0 = "(?:http:/?(?!/)|http//)([\\s\\S]+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            com.huawei.hms.scankit.p.z.c = r0
            return
    }

    public z() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String a(java.lang.String[] r4, java.lang.String r5) {
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L1c
            r2 = r4[r1]
            boolean r3 = r2.startsWith(r5)
            if (r3 == 0) goto L19
            int r4 = r5.length()
            java.lang.String r4 = r2.substring(r4)
            java.lang.String r4 = com.huawei.hms.scankit.p.t6.b(r4)
            return r4
        L19:
            int r1 = r1 + 1
            goto L2
        L1c:
            java.lang.String r4 = ""
            return r4
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
            java.util.regex.Pattern r1 = com.huawei.hms.scankit.p.z.b
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r1 = r0.matches()
            if (r1 != 0) goto L19
            return r2
        L19:
            r1 = 1
            java.lang.String r0 = r0.group(r1)
            java.lang.String r3 = "(?<=(?<!\\\\)(?:\\\\\\\\){0,100});"
            java.lang.String[] r0 = r0.split(r3)
            java.lang.String r3 = "TITLE:"
            java.lang.String r3 = a(r0, r3)
            java.lang.String r4 = "URL:"
            java.lang.String r0 = a(r0, r4)
            java.lang.String r0 = com.huawei.hms.scankit.p.t6.a(r0)
            int r4 = r0.length()
            if (r4 != 0) goto L3b
            return r2
        L3b:
            java.util.regex.Pattern r2 = com.huawei.hms.scankit.p.z.c
            java.util.regex.Matcher r2 = r2.matcher(r0)
            boolean r4 = r2.matches()
            if (r4 == 0) goto L65
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 0
            r6 = 4
            java.lang.String r0 = r0.substring(r5, r6)
            r4.append(r0)
            java.lang.String r0 = "://"
            r4.append(r0)
            java.lang.String r0 = r2.group(r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
        L65:
            r7 = r0
            com.huawei.hms.ml.scan.HmsScan$LinkUrl r0 = new com.huawei.hms.ml.scan.HmsScan$LinkUrl
            r0.<init>(r3, r7)
            com.huawei.hms.ml.scan.HmsScan r4 = new com.huawei.hms.ml.scan.HmsScan
            java.lang.String r5 = r14.k()
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = r14.c()
            int r6 = com.huawei.hms.scankit.p.t6.a(r1)
            int r8 = com.huawei.hms.ml.scan.HmsScan.URL_FORM
            byte[] r9 = r14.i()
            com.huawei.hms.scankit.p.u6[] r14 = r14.j()
            android.graphics.Point[] r10 = com.huawei.hms.scankit.p.t6.a(r14)
            com.huawei.hms.scankit.p.z6 r12 = new com.huawei.hms.scankit.p.z6
            r12.<init>(r0)
            r11 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
    }
}
