package xyz.adscope.common.v2.conn.http.exec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ImageCacheExecutor extends xyz.adscope.common.v2.conn.http.exec.IBaseHttpExecutor {
    private static final int DEFAULT_LOCAL_IO_TIMEOUT = 5000;

    ImageCacheExecutor(xyz.adscope.common.v2.conn.http.IRequest r1, xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private void cacheRequest(java.net.HttpURLConnection r5) {
            r4 = this;
            if (r5 == 0) goto L5d
            r0 = 0
            int r1 = r5.getResponseCode()     // Catch: java.lang.Throwable -> L27
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != r2) goto L3d
            java.lang.String r2 = r5.getContentEncoding()     // Catch: java.lang.Throwable -> L27
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L27
            if (r3 != 0) goto L29
            java.lang.String r3 = "gzip"
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L29
            java.util.zip.GZIPInputStream r2 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L27
            java.io.InputStream r5 = r5.getInputStream()     // Catch: java.lang.Throwable -> L27
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L27
            goto L2d
        L27:
            r5 = move-exception
            goto L59
        L29:
            java.io.InputStream r2 = r5.getInputStream()     // Catch: java.lang.Throwable -> L27
        L2d:
            r4.callbackInputStream(r2)     // Catch: java.lang.Throwable -> L3a
            xyz.adscope.common.v2.conn.http.HttpResponse r5 = new xyz.adscope.common.v2.conn.http.HttpResponse     // Catch: java.lang.Throwable -> L3a
            r5.<init>(r1, r0)     // Catch: java.lang.Throwable -> L3a
            r4.callbackResult(r5)     // Catch: java.lang.Throwable -> L3a
            r0 = r2
            goto L55
        L3a:
            r5 = move-exception
            r0 = r2
            goto L59
        L3d:
            r2 = 302(0x12e, float:4.23E-43)
            if (r1 != r2) goto L4b
            java.lang.String r2 = "Location"
            java.lang.String r5 = r5.getHeaderField(r2)     // Catch: java.lang.Throwable -> L27
            r4.redirected(r5, r1)     // Catch: java.lang.Throwable -> L27
            goto L55
        L4b:
            xyz.adscope.common.v2.conn.http.NetworkError r5 = new xyz.adscope.common.v2.conn.http.NetworkError     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "request failed..."
            r5.<init>(r1, r2)     // Catch: java.lang.Throwable -> L27
            r4.callbackFailedResult(r5)     // Catch: java.lang.Throwable -> L27
        L55:
            xyz.adscope.common.v2.tool.io.IOUtils.closeQuietly(r0)
            return
        L59:
            xyz.adscope.common.v2.tool.io.IOUtils.closeQuietly(r0)
            throw r5
        L5d:
            xyz.adscope.common.v2.conn.http.NetworkError$DEFAULT r5 = xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT.ERROR_UNEXPECTED
            r4.callbackFailedResult(r5)
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r4 = this;
            xyz.adscope.common.v2.conn.http.IRequest r0 = r4.mRequest
            if (r0 == 0) goto L43
            r0 = 0
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            xyz.adscope.common.v2.conn.http.IRequest r1 = r4.mRequest     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            java.net.HttpURLConnection r0 = xyz.adscope.common.v2.conn.http.pool.ConnectionFactory.createNewConnection(r1)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            xyz.adscope.common.v2.conn.http.IRequest r1 = r4.mRequest     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            java.lang.String r1 = r1.getRequestURL()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            r4.recordConnectUrl(r1)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            r1 = 5000(0x1388, float:7.006E-42)
            r0.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            r0.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            r4.cacheRequest(r0)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            r0.disconnect()
            return
        L26:
            r1 = move-exception
            goto L3d
        L28:
            r1 = move-exception
            xyz.adscope.common.v2.conn.http.NetworkError r2 = new xyz.adscope.common.v2.conn.http.NetworkError     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L26
            r3 = -100
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L26
            r4.callbackFailedResult(r2)     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L3c
            r0.disconnect()
        L3c:
            return
        L3d:
            if (r0 == 0) goto L42
            r0.disconnect()
        L42:
            throw r1
        L43:
            xyz.adscope.common.v2.conn.http.NetworkError$DEFAULT r0 = xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT.ERROR_INVALID_URL
            r4.callbackFailedResult(r0)
            return
    }
}
