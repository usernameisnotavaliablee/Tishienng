package org.junit.internal.runners;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class g {
    private final java.util.List<java.lang.Throwable> a;
    private org.junit.internal.runners.i b;

    public g(org.junit.internal.runners.i r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            r1.b = r2
            return
    }

    private void f(java.lang.Class<? extends java.lang.annotation.Annotation> r8, boolean r9) {
            r7 = this;
            org.junit.internal.runners.i r0 = r7.b
            java.util.List r8 = r0.b(r8)
            java.util.Iterator r8 = r8.iterator()
        La:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L108
            java.lang.Object r0 = r8.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            int r1 = r0.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            java.lang.String r2 = "Method "
            if (r1 == r9) goto L53
            if (r9 == 0) goto L27
            java.lang.String r1 = "should"
            goto L29
        L27:
            java.lang.String r1 = "should not"
        L29:
            java.util.List<java.lang.Throwable> r3 = r7.a
            java.lang.Exception r4 = new java.lang.Exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r6 = r0.getName()
            r5.append(r6)
            java.lang.String r6 = "() "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = " be static"
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r4.<init>(r1)
            r3.add(r4)
        L53:
            java.lang.Class r1 = r0.getDeclaringClass()
            int r1 = r1.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
            java.lang.String r3 = " should be public"
            if (r1 != 0) goto L89
            java.util.List<java.lang.Throwable> r1 = r7.a
            java.lang.Exception r4 = new java.lang.Exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Class "
            r5.append(r6)
            java.lang.Class r6 = r0.getDeclaringClass()
            java.lang.String r6 = r6.getName()
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            r1.add(r4)
        L89:
            int r1 = r0.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
            if (r1 != 0) goto Lb3
            java.util.List<java.lang.Throwable> r1 = r7.a
            java.lang.Exception r4 = new java.lang.Exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r6 = r0.getName()
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            r1.add(r4)
        Lb3:
            java.lang.Class r1 = r0.getReturnType()
            java.lang.Class r3 = java.lang.Void.TYPE
            if (r1 == r3) goto Ldd
            java.util.List<java.lang.Throwable> r1 = r7.a
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r5 = r0.getName()
            r4.append(r5)
            java.lang.String r5 = " should be void"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            r1.add(r3)
        Ldd:
            java.lang.Class[] r1 = r0.getParameterTypes()
            int r1 = r1.length
            if (r1 == 0) goto La
            java.util.List<java.lang.Throwable> r1 = r7.a
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " should have no parameters"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            r1.add(r3)
            goto La
        L108:
            return
    }

    public void a() throws org.junit.internal.runners.InitializationError {
            r2 = this;
            java.util.List<java.lang.Throwable> r0 = r2.a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            return
        L9:
            org.junit.internal.runners.InitializationError r0 = new org.junit.internal.runners.InitializationError
            java.util.List<java.lang.Throwable> r1 = r2.a
            r0.<init>(r1)
            throw r0
    }

    public void b() {
            r3 = this;
            java.lang.Class<org.junit.After> r0 = org.junit.After.class
            r1 = 0
            r3.f(r0, r1)
            java.lang.Class<org.junit.Before> r0 = org.junit.Before.class
            r3.f(r0, r1)
            java.lang.Class<org.junit.Test> r0 = org.junit.Test.class
            r3.f(r0, r1)
            org.junit.internal.runners.i r1 = r3.b
            java.util.List r0 = r1.b(r0)
            int r0 = r0.size()
            if (r0 != 0) goto L28
            java.util.List<java.lang.Throwable> r0 = r3.a
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r2 = "No runnable methods"
            r1.<init>(r2)
            r0.add(r1)
        L28:
            return
    }

    public java.util.List<java.lang.Throwable> c() {
            r1 = this;
            r1.d()
            r1.e()
            r1.b()
            java.util.List<java.lang.Throwable> r0 = r1.a
            return r0
    }

    public void d() {
            r4 = this;
            org.junit.internal.runners.i r0 = r4.b     // Catch: java.lang.Exception -> L6
            r0.d()     // Catch: java.lang.Exception -> L6
            return
        L6:
            r0 = move-exception
            java.util.List<java.lang.Throwable> r1 = r4.a
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r3 = "Test class should have public zero-argument constructor"
            r2.<init>(r3, r0)
            r1.add(r2)
            return
    }

    public void e() {
            r2 = this;
            java.lang.Class<org.junit.BeforeClass> r0 = org.junit.BeforeClass.class
            r1 = 1
            r2.f(r0, r1)
            java.lang.Class<org.junit.AfterClass> r0 = org.junit.AfterClass.class
            r2.f(r0, r1)
            return
    }
}
