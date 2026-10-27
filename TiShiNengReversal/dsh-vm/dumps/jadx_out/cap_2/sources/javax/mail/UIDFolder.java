package javax.mail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface UIDFolder {
    public static final long LASTUID = -1;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class FetchProfileItem extends javax.mail.FetchProfile.Item {
        public static final javax.mail.UIDFolder.FetchProfileItem UID = null;

        static {
                javax.mail.UIDFolder$FetchProfileItem r0 = new javax.mail.UIDFolder$FetchProfileItem
                java.lang.String r1 = "UID"
                r0.<init>(r1)
                javax.mail.UIDFolder.FetchProfileItem.UID = r0
                return
        }

        protected FetchProfileItem(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    javax.mail.Message getMessageByUID(long r1) throws javax.mail.MessagingException;

    javax.mail.Message[] getMessagesByUID(long r1, long r3) throws javax.mail.MessagingException;

    javax.mail.Message[] getMessagesByUID(long[] r1) throws javax.mail.MessagingException;

    long getUID(javax.mail.Message r1) throws javax.mail.MessagingException;

    long getUIDValidity() throws javax.mail.MessagingException;
}
