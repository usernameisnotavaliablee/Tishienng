package javax.mail.search;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class IntegerComparisonTerm extends javax.mail.search.ComparisonTerm {
    private static final long serialVersionUID = -6963571240154302484L;
    protected int number;

    protected IntegerComparisonTerm(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.comparison = r1
            r0.number = r2
            return
    }

    @Override // javax.mail.search.ComparisonTerm
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof javax.mail.search.IntegerComparisonTerm
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r4
            javax.mail.search.IntegerComparisonTerm r0 = (javax.mail.search.IntegerComparisonTerm) r0
            int r0 = r0.number
            int r2 = r3.number
            if (r0 != r2) goto L17
            boolean r4 = super.equals(r4)
            if (r4 == 0) goto L17
            r4 = 1
            return r4
        L17:
            return r1
    }

    public int getComparison() {
            r1 = this;
            int r0 = r1.comparison
            return r0
    }

    public int getNumber() {
            r1 = this;
            int r0 = r1.number
            return r0
    }

    @Override // javax.mail.search.ComparisonTerm
    public int hashCode() {
            r2 = this;
            int r0 = r2.number
            int r1 = super.hashCode()
            int r0 = r0 + r1
            return r0
    }

    protected boolean match(int r4) {
            r3 = this;
            int r0 = r3.comparison
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L26;
                case 2: goto L20;
                case 3: goto L1a;
                case 4: goto L14;
                case 5: goto Le;
                case 6: goto L8;
                default: goto L7;
            }
        L7:
            return r2
        L8:
            int r0 = r3.number
            if (r4 < r0) goto Ld
            return r1
        Ld:
            return r2
        Le:
            int r0 = r3.number
            if (r4 <= r0) goto L13
            return r1
        L13:
            return r2
        L14:
            int r0 = r3.number
            if (r4 == r0) goto L19
            return r1
        L19:
            return r2
        L1a:
            int r0 = r3.number
            if (r4 != r0) goto L1f
            return r1
        L1f:
            return r2
        L20:
            int r0 = r3.number
            if (r4 >= r0) goto L25
            return r1
        L25:
            return r2
        L26:
            int r0 = r3.number
            if (r4 > r0) goto L2b
            return r1
        L2b:
            return r2
    }
}
