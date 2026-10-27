package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class g1 {
    public g1() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            byte[] r0 = e(r0)
            java.lang.String r0 = com.amap.api.col.s.j1.A(r0)
            return r0
    }

    public static java.lang.String b(byte[] r1) {
            java.lang.String r0 = "ETUQ1"
            java.lang.String r0 = com.amap.api.col.s.j1.t(r0)
            byte[] r1 = c(r1, r0)
            java.lang.String r1 = com.amap.api.col.s.j1.A(r1)
            return r1
    }

    private static byte[] c(byte[] r1, java.lang.String r2) {
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch: java.lang.Throwable -> Lc
            r2.update(r1)     // Catch: java.lang.Throwable -> Lc
            byte[] r1 = r2.digest()     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r1 = move-exception
            java.lang.String r2 = "MD5"
            java.lang.String r0 = "gmb"
            com.amap.api.col.s.d2.e(r1, r2, r0)
            r1 = 0
            return r1
    }

    public static java.lang.String d(java.lang.String r0) {
            byte[] r0 = f(r0)
            java.lang.String r0 = com.amap.api.col.s.j1.B(r0)
            return r0
    }

    private static byte[] e(java.lang.String r2) {
            byte[] r2 = g(r2)     // Catch: java.lang.Throwable -> L5
            return r2
        L5:
            r2 = move-exception
            java.lang.String r0 = "MD5"
            java.lang.String r1 = "gmb"
            com.amap.api.col.s.d2.e(r2, r0, r1)
            r2 = 0
            byte[] r2 = new byte[r2]
            return r2
    }

    private static byte[] f(java.lang.String r0) {
            byte[] r0 = g(r0)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = 0
            byte[] r0 = new byte[r0]
            return r0
    }

    private static byte[] g(java.lang.String r1) throws java.security.NoSuchAlgorithmException, java.io.UnsupportedEncodingException {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.lang.String r0 = "ETUQ1"
            java.lang.String r0 = com.amap.api.col.s.j1.t(r0)
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            byte[] r1 = com.amap.api.col.s.j1.o(r1)
            r0.update(r1)
            byte[] r1 = r0.digest()
            return r1
    }
}
