package org.junit.rules;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b extends org.junit.rules.p {
    private java.util.List<java.lang.Throwable> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.util.concurrent.Callable<java.lang.Object> {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ java.lang.Object b;
        final /* synthetic */ org.hamcrest.j c;
        final /* synthetic */ org.junit.rules.b d;

        a(org.junit.rules.b r1, java.lang.String r2, java.lang.Object r3, org.hamcrest.j r4) {
                r0 = this;
                r0.d = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Callable
        public java.lang.Object call() throws java.lang.Exception {
                r3 = this;
                java.lang.String r0 = r3.a
                java.lang.Object r1 = r3.b
                org.hamcrest.j r2 = r3.c
                org.junit.a.X(r0, r1, r2)
                java.lang.Object r0 = r3.b
                return r0
        }
    }

    public b() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            return
    }

    @Override // org.junit.rules.p
    protected void b() throws java.lang.Throwable {
            r1 = this;
            java.util.List<java.lang.Throwable> r0 = r1.a
            org.junit.runners.model.MultipleFailureException.assertEmpty(r0)
            return
    }

    public void c(java.lang.Throwable r2) {
            r1 = this;
            java.util.List<java.lang.Throwable> r0 = r1.a
            r0.add(r2)
            return
    }

    public <T> T d(java.util.concurrent.Callable<T> r1) {
            r0 = this;
            java.lang.Object r1 = r1.call()     // Catch: java.lang.Throwable -> L5
            return r1
        L5:
            r1 = move-exception
            r0.c(r1)
            r1 = 0
            return r1
    }

    public <T> void e(T r2, org.hamcrest.j<T> r3) {
            r1 = this;
            java.lang.String r0 = ""
            r1.f(r0, r2, r3)
            return
    }

    public <T> void f(java.lang.String r2, T r3, org.hamcrest.j<T> r4) {
            r1 = this;
            org.junit.rules.b$a r0 = new org.junit.rules.b$a
            r0.<init>(r1, r2, r3, r4)
            r1.d(r0)
            return
    }
}
