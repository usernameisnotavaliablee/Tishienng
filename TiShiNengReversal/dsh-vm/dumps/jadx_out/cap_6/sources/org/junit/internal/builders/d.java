package org.junit.internal.builders;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d extends org.junit.runner.g {
    private final java.lang.Class<?> a;

    public d(java.lang.Class<?> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // org.junit.runner.g
    public void a(org.junit.runner.notification.a r2) {
            r1 = this;
            org.junit.runner.Description r0 = r1.getDescription()
            r2.i(r0)
            return
    }

    @Override // org.junit.runner.g, org.junit.runner.b
    public org.junit.runner.Description getDescription() {
            r1 = this;
            java.lang.Class<?> r0 = r1.a
            org.junit.runner.Description r0 = org.junit.runner.Description.createSuiteDescription(r0)
            return r0
    }
}
