package org.junit.internal.builders;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c extends org.junit.runners.model.f {
    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.junit.runners.model.f
    public org.junit.runner.g c(java.lang.Class<?> r2) {
            r1 = this;
            java.lang.Class<org.junit.Ignore> r0 = org.junit.Ignore.class
            java.lang.annotation.Annotation r0 = r2.getAnnotation(r0)
            if (r0 == 0) goto Le
            org.junit.internal.builders.d r0 = new org.junit.internal.builders.d
            r0.<init>(r2)
            return r0
        Le:
            r2 = 0
            return r2
    }
}
