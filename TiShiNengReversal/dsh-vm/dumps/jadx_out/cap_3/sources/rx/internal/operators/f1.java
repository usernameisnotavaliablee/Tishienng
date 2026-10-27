package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class f1<T, U, V> implements rx.e.a<T> {
    final rx.e<T> a;
    final rx.e<U> b;
    final rx.functions.p<? super T, ? extends rx.e<V>> c;
    final rx.e<? extends T> d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends rx.l<T> {
        final rx.l<? super T> a;
        final rx.functions.p<? super T, ? extends rx.e<?>> b;
        final rx.e<? extends T> c;
        final rx.internal.producers.a d;
        final java.util.concurrent.atomic.AtomicLong e;
        final rx.internal.subscriptions.SequentialSubscription f;
        final rx.internal.subscriptions.SequentialSubscription g;
        long h;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.operators.f1$a$a, reason: collision with other inner class name */
        final class C0008a extends rx.l<java.lang.Object> {
            final long a;
            boolean b;
            final /* synthetic */ rx.internal.operators.f1.a c;

            C0008a(rx.internal.operators.f1.a r1, long r2) {
                    r0 = this;
                    r0.c = r1
                    r0.<init>()
                    r0.a = r2
                    return
            }

            public void onCompleted() {
                    r3 = this;
                    boolean r0 = r3.b
                    if (r0 != 0) goto Le
                    r0 = 1
                    r3.b = r0
                    rx.internal.operators.f1$a r0 = r3.c
                    long r1 = r3.a
                    r0.g(r1)
                Le:
                    return
            }

            public void onError(java.lang.Throwable r4) {
                    r3 = this;
                    boolean r0 = r3.b
                    if (r0 != 0) goto Lf
                    r0 = 1
                    r3.b = r0
                    rx.internal.operators.f1$a r0 = r3.c
                    long r1 = r3.a
                    r0.j(r1, r4)
                    return
                Lf:
                    rx.plugins.c.I(r4)
                    return
            }

            public void onNext(java.lang.Object r3) {
                    r2 = this;
                    boolean r3 = r2.b
                    if (r3 != 0) goto L11
                    r3 = 1
                    r2.b = r3
                    r2.unsubscribe()
                    rx.internal.operators.f1$a r3 = r2.c
                    long r0 = r2.a
                    r3.g(r0)
                L11:
                    return
            }
        }

        a(rx.l<? super T> r1, rx.functions.p<? super T, ? extends rx.e<?>> r2, rx.e<? extends T> r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                rx.internal.producers.a r1 = new rx.internal.producers.a
                r1.<init>()
                r0.d = r1
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.e = r1
                rx.internal.subscriptions.SequentialSubscription r1 = new rx.internal.subscriptions.SequentialSubscription
                r1.<init>()
                r0.f = r1
                rx.internal.subscriptions.SequentialSubscription r2 = new rx.internal.subscriptions.SequentialSubscription
                r2.<init>(r0)
                r0.g = r2
                r0.add(r1)
                return
        }

        void g(long r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r3.e
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                boolean r4 = r0.compareAndSet(r4, r1)
                if (r4 != 0) goto Le
                goto L43
            Le:
                r3.unsubscribe()
                rx.e<? extends T> r4 = r3.c
                if (r4 != 0) goto L20
                rx.l<? super T> r4 = r3.a
                java.util.concurrent.TimeoutException r5 = new java.util.concurrent.TimeoutException
                r5.<init>()
                r4.onError(r5)
                return
            L20:
                long r4 = r3.h
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 == 0) goto L2d
                rx.internal.producers.a r0 = r3.d
                r0.b(r4)
            L2d:
                rx.internal.operators.g1$a r4 = new rx.internal.operators.g1$a
                rx.l<? super T> r5 = r3.a
                rx.internal.producers.a r0 = r3.d
                r4.<init>(r5, r0)
                rx.internal.subscriptions.SequentialSubscription r5 = r3.g
                boolean r5 = r5.replace(r4)
                if (r5 == 0) goto L43
                rx.e<? extends T> r5 = r3.c
                r5.r5(r4)
            L43:
                return
        }

        void j(long r4, java.lang.Throwable r6) {
                r3 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r3.e
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                boolean r4 = r0.compareAndSet(r4, r1)
                if (r4 == 0) goto L16
                r3.unsubscribe()
                rx.l<? super T> r4 = r3.a
                r4.onError(r6)
                return
            L16:
                rx.plugins.c.I(r6)
                return
        }

        public void onCompleted() {
                r5 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r5.e
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                long r3 = r0.getAndSet(r1)
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 == 0) goto L19
                rx.internal.subscriptions.SequentialSubscription r0 = r5.f
                r0.unsubscribe()
                rx.l<? super T> r0 = r5.a
                r0.onCompleted()
            L19:
                return
        }

        public void onError(java.lang.Throwable r6) {
                r5 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r5.e
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                long r3 = r0.getAndSet(r1)
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 == 0) goto L1a
                rx.internal.subscriptions.SequentialSubscription r0 = r5.f
                r0.unsubscribe()
                rx.l<? super T> r0 = r5.a
                r0.onError(r6)
                return
            L1a:
                rx.plugins.c.I(r6)
                return
        }

        public void onNext(T r10) {
                r9 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r9.e
                long r0 = r0.get()
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L67
                java.util.concurrent.atomic.AtomicLong r4 = r9.e
                r5 = 1
                long r7 = r0 + r5
                boolean r0 = r4.compareAndSet(r0, r7)
                if (r0 != 0) goto L1c
                goto L67
            L1c:
                rx.internal.subscriptions.SequentialSubscription r0 = r9.f
                java.lang.Object r0 = r0.get()
                rx.m r0 = (rx.m) r0
                if (r0 == 0) goto L29
                r0.unsubscribe()
            L29:
                rx.l<? super T> r0 = r9.a
                r0.onNext(r10)
                long r0 = r9.h
                long r0 = r0 + r5
                r9.h = r0
                rx.functions.p<? super T, ? extends rx.e<?>> r0 = r9.b     // Catch: java.lang.Throwable -> L56
                java.lang.Object r10 = r0.call(r10)     // Catch: java.lang.Throwable -> L56
                rx.e r10 = (rx.e) r10     // Catch: java.lang.Throwable -> L56
                if (r10 == 0) goto L4e
                rx.internal.operators.f1$a$a r0 = new rx.internal.operators.f1$a$a
                r0.<init>(r9, r7)
                rx.internal.subscriptions.SequentialSubscription r1 = r9.f
                boolean r1 = r1.replace(r0)
                if (r1 == 0) goto L67
                r10.r5(r0)
                return
            L4e:
                java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L56
                java.lang.String r0 = "The itemTimeoutIndicator returned a null Observable"
                r10.<init>(r0)     // Catch: java.lang.Throwable -> L56
                throw r10     // Catch: java.lang.Throwable -> L56
            L56:
                r10 = move-exception
                rx.exceptions.a.e(r10)
                r9.unsubscribe()
                java.util.concurrent.atomic.AtomicLong r0 = r9.e
                r0.getAndSet(r2)
                rx.l<? super T> r0 = r9.a
                r0.onError(r10)
            L67:
                return
        }

        void s(rx.e<?> r4) {
                r3 = this;
                if (r4 == 0) goto L14
                rx.internal.operators.f1$a$a r0 = new rx.internal.operators.f1$a$a
                r1 = 0
                r0.<init>(r3, r1)
                rx.internal.subscriptions.SequentialSubscription r1 = r3.f
                boolean r1 = r1.replace(r0)
                if (r1 == 0) goto L14
                r4.r5(r0)
            L14:
                return
        }

        public void setProducer(rx.g r2) {
                r1 = this;
                rx.internal.producers.a r0 = r1.d
                r0.c(r2)
                return
        }
    }

    public f1(rx.e<T> r1, rx.e<U> r2, rx.functions.p<? super T, ? extends rx.e<V>> r3, rx.e<? extends T> r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super T> r4) {
            r3 = this;
            rx.internal.operators.f1$a r0 = new rx.internal.operators.f1$a
            rx.functions.p<? super T, ? extends rx.e<V>> r1 = r3.c
            rx.e<? extends T> r2 = r3.d
            r0.<init>(r4, r1, r2)
            rx.internal.subscriptions.SequentialSubscription r1 = r0.g
            r4.add(r1)
            rx.internal.producers.a r1 = r0.d
            r4.setProducer(r1)
            rx.e<U> r4 = r3.b
            r0.s(r4)
            rx.e<T> r4 = r3.a
            r4.r5(r0)
            return
    }
}
