package rx.internal.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class k extends rx.h implements rx.m {
    static final rx.m d = null;
    static final rx.m e = null;
    private final rx.h a;
    private final rx.f<rx.e<rx.b>> b;
    private final rx.m c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.functions.p<rx.internal.schedulers.k.g, rx.b> {
        final /* synthetic */ rx.h.a a;
        final /* synthetic */ rx.internal.schedulers.k b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.schedulers.k$a$a, reason: collision with other inner class name */
        class C0043a implements rx.b.j0 {
            final /* synthetic */ rx.internal.schedulers.k.g a;
            final /* synthetic */ rx.internal.schedulers.k.a b;

            C0043a(rx.internal.schedulers.k.a r1, rx.internal.schedulers.k.g r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                    r0 = this;
                    rx.d r1 = (rx.d) r1
                    r0.call(r1)
                    return
            }

            public void call(rx.d r3) {
                    r2 = this;
                    rx.internal.schedulers.k$g r0 = r2.a
                    r3.a(r0)
                    rx.internal.schedulers.k$g r0 = r2.a
                    rx.internal.schedulers.k$a r1 = r2.b
                    rx.h$a r1 = r1.a
                    rx.internal.schedulers.k.g.a(r0, r1, r3)
                    return
            }
        }

        a(rx.internal.schedulers.k r1, rx.h.a r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
                r0 = this;
                rx.internal.schedulers.k$g r1 = (rx.internal.schedulers.k.g) r1
                rx.b r1 = r0.call(r1)
                return r1
        }

        public rx.b call(rx.internal.schedulers.k.g r2) {
                r1 = this;
                rx.internal.schedulers.k$a$a r0 = new rx.internal.schedulers.k$a$a
                r0.<init>(r1, r2)
                rx.b r2 = rx.b.p(r0)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends rx.h.a {
        private final java.util.concurrent.atomic.AtomicBoolean a;
        final /* synthetic */ rx.h.a b;
        final /* synthetic */ rx.f c;
        final /* synthetic */ rx.internal.schedulers.k d;

        b(rx.internal.schedulers.k r1, rx.h.a r2, rx.f r3) {
                r0 = this;
                r0.d = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
                r1.<init>()
                r0.a = r1
                return
        }

        public rx.m d(rx.functions.a r2) {
                r1 = this;
                rx.internal.schedulers.k$e r0 = new rx.internal.schedulers.k$e
                r0.<init>(r2)
                rx.f r2 = r1.c
                r2.onNext(r0)
                return r0
        }

        public rx.m e(rx.functions.a r2, long r3, java.util.concurrent.TimeUnit r5) {
                r1 = this;
                rx.internal.schedulers.k$d r0 = new rx.internal.schedulers.k$d
                r0.<init>(r2, r3, r5)
                rx.f r2 = r1.c
                r2.onNext(r0)
                return r0
        }

        public boolean isUnsubscribed() {
                r1 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.a
                boolean r0 = r0.get()
                return r0
        }

        public void unsubscribe() {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.a
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L14
                rx.h$a r0 = r3.b
                r0.unsubscribe()
                rx.f r0 = r3.c
                r0.onCompleted()
            L14:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class c implements rx.m {
        c() {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean isUnsubscribed() {
                r1 = this;
                r0 = 0
                return r0
        }

        public void unsubscribe() {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class d extends rx.internal.schedulers.k.g {
        private final rx.functions.a a;
        private final long b;
        private final java.util.concurrent.TimeUnit c;

        public d(rx.functions.a r1, long r2, java.util.concurrent.TimeUnit r4) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r4
                return
        }

        @Override // rx.internal.schedulers.k.g
        protected rx.m b(rx.h.a r4, rx.d r5) {
                r3 = this;
                rx.internal.schedulers.k$f r0 = new rx.internal.schedulers.k$f
                rx.functions.a r1 = r3.a
                r0.<init>(r1, r5)
                long r1 = r3.b
                java.util.concurrent.TimeUnit r5 = r3.c
                rx.m r4 = r4.e(r0, r1, r5)
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class e extends rx.internal.schedulers.k.g {
        private final rx.functions.a a;

        public e(rx.functions.a r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // rx.internal.schedulers.k.g
        protected rx.m b(rx.h.a r3, rx.d r4) {
                r2 = this;
                rx.internal.schedulers.k$f r0 = new rx.internal.schedulers.k$f
                rx.functions.a r1 = r2.a
                r0.<init>(r1, r4)
                rx.m r3 = r3.d(r0)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class f implements rx.functions.a {
        private rx.d a;
        private rx.functions.a b;

        public f(rx.functions.a r1, rx.d r2) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                r0.a = r2
                return
        }

        public void call() {
                r2 = this;
                rx.functions.a r0 = r2.b     // Catch: java.lang.Throwable -> Lb
                r0.call()     // Catch: java.lang.Throwable -> Lb
                rx.d r0 = r2.a
                r0.onCompleted()
                return
            Lb:
                r0 = move-exception
                rx.d r1 = r2.a
                r1.onCompleted()
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class g extends java.util.concurrent.atomic.AtomicReference<rx.m> implements rx.m {
        public g() {
                r1 = this;
                rx.m r0 = rx.internal.schedulers.k.d
                r1.<init>(r0)
                return
        }

        static /* synthetic */ void a(rx.internal.schedulers.k.g r0, rx.h.a r1, rx.d r2) {
                r0.call(r1, r2)
                return
        }

        private void call(rx.h.a r3, rx.d r4) {
                r2 = this;
                java.lang.Object r0 = r2.get()
                rx.m r0 = (rx.m) r0
                rx.m r1 = rx.internal.schedulers.k.e
                if (r0 != r1) goto Lb
                goto L1d
            Lb:
                rx.m r1 = rx.internal.schedulers.k.d
                if (r0 == r1) goto L10
                goto L1d
            L10:
                rx.m r3 = r2.b(r3, r4)
                boolean r4 = r2.compareAndSet(r1, r3)
                if (r4 != 0) goto L1d
                r3.unsubscribe()
            L1d:
                return
        }

        protected abstract rx.m b(rx.h.a r1, rx.d r2);

        public boolean isUnsubscribed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                rx.m r0 = (rx.m) r0
                boolean r0 = r0.isUnsubscribed()
                return r0
        }

        public void unsubscribe() {
                r3 = this;
                rx.m r0 = rx.internal.schedulers.k.e
            L2:
                java.lang.Object r1 = r3.get()
                rx.m r1 = (rx.m) r1
                rx.m r2 = rx.internal.schedulers.k.e
                if (r1 != r2) goto Ld
                goto L1a
            Ld:
                boolean r2 = r3.compareAndSet(r1, r0)
                if (r2 == 0) goto L2
                rx.m r0 = rx.internal.schedulers.k.d
                if (r1 == r0) goto L1a
                r1.unsubscribe()
            L1a:
                return
        }
    }

    static {
            rx.internal.schedulers.k$c r0 = new rx.internal.schedulers.k$c
            r0.<init>()
            rx.internal.schedulers.k.d = r0
            rx.m r0 = rx.subscriptions.f.e()
            rx.internal.schedulers.k.e = r0
            return
    }

    public k(rx.functions.p<rx.e<rx.e<rx.b>>, rx.b> r2, rx.h r3) {
            r1 = this;
            r1.<init>()
            r1.a = r3
            rx.subjects.c r3 = rx.subjects.c.y7()
            rx.observers.f r0 = new rx.observers.f
            r0.<init>(r3)
            r1.b = r0
            rx.e r3 = r3.N3()
            java.lang.Object r2 = r2.call(r3)
            rx.b r2 = (rx.b) r2
            rx.m r2 = r2.n0()
            r1.c = r2
            return
    }

    public rx.h.a a() {
            r4 = this;
            rx.h r0 = r4.a
            rx.h$a r0 = r0.a()
            rx.internal.operators.g r1 = rx.internal.operators.g.y7()
            rx.observers.f r2 = new rx.observers.f
            r2.<init>(r1)
            rx.internal.schedulers.k$a r3 = new rx.internal.schedulers.k$a
            r3.<init>(r4, r0)
            rx.e r1 = r1.c3(r3)
            rx.internal.schedulers.k$b r3 = new rx.internal.schedulers.k$b
            r3.<init>(r4, r0, r2)
            rx.f<rx.e<rx.b>> r0 = r4.b
            r0.onNext(r1)
            return r3
    }

    public boolean isUnsubscribed() {
            r1 = this;
            rx.m r0 = r1.c
            boolean r0 = r0.isUnsubscribed()
            return r0
    }

    public void unsubscribe() {
            r1 = this;
            rx.m r0 = r1.c
            r0.unsubscribe()
            return
    }
}
