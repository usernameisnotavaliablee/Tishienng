package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class i2<T, K, V> implements rx.e.b<rx.observables.d<K, V>, T> {
    final rx.functions.p<? super T, ? extends K> a;
    final rx.functions.p<? super T, ? extends V> b;
    final int c;
    final boolean d;
    final rx.functions.p<rx.functions.b<K>, java.util.Map<K, java.lang.Object>> e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.functions.a {
        final /* synthetic */ rx.internal.operators.i2.c a;
        final /* synthetic */ rx.internal.operators.i2 b;

        a(rx.internal.operators.i2 r1, rx.internal.operators.i2.c r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void call() {
                r1 = this;
                rx.internal.operators.i2$c r0 = r1.a
                r0.g()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b implements rx.g {
        final rx.internal.operators.i2.c<?, ?, ?> a;

        public b(rx.internal.operators.i2.c<?, ?, ?> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public void request(long r2) {
                r1 = this;
                rx.internal.operators.i2$c<?, ?, ?> r0 = r1.a
                r0.H(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c<T, K, V> extends rx.l<T> {
        static final java.lang.Object r = null;
        final rx.l<? super rx.observables.d<K, V>> a;
        final rx.functions.p<? super T, ? extends K> b;
        final rx.functions.p<? super T, ? extends V> c;
        final int d;
        final boolean e;
        final java.util.Map<java.lang.Object, rx.internal.operators.i2.d<K, V>> f;
        final java.util.Map<java.lang.Object, rx.internal.operators.i2.d<K, V>> g;
        final java.util.Queue<rx.observables.d<K, V>> h;
        final rx.internal.operators.i2.b i;
        final java.util.Queue<K> j;
        final rx.internal.producers.a k;
        final java.util.concurrent.atomic.AtomicBoolean l;
        final java.util.concurrent.atomic.AtomicLong m;
        final java.util.concurrent.atomic.AtomicInteger n;
        java.lang.Throwable o;
        volatile boolean p;
        final java.util.concurrent.atomic.AtomicInteger q;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        static class a<K> implements rx.functions.b<K> {
            final java.util.Queue<K> a;

            a(java.util.Queue<K> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.a = r1
                    return
            }

            public void call(K r2) {
                    r1 = this;
                    java.util.Queue<K> r0 = r1.a
                    r0.offer(r2)
                    return
            }
        }

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                rx.internal.operators.i2.c.r = r0
                return
        }

        public c(rx.l<? super rx.observables.d<K, V>> r1, rx.functions.p<? super T, ? extends K> r2, rx.functions.p<? super T, ? extends V> r3, int r4, boolean r5, rx.functions.p<rx.functions.b<K>, java.util.Map<K, java.lang.Object>> r6) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.e = r5
                java.util.concurrent.ConcurrentLinkedQueue r1 = new java.util.concurrent.ConcurrentLinkedQueue
                r1.<init>()
                r0.h = r1
                rx.internal.producers.a r1 = new rx.internal.producers.a
                r1.<init>()
                r0.k = r1
                long r2 = (long) r4
                r1.request(r2)
                rx.internal.operators.i2$b r1 = new rx.internal.operators.i2$b
                r1.<init>(r0)
                r0.i = r1
                java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
                r1.<init>()
                r0.l = r1
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.m = r1
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r2 = 1
                r1.<init>(r2)
                r0.n = r1
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r1.<init>()
                r0.q = r1
                if (r6 != 0) goto L50
                java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
                r1.<init>()
                r0.f = r1
                r1 = 0
                r0.j = r1
                goto L62
            L50:
                java.util.concurrent.ConcurrentLinkedQueue r1 = new java.util.concurrent.ConcurrentLinkedQueue
                r1.<init>()
                r0.j = r1
                rx.internal.operators.i2$c$a r2 = new rx.internal.operators.i2$c$a
                r2.<init>(r1)
                java.util.Map r1 = r0.A(r6, r2)
                r0.f = r1
            L62:
                java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
                r1.<init>()
                r0.g = r1
                return
        }

        private java.util.Map<java.lang.Object, rx.internal.operators.i2.d<K, V>> A(rx.functions.p<rx.functions.b<K>, java.util.Map<K, java.lang.Object>> r1, rx.functions.b<K> r2) {
                r0 = this;
                java.lang.Object r1 = r1.call(r2)
                java.util.Map r1 = (java.util.Map) r1
                return r1
        }

        void B() {
                r13 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r13.q
                int r0 = r0.getAndIncrement()
                if (r0 == 0) goto L9
                goto L67
            L9:
                java.util.Queue<rx.observables.d<K, V>> r0 = r13.h
                rx.l<? super rx.observables.d<K, V>> r1 = r13.a
                r2 = 1
                r3 = 1
            Lf:
                boolean r4 = r13.p
                boolean r5 = r0.isEmpty()
                boolean r4 = r13.s(r4, r5, r1, r0)
                if (r4 == 0) goto L1c
                goto L67
            L1c:
                java.util.concurrent.atomic.AtomicLong r4 = r13.m
                long r4 = r4.get()
                r6 = 0
                r8 = r6
            L25:
                int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r10 == 0) goto L47
                boolean r10 = r13.p
                java.lang.Object r11 = r0.poll()
                rx.observables.d r11 = (rx.observables.d) r11
                if (r11 != 0) goto L35
                r12 = 1
                goto L36
            L35:
                r12 = 0
            L36:
                boolean r10 = r13.s(r10, r12, r1, r0)
                if (r10 == 0) goto L3d
                goto L67
            L3d:
                if (r12 == 0) goto L40
                goto L47
            L40:
                r1.onNext(r11)
                r10 = 1
                long r8 = r8 + r10
                goto L25
            L47:
                int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r10 == 0) goto L5e
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r10 == 0) goto L59
                java.util.concurrent.atomic.AtomicLong r4 = r13.m
                rx.internal.operators.a.i(r4, r8)
            L59:
                rx.internal.producers.a r4 = r13.k
                r4.request(r8)
            L5e:
                java.util.concurrent.atomic.AtomicInteger r4 = r13.q
                int r3 = -r3
                int r3 = r4.addAndGet(r3)
                if (r3 != 0) goto Lf
            L67:
                return
        }

        void G(rx.l<? super rx.observables.d<K, V>> r2, java.util.Queue<?> r3, java.lang.Throwable r4) {
                r1 = this;
                r3.clear()
                java.util.ArrayList r3 = new java.util.ArrayList
                java.util.Map<java.lang.Object, rx.internal.operators.i2$d<K, V>> r0 = r1.f
                java.util.Collection r0 = r0.values()
                r3.<init>(r0)
                java.util.Map<java.lang.Object, rx.internal.operators.i2$d<K, V>> r0 = r1.f
                r0.clear()
                java.util.Queue<K> r0 = r1.j
                if (r0 == 0) goto L21
                java.util.Map<java.lang.Object, rx.internal.operators.i2$d<K, V>> r0 = r1.g
                r0.clear()
                java.util.Queue<K> r0 = r1.j
                r0.clear()
            L21:
                java.util.Iterator r3 = r3.iterator()
            L25:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L35
                java.lang.Object r0 = r3.next()
                rx.internal.operators.i2$d r0 = (rx.internal.operators.i2.d) r0
                r0.onError(r4)
                goto L25
            L35:
                r2.onError(r4)
                return
        }

        public void H(long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto Lf
                java.util.concurrent.atomic.AtomicLong r0 = r3.m
                rx.internal.operators.a.b(r0, r4)
                r3.B()
                return
            Lf:
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

        public void g() {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.l
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L15
                java.util.concurrent.atomic.AtomicInteger r0 = r3.n
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto L15
                r3.unsubscribe()
            L15:
                return
        }

        public void j(K r2) {
                r1 = this;
                if (r2 == 0) goto L3
                goto L5
            L3:
                java.lang.Object r2 = rx.internal.operators.i2.c.r
            L5:
                java.util.Map<java.lang.Object, rx.internal.operators.i2$d<K, V>> r0 = r1.f
                java.lang.Object r0 = r0.remove(r2)
                if (r0 == 0) goto L18
                java.util.concurrent.atomic.AtomicInteger r0 = r1.n
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto L18
                r1.unsubscribe()
            L18:
                java.util.Queue<K> r0 = r1.j
                if (r0 == 0) goto L21
                java.util.Map<java.lang.Object, rx.internal.operators.i2$d<K, V>> r0 = r1.g
                r0.remove(r2)
            L21:
                return
        }

        public void onCompleted() {
                r2 = this;
                boolean r0 = r2.p
                if (r0 == 0) goto L5
                return
            L5:
                java.util.Map<java.lang.Object, rx.internal.operators.i2$d<K, V>> r0 = r2.f
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
            Lf:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1f
                java.lang.Object r1 = r0.next()
                rx.internal.operators.i2$d r1 = (rx.internal.operators.i2.d) r1
                r1.A7()
                goto Lf
            L1f:
                java.util.Map<java.lang.Object, rx.internal.operators.i2$d<K, V>> r0 = r2.f
                r0.clear()
                java.util.Queue<K> r0 = r2.j
                if (r0 == 0) goto L32
                java.util.Map<java.lang.Object, rx.internal.operators.i2$d<K, V>> r0 = r2.g
                r0.clear()
                java.util.Queue<K> r0 = r2.j
                r0.clear()
            L32:
                r0 = 1
                r2.p = r0
                java.util.concurrent.atomic.AtomicInteger r0 = r2.n
                r0.decrementAndGet()
                r2.B()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.p
                if (r0 == 0) goto L8
                rx.plugins.c.I(r2)
                return
            L8:
                r1.o = r2
                r2 = 1
                r1.p = r2
                java.util.concurrent.atomic.AtomicInteger r2 = r1.n
                r2.decrementAndGet()
                r1.B()
                return
        }

        public void onNext(T r7) {
                r6 = this;
                boolean r0 = r6.p
                if (r0 == 0) goto L5
                goto L70
            L5:
                java.util.Queue<rx.observables.d<K, V>> r0 = r6.h
                rx.l<? super rx.observables.d<K, V>> r1 = r6.a
                rx.functions.p<? super T, ? extends K> r2 = r6.b     // Catch: java.lang.Throwable -> L79
                java.lang.Object r2 = r2.call(r7)     // Catch: java.lang.Throwable -> L79
                if (r2 == 0) goto L13
                r3 = r2
                goto L15
            L13:
                java.lang.Object r3 = rx.internal.operators.i2.c.r
            L15:
                java.util.Map<java.lang.Object, rx.internal.operators.i2$d<K, V>> r4 = r6.f
                java.lang.Object r4 = r4.get(r3)
                rx.internal.operators.i2$d r4 = (rx.internal.operators.i2.d) r4
                if (r4 != 0) goto L44
                java.util.concurrent.atomic.AtomicBoolean r4 = r6.l
                boolean r4 = r4.get()
                if (r4 != 0) goto L70
                int r4 = r6.d
                boolean r5 = r6.e
                rx.internal.operators.i2$d r4 = rx.internal.operators.i2.d.z7(r2, r4, r6, r5)
                java.util.Map<java.lang.Object, rx.internal.operators.i2$d<K, V>> r2 = r6.f
                r2.put(r3, r4)
                java.util.Queue<K> r2 = r6.j
                if (r2 == 0) goto L3d
                java.util.Map<java.lang.Object, rx.internal.operators.i2$d<K, V>> r2 = r6.g
                r2.put(r3, r4)
            L3d:
                java.util.concurrent.atomic.AtomicInteger r2 = r6.n
                r2.getAndIncrement()
                r2 = 1
                goto L45
            L44:
                r2 = 0
            L45:
                rx.functions.p<? super T, ? extends V> r3 = r6.c     // Catch: java.lang.Throwable -> L71
                java.lang.Object r7 = r3.call(r7)     // Catch: java.lang.Throwable -> L71
                r4.onNext(r7)
                java.util.Queue<K> r7 = r6.j
                if (r7 == 0) goto L68
            L52:
                java.util.Queue<K> r7 = r6.j
                java.lang.Object r7 = r7.poll()
                if (r7 == 0) goto L68
                java.util.Map<java.lang.Object, rx.internal.operators.i2$d<K, V>> r1 = r6.g
                java.lang.Object r7 = r1.remove(r7)
                rx.internal.operators.i2$d r7 = (rx.internal.operators.i2.d) r7
                if (r7 == 0) goto L52
                r7.A7()
                goto L52
            L68:
                if (r2 == 0) goto L70
                r0.offer(r4)
                r6.B()
            L70:
                return
            L71:
                r7 = move-exception
                r6.unsubscribe()
                r6.G(r1, r0, r7)
                return
            L79:
                r7 = move-exception
                r6.unsubscribe()
                r6.G(r1, r0, r7)
                return
        }

        boolean s(boolean r2, boolean r3, rx.l<? super rx.observables.d<K, V>> r4, java.util.Queue<?> r5) {
                r1 = this;
                if (r2 == 0) goto L13
                java.lang.Throwable r2 = r1.o
                r0 = 1
                if (r2 == 0) goto Lb
                r1.G(r4, r5, r2)
                return r0
            Lb:
                if (r3 == 0) goto L13
                rx.l<? super rx.observables.d<K, V>> r2 = r1.a
                r2.onCompleted()
                return r0
            L13:
                r2 = 0
                return r2
        }

        public void setProducer(rx.g r2) {
                r1 = this;
                rx.internal.producers.a r0 = r1.k
                r0.c(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class d<K, T> extends rx.observables.d<K, T> {
        final rx.internal.operators.i2.e<T, K> c;

        protected d(K r1, rx.internal.operators.i2.e<T, K> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.c = r2
                return
        }

        public static <T, K> rx.internal.operators.i2.d<K, T> z7(K r1, int r2, rx.internal.operators.i2.c<?, K, T> r3, boolean r4) {
                rx.internal.operators.i2$e r0 = new rx.internal.operators.i2$e
                r0.<init>(r2, r3, r1, r4)
                rx.internal.operators.i2$d r2 = new rx.internal.operators.i2$d
                r2.<init>(r1, r0)
                return r2
        }

        public void A7() {
                r1 = this;
                rx.internal.operators.i2$e<T, K> r0 = r1.c
                r0.d()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.internal.operators.i2$e<T, K> r0 = r1.c
                r0.e(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                rx.internal.operators.i2$e<T, K> r0 = r1.c
                r0.f(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class e<T, K> extends java.util.concurrent.atomic.AtomicInteger implements rx.g, rx.m, rx.e.a<T> {
        private static final long serialVersionUID = -3852313036005250360L;
        final K a;
        final java.util.Queue<java.lang.Object> b;
        final rx.internal.operators.i2.c<?, K, T> c;
        final boolean d;
        final java.util.concurrent.atomic.AtomicLong e;
        volatile boolean f;
        java.lang.Throwable g;
        final java.util.concurrent.atomic.AtomicBoolean h;
        final java.util.concurrent.atomic.AtomicReference<rx.l<? super T>> i;
        final java.util.concurrent.atomic.AtomicBoolean j;

        public e(int r1, rx.internal.operators.i2.c<?, K, T> r2, K r3, boolean r4) {
                r0 = this;
                r0.<init>()
                java.util.concurrent.ConcurrentLinkedQueue r1 = new java.util.concurrent.ConcurrentLinkedQueue
                r1.<init>()
                r0.b = r1
                r0.c = r2
                r0.a = r3
                r0.d = r4
                java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
                r1.<init>()
                r0.h = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.i = r1
                java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
                r1.<init>()
                r0.j = r1
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.e = r1
                return
        }

        boolean a(boolean r3, boolean r4, rx.l<? super T> r5, boolean r6) {
                r2 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r2.h
                boolean r0 = r0.get()
                r1 = 1
                if (r0 == 0) goto L16
                java.util.Queue<java.lang.Object> r3 = r2.b
                r3.clear()
                rx.internal.operators.i2$c<?, K, T> r3 = r2.c
                K r4 = r2.a
                r3.j(r4)
                return r1
            L16:
                if (r3 == 0) goto L3b
                if (r6 == 0) goto L28
                if (r4 == 0) goto L3b
                java.lang.Throwable r3 = r2.g
                if (r3 == 0) goto L24
                r5.onError(r3)
                goto L27
            L24:
                r5.onCompleted()
            L27:
                return r1
            L28:
                java.lang.Throwable r3 = r2.g
                if (r3 == 0) goto L35
                java.util.Queue<java.lang.Object> r4 = r2.b
                r4.clear()
                r5.onError(r3)
                return r1
            L35:
                if (r4 == 0) goto L3b
                r5.onCompleted()
                return r1
            L3b:
                r3 = 0
                return r3
        }

        void b() {
                r14 = this;
                int r0 = r14.getAndIncrement()
                if (r0 == 0) goto L8
                goto L72
            L8:
                java.util.Queue<java.lang.Object> r0 = r14.b
                boolean r1 = r14.d
                java.util.concurrent.atomic.AtomicReference<rx.l<? super T>> r2 = r14.i
                java.lang.Object r2 = r2.get()
                rx.l r2 = (rx.l) r2
                r3 = 1
                r4 = 1
            L16:
                if (r2 == 0) goto L6b
                boolean r5 = r14.f
                boolean r6 = r0.isEmpty()
                boolean r5 = r14.a(r5, r6, r2, r1)
                if (r5 == 0) goto L25
                goto L72
            L25:
                java.util.concurrent.atomic.AtomicLong r5 = r14.e
                long r5 = r5.get()
                r7 = 0
                r9 = r7
            L2e:
                int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r11 == 0) goto L52
                boolean r11 = r14.f
                java.lang.Object r12 = r0.poll()
                if (r12 != 0) goto L3c
                r13 = 1
                goto L3d
            L3c:
                r13 = 0
            L3d:
                boolean r11 = r14.a(r11, r13, r2, r1)
                if (r11 == 0) goto L44
                goto L72
            L44:
                if (r13 == 0) goto L47
                goto L52
            L47:
                java.lang.Object r11 = rx.internal.operators.v.e(r12)
                r2.onNext(r11)
                r11 = 1
                long r9 = r9 + r11
                goto L2e
            L52:
                int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r11 == 0) goto L6b
                r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r11 == 0) goto L64
                java.util.concurrent.atomic.AtomicLong r5 = r14.e
                rx.internal.operators.a.i(r5, r9)
            L64:
                rx.internal.operators.i2$c<?, K, T> r5 = r14.c
                rx.internal.producers.a r5 = r5.k
                r5.request(r9)
            L6b:
                int r4 = -r4
                int r4 = r14.addAndGet(r4)
                if (r4 != 0) goto L73
            L72:
                return
            L73:
                if (r2 != 0) goto L16
                java.util.concurrent.atomic.AtomicReference<rx.l<? super T>> r2 = r14.i
                java.lang.Object r2 = r2.get()
                rx.l r2 = (rx.l) r2
                goto L16
        }

        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                rx.l r1 = (rx.l) r1
                r0.call(r1)
                return
        }

        public void call(rx.l<? super T> r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.j
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L19
                r4.add(r3)
                r4.setProducer(r3)
                java.util.concurrent.atomic.AtomicReference<rx.l<? super T>> r0 = r3.i
                r0.lazySet(r4)
                r3.b()
                return
            L19:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Only one Subscriber allowed!"
                r0.<init>(r1)
                r4.onError(r0)
                return
        }

        public void d() {
                r1 = this;
                r0 = 1
                r1.f = r0
                r1.b()
                return
        }

        public void e(java.lang.Throwable r1) {
                r0 = this;
                r0.g = r1
                r1 = 1
                r0.f = r1
                r0.b()
                return
        }

        public void f(T r2) {
                r1 = this;
                if (r2 != 0) goto Ld
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                r2.<init>()
                r1.g = r2
                r2 = 1
                r1.f = r2
                goto L16
            Ld:
                java.util.Queue<java.lang.Object> r0 = r1.b
                java.lang.Object r2 = rx.internal.operators.v.j(r2)
                r0.offer(r2)
            L16:
                r1.b()
                return
        }

        public boolean isUnsubscribed() {
                r1 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.h
                boolean r0 = r0.get()
                return r0
        }

        public void request(long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto L11
                if (r2 == 0) goto L10
                java.util.concurrent.atomic.AtomicLong r0 = r3.e
                rx.internal.operators.a.b(r0, r4)
                r3.b()
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
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.h
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L17
                int r0 = r3.getAndIncrement()
                if (r0 != 0) goto L17
                rx.internal.operators.i2$c<?, K, T> r0 = r3.c
                K r1 = r3.a
                r0.j(r1)
            L17:
                return
        }
    }

    public i2(rx.functions.p<? super T, ? extends K> r7) {
            r6 = this;
            rx.functions.p r2 = rx.internal.util.n.c()
            int r3 = rx.internal.util.j.d
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public i2(rx.functions.p<? super T, ? extends K> r7, rx.functions.p<? super T, ? extends V> r8) {
            r6 = this;
            int r3 = rx.internal.util.j.d
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public i2(rx.functions.p<? super T, ? extends K> r1, rx.functions.p<? super T, ? extends V> r2, int r3, boolean r4, rx.functions.p<rx.functions.b<K>, java.util.Map<K, java.lang.Object>> r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public i2(rx.functions.p<? super T, ? extends K> r7, rx.functions.p<? super T, ? extends V> r8, rx.functions.p<rx.functions.b<K>, java.util.Map<K, java.lang.Object>> r9) {
            r6 = this;
            int r3 = rx.internal.util.j.d
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super rx.observables.d<K, V>> r8) {
            r7 = this;
            rx.internal.operators.i2$c r0 = new rx.internal.operators.i2$c     // Catch: java.lang.Throwable -> L25
            rx.functions.p<? super T, ? extends K> r2 = r7.a     // Catch: java.lang.Throwable -> L25
            rx.functions.p<? super T, ? extends V> r3 = r7.b     // Catch: java.lang.Throwable -> L25
            int r4 = r7.c     // Catch: java.lang.Throwable -> L25
            boolean r5 = r7.d     // Catch: java.lang.Throwable -> L25
            rx.functions.p<rx.functions.b<K>, java.util.Map<K, java.lang.Object>> r6 = r7.e     // Catch: java.lang.Throwable -> L25
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L22
            rx.internal.operators.i2$a r8 = new rx.internal.operators.i2$a
            r8.<init>(r7, r0)
            rx.m r8 = rx.subscriptions.f.a(r8)
            r1.add(r8)
            rx.internal.operators.i2$b r8 = r0.i
            r1.setProducer(r8)
            return r0
        L22:
            r0 = move-exception
        L23:
            r8 = r0
            goto L28
        L25:
            r0 = move-exception
            r1 = r8
            goto L23
        L28:
            rx.exceptions.a.f(r8, r1)
            rx.l r8 = rx.observers.h.d()
            r8.unsubscribe()
            return r8
    }
}
