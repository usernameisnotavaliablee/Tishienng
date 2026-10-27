package org.apache.commons.net.tftp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class f {
    static final int d = 4;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 3;
    public static final int h = 4;
    public static final int i = 5;
    public static final int j = 512;
    int a;
    int b;
    java.net.InetAddress c;

    f(int r1, java.net.InetAddress r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.c = r2
            r0.b = r3
            return
    }

    public static final org.apache.commons.net.tftp.f e(java.net.DatagramPacket r3) throws org.apache.commons.net.tftp.TFTPPacketException {
            int r0 = r3.getLength()
            r1 = 4
            if (r0 < r1) goto L41
            byte[] r0 = r3.getData()
            r2 = 1
            r0 = r0[r2]
            if (r0 == r2) goto L3b
            r2 = 2
            if (r0 == r2) goto L35
            r2 = 3
            if (r0 == r2) goto L2f
            if (r0 == r1) goto L29
            r1 = 5
            if (r0 != r1) goto L21
            org.apache.commons.net.tftp.e r0 = new org.apache.commons.net.tftp.e
            r0.<init>(r3)
            return r0
        L21:
            org.apache.commons.net.tftp.TFTPPacketException r3 = new org.apache.commons.net.tftp.TFTPPacketException
            java.lang.String r0 = "Bad packet.  Invalid TFTP operator code."
            r3.<init>(r0)
            throw r3
        L29:
            org.apache.commons.net.tftp.b r0 = new org.apache.commons.net.tftp.b
            r0.<init>(r3)
            return r0
        L2f:
            org.apache.commons.net.tftp.d r0 = new org.apache.commons.net.tftp.d
            r0.<init>(r3)
            return r0
        L35:
            org.apache.commons.net.tftp.i r0 = new org.apache.commons.net.tftp.i
            r0.<init>(r3)
            return r0
        L3b:
            org.apache.commons.net.tftp.g r0 = new org.apache.commons.net.tftp.g
            r0.<init>(r3)
            return r0
        L41:
            org.apache.commons.net.tftp.TFTPPacketException r3 = new org.apache.commons.net.tftp.TFTPPacketException
            java.lang.String r0 = "Bad packet. Datagram data length is too short."
            r3.<init>(r0)
            throw r3
    }

    abstract java.net.DatagramPacket a(java.net.DatagramPacket r1, byte[] r2);

    public final java.net.InetAddress b() {
            r1 = this;
            java.net.InetAddress r0 = r1.c
            return r0
    }

    public final int c() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public abstract java.net.DatagramPacket d();

    public final void f(java.net.InetAddress r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public final void g(int r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public final int getType() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.net.InetAddress r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            int r2 = r3.b
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
