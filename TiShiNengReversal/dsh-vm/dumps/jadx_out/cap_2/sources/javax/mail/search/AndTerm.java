package javax.mail.search;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class AndTerm extends javax.mail.search.SearchTerm {
    private static final long serialVersionUID = -3583274505380989582L;
    protected javax.mail.search.SearchTerm[] terms;

    public AndTerm(javax.mail.search.SearchTerm r3, javax.mail.search.SearchTerm r4) {
            r2 = this;
            r2.<init>()
            r0 = 2
            javax.mail.search.SearchTerm[] r0 = new javax.mail.search.SearchTerm[r0]
            r2.terms = r0
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            return
    }

    public AndTerm(javax.mail.search.SearchTerm[] r4) {
            r3 = this;
            r3.<init>()
            int r0 = r4.length
            javax.mail.search.SearchTerm[] r0 = new javax.mail.search.SearchTerm[r0]
            r3.terms = r0
            r0 = 0
        L9:
            int r1 = r4.length
            if (r0 < r1) goto Ld
            return
        Ld:
            javax.mail.search.SearchTerm[] r1 = r3.terms
            r2 = r4[r0]
            r1[r0] = r2
            int r0 = r0 + 1
            goto L9
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof javax.mail.search.AndTerm
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            javax.mail.search.AndTerm r5 = (javax.mail.search.AndTerm) r5
            javax.mail.search.SearchTerm[] r0 = r5.terms
            int r0 = r0.length
            javax.mail.search.SearchTerm[] r2 = r4.terms
            int r2 = r2.length
            if (r0 == r2) goto L11
            return r1
        L11:
            r0 = 0
        L12:
            javax.mail.search.SearchTerm[] r2 = r4.terms
            int r3 = r2.length
            if (r0 < r3) goto L19
            r5 = 1
            return r5
        L19:
            r2 = r2[r0]
            javax.mail.search.SearchTerm[] r3 = r5.terms
            r3 = r3[r0]
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L26
            return r1
        L26:
            int r0 = r0 + 1
            goto L12
    }

    public javax.mail.search.SearchTerm[] getTerms() {
            r1 = this;
            javax.mail.search.SearchTerm[] r0 = r1.terms
            java.lang.Object r0 = r0.clone()
            javax.mail.search.SearchTerm[] r0 = (javax.mail.search.SearchTerm[]) r0
            return r0
    }

    public int hashCode() {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            javax.mail.search.SearchTerm[] r2 = r4.terms
            int r3 = r2.length
            if (r0 < r3) goto L8
            return r1
        L8:
            r2 = r2[r0]
            int r2 = r2.hashCode()
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L2
    }

    @Override // javax.mail.search.SearchTerm
    public boolean match(javax.mail.Message r5) {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            javax.mail.search.SearchTerm[] r2 = r4.terms
            int r3 = r2.length
            if (r1 < r3) goto L9
            r5 = 1
            return r5
        L9:
            r2 = r2[r1]
            boolean r2 = r2.match(r5)
            if (r2 != 0) goto L12
            return r0
        L12:
            int r1 = r1 + 1
            goto L2
    }
}
