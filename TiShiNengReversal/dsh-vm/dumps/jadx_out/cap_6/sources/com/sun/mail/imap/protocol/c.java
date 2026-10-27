package com.sun.mail.imap.protocol;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c implements com.sun.mail.imap.protocol.l {
    static final char[] e = null;
    public int a;
    public com.sun.mail.iap.d b;
    public java.lang.String c;
    public int d;

    static {
            r0 = 4
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [66, 79, 68, 89} // fill-array
            com.sun.mail.imap.protocol.c.e = r0
            return
    }

    public c(com.sun.mail.imap.protocol.f r3) throws com.sun.mail.iap.ParsingException {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.d = r0
            int r0 = r3.E()
            r2.a = r0
            r3.B()
        Lf:
            byte r0 = r3.r()
            r1 = 93
            if (r0 != r1) goto L30
            byte r0 = r3.r()
            r1 = 60
            if (r0 != r1) goto L29
            int r0 = r3.v()
            r2.d = r0
            r0 = 1
            r3.A(r0)
        L29:
            com.sun.mail.iap.d r3 = r3.s()
            r2.b = r3
            return
        L30:
            if (r0 == 0) goto L33
            goto Lf
        L33:
            com.sun.mail.iap.ParsingException r3 = new com.sun.mail.iap.ParsingException
            java.lang.String r0 = "BODY parse error: missing ``]'' at section end"
            r3.<init>(r0)
            throw r3
    }

    public com.sun.mail.iap.d a() {
            r1 = this;
            com.sun.mail.iap.d r0 = r1.b
            return r0
    }

    public java.io.ByteArrayInputStream b() {
            r1 = this;
            com.sun.mail.iap.d r0 = r1.b
            if (r0 == 0) goto L9
            java.io.ByteArrayInputStream r0 = r0.g()
            return r0
        L9:
            r0 = 0
            return r0
    }
}
