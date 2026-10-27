package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class a3<R, T> implements rx.e.b<R, T> {
    private static final java.lang.Object c = null;
    private final rx.functions.o<R> a;
    final rx.functions.q<R, ? super T, R> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.functions.o<R> {
        final /* synthetic */ java.lang.Object a;

        a(java.lang.Object r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public R call() {
                r1 = this;
                java.lang.Object r0 = r1.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends rx.l<T> {
        boolean a;
        R b;
        final /* synthetic */ rx.l c;
        final /* synthetic */ rx.internal.operators.a3 d;

        b(rx.internal.operators.a3 r1, rx.l r2, rx.l r3) {
                r0 = this;
                r0.d = r1
                r0.c = r3
                r0.<init>(r2)
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.l r0 = r1.c
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.l r0 = r1.c
                r0.onError(r2)
                return
        }

        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.a
                if (r0 != 0) goto L8
                r0 = 1
                r2.a = r0
                goto L12
            L8:
                R r0 = r2.b
                rx.internal.operators.a3 r1 = r2.d     // Catch: java.lang.Throwable -> L1a
                rx.functions.q<R, ? super T, R> r1 = r1.b     // Catch: java.lang.Throwable -> L1a
                java.lang.Object r3 = r1.call(r0, r3)     // Catch: java.lang.Throwable -> L1a
            L12:
                r2.b = r3
                rx.l r0 = r2.c
                r0.onNext(r3)
                return
            L1a:
                r0 = move-exception
                rx.l r1 = r2.c
                rx.exceptions.a.g(r0, r1, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends rx.l<T> {
        private R a;
        final /* synthetic */ java.lang.Object b;
        final /* synthetic */ rx.internal.operators.a3.d c;
        final /* synthetic */ rx.internal.operators.a3 d;

        c(rx.internal.operators.a3 r1, java.lang.Object r2, rx.internal.operators.a3.d r3) {
                r0 = this;
                r0.d = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                r0.a = r2
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.internal.operators.a3$d r0 = r1.c
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.internal.operators.a3$d r0 = r1.c
                r0.onError(r2)
                return
        }

        public void onNext(T r3) {
                r2 = this;
                R r0 = r2.a
                rx.internal.operators.a3 r1 = r2.d     // Catch: java.lang.Throwable -> L12
                rx.functions.q<R, ? super T, R> r1 = r1.b     // Catch: java.lang.Throwable -> L12
                java.lang.Object r3 = r1.call(r0, r3)     // Catch: java.lang.Throwable -> L12
                r2.a = r3
                rx.internal.operators.a3$d r0 = r2.c
                r0.onNext(r3)
                return
            L12:
                r0 = move-exception
                rx.exceptions.a.g(r0, r2, r3)
                return
        }

        public void setProducer(rx.g r2) {
                r1 = this;
                rx.internal.operators.a3$d r0 = r1.c
                r0.setProducer(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class d<R> implements rx.g, rx.f<R> {
        final rx.l<? super R> a;
        final java.util.Queue<java.lang.Object> b;
        boolean c;
        boolean d;
        long e;
        final java.util.concurrent.atomic.AtomicLong f;
        volatile rx.g g;
        volatile boolean h;
        java.lang.Throwable i;

        public d(R r1, rx.l<? super R> r2) {
                r0 = this;
                r0.<init>()
                r0.a = r2
                boolean r2 = rx.internal.util.unsafe.n0.f()
                if (r2 == 0) goto L11
                rx.internal.util.unsafe.g0 r2 = new rx.internal.util.unsafe.g0
                r2.<init>()
                goto L16
            L11:
                rx.internal.util.atomic.f r2 = new rx.internal.util.atomic.f
                r2.<init>()
            L16:
                r0.b = r2
                java.lang.Object r1 = rx.internal.operators.v.j(r1)
                r2.offer(r1)
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.f = r1
                return
        }

        boolean d(boolean r3, boolean r4, rx.l<? super R> r5) {
                r2 = this;
                boolean r0 = r5.isUnsubscribed()
                r1 = 1
                if (r0 == 0) goto L8
                return r1
            L8:
                if (r3 == 0) goto L18
                java.lang.Throwable r3 = r2.i
                if (r3 == 0) goto L12
                r5.onError(r3)
                return r1
            L12:
                if (r4 == 0) goto L18
                r5.onCompleted()
                return r1
            L18:
                r3 = 0
                return r3
        }

        void e() {
                r2 = this;
                monitor-enter(r2)
                boolean r0 = r2.c     // Catch: java.lang.Throwable -> La
                r1 = 1
                if (r0 == 0) goto Lc
                r2.d = r1     // Catch: java.lang.Throwable -> La
                monitor-exit(r2)     // Catch: java.lang.Throwable -> La
                return
            La:
                r0 = move-exception
                goto L13
            Lc:
                r2.c = r1     // Catch: java.lang.Throwable -> La
                monitor-exit(r2)     // Catch: java.lang.Throwable -> La
                r2.f()
                return
            L13:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> La
                throw r0
        }

        void f() {
                r13 = this;
                rx.l<? super R> r0 = r13.a
                java.util.Queue<java.lang.Object> r1 = r13.b
                java.util.concurrent.atomic.AtomicLong r2 = r13.f
                long r3 = r2.get()
            La:
                boolean r5 = r13.h
                boolean r6 = r1.isEmpty()
                boolean r5 = r13.d(r5, r6, r0)
                if (r5 == 0) goto L17
                goto L30
            L17:
                r5 = 0
                r7 = r5
            L1a:
                r9 = 0
                int r10 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r10 == 0) goto L44
                boolean r10 = r13.h
                java.lang.Object r11 = r1.poll()
                if (r11 != 0) goto L29
                r12 = 1
                goto L2a
            L29:
                r12 = 0
            L2a:
                boolean r10 = r13.d(r10, r12, r0)
                if (r10 == 0) goto L31
            L30:
                return
            L31:
                if (r12 == 0) goto L34
                goto L44
            L34:
                java.lang.Object r9 = rx.internal.operators.v.e(r11)
                r0.onNext(r9)     // Catch: java.lang.Throwable -> L3f
                r9 = 1
                long r7 = r7 + r9
                goto L1a
            L3f:
                r1 = move-exception
                rx.exceptions.a.g(r1, r0, r9)
                return
            L44:
                int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r10 == 0) goto L55
                r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r10 == 0) goto L55
                long r3 = rx.internal.operators.a.i(r2, r7)
            L55:
                monitor-enter(r13)
                boolean r5 = r13.d     // Catch: java.lang.Throwable -> L5e
                if (r5 != 0) goto L60
                r13.c = r9     // Catch: java.lang.Throwable -> L5e
                monitor-exit(r13)     // Catch: java.lang.Throwable -> L5e
                return
            L5e:
                r0 = move-exception
                goto L64
            L60:
                r13.d = r9     // Catch: java.lang.Throwable -> L5e
                monitor-exit(r13)     // Catch: java.lang.Throwable -> L5e
                goto La
            L64:
                monitor-exit(r13)     // Catch: java.lang.Throwable -> L5e
                throw r0
        }

        public void onCompleted() {
                r1 = this;
                r0 = 1
                r1.h = r0
                r1.e()
                return
        }

        public void onError(java.lang.Throwable r1) {
                r0 = this;
                r0.i = r1
                r1 = 1
                r0.h = r1
                r0.e()
                return
        }

        public void onNext(R r2) {
                r1 = this;
                java.util.Queue<java.lang.Object> r0 = r1.b
                java.lang.Object r2 = rx.internal.operators.v.j(r2)
                r0.offer(r2)
                r1.e()
                return
        }

        public void request(long r5) {
                r4 = this;
                r0 = 0
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 < 0) goto L30
                if (r2 == 0) goto L2f
                java.util.concurrent.atomic.AtomicLong r0 = r4.f
                rx.internal.operators.a.b(r0, r5)
                rx.g r0 = r4.g
                if (r0 != 0) goto L27
                java.util.concurrent.atomic.AtomicLong r1 = r4.f
                monitor-enter(r1)
                rx.g r0 = r4.g     // Catch: java.lang.Throwable -> L21
                if (r0 != 0) goto L23
                long r2 = r4.e     // Catch: java.lang.Throwable -> L21
                long r2 = rx.internal.operators.a.a(r2, r5)     // Catch: java.lang.Throwable -> L21
                r4.e = r2     // Catch: java.lang.Throwable -> L21
                goto L23
            L21:
                r5 = move-exception
                goto L25
            L23:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
                goto L27
            L25:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
                throw r5
            L27:
                if (r0 == 0) goto L2c
                r0.request(r5)
            L2c:
                r4.e()
            L2f:
                return
            L30:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "n >= required but it was "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
        }

        public void setProducer(rx.g r7) {
                r6 = this;
                r7.getClass()
                java.util.concurrent.atomic.AtomicLong r0 = r6.f
                monitor-enter(r0)
                rx.g r1 = r6.g     // Catch: java.lang.Throwable -> L2a
                if (r1 != 0) goto L2c
                long r1 = r6.e     // Catch: java.lang.Throwable -> L2a
                r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L18
                r3 = 1
                long r1 = r1 - r3
            L18:
                r3 = 0
                r6.e = r3     // Catch: java.lang.Throwable -> L2a
                r6.g = r7     // Catch: java.lang.Throwable -> L2a
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
                int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r0 <= 0) goto L26
                r7.request(r1)
            L26:
                r6.e()
                return
            L2a:
                r7 = move-exception
                goto L34
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2a
                java.lang.String r1 = "Can't set more than one Producer!"
                r7.<init>(r1)     // Catch: java.lang.Throwable -> L2a
                throw r7     // Catch: java.lang.Throwable -> L2a
            L34:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
                throw r7
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            rx.internal.operators.a3.c = r0
            return
    }

    public a3(R r2, rx.functions.q<R, ? super T, R> r3) {
            r1 = this;
            rx.internal.operators.a3$a r0 = new rx.internal.operators.a3$a
            r0.<init>(r2)
            r1.<init>(r0, r3)
            return
    }

    public a3(rx.functions.o<R> r1, rx.functions.q<R, ? super T, R> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public a3(rx.functions.q<R, ? super T, R> r2) {
            r1 = this;
            java.lang.Object r0 = rx.internal.operators.a3.c
            r1.<init>(r0, r2)
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super R> r4) {
            r3 = this;
            rx.functions.o<R> r0 = r3.a
            java.lang.Object r0 = r0.call()
            java.lang.Object r1 = rx.internal.operators.a3.c
            if (r0 != r1) goto L10
            rx.internal.operators.a3$b r0 = new rx.internal.operators.a3$b
            r0.<init>(r3, r4, r4)
            return r0
        L10:
            rx.internal.operators.a3$d r1 = new rx.internal.operators.a3$d
            r1.<init>(r0, r4)
            rx.internal.operators.a3$c r2 = new rx.internal.operators.a3$c
            r2.<init>(r3, r0, r1)
            r4.add(r2)
            r4.setProducer(r1)
            return r2
    }
}
