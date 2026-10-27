package com.sun.mail.imap.protocol;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class u {
    static final java.lang.String[] g = null;
    public java.lang.String a;
    public int b;
    public int c;
    public long d;
    public long e;
    public int f;

    static {
            java.lang.String r0 = "UIDNEXT"
            java.lang.String r1 = "UIDVALIDITY"
            java.lang.String r2 = "MESSAGES"
            java.lang.String r3 = "RECENT"
            java.lang.String r4 = "UNSEEN"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r0, r1}
            com.sun.mail.imap.protocol.u.g = r0
            return
    }

    public u(com.sun.mail.iap.g r4) throws com.sun.mail.iap.ParsingException {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a = r0
            r0 = -1
            r3.b = r0
            r3.c = r0
            r1 = -1
            r3.d = r1
            r3.e = r1
            r3.f = r0
            java.lang.String r0 = r4.q()
            r3.a = r0
            r4.B()
            byte r0 = r4.r()
            r1 = 40
            if (r0 != r1) goto L7b
        L24:
            java.lang.String r0 = r4.o()
            java.lang.String r1 = "MESSAGES"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L37
            int r0 = r4.v()
            r3.b = r0
            goto L72
        L37:
            java.lang.String r1 = "RECENT"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L46
            int r0 = r4.v()
            r3.c = r0
            goto L72
        L46:
            java.lang.String r1 = "UIDNEXT"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L55
            long r0 = r4.u()
            r3.d = r0
            goto L72
        L55:
            java.lang.String r1 = "UIDVALIDITY"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L64
            long r0 = r4.u()
            r3.e = r0
            goto L72
        L64:
            java.lang.String r1 = "UNSEEN"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L72
            int r0 = r4.v()
            r3.f = r0
        L72:
            byte r0 = r4.r()
            r1 = 41
            if (r0 != r1) goto L24
            return
        L7b:
            com.sun.mail.iap.ParsingException r4 = new com.sun.mail.iap.ParsingException
            java.lang.String r0 = "parse error in STATUS"
            r4.<init>(r0)
            throw r4
    }

    public static void a(com.sun.mail.imap.protocol.u r6, com.sun.mail.imap.protocol.u r7) {
            int r0 = r7.b
            r1 = -1
            if (r0 == r1) goto L7
            r6.b = r0
        L7:
            int r0 = r7.c
            if (r0 == r1) goto Ld
            r6.c = r0
        Ld:
            long r2 = r7.d
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L17
            r6.d = r2
        L17:
            long r2 = r7.e
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1f
            r6.e = r2
        L1f:
            int r7 = r7.f
            if (r7 == r1) goto L25
            r6.f = r7
        L25:
            return
    }
}
