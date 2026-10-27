package xyz.adscope.common.v2.conn.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class CommonRequestBuilder {
    private boolean isAutoRedirected;
    private final xyz.adscope.common.v2.conn.http.CommonHeader mHeader;
    private byte[] mReqBody;
    private xyz.adscope.common.v2.conn.http.RequestMethod mReqMethod;
    private java.lang.String mReqUrl;
    private xyz.adscope.common.v2.conn.IBaseHttpResponseCallback mResponseCallback;
    private java.io.File mSaveFile;

    public CommonRequestBuilder() {
            r1 = this;
            r1.<init>()
            xyz.adscope.common.v2.conn.http.CommonHeader r0 = xyz.adscope.common.v2.conn.http.CommonHeader.obtainBasicHeader()
            r1.mHeader = r0
            r0 = 1
            r1.isAutoRedirected = r0
            return
    }

    private void callbackFailedResult(xyz.adscope.common.v2.conn.IHttpRequestError r2) {
            r1 = this;
            xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r0 = r1.mResponseCallback
            if (r0 == 0) goto L7
            r0.failCallback(r2)
        L7:
            return
    }

    public xyz.adscope.common.v2.conn.http.CommonRequestBuilder appendHeader(java.util.Map<java.lang.String, java.lang.String> r2) {
            r1 = this;
            xyz.adscope.common.v2.conn.http.CommonHeader r0 = r1.mHeader
            r0.putAll(r2)
            return r1
    }

    public void appendHeader(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            xyz.adscope.common.v2.conn.http.CommonHeader r0 = r1.mHeader
            r0.put(r2, r3)
            return
    }

    public xyz.adscope.common.v2.conn.http.CommonRequestBuilder autoRedirected(boolean r1) {
            r0 = this;
            r0.isAutoRedirected = r1
            return r0
    }

    public xyz.adscope.common.v2.conn.http.CommonRequestBuilder body(byte[] r1) {
            r0 = this;
            r0.mReqBody = r1
            return r0
    }

    public void cacheImage(java.lang.String r2) {
            r1 = this;
            xyz.adscope.common.v2.conn.http.RequestMethod r0 = xyz.adscope.common.v2.conn.http.RequestMethod.CACHE_IMAGE
            r1.mReqMethod = r0
            r1.mReqUrl = r2
            return
    }

    public xyz.adscope.common.v2.conn.http.CommonRequestBuilder concern(xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r1) {
            r0 = this;
            r0.mResponseCallback = r1
            return r0
    }

    public void download(java.lang.String r2, java.io.File r3) {
            r1 = this;
            xyz.adscope.common.v2.conn.http.RequestMethod r0 = xyz.adscope.common.v2.conn.http.RequestMethod.DOWNLOAD
            r1.mReqMethod = r0
            r1.mReqUrl = r2
            r1.mSaveFile = r3
            return
    }

    public void get(java.lang.String r2) {
            r1 = this;
            xyz.adscope.common.v2.conn.http.RequestMethod r0 = xyz.adscope.common.v2.conn.http.RequestMethod.GET
            r1.mReqMethod = r0
            r1.mReqUrl = r2
            return
    }

    public void perform(android.content.Context r7) {
            r6 = this;
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r0 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
            java.lang.Object r7 = r0.getOrCreateImplement(r7)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r7 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r7
            xyz.adscope.common.v2.conn.http.HttpRequest r0 = new xyz.adscope.common.v2.conn.http.HttpRequest
            java.lang.String r1 = r6.mReqUrl
            xyz.adscope.common.v2.conn.http.RequestMethod r2 = r6.mReqMethod
            byte[] r3 = r6.mReqBody
            xyz.adscope.common.v2.conn.http.CommonHeader r4 = r6.mHeader
            boolean r5 = r6.isAutoRedirected
            r0.<init>(r1, r2, r3, r4, r5)
            xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r1 = r6.mResponseCallback
            xyz.adscope.common.v2.conn.http.exec.IBaseHttpExecutor r0 = xyz.adscope.common.v2.conn.http.exec.HttpExecutorCreator.createHttpExecutor(r0, r1)
            if (r0 == 0) goto L31
            boolean r1 = r0 instanceof xyz.adscope.common.v2.conn.http.exec.LocalIOExecutor
            if (r1 == 0) goto L2d
            r1 = r0
            xyz.adscope.common.v2.conn.http.exec.LocalIOExecutor r1 = (xyz.adscope.common.v2.conn.http.exec.LocalIOExecutor) r1
            java.io.File r2 = r6.mSaveFile
            r1.setIOFile(r2)
        L2d:
            r7.executeRequestAsyncTask(r0)
            return
        L31:
            xyz.adscope.common.v2.conn.http.NetworkError$DEFAULT r7 = xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT.ERROR_METHOD
            r6.callbackFailedResult(r7)
            return
    }

    public xyz.adscope.common.v2.conn.http.exec.IBaseHttpExecutor performLocalIO() {
            r6 = this;
            xyz.adscope.common.v2.conn.http.HttpRequest r0 = new xyz.adscope.common.v2.conn.http.HttpRequest
            java.lang.String r1 = r6.mReqUrl
            xyz.adscope.common.v2.conn.http.RequestMethod r2 = r6.mReqMethod
            byte[] r3 = r6.mReqBody
            xyz.adscope.common.v2.conn.http.CommonHeader r4 = r6.mHeader
            boolean r5 = r6.isAutoRedirected
            r0.<init>(r1, r2, r3, r4, r5)
            xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r1 = r6.mResponseCallback
            xyz.adscope.common.v2.conn.http.exec.IBaseHttpExecutor r0 = xyz.adscope.common.v2.conn.http.exec.HttpExecutorCreator.createHttpExecutor(r0, r1)
            boolean r1 = r0 instanceof xyz.adscope.common.v2.conn.http.exec.LocalIOExecutor
            if (r1 == 0) goto L21
            r1 = r0
            xyz.adscope.common.v2.conn.http.exec.LocalIOExecutor r1 = (xyz.adscope.common.v2.conn.http.exec.LocalIOExecutor) r1
            java.io.File r2 = r6.mSaveFile
            r1.setIOFile(r2)
        L21:
            return r0
    }

    public void post(java.lang.String r2) {
            r1 = this;
            xyz.adscope.common.v2.conn.http.RequestMethod r0 = xyz.adscope.common.v2.conn.http.RequestMethod.POST
            r1.mReqMethod = r0
            r1.mReqUrl = r2
            return
    }

    public void postStream(java.lang.String r2) {
            r1 = this;
            xyz.adscope.common.v2.conn.http.RequestMethod r0 = xyz.adscope.common.v2.conn.http.RequestMethod.STREAM
            r1.mReqMethod = r0
            r1.mReqUrl = r2
            return
    }
}
