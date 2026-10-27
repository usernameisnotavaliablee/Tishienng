package com.huawei.agconnect.config.impl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class k {
    public k() {
            r1 = this;
            r1.<init>()
            return
    }

    public static javax.crypto.SecretKey a(byte[] r2, byte[] r3, byte[] r4, byte[] r5, int r6) throws java.security.NoSuchAlgorithmException, java.security.spec.InvalidKeySpecException {
            int r0 = r2.length
            r1 = 16
            if (r0 != r1) goto L34
            int r0 = r3.length
            if (r0 != r1) goto L34
            int r0 = r4.length
            if (r0 != r1) goto L34
            byte[] r2 = e(r2, r3, r4)
            java.lang.String r2 = com.huawei.agconnect.config.impl.a.c(r2)
            java.lang.String r3 = "PBKDF2WithHmacSHA1"
            javax.crypto.SecretKeyFactory r3 = javax.crypto.SecretKeyFactory.getInstance(r3)
            javax.crypto.spec.PBEKeySpec r4 = new javax.crypto.spec.PBEKeySpec
            char[] r2 = r2.toCharArray()
            r0 = 128(0x80, float:1.8E-43)
            r4.<init>(r2, r5, r6, r0)
            javax.crypto.SecretKey r2 = r3.generateSecret(r4)
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec
            byte[] r2 = r2.getEncoded()
            java.lang.String r4 = "AES"
            r3.<init>(r2, r4)
            return r3
        L34:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "invalid data for generating the key."
            r2.<init>(r3)
            throw r2
    }

    static byte[] b(javax.crypto.SecretKey r5, byte[] r6) throws java.security.GeneralSecurityException {
            if (r5 == 0) goto L25
            if (r6 == 0) goto L25
            r0 = 17
            r1 = 1
            byte[] r0 = java.util.Arrays.copyOfRange(r6, r1, r0)
            java.lang.String r2 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)
            javax.crypto.spec.IvParameterSpec r3 = new javax.crypto.spec.IvParameterSpec
            r3.<init>(r0)
            r4 = 2
            r2.init(r4, r5, r3)
            int r5 = r0.length
            int r5 = r5 + r1
            int r3 = r6.length
            int r0 = r0.length
            int r3 = r3 - r0
            int r3 = r3 - r1
            byte[] r5 = r2.doFinal(r6, r5, r3)
            return r5
        L25:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "key or cipherText must not be null."
            r5.<init>(r6)
            throw r5
    }

    private static byte[] c(byte[] r3, int r4) {
            if (r3 == 0) goto L1a
            r0 = 0
        L3:
            int r1 = r3.length
            if (r0 >= r1) goto L19
            if (r4 >= 0) goto L10
            r1 = r3[r0]
            int r2 = -r4
            int r1 = r1 << r2
            byte r1 = (byte) r1
            r3[r0] = r1
            goto L16
        L10:
            r1 = r3[r0]
            int r1 = r1 >> r4
            byte r1 = (byte) r1
            r3[r0] = r1
        L16:
            int r0 = r0 + 1
            goto L3
        L19:
            return r3
        L1a:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "bytes must not be null."
            r3.<init>(r4)
            throw r3
    }

    private static byte[] d(byte[] r4, byte[] r5) {
            if (r4 == 0) goto L23
            if (r5 == 0) goto L23
            int r0 = r4.length
            int r1 = r5.length
            if (r0 != r1) goto L1b
            int r0 = r4.length
            byte[] r0 = new byte[r0]
            r1 = 0
        Lc:
            int r2 = r4.length
            if (r1 >= r2) goto L1a
            r2 = r4[r1]
            r3 = r5[r1]
            r2 = r2 ^ r3
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto Lc
        L1a:
            return r0
        L1b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "left and right must be the same length."
            r4.<init>(r5)
            throw r4
        L23:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "left or right must not be null."
            r4.<init>(r5)
            throw r4
    }

    public static byte[] e(byte[] r1, byte[] r2, byte[] r3) {
            r0 = -4
            byte[] r1 = c(r1, r0)
            byte[] r1 = d(r1, r2)
            r2 = 6
            byte[] r1 = c(r1, r2)
            byte[] r1 = d(r1, r3)
            return r1
    }
}
