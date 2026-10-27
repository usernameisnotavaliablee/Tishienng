package org.apache.commons.net.ftp.parser;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class p extends org.apache.commons.net.ftp.parser.b {
    static final java.lang.String h = "MMM d yyyy";
    static final java.lang.String i = "MMM d HH:mm";
    static final java.lang.String j = "yyyy-MM-dd HH:mm";
    private static final java.lang.String k = "月";
    private static final java.lang.String l = "日";
    private static final java.lang.String m = "年";
    private static final java.lang.String n = "M'月' d'日' yyyy'年'";
    private static final java.lang.String o = "M'月' d'日' HH:mm";
    public static final org.apache.commons.net.ftp.d p = null;

    /* renamed from: q, reason: collision with root package name */
    private static final java.lang.String f54q = "([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s*(\\d+)\\s+(?:(\\S+(?:\\s\\S+)*?)\\s+)?(?:(\\S+(?:\\s\\S+)*)\\s+)?(\\d+(?:,\\s*\\d+)?)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3})|(?:\\d{1,2}月\\s+\\d{1,2}日))\\s+((?:\\d+(?::\\d+)?)|(?:\\d{4}年))\\s(.*)";
    final boolean g;

    static {
            org.apache.commons.net.ftp.d r0 = new org.apache.commons.net.ftp.d
            java.lang.String r1 = "yyyy-MM-dd HH:mm"
            r2 = 0
            java.lang.String r3 = "UNIX"
            r0.<init>(r3, r1, r2)
            org.apache.commons.net.ftp.parser.p.p = r0
            return
    }

    public p() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public p(org.apache.commons.net.ftp.d r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public p(org.apache.commons.net.ftp.d r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s*(\\d+)\\s+(?:(\\S+(?:\\s\\S+)*?)\\s+)?(?:(\\S+(?:\\s\\S+)*)\\s+)?(\\d+(?:,\\s*\\d+)?)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3})|(?:\\d{1,2}月\\s+\\d{1,2}日))\\s+((?:\\d+(?::\\d+)?)|(?:\\d{4}年))\\s(.*)"
            r1.<init>(r0)
            r1.c(r2)
            r1.g = r3
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
            if (r2 == 0) goto L135
            r2 = 1
            java.lang.String r3 = r0.h(r2)
            r4 = 15
            java.lang.String r4 = r0.h(r4)
            r5 = 16
            java.lang.String r5 = r0.h(r5)
            r6 = 17
            java.lang.String r6 = r0.h(r6)
            r7 = 18
            java.lang.String r7 = r0.h(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = 19
            java.lang.String r10 = r0.h(r9)
            r8.append(r10)
            java.lang.String r10 = " "
            r8.append(r10)
            r10 = 20
            java.lang.String r10 = r0.h(r10)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r10 = 21
            java.lang.String r10 = r0.h(r10)
            boolean r11 = r0.g
            if (r11 == 0) goto L61
            java.lang.String r11 = "^\\s+"
            java.lang.String r12 = ""
            java.lang.String r10 = r10.replaceFirst(r11, r12)
        L61:
            java.lang.String r9 = r0.h(r9)     // Catch: java.text.ParseException -> L88
            java.lang.String r11 = "月"
            boolean r9 = r9.contains(r11)     // Catch: java.text.ParseException -> L88
            if (r9 == 0) goto L8a
            org.apache.commons.net.ftp.parser.g r9 = new org.apache.commons.net.ftp.parser.g     // Catch: java.text.ParseException -> L88
            r9.<init>()     // Catch: java.text.ParseException -> L88
            org.apache.commons.net.ftp.d r11 = new org.apache.commons.net.ftp.d     // Catch: java.text.ParseException -> L88
            java.lang.String r12 = "UNIX"
            java.lang.String r13 = "M'月' d'日' yyyy'年'"
            java.lang.String r14 = "M'月' d'日' HH:mm"
            r11.<init>(r12, r13, r14)     // Catch: java.text.ParseException -> L88
            r9.c(r11)     // Catch: java.text.ParseException -> L88
            java.util.Calendar r8 = r9.a(r8)     // Catch: java.text.ParseException -> L88
            r1.setTimestamp(r8)     // Catch: java.text.ParseException -> L88
            goto L91
        L88:
            goto L91
        L8a:
            java.util.Calendar r8 = super.m(r8)     // Catch: java.text.ParseException -> L88
            r1.setTimestamp(r8)     // Catch: java.text.ParseException -> L88
        L91:
            r8 = 0
            char r3 = r3.charAt(r8)
            r9 = 45
            r11 = 3
            r12 = 2
            if (r3 == r9) goto Lad
            r9 = 108(0x6c, float:1.51E-43)
            if (r3 == r9) goto La6
            switch(r3) {
                case 98: goto Laa;
                case 99: goto Laa;
                case 100: goto La8;
                case 101: goto La6;
                case 102: goto Lad;
                default: goto La3;
            }
        La3:
            r3 = 3
        La4:
            r9 = 0
            goto Laf
        La6:
            r3 = 2
            goto La4
        La8:
            r3 = 1
            goto La4
        Laa:
            r3 = 0
            r9 = 1
            goto Laf
        Lad:
            r3 = 0
            goto La4
        Laf:
            r1.setType(r3)
            r14 = 0
            r15 = 4
        Lb4:
            if (r14 >= r11) goto Lf7
            java.lang.String r11 = r0.h(r15)
            r16 = 4
            java.lang.String r13 = "-"
            boolean r11 = r11.equals(r13)
            r11 = r11 ^ r2
            r1.setPermission(r14, r8, r11)
            int r11 = r15 + 1
            java.lang.String r11 = r0.h(r11)
            boolean r11 = r11.equals(r13)
            r11 = r11 ^ r2
            r1.setPermission(r14, r2, r11)
            int r11 = r15 + 2
            java.lang.String r11 = r0.h(r11)
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto Lee
            char r11 = r11.charAt(r8)
            boolean r11 = java.lang.Character.isUpperCase(r11)
            if (r11 != 0) goto Lee
            r1.setPermission(r14, r12, r2)
            goto Lf1
        Lee:
            r1.setPermission(r14, r12, r8)
        Lf1:
            int r14 = r14 + 1
            int r15 = r15 + 4
            r11 = 3
            goto Lb4
        Lf7:
            r16 = 4
            if (r9 != 0) goto L102
            int r2 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L102
            r1.setHardLinkCount(r2)     // Catch: java.lang.NumberFormatException -> L102
        L102:
            r1.setUser(r5)
            r1.setGroup(r6)
            long r4 = java.lang.Long.parseLong(r7)     // Catch: java.lang.NumberFormatException -> L110
            r1.setSize(r4)     // Catch: java.lang.NumberFormatException -> L110
            goto L111
        L110:
        L111:
            if (r3 != r12) goto L131
            java.lang.String r2 = " -> "
            int r2 = r10.indexOf(r2)
            r3 = -1
            if (r2 != r3) goto L120
            r1.setName(r10)
            goto L134
        L120:
            java.lang.String r3 = r10.substring(r8, r2)
            r1.setName(r3)
            int r2 = r2 + 4
            java.lang.String r2 = r10.substring(r2)
            r1.setLink(r2)
            goto L134
        L131:
            r1.setName(r10)
        L134:
            return r1
        L135:
            r1 = 0
            return r1
    }

    @Override // org.apache.commons.net.ftp.g, org.apache.commons.net.ftp.f
    public java.util.List<java.lang.String> d(java.util.List<java.lang.String> r4) {
            r3 = this;
            java.util.ListIterator r0 = r4.listIterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "^total \\d+$"
            boolean r1 = r1.matches(r2)
            if (r1 == 0) goto L4
            r0.remove()
            goto L4
        L1c:
            return r4
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
