package javax.mail.search;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ReceivedDateTerm extends javax.mail.search.DateTerm {
    private static final long serialVersionUID = -2756695246195503170L;

    public ReceivedDateTerm(int r1, java.util.Date r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // javax.mail.search.DateTerm, javax.mail.search.ComparisonTerm
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof javax.mail.search.ReceivedDateTerm
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            boolean r2 = super.equals(r2)
            return r2
    }

    @Override // javax.mail.search.SearchTerm
    public boolean match(javax.mail.Message r2) {
            r1 = this;
            r0 = 0
            java.util.Date r2 = r2.getReceivedDate()     // Catch: java.lang.Exception -> Ld
            if (r2 != 0) goto L8
            return r0
        L8:
            boolean r2 = super.match(r2)
            return r2
        Ld:
            return r0
    }
}
