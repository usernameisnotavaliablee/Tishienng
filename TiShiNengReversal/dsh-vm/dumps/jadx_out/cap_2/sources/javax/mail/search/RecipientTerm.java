package javax.mail.search;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class RecipientTerm extends javax.mail.search.AddressTerm {
    private static final long serialVersionUID = 6548700653122680468L;
    protected javax.mail.Message.RecipientType type;

    public RecipientTerm(javax.mail.Message.RecipientType r1, javax.mail.Address r2) {
            r0 = this;
            r0.<init>(r2)
            r0.type = r1
            return
    }

    @Override // javax.mail.search.AddressTerm
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof javax.mail.search.RecipientTerm
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r4
            javax.mail.search.RecipientTerm r0 = (javax.mail.search.RecipientTerm) r0
            javax.mail.Message$RecipientType r0 = r0.type
            javax.mail.Message$RecipientType r2 = r3.type
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1b
            boolean r4 = super.equals(r4)
            if (r4 == 0) goto L1b
            r4 = 1
            return r4
        L1b:
            return r1
    }

    public javax.mail.Message.RecipientType getRecipientType() {
            r1 = this;
            javax.mail.Message$RecipientType r0 = r1.type
            return r0
    }

    @Override // javax.mail.search.AddressTerm
    public int hashCode() {
            r2 = this;
            javax.mail.Message$RecipientType r0 = r2.type
            int r0 = r0.hashCode()
            int r1 = super.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // javax.mail.search.SearchTerm
    public boolean match(javax.mail.Message r4) {
            r3 = this;
            r0 = 0
            javax.mail.Message$RecipientType r1 = r3.type     // Catch: java.lang.Exception -> L1c
            javax.mail.Address[] r4 = r4.getRecipients(r1)     // Catch: java.lang.Exception -> L1c
            if (r4 != 0) goto La
            return r0
        La:
            r1 = 0
        Lb:
            int r2 = r4.length
            if (r1 < r2) goto Lf
            return r0
        Lf:
            r2 = r4[r1]
            boolean r2 = super.match(r2)
            if (r2 == 0) goto L19
            r4 = 1
            return r4
        L19:
            int r1 = r1 + 1
            goto Lb
        L1c:
            return r0
    }
}
