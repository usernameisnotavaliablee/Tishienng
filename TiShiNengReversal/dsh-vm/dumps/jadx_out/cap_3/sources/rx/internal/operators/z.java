package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class z<T, R> implements rx.e.a<R> {
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    final rx.e<? extends T> a;
    final rx.functions.p<? super T, ? extends rx.e<? extends R>> b;
    final int c;
    final int d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.g {
        final /* synthetic */ rx.internal.operators.z.d a;
        final /* synthetic */ rx.internal.operators.z b;

        a(rx.internal.operators.z r1, rx.internal.operators.z.d r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void request(long r2) {
                r1 = this;
                rx.internal.operators.z$d r0 = r1.a
                r0.H(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T, R> implements rx.g {
        final R a;
        final rx.internal.operators.z.d<T, R> b;
        boolean c;

        public b(R r1, rx.internal.operators.z.d<T, R> r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public void request(long r4) {
                r3 = this;
                boolean r0 = r3.c
                if (r0 != 0) goto L19
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 <= 0) goto L19
                r4 = 1
                r3.c = r4
                rx.internal.operators.z$d<T, R> r4 = r3.b
                R r5 = r3.a
                r4.B(r5)
                r0 = 1
                r4.s(r0)
            L19:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c<T, R> extends rx.l<R> {
        final rx.internal.operators.z.d<T, R> a;
        long b;

        public c(rx.internal.operators.z.d<T, R> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public void onCompleted() {
                r3 = this;
                rx.internal.operators.z$d<T, R> r0 = r3.a
                long r1 = r3.b
                r0.s(r1)
                return
        }

        public void onError(java.lang.Throwable r4) {
                r3 = this;
                rx.internal.operators.z$d<T, R> r0 = r3.a
                long r1 = r3.b
                r0.A(r4, r1)
                return
        }

        public void onNext(R r5) {
                r4 = this;
                long r0 = r4.b
                r2 = 1
                long r0 = r0 + r2
                r4.b = r0
                rx.internal.operators.z$d<T, R> r0 = r4.a
                r0.B(r5)
                return
        }

        public void setProducer(rx.g r2) {
                r1 = this;
                rx.internal.operators.z$d<T, R> r0 = r1.a
                rx.internal.producers.a r0 = r0.d
                r0.c(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class d<T, R> extends rx.l<T> {
        final rx.l<? super R> a;
        final rx.functions.p<? super T, ? extends rx.e<? extends R>> b;
        final int c;
        final rx.internal.producers.a d;
        final java.util.Queue<java.lang.Object> e;
        final java.util.concurrent.atomic.AtomicInteger f;
        final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> g;
        final rx.subscriptions.e h;
        volatile boolean i;
        volatile boolean j;

        public d(rx.l<? super R> r1, rx.functions.p<? super T, ? extends rx.e<? extends R>> r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r4
                rx.internal.producers.a r1 = new rx.internal.producers.a
                r1.<init>()
                r0.d = r1
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r1.<init>()
                r0.f = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.g = r1
                boolean r1 = rx.internal.util.unsafe.n0.f()
                if (r1 == 0) goto L2a
                rx.internal.util.unsafe.z r1 = new rx.internal.util.unsafe.z
                r1.<init>(r3)
                goto L2f
            L2a:
                rx.internal.util.atomic.d r1 = new rx.internal.util.atomic.d
                r1.<init>(r3)
            L2f:
                r0.e = r1
                rx.subscriptions.e r1 = new rx.subscriptions.e
                r1.<init>()
                r0.h = r1
                long r1 = (long) r3
                r0.request(r1)
                return
        }

        void A(java.lang.Throwable r3, long r4) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r2.g
                boolean r0 = rx.internal.util.ExceptionsUtils.addThrowable(r0, r3)
                if (r0 != 0) goto Lc
                r2.G(r3)
                return
            Lc:
                int r3 = r2.c
                if (r3 != 0) goto L25
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r3 = r2.g
                java.lang.Throwable r3 = rx.internal.util.ExceptionsUtils.terminate(r3)
                boolean r4 = rx.internal.util.ExceptionsUtils.isTerminated(r3)
                if (r4 != 0) goto L21
                rx.l<? super R> r4 = r2.a
                r4.onError(r3)
            L21:
                r2.unsubscribe()
                return
            L25:
                r0 = 0
                int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r3 == 0) goto L30
                rx.internal.producers.a r3 = r2.d
                r3.b(r4)
            L30:
                r3 = 0
                r2.j = r3
                r2.g()
                return
        }

        void B(R r2) {
                r1 = this;
                rx.l<? super R> r0 = r1.a
                r0.onNext(r2)
                return
        }

        void G(java.lang.Throwable r1) {
                r0 = this;
                rx.plugins.c.I(r1)
                return
        }

        void H(long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 <= 0) goto Lc
                rx.internal.producers.a r0 = r3.d
                r0.request(r4)
                return
            Lc:
                if (r2 < 0) goto Lf
                return
            Lf:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "n >= 0 required but it was "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        void g() {
                r7 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r7.f
                int r0 = r0.getAndIncrement()
                if (r0 == 0) goto La
                goto Lca
            La:
                int r0 = r7.c
            Lc:
                rx.l<? super R> r1 = r7.a
                boolean r1 = r1.isUnsubscribed()
                if (r1 == 0) goto L16
                goto Lca
            L16:
                boolean r1 = r7.j
                if (r1 != 0) goto Lc2
                r1 = 1
                if (r0 != r1) goto L37
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r2 = r7.g
                java.lang.Object r2 = r2.get()
                if (r2 == 0) goto L37
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r7.g
                java.lang.Throwable r0 = rx.internal.util.ExceptionsUtils.terminate(r0)
                boolean r1 = rx.internal.util.ExceptionsUtils.isTerminated(r0)
                if (r1 != 0) goto Lca
                rx.l<? super R> r1 = r7.a
                r1.onError(r0)
                return
            L37:
                boolean r2 = r7.i
                java.util.Queue<java.lang.Object> r3 = r7.e
                java.lang.Object r3 = r3.poll()
                if (r3 != 0) goto L43
                r4 = 1
                goto L44
            L43:
                r4 = 0
            L44:
                if (r2 == 0) goto L62
                if (r4 == 0) goto L62
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r7.g
                java.lang.Throwable r0 = rx.internal.util.ExceptionsUtils.terminate(r0)
                if (r0 != 0) goto L56
                rx.l<? super R> r0 = r7.a
                r0.onCompleted()
                return
            L56:
                boolean r1 = rx.internal.util.ExceptionsUtils.isTerminated(r0)
                if (r1 != 0) goto Lca
                rx.l<? super R> r1 = r7.a
                r1.onError(r0)
                return
            L62:
                if (r4 != 0) goto Lc2
                rx.functions.p<? super T, ? extends rx.e<? extends R>> r2 = r7.b     // Catch: java.lang.Throwable -> Lba
                java.lang.Object r3 = rx.internal.operators.v.e(r3)     // Catch: java.lang.Throwable -> Lba
                java.lang.Object r2 = r2.call(r3)     // Catch: java.lang.Throwable -> Lba
                rx.e r2 = (rx.e) r2     // Catch: java.lang.Throwable -> Lba
                if (r2 != 0) goto L7d
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "The source returned by the mapper was null"
                r0.<init>(r1)
                r7.j(r0)
                return
            L7d:
                rx.e r3 = rx.e.S1()
                r4 = 1
                if (r2 == r3) goto Lb5
                boolean r3 = r2 instanceof rx.internal.util.k
                if (r3 == 0) goto L9c
                rx.internal.util.k r2 = (rx.internal.util.k) r2
                r7.j = r1
                rx.internal.producers.a r1 = r7.d
                rx.internal.operators.z$b r3 = new rx.internal.operators.z$b
                java.lang.Object r2 = r2.y7()
                r3.<init>(r2, r7)
                r1.c(r3)
                goto Lb1
            L9c:
                rx.internal.operators.z$c r3 = new rx.internal.operators.z$c
                r3.<init>(r7)
                rx.subscriptions.e r6 = r7.h
                r6.b(r3)
                boolean r6 = r3.isUnsubscribed()
                if (r6 != 0) goto Lca
                r7.j = r1
                r2.J6(r3)
            Lb1:
                r7.request(r4)
                goto Lc2
            Lb5:
                r7.request(r4)
                goto Lc
            Lba:
                r0 = move-exception
                rx.exceptions.a.e(r0)
                r7.j(r0)
                return
            Lc2:
                java.util.concurrent.atomic.AtomicInteger r1 = r7.f
                int r1 = r1.decrementAndGet()
                if (r1 != 0) goto Lc
            Lca:
                return
        }

        void j(java.lang.Throwable r2) {
                r1 = this;
                r1.unsubscribe()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.g
                boolean r0 = rx.internal.util.ExceptionsUtils.addThrowable(r0, r2)
                if (r0 == 0) goto L1d
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r2 = r1.g
                java.lang.Throwable r2 = rx.internal.util.ExceptionsUtils.terminate(r2)
                boolean r0 = rx.internal.util.ExceptionsUtils.isTerminated(r2)
                if (r0 != 0) goto L1c
                rx.l<? super R> r0 = r1.a
                r0.onError(r2)
            L1c:
                return
            L1d:
                r1.G(r2)
                return
        }

        public void onCompleted() {
                r1 = this;
                r0 = 1
                r1.i = r0
                r1.g()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.g
                boolean r0 = rx.internal.util.ExceptionsUtils.addThrowable(r0, r2)
                if (r0 == 0) goto L2a
                r2 = 1
                r1.i = r2
                int r2 = r1.c
                if (r2 != 0) goto L26
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r2 = r1.g
                java.lang.Throwable r2 = rx.internal.util.ExceptionsUtils.terminate(r2)
                boolean r0 = rx.internal.util.ExceptionsUtils.isTerminated(r2)
                if (r0 != 0) goto L20
                rx.l<? super R> r0 = r1.a
                r0.onError(r2)
            L20:
                rx.subscriptions.e r2 = r1.h
                r2.unsubscribe()
                return
            L26:
                r1.g()
                return
            L2a:
                r1.G(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                java.util.Queue<java.lang.Object> r0 = r1.e
                java.lang.Object r2 = rx.internal.operators.v.j(r2)
                boolean r2 = r0.offer(r2)
                if (r2 != 0) goto L18
                r1.unsubscribe()
                rx.exceptions.MissingBackpressureException r2 = new rx.exceptions.MissingBackpressureException
                r2.<init>()
                r1.onError(r2)
                return
            L18:
                r1.g()
                return
        }

        void s(long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 == 0) goto Lb
                rx.internal.producers.a r0 = r3.d
                r0.b(r4)
            Lb:
                r4 = 0
                r3.j = r4
                r3.g()
                return
        }
    }

    public z(rx.e<? extends T> r1, rx.functions.p<? super T, ? extends rx.e<? extends R>> r2, int r3, int r4) {
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

    public void call(rx.l<? super R> r6) {
            r5 = this;
            int r0 = r5.d
            if (r0 != 0) goto La
            rx.observers.g r0 = new rx.observers.g
            r0.<init>(r6)
            goto Lb
        La:
            r0 = r6
        Lb:
            rx.internal.operators.z$d r1 = new rx.internal.operators.z$d
            rx.functions.p<? super T, ? extends rx.e<? extends R>> r2 = r5.b
            int r3 = r5.c
            int r4 = r5.d
            r1.<init>(r0, r2, r3, r4)
            r6.add(r1)
            rx.subscriptions.e r0 = r1.h
            r6.add(r0)
            rx.internal.operators.z$a r0 = new rx.internal.operators.z$a
            r0.<init>(r5, r1)
            r6.setProducer(r0)
            boolean r6 = r6.isUnsubscribed()
            if (r6 != 0) goto L31
            rx.e<? extends T> r6 = r5.a
            r6.J6(r1)
        L31:
            return
    }
}
