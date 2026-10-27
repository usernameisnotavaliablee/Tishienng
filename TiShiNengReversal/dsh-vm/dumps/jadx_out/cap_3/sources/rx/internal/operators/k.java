package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class k implements rx.b.j0 {
    final rx.e<rx.b> a;
    final int b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a extends rx.l<rx.b> {
        final rx.d a;
        final rx.internal.subscriptions.SequentialSubscription b;
        final rx.internal.util.unsafe.z<rx.b> c;
        final rx.internal.operators.k.a.C0015a d;
        final java.util.concurrent.atomic.AtomicBoolean e;
        volatile boolean f;
        volatile boolean g;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.operators.k$a$a, reason: collision with other inner class name */
        final class C0015a extends java.util.concurrent.atomic.AtomicInteger implements rx.d {
            private static final long serialVersionUID = 7233503139645205620L;
            final /* synthetic */ rx.internal.operators.k.a a;

            C0015a(rx.internal.operators.k.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void a(rx.m r2) {
                    r1 = this;
                    rx.internal.operators.k$a r0 = r1.a
                    rx.internal.subscriptions.SequentialSubscription r0 = r0.b
                    r0.set(r2)
                    return
            }

            public void onCompleted() {
                    r1 = this;
                    rx.internal.operators.k$a r0 = r1.a
                    r0.j()
                    return
            }

            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    rx.internal.operators.k$a r0 = r1.a
                    r0.s(r2)
                    return
            }
        }

        public a(rx.d r2, int r3) {
                r1 = this;
                r1.<init>()
                r1.a = r2
                rx.internal.util.unsafe.z r2 = new rx.internal.util.unsafe.z
                r2.<init>(r3)
                r1.c = r2
                rx.internal.subscriptions.SequentialSubscription r2 = new rx.internal.subscriptions.SequentialSubscription
                r2.<init>()
                r1.b = r2
                rx.internal.operators.k$a$a r0 = new rx.internal.operators.k$a$a
                r0.<init>(r1)
                r1.d = r0
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                r0.<init>()
                r1.e = r0
                r1.add(r2)
                long r2 = (long) r3
                r1.request(r2)
                return
        }

        public void A(rx.b r2) {
                r1 = this;
                rx.internal.util.unsafe.z<rx.b> r0 = r1.c
                boolean r2 = r0.offer(r2)
                if (r2 != 0) goto L11
                rx.exceptions.MissingBackpressureException r2 = new rx.exceptions.MissingBackpressureException
                r2.<init>()
                r1.onError(r2)
                return
            L11:
                r1.g()
                return
        }

        void g() {
                r5 = this;
                rx.internal.operators.k$a$a r0 = r5.d
                int r1 = r0.getAndIncrement()
                if (r1 == 0) goto L9
                goto L40
            L9:
                boolean r1 = r5.isUnsubscribed()
                if (r1 == 0) goto L10
                goto L40
            L10:
                boolean r1 = r5.g
                if (r1 != 0) goto L3a
                boolean r1 = r5.f
                rx.internal.util.unsafe.z<rx.b> r2 = r5.c
                java.lang.Object r2 = r2.poll()
                rx.b r2 = (rx.b) r2
                r3 = 1
                if (r2 != 0) goto L23
                r4 = 1
                goto L24
            L23:
                r4 = 0
            L24:
                if (r1 == 0) goto L2e
                if (r4 == 0) goto L2e
                rx.d r0 = r5.a
                r0.onCompleted()
                return
            L2e:
                if (r4 != 0) goto L3a
                r5.g = r3
                r2.q0(r0)
                r1 = 1
                r5.request(r1)
            L3a:
                int r1 = r0.decrementAndGet()
                if (r1 != 0) goto L9
            L40:
                return
        }

        void j() {
                r1 = this;
                r0 = 0
                r1.g = r0
                r1.g()
                return
        }

        public void onCompleted() {
                r1 = this;
                boolean r0 = r1.f
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.f = r0
                r1.g()
                return
        }

        public void onError(java.lang.Throwable r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.e
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L10
                rx.d r0 = r3.a
                r0.onError(r4)
                return
            L10:
                rx.plugins.c.I(r4)
                return
        }

        public /* bridge */ /* synthetic */ void onNext(java.lang.Object r1) {
                r0 = this;
                rx.b r1 = (rx.b) r1
                r0.A(r1)
                return
        }

        void s(java.lang.Throwable r1) {
                r0 = this;
                r0.unsubscribe()
                r0.onError(r1)
                return
        }
    }

    public k(rx.e<? extends rx.b> r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
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
            rx.internal.operators.k$a r0 = new rx.internal.operators.k$a
            int r1 = r2.b
            r0.<init>(r3, r1)
            r3.a(r0)
            rx.e<rx.b> r3 = r2.a
            r3.J6(r0)
            return
    }
}
