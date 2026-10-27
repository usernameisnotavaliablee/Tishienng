package javax.mail.event;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class MessageCountEvent extends javax.mail.event.MailEvent {
    public static final int ADDED = 1;
    public static final int REMOVED = 2;
    private static final long serialVersionUID = -7447022340837897369L;
    protected transient javax.mail.Message[] msgs;
    protected boolean removed;
    protected int type;

    public MessageCountEvent(javax.mail.Folder r1, int r2, boolean r3, javax.mail.Message[] r4) {
            r0 = this;
            r0.<init>(r1)
            r0.type = r2
            r0.removed = r3
            r0.msgs = r4
            return
    }

    @Override // javax.mail.event.MailEvent
    public void dispatch(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.type
            r1 = 1
            if (r0 != r1) goto Lb
            javax.mail.event.MessageCountListener r3 = (javax.mail.event.MessageCountListener) r3
            r3.messagesAdded(r2)
            return
        Lb:
            javax.mail.event.MessageCountListener r3 = (javax.mail.event.MessageCountListener) r3
            r3.messagesRemoved(r2)
            return
    }

    public javax.mail.Message[] getMessages() {
            r1 = this;
            javax.mail.Message[] r0 = r1.msgs
            return r0
    }

    public int getType() {
            r1 = this;
            int r0 = r1.type
            return r0
    }

    public boolean isRemoved() {
            r1 = this;
            boolean r0 = r1.removed
            return r0
    }
}
