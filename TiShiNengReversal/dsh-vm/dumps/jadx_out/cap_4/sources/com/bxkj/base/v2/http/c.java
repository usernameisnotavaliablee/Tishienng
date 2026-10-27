package com.bxkj.base.v2.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class c {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.base.v2.http.c a = null;

    @org.jetbrains.annotations.NotNull
    private static final okhttp3.OkHttpClient b = null;
    private static retrofit2.d0 c;

    @org.jetbrains.annotations.NotNull
    private static com.bxkj.base.v2.http.b d;

    static {
            com.bxkj.base.v2.http.c r0 = new com.bxkj.base.v2.http.c
            r0.<init>()
            com.bxkj.base.v2.http.c.a = r0
            okhttp3.OkHttpClient$Builder r0 = new okhttp3.OkHttpClient$Builder
            r0.<init>()
            java.net.Proxy r1 = java.net.Proxy.NO_PROXY
            okhttp3.OkHttpClient$Builder r0 = r0.proxy(r1)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r2 = 30
            okhttp3.OkHttpClient$Builder r0 = r0.readTimeout(r2, r1)
            okhttp3.OkHttpClient$Builder r0 = r0.writeTimeout(r2, r1)
            okhttp3.OkHttpClient$Builder r0 = r0.connectTimeout(r2, r1)
            y.b r1 = new y.b
            r1.<init>()
            okhttp3.OkHttpClient$Builder r0 = r0.addInterceptor(r1)
            y.d r1 = new y.d
            r1.<init>()
            okhttp3.OkHttpClient$Builder r0 = r0.addInterceptor(r1)
            y.c r1 = new y.c
            r1.<init>()
            okhttp3.OkHttpClient$Builder r0 = r0.addInterceptor(r1)
            y.a r1 = new y.a
            r1.<init>()
            okhttp3.OkHttpClient$Builder r0 = r0.addInterceptor(r1)
            com.bxkj.base.v2.http.d r1 = com.bxkj.base.v2.http.d.a
            javax.net.ssl.SSLSocketFactory r2 = r1.a()
            javax.net.ssl.X509TrustManager r1 = r1.b()
            okhttp3.OkHttpClient$Builder r0 = r0.sslSocketFactory(r2, r1)
            javax.net.ssl.HostnameVerifier r1 = com.bxkj.base.v2.http.e.a()
            java.lang.String r2 = "getHostnameVerifier(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            okhttp3.OkHttpClient$Builder r0 = r0.hostnameVerifier(r1)
            g2.b r1 = new g2.b
            com.bxkj.base.BaseApp r2 = com.bxkj.base.BaseApp.c()
            r1.<init>(r2)
            okhttp3.OkHttpClient$Builder r0 = r0.addInterceptor(r1)
            okhttp3.OkHttpClient r0 = r0.build()
            com.bxkj.base.v2.http.c.b = r0
            retrofit2.d0$b r1 = new retrofit2.d0$b
            r1.<init>()
            retrofit2.d0$b r0 = r1.j(r0)
            com.bxkj.base.v2.data.b$a r1 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r1 = r1.a()
            java.lang.String r1 = r1.M()
            retrofit2.d0$b r0 = r0.c(r1)
            com.google.gson.GsonBuilder r1 = new com.google.gson.GsonBuilder
            r1.<init>()
            com.google.gson.GsonBuilder r1 = r1.setLenient()
            com.google.gson.Gson r1 = r1.create()
            retrofit2.converter.gson.a r1 = retrofit2.converter.gson.a.c(r1)
            retrofit2.d0$b r0 = r0.b(r1)
            retrofit2.d0 r0 = r0.f()
            com.bxkj.base.v2.http.c.c = r0
            java.lang.Class<com.bxkj.base.v2.http.b> r1 = com.bxkj.base.v2.http.b.class
            java.lang.Object r0 = r0.g(r1)
            java.lang.String r1 = "create(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            com.bxkj.base.v2.http.b r0 = (com.bxkj.base.v2.http.b) r0
            com.bxkj.base.v2.http.c.d = r0
            return
    }

    private c() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void a() {
            r2 = this;
            retrofit2.d0$b r0 = new retrofit2.d0$b
            r0.<init>()
            okhttp3.OkHttpClient r1 = com.bxkj.base.v2.http.c.b
            retrofit2.d0$b r0 = r0.j(r1)
            com.bxkj.base.v2.data.b$a r1 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r1 = r1.a()
            java.lang.String r1 = r1.M()
            retrofit2.d0$b r0 = r0.c(r1)
            com.google.gson.GsonBuilder r1 = new com.google.gson.GsonBuilder
            r1.<init>()
            com.google.gson.GsonBuilder r1 = r1.setLenient()
            com.google.gson.Gson r1 = r1.create()
            retrofit2.converter.gson.a r1 = retrofit2.converter.gson.a.c(r1)
            retrofit2.d0$b r0 = r0.b(r1)
            retrofit2.d0 r0 = r0.f()
            com.bxkj.base.v2.http.c.c = r0
            java.lang.Class<com.bxkj.base.v2.http.b> r1 = com.bxkj.base.v2.http.b.class
            java.lang.Object r0 = r0.g(r1)
            java.lang.String r1 = "create(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            com.bxkj.base.v2.http.b r0 = (com.bxkj.base.v2.http.b) r0
            com.bxkj.base.v2.http.c.d = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.bxkj.base.v2.http.b b() {
            r1 = this;
            com.bxkj.base.v2.http.b r0 = com.bxkj.base.v2.http.c.d
            return r0
    }

    public final void c(@org.jetbrains.annotations.NotNull com.bxkj.base.v2.http.b r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            com.bxkj.base.v2.http.c.d = r2
            return
    }
}
