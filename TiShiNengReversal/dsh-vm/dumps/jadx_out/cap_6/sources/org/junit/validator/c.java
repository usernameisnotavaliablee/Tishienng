package org.junit.validator;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class c implements org.junit.validator.e {
    private static final java.util.List<org.junit.validator.c.b<?>> a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static abstract class b<T extends org.junit.runners.model.a> {
        private static final org.junit.validator.b a = null;

        static {
                org.junit.validator.b r0 = new org.junit.validator.b
                r0.<init>()
                org.junit.validator.c.b.a = r0
                return
        }

        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ b(org.junit.validator.c.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private java.util.List<java.lang.Exception> b(T r7) {
                r6 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.lang.annotation.Annotation[] r1 = r7.getAnnotations()
                int r2 = r1.length
                r3 = 0
            Lb:
                if (r3 >= r2) goto L2d
                r4 = r1[r3]
                java.lang.Class r4 = r4.annotationType()
                java.lang.Class<org.junit.validator.ValidateWith> r5 = org.junit.validator.ValidateWith.class
                java.lang.annotation.Annotation r4 = r4.getAnnotation(r5)
                org.junit.validator.ValidateWith r4 = (org.junit.validator.ValidateWith) r4
                if (r4 == 0) goto L2a
                org.junit.validator.b r5 = org.junit.validator.c.b.a
                org.junit.validator.a r4 = r5.a(r4)
                java.util.List r4 = r6.c(r4, r7)
                r0.addAll(r4)
            L2a:
                int r3 = r3 + 1
                goto Lb
            L2d:
                return r0
        }

        abstract java.lang.Iterable<T> a(org.junit.runners.model.i r1);

        abstract java.util.List<java.lang.Exception> c(org.junit.validator.a r1, T r2);

        public java.util.List<java.lang.Exception> d(org.junit.runners.model.i r3) {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.lang.Iterable r3 = r2.a(r3)
                java.util.Iterator r3 = r3.iterator()
            Ld:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L21
                java.lang.Object r1 = r3.next()
                org.junit.runners.model.a r1 = (org.junit.runners.model.a) r1
                java.util.List r1 = r2.b(r1)
                r0.addAll(r1)
                goto Ld
            L21:
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: org.junit.validator.c$c, reason: collision with other inner class name */
    private static class C0085c extends org.junit.validator.c.b<org.junit.runners.model.i> {
        private C0085c() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ C0085c(org.junit.validator.c.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.junit.validator.c.b
        java.lang.Iterable<org.junit.runners.model.i> a(org.junit.runners.model.i r1) {
                r0 = this;
                java.util.List r1 = java.util.Collections.singletonList(r1)
                return r1
        }

        @Override // org.junit.validator.c.b
        /* bridge */ /* synthetic */ java.util.List c(org.junit.validator.a r1, org.junit.runners.model.i r2) {
                r0 = this;
                org.junit.runners.model.i r2 = (org.junit.runners.model.i) r2
                java.util.List r1 = r0.e(r1, r2)
                return r1
        }

        java.util.List<java.lang.Exception> e(org.junit.validator.a r1, org.junit.runners.model.i r2) {
                r0 = this;
                java.util.List r1 = r1.a(r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class d extends org.junit.validator.c.b<org.junit.runners.model.b> {
        private d() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ d(org.junit.validator.c.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.junit.validator.c.b
        java.lang.Iterable<org.junit.runners.model.b> a(org.junit.runners.model.i r1) {
                r0 = this;
                java.util.List r1 = r1.d()
                return r1
        }

        @Override // org.junit.validator.c.b
        /* bridge */ /* synthetic */ java.util.List c(org.junit.validator.a r1, org.junit.runners.model.b r2) {
                r0 = this;
                org.junit.runners.model.b r2 = (org.junit.runners.model.b) r2
                java.util.List r1 = r0.e(r1, r2)
                return r1
        }

        java.util.List<java.lang.Exception> e(org.junit.validator.a r1, org.junit.runners.model.b r2) {
                r0 = this;
                java.util.List r1 = r1.b(r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class e extends org.junit.validator.c.b<org.junit.runners.model.d> {
        private e() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ e(org.junit.validator.c.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.junit.validator.c.b
        java.lang.Iterable<org.junit.runners.model.d> a(org.junit.runners.model.i r1) {
                r0 = this;
                java.util.List r1 = r1.h()
                return r1
        }

        @Override // org.junit.validator.c.b
        /* bridge */ /* synthetic */ java.util.List c(org.junit.validator.a r1, org.junit.runners.model.d r2) {
                r0 = this;
                org.junit.runners.model.d r2 = (org.junit.runners.model.d) r2
                java.util.List r1 = r0.e(r1, r2)
                return r1
        }

        java.util.List<java.lang.Exception> e(org.junit.validator.a r1, org.junit.runners.model.d r2) {
                r0 = this;
                java.util.List r1 = r1.c(r2)
                return r1
        }
    }

    static {
            org.junit.validator.c$c r0 = new org.junit.validator.c$c
            r1 = 0
            r0.<init>(r1)
            org.junit.validator.c$e r2 = new org.junit.validator.c$e
            r2.<init>(r1)
            org.junit.validator.c$d r3 = new org.junit.validator.c$d
            r3.<init>(r1)
            r1 = 3
            org.junit.validator.c$b[] r1 = new org.junit.validator.c.b[r1]
            r4 = 0
            r1[r4] = r0
            r0 = 1
            r1[r0] = r2
            r0 = 2
            r1[r0] = r3
            java.util.List r0 = java.util.Arrays.asList(r1)
            org.junit.validator.c.a = r0
            return
    }

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.junit.validator.e
    public java.util.List<java.lang.Exception> a(org.junit.runners.model.i r4) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<org.junit.validator.c$b<?>> r1 = org.junit.validator.c.a
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()
            org.junit.validator.c$b r2 = (org.junit.validator.c.b) r2
            java.util.List r2 = r2.d(r4)
            r0.addAll(r2)
            goto Lb
        L1f:
            return r0
    }
}
