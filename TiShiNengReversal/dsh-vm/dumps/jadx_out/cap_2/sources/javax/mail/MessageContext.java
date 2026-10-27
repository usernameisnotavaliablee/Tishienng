package javax.mail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class MessageContext {
    private javax.mail.Part part;

    public MessageContext(javax.mail.Part r1) {
            r0 = this;
            r0.<init>()
            r0.part = r1
            return
    }

    private static javax.mail.Message getMessage(javax.mail.Part r2) throws javax.mail.MessagingException {
        L0:
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            boolean r1 = r2 instanceof javax.mail.Message
            if (r1 == 0) goto Lb
            javax.mail.Message r2 = (javax.mail.Message) r2
            return r2
        Lb:
            javax.mail.BodyPart r2 = (javax.mail.BodyPart) r2
            javax.mail.Multipart r2 = r2.getParent()
            if (r2 != 0) goto L14
            return r0
        L14:
            javax.mail.Part r2 = r2.getParent()
            goto L0
    }

    public javax.mail.Message getMessage() {
            r1 = this;
            javax.mail.Part r0 = r1.part     // Catch: javax.mail.MessagingException -> L7
            javax.mail.Message r0 = getMessage(r0)     // Catch: javax.mail.MessagingException -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public javax.mail.Part getPart() {
            r1 = this;
            javax.mail.Part r0 = r1.part
            return r0
    }

    public javax.mail.Session getSession() {
            r1 = this;
            javax.mail.Message r0 = r1.getMessage()
            if (r0 == 0) goto L9
            javax.mail.Session r0 = r0.session
            return r0
        L9:
            r0 = 0
            return r0
    }
}
