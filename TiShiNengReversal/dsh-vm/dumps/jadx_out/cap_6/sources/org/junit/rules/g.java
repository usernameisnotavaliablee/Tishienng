package org.junit.rules;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class g implements org.junit.rules.l {
    private static final org.junit.rules.g b = null;
    private java.util.List<org.junit.rules.l> a;

    static {
            org.junit.rules.g r0 = new org.junit.rules.g
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            r0.<init>(r1)
            org.junit.rules.g.b = r0
            return
    }

    private g(java.util.List<org.junit.rules.l> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static org.junit.rules.g c() {
            org.junit.rules.g r0 = org.junit.rules.g.b
            return r0
    }

    public static org.junit.rules.g d(org.junit.rules.l r1) {
            org.junit.rules.g r0 = c()
            org.junit.rules.g r1 = r0.b(r1)
            return r1
    }

    @Override // org.junit.rules.l
    public org.junit.runners.model.h a(org.junit.runners.model.h r3, org.junit.runner.Description r4) {
            r2 = this;
            java.util.List<org.junit.rules.l> r0 = r2.a
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r0.next()
            org.junit.rules.l r1 = (org.junit.rules.l) r1
            org.junit.runners.model.h r3 = r1.a(r3, r4)
            goto L6
        L17:
            return r3
    }

    public org.junit.rules.g b(org.junit.rules.l r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r2)
            java.util.List<org.junit.rules.l> r2 = r1.a
            r0.addAll(r2)
            org.junit.rules.g r2 = new org.junit.rules.g
            r2.<init>(r0)
            return r2
    }
}
