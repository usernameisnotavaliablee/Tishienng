package y;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class b implements okhttp3.Interceptor {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull okhttp3.Interceptor.Chain r5) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.g0.p(r5, r0)
            okhttp3.Request r0 = r5.request()
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
            java.lang.Class<com.bxkj.base.v2.http.interceptor.DynamicTimeout> r2 = com.bxkj.base.v2.http.interceptor.DynamicTimeout.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r2)
            r2 = r1
            com.bxkj.base.v2.http.interceptor.DynamicTimeout r2 = (com.bxkj.base.v2.http.interceptor.DynamicTimeout) r2
        L25:
            if (r2 == 0) goto L4c
            int r1 = r2.timeout()
            if (r1 <= 0) goto L4c
            int r1 = r2.timeout()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            okhttp3.Interceptor$Chain r5 = r5.withConnectTimeout(r1, r3)
            int r1 = r2.timeout()
            okhttp3.Interceptor$Chain r5 = r5.withReadTimeout(r1, r3)
            int r1 = r2.timeout()
            okhttp3.Interceptor$Chain r5 = r5.withWriteTimeout(r1, r3)
            okhttp3.Response r5 = r5.proceed(r0)
            return r5
        L4c:
            okhttp3.Response r5 = r5.proceed(r0)
            return r5
    }
}
