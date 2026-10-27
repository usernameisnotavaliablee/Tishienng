package xyz.adscope.common.network.simple;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class SimpleUrlRequest extends xyz.adscope.common.network.UrlRequest implements xyz.adscope.common.network.simple.SimpleRequest {
    private final xyz.adscope.common.network.simple.cache.CacheMode j;
    private final java.lang.String k;
    private final xyz.adscope.common.network.simple.Converter l;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.network.simple.SimpleUrlRequest$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Api extends xyz.adscope.common.network.UrlRequest.Api<xyz.adscope.common.network.simple.SimpleUrlRequest.Api> {
        private xyz.adscope.common.network.simple.cache.CacheMode j;
        private java.lang.String k;
        private xyz.adscope.common.network.simple.Converter l;

        private Api(xyz.adscope.common.network.Url r1, xyz.adscope.common.network.RequestMethod r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ Api(xyz.adscope.common.network.Url r1, xyz.adscope.common.network.RequestMethod r2, xyz.adscope.common.network.simple.SimpleUrlRequest.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static /* synthetic */ xyz.adscope.common.network.simple.cache.CacheMode a(xyz.adscope.common.network.simple.SimpleUrlRequest.Api r0) {
                xyz.adscope.common.network.simple.cache.CacheMode r0 = r0.j
                return r0
        }

        static /* synthetic */ java.lang.String b(xyz.adscope.common.network.simple.SimpleUrlRequest.Api r0) {
                java.lang.String r0 = r0.k
                return r0
        }

        static /* synthetic */ xyz.adscope.common.network.simple.Converter c(xyz.adscope.common.network.simple.SimpleUrlRequest.Api r0) {
                xyz.adscope.common.network.simple.Converter r0 = r0.l
                return r0
        }

        public xyz.adscope.common.network.simple.SimpleUrlRequest.Api cacheKey(java.lang.String r1) {
                r0 = this;
                r0.k = r1
                return r0
        }

        public xyz.adscope.common.network.simple.SimpleUrlRequest.Api cacheMode(xyz.adscope.common.network.simple.cache.CacheMode r1) {
                r0 = this;
                r0.j = r1
                return r0
        }

        public xyz.adscope.common.network.simple.SimpleUrlRequest.Api converter(xyz.adscope.common.network.simple.Converter r1) {
                r0 = this;
                r0.l = r1
                return r0
        }

        public <S, F> xyz.adscope.common.network.Canceller perform(xyz.adscope.common.network.simple.Callback<S, F> r4) {
                r3 = this;
                xyz.adscope.common.network.simple.RequestManager r0 = xyz.adscope.common.network.simple.RequestManager.getInstance()
                xyz.adscope.common.network.simple.SimpleUrlRequest r1 = new xyz.adscope.common.network.simple.SimpleUrlRequest
                r2 = 0
                r1.<init>(r3, r2)
                xyz.adscope.common.network.Canceller r4 = r0.perform(r1, r4)
                return r4
        }

        public <S, F> xyz.adscope.common.network.simple.SimpleResponse<S, F> perform(java.lang.reflect.Type r4, java.lang.reflect.Type r5) {
                r3 = this;
                xyz.adscope.common.network.simple.RequestManager r0 = xyz.adscope.common.network.simple.RequestManager.getInstance()
                xyz.adscope.common.network.simple.SimpleUrlRequest r1 = new xyz.adscope.common.network.simple.SimpleUrlRequest
                r2 = 0
                r1.<init>(r3, r2)
                xyz.adscope.common.network.simple.SimpleResponse r4 = r0.perform(r1, r4, r5)
                return r4
        }
    }

    private SimpleUrlRequest(xyz.adscope.common.network.simple.SimpleUrlRequest.Api r2) {
            r1 = this;
            r1.<init>(r2)
            xyz.adscope.common.network.simple.cache.CacheMode r0 = xyz.adscope.common.network.simple.SimpleUrlRequest.Api.a(r2)
            if (r0 != 0) goto Lc
            xyz.adscope.common.network.simple.cache.CacheMode r0 = xyz.adscope.common.network.simple.cache.CacheMode.HTTP
            goto L10
        Lc:
            xyz.adscope.common.network.simple.cache.CacheMode r0 = xyz.adscope.common.network.simple.SimpleUrlRequest.Api.a(r2)
        L10:
            r1.j = r0
            java.lang.String r0 = xyz.adscope.common.network.simple.SimpleUrlRequest.Api.b(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L25
            xyz.adscope.common.network.Url r0 = r1.url()
            java.lang.String r0 = r0.toString()
            goto L29
        L25:
            java.lang.String r0 = xyz.adscope.common.network.simple.SimpleUrlRequest.Api.b(r2)
        L29:
            r1.k = r0
            xyz.adscope.common.network.simple.Converter r2 = xyz.adscope.common.network.simple.SimpleUrlRequest.Api.c(r2)
            r1.l = r2
            return
    }

    /* synthetic */ SimpleUrlRequest(xyz.adscope.common.network.simple.SimpleUrlRequest.Api r1, xyz.adscope.common.network.simple.SimpleUrlRequest.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static xyz.adscope.common.network.simple.SimpleUrlRequest.Api newApi(xyz.adscope.common.network.Url r2, xyz.adscope.common.network.RequestMethod r3) {
            xyz.adscope.common.network.simple.SimpleUrlRequest$Api r0 = new xyz.adscope.common.network.simple.SimpleUrlRequest$Api
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    @Override // xyz.adscope.common.network.simple.SimpleRequest
    public java.lang.String cacheKey() {
            r1 = this;
            java.lang.String r0 = r1.k
            return r0
    }

    @Override // xyz.adscope.common.network.simple.SimpleRequest
    public xyz.adscope.common.network.simple.cache.CacheMode cacheMode() {
            r1 = this;
            xyz.adscope.common.network.simple.cache.CacheMode r0 = r1.j
            return r0
    }

    @Override // xyz.adscope.common.network.simple.SimpleRequest
    public xyz.adscope.common.network.simple.Converter converter() {
            r1 = this;
            xyz.adscope.common.network.simple.Converter r0 = r1.l
            return r0
    }
}
