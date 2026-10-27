package org.junit.internal.runners;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class e extends org.junit.runner.g implements org.junit.runner.manipulation.b, org.junit.runner.manipulation.c {
    private final java.util.List<java.lang.reflect.Method> a;
    private org.junit.internal.runners.i b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.lang.Runnable {
        final /* synthetic */ org.junit.runner.notification.a a;
        final /* synthetic */ org.junit.internal.runners.e b;

        a(org.junit.internal.runners.e r1, org.junit.runner.notification.a r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                org.junit.internal.runners.e r0 = r2.b
                org.junit.runner.notification.a r1 = r2.a
                r0.l(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements java.util.Comparator<java.lang.reflect.Method> {
        final /* synthetic */ org.junit.runner.manipulation.d a;
        final /* synthetic */ org.junit.internal.runners.e b;

        b(org.junit.internal.runners.e r1, org.junit.runner.manipulation.d r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public int a(java.lang.reflect.Method r3, java.lang.reflect.Method r4) {
                r2 = this;
                org.junit.runner.manipulation.d r0 = r2.a
                org.junit.internal.runners.e r1 = r2.b
                org.junit.runner.Description r3 = r1.k(r3)
                org.junit.internal.runners.e r1 = r2.b
                org.junit.runner.Description r4 = r1.k(r4)
                int r3 = r0.b(r3, r4)
                return r3
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(java.lang.reflect.Method r1, java.lang.reflect.Method r2) {
                r0 = this;
                java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
                java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    public e(java.lang.Class<?> r2) throws org.junit.internal.runners.InitializationError {
            r1 = this;
            r1.<init>()
            org.junit.internal.runners.i r0 = new org.junit.internal.runners.i
            r0.<init>(r2)
            r1.b = r0
            java.util.List r2 = r1.i()
            r1.a = r2
            r1.p()
            return
    }

    private void m(org.junit.runner.notification.a r2, org.junit.runner.Description r3, java.lang.Throwable r4) {
            r1 = this;
            r2.l(r3)
            org.junit.runner.notification.Failure r0 = new org.junit.runner.notification.Failure
            r0.<init>(r3, r4)
            r2.f(r0)
            r2.h(r3)
            return
    }

    @Override // org.junit.runner.g
    public void a(org.junit.runner.notification.a r5) {
            r4 = this;
            org.junit.internal.runners.a r0 = new org.junit.internal.runners.a
            org.junit.internal.runners.i r1 = r4.b
            org.junit.runner.Description r2 = r4.getDescription()
            org.junit.internal.runners.e$a r3 = new org.junit.internal.runners.e$a
            r3.<init>(r4, r5)
            r0.<init>(r5, r1, r2, r3)
            r0.d()
            return
    }

    @Override // org.junit.runner.manipulation.b
    public void b(org.junit.runner.manipulation.a r3) throws org.junit.runner.manipulation.NoTestsRemainException {
            r2 = this;
            java.util.List<java.lang.reflect.Method> r0 = r2.a
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            org.junit.runner.Description r1 = r2.k(r1)
            boolean r1 = r3.e(r1)
            if (r1 != 0) goto L6
            r0.remove()
            goto L6
        L20:
            java.util.List<java.lang.reflect.Method> r3 = r2.a
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L29
            return
        L29:
            org.junit.runner.manipulation.NoTestsRemainException r3 = new org.junit.runner.manipulation.NoTestsRemainException
            r3.<init>()
            throw r3
    }

    @Override // org.junit.runner.manipulation.c
    public void d(org.junit.runner.manipulation.d r3) {
            r2 = this;
            java.util.List<java.lang.reflect.Method> r0 = r2.a
            org.junit.internal.runners.e$b r1 = new org.junit.internal.runners.e$b
            r1.<init>(r2, r3)
            java.util.Collections.sort(r0, r1)
            return
    }

    protected java.lang.annotation.Annotation[] e() {
            r1 = this;
            org.junit.internal.runners.i r0 = r1.b
            java.lang.Class r0 = r0.e()
            java.lang.annotation.Annotation[] r0 = r0.getAnnotations()
            return r0
    }

    protected java.lang.Object f() throws java.lang.Exception {
            r2 = this;
            org.junit.internal.runners.i r0 = r2.h()
            java.lang.reflect.Constructor r0 = r0.d()
            r1 = 0
            java.lang.Object r0 = r0.newInstance(r1)
            return r0
    }

    protected java.lang.String g() {
            r1 = this;
            org.junit.internal.runners.i r0 = r1.h()
            java.lang.String r0 = r0.f()
            return r0
    }

    @Override // org.junit.runner.g, org.junit.runner.b
    public org.junit.runner.Description getDescription() {
            r3 = this;
            java.lang.String r0 = r3.g()
            java.lang.annotation.Annotation[] r1 = r3.e()
            org.junit.runner.Description r0 = org.junit.runner.Description.createSuiteDescription(r0, r1)
            java.util.List<java.lang.reflect.Method> r1 = r3.a
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            org.junit.runner.Description r2 = r3.k(r2)
            r0.addChild(r2)
            goto L12
        L26:
            return r0
    }

    protected org.junit.internal.runners.i h() {
            r1 = this;
            org.junit.internal.runners.i r0 = r1.b
            return r0
    }

    protected java.util.List<java.lang.reflect.Method> i() {
            r1 = this;
            org.junit.internal.runners.i r0 = r1.b
            java.util.List r0 = r0.h()
            return r0
    }

    protected void j(java.lang.reflect.Method r4, org.junit.runner.notification.a r5) {
            r3 = this;
            org.junit.runner.Description r0 = r3.k(r4)
            java.lang.Object r1 = r3.f()     // Catch: java.lang.Exception -> L15 java.lang.reflect.InvocationTargetException -> L1a
            org.junit.internal.runners.j r4 = r3.q(r4)
            org.junit.internal.runners.f r2 = new org.junit.internal.runners.f
            r2.<init>(r1, r4, r5, r0)
            r2.b()
            return
        L15:
            r4 = move-exception
            r3.m(r5, r0, r4)
            return
        L1a:
            r4 = move-exception
            java.lang.Throwable r4 = r4.getCause()
            r3.m(r5, r0, r4)
            return
    }

    protected org.junit.runner.Description k(java.lang.reflect.Method r3) {
            r2 = this;
            org.junit.internal.runners.i r0 = r2.h()
            java.lang.Class r0 = r0.e()
            java.lang.String r1 = r2.o(r3)
            java.lang.annotation.Annotation[] r3 = r2.n(r3)
            org.junit.runner.Description r3 = org.junit.runner.Description.createTestDescription(r0, r1, r3)
            return r3
    }

    protected void l(org.junit.runner.notification.a r3) {
            r2 = this;
            java.util.List<java.lang.reflect.Method> r0 = r2.a
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r2.j(r1, r3)
            goto L6
        L16:
            return
    }

    protected java.lang.annotation.Annotation[] n(java.lang.reflect.Method r1) {
            r0 = this;
            java.lang.annotation.Annotation[] r1 = r1.getAnnotations()
            return r1
    }

    protected java.lang.String o(java.lang.reflect.Method r1) {
            r0 = this;
            java.lang.String r1 = r1.getName()
            return r1
    }

    protected void p() throws org.junit.internal.runners.InitializationError {
            r2 = this;
            org.junit.internal.runners.g r0 = new org.junit.internal.runners.g
            org.junit.internal.runners.i r1 = r2.b
            r0.<init>(r1)
            r0.c()
            r0.a()
            return
    }

    protected org.junit.internal.runners.j q(java.lang.reflect.Method r3) {
            r2 = this;
            org.junit.internal.runners.j r0 = new org.junit.internal.runners.j
            org.junit.internal.runners.i r1 = r2.b
            r0.<init>(r3, r1)
            return r0
    }
}
