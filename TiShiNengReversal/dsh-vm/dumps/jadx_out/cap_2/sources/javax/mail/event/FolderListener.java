package javax.mail.event;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface FolderListener extends java.util.EventListener {
    void folderCreated(javax.mail.event.FolderEvent r1);

    void folderDeleted(javax.mail.event.FolderEvent r1);

    void folderRenamed(javax.mail.event.FolderEvent r1);
}
