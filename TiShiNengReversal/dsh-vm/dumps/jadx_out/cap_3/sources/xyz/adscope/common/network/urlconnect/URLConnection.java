package xyz.adscope.common.network.urlconnect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class URLConnection implements xyz.adscope.common.network.connect.Connection {
    private java.net.HttpURLConnection a;
    private java.lang.String b;

    public URLConnection(java.net.HttpURLConnection r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Location"
            r1.b = r0
            r1.a = r2
            return
    }

    private static java.io.InputStream a(java.lang.String r1, java.io.InputStream r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L14
            java.lang.String r0 = "gzip"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L14
            java.util.zip.GZIPInputStream r1 = new java.util.zip.GZIPInputStream
            r1.<init>(r2)
            return r1
        L14:
            return r2
    }

    private static boolean a(int r1) {
            r0 = 100
            if (r1 <= r0) goto L16
            r0 = 204(0xcc, float:2.86E-43)
            if (r1 == r0) goto L16
            r0 = 205(0xcd, float:2.87E-43)
            if (r1 == r0) goto L16
            r0 = 300(0x12c, float:4.2E-43)
            if (r1 < r0) goto L14
            r0 = 400(0x190, float:5.6E-43)
            if (r1 < r0) goto L16
        L14:
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    private static boolean a(java.lang.String r1, int r2) {
            java.lang.String r0 = "HEAD"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L10
            boolean r1 = a(r2)
            if (r1 == 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            java.net.HttpURLConnection r0 = r1.a
            if (r0 == 0) goto L7
            r0.disconnect()
        L7:
            return
    }

    @Override // xyz.adscope.common.network.connect.Connection
    public void disconnect() {
            r1 = this;
            java.net.HttpURLConnection r0 = r1.a
            if (r0 == 0) goto L7
            r0.disconnect()
        L7:
            return
    }

    @Override // xyz.adscope.common.network.connect.Connection
    public int getCode() {
            r1 = this;
            java.net.HttpURLConnection r0 = r1.a
            int r0 = r0.getResponseCode()
            return r0
    }

    @Override // xyz.adscope.common.network.connect.Connection
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaders() {
            r1 = this;
            java.net.HttpURLConnection r0 = r1.a
            java.util.Map r0 = r0.getHeaderFields()
            return r0
    }

    @Override // xyz.adscope.common.network.connect.Connection
    public java.io.InputStream getInputStream() {
            r3 = this;
            java.net.HttpURLConnection r0 = r3.a
            int r0 = r0.getResponseCode()
            java.net.HttpURLConnection r1 = r3.a
            java.lang.String r1 = r1.getRequestMethod()
            boolean r1 = a(r1, r0)
            if (r1 != 0) goto L18
            xyz.adscope.common.network.connect.stream.NullStream r0 = new xyz.adscope.common.network.connect.stream.NullStream
            r0.<init>(r3)
            return r0
        L18:
            r1 = 400(0x190, float:5.6E-43)
            if (r0 < r1) goto L32
            java.net.HttpURLConnection r0 = r3.a
            java.lang.String r0 = r0.getContentEncoding()
            xyz.adscope.common.network.connect.stream.SourceStream r1 = new xyz.adscope.common.network.connect.stream.SourceStream
            java.net.HttpURLConnection r2 = r3.a
            java.io.InputStream r2 = r2.getErrorStream()
            r1.<init>(r3, r2)
            java.io.InputStream r0 = a(r0, r1)
            return r0
        L32:
            java.net.HttpURLConnection r0 = r3.a
            java.lang.String r0 = r0.getContentEncoding()
            xyz.adscope.common.network.connect.stream.SourceStream r1 = new xyz.adscope.common.network.connect.stream.SourceStream
            java.net.HttpURLConnection r2 = r3.a
            java.io.InputStream r2 = r2.getInputStream()
            r1.<init>(r3, r2)
            java.io.InputStream r0 = a(r0, r1)
            return r0
    }

    @Override // xyz.adscope.common.network.connect.Connection
    public java.lang.String getLocationUrl() {
            r2 = this;
            java.net.HttpURLConnection r0 = r2.a
            java.lang.String r1 = r2.b
            java.lang.String r0 = r0.getHeaderField(r1)
            return r0
    }

    @Override // xyz.adscope.common.network.connect.Connection
    public java.io.OutputStream getOutputStream() {
            r1 = this;
            java.net.HttpURLConnection r0 = r1.a
            java.io.OutputStream r0 = r0.getOutputStream()
            return r0
    }
}
