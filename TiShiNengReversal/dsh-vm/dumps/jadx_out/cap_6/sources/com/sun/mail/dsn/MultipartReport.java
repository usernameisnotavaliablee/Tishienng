package com.sun.mail.dsn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class MultipartReport extends javax.mail.internet.MimeMultipart {
    protected boolean constructed;

    public MultipartReport() throws javax.mail.MessagingException {
            r2 = this;
            java.lang.String r0 = "report"
            r2.<init>(r0)
            javax.mail.internet.MimeBodyPart r0 = new javax.mail.internet.MimeBodyPart
            r0.<init>()
            r1 = 0
            r2.setBodyPart(r0, r1)
            javax.mail.internet.MimeBodyPart r0 = new javax.mail.internet.MimeBodyPart
            r0.<init>()
            r1 = 1
            r2.setBodyPart(r0, r1)
            r2.constructed = r1
            return
    }

    public MultipartReport(java.lang.String r4, com.sun.mail.dsn.DeliveryStatus r5) throws javax.mail.MessagingException {
            r3 = this;
            java.lang.String r0 = "report"
            r3.<init>(r0)
            javax.mail.internet.ContentType r0 = new javax.mail.internet.ContentType
            java.lang.String r1 = r3.contentType
            r0.<init>(r1)
            java.lang.String r1 = "report-type"
            java.lang.String r2 = "delivery-status"
            r0.setParameter(r1, r2)
            java.lang.String r0 = r0.toString()
            r3.contentType = r0
            javax.mail.internet.MimeBodyPart r0 = new javax.mail.internet.MimeBodyPart
            r0.<init>()
            r0.setText(r4)
            r4 = 0
            r3.setBodyPart(r0, r4)
            javax.mail.internet.MimeBodyPart r4 = new javax.mail.internet.MimeBodyPart
            r4.<init>()
            java.lang.String r0 = "message/delivery-status"
            r4.setContent(r5, r0)
            r5 = 1
            r3.setBodyPart(r4, r5)
            r3.constructed = r5
            return
    }

    public MultipartReport(java.lang.String r1, com.sun.mail.dsn.DeliveryStatus r2, javax.mail.internet.InternetHeaders r3) throws javax.mail.MessagingException {
            r0 = this;
            r0.<init>(r1, r2)
            if (r3 == 0) goto L18
            javax.mail.internet.MimeBodyPart r1 = new javax.mail.internet.MimeBodyPart
            r1.<init>()
            com.sun.mail.dsn.MessageHeaders r2 = new com.sun.mail.dsn.MessageHeaders
            r2.<init>(r3)
            java.lang.String r3 = "text/rfc822-headers"
            r1.setContent(r2, r3)
            r2 = 2
            r0.setBodyPart(r1, r2)
        L18:
            return
    }

    public MultipartReport(java.lang.String r1, com.sun.mail.dsn.DeliveryStatus r2, javax.mail.internet.MimeMessage r3) throws javax.mail.MessagingException {
            r0 = this;
            r0.<init>(r1, r2)
            if (r3 == 0) goto L13
            javax.mail.internet.MimeBodyPart r1 = new javax.mail.internet.MimeBodyPart
            r1.<init>()
            java.lang.String r2 = "message/rfc822"
            r1.setContent(r3, r2)
            r2 = 2
            r0.setBodyPart(r1, r2)
        L13:
            return
    }

    public MultipartReport(javax.activation.DataSource r1) throws javax.mail.MessagingException {
            r0 = this;
            r0.<init>(r1)
            r0.parse()
            r1 = 1
            r0.constructed = r1
            return
    }

    private synchronized void setBodyPart(javax.mail.BodyPart r2, int r3) throws javax.mail.MessagingException {
            r1 = this;
            monitor-enter(r1)
            java.util.Vector r0 = r1.parts     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto Lf
            java.util.Vector r0 = new java.util.Vector     // Catch: java.lang.Throwable -> Ld
            r0.<init>()     // Catch: java.lang.Throwable -> Ld
            r1.parts = r0     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r2 = move-exception
            goto L1f
        Lf:
            java.util.Vector r0 = r1.parts     // Catch: java.lang.Throwable -> Ld
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Ld
            if (r3 >= r0) goto L1a
            super.removeBodyPart(r3)     // Catch: java.lang.Throwable -> Ld
        L1a:
            super.addBodyPart(r2, r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        L1f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public synchronized void addBodyPart(javax.mail.BodyPart r2) throws javax.mail.MessagingException {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.constructed     // Catch: java.lang.Throwable -> La
            if (r0 != 0) goto Lc
            super.addBodyPart(r2)     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)
            return
        La:
            r2 = move-exception
            goto L14
        Lc:
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> La
            java.lang.String r0 = "Can't add body parts to multipart/report 1"
            r2.<init>(r0)     // Catch: java.lang.Throwable -> La
            throw r2     // Catch: java.lang.Throwable -> La
        L14:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r2
    }

    public synchronized void addBodyPart(javax.mail.BodyPart r1, int r2) throws javax.mail.MessagingException {
            r0 = this;
            monitor-enter(r0)
            javax.mail.MessagingException r1 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L9
            java.lang.String r2 = "Can't add body parts to multipart/report 2"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L9
            throw r1     // Catch: java.lang.Throwable -> L9
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    public synchronized com.sun.mail.dsn.DeliveryStatus getDeliveryStatus() throws javax.mail.MessagingException {
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.getCount()     // Catch: java.lang.Throwable -> L22
            r1 = 2
            r2 = 0
            if (r0 >= r1) goto Lb
            monitor-exit(r3)
            return r2
        Lb:
            r0 = 1
            javax.mail.BodyPart r0 = r3.getBodyPart(r0)     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = "message/delivery-status"
            boolean r1 = r0.isMimeType(r1)     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L1a
            monitor-exit(r3)
            return r2
        L1a:
            java.lang.Object r0 = r0.getContent()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            com.sun.mail.dsn.DeliveryStatus r0 = (com.sun.mail.dsn.DeliveryStatus) r0     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            monitor-exit(r3)
            return r0
        L22:
            r0 = move-exception
            goto L2d
        L24:
            r0 = move-exception
            javax.mail.MessagingException r1 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "IOException getting DeliveryStatus"
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L22
            throw r1     // Catch: java.lang.Throwable -> L22
        L2d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
            throw r0
    }

    public synchronized javax.mail.internet.MimeMessage getReturnedMessage() throws javax.mail.MessagingException {
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.getCount()     // Catch: java.lang.Throwable -> L22
            r1 = 3
            r2 = 0
            if (r0 >= r1) goto Lb
            monitor-exit(r3)
            return r2
        Lb:
            r0 = 2
            javax.mail.BodyPart r0 = r3.getBodyPart(r0)     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = "message/rfc822"
            boolean r1 = r0.isMimeType(r1)     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L24
            java.lang.String r1 = "text/rfc822-headers"
            boolean r1 = r0.isMimeType(r1)     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L24
            monitor-exit(r3)
            return r2
        L22:
            r0 = move-exception
            goto L35
        L24:
            java.lang.Object r0 = r0.getContent()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L2c
            javax.mail.internet.MimeMessage r0 = (javax.mail.internet.MimeMessage) r0     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L2c
            monitor-exit(r3)
            return r0
        L2c:
            r0 = move-exception
            javax.mail.MessagingException r1 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "IOException getting ReturnedMessage"
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L22
            throw r1     // Catch: java.lang.Throwable -> L22
        L35:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
            throw r0
    }

    public synchronized java.lang.String getText() throws javax.mail.MessagingException {
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            javax.mail.BodyPart r1 = r4.getBodyPart(r0)     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18
            java.lang.String r2 = "text/plain"
            boolean r2 = r1.isMimeType(r2)     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18
            if (r2 == 0) goto L1a
            java.lang.Object r0 = r1.getContent()     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18
            monitor-exit(r4)
            return r0
        L16:
            r0 = move-exception
            goto L51
        L18:
            r0 = move-exception
            goto L49
        L1a:
            java.lang.String r2 = "multipart/alternative"
            boolean r2 = r1.isMimeType(r2)     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18
            if (r2 == 0) goto L46
            java.lang.Object r1 = r1.getContent()     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18
            javax.mail.Multipart r1 = (javax.mail.Multipart) r1     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18
        L28:
            int r2 = r1.getCount()     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18
            if (r0 < r2) goto L2f
            goto L46
        L2f:
            javax.mail.BodyPart r2 = r1.getBodyPart(r0)     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18
            java.lang.String r3 = "text/plain"
            boolean r3 = r2.isMimeType(r3)     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18
            if (r3 == 0) goto L43
            java.lang.Object r0 = r2.getContent()     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18
            monitor-exit(r4)
            return r0
        L43:
            int r0 = r0 + 1
            goto L28
        L46:
            monitor-exit(r4)
            r0 = 0
            return r0
        L49:
            javax.mail.MessagingException r1 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = "Exception getting text content"
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L16
            throw r1     // Catch: java.lang.Throwable -> L16
        L51:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L16
            throw r0
    }

    public synchronized javax.mail.internet.MimeBodyPart getTextBodyPart() throws javax.mail.MessagingException {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            javax.mail.BodyPart r0 = r1.getBodyPart(r0)     // Catch: java.lang.Throwable -> La
            javax.mail.internet.MimeBodyPart r0 = (javax.mail.internet.MimeBodyPart) r0     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)
            return r0
        La:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    public void removeBodyPart(int r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.MessagingException r2 = new javax.mail.MessagingException
            java.lang.String r0 = "Can't remove body parts from multipart/report"
            r2.<init>(r0)
            throw r2
    }

    public boolean removeBodyPart(javax.mail.BodyPart r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.MessagingException r2 = new javax.mail.MessagingException
            java.lang.String r0 = "Can't remove body parts from multipart/report"
            r2.<init>(r0)
            throw r2
    }

    public synchronized void setDeliveryStatus(com.sun.mail.dsn.DeliveryStatus r3) throws javax.mail.MessagingException {
            r2 = this;
            monitor-enter(r2)
            javax.mail.internet.MimeBodyPart r0 = new javax.mail.internet.MimeBodyPart     // Catch: java.lang.Throwable -> L25
            r0.<init>()     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = "message/delivery-status"
            r0.setContent(r3, r1)     // Catch: java.lang.Throwable -> L25
            r3 = 2
            r2.setBodyPart(r0, r3)     // Catch: java.lang.Throwable -> L25
            javax.mail.internet.ContentType r3 = new javax.mail.internet.ContentType     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = r2.contentType     // Catch: java.lang.Throwable -> L25
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = "report-type"
            java.lang.String r1 = "delivery-status"
            r3.setParameter(r0, r1)     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L25
            r2.contentType = r3     // Catch: java.lang.Throwable -> L25
            monitor-exit(r2)
            return
        L25:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            throw r3
    }

    public synchronized void setReturnedMessage(javax.mail.internet.MimeMessage r4) throws javax.mail.MessagingException {
            r3 = this;
            monitor-enter(r3)
            r0 = 2
            if (r4 != 0) goto L13
            java.util.Vector r4 = r3.parts     // Catch: java.lang.Throwable -> L11
            java.lang.Object r4 = r4.elementAt(r0)     // Catch: java.lang.Throwable -> L11
            javax.mail.BodyPart r4 = (javax.mail.BodyPart) r4     // Catch: java.lang.Throwable -> L11
            super.removeBodyPart(r0)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r3)
            return
        L11:
            r4 = move-exception
            goto L2c
        L13:
            javax.mail.internet.MimeBodyPart r1 = new javax.mail.internet.MimeBodyPart     // Catch: java.lang.Throwable -> L11
            r1.<init>()     // Catch: java.lang.Throwable -> L11
            boolean r2 = r4 instanceof com.sun.mail.dsn.MessageHeaders     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto L22
            java.lang.String r2 = "text/rfc822-headers"
            r1.setContent(r4, r2)     // Catch: java.lang.Throwable -> L11
            goto L27
        L22:
            java.lang.String r2 = "message/rfc822"
            r1.setContent(r4, r2)     // Catch: java.lang.Throwable -> L11
        L27:
            r3.setBodyPart(r1, r0)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r3)
            return
        L2c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            throw r4
    }

    public synchronized void setSubType(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            monitor-enter(r1)
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L9
            java.lang.String r0 = "Can't change subtype of MultipartReport"
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L9
            throw r2     // Catch: java.lang.Throwable -> L9
        L9:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    public synchronized void setText(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            monitor-enter(r1)
            javax.mail.internet.MimeBodyPart r0 = new javax.mail.internet.MimeBodyPart     // Catch: java.lang.Throwable -> Lf
            r0.<init>()     // Catch: java.lang.Throwable -> Lf
            r0.setText(r2)     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            r1.setBodyPart(r0, r2)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return
        Lf:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    public synchronized void setTextBodyPart(javax.mail.internet.MimeBodyPart r2) throws javax.mail.MessagingException {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.setBodyPart(r2, r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r2
    }
}
