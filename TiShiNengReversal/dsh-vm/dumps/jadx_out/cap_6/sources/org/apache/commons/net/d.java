package org.apache.commons.net;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d extends javax.net.SocketFactory {
    private final java.net.Proxy a;

    public d() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public d(java.net.Proxy r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public java.net.ServerSocket a(int r2) throws java.io.IOException {
            r1 = this;
            java.net.ServerSocket r0 = new java.net.ServerSocket
            r0.<init>(r2)
            return r0
    }

    public java.net.ServerSocket b(int r2, int r3) throws java.io.IOException {
            r1 = this;
            java.net.ServerSocket r0 = new java.net.ServerSocket
            r0.<init>(r2, r3)
            return r0
    }

    public java.net.ServerSocket c(int r2, int r3, java.net.InetAddress r4) throws java.io.IOException {
            r1 = this;
            java.net.ServerSocket r0 = new java.net.ServerSocket
            r0.<init>(r2, r3, r4)
            return r0
    }

    @Override // javax.net.SocketFactory
    public java.net.Socket createSocket() throws java.io.IOException {
            r2 = this;
            java.net.Proxy r0 = r2.a
            if (r0 == 0) goto Lc
            java.net.Socket r0 = new java.net.Socket
            java.net.Proxy r1 = r2.a
            r0.<init>(r1)
            return r0
        Lc:
            java.net.Socket r0 = new java.net.Socket
            r0.<init>()
            return r0
    }

    @Override // javax.net.SocketFactory
    public java.net.Socket createSocket(java.lang.String r3, int r4) throws java.net.UnknownHostException, java.io.IOException {
            r2 = this;
            java.net.Proxy r0 = r2.a
            if (r0 == 0) goto L14
            java.net.Socket r0 = new java.net.Socket
            java.net.Proxy r1 = r2.a
            r0.<init>(r1)
            java.net.InetSocketAddress r1 = new java.net.InetSocketAddress
            r1.<init>(r3, r4)
            r0.connect(r1)
            return r0
        L14:
            java.net.Socket r0 = new java.net.Socket
            r0.<init>(r3, r4)
            return r0
    }

    @Override // javax.net.SocketFactory
    public java.net.Socket createSocket(java.lang.String r3, int r4, java.net.InetAddress r5, int r6) throws java.net.UnknownHostException, java.io.IOException {
            r2 = this;
            java.net.Proxy r0 = r2.a
            if (r0 == 0) goto L1c
            java.net.Socket r0 = new java.net.Socket
            java.net.Proxy r1 = r2.a
            r0.<init>(r1)
            java.net.InetSocketAddress r1 = new java.net.InetSocketAddress
            r1.<init>(r5, r6)
            r0.bind(r1)
            java.net.InetSocketAddress r5 = new java.net.InetSocketAddress
            r5.<init>(r3, r4)
            r0.connect(r5)
            return r0
        L1c:
            java.net.Socket r0 = new java.net.Socket
            r0.<init>(r3, r4, r5, r6)
            return r0
    }

    @Override // javax.net.SocketFactory
    public java.net.Socket createSocket(java.net.InetAddress r3, int r4) throws java.io.IOException {
            r2 = this;
            java.net.Proxy r0 = r2.a
            if (r0 == 0) goto L14
            java.net.Socket r0 = new java.net.Socket
            java.net.Proxy r1 = r2.a
            r0.<init>(r1)
            java.net.InetSocketAddress r1 = new java.net.InetSocketAddress
            r1.<init>(r3, r4)
            r0.connect(r1)
            return r0
        L14:
            java.net.Socket r0 = new java.net.Socket
            r0.<init>(r3, r4)
            return r0
    }

    @Override // javax.net.SocketFactory
    public java.net.Socket createSocket(java.net.InetAddress r3, int r4, java.net.InetAddress r5, int r6) throws java.io.IOException {
            r2 = this;
            java.net.Proxy r0 = r2.a
            if (r0 == 0) goto L1c
            java.net.Socket r0 = new java.net.Socket
            java.net.Proxy r1 = r2.a
            r0.<init>(r1)
            java.net.InetSocketAddress r1 = new java.net.InetSocketAddress
            r1.<init>(r5, r6)
            r0.bind(r1)
            java.net.InetSocketAddress r5 = new java.net.InetSocketAddress
            r5.<init>(r3, r4)
            r0.connect(r5)
            return r0
        L1c:
            java.net.Socket r0 = new java.net.Socket
            r0.<init>(r3, r4, r5, r6)
            return r0
    }
}
