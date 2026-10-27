package javax.mail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class Service {
    private boolean connected;
    private java.util.Vector connectionListeners;
    protected boolean debug;
    private javax.mail.EventQueue q;
    private java.lang.Object qLock;
    protected javax.mail.Session session;
    protected javax.mail.URLName url;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class TerminatorEvent extends javax.mail.event.MailEvent {
        private static final long serialVersionUID = 5542172141759168416L;

        TerminatorEvent() {
                r1 = this;
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r1.<init>(r0)
                return
        }

        @Override // javax.mail.event.MailEvent
        public void dispatch(java.lang.Object r1) {
                r0 = this;
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
                return
        }
    }

    protected Service(javax.mail.Session r2, javax.mail.URLName r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.debug = r0
            r1.connected = r0
            r0 = 0
            r1.connectionListeners = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.qLock = r0
            r1.session = r2
            r1.url = r3
            boolean r2 = r2.getDebug()
            r1.debug = r2
            return
    }

    private void terminateQueue() {
            r4 = this;
            java.lang.Object r0 = r4.qLock
            monitor-enter(r0)
            javax.mail.EventQueue r1 = r4.q     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L20
            java.util.Vector r1 = new java.util.Vector     // Catch: java.lang.Throwable -> L1e
            r1.<init>()     // Catch: java.lang.Throwable -> L1e
            r2 = 1
            r1.setSize(r2)     // Catch: java.lang.Throwable -> L1e
            javax.mail.EventQueue r2 = r4.q     // Catch: java.lang.Throwable -> L1e
            javax.mail.Service$TerminatorEvent r3 = new javax.mail.Service$TerminatorEvent     // Catch: java.lang.Throwable -> L1e
            r3.<init>()     // Catch: java.lang.Throwable -> L1e
            r2.enqueue(r3, r1)     // Catch: java.lang.Throwable -> L1e
            r1 = 0
            r4.q = r1     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r1 = move-exception
            goto L22
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r1
    }

    public synchronized void addConnectionListener(javax.mail.event.ConnectionListener r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Vector r0 = r1.connectionListeners     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto Lf
            java.util.Vector r0 = new java.util.Vector     // Catch: java.lang.Throwable -> Ld
            r0.<init>()     // Catch: java.lang.Throwable -> Ld
            r1.connectionListeners = r0     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r2 = move-exception
            goto L16
        Lf:
            java.util.Vector r0 = r1.connectionListeners     // Catch: java.lang.Throwable -> Ld
            r0.addElement(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        L16:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public synchronized void close() throws javax.mail.MessagingException {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.setConnected(r0)     // Catch: java.lang.Throwable -> Lb
            r0 = 3
            r1.notifyConnectionListeners(r0)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    public void connect() throws javax.mail.MessagingException {
            r1 = this;
            r0 = 0
            r1.connect(r0, r0, r0)
            return
    }

    public synchronized void connect(java.lang.String r11, int r12, java.lang.String r13, java.lang.String r14) throws javax.mail.MessagingException {
            r10 = this;
            monitor-enter(r10)
            boolean r0 = r10.isConnected()     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L14d
            javax.mail.URLName r0 = r10.url     // Catch: java.lang.Throwable -> L19
            r1 = 0
            if (r0 == 0) goto L55
            java.lang.String r0 = r0.getProtocol()     // Catch: java.lang.Throwable -> L19
            if (r11 != 0) goto L1d
            javax.mail.URLName r11 = r10.url     // Catch: java.lang.Throwable -> L19
            java.lang.String r11 = r11.getHost()     // Catch: java.lang.Throwable -> L19
            goto L1d
        L19:
            r0 = move-exception
            r11 = r0
            goto L155
        L1d:
            r2 = -1
            if (r12 != r2) goto L26
            javax.mail.URLName r12 = r10.url     // Catch: java.lang.Throwable -> L19
            int r12 = r12.getPort()     // Catch: java.lang.Throwable -> L19
        L26:
            if (r13 != 0) goto L37
            javax.mail.URLName r13 = r10.url     // Catch: java.lang.Throwable -> L19
            java.lang.String r13 = r13.getUsername()     // Catch: java.lang.Throwable -> L19
            if (r14 != 0) goto L4b
            javax.mail.URLName r14 = r10.url     // Catch: java.lang.Throwable -> L19
            java.lang.String r14 = r14.getPassword()     // Catch: java.lang.Throwable -> L19
            goto L4b
        L37:
            if (r14 != 0) goto L4b
            javax.mail.URLName r2 = r10.url     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = r2.getUsername()     // Catch: java.lang.Throwable -> L19
            boolean r2 = r13.equals(r2)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L4b
            javax.mail.URLName r14 = r10.url     // Catch: java.lang.Throwable -> L19
            java.lang.String r14 = r14.getPassword()     // Catch: java.lang.Throwable -> L19
        L4b:
            javax.mail.URLName r2 = r10.url     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = r2.getFile()     // Catch: java.lang.Throwable -> L19
            r3 = r0
            r6 = r2
        L53:
            r5 = r12
            goto L58
        L55:
            r3 = r1
            r6 = r3
            goto L53
        L58:
            if (r3 == 0) goto L90
            if (r11 != 0) goto L75
            javax.mail.Session r11 = r10.session     // Catch: java.lang.Throwable -> L19
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "mail."
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L19
            r12.append(r3)     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = ".host"
            r12.append(r0)     // Catch: java.lang.Throwable -> L19
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L19
            java.lang.String r11 = r11.getProperty(r12)     // Catch: java.lang.Throwable -> L19
        L75:
            if (r13 != 0) goto L90
            javax.mail.Session r12 = r10.session     // Catch: java.lang.Throwable -> L19
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "mail."
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L19
            r13.append(r3)     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = ".user"
            r13.append(r0)     // Catch: java.lang.Throwable -> L19
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L19
            java.lang.String r13 = r12.getProperty(r13)     // Catch: java.lang.Throwable -> L19
        L90:
            if (r11 != 0) goto L9a
            javax.mail.Session r11 = r10.session     // Catch: java.lang.Throwable -> L19
            java.lang.String r12 = "mail.host"
            java.lang.String r11 = r11.getProperty(r12)     // Catch: java.lang.Throwable -> L19
        L9a:
            r4 = r11
            if (r13 != 0) goto La5
            javax.mail.Session r11 = r10.session     // Catch: java.lang.Throwable -> L19
            java.lang.String r12 = "mail.user"
            java.lang.String r13 = r11.getProperty(r12)     // Catch: java.lang.Throwable -> L19
        La5:
            if (r13 != 0) goto Lad
            java.lang.String r11 = "user.name"
            java.lang.String r13 = java.lang.System.getProperty(r11)     // Catch: java.lang.Throwable -> L19 java.lang.SecurityException -> Laf
        Lad:
            r7 = r13
            goto Lb9
        Laf:
            boolean r11 = r10.debug     // Catch: java.lang.Throwable -> L19
            if (r11 == 0) goto Lad
            javax.mail.Session r11 = r10.session     // Catch: java.lang.Throwable -> L19
            r11.getDebugOut()     // Catch: java.lang.Throwable -> L19
            goto Lad
        Lb9:
            r11 = 0
            r12 = 1
            if (r14 != 0) goto Lf5
            javax.mail.URLName r13 = r10.url     // Catch: java.lang.Throwable -> L19
            if (r13 == 0) goto Lf5
            javax.mail.URLName r2 = new javax.mail.URLName     // Catch: java.lang.Throwable -> L19
            r8 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L19
            r8 = r4
            r13 = r6
            r10.setURLName(r2)     // Catch: java.lang.Throwable -> L19
            javax.mail.Session r0 = r10.session     // Catch: java.lang.Throwable -> L19
            javax.mail.URLName r2 = r10.getURLName()     // Catch: java.lang.Throwable -> L19
            javax.mail.PasswordAuthentication r0 = r0.getPasswordAuthentication(r2)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto Lf3
            if (r7 != 0) goto Le4
            java.lang.String r7 = r0.getUserName()     // Catch: java.lang.Throwable -> L19
            java.lang.String r14 = r0.getPassword()     // Catch: java.lang.Throwable -> L19
        Le2:
            r9 = 0
            goto Lf8
        Le4:
            java.lang.String r2 = r0.getUserName()     // Catch: java.lang.Throwable -> L19
            boolean r2 = r7.equals(r2)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto Le2
            java.lang.String r14 = r0.getPassword()     // Catch: java.lang.Throwable -> L19
            goto Le2
        Lf3:
            r9 = 1
            goto Lf8
        Lf5:
            r8 = r4
            r13 = r6
            goto Le2
        Lf8:
            boolean r11 = r10.protocolConnect(r8, r5, r7, r14)     // Catch: java.lang.Throwable -> L19 javax.mail.AuthenticationFailedException -> Lfe
            r0 = r1
            goto Lff
        Lfe:
            r0 = move-exception
        Lff:
            if (r11 != 0) goto L11f
            java.net.InetAddress r1 = java.net.InetAddress.getByName(r8)     // Catch: java.lang.Throwable -> L19 java.net.UnknownHostException -> L105
        L105:
            javax.mail.Session r2 = r10.session     // Catch: java.lang.Throwable -> L19
            r6 = 0
            r4 = r5
            r5 = r3
            r3 = r1
            javax.mail.PasswordAuthentication r1 = r2.requestPasswordAuthentication(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L19
            r3 = r5
            r5 = r4
            if (r1 == 0) goto L11f
            java.lang.String r7 = r1.getUserName()     // Catch: java.lang.Throwable -> L19
            java.lang.String r14 = r1.getPassword()     // Catch: java.lang.Throwable -> L19
            boolean r11 = r10.protocolConnect(r8, r5, r7, r14)     // Catch: java.lang.Throwable -> L19
        L11f:
            if (r11 != 0) goto L12a
            if (r0 == 0) goto L124
            throw r0     // Catch: java.lang.Throwable -> L19
        L124:
            javax.mail.AuthenticationFailedException r11 = new javax.mail.AuthenticationFailedException     // Catch: java.lang.Throwable -> L19
            r11.<init>()     // Catch: java.lang.Throwable -> L19
            throw r11     // Catch: java.lang.Throwable -> L19
        L12a:
            javax.mail.URLName r2 = new javax.mail.URLName     // Catch: java.lang.Throwable -> L19
            r6 = r13
            r4 = r8
            r8 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L19
            r10.setURLName(r2)     // Catch: java.lang.Throwable -> L19
            if (r9 == 0) goto L145
            javax.mail.Session r11 = r10.session     // Catch: java.lang.Throwable -> L19
            javax.mail.URLName r13 = r10.getURLName()     // Catch: java.lang.Throwable -> L19
            javax.mail.PasswordAuthentication r14 = new javax.mail.PasswordAuthentication     // Catch: java.lang.Throwable -> L19
            r14.<init>(r7, r8)     // Catch: java.lang.Throwable -> L19
            r11.setPasswordAuthentication(r13, r14)     // Catch: java.lang.Throwable -> L19
        L145:
            r10.setConnected(r12)     // Catch: java.lang.Throwable -> L19
            r10.notifyConnectionListeners(r12)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r10)
            return
        L14d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L19
            java.lang.String r12 = "already connected"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L19
            throw r11     // Catch: java.lang.Throwable -> L19
        L155:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L19
            throw r11
    }

    public void connect(java.lang.String r2, java.lang.String r3) throws javax.mail.MessagingException {
            r1 = this;
            r0 = 0
            r1.connect(r0, r2, r3)
            return
    }

    public void connect(java.lang.String r2, java.lang.String r3, java.lang.String r4) throws javax.mail.MessagingException {
            r1 = this;
            r0 = -1
            r1.connect(r2, r0, r3, r4)
            return
    }

    protected void finalize() throws java.lang.Throwable {
            r0 = this;
            super.finalize()
            r0.terminateQueue()
            return
    }

    public synchronized javax.mail.URLName getURLName() {
            r8 = this;
            monitor-enter(r8)
            javax.mail.URLName r0 = r8.url     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L37
            java.lang.String r0 = r0.getPassword()     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L16
            javax.mail.URLName r0 = r8.url     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r0.getFile()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L37
            goto L16
        L14:
            r0 = move-exception
            goto L3b
        L16:
            javax.mail.URLName r1 = new javax.mail.URLName     // Catch: java.lang.Throwable -> L14
            javax.mail.URLName r0 = r8.url     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = r0.getProtocol()     // Catch: java.lang.Throwable -> L14
            javax.mail.URLName r0 = r8.url     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = r0.getHost()     // Catch: java.lang.Throwable -> L14
            javax.mail.URLName r0 = r8.url     // Catch: java.lang.Throwable -> L14
            int r4 = r0.getPort()     // Catch: java.lang.Throwable -> L14
            javax.mail.URLName r0 = r8.url     // Catch: java.lang.Throwable -> L14
            java.lang.String r6 = r0.getUsername()     // Catch: java.lang.Throwable -> L14
            r7 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r8)
            return r1
        L37:
            javax.mail.URLName r0 = r8.url     // Catch: java.lang.Throwable -> L14
            monitor-exit(r8)
            return r0
        L3b:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    public synchronized boolean isConnected() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.connected     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    protected synchronized void notifyConnectionListeners(int r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.Vector r0 = r2.connectionListeners     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L12
            javax.mail.event.ConnectionEvent r0 = new javax.mail.event.ConnectionEvent     // Catch: java.lang.Throwable -> L10
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L10
            java.util.Vector r1 = r2.connectionListeners     // Catch: java.lang.Throwable -> L10
            r2.queueEvent(r0, r1)     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r3 = move-exception
            goto L1a
        L12:
            r0 = 3
            if (r3 != r0) goto L18
            r2.terminateQueue()     // Catch: java.lang.Throwable -> L10
        L18:
            monitor-exit(r2)
            return
        L1a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            throw r3
    }

    protected boolean protocolConnect(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4) throws javax.mail.MessagingException {
            r0 = this;
            r1 = 0
            return r1
    }

    protected void queueEvent(javax.mail.event.MailEvent r3, java.util.Vector r4) {
            r2 = this;
            java.lang.Object r0 = r2.qLock
            monitor-enter(r0)
            javax.mail.EventQueue r1 = r2.q     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            javax.mail.EventQueue r1 = new javax.mail.EventQueue     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            r2.q = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r3 = move-exception
            goto L1e
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r4 = r4.clone()
            java.util.Vector r4 = (java.util.Vector) r4
            javax.mail.EventQueue r0 = r2.q
            r0.enqueue(r3, r4)
            return
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    public synchronized void removeConnectionListener(javax.mail.event.ConnectionListener r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Vector r0 = r1.connectionListeners     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lb
            r0.removeElement(r2)     // Catch: java.lang.Throwable -> L9
            goto Lb
        L9:
            r2 = move-exception
            goto Ld
        Lb:
            monitor-exit(r1)
            return
        Ld:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    protected synchronized void setConnected(boolean r1) {
            r0 = this;
            monitor-enter(r0)
            r0.connected = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    protected synchronized void setURLName(javax.mail.URLName r1) {
            r0 = this;
            monitor-enter(r0)
            r0.url = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    public java.lang.String toString() {
            r1 = this;
            javax.mail.URLName r0 = r1.getURLName()
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.toString()
            return r0
        Lb:
            java.lang.String r0 = super.toString()
            return r0
    }
}
