package org.apache.commons.net.tftp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class e extends org.apache.commons.net.tftp.f {
    public static final int m = 0;
    public static final int n = 1;
    public static final int o = 2;
    public static final int p = 3;

    /* renamed from: q, reason: collision with root package name */
    public static final int f65q = 4;
    public static final int r = 5;
    public static final int s = 6;
    public static final int t = 7;
    int k;
    java.lang.String l;

    e(java.net.DatagramPacket r5) throws org.apache.commons.net.tftp.TFTPPacketException {
            r4 = this;
            java.net.InetAddress r0 = r5.getAddress()
            int r1 = r5.getPort()
            r2 = 5
            r4.<init>(r2, r0, r1)
            byte[] r0 = r5.getData()
            int r5 = r5.getLength()
            int r1 = r4.getType()
            r3 = 1
            r3 = r0[r3]
            if (r1 != r3) goto L50
            r1 = 2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r3 = 3
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r1 = r1 | r3
            r4.k = r1
            if (r5 < r2) goto L48
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 4
        L34:
            if (r2 >= r5) goto L41
            r3 = r0[r2]
            if (r3 == 0) goto L41
            char r3 = (char) r3
            r1.append(r3)
            int r2 = r2 + 1
            goto L34
        L41:
            java.lang.String r5 = r1.toString()
            r4.l = r5
            return
        L48:
            org.apache.commons.net.tftp.TFTPPacketException r5 = new org.apache.commons.net.tftp.TFTPPacketException
            java.lang.String r0 = "Bad error packet. No message."
            r5.<init>(r0)
            throw r5
        L50:
            org.apache.commons.net.tftp.TFTPPacketException r5 = new org.apache.commons.net.tftp.TFTPPacketException
            java.lang.String r0 = "TFTP operator code does not match type."
            r5.<init>(r0)
            throw r5
    }

    public e(java.net.InetAddress r2, int r3, int r4, java.lang.String r5) {
            r1 = this;
            r0 = 5
            r1.<init>(r0, r2, r3)
            r1.k = r4
            r1.l = r5
            return
    }

    @Override // org.apache.commons.net.tftp.f
    java.net.DatagramPacket a(java.net.DatagramPacket r6, byte[] r7) {
            r5 = this;
            java.lang.String r0 = r5.l
            int r0 = r0.length()
            r1 = 0
            r7[r1] = r1
            int r2 = r5.a
            byte r2 = (byte) r2
            r3 = 1
            r7[r3] = r2
            int r2 = r5.k
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            int r3 = r3 >> 8
            byte r3 = (byte) r3
            r4 = 2
            r7[r4] = r3
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3 = 3
            r7[r3] = r2
            java.lang.String r2 = r5.l
            byte[] r2 = r2.getBytes()
            r3 = 4
            java.lang.System.arraycopy(r2, r1, r7, r3, r0)
            int r0 = r0 + r3
            r7[r0] = r1
            java.net.InetAddress r1 = r5.c
            r6.setAddress(r1)
            int r1 = r5.b
            r6.setPort(r1)
            r6.setData(r7)
            r6.setLength(r0)
            return r6
    }

    @Override // org.apache.commons.net.tftp.f
    public java.net.DatagramPacket d() {
            r7 = this;
            java.lang.String r0 = r7.l
            int r0 = r0.length()
            int r1 = r0 + 5
            byte[] r2 = new byte[r1]
            r3 = 0
            r2[r3] = r3
            int r4 = r7.a
            byte r4 = (byte) r4
            r5 = 1
            r2[r5] = r4
            int r4 = r7.k
            r5 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r4
            int r5 = r5 >> 8
            byte r5 = (byte) r5
            r6 = 2
            r2[r6] = r5
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r5 = 3
            r2[r5] = r4
            java.lang.String r4 = r7.l
            byte[] r4 = r4.getBytes()
            r5 = 4
            java.lang.System.arraycopy(r4, r3, r2, r5, r0)
            int r0 = r0 + r5
            r2[r0] = r3
            java.net.DatagramPacket r0 = new java.net.DatagramPacket
            java.net.InetAddress r3 = r7.c
            int r4 = r7.b
            r0.<init>(r2, r1, r3, r4)
            return r0
    }

    public int h() {
            r1 = this;
            int r0 = r1.k
            return r0
    }

    public java.lang.String i() {
            r1 = this;
            java.lang.String r0 = r1.l
            return r0
    }

    @Override // org.apache.commons.net.tftp.f
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = " ERR "
            r0.append(r1)
            int r1 = r2.k
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = r2.l
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
