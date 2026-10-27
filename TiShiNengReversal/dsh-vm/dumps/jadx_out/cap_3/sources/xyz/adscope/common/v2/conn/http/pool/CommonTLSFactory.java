package xyz.adscope.common.v2.conn.http.pool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
class CommonTLSFactory extends javax.net.ssl.SSLSocketFactory {
    private static final javax.net.ssl.X509TrustManager DEFAULT_TRUST_MANAGERS = null;
    private static final java.lang.String[] PROTOCOL_ARRAY = null;
    private final javax.net.ssl.SSLSocketFactory delegate;


    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            java.lang.String r2 = "TLSv1.2"
            java.lang.String r3 = "TLSv1.1"
            java.lang.String r4 = "TLSv1"
            if (r0 < r1) goto L13
            java.lang.String[] r0 = new java.lang.String[]{r4, r3, r2}
            xyz.adscope.common.v2.conn.http.pool.CommonTLSFactory.PROTOCOL_ARRAY = r0
            goto L1b
        L13:
            java.lang.String r0 = "SSLv3"
            java.lang.String[] r0 = new java.lang.String[]{r0, r4, r3, r2}
            xyz.adscope.common.v2.conn.http.pool.CommonTLSFactory.PROTOCOL_ARRAY = r0
        L1b:
            xyz.adscope.common.v2.conn.http.pool.CommonTLSFactory$1 r0 = new xyz.adscope.common.v2.conn.http.pool.CommonTLSFactory$1
            r0.<init>()
            xyz.adscope.common.v2.conn.http.pool.CommonTLSFactory.DEFAULT_TRUST_MANAGERS = r0
            return
    }

    CommonTLSFactory() {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch: java.security.GeneralSecurityException -> L21
            r1 = 1
            javax.net.ssl.TrustManager[] r1 = new javax.net.ssl.TrustManager[r1]     // Catch: java.security.GeneralSecurityException -> L21
            javax.net.ssl.X509TrustManager r2 = xyz.adscope.common.v2.conn.http.pool.CommonTLSFactory.DEFAULT_TRUST_MANAGERS     // Catch: java.security.GeneralSecurityException -> L21
            r3 = 0
            r1[r3] = r2     // Catch: java.security.GeneralSecurityException -> L21
            java.security.SecureRandom r2 = new java.security.SecureRandom     // Catch: java.security.GeneralSecurityException -> L21
            r2.<init>()     // Catch: java.security.GeneralSecurityException -> L21
            r3 = 0
            r0.init(r3, r1, r2)     // Catch: java.security.GeneralSecurityException -> L21
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()     // Catch: java.security.GeneralSecurityException -> L21
            r4.delegate = r0     // Catch: java.security.GeneralSecurityException -> L21
            return
        L21:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
    }

    CommonTLSFactory(javax.net.ssl.SSLSocketFactory r1) {
            r0 = this;
            r0.<init>()
            r0.delegate = r1
            return
    }

    private static void setSupportProtocolAndCipherSuites(java.net.Socket r1) {
            boolean r0 = r1 instanceof javax.net.ssl.SSLSocket
            if (r0 == 0) goto Lb
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1
            java.lang.String[] r0 = xyz.adscope.common.v2.conn.http.pool.CommonTLSFactory.PROTOCOL_ARRAY
            r1.setEnabledProtocols(r0)
        Lb:
            return
    }

    @Override // javax.net.SocketFactory
    public java.net.Socket createSocket() {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.delegate
            java.net.Socket r0 = r0.createSocket()
            setSupportProtocolAndCipherSuites(r0)
            return r0
    }

    @Override // javax.net.SocketFactory
    public java.net.Socket createSocket(java.lang.String r2, int r3) {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.delegate
            java.net.Socket r2 = r0.createSocket(r2, r3)
            setSupportProtocolAndCipherSuites(r2)
            return r2
    }

    @Override // javax.net.SocketFactory
    public java.net.Socket createSocket(java.lang.String r2, int r3, java.net.InetAddress r4, int r5) {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.delegate
            java.net.Socket r2 = r0.createSocket(r2, r3, r4, r5)
            setSupportProtocolAndCipherSuites(r2)
            return r2
    }

    @Override // javax.net.SocketFactory
    public java.net.Socket createSocket(java.net.InetAddress r2, int r3) {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.delegate
            java.net.Socket r2 = r0.createSocket(r2, r3)
            setSupportProtocolAndCipherSuites(r2)
            return r2
    }

    @Override // javax.net.SocketFactory
    public java.net.Socket createSocket(java.net.InetAddress r2, int r3, java.net.InetAddress r4, int r5) {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.delegate
            java.net.Socket r2 = r0.createSocket(r2, r3, r4, r5)
            setSupportProtocolAndCipherSuites(r2)
            return r2
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public java.net.Socket createSocket(java.net.Socket r2, java.lang.String r3, int r4, boolean r5) {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.delegate
            java.net.Socket r2 = r0.createSocket(r2, r3, r4, r5)
            setSupportProtocolAndCipherSuites(r2)
            return r2
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public java.lang.String[] getDefaultCipherSuites() {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.delegate
            java.lang.String[] r0 = r0.getDefaultCipherSuites()
            return r0
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public java.lang.String[] getSupportedCipherSuites() {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.delegate
            java.lang.String[] r0 = r0.getSupportedCipherSuites()
            return r0
    }
}
