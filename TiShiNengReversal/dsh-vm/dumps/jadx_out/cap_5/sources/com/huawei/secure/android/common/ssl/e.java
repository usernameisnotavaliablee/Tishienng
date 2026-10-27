package com.huawei.secure.android.common.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class e {
    private static final java.lang.String a = "SSFSecureX509SingleInstance";
    private static volatile com.huawei.secure.android.common.ssl.k b;

    static {
            return
    }

    private e() {
            r0 = this;
            r0.<init>()
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static com.huawei.secure.android.common.ssl.k a(android.content.Context r4) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.KeyStoreException, java.io.IOException {
            if (r4 == 0) goto L42
            com.huawei.secure.android.common.ssl.util.c.b(r4)
            com.huawei.secure.android.common.ssl.k r0 = com.huawei.secure.android.common.ssl.e.b
            if (r0 != 0) goto L3f
            java.lang.Class<com.huawei.secure.android.common.ssl.e> r0 = com.huawei.secure.android.common.ssl.e.class
            monitor-enter(r0)
            com.huawei.secure.android.common.ssl.k r1 = com.huawei.secure.android.common.ssl.e.b     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L3b
            java.io.InputStream r1 = com.huawei.secure.android.common.ssl.util.a.o(r4)     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L2a
            java.lang.String r1 = com.huawei.secure.android.common.ssl.e.a     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "get assets bks"
            com.huawei.secure.android.common.ssl.util.h.e(r1, r2)     // Catch: java.lang.Throwable -> L28
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = "hmsrootcas.bks"
            java.io.InputStream r1 = r4.open(r1)     // Catch: java.lang.Throwable -> L28
            goto L31
        L28:
            r4 = move-exception
            goto L3d
        L2a:
            java.lang.String r4 = com.huawei.secure.android.common.ssl.e.a     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "get files bks"
            com.huawei.secure.android.common.ssl.util.h.e(r4, r2)     // Catch: java.lang.Throwable -> L28
        L31:
            com.huawei.secure.android.common.ssl.k r4 = new com.huawei.secure.android.common.ssl.k     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = ""
            r3 = 1
            r4.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> L28
            com.huawei.secure.android.common.ssl.e.b = r4     // Catch: java.lang.Throwable -> L28
        L3b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            goto L3f
        L3d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r4
        L3f:
            com.huawei.secure.android.common.ssl.k r4 = com.huawei.secure.android.common.ssl.e.b
            return r4
        L42:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "context is null"
            r4.<init>(r0)
            throw r4
    }

    @java.lang.Deprecated
    public static void b(java.io.InputStream r7) {
            java.lang.String r0 = com.huawei.secure.android.common.ssl.e.a
            java.lang.String r1 = "update bks"
            com.huawei.secure.android.common.ssl.util.h.e(r0, r1)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = " ms"
            if (r7 == 0) goto L43
            com.huawei.secure.android.common.ssl.k r4 = com.huawei.secure.android.common.ssl.e.b
            if (r4 == 0) goto L43
            com.huawei.secure.android.common.ssl.k r4 = new com.huawei.secure.android.common.ssl.k
            java.lang.String r5 = ""
            r6 = 1
            r4.<init>(r7, r5, r6)
            com.huawei.secure.android.common.ssl.e.b = r4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r4 = "updateBks: new SecureX509TrustManager cost : "
            r7.append(r4)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r1
            r7.append(r4)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            com.huawei.secure.android.common.ssl.util.h.b(r0, r7)
            com.huawei.secure.android.common.ssl.k r7 = com.huawei.secure.android.common.ssl.e.b
            com.huawei.secure.android.common.ssl.d.b(r7)
            com.huawei.secure.android.common.ssl.k r7 = com.huawei.secure.android.common.ssl.e.b
            com.huawei.secure.android.common.ssl.c.b(r7)
        L43:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r4 = "update bks cost : "
            r7.append(r4)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r1
            r7.append(r4)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            com.huawei.secure.android.common.ssl.util.h.b(r0, r7)
            return
    }

    public static void c(java.io.InputStream r7, java.security.SecureRandom r8) {
            java.lang.String r0 = com.huawei.secure.android.common.ssl.e.a
            java.lang.String r1 = "update bks"
            com.huawei.secure.android.common.ssl.util.h.e(r0, r1)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = " ms"
            if (r7 == 0) goto L43
            com.huawei.secure.android.common.ssl.k r4 = com.huawei.secure.android.common.ssl.e.b
            if (r4 == 0) goto L43
            com.huawei.secure.android.common.ssl.k r4 = new com.huawei.secure.android.common.ssl.k
            java.lang.String r5 = ""
            r6 = 1
            r4.<init>(r7, r5, r6)
            com.huawei.secure.android.common.ssl.e.b = r4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r4 = "updateBks: new SecureX509TrustManager cost : "
            r7.append(r4)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r1
            r7.append(r4)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            com.huawei.secure.android.common.ssl.util.h.b(r0, r7)
            com.huawei.secure.android.common.ssl.k r7 = com.huawei.secure.android.common.ssl.e.b
            com.huawei.secure.android.common.ssl.d.c(r7, r8)
            com.huawei.secure.android.common.ssl.k r7 = com.huawei.secure.android.common.ssl.e.b
            com.huawei.secure.android.common.ssl.c.c(r7, r8)
        L43:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "update bks cost : "
            r7.append(r8)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r1
            r7.append(r4)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            com.huawei.secure.android.common.ssl.util.h.b(r0, r7)
            return
    }
}
