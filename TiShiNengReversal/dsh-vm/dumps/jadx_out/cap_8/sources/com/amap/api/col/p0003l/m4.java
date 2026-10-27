package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class m4 {
    public m4() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r7) {
            java.lang.String r0 = "gfm"
            java.lang.String r1 = "MD5"
            r2 = 0
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto Lc
            return r2
        Lc:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L50
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L50
            boolean r7 = r3.isFile()     // Catch: java.lang.Throwable -> L50
            if (r7 == 0) goto L53
            boolean r7 = r3.exists()     // Catch: java.lang.Throwable -> L50
            if (r7 != 0) goto L1e
            goto L53
        L1e:
            r7 = 2048(0x800, float:2.87E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = "ETUQ1"
            java.lang.String r4 = com.amap.api.col.p0003l.q4.u(r4)     // Catch: java.lang.Throwable -> L50
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)     // Catch: java.lang.Throwable -> L50
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L50
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L50
        L31:
            int r3 = r5.read(r7)     // Catch: java.lang.Throwable -> L3d
            r6 = -1
            if (r3 == r6) goto L3f
            r6 = 0
            r4.update(r7, r6, r3)     // Catch: java.lang.Throwable -> L3d
            goto L31
        L3d:
            r7 = move-exception
            goto L54
        L3f:
            byte[] r7 = r4.digest()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r7 = com.amap.api.col.p0003l.q4.A(r7)     // Catch: java.lang.Throwable -> L3d
            r5.close()     // Catch: java.io.IOException -> L4b
            return r7
        L4b:
            r2 = move-exception
            com.amap.api.col.p0003l.r5.e(r2, r1, r0)
            return r7
        L50:
            r7 = move-exception
            r5 = r2
            goto L54
        L53:
            return r2
        L54:
            com.amap.api.col.p0003l.r5.e(r7, r1, r0)     // Catch: java.lang.Throwable -> L62
            if (r5 == 0) goto L61
            r5.close()     // Catch: java.io.IOException -> L5d
            goto L61
        L5d:
            r7 = move-exception
            com.amap.api.col.p0003l.r5.e(r7, r1, r0)
        L61:
            return r2
        L62:
            r7 = move-exception
            if (r5 == 0) goto L6d
            r5.close()     // Catch: java.io.IOException -> L69
            goto L6d
        L69:
            r2 = move-exception
            com.amap.api.col.p0003l.r5.e(r2, r1, r0)
        L6d:
            throw r7
    }

    public static java.lang.String b(byte[] r1) {
            java.lang.String r0 = "ETUQ1"
            java.lang.String r0 = com.amap.api.col.p0003l.q4.u(r0)
            byte[] r1 = c(r1, r0)
            java.lang.String r1 = com.amap.api.col.p0003l.q4.A(r1)
            return r1
    }

    public static byte[] c(byte[] r1, java.lang.String r2) {
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch: java.lang.Throwable -> Lc
            r2.update(r1)     // Catch: java.lang.Throwable -> Lc
            byte[] r1 = r2.digest()     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r1 = move-exception
            java.lang.String r2 = "MD5"
            java.lang.String r0 = "gmb"
            com.amap.api.col.p0003l.r5.e(r1, r2, r0)
            r1 = 0
            return r1
    }

    public static java.lang.String d(java.lang.String r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            byte[] r0 = f(r0)
            java.lang.String r0 = com.amap.api.col.p0003l.q4.A(r0)
            return r0
    }

    public static java.lang.String e(java.lang.String r0) {
            byte[] r0 = g(r0)
            java.lang.String r0 = com.amap.api.col.p0003l.q4.D(r0)
            return r0
    }

    private static byte[] f(java.lang.String r2) {
            byte[] r2 = h(r2)     // Catch: java.lang.Throwable -> L5
            return r2
        L5:
            r2 = move-exception
            java.lang.String r0 = "MD5"
            java.lang.String r1 = "gmb"
            com.amap.api.col.p0003l.r5.e(r2, r0, r1)
            r2 = 0
            byte[] r2 = new byte[r2]
            return r2
    }

    private static byte[] g(java.lang.String r0) {
            byte[] r0 = h(r0)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = 0
            byte[] r0 = new byte[r0]
            return r0
    }

    private static byte[] h(java.lang.String r1) throws java.security.NoSuchAlgorithmException, java.io.UnsupportedEncodingException {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.lang.String r0 = "ETUQ1"
            java.lang.String r0 = com.amap.api.col.p0003l.q4.u(r0)
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            byte[] r1 = com.amap.api.col.p0003l.q4.o(r1)
            r0.update(r1)
            byte[] r1 = r0.digest()
            return r1
    }
}
