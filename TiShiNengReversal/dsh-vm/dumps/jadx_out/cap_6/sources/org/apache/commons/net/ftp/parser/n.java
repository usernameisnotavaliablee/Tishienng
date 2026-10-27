package org.apache.commons.net.ftp.parser;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class n extends org.apache.commons.net.ftp.parser.b {
    private static final java.lang.String g = "yy/MM/dd HH:mm:ss";
    private static final java.lang.String h = "(\\S+)\\s+(?:(\\d+)\\s+)?(?:(\\S+)\\s+(\\S+)\\s+)?(\\*STMF|\\*DIR|\\*FILE|\\*MEM)\\s+(?:(\\S+)\\s*)?";

    public n() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public n(org.apache.commons.net.ftp.d r2) {
            r1 = this;
            java.lang.String r0 = "(\\S+)\\s+(?:(\\d+)\\s+)?(?:(\\S+)\\s+(\\S+)\\s+)?(\\*STMF|\\*DIR|\\*FILE|\\*MEM)\\s+(?:(\\S+)\\s*)?"
            r1.<init>(r0)
            r1.c(r2)
            return
    }

    private boolean n(java.lang.String r1) {
            r0 = this;
            if (r1 == 0) goto Lb
            int r1 = r1.length()
            if (r1 != 0) goto L9
            goto Lb
        L9:
            r1 = 0
            return r1
        Lb:
            r1 = 1
            return r1
    }

    @Override // org.apache.commons.net.ftp.f
    public org.apache.commons.net.ftp.FTPFile a(java.lang.String r12) {
            r11 = this;
            org.apache.commons.net.ftp.FTPFile r0 = new org.apache.commons.net.ftp.FTPFile
            r0.<init>()
            r0.setRawListing(r12)
            boolean r12 = r11.i(r12)
            r1 = 0
            if (r12 == 0) goto L107
            r12 = 1
            java.lang.String r2 = r11.h(r12)
            r3 = 2
            java.lang.String r3 = r11.h(r3)
            r4 = 3
            java.lang.String r5 = r11.h(r4)
            boolean r5 = r11.n(r5)
            r6 = 4
            if (r5 == 0) goto L33
            java.lang.String r5 = r11.h(r6)
            boolean r5 = r11.n(r5)
            if (r5 != 0) goto L30
            goto L33
        L30:
            java.lang.String r5 = ""
            goto L4f
        L33:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = r11.h(r4)
            r5.append(r7)
            java.lang.String r7 = " "
            r5.append(r7)
            java.lang.String r6 = r11.h(r6)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
        L4f:
            r6 = 5
            java.lang.String r6 = r11.h(r6)
            r7 = 6
            java.lang.String r7 = r11.h(r7)
            java.util.Calendar r8 = super.m(r5)     // Catch: java.text.ParseException -> L61
            r0.setTimestamp(r8)     // Catch: java.text.ParseException -> L61
            goto L62
        L61:
        L62:
            java.lang.String r8 = "*STMF"
            boolean r8 = r6.equalsIgnoreCase(r8)
            r9 = 47
            r10 = 0
            if (r8 == 0) goto L7e
            boolean r4 = r11.n(r3)
            if (r4 != 0) goto L7d
            boolean r4 = r11.n(r7)
            if (r4 == 0) goto L7a
            goto L7d
        L7a:
            r1 = 1
        L7b:
            r4 = 0
            goto Ld5
        L7d:
            return r1
        L7e:
            java.lang.String r8 = "*DIR"
            boolean r8 = r6.equalsIgnoreCase(r8)
            if (r8 == 0) goto L97
            boolean r4 = r11.n(r3)
            if (r4 != 0) goto L96
            boolean r4 = r11.n(r7)
            if (r4 == 0) goto L93
            goto L96
        L93:
            r1 = 1
            r4 = 1
            goto Ld5
        L96:
            return r1
        L97:
            java.lang.String r8 = "*FILE"
            boolean r8 = r6.equalsIgnoreCase(r8)
            if (r8 == 0) goto Lb0
            if (r7 == 0) goto Laf
            java.lang.String r4 = r7.toUpperCase()
            java.lang.String r5 = ".SAVF"
            boolean r4 = r4.endsWith(r5)
            if (r4 == 0) goto Laf
        Lad:
            r1 = 0
            goto L7b
        Laf:
            return r1
        Lb0:
            java.lang.String r8 = "*MEM"
            boolean r6 = r6.equalsIgnoreCase(r8)
            if (r6 == 0) goto Ld4
            boolean r4 = r11.n(r7)
            if (r4 == 0) goto Lbf
            return r1
        Lbf:
            boolean r4 = r11.n(r3)
            if (r4 == 0) goto Ld3
            boolean r4 = r11.n(r5)
            if (r4 != 0) goto Lcc
            goto Ld3
        Lcc:
            char r1 = java.io.File.separatorChar
            java.lang.String r7 = r7.replace(r9, r1)
            goto Lad
        Ld3:
            return r1
        Ld4:
            r1 = 1
        Ld5:
            r0.setType(r4)
            r0.setUser(r2)
            long r2 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> Le3
            r0.setSize(r2)     // Catch: java.lang.NumberFormatException -> Le3
            goto Le4
        Le3:
        Le4:
            java.lang.String r2 = "/"
            boolean r2 = r7.endsWith(r2)
            if (r2 == 0) goto Lf5
            int r2 = r7.length()
            int r2 = r2 - r12
            java.lang.String r7 = r7.substring(r10, r2)
        Lf5:
            if (r1 == 0) goto L103
            int r1 = r7.lastIndexOf(r9)
            r2 = -1
            if (r1 <= r2) goto L103
            int r1 = r1 + r12
            java.lang.String r7 = r7.substring(r1)
        L103:
            r0.setName(r7)
            return r0
        L107:
            return r1
    }

    @Override // org.apache.commons.net.ftp.parser.b
    protected org.apache.commons.net.ftp.d l() {
            r4 = this;
            org.apache.commons.net.ftp.d r0 = new org.apache.commons.net.ftp.d
            java.lang.String r1 = "yy/MM/dd HH:mm:ss"
            r2 = 0
            java.lang.String r3 = "OS/400"
            r0.<init>(r3, r1, r2)
            return r0
    }
}
