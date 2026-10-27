package org.junit.experimental.theories;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    private static final java.util.Map<java.lang.Class<?>, java.lang.Class<?>> c = null;
    private final java.lang.Class<?> a;
    private final java.lang.annotation.Annotation[] b;

    static {
            java.util.Map r0 = a()
            org.junit.experimental.theories.a.c = r0
            return
    }

    private a(java.lang.Class<?> r1, java.lang.annotation.Annotation[] r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    private static java.util.Map<java.lang.Class<?>, java.lang.Class<?>> a() {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            k(r0, r1, r2)
            java.lang.Class r1 = java.lang.Byte.TYPE
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            k(r0, r1, r2)
            java.lang.Class r1 = java.lang.Short.TYPE
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            k(r0, r1, r2)
            java.lang.Class r1 = java.lang.Character.TYPE
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
            k(r0, r1, r2)
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            k(r0, r1, r2)
            java.lang.Class r1 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            k(r0, r1, r2)
            java.lang.Class r1 = java.lang.Float.TYPE
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            k(r0, r1, r2)
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            k(r0, r1, r2)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            return r0
    }

    private <T extends java.lang.annotation.Annotation> T f(java.lang.annotation.Annotation[] r6, java.lang.Class<T> r7, int r8) {
            r5 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            int r1 = r6.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L31
            r3 = r6[r2]
            boolean r4 = r7.isInstance(r3)
            if (r4 == 0) goto L17
            java.lang.Object r6 = r7.cast(r3)
            java.lang.annotation.Annotation r6 = (java.lang.annotation.Annotation) r6
            return r6
        L17:
            java.lang.Class r3 = r3.annotationType()
            java.lang.annotation.Annotation[] r3 = r3.getAnnotations()
            int r4 = r8 + (-1)
            java.lang.annotation.Annotation r3 = r5.f(r3, r7, r4)
            if (r3 == 0) goto L2e
            java.lang.Object r6 = r7.cast(r3)
            java.lang.annotation.Annotation r6 = (java.lang.annotation.Annotation) r6
            return r6
        L2e:
            int r2 = r2 + 1
            goto L6
        L31:
            return r0
    }

    private boolean j(java.lang.Class<?> r3, java.lang.Class<?> r4) {
            r2 = this;
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r0 = org.junit.experimental.theories.a.c
            boolean r1 = r0.containsKey(r4)
            if (r1 == 0) goto L13
            java.lang.Object r4 = r0.get(r4)
            java.lang.Class r4 = (java.lang.Class) r4
            boolean r3 = r3.isAssignableFrom(r4)
            return r3
        L13:
            r3 = 0
            return r3
    }

    private static <T> void k(java.util.Map<T, T> r0, T r1, T r2) {
            r0.put(r1, r2)
            r0.put(r2, r1)
            return
    }

    public static java.util.ArrayList<org.junit.experimental.theories.a> l(java.lang.reflect.Method r1) {
            java.lang.Class[] r0 = r1.getParameterTypes()
            java.lang.annotation.Annotation[][] r1 = r1.getParameterAnnotations()
            java.util.ArrayList r1 = m(r0, r1)
            return r1
    }

    private static java.util.ArrayList<org.junit.experimental.theories.a> m(java.lang.Class<?>[] r5, java.lang.annotation.Annotation[][] r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r5.length
            if (r1 >= r2) goto L18
            org.junit.experimental.theories.a r2 = new org.junit.experimental.theories.a
            r3 = r5[r1]
            r4 = r6[r1]
            r2.<init>(r3, r4)
            r0.add(r2)
            int r1 = r1 + 1
            goto L6
        L18:
            return r0
    }

    public static java.util.List<org.junit.experimental.theories.a> n(java.lang.reflect.Constructor<?> r1) {
            java.lang.Class[] r0 = r1.getParameterTypes()
            java.lang.annotation.Annotation[][] r1 = r1.getParameterAnnotations()
            java.util.ArrayList r1 = m(r0, r1)
            return r1
    }

    public boolean b(java.lang.Class<?> r2) {
            r1 = this;
            java.lang.Class<?> r0 = r1.a
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 != 0) goto L13
            java.lang.Class<?> r0 = r1.a
            boolean r2 = r1.j(r0, r2)
            if (r2 == 0) goto L11
            goto L13
        L11:
            r2 = 0
            return r2
        L13:
            r2 = 1
            return r2
    }

    public boolean c(java.lang.Object r1) {
            r0 = this;
            if (r1 != 0) goto Le
            java.lang.Class<?> r1 = r0.a
            boolean r1 = r1.isPrimitive()
            if (r1 != 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
        Le:
            java.lang.Class r1 = r1.getClass()
            boolean r1 = r0.b(r1)
            return r1
    }

    public boolean d(java.lang.Class<?> r2) {
            r1 = this;
            java.lang.Class<?> r0 = r1.a
            boolean r0 = r2.isAssignableFrom(r0)
            if (r0 != 0) goto L19
            java.lang.Class<?> r0 = r1.a
            boolean r0 = r1.j(r2, r0)
            if (r0 != 0) goto L19
            boolean r2 = r1.b(r2)
            if (r2 == 0) goto L17
            goto L19
        L17:
            r2 = 0
            return r2
        L19:
            r2 = 1
            return r2
    }

    public <T extends java.lang.annotation.Annotation> T e(java.lang.Class<T> r3) {
            r2 = this;
            java.lang.annotation.Annotation[] r0 = r2.b
            r1 = 3
            java.lang.annotation.Annotation r3 = r2.f(r0, r3, r1)
            return r3
    }

    public <T extends java.lang.annotation.Annotation> T g(java.lang.Class<T> r4) {
            r3 = this;
            java.util.List r0 = r3.h()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            java.lang.annotation.Annotation r1 = (java.lang.annotation.Annotation) r1
            boolean r2 = r4.isInstance(r1)
            if (r2 == 0) goto L8
            java.lang.Object r4 = r4.cast(r1)
            java.lang.annotation.Annotation r4 = (java.lang.annotation.Annotation) r4
            return r4
        L21:
            r4 = 0
            return r4
    }

    public java.lang.Class<?> getType() {
            r1 = this;
            java.lang.Class<?> r0 = r1.a
            return r0
    }

    public java.util.List<java.lang.annotation.Annotation> h() {
            r1 = this;
            java.lang.annotation.Annotation[] r0 = r1.b
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
    }

    public boolean i(java.lang.Class<? extends java.lang.annotation.Annotation> r1) {
            r0 = this;
            java.lang.annotation.Annotation r1 = r0.g(r1)
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }
}
