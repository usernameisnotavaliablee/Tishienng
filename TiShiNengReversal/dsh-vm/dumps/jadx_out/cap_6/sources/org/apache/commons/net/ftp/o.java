package org.apache.commons.net.ftp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class o extends javax.net.ServerSocketFactory {
    private final javax.net.ssl.SSLContext a;

    public o(javax.net.ssl.SSLContext r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public java.net.ServerSocket a(java.net.ServerSocket r3) {
            r2 = this;
            r0 = r3
            javax.net.ssl.SSLServerSocket r0 = (javax.net.ssl.SSLServerSocket) r0
            r1 = 1
            r0.setUseClientMode(r1)
            return r3
    }

    @Override // javax.net.ServerSocketFactory
    public java.net.ServerSocket createServerSocket() throws java.io.IOException {
            r1 = this;
            javax.net.ssl.SSLContext r0 = r1.a
            javax.net.ssl.SSLServerSocketFactory r0 = r0.getServerSocketFactory()
            java.net.ServerSocket r0 = r0.createServerSocket()
            java.net.ServerSocket r0 = r1.a(r0)
            return r0
    }

    @Override // javax.net.ServerSocketFactory
    public java.net.ServerSocket createServerSocket(int r2) throws java.io.IOException {
            r1 = this;
            javax.net.ssl.SSLContext r0 = r1.a
            javax.net.ssl.SSLServerSocketFactory r0 = r0.getServerSocketFactory()
            java.net.ServerSocket r2 = r0.createServerSocket(r2)
            java.net.ServerSocket r2 = r1.a(r2)
            return r2
    }

    @Override // javax.net.ServerSocketFactory
    public java.net.ServerSocket createServerSocket(int r2, int r3) throws java.io.IOException {
            r1 = this;
            javax.net.ssl.SSLContext r0 = r1.a
            javax.net.ssl.SSLServerSocketFactory r0 = r0.getServerSocketFactory()
            java.net.ServerSocket r2 = r0.createServerSocket(r2, r3)
            java.net.ServerSocket r2 = r1.a(r2)
            return r2
    }

    @Override // javax.net.ServerSocketFactory
    public java.net.ServerSocket createServerSocket(int r2, int r3, java.net.InetAddress r4) throws java.io.IOException {
            r1 = this;
            javax.net.ssl.SSLContext r0 = r1.a
            javax.net.ssl.SSLServerSocketFactory r0 = r0.getServerSocketFactory()
            java.net.ServerSocket r2 = r0.createServerSocket(r2, r3, r4)
            java.net.ServerSocket r2 = r1.a(r2)
            return r2
    }
}
