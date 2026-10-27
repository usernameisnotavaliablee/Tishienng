package xyz.adscope.common.v2.conn.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class HttpResponse implements xyz.adscope.common.v2.conn.IBaseHttpResponse {
    private final int mCode;
    private final java.lang.String mResult;

    public HttpResponse(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.mCode = r1
            r0.mResult = r2
            return
    }

    @Override // xyz.adscope.common.v2.conn.IBaseHttpResponse
    public int getResponseCode() {
            r1 = this;
            int r0 = r1.mCode
            return r0
    }

    @Override // xyz.adscope.common.v2.conn.IBaseHttpResponse
    public java.lang.String getResponseResult() {
            r1 = this;
            java.lang.String r0 = r1.mResult
            return r0
    }
}
