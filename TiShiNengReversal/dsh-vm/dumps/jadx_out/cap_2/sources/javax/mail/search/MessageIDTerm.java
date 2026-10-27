package javax.mail.search;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class MessageIDTerm extends javax.mail.search.StringTerm {
    private static final long serialVersionUID = -2121096296454691963L;

    public MessageIDTerm(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // javax.mail.search.StringTerm
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof javax.mail.search.MessageIDTerm
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
            java.lang.String r1 = "Message-ID"
            java.lang.String[] r4 = r4.getHeader(r1)     // Catch: java.lang.Exception -> L1c
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
