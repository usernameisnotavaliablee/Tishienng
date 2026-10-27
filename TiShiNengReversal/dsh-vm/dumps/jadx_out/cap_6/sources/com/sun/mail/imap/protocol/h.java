package com.sun.mail.imap.protocol;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class h extends com.sun.mail.iap.f {
    private static final byte[] A = null;
    private static final byte[] B = null;

    /* renamed from: q, reason: collision with root package name */
    private boolean f6q;
    private boolean r;
    private boolean s;
    private java.util.Map t;
    private java.util.List u;
    private java.lang.String[] v;
    private java.lang.String w;
    private com.sun.mail.imap.protocol.s x;
    private com.sun.mail.iap.d y;
    private java.lang.String z;

    static {
            r0 = 2
            byte[] r0 = new byte[r0]
            r0 = {x0012: FILL_ARRAY_DATA , data: [13, 10} // fill-array
            com.sun.mail.imap.protocol.h.A = r0
            r0 = 6
            byte[] r0 = new byte[r0]
            r0 = {x0018: FILL_ARRAY_DATA , data: [68, 79, 78, 69, 13, 10} // fill-array
            com.sun.mail.imap.protocol.h.B = r0
            return
    }

    public h(java.lang.String r10, java.lang.String r11, int r12, boolean r13, java.io.PrintStream r14, java.util.Properties r15, boolean r16) throws java.io.IOException, com.sun.mail.iap.ProtocolException {
            r9 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "mail."
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r7 = r1.toString()
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r8 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r2 = 0
            r9.f6q = r2
            r9.r = r2
            r3 = 0
            r9.t = r3
            r9.u = r3
            r9.w = r10     // Catch: java.lang.Throwable -> L34
            r9.w()     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = "IMAP4rev1"
            boolean r0 = r9.e0(r0)     // Catch: java.lang.Throwable -> L34
            r3 = 1
            if (r0 == 0) goto L36
            r9.r = r3     // Catch: java.lang.Throwable -> L34
            goto L36
        L34:
            r0 = move-exception
            goto L4c
        L36:
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L34
            r9.v = r0     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = "UTF-8"
            r0[r2] = r4     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = javax.mail.internet.MimeUtility.getDefaultJavaCharset()     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = javax.mail.internet.MimeUtility.mimeCharset(r2)     // Catch: java.lang.Throwable -> L34
            r0[r3] = r2     // Catch: java.lang.Throwable -> L34
            r9.f6q = r3     // Catch: java.lang.Throwable -> L34
            return
        L4c:
            boolean r2 = r9.f6q
            if (r2 != 0) goto L53
            r9.c()
        L53:
            throw r0
    }

    private void A(java.lang.String r2, java.lang.String r3) throws com.sun.mail.iap.ProtocolException {
            r1 = this;
            java.lang.String r3 = com.sun.mail.imap.protocol.b.a(r3)
            com.sun.mail.iap.b r0 = new com.sun.mail.iap.b
            r0.<init>()
            r0.i(r2)
            r0.o(r3)
            java.lang.String r2 = "COPY"
            r1.n(r2, r0)
            return
    }

    private int[] C0(java.lang.String r5, javax.mail.search.SearchTerm r6) throws com.sun.mail.iap.ProtocolException, javax.mail.search.SearchException {
            r4 = this;
            boolean r0 = com.sun.mail.imap.protocol.t.h(r6)
            r1 = 0
            if (r0 == 0) goto Lc
            int[] r5 = r4.j0(r5, r6, r1)     // Catch: java.io.IOException -> Lc
            return r5
        Lc:
            r0 = 0
        Ld:
            java.lang.String[] r2 = r4.v
            int r3 = r2.length
            if (r0 >= r3) goto L27
            r2 = r2[r0]
            if (r2 != 0) goto L17
            goto L24
        L17:
            int[] r5 = r4.j0(r5, r6, r2)     // Catch: javax.mail.search.SearchException -> L1c com.sun.mail.iap.ProtocolException -> L1e com.sun.mail.iap.CommandFailedException -> L20 java.io.IOException -> L24
            return r5
        L1c:
            r5 = move-exception
            throw r5
        L1e:
            r5 = move-exception
            throw r5
        L20:
            java.lang.String[] r2 = r4.v
            r2[r0] = r1
        L24:
            int r0 = r0 + 1
            goto Ld
        L27:
            javax.mail.search.SearchException r5 = new javax.mail.search.SearchException
            java.lang.String r6 = "Search failed"
            r5.<init>(r6)
            throw r5
    }

    private java.lang.String D(javax.mail.Flags r9) {
            r8 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "("
            r0.append(r1)
            javax.mail.Flags$Flag[] r1 = r9.getSystemFlags()
            r2 = 1
            r3 = 0
            r4 = 0
        L11:
            int r5 = r1.length
            r6 = 32
            if (r4 < r5) goto L37
            java.lang.String[] r5 = r9.getUserFlags()
            r9 = 0
        L1b:
            int r1 = r5.length
            if (r9 < r1) goto L28
            java.lang.String r9 = ")"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            return r9
        L28:
            if (r2 == 0) goto L2c
            r2 = 0
            goto L2f
        L2c:
            r0.append(r6)
        L2f:
            r1 = r5[r9]
            r0.append(r1)
            int r9 = r9 + 1
            goto L1b
        L37:
            r5 = r1[r4]
            javax.mail.Flags$Flag r7 = javax.mail.Flags.Flag.ANSWERED
            if (r5 != r7) goto L40
            java.lang.String r5 = "\\Answered"
            goto L62
        L40:
            javax.mail.Flags$Flag r7 = javax.mail.Flags.Flag.DELETED
            if (r5 != r7) goto L47
            java.lang.String r5 = "\\Deleted"
            goto L62
        L47:
            javax.mail.Flags$Flag r7 = javax.mail.Flags.Flag.DRAFT
            if (r5 != r7) goto L4e
            java.lang.String r5 = "\\Draft"
            goto L62
        L4e:
            javax.mail.Flags$Flag r7 = javax.mail.Flags.Flag.FLAGGED
            if (r5 != r7) goto L55
            java.lang.String r5 = "\\Flagged"
            goto L62
        L55:
            javax.mail.Flags$Flag r7 = javax.mail.Flags.Flag.RECENT
            if (r5 != r7) goto L5c
            java.lang.String r5 = "\\Recent"
            goto L62
        L5c:
            javax.mail.Flags$Flag r7 = javax.mail.Flags.Flag.SEEN
            if (r5 != r7) goto L6c
            java.lang.String r5 = "\\Seen"
        L62:
            if (r2 == 0) goto L66
            r2 = 0
            goto L69
        L66:
            r0.append(r6)
        L69:
            r0.append(r5)
        L6c:
            int r4 = r4 + 1
            goto L11
    }

    private com.sun.mail.imap.protocol.m[] F(java.lang.String r7, java.lang.String r8, java.lang.String r9) throws com.sun.mail.iap.ProtocolException {
            r6 = this;
            java.lang.String r8 = com.sun.mail.imap.protocol.b.a(r8)
            java.lang.String r9 = com.sun.mail.imap.protocol.b.a(r9)
            com.sun.mail.iap.b r0 = new com.sun.mail.iap.b
            r0.<init>()
            r0.o(r8)
            r0.o(r9)
            com.sun.mail.iap.g[] r8 = r6.b(r7, r0)
            int r9 = r8.length
            r0 = 1
            int r9 = r9 - r0
            r9 = r8[r9]
            boolean r1 = r9.h()
            r2 = 0
            if (r1 == 0) goto L58
            java.util.Vector r1 = new java.util.Vector
            r1.<init>(r0)
            int r0 = r8.length
            r3 = 0
        L2a:
            if (r3 < r0) goto L3c
            int r7 = r1.size()
            if (r7 <= 0) goto L58
            int r7 = r1.size()
            com.sun.mail.imap.protocol.m[] r2 = new com.sun.mail.imap.protocol.m[r7]
            r1.copyInto(r2)
            goto L58
        L3c:
            r4 = r8[r3]
            boolean r5 = r4 instanceof com.sun.mail.imap.protocol.i
            if (r5 != 0) goto L43
            goto L55
        L43:
            com.sun.mail.imap.protocol.i r4 = (com.sun.mail.imap.protocol.i) r4
            boolean r5 = r4.F(r7)
            if (r5 == 0) goto L55
            com.sun.mail.imap.protocol.m r5 = new com.sun.mail.imap.protocol.m
            r5.<init>(r4)
            r1.addElement(r5)
            r8[r3] = r2
        L55:
            int r3 = r3 + 1
            goto L2a
        L58:
            r6.j(r8)
            r6.h(r9)
            return r2
    }

    private com.sun.mail.iap.g[] K(java.lang.String r5, java.lang.String r6, boolean r7) throws com.sun.mail.iap.ProtocolException {
            r4 = this;
            r0 = 0
            java.lang.String r1 = ")"
            java.lang.String r2 = " ("
            if (r7 == 0) goto L23
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r3 = "UID FETCH "
            r7.<init>(r3)
            r7.append(r5)
            r7.append(r2)
            r7.append(r6)
            r7.append(r1)
            java.lang.String r5 = r7.toString()
            com.sun.mail.iap.g[] r5 = r4.b(r5, r0)
            return r5
        L23:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r3 = "FETCH "
            r7.<init>(r3)
            r7.append(r5)
            r7.append(r2)
            r7.append(r6)
            r7.append(r1)
            java.lang.String r5 = r7.toString()
            com.sun.mail.iap.g[] r5 = r4.b(r5, r0)
            return r5
    }

    private void N0(java.lang.String r3, javax.mail.Flags r4, boolean r5) throws com.sun.mail.iap.ProtocolException {
            r2 = this;
            r0 = 0
            java.lang.String r1 = "STORE "
            if (r5 == 0) goto L22
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r5.append(r3)
            java.lang.String r3 = " +FLAGS "
            r5.append(r3)
            java.lang.String r3 = r2.D(r4)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.sun.mail.iap.g[] r3 = r2.b(r3, r0)
            goto L3e
        L22:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r5.append(r3)
            java.lang.String r3 = " -FLAGS "
            r5.append(r3)
            java.lang.String r3 = r2.D(r4)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.sun.mail.iap.g[] r3 = r2.b(r3, r0)
        L3e:
            r2.j(r3)
            int r4 = r3.length
            int r4 = r4 + (-1)
            r3 = r3[r4]
            r2.h(r3)
            return
    }

    private com.sun.mail.imap.b Z(com.sun.mail.iap.g r5) {
            r4 = this;
            boolean r0 = r5.h()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            byte r0 = r5.r()
            if (r0 <= 0) goto L12
            r2 = 91
            if (r0 != r2) goto L8
        L12:
            if (r0 != 0) goto L15
            return r1
        L15:
            java.lang.String r0 = r5.o()
            java.lang.String r2 = "APPENDUID"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L22
            return r1
        L22:
            long r0 = r5.u()
            long r2 = r5.u()
            com.sun.mail.imap.b r5 = new com.sun.mail.imap.b
            r5.<init>(r0, r2)
            return r5
    }

    private int[] j0(java.lang.String r9, javax.mail.search.SearchTerm r10, java.lang.String r11) throws com.sun.mail.iap.ProtocolException, javax.mail.search.SearchException, java.io.IOException {
            r8 = this;
            r0 = 0
            if (r11 != 0) goto L5
            r1 = r0
            goto L9
        L5:
            java.lang.String r1 = javax.mail.internet.MimeUtility.javaCharset(r11)
        L9:
            com.sun.mail.iap.b r10 = com.sun.mail.imap.protocol.t.e(r10, r1)
            r10.i(r9)
            java.lang.String r9 = "SEARCH"
            if (r11 != 0) goto L19
            com.sun.mail.iap.g[] r10 = r8.b(r9, r10)
            goto L2b
        L19:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "SEARCH CHARSET "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            com.sun.mail.iap.g[] r10 = r8.b(r11, r10)
        L2b:
            int r11 = r10.length
            int r11 = r11 + (-1)
            r11 = r10[r11]
            boolean r1 = r11.h()
            if (r1 == 0) goto L7e
            java.util.Vector r1 = new java.util.Vector
            r1.<init>()
            int r2 = r10.length
            r3 = 0
            r4 = 0
        L3e:
            if (r4 < r2) goto L59
            int r5 = r1.size()
            int[] r6 = new int[r5]
        L46:
            if (r3 < r5) goto L4a
            r0 = r6
            goto L7e
        L4a:
            java.lang.Object r9 = r1.elementAt(r3)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r6[r3] = r9
            int r3 = r3 + 1
            goto L46
        L59:
            r5 = r10[r4]
            boolean r6 = r5 instanceof com.sun.mail.imap.protocol.i
            if (r6 != 0) goto L60
            goto L7b
        L60:
            com.sun.mail.imap.protocol.i r5 = (com.sun.mail.imap.protocol.i) r5
            boolean r6 = r5.F(r9)
            if (r6 == 0) goto L7b
        L68:
            int r6 = r5.v()
            r7 = -1
            if (r6 != r7) goto L72
            r10[r4] = r0
            goto L7b
        L72:
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r6)
            r1.addElement(r7)
            goto L68
        L7b:
            int r4 = r4 + 1
            goto L3e
        L7e:
            r8.j(r10)
            r8.h(r11)
            return r0
    }

    private javax.mail.Quota t0(com.sun.mail.iap.g r9) throws com.sun.mail.iap.ParsingException {
            r8 = this;
            java.lang.String r0 = r9.q()
            javax.mail.Quota r1 = new javax.mail.Quota
            r1.<init>(r0)
            r9.B()
            byte r0 = r9.r()
            r2 = 40
            if (r0 != r2) goto L47
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
        L19:
            byte r2 = r9.n()
            r3 = 41
            if (r2 != r3) goto L30
            r9.r()
            int r9 = r0.size()
            javax.mail.Quota$Resource[] r9 = new javax.mail.Quota.Resource[r9]
            r1.resources = r9
            r0.copyInto(r9)
            return r1
        L30:
            java.lang.String r3 = r9.o()
            if (r3 == 0) goto L19
            long r4 = r9.u()
            long r6 = r9.u()
            javax.mail.Quota$Resource r2 = new javax.mail.Quota$Resource
            r2.<init>(r3, r4, r6)
            r0.addElement(r2)
            goto L19
        L47:
            com.sun.mail.iap.ParsingException r9 = new com.sun.mail.iap.ParsingException
            java.lang.String r0 = "parse error in QUOTA"
            r9.<init>(r0)
            throw r9
    }

    public void A0(java.lang.String r2, java.lang.String r3) throws com.sun.mail.iap.ProtocolException {
            r1 = this;
            java.lang.String r2 = com.sun.mail.imap.protocol.b.a(r2)
            java.lang.String r3 = com.sun.mail.imap.protocol.b.a(r3)
            com.sun.mail.iap.b r0 = new com.sun.mail.iap.b
            r0.<init>()
            r0.o(r2)
            r0.o(r3)
            java.lang.String r2 = "RENAME"
            r1.n(r2, r0)
            return
    }

    public void B(com.sun.mail.imap.protocol.o[] r1, java.lang.String r2) throws com.sun.mail.iap.ProtocolException {
            r0 = this;
            java.lang.String r1 = com.sun.mail.imap.protocol.o.d(r1)
            r0.A(r1, r2)
            return
    }

    public void B0(java.lang.String[] r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) throws com.sun.mail.iap.ProtocolException {
            r13 = this;
            com.sun.mail.imap.protocol.s r0 = r13.x
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L61
            java.lang.Class<com.sun.mail.imap.protocol.j> r0 = com.sun.mail.imap.protocol.j.class
            r3 = 6
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L34
            java.lang.Class<com.sun.mail.imap.protocol.h> r5 = com.sun.mail.imap.protocol.h.class
            r4[r1] = r5     // Catch: java.lang.Exception -> L34
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r2] = r5     // Catch: java.lang.Exception -> L34
            java.lang.Class<java.util.Properties> r6 = java.util.Properties.class
            r7 = 2
            r4[r7] = r6     // Catch: java.lang.Exception -> L34
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L34
            r8 = 3
            r4[r8] = r6     // Catch: java.lang.Exception -> L34
            java.lang.Class<java.io.PrintStream> r6 = java.io.PrintStream.class
            r9 = 4
            r4[r9] = r6     // Catch: java.lang.Exception -> L34
            r6 = 5
            r4[r6] = r5     // Catch: java.lang.Exception -> L34
            java.lang.reflect.Constructor r0 = r0.getConstructor(r4)     // Catch: java.lang.Exception -> L34
            java.lang.String r4 = r13.w     // Catch: java.lang.Exception -> L34
            java.util.Properties r5 = r13.f     // Catch: java.lang.Exception -> L34
            boolean r10 = r13.c     // Catch: java.lang.Exception -> L34
            if (r10 == 0) goto L37
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L34
            goto L39
        L34:
            r0 = move-exception
            r14 = r0
            goto L54
        L37:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L34
        L39:
            java.io.PrintStream r11 = r13.e     // Catch: java.lang.Exception -> L34
            java.lang.String r12 = r13.a     // Catch: java.lang.Exception -> L34
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L34
            r3[r1] = r13     // Catch: java.lang.Exception -> L34
            r3[r2] = r4     // Catch: java.lang.Exception -> L34
            r3[r7] = r5     // Catch: java.lang.Exception -> L34
            r3[r8] = r10     // Catch: java.lang.Exception -> L34
            r3[r9] = r11     // Catch: java.lang.Exception -> L34
            r3[r6] = r12     // Catch: java.lang.Exception -> L34
            java.lang.Object r0 = r0.newInstance(r3)     // Catch: java.lang.Exception -> L34
            com.sun.mail.imap.protocol.s r0 = (com.sun.mail.imap.protocol.s) r0     // Catch: java.lang.Exception -> L34
            r13.x = r0     // Catch: java.lang.Exception -> L34
            goto L61
        L54:
            boolean r0 = r13.c
            if (r0 == 0) goto La2
            java.io.PrintStream r0 = r13.e
            r14.toString()
            r0.getClass()
            goto La2
        L61:
            if (r14 == 0) goto L82
            int r0 = r14.length
            if (r0 <= 0) goto L82
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r14.length
            r0.<init>(r3)
        L6c:
            int r3 = r14.length
            if (r1 < r3) goto L70
            goto L84
        L70:
            java.util.List r3 = r13.u
            r4 = r14[r1]
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L7f
            r3 = r14[r1]
            r0.add(r3)
        L7f:
            int r1 = r1 + 1
            goto L6c
        L82:
            java.util.List r0 = r13.u
        L84:
            int r14 = r0.size()
            java.lang.String[] r14 = new java.lang.String[r14]
            java.lang.Object[] r14 = r0.toArray(r14)
            r4 = r14
            java.lang.String[] r4 = (java.lang.String[]) r4
            com.sun.mail.imap.protocol.s r3 = r13.x
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            boolean r14 = r3.a(r4, r5, r6, r7, r8)
            if (r14 == 0) goto La2
            r13.s = r2
        La2:
            return
    }

    public void C(java.lang.String r2) throws com.sun.mail.iap.ProtocolException {
            r1 = this;
            java.lang.String r2 = com.sun.mail.imap.protocol.b.a(r2)
            com.sun.mail.iap.b r0 = new com.sun.mail.iap.b
            r0.<init>()
            r0.o(r2)
            java.lang.String r2 = "CREATE"
            r1.n(r2, r0)
            return
    }

    public int[] D0(javax.mail.search.SearchTerm r2) throws com.sun.mail.iap.ProtocolException, javax.mail.search.SearchException {
            r1 = this;
            java.lang.String r0 = "ALL"
            int[] r2 = r1.C0(r0, r2)
            return r2
    }

    public void E(java.lang.String r2, java.lang.String r3) throws com.sun.mail.iap.ProtocolException {
            r1 = this;
            java.lang.String r0 = "ACL"
            boolean r0 = r1.e0(r0)
            if (r0 == 0) goto L29
            java.lang.String r2 = com.sun.mail.imap.protocol.b.a(r2)
            com.sun.mail.iap.b r0 = new com.sun.mail.iap.b
            r0.<init>()
            r0.o(r2)
            r0.o(r3)
            java.lang.String r2 = "DELETEACL"
            com.sun.mail.iap.g[] r2 = r1.b(r2, r0)
            int r3 = r2.length
            int r3 = r3 + (-1)
            r3 = r2[r3]
            r1.j(r2)
            r1.h(r3)
            return
        L29:
            com.sun.mail.iap.BadCommandException r2 = new com.sun.mail.iap.BadCommandException
            java.lang.String r3 = "ACL not supported"
            r2.<init>(r3)
            throw r2
    }

    public int[] E0(com.sun.mail.imap.protocol.o[] r1, javax.mail.search.SearchTerm r2) throws com.sun.mail.iap.ProtocolException, javax.mail.search.SearchException {
            r0 = this;
            java.lang.String r1 = com.sun.mail.imap.protocol.o.d(r1)
            int[] r1 = r0.C0(r1, r2)
            return r1
    }

    public com.sun.mail.imap.protocol.n F0(java.lang.String r5) throws com.sun.mail.iap.ProtocolException {
            r4 = this;
            java.lang.String r5 = com.sun.mail.imap.protocol.b.a(r5)
            com.sun.mail.iap.b r0 = new com.sun.mail.iap.b
            r0.<init>()
            r0.o(r5)
            java.lang.String r5 = "SELECT"
            com.sun.mail.iap.g[] r5 = r4.b(r5, r0)
            com.sun.mail.imap.protocol.n r0 = new com.sun.mail.imap.protocol.n
            r0.<init>(r5)
            r4.j(r5)
            int r1 = r5.length
            r2 = 1
            int r1 = r1 - r2
            r5 = r5[r1]
            boolean r1 = r5.h()
            if (r1 == 0) goto L38
            java.lang.String r1 = r5.toString()
            java.lang.String r3 = "READ-ONLY"
            int r1 = r1.indexOf(r3)
            r3 = -1
            if (r1 == r3) goto L35
            r0.h = r2
            goto L38
        L35:
            r1 = 2
            r0.h = r1
        L38:
            r4.h(r5)
            return r0
    }

    public com.sun.mail.imap.protocol.n G(java.lang.String r4) throws com.sun.mail.iap.ProtocolException {
            r3 = this;
            java.lang.String r4 = com.sun.mail.imap.protocol.b.a(r4)
            com.sun.mail.iap.b r0 = new com.sun.mail.iap.b
            r0.<init>()
            r0.o(r4)
            java.lang.String r4 = "EXAMINE"
            com.sun.mail.iap.g[] r4 = r3.b(r4, r0)
            com.sun.mail.imap.protocol.n r0 = new com.sun.mail.imap.protocol.n
            r0.<init>(r4)
            r1 = 1
            r0.h = r1
            r3.j(r4)
            int r2 = r4.length
            int r2 = r2 - r1
            r4 = r4[r2]
            r3.h(r4)
            return r0
    }

    public void G0(java.lang.String r2, char r3, com.sun.mail.imap.a r4) throws com.sun.mail.iap.ProtocolException {
            r1 = this;
            java.lang.String r0 = "ACL"
            boolean r0 = r1.e0(r0)
            if (r0 == 0) goto L50
            java.lang.String r2 = com.sun.mail.imap.protocol.b.a(r2)
            com.sun.mail.iap.b r0 = new com.sun.mail.iap.b
            r0.<init>()
            r0.o(r2)
            java.lang.String r2 = r4.a()
            r0.o(r2)
            com.sun.mail.imap.n r2 = r4.b()
            java.lang.String r2 = r2.toString()
            r4 = 43
            if (r3 == r4) goto L2b
            r4 = 45
            if (r3 != r4) goto L3b
        L2b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r4.<init>(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
        L3b:
            r0.o(r2)
            java.lang.String r2 = "SETACL"
            com.sun.mail.iap.g[] r2 = r1.b(r2, r0)
            int r3 = r2.length
            int r3 = r3 + (-1)
            r3 = r2[r3]
            r1.j(r2)
            r1.h(r3)
            return
        L50:
            com.sun.mail.iap.BadCommandException r2 = new com.sun.mail.iap.BadCommandException
            java.lang.String r3 = "ACL not supported"
            r2.<init>(r3)
            throw r2
    }

    public void H() throws com.sun.mail.iap.ProtocolException {
            r2 = this;
            java.lang.String r0 = "EXPUNGE"
            r1 = 0
            r2.n(r0, r1)
            return
    }

    protected void H0(com.sun.mail.iap.g r3) {
            r2 = this;
        L0:
            byte r0 = r3.r()
            if (r0 <= 0) goto La
            r1 = 91
            if (r0 != r1) goto L0
        La:
            if (r0 != 0) goto Ld
            goto L19
        Ld:
            java.lang.String r0 = r3.o()
            java.lang.String r1 = "CAPABILITY"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L1a
        L19:
            return
        L1a:
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 10
            r0.<init>(r1)
            r2.t = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 5
            r0.<init>(r1)
            r2.u = r0
            r2.s0(r3)
            return
    }

    public com.sun.mail.iap.g[] I(int r2, int r3, java.lang.String r4) throws com.sun.mail.iap.ProtocolException {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.<init>(r2)
            java.lang.String r2 = ":"
            r0.append(r2)
            java.lang.String r2 = java.lang.String.valueOf(r3)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3 = 0
            com.sun.mail.iap.g[] r2 = r1.K(r2, r4, r3)
            return r2
    }

    public void I0(javax.mail.Quota r6) throws com.sun.mail.iap.ProtocolException {
            r5 = this;
            java.lang.String r0 = "QUOTA"
            boolean r0 = r5.e0(r0)
            if (r0 == 0) goto L4a
            com.sun.mail.iap.b r0 = new com.sun.mail.iap.b
            r0.<init>()
            java.lang.String r1 = r6.quotaRoot
            r0.o(r1)
            com.sun.mail.iap.b r1 = new com.sun.mail.iap.b
            r1.<init>()
            javax.mail.Quota$Resource[] r2 = r6.resources
            if (r2 == 0) goto L35
            r2 = 0
        L1c:
            javax.mail.Quota$Resource[] r3 = r6.resources
            int r4 = r3.length
            if (r2 < r4) goto L22
            goto L35
        L22:
            r3 = r3[r2]
            java.lang.String r3 = r3.name
            r1.i(r3)
            javax.mail.Quota$Resource[] r3 = r6.resources
            r3 = r3[r2]
            long r3 = r3.limit
            r1.n(r3)
            int r2 = r2 + 1
            goto L1c
        L35:
            r0.h(r1)
            java.lang.String r6 = "SETQUOTA"
            com.sun.mail.iap.g[] r6 = r5.b(r6, r0)
            int r0 = r6.length
            int r0 = r0 + (-1)
            r0 = r6[r0]
            r5.j(r6)
            r5.h(r0)
            return
        L4a:
            com.sun.mail.iap.BadCommandException r6 = new com.sun.mail.iap.BadCommandException
            java.lang.String r0 = "QUOTA not supported"
            r6.<init>(r0)
            throw r6
    }

    public com.sun.mail.iap.g[] J(int r2, java.lang.String r3) throws com.sun.mail.iap.ProtocolException {
            r1 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0 = 0
            com.sun.mail.iap.g[] r2 = r1.K(r2, r3, r0)
            return r2
    }

    public void J0() throws com.sun.mail.iap.ProtocolException {
            r3 = this;
            java.lang.String r0 = "STARTTLS"
            super.o(r0)     // Catch: java.lang.Exception -> L6 com.sun.mail.iap.ProtocolException -> L8
            return
        L6:
            r0 = move-exception
            goto La
        L8:
            r0 = move-exception
            goto L1b
        La:
            com.sun.mail.iap.g r0 = com.sun.mail.iap.g.a(r0)
            r1 = 1
            com.sun.mail.iap.g[] r1 = new com.sun.mail.iap.g[r1]
            r2 = 0
            r1[r2] = r0
            r3.j(r1)
            r3.c()
            return
        L1b:
            throw r0
    }

    public com.sun.mail.imap.protocol.u K0(java.lang.String r8, java.lang.String[] r9) throws com.sun.mail.iap.ProtocolException {
            r7 = this;
            boolean r0 = r7.i0()
            if (r0 != 0) goto L17
            java.lang.String r0 = "IMAP4SUNVERSION"
            boolean r0 = r7.e0(r0)
            if (r0 == 0) goto Lf
            goto L17
        Lf:
            com.sun.mail.iap.BadCommandException r8 = new com.sun.mail.iap.BadCommandException
            java.lang.String r9 = "STATUS not supported"
            r8.<init>(r9)
            throw r8
        L17:
            java.lang.String r8 = com.sun.mail.imap.protocol.b.a(r8)
            com.sun.mail.iap.b r0 = new com.sun.mail.iap.b
            r0.<init>()
            r0.o(r8)
            com.sun.mail.iap.b r8 = new com.sun.mail.iap.b
            r8.<init>()
            if (r9 != 0) goto L2c
            java.lang.String[] r9 = com.sun.mail.imap.protocol.u.g
        L2c:
            int r1 = r9.length
            r2 = 0
            r3 = 0
        L2f:
            if (r3 < r1) goto L77
            r0.h(r8)
            java.lang.String r8 = "STATUS"
            com.sun.mail.iap.g[] r9 = r7.b(r8, r0)
            int r0 = r9.length
            int r0 = r0 + (-1)
            r0 = r9[r0]
            boolean r1 = r0.h()
            r3 = 0
            if (r1 == 0) goto L70
            int r1 = r9.length
            r4 = r3
        L48:
            if (r2 < r1) goto L4c
            r3 = r4
            goto L70
        L4c:
            r5 = r9[r2]
            boolean r6 = r5 instanceof com.sun.mail.imap.protocol.i
            if (r6 != 0) goto L53
            goto L6d
        L53:
            com.sun.mail.imap.protocol.i r5 = (com.sun.mail.imap.protocol.i) r5
            boolean r6 = r5.F(r8)
            if (r6 == 0) goto L6d
            if (r4 != 0) goto L63
            com.sun.mail.imap.protocol.u r4 = new com.sun.mail.imap.protocol.u
            r4.<init>(r5)
            goto L6b
        L63:
            com.sun.mail.imap.protocol.u r6 = new com.sun.mail.imap.protocol.u
            r6.<init>(r5)
            com.sun.mail.imap.protocol.u.a(r4, r6)
        L6b:
            r9[r2] = r3
        L6d:
            int r2 = r2 + 1
            goto L48
        L70:
            r7.j(r9)
            r7.h(r0)
            return r3
        L77:
            r4 = r9[r3]
            r8.i(r4)
            int r3 = r3 + 1
            goto L2f
    }

    public com.sun.mail.iap.g[] L(com.sun.mail.imap.protocol.o[] r2, java.lang.String r3) throws com.sun.mail.iap.ProtocolException {
            r1 = this;
            java.lang.String r2 = com.sun.mail.imap.protocol.o.d(r2)
            r0 = 0
            com.sun.mail.iap.g[] r2 = r1.K(r2, r3, r0)
            return r2
    }

    public void L0(int r2, int r3, javax.mail.Flags r4, boolean r5) throws com.sun.mail.iap.ProtocolException {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.<init>(r2)
            java.lang.String r2 = ":"
            r0.append(r2)
            java.lang.String r2 = java.lang.String.valueOf(r3)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.N0(r2, r4, r5)
            return
    }

    public com.sun.mail.imap.protocol.c M(int r2, java.lang.String r3) throws com.sun.mail.iap.ProtocolException {
            r1 = this;
            r0 = 0
            com.sun.mail.imap.protocol.c r2 = r1.Q(r2, r3, r0)
            return r2
    }

    public void M0(int r1, javax.mail.Flags r2, boolean r3) throws com.sun.mail.iap.ProtocolException {
            r0 = this;
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.N0(r1, r2, r3)
            return
    }

    public com.sun.mail.imap.protocol.c N(int r8, java.lang.String r9, int r10, int r11) throws com.sun.mail.iap.ProtocolException {
            r7 = this;
            r5 = 0
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            com.sun.mail.imap.protocol.c r8 = r0.P(r1, r2, r3, r4, r5, r6)
            return r8
    }

    public com.sun.mail.imap.protocol.c O(int r8, java.lang.String r9, int r10, int r11, com.sun.mail.iap.d r12) throws com.sun.mail.iap.ProtocolException {
            r7 = this;
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            com.sun.mail.imap.protocol.c r8 = r0.P(r1, r2, r3, r4, r5, r6)
            return r8
    }

    public void O0(com.sun.mail.imap.protocol.o[] r1, javax.mail.Flags r2, boolean r3) throws com.sun.mail.iap.ProtocolException {
            r0 = this;
            java.lang.String r1 = com.sun.mail.imap.protocol.o.d(r1)
            r0.N0(r1, r2, r3)
            return
    }

    protected com.sun.mail.imap.protocol.c P(int r2, java.lang.String r3, int r4, int r5, boolean r6, com.sun.mail.iap.d r7) throws com.sun.mail.iap.ProtocolException {
            r1 = this;
            r1.y = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            if (r6 == 0) goto L9
            java.lang.String r6 = "BODY.PEEK["
            goto Lb
        L9:
            java.lang.String r6 = "BODY["
        Lb:
            r7.<init>(r6)
            java.lang.String r6 = "]<"
            if (r3 != 0) goto L13
            goto L1f
        L13:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
        L1f:
            r7.append(r6)
            java.lang.String r3 = java.lang.String.valueOf(r4)
            r7.append(r3)
            java.lang.String r3 = "."
            r7.append(r3)
            java.lang.String r3 = java.lang.String.valueOf(r5)
            r7.append(r3)
            java.lang.String r3 = ">"
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            com.sun.mail.iap.g[] r3 = r1.J(r2, r3)
            r1.j(r3)
            int r4 = r3.length
            int r4 = r4 + (-1)
            r4 = r3[r4]
            boolean r5 = r4.h()
            if (r5 == 0) goto L59
            java.lang.Class<com.sun.mail.imap.protocol.c> r4 = com.sun.mail.imap.protocol.c.class
            com.sun.mail.imap.protocol.l r2 = com.sun.mail.imap.protocol.f.K(r3, r2, r4)
            com.sun.mail.imap.protocol.c r2 = (com.sun.mail.imap.protocol.c) r2
            return r2
        L59:
            boolean r2 = r4.g()
            r3 = 0
            if (r2 == 0) goto L61
            return r3
        L61:
            r1.h(r4)
            return r3
    }

    public void P0(java.lang.String r2) throws com.sun.mail.iap.ProtocolException {
            r1 = this;
            com.sun.mail.iap.b r0 = new com.sun.mail.iap.b
            r0.<init>()
            java.lang.String r2 = com.sun.mail.imap.protocol.b.a(r2)
            r0.o(r2)
            java.lang.String r2 = "SUBSCRIBE"
            r1.n(r2, r0)
            return
    }

    protected com.sun.mail.imap.protocol.c Q(int r3, java.lang.String r4, boolean r5) throws com.sun.mail.iap.ProtocolException {
            r2 = this;
            java.lang.String r0 = "]"
            if (r5 == 0) goto L26
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "BODY.PEEK["
            r5.<init>(r1)
            if (r4 != 0) goto Le
            goto L1a
        Le:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L1a:
            r5.append(r0)
            java.lang.String r4 = r5.toString()
            com.sun.mail.iap.g[] r4 = r2.J(r3, r4)
            goto L47
        L26:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "BODY["
            r5.<init>(r1)
            if (r4 != 0) goto L30
            goto L3c
        L30:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L3c:
            r5.append(r0)
            java.lang.String r4 = r5.toString()
            com.sun.mail.iap.g[] r4 = r2.J(r3, r4)
        L47:
            r2.j(r4)
            int r5 = r4.length
            int r5 = r5 + (-1)
            r5 = r4[r5]
            boolean r0 = r5.h()
            if (r0 == 0) goto L5e
            java.lang.Class<com.sun.mail.imap.protocol.c> r5 = com.sun.mail.imap.protocol.c.class
            com.sun.mail.imap.protocol.l r3 = com.sun.mail.imap.protocol.f.K(r4, r3, r5)
            com.sun.mail.imap.protocol.c r3 = (com.sun.mail.imap.protocol.c) r3
            return r3
        L5e:
            boolean r3 = r5.g()
            r4 = 0
            if (r3 == 0) goto L66
            return r4
        L66:
            r2.h(r5)
            return r4
    }

    public void Q0(com.sun.mail.imap.protocol.w[] r3) throws com.sun.mail.iap.ProtocolException {
            r2 = this;
            java.lang.String r0 = "UIDPLUS"
            boolean r0 = r2.e0(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UID EXPUNGE "
            r0.<init>(r1)
            java.lang.String r3 = com.sun.mail.imap.protocol.w.d(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r0 = 0
            r2.n(r3, r0)
            return
        L1f:
            com.sun.mail.iap.BadCommandException r3 = new com.sun.mail.iap.BadCommandException
            java.lang.String r0 = "UID EXPUNGE not supported"
            r3.<init>(r0)
            throw r3
    }

    public com.sun.mail.imap.protocol.d R(int r4) throws com.sun.mail.iap.ProtocolException {
            r3 = this;
            java.lang.String r0 = "BODYSTRUCTURE"
            com.sun.mail.iap.g[] r0 = r3.J(r4, r0)
            r3.j(r0)
            int r1 = r0.length
            int r1 = r1 + (-1)
            r1 = r0[r1]
            boolean r2 = r1.h()
            if (r2 == 0) goto L1d
            java.lang.Class<com.sun.mail.imap.protocol.d> r1 = com.sun.mail.imap.protocol.d.class
            com.sun.mail.imap.protocol.l r4 = com.sun.mail.imap.protocol.f.K(r0, r4, r1)
            com.sun.mail.imap.protocol.d r4 = (com.sun.mail.imap.protocol.d) r4
            return r4
        L1d:
            boolean r4 = r1.g()
            r0 = 0
            if (r4 == 0) goto L25
            return r0
        L25:
            r3.h(r1)
            return r0
    }

    public void R0(java.lang.String r2) throws com.sun.mail.iap.ProtocolException {
            r1 = this;
            com.sun.mail.iap.b r0 = new com.sun.mail.iap.b
            r0.<init>()
            java.lang.String r2 = com.sun.mail.imap.protocol.b.a(r2)
            r0.o(r2)
            java.lang.String r2 = "UNSUBSCRIBE"
            r1.n(r2, r0)
            return
    }

    public javax.mail.Flags S(int r8) throws com.sun.mail.iap.ProtocolException {
            r7 = this;
            java.lang.String r0 = "FLAGS"
            com.sun.mail.iap.g[] r0 = r7.J(r8, r0)
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r4 = r2
        La:
            if (r3 < r1) goto Ld
            goto L2e
        Ld:
            r5 = r0[r3]
            if (r5 == 0) goto L3a
            boolean r6 = r5 instanceof com.sun.mail.imap.protocol.f
            if (r6 == 0) goto L3a
            com.sun.mail.imap.protocol.f r5 = (com.sun.mail.imap.protocol.f) r5
            int r5 = r5.E()
            if (r5 == r8) goto L1e
            goto L3a
        L1e:
            r4 = r0[r3]
            com.sun.mail.imap.protocol.f r4 = (com.sun.mail.imap.protocol.f) r4
            java.lang.Class<javax.mail.Flags> r5 = javax.mail.Flags.class
            com.sun.mail.imap.protocol.l r4 = r4.J(r5)
            javax.mail.Flags r4 = (javax.mail.Flags) r4
            if (r4 == 0) goto L3a
            r0[r3] = r2
        L2e:
            r7.j(r0)
            int r8 = r0.length
            int r8 = r8 + (-1)
            r8 = r0[r8]
            r7.h(r8)
            return r4
        L3a:
            int r3 = r3 + 1
            goto La
    }

    public com.sun.mail.imap.protocol.q T(int r3, java.lang.String r4) throws com.sun.mail.iap.ProtocolException {
            r2 = this;
            if (r4 != 0) goto L5
            java.lang.String r4 = "RFC822"
            goto L13
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RFC822."
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L13:
            com.sun.mail.iap.g[] r4 = r2.J(r3, r4)
            r2.j(r4)
            int r0 = r4.length
            int r0 = r0 + (-1)
            r0 = r4[r0]
            boolean r1 = r0.h()
            if (r1 == 0) goto L2e
            java.lang.Class<com.sun.mail.imap.protocol.q> r0 = com.sun.mail.imap.protocol.q.class
            com.sun.mail.imap.protocol.l r3 = com.sun.mail.imap.protocol.f.K(r4, r3, r0)
            com.sun.mail.imap.protocol.q r3 = (com.sun.mail.imap.protocol.q) r3
            return r3
        L2e:
            boolean r3 = r0.g()
            r4 = 0
            if (r3 == 0) goto L36
            return r4
        L36:
            r2.h(r0)
            return r4
    }

    public com.sun.mail.imap.protocol.v U(long r10) throws com.sun.mail.iap.ProtocolException {
            r9 = this;
            java.lang.String r0 = java.lang.String.valueOf(r10)
            java.lang.String r1 = "UID"
            r2 = 1
            com.sun.mail.iap.g[] r0 = r9.K(r0, r1, r2)
            int r1 = r0.length
            r3 = 0
            r4 = 0
            r5 = r3
        Lf:
            if (r4 < r1) goto L12
            goto L2d
        L12:
            r6 = r0[r4]
            if (r6 == 0) goto L39
            boolean r7 = r6 instanceof com.sun.mail.imap.protocol.f
            if (r7 != 0) goto L1b
            goto L39
        L1b:
            com.sun.mail.imap.protocol.f r6 = (com.sun.mail.imap.protocol.f) r6
            java.lang.Class<com.sun.mail.imap.protocol.v> r5 = com.sun.mail.imap.protocol.v.class
            com.sun.mail.imap.protocol.l r5 = r6.J(r5)
            com.sun.mail.imap.protocol.v r5 = (com.sun.mail.imap.protocol.v) r5
            if (r5 == 0) goto L39
            long r6 = r5.b
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 != 0) goto L38
        L2d:
            r9.j(r0)
            int r10 = r0.length
            int r10 = r10 - r2
            r10 = r0[r10]
            r9.h(r10)
            return r5
        L38:
            r5 = r3
        L39:
            int r4 = r4 + 1
            goto Lf
    }

    public com.sun.mail.imap.protocol.v[] V(long r4, long r6) throws com.sun.mail.iap.ProtocolException {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r0.<init>(r4)
            java.lang.String r4 = ":"
            r0.append(r4)
            r4 = -1
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L1b
            java.lang.String r4 = "*"
            goto L1f
        L1b:
            java.lang.String r4 = java.lang.String.valueOf(r6)
        L1f:
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r5 = "UID"
            r6 = 1
            com.sun.mail.iap.g[] r4 = r3.K(r4, r5, r6)
            java.util.Vector r5 = new java.util.Vector
            r5.<init>()
            int r7 = r4.length
            r0 = 0
        L34:
            if (r0 < r7) goto L4a
            r3.j(r4)
            int r7 = r4.length
            int r7 = r7 - r6
            r4 = r4[r7]
            r3.h(r4)
            int r4 = r5.size()
            com.sun.mail.imap.protocol.v[] r4 = new com.sun.mail.imap.protocol.v[r4]
            r5.copyInto(r4)
            return r4
        L4a:
            r1 = r4[r0]
            if (r1 == 0) goto L62
            boolean r2 = r1 instanceof com.sun.mail.imap.protocol.f
            if (r2 != 0) goto L53
            goto L62
        L53:
            com.sun.mail.imap.protocol.f r1 = (com.sun.mail.imap.protocol.f) r1
            java.lang.Class<com.sun.mail.imap.protocol.v> r2 = com.sun.mail.imap.protocol.v.class
            com.sun.mail.imap.protocol.l r1 = r1.J(r2)
            com.sun.mail.imap.protocol.v r1 = (com.sun.mail.imap.protocol.v) r1
            if (r1 == 0) goto L62
            r5.addElement(r1)
        L62:
            int r0 = r0 + 1
            goto L34
    }

    public com.sun.mail.imap.protocol.v[] W(long[] r8) throws com.sun.mail.iap.ProtocolException {
            r7 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            int r3 = r8.length
            if (r2 < r3) goto L4c
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "UID"
            r3 = 1
            com.sun.mail.iap.g[] r4 = r7.K(r8, r0, r3)
            java.util.Vector r5 = new java.util.Vector
            r5.<init>()
            int r6 = r4.length
        L1b:
            if (r1 < r6) goto L31
            r7.j(r4)
            int r8 = r4.length
            int r8 = r8 - r3
            r8 = r4[r8]
            r7.h(r8)
            int r8 = r5.size()
            com.sun.mail.imap.protocol.v[] r8 = new com.sun.mail.imap.protocol.v[r8]
            r5.copyInto(r8)
            return r8
        L31:
            r8 = r4[r1]
            if (r8 == 0) goto L49
            boolean r0 = r8 instanceof com.sun.mail.imap.protocol.f
            if (r0 != 0) goto L3a
            goto L49
        L3a:
            com.sun.mail.imap.protocol.f r8 = (com.sun.mail.imap.protocol.f) r8
            java.lang.Class<com.sun.mail.imap.protocol.v> r0 = com.sun.mail.imap.protocol.v.class
            com.sun.mail.imap.protocol.l r8 = r8.J(r0)
            com.sun.mail.imap.protocol.v r8 = (com.sun.mail.imap.protocol.v) r8
            if (r8 == 0) goto L49
            r5.addElement(r8)
        L49:
            int r1 = r1 + 1
            goto L1b
        L4c:
            if (r2 <= 0) goto L53
            java.lang.String r3 = ","
            r0.append(r3)
        L53:
            r3 = r8[r2]
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.append(r3)
            int r2 = r2 + 1
            goto L7
    }

    public com.sun.mail.imap.protocol.v X(int r4) throws com.sun.mail.iap.ProtocolException {
            r3 = this;
            java.lang.String r0 = "UID"
            com.sun.mail.iap.g[] r0 = r3.J(r4, r0)
            r3.j(r0)
            int r1 = r0.length
            int r1 = r1 + (-1)
            r1 = r0[r1]
            boolean r2 = r1.h()
            if (r2 == 0) goto L1d
            java.lang.Class<com.sun.mail.imap.protocol.v> r1 = com.sun.mail.imap.protocol.v.class
            com.sun.mail.imap.protocol.l r4 = com.sun.mail.imap.protocol.f.K(r0, r4, r1)
            com.sun.mail.imap.protocol.v r4 = (com.sun.mail.imap.protocol.v) r4
            return r4
        L1d:
            boolean r4 = r1.g()
            r0 = 0
            if (r4 == 0) goto L25
            return r0
        L25:
            r3.h(r1)
            return r0
    }

    public com.sun.mail.imap.a[] Y(java.lang.String r11) throws com.sun.mail.iap.ProtocolException {
            r10 = this;
            java.lang.String r0 = "ACL"
            boolean r1 = r10.e0(r0)
            if (r1 == 0) goto L73
            java.lang.String r11 = com.sun.mail.imap.protocol.b.a(r11)
            com.sun.mail.iap.b r1 = new com.sun.mail.iap.b
            r1.<init>()
            r1.o(r11)
            java.lang.String r11 = "GETACL"
            com.sun.mail.iap.g[] r11 = r10.b(r11, r1)
            int r1 = r11.length
            int r1 = r1 + (-1)
            r1 = r11[r1]
            java.util.Vector r2 = new java.util.Vector
            r2.<init>()
            boolean r3 = r1.h()
            if (r3 == 0) goto L63
            int r3 = r11.length
            r4 = 0
        L2c:
            if (r4 < r3) goto L2f
            goto L63
        L2f:
            r5 = r11[r4]
            boolean r6 = r5 instanceof com.sun.mail.imap.protocol.i
            if (r6 != 0) goto L36
            goto L60
        L36:
            com.sun.mail.imap.protocol.i r5 = (com.sun.mail.imap.protocol.i) r5
            boolean r6 = r5.F(r0)
            if (r6 == 0) goto L60
            r5.q()
        L41:
            java.lang.String r6 = r5.q()
            if (r6 != 0) goto L48
            goto L4e
        L48:
            java.lang.String r7 = r5.q()
            if (r7 != 0) goto L52
        L4e:
            r5 = 0
            r11[r4] = r5
            goto L60
        L52:
            com.sun.mail.imap.a r8 = new com.sun.mail.imap.a
            com.sun.mail.imap.n r9 = new com.sun.mail.imap.n
            r9.<init>(r7)
            r8.<init>(r6, r9)
            r2.addElement(r8)
            goto L41
        L60:
            int r4 = r4 + 1
            goto L2c
        L63:
            r10.j(r11)
            r10.h(r1)
            int r11 = r2.size()
            com.sun.mail.imap.a[] r11 = new com.sun.mail.imap.a[r11]
            r2.copyInto(r11)
            return r11
        L73:
            com.sun.mail.iap.BadCommandException r11 = new com.sun.mail.iap.BadCommandException
            java.lang.String r0 = "ACL not supported"
            r11.<init>(r0)
            throw r11
    }

    public java.util.Map a0() {
            r1 = this;
            java.util.Map r0 = r1.t
            return r0
    }

    java.io.OutputStream b0() {
            r1 = this;
            java.io.OutputStream r0 = r1.e()
            return r0
    }

    @Override // com.sun.mail.iap.f
    public void c() {
            r1 = this;
            super.c()
            r0 = 0
            r1.s = r0
            return
    }

    public javax.mail.Quota[] c0(java.lang.String r8) throws com.sun.mail.iap.ProtocolException {
            r7 = this;
            java.lang.String r0 = "QUOTA"
            boolean r1 = r7.e0(r0)
            if (r1 == 0) goto L57
            com.sun.mail.iap.b r1 = new com.sun.mail.iap.b
            r1.<init>()
            r1.o(r8)
            java.lang.String r8 = "GETQUOTA"
            com.sun.mail.iap.g[] r8 = r7.b(r8, r1)
            java.util.Vector r1 = new java.util.Vector
            r1.<init>()
            int r2 = r8.length
            int r2 = r2 + (-1)
            r2 = r8[r2]
            boolean r3 = r2.h()
            if (r3 == 0) goto L47
            int r3 = r8.length
            r4 = 0
        L28:
            if (r4 < r3) goto L2b
            goto L47
        L2b:
            r5 = r8[r4]
            boolean r6 = r5 instanceof com.sun.mail.imap.protocol.i
            if (r6 != 0) goto L32
            goto L44
        L32:
            com.sun.mail.imap.protocol.i r5 = (com.sun.mail.imap.protocol.i) r5
            boolean r6 = r5.F(r0)
            if (r6 == 0) goto L44
            javax.mail.Quota r5 = r7.t0(r5)
            r1.addElement(r5)
            r5 = 0
            r8[r4] = r5
        L44:
            int r4 = r4 + 1
            goto L28
        L47:
            r7.j(r8)
            r7.h(r2)
            int r8 = r1.size()
            javax.mail.Quota[] r8 = new javax.mail.Quota[r8]
            r1.copyInto(r8)
            return r8
        L57:
            com.sun.mail.iap.BadCommandException r8 = new com.sun.mail.iap.BadCommandException
            java.lang.String r0 = "QUOTA not supported"
            r8.<init>(r0)
            throw r8
    }

    public javax.mail.Quota[] d0(java.lang.String r11) throws com.sun.mail.iap.ProtocolException {
            r10 = this;
            java.lang.String r0 = "QUOTA"
            boolean r1 = r10.e0(r0)
            if (r1 == 0) goto L95
            java.lang.String r11 = com.sun.mail.imap.protocol.b.a(r11)
            com.sun.mail.iap.b r1 = new com.sun.mail.iap.b
            r1.<init>()
            r1.o(r11)
            java.lang.String r11 = "GETQUOTAROOT"
            com.sun.mail.iap.g[] r11 = r10.b(r11, r1)
            int r1 = r11.length
            int r1 = r1 + (-1)
            r1 = r11[r1]
            java.util.Hashtable r2 = new java.util.Hashtable
            r2.<init>()
            boolean r3 = r1.h()
            r4 = 0
            if (r3 == 0) goto L73
            int r3 = r11.length
            r5 = 0
        L2d:
            if (r5 < r3) goto L30
            goto L73
        L30:
            r6 = r11[r5]
            boolean r7 = r6 instanceof com.sun.mail.imap.protocol.i
            if (r7 != 0) goto L37
            goto L70
        L37:
            com.sun.mail.imap.protocol.i r6 = (com.sun.mail.imap.protocol.i) r6
            java.lang.String r7 = "QUOTAROOT"
            boolean r7 = r6.F(r7)
            r8 = 0
            if (r7 == 0) goto L57
            r6.q()
        L45:
            java.lang.String r7 = r6.q()
            if (r7 != 0) goto L4e
            r11[r5] = r8
            goto L70
        L4e:
            javax.mail.Quota r9 = new javax.mail.Quota
            r9.<init>(r7)
            r2.put(r7, r9)
            goto L45
        L57:
            boolean r7 = r6.F(r0)
            if (r7 == 0) goto L70
            javax.mail.Quota r6 = r10.t0(r6)
            java.lang.String r7 = r6.quotaRoot
            java.lang.Object r7 = r2.get(r7)
            javax.mail.Quota r7 = (javax.mail.Quota) r7
            java.lang.String r7 = r6.quotaRoot
            r2.put(r7, r6)
            r11[r5] = r8
        L70:
            int r5 = r5 + 1
            goto L2d
        L73:
            r10.j(r11)
            r10.h(r1)
            int r11 = r2.size()
            javax.mail.Quota[] r11 = new javax.mail.Quota[r11]
            java.util.Enumeration r0 = r2.elements()
        L83:
            boolean r1 = r0.hasMoreElements()
            if (r1 != 0) goto L8a
            return r11
        L8a:
            java.lang.Object r1 = r0.nextElement()
            javax.mail.Quota r1 = (javax.mail.Quota) r1
            r11[r4] = r1
            int r4 = r4 + 1
            goto L83
        L95:
            com.sun.mail.iap.BadCommandException r11 = new com.sun.mail.iap.BadCommandException
            java.lang.String r0 = "GETQUOTAROOT not supported"
            r11.<init>(r0)
            throw r11
    }

    public void delete(java.lang.String r2) throws com.sun.mail.iap.ProtocolException {
            r1 = this;
            java.lang.String r2 = com.sun.mail.imap.protocol.b.a(r2)
            com.sun.mail.iap.b r0 = new com.sun.mail.iap.b
            r0.<init>()
            r0.o(r2)
            java.lang.String r2 = "DELETE"
            r1.n(r2, r0)
            return
    }

    public boolean e0(java.lang.String r3) {
            r2 = this;
            java.util.Map r0 = r2.t
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r3 = r3.toUpperCase(r1)
            boolean r3 = r0.containsKey(r3)
            return r3
    }

    @Override // com.sun.mail.iap.f
    protected com.sun.mail.iap.d f() {
            r2 = this;
            com.sun.mail.iap.d r0 = r2.y
            r1 = 0
            r2.y = r1
            return r0
    }

    public void f0() throws com.sun.mail.iap.ProtocolException {
            r2 = this;
            java.io.OutputStream r0 = r2.e()
            byte[] r1 = com.sun.mail.imap.protocol.h.B     // Catch: java.io.IOException -> Lc
            r0.write(r1)     // Catch: java.io.IOException -> Lc
            r0.flush()     // Catch: java.io.IOException -> Lc
        Lc:
            return
    }

    public synchronized void g0() throws com.sun.mail.iap.ProtocolException {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "IDLE"
            boolean r0 = r2.e0(r0)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L31
            java.lang.String r0 = "IDLE"
            r1 = 0
            java.lang.String r0 = r2.q(r0, r1)     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19 com.sun.mail.iap.LiteralException -> L1b
            r2.z = r0     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19 com.sun.mail.iap.LiteralException -> L1b
            com.sun.mail.iap.g r0 = r2.l()     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19 com.sun.mail.iap.LiteralException -> L1b
            goto L26
        L17:
            r0 = move-exception
            goto L39
        L19:
            r0 = move-exception
            goto L1d
        L1b:
            r0 = move-exception
            goto L22
        L1d:
            com.sun.mail.iap.g r0 = com.sun.mail.iap.g.a(r0)     // Catch: java.lang.Throwable -> L17
            goto L26
        L22:
            com.sun.mail.iap.g r0 = r0.getResponse()     // Catch: java.lang.Throwable -> L17
        L26:
            boolean r1 = r0.f()     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L2f
            r2.h(r0)     // Catch: java.lang.Throwable -> L17
        L2f:
            monitor-exit(r2)
            return
        L31:
            com.sun.mail.iap.BadCommandException r0 = new com.sun.mail.iap.BadCommandException     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "IDLE not supported"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L17
            throw r0     // Catch: java.lang.Throwable -> L17
        L39:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
    }

    public boolean h0() {
            r1 = this;
            boolean r0 = r1.s
            return r0
    }

    public boolean i0() {
            r1 = this;
            boolean r0 = r1.r
            return r0
    }

    @Override // com.sun.mail.iap.f
    protected void k(com.sun.mail.iap.g r3) throws com.sun.mail.iap.ProtocolException {
            r2 = this;
            super.k(r3)
            boolean r0 = r3.h()
            if (r0 == 0) goto Ld
            r2.H0(r3)
            return
        Ld:
            r0 = r3
            com.sun.mail.imap.protocol.i r0 = (com.sun.mail.imap.protocol.i) r0
            java.lang.String r1 = "PREAUTH"
            boolean r0 = r0.F(r1)
            if (r0 == 0) goto L1f
            r0 = 1
            r2.s = r0
            r2.H0(r3)
            return
        L1f:
            com.sun.mail.iap.ConnectionException r0 = new com.sun.mail.iap.ConnectionException
            r0.<init>(r2, r3)
            throw r0
    }

    public com.sun.mail.imap.protocol.m[] k0(java.lang.String r2, java.lang.String r3) throws com.sun.mail.iap.ProtocolException {
            r1 = this;
            java.lang.String r0 = "LIST"
            com.sun.mail.imap.protocol.m[] r2 = r1.F(r0, r2, r3)
            return r2
    }

    @Override // com.sun.mail.iap.f
    public com.sun.mail.iap.g l() throws java.io.IOException, com.sun.mail.iap.ProtocolException {
            r1 = this;
            com.sun.mail.imap.protocol.i r0 = com.sun.mail.imap.protocol.i.G(r1)
            return r0
    }

    public com.sun.mail.imap.n[] l0(java.lang.String r8, java.lang.String r9) throws com.sun.mail.iap.ProtocolException {
            r7 = this;
            java.lang.String r0 = "ACL"
            boolean r0 = r7.e0(r0)
            if (r0 == 0) goto L6d
            java.lang.String r8 = com.sun.mail.imap.protocol.b.a(r8)
            com.sun.mail.iap.b r0 = new com.sun.mail.iap.b
            r0.<init>()
            r0.o(r8)
            r0.o(r9)
            java.lang.String r8 = "LISTRIGHTS"
            com.sun.mail.iap.g[] r9 = r7.b(r8, r0)
            int r0 = r9.length
            int r0 = r0 + (-1)
            r0 = r9[r0]
            java.util.Vector r1 = new java.util.Vector
            r1.<init>()
            boolean r2 = r0.h()
            if (r2 == 0) goto L5d
            int r2 = r9.length
            r3 = 0
        L2f:
            if (r3 < r2) goto L32
            goto L5d
        L32:
            r4 = r9[r3]
            boolean r5 = r4 instanceof com.sun.mail.imap.protocol.i
            if (r5 != 0) goto L39
            goto L5a
        L39:
            com.sun.mail.imap.protocol.i r4 = (com.sun.mail.imap.protocol.i) r4
            boolean r5 = r4.F(r8)
            if (r5 == 0) goto L5a
            r4.q()
            r4.q()
        L47:
            java.lang.String r5 = r4.q()
            if (r5 != 0) goto L51
            r4 = 0
            r9[r3] = r4
            goto L5a
        L51:
            com.sun.mail.imap.n r6 = new com.sun.mail.imap.n
            r6.<init>(r5)
            r1.addElement(r6)
            goto L47
        L5a:
            int r3 = r3 + 1
            goto L2f
        L5d:
            r7.j(r9)
            r7.h(r0)
            int r8 = r1.size()
            com.sun.mail.imap.n[] r8 = new com.sun.mail.imap.n[r8]
            r1.copyInto(r8)
            return r8
        L6d:
            com.sun.mail.iap.BadCommandException r8 = new com.sun.mail.iap.BadCommandException
            java.lang.String r9 = "ACL not supported"
            r8.<init>(r9)
            throw r8
    }

    public void m0(java.lang.String r2, java.lang.String r3) throws com.sun.mail.iap.ProtocolException {
            r1 = this;
            com.sun.mail.iap.b r0 = new com.sun.mail.iap.b
            r0.<init>()
            r0.o(r2)
            r0.o(r3)
            java.lang.String r2 = "LOGIN"
            com.sun.mail.iap.g[] r2 = r1.b(r2, r0)
            r1.j(r2)
            int r3 = r2.length
            r0 = 1
            int r3 = r3 - r0
            r3 = r2[r3]
            r1.h(r3)
            int r3 = r2.length
            int r3 = r3 - r0
            r2 = r2[r3]
            r1.H0(r2)
            r1.s = r0
            return
    }

    public void n0() throws com.sun.mail.iap.ProtocolException {
            r2 = this;
            java.lang.String r0 = "LOGOUT"
            r1 = 0
            com.sun.mail.iap.g[] r0 = r2.b(r0, r1)
            r1 = 0
            r2.s = r1
            r2.j(r0)
            r2.c()
            return
    }

    public com.sun.mail.imap.protocol.m[] o0(java.lang.String r2, java.lang.String r3) throws com.sun.mail.iap.ProtocolException {
            r1 = this;
            java.lang.String r0 = "LSUB"
            com.sun.mail.imap.protocol.m[] r2 = r1.F(r0, r2, r3)
            return r2
    }

    @Override // com.sun.mail.iap.f
    protected boolean p() {
            r1 = this;
            java.lang.String r0 = "LITERAL+"
            boolean r0 = r1.e0(r0)
            return r0
    }

    public com.sun.mail.imap.n p0(java.lang.String r9) throws com.sun.mail.iap.ProtocolException {
            r8 = this;
            java.lang.String r0 = "ACL"
            boolean r0 = r8.e0(r0)
            if (r0 == 0) goto L56
            java.lang.String r9 = com.sun.mail.imap.protocol.b.a(r9)
            com.sun.mail.iap.b r0 = new com.sun.mail.iap.b
            r0.<init>()
            r0.o(r9)
            java.lang.String r9 = "MYRIGHTS"
            com.sun.mail.iap.g[] r0 = r8.b(r9, r0)
            int r1 = r0.length
            int r1 = r1 + (-1)
            r1 = r0[r1]
            boolean r2 = r1.h()
            r3 = 0
            if (r2 == 0) goto L4f
            int r2 = r0.length
            r4 = 0
            r5 = r3
        L29:
            if (r4 < r2) goto L2d
            r3 = r5
            goto L4f
        L2d:
            r6 = r0[r4]
            boolean r7 = r6 instanceof com.sun.mail.imap.protocol.i
            if (r7 != 0) goto L34
            goto L4c
        L34:
            com.sun.mail.imap.protocol.i r6 = (com.sun.mail.imap.protocol.i) r6
            boolean r7 = r6.F(r9)
            if (r7 == 0) goto L4c
            r6.q()
            java.lang.String r6 = r6.q()
            if (r5 != 0) goto L4a
            com.sun.mail.imap.n r5 = new com.sun.mail.imap.n
            r5.<init>(r6)
        L4a:
            r0[r4] = r3
        L4c:
            int r4 = r4 + 1
            goto L29
        L4f:
            r8.j(r0)
            r8.h(r1)
            return r3
        L56:
            com.sun.mail.iap.BadCommandException r9 = new com.sun.mail.iap.BadCommandException
            java.lang.String r0 = "ACL not supported"
            r9.<init>(r0)
            throw r9
    }

    public com.sun.mail.imap.protocol.p q0() throws com.sun.mail.iap.ProtocolException {
            r9 = this;
            java.lang.String r0 = "NAMESPACE"
            boolean r1 = r9.e0(r0)
            if (r1 == 0) goto L41
            r1 = 0
            com.sun.mail.iap.g[] r2 = r9.b(r0, r1)
            int r3 = r2.length
            int r3 = r3 + (-1)
            r3 = r2[r3]
            boolean r4 = r3.h()
            if (r4 == 0) goto L3a
            int r4 = r2.length
            r5 = 0
            r6 = r1
        L1b:
            if (r5 < r4) goto L1f
            r1 = r6
            goto L3a
        L1f:
            r7 = r2[r5]
            boolean r8 = r7 instanceof com.sun.mail.imap.protocol.i
            if (r8 != 0) goto L26
            goto L37
        L26:
            com.sun.mail.imap.protocol.i r7 = (com.sun.mail.imap.protocol.i) r7
            boolean r8 = r7.F(r0)
            if (r8 == 0) goto L37
            if (r6 != 0) goto L35
            com.sun.mail.imap.protocol.p r6 = new com.sun.mail.imap.protocol.p
            r6.<init>(r7)
        L35:
            r2[r5] = r1
        L37:
            int r5 = r5 + 1
            goto L1b
        L3a:
            r9.j(r2)
            r9.h(r3)
            return r1
        L41:
            com.sun.mail.iap.BadCommandException r0 = new com.sun.mail.iap.BadCommandException
            java.lang.String r1 = "NAMESPACE not supported"
            r0.<init>(r1)
            throw r0
    }

    public void r(java.lang.String r7, javax.mail.Flags r8, java.util.Date r9, com.sun.mail.iap.e r10) throws com.sun.mail.iap.ProtocolException {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.t(r1, r2, r3, r4, r5)
            return
    }

    public void r0() throws com.sun.mail.iap.ProtocolException {
            r2 = this;
            boolean r0 = r2.c
            if (r0 == 0) goto L9
            java.io.PrintStream r0 = r2.e
            r0.getClass()
        L9:
            java.lang.String r0 = "NOOP"
            r1 = 0
            r2.n(r0, r1)
            return
    }

    public com.sun.mail.imap.b s(java.lang.String r7, javax.mail.Flags r8, java.util.Date r9, com.sun.mail.iap.e r10) throws com.sun.mail.iap.ProtocolException {
            r6 = this;
            r5 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            com.sun.mail.imap.b r7 = r0.t(r1, r2, r3, r4, r5)
            return r7
    }

    protected void s0(com.sun.mail.iap.g r8) {
            r7 = this;
        L0:
            r0 = 93
            java.lang.String r1 = r8.p(r0)
            if (r1 != 0) goto L9
            goto L15
        L9:
            int r2 = r1.length()
            if (r2 != 0) goto L1a
            byte r1 = r8.n()
            if (r1 != r0) goto L16
        L15:
            return
        L16:
            r8.C()
            goto L0
        L1a:
            java.util.Map r0 = r7.t
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r2 = r1.toUpperCase(r2)
            r0.put(r2, r1)
            r5 = 0
            r6 = 5
            r2 = 1
            r3 = 0
            java.lang.String r4 = "AUTH="
            boolean r0 = r1.regionMatches(r2, r3, r4, r5, r6)
            if (r0 == 0) goto L0
            java.util.List r0 = r7.u
            r2 = 5
            java.lang.String r3 = r1.substring(r2)
            r0.add(r3)
            boolean r0 = r7.c
            if (r0 == 0) goto L0
            java.io.PrintStream r0 = r7.e
            r1.substring(r2)
            r0.getClass()
            goto L0
    }

    public com.sun.mail.imap.b t(java.lang.String r3, javax.mail.Flags r4, java.util.Date r5, com.sun.mail.iap.e r6, boolean r7) throws com.sun.mail.iap.ProtocolException {
            r2 = this;
            java.lang.String r3 = com.sun.mail.imap.protocol.b.a(r3)
            com.sun.mail.iap.b r0 = new com.sun.mail.iap.b
            r0.<init>()
            r0.o(r3)
            if (r4 == 0) goto L26
            javax.mail.Flags$Flag r3 = javax.mail.Flags.Flag.RECENT
            boolean r1 = r4.contains(r3)
            if (r1 == 0) goto L1f
            javax.mail.Flags r1 = new javax.mail.Flags
            r1.<init>(r4)
            r1.remove(r3)
            r4 = r1
        L1f:
            java.lang.String r3 = r2.D(r4)
            r0.i(r3)
        L26:
            if (r5 == 0) goto L2f
            java.lang.String r3 = com.sun.mail.imap.protocol.k.a(r5)
            r0.o(r3)
        L2f:
            r0.j(r6)
            java.lang.String r3 = "APPEND"
            com.sun.mail.iap.g[] r3 = r2.b(r3, r0)
            r2.j(r3)
            int r4 = r3.length
            int r4 = r4 + (-1)
            r4 = r3[r4]
            r2.h(r4)
            if (r7 == 0) goto L4f
            int r4 = r3.length
            int r4 = r4 + (-1)
            r3 = r3[r4]
            com.sun.mail.imap.b r3 = r2.Z(r3)
            return r3
        L4f:
            r3 = 0
            return r3
    }

    public synchronized void u(java.lang.String r12, java.lang.String r13) throws com.sun.mail.iap.ProtocolException {
            r11 = this;
            monitor-enter(r11)
            java.util.Vector r0 = new java.util.Vector     // Catch: java.lang.Throwable -> L14
            r0.<init>()     // Catch: java.lang.Throwable -> L14
            r1 = 0
            r2 = 0
            r3 = 1
            java.lang.String r4 = "AUTHENTICATE LOGIN"
            java.lang.String r4 = r11.q(r4, r2)     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L17
            r5 = r4
            r4 = r2
            r2 = r5
            r5 = 0
            goto L1d
        L14:
            r12 = move-exception
            goto L98
        L17:
            r4 = move-exception
            com.sun.mail.iap.g r4 = com.sun.mail.iap.g.a(r4)     // Catch: java.lang.Throwable -> L14
            r5 = 1
        L1d:
            java.io.OutputStream r6 = r11.e()     // Catch: java.lang.Throwable -> L14
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L14
            r7.<init>()     // Catch: java.lang.Throwable -> L14
            com.sun.mail.util.BASE64EncoderStream r8 = new com.sun.mail.util.BASE64EncoderStream     // Catch: java.lang.Throwable -> L14
            r9 = 2147483647(0x7fffffff, float:NaN)
            r8.<init>(r7, r9)     // Catch: java.lang.Throwable -> L14
            r9 = 1
        L2f:
            if (r5 == 0) goto L47
            int r12 = r0.size()     // Catch: java.lang.Throwable -> L14
            com.sun.mail.iap.g[] r12 = new com.sun.mail.iap.g[r12]     // Catch: java.lang.Throwable -> L14
            r0.copyInto(r12)     // Catch: java.lang.Throwable -> L14
            r11.j(r12)     // Catch: java.lang.Throwable -> L14
            r11.h(r4)     // Catch: java.lang.Throwable -> L14
            r11.H0(r4)     // Catch: java.lang.Throwable -> L14
            r11.s = r3     // Catch: java.lang.Throwable -> L14
            monitor-exit(r11)
            return
        L47:
            com.sun.mail.iap.g r4 = r11.l()     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L74
            boolean r10 = r4.f()     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L74
            if (r10 == 0) goto L76
            if (r9 == 0) goto L56
            r10 = r12
            r9 = 0
            goto L57
        L56:
            r10 = r13
        L57:
            byte[] r10 = com.sun.mail.util.ASCIIUtility.getBytes(r10)     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L74
            r8.write(r10)     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L74
            r8.flush()     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L74
            byte[] r10 = com.sun.mail.imap.protocol.h.A     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L74
            r7.write(r10)     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L74
            byte[] r10 = r7.toByteArray()     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L74
            r6.write(r10)     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L74
            r6.flush()     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L74
            r7.reset()     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L74
            goto L2f
        L74:
            r4 = move-exception
            goto L93
        L76:
            boolean r10 = r4.j()     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L74
            if (r10 == 0) goto L88
            java.lang.String r10 = r4.c()     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L74
            boolean r10 = r10.equals(r2)     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L74
            if (r10 == 0) goto L88
        L86:
            r5 = 1
            goto L2f
        L88:
            boolean r10 = r4.e()     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L74
            if (r10 == 0) goto L8f
            goto L86
        L8f:
            r0.addElement(r4)     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L74
            goto L2f
        L93:
            com.sun.mail.iap.g r4 = com.sun.mail.iap.g.a(r4)     // Catch: java.lang.Throwable -> L14
            goto L86
        L98:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L14
            throw r12
    }

    public com.sun.mail.imap.protocol.c u0(int r2, java.lang.String r3) throws com.sun.mail.iap.ProtocolException {
            r1 = this;
            r0 = 1
            com.sun.mail.imap.protocol.c r2 = r1.Q(r2, r3, r0)
            return r2
    }

    public synchronized void v(java.lang.String r12, java.lang.String r13, java.lang.String r14) throws com.sun.mail.iap.ProtocolException {
            r11 = this;
            monitor-enter(r11)
            java.util.Vector r0 = new java.util.Vector     // Catch: java.lang.Throwable -> L13
            r0.<init>()     // Catch: java.lang.Throwable -> L13
            r1 = 0
            r2 = 1
            java.lang.String r3 = "AUTHENTICATE PLAIN"
            java.lang.String r3 = r11.q(r3, r1)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L16
            r4 = 0
            r10 = r3
            r3 = r1
            r1 = r10
            goto L1c
        L13:
            r12 = move-exception
            goto Lad
        L16:
            r3 = move-exception
            com.sun.mail.iap.g r3 = com.sun.mail.iap.g.a(r3)     // Catch: java.lang.Throwable -> L13
            r4 = 1
        L1c:
            java.io.OutputStream r5 = r11.e()     // Catch: java.lang.Throwable -> L13
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L13
            r6.<init>()     // Catch: java.lang.Throwable -> L13
            com.sun.mail.util.BASE64EncoderStream r7 = new com.sun.mail.util.BASE64EncoderStream     // Catch: java.lang.Throwable -> L13
            r8 = 2147483647(0x7fffffff, float:NaN)
            r7.<init>(r6, r8)     // Catch: java.lang.Throwable -> L13
        L2d:
            if (r4 == 0) goto L45
            int r12 = r0.size()     // Catch: java.lang.Throwable -> L13
            com.sun.mail.iap.g[] r12 = new com.sun.mail.iap.g[r12]     // Catch: java.lang.Throwable -> L13
            r0.copyInto(r12)     // Catch: java.lang.Throwable -> L13
            r11.j(r12)     // Catch: java.lang.Throwable -> L13
            r11.h(r3)     // Catch: java.lang.Throwable -> L13
            r11.H0(r3)     // Catch: java.lang.Throwable -> L13
            r11.s = r2     // Catch: java.lang.Throwable -> L13
            monitor-exit(r11)
            return
        L45:
            com.sun.mail.iap.g r3 = r11.l()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L89
            boolean r8 = r3.f()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L89
            if (r8 == 0) goto L8b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L89
            java.lang.String r9 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L89
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L89
            java.lang.String r9 = "\u0000"
            r8.append(r9)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L89
            r8.append(r13)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L89
            java.lang.String r9 = "\u0000"
            r8.append(r9)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L89
            r8.append(r14)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L89
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L89
            byte[] r8 = com.sun.mail.util.ASCIIUtility.getBytes(r8)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L89
            r7.write(r8)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L89
            r7.flush()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L89
            byte[] r8 = com.sun.mail.imap.protocol.h.A     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L89
            r6.write(r8)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L89
            byte[] r8 = r6.toByteArray()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L89
            r5.write(r8)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L89
            r5.flush()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L89
            r6.reset()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L89
            goto L2d
        L89:
            r3 = move-exception
            goto La8
        L8b:
            boolean r8 = r3.j()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L89
            if (r8 == 0) goto L9d
            java.lang.String r8 = r3.c()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L89
            boolean r8 = r8.equals(r1)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L89
            if (r8 == 0) goto L9d
        L9b:
            r4 = 1
            goto L2d
        L9d:
            boolean r8 = r3.e()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L89
            if (r8 == 0) goto La4
            goto L9b
        La4:
            r0.addElement(r3)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L89
            goto L2d
        La8:
            com.sun.mail.iap.g r3 = com.sun.mail.iap.g.a(r3)     // Catch: java.lang.Throwable -> L13
            goto L9b
        Lad:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L13
            throw r12
    }

    public com.sun.mail.imap.protocol.c v0(int r8, java.lang.String r9, int r10, int r11) throws com.sun.mail.iap.ProtocolException {
            r7 = this;
            r5 = 1
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            com.sun.mail.imap.protocol.c r8 = r0.P(r1, r2, r3, r4, r5, r6)
            return r8
    }

    public void w() throws com.sun.mail.iap.ProtocolException {
            r6 = this;
            r0 = 0
            java.lang.String r1 = "CAPABILITY"
            com.sun.mail.iap.g[] r0 = r6.b(r1, r0)
            int r2 = r0.length
            int r2 = r2 + (-1)
            r2 = r0[r2]
            boolean r2 = r2.h()
            if (r2 == 0) goto L3d
            java.util.HashMap r2 = new java.util.HashMap
            r3 = 10
            r2.<init>(r3)
            r6.t = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 5
            r2.<init>(r3)
            r6.u = r2
            int r2 = r0.length
            r3 = 0
        L25:
            if (r3 < r2) goto L28
            return
        L28:
            r4 = r0[r3]
            boolean r5 = r4 instanceof com.sun.mail.imap.protocol.i
            if (r5 != 0) goto L2f
            goto L3a
        L2f:
            com.sun.mail.imap.protocol.i r4 = (com.sun.mail.imap.protocol.i) r4
            boolean r5 = r4.F(r1)
            if (r5 == 0) goto L3a
            r6.s0(r4)
        L3a:
            int r3 = r3 + 1
            goto L25
        L3d:
            com.sun.mail.iap.ProtocolException r1 = new com.sun.mail.iap.ProtocolException
            int r2 = r0.length
            int r2 = r2 + (-1)
            r0 = r0[r2]
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public com.sun.mail.imap.protocol.c w0(int r8, java.lang.String r9, int r10, int r11, com.sun.mail.iap.d r12) throws com.sun.mail.iap.ProtocolException {
            r7 = this;
            r5 = 1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            com.sun.mail.imap.protocol.c r8 = r0.P(r1, r2, r3, r4, r5, r6)
            return r8
    }

    public void x() throws com.sun.mail.iap.ProtocolException {
            r2 = this;
            java.lang.String r0 = "CHECK"
            r1 = 0
            r2.n(r0, r1)
            return
    }

    public boolean x0(com.sun.mail.iap.g r5) throws com.sun.mail.iap.ProtocolException {
            r4 = this;
            r0 = 1
            com.sun.mail.iap.g[] r1 = new com.sun.mail.iap.g[r0]
            r2 = 0
            r1[r2] = r5
            r4.j(r1)
            boolean r1 = r5.e()
            boolean r2 = r5.j()
            if (r2 == 0) goto L20
            java.lang.String r2 = r5.c()
            java.lang.String r3 = r4.z
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L20
            r1 = 1
        L20:
            if (r1 == 0) goto L25
            r2 = 0
            r4.z = r2
        L25:
            r4.h(r5)
            r5 = r1 ^ 1
            return r5
    }

    public void y() throws com.sun.mail.iap.ProtocolException {
            r2 = this;
            java.lang.String r0 = "CLOSE"
            r1 = 0
            r2.n(r0, r1)
            return
    }

    public void y0(java.lang.String r2) throws com.sun.mail.iap.ProtocolException {
            r1 = this;
            com.sun.mail.iap.b r0 = new com.sun.mail.iap.b
            r0.<init>()
            r0.o(r2)
            java.lang.String r2 = "PROXYAUTH"
            r1.n(r2, r0)
            return
    }

    public void z(int r2, int r3, java.lang.String r4) throws com.sun.mail.iap.ProtocolException {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.<init>(r2)
            java.lang.String r2 = ":"
            r0.append(r2)
            java.lang.String r2 = java.lang.String.valueOf(r3)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.A(r2, r4)
            return
    }

    public synchronized com.sun.mail.iap.g z0() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = r1.z     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto L8
            monitor-exit(r1)
            r0 = 0
            return r0
        L8:
            com.sun.mail.iap.g r0 = r1.l()     // Catch: java.lang.Throwable -> Ld com.sun.mail.iap.ProtocolException -> Lf java.io.IOException -> L15
            goto L1a
        Ld:
            r0 = move-exception
            goto L1c
        Lf:
            r0 = move-exception
            com.sun.mail.iap.g r0 = com.sun.mail.iap.g.a(r0)     // Catch: java.lang.Throwable -> Ld
            goto L1a
        L15:
            r0 = move-exception
            com.sun.mail.iap.g r0 = com.sun.mail.iap.g.a(r0)     // Catch: java.lang.Throwable -> Ld
        L1a:
            monitor-exit(r1)
            return r0
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }
}
