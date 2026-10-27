package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class z1 {
    public z1() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.security.PublicKey a(java.lang.String r2) throws java.lang.Exception {
            byte[] r2 = com.amap.api.col.s.v1.c(r2)     // Catch: java.lang.NullPointerException -> L18 java.security.spec.InvalidKeySpecException -> L20 java.security.NoSuchAlgorithmException -> L28
            java.lang.String r0 = "EUlNB"
            java.lang.String r0 = com.amap.api.col.s.j1.t(r0)     // Catch: java.lang.NullPointerException -> L18 java.security.spec.InvalidKeySpecException -> L20 java.security.NoSuchAlgorithmException -> L28
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0)     // Catch: java.lang.NullPointerException -> L18 java.security.spec.InvalidKeySpecException -> L20 java.security.NoSuchAlgorithmException -> L28
            java.security.spec.X509EncodedKeySpec r1 = new java.security.spec.X509EncodedKeySpec     // Catch: java.lang.NullPointerException -> L18 java.security.spec.InvalidKeySpecException -> L20 java.security.NoSuchAlgorithmException -> L28
            r1.<init>(r2)     // Catch: java.lang.NullPointerException -> L18 java.security.spec.InvalidKeySpecException -> L20 java.security.NoSuchAlgorithmException -> L28
            java.security.PublicKey r2 = r0.generatePublic(r1)     // Catch: java.lang.NullPointerException -> L18 java.security.spec.InvalidKeySpecException -> L20 java.security.NoSuchAlgorithmException -> L28
            return r2
        L18:
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r0 = "公钥数据为空"
            r2.<init>(r0)
            throw r2
        L20:
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r0 = "公钥非法"
            r2.<init>(r0)
            throw r2
        L28:
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r0 = "无此算法"
            r2.<init>(r0)
            throw r2
    }

    public static byte[] b(byte[] r2, java.security.PublicKey r3) {
            java.lang.String r0 = "CUlNBL0VDQi9QS0NTMVBhZGRpbmc"
            java.lang.String r0 = com.amap.api.col.s.j1.t(r0)     // Catch: java.lang.Throwable -> L13
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch: java.lang.Throwable -> L13
            r1 = 1
            r0.init(r1, r3)     // Catch: java.lang.Throwable -> L13
            byte[] r2 = r0.doFinal(r2)     // Catch: java.lang.Throwable -> L13
            return r2
        L13:
            r2 = 0
            return r2
    }
}
