package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class k3<T> implements rx.e.b<T, rx.e<? extends T>> {
    final boolean a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a {
        static final rx.internal.operators.k3<java.lang.Object> a = null;

        static {
                rx.internal.operators.k3 r0 = new rx.internal.operators.k3
                r1 = 0
                r0.<init>(r1)
                rx.internal.operators.k3.a.a = r0
                return
        }

        a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b {
        static final rx.internal.operators.k3<java.lang.Object> a = null;

        static {
                rx.internal.operators.k3 r0 = new rx.internal.operators.k3
                r1 = 1
                r0.<init>(r1)
                rx.internal.operators.k3.b.a = r0
                return
        }

        b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c<T> extends rx.l<T> {
        private final long a;
        private final rx.internal.operators.k3.d<T> b;

        c(long r1, rx.internal.operators.k3.d<T> r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r3
                return
        }

        static /* synthetic */ long g(rx.internal.operators.k3.c r2) {
                long r0 = r2.a
                return r0
        }

        public void onCompleted() {
                r3 = this;
                rx.internal.operators.k3$d<T> r0 = r3.b
                long r1 = r3.a
                r0.A(r1)
                return
        }

        public void onError(java.lang.Throwable r4) {
                r3 = this;
                rx.internal.operators.k3$d<T> r0 = r3.b
                long r1 = r3.a
                r0.H(r4, r1)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                rx.internal.operators.k3$d<T> r0 = r1.b
                r0.G(r2, r1)
                return
        }

        public void setProducer(rx.g r4) {
                r3 = this;
                rx.internal.operators.k3$d<T> r0 = r3.b
                long r1 = r3.a
                r0.P(r4, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class d<T> extends rx.l<rx.e<? extends T>> {
        static final java.lang.Throwable m = null;
        final rx.l<? super T> a;
        final rx.subscriptions.e b;
        final boolean c;
        final java.util.concurrent.atomic.AtomicLong d;
        final rx.internal.util.atomic.e<java.lang.Object> e;
        boolean f;
        boolean g;
        long h;
        rx.g i;
        volatile boolean j;
        java.lang.Throwable k;
        boolean l;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements rx.functions.a {
            final /* synthetic */ rx.internal.operators.k3.d a;

            a(rx.internal.operators.k3.d r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void call() {
                    r1 = this;
                    rx.internal.operators.k3$d r0 = r1.a
                    r0.s()
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class b implements rx.g {
            final /* synthetic */ rx.internal.operators.k3.d a;

            b(rx.internal.operators.k3.d r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void request(long r4) {
                    r3 = this;
                    r0 = 0
                    int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                    if (r2 <= 0) goto Lc
                    rx.internal.operators.k3$d r0 = r3.a
                    r0.j(r4)
                    return
                Lc:
                    if (r2 < 0) goto Lf
                    return
                Lf:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "n >= 0 expected but it was "
                    r1.append(r2)
                    r1.append(r4)
                    java.lang.String r4 = r1.toString()
                    r0.<init>(r4)
                    throw r0
            }
        }

        static {
                java.lang.Throwable r0 = new java.lang.Throwable
                java.lang.String r1 = "Terminal error"
                r0.<init>(r1)
                rx.internal.operators.k3.d.m = r0
                return
        }

        d(rx.l<? super T> r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                rx.subscriptions.e r1 = new rx.subscriptions.e
                r1.<init>()
                r0.b = r1
                r0.c = r2
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.d = r1
                rx.internal.util.atomic.e r1 = new rx.internal.util.atomic.e
                int r2 = rx.internal.util.j.d
                r1.<init>(r2)
                r0.e = r1
                return
        }

        void A(long r4) {
                r3 = this;
                monitor-enter(r3)
                java.util.concurrent.atomic.AtomicLong r0 = r3.d     // Catch: java.lang.Throwable -> Ld
                long r0 = r0.get()     // Catch: java.lang.Throwable -> Ld
                int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r2 == 0) goto Lf
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld
                return
            Ld:
                r4 = move-exception
                goto L1a
            Lf:
                r4 = 0
                r3.l = r4     // Catch: java.lang.Throwable -> Ld
                r4 = 0
                r3.i = r4     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld
                r3.B()
                return
            L1a:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld
                throw r4
        }

        void B() {
                r17 = this;
                r1 = r17
                monitor-enter(r17)
                boolean r0 = r1.f     // Catch: java.lang.Throwable -> Lc
                r2 = 1
                if (r0 == 0) goto Lf
                r1.g = r2     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r17)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r0 = move-exception
                goto Lb6
            Lf:
                r1.f = r2     // Catch: java.lang.Throwable -> Lc
                boolean r0 = r1.l     // Catch: java.lang.Throwable -> Lc
                long r2 = r1.h     // Catch: java.lang.Throwable -> Lc
                java.lang.Throwable r4 = r1.k     // Catch: java.lang.Throwable -> Lc
                if (r4 == 0) goto L23
                java.lang.Throwable r5 = rx.internal.operators.k3.d.m     // Catch: java.lang.Throwable -> Lc
                if (r4 == r5) goto L23
                boolean r6 = r1.c     // Catch: java.lang.Throwable -> Lc
                if (r6 != 0) goto L23
                r1.k = r5     // Catch: java.lang.Throwable -> Lc
            L23:
                monitor-exit(r17)     // Catch: java.lang.Throwable -> Lc
                rx.internal.util.atomic.e<java.lang.Object> r5 = r1.e
                java.util.concurrent.atomic.AtomicLong r8 = r1.d
                rx.l<? super T> r6 = r1.a
                boolean r7 = r1.j
                r9 = r2
                r2 = r7
                r3 = r0
            L2f:
                r11 = 0
            L31:
                int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r0 == 0) goto L6b
                boolean r7 = r6.isUnsubscribed()
                if (r7 == 0) goto L3c
                goto L80
            L3c:
                boolean r7 = r5.isEmpty()
                boolean r13 = r1.g(r2, r3, r4, r5, r6, r7)
                if (r13 == 0) goto L47
                goto L80
            L47:
                if (r7 == 0) goto L4a
                goto L6b
            L4a:
                java.lang.Object r0 = r5.poll()
                rx.internal.operators.k3$c r0 = (rx.internal.operators.k3.c) r0
                java.lang.Object r7 = r5.poll()
                java.lang.Object r7 = rx.internal.operators.v.e(r7)
                long r13 = r8.get()
                long r15 = rx.internal.operators.k3.c.g(r0)
                int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r0 != 0) goto L31
                r6.onNext(r7)
                r13 = 1
                long r11 = r11 + r13
                goto L31
            L6b:
                if (r0 != 0) goto L81
                boolean r0 = r6.isUnsubscribed()
                if (r0 == 0) goto L74
                goto L80
            L74:
                boolean r2 = r1.j
                boolean r7 = r5.isEmpty()
                boolean r0 = r1.g(r2, r3, r4, r5, r6, r7)
                if (r0 == 0) goto L81
            L80:
                return
            L81:
                monitor-enter(r17)
                long r2 = r1.h     // Catch: java.lang.Throwable -> L92
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
                if (r0 == 0) goto L90
                long r2 = r2 - r11
                r1.h = r2     // Catch: java.lang.Throwable -> L92
            L90:
                r9 = r2
                goto L94
            L92:
                r0 = move-exception
                goto Lb4
            L94:
                boolean r0 = r1.g     // Catch: java.lang.Throwable -> L92
                r2 = 0
                if (r0 != 0) goto L9d
                r1.f = r2     // Catch: java.lang.Throwable -> L92
                monitor-exit(r17)     // Catch: java.lang.Throwable -> L92
                return
            L9d:
                r1.g = r2     // Catch: java.lang.Throwable -> L92
                boolean r2 = r1.j     // Catch: java.lang.Throwable -> L92
                boolean r3 = r1.l     // Catch: java.lang.Throwable -> L92
                java.lang.Throwable r4 = r1.k     // Catch: java.lang.Throwable -> L92
                if (r4 == 0) goto Lb1
                java.lang.Throwable r0 = rx.internal.operators.k3.d.m     // Catch: java.lang.Throwable -> L92
                if (r4 == r0) goto Lb1
                boolean r7 = r1.c     // Catch: java.lang.Throwable -> L92
                if (r7 != 0) goto Lb1
                r1.k = r0     // Catch: java.lang.Throwable -> L92
            Lb1:
                monitor-exit(r17)     // Catch: java.lang.Throwable -> L92
                goto L2f
            Lb4:
                monitor-exit(r17)     // Catch: java.lang.Throwable -> L92
                throw r0
            Lb6:
                monitor-exit(r17)     // Catch: java.lang.Throwable -> Lc
                throw r0
        }

        void G(T r6, rx.internal.operators.k3.c<T> r7) {
                r5 = this;
                monitor-enter(r5)
                java.util.concurrent.atomic.AtomicLong r0 = r5.d     // Catch: java.lang.Throwable -> L11
                long r0 = r0.get()     // Catch: java.lang.Throwable -> L11
                long r2 = rx.internal.operators.k3.c.g(r7)     // Catch: java.lang.Throwable -> L11
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L13
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L11
                return
            L11:
                r6 = move-exception
                goto L21
            L13:
                rx.internal.util.atomic.e<java.lang.Object> r0 = r5.e     // Catch: java.lang.Throwable -> L11
                java.lang.Object r6 = rx.internal.operators.v.j(r6)     // Catch: java.lang.Throwable -> L11
                r0.r(r7, r6)     // Catch: java.lang.Throwable -> L11
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L11
                r5.B()
                return
            L21:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L11
                throw r6
        }

        void H(java.lang.Throwable r4, long r5) {
                r3 = this;
                monitor-enter(r3)
                java.util.concurrent.atomic.AtomicLong r0 = r3.d     // Catch: java.lang.Throwable -> L16
                long r0 = r0.get()     // Catch: java.lang.Throwable -> L16
                int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r2 != 0) goto L18
                boolean r5 = r3.S(r4)     // Catch: java.lang.Throwable -> L16
                r6 = 0
                r3.l = r6     // Catch: java.lang.Throwable -> L16
                r6 = 0
                r3.i = r6     // Catch: java.lang.Throwable -> L16
                goto L19
            L16:
                r4 = move-exception
                goto L24
            L18:
                r5 = 1
            L19:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L16
                if (r5 == 0) goto L20
                r3.B()
                return
            L20:
                r3.R(r4)
                return
            L24:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L16
                throw r4
        }

        void N() {
                r2 = this;
                rx.l<? super T> r0 = r2.a
                rx.subscriptions.e r1 = r2.b
                r0.add(r1)
                rx.l<? super T> r0 = r2.a
                rx.internal.operators.k3$d$a r1 = new rx.internal.operators.k3$d$a
                r1.<init>(r2)
                rx.m r1 = rx.subscriptions.f.a(r1)
                r0.add(r1)
                rx.l<? super T> r0 = r2.a
                rx.internal.operators.k3$d$b r1 = new rx.internal.operators.k3$d$b
                r1.<init>(r2)
                r0.setProducer(r1)
                return
        }

        void P(rx.g r4, long r5) {
                r3 = this;
                monitor-enter(r3)
                java.util.concurrent.atomic.AtomicLong r0 = r3.d     // Catch: java.lang.Throwable -> Ld
                long r0 = r0.get()     // Catch: java.lang.Throwable -> Ld
                int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r2 == 0) goto Lf
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld
                return
            Ld:
                r4 = move-exception
                goto L18
            Lf:
                long r5 = r3.h     // Catch: java.lang.Throwable -> Ld
                r3.i = r4     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld
                r4.request(r5)
                return
            L18:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld
                throw r4
        }

        public void Q(rx.e<? extends T> r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r3.d
                long r0 = r0.incrementAndGet()
                rx.subscriptions.e r2 = r3.b
                rx.m r2 = r2.a()
                if (r2 == 0) goto L11
                r2.unsubscribe()
            L11:
                monitor-enter(r3)
                rx.internal.operators.k3$c r2 = new rx.internal.operators.k3$c     // Catch: java.lang.Throwable -> L27
                r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L27
                r0 = 1
                r3.l = r0     // Catch: java.lang.Throwable -> L27
                r0 = 0
                r3.i = r0     // Catch: java.lang.Throwable -> L27
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
                rx.subscriptions.e r0 = r3.b
                r0.b(r2)
                r4.J6(r2)
                return
            L27:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
                throw r4
        }

        void R(java.lang.Throwable r1) {
                r0 = this;
                rx.plugins.c.I(r1)
                return
        }

        boolean S(java.lang.Throwable r6) {
                r5 = this;
                java.lang.Throwable r0 = r5.k
                java.lang.Throwable r1 = rx.internal.operators.k3.d.m
                r2 = 0
                if (r0 != r1) goto L8
                return r2
            L8:
                r1 = 1
                if (r0 != 0) goto Le
                r5.k = r6
                goto L36
            Le:
                boolean r3 = r0 instanceof rx.exceptions.CompositeException
                if (r3 == 0) goto L28
                java.util.ArrayList r2 = new java.util.ArrayList
                rx.exceptions.CompositeException r0 = (rx.exceptions.CompositeException) r0
                java.util.List r0 = r0.getExceptions()
                r2.<init>(r0)
                r2.add(r6)
                rx.exceptions.CompositeException r6 = new rx.exceptions.CompositeException
                r6.<init>(r2)
                r5.k = r6
                goto L36
            L28:
                rx.exceptions.CompositeException r3 = new rx.exceptions.CompositeException
                r4 = 2
                java.lang.Throwable[] r4 = new java.lang.Throwable[r4]
                r4[r2] = r0
                r4[r1] = r6
                r3.<init>(r4)
                r5.k = r3
            L36:
                return r1
        }

        protected boolean g(boolean r3, boolean r4, java.lang.Throwable r5, rx.internal.util.atomic.e<java.lang.Object> r6, rx.l<? super T> r7, boolean r8) {
                r2 = this;
                boolean r0 = r2.c
                r1 = 1
                if (r0 == 0) goto L15
                if (r3 == 0) goto L28
                if (r4 != 0) goto L28
                if (r8 == 0) goto L28
                if (r5 == 0) goto L11
                r7.onError(r5)
                goto L14
            L11:
                r7.onCompleted()
            L14:
                return r1
            L15:
                if (r5 == 0) goto L1e
                r6.clear()
                r7.onError(r5)
                return r1
            L1e:
                if (r3 == 0) goto L28
                if (r4 != 0) goto L28
                if (r8 == 0) goto L28
                r7.onCompleted()
                return r1
            L28:
                r3 = 0
                return r3
        }

        void j(long r4) {
                r3 = this;
                monitor-enter(r3)
                rx.g r0 = r3.i     // Catch: java.lang.Throwable -> L15
                long r1 = r3.h     // Catch: java.lang.Throwable -> L15
                long r1 = rx.internal.operators.a.a(r1, r4)     // Catch: java.lang.Throwable -> L15
                r3.h = r1     // Catch: java.lang.Throwable -> L15
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L15
                if (r0 == 0) goto L11
                r0.request(r4)
            L11:
                r3.B()
                return
            L15:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L15
                throw r4
        }

        public void onCompleted() {
                r1 = this;
                r0 = 1
                r1.j = r0
                r1.B()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.S(r2)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
                if (r0 == 0) goto Lf
                r2 = 1
                r1.j = r2
                r1.B()
                return
            Lf:
                r1.R(r2)
                return
            L13:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
                throw r2
        }

        public /* bridge */ /* synthetic */ void onNext(java.lang.Object r1) {
                r0 = this;
                rx.e r1 = (rx.e) r1
                r0.Q(r1)
                return
        }

        void s() {
                r1 = this;
                monitor-enter(r1)
                r0 = 0
                r1.i = r0     // Catch: java.lang.Throwable -> L6
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
                return
            L6:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
                throw r0
        }
    }

    k3(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static <T> rx.internal.operators.k3<T> a(boolean r0) {
            if (r0 == 0) goto L5
            rx.internal.operators.k3<java.lang.Object> r0 = rx.internal.operators.k3.b.a
            return r0
        L5:
            rx.internal.operators.k3<java.lang.Object> r0 = rx.internal.operators.k3.a.a
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super rx.e<? extends T>> call(rx.l<? super T> r3) {
            r2 = this;
            rx.internal.operators.k3$d r0 = new rx.internal.operators.k3$d
            boolean r1 = r2.a
            r0.<init>(r3, r1)
            r3.add(r0)
            r0.N()
            return r0
    }
}
