package com.sun.mail.imap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class k extends javax.mail.Store implements javax.mail.QuotaAwareStore, com.sun.mail.iap.h {
    public static final int A = 1000;
    static final /* synthetic */ boolean B = false;
    private java.lang.String a;
    private int b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private java.lang.String i;
    private java.lang.String j;
    private java.lang.String k;
    private java.lang.String l;
    private java.lang.String m;
    private java.lang.String n;
    private com.sun.mail.imap.protocol.p o;
    private boolean p;
    private boolean r;
    private boolean s;
    private boolean t;
    private java.lang.String[] u;
    private boolean v;
    private boolean w;
    private volatile boolean x;
    private java.io.PrintStream y;
    private com.sun.mail.imap.k.a z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        private static final int m = 0;
        private static final int n = 1;
        private static final int o = 2;
        private java.util.Vector a;
        private java.util.Vector b;
        private boolean c;
        private boolean d;
        private long e;
        private long f;
        private long g;
        private int h;
        private long i;
        private boolean j;
        private int k;
        private com.sun.mail.imap.protocol.h l;

        a() {
                r3 = this;
                r3.<init>()
                java.util.Vector r0 = new java.util.Vector
                r0.<init>()
                r3.a = r0
                r0 = 0
                r3.c = r0
                r3.d = r0
                r1 = 45000(0xafc8, double:2.2233E-319)
                r3.e = r1
                r1 = 1800000(0x1b7740, double:8.89318E-318)
                r3.f = r1
                r1 = 1
                r3.h = r1
                r1 = 60000(0xea60, double:2.9644E-319)
                r3.i = r1
                r3.j = r0
                r3.k = r0
                return
        }

        static /* synthetic */ void a(com.sun.mail.imap.k.a r0, long r1) {
                r0.g = r1
                return
        }

        static /* synthetic */ void b(com.sun.mail.imap.k.a r0, boolean r1) {
                r0.j = r1
                return
        }

        static /* synthetic */ java.util.Vector c(com.sun.mail.imap.k.a r0) {
                java.util.Vector r0 = r0.a
                return r0
        }

        static /* synthetic */ boolean d(com.sun.mail.imap.k.a r0) {
                boolean r0 = r0.c
                return r0
        }

        static /* synthetic */ boolean e(com.sun.mail.imap.k.a r0) {
                boolean r0 = r0.d
                return r0
        }

        static /* synthetic */ java.util.Vector f(com.sun.mail.imap.k.a r0) {
                java.util.Vector r0 = r0.b
                return r0
        }

        static /* synthetic */ void g(com.sun.mail.imap.k.a r0, java.util.Vector r1) {
                r0.b = r1
                return
        }

        static /* synthetic */ void h(com.sun.mail.imap.k.a r0, boolean r1) {
                r0.d = r1
                return
        }

        static /* synthetic */ long i(com.sun.mail.imap.k.a r2) {
                long r0 = r2.g
                return r0
        }

        static /* synthetic */ long j(com.sun.mail.imap.k.a r2) {
                long r0 = r2.i
                return r0
        }

        static /* synthetic */ void k(com.sun.mail.imap.k.a r0, com.sun.mail.imap.protocol.h r1) {
                r0.l = r1
                return
        }

        static /* synthetic */ int l(com.sun.mail.imap.k.a r0) {
                int r0 = r0.k
                return r0
        }

        static /* synthetic */ void m(com.sun.mail.imap.k.a r0, int r1) {
                r0.h = r1
                return
        }

        static /* synthetic */ void n(com.sun.mail.imap.k.a r0, int r1) {
                r0.k = r1
                return
        }

        static /* synthetic */ com.sun.mail.imap.protocol.h o(com.sun.mail.imap.k.a r0) {
                com.sun.mail.imap.protocol.h r0 = r0.l
                return r0
        }

        static /* synthetic */ boolean p(com.sun.mail.imap.k.a r0) {
                boolean r0 = r0.j
                return r0
        }

        static /* synthetic */ int q(com.sun.mail.imap.k.a r0) {
                int r0 = r0.h
                return r0
        }

        static /* synthetic */ void r(com.sun.mail.imap.k.a r0, long r1) {
                r0.e = r1
                return
        }

        static /* synthetic */ long s(com.sun.mail.imap.k.a r2) {
                long r0 = r2.e
                return r0
        }

        static /* synthetic */ void t(com.sun.mail.imap.k.a r0, long r1) {
                r0.f = r1
                return
        }

        static /* synthetic */ long u(com.sun.mail.imap.k.a r2) {
                long r0 = r2.f
                return r0
        }

        static /* synthetic */ void v(com.sun.mail.imap.k.a r0, boolean r1) {
                r0.c = r1
                return
        }
    }

    static {
            return
    }

    public k(javax.mail.Session r7, javax.mail.URLName r8) {
            r6 = this;
            r4 = 143(0x8f, float:2.0E-43)
            r5 = 0
            java.lang.String r3 = "imap"
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    protected k(javax.mail.Session r5, javax.mail.URLName r6, java.lang.String r7, int r8, boolean r9) {
            r4 = this;
            r4.<init>(r5, r6)
            java.lang.String r0 = "imap"
            r4.a = r0
            r0 = 143(0x8f, float:2.0E-43)
            r4.b = r0
            r0 = 0
            r4.c = r0
            r1 = -1
            r4.d = r1
            r2 = 16384(0x4000, float:2.2959E-41)
            r4.e = r2
            r2 = 1000(0x3e8, float:1.401E-42)
            r4.f = r2
            r4.g = r1
            r2 = 10
            r4.h = r2
            r4.p = r0
            r4.r = r0
            r4.s = r0
            r4.t = r0
            r4.v = r0
            r4.w = r0
            r4.x = r0
            com.sun.mail.imap.k$a r0 = new com.sun.mail.imap.k$a
            r0.<init>()
            r4.z = r0
            if (r6 == 0) goto L3a
            java.lang.String r7 = r6.getProtocol()
        L3a:
            r4.a = r7
            r4.b = r8
            r4.c = r9
            com.sun.mail.imap.k$a r6 = r4.z
            long r8 = java.lang.System.currentTimeMillis()
            com.sun.mail.imap.k.a.a(r6, r8)
            boolean r6 = r5.getDebug()
            r4.debug = r6
            java.io.PrintStream r6 = r5.getDebugOut()
            r4.y = r6
            if (r6 != 0) goto L5b
            java.io.PrintStream r6 = java.lang.System.out
            r4.y = r6
        L5b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "mail."
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r9 = ".connectionpool.debug"
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getProperty(r6)
            r9 = 1
            java.lang.String r0 = "true"
            if (r6 == 0) goto L82
            boolean r6 = r6.equalsIgnoreCase(r0)
            if (r6 == 0) goto L82
            com.sun.mail.imap.k$a r6 = r4.z
            com.sun.mail.imap.k.a.b(r6, r9)
        L82:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r2 = ".partialfetch"
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getProperty(r6)
            if (r6 == 0) goto Lad
            java.lang.String r2 = "false"
            boolean r6 = r6.equalsIgnoreCase(r2)
            if (r6 == 0) goto Lad
            r4.e = r1
            boolean r6 = r4.debug
            if (r6 == 0) goto Ld3
            java.io.PrintStream r6 = r4.y
            r6.getClass()
            goto Ld3
        Lad:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r1 = ".fetchsize"
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getProperty(r6)
            if (r6 == 0) goto Lca
            int r6 = java.lang.Integer.parseInt(r6)
            r4.e = r6
        Lca:
            boolean r6 = r4.debug
            if (r6 == 0) goto Ld3
            java.io.PrintStream r6 = r4.y
            r6.getClass()
        Ld3:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r1 = ".statuscachetimeout"
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getProperty(r6)
            if (r6 == 0) goto Lf9
            int r6 = java.lang.Integer.parseInt(r6)
            r4.f = r6
            boolean r6 = r4.debug
            if (r6 == 0) goto Lf9
            java.io.PrintStream r6 = r4.y
            r6.getClass()
        Lf9:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r1 = ".appendbuffersize"
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getProperty(r6)
            if (r6 == 0) goto L11f
            int r6 = java.lang.Integer.parseInt(r6)
            r4.g = r6
            boolean r6 = r4.debug
            if (r6 == 0) goto L11f
            java.io.PrintStream r6 = r4.y
            r6.getClass()
        L11f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r1 = ".minidletime"
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getProperty(r6)
            if (r6 == 0) goto L145
            int r6 = java.lang.Integer.parseInt(r6)
            r4.h = r6
            boolean r6 = r4.debug
            if (r6 == 0) goto L145
            java.io.PrintStream r6 = r4.y
            r6.getClass()
        L145:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r1 = ".connectionpoolsize"
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getProperty(r6)
            if (r6 == 0) goto L17b
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L168
            if (r6 <= 0) goto L169
            com.sun.mail.imap.k$a r1 = r4.z     // Catch: java.lang.NumberFormatException -> L168
            com.sun.mail.imap.k.a.m(r1, r6)     // Catch: java.lang.NumberFormatException -> L168
            goto L169
        L168:
        L169:
            com.sun.mail.imap.k$a r6 = r4.z
            boolean r6 = com.sun.mail.imap.k.a.p(r6)
            if (r6 == 0) goto L17b
            java.io.PrintStream r6 = r4.y
            com.sun.mail.imap.k$a r1 = r4.z
            com.sun.mail.imap.k.a.q(r1)
            r6.getClass()
        L17b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r1 = ".connectionpooltimeout"
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getProperty(r6)
            if (r6 == 0) goto L1b2
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L19f
            if (r6 <= 0) goto L1a0
            com.sun.mail.imap.k$a r1 = r4.z     // Catch: java.lang.NumberFormatException -> L19f
            long r2 = (long) r6     // Catch: java.lang.NumberFormatException -> L19f
            com.sun.mail.imap.k.a.r(r1, r2)     // Catch: java.lang.NumberFormatException -> L19f
            goto L1a0
        L19f:
        L1a0:
            com.sun.mail.imap.k$a r6 = r4.z
            boolean r6 = com.sun.mail.imap.k.a.p(r6)
            if (r6 == 0) goto L1b2
            java.io.PrintStream r6 = r4.y
            com.sun.mail.imap.k$a r1 = r4.z
            com.sun.mail.imap.k.a.s(r1)
            r6.getClass()
        L1b2:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r1 = ".servertimeout"
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getProperty(r6)
            if (r6 == 0) goto L1e9
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L1d6
            if (r6 <= 0) goto L1d7
            com.sun.mail.imap.k$a r1 = r4.z     // Catch: java.lang.NumberFormatException -> L1d6
            long r2 = (long) r6     // Catch: java.lang.NumberFormatException -> L1d6
            com.sun.mail.imap.k.a.t(r1, r2)     // Catch: java.lang.NumberFormatException -> L1d6
            goto L1d7
        L1d6:
        L1d7:
            com.sun.mail.imap.k$a r6 = r4.z
            boolean r6 = com.sun.mail.imap.k.a.p(r6)
            if (r6 == 0) goto L1e9
            java.io.PrintStream r6 = r4.y
            com.sun.mail.imap.k$a r1 = r4.z
            com.sun.mail.imap.k.a.u(r1)
            r6.getClass()
        L1e9:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r1 = ".separatestoreconnection"
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getProperty(r6)
            if (r6 == 0) goto L218
            boolean r6 = r6.equalsIgnoreCase(r0)
            if (r6 == 0) goto L218
            com.sun.mail.imap.k$a r6 = r4.z
            boolean r6 = com.sun.mail.imap.k.a.p(r6)
            if (r6 == 0) goto L213
            java.io.PrintStream r6 = r4.y
            r6.getClass()
        L213:
            com.sun.mail.imap.k$a r6 = r4.z
            com.sun.mail.imap.k.a.v(r6, r9)
        L218:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r1 = ".proxyauth.user"
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getProperty(r6)
            if (r6 == 0) goto L23a
            r4.l = r6
            boolean r6 = r4.debug
            if (r6 == 0) goto L23a
            java.io.PrintStream r6 = r4.y
            r6.getClass()
        L23a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r1 = ".auth.login.disable"
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getProperty(r6)
            if (r6 == 0) goto L262
            boolean r6 = r6.equalsIgnoreCase(r0)
            if (r6 == 0) goto L262
            boolean r6 = r4.debug
            if (r6 == 0) goto L260
            java.io.PrintStream r6 = r4.y
            r6.getClass()
        L260:
            r4.p = r9
        L262:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r1 = ".auth.plain.disable"
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getProperty(r6)
            if (r6 == 0) goto L28a
            boolean r6 = r6.equalsIgnoreCase(r0)
            if (r6 == 0) goto L28a
            boolean r6 = r4.debug
            if (r6 == 0) goto L288
            java.io.PrintStream r6 = r4.y
            r6.getClass()
        L288:
            r4.r = r9
        L28a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r1 = ".starttls.enable"
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getProperty(r6)
            if (r6 == 0) goto L2b2
            boolean r6 = r6.equalsIgnoreCase(r0)
            if (r6 == 0) goto L2b2
            boolean r6 = r4.debug
            if (r6 == 0) goto L2b0
            java.io.PrintStream r6 = r4.y
            r6.getClass()
        L2b0:
            r4.s = r9
        L2b2:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r1 = ".sasl.enable"
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getProperty(r6)
            if (r6 == 0) goto L2da
            boolean r6 = r6.equalsIgnoreCase(r0)
            if (r6 == 0) goto L2da
            boolean r6 = r4.debug
            if (r6 == 0) goto L2d8
            java.io.PrintStream r6 = r4.y
            r6.getClass()
        L2d8:
            r4.t = r9
        L2da:
            boolean r6 = r4.t
            if (r6 == 0) goto L331
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r1 = ".sasl.mechanisms"
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getProperty(r6)
            if (r6 == 0) goto L331
            int r1 = r6.length()
            if (r1 <= 0) goto L331
            boolean r1 = r4.debug
            if (r1 == 0) goto L304
            java.io.PrintStream r1 = r4.y
            r1.getClass()
        L304:
            java.util.Vector r1 = new java.util.Vector
            r2 = 5
            r1.<init>(r2)
            java.util.StringTokenizer r2 = new java.util.StringTokenizer
            java.lang.String r3 = " ,"
            r2.<init>(r6, r3)
        L311:
            boolean r6 = r2.hasMoreTokens()
            if (r6 != 0) goto L323
            int r6 = r1.size()
            java.lang.String[] r6 = new java.lang.String[r6]
            r4.u = r6
            r1.copyInto(r6)
            goto L331
        L323:
            java.lang.String r6 = r2.nextToken()
            int r3 = r6.length()
            if (r3 <= 0) goto L311
            r1.addElement(r6)
            goto L311
        L331:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r1 = ".sasl.authorizationid"
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getProperty(r6)
            if (r6 == 0) goto L353
            r4.m = r6
            boolean r6 = r4.debug
            if (r6 == 0) goto L353
            java.io.PrintStream r6 = r4.y
            r6.getClass()
        L353:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r1 = ".sasl.realm"
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getProperty(r6)
            if (r6 == 0) goto L375
            r4.n = r6
            boolean r6 = r4.debug
            if (r6 == 0) goto L375
            java.io.PrintStream r6 = r4.y
            r6.getClass()
        L375:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r1 = ".forcepasswordrefresh"
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getProperty(r6)
            if (r6 == 0) goto L39d
            boolean r6 = r6.equalsIgnoreCase(r0)
            if (r6 == 0) goto L39d
            boolean r6 = r4.debug
            if (r6 == 0) goto L39b
            java.io.PrintStream r6 = r4.y
            r6.getClass()
        L39b:
            r4.v = r9
        L39d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r7 = ".enableimapevents"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r5 = r5.getProperty(r6)
            if (r5 == 0) goto L3c5
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 == 0) goto L3c5
            boolean r5 = r4.debug
            if (r5 == 0) goto L3c3
            java.io.PrintStream r5 = r4.y
            r5.getClass()
        L3c3:
            r4.w = r9
        L3c5:
            return
    }

    private void A() throws com.sun.mail.iap.ProtocolException {
            r2 = this;
        L0:
            com.sun.mail.imap.k$a r0 = r2.z
            int r0 = com.sun.mail.imap.k.a.l(r0)
            if (r0 != 0) goto L9
            return
        L9:
            com.sun.mail.imap.k$a r0 = r2.z
            int r0 = com.sun.mail.imap.k.a.l(r0)
            r1 = 1
            if (r0 != r1) goto L21
            com.sun.mail.imap.k$a r0 = r2.z
            com.sun.mail.imap.protocol.h r0 = com.sun.mail.imap.k.a.o(r0)
            r0.f0()
            com.sun.mail.imap.k$a r0 = r2.z
            r1 = 2
            com.sun.mail.imap.k.a.n(r0, r1)
        L21:
            com.sun.mail.imap.k$a r0 = r2.z     // Catch: java.lang.InterruptedException -> L27
            r0.wait()     // Catch: java.lang.InterruptedException -> L27
            goto L0
        L27:
            goto L0
    }

    private void c() {
            r1 = this;
            r0 = 0
            r1.d(r0)
            return
    }

    private void checkConnected() {
            r2 = this;
            boolean r0 = r2.x
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 0
            super/*javax.mail.Service*/.setConnected(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not connected"
            r0.<init>(r1)
            throw r0
    }

    private void d(boolean r8) {
            r7 = this;
            boolean r0 = r7.debug
            if (r0 == 0) goto L9
            java.io.PrintStream r0 = r7.y
            r0.getClass()
        L9:
            r0 = 0
            r1 = r0
        Lb:
            com.sun.mail.imap.k$a r2 = r7.z
            monitor-enter(r2)
            com.sun.mail.imap.k$a r3 = r7.z     // Catch: java.lang.Throwable -> L24
            java.util.Vector r3 = com.sun.mail.imap.k.a.f(r3)     // Catch: java.lang.Throwable -> L24
            r4 = 0
            if (r3 == 0) goto L26
            com.sun.mail.imap.k$a r1 = r7.z     // Catch: java.lang.Throwable -> L24
            java.util.Vector r1 = com.sun.mail.imap.k.a.f(r1)     // Catch: java.lang.Throwable -> L24
            com.sun.mail.imap.k$a r3 = r7.z     // Catch: java.lang.Throwable -> L24
            com.sun.mail.imap.k.a.g(r3, r0)     // Catch: java.lang.Throwable -> L24
            r3 = 0
            goto L27
        L24:
            r8 = move-exception
            goto L70
        L26:
            r3 = 1
        L27:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L44
            com.sun.mail.imap.k$a r2 = r7.z
            monitor-enter(r2)
            r7.e(r8)     // Catch: java.lang.Throwable -> L41
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            r7.x = r4
            r8 = 3
            r7.notifyConnectionListeners(r8)
            boolean r8 = r7.debug
            if (r8 == 0) goto L40
            java.io.PrintStream r8 = r7.y
            r8.getClass()
        L40:
            return
        L41:
            r8 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            throw r8
        L44:
            int r3 = r1.size()
            r2 = 0
        L49:
            if (r2 < r3) goto L4c
            goto Lb
        L4c:
            java.lang.Object r5 = r1.elementAt(r2)
            com.sun.mail.imap.e r5 = (com.sun.mail.imap.e) r5
            if (r8 == 0) goto L61
            boolean r6 = r7.debug     // Catch: java.lang.Throwable -> L6d
            if (r6 == 0) goto L5d
            java.io.PrintStream r6 = r7.y     // Catch: java.lang.Throwable -> L6d
            r6.getClass()     // Catch: java.lang.Throwable -> L6d
        L5d:
            r5.w()     // Catch: java.lang.Throwable -> L6d
            goto L6d
        L61:
            boolean r6 = r7.debug     // Catch: java.lang.Throwable -> L6d
            if (r6 == 0) goto L6a
            java.io.PrintStream r6 = r7.y     // Catch: java.lang.Throwable -> L6d
            r6.getClass()     // Catch: java.lang.Throwable -> L6d
        L6a:
            r5.close(r4)     // Catch: java.lang.Throwable -> L6d
        L6d:
            int r2 = r2 + 1
            goto L49
        L70:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L24
            throw r8
    }

    private void e(boolean r4) {
            r3 = this;
            com.sun.mail.imap.k$a r0 = r3.z
            monitor-enter(r0)
            com.sun.mail.imap.k$a r1 = r3.z     // Catch: java.lang.Throwable -> L29
            java.util.Vector r1 = com.sun.mail.imap.k.a.c(r1)     // Catch: java.lang.Throwable -> L29
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L29
            int r1 = r1 + (-1)
        Lf:
            if (r1 >= 0) goto L2b
            com.sun.mail.imap.k$a r4 = r3.z     // Catch: java.lang.Throwable -> L29
            java.util.Vector r4 = com.sun.mail.imap.k.a.c(r4)     // Catch: java.lang.Throwable -> L29
            r4.removeAllElements()     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            com.sun.mail.imap.k$a r4 = r3.z
            boolean r4 = com.sun.mail.imap.k.a.p(r4)
            if (r4 == 0) goto L28
            java.io.PrintStream r4 = r3.y
            r4.getClass()
        L28:
            return
        L29:
            r4 = move-exception
            goto L46
        L2b:
            com.sun.mail.imap.k$a r2 = r3.z     // Catch: java.lang.Throwable -> L29 com.sun.mail.iap.ProtocolException -> L43
            java.util.Vector r2 = com.sun.mail.imap.k.a.c(r2)     // Catch: java.lang.Throwable -> L29 com.sun.mail.iap.ProtocolException -> L43
            java.lang.Object r2 = r2.elementAt(r1)     // Catch: java.lang.Throwable -> L29 com.sun.mail.iap.ProtocolException -> L43
            com.sun.mail.imap.protocol.h r2 = (com.sun.mail.imap.protocol.h) r2     // Catch: java.lang.Throwable -> L29 com.sun.mail.iap.ProtocolException -> L43
            r2.m(r3)     // Catch: java.lang.Throwable -> L29 com.sun.mail.iap.ProtocolException -> L43
            if (r4 == 0) goto L40
            r2.c()     // Catch: java.lang.Throwable -> L29 com.sun.mail.iap.ProtocolException -> L43
            goto L43
        L40:
            r2.n0()     // Catch: java.lang.Throwable -> L29 com.sun.mail.iap.ProtocolException -> L43
        L43:
            int r1 = r1 + (-1)
            goto Lf
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r4
    }

    private synchronized com.sun.mail.imap.protocol.p j() throws javax.mail.MessagingException {
            r4 = this;
            monitor-enter(r4)
            r4.checkConnected()     // Catch: java.lang.Throwable -> L17
            com.sun.mail.imap.protocol.p r0 = r4.o     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L44
            r0 = 0
            com.sun.mail.imap.protocol.h r0 = r4.n()     // Catch: java.lang.Throwable -> L19 com.sun.mail.iap.ProtocolException -> L1b com.sun.mail.iap.ConnectionException -> L1d com.sun.mail.iap.BadCommandException -> L3c
            com.sun.mail.imap.protocol.p r1 = r0.q0()     // Catch: java.lang.Throwable -> L19 com.sun.mail.iap.ProtocolException -> L1b com.sun.mail.iap.ConnectionException -> L1d com.sun.mail.iap.BadCommandException -> L3c
            r4.o = r1     // Catch: java.lang.Throwable -> L19 com.sun.mail.iap.ProtocolException -> L1b com.sun.mail.iap.ConnectionException -> L1d com.sun.mail.iap.BadCommandException -> L3c
            r4.w(r0)     // Catch: java.lang.Throwable -> L17
            goto L44
        L17:
            r0 = move-exception
            goto L48
        L19:
            r1 = move-exception
            goto L33
        L1b:
            r1 = move-exception
            goto L1f
        L1d:
            r1 = move-exception
            goto L29
        L1f:
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = r1.getMessage()     // Catch: java.lang.Throwable -> L19
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L19
            throw r2     // Catch: java.lang.Throwable -> L19
        L29:
            javax.mail.StoreClosedException r2 = new javax.mail.StoreClosedException     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L19
            r2.<init>(r4, r1)     // Catch: java.lang.Throwable -> L19
            throw r2     // Catch: java.lang.Throwable -> L19
        L33:
            r4.w(r0)     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L3b
            r4.c()     // Catch: java.lang.Throwable -> L17
        L3b:
            throw r1     // Catch: java.lang.Throwable -> L17
        L3c:
            r4.w(r0)     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L44
            r4.c()     // Catch: java.lang.Throwable -> L17
        L44:
            com.sun.mail.imap.protocol.p r0 = r4.o     // Catch: java.lang.Throwable -> L17
            monitor-exit(r4)
            return r0
        L48:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L17
            throw r0
    }

    private void t(com.sun.mail.imap.protocol.h r10, java.lang.String r11, java.lang.String r12) throws com.sun.mail.iap.ProtocolException {
            r9 = this;
            boolean r0 = r9.s
            if (r0 == 0) goto L12
            java.lang.String r0 = "STARTTLS"
            boolean r0 = r10.e0(r0)
            if (r0 == 0) goto L12
            r10.J0()
            r10.w()
        L12:
            boolean r0 = r10.h0()
            if (r0 == 0) goto L1a
            goto L91
        L1a:
            java.util.Map r0 = r10.a0()
            java.lang.String r1 = ""
            java.lang.String r2 = "__PRELOGIN__"
            r0.put(r2, r1)
            java.lang.String r0 = r9.m
            if (r0 == 0) goto L2b
        L29:
            r6 = r0
            goto L31
        L2b:
            java.lang.String r0 = r9.l
            if (r0 == 0) goto L30
            goto L29
        L30:
            r6 = r11
        L31:
            boolean r0 = r9.t
            if (r0 == 0) goto L40
            java.lang.String[] r4 = r9.u
            java.lang.String r5 = r9.n
            r3 = r10
            r7 = r11
            r8 = r12
            r3.B0(r4, r5, r6, r7, r8)
            goto L43
        L40:
            r3 = r10
            r7 = r11
            r8 = r12
        L43:
            boolean r10 = r3.h0()
            if (r10 == 0) goto L4a
            goto L7d
        L4a:
            java.lang.String r10 = "AUTH=PLAIN"
            boolean r10 = r3.e0(r10)
            if (r10 == 0) goto L5a
            boolean r10 = r9.r
            if (r10 != 0) goto L5a
            r3.v(r6, r7, r8)
            goto L7d
        L5a:
            java.lang.String r10 = "AUTH-LOGIN"
            boolean r10 = r3.e0(r10)
            if (r10 != 0) goto L6a
            java.lang.String r10 = "AUTH=LOGIN"
            boolean r10 = r3.e0(r10)
            if (r10 == 0) goto L72
        L6a:
            boolean r10 = r9.p
            if (r10 != 0) goto L72
            r3.u(r7, r8)
            goto L7d
        L72:
            java.lang.String r10 = "LOGINDISABLED"
            boolean r10 = r3.e0(r10)
            if (r10 != 0) goto L92
            r3.m0(r7, r8)
        L7d:
            java.lang.String r10 = r9.l
            if (r10 == 0) goto L84
            r3.y0(r10)
        L84:
            boolean r10 = r3.e0(r2)
            if (r10 == 0) goto L91
            r3.w()     // Catch: com.sun.mail.iap.ProtocolException -> L8d com.sun.mail.iap.ConnectionException -> L8e
        L8d:
            return
        L8e:
            r0 = move-exception
            r10 = r0
            throw r10
        L91:
            return
        L92:
            com.sun.mail.iap.ProtocolException r10 = new com.sun.mail.iap.ProtocolException
            java.lang.String r11 = "No login methods supported!"
            r10.<init>(r11)
            throw r10
    }

    private javax.mail.Folder[] u(com.sun.mail.imap.protocol.p.a[] r9, java.lang.String r10) {
            r8 = this;
            int r0 = r9.length
            javax.mail.Folder[] r1 = new javax.mail.Folder[r0]
            r2 = 0
            r3 = 0
        L5:
            if (r3 < r0) goto L8
            return r1
        L8:
            r4 = r9[r3]
            java.lang.String r4 = r4.a
            if (r10 != 0) goto L25
            int r5 = r4.length()
            if (r5 <= 0) goto L35
            int r5 = r5 + (-1)
            char r6 = r4.charAt(r5)
            r7 = r9[r3]
            char r7 = r7.b
            if (r6 != r7) goto L35
            java.lang.String r4 = r4.substring(r2, r5)
            goto L35
        L25:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r5.<init>(r4)
            r5.append(r10)
            java.lang.String r4 = r5.toString()
        L35:
            com.sun.mail.imap.e r5 = new com.sun.mail.imap.e
            r6 = r9[r3]
            char r6 = r6.b
            if (r10 != 0) goto L3f
            r7 = 1
            goto L40
        L3f:
            r7 = 0
        L40:
            r5.<init>(r4, r6, r8, r7)
            r1[r3] = r5
            int r3 = r3 + 1
            goto L5
    }

    private void z() {
            r8 = this;
            com.sun.mail.imap.k$a r0 = r8.z
            monitor-enter(r0)
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L45
            com.sun.mail.imap.k$a r3 = r8.z     // Catch: java.lang.Throwable -> L45
            long r3 = com.sun.mail.imap.k.a.i(r3)     // Catch: java.lang.Throwable -> L45
            long r1 = r1 - r3
            com.sun.mail.imap.k$a r3 = r8.z     // Catch: java.lang.Throwable -> L45
            long r3 = com.sun.mail.imap.k.a.j(r3)     // Catch: java.lang.Throwable -> L45
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto Lb4
            com.sun.mail.imap.k$a r1 = r8.z     // Catch: java.lang.Throwable -> L45
            java.util.Vector r1 = com.sun.mail.imap.k.a.c(r1)     // Catch: java.lang.Throwable -> L45
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L45
            r2 = 1
            if (r1 <= r2) goto Lb4
            com.sun.mail.imap.k$a r1 = r8.z     // Catch: java.lang.Throwable -> L45
            boolean r1 = com.sun.mail.imap.k.a.p(r1)     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L47
            java.io.PrintStream r1 = r8.y     // Catch: java.lang.Throwable -> L45
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L45
            com.sun.mail.imap.k$a r3 = r8.z     // Catch: java.lang.Throwable -> L45
            com.sun.mail.imap.k.a.i(r3)     // Catch: java.lang.Throwable -> L45
            r1.getClass()     // Catch: java.lang.Throwable -> L45
            java.io.PrintStream r1 = r8.y     // Catch: java.lang.Throwable -> L45
            com.sun.mail.imap.k$a r3 = r8.z     // Catch: java.lang.Throwable -> L45
            com.sun.mail.imap.k.a.s(r3)     // Catch: java.lang.Throwable -> L45
            r1.getClass()     // Catch: java.lang.Throwable -> L45
            goto L47
        L45:
            r1 = move-exception
            goto Lb6
        L47:
            com.sun.mail.imap.k$a r1 = r8.z     // Catch: java.lang.Throwable -> L45
            java.util.Vector r1 = com.sun.mail.imap.k.a.c(r1)     // Catch: java.lang.Throwable -> L45
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L45
            int r1 = r1 - r2
        L52:
            if (r1 > 0) goto L5e
            com.sun.mail.imap.k$a r1 = r8.z     // Catch: java.lang.Throwable -> L45
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L45
            com.sun.mail.imap.k.a.a(r1, r2)     // Catch: java.lang.Throwable -> L45
            goto Lb4
        L5e:
            com.sun.mail.imap.k$a r2 = r8.z     // Catch: java.lang.Throwable -> L45
            java.util.Vector r2 = com.sun.mail.imap.k.a.c(r2)     // Catch: java.lang.Throwable -> L45
            java.lang.Object r2 = r2.elementAt(r1)     // Catch: java.lang.Throwable -> L45
            com.sun.mail.imap.protocol.h r2 = (com.sun.mail.imap.protocol.h) r2     // Catch: java.lang.Throwable -> L45
            com.sun.mail.imap.k$a r3 = r8.z     // Catch: java.lang.Throwable -> L45
            boolean r3 = com.sun.mail.imap.k.a.p(r3)     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L7d
            java.io.PrintStream r3 = r8.y     // Catch: java.lang.Throwable -> L45
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L45
            r2.g()     // Catch: java.lang.Throwable -> L45
            r3.getClass()     // Catch: java.lang.Throwable -> L45
        L7d:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L45
            long r5 = r2.g()     // Catch: java.lang.Throwable -> L45
            long r3 = r3 - r5
            com.sun.mail.imap.k$a r5 = r8.z     // Catch: java.lang.Throwable -> L45
            long r5 = com.sun.mail.imap.k.a.s(r5)     // Catch: java.lang.Throwable -> L45
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto Lb1
            com.sun.mail.imap.k$a r3 = r8.z     // Catch: java.lang.Throwable -> L45
            boolean r3 = com.sun.mail.imap.k.a.p(r3)     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto La2
            java.io.PrintStream r3 = r8.y     // Catch: java.lang.Throwable -> L45
            r3.getClass()     // Catch: java.lang.Throwable -> L45
            java.io.PrintStream r3 = r8.y     // Catch: java.lang.Throwable -> L45
            r3.getClass()     // Catch: java.lang.Throwable -> L45
        La2:
            r2.m(r8)     // Catch: java.lang.Throwable -> L45
            com.sun.mail.imap.k$a r3 = r8.z     // Catch: java.lang.Throwable -> L45
            java.util.Vector r3 = com.sun.mail.imap.k.a.c(r3)     // Catch: java.lang.Throwable -> L45
            r3.removeElementAt(r1)     // Catch: java.lang.Throwable -> L45
            r2.n0()     // Catch: java.lang.Throwable -> L45 com.sun.mail.iap.ProtocolException -> Lb1
        Lb1:
            int r1 = r1 + (-1)
            goto L52
        Lb4:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            return
        Lb6:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            throw r1
    }

    @Override // com.sun.mail.iap.h
    public void a(com.sun.mail.iap.g r2) {
            r1 = this;
            boolean r0 = r2.h()
            if (r0 != 0) goto L18
            boolean r0 = r2.g()
            if (r0 != 0) goto L18
            boolean r0 = r2.d()
            if (r0 != 0) goto L18
            boolean r0 = r2.e()
            if (r0 == 0) goto L1b
        L18:
            r1.o(r2)
        L1b:
            boolean r0 = r2.e()
            if (r0 == 0) goto L35
            boolean r0 = r1.debug
            if (r0 == 0) goto L2a
            java.io.PrintStream r0 = r1.y
            r0.getClass()
        L2a:
            boolean r0 = r1.x
            if (r0 == 0) goto L35
            boolean r2 = r2.i()
            r1.d(r2)
        L35:
            return
    }

    boolean b() {
            r3 = this;
            javax.mail.Session r0 = r3.session
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "mail."
            r1.<init>(r2)
            java.lang.String r2 = r3.a
            r1.append(r2)
            java.lang.String r2 = ".allowreadonlyselect"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r0.getProperty(r1)
            if (r0 == 0) goto L27
            java.lang.String r1 = "true"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L27
            r0 = 1
            return r0
        L27:
            r0 = 0
            return r0
    }

    public synchronized void close() throws javax.mail.MessagingException {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = super/*javax.mail.Service*/.isConnected()     // Catch: java.lang.Throwable -> L34
            if (r0 != 0) goto L9
            monitor-exit(r4)
            return
        L9:
            r0 = 0
            com.sun.mail.imap.k$a r1 = r4.z     // Catch: java.lang.Throwable -> L28 com.sun.mail.iap.ProtocolException -> L2a
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L28 com.sun.mail.iap.ProtocolException -> L2a
            com.sun.mail.imap.k$a r2 = r4.z     // Catch: java.lang.Throwable -> L52
            java.util.Vector r2 = com.sun.mail.imap.k.a.c(r2)     // Catch: java.lang.Throwable -> L52
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L52
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L36
            com.sun.mail.imap.k$a r1 = r4.z     // Catch: java.lang.Throwable -> L28 com.sun.mail.iap.ProtocolException -> L2a
            boolean r1 = com.sun.mail.imap.k.a.p(r1)     // Catch: java.lang.Throwable -> L28 com.sun.mail.iap.ProtocolException -> L2a
            if (r1 == 0) goto L2c
            java.io.PrintStream r1 = r4.y     // Catch: java.lang.Throwable -> L28 com.sun.mail.iap.ProtocolException -> L2a
            r1.getClass()     // Catch: java.lang.Throwable -> L28 com.sun.mail.iap.ProtocolException -> L2a
            goto L2c
        L28:
            r1 = move-exception
            goto L62
        L2a:
            r1 = move-exception
            goto L55
        L2c:
            r4.c()     // Catch: java.lang.Throwable -> L28 com.sun.mail.iap.ProtocolException -> L2a
            r4.w(r0)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r4)
            return
        L34:
            r0 = move-exception
            goto L66
        L36:
            com.sun.mail.imap.protocol.h r0 = r4.n()     // Catch: java.lang.Throwable -> L28 com.sun.mail.iap.ProtocolException -> L2a
            com.sun.mail.imap.k$a r1 = r4.z     // Catch: java.lang.Throwable -> L28 com.sun.mail.iap.ProtocolException -> L2a
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L28 com.sun.mail.iap.ProtocolException -> L2a
            com.sun.mail.imap.k$a r2 = r4.z     // Catch: java.lang.Throwable -> L4f
            java.util.Vector r2 = com.sun.mail.imap.k.a.c(r2)     // Catch: java.lang.Throwable -> L4f
            r2.removeElement(r0)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
            r0.n0()     // Catch: java.lang.Throwable -> L28 com.sun.mail.iap.ProtocolException -> L2a
            r4.w(r0)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r4)
            return
        L4f:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
            throw r2     // Catch: java.lang.Throwable -> L28 com.sun.mail.iap.ProtocolException -> L2a
        L52:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L52
            throw r2     // Catch: java.lang.Throwable -> L28 com.sun.mail.iap.ProtocolException -> L2a
        L55:
            r4.c()     // Catch: java.lang.Throwable -> L28
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = r1.getMessage()     // Catch: java.lang.Throwable -> L28
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L28
            throw r2     // Catch: java.lang.Throwable -> L28
        L62:
            r4.w(r0)     // Catch: java.lang.Throwable -> L34
            throw r1     // Catch: java.lang.Throwable -> L34
        L66:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L34
            throw r0
    }

    int f() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    protected void finalize() throws java.lang.Throwable {
            r0 = this;
            super/*javax.mail.Service*/.finalize()
            r0.close()
            return
    }

    boolean g() {
            r1 = this;
            com.sun.mail.imap.k$a r0 = r1.z
            boolean r0 = com.sun.mail.imap.k.a.p(r0)
            return r0
    }

    public synchronized javax.mail.Folder getDefaultFolder() throws javax.mail.MessagingException {
            r1 = this;
            monitor-enter(r1)
            r1.checkConnected()     // Catch: java.lang.Throwable -> Lb
            com.sun.mail.imap.c r0 = new com.sun.mail.imap.c     // Catch: java.lang.Throwable -> Lb
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return r0
        Lb:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    public synchronized javax.mail.Folder getFolder(java.lang.String r3) throws javax.mail.MessagingException {
            r2 = this;
            monitor-enter(r2)
            r2.checkConnected()     // Catch: java.lang.Throwable -> Le
            com.sun.mail.imap.e r0 = new com.sun.mail.imap.e     // Catch: java.lang.Throwable -> Le
            r1 = 65535(0xffff, float:9.1834E-41)
            r0.<init>(r3, r1, r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return r0
        Le:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3
    }

    public synchronized javax.mail.Folder getFolder(javax.mail.URLName r3) throws javax.mail.MessagingException {
            r2 = this;
            monitor-enter(r2)
            r2.checkConnected()     // Catch: java.lang.Throwable -> L12
            com.sun.mail.imap.e r0 = new com.sun.mail.imap.e     // Catch: java.lang.Throwable -> L12
            java.lang.String r3 = r3.getFile()     // Catch: java.lang.Throwable -> L12
            r1 = 65535(0xffff, float:9.1834E-41)
            r0.<init>(r3, r1, r2)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)
            return r0
        L12:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    public javax.mail.Folder[] getPersonalNamespaces() throws javax.mail.MessagingException {
            r2 = this;
            com.sun.mail.imap.protocol.p r0 = r2.j()
            if (r0 == 0) goto L11
            com.sun.mail.imap.protocol.p$a[] r0 = r0.a
            if (r0 != 0) goto Lb
            goto L11
        Lb:
            r1 = 0
            javax.mail.Folder[] r0 = r2.u(r0, r1)
            return r0
        L11:
            javax.mail.Folder[] r0 = super.getPersonalNamespaces()
            return r0
    }

    public synchronized javax.mail.Quota[] getQuota(java.lang.String r4) throws javax.mail.MessagingException {
            r3 = this;
            monitor-enter(r3)
            r3.checkConnected()     // Catch: java.lang.Throwable -> L12
            r0 = 0
            com.sun.mail.imap.protocol.h r0 = r3.n()     // Catch: java.lang.Throwable -> L14 com.sun.mail.iap.ProtocolException -> L16 com.sun.mail.iap.ConnectionException -> L18 com.sun.mail.iap.BadCommandException -> L1a
            javax.mail.Quota[] r4 = r0.d0(r4)     // Catch: java.lang.Throwable -> L14 com.sun.mail.iap.ProtocolException -> L16 com.sun.mail.iap.ConnectionException -> L18 com.sun.mail.iap.BadCommandException -> L1a
            r3.w(r0)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r3)
            return r4
        L12:
            r4 = move-exception
            goto L41
        L14:
            r4 = move-exception
            goto L38
        L16:
            r4 = move-exception
            goto L1c
        L18:
            r4 = move-exception
            goto L26
        L1a:
            r4 = move-exception
            goto L30
        L1c:
            javax.mail.MessagingException r1 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = r4.getMessage()     // Catch: java.lang.Throwable -> L14
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L14
            throw r1     // Catch: java.lang.Throwable -> L14
        L26:
            javax.mail.StoreClosedException r1 = new javax.mail.StoreClosedException     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L14
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L14
            throw r1     // Catch: java.lang.Throwable -> L14
        L30:
            javax.mail.MessagingException r1 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "QUOTA not supported"
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L14
            throw r1     // Catch: java.lang.Throwable -> L14
        L38:
            r3.w(r0)     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L40
            r3.c()     // Catch: java.lang.Throwable -> L12
        L40:
            throw r4     // Catch: java.lang.Throwable -> L12
        L41:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            throw r4
    }

    public javax.mail.Folder[] getSharedNamespaces() throws javax.mail.MessagingException {
            r2 = this;
            com.sun.mail.imap.protocol.p r0 = r2.j()
            if (r0 == 0) goto L11
            com.sun.mail.imap.protocol.p$a[] r0 = r0.c
            if (r0 != 0) goto Lb
            goto L11
        Lb:
            r1 = 0
            javax.mail.Folder[] r0 = r2.u(r0, r1)
            return r0
        L11:
            javax.mail.Folder[] r0 = super.getSharedNamespaces()
            return r0
    }

    public javax.mail.Folder[] getUserNamespaces(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            com.sun.mail.imap.protocol.p r0 = r1.j()
            if (r0 == 0) goto L10
            com.sun.mail.imap.protocol.p$a[] r0 = r0.b
            if (r0 != 0) goto Lb
            goto L10
        Lb:
            javax.mail.Folder[] r2 = r1.u(r0, r2)
            return r2
        L10:
            javax.mail.Folder[] r2 = super.getUserNamespaces(r2)
            return r2
    }

    int h() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    int i() {
            r1 = this;
            int r0 = r1.h
            return r0
    }

    public synchronized boolean isConnected() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.x     // Catch: java.lang.Throwable -> Lb
            if (r0 != 0) goto Ld
            r0 = 0
            super/*javax.mail.Service*/.setConnected(r0)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)
            return r0
        Lb:
            r0 = move-exception
            goto L2c
        Ld:
            r0 = 0
            com.sun.mail.imap.protocol.h r0 = r2.n()     // Catch: java.lang.Throwable -> L19 com.sun.mail.iap.ProtocolException -> L1b
            r0.r0()     // Catch: java.lang.Throwable -> L19 com.sun.mail.iap.ProtocolException -> L1b
        L15:
            r2.w(r0)     // Catch: java.lang.Throwable -> Lb
            goto L26
        L19:
            r1 = move-exception
            goto L22
        L1b:
            if (r0 != 0) goto L15
            r2.c()     // Catch: java.lang.Throwable -> L19
            goto L15
        L22:
            r2.w(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1     // Catch: java.lang.Throwable -> Lb
        L26:
            boolean r0 = super/*javax.mail.Service*/.isConnected()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)
            return r0
        L2c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    com.sun.mail.imap.protocol.h k(com.sun.mail.imap.e r12) throws javax.mail.MessagingException {
            r11 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 == 0) goto L5
            return r1
        L5:
            com.sun.mail.imap.k$a r2 = r11.z
            monitor-enter(r2)
            com.sun.mail.imap.k$a r3 = r11.z     // Catch: java.lang.Throwable -> L32
            java.util.Vector r3 = com.sun.mail.imap.k.a.c(r3)     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L32
            if (r3 != 0) goto L81
            com.sun.mail.imap.k$a r3 = r11.z     // Catch: java.lang.Throwable -> L32
            java.util.Vector r3 = com.sun.mail.imap.k.a.c(r3)     // Catch: java.lang.Throwable -> L32
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L32
            r4 = 1
            if (r3 != r4) goto L36
            com.sun.mail.imap.k$a r3 = r11.z     // Catch: java.lang.Throwable -> L32
            boolean r3 = com.sun.mail.imap.k.a.d(r3)     // Catch: java.lang.Throwable -> L32
            if (r3 != 0) goto L81
            com.sun.mail.imap.k$a r3 = r11.z     // Catch: java.lang.Throwable -> L32
            boolean r3 = com.sun.mail.imap.k.a.e(r3)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L36
            goto L81
        L32:
            r0 = move-exception
            r12 = r0
            goto L113
        L36:
            boolean r1 = r11.debug     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L48
            java.io.PrintStream r1 = r11.y     // Catch: java.lang.Throwable -> L32
            com.sun.mail.imap.k$a r3 = r11.z     // Catch: java.lang.Throwable -> L32
            java.util.Vector r3 = com.sun.mail.imap.k.a.c(r3)     // Catch: java.lang.Throwable -> L32
            r3.size()     // Catch: java.lang.Throwable -> L32
            r1.getClass()     // Catch: java.lang.Throwable -> L32
        L48:
            com.sun.mail.imap.k$a r1 = r11.z     // Catch: java.lang.Throwable -> L32
            java.util.Vector r1 = com.sun.mail.imap.k.a.c(r1)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.lastElement()     // Catch: java.lang.Throwable -> L32
            com.sun.mail.imap.protocol.h r1 = (com.sun.mail.imap.protocol.h) r1     // Catch: java.lang.Throwable -> L32
            com.sun.mail.imap.k$a r3 = r11.z     // Catch: java.lang.Throwable -> L32
            java.util.Vector r3 = com.sun.mail.imap.k.a.c(r3)     // Catch: java.lang.Throwable -> L32
            r3.removeElement(r1)     // Catch: java.lang.Throwable -> L32
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L32
            long r5 = r1.g()     // Catch: java.lang.Throwable -> L32
            long r3 = r3 - r5
            com.sun.mail.imap.k$a r5 = r11.z     // Catch: java.lang.Throwable -> L32
            long r5 = com.sun.mail.imap.k.a.u(r5)     // Catch: java.lang.Throwable -> L32
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L7c
            r1.r0()     // Catch: java.lang.Throwable -> L32 com.sun.mail.iap.ProtocolException -> L74
            goto L7c
        L74:
            r1.m(r11)     // Catch: java.lang.Throwable -> L7a
            r1.c()     // Catch: java.lang.Throwable -> L7a
        L7a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L32
            goto L1
        L7c:
            r1.m(r11)     // Catch: java.lang.Throwable -> L32
            goto Le8
        L81:
            boolean r3 = r11.debug     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L8a
            java.io.PrintStream r3 = r11.y     // Catch: java.lang.Throwable -> L32
            r3.getClass()     // Catch: java.lang.Throwable -> L32
        L8a:
            boolean r3 = r11.v     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L96
            if (r3 == 0) goto Lb4
            java.lang.String r3 = r11.i     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L96 java.net.UnknownHostException -> L98
            java.net.InetAddress r3 = java.net.InetAddress.getByName(r3)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L96 java.net.UnknownHostException -> L98
            r4 = r3
            goto L99
        L96:
            goto Ldd
        L98:
            r4 = r0
        L99:
            javax.mail.Session r3 = r11.session     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L96
            int r5 = r11.d     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L96
            java.lang.String r6 = r11.a     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L96
            java.lang.String r8 = r11.j     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L96
            r7 = 0
            javax.mail.PasswordAuthentication r3 = r3.requestPasswordAuthentication(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L96
            if (r3 == 0) goto Lb4
            java.lang.String r4 = r3.getUserName()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L96
            r11.j = r4     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L96
            java.lang.String r3 = r3.getPassword()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L96
            r11.k = r3     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L96
        Lb4:
            com.sun.mail.imap.protocol.h r3 = new com.sun.mail.imap.protocol.h     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L96
            java.lang.String r4 = r11.a     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L96
            java.lang.String r5 = r11.i     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L96
            int r6 = r11.d     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L96
            javax.mail.Session r7 = r11.session     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L96
            boolean r7 = r7.getDebug()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L96
            javax.mail.Session r8 = r11.session     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L96
            java.io.PrintStream r8 = r8.getDebugOut()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L96
            javax.mail.Session r9 = r11.session     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L96
            java.util.Properties r9 = r9.getProperties()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L96
            boolean r10 = r11.c     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L96
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L96
            java.lang.String r1 = r11.j     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> Ldb
            java.lang.String r4 = r11.k     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> Ldb
            r11.t(r3, r1, r4)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> Ldb
            goto Le5
        Ldb:
            r1 = r3
        Ldd:
            if (r1 == 0) goto Le4
            r1.c()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> Le3
            goto Le4
        Le3:
        Le4:
            r3 = r0
        Le5:
            if (r3 == 0) goto L10b
            r1 = r3
        Le8:
            r11.z()     // Catch: java.lang.Throwable -> L32
            if (r12 == 0) goto L108
            com.sun.mail.imap.k$a r3 = r11.z     // Catch: java.lang.Throwable -> L32
            java.util.Vector r3 = com.sun.mail.imap.k.a.f(r3)     // Catch: java.lang.Throwable -> L32
            if (r3 != 0) goto Lff
            com.sun.mail.imap.k$a r3 = r11.z     // Catch: java.lang.Throwable -> L32
            java.util.Vector r4 = new java.util.Vector     // Catch: java.lang.Throwable -> L32
            r4.<init>()     // Catch: java.lang.Throwable -> L32
            com.sun.mail.imap.k.a.g(r3, r4)     // Catch: java.lang.Throwable -> L32
        Lff:
            com.sun.mail.imap.k$a r3 = r11.z     // Catch: java.lang.Throwable -> L32
            java.util.Vector r3 = com.sun.mail.imap.k.a.f(r3)     // Catch: java.lang.Throwable -> L32
            r3.addElement(r12)     // Catch: java.lang.Throwable -> L32
        L108:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L32
            goto L2
        L10b:
            javax.mail.MessagingException r12 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "connection failure"
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L32
            throw r12     // Catch: java.lang.Throwable -> L32
        L113:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L32
            throw r12
    }

    javax.mail.Session l() {
            r1 = this;
            javax.mail.Session r0 = r1.session
            return r0
    }

    int m() {
            r1 = this;
            int r0 = r1.f
            return r0
    }

    com.sun.mail.imap.protocol.h n() throws com.sun.mail.iap.ProtocolException {
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            if (r1 == 0) goto L5
            return r1
        L5:
            com.sun.mail.imap.k$a r2 = r11.z
            monitor-enter(r2)
            r11.A()     // Catch: java.lang.Throwable -> L25
            com.sun.mail.imap.k$a r3 = r11.z     // Catch: java.lang.Throwable -> L25
            java.util.Vector r3 = com.sun.mail.imap.k.a.c(r3)     // Catch: java.lang.Throwable -> L25
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L72
            com.sun.mail.imap.k$a r3 = r11.z     // Catch: java.lang.Throwable -> L25
            boolean r3 = com.sun.mail.imap.k.a.p(r3)     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L28
            java.io.PrintStream r3 = r11.y     // Catch: java.lang.Throwable -> L25
            r3.getClass()     // Catch: java.lang.Throwable -> L25
            goto L28
        L25:
            r0 = move-exception
            goto Lbe
        L28:
            com.sun.mail.imap.protocol.h r3 = new com.sun.mail.imap.protocol.h     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L52
            java.lang.String r4 = r11.a     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L52
            java.lang.String r5 = r11.i     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L52
            int r6 = r11.d     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L52
            javax.mail.Session r7 = r11.session     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L52
            boolean r7 = r7.getDebug()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L52
            javax.mail.Session r8 = r11.session     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L52
            java.io.PrintStream r8 = r8.getDebugOut()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L52
            javax.mail.Session r9 = r11.session     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L52
            java.util.Properties r9 = r9.getProperties()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L52
            boolean r10 = r11.c     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L52
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L52
            java.lang.String r1 = r11.j     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L4f
            java.lang.String r4 = r11.k     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L4f
            r11.t(r3, r1, r4)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L4f
            goto L5b
        L4f:
            r1 = r3
            goto L53
        L52:
        L53:
            if (r1 == 0) goto L5a
            r1.n0()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L59
            goto L5a
        L59:
        L5a:
            r3 = r0
        L5b:
            if (r3 == 0) goto L6a
            r3.a(r11)     // Catch: java.lang.Throwable -> L25
            com.sun.mail.imap.k$a r1 = r11.z     // Catch: java.lang.Throwable -> L25
            java.util.Vector r1 = com.sun.mail.imap.k.a.c(r1)     // Catch: java.lang.Throwable -> L25
            r1.addElement(r3)     // Catch: java.lang.Throwable -> L25
            goto L95
        L6a:
            com.sun.mail.iap.ConnectionException r0 = new com.sun.mail.iap.ConnectionException     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = "failed to create new store connection"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L25
            throw r0     // Catch: java.lang.Throwable -> L25
        L72:
            com.sun.mail.imap.k$a r1 = r11.z     // Catch: java.lang.Throwable -> L25
            boolean r1 = com.sun.mail.imap.k.a.p(r1)     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L88
            java.io.PrintStream r1 = r11.y     // Catch: java.lang.Throwable -> L25
            com.sun.mail.imap.k$a r3 = r11.z     // Catch: java.lang.Throwable -> L25
            java.util.Vector r3 = com.sun.mail.imap.k.a.c(r3)     // Catch: java.lang.Throwable -> L25
            r3.size()     // Catch: java.lang.Throwable -> L25
            r1.getClass()     // Catch: java.lang.Throwable -> L25
        L88:
            com.sun.mail.imap.k$a r1 = r11.z     // Catch: java.lang.Throwable -> L25
            java.util.Vector r1 = com.sun.mail.imap.k.a.c(r1)     // Catch: java.lang.Throwable -> L25
            java.lang.Object r1 = r1.firstElement()     // Catch: java.lang.Throwable -> L25
            r3 = r1
            com.sun.mail.imap.protocol.h r3 = (com.sun.mail.imap.protocol.h) r3     // Catch: java.lang.Throwable -> L25
        L95:
            com.sun.mail.imap.k$a r1 = r11.z     // Catch: java.lang.Throwable -> L25
            boolean r1 = com.sun.mail.imap.k.a.e(r1)     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto La4
            com.sun.mail.imap.k$a r1 = r11.z     // Catch: java.lang.Throwable -> L25 java.lang.InterruptedException -> La2
            r1.wait()     // Catch: java.lang.Throwable -> L25 java.lang.InterruptedException -> La2
        La2:
            r1 = r0
            goto Lb8
        La4:
            com.sun.mail.imap.k$a r1 = r11.z     // Catch: java.lang.Throwable -> L25
            r4 = 1
            com.sun.mail.imap.k.a.h(r1, r4)     // Catch: java.lang.Throwable -> L25
            com.sun.mail.imap.k$a r1 = r11.z     // Catch: java.lang.Throwable -> L25
            boolean r1 = com.sun.mail.imap.k.a.p(r1)     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto Lb7
            java.io.PrintStream r1 = r11.y     // Catch: java.lang.Throwable -> L25
            r1.getClass()     // Catch: java.lang.Throwable -> L25
        Lb7:
            r1 = r3
        Lb8:
            r11.z()     // Catch: java.lang.Throwable -> L25
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            goto L2
        Lbe:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            throw r0
    }

    void o(com.sun.mail.iap.g r7) {
            r6 = this;
            java.lang.String r0 = r7.b()
            java.lang.String r1 = "["
            boolean r1 = r0.startsWith(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            r1 = 93
            int r1 = r0.indexOf(r1)
            if (r1 <= 0) goto L25
            int r4 = r1 + 1
            java.lang.String r4 = r0.substring(r3, r4)
            java.lang.String r5 = "[ALERT]"
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 == 0) goto L25
            r3 = 1
        L25:
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r0 = r0.trim()
        L2e:
            if (r3 == 0) goto L34
            r6.notifyStoreListeners(r2, r0)
            return
        L34:
            boolean r7 = r7.k()
            if (r7 == 0) goto L44
            int r7 = r0.length()
            if (r7 <= 0) goto L44
            r7 = 2
            r6.notifyStoreListeners(r7, r0)
        L44:
            return
    }

    public synchronized boolean p(java.lang.String r4) throws javax.mail.MessagingException {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            com.sun.mail.imap.protocol.h r0 = r3.n()     // Catch: java.lang.Throwable -> L11 com.sun.mail.iap.ProtocolException -> L13
            boolean r4 = r0.e0(r4)     // Catch: java.lang.Throwable -> L11 com.sun.mail.iap.ProtocolException -> L13
            r3.w(r0)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r3)
            return r4
        Lf:
            r4 = move-exception
            goto L27
        L11:
            r4 = move-exception
            goto L23
        L13:
            r4 = move-exception
            if (r0 != 0) goto L19
            r3.c()     // Catch: java.lang.Throwable -> L11
        L19:
            javax.mail.MessagingException r1 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r4.getMessage()     // Catch: java.lang.Throwable -> L11
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L11
            throw r1     // Catch: java.lang.Throwable -> L11
        L23:
            r3.w(r0)     // Catch: java.lang.Throwable -> Lf
            throw r4     // Catch: java.lang.Throwable -> Lf
        L27:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lf
            throw r4
    }

    protected synchronized boolean protocolConnect(java.lang.String r11, int r12, java.lang.String r13, java.lang.String r14) throws javax.mail.MessagingException {
            r10 = this;
            monitor-enter(r10)
            if (r11 == 0) goto Ld2
            if (r14 == 0) goto Ld2
            if (r13 != 0) goto L9
            goto Ld2
        L9:
            r0 = -1
            if (r12 == r0) goto L13
            r10.d = r12     // Catch: java.lang.Throwable -> Lf
            goto L36
        Lf:
            r0 = move-exception
            r11 = r0
            goto Lde
        L13:
            javax.mail.Session r12 = r10.session     // Catch: java.lang.Throwable -> Lf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = "mail."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = r10.a     // Catch: java.lang.Throwable -> Lf
            r1.append(r2)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = ".port"
            r1.append(r2)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r12 = r12.getProperty(r1)     // Catch: java.lang.Throwable -> Lf
            if (r12 == 0) goto L36
            int r12 = java.lang.Integer.parseInt(r12)     // Catch: java.lang.Throwable -> Lf
            r10.d = r12     // Catch: java.lang.Throwable -> Lf
        L36:
            int r12 = r10.d     // Catch: java.lang.Throwable -> Lf
            if (r12 != r0) goto L3e
            int r12 = r10.b     // Catch: java.lang.Throwable -> Lf
            r10.d = r12     // Catch: java.lang.Throwable -> Lf
        L3e:
            r12 = 0
            com.sun.mail.imap.k$a r1 = r10.z     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L77 com.sun.mail.iap.ProtocolException -> L7a com.sun.mail.iap.CommandFailedException -> L9f
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L77 com.sun.mail.iap.ProtocolException -> L7a com.sun.mail.iap.CommandFailedException -> L9f
            com.sun.mail.imap.k$a r0 = r10.z     // Catch: java.lang.Throwable -> La7
            java.util.Vector r0 = com.sun.mail.imap.k.a.c(r0)     // Catch: java.lang.Throwable -> La7
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> La7
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto La2
            com.sun.mail.imap.protocol.h r2 = new com.sun.mail.imap.protocol.h     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L77 com.sun.mail.iap.ProtocolException -> L7a com.sun.mail.iap.CommandFailedException -> L9f
            java.lang.String r3 = r10.a     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L77 com.sun.mail.iap.ProtocolException -> L7a com.sun.mail.iap.CommandFailedException -> L9f
            int r5 = r10.d     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L77 com.sun.mail.iap.ProtocolException -> L7a com.sun.mail.iap.CommandFailedException -> L9f
            javax.mail.Session r0 = r10.session     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L77 com.sun.mail.iap.ProtocolException -> L7a com.sun.mail.iap.CommandFailedException -> L9f
            boolean r6 = r0.getDebug()     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L77 com.sun.mail.iap.ProtocolException -> L7a com.sun.mail.iap.CommandFailedException -> L9f
            javax.mail.Session r0 = r10.session     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L77 com.sun.mail.iap.ProtocolException -> L7a com.sun.mail.iap.CommandFailedException -> L9f
            java.io.PrintStream r7 = r0.getDebugOut()     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L77 com.sun.mail.iap.ProtocolException -> L7a com.sun.mail.iap.CommandFailedException -> L9f
            javax.mail.Session r0 = r10.session     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L77 com.sun.mail.iap.ProtocolException -> L7a com.sun.mail.iap.CommandFailedException -> L9f
            java.util.Properties r8 = r0.getProperties()     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L77 com.sun.mail.iap.ProtocolException -> L7a com.sun.mail.iap.CommandFailedException -> L9f
            boolean r9 = r10.c     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L77 com.sun.mail.iap.ProtocolException -> L7a com.sun.mail.iap.CommandFailedException -> L9f
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L77 com.sun.mail.iap.ProtocolException -> L7a com.sun.mail.iap.CommandFailedException -> L9f
            boolean r11 = r10.debug     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L77 com.sun.mail.iap.ProtocolException -> L7a com.sun.mail.iap.CommandFailedException -> L7d
            if (r11 == 0) goto L81
            java.io.PrintStream r11 = r10.y     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L77 com.sun.mail.iap.ProtocolException -> L7a com.sun.mail.iap.CommandFailedException -> L7d
            r11.getClass()     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L77 com.sun.mail.iap.ProtocolException -> L7a com.sun.mail.iap.CommandFailedException -> L7d
            goto L81
        L77:
            r0 = move-exception
            r11 = r0
            goto Lab
        L7a:
            r0 = move-exception
            r11 = r0
            goto Lb5
        L7d:
            r0 = move-exception
            r11 = r0
            r12 = r2
            goto Lbf
        L81:
            r10.t(r2, r13, r14)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L77 com.sun.mail.iap.ProtocolException -> L7a com.sun.mail.iap.CommandFailedException -> L7d
            r2.a(r10)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L77 com.sun.mail.iap.ProtocolException -> L7a com.sun.mail.iap.CommandFailedException -> L7d
            r10.i = r4     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L77 com.sun.mail.iap.ProtocolException -> L7a com.sun.mail.iap.CommandFailedException -> L7d
            r10.j = r13     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L77 com.sun.mail.iap.ProtocolException -> L7a com.sun.mail.iap.CommandFailedException -> L7d
            r10.k = r14     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L77 com.sun.mail.iap.ProtocolException -> L7a com.sun.mail.iap.CommandFailedException -> L7d
            com.sun.mail.imap.k$a r11 = r10.z     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L77 com.sun.mail.iap.ProtocolException -> L7a com.sun.mail.iap.CommandFailedException -> L7d
            monitor-enter(r11)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L77 com.sun.mail.iap.ProtocolException -> L7a com.sun.mail.iap.CommandFailedException -> L7d
            com.sun.mail.imap.k$a r12 = r10.z     // Catch: java.lang.Throwable -> L9b
            java.util.Vector r12 = com.sun.mail.imap.k.a.c(r12)     // Catch: java.lang.Throwable -> L9b
            r12.addElement(r2)     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L9b
            goto La2
        L9b:
            r0 = move-exception
            r12 = r0
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L9b
            throw r12     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L77 com.sun.mail.iap.ProtocolException -> L7a com.sun.mail.iap.CommandFailedException -> L7d
        L9f:
            r0 = move-exception
            r11 = r0
            goto Lbf
        La2:
            r11 = 1
            r10.x = r11     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r10)
            return r11
        La7:
            r0 = move-exception
            r11 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La7
            throw r11     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L77 com.sun.mail.iap.ProtocolException -> L7a com.sun.mail.iap.CommandFailedException -> L9f
        Lab:
            javax.mail.MessagingException r12 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> Lf
            java.lang.String r13 = r11.getMessage()     // Catch: java.lang.Throwable -> Lf
            r12.<init>(r13, r11)     // Catch: java.lang.Throwable -> Lf
            throw r12     // Catch: java.lang.Throwable -> Lf
        Lb5:
            javax.mail.MessagingException r12 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> Lf
            java.lang.String r13 = r11.getMessage()     // Catch: java.lang.Throwable -> Lf
            r12.<init>(r13, r11)     // Catch: java.lang.Throwable -> Lf
            throw r12     // Catch: java.lang.Throwable -> Lf
        Lbf:
            if (r12 == 0) goto Lc4
            r12.c()     // Catch: java.lang.Throwable -> Lf
        Lc4:
            javax.mail.AuthenticationFailedException r12 = new javax.mail.AuthenticationFailedException     // Catch: java.lang.Throwable -> Lf
            com.sun.mail.iap.g r11 = r11.getResponse()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r11 = r11.b()     // Catch: java.lang.Throwable -> Lf
            r12.<init>(r11)     // Catch: java.lang.Throwable -> Lf
            throw r12     // Catch: java.lang.Throwable -> Lf
        Ld2:
            boolean r11 = r10.debug     // Catch: java.lang.Throwable -> Lf
            if (r11 == 0) goto Ldb
            java.io.PrintStream r11 = r10.y     // Catch: java.lang.Throwable -> Lf
            r11.getClass()     // Catch: java.lang.Throwable -> Lf
        Ldb:
            monitor-exit(r10)
            r11 = 0
            return r11
        Lde:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lf
            throw r11
    }

    boolean q() {
            r1 = this;
            com.sun.mail.imap.k$a r0 = r1.z
            boolean r0 = com.sun.mail.imap.k.a.d(r0)
            return r0
    }

    public void r() throws javax.mail.MessagingException {
            r5 = this;
            monitor-enter(r5)
            r5.checkConnected()     // Catch: java.lang.Throwable -> Ldc
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Ldc
            r0 = 0
            com.sun.mail.imap.k$a r1 = r5.z     // Catch: java.lang.Throwable -> L9f com.sun.mail.iap.ProtocolException -> La2 com.sun.mail.iap.ConnectionException -> La5 com.sun.mail.iap.BadCommandException -> La8
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L9f com.sun.mail.iap.ProtocolException -> La2 com.sun.mail.iap.ConnectionException -> La5 com.sun.mail.iap.BadCommandException -> La8
            com.sun.mail.imap.protocol.h r2 = r5.n()     // Catch: java.lang.Throwable -> L9b
            com.sun.mail.imap.k$a r3 = r5.z     // Catch: java.lang.Throwable -> L7e
            int r3 = com.sun.mail.imap.k.a.l(r3)     // Catch: java.lang.Throwable -> L7e
            if (r3 != 0) goto L80
            r2.g0()     // Catch: java.lang.Throwable -> L7e
            com.sun.mail.imap.k$a r3 = r5.z     // Catch: java.lang.Throwable -> L7e
            r4 = 1
            com.sun.mail.imap.k.a.n(r3, r4)     // Catch: java.lang.Throwable -> L7e
            com.sun.mail.imap.k$a r3 = r5.z     // Catch: java.lang.Throwable -> L7e
            com.sun.mail.imap.k.a.k(r3, r2)     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7e
        L24:
            com.sun.mail.iap.g r1 = r2.z0()     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4c com.sun.mail.iap.ConnectionException -> L4e com.sun.mail.iap.BadCommandException -> L51
            com.sun.mail.imap.k$a r3 = r5.z     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4c com.sun.mail.iap.ConnectionException -> L4e com.sun.mail.iap.BadCommandException -> L51
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4c com.sun.mail.iap.ConnectionException -> L4e com.sun.mail.iap.BadCommandException -> L51
            if (r1 == 0) goto L56
            boolean r4 = r2.x0(r1)     // Catch: java.lang.Throwable -> L54
            if (r4 != 0) goto L34
            goto L56
        L34:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L54
            boolean r3 = r5.w     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4c com.sun.mail.iap.ConnectionException -> L4e com.sun.mail.iap.BadCommandException -> L51
            if (r3 == 0) goto L24
            boolean r3 = r1.k()     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4c com.sun.mail.iap.ConnectionException -> L4e com.sun.mail.iap.BadCommandException -> L51
            if (r3 == 0) goto L24
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4c com.sun.mail.iap.ConnectionException -> L4e com.sun.mail.iap.BadCommandException -> L51
            r3 = 1000(0x3e8, float:1.401E-42)
            r5.notifyStoreListeners(r3, r1)     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4c com.sun.mail.iap.ConnectionException -> L4e com.sun.mail.iap.BadCommandException -> L51
            goto L24
        L49:
            r1 = move-exception
            goto Lc7
        L4c:
            r1 = move-exception
            goto Lab
        L4e:
            r1 = move-exception
            goto Lb5
        L51:
            r1 = move-exception
            goto Lbf
        L54:
            r1 = move-exception
            goto L7c
        L56:
            com.sun.mail.imap.k$a r1 = r5.z     // Catch: java.lang.Throwable -> L54
            r4 = 0
            com.sun.mail.imap.k.a.n(r1, r4)     // Catch: java.lang.Throwable -> L54
            com.sun.mail.imap.k$a r1 = r5.z     // Catch: java.lang.Throwable -> L54
            r1.notifyAll()     // Catch: java.lang.Throwable -> L54
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L54
            int r1 = r5.i()     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4c com.sun.mail.iap.ConnectionException -> L4e com.sun.mail.iap.BadCommandException -> L51
            if (r1 <= 0) goto L6c
            long r3 = (long) r1
            java.lang.Thread.sleep(r3)     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4c com.sun.mail.iap.ConnectionException -> L4e com.sun.mail.iap.BadCommandException -> L51 java.lang.InterruptedException -> L6c
        L6c:
            com.sun.mail.imap.k$a r1 = r5.z
            monitor-enter(r1)
            com.sun.mail.imap.k$a r3 = r5.z     // Catch: java.lang.Throwable -> L79
            com.sun.mail.imap.k.a.k(r3, r0)     // Catch: java.lang.Throwable -> L79
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L79
            r5.w(r2)
            return
        L79:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L79
            throw r0
        L7c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L54
            throw r1     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4c com.sun.mail.iap.ConnectionException -> L4e com.sun.mail.iap.BadCommandException -> L51
        L7e:
            r3 = move-exception
            goto L9d
        L80:
            com.sun.mail.imap.k$a r3 = r5.z     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L85
            r3.wait()     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L85
        L85:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7e
            com.sun.mail.imap.k$a r3 = r5.z
            monitor-enter(r3)
            com.sun.mail.imap.k$a r1 = r5.z     // Catch: java.lang.Throwable -> L98
            com.sun.mail.imap.k.a.k(r1, r0)     // Catch: java.lang.Throwable -> L98
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L98
            r5.w(r2)
            if (r2 != 0) goto L97
            r5.c()
        L97:
            return
        L98:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L98
            throw r0
        L9b:
            r3 = move-exception
            r2 = r0
        L9d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7e
            throw r3     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4c com.sun.mail.iap.ConnectionException -> L4e com.sun.mail.iap.BadCommandException -> L51
        L9f:
            r1 = move-exception
            r2 = r0
            goto Lc7
        La2:
            r1 = move-exception
            r2 = r0
            goto Lab
        La5:
            r1 = move-exception
            r2 = r0
            goto Lb5
        La8:
            r1 = move-exception
            r2 = r0
            goto Lbf
        Lab:
            javax.mail.MessagingException r3 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = r1.getMessage()     // Catch: java.lang.Throwable -> L49
            r3.<init>(r4, r1)     // Catch: java.lang.Throwable -> L49
            throw r3     // Catch: java.lang.Throwable -> L49
        Lb5:
            javax.mail.StoreClosedException r3 = new javax.mail.StoreClosedException     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L49
            r3.<init>(r5, r1)     // Catch: java.lang.Throwable -> L49
            throw r3     // Catch: java.lang.Throwable -> L49
        Lbf:
            javax.mail.MessagingException r3 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = "IDLE not supported"
            r3.<init>(r4, r1)     // Catch: java.lang.Throwable -> L49
            throw r3     // Catch: java.lang.Throwable -> L49
        Lc7:
            com.sun.mail.imap.k$a r3 = r5.z
            monitor-enter(r3)
            com.sun.mail.imap.k$a r4 = r5.z     // Catch: java.lang.Throwable -> Ld9
            com.sun.mail.imap.k.a.k(r4, r0)     // Catch: java.lang.Throwable -> Ld9
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld9
            r5.w(r2)
            if (r2 != 0) goto Ld8
            r5.c()
        Ld8:
            throw r1
        Ld9:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld9
            throw r0
        Ldc:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Ldc
            throw r0
    }

    boolean s() {
            r3 = this;
            com.sun.mail.imap.k$a r0 = r3.z
            monitor-enter(r0)
            com.sun.mail.imap.k$a r1 = r3.z     // Catch: java.lang.Throwable -> L1f
            boolean r1 = com.sun.mail.imap.k.a.p(r1)     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L21
            java.io.PrintStream r1 = r3.y     // Catch: java.lang.Throwable -> L1f
            com.sun.mail.imap.k$a r2 = r3.z     // Catch: java.lang.Throwable -> L1f
            java.util.Vector r2 = com.sun.mail.imap.k.a.c(r2)     // Catch: java.lang.Throwable -> L1f
            r2.size()     // Catch: java.lang.Throwable -> L1f
            com.sun.mail.imap.k$a r2 = r3.z     // Catch: java.lang.Throwable -> L1f
            com.sun.mail.imap.k.a.q(r2)     // Catch: java.lang.Throwable -> L1f
            r1.getClass()     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r1 = move-exception
            goto L38
        L21:
            com.sun.mail.imap.k$a r1 = r3.z     // Catch: java.lang.Throwable -> L1f
            java.util.Vector r1 = com.sun.mail.imap.k.a.c(r1)     // Catch: java.lang.Throwable -> L1f
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L1f
            com.sun.mail.imap.k$a r2 = r3.z     // Catch: java.lang.Throwable -> L1f
            int r2 = com.sun.mail.imap.k.a.q(r2)     // Catch: java.lang.Throwable -> L1f
            if (r1 < r2) goto L35
            r1 = 1
            goto L36
        L35:
            r1 = 0
        L36:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            return r1
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r1
    }

    public synchronized void setQuota(javax.mail.Quota r4) throws javax.mail.MessagingException {
            r3 = this;
            monitor-enter(r3)
            r3.checkConnected()     // Catch: java.lang.Throwable -> L11
            r0 = 0
            com.sun.mail.imap.protocol.h r0 = r3.n()     // Catch: java.lang.Throwable -> L13 com.sun.mail.iap.ProtocolException -> L15 com.sun.mail.iap.ConnectionException -> L17 com.sun.mail.iap.BadCommandException -> L19
            r0.I0(r4)     // Catch: java.lang.Throwable -> L13 com.sun.mail.iap.ProtocolException -> L15 com.sun.mail.iap.ConnectionException -> L17 com.sun.mail.iap.BadCommandException -> L19
            r3.w(r0)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r3)
            return
        L11:
            r4 = move-exception
            goto L40
        L13:
            r4 = move-exception
            goto L37
        L15:
            r4 = move-exception
            goto L1b
        L17:
            r4 = move-exception
            goto L25
        L19:
            r4 = move-exception
            goto L2f
        L1b:
            javax.mail.MessagingException r1 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = r4.getMessage()     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L13
            throw r1     // Catch: java.lang.Throwable -> L13
        L25:
            javax.mail.StoreClosedException r1 = new javax.mail.StoreClosedException     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L13
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L13
            throw r1     // Catch: java.lang.Throwable -> L13
        L2f:
            javax.mail.MessagingException r1 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = "QUOTA not supported"
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L13
            throw r1     // Catch: java.lang.Throwable -> L13
        L37:
            r3.w(r0)     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L3f
            r3.c()     // Catch: java.lang.Throwable -> L11
        L3f:
            throw r4     // Catch: java.lang.Throwable -> L11
        L40:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            throw r4
    }

    void v(com.sun.mail.imap.e r3, com.sun.mail.imap.protocol.h r4) {
            r2 = this;
            com.sun.mail.imap.k$a r0 = r2.z
            monitor-enter(r0)
            if (r4 == 0) goto L38
            boolean r1 = r2.s()     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto L2c
            r4.a(r2)     // Catch: java.lang.Throwable -> L2a
            com.sun.mail.imap.k$a r1 = r2.z     // Catch: java.lang.Throwable -> L2a
            java.util.Vector r1 = com.sun.mail.imap.k.a.c(r1)     // Catch: java.lang.Throwable -> L2a
            r1.addElement(r4)     // Catch: java.lang.Throwable -> L2a
            boolean r4 = r2.debug     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L38
            java.io.PrintStream r4 = r2.y     // Catch: java.lang.Throwable -> L2a
            com.sun.mail.imap.k$a r1 = r2.z     // Catch: java.lang.Throwable -> L2a
            java.util.Vector r1 = com.sun.mail.imap.k.a.c(r1)     // Catch: java.lang.Throwable -> L2a
            r1.size()     // Catch: java.lang.Throwable -> L2a
            r4.getClass()     // Catch: java.lang.Throwable -> L2a
            goto L38
        L2a:
            r3 = move-exception
            goto L4e
        L2c:
            boolean r1 = r2.debug     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L35
            java.io.PrintStream r1 = r2.y     // Catch: java.lang.Throwable -> L2a
            r1.getClass()     // Catch: java.lang.Throwable -> L2a
        L35:
            r4.n0()     // Catch: java.lang.Throwable -> L2a com.sun.mail.iap.ProtocolException -> L38
        L38:
            com.sun.mail.imap.k$a r4 = r2.z     // Catch: java.lang.Throwable -> L2a
            java.util.Vector r4 = com.sun.mail.imap.k.a.f(r4)     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L49
            com.sun.mail.imap.k$a r4 = r2.z     // Catch: java.lang.Throwable -> L2a
            java.util.Vector r4 = com.sun.mail.imap.k.a.f(r4)     // Catch: java.lang.Throwable -> L2a
            r4.removeElement(r3)     // Catch: java.lang.Throwable -> L2a
        L49:
            r2.z()     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            return
        L4e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r3
    }

    void w(com.sun.mail.imap.protocol.h r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            com.sun.mail.imap.k$a r3 = r2.z
            monitor-enter(r3)
            com.sun.mail.imap.k$a r0 = r2.z     // Catch: java.lang.Throwable -> L1f
            r1 = 0
            com.sun.mail.imap.k.a.h(r0, r1)     // Catch: java.lang.Throwable -> L1f
            com.sun.mail.imap.k$a r0 = r2.z     // Catch: java.lang.Throwable -> L1f
            r0.notifyAll()     // Catch: java.lang.Throwable -> L1f
            com.sun.mail.imap.k$a r0 = r2.z     // Catch: java.lang.Throwable -> L1f
            boolean r0 = com.sun.mail.imap.k.a.p(r0)     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L21
            java.io.PrintStream r0 = r2.y     // Catch: java.lang.Throwable -> L1f
            r0.getClass()     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r0 = move-exception
            goto L26
        L21:
            r2.z()     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1f
            return
        L26:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1f
            throw r0
    }

    public synchronized void x(java.lang.String r1) {
            r0 = this;
            monitor-enter(r0)
            r0.k = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    public synchronized void y(java.lang.String r1) {
            r0 = this;
            monitor-enter(r0)
            r0.j = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }
}
