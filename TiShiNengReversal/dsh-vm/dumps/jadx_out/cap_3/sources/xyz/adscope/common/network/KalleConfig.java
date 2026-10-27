package xyz.adscope.common.network;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class KalleConfig {
    private final java.util.concurrent.Executor a;
    private final java.util.concurrent.Executor b;
    private final java.nio.charset.Charset c;
    private final xyz.adscope.common.network.Headers d;
    private final java.net.Proxy e;
    private final javax.net.ssl.SSLSocketFactory f;
    private final javax.net.ssl.HostnameVerifier g;
    private final int h;
    private final int i;
    private final xyz.adscope.common.network.Params j;
    private final xyz.adscope.common.network.simple.cache.CacheStore k;
    private final xyz.adscope.common.network.connect.Network l;
    private final xyz.adscope.common.network.connect.ConnectFactory m;
    private final xyz.adscope.common.network.cookie.CookieStore n;
    private final java.util.List<xyz.adscope.common.network.connect.Interceptor> o;
    private final xyz.adscope.common.network.simple.Converter p;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.network.KalleConfig$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {
        private java.util.concurrent.Executor a;
        private java.util.concurrent.Executor b;
        private java.nio.charset.Charset c;
        private xyz.adscope.common.network.Headers d;
        private java.net.Proxy e;
        private javax.net.ssl.SSLSocketFactory f;
        private javax.net.ssl.HostnameVerifier g;
        private int h;
        private int i;
        private xyz.adscope.common.network.Params.Builder j;
        private xyz.adscope.common.network.simple.cache.CacheStore k;
        private xyz.adscope.common.network.connect.Network l;
        private xyz.adscope.common.network.connect.ConnectFactory m;
        private xyz.adscope.common.network.cookie.CookieStore n;
        private java.util.List<xyz.adscope.common.network.connect.Interceptor> o;
        private xyz.adscope.common.network.simple.Converter p;

        private Builder() {
                r3 = this;
                r3.<init>()
                xyz.adscope.common.network.Headers r0 = new xyz.adscope.common.network.Headers
                r0.<init>()
                r3.d = r0
                xyz.adscope.common.network.Params$Builder r0 = xyz.adscope.common.network.Params.newBuilder()
                r3.j = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r3.o = r0
                xyz.adscope.common.network.Headers r0 = r3.d
                java.lang.String r1 = "Accept"
                java.lang.String r2 = "*/*"
                r0.set2(r1, r2)
                xyz.adscope.common.network.Headers r0 = r3.d
                java.lang.String r1 = "Accept-Encoding"
                java.lang.String r2 = "gzip, deflate"
                r0.set2(r1, r2)
                xyz.adscope.common.network.Headers r0 = r3.d
                java.lang.String r1 = "Content-Type"
                java.lang.String r2 = "application/x-www-form-urlencoded"
                r0.set2(r1, r2)
                xyz.adscope.common.network.Headers r0 = r3.d
                java.lang.String r1 = "Connection"
                java.lang.String r2 = "keep-alive"
                r0.set2(r1, r2)
                xyz.adscope.common.network.Headers r0 = r3.d
                java.lang.String r1 = xyz.adscope.common.network.Headers.VALUE_USER_AGENT
                java.lang.String r2 = "User-Agent"
                r0.set2(r2, r1)
                xyz.adscope.common.network.Headers r0 = r3.d
                java.lang.String r1 = xyz.adscope.common.network.Headers.VALUE_ACCEPT_LANGUAGE
                java.lang.String r2 = "Accept-Language"
                r0.set2(r2, r1)
                return
        }

        /* synthetic */ Builder(xyz.adscope.common.network.KalleConfig.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ java.util.concurrent.Executor a(xyz.adscope.common.network.KalleConfig.Builder r0) {
                java.util.concurrent.Executor r0 = r0.a
                return r0
        }

        static /* synthetic */ xyz.adscope.common.network.Params.Builder b(xyz.adscope.common.network.KalleConfig.Builder r0) {
                xyz.adscope.common.network.Params$Builder r0 = r0.j
                return r0
        }

        static /* synthetic */ xyz.adscope.common.network.simple.cache.CacheStore c(xyz.adscope.common.network.KalleConfig.Builder r0) {
                xyz.adscope.common.network.simple.cache.CacheStore r0 = r0.k
                return r0
        }

        static /* synthetic */ xyz.adscope.common.network.connect.Network d(xyz.adscope.common.network.KalleConfig.Builder r0) {
                xyz.adscope.common.network.connect.Network r0 = r0.l
                return r0
        }

        static /* synthetic */ xyz.adscope.common.network.connect.ConnectFactory e(xyz.adscope.common.network.KalleConfig.Builder r0) {
                xyz.adscope.common.network.connect.ConnectFactory r0 = r0.m
                return r0
        }

        static /* synthetic */ xyz.adscope.common.network.cookie.CookieStore f(xyz.adscope.common.network.KalleConfig.Builder r0) {
                xyz.adscope.common.network.cookie.CookieStore r0 = r0.n
                return r0
        }

        static /* synthetic */ java.util.List g(xyz.adscope.common.network.KalleConfig.Builder r0) {
                java.util.List<xyz.adscope.common.network.connect.Interceptor> r0 = r0.o
                return r0
        }

        static /* synthetic */ xyz.adscope.common.network.simple.Converter h(xyz.adscope.common.network.KalleConfig.Builder r0) {
                xyz.adscope.common.network.simple.Converter r0 = r0.p
                return r0
        }

        static /* synthetic */ java.util.concurrent.Executor i(xyz.adscope.common.network.KalleConfig.Builder r0) {
                java.util.concurrent.Executor r0 = r0.b
                return r0
        }

        static /* synthetic */ java.nio.charset.Charset j(xyz.adscope.common.network.KalleConfig.Builder r0) {
                java.nio.charset.Charset r0 = r0.c
                return r0
        }

        static /* synthetic */ xyz.adscope.common.network.Headers k(xyz.adscope.common.network.KalleConfig.Builder r0) {
                xyz.adscope.common.network.Headers r0 = r0.d
                return r0
        }

        static /* synthetic */ java.net.Proxy l(xyz.adscope.common.network.KalleConfig.Builder r0) {
                java.net.Proxy r0 = r0.e
                return r0
        }

        static /* synthetic */ javax.net.ssl.SSLSocketFactory m(xyz.adscope.common.network.KalleConfig.Builder r0) {
                javax.net.ssl.SSLSocketFactory r0 = r0.f
                return r0
        }

        static /* synthetic */ javax.net.ssl.HostnameVerifier n(xyz.adscope.common.network.KalleConfig.Builder r0) {
                javax.net.ssl.HostnameVerifier r0 = r0.g
                return r0
        }

        static /* synthetic */ int o(xyz.adscope.common.network.KalleConfig.Builder r0) {
                int r0 = r0.h
                return r0
        }

        static /* synthetic */ int p(xyz.adscope.common.network.KalleConfig.Builder r0) {
                int r0 = r0.i
                return r0
        }

        public xyz.adscope.common.network.KalleConfig.Builder addHeader(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                xyz.adscope.common.network.Headers r0 = r1.d
                r0.add2(r2, r3)
                return r1
        }

        public xyz.adscope.common.network.KalleConfig.Builder addInterceptor(xyz.adscope.common.network.connect.Interceptor r2) {
                r1 = this;
                java.util.List<xyz.adscope.common.network.connect.Interceptor> r0 = r1.o
                r0.add(r2)
                return r1
        }

        public xyz.adscope.common.network.KalleConfig.Builder addInterceptors(java.util.List<xyz.adscope.common.network.connect.Interceptor> r2) {
                r1 = this;
                java.util.List<xyz.adscope.common.network.connect.Interceptor> r0 = r1.o
                r0.addAll(r2)
                return r1
        }

        public xyz.adscope.common.network.KalleConfig.Builder addParam(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.j
                r0.add(r2, r3)
                return r1
        }

        public xyz.adscope.common.network.KalleConfig build() {
                r2 = this;
                xyz.adscope.common.network.KalleConfig r0 = new xyz.adscope.common.network.KalleConfig
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public xyz.adscope.common.network.KalleConfig.Builder cacheStore(xyz.adscope.common.network.simple.cache.CacheStore r1) {
                r0 = this;
                r0.k = r1
                return r0
        }

        public xyz.adscope.common.network.KalleConfig.Builder charset(java.nio.charset.Charset r1) {
                r0 = this;
                r0.c = r1
                return r0
        }

        public xyz.adscope.common.network.KalleConfig.Builder connectFactory(xyz.adscope.common.network.connect.ConnectFactory r1) {
                r0 = this;
                r0.m = r1
                return r0
        }

        public xyz.adscope.common.network.KalleConfig.Builder connectionTimeout(int r3, java.util.concurrent.TimeUnit r4) {
                r2 = this;
                long r0 = (long) r3
                long r3 = r4.toMillis(r0)
                r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
                long r3 = java.lang.Math.min(r3, r0)
                int r4 = (int) r3
                r2.h = r4
                return r2
        }

        public xyz.adscope.common.network.KalleConfig.Builder converter(xyz.adscope.common.network.simple.Converter r1) {
                r0 = this;
                r0.p = r1
                return r0
        }

        public xyz.adscope.common.network.KalleConfig.Builder cookieStore(xyz.adscope.common.network.cookie.CookieStore r1) {
                r0 = this;
                r0.n = r1
                return r0
        }

        public xyz.adscope.common.network.KalleConfig.Builder hostnameVerifier(javax.net.ssl.HostnameVerifier r1) {
                r0 = this;
                r0.g = r1
                return r0
        }

        public xyz.adscope.common.network.KalleConfig.Builder mainThreadExecutor(java.util.concurrent.Executor r1) {
                r0 = this;
                r0.b = r1
                return r0
        }

        public xyz.adscope.common.network.KalleConfig.Builder network(xyz.adscope.common.network.connect.Network r1) {
                r0 = this;
                r0.l = r1
                return r0
        }

        public xyz.adscope.common.network.KalleConfig.Builder proxy(java.net.Proxy r1) {
                r0 = this;
                r0.e = r1
                return r0
        }

        public xyz.adscope.common.network.KalleConfig.Builder readTimeout(int r3, java.util.concurrent.TimeUnit r4) {
                r2 = this;
                long r0 = (long) r3
                long r3 = r4.toMillis(r0)
                r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
                long r3 = java.lang.Math.min(r3, r0)
                int r4 = (int) r3
                r2.i = r4
                return r2
        }

        public xyz.adscope.common.network.KalleConfig.Builder setHeader(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                xyz.adscope.common.network.Headers r0 = r1.d
                r0.set2(r2, r3)
                return r1
        }

        public xyz.adscope.common.network.KalleConfig.Builder sslSocketFactory(javax.net.ssl.SSLSocketFactory r1) {
                r0 = this;
                r0.f = r1
                return r0
        }

        public xyz.adscope.common.network.KalleConfig.Builder workThreadExecutor(java.util.concurrent.Executor r1) {
                r0 = this;
                r0.a = r1
                return r0
        }
    }

    private KalleConfig(xyz.adscope.common.network.KalleConfig.Builder r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.Executor r0 = xyz.adscope.common.network.KalleConfig.Builder.a(r3)
            if (r0 != 0) goto Lf
            xyz.adscope.common.network.util.WorkExecutor r0 = new xyz.adscope.common.network.util.WorkExecutor
            r0.<init>()
            goto L13
        Lf:
            java.util.concurrent.Executor r0 = xyz.adscope.common.network.KalleConfig.Builder.a(r3)
        L13:
            r2.a = r0
            java.util.concurrent.Executor r0 = xyz.adscope.common.network.KalleConfig.Builder.i(r3)
            if (r0 != 0) goto L21
            xyz.adscope.common.network.util.MainExecutor r0 = new xyz.adscope.common.network.util.MainExecutor
            r0.<init>()
            goto L25
        L21:
            java.util.concurrent.Executor r0 = xyz.adscope.common.network.KalleConfig.Builder.i(r3)
        L25:
            r2.b = r0
            java.nio.charset.Charset r0 = xyz.adscope.common.network.KalleConfig.Builder.j(r3)
            if (r0 != 0) goto L32
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            goto L36
        L32:
            java.nio.charset.Charset r0 = xyz.adscope.common.network.KalleConfig.Builder.j(r3)
        L36:
            r2.c = r0
            xyz.adscope.common.network.Headers r0 = xyz.adscope.common.network.KalleConfig.Builder.k(r3)
            r2.d = r0
            java.net.Proxy r0 = xyz.adscope.common.network.KalleConfig.Builder.l(r3)
            r2.e = r0
            javax.net.ssl.SSLSocketFactory r0 = xyz.adscope.common.network.KalleConfig.Builder.m(r3)
            if (r0 != 0) goto L4d
            javax.net.ssl.SSLSocketFactory r0 = xyz.adscope.common.network.ssl.SSLUtils.SSL_SOCKET_FACTORY
            goto L51
        L4d:
            javax.net.ssl.SSLSocketFactory r0 = xyz.adscope.common.network.KalleConfig.Builder.m(r3)
        L51:
            r2.f = r0
            javax.net.ssl.HostnameVerifier r0 = xyz.adscope.common.network.KalleConfig.Builder.n(r3)
            if (r0 != 0) goto L5c
            javax.net.ssl.HostnameVerifier r0 = xyz.adscope.common.network.ssl.SSLUtils.HOSTNAME_VERIFIER
            goto L60
        L5c:
            javax.net.ssl.HostnameVerifier r0 = xyz.adscope.common.network.KalleConfig.Builder.n(r3)
        L60:
            r2.g = r0
            int r0 = xyz.adscope.common.network.KalleConfig.Builder.o(r3)
            r1 = 10000(0x2710, float:1.4013E-41)
            if (r0 > 0) goto L6d
            r0 = 10000(0x2710, float:1.4013E-41)
            goto L71
        L6d:
            int r0 = xyz.adscope.common.network.KalleConfig.Builder.o(r3)
        L71:
            r2.h = r0
            int r0 = xyz.adscope.common.network.KalleConfig.Builder.p(r3)
            if (r0 > 0) goto L7a
            goto L7e
        L7a:
            int r1 = xyz.adscope.common.network.KalleConfig.Builder.p(r3)
        L7e:
            r2.i = r1
            xyz.adscope.common.network.Params$Builder r0 = xyz.adscope.common.network.KalleConfig.Builder.b(r3)
            xyz.adscope.common.network.Params r0 = r0.build()
            r2.j = r0
            xyz.adscope.common.network.simple.cache.CacheStore r0 = xyz.adscope.common.network.KalleConfig.Builder.c(r3)
            if (r0 != 0) goto L93
            xyz.adscope.common.network.simple.cache.CacheStore r0 = xyz.adscope.common.network.simple.cache.CacheStore.DEFAULT
            goto L97
        L93:
            xyz.adscope.common.network.simple.cache.CacheStore r0 = xyz.adscope.common.network.KalleConfig.Builder.c(r3)
        L97:
            r2.k = r0
            xyz.adscope.common.network.connect.Network r0 = xyz.adscope.common.network.KalleConfig.Builder.d(r3)
            if (r0 != 0) goto La2
            xyz.adscope.common.network.connect.Network r0 = xyz.adscope.common.network.connect.Network.DEFAULT
            goto La6
        La2:
            xyz.adscope.common.network.connect.Network r0 = xyz.adscope.common.network.KalleConfig.Builder.d(r3)
        La6:
            r2.l = r0
            xyz.adscope.common.network.connect.ConnectFactory r0 = xyz.adscope.common.network.KalleConfig.Builder.e(r3)
            if (r0 != 0) goto Lb7
            xyz.adscope.common.network.urlconnect.URLConnectionFactory$Builder r0 = xyz.adscope.common.network.urlconnect.URLConnectionFactory.newBuilder()
            xyz.adscope.common.network.urlconnect.URLConnectionFactory r0 = r0.build()
            goto Lbb
        Lb7:
            xyz.adscope.common.network.connect.ConnectFactory r0 = xyz.adscope.common.network.KalleConfig.Builder.e(r3)
        Lbb:
            r2.m = r0
            xyz.adscope.common.network.cookie.CookieStore r0 = xyz.adscope.common.network.KalleConfig.Builder.f(r3)
            if (r0 != 0) goto Lc6
            xyz.adscope.common.network.cookie.CookieStore r0 = xyz.adscope.common.network.cookie.CookieStore.DEFAULT
            goto Lca
        Lc6:
            xyz.adscope.common.network.cookie.CookieStore r0 = xyz.adscope.common.network.KalleConfig.Builder.f(r3)
        Lca:
            r2.n = r0
            java.util.List r0 = xyz.adscope.common.network.KalleConfig.Builder.g(r3)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r2.o = r0
            xyz.adscope.common.network.simple.Converter r0 = xyz.adscope.common.network.KalleConfig.Builder.h(r3)
            if (r0 != 0) goto Ldf
            xyz.adscope.common.network.simple.Converter r3 = xyz.adscope.common.network.simple.Converter.DEFAULT
            goto Le3
        Ldf:
            xyz.adscope.common.network.simple.Converter r3 = xyz.adscope.common.network.KalleConfig.Builder.h(r3)
        Le3:
            r2.p = r3
            return
    }

    /* synthetic */ KalleConfig(xyz.adscope.common.network.KalleConfig.Builder r1, xyz.adscope.common.network.KalleConfig.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static xyz.adscope.common.network.KalleConfig.Builder newBuilder() {
            xyz.adscope.common.network.KalleConfig$Builder r0 = new xyz.adscope.common.network.KalleConfig$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public xyz.adscope.common.network.simple.cache.CacheStore getCacheStore() {
            r1 = this;
            xyz.adscope.common.network.simple.cache.CacheStore r0 = r1.k
            return r0
    }

    public java.nio.charset.Charset getCharset() {
            r1 = this;
            java.nio.charset.Charset r0 = r1.c
            return r0
    }

    public xyz.adscope.common.network.connect.ConnectFactory getConnectFactory() {
            r1 = this;
            xyz.adscope.common.network.connect.ConnectFactory r0 = r1.m
            return r0
    }

    public int getConnectTimeout() {
            r1 = this;
            int r0 = r1.h
            return r0
    }

    public xyz.adscope.common.network.simple.Converter getConverter() {
            r1 = this;
            xyz.adscope.common.network.simple.Converter r0 = r1.p
            return r0
    }

    public xyz.adscope.common.network.cookie.CookieStore getCookieStore() {
            r1 = this;
            xyz.adscope.common.network.cookie.CookieStore r0 = r1.n
            return r0
    }

    public xyz.adscope.common.network.Headers getHeaders() {
            r1 = this;
            xyz.adscope.common.network.Headers r0 = r1.d
            return r0
    }

    public javax.net.ssl.HostnameVerifier getHostnameVerifier() {
            r1 = this;
            javax.net.ssl.HostnameVerifier r0 = r1.g
            return r0
    }

    public java.util.List<xyz.adscope.common.network.connect.Interceptor> getInterceptor() {
            r1 = this;
            java.util.List<xyz.adscope.common.network.connect.Interceptor> r0 = r1.o
            return r0
    }

    public java.util.concurrent.Executor getMainExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.b
            return r0
    }

    public xyz.adscope.common.network.connect.Network getNetwork() {
            r1 = this;
            xyz.adscope.common.network.connect.Network r0 = r1.l
            return r0
    }

    public xyz.adscope.common.network.Params getParams() {
            r1 = this;
            xyz.adscope.common.network.Params r0 = r1.j
            return r0
    }

    public java.net.Proxy getProxy() {
            r1 = this;
            java.net.Proxy r0 = r1.e
            return r0
    }

    public int getReadTimeout() {
            r1 = this;
            int r0 = r1.i
            return r0
    }

    public javax.net.ssl.SSLSocketFactory getSSLSocketFactory() {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.f
            return r0
    }

    public java.util.concurrent.Executor getWorkExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.a
            return r0
    }
}
