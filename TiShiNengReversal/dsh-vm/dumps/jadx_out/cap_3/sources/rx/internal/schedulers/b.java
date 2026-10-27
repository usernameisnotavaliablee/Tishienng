package rx.internal.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class b extends rx.h implements rx.internal.schedulers.j {
    static final java.lang.String c = "rx.scheduler.max-computation-threads";
    static final int d = 0;
    static final rx.internal.schedulers.b.c e = null;
    static final rx.internal.schedulers.b.C0041b f = null;
    final java.util.concurrent.ThreadFactory a;
    final java.util.concurrent.atomic.AtomicReference<rx.internal.schedulers.b.C0041b> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a extends rx.h.a {
        private final rx.internal.util.m a;
        private final rx.subscriptions.b b;
        private final rx.internal.util.m c;
        private final rx.internal.schedulers.b.c d;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.schedulers.b$a$a, reason: collision with other inner class name */
        class C0039a implements rx.functions.a {
            final /* synthetic */ rx.functions.a a;
            final /* synthetic */ rx.internal.schedulers.b.a b;

            C0039a(rx.internal.schedulers.b.a r1, rx.functions.a r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            public void call() {
                    r1 = this;
                    rx.internal.schedulers.b$a r0 = r1.b
                    boolean r0 = r0.isUnsubscribed()
                    if (r0 == 0) goto L9
                    return
                L9:
                    rx.functions.a r0 = r1.a
                    r0.call()
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.schedulers.b$a$b, reason: collision with other inner class name */
        class C0040b implements rx.functions.a {
            final /* synthetic */ rx.functions.a a;
            final /* synthetic */ rx.internal.schedulers.b.a b;

            C0040b(rx.internal.schedulers.b.a r1, rx.functions.a r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            public void call() {
                    r1 = this;
                    rx.internal.schedulers.b$a r0 = r1.b
                    boolean r0 = r0.isUnsubscribed()
                    if (r0 == 0) goto L9
                    return
                L9:
                    rx.functions.a r0 = r1.a
                    r0.call()
                    return
            }
        }

        a(rx.internal.schedulers.b.c r6) {
                r5 = this;
                r5.<init>()
                rx.internal.util.m r0 = new rx.internal.util.m
                r0.<init>()
                r5.a = r0
                rx.subscriptions.b r1 = new rx.subscriptions.b
                r1.<init>()
                r5.b = r1
                rx.internal.util.m r2 = new rx.internal.util.m
                r3 = 2
                rx.m[] r3 = new rx.m[r3]
                r4 = 0
                r3[r4] = r0
                r0 = 1
                r3[r0] = r1
                r2.<init>(r3)
                r5.c = r2
                r5.d = r6
                return
        }

        public rx.m d(rx.functions.a r7) {
                r6 = this;
                boolean r0 = r6.isUnsubscribed()
                if (r0 == 0) goto Lb
                rx.m r7 = rx.subscriptions.f.e()
                return r7
            Lb:
                rx.internal.schedulers.b$c r0 = r6.d
                rx.internal.schedulers.b$a$a r1 = new rx.internal.schedulers.b$a$a
                r1.<init>(r6, r7)
                r4 = 0
                rx.internal.util.m r5 = r6.a
                r2 = 0
                rx.internal.schedulers.ScheduledAction r7 = r0.G(r1, r2, r4, r5)
                return r7
        }

        public rx.m e(rx.functions.a r7, long r8, java.util.concurrent.TimeUnit r10) {
                r6 = this;
                boolean r0 = r6.isUnsubscribed()
                if (r0 == 0) goto Lb
                rx.m r7 = rx.subscriptions.f.e()
                return r7
            Lb:
                rx.internal.schedulers.b$c r0 = r6.d
                rx.internal.schedulers.b$a$b r1 = new rx.internal.schedulers.b$a$b
                r1.<init>(r6, r7)
                rx.subscriptions.b r5 = r6.b
                r2 = r8
                r4 = r10
                rx.internal.schedulers.ScheduledAction r7 = r0.H(r1, r2, r4, r5)
                return r7
        }

        public boolean isUnsubscribed() {
                r1 = this;
                rx.internal.util.m r0 = r1.c
                boolean r0 = r0.isUnsubscribed()
                return r0
        }

        public void unsubscribe() {
                r1 = this;
                rx.internal.util.m r0 = r1.c
                r0.unsubscribe()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: rx.internal.schedulers.b$b, reason: collision with other inner class name */
    static final class C0041b {
        final int a;
        final rx.internal.schedulers.b.c[] b;
        long c;

        C0041b(java.util.concurrent.ThreadFactory r4, int r5) {
                r3 = this;
                r3.<init>()
                r3.a = r5
                rx.internal.schedulers.b$c[] r0 = new rx.internal.schedulers.b.c[r5]
                r3.b = r0
                r0 = 0
            La:
                if (r0 >= r5) goto L18
                rx.internal.schedulers.b$c[] r1 = r3.b
                rx.internal.schedulers.b$c r2 = new rx.internal.schedulers.b$c
                r2.<init>(r4)
                r1[r0] = r2
                int r0 = r0 + 1
                goto La
            L18:
                return
        }

        public rx.internal.schedulers.b.c a() {
                r6 = this;
                int r0 = r6.a
                if (r0 != 0) goto L7
                rx.internal.schedulers.b$c r0 = rx.internal.schedulers.b.e
                return r0
            L7:
                rx.internal.schedulers.b$c[] r1 = r6.b
                long r2 = r6.c
                r4 = 1
                long r4 = r4 + r2
                r6.c = r4
                long r4 = (long) r0
                long r2 = r2 % r4
                int r0 = (int) r2
                r0 = r1[r0]
                return r0
        }

        public void b() {
                r4 = this;
                rx.internal.schedulers.b$c[] r0 = r4.b
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto Le
                r3 = r0[r2]
                r3.unsubscribe()
                int r2 = r2 + 1
                goto L4
            Le:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c extends rx.internal.schedulers.h {
        c(java.util.concurrent.ThreadFactory r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    static {
            java.lang.String r0 = "rx.scheduler.max-computation-threads"
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.getInteger(r0, r1)
            int r0 = r0.intValue()
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()
            int r2 = r2.availableProcessors()
            if (r0 <= 0) goto L17
            if (r0 <= r2) goto L18
        L17:
            r0 = r2
        L18:
            rx.internal.schedulers.b.d = r0
            rx.internal.schedulers.b$c r0 = new rx.internal.schedulers.b$c
            java.util.concurrent.ThreadFactory r2 = rx.internal.util.RxThreadFactory.NONE
            r0.<init>(r2)
            rx.internal.schedulers.b.e = r0
            r0.unsubscribe()
            rx.internal.schedulers.b$b r0 = new rx.internal.schedulers.b$b
            r2 = 0
            r0.<init>(r2, r1)
            rx.internal.schedulers.b.f = r0
            return
    }

    public b(java.util.concurrent.ThreadFactory r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            rx.internal.schedulers.b$b r0 = rx.internal.schedulers.b.f
            r2.<init>(r0)
            r1.b = r2
            r1.start()
            return
    }

    public rx.h.a a() {
            r2 = this;
            rx.internal.schedulers.b$a r0 = new rx.internal.schedulers.b$a
            java.util.concurrent.atomic.AtomicReference<rx.internal.schedulers.b$b> r1 = r2.b
            java.lang.Object r1 = r1.get()
            rx.internal.schedulers.b$b r1 = (rx.internal.schedulers.b.C0041b) r1
            rx.internal.schedulers.b$c r1 = r1.a()
            r0.<init>(r1)
            return r0
    }

    public rx.m e(rx.functions.a r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicReference<rx.internal.schedulers.b$b> r0 = r4.b
            java.lang.Object r0 = r0.get()
            rx.internal.schedulers.b$b r0 = (rx.internal.schedulers.b.C0041b) r0
            rx.internal.schedulers.b$c r0 = r0.a()
            r1 = -1
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            rx.internal.schedulers.ScheduledAction r5 = r0.B(r5, r1, r3)
            return r5
    }

    @Override // rx.internal.schedulers.j
    public void shutdown() {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<rx.internal.schedulers.b$b> r0 = r3.b
            java.lang.Object r0 = r0.get()
            rx.internal.schedulers.b$b r0 = (rx.internal.schedulers.b.C0041b) r0
            rx.internal.schedulers.b$b r1 = rx.internal.schedulers.b.f
            if (r0 != r1) goto Ld
            return
        Ld:
            java.util.concurrent.atomic.AtomicReference<rx.internal.schedulers.b$b> r2 = r3.b
            boolean r1 = androidx.camera.view.p.a(r2, r0, r1)
            if (r1 == 0) goto L0
            r0.b()
            return
    }

    @Override // rx.internal.schedulers.j
    public void start() {
            r3 = this;
            rx.internal.schedulers.b$b r0 = new rx.internal.schedulers.b$b
            java.util.concurrent.ThreadFactory r1 = r3.a
            int r2 = rx.internal.schedulers.b.d
            r0.<init>(r1, r2)
            java.util.concurrent.atomic.AtomicReference<rx.internal.schedulers.b$b> r1 = r3.b
            rx.internal.schedulers.b$b r2 = rx.internal.schedulers.b.f
            boolean r1 = androidx.camera.view.p.a(r1, r2, r0)
            if (r1 != 0) goto L16
            r0.b()
        L16:
            return
    }
}
