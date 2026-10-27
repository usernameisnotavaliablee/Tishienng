package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class n implements rx.b.j0 {
    final rx.e<rx.b> a;
    final int b;
    final boolean c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a extends rx.l<rx.b> {
        final rx.d a;
        final rx.subscriptions.b b;
        final boolean c;
        volatile boolean d;
        final java.util.concurrent.atomic.AtomicReference<java.util.Queue<java.lang.Throwable>> e;
        final java.util.concurrent.atomic.AtomicBoolean f;
        final java.util.concurrent.atomic.AtomicInteger g;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.operators.n$a$a, reason: collision with other inner class name */
        class C0018a implements rx.d {
            rx.m a;
            boolean b;
            final /* synthetic */ rx.internal.operators.n.a c;

            C0018a(rx.internal.operators.n.a r1) {
                    r0 = this;
                    r0.c = r1
                    r0.<init>()
                    return
            }

            public void a(rx.m r2) {
                    r1 = this;
                    r1.a = r2
                    rx.internal.operators.n$a r0 = r1.c
                    rx.subscriptions.b r0 = r0.b
                    r0.a(r2)
                    return
            }

            public void onCompleted() {
                    r3 = this;
                    boolean r0 = r3.b
                    if (r0 == 0) goto L5
                    goto L23
                L5:
                    r0 = 1
                    r3.b = r0
                    rx.internal.operators.n$a r0 = r3.c
                    rx.subscriptions.b r0 = r0.b
                    rx.m r1 = r3.a
                    r0.f(r1)
                    rx.internal.operators.n$a r0 = r3.c
                    r0.B()
                    rx.internal.operators.n$a r0 = r3.c
                    boolean r0 = r0.d
                    if (r0 != 0) goto L23
                    rx.internal.operators.n$a r0 = r3.c
                    r1 = 1
                    rx.internal.operators.n.a.j(r0, r1)
                L23:
                    return
            }

            public void onError(java.lang.Throwable r3) {
                    r2 = this;
                    boolean r0 = r2.b
                    if (r0 == 0) goto L8
                    rx.plugins.c.I(r3)
                    return
                L8:
                    r0 = 1
                    r2.b = r0
                    rx.internal.operators.n$a r0 = r2.c
                    rx.subscriptions.b r0 = r0.b
                    rx.m r1 = r2.a
                    r0.f(r1)
                    rx.internal.operators.n$a r0 = r2.c
                    java.util.Queue r0 = r0.s()
                    r0.offer(r3)
                    rx.internal.operators.n$a r3 = r2.c
                    r3.B()
                    rx.internal.operators.n$a r3 = r2.c
                    boolean r0 = r3.c
                    if (r0 == 0) goto L33
                    boolean r3 = r3.d
                    if (r3 != 0) goto L33
                    rx.internal.operators.n$a r3 = r2.c
                    r0 = 1
                    rx.internal.operators.n.a.g(r3, r0)
                L33:
                    return
            }
        }

        public a(rx.d r1, int r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.c = r3
                rx.subscriptions.b r1 = new rx.subscriptions.b
                r1.<init>()
                r0.b = r1
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r3 = 1
                r1.<init>(r3)
                r0.g = r1
                java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
                r1.<init>()
                r0.f = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.e = r1
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r2 != r1) goto L32
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0.request(r1)
                return
            L32:
                long r1 = (long) r2
                r0.request(r1)
                return
        }

        static /* synthetic */ void g(rx.internal.operators.n.a r0, long r1) {
                r0.request(r1)
                return
        }

        static /* synthetic */ void j(rx.internal.operators.n.a r0, long r1) {
                r0.request(r1)
                return
        }

        public void A(rx.b r2) {
                r1 = this;
                boolean r0 = r1.d
                if (r0 == 0) goto L5
                return
            L5:
                java.util.concurrent.atomic.AtomicInteger r0 = r1.g
                r0.getAndIncrement()
                rx.internal.operators.n$a$a r0 = new rx.internal.operators.n$a$a
                r0.<init>(r1)
                r2.G0(r0)
                return
        }

        void B() {
                r4 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r4.g
                int r0 = r0.decrementAndGet()
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L37
                java.util.concurrent.atomic.AtomicReference<java.util.Queue<java.lang.Throwable>> r0 = r4.e
                java.lang.Object r0 = r0.get()
                java.util.Queue r0 = (java.util.Queue) r0
                if (r0 == 0) goto L31
                boolean r3 = r0.isEmpty()
                if (r3 == 0) goto L1b
                goto L31
            L1b:
                java.lang.Throwable r0 = rx.internal.operators.n.a(r0)
                java.util.concurrent.atomic.AtomicBoolean r3 = r4.f
                boolean r1 = r3.compareAndSet(r2, r1)
                if (r1 == 0) goto L2d
                rx.d r1 = r4.a
                r1.onError(r0)
                return
            L2d:
                rx.plugins.c.I(r0)
                return
            L31:
                rx.d r0 = r4.a
                r0.onCompleted()
                return
            L37:
                boolean r0 = r4.c
                if (r0 != 0) goto L60
                java.util.concurrent.atomic.AtomicReference<java.util.Queue<java.lang.Throwable>> r0 = r4.e
                java.lang.Object r0 = r0.get()
                java.util.Queue r0 = (java.util.Queue) r0
                if (r0 == 0) goto L60
                boolean r3 = r0.isEmpty()
                if (r3 != 0) goto L60
                java.lang.Throwable r0 = rx.internal.operators.n.a(r0)
                java.util.concurrent.atomic.AtomicBoolean r3 = r4.f
                boolean r1 = r3.compareAndSet(r2, r1)
                if (r1 == 0) goto L5d
                rx.d r1 = r4.a
                r1.onError(r0)
                return
            L5d:
                rx.plugins.c.I(r0)
            L60:
                return
        }

        public void onCompleted() {
                r1 = this;
                boolean r0 = r1.d
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.d = r0
                r1.B()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.d
                if (r0 == 0) goto L8
                rx.plugins.c.I(r2)
                return
            L8:
                java.util.Queue r0 = r1.s()
                r0.offer(r2)
                r2 = 1
                r1.d = r2
                r1.B()
                return
        }

        public /* bridge */ /* synthetic */ void onNext(java.lang.Object r1) {
                r0 = this;
                rx.b r1 = (rx.b) r1
                r0.A(r1)
                return
        }

        java.util.Queue<java.lang.Throwable> s() {
                r3 = this;
                java.util.concurrent.atomic.AtomicReference<java.util.Queue<java.lang.Throwable>> r0 = r3.e
                java.lang.Object r0 = r0.get()
                java.util.Queue r0 = (java.util.Queue) r0
                if (r0 == 0) goto Lb
                return r0
            Lb:
                java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
                r0.<init>()
                java.util.concurrent.atomic.AtomicReference<java.util.Queue<java.lang.Throwable>> r1 = r3.e
                r2 = 0
                boolean r1 = androidx.camera.view.p.a(r1, r2, r0)
                if (r1 == 0) goto L1a
                return r0
            L1a:
                java.util.concurrent.atomic.AtomicReference<java.util.Queue<java.lang.Throwable>> r0 = r3.e
                java.lang.Object r0 = r0.get()
                java.util.Queue r0 = (java.util.Queue) r0
                return r0
        }
    }

    public n(rx.e<? extends rx.b> r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public static java.lang.Throwable a(java.util.Queue<java.lang.Throwable> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            java.lang.Object r1 = r2.poll()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L11
            r0.add(r1)
            goto L5
        L11:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L19
            r2 = 0
            return r2
        L19:
            int r2 = r0.size()
            r1 = 1
            if (r2 != r1) goto L28
            r2 = 0
            java.lang.Object r2 = r0.get(r2)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            return r2
        L28:
            rx.exceptions.CompositeException r2 = new rx.exceptions.CompositeException
            r2.<init>(r0)
            return r2
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.d r1 = (rx.d) r1
            r0.call(r1)
            return
    }

    public void call(rx.d r4) {
            r3 = this;
            rx.internal.operators.n$a r0 = new rx.internal.operators.n$a
            int r1 = r3.b
            boolean r2 = r3.c
            r0.<init>(r4, r1, r2)
            r4.a(r0)
            rx.e<rx.b> r4 = r3.a
            r4.J6(r0)
            return
    }
}
