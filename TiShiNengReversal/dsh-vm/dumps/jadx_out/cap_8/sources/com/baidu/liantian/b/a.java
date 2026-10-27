package com.baidu.liantian.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a(java.io.File r6, java.io.File r7, byte[] r8) {
            boolean r0 = r6.exists()
            r1 = -1
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L42
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L42
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L40
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L40
            r7 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r7]     // Catch: java.lang.Throwable -> L3e
        L17:
            int r3 = r2.read(r0)     // Catch: java.lang.Throwable -> L3e
            r4 = 0
            if (r3 == r1) goto L36
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L3e
            if (r3 >= r7) goto L29
            byte[] r5 = new byte[r3]     // Catch: java.lang.Throwable -> L3e
            java.lang.System.arraycopy(r0, r4, r5, r4, r3)     // Catch: java.lang.Throwable -> L3e
            goto L2a
        L29:
            r5 = r0
        L2a:
            byte[] r3 = a(r8, r5, r4)     // Catch: java.lang.Throwable -> L3e
            int r4 = r3.length     // Catch: java.lang.Throwable -> L3e
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L3e
            r6.write(r3)     // Catch: java.lang.Throwable -> L3e
            goto L17
        L36:
            r2.close()     // Catch: java.lang.Throwable -> L39
        L39:
            r6.close()     // Catch: java.lang.Throwable -> L3c
        L3c:
            r1 = 0
            goto L52
        L3e:
            r0 = r2
            goto L43
        L40:
            r6 = r0
            goto L3e
        L42:
            r6 = r0
        L43:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L4d
            r0.close()     // Catch: java.lang.Throwable -> L4c
            goto L4d
        L4c:
        L4d:
            if (r6 == 0) goto L52
            r6.close()     // Catch: java.lang.Throwable -> L52
        L52:
            return r1
        L53:
            r7 = move-exception
            if (r0 == 0) goto L5b
            r0.close()     // Catch: java.lang.Throwable -> L5a
            goto L5b
        L5a:
        L5b:
            if (r6 == 0) goto L60
            r6.close()     // Catch: java.lang.Throwable -> L60
        L60:
            throw r7
    }

    public static byte[] a(java.lang.String r2, java.lang.String r3, byte[] r4) {
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Throwable -> L23
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "AES"
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r3 = javax.crypto.Cipher.getInstance(r3)     // Catch: java.lang.Throwable -> L23
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> L23
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Throwable -> L23
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L23
            r2 = 2
            r3.init(r2, r0, r1)     // Catch: java.lang.Throwable -> L23
            byte[] r2 = r3.doFinal(r4)     // Catch: java.lang.Throwable -> L23
            return r2
        L23:
            com.baidu.liantian.b.e.a()
            r2 = 0
            return r2
    }

    public static byte[] a(byte[] r5, byte[] r6) {
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Throwable -> L3a
            java.lang.String r1 = "AES"
            r0.<init>(r5, r1)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r5 = "AES/CBC/PKCS7Padding"
            javax.crypto.Cipher r5 = javax.crypto.Cipher.getInstance(r5)     // Catch: java.lang.Throwable -> L3a
            r1 = 16
            byte[] r2 = new byte[r1]     // Catch: java.lang.Throwable -> L3a
            r3 = 0
            r4 = 0
        L13:
            if (r4 >= r1) goto L1a
            r2[r4] = r3     // Catch: java.lang.Throwable -> L3a
            int r4 = r4 + 1
            goto L13
        L1a:
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3a
            r2 = 1
            r5.init(r2, r0, r1)     // Catch: java.lang.Throwable -> L3a
            byte[] r5 = r5.doFinal(r6)     // Catch: java.lang.Throwable -> L3a
            byte[] r6 = com.baidu.liantian.b.o.c(r6)     // Catch: java.lang.Throwable -> L3a
            int r0 = r5.length     // Catch: java.lang.Throwable -> L3a
            int r1 = r6.length     // Catch: java.lang.Throwable -> L3a
            int r0 = r0 + r1
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L3a
            int r1 = r5.length     // Catch: java.lang.Throwable -> L3a
            java.lang.System.arraycopy(r5, r3, r0, r3, r1)     // Catch: java.lang.Throwable -> L3a
            int r5 = r5.length     // Catch: java.lang.Throwable -> L3a
            int r1 = r6.length     // Catch: java.lang.Throwable -> L3a
            java.lang.System.arraycopy(r6, r3, r0, r5, r1)     // Catch: java.lang.Throwable -> L3a
            return r0
        L3a:
            com.baidu.liantian.b.e.a()
            r5 = 0
            return r5
    }

    public static byte[] a(byte[] r5, byte[] r6, boolean r7) {
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "AES"
            r0.<init>(r5, r1)     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = "AES/CBC/PKCS7Padding"
            javax.crypto.Cipher r5 = javax.crypto.Cipher.getInstance(r5)     // Catch: java.lang.Throwable -> L34
            r1 = 16
            byte[] r2 = new byte[r1]     // Catch: java.lang.Throwable -> L34
            r3 = 0
            r4 = 0
        L13:
            if (r4 >= r1) goto L1a
            r2[r4] = r3     // Catch: java.lang.Throwable -> L34
            int r4 = r4 + 1
            goto L13
        L1a:
            javax.crypto.spec.IvParameterSpec r4 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> L34
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L34
            r2 = 2
            r5.init(r2, r0, r4)     // Catch: java.lang.Throwable -> L34
            if (r7 == 0) goto L2f
            int r7 = r6.length     // Catch: java.lang.Throwable -> L34
            int r7 = r7 - r1
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L34
            int r0 = r6.length     // Catch: java.lang.Throwable -> L34
            int r0 = r0 - r1
            java.lang.System.arraycopy(r6, r3, r7, r3, r0)     // Catch: java.lang.Throwable -> L34
            r6 = r7
        L2f:
            byte[] r5 = r5.doFinal(r6)     // Catch: java.lang.Throwable -> L34
            return r5
        L34:
            com.baidu.liantian.b.e.a()
            r5 = 0
            return r5
    }
}
