package javax.mail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class Store extends javax.mail.Service {
    private volatile java.util.Vector folderListeners;
    private volatile java.util.Vector storeListeners;

    protected Store(javax.mail.Session r1, javax.mail.URLName r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.storeListeners = r1
            r0.folderListeners = r1
            return
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

    public synchronized void addStoreListener(javax.mail.event.StoreListener r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Vector r0 = r1.storeListeners     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto Lf
            java.util.Vector r0 = new java.util.Vector     // Catch: java.lang.Throwable -> Ld
            r0.<init>()     // Catch: java.lang.Throwable -> Ld
            r1.storeListeners = r0     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r2 = move-exception
            goto L16
        Lf:
            java.util.Vector r0 = r1.storeListeners     // Catch: java.lang.Throwable -> Ld
            r0.addElement(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        L16:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public abstract javax.mail.Folder getDefaultFolder() throws javax.mail.MessagingException;

    public abstract javax.mail.Folder getFolder(java.lang.String r1) throws javax.mail.MessagingException;

    public abstract javax.mail.Folder getFolder(javax.mail.URLName r1) throws javax.mail.MessagingException;

    public javax.mail.Folder[] getPersonalNamespaces() throws javax.mail.MessagingException {
            r3 = this;
            javax.mail.Folder r0 = r3.getDefaultFolder()
            r1 = 1
            javax.mail.Folder[] r1 = new javax.mail.Folder[r1]
            r2 = 0
            r1[r2] = r0
            return r1
    }

    public javax.mail.Folder[] getSharedNamespaces() throws javax.mail.MessagingException {
            r1 = this;
            r0 = 0
            javax.mail.Folder[] r0 = new javax.mail.Folder[r0]
            return r0
    }

    public javax.mail.Folder[] getUserNamespaces(java.lang.String r1) throws javax.mail.MessagingException {
            r0 = this;
            r1 = 0
            javax.mail.Folder[] r1 = new javax.mail.Folder[r1]
            return r1
    }

    protected void notifyFolderListeners(int r2, javax.mail.Folder r3) {
            r1 = this;
            java.util.Vector r0 = r1.folderListeners
            if (r0 != 0) goto L5
            return
        L5:
            javax.mail.event.FolderEvent r0 = new javax.mail.event.FolderEvent
            r0.<init>(r1, r3, r2)
            java.util.Vector r2 = r1.folderListeners
            r1.queueEvent(r0, r2)
            return
    }

    protected void notifyFolderRenamedListeners(javax.mail.Folder r3, javax.mail.Folder r4) {
            r2 = this;
            java.util.Vector r0 = r2.folderListeners
            if (r0 != 0) goto L5
            return
        L5:
            javax.mail.event.FolderEvent r0 = new javax.mail.event.FolderEvent
            r1 = 3
            r0.<init>(r2, r3, r4, r1)
            java.util.Vector r3 = r2.folderListeners
            r2.queueEvent(r0, r3)
            return
    }

    protected void notifyStoreListeners(int r2, java.lang.String r3) {
            r1 = this;
            java.util.Vector r0 = r1.storeListeners
            if (r0 != 0) goto L5
            return
        L5:
            javax.mail.event.StoreEvent r0 = new javax.mail.event.StoreEvent
            r0.<init>(r1, r2, r3)
            java.util.Vector r2 = r1.storeListeners
            r1.queueEvent(r0, r2)
            return
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

    public synchronized void removeStoreListener(javax.mail.event.StoreListener r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Vector r0 = r1.storeListeners     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            java.util.Vector r0 = r1.storeListeners     // Catch: java.lang.Throwable -> Lb
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
}
