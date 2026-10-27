package org.junit.experimental.theories.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d extends org.junit.experimental.theories.b {
    private java.lang.Class<?> a;

    public d(java.lang.Class<?> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // org.junit.experimental.theories.b
    public java.util.List<org.junit.experimental.theories.PotentialAssignment> a(org.junit.experimental.theories.a r6) {
            r5 = this;
            java.lang.Class<?> r6 = r5.a
            java.lang.Object[] r6 = r6.getEnumConstants()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r6.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L1f
            r3 = r6[r2]
            java.lang.String r4 = r3.toString()
            org.junit.experimental.theories.PotentialAssignment r3 = org.junit.experimental.theories.PotentialAssignment.a(r4, r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto Ld
        L1f:
            return r0
    }
}
