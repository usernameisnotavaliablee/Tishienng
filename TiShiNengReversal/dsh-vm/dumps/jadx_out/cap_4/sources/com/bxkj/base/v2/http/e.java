package com.bxkj.base.v2.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class e {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements javax.net.ssl.X509TrustManager {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(java.security.cert.X509Certificate[] r1, java.lang.String r2) {
                r0 = this;
                return
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(java.security.cert.X509Certificate[] r1, java.lang.String r2) {
                r0 = this;
                return
        }

        @Override // javax.net.ssl.X509TrustManager
        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                r1 = this;
                r0 = 0
                java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements javax.net.ssl.HostnameVerifier {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(java.lang.String r1, javax.net.ssl.SSLSession r2) {
                r0 = this;
                r1 = 1
                return r1
        }
    }

    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    public static javax.net.ssl.HostnameVerifier a() {
            com.bxkj.base.v2.http.e$b r0 = new com.bxkj.base.v2.http.e$b
            r0.<init>()
            return r0
    }

    public static javax.net.ssl.SSLSocketFactory b() {
            java.lang.String r0 = "SSL"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch: java.lang.Exception -> L18
            javax.net.ssl.TrustManager[] r1 = c()     // Catch: java.lang.Exception -> L18
            java.security.SecureRandom r2 = new java.security.SecureRandom     // Catch: java.lang.Exception -> L18
            r2.<init>()     // Catch: java.lang.Exception -> L18
            r3 = 0
            r0.init(r3, r1, r2)     // Catch: java.lang.Exception -> L18
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()     // Catch: java.lang.Exception -> L18
            return r0
        L18:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public static javax.net.ssl.TrustManager[] c() {
            com.bxkj.base.v2.http.e$a r0 = new com.bxkj.base.v2.http.e$a
            r0.<init>()
            r1 = 1
            javax.net.ssl.TrustManager[] r1 = new javax.net.ssl.TrustManager[r1]
            r2 = 0
            r1[r2] = r0
            return r1
    }
}
