package org.junit.runners.parameterized;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a extends org.junit.runners.b {
    private final java.lang.Object[] g;
    private final java.lang.String h;

    public a(org.junit.runners.parameterized.d r3) throws org.junit.runners.model.InitializationError {
            r2 = this;
            org.junit.runners.model.i r0 = r3.c()
            java.lang.Class r0 = r0.j()
            r2.<init>(r0)
            java.util.List r0 = r3.b()
            java.util.List r1 = r3.b()
            int r1 = r1.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            r2.g = r0
            java.lang.String r3 = r3.a()
            r2.h = r3
            return
    }

    private java.lang.Object j0() throws java.lang.Exception {
            r2 = this;
            org.junit.runners.model.i r0 = r2.s()
            java.lang.reflect.Constructor r0 = r0.l()
            java.lang.Object[] r1 = r2.g
            java.lang.Object r0 = r0.newInstance(r1)
            return r0
    }

    private java.lang.Object k0() throws java.lang.Exception {
            r6 = this;
            java.util.List r0 = r6.m0()
            int r1 = r0.size()
            java.lang.Object[] r2 = r6.g
            int r2 = r2.length
            if (r1 != r2) goto L9e
            org.junit.runners.model.i r1 = r6.s()
            java.lang.Class r1 = r1.j()
            java.lang.Object r1 = r1.newInstance()
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L9d
            java.lang.Object r2 = r0.next()
            org.junit.runners.model.b r2 = (org.junit.runners.model.b) r2
            java.lang.reflect.Field r2 = r2.i()
            java.lang.Class<org.junit.runners.Parameterized$Parameter> r3 = org.junit.runners.Parameterized.Parameter.class
            java.lang.annotation.Annotation r3 = r2.getAnnotation(r3)
            org.junit.runners.Parameterized$Parameter r3 = (org.junit.runners.Parameterized.Parameter) r3
            int r3 = r3.value()
            java.lang.Object[] r4 = r6.g     // Catch: java.lang.IllegalArgumentException -> L41
            r4 = r4[r3]     // Catch: java.lang.IllegalArgumentException -> L41
            r2.set(r1, r4)     // Catch: java.lang.IllegalArgumentException -> L41
            goto L1d
        L41:
            r0 = move-exception
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            org.junit.runners.model.i r5 = r6.s()
            java.lang.String r5 = r5.k()
            r4.append(r5)
            java.lang.String r5 = ": Trying to set "
            r4.append(r5)
            java.lang.String r5 = r2.getName()
            r4.append(r5)
            java.lang.String r5 = " with the value "
            r4.append(r5)
            java.lang.Object[] r5 = r6.g
            r5 = r5[r3]
            r4.append(r5)
            java.lang.String r5 = " that is not the right type ("
            r4.append(r5)
            java.lang.Object[] r5 = r6.g
            r3 = r5[r3]
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r4.append(r3)
            java.lang.String r3 = " instead of "
            r4.append(r3)
            java.lang.Class r2 = r2.getType()
            java.lang.String r2 = r2.getSimpleName()
            r4.append(r2)
            java.lang.String r2 = ")."
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2, r0)
            throw r1
        L9d:
            return r1
        L9e:
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Wrong number of parameters and @Parameter fields. @Parameter fields counted: "
            r2.append(r3)
            int r0 = r0.size()
            r2.append(r0)
            java.lang.String r0 = ", available parameters: "
            r2.append(r0)
            java.lang.Object[] r0 = r6.g
            int r0 = r0.length
            r2.append(r0)
            java.lang.String r0 = "."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    private boolean l0() {
            r1 = this;
            java.util.List r0 = r1.m0()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    private java.util.List<org.junit.runners.model.b> m0() {
            r2 = this;
            org.junit.runners.model.i r0 = r2.s()
            java.lang.Class<org.junit.runners.Parameterized$Parameter> r1 = org.junit.runners.Parameterized.Parameter.class
            java.util.List r0 = r0.e(r1)
            return r0
    }

    @Override // org.junit.runners.b
    public java.lang.Object G() throws java.lang.Exception {
            r1 = this;
            boolean r0 = r1.l0()
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r1.k0()
            return r0
        Lb:
            java.lang.Object r0 = r1.j0()
            return r0
    }

    @Override // org.junit.runners.b
    protected java.lang.String U(org.junit.runners.model.d r2) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r2.c()
            r0.append(r2)
            java.lang.String r2 = r1.q()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // org.junit.runners.b
    protected void V(java.util.List<java.lang.Throwable> r2) {
            r1 = this;
            r1.a0(r2)
            boolean r0 = r1.l0()
            if (r0 == 0) goto Lc
            r1.c0(r2)
        Lc:
            return
    }

    @Override // org.junit.runners.b
    protected void W(java.util.List<java.lang.Throwable> r10) {
            r9 = this;
            super.W(r10)
            boolean r0 = r9.l0()
            if (r0 == 0) goto Lcb
            java.util.List r0 = r9.m0()
            int r1 = r0.size()
            int[] r2 = new int[r1]
            java.util.Iterator r3 = r0.iterator()
        L17:
            boolean r4 = r3.hasNext()
            r5 = 1
            if (r4 == 0) goto L7c
            java.lang.Object r4 = r3.next()
            org.junit.runners.model.b r4 = (org.junit.runners.model.b) r4
            java.lang.reflect.Field r4 = r4.i()
            java.lang.Class<org.junit.runners.Parameterized$Parameter> r6 = org.junit.runners.Parameterized.Parameter.class
            java.lang.annotation.Annotation r4 = r4.getAnnotation(r6)
            org.junit.runners.Parameterized$Parameter r4 = (org.junit.runners.Parameterized.Parameter) r4
            int r4 = r4.value()
            if (r4 < 0) goto L44
            int r6 = r0.size()
            int r6 = r6 - r5
            if (r4 <= r6) goto L3e
            goto L44
        L3e:
            r6 = r2[r4]
            int r6 = r6 + r5
            r2[r4] = r6
            goto L17
        L44:
            java.lang.Exception r6 = new java.lang.Exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Invalid @Parameter value: "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r4 = ". @Parameter fields counted: "
            r7.append(r4)
            int r4 = r0.size()
            r7.append(r4)
            java.lang.String r4 = ". Please use an index between 0 and "
            r7.append(r4)
            int r4 = r0.size()
            int r4 = r4 - r5
            r7.append(r4)
            java.lang.String r4 = "."
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r6.<init>(r4)
            r10.add(r6)
            goto L17
        L7c:
            r0 = 0
        L7d:
            if (r0 >= r1) goto Lcb
            r3 = r2[r0]
            java.lang.String r4 = "@Parameter("
            if (r3 != 0) goto La2
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r0)
            java.lang.String r4 = ") is never used."
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r3.<init>(r4)
            r10.add(r3)
            goto Lc8
        La2:
            if (r3 <= r5) goto Lc8
            java.lang.Exception r6 = new java.lang.Exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r0)
            java.lang.String r4 = ") is used more than once ("
            r7.append(r4)
            r7.append(r3)
            java.lang.String r3 = ")."
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            r6.<init>(r3)
            r10.add(r6)
        Lc8:
            int r0 = r0 + 1
            goto L7d
        Lcb:
            return
    }

    @Override // org.junit.runners.d
    protected org.junit.runners.model.h i(org.junit.runner.notification.a r1) {
            r0 = this;
            org.junit.runners.model.h r1 = r0.h(r1)
            return r1
    }

    @Override // org.junit.runners.d
    protected java.lang.String q() {
            r1 = this;
            java.lang.String r0 = r1.h
            return r0
    }

    @Override // org.junit.runners.d
    protected java.lang.annotation.Annotation[] r() {
            r1 = this;
            r0 = 0
            java.lang.annotation.Annotation[] r0 = new java.lang.annotation.Annotation[r0]
            return r0
    }
}
