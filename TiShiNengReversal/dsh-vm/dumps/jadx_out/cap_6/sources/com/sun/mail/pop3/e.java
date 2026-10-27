package com.sun.mail.pop3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class e extends javax.mail.Store {
    private java.lang.String a;
    private int b;
    private boolean c;
    private com.sun.mail.pop3.f d;
    private com.sun.mail.pop3.b e;
    private java.lang.String f;
    private int g;
    private java.lang.String h;
    private java.lang.String i;
    boolean j;
    boolean k;
    boolean l;
    java.lang.reflect.Constructor m;

    public e(javax.mail.Session r7, javax.mail.URLName r8) {
            r6 = this;
            r4 = 110(0x6e, float:1.54E-43)
            r5 = 0
            java.lang.String r3 = "pop3"
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public e(javax.mail.Session r4, javax.mail.URLName r5, java.lang.String r6, int r7, boolean r8) {
            r3 = this;
            r3.<init>(r4, r5)
            java.lang.String r0 = "pop3"
            r3.a = r0
            r0 = 110(0x6e, float:1.54E-43)
            r3.b = r0
            r0 = 0
            r3.c = r0
            r1 = 0
            r3.d = r1
            r3.e = r1
            r3.f = r1
            r2 = -1
            r3.g = r2
            r3.h = r1
            r3.i = r1
            r3.j = r0
            r3.k = r0
            r3.l = r0
            r3.m = r1
            if (r5 == 0) goto L2a
            java.lang.String r6 = r5.getProtocol()
        L2a:
            r3.a = r6
            r3.b = r7
            r3.c = r8
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "mail."
            r5.<init>(r7)
            r5.append(r6)
            java.lang.String r8 = ".rsetbeforequit"
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r4.getProperty(r5)
            r8 = 1
            java.lang.String r1 = "true"
            if (r5 == 0) goto L54
            boolean r5 = r5.equalsIgnoreCase(r1)
            if (r5 == 0) goto L54
            r3.j = r8
        L54:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r7)
            r5.append(r6)
            java.lang.String r2 = ".disabletop"
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r4.getProperty(r5)
            if (r5 == 0) goto L73
            boolean r5 = r5.equalsIgnoreCase(r1)
            if (r5 == 0) goto L73
            r3.k = r8
        L73:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r7)
            r5.append(r6)
            java.lang.String r2 = ".forgettopheaders"
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r4.getProperty(r5)
            if (r5 == 0) goto L92
            boolean r5 = r5.equalsIgnoreCase(r1)
            if (r5 == 0) goto L92
            r3.l = r8
        L92:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r7)
            r5.append(r6)
            java.lang.String r6 = ".message.class"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r4.getProperty(r5)
            if (r5 == 0) goto Leb
            boolean r6 = r4.getDebug()
            if (r6 == 0) goto Lb6
            java.io.PrintStream r6 = r4.getDebugOut()
            r6.getClass()
        Lb6:
            java.lang.Class r6 = r3.getClass()     // Catch: java.lang.Exception -> Lc3
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch: java.lang.Exception -> Lc3
            java.lang.Class r5 = r6.loadClass(r5)     // Catch: java.lang.Exception -> Lc3 java.lang.ClassNotFoundException -> Lc5
            goto Lc9
        Lc3:
            r5 = move-exception
            goto Ldb
        Lc5:
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Exception -> Lc3
        Lc9:
            r6 = 2
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> Lc3
            java.lang.Class<javax.mail.Folder> r7 = javax.mail.Folder.class
            r6[r0] = r7     // Catch: java.lang.Exception -> Lc3
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> Lc3
            r6[r8] = r7     // Catch: java.lang.Exception -> Lc3
            java.lang.reflect.Constructor r5 = r5.getConstructor(r6)     // Catch: java.lang.Exception -> Lc3
            r3.m = r5     // Catch: java.lang.Exception -> Lc3
            goto Leb
        Ldb:
            boolean r6 = r4.getDebug()
            if (r6 == 0) goto Leb
            java.io.PrintStream r4 = r4.getDebugOut()
            r5.toString()
            r4.getClass()
        Leb:
            return
    }

    private void checkConnected() throws javax.mail.MessagingException {
            r2 = this;
            boolean r0 = super/*javax.mail.Service*/.isConnected()
            if (r0 == 0) goto L7
            return
        L7:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException
            java.lang.String r1 = "Not connected"
            r0.<init>(r1)
            throw r0
    }

    synchronized void b(com.sun.mail.pop3.b r2) {
            r1 = this;
            monitor-enter(r1)
            com.sun.mail.pop3.b r0 = r1.e     // Catch: java.lang.Throwable -> Lb
            if (r0 != r2) goto Ld
            r2 = 0
            r1.d = r2     // Catch: java.lang.Throwable -> Lb
            r1.e = r2     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r2 = move-exception
            goto Lf
        Ld:
            monitor-exit(r1)
            return
        Lf:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    synchronized com.sun.mail.pop3.f c(com.sun.mail.pop3.b r9) throws java.io.IOException {
            r8 = this;
            monitor-enter(r8)
            com.sun.mail.pop3.f r0 = r8.d     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto L10
            com.sun.mail.pop3.b r1 = r8.e     // Catch: java.lang.Throwable -> Ld
            if (r1 != 0) goto L10
            r8.e = r9     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r8)
            return r0
        Ld:
            r0 = move-exception
            r9 = r0
            goto L62
        L10:
            com.sun.mail.pop3.f r0 = new com.sun.mail.pop3.f     // Catch: java.lang.Throwable -> Ld
            java.lang.String r1 = r8.f     // Catch: java.lang.Throwable -> Ld
            int r2 = r8.g     // Catch: java.lang.Throwable -> Ld
            javax.mail.Session r3 = r8.session     // Catch: java.lang.Throwable -> Ld
            boolean r3 = r3.getDebug()     // Catch: java.lang.Throwable -> Ld
            javax.mail.Session r4 = r8.session     // Catch: java.lang.Throwable -> Ld
            java.io.PrintStream r4 = r4.getDebugOut()     // Catch: java.lang.Throwable -> Ld
            javax.mail.Session r5 = r8.session     // Catch: java.lang.Throwable -> Ld
            java.util.Properties r5 = r5.getProperties()     // Catch: java.lang.Throwable -> Ld
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld
            java.lang.String r7 = "mail."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r7 = r8.a     // Catch: java.lang.Throwable -> Ld
            r6.append(r7)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Ld
            boolean r7 = r8.c     // Catch: java.lang.Throwable -> Ld
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r1 = r8.h     // Catch: java.lang.Throwable -> Ld
            java.lang.String r2 = r8.i     // Catch: java.lang.Throwable -> Ld
            java.lang.String r1 = r0.e(r1, r2)     // Catch: java.lang.Throwable -> Ld
            if (r1 != 0) goto L59
            com.sun.mail.pop3.f r1 = r8.d     // Catch: java.lang.Throwable -> Ld
            if (r1 != 0) goto L51
            if (r9 == 0) goto L51
            r8.d = r0     // Catch: java.lang.Throwable -> Ld
            r8.e = r9     // Catch: java.lang.Throwable -> Ld
        L51:
            com.sun.mail.pop3.b r1 = r8.e     // Catch: java.lang.Throwable -> Ld
            if (r1 != 0) goto L57
            r8.e = r9     // Catch: java.lang.Throwable -> Ld
        L57:
            monitor-exit(r8)
            return r0
        L59:
            r0.h()     // Catch: java.lang.Throwable -> L5c
        L5c:
            java.io.EOFException r9 = new java.io.EOFException     // Catch: java.lang.Throwable -> Ld
            r9.<init>(r1)     // Catch: java.lang.Throwable -> Ld
            throw r9     // Catch: java.lang.Throwable -> Ld
        L62:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Ld
            throw r9
    }

    public synchronized void close() throws javax.mail.MessagingException {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            com.sun.mail.pop3.f r1 = r2.d     // Catch: java.lang.Throwable -> La java.io.IOException -> Lc
            if (r1 == 0) goto Lc
            r1.h()     // Catch: java.lang.Throwable -> La java.io.IOException -> Lc
            goto Lc
        La:
            r1 = move-exception
            goto L14
        Lc:
            r2.d = r0     // Catch: java.lang.Throwable -> L12
            super/*javax.mail.Service*/.close()     // Catch: java.lang.Throwable -> L12
            goto L1a
        L12:
            r0 = move-exception
            goto L1c
        L14:
            r2.d = r0     // Catch: java.lang.Throwable -> L12
            super/*javax.mail.Service*/.close()     // Catch: java.lang.Throwable -> L12
            throw r1     // Catch: java.lang.Throwable -> L12
        L1a:
            monitor-exit(r2)
            return
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r0
    }

    protected void finalize() throws java.lang.Throwable {
            r1 = this;
            super/*javax.mail.Service*/.finalize()
            com.sun.mail.pop3.f r0 = r1.d
            if (r0 == 0) goto La
            r1.close()
        La:
            return
    }

    public javax.mail.Folder getDefaultFolder() throws javax.mail.MessagingException {
            r1 = this;
            r1.checkConnected()
            com.sun.mail.pop3.a r0 = new com.sun.mail.pop3.a
            r0.<init>(r1)
            return r0
    }

    public javax.mail.Folder getFolder(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            r1.checkConnected()
            com.sun.mail.pop3.b r0 = new com.sun.mail.pop3.b
            r0.<init>(r1, r2)
            return r0
    }

    public javax.mail.Folder getFolder(javax.mail.URLName r2) throws javax.mail.MessagingException {
            r1 = this;
            r1.checkConnected()
            com.sun.mail.pop3.b r0 = new com.sun.mail.pop3.b
            java.lang.String r2 = r2.getFile()
            r0.<init>(r1, r2)
            return r0
    }

    public synchronized boolean isConnected() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = super/*javax.mail.Service*/.isConnected()     // Catch: java.lang.Throwable -> L28
            r1 = 0
            if (r0 != 0) goto La
            monitor-exit(r2)
            return r1
        La:
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L28
            com.sun.mail.pop3.f r0 = r2.d     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L20
            if (r0 != 0) goto L19
            r0 = 0
            com.sun.mail.pop3.f r0 = r2.c(r0)     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L20
            r2.d = r0     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L20
            goto L1c
        L17:
            r0 = move-exception
            goto L26
        L19:
            r0.g()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L20
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)
            r0 = 1
            return r0
        L20:
            super/*javax.mail.Service*/.close()     // Catch: java.lang.Throwable -> L23
        L23:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)
            return r1
        L26:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0     // Catch: java.lang.Throwable -> L28
        L28:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L28
            throw r0
    }

    protected synchronized boolean protocolConnect(java.lang.String r5, int r6, java.lang.String r7, java.lang.String r8) throws javax.mail.MessagingException {
            r4 = this;
            monitor-enter(r4)
            if (r5 == 0) goto L5d
            if (r8 == 0) goto L5d
            if (r7 != 0) goto L8
            goto L5d
        L8:
            r0 = -1
            if (r6 != r0) goto L2f
            javax.mail.Session r1 = r4.session     // Catch: java.lang.Throwable -> L2d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "mail."
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = r4.a     // Catch: java.lang.Throwable -> L2d
            r2.append(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = ".port"
            r2.append(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = r1.getProperty(r2)     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L2f
            int r6 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L2d
            goto L2f
        L2d:
            r5 = move-exception
            goto L5b
        L2f:
            if (r6 != r0) goto L33
            int r6 = r4.b     // Catch: java.lang.Throwable -> L2d
        L33:
            r4.f = r5     // Catch: java.lang.Throwable -> L2d
            r4.g = r6     // Catch: java.lang.Throwable -> L2d
            r4.h = r7     // Catch: java.lang.Throwable -> L2d
            r4.i = r8     // Catch: java.lang.Throwable -> L2d
            r5 = 0
            com.sun.mail.pop3.f r5 = r4.c(r5)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L45 java.io.EOFException -> L47
            r4.d = r5     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L45 java.io.EOFException -> L47
            monitor-exit(r4)
            r5 = 1
            return r5
        L45:
            r5 = move-exception
            goto L49
        L47:
            r5 = move-exception
            goto L51
        L49:
            javax.mail.MessagingException r6 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L2d
            java.lang.String r7 = "Connect failed"
            r6.<init>(r7, r5)     // Catch: java.lang.Throwable -> L2d
            throw r6     // Catch: java.lang.Throwable -> L2d
        L51:
            javax.mail.AuthenticationFailedException r6 = new javax.mail.AuthenticationFailedException     // Catch: java.lang.Throwable -> L2d
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L2d
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L2d
            throw r6     // Catch: java.lang.Throwable -> L2d
        L5b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2d
            throw r5
        L5d:
            monitor-exit(r4)
            r5 = 0
            return r5
    }
}
