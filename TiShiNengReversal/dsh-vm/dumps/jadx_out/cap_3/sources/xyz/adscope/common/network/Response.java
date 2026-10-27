package xyz.adscope.common.network;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class Response implements java.io.Closeable {
    private final int a;
    private final xyz.adscope.common.network.Headers b;
    private final xyz.adscope.common.network.ResponseBody c;
    private final java.lang.String d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.network.Response$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {
        private int a;
        private xyz.adscope.common.network.Headers b;
        private xyz.adscope.common.network.ResponseBody c;
        private java.lang.String d;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ int a(xyz.adscope.common.network.Response.Builder r0) {
                int r0 = r0.a
                return r0
        }

        static /* synthetic */ xyz.adscope.common.network.Headers b(xyz.adscope.common.network.Response.Builder r0) {
                xyz.adscope.common.network.Headers r0 = r0.b
                return r0
        }

        static /* synthetic */ xyz.adscope.common.network.ResponseBody c(xyz.adscope.common.network.Response.Builder r0) {
                xyz.adscope.common.network.ResponseBody r0 = r0.c
                return r0
        }

        static /* synthetic */ java.lang.String d(xyz.adscope.common.network.Response.Builder r0) {
                java.lang.String r0 = r0.d
                return r0
        }

        public xyz.adscope.common.network.Response.Builder body(xyz.adscope.common.network.ResponseBody r1) {
                r0 = this;
                r0.c = r1
                return r0
        }

        public xyz.adscope.common.network.Response build() {
                r2 = this;
                xyz.adscope.common.network.Response r0 = new xyz.adscope.common.network.Response
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public xyz.adscope.common.network.Response.Builder code(int r1) {
                r0 = this;
                r0.a = r1
                return r0
        }

        public xyz.adscope.common.network.Response.Builder headers(xyz.adscope.common.network.Headers r1) {
                r0 = this;
                r0.b = r1
                return r0
        }

        public xyz.adscope.common.network.Response.Builder locationUrl(java.lang.String r1) {
                r0 = this;
                r0.d = r1
                return r0
        }
    }

    private Response(xyz.adscope.common.network.Response.Builder r2) {
            r1 = this;
            r1.<init>()
            int r0 = xyz.adscope.common.network.Response.Builder.a(r2)
            r1.a = r0
            xyz.adscope.common.network.Headers r0 = xyz.adscope.common.network.Response.Builder.b(r2)
            r1.b = r0
            xyz.adscope.common.network.ResponseBody r0 = xyz.adscope.common.network.Response.Builder.c(r2)
            r1.c = r0
            java.lang.String r2 = xyz.adscope.common.network.Response.Builder.d(r2)
            r1.d = r2
            return
    }

    /* synthetic */ Response(xyz.adscope.common.network.Response.Builder r1, xyz.adscope.common.network.Response.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static xyz.adscope.common.network.Response.Builder newBuilder() {
            xyz.adscope.common.network.Response$Builder r0 = new xyz.adscope.common.network.Response$Builder
            r0.<init>()
            return r0
    }

    public xyz.adscope.common.network.ResponseBody body() {
            r1 = this;
            xyz.adscope.common.network.ResponseBody r0 = r1.c
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            xyz.adscope.common.network.ResponseBody r0 = r1.c
            xyz.adscope.common.network.util.IOUtils.closeQuietly(r0)
            return
    }

    public int code() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public xyz.adscope.common.network.Headers headers() {
            r1 = this;
            xyz.adscope.common.network.Headers r0 = r1.b
            return r0
    }

    public boolean isRedirect() {
            r2 = this;
            int r0 = r2.a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto Lf
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto Lf
            switch(r0) {
                case 300: goto Lf;
                case 301: goto Lf;
                case 302: goto Lf;
                case 303: goto Lf;
                default: goto Ld;
            }
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    public java.lang.String locationUrl() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }
}
