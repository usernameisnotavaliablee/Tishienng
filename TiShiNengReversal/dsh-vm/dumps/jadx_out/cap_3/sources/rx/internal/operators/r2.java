package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class r2<T> implements rx.e.b<T, T> {
    private final java.lang.Long a;
    private final rx.functions.a b;
    private final rx.a.d c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends rx.l<T> implements rx.internal.util.BackpressureDrainManager.a {
        private final java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> a;
        private final java.util.concurrent.atomic.AtomicLong b;
        private final rx.l<? super T> c;
        private final java.util.concurrent.atomic.AtomicBoolean d;
        private final rx.internal.util.BackpressureDrainManager e;
        private final rx.functions.a f;
        private final rx.a.d g;

        public a(rx.l<? super T> r3, java.lang.Long r4, rx.functions.a r5, rx.a.d r6) {
                r2 = this;
                r2.<init>()
                java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
                r0.<init>()
                r2.a = r0
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                r1 = 0
                r0.<init>(r1)
                r2.d = r0
                r2.c = r3
                if (r4 == 0) goto L20
                java.util.concurrent.atomic.AtomicLong r3 = new java.util.concurrent.atomic.AtomicLong
                long r0 = r4.longValue()
                r3.<init>(r0)
                goto L21
            L20:
                r3 = 0
            L21:
                r2.b = r3
                r2.f = r5
                rx.internal.util.BackpressureDrainManager r3 = new rx.internal.util.BackpressureDrainManager
                r3.<init>(r2)
                r2.e = r3
                r2.g = r6
                return
        }

        private boolean g() {
                r6 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r6.b
                r1 = 1
                if (r0 != 0) goto L6
                return r1
            L6:
                java.util.concurrent.atomic.AtomicLong r0 = r6.b
                long r2 = r0.get()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 > 0) goto L4a
                r0 = 0
                rx.a$d r4 = r6.g     // Catch: rx.exceptions.MissingBackpressureException -> L23
                boolean r4 = r4.a()     // Catch: rx.exceptions.MissingBackpressureException -> L23
                if (r4 == 0) goto L34
                java.lang.Object r4 = r6.poll()     // Catch: rx.exceptions.MissingBackpressureException -> L23
                if (r4 == 0) goto L34
                r4 = 1
                goto L35
            L23:
                r4 = move-exception
                java.util.concurrent.atomic.AtomicBoolean r5 = r6.d
                boolean r5 = r5.compareAndSet(r0, r1)
                if (r5 == 0) goto L34
                r6.unsubscribe()
                rx.l<? super T> r5 = r6.c
                r5.onError(r4)
            L34:
                r4 = 0
            L35:
                rx.functions.a r5 = r6.f
                if (r5 == 0) goto L47
                r5.call()     // Catch: java.lang.Throwable -> L3d
                goto L47
            L3d:
                r1 = move-exception
                rx.exceptions.a.e(r1)
                rx.internal.util.BackpressureDrainManager r2 = r6.e
                r2.terminateAndDrain(r1)
                return r0
            L47:
                if (r4 != 0) goto L4a
                return r0
            L4a:
                java.util.concurrent.atomic.AtomicLong r0 = r6.b
                r4 = 1
                long r4 = r2 - r4
                boolean r0 = r0.compareAndSet(r2, r4)
                if (r0 == 0) goto L6
                return r1
        }

        @Override // rx.internal.util.BackpressureDrainManager.a
        public boolean accept(java.lang.Object r2) {
                r1 = this;
                rx.l<? super T> r0 = r1.c
                boolean r2 = rx.internal.operators.v.a(r0, r2)
                return r2
        }

        @Override // rx.internal.util.BackpressureDrainManager.a
        public void e(java.lang.Throwable r2) {
                r1 = this;
                if (r2 == 0) goto L8
                rx.l<? super T> r0 = r1.c
                r0.onError(r2)
                return
            L8:
                rx.l<? super T> r2 = r1.c
                r2.onCompleted()
                return
        }

        protected rx.g j() {
                r1 = this;
                rx.internal.util.BackpressureDrainManager r0 = r1.e
                return r0
        }

        public void onCompleted() {
                r1 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.d
                boolean r0 = r0.get()
                if (r0 != 0) goto Ld
                rx.internal.util.BackpressureDrainManager r0 = r1.e
                r0.terminateAndDrain()
            Ld:
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.d
                boolean r0 = r0.get()
                if (r0 != 0) goto Ld
                rx.internal.util.BackpressureDrainManager r0 = r1.e
                r0.terminateAndDrain(r2)
            Ld:
                return
        }

        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.g()
                if (r0 != 0) goto L7
                return
            L7:
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> r0 = r1.a
                java.lang.Object r2 = rx.internal.operators.v.j(r2)
                r0.offer(r2)
                rx.internal.util.BackpressureDrainManager r2 = r1.e
                r2.drain()
                return
        }

        public void onStart() {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r2.request(r0)
                return
        }

        @Override // rx.internal.util.BackpressureDrainManager.a
        public java.lang.Object peek() {
                r1 = this;
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> r0 = r1.a
                java.lang.Object r0 = r0.peek()
                return r0
        }

        @Override // rx.internal.util.BackpressureDrainManager.a
        public java.lang.Object poll() {
                r2 = this;
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> r0 = r2.a
                java.lang.Object r0 = r0.poll()
                java.util.concurrent.atomic.AtomicLong r1 = r2.b
                if (r1 == 0) goto Lf
                if (r0 == 0) goto Lf
                r1.incrementAndGet()
            Lf:
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b {
        static final rx.internal.operators.r2<?> a = null;

        static {
                rx.internal.operators.r2 r0 = new rx.internal.operators.r2
                r0.<init>()
                rx.internal.operators.r2.b.a = r0
                return
        }

        b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    r2() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.b = r0
            rx.a$d r0 = rx.a.b
            r1.c = r0
            return
    }

    public r2(long r3) {
            r2 = this;
            r0 = 0
            rx.a$d r1 = rx.a.b
            r2.<init>(r3, r0, r1)
            return
    }

    public r2(long r2, rx.functions.a r4) {
            r1 = this;
            rx.a$d r0 = rx.a.b
            r1.<init>(r2, r4, r0)
            return
    }

    public r2(long r4, rx.functions.a r6, rx.a.d r7) {
            r3 = this;
            r3.<init>()
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L1e
            if (r7 == 0) goto L16
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.a = r4
            r3.b = r6
            r3.c = r7
            return
        L16:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "The BackpressureOverflow strategy must not be null"
            r4.<init>(r5)
            throw r4
        L1e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Buffer capacity must be > 0"
            r4.<init>(r5)
            throw r4
    }

    public static <T> rx.internal.operators.r2<T> a() {
            rx.internal.operators.r2<?> r0 = rx.internal.operators.r2.b.a
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
            rx.internal.operators.r2$a r0 = new rx.internal.operators.r2$a
            java.lang.Long r1 = r4.a
            rx.functions.a r2 = r4.b
            rx.a$d r3 = r4.c
            r0.<init>(r5, r1, r2, r3)
            r5.add(r0)
            rx.g r1 = r0.j()
            r5.setProducer(r1)
            return r0
    }
}
