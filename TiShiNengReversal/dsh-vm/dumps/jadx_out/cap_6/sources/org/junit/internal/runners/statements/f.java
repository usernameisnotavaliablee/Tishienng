package org.junit.internal.runners.statements;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class f extends org.junit.runners.model.h {
    private final org.junit.runners.model.h a;
    private final java.lang.Object b;
    private final java.util.List<org.junit.runners.model.d> c;

    public f(org.junit.runners.model.h r1, java.util.List<org.junit.runners.model.d> r2, java.lang.Object r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.c = r2
            r0.b = r3
            return
    }

    @Override // org.junit.runners.model.h
    public void a() throws java.lang.Throwable {
            r4 = this;
            java.util.List<org.junit.runners.model.d> r0 = r4.c
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            org.junit.runners.model.d r1 = (org.junit.runners.model.d) r1
            java.lang.Object r2 = r4.b
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r1.l(r2, r3)
            goto L6
        L1b:
            org.junit.runners.model.h r0 = r4.a
            r0.a()
            return
    }
}
