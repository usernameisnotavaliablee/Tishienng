package org.apache.commons.net.discard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b extends org.apache.commons.net.a {
    public static final int h = 9;
    java.net.DatagramPacket g;

    public b() {
            r3 = this;
            r3.<init>()
            java.net.DatagramPacket r0 = new java.net.DatagramPacket
            r1 = 0
            byte[] r2 = new byte[r1]
            r0.<init>(r2, r1)
            r3.g = r0
            return
    }

    public void p(byte[] r2, int r3, java.net.InetAddress r4) throws java.io.IOException {
            r1 = this;
            r0 = 9
            r1.q(r2, r3, r4, r0)
            return
    }

    public void q(byte[] r2, int r3, java.net.InetAddress r4, int r5) throws java.io.IOException {
            r1 = this;
            java.net.DatagramPacket r0 = r1.g
            r0.setData(r2)
            java.net.DatagramPacket r2 = r1.g
            r2.setLength(r3)
            java.net.DatagramPacket r2 = r1.g
            r2.setAddress(r4)
            java.net.DatagramPacket r2 = r1.g
            r2.setPort(r5)
            java.net.DatagramSocket r2 = r1.c
            java.net.DatagramPacket r3 = r1.g
            r2.send(r3)
            return
    }

    public void r(byte[] r3, java.net.InetAddress r4) throws java.io.IOException {
            r2 = this;
            int r0 = r3.length
            r1 = 9
            r2.q(r3, r0, r4, r1)
            return
    }
}
