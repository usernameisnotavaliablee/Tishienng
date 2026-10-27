package javax.mail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class SendFailedException extends javax.mail.MessagingException {
    private static final long serialVersionUID = -6457531621682372913L;
    protected transient javax.mail.Address[] invalid;
    protected transient javax.mail.Address[] validSent;
    protected transient javax.mail.Address[] validUnsent;

    public SendFailedException() {
            r0 = this;
            r0.<init>()
            return
    }

    public SendFailedException(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public SendFailedException(java.lang.String r1, java.lang.Exception r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public SendFailedException(java.lang.String r1, java.lang.Exception r2, javax.mail.Address[] r3, javax.mail.Address[] r4, javax.mail.Address[] r5) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.validSent = r3
            r0.validUnsent = r4
            r0.invalid = r5
            return
    }

    public javax.mail.Address[] getInvalidAddresses() {
            r1 = this;
            javax.mail.Address[] r0 = r1.invalid
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
