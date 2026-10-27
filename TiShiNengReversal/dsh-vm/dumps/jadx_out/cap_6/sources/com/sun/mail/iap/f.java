package com.sun.mail.iap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class f {
    private static final byte[] p = null;
    protected java.lang.String a;
    private java.net.Socket b;
    protected boolean c;
    protected boolean d;
    protected java.io.PrintStream e;
    protected java.util.Properties f;
    protected java.lang.String g;
    private boolean h;
    private com.sun.mail.util.TraceInputStream i;
    private volatile com.sun.mail.iap.i j;
    private com.sun.mail.util.TraceOutputStream k;
    private volatile java.io.DataOutputStream l;
    private int m;
    private volatile java.util.Vector n;
    private volatile long o;

    static {
            r0 = 2
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [13, 10} // fill-array
            com.sun.mail.iap.f.p = r0
            return
    }

    public f(java.io.InputStream r3, java.io.OutputStream r4, boolean r5) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.h = r0
            r2.m = r0
            r1 = 0
            r2.n = r1
            java.lang.String r1 = "localhost"
            r2.a = r1
            r2.c = r5
            r2.d = r0
            java.io.PrintStream r0 = java.lang.System.out
            r2.e = r0
            com.sun.mail.util.TraceInputStream r0 = new com.sun.mail.util.TraceInputStream
            java.io.PrintStream r1 = java.lang.System.out
            r0.<init>(r3, r1)
            r2.i = r0
            r0.setTrace(r5)
            com.sun.mail.util.TraceInputStream r3 = r2.i
            boolean r0 = r2.d
            r3.setQuote(r0)
            com.sun.mail.iap.i r3 = new com.sun.mail.iap.i
            com.sun.mail.util.TraceInputStream r0 = r2.i
            r3.<init>(r0)
            r2.j = r3
            com.sun.mail.util.TraceOutputStream r3 = new com.sun.mail.util.TraceOutputStream
            java.io.PrintStream r0 = java.lang.System.out
            r3.<init>(r4, r0)
            r2.k = r3
            r3.setTrace(r5)
            com.sun.mail.util.TraceOutputStream r3 = r2.k
            boolean r4 = r2.d
            r3.setQuote(r4)
            java.io.DataOutputStream r3 = new java.io.DataOutputStream
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream
            com.sun.mail.util.TraceOutputStream r5 = r2.k
            r4.<init>(r5)
            r3.<init>(r4)
            r2.l = r3
            long r3 = java.lang.System.currentTimeMillis()
            r2.o = r3
            return
    }

    public f(java.lang.String r3, int r4, boolean r5, java.io.PrintStream r6, java.util.Properties r7, java.lang.String r8, boolean r9) throws java.io.IOException, com.sun.mail.iap.ProtocolException {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.h = r0
            r2.m = r0
            r1 = 0
            r2.n = r1
            r2.a = r3     // Catch: java.lang.Throwable -> L2e
            r2.c = r5     // Catch: java.lang.Throwable -> L2e
            r2.e = r6     // Catch: java.lang.Throwable -> L2e
            r2.f = r7     // Catch: java.lang.Throwable -> L2e
            r2.g = r8     // Catch: java.lang.Throwable -> L2e
            java.net.Socket r3 = com.sun.mail.util.SocketFetcher.getSocket(r3, r4, r7, r8, r9)     // Catch: java.lang.Throwable -> L2e
            r2.b = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = "mail.debug.quote"
            java.lang.String r3 = r7.getProperty(r3)     // Catch: java.lang.Throwable -> L2e
            r4 = 1
            if (r3 == 0) goto L30
            java.lang.String r5 = "true"
            boolean r3 = r3.equalsIgnoreCase(r5)     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L30
            r0 = 1
            goto L30
        L2e:
            r3 = move-exception
            goto L45
        L30:
            r2.d = r0     // Catch: java.lang.Throwable -> L2e
            r2.i(r6)     // Catch: java.lang.Throwable -> L2e
            com.sun.mail.iap.g r3 = r2.l()     // Catch: java.lang.Throwable -> L2e
            r2.k(r3)     // Catch: java.lang.Throwable -> L2e
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2e
            r2.o = r5     // Catch: java.lang.Throwable -> L2e
            r2.h = r4     // Catch: java.lang.Throwable -> L2e
            return
        L45:
            boolean r4 = r2.h
            if (r4 != 0) goto L4c
            r2.c()
        L4c:
            throw r3
    }

    private void i(java.io.PrintStream r3) throws java.io.IOException {
            r2 = this;
            com.sun.mail.util.TraceInputStream r0 = new com.sun.mail.util.TraceInputStream
            java.net.Socket r1 = r2.b
            java.io.InputStream r1 = r1.getInputStream()
            r0.<init>(r1, r3)
            r2.i = r0
            boolean r1 = r2.c
            r0.setTrace(r1)
            com.sun.mail.util.TraceInputStream r0 = r2.i
            boolean r1 = r2.d
            r0.setQuote(r1)
            com.sun.mail.iap.i r0 = new com.sun.mail.iap.i
            com.sun.mail.util.TraceInputStream r1 = r2.i
            r0.<init>(r1)
            r2.j = r0
            com.sun.mail.util.TraceOutputStream r0 = new com.sun.mail.util.TraceOutputStream
            java.net.Socket r1 = r2.b
            java.io.OutputStream r1 = r1.getOutputStream()
            r0.<init>(r1, r3)
            r2.k = r0
            boolean r3 = r2.c
            r0.setTrace(r3)
            com.sun.mail.util.TraceOutputStream r3 = r2.k
            boolean r0 = r2.d
            r3.setQuote(r0)
            java.io.DataOutputStream r3 = new java.io.DataOutputStream
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            com.sun.mail.util.TraceOutputStream r1 = r2.k
            r0.<init>(r1)
            r3.<init>(r0)
            r2.l = r3
            return
    }

    public synchronized void a(com.sun.mail.iap.h r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Vector r0 = r1.n     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto Lf
            java.util.Vector r0 = new java.util.Vector     // Catch: java.lang.Throwable -> Ld
            r0.<init>()     // Catch: java.lang.Throwable -> Ld
            r1.n = r0     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r2 = move-exception
            goto L16
        Lf:
            java.util.Vector r0 = r1.n     // Catch: java.lang.Throwable -> Ld
            r0.addElement(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        L16:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public synchronized com.sun.mail.iap.g[] b(java.lang.String r5, com.sun.mail.iap.b r6) {
            r4 = this;
            monitor-enter(r4)
            java.util.Vector r0 = new java.util.Vector     // Catch: java.lang.Throwable -> Le
            r0.<init>()     // Catch: java.lang.Throwable -> Le
            r1 = 1
            r2 = 0
            java.lang.String r2 = r4.q(r5, r6)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L10 com.sun.mail.iap.LiteralException -> L1a
            r5 = 0
            goto L23
        Le:
            r5 = move-exception
            goto L5d
        L10:
            r5 = move-exception
            com.sun.mail.iap.g r5 = com.sun.mail.iap.g.a(r5)     // Catch: java.lang.Throwable -> Le
            r0.addElement(r5)     // Catch: java.lang.Throwable -> Le
        L18:
            r5 = 1
            goto L23
        L1a:
            r5 = move-exception
            com.sun.mail.iap.g r5 = r5.getResponse()     // Catch: java.lang.Throwable -> Le
            r0.addElement(r5)     // Catch: java.lang.Throwable -> Le
            goto L18
        L23:
            if (r5 == 0) goto L36
            int r5 = r0.size()     // Catch: java.lang.Throwable -> Le
            com.sun.mail.iap.g[] r5 = new com.sun.mail.iap.g[r5]     // Catch: java.lang.Throwable -> Le
            r0.copyInto(r5)     // Catch: java.lang.Throwable -> Le
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Le
            r4.o = r0     // Catch: java.lang.Throwable -> Le
            monitor-exit(r4)
            return r5
        L36:
            com.sun.mail.iap.g r6 = r4.l()     // Catch: java.lang.Throwable -> Le com.sun.mail.iap.ProtocolException -> L3b java.io.IOException -> L3d
            goto L42
        L3b:
            goto L23
        L3d:
            r6 = move-exception
            com.sun.mail.iap.g r6 = com.sun.mail.iap.g.a(r6)     // Catch: java.lang.Throwable -> Le
        L42:
            r0.addElement(r6)     // Catch: java.lang.Throwable -> Le
            boolean r3 = r6.e()     // Catch: java.lang.Throwable -> Le
            if (r3 == 0) goto L4c
            r5 = 1
        L4c:
            boolean r3 = r6.j()     // Catch: java.lang.Throwable -> Le
            if (r3 == 0) goto L23
            java.lang.String r6 = r6.c()     // Catch: java.lang.Throwable -> Le
            boolean r6 = r6.equals(r2)     // Catch: java.lang.Throwable -> Le
            if (r6 == 0) goto L23
            goto L18
        L5d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Le
            throw r5
    }

    protected synchronized void c() {
            r1 = this;
            monitor-enter(r1)
            java.net.Socket r0 = r1.b     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Le
            r0.close()     // Catch: java.lang.Throwable -> L9 java.io.IOException -> Lb
            goto Lb
        L9:
            r0 = move-exception
            goto L10
        Lb:
            r0 = 0
            r1.b = r0     // Catch: java.lang.Throwable -> L9
        Le:
            monitor-exit(r1)
            return
        L10:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    protected com.sun.mail.iap.i d() {
            r1 = this;
            com.sun.mail.iap.i r0 = r1.j
            return r0
    }

    protected java.io.OutputStream e() {
            r1 = this;
            java.io.DataOutputStream r0 = r1.l
            return r0
    }

    protected com.sun.mail.iap.d f() {
            r1 = this;
            r0 = 0
            return r0
    }

    protected void finalize() throws java.lang.Throwable {
            r0 = this;
            super.finalize()
            r0.c()
            return
    }

    public long g() {
            r2 = this;
            long r0 = r2.o
            return r0
    }

    public void h(com.sun.mail.iap.g r2) throws com.sun.mail.iap.ProtocolException {
            r1 = this;
            boolean r0 = r2.h()
            if (r0 == 0) goto L7
            goto L19
        L7:
            boolean r0 = r2.g()
            if (r0 != 0) goto L29
            boolean r0 = r2.d()
            if (r0 != 0) goto L23
            boolean r0 = r2.e()
            if (r0 != 0) goto L1a
        L19:
            return
        L1a:
            r1.c()
            com.sun.mail.iap.ConnectionException r0 = new com.sun.mail.iap.ConnectionException
            r0.<init>(r1, r2)
            throw r0
        L23:
            com.sun.mail.iap.BadCommandException r0 = new com.sun.mail.iap.BadCommandException
            r0.<init>(r2)
            throw r0
        L29:
            com.sun.mail.iap.CommandFailedException r0 = new com.sun.mail.iap.CommandFailedException
            r0.<init>(r2)
            throw r0
    }

    public void j(com.sun.mail.iap.g[] r8) {
            r7 = this;
            java.util.Vector r0 = r7.n
            if (r0 != 0) goto L5
            goto L18
        L5:
            r0 = 0
            r1 = 0
        L7:
            int r2 = r8.length
            if (r1 < r2) goto Lb
            goto L18
        Lb:
            r2 = r8[r1]
            if (r2 != 0) goto L10
            goto L23
        L10:
            java.util.Vector r3 = r7.n
            int r3 = r3.size()
            if (r3 != 0) goto L19
        L18:
            return
        L19:
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.util.Vector r5 = r7.n
            r5.copyInto(r4)
            r5 = 0
        L21:
            if (r5 < r3) goto L26
        L23:
            int r1 = r1 + 1
            goto L7
        L26:
            r6 = r4[r5]
            com.sun.mail.iap.h r6 = (com.sun.mail.iap.h) r6
            r6.a(r2)
            int r5 = r5 + 1
            goto L21
    }

    protected void k(com.sun.mail.iap.g r2) throws com.sun.mail.iap.ProtocolException {
            r1 = this;
            boolean r0 = r2.e()
            if (r0 != 0) goto L7
            return
        L7:
            com.sun.mail.iap.ConnectionException r0 = new com.sun.mail.iap.ConnectionException
            r0.<init>(r1, r2)
            throw r0
    }

    public com.sun.mail.iap.g l() throws java.io.IOException, com.sun.mail.iap.ProtocolException {
            r1 = this;
            com.sun.mail.iap.g r0 = new com.sun.mail.iap.g
            r0.<init>(r1)
            return r0
    }

    public synchronized void m(com.sun.mail.iap.h r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Vector r0 = r1.n     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            java.util.Vector r0 = r1.n     // Catch: java.lang.Throwable -> Lb
            r0.removeElement(r2)     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r2 = move-exception
            goto Lf
        Ld:
            monitor-exit(r1)
            return
        Lf:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    public void n(java.lang.String r1, com.sun.mail.iap.b r2) throws com.sun.mail.iap.ProtocolException {
            r0 = this;
            com.sun.mail.iap.g[] r1 = r0.b(r1, r2)
            r0.j(r1)
            int r2 = r1.length
            int r2 = r2 + (-1)
            r1 = r1[r2]
            r0.h(r1)
            return
    }

    public synchronized void o(java.lang.String r3) throws java.io.IOException, com.sun.mail.iap.ProtocolException {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            r2.n(r3, r0)     // Catch: java.lang.Throwable -> L18
            java.net.Socket r3 = r2.b     // Catch: java.lang.Throwable -> L18
            java.util.Properties r0 = r2.f     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = r2.g     // Catch: java.lang.Throwable -> L18
            java.net.Socket r3 = com.sun.mail.util.SocketFetcher.startTLS(r3, r0, r1)     // Catch: java.lang.Throwable -> L18
            r2.b = r3     // Catch: java.lang.Throwable -> L18
            java.io.PrintStream r3 = r2.e     // Catch: java.lang.Throwable -> L18
            r2.i(r3)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            return
        L18:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r3
    }

    protected synchronized boolean p() {
            r1 = this;
            monitor-enter(r1)
            monitor-exit(r1)
            r0 = 0
            return r0
    }

    public java.lang.String q(java.lang.String r5, com.sun.mail.iap.b r6) throws java.io.IOException, com.sun.mail.iap.ProtocolException {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "A"
            r0.<init>(r1)
            int r1 = r4.m
            int r2 = r1 + 1
            r4.m = r2
            r2 = 10
            java.lang.String r1 = java.lang.Integer.toString(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.io.DataOutputStream r1 = r4.l
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = java.lang.String.valueOf(r0)
            r2.<init>(r3)
            java.lang.String r3 = " "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.writeBytes(r5)
            if (r6 == 0) goto L40
            java.io.DataOutputStream r5 = r4.l
            r1 = 32
            r5.write(r1)
            r6.g(r4)
        L40:
            java.io.DataOutputStream r5 = r4.l
            byte[] r6 = com.sun.mail.iap.f.p
            r5.write(r6)
            java.io.DataOutputStream r5 = r4.l
            r5.flush()
            return r0
    }
}
