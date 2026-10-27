package org.junit.experimental.theories.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c extends org.junit.experimental.theories.b {
    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.junit.experimental.theories.b
    public java.util.List<org.junit.experimental.theories.PotentialAssignment> a(org.junit.experimental.theories.a r4) {
            r3 = this;
            java.lang.String r4 = "true"
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            org.junit.experimental.theories.PotentialAssignment r4 = org.junit.experimental.theories.PotentialAssignment.a(r4, r0)
            java.lang.String r0 = "false"
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            org.junit.experimental.theories.PotentialAssignment r0 = org.junit.experimental.theories.PotentialAssignment.a(r0, r1)
            r1 = 2
            org.junit.experimental.theories.PotentialAssignment[] r1 = new org.junit.experimental.theories.PotentialAssignment[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r0
            java.util.List r4 = java.util.Arrays.asList(r1)
            return r4
    }
}
