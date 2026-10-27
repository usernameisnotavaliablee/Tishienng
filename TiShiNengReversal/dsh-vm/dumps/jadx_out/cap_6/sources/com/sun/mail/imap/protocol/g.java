package com.sun.mail.imap.protocol;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class g extends javax.mail.internet.InternetAddress {
    private static final long serialVersionUID = -3835822029483122232L;
    private boolean a;
    private javax.mail.internet.InternetAddress[] b;
    private java.lang.String c;

    g(com.sun.mail.iap.g r6) throws com.sun.mail.iap.ParsingException {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.a = r0
            r6.B()
            byte r0 = r6.r()
            r1 = 40
            java.lang.String r2 = "ADDRESS parse error"
            if (r0 != r1) goto Lb8
            java.lang.String r0 = r6.w()
            r5.encodedPersonal = r0
            r6.w()
            java.lang.String r0 = r6.w()
            java.lang.String r1 = r6.w()
            byte r3 = r6.r()
            r4 = 41
            if (r3 != r4) goto Lb2
            if (r1 != 0) goto L89
            r1 = 1
            r5.a = r1
            r5.c = r0
            if (r0 != 0) goto L36
            return
        L36:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r0 = r5.c
            r2.append(r0)
            r0 = 58
            r2.append(r0)
            java.util.Vector r3 = new java.util.Vector
            r3.<init>()
        L4a:
            byte r0 = r6.n()
            if (r0 != r4) goto L51
            goto L5c
        L51:
            com.sun.mail.imap.protocol.g r0 = new com.sun.mail.imap.protocol.g
            r0.<init>(r6)
            boolean r1 = r0.a()
            if (r1 == 0) goto L73
        L5c:
            r6 = 59
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r5.address = r6
            int r6 = r3.size()
            com.sun.mail.imap.protocol.g[] r6 = new com.sun.mail.imap.protocol.g[r6]
            r5.b = r6
            r3.copyInto(r6)
            return
        L73:
            int r1 = r3.size()
            if (r1 == 0) goto L7e
            r1 = 44
            r2.append(r1)
        L7e:
            java.lang.String r1 = r0.toString()
            r2.append(r1)
            r3.addElement(r0)
            goto L4a
        L89:
            if (r0 == 0) goto Laf
            int r6 = r0.length()
            if (r6 != 0) goto L92
            goto Laf
        L92:
            int r6 = r1.length()
            if (r6 != 0) goto L9b
            r5.address = r0
            return
        L9b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            java.lang.String r0 = "@"
            r6.append(r0)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.address = r6
            return
        Laf:
            r5.address = r1
            return
        Lb2:
            com.sun.mail.iap.ParsingException r6 = new com.sun.mail.iap.ParsingException
            r6.<init>(r2)
            throw r6
        Lb8:
            com.sun.mail.iap.ParsingException r6 = new com.sun.mail.iap.ParsingException
            r6.<init>(r2)
            throw r6
    }

    boolean a() {
            r1 = this;
            boolean r0 = r1.a
            if (r0 == 0) goto La
            java.lang.String r0 = r1.c
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public javax.mail.internet.InternetAddress[] getGroup(boolean r1) throws javax.mail.internet.AddressException {
            r0 = this;
            javax.mail.internet.InternetAddress[] r1 = r0.b
            if (r1 != 0) goto L6
            r1 = 0
            return r1
        L6:
            java.lang.Object r1 = r1.clone()
            javax.mail.internet.InternetAddress[] r1 = (javax.mail.internet.InternetAddress[]) r1
            return r1
    }

    public boolean isGroup() {
            r1 = this;
            boolean r0 = r1.a
            return r0
    }
}
