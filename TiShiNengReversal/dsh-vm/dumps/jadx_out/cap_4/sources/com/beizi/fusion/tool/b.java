package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b {
    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "UTF-8"
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = "abcdefghijk1mnop"
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

    public static java.lang.String b(java.lang.String r4, java.lang.String r5) {
            java.lang.String r0 = "UTF-8"
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Exception -> L31
            java.lang.String r2 = "abcdefghijk1mnop"
            byte[] r2 = r2.getBytes(r0)     // Catch: java.lang.Exception -> L31
            r1.<init>(r2)     // Catch: java.lang.Exception -> L31
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Exception -> L31
            byte[] r4 = r4.getBytes(r0)     // Catch: java.lang.Exception -> L31
            java.lang.String r3 = "AES"
            r2.<init>(r4, r3)     // Catch: java.lang.Exception -> L31
            java.lang.String r4 = "AES/CBC/PKCS5PADDING"
            javax.crypto.Cipher r4 = javax.crypto.Cipher.getInstance(r4)     // Catch: java.lang.Exception -> L31
            r3 = 2
            r4.init(r3, r2, r1)     // Catch: java.lang.Exception -> L31
            r1 = 0
            byte[] r5 = android.util.Base64.decode(r5, r1)     // Catch: java.lang.Exception -> L31
            byte[] r4 = r4.doFinal(r5)     // Catch: java.lang.Exception -> L31
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Exception -> L31
            r5.<init>(r4, r0)     // Catch: java.lang.Exception -> L31
            return r5
        L31:
            r4 = 0
            return r4
    }
}
