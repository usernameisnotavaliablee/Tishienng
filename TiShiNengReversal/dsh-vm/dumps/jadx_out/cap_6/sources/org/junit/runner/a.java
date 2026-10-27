package org.junit.runner;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: org.junit.runner.a$a, reason: collision with other inner class name */
    class C0081a extends org.junit.runners.model.f {
        final /* synthetic */ org.junit.runners.model.f b;
        final /* synthetic */ org.junit.runner.a c;

        C0081a(org.junit.runner.a r1, org.junit.runners.model.f r2) throws java.lang.Throwable {
                r0 = this;
                r0.c = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // org.junit.runners.model.f
        public org.junit.runner.g c(java.lang.Class<?> r3) throws java.lang.Throwable {
                r2 = this;
                org.junit.runner.a r0 = r2.c
                org.junit.runners.model.f r1 = r2.b
                org.junit.runner.g r3 = r0.a(r1, r3)
                return r3
        }
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.junit.runner.a c() {
            org.junit.runner.a r0 = new org.junit.runner.a
            r0.<init>()
            return r0
    }

    protected org.junit.runner.g a(org.junit.runners.model.f r1, java.lang.Class<?> r2) throws java.lang.Throwable {
            r0 = this;
            org.junit.runner.g r1 = r1.c(r2)
            return r1
    }

    public org.junit.runner.g b(org.junit.runners.model.f r3, java.lang.Class<?>[] r4) throws org.junit.runners.model.InitializationError {
            r2 = this;
            org.junit.runners.Suite r0 = new org.junit.runners.Suite
            org.junit.runner.a$a r1 = new org.junit.runner.a$a
            r1.<init>(r2, r3)
            r0.<init>(r1, r4)
            return r0
    }
}
