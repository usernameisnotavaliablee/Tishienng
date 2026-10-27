package javax.mail.event;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class ConnectionEvent extends javax.mail.event.MailEvent {
    public static final int CLOSED = 3;
    public static final int DISCONNECTED = 2;
    public static final int OPENED = 1;
    private static final long serialVersionUID = -1855480171284792957L;
    protected int type;

    public ConnectionEvent(java.lang.Object r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.type = r2
            return
    }

    @Override // javax.mail.event.MailEvent
    public void dispatch(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.type
            r1 = 1
            if (r0 != r1) goto Lb
            javax.mail.event.ConnectionListener r3 = (javax.mail.event.ConnectionListener) r3
            r3.opened(r2)
            return
        Lb:
            r1 = 2
            if (r0 != r1) goto L14
            javax.mail.event.ConnectionListener r3 = (javax.mail.event.ConnectionListener) r3
            r3.disconnected(r2)
            return
        L14:
            r1 = 3
            if (r0 != r1) goto L1c
            javax.mail.event.ConnectionListener r3 = (javax.mail.event.ConnectionListener) r3
            r3.closed(r2)
        L1c:
            return
    }

    public int getType() {
            r1 = this;
            int r0 = r1.type
            return r0
    }
}
