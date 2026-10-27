package com.sun.mail.handlers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class multipart_mixed implements javax.activation.DataContentHandler {
    private javax.activation.ActivationDataFlavor myDF;

    public multipart_mixed() {
            r4 = this;
            r4.<init>()
            javax.activation.ActivationDataFlavor r0 = new javax.activation.ActivationDataFlavor
            java.lang.String r1 = "multipart/mixed"
            java.lang.String r2 = "Multipart"
            java.lang.Class<javax.mail.internet.MimeMultipart> r3 = javax.mail.internet.MimeMultipart.class
            r0.<init>(r3, r1, r2)
            r4.myDF = r0
            return
    }

    public java.lang.Object getContent(javax.activation.DataSource r3) throws java.io.IOException {
            r2 = this;
            javax.mail.internet.MimeMultipart r0 = new javax.mail.internet.MimeMultipart     // Catch: javax.mail.MessagingException -> L6
            r0.<init>(r3)     // Catch: javax.mail.MessagingException -> L6
            return r0
        L6:
            r3 = move-exception
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Exception while constructing MimeMultipart"
            r0.<init>(r1)
            r0.initCause(r3)
            throw r0
    }

    public java.lang.Object getTransferData(myjava.awt.datatransfer.DataFlavor r2, javax.activation.DataSource r3) throws java.io.IOException {
            r1 = this;
            javax.activation.ActivationDataFlavor r0 = r1.myDF
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto Ld
            java.lang.Object r2 = r1.getContent(r3)
            return r2
        Ld:
            r2 = 0
            return r2
    }

    public myjava.awt.datatransfer.DataFlavor[] getTransferDataFlavors() {
            r3 = this;
            javax.activation.ActivationDataFlavor r0 = r3.myDF
            r1 = 1
            myjava.awt.datatransfer.DataFlavor[] r1 = new myjava.awt.datatransfer.DataFlavor[r1]
            r2 = 0
            r1[r2] = r0
            return r1
    }

    public void writeTo(java.lang.Object r1, java.lang.String r2, java.io.OutputStream r3) throws java.io.IOException {
            r0 = this;
            boolean r2 = r1 instanceof javax.mail.internet.MimeMultipart
            if (r2 == 0) goto L15
            javax.mail.internet.MimeMultipart r1 = (javax.mail.internet.MimeMultipart) r1     // Catch: javax.mail.MessagingException -> La
            r1.writeTo(r3)     // Catch: javax.mail.MessagingException -> La
            return
        La:
            r1 = move-exception
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L15:
            return
    }
}
