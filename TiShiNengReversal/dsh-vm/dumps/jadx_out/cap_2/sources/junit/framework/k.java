package junit.framework;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class k implements junit.framework.f {
    private java.lang.String a;
    private java.util.Vector<junit.framework.f> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a extends junit.framework.g {
        final /* synthetic */ java.lang.String b;

        a(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.b = r2
                r0.<init>(r1)
                return
        }

        @Override // junit.framework.g
        protected void S() {
                r1 = this;
                java.lang.String r0 = r1.b
                junit.framework.g.J(r0)
                return
        }
    }

    public k() {
            r2 = this;
            r2.<init>()
            java.util.Vector r0 = new java.util.Vector
            r1 = 10
            r0.<init>(r1)
            r2.b = r0
            return
    }

    public k(java.lang.Class<?> r3) {
            r2 = this;
            r2.<init>()
            java.util.Vector r0 = new java.util.Vector
            r1 = 10
            r0.<init>(r1)
            r2.b = r0
            r2.f(r3)
            return
    }

    public k(java.lang.Class<? extends junit.framework.g> r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1)
            r0.n(r2)
            return
    }

    public k(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            java.util.Vector r0 = new java.util.Vector
            r1 = 10
            r0.<init>(r1)
            r2.b = r0
            r2.n(r3)
            return
    }

    public k(java.lang.Class<?>... r4) {
            r3 = this;
            r3.<init>()
            java.util.Vector r0 = new java.util.Vector
            r1 = 10
            r0.<init>(r1)
            r3.b = r0
            int r0 = r4.length
            r1 = 0
        Le:
            if (r1 >= r0) goto L1c
            r2 = r4[r1]
            junit.framework.f r2 = r3.p(r2)
            r3.b(r2)
            int r1 = r1 + 1
            goto Le
        L1c:
            return
    }

    public k(java.lang.Class<? extends junit.framework.g>[] r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1)
            r0.n(r2)
            return
    }

    private void d(java.lang.reflect.Method r3, java.util.List<java.lang.String> r4, java.lang.Class<?> r5) {
            r2 = this;
            java.lang.String r0 = r3.getName()
            boolean r1 = r4.contains(r0)
            if (r1 == 0) goto Lb
            goto L44
        Lb:
            boolean r1 = r2.k(r3)
            if (r1 != 0) goto L45
            boolean r4 = r2.l(r3)
            if (r4 == 0) goto L44
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Test method isn't public: "
            r4.append(r0)
            java.lang.String r3 = r3.getName()
            r4.append(r3)
            java.lang.String r3 = "("
            r4.append(r3)
            java.lang.String r3 = r5.getCanonicalName()
            r4.append(r3)
            java.lang.String r3 = ")"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            junit.framework.f r3 = s(r3)
            r2.b(r3)
        L44:
            return
        L45:
            r4.add(r0)
            junit.framework.f r3 = g(r5, r0)
            r2.b(r3)
            return
    }

    private void f(java.lang.Class<?> r7) {
            r6 = this;
            java.lang.String r0 = "Class "
            java.lang.String r1 = r7.getName()
            r6.a = r1
            j(r7)     // Catch: java.lang.NoSuchMethodException -> L7d
            int r1 = r7.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
            if (r1 != 0) goto L35
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r7 = r7.getName()
            r1.append(r7)
            java.lang.String r7 = " is not public"
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            junit.framework.f r7 = s(r7)
            r6.b(r7)
            return
        L35:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r7
        L3b:
            java.lang.Class<junit.framework.f> r2 = junit.framework.f.class
            boolean r2 = r2.isAssignableFrom(r1)
            if (r2 == 0) goto L58
            java.lang.reflect.Method[] r2 = org.junit.internal.f.a(r1)
            int r3 = r2.length
            r4 = 0
        L49:
            if (r4 >= r3) goto L53
            r5 = r2[r4]
            r6.d(r5, r0, r7)
            int r4 = r4 + 1
            goto L49
        L53:
            java.lang.Class r1 = r1.getSuperclass()
            goto L3b
        L58:
            java.util.Vector<junit.framework.f> r0 = r6.b
            int r0 = r0.size()
            if (r0 != 0) goto L7c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No tests found in "
            r0.append(r1)
            java.lang.String r7 = r7.getName()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            junit.framework.f r7 = s(r7)
            r6.b(r7)
        L7c:
            return
        L7d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r7 = r7.getName()
            r1.append(r7)
            java.lang.String r7 = " has no public constructor TestCase(String name) or TestCase()"
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            junit.framework.f r7 = s(r7)
            r6.b(r7)
            return
    }

    public static junit.framework.f g(java.lang.Class<?> r4, java.lang.String r5) {
            java.lang.String r0 = ")"
            java.lang.String r1 = " ("
            java.lang.reflect.Constructor r4 = j(r4)     // Catch: java.lang.NoSuchMethodException -> L9f
            java.lang.Class[] r2 = r4.getParameterTypes()     // Catch: java.lang.IllegalAccessException -> L1f java.lang.reflect.InvocationTargetException -> L21 java.lang.InstantiationException -> L23
            int r2 = r2.length     // Catch: java.lang.IllegalAccessException -> L1f java.lang.reflect.InvocationTargetException -> L21 java.lang.InstantiationException -> L23
            if (r2 != 0) goto L25
            r2 = 0
            java.lang.Object r4 = r4.newInstance(r2)     // Catch: java.lang.IllegalAccessException -> L1f java.lang.reflect.InvocationTargetException -> L21 java.lang.InstantiationException -> L23
            boolean r2 = r4 instanceof junit.framework.g     // Catch: java.lang.IllegalAccessException -> L1f java.lang.reflect.InvocationTargetException -> L21 java.lang.InstantiationException -> L23
            if (r2 == 0) goto L2f
            r2 = r4
            junit.framework.g r2 = (junit.framework.g) r2     // Catch: java.lang.IllegalAccessException -> L1f java.lang.reflect.InvocationTargetException -> L21 java.lang.InstantiationException -> L23
            r2.T(r5)     // Catch: java.lang.IllegalAccessException -> L1f java.lang.reflect.InvocationTargetException -> L21 java.lang.InstantiationException -> L23
            goto L2f
        L1f:
            r4 = move-exception
            goto L32
        L21:
            r4 = move-exception
            goto L55
        L23:
            r4 = move-exception
            goto L7c
        L25:
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.IllegalAccessException -> L1f java.lang.reflect.InvocationTargetException -> L21 java.lang.InstantiationException -> L23
            r3 = 0
            r2[r3] = r5     // Catch: java.lang.IllegalAccessException -> L1f java.lang.reflect.InvocationTargetException -> L21 java.lang.InstantiationException -> L23
            java.lang.Object r4 = r4.newInstance(r2)     // Catch: java.lang.IllegalAccessException -> L1f java.lang.reflect.InvocationTargetException -> L21 java.lang.InstantiationException -> L23
        L2f:
            junit.framework.f r4 = (junit.framework.f) r4
            return r4
        L32:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot access test case: "
            r2.append(r3)
            r2.append(r5)
            r2.append(r1)
            java.lang.String r4 = h(r4)
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            junit.framework.f r4 = s(r4)
            return r4
        L55:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exception in constructor: "
            r2.append(r3)
            r2.append(r5)
            r2.append(r1)
            java.lang.Throwable r4 = r4.getTargetException()
            java.lang.String r4 = h(r4)
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            junit.framework.f r4 = s(r4)
            return r4
        L7c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot instantiate test case: "
            r2.append(r3)
            r2.append(r5)
            r2.append(r1)
            java.lang.String r4 = h(r4)
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            junit.framework.f r4 = s(r4)
            return r4
        L9f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Class "
            r5.append(r0)
            java.lang.String r4 = r4.getName()
            r5.append(r4)
            java.lang.String r4 = " has no public constructor TestCase(String name) or TestCase()"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            junit.framework.f r4 = s(r4)
            return r4
    }

    private static java.lang.String h(java.lang.Throwable r2) {
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            r2.getClass()
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.reflect.Constructor<?> j(java.lang.Class<?> r3) throws java.lang.NoSuchMethodException {
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> Ld
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r2 = 0
            r0[r2] = r1     // Catch: java.lang.NoSuchMethodException -> Ld
            java.lang.reflect.Constructor r3 = r3.getConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> Ld
            return r3
        Ld:
            r0 = 0
            java.lang.reflect.Constructor r3 = r3.getConstructor(r0)
            return r3
    }

    private boolean k(java.lang.reflect.Method r2) {
            r1 = this;
            boolean r0 = r1.l(r2)
            if (r0 == 0) goto L12
            int r2 = r2.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isPublic(r2)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    private boolean l(java.lang.reflect.Method r3) {
            r2 = this;
            java.lang.Class[] r0 = r3.getParameterTypes()
            int r0 = r0.length
            if (r0 != 0) goto L21
            java.lang.String r0 = r3.getName()
            java.lang.String r1 = "test"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L21
            java.lang.Class r3 = r3.getReturnType()
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L21
            r3 = 1
            return r3
        L21:
            r3 = 0
            return r3
    }

    private junit.framework.f p(java.lang.Class<?> r3) {
            r2 = this;
            java.lang.Class<junit.framework.g> r0 = junit.framework.g.class
            boolean r1 = r0.isAssignableFrom(r3)
            if (r1 == 0) goto L12
            junit.framework.k r1 = new junit.framework.k
            java.lang.Class r3 = r3.asSubclass(r0)
            r1.<init>(r3)
            return r1
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r3.getCanonicalName()
            r0.append(r3)
            java.lang.String r3 = " does not extend TestCase"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            junit.framework.f r3 = s(r3)
            return r3
    }

    public static junit.framework.f s(java.lang.String r2) {
            junit.framework.k$a r0 = new junit.framework.k$a
            java.lang.String r1 = "warning"
            r0.<init>(r1, r2)
            return r0
    }

    @Override // junit.framework.f
    public void a(junit.framework.j r4) {
            r3 = this;
            java.util.Vector<junit.framework.f> r0 = r3.b
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            junit.framework.f r1 = (junit.framework.f) r1
            boolean r2 = r4.n()
            if (r2 == 0) goto L19
            goto L1d
        L19:
            r3.m(r1, r4)
            goto L6
        L1d:
            return
    }

    public void b(junit.framework.f r2) {
            r1 = this;
            java.util.Vector<junit.framework.f> r0 = r1.b
            r0.add(r2)
            return
    }

    @Override // junit.framework.f
    public int c() {
            r3 = this;
            java.util.Vector<junit.framework.f> r0 = r3.b
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L19
            java.lang.Object r2 = r0.next()
            junit.framework.f r2 = (junit.framework.f) r2
            int r2 = r2.c()
            int r1 = r1 + r2
            goto L7
        L19:
            return r1
    }

    public void e(java.lang.Class<? extends junit.framework.g> r2) {
            r1 = this;
            junit.framework.k r0 = new junit.framework.k
            r0.<init>(r2)
            r1.b(r0)
            return
    }

    public java.lang.String i() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public void m(junit.framework.f r1, junit.framework.j r2) {
            r0 = this;
            r1.a(r2)
            return
    }

    public void n(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public junit.framework.f o(int r2) {
            r1 = this;
            java.util.Vector<junit.framework.f> r0 = r1.b
            java.lang.Object r2 = r0.get(r2)
            junit.framework.f r2 = (junit.framework.f) r2
            return r2
    }

    public int q() {
            r1 = this;
            java.util.Vector<junit.framework.f> r0 = r1.b
            int r0 = r0.size()
            return r0
    }

    public java.util.Enumeration<junit.framework.f> r() {
            r1 = this;
            java.util.Vector<junit.framework.f> r0 = r1.b
            java.util.Enumeration r0 = r0.elements()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.i()
            if (r0 == 0) goto Lb
            java.lang.String r0 = r1.i()
            return r0
        Lb:
            java.lang.String r0 = super.toString()
            return r0
    }
}
