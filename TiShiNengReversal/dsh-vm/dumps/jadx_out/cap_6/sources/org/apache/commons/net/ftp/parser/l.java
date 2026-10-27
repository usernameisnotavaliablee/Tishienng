package org.apache.commons.net.ftp.parser;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class l extends org.apache.commons.net.ftp.parser.b {
    private static final java.lang.String g = "MMM dd yyyy";
    private static final java.lang.String h = "MMM dd HH:mm";
    private static final java.lang.String i = "(d|-){1}\\s+\\[([-A-Z]+)\\]\\s+(\\S+)\\s+(\\d+)\\s+(\\S+\\s+\\S+\\s+((\\d+:\\d+)|(\\d{4})))\\s+(.*)";

    public l() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public l(org.apache.commons.net.ftp.d r2) {
            r1 = this;
            java.lang.String r0 = "(d|-){1}\\s+\\[([-A-Z]+)\\]\\s+(\\S+)\\s+(\\d+)\\s+(\\S+\\s+\\S+\\s+((\\d+:\\d+)|(\\d{4})))\\s+(.*)"
            r1.<init>(r0)
            r1.c(r2)
            return
    }

    @Override // org.apache.commons.net.ftp.f
    public org.apache.commons.net.ftp.FTPFile a(java.lang.String r8) {
            r7 = this;
            org.apache.commons.net.ftp.FTPFile r0 = new org.apache.commons.net.ftp.FTPFile
            r0.<init>()
            boolean r8 = r7.i(r8)
            if (r8 == 0) goto L74
            r8 = 1
            java.lang.String r1 = r7.h(r8)
            r2 = 2
            java.lang.String r2 = r7.h(r2)
            r3 = 3
            java.lang.String r3 = r7.h(r3)
            r4 = 4
            java.lang.String r4 = r7.h(r4)
            r5 = 5
            java.lang.String r5 = r7.h(r5)
            r6 = 9
            java.lang.String r6 = r7.h(r6)
            java.util.Calendar r5 = super.m(r5)     // Catch: java.text.ParseException -> L32
            r0.setTimestamp(r5)     // Catch: java.text.ParseException -> L32
            goto L33
        L32:
        L33:
            java.lang.String r1 = r1.trim()
            java.lang.String r5 = "d"
            boolean r1 = r1.equals(r5)
            r5 = 0
            if (r1 == 0) goto L44
            r0.setType(r8)
            goto L47
        L44:
            r0.setType(r5)
        L47:
            r0.setUser(r3)
            java.lang.String r1 = r6.trim()
            r0.setName(r1)
            java.lang.String r1 = r4.trim()
            long r3 = java.lang.Long.parseLong(r1)
            r0.setSize(r3)
            java.lang.String r1 = "R"
            int r1 = r2.indexOf(r1)
            r3 = -1
            if (r1 == r3) goto L68
            r0.setPermission(r5, r5, r8)
        L68:
            java.lang.String r1 = "W"
            int r1 = r2.indexOf(r1)
            if (r1 == r3) goto L73
            r0.setPermission(r5, r8, r8)
        L73:
            return r0
        L74:
            r8 = 0
            return r8
    }

    @Override // org.apache.commons.net.ftp.parser.b
    protected org.apache.commons.net.ftp.d l() {
            r4 = this;
            org.apache.commons.net.ftp.d r0 = new org.apache.commons.net.ftp.d
            java.lang.String r1 = "MMM dd yyyy"
            java.lang.String r2 = "MMM dd HH:mm"
            java.lang.String r3 = "NETWARE"
            r0.<init>(r3, r1, r2)
            return r0
    }
}
