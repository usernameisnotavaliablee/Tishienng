package org.junit.internal.runners.rules;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    public static final org.junit.internal.runners.rules.a d = null;
    public static final org.junit.internal.runners.rules.a e = null;
    public static final org.junit.internal.runners.rules.a f = null;
    public static final org.junit.internal.runners.rules.a g = null;
    private final java.lang.Class<? extends java.lang.annotation.Annotation> a;
    private final boolean b;
    private final java.util.List<org.junit.internal.runners.rules.a.k> c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: org.junit.internal.runners.rules.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0079a {
        public C0079a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b {
        private final java.lang.Class<? extends java.lang.annotation.Annotation> a;
        private boolean b;
        private final java.util.List<org.junit.internal.runners.rules.a.k> c;

        private b(java.lang.Class<? extends java.lang.annotation.Annotation> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r1 = 0
                r0.b = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.c = r1
                return
        }

        /* synthetic */ b(java.lang.Class r1, org.junit.internal.runners.rules.a.C0079a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ java.util.List a(org.junit.internal.runners.rules.a.b r0) {
                java.util.List<org.junit.internal.runners.rules.a$k> r0 = r0.c
                return r0
        }

        static /* synthetic */ java.lang.Class b(org.junit.internal.runners.rules.a.b r0) {
                java.lang.Class<? extends java.lang.annotation.Annotation> r0 = r0.a
                return r0
        }

        static /* synthetic */ boolean c(org.junit.internal.runners.rules.a.b r0) {
                boolean r0 = r0.b
                return r0
        }

        org.junit.internal.runners.rules.a d() {
                r1 = this;
                org.junit.internal.runners.rules.a r0 = new org.junit.internal.runners.rules.a
                r0.<init>(r1)
                return r0
        }

        org.junit.internal.runners.rules.a.b e() {
                r1 = this;
                r0 = 1
                r1.b = r0
                return r1
        }

        org.junit.internal.runners.rules.a.b f(org.junit.internal.runners.rules.a.k r2) {
                r1 = this;
                java.util.List<org.junit.internal.runners.rules.a$k> r0 = r1.c
                r0.add(r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class c implements org.junit.internal.runners.rules.a.k {
        private c() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ c(org.junit.internal.runners.rules.a.C0079a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private boolean b(org.junit.runners.model.c<?> r1) {
                r0 = this;
                java.lang.Class r1 = r1.a()
                int r1 = r1.getModifiers()
                boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
                return r1
        }

        @Override // org.junit.internal.runners.rules.a.k
        public void a(org.junit.runners.model.c<?> r3, java.lang.Class<? extends java.lang.annotation.Annotation> r4, java.util.List<java.lang.Throwable> r5) {
                r2 = this;
                boolean r0 = r2.b(r3)
                if (r0 != 0) goto L10
                org.junit.internal.runners.rules.b r0 = new org.junit.internal.runners.rules.b
                java.lang.String r1 = "must be declared in a public class."
                r0.<init>(r3, r4, r1)
                r5.add(r0)
            L10:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class d implements org.junit.internal.runners.rules.a.k {
        private d() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ d(org.junit.internal.runners.rules.a.C0079a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.junit.internal.runners.rules.a.k
        public void a(org.junit.runners.model.c<?> r3, java.lang.Class<? extends java.lang.annotation.Annotation> r4, java.util.List<java.lang.Throwable> r5) {
                r2 = this;
                boolean r0 = org.junit.internal.runners.rules.a.b(r3)
                if (r0 != 0) goto L10
                org.junit.internal.runners.rules.b r0 = new org.junit.internal.runners.rules.b
                java.lang.String r1 = "must implement MethodRule or TestRule."
                r0.<init>(r3, r4, r1)
                r5.add(r0)
            L10:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class e implements org.junit.internal.runners.rules.a.k {
        private e() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ e(org.junit.internal.runners.rules.a.C0079a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.junit.internal.runners.rules.a.k
        public void a(org.junit.runners.model.c<?> r3, java.lang.Class<? extends java.lang.annotation.Annotation> r4, java.util.List<java.lang.Throwable> r5) {
                r2 = this;
                boolean r0 = org.junit.internal.runners.rules.a.c(r3)
                if (r0 != 0) goto L10
                org.junit.internal.runners.rules.b r0 = new org.junit.internal.runners.rules.b
                java.lang.String r1 = "must implement TestRule."
                r0.<init>(r3, r4, r1)
                r5.add(r0)
            L10:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class f implements org.junit.internal.runners.rules.a.k {
        private f() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ f(org.junit.internal.runners.rules.a.C0079a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.junit.internal.runners.rules.a.k
        public void a(org.junit.runners.model.c<?> r4, java.lang.Class<? extends java.lang.annotation.Annotation> r5, java.util.List<java.lang.Throwable> r6) {
                r3 = this;
                boolean r0 = org.junit.internal.runners.rules.a.a(r4)
                java.lang.Class<org.junit.ClassRule> r1 = org.junit.ClassRule.class
                java.lang.annotation.Annotation r1 = r4.getAnnotation(r1)
                if (r1 == 0) goto Le
                r1 = 1
                goto Lf
            Le:
                r1 = 0
            Lf:
                boolean r2 = r4.g()
                if (r2 == 0) goto L2c
                if (r0 != 0) goto L19
                if (r1 != 0) goto L2c
            L19:
                boolean r0 = org.junit.internal.runners.rules.a.a(r4)
                if (r0 == 0) goto L22
                java.lang.String r0 = "must not be static."
                goto L24
            L22:
                java.lang.String r0 = "must not be static or it must be annotated with @ClassRule."
            L24:
                org.junit.internal.runners.rules.b r1 = new org.junit.internal.runners.rules.b
                r1.<init>(r4, r5, r0)
                r6.add(r1)
            L2c:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class g implements org.junit.internal.runners.rules.a.k {
        private g() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ g(org.junit.internal.runners.rules.a.C0079a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.junit.internal.runners.rules.a.k
        public void a(org.junit.runners.model.c<?> r3, java.lang.Class<? extends java.lang.annotation.Annotation> r4, java.util.List<java.lang.Throwable> r5) {
                r2 = this;
                boolean r0 = r3.d()
                if (r0 != 0) goto L10
                org.junit.internal.runners.rules.b r0 = new org.junit.internal.runners.rules.b
                java.lang.String r1 = "must be public."
                r0.<init>(r3, r4, r1)
                r5.add(r0)
            L10:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class h implements org.junit.internal.runners.rules.a.k {
        private h() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ h(org.junit.internal.runners.rules.a.C0079a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.junit.internal.runners.rules.a.k
        public void a(org.junit.runners.model.c<?> r3, java.lang.Class<? extends java.lang.annotation.Annotation> r4, java.util.List<java.lang.Throwable> r5) {
                r2 = this;
                boolean r0 = r3.g()
                if (r0 != 0) goto L10
                org.junit.internal.runners.rules.b r0 = new org.junit.internal.runners.rules.b
                java.lang.String r1 = "must be static."
                r0.<init>(r3, r4, r1)
                r5.add(r0)
            L10:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class i implements org.junit.internal.runners.rules.a.k {
        private i() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ i(org.junit.internal.runners.rules.a.C0079a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.junit.internal.runners.rules.a.k
        public void a(org.junit.runners.model.c<?> r3, java.lang.Class<? extends java.lang.annotation.Annotation> r4, java.util.List<java.lang.Throwable> r5) {
                r2 = this;
                boolean r0 = org.junit.internal.runners.rules.a.b(r3)
                if (r0 != 0) goto L10
                org.junit.internal.runners.rules.b r0 = new org.junit.internal.runners.rules.b
                java.lang.String r1 = "must return an implementation of MethodRule or TestRule."
                r0.<init>(r3, r4, r1)
                r5.add(r0)
            L10:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class j implements org.junit.internal.runners.rules.a.k {
        private j() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ j(org.junit.internal.runners.rules.a.C0079a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.junit.internal.runners.rules.a.k
        public void a(org.junit.runners.model.c<?> r3, java.lang.Class<? extends java.lang.annotation.Annotation> r4, java.util.List<java.lang.Throwable> r5) {
                r2 = this;
                boolean r0 = org.junit.internal.runners.rules.a.c(r3)
                if (r0 != 0) goto L10
                org.junit.internal.runners.rules.b r0 = new org.junit.internal.runners.rules.b
                java.lang.String r1 = "must return an implementation of TestRule."
                r0.<init>(r3, r4, r1)
                r5.add(r0)
            L10:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface k {
        void a(org.junit.runners.model.c<?> r1, java.lang.Class<? extends java.lang.annotation.Annotation> r2, java.util.List<java.lang.Throwable> r3);
    }

    static {
            org.junit.internal.runners.rules.a$b r0 = d()
            org.junit.internal.runners.rules.a$c r1 = new org.junit.internal.runners.rules.a$c
            r2 = 0
            r1.<init>(r2)
            org.junit.internal.runners.rules.a$b r0 = r0.f(r1)
            org.junit.internal.runners.rules.a$h r1 = new org.junit.internal.runners.rules.a$h
            r1.<init>(r2)
            org.junit.internal.runners.rules.a$b r0 = r0.f(r1)
            org.junit.internal.runners.rules.a$g r1 = new org.junit.internal.runners.rules.a$g
            r1.<init>(r2)
            org.junit.internal.runners.rules.a$b r0 = r0.f(r1)
            org.junit.internal.runners.rules.a$e r1 = new org.junit.internal.runners.rules.a$e
            r1.<init>(r2)
            org.junit.internal.runners.rules.a$b r0 = r0.f(r1)
            org.junit.internal.runners.rules.a r0 = r0.d()
            org.junit.internal.runners.rules.a.d = r0
            org.junit.internal.runners.rules.a$b r0 = h()
            org.junit.internal.runners.rules.a$f r1 = new org.junit.internal.runners.rules.a$f
            r1.<init>(r2)
            org.junit.internal.runners.rules.a$b r0 = r0.f(r1)
            org.junit.internal.runners.rules.a$g r1 = new org.junit.internal.runners.rules.a$g
            r1.<init>(r2)
            org.junit.internal.runners.rules.a$b r0 = r0.f(r1)
            org.junit.internal.runners.rules.a$d r1 = new org.junit.internal.runners.rules.a$d
            r1.<init>(r2)
            org.junit.internal.runners.rules.a$b r0 = r0.f(r1)
            org.junit.internal.runners.rules.a r0 = r0.d()
            org.junit.internal.runners.rules.a.e = r0
            org.junit.internal.runners.rules.a$b r0 = d()
            org.junit.internal.runners.rules.a$b r0 = r0.e()
            org.junit.internal.runners.rules.a$c r1 = new org.junit.internal.runners.rules.a$c
            r1.<init>(r2)
            org.junit.internal.runners.rules.a$b r0 = r0.f(r1)
            org.junit.internal.runners.rules.a$h r1 = new org.junit.internal.runners.rules.a$h
            r1.<init>(r2)
            org.junit.internal.runners.rules.a$b r0 = r0.f(r1)
            org.junit.internal.runners.rules.a$g r1 = new org.junit.internal.runners.rules.a$g
            r1.<init>(r2)
            org.junit.internal.runners.rules.a$b r0 = r0.f(r1)
            org.junit.internal.runners.rules.a$j r1 = new org.junit.internal.runners.rules.a$j
            r1.<init>(r2)
            org.junit.internal.runners.rules.a$b r0 = r0.f(r1)
            org.junit.internal.runners.rules.a r0 = r0.d()
            org.junit.internal.runners.rules.a.f = r0
            org.junit.internal.runners.rules.a$b r0 = h()
            org.junit.internal.runners.rules.a$b r0 = r0.e()
            org.junit.internal.runners.rules.a$f r1 = new org.junit.internal.runners.rules.a$f
            r1.<init>(r2)
            org.junit.internal.runners.rules.a$b r0 = r0.f(r1)
            org.junit.internal.runners.rules.a$g r1 = new org.junit.internal.runners.rules.a$g
            r1.<init>(r2)
            org.junit.internal.runners.rules.a$b r0 = r0.f(r1)
            org.junit.internal.runners.rules.a$i r1 = new org.junit.internal.runners.rules.a$i
            r1.<init>(r2)
            org.junit.internal.runners.rules.a$b r0 = r0.f(r1)
            org.junit.internal.runners.rules.a r0 = r0.d()
            org.junit.internal.runners.rules.a.g = r0
            return
    }

    a(org.junit.internal.runners.rules.a.b r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class r0 = org.junit.internal.runners.rules.a.b.b(r2)
            r1.a = r0
            boolean r0 = org.junit.internal.runners.rules.a.b.c(r2)
            r1.b = r0
            java.util.List r2 = org.junit.internal.runners.rules.a.b.a(r2)
            r1.c = r2
            return
    }

    static /* synthetic */ boolean a(org.junit.runners.model.c r0) {
            boolean r0 = e(r0)
            return r0
    }

    static /* synthetic */ boolean b(org.junit.runners.model.c r0) {
            boolean r0 = f(r0)
            return r0
    }

    static /* synthetic */ boolean c(org.junit.runners.model.c r0) {
            boolean r0 = g(r0)
            return r0
    }

    private static org.junit.internal.runners.rules.a.b d() {
            org.junit.internal.runners.rules.a$b r0 = new org.junit.internal.runners.rules.a$b
            java.lang.Class<org.junit.ClassRule> r1 = org.junit.ClassRule.class
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    private static boolean e(org.junit.runners.model.c<?> r1) {
            java.lang.Class<org.junit.rules.f> r0 = org.junit.rules.f.class
            java.lang.Class r1 = r1.getType()
            boolean r1 = r0.isAssignableFrom(r1)
            return r1
    }

    private static boolean f(org.junit.runners.model.c<?> r1) {
            boolean r0 = e(r1)
            if (r0 != 0) goto Lf
            boolean r1 = g(r1)
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    private static boolean g(org.junit.runners.model.c<?> r1) {
            java.lang.Class<org.junit.rules.l> r0 = org.junit.rules.l.class
            java.lang.Class r1 = r1.getType()
            boolean r1 = r0.isAssignableFrom(r1)
            return r1
    }

    private static org.junit.internal.runners.rules.a.b h() {
            org.junit.internal.runners.rules.a$b r0 = new org.junit.internal.runners.rules.a$b
            java.lang.Class<org.junit.Rule> r1 = org.junit.Rule.class
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    private void j(org.junit.runners.model.c<?> r4, java.util.List<java.lang.Throwable> r5) {
            r3 = this;
            java.util.List<org.junit.internal.runners.rules.a$k> r0 = r3.c
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            org.junit.internal.runners.rules.a$k r1 = (org.junit.internal.runners.rules.a.k) r1
            java.lang.Class<? extends java.lang.annotation.Annotation> r2 = r3.a
            r1.a(r4, r2, r5)
            goto L6
        L18:
            return
    }

    public void i(org.junit.runners.model.i r2, java.util.List<java.lang.Throwable> r3) {
            r1 = this;
            boolean r0 = r1.b
            if (r0 == 0) goto Lb
            java.lang.Class<? extends java.lang.annotation.Annotation> r0 = r1.a
            java.util.List r2 = r2.i(r0)
            goto L11
        Lb:
            java.lang.Class<? extends java.lang.annotation.Annotation> r0 = r1.a
            java.util.List r2 = r2.e(r0)
        L11:
            java.util.Iterator r2 = r2.iterator()
        L15:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r2.next()
            org.junit.runners.model.c r0 = (org.junit.runners.model.c) r0
            r1.j(r0, r3)
            goto L15
        L25:
            return
    }
}
