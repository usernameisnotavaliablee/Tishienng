package xyz.adscope.common.tool.security;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AesUtil {
    private static java.lang.String a = "\u007f}{y<usqomkigeca";

    static {
            java.lang.String r0 = "\u007f}{y<usqomkigeca"
            java.lang.String r0 = decryptStr(r0)
            xyz.adscope.common.tool.security.AesUtil.a = r0
            return
    }

    public AesUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String decrypt(java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "UTF-8"
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Exception -> L31
            java.lang.String r2 = xyz.adscope.common.tool.security.AesUtil.a     // Catch: java.lang.Exception -> L31
            byte[] r2 = r2.getBytes(r0)     // Catch: java.lang.Exception -> L31
            r1.<init>(r2)     // Catch: java.lang.Exception -> L31
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Exception -> L31
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Exception -> L31
            java.lang.String r0 = "AES"
            r2.<init>(r3, r0)     // Catch: java.lang.Exception -> L31
            java.lang.String r3 = "AES/CBC/PKCS5PADDING"
            javax.crypto.Cipher r3 = javax.crypto.Cipher.getInstance(r3)     // Catch: java.lang.Exception -> L31
            r0 = 2
            r3.init(r0, r2, r1)     // Catch: java.lang.Exception -> L31
            r0 = 0
            byte[] r4 = android.util.Base64.decode(r4, r0)     // Catch: java.lang.Exception -> L31
            byte[] r3 = r3.doFinal(r4)     // Catch: java.lang.Exception -> L31
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Exception -> L31
            r4.<init>(r3)     // Catch: java.lang.Exception -> L31
            return r4
        L31:
            r3 = 0
            return r3
    }

    public static byte[] decryptByte(java.lang.String r2, java.lang.String r3, byte[] r4) {
            java.lang.String r0 = "UTF-8"
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Exception -> L25
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Exception -> L25
            r1.<init>(r3)     // Catch: java.lang.Exception -> L25
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Exception -> L25
            byte[] r2 = r2.getBytes(r0)     // Catch: java.lang.Exception -> L25
            java.lang.String r0 = "AES"
            r3.<init>(r2, r0)     // Catch: java.lang.Exception -> L25
            java.lang.String r2 = "AES/CBC/PKCS5PADDING"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)     // Catch: java.lang.Exception -> L25
            r0 = 2
            r2.init(r0, r3, r1)     // Catch: java.lang.Exception -> L25
            byte[] r2 = r2.doFinal(r4)     // Catch: java.lang.Exception -> L25
            return r2
        L25:
            r2 = 0
            return r2
    }

    public static byte[] decryptByte(byte[] r2) {
            java.lang.String r0 = xyz.adscope.common.tool.security.KeyGenerator.generateAesKey()
            java.lang.String r1 = xyz.adscope.common.tool.security.AesUtil.a
            byte[] r2 = decryptByte(r0, r1, r2)
            return r2
    }

    public static java.lang.String decryptStr(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L20
            r0.<init>(r2)     // Catch: java.lang.Exception -> L20
            r0.reverse()     // Catch: java.lang.Exception -> L20
            r2 = 0
        L9:
            int r1 = r0.length()     // Catch: java.lang.Exception -> L20
            if (r2 >= r1) goto L1b
            char r1 = r0.charAt(r2)     // Catch: java.lang.Exception -> L20
            int r1 = r1 - r2
            char r1 = (char) r1     // Catch: java.lang.Exception -> L20
            r0.setCharAt(r2, r1)     // Catch: java.lang.Exception -> L20
            int r2 = r2 + 1
            goto L9
        L1b:
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Exception -> L20
            return r2
        L20:
            java.lang.String r2 = ""
            return r2
    }

    public static java.lang.String encrypt(java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "UTF-8"
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = xyz.adscope.common.tool.security.AesUtil.a     // Catch: java.lang.Exception -> L30
            byte[] r2 = r2.getBytes(r0)     // Catch: java.lang.Exception -> L30
            r1.<init>(r2)     // Catch: java.lang.Exception -> L30
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Exception -> L30
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Exception -> L30
            java.lang.String r0 = "AES"
            r2.<init>(r3, r0)     // Catch: java.lang.Exception -> L30
            java.lang.String r3 = "AES/CBC/PKCS5PADDING"
            javax.crypto.Cipher r3 = javax.crypto.Cipher.getInstance(r3)     // Catch: java.lang.Exception -> L30
            r0 = 1
            r3.init(r0, r2, r1)     // Catch: java.lang.Exception -> L30
            byte[] r4 = r4.getBytes()     // Catch: java.lang.Exception -> L30
            byte[] r3 = r3.doFinal(r4)     // Catch: java.lang.Exception -> L30
            r4 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r4)     // Catch: java.lang.Exception -> L30
            return r3
        L30:
            r3 = 0
            return r3
    }

    public static byte[] encryptByte(java.lang.String r2, java.lang.String r3, byte[] r4) {
            java.lang.String r0 = "UTF-8"
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Exception -> L25
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Exception -> L25
            r1.<init>(r3)     // Catch: java.lang.Exception -> L25
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Exception -> L25
            byte[] r2 = r2.getBytes(r0)     // Catch: java.lang.Exception -> L25
            java.lang.String r0 = "AES"
            r3.<init>(r2, r0)     // Catch: java.lang.Exception -> L25
            java.lang.String r2 = "AES/CBC/PKCS5PADDING"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)     // Catch: java.lang.Exception -> L25
            r0 = 1
            r2.init(r0, r3, r1)     // Catch: java.lang.Exception -> L25
            byte[] r2 = r2.doFinal(r4)     // Catch: java.lang.Exception -> L25
            return r2
        L25:
            r2 = 0
            return r2
    }

    public static byte[] encryptByte(byte[] r2) {
            java.lang.String r0 = xyz.adscope.common.tool.security.KeyGenerator.generateAesKey()
            java.lang.String r1 = xyz.adscope.common.tool.security.AesUtil.a
            byte[] r2 = encryptByte(r0, r1, r2)
            return r2
    }

    public static java.lang.String encryptStr(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L20
            r0.<init>(r2)     // Catch: java.lang.Exception -> L20
            r2 = 0
        L6:
            int r1 = r0.length()     // Catch: java.lang.Exception -> L20
            if (r2 >= r1) goto L18
            char r1 = r0.charAt(r2)     // Catch: java.lang.Exception -> L20
            int r1 = r1 + r2
            char r1 = (char) r1     // Catch: java.lang.Exception -> L20
            r0.setCharAt(r2, r1)     // Catch: java.lang.Exception -> L20
            int r2 = r2 + 1
            goto L6
        L18:
            r0.reverse()     // Catch: java.lang.Exception -> L20
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Exception -> L20
            return r2
        L20:
            java.lang.String r2 = ""
            return r2
    }
}
