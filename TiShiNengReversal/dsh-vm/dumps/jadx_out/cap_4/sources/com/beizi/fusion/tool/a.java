package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r3, java.lang.String r4) {
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> L2d
            byte[] r1 = r4.getBytes()     // Catch: java.lang.Throwable -> L2d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2d
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Throwable -> L2d
            byte[] r4 = r4.getBytes()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = "AES"
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r4 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r4 = javax.crypto.Cipher.getInstance(r4)     // Catch: java.lang.Throwable -> L2d
            r2 = 1
            r4.init(r2, r1, r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = "utf-8"
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> L2d
            byte[] r3 = r4.doFinal(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = a(r3)     // Catch: java.lang.Throwable -> L2d
            return r3
        L2d:
            r3 = 0
            return r3
    }

    private static java.lang.String a(byte[] r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r5.length
            if (r1 >= r2) goto L27
            r2 = r5[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            int r3 = r2.length()
            r4 = 1
            if (r3 != r4) goto L1d
            java.lang.String r3 = "0"
            r0.append(r3)
        L1d:
            java.lang.String r2 = r2.toUpperCase()
            r0.append(r2)
            int r1 = r1 + 1
            goto L6
        L27:
            java.lang.String r5 = r0.toString()
            return r5
    }
}
