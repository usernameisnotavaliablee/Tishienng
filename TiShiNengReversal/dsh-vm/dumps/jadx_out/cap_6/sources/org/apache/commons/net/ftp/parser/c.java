package org.apache.commons.net.ftp.parser;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c implements org.apache.commons.net.ftp.parser.e {
    private static final java.lang.String a = "\\p{javaJavaIdentifierStart}(\\p{javaJavaIdentifierPart})*";
    private static final java.lang.String b = "(\\p{javaJavaIdentifierStart}(\\p{javaJavaIdentifierPart})*\\.)+\\p{javaJavaIdentifierStart}(\\p{javaJavaIdentifierPart})*";
    private static final java.util.regex.Pattern c = null;

    static {
            java.lang.String r0 = "(\\p{javaJavaIdentifierStart}(\\p{javaJavaIdentifierPart})*\\.)+\\p{javaJavaIdentifierStart}(\\p{javaJavaIdentifierPart})*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            org.apache.commons.net.ftp.parser.c.c = r0
            return
    }

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    private org.apache.commons.net.ftp.f c(java.lang.String r5, org.apache.commons.net.ftp.d r6) {
            r4 = this;
            java.lang.String r0 = "Error initializing parser"
            java.util.regex.Pattern r1 = org.apache.commons.net.ftp.parser.c.c
            java.util.regex.Matcher r1 = r1.matcher(r5)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L4b
            java.lang.Class r1 = java.lang.Class.forName(r5)     // Catch: java.lang.ClassNotFoundException -> L4b
            java.lang.Object r2 = r1.newInstance()     // Catch: java.lang.ExceptionInInitializerError -> L19 java.lang.Exception -> L1b java.lang.ClassCastException -> L1d
            org.apache.commons.net.ftp.f r2 = (org.apache.commons.net.ftp.f) r2     // Catch: java.lang.ExceptionInInitializerError -> L19 java.lang.Exception -> L1b java.lang.ClassCastException -> L1d
            goto L4c
        L19:
            r1 = move-exception
            goto L1f
        L1b:
            r1 = move-exception
            goto L25
        L1d:
            r0 = move-exception
            goto L2b
        L1f:
            org.apache.commons.net.ftp.parser.ParserInitializationException r2 = new org.apache.commons.net.ftp.parser.ParserInitializationException     // Catch: java.lang.ClassNotFoundException -> L4b
            r2.<init>(r0, r1)     // Catch: java.lang.ClassNotFoundException -> L4b
            throw r2     // Catch: java.lang.ClassNotFoundException -> L4b
        L25:
            org.apache.commons.net.ftp.parser.ParserInitializationException r2 = new org.apache.commons.net.ftp.parser.ParserInitializationException     // Catch: java.lang.ClassNotFoundException -> L4b
            r2.<init>(r0, r1)     // Catch: java.lang.ClassNotFoundException -> L4b
            throw r2     // Catch: java.lang.ClassNotFoundException -> L4b
        L2b:
            org.apache.commons.net.ftp.parser.ParserInitializationException r2 = new org.apache.commons.net.ftp.parser.ParserInitializationException     // Catch: java.lang.ClassNotFoundException -> L4b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L4b
            r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L4b
            java.lang.String r1 = r1.getName()     // Catch: java.lang.ClassNotFoundException -> L4b
            r3.append(r1)     // Catch: java.lang.ClassNotFoundException -> L4b
            java.lang.String r1 = " does not implement the interface "
            r3.append(r1)     // Catch: java.lang.ClassNotFoundException -> L4b
            java.lang.String r1 = "org.apache.commons.net.ftp.FTPFileEntryParser."
            r3.append(r1)     // Catch: java.lang.ClassNotFoundException -> L4b
            java.lang.String r1 = r3.toString()     // Catch: java.lang.ClassNotFoundException -> L4b
            r2.<init>(r1, r0)     // Catch: java.lang.ClassNotFoundException -> L4b
            throw r2     // Catch: java.lang.ClassNotFoundException -> L4b
        L4b:
            r2 = 0
        L4c:
            if (r2 != 0) goto L103
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r0 = r5.toUpperCase(r0)
            java.lang.String r1 = "UNIX_LTRIM"
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L64
            org.apache.commons.net.ftp.parser.p r2 = new org.apache.commons.net.ftp.parser.p
            r5 = 1
            r2.<init>(r6, r5)
            goto L103
        L64:
            java.lang.String r1 = "UNIX"
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L74
            org.apache.commons.net.ftp.parser.p r2 = new org.apache.commons.net.ftp.parser.p
            r5 = 0
            r2.<init>(r6, r5)
            goto L103
        L74:
            java.lang.String r1 = "VMS"
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L83
            org.apache.commons.net.ftp.parser.r r2 = new org.apache.commons.net.ftp.parser.r
            r2.<init>(r6)
            goto L103
        L83:
            java.lang.String r1 = "WINDOWS"
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L91
            org.apache.commons.net.ftp.f r2 = r4.f(r6)
            goto L103
        L91:
            java.lang.String r1 = "OS/2"
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L9f
            org.apache.commons.net.ftp.parser.m r2 = new org.apache.commons.net.ftp.parser.m
            r2.<init>(r6)
            goto L103
        L9f:
            java.lang.String r1 = "OS/400"
            int r1 = r0.indexOf(r1)
            if (r1 >= 0) goto Lff
            java.lang.String r1 = "AS/400"
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto Lb0
            goto Lff
        Lb0:
            java.lang.String r1 = "MVS"
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto Lbe
            org.apache.commons.net.ftp.parser.i r2 = new org.apache.commons.net.ftp.parser.i
            r2.<init>()
            goto L103
        Lbe:
            java.lang.String r1 = "NETWARE"
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto Lcc
            org.apache.commons.net.ftp.parser.l r2 = new org.apache.commons.net.ftp.parser.l
            r2.<init>(r6)
            goto L103
        Lcc:
            java.lang.String r1 = "MACOS PETER"
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto Lda
            org.apache.commons.net.ftp.parser.j r2 = new org.apache.commons.net.ftp.parser.j
            r2.<init>(r6)
            goto L103
        Lda:
            java.lang.String r1 = "TYPE: L8"
            int r0 = r0.indexOf(r1)
            if (r0 < 0) goto Le8
            org.apache.commons.net.ftp.parser.p r2 = new org.apache.commons.net.ftp.parser.p
            r2.<init>(r6)
            goto L103
        Le8:
            org.apache.commons.net.ftp.parser.ParserInitializationException r6 = new org.apache.commons.net.ftp.parser.ParserInitializationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown parser type: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        Lff:
            org.apache.commons.net.ftp.f r2 = r4.j(r6)
        L103:
            boolean r5 = r2 instanceof org.apache.commons.net.ftp.a
            if (r5 == 0) goto L10d
            r5 = r2
            org.apache.commons.net.ftp.a r5 = (org.apache.commons.net.ftp.a) r5
            r5.c(r6)
        L10d:
            return r2
    }

    private org.apache.commons.net.ftp.f f(org.apache.commons.net.ftp.d r8) {
            r7 = this;
            if (r8 == 0) goto L14
            java.lang.String r0 = "WINDOWS"
            java.lang.String r1 = r8.e()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L14
            org.apache.commons.net.ftp.parser.k r0 = new org.apache.commons.net.ftp.parser.k
            r0.<init>(r8)
            return r0
        L14:
            if (r8 == 0) goto L1c
            org.apache.commons.net.ftp.d r0 = new org.apache.commons.net.ftp.d
            r0.<init>(r8)
            goto L1d
        L1c:
            r0 = 0
        L1d:
            org.apache.commons.net.ftp.parser.a r1 = new org.apache.commons.net.ftp.parser.a
            org.apache.commons.net.ftp.parser.k r2 = new org.apache.commons.net.ftp.parser.k
            r2.<init>(r8)
            org.apache.commons.net.ftp.parser.p r8 = new org.apache.commons.net.ftp.parser.p
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L38
            java.lang.String r5 = "UNIX_LTRIM"
            java.lang.String r6 = r0.e()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L38
            r5 = 1
            goto L39
        L38:
            r5 = 0
        L39:
            r8.<init>(r0, r5)
            r0 = 2
            org.apache.commons.net.ftp.f[] r0 = new org.apache.commons.net.ftp.f[r0]
            r0[r3] = r2
            r0[r4] = r8
            r1.<init>(r0)
            return r1
    }

    private org.apache.commons.net.ftp.f j(org.apache.commons.net.ftp.d r8) {
            r7 = this;
            if (r8 == 0) goto L14
            java.lang.String r0 = "OS/400"
            java.lang.String r1 = r8.e()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L14
            org.apache.commons.net.ftp.parser.n r0 = new org.apache.commons.net.ftp.parser.n
            r0.<init>(r8)
            return r0
        L14:
            if (r8 == 0) goto L1c
            org.apache.commons.net.ftp.d r0 = new org.apache.commons.net.ftp.d
            r0.<init>(r8)
            goto L1d
        L1c:
            r0 = 0
        L1d:
            org.apache.commons.net.ftp.parser.a r1 = new org.apache.commons.net.ftp.parser.a
            org.apache.commons.net.ftp.parser.n r2 = new org.apache.commons.net.ftp.parser.n
            r2.<init>(r8)
            org.apache.commons.net.ftp.parser.p r8 = new org.apache.commons.net.ftp.parser.p
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L38
            java.lang.String r5 = "UNIX_LTRIM"
            java.lang.String r6 = r0.e()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L38
            r5 = 1
            goto L39
        L38:
            r5 = 0
        L39:
            r8.<init>(r0, r5)
            r0 = 2
            org.apache.commons.net.ftp.f[] r0 = new org.apache.commons.net.ftp.f[r0]
            r0[r3] = r2
            r0[r4] = r8
            r1.<init>(r0)
            return r1
    }

    @Override // org.apache.commons.net.ftp.parser.e
    public org.apache.commons.net.ftp.f a(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L8
            r0 = 0
            org.apache.commons.net.ftp.f r2 = r1.c(r2, r0)
            return r2
        L8:
            org.apache.commons.net.ftp.parser.ParserInitializationException r2 = new org.apache.commons.net.ftp.parser.ParserInitializationException
            java.lang.String r0 = "Parser key cannot be null"
            r2.<init>(r0)
            throw r2
    }

    @Override // org.apache.commons.net.ftp.parser.e
    public org.apache.commons.net.ftp.f b(org.apache.commons.net.ftp.d r2) throws org.apache.commons.net.ftp.parser.ParserInitializationException {
            r1 = this;
            java.lang.String r0 = r2.e()
            org.apache.commons.net.ftp.f r2 = r1.c(r0, r2)
            return r2
    }

    public org.apache.commons.net.ftp.f d() {
            r1 = this;
            org.apache.commons.net.ftp.parser.i r0 = new org.apache.commons.net.ftp.parser.i
            r0.<init>()
            return r0
    }

    public org.apache.commons.net.ftp.f e() {
            r1 = this;
            r0 = 0
            org.apache.commons.net.ftp.f r0 = r1.f(r0)
            return r0
    }

    public org.apache.commons.net.ftp.f g() {
            r1 = this;
            org.apache.commons.net.ftp.parser.l r0 = new org.apache.commons.net.ftp.parser.l
            r0.<init>()
            return r0
    }

    public org.apache.commons.net.ftp.f h() {
            r1 = this;
            org.apache.commons.net.ftp.parser.m r0 = new org.apache.commons.net.ftp.parser.m
            r0.<init>()
            return r0
    }

    public org.apache.commons.net.ftp.f i() {
            r1 = this;
            r0 = 0
            org.apache.commons.net.ftp.f r0 = r1.j(r0)
            return r0
    }

    public org.apache.commons.net.ftp.f k() {
            r1 = this;
            org.apache.commons.net.ftp.parser.p r0 = new org.apache.commons.net.ftp.parser.p
            r0.<init>()
            return r0
    }

    public org.apache.commons.net.ftp.f l() {
            r1 = this;
            org.apache.commons.net.ftp.parser.r r0 = new org.apache.commons.net.ftp.parser.r
            r0.<init>()
            return r0
    }
}
