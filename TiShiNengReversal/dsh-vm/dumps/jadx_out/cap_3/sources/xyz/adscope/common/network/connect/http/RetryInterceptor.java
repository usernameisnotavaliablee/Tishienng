package xyz.adscope.common.network.connect.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class RetryInterceptor implements xyz.adscope.common.network.connect.Interceptor {
    private int a;

    public RetryInterceptor(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // xyz.adscope.common.network.connect.Interceptor
    public xyz.adscope.common.network.Response intercept(xyz.adscope.common.network.connect.http.Chain r3) {
            r2 = this;
            xyz.adscope.common.network.Request r0 = r3.request()     // Catch: java.io.IOException -> L9
            xyz.adscope.common.network.Response r3 = r3.proceed(r0)     // Catch: java.io.IOException -> L9
            return r3
        L9:
            r0 = move-exception
            int r1 = r2.a
            if (r1 <= 0) goto L17
            int r1 = r1 + (-1)
            r2.a = r1
            xyz.adscope.common.network.Response r3 = r2.intercept(r3)
            return r3
        L17:
            throw r0
    }
}
