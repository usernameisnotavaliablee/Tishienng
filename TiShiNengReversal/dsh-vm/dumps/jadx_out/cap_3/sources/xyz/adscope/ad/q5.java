package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public enum q5 extends java.lang.Enum<xyz.adscope.ad.q5> implements xyz.adscope.common.v2.conn.IHttpRequestError {
    public static final xyz.adscope.ad.q5 c = null;
    public static final xyz.adscope.ad.q5 d = null;
    public static final xyz.adscope.ad.q5 e = null;
    private static final /* synthetic */ xyz.adscope.ad.q5[] f = null;
    private final int a;
    private final java.lang.String b;

    static {
            xyz.adscope.ad.q5 r0 = new xyz.adscope.ad.q5
            java.lang.String r1 = "url invalid"
            java.lang.String r2 = "ERROR_INVALID_URL"
            r3 = 0
            r4 = 1
            r0.<init>(r2, r3, r4, r1)
            xyz.adscope.ad.q5.c = r0
            xyz.adscope.ad.q5 r0 = new xyz.adscope.ad.q5
            java.lang.String r1 = "model builder is null"
            java.lang.String r2 = "ERROR_NULL_MODEL_BUILD"
            r3 = 2
            r0.<init>(r2, r4, r3, r1)
            xyz.adscope.ad.q5.d = r0
            xyz.adscope.ad.q5 r0 = new xyz.adscope.ad.q5
            r1 = 3
            java.lang.String r2 = "request content is null"
            java.lang.String r4 = "ERROR_EMPTY_CONTENT"
            r0.<init>(r4, r3, r1, r2)
            xyz.adscope.ad.q5.e = r0
            xyz.adscope.ad.q5[] r0 = a()
            xyz.adscope.ad.q5.f = r0
            return
    }

    q5(java.lang.String r1, int r2, int r3, java.lang.String r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.a = r3
            r0.b = r4
            return
    }

    private static /* synthetic */ xyz.adscope.ad.q5[] a() {
            r0 = 3
            xyz.adscope.ad.q5[] r0 = new xyz.adscope.ad.q5[r0]
            xyz.adscope.ad.q5 r1 = xyz.adscope.ad.q5.c
            r2 = 0
            r0[r2] = r1
            xyz.adscope.ad.q5 r1 = xyz.adscope.ad.q5.d
            r2 = 1
            r0[r2] = r1
            xyz.adscope.ad.q5 r1 = xyz.adscope.ad.q5.e
            r2 = 2
            r0[r2] = r1
            return r0
    }

    public static xyz.adscope.ad.q5 valueOf(java.lang.String r1) {
            java.lang.Class<xyz.adscope.ad.q5> r0 = xyz.adscope.ad.q5.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            xyz.adscope.ad.q5 r1 = (xyz.adscope.ad.q5) r1
            return r1
    }

    public static xyz.adscope.ad.q5[] values() {
            xyz.adscope.ad.q5[] r0 = xyz.adscope.ad.q5.f
            java.lang.Object r0 = r0.clone()
            xyz.adscope.ad.q5[] r0 = (xyz.adscope.ad.q5[]) r0
            return r0
    }

    @Override // xyz.adscope.common.v2.conn.IHttpRequestError
    public int getErrorCode() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    @Override // xyz.adscope.common.v2.conn.IHttpRequestError
    public java.lang.String getErrorMessage() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }
}
