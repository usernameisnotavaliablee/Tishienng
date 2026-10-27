package xyz.adscope.amps.adapter.gdt.util;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class RSAEncryptUtil {
    private static final java.lang.String transformationCode = "RSA/ECB/PKCS1Padding";

    public RSAEncryptUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String encrypt(java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L3f
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Ld
            goto L3f
        Ld:
            java.security.PublicKey r3 = getPublicKey(r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch: java.lang.Throwable -> L3f
            r1 = 1
            r0.init(r1, r3)     // Catch: java.lang.Throwable -> L3f
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L3f
            byte[] r3 = r2.getBytes(r3)     // Catch: java.lang.Throwable -> L3f
            byte[] r3 = r0.doFinal(r3)     // Catch: java.lang.Throwable -> L3f
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L3f
            r1 = 26
            if (r0 < r1) goto L34
            java.util.Base64$Encoder r0 = io.netty.handler.codec.http.websocketx.a.a()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = io.netty.handler.codec.http.websocketx.b.a(r0, r3)     // Catch: java.lang.Throwable -> L3f
            goto L39
        L34:
            r0 = 0
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r0)     // Catch: java.lang.Throwable -> L3f
        L39:
            java.lang.String r0 = "UTF-8"
            java.lang.String r2 = java.net.URLEncoder.encode(r3, r0)     // Catch: java.lang.Throwable -> L3f
        L3f:
            return r2
    }

    public static java.security.PublicKey getPublicKey(java.lang.String r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L1a
            java.security.spec.X509EncodedKeySpec r0 = new java.security.spec.X509EncodedKeySpec
            java.util.Base64$Decoder r1 = xyz.adscope.amps.adapter.gdt.util.a.a()
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r3 = r3.getBytes(r2)
            byte[] r3 = xyz.adscope.amps.adapter.gdt.util.b.a(r1, r3)
            r0.<init>(r3)
            goto L24
        L1a:
            java.security.spec.X509EncodedKeySpec r0 = new java.security.spec.X509EncodedKeySpec
            r1 = 0
            byte[] r3 = android.util.Base64.decode(r3, r1)
            r0.<init>(r3)
        L24:
            java.lang.String r3 = "RSA"
            java.security.KeyFactory r3 = java.security.KeyFactory.getInstance(r3)     // Catch: java.lang.Throwable -> L2f
            java.security.PublicKey r3 = r3.generatePublic(r0)     // Catch: java.lang.Throwable -> L2f
            return r3
        L2f:
            r3 = 0
            return r3
    }
}
