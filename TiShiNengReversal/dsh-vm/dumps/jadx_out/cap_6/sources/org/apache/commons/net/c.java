package org.apache.commons.net;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c implements org.apache.commons.net.b {
    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.apache.commons.net.b
    public java.net.DatagramSocket a(int r2, java.net.InetAddress r3) throws java.net.SocketException {
            r1 = this;
            java.net.DatagramSocket r0 = new java.net.DatagramSocket
            r0.<init>(r2, r3)
            return r0
    }

    @Override // org.apache.commons.net.b
    public java.net.DatagramSocket b(int r2) throws java.net.SocketException {
            r1 = this;
            java.net.DatagramSocket r0 = new java.net.DatagramSocket
            r0.<init>(r2)
            return r0
    }

    @Override // org.apache.commons.net.b
    public java.net.DatagramSocket c() throws java.net.SocketException {
            r1 = this;
            java.net.DatagramSocket r0 = new java.net.DatagramSocket
            r0.<init>()
            return r0
    }
}
