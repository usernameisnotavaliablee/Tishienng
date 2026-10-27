package cn.bluemobi.dylan.http.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Tls12SocketFactory extends javax.net.ssl.SSLSocketFactory {
    private static final java.lang.String[] TLS_SUPPORT_VERSION = null;
    final javax.net.ssl.SSLSocketFactory delegate;

    static {
            java.lang.String r0 = "TLSv1.1"
            java.lang.String r1 = "TLSv1.2"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            cn.bluemobi.dylan.http.ssl.Tls12SocketFactory.TLS_SUPPORT_VERSION = r0
            return
    }

    public Tls12SocketFactory(javax.net.ssl.SSLSocketFactory r1) {
            r0 = this;
            r0.<init>()
            r0.delegate = r1
            return
    }

    private java.net.Socket patch(java.net.Socket r3) {
            r2 = this;
            boolean r0 = r3 instanceof javax.net.ssl.SSLSocket
            if (r0 == 0) goto Lc
            r0 = r3
            javax.net.ssl.SSLSocket r0 = (javax.net.ssl.SSLSocket) r0
            java.lang.String[] r1 = cn.bluemobi.dylan.http.ssl.Tls12SocketFactory.TLS_SUPPORT_VERSION
            r0.setEnabledProtocols(r1)
        Lc:
            return r3
    }

    @Override // javax.net.SocketFactory
    public java.net.Socket createSocket(java.lang.String r2, int r3) throws java.io.IOException, java.net.UnknownHostException {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.delegate
            java.net.Socket r2 = r0.createSocket(r2, r3)
            java.net.Socket r2 = r1.patch(r2)
            return r2
    }

    @Override // javax.net.SocketFactory
    public java.net.Socket createSocket(java.lang.String r2, int r3, java.net.InetAddress r4, int r5) throws java.io.IOException, java.net.UnknownHostException {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.delegate
            java.net.Socket r2 = r0.createSocket(r2, r3, r4, r5)
            java.net.Socket r2 = r1.patch(r2)
            return r2
    }

    @Override // javax.net.SocketFactory
    public java.net.Socket createSocket(java.net.InetAddress r2, int r3) throws java.io.IOException {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.delegate
            java.net.Socket r2 = r0.createSocket(r2, r3)
            java.net.Socket r2 = r1.patch(r2)
            return r2
    }

    @Override // javax.net.SocketFactory
    public java.net.Socket createSocket(java.net.InetAddress r2, int r3, java.net.InetAddress r4, int r5) throws java.io.IOException {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.delegate
            java.net.Socket r2 = r0.createSocket(r2, r3, r4, r5)
            java.net.Socket r2 = r1.patch(r2)
            return r2
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public java.net.Socket createSocket(java.net.Socket r2, java.lang.String r3, int r4, boolean r5) throws java.io.IOException {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.delegate
            java.net.Socket r2 = r0.createSocket(r2, r3, r4, r5)
            java.net.Socket r2 = r1.patch(r2)
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
