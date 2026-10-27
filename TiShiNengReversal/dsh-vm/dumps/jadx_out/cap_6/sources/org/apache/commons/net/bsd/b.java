package org.apache.commons.net.bsd;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b extends org.apache.commons.net.g {
    protected static final char w = 0;
    public static final int x = 512;
    private boolean u;
    protected java.io.InputStream v;

    public b() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.v = r0
            r0 = 512(0x200, float:7.17E-43)
            r1.N(r0)
            return
    }

    java.io.InputStream Z() throws java.io.IOException {
            r5 = this;
            javax.net.ServerSocketFactory r0 = r5.k
            r1 = 1
            java.net.InetAddress r2 = r5.x()
            r3 = 0
            java.net.ServerSocket r0 = r0.createServerSocket(r3, r1, r2)
            java.io.OutputStream r1 = r5.i
            int r2 = r0.getLocalPort()
            java.lang.String r2 = java.lang.Integer.toString(r2)
            java.lang.String r4 = "UTF-8"
            byte[] r2 = r2.getBytes(r4)
            r1.write(r2)
            java.io.OutputStream r1 = r5.i
            r1.write(r3)
            java.io.OutputStream r1 = r5.i
            r1.flush()
            java.net.Socket r1 = r0.accept()
            r0.close()
            boolean r0 = r5.u
            if (r0 == 0) goto L5d
            boolean r0 = r5.Y(r1)
            if (r0 == 0) goto L3b
            goto L5d
        L3b:
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
        L5d:
            org.apache.commons.net.io.h r0 = new org.apache.commons.net.io.h
            java.io.InputStream r2 = r1.getInputStream()
            r0.<init>(r1, r2)
            return r0
    }

    public java.io.InputStream a0() {
            r1 = this;
            java.io.InputStream r0 = r1.v
            return r0
    }

    public java.io.InputStream b0() {
            r1 = this;
            java.io.InputStream r0 = r1.h
            return r0
    }

    public java.io.OutputStream c0() {
            r1 = this;
            java.io.OutputStream r0 = r1.i
            return r0
    }

    public final boolean d0() {
            r1 = this;
            boolean r0 = r1.u
            return r0
    }

    public void e0(java.lang.String r2, java.lang.String r3, java.lang.String r4) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.f0(r2, r3, r4, r0)
            return
    }

    public void f0(java.lang.String r3, java.lang.String r4, java.lang.String r5, boolean r6) throws java.io.IOException {
            r2 = this;
            r0 = 0
            if (r6 == 0) goto La
            java.io.InputStream r6 = r2.Z()
            r2.v = r6
            goto Lf
        La:
            java.io.OutputStream r6 = r2.i
            r6.write(r0)
        Lf:
            java.io.OutputStream r6 = r2.i
            java.nio.charset.Charset r1 = r2.q()
            byte[] r3 = r3.getBytes(r1)
            r6.write(r3)
            java.io.OutputStream r3 = r2.i
            r3.write(r0)
            java.io.OutputStream r3 = r2.i
            java.nio.charset.Charset r6 = r2.q()
            byte[] r4 = r4.getBytes(r6)
            r3.write(r4)
            java.io.OutputStream r3 = r2.i
            r3.write(r0)
            java.io.OutputStream r3 = r2.i
            java.nio.charset.Charset r4 = r2.q()
            byte[] r4 = r5.getBytes(r4)
            r3.write(r4)
            java.io.OutputStream r3 = r2.i
            r3.write(r0)
            java.io.OutputStream r3 = r2.i
            r3.flush()
            java.io.InputStream r3 = r2.h
            int r3 = r3.read()
            if (r3 <= 0) goto L73
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L57:
            java.io.InputStream r4 = r2.h
            int r4 = r4.read()
            r5 = -1
            if (r4 == r5) goto L69
            r5 = 10
            if (r4 == r5) goto L69
            char r4 = (char) r4
            r3.append(r4)
            goto L57
        L69:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L73:
            if (r3 < 0) goto L76
            return
        L76:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "Server closed connection."
            r3.<init>(r4)
            throw r3
    }

    public final void g0(boolean r1) {
            r0 = this;
            r0.u = r1
            return
    }

    @Override // org.apache.commons.net.g
    public void n() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.v
            if (r0 == 0) goto L7
            r0.close()
        L7:
            r0 = 0
            r1.v = r0
            super.n()
            return
    }
}
