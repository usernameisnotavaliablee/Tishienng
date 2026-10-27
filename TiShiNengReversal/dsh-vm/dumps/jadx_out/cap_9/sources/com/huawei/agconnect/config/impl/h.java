package com.huawei.agconnect.config.impl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class h implements com.huawei.agconnect.config.impl.i {
    private javax.crypto.SecretKey a;

    h(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) throws java.security.spec.InvalidKeySpecException, java.security.NoSuchAlgorithmException, java.lang.IllegalArgumentException {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L23
            if (r3 == 0) goto L23
            if (r4 == 0) goto L23
            if (r5 == 0) goto L23
            byte[] r2 = com.huawei.agconnect.config.impl.a.b(r2)
            byte[] r3 = com.huawei.agconnect.config.impl.a.b(r3)
            byte[] r4 = com.huawei.agconnect.config.impl.a.b(r4)
            byte[] r5 = com.huawei.agconnect.config.impl.a.b(r5)
            r0 = 5000(0x1388, float:7.006E-42)
            javax.crypto.SecretKey r2 = com.huawei.agconnect.config.impl.k.a(r2, r3, r4, r5, r0)
            r1.a = r2
        L23:
            return
    }

    @Override // com.huawei.agconnect.config.impl.i
    public java.lang.String a(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            javax.crypto.SecretKey r0 = r2.a
            if (r0 != 0) goto L5
            return r3
        L5:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L15
            byte[] r3 = com.huawei.agconnect.config.impl.a.b(r3)     // Catch: java.lang.Throwable -> L15
            byte[] r3 = com.huawei.agconnect.config.impl.k.b(r0, r3)     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = "UTF-8"
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L15
            return r1
        L15:
            return r4
    }
}
