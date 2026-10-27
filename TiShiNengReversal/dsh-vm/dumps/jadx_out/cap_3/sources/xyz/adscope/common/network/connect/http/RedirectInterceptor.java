package xyz.adscope.common.network.connect.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class RedirectInterceptor implements xyz.adscope.common.network.connect.Interceptor {
    public RedirectInterceptor() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // xyz.adscope.common.network.connect.Interceptor
    public xyz.adscope.common.network.Response intercept(xyz.adscope.common.network.connect.http.Chain r7) {
            r6 = this;
            xyz.adscope.common.network.Request r0 = r7.request()
            xyz.adscope.common.network.Response r1 = r7.proceed(r0)
            boolean r2 = r1.isRedirect()
            if (r2 == 0) goto L6a
            xyz.adscope.common.network.Url r2 = r0.url()
            xyz.adscope.common.network.Headers r3 = r1.headers()
            java.lang.String r3 = r3.getLocation()
            xyz.adscope.common.network.Url r2 = r2.location(r3)
            xyz.adscope.common.network.Headers r3 = r0.headers()
            java.lang.String r4 = "Cookie"
            r3.remove2(r4)
            xyz.adscope.common.network.RequestMethod r4 = r0.method()
            boolean r5 = r4.allowBody()
            if (r5 == 0) goto L54
            xyz.adscope.common.network.BodyRequest$Builder r2 = xyz.adscope.common.network.BodyRequest.newBuilder(r2, r4)
            xyz.adscope.common.network.Request$Api r2 = r2.setHeaders(r3)
            xyz.adscope.common.network.BodyRequest$Builder r2 = (xyz.adscope.common.network.BodyRequest.Builder) r2
            xyz.adscope.common.network.Params r3 = r0.copyParams()
            xyz.adscope.common.network.BodyRequest$Api r2 = r2.setParams(r3)
            xyz.adscope.common.network.BodyRequest$Builder r2 = (xyz.adscope.common.network.BodyRequest.Builder) r2
            xyz.adscope.common.network.RequestBody r0 = r0.body()
            xyz.adscope.common.network.BodyRequest$Api r0 = r2.body(r0)
            xyz.adscope.common.network.BodyRequest$Builder r0 = (xyz.adscope.common.network.BodyRequest.Builder) r0
            xyz.adscope.common.network.BodyRequest r0 = r0.build()
            goto L62
        L54:
            xyz.adscope.common.network.UrlRequest$Builder r0 = xyz.adscope.common.network.UrlRequest.newBuilder(r2, r4)
            xyz.adscope.common.network.Request$Api r0 = r0.setHeaders(r3)
            xyz.adscope.common.network.UrlRequest$Builder r0 = (xyz.adscope.common.network.UrlRequest.Builder) r0
            xyz.adscope.common.network.UrlRequest r0 = r0.build()
        L62:
            xyz.adscope.common.network.util.IOUtils.closeQuietly(r1)
            xyz.adscope.common.network.Response r7 = r7.proceed(r0)
            return r7
        L6a:
            return r1
    }
}
