package org.junit.runner;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class g implements org.junit.runner.b {
    public g() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void a(org.junit.runner.notification.a r1);

    public int c() {
            r1 = this;
            org.junit.runner.Description r0 = r1.getDescription()
            int r0 = r0.testCount()
            return r0
    }

    @Override // org.junit.runner.b
    public abstract org.junit.runner.Description getDescription();
}
