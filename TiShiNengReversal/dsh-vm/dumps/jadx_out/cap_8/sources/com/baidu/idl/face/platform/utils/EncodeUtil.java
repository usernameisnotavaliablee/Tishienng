package com.baidu.idl.face.platform.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class EncodeUtil {
    public EncodeUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String aesDecrypt(java.lang.String r1, java.lang.String r2) throws java.lang.Exception {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            byte[] r1 = base64Decode(r1)
            java.lang.String r1 = aesDecryptByBytes(r1, r2)
            return r1
    }

    public static java.lang.String aesDecryptByBytes(byte[] r3, java.lang.String r4) throws java.lang.Exception {
            java.lang.String r0 = "AES"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r0)
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec
            byte[] r4 = base64Decode(r4)
            r2.<init>(r4, r0)
            r4 = 2
            r1.init(r4, r2)
            byte[] r3 = r1.doFinal(r3)
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            return r4
    }

    public static java.lang.String aesEncrypt(java.lang.String r0, java.lang.String r1) throws java.lang.Exception {
            byte[] r0 = aesEncryptToBytes(r0, r1)
            java.lang.String r0 = base64Encode(r0)
            return r0
    }

    public static byte[] aesEncryptToBytes(java.lang.String r3, java.lang.String r4) throws java.lang.Exception {
            java.lang.String r0 = "AES"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r0)
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec
            byte[] r4 = base64Decode(r4)
            r2.<init>(r4, r0)
            r4 = 1
            r1.init(r4, r2)
            java.lang.String r4 = "utf-8"
            byte[] r3 = r3.getBytes(r4)
            byte[] r3 = r1.doFinal(r3)
            return r3
    }

    public static byte[] base64Decode(java.lang.String r1) throws java.lang.Exception {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            r0 = 2
            byte[] r1 = android.util.Base64.decode(r1, r0)
            return r1
    }

    public static java.lang.String base64Encode(byte[] r1) {
            r0 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)
            return r1
    }
}
