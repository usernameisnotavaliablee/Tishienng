package javax.mail.search;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class DateTerm extends javax.mail.search.ComparisonTerm {
    private static final long serialVersionUID = 4818873430063720043L;
    protected java.util.Date date;

    protected DateTerm(int r1, java.util.Date r2) {
            r0 = this;
            r0.<init>()
            r0.comparison = r1
            r0.date = r2
            return
    }

    @Override // javax.mail.search.ComparisonTerm
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof javax.mail.search.DateTerm
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r4
            javax.mail.search.DateTerm r0 = (javax.mail.search.DateTerm) r0
            java.util.Date r0 = r0.date
            java.util.Date r2 = r3.date
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1b
            boolean r4 = super.equals(r4)
            if (r4 == 0) goto L1b
            r4 = 1
            return r4
        L1b:
            return r1
    }

    public int getComparison() {
            r1 = this;
            int r0 = r1.comparison
            return r0
    }

    public java.util.Date getDate() {
            r3 = this;
            java.util.Date r0 = new java.util.Date
            java.util.Date r1 = r3.date
            long r1 = r1.getTime()
            r0.<init>(r1)
            return r0
    }

    @Override // javax.mail.search.ComparisonTerm
    public int hashCode() {
            r2 = this;
            java.util.Date r0 = r2.date
            int r0 = r0.hashCode()
            int r1 = super.hashCode()
            int r0 = r0 + r1
            return r0
    }

    protected boolean match(java.util.Date r4) {
            r3 = this;
            int r0 = r3.comparison
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L37;
                case 2: goto L30;
                case 3: goto L29;
                case 4: goto L21;
                case 5: goto L1a;
                case 6: goto L8;
                default: goto L7;
            }
        L7:
            return r2
        L8:
            java.util.Date r0 = r3.date
            boolean r0 = r4.after(r0)
            if (r0 != 0) goto L19
            java.util.Date r0 = r3.date
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L19
            return r2
        L19:
            return r1
        L1a:
            java.util.Date r0 = r3.date
            boolean r4 = r4.after(r0)
            return r4
        L21:
            java.util.Date r0 = r3.date
            boolean r4 = r4.equals(r0)
            r4 = r4 ^ r1
            return r4
        L29:
            java.util.Date r0 = r3.date
            boolean r4 = r4.equals(r0)
            return r4
        L30:
            java.util.Date r0 = r3.date
            boolean r4 = r4.before(r0)
            return r4
        L37:
            java.util.Date r0 = r3.date
            boolean r0 = r4.before(r0)
            if (r0 != 0) goto L48
            java.util.Date r0 = r3.date
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L48
            return r2
        L48:
            return r1
    }
}
