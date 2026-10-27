package javax.mail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class Folder {
    public static final int HOLDS_FOLDERS = 2;
    public static final int HOLDS_MESSAGES = 1;
    public static final int READ_ONLY = 1;
    public static final int READ_WRITE = 2;
    private volatile java.util.Vector connectionListeners;
    private volatile java.util.Vector folderListeners;
    private volatile java.util.Vector messageChangedListeners;
    private volatile java.util.Vector messageCountListeners;
    protected int mode;
    private javax.mail.EventQueue q;
    private java.lang.Object qLock;
    protected javax.mail.Store store;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class TerminatorEvent extends javax.mail.event.MailEvent {
        private static final long serialVersionUID = 3765761925441296565L;

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

    protected Folder(javax.mail.Store r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mode = r0
            r0 = 0
            r1.connectionListeners = r0
            r1.folderListeners = r0
            r1.messageCountListeners = r0
            r1.messageChangedListeners = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.qLock = r0
            r1.store = r2
            return
    }

    private void queueEvent(javax.mail.event.MailEvent r3, java.util.Vector r4) {
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
            javax.mail.Folder$TerminatorEvent r3 = new javax.mail.Folder$TerminatorEvent     // Catch: java.lang.Throwable -> L1e
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

    public synchronized void addFolderListener(javax.mail.event.FolderListener r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Vector r0 = r1.folderListeners     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto Lf
            java.util.Vector r0 = new java.util.Vector     // Catch: java.lang.Throwable -> Ld
            r0.<init>()     // Catch: java.lang.Throwable -> Ld
            r1.folderListeners = r0     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r2 = move-exception
            goto L16
        Lf:
            java.util.Vector r0 = r1.folderListeners     // Catch: java.lang.Throwable -> Ld
            r0.addElement(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        L16:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public synchronized void addMessageChangedListener(javax.mail.event.MessageChangedListener r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Vector r0 = r1.messageChangedListeners     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto Lf
            java.util.Vector r0 = new java.util.Vector     // Catch: java.lang.Throwable -> Ld
            r0.<init>()     // Catch: java.lang.Throwable -> Ld
            r1.messageChangedListeners = r0     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r2 = move-exception
            goto L16
        Lf:
            java.util.Vector r0 = r1.messageChangedListeners     // Catch: java.lang.Throwable -> Ld
            r0.addElement(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        L16:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public synchronized void addMessageCountListener(javax.mail.event.MessageCountListener r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Vector r0 = r1.messageCountListeners     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto Lf
            java.util.Vector r0 = new java.util.Vector     // Catch: java.lang.Throwable -> Ld
            r0.<init>()     // Catch: java.lang.Throwable -> Ld
            r1.messageCountListeners = r0     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r2 = move-exception
            goto L16
        Lf:
            java.util.Vector r0 = r1.messageCountListeners     // Catch: java.lang.Throwable -> Ld
            r0.addElement(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        L16:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public abstract void appendMessages(javax.mail.Message[] r1) throws javax.mail.MessagingException;

    public abstract void close(boolean r1) throws javax.mail.MessagingException;

    public void copyMessages(javax.mail.Message[] r3, javax.mail.Folder r4) throws javax.mail.MessagingException {
            r2 = this;
            boolean r0 = r4.exists()
            if (r0 == 0) goto La
            r4.appendMessages(r3)
            return
        La:
            javax.mail.FolderNotFoundException r3 = new javax.mail.FolderNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r4.getFullName()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            java.lang.String r1 = " does not exist"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r4)
            throw r3
    }

    public abstract boolean create(int r1) throws javax.mail.MessagingException;

    public abstract boolean delete(boolean r1) throws javax.mail.MessagingException;

    public abstract boolean exists() throws javax.mail.MessagingException;

    public abstract javax.mail.Message[] expunge() throws javax.mail.MessagingException;

    public void fetch(javax.mail.Message[] r1, javax.mail.FetchProfile r2) throws javax.mail.MessagingException {
            r0 = this;
            return
    }

    protected void finalize() throws java.lang.Throwable {
            r0 = this;
            super.finalize()
            r0.terminateQueue()
            return
    }

    public synchronized int getDeletedMessageCount() throws javax.mail.MessagingException {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.isOpen()     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto La
            monitor-exit(r5)
            r0 = -1
            return r0
        La:
            int r0 = r5.getMessageCount()     // Catch: java.lang.Throwable -> L23
            r1 = 1
            r2 = 0
        L10:
            if (r1 <= r0) goto L14
            monitor-exit(r5)
            return r2
        L14:
            javax.mail.Message r3 = r5.getMessage(r1)     // Catch: java.lang.Throwable -> L23 javax.mail.MessageRemovedException -> L25
            javax.mail.Flags$Flag r4 = javax.mail.Flags.Flag.DELETED     // Catch: java.lang.Throwable -> L23 javax.mail.MessageRemovedException -> L25
            boolean r3 = r3.isSet(r4)     // Catch: java.lang.Throwable -> L23 javax.mail.MessageRemovedException -> L25
            if (r3 == 0) goto L25
            int r2 = r2 + 1
            goto L25
        L23:
            r0 = move-exception
            goto L28
        L25:
            int r1 = r1 + 1
            goto L10
        L28:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L23
            throw r0
    }

    public abstract javax.mail.Folder getFolder(java.lang.String r1) throws javax.mail.MessagingException;

    public abstract java.lang.String getFullName();

    public abstract javax.mail.Message getMessage(int r1) throws javax.mail.MessagingException;

    public abstract int getMessageCount() throws javax.mail.MessagingException;

    public synchronized javax.mail.Message[] getMessages() throws javax.mail.MessagingException {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.isOpen()     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1f
            int r0 = r5.getMessageCount()     // Catch: java.lang.Throwable -> L1d
            javax.mail.Message[] r1 = new javax.mail.Message[r0]     // Catch: java.lang.Throwable -> L1d
            r2 = 1
        Le:
            if (r2 <= r0) goto L12
            monitor-exit(r5)
            return r1
        L12:
            int r3 = r2 + (-1)
            javax.mail.Message r4 = r5.getMessage(r2)     // Catch: java.lang.Throwable -> L1d
            r1[r3] = r4     // Catch: java.lang.Throwable -> L1d
            int r2 = r2 + 1
            goto Le
        L1d:
            r0 = move-exception
            goto L27
        L1f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = "Folder not open"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1d
            throw r0     // Catch: java.lang.Throwable -> L1d
        L27:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1d
            throw r0
    }

    public synchronized javax.mail.Message[] getMessages(int r5, int r6) throws javax.mail.MessagingException {
            r4 = this;
            monitor-enter(r4)
            int r0 = r6 - r5
            int r0 = r0 + 1
            javax.mail.Message[] r0 = new javax.mail.Message[r0]     // Catch: java.lang.Throwable -> L17
            r1 = r5
        L8:
            if (r1 <= r6) goto Lc
            monitor-exit(r4)
            return r0
        Lc:
            int r2 = r1 - r5
            javax.mail.Message r3 = r4.getMessage(r1)     // Catch: java.lang.Throwable -> L17
            r0[r2] = r3     // Catch: java.lang.Throwable -> L17
            int r1 = r1 + 1
            goto L8
        L17:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L17
            throw r5
    }

    public synchronized javax.mail.Message[] getMessages(int[] r5) throws javax.mail.MessagingException {
            r4 = this;
            monitor-enter(r4)
            int r0 = r5.length     // Catch: java.lang.Throwable -> L14
            javax.mail.Message[] r1 = new javax.mail.Message[r0]     // Catch: java.lang.Throwable -> L14
            r2 = 0
        L5:
            if (r2 < r0) goto L9
            monitor-exit(r4)
            return r1
        L9:
            r3 = r5[r2]     // Catch: java.lang.Throwable -> L14
            javax.mail.Message r3 = r4.getMessage(r3)     // Catch: java.lang.Throwable -> L14
            r1[r2] = r3     // Catch: java.lang.Throwable -> L14
            int r2 = r2 + 1
            goto L5
        L14:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r5
    }

    public int getMode() {
            r2 = this;
            boolean r0 = r2.isOpen()
            if (r0 == 0) goto L9
            int r0 = r2.mode
            return r0
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Folder not open"
            r0.<init>(r1)
            throw r0
    }

    public abstract java.lang.String getName();

    public synchronized int getNewMessageCount() throws javax.mail.MessagingException {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.isOpen()     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto La
            monitor-exit(r5)
            r0 = -1
            return r0
        La:
            int r0 = r5.getMessageCount()     // Catch: java.lang.Throwable -> L23
            r1 = 1
            r2 = 0
        L10:
            if (r1 <= r0) goto L14
            monitor-exit(r5)
            return r2
        L14:
            javax.mail.Message r3 = r5.getMessage(r1)     // Catch: java.lang.Throwable -> L23 javax.mail.MessageRemovedException -> L25
            javax.mail.Flags$Flag r4 = javax.mail.Flags.Flag.RECENT     // Catch: java.lang.Throwable -> L23 javax.mail.MessageRemovedException -> L25
            boolean r3 = r3.isSet(r4)     // Catch: java.lang.Throwable -> L23 javax.mail.MessageRemovedException -> L25
            if (r3 == 0) goto L25
            int r2 = r2 + 1
            goto L25
        L23:
            r0 = move-exception
            goto L28
        L25:
            int r1 = r1 + 1
            goto L10
        L28:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L23
            throw r0
    }

    public abstract javax.mail.Folder getParent() throws javax.mail.MessagingException;

    public abstract javax.mail.Flags getPermanentFlags();

    public abstract char getSeparator() throws javax.mail.MessagingException;

    public javax.mail.Store getStore() {
            r1 = this;
            javax.mail.Store r0 = r1.store
            return r0
    }

    public abstract int getType() throws javax.mail.MessagingException;

    public javax.mail.URLName getURLName() throws javax.mail.MessagingException {
            r10 = this;
            javax.mail.Store r0 = r10.getStore()
            javax.mail.URLName r0 = r0.getURLName()
            java.lang.String r1 = r10.getFullName()
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r10.getSeparator()
            if (r1 == 0) goto L19
            r2.append(r1)
        L19:
            javax.mail.URLName r3 = new javax.mail.URLName
            java.lang.String r4 = r0.getProtocol()
            java.lang.String r5 = r0.getHost()
            int r6 = r0.getPort()
            java.lang.String r7 = r2.toString()
            java.lang.String r8 = r0.getUsername()
            r9 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
    }

    public synchronized int getUnreadMessageCount() throws javax.mail.MessagingException {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.isOpen()     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto La
            monitor-exit(r5)
            r0 = -1
            return r0
        La:
            int r0 = r5.getMessageCount()     // Catch: java.lang.Throwable -> L23
            r1 = 1
            r2 = 0
        L10:
            if (r1 <= r0) goto L14
            monitor-exit(r5)
            return r2
        L14:
            javax.mail.Message r3 = r5.getMessage(r1)     // Catch: java.lang.Throwable -> L23 javax.mail.MessageRemovedException -> L25
            javax.mail.Flags$Flag r4 = javax.mail.Flags.Flag.SEEN     // Catch: java.lang.Throwable -> L23 javax.mail.MessageRemovedException -> L25
            boolean r3 = r3.isSet(r4)     // Catch: java.lang.Throwable -> L23 javax.mail.MessageRemovedException -> L25
            if (r3 != 0) goto L25
            int r2 = r2 + 1
            goto L25
        L23:
            r0 = move-exception
            goto L28
        L25:
            int r1 = r1 + 1
            goto L10
        L28:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L23
            throw r0
    }

    public abstract boolean hasNewMessages() throws javax.mail.MessagingException;

    public abstract boolean isOpen();

    public boolean isSubscribed() {
            r1 = this;
            r0 = 1
            return r0
    }

    public javax.mail.Folder[] list() throws javax.mail.MessagingException {
            r1 = this;
            java.lang.String r0 = "%"
            javax.mail.Folder[] r0 = r1.list(r0)
            return r0
    }

    public abstract javax.mail.Folder[] list(java.lang.String r1) throws javax.mail.MessagingException;

    public javax.mail.Folder[] listSubscribed() throws javax.mail.MessagingException {
            r1 = this;
            java.lang.String r0 = "%"
            javax.mail.Folder[] r0 = r1.listSubscribed(r0)
            return r0
    }

    public javax.mail.Folder[] listSubscribed(java.lang.String r1) throws javax.mail.MessagingException {
            r0 = this;
            javax.mail.Folder[] r1 = r0.list(r1)
            return r1
    }

    protected void notifyConnectionListeners(int r3) {
            r2 = this;
            java.util.Vector r0 = r2.connectionListeners
            if (r0 == 0) goto Le
            javax.mail.event.ConnectionEvent r0 = new javax.mail.event.ConnectionEvent
            r0.<init>(r2, r3)
            java.util.Vector r1 = r2.connectionListeners
            r2.queueEvent(r0, r1)
        Le:
            r0 = 3
            if (r3 != r0) goto L14
            r2.terminateQueue()
        L14:
            return
    }

    protected void notifyFolderListeners(int r3) {
            r2 = this;
            java.util.Vector r0 = r2.folderListeners
            if (r0 == 0) goto Le
            javax.mail.event.FolderEvent r0 = new javax.mail.event.FolderEvent
            r0.<init>(r2, r2, r3)
            java.util.Vector r1 = r2.folderListeners
            r2.queueEvent(r0, r1)
        Le:
            javax.mail.Store r0 = r2.store
            r0.notifyFolderListeners(r3, r2)
            return
    }

    protected void notifyFolderRenamedListeners(javax.mail.Folder r3) {
            r2 = this;
            java.util.Vector r0 = r2.folderListeners
            if (r0 == 0) goto Lf
            javax.mail.event.FolderEvent r0 = new javax.mail.event.FolderEvent
            r1 = 3
            r0.<init>(r2, r2, r3, r1)
            java.util.Vector r1 = r2.folderListeners
            r2.queueEvent(r0, r1)
        Lf:
            javax.mail.Store r0 = r2.store
            r0.notifyFolderRenamedListeners(r2, r3)
            return
    }

    protected void notifyMessageAddedListeners(javax.mail.Message[] r4) {
            r3 = this;
            java.util.Vector r0 = r3.messageCountListeners
            if (r0 != 0) goto L5
            return
        L5:
            javax.mail.event.MessageCountEvent r0 = new javax.mail.event.MessageCountEvent
            r1 = 1
            r2 = 0
            r0.<init>(r3, r1, r2, r4)
            java.util.Vector r4 = r3.messageCountListeners
            r3.queueEvent(r0, r4)
            return
    }

    protected void notifyMessageChangedListeners(int r2, javax.mail.Message r3) {
            r1 = this;
            java.util.Vector r0 = r1.messageChangedListeners
            if (r0 != 0) goto L5
            return
        L5:
            javax.mail.event.MessageChangedEvent r0 = new javax.mail.event.MessageChangedEvent
            r0.<init>(r1, r2, r3)
            java.util.Vector r2 = r1.messageChangedListeners
            r1.queueEvent(r0, r2)
            return
    }

    protected void notifyMessageRemovedListeners(boolean r3, javax.mail.Message[] r4) {
            r2 = this;
            java.util.Vector r0 = r2.messageCountListeners
            if (r0 != 0) goto L5
            return
        L5:
            javax.mail.event.MessageCountEvent r0 = new javax.mail.event.MessageCountEvent
            r1 = 2
            r0.<init>(r2, r1, r3, r4)
            java.util.Vector r3 = r2.messageCountListeners
            r2.queueEvent(r0, r3)
            return
    }

    public abstract void open(int r1) throws javax.mail.MessagingException;

    public synchronized void removeConnectionListener(javax.mail.event.ConnectionListener r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Vector r0 = r1.connectionListeners     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            java.util.Vector r0 = r1.connectionListeners     // Catch: java.lang.Throwable -> Lb
            r0.removeElement(r2)     // Catch: java.lang.Throwable -> Lb
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

    public synchronized void removeFolderListener(javax.mail.event.FolderListener r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Vector r0 = r1.folderListeners     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            java.util.Vector r0 = r1.folderListeners     // Catch: java.lang.Throwable -> Lb
            r0.removeElement(r2)     // Catch: java.lang.Throwable -> Lb
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

    public synchronized void removeMessageChangedListener(javax.mail.event.MessageChangedListener r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Vector r0 = r1.messageChangedListeners     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            java.util.Vector r0 = r1.messageChangedListeners     // Catch: java.lang.Throwable -> Lb
            r0.removeElement(r2)     // Catch: java.lang.Throwable -> Lb
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

    public synchronized void removeMessageCountListener(javax.mail.event.MessageCountListener r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Vector r0 = r1.messageCountListeners     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            java.util.Vector r0 = r1.messageCountListeners     // Catch: java.lang.Throwable -> Lb
            r0.removeElement(r2)     // Catch: java.lang.Throwable -> Lb
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

    public abstract boolean renameTo(javax.mail.Folder r1) throws javax.mail.MessagingException;

    public javax.mail.Message[] search(javax.mail.search.SearchTerm r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.Message[] r0 = r1.getMessages()
            javax.mail.Message[] r2 = r1.search(r2, r0)
            return r2
    }

    public javax.mail.Message[] search(javax.mail.search.SearchTerm r4, javax.mail.Message[] r5) throws javax.mail.MessagingException {
            r3 = this;
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r5.length
            if (r1 < r2) goto L13
            int r4 = r0.size()
            javax.mail.Message[] r4 = new javax.mail.Message[r4]
            r0.copyInto(r4)
            return r4
        L13:
            r2 = r5[r1]     // Catch: javax.mail.MessageRemovedException -> L20
            boolean r2 = r2.match(r4)     // Catch: javax.mail.MessageRemovedException -> L20
            if (r2 == 0) goto L20
            r2 = r5[r1]     // Catch: javax.mail.MessageRemovedException -> L20
            r0.addElement(r2)     // Catch: javax.mail.MessageRemovedException -> L20
        L20:
            int r1 = r1 + 1
            goto L6
    }

    public synchronized void setFlags(int r2, int r3, javax.mail.Flags r4, boolean r5) throws javax.mail.MessagingException {
            r1 = this;
            monitor-enter(r1)
        L1:
            if (r2 <= r3) goto L5
            monitor-exit(r1)
            return
        L5:
            javax.mail.Message r0 = r1.getMessage(r2)     // Catch: java.lang.Throwable -> Ld javax.mail.MessageRemovedException -> L10
            r0.setFlags(r4, r5)     // Catch: java.lang.Throwable -> Ld javax.mail.MessageRemovedException -> L10
            goto L10
        Ld:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
        L10:
            int r2 = r2 + 1
            goto L1
    }

    public synchronized void setFlags(int[] r3, javax.mail.Flags r4, boolean r5) throws javax.mail.MessagingException {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
        L2:
            int r1 = r3.length     // Catch: java.lang.Throwable -> L11
            if (r0 < r1) goto L7
            monitor-exit(r2)
            return
        L7:
            r1 = r3[r0]     // Catch: java.lang.Throwable -> L11 javax.mail.MessageRemovedException -> L13
            javax.mail.Message r1 = r2.getMessage(r1)     // Catch: java.lang.Throwable -> L11 javax.mail.MessageRemovedException -> L13
            r1.setFlags(r4, r5)     // Catch: java.lang.Throwable -> L11 javax.mail.MessageRemovedException -> L13
            goto L13
        L11:
            r3 = move-exception
            goto L16
        L13:
            int r0 = r0 + 1
            goto L2
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    public synchronized void setFlags(javax.mail.Message[] r3, javax.mail.Flags r4, boolean r5) throws javax.mail.MessagingException {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
        L2:
            int r1 = r3.length     // Catch: java.lang.Throwable -> Ld
            if (r0 < r1) goto L7
            monitor-exit(r2)
            return
        L7:
            r1 = r3[r0]     // Catch: java.lang.Throwable -> Ld javax.mail.MessageRemovedException -> Lf
            r1.setFlags(r4, r5)     // Catch: java.lang.Throwable -> Ld javax.mail.MessageRemovedException -> Lf
            goto Lf
        Ld:
            r3 = move-exception
            goto L12
        Lf:
            int r0 = r0 + 1
            goto L2
        L12:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    public void setSubscribed(boolean r1) throws javax.mail.MessagingException {
            r0 = this;
            javax.mail.MethodNotSupportedException r1 = new javax.mail.MethodNotSupportedException
            r1.<init>()
            throw r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.getFullName()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.String r0 = super.toString()
            return r0
    }
}
