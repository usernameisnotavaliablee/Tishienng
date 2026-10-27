package javax.mail.search;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class AddressStringTerm extends javax.mail.search.StringTerm {
    private static final long serialVersionUID = 3086821234204980368L;

    protected AddressStringTerm(java.lang.String r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    @Override // javax.mail.search.StringTerm
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof javax.mail.search.AddressStringTerm
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            boolean r2 = super.equals(r2)
            return r2
    }

    protected boolean match(javax.mail.Address r2) {
            r1 = this;
            boolean r0 = r2 instanceof javax.mail.internet.InternetAddress
            if (r0 == 0) goto Lf
            javax.mail.internet.InternetAddress r2 = (javax.mail.internet.InternetAddress) r2
            java.lang.String r2 = r2.toUnicodeString()
            boolean r2 = super.match(r2)
            return r2
        Lf:
            java.lang.String r2 = r2.toString()
            boolean r2 = super.match(r2)
            return r2
    }
}
