package com.sun.mail.pop3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a extends javax.mail.Folder {
    a(com.sun.mail.pop3.e r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public void appendMessages(javax.mail.Message[] r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.MethodNotSupportedException r2 = new javax.mail.MethodNotSupportedException
            java.lang.String r0 = "Append not supported"
            r2.<init>(r0)
            throw r2
    }

    protected javax.mail.Folder b() throws javax.mail.MessagingException {
            r2 = this;
            javax.mail.Store r0 = r2.getStore()
            java.lang.String r1 = "INBOX"
            javax.mail.Folder r0 = r0.getFolder(r1)
            return r0
    }

    public void close(boolean r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.MethodNotSupportedException r2 = new javax.mail.MethodNotSupportedException
            java.lang.String r0 = "close"
            r2.<init>(r0)
            throw r2
    }

    public boolean create(int r1) throws javax.mail.MessagingException {
            r0 = this;
            r1 = 0
            return r1
    }

    public boolean delete(boolean r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.MethodNotSupportedException r2 = new javax.mail.MethodNotSupportedException
            java.lang.String r0 = "delete"
            r2.<init>(r0)
            throw r2
    }

    public boolean exists() {
            r1 = this;
            r0 = 1
            return r0
    }

    public javax.mail.Message[] expunge() throws javax.mail.MessagingException {
            r2 = this;
            javax.mail.MethodNotSupportedException r0 = new javax.mail.MethodNotSupportedException
            java.lang.String r1 = "expunge"
            r0.<init>(r1)
            throw r0
    }

    public javax.mail.Folder getFolder(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            java.lang.String r0 = "INBOX"
            boolean r2 = r2.equalsIgnoreCase(r0)
            if (r2 == 0) goto Ld
            javax.mail.Folder r2 = r1.b()
            return r2
        Ld:
            javax.mail.MessagingException r2 = new javax.mail.MessagingException
            java.lang.String r0 = "only INBOX supported"
            r2.<init>(r0)
            throw r2
    }

    public java.lang.String getFullName() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    public javax.mail.Message getMessage(int r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.MethodNotSupportedException r2 = new javax.mail.MethodNotSupportedException
            java.lang.String r0 = "getMessage"
            r2.<init>(r0)
            throw r2
    }

    public int getMessageCount() throws javax.mail.MessagingException {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    public javax.mail.Folder getParent() {
            r1 = this;
            r0 = 0
            return r0
    }

    public javax.mail.Flags getPermanentFlags() {
            r1 = this;
            javax.mail.Flags r0 = new javax.mail.Flags
            r0.<init>()
            return r0
    }

    public char getSeparator() {
            r1 = this;
            r0 = 47
            return r0
    }

    public int getType() {
            r1 = this;
            r0 = 2
            return r0
    }

    public boolean hasNewMessages() throws javax.mail.MessagingException {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isOpen() {
            r1 = this;
            r0 = 0
            return r0
    }

    public javax.mail.Folder[] list(java.lang.String r3) throws javax.mail.MessagingException {
            r2 = this;
            javax.mail.Folder r3 = r2.b()
            r0 = 1
            javax.mail.Folder[] r0 = new javax.mail.Folder[r0]
            r1 = 0
            r0[r1] = r3
            return r0
    }

    public void open(int r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.MethodNotSupportedException r2 = new javax.mail.MethodNotSupportedException
            java.lang.String r0 = "open"
            r2.<init>(r0)
            throw r2
    }

    public boolean renameTo(javax.mail.Folder r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.MethodNotSupportedException r2 = new javax.mail.MethodNotSupportedException
            java.lang.String r0 = "renameTo"
            r2.<init>(r0)
            throw r2
    }
}
