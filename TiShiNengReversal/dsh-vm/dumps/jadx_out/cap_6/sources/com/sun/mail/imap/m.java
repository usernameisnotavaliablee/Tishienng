package com.sun.mail.imap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class m implements com.sun.mail.iap.e {
    private javax.mail.Message a;
    private int b;
    private byte[] c;

    public m(javax.mail.Message r2, int r3) throws javax.mail.MessagingException, java.io.IOException {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.b = r0
            r1.a = r2
            com.sun.mail.imap.l r0 = new com.sun.mail.imap.l
            r0.<init>(r3)
            com.sun.mail.util.CRLFOutputStream r3 = new com.sun.mail.util.CRLFOutputStream
            r3.<init>(r0)
            r2.writeTo(r3)
            r3.flush()
            int r2 = r0.b()
            r1.b = r2
            byte[] r2 = r0.a()
            r1.c = r2
            return
    }

    @Override // com.sun.mail.iap.e
    public int size() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    @Override // com.sun.mail.iap.e
    public void writeTo(java.io.OutputStream r4) throws java.io.IOException {
            r3 = this;
            byte[] r0 = r3.c     // Catch: javax.mail.MessagingException -> Lb
            if (r0 == 0) goto Ld
            int r1 = r3.b     // Catch: javax.mail.MessagingException -> Lb
            r2 = 0
            r4.write(r0, r2, r1)     // Catch: javax.mail.MessagingException -> Lb
            return
        Lb:
            r4 = move-exception
            goto L18
        Ld:
            com.sun.mail.util.CRLFOutputStream r0 = new com.sun.mail.util.CRLFOutputStream     // Catch: javax.mail.MessagingException -> Lb
            r0.<init>(r4)     // Catch: javax.mail.MessagingException -> Lb
            javax.mail.Message r4 = r3.a     // Catch: javax.mail.MessagingException -> Lb
            r4.writeTo(r0)     // Catch: javax.mail.MessagingException -> Lb
            return
        L18:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "MessagingException while appending message: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }
}
