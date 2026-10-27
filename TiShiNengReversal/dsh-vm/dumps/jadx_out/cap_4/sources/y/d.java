package y;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class d implements okhttp3.Interceptor {
    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.lang.String a(java.lang.String r4) {
            r3 = this;
            b0.b r0 = b0.b.a
            com.bxkj.base.BaseApp r1 = com.bxkj.base.BaseApp.c()
            java.lang.String r2 = "getApp(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.lang.String r4 = r0.l(r1, r4)
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull okhttp3.Interceptor.Chain r9) throws java.io.IOException {
            r8 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.g0.p(r9, r0)
            okhttp3.Request r0 = r9.request()
            java.lang.Class<retrofit2.l> r1 = retrofit2.l.class
            java.lang.Object r1 = r0.tag(r1)
            retrofit2.l r1 = (retrofit2.l) r1
            r2 = 0
            if (r1 == 0) goto L19
            java.lang.reflect.Method r1 = r1.b()
            goto L1a
        L19:
            r1 = r2
        L1a:
            if (r1 == 0) goto L25
            java.lang.Class<com.bxkj.base.v2.http.interceptor.Test> r3 = com.bxkj.base.v2.http.interceptor.Test.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r3)
            com.bxkj.base.v2.http.interceptor.Test r1 = (com.bxkj.base.v2.http.interceptor.Test) r1
            goto L26
        L25:
            r1 = r2
        L26:
            if (r1 == 0) goto Lc0
            java.lang.String r1 = r1.demo()
            java.lang.String r1 = r8.a(r1)
            okhttp3.HttpUrl r3 = r0.url()
            java.util.Set r4 = r3.queryParameterNames()
            java.lang.String r5 = "http://"
            r6 = 0
            r7 = 2
            boolean r5 = kotlin.text.u.H2(r1, r5, r6, r7, r2)
            if (r5 != 0) goto L64
            java.lang.String r5 = "https://"
            boolean r5 = kotlin.text.u.H2(r1, r5, r6, r7, r2)
            if (r5 == 0) goto L4b
            goto L64
        L4b:
            com.bxkj.base.v2.data.b$a r5 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r5 = r5.a()
            java.lang.String r5 = r5.M()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
        L64:
            okhttp3.HttpUrl$Companion r5 = okhttp3.HttpUrl.Companion
            okhttp3.HttpUrl r5 = r5.parse(r1)
            if (r5 == 0) goto L70
            okhttp3.HttpUrl$Builder r2 = r5.newBuilder()
        L70:
            if (r2 == 0) goto Laf
            java.util.Iterator r1 = r4.iterator()
        L76:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L9a
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            java.util.List r5 = r3.queryParameterValues(r4)
            java.util.Iterator r5 = r5.iterator()
        L8a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L76
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            r2.addQueryParameter(r4, r6)
            goto L8a
        L9a:
            okhttp3.HttpUrl r1 = r2.build()
            okhttp3.Request$Builder r0 = r0.newBuilder()
            okhttp3.Request$Builder r0 = r0.url(r1)
            okhttp3.Request r0 = r0.build()
            okhttp3.Response r9 = r9.proceed(r0)
            return r9
        Laf:
            okhttp3.Request$Builder r0 = r0.newBuilder()
            okhttp3.Request$Builder r0 = r0.url(r1)
            okhttp3.Request r0 = r0.build()
            okhttp3.Response r9 = r9.proceed(r0)
            return r9
        Lc0:
            okhttp3.Response r9 = r9.proceed(r0)
            return r9
    }
}
