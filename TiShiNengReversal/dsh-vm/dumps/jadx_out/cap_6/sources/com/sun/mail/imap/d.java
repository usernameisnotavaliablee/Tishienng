package com.sun.mail.imap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d extends javax.mail.internet.MimeBodyPart {
    private com.sun.mail.imap.g a;
    private com.sun.mail.imap.protocol.d b;
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.String e;
    private boolean f;

    protected d(com.sun.mail.imap.protocol.d r2, java.lang.String r3, com.sun.mail.imap.g r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f = r0
            r1.b = r2
            r1.c = r3
            r1.a = r4
            javax.mail.internet.ContentType r3 = new javax.mail.internet.ContentType
            java.lang.String r4 = r2.b
            java.lang.String r0 = r2.c
            javax.mail.internet.ParameterList r2 = r2.l
            r3.<init>(r4, r0, r2)
            java.lang.String r2 = r3.toString()
            r1.d = r2
            return
    }

    private synchronized void a() throws javax.mail.MessagingException {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L7
            monitor-exit(r5)
            return
        L7:
            javax.mail.internet.InternetHeaders r0 = r5.headers     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L16
            javax.mail.internet.InternetHeaders r0 = new javax.mail.internet.InternetHeaders     // Catch: java.lang.Throwable -> L13
            r0.<init>()     // Catch: java.lang.Throwable -> L13
            r5.headers = r0     // Catch: java.lang.Throwable -> L13
            goto L16
        L13:
            r0 = move-exception
            goto Lcd
        L16:
            com.sun.mail.imap.g r0 = r5.a     // Catch: java.lang.Throwable -> L13
            java.lang.Object r0 = r0.t()     // Catch: java.lang.Throwable -> L13
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L13
            com.sun.mail.imap.g r1 = r5.a     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            com.sun.mail.imap.protocol.h r1 = r1.v()     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            com.sun.mail.imap.g r2 = r5.a     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            r2.n()     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            boolean r2 = r1.i0()     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            if (r2 == 0) goto L70
            com.sun.mail.imap.g r2 = r5.a     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            int r2 = r2.w()     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            java.lang.String r4 = r5.c     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            java.lang.String r4 = ".MIME"
            r3.append(r4)     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            com.sun.mail.imap.protocol.c r1 = r1.u0(r2, r3)     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            if (r1 == 0) goto L68
            java.io.ByteArrayInputStream r1 = r1.b()     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            if (r1 == 0) goto L60
            javax.mail.internet.InternetHeaders r2 = r5.headers     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            r2.load(r1)     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            goto Lab
        L5a:
            r1 = move-exception
            goto Lcb
        L5c:
            r1 = move-exception
            goto Lb1
        L5e:
            r1 = move-exception
            goto Lbb
        L60:
            javax.mail.MessagingException r1 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            java.lang.String r2 = "Failed to fetch headers"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            throw r1     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
        L68:
            javax.mail.MessagingException r1 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            java.lang.String r2 = "Failed to fetch headers"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            throw r1     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
        L70:
            javax.mail.internet.InternetHeaders r1 = r5.headers     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = r5.d     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            r1.addHeader(r2, r3)     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            javax.mail.internet.InternetHeaders r1 = r5.headers     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            java.lang.String r2 = "Content-Transfer-Encoding"
            com.sun.mail.imap.protocol.d r3 = r5.b     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            java.lang.String r3 = r3.d     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            r1.addHeader(r2, r3)     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            com.sun.mail.imap.protocol.d r1 = r5.b     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            java.lang.String r1 = r1.i     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            if (r1 == 0) goto L91
            javax.mail.internet.InternetHeaders r2 = r5.headers     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            java.lang.String r3 = "Content-Description"
            r2.addHeader(r3, r1)     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
        L91:
            com.sun.mail.imap.protocol.d r1 = r5.b     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            java.lang.String r1 = r1.h     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            if (r1 == 0) goto L9e
            javax.mail.internet.InternetHeaders r2 = r5.headers     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            java.lang.String r3 = "Content-ID"
            r2.addHeader(r3, r1)     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
        L9e:
            com.sun.mail.imap.protocol.d r1 = r5.b     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            java.lang.String r1 = r1.j     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            if (r1 == 0) goto Lab
            javax.mail.internet.InternetHeaders r2 = r5.headers     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
            java.lang.String r3 = "Content-MD5"
            r2.addHeader(r3, r1)     // Catch: java.lang.Throwable -> L5a com.sun.mail.iap.ProtocolException -> L5c com.sun.mail.iap.ConnectionException -> L5e
        Lab:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
            r0 = 1
            r5.f = r0     // Catch: java.lang.Throwable -> L13
            monitor-exit(r5)
            return
        Lb1:
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L5a
            java.lang.String r3 = r1.getMessage()     // Catch: java.lang.Throwable -> L5a
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L5a
            throw r2     // Catch: java.lang.Throwable -> L5a
        Lbb:
            javax.mail.FolderClosedException r2 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> L5a
            com.sun.mail.imap.g r3 = r5.a     // Catch: java.lang.Throwable -> L5a
            javax.mail.Folder r3 = r3.getFolder()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L5a
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L5a
            throw r2     // Catch: java.lang.Throwable -> L5a
        Lcb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
            throw r1     // Catch: java.lang.Throwable -> L13
        Lcd:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L13
            throw r0
    }

    public void addHeader(java.lang.String r1, java.lang.String r2) throws javax.mail.MessagingException {
            r0 = this;
            javax.mail.IllegalWriteException r1 = new javax.mail.IllegalWriteException
            java.lang.String r2 = "IMAPBodyPart is read-only"
            r1.<init>(r2)
            throw r1
    }

    public void addHeaderLine(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.IllegalWriteException r2 = new javax.mail.IllegalWriteException
            java.lang.String r0 = "IMAPBodyPart is read-only"
            r2.<init>(r0)
            throw r2
    }

    public java.util.Enumeration getAllHeaderLines() throws javax.mail.MessagingException {
            r1 = this;
            r1.a()
            java.util.Enumeration r0 = super.getAllHeaderLines()
            return r0
    }

    public java.util.Enumeration getAllHeaders() throws javax.mail.MessagingException {
            r1 = this;
            r1.a()
            java.util.Enumeration r0 = super.getAllHeaders()
            return r0
    }

    public java.lang.String getContentID() throws javax.mail.MessagingException {
            r1 = this;
            com.sun.mail.imap.protocol.d r0 = r1.b
            java.lang.String r0 = r0.h
            return r0
    }

    public java.lang.String getContentMD5() throws javax.mail.MessagingException {
            r1 = this;
            com.sun.mail.imap.protocol.d r0 = r1.b
            java.lang.String r0 = r0.j
            return r0
    }

    protected java.io.InputStream getContentStream() throws javax.mail.MessagingException {
            r6 = this;
            com.sun.mail.imap.g r0 = r6.a
            boolean r0 = r0.u()
            com.sun.mail.imap.g r1 = r6.a
            java.lang.Object r1 = r1.t()
            monitor-enter(r1)
            com.sun.mail.imap.g r2 = r6.a     // Catch: java.lang.Throwable -> L36 com.sun.mail.iap.ProtocolException -> L38 com.sun.mail.iap.ConnectionException -> L3a
            com.sun.mail.imap.protocol.h r2 = r2.v()     // Catch: java.lang.Throwable -> L36 com.sun.mail.iap.ProtocolException -> L38 com.sun.mail.iap.ConnectionException -> L3a
            com.sun.mail.imap.g r3 = r6.a     // Catch: java.lang.Throwable -> L36 com.sun.mail.iap.ProtocolException -> L38 com.sun.mail.iap.ConnectionException -> L3a
            r3.n()     // Catch: java.lang.Throwable -> L36 com.sun.mail.iap.ProtocolException -> L38 com.sun.mail.iap.ConnectionException -> L3a
            boolean r3 = r2.i0()     // Catch: java.lang.Throwable -> L36 com.sun.mail.iap.ProtocolException -> L38 com.sun.mail.iap.ConnectionException -> L3a
            if (r3 == 0) goto L3c
            com.sun.mail.imap.g r3 = r6.a     // Catch: java.lang.Throwable -> L36 com.sun.mail.iap.ProtocolException -> L38 com.sun.mail.iap.ConnectionException -> L3a
            int r3 = r3.r()     // Catch: java.lang.Throwable -> L36 com.sun.mail.iap.ProtocolException -> L38 com.sun.mail.iap.ConnectionException -> L3a
            r4 = -1
            if (r3 == r4) goto L3c
            com.sun.mail.imap.f r2 = new com.sun.mail.imap.f     // Catch: java.lang.Throwable -> L36 com.sun.mail.iap.ProtocolException -> L38 com.sun.mail.iap.ConnectionException -> L3a
            com.sun.mail.imap.g r3 = r6.a     // Catch: java.lang.Throwable -> L36 com.sun.mail.iap.ProtocolException -> L38 com.sun.mail.iap.ConnectionException -> L3a
            java.lang.String r4 = r6.c     // Catch: java.lang.Throwable -> L36 com.sun.mail.iap.ProtocolException -> L38 com.sun.mail.iap.ConnectionException -> L3a
            com.sun.mail.imap.protocol.d r5 = r6.b     // Catch: java.lang.Throwable -> L36 com.sun.mail.iap.ProtocolException -> L38 com.sun.mail.iap.ConnectionException -> L3a
            int r5 = r5.f     // Catch: java.lang.Throwable -> L36 com.sun.mail.iap.ProtocolException -> L38 com.sun.mail.iap.ConnectionException -> L3a
            r2.<init>(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> L36 com.sun.mail.iap.ProtocolException -> L38 com.sun.mail.iap.ConnectionException -> L3a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L36
            return r2
        L36:
            r0 = move-exception
            goto L7f
        L38:
            r0 = move-exception
            goto L65
        L3a:
            r0 = move-exception
            goto L6f
        L3c:
            com.sun.mail.imap.g r3 = r6.a     // Catch: java.lang.Throwable -> L36 com.sun.mail.iap.ProtocolException -> L38 com.sun.mail.iap.ConnectionException -> L3a
            int r3 = r3.w()     // Catch: java.lang.Throwable -> L36 com.sun.mail.iap.ProtocolException -> L38 com.sun.mail.iap.ConnectionException -> L3a
            if (r0 == 0) goto L4b
            java.lang.String r0 = r6.c     // Catch: java.lang.Throwable -> L36 com.sun.mail.iap.ProtocolException -> L38 com.sun.mail.iap.ConnectionException -> L3a
            com.sun.mail.imap.protocol.c r0 = r2.u0(r3, r0)     // Catch: java.lang.Throwable -> L36 com.sun.mail.iap.ProtocolException -> L38 com.sun.mail.iap.ConnectionException -> L3a
            goto L51
        L4b:
            java.lang.String r0 = r6.c     // Catch: java.lang.Throwable -> L36 com.sun.mail.iap.ProtocolException -> L38 com.sun.mail.iap.ConnectionException -> L3a
            com.sun.mail.imap.protocol.c r0 = r2.M(r3, r0)     // Catch: java.lang.Throwable -> L36 com.sun.mail.iap.ProtocolException -> L38 com.sun.mail.iap.ConnectionException -> L3a
        L51:
            if (r0 == 0) goto L58
            java.io.ByteArrayInputStream r0 = r0.b()     // Catch: java.lang.Throwable -> L36 com.sun.mail.iap.ProtocolException -> L38 com.sun.mail.iap.ConnectionException -> L3a
            goto L59
        L58:
            r0 = 0
        L59:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L5d
            return r0
        L5d:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException
            java.lang.String r1 = "No content"
            r0.<init>(r1)
            throw r0
        L65:
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = r0.getMessage()     // Catch: java.lang.Throwable -> L36
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L36
            throw r2     // Catch: java.lang.Throwable -> L36
        L6f:
            javax.mail.FolderClosedException r2 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> L36
            com.sun.mail.imap.g r3 = r6.a     // Catch: java.lang.Throwable -> L36
            javax.mail.Folder r3 = r3.getFolder()     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L36
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L36
            throw r2     // Catch: java.lang.Throwable -> L36
        L7f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L36
            throw r0
    }

    public java.lang.String getContentType() throws javax.mail.MessagingException {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }

    public synchronized javax.activation.DataHandler getDataHandler() throws javax.mail.MessagingException {
            r6 = this;
            monitor-enter(r6)
            javax.activation.DataHandler r0 = r6.dh     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L4f
            com.sun.mail.imap.protocol.d r0 = r6.b     // Catch: java.lang.Throwable -> L22
            boolean r0 = r0.a()     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L24
            javax.activation.DataHandler r0 = new javax.activation.DataHandler     // Catch: java.lang.Throwable -> L22
            com.sun.mail.imap.h r1 = new com.sun.mail.imap.h     // Catch: java.lang.Throwable -> L22
            com.sun.mail.imap.protocol.d r2 = r6.b     // Catch: java.lang.Throwable -> L22
            com.sun.mail.imap.protocol.d[] r2 = r2.o     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = r6.c     // Catch: java.lang.Throwable -> L22
            com.sun.mail.imap.g r4 = r6.a     // Catch: java.lang.Throwable -> L22
            r1.<init>(r6, r2, r3, r4)     // Catch: java.lang.Throwable -> L22
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L22
            r6.dh = r0     // Catch: java.lang.Throwable -> L22
            goto L4f
        L22:
            r0 = move-exception
            goto L55
        L24:
            com.sun.mail.imap.protocol.d r0 = r6.b     // Catch: java.lang.Throwable -> L22
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L4f
            com.sun.mail.imap.g r0 = r6.a     // Catch: java.lang.Throwable -> L22
            boolean r0 = r0.A()     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L4f
            javax.activation.DataHandler r0 = new javax.activation.DataHandler     // Catch: java.lang.Throwable -> L22
            com.sun.mail.imap.i r1 = new com.sun.mail.imap.i     // Catch: java.lang.Throwable -> L22
            com.sun.mail.imap.g r2 = r6.a     // Catch: java.lang.Throwable -> L22
            com.sun.mail.imap.protocol.d r3 = r6.b     // Catch: java.lang.Throwable -> L22
            com.sun.mail.imap.protocol.d[] r4 = r3.o     // Catch: java.lang.Throwable -> L22
            r5 = 0
            r4 = r4[r5]     // Catch: java.lang.Throwable -> L22
            com.sun.mail.imap.protocol.e r3 = r3.p     // Catch: java.lang.Throwable -> L22
            java.lang.String r5 = r6.c     // Catch: java.lang.Throwable -> L22
            r1.<init>(r2, r4, r3, r5)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = r6.d     // Catch: java.lang.Throwable -> L22
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L22
            r6.dh = r0     // Catch: java.lang.Throwable -> L22
        L4f:
            javax.activation.DataHandler r0 = super.getDataHandler()     // Catch: java.lang.Throwable -> L22
            monitor-exit(r6)
            return r0
        L55:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L22
            throw r0
    }

    public java.lang.String getDescription() throws javax.mail.MessagingException {
            r1 = this;
            java.lang.String r0 = r1.e
            if (r0 == 0) goto L5
            return r0
        L5:
            com.sun.mail.imap.protocol.d r0 = r1.b
            java.lang.String r0 = r0.i
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            java.lang.String r0 = javax.mail.internet.MimeUtility.decodeText(r0)     // Catch: java.io.UnsupportedEncodingException -> L14
            r1.e = r0     // Catch: java.io.UnsupportedEncodingException -> L14
            goto L1a
        L14:
            com.sun.mail.imap.protocol.d r0 = r1.b
            java.lang.String r0 = r0.i
            r1.e = r0
        L1a:
            java.lang.String r0 = r1.e
            return r0
    }

    public java.lang.String getDisposition() throws javax.mail.MessagingException {
            r1 = this;
            com.sun.mail.imap.protocol.d r0 = r1.b
            java.lang.String r0 = r0.g
            return r0
    }

    public java.lang.String getEncoding() throws javax.mail.MessagingException {
            r1 = this;
            com.sun.mail.imap.protocol.d r0 = r1.b
            java.lang.String r0 = r0.d
            return r0
    }

    public java.lang.String getFileName() throws javax.mail.MessagingException {
            r2 = this;
            com.sun.mail.imap.protocol.d r0 = r2.b
            javax.mail.internet.ParameterList r0 = r0.m
            if (r0 == 0) goto Ld
            java.lang.String r1 = "filename"
            java.lang.String r0 = r0.get(r1)
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 != 0) goto L1c
            com.sun.mail.imap.protocol.d r1 = r2.b
            javax.mail.internet.ParameterList r1 = r1.l
            if (r1 == 0) goto L1c
            java.lang.String r0 = "name"
            java.lang.String r0 = r1.get(r0)
        L1c:
            return r0
    }

    public java.lang.String[] getHeader(java.lang.String r1) throws javax.mail.MessagingException {
            r0 = this;
            r0.a()
            java.lang.String[] r1 = super.getHeader(r1)
            return r1
    }

    public int getLineCount() throws javax.mail.MessagingException {
            r1 = this;
            com.sun.mail.imap.protocol.d r0 = r1.b
            int r0 = r0.e
            return r0
    }

    public java.util.Enumeration getMatchingHeaderLines(java.lang.String[] r1) throws javax.mail.MessagingException {
            r0 = this;
            r0.a()
            java.util.Enumeration r1 = super.getMatchingHeaderLines(r1)
            return r1
    }

    public java.util.Enumeration getMatchingHeaders(java.lang.String[] r1) throws javax.mail.MessagingException {
            r0 = this;
            r0.a()
            java.util.Enumeration r1 = super.getMatchingHeaders(r1)
            return r1
    }

    public java.util.Enumeration getNonMatchingHeaderLines(java.lang.String[] r1) throws javax.mail.MessagingException {
            r0 = this;
            r0.a()
            java.util.Enumeration r1 = super.getNonMatchingHeaderLines(r1)
            return r1
    }

    public java.util.Enumeration getNonMatchingHeaders(java.lang.String[] r1) throws javax.mail.MessagingException {
            r0 = this;
            r0.a()
            java.util.Enumeration r1 = super.getNonMatchingHeaders(r1)
            return r1
    }

    public int getSize() throws javax.mail.MessagingException {
            r1 = this;
            com.sun.mail.imap.protocol.d r0 = r1.b
            int r0 = r0.f
            return r0
    }

    public void removeHeader(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.IllegalWriteException r2 = new javax.mail.IllegalWriteException
            java.lang.String r0 = "IMAPBodyPart is read-only"
            r2.<init>(r0)
            throw r2
    }

    public void setContent(java.lang.Object r1, java.lang.String r2) throws javax.mail.MessagingException {
            r0 = this;
            javax.mail.IllegalWriteException r1 = new javax.mail.IllegalWriteException
            java.lang.String r2 = "IMAPBodyPart is read-only"
            r1.<init>(r2)
            throw r1
    }

    public void setContent(javax.mail.Multipart r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.IllegalWriteException r2 = new javax.mail.IllegalWriteException
            java.lang.String r0 = "IMAPBodyPart is read-only"
            r2.<init>(r0)
            throw r2
    }

    public void setContentMD5(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.IllegalWriteException r2 = new javax.mail.IllegalWriteException
            java.lang.String r0 = "IMAPBodyPart is read-only"
            r2.<init>(r0)
            throw r2
    }

    public void setDataHandler(javax.activation.DataHandler r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.IllegalWriteException r2 = new javax.mail.IllegalWriteException
            java.lang.String r0 = "IMAPBodyPart is read-only"
            r2.<init>(r0)
            throw r2
    }

    public void setDescription(java.lang.String r1, java.lang.String r2) throws javax.mail.MessagingException {
            r0 = this;
            javax.mail.IllegalWriteException r1 = new javax.mail.IllegalWriteException
            java.lang.String r2 = "IMAPBodyPart is read-only"
            r1.<init>(r2)
            throw r1
    }

    public void setDisposition(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.IllegalWriteException r2 = new javax.mail.IllegalWriteException
            java.lang.String r0 = "IMAPBodyPart is read-only"
            r2.<init>(r0)
            throw r2
    }

    public void setFileName(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.IllegalWriteException r2 = new javax.mail.IllegalWriteException
            java.lang.String r0 = "IMAPBodyPart is read-only"
            r2.<init>(r0)
            throw r2
    }

    public void setHeader(java.lang.String r1, java.lang.String r2) throws javax.mail.MessagingException {
            r0 = this;
            javax.mail.IllegalWriteException r1 = new javax.mail.IllegalWriteException
            java.lang.String r2 = "IMAPBodyPart is read-only"
            r1.<init>(r2)
            throw r1
    }

    protected void updateHeaders() {
            r0 = this;
            return
    }
}
