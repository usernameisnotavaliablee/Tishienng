package xyz.adscope.common.v2.conn.http.exec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class HttpExecutorCreator {
    public HttpExecutorCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    public static xyz.adscope.common.v2.conn.http.exec.IBaseHttpExecutor createHttpExecutor(xyz.adscope.common.v2.conn.http.IRequest r2, xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r3) {
            if (r2 == 0) goto L38
            xyz.adscope.common.v2.conn.http.RequestMethod r0 = r2.getRequestMethod()
            xyz.adscope.common.v2.conn.http.RequestMethod r1 = xyz.adscope.common.v2.conn.http.RequestMethod.POST
            if (r1 != r0) goto L10
            xyz.adscope.common.v2.conn.http.exec.PostExecutor r0 = new xyz.adscope.common.v2.conn.http.exec.PostExecutor
            r0.<init>(r2, r3)
            return r0
        L10:
            xyz.adscope.common.v2.conn.http.RequestMethod r1 = xyz.adscope.common.v2.conn.http.RequestMethod.GET
            if (r1 != r0) goto L1a
            xyz.adscope.common.v2.conn.http.exec.GetExecutor r0 = new xyz.adscope.common.v2.conn.http.exec.GetExecutor
            r0.<init>(r2, r3)
            return r0
        L1a:
            xyz.adscope.common.v2.conn.http.RequestMethod r1 = xyz.adscope.common.v2.conn.http.RequestMethod.DOWNLOAD
            if (r1 != r0) goto L24
            xyz.adscope.common.v2.conn.http.exec.LocalIOExecutor r0 = new xyz.adscope.common.v2.conn.http.exec.LocalIOExecutor
            r0.<init>(r2, r3)
            return r0
        L24:
            xyz.adscope.common.v2.conn.http.RequestMethod r1 = xyz.adscope.common.v2.conn.http.RequestMethod.CACHE_IMAGE
            if (r1 != r0) goto L2e
            xyz.adscope.common.v2.conn.http.exec.ImageCacheExecutor r0 = new xyz.adscope.common.v2.conn.http.exec.ImageCacheExecutor
            r0.<init>(r2, r3)
            return r0
        L2e:
            xyz.adscope.common.v2.conn.http.RequestMethod r1 = xyz.adscope.common.v2.conn.http.RequestMethod.STREAM
            if (r1 != r0) goto L38
            xyz.adscope.common.v2.conn.http.exec.PostStreamExecutor r0 = new xyz.adscope.common.v2.conn.http.exec.PostStreamExecutor
            r0.<init>(r2, r3)
            return r0
        L38:
            r2 = 0
            return r2
    }
}
