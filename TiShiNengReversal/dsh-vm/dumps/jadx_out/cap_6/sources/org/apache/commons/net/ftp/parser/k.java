package org.apache.commons.net.ftp.parser;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class k extends org.apache.commons.net.ftp.parser.b {
    private static final java.lang.String h = "MM-dd-yy hh:mma";
    private static final java.lang.String i = "MM-dd-yy kk:mm";
    private static final java.lang.String j = "(\\S+)\\s+(\\S+)\\s+(?:(<DIR>)|([0-9]+))\\s+(\\S.*)";
    private final org.apache.commons.net.ftp.parser.f g;

    public k() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public k(org.apache.commons.net.ftp.d r4) {
            r3 = this;
            java.lang.String r0 = "(\\S+)\\s+(\\S+)\\s+(?:(<DIR>)|([0-9]+))\\s+(\\S.*)"
            r1 = 32
            r3.<init>(r0, r1)
            r3.c(r4)
            org.apache.commons.net.ftp.d r4 = new org.apache.commons.net.ftp.d
            r0 = 0
            java.lang.String r1 = "WINDOWS"
            java.lang.String r2 = "MM-dd-yy kk:mm"
            r4.<init>(r1, r2, r0)
            r4.l(r2)
            org.apache.commons.net.ftp.parser.g r0 = new org.apache.commons.net.ftp.parser.g
            r0.<init>()
            r3.g = r0
            org.apache.commons.net.ftp.a r0 = (org.apache.commons.net.ftp.a) r0
            r0.c(r4)
            return
    }

    @Override // org.apache.commons.net.ftp.f
    public org.apache.commons.net.ftp.FTPFile a(java.lang.String r8) {
            r7 = this;
            org.apache.commons.net.ftp.FTPFile r0 = new org.apache.commons.net.ftp.FTPFile
            r0.<init>()
            r0.setRawListing(r8)
            boolean r8 = r7.i(r8)
            r1 = 0
            if (r8 == 0) goto L84
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r2 = 1
            java.lang.String r3 = r7.h(r2)
            r8.append(r3)
            java.lang.String r3 = " "
            r8.append(r3)
            r3 = 2
            java.lang.String r3 = r7.h(r3)
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            r3 = 3
            java.lang.String r3 = r7.h(r3)
            r4 = 4
            java.lang.String r4 = r7.h(r4)
            r5 = 5
            java.lang.String r5 = r7.h(r5)
            java.util.Calendar r6 = super.m(r8)     // Catch: java.text.ParseException -> L44
            r0.setTimestamp(r6)     // Catch: java.text.ParseException -> L44
            goto L4f
        L44:
            org.apache.commons.net.ftp.parser.f r6 = r7.g     // Catch: java.text.ParseException -> L4e
            java.util.Calendar r8 = r6.a(r8)     // Catch: java.text.ParseException -> L4e
            r0.setTimestamp(r8)     // Catch: java.text.ParseException -> L4e
            goto L4f
        L4e:
        L4f:
            if (r5 == 0) goto L84
            java.lang.String r8 = "."
            boolean r8 = r5.equals(r8)
            if (r8 != 0) goto L84
            java.lang.String r8 = ".."
            boolean r8 = r5.equals(r8)
            if (r8 == 0) goto L62
            goto L84
        L62:
            r0.setName(r5)
            java.lang.String r8 = "<DIR>"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L76
            r0.setType(r2)
            r1 = 0
            r0.setSize(r1)
            goto L83
        L76:
            r8 = 0
            r0.setType(r8)
            if (r4 == 0) goto L83
            long r1 = java.lang.Long.parseLong(r4)
            r0.setSize(r1)
        L83:
            return r0
        L84:
            return r1
    }

    @Override // org.apache.commons.net.ftp.parser.b
    public org.apache.commons.net.ftp.d l() {
            r4 = this;
            org.apache.commons.net.ftp.d r0 = new org.apache.commons.net.ftp.d
            java.lang.String r1 = "MM-dd-yy hh:mma"
            r2 = 0
            java.lang.String r3 = "WINDOWS"
            r0.<init>(r3, r1, r2)
            return r0
    }
}
