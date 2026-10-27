package y4;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class b extends org.apache.commons.net.a {
    public static final int j = 11;
    public static final int k = 15;
    public static final int l = 17;
    public static final int m = 19;
    public static final int n = 19;
    private final byte[] g;
    private final java.net.DatagramPacket h;
    private final java.net.DatagramPacket i;

    public b() {
            r3 = this;
            r3.<init>()
            r0 = 512(0x200, float:7.17E-43)
            byte[] r0 = new byte[r0]
            r3.g = r0
            java.net.DatagramPacket r1 = new java.net.DatagramPacket
            int r2 = r0.length
            r1.<init>(r0, r2)
            r3.h = r1
            java.net.DatagramPacket r0 = new java.net.DatagramPacket
            r1 = 0
            byte[] r2 = new byte[r1]
            r0.<init>(r2, r1)
            r3.i = r0
            return
    }

    public byte[] p() throws java.io.IOException {
            r4 = this;
            java.net.DatagramSocket r0 = r4.c
            java.net.DatagramPacket r1 = r4.h
            r0.receive(r1)
            java.net.DatagramPacket r0 = r4.h
            int r0 = r0.getLength()
            byte[] r1 = new byte[r0]
            byte[] r2 = r4.g
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r1, r3, r0)
            return r1
    }

    public void q(java.net.InetAddress r2) throws java.io.IOException {
            r1 = this;
            r0 = 19
            r1.r(r2, r0)
            return
    }

    public void r(java.net.InetAddress r2, int r3) throws java.io.IOException {
            r1 = this;
            java.net.DatagramPacket r0 = r1.i
            r0.setAddress(r2)
            java.net.DatagramPacket r2 = r1.i
            r2.setPort(r3)
            java.net.DatagramSocket r2 = r1.c
            java.net.DatagramPacket r3 = r1.i
            r2.send(r3)
            return
    }
}
