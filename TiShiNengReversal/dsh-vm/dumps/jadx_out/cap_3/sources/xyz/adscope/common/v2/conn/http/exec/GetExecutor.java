package xyz.adscope.common.v2.conn.http.exec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class GetExecutor extends xyz.adscope.common.v2.conn.http.exec.IBaseHttpExecutor {
    GetExecutor(xyz.adscope.common.v2.conn.http.IRequest r1, xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private void get(java.net.HttpURLConnection r5) {
            r4 = this;
            if (r5 == 0) goto L5e
            r0 = 0
            int r1 = r5.getResponseCode()     // Catch: java.lang.Throwable -> L28
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != r2) goto L3e
            java.lang.String r2 = r5.getContentEncoding()     // Catch: java.lang.Throwable -> L28
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L28
            if (r3 != 0) goto L2a
            java.lang.String r3 = "gzip"
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L2a
            java.util.zip.GZIPInputStream r2 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L28
            java.io.InputStream r5 = r5.getInputStream()     // Catch: java.lang.Throwable -> L28
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L28
            r0 = r2
            goto L2f
        L28:
            r5 = move-exception
            goto L5a
        L2a:
            java.io.InputStream r5 = r5.getInputStream()     // Catch: java.lang.Throwable -> L28
            r0 = r5
        L2f:
            java.lang.String r5 = "UTF-8"
            java.lang.String r5 = xyz.adscope.common.v2.tool.io.IOUtils.read(r0, r5)     // Catch: java.lang.Throwable -> L28
            xyz.adscope.common.v2.conn.http.HttpResponse r2 = new xyz.adscope.common.v2.conn.http.HttpResponse     // Catch: java.lang.Throwable -> L28
            r2.<init>(r1, r5)     // Catch: java.lang.Throwable -> L28
            r4.callbackResult(r2)     // Catch: java.lang.Throwable -> L28
            goto L56
        L3e:
            r2 = 302(0x12e, float:4.23E-43)
            if (r1 != r2) goto L4c
            java.lang.String r2 = "Location"
            java.lang.String r5 = r5.getHeaderField(r2)     // Catch: java.lang.Throwable -> L28
            r4.redirected(r5, r1)     // Catch: java.lang.Throwable -> L28
            goto L56
        L4c:
            xyz.adscope.common.v2.conn.http.NetworkError r5 = new xyz.adscope.common.v2.conn.http.NetworkError     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "request failed..."
            r5.<init>(r1, r2)     // Catch: java.lang.Throwable -> L28
            r4.callbackFailedResult(r5)     // Catch: java.lang.Throwable -> L28
        L56:
            xyz.adscope.common.v2.tool.io.IOUtils.closeQuietly(r0)
            return
        L5a:
            xyz.adscope.common.v2.tool.io.IOUtils.closeQuietly(r0)
            throw r5
        L5e:
            xyz.adscope.common.v2.conn.http.NetworkError$DEFAULT r5 = xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT.ERROR_UNEXPECTED
            r4.callbackFailedResult(r5)
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r4 = this;
            xyz.adscope.common.v2.conn.http.IRequest r0 = r4.mRequest
            if (r0 == 0) goto L35
            r1 = 0
            java.net.HttpURLConnection r1 = xyz.adscope.common.v2.conn.http.pool.ConnectionFactory.createNewConnection(r0)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
            xyz.adscope.common.v2.conn.http.IRequest r0 = r4.mRequest     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
            java.lang.String r0 = r0.getRequestURL()     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
            r4.recordConnectUrl(r0)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
            r4.get(r1)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
            if (r1 == 0) goto L2e
            goto L2b
        L18:
            r0 = move-exception
            goto L2f
        L1a:
            r0 = move-exception
            xyz.adscope.common.v2.conn.http.NetworkError r2 = new xyz.adscope.common.v2.conn.http.NetworkError     // Catch: java.lang.Throwable -> L18
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L18
            r3 = -100
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L18
            r4.callbackFailedResult(r2)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L2e
        L2b:
            r1.disconnect()
        L2e:
            return
        L2f:
            if (r1 == 0) goto L34
            r1.disconnect()
        L34:
            throw r0
        L35:
            xyz.adscope.common.v2.conn.http.NetworkError$DEFAULT r0 = xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT.ERROR_INVALID_URL
            r4.callbackFailedResult(r0)
            return
    }
}
