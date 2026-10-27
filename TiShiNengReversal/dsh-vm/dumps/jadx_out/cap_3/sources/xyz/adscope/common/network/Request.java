package xyz.adscope.common.network;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class Request {
    private final xyz.adscope.common.network.RequestMethod a;
    private final xyz.adscope.common.network.Headers b;
    private final java.net.Proxy c;
    private final javax.net.ssl.SSLSocketFactory d;
    private final javax.net.ssl.HostnameVerifier e;
    private final int f;
    private final int g;
    private final java.lang.Object h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Api<T extends xyz.adscope.common.network.Request.Api<T>> {
        private final xyz.adscope.common.network.RequestMethod a;
        private final xyz.adscope.common.network.Headers b;
        private java.net.Proxy c;
        private javax.net.ssl.SSLSocketFactory d;
        private javax.net.ssl.HostnameVerifier e;
        private int f;
        private int g;
        private java.lang.Object h;

        protected Api(xyz.adscope.common.network.RequestMethod r3) {
                r2 = this;
                r2.<init>()
                xyz.adscope.common.network.Headers r0 = new xyz.adscope.common.network.Headers
                r0.<init>()
                r2.b = r0
                xyz.adscope.common.network.KalleConfig r1 = xyz.adscope.common.network.Kalle.getConfig()
                java.net.Proxy r1 = r1.getProxy()
                r2.c = r1
                xyz.adscope.common.network.KalleConfig r1 = xyz.adscope.common.network.Kalle.getConfig()
                javax.net.ssl.SSLSocketFactory r1 = r1.getSSLSocketFactory()
                r2.d = r1
                xyz.adscope.common.network.KalleConfig r1 = xyz.adscope.common.network.Kalle.getConfig()
                javax.net.ssl.HostnameVerifier r1 = r1.getHostnameVerifier()
                r2.e = r1
                xyz.adscope.common.network.KalleConfig r1 = xyz.adscope.common.network.Kalle.getConfig()
                int r1 = r1.getConnectTimeout()
                r2.f = r1
                xyz.adscope.common.network.KalleConfig r1 = xyz.adscope.common.network.Kalle.getConfig()
                int r1 = r1.getReadTimeout()
                r2.g = r1
                r2.a = r3
                xyz.adscope.common.network.KalleConfig r3 = xyz.adscope.common.network.Kalle.getConfig()
                xyz.adscope.common.network.Headers r3 = r3.getHeaders()
                r0.add(r3)
                return
        }

        static /* synthetic */ xyz.adscope.common.network.RequestMethod a(xyz.adscope.common.network.Request.Api r0) {
                xyz.adscope.common.network.RequestMethod r0 = r0.a
                return r0
        }

        static /* synthetic */ xyz.adscope.common.network.Headers b(xyz.adscope.common.network.Request.Api r0) {
                xyz.adscope.common.network.Headers r0 = r0.b
                return r0
        }

        static /* synthetic */ java.net.Proxy c(xyz.adscope.common.network.Request.Api r0) {
                java.net.Proxy r0 = r0.c
                return r0
        }

        static /* synthetic */ javax.net.ssl.SSLSocketFactory d(xyz.adscope.common.network.Request.Api r0) {
                javax.net.ssl.SSLSocketFactory r0 = r0.d
                return r0
        }

        static /* synthetic */ javax.net.ssl.HostnameVerifier e(xyz.adscope.common.network.Request.Api r0) {
                javax.net.ssl.HostnameVerifier r0 = r0.e
                return r0
        }

        static /* synthetic */ int f(xyz.adscope.common.network.Request.Api r0) {
                int r0 = r0.f
                return r0
        }

        static /* synthetic */ int g(xyz.adscope.common.network.Request.Api r0) {
                int r0 = r0.g
                return r0
        }

        static /* synthetic */ java.lang.Object h(xyz.adscope.common.network.Request.Api r0) {
                java.lang.Object r0 = r0.h
                return r0
        }

        public T addHeader(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                xyz.adscope.common.network.Headers r0 = r1.b
                r0.add2(r2, r3)
                return r1
        }

        public T clearHeaders() {
                r1 = this;
                xyz.adscope.common.network.Headers r0 = r1.b
                r0.clear()
                return r1
        }

        public abstract T clearParams();

        public T connectTimeout(int r3, java.util.concurrent.TimeUnit r4) {
                r2 = this;
                long r0 = (long) r3
                long r3 = r4.toMillis(r0)
                r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
                long r3 = java.lang.Math.min(r3, r0)
                int r4 = (int) r3
                r2.f = r4
                return r2
        }

        public T hostnameVerifier(javax.net.ssl.HostnameVerifier r1) {
                r0 = this;
                r0.e = r1
                return r0
        }

        public abstract T param(java.lang.String r1, char r2);

        public abstract T param(java.lang.String r1, double r2);

        public abstract T param(java.lang.String r1, float r2);

        public abstract T param(java.lang.String r1, int r2);

        public abstract T param(java.lang.String r1, long r2);

        public abstract T param(java.lang.String r1, java.lang.String r2);

        public abstract T param(java.lang.String r1, java.util.List<java.lang.String> r2);

        public abstract T param(java.lang.String r1, short r2);

        public abstract T param(java.lang.String r1, boolean r2);

        public abstract T path(char r1);

        public abstract T path(double r1);

        public abstract T path(float r1);

        public abstract T path(int r1);

        public abstract T path(long r1);

        public abstract T path(java.lang.String r1);

        public abstract T path(boolean r1);

        public T proxy(java.net.Proxy r1) {
                r0 = this;
                r0.c = r1
                return r0
        }

        public T readTimeout(int r3, java.util.concurrent.TimeUnit r4) {
                r2 = this;
                long r0 = (long) r3
                long r3 = r4.toMillis(r0)
                r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
                long r3 = java.lang.Math.min(r3, r0)
                int r4 = (int) r3
                r2.g = r4
                return r2
        }

        public T removeHeader(java.lang.String r2) {
                r1 = this;
                xyz.adscope.common.network.Headers r0 = r1.b
                r0.remove2(r2)
                return r1
        }

        public abstract T removeParam(java.lang.String r1);

        public T setHeader(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                xyz.adscope.common.network.Headers r0 = r1.b
                r0.set2(r2, r3)
                return r1
        }

        public T setHeaders(xyz.adscope.common.network.Headers r2) {
                r1 = this;
                xyz.adscope.common.network.Headers r0 = r1.b
                r0.set(r2)
                return r1
        }

        public T sslSocketFactory(javax.net.ssl.SSLSocketFactory r1) {
                r0 = this;
                r0.d = r1
                return r0
        }

        public T tag(java.lang.Object r1) {
                r0 = this;
                r0.h = r1
                return r0
        }
    }

    protected <T extends xyz.adscope.common.network.Request.Api<T>> Request(xyz.adscope.common.network.Request.Api<T> r2) {
            r1 = this;
            r1.<init>()
            xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.Request.Api.a(r2)
            r1.a = r0
            xyz.adscope.common.network.Headers r0 = xyz.adscope.common.network.Request.Api.b(r2)
            r1.b = r0
            java.net.Proxy r0 = xyz.adscope.common.network.Request.Api.c(r2)
            r1.c = r0
            javax.net.ssl.SSLSocketFactory r0 = xyz.adscope.common.network.Request.Api.d(r2)
            r1.d = r0
            javax.net.ssl.HostnameVerifier r0 = xyz.adscope.common.network.Request.Api.e(r2)
            r1.e = r0
            int r0 = xyz.adscope.common.network.Request.Api.f(r2)
            r1.f = r0
            int r0 = xyz.adscope.common.network.Request.Api.g(r2)
            r1.g = r0
            java.lang.Object r2 = xyz.adscope.common.network.Request.Api.h(r2)
            r1.h = r2
            return
    }

    public abstract xyz.adscope.common.network.RequestBody body();

    public int connectTimeout() {
            r1 = this;
            int r0 = r1.f
            return r0
    }

    public abstract xyz.adscope.common.network.Params copyParams();

    public xyz.adscope.common.network.Headers headers() {
            r1 = this;
            xyz.adscope.common.network.Headers r0 = r1.b
            return r0
    }

    public javax.net.ssl.HostnameVerifier hostnameVerifier() {
            r1 = this;
            javax.net.ssl.HostnameVerifier r0 = r1.e
            return r0
    }

    public xyz.adscope.common.network.RequestMethod method() {
            r1 = this;
            xyz.adscope.common.network.RequestMethod r0 = r1.a
            return r0
    }

    public java.net.Proxy proxy() {
            r1 = this;
            java.net.Proxy r0 = r1.c
            return r0
    }

    public int readTimeout() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    public javax.net.ssl.SSLSocketFactory sslSocketFactory() {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.d
            return r0
    }

    public java.lang.Object tag() {
            r1 = this;
            java.lang.Object r0 = r1.h
            return r0
    }

    public abstract xyz.adscope.common.network.Url url();
}
