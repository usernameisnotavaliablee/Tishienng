package com.sun.mail.imap.protocol;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class q implements com.sun.mail.imap.protocol.l {
    static final char[] c = null;
    public int a;
    public com.sun.mail.iap.d b;

    static {
            r0 = 6
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [82, 70, 67, 56, 50, 50} // fill-array
            com.sun.mail.imap.protocol.q.c = r0
            return
    }

    public q(com.sun.mail.imap.protocol.f r2) throws com.sun.mail.iap.ParsingException {
            r1 = this;
            r1.<init>()
            int r0 = r2.E()
            r1.a = r0
            r2.B()
            com.sun.mail.iap.d r2 = r2.s()
            r1.b = r2
            return
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
