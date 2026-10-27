package a5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends org.apache.commons.net.discard.b {
    public static final int j = 7;
    private final java.net.DatagramPacket i;

    public b() {
            r3 = this;
            r3.<init>()
            java.net.DatagramPacket r0 = new java.net.DatagramPacket
            r1 = 0
            byte[] r2 = new byte[r1]
            r0.<init>(r2, r1)
            r3.i = r0
            return
    }

    public void p(byte[] r2, int r3, java.net.InetAddress r4) throws java.io.IOException {
            r1 = this;
            r0 = 7
            r1.q(r2, r3, r4, r0)
            return
    }

    public void r(byte[] r3, java.net.InetAddress r4) throws java.io.IOException {
            r2 = this;
            int r0 = r3.length
            r1 = 7
            r2.q(r3, r0, r4, r1)
            return
    }

    public int s(byte[] r2) throws java.io.IOException {
            r1 = this;
            int r0 = r2.length
            int r2 = r1.t(r2, r0)
            return r2
    }

    public int t(byte[] r2, int r3) throws java.io.IOException {
            r1 = this;
            java.net.DatagramPacket r0 = r1.i
            r0.setData(r2)
            java.net.DatagramPacket r2 = r1.i
            r2.setLength(r3)
            java.net.DatagramSocket r2 = r1.c
            java.net.DatagramPacket r3 = r1.i
            r2.receive(r3)
            java.net.DatagramPacket r2 = r1.i
            int r2 = r2.getLength()
            return r2
    }
}
