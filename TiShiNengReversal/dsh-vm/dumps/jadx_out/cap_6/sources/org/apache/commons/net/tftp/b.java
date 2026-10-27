package org.apache.commons.net.tftp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class b extends org.apache.commons.net.tftp.f {
    int k;

    b(java.net.DatagramPacket r4) throws org.apache.commons.net.tftp.TFTPPacketException {
            r3 = this;
            java.net.InetAddress r0 = r4.getAddress()
            int r1 = r4.getPort()
            r2 = 4
            r3.<init>(r2, r0, r1)
            byte[] r4 = r4.getData()
            int r0 = r3.getType()
            r1 = 1
            r1 = r4[r1]
            if (r0 != r1) goto L29
            r0 = 2
            r0 = r4[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r1 = 3
            r4 = r4[r1]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r4 = r4 | r0
            r3.k = r4
            return
        L29:
            org.apache.commons.net.tftp.TFTPPacketException r4 = new org.apache.commons.net.tftp.TFTPPacketException
            java.lang.String r0 = "TFTP operator code does not match type."
            r4.<init>(r0)
            throw r4
    }

    public b(java.net.InetAddress r2, int r3, int r4) {
            r1 = this;
            r0 = 4
            r1.<init>(r0, r2, r3)
            r1.k = r4
            return
    }

    @Override // org.apache.commons.net.tftp.f
    java.net.DatagramPacket a(java.net.DatagramPacket r4, byte[] r5) {
            r3 = this;
            r0 = 0
            r5[r0] = r0
            int r0 = r3.a
            byte r0 = (byte) r0
            r1 = 1
            r5[r1] = r0
            int r0 = r3.k
            r1 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = r1 >> 8
            byte r1 = (byte) r1
            r2 = 2
            r5[r2] = r1
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1 = 3
            r5[r1] = r0
            java.net.InetAddress r0 = r3.c
            r4.setAddress(r0)
            int r0 = r3.b
            r4.setPort(r0)
            r4.setData(r5)
            r5 = 4
            r4.setLength(r5)
            return r4
    }

    @Override // org.apache.commons.net.tftp.f
    public java.net.DatagramPacket d() {
            r6 = this;
            int r0 = r6.a
            byte r0 = (byte) r0
            int r1 = r6.k
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            int r2 = r2 >> 8
            byte r2 = (byte) r2
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r3 = 4
            byte[] r4 = new byte[r3]
            r5 = 0
            r4[r5] = r5
            r5 = 1
            r4[r5] = r0
            r0 = 2
            r4[r0] = r2
            r0 = 3
            r4[r0] = r1
            java.net.DatagramPacket r0 = new java.net.DatagramPacket
            java.net.InetAddress r1 = r6.c
            int r2 = r6.b
            r0.<init>(r4, r3, r1, r2)
            return r0
    }

    public int h() {
            r1 = this;
            int r0 = r1.k
            return r0
    }

    public void i(int r1) {
            r0 = this;
            r0.k = r1
            return
    }

    @Override // org.apache.commons.net.tftp.f
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = " ACK "
            r0.append(r1)
            int r1 = r2.k
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
