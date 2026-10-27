package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class q3 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f2600e = "RetrofitServiceManager";

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f2601f = "";
    public java.lang.String[] a;

    /* renamed from: b, reason: collision with root package name */
    public final okhttp3.logging.HttpLoggingInterceptor f2602b;

    /* renamed from: c, reason: collision with root package name */
    public final okhttp3.Interceptor f2603c;

    /* renamed from: d, reason: collision with root package name */
    public final okhttp3.OkHttpClient f2604d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements okhttp3.logging.HttpLoggingInterceptor.Logger {
        public final /* synthetic */ com.acse.ottn.q3 a;

        public a(com.acse.ottn.q3 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void log(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "http://118.89.189.246"
                boolean r0 = r2.contains(r0)
                if (r0 != 0) goto Ld
                java.lang.String r0 = "RetrofitServiceManager"
                com.acse.ottn.h2.a(r0, r2)
            Ld:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements okhttp3.Interceptor {
        public final /* synthetic */ com.acse.ottn.q3 a;

        public b(com.acse.ottn.q3 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public okhttp3.Response intercept(okhttp3.Interceptor.Chain r4) throws java.io.IOException {
                r3 = this;
                okhttp3.Request r0 = r4.request()
                okhttp3.Request$Builder r0 = r0.newBuilder()
                java.lang.String r1 = "Accept"
                java.lang.String r2 = "application/json"
                r0.addHeader(r1, r2)
                java.lang.String r1 = "Content-Type"
                java.lang.String r2 = "application/json;utf-8"
                r0.addHeader(r1, r2)
                okhttp3.Request r0 = r0.build()
                okhttp3.Response r4 = r4.proceed(r0)
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c implements javax.net.ssl.HostnameVerifier {
        public final /* synthetic */ com.acse.ottn.q3 a;

        public c(com.acse.ottn.q3 r1) {
                r0 = this;
                r0.a = r1
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

    public q3() {
            r37 = this;
            r0 = r37
            r0.<init>()
            java.lang.String r35 = "y"
            java.lang.String r36 = "z"
            java.lang.String r1 = "1"
            java.lang.String r2 = "2"
            java.lang.String r3 = "3"
            java.lang.String r4 = "4"
            java.lang.String r5 = "5"
            java.lang.String r6 = "6"
            java.lang.String r7 = "7"
            java.lang.String r8 = "8"
            java.lang.String r9 = "9"
            java.lang.String r10 = "0"
            java.lang.String r11 = "a"
            java.lang.String r12 = "b"
            java.lang.String r13 = "c"
            java.lang.String r14 = "d"
            java.lang.String r15 = "e"
            java.lang.String r16 = "f"
            java.lang.String r17 = "g"
            java.lang.String r18 = "h"
            java.lang.String r19 = "i"
            java.lang.String r20 = "j"
            java.lang.String r21 = "k"
            java.lang.String r22 = "l"
            java.lang.String r23 = "m"
            java.lang.String r24 = "n"
            java.lang.String r25 = "o"
            java.lang.String r26 = "p"
            java.lang.String r27 = "q"
            java.lang.String r28 = "r"
            java.lang.String r29 = "s"
            java.lang.String r30 = "t"
            java.lang.String r31 = "u"
            java.lang.String r32 = "v"
            java.lang.String r33 = "w"
            java.lang.String r34 = "x"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36}
            r0.a = r1
            okhttp3.logging.HttpLoggingInterceptor r1 = new okhttp3.logging.HttpLoggingInterceptor
            com.acse.ottn.q3$a r2 = new com.acse.ottn.q3$a
            r2.<init>(r0)
            r1.<init>(r2)
            r0.f2602b = r1
            com.acse.ottn.q3$b r2 = new com.acse.ottn.q3$b
            r2.<init>(r0)
            r0.f2603c = r2
            okhttp3.OkHttpClient$Builder r3 = new okhttp3.OkHttpClient$Builder
            r3.<init>()
            okhttp3.OkHttpClient$Builder r2 = r3.addInterceptor(r2)
            okhttp3.OkHttpClient$Builder r1 = r2.addInterceptor(r1)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            r3 = 10
            okhttp3.OkHttpClient$Builder r1 = r1.connectTimeout(r3, r2)
            r3 = 20
            okhttp3.OkHttpClient$Builder r1 = r1.readTimeout(r3, r2)
            r2 = 1
            okhttp3.OkHttpClient$Builder r1 = r1.retryOnConnectionFailure(r2)
            javax.net.ssl.SSLSocketFactory r2 = com.acse.ottn.x3.b()
            javax.net.ssl.X509TrustManager r3 = com.acse.ottn.x3.d()
            okhttp3.OkHttpClient$Builder r1 = r1.sslSocketFactory(r2, r3)
            com.acse.ottn.q3$c r2 = new com.acse.ottn.q3$c
            r2.<init>(r0)
            okhttp3.OkHttpClient$Builder r1 = r1.hostnameVerifier(r2)
            okhttp3.OkHttpClient r1 = r1.build()
            r0.f2604d = r1
            return
    }

    public retrofit2.d0 a() {
            r2 = this;
            okhttp3.logging.HttpLoggingInterceptor r0 = r2.f2602b
            okhttp3.logging.HttpLoggingInterceptor$Level r1 = okhttp3.logging.HttpLoggingInterceptor.Level.BODY
            r0.setLevel(r1)
            retrofit2.d0$b r0 = new retrofit2.d0$b
            r0.<init>()
            okhttp3.OkHttpClient r1 = r2.f2604d
            retrofit2.d0$b r0 = r0.j(r1)
            com.acse.ottn.d1 r1 = com.acse.ottn.d1.a()
            retrofit2.d0$b r0 = r0.b(r1)
            rx.h r1 = rx.schedulers.c.e()
            retrofit2.adapter.rxjava.h r1 = retrofit2.adapter.rxjava.h.f(r1)
            retrofit2.d0$b r0 = r0.a(r1)
            java.lang.String r1 = r2.c()
            if (r1 != 0) goto L2f
            java.lang.String r1 = ""
            goto L33
        L2f:
            java.lang.String r1 = r2.c()
        L33:
            retrofit2.d0$b r0 = r0.c(r1)
            retrofit2.d0 r0 = r0.f()
            return r0
    }

    public retrofit2.d0 b() {
            r2 = this;
            retrofit2.d0$b r0 = new retrofit2.d0$b
            r0.<init>()
            okhttp3.OkHttpClient r1 = r2.f2604d
            retrofit2.d0$b r0 = r0.j(r1)
            com.acse.ottn.c1 r1 = com.acse.ottn.c1.a()
            retrofit2.d0$b r0 = r0.b(r1)
            rx.h r1 = rx.schedulers.c.e()
            retrofit2.adapter.rxjava.h r1 = retrofit2.adapter.rxjava.h.f(r1)
            retrofit2.d0$b r0 = r0.a(r1)
            java.lang.String r1 = r2.c()
            if (r1 != 0) goto L28
            java.lang.String r1 = ""
            goto L2c
        L28:
            java.lang.String r1 = r2.c()
        L2c:
            retrofit2.d0$b r0 = r0.c(r1)
            retrofit2.d0 r0 = r0.f()
            return r0
    }

    public abstract java.lang.String c();
}
