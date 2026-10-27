package org.junit.experimental.theories;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c extends org.junit.runners.b {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a extends org.junit.runners.model.h {
        private int a;
        private final org.junit.runners.model.d b;
        private final org.junit.runners.model.i c;
        private java.util.List<org.junit.internal.AssumptionViolatedException> d;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: org.junit.experimental.theories.c$a$a, reason: collision with other inner class name */
        class C0075a extends org.junit.runners.b {
            final /* synthetic */ org.junit.experimental.theories.internal.b g;
            final /* synthetic */ org.junit.experimental.theories.c.a h;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: org.junit.experimental.theories.c$a$a$a, reason: collision with other inner class name */
            class C0076a extends org.junit.runners.model.h {
                final /* synthetic */ org.junit.runners.model.h a;
                final /* synthetic */ org.junit.experimental.theories.c.a.C0075a b;

                C0076a(org.junit.experimental.theories.c.a.C0075a r1, org.junit.runners.model.h r2) throws java.lang.Throwable {
                        r0 = this;
                        r0.b = r1
                        r0.a = r2
                        r0.<init>()
                        return
                }

                @Override // org.junit.runners.model.h
                public void a() throws java.lang.Throwable {
                        r4 = this;
                        org.junit.runners.model.h r0 = r4.a     // Catch: java.lang.Throwable -> Ld org.junit.internal.AssumptionViolatedException -> Lf
                        r0.a()     // Catch: java.lang.Throwable -> Ld org.junit.internal.AssumptionViolatedException -> Lf
                        org.junit.experimental.theories.c$a$a r0 = r4.b     // Catch: java.lang.Throwable -> Ld org.junit.internal.AssumptionViolatedException -> Lf
                        org.junit.experimental.theories.c$a r0 = r0.h     // Catch: java.lang.Throwable -> Ld org.junit.internal.AssumptionViolatedException -> Lf
                        r0.f()     // Catch: java.lang.Throwable -> Ld org.junit.internal.AssumptionViolatedException -> Lf
                        return
                    Ld:
                        r0 = move-exception
                        goto L11
                    Lf:
                        r0 = move-exception
                        goto L23
                    L11:
                        org.junit.experimental.theories.c$a$a r1 = r4.b
                        org.junit.experimental.theories.c$a r2 = r1.h
                        org.junit.experimental.theories.internal.b r1 = r1.g
                        boolean r3 = org.junit.experimental.theories.c.a.b(r2)
                        java.lang.Object[] r1 = r1.g(r3)
                        r2.i(r0, r1)
                        goto L2a
                    L23:
                        org.junit.experimental.theories.c$a$a r1 = r4.b
                        org.junit.experimental.theories.c$a r1 = r1.h
                        r1.e(r0)
                    L2a:
                        return
                }
            }

            C0075a(org.junit.experimental.theories.c.a r1, java.lang.Class r2, org.junit.experimental.theories.internal.b r3) throws java.lang.Throwable {
                    r0 = this;
                    r0.h = r1
                    r0.g = r3
                    r0.<init>(r2)
                    return
            }

            @Override // org.junit.runners.b
            public java.lang.Object G() throws java.lang.Exception {
                    r2 = this;
                    org.junit.experimental.theories.internal.b r0 = r2.g
                    java.lang.Object[] r0 = r0.h()
                    org.junit.experimental.theories.c$a r1 = r2.h
                    boolean r1 = org.junit.experimental.theories.c.a.b(r1)
                    if (r1 != 0) goto L11
                    org.junit.b.e(r0)
                L11:
                    org.junit.runners.model.i r1 = r2.s()
                    java.lang.reflect.Constructor r1 = r1.l()
                    java.lang.Object r0 = r1.newInstance(r0)
                    return r0
            }

            @Override // org.junit.runners.b
            public org.junit.runners.model.h P(org.junit.runners.model.d r2) {
                    r1 = this;
                    org.junit.runners.model.h r2 = super.P(r2)
                    org.junit.experimental.theories.c$a$a$a r0 = new org.junit.experimental.theories.c$a$a$a
                    r0.<init>(r1, r2)
                    return r0
            }

            @Override // org.junit.runners.b
            protected org.junit.runners.model.h Q(org.junit.runners.model.d r3, java.lang.Object r4) {
                    r2 = this;
                    org.junit.experimental.theories.c$a r0 = r2.h
                    org.junit.experimental.theories.internal.b r1 = r2.g
                    org.junit.runners.model.h r3 = org.junit.experimental.theories.c.a.c(r0, r3, r1, r4)
                    return r3
            }

            @Override // org.junit.runners.b, org.junit.runners.d
            protected void k(java.util.List<java.lang.Throwable> r1) {
                    r0 = this;
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class b extends org.junit.runners.model.h {
            final /* synthetic */ org.junit.experimental.theories.internal.b a;
            final /* synthetic */ org.junit.runners.model.d b;
            final /* synthetic */ java.lang.Object c;
            final /* synthetic */ org.junit.experimental.theories.c.a d;

            b(org.junit.experimental.theories.c.a r1, org.junit.experimental.theories.internal.b r2, org.junit.runners.model.d r3, java.lang.Object r4) throws java.lang.Throwable {
                    r0 = this;
                    r0.d = r1
                    r0.a = r2
                    r0.b = r3
                    r0.c = r4
                    r0.<init>()
                    return
            }

            @Override // org.junit.runners.model.h
            public void a() throws java.lang.Throwable {
                    r3 = this;
                    org.junit.experimental.theories.internal.b r0 = r3.a
                    java.lang.Object[] r0 = r0.j()
                    org.junit.experimental.theories.c$a r1 = r3.d
                    boolean r1 = org.junit.experimental.theories.c.a.b(r1)
                    if (r1 != 0) goto L11
                    org.junit.b.e(r0)
                L11:
                    org.junit.runners.model.d r1 = r3.b
                    java.lang.Object r2 = r3.c
                    r1.l(r2, r0)
                    return
            }
        }

        public a(org.junit.runners.model.d r2, org.junit.runners.model.i r3) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.a = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.d = r0
                r1.b = r2
                r1.c = r3
                return
        }

        static /* synthetic */ boolean b(org.junit.experimental.theories.c.a r0) {
                boolean r0 = r0.h()
                return r0
        }

        static /* synthetic */ org.junit.runners.model.h c(org.junit.experimental.theories.c.a r0, org.junit.runners.model.d r1, org.junit.experimental.theories.internal.b r2, java.lang.Object r3) {
                org.junit.runners.model.h r0 = r0.g(r1, r2, r3)
                return r0
        }

        private org.junit.runners.model.i d() {
                r1 = this;
                org.junit.runners.model.i r0 = r1.c
                return r0
        }

        private org.junit.runners.model.h g(org.junit.runners.model.d r2, org.junit.experimental.theories.internal.b r3, java.lang.Object r4) {
                r1 = this;
                org.junit.experimental.theories.c$a$b r0 = new org.junit.experimental.theories.c$a$b
                r0.<init>(r1, r3, r2, r4)
                return r0
        }

        private boolean h() {
                r2 = this;
                org.junit.runners.model.d r0 = r2.b
                java.lang.reflect.Method r0 = r0.i()
                java.lang.Class<org.junit.experimental.theories.Theory> r1 = org.junit.experimental.theories.Theory.class
                java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
                org.junit.experimental.theories.Theory r0 = (org.junit.experimental.theories.Theory) r0
                if (r0 != 0) goto L12
                r0 = 0
                return r0
            L12:
                boolean r0 = r0.nullsAccepted()
                return r0
        }

        @Override // org.junit.runners.model.h
        public void a() throws java.lang.Throwable {
                r2 = this;
                org.junit.runners.model.d r0 = r2.b
                java.lang.reflect.Method r0 = r0.i()
                org.junit.runners.model.i r1 = r2.d()
                org.junit.experimental.theories.internal.b r0 = org.junit.experimental.theories.internal.b.a(r0, r1)
                r2.j(r0)
                org.junit.runners.model.d r0 = r2.b
                java.lang.Class<org.junit.experimental.theories.Theory> r1 = org.junit.experimental.theories.Theory.class
                java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
                if (r0 == 0) goto L1d
                r0 = 1
                goto L1e
            L1d:
                r0 = 0
            L1e:
                int r1 = r2.a
                if (r1 != 0) goto L3a
                if (r0 == 0) goto L3a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Never found parameters that satisfied method assumptions.  Violated assumptions: "
                r0.append(r1)
                java.util.List<org.junit.internal.AssumptionViolatedException> r1 = r2.d
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                org.junit.a.d0(r0)
            L3a:
                return
        }

        protected void e(org.junit.internal.AssumptionViolatedException r2) {
                r1 = this;
                java.util.List<org.junit.internal.AssumptionViolatedException> r0 = r1.d
                r0.add(r2)
                return
        }

        protected void f() {
                r1 = this;
                int r0 = r1.a
                int r0 = r0 + 1
                r1.a = r0
                return
        }

        protected void i(java.lang.Throwable r3, java.lang.Object... r4) throws java.lang.Throwable {
                r2 = this;
                int r0 = r4.length
                if (r0 != 0) goto L4
                throw r3
            L4:
                org.junit.experimental.theories.internal.ParameterizedAssertionError r0 = new org.junit.experimental.theories.internal.ParameterizedAssertionError
                org.junit.runners.model.d r1 = r2.b
                java.lang.String r1 = r1.c()
                r0.<init>(r3, r1, r4)
                throw r0
        }

        protected void j(org.junit.experimental.theories.internal.b r2) throws java.lang.Throwable {
                r1 = this;
                boolean r0 = r2.l()
                if (r0 != 0) goto La
                r1.l(r2)
                return
            La:
                r1.k(r2)
                return
        }

        protected void k(org.junit.experimental.theories.internal.b r3) throws java.lang.Throwable {
                r2 = this;
                org.junit.experimental.theories.c$a$a r0 = new org.junit.experimental.theories.c$a$a
                org.junit.runners.model.i r1 = r2.d()
                java.lang.Class r1 = r1.j()
                r0.<init>(r2, r1, r3)
                org.junit.runners.model.d r3 = r2.b
                org.junit.runners.model.h r3 = r0.P(r3)
                r3.a()
                return
        }

        protected void l(org.junit.experimental.theories.internal.b r3) throws java.lang.Throwable {
                r2 = this;
                java.util.List r0 = r3.n()
                java.util.Iterator r0 = r0.iterator()
            L8:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1c
                java.lang.Object r1 = r0.next()
                org.junit.experimental.theories.PotentialAssignment r1 = (org.junit.experimental.theories.PotentialAssignment) r1
                org.junit.experimental.theories.internal.b r1 = r3.b(r1)
                r2.j(r1)
                goto L8
            L1c:
                return
        }
    }

    public c(java.lang.Class<?> r1) throws org.junit.runners.model.InitializationError {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void j0(java.util.List<java.lang.Throwable> r9) {
            r8 = this;
            org.junit.runners.model.i r0 = r8.s()
            java.lang.Class r0 = r0.j()
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            int r1 = r0.length
            r2 = 0
        Le:
            if (r2 >= r1) goto L7c
            r3 = r0[r2]
            java.lang.Class<org.junit.experimental.theories.DataPoint> r4 = org.junit.experimental.theories.DataPoint.class
            java.lang.annotation.Annotation r4 = r3.getAnnotation(r4)
            if (r4 != 0) goto L23
            java.lang.Class<org.junit.experimental.theories.DataPoints> r4 = org.junit.experimental.theories.DataPoints.class
            java.lang.annotation.Annotation r4 = r3.getAnnotation(r4)
            if (r4 != 0) goto L23
            goto L79
        L23:
            int r4 = r3.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            java.lang.String r5 = "DataPoint field "
            if (r4 != 0) goto L4f
            java.lang.Error r4 = new java.lang.Error
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r7 = r3.getName()
            r6.append(r7)
            java.lang.String r7 = " must be static"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r4.<init>(r6)
            r9.add(r4)
        L4f:
            int r4 = r3.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isPublic(r4)
            if (r4 != 0) goto L79
            java.lang.Error r4 = new java.lang.Error
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r3 = r3.getName()
            r6.append(r3)
            java.lang.String r3 = " must be public"
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r4.<init>(r3)
            r9.add(r4)
        L79:
            int r2 = r2 + 1
            goto Le
        L7c:
            return
    }

    private void k0(java.util.List<java.lang.Throwable> r9) {
            r8 = this;
            org.junit.runners.model.i r0 = r8.s()
            java.lang.Class r0 = r0.j()
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            int r1 = r0.length
            r2 = 0
        Le:
            if (r2 >= r1) goto L7c
            r3 = r0[r2]
            java.lang.Class<org.junit.experimental.theories.DataPoint> r4 = org.junit.experimental.theories.DataPoint.class
            java.lang.annotation.Annotation r4 = r3.getAnnotation(r4)
            if (r4 != 0) goto L23
            java.lang.Class<org.junit.experimental.theories.DataPoints> r4 = org.junit.experimental.theories.DataPoints.class
            java.lang.annotation.Annotation r4 = r3.getAnnotation(r4)
            if (r4 != 0) goto L23
            goto L79
        L23:
            int r4 = r3.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            java.lang.String r5 = "DataPoint method "
            if (r4 != 0) goto L4f
            java.lang.Error r4 = new java.lang.Error
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r7 = r3.getName()
            r6.append(r7)
            java.lang.String r7 = " must be static"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r4.<init>(r6)
            r9.add(r4)
        L4f:
            int r4 = r3.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isPublic(r4)
            if (r4 != 0) goto L79
            java.lang.Error r4 = new java.lang.Error
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r3 = r3.getName()
            r6.append(r3)
            java.lang.String r3 = " must be public"
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r4.<init>(r3)
            r9.add(r4)
        L79:
            int r2 = r2 + 1
            goto Le
        L7c:
            return
    }

    private void l0(java.lang.Class<? extends org.junit.experimental.theories.b> r5, java.util.List<java.lang.Throwable> r6) {
            r4 = this;
            java.lang.reflect.Constructor[] r0 = r5.getConstructors()
            int r1 = r0.length
            r2 = 1
            java.lang.String r3 = "ParameterSupplier "
            if (r1 == r2) goto L2b
            java.lang.Error r0 = new java.lang.Error
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r5 = r5.getName()
            r1.append(r5)
            java.lang.String r5 = " must have only one constructor (either empty or taking only a TestClass)"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            r6.add(r0)
            return
        L2b:
            r1 = 0
            r0 = r0[r1]
            java.lang.Class[] r0 = r0.getParameterTypes()
            int r2 = r0.length
            if (r2 == 0) goto L5f
            r0 = r0[r1]
            java.lang.Class<org.junit.runners.model.i> r1 = org.junit.runners.model.i.class
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5f
            java.lang.Error r0 = new java.lang.Error
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r5 = r5.getName()
            r1.append(r5)
            java.lang.String r5 = " constructor must take either nothing or a single TestClass instance"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            r6.add(r0)
        L5f:
            return
    }

    @Override // org.junit.runners.b
    protected java.util.List<org.junit.runners.model.d> F() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = super.F()
            r0.<init>(r1)
            org.junit.runners.model.i r1 = r3.s()
            java.lang.Class<org.junit.experimental.theories.Theory> r2 = org.junit.experimental.theories.Theory.class
            java.util.List r1 = r1.i(r2)
            r0.removeAll(r1)
            r0.addAll(r1)
            return r0
    }

    @Override // org.junit.runners.b
    public org.junit.runners.model.h P(org.junit.runners.model.d r3) {
            r2 = this;
            org.junit.experimental.theories.c$a r0 = new org.junit.experimental.theories.c$a
            org.junit.runners.model.i r1 = r2.s()
            r0.<init>(r3, r1)
            return r0
    }

    @Override // org.junit.runners.b
    protected void V(java.util.List<java.lang.Throwable> r1) {
            r0 = this;
            r0.a0(r1)
            return
    }

    @Override // org.junit.runners.b
    protected void b0(java.util.List<java.lang.Throwable> r5) {
            r4 = this;
            java.util.List r0 = r4.F()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L51
            java.lang.Object r1 = r0.next()
            org.junit.runners.model.d r1 = (org.junit.runners.model.d) r1
            java.lang.Class<org.junit.experimental.theories.Theory> r2 = org.junit.experimental.theories.Theory.class
            java.lang.annotation.Annotation r2 = r1.getAnnotation(r2)
            r3 = 0
            if (r2 == 0) goto L24
            r1.p(r3, r5)
            r1.o(r5)
            goto L27
        L24:
            r1.q(r3, r5)
        L27:
            java.lang.reflect.Method r1 = r1.i()
            java.util.ArrayList r1 = org.junit.experimental.theories.a.l(r1)
            java.util.Iterator r1 = r1.iterator()
        L33:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8
            java.lang.Object r2 = r1.next()
            org.junit.experimental.theories.a r2 = (org.junit.experimental.theories.a) r2
            java.lang.Class<org.junit.experimental.theories.ParametersSuppliedBy> r3 = org.junit.experimental.theories.ParametersSuppliedBy.class
            java.lang.annotation.Annotation r2 = r2.e(r3)
            org.junit.experimental.theories.ParametersSuppliedBy r2 = (org.junit.experimental.theories.ParametersSuppliedBy) r2
            if (r2 == 0) goto L33
            java.lang.Class r2 = r2.value()
            r4.l0(r2, r5)
            goto L33
        L51:
            return
    }

    @Override // org.junit.runners.b, org.junit.runners.d
    protected void k(java.util.List<java.lang.Throwable> r1) {
            r0 = this;
            super.k(r1)
            r0.j0(r1)
            r0.k0(r1)
            return
    }
}
