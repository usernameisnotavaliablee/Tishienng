package com.huawei.secure.android.common.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class j {
    private static final java.lang.String a = "SecureX509SingleInstance";
    private static volatile com.huawei.secure.android.common.ssl.k b;

    static {
            return
    }

    private j() {
            r0 = this;
            r0.<init>()
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static com.huawei.secure.android.common.ssl.k a(android.content.Context r5) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.KeyStoreException, java.io.IOException {
            long r0 = java.lang.System.currentTimeMillis()
            if (r5 == 0) goto L6e
            com.huawei.secure.android.common.ssl.util.c.b(r5)
            com.huawei.secure.android.common.ssl.k r2 = com.huawei.secure.android.common.ssl.j.b
            if (r2 != 0) goto L4b
            java.lang.Class<com.huawei.secure.android.common.ssl.j> r2 = com.huawei.secure.android.common.ssl.j.class
            monitor-enter(r2)
            com.huawei.secure.android.common.ssl.k r3 = com.huawei.secure.android.common.ssl.j.b     // Catch: java.lang.Throwable -> L19
            if (r3 != 0) goto L47
            java.io.InputStream r3 = com.huawei.secure.android.common.ssl.util.a.o(r5)     // Catch: java.lang.Throwable -> L19 java.lang.RuntimeException -> L1b
            goto L23
        L19:
            r5 = move-exception
            goto L49
        L1b:
            java.lang.String r3 = com.huawei.secure.android.common.ssl.j.a     // Catch: java.lang.Throwable -> L19
            java.lang.String r4 = "get files bks error"
            com.huawei.secure.android.common.ssl.util.h.d(r3, r4)     // Catch: java.lang.Throwable -> L19
            r3 = 0
        L23:
            if (r3 != 0) goto L37
            java.lang.String r3 = com.huawei.secure.android.common.ssl.j.a     // Catch: java.lang.Throwable -> L19
            java.lang.String r4 = "get assets bks"
            com.huawei.secure.android.common.ssl.util.h.e(r3, r4)     // Catch: java.lang.Throwable -> L19
            android.content.res.AssetManager r5 = r5.getAssets()     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = "hmsrootcas.bks"
            java.io.InputStream r3 = r5.open(r3)     // Catch: java.lang.Throwable -> L19
            goto L3e
        L37:
            java.lang.String r5 = com.huawei.secure.android.common.ssl.j.a     // Catch: java.lang.Throwable -> L19
            java.lang.String r4 = "get files bks"
            com.huawei.secure.android.common.ssl.util.h.e(r5, r4)     // Catch: java.lang.Throwable -> L19
        L3e:
            com.huawei.secure.android.common.ssl.k r5 = new com.huawei.secure.android.common.ssl.k     // Catch: java.lang.Throwable -> L19
            java.lang.String r4 = ""
            r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> L19
            com.huawei.secure.android.common.ssl.j.b = r5     // Catch: java.lang.Throwable -> L19
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            goto L4b
        L49:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r5
        L4b:
            java.lang.String r5 = com.huawei.secure.android.common.ssl.j.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "SecureX509TrustManager getInstance: cost : "
            r2.append(r3)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            r2.append(r3)
            java.lang.String r0 = " ms"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.huawei.secure.android.common.ssl.util.h.b(r5, r0)
            com.huawei.secure.android.common.ssl.k r5 = com.huawei.secure.android.common.ssl.j.b
            return r5
        L6e:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "context is null"
            r5.<init>(r0)
            throw r5
    }

    @java.lang.Deprecated
    public static void b(java.io.InputStream r5) {
            java.lang.String r0 = com.huawei.secure.android.common.ssl.j.a
            java.lang.String r1 = "update bks"
            com.huawei.secure.android.common.ssl.util.h.e(r0, r1)
            long r1 = java.lang.System.currentTimeMillis()
            if (r5 == 0) goto L24
            com.huawei.secure.android.common.ssl.k r3 = com.huawei.secure.android.common.ssl.j.b
            if (r3 == 0) goto L24
            com.huawei.secure.android.common.ssl.k r3 = new com.huawei.secure.android.common.ssl.k
            java.lang.String r4 = ""
            r3.<init>(r5, r4)
            com.huawei.secure.android.common.ssl.j.b = r3
            com.huawei.secure.android.common.ssl.k r5 = com.huawei.secure.android.common.ssl.j.b
            com.huawei.secure.android.common.ssl.h.b(r5)
            com.huawei.secure.android.common.ssl.k r5 = com.huawei.secure.android.common.ssl.j.b
            com.huawei.secure.android.common.ssl.g.b(r5)
        L24:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = "SecureX509TrustManager update bks cost : "
            r5.append(r3)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            r5.append(r3)
            java.lang.String r1 = " ms"
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            com.huawei.secure.android.common.ssl.util.h.e(r0, r5)
            return
    }

    public static void c(java.io.InputStream r5, java.security.SecureRandom r6) {
            java.lang.String r0 = com.huawei.secure.android.common.ssl.j.a
            java.lang.String r1 = "update bks"
            com.huawei.secure.android.common.ssl.util.h.e(r0, r1)
            long r1 = java.lang.System.currentTimeMillis()
            if (r5 == 0) goto L24
            com.huawei.secure.android.common.ssl.k r3 = com.huawei.secure.android.common.ssl.j.b
            if (r3 == 0) goto L24
            com.huawei.secure.android.common.ssl.k r3 = new com.huawei.secure.android.common.ssl.k
            java.lang.String r4 = ""
            r3.<init>(r5, r4)
            com.huawei.secure.android.common.ssl.j.b = r3
            com.huawei.secure.android.common.ssl.k r5 = com.huawei.secure.android.common.ssl.j.b
            com.huawei.secure.android.common.ssl.h.c(r5, r6)
            com.huawei.secure.android.common.ssl.k r5 = com.huawei.secure.android.common.ssl.j.b
            com.huawei.secure.android.common.ssl.g.c(r5, r6)
        L24:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "SecureX509TrustManager update bks cost : "
            r5.append(r6)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            r5.append(r3)
            java.lang.String r6 = " ms"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.huawei.secure.android.common.ssl.util.h.e(r0, r5)
            return
    }
}
