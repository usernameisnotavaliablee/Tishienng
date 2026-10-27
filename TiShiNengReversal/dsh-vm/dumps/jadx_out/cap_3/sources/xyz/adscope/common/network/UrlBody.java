package xyz.adscope.common.network;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class UrlBody extends xyz.adscope.common.network.BaseContent<xyz.adscope.common.network.StringBody> implements xyz.adscope.common.network.RequestBody {
    private final xyz.adscope.common.network.Params b;
    private final java.nio.charset.Charset c;
    private final java.lang.String d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.network.UrlBody$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder {
        private java.nio.charset.Charset a;
        private java.lang.String b;
        private xyz.adscope.common.network.Params.Builder c;

        private Builder() {
                r1 = this;
                r1.<init>()
                xyz.adscope.common.network.Params$Builder r0 = xyz.adscope.common.network.Params.newBuilder()
                r1.c = r0
                return
        }

        /* synthetic */ Builder(xyz.adscope.common.network.UrlBody.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ xyz.adscope.common.network.Params.Builder a(xyz.adscope.common.network.UrlBody.Builder r0) {
                xyz.adscope.common.network.Params$Builder r0 = r0.c
                return r0
        }

        static /* synthetic */ java.nio.charset.Charset b(xyz.adscope.common.network.UrlBody.Builder r0) {
                java.nio.charset.Charset r0 = r0.a
                return r0
        }

        static /* synthetic */ java.lang.String c(xyz.adscope.common.network.UrlBody.Builder r0) {
                java.lang.String r0 = r0.b
                return r0
        }

        public xyz.adscope.common.network.UrlBody build() {
                r2 = this;
                xyz.adscope.common.network.UrlBody r0 = new xyz.adscope.common.network.UrlBody
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public xyz.adscope.common.network.UrlBody.Builder charset(java.nio.charset.Charset r1) {
                r0 = this;
                r0.a = r1
                return r0
        }

        public xyz.adscope.common.network.UrlBody.Builder clearParams() {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.clear()
                return r1
        }

        public xyz.adscope.common.network.UrlBody.Builder contentType(java.lang.String r1) {
                r0 = this;
                r0.b = r1
                return r0
        }

        public xyz.adscope.common.network.UrlBody.Builder param(java.lang.String r2, char r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.add(r2, r3)
                return r1
        }

        public xyz.adscope.common.network.UrlBody.Builder param(java.lang.String r2, double r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.add(r2, r3)
                return r1
        }

        public xyz.adscope.common.network.UrlBody.Builder param(java.lang.String r2, float r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.add(r2, r3)
                return r1
        }

        public xyz.adscope.common.network.UrlBody.Builder param(java.lang.String r2, int r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.add(r2, r3)
                return r1
        }

        public xyz.adscope.common.network.UrlBody.Builder param(java.lang.String r2, long r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.add(r2, r3)
                return r1
        }

        public xyz.adscope.common.network.UrlBody.Builder param(java.lang.String r2, java.lang.CharSequence r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.add(r2, r3)
                return r1
        }

        public xyz.adscope.common.network.UrlBody.Builder param(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.add(r2, r3)
                return r1
        }

        public xyz.adscope.common.network.UrlBody.Builder param(java.lang.String r2, java.util.List<java.lang.String> r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.add(r2, r3)
                return r1
        }

        public xyz.adscope.common.network.UrlBody.Builder param(java.lang.String r2, short r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.add(r2, r3)
                return r1
        }

        public xyz.adscope.common.network.UrlBody.Builder param(java.lang.String r2, boolean r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.add(r2, r3)
                return r1
        }

        public xyz.adscope.common.network.UrlBody.Builder params(xyz.adscope.common.network.Params r2) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.add(r2)
                return r1
        }

        public xyz.adscope.common.network.UrlBody.Builder removeParam(java.lang.String r2) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.remove(r2)
                return r1
        }
    }

    private UrlBody(xyz.adscope.common.network.UrlBody.Builder r2) {
            r1 = this;
            r1.<init>()
            xyz.adscope.common.network.Params$Builder r0 = xyz.adscope.common.network.UrlBody.Builder.a(r2)
            xyz.adscope.common.network.Params r0 = r0.build()
            r1.b = r0
            java.nio.charset.Charset r0 = xyz.adscope.common.network.UrlBody.Builder.b(r2)
            if (r0 != 0) goto L1c
            xyz.adscope.common.network.KalleConfig r0 = xyz.adscope.common.network.Kalle.getConfig()
            java.nio.charset.Charset r0 = r0.getCharset()
            goto L20
        L1c:
            java.nio.charset.Charset r0 = xyz.adscope.common.network.UrlBody.Builder.b(r2)
        L20:
            r1.c = r0
            java.lang.String r0 = xyz.adscope.common.network.UrlBody.Builder.c(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L2f
            java.lang.String r2 = "application/x-www-form-urlencoded"
            goto L33
        L2f:
            java.lang.String r2 = xyz.adscope.common.network.UrlBody.Builder.c(r2)
        L33:
            r1.d = r2
            return
    }

    /* synthetic */ UrlBody(xyz.adscope.common.network.UrlBody.Builder r1, xyz.adscope.common.network.UrlBody.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static xyz.adscope.common.network.UrlBody.Builder newBuilder() {
            xyz.adscope.common.network.UrlBody$Builder r0 = new xyz.adscope.common.network.UrlBody$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    @Override // xyz.adscope.common.network.BaseContent
    protected void a(java.io.OutputStream r3) {
            r2 = this;
            xyz.adscope.common.network.Params r0 = r2.b
            r1 = 1
            java.lang.String r0 = r0.toString(r1)
            java.nio.charset.Charset r1 = r2.c
            xyz.adscope.common.network.util.IOUtils.write(r3, r0, r1)
            return
    }

    @Override // xyz.adscope.common.network.Content
    public long contentLength() {
            r2 = this;
            xyz.adscope.common.network.Params r0 = r2.b
            r1 = 1
            java.lang.String r0 = r0.toString(r1)
            java.nio.charset.Charset r1 = r2.c
            byte[] r0 = xyz.adscope.common.network.util.IOUtils.toByteArray(r0, r1)
            int r0 = r0.length
            long r0 = (long) r0
            return r0
    }

    @Override // xyz.adscope.common.network.Content
    public java.lang.String contentType() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = "; charset="
            r0.append(r1)
            java.nio.charset.Charset r1 = r2.c
            java.lang.String r1 = r1.name()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public xyz.adscope.common.network.Params copyParams() {
            r1 = this;
            xyz.adscope.common.network.Params r0 = r1.b
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            r0 = 0
            java.lang.String r0 = r1.toString(r0)
            return r0
    }

    public java.lang.String toString(boolean r2) {
            r1 = this;
            xyz.adscope.common.network.Params r0 = r1.b
            java.lang.String r2 = r0.toString(r2)
            return r2
    }
}
