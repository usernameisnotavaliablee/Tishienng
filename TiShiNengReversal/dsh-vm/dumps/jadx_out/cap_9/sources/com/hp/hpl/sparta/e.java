package com.hp.hpl.sparta;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class e extends com.hp.hpl.sparta.i {
    private static final boolean l = false;
    private static final java.lang.Integer m = null;
    static final java.util.Enumeration n = null;
    private com.hp.hpl.sparta.g g;
    private java.lang.String h;
    private com.hp.hpl.sparta.q.c i;
    private java.util.Vector j;
    private final java.util.Hashtable k;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements com.hp.hpl.sparta.e.b {
        private transient com.hp.hpl.sparta.q.c a;
        private final com.hp.hpl.sparta.xpath.c0 b;
        private final java.lang.String c;
        final /* synthetic */ com.hp.hpl.sparta.e d;

        a(com.hp.hpl.sparta.e r2, com.hp.hpl.sparta.xpath.c0 r3) throws com.hp.hpl.sparta.xpath.XPathException {
                r1 = this;
                r1.d = r2
                r1.<init>()
                r0 = 0
                r1.a = r0
                java.lang.String r0 = r3.d()
                r1.c = r0
                r1.b = r3
                r2.x(r1)
                return
        }

        private void b() throws com.hp.hpl.sparta.ParseException {
                r5 = this;
                com.hp.hpl.sparta.q$c r0 = com.hp.hpl.sparta.q.b()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L3b
                r5.a = r0     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L3b
                com.hp.hpl.sparta.e r0 = r5.d     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L3b
                com.hp.hpl.sparta.xpath.c0 r1 = r5.b     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L3b
                r2 = 0
                com.hp.hpl.sparta.s r0 = r0.E(r1, r2)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L3b
                java.util.Enumeration r0 = r0.w()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L3b
            L13:
                boolean r1 = r0.hasMoreElements()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L3b
                if (r1 == 0) goto L41
                java.lang.Object r1 = r0.nextElement()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L3b
                com.hp.hpl.sparta.g r1 = (com.hp.hpl.sparta.g) r1     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L3b
                java.lang.String r2 = r5.c     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L3b
                java.lang.String r2 = r1.D(r2)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L3b
                com.hp.hpl.sparta.q$c r3 = r5.a     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L3b
                java.lang.Object r3 = r3.get(r2)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L3b
                java.util.Vector r3 = (java.util.Vector) r3     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L3b
                if (r3 != 0) goto L3d
                java.util.Vector r3 = new java.util.Vector     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L3b
                r4 = 1
                r3.<init>(r4)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L3b
                com.hp.hpl.sparta.q$c r4 = r5.a     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L3b
                r4.put(r2, r3)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L3b
                goto L3d
            L3b:
                r0 = move-exception
                goto L42
            L3d:
                r3.addElement(r1)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L3b
                goto L13
            L41:
                return
            L42:
                com.hp.hpl.sparta.ParseException r1 = new com.hp.hpl.sparta.ParseException
                java.lang.String r2 = "XPath problem"
                r1.<init>(r2, r0)
                throw r1
        }

        public synchronized java.util.Enumeration a(java.lang.String r2) throws com.hp.hpl.sparta.ParseException {
                r1 = this;
                monitor-enter(r1)
                com.hp.hpl.sparta.q$c r0 = r1.a     // Catch: java.lang.Throwable -> L9
                if (r0 != 0) goto Lb
                r1.b()     // Catch: java.lang.Throwable -> L9
                goto Lb
            L9:
                r2 = move-exception
                goto L1e
            Lb:
                com.hp.hpl.sparta.q$c r0 = r1.a     // Catch: java.lang.Throwable -> L9
                java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L9
                java.util.Vector r2 = (java.util.Vector) r2     // Catch: java.lang.Throwable -> L9
                if (r2 != 0) goto L18
                java.util.Enumeration r2 = com.hp.hpl.sparta.e.n     // Catch: java.lang.Throwable -> L9
                goto L1c
            L18:
                java.util.Enumeration r2 = r2.elements()     // Catch: java.lang.Throwable -> L9
            L1c:
                monitor-exit(r1)
                return r2
            L1e:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
                throw r2
        }

        public synchronized int c() throws com.hp.hpl.sparta.ParseException {
                r1 = this;
                monitor-enter(r1)
                com.hp.hpl.sparta.q$c r0 = r1.a     // Catch: java.lang.Throwable -> L9
                if (r0 != 0) goto Lb
                r1.b()     // Catch: java.lang.Throwable -> L9
                goto Lb
            L9:
                r0 = move-exception
                goto L13
            Lb:
                com.hp.hpl.sparta.q$c r0 = r1.a     // Catch: java.lang.Throwable -> L9
                int r0 = r0.size()     // Catch: java.lang.Throwable -> L9
                monitor-exit(r1)
                return r0
            L13:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
                throw r0
        }

        @Override // com.hp.hpl.sparta.e.b
        public synchronized void update(com.hp.hpl.sparta.e r1) {
                r0 = this;
                monitor-enter(r0)
                r1 = 0
                r0.a = r1     // Catch: java.lang.Throwable -> L6
                monitor-exit(r0)
                return
            L6:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L6
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void update(com.hp.hpl.sparta.e r1);
    }

    static {
            java.lang.Integer r0 = new java.lang.Integer
            r1 = 1
            r0.<init>(r1)
            com.hp.hpl.sparta.e.m = r0
            com.hp.hpl.sparta.h r0 = new com.hp.hpl.sparta.h
            r0.<init>()
            com.hp.hpl.sparta.e.n = r0
            return
    }

    public e() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.g = r0
            com.hp.hpl.sparta.q$c r1 = com.hp.hpl.sparta.q.b()
            r2.i = r1
            java.util.Vector r1 = new java.util.Vector
            r1.<init>()
            r2.j = r1
            r2.k = r0
            java.lang.String r0 = "MEMORY"
            r2.h = r0
            return
    }

    e(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.g = r0
            com.hp.hpl.sparta.q$c r1 = com.hp.hpl.sparta.q.b()
            r2.i = r1
            java.util.Vector r1 = new java.util.Vector
            r1.<init>()
            r2.j = r1
            r2.k = r0
            r2.h = r3
            return
    }

    private com.hp.hpl.sparta.s F(java.lang.String r3, boolean r4) throws com.hp.hpl.sparta.xpath.XPathException {
            r2 = this;
            r0 = 0
            char r0 = r3.charAt(r0)
            r1 = 47
            if (r0 == r1) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "/"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L1a:
            com.hp.hpl.sparta.xpath.c0 r3 = com.hp.hpl.sparta.xpath.c0.b(r3)
            com.hp.hpl.sparta.s r3 = r2.E(r3, r4)
            return r3
    }

    public java.lang.String A() {
            r1 = this;
            java.lang.String r0 = r1.h
            return r0
    }

    void B(com.hp.hpl.sparta.xpath.c0 r1) throws com.hp.hpl.sparta.xpath.XPathException {
            r0 = this;
            return
    }

    public void C(com.hp.hpl.sparta.g r1) {
            r0 = this;
            r0.g = r1
            r1.n(r0)
            r0.j()
            return
    }

    public void D(java.lang.String r1) {
            r0 = this;
            r0.h = r1
            r0.j()
            return
    }

    com.hp.hpl.sparta.s E(com.hp.hpl.sparta.xpath.c0 r4, boolean r5) throws com.hp.hpl.sparta.xpath.XPathException {
            r3 = this;
            boolean r0 = r4.h()
            if (r0 == r5) goto L2c
            if (r5 == 0) goto Lb
            java.lang.String r5 = "evaluates to element not string"
            goto Ld
        Lb:
            java.lang.String r5 = "evaluates to string not element"
        Ld:
            com.hp.hpl.sparta.xpath.XPathException r0 = new com.hp.hpl.sparta.xpath.XPathException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "\""
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = "\" evaluates to "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r4, r5)
            throw r0
        L2c:
            com.hp.hpl.sparta.s r5 = new com.hp.hpl.sparta.s
            r5.<init>(r3, r4)
            return r5
    }

    public boolean G(java.lang.String r9) throws com.hp.hpl.sparta.ParseException {
            r8 = this;
            com.hp.hpl.sparta.g r0 = r8.s(r9)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            com.hp.hpl.sparta.xpath.c0 r0 = com.hp.hpl.sparta.xpath.c0.b(r9)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            java.util.Enumeration r2 = r0.f()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            r3 = 0
        L11:
            boolean r4 = r2.hasMoreElements()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            if (r4 == 0) goto L20
            r2.nextElement()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            int r3 = r3 + 1
            goto L11
        L1d:
            r0 = move-exception
            goto L9f
        L20:
            java.util.Enumeration r0 = r0.f()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            java.lang.Object r2 = r0.nextElement()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            com.hp.hpl.sparta.xpath.t r2 = (com.hp.hpl.sparta.xpath.t) r2     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            r4 = 1
            int r3 = r3 - r4
            com.hp.hpl.sparta.xpath.t[] r5 = new com.hp.hpl.sparta.xpath.t[r3]     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            r6 = 0
        L2f:
            if (r6 >= r3) goto L3c
            java.lang.Object r7 = r0.nextElement()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            com.hp.hpl.sparta.xpath.t r7 = (com.hp.hpl.sparta.xpath.t) r7     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            r5[r6] = r7     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            int r6 = r6 + 1
            goto L2f
        L3c:
            com.hp.hpl.sparta.g r0 = r8.g     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            if (r0 != 0) goto L49
            r0 = 0
            com.hp.hpl.sparta.g r0 = r8.i(r0, r2, r9)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            r8.C(r0)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            goto L60
        L49:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            r0.<init>()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            java.lang.String r6 = "/"
            r0.append(r6)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            r0.append(r2)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            java.lang.String r0 = r0.toString()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            com.hp.hpl.sparta.g r0 = r8.s(r0)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            if (r0 == 0) goto L72
        L60:
            if (r3 != 0) goto L63
            return r4
        L63:
            com.hp.hpl.sparta.g r0 = r8.g     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            com.hp.hpl.sparta.xpath.c0 r1 = com.hp.hpl.sparta.xpath.c0.c(r1, r5)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            java.lang.String r1 = r1.toString()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            boolean r9 = r0.R(r1)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            return r9
        L72:
            com.hp.hpl.sparta.ParseException r0 = new com.hp.hpl.sparta.ParseException     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            r1.<init>()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            java.lang.String r3 = "Existing root element <"
            r1.append(r3)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            com.hp.hpl.sparta.g r3 = r8.g     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            java.lang.String r3 = r3.H()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            r1.append(r3)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            java.lang.String r3 = "...> does not match first step \""
            r1.append(r3)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            r1.append(r2)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            java.lang.String r2 = "\" of \""
            r1.append(r2)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            r1.append(r9)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            java.lang.String r1 = r1.toString()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            r0.<init>(r1)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            throw r0     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
        L9f:
            com.hp.hpl.sparta.ParseException r1 = new com.hp.hpl.sparta.ParseException
            r1.<init>(r9, r0)
            throw r1
    }

    public com.hp.hpl.sparta.e.a H(java.lang.String r3) throws com.hp.hpl.sparta.ParseException {
            r2 = this;
            com.hp.hpl.sparta.q$c r0 = r2.i     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L19
            java.lang.Object r0 = r0.get(r3)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L19
            com.hp.hpl.sparta.e$a r0 = (com.hp.hpl.sparta.e.a) r0     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L19
            if (r0 != 0) goto L1b
            com.hp.hpl.sparta.xpath.c0 r0 = com.hp.hpl.sparta.xpath.c0.b(r3)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L19
            com.hp.hpl.sparta.e$a r1 = new com.hp.hpl.sparta.e$a     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L19
            r1.<init>(r2, r0)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L19
            com.hp.hpl.sparta.q$c r0 = r2.i     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L19
            r0.put(r3, r1)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L19
            return r1
        L19:
            r3 = move-exception
            goto L1c
        L1b:
            return r0
        L1c:
            com.hp.hpl.sparta.ParseException r0 = new com.hp.hpl.sparta.ParseException
            java.lang.String r1 = "XPath problem"
            r0.<init>(r1, r3)
            throw r0
    }

    public boolean I(java.lang.String r2) {
            r1 = this;
            com.hp.hpl.sparta.q$c r0 = r1.i
            java.lang.Object r2 = r0.get(r2)
            if (r2 == 0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    @Override // com.hp.hpl.sparta.i
    protected int a() {
            r1 = this;
            com.hp.hpl.sparta.g r0 = r1.g
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.hp.hpl.sparta.i
    public java.lang.Object clone() {
            r2 = this;
            com.hp.hpl.sparta.e r0 = new com.hp.hpl.sparta.e
            java.lang.String r1 = r2.h
            r0.<init>(r1)
            com.hp.hpl.sparta.g r1 = r2.g
            java.lang.Object r1 = r1.clone()
            com.hp.hpl.sparta.g r1 = (com.hp.hpl.sparta.g) r1
            r0.g = r1
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.hp.hpl.sparta.e
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            com.hp.hpl.sparta.e r2 = (com.hp.hpl.sparta.e) r2
            com.hp.hpl.sparta.g r0 = r1.g
            com.hp.hpl.sparta.g r2 = r2.g
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // com.hp.hpl.sparta.i
    void j() {
            r2 = this;
            java.util.Vector r0 = r2.j
            java.util.Enumeration r0 = r0.elements()
        L6:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.nextElement()
            com.hp.hpl.sparta.e$b r1 = (com.hp.hpl.sparta.e.b) r1
            r1.update(r2)
            goto L6
        L16:
            return
    }

    @Override // com.hp.hpl.sparta.i
    public void p(java.io.Writer r2) throws java.io.IOException {
            r1 = this;
            com.hp.hpl.sparta.g r0 = r1.g
            r0.p(r2)
            return
    }

    @Override // com.hp.hpl.sparta.i
    public void r(java.io.Writer r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "<?xml version=\"1.0\" ?>\n"
            r2.write(r0)
            com.hp.hpl.sparta.g r0 = r1.g
            r0.r(r2)
            return
    }

    @Override // com.hp.hpl.sparta.i
    public com.hp.hpl.sparta.g s(java.lang.String r4) throws com.hp.hpl.sparta.ParseException {
            r3 = this;
            r0 = 0
            char r1 = r4.charAt(r0)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1b
            r2 = 47
            if (r1 == r2) goto L1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1b
            r1.<init>()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1b
            java.lang.String r2 = "/"
            r1.append(r2)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1b
            r1.append(r4)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1b
            java.lang.String r4 = r1.toString()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1b
            goto L1d
        L1b:
            r4 = move-exception
            goto L2d
        L1d:
            com.hp.hpl.sparta.xpath.c0 r4 = com.hp.hpl.sparta.xpath.c0.b(r4)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1b
            r3.B(r4)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1b
            com.hp.hpl.sparta.s r4 = r3.E(r4, r0)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1b
            com.hp.hpl.sparta.g r4 = r4.u()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1b
            return r4
        L2d:
            com.hp.hpl.sparta.ParseException r0 = new com.hp.hpl.sparta.ParseException
            java.lang.String r1 = "XPath problem"
            r0.<init>(r1, r4)
            throw r0
    }

    @Override // com.hp.hpl.sparta.i
    public java.util.Enumeration t(java.lang.String r4) throws com.hp.hpl.sparta.ParseException {
            r3 = this;
            r0 = 0
            char r1 = r4.charAt(r0)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1b
            r2 = 47
            if (r1 == r2) goto L1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1b
            r1.<init>()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1b
            java.lang.String r2 = "/"
            r1.append(r2)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1b
            r1.append(r4)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1b
            java.lang.String r4 = r1.toString()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1b
            goto L1d
        L1b:
            r4 = move-exception
            goto L2d
        L1d:
            com.hp.hpl.sparta.xpath.c0 r4 = com.hp.hpl.sparta.xpath.c0.b(r4)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1b
            r3.B(r4)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1b
            com.hp.hpl.sparta.s r4 = r3.E(r4, r0)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1b
            java.util.Enumeration r4 = r4.w()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1b
            return r4
        L2d:
            com.hp.hpl.sparta.ParseException r0 = new com.hp.hpl.sparta.ParseException
            java.lang.String r1 = "XPath problem"
            r0.<init>(r1, r4)
            throw r0
    }

    @Override // com.hp.hpl.sparta.i
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.h
            return r0
    }

    @Override // com.hp.hpl.sparta.i
    public java.lang.String u(java.lang.String r3) throws com.hp.hpl.sparta.ParseException {
            r2 = this;
            r0 = 1
            com.hp.hpl.sparta.s r3 = r2.F(r3, r0)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> La
            java.lang.String r3 = r3.v()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> La
            return r3
        La:
            r3 = move-exception
            com.hp.hpl.sparta.ParseException r0 = new com.hp.hpl.sparta.ParseException
            java.lang.String r1 = "XPath problem"
            r0.<init>(r1, r3)
            throw r0
    }

    @Override // com.hp.hpl.sparta.i
    public java.util.Enumeration v(java.lang.String r3) throws com.hp.hpl.sparta.ParseException {
            r2 = this;
            r0 = 1
            com.hp.hpl.sparta.s r3 = r2.F(r3, r0)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> La
            java.util.Enumeration r3 = r3.w()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> La
            return r3
        La:
            r3 = move-exception
            com.hp.hpl.sparta.ParseException r0 = new com.hp.hpl.sparta.ParseException
            java.lang.String r1 = "XPath problem"
            r0.<init>(r1, r3)
            throw r0
    }

    public void x(com.hp.hpl.sparta.e.b r2) {
            r1 = this;
            java.util.Vector r0 = r1.j
            r0.addElement(r2)
            return
    }

    public void y(com.hp.hpl.sparta.e.b r2) {
            r1 = this;
            java.util.Vector r0 = r1.j
            r0.removeElement(r2)
            return
    }

    public com.hp.hpl.sparta.g z() {
            r1 = this;
            com.hp.hpl.sparta.g r0 = r1.g
            return r0
    }
}
