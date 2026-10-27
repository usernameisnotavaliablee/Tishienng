package javax.mail.search;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class StringTerm extends javax.mail.search.SearchTerm {
    private static final long serialVersionUID = 1274042129007696269L;
    protected boolean ignoreCase;
    protected java.lang.String pattern;

    protected StringTerm(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.pattern = r1
            r1 = 1
            r0.ignoreCase = r1
            return
    }

    protected StringTerm(java.lang.String r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.pattern = r1
            r0.ignoreCase = r2
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof javax.mail.search.StringTerm
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            javax.mail.search.StringTerm r5 = (javax.mail.search.StringTerm) r5
            boolean r0 = r4.ignoreCase
            r2 = 1
            if (r0 == 0) goto L1f
            java.lang.String r0 = r5.pattern
            java.lang.String r3 = r4.pattern
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L1e
            boolean r5 = r5.ignoreCase
            boolean r0 = r4.ignoreCase
            if (r5 != r0) goto L1e
            return r2
        L1e:
            return r1
        L1f:
            java.lang.String r0 = r5.pattern
            java.lang.String r3 = r4.pattern
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L30
            boolean r5 = r5.ignoreCase
            boolean r0 = r4.ignoreCase
            if (r5 != r0) goto L30
            return r2
        L30:
            return r1
    }

    public boolean getIgnoreCase() {
            r1 = this;
            boolean r0 = r1.ignoreCase
            return r0
    }

    public java.lang.String getPattern() {
            r1 = this;
            java.lang.String r0 = r1.pattern
            return r0
    }

    public int hashCode() {
            r1 = this;
            boolean r0 = r1.ignoreCase
            if (r0 == 0) goto Lb
            java.lang.String r0 = r1.pattern
            int r0 = r0.hashCode()
            return r0
        Lb:
            java.lang.String r0 = r1.pattern
            int r0 = r0.hashCode()
            int r0 = ~r0
            return r0
    }

    protected boolean match(java.lang.String r9) {
            r8 = this;
            int r0 = r9.length()
            java.lang.String r1 = r8.pattern
            int r1 = r1.length()
            int r0 = r0 - r1
            r1 = 0
            r4 = 0
        Ld:
            if (r4 <= r0) goto L10
            return r1
        L10:
            boolean r3 = r8.ignoreCase
            java.lang.String r5 = r8.pattern
            r6 = 0
            int r7 = r5.length()
            r2 = r9
            boolean r9 = r2.regionMatches(r3, r4, r5, r6, r7)
            if (r9 == 0) goto L22
            r9 = 1
            return r9
        L22:
            int r4 = r4 + 1
            r9 = r2
            goto Ld
    }
}
