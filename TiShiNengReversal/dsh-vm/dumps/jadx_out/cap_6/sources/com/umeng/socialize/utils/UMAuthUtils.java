package com.umeng.socialize.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UMAuthUtils {
    public UMAuthUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String decrypt(java.lang.String r6, java.lang.String r7) throws java.lang.Exception {
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L66
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto Ld
            goto L66
        Ld:
            java.lang.String r0 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)
            byte[] r1 = r7.getBytes()
            int r2 = r1.length
            r3 = 16
            r4 = 0
            if (r2 >= r3) goto L31
            byte[] r1 = new byte[r3]
            r2 = 1
            java.util.Arrays.fill(r1, r2)
            byte[] r2 = r7.getBytes()
            int r7 = r7.length()
            java.lang.System.arraycopy(r1, r4, r2, r4, r7)
            r2 = 16
            goto L44
        L31:
            int r7 = r1.length
            r2 = 32
            if (r7 <= r2) goto L37
            goto L44
        L37:
            int r7 = r1.length
            int r7 = r7 % 8
            if (r7 == 0) goto L43
            int r7 = r1.length
            int r2 = r1.length
            int r2 = r2 % 8
            int r2 = r7 - r2
            goto L44
        L43:
            int r2 = r1.length
        L44:
            javax.crypto.spec.SecretKeySpec r7 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r5 = "AES"
            r7.<init>(r1, r4, r2, r5)
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r4, r3)
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec
            r2.<init>(r1)
            r1 = 2
            r0.init(r1, r7, r2)
            byte[] r6 = android.util.Base64.decode(r6, r4)
            byte[] r6 = r0.doFinal(r6)
            java.lang.String r7 = new java.lang.String
            r7.<init>(r6)
            return r7
        L66:
            java.lang.String r6 = ""
            return r6
    }

    public static java.lang.String encrypt(java.lang.String r7, java.lang.String r8) throws java.lang.Exception {
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L64
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto Ld
            goto L64
        Ld:
            java.lang.String r0 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)
            byte[] r1 = r8.getBytes()
            int r2 = r1.length
            r3 = 1
            r4 = 16
            r5 = 0
            if (r2 >= r4) goto L31
            byte[] r1 = new byte[r4]
            java.util.Arrays.fill(r1, r3)
            byte[] r2 = r8.getBytes()
            int r8 = r8.length()
            java.lang.System.arraycopy(r1, r5, r2, r5, r8)
            r2 = 16
            goto L44
        L31:
            int r8 = r1.length
            r2 = 32
            if (r8 <= r2) goto L37
            goto L44
        L37:
            int r8 = r1.length
            int r8 = r8 % 8
            if (r8 == 0) goto L43
            int r8 = r1.length
            int r2 = r1.length
            int r2 = r2 % 8
            int r2 = r8 - r2
            goto L44
        L43:
            int r2 = r1.length
        L44:
            javax.crypto.spec.SecretKeySpec r8 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r6 = "AES"
            r8.<init>(r1, r5, r2, r6)
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r5, r4)
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec
            r2.<init>(r1)
            r0.init(r3, r8, r2)
            byte[] r7 = r7.getBytes()
            byte[] r7 = r0.doFinal(r7)
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r5)
            return r7
        L64:
            java.lang.String r7 = ""
            return r7
    }
}
