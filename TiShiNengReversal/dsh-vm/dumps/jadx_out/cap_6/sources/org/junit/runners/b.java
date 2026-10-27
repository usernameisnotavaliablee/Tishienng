package org.junit.runners;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b extends org.junit.runners.d<org.junit.runners.model.d> {
    private final java.util.concurrent.ConcurrentHashMap<org.junit.runners.model.d, org.junit.runner.Description> f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends org.junit.internal.runners.model.b {
        final /* synthetic */ org.junit.runners.b a;

        a(org.junit.runners.b r1) throws java.lang.Exception {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // org.junit.internal.runners.model.b
        protected java.lang.Object b() throws java.lang.Throwable {
                r1 = this;
                org.junit.runners.b r0 = r1.a
                java.lang.Object r0 = r0.G()
                return r0
        }
    }

    public b(java.lang.Class<?> r1) throws org.junit.runners.model.InitializationError {
            r0 = this;
            r0.<init>(r1)
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f = r1
            return
    }

    private boolean I(org.junit.Test r1) {
            r0 = this;
            java.lang.Class r1 = r0.J(r1)
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    private java.lang.Class<? extends java.lang.Throwable> J(org.junit.Test r3) {
            r2 = this;
            if (r3 == 0) goto L10
            java.lang.Class r0 = r3.expected()
            java.lang.Class<org.junit.Test$None> r1 = org.junit.Test.None.class
            if (r0 != r1) goto Lb
            goto L10
        Lb:
            java.lang.Class r3 = r3.expected()
            return r3
        L10:
            r3 = 0
            return r3
    }

    private java.util.List<org.junit.rules.f> K(java.lang.Object r1) {
            r0 = this;
            java.util.List r1 = r0.S(r1)
            return r1
    }

    private long M(org.junit.Test r3) {
            r2 = this;
            if (r3 != 0) goto L5
            r0 = 0
            return r0
        L5:
            long r0 = r3.timeout()
            return r0
    }

    private boolean N() {
            r2 = this;
            org.junit.runners.model.i r0 = r2.s()
            java.lang.Class r0 = r0.j()
            java.lang.reflect.Constructor[] r0 = r0.getConstructors()
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto L11
            return r1
        L11:
            r0 = 0
            return r0
    }

    private void Y(java.util.List<java.lang.Throwable> r3) {
            r2 = this;
            org.junit.internal.runners.rules.a r0 = org.junit.internal.runners.rules.a.g
            org.junit.runners.model.i r1 = r2.s()
            r0.i(r1, r3)
            return
    }

    private org.junit.runners.model.h f0(org.junit.runners.model.d r4, java.util.List<org.junit.rules.l> r5, java.lang.Object r6, org.junit.runners.model.h r7) {
            r3 = this;
            java.util.List r0 = r3.K(r6)
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            org.junit.rules.f r1 = (org.junit.rules.f) r1
            boolean r2 = r5.contains(r1)
            if (r2 != 0) goto L8
            org.junit.runners.model.h r7 = r1.a(r7, r4, r6)
            goto L8
        L1f:
            return r7
    }

    private org.junit.runners.model.h h0(org.junit.runners.model.d r2, java.lang.Object r3, org.junit.runners.model.h r4) {
            r1 = this;
            java.util.List r0 = r1.L(r3)
            org.junit.runners.model.h r3 = r1.f0(r2, r0, r3, r4)
            org.junit.runners.model.h r2 = r1.i0(r2, r0, r3)
            return r2
    }

    private org.junit.runners.model.h i0(org.junit.runners.model.d r2, java.util.List<org.junit.rules.l> r3, org.junit.runners.model.h r4) {
            r1 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L7
            return r4
        L7:
            org.junit.rules.h r0 = new org.junit.rules.h
            org.junit.runner.Description r2 = r1.H(r2)
            r0.<init>(r4, r3, r2)
            return r0
    }

    protected java.util.List<org.junit.runners.model.d> F() {
            r2 = this;
            org.junit.runners.model.i r0 = r2.s()
            java.lang.Class<org.junit.Test> r1 = org.junit.Test.class
            java.util.List r0 = r0.i(r1)
            return r0
    }

    protected java.lang.Object G() throws java.lang.Exception {
            r2 = this;
            org.junit.runners.model.i r0 = r2.s()
            java.lang.reflect.Constructor r0 = r0.l()
            r1 = 0
            java.lang.Object r0 = r0.newInstance(r1)
            return r0
    }

    protected org.junit.runner.Description H(org.junit.runners.model.d r4) {
            r3 = this;
            java.util.concurrent.ConcurrentHashMap<org.junit.runners.model.d, org.junit.runner.Description> r0 = r3.f
            java.lang.Object r0 = r0.get(r4)
            org.junit.runner.Description r0 = (org.junit.runner.Description) r0
            if (r0 != 0) goto L23
            org.junit.runners.model.i r0 = r3.s()
            java.lang.Class r0 = r0.j()
            java.lang.String r1 = r3.U(r4)
            java.lang.annotation.Annotation[] r2 = r4.getAnnotations()
            org.junit.runner.Description r0 = org.junit.runner.Description.createTestDescription(r0, r1, r2)
            java.util.concurrent.ConcurrentHashMap<org.junit.runners.model.d, org.junit.runner.Description> r1 = r3.f
            r1.putIfAbsent(r4, r0)
        L23:
            return r0
    }

    protected java.util.List<org.junit.rules.l> L(java.lang.Object r5) {
            r4 = this;
            org.junit.runners.model.i r0 = r4.s()
            java.lang.Class<org.junit.Rule> r1 = org.junit.Rule.class
            java.lang.Class<org.junit.rules.l> r2 = org.junit.rules.l.class
            java.util.List r0 = r0.g(r5, r1, r2)
            org.junit.runners.model.i r3 = r4.s()
            java.util.List r5 = r3.c(r5, r1, r2)
            r0.addAll(r5)
            return r0
    }

    protected boolean O(org.junit.runners.model.d r2) {
            r1 = this;
            java.lang.Class<org.junit.Ignore> r0 = org.junit.Ignore.class
            java.lang.annotation.Annotation r2 = r2.getAnnotation(r0)
            if (r2 == 0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    protected org.junit.runners.model.h P(org.junit.runners.model.d r3) {
            r2 = this;
            org.junit.runners.b$a r0 = new org.junit.runners.b$a     // Catch: java.lang.Throwable -> L22
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L22
            java.lang.Object r0 = r0.a()     // Catch: java.lang.Throwable -> L22
            org.junit.runners.model.h r1 = r2.Q(r3, r0)
            org.junit.runners.model.h r1 = r2.R(r3, r0, r1)
            org.junit.runners.model.h r1 = r2.g0(r3, r0, r1)
            org.junit.runners.model.h r1 = r2.e0(r3, r0, r1)
            org.junit.runners.model.h r1 = r2.d0(r3, r0, r1)
            org.junit.runners.model.h r3 = r2.h0(r3, r0, r1)
            return r3
        L22:
            r3 = move-exception
            org.junit.internal.runners.statements.b r0 = new org.junit.internal.runners.statements.b
            r0.<init>(r3)
            return r0
    }

    protected org.junit.runners.model.h Q(org.junit.runners.model.d r2, java.lang.Object r3) {
            r1 = this;
            org.junit.internal.runners.statements.d r0 = new org.junit.internal.runners.statements.d
            r0.<init>(r2, r3)
            return r0
    }

    protected org.junit.runners.model.h R(org.junit.runners.model.d r1, java.lang.Object r2, org.junit.runners.model.h r3) {
            r0 = this;
            java.lang.Class<org.junit.Test> r2 = org.junit.Test.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r2)
            org.junit.Test r1 = (org.junit.Test) r1
            boolean r2 = r0.I(r1)
            if (r2 == 0) goto L18
            org.junit.internal.runners.statements.a r2 = new org.junit.internal.runners.statements.a
            java.lang.Class r1 = r0.J(r1)
            r2.<init>(r3, r1)
            return r2
        L18:
            return r3
    }

    protected java.util.List<org.junit.rules.f> S(java.lang.Object r5) {
            r4 = this;
            org.junit.runners.model.i r0 = r4.s()
            java.lang.Class<org.junit.Rule> r1 = org.junit.Rule.class
            java.lang.Class<org.junit.rules.f> r2 = org.junit.rules.f.class
            java.util.List r0 = r0.g(r5, r1, r2)
            org.junit.runners.model.i r3 = r4.s()
            java.util.List r5 = r3.c(r5, r1, r2)
            r0.addAll(r5)
            return r0
    }

    protected void T(org.junit.runners.model.d r3, org.junit.runner.notification.a r4) {
            r2 = this;
            org.junit.runner.Description r0 = r2.H(r3)
            boolean r1 = r2.O(r3)
            if (r1 == 0) goto Le
            r4.i(r0)
            return
        Le:
            org.junit.runners.model.h r3 = r2.P(r3)
            r2.w(r3, r0, r4)
            return
    }

    protected java.lang.String U(org.junit.runners.model.d r1) {
            r0 = this;
            java.lang.String r1 = r1.c()
            return r1
    }

    protected void V(java.util.List<java.lang.Throwable> r1) {
            r0 = this;
            r0.a0(r1)
            r0.c0(r1)
            return
    }

    protected void W(java.util.List<java.lang.Throwable> r3) {
            r2 = this;
            org.junit.internal.runners.rules.a r0 = org.junit.internal.runners.rules.a.e
            org.junit.runners.model.i r1 = r2.s()
            r0.i(r1, r3)
            return
    }

    @java.lang.Deprecated
    protected void X(java.util.List<java.lang.Throwable> r3) {
            r2 = this;
            java.lang.Class<org.junit.After> r0 = org.junit.After.class
            r1 = 0
            r2.B(r0, r1, r3)
            java.lang.Class<org.junit.Before> r0 = org.junit.Before.class
            r2.B(r0, r1, r3)
            r2.b0(r3)
            java.util.List r0 = r2.F()
            int r0 = r0.size()
            if (r0 != 0) goto L22
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "No runnable methods"
            r0.<init>(r1)
            r3.add(r0)
        L22:
            return
    }

    protected void Z(java.util.List<java.lang.Throwable> r3) {
            r2 = this;
            org.junit.runners.model.i r0 = r2.s()
            boolean r0 = r0.o()
            if (r0 == 0) goto L30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "The inner class "
            r0.append(r1)
            org.junit.runners.model.i r1 = r2.s()
            java.lang.String r1 = r1.k()
            r0.append(r1)
            java.lang.String r1 = " is not static."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>(r0)
            r3.add(r1)
        L30:
            return
    }

    protected void a0(java.util.List<java.lang.Throwable> r3) {
            r2 = this;
            boolean r0 = r2.N()
            if (r0 != 0) goto L10
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "Test class should have exactly one public constructor"
            r0.<init>(r1)
            r3.add(r0)
        L10:
            return
    }

    protected void b0(java.util.List<java.lang.Throwable> r3) {
            r2 = this;
            java.lang.Class<org.junit.Test> r0 = org.junit.Test.class
            r1 = 0
            r2.B(r0, r1, r3)
            return
    }

    protected void c0(java.util.List<java.lang.Throwable> r3) {
            r2 = this;
            org.junit.runners.model.i r0 = r2.s()
            boolean r0 = r0.o()
            if (r0 != 0) goto L29
            boolean r0 = r2.N()
            if (r0 == 0) goto L29
            org.junit.runners.model.i r0 = r2.s()
            java.lang.reflect.Constructor r0 = r0.l()
            java.lang.Class[] r0 = r0.getParameterTypes()
            int r0 = r0.length
            if (r0 == 0) goto L29
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "Test class should have exactly one public zero-argument constructor"
            r0.<init>(r1)
            r3.add(r0)
        L29:
            return
    }

    protected org.junit.runners.model.h d0(org.junit.runners.model.d r2, java.lang.Object r3, org.junit.runners.model.h r4) {
            r1 = this;
            org.junit.runners.model.i r2 = r1.s()
            java.lang.Class<org.junit.After> r0 = org.junit.After.class
            java.util.List r2 = r2.i(r0)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L11
            return r4
        L11:
            org.junit.internal.runners.statements.e r0 = new org.junit.internal.runners.statements.e
            r0.<init>(r4, r2, r3)
            return r0
    }

    protected org.junit.runners.model.h e0(org.junit.runners.model.d r2, java.lang.Object r3, org.junit.runners.model.h r4) {
            r1 = this;
            org.junit.runners.model.i r2 = r1.s()
            java.lang.Class<org.junit.Before> r0 = org.junit.Before.class
            java.util.List r2 = r2.i(r0)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L11
            return r4
        L11:
            org.junit.internal.runners.statements.f r0 = new org.junit.internal.runners.statements.f
            r0.<init>(r4, r2, r3)
            return r0
    }

    @java.lang.Deprecated
    protected org.junit.runners.model.h g0(org.junit.runners.model.d r4, java.lang.Object r5, org.junit.runners.model.h r6) {
            r3 = this;
            java.lang.Class<org.junit.Test> r5 = org.junit.Test.class
            java.lang.annotation.Annotation r4 = r4.getAnnotation(r5)
            org.junit.Test r4 = (org.junit.Test) r4
            long r4 = r3.M(r4)
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L13
            return r6
        L13:
            org.junit.internal.runners.statements.c$b r0 = org.junit.internal.runners.statements.c.c()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            org.junit.internal.runners.statements.c$b r4 = r0.f(r4, r1)
            org.junit.internal.runners.statements.c r4 = r4.d(r6)
            return r4
    }

    @Override // org.junit.runners.d
    protected void k(java.util.List<java.lang.Throwable> r1) {
            r0 = this;
            super.k(r1)
            r0.Z(r1)
            r0.V(r1)
            r0.X(r1)
            r0.W(r1)
            r0.Y(r1)
            return
    }

    @Override // org.junit.runners.d
    protected /* bridge */ /* synthetic */ org.junit.runner.Description n(org.junit.runners.model.d r1) {
            r0 = this;
            org.junit.runners.model.d r1 = (org.junit.runners.model.d) r1
            org.junit.runner.Description r1 = r0.H(r1)
            return r1
    }

    @Override // org.junit.runners.d
    protected java.util.List<org.junit.runners.model.d> o() {
            r1 = this;
            java.util.List r0 = r1.F()
            return r0
    }

    @Override // org.junit.runners.d
    protected /* bridge */ /* synthetic */ boolean t(org.junit.runners.model.d r1) {
            r0 = this;
            org.junit.runners.model.d r1 = (org.junit.runners.model.d) r1
            boolean r1 = r0.O(r1)
            return r1
    }

    @Override // org.junit.runners.d
    protected /* bridge */ /* synthetic */ void u(org.junit.runners.model.d r1, org.junit.runner.notification.a r2) {
            r0 = this;
            org.junit.runners.model.d r1 = (org.junit.runners.model.d) r1
            r0.T(r1, r2)
            return
    }
}
