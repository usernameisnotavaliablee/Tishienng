package org.junit.runner.notification;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    private final java.util.List<org.junit.runner.notification.RunListener> a;
    private volatile boolean b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: org.junit.runner.notification.a$a, reason: collision with other inner class name */
    class C0083a extends org.junit.runner.notification.a.h {
        final /* synthetic */ org.junit.runner.Description c;
        final /* synthetic */ org.junit.runner.notification.a d;

        C0083a(org.junit.runner.notification.a r1, org.junit.runner.Description r2) throws java.lang.Exception {
                r0 = this;
                r0.d = r1
                r0.c = r2
                r0.<init>(r1)
                return
        }

        @Override // org.junit.runner.notification.a.h
        protected void a(org.junit.runner.notification.RunListener r2) throws java.lang.Exception {
                r1 = this;
                org.junit.runner.Description r0 = r1.c
                r2.f(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends org.junit.runner.notification.a.h {
        final /* synthetic */ org.junit.runner.Result c;
        final /* synthetic */ org.junit.runner.notification.a d;

        b(org.junit.runner.notification.a r1, org.junit.runner.Result r2) throws java.lang.Exception {
                r0 = this;
                r0.d = r1
                r0.c = r2
                r0.<init>(r1)
                return
        }

        @Override // org.junit.runner.notification.a.h
        protected void a(org.junit.runner.notification.RunListener r2) throws java.lang.Exception {
                r1 = this;
                org.junit.runner.Result r0 = r1.c
                r2.e(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends org.junit.runner.notification.a.h {
        final /* synthetic */ org.junit.runner.Description c;
        final /* synthetic */ org.junit.runner.notification.a d;

        c(org.junit.runner.notification.a r1, org.junit.runner.Description r2) throws java.lang.Exception {
                r0 = this;
                r0.d = r1
                r0.c = r2
                r0.<init>(r1)
                return
        }

        @Override // org.junit.runner.notification.a.h
        protected void a(org.junit.runner.notification.RunListener r2) throws java.lang.Exception {
                r1 = this;
                org.junit.runner.Description r0 = r1.c
                r2.g(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends org.junit.runner.notification.a.h {
        final /* synthetic */ java.util.List c;
        final /* synthetic */ org.junit.runner.notification.a d;

        d(org.junit.runner.notification.a r1, java.util.List r2, java.util.List r3) throws java.lang.Exception {
                r0 = this;
                r0.d = r1
                r0.c = r3
                r0.<init>(r1, r2)
                return
        }

        @Override // org.junit.runner.notification.a.h
        protected void a(org.junit.runner.notification.RunListener r3) throws java.lang.Exception {
                r2 = this;
                java.util.List r0 = r2.c
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                org.junit.runner.notification.Failure r1 = (org.junit.runner.notification.Failure) r1
                r3.b(r1)
                goto L6
            L16:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends org.junit.runner.notification.a.h {
        final /* synthetic */ org.junit.runner.notification.Failure c;
        final /* synthetic */ org.junit.runner.notification.a d;

        e(org.junit.runner.notification.a r1, org.junit.runner.notification.Failure r2) {
                r0 = this;
                r0.d = r1
                r0.c = r2
                r0.<init>(r1)
                return
        }

        @Override // org.junit.runner.notification.a.h
        protected void a(org.junit.runner.notification.RunListener r2) throws java.lang.Exception {
                r1 = this;
                org.junit.runner.notification.Failure r0 = r1.c
                r2.a(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f extends org.junit.runner.notification.a.h {
        final /* synthetic */ org.junit.runner.Description c;
        final /* synthetic */ org.junit.runner.notification.a d;

        f(org.junit.runner.notification.a r1, org.junit.runner.Description r2) throws java.lang.Exception {
                r0 = this;
                r0.d = r1
                r0.c = r2
                r0.<init>(r1)
                return
        }

        @Override // org.junit.runner.notification.a.h
        protected void a(org.junit.runner.notification.RunListener r2) throws java.lang.Exception {
                r1 = this;
                org.junit.runner.Description r0 = r1.c
                r2.d(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g extends org.junit.runner.notification.a.h {
        final /* synthetic */ org.junit.runner.Description c;
        final /* synthetic */ org.junit.runner.notification.a d;

        g(org.junit.runner.notification.a r1, org.junit.runner.Description r2) throws java.lang.Exception {
                r0 = this;
                r0.d = r1
                r0.c = r2
                r0.<init>(r1)
                return
        }

        @Override // org.junit.runner.notification.a.h
        protected void a(org.junit.runner.notification.RunListener r2) throws java.lang.Exception {
                r1 = this;
                org.junit.runner.Description r0 = r1.c
                r2.c(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private abstract class h {
        private final java.util.List<org.junit.runner.notification.RunListener> a;
        final /* synthetic */ org.junit.runner.notification.a b;

        h(org.junit.runner.notification.a r2) {
                r1 = this;
                java.util.List r0 = org.junit.runner.notification.a.a(r2)
                r1.<init>(r2, r0)
                return
        }

        h(org.junit.runner.notification.a r1, java.util.List<org.junit.runner.notification.RunListener> r2) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r0.a = r2
                return
        }

        protected abstract void a(org.junit.runner.notification.RunListener r1) throws java.lang.Exception;

        void b() {
                r6 = this;
                java.util.List<org.junit.runner.notification.RunListener> r0 = r6.a
                int r0 = r0.size()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>(r0)
                java.util.List<org.junit.runner.notification.RunListener> r0 = r6.a
                java.util.Iterator r0 = r0.iterator()
            L16:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L35
                java.lang.Object r3 = r0.next()
                org.junit.runner.notification.RunListener r3 = (org.junit.runner.notification.RunListener) r3
                r6.a(r3)     // Catch: java.lang.Exception -> L29
                r1.add(r3)     // Catch: java.lang.Exception -> L29
                goto L16
            L29:
                r3 = move-exception
                org.junit.runner.notification.Failure r4 = new org.junit.runner.notification.Failure
                org.junit.runner.Description r5 = org.junit.runner.Description.TEST_MECHANISM
                r4.<init>(r5, r3)
                r2.add(r4)
                goto L16
            L35:
                org.junit.runner.notification.a r0 = r6.b
                org.junit.runner.notification.a.b(r0, r1, r2)
                return
        }
    }

    public a() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.a = r0
            r0 = 0
            r1.b = r0
            return
    }

    static /* synthetic */ java.util.List a(org.junit.runner.notification.a r0) {
            java.util.List<org.junit.runner.notification.RunListener> r0 = r0.a
            return r0
    }

    static /* synthetic */ void b(org.junit.runner.notification.a r0, java.util.List r1, java.util.List r2) {
            r0.g(r1, r2)
            return
    }

    private void g(java.util.List<org.junit.runner.notification.RunListener> r2, java.util.List<org.junit.runner.notification.Failure> r3) {
            r1 = this;
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto Le
            org.junit.runner.notification.a$d r0 = new org.junit.runner.notification.a$d
            r0.<init>(r1, r2, r3)
            r0.b()
        Le:
            return
    }

    public void c(org.junit.runner.notification.RunListener r3) {
            r2 = this;
            if (r3 == 0) goto Ld
            java.util.List<org.junit.runner.notification.RunListener> r0 = r2.a
            r1 = 0
            org.junit.runner.notification.RunListener r3 = r2.o(r3)
            r0.add(r1, r3)
            return
        Ld:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "Cannot add a null listener"
            r3.<init>(r0)
            throw r3
    }

    public void d(org.junit.runner.notification.RunListener r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            java.util.List<org.junit.runner.notification.RunListener> r0 = r1.a
            org.junit.runner.notification.RunListener r2 = r1.o(r2)
            r0.add(r2)
            return
        Lc:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "Cannot add a null listener"
            r2.<init>(r0)
            throw r2
    }

    public void e(org.junit.runner.notification.Failure r2) {
            r1 = this;
            org.junit.runner.notification.a$e r0 = new org.junit.runner.notification.a$e
            r0.<init>(r1, r2)
            r0.b()
            return
    }

    public void f(org.junit.runner.notification.Failure r4) {
            r3 = this;
            java.util.List<org.junit.runner.notification.RunListener> r0 = r3.a
            r1 = 1
            org.junit.runner.notification.Failure[] r1 = new org.junit.runner.notification.Failure[r1]
            r2 = 0
            r1[r2] = r4
            java.util.List r4 = java.util.Arrays.asList(r1)
            r3.g(r0, r4)
            return
    }

    public void h(org.junit.runner.Description r2) {
            r1 = this;
            org.junit.runner.notification.a$g r0 = new org.junit.runner.notification.a$g
            r0.<init>(r1, r2)
            r0.b()
            return
    }

    public void i(org.junit.runner.Description r2) {
            r1 = this;
            org.junit.runner.notification.a$f r0 = new org.junit.runner.notification.a$f
            r0.<init>(r1, r2)
            r0.b()
            return
    }

    public void j(org.junit.runner.Result r2) {
            r1 = this;
            org.junit.runner.notification.a$b r0 = new org.junit.runner.notification.a$b
            r0.<init>(r1, r2)
            r0.b()
            return
    }

    public void k(org.junit.runner.Description r2) {
            r1 = this;
            org.junit.runner.notification.a$a r0 = new org.junit.runner.notification.a$a
            r0.<init>(r1, r2)
            r0.b()
            return
    }

    public void l(org.junit.runner.Description r2) throws org.junit.runner.notification.StoppedByUserException {
            r1 = this;
            boolean r0 = r1.b
            if (r0 != 0) goto Ld
            org.junit.runner.notification.a$c r0 = new org.junit.runner.notification.a$c
            r0.<init>(r1, r2)
            r0.b()
            return
        Ld:
            org.junit.runner.notification.StoppedByUserException r2 = new org.junit.runner.notification.StoppedByUserException
            r2.<init>()
            throw r2
    }

    public void m() {
            r1 = this;
            r0 = 1
            r1.b = r0
            return
    }

    public void n(org.junit.runner.notification.RunListener r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            java.util.List<org.junit.runner.notification.RunListener> r0 = r1.a
            org.junit.runner.notification.RunListener r2 = r1.o(r2)
            r0.remove(r2)
            return
        Lc:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "Cannot remove a null listener"
            r2.<init>(r0)
            throw r2
    }

    org.junit.runner.notification.RunListener o(org.junit.runner.notification.RunListener r3) {
            r2 = this;
            java.lang.Class r0 = r3.getClass()
            java.lang.Class<org.junit.runner.notification.RunListener$ThreadSafe> r1 = org.junit.runner.notification.RunListener.ThreadSafe.class
            boolean r0 = r0.isAnnotationPresent(r1)
            if (r0 == 0) goto Ld
            return r3
        Ld:
            org.junit.runner.notification.b r0 = new org.junit.runner.notification.b
            r0.<init>(r3, r2)
            return r0
    }
}
