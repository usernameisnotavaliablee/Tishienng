package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class g2<T, R> implements rx.e.b<R, T> {
    final rx.functions.p<? super T, ? extends rx.e<? extends R>> a;
    final int b;
    private final int c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends rx.l<T> {
        final rx.internal.operators.g2.c<?, T> a;
        final java.util.Queue<java.lang.Object> b;
        volatile boolean c;
        java.lang.Throwable d;

        public a(rx.internal.operators.g2.c<?, T> r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                boolean r1 = rx.internal.util.unsafe.n0.f()
                if (r1 == 0) goto L11
                rx.internal.util.unsafe.z r1 = new rx.internal.util.unsafe.z
                r1.<init>(r2)
                goto L16
            L11:
                rx.internal.util.atomic.d r1 = new rx.internal.util.atomic.d
                r1.<init>(r2)
            L16:
                r0.b = r1
                long r1 = (long) r2
                r0.request(r1)
                return
        }

        void g(long r1) {
                r0 = this;
                r0.request(r1)
                return
        }

        public void onCompleted() {
                r1 = this;
                r0 = 1
                r1.c = r0
                rx.internal.operators.g2$c<?, T> r0 = r1.a
                r0.j()
                return
        }

        public void onError(java.lang.Throwable r1) {
                r0 = this;
                r0.d = r1
                r1 = 1
                r0.c = r1
                rx.internal.operators.g2$c<?, T> r1 = r0.a
                r1.j()
                return
        }

        public void onNext(T r2) {
                r1 = this;
                java.util.Queue<java.lang.Object> r0 = r1.b
                java.lang.Object r2 = rx.internal.operators.v.j(r2)
                r0.offer(r2)
                rx.internal.operators.g2$c<?, T> r2 = r1.a
                r2.j()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b extends java.util.concurrent.atomic.AtomicLong implements rx.g {
        private static final long serialVersionUID = -657299606803478389L;
        final rx.internal.operators.g2.c<?, ?> a;

        public b(rx.internal.operators.g2.c<?, ?> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public void request(long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto L11
                if (r2 <= 0) goto L10
                rx.internal.operators.a.b(r3, r4)
                rx.internal.operators.g2$c<?, ?> r4 = r3.a
                r4.j()
            L10:
                return
            L11:
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
    static final class c<T, R> extends rx.l<T> {
        final rx.functions.p<? super T, ? extends rx.e<? extends R>> a;
        final int b;
        final rx.l<? super R> c;
        final java.util.Queue<rx.internal.operators.g2.a<R>> d;
        volatile boolean e;
        java.lang.Throwable f;
        volatile boolean g;
        final java.util.concurrent.atomic.AtomicInteger h;
        private rx.internal.operators.g2.b i;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements rx.functions.a {
            final /* synthetic */ rx.internal.operators.g2.c a;

            a(rx.internal.operators.g2.c r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void call() {
                    r2 = this;
                    rx.internal.operators.g2$c r0 = r2.a
                    r1 = 1
                    r0.g = r1
                    rx.internal.operators.g2$c r0 = r2.a
                    java.util.concurrent.atomic.AtomicInteger r0 = r0.h
                    int r0 = r0.getAndIncrement()
                    if (r0 != 0) goto L14
                    rx.internal.operators.g2$c r0 = r2.a
                    r0.g()
                L14:
                    return
            }
        }

        public c(rx.functions.p<? super T, ? extends rx.e<? extends R>> r1, int r2, int r3, rx.l<? super R> r4) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r4
                java.util.LinkedList r1 = new java.util.LinkedList
                r1.<init>()
                r0.d = r1
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r1.<init>()
                r0.h = r1
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r3 != r1) goto L22
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                goto L23
            L22:
                long r1 = (long) r3
            L23:
                r0.request(r1)
                return
        }

        void g() {
                r3 = this;
                java.util.Queue<rx.internal.operators.g2$a<R>> r0 = r3.d
                monitor-enter(r0)
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L25
                java.util.Queue<rx.internal.operators.g2$a<R>> r2 = r3.d     // Catch: java.lang.Throwable -> L25
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L25
                java.util.Queue<rx.internal.operators.g2$a<R>> r2 = r3.d     // Catch: java.lang.Throwable -> L25
                r2.clear()     // Catch: java.lang.Throwable -> L25
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
                java.util.Iterator r0 = r1.iterator()
            L14:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L24
                java.lang.Object r1 = r0.next()
                rx.m r1 = (rx.m) r1
                r1.unsubscribe()
                goto L14
            L24:
                return
            L25:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
                throw r1
        }

        void j() {
                r19 = this;
                r1 = r19
                java.util.concurrent.atomic.AtomicInteger r0 = r1.h
                int r0 = r0.getAndIncrement()
                if (r0 == 0) goto Lc
                goto Lba
            Lc:
                rx.internal.operators.g2$b r0 = r1.i
                rx.l<? super R> r2 = r1.c
                r3 = 1
                r4 = 1
            L12:
                boolean r5 = r1.g
                if (r5 == 0) goto L1a
                r1.g()
                return
            L1a:
                boolean r5 = r1.e
                java.util.Queue<rx.internal.operators.g2$a<R>> r6 = r1.d
                monitor-enter(r6)
                java.util.Queue<rx.internal.operators.g2$a<R>> r7 = r1.d     // Catch: java.lang.Throwable -> Lbb
                java.lang.Object r7 = r7.peek()     // Catch: java.lang.Throwable -> Lbb
                rx.internal.operators.g2$a r7 = (rx.internal.operators.g2.a) r7     // Catch: java.lang.Throwable -> Lbb
                monitor-exit(r6)     // Catch: java.lang.Throwable -> Lbb
                r6 = 0
                if (r7 != 0) goto L2d
                r8 = 1
                goto L2e
            L2d:
                r8 = 0
            L2e:
                if (r5 == 0) goto L41
                java.lang.Throwable r5 = r1.f
                if (r5 == 0) goto L3b
                r1.g()
                r2.onError(r5)
                return
            L3b:
                if (r8 == 0) goto L41
                r2.onCompleted()
                return
            L41:
                if (r8 != 0) goto Lb1
                long r8 = r0.get()
                java.util.Queue<java.lang.Object> r5 = r7.b
                r12 = 0
            L4b:
                boolean r14 = r7.c
                java.lang.Object r15 = r5.peek()
                if (r15 != 0) goto L58
                r16 = 1
            L55:
                r17 = 0
                goto L5b
            L58:
                r16 = 0
                goto L55
            L5b:
                r10 = 1
                if (r14 == 0) goto L80
                java.lang.Throwable r14 = r7.d
                if (r14 == 0) goto L6a
                r1.g()
                r2.onError(r14)
                return
            L6a:
                if (r16 == 0) goto L80
                java.util.Queue<rx.internal.operators.g2$a<R>> r14 = r1.d
                monitor-enter(r14)
                java.util.Queue<rx.internal.operators.g2$a<R>> r5 = r1.d     // Catch: java.lang.Throwable -> L7d
                r5.poll()     // Catch: java.lang.Throwable -> L7d
                monitor-exit(r14)     // Catch: java.lang.Throwable -> L7d
                r7.unsubscribe()
                r1.request(r10)
                r6 = 1
                goto L87
            L7d:
                r0 = move-exception
                monitor-exit(r14)     // Catch: java.lang.Throwable -> L7d
                throw r0
            L80:
                if (r16 == 0) goto L83
                goto L87
            L83:
                int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r14 != 0) goto La0
            L87:
                int r5 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
                if (r5 == 0) goto L9c
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r5 == 0) goto L97
                rx.internal.operators.a.i(r0, r12)
            L97:
                if (r6 != 0) goto L9c
                r7.g(r12)
            L9c:
                if (r6 == 0) goto Lb1
                goto L12
            La0:
                r5.poll()
                java.lang.Object r14 = rx.internal.operators.v.e(r15)     // Catch: java.lang.Throwable -> Lac
                r2.onNext(r14)     // Catch: java.lang.Throwable -> Lac
                long r12 = r12 + r10
                goto L4b
            Lac:
                r0 = move-exception
                rx.exceptions.a.g(r0, r2, r15)
                return
            Lb1:
                java.util.concurrent.atomic.AtomicInteger r5 = r1.h
                int r4 = -r4
                int r4 = r5.addAndGet(r4)
                if (r4 != 0) goto L12
            Lba:
                return
            Lbb:
                r0 = move-exception
                monitor-exit(r6)     // Catch: java.lang.Throwable -> Lbb
                throw r0
        }

        public void onCompleted() {
                r1 = this;
                r0 = 1
                r1.e = r0
                r1.j()
                return
        }

        public void onError(java.lang.Throwable r1) {
                r0 = this;
                r0.f = r1
                r1 = 1
                r0.e = r1
                r0.j()
                return
        }

        public void onNext(T r4) {
                r3 = this;
                rx.functions.p<? super T, ? extends rx.e<? extends R>> r0 = r3.a     // Catch: java.lang.Throwable -> L33
                java.lang.Object r0 = r0.call(r4)     // Catch: java.lang.Throwable -> L33
                rx.e r0 = (rx.e) r0     // Catch: java.lang.Throwable -> L33
                boolean r4 = r3.g
                if (r4 == 0) goto Ld
                goto L29
            Ld:
                rx.internal.operators.g2$a r4 = new rx.internal.operators.g2$a
                int r1 = r3.b
                r4.<init>(r3, r1)
                java.util.Queue<rx.internal.operators.g2$a<R>> r1 = r3.d
                monitor-enter(r1)
                boolean r2 = r3.g     // Catch: java.lang.Throwable -> L1d
                if (r2 == 0) goto L1f
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L1d
                return
            L1d:
                r4 = move-exception
                goto L31
            L1f:
                java.util.Queue<rx.internal.operators.g2$a<R>> r2 = r3.d     // Catch: java.lang.Throwable -> L1d
                r2.add(r4)     // Catch: java.lang.Throwable -> L1d
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L1d
                boolean r1 = r3.g
                if (r1 == 0) goto L2a
            L29:
                return
            L2a:
                r0.J6(r4)
                r3.j()
                return
            L31:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L1d
                throw r4
            L33:
                r0 = move-exception
                rx.l<? super R> r1 = r3.c
                rx.exceptions.a.g(r0, r1, r4)
                return
        }

        void s() {
                r2 = this;
                rx.internal.operators.g2$b r0 = new rx.internal.operators.g2$b
                r0.<init>(r2)
                r2.i = r0
                rx.internal.operators.g2$c$a r0 = new rx.internal.operators.g2$c$a
                r0.<init>(r2)
                rx.m r0 = rx.subscriptions.f.a(r0)
                r2.add(r0)
                rx.l<? super R> r0 = r2.c
                r0.add(r2)
                rx.l<? super R> r0 = r2.c
                rx.internal.operators.g2$b r1 = r2.i
                r0.setProducer(r1)
                return
        }
    }

    public g2(rx.functions.p<? super T, ? extends rx.e<? extends R>> r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super R> r5) {
            r4 = this;
            rx.internal.operators.g2$c r0 = new rx.internal.operators.g2$c
            rx.functions.p<? super T, ? extends rx.e<? extends R>> r1 = r4.a
            int r2 = r4.b
            int r3 = r4.c
            r0.<init>(r1, r2, r3, r5)
            r0.s()
            return r0
    }
}
