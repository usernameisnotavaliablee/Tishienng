package rx.internal.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class k<T> extends rx.e<T> {
    static final boolean c = false;
    final T b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.functions.p<rx.functions.a, rx.m> {
        final /* synthetic */ rx.internal.schedulers.b a;
        final /* synthetic */ rx.internal.util.k b;

        a(rx.internal.util.k r1, rx.internal.schedulers.b r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
                r0 = this;
                rx.functions.a r1 = (rx.functions.a) r1
                rx.m r1 = r0.call(r1)
                return r1
        }

        public rx.m call(rx.functions.a r2) {
                r1 = this;
                rx.internal.schedulers.b r0 = r1.a
                rx.m r2 = r0.e(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements rx.functions.p<rx.functions.a, rx.m> {
        final /* synthetic */ rx.h a;
        final /* synthetic */ rx.internal.util.k b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements rx.functions.a {
            final /* synthetic */ rx.functions.a a;
            final /* synthetic */ rx.h.a b;
            final /* synthetic */ rx.internal.util.k.b c;

            a(rx.internal.util.k.b r1, rx.functions.a r2, rx.h.a r3) {
                    r0 = this;
                    r0.c = r1
                    r0.a = r2
                    r0.b = r3
                    r0.<init>()
                    return
            }

            public void call() {
                    r2 = this;
                    rx.functions.a r0 = r2.a     // Catch: java.lang.Throwable -> Lb
                    r0.call()     // Catch: java.lang.Throwable -> Lb
                    rx.h$a r0 = r2.b
                    r0.unsubscribe()
                    return
                Lb:
                    r0 = move-exception
                    rx.h$a r1 = r2.b
                    r1.unsubscribe()
                    throw r0
            }
        }

        b(rx.internal.util.k r1, rx.h r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
                r0 = this;
                rx.functions.a r1 = (rx.functions.a) r1
                rx.m r1 = r0.call(r1)
                return r1
        }

        public rx.m call(rx.functions.a r3) {
                r2 = this;
                rx.h r0 = r2.a
                rx.h$a r0 = r0.a()
                rx.internal.util.k$b$a r1 = new rx.internal.util.k$b$a
                r1.<init>(r2, r3, r0)
                r0.d(r1)
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c<R> implements rx.e.a<R> {
        final /* synthetic */ rx.functions.p a;
        final /* synthetic */ rx.internal.util.k b;

        c(rx.internal.util.k r1, rx.functions.p r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                rx.l r1 = (rx.l) r1
                r0.call(r1)
                return
        }

        public void call(rx.l<? super R> r3) {
                r2 = this;
                rx.functions.p r0 = r2.a
                rx.internal.util.k r1 = r2.b
                T r1 = r1.b
                java.lang.Object r0 = r0.call(r1)
                rx.e r0 = (rx.e) r0
                boolean r1 = r0 instanceof rx.internal.util.k
                if (r1 == 0) goto L1c
                rx.internal.util.k r0 = (rx.internal.util.k) r0
                T r0 = r0.b
                rx.g r0 = rx.internal.util.k.x7(r3, r0)
                r3.setProducer(r0)
                return
            L1c:
                rx.l r3 = rx.observers.h.f(r3)
                r0.J6(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class d<T> implements rx.e.a<T> {
        final T a;

        d(T r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                rx.l r1 = (rx.l) r1
                r0.call(r1)
                return
        }

        public void call(rx.l<? super T> r2) {
                r1 = this;
                T r0 = r1.a
                rx.g r0 = rx.internal.util.k.x7(r2, r0)
                r2.setProducer(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class e<T> implements rx.e.a<T> {
        final T a;
        final rx.functions.p<rx.functions.a, rx.m> b;

        e(T r1, rx.functions.p<rx.functions.a, rx.m> r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
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
                rx.internal.util.k$f r0 = new rx.internal.util.k$f
                T r1 = r3.a
                rx.functions.p<rx.functions.a, rx.m> r2 = r3.b
                r0.<init>(r4, r1, r2)
                r4.setProducer(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class f<T> extends java.util.concurrent.atomic.AtomicBoolean implements rx.g, rx.functions.a {
        private static final long serialVersionUID = -2466317989629281651L;
        final rx.l<? super T> a;
        final T b;
        final rx.functions.p<rx.functions.a, rx.m> c;

        public f(rx.l<? super T> r1, T r2, rx.functions.p<rx.functions.a, rx.m> r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                return
        }

        public void call() {
                r3 = this;
                rx.l<? super T> r0 = r3.a
                boolean r1 = r0.isUnsubscribed()
                if (r1 == 0) goto L9
                goto L14
            L9:
                T r1 = r3.b
                r0.onNext(r1)     // Catch: java.lang.Throwable -> L19
                boolean r1 = r0.isUnsubscribed()
                if (r1 == 0) goto L15
            L14:
                return
            L15:
                r0.onCompleted()
                return
            L19:
                r2 = move-exception
                rx.exceptions.a.g(r2, r0, r1)
                return
        }

        public void request(long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto L1e
                if (r2 == 0) goto L1d
                r4 = 0
                r5 = 1
                boolean r4 = r3.compareAndSet(r4, r5)
                if (r4 == 0) goto L1d
                rx.l<? super T> r4 = r3.a
                rx.functions.p<rx.functions.a, rx.m> r5 = r3.c
                java.lang.Object r5 = r5.call(r3)
                rx.m r5 = (rx.m) r5
                r4.add(r5)
            L1d:
                return
            L1e:
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

        @Override // java.util.concurrent.atomic.AtomicBoolean
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ScalarAsyncProducer["
                r0.append(r1)
                T r1 = r2.b
                r0.append(r1)
                java.lang.String r1 = ", "
                r0.append(r1)
                boolean r1 = r2.get()
                r0.append(r1)
                java.lang.String r1 = "]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class g<T> implements rx.g {
        final rx.l<? super T> a;
        final T b;
        boolean c;

        public g(rx.l<? super T> r1, T r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public void request(long r4) {
                r3 = this;
                boolean r0 = r3.c
                if (r0 == 0) goto L5
                goto L25
            L5:
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto L2f
                if (r2 != 0) goto Le
                goto L25
            Le:
                r4 = 1
                r3.c = r4
                rx.l<? super T> r4 = r3.a
                boolean r5 = r4.isUnsubscribed()
                if (r5 == 0) goto L1a
                goto L25
            L1a:
                T r5 = r3.b
                r4.onNext(r5)     // Catch: java.lang.Throwable -> L2a
                boolean r5 = r4.isUnsubscribed()
                if (r5 == 0) goto L26
            L25:
                return
            L26:
                r4.onCompleted()
                return
            L2a:
                r0 = move-exception
                rx.exceptions.a.g(r0, r4, r5)
                return
            L2f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "n >= required but it was "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }
    }

    static {
            java.lang.String r0 = "rx.just.strong-mode"
            java.lang.String r1 = "false"
            java.lang.String r0 = java.lang.System.getProperty(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            rx.internal.util.k.c = r0
            return
    }

    protected k(T r2) {
            r1 = this;
            rx.internal.util.k$d r0 = new rx.internal.util.k$d
            r0.<init>(r2)
            rx.e$a r0 = rx.plugins.c.G(r0)
            r1.<init>(r0)
            r1.b = r2
            return
    }

    public static <T> rx.internal.util.k<T> w7(T r1) {
            rx.internal.util.k r0 = new rx.internal.util.k
            r0.<init>(r1)
            return r0
    }

    static <T> rx.g x7(rx.l<? super T> r1, T r2) {
            boolean r0 = rx.internal.util.k.c
            if (r0 == 0) goto La
            rx.internal.producers.SingleProducer r0 = new rx.internal.producers.SingleProducer
            r0.<init>(r1, r2)
            return r0
        La:
            rx.internal.util.k$g r0 = new rx.internal.util.k$g
            r0.<init>(r1, r2)
            return r0
    }

    public rx.e<T> A7(rx.h r3) {
            r2 = this;
            boolean r0 = r3 instanceof rx.internal.schedulers.b
            if (r0 == 0) goto Lc
            rx.internal.schedulers.b r3 = (rx.internal.schedulers.b) r3
            rx.internal.util.k$a r0 = new rx.internal.util.k$a
            r0.<init>(r2, r3)
            goto L11
        Lc:
            rx.internal.util.k$b r0 = new rx.internal.util.k$b
            r0.<init>(r2, r3)
        L11:
            rx.internal.util.k$e r3 = new rx.internal.util.k$e
            T r1 = r2.b
            r3.<init>(r1, r0)
            rx.e r3 = rx.e.I6(r3)
            return r3
    }

    public T y7() {
            r1 = this;
            T r0 = r1.b
            return r0
    }

    public <R> rx.e<R> z7(rx.functions.p<? super T, ? extends rx.e<? extends R>> r2) {
            r1 = this;
            rx.internal.util.k$c r0 = new rx.internal.util.k$c
            r0.<init>(r1, r2)
            rx.e r2 = rx.e.I6(r0)
            return r2
    }
}
