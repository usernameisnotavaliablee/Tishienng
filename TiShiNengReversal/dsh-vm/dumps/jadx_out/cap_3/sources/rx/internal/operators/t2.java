package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class t2<T> implements rx.e.b<T, T> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a {
        static final rx.internal.operators.t2<java.lang.Object> a = null;

        static {
                rx.internal.operators.t2 r0 = new rx.internal.operators.t2
                r0.<init>()
                rx.internal.operators.t2.a.a = r0
                return
        }

        a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T> extends java.util.concurrent.atomic.AtomicLong implements rx.g, rx.m, rx.f<T> {
        static final java.lang.Object h = null;
        static final long i = -4611686018427387904L;
        private static final long serialVersionUID = -1364393685005146274L;
        final rx.l<? super T> a;
        rx.internal.operators.t2.c<? super T> b;
        final java.util.concurrent.atomic.AtomicReference<java.lang.Object> c;
        java.lang.Throwable d;
        volatile boolean e;
        boolean f;
        boolean g;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                rx.internal.operators.t2.b.h = r0
                return
        }

        public b(rx.l<? super T> r3) {
                r2 = this;
                r2.<init>()
                r2.a = r3
                java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
                java.lang.Object r0 = rx.internal.operators.t2.b.h
                r3.<init>(r0)
                r2.c = r3
                r0 = -4611686018427387904(0xc000000000000000, double:-2.0)
                r2.lazySet(r0)
                return
        }

        void d() {
                r9 = this;
                monitor-enter(r9)
                boolean r0 = r9.f     // Catch: java.lang.Throwable -> La
                r1 = 1
                if (r0 == 0) goto Ld
                r9.g = r1     // Catch: java.lang.Throwable -> La
                monitor-exit(r9)     // Catch: java.lang.Throwable -> La
                return
            La:
                r0 = move-exception
                goto L7c
            Ld:
                r9.f = r1     // Catch: java.lang.Throwable -> La
                r0 = 0
                r9.g = r0     // Catch: java.lang.Throwable -> La
                monitor-exit(r9)     // Catch: java.lang.Throwable -> La
            L13:
                long r2 = r9.get()     // Catch: java.lang.Throwable -> L3f
                r4 = -9223372036854775808
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L1e
                goto L61
            L1e:
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r4 = r9.c     // Catch: java.lang.Throwable -> L3f
                java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> L3f
                r5 = 0
                int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r7 <= 0) goto L42
                java.lang.Object r2 = rx.internal.operators.t2.b.h     // Catch: java.lang.Throwable -> L3f
                if (r4 == r2) goto L42
                rx.l<? super T> r3 = r9.a     // Catch: java.lang.Throwable -> L3f
                r3.onNext(r4)     // Catch: java.lang.Throwable -> L3f
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r3 = r9.c     // Catch: java.lang.Throwable -> L3f
                androidx.camera.view.p.a(r3, r4, r2)     // Catch: java.lang.Throwable -> L3f
                r3 = 1
                r9.e(r3)     // Catch: java.lang.Throwable -> L3f
                r4 = r2
                goto L42
            L3f:
                r1 = move-exception
                r2 = 0
                goto L71
            L42:
                java.lang.Object r2 = rx.internal.operators.t2.b.h     // Catch: java.lang.Throwable -> L3f
                if (r4 != r2) goto L59
                boolean r2 = r9.e     // Catch: java.lang.Throwable -> L3f
                if (r2 == 0) goto L59
                java.lang.Throwable r2 = r9.d     // Catch: java.lang.Throwable -> L3f
                if (r2 == 0) goto L54
                rx.l<? super T> r3 = r9.a     // Catch: java.lang.Throwable -> L3f
                r3.onError(r2)     // Catch: java.lang.Throwable -> L3f
                goto L59
            L54:
                rx.l<? super T> r2 = r9.a     // Catch: java.lang.Throwable -> L3f
                r2.onCompleted()     // Catch: java.lang.Throwable -> L3f
            L59:
                monitor-enter(r9)     // Catch: java.lang.Throwable -> L3f
                boolean r2 = r9.g     // Catch: java.lang.Throwable -> L64
                if (r2 != 0) goto L67
                r9.f = r0     // Catch: java.lang.Throwable -> L64
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L62
            L61:
                return
            L62:
                r2 = move-exception
                goto L6b
            L64:
                r2 = move-exception
                r1 = 0
                goto L6b
            L67:
                r9.g = r0     // Catch: java.lang.Throwable -> L64
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L64
                goto L13
            L6b:
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L62
                throw r2     // Catch: java.lang.Throwable -> L6d
            L6d:
                r2 = move-exception
                r8 = r2
                r2 = r1
                r1 = r8
            L71:
                if (r2 != 0) goto L7b
                monitor-enter(r9)
                r9.f = r0     // Catch: java.lang.Throwable -> L78
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L78
                goto L7b
            L78:
                r0 = move-exception
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L78
                throw r0
            L7b:
                throw r1
            L7c:
                monitor-exit(r9)     // Catch: java.lang.Throwable -> La
                throw r0
        }

        long e(long r6) {
                r5 = this;
            L0:
                long r0 = r5.get()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 >= 0) goto Lb
                return r0
            Lb:
                long r2 = r0 - r6
                boolean r0 = r5.compareAndSet(r0, r2)
                if (r0 == 0) goto L0
                return r2
        }

        public boolean isUnsubscribed() {
                r5 = this;
                long r0 = r5.get()
                r2 = -9223372036854775808
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        public void onCompleted() {
                r1 = this;
                r0 = 1
                r1.e = r0
                r1.d()
                return
        }

        public void onError(java.lang.Throwable r1) {
                r0 = this;
                r0.d = r1
                r1 = 1
                r0.e = r1
                r0.d()
                return
        }

        public void onNext(T r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r1.c
                r0.lazySet(r2)
                r1.d()
                return
        }

        public void request(long r11) {
                r10 = this;
                r0 = 0
                int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
                if (r2 < 0) goto L35
            L6:
                long r2 = r10.get()
                r4 = -9223372036854775808
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L11
                goto L35
            L11:
                r4 = -4611686018427387904(0xc000000000000000, double:-2.0)
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r8 != 0) goto L1e
                r4 = r11
                goto L25
            L1e:
                long r4 = r2 + r11
                int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r9 >= 0) goto L25
                r4 = r6
            L25:
                boolean r2 = r10.compareAndSet(r2, r4)
                if (r2 == 0) goto L6
                if (r8 != 0) goto L32
                rx.internal.operators.t2$c<? super T> r11 = r10.b
                r11.g(r6)
            L32:
                r10.d()
            L35:
                return
        }

        public void unsubscribe() {
                r5 = this;
                long r0 = r5.get()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 < 0) goto Lf
                r0 = -9223372036854775808
                r5.getAndSet(r0)
            Lf:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c<T> extends rx.l<T> {
        private final rx.internal.operators.t2.b<T> a;

        c(rx.internal.operators.t2.b<T> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        void g(long r1) {
                r0 = this;
                r0.request(r1)
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.internal.operators.t2$b<T> r0 = r1.a
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.internal.operators.t2$b<T> r0 = r1.a
                r0.onError(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                rx.internal.operators.t2$b<T> r0 = r1.a
                r0.onNext(r2)
                return
        }

        public void onStart() {
                r2 = this;
                r0 = 0
                r2.request(r0)
                return
        }
    }

    public t2() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> rx.internal.operators.t2<T> a() {
            rx.internal.operators.t2<java.lang.Object> r0 = rx.internal.operators.t2.a.a
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super T> r3) {
            r2 = this;
            rx.internal.operators.t2$b r0 = new rx.internal.operators.t2$b
            r0.<init>(r3)
            rx.internal.operators.t2$c r1 = new rx.internal.operators.t2$c
            r1.<init>(r0)
            r0.b = r1
            r3.add(r1)
            r3.add(r0)
            r3.setProducer(r0)
            return r1
    }
}
