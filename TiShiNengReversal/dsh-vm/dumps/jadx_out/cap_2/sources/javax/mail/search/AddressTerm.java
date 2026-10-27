package javax.mail.search;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class AddressTerm extends javax.mail.search.SearchTerm {
    private static final long serialVersionUID = 2005405551929769980L;
    protected javax.mail.Address address;

    protected AddressTerm(javax.mail.Address r1) {
            r0 = this;
            r0.<init>()
            r0.address = r1
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof javax.mail.search.AddressTerm
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            javax.mail.search.AddressTerm r2 = (javax.mail.search.AddressTerm) r2
            javax.mail.Address r2 = r2.address
            javax.mail.Address r0 = r1.address
            boolean r2 = r2.equals(r0)
            return r2
    }

    public javax.mail.Address getAddress() {
            r1 = this;
            javax.mail.Address r0 = r1.address
            return r0
    }

    public int hashCode() {
            r1 = this;
            javax.mail.Address r0 = r1.address
            int r0 = r0.hashCode()
            return r0
    }

    protected boolean match(javax.mail.Address r2) {
            r1 = this;
            javax.mail.Address r0 = r1.address
            boolean r2 = r2.equals(r0)
            return r2
    }
}
