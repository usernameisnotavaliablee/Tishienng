package org.junit.runners.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d extends org.junit.runners.model.c<org.junit.runners.model.d> {
    private final java.lang.reflect.Method a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends org.junit.internal.runners.model.b {
        final /* synthetic */ java.lang.Object a;
        final /* synthetic */ java.lang.Object[] b;
        final /* synthetic */ org.junit.runners.model.d c;

        a(org.junit.runners.model.d r1, java.lang.Object r2, java.lang.Object[] r3) throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // org.junit.internal.runners.model.b
        protected java.lang.Object b() throws java.lang.Throwable {
                r3 = this;
                org.junit.runners.model.d r0 = r3.c
                java.lang.reflect.Method r0 = org.junit.runners.model.d.h(r0)
                java.lang.Object r1 = r3.a
                java.lang.Object[] r2 = r3.b
                java.lang.Object r0 = r0.invoke(r1, r2)
                return r0
        }
    }

    public d(java.lang.reflect.Method r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.a = r2
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "FrameworkMethod cannot be created without an underlying method."
            r2.<init>(r0)
            throw r2
    }

    static /* synthetic */ java.lang.reflect.Method h(org.junit.runners.model.d r0) {
            java.lang.reflect.Method r0 = r0.a
            return r0
    }

    private java.lang.Class<?>[] j() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.a
            java.lang.Class[] r0 = r0.getParameterTypes()
            return r0
    }

    @Override // org.junit.runners.model.c
    public java.lang.Class<?> a() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.a
            java.lang.Class r0 = r0.getDeclaringClass()
            return r0
    }

    @Override // org.junit.runners.model.c
    protected int b() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.a
            int r0 = r0.getModifiers()
            return r0
    }

    @Override // org.junit.runners.model.c
    public java.lang.String c() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.a
            java.lang.String r0 = r0.getName()
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            java.lang.Class<org.junit.runners.model.d> r0 = org.junit.runners.model.d.class
            boolean r0 = r0.isInstance(r2)
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            org.junit.runners.model.d r2 = (org.junit.runners.model.d) r2
            java.lang.reflect.Method r2 = r2.a
            java.lang.reflect.Method r0 = r1.a
            boolean r2 = r2.equals(r0)
            return r2
    }

    @Override // org.junit.runners.model.c
    public /* bridge */ /* synthetic */ boolean f(org.junit.runners.model.d r1) {
            r0 = this;
            org.junit.runners.model.d r1 = (org.junit.runners.model.d) r1
            boolean r1 = r0.m(r1)
            return r1
    }

    @Override // org.junit.runners.model.a
    public <T extends java.lang.annotation.Annotation> T getAnnotation(java.lang.Class<T> r2) {
            r1 = this;
            java.lang.reflect.Method r0 = r1.a
            java.lang.annotation.Annotation r2 = r0.getAnnotation(r2)
            return r2
    }

    @Override // org.junit.runners.model.a
    public java.lang.annotation.Annotation[] getAnnotations() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.a
            java.lang.annotation.Annotation[] r0 = r0.getAnnotations()
            return r0
    }

    @Override // org.junit.runners.model.c
    public java.lang.Class<?> getType() {
            r1 = this;
            java.lang.Class r0 = r1.k()
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.a
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.reflect.Method i() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.a
            return r0
    }

    public java.lang.Class<?> k() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.a
            java.lang.Class r0 = r0.getReturnType()
            return r0
    }

    public java.lang.Object l(java.lang.Object r2, java.lang.Object... r3) throws java.lang.Throwable {
            r1 = this;
            org.junit.runners.model.d$a r0 = new org.junit.runners.model.d$a
            r0.<init>(r1, r2, r3)
            java.lang.Object r2 = r0.a()
            return r2
    }

    public boolean m(org.junit.runners.model.d r5) {
            r4 = this;
            java.lang.String r0 = r5.c()
            java.lang.String r1 = r4.c()
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            java.lang.Class[] r0 = r5.j()
            int r0 = r0.length
            java.lang.Class[] r2 = r4.j()
            int r2 = r2.length
            if (r0 == r2) goto L1d
            return r1
        L1d:
            r0 = 0
        L1e:
            java.lang.Class[] r2 = r5.j()
            int r2 = r2.length
            if (r0 >= r2) goto L3b
            java.lang.Class[] r2 = r5.j()
            r2 = r2[r0]
            java.lang.Class[] r3 = r4.j()
            r3 = r3[r0]
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L38
            return r1
        L38:
            int r0 = r0 + 1
            goto L1e
        L3b:
            r5 = 1
            return r5
    }

    @java.lang.Deprecated
    public boolean n(java.lang.reflect.Type r2) {
            r1 = this;
            java.lang.Class[] r0 = r1.j()
            int r0 = r0.length
            if (r0 != 0) goto L1b
            boolean r0 = r2 instanceof java.lang.Class
            if (r0 == 0) goto L1b
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.reflect.Method r0 = r1.a
            java.lang.Class r0 = r0.getReturnType()
            boolean r2 = r2.isAssignableFrom(r0)
            if (r2 == 0) goto L1b
            r2 = 1
            return r2
        L1b:
            r2 = 0
            return r2
    }

    public void o(java.util.List<java.lang.Throwable> r3) {
            r2 = this;
            org.junit.runners.model.e r0 = new org.junit.runners.model.e
            java.lang.reflect.Method r1 = r2.a
            r0.<init>(r1)
            r0.a(r3)
            return
    }

    public void p(boolean r5, java.util.List<java.lang.Throwable> r6) {
            r4 = this;
            boolean r0 = r4.g()
            java.lang.String r1 = "Method "
            if (r0 == r5) goto L39
            if (r5 == 0) goto Ld
            java.lang.String r5 = "should"
            goto Lf
        Ld:
            java.lang.String r5 = "should not"
        Lf:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.reflect.Method r3 = r4.a
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = "() "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = " be static"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r0.<init>(r5)
            r6.add(r0)
        L39:
            boolean r5 = r4.d()
            if (r5 != 0) goto L61
            java.lang.Exception r5 = new java.lang.Exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.reflect.Method r2 = r4.a
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r2 = "() should be public"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            r6.add(r5)
        L61:
            java.lang.reflect.Method r5 = r4.a
            java.lang.Class r5 = r5.getReturnType()
            java.lang.Class r0 = java.lang.Void.TYPE
            if (r5 == r0) goto L8d
            java.lang.Exception r5 = new java.lang.Exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.reflect.Method r1 = r4.a
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "() should be void"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            r6.add(r5)
        L8d:
            return
    }

    public void q(boolean r3, java.util.List<java.lang.Throwable> r4) {
            r2 = this;
            r2.p(r3, r4)
            java.lang.reflect.Method r3 = r2.a
            java.lang.Class[] r3 = r3.getParameterTypes()
            int r3 = r3.length
            if (r3 == 0) goto L30
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Method "
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.a
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " should have no parameters"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            r4.add(r3)
        L30:
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.a
            java.lang.String r0 = r0.toString()
            return r0
    }
}
