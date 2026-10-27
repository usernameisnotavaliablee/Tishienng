package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class a0<T> implements rx.e.a<T> {
    final rx.functions.b<rx.Emitter<T>> a;
    final rx.Emitter.BackpressureMode b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = null;

        static {
                rx.Emitter$BackpressureMode[] r0 = rx.Emitter.BackpressureMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                rx.internal.operators.a0.a.a = r0
                rx.Emitter$BackpressureMode r1 = rx.Emitter.BackpressureMode.NONE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = rx.internal.operators.a0.a.a     // Catch: java.lang.NoSuchFieldError -> L1d
                rx.Emitter$BackpressureMode r1 = rx.Emitter.BackpressureMode.ERROR     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = rx.internal.operators.a0.a.a     // Catch: java.lang.NoSuchFieldError -> L28
                rx.Emitter$BackpressureMode r1 = rx.Emitter.BackpressureMode.DROP     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = rx.internal.operators.a0.a.a     // Catch: java.lang.NoSuchFieldError -> L33
                rx.Emitter$BackpressureMode r1 = rx.Emitter.BackpressureMode.LATEST     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class b<T> extends java.util.concurrent.atomic.AtomicLong implements rx.Emitter<T>, rx.g, rx.m {
        private static final long serialVersionUID = 7326289992464377023L;
        final rx.l<? super T> a;
        final rx.subscriptions.e b;

        public b(rx.l<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                rx.subscriptions.e r1 = new rx.subscriptions.e
                r1.<init>()
                r0.b = r1
                return
        }

        public final void a(rx.functions.n r2) {
                r1 = this;
                rx.internal.subscriptions.CancellableSubscription r0 = new rx.internal.subscriptions.CancellableSubscription
                r0.<init>(r2)
                r1.b(r0)
                return
        }

        public final void b(rx.m r2) {
                r1 = this;
                rx.subscriptions.e r0 = r1.b
                r0.b(r2)
                return
        }

        void d() {
                r0 = this;
                return
        }

        void e() {
                r0 = this;
                return
        }

        public final boolean isUnsubscribed() {
                r1 = this;
                rx.subscriptions.e r0 = r1.b
                boolean r0 = r0.isUnsubscribed()
                return r0
        }

        public void onCompleted() {
                r2 = this;
                rx.l<? super T> r0 = r2.a
                boolean r0 = r0.isUnsubscribed()
                if (r0 == 0) goto L9
                return
            L9:
                rx.l<? super T> r0 = r2.a     // Catch: java.lang.Throwable -> L14
                r0.onCompleted()     // Catch: java.lang.Throwable -> L14
                rx.subscriptions.e r0 = r2.b
                r0.unsubscribe()
                return
            L14:
                r0 = move-exception
                rx.subscriptions.e r1 = r2.b
                r1.unsubscribe()
                throw r0
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.l<? super T> r0 = r1.a
                boolean r0 = r0.isUnsubscribed()
                if (r0 == 0) goto L9
                return
            L9:
                rx.l<? super T> r0 = r1.a     // Catch: java.lang.Throwable -> L14
                r0.onError(r2)     // Catch: java.lang.Throwable -> L14
                rx.subscriptions.e r2 = r1.b
                r2.unsubscribe()
                return
            L14:
                r2 = move-exception
                rx.subscriptions.e r0 = r1.b
                r0.unsubscribe()
                throw r2
        }

        public final void request(long r2) {
                r1 = this;
                boolean r0 = rx.internal.operators.a.j(r2)
                if (r0 == 0) goto Lc
                rx.internal.operators.a.b(r1, r2)
                r1.d()
            Lc:
                return
        }

        public final long requested() {
                r2 = this;
                long r0 = r2.get()
                return r0
        }

        public final void unsubscribe() {
                r1 = this;
                rx.subscriptions.e r0 = r1.b
                r0.unsubscribe()
                r1.e()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c<T> extends rx.internal.operators.a0.b<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        final java.util.Queue<java.lang.Object> c;
        java.lang.Throwable d;
        volatile boolean e;
        final java.util.concurrent.atomic.AtomicInteger f;

        public c(rx.l<? super T> r1, int r2) {
                r0 = this;
                r0.<init>(r1)
                boolean r1 = rx.internal.util.unsafe.n0.f()
                if (r1 == 0) goto Lf
                rx.internal.util.unsafe.h0 r1 = new rx.internal.util.unsafe.h0
                r1.<init>(r2)
                goto L14
            Lf:
                rx.internal.util.atomic.g r1 = new rx.internal.util.atomic.g
                r1.<init>(r2)
            L14:
                r0.c = r1
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r1.<init>()
                r0.f = r1
                return
        }

        @Override // rx.internal.operators.a0.b
        void d() {
                r0 = this;
                r0.f()
                return
        }

        @Override // rx.internal.operators.a0.b
        void e() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.f
                int r0 = r0.getAndIncrement()
                if (r0 != 0) goto Ld
                java.util.Queue<java.lang.Object> r0 = r1.c
                r0.clear()
            Ld:
                return
        }

        void f() {
                r14 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r14.f
                int r0 = r0.getAndIncrement()
                if (r0 == 0) goto La
                goto L80
            La:
                rx.l<? super T> r0 = r14.a
                java.util.Queue<java.lang.Object> r1 = r14.c
                r2 = 1
                r3 = 1
            L10:
                long r4 = r14.get()
                r6 = 0
                r8 = r6
            L17:
                int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r10 == 0) goto L4e
                boolean r11 = r0.isUnsubscribed()
                if (r11 == 0) goto L25
                r1.clear()
                return
            L25:
                boolean r11 = r14.e
                java.lang.Object r12 = r1.poll()
                if (r12 != 0) goto L2f
                r13 = 1
                goto L30
            L2f:
                r13 = 0
            L30:
                if (r11 == 0) goto L40
                if (r13 == 0) goto L40
                java.lang.Throwable r0 = r14.d
                if (r0 == 0) goto L3c
                super.onError(r0)
                return
            L3c:
                super.onCompleted()
                return
            L40:
                if (r13 == 0) goto L43
                goto L4e
            L43:
                java.lang.Object r10 = rx.internal.operators.v.e(r12)
                r0.onNext(r10)
                r10 = 1
                long r8 = r8 + r10
                goto L17
            L4e:
                if (r10 != 0) goto L70
                boolean r4 = r0.isUnsubscribed()
                if (r4 == 0) goto L5a
                r1.clear()
                return
            L5a:
                boolean r4 = r14.e
                boolean r5 = r1.isEmpty()
                if (r4 == 0) goto L70
                if (r5 == 0) goto L70
                java.lang.Throwable r0 = r14.d
                if (r0 == 0) goto L6c
                super.onError(r0)
                return
            L6c:
                super.onCompleted()
                return
            L70:
                int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r4 == 0) goto L77
                rx.internal.operators.a.i(r14, r8)
            L77:
                java.util.concurrent.atomic.AtomicInteger r4 = r14.f
                int r3 = -r3
                int r3 = r4.addAndGet(r3)
                if (r3 != 0) goto L10
            L80:
                return
        }

        @Override // rx.internal.operators.a0.b
        public void onCompleted() {
                r1 = this;
                r0 = 1
                r1.e = r0
                r1.f()
                return
        }

        @Override // rx.internal.operators.a0.b
        public void onError(java.lang.Throwable r1) {
                r0 = this;
                r0.d = r1
                r1 = 1
                r0.e = r1
                r0.f()
                return
        }

        public void onNext(T r2) {
                r1 = this;
                java.util.Queue<java.lang.Object> r0 = r1.c
                java.lang.Object r2 = rx.internal.operators.v.j(r2)
                r0.offer(r2)
                r1.f()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class d<T> extends rx.internal.operators.a0.g<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        public d(rx.l<? super T> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // rx.internal.operators.a0.g
        void f() {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class e<T> extends rx.internal.operators.a0.g<T> {
        private static final long serialVersionUID = 338953216916120960L;
        private boolean c;

        public e(rx.l<? super T> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // rx.internal.operators.a0.g
        void f() {
                r2 = this;
                rx.exceptions.MissingBackpressureException r0 = new rx.exceptions.MissingBackpressureException
                java.lang.String r1 = "create: could not emit value due to lack of requests"
                r0.<init>(r1)
                r2.onError(r0)
                return
        }

        @Override // rx.internal.operators.a0.b
        public void onCompleted() {
                r1 = this;
                boolean r0 = r1.c
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.c = r0
                super.onCompleted()
                return
        }

        @Override // rx.internal.operators.a0.b
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.c
                if (r0 == 0) goto L8
                rx.plugins.c.I(r2)
                return
            L8:
                r0 = 1
                r1.c = r0
                super.onError(r2)
                return
        }

        @Override // rx.internal.operators.a0.g
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.c
                if (r0 == 0) goto L5
                return
            L5:
                super.onNext(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class f<T> extends rx.internal.operators.a0.b<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        final java.util.concurrent.atomic.AtomicReference<java.lang.Object> c;
        java.lang.Throwable d;
        volatile boolean e;
        final java.util.concurrent.atomic.AtomicInteger f;

        public f(rx.l<? super T> r1) {
                r0 = this;
                r0.<init>(r1)
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.c = r1
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r1.<init>()
                r0.f = r1
                return
        }

        @Override // rx.internal.operators.a0.b
        void d() {
                r0 = this;
                r0.f()
                return
        }

        @Override // rx.internal.operators.a0.b
        void e() {
                r2 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r2.f
                int r0 = r0.getAndIncrement()
                if (r0 != 0) goto Le
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r2.c
                r1 = 0
                r0.lazySet(r1)
            Le:
                return
        }

        void f() {
                r17 = this;
                r0 = r17
                java.util.concurrent.atomic.AtomicInteger r1 = r0.f
                int r1 = r1.getAndIncrement()
                if (r1 == 0) goto Lc
                goto L89
            Lc:
                rx.l<? super T> r1 = r0.a
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r2 = r0.c
                r3 = 1
                r4 = 1
            L12:
                long r5 = r0.get()
                r7 = 0
                r9 = r7
            L19:
                r11 = 0
                r12 = 0
                int r13 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r13 == 0) goto L54
                boolean r14 = r1.isUnsubscribed()
                if (r14 == 0) goto L29
                r2.lazySet(r12)
                return
            L29:
                boolean r14 = r0.e
                java.lang.Object r15 = r2.getAndSet(r12)
                if (r15 != 0) goto L34
                r16 = 1
                goto L36
            L34:
                r16 = 0
            L36:
                if (r14 == 0) goto L46
                if (r16 == 0) goto L46
                java.lang.Throwable r1 = r0.d
                if (r1 == 0) goto L42
                super.onError(r1)
                return
            L42:
                super.onCompleted()
                return
            L46:
                if (r16 == 0) goto L49
                goto L54
            L49:
                java.lang.Object r11 = rx.internal.operators.v.e(r15)
                r1.onNext(r11)
                r11 = 1
                long r9 = r9 + r11
                goto L19
            L54:
                if (r13 != 0) goto L79
                boolean r5 = r1.isUnsubscribed()
                if (r5 == 0) goto L60
                r2.lazySet(r12)
                return
            L60:
                boolean r5 = r0.e
                java.lang.Object r6 = r2.get()
                if (r6 != 0) goto L69
                r11 = 1
            L69:
                if (r5 == 0) goto L79
                if (r11 == 0) goto L79
                java.lang.Throwable r1 = r0.d
                if (r1 == 0) goto L75
                super.onError(r1)
                return
            L75:
                super.onCompleted()
                return
            L79:
                int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r5 == 0) goto L80
                rx.internal.operators.a.i(r0, r9)
            L80:
                java.util.concurrent.atomic.AtomicInteger r5 = r0.f
                int r4 = -r4
                int r4 = r5.addAndGet(r4)
                if (r4 != 0) goto L12
            L89:
                return
        }

        @Override // rx.internal.operators.a0.b
        public void onCompleted() {
                r1 = this;
                r0 = 1
                r1.e = r0
                r1.f()
                return
        }

        @Override // rx.internal.operators.a0.b
        public void onError(java.lang.Throwable r1) {
                r0 = this;
                r0.d = r1
                r1 = 1
                r0.e = r1
                r0.f()
                return
        }

        public void onNext(T r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r1.c
                java.lang.Object r2 = rx.internal.operators.v.j(r2)
                r0.set(r2)
                r1.f()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class g<T> extends rx.internal.operators.a0.b<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        public g(rx.l<? super T> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        abstract void f();

        public void onNext(T r6) {
                r5 = this;
                rx.l<? super T> r0 = r5.a
                boolean r0 = r0.isUnsubscribed()
                if (r0 == 0) goto L9
                return
            L9:
                long r0 = r5.get()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L1e
                rx.l<? super T> r0 = r5.a
                r0.onNext(r6)
                r0 = 1
                rx.internal.operators.a.i(r5, r0)
                return
            L1e:
                r5.f()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class h<T> extends rx.internal.operators.a0.b<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        public h(rx.l<? super T> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public void onNext(T r5) {
                r4 = this;
                rx.l<? super T> r0 = r4.a
                boolean r0 = r0.isUnsubscribed()
                if (r0 == 0) goto L9
                goto L22
            L9:
                rx.l<? super T> r0 = r4.a
                r0.onNext(r5)
            Le:
                long r0 = r4.get()
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 == 0) goto L22
                r2 = 1
                long r2 = r0 - r2
                boolean r5 = r4.compareAndSet(r0, r2)
                if (r5 == 0) goto Le
            L22:
                return
        }
    }

    public a0(rx.functions.b<rx.Emitter<T>> r1, rx.Emitter.BackpressureMode r2) {
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

    public void call(rx.l<? super T> r3) {
            r2 = this;
            int[] r0 = rx.internal.operators.a0.a.a
            rx.Emitter$BackpressureMode r1 = r2.b
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L30
            r1 = 2
            if (r0 == r1) goto L2a
            r1 = 3
            if (r0 == r1) goto L24
            r1 = 4
            if (r0 == r1) goto L1e
            rx.internal.operators.a0$c r0 = new rx.internal.operators.a0$c
            int r1 = rx.internal.util.j.d
            r0.<init>(r3, r1)
            goto L35
        L1e:
            rx.internal.operators.a0$f r0 = new rx.internal.operators.a0$f
            r0.<init>(r3)
            goto L35
        L24:
            rx.internal.operators.a0$d r0 = new rx.internal.operators.a0$d
            r0.<init>(r3)
            goto L35
        L2a:
            rx.internal.operators.a0$e r0 = new rx.internal.operators.a0$e
            r0.<init>(r3)
            goto L35
        L30:
            rx.internal.operators.a0$h r0 = new rx.internal.operators.a0$h
            r0.<init>(r3)
        L35:
            r3.add(r0)
            r3.setProducer(r0)
            rx.functions.b<rx.Emitter<T>> r3 = r2.a
            r3.call(r0)
            return
    }
}
