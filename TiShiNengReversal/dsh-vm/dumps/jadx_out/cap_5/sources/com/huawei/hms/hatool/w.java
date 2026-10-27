package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class w {
    public w() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = "UTF-8"
            byte[] r2 = r2.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> Lb
            java.lang.String r1 = b(r1, r2)     // Catch: java.io.UnsupportedEncodingException -> Lb
            return r1
        Lb:
            java.lang.String r1 = "hmsSdk"
            java.lang.String r2 = "Unsupported encoding exception,utf-8"
            com.huawei.hms.hatool.j1.h(r1, r2)
            java.lang.String r1 = ""
            return r1
    }

    public static java.lang.String b(java.lang.String r3, byte[] r4) {
            java.lang.String r0 = ""
            java.lang.String r1 = "hmsSdk"
            if (r4 == 0) goto L26
            int r2 = r4.length
            if (r2 != 0) goto La
            goto L26
        La:
            r2 = 0
            byte[] r3 = android.util.Base64.decode(r3, r2)     // Catch: java.security.spec.InvalidKeySpecException -> L1c java.security.NoSuchAlgorithmException -> L22
            java.security.PublicKey r3 = c(r3)     // Catch: java.security.spec.InvalidKeySpecException -> L1c java.security.NoSuchAlgorithmException -> L22
            byte[] r3 = d(r4, r3)     // Catch: java.security.spec.InvalidKeySpecException -> L1c java.security.NoSuchAlgorithmException -> L22
            java.lang.String r3 = c2.c.b(r3)     // Catch: java.security.spec.InvalidKeySpecException -> L1c java.security.NoSuchAlgorithmException -> L22
            return r3
        L1c:
            java.lang.String r3 = "encrypt(): Invalid key specification"
        L1e:
            com.huawei.hms.hatool.j1.m(r1, r3)
            goto L25
        L22:
            java.lang.String r3 = "encrypt(): getInstance - No such algorithm,transformation"
            goto L1e
        L25:
            return r0
        L26:
            java.lang.String r3 = "encrypt: content is empty or null"
            com.huawei.hms.hatool.j1.m(r1, r3)
            return r0
    }

    private static java.security.PublicKey c(byte[] r1) {
            java.security.spec.X509EncodedKeySpec r0 = new java.security.spec.X509EncodedKeySpec
            r0.<init>(r1)
            java.lang.String r1 = "RSA"
            java.security.KeyFactory r1 = java.security.KeyFactory.getInstance(r1)
            java.security.PublicKey r1 = r1.generatePublic(r0)
            return r1
    }

    private static byte[] d(byte[] r3, java.security.PublicKey r4) {
            java.lang.String r0 = "hmsSdk"
            if (r4 == 0) goto L13
            java.lang.String r1 = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)     // Catch: javax.crypto.IllegalBlockSizeException -> L1b javax.crypto.BadPaddingException -> L21 javax.crypto.NoSuchPaddingException -> L24 java.security.InvalidKeyException -> L27 java.security.NoSuchAlgorithmException -> L2a java.io.UnsupportedEncodingException -> L2d
            r2 = 1
            r1.init(r2, r4)     // Catch: javax.crypto.IllegalBlockSizeException -> L1b javax.crypto.BadPaddingException -> L21 javax.crypto.NoSuchPaddingException -> L24 java.security.InvalidKeyException -> L27 java.security.NoSuchAlgorithmException -> L2a java.io.UnsupportedEncodingException -> L2d
            byte[] r3 = r1.doFinal(r3)     // Catch: javax.crypto.IllegalBlockSizeException -> L1b javax.crypto.BadPaddingException -> L21 javax.crypto.NoSuchPaddingException -> L24 java.security.InvalidKeyException -> L27 java.security.NoSuchAlgorithmException -> L2a java.io.UnsupportedEncodingException -> L2d
            return r3
        L13:
            java.io.UnsupportedEncodingException r3 = new java.io.UnsupportedEncodingException     // Catch: javax.crypto.IllegalBlockSizeException -> L1b javax.crypto.BadPaddingException -> L21 javax.crypto.NoSuchPaddingException -> L24 java.security.InvalidKeyException -> L27 java.security.NoSuchAlgorithmException -> L2a java.io.UnsupportedEncodingException -> L2d
            java.lang.String r4 = "The loaded public key is null"
            r3.<init>(r4)     // Catch: javax.crypto.IllegalBlockSizeException -> L1b javax.crypto.BadPaddingException -> L21 javax.crypto.NoSuchPaddingException -> L24 java.security.InvalidKeyException -> L27 java.security.NoSuchAlgorithmException -> L2a java.io.UnsupportedEncodingException -> L2d
            throw r3     // Catch: javax.crypto.IllegalBlockSizeException -> L1b javax.crypto.BadPaddingException -> L21 javax.crypto.NoSuchPaddingException -> L24 java.security.InvalidKeyException -> L27 java.security.NoSuchAlgorithmException -> L2a java.io.UnsupportedEncodingException -> L2d
        L1b:
            java.lang.String r3 = "rsaEncrypt(): doFinal - The provided block is not filled with"
        L1d:
            com.huawei.hms.hatool.j1.m(r0, r3)
            goto L30
        L21:
            java.lang.String r3 = "rsaEncrypt():False filling parameters!"
            goto L1d
        L24:
            java.lang.String r3 = "rsaEncrypt():  No such filling parameters "
            goto L1d
        L27:
            java.lang.String r3 = "rsaEncrypt(): init - Invalid key!"
            goto L1d
        L2a:
            java.lang.String r3 = "rsaEncrypt(): getInstance - No such algorithm,transformation"
            goto L1d
        L2d:
            java.lang.String r3 = "rsaEncrypt(): getBytes - Unsupported coding format!"
            goto L1d
        L30:
            r3 = 0
            byte[] r3 = new byte[r3]
            return r3
    }
}
