package com.sun.mail.imap.protocol;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class k implements com.sun.mail.imap.protocol.l {
    static final char[] c = null;
    private static javax.mail.internet.MailDateFormat d;
    private static java.text.SimpleDateFormat e;
    public int a;
    protected java.util.Date b;

    static {
            r0 = 12
            char[] r0 = new char[r0]
            r0 = {x001c: FILL_ARRAY_DATA , data: [73, 78, 84, 69, 82, 78, 65, 76, 68, 65, 84, 69} // fill-array
            com.sun.mail.imap.protocol.k.c = r0
            javax.mail.internet.MailDateFormat r0 = new javax.mail.internet.MailDateFormat
            r0.<init>()
            com.sun.mail.imap.protocol.k.d = r0
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "dd-MMM-yyyy HH:mm:ss "
            java.util.Locale r2 = java.util.Locale.US
            r0.<init>(r1, r2)
            com.sun.mail.imap.protocol.k.e = r0
            return
    }

    public k(com.sun.mail.imap.protocol.f r2) throws com.sun.mail.iap.ParsingException {
            r1 = this;
            r1.<init>()
            int r0 = r2.E()
            r1.a = r0
            r2.B()
            java.lang.String r2 = r2.w()
            if (r2 == 0) goto L23
            javax.mail.internet.MailDateFormat r0 = com.sun.mail.imap.protocol.k.d     // Catch: java.text.ParseException -> L1b
            java.util.Date r2 = r0.parse(r2)     // Catch: java.text.ParseException -> L1b
            r1.b = r2     // Catch: java.text.ParseException -> L1b
            return
        L1b:
            com.sun.mail.iap.ParsingException r2 = new com.sun.mail.iap.ParsingException
            java.lang.String r0 = "INTERNALDATE parse error"
            r2.<init>(r0)
            throw r2
        L23:
            com.sun.mail.iap.ParsingException r2 = new com.sun.mail.iap.ParsingException
            java.lang.String r0 = "INTERNALDATE is NIL"
            r2.<init>(r0)
            throw r2
    }

    public static java.lang.String a(java.util.Date r5) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.text.SimpleDateFormat r1 = com.sun.mail.imap.protocol.k.e
            monitor-enter(r1)
            java.text.SimpleDateFormat r2 = com.sun.mail.imap.protocol.k.e     // Catch: java.lang.Throwable -> L54
            java.text.FieldPosition r3 = new java.text.FieldPosition     // Catch: java.lang.Throwable -> L54
            r4 = 0
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L54
            r2.format(r5, r0, r3)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L54
            int r5 = r5.getTimezoneOffset()
            int r5 = -r5
            if (r5 >= 0) goto L22
            r1 = 45
            r0.append(r1)
            int r5 = -r5
            goto L27
        L22:
            r1 = 43
            r0.append(r1)
        L27:
            int r1 = r5 / 60
            int r5 = r5 % 60
            int r2 = r1 / 10
            r3 = 10
            char r2 = java.lang.Character.forDigit(r2, r3)
            r0.append(r2)
            int r1 = r1 % r3
            char r1 = java.lang.Character.forDigit(r1, r3)
            r0.append(r1)
            int r1 = r5 / 10
            char r1 = java.lang.Character.forDigit(r1, r3)
            r0.append(r1)
            int r5 = r5 % r3
            char r5 = java.lang.Character.forDigit(r5, r3)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
        L54:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L54
            throw r5
    }

    public java.util.Date b() {
            r1 = this;
            java.util.Date r0 = r1.b
            return r0
    }
}
