package org.apache.commons.net.ntp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class a extends org.apache.commons.net.a {
    public static final int h = 123;
    private int g;

    public a() {
            r1 = this;
            r1.<init>()
            r0 = 3
            r1.g = r0
            return
    }

    public org.apache.commons.net.ntp.e p(java.net.InetAddress r2) throws java.io.IOException {
            r1 = this;
            r0 = 123(0x7b, float:1.72E-43)
            org.apache.commons.net.ntp.e r2 = r1.q(r2, r0)
            return r2
    }

    public org.apache.commons.net.ntp.e q(java.net.InetAddress r4, int r5) throws java.io.IOException {
            r3 = this;
            boolean r0 = r3.h()
            if (r0 != 0) goto L9
            r3.i()
        L9:
            org.apache.commons.net.ntp.c r0 = new org.apache.commons.net.ntp.c
            r0.<init>()
            r1 = 3
            r0.o(r1)
            int r1 = r3.g
            r0.setVersion(r1)
            java.net.DatagramPacket r1 = r0.s()
            r1.setAddress(r4)
            r1.setPort(r5)
            org.apache.commons.net.ntp.c r4 = new org.apache.commons.net.ntp.c
            r4.<init>()
            java.net.DatagramPacket r5 = r4.s()
            org.apache.commons.net.ntp.TimeStamp r2 = org.apache.commons.net.ntp.TimeStamp.getCurrentTime()
            r0.w(r2)
            java.net.DatagramSocket r0 = r3.c
            r0.send(r1)
            java.net.DatagramSocket r0 = r3.c
            r0.receive(r5)
            long r0 = java.lang.System.currentTimeMillis()
            org.apache.commons.net.ntp.e r5 = new org.apache.commons.net.ntp.e
            r2 = 0
            r5.<init>(r4, r0, r2)
            return r5
    }

    public int r() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    public void s(int r1) {
            r0 = this;
            r0.g = r1
            return
    }
}
