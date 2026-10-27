package com.sun.mail.imap.protocol;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class f extends com.sun.mail.imap.protocol.i {
    private static final char[] u = null;
    private static final char[] v = null;
    private com.sun.mail.imap.protocol.l[] t;

    static {
            r0 = 7
            char[] r0 = new char[r0]
            r0 = {x0012: FILL_ARRAY_DATA , data: [46, 72, 69, 65, 68, 69, 82} // fill-array
            com.sun.mail.imap.protocol.f.u = r0
            r0 = 5
            char[] r0 = new char[r0]
            r0 = {x001e: FILL_ARRAY_DATA , data: [46, 84, 69, 88, 84} // fill-array
            com.sun.mail.imap.protocol.f.v = r0
            return
    }

    public f(com.sun.mail.iap.f r1) throws java.io.IOException, com.sun.mail.iap.ProtocolException {
            r0 = this;
            r0.<init>(r1)
            r0.l()
            return
    }

    public f(com.sun.mail.imap.protocol.i r1) throws java.io.IOException, com.sun.mail.iap.ProtocolException {
            r0 = this;
            r0.<init>(r1)
            r0.l()
            return
    }

    public static com.sun.mail.imap.protocol.l K(com.sun.mail.iap.g[] r7, int r8, java.lang.Class r9) {
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            r1 = 0
            r2 = 0
        L6:
            int r3 = r7.length
            if (r2 < r3) goto La
            return r0
        La:
            r3 = r7[r2]
            if (r3 == 0) goto L36
            boolean r4 = r3 instanceof com.sun.mail.imap.protocol.f
            if (r4 == 0) goto L36
            com.sun.mail.imap.protocol.f r3 = (com.sun.mail.imap.protocol.f) r3
            int r3 = r3.E()
            if (r3 == r8) goto L1b
            goto L36
        L1b:
            r3 = r7[r2]
            com.sun.mail.imap.protocol.f r3 = (com.sun.mail.imap.protocol.f) r3
            r4 = 0
        L20:
            com.sun.mail.imap.protocol.l[] r5 = r3.t
            int r6 = r5.length
            if (r4 < r6) goto L26
            goto L36
        L26:
            r5 = r5[r4]
            boolean r5 = r9.isInstance(r5)
            if (r5 == 0) goto L33
            com.sun.mail.imap.protocol.l[] r7 = r3.t
            r7 = r7[r4]
            return r7
        L33:
            int r4 = r4 + 1
            goto L20
        L36:
            int r2 = r2 + 1
            goto L6
    }

    private boolean M(char[] r7) {
            r6 = this;
            int r0 = r7.length
            int r1 = r6.a
            r2 = 0
            r3 = 0
        L5:
            if (r3 < r0) goto L9
            r7 = 1
            return r7
        L9:
            byte[] r4 = r6.d
            int r5 = r1 + 1
            r1 = r4[r1]
            char r1 = (char) r1
            char r1 = java.lang.Character.toUpperCase(r1)
            int r4 = r3 + 1
            char r3 = r7[r3]
            if (r1 == r3) goto L1b
            return r2
        L1b:
            r3 = r4
            r1 = r5
            goto L5
    }

    private void l() throws com.sun.mail.iap.ParsingException {
            r5 = this;
            r5.B()
            byte[] r0 = r5.d
            int r1 = r5.a
            r0 = r0[r1]
            r1 = 40
            if (r0 != r1) goto L141
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r1 = 0
        L13:
            int r2 = r5.a
            int r2 = r2 + 1
            r5.a = r2
            int r3 = r5.c
            if (r2 >= r3) goto L12b
            byte[] r3 = r5.d
            r2 = r3[r2]
            r3 = 66
            if (r2 == r3) goto Ld4
            r3 = 73
            if (r2 == r3) goto Lc0
            r3 = 82
            if (r2 == r3) goto L7a
            r3 = 85
            if (r2 == r3) goto L65
            r3 = 69
            if (r2 == r3) goto L50
            r3 = 70
            if (r2 == r3) goto L3b
            goto L10c
        L3b:
            char[] r2 = com.sun.mail.imap.protocol.FLAGS.name
            boolean r3 = r5.M(r2)
            if (r3 == 0) goto L10c
            int r1 = r5.a
            int r2 = r2.length
            int r1 = r1 + r2
            r5.a = r1
            com.sun.mail.imap.protocol.FLAGS r1 = new com.sun.mail.imap.protocol.FLAGS
            r1.<init>(r5)
            goto L10c
        L50:
            char[] r2 = com.sun.mail.imap.protocol.e.l
            boolean r3 = r5.M(r2)
            if (r3 == 0) goto L10c
            int r1 = r5.a
            int r2 = r2.length
            int r1 = r1 + r2
            r5.a = r1
            com.sun.mail.imap.protocol.e r1 = new com.sun.mail.imap.protocol.e
            r1.<init>(r5)
            goto L10c
        L65:
            char[] r2 = com.sun.mail.imap.protocol.v.c
            boolean r3 = r5.M(r2)
            if (r3 == 0) goto L10c
            int r1 = r5.a
            int r2 = r2.length
            int r1 = r1 + r2
            r5.a = r1
            com.sun.mail.imap.protocol.v r1 = new com.sun.mail.imap.protocol.v
            r1.<init>(r5)
            goto L10c
        L7a:
            char[] r2 = com.sun.mail.imap.protocol.r.c
            boolean r3 = r5.M(r2)
            if (r3 == 0) goto L8f
            int r1 = r5.a
            int r2 = r2.length
            int r1 = r1 + r2
            r5.a = r1
            com.sun.mail.imap.protocol.r r1 = new com.sun.mail.imap.protocol.r
            r1.<init>(r5)
            goto L10c
        L8f:
            char[] r2 = com.sun.mail.imap.protocol.q.c
            boolean r3 = r5.M(r2)
            if (r3 == 0) goto L10c
            int r1 = r5.a
            int r2 = r2.length
            int r1 = r1 + r2
            r5.a = r1
            char[] r1 = com.sun.mail.imap.protocol.f.u
            boolean r2 = r5.M(r1)
            if (r2 == 0) goto Lac
            int r2 = r5.a
            int r1 = r1.length
            int r2 = r2 + r1
            r5.a = r2
            goto Lba
        Lac:
            char[] r1 = com.sun.mail.imap.protocol.f.v
            boolean r2 = r5.M(r1)
            if (r2 == 0) goto Lba
            int r2 = r5.a
            int r1 = r1.length
            int r2 = r2 + r1
            r5.a = r2
        Lba:
            com.sun.mail.imap.protocol.q r1 = new com.sun.mail.imap.protocol.q
            r1.<init>(r5)
            goto L10c
        Lc0:
            char[] r2 = com.sun.mail.imap.protocol.k.c
            boolean r3 = r5.M(r2)
            if (r3 == 0) goto L10c
            int r1 = r5.a
            int r2 = r2.length
            int r1 = r1 + r2
            r5.a = r1
            com.sun.mail.imap.protocol.k r1 = new com.sun.mail.imap.protocol.k
            r1.<init>(r5)
            goto L10c
        Ld4:
            char[] r2 = com.sun.mail.imap.protocol.c.e
            boolean r3 = r5.M(r2)
            if (r3 == 0) goto L10c
            byte[] r1 = r5.d
            int r3 = r5.a
            int r4 = r3 + 4
            r1 = r1[r4]
            r4 = 91
            if (r1 != r4) goto Lf2
            int r1 = r2.length
            int r3 = r3 + r1
            r5.a = r3
            com.sun.mail.imap.protocol.c r1 = new com.sun.mail.imap.protocol.c
            r1.<init>(r5)
            goto L10c
        Lf2:
            char[] r1 = com.sun.mail.imap.protocol.d.r
            boolean r3 = r5.M(r1)
            if (r3 == 0) goto L101
            int r2 = r5.a
            int r1 = r1.length
            int r2 = r2 + r1
            r5.a = r2
            goto L107
        L101:
            int r1 = r5.a
            int r2 = r2.length
            int r1 = r1 + r2
            r5.a = r1
        L107:
            com.sun.mail.imap.protocol.d r1 = new com.sun.mail.imap.protocol.d
            r1.<init>(r5)
        L10c:
            if (r1 == 0) goto L111
            r0.addElement(r1)
        L111:
            byte[] r2 = r5.d
            int r3 = r5.a
            r2 = r2[r3]
            r4 = 41
            if (r2 != r4) goto L13
            int r3 = r3 + 1
            r5.a = r3
            int r1 = r0.size()
            com.sun.mail.imap.protocol.l[] r1 = new com.sun.mail.imap.protocol.l[r1]
            r5.t = r1
            r0.copyInto(r1)
            return
        L12b:
            com.sun.mail.iap.ParsingException r0 = new com.sun.mail.iap.ParsingException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "error in FETCH parsing, ran off end of buffer, size "
            r1.<init>(r2)
            int r2 = r5.c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L141:
            com.sun.mail.iap.ParsingException r0 = new com.sun.mail.iap.ParsingException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "error in FETCH parsing, missing '(' at index "
            r1.<init>(r2)
            int r2 = r5.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public com.sun.mail.imap.protocol.l I(int r2) {
            r1 = this;
            com.sun.mail.imap.protocol.l[] r0 = r1.t
            r2 = r0[r2]
            return r2
    }

    public com.sun.mail.imap.protocol.l J(java.lang.Class r4) {
            r3 = this;
            r0 = 0
        L1:
            com.sun.mail.imap.protocol.l[] r1 = r3.t
            int r2 = r1.length
            if (r0 < r2) goto L8
            r4 = 0
            return r4
        L8:
            r1 = r1[r0]
            boolean r1 = r4.isInstance(r1)
            if (r1 == 0) goto L15
            com.sun.mail.imap.protocol.l[] r4 = r3.t
            r4 = r4[r0]
            return r4
        L15:
            int r0 = r0 + 1
            goto L1
    }

    public int L() {
            r1 = this;
            com.sun.mail.imap.protocol.l[] r0 = r1.t
            int r0 = r0.length
            return r0
    }
}
