package org.junit.internal.runners;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d extends org.junit.runner.g implements org.junit.runner.manipulation.b, org.junit.runner.manipulation.c {
    private volatile junit.framework.f a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b implements junit.framework.i {
        private final org.junit.runner.notification.a a;

        private b(org.junit.runner.notification.a r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        /* synthetic */ b(org.junit.runner.notification.a r1, org.junit.internal.runners.d.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private org.junit.runner.Description e(junit.framework.f r2) {
                r1 = this;
                boolean r0 = r2 instanceof org.junit.runner.b
                if (r0 == 0) goto Lb
                org.junit.runner.b r2 = (org.junit.runner.b) r2
                org.junit.runner.Description r2 = r2.getDescription()
                return r2
            Lb:
                java.lang.Class r0 = r1.f(r2)
                java.lang.String r2 = r1.g(r2)
                org.junit.runner.Description r2 = org.junit.runner.Description.createTestDescription(r0, r2)
                return r2
        }

        private java.lang.Class<? extends junit.framework.f> f(junit.framework.f r1) {
                r0 = this;
                java.lang.Class r1 = r1.getClass()
                return r1
        }

        private java.lang.String g(junit.framework.f r2) {
                r1 = this;
                boolean r0 = r2 instanceof junit.framework.g
                if (r0 == 0) goto Lb
                junit.framework.g r2 = (junit.framework.g) r2
                java.lang.String r2 = r2.P()
                return r2
            Lb:
                java.lang.String r2 = r2.toString()
                return r2
        }

        public void a(junit.framework.f r2, java.lang.Throwable r3) {
                r1 = this;
                org.junit.runner.notification.Failure r0 = new org.junit.runner.notification.Failure
                org.junit.runner.Description r2 = r1.e(r2)
                r0.<init>(r2, r3)
                org.junit.runner.notification.a r2 = r1.a
                r2.f(r0)
                return
        }

        public void b(junit.framework.f r1, junit.framework.AssertionFailedError r2) {
                r0 = this;
                r0.a(r1, r2)
                return
        }

        public void c(junit.framework.f r2) {
                r1 = this;
                org.junit.runner.notification.a r0 = r1.a
                org.junit.runner.Description r2 = r1.e(r2)
                r0.h(r2)
                return
        }

        public void d(junit.framework.f r2) {
                r1 = this;
                org.junit.runner.notification.a r0 = r1.a
                org.junit.runner.Description r2 = r1.e(r2)
                r0.l(r2)
                return
        }
    }

    public d(java.lang.Class<?> r3) {
            r2 = this;
            junit.framework.k r0 = new junit.framework.k
            java.lang.Class<junit.framework.g> r1 = junit.framework.g.class
            java.lang.Class r3 = r3.asSubclass(r1)
            r0.<init>(r3)
            r2.<init>(r0)
            return
    }

    public d(junit.framework.f r1) {
            r0 = this;
            r0.<init>()
            r0.j(r1)
            return
    }

    private static java.lang.String f(junit.framework.k r4) {
            int r0 = r4.c()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto Lb
            java.lang.String r4 = ""
            goto L19
        Lb:
            junit.framework.f r4 = r4.o(r2)
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r3[r2] = r4
            java.lang.String r4 = " [example: %s]"
            java.lang.String r4 = java.lang.String.format(r4, r3)
        L19:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r0
            r3[r1] = r4
            java.lang.String r4 = "TestSuite with %s tests%s"
            java.lang.String r4 = java.lang.String.format(r4, r3)
            return r4
    }

    private static java.lang.annotation.Annotation[] g(junit.framework.g r2) {
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = r2.P()     // Catch: java.lang.Throwable -> L12
            r1 = 0
            java.lang.reflect.Method r2 = r0.getMethod(r2, r1)     // Catch: java.lang.Throwable -> L12
            java.lang.annotation.Annotation[] r2 = r2.getDeclaredAnnotations()     // Catch: java.lang.Throwable -> L12
            return r2
        L12:
            r2 = 0
            java.lang.annotation.Annotation[] r2 = new java.lang.annotation.Annotation[r2]
            return r2
    }

    private junit.framework.f h() {
            r1 = this;
            junit.framework.f r0 = r1.a
            return r0
    }

    private static org.junit.runner.Description i(junit.framework.f r4) {
            boolean r0 = r4 instanceof junit.framework.g
            if (r0 == 0) goto L17
            junit.framework.g r4 = (junit.framework.g) r4
            java.lang.Class r0 = r4.getClass()
            java.lang.String r1 = r4.P()
            java.lang.annotation.Annotation[] r4 = g(r4)
            org.junit.runner.Description r4 = org.junit.runner.Description.createTestDescription(r0, r1, r4)
            return r4
        L17:
            boolean r0 = r4 instanceof junit.framework.k
            if (r0 == 0) goto L48
            junit.framework.k r4 = (junit.framework.k) r4
            java.lang.String r0 = r4.i()
            if (r0 != 0) goto L28
            java.lang.String r0 = f(r4)
            goto L2c
        L28:
            java.lang.String r0 = r4.i()
        L2c:
            r1 = 0
            java.lang.annotation.Annotation[] r2 = new java.lang.annotation.Annotation[r1]
            org.junit.runner.Description r0 = org.junit.runner.Description.createSuiteDescription(r0, r2)
            int r2 = r4.q()
        L37:
            if (r1 >= r2) goto L47
            junit.framework.f r3 = r4.o(r1)
            org.junit.runner.Description r3 = i(r3)
            r0.addChild(r3)
            int r1 = r1 + 1
            goto L37
        L47:
            return r0
        L48:
            boolean r0 = r4 instanceof org.junit.runner.b
            if (r0 == 0) goto L53
            org.junit.runner.b r4 = (org.junit.runner.b) r4
            org.junit.runner.Description r4 = r4.getDescription()
            return r4
        L53:
            boolean r0 = r4 instanceof junit.extensions.c
            if (r0 == 0) goto L62
            junit.extensions.c r4 = (junit.extensions.c) r4
            junit.framework.f r4 = r4.P()
            org.junit.runner.Description r4 = i(r4)
            return r4
        L62:
            java.lang.Class r4 = r4.getClass()
            org.junit.runner.Description r4 = org.junit.runner.Description.createSuiteDescription(r4)
            return r4
    }

    private void j(junit.framework.f r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // org.junit.runner.g
    public void a(org.junit.runner.notification.a r2) {
            r1 = this;
            junit.framework.j r0 = new junit.framework.j
            r0.<init>()
            junit.framework.i r2 = r1.e(r2)
            r0.c(r2)
            junit.framework.f r2 = r1.h()
            r2.a(r0)
            return
    }

    @Override // org.junit.runner.manipulation.b
    public void b(org.junit.runner.manipulation.a r7) throws org.junit.runner.manipulation.NoTestsRemainException {
            r6 = this;
            junit.framework.f r0 = r6.h()
            boolean r0 = r0 instanceof org.junit.runner.manipulation.b
            if (r0 == 0) goto L12
            junit.framework.f r0 = r6.h()
            org.junit.runner.manipulation.b r0 = (org.junit.runner.manipulation.b) r0
            r0.b(r7)
            return
        L12:
            junit.framework.f r0 = r6.h()
            boolean r0 = r0 instanceof junit.framework.k
            if (r0 == 0) goto L54
            junit.framework.f r0 = r6.h()
            junit.framework.k r0 = (junit.framework.k) r0
            junit.framework.k r1 = new junit.framework.k
            java.lang.String r2 = r0.i()
            r1.<init>(r2)
            int r2 = r0.q()
            r3 = 0
        L2e:
            if (r3 >= r2) goto L44
            junit.framework.f r4 = r0.o(r3)
            org.junit.runner.Description r5 = i(r4)
            boolean r5 = r7.e(r5)
            if (r5 == 0) goto L41
            r1.b(r4)
        L41:
            int r3 = r3 + 1
            goto L2e
        L44:
            r6.j(r1)
            int r7 = r1.q()
            if (r7 == 0) goto L4e
            goto L54
        L4e:
            org.junit.runner.manipulation.NoTestsRemainException r7 = new org.junit.runner.manipulation.NoTestsRemainException
            r7.<init>()
            throw r7
        L54:
            return
    }

    @Override // org.junit.runner.manipulation.c
    public void d(org.junit.runner.manipulation.d r2) {
            r1 = this;
            junit.framework.f r0 = r1.h()
            boolean r0 = r0 instanceof org.junit.runner.manipulation.c
            if (r0 == 0) goto L11
            junit.framework.f r0 = r1.h()
            org.junit.runner.manipulation.c r0 = (org.junit.runner.manipulation.c) r0
            r0.d(r2)
        L11:
            return
    }

    public junit.framework.i e(org.junit.runner.notification.a r3) {
            r2 = this;
            org.junit.internal.runners.d$b r0 = new org.junit.internal.runners.d$b
            r1 = 0
            r0.<init>(r3, r1)
            return r0
    }

    @Override // org.junit.runner.g, org.junit.runner.b
    public org.junit.runner.Description getDescription() {
            r1 = this;
            junit.framework.f r0 = r1.h()
            org.junit.runner.Description r0 = i(r0)
            return r0
    }
}
