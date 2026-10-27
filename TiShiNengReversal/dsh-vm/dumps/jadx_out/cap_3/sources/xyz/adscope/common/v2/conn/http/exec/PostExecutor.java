package xyz.adscope.common.v2.conn.http.exec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class PostExecutor extends xyz.adscope.common.v2.conn.http.exec.IBaseHttpExecutor {
    PostExecutor(xyz.adscope.common.v2.conn.http.IRequest r1, xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private void post(java.net.HttpURLConnection r7) {
            r6 = this;
            if (r7 == 0) goto L76
            r0 = 0
            java.io.OutputStream r1 = r7.getOutputStream()     // Catch: java.lang.Throwable -> L6d
            xyz.adscope.common.v2.conn.http.IRequest r2 = r6.mRequest     // Catch: java.lang.Throwable -> L35
            byte[] r2 = r2.getRequestBodyBytes()     // Catch: java.lang.Throwable -> L35
            r1.write(r2)     // Catch: java.lang.Throwable -> L35
            int r2 = r7.getResponseCode()     // Catch: java.lang.Throwable -> L35
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 != r3) goto L4e
            java.lang.String r3 = r7.getContentEncoding()     // Catch: java.lang.Throwable -> L35
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L35
            if (r4 != 0) goto L3a
            java.lang.String r4 = "gzip"
            boolean r3 = r3.contains(r4)     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L3a
            java.util.zip.GZIPInputStream r3 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L35
            java.io.InputStream r7 = r7.getInputStream()     // Catch: java.lang.Throwable -> L35
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L35
            r0 = r3
            goto L3f
        L35:
            r7 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L6f
        L3a:
            java.io.InputStream r7 = r7.getInputStream()     // Catch: java.lang.Throwable -> L35
            r0 = r7
        L3f:
            java.lang.String r7 = "UTF-8"
            java.lang.String r7 = xyz.adscope.common.v2.tool.io.IOUtils.read(r0, r7)     // Catch: java.lang.Throwable -> L35
            xyz.adscope.common.v2.conn.http.HttpResponse r3 = new xyz.adscope.common.v2.conn.http.HttpResponse     // Catch: java.lang.Throwable -> L35
            r3.<init>(r2, r7)     // Catch: java.lang.Throwable -> L35
            r6.callbackResult(r3)     // Catch: java.lang.Throwable -> L35
            goto L66
        L4e:
            r3 = 302(0x12e, float:4.23E-43)
            if (r2 != r3) goto L5c
            java.lang.String r3 = "Location"
            java.lang.String r7 = r7.getHeaderField(r3)     // Catch: java.lang.Throwable -> L35
            r6.redirected(r7, r2)     // Catch: java.lang.Throwable -> L35
            goto L66
        L5c:
            xyz.adscope.common.v2.conn.http.NetworkError r7 = new xyz.adscope.common.v2.conn.http.NetworkError     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = "request failed..."
            r7.<init>(r2, r3)     // Catch: java.lang.Throwable -> L35
            r6.callbackFailedResult(r7)     // Catch: java.lang.Throwable -> L35
        L66:
            xyz.adscope.common.v2.tool.io.IOUtils.closeQuietly(r0)
            xyz.adscope.common.v2.tool.io.IOUtils.closeQuietly(r1)
            return
        L6d:
            r7 = move-exception
            r1 = r0
        L6f:
            xyz.adscope.common.v2.tool.io.IOUtils.closeQuietly(r1)
            xyz.adscope.common.v2.tool.io.IOUtils.closeQuietly(r0)
            throw r7
        L76:
            xyz.adscope.common.v2.conn.http.NetworkError$DEFAULT r7 = xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT.ERROR_UNEXPECTED
            r6.callbackFailedResult(r7)
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
            r4.post(r1)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
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
