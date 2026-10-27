package com.hp.hpl.sparta;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class g extends com.hp.hpl.sparta.i {
    private static final boolean l = false;
    private com.hp.hpl.sparta.i g;
    private com.hp.hpl.sparta.i h;
    private java.util.Hashtable i;
    private java.util.Vector j;
    private java.lang.String k;

    g() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.g = r0
            r1.h = r0
            r1.i = r0
            r1.j = r0
            r1.k = r0
            return
    }

    public g(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.g = r0
            r1.h = r0
            r1.i = r0
            r1.j = r0
            r1.k = r0
            java.lang.String r2 = com.hp.hpl.sparta.q.a(r2)
            r1.k = r2
            return
    }

    private void A() {
            r0 = this;
            return
    }

    private boolean K(com.hp.hpl.sparta.i r3) {
            r2 = this;
            com.hp.hpl.sparta.i r0 = r2.g
        L2:
            if (r0 == 0) goto L2f
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L2a
            com.hp.hpl.sparta.i r3 = r2.g
            if (r3 != r0) goto L14
            com.hp.hpl.sparta.i r3 = r0.c()
            r2.g = r3
        L14:
            com.hp.hpl.sparta.i r3 = r2.h
            if (r3 != r0) goto L1e
            com.hp.hpl.sparta.i r3 = r0.f()
            r2.h = r3
        L1e:
            r0.k()
            r3 = 0
            r0.o(r3)
            r0.n(r3)
            r3 = 1
            return r3
        L2a:
            com.hp.hpl.sparta.i r0 = r0.c()
            goto L2
        L2f:
            r3 = 0
            return r3
    }

    private void N(com.hp.hpl.sparta.i r3, com.hp.hpl.sparta.i r4) throws com.hp.hpl.sparta.DOMException {
            r2 = this;
            com.hp.hpl.sparta.i r0 = r2.g
        L2:
            if (r0 == 0) goto L22
            if (r0 != r4) goto L1d
            com.hp.hpl.sparta.i r0 = r2.g
            if (r0 != r4) goto Lc
            r2.g = r3
        Lc:
            com.hp.hpl.sparta.i r0 = r2.h
            if (r0 != r4) goto L12
            r2.h = r3
        L12:
            r4.l(r3)
            r3.o(r2)
            r3 = 0
            r4.o(r3)
            return
        L1d:
            com.hp.hpl.sparta.i r0 = r0.c()
            goto L2
        L22:
            com.hp.hpl.sparta.DOMException r3 = new com.hp.hpl.sparta.DOMException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot find "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " in "
            r0.append(r4)
            r0.append(r2)
            java.lang.String r4 = r0.toString()
            r0 = 8
            r3.<init>(r0, r4)
            throw r3
    }

    private com.hp.hpl.sparta.s Q(java.lang.String r4, boolean r5) throws com.hp.hpl.sparta.xpath.XPathException {
            r3 = this;
            com.hp.hpl.sparta.xpath.c0 r4 = com.hp.hpl.sparta.xpath.c0.b(r4)
            boolean r0 = r4.h()
            if (r0 == r5) goto L30
            if (r5 == 0) goto Lf
            java.lang.String r5 = "evaluates to element not string"
            goto L11
        Lf:
            java.lang.String r5 = "evaluates to string not element"
        L11:
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
        L30:
            com.hp.hpl.sparta.s r5 = new com.hp.hpl.sparta.s
            r5.<init>(r3, r4)
            return r5
    }

    public com.hp.hpl.sparta.g B(boolean r5) {
            r4 = this;
            com.hp.hpl.sparta.g r0 = new com.hp.hpl.sparta.g
            java.lang.String r1 = r4.k
            r0.<init>(r1)
            java.util.Vector r1 = r4.j
            if (r1 == 0) goto L27
            java.util.Enumeration r1 = r1.elements()
        Lf:
            boolean r2 = r1.hasMoreElements()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.nextElement()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Hashtable r3 = r4.i
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            r0.O(r2, r3)
            goto Lf
        L27:
            if (r5 == 0) goto L3b
            com.hp.hpl.sparta.i r5 = r4.g
        L2b:
            if (r5 == 0) goto L3b
            java.lang.Object r1 = r5.clone()
            com.hp.hpl.sparta.i r1 = (com.hp.hpl.sparta.i) r1
            r0.x(r1)
            com.hp.hpl.sparta.i r5 = r5.c()
            goto L2b
        L3b:
            return r0
    }

    public com.hp.hpl.sparta.g C() {
            r1 = this;
            r0 = 0
            com.hp.hpl.sparta.g r0 = r1.B(r0)
            return r0
    }

    public java.lang.String D(java.lang.String r2) {
            r1 = this;
            java.util.Hashtable r0 = r1.i
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    public java.util.Enumeration E() {
            r1 = this;
            java.util.Vector r0 = r1.j
            if (r0 != 0) goto L7
            java.util.Enumeration r0 = com.hp.hpl.sparta.e.n
            return r0
        L7:
            java.util.Enumeration r0 = r0.elements()
            return r0
    }

    public com.hp.hpl.sparta.i F() {
            r1 = this;
            com.hp.hpl.sparta.i r0 = r1.g
            return r0
    }

    public com.hp.hpl.sparta.i G() {
            r1 = this;
            com.hp.hpl.sparta.i r0 = r1.h
            return r0
    }

    public java.lang.String H() {
            r1 = this;
            java.lang.String r0 = r1.k
            return r0
    }

    public void I(java.lang.String r2) {
            r1 = this;
            java.util.Hashtable r0 = r1.i
            if (r0 != 0) goto L5
            return
        L5:
            r0.remove(r2)
            java.util.Vector r0 = r1.j
            r0.removeElement(r2)
            r1.j()
            return
    }

    public void J(com.hp.hpl.sparta.i r4) throws com.hp.hpl.sparta.DOMException {
            r3 = this;
            boolean r0 = r3.K(r4)
            if (r0 == 0) goto La
            r3.j()
            return
        La:
            com.hp.hpl.sparta.DOMException r0 = new com.hp.hpl.sparta.DOMException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot find "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " in "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = r1.toString()
            r1 = 8
            r0.<init>(r1, r4)
            throw r0
    }

    public void L(com.hp.hpl.sparta.g r1, com.hp.hpl.sparta.i r2) throws com.hp.hpl.sparta.DOMException {
            r0 = this;
            r0.N(r1, r2)
            r0.j()
            return
    }

    public void M(com.hp.hpl.sparta.r r1, com.hp.hpl.sparta.i r2) throws com.hp.hpl.sparta.DOMException {
            r0 = this;
            r0.N(r1, r2)
            r0.j()
            return
    }

    public void O(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.util.Hashtable r0 = r1.i
            if (r0 != 0) goto L12
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            r1.i = r0
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r1.j = r0
        L12:
            java.util.Hashtable r0 = r1.i
            java.lang.Object r0 = r0.get(r2)
            if (r0 != 0) goto L1f
            java.util.Vector r0 = r1.j
            r0.addElement(r2)
        L1f:
            java.util.Hashtable r0 = r1.i
            r0.put(r2, r3)
            r1.j()
            return
    }

    public void P(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = com.hp.hpl.sparta.q.a(r1)
            r0.k = r1
            r0.j()
            return
    }

    public boolean R(java.lang.String r8) throws com.hp.hpl.sparta.ParseException {
            r7 = this;
            com.hp.hpl.sparta.g r0 = r7.s(r8)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            com.hp.hpl.sparta.xpath.c0 r0 = com.hp.hpl.sparta.xpath.c0.b(r8)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            java.util.Enumeration r2 = r0.f()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            r3 = 0
        L11:
            boolean r4 = r2.hasMoreElements()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            if (r4 == 0) goto L1f
            r2.nextElement()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            int r3 = r3 + 1
            goto L11
        L1d:
            r0 = move-exception
            goto L5d
        L1f:
            r2 = 1
            int r3 = r3 - r2
            com.hp.hpl.sparta.xpath.t[] r4 = new com.hp.hpl.sparta.xpath.t[r3]     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            java.util.Enumeration r5 = r0.f()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
        L27:
            if (r1 >= r3) goto L34
            java.lang.Object r6 = r5.nextElement()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            com.hp.hpl.sparta.xpath.t r6 = (com.hp.hpl.sparta.xpath.t) r6     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            r4[r1] = r6     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            int r1 = r1 + 1
            goto L27
        L34:
            java.lang.Object r1 = r5.nextElement()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            com.hp.hpl.sparta.xpath.t r1 = (com.hp.hpl.sparta.xpath.t) r1     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            if (r3 != 0) goto L3e
            r0 = r7
            goto L55
        L3e:
            boolean r0 = r0.g()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            com.hp.hpl.sparta.xpath.c0 r0 = com.hp.hpl.sparta.xpath.c0.c(r0, r4)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            java.lang.String r0 = r0.toString()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            java.lang.String r3 = r0.toString()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            r7.R(r3)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            com.hp.hpl.sparta.g r0 = r7.s(r0)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
        L55:
            com.hp.hpl.sparta.g r1 = r7.i(r0, r1, r8)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            r0.y(r1)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> L1d
            return r2
        L5d:
            com.hp.hpl.sparta.ParseException r1 = new com.hp.hpl.sparta.ParseException
            r1.<init>(r8, r0)
            throw r1
    }

    @Override // com.hp.hpl.sparta.i
    protected int a() {
            r4 = this;
            java.lang.String r0 = r4.k
            int r0 = r0.hashCode()
            java.util.Hashtable r1 = r4.i
            if (r1 == 0) goto L31
            java.util.Enumeration r1 = r1.keys()
        Le:
            boolean r2 = r1.hasMoreElements()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.nextElement()
            java.lang.String r2 = (java.lang.String) r2
            int r0 = r0 * 31
            int r3 = r2.hashCode()
            int r0 = r0 + r3
            java.util.Hashtable r3 = r4.i
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            int r0 = r0 * 31
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            goto Le
        L31:
            com.hp.hpl.sparta.i r1 = r4.g
        L33:
            if (r1 == 0) goto L41
            int r0 = r0 * 31
            int r2 = r1.hashCode()
            int r0 = r0 + r2
            com.hp.hpl.sparta.i r1 = r1.c()
            goto L33
        L41:
            return r0
    }

    @Override // com.hp.hpl.sparta.i
    public java.lang.Object clone() {
            r1 = this;
            r0 = 1
            com.hp.hpl.sparta.g r0 = r1.B(r0)
            return r0
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof com.hp.hpl.sparta.g
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.hp.hpl.sparta.g r7 = (com.hp.hpl.sparta.g) r7
            java.lang.String r1 = r6.k
            java.lang.String r3 = r7.k
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.Hashtable r1 = r6.i
            if (r1 != 0) goto L1d
            r1 = 0
            goto L21
        L1d:
            int r1 = r1.size()
        L21:
            java.util.Hashtable r3 = r7.i
            if (r3 != 0) goto L27
            r3 = 0
            goto L2b
        L27:
            int r3 = r3.size()
        L2b:
            if (r1 == r3) goto L2e
            return r2
        L2e:
            java.util.Hashtable r1 = r6.i
            if (r1 == 0) goto L59
            java.util.Enumeration r1 = r1.keys()
        L36:
            boolean r3 = r1.hasMoreElements()
            if (r3 == 0) goto L59
            java.lang.Object r3 = r1.nextElement()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Hashtable r4 = r6.i
            java.lang.Object r4 = r4.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Hashtable r5 = r7.i
            java.lang.Object r3 = r5.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L36
            return r2
        L59:
            com.hp.hpl.sparta.i r1 = r6.g
            com.hp.hpl.sparta.i r7 = r7.g
        L5d:
            if (r1 == 0) goto L6f
            boolean r3 = r1.equals(r7)
            if (r3 != 0) goto L66
            return r2
        L66:
            com.hp.hpl.sparta.i r1 = r1.c()
            com.hp.hpl.sparta.i r7 = r7.c()
            goto L5d
        L6f:
            return r0
    }

    @Override // com.hp.hpl.sparta.i
    void p(java.io.Writer r2) throws java.io.IOException {
            r1 = this;
            com.hp.hpl.sparta.i r0 = r1.g
        L2:
            if (r0 == 0) goto Lc
            r0.p(r2)
            com.hp.hpl.sparta.i r0 = r0.c()
            goto L2
        Lc:
            return
    }

    @Override // com.hp.hpl.sparta.i
    public void r(java.io.Writer r6) throws java.io.IOException {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "<"
            r0.append(r1)
            java.lang.String r1 = r5.k
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.write(r0)
            java.util.Vector r0 = r5.j
            if (r0 == 0) goto L54
            java.util.Enumeration r0 = r0.elements()
        L1e:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L54
            java.lang.Object r1 = r0.nextElement()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Hashtable r2 = r5.i
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = " "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = "=\""
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r6.write(r1)
            com.hp.hpl.sparta.i.g(r6, r2)
            java.lang.String r1 = "\""
            r6.write(r1)
            goto L1e
        L54:
            com.hp.hpl.sparta.i r0 = r5.g
            if (r0 != 0) goto L5e
            java.lang.String r0 = "/>"
            r6.write(r0)
            return
        L5e:
            java.lang.String r0 = ">"
            r6.write(r0)
            com.hp.hpl.sparta.i r1 = r5.g
        L65:
            if (r1 == 0) goto L6f
            r1.r(r6)
            com.hp.hpl.sparta.i r1 = r1.c()
            goto L65
        L6f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "</"
            r1.append(r2)
            java.lang.String r2 = r5.k
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r6.write(r0)
            return
    }

    @Override // com.hp.hpl.sparta.i
    public com.hp.hpl.sparta.g s(java.lang.String r3) throws com.hp.hpl.sparta.ParseException {
            r2 = this;
            r0 = 0
            com.hp.hpl.sparta.s r3 = r2.Q(r3, r0)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> La
            com.hp.hpl.sparta.g r3 = r3.u()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> La
            return r3
        La:
            r3 = move-exception
            com.hp.hpl.sparta.ParseException r0 = new com.hp.hpl.sparta.ParseException
            java.lang.String r1 = "XPath problem"
            r0.<init>(r1, r3)
            throw r0
    }

    @Override // com.hp.hpl.sparta.i
    public java.util.Enumeration t(java.lang.String r3) throws com.hp.hpl.sparta.ParseException {
            r2 = this;
            r0 = 0
            com.hp.hpl.sparta.s r3 = r2.Q(r3, r0)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> La
            java.util.Enumeration r3 = r3.w()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> La
            return r3
        La:
            r3 = move-exception
            com.hp.hpl.sparta.ParseException r0 = new com.hp.hpl.sparta.ParseException
            java.lang.String r1 = "XPath problem"
            r0.<init>(r1, r3)
            throw r0
    }

    @Override // com.hp.hpl.sparta.i
    public java.lang.String u(java.lang.String r3) throws com.hp.hpl.sparta.ParseException {
            r2 = this;
            r0 = 1
            com.hp.hpl.sparta.s r3 = r2.Q(r3, r0)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> La
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
            com.hp.hpl.sparta.s r3 = r2.Q(r3, r0)     // Catch: com.hp.hpl.sparta.xpath.XPathException -> La
            java.util.Enumeration r3 = r3.w()     // Catch: com.hp.hpl.sparta.xpath.XPathException -> La
            return r3
        La:
            r3 = move-exception
            com.hp.hpl.sparta.ParseException r0 = new com.hp.hpl.sparta.ParseException
            java.lang.String r1 = "XPath problem"
            r0.<init>(r1, r3)
            throw r0
    }

    public void x(com.hp.hpl.sparta.i r2) {
            r1 = this;
            boolean r0 = r1.z(r2)
            if (r0 != 0) goto Lc
            java.lang.Object r2 = r2.clone()
            com.hp.hpl.sparta.g r2 = (com.hp.hpl.sparta.g) r2
        Lc:
            r1.y(r2)
            r1.j()
            return
    }

    void y(com.hp.hpl.sparta.i r2) {
            r1 = this;
            com.hp.hpl.sparta.g r0 = r2.e()
            if (r0 == 0) goto L9
            r0.K(r2)
        L9:
            com.hp.hpl.sparta.i r0 = r1.h
            r2.h(r0)
            com.hp.hpl.sparta.i r0 = r1.g
            if (r0 != 0) goto L14
            r1.g = r2
        L14:
            r2.o(r1)
            r1.h = r2
            com.hp.hpl.sparta.e r0 = r1.d()
            r2.n(r0)
            return
    }

    boolean z(com.hp.hpl.sparta.i r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 0
            return r2
        L4:
            com.hp.hpl.sparta.g r0 = r1.e()
            if (r0 != 0) goto Lc
            r2 = 1
            return r2
        Lc:
            boolean r2 = r0.z(r2)
            return r2
    }
}
