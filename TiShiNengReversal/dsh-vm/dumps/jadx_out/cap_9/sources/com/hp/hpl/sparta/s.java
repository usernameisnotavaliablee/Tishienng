package com.hp.hpl.sparta;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class s implements com.hp.hpl.sparta.xpath.b0 {
    private static final java.lang.Boolean i = null;
    private static final java.lang.Boolean j = null;
    private final com.hp.hpl.sparta.j a;
    private java.util.Vector b;
    private java.util.Enumeration c;
    private java.lang.Object d;
    private final com.hp.hpl.sparta.s.b e;
    private com.hp.hpl.sparta.i f;
    private boolean g;
    private com.hp.hpl.sparta.xpath.c0 h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b {
        private com.hp.hpl.sparta.s.b.a a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static class a {
            final java.lang.Boolean a;
            final com.hp.hpl.sparta.s.b.a b;

            a(java.lang.Boolean r1, com.hp.hpl.sparta.s.b.a r2) {
                    r0 = this;
                    r0.<init>()
                    r0.a = r1
                    r0.b = r2
                    return
            }
        }

        private b() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.a = r0
                return
        }

        /* synthetic */ b(com.hp.hpl.sparta.s.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        java.lang.Boolean a() {
                r2 = this;
                com.hp.hpl.sparta.s$b$a r0 = r2.a
                java.lang.Boolean r1 = r0.a
                com.hp.hpl.sparta.s$b$a r0 = r0.b
                r2.a = r0
                return r1
        }

        void b(java.lang.Boolean r3) {
                r2 = this;
                com.hp.hpl.sparta.s$b$a r0 = new com.hp.hpl.sparta.s$b$a
                com.hp.hpl.sparta.s$b$a r1 = r2.a
                r0.<init>(r3, r1)
                r2.a = r0
                return
        }
    }

    static {
            java.lang.Boolean r0 = new java.lang.Boolean
            r1 = 1
            r0.<init>(r1)
            com.hp.hpl.sparta.s.i = r0
            java.lang.Boolean r0 = new java.lang.Boolean
            r1 = 0
            r0.<init>(r1)
            com.hp.hpl.sparta.s.j = r0
            return
    }

    public s(com.hp.hpl.sparta.e r1, com.hp.hpl.sparta.xpath.c0 r2) throws com.hp.hpl.sparta.xpath.XPathException {
            r0 = this;
            r0.<init>(r2, r1)
            return
    }

    public s(com.hp.hpl.sparta.g r2, com.hp.hpl.sparta.xpath.c0 r3) throws com.hp.hpl.sparta.xpath.XPathException {
            r1 = this;
            r1.<init>(r3, r2)
            boolean r2 = r3.g()
            if (r2 != 0) goto La
            return
        La:
            com.hp.hpl.sparta.xpath.XPathException r2 = new com.hp.hpl.sparta.xpath.XPathException
            java.lang.String r0 = "Cannot use element as context node for absolute xpath"
            r2.<init>(r3, r0)
            throw r2
    }

    private s(com.hp.hpl.sparta.xpath.c0 r4, com.hp.hpl.sparta.i r5) throws com.hp.hpl.sparta.xpath.XPathException {
            r3 = this;
            r3.<init>()
            com.hp.hpl.sparta.j r0 = new com.hp.hpl.sparta.j
            r0.<init>()
            r3.a = r0
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r3.b = r0
            r0 = 0
            r3.c = r0
            r3.d = r0
            com.hp.hpl.sparta.s$b r1 = new com.hp.hpl.sparta.s$b
            r1.<init>(r0)
            r3.e = r1
            r3.h = r4
            r3.f = r5
            java.util.Vector r5 = new java.util.Vector
            r1 = 1
            r5.<init>(r1)
            r3.b = r5
            com.hp.hpl.sparta.i r1 = r3.f
            r5.addElement(r1)
            java.util.Enumeration r4 = r4.f()
        L32:
            boolean r5 = r4.hasMoreElements()
            if (r5 == 0) goto L85
            java.lang.Object r5 = r4.nextElement()
            com.hp.hpl.sparta.xpath.t r5 = (com.hp.hpl.sparta.xpath.t) r5
            boolean r1 = r5.c()
            r3.g = r1
            r3.c = r0
            com.hp.hpl.sparta.xpath.o r1 = r5.a()
            r1.a(r3)
            com.hp.hpl.sparta.j r1 = r3.a
            java.util.Enumeration r1 = r1.d()
            r3.c = r1
            java.util.Vector r1 = r3.b
            r1.removeAllElements()
            com.hp.hpl.sparta.xpath.k r5 = r5.b()
        L5e:
            java.util.Enumeration r1 = r3.c
            boolean r1 = r1.hasMoreElements()
            if (r1 == 0) goto L32
            java.util.Enumeration r1 = r3.c
            java.lang.Object r1 = r1.nextElement()
            r3.d = r1
            r5.a(r3)
            com.hp.hpl.sparta.s$b r1 = r3.e
            java.lang.Boolean r1 = r1.a()
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L5e
            java.util.Vector r1 = r3.b
            java.lang.Object r2 = r3.d
            r1.addElement(r2)
            goto L5e
        L85:
            return
    }

    private void q(com.hp.hpl.sparta.e r3) {
            r2 = this;
            com.hp.hpl.sparta.g r3 = r3.z()
            com.hp.hpl.sparta.j r0 = r2.a
            r1 = 1
            r0.a(r3, r1)
            boolean r0 = r2.g
            if (r0 == 0) goto L11
            r2.r(r3)
        L11:
            return
    }

    private void r(com.hp.hpl.sparta.g r3) {
            r2 = this;
            com.hp.hpl.sparta.i r3 = r3.F()
            r0 = 0
        L5:
            if (r3 == 0) goto L21
            boolean r1 = r3 instanceof com.hp.hpl.sparta.g
            if (r1 == 0) goto L1c
            com.hp.hpl.sparta.j r1 = r2.a
            int r0 = r0 + 1
            r1.a(r3, r0)
            boolean r1 = r2.g
            if (r1 == 0) goto L1c
            r1 = r3
            com.hp.hpl.sparta.g r1 = (com.hp.hpl.sparta.g) r1
            r2.r(r1)
        L1c:
            com.hp.hpl.sparta.i r3 = r3.c()
            goto L5
        L21:
            return
    }

    private void s(com.hp.hpl.sparta.e r3, java.lang.String r4) {
            r2 = this;
            com.hp.hpl.sparta.g r3 = r3.z()
            if (r3 != 0) goto L7
            goto L1a
        L7:
            java.lang.String r0 = r3.H()
            if (r0 != r4) goto L13
            com.hp.hpl.sparta.j r0 = r2.a
            r1 = 1
            r0.a(r3, r1)
        L13:
            boolean r0 = r2.g
            if (r0 == 0) goto L1a
            r2.t(r3, r4)
        L1a:
            return
    }

    private void t(com.hp.hpl.sparta.g r4, java.lang.String r5) {
            r3 = this;
            com.hp.hpl.sparta.i r4 = r4.F()
            r0 = 0
        L5:
            if (r4 == 0) goto L27
            boolean r1 = r4 instanceof com.hp.hpl.sparta.g
            if (r1 == 0) goto L22
            r1 = r4
            com.hp.hpl.sparta.g r1 = (com.hp.hpl.sparta.g) r1
            java.lang.String r2 = r1.H()
            if (r2 != r5) goto L1b
            com.hp.hpl.sparta.j r2 = r3.a
            int r0 = r0 + 1
            r2.a(r1, r0)
        L1b:
            boolean r2 = r3.g
            if (r2 == 0) goto L22
            r3.t(r1, r5)
        L22:
            com.hp.hpl.sparta.i r4 = r4.c()
            goto L5
        L27:
            return
    }

    @Override // com.hp.hpl.sparta.xpath.p
    public void a(com.hp.hpl.sparta.xpath.j r4) {
            r3 = this;
            java.util.Vector r0 = r3.b
            com.hp.hpl.sparta.j r1 = r3.a
            r1.f()
            java.util.Enumeration r0 = r0.elements()
        Lb:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.nextElement()
            com.hp.hpl.sparta.i r1 = (com.hp.hpl.sparta.i) r1
            boolean r2 = r1 instanceof com.hp.hpl.sparta.g
            if (r2 == 0) goto Lb
            com.hp.hpl.sparta.g r1 = (com.hp.hpl.sparta.g) r1
            java.lang.String r2 = r4.c()
            java.lang.String r1 = r1.D(r2)
            if (r1 == 0) goto Lb
            com.hp.hpl.sparta.j r2 = r3.a
            r2.b(r1)
            goto Lb
        L2d:
            return
    }

    @Override // com.hp.hpl.sparta.xpath.l
    public void b(com.hp.hpl.sparta.xpath.x r4) throws com.hp.hpl.sparta.xpath.XPathException {
            r3 = this;
            java.lang.Object r0 = r3.d
            boolean r1 = r0 instanceof com.hp.hpl.sparta.g
            if (r1 == 0) goto L38
            com.hp.hpl.sparta.g r0 = (com.hp.hpl.sparta.g) r0
            com.hp.hpl.sparta.i r0 = r0.F()
        Lc:
            if (r0 == 0) goto L30
            boolean r1 = r0 instanceof com.hp.hpl.sparta.r
            if (r1 == 0) goto L2b
            r1 = r0
            com.hp.hpl.sparta.r r1 = (com.hp.hpl.sparta.r) r1
            java.lang.String r1 = r1.A()
            java.lang.String r2 = r4.b()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L2b
            com.hp.hpl.sparta.s$b r4 = r3.e
            java.lang.Boolean r0 = com.hp.hpl.sparta.s.i
            r4.b(r0)
            return
        L2b:
            com.hp.hpl.sparta.i r0 = r0.c()
            goto Lc
        L30:
            com.hp.hpl.sparta.s$b r4 = r3.e
            java.lang.Boolean r0 = com.hp.hpl.sparta.s.j
            r4.b(r0)
            return
        L38:
            com.hp.hpl.sparta.xpath.XPathException r4 = new com.hp.hpl.sparta.xpath.XPathException
            com.hp.hpl.sparta.xpath.c0 r0 = r3.h
            java.lang.String r1 = "Cannot test attribute of document"
            r4.<init>(r0, r1)
            throw r4
    }

    @Override // com.hp.hpl.sparta.xpath.l
    public void c(com.hp.hpl.sparta.xpath.h r3) throws com.hp.hpl.sparta.xpath.XPathException {
            r2 = this;
            java.lang.Object r0 = r2.d
            boolean r1 = r0 instanceof com.hp.hpl.sparta.g
            if (r1 == 0) goto L25
            com.hp.hpl.sparta.g r0 = (com.hp.hpl.sparta.g) r0
            java.lang.String r1 = r3.b()
            java.lang.String r0 = r0.D(r1)
            java.lang.String r3 = r3.c()
            boolean r3 = r3.equals(r0)
            com.hp.hpl.sparta.s$b r0 = r2.e
            if (r3 != 0) goto L1f
            java.lang.Boolean r3 = com.hp.hpl.sparta.s.i
            goto L21
        L1f:
            java.lang.Boolean r3 = com.hp.hpl.sparta.s.j
        L21:
            r0.b(r3)
            return
        L25:
            com.hp.hpl.sparta.xpath.XPathException r3 = new com.hp.hpl.sparta.xpath.XPathException
            com.hp.hpl.sparta.xpath.c0 r0 = r2.h
            java.lang.String r1 = "Cannot test attribute of document"
            r3.<init>(r0, r1)
            throw r3
    }

    @Override // com.hp.hpl.sparta.xpath.p
    public void d(com.hp.hpl.sparta.xpath.a r3) {
            r2 = this;
            java.util.Vector r3 = r2.b
            com.hp.hpl.sparta.j r0 = r2.a
            r0.f()
            java.util.Enumeration r3 = r3.elements()
        Lb:
            boolean r0 = r3.hasMoreElements()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r3.nextElement()
            boolean r1 = r0 instanceof com.hp.hpl.sparta.g
            if (r1 == 0) goto L1f
            com.hp.hpl.sparta.g r0 = (com.hp.hpl.sparta.g) r0
            r2.r(r0)
            goto Lb
        L1f:
            boolean r1 = r0 instanceof com.hp.hpl.sparta.e
            if (r1 == 0) goto Lb
            com.hp.hpl.sparta.e r0 = (com.hp.hpl.sparta.e) r0
            r2.q(r0)
            goto Lb
        L29:
            return
    }

    @Override // com.hp.hpl.sparta.xpath.p
    public void e(com.hp.hpl.sparta.xpath.y r4) {
            r3 = this;
            java.util.Vector r4 = r3.b
            com.hp.hpl.sparta.j r0 = r3.a
            r0.f()
            java.util.Enumeration r4 = r4.elements()
        Lb:
            boolean r0 = r4.hasMoreElements()
            if (r0 == 0) goto L36
            java.lang.Object r0 = r4.nextElement()
            boolean r1 = r0 instanceof com.hp.hpl.sparta.g
            if (r1 == 0) goto Lb
            com.hp.hpl.sparta.g r0 = (com.hp.hpl.sparta.g) r0
            com.hp.hpl.sparta.i r0 = r0.F()
        L1f:
            if (r0 == 0) goto Lb
            boolean r1 = r0 instanceof com.hp.hpl.sparta.r
            if (r1 == 0) goto L31
            com.hp.hpl.sparta.j r1 = r3.a
            r2 = r0
            com.hp.hpl.sparta.r r2 = (com.hp.hpl.sparta.r) r2
            java.lang.String r2 = r2.A()
            r1.b(r2)
        L31:
            com.hp.hpl.sparta.i r0 = r0.c()
            goto L1f
        L36:
            return
    }

    @Override // com.hp.hpl.sparta.xpath.p
    public void f(com.hp.hpl.sparta.xpath.q r3) throws com.hp.hpl.sparta.xpath.XPathException {
            r2 = this;
            com.hp.hpl.sparta.j r3 = r2.a
            r3.f()
            com.hp.hpl.sparta.i r3 = r2.f
            com.hp.hpl.sparta.g r3 = r3.e()
            if (r3 == 0) goto L14
            com.hp.hpl.sparta.j r0 = r2.a
            r1 = 1
            r0.a(r3, r1)
            return
        L14:
            com.hp.hpl.sparta.xpath.XPathException r3 = new com.hp.hpl.sparta.xpath.XPathException
            com.hp.hpl.sparta.xpath.c0 r0 = r2.h
            java.lang.String r1 = "Illegal attempt to apply \"..\" to node with no parent."
            r3.<init>(r0, r1)
            throw r3
    }

    @Override // com.hp.hpl.sparta.xpath.l
    public void g(com.hp.hpl.sparta.xpath.v r4) throws com.hp.hpl.sparta.xpath.XPathException {
            r3 = this;
            java.lang.Object r0 = r3.d
            boolean r1 = r0 instanceof com.hp.hpl.sparta.g
            if (r1 == 0) goto L38
            com.hp.hpl.sparta.g r0 = (com.hp.hpl.sparta.g) r0
            com.hp.hpl.sparta.i r0 = r0.F()
        Lc:
            if (r0 == 0) goto L30
            boolean r1 = r0 instanceof com.hp.hpl.sparta.r
            if (r1 == 0) goto L2b
            r1 = r0
            com.hp.hpl.sparta.r r1 = (com.hp.hpl.sparta.r) r1
            java.lang.String r1 = r1.A()
            java.lang.String r2 = r4.b()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L2b
            com.hp.hpl.sparta.s$b r4 = r3.e
            java.lang.Boolean r0 = com.hp.hpl.sparta.s.i
            r4.b(r0)
            return
        L2b:
            com.hp.hpl.sparta.i r0 = r0.c()
            goto Lc
        L30:
            com.hp.hpl.sparta.s$b r4 = r3.e
            java.lang.Boolean r0 = com.hp.hpl.sparta.s.j
            r4.b(r0)
            return
        L38:
            com.hp.hpl.sparta.xpath.XPathException r4 = new com.hp.hpl.sparta.xpath.XPathException
            com.hp.hpl.sparta.xpath.c0 r0 = r3.h
            java.lang.String r1 = "Cannot test attribute of document"
            r4.<init>(r0, r1)
            throw r4
    }

    @Override // com.hp.hpl.sparta.xpath.l
    public void h(com.hp.hpl.sparta.xpath.a0 r2) {
            r1 = this;
            com.hp.hpl.sparta.s$b r2 = r1.e
            java.lang.Boolean r0 = com.hp.hpl.sparta.s.i
            r2.b(r0)
            return
    }

    @Override // com.hp.hpl.sparta.xpath.p
    public void i(com.hp.hpl.sparta.xpath.z r3) {
            r2 = this;
            com.hp.hpl.sparta.j r3 = r2.a
            r3.f()
            com.hp.hpl.sparta.j r3 = r2.a
            com.hp.hpl.sparta.i r0 = r2.f
            r1 = 1
            r3.a(r0, r1)
            return
    }

    @Override // com.hp.hpl.sparta.xpath.l
    public void j(com.hp.hpl.sparta.xpath.r r3) throws com.hp.hpl.sparta.xpath.XPathException {
            r2 = this;
            java.lang.Object r0 = r2.d
            boolean r1 = r0 instanceof com.hp.hpl.sparta.g
            if (r1 == 0) goto L24
            com.hp.hpl.sparta.g r0 = (com.hp.hpl.sparta.g) r0
            com.hp.hpl.sparta.j r1 = r2.a
            int r0 = r1.e(r0)
            int r3 = r3.b()
            if (r0 != r3) goto L16
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            com.hp.hpl.sparta.s$b r0 = r2.e
            if (r3 == 0) goto L1e
            java.lang.Boolean r3 = com.hp.hpl.sparta.s.i
            goto L20
        L1e:
            java.lang.Boolean r3 = com.hp.hpl.sparta.s.j
        L20:
            r0.b(r3)
            return
        L24:
            com.hp.hpl.sparta.xpath.XPathException r3 = new com.hp.hpl.sparta.xpath.XPathException
            com.hp.hpl.sparta.xpath.c0 r0 = r2.h
            java.lang.String r1 = "Cannot test position of document"
            r3.<init>(r0, r1)
            throw r3
    }

    @Override // com.hp.hpl.sparta.xpath.l
    public void k(com.hp.hpl.sparta.xpath.w r3) throws com.hp.hpl.sparta.xpath.XPathException {
            r2 = this;
            java.lang.Object r3 = r2.d
            boolean r0 = r3 instanceof com.hp.hpl.sparta.g
            if (r0 == 0) goto L27
            com.hp.hpl.sparta.g r3 = (com.hp.hpl.sparta.g) r3
            com.hp.hpl.sparta.i r3 = r3.F()
        Lc:
            if (r3 == 0) goto L1f
            boolean r0 = r3 instanceof com.hp.hpl.sparta.r
            if (r0 == 0) goto L1a
            com.hp.hpl.sparta.s$b r3 = r2.e
            java.lang.Boolean r0 = com.hp.hpl.sparta.s.i
            r3.b(r0)
            return
        L1a:
            com.hp.hpl.sparta.i r3 = r3.c()
            goto Lc
        L1f:
            com.hp.hpl.sparta.s$b r3 = r2.e
            java.lang.Boolean r0 = com.hp.hpl.sparta.s.j
            r3.b(r0)
            return
        L27:
            com.hp.hpl.sparta.xpath.XPathException r3 = new com.hp.hpl.sparta.xpath.XPathException
            com.hp.hpl.sparta.xpath.c0 r0 = r2.h
            java.lang.String r1 = "Cannot test attribute of document"
            r3.<init>(r0, r1)
            throw r3
    }

    @Override // com.hp.hpl.sparta.xpath.p
    public void l(com.hp.hpl.sparta.xpath.m r6) {
            r5 = this;
            java.lang.String r6 = r6.c()
            java.util.Vector r0 = r5.b
            int r1 = r0.size()
            com.hp.hpl.sparta.j r2 = r5.a
            r2.f()
            r2 = 0
        L10:
            if (r2 >= r1) goto L2c
            java.lang.Object r3 = r0.elementAt(r2)
            boolean r4 = r3 instanceof com.hp.hpl.sparta.g
            if (r4 == 0) goto L20
            com.hp.hpl.sparta.g r3 = (com.hp.hpl.sparta.g) r3
            r5.t(r3, r6)
            goto L29
        L20:
            boolean r4 = r3 instanceof com.hp.hpl.sparta.e
            if (r4 == 0) goto L29
            com.hp.hpl.sparta.e r3 = (com.hp.hpl.sparta.e) r3
            r5.s(r3, r6)
        L29:
            int r2 = r2 + 1
            goto L10
        L2c:
            return
    }

    @Override // com.hp.hpl.sparta.xpath.l
    public void m(com.hp.hpl.sparta.xpath.f r5) throws com.hp.hpl.sparta.xpath.XPathException {
            r4 = this;
            java.lang.Object r0 = r4.d
            boolean r1 = r0 instanceof com.hp.hpl.sparta.g
            if (r1 == 0) goto L2d
            com.hp.hpl.sparta.g r0 = (com.hp.hpl.sparta.g) r0
            java.lang.String r1 = r5.b()
            java.lang.String r0 = r0.D(r1)
            long r0 = java.lang.Long.parseLong(r0)
            double r0 = (double) r0
            double r2 = r5.c()
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L1f
            r5 = 1
            goto L20
        L1f:
            r5 = 0
        L20:
            com.hp.hpl.sparta.s$b r0 = r4.e
            if (r5 == 0) goto L27
            java.lang.Boolean r5 = com.hp.hpl.sparta.s.i
            goto L29
        L27:
            java.lang.Boolean r5 = com.hp.hpl.sparta.s.j
        L29:
            r0.b(r5)
            return
        L2d:
            com.hp.hpl.sparta.xpath.XPathException r5 = new com.hp.hpl.sparta.xpath.XPathException
            com.hp.hpl.sparta.xpath.c0 r0 = r4.h
            java.lang.String r1 = "Cannot test attribute of document"
            r5.<init>(r0, r1)
            throw r5
    }

    @Override // com.hp.hpl.sparta.xpath.l
    public void n(com.hp.hpl.sparta.xpath.c r3) throws com.hp.hpl.sparta.xpath.XPathException {
            r2 = this;
            java.lang.Object r0 = r2.d
            boolean r1 = r0 instanceof com.hp.hpl.sparta.g
            if (r1 == 0) goto L25
            com.hp.hpl.sparta.g r0 = (com.hp.hpl.sparta.g) r0
            java.lang.String r1 = r3.b()
            java.lang.String r0 = r0.D(r1)
            java.lang.String r3 = r3.c()
            boolean r3 = r3.equals(r0)
            com.hp.hpl.sparta.s$b r0 = r2.e
            if (r3 == 0) goto L1f
            java.lang.Boolean r3 = com.hp.hpl.sparta.s.i
            goto L21
        L1f:
            java.lang.Boolean r3 = com.hp.hpl.sparta.s.j
        L21:
            r0.b(r3)
            return
        L25:
            com.hp.hpl.sparta.xpath.XPathException r3 = new com.hp.hpl.sparta.xpath.XPathException
            com.hp.hpl.sparta.xpath.c0 r0 = r2.h
            java.lang.String r1 = "Cannot test attribute of document"
            r3.<init>(r0, r1)
            throw r3
    }

    @Override // com.hp.hpl.sparta.xpath.l
    public void o(com.hp.hpl.sparta.xpath.g r5) throws com.hp.hpl.sparta.xpath.XPathException {
            r4 = this;
            java.lang.Object r0 = r4.d
            boolean r1 = r0 instanceof com.hp.hpl.sparta.g
            if (r1 == 0) goto L2d
            com.hp.hpl.sparta.g r0 = (com.hp.hpl.sparta.g) r0
            java.lang.String r1 = r5.b()
            java.lang.String r0 = r0.D(r1)
            long r0 = java.lang.Long.parseLong(r0)
            double r0 = (double) r0
            double r2 = r5.c()
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L1f
            r5 = 1
            goto L20
        L1f:
            r5 = 0
        L20:
            com.hp.hpl.sparta.s$b r0 = r4.e
            if (r5 == 0) goto L27
            java.lang.Boolean r5 = com.hp.hpl.sparta.s.i
            goto L29
        L27:
            java.lang.Boolean r5 = com.hp.hpl.sparta.s.j
        L29:
            r0.b(r5)
            return
        L2d:
            com.hp.hpl.sparta.xpath.XPathException r5 = new com.hp.hpl.sparta.xpath.XPathException
            com.hp.hpl.sparta.xpath.c0 r0 = r4.h
            java.lang.String r1 = "Cannot test attribute of document"
            r5.<init>(r0, r1)
            throw r5
    }

    @Override // com.hp.hpl.sparta.xpath.l
    public void p(com.hp.hpl.sparta.xpath.d r3) throws com.hp.hpl.sparta.xpath.XPathException {
            r2 = this;
            java.lang.Object r0 = r2.d
            boolean r1 = r0 instanceof com.hp.hpl.sparta.g
            if (r1 == 0) goto L28
            com.hp.hpl.sparta.g r0 = (com.hp.hpl.sparta.g) r0
            java.lang.String r3 = r3.b()
            java.lang.String r3 = r0.D(r3)
            if (r3 == 0) goto L1a
            int r3 = r3.length()
            if (r3 <= 0) goto L1a
            r3 = 1
            goto L1b
        L1a:
            r3 = 0
        L1b:
            com.hp.hpl.sparta.s$b r0 = r2.e
            if (r3 == 0) goto L22
            java.lang.Boolean r3 = com.hp.hpl.sparta.s.i
            goto L24
        L22:
            java.lang.Boolean r3 = com.hp.hpl.sparta.s.j
        L24:
            r0.b(r3)
            return
        L28:
            com.hp.hpl.sparta.xpath.XPathException r3 = new com.hp.hpl.sparta.xpath.XPathException
            com.hp.hpl.sparta.xpath.c0 r0 = r2.h
            java.lang.String r1 = "Cannot test attribute of document"
            r3.<init>(r0, r1)
            throw r3
    }

    public com.hp.hpl.sparta.g u() {
            r2 = this;
            java.util.Vector r0 = r2.b
            int r0 = r0.size()
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            java.util.Vector r0 = r2.b
            r1 = 0
            java.lang.Object r0 = r0.elementAt(r1)
            com.hp.hpl.sparta.g r0 = (com.hp.hpl.sparta.g) r0
            return r0
    }

    public java.lang.String v() {
            r2 = this;
            java.util.Vector r0 = r2.b
            int r0 = r0.size()
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            java.util.Vector r0 = r2.b
            r1 = 0
            java.lang.Object r0 = r0.elementAt(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.util.Enumeration w() {
            r1 = this;
            java.util.Vector r0 = r1.b
            java.util.Enumeration r0 = r0.elements()
            return r0
    }
}
