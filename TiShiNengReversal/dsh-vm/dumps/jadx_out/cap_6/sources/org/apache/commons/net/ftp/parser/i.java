package org.apache.commons.net.ftp.parser;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class i extends org.apache.commons.net.ftp.parser.b {
    static final int i = -1;
    static final int j = 0;
    static final int k = 1;
    static final int l = 2;
    static final int m = 3;
    static final int n = 4;
    static final java.lang.String o = "yyyy/MM/dd HH:mm";
    static final java.lang.String p = "\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s+[FV]\\S*\\s+\\S+\\s+\\S+\\s+(PS|PO|PO-E)\\s+(\\S+)\\s*";

    /* renamed from: q, reason: collision with root package name */
    static final java.lang.String f53q = "(\\S+)\\s+\\S+\\s+\\S+\\s+(\\S+)\\s+(\\S+)\\s+\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s*";
    static final java.lang.String r = "(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s*";
    static final java.lang.String s = "(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+).*";
    private int g;
    private org.apache.commons.net.ftp.parser.p h;

    public i() {
            r1 = this;
            java.lang.String r0 = ""
            r1.<init>(r0)
            r0 = -1
            r1.g = r0
            r0 = 0
            super.c(r0)
            return
    }

    private boolean n(org.apache.commons.net.ftp.FTPFile r4, java.lang.String r5) {
            r3 = this;
            boolean r0 = r3.i(r5)
            r1 = 0
            if (r0 == 0) goto L39
            r4.setRawListing(r5)
            r5 = 2
            java.lang.String r5 = r3.h(r5)
            r0 = 1
            java.lang.String r2 = r3.h(r0)
            r4.setName(r5)
            java.lang.String r5 = "PS"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L23
            r4.setType(r1)
            goto L38
        L23:
            java.lang.String r5 = "PO"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L35
            java.lang.String r5 = "PO-E"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L34
            goto L35
        L34:
            return r1
        L35:
            r4.setType(r0)
        L38:
            return r0
        L39:
            return r1
    }

    private boolean o(org.apache.commons.net.ftp.FTPFile r4, java.lang.String r5) {
            r3 = this;
            boolean r0 = r3.i(r5)
            r1 = 0
            if (r0 == 0) goto L24
            r0 = 3
            java.lang.String r0 = r3.h(r0)
            java.lang.String r2 = "OUTPUT"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L24
            r4.setRawListing(r5)
            r5 = 2
            java.lang.String r5 = r3.h(r5)
            r4.setName(r5)
            r4.setType(r1)
            r4 = 1
            return r4
        L24:
            return r1
    }

    private boolean p(org.apache.commons.net.ftp.FTPFile r4, java.lang.String r5) {
            r3 = this;
            boolean r0 = r3.i(r5)
            r1 = 0
            if (r0 == 0) goto L24
            r0 = 4
            java.lang.String r0 = r3.h(r0)
            java.lang.String r2 = "OUTPUT"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L24
            r4.setRawListing(r5)
            r5 = 2
            java.lang.String r5 = r3.h(r5)
            r4.setName(r5)
            r4.setType(r1)
            r4 = 1
            return r4
        L24:
            return r1
    }

    private boolean q(org.apache.commons.net.ftp.FTPFile r5, java.lang.String r6) {
            r4 = this;
            boolean r0 = r4.i(r6)
            r1 = 0
            if (r0 == 0) goto L3b
            r5.setRawListing(r6)
            r6 = 1
            java.lang.String r0 = r4.h(r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 2
            java.lang.String r3 = r4.h(r3)
            r2.append(r3)
            java.lang.String r3 = " "
            r2.append(r3)
            r3 = 3
            java.lang.String r3 = r4.h(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r5.setName(r0)
            r5.setType(r1)
            java.util.Calendar r0 = super.m(r2)     // Catch: java.text.ParseException -> L3b
            r5.setTimestamp(r0)     // Catch: java.text.ParseException -> L3b
            return r6
        L3b:
            return r1
    }

    private boolean r(org.apache.commons.net.ftp.FTPFile r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
            if (r4 == 0) goto L20
            java.lang.String r1 = r4.trim()
            int r1 = r1.length()
            if (r1 <= 0) goto L20
            r3.setRawListing(r4)
            java.lang.String r1 = " "
            java.lang.String[] r4 = r4.split(r1)
            r4 = r4[r0]
            r3.setName(r4)
            r3.setType(r0)
            r3 = 1
            return r3
        L20:
            return r0
    }

    private boolean s(org.apache.commons.net.ftp.FTPFile r1, java.lang.String r2) {
            r0 = this;
            org.apache.commons.net.ftp.parser.p r1 = r0.h
            org.apache.commons.net.ftp.FTPFile r1 = r1.a(r2)
            if (r1 != 0) goto La
            r1 = 0
            return r1
        La:
            r1 = 1
            return r1
    }

    @Override // org.apache.commons.net.ftp.f
    public org.apache.commons.net.ftp.FTPFile a(java.lang.String r4) {
            r3 = this;
            org.apache.commons.net.ftp.FTPFile r0 = new org.apache.commons.net.ftp.FTPFile
            r0.<init>()
            int r1 = r3.g
            if (r1 != 0) goto Le
            boolean r4 = r3.n(r0, r4)
            goto L37
        Le:
            r2 = 1
            if (r1 != r2) goto L1e
            boolean r1 = r3.q(r0, r4)
            if (r1 != 0) goto L1c
            boolean r4 = r3.r(r0, r4)
            goto L37
        L1c:
            r4 = r1
            goto L37
        L1e:
            r2 = 2
            if (r1 != r2) goto L26
            boolean r4 = r3.s(r0, r4)
            goto L37
        L26:
            r2 = 3
            if (r1 != r2) goto L2e
            boolean r4 = r3.o(r0, r4)
            goto L37
        L2e:
            r2 = 4
            if (r1 != r2) goto L36
            boolean r4 = r3.p(r0, r4)
            goto L37
        L36:
            r4 = 0
        L37:
            if (r4 != 0) goto L3b
            r4 = 0
            return r4
        L3b:
            return r0
    }

    @Override // org.apache.commons.net.ftp.g, org.apache.commons.net.ftp.f
    public java.util.List<java.lang.String> d(java.util.List<java.lang.String> r6) {
            r5 = this;
            if (r6 == 0) goto L91
            int r0 = r6.size()
            if (r0 <= 0) goto L91
            r0 = 0
            java.lang.Object r1 = r6.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "Volume"
            int r2 = r1.indexOf(r2)
            r3 = 3
            if (r2 < 0) goto L29
            java.lang.String r2 = "Dsname"
            int r2 = r1.indexOf(r2)
            if (r2 < 0) goto L29
            r5.t(r0)
            java.lang.String r1 = "\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s+[FV]\\S*\\s+\\S+\\s+\\S+\\s+(PS|PO|PO-E)\\s+(\\S+)\\s*"
            super.j(r1)
            goto L8a
        L29:
            java.lang.String r2 = "Name"
            int r2 = r1.indexOf(r2)
            if (r2 < 0) goto L43
            java.lang.String r2 = "Id"
            int r2 = r1.indexOf(r2)
            if (r2 < 0) goto L43
            r1 = 1
            r5.t(r1)
            java.lang.String r1 = "(\\S+)\\s+\\S+\\s+\\S+\\s+(\\S+)\\s+(\\S+)\\s+\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s*"
            super.j(r1)
            goto L8a
        L43:
            java.lang.String r2 = "total"
            int r2 = r1.indexOf(r2)
            if (r2 != 0) goto L57
            r1 = 2
            r5.t(r1)
            org.apache.commons.net.ftp.parser.p r1 = new org.apache.commons.net.ftp.parser.p
            r1.<init>()
            r5.h = r1
            goto L8a
        L57:
            java.lang.String r2 = "Spool Files"
            int r2 = r1.indexOf(r2)
            r4 = 30
            if (r2 < r4) goto L6a
            r5.t(r3)
            java.lang.String r1 = "(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s*"
            super.j(r1)
            goto L8a
        L6a:
            java.lang.String r2 = "JOBNAME"
            int r2 = r1.indexOf(r2)
            if (r2 != 0) goto L86
            java.lang.String r2 = "JOBID"
            int r1 = r1.indexOf(r2)
            r2 = 8
            if (r1 <= r2) goto L86
            r1 = 4
            r5.t(r1)
            java.lang.String r1 = "(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+).*"
            super.j(r1)
            goto L8a
        L86:
            r1 = -1
            r5.t(r1)
        L8a:
            int r1 = r5.g
            if (r1 == r3) goto L91
            r6.remove(r0)
        L91:
            return r6
    }

    @Override // org.apache.commons.net.ftp.parser.b
    protected org.apache.commons.net.ftp.d l() {
            r4 = this;
            org.apache.commons.net.ftp.d r0 = new org.apache.commons.net.ftp.d
            java.lang.String r1 = "yyyy/MM/dd HH:mm"
            r2 = 0
            java.lang.String r3 = "MVS"
            r0.<init>(r3, r1, r2)
            return r0
    }

    void t(int r1) {
            r0 = this;
            r0.g = r1
            return
    }
}
