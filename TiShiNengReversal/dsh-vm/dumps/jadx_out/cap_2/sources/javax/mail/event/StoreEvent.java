package javax.mail.event;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class StoreEvent extends javax.mail.event.MailEvent {
    public static final int ALERT = 1;
    public static final int NOTICE = 2;
    private static final long serialVersionUID = 1938704919992515330L;
    protected java.lang.String message;
    protected int type;

    public StoreEvent(javax.mail.Store r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1)
            r0.type = r2
            r0.message = r3
            return
    }

    @Override // javax.mail.event.MailEvent
    public void dispatch(java.lang.Object r1) {
            r0 = this;
            javax.mail.event.StoreListener r1 = (javax.mail.event.StoreListener) r1
            r1.notification(r0)
            return
    }

    public java.lang.String getMessage() {
            r1 = this;
            java.lang.String r0 = r1.message
            return r0
    }

    public int getMessageType() {
            r1 = this;
            int r0 = r1.type
            return r0
    }
}
