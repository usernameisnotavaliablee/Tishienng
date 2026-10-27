package org.apache.commons.net.tftp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a extends org.apache.commons.net.a {
    public static final int k = 0;
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 1;
    public static final int o = 1;
    public static final int p = 5000;

    /* renamed from: q, reason: collision with root package name */
    public static final int f64q = 69;
    static final int r = 516;
    private byte[] g;
    private java.net.DatagramPacket h;
    private java.net.DatagramPacket i;
    byte[] j;

    public a() {
            r1 = this;
            r1.<init>()
            r0 = 5000(0x1388, float:7.006E-42)
            r1.n(r0)
            r0 = 0
            r1.g = r0
            r1.h = r0
            return
    }

    public static final java.lang.String u(int r1) {
            java.lang.String[] r0 = org.apache.commons.net.tftp.h.m
            r1 = r0[r1]
            return r1
    }

    public final void p() {
            r4 = this;
            r0 = 516(0x204, float:7.23E-43)
            byte[] r1 = new byte[r0]
            r4.g = r1
            java.net.DatagramPacket r1 = new java.net.DatagramPacket
            byte[] r2 = r4.g
            int r3 = r2.length
            r1.<init>(r2, r3)
            r4.h = r1
            byte[] r0 = new byte[r0]
            r4.j = r0
            java.net.DatagramPacket r0 = new java.net.DatagramPacket
            byte[] r1 = r4.j
            int r2 = r1.length
            r0.<init>(r1, r2)
            r4.i = r0
            return
    }

    public final org.apache.commons.net.tftp.f q() throws java.io.IOException, java.io.InterruptedIOException, java.net.SocketException, org.apache.commons.net.tftp.TFTPPacketException {
            r2 = this;
            java.net.DatagramPacket r0 = r2.h
            byte[] r1 = r2.g
            r0.setData(r1)
            java.net.DatagramPacket r0 = r2.h
            byte[] r1 = r2.g
            int r1 = r1.length
            r0.setLength(r1)
            java.net.DatagramSocket r0 = r2.c
            java.net.DatagramPacket r1 = r2.h
            r0.receive(r1)
            java.net.DatagramPacket r0 = r2.h
            org.apache.commons.net.tftp.f r0 = org.apache.commons.net.tftp.f.e(r0)
            java.lang.String r1 = "<"
            r2.x(r1, r0)
            return r0
    }

    public final void r(org.apache.commons.net.tftp.f r4) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = ">"
            r3.x(r0, r4)
            java.net.DatagramSocket r0 = r3.c
            java.net.DatagramPacket r1 = r3.i
            byte[] r2 = r3.j
            java.net.DatagramPacket r4 = r4.a(r1, r2)
            r0.send(r4)
            return
    }

    public final void s() throws java.io.IOException {
            r3 = this;
            java.net.DatagramPacket r0 = new java.net.DatagramPacket
            r1 = 516(0x204, float:7.23E-43)
            byte[] r2 = new byte[r1]
            r0.<init>(r2, r1)
            int r1 = r3.g()
            r2 = 1
            r3.o(r2)
        L11:
            java.net.DatagramSocket r2 = r3.c     // Catch: java.lang.Throwable -> L17
            r2.receive(r0)     // Catch: java.lang.Throwable -> L17
            goto L11
        L17:
            r3.o(r1)
            return
    }

    public final void t() {
            r1 = this;
            r0 = 0
            r1.g = r0
            r1.h = r0
            r1.j = r0
            r1.i = r0
            return
    }

    public final org.apache.commons.net.tftp.f v() throws java.io.IOException, java.io.InterruptedIOException, java.net.SocketException, org.apache.commons.net.tftp.TFTPPacketException {
            r3 = this;
            java.net.DatagramPacket r0 = new java.net.DatagramPacket
            r1 = 516(0x204, float:7.23E-43)
            byte[] r2 = new byte[r1]
            r0.<init>(r2, r1)
            java.net.DatagramSocket r1 = r3.c
            r1.receive(r0)
            org.apache.commons.net.tftp.f r0 = org.apache.commons.net.tftp.f.e(r0)
            java.lang.String r1 = "<"
            r3.x(r1, r0)
            return r0
    }

    public final void w(org.apache.commons.net.tftp.f r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = ">"
            r1.x(r0, r2)
            java.net.DatagramSocket r0 = r1.c
            java.net.DatagramPacket r2 = r2.d()
            r0.send(r2)
            return
    }

    protected void x(java.lang.String r1, org.apache.commons.net.tftp.f r2) {
            r0 = this;
            return
    }
}
