package javax.mail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class ReadOnlyFolderException extends javax.mail.MessagingException {
    private static final long serialVersionUID = 5711829372799039325L;
    private transient javax.mail.Folder folder;

    public ReadOnlyFolderException(javax.mail.Folder r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ReadOnlyFolderException(javax.mail.Folder r1, java.lang.String r2) {
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
