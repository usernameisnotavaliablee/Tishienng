package org.apache.commons.net;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class a {
    private static final org.apache.commons.net.b f = null;
    private java.nio.charset.Charset a;
    protected int b;
    protected java.net.DatagramSocket c;
    protected boolean d;
    protected org.apache.commons.net.b e;

    static {
            org.apache.commons.net.c r0 = new org.apache.commons.net.c
            r0.<init>()
            org.apache.commons.net.a.f = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            r1.a = r0
            r0 = 0
            r1.c = r0
            r0 = 0
            r1.b = r0
            r1.d = r0
            org.apache.commons.net.b r0 = org.apache.commons.net.a.f
            r1.e = r0
            return
    }

    public void a() {
            r1 = this;
            java.net.DatagramSocket r0 = r1.c
            if (r0 == 0) goto L7
            r0.close()
        L7:
            r0 = 0
            r1.c = r0
            r0 = 0
            r1.d = r0
            return
    }

    public java.nio.charset.Charset b() {
            r1 = this;
            java.nio.charset.Charset r0 = r1.a
            return r0
    }

    public java.lang.String c() {
            r1 = this;
            java.nio.charset.Charset r0 = r1.a
            java.lang.String r0 = r0.name()
            return r0
    }

    public int d() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public java.net.InetAddress e() {
            r1 = this;
            java.net.DatagramSocket r0 = r1.c
            java.net.InetAddress r0 = r0.getLocalAddress()
            return r0
    }

    public int f() {
            r1 = this;
            java.net.DatagramSocket r0 = r1.c
            int r0 = r0.getLocalPort()
            return r0
    }

    public int g() throws java.net.SocketException {
            r1 = this;
            java.net.DatagramSocket r0 = r1.c
            int r0 = r0.getSoTimeout()
            return r0
    }

    public boolean h() {
            r1 = this;
            boolean r0 = r1.d
            return r0
    }

    public void i() throws java.net.SocketException {
            r2 = this;
            org.apache.commons.net.b r0 = r2.e
            java.net.DatagramSocket r0 = r0.c()
            r2.c = r0
            int r1 = r2.b
            r0.setSoTimeout(r1)
            r0 = 1
            r2.d = r0
            return
    }

    public void j(int r2) throws java.net.SocketException {
            r1 = this;
            org.apache.commons.net.b r0 = r1.e
            java.net.DatagramSocket r2 = r0.b(r2)
            r1.c = r2
            int r0 = r1.b
            r2.setSoTimeout(r0)
            r2 = 1
            r1.d = r2
            return
    }

    public void k(int r2, java.net.InetAddress r3) throws java.net.SocketException {
            r1 = this;
            org.apache.commons.net.b r0 = r1.e
            java.net.DatagramSocket r2 = r0.a(r2, r3)
            r1.c = r2
            int r3 = r1.b
            r2.setSoTimeout(r3)
            r2 = 1
            r1.d = r2
            return
    }

    public void l(java.nio.charset.Charset r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void m(org.apache.commons.net.b r1) {
            r0 = this;
            if (r1 != 0) goto L7
            org.apache.commons.net.b r1 = org.apache.commons.net.a.f
            r0.e = r1
            return
        L7:
            r0.e = r1
            return
    }

    public void n(int r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void o(int r2) throws java.net.SocketException {
            r1 = this;
            java.net.DatagramSocket r0 = r1.c
            r0.setSoTimeout(r2)
            return
    }
}
