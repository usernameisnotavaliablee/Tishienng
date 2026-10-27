package javax.mail.event;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class MailEvent extends java.util.EventObject {
    private static final long serialVersionUID = 1846275636325456631L;

    public MailEvent(java.lang.Object r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public abstract void dispatch(java.lang.Object r1);
}
