package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class r1<T> implements rx.e.b<java.util.List<T>, T> {
    final int a;
    final int b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends rx.l<T> {
        final rx.l<? super java.util.List<T>> a;
        final int b;
        java.util.List<T> c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.operators.r1$a$a, reason: collision with other inner class name */
        class C0023a implements rx.g {
            final /* synthetic */ rx.internal.operators.r1.a a;

            C0023a(rx.internal.operators.r1.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void request(long r4) {
                    r3 = this;
                    r0 = 0
                    int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                    if (r2 < 0) goto L17
                    if (r2 == 0) goto L16
                    rx.internal.operators.r1$a r0 = r3.a
                    int r0 = r0.b
                    long r0 = (long) r0
                    long r4 = rx.internal.operators.a.c(r4, r0)
                    rx.internal.operators.r1$a r0 = r3.a
                    rx.internal.operators.r1.a.g(r0, r4)
                L16:
                    return
                L17:
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
        }

        public a(rx.l<? super java.util.List<T>> r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r1 = 0
                r0.request(r1)
                return
        }

        static /* synthetic */ void g(rx.internal.operators.r1.a r0, long r1) {
                r0.request(r1)
                return
        }

        rx.g j() {
                r1 = this;
                rx.internal.operators.r1$a$a r0 = new rx.internal.operators.r1$a$a
                r0.<init>(r1)
                return r0
        }

        public void onCompleted() {
                r2 = this;
                java.util.List<T> r0 = r2.c
                if (r0 == 0) goto L9
                rx.l<? super java.util.List<T>> r1 = r2.a
                r1.onNext(r0)
            L9:
                rx.l<? super java.util.List<T>> r0 = r2.a
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r0 = 0
                r1.c = r0
                rx.l<? super java.util.List<T>> r0 = r1.a
                r0.onError(r2)
                return
        }

        public void onNext(T r3) {
                r2 = this;
                java.util.List<T> r0 = r2.c
                if (r0 != 0) goto Ld
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r2.b
                r0.<init>(r1)
                r2.c = r0
            Ld:
                r0.add(r3)
                int r3 = r0.size()
                int r1 = r2.b
                if (r3 != r1) goto L20
                r3 = 0
                r2.c = r3
                rx.l<? super java.util.List<T>> r3 = r2.a
                r3.onNext(r0)
            L20:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T> extends rx.l<T> {
        final rx.l<? super java.util.List<T>> a;
        final int b;
        final int c;
        long d;
        final java.util.ArrayDeque<java.util.List<T>> e;
        final java.util.concurrent.atomic.AtomicLong f;
        long g;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        final class a extends java.util.concurrent.atomic.AtomicBoolean implements rx.g {
            private static final long serialVersionUID = -4015894850868853147L;
            final /* synthetic */ rx.internal.operators.r1.b a;

            a(rx.internal.operators.r1.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void request(long r6) {
                    r5 = this;
                    rx.internal.operators.r1$b r0 = r5.a
                    java.util.concurrent.atomic.AtomicLong r1 = r0.f
                    java.util.ArrayDeque<java.util.List<T>> r2 = r0.e
                    rx.l<? super java.util.List<T>> r3 = r0.a
                    boolean r1 = rx.internal.operators.a.g(r1, r6, r2, r3)
                    if (r1 == 0) goto L41
                    r1 = 0
                    int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                    if (r3 == 0) goto L41
                    boolean r1 = r5.get()
                    if (r1 != 0) goto L37
                    r1 = 0
                    r2 = 1
                    boolean r1 = r5.compareAndSet(r1, r2)
                    if (r1 == 0) goto L37
                    int r1 = r0.c
                    long r1 = (long) r1
                    r3 = 1
                    long r6 = r6 - r3
                    long r6 = rx.internal.operators.a.c(r1, r6)
                    int r1 = r0.b
                    long r1 = (long) r1
                    long r6 = rx.internal.operators.a.a(r6, r1)
                    rx.internal.operators.r1.b.g(r0, r6)
                    return
                L37:
                    int r1 = r0.c
                    long r1 = (long) r1
                    long r6 = rx.internal.operators.a.c(r1, r6)
                    rx.internal.operators.r1.b.j(r0, r6)
                L41:
                    return
            }
        }

        public b(rx.l<? super java.util.List<T>> r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                java.util.ArrayDeque r1 = new java.util.ArrayDeque
                r1.<init>()
                r0.e = r1
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.f = r1
                r1 = 0
                r0.request(r1)
                return
        }

        static /* synthetic */ void g(rx.internal.operators.r1.b r0, long r1) {
                r0.request(r1)
                return
        }

        static /* synthetic */ void j(rx.internal.operators.r1.b r0, long r1) {
                r0.request(r1)
                return
        }

        public void onCompleted() {
                r6 = this;
                long r0 = r6.g
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L34
                java.util.concurrent.atomic.AtomicLong r2 = r6.f
                long r2 = r2.get()
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L2e
                rx.l<? super java.util.List<T>> r2 = r6.a
                rx.exceptions.MissingBackpressureException r3 = new rx.exceptions.MissingBackpressureException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "More produced than requested? "
                r4.append(r5)
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r3.<init>(r0)
                r2.onError(r3)
                return
            L2e:
                java.util.concurrent.atomic.AtomicLong r2 = r6.f
                long r0 = -r0
                r2.addAndGet(r0)
            L34:
                java.util.concurrent.atomic.AtomicLong r0 = r6.f
                java.util.ArrayDeque<java.util.List<T>> r1 = r6.e
                rx.l<? super java.util.List<T>> r2 = r6.a
                rx.internal.operators.a.d(r0, r1, r2)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.ArrayDeque<java.util.List<T>> r0 = r1.e
                r0.clear()
                rx.l<? super java.util.List<T>> r0 = r1.a
                r0.onError(r2)
                return
        }

        public void onNext(T r10) {
                r9 = this;
                long r0 = r9.d
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L14
                java.util.ArrayList r4 = new java.util.ArrayList
                int r5 = r9.b
                r4.<init>(r5)
                java.util.ArrayDeque<java.util.List<T>> r5 = r9.e
                r5.offer(r4)
            L14:
                r4 = 1
                long r0 = r0 + r4
                int r6 = r9.c
                long r6 = (long) r6
                int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r8 != 0) goto L21
                r9.d = r2
                goto L23
            L21:
                r9.d = r0
            L23:
                java.util.ArrayDeque<java.util.List<T>> r0 = r9.e
                java.util.Iterator r0 = r0.iterator()
            L29:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L39
                java.lang.Object r1 = r0.next()
                java.util.List r1 = (java.util.List) r1
                r1.add(r10)
                goto L29
            L39:
                java.util.ArrayDeque<java.util.List<T>> r10 = r9.e
                java.lang.Object r10 = r10.peek()
                java.util.List r10 = (java.util.List) r10
                if (r10 == 0) goto L5a
                int r0 = r10.size()
                int r1 = r9.b
                if (r0 != r1) goto L5a
                java.util.ArrayDeque<java.util.List<T>> r0 = r9.e
                r0.poll()
                long r0 = r9.g
                long r0 = r0 + r4
                r9.g = r0
                rx.l<? super java.util.List<T>> r0 = r9.a
                r0.onNext(r10)
            L5a:
                return
        }

        rx.g s() {
                r1 = this;
                rx.internal.operators.r1$b$a r0 = new rx.internal.operators.r1$b$a
                r0.<init>(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c<T> extends rx.l<T> {
        final rx.l<? super java.util.List<T>> a;
        final int b;
        final int c;
        long d;
        java.util.List<T> e;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        final class a extends java.util.concurrent.atomic.AtomicBoolean implements rx.g {
            private static final long serialVersionUID = 3428177408082367154L;
            final /* synthetic */ rx.internal.operators.r1.c a;

            a(rx.internal.operators.r1.c r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void request(long r8) {
                    r7 = this;
                    r0 = 0
                    int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                    if (r2 < 0) goto L3f
                    if (r2 == 0) goto L3e
                    rx.internal.operators.r1$c r0 = r7.a
                    boolean r1 = r7.get()
                    if (r1 != 0) goto L34
                    r1 = 0
                    r2 = 1
                    boolean r1 = r7.compareAndSet(r1, r2)
                    if (r1 == 0) goto L34
                    int r1 = r0.b
                    long r1 = (long) r1
                    long r1 = rx.internal.operators.a.c(r8, r1)
                    int r3 = r0.c
                    int r4 = r0.b
                    int r3 = r3 - r4
                    long r3 = (long) r3
                    r5 = 1
                    long r8 = r8 - r5
                    long r8 = rx.internal.operators.a.c(r3, r8)
                    long r8 = rx.internal.operators.a.a(r1, r8)
                    rx.internal.operators.r1.c.g(r0, r8)
                    return
                L34:
                    int r1 = r0.c
                    long r1 = (long) r1
                    long r8 = rx.internal.operators.a.c(r8, r1)
                    rx.internal.operators.r1.c.j(r0, r8)
                L3e:
                    return
                L3f:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "n >= 0 required but it was "
                    r1.append(r2)
                    r1.append(r8)
                    java.lang.String r8 = r1.toString()
                    r0.<init>(r8)
                    throw r0
            }
        }

        public c(rx.l<? super java.util.List<T>> r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r1 = 0
                r0.request(r1)
                return
        }

        static /* synthetic */ void g(rx.internal.operators.r1.c r0, long r1) {
                r0.request(r1)
                return
        }

        static /* synthetic */ void j(rx.internal.operators.r1.c r0, long r1) {
                r0.request(r1)
                return
        }

        public void onCompleted() {
                r2 = this;
                java.util.List<T> r0 = r2.e
                if (r0 == 0) goto Lc
                r1 = 0
                r2.e = r1
                rx.l<? super java.util.List<T>> r1 = r2.a
                r1.onNext(r0)
            Lc:
                rx.l<? super java.util.List<T>> r0 = r2.a
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r0 = 0
                r1.e = r0
                rx.l<? super java.util.List<T>> r0 = r1.a
                r0.onError(r2)
                return
        }

        public void onNext(T r9) {
                r8 = this;
                long r0 = r8.d
                java.util.List<T> r2 = r8.e
                r3 = 0
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 != 0) goto L13
                java.util.ArrayList r2 = new java.util.ArrayList
                int r5 = r8.b
                r2.<init>(r5)
                r8.e = r2
            L13:
                r5 = 1
                long r0 = r0 + r5
                int r5 = r8.c
                long r5 = (long) r5
                int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r7 != 0) goto L20
                r8.d = r3
                goto L22
            L20:
                r8.d = r0
            L22:
                if (r2 == 0) goto L37
                r2.add(r9)
                int r9 = r2.size()
                int r0 = r8.b
                if (r9 != r0) goto L37
                r9 = 0
                r8.e = r9
                rx.l<? super java.util.List<T>> r9 = r8.a
                r9.onNext(r2)
            L37:
                return
        }

        rx.g s() {
                r1 = this;
                rx.internal.operators.r1$c$a r0 = new rx.internal.operators.r1$c$a
                r0.<init>(r1)
                return r0
        }
    }

    public r1(int r1, int r2) {
            r0 = this;
            r0.<init>()
            if (r1 <= 0) goto L14
            if (r2 <= 0) goto Lc
            r0.a = r1
            r0.b = r2
            return
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "skip must be greater than 0"
            r1.<init>(r2)
            throw r1
        L14:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "count must be greater than 0"
            r1.<init>(r2)
            throw r1
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super java.util.List<T>> r4) {
            r3 = this;
            int r0 = r3.b
            int r1 = r3.a
            if (r0 != r1) goto L16
            rx.internal.operators.r1$a r0 = new rx.internal.operators.r1$a
            r0.<init>(r4, r1)
            r4.add(r0)
            rx.g r1 = r0.j()
            r4.setProducer(r1)
            return r0
        L16:
            if (r0 <= r1) goto L28
            rx.internal.operators.r1$c r2 = new rx.internal.operators.r1$c
            r2.<init>(r4, r1, r0)
            r4.add(r2)
            rx.g r0 = r2.s()
            r4.setProducer(r0)
            return r2
        L28:
            rx.internal.operators.r1$b r2 = new rx.internal.operators.r1$b
            r2.<init>(r4, r1, r0)
            r4.add(r2)
            rx.g r0 = r2.s()
            r4.setProducer(r0)
            return r2
    }
}
