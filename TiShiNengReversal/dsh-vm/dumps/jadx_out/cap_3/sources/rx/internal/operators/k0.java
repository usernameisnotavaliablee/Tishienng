package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class k0<T, R> implements rx.e.a<R> {
    final rx.e<? extends T> a;
    final rx.functions.p<? super T, ? extends java.lang.Iterable<? extends R>> b;
    final int c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.g {
        final /* synthetic */ rx.internal.operators.k0.b a;
        final /* synthetic */ rx.internal.operators.k0 b;

        a(rx.internal.operators.k0 r1, rx.internal.operators.k0.b r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void request(long r2) {
                r1 = this;
                rx.internal.operators.k0$b r0 = r1.a
                r0.s(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T, R> extends rx.l<T> {
        final rx.l<? super R> a;
        final rx.functions.p<? super T, ? extends java.lang.Iterable<? extends R>> b;
        final long c;
        final java.util.Queue<java.lang.Object> d;
        final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> e;
        final java.util.concurrent.atomic.AtomicLong f;
        final java.util.concurrent.atomic.AtomicInteger g;
        volatile boolean h;
        long i;
        java.util.Iterator<? extends R> j;

        public b(rx.l<? super R> r1, rx.functions.p<? super T, ? extends java.lang.Iterable<? extends R>> r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.e = r1
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r1.<init>()
                r0.g = r1
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.f = r1
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r3 != r1) goto L32
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0.c = r1
                rx.internal.util.atomic.e r1 = new rx.internal.util.atomic.e
                int r2 = rx.internal.util.j.d
                r1.<init>(r2)
                r0.d = r1
                goto L4e
            L32:
                int r1 = r3 >> 2
                int r1 = r3 - r1
                long r1 = (long) r1
                r0.c = r1
                boolean r1 = rx.internal.util.unsafe.n0.f()
                if (r1 == 0) goto L47
                rx.internal.util.unsafe.z r1 = new rx.internal.util.unsafe.z
                r1.<init>(r3)
                r0.d = r1
                goto L4e
            L47:
                rx.internal.util.atomic.d r1 = new rx.internal.util.atomic.d
                r1.<init>(r3)
                r0.d = r1
            L4e:
                long r1 = (long) r3
                r0.request(r1)
                return
        }

        boolean g(boolean r4, boolean r5, rx.l<?> r6, java.util.Queue<?> r7) {
                r3 = this;
                boolean r0 = r6.isUnsubscribed()
                r1 = 0
                r2 = 1
                if (r0 == 0) goto Le
                r7.clear()
                r3.j = r1
                return r2
            Le:
                if (r4 == 0) goto L32
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r4 = r3.e
                java.lang.Object r4 = r4.get()
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                if (r4 == 0) goto L2c
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r4 = r3.e
                java.lang.Throwable r4 = rx.internal.util.ExceptionsUtils.terminate(r4)
                r3.unsubscribe()
                r7.clear()
                r3.j = r1
                r6.onError(r4)
                return r2
            L2c:
                if (r5 == 0) goto L32
                r6.onCompleted()
                return r2
            L32:
                r4 = 0
                return r4
        }

        void j() {
                r17 = this;
                r1 = r17
                java.util.concurrent.atomic.AtomicInteger r0 = r1.g
                int r0 = r0.getAndIncrement()
                if (r0 == 0) goto Lc
                goto Ld7
            Lc:
                rx.l<? super R> r2 = r1.a
                java.util.Queue<java.lang.Object> r3 = r1.d
                r4 = 1
                r5 = 1
            L12:
                java.util.Iterator<? extends R> r0 = r1.j
                r6 = 1
                r8 = 0
                r10 = 0
                if (r0 != 0) goto L64
                boolean r11 = r1.h
                java.lang.Object r12 = r3.poll()
                if (r12 != 0) goto L25
                r13 = 1
                goto L26
            L25:
                r13 = 0
            L26:
                boolean r11 = r1.g(r11, r13, r2, r3)
                if (r11 == 0) goto L2e
                goto Ld7
            L2e:
                if (r13 != 0) goto L64
                long r13 = r1.i
                long r13 = r13 + r6
                r15 = r6
                long r6 = r1.c
                int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
                if (r0 != 0) goto L40
                r1.i = r8
                r1.request(r13)
                goto L42
            L40:
                r1.i = r13
            L42:
                rx.functions.p<? super T, ? extends java.lang.Iterable<? extends R>> r0 = r1.b     // Catch: java.lang.Throwable -> L5c
                java.lang.Object r6 = rx.internal.operators.v.e(r12)     // Catch: java.lang.Throwable -> L5c
                java.lang.Object r0 = r0.call(r6)     // Catch: java.lang.Throwable -> L5c
                java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L5c
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L5c
                boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> L5c
                if (r6 != 0) goto L59
                goto L12
            L59:
                r1.j = r0
                goto L65
            L5c:
                r0 = move-exception
                rx.exceptions.a.e(r0)
                r1.onError(r0)
                goto L12
            L64:
                r15 = r6
            L65:
                if (r0 == 0) goto Lce
                java.util.concurrent.atomic.AtomicLong r6 = r1.f
                long r6 = r6.get()
                r11 = r8
            L6e:
                int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r13 == 0) goto Lab
                boolean r13 = r1.h
                boolean r13 = r1.g(r13, r10, r2, r3)
                if (r13 == 0) goto L7b
                goto Ld7
            L7b:
                r13 = 0
                java.lang.Object r14 = r0.next()     // Catch: java.lang.Throwable -> La1
                r2.onNext(r14)
                boolean r14 = r1.h
                boolean r14 = r1.g(r14, r10, r2, r3)
                if (r14 == 0) goto L8c
                goto Ld7
            L8c:
                long r11 = r11 + r15
                boolean r14 = r0.hasNext()     // Catch: java.lang.Throwable -> L97
                if (r14 != 0) goto L6e
                r1.j = r13
            L95:
                r0 = r13
                goto Lab
            L97:
                r0 = move-exception
                rx.exceptions.a.e(r0)
                r1.j = r13
                r1.onError(r0)
                goto L95
            La1:
                r0 = move-exception
                rx.exceptions.a.e(r0)
                r1.j = r13
                r1.onError(r0)
                goto L95
            Lab:
                int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r13 != 0) goto Lc1
                boolean r6 = r1.h
                boolean r7 = r3.isEmpty()
                if (r7 == 0) goto Lba
                if (r0 != 0) goto Lba
                r10 = 1
            Lba:
                boolean r6 = r1.g(r6, r10, r2, r3)
                if (r6 == 0) goto Lc1
                goto Ld7
            Lc1:
                int r6 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r6 == 0) goto Lca
                java.util.concurrent.atomic.AtomicLong r6 = r1.f
                rx.internal.operators.a.i(r6, r11)
            Lca:
                if (r0 != 0) goto Lce
                goto L12
            Lce:
                java.util.concurrent.atomic.AtomicInteger r0 = r1.g
                int r5 = -r5
                int r5 = r0.addAndGet(r5)
                if (r5 != 0) goto L12
            Ld7:
                return
        }

        public void onCompleted() {
                r1 = this;
                r0 = 1
                r1.h = r0
                r1.j()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.e
                boolean r0 = rx.internal.util.ExceptionsUtils.addThrowable(r0, r2)
                if (r0 == 0) goto Lf
                r2 = 1
                r1.h = r2
                r1.j()
                return
            Lf:
                rx.plugins.c.I(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                java.util.Queue<java.lang.Object> r0 = r1.d
                java.lang.Object r2 = rx.internal.operators.v.j(r2)
                boolean r2 = r0.offer(r2)
                if (r2 != 0) goto L18
                r1.unsubscribe()
                rx.exceptions.MissingBackpressureException r2 = new rx.exceptions.MissingBackpressureException
                r2.<init>()
                r1.onError(r2)
                return
            L18:
                r1.j()
                return
        }

        void s(long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 <= 0) goto Lf
                java.util.concurrent.atomic.AtomicLong r0 = r3.f
                rx.internal.operators.a.b(r0, r4)
                r3.j()
                return
            Lf:
                if (r2 < 0) goto L12
                return
            L12:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "n >= 0 required but it was "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c<T, R> implements rx.e.a<R> {
        final T a;
        final rx.functions.p<? super T, ? extends java.lang.Iterable<? extends R>> b;

        public c(T r1, rx.functions.p<? super T, ? extends java.lang.Iterable<? extends R>> r2) {
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

        public void call(rx.l<? super R> r3) {
                r2 = this;
                rx.functions.p<? super T, ? extends java.lang.Iterable<? extends R>> r0 = r2.b     // Catch: java.lang.Throwable -> L21
                T r1 = r2.a     // Catch: java.lang.Throwable -> L21
                java.lang.Object r0 = r0.call(r1)     // Catch: java.lang.Throwable -> L21
                java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L21
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L21
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L21
                if (r1 != 0) goto L18
                r3.onCompleted()
                return
            L18:
                rx.internal.operators.n0$a r1 = new rx.internal.operators.n0$a
                r1.<init>(r3, r0)
                r3.setProducer(r1)
                return
            L21:
                r0 = move-exception
                T r1 = r2.a
                rx.exceptions.a.g(r0, r3, r1)
                return
        }
    }

    protected k0(rx.e<? extends T> r1, rx.functions.p<? super T, ? extends java.lang.Iterable<? extends R>> r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public static <T, R> rx.e<R> a(rx.e<? extends T> r1, rx.functions.p<? super T, ? extends java.lang.Iterable<? extends R>> r2, int r3) {
            boolean r0 = r1 instanceof rx.internal.util.k
            if (r0 == 0) goto L14
            rx.internal.util.k r1 = (rx.internal.util.k) r1
            java.lang.Object r1 = r1.y7()
            rx.internal.operators.k0$c r3 = new rx.internal.operators.k0$c
            r3.<init>(r1, r2)
            rx.e r1 = rx.e.I6(r3)
            return r1
        L14:
            rx.internal.operators.k0 r0 = new rx.internal.operators.k0
            r0.<init>(r1, r2, r3)
            rx.e r1 = rx.e.I6(r0)
            return r1
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super R> r4) {
            r3 = this;
            rx.internal.operators.k0$b r0 = new rx.internal.operators.k0$b
            rx.functions.p<? super T, ? extends java.lang.Iterable<? extends R>> r1 = r3.b
            int r2 = r3.c
            r0.<init>(r4, r1, r2)
            r4.add(r0)
            rx.internal.operators.k0$a r1 = new rx.internal.operators.k0$a
            r1.<init>(r3, r0)
            r4.setProducer(r1)
            rx.e<? extends T> r4 = r3.a
            r4.J6(r0)
            return
    }
}
