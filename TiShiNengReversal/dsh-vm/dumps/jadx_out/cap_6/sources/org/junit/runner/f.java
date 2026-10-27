package org.junit.runner;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class f {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a extends org.junit.runner.f {
        final /* synthetic */ org.junit.runner.g a;

        a(org.junit.runner.g r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // org.junit.runner.f
        public org.junit.runner.g h() {
                r1 = this;
                org.junit.runner.g r0 = r1.a
                return r0
        }
    }

    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.junit.runner.f a(java.lang.Class<?> r1) {
            g5.a r0 = new g5.a
            r0.<init>(r1)
            return r0
    }

    public static org.junit.runner.f b(java.lang.Class<?> r2) {
            g5.a r0 = new g5.a
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static org.junit.runner.f c(org.junit.runner.a r2, java.lang.Class<?>... r3) {
            org.junit.internal.builders.a r0 = new org.junit.internal.builders.a     // Catch: org.junit.runners.model.InitializationError -> Lf
            r1 = 1
            r0.<init>(r1)     // Catch: org.junit.runners.model.InitializationError -> Lf
            org.junit.runner.g r2 = r2.b(r0, r3)     // Catch: org.junit.runners.model.InitializationError -> Lf
            org.junit.runner.f r2 = j(r2)     // Catch: org.junit.runners.model.InitializationError -> Lf
            return r2
        Lf:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Bug in saff's brain: Suite constructor, called as above, should always complete"
            r2.<init>(r3)
            throw r2
    }

    public static org.junit.runner.f d(java.lang.Class<?>... r1) {
            org.junit.runner.a r0 = org.junit.runner.e.b()
            org.junit.runner.f r1 = c(r0, r1)
            return r1
    }

    public static org.junit.runner.f e(java.lang.Class<?> r1, java.lang.Throwable r2) {
            org.junit.internal.runners.b r0 = new org.junit.internal.runners.b
            r0.<init>(r1, r2)
            org.junit.runner.f r1 = j(r0)
            return r1
    }

    public static org.junit.runner.f i(java.lang.Class<?> r0, java.lang.String r1) {
            org.junit.runner.Description r1 = org.junit.runner.Description.createTestDescription(r0, r1)
            org.junit.runner.f r0 = a(r0)
            org.junit.runner.f r0 = r0.f(r1)
            return r0
    }

    public static org.junit.runner.f j(org.junit.runner.g r1) {
            org.junit.runner.f$a r0 = new org.junit.runner.f$a
            r0.<init>(r1)
            return r0
    }

    public org.junit.runner.f f(org.junit.runner.Description r1) {
            r0 = this;
            org.junit.runner.manipulation.a r1 = org.junit.runner.manipulation.a.d(r1)
            org.junit.runner.f r1 = r0.g(r1)
            return r1
    }

    public org.junit.runner.f g(org.junit.runner.manipulation.a r2) {
            r1 = this;
            g5.b r0 = new g5.b
            r0.<init>(r1, r2)
            return r0
    }

    public abstract org.junit.runner.g h();

    public org.junit.runner.f k(java.util.Comparator<org.junit.runner.Description> r2) {
            r1 = this;
            g5.c r0 = new g5.c
            r0.<init>(r1, r2)
            return r0
    }
}
