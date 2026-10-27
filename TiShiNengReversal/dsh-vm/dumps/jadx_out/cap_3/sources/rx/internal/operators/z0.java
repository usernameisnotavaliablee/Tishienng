package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class z0<T> implements rx.e.a<T> {
    private final rx.observables.c<? extends T> a;
    volatile rx.subscriptions.b b;
    final java.util.concurrent.atomic.AtomicInteger c;
    final java.util.concurrent.locks.ReentrantLock d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.functions.b<rx.m> {
        final /* synthetic */ rx.l a;
        final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean b;
        final /* synthetic */ rx.internal.operators.z0 c;

        a(rx.internal.operators.z0 r1, rx.l r2, java.util.concurrent.atomic.AtomicBoolean r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                rx.m r1 = (rx.m) r1
                r0.call(r1)
                return
        }

        public void call(rx.m r4) {
                r3 = this;
                r0 = 0
                rx.internal.operators.z0 r1 = r3.c     // Catch: java.lang.Throwable -> L1e
                rx.subscriptions.b r1 = r1.b     // Catch: java.lang.Throwable -> L1e
                r1.a(r4)     // Catch: java.lang.Throwable -> L1e
                rx.internal.operators.z0 r4 = r3.c     // Catch: java.lang.Throwable -> L1e
                rx.l r1 = r3.a     // Catch: java.lang.Throwable -> L1e
                rx.subscriptions.b r2 = r4.b     // Catch: java.lang.Throwable -> L1e
                r4.c(r1, r2)     // Catch: java.lang.Throwable -> L1e
                rx.internal.operators.z0 r4 = r3.c
                java.util.concurrent.locks.ReentrantLock r4 = r4.d
                r4.unlock()
                java.util.concurrent.atomic.AtomicBoolean r4 = r3.b
                r4.set(r0)
                return
            L1e:
                r4 = move-exception
                rx.internal.operators.z0 r1 = r3.c
                java.util.concurrent.locks.ReentrantLock r1 = r1.d
                r1.unlock()
                java.util.concurrent.atomic.AtomicBoolean r1 = r3.b
                r1.set(r0)
                throw r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends rx.l<T> {
        final /* synthetic */ rx.l a;
        final /* synthetic */ rx.subscriptions.b b;
        final /* synthetic */ rx.internal.operators.z0 c;

        b(rx.internal.operators.z0 r1, rx.l r2, rx.l r3, rx.subscriptions.b r4) {
                r0 = this;
                r0.c = r1
                r0.a = r3
                r0.b = r4
                r0.<init>(r2)
                return
        }

        void g() {
                r2 = this;
                rx.internal.operators.z0 r0 = r2.c
                java.util.concurrent.locks.ReentrantLock r0 = r0.d
                r0.lock()
                rx.internal.operators.z0 r0 = r2.c     // Catch: java.lang.Throwable -> L25
                rx.subscriptions.b r0 = r0.b     // Catch: java.lang.Throwable -> L25
                rx.subscriptions.b r1 = r2.b     // Catch: java.lang.Throwable -> L25
                if (r0 != r1) goto L3f
                rx.internal.operators.z0 r0 = r2.c     // Catch: java.lang.Throwable -> L25
                rx.observables.c r0 = rx.internal.operators.z0.a(r0)     // Catch: java.lang.Throwable -> L25
                boolean r0 = r0 instanceof rx.m     // Catch: java.lang.Throwable -> L25
                if (r0 == 0) goto L27
                rx.internal.operators.z0 r0 = r2.c     // Catch: java.lang.Throwable -> L25
                rx.observables.c r0 = rx.internal.operators.z0.a(r0)     // Catch: java.lang.Throwable -> L25
                rx.m r0 = (rx.m) r0     // Catch: java.lang.Throwable -> L25
                r0.unsubscribe()     // Catch: java.lang.Throwable -> L25
                goto L27
            L25:
                r0 = move-exception
                goto L47
            L27:
                rx.internal.operators.z0 r0 = r2.c     // Catch: java.lang.Throwable -> L25
                rx.subscriptions.b r0 = r0.b     // Catch: java.lang.Throwable -> L25
                r0.unsubscribe()     // Catch: java.lang.Throwable -> L25
                rx.internal.operators.z0 r0 = r2.c     // Catch: java.lang.Throwable -> L25
                rx.subscriptions.b r1 = new rx.subscriptions.b     // Catch: java.lang.Throwable -> L25
                r1.<init>()     // Catch: java.lang.Throwable -> L25
                r0.b = r1     // Catch: java.lang.Throwable -> L25
                rx.internal.operators.z0 r0 = r2.c     // Catch: java.lang.Throwable -> L25
                java.util.concurrent.atomic.AtomicInteger r0 = r0.c     // Catch: java.lang.Throwable -> L25
                r1 = 0
                r0.set(r1)     // Catch: java.lang.Throwable -> L25
            L3f:
                rx.internal.operators.z0 r0 = r2.c
                java.util.concurrent.locks.ReentrantLock r0 = r0.d
                r0.unlock()
                return
            L47:
                rx.internal.operators.z0 r1 = r2.c
                java.util.concurrent.locks.ReentrantLock r1 = r1.d
                r1.unlock()
                throw r0
        }

        public void onCompleted() {
                r1 = this;
                r1.g()
                rx.l r0 = r1.a
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r1.g()
                rx.l r0 = r1.a
                r0.onError(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                rx.l r0 = r1.a
                r0.onNext(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements rx.functions.a {
        final /* synthetic */ rx.subscriptions.b a;
        final /* synthetic */ rx.internal.operators.z0 b;

        c(rx.internal.operators.z0 r1, rx.subscriptions.b r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void call() {
                r2 = this;
                rx.internal.operators.z0 r0 = r2.b
                java.util.concurrent.locks.ReentrantLock r0 = r0.d
                r0.lock()
                rx.internal.operators.z0 r0 = r2.b     // Catch: java.lang.Throwable -> L2f
                rx.subscriptions.b r0 = r0.b     // Catch: java.lang.Throwable -> L2f
                rx.subscriptions.b r1 = r2.a     // Catch: java.lang.Throwable -> L2f
                if (r0 != r1) goto L41
                rx.internal.operators.z0 r0 = r2.b     // Catch: java.lang.Throwable -> L2f
                java.util.concurrent.atomic.AtomicInteger r0 = r0.c     // Catch: java.lang.Throwable -> L2f
                int r0 = r0.decrementAndGet()     // Catch: java.lang.Throwable -> L2f
                if (r0 != 0) goto L41
                rx.internal.operators.z0 r0 = r2.b     // Catch: java.lang.Throwable -> L2f
                rx.observables.c r0 = rx.internal.operators.z0.a(r0)     // Catch: java.lang.Throwable -> L2f
                boolean r0 = r0 instanceof rx.m     // Catch: java.lang.Throwable -> L2f
                if (r0 == 0) goto L31
                rx.internal.operators.z0 r0 = r2.b     // Catch: java.lang.Throwable -> L2f
                rx.observables.c r0 = rx.internal.operators.z0.a(r0)     // Catch: java.lang.Throwable -> L2f
                rx.m r0 = (rx.m) r0     // Catch: java.lang.Throwable -> L2f
                r0.unsubscribe()     // Catch: java.lang.Throwable -> L2f
                goto L31
            L2f:
                r0 = move-exception
                goto L49
            L31:
                rx.internal.operators.z0 r0 = r2.b     // Catch: java.lang.Throwable -> L2f
                rx.subscriptions.b r0 = r0.b     // Catch: java.lang.Throwable -> L2f
                r0.unsubscribe()     // Catch: java.lang.Throwable -> L2f
                rx.internal.operators.z0 r0 = r2.b     // Catch: java.lang.Throwable -> L2f
                rx.subscriptions.b r1 = new rx.subscriptions.b     // Catch: java.lang.Throwable -> L2f
                r1.<init>()     // Catch: java.lang.Throwable -> L2f
                r0.b = r1     // Catch: java.lang.Throwable -> L2f
            L41:
                rx.internal.operators.z0 r0 = r2.b
                java.util.concurrent.locks.ReentrantLock r0 = r0.d
                r0.unlock()
                return
            L49:
                rx.internal.operators.z0 r1 = r2.b
                java.util.concurrent.locks.ReentrantLock r1 = r1.d
                r1.unlock()
                throw r0
        }
    }

    public z0(rx.observables.c<? extends T> r3) {
            r2 = this;
            r2.<init>()
            rx.subscriptions.b r0 = new rx.subscriptions.b
            r0.<init>()
            r2.b = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r2.c = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r2.d = r0
            r2.a = r3
            return
    }

    static /* synthetic */ rx.observables.c a(rx.internal.operators.z0 r0) {
            rx.observables.c<? extends T> r0 = r0.a
            return r0
    }

    private rx.m b(rx.subscriptions.b r2) {
            r1 = this;
            rx.internal.operators.z0$c r0 = new rx.internal.operators.z0$c
            r0.<init>(r1, r2)
            rx.m r2 = rx.subscriptions.f.a(r0)
            return r2
    }

    private rx.functions.b<rx.m> d(rx.l<? super T> r2, java.util.concurrent.atomic.AtomicBoolean r3) {
            r1 = this;
            rx.internal.operators.z0$a r0 = new rx.internal.operators.z0$a
            r0.<init>(r1, r2, r3)
            return r0
    }

    void c(rx.l<? super T> r3, rx.subscriptions.b r4) {
            r2 = this;
            rx.m r0 = r2.b(r4)
            r3.add(r0)
            rx.observables.c<? extends T> r0 = r2.a
            rx.internal.operators.z0$b r1 = new rx.internal.operators.z0$b
            r1.<init>(r2, r3, r3, r4)
            r0.J6(r1)
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super T> r3) {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.d
            r0.lock()
            java.util.concurrent.atomic.AtomicInteger r0 = r2.c
            int r0 = r0.incrementAndGet()
            r1 = 1
            if (r0 != r1) goto L35
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            rx.observables.c<? extends T> r1 = r2.a     // Catch: java.lang.Throwable -> L28
            rx.functions.b r3 = r2.d(r3, r0)     // Catch: java.lang.Throwable -> L28
            r1.A7(r3)     // Catch: java.lang.Throwable -> L28
            boolean r3 = r0.get()
            if (r3 == 0) goto L27
            java.util.concurrent.locks.ReentrantLock r3 = r2.d
            r3.unlock()
        L27:
            return
        L28:
            r3 = move-exception
            boolean r0 = r0.get()
            if (r0 == 0) goto L34
            java.util.concurrent.locks.ReentrantLock r0 = r2.d
            r0.unlock()
        L34:
            throw r3
        L35:
            rx.subscriptions.b r0 = r2.b     // Catch: java.lang.Throwable -> L40
            r2.c(r3, r0)     // Catch: java.lang.Throwable -> L40
            java.util.concurrent.locks.ReentrantLock r3 = r2.d
            r3.unlock()
            return
        L40:
            r3 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = r2.d
            r0.unlock()
            throw r3
    }
}
