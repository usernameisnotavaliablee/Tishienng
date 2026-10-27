package org.apache.commons.net.ftp.parser;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class j extends org.apache.commons.net.ftp.parser.b {
    static final java.lang.String g = "MMM d yyyy";
    static final java.lang.String h = "MMM d HH:mm";
    private static final java.lang.String i = "([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s+((folder\\s+)|((\\d+)\\s+(\\d+)\\s+))(\\d+)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3}))\\s+(\\d+(?::\\d+)?)\\s+(\\S*)(\\s*.*)";

    public j() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public j(org.apache.commons.net.ftp.d r2) {
            r1 = this;
            java.lang.String r0 = "([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s+((folder\\s+)|((\\d+)\\s+(\\d+)\\s+))(\\d+)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3}))\\s+(\\d+(?::\\d+)?)\\s+(\\S*)(\\s*.*)"
            r1.<init>(r0)
            r1.c(r2)
            return
    }

    @Override // org.apache.commons.net.ftp.f
    public org.apache.commons.net.ftp.FTPFile a(java.lang.String r18) {
            r17 = this;
            r0 = r17
            org.apache.commons.net.ftp.FTPFile r1 = new org.apache.commons.net.ftp.FTPFile
            r1.<init>()
            r2 = r18
            r1.setRawListing(r2)
            boolean r2 = r17.i(r18)
            r3 = 0
            if (r2 == 0) goto L10e
            r2 = 1
            java.lang.String r4 = r0.h(r2)
            java.lang.String r5 = "0"
            r6 = 20
            java.lang.String r6 = r0.h(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = 21
            java.lang.String r8 = r0.h(r8)
            r7.append(r8)
            java.lang.String r8 = " "
            r7.append(r8)
            r8 = 22
            java.lang.String r8 = r0.h(r8)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r8 = 23
            java.lang.String r8 = r0.h(r8)
            r9 = 24
            java.lang.String r9 = r0.h(r9)
            java.util.Calendar r7 = super.m(r7)     // Catch: java.text.ParseException -> L54
            r1.setTimestamp(r7)     // Catch: java.text.ParseException -> L54
            goto L55
        L54:
        L55:
            r7 = 0
            char r4 = r4.charAt(r7)
            r10 = 45
            r11 = 3
            r12 = 2
            if (r4 == r10) goto L71
            r10 = 108(0x6c, float:1.51E-43)
            if (r4 == r10) goto L6a
            switch(r4) {
                case 98: goto L6e;
                case 99: goto L6e;
                case 100: goto L6c;
                case 101: goto L6a;
                case 102: goto L71;
                default: goto L67;
            }
        L67:
            r4 = 3
        L68:
            r10 = 0
            goto L73
        L6a:
            r4 = 2
            goto L68
        L6c:
            r4 = 1
            goto L68
        L6e:
            r4 = 0
            r10 = 1
            goto L73
        L71:
            r4 = 0
            goto L68
        L73:
            r1.setType(r4)
            r14 = 0
            r15 = 4
        L78:
            if (r14 >= r11) goto Lbb
            java.lang.String r11 = r0.h(r15)
            r16 = 4
            java.lang.String r13 = "-"
            boolean r11 = r11.equals(r13)
            r11 = r11 ^ r2
            r1.setPermission(r14, r7, r11)
            int r11 = r15 + 1
            java.lang.String r11 = r0.h(r11)
            boolean r11 = r11.equals(r13)
            r11 = r11 ^ r2
            r1.setPermission(r14, r2, r11)
            int r11 = r15 + 2
            java.lang.String r11 = r0.h(r11)
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto Lb2
            char r11 = r11.charAt(r7)
            boolean r11 = java.lang.Character.isUpperCase(r11)
            if (r11 != 0) goto Lb2
            r1.setPermission(r14, r12, r2)
            goto Lb5
        Lb2:
            r1.setPermission(r14, r12, r7)
        Lb5:
            int r14 = r14 + 1
            int r15 = r15 + 4
            r11 = 3
            goto L78
        Lbb:
            r16 = 4
            if (r10 != 0) goto Lc6
            int r2 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.NumberFormatException -> Lc6
            r1.setHardLinkCount(r2)     // Catch: java.lang.NumberFormatException -> Lc6
        Lc6:
            r1.setUser(r3)
            r1.setGroup(r3)
            long r2 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> Ld4
            r1.setSize(r2)     // Catch: java.lang.NumberFormatException -> Ld4
            goto Ld5
        Ld4:
        Ld5:
            if (r9 != 0) goto Ldb
            r1.setName(r8)
            goto L10d
        Ldb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            if (r4 != r12) goto L10a
            java.lang.String r3 = " -> "
            int r3 = r2.indexOf(r3)
            r4 = -1
            if (r3 != r4) goto Lf9
            r1.setName(r2)
            goto L10d
        Lf9:
            java.lang.String r4 = r2.substring(r7, r3)
            r1.setName(r4)
            int r3 = r3 + 4
            java.lang.String r2 = r2.substring(r3)
            r1.setLink(r2)
            goto L10d
        L10a:
            r1.setName(r2)
        L10d:
            return r1
        L10e:
            return r3
    }

    @Override // org.apache.commons.net.ftp.parser.b
    protected org.apache.commons.net.ftp.d l() {
            r4 = this;
            org.apache.commons.net.ftp.d r0 = new org.apache.commons.net.ftp.d
            java.lang.String r1 = "MMM d yyyy"
            java.lang.String r2 = "MMM d HH:mm"
            java.lang.String r3 = "UNIX"
            r0.<init>(r3, r1, r2)
            return r0
    }
}
