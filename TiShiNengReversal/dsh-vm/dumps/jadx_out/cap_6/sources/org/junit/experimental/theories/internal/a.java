package org.junit.experimental.theories.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a extends org.junit.experimental.theories.b {
    private final org.junit.runners.model.i a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: org.junit.experimental.theories.internal.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0077a {
        public C0077a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b extends org.junit.experimental.theories.PotentialAssignment {
        private final org.junit.runners.model.d a;

        private b(org.junit.runners.model.d r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        /* synthetic */ b(org.junit.runners.model.d r1, org.junit.experimental.theories.internal.a.C0077a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // org.junit.experimental.theories.PotentialAssignment
        public java.lang.String b() throws org.junit.experimental.theories.PotentialAssignment.CouldNotGenerateValueException {
                r1 = this;
                org.junit.runners.model.d r0 = r1.a
                java.lang.String r0 = r0.c()
                return r0
        }

        @Override // org.junit.experimental.theories.PotentialAssignment
        public java.lang.Object c() throws org.junit.experimental.theories.PotentialAssignment.CouldNotGenerateValueException {
                r4 = this;
                r0 = 0
                org.junit.runners.model.d r1 = r4.a     // Catch: java.lang.Throwable -> Lb java.lang.IllegalAccessException -> L2c java.lang.IllegalArgumentException -> L34
                java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Lb java.lang.IllegalAccessException -> L2c java.lang.IllegalArgumentException -> L34
                r3 = 0
                java.lang.Object r0 = r1.l(r3, r2)     // Catch: java.lang.Throwable -> Lb java.lang.IllegalAccessException -> L2c java.lang.IllegalArgumentException -> L34
                return r0
            Lb:
                r1 = move-exception
                org.junit.runners.model.d r2 = r4.a
                java.lang.Class<org.junit.experimental.theories.DataPoint> r3 = org.junit.experimental.theories.DataPoint.class
                java.lang.annotation.Annotation r2 = r2.getAnnotation(r3)
                org.junit.experimental.theories.DataPoint r2 = (org.junit.experimental.theories.DataPoint) r2
                if (r2 == 0) goto L22
                java.lang.Class[] r2 = r2.ignoredExceptions()
                boolean r2 = org.junit.experimental.theories.internal.a.b(r2, r1)
                if (r2 != 0) goto L23
            L22:
                r0 = 1
            L23:
                org.junit.b.i(r0)
                org.junit.experimental.theories.PotentialAssignment$CouldNotGenerateValueException r0 = new org.junit.experimental.theories.PotentialAssignment$CouldNotGenerateValueException
                r0.<init>(r1)
                throw r0
            L2c:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "unexpected: getMethods returned an inaccessible method"
                r0.<init>(r1)
                throw r0
            L34:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "unexpected: argument length is checked"
                r0.<init>(r1)
                throw r0
        }
    }

    public a(org.junit.runners.model.i r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    static /* synthetic */ boolean b(java.lang.Class[] r0, java.lang.Object r1) {
            boolean r0 = o(r0, r1)
            return r0
    }

    private void c(org.junit.experimental.theories.a r5, java.lang.String r6, java.util.List<org.junit.experimental.theories.PotentialAssignment> r7, java.lang.Object r8) {
            r4 = this;
            r0 = 0
        L1:
            int r1 = java.lang.reflect.Array.getLength(r8)
            if (r0 >= r1) goto L34
            java.lang.Object r1 = java.lang.reflect.Array.get(r8, r0)
            boolean r2 = r5.c(r1)
            if (r2 == 0) goto L31
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r3 = "["
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = "]"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            org.junit.experimental.theories.PotentialAssignment r1 = org.junit.experimental.theories.PotentialAssignment.a(r2, r1)
            r7.add(r1)
        L31:
            int r0 = r0 + 1
            goto L1
        L34:
            return
    }

    private void d(java.lang.Class<?> r2, org.junit.experimental.theories.a r3, java.lang.String r4, java.util.List<org.junit.experimental.theories.PotentialAssignment> r5, java.lang.Object r6) {
            r1 = this;
            boolean r0 = r2.isArray()
            if (r0 == 0) goto La
            r1.c(r3, r4, r5, r6)
            return
        La:
            java.lang.Class<java.lang.Iterable> r0 = java.lang.Iterable.class
            boolean r2 = r0.isAssignableFrom(r2)
            if (r2 == 0) goto L17
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r1.e(r3, r4, r5, r6)
        L17:
            return
    }

    private void e(org.junit.experimental.theories.a r5, java.lang.String r6, java.util.List<org.junit.experimental.theories.PotentialAssignment> r7, java.lang.Iterable<?> r8) {
            r4 = this;
            java.util.Iterator r8 = r8.iterator()
            r0 = 0
        L5:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r8.next()
            boolean r2 = r5.c(r1)
            if (r2 == 0) goto L35
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r3 = "["
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = "]"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            org.junit.experimental.theories.PotentialAssignment r1 = org.junit.experimental.theories.PotentialAssignment.a(r2, r1)
            r7.add(r1)
        L35:
            int r0 = r0 + 1
            goto L5
        L38:
            return
    }

    private void f(org.junit.experimental.theories.a r9, java.util.List<org.junit.experimental.theories.PotentialAssignment> r10) {
            r8 = this;
            java.util.Collection r0 = r8.j(r9)
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            java.lang.Class r3 = r1.getType()
            java.lang.String r5 = r1.getName()
            java.lang.Object r7 = r8.n(r1)
            r2 = r8
            r4 = r9
            r6 = r10
            r2.d(r3, r4, r5, r6, r7)
            goto L8
        L27:
            return
    }

    private void g(org.junit.experimental.theories.a r9, java.util.List<org.junit.experimental.theories.PotentialAssignment> r10) throws java.lang.Throwable {
            r8 = this;
            java.util.Collection r0 = r8.k(r9)
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L60
            java.lang.Object r1 = r0.next()
            org.junit.runners.model.d r1 = (org.junit.runners.model.d) r1
            java.lang.Class r3 = r1.k()
            boolean r2 = r3.isArray()
            if (r2 == 0) goto L28
            java.lang.Class r2 = r3.getComponentType()
            boolean r2 = r9.d(r2)
            if (r2 != 0) goto L30
        L28:
            java.lang.Class<java.lang.Iterable> r2 = java.lang.Iterable.class
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L5b
        L30:
            java.lang.String r5 = r1.c()     // Catch: java.lang.Throwable -> L43
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L43
            r4 = 0
            java.lang.Object r7 = r1.l(r4, r2)     // Catch: java.lang.Throwable -> L43
            r2 = r8
            r4 = r9
            r6 = r10
            r2.d(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L43
            goto L5d
        L43:
            r0 = move-exception
            r9 = r0
            java.lang.Class<org.junit.experimental.theories.DataPoints> r10 = org.junit.experimental.theories.DataPoints.class
            java.lang.annotation.Annotation r10 = r1.getAnnotation(r10)
            org.junit.experimental.theories.DataPoints r10 = (org.junit.experimental.theories.DataPoints) r10
            if (r10 == 0) goto L5a
            java.lang.Class[] r10 = r10.ignoredExceptions()
            boolean r10 = o(r10, r9)
            if (r10 == 0) goto L5a
            goto L60
        L5a:
            throw r9
        L5b:
            r4 = r9
            r6 = r10
        L5d:
            r9 = r4
            r10 = r6
            goto L8
        L60:
            return
    }

    private void h(org.junit.experimental.theories.a r5, java.util.List<org.junit.experimental.theories.PotentialAssignment> r6) {
            r4 = this;
            java.util.Collection r0 = r4.l(r5)
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            java.lang.Object r2 = r4.n(r1)
            boolean r3 = r5.c(r2)
            if (r3 == 0) goto L8
            java.lang.String r1 = r1.getName()
            org.junit.experimental.theories.PotentialAssignment r1 = org.junit.experimental.theories.PotentialAssignment.a(r1, r2)
            r6.add(r1)
            goto L8
        L2a:
            return
    }

    private void i(org.junit.experimental.theories.a r5, java.util.List<org.junit.experimental.theories.PotentialAssignment> r6) {
            r4 = this;
            java.util.Collection r0 = r4.m(r5)
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            org.junit.runners.model.d r1 = (org.junit.runners.model.d) r1
            java.lang.Class r2 = r1.getType()
            boolean r2 = r5.b(r2)
            if (r2 == 0) goto L8
            org.junit.experimental.theories.internal.a$b r2 = new org.junit.experimental.theories.internal.a$b
            r3 = 0
            r2.<init>(r1, r3)
            r6.add(r2)
            goto L8
        L28:
            return
    }

    private java.lang.Object n(java.lang.reflect.Field r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.IllegalAccessException -> L6 java.lang.IllegalArgumentException -> Le
            return r2
        L6:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "unexpected: getFields returned an inaccessible field"
            r2.<init>(r0)
            throw r2
        Le:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "unexpected: field from getClass doesn't exist on object"
            r2.<init>(r0)
            throw r2
    }

    private static boolean o(java.lang.Class<?>[] r5, java.lang.Object r6) {
            int r0 = r5.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto L16
            r3 = r5[r2]
            java.lang.Class r4 = r6.getClass()
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 == 0) goto L13
            r5 = 1
            return r5
        L13:
            int r2 = r2 + 1
            goto L3
        L16:
            return r1
    }

    @Override // org.junit.experimental.theories.b
    public java.util.List<org.junit.experimental.theories.PotentialAssignment> a(org.junit.experimental.theories.a r2) throws java.lang.Throwable {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.h(r2, r0)
            r1.f(r2, r0)
            r1.i(r2, r0)
            r1.g(r2, r0)
            return r0
    }

    protected java.util.Collection<java.lang.reflect.Field> j(org.junit.experimental.theories.a r3) {
            r2 = this;
            org.junit.runners.model.i r3 = r2.a
            java.lang.Class<org.junit.experimental.theories.DataPoints> r0 = org.junit.experimental.theories.DataPoints.class
            java.util.List r3 = r3.e(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r3.next()
            org.junit.runners.model.b r1 = (org.junit.runners.model.b) r1
            java.lang.reflect.Field r1 = r1.i()
            r0.add(r1)
            goto L11
        L25:
            return r0
    }

    protected java.util.Collection<org.junit.runners.model.d> k(org.junit.experimental.theories.a r2) {
            r1 = this;
            org.junit.runners.model.i r2 = r1.a
            java.lang.Class<org.junit.experimental.theories.DataPoints> r0 = org.junit.experimental.theories.DataPoints.class
            java.util.List r2 = r2.i(r0)
            return r2
    }

    protected java.util.Collection<java.lang.reflect.Field> l(org.junit.experimental.theories.a r3) {
            r2 = this;
            org.junit.runners.model.i r3 = r2.a
            java.lang.Class<org.junit.experimental.theories.DataPoint> r0 = org.junit.experimental.theories.DataPoint.class
            java.util.List r3 = r3.e(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r3.next()
            org.junit.runners.model.b r1 = (org.junit.runners.model.b) r1
            java.lang.reflect.Field r1 = r1.i()
            r0.add(r1)
            goto L11
        L25:
            return r0
    }

    protected java.util.Collection<org.junit.runners.model.d> m(org.junit.experimental.theories.a r2) {
            r1 = this;
            org.junit.runners.model.i r2 = r1.a
            java.lang.Class<org.junit.experimental.theories.DataPoint> r0 = org.junit.experimental.theories.DataPoint.class
            java.util.List r2 = r2.i(r0)
            return r2
    }
}
