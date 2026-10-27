package org.junit.runner;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class d {
    private final org.junit.runner.Description a;
    private final java.lang.String b;

    public d(org.junit.runner.Description r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            if (r2 == 0) goto Lc
            if (r1 == 0) goto Lc
            r0.a = r1
            r0.b = r2
            return
        Lc:
            r1 = 0
            throw r1
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public org.junit.runner.Description b() {
            r1 = this;
            org.junit.runner.Description r0 = r1.a
            return r0
    }
}
