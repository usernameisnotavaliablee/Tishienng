package com.sun.mail.imap.protocol;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class i extends com.sun.mail.iap.g {
    private java.lang.String r;
    private int s;

    public i(com.sun.mail.iap.f r1) throws java.io.IOException, com.sun.mail.iap.ProtocolException {
            r0 = this;
            r0.<init>(r1)
            boolean r1 = r0.k()
            if (r1 == 0) goto L33
            boolean r1 = r0.h()
            if (r1 != 0) goto L33
            boolean r1 = r0.g()
            if (r1 != 0) goto L33
            boolean r1 = r0.d()
            if (r1 != 0) goto L33
            boolean r1 = r0.e()
            if (r1 != 0) goto L33
            java.lang.String r1 = r0.o()
            r0.r = r1
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L33
            r0.s = r1     // Catch: java.lang.NumberFormatException -> L33
            java.lang.String r1 = r0.o()     // Catch: java.lang.NumberFormatException -> L33
            r0.r = r1     // Catch: java.lang.NumberFormatException -> L33
        L33:
            return
    }

    public i(com.sun.mail.imap.protocol.i r2) {
            r1 = this;
            r1.<init>(r2)
            java.lang.String r0 = r2.r
            r1.r = r0
            int r2 = r2.s
            r1.s = r2
            return
    }

    public static com.sun.mail.imap.protocol.i G(com.sun.mail.iap.f r1) throws java.io.IOException, com.sun.mail.iap.ProtocolException {
            com.sun.mail.imap.protocol.i r0 = new com.sun.mail.imap.protocol.i
            r0.<init>(r1)
            java.lang.String r1 = "FETCH"
            boolean r1 = r0.F(r1)
            if (r1 == 0) goto L13
            com.sun.mail.imap.protocol.f r1 = new com.sun.mail.imap.protocol.f
            r1.<init>(r0)
            return r1
        L13:
            return r0
    }

    public java.lang.String D() {
            r1 = this;
            java.lang.String r0 = r1.r
            return r0
    }

    public int E() {
            r1 = this;
            int r0 = r1.s
            return r0
    }

    public boolean F(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.r
            if (r0 == 0) goto Lc
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    public java.lang.String[] H() {
            r7 = this;
            r7.B()
            byte[] r0 = r7.d
            int r1 = r7.a
            r0 = r0[r1]
            r2 = 40
            r3 = 0
            if (r0 == r2) goto Lf
            return r3
        Lf:
            int r1 = r1 + 1
            r7.a = r1
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            int r1 = r7.a
        L1a:
            byte[] r2 = r7.d
            int r4 = r7.a
            r5 = r2[r4]
            r6 = 41
            if (r5 != r6) goto L40
            if (r4 <= r1) goto L2d
            java.lang.String r1 = com.sun.mail.util.ASCIIUtility.toString(r2, r1, r4)
            r0.addElement(r1)
        L2d:
            int r1 = r7.a
            int r1 = r1 + 1
            r7.a = r1
            int r1 = r0.size()
            if (r1 <= 0) goto L3f
            java.lang.String[] r1 = new java.lang.String[r1]
            r0.copyInto(r1)
            return r1
        L3f:
            return r3
        L40:
            r6 = 32
            if (r5 != r6) goto L4f
            java.lang.String r1 = com.sun.mail.util.ASCIIUtility.toString(r2, r1, r4)
            r0.addElement(r1)
            int r1 = r7.a
            int r1 = r1 + 1
        L4f:
            int r2 = r7.a
            int r2 = r2 + 1
            r7.a = r2
            goto L1a
    }
}
