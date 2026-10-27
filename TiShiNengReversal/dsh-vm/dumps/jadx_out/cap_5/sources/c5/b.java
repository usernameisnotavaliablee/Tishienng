package c5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends org.apache.commons.net.a {
    public static final int i = 37;
    public static final long j = 2208988800L;
    private final byte[] g;
    private final byte[] h;

    public b() {
            r1 = this;
            r1.<init>()
            r0 = 1
            byte[] r0 = new byte[r0]
            r1.g = r0
            r0 = 4
            byte[] r0 = new byte[r0]
            r1.h = r0
            return
    }

    public java.util.Date p(java.net.InetAddress r6) throws java.io.IOException {
            r5 = this;
            java.util.Date r0 = new java.util.Date
            r1 = 37
            long r1 = r5.s(r6, r1)
            r3 = 2208988800(0x83aa7e80, double:1.091385478E-314)
            long r1 = r1 - r3
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            r0.<init>(r1)
            return r0
    }

    public java.util.Date q(java.net.InetAddress r4, int r5) throws java.io.IOException {
            r3 = this;
            java.util.Date r0 = new java.util.Date
            long r4 = r3.s(r4, r5)
            r1 = 2208988800(0x83aa7e80, double:1.091385478E-314)
            long r4 = r4 - r1
            r1 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r1
            r0.<init>(r4)
            return r0
    }

    public long r(java.net.InetAddress r3) throws java.io.IOException {
            r2 = this;
            r0 = 37
            long r0 = r2.s(r3, r0)
            return r0
    }

    public long s(java.net.InetAddress r7, int r8) throws java.io.IOException {
            r6 = this;
            java.net.DatagramPacket r0 = new java.net.DatagramPacket
            byte[] r1 = r6.g
            int r2 = r1.length
            r0.<init>(r1, r2, r7, r8)
            java.net.DatagramPacket r7 = new java.net.DatagramPacket
            byte[] r8 = r6.h
            int r1 = r8.length
            r7.<init>(r8, r1)
            java.net.DatagramSocket r8 = r6.c
            r8.send(r0)
            java.net.DatagramSocket r8 = r6.c
            r8.receive(r7)
            byte[] r7 = r6.h
            r8 = 0
            r8 = r7[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 24
            long r0 = (long) r8
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            r8 = 1
            r8 = r7[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 16
            long r4 = (long) r8
            long r4 = r4 & r2
            long r0 = r0 | r4
            r8 = 2
            r8 = r7[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            long r4 = (long) r8
            long r4 = r4 & r2
            long r0 = r0 | r4
            r8 = 3
            r7 = r7[r8]
            r7 = r7 & 255(0xff, float:3.57E-43)
            long r7 = (long) r7
            long r7 = r7 & r2
            long r7 = r7 | r0
            return r7
    }
}
