package com.sun.mail.imap.protocol;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class e implements com.sun.mail.imap.protocol.l {
    static final char[] l = null;
    private static javax.mail.internet.MailDateFormat m;
    public int a;
    public java.util.Date b;
    public java.lang.String c;
    public javax.mail.internet.InternetAddress[] d;
    public javax.mail.internet.InternetAddress[] e;
    public javax.mail.internet.InternetAddress[] f;
    public javax.mail.internet.InternetAddress[] g;
    public javax.mail.internet.InternetAddress[] h;
    public javax.mail.internet.InternetAddress[] i;
    public java.lang.String j;
    public java.lang.String k;

    static {
            r0 = 8
            char[] r0 = new char[r0]
            r0 = {x0012: FILL_ARRAY_DATA , data: [69, 78, 86, 69, 76, 79, 80, 69} // fill-array
            com.sun.mail.imap.protocol.e.l = r0
            javax.mail.internet.MailDateFormat r0 = new javax.mail.internet.MailDateFormat
            r0.<init>()
            com.sun.mail.imap.protocol.e.m = r0
            return
    }

    public e(com.sun.mail.imap.protocol.f r4) throws com.sun.mail.iap.ParsingException {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.b = r0
            int r0 = r4.E()
            r3.a = r0
            r4.B()
            byte r0 = r4.r()
            r1 = 40
            java.lang.String r2 = "ENVELOPE parse error"
            if (r0 != r1) goto L6e
            java.lang.String r0 = r4.w()
            if (r0 == 0) goto L29
            javax.mail.internet.MailDateFormat r1 = com.sun.mail.imap.protocol.e.m     // Catch: java.lang.Exception -> L28
            java.util.Date r0 = r1.parse(r0)     // Catch: java.lang.Exception -> L28
            r3.b = r0     // Catch: java.lang.Exception -> L28
            goto L29
        L28:
        L29:
            java.lang.String r0 = r4.w()
            r3.c = r0
            javax.mail.internet.InternetAddress[] r0 = r3.a(r4)
            r3.d = r0
            javax.mail.internet.InternetAddress[] r0 = r3.a(r4)
            r3.e = r0
            javax.mail.internet.InternetAddress[] r0 = r3.a(r4)
            r3.f = r0
            javax.mail.internet.InternetAddress[] r0 = r3.a(r4)
            r3.g = r0
            javax.mail.internet.InternetAddress[] r0 = r3.a(r4)
            r3.h = r0
            javax.mail.internet.InternetAddress[] r0 = r3.a(r4)
            r3.i = r0
            java.lang.String r0 = r4.w()
            r3.j = r0
            java.lang.String r0 = r4.w()
            r3.k = r0
            byte r4 = r4.r()
            r0 = 41
            if (r4 != r0) goto L68
            return
        L68:
            com.sun.mail.iap.ParsingException r4 = new com.sun.mail.iap.ParsingException
            r4.<init>(r2)
            throw r4
        L6e:
            com.sun.mail.iap.ParsingException r4 = new com.sun.mail.iap.ParsingException
            r4.<init>(r2)
            throw r4
    }

    private javax.mail.internet.InternetAddress[] a(com.sun.mail.iap.g r4) throws com.sun.mail.iap.ParsingException {
            r3 = this;
            r4.B()
            byte r0 = r4.r()
            r1 = 40
            if (r0 != r1) goto L34
            java.util.Vector r1 = new java.util.Vector
            r1.<init>()
        L10:
            com.sun.mail.imap.protocol.g r0 = new com.sun.mail.imap.protocol.g
            r0.<init>(r4)
            boolean r2 = r0.a()
            if (r2 != 0) goto L1e
            r1.addElement(r0)
        L1e:
            byte r0 = r4.n()
            r2 = 41
            if (r0 != r2) goto L10
            r0 = 1
            r4.A(r0)
            int r4 = r1.size()
            javax.mail.internet.InternetAddress[] r4 = new javax.mail.internet.InternetAddress[r4]
            r1.copyInto(r4)
            return r4
        L34:
            r1 = 78
            if (r0 == r1) goto L45
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 != r1) goto L3d
            goto L45
        L3d:
            com.sun.mail.iap.ParsingException r4 = new com.sun.mail.iap.ParsingException
            java.lang.String r0 = "ADDRESS parse error"
            r4.<init>(r0)
            throw r4
        L45:
            r0 = 2
            r4.A(r0)
            r4 = 0
            return r4
    }
}
