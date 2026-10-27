package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class j2<T, K, V> implements rx.e.b<rx.observables.d<K, V>, T> {
    final rx.functions.p<? super T, ? extends K> a;
    final rx.functions.p<? super T, ? extends V> b;
    final int c;
    final boolean d;
    final rx.functions.p<rx.functions.b<java.lang.Object>, java.util.Map<K, java.lang.Object>> e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.functions.a {
        final /* synthetic */ rx.internal.operators.j2.d a;
        final /* synthetic */ rx.internal.operators.j2 b;

        a(rx.internal.operators.j2 r1, rx.internal.operators.j2.d r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void call() {
                r1 = this;
                rx.internal.operators.j2$d r0 = r1.a
                r0.g()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b<K, V> implements rx.functions.b<rx.internal.operators.j2.e<K, V>> {
        final java.util.Queue<rx.internal.operators.j2.e<K, V>> a;

        b(java.util.Queue<rx.internal.operators.j2.e<K, V>> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                rx.internal.operators.j2$e r1 = (rx.internal.operators.j2.e) r1
                r0.call(r1)
                return
        }

        public void call(rx.internal.operators.j2.e<K, V> r2) {
                r1 = this;
                java.util.Queue<rx.internal.operators.j2$e<K, V>> r0 = r1.a
                r0.offer(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c implements rx.g {
        final rx.internal.operators.j2.d<?, ?, ?> a;

        public c(rx.internal.operators.j2.d<?, ?, ?> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public void request(long r2) {
                r1 = this;
                rx.internal.operators.j2$d<?, ?, ?> r0 = r1.a
                r0.G(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class d<T, K, V> extends rx.l<T> {
        static final java.lang.Object q = null;
        final rx.l<? super rx.observables.d<K, V>> a;
        final rx.functions.p<? super T, ? extends K> b;
        final rx.functions.p<? super T, ? extends V> c;
        final int d;
        final boolean e;
        final java.util.Map<K, rx.internal.operators.j2.e<K, V>> f;
        final java.util.Queue<rx.internal.operators.j2.e<K, V>> g;
        final rx.internal.operators.j2.c h;
        final java.util.Queue<rx.internal.operators.j2.e<K, V>> i;
        final rx.internal.producers.a j;
        final java.util.concurrent.atomic.AtomicBoolean k;
        final java.util.concurrent.atomic.AtomicLong l;
        final java.util.concurrent.atomic.AtomicInteger m;
        java.lang.Throwable n;
        volatile boolean o;
        final java.util.concurrent.atomic.AtomicInteger p;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                rx.internal.operators.j2.d.q = r0
                return
        }

        public d(rx.l<? super rx.observables.d<K, V>> r1, rx.functions.p<? super T, ? extends K> r2, rx.functions.p<? super T, ? extends V> r3, int r4, boolean r5, java.util.Map<K, rx.internal.operators.j2.e<K, V>> r6, java.util.Queue<rx.internal.operators.j2.e<K, V>> r7) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.e = r5
                java.util.concurrent.ConcurrentLinkedQueue r1 = new java.util.concurrent.ConcurrentLinkedQueue
                r1.<init>()
                r0.g = r1
                rx.internal.producers.a r1 = new rx.internal.producers.a
                r1.<init>()
                r0.j = r1
                long r2 = (long) r4
                r1.request(r2)
                rx.internal.operators.j2$c r1 = new rx.internal.operators.j2$c
                r1.<init>(r0)
                r0.h = r1
                java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
                r1.<init>()
                r0.k = r1
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.l = r1
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r2 = 1
                r1.<init>(r2)
                r0.m = r1
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r1.<init>()
                r0.p = r1
                r0.f = r6
                r0.i = r7
                return
        }

        void A() {
                r15 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r15.p
                int r0 = r0.getAndIncrement()
                if (r0 == 0) goto La
                goto L70
            La:
                java.util.Queue<rx.internal.operators.j2$e<K, V>> r0 = r15.g
                rx.l<? super rx.observables.d<K, V>> r1 = r15.a
                r2 = 1
                r3 = 1
            L10:
                boolean r4 = r15.o
                boolean r5 = r0.isEmpty()
                boolean r4 = r15.s(r4, r5, r1, r0)
                if (r4 == 0) goto L1d
                goto L70
            L1d:
                java.util.concurrent.atomic.AtomicLong r4 = r15.l
                long r4 = r4.get()
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r8 = 0
                int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r9 != 0) goto L2f
                r6 = 1
                goto L30
            L2f:
                r6 = 0
            L30:
                r9 = 0
                r11 = r9
            L33:
                int r7 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r7 == 0) goto L56
                boolean r7 = r15.o
                java.lang.Object r13 = r0.poll()
                rx.observables.d r13 = (rx.observables.d) r13
                if (r13 != 0) goto L43
                r14 = 1
                goto L44
            L43:
                r14 = 0
            L44:
                boolean r7 = r15.s(r7, r14, r1, r0)
                if (r7 == 0) goto L4b
                goto L70
            L4b:
                if (r14 == 0) goto L4e
                goto L56
            L4e:
                r1.onNext(r13)
                r13 = 1
                long r4 = r4 - r13
                long r11 = r11 - r13
                goto L33
            L56:
                int r4 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r4 == 0) goto L67
                if (r6 != 0) goto L61
                java.util.concurrent.atomic.AtomicLong r4 = r15.l
                r4.addAndGet(r11)
            L61:
                rx.internal.producers.a r4 = r15.j
                long r5 = -r11
                r4.request(r5)
            L67:
                java.util.concurrent.atomic.AtomicInteger r4 = r15.p
                int r3 = -r3
                int r3 = r4.addAndGet(r3)
                if (r3 != 0) goto L10
            L70:
                return
        }

        void B(rx.l<? super rx.observables.d<K, V>> r2, java.util.Queue<?> r3, java.lang.Throwable r4) {
                r1 = this;
                r3.clear()
                java.util.ArrayList r3 = new java.util.ArrayList
                java.util.Map<K, rx.internal.operators.j2$e<K, V>> r0 = r1.f
                java.util.Collection r0 = r0.values()
                r3.<init>(r0)
                java.util.Map<K, rx.internal.operators.j2$e<K, V>> r0 = r1.f
                r0.clear()
                java.util.Queue<rx.internal.operators.j2$e<K, V>> r0 = r1.i
                if (r0 == 0) goto L1a
                r0.clear()
            L1a:
                java.util.Iterator r3 = r3.iterator()
            L1e:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L2e
                java.lang.Object r0 = r3.next()
                rx.internal.operators.j2$e r0 = (rx.internal.operators.j2.e) r0
                r0.onError(r4)
                goto L1e
            L2e:
                r2.onError(r4)
                return
        }

        public void G(long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto Lf
                java.util.concurrent.atomic.AtomicLong r0 = r3.l
                rx.internal.operators.a.b(r0, r4)
                r3.A()
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
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.k
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L15
                java.util.concurrent.atomic.AtomicInteger r0 = r3.m
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
                java.lang.Object r2 = rx.internal.operators.j2.d.q
            L5:
                java.util.Map<K, rx.internal.operators.j2$e<K, V>> r0 = r1.f
                java.lang.Object r2 = r0.remove(r2)
                if (r2 == 0) goto L18
                java.util.concurrent.atomic.AtomicInteger r2 = r1.m
                int r2 = r2.decrementAndGet()
                if (r2 != 0) goto L18
                r1.unsubscribe()
            L18:
                return
        }

        public void onCompleted() {
                r2 = this;
                boolean r0 = r2.o
                if (r0 == 0) goto L5
                return
            L5:
                java.util.Map<K, rx.internal.operators.j2$e<K, V>> r0 = r2.f
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
            Lf:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1f
                java.lang.Object r1 = r0.next()
                rx.internal.operators.j2$e r1 = (rx.internal.operators.j2.e) r1
                r1.A7()
                goto Lf
            L1f:
                java.util.Map<K, rx.internal.operators.j2$e<K, V>> r0 = r2.f
                r0.clear()
                java.util.Queue<rx.internal.operators.j2$e<K, V>> r0 = r2.i
                if (r0 == 0) goto L2b
                r0.clear()
            L2b:
                r0 = 1
                r2.o = r0
                java.util.concurrent.atomic.AtomicInteger r0 = r2.m
                r0.decrementAndGet()
                r2.A()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.o
                if (r0 == 0) goto L8
                rx.plugins.c.I(r2)
                return
            L8:
                r1.n = r2
                r2 = 1
                r1.o = r2
                java.util.concurrent.atomic.AtomicInteger r2 = r1.m
                r2.decrementAndGet()
                r1.A()
                return
        }

        public void onNext(T r7) {
                r6 = this;
                boolean r0 = r6.o
                if (r0 == 0) goto L5
                goto L5a
            L5:
                java.util.Queue<rx.internal.operators.j2$e<K, V>> r0 = r6.g
                rx.l<? super rx.observables.d<K, V>> r1 = r6.a
                rx.functions.p<? super T, ? extends K> r2 = r6.b     // Catch: java.lang.Throwable -> L63
                java.lang.Object r2 = r2.call(r7)     // Catch: java.lang.Throwable -> L63
                if (r2 == 0) goto L13
                r3 = r2
                goto L15
            L13:
                java.lang.Object r3 = rx.internal.operators.j2.d.q
            L15:
                java.util.Map<K, rx.internal.operators.j2$e<K, V>> r4 = r6.f
                java.lang.Object r4 = r4.get(r3)
                rx.internal.operators.j2$e r4 = (rx.internal.operators.j2.e) r4
                if (r4 != 0) goto L3f
                java.util.concurrent.atomic.AtomicBoolean r4 = r6.k
                boolean r4 = r4.get()
                if (r4 != 0) goto L5a
                int r4 = r6.d
                boolean r5 = r6.e
                rx.internal.operators.j2$e r4 = rx.internal.operators.j2.e.z7(r2, r4, r6, r5)
                java.util.Map<K, rx.internal.operators.j2$e<K, V>> r2 = r6.f
                r2.put(r3, r4)
                java.util.concurrent.atomic.AtomicInteger r2 = r6.m
                r2.getAndIncrement()
                r0.offer(r4)
                r6.A()
            L3f:
                rx.functions.p<? super T, ? extends V> r2 = r6.c     // Catch: java.lang.Throwable -> L5b
                java.lang.Object r7 = r2.call(r7)     // Catch: java.lang.Throwable -> L5b
                r4.onNext(r7)
                java.util.Queue<rx.internal.operators.j2$e<K, V>> r7 = r6.i
                if (r7 == 0) goto L5a
            L4c:
                java.util.Queue<rx.internal.operators.j2$e<K, V>> r7 = r6.i
                java.lang.Object r7 = r7.poll()
                rx.internal.operators.j2$e r7 = (rx.internal.operators.j2.e) r7
                if (r7 == 0) goto L5a
                r7.A7()
                goto L4c
            L5a:
                return
            L5b:
                r7 = move-exception
                r6.unsubscribe()
                r6.B(r1, r0, r7)
                return
            L63:
                r7 = move-exception
                r6.unsubscribe()
                r6.B(r1, r0, r7)
                return
        }

        boolean s(boolean r2, boolean r3, rx.l<? super rx.observables.d<K, V>> r4, java.util.Queue<?> r5) {
                r1 = this;
                if (r2 == 0) goto L13
                java.lang.Throwable r2 = r1.n
                r0 = 1
                if (r2 == 0) goto Lb
                r1.B(r4, r5, r2)
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
                rx.internal.producers.a r0 = r1.j
                r0.c(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class e<K, T> extends rx.observables.d<K, T> {
        final rx.internal.operators.j2.f<T, K> c;

        protected e(K r1, rx.internal.operators.j2.f<T, K> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.c = r2
                return
        }

        public static <T, K> rx.internal.operators.j2.e<K, T> z7(K r1, int r2, rx.internal.operators.j2.d<?, K, T> r3, boolean r4) {
                rx.internal.operators.j2$f r0 = new rx.internal.operators.j2$f
                r0.<init>(r2, r3, r1, r4)
                rx.internal.operators.j2$e r2 = new rx.internal.operators.j2$e
                r2.<init>(r1, r0)
                return r2
        }

        public void A7() {
                r1 = this;
                rx.internal.operators.j2$f<T, K> r0 = r1.c
                r0.d()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.internal.operators.j2$f<T, K> r0 = r1.c
                r0.e(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                rx.internal.operators.j2$f<T, K> r0 = r1.c
                r0.f(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class f<T, K> extends java.util.concurrent.atomic.AtomicInteger implements rx.g, rx.m, rx.e.a<T> {
        private static final long serialVersionUID = -3852313036005250360L;
        final K a;
        final java.util.Queue<java.lang.Object> b;
        final rx.internal.operators.j2.d<?, K, T> c;
        final boolean d;
        final java.util.concurrent.atomic.AtomicLong e;
        volatile boolean f;
        java.lang.Throwable g;
        final java.util.concurrent.atomic.AtomicBoolean h;
        final java.util.concurrent.atomic.AtomicReference<rx.l<? super T>> i;
        final java.util.concurrent.atomic.AtomicBoolean j;

        public f(int r1, rx.internal.operators.j2.d<?, K, T> r2, K r3, boolean r4) {
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
                rx.internal.operators.j2$d<?, K, T> r3 = r2.c
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
                r18 = this;
                r0 = r18
                int r1 = r0.getAndIncrement()
                if (r1 == 0) goto La
                goto L7d
            La:
                java.util.Queue<java.lang.Object> r1 = r0.b
                boolean r2 = r0.d
                java.util.concurrent.atomic.AtomicReference<rx.l<? super T>> r3 = r0.i
                java.lang.Object r3 = r3.get()
                rx.l r3 = (rx.l) r3
                r5 = 1
            L17:
                if (r3 == 0) goto L76
                boolean r6 = r0.f
                boolean r7 = r1.isEmpty()
                boolean r6 = r0.a(r6, r7, r3, r2)
                if (r6 == 0) goto L26
                goto L7d
            L26:
                java.util.concurrent.atomic.AtomicLong r6 = r0.e
                long r6 = r6.get()
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r10 = 0
                int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r11 != 0) goto L38
                r8 = 1
                goto L39
            L38:
                r8 = 0
            L39:
                r11 = 0
                r13 = r11
            L3c:
                int r9 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r9 == 0) goto L63
                boolean r9 = r0.f
                java.lang.Object r15 = r1.poll()
                if (r15 != 0) goto L4a
                r4 = 1
                goto L4b
            L4a:
                r4 = 0
            L4b:
                boolean r9 = r0.a(r9, r4, r3, r2)
                if (r9 == 0) goto L52
                goto L7d
            L52:
                if (r4 == 0) goto L55
                goto L63
            L55:
                java.lang.Object r4 = rx.internal.operators.v.e(r15)
                r3.onNext(r4)
                r16 = 1
                long r6 = r6 - r16
                long r13 = r13 - r16
                goto L3c
            L63:
                int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r4 == 0) goto L76
                if (r8 != 0) goto L6e
                java.util.concurrent.atomic.AtomicLong r4 = r0.e
                r4.addAndGet(r13)
            L6e:
                rx.internal.operators.j2$d<?, K, T> r4 = r0.c
                rx.internal.producers.a r4 = r4.j
                long r6 = -r13
                r4.request(r6)
            L76:
                int r4 = -r5
                int r5 = r0.addAndGet(r4)
                if (r5 != 0) goto L7e
            L7d:
                return
            L7e:
                if (r3 != 0) goto L17
                java.util.concurrent.atomic.AtomicReference<rx.l<? super T>> r3 = r0.i
                java.lang.Object r3 = r3.get()
                rx.l r3 = (rx.l) r3
                goto L17
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
                rx.internal.operators.j2$d<?, K, T> r0 = r3.c
                K r1 = r3.a
                r0.j(r1)
            L17:
                return
        }
    }

    public j2(rx.functions.p<? super T, ? extends K> r7) {
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

    public j2(rx.functions.p<? super T, ? extends K> r7, rx.functions.p<? super T, ? extends V> r8) {
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

    public j2(rx.functions.p<? super T, ? extends K> r1, rx.functions.p<? super T, ? extends V> r2, int r3, boolean r4, rx.functions.p<rx.functions.b<java.lang.Object>, java.util.Map<K, java.lang.Object>> r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super rx.observables.d<K, V>> r11) {
            r10 = this;
            rx.functions.p<rx.functions.b<java.lang.Object>, java.util.Map<K, java.lang.Object>> r0 = r10.e
            if (r0 != 0) goto Ld
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1 = 0
        La:
            r8 = r0
            r9 = r1
            goto L20
        Ld:
            java.util.concurrent.ConcurrentLinkedQueue r1 = new java.util.concurrent.ConcurrentLinkedQueue
            r1.<init>()
            rx.internal.operators.j2$b r0 = new rx.internal.operators.j2$b
            r0.<init>(r1)
            rx.functions.p<rx.functions.b<java.lang.Object>, java.util.Map<K, java.lang.Object>> r2 = r10.e     // Catch: java.lang.Throwable -> L40
            java.lang.Object r0 = r2.call(r0)     // Catch: java.lang.Throwable -> L40
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L40
            goto La
        L20:
            rx.internal.operators.j2$d r2 = new rx.internal.operators.j2$d
            rx.functions.p<? super T, ? extends K> r4 = r10.a
            rx.functions.p<? super T, ? extends V> r5 = r10.b
            int r6 = r10.c
            boolean r7 = r10.d
            r3 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            rx.internal.operators.j2$a r11 = new rx.internal.operators.j2$a
            r11.<init>(r10, r2)
            rx.m r11 = rx.subscriptions.f.a(r11)
            r3.add(r11)
            rx.internal.operators.j2$c r11 = r2.h
            r3.setProducer(r11)
            return r2
        L40:
            r0 = move-exception
            r3 = r11
            r11 = r0
            rx.exceptions.a.f(r11, r3)
            rx.l r11 = rx.observers.h.d()
            r11.unsubscribe()
            return r11
    }
}
