package javax.mail.search;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlagTerm extends javax.mail.search.SearchTerm {
    private static final long serialVersionUID = -142991500302030647L;
    protected javax.mail.Flags flags;
    protected boolean set;

    public FlagTerm(javax.mail.Flags r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.flags = r1
            r0.set = r2
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof javax.mail.search.FlagTerm
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            javax.mail.search.FlagTerm r4 = (javax.mail.search.FlagTerm) r4
            boolean r0 = r4.set
            boolean r2 = r3.set
            if (r0 != r2) goto L1a
            javax.mail.Flags r4 = r4.flags
            javax.mail.Flags r0 = r3.flags
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L1a
            r4 = 1
            return r4
        L1a:
            return r1
    }

    public javax.mail.Flags getFlags() {
            r1 = this;
            javax.mail.Flags r0 = r1.flags
            java.lang.Object r0 = r0.clone()
            javax.mail.Flags r0 = (javax.mail.Flags) r0
            return r0
    }

    public boolean getTestSet() {
            r1 = this;
            boolean r0 = r1.set
            return r0
    }

    public int hashCode() {
            r1 = this;
            boolean r0 = r1.set
            if (r0 == 0) goto Lb
            javax.mail.Flags r0 = r1.flags
            int r0 = r0.hashCode()
            return r0
        Lb:
            javax.mail.Flags r0 = r1.flags
            int r0 = r0.hashCode()
            int r0 = ~r0
            return r0
    }

    @Override // javax.mail.search.SearchTerm
    public boolean match(javax.mail.Message r6) {
            r5 = this;
            r0 = 0
            javax.mail.Flags r6 = r6.getFlags()     // Catch: java.lang.Exception -> L41
            boolean r1 = r5.set     // Catch: java.lang.Exception -> L41
            r2 = 1
            if (r1 == 0) goto L14
            javax.mail.Flags r1 = r5.flags     // Catch: java.lang.Exception -> L41
            boolean r6 = r6.contains(r1)     // Catch: java.lang.Exception -> L41
            if (r6 == 0) goto L13
            return r2
        L13:
            return r0
        L14:
            javax.mail.Flags r1 = r5.flags     // Catch: java.lang.Exception -> L41
            javax.mail.Flags$Flag[] r1 = r1.getSystemFlags()     // Catch: java.lang.Exception -> L41
            r3 = 0
        L1b:
            int r4 = r1.length     // Catch: java.lang.Exception -> L41
            if (r3 < r4) goto L35
            javax.mail.Flags r1 = r5.flags     // Catch: java.lang.Exception -> L41
            java.lang.String[] r1 = r1.getUserFlags()     // Catch: java.lang.Exception -> L41
            r3 = 0
        L25:
            int r4 = r1.length     // Catch: java.lang.Exception -> L41
            if (r3 < r4) goto L29
            return r2
        L29:
            r4 = r1[r3]     // Catch: java.lang.Exception -> L41
            boolean r4 = r6.contains(r4)     // Catch: java.lang.Exception -> L41
            if (r4 == 0) goto L32
            return r0
        L32:
            int r3 = r3 + 1
            goto L25
        L35:
            r4 = r1[r3]     // Catch: java.lang.Exception -> L41
            boolean r4 = r6.contains(r4)     // Catch: java.lang.Exception -> L41
            if (r4 == 0) goto L3e
            return r0
        L3e:
            int r3 = r3 + 1
            goto L1b
        L41:
            return r0
    }
}
