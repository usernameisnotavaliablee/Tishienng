package org.junit.runners;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class d<T> extends org.junit.runner.g implements org.junit.runner.manipulation.b, org.junit.runner.manipulation.c {
    private static final java.util.List<org.junit.validator.e> e = null;
    private final java.lang.Object a;
    private final org.junit.runners.model.i b;
    private volatile java.util.Collection<T> c;
    private volatile org.junit.runners.model.g d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements org.junit.runners.model.g {
        final /* synthetic */ org.junit.runners.d a;

        a(org.junit.runners.d r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // org.junit.runners.model.g
        public void a(java.lang.Runnable r1) {
                r0 = this;
                r1.run()
                return
        }

        @Override // org.junit.runners.model.g
        public void b() {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends org.junit.runners.model.h {
        final /* synthetic */ org.junit.runner.notification.a a;
        final /* synthetic */ org.junit.runners.d b;

        b(org.junit.runners.d r1, org.junit.runner.notification.a r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // org.junit.runners.model.h
        public void a() {
                r2 = this;
                org.junit.runners.d r0 = r2.b
                org.junit.runner.notification.a r1 = r2.a
                org.junit.runners.d.e(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements java.lang.Runnable {
        final /* synthetic */ java.lang.Object a;
        final /* synthetic */ org.junit.runner.notification.a b;
        final /* synthetic */ org.junit.runners.d c;

        c(org.junit.runners.d r1, java.lang.Object r2, org.junit.runner.notification.a r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                org.junit.runners.d r0 = r3.c
                java.lang.Object r1 = r3.a
                org.junit.runner.notification.a r2 = r3.b
                r0.u(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: org.junit.runners.d$d, reason: collision with other inner class name */
    class C0084d implements java.util.Comparator<T> {
        final /* synthetic */ org.junit.runner.manipulation.d a;
        final /* synthetic */ org.junit.runners.d b;

        C0084d(org.junit.runners.d r1, org.junit.runner.manipulation.d r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public int compare(T r3, T r4) {
                r2 = this;
                org.junit.runner.manipulation.d r0 = r2.a
                org.junit.runners.d r1 = r2.b
                org.junit.runner.Description r3 = r1.n(r3)
                org.junit.runners.d r1 = r2.b
                org.junit.runner.Description r4 = r1.n(r4)
                int r3 = r0.b(r3, r4)
                return r3
        }
    }

    static {
            org.junit.validator.c r0 = new org.junit.validator.c
            r0.<init>()
            org.junit.validator.d r1 = new org.junit.validator.d
            r1.<init>()
            r2 = 2
            org.junit.validator.e[] r2 = new org.junit.validator.e[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            java.util.List r0 = java.util.Arrays.asList(r2)
            org.junit.runners.d.e = r0
            return
    }

    protected d(java.lang.Class<?> r2) throws org.junit.runners.model.InitializationError {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.a = r0
            r0 = 0
            r1.c = r0
            org.junit.runners.d$a r0 = new org.junit.runners.d$a
            r0.<init>(r1)
            r1.d = r0
            org.junit.runners.model.i r2 = r1.m(r2)
            r1.b = r2
            r1.z()
            return
    }

    private void A(java.util.List<java.lang.Throwable> r3) {
            r2 = this;
            org.junit.internal.runners.rules.a r0 = org.junit.internal.runners.rules.a.d
            org.junit.runners.model.i r1 = r2.s()
            r0.i(r1, r3)
            org.junit.internal.runners.rules.a r0 = org.junit.internal.runners.rules.a.f
            org.junit.runners.model.i r1 = r2.s()
            r0.i(r1, r3)
            return
    }

    private org.junit.runners.model.h E(org.junit.runners.model.h r4) {
            r3 = this;
            java.util.List r0 = r3.j()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lb
            return r4
        Lb:
            org.junit.rules.h r1 = new org.junit.rules.h
            org.junit.runner.Description r2 = r3.getDescription()
            r1.<init>(r4, r0, r2)
            return r1
    }

    static /* synthetic */ void e(org.junit.runners.d r0, org.junit.runner.notification.a r1) {
            r0.v(r1)
            return
    }

    private void f(java.util.List<java.lang.Throwable> r4) {
            r3 = this;
            org.junit.runners.model.i r0 = r3.s()
            java.lang.Class r0 = r0.j()
            if (r0 == 0) goto L28
            java.util.List<org.junit.validator.e> r0 = org.junit.runners.d.e
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            org.junit.validator.e r1 = (org.junit.validator.e) r1
            org.junit.runners.model.i r2 = r3.s()
            java.util.List r1 = r1.a(r2)
            r4.addAll(r1)
            goto L10
        L28:
            return
    }

    private boolean g() {
            r2 = this;
            java.util.Collection r0 = r2.p()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            boolean r1 = r2.t(r1)
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L1a:
            r0 = 1
            return r0
    }

    private java.util.Comparator<? super T> l(org.junit.runner.manipulation.d r2) {
            r1 = this;
            org.junit.runners.d$d r0 = new org.junit.runners.d$d
            r0.<init>(r1, r2)
            return r0
    }

    private java.util.Collection<T> p() {
            r2 = this;
            java.util.Collection<T> r0 = r2.c
            if (r0 != 0) goto L1c
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            java.util.Collection<T> r1 = r2.c     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            java.util.List r1 = r2.o()     // Catch: java.lang.Throwable -> L16
            java.util.Collection r1 = java.util.Collections.unmodifiableCollection(r1)     // Catch: java.lang.Throwable -> L16
            r2.c = r1     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r1 = move-exception
            goto L1a
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            goto L1c
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
        L1c:
            java.util.Collection<T> r0 = r2.c
            return r0
    }

    private void v(org.junit.runner.notification.a r5) {
            r4 = this;
            org.junit.runners.model.g r0 = r4.d
            java.util.Collection r1 = r4.p()     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1d
        La:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1d
            org.junit.runners.d$c r3 = new org.junit.runners.d$c     // Catch: java.lang.Throwable -> L1d
            r3.<init>(r4, r2, r5)     // Catch: java.lang.Throwable -> L1d
            r0.a(r3)     // Catch: java.lang.Throwable -> L1d
            goto La
        L1d:
            r5 = move-exception
            goto L23
        L1f:
            r0.b()
            return
        L23:
            r0.b()
            throw r5
    }

    private boolean y(org.junit.runner.manipulation.a r1, T r2) {
            r0 = this;
            org.junit.runner.Description r2 = r0.n(r2)
            boolean r1 = r1.e(r2)
            return r1
    }

    private void z() throws org.junit.runners.model.InitializationError {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.k(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lf
            return
        Lf:
            org.junit.runners.model.InitializationError r1 = new org.junit.runners.model.InitializationError
            r1.<init>(r0)
            throw r1
    }

    protected void B(java.lang.Class<? extends java.lang.annotation.Annotation> r2, boolean r3, java.util.List<java.lang.Throwable> r4) {
            r1 = this;
            org.junit.runners.model.i r0 = r1.s()
            java.util.List r2 = r0.i(r2)
            java.util.Iterator r2 = r2.iterator()
        Lc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r2.next()
            org.junit.runners.model.d r0 = (org.junit.runners.model.d) r0
            r0.q(r3, r4)
            goto Lc
        L1c:
            return
    }

    protected org.junit.runners.model.h C(org.junit.runners.model.h r4) {
            r3 = this;
            org.junit.runners.model.i r0 = r3.b
            java.lang.Class<org.junit.AfterClass> r1 = org.junit.AfterClass.class
            java.util.List r0 = r0.i(r1)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lf
            return r4
        Lf:
            org.junit.internal.runners.statements.e r1 = new org.junit.internal.runners.statements.e
            r2 = 0
            r1.<init>(r4, r0, r2)
            return r1
    }

    protected org.junit.runners.model.h D(org.junit.runners.model.h r4) {
            r3 = this;
            org.junit.runners.model.i r0 = r3.b
            java.lang.Class<org.junit.BeforeClass> r1 = org.junit.BeforeClass.class
            java.util.List r0 = r0.i(r1)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lf
            return r4
        Lf:
            org.junit.internal.runners.statements.f r1 = new org.junit.internal.runners.statements.f
            r2 = 0
            r1.<init>(r4, r0, r2)
            return r1
    }

    @Override // org.junit.runner.g
    public void a(org.junit.runner.notification.a r3) {
            r2 = this;
            org.junit.internal.runners.model.a r0 = new org.junit.internal.runners.model.a
            org.junit.runner.Description r1 = r2.getDescription()
            r0.<init>(r3, r1)
            org.junit.runners.model.h r3 = r2.i(r3)     // Catch: java.lang.Throwable -> L11 org.junit.runner.notification.StoppedByUserException -> L13 org.junit.internal.AssumptionViolatedException -> L15
            r3.a()     // Catch: java.lang.Throwable -> L11 org.junit.runner.notification.StoppedByUserException -> L13 org.junit.internal.AssumptionViolatedException -> L15
            return
        L11:
            r3 = move-exception
            goto L17
        L13:
            r3 = move-exception
            goto L1b
        L15:
            r3 = move-exception
            goto L1c
        L17:
            r0.b(r3)
            goto L1f
        L1b:
            throw r3
        L1c:
            r0.a(r3)
        L1f:
            return
    }

    @Override // org.junit.runner.manipulation.b
    public void b(org.junit.runner.manipulation.a r6) throws org.junit.runner.manipulation.NoTestsRemainException {
            r5 = this;
            java.lang.Object r0 = r5.a
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L24
            java.util.Collection r2 = r5.p()     // Catch: java.lang.Throwable -> L24
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Throwable -> L24
        L10:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L24
            boolean r4 = r5.y(r6, r3)     // Catch: java.lang.Throwable -> L24
            if (r4 == 0) goto L2a
            r6.a(r3)     // Catch: java.lang.Throwable -> L24 org.junit.runner.manipulation.NoTestsRemainException -> L26
            goto L10
        L24:
            r6 = move-exception
            goto L44
        L26:
            r2.remove()     // Catch: java.lang.Throwable -> L24
            goto L10
        L2a:
            r2.remove()     // Catch: java.lang.Throwable -> L24
            goto L10
        L2e:
            java.util.Collection r6 = java.util.Collections.unmodifiableCollection(r1)     // Catch: java.lang.Throwable -> L24
            r5.c = r6     // Catch: java.lang.Throwable -> L24
            java.util.Collection<T> r6 = r5.c     // Catch: java.lang.Throwable -> L24
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r6 != 0) goto L3e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            return
        L3e:
            org.junit.runner.manipulation.NoTestsRemainException r6 = new org.junit.runner.manipulation.NoTestsRemainException     // Catch: java.lang.Throwable -> L24
            r6.<init>()     // Catch: java.lang.Throwable -> L24
            throw r6     // Catch: java.lang.Throwable -> L24
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r6
    }

    @Override // org.junit.runner.manipulation.c
    public void d(org.junit.runner.manipulation.d r4) {
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            java.util.Collection r1 = r3.p()     // Catch: java.lang.Throwable -> L19
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L19
        Lb:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L19
            r4.a(r2)     // Catch: java.lang.Throwable -> L19
            goto Lb
        L19:
            r4 = move-exception
            goto L33
        L1b:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L19
            java.util.Collection r2 = r3.p()     // Catch: java.lang.Throwable -> L19
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L19
            java.util.Comparator r4 = r3.l(r4)     // Catch: java.lang.Throwable -> L19
            java.util.Collections.sort(r1, r4)     // Catch: java.lang.Throwable -> L19
            java.util.Collection r4 = java.util.Collections.unmodifiableCollection(r1)     // Catch: java.lang.Throwable -> L19
            r3.c = r4     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L33:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r4
    }

    @Override // org.junit.runner.g, org.junit.runner.b
    public org.junit.runner.Description getDescription() {
            r3 = this;
            java.lang.String r0 = r3.q()
            java.lang.annotation.Annotation[] r1 = r3.r()
            org.junit.runner.Description r0 = org.junit.runner.Description.createSuiteDescription(r0, r1)
            java.util.Collection r1 = r3.p()
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r1.next()
            org.junit.runner.Description r2 = r3.n(r2)
            r0.addChild(r2)
            goto L14
        L26:
            return r0
    }

    protected org.junit.runners.model.h h(org.junit.runner.notification.a r2) {
            r1 = this;
            org.junit.runners.d$b r0 = new org.junit.runners.d$b
            r0.<init>(r1, r2)
            return r0
    }

    protected org.junit.runners.model.h i(org.junit.runner.notification.a r2) {
            r1 = this;
            org.junit.runners.model.h r2 = r1.h(r2)
            boolean r0 = r1.g()
            if (r0 != 0) goto L16
            org.junit.runners.model.h r2 = r1.D(r2)
            org.junit.runners.model.h r2 = r1.C(r2)
            org.junit.runners.model.h r2 = r1.E(r2)
        L16:
            return r2
    }

    protected java.util.List<org.junit.rules.l> j() {
            r5 = this;
            org.junit.runners.model.i r0 = r5.b
            r1 = 0
            java.lang.Class<org.junit.ClassRule> r2 = org.junit.ClassRule.class
            java.lang.Class<org.junit.rules.l> r3 = org.junit.rules.l.class
            java.util.List r0 = r0.g(r1, r2, r3)
            org.junit.runners.model.i r4 = r5.b
            java.util.List r1 = r4.c(r1, r2, r3)
            r0.addAll(r1)
            return r0
    }

    protected void k(java.util.List<java.lang.Throwable> r3) {
            r2 = this;
            java.lang.Class<org.junit.BeforeClass> r0 = org.junit.BeforeClass.class
            r1 = 1
            r2.B(r0, r1, r3)
            java.lang.Class<org.junit.AfterClass> r0 = org.junit.AfterClass.class
            r2.B(r0, r1, r3)
            r2.A(r3)
            r2.f(r3)
            return
    }

    protected org.junit.runners.model.i m(java.lang.Class<?> r2) {
            r1 = this;
            org.junit.runners.model.i r0 = new org.junit.runners.model.i
            r0.<init>(r2)
            return r0
    }

    protected abstract org.junit.runner.Description n(T r1);

    protected abstract java.util.List<T> o();

    protected java.lang.String q() {
            r1 = this;
            org.junit.runners.model.i r0 = r1.b
            java.lang.String r0 = r0.k()
            return r0
    }

    protected java.lang.annotation.Annotation[] r() {
            r1 = this;
            org.junit.runners.model.i r0 = r1.b
            java.lang.annotation.Annotation[] r0 = r0.getAnnotations()
            return r0
    }

    public final org.junit.runners.model.i s() {
            r1 = this;
            org.junit.runners.model.i r0 = r1.b
            return r0
    }

    protected boolean t(T r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    protected abstract void u(T r1, org.junit.runner.notification.a r2);

    protected final void w(org.junit.runners.model.h r2, org.junit.runner.Description r3, org.junit.runner.notification.a r4) {
            r1 = this;
            org.junit.internal.runners.model.a r0 = new org.junit.internal.runners.model.a
            r0.<init>(r4, r3)
            r0.f()
            r2.a()     // Catch: java.lang.Throwable -> Lf org.junit.internal.AssumptionViolatedException -> L19
            r0.d()
            return
        Lf:
            r2 = move-exception
            r0.b(r2)     // Catch: java.lang.Throwable -> L17
        L13:
            r0.d()
            goto L1e
        L17:
            r2 = move-exception
            goto L1f
        L19:
            r2 = move-exception
            r0.a(r2)     // Catch: java.lang.Throwable -> L17
            goto L13
        L1e:
            return
        L1f:
            r0.d()
            throw r2
    }

    public void x(org.junit.runners.model.g r1) {
            r0 = this;
            r0.d = r1
            return
    }
}
