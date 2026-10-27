package org.apache.commons.net.bsd;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a extends org.apache.commons.net.bsd.b {
    public static final int A = 1023;
    public static final int y = 514;
    public static final int z = 512;

    public a() {
            r1 = this;
            r1.<init>()
            r0 = 514(0x202, float:7.2E-43)
            r1.N(r0)
            return
    }

    @Override // org.apache.commons.net.bsd.b
    java.io.InputStream Z() throws java.io.IOException {
            r4 = this;
            r0 = 1023(0x3ff, float:1.434E-42)
        L2:
            r1 = 512(0x200, float:7.17E-43)
            if (r0 < r1) goto L15
            javax.net.ServerSocketFactory r1 = r4.k     // Catch: java.net.SocketException -> L12
            java.net.InetAddress r2 = r4.x()     // Catch: java.net.SocketException -> L12
            r3 = 1
            java.net.ServerSocket r0 = r1.createServerSocket(r0, r3, r2)     // Catch: java.net.SocketException -> L12
            goto L16
        L12:
            int r0 = r0 + (-1)
            goto L2
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L76
            java.io.OutputStream r1 = r4.i
            int r2 = r0.getLocalPort()
            java.lang.String r2 = java.lang.Integer.toString(r2)
            java.lang.String r3 = "UTF-8"
            byte[] r2 = r2.getBytes(r3)
            r1.write(r2)
            java.io.OutputStream r1 = r4.i
            r2 = 0
            r1.write(r2)
            java.io.OutputStream r1 = r4.i
            r1.flush()
            java.net.Socket r1 = r0.accept()
            r0.close()
            boolean r0 = r4.d0()
            if (r0 == 0) goto L6c
            boolean r0 = r4.Y(r1)
            if (r0 == 0) goto L4a
            goto L6c
        L4a:
            r1.close()
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Security violation: unexpected connection attempt by "
            r2.append(r3)
            java.net.InetAddress r1 = r1.getInetAddress()
            java.lang.String r1 = r1.getHostAddress()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L6c:
            org.apache.commons.net.io.h r0 = new org.apache.commons.net.io.h
            java.io.InputStream r2 = r1.getInputStream()
            r0.<init>(r1, r2)
            return r0
        L76:
            java.net.BindException r0 = new java.net.BindException
            java.lang.String r1 = "All ports in use."
            r0.<init>(r1)
            throw r0
    }

    @Override // org.apache.commons.net.g
    public void h(java.lang.String r2, int r3) throws java.net.SocketException, java.io.IOException, java.net.UnknownHostException {
            r1 = this;
            java.net.InetAddress r2 = java.net.InetAddress.getByName(r2)
            java.net.InetAddress r0 = java.net.InetAddress.getLocalHost()
            r1.i0(r2, r3, r0)
            return
    }

    public void h0(java.lang.String r1, int r2, java.net.InetAddress r3) throws java.net.SocketException, java.io.IOException {
            r0 = this;
            java.net.InetAddress r1 = java.net.InetAddress.getByName(r1)
            r0.i0(r1, r2, r3)
            return
    }

    @Override // org.apache.commons.net.g
    public void i(java.lang.String r2, int r3, java.net.InetAddress r4, int r5) throws java.net.SocketException, java.io.IOException, java.lang.IllegalArgumentException, java.net.UnknownHostException {
            r1 = this;
            r0 = 512(0x200, float:7.17E-43)
            if (r5 < r0) goto Lc
            r0 = 1023(0x3ff, float:1.434E-42)
            if (r5 > r0) goto Lc
            super.i(r2, r3, r4, r5)
            return
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Invalid port number "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public void i0(java.net.InetAddress r4, int r5, java.net.InetAddress r6) throws java.net.SocketException, java.net.BindException, java.io.IOException {
            r3 = this;
            r0 = 1023(0x3ff, float:1.434E-42)
        L2:
            r1 = 512(0x200, float:7.17E-43)
            if (r0 < r1) goto L12
            javax.net.SocketFactory r2 = r3.j     // Catch: java.lang.Throwable -> Lf
            java.net.Socket r2 = r2.createSocket(r4, r5, r6, r0)     // Catch: java.lang.Throwable -> Lf
            r3.e = r2     // Catch: java.lang.Throwable -> Lf
            goto L12
        Lf:
            int r0 = r0 + (-1)
            goto L2
        L12:
            if (r0 < r1) goto L18
            r3.b()
            return
        L18:
            java.net.BindException r4 = new java.net.BindException
            java.lang.String r5 = "All ports in use or insufficient permssion."
            r4.<init>(r5)
            throw r4
    }

    public void j0(java.lang.String r2, java.lang.String r3, java.lang.String r4) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.k0(r2, r3, r4, r0)
            return
    }

    @Override // org.apache.commons.net.g
    public void k(java.net.InetAddress r2, int r3) throws java.net.SocketException, java.io.IOException {
            r1 = this;
            java.net.InetAddress r0 = java.net.InetAddress.getLocalHost()
            r1.i0(r2, r3, r0)
            return
    }

    public void k0(java.lang.String r1, java.lang.String r2, java.lang.String r3, boolean r4) throws java.io.IOException {
            r0 = this;
            r0.f0(r1, r2, r3, r4)
            return
    }

    @Override // org.apache.commons.net.g
    public void l(java.net.InetAddress r2, int r3, java.net.InetAddress r4, int r5) throws java.net.SocketException, java.io.IOException, java.lang.IllegalArgumentException {
            r1 = this;
            r0 = 512(0x200, float:7.17E-43)
            if (r5 < r0) goto Lc
            r0 = 1023(0x3ff, float:1.434E-42)
            if (r5 > r0) goto Lc
            super.l(r2, r3, r4, r5)
            return
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Invalid port number "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }
}
