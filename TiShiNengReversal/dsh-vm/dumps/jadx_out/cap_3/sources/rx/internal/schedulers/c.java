package rx.internal.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class c extends rx.h {
    final java.util.concurrent.Executor a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a extends rx.h.a implements java.lang.Runnable {
        final java.util.concurrent.Executor a;
        final rx.subscriptions.b b;
        final java.util.concurrent.ConcurrentLinkedQueue<rx.internal.schedulers.ScheduledAction> c;
        final java.util.concurrent.atomic.AtomicInteger d;
        final java.util.concurrent.ScheduledExecutorService e;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.schedulers.c$a$a, reason: collision with other inner class name */
        class C0042a implements rx.functions.a {
            final /* synthetic */ rx.subscriptions.c a;
            final /* synthetic */ rx.internal.schedulers.c.a b;

            C0042a(rx.internal.schedulers.c.a r1, rx.subscriptions.c r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            public void call() {
                    r2 = this;
                    rx.internal.schedulers.c$a r0 = r2.b
                    rx.subscriptions.b r0 = r0.b
                    rx.subscriptions.c r1 = r2.a
                    r0.f(r1)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class b implements rx.functions.a {
            final /* synthetic */ rx.subscriptions.c a;
            final /* synthetic */ rx.functions.a b;
            final /* synthetic */ rx.m c;
            final /* synthetic */ rx.internal.schedulers.c.a d;

            b(rx.internal.schedulers.c.a r1, rx.subscriptions.c r2, rx.functions.a r3, rx.m r4) {
                    r0 = this;
                    r0.d = r1
                    r0.a = r2
                    r0.b = r3
                    r0.c = r4
                    r0.<init>()
                    return
            }

            public void call() {
                    r3 = this;
                    rx.subscriptions.c r0 = r3.a
                    boolean r0 = r0.isUnsubscribed()
                    if (r0 == 0) goto L9
                    goto L25
                L9:
                    rx.internal.schedulers.c$a r0 = r3.d
                    rx.functions.a r1 = r3.b
                    rx.m r0 = r0.d(r1)
                    rx.subscriptions.c r1 = r3.a
                    r1.b(r0)
                    java.lang.Class r1 = r0.getClass()
                    java.lang.Class<rx.internal.schedulers.ScheduledAction> r2 = rx.internal.schedulers.ScheduledAction.class
                    if (r1 != r2) goto L25
                    rx.internal.schedulers.ScheduledAction r0 = (rx.internal.schedulers.ScheduledAction) r0
                    rx.m r1 = r3.c
                    r0.add(r1)
                L25:
                    return
            }
        }

        public a(java.util.concurrent.Executor r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                java.util.concurrent.ConcurrentLinkedQueue r1 = new java.util.concurrent.ConcurrentLinkedQueue
                r1.<init>()
                r0.c = r1
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r1.<init>()
                r0.d = r1
                rx.subscriptions.b r1 = new rx.subscriptions.b
                r1.<init>()
                r0.b = r1
                java.util.concurrent.ScheduledExecutorService r1 = rx.internal.schedulers.d.a()
                r0.e = r1
                return
        }

        public rx.m d(rx.functions.a r3) {
                r2 = this;
                boolean r0 = r2.isUnsubscribed()
                if (r0 == 0) goto Lb
                rx.m r3 = rx.subscriptions.f.e()
                return r3
            Lb:
                rx.functions.a r3 = rx.plugins.c.P(r3)
                rx.internal.schedulers.ScheduledAction r0 = new rx.internal.schedulers.ScheduledAction
                rx.subscriptions.b r1 = r2.b
                r0.<init>(r3, r1)
                rx.subscriptions.b r3 = r2.b
                r3.a(r0)
                java.util.concurrent.ConcurrentLinkedQueue<rx.internal.schedulers.ScheduledAction> r3 = r2.c
                r3.offer(r0)
                java.util.concurrent.atomic.AtomicInteger r3 = r2.d
                int r3 = r3.getAndIncrement()
                if (r3 != 0) goto L3d
                java.util.concurrent.Executor r3 = r2.a     // Catch: java.util.concurrent.RejectedExecutionException -> L2e
                r3.execute(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L2e
                return r0
            L2e:
                r3 = move-exception
                rx.subscriptions.b r1 = r2.b
                r1.f(r0)
                java.util.concurrent.atomic.AtomicInteger r0 = r2.d
                r0.decrementAndGet()
                rx.plugins.c.I(r3)
                throw r3
            L3d:
                return r0
        }

        public rx.m e(rx.functions.a r6, long r7, java.util.concurrent.TimeUnit r9) {
                r5 = this;
                r0 = 0
                int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r2 > 0) goto Lb
                rx.m r6 = r5.d(r6)
                return r6
            Lb:
                boolean r0 = r5.isUnsubscribed()
                if (r0 == 0) goto L16
                rx.m r6 = rx.subscriptions.f.e()
                return r6
            L16:
                rx.functions.a r6 = rx.plugins.c.P(r6)
                rx.subscriptions.c r0 = new rx.subscriptions.c
                r0.<init>()
                rx.subscriptions.c r1 = new rx.subscriptions.c
                r1.<init>()
                r1.b(r0)
                rx.subscriptions.b r2 = r5.b
                r2.a(r1)
                rx.internal.schedulers.c$a$a r2 = new rx.internal.schedulers.c$a$a
                r2.<init>(r5, r1)
                rx.m r2 = rx.subscriptions.f.a(r2)
                rx.internal.schedulers.ScheduledAction r3 = new rx.internal.schedulers.ScheduledAction
                rx.internal.schedulers.c$a$b r4 = new rx.internal.schedulers.c$a$b
                r4.<init>(r5, r1, r6, r2)
                r3.<init>(r4)
                r0.b(r3)
                java.util.concurrent.ScheduledExecutorService r6 = r5.e     // Catch: java.util.concurrent.RejectedExecutionException -> L4c
                java.util.concurrent.ScheduledFuture r6 = r6.schedule(r3, r7, r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L4c
                r3.add(r6)     // Catch: java.util.concurrent.RejectedExecutionException -> L4c
                return r2
            L4c:
                r6 = move-exception
                rx.plugins.c.I(r6)
                throw r6
        }

        public boolean isUnsubscribed() {
                r1 = this;
                rx.subscriptions.b r0 = r1.b
                boolean r0 = r0.isUnsubscribed()
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
            L0:
                rx.subscriptions.b r0 = r2.b
                boolean r0 = r0.isUnsubscribed()
                if (r0 == 0) goto Le
                java.util.concurrent.ConcurrentLinkedQueue<rx.internal.schedulers.ScheduledAction> r0 = r2.c
                r0.clear()
                return
            Le:
                java.util.concurrent.ConcurrentLinkedQueue<rx.internal.schedulers.ScheduledAction> r0 = r2.c
                java.lang.Object r0 = r0.poll()
                rx.internal.schedulers.ScheduledAction r0 = (rx.internal.schedulers.ScheduledAction) r0
                if (r0 != 0) goto L19
                goto L39
            L19:
                boolean r1 = r0.isUnsubscribed()
                if (r1 != 0) goto L31
                rx.subscriptions.b r1 = r2.b
                boolean r1 = r1.isUnsubscribed()
                if (r1 != 0) goto L2b
                r0.run()
                goto L31
            L2b:
                java.util.concurrent.ConcurrentLinkedQueue<rx.internal.schedulers.ScheduledAction> r0 = r2.c
                r0.clear()
                return
            L31:
                java.util.concurrent.atomic.AtomicInteger r0 = r2.d
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto L0
            L39:
                return
        }

        public void unsubscribe() {
                r1 = this;
                rx.subscriptions.b r0 = r1.b
                r0.unsubscribe()
                java.util.concurrent.ConcurrentLinkedQueue<rx.internal.schedulers.ScheduledAction> r0 = r1.c
                r0.clear()
                return
        }
    }

    public c(java.util.concurrent.Executor r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public rx.h.a a() {
            r2 = this;
            rx.internal.schedulers.c$a r0 = new rx.internal.schedulers.c$a
            java.util.concurrent.Executor r1 = r2.a
            r0.<init>(r1)
            return r0
    }
}
