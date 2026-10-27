package org.junit.rules;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class e implements org.junit.rules.l {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends org.junit.runners.model.h {
        final /* synthetic */ org.junit.runners.model.h a;
        final /* synthetic */ org.junit.rules.e b;

        a(org.junit.rules.e r1, org.junit.runners.model.h r2) throws java.lang.Throwable {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // org.junit.runners.model.h
        public void a() throws java.lang.Throwable {
                r2 = this;
                org.junit.rules.e r0 = r2.b
                r0.c()
                org.junit.runners.model.h r0 = r2.a     // Catch: java.lang.Throwable -> L10
                r0.a()     // Catch: java.lang.Throwable -> L10
                org.junit.rules.e r0 = r2.b
                r0.b()
                return
            L10:
                r0 = move-exception
                org.junit.rules.e r1 = r2.b
                r1.b()
                throw r0
        }
    }

    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    private org.junit.runners.model.h d(org.junit.runners.model.h r2) {
            r1 = this;
            org.junit.rules.e$a r0 = new org.junit.rules.e$a
            r0.<init>(r1, r2)
            return r0
    }

    @Override // org.junit.rules.l
    public org.junit.runners.model.h a(org.junit.runners.model.h r1, org.junit.runner.Description r2) {
            r0 = this;
            org.junit.runners.model.h r1 = r0.d(r1)
            return r1
    }

    protected void b() {
            r0 = this;
            return
    }

    protected void c() throws java.lang.Throwable {
            r0 = this;
            return
    }
}
