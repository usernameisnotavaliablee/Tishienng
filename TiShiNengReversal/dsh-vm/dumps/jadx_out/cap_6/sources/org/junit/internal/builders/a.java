package org.junit.internal.builders;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a extends org.junit.runners.model.f {
    private final boolean b;

    public a(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            return
    }

    @Override // org.junit.runners.model.f
    public org.junit.runner.g c(java.lang.Class<?> r8) throws java.lang.Throwable {
            r7 = this;
            org.junit.internal.builders.c r0 = r7.i()
            org.junit.internal.builders.b r1 = r7.h()
            org.junit.runners.model.f r2 = r7.l()
            org.junit.internal.builders.e r3 = r7.j()
            org.junit.internal.builders.f r4 = r7.k()
            r5 = 5
            org.junit.runners.model.f[] r5 = new org.junit.runners.model.f[r5]
            r6 = 0
            r5[r6] = r0
            r0 = 1
            r5[r0] = r1
            r0 = 2
            r5[r0] = r2
            r0 = 3
            r5[r0] = r3
            r0 = 4
            r5[r0] = r4
            java.util.List r0 = java.util.Arrays.asList(r5)
            java.util.Iterator r0 = r0.iterator()
        L2e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()
            org.junit.runners.model.f r1 = (org.junit.runners.model.f) r1
            org.junit.runner.g r1 = r1.g(r8)
            if (r1 == 0) goto L2e
            return r1
        L41:
            r8 = 0
            return r8
    }

    protected org.junit.internal.builders.b h() {
            r1 = this;
            org.junit.internal.builders.b r0 = new org.junit.internal.builders.b
            r0.<init>(r1)
            return r0
    }

    protected org.junit.internal.builders.c i() {
            r1 = this;
            org.junit.internal.builders.c r0 = new org.junit.internal.builders.c
            r0.<init>()
            return r0
    }

    protected org.junit.internal.builders.e j() {
            r1 = this;
            org.junit.internal.builders.e r0 = new org.junit.internal.builders.e
            r0.<init>()
            return r0
    }

    protected org.junit.internal.builders.f k() {
            r1 = this;
            org.junit.internal.builders.f r0 = new org.junit.internal.builders.f
            r0.<init>()
            return r0
    }

    protected org.junit.runners.model.f l() {
            r1 = this;
            boolean r0 = r1.b
            if (r0 == 0) goto La
            org.junit.internal.builders.h r0 = new org.junit.internal.builders.h
            r0.<init>()
            return r0
        La:
            org.junit.internal.builders.g r0 = new org.junit.internal.builders.g
            r0.<init>()
            return r0
    }
}
