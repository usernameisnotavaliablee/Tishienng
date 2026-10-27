package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class j4 {
    private static final char[] a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f3549b = null;

    static {
            r0 = 64
            char[] r0 = new char[r0]
            r0 = {x005a: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47} // fill-array
            com.amap.api.col.p0003l.j4.a = r0
            r0 = 128(0x80, float:1.8E-43)
            byte[] r1 = new byte[r0]
            com.amap.api.col.p0003l.j4.f3549b = r1
            r1 = 0
        L10:
            if (r1 >= r0) goto L1a
            byte[] r2 = com.amap.api.col.p0003l.j4.f3549b
            r3 = -1
            r2[r1] = r3
            int r1 = r1 + 1
            goto L10
        L1a:
            r0 = 65
        L1c:
            r1 = 90
            if (r0 > r1) goto L2a
            byte[] r1 = com.amap.api.col.p0003l.j4.f3549b
            int r2 = r0 + (-65)
            byte r2 = (byte) r2
            r1[r0] = r2
            int r0 = r0 + 1
            goto L1c
        L2a:
            r0 = 97
        L2c:
            r1 = 122(0x7a, float:1.71E-43)
            if (r0 > r1) goto L3a
            byte[] r1 = com.amap.api.col.p0003l.j4.f3549b
            int r2 = r0 + (-71)
            byte r2 = (byte) r2
            r1[r0] = r2
            int r0 = r0 + 1
            goto L2c
        L3a:
            r0 = 48
        L3c:
            r1 = 57
            if (r0 > r1) goto L4a
            byte[] r1 = com.amap.api.col.p0003l.j4.f3549b
            int r2 = r0 + 4
            byte r2 = (byte) r2
            r1[r0] = r2
            int r0 = r0 + 1
            goto L3c
        L4a:
            byte[] r0 = com.amap.api.col.p0003l.j4.f3549b
            r1 = 62
            r2 = 43
            r0[r2] = r1
            r1 = 63
            r2 = 47
            r0[r2] = r1
            return
    }

    public j4() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r0) {
            byte[] r0 = g(r0)
            java.lang.String r0 = com.amap.api.col.p0003l.q4.g(r0)
            return r0
    }

    public static byte[] b(byte[] r4) throws java.security.cert.CertificateException, java.security.spec.InvalidKeySpecException, java.security.NoSuchAlgorithmException, java.lang.NullPointerException, java.io.IOException, java.security.InvalidKeyException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
            java.lang.String r0 = "EQUVT"
            java.lang.String r0 = com.amap.api.col.p0003l.q4.u(r0)
            javax.crypto.KeyGenerator r0 = javax.crypto.KeyGenerator.getInstance(r0)
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            r2 = 256(0x100, float:3.59E-43)
            r0.init(r2)
            javax.crypto.SecretKey r0 = r0.generateKey()
            byte[] r0 = r0.getEncoded()
            java.security.PublicKey r2 = com.amap.api.col.p0003l.q4.x()
            if (r2 != 0) goto L22
            return r1
        L22:
            byte[] r1 = c(r0, r2)
            byte[] r4 = d(r0, r4)
            int r0 = r1.length
            int r2 = r4.length
            int r0 = r0 + r2
            byte[] r0 = new byte[r0]
            int r2 = r1.length
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r0, r3, r2)
            int r1 = r1.length
            int r2 = r4.length
            java.lang.System.arraycopy(r4, r3, r0, r1, r2)
            return r0
    }

    static byte[] c(byte[] r2, java.security.Key r3) throws java.security.NoSuchAlgorithmException, javax.crypto.NoSuchPaddingException, java.security.InvalidKeyException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
            java.lang.String r0 = "CUlNBL0VDQi9QS0NTMVBhZGRpbmc"
            java.lang.String r0 = com.amap.api.col.p0003l.q4.u(r0)
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)
            r1 = 1
            r0.init(r1, r3)
            byte[] r2 = r0.doFinal(r2)
            return r2
    }

    private static byte[] d(byte[] r1, byte[] r2) {
            byte[] r0 = com.amap.api.col.p0003l.q4.v()     // Catch: java.lang.Throwable -> L9
            byte[] r1 = j(r1, r2, r0)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            r1 = move-exception
            java.lang.String r2 = "er"
            java.lang.String r0 = "asEn"
            com.amap.api.col.p0003l.r5.e(r1, r2, r0)
            r1 = 0
            return r1
    }

    public static byte[] e(byte[] r2, byte[] r3, byte[] r4) throws java.lang.Exception {
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec
            r0.<init>(r4)
            javax.crypto.spec.SecretKeySpec r4 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r1 = "EQUVT"
            java.lang.String r1 = com.amap.api.col.p0003l.q4.u(r1)
            r4.<init>(r2, r1)
            java.lang.String r2 = "CQUVTL0NCQy9QS0NTNVBhZGRpbmc"
            java.lang.String r2 = com.amap.api.col.p0003l.q4.u(r2)
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)
            r1 = 2
            r2.init(r1, r4, r0)
            byte[] r2 = r2.doFinal(r3)
            return r2
    }

    public static java.lang.String f(byte[] r2) {
            java.lang.String r2 = k(r2)     // Catch: java.lang.Throwable -> L5
            return r2
        L5:
            r2 = move-exception
            java.lang.String r0 = "er"
            java.lang.String r1 = "e64"
            com.amap.api.col.p0003l.r5.e(r2, r0, r1)
            r2 = 0
            return r2
    }

    public static byte[] g(java.lang.String r8) {
            r0 = 0
            if (r8 != 0) goto L6
            byte[] r8 = new byte[r0]
            return r8
        L6:
            byte[] r8 = com.amap.api.col.p0003l.q4.o(r8)
            int r1 = r8.length
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>(r1)
        L10:
            if (r0 >= r1) goto L96
        L12:
            byte[] r3 = com.amap.api.col.p0003l.j4.f3549b
            int r4 = r0 + 1
            r0 = r8[r0]
            r0 = r3[r0]
            r3 = -1
            if (r4 >= r1) goto L22
            if (r0 == r3) goto L20
            goto L22
        L20:
            r0 = r4
            goto L12
        L22:
            if (r0 == r3) goto L96
        L24:
            byte[] r5 = com.amap.api.col.p0003l.j4.f3549b
            int r6 = r4 + 1
            r4 = r8[r4]
            r4 = r5[r4]
            if (r6 >= r1) goto L33
            if (r4 == r3) goto L31
            goto L33
        L31:
            r4 = r6
            goto L24
        L33:
            if (r4 == r3) goto L96
            int r0 = r0 << 2
            r5 = r4 & 48
            int r5 = r5 >>> 4
            r0 = r0 | r5
            r2.write(r0)
        L3f:
            if (r6 != r1) goto L46
            byte[] r8 = r2.toByteArray()
            return r8
        L46:
            int r0 = r6 + 1
            r5 = r8[r6]
            r6 = 61
            if (r5 != r6) goto L53
            byte[] r8 = r2.toByteArray()
            return r8
        L53:
            byte[] r7 = com.amap.api.col.p0003l.j4.f3549b
            r5 = r7[r5]
            if (r0 >= r1) goto L5e
            if (r5 == r3) goto L5c
            goto L5e
        L5c:
            r6 = r0
            goto L3f
        L5e:
            if (r5 == r3) goto L96
            r4 = r4 & 15
            int r4 = r4 << 4
            r7 = r5 & 60
            int r7 = r7 >>> 2
            r4 = r4 | r7
            r2.write(r4)
        L6c:
            if (r0 != r1) goto L73
            byte[] r8 = r2.toByteArray()
            return r8
        L73:
            int r4 = r0 + 1
            r0 = r8[r0]
            if (r0 != r6) goto L7e
            byte[] r8 = r2.toByteArray()
            return r8
        L7e:
            byte[] r7 = com.amap.api.col.p0003l.j4.f3549b
            r0 = r7[r0]
            if (r4 >= r1) goto L89
            if (r0 == r3) goto L87
            goto L89
        L87:
            r0 = r4
            goto L6c
        L89:
            if (r0 == r3) goto L96
            r3 = r5 & 3
            int r3 = r3 << 6
            r0 = r0 | r3
            r2.write(r0)
            r0 = r4
            goto L10
        L96:
            byte[] r8 = r2.toByteArray()
            return r8
    }

    public static byte[] h(byte[] r0, byte[] r1, byte[] r2) throws javax.crypto.IllegalBlockSizeException, java.security.InvalidKeyException, javax.crypto.BadPaddingException, java.security.NoSuchAlgorithmException, javax.crypto.NoSuchPaddingException {
            byte[] r0 = j(r0, r1, r2)
            return r0
    }

    public static java.lang.String i(byte[] r0) {
            java.lang.String r0 = k(r0)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    private static byte[] j(byte[] r2, byte[] r3, byte[] r4) throws javax.crypto.NoSuchPaddingException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException {
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec
            r0.<init>(r4)
            javax.crypto.spec.SecretKeySpec r4 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r1 = "EQUVT"
            java.lang.String r1 = com.amap.api.col.p0003l.q4.u(r1)
            r4.<init>(r2, r1)
            java.lang.String r2 = "CQUVTL0NCQy9QS0NTNVBhZGRpbmc"
            java.lang.String r2 = com.amap.api.col.p0003l.q4.u(r2)
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)
            r1 = 1
            r2.init(r1, r4, r0)     // Catch: java.security.InvalidAlgorithmParameterException -> L1e
        L1e:
            byte[] r2 = r2.doFinal(r3)
            return r2
    }

    private static java.lang.String k(byte[] r8) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            int r1 = r8.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L86
            int r3 = r2 + 1
            r4 = r8[r2]
            r5 = r4 & 255(0xff, float:3.57E-43)
            if (r3 != r1) goto L29
            char[] r8 = com.amap.api.col.p0003l.j4.a
            int r1 = r5 >>> 2
            char r1 = r8[r1]
            r0.append(r1)
            r1 = r4 & 3
            int r1 = r1 << 4
            char r8 = r8[r1]
            r0.append(r8)
            java.lang.String r8 = "=="
            r0.append(r8)
            goto L86
        L29:
            int r6 = r2 + 2
            r3 = r8[r3]
            if (r6 != r1) goto L55
            char[] r8 = com.amap.api.col.p0003l.j4.a
            int r1 = r5 >>> 2
            char r1 = r8[r1]
            r0.append(r1)
            r1 = r4 & 3
            int r1 = r1 << 4
            r2 = r3 & 240(0xf0, float:3.36E-43)
            int r2 = r2 >>> 4
            r1 = r1 | r2
            char r1 = r8[r1]
            r0.append(r1)
            r1 = r3 & 15
            int r1 = r1 << 2
            char r8 = r8[r1]
            r0.append(r8)
            java.lang.String r8 = "="
            r0.append(r8)
            goto L86
        L55:
            int r2 = r2 + 3
            r6 = r8[r6]
            char[] r7 = com.amap.api.col.p0003l.j4.a
            int r5 = r5 >>> 2
            char r5 = r7[r5]
            r0.append(r5)
            r4 = r4 & 3
            int r4 = r4 << 4
            r5 = r3 & 240(0xf0, float:3.36E-43)
            int r5 = r5 >>> 4
            r4 = r4 | r5
            char r4 = r7[r4]
            r0.append(r4)
            r3 = r3 & 15
            int r3 = r3 << 2
            r4 = r6 & 192(0xc0, float:2.69E-43)
            int r4 = r4 >>> 6
            r3 = r3 | r4
            char r3 = r7[r3]
            r0.append(r3)
            r3 = r6 & 63
            char r3 = r7[r3]
            r0.append(r3)
            goto L7
        L86:
            java.lang.String r8 = r0.toString()
            return r8
    }
}
