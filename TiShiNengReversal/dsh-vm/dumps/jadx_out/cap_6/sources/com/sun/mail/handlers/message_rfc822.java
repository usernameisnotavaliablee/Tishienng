package com.sun.mail.handlers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class message_rfc822 implements javax.activation.DataContentHandler {
    javax.activation.ActivationDataFlavor ourDataFlavor;

    public message_rfc822() {
            r4 = this;
            r4.<init>()
            javax.activation.ActivationDataFlavor r0 = new javax.activation.ActivationDataFlavor
            java.lang.String r1 = "message/rfc822"
            java.lang.String r2 = "Message"
            java.lang.Class<javax.mail.Message> r3 = javax.mail.Message.class
            r0.<init>(r3, r1, r2)
            r4.ourDataFlavor = r0
            return
    }

    public java.lang.Object getContent(javax.activation.DataSource r4) throws java.io.IOException {
            r3 = this;
            boolean r0 = r4 instanceof javax.mail.MessageAware     // Catch: javax.mail.MessagingException -> L10
            if (r0 == 0) goto L12
            r0 = r4
            javax.mail.MessageAware r0 = (javax.mail.MessageAware) r0     // Catch: javax.mail.MessagingException -> L10
            javax.mail.MessageContext r0 = r0.getMessageContext()     // Catch: javax.mail.MessagingException -> L10
            javax.mail.Session r0 = r0.getSession()     // Catch: javax.mail.MessagingException -> L10
            goto L1c
        L10:
            r4 = move-exception
            goto L26
        L12:
            java.util.Properties r0 = new java.util.Properties     // Catch: javax.mail.MessagingException -> L10
            r0.<init>()     // Catch: javax.mail.MessagingException -> L10
            r1 = 0
            javax.mail.Session r0 = javax.mail.Session.getDefaultInstance(r0, r1)     // Catch: javax.mail.MessagingException -> L10
        L1c:
            javax.mail.internet.MimeMessage r1 = new javax.mail.internet.MimeMessage     // Catch: javax.mail.MessagingException -> L10
            java.io.InputStream r4 = r4.getInputStream()     // Catch: javax.mail.MessagingException -> L10
            r1.<init>(r0, r4)     // Catch: javax.mail.MessagingException -> L10
            return r1
        L26:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Exception creating MimeMessage in message/rfc822 DataContentHandler: "
            r1.<init>(r2)
            java.lang.String r4 = r4.toString()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public java.lang.Object getTransferData(myjava.awt.datatransfer.DataFlavor r2, javax.activation.DataSource r3) throws java.io.IOException {
            r1 = this;
            javax.activation.ActivationDataFlavor r0 = r1.ourDataFlavor
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
            javax.activation.ActivationDataFlavor r0 = r3.ourDataFlavor
            r1 = 1
            myjava.awt.datatransfer.DataFlavor[] r1 = new myjava.awt.datatransfer.DataFlavor[r1]
            r2 = 0
            r1[r2] = r0
            return r1
    }

    public void writeTo(java.lang.Object r1, java.lang.String r2, java.io.OutputStream r3) throws java.io.IOException {
            r0 = this;
            boolean r2 = r1 instanceof javax.mail.Message
            if (r2 == 0) goto L15
            javax.mail.Message r1 = (javax.mail.Message) r1
            r1.writeTo(r3)     // Catch: javax.mail.MessagingException -> La
            return
        La:
            r1 = move-exception
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L15:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "unsupported object"
            r1.<init>(r2)
            throw r1
    }
}
