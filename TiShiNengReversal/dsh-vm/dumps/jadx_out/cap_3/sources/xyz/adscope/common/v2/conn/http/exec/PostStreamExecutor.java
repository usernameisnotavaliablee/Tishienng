package xyz.adscope.common.v2.conn.http.exec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class PostStreamExecutor extends xyz.adscope.common.v2.conn.http.exec.IBaseHttpExecutor {
    PostStreamExecutor(xyz.adscope.common.v2.conn.http.IRequest r1, xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private void postStream(java.net.HttpURLConnection r5) {
            r4 = this;
            if (r5 == 0) goto L7b
            r0 = 1
            r1 = 0
            r5.setDoOutput(r0)     // Catch: java.lang.Throwable -> L76
            java.io.DataOutputStream r0 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L76
            java.io.OutputStream r2 = r5.getOutputStream()     // Catch: java.lang.Throwable -> L76
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L76
            xyz.adscope.common.v2.conn.http.IRequest r1 = r4.mRequest     // Catch: java.lang.Throwable -> L43
            byte[] r1 = r1.getRequestBodyBytes()     // Catch: java.lang.Throwable -> L43
            r0.write(r1)     // Catch: java.lang.Throwable -> L43
            r0.flush()     // Catch: java.lang.Throwable -> L43
            r0.close()     // Catch: java.lang.Throwable -> L43
            int r1 = r5.getResponseCode()     // Catch: java.lang.Throwable -> L43
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != r2) goto L58
            java.lang.String r2 = r5.getContentEncoding()     // Catch: java.lang.Throwable -> L43
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L43
            if (r3 != 0) goto L45
            java.lang.String r3 = "gzip"
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto L45
            java.util.zip.GZIPInputStream r2 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L43
            java.io.InputStream r5 = r5.getInputStream()     // Catch: java.lang.Throwable -> L43
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L43
            goto L49
        L43:
            r5 = move-exception
            goto L74
        L45:
            java.io.InputStream r2 = r5.getInputStream()     // Catch: java.lang.Throwable -> L43
        L49:
            java.lang.String r5 = "UTF-8"
            java.lang.String r5 = xyz.adscope.common.v2.tool.io.IOUtils.read(r2, r5)     // Catch: java.lang.Throwable -> L43
            xyz.adscope.common.v2.conn.http.HttpResponse r2 = new xyz.adscope.common.v2.conn.http.HttpResponse     // Catch: java.lang.Throwable -> L43
            r2.<init>(r1, r5)     // Catch: java.lang.Throwable -> L43
            r4.callbackResult(r2)     // Catch: java.lang.Throwable -> L43
            goto L70
        L58:
            r2 = 302(0x12e, float:4.23E-43)
            if (r1 != r2) goto L66
            java.lang.String r2 = "Location"
            java.lang.String r5 = r5.getHeaderField(r2)     // Catch: java.lang.Throwable -> L43
            r4.redirected(r5, r1)     // Catch: java.lang.Throwable -> L43
            goto L70
        L66:
            xyz.adscope.common.v2.conn.http.NetworkError r5 = new xyz.adscope.common.v2.conn.http.NetworkError     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = "request failed..."
            r5.<init>(r1, r2)     // Catch: java.lang.Throwable -> L43
            r4.callbackFailedResult(r5)     // Catch: java.lang.Throwable -> L43
        L70:
            xyz.adscope.common.v2.tool.io.IOUtils.closeQuietly(r0)
            return
        L74:
            r1 = r0
            goto L77
        L76:
            r5 = move-exception
        L77:
            xyz.adscope.common.v2.tool.io.IOUtils.closeQuietly(r1)
            throw r5
        L7b:
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
            r4.postStream(r1)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
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
