package javax.mail.search;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class NotTerm extends javax.mail.search.SearchTerm {
    private static final long serialVersionUID = 7152293214217310216L;
    protected javax.mail.search.SearchTerm term;

    public NotTerm(javax.mail.search.SearchTerm r1) {
            r0 = this;
            r0.<init>()
            r0.term = r1
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof javax.mail.search.NotTerm
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            javax.mail.search.NotTerm r2 = (javax.mail.search.NotTerm) r2
            javax.mail.search.SearchTerm r2 = r2.term
            javax.mail.search.SearchTerm r0 = r1.term
            boolean r2 = r2.equals(r0)
            return r2
    }

    public javax.mail.search.SearchTerm getTerm() {
            r1 = this;
            javax.mail.search.SearchTerm r0 = r1.term
            return r0
    }

    public int hashCode() {
            r1 = this;
            javax.mail.search.SearchTerm r0 = r1.term
            int r0 = r0.hashCode()
            int r0 = r0 << 1
            return r0
    }

    @Override // javax.mail.search.SearchTerm
    public boolean match(javax.mail.Message r2) {
            r1 = this;
            javax.mail.search.SearchTerm r0 = r1.term
            boolean r2 = r0.match(r2)
            r2 = r2 ^ 1
            return r2
    }
}
