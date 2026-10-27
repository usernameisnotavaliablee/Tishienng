package org.apache.commons.net.tftp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class g extends org.apache.commons.net.tftp.h {
    g(java.net.DatagramPacket r2) throws org.apache.commons.net.tftp.TFTPPacketException {
            r1 = this;
            r0 = 1
            r1.<init>(r0, r2)
            return
    }

    public g(java.net.InetAddress r7, int r8, java.lang.String r9, int r10) {
            r6 = this;
            r3 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // org.apache.commons.net.tftp.f
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = " RRQ "
            r0.append(r1)
            java.lang.String r1 = r2.h()
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            int r1 = r2.i()
            java.lang.String r1 = org.apache.commons.net.tftp.a.u(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
