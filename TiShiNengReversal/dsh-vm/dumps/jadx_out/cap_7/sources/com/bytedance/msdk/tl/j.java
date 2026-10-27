package com.bytedance.msdk.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j {
    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String j() {
            java.lang.String r0 = com.bytedance.msdk.tl.rn.up()
            if (r0 == 0) goto L10
            int r1 = r0.length()
            r2 = 16
            if (r1 == r2) goto Lf
            goto L10
        Lf:
            return r0
        L10:
            r0 = 0
            return r0
    }

    public static java.lang.String j(java.lang.String r2) {
            if (r2 == 0) goto L18
            int r0 = r2.length()
            r1 = 16
            if (r0 == r1) goto Lb
            goto L18
        Lb:
            java.lang.String r2 = r2.concat(r2)
            r0 = 8
            r1 = 24
            java.lang.String r2 = r2.substring(r0, r1)
            return r2
        L18:
            r2 = 0
            return r2
    }

    public static java.lang.String j(java.lang.String r2, java.lang.String r3) {
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Exception -> L25
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Exception -> L25
            java.lang.String r1 = "AES"
            r0.<init>(r3, r1)     // Catch: java.lang.Exception -> L25
            java.lang.String r3 = "AES/ECB/PKCS5Padding"
            javax.crypto.Cipher r3 = javax.crypto.Cipher.getInstance(r3)     // Catch: java.lang.Exception -> L25
            r1 = 1
            r3.init(r1, r0)     // Catch: java.lang.Exception -> L25
            java.lang.String r0 = "utf-8"
            byte[] r2 = r2.getBytes(r0)     // Catch: java.lang.Exception -> L25
            byte[] r2 = r3.doFinal(r2)     // Catch: java.lang.Exception -> L25
            r3 = 0
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r3)     // Catch: java.lang.Exception -> L25
            return r2
        L25:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            r2 = 0
            return r2
    }

    public static java.lang.String j(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            byte[] r4 = r4.getBytes()
            java.lang.String r1 = "AES"
            r0.<init>(r4, r1)
            java.lang.String r4 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r4 = javax.crypto.Cipher.getInstance(r4)     // Catch: java.lang.Throwable -> L2e
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> L2e
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L2e
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2e
            r3 = 1
            r4.init(r3, r0, r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = "utf-8"
            byte[] r2 = r2.getBytes(r3)     // Catch: java.lang.Throwable -> L2e
            byte[] r2 = r4.doFinal(r2)     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r3)     // Catch: java.lang.Throwable -> L2e
            return r2
        L2e:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            com.bytedance.msdk.j.up.cw.cw(r2)
            r2 = 0
            return r2
    }

    public static java.lang.String j(byte[] r2, java.lang.String r3) {
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Exception -> L1f
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Exception -> L1f
            java.lang.String r1 = "AES"
            r0.<init>(r3, r1)     // Catch: java.lang.Exception -> L1f
            java.lang.String r3 = "AES/ECB/PKCS7Padding"
            javax.crypto.Cipher r3 = javax.crypto.Cipher.getInstance(r3)     // Catch: java.lang.Exception -> L1f
            r1 = 1
            r3.init(r1, r0)     // Catch: java.lang.Exception -> L1f
            byte[] r2 = r3.doFinal(r2)     // Catch: java.lang.Exception -> L1f
            r3 = 0
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r3)     // Catch: java.lang.Exception -> L1f
            return r2
        L1f:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            r2 = 0
            return r2
    }

    public static java.lang.String xt(java.lang.String r3, java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 0
            byte[] r3 = android.util.Base64.decode(r3, r0)     // Catch: java.lang.Exception -> L2c
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Exception -> L2c
            byte[] r4 = r4.getBytes()     // Catch: java.lang.Exception -> L2c
            java.lang.String r2 = "AES"
            r0.<init>(r4, r2)     // Catch: java.lang.Exception -> L2c
            java.lang.String r4 = "AES/ECB/PKCS5Padding"
            javax.crypto.Cipher r4 = javax.crypto.Cipher.getInstance(r4)     // Catch: java.lang.Exception -> L2c
            r2 = 2
            r4.init(r2, r0)     // Catch: java.lang.Exception -> L2c
            byte[] r3 = r4.doFinal(r3)     // Catch: java.lang.Exception -> L2c
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Exception -> L2c
            r4.<init>(r3)     // Catch: java.lang.Exception -> L2c
            return r4
        L2c:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            return r1
    }
}
