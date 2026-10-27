package javax.mail.event;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class TransportEvent extends javax.mail.event.MailEvent {
    public static final int MESSAGE_DELIVERED = 1;
    public static final int MESSAGE_NOT_DELIVERED = 2;
    public static final int MESSAGE_PARTIALLY_DELIVERED = 3;
    private static final long serialVersionUID = -4729852364684273073L;
    protected transient javax.mail.Address[] invalid;
    protected transient javax.mail.Message msg;
    protected int type;
    protected transient javax.mail.Address[] validSent;
    protected transient javax.mail.Address[] validUnsent;

    public TransportEvent(javax.mail.Transport r1, int r2, javax.mail.Address[] r3, javax.mail.Address[] r4, javax.mail.Address[] r5, javax.mail.Message r6) {
            r0 = this;
            r0.<init>(r1)
            r0.type = r2
            r0.validSent = r3
            r0.validUnsent = r4
            r0.invalid = r5
            r0.msg = r6
            return
    }

    @Override // javax.mail.event.MailEvent
    public void dispatch(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.type
            r1 = 1
            if (r0 != r1) goto Lb
            javax.mail.event.TransportListener r3 = (javax.mail.event.TransportListener) r3
            r3.messageDelivered(r2)
            return
        Lb:
            r1 = 2
            if (r0 != r1) goto L14
            javax.mail.event.TransportListener r3 = (javax.mail.event.TransportListener) r3
            r3.messageNotDelivered(r2)
            return
        L14:
            javax.mail.event.TransportListener r3 = (javax.mail.event.TransportListener) r3
            r3.messagePartiallyDelivered(r2)
            return
    }

    public javax.mail.Address[] getInvalidAddresses() {
            r1 = this;
            javax.mail.Address[] r0 = r1.invalid
            return r0
    }

    public javax.mail.Message getMessage() {
            r1 = this;
            javax.mail.Message r0 = r1.msg
            return r0
    }

    public int getType() {
            r1 = this;
            int r0 = r1.type
            return r0
    }

    public javax.mail.Address[] getValidSentAddresses() {
            r1 = this;
            javax.mail.Address[] r0 = r1.validSent
            return r0
    }

    public javax.mail.Address[] getValidUnsentAddresses() {
            r1 = this;
            javax.mail.Address[] r0 = r1.validUnsent
            return r0
    }
}
