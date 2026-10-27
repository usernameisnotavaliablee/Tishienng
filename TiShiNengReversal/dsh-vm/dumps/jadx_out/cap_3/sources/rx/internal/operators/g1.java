package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class g1<T> implements rx.e.a<T> {
    final rx.e<T> a;
    final long b;
    final java.util.concurrent.TimeUnit c;
    final rx.h d;
    final rx.e<? extends T> e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends rx.l<T> {
        final rx.l<? super T> a;
        final rx.internal.producers.a b;

        a(rx.l<? super T> r1, rx.internal.producers.a r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.l<? super T> r0 = r1.a
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.l<? super T> r0 = r1.a
                r0.onError(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                rx.l<? super T> r0 = r1.a
                r0.onNext(r2)
                return
        }

        public void setProducer(rx.g r2) {
                r1 = this;
                rx.internal.producers.a r0 = r1.b
                r0.c(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T> extends rx.l<T> {
        final rx.l<? super T> a;
        final long b;
        final java.util.concurrent.TimeUnit c;
        final rx.h.a d;
        final rx.e<? extends T> e;
        final rx.internal.producers.a f;
        final java.util.concurrent.atomic.AtomicLong g;
        final rx.internal.subscriptions.SequentialSubscription h;
        final rx.internal.subscriptions.SequentialSubscription i;
        long j;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        final class a implements rx.functions.a {
            final long a;
            final /* synthetic */ rx.internal.operators.g1.b b;

            a(rx.internal.operators.g1.b r1, long r2) {
                    r0 = this;
                    r0.b = r1
                    r0.<init>()
                    r0.a = r2
                    return
            }

            public void call() {
                    r3 = this;
                    rx.internal.operators.g1$b r0 = r3.b
                    long r1 = r3.a
                    r0.g(r1)
                    return
            }
        }

        b(rx.l<? super T> r1, long r2, java.util.concurrent.TimeUnit r4, rx.h.a r5, rx.e<? extends T> r6) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r4
                r0.d = r5
                r0.e = r6
                rx.internal.producers.a r1 = new rx.internal.producers.a
                r1.<init>()
                r0.f = r1
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.g = r1
                rx.internal.subscriptions.SequentialSubscription r1 = new rx.internal.subscriptions.SequentialSubscription
                r1.<init>()
                r0.h = r1
                rx.internal.subscriptions.SequentialSubscription r2 = new rx.internal.subscriptions.SequentialSubscription
                r2.<init>(r0)
                r0.i = r2
                r0.add(r5)
                r0.add(r1)
                return
        }

        void g(long r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r3.g
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                boolean r4 = r0.compareAndSet(r4, r1)
                if (r4 != 0) goto Le
                goto L43
            Le:
                r3.unsubscribe()
                rx.e<? extends T> r4 = r3.e
                if (r4 != 0) goto L20
                rx.l<? super T> r4 = r3.a
                java.util.concurrent.TimeoutException r5 = new java.util.concurrent.TimeoutException
                r5.<init>()
                r4.onError(r5)
                return
            L20:
                long r4 = r3.j
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 == 0) goto L2d
                rx.internal.producers.a r0 = r3.f
                r0.b(r4)
            L2d:
                rx.internal.operators.g1$a r4 = new rx.internal.operators.g1$a
                rx.l<? super T> r5 = r3.a
                rx.internal.producers.a r0 = r3.f
                r4.<init>(r5, r0)
                rx.internal.subscriptions.SequentialSubscription r5 = r3.i
                boolean r5 = r5.replace(r4)
                if (r5 == 0) goto L43
                rx.e<? extends T> r5 = r3.e
                r5.r5(r4)
            L43:
                return
        }

        void j(long r5) {
                r4 = this;
                rx.internal.subscriptions.SequentialSubscription r0 = r4.h
                rx.h$a r1 = r4.d
                rx.internal.operators.g1$b$a r2 = new rx.internal.operators.g1$b$a
                r2.<init>(r4, r5)
                long r5 = r4.b
                java.util.concurrent.TimeUnit r3 = r4.c
                rx.m r5 = r1.e(r2, r5, r3)
                r0.replace(r5)
                return
        }

        public void onCompleted() {
                r5 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r5.g
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                long r3 = r0.getAndSet(r1)
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 == 0) goto L1e
                rx.internal.subscriptions.SequentialSubscription r0 = r5.h
                r0.unsubscribe()
                rx.l<? super T> r0 = r5.a
                r0.onCompleted()
                rx.h$a r0 = r5.d
                r0.unsubscribe()
            L1e:
                return
        }

        public void onError(java.lang.Throwable r6) {
                r5 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r5.g
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                long r3 = r0.getAndSet(r1)
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 == 0) goto L1f
                rx.internal.subscriptions.SequentialSubscription r0 = r5.h
                r0.unsubscribe()
                rx.l<? super T> r0 = r5.a
                r0.onError(r6)
                rx.h$a r6 = r5.d
                r6.unsubscribe()
                return
            L1f:
                rx.plugins.c.I(r6)
                return
        }

        public void onNext(T r8) {
                r7 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r7.g
                long r0 = r0.get()
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L36
                java.util.concurrent.atomic.AtomicLong r2 = r7.g
                r3 = 1
                long r5 = r0 + r3
                boolean r0 = r2.compareAndSet(r0, r5)
                if (r0 != 0) goto L1c
                goto L36
            L1c:
                rx.internal.subscriptions.SequentialSubscription r0 = r7.h
                java.lang.Object r0 = r0.get()
                rx.m r0 = (rx.m) r0
                if (r0 == 0) goto L29
                r0.unsubscribe()
            L29:
                long r0 = r7.j
                long r0 = r0 + r3
                r7.j = r0
                rx.l<? super T> r0 = r7.a
                r0.onNext(r8)
                r7.j(r5)
            L36:
                return
        }

        public void setProducer(rx.g r2) {
                r1 = this;
                rx.internal.producers.a r0 = r1.f
                r0.c(r2)
                return
        }
    }

    public g1(rx.e<T> r1, long r2, java.util.concurrent.TimeUnit r4, rx.h r5, rx.e<? extends T> r6) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r4
            r0.d = r5
            r0.e = r6
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super T> r8) {
            r7 = this;
            rx.internal.operators.g1$b r0 = new rx.internal.operators.g1$b
            long r2 = r7.b
            java.util.concurrent.TimeUnit r4 = r7.c
            rx.h r1 = r7.d
            rx.h$a r5 = r1.a()
            rx.e<? extends T> r6 = r7.e
            r1 = r8
            r0.<init>(r1, r2, r4, r5, r6)
            rx.internal.subscriptions.SequentialSubscription r8 = r0.i
            r1.add(r8)
            rx.internal.producers.a r8 = r0.f
            r1.setProducer(r8)
            r1 = 0
            r0.j(r1)
            rx.e<T> r8 = r7.a
            r8.r5(r0)
            return
    }
}
