package org.junit.runners;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Parameterized extends org.junit.runners.Suite {
    private static final org.junit.runners.parameterized.c h = null;
    private static final java.util.List<org.junit.runner.g> i = null;
    private final java.util.List<org.junit.runner.g> g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface Parameter {
        int value() default 0;
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface Parameters {
        java.lang.String name() default "{index}";
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
    @java.lang.annotation.Inherited
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface UseParametersRunnerFactory {
        java.lang.Class<? extends org.junit.runners.parameterized.c> value() default org.junit.runners.parameterized.b.class;
    }

    static {
            org.junit.runners.parameterized.b r0 = new org.junit.runners.parameterized.b
            r0.<init>()
            org.junit.runners.Parameterized.h = r0
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            org.junit.runners.Parameterized.i = r0
            return
    }

    public Parameterized(java.lang.Class<?> r3) throws java.lang.Throwable {
            r2 = this;
            java.util.List<org.junit.runner.g> r0 = org.junit.runners.Parameterized.i
            r2.<init>(r3, r0)
            org.junit.runners.parameterized.c r3 = r2.P(r3)
            org.junit.runners.model.d r0 = r2.O()
            java.lang.Class<org.junit.runners.Parameterized$Parameters> r1 = org.junit.runners.Parameterized.Parameters.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            org.junit.runners.Parameterized$Parameters r0 = (org.junit.runners.Parameterized.Parameters) r0
            java.lang.Iterable r1 = r2.J()
            java.lang.String r0 = r0.name()
            java.util.List r3 = r2.K(r1, r0, r3)
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r2.g = r3
            return
    }

    private java.lang.Iterable<java.lang.Object> J() throws java.lang.Throwable {
            r3 = this;
            org.junit.runners.model.d r0 = r3.O()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Object r0 = r0.l(r2, r1)
            boolean r1 = r0 instanceof java.lang.Iterable
            if (r1 == 0) goto L13
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            return r0
        L13:
            boolean r1 = r0 instanceof java.lang.Object[]
            if (r1 == 0) goto L1e
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
        L1e:
            java.lang.Exception r0 = r3.Q()
            throw r0
    }

    private java.util.List<org.junit.runner.g> K(java.lang.Iterable<java.lang.Object> r2, java.lang.String r3, org.junit.runners.parameterized.c r4) throws org.junit.runners.model.InitializationError, java.lang.Exception {
            r1 = this;
            java.util.List r2 = r1.N(r2, r3)     // Catch: java.lang.ClassCastException -> L22
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.ClassCastException -> L22
            r3.<init>()     // Catch: java.lang.ClassCastException -> L22
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.ClassCastException -> L22
        Ld:
            boolean r0 = r2.hasNext()     // Catch: java.lang.ClassCastException -> L22
            if (r0 == 0) goto L21
            java.lang.Object r0 = r2.next()     // Catch: java.lang.ClassCastException -> L22
            org.junit.runners.parameterized.d r0 = (org.junit.runners.parameterized.d) r0     // Catch: java.lang.ClassCastException -> L22
            org.junit.runner.g r0 = r4.a(r0)     // Catch: java.lang.ClassCastException -> L22
            r3.add(r0)     // Catch: java.lang.ClassCastException -> L22
            goto Ld
        L21:
            return r3
        L22:
            java.lang.Exception r2 = r1.Q()
            throw r2
    }

    private org.junit.runners.parameterized.d L(java.lang.String r3, int r4, java.lang.Object r5) {
            r2 = this;
            boolean r0 = r5 instanceof java.lang.Object[]
            if (r0 == 0) goto L7
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            goto Le
        L7:
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r5
            r5 = r0
        Le:
            org.junit.runners.model.i r0 = r2.s()
            org.junit.runners.parameterized.d r3 = M(r0, r3, r4, r5)
            return r3
    }

    private static org.junit.runners.parameterized.d M(org.junit.runners.model.i r2, java.lang.String r3, int r4, java.lang.Object[] r5) {
            java.lang.String r0 = "\\{index\\}"
            java.lang.String r4 = java.lang.Integer.toString(r4)
            java.lang.String r3 = r3.replaceAll(r0, r4)
            java.lang.String r3 = java.text.MessageFormat.format(r3, r5)
            org.junit.runners.parameterized.d r4 = new org.junit.runners.parameterized.d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.util.List r5 = java.util.Arrays.asList(r5)
            r4.<init>(r3, r2, r5)
            return r4
    }

    private java.util.List<org.junit.runners.parameterized.d> N(java.lang.Iterable<java.lang.Object> r5, java.lang.String r6) throws java.lang.Exception {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
            r1 = 0
        La:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r5.next()
            int r3 = r1 + 1
            org.junit.runners.parameterized.d r1 = r4.L(r6, r1, r2)
            r0.add(r1)
            r1 = r3
            goto La
        L1f:
            return r0
    }

    private org.junit.runners.model.d O() throws java.lang.Exception {
            r3 = this;
            org.junit.runners.model.i r0 = r3.s()
            java.lang.Class<org.junit.runners.Parameterized$Parameters> r1 = org.junit.runners.Parameterized.Parameters.class
            java.util.List r0 = r0.i(r1)
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            org.junit.runners.model.d r1 = (org.junit.runners.model.d) r1
            boolean r2 = r1.g()
            if (r2 == 0) goto Le
            boolean r2 = r1.d()
            if (r2 == 0) goto Le
            return r1
        L27:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No public static parameters method on class "
            r1.append(r2)
            org.junit.runners.model.i r2 = r3.s()
            java.lang.String r2 = r2.k()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private org.junit.runners.parameterized.c P(java.lang.Class<?> r2) throws java.lang.InstantiationException, java.lang.IllegalAccessException {
            r1 = this;
            java.lang.Class<org.junit.runners.Parameterized$UseParametersRunnerFactory> r0 = org.junit.runners.Parameterized.UseParametersRunnerFactory.class
            java.lang.annotation.Annotation r2 = r2.getAnnotation(r0)
            org.junit.runners.Parameterized$UseParametersRunnerFactory r2 = (org.junit.runners.Parameterized.UseParametersRunnerFactory) r2
            if (r2 != 0) goto Ld
            org.junit.runners.parameterized.c r2 = org.junit.runners.Parameterized.h
            return r2
        Ld:
            java.lang.Class r2 = r2.value()
            java.lang.Object r2 = r2.newInstance()
            org.junit.runners.parameterized.c r2 = (org.junit.runners.parameterized.c) r2
            return r2
    }

    private java.lang.Exception Q() throws java.lang.Exception {
            r4 = this;
            org.junit.runners.model.i r0 = r4.s()
            java.lang.String r0 = r0.k()
            org.junit.runners.model.d r1 = r4.O()
            java.lang.String r1 = r1.c()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            java.lang.String r0 = "{0}.{1}() must return an Iterable of arrays."
            java.lang.String r0 = java.text.MessageFormat.format(r0, r2)
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>(r0)
            return r1
    }

    @Override // org.junit.runners.Suite, org.junit.runners.d
    protected java.util.List<org.junit.runner.g> o() {
            r1 = this;
            java.util.List<org.junit.runner.g> r0 = r1.g
            return r0
    }
}
