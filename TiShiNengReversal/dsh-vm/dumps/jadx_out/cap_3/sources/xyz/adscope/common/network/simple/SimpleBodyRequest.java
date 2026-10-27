package xyz.adscope.common.network.simple;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class SimpleBodyRequest extends xyz.adscope.common.network.BodyRequest implements xyz.adscope.common.network.simple.SimpleRequest {
    private final xyz.adscope.common.network.simple.cache.CacheMode l;
    private final java.lang.String m;
    private final xyz.adscope.common.network.simple.Converter n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.network.simple.SimpleBodyRequest$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Api extends xyz.adscope.common.network.BodyRequest.Api<xyz.adscope.common.network.simple.SimpleBodyRequest.Api> {
        private xyz.adscope.common.network.simple.cache.CacheMode l;
        private java.lang.String m;
        private xyz.adscope.common.network.simple.Converter n;

        private Api(xyz.adscope.common.network.Url r1, xyz.adscope.common.network.RequestMethod r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ Api(xyz.adscope.common.network.Url r1, xyz.adscope.common.network.RequestMethod r2, xyz.adscope.common.network.simple.SimpleBodyRequest.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static /* synthetic */ xyz.adscope.common.network.simple.cache.CacheMode a(xyz.adscope.common.network.simple.SimpleBodyRequest.Api r0) {
                xyz.adscope.common.network.simple.cache.CacheMode r0 = r0.l
                return r0
        }

        static /* synthetic */ java.lang.String b(xyz.adscope.common.network.simple.SimpleBodyRequest.Api r0) {
                java.lang.String r0 = r0.m
                return r0
        }

        static /* synthetic */ xyz.adscope.common.network.simple.Converter c(xyz.adscope.common.network.simple.SimpleBodyRequest.Api r0) {
                xyz.adscope.common.network.simple.Converter r0 = r0.n
                return r0
        }

        public xyz.adscope.common.network.simple.SimpleBodyRequest.Api cacheKey(java.lang.String r1) {
                r0 = this;
                r0.m = r1
                return r0
        }

        public xyz.adscope.common.network.simple.SimpleBodyRequest.Api cacheMode(xyz.adscope.common.network.simple.cache.CacheMode r1) {
                r0 = this;
                r0.l = r1
                return r0
        }

        public xyz.adscope.common.network.simple.SimpleBodyRequest.Api converter(xyz.adscope.common.network.simple.Converter r1) {
                r0 = this;
                r0.n = r1
                return r0
        }

        public <S, F> xyz.adscope.common.network.Canceller perform(xyz.adscope.common.network.simple.Callback<S, F> r4) {
                r3 = this;
                xyz.adscope.common.network.simple.RequestManager r0 = xyz.adscope.common.network.simple.RequestManager.getInstance()
                xyz.adscope.common.network.simple.SimpleBodyRequest r1 = new xyz.adscope.common.network.simple.SimpleBodyRequest
                r2 = 0
                r1.<init>(r3, r2)
                xyz.adscope.common.network.Canceller r4 = r0.perform(r1, r4)
                return r4
        }

        public <S, F> xyz.adscope.common.network.simple.SimpleResponse<S, F> perform(java.lang.reflect.Type r4, java.lang.reflect.Type r5) {
                r3 = this;
                xyz.adscope.common.network.simple.RequestManager r0 = xyz.adscope.common.network.simple.RequestManager.getInstance()
                xyz.adscope.common.network.simple.SimpleBodyRequest r1 = new xyz.adscope.common.network.simple.SimpleBodyRequest
                r2 = 0
                r1.<init>(r3, r2)
                xyz.adscope.common.network.simple.SimpleResponse r4 = r0.perform(r1, r4, r5)
                return r4
        }
    }

    private SimpleBodyRequest(xyz.adscope.common.network.simple.SimpleBodyRequest.Api r2) {
            r1 = this;
            r1.<init>(r2)
            xyz.adscope.common.network.simple.cache.CacheMode r0 = xyz.adscope.common.network.simple.SimpleBodyRequest.Api.a(r2)
            if (r0 != 0) goto Lc
            xyz.adscope.common.network.simple.cache.CacheMode r0 = xyz.adscope.common.network.simple.cache.CacheMode.HTTP
            goto L10
        Lc:
            xyz.adscope.common.network.simple.cache.CacheMode r0 = xyz.adscope.common.network.simple.SimpleBodyRequest.Api.a(r2)
        L10:
            r1.l = r0
            java.lang.String r0 = xyz.adscope.common.network.simple.SimpleBodyRequest.Api.b(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L25
            xyz.adscope.common.network.Url r0 = r1.url()
            java.lang.String r0 = r0.toString()
            goto L29
        L25:
            java.lang.String r0 = xyz.adscope.common.network.simple.SimpleBodyRequest.Api.b(r2)
        L29:
            r1.m = r0
            xyz.adscope.common.network.simple.Converter r2 = xyz.adscope.common.network.simple.SimpleBodyRequest.Api.c(r2)
            r1.n = r2
            return
    }

    /* synthetic */ SimpleBodyRequest(xyz.adscope.common.network.simple.SimpleBodyRequest.Api r1, xyz.adscope.common.network.simple.SimpleBodyRequest.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static xyz.adscope.common.network.simple.SimpleBodyRequest.Api newApi(xyz.adscope.common.network.Url r2, xyz.adscope.common.network.RequestMethod r3) {
            xyz.adscope.common.network.simple.SimpleBodyRequest$Api r0 = new xyz.adscope.common.network.simple.SimpleBodyRequest$Api
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    @Override // xyz.adscope.common.network.simple.SimpleRequest
    public java.lang.String cacheKey() {
            r1 = this;
            java.lang.String r0 = r1.m
            return r0
    }

    @Override // xyz.adscope.common.network.simple.SimpleRequest
    public xyz.adscope.common.network.simple.cache.CacheMode cacheMode() {
            r1 = this;
            xyz.adscope.common.network.simple.cache.CacheMode r0 = r1.l
            return r0
    }

    @Override // xyz.adscope.common.network.simple.SimpleRequest
    public xyz.adscope.common.network.simple.Converter converter() {
            r1 = this;
            xyz.adscope.common.network.simple.Converter r0 = r1.n
            return r0
    }
}
