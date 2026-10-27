package com.sun.mail.pop3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c extends javax.mail.internet.MimeMessage {
    static final java.lang.String e = "UNKNOWN";
    private com.sun.mail.pop3.b a;
    private int b;
    private int c;
    java.lang.String d;

    public c(javax.mail.Folder r1, int r2) throws javax.mail.MessagingException {
            r0 = this;
            r0.<init>(r1, r2)
            r2 = -1
            r0.b = r2
            r0.c = r2
            java.lang.String r2 = "UNKNOWN"
            r0.d = r2
            com.sun.mail.pop3.b r1 = (com.sun.mail.pop3.b) r1
            r0.a = r1
            return
    }

    private void b() throws javax.mail.MessagingException {
            r3 = this;
            r0 = 0
            monitor-enter(r3)     // Catch: java.io.IOException -> L3e java.io.EOFException -> L40
            javax.mail.internet.InternetHeaders r1 = r3.headers     // Catch: java.lang.Throwable -> L8
            if (r1 == 0) goto La
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            goto L3c
        La:
            com.sun.mail.pop3.b r1 = r3.a     // Catch: java.lang.Throwable -> L8
            javax.mail.Store r1 = r1.getStore()     // Catch: java.lang.Throwable -> L8
            com.sun.mail.pop3.e r1 = (com.sun.mail.pop3.e) r1     // Catch: java.lang.Throwable -> L8
            boolean r1 = r1.k     // Catch: java.lang.Throwable -> L8
            if (r1 != 0) goto L33
            com.sun.mail.pop3.b r1 = r3.a     // Catch: java.lang.Throwable -> L8
            com.sun.mail.pop3.f r1 = r1.g()     // Catch: java.lang.Throwable -> L8
            int r2 = r3.msgnum     // Catch: java.lang.Throwable -> L8
            java.io.InputStream r1 = r1.n(r2, r0)     // Catch: java.lang.Throwable -> L8
            if (r1 != 0) goto L25
            goto L33
        L25:
            int r2 = r1.available()     // Catch: java.lang.Throwable -> L8
            r3.b = r2     // Catch: java.lang.Throwable -> L8
            javax.mail.internet.InternetHeaders r2 = new javax.mail.internet.InternetHeaders     // Catch: java.lang.Throwable -> L8
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L8
            r3.headers = r2     // Catch: java.lang.Throwable -> L8
            goto L3a
        L33:
            java.io.InputStream r1 = r3.getContentStream()     // Catch: java.lang.Throwable -> L8
            r1.close()     // Catch: java.lang.Throwable -> L8
        L3a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8
            return
        L3c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8
            throw r1     // Catch: java.io.IOException -> L3e java.io.EOFException -> L40
        L3e:
            r0 = move-exception
            goto L42
        L40:
            r1 = move-exception
            goto L4a
        L42:
            javax.mail.MessagingException r1 = new javax.mail.MessagingException
            java.lang.String r2 = "error loading POP3 headers"
            r1.<init>(r2, r0)
            throw r1
        L4a:
            com.sun.mail.pop3.b r2 = r3.a
            r2.close(r0)
            javax.mail.FolderClosedException r0 = new javax.mail.FolderClosedException
            com.sun.mail.pop3.b r2 = r3.a
            java.lang.String r1 = r1.toString()
            r0.<init>(r2, r1)
            throw r0
    }

    public synchronized void a(boolean r3) {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            r2.content = r0     // Catch: java.lang.Throwable -> L10
            r2.contentStream = r0     // Catch: java.lang.Throwable -> L10
            r1 = -1
            r2.c = r1     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L12
            r2.headers = r0     // Catch: java.lang.Throwable -> L10
            r2.b = r1     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r3 = move-exception
            goto L14
        L12:
            monitor-exit(r2)
            return
        L14:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            throw r3
    }

    public void addHeader(java.lang.String r1, java.lang.String r2) throws javax.mail.MessagingException {
            r0 = this;
            javax.mail.IllegalWriteException r1 = new javax.mail.IllegalWriteException
            java.lang.String r2 = "POP3 messages are read-only"
            r1.<init>(r2)
            throw r1
    }

    public void addHeaderLine(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.IllegalWriteException r2 = new javax.mail.IllegalWriteException
            java.lang.String r0 = "POP3 messages are read-only"
            r2.<init>(r0)
            throw r2
    }

    public java.io.InputStream c(int r3) throws javax.mail.MessagingException {
            r2 = this;
            monitor-enter(r2)     // Catch: java.io.IOException -> L12 java.io.EOFException -> L14
            com.sun.mail.pop3.b r0 = r2.a     // Catch: java.lang.Throwable -> Lf
            com.sun.mail.pop3.f r0 = r0.g()     // Catch: java.lang.Throwable -> Lf
            int r1 = r2.msgnum     // Catch: java.lang.Throwable -> Lf
            java.io.InputStream r3 = r0.n(r1, r3)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            return r3
        Lf:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.io.IOException -> L12 java.io.EOFException -> L14
        L12:
            r3 = move-exception
            goto L16
        L14:
            r3 = move-exception
            goto L1e
        L16:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException
            java.lang.String r1 = "error getting size"
            r0.<init>(r1, r3)
            throw r0
        L1e:
            com.sun.mail.pop3.b r0 = r2.a
            r1 = 0
            r0.close(r1)
            javax.mail.FolderClosedException r0 = new javax.mail.FolderClosedException
            com.sun.mail.pop3.b r1 = r2.a
            java.lang.String r3 = r3.toString()
            r0.<init>(r1, r3)
            throw r0
    }

    public java.util.Enumeration getAllHeaderLines() throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.InternetHeaders r0 = r1.headers
            if (r0 != 0) goto L7
            r1.b()
        L7:
            javax.mail.internet.InternetHeaders r0 = r1.headers
            java.util.Enumeration r0 = r0.getAllHeaderLines()
            return r0
    }

    public java.util.Enumeration getAllHeaders() throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.InternetHeaders r0 = r1.headers
            if (r0 != 0) goto L7
            r1.b()
        L7:
            javax.mail.internet.InternetHeaders r0 = r1.headers
            java.util.Enumeration r0 = r0.getAllHeaders()
            return r0
    }

    protected java.io.InputStream getContentStream() throws javax.mail.MessagingException {
            r7 = this;
            r0 = 0
            monitor-enter(r7)     // Catch: java.io.IOException -> L9b java.io.EOFException -> L9d
            java.io.InputStream r1 = r7.contentStream     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L93
            com.sun.mail.pop3.b r1 = r7.a     // Catch: java.lang.Throwable -> L16
            com.sun.mail.pop3.f r1 = r1.g()     // Catch: java.lang.Throwable -> L16
            int r2 = r7.msgnum     // Catch: java.lang.Throwable -> L16
            int r3 = r7.c     // Catch: java.lang.Throwable -> L16
            if (r3 <= 0) goto L19
            int r4 = r7.b     // Catch: java.lang.Throwable -> L16
            int r3 = r3 + r4
            goto L1a
        L16:
            r1 = move-exception
            goto L99
        L19:
            r3 = 0
        L1a:
            java.io.InputStream r1 = r1.i(r2, r3)     // Catch: java.lang.Throwable -> L16
            r2 = 1
            if (r1 == 0) goto L8b
            javax.mail.internet.InternetHeaders r3 = r7.headers     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto L6c
            com.sun.mail.pop3.b r3 = r7.a     // Catch: java.lang.Throwable -> L16
            javax.mail.Store r3 = r3.getStore()     // Catch: java.lang.Throwable -> L16
            com.sun.mail.pop3.e r3 = (com.sun.mail.pop3.e) r3     // Catch: java.lang.Throwable -> L16
            boolean r3 = r3.l     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto L32
            goto L6c
        L32:
            r3 = 0
        L33:
            int r4 = r1.read()     // Catch: java.lang.Throwable -> L16
            if (r4 >= 0) goto L3a
            goto L55
        L3a:
            r5 = 10
            if (r4 != r5) goto L3f
            goto L55
        L3f:
            r6 = 13
            if (r4 != r6) goto L69
            int r4 = r1.available()     // Catch: java.lang.Throwable -> L16
            if (r4 <= 0) goto L55
            r1.mark(r2)     // Catch: java.lang.Throwable -> L16
            int r4 = r1.read()     // Catch: java.lang.Throwable -> L16
            if (r4 == r5) goto L55
            r1.reset()     // Catch: java.lang.Throwable -> L16
        L55:
            int r4 = r1.available()     // Catch: java.lang.Throwable -> L16
            if (r4 != 0) goto L5c
            goto L5e
        L5c:
            if (r3 != 0) goto L32
        L5e:
            r2 = r1
            javax.mail.internet.SharedInputStream r2 = (javax.mail.internet.SharedInputStream) r2     // Catch: java.lang.Throwable -> L16
            long r2 = r2.getPosition()     // Catch: java.lang.Throwable -> L16
            int r3 = (int) r2     // Catch: java.lang.Throwable -> L16
            r7.b = r3     // Catch: java.lang.Throwable -> L16
            goto L7d
        L69:
            int r3 = r3 + 1
            goto L33
        L6c:
            javax.mail.internet.InternetHeaders r2 = new javax.mail.internet.InternetHeaders     // Catch: java.lang.Throwable -> L16
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L16
            r7.headers = r2     // Catch: java.lang.Throwable -> L16
            r2 = r1
            javax.mail.internet.SharedInputStream r2 = (javax.mail.internet.SharedInputStream) r2     // Catch: java.lang.Throwable -> L16
            long r2 = r2.getPosition()     // Catch: java.lang.Throwable -> L16
            int r3 = (int) r2     // Catch: java.lang.Throwable -> L16
            r7.b = r3     // Catch: java.lang.Throwable -> L16
        L7d:
            javax.mail.internet.SharedInputStream r1 = (javax.mail.internet.SharedInputStream) r1     // Catch: java.lang.Throwable -> L16
            int r2 = r7.b     // Catch: java.lang.Throwable -> L16
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L16
            r4 = -1
            java.io.InputStream r1 = r1.newStream(r2, r4)     // Catch: java.lang.Throwable -> L16
            r7.contentStream = r1     // Catch: java.lang.Throwable -> L16
            goto L93
        L8b:
            r7.expunged = r2     // Catch: java.lang.Throwable -> L16
            javax.mail.MessageRemovedException r1 = new javax.mail.MessageRemovedException     // Catch: java.lang.Throwable -> L16
            r1.<init>()     // Catch: java.lang.Throwable -> L16
            throw r1     // Catch: java.lang.Throwable -> L16
        L93:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L16
            java.io.InputStream r0 = super.getContentStream()
            return r0
        L99:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L16
            throw r1     // Catch: java.io.IOException -> L9b java.io.EOFException -> L9d
        L9b:
            r0 = move-exception
            goto L9f
        L9d:
            r1 = move-exception
            goto La7
        L9f:
            javax.mail.MessagingException r1 = new javax.mail.MessagingException
            java.lang.String r2 = "error fetching POP3 content"
            r1.<init>(r2, r0)
            throw r1
        La7:
            com.sun.mail.pop3.b r2 = r7.a
            r2.close(r0)
            javax.mail.FolderClosedException r0 = new javax.mail.FolderClosedException
            com.sun.mail.pop3.b r2 = r7.a
            java.lang.String r1 = r1.toString()
            r0.<init>(r2, r1)
            throw r0
    }

    public java.lang.String getHeader(java.lang.String r2, java.lang.String r3) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.InternetHeaders r0 = r1.headers
            if (r0 != 0) goto L7
            r1.b()
        L7:
            javax.mail.internet.InternetHeaders r0 = r1.headers
            java.lang.String r2 = r0.getHeader(r2, r3)
            return r2
    }

    public java.lang.String[] getHeader(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.InternetHeaders r0 = r1.headers
            if (r0 != 0) goto L7
            r1.b()
        L7:
            javax.mail.internet.InternetHeaders r0 = r1.headers
            java.lang.String[] r2 = r0.getHeader(r2)
            return r2
    }

    public java.util.Enumeration getMatchingHeaderLines(java.lang.String[] r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.InternetHeaders r0 = r1.headers
            if (r0 != 0) goto L7
            r1.b()
        L7:
            javax.mail.internet.InternetHeaders r0 = r1.headers
            java.util.Enumeration r2 = r0.getMatchingHeaderLines(r2)
            return r2
    }

    public java.util.Enumeration getMatchingHeaders(java.lang.String[] r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.InternetHeaders r0 = r1.headers
            if (r0 != 0) goto L7
            r1.b()
        L7:
            javax.mail.internet.InternetHeaders r0 = r1.headers
            java.util.Enumeration r2 = r0.getMatchingHeaders(r2)
            return r2
    }

    public java.util.Enumeration getNonMatchingHeaderLines(java.lang.String[] r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.InternetHeaders r0 = r1.headers
            if (r0 != 0) goto L7
            r1.b()
        L7:
            javax.mail.internet.InternetHeaders r0 = r1.headers
            java.util.Enumeration r2 = r0.getNonMatchingHeaderLines(r2)
            return r2
    }

    public java.util.Enumeration getNonMatchingHeaders(java.lang.String[] r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.InternetHeaders r0 = r1.headers
            if (r0 != 0) goto L7
            r1.b()
        L7:
            javax.mail.internet.InternetHeaders r0 = r1.headers
            java.util.Enumeration r2 = r0.getNonMatchingHeaders(r2)
            return r2
    }

    public int getSize() throws javax.mail.MessagingException {
            r3 = this;
            monitor-enter(r3)     // Catch: java.io.IOException -> L34 java.io.EOFException -> L36
            int r0 = r3.c     // Catch: java.lang.Throwable -> L7
            if (r0 < 0) goto L9
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = move-exception
            goto L32
        L9:
            if (r0 >= 0) goto L2e
            javax.mail.internet.InternetHeaders r0 = r3.headers     // Catch: java.lang.Throwable -> L7
            if (r0 != 0) goto L12
            r3.b()     // Catch: java.lang.Throwable -> L7
        L12:
            java.io.InputStream r0 = r3.contentStream     // Catch: java.lang.Throwable -> L7
            if (r0 == 0) goto L1d
            int r0 = r0.available()     // Catch: java.lang.Throwable -> L7
            r3.c = r0     // Catch: java.lang.Throwable -> L7
            goto L2e
        L1d:
            com.sun.mail.pop3.b r0 = r3.a     // Catch: java.lang.Throwable -> L7
            com.sun.mail.pop3.f r0 = r0.g()     // Catch: java.lang.Throwable -> L7
            int r1 = r3.msgnum     // Catch: java.lang.Throwable -> L7
            int r0 = r0.c(r1)     // Catch: java.lang.Throwable -> L7
            int r1 = r3.b     // Catch: java.lang.Throwable -> L7
            int r0 = r0 - r1
            r3.c = r0     // Catch: java.lang.Throwable -> L7
        L2e:
            int r0 = r3.c     // Catch: java.lang.Throwable -> L7
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
            return r0
        L32:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
            throw r0     // Catch: java.io.IOException -> L34 java.io.EOFException -> L36
        L34:
            r0 = move-exception
            goto L38
        L36:
            r0 = move-exception
            goto L40
        L38:
            javax.mail.MessagingException r1 = new javax.mail.MessagingException
            java.lang.String r2 = "error getting size"
            r1.<init>(r2, r0)
            throw r1
        L40:
            com.sun.mail.pop3.b r1 = r3.a
            r2 = 0
            r1.close(r2)
            javax.mail.FolderClosedException r1 = new javax.mail.FolderClosedException
            com.sun.mail.pop3.b r2 = r3.a
            java.lang.String r0 = r0.toString()
            r1.<init>(r2, r0)
            throw r1
    }

    public void removeHeader(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.IllegalWriteException r2 = new javax.mail.IllegalWriteException
            java.lang.String r0 = "POP3 messages are read-only"
            r2.<init>(r0)
            throw r2
    }

    public void saveChanges() throws javax.mail.MessagingException {
            r2 = this;
            javax.mail.IllegalWriteException r0 = new javax.mail.IllegalWriteException
            java.lang.String r1 = "POP3 messages are read-only"
            r0.<init>(r1)
            throw r0
    }

    public void setFlags(javax.mail.Flags r2, boolean r3) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.Flags r0 = r1.flags
            java.lang.Object r0 = r0.clone()
            javax.mail.Flags r0 = (javax.mail.Flags) r0
            super.setFlags(r2, r3)
            javax.mail.Flags r2 = r1.flags
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L19
            com.sun.mail.pop3.b r2 = r1.a
            r3 = 1
            r2.notifyMessageChangedListeners(r3, r1)
        L19:
            return
    }

    public void setHeader(java.lang.String r1, java.lang.String r2) throws javax.mail.MessagingException {
            r0 = this;
            javax.mail.IllegalWriteException r1 = new javax.mail.IllegalWriteException
            java.lang.String r2 = "POP3 messages are read-only"
            r1.<init>(r2)
            throw r1
    }
}
