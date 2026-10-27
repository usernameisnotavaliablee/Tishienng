package rx.observables;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@rx.annotations.Beta
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class a<S, T> implements rx.e.a<T> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: rx.observables.a$a, reason: collision with other inner class name */
    static class C0045a implements rx.functions.r<S, java.lang.Long, rx.f<rx.e<? extends T>>, S> {
        final /* synthetic */ rx.functions.d a;

        C0045a(rx.functions.d r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public S call(S r2, java.lang.Long r3, rx.f<rx.e<? extends T>> r4) {
                r1 = this;
                rx.functions.d r0 = r1.a
                r0.call(r2, r3, r4)
                return r2
        }

        public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
                r0 = this;
                java.lang.Long r2 = (java.lang.Long) r2
                rx.f r3 = (rx.f) r3
                java.lang.Object r1 = r0.call(r1, r2, r3)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b implements rx.functions.r<S, java.lang.Long, rx.f<rx.e<? extends T>>, S> {
        final /* synthetic */ rx.functions.d a;

        b(rx.functions.d r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public S call(S r2, java.lang.Long r3, rx.f<rx.e<? extends T>> r4) {
                r1 = this;
                rx.functions.d r0 = r1.a
                r0.call(r2, r3, r4)
                return r2
        }

        public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
                r0 = this;
                java.lang.Long r2 = (java.lang.Long) r2
                rx.f r3 = (rx.f) r3
                java.lang.Object r1 = r0.call(r1, r2, r3)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class c implements rx.functions.r<java.lang.Void, java.lang.Long, rx.f<rx.e<? extends T>>, java.lang.Void> {
        final /* synthetic */ rx.functions.c a;

        c(rx.functions.c r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
                r0 = this;
                java.lang.Void r1 = (java.lang.Void) r1
                java.lang.Long r2 = (java.lang.Long) r2
                rx.f r3 = (rx.f) r3
                java.lang.Void r1 = r0.call(r1, r2, r3)
                return r1
        }

        public java.lang.Void call(java.lang.Void r2, java.lang.Long r3, rx.f<rx.e<? extends T>> r4) {
                r1 = this;
                rx.functions.c r0 = r1.a
                r0.call(r3, r4)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class d implements rx.functions.r<java.lang.Void, java.lang.Long, rx.f<rx.e<? extends T>>, java.lang.Void> {
        final /* synthetic */ rx.functions.c a;

        d(rx.functions.c r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
                r0 = this;
                java.lang.Void r1 = (java.lang.Void) r1
                java.lang.Long r2 = (java.lang.Long) r2
                rx.f r3 = (rx.f) r3
                java.lang.Void r1 = r0.call(r1, r2, r3)
                return r1
        }

        public java.lang.Void call(java.lang.Void r1, java.lang.Long r2, rx.f<rx.e<? extends T>> r3) {
                r0 = this;
                rx.functions.c r1 = r0.a
                r1.call(r2, r3)
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class e implements rx.functions.b<java.lang.Void> {
        final /* synthetic */ rx.functions.a a;

        e(rx.functions.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                java.lang.Void r1 = (java.lang.Void) r1
                r0.call(r1)
                return
        }

        public void call(java.lang.Void r1) {
                r0 = this;
                rx.functions.a r1 = r0.a
                r1.call()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f extends rx.l<T> {
        final /* synthetic */ rx.l a;
        final /* synthetic */ rx.observables.a.i b;
        final /* synthetic */ rx.observables.a c;

        f(rx.observables.a r1, rx.l r2, rx.observables.a.i r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.l r0 = r1.a
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.l r0 = r1.a
                r0.onError(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                rx.l r0 = r1.a
                r0.onNext(r2)
                return
        }

        public void setProducer(rx.g r2) {
                r1 = this;
                rx.observables.a$i r0 = r1.b
                r0.s(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g implements rx.functions.p<rx.e<T>, rx.e<T>> {
        final /* synthetic */ rx.observables.a a;

        g(rx.observables.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
                r0 = this;
                rx.e r1 = (rx.e) r1
                rx.e r1 = r0.call(r1)
                return r1
        }

        public rx.e<T> call(rx.e<T> r1) {
                r0 = this;
                rx.e r1 = r1.N3()
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class h<S, T> extends rx.observables.a<S, T> {
        private final rx.functions.o<? extends S> a;
        private final rx.functions.r<? super S, java.lang.Long, ? super rx.f<rx.e<? extends T>>, ? extends S> b;
        private final rx.functions.b<? super S> c;

        public h(rx.functions.o<? extends S> r2, rx.functions.r<? super S, java.lang.Long, ? super rx.f<rx.e<? extends T>>, ? extends S> r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        h(rx.functions.o<? extends S> r1, rx.functions.r<? super S, java.lang.Long, ? super rx.f<rx.e<? extends T>>, ? extends S> r2, rx.functions.b<? super S> r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                return
        }

        public h(rx.functions.r<S, java.lang.Long, rx.f<rx.e<? extends T>>, S> r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0, r2, r0)
                return
        }

        public h(rx.functions.r<S, java.lang.Long, rx.f<rx.e<? extends T>>, S> r2, rx.functions.b<? super S> r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r0, r2, r3)
                return
        }

        @Override // rx.observables.a
        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                rx.l r1 = (rx.l) r1
                super.call(r1)
                return
        }

        @Override // rx.observables.a
        protected S g() {
                r1 = this;
                rx.functions.o<? extends S> r0 = r1.a
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.Object r0 = r0.call()
                return r0
        }

        @Override // rx.observables.a
        protected S h(S r2, long r3, rx.f<rx.e<? extends T>> r5) {
                r1 = this;
                rx.functions.r<? super S, java.lang.Long, ? super rx.f<rx.e<? extends T>>, ? extends S> r0 = r1.b
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                java.lang.Object r2 = r0.call(r2, r3, r5)
                return r2
        }

        @Override // rx.observables.a
        protected void i(S r2) {
                r1 = this;
                rx.functions.b<? super S> r0 = r1.c
                if (r0 == 0) goto L7
                r0.call(r2)
            L7:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class i<S, T> implements rx.g, rx.m, rx.f<rx.e<? extends T>> {
        final java.util.concurrent.atomic.AtomicBoolean a;
        private final rx.observables.a<S, T> b;
        private final rx.observers.f<rx.e<? extends T>> c;
        final rx.subscriptions.b d;
        private boolean e;
        private boolean f;
        private S g;
        private final rx.observables.a.j<rx.e<T>> h;
        boolean i;
        java.util.List<java.lang.Long> j;
        rx.g k;
        long l;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.observables.a$i$a, reason: collision with other inner class name */
        class C0046a extends rx.l<T> {
            long a;
            final /* synthetic */ long b;
            final /* synthetic */ rx.internal.operators.g c;
            final /* synthetic */ rx.observables.a.i d;

            C0046a(rx.observables.a.i r1, long r2, rx.internal.operators.g r4) {
                    r0 = this;
                    r0.d = r1
                    r0.b = r2
                    r0.c = r4
                    r0.<init>()
                    r0.a = r2
                    return
            }

            public void onCompleted() {
                    r5 = this;
                    rx.internal.operators.g r0 = r5.c
                    r0.onCompleted()
                    long r0 = r5.a
                    r2 = 0
                    int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r4 <= 0) goto L12
                    rx.observables.a$i r2 = r5.d
                    r2.j(r0)
                L12:
                    return
            }

            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    rx.internal.operators.g r0 = r1.c
                    r0.onError(r2)
                    return
            }

            public void onNext(T r5) {
                    r4 = this;
                    long r0 = r4.a
                    r2 = 1
                    long r0 = r0 - r2
                    r4.a = r0
                    rx.internal.operators.g r0 = r4.c
                    r0.onNext(r5)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class b implements rx.functions.a {
            final /* synthetic */ rx.l a;
            final /* synthetic */ rx.observables.a.i b;

            b(rx.observables.a.i r1, rx.l r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            public void call() {
                    r2 = this;
                    rx.observables.a$i r0 = r2.b
                    rx.subscriptions.b r0 = r0.d
                    rx.l r1 = r2.a
                    r0.f(r1)
                    return
            }
        }

        public i(rx.observables.a<S, T> r2, S r3, rx.observables.a.j<rx.e<T>> r4) {
                r1 = this;
                r1.<init>()
                rx.subscriptions.b r0 = new rx.subscriptions.b
                r0.<init>()
                r1.d = r0
                r1.b = r2
                rx.observers.f r2 = new rx.observers.f
                r2.<init>(r1)
                r1.c = r2
                r1.g = r3
                r1.h = r4
                java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
                r2.<init>()
                r1.a = r2
                return
        }

        private void A(rx.e<? extends T> r5) {
                r4 = this;
                rx.internal.operators.g r0 = rx.internal.operators.g.y7()
                long r1 = r4.l
                rx.observables.a$i$a r3 = new rx.observables.a$i$a
                r3.<init>(r4, r1, r0)
                rx.subscriptions.b r1 = r4.d
                r1.a(r3)
                rx.observables.a$i$b r1 = new rx.observables.a$i$b
                r1.<init>(r4, r3)
                rx.e r5 = r5.O1(r1)
                r5.r5(r3)
                rx.observables.a$j<rx.e<T>> r5 = r4.h
                r5.onNext(r0)
                return
        }

        private void e(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.e
                if (r0 == 0) goto L8
                rx.plugins.c.I(r2)
                return
            L8:
                r0 = 1
                r1.e = r0
                rx.observables.a$j<rx.e<T>> r0 = r1.h
                r0.onError(r2)
                r1.d()
                return
        }

        boolean B(long r3) {
                r2 = this;
                boolean r0 = r2.isUnsubscribed()
                r1 = 1
                if (r0 == 0) goto Lb
                r2.d()
                return r1
            Lb:
                r0 = 0
                r2.f = r0     // Catch: java.lang.Throwable -> L20
                r2.l = r3     // Catch: java.lang.Throwable -> L20
                r2.f(r3)     // Catch: java.lang.Throwable -> L20
                boolean r3 = r2.e     // Catch: java.lang.Throwable -> L20
                if (r3 == 0) goto L22
                rx.subscriptions.b r3 = r2.d     // Catch: java.lang.Throwable -> L20
                boolean r3 = r3.e()     // Catch: java.lang.Throwable -> L20
                if (r3 == 0) goto L28
                goto L22
            L20:
                r3 = move-exception
                goto L3c
            L22:
                boolean r3 = r2.isUnsubscribed()     // Catch: java.lang.Throwable -> L20
                if (r3 == 0) goto L2c
            L28:
                r2.d()     // Catch: java.lang.Throwable -> L20
                return r1
            L2c:
                boolean r3 = r2.f     // Catch: java.lang.Throwable -> L20
                if (r3 != 0) goto L3b
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L20
                java.lang.String r4 = "No events emitted!"
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L20
                r2.e(r3)     // Catch: java.lang.Throwable -> L20
                return r1
            L3b:
                return r0
            L3c:
                r2.e(r3)
                return r1
        }

        void d() {
                r2 = this;
                rx.subscriptions.b r0 = r2.d
                r0.unsubscribe()
                rx.observables.a<S, T> r0 = r2.b     // Catch: java.lang.Throwable -> Ld
                S r1 = r2.g     // Catch: java.lang.Throwable -> Ld
                r0.i(r1)     // Catch: java.lang.Throwable -> Ld
                return
            Ld:
                r0 = move-exception
                r2.e(r0)
                return
        }

        public void f(long r4) {
                r3 = this;
                rx.observables.a<S, T> r0 = r3.b
                S r1 = r3.g
                rx.observers.f<rx.e<? extends T>> r2 = r3.c
                java.lang.Object r4 = r0.h(r1, r4, r2)
                r3.g = r4
                return
        }

        public void g(rx.e<? extends T> r2) {
                r1 = this;
                boolean r0 = r1.f
                if (r0 != 0) goto L10
                r0 = 1
                r1.f = r0
                boolean r0 = r1.e
                if (r0 == 0) goto Lc
                return
            Lc:
                r1.A(r2)
                return
            L10:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "onNext called multiple times!"
                r2.<init>(r0)
                throw r2
        }

        public boolean isUnsubscribed() {
                r1 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.a
                boolean r0 = r0.get()
                return r0
        }

        public void j(long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 != 0) goto L7
                goto L5a
            L7:
                if (r2 < 0) goto L5f
                monitor-enter(r3)
                boolean r0 = r3.i     // Catch: java.lang.Throwable -> L1a
                if (r0 == 0) goto L25
                java.util.List<java.lang.Long> r0 = r3.j     // Catch: java.lang.Throwable -> L1a
                if (r0 != 0) goto L1c
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1a
                r0.<init>()     // Catch: java.lang.Throwable -> L1a
                r3.j = r0     // Catch: java.lang.Throwable -> L1a
                goto L1c
            L1a:
                r4 = move-exception
                goto L5d
            L1c:
                java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L1a
                r0.add(r4)     // Catch: java.lang.Throwable -> L1a
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L1a
                return
            L25:
                r0 = 1
                r3.i = r0     // Catch: java.lang.Throwable -> L1a
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L1a
                boolean r4 = r3.B(r4)
                if (r4 == 0) goto L30
                goto L5a
            L30:
                monitor-enter(r3)
                java.util.List<java.lang.Long> r4 = r3.j     // Catch: java.lang.Throwable -> L3a
                if (r4 != 0) goto L3c
                r4 = 0
                r3.i = r4     // Catch: java.lang.Throwable -> L3a
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L3a
                return
            L3a:
                r4 = move-exception
                goto L5b
            L3c:
                r5 = 0
                r3.j = r5     // Catch: java.lang.Throwable -> L3a
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L3a
                java.util.Iterator r4 = r4.iterator()
            L44:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L30
                java.lang.Object r5 = r4.next()
                java.lang.Long r5 = (java.lang.Long) r5
                long r0 = r5.longValue()
                boolean r5 = r3.B(r0)
                if (r5 == 0) goto L44
            L5a:
                return
            L5b:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L3a
                throw r4
            L5d:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L1a
                throw r4
            L5f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Request can't be negative! "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        public void onCompleted() {
                r2 = this;
                boolean r0 = r2.e
                if (r0 != 0) goto Ld
                r0 = 1
                r2.e = r0
                rx.observables.a$j<rx.e<T>> r0 = r2.h
                r0.onCompleted()
                return
            Ld:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Terminal event already emitted."
                r0.<init>(r1)
                throw r0
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.e
                if (r0 != 0) goto Ld
                r0 = 1
                r1.e = r0
                rx.observables.a$j<rx.e<T>> r0 = r1.h
                r0.onError(r2)
                return
            Ld:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Terminal event already emitted."
                r2.<init>(r0)
                throw r2
        }

        public /* bridge */ /* synthetic */ void onNext(java.lang.Object r1) {
                r0 = this;
                rx.e r1 = (rx.e) r1
                r0.g(r1)
                return
        }

        public void request(long r5) {
                r4 = this;
                r0 = 0
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 != 0) goto L7
                goto L62
            L7:
                if (r2 < 0) goto L67
                monitor-enter(r4)
                boolean r0 = r4.i     // Catch: java.lang.Throwable -> L1c
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L26
                java.util.List<java.lang.Long> r0 = r4.j     // Catch: java.lang.Throwable -> L1c
                if (r0 != 0) goto L1e
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1c
                r0.<init>()     // Catch: java.lang.Throwable -> L1c
                r4.j = r0     // Catch: java.lang.Throwable -> L1c
                goto L1e
            L1c:
                r5 = move-exception
                goto L65
            L1e:
                java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L1c
                r0.add(r3)     // Catch: java.lang.Throwable -> L1c
                goto L29
            L26:
                r4.i = r1     // Catch: java.lang.Throwable -> L1c
                r1 = 0
            L29:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L1c
                rx.g r0 = r4.k
                r0.request(r5)
                if (r1 == 0) goto L32
                goto L62
            L32:
                boolean r5 = r4.B(r5)
                if (r5 == 0) goto L39
                goto L62
            L39:
                monitor-enter(r4)
                java.util.List<java.lang.Long> r5 = r4.j     // Catch: java.lang.Throwable -> L42
                if (r5 != 0) goto L44
                r4.i = r2     // Catch: java.lang.Throwable -> L42
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
                return
            L42:
                r5 = move-exception
                goto L63
            L44:
                r6 = 0
                r4.j = r6     // Catch: java.lang.Throwable -> L42
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
                java.util.Iterator r5 = r5.iterator()
            L4c:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L39
                java.lang.Object r6 = r5.next()
                java.lang.Long r6 = (java.lang.Long) r6
                long r0 = r6.longValue()
                boolean r6 = r4.B(r0)
                if (r6 == 0) goto L4c
            L62:
                return
            L63:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
                throw r5
            L65:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L1c
                throw r5
            L67:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Request can't be negative! "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
        }

        void s(rx.g r2) {
                r1 = this;
                rx.g r0 = r1.k
                if (r0 != 0) goto L7
                r1.k = r2
                return
            L7:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "setConcatProducer may be called at most once!"
                r2.<init>(r0)
                throw r2
        }

        public void unsubscribe() {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.a
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L2c
                monitor-enter(r3)
                boolean r0 = r3.i     // Catch: java.lang.Throwable -> L21
                if (r0 == 0) goto L23
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L21
                r0.<init>()     // Catch: java.lang.Throwable -> L21
                r3.j = r0     // Catch: java.lang.Throwable -> L21
                r1 = 0
                java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L21
                r0.add(r1)     // Catch: java.lang.Throwable -> L21
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
                return
            L21:
                r0 = move-exception
                goto L2a
            L23:
                r3.i = r2     // Catch: java.lang.Throwable -> L21
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
                r3.d()
                return
            L2a:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
                throw r0
            L2c:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class j<T> extends rx.e<T> implements rx.f<T> {
        private final rx.observables.a.j.C0047a<T> b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.observables.a$j$a, reason: collision with other inner class name */
        static final class C0047a<T> implements rx.e.a<T> {
            rx.l<? super T> a;

            C0047a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                    r0 = this;
                    rx.l r1 = (rx.l) r1
                    r0.call(r1)
                    return
            }

            public void call(rx.l<? super T> r3) {
                    r2 = this;
                    monitor-enter(r2)
                    rx.l<? super T> r0 = r2.a     // Catch: java.lang.Throwable -> L9
                    if (r0 != 0) goto Lb
                    r2.a = r3     // Catch: java.lang.Throwable -> L9
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
                    return
                L9:
                    r3 = move-exception
                    goto L17
                Lb:
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "There can be only one subscriber"
                    r0.<init>(r1)
                    r3.onError(r0)
                    return
                L17:
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
                    throw r3
            }
        }

        protected j(rx.observables.a.j.C0047a<T> r1) {
                r0 = this;
                r0.<init>(r1)
                r0.b = r1
                return
        }

        public static <T> rx.observables.a.j<T> w7() {
                rx.observables.a$j r0 = new rx.observables.a$j
                rx.observables.a$j$a r1 = new rx.observables.a$j$a
                r1.<init>()
                r0.<init>(r1)
                return r0
        }

        public void onCompleted() {
                r1 = this;
                rx.observables.a$j$a<T> r0 = r1.b
                rx.l<? super T> r0 = r0.a
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.observables.a$j$a<T> r0 = r1.b
                rx.l<? super T> r0 = r0.a
                r0.onError(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                rx.observables.a$j$a<T> r0 = r1.b
                rx.l<? super T> r0 = r0.a
                r0.onNext(r2)
                return
        }
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <S, T> rx.observables.a<S, T> a(rx.functions.o<? extends S> r1, rx.functions.d<? super S, java.lang.Long, ? super rx.f<rx.e<? extends T>>> r2) {
            rx.observables.a$a r0 = new rx.observables.a$a
            r0.<init>(r2)
            rx.observables.a$h r2 = new rx.observables.a$h
            r2.<init>(r1, r0)
            return r2
    }

    public static <S, T> rx.observables.a<S, T> b(rx.functions.o<? extends S> r1, rx.functions.d<? super S, java.lang.Long, ? super rx.f<rx.e<? extends T>>> r2, rx.functions.b<? super S> r3) {
            rx.observables.a$b r0 = new rx.observables.a$b
            r0.<init>(r2)
            rx.observables.a$h r2 = new rx.observables.a$h
            r2.<init>(r1, r0, r3)
            return r2
    }

    public static <S, T> rx.observables.a<S, T> c(rx.functions.o<? extends S> r1, rx.functions.r<? super S, java.lang.Long, ? super rx.f<rx.e<? extends T>>, ? extends S> r2) {
            rx.observables.a$h r0 = new rx.observables.a$h
            r0.<init>(r1, r2)
            return r0
    }

    public static <S, T> rx.observables.a<S, T> d(rx.functions.o<? extends S> r1, rx.functions.r<? super S, java.lang.Long, ? super rx.f<rx.e<? extends T>>, ? extends S> r2, rx.functions.b<? super S> r3) {
            rx.observables.a$h r0 = new rx.observables.a$h
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static <T> rx.observables.a<java.lang.Void, T> e(rx.functions.c<java.lang.Long, ? super rx.f<rx.e<? extends T>>> r1) {
            rx.observables.a$c r0 = new rx.observables.a$c
            r0.<init>(r1)
            rx.observables.a$h r1 = new rx.observables.a$h
            r1.<init>(r0)
            return r1
    }

    public static <T> rx.observables.a<java.lang.Void, T> f(rx.functions.c<java.lang.Long, ? super rx.f<rx.e<? extends T>>> r1, rx.functions.a r2) {
            rx.observables.a$d r0 = new rx.observables.a$d
            r0.<init>(r1)
            rx.observables.a$e r1 = new rx.observables.a$e
            r1.<init>(r2)
            rx.observables.a$h r2 = new rx.observables.a$h
            r2.<init>(r0, r1)
            return r2
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public final void call(rx.l<? super T> r5) {
            r4 = this;
            java.lang.Object r0 = r4.g()     // Catch: java.lang.Throwable -> L2c
            rx.observables.a$j r1 = rx.observables.a.j.w7()
            rx.observables.a$i r2 = new rx.observables.a$i
            r2.<init>(r4, r0, r1)
            rx.observables.a$f r0 = new rx.observables.a$f
            r0.<init>(r4, r5, r2)
            rx.e r1 = r1.N3()
            rx.observables.a$g r3 = new rx.observables.a$g
            r3.<init>(r4)
            rx.e r1 = r1.Z0(r3)
            r1.J6(r0)
            r5.add(r0)
            r5.add(r2)
            r5.setProducer(r2)
            return
        L2c:
            r0 = move-exception
            r5.onError(r0)
            return
    }

    protected abstract S g();

    protected abstract S h(S r1, long r2, rx.f<rx.e<? extends T>> r4);

    protected void i(S r1) {
            r0 = this;
            return
    }
}
