package com.sun.mail.imap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class e extends javax.mail.Folder implements javax.mail.UIDFolder, com.sun.mail.iap.h {
    protected static final char C = 65535;
    private static final int D = 0;
    private static final int E = 1;
    private static final int F = 2;
    static final /* synthetic */ boolean G = false;
    private java.io.PrintStream A;
    private boolean B;
    protected java.lang.String a;
    protected java.lang.String b;
    protected int c;
    protected char d;
    protected javax.mail.Flags e;
    protected javax.mail.Flags f;
    protected boolean g;
    protected boolean h;
    protected java.lang.String[] i;
    protected com.sun.mail.imap.protocol.h j;
    protected java.util.Vector k;
    protected java.lang.Object l;
    protected java.util.Hashtable m;
    private boolean n;
    private boolean o;
    private int p;
    private int r;
    private int s;
    private int t;
    private long u;
    private long v;
    private boolean w;
    private com.sun.mail.imap.protocol.u x;
    private long y;
    private boolean z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.sun.mail.imap.e.u {
        final /* synthetic */ com.sun.mail.imap.e a;
        private final /* synthetic */ javax.mail.Flags b;
        private final /* synthetic */ java.util.Date c;
        private final /* synthetic */ com.sun.mail.imap.m d;

        a(com.sun.mail.imap.e r1, javax.mail.Flags r2, java.util.Date r3, com.sun.mail.imap.m r4) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.<init>()
                return
        }

        @Override // com.sun.mail.imap.e.u
        public java.lang.Object a(com.sun.mail.imap.protocol.h r5) throws com.sun.mail.iap.ProtocolException {
                r4 = this;
                com.sun.mail.imap.e r0 = r4.a
                java.lang.String r0 = r0.a
                javax.mail.Flags r1 = r4.b
                java.util.Date r2 = r4.c
                com.sun.mail.imap.m r3 = r4.d
                r5.r(r0, r1, r2, r3)
                r5 = 0
                return r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements com.sun.mail.imap.e.u {
        final /* synthetic */ com.sun.mail.imap.e a;
        private final /* synthetic */ javax.mail.Flags b;
        private final /* synthetic */ java.util.Date c;
        private final /* synthetic */ com.sun.mail.imap.m d;

        b(com.sun.mail.imap.e r1, javax.mail.Flags r2, java.util.Date r3, com.sun.mail.imap.m r4) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.<init>()
                return
        }

        @Override // com.sun.mail.imap.e.u
        public java.lang.Object a(com.sun.mail.imap.protocol.h r5) throws com.sun.mail.iap.ProtocolException {
                r4 = this;
                com.sun.mail.imap.e r0 = r4.a
                java.lang.String r0 = r0.a
                javax.mail.Flags r1 = r4.b
                java.util.Date r2 = r4.c
                com.sun.mail.imap.m r3 = r4.d
                com.sun.mail.imap.b r5 = r5.s(r0, r1, r2, r3)
                return r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements com.sun.mail.imap.e.u {
        final /* synthetic */ com.sun.mail.imap.e a;

        c(com.sun.mail.imap.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.sun.mail.imap.e.u
        public java.lang.Object a(com.sun.mail.imap.protocol.h r2) throws com.sun.mail.iap.ProtocolException {
                r1 = this;
                com.sun.mail.imap.e r0 = r1.a
                java.lang.String r0 = r0.a
                javax.mail.Quota[] r2 = r2.d0(r0)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements com.sun.mail.imap.e.u {
        final /* synthetic */ com.sun.mail.imap.e a;
        private final /* synthetic */ javax.mail.Quota b;

        d(com.sun.mail.imap.e r1, javax.mail.Quota r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // com.sun.mail.imap.e.u
        public java.lang.Object a(com.sun.mail.imap.protocol.h r2) throws com.sun.mail.iap.ProtocolException {
                r1 = this;
                javax.mail.Quota r0 = r1.b
                r2.I0(r0)
                r2 = 0
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.sun.mail.imap.e$e, reason: collision with other inner class name */
    class C0027e implements com.sun.mail.imap.e.u {
        final /* synthetic */ com.sun.mail.imap.e a;

        C0027e(com.sun.mail.imap.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.sun.mail.imap.e.u
        public java.lang.Object a(com.sun.mail.imap.protocol.h r2) throws com.sun.mail.iap.ProtocolException {
                r1 = this;
                com.sun.mail.imap.e r0 = r1.a
                java.lang.String r0 = r0.a
                com.sun.mail.imap.a[] r2 = r2.Y(r0)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f implements com.sun.mail.imap.e.u {
        final /* synthetic */ com.sun.mail.imap.e a;
        private final /* synthetic */ java.lang.String b;

        f(com.sun.mail.imap.e r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // com.sun.mail.imap.e.u
        public java.lang.Object a(com.sun.mail.imap.protocol.h r3) throws com.sun.mail.iap.ProtocolException {
                r2 = this;
                com.sun.mail.imap.e r0 = r2.a
                java.lang.String r0 = r0.a
                java.lang.String r1 = r2.b
                r3.E(r0, r1)
                r3 = 0
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g implements com.sun.mail.imap.e.u {
        final /* synthetic */ com.sun.mail.imap.e a;
        private final /* synthetic */ java.lang.String b;

        g(com.sun.mail.imap.e r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // com.sun.mail.imap.e.u
        public java.lang.Object a(com.sun.mail.imap.protocol.h r3) throws com.sun.mail.iap.ProtocolException {
                r2 = this;
                com.sun.mail.imap.e r0 = r2.a
                java.lang.String r0 = r0.a
                java.lang.String r1 = r2.b
                com.sun.mail.imap.n[] r3 = r3.l0(r0, r1)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class h implements com.sun.mail.imap.e.u {
        final /* synthetic */ com.sun.mail.imap.e a;

        h(com.sun.mail.imap.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.sun.mail.imap.e.u
        public java.lang.Object a(com.sun.mail.imap.protocol.h r2) throws com.sun.mail.iap.ProtocolException {
                r1 = this;
                com.sun.mail.imap.e r0 = r1.a
                java.lang.String r0 = r0.a
                com.sun.mail.imap.n r2 = r2.p0(r0)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class i implements com.sun.mail.imap.e.u {
        final /* synthetic */ com.sun.mail.imap.e a;
        private final /* synthetic */ char b;
        private final /* synthetic */ com.sun.mail.imap.a c;

        i(com.sun.mail.imap.e r1, char r2, com.sun.mail.imap.a r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        @Override // com.sun.mail.imap.e.u
        public java.lang.Object a(com.sun.mail.imap.protocol.h r4) throws com.sun.mail.iap.ProtocolException {
                r3 = this;
                com.sun.mail.imap.e r0 = r3.a
                java.lang.String r0 = r0.a
                char r1 = r3.b
                com.sun.mail.imap.a r2 = r3.c
                r4.G0(r0, r1, r2)
                r4 = 0
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class j implements com.sun.mail.imap.e.u {
        final /* synthetic */ com.sun.mail.imap.e a;

        j(com.sun.mail.imap.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.sun.mail.imap.e.u
        public java.lang.Object a(com.sun.mail.imap.protocol.h r2) throws com.sun.mail.iap.ProtocolException {
                r1 = this;
                com.sun.mail.imap.e r0 = r1.a
                int r0 = com.sun.mail.imap.e.c(r0)
                if (r0 != 0) goto L14
                r2.g0()
                com.sun.mail.imap.e r2 = r1.a
                r0 = 1
                com.sun.mail.imap.e.d(r2, r0)
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                return r2
            L14:
                com.sun.mail.imap.e r2 = r1.a     // Catch: java.lang.InterruptedException -> L1b
                java.lang.Object r2 = r2.l     // Catch: java.lang.InterruptedException -> L1b
                r2.wait()     // Catch: java.lang.InterruptedException -> L1b
            L1b:
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class k implements com.sun.mail.imap.e.u {
        final /* synthetic */ com.sun.mail.imap.e a;
        private final /* synthetic */ java.lang.String b;

        k(com.sun.mail.imap.e r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // com.sun.mail.imap.e.u
        public java.lang.Object a(com.sun.mail.imap.protocol.h r3) throws com.sun.mail.iap.ProtocolException {
                r2 = this;
                java.lang.String r0 = ""
                java.lang.String r1 = r2.b
                com.sun.mail.imap.protocol.m[] r3 = r3.k0(r0, r1)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class l implements com.sun.mail.imap.e.u {
        final /* synthetic */ com.sun.mail.imap.e a;
        private final /* synthetic */ boolean b;
        private final /* synthetic */ char c;
        private final /* synthetic */ java.lang.String d;

        l(com.sun.mail.imap.e r1, boolean r2, char r3, java.lang.String r4) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.<init>()
                return
        }

        @Override // com.sun.mail.imap.e.u
        public java.lang.Object a(com.sun.mail.imap.protocol.h r4) throws com.sun.mail.iap.ProtocolException {
                r3 = this;
                boolean r0 = r3.b
                java.lang.String r1 = ""
                if (r0 == 0) goto L26
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                com.sun.mail.imap.e r2 = r3.a
                java.lang.String r2 = r2.a
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r0.<init>(r2)
                char r2 = r3.c
                r0.append(r2)
                java.lang.String r2 = r3.d
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.sun.mail.imap.protocol.m[] r4 = r4.o0(r1, r0)
                return r4
            L26:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                com.sun.mail.imap.e r2 = r3.a
                java.lang.String r2 = r2.a
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r0.<init>(r2)
                char r2 = r3.c
                r0.append(r2)
                java.lang.String r2 = r3.d
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.sun.mail.imap.protocol.m[] r4 = r4.k0(r1, r0)
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class m implements com.sun.mail.imap.e.u {
        final /* synthetic */ com.sun.mail.imap.e a;

        m(com.sun.mail.imap.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.sun.mail.imap.e.u
        public java.lang.Object a(com.sun.mail.imap.protocol.h r3) throws com.sun.mail.iap.ProtocolException {
                r2 = this;
                boolean r0 = r3.i0()
                java.lang.String r1 = ""
                if (r0 == 0) goto L11
                com.sun.mail.imap.e r0 = r2.a
                java.lang.String r0 = r0.a
                com.sun.mail.imap.protocol.m[] r3 = r3.k0(r0, r1)
                return r3
            L11:
                com.sun.mail.imap.e r0 = r2.a
                java.lang.String r0 = r0.a
                com.sun.mail.imap.protocol.m[] r3 = r3.k0(r1, r0)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class n implements com.sun.mail.imap.e.u {
        final /* synthetic */ com.sun.mail.imap.e a;
        private final /* synthetic */ java.lang.String b;

        n(com.sun.mail.imap.e r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // com.sun.mail.imap.e.u
        public java.lang.Object a(com.sun.mail.imap.protocol.h r3) throws com.sun.mail.iap.ProtocolException {
                r2 = this;
                java.lang.String r0 = ""
                java.lang.String r1 = r2.b
                com.sun.mail.imap.protocol.m[] r3 = r3.o0(r0, r1)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class o implements com.sun.mail.imap.e.u {
        final /* synthetic */ com.sun.mail.imap.e a;
        private final /* synthetic */ boolean b;

        o(com.sun.mail.imap.e r1, boolean r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // com.sun.mail.imap.e.u
        public java.lang.Object a(com.sun.mail.imap.protocol.h r2) throws com.sun.mail.iap.ProtocolException {
                r1 = this;
                boolean r0 = r1.b
                if (r0 == 0) goto Lc
                com.sun.mail.imap.e r0 = r1.a
                java.lang.String r0 = r0.a
                r2.P0(r0)
                goto L13
            Lc:
                com.sun.mail.imap.e r0 = r1.a
                java.lang.String r0 = r0.a
                r2.R0(r0)
            L13:
                r2 = 0
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class p implements com.sun.mail.imap.e.u {
        final /* synthetic */ com.sun.mail.imap.e a;
        private final /* synthetic */ int b;
        private final /* synthetic */ char c;

        p(com.sun.mail.imap.e r1, int r2, char r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        @Override // com.sun.mail.imap.e.u
        public java.lang.Object a(com.sun.mail.imap.protocol.h r3) throws com.sun.mail.iap.ProtocolException {
                r2 = this;
                int r0 = r2.b
                r0 = r0 & 1
                if (r0 != 0) goto L20
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                com.sun.mail.imap.e r1 = r2.a
                java.lang.String r1 = r1.a
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r0.<init>(r1)
                char r1 = r2.c
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.C(r0)
                goto L50
            L20:
                com.sun.mail.imap.e r0 = r2.a
                java.lang.String r0 = r0.a
                r3.C(r0)
                int r0 = r2.b
                r0 = r0 & 2
                if (r0 == 0) goto L50
                com.sun.mail.imap.e r0 = r2.a
                java.lang.String r0 = r0.a
                java.lang.String r1 = ""
                com.sun.mail.imap.protocol.m[] r0 = r3.k0(r1, r0)
                if (r0 == 0) goto L50
                r1 = 0
                r0 = r0[r1]
                boolean r0 = r0.c
                if (r0 == 0) goto L41
                goto L50
            L41:
                com.sun.mail.imap.e r0 = r2.a
                java.lang.String r0 = r0.a
                r3.delete(r0)
                com.sun.mail.iap.ProtocolException r3 = new com.sun.mail.iap.ProtocolException
                java.lang.String r0 = "Unsupported type"
                r3.<init>(r0)
                throw r3
            L50:
                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class q implements com.sun.mail.imap.e.u {
        final /* synthetic */ com.sun.mail.imap.e a;

        q(com.sun.mail.imap.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.sun.mail.imap.e.u
        public java.lang.Object a(com.sun.mail.imap.protocol.h r3) throws com.sun.mail.iap.ProtocolException {
                r2 = this;
                com.sun.mail.imap.e r0 = r2.a
                java.lang.String r0 = r0.a
                java.lang.String r1 = ""
                com.sun.mail.imap.protocol.m[] r3 = r3.k0(r1, r0)
                if (r3 == 0) goto L1d
                r0 = 0
                r3 = r3[r0]
                int r3 = r3.e
                r0 = 1
                if (r3 != r0) goto L17
                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                return r3
            L17:
                r0 = 2
                if (r3 != r0) goto L1d
                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                return r3
            L1d:
                com.sun.mail.imap.e r3 = r2.a
                com.sun.mail.imap.protocol.u r3 = com.sun.mail.imap.e.b(r3)
                int r3 = r3.c
                if (r3 <= 0) goto L2a
                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                return r3
            L2a:
                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class r implements com.sun.mail.imap.e.u {
        final /* synthetic */ com.sun.mail.imap.e a;

        r(com.sun.mail.imap.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.sun.mail.imap.e.u
        public java.lang.Object a(com.sun.mail.imap.protocol.h r2) throws com.sun.mail.iap.ProtocolException {
                r1 = this;
                com.sun.mail.imap.e r0 = r1.a
                java.lang.String r0 = r0.a
                r2.delete(r0)
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class s implements com.sun.mail.imap.e.u {
        final /* synthetic */ com.sun.mail.imap.e a;
        private final /* synthetic */ javax.mail.Folder b;

        s(com.sun.mail.imap.e r1, javax.mail.Folder r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // com.sun.mail.imap.e.u
        public java.lang.Object a(com.sun.mail.imap.protocol.h r3) throws com.sun.mail.iap.ProtocolException {
                r2 = this;
                com.sun.mail.imap.e r0 = r2.a
                java.lang.String r0 = r0.a
                javax.mail.Folder r1 = r2.b
                java.lang.String r1 = r1.getFullName()
                r3.A0(r0, r1)
                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class t extends javax.mail.FetchProfile.Item {
        public static final com.sun.mail.imap.e.t a = null;
        public static final com.sun.mail.imap.e.t b = null;

        static {
                com.sun.mail.imap.e$t r0 = new com.sun.mail.imap.e$t
                java.lang.String r1 = "HEADERS"
                r0.<init>(r1)
                com.sun.mail.imap.e.t.a = r0
                com.sun.mail.imap.e$t r0 = new com.sun.mail.imap.e$t
                java.lang.String r1 = "SIZE"
                r0.<init>(r1)
                com.sun.mail.imap.e.t.b = r0
                return
        }

        protected t(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface u {
        java.lang.Object a(com.sun.mail.imap.protocol.h r1) throws com.sun.mail.iap.ProtocolException;
    }

    static {
            return
    }

    protected e(com.sun.mail.imap.protocol.m r3, com.sun.mail.imap.k r4) {
            r2 = this;
            java.lang.String r0 = r3.a
            char r1 = r3.b
            r2.<init>(r0, r1, r4)
            boolean r4 = r3.c
            if (r4 == 0) goto L11
            int r4 = r2.c
            r4 = r4 | 2
            r2.c = r4
        L11:
            boolean r4 = r3.d
            r0 = 1
            if (r4 == 0) goto L1b
            int r4 = r2.c
            r4 = r4 | r0
            r2.c = r4
        L1b:
            r2.g = r0
            java.lang.String[] r3 = r3.f
            r2.i = r3
            return
    }

    protected e(java.lang.String r5, char r6, com.sun.mail.imap.k r7) {
            r4 = this;
            r4.<init>(r7)
            r0 = 0
            r4.g = r0
            r4.h = r0
            r4.n = r0
            r1 = 1
            r4.o = r1
            r4.p = r0
            r2 = -1
            r4.r = r2
            r4.s = r2
            r4.t = r2
            r2 = -1
            r4.u = r2
            r4.v = r2
            r4.w = r1
            r2 = 0
            r4.x = r2
            r2 = 0
            r4.y = r2
            r4.z = r0
            if (r5 == 0) goto L79
            r4.a = r5
            r4.d = r6
            java.lang.Object r5 = new java.lang.Object
            r5.<init>()
            r4.l = r5
            javax.mail.Session r5 = r7.l()
            boolean r5 = r5.getDebug()
            r4.z = r5
            boolean r5 = r7.g()
            r4.B = r5
            javax.mail.Session r5 = r7.l()
            java.io.PrintStream r5 = r5.getDebugOut()
            r4.A = r5
            if (r5 != 0) goto L54
            java.io.PrintStream r5 = java.lang.System.out
            r4.A = r5
        L54:
            r4.h = r0
            r5 = 65535(0xffff, float:9.1834E-41)
            if (r6 == r5) goto L78
            if (r6 == 0) goto L78
            java.lang.String r5 = r4.a
            int r5 = r5.indexOf(r6)
            if (r5 <= 0) goto L78
            java.lang.String r6 = r4.a
            int r6 = r6.length()
            int r6 = r6 - r1
            if (r5 != r6) goto L78
            java.lang.String r6 = r4.a
            java.lang.String r5 = r6.substring(r0, r5)
            r4.a = r5
            r4.h = r1
        L78:
            return
        L79:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "Folder name is null"
            r5.<init>(r6)
            throw r5
    }

    protected e(java.lang.String r1, char r2, com.sun.mail.imap.k r3, boolean r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.h = r4
            return
    }

    private com.sun.mail.imap.protocol.h A() throws com.sun.mail.iap.ProtocolException {
            r1 = this;
            r1.S()
            com.sun.mail.imap.protocol.h r0 = r1.j
            return r0
    }

    private com.sun.mail.imap.protocol.u C() throws com.sun.mail.iap.ProtocolException {
            r6 = this;
            javax.mail.Store r0 = r6.store
            com.sun.mail.imap.k r0 = (com.sun.mail.imap.k) r0
            int r0 = r0.m()
            if (r0 <= 0) goto L1d
            com.sun.mail.imap.protocol.u r1 = r6.x
            if (r1 == 0) goto L1d
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r6.y
            long r1 = r1 - r3
            long r3 = (long) r0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L1d
            com.sun.mail.imap.protocol.u r0 = r6.x
            return r0
        L1d:
            r1 = 0
            com.sun.mail.imap.protocol.h r2 = r6.D()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r3 = r6.a     // Catch: java.lang.Throwable -> L33
            com.sun.mail.imap.protocol.u r1 = r2.K0(r3, r1)     // Catch: java.lang.Throwable -> L33
            if (r0 <= 0) goto L36
            r6.x = r1     // Catch: java.lang.Throwable -> L33
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L33
            r6.y = r3     // Catch: java.lang.Throwable -> L33
            goto L36
        L33:
            r0 = move-exception
            r1 = r2
            goto L3b
        L36:
            r6.M(r2)
            return r1
        L3a:
            r0 = move-exception
        L3b:
            r6.M(r1)
            throw r0
    }

    private boolean H() {
            r1 = this;
            int r0 = r1.c
            r0 = r0 & 2
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    private void I(boolean r7) throws com.sun.mail.iap.ProtocolException {
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            com.sun.mail.imap.protocol.h r2 = r6.j
            long r2 = r2.g()
            long r0 = r0 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L19
            r6.S()
            com.sun.mail.imap.protocol.h r0 = r6.j
            r0.r0()
        L19:
            if (r7 == 0) goto L51
            javax.mail.Store r7 = r6.store
            com.sun.mail.imap.k r7 = (com.sun.mail.imap.k) r7
            boolean r7 = r7.q()
            if (r7 == 0) goto L51
            r7 = 0
            javax.mail.Store r0 = r6.store     // Catch: java.lang.Throwable -> L3f
            com.sun.mail.imap.k r0 = (com.sun.mail.imap.k) r0     // Catch: java.lang.Throwable -> L3f
            com.sun.mail.imap.protocol.h r7 = r0.n()     // Catch: java.lang.Throwable -> L3f
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3f
            long r4 = r7.g()     // Catch: java.lang.Throwable -> L3f
            long r0 = r0 - r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L41
            r7.r0()     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r0 = move-exception
            goto L49
        L41:
            javax.mail.Store r0 = r6.store
            com.sun.mail.imap.k r0 = (com.sun.mail.imap.k) r0
            r0.w(r7)
            return
        L49:
            javax.mail.Store r1 = r6.store
            com.sun.mail.imap.k r1 = (com.sun.mail.imap.k) r1
            r1.w(r7)
            throw r0
        L51:
            return
    }

    private void L(boolean r2) {
            r1 = this;
            com.sun.mail.imap.protocol.h r0 = r1.j
            if (r0 == 0) goto L1b
            r0.m(r1)
            if (r2 == 0) goto L13
            javax.mail.Store r2 = r1.store
            com.sun.mail.imap.k r2 = (com.sun.mail.imap.k) r2
            com.sun.mail.imap.protocol.h r0 = r1.j
            r2.v(r1, r0)
            return
        L13:
            javax.mail.Store r2 = r1.store
            com.sun.mail.imap.k r2 = (com.sun.mail.imap.k) r2
            r0 = 0
            r2.v(r1, r0)
        L1b:
            return
    }

    private void P(com.sun.mail.imap.a r2, char r3) throws javax.mail.MessagingException {
            r1 = this;
            com.sun.mail.imap.e$i r0 = new com.sun.mail.imap.e$i
            r0.<init>(r1, r3, r2)
            java.lang.String r2 = "ACL not supported"
            r1.s(r2, r0)
            return
    }

    private synchronized void R(com.sun.mail.iap.ConnectionException r3) throws javax.mail.FolderClosedException, javax.mail.StoreClosedException {
            r2 = this;
            monitor-enter(r2)
            com.sun.mail.imap.protocol.h r0 = r2.j     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            com.sun.mail.iap.f r0 = r3.getProtocol()     // Catch: java.lang.Throwable -> Le
            com.sun.mail.imap.protocol.h r1 = r2.j     // Catch: java.lang.Throwable -> Le
            if (r0 == r1) goto L18
            goto L10
        Le:
            r3 = move-exception
            goto L2e
        L10:
            com.sun.mail.imap.protocol.h r0 = r2.j     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L22
            boolean r0 = r2.o     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L22
        L18:
            javax.mail.FolderClosedException r0 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> Le
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> Le
            throw r0     // Catch: java.lang.Throwable -> Le
        L22:
            javax.mail.StoreClosedException r0 = new javax.mail.StoreClosedException     // Catch: java.lang.Throwable -> Le
            javax.mail.Store r1 = r2.store     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> Le
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> Le
            throw r0     // Catch: java.lang.Throwable -> Le
        L2e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3
    }

    static /* synthetic */ com.sun.mail.imap.protocol.u b(com.sun.mail.imap.e r0) throws com.sun.mail.iap.ProtocolException {
            com.sun.mail.imap.protocol.u r0 = r0.C()
            return r0
    }

    static /* synthetic */ int c(com.sun.mail.imap.e r0) {
            int r0 = r0.p
            return r0
    }

    static /* synthetic */ void d(com.sun.mail.imap.e r0, int r1) {
            r0.p = r1
            return
    }

    private void i() {
            r2 = this;
            boolean r0 = r2.n
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This operation is not allowed on an open folder"
            r0.<init>(r1)
            throw r0
    }

    private void j() throws javax.mail.MessagingException {
            r3 = this;
            boolean r0 = r3.g
            if (r0 != 0) goto L25
            boolean r0 = r3.exists()
            if (r0 == 0) goto Lb
            goto L25
        Lb:
            javax.mail.FolderNotFoundException r0 = new javax.mail.FolderNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = r3.a
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r2 = " not found"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r3, r1)
            throw r0
        L25:
            return
    }

    private void k(javax.mail.Flags r3) throws javax.mail.MessagingException {
            r2 = this;
            int r3 = r2.mode
            r0 = 2
            if (r3 != r0) goto L6
            return
        L6:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot change flags on READ_ONLY folder: "
            r0.<init>(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    private void l() throws javax.mail.FolderClosedException {
            r2 = this;
            boolean r0 = r2.n
            if (r0 != 0) goto L18
            boolean r0 = r2.o
            if (r0 == 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This operation is not allowed on a closed folder"
            r0.<init>(r1)
            throw r0
        L10:
            javax.mail.FolderClosedException r0 = new javax.mail.FolderClosedException
            java.lang.String r1 = "Lost folder connection to server"
            r0.<init>(r2, r1)
            throw r0
        L18:
            return
    }

    private void m(int r4) throws javax.mail.MessagingException {
            r3 = this;
            r0 = 1
            if (r4 < r0) goto L35
            int r0 = r3.r
            if (r4 > r0) goto L8
            goto L14
        L8:
            java.lang.Object r0 = r3.l
            monitor-enter(r0)
            r1 = 0
            r3.I(r1)     // Catch: java.lang.Throwable -> L1b com.sun.mail.iap.ProtocolException -> L1d com.sun.mail.iap.ConnectionException -> L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            int r0 = r3.r
            if (r4 > r0) goto L15
        L14:
            return
        L15:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            r4.<init>()
            throw r4
        L1b:
            r4 = move-exception
            goto L33
        L1d:
            r4 = move-exception
            javax.mail.MessagingException r1 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = r4.getMessage()     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L1b
            throw r1     // Catch: java.lang.Throwable -> L1b
        L28:
            r4 = move-exception
            javax.mail.FolderClosedException r1 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> L1b
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L1b
            throw r1     // Catch: java.lang.Throwable -> L1b
        L33:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r4
        L35:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            r4.<init>()
            throw r4
    }

    private void n(boolean r2) {
            r1 = this;
            r1.L(r2)
            r2 = 0
            r1.j = r2
            r1.k = r2
            r1.m = r2
            r0 = 0
            r1.g = r0
            r1.i = r2
            r1.n = r0
            r1.p = r0
            r2 = 3
            r1.notifyConnectionListeners(r2)
            return
    }

    private void o(boolean r4, boolean r5) throws javax.mail.MessagingException {
            r3 = this;
            java.lang.Object r0 = r3.l
            monitor-enter(r0)
            boolean r1 = r3.n     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L17
            boolean r2 = r3.o     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto Lc
            goto L17
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.String r5 = "This operation is not allowed on a closed folder"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L14
            throw r4     // Catch: java.lang.Throwable -> L14
        L14:
            r4 = move-exception
            goto L93
        L17:
            r2 = 1
            r3.o = r2     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L1e:
            r3.S()     // Catch: java.lang.Throwable -> L2d com.sun.mail.iap.ProtocolException -> L2f
            if (r5 == 0) goto L39
            boolean r4 = r3.z     // Catch: java.lang.Throwable -> L2d com.sun.mail.iap.ProtocolException -> L2f
            if (r4 == 0) goto L31
            java.io.PrintStream r4 = r3.A     // Catch: java.lang.Throwable -> L2d com.sun.mail.iap.ProtocolException -> L2f
            r4.getClass()     // Catch: java.lang.Throwable -> L2d com.sun.mail.iap.ProtocolException -> L2f
            goto L31
        L2d:
            r4 = move-exception
            goto L8b
        L2f:
            r4 = move-exception
            goto L81
        L31:
            com.sun.mail.imap.protocol.h r4 = r3.j     // Catch: java.lang.Throwable -> L2d com.sun.mail.iap.ProtocolException -> L2f
            if (r4 == 0) goto L78
            r4.c()     // Catch: java.lang.Throwable -> L2d com.sun.mail.iap.ProtocolException -> L2f
            goto L78
        L39:
            javax.mail.Store r5 = r3.store     // Catch: java.lang.Throwable -> L2d com.sun.mail.iap.ProtocolException -> L2f
            com.sun.mail.imap.k r5 = (com.sun.mail.imap.k) r5     // Catch: java.lang.Throwable -> L2d com.sun.mail.iap.ProtocolException -> L2f
            boolean r5 = r5.s()     // Catch: java.lang.Throwable -> L2d com.sun.mail.iap.ProtocolException -> L2f
            if (r5 == 0) goto L5b
            boolean r5 = r3.z     // Catch: java.lang.Throwable -> L2d com.sun.mail.iap.ProtocolException -> L2f
            if (r5 == 0) goto L4c
            java.io.PrintStream r5 = r3.A     // Catch: java.lang.Throwable -> L2d com.sun.mail.iap.ProtocolException -> L2f
            r5.getClass()     // Catch: java.lang.Throwable -> L2d com.sun.mail.iap.ProtocolException -> L2f
        L4c:
            if (r4 == 0) goto L53
            com.sun.mail.imap.protocol.h r4 = r3.j     // Catch: java.lang.Throwable -> L2d com.sun.mail.iap.ProtocolException -> L2f
            r4.y()     // Catch: java.lang.Throwable -> L2d com.sun.mail.iap.ProtocolException -> L2f
        L53:
            com.sun.mail.imap.protocol.h r4 = r3.j     // Catch: java.lang.Throwable -> L2d com.sun.mail.iap.ProtocolException -> L2f
            if (r4 == 0) goto L78
            r4.n0()     // Catch: java.lang.Throwable -> L2d com.sun.mail.iap.ProtocolException -> L2f
            goto L78
        L5b:
            if (r4 != 0) goto L71
            int r4 = r3.mode     // Catch: java.lang.Throwable -> L2d com.sun.mail.iap.ProtocolException -> L2f
            r5 = 2
            if (r4 != r5) goto L71
            com.sun.mail.imap.protocol.h r4 = r3.j     // Catch: java.lang.Throwable -> L2d com.sun.mail.iap.ProtocolException -> L6a
            java.lang.String r5 = r3.a     // Catch: java.lang.Throwable -> L2d com.sun.mail.iap.ProtocolException -> L6a
            r4.G(r5)     // Catch: java.lang.Throwable -> L2d com.sun.mail.iap.ProtocolException -> L6a
            goto L71
        L6a:
            com.sun.mail.imap.protocol.h r4 = r3.j     // Catch: java.lang.Throwable -> L2d com.sun.mail.iap.ProtocolException -> L2f
            if (r4 == 0) goto L71
            r4.c()     // Catch: java.lang.Throwable -> L2d com.sun.mail.iap.ProtocolException -> L2f
        L71:
            com.sun.mail.imap.protocol.h r4 = r3.j     // Catch: java.lang.Throwable -> L2d com.sun.mail.iap.ProtocolException -> L2f
            if (r4 == 0) goto L78
            r4.y()     // Catch: java.lang.Throwable -> L2d com.sun.mail.iap.ProtocolException -> L2f
        L78:
            boolean r4 = r3.n     // Catch: java.lang.Throwable -> L14
            if (r4 == 0) goto L7f
            r3.n(r2)     // Catch: java.lang.Throwable -> L14
        L7f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L81:
            javax.mail.MessagingException r5 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = r4.getMessage()     // Catch: java.lang.Throwable -> L2d
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L2d
            throw r5     // Catch: java.lang.Throwable -> L2d
        L8b:
            boolean r5 = r3.n     // Catch: java.lang.Throwable -> L14
            if (r5 == 0) goto L92
            r3.n(r2)     // Catch: java.lang.Throwable -> L14
        L92:
            throw r4     // Catch: java.lang.Throwable -> L14
        L93:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r4
    }

    private synchronized javax.mail.Folder[] r(java.lang.String r7, boolean r8) throws javax.mail.MessagingException {
            r6 = this;
            monitor-enter(r6)
            r6.j()     // Catch: java.lang.Throwable -> Lf
            boolean r0 = r6.H()     // Catch: java.lang.Throwable -> Lf
            r1 = 0
            if (r0 != 0) goto L11
            javax.mail.Folder[] r7 = new javax.mail.Folder[r1]     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r6)
            return r7
        Lf:
            r7 = move-exception
            goto L62
        L11:
            char r0 = r6.getSeparator()     // Catch: java.lang.Throwable -> Lf
            com.sun.mail.imap.e$l r2 = new com.sun.mail.imap.e$l     // Catch: java.lang.Throwable -> Lf
            r2.<init>(r6, r8, r0, r7)     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r7 = r6.q(r2)     // Catch: java.lang.Throwable -> Lf
            com.sun.mail.imap.protocol.m[] r7 = (com.sun.mail.imap.protocol.m[]) r7     // Catch: java.lang.Throwable -> Lf
            if (r7 != 0) goto L26
            javax.mail.Folder[] r7 = new javax.mail.Folder[r1]     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r6)
            return r7
        L26:
            int r8 = r7.length     // Catch: java.lang.Throwable -> Lf
            if (r8 <= 0) goto L46
            r8 = r7[r1]     // Catch: java.lang.Throwable -> Lf
            java.lang.String r8 = r8.a     // Catch: java.lang.Throwable -> Lf
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = r6.a     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> Lf
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lf
            r2.append(r0)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Lf
            boolean r8 = r8.equals(r0)     // Catch: java.lang.Throwable -> Lf
            if (r8 == 0) goto L46
            r1 = 1
        L46:
            int r8 = r7.length     // Catch: java.lang.Throwable -> Lf
            int r8 = r8 - r1
            com.sun.mail.imap.e[] r8 = new com.sun.mail.imap.e[r8]     // Catch: java.lang.Throwable -> Lf
            r0 = r1
        L4b:
            int r2 = r7.length     // Catch: java.lang.Throwable -> Lf
            if (r0 < r2) goto L50
            monitor-exit(r6)
            return r8
        L50:
            int r2 = r0 - r1
            com.sun.mail.imap.e r3 = new com.sun.mail.imap.e     // Catch: java.lang.Throwable -> Lf
            r4 = r7[r0]     // Catch: java.lang.Throwable -> Lf
            javax.mail.Store r5 = r6.store     // Catch: java.lang.Throwable -> Lf
            com.sun.mail.imap.k r5 = (com.sun.mail.imap.k) r5     // Catch: java.lang.Throwable -> Lf
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> Lf
            r8[r2] = r3     // Catch: java.lang.Throwable -> Lf
            int r0 = r0 + 1
            goto L4b
        L62:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lf
            throw r7
    }

    private int v(com.sun.mail.imap.protocol.m[] r4, java.lang.String r5) {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r4.length
            if (r1 < r2) goto L6
            goto L10
        L6:
            r2 = r4[r1]
            java.lang.String r2 = r2.a
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L15
        L10:
            int r4 = r4.length
            if (r1 < r4) goto L14
            return r0
        L14:
            return r1
        L15:
            int r1 = r1 + 1
            goto L2
    }

    public javax.mail.Quota[] B() throws javax.mail.MessagingException {
            r2 = this;
            com.sun.mail.imap.e$c r0 = new com.sun.mail.imap.e$c
            r0.<init>(r2)
            java.lang.String r1 = "QUOTA not supported"
            java.lang.Object r0 = r2.s(r1, r0)
            javax.mail.Quota[] r0 = (javax.mail.Quota[]) r0
            return r0
    }

    protected synchronized com.sun.mail.imap.protocol.h D() throws com.sun.mail.iap.ProtocolException {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.B     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            java.io.PrintStream r0 = r1.A     // Catch: java.lang.Throwable -> Lb
            r0.getClass()     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r0 = move-exception
            goto L17
        Ld:
            javax.mail.Store r0 = r1.store     // Catch: java.lang.Throwable -> Lb
            com.sun.mail.imap.k r0 = (com.sun.mail.imap.k) r0     // Catch: java.lang.Throwable -> Lb
            com.sun.mail.imap.protocol.h r0 = r0.n()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return r0
        L17:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    public synchronized long E() throws javax.mail.MessagingException {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.n     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lb
            long r0 = r5.v     // Catch: java.lang.Throwable -> L9
            monitor-exit(r5)
            return r0
        L9:
            r0 = move-exception
            goto L55
        Lb:
            r0 = 0
            com.sun.mail.imap.protocol.h r1 = r5.D()     // Catch: java.lang.Throwable -> L28 com.sun.mail.iap.ProtocolException -> L2d com.sun.mail.iap.ConnectionException -> L3b com.sun.mail.iap.BadCommandException -> L45
            java.lang.String r2 = "UIDNEXT"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L20 com.sun.mail.iap.ProtocolException -> L22 com.sun.mail.iap.ConnectionException -> L24 com.sun.mail.iap.BadCommandException -> L26
            java.lang.String r3 = r5.a     // Catch: java.lang.Throwable -> L20 com.sun.mail.iap.ProtocolException -> L22 com.sun.mail.iap.ConnectionException -> L24 com.sun.mail.iap.BadCommandException -> L26
            com.sun.mail.imap.protocol.u r0 = r1.K0(r3, r2)     // Catch: java.lang.Throwable -> L20 com.sun.mail.iap.ProtocolException -> L22 com.sun.mail.iap.ConnectionException -> L24 com.sun.mail.iap.BadCommandException -> L26
        L1c:
            r5.M(r1)     // Catch: java.lang.Throwable -> L9
            goto L41
        L20:
            r0 = move-exception
            goto L51
        L22:
            r0 = move-exception
            goto L31
        L24:
            r2 = move-exception
            goto L3d
        L26:
            r0 = move-exception
            goto L49
        L28:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L51
        L2d:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L31:
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = r0.getMessage()     // Catch: java.lang.Throwable -> L20
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L20
            throw r2     // Catch: java.lang.Throwable -> L20
        L3b:
            r2 = move-exception
            r1 = r0
        L3d:
            r5.R(r2)     // Catch: java.lang.Throwable -> L20
            goto L1c
        L41:
            long r0 = r0.d     // Catch: java.lang.Throwable -> L9
            monitor-exit(r5)
            return r0
        L45:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L49:
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = "Cannot obtain UIDNext"
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L20
            throw r2     // Catch: java.lang.Throwable -> L20
        L51:
            r5.M(r1)     // Catch: java.lang.Throwable -> L9
            throw r0     // Catch: java.lang.Throwable -> L9
        L55:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    void F(com.sun.mail.iap.g[] r3) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r3.length
            if (r0 < r1) goto L5
            return
        L5:
            r1 = r3[r0]
            if (r1 == 0) goto Lc
            r2.a(r1)
        Lc:
            int r0 = r0 + 1
            goto L1
    }

    public void G() throws javax.mail.MessagingException {
            r3 = this;
            monitor-enter(r3)
            r3.l()     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "IDLE not supported"
            com.sun.mail.imap.e$j r1 = new com.sun.mail.imap.e$j     // Catch: java.lang.Throwable -> L19
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r3.s(r0, r1)     // Catch: java.lang.Throwable -> L19
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L19
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L1b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L19
            return
        L19:
            r0 = move-exception
            goto L62
        L1b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L19
        L1c:
            com.sun.mail.imap.protocol.h r0 = r3.j
            com.sun.mail.iap.g r0 = r0.z0()
            java.lang.Object r1 = r3.l     // Catch: com.sun.mail.iap.ProtocolException -> L50 com.sun.mail.iap.ConnectionException -> L52
            monitor-enter(r1)     // Catch: com.sun.mail.iap.ProtocolException -> L50 com.sun.mail.iap.ConnectionException -> L52
            if (r0 == 0) goto L36
            com.sun.mail.imap.protocol.h r2 = r3.j     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L36
            boolean r0 = r2.x0(r0)     // Catch: java.lang.Throwable -> L34
            if (r0 != 0) goto L32
            goto L36
        L32:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            goto L1c
        L34:
            r0 = move-exception
            goto L4e
        L36:
            r0 = 0
            r3.p = r0     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = r3.l     // Catch: java.lang.Throwable -> L34
            r0.notifyAll()     // Catch: java.lang.Throwable -> L34
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            javax.mail.Store r0 = r3.store
            com.sun.mail.imap.k r0 = (com.sun.mail.imap.k) r0
            int r0 = r0.i()
            if (r0 <= 0) goto L4d
            long r0 = (long) r0
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L4d
        L4d:
            return
        L4e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            throw r0     // Catch: com.sun.mail.iap.ProtocolException -> L50 com.sun.mail.iap.ConnectionException -> L52
        L50:
            r0 = move-exception
            goto L54
        L52:
            r0 = move-exception
            goto L5e
        L54:
            javax.mail.MessagingException r1 = new javax.mail.MessagingException
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2, r0)
            throw r1
        L5e:
            r3.R(r0)
            goto L1c
        L62:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L19
            throw r0
    }

    public com.sun.mail.imap.n[] J(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            com.sun.mail.imap.e$g r0 = new com.sun.mail.imap.e$g
            r0.<init>(r1, r2)
            java.lang.String r2 = "ACL not supported"
            java.lang.Object r2 = r1.s(r2, r0)
            com.sun.mail.imap.n[] r2 = (com.sun.mail.imap.n[]) r2
            return r2
    }

    public com.sun.mail.imap.n K() throws javax.mail.MessagingException {
            r2 = this;
            com.sun.mail.imap.e$h r0 = new com.sun.mail.imap.e$h
            r0.<init>(r2)
            java.lang.String r1 = "ACL not supported"
            java.lang.Object r0 = r2.s(r1, r0)
            com.sun.mail.imap.n r0 = (com.sun.mail.imap.n) r0
            return r0
    }

    protected synchronized void M(com.sun.mail.imap.protocol.h r2) {
            r1 = this;
            monitor-enter(r1)
            com.sun.mail.imap.protocol.h r0 = r1.j     // Catch: java.lang.Throwable -> Ld
            if (r2 == r0) goto Lf
            javax.mail.Store r0 = r1.store     // Catch: java.lang.Throwable -> Ld
            com.sun.mail.imap.k r0 = (com.sun.mail.imap.k) r0     // Catch: java.lang.Throwable -> Ld
            r0.w(r2)     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r2 = move-exception
            goto L11
        Lf:
            monitor-exit(r1)
            return
        L11:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public void N(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            com.sun.mail.imap.e$f r0 = new com.sun.mail.imap.e$f
            r0.<init>(r1, r2)
            java.lang.String r2 = "ACL not supported"
            r1.s(r2, r0)
            return
    }

    public void O(com.sun.mail.imap.a r2) throws javax.mail.MessagingException {
            r1 = this;
            r0 = 45
            r1.P(r2, r0)
            return
    }

    public void Q(javax.mail.Quota r2) throws javax.mail.MessagingException {
            r1 = this;
            com.sun.mail.imap.e$d r0 = new com.sun.mail.imap.e$d
            r0.<init>(r1, r2)
            java.lang.String r2 = "QUOTA not supported"
            r1.s(r2, r0)
            return
    }

    void S() throws com.sun.mail.iap.ProtocolException {
            r2 = this;
        L0:
            int r0 = r2.p
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 1
            if (r0 != r1) goto L10
            com.sun.mail.imap.protocol.h r0 = r2.j
            r0.f0()
            r0 = 2
            r2.p = r0
        L10:
            java.lang.Object r0 = r2.l     // Catch: java.lang.InterruptedException -> L16
            r0.wait()     // Catch: java.lang.InterruptedException -> L16
            goto L0
        L16:
            goto L0
    }

    @Override // com.sun.mail.iap.h
    public void a(com.sun.mail.iap.g r7) {
            r6 = this;
            boolean r0 = r7.h()
            if (r0 != 0) goto L18
            boolean r0 = r7.g()
            if (r0 != 0) goto L18
            boolean r0 = r7.d()
            if (r0 != 0) goto L18
            boolean r0 = r7.e()
            if (r0 == 0) goto L1f
        L18:
            javax.mail.Store r0 = r6.store
            com.sun.mail.imap.k r0 = (com.sun.mail.imap.k) r0
            r0.o(r7)
        L1f:
            boolean r0 = r7.e()
            r1 = 0
            if (r0 == 0) goto L2e
            boolean r7 = r6.n
            if (r7 == 0) goto L101
            r6.n(r1)
            return
        L2e:
            boolean r0 = r7.h()
            if (r0 == 0) goto L36
            goto L101
        L36:
            boolean r0 = r7.k()
            if (r0 != 0) goto L3e
            goto L101
        L3e:
            boolean r0 = r7 instanceof com.sun.mail.imap.protocol.i
            if (r0 != 0) goto L50
            java.io.PrintStream r0 = r6.A
            r7.toString()
            r0.getClass()
            java.io.PrintStream r7 = r6.A
            r7.getClass()
            return
        L50:
            com.sun.mail.imap.protocol.i r7 = (com.sun.mail.imap.protocol.i) r7
            java.lang.String r0 = "EXISTS"
            boolean r0 = r7.F(r0)
            r2 = 1
            if (r0 == 0) goto L88
            int r7 = r7.E()
            int r0 = r6.t
            if (r7 > r0) goto L65
            goto L101
        L65:
            int r0 = r7 - r0
            javax.mail.Message[] r3 = new javax.mail.Message[r0]
        L69:
            if (r1 < r0) goto L6f
            r6.notifyMessageAddedListeners(r3)
            return
        L6f:
            com.sun.mail.imap.g r7 = new com.sun.mail.imap.g
            int r4 = r6.r
            int r4 = r4 + r2
            r6.r = r4
            int r5 = r6.t
            int r5 = r5 + r2
            r6.t = r5
            r7.<init>(r6, r4, r5)
            r3[r1] = r7
            java.util.Vector r4 = r6.k
            r4.addElement(r7)
            int r1 = r1 + 1
            goto L69
        L88:
            java.lang.String r0 = "EXPUNGE"
            boolean r0 = r7.F(r0)
            if (r0 == 0) goto Lce
            int r7 = r7.E()
            com.sun.mail.imap.g r0 = r6.z(r7)
            r0.setExpunged(r2)
            int r7 = r0.getMessageNumber()
        L9f:
            int r3 = r6.r
            if (r7 < r3) goto Lb4
            int r7 = r6.t
            int r7 = r7 - r2
            r6.t = r7
            boolean r7 = r6.w
            if (r7 == 0) goto L101
            javax.mail.Message[] r7 = new javax.mail.Message[r2]
            r7[r1] = r0
            r6.notifyMessageRemovedListeners(r1, r7)
            return
        Lb4:
            java.util.Vector r3 = r6.k
            java.lang.Object r3 = r3.elementAt(r7)
            com.sun.mail.imap.g r3 = (com.sun.mail.imap.g) r3
            boolean r4 = r3.isExpunged()
            if (r4 == 0) goto Lc3
            goto Lcb
        Lc3:
            int r4 = r3.w()
            int r4 = r4 - r2
            r3.I(r4)
        Lcb:
            int r7 = r7 + 1
            goto L9f
        Lce:
            java.lang.String r0 = "FETCH"
            boolean r0 = r7.F(r0)
            if (r0 == 0) goto Lf3
            com.sun.mail.imap.protocol.f r7 = (com.sun.mail.imap.protocol.f) r7
            java.lang.Class<javax.mail.Flags> r0 = javax.mail.Flags.class
            com.sun.mail.imap.protocol.l r0 = r7.J(r0)
            javax.mail.Flags r0 = (javax.mail.Flags) r0
            if (r0 == 0) goto L101
            int r7 = r7.E()
            com.sun.mail.imap.g r7 = r6.z(r7)
            if (r7 == 0) goto L101
            r7.e(r0)
            r6.notifyMessageChangedListeners(r2, r7)
            return
        Lf3:
            java.lang.String r0 = "RECENT"
            boolean r0 = r7.F(r0)
            if (r0 == 0) goto L101
            int r7 = r7.E()
            r6.s = r7
        L101:
            return
    }

    public synchronized void appendMessages(javax.mail.Message[] r8) throws javax.mail.MessagingException {
            r7 = this;
            monitor-enter(r7)
            r7.j()     // Catch: java.lang.Throwable -> L2e
            javax.mail.Store r0 = r7.store     // Catch: java.lang.Throwable -> L2e
            com.sun.mail.imap.k r0 = (com.sun.mail.imap.k) r0     // Catch: java.lang.Throwable -> L2e
            int r0 = r0.f()     // Catch: java.lang.Throwable -> L2e
            r1 = 0
            r2 = 0
        Le:
            int r3 = r8.length     // Catch: java.lang.Throwable -> L2e
            if (r2 < r3) goto L13
            monitor-exit(r7)
            return
        L13:
            r3 = r8[r2]     // Catch: java.lang.Throwable -> L2e
            com.sun.mail.imap.m r4 = new com.sun.mail.imap.m     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L3d javax.mail.MessageRemovedException -> L3f
            int r5 = r3.getSize()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L3d javax.mail.MessageRemovedException -> L3f
            if (r5 <= r0) goto L1f
            r5 = 0
            goto L20
        L1f:
            r5 = r0
        L20:
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L3d javax.mail.MessageRemovedException -> L3f
            java.util.Date r5 = r3.getReceivedDate()     // Catch: java.lang.Throwable -> L2e
            if (r5 != 0) goto L30
            java.util.Date r5 = r3.getSentDate()     // Catch: java.lang.Throwable -> L2e
            goto L30
        L2e:
            r8 = move-exception
            goto L4a
        L30:
            javax.mail.Flags r3 = r3.getFlags()     // Catch: java.lang.Throwable -> L2e
            com.sun.mail.imap.e$a r6 = new com.sun.mail.imap.e$a     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r7, r3, r5, r4)     // Catch: java.lang.Throwable -> L2e
            r7.p(r6)     // Catch: java.lang.Throwable -> L2e
            goto L3f
        L3d:
            r8 = move-exception
            goto L42
        L3f:
            int r2 = r2 + 1
            goto Le
        L42:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "IOException while appending messages"
            r0.<init>(r1, r8)     // Catch: java.lang.Throwable -> L2e
            throw r0     // Catch: java.lang.Throwable -> L2e
        L4a:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2e
            throw r8
    }

    public synchronized void close(boolean r2) throws javax.mail.MessagingException {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.o(r2, r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    public synchronized void copyMessages(javax.mail.Message[] r4, javax.mail.Folder r5) throws javax.mail.MessagingException {
            r3 = this;
            monitor-enter(r3)
            r3.l()     // Catch: java.lang.Throwable -> L81
            int r0 = r4.length     // Catch: java.lang.Throwable -> L81
            if (r0 != 0) goto L9
            monitor-exit(r3)
            return
        L9:
            javax.mail.Store r0 = r5.getStore()     // Catch: java.lang.Throwable -> L81
            javax.mail.Store r1 = r3.store     // Catch: java.lang.Throwable -> L81
            if (r0 != r1) goto L83
            java.lang.Object r0 = r3.l     // Catch: java.lang.Throwable -> L81
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L81
            com.sun.mail.imap.protocol.h r1 = r3.A()     // Catch: java.lang.Throwable -> L28 com.sun.mail.iap.ProtocolException -> L2a com.sun.mail.iap.ConnectionException -> L2c com.sun.mail.iap.CommandFailedException -> L2e
            r2 = 0
            com.sun.mail.imap.protocol.o[] r4 = com.sun.mail.imap.o.a(r4, r2)     // Catch: java.lang.Throwable -> L28 com.sun.mail.iap.ProtocolException -> L2a com.sun.mail.iap.ConnectionException -> L2c com.sun.mail.iap.CommandFailedException -> L2e
            if (r4 == 0) goto L30
            java.lang.String r2 = r5.getFullName()     // Catch: java.lang.Throwable -> L28 com.sun.mail.iap.ProtocolException -> L2a com.sun.mail.iap.ConnectionException -> L2c com.sun.mail.iap.CommandFailedException -> L2e
            r1.B(r4, r2)     // Catch: java.lang.Throwable -> L28 com.sun.mail.iap.ProtocolException -> L2a com.sun.mail.iap.ConnectionException -> L2c com.sun.mail.iap.CommandFailedException -> L2e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            goto L86
        L28:
            r4 = move-exception
            goto L7f
        L2a:
            r4 = move-exception
            goto L38
        L2c:
            r4 = move-exception
            goto L42
        L2e:
            r4 = move-exception
            goto L4c
        L30:
            javax.mail.MessageRemovedException r4 = new javax.mail.MessageRemovedException     // Catch: java.lang.Throwable -> L28 com.sun.mail.iap.ProtocolException -> L2a com.sun.mail.iap.ConnectionException -> L2c com.sun.mail.iap.CommandFailedException -> L2e
            java.lang.String r1 = "Messages have been removed"
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L28 com.sun.mail.iap.ProtocolException -> L2a com.sun.mail.iap.ConnectionException -> L2c com.sun.mail.iap.CommandFailedException -> L2e
            throw r4     // Catch: java.lang.Throwable -> L28 com.sun.mail.iap.ProtocolException -> L2a com.sun.mail.iap.ConnectionException -> L2c com.sun.mail.iap.CommandFailedException -> L2e
        L38:
            javax.mail.MessagingException r5 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = r4.getMessage()     // Catch: java.lang.Throwable -> L28
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L28
            throw r5     // Catch: java.lang.Throwable -> L28
        L42:
            javax.mail.FolderClosedException r5 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L28
            r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> L28
            throw r5     // Catch: java.lang.Throwable -> L28
        L4c:
            java.lang.String r1 = r4.getMessage()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "TRYCREATE"
            int r1 = r1.indexOf(r2)     // Catch: java.lang.Throwable -> L28
            r2 = -1
            if (r1 == r2) goto L75
            javax.mail.FolderNotFoundException r4 = new javax.mail.FolderNotFoundException     // Catch: java.lang.Throwable -> L28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = r5.getFullName()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L28
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = " does not exist"
            r1.append(r2)     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L28
            r4.<init>(r5, r1)     // Catch: java.lang.Throwable -> L28
            throw r4     // Catch: java.lang.Throwable -> L28
        L75:
            javax.mail.MessagingException r5 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = r4.getMessage()     // Catch: java.lang.Throwable -> L28
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L28
            throw r5     // Catch: java.lang.Throwable -> L28
        L7f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r4     // Catch: java.lang.Throwable -> L81
        L81:
            r4 = move-exception
            goto L88
        L83:
            super.copyMessages(r4, r5)     // Catch: java.lang.Throwable -> L81
        L86:
            monitor-exit(r3)
            return
        L88:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L81
            throw r4
    }

    public synchronized boolean create(int r4) throws javax.mail.MessagingException {
            r3 = this;
            monitor-enter(r3)
            r0 = r4 & 1
            r1 = 0
            if (r0 != 0) goto Ld
            char r0 = r3.getSeparator()     // Catch: java.lang.Throwable -> Lb
            goto Le
        Lb:
            r4 = move-exception
            goto L27
        Ld:
            r0 = 0
        Le:
            com.sun.mail.imap.e$p r2 = new com.sun.mail.imap.e$p     // Catch: java.lang.Throwable -> Lb
            r2.<init>(r3, r4, r0)     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r4 = r3.q(r2)     // Catch: java.lang.Throwable -> Lb
            if (r4 != 0) goto L1b
            monitor-exit(r3)
            return r1
        L1b:
            boolean r4 = r3.exists()     // Catch: java.lang.Throwable -> Lb
            if (r4 == 0) goto L25
            r0 = 1
            r3.notifyFolderListeners(r0)     // Catch: java.lang.Throwable -> Lb
        L25:
            monitor-exit(r3)
            return r4
        L27:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb
            throw r4
    }

    public synchronized boolean delete(boolean r5) throws javax.mail.MessagingException {
            r4 = this;
            monitor-enter(r4)
            r4.i()     // Catch: java.lang.Throwable -> L18
            r0 = 0
            if (r5 == 0) goto L1a
            javax.mail.Folder[] r1 = r4.list()     // Catch: java.lang.Throwable -> L18
            r2 = 0
        Lc:
            int r3 = r1.length     // Catch: java.lang.Throwable -> L18
            if (r2 < r3) goto L10
            goto L1a
        L10:
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L18
            r3.delete(r5)     // Catch: java.lang.Throwable -> L18
            int r2 = r2 + 1
            goto Lc
        L18:
            r5 = move-exception
            goto L33
        L1a:
            com.sun.mail.imap.e$r r5 = new com.sun.mail.imap.e$r     // Catch: java.lang.Throwable -> L18
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L18
            java.lang.Object r5 = r4.q(r5)     // Catch: java.lang.Throwable -> L18
            if (r5 != 0) goto L27
            monitor-exit(r4)
            return r0
        L27:
            r4.g = r0     // Catch: java.lang.Throwable -> L18
            r5 = 0
            r4.i = r5     // Catch: java.lang.Throwable -> L18
            r5 = 2
            r4.notifyFolderListeners(r5)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r4)
            r5 = 1
            return r5
        L33:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L18
            throw r5
    }

    public void e(com.sun.mail.imap.a r2) throws javax.mail.MessagingException {
            r1 = this;
            r0 = 0
            r1.P(r2, r0)
            return
    }

    public synchronized boolean exists() throws javax.mail.MessagingException {
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.h     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L20
            char r0 = r7.d     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = r7.a     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L1e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1e
            char r1 = r7.d     // Catch: java.lang.Throwable -> L1e
            r0.append(r1)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1e
            goto L22
        L1e:
            r0 = move-exception
            goto L82
        L20:
            java.lang.String r0 = r7.a     // Catch: java.lang.Throwable -> L1e
        L22:
            com.sun.mail.imap.e$k r1 = new com.sun.mail.imap.e$k     // Catch: java.lang.Throwable -> L1e
            r1.<init>(r7, r0)     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r1 = r7.p(r1)     // Catch: java.lang.Throwable -> L1e
            com.sun.mail.imap.protocol.m[] r1 = (com.sun.mail.imap.protocol.m[]) r1     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L77
            int r0 = r7.v(r1, r0)     // Catch: java.lang.Throwable -> L1e
            r2 = r1[r0]     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = r2.a     // Catch: java.lang.Throwable -> L1e
            r7.a = r3     // Catch: java.lang.Throwable -> L1e
            char r2 = r2.b     // Catch: java.lang.Throwable -> L1e
            r7.d = r2     // Catch: java.lang.Throwable -> L1e
            int r2 = r3.length()     // Catch: java.lang.Throwable -> L1e
            char r3 = r7.d     // Catch: java.lang.Throwable -> L1e
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L5c
            if (r2 <= 0) goto L5c
            java.lang.String r3 = r7.a     // Catch: java.lang.Throwable -> L1e
            int r2 = r2 - r5
            char r3 = r3.charAt(r2)     // Catch: java.lang.Throwable -> L1e
            char r6 = r7.d     // Catch: java.lang.Throwable -> L1e
            if (r3 != r6) goto L5c
            java.lang.String r3 = r7.a     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = r3.substring(r4, r2)     // Catch: java.lang.Throwable -> L1e
            r7.a = r2     // Catch: java.lang.Throwable -> L1e
        L5c:
            r7.c = r4     // Catch: java.lang.Throwable -> L1e
            r0 = r1[r0]     // Catch: java.lang.Throwable -> L1e
            boolean r1 = r0.c     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L67
            r1 = 2
            r7.c = r1     // Catch: java.lang.Throwable -> L1e
        L67:
            boolean r1 = r0.d     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L70
            int r1 = r7.c     // Catch: java.lang.Throwable -> L1e
            r1 = r1 | r5
            r7.c = r1     // Catch: java.lang.Throwable -> L1e
        L70:
            r7.g = r5     // Catch: java.lang.Throwable -> L1e
            java.lang.String[] r0 = r0.f     // Catch: java.lang.Throwable -> L1e
            r7.i = r0     // Catch: java.lang.Throwable -> L1e
            goto L7e
        L77:
            boolean r0 = r7.n     // Catch: java.lang.Throwable -> L1e
            r7.g = r0     // Catch: java.lang.Throwable -> L1e
            r0 = 0
            r7.i = r0     // Catch: java.lang.Throwable -> L1e
        L7e:
            boolean r0 = r7.g     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r7)
            return r0
        L82:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L1e
            throw r0
    }

    public synchronized javax.mail.Message[] expunge() throws javax.mail.MessagingException {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            javax.mail.Message[] r0 = r1.u(r0)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return r0
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    public synchronized javax.mail.Message[] f(javax.mail.Message[] r9) throws javax.mail.MessagingException {
            r8 = this;
            monitor-enter(r8)
            r8.l()     // Catch: java.lang.Throwable -> L26
            int r0 = r9.length     // Catch: java.lang.Throwable -> L26
            javax.mail.internet.MimeMessage[] r0 = new javax.mail.internet.MimeMessage[r0]     // Catch: java.lang.Throwable -> L26
            com.sun.mail.imap.b[] r9 = r8.h(r9)     // Catch: java.lang.Throwable -> L26
            r1 = 0
        Lc:
            int r2 = r9.length     // Catch: java.lang.Throwable -> L26
            if (r1 < r2) goto L11
            monitor-exit(r8)
            return r0
        L11:
            r2 = r9[r1]     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L28
            long r3 = r2.a     // Catch: java.lang.Throwable -> L26
            long r5 = r8.u     // Catch: java.lang.Throwable -> L26
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L28
            long r2 = r2.b     // Catch: java.lang.Throwable -> L26 javax.mail.MessagingException -> L28
            javax.mail.Message r2 = r8.getMessageByUID(r2)     // Catch: java.lang.Throwable -> L26 javax.mail.MessagingException -> L28
            r0[r1] = r2     // Catch: java.lang.Throwable -> L26 javax.mail.MessagingException -> L28
            goto L28
        L26:
            r9 = move-exception
            goto L2b
        L28:
            int r1 = r1 + 1
            goto Lc
        L2b:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L26
            throw r9
    }

    public synchronized void fetch(javax.mail.Message[] r1, javax.mail.FetchProfile r2) throws javax.mail.MessagingException {
            r0 = this;
            monitor-enter(r0)
            r0.l()     // Catch: java.lang.Throwable -> L9
            com.sun.mail.imap.g.p(r0, r1, r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    public void g(com.sun.mail.imap.a r2) throws javax.mail.MessagingException {
            r1 = this;
            r0 = 43
            r1.P(r2, r0)
            return
    }

    public synchronized int getDeletedMessageCount() throws javax.mail.MessagingException {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.n     // Catch: java.lang.Throwable -> Lb
            if (r0 != 0) goto Ld
            r5.j()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r5)
            r0 = -1
            return r0
        Lb:
            r0 = move-exception
            goto L47
        Ld:
            javax.mail.Flags r0 = new javax.mail.Flags     // Catch: java.lang.Throwable -> Lb
            r0.<init>()     // Catch: java.lang.Throwable -> Lb
            javax.mail.Flags$Flag r1 = javax.mail.Flags.Flag.DELETED     // Catch: java.lang.Throwable -> Lb
            r0.add(r1)     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r1 = r5.l     // Catch: java.lang.Throwable -> Lb com.sun.mail.iap.ProtocolException -> L2f com.sun.mail.iap.ConnectionException -> L31
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lb com.sun.mail.iap.ProtocolException -> L2f com.sun.mail.iap.ConnectionException -> L31
            com.sun.mail.imap.protocol.h r2 = r5.A()     // Catch: java.lang.Throwable -> L2c
            javax.mail.search.FlagTerm r3 = new javax.mail.search.FlagTerm     // Catch: java.lang.Throwable -> L2c
            r4 = 1
            r3.<init>(r0, r4)     // Catch: java.lang.Throwable -> L2c
            int[] r0 = r2.D0(r3)     // Catch: java.lang.Throwable -> L2c
            int r0 = r0.length     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r5)
            return r0
        L2c:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2c
            throw r0     // Catch: java.lang.Throwable -> Lb com.sun.mail.iap.ProtocolException -> L2f com.sun.mail.iap.ConnectionException -> L31
        L2f:
            r0 = move-exception
            goto L33
        L31:
            r0 = move-exception
            goto L3d
        L33:
            javax.mail.MessagingException r1 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = r0.getMessage()     // Catch: java.lang.Throwable -> Lb
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> Lb
            throw r1     // Catch: java.lang.Throwable -> Lb
        L3d:
            javax.mail.FolderClosedException r1 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> Lb
            r1.<init>(r5, r0)     // Catch: java.lang.Throwable -> Lb
            throw r1     // Catch: java.lang.Throwable -> Lb
        L47:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    public javax.mail.Folder getFolder(java.lang.String r5) throws javax.mail.MessagingException {
            r4 = this;
            java.lang.String[] r0 = r4.i
            if (r0 == 0) goto L13
            boolean r0 = r4.H()
            if (r0 == 0) goto Lb
            goto L13
        Lb:
            javax.mail.MessagingException r5 = new javax.mail.MessagingException
            java.lang.String r0 = "Cannot contain subfolders"
            r5.<init>(r0)
            throw r5
        L13:
            char r0 = r4.getSeparator()
            com.sun.mail.imap.e r1 = new com.sun.mail.imap.e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = r4.a
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            javax.mail.Store r2 = r4.store
            com.sun.mail.imap.k r2 = (com.sun.mail.imap.k) r2
            r1.<init>(r5, r0, r2)
            return r1
    }

    public synchronized java.lang.String getFullName() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = r1.a     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public synchronized javax.mail.Message getMessage(int r2) throws javax.mail.MessagingException {
            r1 = this;
            monitor-enter(r1)
            r1.l()     // Catch: java.lang.Throwable -> L13
            r1.m(r2)     // Catch: java.lang.Throwable -> L13
            java.util.Vector r0 = r1.k     // Catch: java.lang.Throwable -> L13
            int r2 = r2 + (-1)
            java.lang.Object r2 = r0.elementAt(r2)     // Catch: java.lang.Throwable -> L13
            javax.mail.Message r2 = (javax.mail.Message) r2     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return r2
        L13:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r2
    }

    public synchronized javax.mail.Message getMessageByUID(long r5) throws javax.mail.MessagingException {
            r4 = this;
            monitor-enter(r4)
            r4.l()     // Catch: java.lang.Throwable -> L48
            java.lang.Object r0 = r4.l     // Catch: java.lang.Throwable -> L48 com.sun.mail.iap.ProtocolException -> L4a com.sun.mail.iap.ConnectionException -> L4c
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L48 com.sun.mail.iap.ProtocolException -> L4a com.sun.mail.iap.ConnectionException -> L4c
            java.lang.Long r1 = new java.lang.Long     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L1b
            java.util.Hashtable r2 = r4.m     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L1b
            com.sun.mail.imap.g r2 = (com.sun.mail.imap.g) r2     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L25
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r4)
            return r2
        L1b:
            r5 = move-exception
            goto L46
        L1d:
            java.util.Hashtable r2 = new java.util.Hashtable     // Catch: java.lang.Throwable -> L1b
            r2.<init>()     // Catch: java.lang.Throwable -> L1b
            r4.m = r2     // Catch: java.lang.Throwable -> L1b
            r2 = 0
        L25:
            com.sun.mail.imap.protocol.h r3 = r4.A()     // Catch: java.lang.Throwable -> L1b
            com.sun.mail.imap.protocol.v r5 = r3.U(r5)     // Catch: java.lang.Throwable -> L1b
            if (r5 == 0) goto L43
            int r6 = r5.a     // Catch: java.lang.Throwable -> L1b
            int r3 = r4.r     // Catch: java.lang.Throwable -> L1b
            if (r6 > r3) goto L43
            com.sun.mail.imap.g r2 = r4.z(r6)     // Catch: java.lang.Throwable -> L1b
            long r5 = r5.b     // Catch: java.lang.Throwable -> L1b
            r2.J(r5)     // Catch: java.lang.Throwable -> L1b
            java.util.Hashtable r5 = r4.m     // Catch: java.lang.Throwable -> L1b
            r5.put(r1, r2)     // Catch: java.lang.Throwable -> L1b
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r4)
            return r2
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r5     // Catch: java.lang.Throwable -> L48 com.sun.mail.iap.ProtocolException -> L4a com.sun.mail.iap.ConnectionException -> L4c
        L48:
            r5 = move-exception
            goto L62
        L4a:
            r5 = move-exception
            goto L4e
        L4c:
            r5 = move-exception
            goto L58
        L4e:
            javax.mail.MessagingException r6 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L48
            java.lang.String r0 = r5.getMessage()     // Catch: java.lang.Throwable -> L48
            r6.<init>(r0, r5)     // Catch: java.lang.Throwable -> L48
            throw r6     // Catch: java.lang.Throwable -> L48
        L58:
            javax.mail.FolderClosedException r6 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> L48
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L48
            r6.<init>(r4, r5)     // Catch: java.lang.Throwable -> L48
            throw r6     // Catch: java.lang.Throwable -> L48
        L62:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L48
            throw r5
    }

    public synchronized int getMessageCount() throws javax.mail.MessagingException {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.n     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L52
            r4.j()     // Catch: java.lang.Throwable -> L10
            com.sun.mail.imap.protocol.u r0 = r4.C()     // Catch: java.lang.Throwable -> L10 com.sun.mail.iap.ProtocolException -> L12 com.sun.mail.iap.ConnectionException -> L14 com.sun.mail.iap.BadCommandException -> L2c
            int r0 = r0.b     // Catch: java.lang.Throwable -> L10 com.sun.mail.iap.ProtocolException -> L12 com.sun.mail.iap.ConnectionException -> L14 com.sun.mail.iap.BadCommandException -> L2c
            monitor-exit(r4)
            return r0
        L10:
            r0 = move-exception
            goto L7a
        L12:
            r0 = move-exception
            goto L16
        L14:
            r0 = move-exception
            goto L20
        L16:
            javax.mail.MessagingException r1 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = r0.getMessage()     // Catch: java.lang.Throwable -> L10
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L10
            throw r1     // Catch: java.lang.Throwable -> L10
        L20:
            javax.mail.StoreClosedException r1 = new javax.mail.StoreClosedException     // Catch: java.lang.Throwable -> L10
            javax.mail.Store r2 = r4.store     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L10
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L10
            throw r1     // Catch: java.lang.Throwable -> L10
        L2c:
            r0 = 0
            com.sun.mail.imap.protocol.h r0 = r4.D()     // Catch: java.lang.Throwable -> L41 com.sun.mail.iap.ProtocolException -> L43
            java.lang.String r1 = r4.a     // Catch: java.lang.Throwable -> L41 com.sun.mail.iap.ProtocolException -> L43
            com.sun.mail.imap.protocol.n r1 = r0.G(r1)     // Catch: java.lang.Throwable -> L41 com.sun.mail.iap.ProtocolException -> L43
            r0.y()     // Catch: java.lang.Throwable -> L41 com.sun.mail.iap.ProtocolException -> L43
            int r1 = r1.c     // Catch: java.lang.Throwable -> L41 com.sun.mail.iap.ProtocolException -> L43
            r4.M(r0)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r4)
            return r1
        L41:
            r1 = move-exception
            goto L4e
        L43:
            r1 = move-exception
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = r1.getMessage()     // Catch: java.lang.Throwable -> L41
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L41
            throw r2     // Catch: java.lang.Throwable -> L41
        L4e:
            r4.M(r0)     // Catch: java.lang.Throwable -> L10
            throw r1     // Catch: java.lang.Throwable -> L10
        L52:
            java.lang.Object r0 = r4.l     // Catch: java.lang.Throwable -> L10
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L10
            r1 = 1
            r4.I(r1)     // Catch: java.lang.Throwable -> L5e com.sun.mail.iap.ProtocolException -> L60 com.sun.mail.iap.ConnectionException -> L62
            int r1 = r4.r     // Catch: java.lang.Throwable -> L5e com.sun.mail.iap.ProtocolException -> L60 com.sun.mail.iap.ConnectionException -> L62
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r4)
            return r1
        L5e:
            r1 = move-exception
            goto L78
        L60:
            r1 = move-exception
            goto L64
        L62:
            r1 = move-exception
            goto L6e
        L64:
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = r1.getMessage()     // Catch: java.lang.Throwable -> L5e
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L5e
            throw r2     // Catch: java.lang.Throwable -> L5e
        L6e:
            javax.mail.FolderClosedException r2 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> L5e
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L5e
            r2.<init>(r4, r1)     // Catch: java.lang.Throwable -> L5e
            throw r2     // Catch: java.lang.Throwable -> L5e
        L78:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            throw r1     // Catch: java.lang.Throwable -> L10
        L7a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    public synchronized javax.mail.Message[] getMessagesByUID(long r6, long r8) throws javax.mail.MessagingException {
            r5 = this;
            monitor-enter(r5)
            r5.l()     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r0 = r5.l     // Catch: java.lang.Throwable -> L4b com.sun.mail.iap.ProtocolException -> L4d com.sun.mail.iap.ConnectionException -> L4f
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L4b com.sun.mail.iap.ProtocolException -> L4d com.sun.mail.iap.ConnectionException -> L4f
            java.util.Hashtable r1 = r5.m     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            java.util.Hashtable r1 = new java.util.Hashtable     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            r5.m = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r6 = move-exception
            goto L49
        L15:
            com.sun.mail.imap.protocol.h r1 = r5.A()     // Catch: java.lang.Throwable -> L13
            com.sun.mail.imap.protocol.v[] r6 = r1.V(r6, r8)     // Catch: java.lang.Throwable -> L13
            int r7 = r6.length     // Catch: java.lang.Throwable -> L13
            javax.mail.Message[] r7 = new javax.mail.Message[r7]     // Catch: java.lang.Throwable -> L13
            r8 = 0
        L21:
            int r9 = r6.length     // Catch: java.lang.Throwable -> L13
            if (r8 < r9) goto L27
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r5)
            return r7
        L27:
            r9 = r6[r8]     // Catch: java.lang.Throwable -> L13
            int r9 = r9.a     // Catch: java.lang.Throwable -> L13
            com.sun.mail.imap.g r9 = r5.z(r9)     // Catch: java.lang.Throwable -> L13
            r1 = r6[r8]     // Catch: java.lang.Throwable -> L13
            long r1 = r1.b     // Catch: java.lang.Throwable -> L13
            r9.J(r1)     // Catch: java.lang.Throwable -> L13
            r7[r8] = r9     // Catch: java.lang.Throwable -> L13
            java.util.Hashtable r1 = r5.m     // Catch: java.lang.Throwable -> L13
            java.lang.Long r2 = new java.lang.Long     // Catch: java.lang.Throwable -> L13
            r3 = r6[r8]     // Catch: java.lang.Throwable -> L13
            long r3 = r3.b     // Catch: java.lang.Throwable -> L13
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L13
            r1.put(r2, r9)     // Catch: java.lang.Throwable -> L13
            int r8 = r8 + 1
            goto L21
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r6     // Catch: java.lang.Throwable -> L4b com.sun.mail.iap.ProtocolException -> L4d com.sun.mail.iap.ConnectionException -> L4f
        L4b:
            r6 = move-exception
            goto L65
        L4d:
            r6 = move-exception
            goto L51
        L4f:
            r6 = move-exception
            goto L5b
        L51:
            javax.mail.MessagingException r7 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L4b
            java.lang.String r8 = r6.getMessage()     // Catch: java.lang.Throwable -> L4b
            r7.<init>(r8, r6)     // Catch: java.lang.Throwable -> L4b
            throw r7     // Catch: java.lang.Throwable -> L4b
        L5b:
            javax.mail.FolderClosedException r7 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> L4b
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L4b
            r7.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4b
            throw r7     // Catch: java.lang.Throwable -> L4b
        L65:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4b
            throw r6
    }

    public synchronized javax.mail.Message[] getMessagesByUID(long[] r10) throws javax.mail.MessagingException {
            r9 = this;
            monitor-enter(r9)
            r9.l()     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r0 = r9.l     // Catch: java.lang.Throwable -> L9c com.sun.mail.iap.ProtocolException -> L9e com.sun.mail.iap.ConnectionException -> La0
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L9c com.sun.mail.iap.ProtocolException -> L9e com.sun.mail.iap.ConnectionException -> La0
            java.util.Hashtable r1 = r9.m     // Catch: java.lang.Throwable -> L2e
            r2 = 0
            if (r1 == 0) goto L45
            java.util.Vector r1 = new java.util.Vector     // Catch: java.lang.Throwable -> L2e
            r1.<init>()     // Catch: java.lang.Throwable -> L2e
            r3 = 0
        L12:
            int r4 = r10.length     // Catch: java.lang.Throwable -> L2e
            if (r3 < r4) goto L30
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L2e
            long[] r4 = new long[r3]     // Catch: java.lang.Throwable -> L2e
            r5 = 0
        L1c:
            if (r5 < r3) goto L1f
            goto L4d
        L1f:
            java.lang.Object r6 = r1.elementAt(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r6 = (java.lang.Long) r6     // Catch: java.lang.Throwable -> L2e
            long r6 = r6.longValue()     // Catch: java.lang.Throwable -> L2e
            r4[r5] = r6     // Catch: java.lang.Throwable -> L2e
            int r5 = r5 + 1
            goto L1c
        L2e:
            r10 = move-exception
            goto L9a
        L30:
            java.util.Hashtable r4 = r9.m     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r5 = new java.lang.Long     // Catch: java.lang.Throwable -> L2e
            r6 = r10[r3]     // Catch: java.lang.Throwable -> L2e
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L2e
            boolean r4 = r4.containsKey(r5)     // Catch: java.lang.Throwable -> L2e
            if (r4 != 0) goto L42
            r1.addElement(r5)     // Catch: java.lang.Throwable -> L2e
        L42:
            int r3 = r3 + 1
            goto L12
        L45:
            java.util.Hashtable r1 = new java.util.Hashtable     // Catch: java.lang.Throwable -> L2e
            r1.<init>()     // Catch: java.lang.Throwable -> L2e
            r9.m = r1     // Catch: java.lang.Throwable -> L2e
            r4 = r10
        L4d:
            int r1 = r4.length     // Catch: java.lang.Throwable -> L2e
            if (r1 <= 0) goto L7d
            com.sun.mail.imap.protocol.h r1 = r9.A()     // Catch: java.lang.Throwable -> L2e
            com.sun.mail.imap.protocol.v[] r1 = r1.W(r4)     // Catch: java.lang.Throwable -> L2e
            r3 = 0
        L59:
            int r4 = r1.length     // Catch: java.lang.Throwable -> L2e
            if (r3 < r4) goto L5d
            goto L7d
        L5d:
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L2e
            int r4 = r4.a     // Catch: java.lang.Throwable -> L2e
            com.sun.mail.imap.g r4 = r9.z(r4)     // Catch: java.lang.Throwable -> L2e
            r5 = r1[r3]     // Catch: java.lang.Throwable -> L2e
            long r5 = r5.b     // Catch: java.lang.Throwable -> L2e
            r4.J(r5)     // Catch: java.lang.Throwable -> L2e
            java.util.Hashtable r5 = r9.m     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r6 = new java.lang.Long     // Catch: java.lang.Throwable -> L2e
            r7 = r1[r3]     // Catch: java.lang.Throwable -> L2e
            long r7 = r7.b     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L2e
            r5.put(r6, r4)     // Catch: java.lang.Throwable -> L2e
            int r3 = r3 + 1
            goto L59
        L7d:
            int r1 = r10.length     // Catch: java.lang.Throwable -> L2e
            javax.mail.Message[] r1 = new javax.mail.Message[r1]     // Catch: java.lang.Throwable -> L2e
        L80:
            int r3 = r10.length     // Catch: java.lang.Throwable -> L2e
            if (r2 < r3) goto L86
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r9)
            return r1
        L86:
            java.util.Hashtable r3 = r9.m     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r4 = new java.lang.Long     // Catch: java.lang.Throwable -> L2e
            r5 = r10[r2]     // Catch: java.lang.Throwable -> L2e
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L2e
            javax.mail.Message r3 = (javax.mail.Message) r3     // Catch: java.lang.Throwable -> L2e
            r1[r2] = r3     // Catch: java.lang.Throwable -> L2e
            int r2 = r2 + 1
            goto L80
        L9a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            throw r10     // Catch: java.lang.Throwable -> L9c com.sun.mail.iap.ProtocolException -> L9e com.sun.mail.iap.ConnectionException -> La0
        L9c:
            r10 = move-exception
            goto Lb6
        L9e:
            r10 = move-exception
            goto La2
        La0:
            r10 = move-exception
            goto Lac
        La2:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L9c
            java.lang.String r1 = r10.getMessage()     // Catch: java.lang.Throwable -> L9c
            r0.<init>(r1, r10)     // Catch: java.lang.Throwable -> L9c
            throw r0     // Catch: java.lang.Throwable -> L9c
        Lac:
            javax.mail.FolderClosedException r0 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> L9c
            java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> L9c
            r0.<init>(r9, r10)     // Catch: java.lang.Throwable -> L9c
            throw r0     // Catch: java.lang.Throwable -> L9c
        Lb6:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L9c
            throw r10
    }

    public synchronized java.lang.String getName() {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2.b     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L1a
            java.lang.String r0 = r2.a     // Catch: java.lang.Throwable -> L18 javax.mail.MessagingException -> L1a
            char r1 = r2.getSeparator()     // Catch: java.lang.Throwable -> L18 javax.mail.MessagingException -> L1a
            int r1 = r0.lastIndexOf(r1)     // Catch: java.lang.Throwable -> L18 javax.mail.MessagingException -> L1a
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)     // Catch: java.lang.Throwable -> L18 javax.mail.MessagingException -> L1a
            r2.b = r0     // Catch: java.lang.Throwable -> L18 javax.mail.MessagingException -> L1a
            goto L1a
        L18:
            r0 = move-exception
            goto L1e
        L1a:
            java.lang.String r0 = r2.b     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            return r0
        L1e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r0
    }

    public synchronized int getNewMessageCount() throws javax.mail.MessagingException {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.n     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L52
            r4.j()     // Catch: java.lang.Throwable -> L10
            com.sun.mail.imap.protocol.u r0 = r4.C()     // Catch: java.lang.Throwable -> L10 com.sun.mail.iap.ProtocolException -> L12 com.sun.mail.iap.ConnectionException -> L14 com.sun.mail.iap.BadCommandException -> L2c
            int r0 = r0.c     // Catch: java.lang.Throwable -> L10 com.sun.mail.iap.ProtocolException -> L12 com.sun.mail.iap.ConnectionException -> L14 com.sun.mail.iap.BadCommandException -> L2c
            monitor-exit(r4)
            return r0
        L10:
            r0 = move-exception
            goto L7a
        L12:
            r0 = move-exception
            goto L16
        L14:
            r0 = move-exception
            goto L20
        L16:
            javax.mail.MessagingException r1 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = r0.getMessage()     // Catch: java.lang.Throwable -> L10
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L10
            throw r1     // Catch: java.lang.Throwable -> L10
        L20:
            javax.mail.StoreClosedException r1 = new javax.mail.StoreClosedException     // Catch: java.lang.Throwable -> L10
            javax.mail.Store r2 = r4.store     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L10
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L10
            throw r1     // Catch: java.lang.Throwable -> L10
        L2c:
            r0 = 0
            com.sun.mail.imap.protocol.h r0 = r4.D()     // Catch: java.lang.Throwable -> L41 com.sun.mail.iap.ProtocolException -> L43
            java.lang.String r1 = r4.a     // Catch: java.lang.Throwable -> L41 com.sun.mail.iap.ProtocolException -> L43
            com.sun.mail.imap.protocol.n r1 = r0.G(r1)     // Catch: java.lang.Throwable -> L41 com.sun.mail.iap.ProtocolException -> L43
            r0.y()     // Catch: java.lang.Throwable -> L41 com.sun.mail.iap.ProtocolException -> L43
            int r1 = r1.d     // Catch: java.lang.Throwable -> L41 com.sun.mail.iap.ProtocolException -> L43
            r4.M(r0)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r4)
            return r1
        L41:
            r1 = move-exception
            goto L4e
        L43:
            r1 = move-exception
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = r1.getMessage()     // Catch: java.lang.Throwable -> L41
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L41
            throw r2     // Catch: java.lang.Throwable -> L41
        L4e:
            r4.M(r0)     // Catch: java.lang.Throwable -> L10
            throw r1     // Catch: java.lang.Throwable -> L10
        L52:
            java.lang.Object r0 = r4.l     // Catch: java.lang.Throwable -> L10
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L10
            r1 = 1
            r4.I(r1)     // Catch: java.lang.Throwable -> L5e com.sun.mail.iap.ProtocolException -> L60 com.sun.mail.iap.ConnectionException -> L62
            int r1 = r4.s     // Catch: java.lang.Throwable -> L5e com.sun.mail.iap.ProtocolException -> L60 com.sun.mail.iap.ConnectionException -> L62
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r4)
            return r1
        L5e:
            r1 = move-exception
            goto L78
        L60:
            r1 = move-exception
            goto L64
        L62:
            r1 = move-exception
            goto L6e
        L64:
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = r1.getMessage()     // Catch: java.lang.Throwable -> L5e
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L5e
            throw r2     // Catch: java.lang.Throwable -> L5e
        L6e:
            javax.mail.FolderClosedException r2 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> L5e
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L5e
            r2.<init>(r4, r1)     // Catch: java.lang.Throwable -> L5e
            throw r2     // Catch: java.lang.Throwable -> L5e
        L78:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            throw r1     // Catch: java.lang.Throwable -> L10
        L7a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    public synchronized javax.mail.Folder getParent() throws javax.mail.MessagingException {
            r5 = this;
            monitor-enter(r5)
            char r0 = r5.getSeparator()     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = r5.a     // Catch: java.lang.Throwable -> L20
            int r1 = r1.lastIndexOf(r0)     // Catch: java.lang.Throwable -> L20
            r2 = -1
            if (r1 == r2) goto L22
            com.sun.mail.imap.e r2 = new com.sun.mail.imap.e     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = r5.a     // Catch: java.lang.Throwable -> L20
            r4 = 0
            java.lang.String r1 = r3.substring(r4, r1)     // Catch: java.lang.Throwable -> L20
            javax.mail.Store r3 = r5.store     // Catch: java.lang.Throwable -> L20
            com.sun.mail.imap.k r3 = (com.sun.mail.imap.k) r3     // Catch: java.lang.Throwable -> L20
            r2.<init>(r1, r0, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r5)
            return r2
        L20:
            r0 = move-exception
            goto L2d
        L22:
            com.sun.mail.imap.c r0 = new com.sun.mail.imap.c     // Catch: java.lang.Throwable -> L20
            javax.mail.Store r1 = r5.store     // Catch: java.lang.Throwable -> L20
            com.sun.mail.imap.k r1 = (com.sun.mail.imap.k) r1     // Catch: java.lang.Throwable -> L20
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r5)
            return r0
        L2d:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L20
            throw r0
    }

    public synchronized javax.mail.Flags getPermanentFlags() {
            r1 = this;
            monitor-enter(r1)
            javax.mail.Flags r0 = r1.f     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r0 = r0.clone()     // Catch: java.lang.Throwable -> Lb
            javax.mail.Flags r0 = (javax.mail.Flags) r0     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return r0
        Lb:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    public synchronized char getSeparator() throws javax.mail.MessagingException {
            r2 = this;
            monitor-enter(r2)
            char r0 = r2.d     // Catch: java.lang.Throwable -> L1d
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r1) goto L23
            com.sun.mail.imap.e$m r0 = new com.sun.mail.imap.e$m     // Catch: java.lang.Throwable -> L1d
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r0 = r2.p(r0)     // Catch: java.lang.Throwable -> L1d
            com.sun.mail.imap.protocol.m[] r0 = (com.sun.mail.imap.protocol.m[]) r0     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1f
            r1 = 0
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L1d
            char r0 = r0.b     // Catch: java.lang.Throwable -> L1d
            r2.d = r0     // Catch: java.lang.Throwable -> L1d
            goto L23
        L1d:
            r0 = move-exception
            goto L27
        L1f:
            r0 = 47
            r2.d = r0     // Catch: java.lang.Throwable -> L1d
        L23:
            char r0 = r2.d     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r2)
            return r0
        L27:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r0
    }

    public synchronized int getType() throws javax.mail.MessagingException {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.n     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            java.lang.String[] r0 = r1.i     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto L12
            r1.exists()     // Catch: java.lang.Throwable -> Ld
            goto L12
        Ld:
            r0 = move-exception
            goto L16
        Lf:
            r1.j()     // Catch: java.lang.Throwable -> Ld
        L12:
            int r0 = r1.c     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return r0
        L16:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    public synchronized long getUID(javax.mail.Message r6) throws javax.mail.MessagingException {
            r5 = this;
            monitor-enter(r5)
            javax.mail.Folder r0 = r6.getFolder()     // Catch: java.lang.Throwable -> L66
            if (r0 != r5) goto L68
            r5.l()     // Catch: java.lang.Throwable -> L66
            com.sun.mail.imap.g r6 = (com.sun.mail.imap.g) r6     // Catch: java.lang.Throwable -> L66
            long r0 = r6.x()     // Catch: java.lang.Throwable -> L66
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L18
            monitor-exit(r5)
            return r0
        L18:
            java.lang.Object r2 = r5.l     // Catch: java.lang.Throwable -> L66
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L66
            com.sun.mail.imap.protocol.h r3 = r5.A()     // Catch: java.lang.Throwable -> L3d com.sun.mail.iap.ProtocolException -> L3f com.sun.mail.iap.ConnectionException -> L41
            r6.n()     // Catch: java.lang.Throwable -> L3d com.sun.mail.iap.ProtocolException -> L3f com.sun.mail.iap.ConnectionException -> L41
            int r4 = r6.w()     // Catch: java.lang.Throwable -> L3d com.sun.mail.iap.ProtocolException -> L3f com.sun.mail.iap.ConnectionException -> L41
            com.sun.mail.imap.protocol.v r3 = r3.X(r4)     // Catch: java.lang.Throwable -> L3d com.sun.mail.iap.ProtocolException -> L3f com.sun.mail.iap.ConnectionException -> L41
            if (r3 == 0) goto L4d
            long r0 = r3.b     // Catch: java.lang.Throwable -> L3d com.sun.mail.iap.ProtocolException -> L3f com.sun.mail.iap.ConnectionException -> L41
            r6.J(r0)     // Catch: java.lang.Throwable -> L3d com.sun.mail.iap.ProtocolException -> L3f com.sun.mail.iap.ConnectionException -> L41
            java.util.Hashtable r3 = r5.m     // Catch: java.lang.Throwable -> L3d com.sun.mail.iap.ProtocolException -> L3f com.sun.mail.iap.ConnectionException -> L41
            if (r3 != 0) goto L43
            java.util.Hashtable r3 = new java.util.Hashtable     // Catch: java.lang.Throwable -> L3d com.sun.mail.iap.ProtocolException -> L3f com.sun.mail.iap.ConnectionException -> L41
            r3.<init>()     // Catch: java.lang.Throwable -> L3d com.sun.mail.iap.ProtocolException -> L3f com.sun.mail.iap.ConnectionException -> L41
            r5.m = r3     // Catch: java.lang.Throwable -> L3d com.sun.mail.iap.ProtocolException -> L3f com.sun.mail.iap.ConnectionException -> L41
            goto L43
        L3d:
            r6 = move-exception
            goto L64
        L3f:
            r6 = move-exception
            goto L50
        L41:
            r6 = move-exception
            goto L5a
        L43:
            java.util.Hashtable r3 = r5.m     // Catch: java.lang.Throwable -> L3d com.sun.mail.iap.ProtocolException -> L3f com.sun.mail.iap.ConnectionException -> L41
            java.lang.Long r4 = new java.lang.Long     // Catch: java.lang.Throwable -> L3d com.sun.mail.iap.ProtocolException -> L3f com.sun.mail.iap.ConnectionException -> L41
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L3d com.sun.mail.iap.ProtocolException -> L3f com.sun.mail.iap.ConnectionException -> L41
            r3.put(r4, r6)     // Catch: java.lang.Throwable -> L3d com.sun.mail.iap.ProtocolException -> L3f com.sun.mail.iap.ConnectionException -> L41
        L4d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r5)
            return r0
        L50:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = r6.getMessage()     // Catch: java.lang.Throwable -> L3d
            r0.<init>(r1, r6)     // Catch: java.lang.Throwable -> L3d
            throw r0     // Catch: java.lang.Throwable -> L3d
        L5a:
            javax.mail.FolderClosedException r0 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> L3d
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L3d
            r0.<init>(r5, r6)     // Catch: java.lang.Throwable -> L3d
            throw r0     // Catch: java.lang.Throwable -> L3d
        L64:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3d
            throw r6     // Catch: java.lang.Throwable -> L66
        L66:
            r6 = move-exception
            goto L70
        L68:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = "Message does not belong to this folder"
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L66
            throw r6     // Catch: java.lang.Throwable -> L66
        L70:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L66
            throw r6
    }

    public synchronized long getUIDValidity() throws javax.mail.MessagingException {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.n     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lb
            long r0 = r5.u     // Catch: java.lang.Throwable -> L9
            monitor-exit(r5)
            return r0
        L9:
            r0 = move-exception
            goto L55
        Lb:
            r0 = 0
            com.sun.mail.imap.protocol.h r1 = r5.D()     // Catch: java.lang.Throwable -> L28 com.sun.mail.iap.ProtocolException -> L2d com.sun.mail.iap.ConnectionException -> L3b com.sun.mail.iap.BadCommandException -> L45
            java.lang.String r2 = "UIDVALIDITY"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L20 com.sun.mail.iap.ProtocolException -> L22 com.sun.mail.iap.ConnectionException -> L24 com.sun.mail.iap.BadCommandException -> L26
            java.lang.String r3 = r5.a     // Catch: java.lang.Throwable -> L20 com.sun.mail.iap.ProtocolException -> L22 com.sun.mail.iap.ConnectionException -> L24 com.sun.mail.iap.BadCommandException -> L26
            com.sun.mail.imap.protocol.u r0 = r1.K0(r3, r2)     // Catch: java.lang.Throwable -> L20 com.sun.mail.iap.ProtocolException -> L22 com.sun.mail.iap.ConnectionException -> L24 com.sun.mail.iap.BadCommandException -> L26
        L1c:
            r5.M(r1)     // Catch: java.lang.Throwable -> L9
            goto L41
        L20:
            r0 = move-exception
            goto L51
        L22:
            r0 = move-exception
            goto L31
        L24:
            r2 = move-exception
            goto L3d
        L26:
            r0 = move-exception
            goto L49
        L28:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L51
        L2d:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L31:
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = r0.getMessage()     // Catch: java.lang.Throwable -> L20
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L20
            throw r2     // Catch: java.lang.Throwable -> L20
        L3b:
            r2 = move-exception
            r1 = r0
        L3d:
            r5.R(r2)     // Catch: java.lang.Throwable -> L20
            goto L1c
        L41:
            long r0 = r0.e     // Catch: java.lang.Throwable -> L9
            monitor-exit(r5)
            return r0
        L45:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L49:
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = "Cannot obtain UIDValidity"
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L20
            throw r2     // Catch: java.lang.Throwable -> L20
        L51:
            r5.M(r1)     // Catch: java.lang.Throwable -> L9
            throw r0     // Catch: java.lang.Throwable -> L9
        L55:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public synchronized int getUnreadMessageCount() throws javax.mail.MessagingException {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.n     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L2f
            r5.j()     // Catch: java.lang.Throwable -> L10
            com.sun.mail.imap.protocol.u r0 = r5.C()     // Catch: java.lang.Throwable -> L10 com.sun.mail.iap.ProtocolException -> L12 com.sun.mail.iap.ConnectionException -> L14 com.sun.mail.iap.BadCommandException -> L2c
            int r0 = r0.f     // Catch: java.lang.Throwable -> L10 com.sun.mail.iap.ProtocolException -> L12 com.sun.mail.iap.ConnectionException -> L14 com.sun.mail.iap.BadCommandException -> L2c
            monitor-exit(r5)
            return r0
        L10:
            r0 = move-exception
            goto L69
        L12:
            r0 = move-exception
            goto L16
        L14:
            r0 = move-exception
            goto L20
        L16:
            javax.mail.MessagingException r1 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = r0.getMessage()     // Catch: java.lang.Throwable -> L10
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L10
            throw r1     // Catch: java.lang.Throwable -> L10
        L20:
            javax.mail.StoreClosedException r1 = new javax.mail.StoreClosedException     // Catch: java.lang.Throwable -> L10
            javax.mail.Store r2 = r5.store     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L10
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L10
            throw r1     // Catch: java.lang.Throwable -> L10
        L2c:
            monitor-exit(r5)
            r0 = -1
            return r0
        L2f:
            javax.mail.Flags r0 = new javax.mail.Flags     // Catch: java.lang.Throwable -> L10
            r0.<init>()     // Catch: java.lang.Throwable -> L10
            javax.mail.Flags$Flag r1 = javax.mail.Flags.Flag.SEEN     // Catch: java.lang.Throwable -> L10
            r0.add(r1)     // Catch: java.lang.Throwable -> L10
            java.lang.Object r1 = r5.l     // Catch: java.lang.Throwable -> L10 com.sun.mail.iap.ProtocolException -> L51 com.sun.mail.iap.ConnectionException -> L53
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L10 com.sun.mail.iap.ProtocolException -> L51 com.sun.mail.iap.ConnectionException -> L53
            com.sun.mail.imap.protocol.h r2 = r5.A()     // Catch: java.lang.Throwable -> L4e
            javax.mail.search.FlagTerm r3 = new javax.mail.search.FlagTerm     // Catch: java.lang.Throwable -> L4e
            r4 = 0
            r3.<init>(r0, r4)     // Catch: java.lang.Throwable -> L4e
            int[] r0 = r2.D0(r3)     // Catch: java.lang.Throwable -> L4e
            int r0 = r0.length     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r5)
            return r0
        L4e:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4e
            throw r0     // Catch: java.lang.Throwable -> L10 com.sun.mail.iap.ProtocolException -> L51 com.sun.mail.iap.ConnectionException -> L53
        L51:
            r0 = move-exception
            goto L55
        L53:
            r0 = move-exception
            goto L5f
        L55:
            javax.mail.MessagingException r1 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = r0.getMessage()     // Catch: java.lang.Throwable -> L10
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L10
            throw r1     // Catch: java.lang.Throwable -> L10
        L5f:
            javax.mail.FolderClosedException r1 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L10
            r1.<init>(r5, r0)     // Catch: java.lang.Throwable -> L10
            throw r1     // Catch: java.lang.Throwable -> L10
        L69:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    public synchronized com.sun.mail.imap.b[] h(javax.mail.Message[] r9) throws javax.mail.MessagingException {
            r8 = this;
            monitor-enter(r8)
            r8.j()     // Catch: java.lang.Throwable -> L31
            javax.mail.Store r0 = r8.store     // Catch: java.lang.Throwable -> L31
            com.sun.mail.imap.k r0 = (com.sun.mail.imap.k) r0     // Catch: java.lang.Throwable -> L31
            int r0 = r0.f()     // Catch: java.lang.Throwable -> L31
            int r1 = r9.length     // Catch: java.lang.Throwable -> L31
            com.sun.mail.imap.b[] r1 = new com.sun.mail.imap.b[r1]     // Catch: java.lang.Throwable -> L31
            r2 = 0
            r3 = 0
        L11:
            int r4 = r9.length     // Catch: java.lang.Throwable -> L31
            if (r3 < r4) goto L16
            monitor-exit(r8)
            return r1
        L16:
            r4 = r9[r3]     // Catch: java.lang.Throwable -> L31
            com.sun.mail.imap.m r5 = new com.sun.mail.imap.m     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L45 javax.mail.MessageRemovedException -> L47
            int r6 = r4.getSize()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L45 javax.mail.MessageRemovedException -> L47
            if (r6 <= r0) goto L22
            r6 = 0
            goto L23
        L22:
            r6 = r0
        L23:
            r5.<init>(r4, r6)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L45 javax.mail.MessageRemovedException -> L47
            java.util.Date r6 = r4.getReceivedDate()     // Catch: java.lang.Throwable -> L31
            if (r6 != 0) goto L33
            java.util.Date r6 = r4.getSentDate()     // Catch: java.lang.Throwable -> L31
            goto L33
        L31:
            r9 = move-exception
            goto L52
        L33:
            javax.mail.Flags r4 = r4.getFlags()     // Catch: java.lang.Throwable -> L31
            com.sun.mail.imap.e$b r7 = new com.sun.mail.imap.e$b     // Catch: java.lang.Throwable -> L31
            r7.<init>(r8, r4, r6, r5)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r4 = r8.p(r7)     // Catch: java.lang.Throwable -> L31
            com.sun.mail.imap.b r4 = (com.sun.mail.imap.b) r4     // Catch: java.lang.Throwable -> L31
            r1[r3] = r4     // Catch: java.lang.Throwable -> L31
            goto L47
        L45:
            r9 = move-exception
            goto L4a
        L47:
            int r3 = r3 + 1
            goto L11
        L4a:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "IOException while appending messages"
            r0.<init>(r1, r9)     // Catch: java.lang.Throwable -> L31
            throw r0     // Catch: java.lang.Throwable -> L31
        L52:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L31
            throw r9
    }

    public synchronized boolean hasNewMessages() throws javax.mail.MessagingException {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.n     // Catch: java.lang.Throwable -> L2f
            r1 = 0
            if (r0 == 0) goto L31
            java.lang.Object r0 = r4.l     // Catch: java.lang.Throwable -> L2f
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L2f
            r2 = 1
            r4.I(r2)     // Catch: java.lang.Throwable -> L15 com.sun.mail.iap.ProtocolException -> L17 com.sun.mail.iap.ConnectionException -> L22
            int r3 = r4.s     // Catch: java.lang.Throwable -> L15
            if (r3 <= 0) goto L12
            r1 = 1
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r4)
            return r1
        L15:
            r1 = move-exception
            goto L2d
        L17:
            r1 = move-exception
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = r1.getMessage()     // Catch: java.lang.Throwable -> L15
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L15
            throw r2     // Catch: java.lang.Throwable -> L15
        L22:
            r1 = move-exception
            javax.mail.FolderClosedException r2 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L15
            r2.<init>(r4, r1)     // Catch: java.lang.Throwable -> L15
            throw r2     // Catch: java.lang.Throwable -> L15
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r1     // Catch: java.lang.Throwable -> L2f
        L2f:
            r0 = move-exception
            goto L49
        L31:
            r4.j()     // Catch: java.lang.Throwable -> L2f
            com.sun.mail.imap.e$q r0 = new com.sun.mail.imap.e$q     // Catch: java.lang.Throwable -> L2f
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r0 = r4.q(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L43
            monitor-exit(r4)
            return r1
        L43:
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r4)
            return r0
        L49:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2f
            throw r0
    }

    public synchronized boolean isOpen() {
            r2 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r2.l     // Catch: java.lang.Throwable -> L14
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L14
            boolean r1 = r2.n     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto Lf
            r1 = 0
            r2.I(r1)     // Catch: java.lang.Throwable -> Ld com.sun.mail.iap.ProtocolException -> Lf
            goto Lf
        Ld:
            r1 = move-exception
            goto L16
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            boolean r0 = r2.n     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)
            return r0
        L14:
            r0 = move-exception
            goto L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1     // Catch: java.lang.Throwable -> L14
        L18:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    public synchronized boolean isSubscribed() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.h     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L20
            char r0 = r2.d     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = r2.a     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L1e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1e
            char r1 = r2.d     // Catch: java.lang.Throwable -> L1e
            r0.append(r1)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1e
            goto L22
        L1e:
            r0 = move-exception
            goto L3e
        L20:
            java.lang.String r0 = r2.a     // Catch: java.lang.Throwable -> L1e
        L22:
            com.sun.mail.imap.e$n r1 = new com.sun.mail.imap.e$n     // Catch: java.lang.Throwable -> L1e com.sun.mail.iap.ProtocolException -> L2e
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L1e com.sun.mail.iap.ProtocolException -> L2e
            java.lang.Object r1 = r2.t(r1)     // Catch: java.lang.Throwable -> L1e com.sun.mail.iap.ProtocolException -> L2e
            com.sun.mail.imap.protocol.m[] r1 = (com.sun.mail.imap.protocol.m[]) r1     // Catch: java.lang.Throwable -> L1e com.sun.mail.iap.ProtocolException -> L2e
            goto L2f
        L2e:
            r1 = 0
        L2f:
            if (r1 == 0) goto L3b
            int r0 = r2.v(r1, r0)     // Catch: java.lang.Throwable -> L1e
            r0 = r1[r0]     // Catch: java.lang.Throwable -> L1e
            boolean r0 = r0.d     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r2)
            return r0
        L3b:
            monitor-exit(r2)
            r0 = 0
            return r0
        L3e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            throw r0
    }

    public javax.mail.Folder[] list(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            r0 = 0
            javax.mail.Folder[] r2 = r1.r(r2, r0)
            return r2
    }

    public javax.mail.Folder[] listSubscribed(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            r0 = 1
            javax.mail.Folder[] r2 = r1.r(r2, r0)
            return r2
    }

    public synchronized void open(int r8) throws javax.mail.MessagingException {
            r7 = this;
            monitor-enter(r7)
            r7.i()     // Catch: java.lang.Throwable -> Ld5
            javax.mail.Store r0 = r7.store     // Catch: java.lang.Throwable -> Ld5
            com.sun.mail.imap.k r0 = (com.sun.mail.imap.k) r0     // Catch: java.lang.Throwable -> Ld5
            com.sun.mail.imap.protocol.h r0 = r0.k(r7)     // Catch: java.lang.Throwable -> Ld5
            r7.j = r0     // Catch: java.lang.Throwable -> Ld5
            java.lang.Object r0 = r7.l     // Catch: java.lang.Throwable -> Ld5
            monitor-enter(r0)     // Catch: java.lang.Throwable -> Ld5
            com.sun.mail.imap.protocol.h r1 = r7.j     // Catch: java.lang.Throwable -> L24
            r1.a(r7)     // Catch: java.lang.Throwable -> L24
            r1 = 0
            r2 = 0
            r3 = 1
            if (r8 != r3) goto L2d
            com.sun.mail.imap.protocol.h r4 = r7.j     // Catch: java.lang.Throwable -> L24 com.sun.mail.iap.ProtocolException -> L27 com.sun.mail.iap.CommandFailedException -> L2a
            java.lang.String r5 = r7.a     // Catch: java.lang.Throwable -> L24 com.sun.mail.iap.ProtocolException -> L27 com.sun.mail.iap.CommandFailedException -> L2a
            com.sun.mail.imap.protocol.n r4 = r4.G(r5)     // Catch: java.lang.Throwable -> L24 com.sun.mail.iap.ProtocolException -> L27 com.sun.mail.iap.CommandFailedException -> L2a
            goto L35
        L24:
            r8 = move-exception
            goto Lec
        L27:
            r8 = move-exception
            goto La9
        L2a:
            r8 = move-exception
            goto Lbd
        L2d:
            com.sun.mail.imap.protocol.h r4 = r7.j     // Catch: java.lang.Throwable -> L24 com.sun.mail.iap.ProtocolException -> L27 com.sun.mail.iap.CommandFailedException -> L2a
            java.lang.String r5 = r7.a     // Catch: java.lang.Throwable -> L24 com.sun.mail.iap.ProtocolException -> L27 com.sun.mail.iap.CommandFailedException -> L2a
            com.sun.mail.imap.protocol.n r4 = r4.F0(r5)     // Catch: java.lang.Throwable -> L24 com.sun.mail.iap.ProtocolException -> L27 com.sun.mail.iap.CommandFailedException -> L2a
        L35:
            int r5 = r4.h     // Catch: java.lang.Throwable -> L24
            if (r5 == r8) goto L6a
            r6 = 2
            if (r8 != r6) goto L49
            if (r5 != r3) goto L49
            javax.mail.Store r8 = r7.store     // Catch: java.lang.Throwable -> L24
            com.sun.mail.imap.k r8 = (com.sun.mail.imap.k) r8     // Catch: java.lang.Throwable -> L24
            boolean r8 = r8.b()     // Catch: java.lang.Throwable -> L24
            if (r8 == 0) goto L49
            goto L6a
        L49:
            com.sun.mail.imap.protocol.h r8 = r7.j     // Catch: com.sun.mail.iap.ProtocolException -> L52 java.lang.Throwable -> L60
            r8.y()     // Catch: com.sun.mail.iap.ProtocolException -> L52 java.lang.Throwable -> L60
            r7.L(r3)     // Catch: com.sun.mail.iap.ProtocolException -> L52 java.lang.Throwable -> L60
            goto L60
        L52:
            com.sun.mail.imap.protocol.h r8 = r7.j     // Catch: com.sun.mail.iap.ProtocolException -> L57 java.lang.Throwable -> L5b
            r8.n0()     // Catch: com.sun.mail.iap.ProtocolException -> L57 java.lang.Throwable -> L5b
        L57:
            r7.L(r2)     // Catch: java.lang.Throwable -> L60
            goto L60
        L5b:
            r8 = move-exception
            r7.L(r2)     // Catch: java.lang.Throwable -> L60
            throw r8     // Catch: java.lang.Throwable -> L60
        L60:
            r7.j = r1     // Catch: java.lang.Throwable -> L24
            javax.mail.ReadOnlyFolderException r8 = new javax.mail.ReadOnlyFolderException     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "Cannot open in desired mode"
            r8.<init>(r7, r1)     // Catch: java.lang.Throwable -> L24
            throw r8     // Catch: java.lang.Throwable -> L24
        L6a:
            r7.n = r3     // Catch: java.lang.Throwable -> L24
            r7.o = r2     // Catch: java.lang.Throwable -> L24
            int r8 = r4.h     // Catch: java.lang.Throwable -> L24
            r7.mode = r8     // Catch: java.lang.Throwable -> L24
            javax.mail.Flags r8 = r4.a     // Catch: java.lang.Throwable -> L24
            r7.e = r8     // Catch: java.lang.Throwable -> L24
            javax.mail.Flags r8 = r4.b     // Catch: java.lang.Throwable -> L24
            r7.f = r8     // Catch: java.lang.Throwable -> L24
            int r8 = r4.c     // Catch: java.lang.Throwable -> L24
            r7.t = r8     // Catch: java.lang.Throwable -> L24
            r7.r = r8     // Catch: java.lang.Throwable -> L24
            int r8 = r4.d     // Catch: java.lang.Throwable -> L24
            r7.s = r8     // Catch: java.lang.Throwable -> L24
            long r5 = r4.f     // Catch: java.lang.Throwable -> L24
            r7.u = r5     // Catch: java.lang.Throwable -> L24
            long r4 = r4.g     // Catch: java.lang.Throwable -> L24
            r7.v = r4     // Catch: java.lang.Throwable -> L24
            java.util.Vector r8 = new java.util.Vector     // Catch: java.lang.Throwable -> L24
            int r4 = r7.r     // Catch: java.lang.Throwable -> L24
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L24
            r7.k = r8     // Catch: java.lang.Throwable -> L24
        L95:
            int r8 = r7.r     // Catch: java.lang.Throwable -> L24
            if (r2 < r8) goto L9c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            r8 = r1
            goto Lc3
        L9c:
            java.util.Vector r8 = r7.k     // Catch: java.lang.Throwable -> L24
            com.sun.mail.imap.g r4 = new com.sun.mail.imap.g     // Catch: java.lang.Throwable -> L24
            int r2 = r2 + 1
            r4.<init>(r7, r2, r2)     // Catch: java.lang.Throwable -> L24
            r8.addElement(r4)     // Catch: java.lang.Throwable -> L24
            goto L95
        La9:
            com.sun.mail.imap.protocol.h r3 = r7.j     // Catch: java.lang.Throwable -> Lae
            r3.n0()     // Catch: java.lang.Throwable -> Lae
        Lae:
            r7.L(r2)     // Catch: java.lang.Throwable -> L24
            r7.j = r1     // Catch: java.lang.Throwable -> L24
            javax.mail.MessagingException r1 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = r8.getMessage()     // Catch: java.lang.Throwable -> L24
            r1.<init>(r2, r8)     // Catch: java.lang.Throwable -> L24
            throw r1     // Catch: java.lang.Throwable -> L24
        Lbd:
            r7.L(r3)     // Catch: java.lang.Throwable -> L24
            r7.j = r1     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
        Lc3:
            if (r8 == 0) goto Le1
            r7.j()     // Catch: java.lang.Throwable -> Ld5
            int r0 = r7.c     // Catch: java.lang.Throwable -> Ld5
            r0 = r0 & r3
            if (r0 != 0) goto Ld7
            javax.mail.MessagingException r8 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r0 = "folder cannot contain messages"
            r8.<init>(r0)     // Catch: java.lang.Throwable -> Ld5
            throw r8     // Catch: java.lang.Throwable -> Ld5
        Ld5:
            r8 = move-exception
            goto Lee
        Ld7:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r1 = r8.getMessage()     // Catch: java.lang.Throwable -> Ld5
            r0.<init>(r1, r8)     // Catch: java.lang.Throwable -> Ld5
            throw r0     // Catch: java.lang.Throwable -> Ld5
        Le1:
            r7.g = r3     // Catch: java.lang.Throwable -> Ld5
            r7.i = r1     // Catch: java.lang.Throwable -> Ld5
            r7.c = r3     // Catch: java.lang.Throwable -> Ld5
            r7.notifyConnectionListeners(r3)     // Catch: java.lang.Throwable -> Ld5
            monitor-exit(r7)
            return
        Lec:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r8     // Catch: java.lang.Throwable -> Ld5
        Lee:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Ld5
            throw r8
    }

    public java.lang.Object p(com.sun.mail.imap.e.u r3) throws javax.mail.MessagingException {
            r2 = this;
            java.lang.Object r3 = r2.t(r3)     // Catch: com.sun.mail.iap.ProtocolException -> L5 com.sun.mail.iap.ConnectionException -> L10
            return r3
        L5:
            r3 = move-exception
            javax.mail.MessagingException r0 = new javax.mail.MessagingException
            java.lang.String r1 = r3.getMessage()
            r0.<init>(r1, r3)
            throw r0
        L10:
            r3 = move-exception
            r2.R(r3)
            r3 = 0
            return r3
    }

    public java.lang.Object q(com.sun.mail.imap.e.u r3) throws javax.mail.MessagingException {
            r2 = this;
            r0 = 0
            java.lang.Object r3 = r2.t(r3)     // Catch: com.sun.mail.iap.ProtocolException -> L6 com.sun.mail.iap.ConnectionException -> L11 com.sun.mail.iap.CommandFailedException -> L15
            return r3
        L6:
            r3 = move-exception
            javax.mail.MessagingException r0 = new javax.mail.MessagingException
            java.lang.String r1 = r3.getMessage()
            r0.<init>(r1, r3)
            throw r0
        L11:
            r3 = move-exception
            r2.R(r3)
        L15:
            return r0
    }

    public synchronized boolean renameTo(javax.mail.Folder r3) throws javax.mail.MessagingException {
            r2 = this;
            monitor-enter(r2)
            r2.i()     // Catch: java.lang.Throwable -> L28
            r2.j()     // Catch: java.lang.Throwable -> L28
            javax.mail.Store r0 = r3.getStore()     // Catch: java.lang.Throwable -> L28
            javax.mail.Store r1 = r2.store     // Catch: java.lang.Throwable -> L28
            if (r0 != r1) goto L2a
            com.sun.mail.imap.e$s r0 = new com.sun.mail.imap.e$s     // Catch: java.lang.Throwable -> L28
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L28
            java.lang.Object r0 = r2.q(r0)     // Catch: java.lang.Throwable -> L28
            r1 = 0
            if (r0 != 0) goto L1d
            monitor-exit(r2)
            return r1
        L1d:
            r2.g = r1     // Catch: java.lang.Throwable -> L28
            r0 = 0
            r2.i = r0     // Catch: java.lang.Throwable -> L28
            r2.notifyFolderRenamedListeners(r3)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r2)
            r3 = 1
            return r3
        L28:
            r3 = move-exception
            goto L32
        L2a:
            javax.mail.MessagingException r3 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = "Can't rename across Stores"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L28
            throw r3     // Catch: java.lang.Throwable -> L28
        L32:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L28
            throw r3
    }

    public java.lang.Object s(java.lang.String r2, com.sun.mail.imap.e.u r3) throws javax.mail.MessagingException {
            r1 = this;
            java.lang.Object r2 = r1.t(r3)     // Catch: com.sun.mail.iap.ProtocolException -> L5 com.sun.mail.iap.ConnectionException -> L10 com.sun.mail.iap.BadCommandException -> L16
            return r2
        L5:
            r2 = move-exception
            javax.mail.MessagingException r3 = new javax.mail.MessagingException
            java.lang.String r0 = r2.getMessage()
            r3.<init>(r0, r2)
            throw r3
        L10:
            r2 = move-exception
            r1.R(r2)
            r2 = 0
            return r2
        L16:
            r3 = move-exception
            javax.mail.MessagingException r0 = new javax.mail.MessagingException
            r0.<init>(r2, r3)
            throw r0
    }

    public synchronized javax.mail.Message[] search(javax.mail.search.SearchTerm r6) throws javax.mail.MessagingException {
            r5 = this;
            monitor-enter(r5)
            r5.l()     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r0 = r5.l     // Catch: java.lang.Throwable -> L2c com.sun.mail.iap.ProtocolException -> L2e com.sun.mail.iap.ConnectionException -> L30 javax.mail.search.SearchException -> L46 com.sun.mail.iap.CommandFailedException -> L4c
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L2c com.sun.mail.iap.ProtocolException -> L2e com.sun.mail.iap.ConnectionException -> L30 javax.mail.search.SearchException -> L46 com.sun.mail.iap.CommandFailedException -> L4c
            com.sun.mail.imap.protocol.h r1 = r5.A()     // Catch: java.lang.Throwable -> L24
            int[] r1 = r1.D0(r6)     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            int r2 = r1.length     // Catch: java.lang.Throwable -> L24
            com.sun.mail.imap.g[] r2 = new com.sun.mail.imap.g[r2]     // Catch: java.lang.Throwable -> L24
            r3 = 0
        L15:
            int r4 = r1.length     // Catch: java.lang.Throwable -> L24
            if (r3 < r4) goto L19
            goto L27
        L19:
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L24
            com.sun.mail.imap.g r4 = r5.z(r4)     // Catch: java.lang.Throwable -> L24
            r2[r3] = r4     // Catch: java.lang.Throwable -> L24
            int r3 = r3 + 1
            goto L15
        L24:
            r1 = move-exception
            goto L2a
        L26:
            r2 = 0
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r5)
            return r2
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r1     // Catch: java.lang.Throwable -> L2c com.sun.mail.iap.ProtocolException -> L2e com.sun.mail.iap.ConnectionException -> L30 javax.mail.search.SearchException -> L46 com.sun.mail.iap.CommandFailedException -> L4c
        L2c:
            r6 = move-exception
            goto L52
        L2e:
            r6 = move-exception
            goto L32
        L30:
            r6 = move-exception
            goto L3c
        L32:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = r6.getMessage()     // Catch: java.lang.Throwable -> L2c
            r0.<init>(r1, r6)     // Catch: java.lang.Throwable -> L2c
            throw r0     // Catch: java.lang.Throwable -> L2c
        L3c:
            javax.mail.FolderClosedException r0 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L2c
            r0.<init>(r5, r6)     // Catch: java.lang.Throwable -> L2c
            throw r0     // Catch: java.lang.Throwable -> L2c
        L46:
            javax.mail.Message[] r6 = super.search(r6)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r5)
            return r6
        L4c:
            javax.mail.Message[] r6 = super.search(r6)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r5)
            return r6
        L52:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2c
            throw r6
    }

    public synchronized javax.mail.Message[] search(javax.mail.search.SearchTerm r6, javax.mail.Message[] r7) throws javax.mail.MessagingException {
            r5 = this;
            monitor-enter(r5)
            r5.l()     // Catch: java.lang.Throwable -> L3f
            int r0 = r7.length     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L9
            monitor-exit(r5)
            return r7
        L9:
            java.lang.Object r0 = r5.l     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43 javax.mail.search.SearchException -> L59 com.sun.mail.iap.CommandFailedException -> L5f
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43 javax.mail.search.SearchException -> L59 com.sun.mail.iap.CommandFailedException -> L5f
            com.sun.mail.imap.protocol.h r1 = r5.A()     // Catch: java.lang.Throwable -> L30
            r2 = 0
            com.sun.mail.imap.protocol.o[] r3 = com.sun.mail.imap.o.a(r7, r2)     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L35
            int[] r1 = r1.E0(r3, r6)     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L32
            int r2 = r1.length     // Catch: java.lang.Throwable -> L30
            com.sun.mail.imap.g[] r2 = new com.sun.mail.imap.g[r2]     // Catch: java.lang.Throwable -> L30
            r3 = 0
        L21:
            int r4 = r1.length     // Catch: java.lang.Throwable -> L30
            if (r3 < r4) goto L25
            goto L32
        L25:
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L30
            com.sun.mail.imap.g r4 = r5.z(r4)     // Catch: java.lang.Throwable -> L30
            r2[r3] = r4     // Catch: java.lang.Throwable -> L30
            int r3 = r3 + 1
            goto L21
        L30:
            r1 = move-exception
            goto L3d
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r5)
            return r2
        L35:
            javax.mail.MessageRemovedException r1 = new javax.mail.MessageRemovedException     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "Messages have been removed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L30
            throw r1     // Catch: java.lang.Throwable -> L30
        L3d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            throw r1     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43 javax.mail.search.SearchException -> L59 com.sun.mail.iap.CommandFailedException -> L5f
        L3f:
            r6 = move-exception
            goto L65
        L41:
            r6 = move-exception
            goto L45
        L43:
            r6 = move-exception
            goto L4f
        L45:
            javax.mail.MessagingException r7 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = r6.getMessage()     // Catch: java.lang.Throwable -> L3f
            r7.<init>(r0, r6)     // Catch: java.lang.Throwable -> L3f
            throw r7     // Catch: java.lang.Throwable -> L3f
        L4f:
            javax.mail.FolderClosedException r7 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L3f
            r7.<init>(r5, r6)     // Catch: java.lang.Throwable -> L3f
            throw r7     // Catch: java.lang.Throwable -> L3f
        L59:
            javax.mail.Message[] r6 = super.search(r6, r7)     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r5)
            return r6
        L5f:
            javax.mail.Message[] r6 = super.search(r6, r7)     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r5)
            return r6
        L65:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3f
            throw r6
    }

    public synchronized void setFlags(javax.mail.Message[] r4, javax.mail.Flags r5, boolean r6) throws javax.mail.MessagingException {
            r3 = this;
            monitor-enter(r3)
            r3.l()     // Catch: java.lang.Throwable -> L44
            r3.k(r5)     // Catch: java.lang.Throwable -> L44
            int r0 = r4.length     // Catch: java.lang.Throwable -> L44
            if (r0 != 0) goto Lc
            monitor-exit(r3)
            return
        Lc:
            java.lang.Object r0 = r3.l     // Catch: java.lang.Throwable -> L44
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L44
            com.sun.mail.imap.protocol.h r1 = r3.A()     // Catch: java.lang.Throwable -> L20 com.sun.mail.iap.ProtocolException -> L22 com.sun.mail.iap.ConnectionException -> L24
            r2 = 0
            com.sun.mail.imap.protocol.o[] r4 = com.sun.mail.imap.o.a(r4, r2)     // Catch: java.lang.Throwable -> L20 com.sun.mail.iap.ProtocolException -> L22 com.sun.mail.iap.ConnectionException -> L24
            if (r4 == 0) goto L26
            r1.O0(r4, r5, r6)     // Catch: java.lang.Throwable -> L20 com.sun.mail.iap.ProtocolException -> L22 com.sun.mail.iap.ConnectionException -> L24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r3)
            return
        L20:
            r4 = move-exception
            goto L42
        L22:
            r4 = move-exception
            goto L2e
        L24:
            r4 = move-exception
            goto L38
        L26:
            javax.mail.MessageRemovedException r4 = new javax.mail.MessageRemovedException     // Catch: java.lang.Throwable -> L20 com.sun.mail.iap.ProtocolException -> L22 com.sun.mail.iap.ConnectionException -> L24
            java.lang.String r5 = "Messages have been removed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L20 com.sun.mail.iap.ProtocolException -> L22 com.sun.mail.iap.ConnectionException -> L24
            throw r4     // Catch: java.lang.Throwable -> L20 com.sun.mail.iap.ProtocolException -> L22 com.sun.mail.iap.ConnectionException -> L24
        L2e:
            javax.mail.MessagingException r5 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L20
            java.lang.String r6 = r4.getMessage()     // Catch: java.lang.Throwable -> L20
            r5.<init>(r6, r4)     // Catch: java.lang.Throwable -> L20
            throw r5     // Catch: java.lang.Throwable -> L20
        L38:
            javax.mail.FolderClosedException r5 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> L20
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L20
            r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> L20
            throw r5     // Catch: java.lang.Throwable -> L20
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r4     // Catch: java.lang.Throwable -> L44
        L44:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L44
            throw r4
    }

    public synchronized void setSubscribed(boolean r2) throws javax.mail.MessagingException {
            r1 = this;
            monitor-enter(r1)
            com.sun.mail.imap.e$o r0 = new com.sun.mail.imap.e$o     // Catch: java.lang.Throwable -> Lb
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> Lb
            r1.q(r0)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    protected java.lang.Object t(com.sun.mail.imap.e.u r3) throws com.sun.mail.iap.ProtocolException {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.n     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L22
            javax.mail.Store r0 = r2.store     // Catch: java.lang.Throwable -> L1d
            com.sun.mail.imap.k r0 = (com.sun.mail.imap.k) r0     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r0.q()     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L22
            java.lang.Object r0 = r2.l     // Catch: java.lang.Throwable -> L1d
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L1d
            com.sun.mail.imap.protocol.h r1 = r2.A()     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r3 = r3.a(r1)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            return r3
        L1d:
            r3 = move-exception
            goto L37
        L1f:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r3     // Catch: java.lang.Throwable -> L1d
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            com.sun.mail.imap.protocol.h r0 = r2.D()     // Catch: java.lang.Throwable -> L31
            java.lang.Object r3 = r3.a(r0)     // Catch: java.lang.Throwable -> L2f
            r2.M(r0)
            return r3
        L2f:
            r3 = move-exception
            goto L33
        L31:
            r3 = move-exception
            r0 = 0
        L33:
            r2.M(r0)
            throw r3
        L37:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r3
    }

    public synchronized javax.mail.Message[] u(javax.mail.Message[] r9) throws javax.mail.MessagingException {
            r8 = this;
            monitor-enter(r8)
            r8.l()     // Catch: java.lang.Throwable -> L19
            java.util.Vector r0 = new java.util.Vector     // Catch: java.lang.Throwable -> L19
            r0.<init>()     // Catch: java.lang.Throwable -> L19
            if (r9 == 0) goto L1c
            javax.mail.FetchProfile r1 = new javax.mail.FetchProfile     // Catch: java.lang.Throwable -> L19
            r1.<init>()     // Catch: java.lang.Throwable -> L19
            javax.mail.UIDFolder$FetchProfileItem r2 = javax.mail.UIDFolder.FetchProfileItem.UID     // Catch: java.lang.Throwable -> L19
            r1.add(r2)     // Catch: java.lang.Throwable -> L19
            r8.fetch(r9, r1)     // Catch: java.lang.Throwable -> L19
            goto L1c
        L19:
            r9 = move-exception
            goto Ldb
        L1c:
            java.lang.Object r1 = r8.l     // Catch: java.lang.Throwable -> L19
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L19
            r2 = 0
            r8.w = r2     // Catch: java.lang.Throwable -> L61
            r3 = 1
            com.sun.mail.imap.protocol.h r4 = r8.A()     // Catch: java.lang.Throwable -> L31 com.sun.mail.iap.ProtocolException -> L34 com.sun.mail.iap.ConnectionException -> L36 com.sun.mail.iap.CommandFailedException -> L38
            if (r9 == 0) goto L3b
            com.sun.mail.imap.protocol.w[] r9 = com.sun.mail.imap.o.b(r9)     // Catch: java.lang.Throwable -> L31 com.sun.mail.iap.ProtocolException -> L34 com.sun.mail.iap.ConnectionException -> L36 com.sun.mail.iap.CommandFailedException -> L38
            r4.Q0(r9)     // Catch: java.lang.Throwable -> L31 com.sun.mail.iap.ProtocolException -> L34 com.sun.mail.iap.ConnectionException -> L36 com.sun.mail.iap.CommandFailedException -> L38
            goto L3e
        L31:
            r9 = move-exception
            goto Ld6
        L34:
            r9 = move-exception
            goto L9d
        L36:
            r9 = move-exception
            goto La7
        L38:
            r9 = move-exception
            goto Lb1
        L3b:
            r4.H()     // Catch: java.lang.Throwable -> L31 com.sun.mail.iap.ProtocolException -> L34 com.sun.mail.iap.ConnectionException -> L36 com.sun.mail.iap.CommandFailedException -> L38
        L3e:
            r8.w = r3     // Catch: java.lang.Throwable -> L61
        L40:
            java.util.Vector r9 = r8.k     // Catch: java.lang.Throwable -> L61
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L61
            if (r2 < r9) goto L64
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L61
            java.util.Vector r9 = r8.k     // Catch: java.lang.Throwable -> L19
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L19
            r8.r = r9     // Catch: java.lang.Throwable -> L19
            int r9 = r0.size()     // Catch: java.lang.Throwable -> L19
            javax.mail.Message[] r1 = new javax.mail.Message[r9]     // Catch: java.lang.Throwable -> L19
            r0.copyInto(r1)     // Catch: java.lang.Throwable -> L19
            if (r9 <= 0) goto L5f
            r8.notifyMessageRemovedListeners(r3, r1)     // Catch: java.lang.Throwable -> L19
        L5f:
            monitor-exit(r8)
            return r1
        L61:
            r9 = move-exception
            goto Ld9
        L64:
            java.util.Vector r9 = r8.k     // Catch: java.lang.Throwable -> L61
            java.lang.Object r9 = r9.elementAt(r2)     // Catch: java.lang.Throwable -> L61
            com.sun.mail.imap.g r9 = (com.sun.mail.imap.g) r9     // Catch: java.lang.Throwable -> L61
            boolean r4 = r9.isExpunged()     // Catch: java.lang.Throwable -> L61
            if (r4 == 0) goto L93
            r0.addElement(r9)     // Catch: java.lang.Throwable -> L61
            java.util.Vector r4 = r8.k     // Catch: java.lang.Throwable -> L61
            r4.removeElementAt(r2)     // Catch: java.lang.Throwable -> L61
            java.util.Hashtable r4 = r8.m     // Catch: java.lang.Throwable -> L61
            if (r4 == 0) goto L40
            long r4 = r9.x()     // Catch: java.lang.Throwable -> L61
            r6 = -1
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 == 0) goto L40
            java.util.Hashtable r9 = r8.m     // Catch: java.lang.Throwable -> L61
            java.lang.Long r6 = new java.lang.Long     // Catch: java.lang.Throwable -> L61
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L61
            r9.remove(r6)     // Catch: java.lang.Throwable -> L61
            goto L40
        L93:
            int r4 = r9.w()     // Catch: java.lang.Throwable -> L61
            r9.setMessageNumber(r4)     // Catch: java.lang.Throwable -> L61
            int r2 = r2 + 1
            goto L40
        L9d:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = r9.getMessage()     // Catch: java.lang.Throwable -> L31
            r0.<init>(r2, r9)     // Catch: java.lang.Throwable -> L31
            throw r0     // Catch: java.lang.Throwable -> L31
        La7:
            javax.mail.FolderClosedException r0 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> L31
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L31
            r0.<init>(r8, r9)     // Catch: java.lang.Throwable -> L31
            throw r0     // Catch: java.lang.Throwable -> L31
        Lb1:
            int r0 = r8.mode     // Catch: java.lang.Throwable -> L31
            r2 = 2
            if (r0 == r2) goto Lcc
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = "Cannot expunge READ_ONLY folder: "
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = r8.a     // Catch: java.lang.Throwable -> L31
            r0.append(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L31
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L31
            throw r9     // Catch: java.lang.Throwable -> L31
        Lcc:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = r9.getMessage()     // Catch: java.lang.Throwable -> L31
            r0.<init>(r2, r9)     // Catch: java.lang.Throwable -> L31
            throw r0     // Catch: java.lang.Throwable -> L31
        Ld6:
            r8.w = r3     // Catch: java.lang.Throwable -> L61
            throw r9     // Catch: java.lang.Throwable -> L61
        Ld9:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L61
            throw r9     // Catch: java.lang.Throwable -> L19
        Ldb:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L19
            throw r9
    }

    public synchronized void w() throws javax.mail.MessagingException {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            r1 = 1
            r2.o(r0, r1)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r2)
            return
        L8:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    public com.sun.mail.imap.a[] x() throws javax.mail.MessagingException {
            r2 = this;
            com.sun.mail.imap.e$e r0 = new com.sun.mail.imap.e$e
            r0.<init>(r2)
            java.lang.String r1 = "ACL not supported"
            java.lang.Object r0 = r2.s(r1, r0)
            com.sun.mail.imap.a[] r0 = (com.sun.mail.imap.a[]) r0
            return r0
    }

    public java.lang.String[] y() throws javax.mail.MessagingException {
            r1 = this;
            java.lang.String[] r0 = r1.i
            if (r0 != 0) goto L7
            r1.exists()
        L7:
            java.lang.String[] r0 = r1.i
            java.lang.Object r0 = r0.clone()
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    com.sun.mail.imap.g z(int r4) {
            r3 = this;
            int r0 = r4 + (-1)
        L2:
            int r1 = r3.r
            if (r0 < r1) goto L8
            r4 = 0
            return r4
        L8:
            java.util.Vector r1 = r3.k
            java.lang.Object r1 = r1.elementAt(r0)
            com.sun.mail.imap.g r1 = (com.sun.mail.imap.g) r1
            int r2 = r1.w()
            if (r2 != r4) goto L17
            return r1
        L17:
            int r0 = r0 + 1
            goto L2
    }
}
