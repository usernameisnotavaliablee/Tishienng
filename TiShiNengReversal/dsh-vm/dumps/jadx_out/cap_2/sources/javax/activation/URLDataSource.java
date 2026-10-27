package javax.activation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class URLDataSource implements javax.activation.DataSource {
    private java.net.URL url;
    private java.net.URLConnection url_conn;

    public URLDataSource(java.net.URL r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.url_conn = r0
            r1.url = r2
            return
    }

    @Override // javax.activation.DataSource
    public java.lang.String getContentType() {
            r1 = this;
            java.net.URLConnection r0 = r1.url_conn     // Catch: java.io.IOException -> Ld
            if (r0 != 0) goto Le
            java.net.URL r0 = r1.url     // Catch: java.io.IOException -> Ld
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.io.IOException -> Ld
            r1.url_conn = r0     // Catch: java.io.IOException -> Ld
            goto Le
        Ld:
        Le:
            java.net.URLConnection r0 = r1.url_conn
            if (r0 == 0) goto L17
            java.lang.String r0 = r0.getContentType()
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 != 0) goto L1c
            java.lang.String r0 = "application/octet-stream"
        L1c:
            return r0
    }

    @Override // javax.activation.DataSource
    public java.io.InputStream getInputStream() throws java.io.IOException {
            r1 = this;
            java.net.URL r0 = r1.url
            java.io.InputStream r0 = r0.openStream()
            return r0
    }

    @Override // javax.activation.DataSource
    public java.lang.String getName() {
            r1 = this;
            java.net.URL r0 = r1.url
            java.lang.String r0 = r0.getFile()
            return r0
    }

    @Override // javax.activation.DataSource
    public java.io.OutputStream getOutputStream() throws java.io.IOException {
            r2 = this;
            java.net.URL r0 = r2.url
            java.net.URLConnection r0 = r0.openConnection()
            r2.url_conn = r0
            if (r0 == 0) goto L15
            r1 = 1
            r0.setDoOutput(r1)
            java.net.URLConnection r0 = r2.url_conn
            java.io.OutputStream r0 = r0.getOutputStream()
            return r0
        L15:
            r0 = 0
            return r0
    }

    public java.net.URL getURL() {
            r1 = this;
            java.net.URL r0 = r1.url
            return r0
    }
}
