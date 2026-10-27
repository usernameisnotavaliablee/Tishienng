package junit.framework;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class c implements junit.framework.f, org.junit.runner.manipulation.b, org.junit.runner.manipulation.c, org.junit.runner.b {
    private final java.lang.Class<?> a;
    private final org.junit.runner.g b;
    private final junit.framework.JUnit4TestAdapterCache c;

    public c(java.lang.Class<?> r2) {
            r1 = this;
            junit.framework.JUnit4TestAdapterCache r0 = junit.framework.JUnit4TestAdapterCache.getDefault()
            r1.<init>(r2, r0)
            return
    }

    public c(java.lang.Class<?> r1, junit.framework.JUnit4TestAdapterCache r2) {
            r0 = this;
            r0.<init>()
            r0.c = r2
            r0.a = r1
            org.junit.runner.f r1 = org.junit.runner.f.b(r1)
            org.junit.runner.g r1 = r1.h()
            r0.b = r1
            return
    }

    private boolean g(org.junit.runner.Description r2) {
            r1 = this;
            java.lang.Class<org.junit.Ignore> r0 = org.junit.Ignore.class
            java.lang.annotation.Annotation r2 = r2.getAnnotation(r0)
            if (r2 == 0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    private org.junit.runner.Description h(org.junit.runner.Description r4) {
            r3 = this;
            boolean r0 = r3.g(r4)
            if (r0 == 0) goto L9
            org.junit.runner.Description r4 = org.junit.runner.Description.EMPTY
            return r4
        L9:
            org.junit.runner.Description r0 = r4.childlessCopy()
            java.util.ArrayList r4 = r4.getChildren()
            java.util.Iterator r4 = r4.iterator()
        L15:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r4.next()
            org.junit.runner.Description r1 = (org.junit.runner.Description) r1
            org.junit.runner.Description r1 = r3.h(r1)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L15
            r0.addChild(r1)
            goto L15
        L2f:
            return r0
    }

    @Override // junit.framework.f
    public void a(junit.framework.j r3) {
            r2 = this;
            org.junit.runner.g r0 = r2.b
            junit.framework.JUnit4TestAdapterCache r1 = r2.c
            org.junit.runner.notification.a r3 = r1.getNotifier(r3, r2)
            r0.a(r3)
            return
    }

    public void b(org.junit.runner.manipulation.a r2) throws org.junit.runner.manipulation.NoTestsRemainException {
            r1 = this;
            org.junit.runner.g r0 = r1.b
            r2.a(r0)
            return
    }

    @Override // junit.framework.f
    public int c() {
            r1 = this;
            org.junit.runner.g r0 = r1.b
            int r0 = r0.c()
            return r0
    }

    public void d(org.junit.runner.manipulation.d r2) {
            r1 = this;
            org.junit.runner.g r0 = r1.b
            r2.a(r0)
            return
    }

    public java.lang.Class<?> e() {
            r1 = this;
            java.lang.Class<?> r0 = r1.a
            return r0
    }

    public java.util.List<junit.framework.f> f() {
            r2 = this;
            junit.framework.JUnit4TestAdapterCache r0 = r2.c
            org.junit.runner.Description r1 = r2.getDescription()
            java.util.List r0 = r0.asTestList(r1)
            return r0
    }

    public org.junit.runner.Description getDescription() {
            r1 = this;
            org.junit.runner.g r0 = r1.b
            org.junit.runner.Description r0 = r0.getDescription()
            org.junit.runner.Description r0 = r1.h(r0)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.Class<?> r0 = r1.a
            java.lang.String r0 = r0.getName()
            return r0
    }
}
