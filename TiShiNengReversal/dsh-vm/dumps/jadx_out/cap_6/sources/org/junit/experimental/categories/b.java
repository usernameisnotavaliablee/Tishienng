package org.junit.experimental.categories;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class b extends org.junit.validator.a {
    private static final java.util.Set<java.lang.Class<? extends java.lang.annotation.Annotation>> b = null;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<org.junit.BeforeClass> r2 = org.junit.BeforeClass.class
            r3 = 0
            r1[r3] = r2
            java.lang.Class<org.junit.AfterClass> r2 = org.junit.AfterClass.class
            r3 = 1
            r1[r3] = r2
            java.lang.Class<org.junit.Before> r2 = org.junit.Before.class
            r3 = 2
            r1[r3] = r2
            java.lang.Class<org.junit.After> r2 = org.junit.After.class
            r3 = 3
            r1[r3] = r2
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            org.junit.experimental.categories.b.b = r0
            return
    }

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    private void d(java.util.List<java.lang.Exception> r3, java.lang.Class<?> r4) {
            r2 = this;
            java.lang.String r4 = r4.getSimpleName()
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r4 = "@%s can not be combined with @Category"
            java.lang.String r4 = java.lang.String.format(r4, r0)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r4)
            r3.add(r0)
            return
    }

    @Override // org.junit.validator.a
    public java.util.List<java.lang.Exception> c(org.junit.runners.model.d r8) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.annotation.Annotation[] r8 = r8.getAnnotations()
            int r1 = r8.length
            r2 = 0
        Lb:
            if (r2 >= r1) goto L32
            r3 = r8[r2]
            java.util.Set<java.lang.Class<? extends java.lang.annotation.Annotation>> r4 = org.junit.experimental.categories.b.b
            java.util.Iterator r4 = r4.iterator()
        L15:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L2f
            java.lang.Object r5 = r4.next()
            java.lang.Class r5 = (java.lang.Class) r5
            java.lang.Class r6 = r3.annotationType()
            boolean r6 = r6.isAssignableFrom(r5)
            if (r6 == 0) goto L15
            r7.d(r0, r5)
            goto L15
        L2f:
            int r2 = r2 + 1
            goto Lb
        L32:
            java.util.List r8 = java.util.Collections.unmodifiableList(r0)
            return r8
    }
}
