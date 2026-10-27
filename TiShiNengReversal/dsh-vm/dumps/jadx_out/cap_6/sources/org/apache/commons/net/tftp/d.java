package org.apache.commons.net.tftp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class d extends org.apache.commons.net.tftp.f {
    public static final int o = 512;
    public static final int p = 0;
    int k;
    int l;
    int m;
    byte[] n;

    d(java.net.DatagramPacket r6) throws org.apache.commons.net.tftp.TFTPPacketException {
            r5 = this;
            java.net.InetAddress r0 = r6.getAddress()
            int r1 = r6.getPort()
            r2 = 3
            r5.<init>(r2, r0, r1)
            byte[] r0 = r6.getData()
            r5.n = r0
            r0 = 4
            r5.m = r0
            int r1 = r5.getType()
            byte[] r3 = r5.n
            r4 = 1
            r4 = r3[r4]
            if (r1 != r4) goto L3c
            r1 = 2
            r1 = r3[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r2 = r3[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1 = r1 | r2
            r5.k = r1
            int r6 = r6.getLength()
            int r6 = r6 - r0
            r5.l = r6
            r0 = 512(0x200, float:7.17E-43)
            if (r6 <= r0) goto L3b
            r5.l = r0
        L3b:
            return
        L3c:
            org.apache.commons.net.tftp.TFTPPacketException r6 = new org.apache.commons.net.tftp.TFTPPacketException
            java.lang.String r0 = "TFTP operator code does not match type."
            r6.<init>(r0)
            throw r6
    }

    public d(java.net.InetAddress r8, int r9, int r10, byte[] r11) {
            r7 = this;
            r5 = 0
            int r6 = r11.length
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public d(java.net.InetAddress r2, int r3, int r4, byte[] r5, int r6, int r7) {
            r1 = this;
            r0 = 3
            r1.<init>(r0, r2, r3)
            r1.k = r4
            r1.n = r5
            r1.m = r6
            r2 = 512(0x200, float:7.17E-43)
            if (r7 <= r2) goto L11
            r1.l = r2
            return
        L11:
            r1.l = r7
            return
    }

    @Override // org.apache.commons.net.tftp.f
    java.net.DatagramPacket a(java.net.DatagramPacket r5, byte[] r6) {
            r4 = this;
            r0 = 0
            r6[r0] = r0
            int r0 = r4.a
            byte r0 = (byte) r0
            r1 = 1
            r6[r1] = r0
            int r0 = r4.k
            r1 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = r1 >> 8
            byte r1 = (byte) r1
            r2 = 2
            r6[r2] = r1
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1 = 3
            r6[r1] = r0
            byte[] r0 = r4.n
            r1 = 4
            if (r6 == r0) goto L27
            int r2 = r4.m
            int r3 = r4.l
            java.lang.System.arraycopy(r0, r2, r6, r1, r3)
        L27:
            java.net.InetAddress r0 = r4.c
            r5.setAddress(r0)
            int r0 = r4.b
            r5.setPort(r0)
            r5.setData(r6)
            int r6 = r4.l
            int r6 = r6 + r1
            r5.setLength(r6)
            return r5
    }

    @Override // org.apache.commons.net.tftp.f
    public java.net.DatagramPacket d() {
            r5 = this;
            int r0 = r5.l
            int r1 = r0 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            r1[r2] = r2
            int r2 = r5.a
            byte r2 = (byte) r2
            r3 = 1
            r1[r3] = r2
            int r2 = r5.k
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            int r3 = r3 >> 8
            byte r3 = (byte) r3
            r4 = 2
            r1[r4] = r3
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3 = 3
            r1[r3] = r2
            byte[] r2 = r5.n
            int r3 = r5.m
            r4 = 4
            java.lang.System.arraycopy(r2, r3, r1, r4, r0)
            java.net.DatagramPacket r0 = new java.net.DatagramPacket
            int r2 = r5.l
            int r2 = r2 + r4
            java.net.InetAddress r3 = r5.c
            int r4 = r5.b
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public int h() {
            r1 = this;
            int r0 = r1.k
            return r0
    }

    public byte[] i() {
            r1 = this;
            byte[] r0 = r1.n
            return r0
    }

    public int j() {
            r1 = this;
            int r0 = r1.l
            return r0
    }

    public int k() {
            r1 = this;
            int r0 = r1.m
            return r0
    }

    public void l(int r1) {
            r0 = this;
            r0.k = r1
            return
    }

    public void m(byte[] r1, int r2, int r3) {
            r0 = this;
            r0.n = r1
            r0.m = r2
            r0.l = r3
            r1 = 512(0x200, float:7.17E-43)
            if (r3 <= r1) goto Ld
            r0.l = r1
            return
        Ld:
            r0.l = r3
            return
    }

    @Override // org.apache.commons.net.tftp.f
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = " DATA "
            r0.append(r1)
            int r1 = r2.k
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            int r1 = r2.l
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
