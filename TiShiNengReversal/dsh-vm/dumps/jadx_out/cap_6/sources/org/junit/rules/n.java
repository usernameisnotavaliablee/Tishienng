package org.junit.rules;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class n implements org.junit.rules.f {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends org.junit.runners.model.h {
        final /* synthetic */ org.junit.runners.model.d a;
        final /* synthetic */ org.junit.runners.model.h b;
        final /* synthetic */ org.junit.rules.n c;

        a(org.junit.rules.n r1, org.junit.runners.model.d r2, org.junit.runners.model.h r3) throws java.lang.Throwable {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // org.junit.runners.model.h
        public void a() throws java.lang.Throwable {
                r3 = this;
                org.junit.rules.n r0 = r3.c
                org.junit.runners.model.d r1 = r3.a
                r0.d(r1)
                org.junit.runners.model.h r0 = r3.b     // Catch: java.lang.Throwable -> L1b org.junit.internal.AssumptionViolatedException -> L1d
                r0.a()     // Catch: java.lang.Throwable -> L1b org.junit.internal.AssumptionViolatedException -> L1d
                org.junit.rules.n r0 = r3.c     // Catch: java.lang.Throwable -> L1b org.junit.internal.AssumptionViolatedException -> L1d
                org.junit.runners.model.d r1 = r3.a     // Catch: java.lang.Throwable -> L1b org.junit.internal.AssumptionViolatedException -> L1d
                r0.e(r1)     // Catch: java.lang.Throwable -> L1b org.junit.internal.AssumptionViolatedException -> L1d
                org.junit.rules.n r0 = r3.c
                org.junit.runners.model.d r1 = r3.a
                r0.c(r1)
                return
            L1b:
                r0 = move-exception
                goto L1f
            L1d:
                r0 = move-exception
                goto L29
            L1f:
                org.junit.rules.n r1 = r3.c     // Catch: java.lang.Throwable -> L27
                org.junit.runners.model.d r2 = r3.a     // Catch: java.lang.Throwable -> L27
                r1.b(r0, r2)     // Catch: java.lang.Throwable -> L27
                throw r0     // Catch: java.lang.Throwable -> L27
            L27:
                r0 = move-exception
                goto L2a
            L29:
                throw r0     // Catch: java.lang.Throwable -> L27
            L2a:
                org.junit.rules.n r1 = r3.c
                org.junit.runners.model.d r2 = r3.a
                r1.c(r2)
                throw r0
        }
    }

    public n() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.junit.rules.f
    public org.junit.runners.model.h a(org.junit.runners.model.h r1, org.junit.runners.model.d r2, java.lang.Object r3) {
            r0 = this;
            org.junit.rules.n$a r3 = new org.junit.rules.n$a
            r3.<init>(r0, r2, r1)
            return r3
    }

    public void b(java.lang.Throwable r1, org.junit.runners.model.d r2) {
            r0 = this;
            return
    }

    public void c(org.junit.runners.model.d r1) {
            r0 = this;
            return
    }

    public void d(org.junit.runners.model.d r1) {
            r0 = this;
            return
    }

    public void e(org.junit.runners.model.d r1) {
            r0 = this;
            return
    }
}
