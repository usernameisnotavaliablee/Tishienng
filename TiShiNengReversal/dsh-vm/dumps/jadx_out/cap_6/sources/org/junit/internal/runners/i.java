package org.junit.internal.runners;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class i {
    private final java.lang.Class<?> a;

    public i(java.lang.Class<?> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private java.util.List<java.lang.Class<?>> g(java.lang.Class<?> r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r2 == 0) goto Lf
            r0.add(r2)
            java.lang.Class r2 = r2.getSuperclass()
            goto L5
        Lf:
            return r0
    }

    private boolean i(java.lang.reflect.Method r5, java.lang.reflect.Method r6) {
            r4 = this;
            java.lang.String r0 = r6.getName()
            java.lang.String r1 = r5.getName()
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            java.lang.Class[] r0 = r6.getParameterTypes()
            int r0 = r0.length
            java.lang.Class[] r2 = r5.getParameterTypes()
            int r2 = r2.length
            if (r0 == r2) goto L1d
            return r1
        L1d:
            r0 = 0
        L1e:
            java.lang.Class[] r2 = r6.getParameterTypes()
            int r2 = r2.length
            if (r0 >= r2) goto L3b
            java.lang.Class[] r2 = r6.getParameterTypes()
            r2 = r2[r0]
            java.lang.Class[] r3 = r5.getParameterTypes()
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

    private boolean j(java.lang.reflect.Method r2, java.util.List<java.lang.reflect.Method> r3) {
            r1 = this;
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r3.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            boolean r0 = r1.i(r2, r0)
            if (r0 == 0) goto L4
            r2 = 1
            return r2
        L18:
            r2 = 0
            return r2
    }

    private boolean k(java.lang.Class<? extends java.lang.annotation.Annotation> r2) {
            r1 = this;
            java.lang.Class<org.junit.Before> r0 = org.junit.Before.class
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L13
            java.lang.Class<org.junit.BeforeClass> r0 = org.junit.BeforeClass.class
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L11
            goto L13
        L11:
            r2 = 0
            return r2
        L13:
            r2 = 1
            return r2
    }

    java.util.List<java.lang.reflect.Method> a() {
            r1 = this;
            java.lang.Class<org.junit.AfterClass> r0 = org.junit.AfterClass.class
            java.util.List r0 = r1.b(r0)
            return r0
    }

    public java.util.List<java.lang.reflect.Method> b(java.lang.Class<? extends java.lang.annotation.Annotation> r8) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class<?> r1 = r7.a
            java.util.List r1 = r7.g(r1)
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.reflect.Method[] r2 = org.junit.internal.f.a(r2)
            int r3 = r2.length
            r4 = 0
        L21:
            if (r4 >= r3) goto Lf
            r5 = r2[r4]
            java.lang.annotation.Annotation r6 = r5.getAnnotation(r8)
            if (r6 == 0) goto L34
            boolean r6 = r7.j(r5, r0)
            if (r6 != 0) goto L34
            r0.add(r5)
        L34:
            int r4 = r4 + 1
            goto L21
        L37:
            boolean r8 = r7.k(r8)
            if (r8 == 0) goto L40
            java.util.Collections.reverse(r0)
        L40:
            return r0
    }

    java.util.List<java.lang.reflect.Method> c() {
            r1 = this;
            java.lang.Class<org.junit.BeforeClass> r0 = org.junit.BeforeClass.class
            java.util.List r0 = r1.b(r0)
            return r0
    }

    public java.lang.reflect.Constructor<?> d() throws java.lang.SecurityException, java.lang.NoSuchMethodException {
            r2 = this;
            java.lang.Class<?> r0 = r2.a
            r1 = 0
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)
            return r0
    }

    public java.lang.Class<?> e() {
            r1 = this;
            java.lang.Class<?> r0 = r1.a
            return r0
    }

    public java.lang.String f() {
            r1 = this;
            java.lang.Class<?> r0 = r1.a
            java.lang.String r0 = r0.getName()
            return r0
    }

    public java.util.List<java.lang.reflect.Method> h() {
            r1 = this;
            java.lang.Class<org.junit.Test> r0 = org.junit.Test.class
            java.util.List r0 = r1.b(r0)
            return r0
    }
}
