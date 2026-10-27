package org.junit.rules;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class k extends org.junit.rules.m {
    private java.lang.String a;

    public k() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.junit.rules.m
    protected void n(org.junit.runner.Description r1) {
            r0 = this;
            java.lang.String r1 = r1.getMethodName()
            r0.a = r1
            return
    }

    public java.lang.String r() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }
}
