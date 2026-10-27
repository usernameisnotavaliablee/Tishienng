package javax.mail.search;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class ComparisonTerm extends javax.mail.search.SearchTerm {
    public static final int EQ = 3;
    public static final int GE = 6;
    public static final int GT = 5;
    public static final int LE = 1;
    public static final int LT = 2;
    public static final int NE = 4;
    private static final long serialVersionUID = 1456646953666474308L;
    protected int comparison;

    public ComparisonTerm() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof javax.mail.search.ComparisonTerm
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            javax.mail.search.ComparisonTerm r3 = (javax.mail.search.ComparisonTerm) r3
            int r3 = r3.comparison
            int r0 = r2.comparison
            if (r3 != r0) goto L10
            r3 = 1
            return r3
        L10:
            return r1
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.comparison
            return r0
    }
}
