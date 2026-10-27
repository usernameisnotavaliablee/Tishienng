package com.bxkj.base.v2.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class d {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.base.v2.http.d a = null;

    static {
            com.bxkj.base.v2.http.d r0 = new com.bxkj.base.v2.http.d
            r0.<init>()
            com.bxkj.base.v2.http.d.a = r0
            return
    }

    private d() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final javax.net.ssl.SSLSocketFactory a() {
            r4 = this;
            java.lang.String r0 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)
            javax.net.ssl.X509TrustManager r1 = r4.b()
            r2 = 1
            javax.net.ssl.X509TrustManager[] r2 = new javax.net.ssl.X509TrustManager[r2]
            r3 = 0
            r2[r3] = r1
            javax.net.ssl.TrustManager[] r2 = (javax.net.ssl.TrustManager[]) r2
            r1 = 0
            r0.init(r1, r2, r1)
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()
            java.lang.String r1 = "getSocketFactory(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final javax.net.ssl.X509TrustManager b() {
            r2 = this;
            java.lang.String r0 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()
            javax.net.ssl.TrustManagerFactory r0 = javax.net.ssl.TrustManagerFactory.getInstance(r0)
            r1 = 0
            r0.init(r1)
            javax.net.ssl.TrustManager[] r0 = r0.getTrustManagers()
            r1 = 0
            r0 = r0[r1]
            java.lang.String r1 = "null cannot be cast to non-null type javax.net.ssl.X509TrustManager"
            kotlin.jvm.internal.g0.n(r0, r1)
            javax.net.ssl.X509TrustManager r0 = (javax.net.ssl.X509TrustManager) r0
            return r0
    }
}
