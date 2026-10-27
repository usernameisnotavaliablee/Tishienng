package org.junit.experimental.max;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    private static final java.lang.String b = "malformed JUnit 3 test class: ";
    private final org.junit.experimental.max.MaxHistory a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: org.junit.experimental.max.a$a, reason: collision with other inner class name */
    class C0072a extends org.junit.runner.f {
        final /* synthetic */ java.util.List a;
        final /* synthetic */ org.junit.experimental.max.a b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: org.junit.experimental.max.a$a$a, reason: collision with other inner class name */
        class C0073a extends org.junit.runners.Suite {
            final /* synthetic */ org.junit.experimental.max.a.C0072a g;

            C0073a(org.junit.experimental.max.a.C0072a r1, java.lang.Class r2, java.util.List r3) throws org.junit.runners.model.InitializationError {
                    r0 = this;
                    r0.g = r1
                    r0.<init>(r2, r3)
                    return
            }
        }

        C0072a(org.junit.experimental.max.a r1, java.util.List r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // org.junit.runner.f
        public org.junit.runner.g h() {
                r3 = this;
                r0 = 0
                org.junit.experimental.max.a$a$a r1 = new org.junit.experimental.max.a$a$a     // Catch: org.junit.runners.model.InitializationError -> L9
                java.util.List r2 = r3.a     // Catch: org.junit.runners.model.InitializationError -> L9
                r1.<init>(r3, r0, r2)     // Catch: org.junit.runners.model.InitializationError -> L9
                return r1
            L9:
                r1 = move-exception
                org.junit.internal.runners.b r2 = new org.junit.internal.runners.b
                r2.<init>(r0, r1)
                return r2
        }
    }

    private a(java.io.File r1) {
            r0 = this;
            r0.<init>()
            org.junit.experimental.max.MaxHistory r1 = org.junit.experimental.max.MaxHistory.forFolder(r1)
            r0.a = r1
            return
    }

    private org.junit.runner.g a(org.junit.runner.Description r4) {
            r3 = this;
            java.lang.String r0 = r4.toString()
            java.lang.String r1 = "TestSuite with 0 tests"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L11
            org.junit.runner.g r4 = org.junit.runners.Suite.G()
            return r4
        L11:
            java.lang.String r0 = r4.toString()
            java.lang.String r1 = "malformed JUnit 3 test class: "
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L2c
            org.junit.internal.runners.d r0 = new org.junit.internal.runners.d
            junit.framework.k r1 = new junit.framework.k
            java.lang.Class r4 = r3.f(r4)
            r1.<init>(r4)
            r0.<init>(r1)
            return r0
        L2c:
            java.lang.Class r0 = r4.getTestClass()
            if (r0 == 0) goto L4a
            java.lang.String r4 = r4.getMethodName()
            if (r4 != 0) goto L41
            org.junit.runner.f r4 = org.junit.runner.f.a(r0)
            org.junit.runner.g r4 = r4.h()
            return r4
        L41:
            org.junit.runner.f r4 = org.junit.runner.f.i(r0, r4)
            org.junit.runner.g r4 = r4.h()
            return r4
        L4a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Can't build a runner from description ["
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "]"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private org.junit.runner.f b(java.util.List<org.junit.runner.Description> r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r3.next()
            org.junit.runner.Description r1 = (org.junit.runner.Description) r1
            org.junit.runner.g r1 = r2.a(r1)
            r0.add(r1)
            goto L9
        L1d:
            org.junit.experimental.max.a$a r3 = new org.junit.experimental.max.a$a
            r3.<init>(r2, r0)
            return r3
    }

    private java.util.List<org.junit.runner.Description> c(org.junit.runner.f r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.junit.runner.g r3 = r3.h()
            org.junit.runner.Description r3 = r3.getDescription()
            r1 = 0
            r2.d(r1, r3, r0)
            return r0
    }

    private void d(org.junit.runner.Description r3, org.junit.runner.Description r4, java.util.List<org.junit.runner.Description> r5) {
            r2 = this;
            java.util.ArrayList r0 = r4.getChildren()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L36
            java.lang.String r0 = r4.toString()
            java.lang.String r1 = "warning(junit.framework.TestSuite$1)"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L32
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "malformed JUnit 3 test class: "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r4 = 0
            java.lang.annotation.Annotation[] r4 = new java.lang.annotation.Annotation[r4]
            org.junit.runner.Description r3 = org.junit.runner.Description.createSuiteDescription(r3, r4)
            r5.add(r3)
            return
        L32:
            r5.add(r4)
            return
        L36:
            java.util.ArrayList r3 = r4.getChildren()
            java.util.Iterator r3 = r3.iterator()
        L3e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r3.next()
            org.junit.runner.Description r0 = (org.junit.runner.Description) r0
            r2.d(r4, r0, r5)
            goto L3e
        L4e:
            return
    }

    @java.lang.Deprecated
    public static org.junit.experimental.max.a e(java.lang.String r1) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            org.junit.experimental.max.a r1 = l(r0)
            return r1
    }

    private java.lang.Class<?> f(org.junit.runner.Description r3) {
            r2 = this;
            java.lang.String r3 = r3.toString()     // Catch: java.lang.ClassNotFoundException -> L11
            java.lang.String r0 = "malformed JUnit 3 test class: "
            java.lang.String r1 = ""
            java.lang.String r3 = r3.replace(r0, r1)     // Catch: java.lang.ClassNotFoundException -> L11
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L11
            return r3
        L11:
            r3 = 0
            return r3
    }

    public static org.junit.experimental.max.a l(java.io.File r1) {
            org.junit.experimental.max.a r0 = new org.junit.experimental.max.a
            r0.<init>(r1)
            return r0
    }

    public org.junit.runner.Result g(java.lang.Class<?> r1) {
            r0 = this;
            org.junit.runner.f r1 = org.junit.runner.f.a(r1)
            org.junit.runner.Result r1 = r0.h(r1)
            return r1
    }

    public org.junit.runner.Result h(org.junit.runner.f r2) {
            r1 = this;
            org.junit.runner.e r0 = new org.junit.runner.e
            r0.<init>()
            org.junit.runner.Result r2 = r1.i(r2, r0)
            return r2
    }

    public org.junit.runner.Result i(org.junit.runner.f r2, org.junit.runner.e r3) {
            r1 = this;
            org.junit.experimental.max.MaxHistory r0 = r1.a
            org.junit.runner.notification.RunListener r0 = r0.listener()
            r3.a(r0)
            org.junit.runner.f r2 = r1.j(r2)
            org.junit.runner.g r2 = r2.h()
            org.junit.runner.Result r2 = r3.i(r2)
            return r2
    }

    public org.junit.runner.f j(org.junit.runner.f r2) {
            r1 = this;
            boolean r0 = r2 instanceof g5.c
            if (r0 == 0) goto L5
            return r2
        L5:
            java.util.List r2 = r1.c(r2)
            org.junit.experimental.max.MaxHistory r0 = r1.a
            java.util.Comparator r0 = r0.testComparator()
            java.util.Collections.sort(r2, r0)
            org.junit.runner.f r2 = r1.b(r2)
            return r2
    }

    public java.util.List<org.junit.runner.Description> k(org.junit.runner.f r1) {
            r0 = this;
            org.junit.runner.f r1 = r0.j(r1)
            java.util.List r1 = r0.c(r1)
            return r1
    }
}
