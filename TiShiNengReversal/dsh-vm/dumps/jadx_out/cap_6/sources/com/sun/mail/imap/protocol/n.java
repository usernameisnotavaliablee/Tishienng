package com.sun.mail.imap.protocol;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class n {
    public javax.mail.Flags a;
    public javax.mail.Flags b;
    public int c;
    public int d;
    public int e;
    public long f;
    public long g;
    public int h;

    public n(com.sun.mail.iap.g[] r6) throws com.sun.mail.iap.ParsingException {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.a = r0
            r5.b = r0
            r1 = -1
            r5.c = r1
            r5.d = r1
            r5.e = r1
            r1 = -1
            r5.f = r1
            r5.g = r1
            r1 = 0
        L16:
            int r2 = r6.length
            if (r1 < r2) goto L31
            javax.mail.Flags r6 = r5.b
            if (r6 != 0) goto L30
            javax.mail.Flags r6 = r5.a
            if (r6 == 0) goto L29
            javax.mail.Flags r0 = new javax.mail.Flags
            r0.<init>(r6)
            r5.b = r0
            return
        L29:
            javax.mail.Flags r6 = new javax.mail.Flags
            r6.<init>()
            r5.b = r6
        L30:
            return
        L31:
            r2 = r6[r1]
            if (r2 == 0) goto Ld4
            boolean r3 = r2 instanceof com.sun.mail.imap.protocol.i
            if (r3 != 0) goto L3b
            goto Ld4
        L3b:
            com.sun.mail.imap.protocol.i r2 = (com.sun.mail.imap.protocol.i) r2
            java.lang.String r3 = "EXISTS"
            boolean r3 = r2.F(r3)
            if (r3 == 0) goto L4f
            int r2 = r2.E()
            r5.c = r2
            r6[r1] = r0
            goto Ld4
        L4f:
            java.lang.String r3 = "RECENT"
            boolean r3 = r2.F(r3)
            if (r3 == 0) goto L61
            int r2 = r2.E()
            r5.d = r2
            r6[r1] = r0
            goto Ld4
        L61:
            java.lang.String r3 = "FLAGS"
            boolean r3 = r2.F(r3)
            if (r3 == 0) goto L73
            com.sun.mail.imap.protocol.FLAGS r3 = new com.sun.mail.imap.protocol.FLAGS
            r3.<init>(r2)
            r5.a = r3
            r6[r1] = r0
            goto Ld4
        L73:
            boolean r3 = r2.k()
            if (r3 == 0) goto Ld4
            boolean r3 = r2.h()
            if (r3 == 0) goto Ld4
            r2.B()
            byte r3 = r2.r()
            r4 = 91
            if (r3 == r4) goto L8e
            r2.z()
            goto Ld4
        L8e:
            java.lang.String r3 = r2.o()
            java.lang.String r4 = "UNSEEN"
            boolean r4 = r3.equalsIgnoreCase(r4)
            if (r4 == 0) goto La1
            int r2 = r2.v()
            r5.e = r2
            goto Lce
        La1:
            java.lang.String r4 = "UIDVALIDITY"
            boolean r4 = r3.equalsIgnoreCase(r4)
            if (r4 == 0) goto Lb0
            long r2 = r2.u()
            r5.f = r2
            goto Lce
        Lb0:
            java.lang.String r4 = "PERMANENTFLAGS"
            boolean r4 = r3.equalsIgnoreCase(r4)
            if (r4 == 0) goto Lc0
            com.sun.mail.imap.protocol.FLAGS r3 = new com.sun.mail.imap.protocol.FLAGS
            r3.<init>(r2)
            r5.b = r3
            goto Lce
        Lc0:
            java.lang.String r4 = "UIDNEXT"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto Ld1
            long r2 = r2.u()
            r5.g = r2
        Lce:
            r6[r1] = r0
            goto Ld4
        Ld1:
            r2.z()
        Ld4:
            int r1 = r1 + 1
            goto L16
    }
}
