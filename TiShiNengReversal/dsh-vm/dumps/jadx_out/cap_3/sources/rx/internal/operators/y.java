package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class y<T, R> implements rx.e.a<R> {
    final rx.e<? extends T>[] a;
    final java.lang.Iterable<? extends rx.e<? extends T>> b;
    final rx.functions.y<? extends R> c;
    final int d;
    final boolean e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T, R> extends rx.l<T> {
        final rx.internal.operators.y.b<T, R> a;
        final int b;
        boolean c;

        public a(rx.internal.operators.y.b<T, R> r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                int r1 = r1.d
                long r1 = (long) r1
                r0.request(r1)
                return
        }

        public void g(long r1) {
                r0 = this;
                r0.request(r1)
                return
        }

        public void onCompleted() {
                r3 = this;
                boolean r0 = r3.c
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r3.c = r0
                rx.internal.operators.y$b<T, R> r0 = r3.a
                r1 = 0
                int r2 = r3.b
                r0.d(r1, r2)
                return
        }

        public void onError(java.lang.Throwable r3) {
                r2 = this;
                boolean r0 = r2.c
                if (r0 == 0) goto L8
                rx.plugins.c.I(r3)
                return
            L8:
                rx.internal.operators.y$b<T, R> r0 = r2.a
                r0.f(r3)
                r3 = 1
                r2.c = r3
                rx.internal.operators.y$b<T, R> r3 = r2.a
                r0 = 0
                int r1 = r2.b
                r3.d(r0, r1)
                return
        }

        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.c
                if (r0 == 0) goto L5
                return
            L5:
                rx.internal.operators.y$b<T, R> r0 = r2.a
                java.lang.Object r3 = rx.internal.operators.v.j(r3)
                int r1 = r2.b
                r0.d(r3, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T, R> extends java.util.concurrent.atomic.AtomicInteger implements rx.g, rx.m {
        static final java.lang.Object n = null;
        private static final long serialVersionUID = 8567835998786448817L;
        final rx.l<? super R> a;
        final rx.functions.y<? extends R> b;
        final rx.internal.operators.y.a<T, R>[] c;
        final int d;
        final java.lang.Object[] e;
        final rx.internal.util.atomic.e<java.lang.Object> f;
        final boolean g;
        volatile boolean h;
        volatile boolean i;
        final java.util.concurrent.atomic.AtomicLong j;
        final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> k;
        int l;
        int m;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                rx.internal.operators.y.b.n = r0
                return
        }

        public b(rx.l<? super R> r1, rx.functions.y<? extends R> r2, int r3, int r4, boolean r5) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.d = r4
                r0.g = r5
                java.lang.Object[] r1 = new java.lang.Object[r3]
                r0.e = r1
                java.lang.Object r2 = rx.internal.operators.y.b.n
                java.util.Arrays.fill(r1, r2)
                rx.internal.operators.y$a[] r1 = new rx.internal.operators.y.a[r3]
                r0.c = r1
                rx.internal.util.atomic.e r1 = new rx.internal.util.atomic.e
                r1.<init>(r4)
                r0.f = r1
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.j = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.k = r1
                return
        }

        void a(java.util.Queue<?> r4) {
                r3 = this;
                r4.clear()
                rx.internal.operators.y$a<T, R>[] r4 = r3.c
                int r0 = r4.length
                r1 = 0
            L7:
                if (r1 >= r0) goto L11
                r2 = r4[r1]
                r2.unsubscribe()
                int r1 = r1 + 1
                goto L7
            L11:
                return
        }

        boolean b(boolean r3, boolean r4, rx.l<?> r5, java.util.Queue<?> r6, boolean r7) {
                r2 = this;
                boolean r0 = r2.h
                r1 = 1
                if (r0 == 0) goto L9
                r2.a(r6)
                return r1
            L9:
                if (r3 == 0) goto L38
                if (r7 == 0) goto L21
                if (r4 == 0) goto L38
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r3 = r2.k
                java.lang.Object r3 = r3.get()
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                if (r3 == 0) goto L1d
                r5.onError(r3)
                goto L20
            L1d:
                r5.onCompleted()
            L20:
                return r1
            L21:
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r3 = r2.k
                java.lang.Object r3 = r3.get()
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                if (r3 == 0) goto L32
                r2.a(r6)
                r5.onError(r3)
                return r1
            L32:
                if (r4 == 0) goto L38
                r5.onCompleted()
                return r1
            L38:
                r3 = 0
                return r3
        }

        void d(java.lang.Object r9, int r10) {
                r8 = this;
                rx.internal.operators.y$a<T, R>[] r0 = r8.c
                r0 = r0[r10]
                monitor-enter(r8)
                java.lang.Object[] r1 = r8.e     // Catch: java.lang.Throwable -> L15
                int r2 = r1.length     // Catch: java.lang.Throwable -> L15
                r3 = r1[r10]     // Catch: java.lang.Throwable -> L15
                int r4 = r8.l     // Catch: java.lang.Throwable -> L15
                java.lang.Object r5 = rx.internal.operators.y.b.n     // Catch: java.lang.Throwable -> L15
                if (r3 != r5) goto L17
                int r4 = r4 + 1
                r8.l = r4     // Catch: java.lang.Throwable -> L15
                goto L17
            L15:
                r9 = move-exception
                goto L67
            L17:
                int r6 = r8.m     // Catch: java.lang.Throwable -> L15
                if (r9 != 0) goto L20
                int r6 = r6 + 1
                r8.m = r6     // Catch: java.lang.Throwable -> L15
                goto L26
            L20:
                java.lang.Object r7 = rx.internal.operators.v.e(r9)     // Catch: java.lang.Throwable -> L15
                r1[r10] = r7     // Catch: java.lang.Throwable -> L15
            L26:
                r10 = 1
                if (r4 != r2) goto L2b
                r1 = 1
                goto L2c
            L2b:
                r1 = 0
            L2c:
                if (r6 == r2) goto L56
                if (r9 != 0) goto L33
                if (r3 != r5) goto L33
                goto L56
            L33:
                if (r9 == 0) goto L43
                if (r1 == 0) goto L43
                rx.internal.util.atomic.e<java.lang.Object> r10 = r8.f     // Catch: java.lang.Throwable -> L15
                java.lang.Object[] r2 = r8.e     // Catch: java.lang.Throwable -> L15
                java.lang.Object r2 = r2.clone()     // Catch: java.lang.Throwable -> L15
                r10.r(r0, r2)     // Catch: java.lang.Throwable -> L15
                goto L58
            L43:
                if (r9 != 0) goto L58
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r2 = r8.k     // Catch: java.lang.Throwable -> L15
                java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L15
                if (r2 == 0) goto L58
                if (r3 == r5) goto L53
                boolean r2 = r8.g     // Catch: java.lang.Throwable -> L15
                if (r2 != 0) goto L58
            L53:
                r8.i = r10     // Catch: java.lang.Throwable -> L15
                goto L58
            L56:
                r8.i = r10     // Catch: java.lang.Throwable -> L15
            L58:
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L15
                if (r1 != 0) goto L63
                if (r9 == 0) goto L63
                r9 = 1
                r0.g(r9)
                return
            L63:
                r8.e()
                return
            L67:
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L15
                throw r9
        }

        void e() {
                r16 = this;
                r1 = r16
                int r0 = r1.getAndIncrement()
                if (r0 == 0) goto La
                goto L91
            La:
                rx.internal.util.atomic.e<java.lang.Object> r5 = r1.f
                rx.l<? super R> r4 = r1.a
                boolean r6 = r1.g
                java.util.concurrent.atomic.AtomicLong r0 = r1.j
                r7 = 1
                r8 = 1
            L14:
                boolean r2 = r1.i
                boolean r3 = r5.isEmpty()
                boolean r2 = r1.b(r2, r3, r4, r5, r6)
                if (r2 == 0) goto L22
                goto L91
            L22:
                long r9 = r0.get()
                r11 = 0
                r13 = r11
            L29:
                int r2 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
                if (r2 == 0) goto L7a
                boolean r2 = r1.i
                java.lang.Object r3 = r5.peek()
                r15 = r3
                rx.internal.operators.y$a r15 = (rx.internal.operators.y.a) r15
                if (r15 != 0) goto L3a
                r3 = 1
                goto L3b
            L3a:
                r3 = 0
            L3b:
                boolean r2 = r1.b(r2, r3, r4, r5, r6)
                if (r2 == 0) goto L42
                goto L91
            L42:
                if (r3 == 0) goto L45
                goto L7a
            L45:
                r5.poll()
                java.lang.Object r2 = r5.poll()
                java.lang.Object[] r2 = (java.lang.Object[]) r2
                if (r2 != 0) goto L60
                r1.h = r7
                r1.a(r5)
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "Broken queue?! Sender received but not the array."
                r0.<init>(r2)
                r4.onError(r0)
                return
            L60:
                rx.functions.y<? extends R> r3 = r1.b     // Catch: java.lang.Throwable -> L70
                java.lang.Object r2 = r3.call(r2)     // Catch: java.lang.Throwable -> L70
                r4.onNext(r2)
                r2 = 1
                r15.g(r2)
                long r13 = r13 + r2
                goto L29
            L70:
                r0 = move-exception
                r1.h = r7
                r1.a(r5)
                r4.onError(r0)
                return
            L7a:
                int r2 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r2 == 0) goto L8a
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r11 == 0) goto L8a
                rx.internal.operators.a.i(r0, r13)
            L8a:
                int r2 = -r8
                int r8 = r1.addAndGet(r2)
                if (r8 != 0) goto L14
            L91:
                return
        }

        void f(java.lang.Throwable r6) {
                r5 = this;
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r5.k
            L2:
                java.lang.Object r1 = r0.get()
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                if (r1 == 0) goto L36
                boolean r2 = r1 instanceof rx.exceptions.CompositeException
                if (r2 == 0) goto L23
                r2 = r1
                rx.exceptions.CompositeException r2 = (rx.exceptions.CompositeException) r2
                java.util.ArrayList r3 = new java.util.ArrayList
                java.util.List r2 = r2.getExceptions()
                r3.<init>(r2)
                r3.add(r6)
                rx.exceptions.CompositeException r2 = new rx.exceptions.CompositeException
                r2.<init>(r3)
                goto L37
            L23:
                rx.exceptions.CompositeException r2 = new rx.exceptions.CompositeException
                r3 = 2
                java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
                r4 = 0
                r3[r4] = r1
                r4 = 1
                r3[r4] = r6
                java.util.List r3 = java.util.Arrays.asList(r3)
                r2.<init>(r3)
                goto L37
            L36:
                r2 = r6
            L37:
                boolean r1 = androidx.camera.view.p.a(r0, r1, r2)
                if (r1 == 0) goto L2
                return
        }

        public void g(rx.e<? extends T>[] r6) {
                r5 = this;
                rx.internal.operators.y$a<T, R>[] r0 = r5.c
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L5:
                if (r3 >= r1) goto L11
                rx.internal.operators.y$a r4 = new rx.internal.operators.y$a
                r4.<init>(r5, r3)
                r0[r3] = r4
                int r3 = r3 + 1
                goto L5
            L11:
                r5.lazySet(r2)
                rx.l<? super R> r3 = r5.a
                r3.add(r5)
                rx.l<? super R> r3 = r5.a
                r3.setProducer(r5)
            L1e:
                if (r2 >= r1) goto L2f
                boolean r3 = r5.h
                if (r3 == 0) goto L25
                goto L2f
            L25:
                r3 = r6[r2]
                r4 = r0[r2]
                r3.r5(r4)
                int r2 = r2 + 1
                goto L1e
            L2f:
                return
        }

        public boolean isUnsubscribed() {
                r1 = this;
                boolean r0 = r1.h
                return r0
        }

        public void request(long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto L11
                if (r2 == 0) goto L10
                java.util.concurrent.atomic.AtomicLong r0 = r3.j
                rx.internal.operators.a.b(r0, r4)
                r3.e()
            L10:
                return
            L11:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "n >= required but it was "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        public void unsubscribe() {
                r1 = this;
                boolean r0 = r1.h
                if (r0 != 0) goto L12
                r0 = 1
                r1.h = r0
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L12
                rx.internal.util.atomic.e<java.lang.Object> r0 = r1.f
                r1.a(r0)
            L12:
                return
        }
    }

    public y(java.lang.Iterable<? extends rx.e<? extends T>> r7, rx.functions.y<? extends R> r8) {
            r6 = this;
            int r4 = rx.internal.util.j.d
            r5 = 0
            r1 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public y(rx.e<? extends T>[] r1, java.lang.Iterable<? extends rx.e<? extends T>> r2, rx.functions.y<? extends R> r3, int r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super R> r8) {
            r7 = this;
            rx.e<? extends T>[] r0 = r7.a
            if (r0 != 0) goto L46
            java.lang.Iterable<? extends rx.e<? extends T>> r0 = r7.b
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L1b
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            rx.e[] r1 = new rx.e[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            rx.e[] r0 = (rx.e[]) r0
            int r1 = r0.length
        L19:
            r4 = r1
            goto L48
        L1b:
            r1 = 8
            rx.e[] r1 = new rx.e[r1]
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = 0
        L25:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L43
            java.lang.Object r4 = r0.next()
            rx.e r4 = (rx.e) r4
            int r5 = r1.length
            if (r3 != r5) goto L3d
            int r5 = r3 >> 2
            int r5 = r5 + r3
            rx.e[] r5 = new rx.e[r5]
            java.lang.System.arraycopy(r1, r2, r5, r2, r3)
            r1 = r5
        L3d:
            int r5 = r3 + 1
            r1[r3] = r4
            r3 = r5
            goto L25
        L43:
            r0 = r1
            r4 = r3
            goto L48
        L46:
            int r1 = r0.length
            goto L19
        L48:
            if (r4 != 0) goto L4e
            r8.onCompleted()
            return
        L4e:
            rx.internal.operators.y$b r1 = new rx.internal.operators.y$b
            rx.functions.y<? extends R> r3 = r7.c
            int r5 = r7.d
            boolean r6 = r7.e
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r1.g(r0)
            return
    }
}
