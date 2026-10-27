package org.apache.commons.net.tftp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class h extends org.apache.commons.net.tftp.f {
    static final java.lang.String[] m = null;
    private static final byte[][] n = null;
    private final int k;
    private final java.lang.String l;

    static {
            java.lang.String r0 = "netascii"
            java.lang.String r1 = "octet"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            org.apache.commons.net.tftp.h.m = r0
            r0 = 9
            byte[] r0 = new byte[r0]
            r0 = {x0024: FILL_ARRAY_DATA , data: [110, 101, 116, 97, 115, 99, 105, 105, 0} // fill-array
            r1 = 6
            byte[] r1 = new byte[r1]
            r1 = {x002e: FILL_ARRAY_DATA , data: [111, 99, 116, 101, 116, 0} // fill-array
            r2 = 2
            byte[][] r2 = new byte[r2][]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            org.apache.commons.net.tftp.h.n = r2
            return
    }

    h(int r5, java.net.DatagramPacket r6) throws org.apache.commons.net.tftp.TFTPPacketException {
            r4 = this;
            java.net.InetAddress r0 = r6.getAddress()
            int r1 = r6.getPort()
            r4.<init>(r5, r0, r1)
            byte[] r5 = r6.getData()
            int r0 = r4.getType()
            r1 = 1
            r2 = r5[r1]
            if (r0 != r2) goto L8c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r6 = r6.getLength()
            r2 = 2
        L22:
            if (r2 >= r6) goto L2f
            r3 = r5[r2]
            if (r3 == 0) goto L2f
            char r3 = (char) r3
            r0.append(r3)
            int r2 = r2 + 1
            goto L22
        L2f:
            java.lang.String r3 = r0.toString()
            r4.l = r3
            if (r2 >= r6) goto L84
            r3 = 0
            r0.setLength(r3)
            int r2 = r2 + r1
        L3c:
            if (r2 >= r6) goto L49
            r1 = r5[r2]
            if (r1 == 0) goto L49
            char r1 = (char) r1
            r0.append(r1)
            int r2 = r2 + 1
            goto L3c
        L49:
            java.lang.String r5 = r0.toString()
            java.util.Locale r6 = java.util.Locale.ENGLISH
            java.lang.String r5 = r5.toLowerCase(r6)
            java.lang.String[] r6 = org.apache.commons.net.tftp.h.m
            int r6 = r6.length
            r0 = 0
        L57:
            if (r0 >= r6) goto L68
            java.lang.String[] r1 = org.apache.commons.net.tftp.h.m
            r1 = r1[r0]
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L65
            r3 = r0
            goto L68
        L65:
            int r0 = r0 + 1
            goto L57
        L68:
            r4.k = r3
            if (r0 >= r6) goto L6d
            return
        L6d:
            org.apache.commons.net.tftp.TFTPPacketException r6 = new org.apache.commons.net.tftp.TFTPPacketException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unrecognized TFTP transfer mode: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L84:
            org.apache.commons.net.tftp.TFTPPacketException r5 = new org.apache.commons.net.tftp.TFTPPacketException
            java.lang.String r6 = "Bad filename and mode format."
            r5.<init>(r6)
            throw r5
        L8c:
            org.apache.commons.net.tftp.TFTPPacketException r5 = new org.apache.commons.net.tftp.TFTPPacketException
            java.lang.String r6 = "TFTP operator code does not match type."
            r5.<init>(r6)
            throw r5
    }

    h(java.net.InetAddress r1, int r2, int r3, java.lang.String r4, int r5) {
            r0 = this;
            r0.<init>(r3, r1, r2)
            r0.l = r4
            r0.k = r5
            return
    }

    @Override // org.apache.commons.net.tftp.f
    final java.net.DatagramPacket a(java.net.DatagramPacket r7, byte[] r8) {
            r6 = this;
            java.lang.String r0 = r6.l
            int r0 = r0.length()
            byte[][] r1 = org.apache.commons.net.tftp.h.n
            int r2 = r6.k
            r2 = r1[r2]
            int r2 = r2.length
            r3 = 0
            r8[r3] = r3
            int r4 = r6.a
            byte r4 = (byte) r4
            r5 = 1
            r8[r5] = r4
            java.lang.String r4 = r6.l
            byte[] r4 = r4.getBytes()
            r5 = 2
            java.lang.System.arraycopy(r4, r3, r8, r5, r0)
            int r4 = r0 + 2
            r8[r4] = r3
            int r4 = r6.k
            r1 = r1[r4]
            int r4 = r0 + 3
            java.lang.System.arraycopy(r1, r3, r8, r4, r2)
            java.net.InetAddress r1 = r6.c
            r7.setAddress(r1)
            int r1 = r6.b
            r7.setPort(r1)
            r7.setData(r8)
            int r0 = r0 + r2
            int r0 = r0 + 3
            r7.setLength(r0)
            return r7
    }

    @Override // org.apache.commons.net.tftp.f
    public final java.net.DatagramPacket d() {
            r8 = this;
            java.lang.String r0 = r8.l
            int r0 = r0.length()
            byte[][] r1 = org.apache.commons.net.tftp.h.n
            int r2 = r8.k
            r2 = r1[r2]
            int r2 = r2.length
            int r3 = r0 + r2
            int r3 = r3 + 4
            byte[] r4 = new byte[r3]
            r5 = 0
            r4[r5] = r5
            int r6 = r8.a
            byte r6 = (byte) r6
            r7 = 1
            r4[r7] = r6
            java.lang.String r6 = r8.l
            byte[] r6 = r6.getBytes()
            r7 = 2
            java.lang.System.arraycopy(r6, r5, r4, r7, r0)
            int r6 = r0 + 2
            r4[r6] = r5
            int r6 = r8.k
            r1 = r1[r6]
            int r0 = r0 + 3
            java.lang.System.arraycopy(r1, r5, r4, r0, r2)
            java.net.DatagramPacket r0 = new java.net.DatagramPacket
            java.net.InetAddress r1 = r8.c
            int r2 = r8.b
            r0.<init>(r4, r3, r1, r2)
            return r0
    }

    public final java.lang.String h() {
            r1 = this;
            java.lang.String r0 = r1.l
            return r0
    }

    public final int i() {
            r1 = this;
            int r0 = r1.k
            return r0
    }
}
