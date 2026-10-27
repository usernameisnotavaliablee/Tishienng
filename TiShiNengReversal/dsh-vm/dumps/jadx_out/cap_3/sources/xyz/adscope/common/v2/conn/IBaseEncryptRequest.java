package xyz.adscope.common.v2.conn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class IBaseEncryptRequest extends xyz.adscope.common.v2.conn.IBaseSimpleRequest {
    private java.lang.String mEncryptPatten;

    public IBaseEncryptRequest(android.content.Context r1, boolean r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.String r1 = "101,1001"
            r0.mEncryptPatten = r1
            return
    }

    @Override // xyz.adscope.common.v2.conn.IBaseSimpleRequest
    protected xyz.adscope.common.v2.conn.http.CommonRequestBuilder createNewRequest(xyz.adscope.common.v2.conn.http.RequestMethod r2, java.lang.String r3, xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r4) {
            r1 = this;
            xyz.adscope.common.v2.conn.http.CommonRequestBuilder r0 = super.createNewRequest(r2, r3, r4)
            if (r0 == 0) goto Le
            java.lang.String r2 = r1.mEncryptPatten
            java.lang.String r3 = "Accept-Encrypt"
            r0.appendHeader(r3, r2)
            return r0
        Le:
            xyz.adscope.common.v2.conn.http.CommonRequestBuilder r2 = super.createNewRequest(r2, r3, r4)
            return r2
    }

    public void setEncryptPatten(java.lang.String r1) {
            r0 = this;
            r0.mEncryptPatten = r1
            return
    }
}
