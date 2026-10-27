package org.junit.runners;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Suite extends org.junit.runners.d<org.junit.runner.g> {
    private final java.util.List<org.junit.runner.g> f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
    @java.lang.annotation.Inherited
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface SuiteClasses {
        java.lang.Class<?>[] value();
    }

    protected Suite(java.lang.Class<?> r1, java.util.List<org.junit.runner.g> r2) throws org.junit.runners.model.InitializationError {
            r0 = this;
            r0.<init>(r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            r0.f = r1
            return
    }

    public Suite(java.lang.Class<?> r2, org.junit.runners.model.f r3) throws org.junit.runners.model.InitializationError {
            r1 = this;
            java.lang.Class[] r0 = H(r2)
            r1.<init>(r3, r2, r0)
            return
    }

    protected Suite(java.lang.Class<?> r3, java.lang.Class<?>[] r4) throws org.junit.runners.model.InitializationError {
            r2 = this;
            org.junit.internal.builders.a r0 = new org.junit.internal.builders.a
            r1 = 1
            r0.<init>(r1)
            r2.<init>(r0, r3, r4)
            return
    }

    protected Suite(org.junit.runners.model.f r1, java.lang.Class<?> r2, java.lang.Class<?>[] r3) throws org.junit.runners.model.InitializationError {
            r0 = this;
            java.util.List r1 = r1.e(r2, r3)
            r0.<init>(r2, r1)
            return
    }

    public Suite(org.junit.runners.model.f r2, java.lang.Class<?>[] r3) throws org.junit.runners.model.InitializationError {
            r1 = this;
            r0 = 0
            java.util.List r2 = r2.e(r0, r3)
            r1.<init>(r0, r2)
            return
    }

    public static org.junit.runner.g G() {
            org.junit.runners.Suite r0 = new org.junit.runners.Suite     // Catch: org.junit.runners.model.InitializationError -> La
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: org.junit.runners.model.InitializationError -> La
            r2 = 0
            r0.<init>(r2, r1)     // Catch: org.junit.runners.model.InitializationError -> La
            return r0
        La:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "This shouldn't be possible"
            r0.<init>(r1)
            throw r0
    }

    private static java.lang.Class<?>[] H(java.lang.Class<?> r3) throws org.junit.runners.model.InitializationError {
            java.lang.Class<org.junit.runners.Suite$SuiteClasses> r0 = org.junit.runners.Suite.SuiteClasses.class
            java.lang.annotation.Annotation r0 = r3.getAnnotation(r0)
            org.junit.runners.Suite$SuiteClasses r0 = (org.junit.runners.Suite.SuiteClasses) r0
            if (r0 == 0) goto Lf
            java.lang.Class[] r3 = r0.value()
            return r3
        Lf:
            org.junit.runners.model.InitializationError r0 = new org.junit.runners.model.InitializationError
            java.lang.String r3 = r3.getName()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.String r3 = "class '%s' must have a SuiteClasses annotation"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            r0.<init>(r3)
            throw r0
    }

    protected org.junit.runner.Description F(org.junit.runner.g r1) {
            r0 = this;
            org.junit.runner.Description r1 = r1.getDescription()
            return r1
    }

    protected void I(org.junit.runner.g r1, org.junit.runner.notification.a r2) {
            r0 = this;
            r1.a(r2)
            return
    }

    @Override // org.junit.runners.d
    protected /* bridge */ /* synthetic */ org.junit.runner.Description n(org.junit.runner.g r1) {
            r0 = this;
            org.junit.runner.g r1 = (org.junit.runner.g) r1
            org.junit.runner.Description r1 = r0.F(r1)
            return r1
    }

    @Override // org.junit.runners.d
    protected java.util.List<org.junit.runner.g> o() {
            r1 = this;
            java.util.List<org.junit.runner.g> r0 = r1.f
            return r0
    }

    @Override // org.junit.runners.d
    protected /* bridge */ /* synthetic */ void u(org.junit.runner.g r1, org.junit.runner.notification.a r2) {
            r0 = this;
            org.junit.runner.g r1 = (org.junit.runner.g) r1
            r0.I(r1, r2)
            return
    }
}
