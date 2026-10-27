package javax.mail.search;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SizeTerm extends javax.mail.search.IntegerComparisonTerm {
    private static final long serialVersionUID = -2556219451005103709L;

    public SizeTerm(int r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // javax.mail.search.IntegerComparisonTerm, javax.mail.search.ComparisonTerm
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof javax.mail.search.SizeTerm
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            boolean r2 = super.equals(r2)
            return r2
    }

    @Override // javax.mail.search.SearchTerm
    public boolean match(javax.mail.Message r3) {
            r2 = this;
            r0 = 0
            int r3 = r3.getSize()     // Catch: java.lang.Exception -> Le
            r1 = -1
            if (r3 != r1) goto L9
            return r0
        L9:
            boolean r3 = super.match(r3)
            return r3
        Le:
            return r0
    }
}
