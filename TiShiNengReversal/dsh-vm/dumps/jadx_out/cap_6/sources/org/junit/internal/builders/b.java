package org.junit.internal.builders;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b extends org.junit.runners.model.f {
    private static final java.lang.String c = "Custom runner class %s should have a public constructor with signature %s(Class testClass)";
    private final org.junit.runners.model.f b;

    public b(org.junit.runners.model.f r1) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            return
    }

    private java.lang.Class<?> i(java.lang.Class<?> r2) {
            r1 = this;
            boolean r0 = r2.isMemberClass()
            if (r0 == 0) goto L15
            int r0 = r2.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L15
            java.lang.Class r2 = r2.getEnclosingClass()
            return r2
        L15:
            r2 = 0
            return r2
    }

    @Override // org.junit.runners.model.f
    public org.junit.runner.g c(java.lang.Class<?> r3) throws java.lang.Exception {
            r2 = this;
            r0 = r3
        L1:
            if (r0 == 0) goto L1b
            java.lang.Class<org.junit.runner.RunWith> r1 = org.junit.runner.RunWith.class
            java.lang.annotation.Annotation r1 = r0.getAnnotation(r1)
            org.junit.runner.RunWith r1 = (org.junit.runner.RunWith) r1
            if (r1 == 0) goto L16
            java.lang.Class r0 = r1.value()
            org.junit.runner.g r3 = r2.h(r0, r3)
            return r3
        L16:
            java.lang.Class r0 = r2.i(r0)
            goto L1
        L1b:
            r3 = 0
            return r3
    }

    public org.junit.runner.g h(java.lang.Class<? extends org.junit.runner.g> r7, java.lang.Class<?> r8) throws java.lang.Exception {
            r6 = this;
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            r1 = 0
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L17
            r3[r1] = r0     // Catch: java.lang.NoSuchMethodException -> L17
            java.lang.reflect.Constructor r3 = r7.getConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L17
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.NoSuchMethodException -> L17
            r4[r1] = r8     // Catch: java.lang.NoSuchMethodException -> L17
            java.lang.Object r3 = r3.newInstance(r4)     // Catch: java.lang.NoSuchMethodException -> L17
            org.junit.runner.g r3 = (org.junit.runner.g) r3     // Catch: java.lang.NoSuchMethodException -> L17
            return r3
        L17:
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L33
            r4[r1] = r0     // Catch: java.lang.NoSuchMethodException -> L33
            java.lang.Class<org.junit.runners.model.f> r0 = org.junit.runners.model.f.class
            r4[r2] = r0     // Catch: java.lang.NoSuchMethodException -> L33
            java.lang.reflect.Constructor r0 = r7.getConstructor(r4)     // Catch: java.lang.NoSuchMethodException -> L33
            org.junit.runners.model.f r4 = r6.b     // Catch: java.lang.NoSuchMethodException -> L33
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.NoSuchMethodException -> L33
            r5[r1] = r8     // Catch: java.lang.NoSuchMethodException -> L33
            r5[r2] = r4     // Catch: java.lang.NoSuchMethodException -> L33
            java.lang.Object r8 = r0.newInstance(r5)     // Catch: java.lang.NoSuchMethodException -> L33
            org.junit.runner.g r8 = (org.junit.runner.g) r8     // Catch: java.lang.NoSuchMethodException -> L33
            return r8
        L33:
            java.lang.String r7 = r7.getSimpleName()
            org.junit.runners.model.InitializationError r8 = new org.junit.runners.model.InitializationError
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r1] = r7
            r0[r2] = r7
            java.lang.String r7 = "Custom runner class %s should have a public constructor with signature %s(Class testClass)"
            java.lang.String r7 = java.lang.String.format(r7, r0)
            r8.<init>(r7)
            throw r8
    }
}
