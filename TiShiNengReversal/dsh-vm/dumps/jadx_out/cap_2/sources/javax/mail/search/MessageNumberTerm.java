package javax.mail.search;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class MessageNumberTerm extends javax.mail.search.IntegerComparisonTerm {
    private static final long serialVersionUID = -5379625829658623812L;

    public MessageNumberTerm(int r2) {
            r1 = this;
            r0 = 3
            r1.<init>(r0, r2)
            return
    }

    @Override // javax.mail.search.IntegerComparisonTerm, javax.mail.search.ComparisonTerm
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof javax.mail.search.MessageNumberTerm
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            boolean r2 = super.equals(r2)
            return r2
    }

    @Override // javax.mail.search.SearchTerm
    public boolean match(javax.mail.Message r1) {
            r0 = this;
            int r1 = r1.getMessageNumber()     // Catch: java.lang.Exception -> L9
            boolean r1 = super.match(r1)
            return r1
        L9:
            r1 = 0
            return r1
    }
}
