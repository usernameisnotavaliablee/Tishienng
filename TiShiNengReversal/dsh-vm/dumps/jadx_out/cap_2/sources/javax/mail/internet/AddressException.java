package javax.mail.internet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class AddressException extends javax.mail.internet.ParseException {
    private static final long serialVersionUID = 9134583443539323120L;
    protected int pos;
    protected java.lang.String ref;

    public AddressException() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.ref = r0
            r0 = -1
            r1.pos = r0
            return
    }

    public AddressException(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.ref = r1
            r1 = -1
            r0.pos = r1
            return
    }

    public AddressException(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1)
            r1 = -1
            r0.pos = r1
            r0.ref = r2
            return
    }

    public AddressException(java.lang.String r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.<init>(r1)
            r0.ref = r2
            r0.pos = r3
            return
    }

    public int getPos() {
            r1 = this;
            int r0 = r1.pos
            return r0
    }

    public java.lang.String getRef() {
            r1 = this;
            java.lang.String r0 = r1.ref
            return r0
    }

    @Override // javax.mail.MessagingException, java.lang.Throwable
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = super.toString()
            java.lang.String r1 = r2.ref
            if (r1 != 0) goto L9
            return r0
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r0)
            java.lang.String r0 = " in string ``"
            r1.append(r0)
            java.lang.String r0 = r2.ref
            r1.append(r0)
            java.lang.String r0 = "''"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            int r1 = r2.pos
            if (r1 >= 0) goto L2a
            return r0
        L2a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r0)
            java.lang.String r0 = " at position "
            r1.append(r0)
            int r0 = r2.pos
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
