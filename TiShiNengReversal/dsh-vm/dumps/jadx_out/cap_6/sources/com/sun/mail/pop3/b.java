package com.sun.mail.pop3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b extends javax.mail.Folder {
    private java.lang.String a;
    private com.sun.mail.pop3.f b;
    private int c;
    private int d;
    private boolean e;
    private boolean f;
    private java.util.Vector g;
    private boolean h;

    b(com.sun.mail.pop3.e r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.e = r1
            r0.f = r1
            r0.h = r1
            r0.a = r2
            java.lang.String r1 = "INBOX"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L17
            r1 = 1
            r0.e = r1
        L17:
            return
    }

    public void appendMessages(javax.mail.Message[] r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.MethodNotSupportedException r2 = new javax.mail.MethodNotSupportedException
            java.lang.String r0 = "Append not supported"
            r2.<init>(r0)
            throw r2
    }

    void b() throws java.lang.IllegalStateException {
            r2 = this;
            boolean r0 = r2.f
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Folder is Open"
            r0.<init>(r1)
            throw r0
    }

    void c() throws java.lang.IllegalStateException {
            r2 = this;
            boolean r0 = r2.f
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Folder is not Open"
            r0.<init>(r1)
            throw r0
    }

    public synchronized void close(boolean r6) throws javax.mail.MessagingException {
            r5 = this;
            monitor-enter(r5)
            r5.c()     // Catch: java.lang.Throwable -> L64
            r0 = 3
            r1 = 0
            r2 = 0
            javax.mail.Store r3 = r5.store     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L77
            com.sun.mail.pop3.e r3 = (com.sun.mail.pop3.e) r3     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L77
            boolean r3 = r3.j     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L77
            if (r3 == 0) goto L17
            com.sun.mail.pop3.f r3 = r5.b     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L77
            r3.j()     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L77
            goto L17
        L15:
            r6 = move-exception
            goto L66
        L17:
            if (r6 == 0) goto L4e
            int r6 = r5.mode     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L77
            r3 = 2
            if (r6 != r3) goto L4e
            r6 = 0
        L1f:
            java.util.Vector r3 = r5.g     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L77
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L77
            if (r6 < r3) goto L28
            goto L4e
        L28:
            java.util.Vector r3 = r5.g     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L77
            java.lang.Object r3 = r3.elementAt(r6)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L77
            com.sun.mail.pop3.c r3 = (com.sun.mail.pop3.c) r3     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L77
            if (r3 == 0) goto L4b
            javax.mail.Flags$Flag r4 = javax.mail.Flags.Flag.DELETED     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L77
            boolean r3 = r3.isSet(r4)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L77
            if (r3 == 0) goto L4b
            com.sun.mail.pop3.f r3 = r5.b     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L42
            int r4 = r6 + 1
            r3.a(r4)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L42
            goto L4b
        L42:
            r6 = move-exception
            javax.mail.MessagingException r3 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L77
            java.lang.String r4 = "Exception deleting messages during close"
            r3.<init>(r4, r6)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L77
            throw r3     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L77
        L4b:
            int r6 = r6 + 1
            goto L1f
        L4e:
            com.sun.mail.pop3.f r6 = r5.b     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L77
            r6.h()     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L77
            r5.b = r2     // Catch: java.lang.Throwable -> L64
            javax.mail.Store r6 = r5.store     // Catch: java.lang.Throwable -> L64
            com.sun.mail.pop3.e r6 = (com.sun.mail.pop3.e) r6     // Catch: java.lang.Throwable -> L64
            r6.b(r5)     // Catch: java.lang.Throwable -> L64
            r5.g = r2     // Catch: java.lang.Throwable -> L64
        L5e:
            r5.f = r1     // Catch: java.lang.Throwable -> L64
            r5.notifyConnectionListeners(r0)     // Catch: java.lang.Throwable -> L64
            goto L83
        L64:
            r6 = move-exception
            goto L85
        L66:
            r5.b = r2     // Catch: java.lang.Throwable -> L64
            javax.mail.Store r3 = r5.store     // Catch: java.lang.Throwable -> L64
            com.sun.mail.pop3.e r3 = (com.sun.mail.pop3.e) r3     // Catch: java.lang.Throwable -> L64
            r3.b(r5)     // Catch: java.lang.Throwable -> L64
            r5.g = r2     // Catch: java.lang.Throwable -> L64
            r5.f = r1     // Catch: java.lang.Throwable -> L64
            r5.notifyConnectionListeners(r0)     // Catch: java.lang.Throwable -> L64
            throw r6     // Catch: java.lang.Throwable -> L64
        L77:
            r5.b = r2     // Catch: java.lang.Throwable -> L64
            javax.mail.Store r6 = r5.store     // Catch: java.lang.Throwable -> L64
            com.sun.mail.pop3.e r6 = (com.sun.mail.pop3.e) r6     // Catch: java.lang.Throwable -> L64
            r6.b(r5)     // Catch: java.lang.Throwable -> L64
            r5.g = r2     // Catch: java.lang.Throwable -> L64
            goto L5e
        L83:
            monitor-exit(r5)
            return
        L85:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L64
            throw r6
    }

    public boolean create(int r1) throws javax.mail.MessagingException {
            r0 = this;
            r1 = 0
            return r1
    }

    void d() throws java.lang.IllegalStateException {
            r2 = this;
            boolean r0 = r2.f
            if (r0 == 0) goto Ld
            int r0 = r2.mode
            r1 = 1
            if (r0 == r1) goto Lc
            r1 = 2
            if (r0 != r1) goto Ld
        Lc:
            return
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Folder is not Readable"
            r0.<init>(r1)
            throw r0
    }

    public boolean delete(boolean r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.MethodNotSupportedException r2 = new javax.mail.MethodNotSupportedException
            java.lang.String r0 = "delete"
            r2.<init>(r0)
            throw r2
    }

    void e() throws java.lang.IllegalStateException {
            r2 = this;
            boolean r0 = r2.f
            if (r0 == 0) goto La
            int r0 = r2.mode
            r1 = 2
            if (r0 != r1) goto La
            return
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Folder is not Writable"
            r0.<init>(r1)
            throw r0
    }

    public boolean exists() {
            r1 = this;
            boolean r0 = r1.e
            return r0
    }

    public javax.mail.Message[] expunge() throws javax.mail.MessagingException {
            r2 = this;
            javax.mail.MethodNotSupportedException r0 = new javax.mail.MethodNotSupportedException
            java.lang.String r1 = "Expunge not supported"
            r0.<init>(r1)
            throw r0
    }

    protected com.sun.mail.pop3.c f(javax.mail.Folder r4, int r5) throws javax.mail.MessagingException {
            r3 = this;
            javax.mail.Store r4 = r3.store
            com.sun.mail.pop3.e r4 = (com.sun.mail.pop3.e) r4
            java.lang.reflect.Constructor r4 = r4.m
            if (r4 == 0) goto L1d
            java.lang.Integer r0 = new java.lang.Integer     // Catch: java.lang.Exception -> L1d
            r0.<init>(r5)     // Catch: java.lang.Exception -> L1d
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L1d
            r2 = 0
            r1[r2] = r3     // Catch: java.lang.Exception -> L1d
            r2 = 1
            r1[r2] = r0     // Catch: java.lang.Exception -> L1d
            java.lang.Object r4 = r4.newInstance(r1)     // Catch: java.lang.Exception -> L1d
            com.sun.mail.pop3.c r4 = (com.sun.mail.pop3.c) r4     // Catch: java.lang.Exception -> L1d
            goto L1e
        L1d:
            r4 = 0
        L1e:
            if (r4 != 0) goto L25
            com.sun.mail.pop3.c r4 = new com.sun.mail.pop3.c
            r4.<init>(r3, r5)
        L25:
            return r4
    }

    public synchronized void fetch(javax.mail.Message[] r7, javax.mail.FetchProfile r8) throws javax.mail.MessagingException {
            r6 = this;
            monitor-enter(r6)
            r6.d()     // Catch: java.lang.Throwable -> L2a
            boolean r0 = r6.h     // Catch: java.lang.Throwable -> L2a
            r1 = 0
            if (r0 != 0) goto L59
            javax.mail.UIDFolder$FetchProfileItem r0 = javax.mail.UIDFolder.FetchProfileItem.UID     // Catch: java.lang.Throwable -> L2a
            boolean r0 = r8.contains(r0)     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L59
            java.util.Vector r0 = r6.g     // Catch: java.lang.Throwable -> L2a
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L2a
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L2a
            com.sun.mail.pop3.f r3 = r6.b     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L40 java.io.EOFException -> L42
            boolean r3 = r3.p(r2)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L40 java.io.EOFException -> L42
            if (r3 != 0) goto L23
            monitor-exit(r6)
            return
        L23:
            r3 = 0
        L24:
            if (r3 < r0) goto L2c
            r0 = 1
            r6.h = r0     // Catch: java.lang.Throwable -> L2a
            goto L59
        L2a:
            r7 = move-exception
            goto L76
        L2c:
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L2a
            if (r4 != 0) goto L31
            goto L3d
        L31:
            int r4 = r3 + 1
            javax.mail.Message r4 = r6.getMessage(r4)     // Catch: java.lang.Throwable -> L2a
            com.sun.mail.pop3.c r4 = (com.sun.mail.pop3.c) r4     // Catch: java.lang.Throwable -> L2a
            r5 = r2[r3]     // Catch: java.lang.Throwable -> L2a
            r4.d = r5     // Catch: java.lang.Throwable -> L2a
        L3d:
            int r3 = r3 + 1
            goto L24
        L40:
            r7 = move-exception
            goto L44
        L42:
            r7 = move-exception
            goto L4c
        L44:
            javax.mail.MessagingException r8 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = "error getting UIDL"
            r8.<init>(r0, r7)     // Catch: java.lang.Throwable -> L2a
            throw r8     // Catch: java.lang.Throwable -> L2a
        L4c:
            r6.close(r1)     // Catch: java.lang.Throwable -> L2a
            javax.mail.FolderClosedException r8 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> L2a
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L2a
            r8.<init>(r6, r7)     // Catch: java.lang.Throwable -> L2a
            throw r8     // Catch: java.lang.Throwable -> L2a
        L59:
            javax.mail.FetchProfile$Item r0 = javax.mail.FetchProfile.Item.ENVELOPE     // Catch: java.lang.Throwable -> L2a
            boolean r8 = r8.contains(r0)     // Catch: java.lang.Throwable -> L2a
            if (r8 == 0) goto L74
        L61:
            int r8 = r7.length     // Catch: java.lang.Throwable -> L2a
            if (r1 < r8) goto L65
            goto L74
        L65:
            r8 = r7[r1]     // Catch: java.lang.Throwable -> L2a javax.mail.MessageRemovedException -> L71
            com.sun.mail.pop3.c r8 = (com.sun.mail.pop3.c) r8     // Catch: java.lang.Throwable -> L2a javax.mail.MessageRemovedException -> L71
            java.lang.String r0 = ""
            r8.getHeader(r0)     // Catch: java.lang.Throwable -> L2a javax.mail.MessageRemovedException -> L71
            r8.getSize()     // Catch: java.lang.Throwable -> L2a javax.mail.MessageRemovedException -> L71
        L71:
            int r1 = r1 + 1
            goto L61
        L74:
            monitor-exit(r6)
            return
        L76:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2a
            throw r7
    }

    protected void finalize() throws java.lang.Throwable {
            r1 = this;
            super.finalize()
            r0 = 0
            r1.close(r0)
            return
    }

    com.sun.mail.pop3.f g() throws javax.mail.MessagingException {
            r1 = this;
            r1.c()
            com.sun.mail.pop3.f r0 = r1.b
            return r0
    }

    public javax.mail.Folder getFolder(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.MessagingException r2 = new javax.mail.MessagingException
            java.lang.String r0 = "not a directory"
            r2.<init>(r0)
            throw r2
    }

    public java.lang.String getFullName() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public synchronized javax.mail.Message getMessage(int r3) throws javax.mail.MessagingException {
            r2 = this;
            monitor-enter(r2)
            r2.c()     // Catch: java.lang.Throwable -> L1a
            java.util.Vector r0 = r2.g     // Catch: java.lang.Throwable -> L1a
            int r1 = r3 + (-1)
            java.lang.Object r0 = r0.elementAt(r1)     // Catch: java.lang.Throwable -> L1a
            com.sun.mail.pop3.c r0 = (com.sun.mail.pop3.c) r0     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            com.sun.mail.pop3.c r0 = r2.f(r2, r3)     // Catch: java.lang.Throwable -> L1a
            java.util.Vector r3 = r2.g     // Catch: java.lang.Throwable -> L1a
            r3.setElementAt(r0, r1)     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r3 = move-exception
            goto L1e
        L1c:
            monitor-exit(r2)
            return r0
        L1e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            throw r3
    }

    public synchronized int getMessageCount() throws javax.mail.MessagingException {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L8
            monitor-exit(r1)
            r0 = -1
            return r0
        L8:
            r1.d()     // Catch: java.lang.Throwable -> Lf
            int r0 = r1.c     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public javax.mail.Folder getParent() {
            r2 = this;
            com.sun.mail.pop3.a r0 = new com.sun.mail.pop3.a
            javax.mail.Store r1 = r2.store
            com.sun.mail.pop3.e r1 = (com.sun.mail.pop3.e) r1
            r0.<init>(r1)
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
            r0 = 0
            return r0
    }

    public int getType() {
            r1 = this;
            r0 = 1
            return r0
    }

    public synchronized int h() throws javax.mail.MessagingException {
            r1 = this;
            monitor-enter(r1)
            r1.c()     // Catch: java.lang.Throwable -> L8
            int r0 = r1.d     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return r0
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    public boolean hasNewMessages() throws javax.mail.MessagingException {
            r1 = this;
            r0 = 0
            return r0
    }

    public synchronized int[] i() throws javax.mail.MessagingException {
            r6 = this;
            monitor-enter(r6)
            r6.c()     // Catch: java.lang.Throwable -> L1e
            int r0 = r6.c     // Catch: java.lang.Throwable -> L1e
            int[] r0 = new int[r0]     // Catch: java.lang.Throwable -> L1e
            r1 = 0
            com.sun.mail.pop3.f r2 = r6.b     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            java.io.InputStream r2 = r2.d()     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            com.sun.mail.util.LineInputStream r3 = new com.sun.mail.util.LineInputStream     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f
        L14:
            java.lang.String r1 = r3.readLine()     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
            if (r1 != 0) goto L27
            r3.close()     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L20
            goto L21
        L1e:
            r0 = move-exception
            goto L70
        L20:
        L21:
            if (r2 == 0) goto L6e
        L23:
            r2.close()     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L6e
            goto L6e
        L27:
            java.util.StringTokenizer r4 = new java.util.StringTokenizer     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L47
            r4.<init>(r1)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L47
            java.lang.String r1 = r4.nextToken()     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L47
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L47
            java.lang.String r4 = r4.nextToken()     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L47
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L47
            if (r1 <= 0) goto L14
            int r5 = r6.c     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L47
            if (r1 > r5) goto L14
            int r1 = r1 + (-1)
            r0[r1] = r4     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L47
            goto L14
        L47:
            r0 = move-exception
            r1 = r3
            goto L57
        L4a:
            r1 = r3
            goto L64
        L4d:
            r0 = move-exception
            goto L57
        L4f:
            goto L64
        L51:
            r0 = move-exception
            r2 = r1
            goto L57
        L54:
            r2 = r1
            goto L64
        L57:
            if (r1 == 0) goto L5e
            r1.close()     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L5d
            goto L5e
        L5d:
        L5e:
            if (r2 == 0) goto L63
            r2.close()     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L63
        L63:
            throw r0     // Catch: java.lang.Throwable -> L1e
        L64:
            if (r1 == 0) goto L6b
            r1.close()     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L6a
            goto L6b
        L6a:
        L6b:
            if (r2 == 0) goto L6e
            goto L23
        L6e:
            monitor-exit(r6)
            return r0
        L70:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L1e
            throw r0
    }

    public boolean isOpen() {
            r2 = this;
            boolean r0 = r2.f
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            javax.mail.Store r0 = r2.store
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r2.close(r1)     // Catch: javax.mail.MessagingException -> L13
        L13:
            return r1
    }

    public synchronized java.lang.String j(javax.mail.Message r3) throws javax.mail.MessagingException {
            r2 = this;
            monitor-enter(r2)
            r2.c()     // Catch: java.lang.Throwable -> L19
            com.sun.mail.pop3.c r3 = (com.sun.mail.pop3.c) r3     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = r3.d     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b java.io.EOFException -> L1d
            java.lang.String r1 = "UNKNOWN"
            if (r0 != r1) goto L1f
            com.sun.mail.pop3.f r0 = r2.b     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b java.io.EOFException -> L1d
            int r1 = r3.getMessageNumber()     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b java.io.EOFException -> L1d
            java.lang.String r0 = r0.o(r1)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b java.io.EOFException -> L1d
            r3.d = r0     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b java.io.EOFException -> L1d
            goto L1f
        L19:
            r3 = move-exception
            goto L39
        L1b:
            r3 = move-exception
            goto L23
        L1d:
            r3 = move-exception
            goto L2b
        L1f:
            java.lang.String r3 = r3.d     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b java.io.EOFException -> L1d
            monitor-exit(r2)
            return r3
        L23:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "error getting UIDL"
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> L19
            throw r0     // Catch: java.lang.Throwable -> L19
        L2b:
            r0 = 0
            r2.close(r0)     // Catch: java.lang.Throwable -> L19
            javax.mail.FolderClosedException r0 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L19
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L19
            throw r0     // Catch: java.lang.Throwable -> L19
        L39:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r3
    }

    public synchronized java.io.InputStream k() throws javax.mail.MessagingException, java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            r1.c()     // Catch: java.lang.Throwable -> Lc
            com.sun.mail.pop3.f r0 = r1.b     // Catch: java.lang.Throwable -> Lc
            java.io.InputStream r0 = r0.d()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return r0
        Lc:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    public javax.mail.Folder[] list(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.MessagingException r2 = new javax.mail.MessagingException
            java.lang.String r0 = "not a directory"
            r2.<init>(r0)
            throw r2
    }

    protected void notifyMessageChangedListeners(int r1, javax.mail.Message r2) {
            r0 = this;
            super.notifyMessageChangedListeners(r1, r2)
            return
    }

    public synchronized void open(int r3) throws javax.mail.MessagingException {
            r2 = this;
            monitor-enter(r2)
            r2.b()     // Catch: java.lang.Throwable -> L39
            boolean r0 = r2.e     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L69
            javax.mail.Store r0 = r2.store     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            com.sun.mail.pop3.e r0 = (com.sun.mail.pop3.e) r0     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            com.sun.mail.pop3.f r0 = r0.c(r2)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r2.b = r0     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            com.sun.mail.pop3.i r0 = r0.l()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            int r1 = r0.a     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r2.c = r1     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            int r0 = r0.b     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r2.d = r0     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r2.mode = r3     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r3 = 1
            r2.f = r3     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            java.util.Vector r0 = new java.util.Vector     // Catch: java.lang.Throwable -> L39
            int r1 = r2.c     // Catch: java.lang.Throwable -> L39
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L39
            r2.g = r0     // Catch: java.lang.Throwable -> L39
            int r1 = r2.c     // Catch: java.lang.Throwable -> L39
            r0.setSize(r1)     // Catch: java.lang.Throwable -> L39
            r0 = 0
            r2.h = r0     // Catch: java.lang.Throwable -> L39
            r2.notifyConnectionListeners(r3)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r2)
            return
        L39:
            r3 = move-exception
            goto L71
        L3b:
            r3 = move-exception
            r0 = 0
            com.sun.mail.pop3.f r1 = r2.b     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L5a
            if (r1 == 0) goto L47
            r1.h()     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L5a
            goto L47
        L45:
            r3 = move-exception
            goto L50
        L47:
            r2.b = r0     // Catch: java.lang.Throwable -> L39
            javax.mail.Store r0 = r2.store     // Catch: java.lang.Throwable -> L39
            goto L5e
        L4c:
            r0.b(r2)     // Catch: java.lang.Throwable -> L39
            goto L61
        L50:
            r2.b = r0     // Catch: java.lang.Throwable -> L39
            javax.mail.Store r0 = r2.store     // Catch: java.lang.Throwable -> L39
            com.sun.mail.pop3.e r0 = (com.sun.mail.pop3.e) r0     // Catch: java.lang.Throwable -> L39
            r0.b(r2)     // Catch: java.lang.Throwable -> L39
            throw r3     // Catch: java.lang.Throwable -> L39
        L5a:
            r2.b = r0     // Catch: java.lang.Throwable -> L39
            javax.mail.Store r0 = r2.store     // Catch: java.lang.Throwable -> L39
        L5e:
            com.sun.mail.pop3.e r0 = (com.sun.mail.pop3.e) r0     // Catch: java.lang.Throwable -> L39
            goto L4c
        L61:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = "Open failed"
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> L39
            throw r0     // Catch: java.lang.Throwable -> L39
        L69:
            javax.mail.FolderNotFoundException r3 = new javax.mail.FolderNotFoundException     // Catch: java.lang.Throwable -> L39
            java.lang.String r0 = "folder is not INBOX"
            r3.<init>(r2, r0)     // Catch: java.lang.Throwable -> L39
            throw r3     // Catch: java.lang.Throwable -> L39
        L71:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L39
            throw r3
    }

    public boolean renameTo(javax.mail.Folder r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.MethodNotSupportedException r2 = new javax.mail.MethodNotSupportedException
            java.lang.String r0 = "renameTo"
            r2.<init>(r0)
            throw r2
    }
}
