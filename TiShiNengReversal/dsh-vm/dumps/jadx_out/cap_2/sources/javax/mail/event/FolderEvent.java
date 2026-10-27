package javax.mail.event;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class FolderEvent extends javax.mail.event.MailEvent {
    public static final int CREATED = 1;
    public static final int DELETED = 2;
    public static final int RENAMED = 3;
    private static final long serialVersionUID = 5278131310563694307L;
    protected transient javax.mail.Folder folder;
    protected transient javax.mail.Folder newFolder;
    protected int type;

    public FolderEvent(java.lang.Object r1, javax.mail.Folder r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r2, r3)
            return
    }

    public FolderEvent(java.lang.Object r1, javax.mail.Folder r2, javax.mail.Folder r3, int r4) {
            r0 = this;
            r0.<init>(r1)
            r0.folder = r2
            r0.newFolder = r3
            r0.type = r4
            return
    }

    @Override // javax.mail.event.MailEvent
    public void dispatch(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.type
            r1 = 1
            if (r0 != r1) goto Lb
            javax.mail.event.FolderListener r3 = (javax.mail.event.FolderListener) r3
            r3.folderCreated(r2)
            return
        Lb:
            r1 = 2
            if (r0 != r1) goto L14
            javax.mail.event.FolderListener r3 = (javax.mail.event.FolderListener) r3
            r3.folderDeleted(r2)
            return
        L14:
            r1 = 3
            if (r0 != r1) goto L1c
            javax.mail.event.FolderListener r3 = (javax.mail.event.FolderListener) r3
            r3.folderRenamed(r2)
        L1c:
            return
    }

    public javax.mail.Folder getFolder() {
            r1 = this;
            javax.mail.Folder r0 = r1.folder
            return r0
    }

    public javax.mail.Folder getNewFolder() {
            r1 = this;
            javax.mail.Folder r0 = r1.newFolder
            return r0
    }

    public int getType() {
            r1 = this;
            int r0 = r1.type
            return r0
    }
}
