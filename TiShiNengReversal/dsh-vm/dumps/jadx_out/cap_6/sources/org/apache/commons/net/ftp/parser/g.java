package org.apache.commons.net.ftp.parser;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class g implements org.apache.commons.net.ftp.parser.f, org.apache.commons.net.ftp.a {
    private static final int[] h = null;
    private java.text.SimpleDateFormat c;
    private int d;
    private java.text.SimpleDateFormat e;
    private int f;
    private boolean g;

    static {
            r0 = 7
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [14, 13, 12, 11, 5, 2, 1} // fill-array
            org.apache.commons.net.ftp.parser.g.h = r0
            return
    }

    public g() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.g = r0
            java.lang.String r0 = "MMM d yyyy"
            r1 = 0
            r2.m(r0, r1)
            java.lang.String r0 = "MMM d HH:mm"
            r2.p(r0, r1)
            return
    }

    private static int e(java.text.SimpleDateFormat r7) {
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.lang.String r7 = r7.toPattern()
            java.lang.String r1 = "SsmHdM"
            char[] r1 = r1.toCharArray()
            int r2 = r1.length
            r3 = 0
        L10:
            if (r3 >= r2) goto L5f
            char r4 = r1[r3]
            int r5 = r7.indexOf(r4)
            r6 = -1
            if (r5 == r6) goto L5c
            r5 = 72
            if (r4 == r5) goto L55
            r5 = 77
            if (r4 == r5) goto L4f
            r5 = 83
            if (r4 == r5) goto L48
            r5 = 100
            if (r4 == r5) goto L42
            r5 = 109(0x6d, float:1.53E-43)
            if (r4 == r5) goto L3b
            r5 = 115(0x73, float:1.61E-43)
            if (r4 == r5) goto L34
            goto L5c
        L34:
            r7 = 13
            int r7 = j(r7)
            return r7
        L3b:
            r7 = 12
            int r7 = j(r7)
            return r7
        L42:
            r7 = 5
            int r7 = j(r7)
            return r7
        L48:
            r7 = 14
            int r7 = j(r7)
            return r7
        L4f:
            r7 = 2
            int r7 = j(r7)
            return r7
        L55:
            r7 = 11
            int r7 = j(r7)
            return r7
        L5c:
            int r3 = r3 + 1
            goto L10
        L5f:
            return r0
    }

    private static int j(int r4) {
            r0 = 0
            r1 = 0
        L2:
            int[] r2 = org.apache.commons.net.ftp.parser.g.h
            int r3 = r2.length
            if (r1 >= r3) goto Lf
            r2 = r2[r1]
            if (r4 != r2) goto Lc
            return r1
        Lc:
            int r1 = r1 + 1
            goto L2
        Lf:
            return r0
    }

    private void m(java.lang.String r2, java.text.DateFormatSymbols r3) {
            r1 = this;
            if (r2 == 0) goto L1a
            if (r3 == 0) goto Lc
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            r0.<init>(r2, r3)
            r1.c = r0
            goto L13
        Lc:
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            r3.<init>(r2)
            r1.c = r3
        L13:
            java.text.SimpleDateFormat r2 = r1.c
            r3 = 0
            r2.setLenient(r3)
            goto L1d
        L1a:
            r2 = 0
            r1.c = r2
        L1d:
            java.text.SimpleDateFormat r2 = r1.c
            int r2 = e(r2)
            r1.d = r2
            return
    }

    private static void o(int r1, java.util.Calendar r2) {
            if (r1 > 0) goto L3
            goto Lf
        L3:
            int[] r0 = org.apache.commons.net.ftp.parser.g.h
            int r1 = r1 + (-1)
            r1 = r0[r1]
            int r0 = r2.get(r1)
            if (r0 == 0) goto L10
        Lf:
            return
        L10:
            r2.clear(r1)
            return
    }

    private void p(java.lang.String r2, java.text.DateFormatSymbols r3) {
            r1 = this;
            if (r2 == 0) goto L1a
            if (r3 == 0) goto Lc
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            r0.<init>(r2, r3)
            r1.e = r0
            goto L13
        Lc:
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            r3.<init>(r2)
            r1.e = r3
        L13:
            java.text.SimpleDateFormat r2 = r1.e
            r3 = 0
            r2.setLenient(r3)
            goto L1d
        L1a:
            r2 = 0
            r1.e = r2
        L1d:
            java.text.SimpleDateFormat r2 = r1.e
            int r2 = e(r2)
            r1.f = r2
            return
    }

    private void q(java.lang.String r2) {
            r1 = this;
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            if (r2 == 0) goto La
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r2)
        La:
            java.text.SimpleDateFormat r2 = r1.c
            r2.setTimeZone(r0)
            java.text.SimpleDateFormat r2 = r1.e
            if (r2 == 0) goto L16
            r2.setTimeZone(r0)
        L16:
            return
    }

    @Override // org.apache.commons.net.ftp.parser.f
    public java.util.Calendar a(java.lang.String r2) throws java.text.ParseException {
            r1 = this;
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.util.Calendar r2 = r1.l(r2, r0)
            return r2
    }

    public java.text.SimpleDateFormat b() {
            r1 = this;
            java.text.SimpleDateFormat r0 = r1.c
            return r0
    }

    @Override // org.apache.commons.net.ftp.a
    public void c(org.apache.commons.net.ftp.d r3) {
            r2 = this;
            java.lang.String r0 = r3.d()
            java.lang.String r1 = r3.g()
            if (r1 == 0) goto Lf
            java.text.DateFormatSymbols r0 = org.apache.commons.net.ftp.d.a(r1)
            goto L1c
        Lf:
            if (r0 == 0) goto L16
            java.text.DateFormatSymbols r0 = org.apache.commons.net.ftp.d.k(r0)
            goto L1c
        L16:
            java.lang.String r0 = "en"
            java.text.DateFormatSymbols r0 = org.apache.commons.net.ftp.d.k(r0)
        L1c:
            java.lang.String r1 = r3.c()
            r2.p(r1, r0)
            java.lang.String r1 = r3.b()
            if (r1 == 0) goto L3a
            r2.m(r1, r0)
            java.lang.String r0 = r3.f()
            r2.q(r0)
            boolean r3 = r3.j()
            r2.g = r3
            return
        L3a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "defaultFormatString cannot be null"
            r3.<init>(r0)
            throw r3
    }

    public java.lang.String d() {
            r1 = this;
            java.text.SimpleDateFormat r0 = r1.c
            java.lang.String r0 = r0.toPattern()
            return r0
    }

    public java.text.SimpleDateFormat f() {
            r1 = this;
            java.text.SimpleDateFormat r0 = r1.e
            return r0
    }

    public java.lang.String g() {
            r1 = this;
            java.text.SimpleDateFormat r0 = r1.e
            java.lang.String r0 = r0.toPattern()
            return r0
    }

    public java.util.TimeZone h() {
            r1 = this;
            java.text.SimpleDateFormat r0 = r1.c
            java.util.TimeZone r0 = r0.getTimeZone()
            return r0
    }

    public java.lang.String[] i() {
            r1 = this;
            java.text.SimpleDateFormat r0 = r1.c
            java.text.DateFormatSymbols r0 = r0.getDateFormatSymbols()
            java.lang.String[] r0 = r0.getShortMonths()
            return r0
    }

    boolean k() {
            r1 = this;
            boolean r0 = r1.g
            return r0
    }

    public java.util.Calendar l(java.lang.String r9, java.util.Calendar r10) throws java.text.ParseException {
            r8 = this;
            java.lang.Object r0 = r10.clone()
            java.util.Calendar r0 = (java.util.Calendar) r0
            java.util.TimeZone r1 = r8.h()
            r0.setTimeZone(r1)
            java.text.SimpleDateFormat r1 = r8.e
            r2 = 0
            if (r1 == 0) goto L9a
            java.lang.Object r1 = r10.clone()
            java.util.Calendar r1 = (java.util.Calendar) r1
            java.util.TimeZone r3 = r8.h()
            r1.setTimeZone(r3)
            boolean r3 = r8.g
            r4 = 1
            if (r3 == 0) goto L28
            r3 = 5
            r1.add(r3, r4)
        L28:
            int r3 = r1.get(r4)
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r9)
            java.lang.String r6 = " "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.text.SimpleDateFormat r7 = r8.e
            java.lang.String r7 = r7.toPattern()
            r6.append(r7)
            java.lang.String r7 = " yyyy"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.text.SimpleDateFormat r7 = r8.e
            java.text.DateFormatSymbols r7 = r7.getDateFormatSymbols()
            r5.<init>(r6, r7)
            r5.setLenient(r2)
            java.text.SimpleDateFormat r6 = r8.e
            java.util.TimeZone r6 = r6.getTimeZone()
            r5.setTimeZone(r6)
            java.text.ParsePosition r6 = new java.text.ParsePosition
            r6.<init>(r2)
            java.util.Date r5 = r5.parse(r3, r6)
            if (r5 == 0) goto L9a
            int r6 = r6.getIndex()
            int r3 = r3.length()
            if (r6 != r3) goto L9a
            r0.setTime(r5)
            boolean r9 = r0.after(r1)
            if (r9 == 0) goto L94
            r9 = -1
            r0.add(r4, r9)
        L94:
            int r9 = r8.f
            o(r9, r0)
            return r0
        L9a:
            java.text.ParsePosition r1 = new java.text.ParsePosition
            r1.<init>(r2)
            java.text.SimpleDateFormat r2 = r8.c
            java.util.Date r2 = r2.parse(r9, r1)
            if (r2 == 0) goto Lba
            int r3 = r1.getIndex()
            int r4 = r9.length()
            if (r3 != r4) goto Lba
            r0.setTime(r2)
            int r9 = r8.d
            o(r9, r0)
            return r0
        Lba:
            java.text.ParseException r0 = new java.text.ParseException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Timestamp '"
            r2.append(r3)
            r2.append(r9)
            java.lang.String r9 = "' could not be parsed using a server time of "
            r2.append(r9)
            java.util.Date r9 = r10.getTime()
            java.lang.String r9 = r9.toString()
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            int r10 = r1.getErrorIndex()
            r0.<init>(r9, r10)
            throw r0
    }

    void n(boolean r1) {
            r0 = this;
            r0.g = r1
            return
    }
}
