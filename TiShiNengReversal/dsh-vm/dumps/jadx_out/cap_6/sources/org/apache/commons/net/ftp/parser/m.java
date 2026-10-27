package org.apache.commons.net.ftp.parser;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class m extends org.apache.commons.net.ftp.parser.b {
    private static final java.lang.String g = "MM-dd-yy HH:mm";
    private static final java.lang.String h = "\\s*([0-9]+)\\s*(\\s+|[A-Z]+)\\s*(DIR|\\s+)\\s*(\\S+)\\s+(\\S+)\\s+(\\S.*)";

    public m() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public m(org.apache.commons.net.ftp.d r2) {
            r1 = this;
            java.lang.String r0 = "\\s*([0-9]+)\\s*(\\s+|[A-Z]+)\\s*(DIR|\\s+)\\s*(\\S+)\\s+(\\S+)\\s+(\\S.*)"
            r1.<init>(r0)
            r1.c(r2)
            return
    }

    @Override // org.apache.commons.net.ftp.f
    public org.apache.commons.net.ftp.FTPFile a(java.lang.String r7) {
            r6 = this;
            org.apache.commons.net.ftp.FTPFile r0 = new org.apache.commons.net.ftp.FTPFile
            r0.<init>()
            boolean r7 = r6.i(r7)
            if (r7 == 0) goto L78
            r7 = 1
            java.lang.String r1 = r6.h(r7)
            r2 = 2
            java.lang.String r2 = r6.h(r2)
            r3 = 3
            java.lang.String r3 = r6.h(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 4
            java.lang.String r5 = r6.h(r5)
            r4.append(r5)
            java.lang.String r5 = " "
            r4.append(r5)
            r5 = 5
            java.lang.String r5 = r6.h(r5)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = 6
            java.lang.String r5 = r6.h(r5)
            java.util.Calendar r4 = super.m(r4)     // Catch: java.text.ParseException -> L45
            r0.setTimestamp(r4)     // Catch: java.text.ParseException -> L45
            goto L46
        L45:
        L46:
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = "DIR"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L62
            java.lang.String r2 = r2.trim()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L5d
            goto L62
        L5d:
            r7 = 0
            r0.setType(r7)
            goto L65
        L62:
            r0.setType(r7)
        L65:
            java.lang.String r7 = r5.trim()
            r0.setName(r7)
            java.lang.String r7 = r1.trim()
            long r1 = java.lang.Long.parseLong(r7)
            r0.setSize(r1)
            return r0
        L78:
            r7 = 0
            return r7
    }

    @Override // org.apache.commons.net.ftp.parser.b
    protected org.apache.commons.net.ftp.d l() {
            r4 = this;
            org.apache.commons.net.ftp.d r0 = new org.apache.commons.net.ftp.d
            java.lang.String r1 = "MM-dd-yy HH:mm"
            r2 = 0
            java.lang.String r3 = "OS/2"
            r0.<init>(r3, r1, r2)
            return r0
    }
}
