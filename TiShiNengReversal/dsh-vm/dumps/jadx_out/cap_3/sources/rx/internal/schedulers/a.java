package rx.internal.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class a extends rx.h implements rx.internal.schedulers.j {
    private static final long c = 0;
    private static final java.util.concurrent.TimeUnit d = null;
    static final rx.internal.schedulers.a.c e = null;
    static final rx.internal.schedulers.a.C0036a f = null;
    final java.util.concurrent.ThreadFactory a;
    final java.util.concurrent.atomic.AtomicReference<rx.internal.schedulers.a.C0036a> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: rx.internal.schedulers.a$a, reason: collision with other inner class name */
    static final class C0036a {
        private final java.util.concurrent.ThreadFactory a;
        private final long b;
        private final java.util.concurrent.ConcurrentLinkedQueue<rx.internal.schedulers.a.c> c;
        private final rx.subscriptions.b d;
        private final java.util.concurrent.ScheduledExecutorService e;
        private final java.util.concurrent.Future<?> f;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.schedulers.a$a$a, reason: collision with other inner class name */
        class ThreadFactoryC0037a implements java.util.concurrent.ThreadFactory {
            final /* synthetic */ java.util.concurrent.ThreadFactory a;
            final /* synthetic */ rx.internal.schedulers.a.C0036a b;

            ThreadFactoryC0037a(rx.internal.schedulers.a.C0036a r1, java.util.concurrent.ThreadFactory r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // java.util.concurrent.ThreadFactory
            public java.lang.Thread newThread(java.lang.Runnable r3) {
                    r2 = this;
                    java.util.concurrent.ThreadFactory r0 = r2.a
                    java.lang.Thread r3 = r0.newThread(r3)
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = r3.getName()
                    r0.append(r1)
                    java.lang.String r1 = " (Evictor)"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    r3.setName(r0)
                    return r3
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.schedulers.a$a$b */
        class b implements java.lang.Runnable {
            final /* synthetic */ rx.internal.schedulers.a.C0036a a;

            b(rx.internal.schedulers.a.C0036a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r1 = this;
                    rx.internal.schedulers.a$a r0 = r1.a
                    r0.a()
                    return
            }
        }

        C0036a(java.util.concurrent.ThreadFactory r8, long r9, java.util.concurrent.TimeUnit r11) {
                r7 = this;
                r7.<init>()
                r7.a = r8
                if (r11 == 0) goto Ld
                long r9 = r11.toNanos(r9)
            Lb:
                r2 = r9
                goto L10
            Ld:
                r9 = 0
                goto Lb
            L10:
                r7.b = r2
                java.util.concurrent.ConcurrentLinkedQueue r9 = new java.util.concurrent.ConcurrentLinkedQueue
                r9.<init>()
                r7.c = r9
                rx.subscriptions.b r9 = new rx.subscriptions.b
                r9.<init>()
                r7.d = r9
                if (r11 == 0) goto L3c
                rx.internal.schedulers.a$a$a r9 = new rx.internal.schedulers.a$a$a
                r9.<init>(r7, r8)
                r8 = 1
                java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newScheduledThreadPool(r8, r9)
                rx.internal.schedulers.h.N(r0)
                rx.internal.schedulers.a$a$b r1 = new rx.internal.schedulers.a$a$b
                r1.<init>(r7)
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS
                r4 = r2
                java.util.concurrent.ScheduledFuture r8 = r0.scheduleWithFixedDelay(r1, r2, r4, r6)
                goto L3e
            L3c:
                r0 = 0
                r8 = r0
            L3e:
                r7.e = r0
                r7.f = r8
                return
        }

        void a() {
                r7 = this;
                java.util.concurrent.ConcurrentLinkedQueue<rx.internal.schedulers.a$c> r0 = r7.c
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L34
                long r0 = r7.c()
                java.util.concurrent.ConcurrentLinkedQueue<rx.internal.schedulers.a$c> r2 = r7.c
                java.util.Iterator r2 = r2.iterator()
            L12:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L34
                java.lang.Object r3 = r2.next()
                rx.internal.schedulers.a$c r3 = (rx.internal.schedulers.a.c) r3
                long r4 = r3.P()
                int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r6 > 0) goto L34
                java.util.concurrent.ConcurrentLinkedQueue<rx.internal.schedulers.a$c> r4 = r7.c
                boolean r4 = r4.remove(r3)
                if (r4 == 0) goto L12
                rx.subscriptions.b r4 = r7.d
                r4.f(r3)
                goto L12
            L34:
                return
        }

        rx.internal.schedulers.a.c b() {
                r2 = this;
                rx.subscriptions.b r0 = r2.d
                boolean r0 = r0.isUnsubscribed()
                if (r0 == 0) goto Lb
                rx.internal.schedulers.a$c r0 = rx.internal.schedulers.a.e
                return r0
            Lb:
                java.util.concurrent.ConcurrentLinkedQueue<rx.internal.schedulers.a$c> r0 = r2.c
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L1e
                java.util.concurrent.ConcurrentLinkedQueue<rx.internal.schedulers.a$c> r0 = r2.c
                java.lang.Object r0 = r0.poll()
                rx.internal.schedulers.a$c r0 = (rx.internal.schedulers.a.c) r0
                if (r0 == 0) goto Lb
                return r0
            L1e:
                rx.internal.schedulers.a$c r0 = new rx.internal.schedulers.a$c
                java.util.concurrent.ThreadFactory r1 = r2.a
                r0.<init>(r1)
                rx.subscriptions.b r1 = r2.d
                r1.a(r0)
                return r0
        }

        long c() {
                r2 = this;
                long r0 = java.lang.System.nanoTime()
                return r0
        }

        void d(rx.internal.schedulers.a.c r5) {
                r4 = this;
                long r0 = r4.c()
                long r2 = r4.b
                long r0 = r0 + r2
                r5.Q(r0)
                java.util.concurrent.ConcurrentLinkedQueue<rx.internal.schedulers.a$c> r0 = r4.c
                r0.offer(r5)
                return
        }

        void e() {
                r2 = this;
                java.util.concurrent.Future<?> r0 = r2.f     // Catch: java.lang.Throwable -> L9
                if (r0 == 0) goto Lb
                r1 = 1
                r0.cancel(r1)     // Catch: java.lang.Throwable -> L9
                goto Lb
            L9:
                r0 = move-exception
                goto L18
            Lb:
                java.util.concurrent.ScheduledExecutorService r0 = r2.e     // Catch: java.lang.Throwable -> L9
                if (r0 == 0) goto L12
                r0.shutdownNow()     // Catch: java.lang.Throwable -> L9
            L12:
                rx.subscriptions.b r0 = r2.d
                r0.unsubscribe()
                return
            L18:
                rx.subscriptions.b r1 = r2.d
                r1.unsubscribe()
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b extends rx.h.a implements rx.functions.a {
        private final rx.subscriptions.b a;
        private final rx.internal.schedulers.a.C0036a b;
        private final rx.internal.schedulers.a.c c;
        final java.util.concurrent.atomic.AtomicBoolean d;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.schedulers.a$b$a, reason: collision with other inner class name */
        class C0038a implements rx.functions.a {
            final /* synthetic */ rx.functions.a a;
            final /* synthetic */ rx.internal.schedulers.a.b b;

            C0038a(rx.internal.schedulers.a.b r1, rx.functions.a r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            public void call() {
                    r1 = this;
                    rx.internal.schedulers.a$b r0 = r1.b
                    boolean r0 = r0.isUnsubscribed()
                    if (r0 == 0) goto L9
                    return
                L9:
                    rx.functions.a r0 = r1.a
                    r0.call()
                    return
            }
        }

        b(rx.internal.schedulers.a.C0036a r2) {
                r1 = this;
                r1.<init>()
                rx.subscriptions.b r0 = new rx.subscriptions.b
                r0.<init>()
                r1.a = r0
                r1.b = r2
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                r0.<init>()
                r1.d = r0
                rx.internal.schedulers.a$c r2 = r2.b()
                r1.c = r2
                return
        }

        public void call() {
                r2 = this;
                rx.internal.schedulers.a$a r0 = r2.b
                rx.internal.schedulers.a$c r1 = r2.c
                r0.d(r1)
                return
        }

        public rx.m d(rx.functions.a r4) {
                r3 = this;
                r0 = 0
                r2 = 0
                rx.m r4 = r3.e(r4, r0, r2)
                return r4
        }

        public rx.m e(rx.functions.a r3, long r4, java.util.concurrent.TimeUnit r6) {
                r2 = this;
                rx.subscriptions.b r0 = r2.a
                boolean r0 = r0.isUnsubscribed()
                if (r0 == 0) goto Ld
                rx.m r3 = rx.subscriptions.f.e()
                return r3
            Ld:
                rx.internal.schedulers.a$c r0 = r2.c
                rx.internal.schedulers.a$b$a r1 = new rx.internal.schedulers.a$b$a
                r1.<init>(r2, r3)
                rx.internal.schedulers.ScheduledAction r3 = r0.B(r1, r4, r6)
                rx.subscriptions.b r4 = r2.a
                r4.a(r3)
                rx.subscriptions.b r4 = r2.a
                r3.addParent(r4)
                return r3
        }

        public boolean isUnsubscribed() {
                r1 = this;
                rx.subscriptions.b r0 = r1.a
                boolean r0 = r0.isUnsubscribed()
                return r0
        }

        public void unsubscribe() {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.d
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto Lf
                rx.internal.schedulers.a$c r0 = r3.c
                r0.d(r3)
            Lf:
                rx.subscriptions.b r0 = r3.a
                r0.unsubscribe()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c extends rx.internal.schedulers.h {
        private long l;

        c(java.util.concurrent.ThreadFactory r3) {
                r2 = this;
                r2.<init>(r3)
                r0 = 0
                r2.l = r0
                return
        }

        public long P() {
                r2 = this;
                long r0 = r2.l
                return r0
        }

        public void Q(long r1) {
                r0 = this;
                r0.l = r1
                return
        }
    }

    static {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            rx.internal.schedulers.a.d = r0
            rx.internal.schedulers.a$c r0 = new rx.internal.schedulers.a$c
            java.util.concurrent.ThreadFactory r1 = rx.internal.util.RxThreadFactory.NONE
            r0.<init>(r1)
            rx.internal.schedulers.a.e = r0
            r0.unsubscribe()
            rx.internal.schedulers.a$a r0 = new rx.internal.schedulers.a$a
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2, r1)
            rx.internal.schedulers.a.f = r0
            r0.e()
            java.lang.String r0 = "rx.io-scheduler.keepalive"
            r1 = 60
            java.lang.Integer r0 = java.lang.Integer.getInteger(r0, r1)
            int r0 = r0.intValue()
            long r0 = (long) r0
            rx.internal.schedulers.a.c = r0
            return
    }

    public a(java.util.concurrent.ThreadFactory r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            rx.internal.schedulers.a$a r0 = rx.internal.schedulers.a.f
            r2.<init>(r0)
            r1.b = r2
            r1.start()
            return
    }

    public rx.h.a a() {
            r2 = this;
            rx.internal.schedulers.a$b r0 = new rx.internal.schedulers.a$b
            java.util.concurrent.atomic.AtomicReference<rx.internal.schedulers.a$a> r1 = r2.b
            java.lang.Object r1 = r1.get()
            rx.internal.schedulers.a$a r1 = (rx.internal.schedulers.a.C0036a) r1
            r0.<init>(r1)
            return r0
    }

    @Override // rx.internal.schedulers.j
    public void shutdown() {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<rx.internal.schedulers.a$a> r0 = r3.b
            java.lang.Object r0 = r0.get()
            rx.internal.schedulers.a$a r0 = (rx.internal.schedulers.a.C0036a) r0
            rx.internal.schedulers.a$a r1 = rx.internal.schedulers.a.f
            if (r0 != r1) goto Ld
            return
        Ld:
            java.util.concurrent.atomic.AtomicReference<rx.internal.schedulers.a$a> r2 = r3.b
            boolean r1 = androidx.camera.view.p.a(r2, r0, r1)
            if (r1 == 0) goto L0
            r0.e()
            return
    }

    @Override // rx.internal.schedulers.j
    public void start() {
            r5 = this;
            rx.internal.schedulers.a$a r0 = new rx.internal.schedulers.a$a
            java.util.concurrent.ThreadFactory r1 = r5.a
            long r2 = rx.internal.schedulers.a.c
            java.util.concurrent.TimeUnit r4 = rx.internal.schedulers.a.d
            r0.<init>(r1, r2, r4)
            java.util.concurrent.atomic.AtomicReference<rx.internal.schedulers.a$a> r1 = r5.b
            rx.internal.schedulers.a$a r2 = rx.internal.schedulers.a.f
            boolean r1 = androidx.camera.view.p.a(r1, r2, r0)
            if (r1 != 0) goto L18
            r0.e()
        L18:
            return
    }
}
