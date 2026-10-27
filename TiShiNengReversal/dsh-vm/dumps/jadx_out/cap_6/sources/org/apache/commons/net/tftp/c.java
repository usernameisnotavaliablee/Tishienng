package org.apache.commons.net.tftp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c extends org.apache.commons.net.tftp.a {
    public static final int v = 5;
    private int s;
    private long t;
    private long u;

    public c() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.t = r0
            r2.u = r0
            r0 = 5
            r2.s = r0
            return
    }

    public long A() {
            r2 = this;
            long r0 = r2.u
            return r0
    }

    public int B(java.lang.String r7, int r8, java.io.OutputStream r9, java.lang.String r10) throws java.net.UnknownHostException, java.io.IOException {
            r6 = this;
            java.net.InetAddress r4 = java.net.InetAddress.getByName(r10)
            r5 = 69
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            int r7 = r0.E(r1, r2, r3, r4, r5)
            return r7
    }

    public int C(java.lang.String r7, int r8, java.io.OutputStream r9, java.lang.String r10, int r11) throws java.net.UnknownHostException, java.io.IOException {
            r6 = this;
            java.net.InetAddress r4 = java.net.InetAddress.getByName(r10)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            int r7 = r0.E(r1, r2, r3, r4, r5)
            return r7
    }

    public int D(java.lang.String r7, int r8, java.io.OutputStream r9, java.net.InetAddress r10) throws java.io.IOException {
            r6 = this;
            r5 = 69
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            int r7 = r0.E(r1, r2, r3, r4, r5)
            return r7
    }

    public int E(java.lang.String r20, int r21, java.io.OutputStream r22, java.net.InetAddress r23, int r24) throws java.io.IOException {
            r19 = this;
            r1 = r19
            r0 = r21
            r2 = r23
            r3 = r24
            java.lang.String r4 = "Connection timed out."
            r5 = 0
            r1.t = r5
            if (r0 != 0) goto L18
            org.apache.commons.net.io.g r5 = new org.apache.commons.net.io.g
            r6 = r22
            r5.<init>(r6)
            goto L1b
        L18:
            r6 = r22
            r5 = r6
        L1b:
            org.apache.commons.net.tftp.g r6 = new org.apache.commons.net.tftp.g
            r7 = r20
            r6.<init>(r2, r3, r7, r0)
            org.apache.commons.net.tftp.b r7 = new org.apache.commons.net.tftp.b
            r8 = 0
            r7.<init>(r2, r3, r8)
            r1.p()
            r0 = 1
            r10 = 0
            r11 = 1
            r12 = 0
            r13 = 0
            r14 = 0
        L31:
            r1.r(r6)     // Catch: java.lang.Throwable -> L5c
            r15 = 1
            r16 = 0
        L37:
            org.apache.commons.net.tftp.f r17 = r1.q()     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L18d java.net.SocketException -> L192
            int r8 = r17.c()     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L18d java.net.SocketException -> L192
            java.net.InetAddress r9 = r17.b()     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L18d java.net.SocketException -> L192
            r22 = r0
            if (r22 == 0) goto La8
            if (r8 == r3) goto L73
            r7.g(r8)     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L6f java.net.SocketException -> L71
            boolean r10 = r2.equals(r9)     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L6f java.net.SocketException -> L71
            if (r10 != 0) goto L6c
            r7.f(r9)     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L62 java.net.SocketException -> L67
            r6.f(r9)     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L62 java.net.SocketException -> L67
            r10 = r8
            r3 = r9
        L5a:
            r2 = 0
            goto Lae
        L5c:
            r0 = move-exception
            goto L1f6
        L5f:
            r0 = move-exception
            goto L197
        L62:
            r10 = r8
            r2 = r9
        L64:
            r0 = 0
            goto L1b2
        L67:
            r10 = r8
            r2 = r9
        L69:
            r0 = 0
            goto L1c1
        L6c:
            r3 = r2
            r10 = r8
            goto L5a
        L6f:
            r10 = r8
            goto L64
        L71:
            r10 = r8
            goto L69
        L73:
            org.apache.commons.net.tftp.e r0 = new org.apache.commons.net.tftp.e     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> La2 java.net.SocketException -> La5
            r18 = r2
            java.lang.String r2 = "INCORRECT SOURCE PORT"
            r3 = 5
            r0.<init>(r9, r8, r3, r2)     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L9c java.net.SocketException -> L9f
            r1.r(r0)     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L9c java.net.SocketException -> L9f
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L9c java.net.SocketException -> L9f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L9c java.net.SocketException -> L9f
            r2.<init>()     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L9c java.net.SocketException -> L9f
            java.lang.String r3 = "Incorrect source port ("
            r2.append(r3)     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L9c java.net.SocketException -> L9f
            r2.append(r8)     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L9c java.net.SocketException -> L9f
            java.lang.String r3 = ") in request reply."
            r2.append(r3)     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L9c java.net.SocketException -> L9f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L9c java.net.SocketException -> L9f
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L9c java.net.SocketException -> L9f
            throw r0     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L9c java.net.SocketException -> L9f
        L9c:
            r2 = r18
            goto L64
        L9f:
            r2 = r18
            goto L69
        La2:
            r18 = r2
            goto L64
        La5:
            r18 = r2
            goto L69
        La8:
            r18 = r2
            r2 = r22
            r3 = r18
        Lae:
            boolean r0 = r3.equals(r9)     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L187 java.net.SocketException -> L18a
            if (r0 == 0) goto L163
            if (r8 != r10) goto L163
            int r0 = r17.getType()     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L14d java.net.SocketException -> L150
            r8 = 3
            if (r0 == r8) goto L111
            r9 = 5
            if (r0 == r9) goto Le8
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> Le0 java.net.SocketException -> Le4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> Le0 java.net.SocketException -> Le4
            r8.<init>()     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> Le0 java.net.SocketException -> Le4
            java.lang.String r9 = "Received unexpected packet type ("
            r8.append(r9)     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> Le0 java.net.SocketException -> Le4
            int r9 = r17.getType()     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> Le0 java.net.SocketException -> Le4
            r8.append(r9)     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> Le0 java.net.SocketException -> Le4
            java.lang.String r9 = ")"
            r8.append(r9)     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> Le0 java.net.SocketException -> Le4
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> Le0 java.net.SocketException -> Le4
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> Le0 java.net.SocketException -> Le4
            throw r0     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> Le0 java.net.SocketException -> Le4
        Le0:
            r0 = r2
            r2 = r3
            goto L1b2
        Le4:
            r0 = r2
            r2 = r3
            goto L1c1
        Le8:
            org.apache.commons.net.tftp.e r17 = (org.apache.commons.net.tftp.e) r17     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> Le0 java.net.SocketException -> Le4
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> Le0 java.net.SocketException -> Le4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> Le0 java.net.SocketException -> Le4
            r8.<init>()     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> Le0 java.net.SocketException -> Le4
            java.lang.String r9 = "Error code "
            r8.append(r9)     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> Le0 java.net.SocketException -> Le4
            int r9 = r17.h()     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> Le0 java.net.SocketException -> Le4
            r8.append(r9)     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> Le0 java.net.SocketException -> Le4
            java.lang.String r9 = " received: "
            r8.append(r9)     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> Le0 java.net.SocketException -> Le4
            java.lang.String r9 = r17.i()     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> Le0 java.net.SocketException -> Le4
            r8.append(r9)     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> Le0 java.net.SocketException -> Le4
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> Le0 java.net.SocketException -> Le4
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> Le0 java.net.SocketException -> Le4
            throw r0     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> Le0 java.net.SocketException -> Le4
        L111:
            org.apache.commons.net.tftp.d r17 = (org.apache.commons.net.tftp.d) r17     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L14d java.net.SocketException -> L150
            int r14 = r17.j()     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L14d java.net.SocketException -> L150
            int r13 = r17.h()     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L14d java.net.SocketException -> L150
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r13 != r11) goto L153
            byte[] r9 = r17.i()     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.IOException -> L134
            int r8 = r17.k()     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.IOException -> L134
            r5.write(r9, r8, r14)     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.IOException -> L134
            int r11 = r11 + 1
            if (r11 <= r0) goto L130
            r11 = 0
        L130:
            r17 = r2
        L132:
            r15 = 0
            goto L160
        L134:
            r0 = move-exception
            org.apache.commons.net.tftp.e r8 = new org.apache.commons.net.tftp.e     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L14d java.net.SocketException -> L150
            java.lang.String r9 = "File write failed."
            r17 = r2
            r2 = 3
            r8.<init>(r3, r10, r2, r9)     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L143 java.net.SocketException -> L148
            r1.r(r8)     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L143 java.net.SocketException -> L148
            throw r0     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L143 java.net.SocketException -> L148
        L143:
            r2 = r3
            r0 = r17
            goto L1b2
        L148:
            r2 = r3
            r0 = r17
            goto L1c1
        L14d:
            r17 = r2
            goto L143
        L150:
            r17 = r2
            goto L148
        L153:
            r17 = r2
            r1.s()     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L143 java.net.SocketException -> L148
            if (r11 != 0) goto L15b
            goto L15d
        L15b:
            int r0 = r11 + (-1)
        L15d:
            if (r13 != r0) goto L160
            goto L132
        L160:
            r18 = r3
            goto L172
        L163:
            r17 = r2
            org.apache.commons.net.tftp.e r0 = new org.apache.commons.net.tftp.e     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L181 java.net.SocketException -> L184
            java.lang.String r2 = "Unexpected host or port."
            r18 = r3
            r3 = 5
            r0.<init>(r9, r8, r3, r2)     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L177 java.net.SocketException -> L17c
            r1.r(r0)     // Catch: java.lang.Throwable -> L5c org.apache.commons.net.tftp.TFTPPacketException -> L5f java.io.InterruptedIOException -> L177 java.net.SocketException -> L17c
        L172:
            r0 = r17
            r2 = r18
            goto L1c8
        L177:
            r0 = r17
            r2 = r18
            goto L1b2
        L17c:
            r0 = r17
            r2 = r18
            goto L1c1
        L181:
            r18 = r3
            goto L177
        L184:
            r18 = r3
            goto L17c
        L187:
            r17 = r2
            goto L181
        L18a:
            r17 = r2
            goto L184
        L18d:
            r22 = r0
            r18 = r2
            goto L1b2
        L192:
            r22 = r0
            r18 = r2
            goto L1c1
        L197:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r3.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = "Bad packet: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L5c
            r3.append(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L5c
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L5c
            throw r2     // Catch: java.lang.Throwable -> L5c
        L1b2:
            int r3 = r16 + 1
            int r8 = r1.s     // Catch: java.lang.Throwable -> L5c
            if (r3 >= r8) goto L1bb
        L1b8:
            r16 = r3
            goto L1c8
        L1bb:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L5c
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L5c
            throw r0     // Catch: java.lang.Throwable -> L5c
        L1c1:
            int r3 = r16 + 1
            int r8 = r1.s     // Catch: java.lang.Throwable -> L5c
            if (r3 >= r8) goto L1f0
            goto L1b8
        L1c8:
            if (r15 != 0) goto L1e9
            r7.i(r13)     // Catch: java.lang.Throwable -> L5c
            int r12 = r12 + r14
            long r8 = r1.t     // Catch: java.lang.Throwable -> L5c
            r22 = r2
            long r2 = (long) r14     // Catch: java.lang.Throwable -> L5c
            long r8 = r8 + r2
            r1.t = r8     // Catch: java.lang.Throwable -> L5c
            r2 = 512(0x200, float:7.17E-43)
            if (r14 == r2) goto L1e1
            r1.r(r7)     // Catch: java.lang.Throwable -> L5c
            r1.t()
            return r12
        L1e1:
            r2 = r22
            r3 = r24
            r6 = r7
            r8 = 0
            goto L31
        L1e9:
            r22 = r2
            r3 = r24
            r8 = 0
            goto L37
        L1f0:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L5c
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L5c
            throw r0     // Catch: java.lang.Throwable -> L5c
        L1f6:
            r1.t()
            throw r0
    }

    public void F(java.lang.String r7, int r8, java.io.InputStream r9, java.lang.String r10) throws java.net.UnknownHostException, java.io.IOException {
            r6 = this;
            java.net.InetAddress r4 = java.net.InetAddress.getByName(r10)
            r5 = 69
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.I(r1, r2, r3, r4, r5)
            return
    }

    public void G(java.lang.String r7, int r8, java.io.InputStream r9, java.lang.String r10, int r11) throws java.net.UnknownHostException, java.io.IOException {
            r6 = this;
            java.net.InetAddress r4 = java.net.InetAddress.getByName(r10)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r0.I(r1, r2, r3, r4, r5)
            return
    }

    public void H(java.lang.String r7, int r8, java.io.InputStream r9, java.net.InetAddress r10) throws java.io.IOException {
            r6 = this;
            r5 = 69
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.I(r1, r2, r3, r4, r5)
            return
    }

    public void I(java.lang.String r18, int r19, java.io.InputStream r20, java.net.InetAddress r21, int r22) throws java.io.IOException {
            r17 = this;
            r1 = r17
            r0 = r19
            r4 = r22
            java.lang.String r9 = "Connection timed out."
            r2 = 0
            r1.u = r2
            if (r0 != 0) goto L17
            org.apache.commons.net.io.j r2 = new org.apache.commons.net.io.j
            r3 = r20
            r2.<init>(r3)
            r10 = r2
            goto L1a
        L17:
            r3 = r20
            r10 = r3
        L1a:
            org.apache.commons.net.tftp.i r11 = new org.apache.commons.net.tftp.i
            r2 = r18
            r3 = r21
            r11.<init>(r3, r4, r2, r0)
            org.apache.commons.net.tftp.d r2 = new org.apache.commons.net.tftp.d
            byte[] r6 = r1.j
            r7 = 4
            r8 = 0
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1.p()
            r5 = r21
            r6 = 1
            r7 = 0
            r8 = 0
            r12 = 0
        L36:
            r1.r(r11)     // Catch: java.lang.Throwable -> L5f
            r13 = 1
            r14 = 0
        L3b:
            org.apache.commons.net.tftp.f r16 = r1.q()     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L125 java.net.SocketException -> L132
            java.net.InetAddress r0 = r16.b()     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L125 java.net.SocketException -> L132
            int r3 = r16.c()     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L125 java.net.SocketException -> L132
            r15 = 5
            if (r6 == 0) goto L95
            if (r3 == r4) goto L6f
            r2.g(r3)     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L66 java.net.SocketException -> L6b
            boolean r6 = r5.equals(r0)     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L66 java.net.SocketException -> L6b
            if (r6 != 0) goto L5c
            r2.f(r0)     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L65 java.net.SocketException -> L6a
            r11.f(r0)     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L65 java.net.SocketException -> L6a
            r5 = r0
        L5c:
            r7 = r3
            r6 = 0
            goto L95
        L5f:
            r0 = move-exception
            goto L175
        L62:
            r0 = move-exception
            goto L10a
        L65:
            r5 = r0
        L66:
            r7 = r3
        L67:
            r6 = 0
            goto L125
        L6a:
            r5 = r0
        L6b:
            r7 = r3
        L6c:
            r6 = 0
            goto L132
        L6f:
            org.apache.commons.net.tftp.e r6 = new org.apache.commons.net.tftp.e     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L67 java.net.SocketException -> L6c
            java.lang.String r4 = "INCORRECT SOURCE PORT"
            r6.<init>(r0, r3, r15, r4)     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L67 java.net.SocketException -> L6c
            r1.r(r6)     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L67 java.net.SocketException -> L6c
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L67 java.net.SocketException -> L6c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L67 java.net.SocketException -> L6c
            r4.<init>()     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L67 java.net.SocketException -> L6c
            java.lang.String r6 = "Incorrect source port ("
            r4.append(r6)     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L67 java.net.SocketException -> L6c
            r4.append(r3)     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L67 java.net.SocketException -> L6c
            java.lang.String r3 = ") in request reply."
            r4.append(r3)     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L67 java.net.SocketException -> L6c
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L67 java.net.SocketException -> L6c
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L67 java.net.SocketException -> L6c
            throw r0     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L67 java.net.SocketException -> L6c
        L95:
            boolean r4 = r5.equals(r0)     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L104 java.net.SocketException -> L107
            if (r4 == 0) goto Lef
            if (r3 != r7) goto Lef
            int r0 = r16.getType()     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L125 java.net.SocketException -> L132
            r3 = 4
            if (r0 == r3) goto Ld7
            if (r0 == r15) goto Lae
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L125 java.net.SocketException -> L132
            java.lang.String r3 = "Received unexpected packet type."
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L125 java.net.SocketException -> L132
            throw r0     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L125 java.net.SocketException -> L132
        Lae:
            org.apache.commons.net.tftp.e r16 = (org.apache.commons.net.tftp.e) r16     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L125 java.net.SocketException -> L132
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L125 java.net.SocketException -> L132
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L125 java.net.SocketException -> L132
            r3.<init>()     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L125 java.net.SocketException -> L132
            java.lang.String r4 = "Error code "
            r3.append(r4)     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L125 java.net.SocketException -> L132
            int r4 = r16.h()     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L125 java.net.SocketException -> L132
            r3.append(r4)     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L125 java.net.SocketException -> L132
            java.lang.String r4 = " received: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L125 java.net.SocketException -> L132
            java.lang.String r4 = r16.i()     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L125 java.net.SocketException -> L132
            r3.append(r4)     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L125 java.net.SocketException -> L132
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L125 java.net.SocketException -> L132
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L125 java.net.SocketException -> L132
            throw r0     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L125 java.net.SocketException -> L132
        Ld7:
            org.apache.commons.net.tftp.b r16 = (org.apache.commons.net.tftp.b) r16     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L125 java.net.SocketException -> L132
            int r0 = r16.h()     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L125 java.net.SocketException -> L132
            if (r0 != r8) goto Le9
            int r8 = r8 + 1
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r8 <= r0) goto Le7
            r8 = 0
        Le7:
            r13 = 0
            goto Lec
        Le9:
            r1.s()     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L125 java.net.SocketException -> L132
        Lec:
            r16 = r5
            goto Lfb
        Lef:
            org.apache.commons.net.tftp.e r4 = new org.apache.commons.net.tftp.e     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> L104 java.net.SocketException -> L107
            r16 = r5
            java.lang.String r5 = "Unexpected host or port."
            r4.<init>(r0, r3, r15, r5)     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> Lfe java.net.SocketException -> L101
            r1.r(r4)     // Catch: java.lang.Throwable -> L5f org.apache.commons.net.tftp.TFTPPacketException -> L62 java.io.InterruptedIOException -> Lfe java.net.SocketException -> L101
        Lfb:
            r5 = r16
            goto L138
        Lfe:
            r5 = r16
            goto L125
        L101:
            r5 = r16
            goto L132
        L104:
            r16 = r5
            goto L125
        L107:
            r16 = r5
            goto L132
        L10a:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f
            r3.<init>()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r4 = "Bad packet: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L5f
            r3.append(r0)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L5f
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L5f
            throw r2     // Catch: java.lang.Throwable -> L5f
        L125:
            int r14 = r14 + 1
            int r0 = r1.s     // Catch: java.lang.Throwable -> L5f
            if (r14 >= r0) goto L12c
            goto L138
        L12c:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L5f
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L5f
            throw r0     // Catch: java.lang.Throwable -> L5f
        L132:
            int r14 = r14 + 1
            int r0 = r1.s     // Catch: java.lang.Throwable -> L5f
            if (r14 >= r0) goto L16f
        L138:
            if (r13 != 0) goto L16b
            if (r12 == 0) goto L140
            r1.t()
            return
        L140:
            r0 = 512(0x200, float:7.17E-43)
            r3 = 4
            r4 = 512(0x200, float:7.17E-43)
            r11 = 0
        L146:
            if (r4 <= 0) goto L154
            byte[] r13 = r1.j     // Catch: java.lang.Throwable -> L5f
            int r13 = r10.read(r13, r3, r4)     // Catch: java.lang.Throwable -> L5f
            if (r13 <= 0) goto L154
            int r3 = r3 + r13
            int r4 = r4 - r13
            int r11 = r11 + r13
            goto L146
        L154:
            if (r11 >= r0) goto L157
            r12 = 1
        L157:
            r2.l(r8)     // Catch: java.lang.Throwable -> L5f
            byte[] r0 = r1.j     // Catch: java.lang.Throwable -> L5f
            r3 = 4
            r2.m(r0, r3, r11)     // Catch: java.lang.Throwable -> L5f
            long r3 = r1.u     // Catch: java.lang.Throwable -> L5f
            long r13 = (long) r11     // Catch: java.lang.Throwable -> L5f
            long r3 = r3 + r13
            r1.u = r3     // Catch: java.lang.Throwable -> L5f
            r4 = r22
            r11 = r2
            goto L36
        L16b:
            r4 = r22
            goto L3b
        L16f:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L5f
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L5f
            throw r0     // Catch: java.lang.Throwable -> L5f
        L175:
            r1.t()
            throw r0
    }

    public void J(int r2) {
            r1 = this;
            r0 = 1
            if (r2 >= r0) goto L6
            r1.s = r0
            return
        L6:
            r1.s = r2
            return
    }

    public int y() {
            r1 = this;
            int r0 = r1.s
            return r0
    }

    public long z() {
            r2 = this;
            long r0 = r2.t
            return r0
    }
}
