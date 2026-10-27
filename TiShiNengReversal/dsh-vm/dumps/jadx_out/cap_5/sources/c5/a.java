package c5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends org.apache.commons.net.g {
    public static final int u = 37;
    public static final long v = 2208988800L;

    public a() {
            r1 = this;
            r1.<init>()
            r0 = 37
            r1.N(r0)
            return
    }

    public java.util.Date Z() throws java.io.IOException {
            r5 = this;
            java.util.Date r0 = new java.util.Date
            long r1 = r5.a0()
            r3 = 2208988800(0x83aa7e80, double:1.091385478E-314)
            long r1 = r1 - r3
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            r0.<init>(r1)
            return r0
    }

    public long a0() throws java.io.IOException {
            r4 = this;
            java.io.DataInputStream r0 = new java.io.DataInputStream
            java.io.InputStream r1 = r4.h
            r0.<init>(r1)
            int r0 = r0.readInt()
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }
}
