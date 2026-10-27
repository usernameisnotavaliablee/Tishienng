package javax.mail.event;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class MessageChangedEvent extends javax.mail.event.MailEvent {
    public static final int ENVELOPE_CHANGED = 2;
    public static final int FLAGS_CHANGED = 1;
    private static final long serialVersionUID = -4974972972105535108L;
    protected transient javax.mail.Message msg;
    protected int type;

    public MessageChangedEvent(java.lang.Object r1, int r2, javax.mail.Message r3) {
            r0 = this;
            r0.<init>(r1)
            r0.msg = r3
            r0.type = r2
            return
    }

    @Override // javax.mail.event.MailEvent
    public void dispatch(java.lang.Object r1) {
            r0 = this;
            javax.mail.event.MessageChangedListener r1 = (javax.mail.event.MessageChangedListener) r1
            r1.messageChanged(r0)
            return
    }

    public javax.mail.Message getMessage() {
            r1 = this;
            javax.mail.Message r0 = r1.msg
            return r0
    }

    public int getMessageChangeType() {
            r1 = this;
            int r0 = r1.type
            return r0
    }
}
