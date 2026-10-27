package rx.internal.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class m extends rx.h {
    public static final rx.internal.schedulers.m a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a extends rx.h.a implements rx.m {
        final java.util.concurrent.atomic.AtomicInteger a;
        final java.util.concurrent.PriorityBlockingQueue<rx.internal.schedulers.m.b> b;
        private final rx.subscriptions.a c;
        private final java.util.concurrent.atomic.AtomicInteger d;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.schedulers.m$a$a, reason: collision with other inner class name */
        class C0044a implements rx.functions.a {
            final /* synthetic */ rx.internal.schedulers.m.b a;
            final /* synthetic */ rx.internal.schedulers.m.a b;

            C0044a(rx.internal.schedulers.m.a r1, rx.internal.schedulers.m.b r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            public void call() {
                    r2 = this;
                    rx.internal.schedulers.m$a r0 = r2.b
                    java.util.concurrent.PriorityBlockingQueue<rx.internal.schedulers.m$b> r0 = r0.b
                    rx.internal.schedulers.m$b r1 = r2.a
                    r0.remove(r1)
                    return
            }
        }

        a() {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>()
                r1.a = r0
                java.util.concurrent.PriorityBlockingQueue r0 = new java.util.concurrent.PriorityBlockingQueue
                r0.<init>()
                r1.b = r0
                rx.subscriptions.a r0 = new rx.subscriptions.a
                r0.<init>()
                r1.c = r0
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>()
                r1.d = r0
                return
        }

        private rx.m g(rx.functions.a r2, long r3) {
                r1 = this;
                rx.subscriptions.a r0 = r1.c
                boolean r0 = r0.isUnsubscribed()
                if (r0 == 0) goto Ld
                rx.m r2 = rx.subscriptions.f.e()
                return r2
            Ld:
                rx.internal.schedulers.m$b r0 = new rx.internal.schedulers.m$b
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                java.util.concurrent.atomic.AtomicInteger r4 = r1.a
                int r4 = r4.incrementAndGet()
                r0.<init>(r2, r3, r4)
                java.util.concurrent.PriorityBlockingQueue<rx.internal.schedulers.m$b> r2 = r1.b
                r2.add(r0)
                java.util.concurrent.atomic.AtomicInteger r2 = r1.d
                int r2 = r2.getAndIncrement()
                if (r2 != 0) goto L45
            L29:
                java.util.concurrent.PriorityBlockingQueue<rx.internal.schedulers.m$b> r2 = r1.b
                java.lang.Object r2 = r2.poll()
                rx.internal.schedulers.m$b r2 = (rx.internal.schedulers.m.b) r2
                if (r2 == 0) goto L38
                rx.functions.a r2 = r2.a
                r2.call()
            L38:
                java.util.concurrent.atomic.AtomicInteger r2 = r1.d
                int r2 = r2.decrementAndGet()
                if (r2 > 0) goto L29
                rx.m r2 = rx.subscriptions.f.e()
                return r2
            L45:
                rx.internal.schedulers.m$a$a r2 = new rx.internal.schedulers.m$a$a
                r2.<init>(r1, r0)
                rx.m r2 = rx.subscriptions.f.a(r2)
                return r2
        }

        public rx.m d(rx.functions.a r3) {
                r2 = this;
                long r0 = r2.b()
                rx.m r3 = r2.g(r3, r0)
                return r3
        }

        public rx.m e(rx.functions.a r3, long r4, java.util.concurrent.TimeUnit r6) {
                r2 = this;
                long r0 = r2.b()
                long r4 = r6.toMillis(r4)
                long r0 = r0 + r4
                rx.internal.schedulers.l r4 = new rx.internal.schedulers.l
                r4.<init>(r3, r2, r0)
                rx.m r3 = r2.g(r4, r0)
                return r3
        }

        public boolean isUnsubscribed() {
                r1 = this;
                rx.subscriptions.a r0 = r1.c
                boolean r0 = r0.isUnsubscribed()
                return r0
        }

        public void unsubscribe() {
                r1 = this;
                rx.subscriptions.a r0 = r1.c
                r0.unsubscribe()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b implements java.lang.Comparable<rx.internal.schedulers.m.b> {
        final rx.functions.a a;
        final java.lang.Long b;
        final int c;

        b(rx.functions.a r1, java.lang.Long r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                return
        }

        public int a(rx.internal.schedulers.m.b r3) {
                r2 = this;
                java.lang.Long r0 = r2.b
                java.lang.Long r1 = r3.b
                int r0 = r0.compareTo(r1)
                if (r0 != 0) goto L13
                int r0 = r2.c
                int r3 = r3.c
                int r3 = rx.internal.schedulers.m.e(r0, r3)
                return r3
            L13:
                return r0
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(rx.internal.schedulers.m.b r1) {
                r0 = this;
                rx.internal.schedulers.m$b r1 = (rx.internal.schedulers.m.b) r1
                int r1 = r0.a(r1)
                return r1
        }
    }

    static {
            rx.internal.schedulers.m r0 = new rx.internal.schedulers.m
            r0.<init>()
            rx.internal.schedulers.m.a = r0
            return
    }

    private m() {
            r0 = this;
            r0.<init>()
            return
    }

    static int e(int r0, int r1) {
            if (r0 >= r1) goto L4
            r0 = -1
            return r0
        L4:
            if (r0 != r1) goto L8
            r0 = 0
            return r0
        L8:
            r0 = 1
            return r0
    }

    public rx.h.a a() {
            r1 = this;
            rx.internal.schedulers.m$a r0 = new rx.internal.schedulers.m$a
            r0.<init>()
            return r0
    }
}
