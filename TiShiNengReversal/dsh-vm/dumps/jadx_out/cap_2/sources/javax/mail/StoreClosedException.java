package javax.mail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class StoreClosedException extends javax.mail.MessagingException {
    private static final long serialVersionUID = -3145392336120082655L;
    private transient javax.mail.Store store;

    public StoreClosedException(javax.mail.Store r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public StoreClosedException(javax.mail.Store r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r2)
            r0.store = r1
            return
    }

    public javax.mail.Store getStore() {
            r1 = this;
            javax.mail.Store r0 = r1.store
            return r0
    }
}
