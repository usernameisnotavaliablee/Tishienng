package xyz.adscope.common.v2.conn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class IBaseSimpleRequest implements xyz.adscope.common.v2.conn.IBaseHttpRequest {
    private final boolean mAutoRedirect;
    protected final android.content.Context mContext;

    public IBaseSimpleRequest(android.content.Context r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            r0.mAutoRedirect = r2
            return
    }

    protected xyz.adscope.common.v2.conn.http.CommonRequestBuilder createNewRequest(xyz.adscope.common.v2.conn.http.RequestMethod r3, java.lang.String r4, xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r5) {
            r2 = this;
            xyz.adscope.common.v2.conn.http.CommonRequestBuilder r0 = new xyz.adscope.common.v2.conn.http.CommonRequestBuilder
            r0.<init>()
            boolean r1 = r2.mAutoRedirect
            xyz.adscope.common.v2.conn.http.CommonRequestBuilder r0 = r0.autoRedirected(r1)
            xyz.adscope.common.v2.conn.http.CommonRequestBuilder r5 = r0.concern(r5)
            xyz.adscope.common.v2.conn.http.RequestMethod r0 = xyz.adscope.common.v2.conn.http.RequestMethod.POST
            if (r0 != r3) goto L16
            r5.post(r4)
        L16:
            xyz.adscope.common.v2.conn.http.RequestMethod r0 = xyz.adscope.common.v2.conn.http.RequestMethod.GET
            if (r0 != r3) goto L1d
            r5.get(r4)
        L1d:
            xyz.adscope.common.v2.conn.http.RequestMethod r0 = xyz.adscope.common.v2.conn.http.RequestMethod.STREAM
            if (r0 != r3) goto L2b
            r5.postStream(r4)
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/octet-stream"
            r5.appendHeader(r3, r4)
        L2b:
            return r5
    }

    @Override // xyz.adscope.common.v2.conn.IBaseHttpRequest
    public void requestWithGetMethod(java.lang.String r2, xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r3) {
            r1 = this;
            xyz.adscope.common.v2.conn.http.RequestMethod r0 = xyz.adscope.common.v2.conn.http.RequestMethod.GET
            xyz.adscope.common.v2.conn.http.CommonRequestBuilder r2 = r1.createNewRequest(r0, r2, r3)
            if (r2 == 0) goto Ld
            android.content.Context r3 = r1.mContext
            r2.perform(r3)
        Ld:
            return
    }

    @Override // xyz.adscope.common.v2.conn.IBaseHttpRequest
    public void requestWithPostMethod(java.lang.String r2, java.lang.String r3, xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r4) {
            r1 = this;
            xyz.adscope.common.v2.conn.http.RequestMethod r0 = xyz.adscope.common.v2.conn.http.RequestMethod.POST
            xyz.adscope.common.v2.conn.http.CommonRequestBuilder r2 = r1.createNewRequest(r0, r2, r4)
            if (r2 == 0) goto L15
            byte[] r3 = r3.getBytes()
            xyz.adscope.common.v2.conn.http.CommonRequestBuilder r2 = r2.body(r3)
            android.content.Context r3 = r1.mContext
            r2.perform(r3)
        L15:
            return
    }

    @Override // xyz.adscope.common.v2.conn.IBaseHttpRequest
    public void requestWithStreamMethod(java.lang.String r2, byte[] r3, xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r4) {
            r1 = this;
            xyz.adscope.common.v2.conn.http.RequestMethod r0 = xyz.adscope.common.v2.conn.http.RequestMethod.STREAM
            xyz.adscope.common.v2.conn.http.CommonRequestBuilder r2 = r1.createNewRequest(r0, r2, r4)
            if (r2 == 0) goto L11
            xyz.adscope.common.v2.conn.http.CommonRequestBuilder r2 = r2.body(r3)
            android.content.Context r3 = r1.mContext
            r2.perform(r3)
        L11:
            return
    }
}
