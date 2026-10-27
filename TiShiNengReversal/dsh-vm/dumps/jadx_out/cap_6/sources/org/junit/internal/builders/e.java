package org.junit.internal.builders;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class e extends org.junit.runners.model.f {
    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.junit.runners.model.f
    public org.junit.runner.g c(java.lang.Class<?> r2) throws java.lang.Throwable {
            r1 = this;
            boolean r0 = r1.h(r2)
            if (r0 == 0) goto Lc
            org.junit.internal.runners.d r0 = new org.junit.internal.runners.d
            r0.<init>(r2)
            return r0
        Lc:
            r2 = 0
            return r2
    }

    boolean h(java.lang.Class<?> r2) {
            r1 = this;
            java.lang.Class<junit.framework.g> r0 = junit.framework.g.class
            boolean r2 = r0.isAssignableFrom(r2)
            return r2
    }
}
