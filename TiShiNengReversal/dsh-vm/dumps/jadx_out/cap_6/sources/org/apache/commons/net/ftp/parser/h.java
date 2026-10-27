package org.apache.commons.net.ftp.parser;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class h extends org.apache.commons.net.ftp.g {
    private static final org.apache.commons.net.ftp.parser.h c = null;
    private static final java.util.HashMap<java.lang.String, java.lang.Integer> d = null;
    private static int[] e;
    private static int[][] f;

    static {
            org.apache.commons.net.ftp.parser.h r0 = new org.apache.commons.net.ftp.parser.h
            r0.<init>()
            org.apache.commons.net.ftp.parser.h.c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.apache.commons.net.ftp.parser.h.d = r0
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "file"
            r0.put(r3, r2)
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.String r4 = "cdir"
            r0.put(r4, r3)
            java.lang.String r4 = "pdir"
            r0.put(r4, r3)
            java.lang.String r4 = "dir"
            r0.put(r4, r3)
            r0 = 2
            int[] r3 = new int[]{r1, r2, r0}
            org.apache.commons.net.ftp.parser.h.e = r3
            int[] r3 = new int[r1]
            r4 = 8
            int[][] r4 = new int[r4][]
            r4[r1] = r3
            int[] r3 = new int[]{r0}
            r4[r2] = r3
            int[] r3 = new int[]{r2}
            r4[r0] = r3
            int[] r3 = new int[]{r0, r2}
            r5 = 3
            r4[r5] = r3
            int[] r3 = new int[]{r1}
            r5 = 4
            r4[r5] = r3
            int[] r3 = new int[]{r1, r0}
            r5 = 5
            r4[r5] = r3
            int[] r3 = new int[]{r1, r2}
            r5 = 6
            r4[r5] = r3
            int[] r0 = new int[]{r1, r2, r0}
            r1 = 7
            r4[r1] = r0
            org.apache.commons.net.ftp.parser.h.f = r4
            return
    }

    public h() {
            r0 = this;
            r0.<init>()
            return
    }

    private void e(org.apache.commons.net.ftp.FTPFile r7, java.lang.String r8) {
            r6 = this;
            char[] r8 = r8.toCharArray()
            int r0 = r8.length
            r1 = 0
            r2 = 0
        L7:
            if (r2 >= r0) goto L4f
            char r3 = r8[r2]
            r4 = 97
            r5 = 1
            if (r3 == r4) goto L49
            r4 = 112(0x70, float:1.57E-43)
            if (r3 == r4) goto L45
            r4 = 114(0x72, float:1.6E-43)
            if (r3 == r4) goto L41
            r4 = 119(0x77, float:1.67E-43)
            if (r3 == r4) goto L3d
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 == r4) goto L38
            r4 = 109(0x6d, float:1.53E-43)
            if (r3 == r4) goto L34
            switch(r3) {
                case 99: goto L30;
                case 100: goto L2c;
                case 101: goto L28;
                default: goto L27;
            }
        L27:
            goto L4c
        L28:
            r7.setPermission(r1, r1, r5)
            goto L4c
        L2c:
            r7.setPermission(r1, r5, r5)
            goto L4c
        L30:
            r7.setPermission(r1, r5, r5)
            goto L4c
        L34:
            r7.setPermission(r1, r5, r5)
            goto L4c
        L38:
            r3 = 2
            r7.setPermission(r1, r3, r5)
            goto L4c
        L3d:
            r7.setPermission(r1, r5, r5)
            goto L4c
        L41:
            r7.setPermission(r1, r1, r5)
            goto L4c
        L45:
            r7.setPermission(r1, r5, r5)
            goto L4c
        L49:
            r7.setPermission(r1, r5, r5)
        L4c:
            int r2 = r2 + 1
            goto L7
        L4f:
            return
    }

    public static org.apache.commons.net.ftp.parser.h f() {
            org.apache.commons.net.ftp.parser.h r0 = org.apache.commons.net.ftp.parser.h.c
            return r0
    }

    public static org.apache.commons.net.ftp.FTPFile g(java.lang.String r1) {
            org.apache.commons.net.ftp.parser.h r0 = org.apache.commons.net.ftp.parser.h.c
            org.apache.commons.net.ftp.FTPFile r1 = r0.a(r1)
            return r1
    }

    public static java.util.Calendar h(java.lang.String r5) {
            java.lang.String r0 = "."
            boolean r0 = r5.contains(r0)
            r1 = 0
            if (r0 == 0) goto L12
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyyMMddHHmmss.SSS"
            r0.<init>(r2)
            r2 = 1
            goto L1a
        L12:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyyMMddHHmmss"
            r0.<init>(r2)
            r2 = 0
        L1a:
            java.lang.String r3 = "GMT"
            java.util.TimeZone r3 = java.util.TimeZone.getTimeZone(r3)
            r0.setTimeZone(r3)
            java.util.GregorianCalendar r4 = new java.util.GregorianCalendar
            r4.<init>(r3)
            java.text.ParsePosition r3 = new java.text.ParsePosition
            r3.<init>(r1)
            r0.setLenient(r1)
            java.util.Date r0 = r0.parse(r5, r3)
            int r1 = r3.getIndex()
            int r5 = r5.length()
            if (r1 == r5) goto L40
            r5 = 0
            return r5
        L40:
            r4.setTime(r0)
            if (r2 != 0) goto L4a
            r5 = 14
            r4.clear(r5)
        L4a:
            return r4
    }

    @Override // org.apache.commons.net.ftp.f
    public org.apache.commons.net.ftp.FTPFile a(java.lang.String r19) {
            r18 = this;
            r0 = r19
            java.lang.String r1 = " "
            boolean r2 = r0.startsWith(r1)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L23
            int r1 = r0.length()
            if (r1 <= r4) goto L22
            org.apache.commons.net.ftp.FTPFile r1 = new org.apache.commons.net.ftp.FTPFile
            r1.<init>()
            r1.setRawListing(r0)
            java.lang.String r0 = r0.substring(r4)
            r1.setName(r0)
            return r1
        L22:
            return r3
        L23:
            r2 = 2
            java.lang.String[] r1 = r0.split(r1, r2)
            int r5 = r1.length
            if (r5 != r2) goto L33
            r5 = r1[r4]
            int r5 = r5.length()
            if (r5 != 0) goto L39
        L33:
            r2 = r18
            r17 = r3
            goto L168
        L39:
            r5 = 0
            r6 = r1[r5]
            java.lang.String r7 = ";"
            boolean r8 = r6.endsWith(r7)
            if (r8 != 0) goto L45
            return r3
        L45:
            org.apache.commons.net.ftp.FTPFile r8 = new org.apache.commons.net.ftp.FTPFile
            r8.<init>()
            r8.setRawListing(r0)
            r0 = r1[r4]
            r8.setName(r0)
            java.lang.String[] r0 = r6.split(r7)
            r1 = r1[r5]
            java.util.Locale r6 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toLowerCase(r6)
            java.lang.String r6 = "unix.mode="
            boolean r1 = r1.contains(r6)
            int r6 = r0.length
            r7 = 0
        L66:
            if (r7 >= r6) goto L165
            r9 = r0[r7]
            java.lang.String r10 = "="
            r11 = -1
            java.lang.String[] r9 = r9.split(r10, r11)
            int r10 = r9.length
            if (r10 == r2) goto L75
            return r3
        L75:
            r10 = r9[r5]
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r10 = r10.toLowerCase(r11)
            r9 = r9[r4]
            int r12 = r9.length()
            if (r12 != 0) goto L8b
        L85:
            r2 = r18
            r17 = r3
            goto L15e
        L8b:
            java.lang.String r12 = r9.toLowerCase(r11)
            java.lang.String r13 = "size"
            boolean r13 = r13.equals(r10)
            if (r13 == 0) goto L9f
            long r9 = java.lang.Long.parseLong(r9)
            r8.setSize(r9)
            goto L85
        L9f:
            java.lang.String r13 = "sizd"
            boolean r13 = r13.equals(r10)
            if (r13 == 0) goto Laf
            long r9 = java.lang.Long.parseLong(r9)
            r8.setSize(r9)
            goto L85
        Laf:
            java.lang.String r13 = "modify"
            boolean r13 = r13.equals(r10)
            if (r13 == 0) goto Lc2
            java.util.Calendar r9 = h(r9)
            if (r9 != 0) goto Lbe
            return r3
        Lbe:
            r8.setTimestamp(r9)
            goto L85
        Lc2:
            java.lang.String r13 = "type"
            boolean r13 = r13.equals(r10)
            r14 = 3
            if (r13 == 0) goto Le1
            java.util.HashMap<java.lang.String, java.lang.Integer> r9 = org.apache.commons.net.ftp.parser.h.d
            java.lang.Object r9 = r9.get(r12)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 != 0) goto Ld9
            r8.setType(r14)
            goto L85
        Ld9:
            int r9 = r9.intValue()
            r8.setType(r9)
            goto L85
        Le1:
            java.lang.String r13 = "unix."
            boolean r13 = r10.startsWith(r13)
            if (r13 == 0) goto L14d
            r12 = 5
            java.lang.String r10 = r10.substring(r12)
            java.lang.String r10 = r10.toLowerCase(r11)
            java.lang.String r11 = "group"
            boolean r11 = r11.equals(r10)
            if (r11 == 0) goto L100
            r8.setGroup(r9)
        Lfd:
            r17 = r3
            goto L14a
        L100:
            java.lang.String r11 = "owner"
            boolean r11 = r11.equals(r10)
            if (r11 == 0) goto L10c
            r8.setUser(r9)
            goto Lfd
        L10c:
            java.lang.String r11 = "mode"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto Lfd
            int r10 = r9.length()
            int r10 = r10 - r14
            r11 = 0
        L11a:
            if (r11 >= r14) goto Lfd
            int r12 = r10 + r11
            char r12 = r9.charAt(r12)
            int r12 = r12 + (-48)
            if (r12 < 0) goto L142
            r13 = 7
            if (r12 > r13) goto L142
            int[][] r13 = org.apache.commons.net.ftp.parser.h.f
            r12 = r13[r12]
            int r13 = r12.length
            r15 = 0
        L12f:
            if (r15 >= r13) goto L142
            r2 = r12[r15]
            int[] r16 = org.apache.commons.net.ftp.parser.h.e
            r17 = r3
            r3 = r16[r11]
            r8.setPermission(r3, r2, r4)
            int r15 = r15 + 1
            r3 = r17
            r2 = 2
            goto L12f
        L142:
            r17 = r3
            int r11 = r11 + 1
            r3 = r17
            r2 = 2
            goto L11a
        L14a:
            r2 = r18
            goto L15e
        L14d:
            r17 = r3
            if (r1 != 0) goto L14a
            java.lang.String r2 = "perm"
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L14a
            r2 = r18
            r2.e(r8, r12)
        L15e:
            int r7 = r7 + 1
            r3 = r17
            r2 = 2
            goto L66
        L165:
            r2 = r18
            return r8
        L168:
            return r17
    }
}
