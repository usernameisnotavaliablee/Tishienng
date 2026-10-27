package com.bxkj.base.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class e {
    private static byte[] a;

    static {
            r0 = 8
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [1, 2, 3, 4, 5, 6, 7, 8} // fill-array
            com.bxkj.base.util.e.a = r0
            return
    }

    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r3, java.lang.String r4) {
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec
            byte[] r1 = com.bxkj.base.util.e.a
            r0.<init>(r1)
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
            byte[] r4 = r4.getBytes()
            java.lang.String r2 = "DES"
            r1.<init>(r4, r2)
            java.lang.String r4 = "DES/CBC/PKCS5Padding"
            javax.crypto.Cipher r4 = javax.crypto.Cipher.getInstance(r4)     // Catch: java.lang.Throwable -> L19
            goto L1a
        L19:
            r4 = 0
        L1a:
            r2 = 1
            r4.init(r2, r1, r0)     // Catch: java.lang.Throwable -> L1e
        L1e:
            r0 = 0
            byte[] r0 = new byte[r0]
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L29
            byte[] r0 = r4.doFinal(r3)     // Catch: java.lang.Throwable -> L29
        L29:
            java.lang.String r3 = cn.bluemobi.dylan.base.utils.b.b(r0)
            return r3
    }
}
