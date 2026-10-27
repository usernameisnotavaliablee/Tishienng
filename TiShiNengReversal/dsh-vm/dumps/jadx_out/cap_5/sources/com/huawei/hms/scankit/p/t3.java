package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class t3 extends com.huawei.hms.scankit.p.t6 {
    private static final java.util.regex.Pattern b = null;
    private static final java.util.regex.Pattern c = null;

    static {
            java.lang.String r0 = "(?:http:|http//|https://)([\\s\\S]+)"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            com.huawei.hms.scankit.p.t3.b = r0
            java.lang.String r0 = "(?:http:/?(?!/)|http//)([\\s\\S]+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            com.huawei.hms.scankit.p.t3.c = r0
            return
    }

    public t3() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.huawei.hms.scankit.p.t6
    public com.huawei.hms.ml.scan.HmsScan b(com.huawei.hms.scankit.p.s6 r13) {
            r12 = this;
            java.lang.String r0 = com.huawei.hms.scankit.p.t6.a(r13)
            java.util.regex.Pattern r1 = com.huawei.hms.scankit.p.t3.b
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r1 = r1.matches()
            r2 = 0
            if (r1 != 0) goto L12
            return r2
        L12:
            java.util.regex.Pattern r1 = com.huawei.hms.scankit.p.t3.c
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r3 = r1.matches()
            if (r3 == 0) goto L3d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 0
            r5 = 4
            java.lang.String r0 = r0.substring(r4, r5)
            r3.append(r0)
            java.lang.String r0 = "://"
            r3.append(r0)
            r0 = 1
            java.lang.String r0 = r1.group(r0)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L3d:
            java.lang.String r6 = com.huawei.hms.scankit.p.t6.a(r0)
            int r0 = r6.length()
            r1 = 7
            if (r0 != r1) goto L49
            return r2
        L49:
            com.huawei.hms.ml.scan.HmsScan$LinkUrl r0 = new com.huawei.hms.ml.scan.HmsScan$LinkUrl
            java.lang.String r1 = ""
            r0.<init>(r1, r6)
            com.huawei.hms.ml.scan.HmsScan r3 = new com.huawei.hms.ml.scan.HmsScan
            java.lang.String r4 = r13.k()
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = r13.c()
            int r5 = com.huawei.hms.scankit.p.t6.a(r1)
            int r7 = com.huawei.hms.ml.scan.HmsScan.URL_FORM
            byte[] r8 = r13.i()
            com.huawei.hms.scankit.p.u6[] r13 = r13.j()
            android.graphics.Point[] r9 = com.huawei.hms.scankit.p.t6.a(r13)
            com.huawei.hms.scankit.p.z6 r11 = new com.huawei.hms.scankit.p.z6
            r11.<init>(r0)
            r10 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r3
    }
}
