package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class q2<T> implements rx.e.b<T, T> {
    private final rx.h a;
    private final boolean b;
    private final int c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements rx.e.b<T, T> {
        final /* synthetic */ int a;

        a(int r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
                r0 = this;
                rx.l r1 = (rx.l) r1
                rx.l r1 = r0.call(r1)
                return r1
        }

        public rx.l<? super T> call(rx.l<? super T> r5) {
                r4 = this;
                rx.internal.operators.q2$b r0 = new rx.internal.operators.q2$b
                rx.h r1 = rx.schedulers.c.d()
                r2 = 0
                int r3 = r4.a
                r0.<init>(r1, r5, r2, r3)
                r0.j()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T> extends rx.l<T> implements rx.functions.a {
        final rx.l<? super T> a;
        final rx.h.a b;
        final boolean c;
        final java.util.Queue<java.lang.Object> d;
        final int e;
        volatile boolean f;
        final java.util.concurrent.atomic.AtomicLong g;
        final java.util.concurrent.atomic.AtomicLong h;
        java.lang.Throwable i;
        long j;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements rx.g {
            final /* synthetic */ rx.internal.operators.q2.b a;

            a(rx.internal.operators.q2.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void request(long r4) {
                    r3 = this;
                    r0 = 0
                    int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                    if (r2 <= 0) goto L12
                    rx.internal.operators.q2$b r0 = r3.a
                    java.util.concurrent.atomic.AtomicLong r0 = r0.g
                    rx.internal.operators.a.b(r0, r4)
                    rx.internal.operators.q2$b r4 = r3.a
                    r4.s()
                L12:
                    return
            }
        }

        public b(rx.h r2, rx.l<? super T> r3, boolean r4, int r5) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
                r0.<init>()
                r1.g = r0
                java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
                r0.<init>()
                r1.h = r0
                r1.a = r3
                rx.h$a r2 = r2.a()
                r1.b = r2
                r1.c = r4
                if (r5 <= 0) goto L1e
                goto L20
            L1e:
                int r5 = rx.internal.util.j.d
            L20:
                int r2 = r5 >> 2
                int r2 = r5 - r2
                r1.e = r2
                boolean r2 = rx.internal.util.unsafe.n0.f()
                if (r2 == 0) goto L34
                rx.internal.util.unsafe.z r2 = new rx.internal.util.unsafe.z
                r2.<init>(r5)
                r1.d = r2
                goto L3b
            L34:
                rx.internal.util.atomic.d r2 = new rx.internal.util.atomic.d
                r2.<init>(r5)
                r1.d = r2
            L3b:
                long r2 = (long) r5
                r1.request(r2)
                return
        }

        public void call() {
                r19 = this;
                r0 = r19
                long r1 = r0.j
                java.util.Queue<java.lang.Object> r3 = r0.d
                rx.l<? super T> r4 = r0.a
                r7 = 1
            La:
                java.util.concurrent.atomic.AtomicLong r9 = r0.g
                long r9 = r9.get()
            L10:
                r11 = 0
                int r13 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
                if (r13 == 0) goto L4e
                boolean r14 = r0.f
                java.lang.Object r15 = r3.poll()
                if (r15 != 0) goto L24
                r16 = 1
                r5 = 1
            L21:
                r17 = 1
                goto L28
            L24:
                r16 = 0
                r5 = 0
                goto L21
            L28:
                boolean r6 = r0.g(r14, r5, r4, r3)
                if (r6 == 0) goto L2f
                goto L6c
            L2f:
                if (r5 == 0) goto L32
                goto L50
            L32:
                java.lang.Object r5 = rx.internal.operators.v.e(r15)
                r4.onNext(r5)
                long r1 = r1 + r17
                int r5 = r0.e
                long r5 = (long) r5
                int r13 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r13 != 0) goto L10
                java.util.concurrent.atomic.AtomicLong r5 = r0.g
                long r5 = rx.internal.operators.a.i(r5, r1)
                r0.request(r1)
                r9 = r5
                r1 = r11
                goto L10
            L4e:
                r17 = 1
            L50:
                if (r13 != 0) goto L5f
                boolean r5 = r0.f
                boolean r6 = r3.isEmpty()
                boolean r5 = r0.g(r5, r6, r4, r3)
                if (r5 == 0) goto L5f
                goto L6c
            L5f:
                r0.j = r1
                java.util.concurrent.atomic.AtomicLong r5 = r0.h
                long r6 = -r7
                long r7 = r5.addAndGet(r6)
                int r5 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                if (r5 != 0) goto La
            L6c:
                return
        }

        boolean g(boolean r3, boolean r4, rx.l<? super T> r5, java.util.Queue<java.lang.Object> r6) {
                r2 = this;
                boolean r0 = r5.isUnsubscribed()
                r1 = 1
                if (r0 == 0) goto Lb
                r6.clear()
                return r1
            Lb:
                if (r3 == 0) goto L55
                boolean r3 = r2.c
                if (r3 == 0) goto L2c
                if (r4 == 0) goto L55
                java.lang.Throwable r3 = r2.i
                if (r3 == 0) goto L1d
                r5.onError(r3)     // Catch: java.lang.Throwable -> L1b
                goto L20
            L1b:
                r3 = move-exception
                goto L26
            L1d:
                r5.onCompleted()     // Catch: java.lang.Throwable -> L1b
            L20:
                rx.h$a r3 = r2.b
                r3.unsubscribe()
                goto L55
            L26:
                rx.h$a r4 = r2.b
                r4.unsubscribe()
                throw r3
            L2c:
                java.lang.Throwable r3 = r2.i
                if (r3 == 0) goto L43
                r6.clear()
                r5.onError(r3)     // Catch: java.lang.Throwable -> L3c
                rx.h$a r3 = r2.b
                r3.unsubscribe()
                return r1
            L3c:
                r3 = move-exception
                rx.h$a r4 = r2.b
                r4.unsubscribe()
                throw r3
            L43:
                if (r4 == 0) goto L55
                r5.onCompleted()     // Catch: java.lang.Throwable -> L4e
                rx.h$a r3 = r2.b
                r3.unsubscribe()
                return r1
            L4e:
                r3 = move-exception
                rx.h$a r4 = r2.b
                r4.unsubscribe()
                throw r3
            L55:
                r3 = 0
                return r3
        }

        void j() {
                r2 = this;
                rx.l<? super T> r0 = r2.a
                rx.internal.operators.q2$b$a r1 = new rx.internal.operators.q2$b$a
                r1.<init>(r2)
                r0.setProducer(r1)
                rx.h$a r1 = r2.b
                r0.add(r1)
                r0.add(r2)
                return
        }

        public void onCompleted() {
                r1 = this;
                boolean r0 = r1.isUnsubscribed()
                if (r0 != 0) goto L11
                boolean r0 = r1.f
                if (r0 == 0) goto Lb
                goto L11
            Lb:
                r0 = 1
                r1.f = r0
                r1.s()
            L11:
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.isUnsubscribed()
                if (r0 != 0) goto L14
                boolean r0 = r1.f
                if (r0 == 0) goto Lb
                goto L14
            Lb:
                r1.i = r2
                r2 = 1
                r1.f = r2
                r1.s()
                return
            L14:
                rx.plugins.c.I(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.isUnsubscribed()
                if (r0 != 0) goto L23
                boolean r0 = r1.f
                if (r0 == 0) goto Lb
                goto L23
            Lb:
                java.util.Queue<java.lang.Object> r0 = r1.d
                java.lang.Object r2 = rx.internal.operators.v.j(r2)
                boolean r2 = r0.offer(r2)
                if (r2 != 0) goto L20
                rx.exceptions.MissingBackpressureException r2 = new rx.exceptions.MissingBackpressureException
                r2.<init>()
                r1.onError(r2)
                return
            L20:
                r1.s()
            L23:
                return
        }

        protected void s() {
                r5 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r5.h
                long r0 = r0.getAndIncrement()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L11
                rx.h$a r0 = r5.b
                r0.d(r5)
            L11:
                return
        }
    }

    public q2(rx.h r2, boolean r3) {
            r1 = this;
            int r0 = rx.internal.util.j.d
            r1.<init>(r2, r3, r0)
            return
    }

    public q2(rx.h r1, boolean r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            if (r3 <= 0) goto La
            goto Lc
        La:
            int r3 = rx.internal.util.j.d
        Lc:
            r0.c = r3
            return
    }

    public static <T> rx.e.b<T, T> a(int r1) {
            rx.internal.operators.q2$a r0 = new rx.internal.operators.q2$a
            r0.<init>(r1)
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super T> r5) {
            r4 = this;
            rx.h r0 = r4.a
            boolean r1 = r0 instanceof rx.internal.schedulers.f
            if (r1 == 0) goto L7
            goto Lb
        L7:
            boolean r1 = r0 instanceof rx.internal.schedulers.m
            if (r1 == 0) goto Lc
        Lb:
            return r5
        Lc:
            rx.internal.operators.q2$b r1 = new rx.internal.operators.q2$b
            boolean r2 = r4.b
            int r3 = r4.c
            r1.<init>(r0, r5, r2, r3)
            r1.j()
            return r1
    }
}
