package xyz.adscope.common.v2.encrypt.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class MD5Util {
    public MD5Util() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String md5(java.lang.String r5) {
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Exception -> L38
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Exception -> L38
            byte[] r5 = r5.getBytes(r1)     // Catch: java.lang.Exception -> L38
            byte[] r5 = r0.digest(r5)     // Catch: java.lang.Exception -> L38
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L38
            int r1 = r5.length     // Catch: java.lang.Exception -> L38
            int r1 = r1 * 2
            r0.<init>(r1)     // Catch: java.lang.Exception -> L38
            int r1 = r5.length     // Catch: java.lang.Exception -> L38
            r2 = 0
        L1a:
            if (r2 >= r1) goto L33
            r3 = r5[r2]     // Catch: java.lang.Exception -> L38
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 16
            if (r3 >= r4) goto L29
            java.lang.String r4 = "0"
            r0.append(r4)     // Catch: java.lang.Exception -> L38
        L29:
            java.lang.String r3 = java.lang.Integer.toHexString(r3)     // Catch: java.lang.Exception -> L38
            r0.append(r3)     // Catch: java.lang.Exception -> L38
            int r2 = r2 + 1
            goto L1a
        L33:
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Exception -> L38
            return r5
        L38:
            java.lang.String r5 = ""
            return r5
    }
}
