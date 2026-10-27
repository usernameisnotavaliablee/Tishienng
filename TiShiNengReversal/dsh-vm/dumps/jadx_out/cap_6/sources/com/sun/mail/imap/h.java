package com.sun.mail.imap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class h extends javax.mail.internet.MimePartDataSource implements javax.mail.MultipartDataSource {
    private java.util.Vector a;

    protected h(javax.mail.internet.MimePart r6, com.sun.mail.imap.protocol.d[] r7, java.lang.String r8, com.sun.mail.imap.g r9) {
            r5 = this;
            r5.<init>(r6)
            java.util.Vector r6 = new java.util.Vector
            int r0 = r7.length
            r6.<init>(r0)
            r5.a = r6
            r6 = 0
        Lc:
            int r0 = r7.length
            if (r6 < r0) goto L10
            return
        L10:
            java.util.Vector r0 = r5.a
            com.sun.mail.imap.d r1 = new com.sun.mail.imap.d
            r2 = r7[r6]
            if (r8 != 0) goto L1f
            int r3 = r6 + 1
            java.lang.String r3 = java.lang.Integer.toString(r3)
            goto L36
        L1f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r8)
            java.lang.String r4 = "."
            r3.append(r4)
            int r4 = r6 + 1
            java.lang.String r4 = java.lang.Integer.toString(r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L36:
            r1.<init>(r2, r3, r9)
            r0.addElement(r1)
            int r6 = r6 + 1
            goto Lc
    }

    public javax.mail.BodyPart getBodyPart(int r2) throws javax.mail.MessagingException {
            r1 = this;
            java.util.Vector r0 = r1.a
            java.lang.Object r2 = r0.elementAt(r2)
            javax.mail.BodyPart r2 = (javax.mail.BodyPart) r2
            return r2
    }

    public int getCount() {
            r1 = this;
            java.util.Vector r0 = r1.a
            int r0 = r0.size()
            return r0
    }
}
