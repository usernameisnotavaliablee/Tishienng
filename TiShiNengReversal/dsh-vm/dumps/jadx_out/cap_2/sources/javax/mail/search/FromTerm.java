package javax.mail.search;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FromTerm extends javax.mail.search.AddressTerm {
    private static final long serialVersionUID = 5214730291502658665L;

    public FromTerm(javax.mail.Address r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // javax.mail.search.AddressTerm
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof javax.mail.search.FromTerm
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            boolean r2 = super.equals(r2)
            return r2
    }

    @Override // javax.mail.search.SearchTerm
    public boolean match(javax.mail.Message r4) {
            r3 = this;
            r0 = 0
            javax.mail.Address[] r4 = r4.getFrom()     // Catch: java.lang.Exception -> L1a
            if (r4 != 0) goto L8
            return r0
        L8:
            r1 = 0
        L9:
            int r2 = r4.length
            if (r1 < r2) goto Ld
            return r0
        Ld:
            r2 = r4[r1]
            boolean r2 = super.match(r2)
            if (r2 == 0) goto L17
            r4 = 1
            return r4
        L17:
            int r1 = r1 + 1
            goto L9
        L1a:
            return r0
    }
}
