package org.apache.commons.net;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class g {

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String f55q = "\r\n";
    private static final javax.net.SocketFactory r = null;
    private static final javax.net.ServerSocketFactory s = null;
    private static final int t = 0;
    private org.apache.commons.net.ProtocolCommandSupport c;
    protected int d;
    protected java.net.Socket e;
    protected java.lang.String f;
    protected int g;
    protected java.io.InputStream h;
    protected java.io.OutputStream i;
    protected javax.net.SocketFactory j;
    protected javax.net.ServerSocketFactory k;
    protected int l;
    private int m;
    private int n;
    private java.net.Proxy o;
    private java.nio.charset.Charset p;

    static {
            javax.net.SocketFactory r0 = javax.net.SocketFactory.getDefault()
            org.apache.commons.net.g.r = r0
            javax.net.ServerSocketFactory r0 = javax.net.ServerSocketFactory.getDefault()
            org.apache.commons.net.g.s = r0
            return
    }

    public g() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.l = r0
            r1 = -1
            r2.m = r1
            r2.n = r1
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()
            r2.p = r1
            r1 = 0
            r2.e = r1
            r2.f = r1
            r2.h = r1
            r2.i = r1
            r2.d = r0
            r2.g = r0
            javax.net.SocketFactory r0 = org.apache.commons.net.g.r
            r2.j = r0
            javax.net.ServerSocketFactory r0 = org.apache.commons.net.g.s
            r2.k = r0
            return
    }

    private void a(java.net.InetAddress r4, int r5, java.net.InetAddress r6, int r7) throws java.net.SocketException, java.io.IOException {
            r3 = this;
            javax.net.SocketFactory r0 = r3.j
            java.net.Socket r0 = r0.createSocket()
            r3.e = r0
            int r1 = r3.m
            r2 = -1
            if (r1 == r2) goto L10
            r0.setReceiveBufferSize(r1)
        L10:
            int r0 = r3.n
            if (r0 == r2) goto L19
            java.net.Socket r1 = r3.e
            r1.setSendBufferSize(r0)
        L19:
            if (r6 == 0) goto L25
            java.net.Socket r0 = r3.e
            java.net.InetSocketAddress r1 = new java.net.InetSocketAddress
            r1.<init>(r6, r7)
            r0.bind(r1)
        L25:
            java.net.Socket r6 = r3.e
            java.net.InetSocketAddress r7 = new java.net.InetSocketAddress
            r7.<init>(r4, r5)
            int r4 = r3.l
            r6.connect(r7, r4)
            r3.b()
            return
    }

    private void e(java.io.Closeable r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.close()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    private void f(java.net.Socket r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.close()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    protected int A() {
            r1 = this;
            int r0 = r1.m
            return r0
    }

    public java.net.InetAddress B() {
            r1 = this;
            java.net.Socket r0 = r1.e
            java.net.InetAddress r0 = r0.getInetAddress()
            return r0
    }

    public int C() {
            r1 = this;
            java.net.Socket r0 = r1.e
            int r0 = r0.getPort()
            return r0
    }

    protected int D() {
            r1 = this;
            int r0 = r1.n
            return r0
    }

    public javax.net.ServerSocketFactory E() {
            r1 = this;
            javax.net.ServerSocketFactory r0 = r1.k
            return r0
    }

    public int F() throws java.net.SocketException {
            r1 = this;
            java.net.Socket r0 = r1.e
            int r0 = r0.getSoLinger()
            return r0
    }

    public int G() throws java.net.SocketException {
            r1 = this;
            java.net.Socket r0 = r1.e
            int r0 = r0.getSoTimeout()
            return r0
    }

    public boolean H() throws java.net.SocketException {
            r1 = this;
            java.net.Socket r0 = r1.e
            boolean r0 = r0.getTcpNoDelay()
            return r0
    }

    public boolean I() {
            r2 = this;
            boolean r0 = r2.J()
            r1 = 0
            if (r0 == 0) goto L49
            java.net.Socket r0 = r2.e     // Catch: java.io.IOException -> L49
            java.net.InetAddress r0 = r0.getInetAddress()     // Catch: java.io.IOException -> L49
            if (r0 != 0) goto L10
            return r1
        L10:
            java.net.Socket r0 = r2.e     // Catch: java.io.IOException -> L49
            int r0 = r0.getPort()     // Catch: java.io.IOException -> L49
            if (r0 != 0) goto L19
            return r1
        L19:
            java.net.Socket r0 = r2.e     // Catch: java.io.IOException -> L49
            java.net.SocketAddress r0 = r0.getRemoteSocketAddress()     // Catch: java.io.IOException -> L49
            if (r0 != 0) goto L22
            return r1
        L22:
            java.net.Socket r0 = r2.e     // Catch: java.io.IOException -> L49
            boolean r0 = r0.isClosed()     // Catch: java.io.IOException -> L49
            if (r0 == 0) goto L2b
            return r1
        L2b:
            java.net.Socket r0 = r2.e     // Catch: java.io.IOException -> L49
            boolean r0 = r0.isInputShutdown()     // Catch: java.io.IOException -> L49
            if (r0 == 0) goto L34
            return r1
        L34:
            java.net.Socket r0 = r2.e     // Catch: java.io.IOException -> L49
            boolean r0 = r0.isOutputShutdown()     // Catch: java.io.IOException -> L49
            if (r0 == 0) goto L3d
            return r1
        L3d:
            java.net.Socket r0 = r2.e     // Catch: java.io.IOException -> L49
            r0.getInputStream()     // Catch: java.io.IOException -> L49
            java.net.Socket r0 = r2.e     // Catch: java.io.IOException -> L49
            r0.getOutputStream()     // Catch: java.io.IOException -> L49
            r0 = 1
            return r0
        L49:
            return r1
    }

    public boolean J() {
            r1 = this;
            java.net.Socket r0 = r1.e
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.isConnected()
            return r0
    }

    public void K(org.apache.commons.net.f r2) {
            r1 = this;
            org.apache.commons.net.ProtocolCommandSupport r0 = r1.s()
            r0.removeProtocolCommandListener(r2)
            return
    }

    public void L(java.nio.charset.Charset r1) {
            r0 = this;
            r0.p = r1
            return
    }

    public void M(int r1) {
            r0 = this;
            r0.l = r1
            return
    }

    public void N(int r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void O(int r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public void P(boolean r2) throws java.net.SocketException {
            r1 = this;
            java.net.Socket r0 = r1.e
            r0.setKeepAlive(r2)
            return
    }

    public void Q(java.net.Proxy r2) {
            r1 = this;
            org.apache.commons.net.d r0 = new org.apache.commons.net.d
            r0.<init>(r2)
            r1.W(r0)
            r1.o = r2
            return
    }

    public void R(int r1) throws java.net.SocketException {
            r0 = this;
            r0.m = r1
            return
    }

    public void S(int r1) throws java.net.SocketException {
            r0 = this;
            r0.n = r1
            return
    }

    public void T(javax.net.ServerSocketFactory r1) {
            r0 = this;
            if (r1 != 0) goto L7
            javax.net.ServerSocketFactory r1 = org.apache.commons.net.g.s
            r0.k = r1
            return
        L7:
            r0.k = r1
            return
    }

    public void U(boolean r2, int r3) throws java.net.SocketException {
            r1 = this;
            java.net.Socket r0 = r1.e
            r0.setSoLinger(r2, r3)
            return
    }

    public void V(int r2) throws java.net.SocketException {
            r1 = this;
            java.net.Socket r0 = r1.e
            r0.setSoTimeout(r2)
            return
    }

    public void W(javax.net.SocketFactory r1) {
            r0 = this;
            if (r1 != 0) goto L7
            javax.net.SocketFactory r1 = org.apache.commons.net.g.r
            r0.j = r1
            goto L9
        L7:
            r0.j = r1
        L9:
            r1 = 0
            r0.o = r1
            return
    }

    public void X(boolean r2) throws java.net.SocketException {
            r1 = this;
            java.net.Socket r0 = r1.e
            r0.setTcpNoDelay(r2)
            return
    }

    public boolean Y(java.net.Socket r2) {
            r1 = this;
            java.net.InetAddress r2 = r2.getInetAddress()
            java.net.InetAddress r0 = r1.B()
            boolean r2 = r2.equals(r0)
            return r2
    }

    protected void b() throws java.io.IOException {
            r2 = this;
            java.net.Socket r0 = r2.e
            int r1 = r2.d
            r0.setSoTimeout(r1)
            java.net.Socket r0 = r2.e
            java.io.InputStream r0 = r0.getInputStream()
            r2.h = r0
            java.net.Socket r0 = r2.e
            java.io.OutputStream r0 = r0.getOutputStream()
            r2.i = r0
            return
    }

    public void d(org.apache.commons.net.f r2) {
            r1 = this;
            org.apache.commons.net.ProtocolCommandSupport r0 = r1.s()
            r0.addProtocolCommandListener(r2)
            return
    }

    public void g(java.lang.String r2) throws java.net.SocketException, java.io.IOException {
            r1 = this;
            int r0 = r1.g
            r1.h(r2, r0)
            return
    }

    public void h(java.lang.String r3, int r4) throws java.net.SocketException, java.io.IOException {
            r2 = this;
            r2.f = r3
            java.net.InetAddress r3 = java.net.InetAddress.getByName(r3)
            r0 = 0
            r1 = -1
            r2.a(r3, r4, r0, r1)
            return
    }

    public void i(java.lang.String r1, int r2, java.net.InetAddress r3, int r4) throws java.net.SocketException, java.io.IOException {
            r0 = this;
            r0.f = r1
            java.net.InetAddress r1 = java.net.InetAddress.getByName(r1)
            r0.a(r1, r2, r3, r4)
            return
    }

    public void j(java.net.InetAddress r2) throws java.net.SocketException, java.io.IOException {
            r1 = this;
            r0 = 0
            r1.f = r0
            int r0 = r1.g
            r1.k(r2, r0)
            return
    }

    public void k(java.net.InetAddress r3, int r4) throws java.net.SocketException, java.io.IOException {
            r2 = this;
            r0 = 0
            r2.f = r0
            r1 = -1
            r2.a(r3, r4, r0, r1)
            return
    }

    public void l(java.net.InetAddress r2, int r3, java.net.InetAddress r4, int r5) throws java.net.SocketException, java.io.IOException {
            r1 = this;
            r0 = 0
            r1.f = r0
            r1.a(r2, r3, r4, r5)
            return
    }

    protected void m() {
            r1 = this;
            org.apache.commons.net.ProtocolCommandSupport r0 = new org.apache.commons.net.ProtocolCommandSupport
            r0.<init>(r1)
            r1.c = r0
            return
    }

    public void n() throws java.io.IOException {
            r1 = this;
            java.net.Socket r0 = r1.e
            r1.f(r0)
            java.io.InputStream r0 = r1.h
            r1.e(r0)
            java.io.OutputStream r0 = r1.i
            r1.e(r0)
            r0 = 0
            r1.e = r0
            r1.f = r0
            r1.h = r0
            r1.i = r0
            return
    }

    protected void o(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            org.apache.commons.net.ProtocolCommandSupport r0 = r1.s()
            int r0 = r0.getListenerCount()
            if (r0 <= 0) goto L11
            org.apache.commons.net.ProtocolCommandSupport r0 = r1.s()
            r0.fireCommandSent(r2, r3)
        L11:
            return
    }

    protected void p(int r2, java.lang.String r3) {
            r1 = this;
            org.apache.commons.net.ProtocolCommandSupport r0 = r1.s()
            int r0 = r0.getListenerCount()
            if (r0 <= 0) goto L11
            org.apache.commons.net.ProtocolCommandSupport r0 = r1.s()
            r0.fireReplyReceived(r2, r3)
        L11:
            return
    }

    public java.nio.charset.Charset q() {
            r1 = this;
            java.nio.charset.Charset r0 = r1.p
            return r0
    }

    @java.lang.Deprecated
    public java.lang.String r() {
            r1 = this;
            java.nio.charset.Charset r0 = r1.p
            java.lang.String r0 = r0.name()
            return r0
    }

    protected org.apache.commons.net.ProtocolCommandSupport s() {
            r1 = this;
            org.apache.commons.net.ProtocolCommandSupport r0 = r1.c
            return r0
    }

    public int t() {
            r1 = this;
            int r0 = r1.l
            return r0
    }

    public int u() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    public int v() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    public boolean w() throws java.net.SocketException {
            r1 = this;
            java.net.Socket r0 = r1.e
            boolean r0 = r0.getKeepAlive()
            return r0
    }

    public java.net.InetAddress x() {
            r1 = this;
            java.net.Socket r0 = r1.e
            java.net.InetAddress r0 = r0.getLocalAddress()
            return r0
    }

    public int y() {
            r1 = this;
            java.net.Socket r0 = r1.e
            int r0 = r0.getLocalPort()
            return r0
    }

    public java.net.Proxy z() {
            r1 = this;
            java.net.Proxy r0 = r1.o
            return r0
    }
}
