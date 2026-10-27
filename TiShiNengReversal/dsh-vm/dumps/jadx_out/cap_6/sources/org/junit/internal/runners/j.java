package org.junit.internal.runners;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class j {
    private final java.lang.reflect.Method a;
    private org.junit.internal.runners.i b;

    public j(java.lang.reflect.Method r1, org.junit.internal.runners.i r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    boolean a() {
            r1 = this;
            java.lang.Class r0 = r1.d()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    java.util.List<java.lang.reflect.Method> b() {
            r2 = this;
            org.junit.internal.runners.i r0 = r2.b
            java.lang.Class<org.junit.After> r1 = org.junit.After.class
            java.util.List r0 = r0.b(r1)
            return r0
    }

    java.util.List<java.lang.reflect.Method> c() {
            r2 = this;
            org.junit.internal.runners.i r0 = r2.b
            java.lang.Class<org.junit.Before> r1 = org.junit.Before.class
            java.util.List r0 = r0.b(r1)
            return r0
    }

    protected java.lang.Class<? extends java.lang.Throwable> d() {
            r3 = this;
            java.lang.reflect.Method r0 = r3.a
            java.lang.Class<org.junit.Test> r1 = org.junit.Test.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            org.junit.Test r0 = (org.junit.Test) r0
            if (r0 == 0) goto L1a
            java.lang.Class r1 = r0.expected()
            java.lang.Class<org.junit.Test$None> r2 = org.junit.Test.None.class
            if (r1 != r2) goto L15
            goto L1a
        L15:
            java.lang.Class r0 = r0.expected()
            return r0
        L1a:
            r0 = 0
            return r0
    }

    public long e() {
            r2 = this;
            java.lang.reflect.Method r0 = r2.a
            java.lang.Class<org.junit.Test> r1 = org.junit.Test.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            org.junit.Test r0 = (org.junit.Test) r0
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            long r0 = r0.timeout()
            return r0
    }

    public void f(java.lang.Object r3) throws java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r2 = this;
            java.lang.reflect.Method r0 = r2.a
            r1 = 0
            r0.invoke(r3, r1)
            return
    }

    public boolean g() {
            r2 = this;
            java.lang.reflect.Method r0 = r2.a
            java.lang.Class<org.junit.Ignore> r1 = org.junit.Ignore.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    boolean h(java.lang.Throwable r2) {
            r1 = this;
            java.lang.Class r0 = r1.d()
            java.lang.Class r2 = r2.getClass()
            boolean r2 = r0.isAssignableFrom(r2)
            r2 = r2 ^ 1
            return r2
    }
}
