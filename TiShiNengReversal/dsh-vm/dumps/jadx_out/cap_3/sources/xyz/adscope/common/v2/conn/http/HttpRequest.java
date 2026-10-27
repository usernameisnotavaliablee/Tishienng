package xyz.adscope.common.v2.conn.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class HttpRequest implements xyz.adscope.common.v2.conn.http.IRequest {
    private final boolean isAutoRedirected;
    private final xyz.adscope.common.v2.conn.http.CommonHeader mHeader;
    private final xyz.adscope.common.v2.conn.http.RequestMethod mMethod;
    private final byte[] mRequestBody;
    private final java.lang.String mRequestUrl;

    public HttpRequest(java.lang.String r1, xyz.adscope.common.v2.conn.http.IRequest r2) {
            r0 = this;
            r0.<init>()
            r0.mRequestUrl = r1
            xyz.adscope.common.v2.conn.http.CommonHeader r1 = r2.getHeader()
            r0.mHeader = r1
            xyz.adscope.common.v2.conn.http.RequestMethod r1 = r2.getRequestMethod()
            r0.mMethod = r1
            r1 = 0
            byte[] r1 = new byte[r1]
            r0.mRequestBody = r1
            boolean r1 = r2.isAutoRedirected()
            r0.isAutoRedirected = r1
            return
    }

    HttpRequest(java.lang.String r1, xyz.adscope.common.v2.conn.http.RequestMethod r2, byte[] r3, xyz.adscope.common.v2.conn.http.CommonHeader r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.mRequestUrl = r1
            r0.mMethod = r2
            r0.mRequestBody = r3
            r0.mHeader = r4
            r0.isAutoRedirected = r5
            return
    }

    @Override // xyz.adscope.common.v2.conn.http.IRequest
    public xyz.adscope.common.v2.conn.http.CommonHeader getHeader() {
            r1 = this;
            xyz.adscope.common.v2.conn.http.CommonHeader r0 = r1.mHeader
            return r0
    }

    @Override // xyz.adscope.common.v2.conn.http.IRequest
    public byte[] getRequestBodyBytes() {
            r1 = this;
            byte[] r0 = r1.mRequestBody
            return r0
    }

    @Override // xyz.adscope.common.v2.conn.http.IRequest
    public xyz.adscope.common.v2.conn.http.RequestMethod getRequestMethod() {
            r1 = this;
            xyz.adscope.common.v2.conn.http.RequestMethod r0 = r1.mMethod
            return r0
    }

    @Override // xyz.adscope.common.v2.conn.http.IRequest
    public java.lang.String getRequestURL() {
            r1 = this;
            java.lang.String r0 = r1.mRequestUrl
            return r0
    }

    @Override // xyz.adscope.common.v2.conn.http.IRequest
    public boolean isAutoRedirected() {
            r1 = this;
            boolean r0 = r1.isAutoRedirected
            return r0
    }
}
