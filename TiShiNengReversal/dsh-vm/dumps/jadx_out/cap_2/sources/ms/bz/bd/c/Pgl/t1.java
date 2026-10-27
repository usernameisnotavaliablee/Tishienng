package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class t1 extends javax.net.ssl.SSLSocketFactory {
    private static final java.lang.String[] b = null;
    final javax.net.ssl.SSLSocketFactory a;

    static {
            r0 = 7
            byte[] r6 = new byte[r0]
            r6 = {x001c: FILL_ARRAY_DATA , data: [21, 74, 33, 0, 92, 63, 97} // fill-array
            r3 = 0
            java.lang.String r5 = "0dab2f"
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r2 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String[] r0 = new java.lang.String[]{r0}
            ms.bz.bd.c.Pgl.t1.b = r0
            return
    }

    public t1(javax.net.ssl.SSLSocketFactory r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.lang.String r2, int r3) throws java.io.IOException, java.net.UnknownHostException {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.a
            java.net.Socket r2 = r0.createSocket(r2, r3)
            boolean r3 = r2 instanceof javax.net.ssl.SSLSocket
            if (r3 == 0) goto L12
            r3 = r2
            javax.net.ssl.SSLSocket r3 = (javax.net.ssl.SSLSocket) r3
            java.lang.String[] r0 = ms.bz.bd.c.Pgl.t1.b
            r3.setEnabledProtocols(r0)
        L12:
            return r2
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.lang.String r2, int r3, java.net.InetAddress r4, int r5) throws java.io.IOException, java.net.UnknownHostException {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.a
            java.net.Socket r2 = r0.createSocket(r2, r3, r4, r5)
            boolean r3 = r2 instanceof javax.net.ssl.SSLSocket
            if (r3 == 0) goto L12
            r3 = r2
            javax.net.ssl.SSLSocket r3 = (javax.net.ssl.SSLSocket) r3
            java.lang.String[] r4 = ms.bz.bd.c.Pgl.t1.b
            r3.setEnabledProtocols(r4)
        L12:
            return r2
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.net.InetAddress r2, int r3) throws java.io.IOException {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.a
            java.net.Socket r2 = r0.createSocket(r2, r3)
            boolean r3 = r2 instanceof javax.net.ssl.SSLSocket
            if (r3 == 0) goto L12
            r3 = r2
            javax.net.ssl.SSLSocket r3 = (javax.net.ssl.SSLSocket) r3
            java.lang.String[] r0 = ms.bz.bd.c.Pgl.t1.b
            r3.setEnabledProtocols(r0)
        L12:
            return r2
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.net.InetAddress r2, int r3, java.net.InetAddress r4, int r5) throws java.io.IOException {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.a
            java.net.Socket r2 = r0.createSocket(r2, r3, r4, r5)
            boolean r3 = r2 instanceof javax.net.ssl.SSLSocket
            if (r3 == 0) goto L12
            r3 = r2
            javax.net.ssl.SSLSocket r3 = (javax.net.ssl.SSLSocket) r3
            java.lang.String[] r4 = ms.bz.bd.c.Pgl.t1.b
            r3.setEnabledProtocols(r4)
        L12:
            return r2
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.net.Socket createSocket(java.net.Socket r2, java.lang.String r3, int r4, boolean r5) throws java.io.IOException {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.a
            java.net.Socket r2 = r0.createSocket(r2, r3, r4, r5)
            boolean r3 = r2 instanceof javax.net.ssl.SSLSocket
            if (r3 == 0) goto L12
            r3 = r2
            javax.net.ssl.SSLSocket r3 = (javax.net.ssl.SSLSocket) r3
            java.lang.String[] r4 = ms.bz.bd.c.Pgl.t1.b
            r3.setEnabledProtocols(r4)
        L12:
            return r2
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.lang.String[] getDefaultCipherSuites() {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.a
            java.lang.String[] r0 = r0.getDefaultCipherSuites()
            return r0
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.lang.String[] getSupportedCipherSuites() {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.a
            java.lang.String[] r0 = r0.getSupportedCipherSuites()
            return r0
    }
}
