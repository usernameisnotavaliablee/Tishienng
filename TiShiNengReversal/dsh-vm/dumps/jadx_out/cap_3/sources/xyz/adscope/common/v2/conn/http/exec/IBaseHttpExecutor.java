package xyz.adscope.common.v2.conn.http.exec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class IBaseHttpExecutor implements java.lang.Runnable {
    protected static final java.lang.String REQ_ENCODING_GZIP = "gzip";
    protected boolean isAutoRedirected;
    protected xyz.adscope.common.v2.conn.http.IRequest mRequest;
    protected xyz.adscope.common.v2.conn.IBaseHttpResponseCallback mResponseCallback;
    private final java.util.Set<java.lang.String> urlRecord;

    IBaseHttpExecutor(xyz.adscope.common.v2.conn.http.IRequest r1, xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r2) {
            r0 = this;
            r0.<init>()
            r0.mRequest = r1
            boolean r1 = r1.isAutoRedirected()
            r0.isAutoRedirected = r1
            r0.mResponseCallback = r2
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.urlRecord = r1
            return
    }

    protected void callbackFailedResult(xyz.adscope.common.v2.conn.IHttpRequestError r2) {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.urlRecord
            r0.clear()
            xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r0 = r1.mResponseCallback
            if (r0 == 0) goto Lc
            r0.failCallback(r2)
        Lc:
            return
    }

    public void callbackInputStream(java.io.InputStream r3) {
            r2 = this;
            xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r0 = r2.mResponseCallback
            boolean r1 = r0 instanceof xyz.adscope.common.v2.conn.IBaseHttpInputStreamCallback
            if (r1 == 0) goto Lb
            xyz.adscope.common.v2.conn.IBaseHttpInputStreamCallback r0 = (xyz.adscope.common.v2.conn.IBaseHttpInputStreamCallback) r0
            r0.onInputStream(r3)
        Lb:
            return
    }

    protected void callbackResult(xyz.adscope.common.v2.conn.IBaseHttpResponse r2) {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.urlRecord
            r0.clear()
            xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r0 = r1.mResponseCallback
            if (r0 == 0) goto Lc
            r0.successCallback(r2)
        Lc:
            return
    }

    protected void recordConnectUrl(java.lang.String r2) {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.urlRecord
            r0.add(r2)
            return
    }

    protected void redirected(java.lang.String r2, int r3) {
            r1 = this;
            boolean r0 = r1.isAutoRedirected
            if (r0 == 0) goto L1f
            java.util.Set<java.lang.String> r3 = r1.urlRecord
            boolean r3 = r3.contains(r2)
            if (r3 == 0) goto L12
            xyz.adscope.common.v2.conn.http.NetworkError$DEFAULT r2 = xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT.ERROR_REDIRECT_LOOP
            r1.callbackFailedResult(r2)
            return
        L12:
            xyz.adscope.common.v2.conn.http.HttpRequest r3 = new xyz.adscope.common.v2.conn.http.HttpRequest
            xyz.adscope.common.v2.conn.http.IRequest r0 = r1.mRequest
            r3.<init>(r2, r0)
            r1.mRequest = r3
            r1.run()
            return
        L1f:
            xyz.adscope.common.v2.conn.http.HttpRedirected r0 = new xyz.adscope.common.v2.conn.http.HttpRedirected
            r0.<init>(r3, r2)
            r1.callbackResult(r0)
            return
    }
}
