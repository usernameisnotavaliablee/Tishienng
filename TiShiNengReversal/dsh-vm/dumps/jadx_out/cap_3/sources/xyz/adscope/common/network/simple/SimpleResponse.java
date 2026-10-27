package xyz.adscope.common.network.simple;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class SimpleResponse<Succeed, Failed> {
    private final int a;
    private final xyz.adscope.common.network.Headers b;
    private final boolean c;
    private final Succeed d;
    private final Failed e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.network.simple.SimpleResponse$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder<Succeed, Failed> {
        private int a;
        private xyz.adscope.common.network.Headers b;
        private boolean c;
        private Failed d;
        private Succeed e;

        private Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ Builder(xyz.adscope.common.network.simple.SimpleResponse.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ int a(xyz.adscope.common.network.simple.SimpleResponse.Builder r0) {
                int r0 = r0.a
                return r0
        }

        static /* synthetic */ xyz.adscope.common.network.Headers b(xyz.adscope.common.network.simple.SimpleResponse.Builder r0) {
                xyz.adscope.common.network.Headers r0 = r0.b
                return r0
        }

        static /* synthetic */ boolean c(xyz.adscope.common.network.simple.SimpleResponse.Builder r0) {
                boolean r0 = r0.c
                return r0
        }

        static /* synthetic */ java.lang.Object d(xyz.adscope.common.network.simple.SimpleResponse.Builder r0) {
                Succeed r0 = r0.e
                return r0
        }

        static /* synthetic */ java.lang.Object e(xyz.adscope.common.network.simple.SimpleResponse.Builder r0) {
                Failed r0 = r0.d
                return r0
        }

        public xyz.adscope.common.network.simple.SimpleResponse<Succeed, Failed> build() {
                r2 = this;
                xyz.adscope.common.network.simple.SimpleResponse r0 = new xyz.adscope.common.network.simple.SimpleResponse
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public xyz.adscope.common.network.simple.SimpleResponse.Builder<Succeed, Failed> code(int r1) {
                r0 = this;
                r0.a = r1
                return r0
        }

        public xyz.adscope.common.network.simple.SimpleResponse.Builder<Succeed, Failed> failed(Failed r1) {
                r0 = this;
                r0.d = r1
                return r0
        }

        public xyz.adscope.common.network.simple.SimpleResponse.Builder<Succeed, Failed> fromCache(boolean r1) {
                r0 = this;
                r0.c = r1
                return r0
        }

        public xyz.adscope.common.network.simple.SimpleResponse.Builder<Succeed, Failed> headers(xyz.adscope.common.network.Headers r1) {
                r0 = this;
                r0.b = r1
                return r0
        }

        public xyz.adscope.common.network.simple.SimpleResponse.Builder<Succeed, Failed> succeed(Succeed r1) {
                r0 = this;
                r0.e = r1
                return r0
        }
    }

    private SimpleResponse(xyz.adscope.common.network.simple.SimpleResponse.Builder<Succeed, Failed> r2) {
            r1 = this;
            r1.<init>()
            int r0 = xyz.adscope.common.network.simple.SimpleResponse.Builder.a(r2)
            r1.a = r0
            xyz.adscope.common.network.Headers r0 = xyz.adscope.common.network.simple.SimpleResponse.Builder.b(r2)
            r1.b = r0
            boolean r0 = xyz.adscope.common.network.simple.SimpleResponse.Builder.c(r2)
            r1.c = r0
            java.lang.Object r0 = xyz.adscope.common.network.simple.SimpleResponse.Builder.d(r2)
            r1.d = r0
            java.lang.Object r2 = xyz.adscope.common.network.simple.SimpleResponse.Builder.e(r2)
            r1.e = r2
            return
    }

    /* synthetic */ SimpleResponse(xyz.adscope.common.network.simple.SimpleResponse.Builder r1, xyz.adscope.common.network.simple.SimpleResponse.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static <Succeed, Failed> xyz.adscope.common.network.simple.SimpleResponse.Builder<Succeed, Failed> newBuilder() {
            xyz.adscope.common.network.simple.SimpleResponse$Builder r0 = new xyz.adscope.common.network.simple.SimpleResponse$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public int code() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public Failed failed() {
            r1 = this;
            Failed r0 = r1.e
            return r0
    }

    public boolean fromCache() {
            r1 = this;
            boolean r0 = r1.c
            return r0
    }

    public xyz.adscope.common.network.Headers headers() {
            r1 = this;
            xyz.adscope.common.network.Headers r0 = r1.b
            return r0
    }

    public boolean isSucceed() {
            r1 = this;
            Failed r0 = r1.e
            if (r0 == 0) goto Lb
            Succeed r0 = r1.d
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public Succeed succeed() {
            r1 = this;
            Succeed r0 = r1.d
            return r0
    }
}
