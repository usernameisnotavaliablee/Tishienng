package org.apache.commons.net.ftp.parser;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class q extends org.apache.commons.net.ftp.parser.b {
    private static final java.lang.String g = "d-MMM-yyyy HH:mm:ss";
    private static final java.lang.String h = "(.*?;[0-9]+)\\s*(\\d+)/\\d+\\s*(\\S+)\\s+(\\S+)\\s+\\[(([0-9$A-Za-z_]+)|([0-9$A-Za-z_]+),([0-9$a-zA-Z_]+))\\]?\\s*\\([a-zA-Z]*,([a-zA-Z]*),([a-zA-Z]*),([a-zA-Z]*)\\)";

    public q() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public q(org.apache.commons.net.ftp.d r2) {
            r1 = this;
            java.lang.String r0 = "(.*?;[0-9]+)\\s*(\\d+)/\\d+\\s*(\\S+)\\s+(\\S+)\\s+\\[(([0-9$A-Za-z_]+)|([0-9$A-Za-z_]+),([0-9$a-zA-Z_]+))\\]?\\s*\\([a-zA-Z]*,([a-zA-Z]*),([a-zA-Z]*),([a-zA-Z]*)\\)"
            r1.<init>(r0)
            r1.c(r2)
            return
    }

    @Override // org.apache.commons.net.ftp.f
    public org.apache.commons.net.ftp.FTPFile a(java.lang.String r18) {
            r17 = this;
            r0 = r17
            boolean r1 = r17.i(r18)
            r2 = 0
            if (r1 == 0) goto Le9
            org.apache.commons.net.ftp.FTPFile r1 = new org.apache.commons.net.ftp.FTPFile
            r1.<init>()
            r3 = r18
            r1.setRawListing(r3)
            r3 = 1
            java.lang.String r4 = r0.h(r3)
            r5 = 2
            java.lang.String r6 = r0.h(r5)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = 3
            java.lang.String r9 = r0.h(r8)
            r7.append(r9)
            java.lang.String r9 = " "
            r7.append(r9)
            r9 = 4
            java.lang.String r9 = r0.h(r9)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            r9 = 5
            java.lang.String r9 = r0.h(r9)
            r10 = 9
            java.lang.String r10 = r0.h(r10)
            r11 = 10
            java.lang.String r11 = r0.h(r11)
            r12 = 11
            java.lang.String r12 = r0.h(r12)
            java.lang.String[] r10 = new java.lang.String[]{r10, r11, r12}
            java.util.Calendar r7 = super.m(r7)     // Catch: java.text.ParseException -> L5e
            r1.setTimestamp(r7)     // Catch: java.text.ParseException -> L5e
            goto L5f
        L5e:
        L5f:
            java.util.StringTokenizer r7 = new java.util.StringTokenizer
            java.lang.String r11 = ","
            r7.<init>(r9, r11)
            int r9 = r7.countTokens()
            if (r9 == r3) goto L79
            if (r9 == r5) goto L70
            r7 = r2
            goto L7d
        L70:
            java.lang.String r2 = r7.nextToken()
            java.lang.String r7 = r7.nextToken()
            goto L7d
        L79:
            java.lang.String r7 = r7.nextToken()
        L7d:
            java.lang.String r9 = ".DIR"
            int r9 = r4.lastIndexOf(r9)
            r11 = -1
            r12 = 0
            if (r9 == r11) goto L8b
            r1.setType(r3)
            goto L8e
        L8b:
            r1.setType(r12)
        L8e:
            boolean r9 = r0.n()
            if (r9 == 0) goto L98
            r1.setName(r4)
            goto La5
        L98:
            java.lang.String r9 = ";"
            int r9 = r4.lastIndexOf(r9)
            java.lang.String r4 = r4.substring(r12, r9)
            r1.setName(r4)
        La5:
            long r13 = java.lang.Long.parseLong(r6)
            r15 = 512(0x200, double:2.53E-321)
            long r13 = r13 * r15
            r1.setSize(r13)
            r1.setGroup(r2)
            r1.setUser(r7)
            r2 = 0
        Lb7:
            if (r2 >= r8) goto Le8
            r4 = r10[r2]
            r6 = 82
            int r6 = r4.indexOf(r6)
            if (r6 < 0) goto Lc5
            r6 = 1
            goto Lc6
        Lc5:
            r6 = 0
        Lc6:
            r1.setPermission(r2, r12, r6)
            r6 = 87
            int r6 = r4.indexOf(r6)
            if (r6 < 0) goto Ld3
            r6 = 1
            goto Ld4
        Ld3:
            r6 = 0
        Ld4:
            r1.setPermission(r2, r3, r6)
            r6 = 69
            int r4 = r4.indexOf(r6)
            if (r4 < 0) goto Le1
            r4 = 1
            goto Le2
        Le1:
            r4 = 0
        Le2:
            r1.setPermission(r2, r5, r4)
            int r2 = r2 + 1
            goto Lb7
        Le8:
            return r1
        Le9:
            return r2
    }

    @Override // org.apache.commons.net.ftp.g, org.apache.commons.net.ftp.f
    public java.lang.String b(java.io.BufferedReader r4) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = r4.readLine()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L9:
            if (r0 == 0) goto L36
            java.lang.String r2 = "Directory"
            boolean r2 = r0.startsWith(r2)
            if (r2 != 0) goto L31
            java.lang.String r2 = "Total"
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L1c
            goto L31
        L1c:
            r1.append(r0)
            java.lang.String r0 = r0.trim()
            java.lang.String r2 = ")"
            boolean r0 = r0.endsWith(r2)
            if (r0 == 0) goto L2c
            goto L36
        L2c:
            java.lang.String r0 = r4.readLine()
            goto L9
        L31:
            java.lang.String r0 = r4.readLine()
            goto L9
        L36:
            int r4 = r1.length()
            if (r4 != 0) goto L3e
            r4 = 0
            return r4
        L3e:
            java.lang.String r4 = r1.toString()
            return r4
    }

    @Override // org.apache.commons.net.ftp.parser.b
    protected org.apache.commons.net.ftp.d l() {
            r4 = this;
            org.apache.commons.net.ftp.d r0 = new org.apache.commons.net.ftp.d
            java.lang.String r1 = "d-MMM-yyyy HH:mm:ss"
            r2 = 0
            java.lang.String r3 = "VMS"
            r0.<init>(r3, r1, r2)
            return r0
    }

    protected boolean n() {
            r1 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public org.apache.commons.net.ftp.FTPFile[] o(java.io.InputStream r3) throws java.io.IOException {
            r2 = this;
            org.apache.commons.net.ftp.k r0 = new org.apache.commons.net.ftp.k
            r0.<init>(r2)
            r1 = 0
            r0.h(r3, r1)
            org.apache.commons.net.ftp.FTPFile[] r3 = r0.a()
            return r3
    }
}
