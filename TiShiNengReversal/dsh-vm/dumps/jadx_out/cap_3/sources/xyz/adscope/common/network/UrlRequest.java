package xyz.adscope.common.network;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class UrlRequest extends xyz.adscope.common.network.Request {
    private final xyz.adscope.common.network.Url i;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.network.UrlRequest$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Api<T extends xyz.adscope.common.network.UrlRequest.Api<T>> extends xyz.adscope.common.network.Request.Api<T> {
        private xyz.adscope.common.network.Url.Builder i;

        protected Api(xyz.adscope.common.network.Url r1, xyz.adscope.common.network.RequestMethod r2) {
                r0 = this;
                r0.<init>(r2)
                xyz.adscope.common.network.Url$Builder r1 = r1.builder()
                r0.i = r1
                xyz.adscope.common.network.KalleConfig r2 = xyz.adscope.common.network.Kalle.getConfig()
                xyz.adscope.common.network.Params r2 = r2.getParams()
                r1.addQuery(r2)
                return
        }

        static /* synthetic */ xyz.adscope.common.network.Url.Builder a(xyz.adscope.common.network.UrlRequest.Api r0) {
                xyz.adscope.common.network.Url$Builder r0 = r0.i
                return r0
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api clearParams() {
                r1 = this;
                xyz.adscope.common.network.UrlRequest$Api r0 = r1.clearParams()
                return r0
        }

        @Override // xyz.adscope.common.network.Request.Api
        public T clearParams() {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.clearQuery()
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api param(java.lang.String r1, char r2) {
                r0 = this;
                xyz.adscope.common.network.UrlRequest$Api r1 = r0.param(r1, r2)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api param(java.lang.String r1, double r2) {
                r0 = this;
                xyz.adscope.common.network.UrlRequest$Api r1 = r0.param(r1, r2)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api param(java.lang.String r1, float r2) {
                r0 = this;
                xyz.adscope.common.network.UrlRequest$Api r1 = r0.param(r1, r2)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api param(java.lang.String r1, int r2) {
                r0 = this;
                xyz.adscope.common.network.UrlRequest$Api r1 = r0.param(r1, r2)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api param(java.lang.String r1, long r2) {
                r0 = this;
                xyz.adscope.common.network.UrlRequest$Api r1 = r0.param(r1, r2)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api param(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                xyz.adscope.common.network.UrlRequest$Api r1 = r0.param(r1, r2)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api param(java.lang.String r1, java.util.List r2) {
                r0 = this;
                xyz.adscope.common.network.UrlRequest$Api r1 = r0.param(r1, r2)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api param(java.lang.String r1, short r2) {
                r0 = this;
                xyz.adscope.common.network.UrlRequest$Api r1 = r0.param(r1, r2)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api param(java.lang.String r1, boolean r2) {
                r0 = this;
                xyz.adscope.common.network.UrlRequest$Api r1 = r0.param(r1, r2)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public T param(java.lang.String r2, char r3) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.addQuery(r2, r3)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public T param(java.lang.String r2, double r3) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.addQuery(r2, r3)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public T param(java.lang.String r2, float r3) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.addQuery(r2, r3)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public T param(java.lang.String r2, int r3) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.addQuery(r2, r3)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public T param(java.lang.String r2, long r3) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.addQuery(r2, r3)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public T param(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.addQuery(r2, r3)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public T param(java.lang.String r2, java.util.List<java.lang.String> r3) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.addQuery(r2, r3)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public T param(java.lang.String r2, short r3) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.addQuery(r2, r3)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public T param(java.lang.String r2, boolean r3) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.addQuery(r2, r3)
                return r1
        }

        public T params(xyz.adscope.common.network.Params r2) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.addQuery(r2)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api path(char r1) {
                r0 = this;
                xyz.adscope.common.network.UrlRequest$Api r1 = r0.path(r1)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api path(double r1) {
                r0 = this;
                xyz.adscope.common.network.UrlRequest$Api r1 = r0.path(r1)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api path(float r1) {
                r0 = this;
                xyz.adscope.common.network.UrlRequest$Api r1 = r0.path(r1)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api path(int r1) {
                r0 = this;
                xyz.adscope.common.network.UrlRequest$Api r1 = r0.path(r1)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api path(long r1) {
                r0 = this;
                xyz.adscope.common.network.UrlRequest$Api r1 = r0.path(r1)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api path(java.lang.String r1) {
                r0 = this;
                xyz.adscope.common.network.UrlRequest$Api r1 = r0.path(r1)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api path(boolean r1) {
                r0 = this;
                xyz.adscope.common.network.UrlRequest$Api r1 = r0.path(r1)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public T path(char r2) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.addPath(r2)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public T path(double r2) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.addPath(r2)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public T path(float r2) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.addPath(r2)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public T path(int r2) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.addPath(r2)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public T path(long r2) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.addPath(r2)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public T path(java.lang.String r2) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.addPath(r2)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public T path(boolean r2) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.addPath(r2)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api removeParam(java.lang.String r1) {
                r0 = this;
                xyz.adscope.common.network.UrlRequest$Api r1 = r0.removeParam(r1)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public T removeParam(java.lang.String r2) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.removeQuery(r2)
                return r1
        }

        public T setParams(xyz.adscope.common.network.Params r2) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.setQuery(r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder extends xyz.adscope.common.network.UrlRequest.Api<xyz.adscope.common.network.UrlRequest.Builder> {
        private Builder(xyz.adscope.common.network.Url r1, xyz.adscope.common.network.RequestMethod r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ Builder(xyz.adscope.common.network.Url r1, xyz.adscope.common.network.RequestMethod r2, xyz.adscope.common.network.UrlRequest.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public xyz.adscope.common.network.UrlRequest build() {
                r1 = this;
                xyz.adscope.common.network.UrlRequest r0 = new xyz.adscope.common.network.UrlRequest
                r0.<init>(r1)
                return r0
        }
    }

    protected UrlRequest(xyz.adscope.common.network.UrlRequest.Api r1) {
            r0 = this;
            r0.<init>(r1)
            xyz.adscope.common.network.Url$Builder r1 = xyz.adscope.common.network.UrlRequest.Api.a(r1)
            xyz.adscope.common.network.Url r1 = r1.build()
            r0.i = r1
            return
    }

    public static xyz.adscope.common.network.UrlRequest.Builder newBuilder(java.lang.String r0, xyz.adscope.common.network.RequestMethod r1) {
            xyz.adscope.common.network.Url$Builder r0 = xyz.adscope.common.network.Url.newBuilder(r0)
            xyz.adscope.common.network.Url r0 = r0.build()
            xyz.adscope.common.network.UrlRequest$Builder r0 = newBuilder(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static xyz.adscope.common.network.UrlRequest.Builder newBuilder(xyz.adscope.common.network.Url.Builder r0, xyz.adscope.common.network.RequestMethod r1) {
            xyz.adscope.common.network.Url r0 = r0.build()
            xyz.adscope.common.network.UrlRequest$Builder r0 = newBuilder(r0, r1)
            return r0
    }

    public static xyz.adscope.common.network.UrlRequest.Builder newBuilder(xyz.adscope.common.network.Url r2, xyz.adscope.common.network.RequestMethod r3) {
            xyz.adscope.common.network.UrlRequest$Builder r0 = new xyz.adscope.common.network.UrlRequest$Builder
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    @Override // xyz.adscope.common.network.Request
    public xyz.adscope.common.network.RequestBody body() {
            r2 = this;
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "It should not be called."
            r0.<init>(r1)
            throw r0
    }

    @Override // xyz.adscope.common.network.Request
    public xyz.adscope.common.network.Params copyParams() {
            r1 = this;
            xyz.adscope.common.network.Url r0 = r1.i
            xyz.adscope.common.network.Params r0 = r0.getParams()
            return r0
    }

    @Override // xyz.adscope.common.network.Request
    public xyz.adscope.common.network.Url url() {
            r1 = this;
            xyz.adscope.common.network.Url r0 = r1.i
            return r0
    }
}
