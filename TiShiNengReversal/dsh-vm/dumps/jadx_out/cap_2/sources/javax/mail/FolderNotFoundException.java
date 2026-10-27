package javax.mail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class FolderNotFoundException extends javax.mail.MessagingException {
    private static final long serialVersionUID = 472612108891249403L;
    private transient javax.mail.Folder folder;

    public FolderNotFoundException() {
            r0 = this;
            r0.<init>()
            return
    }

    public FolderNotFoundException(java.lang.String r1, javax.mail.Folder r2) {
            r0 = this;
            r0.<init>(r1)
            r0.folder = r2
            return
    }

    public FolderNotFoundException(javax.mail.Folder r1) {
            r0 = this;
            r0.<init>()
            r0.folder = r1
            return
    }

    public FolderNotFoundException(javax.mail.Folder r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r2)
            r0.folder = r1
            return
    }

    public javax.mail.Folder getFolder() {
            r1 = this;
            javax.mail.Folder r0 = r1.folder
            return r0
    }
}
