package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class a4<T> implements rx.e.b<rx.e<T>, T> {
    final int a;
    final int b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends rx.l<T> implements rx.functions.a {
        final rx.l<? super rx.e<T>> a;
        final int b;
        final java.util.concurrent.atomic.AtomicInteger c;
        final rx.m d;
        int e;
        rx.subjects.f<T, T> f;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.operators.a4$a$a, reason: collision with other inner class name */
        class C0002a implements rx.g {
            final /* synthetic */ rx.internal.operators.a4.a a;

            C0002a(rx.internal.operators.a4.a r1) {
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
                    rx.internal.operators.a4$a r0 = r3.a
                    int r0 = r0.b
                    long r0 = (long) r0
                    long r4 = rx.internal.operators.a.c(r0, r4)
                    rx.internal.operators.a4$a r0 = r3.a
                    rx.internal.operators.a4.a.g(r0, r4)
                L16:
                    return
                L17:
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
        }

        public a(rx.l<? super rx.e<T>> r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r2 = 1
                r1.<init>(r2)
                r0.c = r1
                rx.m r1 = rx.subscriptions.f.a(r0)
                r0.d = r1
                r0.add(r1)
                r1 = 0
                r0.request(r1)
                return
        }

        static /* synthetic */ void g(rx.internal.operators.a4.a r0, long r1) {
                r0.request(r1)
                return
        }

        public void call() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.c
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto Lb
                r1.unsubscribe()
            Lb:
                return
        }

        rx.g j() {
                r1 = this;
                rx.internal.operators.a4$a$a r0 = new rx.internal.operators.a4$a$a
                r0.<init>(r1)
                return r0
        }

        public void onCompleted() {
                r2 = this;
                rx.subjects.f<T, T> r0 = r2.f
                if (r0 == 0) goto La
                r1 = 0
                r2.f = r1
                r0.onCompleted()
            La:
                rx.l<? super rx.e<T>> r0 = r2.a
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r3) {
                r2 = this;
                rx.subjects.f<T, T> r0 = r2.f
                if (r0 == 0) goto La
                r1 = 0
                r2.f = r1
                r0.onError(r3)
            La:
                rx.l<? super rx.e<T>> r0 = r2.a
                r0.onError(r3)
                return
        }

        public void onNext(T r4) {
                r3 = this;
                int r0 = r3.e
                rx.subjects.f<T, T> r1 = r3.f
                if (r0 != 0) goto L18
                java.util.concurrent.atomic.AtomicInteger r1 = r3.c
                r1.getAndIncrement()
                int r1 = r3.b
                rx.subjects.i r1 = rx.subjects.i.A7(r1, r3)
                r3.f = r1
                rx.l<? super rx.e<T>> r2 = r3.a
                r2.onNext(r1)
            L18:
                int r0 = r0 + 1
                r1.onNext(r4)
                int r4 = r3.b
                if (r0 != r4) goto L2b
                r4 = 0
                r3.e = r4
                r4 = 0
                r3.f = r4
                r1.onCompleted()
                return
            L2b:
                r3.e = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T> extends rx.l<T> implements rx.functions.a {
        final rx.l<? super rx.e<T>> a;
        final int b;
        final int c;
        final java.util.concurrent.atomic.AtomicInteger d;
        final rx.m e;
        final java.util.ArrayDeque<rx.subjects.f<T, T>> f;
        final java.util.concurrent.atomic.AtomicLong g;
        final java.util.concurrent.atomic.AtomicInteger h;
        final java.util.Queue<rx.subjects.f<T, T>> i;
        java.lang.Throwable j;
        volatile boolean k;
        int l;
        int m;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        final class a extends java.util.concurrent.atomic.AtomicBoolean implements rx.g {
            private static final long serialVersionUID = 4625807964358024108L;
            final /* synthetic */ rx.internal.operators.a4.b a;

            a(rx.internal.operators.a4.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void request(long r6) {
                    r5 = this;
                    r0 = 0
                    int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                    if (r2 < 0) goto L43
                    if (r2 == 0) goto L42
                    rx.internal.operators.a4$b r0 = r5.a
                    boolean r1 = r5.get()
                    if (r1 != 0) goto L2e
                    r1 = 0
                    r2 = 1
                    boolean r1 = r5.compareAndSet(r1, r2)
                    if (r1 == 0) goto L2e
                    int r1 = r0.c
                    long r1 = (long) r1
                    r3 = 1
                    long r3 = r6 - r3
                    long r1 = rx.internal.operators.a.c(r1, r3)
                    int r3 = r0.b
                    long r3 = (long) r3
                    long r1 = rx.internal.operators.a.a(r1, r3)
                    rx.internal.operators.a4.b.g(r0, r1)
                    goto L3a
                L2e:
                    int r1 = r0.c
                    long r1 = (long) r1
                    long r1 = rx.internal.operators.a.c(r1, r6)
                    rx.internal.operators.a4$b r3 = r5.a
                    rx.internal.operators.a4.b.j(r3, r1)
                L3a:
                    java.util.concurrent.atomic.AtomicLong r1 = r0.g
                    rx.internal.operators.a.b(r1, r6)
                    r0.B()
                L42:
                    return
                L43:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "n >= 0 required but it was "
                    r1.append(r2)
                    r1.append(r6)
                    java.lang.String r6 = r1.toString()
                    r0.<init>(r6)
                    throw r0
            }
        }

        public b(rx.l<? super rx.e<T>> r3, int r4, int r5) {
                r2 = this;
                r2.<init>()
                r2.a = r3
                r2.b = r4
                r2.c = r5
                java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
                r0 = 1
                r3.<init>(r0)
                r2.d = r3
                java.util.ArrayDeque r3 = new java.util.ArrayDeque
                r3.<init>()
                r2.f = r3
                java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
                r3.<init>()
                r2.h = r3
                java.util.concurrent.atomic.AtomicLong r3 = new java.util.concurrent.atomic.AtomicLong
                r3.<init>()
                r2.g = r3
                rx.m r3 = rx.subscriptions.f.a(r2)
                r2.e = r3
                r2.add(r3)
                r0 = 0
                r2.request(r0)
                int r3 = r5 + (-1)
                int r4 = r4 + r3
                int r4 = r4 / r5
                rx.internal.util.atomic.e r3 = new rx.internal.util.atomic.e
                r3.<init>(r4)
                r2.i = r3
                return
        }

        static /* synthetic */ void g(rx.internal.operators.a4.b r0, long r1) {
                r0.request(r1)
                return
        }

        static /* synthetic */ void j(rx.internal.operators.a4.b r0, long r1) {
                r0.request(r1)
                return
        }

        rx.g A() {
                r1 = this;
                rx.internal.operators.a4$b$a r0 = new rx.internal.operators.a4$b$a
                r0.<init>(r1)
                return r0
        }

        void B() {
                r15 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r15.h
                int r1 = r0.getAndIncrement()
                if (r1 == 0) goto L9
                goto L63
            L9:
                rx.l<? super rx.e<T>> r1 = r15.a
                java.util.Queue<rx.subjects.f<T, T>> r2 = r15.i
                r3 = 1
                r4 = 1
            Lf:
                java.util.concurrent.atomic.AtomicLong r5 = r15.g
                long r5 = r5.get()
                r7 = 0
                r9 = r7
            L18:
                int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r11 == 0) goto L3a
                boolean r12 = r15.k
                java.lang.Object r13 = r2.poll()
                rx.subjects.f r13 = (rx.subjects.f) r13
                if (r13 != 0) goto L28
                r14 = 1
                goto L29
            L28:
                r14 = 0
            L29:
                boolean r12 = r15.s(r12, r14, r1, r2)
                if (r12 == 0) goto L30
                goto L63
            L30:
                if (r14 == 0) goto L33
                goto L3a
            L33:
                r1.onNext(r13)
                r11 = 1
                long r9 = r9 + r11
                goto L18
            L3a:
                if (r11 != 0) goto L49
                boolean r11 = r15.k
                boolean r12 = r2.isEmpty()
                boolean r11 = r15.s(r11, r12, r1, r2)
                if (r11 == 0) goto L49
                goto L63
            L49:
                int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r11 == 0) goto L5c
                r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r11 == 0) goto L5c
                java.util.concurrent.atomic.AtomicLong r5 = r15.g
                long r6 = -r9
                r5.addAndGet(r6)
            L5c:
                int r4 = -r4
                int r4 = r0.addAndGet(r4)
                if (r4 != 0) goto Lf
            L63:
                return
        }

        public void call() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.d
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto Lb
                r1.unsubscribe()
            Lb:
                return
        }

        public void onCompleted() {
                r2 = this;
                java.util.ArrayDeque<rx.subjects.f<T, T>> r0 = r2.f
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                rx.subjects.f r1 = (rx.subjects.f) r1
                r1.onCompleted()
                goto L6
            L16:
                java.util.ArrayDeque<rx.subjects.f<T, T>> r0 = r2.f
                r0.clear()
                r0 = 1
                r2.k = r0
                r2.B()
                return
        }

        public void onError(java.lang.Throwable r3) {
                r2 = this;
                java.util.ArrayDeque<rx.subjects.f<T, T>> r0 = r2.f
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                rx.subjects.f r1 = (rx.subjects.f) r1
                r1.onError(r3)
                goto L6
            L16:
                java.util.ArrayDeque<rx.subjects.f<T, T>> r0 = r2.f
                r0.clear()
                r2.j = r3
                r3 = 1
                r2.k = r3
                r2.B()
                return
        }

        public void onNext(T r5) {
                r4 = this;
                int r0 = r4.l
                java.util.ArrayDeque<rx.subjects.f<T, T>> r1 = r4.f
                if (r0 != 0) goto L24
                rx.l<? super rx.e<T>> r2 = r4.a
                boolean r2 = r2.isUnsubscribed()
                if (r2 != 0) goto L24
                java.util.concurrent.atomic.AtomicInteger r2 = r4.d
                r2.getAndIncrement()
                r2 = 16
                rx.subjects.i r2 = rx.subjects.i.A7(r2, r4)
                r1.offer(r2)
                java.util.Queue<rx.subjects.f<T, T>> r3 = r4.i
                r3.offer(r2)
                r4.B()
            L24:
                java.util.ArrayDeque<rx.subjects.f<T, T>> r2 = r4.f
                java.util.Iterator r2 = r2.iterator()
            L2a:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L3a
                java.lang.Object r3 = r2.next()
                rx.subjects.f r3 = (rx.subjects.f) r3
                r3.onNext(r5)
                goto L2a
            L3a:
                int r5 = r4.m
                int r5 = r5 + 1
                int r2 = r4.b
                if (r5 != r2) goto L53
                int r2 = r4.c
                int r5 = r5 - r2
                r4.m = r5
                java.lang.Object r5 = r1.poll()
                rx.subjects.f r5 = (rx.subjects.f) r5
                if (r5 == 0) goto L55
                r5.onCompleted()
                goto L55
            L53:
                r4.m = r5
            L55:
                int r0 = r0 + 1
                int r5 = r4.c
                if (r0 != r5) goto L5f
                r5 = 0
                r4.l = r5
                return
            L5f:
                r4.l = r0
                return
        }

        boolean s(boolean r3, boolean r4, rx.l<? super rx.subjects.f<T, T>> r5, java.util.Queue<rx.subjects.f<T, T>> r6) {
                r2 = this;
                boolean r0 = r5.isUnsubscribed()
                r1 = 1
                if (r0 == 0) goto Lb
                r6.clear()
                return r1
            Lb:
                if (r3 == 0) goto L1e
                java.lang.Throwable r3 = r2.j
                if (r3 == 0) goto L18
                r6.clear()
                r5.onError(r3)
                return r1
            L18:
                if (r4 == 0) goto L1e
                r5.onCompleted()
                return r1
            L1e:
                r3 = 0
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c<T> extends rx.l<T> implements rx.functions.a {
        final rx.l<? super rx.e<T>> a;
        final int b;
        final int c;
        final java.util.concurrent.atomic.AtomicInteger d;
        final rx.m e;
        int f;
        rx.subjects.f<T, T> g;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        final class a extends java.util.concurrent.atomic.AtomicBoolean implements rx.g {
            private static final long serialVersionUID = 4625807964358024108L;
            final /* synthetic */ rx.internal.operators.a4.c a;

            a(rx.internal.operators.a4.c r1) {
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
                    rx.internal.operators.a4$c r0 = r7.a
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
                    rx.internal.operators.a4.c.g(r0, r8)
                    return
                L34:
                    int r1 = r0.c
                    long r1 = (long) r1
                    long r8 = rx.internal.operators.a.c(r8, r1)
                    rx.internal.operators.a4.c.j(r0, r8)
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

        public c(rx.l<? super rx.e<T>> r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r2 = 1
                r1.<init>(r2)
                r0.d = r1
                rx.m r1 = rx.subscriptions.f.a(r0)
                r0.e = r1
                r0.add(r1)
                r1 = 0
                r0.request(r1)
                return
        }

        static /* synthetic */ void g(rx.internal.operators.a4.c r0, long r1) {
                r0.request(r1)
                return
        }

        static /* synthetic */ void j(rx.internal.operators.a4.c r0, long r1) {
                r0.request(r1)
                return
        }

        public void call() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.d
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto Lb
                r1.unsubscribe()
            Lb:
                return
        }

        public void onCompleted() {
                r2 = this;
                rx.subjects.f<T, T> r0 = r2.g
                if (r0 == 0) goto La
                r1 = 0
                r2.g = r1
                r0.onCompleted()
            La:
                rx.l<? super rx.e<T>> r0 = r2.a
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r3) {
                r2 = this;
                rx.subjects.f<T, T> r0 = r2.g
                if (r0 == 0) goto La
                r1 = 0
                r2.g = r1
                r0.onError(r3)
            La:
                rx.l<? super rx.e<T>> r0 = r2.a
                r0.onError(r3)
                return
        }

        public void onNext(T r4) {
                r3 = this;
                int r0 = r3.f
                rx.subjects.f<T, T> r1 = r3.g
                if (r0 != 0) goto L18
                java.util.concurrent.atomic.AtomicInteger r1 = r3.d
                r1.getAndIncrement()
                int r1 = r3.b
                rx.subjects.i r1 = rx.subjects.i.A7(r1, r3)
                r3.g = r1
                rx.l<? super rx.e<T>> r2 = r3.a
                r2.onNext(r1)
            L18:
                int r0 = r0 + 1
                if (r1 == 0) goto L1f
                r1.onNext(r4)
            L1f:
                int r4 = r3.b
                if (r0 != r4) goto L2c
                r3.f = r0
                r4 = 0
                r3.g = r4
                r1.onCompleted()
                return
            L2c:
                int r4 = r3.c
                if (r0 != r4) goto L34
                r4 = 0
                r3.f = r4
                return
            L34:
                r3.f = r0
                return
        }

        rx.g s() {
                r1 = this;
                rx.internal.operators.a4$c$a r0 = new rx.internal.operators.a4$c$a
                r0.<init>(r1)
                return r0
        }
    }

    public a4(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super rx.e<T>> r4) {
            r3 = this;
            int r0 = r3.b
            int r1 = r3.a
            if (r0 != r1) goto L18
            rx.internal.operators.a4$a r0 = new rx.internal.operators.a4$a
            r0.<init>(r4, r1)
            rx.m r1 = r0.d
            r4.add(r1)
            rx.g r1 = r0.j()
            r4.setProducer(r1)
            return r0
        L18:
            if (r0 <= r1) goto L2c
            rx.internal.operators.a4$c r2 = new rx.internal.operators.a4$c
            r2.<init>(r4, r1, r0)
            rx.m r0 = r2.e
            r4.add(r0)
            rx.g r0 = r2.s()
            r4.setProducer(r0)
            return r2
        L2c:
            rx.internal.operators.a4$b r2 = new rx.internal.operators.a4$b
            r2.<init>(r4, r1, r0)
            rx.m r0 = r2.e
            r4.add(r0)
            rx.g r0 = r2.A()
            r4.setProducer(r0)
            return r2
    }
}
