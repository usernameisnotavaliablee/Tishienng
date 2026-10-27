package com.sun.mail.imap.protocol;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class p {
    public com.sun.mail.imap.protocol.p.a[] a;
    public com.sun.mail.imap.protocol.p.a[] b;
    public com.sun.mail.imap.protocol.p.a[] c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        public java.lang.String a;
        public char b;

        public a(com.sun.mail.iap.g r4) throws com.sun.mail.iap.ProtocolException {
                r3 = this;
                r3.<init>()
                byte r0 = r4.r()
                r1 = 40
                if (r0 != r1) goto L94
                java.lang.String r0 = r4.w()
                java.lang.String r0 = com.sun.mail.imap.protocol.a.b(r0)
                r3.a = r0
                r4.B()
                byte r0 = r4.n()
                r1 = 34
                if (r0 != r1) goto L44
                r4.r()
                byte r0 = r4.r()
                char r0 = (char) r0
                r3.b = r0
                r2 = 92
                if (r0 != r2) goto L35
                byte r0 = r4.r()
                char r0 = (char) r0
                r3.b = r0
            L35:
                byte r0 = r4.r()
                if (r0 != r1) goto L3c
                goto L55
            L3c:
                com.sun.mail.iap.ProtocolException r4 = new com.sun.mail.iap.ProtocolException
                java.lang.String r0 = "Missing '\"' at end of QUOTED_CHAR"
                r4.<init>(r0)
                throw r4
            L44:
                java.lang.String r0 = r4.o()
                if (r0 == 0) goto L8c
                java.lang.String r1 = "NIL"
                boolean r1 = r0.equalsIgnoreCase(r1)
                if (r1 == 0) goto L78
                r0 = 0
                r3.b = r0
            L55:
                byte r0 = r4.n()
                r1 = 41
                if (r0 == r1) goto L69
                r4.B()
                r4.w()
                r4.B()
                r4.y()
            L69:
                byte r4 = r4.r()
                if (r4 != r1) goto L70
                return
            L70:
                com.sun.mail.iap.ProtocolException r4 = new com.sun.mail.iap.ProtocolException
                java.lang.String r0 = "Missing ')' at end of Namespace"
                r4.<init>(r0)
                throw r4
            L78:
                com.sun.mail.iap.ProtocolException r4 = new com.sun.mail.iap.ProtocolException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Expected NIL, got "
                r1.<init>(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r4.<init>(r0)
                throw r4
            L8c:
                com.sun.mail.iap.ProtocolException r4 = new com.sun.mail.iap.ProtocolException
                java.lang.String r0 = "Expected NIL, got null"
                r4.<init>(r0)
                throw r4
            L94:
                com.sun.mail.iap.ProtocolException r4 = new com.sun.mail.iap.ProtocolException
                java.lang.String r0 = "Missing '(' at start of Namespace"
                r4.<init>(r0)
                throw r4
        }
    }

    public p(com.sun.mail.iap.g r2) throws com.sun.mail.iap.ProtocolException {
            r1 = this;
            r1.<init>()
            com.sun.mail.imap.protocol.p$a[] r0 = r1.a(r2)
            r1.a = r0
            com.sun.mail.imap.protocol.p$a[] r0 = r1.a(r2)
            r1.b = r0
            com.sun.mail.imap.protocol.p$a[] r2 = r1.a(r2)
            r1.c = r2
            return
    }

    private com.sun.mail.imap.protocol.p.a[] a(com.sun.mail.iap.g r4) throws com.sun.mail.iap.ProtocolException {
            r3 = this;
            r4.B()
            byte r0 = r4.n()
            r1 = 40
            if (r0 != r1) goto L30
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r4.r()
        L13:
            com.sun.mail.imap.protocol.p$a r1 = new com.sun.mail.imap.protocol.p$a
            r1.<init>(r4)
            r0.addElement(r1)
            byte r1 = r4.n()
            r2 = 41
            if (r1 != r2) goto L13
            r4.r()
            int r4 = r0.size()
            com.sun.mail.imap.protocol.p$a[] r4 = new com.sun.mail.imap.protocol.p.a[r4]
            r0.copyInto(r4)
            return r4
        L30:
            java.lang.String r4 = r4.o()
            if (r4 == 0) goto L54
            java.lang.String r0 = "NIL"
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 == 0) goto L40
            r4 = 0
            return r4
        L40:
            com.sun.mail.iap.ProtocolException r0 = new com.sun.mail.iap.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected NIL, got "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L54:
            com.sun.mail.iap.ProtocolException r4 = new com.sun.mail.iap.ProtocolException
            java.lang.String r0 = "Expected NIL, got null"
            r4.<init>(r0)
            throw r4
    }
}
