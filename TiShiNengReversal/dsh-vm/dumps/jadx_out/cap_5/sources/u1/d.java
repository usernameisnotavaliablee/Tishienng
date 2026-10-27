package u1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class d extends javax.net.ssl.SSLSocketFactory {
    public static final org.apache.http.conn.ssl.X509HostnameVerifier c = null;
    public static final org.apache.http.conn.ssl.X509HostnameVerifier d = null;
    private static volatile u1.d e;
    private javax.net.ssl.SSLContext a;
    private android.content.Context b;

    static {
            org.apache.http.conn.ssl.BrowserCompatHostnameVerifier r0 = new org.apache.http.conn.ssl.BrowserCompatHostnameVerifier
            r0.<init>()
            u1.d.c = r0
            org.apache.http.conn.ssl.StrictHostnameVerifier r0 = new org.apache.http.conn.ssl.StrictHostnameVerifier
            r0.<init>()
            u1.d.d = r0
            r0 = 0
            u1.d.e = r0
            return
    }

    private d(android.content.Context r5, java.security.SecureRandom r6) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException, java.security.KeyStoreException, java.security.KeyManagementException, java.lang.IllegalAccessException {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.a = r0
            r4.b = r5
            javax.net.ssl.SSLContext r5 = com.huawei.secure.android.common.ssl.f.i()
            r4.a = r5
            u1.e r5 = new u1.e
            android.content.Context r1 = r4.b
            r5.<init>(r1)
            javax.net.ssl.SSLContext r1 = r4.a
            r2 = 1
            javax.net.ssl.X509TrustManager[] r2 = new javax.net.ssl.X509TrustManager[r2]
            r3 = 0
            r2[r3] = r5
            r1.init(r0, r2, r6)
            return
    }

    @java.lang.Deprecated
    public d(java.io.InputStream r4, java.lang.String r5) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException, java.security.KeyStoreException, java.security.KeyManagementException {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a = r0
            javax.net.ssl.SSLContext r1 = com.huawei.secure.android.common.ssl.f.i()
            r3.a = r1
            u1.a r1 = new u1.a
            r1.<init>(r4, r5)
            javax.net.ssl.SSLContext r4 = r3.a
            r5 = 1
            javax.net.ssl.X509TrustManager[] r5 = new javax.net.ssl.X509TrustManager[r5]
            r2 = 0
            r5[r2] = r1
            r4.init(r0, r5, r0)
            return
    }

    @java.lang.Deprecated
    public d(java.io.InputStream r4, java.lang.String r5, java.security.SecureRandom r6) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException, java.security.KeyStoreException, java.security.KeyManagementException {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a = r0
            javax.net.ssl.SSLContext r1 = com.huawei.secure.android.common.ssl.f.i()
            r3.a = r1
            u1.a r1 = new u1.a
            r1.<init>(r4, r5)
            javax.net.ssl.SSLContext r4 = r3.a
            r5 = 1
            javax.net.ssl.X509TrustManager[] r5 = new javax.net.ssl.X509TrustManager[r5]
            r2 = 0
            r5[r2] = r1
            r4.init(r0, r5, r6)
            return
    }

    private void a(java.net.Socket r1) {
            r0 = this;
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1
            com.huawei.secure.android.common.ssl.f.g(r1)
            com.huawei.secure.android.common.ssl.f.f(r1)
            return
    }

    @java.lang.Deprecated
    public static u1.d b(android.content.Context r3) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException, java.security.KeyStoreException, java.lang.IllegalAccessException, java.security.KeyManagementException {
            u1.d r0 = u1.d.e
            if (r0 != 0) goto L1a
            java.lang.Class<u1.d> r0 = u1.d.class
            monitor-enter(r0)
            u1.d r1 = u1.d.e     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L16
            u1.d r1 = new u1.d     // Catch: java.lang.Throwable -> L14
            r2 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L14
            u1.d.e = r1     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r3 = move-exception
            goto L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L1a
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r3
        L1a:
            u1.d r3 = u1.d.e
            return r3
    }

    @java.lang.Deprecated
    public static u1.d c(android.content.Context r2, java.security.SecureRandom r3) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException, java.security.KeyStoreException, java.lang.IllegalAccessException, java.security.KeyManagementException {
            u1.d r0 = u1.d.e
            if (r0 != 0) goto L19
            java.lang.Class<u1.d> r0 = u1.d.class
            monitor-enter(r0)
            u1.d r1 = u1.d.e     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            u1.d r1 = new u1.d     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L13
            u1.d.e = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            u1.d r2 = u1.d.e
            return r2
    }

    @Override // javax.net.SocketFactory
    public java.net.Socket createSocket(java.lang.String r2, int r3) throws java.io.IOException, java.net.UnknownHostException {
            r1 = this;
            javax.net.ssl.SSLContext r0 = r1.a
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()
            java.net.Socket r2 = r0.createSocket(r2, r3)
            boolean r3 = r2 instanceof javax.net.ssl.SSLSocket
            if (r3 == 0) goto L11
            r1.a(r2)
        L11:
            return r2
    }

    @Override // javax.net.SocketFactory
    public java.net.Socket createSocket(java.lang.String r1, int r2, java.net.InetAddress r3, int r4) throws java.io.IOException, java.net.UnknownHostException {
            r0 = this;
            java.net.Socket r1 = r0.createSocket(r1, r2)
            return r1
    }

    @Override // javax.net.SocketFactory
    public java.net.Socket createSocket(java.net.InetAddress r1, int r2) throws java.io.IOException {
            r0 = this;
            java.lang.String r1 = r1.getHostAddress()
            java.net.Socket r1 = r0.createSocket(r1, r2)
            return r1
    }

    @Override // javax.net.SocketFactory
    public java.net.Socket createSocket(java.net.InetAddress r1, int r2, java.net.InetAddress r3, int r4) throws java.io.IOException {
            r0 = this;
            java.lang.String r1 = r1.getHostAddress()
            java.net.Socket r1 = r0.createSocket(r1, r2)
            return r1
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public java.net.Socket createSocket(java.net.Socket r2, java.lang.String r3, int r4, boolean r5) throws java.io.IOException {
            r1 = this;
            javax.net.ssl.SSLContext r0 = r1.a
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()
            java.net.Socket r2 = r0.createSocket(r2, r3, r4, r5)
            boolean r3 = r2 instanceof javax.net.ssl.SSLSocket
            if (r3 == 0) goto L11
            r1.a(r2)
        L11:
            return r2
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public java.lang.String[] getDefaultCipherSuites() {
            r1 = this;
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            return r0
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public java.lang.String[] getSupportedCipherSuites() {
            r1 = this;
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            return r0
    }
}
