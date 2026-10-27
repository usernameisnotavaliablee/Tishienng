package xyz.adscope.common.network;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class BodyRequest extends xyz.adscope.common.network.Request {
    private final xyz.adscope.common.network.Url i;
    private final xyz.adscope.common.network.RequestBody j;
    private final xyz.adscope.common.network.Params k;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.network.BodyRequest$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Api<T extends xyz.adscope.common.network.BodyRequest.Api<T>> extends xyz.adscope.common.network.Request.Api<T> {
        private xyz.adscope.common.network.Url.Builder i;
        private xyz.adscope.common.network.Params.Builder j;
        private xyz.adscope.common.network.RequestBody k;

        protected Api(xyz.adscope.common.network.Url r1, xyz.adscope.common.network.RequestMethod r2) {
                r0 = this;
                r0.<init>(r2)
                xyz.adscope.common.network.Url$Builder r1 = r1.builder()
                r0.i = r1
                xyz.adscope.common.network.Params$Builder r1 = xyz.adscope.common.network.Params.newBuilder()
                r0.j = r1
                xyz.adscope.common.network.KalleConfig r2 = xyz.adscope.common.network.Kalle.getConfig()
                xyz.adscope.common.network.Params r2 = r2.getParams()
                r1.add(r2)
                return
        }

        static /* synthetic */ xyz.adscope.common.network.Url.Builder a(xyz.adscope.common.network.BodyRequest.Api r0) {
                xyz.adscope.common.network.Url$Builder r0 = r0.i
                return r0
        }

        static /* synthetic */ xyz.adscope.common.network.Params.Builder b(xyz.adscope.common.network.BodyRequest.Api r0) {
                xyz.adscope.common.network.Params$Builder r0 = r0.j
                return r0
        }

        static /* synthetic */ xyz.adscope.common.network.RequestBody c(xyz.adscope.common.network.BodyRequest.Api r0) {
                xyz.adscope.common.network.RequestBody r0 = r0.k
                return r0
        }

        public T binaries(java.lang.String r2, java.util.List<xyz.adscope.common.network.Binary> r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.j
                r0.binaries(r2, r3)
                return r1
        }

        public T binary(java.lang.String r2, xyz.adscope.common.network.Binary r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.j
                r0.binary(r2, r3)
                return r1
        }

        public T body(xyz.adscope.common.network.RequestBody r1) {
                r0 = this;
                r0.k = r1
                return r0
        }

        @Override // xyz.adscope.common.network.Request.Api
        public T clearParams() {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.j
                r0.clear()
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api clearParams() {
                r1 = this;
                xyz.adscope.common.network.BodyRequest$Api r0 = r1.clearParams()
                return r0
        }

        public T file(java.lang.String r2, java.io.File r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.j
                r0.file(r2, r3)
                return r1
        }

        public T files(java.lang.String r2, java.util.List<java.io.File> r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.j
                r0.files(r2, r3)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public T param(java.lang.String r2, char r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.j
                r0.add(r2, r3)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public T param(java.lang.String r2, double r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.j
                r0.add(r2, r3)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public T param(java.lang.String r2, float r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.j
                r0.add(r2, r3)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public T param(java.lang.String r1, int r2) {
                r0 = this;
                java.lang.String r2 = java.lang.Integer.toString(r2)
                xyz.adscope.common.network.BodyRequest$Api r1 = r0.param(r1, r2)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public T param(java.lang.String r2, long r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.j
                r0.add(r2, r3)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public T param(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.j
                r0.add(r2, r3)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public T param(java.lang.String r2, java.util.List<java.lang.String> r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.j
                r0.add(r2, r3)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public T param(java.lang.String r2, short r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.j
                r0.add(r2, r3)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public T param(java.lang.String r2, boolean r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.j
                r0.add(r2, r3)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api param(java.lang.String r1, char r2) {
                r0 = this;
                xyz.adscope.common.network.BodyRequest$Api r1 = r0.param(r1, r2)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api param(java.lang.String r1, double r2) {
                r0 = this;
                xyz.adscope.common.network.BodyRequest$Api r1 = r0.param(r1, r2)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api param(java.lang.String r1, float r2) {
                r0 = this;
                xyz.adscope.common.network.BodyRequest$Api r1 = r0.param(r1, r2)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api param(java.lang.String r1, int r2) {
                r0 = this;
                xyz.adscope.common.network.BodyRequest$Api r1 = r0.param(r1, r2)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api param(java.lang.String r1, long r2) {
                r0 = this;
                xyz.adscope.common.network.BodyRequest$Api r1 = r0.param(r1, r2)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api param(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                xyz.adscope.common.network.BodyRequest$Api r1 = r0.param(r1, r2)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api param(java.lang.String r1, java.util.List r2) {
                r0 = this;
                xyz.adscope.common.network.BodyRequest$Api r1 = r0.param(r1, r2)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api param(java.lang.String r1, short r2) {
                r0 = this;
                xyz.adscope.common.network.BodyRequest$Api r1 = r0.param(r1, r2)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api param(java.lang.String r1, boolean r2) {
                r0 = this;
                xyz.adscope.common.network.BodyRequest$Api r1 = r0.param(r1, r2)
                return r1
        }

        public T params(java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.j
                r0.add(r2)
                return r1
        }

        public T params(xyz.adscope.common.network.Params r2) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.j
                r0.add(r2)
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
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api path(char r1) {
                r0 = this;
                xyz.adscope.common.network.BodyRequest$Api r1 = r0.path(r1)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api path(double r1) {
                r0 = this;
                xyz.adscope.common.network.BodyRequest$Api r1 = r0.path(r1)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api path(float r1) {
                r0 = this;
                xyz.adscope.common.network.BodyRequest$Api r1 = r0.path(r1)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api path(int r1) {
                r0 = this;
                xyz.adscope.common.network.BodyRequest$Api r1 = r0.path(r1)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api path(long r1) {
                r0 = this;
                xyz.adscope.common.network.BodyRequest$Api r1 = r0.path(r1)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api path(java.lang.String r1) {
                r0 = this;
                xyz.adscope.common.network.BodyRequest$Api r1 = r0.path(r1)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api path(boolean r1) {
                r0 = this;
                xyz.adscope.common.network.BodyRequest$Api r1 = r0.path(r1)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public T removeParam(java.lang.String r2) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.j
                r0.remove(r2)
                return r1
        }

        @Override // xyz.adscope.common.network.Request.Api
        public /* bridge */ /* synthetic */ xyz.adscope.common.network.Request.Api removeParam(java.lang.String r1) {
                r0 = this;
                xyz.adscope.common.network.BodyRequest$Api r1 = r0.removeParam(r1)
                return r1
        }

        public T setParams(xyz.adscope.common.network.Params r2) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.j
                r0.set(r2)
                return r1
        }

        public T setUrlParam(xyz.adscope.common.network.Params r2) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.setQuery(r2)
                return r1
        }

        public T urlParam(java.lang.String r2, char r3) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.addQuery(r2, r3)
                return r1
        }

        public T urlParam(java.lang.String r2, double r3) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.addQuery(r2, r3)
                return r1
        }

        public T urlParam(java.lang.String r2, float r3) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.addQuery(r2, r3)
                return r1
        }

        public T urlParam(java.lang.String r2, int r3) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.addQuery(r2, r3)
                return r1
        }

        public T urlParam(java.lang.String r2, long r3) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.addQuery(r2, r3)
                return r1
        }

        public T urlParam(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.addQuery(r2, r3)
                return r1
        }

        public T urlParam(java.lang.String r2, java.util.List<java.lang.String> r3) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.addQuery(r2, r3)
                return r1
        }

        public T urlParam(java.lang.String r2, short r3) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.addQuery(r2, r3)
                return r1
        }

        public T urlParam(java.lang.String r2, boolean r3) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.addQuery(r2, r3)
                return r1
        }

        public T urlParam(xyz.adscope.common.network.Params r2) {
                r1 = this;
                xyz.adscope.common.network.Url$Builder r0 = r1.i
                r0.addQuery(r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder extends xyz.adscope.common.network.BodyRequest.Api<xyz.adscope.common.network.BodyRequest.Builder> {
        private Builder(xyz.adscope.common.network.Url r1, xyz.adscope.common.network.RequestMethod r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ Builder(xyz.adscope.common.network.Url r1, xyz.adscope.common.network.RequestMethod r2, xyz.adscope.common.network.BodyRequest.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public xyz.adscope.common.network.BodyRequest build() {
                r1 = this;
                xyz.adscope.common.network.BodyRequest r0 = new xyz.adscope.common.network.BodyRequest
                r0.<init>(r1)
                return r0
        }
    }

    protected BodyRequest(xyz.adscope.common.network.BodyRequest.Api r3) {
            r2 = this;
            r2.<init>(r3)
            xyz.adscope.common.network.Url$Builder r0 = xyz.adscope.common.network.BodyRequest.Api.a(r3)
            xyz.adscope.common.network.Url r0 = r0.build()
            r2.i = r0
            xyz.adscope.common.network.Params$Builder r0 = xyz.adscope.common.network.BodyRequest.Api.b(r3)
            xyz.adscope.common.network.Params r0 = r0.build()
            r2.k = r0
            xyz.adscope.common.network.RequestBody r1 = xyz.adscope.common.network.BodyRequest.Api.c(r3)
            if (r1 != 0) goto L2d
            boolean r3 = r0.hasBinary()
            if (r3 == 0) goto L28
            xyz.adscope.common.network.FormBody r3 = r0.toFormBody()
            goto L31
        L28:
            xyz.adscope.common.network.UrlBody r3 = r0.toUrlBody()
            goto L31
        L2d:
            xyz.adscope.common.network.RequestBody r3 = xyz.adscope.common.network.BodyRequest.Api.c(r3)
        L31:
            r2.j = r3
            return
    }

    public static xyz.adscope.common.network.BodyRequest.Builder newBuilder(java.lang.String r0, xyz.adscope.common.network.RequestMethod r1) {
            xyz.adscope.common.network.Url$Builder r0 = xyz.adscope.common.network.Url.newBuilder(r0)
            xyz.adscope.common.network.Url r0 = r0.build()
            xyz.adscope.common.network.BodyRequest$Builder r0 = newBuilder(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static xyz.adscope.common.network.BodyRequest.Builder newBuilder(xyz.adscope.common.network.Url.Builder r0, xyz.adscope.common.network.RequestMethod r1) {
            xyz.adscope.common.network.Url r0 = r0.build()
            xyz.adscope.common.network.BodyRequest$Builder r0 = newBuilder(r0, r1)
            return r0
    }

    public static xyz.adscope.common.network.BodyRequest.Builder newBuilder(xyz.adscope.common.network.Url r2, xyz.adscope.common.network.RequestMethod r3) {
            xyz.adscope.common.network.BodyRequest$Builder r0 = new xyz.adscope.common.network.BodyRequest$Builder
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    @Override // xyz.adscope.common.network.Request
    public xyz.adscope.common.network.RequestBody body() {
            r1 = this;
            xyz.adscope.common.network.RequestBody r0 = r1.j
            return r0
    }

    @Override // xyz.adscope.common.network.Request
    public xyz.adscope.common.network.Params copyParams() {
            r1 = this;
            xyz.adscope.common.network.Params r0 = r1.k
            return r0
    }

    @Override // xyz.adscope.common.network.Request
    public xyz.adscope.common.network.Url url() {
            r1 = this;
            xyz.adscope.common.network.Url r0 = r1.i
            return r0
    }
}
