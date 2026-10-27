package org.junit.internal.runners.rules;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class b extends java.lang.Exception {
    public b(org.junit.runners.model.c<?> r3, java.lang.Class<? extends java.lang.annotation.Annotation> r4, java.lang.String r5) {
            r2 = this;
            java.lang.String r4 = r4.getSimpleName()
            java.lang.String r3 = r3.c()
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            r0[r4] = r3
            r3 = 2
            r0[r3] = r5
            java.lang.String r3 = "The @%s '%s' %s"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            r2.<init>(r3)
            return
    }
}
