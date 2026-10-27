package g5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class b extends org.junit.runner.f {
    private final org.junit.runner.f a;
    private final org.junit.runner.manipulation.a b;

    public b(org.junit.runner.f r1, org.junit.runner.manipulation.a r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // org.junit.runner.f
    public org.junit.runner.g h() {
            r6 = this;
            org.junit.runner.f r0 = r6.a     // Catch: org.junit.runner.manipulation.NoTestsRemainException -> Lc
            org.junit.runner.g r0 = r0.h()     // Catch: org.junit.runner.manipulation.NoTestsRemainException -> Lc
            org.junit.runner.manipulation.a r1 = r6.b     // Catch: org.junit.runner.manipulation.NoTestsRemainException -> Lc
            r1.a(r0)     // Catch: org.junit.runner.manipulation.NoTestsRemainException -> Lc
            return r0
        Lc:
            org.junit.internal.runners.b r0 = new org.junit.internal.runners.b
            java.lang.Exception r1 = new java.lang.Exception
            org.junit.runner.manipulation.a r2 = r6.b
            java.lang.String r2 = r2.b()
            org.junit.runner.f r3 = r6.a
            java.lang.String r3 = r3.toString()
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r2
            r2 = 1
            r4[r2] = r3
            java.lang.String r2 = "No tests found matching %s from %s"
            java.lang.String r2 = java.lang.String.format(r2, r4)
            r1.<init>(r2)
            java.lang.Class<org.junit.runner.manipulation.a> r2 = org.junit.runner.manipulation.a.class
            r0.<init>(r2, r1)
            return r0
    }
}
