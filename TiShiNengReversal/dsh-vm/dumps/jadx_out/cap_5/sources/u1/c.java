package u1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c extends org.apache.http.conn.ssl.SSLSocketFactory {
    public static final org.apache.http.conn.ssl.X509HostnameVerifier c = null;
    public static final org.apache.http.conn.ssl.X509HostnameVerifier d = null;
    private static volatile u1.c e;
    private javax.net.ssl.SSLContext a;
    private android.content.Context b;

    static {
            org.apache.http.conn.ssl.BrowserCompatHostnameVerifier r0 = new org.apache.http.conn.ssl.BrowserCompatHostnameVerifier
            r0.<init>()
            u1.c.c = r0
            org.apache.http.conn.ssl.StrictHostnameVerifier r0 = new org.apache.http.conn.ssl.StrictHostnameVerifier
            r0.<init>()
            u1.c.d = r0
            r0 = 0
            u1.c.e = r0
            return
    }

    private c(java.security.KeyStore r1) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private c(java.security.KeyStore r3, android.content.Context r4, java.security.SecureRandom r5) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException, java.security.cert.CertificateException, java.io.IOException, java.lang.IllegalAccessException {
            r2 = this;
            r2.<init>(r3)
            r2.b = r4
            javax.net.ssl.SSLContext r3 = com.huawei.secure.android.common.ssl.f.i()
            r2.a = r3
            u1.e r3 = new u1.e
            android.content.Context r4 = r2.b
            r3.<init>(r4)
            javax.net.ssl.SSLContext r4 = r2.a
            r0 = 1
            javax.net.ssl.X509TrustManager[] r0 = new javax.net.ssl.X509TrustManager[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 0
            r4.init(r3, r0, r5)
            return
    }

    @java.lang.Deprecated
    public c(java.security.KeyStore r2, java.io.InputStream r3, java.lang.String r4) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException, java.security.cert.CertificateException, java.io.IOException {
            r1 = this;
            r1.<init>(r2)
            javax.net.ssl.SSLContext r2 = com.huawei.secure.android.common.ssl.f.i()
            r1.a = r2
            u1.a r2 = new u1.a
            r2.<init>(r3, r4)
            javax.net.ssl.SSLContext r3 = r1.a
            r4 = 1
            javax.net.ssl.X509TrustManager[] r4 = new javax.net.ssl.X509TrustManager[r4]
            r0 = 0
            r4[r0] = r2
            r2 = 0
            r3.init(r2, r4, r2)
            return
    }

    @java.lang.Deprecated
    public c(java.security.KeyStore r2, java.io.InputStream r3, java.lang.String r4, java.security.SecureRandom r5) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException, java.security.cert.CertificateException, java.io.IOException {
            r1 = this;
            r1.<init>(r2)
            javax.net.ssl.SSLContext r2 = com.huawei.secure.android.common.ssl.f.i()
            r1.a = r2
            u1.a r2 = new u1.a
            r2.<init>(r3, r4)
            javax.net.ssl.SSLContext r3 = r1.a
            r4 = 1
            javax.net.ssl.X509TrustManager[] r4 = new javax.net.ssl.X509TrustManager[r4]
            r0 = 0
            r4[r0] = r2
            r2 = 0
            r3.init(r2, r4, r5)
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
    public static u1.c b(java.security.KeyStore r3, android.content.Context r4) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException, java.security.cert.CertificateException, java.io.IOException, java.lang.IllegalAccessException {
            u1.c r0 = u1.c.e
            if (r0 != 0) goto L1a
            java.lang.Class<u1.c> r0 = u1.c.class
            monitor-enter(r0)
            u1.c r1 = u1.c.e     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L16
            u1.c r1 = new u1.c     // Catch: java.lang.Throwable -> L14
            r2 = 0
            r1.<init>(r3, r4, r2)     // Catch: java.lang.Throwable -> L14
            u1.c.e = r1     // Catch: java.lang.Throwable -> L14
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
            u1.c r3 = u1.c.e
            return r3
    }

    @java.lang.Deprecated
    public static u1.c c(java.security.KeyStore r2, android.content.Context r3, java.security.SecureRandom r4) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException, java.security.cert.CertificateException, java.io.IOException, java.lang.IllegalAccessException {
            u1.c r0 = u1.c.e
            if (r0 != 0) goto L19
            java.lang.Class<u1.c> r0 = u1.c.class
            monitor-enter(r0)
            u1.c r1 = u1.c.e     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            u1.c r1 = new u1.c     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L13
            u1.c.e = r1     // Catch: java.lang.Throwable -> L13
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
            u1.c r2 = u1.c.e
            return r2
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.SocketFactory
    public java.net.Socket createSocket() throws java.io.IOException {
            r1 = this;
            javax.net.ssl.SSLContext r0 = r1.a
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()
            java.net.Socket r0 = r0.createSocket()
            r1.a(r0)
            return r0
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.LayeredSocketFactory
    public java.net.Socket createSocket(java.net.Socket r2, java.lang.String r3, int r4, boolean r5) throws java.io.IOException {
            r1 = this;
            javax.net.ssl.SSLContext r0 = r1.a
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()
            java.net.Socket r2 = r0.createSocket(r2, r3, r4, r5)
            r1.a(r2)
            return r2
    }
}
