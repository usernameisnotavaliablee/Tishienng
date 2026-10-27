package com.huawei.agconnect.config.impl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class g implements com.huawei.agconnect.config.impl.i {
    private final com.huawei.agconnect.config.impl.f a;
    private javax.crypto.SecretKey b;

    g(com.huawei.agconnect.config.impl.f r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b()
            return
    }

    private javax.crypto.SecretKey b() {
            r6 = this;
            r0 = 0
            com.huawei.agconnect.config.impl.f r1 = r6.a     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "/code/code1"
            java.lang.String r1 = r1.a(r2, r0)     // Catch: java.lang.Throwable -> L42
            com.huawei.agconnect.config.impl.f r2 = r6.a     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "/code/code2"
            java.lang.String r2 = r2.a(r3, r0)     // Catch: java.lang.Throwable -> L42
            com.huawei.agconnect.config.impl.f r3 = r6.a     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = "/code/code3"
            java.lang.String r3 = r3.a(r4, r0)     // Catch: java.lang.Throwable -> L42
            com.huawei.agconnect.config.impl.f r4 = r6.a     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = "/code/code4"
            java.lang.String r4 = r4.a(r5, r0)     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L44
            if (r2 == 0) goto L44
            if (r3 == 0) goto L44
            if (r4 == 0) goto L44
            byte[] r1 = com.huawei.agconnect.config.impl.a.b(r1)     // Catch: java.lang.Throwable -> L42
            byte[] r2 = com.huawei.agconnect.config.impl.a.b(r2)     // Catch: java.lang.Throwable -> L42
            byte[] r3 = com.huawei.agconnect.config.impl.a.b(r3)     // Catch: java.lang.Throwable -> L42
            byte[] r4 = com.huawei.agconnect.config.impl.a.b(r4)     // Catch: java.lang.Throwable -> L42
            r5 = 10000(0x2710, float:1.4013E-41)
            javax.crypto.SecretKey r1 = com.huawei.agconnect.config.impl.k.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L42
            r6.b = r1     // Catch: java.lang.Throwable -> L42
            goto L44
        L42:
            r6.b = r0
        L44:
            javax.crypto.SecretKey r0 = r6.b
            return r0
    }

    public static boolean c(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L10
            java.lang.String r0 = "^\\[!([A-Fa-f0-9]*)]"
            boolean r1 = java.util.regex.Pattern.matches(r0, r1)
            if (r1 == 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    static java.lang.String d(java.lang.String r2) {
            java.lang.String r0 = ""
            java.lang.String r1 = "^\\[!([A-Fa-f0-9]*)]"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)     // Catch: java.lang.Throwable -> L18
            java.util.regex.Matcher r2 = r1.matcher(r2)     // Catch: java.lang.Throwable -> L18
            boolean r1 = r2.find()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L18
            r1 = 1
            java.lang.String r2 = r2.group(r1)     // Catch: java.lang.Throwable -> L18
            return r2
        L18:
            return r0
    }

    @Override // com.huawei.agconnect.config.impl.i
    public java.lang.String a(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            javax.crypto.SecretKey r0 = r2.b
            if (r0 != 0) goto L5
            return r4
        L5:
            boolean r0 = c(r3)
            if (r0 == 0) goto L21
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L21
            javax.crypto.SecretKey r1 = r2.b     // Catch: java.lang.Throwable -> L21
            java.lang.String r3 = d(r3)     // Catch: java.lang.Throwable -> L21
            byte[] r3 = com.huawei.agconnect.config.impl.a.b(r3)     // Catch: java.lang.Throwable -> L21
            byte[] r3 = com.huawei.agconnect.config.impl.k.b(r1, r3)     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "UTF-8"
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L21
            return r0
        L21:
            return r4
    }
}
