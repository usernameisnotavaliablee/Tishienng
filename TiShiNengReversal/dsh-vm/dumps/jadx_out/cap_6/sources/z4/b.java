package z4;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class b extends org.apache.commons.net.a {
    public static final int i = 13;
    private final byte[] g;
    private final byte[] h;

    public b() {
            r1 = this;
            r1.<init>()
            r0 = 1
            byte[] r0 = new byte[r0]
            r1.g = r0
            r0 = 256(0x100, float:3.59E-43)
            byte[] r0 = new byte[r0]
            r1.h = r0
            return
    }

    public java.lang.String p(java.net.InetAddress r2) throws java.io.IOException {
            r1 = this;
            r0 = 13
            java.lang.String r2 = r1.q(r2, r0)
            return r2
    }

    public java.lang.String q(java.net.InetAddress r4, int r5) throws java.io.IOException {
            r3 = this;
            java.net.DatagramPacket r0 = new java.net.DatagramPacket
            byte[] r1 = r3.g
            int r2 = r1.length
            r0.<init>(r1, r2, r4, r5)
            java.net.DatagramPacket r4 = new java.net.DatagramPacket
            byte[] r5 = r3.h
            int r1 = r5.length
            r4.<init>(r5, r1)
            java.net.DatagramSocket r5 = r3.c
            r5.send(r0)
            java.net.DatagramSocket r5 = r3.c
            r5.receive(r4)
            java.lang.String r5 = new java.lang.String
            byte[] r0 = r4.getData()
            int r4 = r4.getLength()
            java.lang.String r1 = r3.c()
            r2 = 0
            r5.<init>(r0, r2, r4, r1)
            return r5
    }
}
