package org.apache.commons.net.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d {
    private d() {
            r0 = this;
            r0.<init>()
            return
    }

    public static javax.net.ssl.SSLContext a(java.lang.String r4, javax.net.ssl.KeyManager r5, javax.net.ssl.TrustManager r6) throws java.io.IOException {
            r0 = 0
            r1 = 1
            r2 = 0
            if (r5 != 0) goto L7
            r3 = r2
            goto Lb
        L7:
            javax.net.ssl.KeyManager[] r3 = new javax.net.ssl.KeyManager[r1]
            r3[r0] = r5
        Lb:
            if (r6 != 0) goto Le
            goto L12
        Le:
            javax.net.ssl.TrustManager[] r2 = new javax.net.ssl.TrustManager[r1]
            r2[r0] = r6
        L12:
            javax.net.ssl.SSLContext r4 = b(r4, r3, r2)
            return r4
    }

    public static javax.net.ssl.SSLContext b(java.lang.String r1, javax.net.ssl.KeyManager[] r2, javax.net.ssl.TrustManager[] r3) throws java.io.IOException {
            javax.net.ssl.SSLContext r1 = javax.net.ssl.SSLContext.getInstance(r1)     // Catch: java.security.GeneralSecurityException -> L9
            r0 = 0
            r1.init(r2, r3, r0)     // Catch: java.security.GeneralSecurityException -> L9
            return r1
        L9:
            r1 = move-exception
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Could not initialize SSL context"
            r2.<init>(r3)
            r2.initCause(r1)
            throw r2
    }
}
