package com.sun.mail.dsn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class MessageHeaders extends javax.mail.internet.MimeMessage {
    public MessageHeaders() throws javax.mail.MessagingException {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r0 = 0
            byte[] r0 = new byte[r0]
            r1.content = r0
            return
    }

    public MessageHeaders(java.io.InputStream r2) throws javax.mail.MessagingException {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            r2 = 0
            byte[] r2 = new byte[r2]
            r1.content = r2
            return
    }

    public MessageHeaders(javax.mail.internet.InternetHeaders r2) throws javax.mail.MessagingException {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.headers = r2
            r2 = 0
            byte[] r2 = new byte[r2]
            r1.content = r2
            return
    }

    protected java.io.InputStream getContentStream() {
            r2 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            byte[] r1 = r2.content
            r0.<init>(r1)
            return r0
    }

    public java.io.InputStream getInputStream() {
            r2 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            byte[] r1 = r2.content
            r0.<init>(r1)
            return r0
    }

    public int getSize() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void setDataHandler(javax.activation.DataHandler r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.MessagingException r2 = new javax.mail.MessagingException
            java.lang.String r0 = "Can't set content for MessageHeaders"
            r2.<init>(r0)
            throw r2
    }
}
