package com.hp.hpl.sparta;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class i {
    private com.hp.hpl.sparta.e a;
    private com.hp.hpl.sparta.g b;
    private com.hp.hpl.sparta.i c;
    private com.hp.hpl.sparta.i d;
    private java.lang.Object e;
    private int f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.hp.hpl.sparta.xpath.l {
        final /* synthetic */ com.hp.hpl.sparta.g a;
        final /* synthetic */ com.hp.hpl.sparta.g b;
        final /* synthetic */ java.lang.String c;
        final /* synthetic */ java.lang.String d;
        final /* synthetic */ com.hp.hpl.sparta.i e;

        a(com.hp.hpl.sparta.i r1, com.hp.hpl.sparta.g r2, com.hp.hpl.sparta.g r3, java.lang.String r4, java.lang.String r5) {
                r0 = this;
                r0.e = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.<init>()
                return
        }

        @Override // com.hp.hpl.sparta.xpath.l
        public void b(com.hp.hpl.sparta.xpath.x r5) throws com.hp.hpl.sparta.xpath.XPathException {
                r4 = this;
                com.hp.hpl.sparta.g r0 = r4.a
                com.hp.hpl.sparta.r r1 = new com.hp.hpl.sparta.r
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "not "
                r2.append(r3)
                java.lang.String r5 = r5.b()
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r1.<init>(r5)
                r0.x(r1)
                return
        }

        @Override // com.hp.hpl.sparta.xpath.l
        public void c(com.hp.hpl.sparta.xpath.h r5) throws com.hp.hpl.sparta.xpath.XPathException {
                r4 = this;
                com.hp.hpl.sparta.g r0 = r4.a
                java.lang.String r1 = r5.b()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "not "
                r2.append(r3)
                java.lang.String r5 = r5.c()
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r0.O(r1, r5)
                return
        }

        @Override // com.hp.hpl.sparta.xpath.l
        public void g(com.hp.hpl.sparta.xpath.v r3) throws com.hp.hpl.sparta.xpath.XPathException {
                r2 = this;
                com.hp.hpl.sparta.g r0 = r2.a
                com.hp.hpl.sparta.r r1 = new com.hp.hpl.sparta.r
                java.lang.String r3 = r3.b()
                r1.<init>(r3)
                r0.x(r1)
                return
        }

        @Override // com.hp.hpl.sparta.xpath.l
        public void h(com.hp.hpl.sparta.xpath.a0 r1) {
                r0 = this;
                return
        }

        @Override // com.hp.hpl.sparta.xpath.l
        public void j(com.hp.hpl.sparta.xpath.r r5) throws com.hp.hpl.sparta.xpath.XPathException {
                r4 = this;
                int r5 = r5.b()
                com.hp.hpl.sparta.g r0 = r4.b
                r1 = 1
                if (r0 != 0) goto L1a
                if (r5 != r1) goto Lc
                goto L1a
            Lc:
                com.hp.hpl.sparta.xpath.XPathException r5 = new com.hp.hpl.sparta.xpath.XPathException
                java.lang.String r0 = r4.c
                com.hp.hpl.sparta.xpath.c0 r0 = com.hp.hpl.sparta.xpath.c0.b(r0)
                java.lang.String r1 = "Position of root node must be 1"
                r5.<init>(r0, r1)
                throw r5
            L1a:
                if (r1 >= r5) goto L2b
                com.hp.hpl.sparta.g r0 = r4.b
                com.hp.hpl.sparta.g r2 = new com.hp.hpl.sparta.g
                java.lang.String r3 = r4.d
                r2.<init>(r3)
                r0.x(r2)
                int r1 = r1 + 1
                goto L1a
            L2b:
                return
        }

        @Override // com.hp.hpl.sparta.xpath.l
        public void k(com.hp.hpl.sparta.xpath.w r3) throws com.hp.hpl.sparta.xpath.XPathException {
                r2 = this;
                com.hp.hpl.sparta.g r3 = r2.a
                com.hp.hpl.sparta.r r0 = new com.hp.hpl.sparta.r
                java.lang.String r1 = "something"
                r0.<init>(r1)
                r3.x(r0)
                return
        }

        @Override // com.hp.hpl.sparta.xpath.l
        public void m(com.hp.hpl.sparta.xpath.f r4) throws com.hp.hpl.sparta.xpath.XPathException {
                r3 = this;
                com.hp.hpl.sparta.g r0 = r3.a
                java.lang.String r4 = r4.b()
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                java.lang.String r1 = java.lang.Long.toString(r1)
                r0.O(r4, r1)
                return
        }

        @Override // com.hp.hpl.sparta.xpath.l
        public void n(com.hp.hpl.sparta.xpath.c r3) throws com.hp.hpl.sparta.xpath.XPathException {
                r2 = this;
                com.hp.hpl.sparta.g r0 = r2.a
                java.lang.String r1 = r3.b()
                java.lang.String r3 = r3.c()
                r0.O(r1, r3)
                return
        }

        @Override // com.hp.hpl.sparta.xpath.l
        public void o(com.hp.hpl.sparta.xpath.g r4) throws com.hp.hpl.sparta.xpath.XPathException {
                r3 = this;
                com.hp.hpl.sparta.g r0 = r3.a
                java.lang.String r4 = r4.b()
                r1 = -9223372036854775808
                java.lang.String r1 = java.lang.Long.toString(r1)
                r0.O(r4, r1)
                return
        }

        @Override // com.hp.hpl.sparta.xpath.l
        public void p(com.hp.hpl.sparta.xpath.d r3) throws com.hp.hpl.sparta.xpath.XPathException {
                r2 = this;
                com.hp.hpl.sparta.g r0 = r2.a
                java.lang.String r3 = r3.b()
                java.lang.String r1 = "something"
                r0.O(r3, r1)
                return
        }
    }

    public i() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.b = r0
            r1.c = r0
            r1.d = r0
            r1.e = r0
            r0 = 0
            r1.f = r0
            return
    }

    protected static void g(java.io.Writer r6, java.lang.String r7) throws java.io.IOException {
            int r0 = r7.length()
            r1 = 0
            r2 = 0
        L6:
            if (r1 >= r0) goto L5a
            char r3 = r7.charAt(r1)
            r4 = 128(0x80, float:1.8E-43)
            if (r3 < r4) goto L27
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "&#"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = ";"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            goto L4b
        L27:
            r4 = 34
            if (r3 == r4) goto L49
            r4 = 60
            if (r3 == r4) goto L46
            r4 = 62
            if (r3 == r4) goto L43
            r4 = 38
            if (r3 == r4) goto L40
            r4 = 39
            if (r3 == r4) goto L3d
            r3 = 0
            goto L4b
        L3d:
            java.lang.String r3 = "&#39;"
            goto L4b
        L40:
            java.lang.String r3 = "&amp;"
            goto L4b
        L43:
            java.lang.String r3 = "&gt;"
            goto L4b
        L46:
            java.lang.String r3 = "&lt;"
            goto L4b
        L49:
            java.lang.String r3 = "&quot;"
        L4b:
            if (r3 == 0) goto L57
            int r4 = r1 - r2
            r6.write(r7, r2, r4)
            r6.write(r3)
            int r2 = r1 + 1
        L57:
            int r1 = r1 + 1
            goto L6
        L5a:
            if (r2 >= r0) goto L60
            int r0 = r0 - r2
            r6.write(r7, r2, r0)
        L60:
            return
    }

    protected abstract int a();

    public java.lang.Object b() {
            r1 = this;
            java.lang.Object r0 = r1.e
            return r0
    }

    public com.hp.hpl.sparta.i c() {
            r1 = this;
            com.hp.hpl.sparta.i r0 = r1.d
            return r0
    }

    public abstract java.lang.Object clone();

    public com.hp.hpl.sparta.e d() {
            r1 = this;
            com.hp.hpl.sparta.e r0 = r1.a
            return r0
    }

    public com.hp.hpl.sparta.g e() {
            r1 = this;
            com.hp.hpl.sparta.g r0 = r1.b
            return r0
    }

    public com.hp.hpl.sparta.i f() {
            r1 = this;
            com.hp.hpl.sparta.i r0 = r1.c
            return r0
    }

    void h(com.hp.hpl.sparta.i r1) {
            r0 = this;
            r0.c = r1
            if (r1 == 0) goto L6
            r1.d = r0
        L6:
            return
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.f
            if (r0 != 0) goto La
            int r0 = r1.a()
            r1.f = r0
        La:
            int r0 = r1.f
            return r0
    }

    com.hp.hpl.sparta.g i(com.hp.hpl.sparta.g r8, com.hp.hpl.sparta.xpath.t r9, java.lang.String r10) throws com.hp.hpl.sparta.ParseException, com.hp.hpl.sparta.xpath.XPathException {
            r7 = this;
            com.hp.hpl.sparta.xpath.o r0 = r9.a()
            boolean r1 = r0 instanceof com.hp.hpl.sparta.xpath.m
            if (r1 == 0) goto L23
            com.hp.hpl.sparta.xpath.m r0 = (com.hp.hpl.sparta.xpath.m) r0
            java.lang.String r6 = r0.c()
            com.hp.hpl.sparta.g r3 = new com.hp.hpl.sparta.g
            r3.<init>(r6)
            com.hp.hpl.sparta.xpath.k r9 = r9.b()
            com.hp.hpl.sparta.i$a r1 = new com.hp.hpl.sparta.i$a
            r2 = r7
            r4 = r8
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r9.a(r1)
            return r3
        L23:
            r5 = r10
            com.hp.hpl.sparta.ParseException r8 = new com.hp.hpl.sparta.ParseException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "\""
            r9.append(r10)
            r9.append(r0)
            java.lang.String r10 = "\" in \""
            r9.append(r10)
            r9.append(r5)
            java.lang.String r10 = "\" is not an element test"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    void j() {
            r1 = this;
            r0 = 0
            r1.f = r0
            com.hp.hpl.sparta.e r0 = r1.a
            if (r0 == 0) goto La
            r0.j()
        La:
            return
    }

    void k() {
            r2 = this;
            com.hp.hpl.sparta.i r0 = r2.c
            if (r0 == 0) goto L8
            com.hp.hpl.sparta.i r1 = r2.d
            r0.d = r1
        L8:
            com.hp.hpl.sparta.i r1 = r2.d
            if (r1 == 0) goto Le
            r1.c = r0
        Le:
            r0 = 0
            r2.d = r0
            r2.c = r0
            return
    }

    void l(com.hp.hpl.sparta.i r2) {
            r1 = this;
            com.hp.hpl.sparta.i r0 = r1.c
            if (r0 == 0) goto L6
            r0.d = r2
        L6:
            com.hp.hpl.sparta.i r0 = r1.d
            if (r0 == 0) goto Lc
            r0.c = r2
        Lc:
            r2.d = r0
            com.hp.hpl.sparta.i r0 = r1.c
            r2.c = r0
            r2 = 0
            r1.d = r2
            r1.c = r2
            return
    }

    public void m(java.lang.Object r1) {
            r0 = this;
            r0.e = r1
            return
    }

    void n(com.hp.hpl.sparta.e r1) {
            r0 = this;
            r0.a = r1
            return
    }

    void o(com.hp.hpl.sparta.g r1) {
            r0 = this;
            r0.b = r1
            return
    }

    abstract void p(java.io.Writer r1) throws java.io.IOException;

    public java.lang.String q() throws java.io.IOException {
            r2 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            r1.<init>(r0)
            r2.r(r1)
            r1.flush()
            java.lang.String r1 = new java.lang.String
            byte[] r0 = r0.toByteArray()
            r1.<init>(r0)
            return r1
    }

    abstract void r(java.io.Writer r1) throws java.io.IOException;

    public abstract com.hp.hpl.sparta.g s(java.lang.String r1) throws com.hp.hpl.sparta.ParseException;

    public abstract java.util.Enumeration t(java.lang.String r1) throws com.hp.hpl.sparta.ParseException;

    public java.lang.String toString() {
            r2 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L1a
            r0.<init>()     // Catch: java.io.IOException -> L1a
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch: java.io.IOException -> L1a
            r1.<init>(r0)     // Catch: java.io.IOException -> L1a
            r2.p(r1)     // Catch: java.io.IOException -> L1a
            r1.flush()     // Catch: java.io.IOException -> L1a
            java.lang.String r1 = new java.lang.String     // Catch: java.io.IOException -> L1a
            byte[] r0 = r0.toByteArray()     // Catch: java.io.IOException -> L1a
            r1.<init>(r0)     // Catch: java.io.IOException -> L1a
            return r1
        L1a:
            java.lang.String r0 = super.toString()
            return r0
    }

    public abstract java.lang.String u(java.lang.String r1) throws com.hp.hpl.sparta.ParseException;

    public abstract java.util.Enumeration v(java.lang.String r1) throws com.hp.hpl.sparta.ParseException;

    public boolean w(java.lang.String r10, java.lang.String r11) throws com.hp.hpl.sparta.ParseException {
            r9 = this;
            java.lang.String r0 = "Xpath expression \""
            r1 = 47
            int r1 = r10.lastIndexOf(r1)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            int r2 = r1 + 1
            java.lang.String r3 = r10.substring(r2)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            java.lang.String r4 = "text()"
            boolean r3 = r3.equals(r4)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            r4 = 64
            if (r3 != 0) goto L4a
            char r3 = r10.charAt(r2)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            if (r3 != r4) goto L1f
            goto L4a
        L1f:
            com.hp.hpl.sparta.ParseException r11 = new com.hp.hpl.sparta.ParseException     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            r1.<init>()     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            java.lang.String r3 = "Last step of Xpath expression \""
            r1.append(r3)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            r1.append(r10)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            java.lang.String r3 = "\" is not \"text()\" and does not start with a '@'. It starts with a '"
            r1.append(r3)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            char r2 = r10.charAt(r2)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            r1.append(r2)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            java.lang.String r2 = "'"
            r1.append(r2)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            java.lang.String r1 = r1.toString()     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            r11.<init>(r1)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            throw r11     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
        L47:
            r10 = move-exception
            goto L12a
        L4a:
            r3 = 0
            java.lang.String r5 = r10.substring(r3, r1)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            char r2 = r10.charAt(r2)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            r6 = 1
            if (r2 != r4) goto L9c
            int r1 = r1 + 2
            java.lang.String r1 = r10.substring(r1)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            int r2 = r1.length()     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            if (r2 == 0) goto L82
            java.util.Enumeration r2 = r9.t(r5)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
        L66:
            boolean r4 = r2.hasMoreElements()     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            if (r4 == 0) goto L81
            java.lang.Object r4 = r2.nextElement()     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            com.hp.hpl.sparta.g r4 = (com.hp.hpl.sparta.g) r4     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            java.lang.String r5 = r4.D(r1)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            boolean r5 = r11.equals(r5)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            if (r5 != 0) goto L66
            r4.O(r1, r11)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            r3 = 1
            goto L66
        L81:
            return r3
        L82:
            com.hp.hpl.sparta.ParseException r11 = new com.hp.hpl.sparta.ParseException     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            r1.<init>()     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            r1.append(r0)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            r1.append(r10)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            java.lang.String r2 = "\" specifies zero-length attribute name\""
            r1.append(r2)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            java.lang.String r1 = r1.toString()     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            r11.<init>(r1)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            throw r11     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
        L9c:
            java.util.Enumeration r1 = r9.t(r5)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            boolean r2 = r1.hasMoreElements()     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
        La4:
            boolean r4 = r1.hasMoreElements()     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            if (r4 == 0) goto L10f
            java.lang.Object r4 = r1.nextElement()     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            com.hp.hpl.sparta.g r4 = (com.hp.hpl.sparta.g) r4     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            java.util.Vector r5 = new java.util.Vector     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            r5.<init>()     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            com.hp.hpl.sparta.i r7 = r4.F()     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
        Lb9:
            if (r7 == 0) goto Lca
            boolean r8 = r7 instanceof com.hp.hpl.sparta.r     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            if (r8 == 0) goto Lc5
            r8 = r7
            com.hp.hpl.sparta.r r8 = (com.hp.hpl.sparta.r) r8     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            r5.addElement(r8)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
        Lc5:
            com.hp.hpl.sparta.i r7 = r7.c()     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            goto Lb9
        Lca:
            int r7 = r5.size()     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            if (r7 != 0) goto Le4
            com.hp.hpl.sparta.r r5 = new com.hp.hpl.sparta.r     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            r5.<init>(r11)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            java.lang.String r7 = r5.A()     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            int r7 = r7.length()     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            if (r7 <= 0) goto La4
            r4.x(r5)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            r2 = 1
            goto La4
        Le4:
            java.lang.Object r7 = r5.elementAt(r3)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            com.hp.hpl.sparta.r r7 = (com.hp.hpl.sparta.r) r7     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            java.lang.String r8 = r7.A()     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            boolean r8 = r8.equals(r11)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            if (r8 != 0) goto Lfb
            r5.removeElementAt(r3)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            r7.B(r11)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            r2 = 1
        Lfb:
            r7 = 0
        Lfc:
            int r8 = r5.size()     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            if (r7 >= r8) goto La4
            java.lang.Object r2 = r5.elementAt(r7)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            com.hp.hpl.sparta.r r2 = (com.hp.hpl.sparta.r) r2     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            r4.J(r2)     // Catch: com.hp.hpl.sparta.DOMException -> L47 java.lang.IndexOutOfBoundsException -> L110
            int r7 = r7 + 1
            r2 = 1
            goto Lfc
        L10f:
            return r2
        L110:
            com.hp.hpl.sparta.ParseException r11 = new com.hp.hpl.sparta.ParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r10)
            java.lang.String r10 = "\" is not in the form \"xpathExpression/@attributeName\""
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r11.<init>(r10)
            throw r11
        L12a:
            java.lang.Error r11 = new java.lang.Error
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Assertion failed "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r11.<init>(r10)
            throw r11
    }
}
