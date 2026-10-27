package xyz.adscope.common.v2.conn.http.exec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class LocalIOExecutor extends xyz.adscope.common.v2.conn.http.exec.IBaseHttpExecutor {
    private static final int DEFAULT_LOCAL_IO_TIMEOUT = 5000;
    private java.io.File save;

    LocalIOExecutor(xyz.adscope.common.v2.conn.http.IRequest r1, xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private void cacheIOFile(java.io.InputStream r1, java.io.OutputStream r2) {
            r0 = this;
            if (r1 == 0) goto L7
            if (r2 == 0) goto L7
            xyz.adscope.common.v2.tool.io.IOUtils.write(r1, r2)
        L7:
            return
    }

    private void cacheRequest(java.net.HttpURLConnection r5) {
            r4 = this;
            if (r5 == 0) goto L9a
            r0 = 0
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2a
            int r1 = r5.getResponseCode()     // Catch: java.lang.Throwable -> L2a
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != r2) goto L73
            java.lang.String r2 = r5.getContentEncoding()     // Catch: java.lang.Throwable -> L2a
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L2a
            if (r3 != 0) goto L2e
            java.lang.String r3 = "gzip"
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2e
            java.util.zip.GZIPInputStream r2 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L2a
            java.io.InputStream r5 = r5.getInputStream()     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L2a
            goto L32
        L2a:
            r5 = move-exception
            r1 = r0
            goto L93
        L2e:
            java.io.InputStream r2 = r5.getInputStream()     // Catch: java.lang.Throwable -> L2a
        L32:
            java.io.File r5 = r4.save     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L6c
            boolean r5 = r5.exists()     // Catch: java.lang.Throwable -> L42
            if (r5 != 0) goto L46
            java.io.File r5 = r4.save     // Catch: java.lang.Throwable -> L42
            r5.createNewFile()     // Catch: java.lang.Throwable -> L42
            goto L46
        L42:
            r5 = move-exception
            r1 = r0
        L44:
            r0 = r2
            goto L93
        L46:
            java.io.File r5 = r4.save     // Catch: java.lang.Throwable -> L42
            boolean r5 = r5.canWrite()     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L71
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L42
            java.io.File r3 = r4.save     // Catch: java.lang.Throwable -> L42
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L42
            r4.cacheIOFile(r2, r5)     // Catch: java.lang.Throwable -> L68
            xyz.adscope.common.v2.conn.http.HttpResponse r0 = new xyz.adscope.common.v2.conn.http.HttpResponse     // Catch: java.lang.Throwable -> L68
            java.io.File r3 = r4.save     // Catch: java.lang.Throwable -> L68
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L68
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> L68
            r4.callbackResult(r0)     // Catch: java.lang.Throwable -> L68
        L66:
            r0 = r2
            goto L8c
        L68:
            r0 = move-exception
            r1 = r5
            r5 = r0
            goto L44
        L6c:
            xyz.adscope.common.v2.conn.http.NetworkError$DEFAULT r5 = xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT.ERROR_UNEXPECTED     // Catch: java.lang.Throwable -> L42
            r4.callbackFailedResult(r5)     // Catch: java.lang.Throwable -> L42
        L71:
            r5 = r0
            goto L66
        L73:
            r2 = 302(0x12e, float:4.23E-43)
            if (r1 != r2) goto L81
            java.lang.String r2 = "Location"
            java.lang.String r5 = r5.getHeaderField(r2)     // Catch: java.lang.Throwable -> L2a
            r4.redirected(r5, r1)     // Catch: java.lang.Throwable -> L2a
            goto L8b
        L81:
            xyz.adscope.common.v2.conn.http.NetworkError r5 = new xyz.adscope.common.v2.conn.http.NetworkError     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = "request failed..."
            r5.<init>(r1, r2)     // Catch: java.lang.Throwable -> L2a
            r4.callbackFailedResult(r5)     // Catch: java.lang.Throwable -> L2a
        L8b:
            r5 = r0
        L8c:
            xyz.adscope.common.v2.tool.io.IOUtils.closeQuietly(r5)
            xyz.adscope.common.v2.tool.io.IOUtils.closeQuietly(r0)
            return
        L93:
            xyz.adscope.common.v2.tool.io.IOUtils.closeQuietly(r1)
            xyz.adscope.common.v2.tool.io.IOUtils.closeQuietly(r0)
            throw r5
        L9a:
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

    public void setIOFile(java.io.File r1) {
            r0 = this;
            r0.save = r1
            return
    }
}
