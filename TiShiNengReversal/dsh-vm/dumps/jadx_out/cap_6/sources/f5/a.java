package f5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a extends org.junit.experimental.theories.b {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.junit.experimental.theories.b
    public java.util.List<org.junit.experimental.theories.PotentialAssignment> a(org.junit.experimental.theories.a r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class<org.junit.experimental.theories.suppliers.TestedOn> r1 = org.junit.experimental.theories.suppliers.TestedOn.class
            java.lang.annotation.Annotation r6 = r6.g(r1)
            org.junit.experimental.theories.suppliers.TestedOn r6 = (org.junit.experimental.theories.suppliers.TestedOn) r6
            int[] r6 = r6.ints()
            int r1 = r6.length
            r2 = 0
        L13:
            if (r2 >= r1) goto L27
            r3 = r6[r2]
            java.lang.String r4 = "ints"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            org.junit.experimental.theories.PotentialAssignment r3 = org.junit.experimental.theories.PotentialAssignment.a(r4, r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto L13
        L27:
            return r0
    }
}
