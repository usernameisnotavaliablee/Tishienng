package rx.observables;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class b<T> {
    static final java.lang.Object b = null;
    static final java.lang.Object c = null;
    static final java.lang.Object d = null;
    private final rx.e<? extends T> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<T> {
        final /* synthetic */ java.util.concurrent.CountDownLatch a;
        final /* synthetic */ java.util.concurrent.atomic.AtomicReference b;
        final /* synthetic */ rx.functions.b c;
        final /* synthetic */ rx.observables.b d;

        a(rx.observables.b r1, java.util.concurrent.CountDownLatch r2, java.util.concurrent.atomic.AtomicReference r3, rx.functions.b r4) {
                r0 = this;
                r0.d = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.<init>()
                return
        }

        public void onCompleted() {
                r1 = this;
                java.util.concurrent.CountDownLatch r0 = r1.a
                r0.countDown()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference r0 = r1.b
                r0.set(r2)
                java.util.concurrent.CountDownLatch r2 = r1.a
                r2.countDown()
                return
        }

        public void onNext(T r2) {
                r1 = this;
                rx.functions.b r0 = r1.c
                r0.call(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: rx.observables.b$b, reason: collision with other inner class name */
    class C0048b implements java.lang.Iterable<T> {
        final /* synthetic */ rx.observables.b a;

        C0048b(rx.observables.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<T> iterator() {
                r1 = this;
                rx.observables.b r0 = r1.a
                java.util.Iterator r0 = r0.h()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends rx.l<T> {
        final /* synthetic */ java.util.concurrent.CountDownLatch a;
        final /* synthetic */ java.util.concurrent.atomic.AtomicReference b;
        final /* synthetic */ java.util.concurrent.atomic.AtomicReference c;
        final /* synthetic */ rx.observables.b d;

        c(rx.observables.b r1, java.util.concurrent.CountDownLatch r2, java.util.concurrent.atomic.AtomicReference r3, java.util.concurrent.atomic.AtomicReference r4) {
                r0 = this;
                r0.d = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.<init>()
                return
        }

        public void onCompleted() {
                r1 = this;
                java.util.concurrent.CountDownLatch r0 = r1.a
                r0.countDown()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference r0 = r1.b
                r0.set(r2)
                java.util.concurrent.CountDownLatch r2 = r1.a
                r2.countDown()
                return
        }

        public void onNext(T r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference r0 = r1.c
                r0.set(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends rx.l<T> {
        final /* synthetic */ java.lang.Throwable[] a;
        final /* synthetic */ java.util.concurrent.CountDownLatch b;
        final /* synthetic */ rx.observables.b c;

        d(rx.observables.b r1, java.lang.Throwable[] r2, java.util.concurrent.CountDownLatch r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        public void onCompleted() {
                r1 = this;
                java.util.concurrent.CountDownLatch r0 = r1.b
                r0.countDown()
                return
        }

        public void onError(java.lang.Throwable r3) {
                r2 = this;
                java.lang.Throwable[] r0 = r2.a
                r1 = 0
                r0[r1] = r3
                java.util.concurrent.CountDownLatch r3 = r2.b
                r3.countDown()
                return
        }

        public void onNext(T r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends rx.l<T> {
        final /* synthetic */ java.util.concurrent.BlockingQueue a;
        final /* synthetic */ rx.observables.b b;

        e(rx.observables.b r1, java.util.concurrent.BlockingQueue r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void onCompleted() {
                r2 = this;
                java.util.concurrent.BlockingQueue r0 = r2.a
                java.lang.Object r1 = rx.internal.operators.v.b()
                r0.offer(r1)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.BlockingQueue r0 = r1.a
                java.lang.Object r2 = rx.internal.operators.v.c(r2)
                r0.offer(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                java.util.concurrent.BlockingQueue r0 = r1.a
                java.lang.Object r2 = rx.internal.operators.v.j(r2)
                r0.offer(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f extends rx.l<T> {
        final /* synthetic */ java.util.concurrent.BlockingQueue a;
        final /* synthetic */ rx.g[] b;
        final /* synthetic */ rx.observables.b c;

        f(rx.observables.b r1, java.util.concurrent.BlockingQueue r2, rx.g[] r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        public void onCompleted() {
                r2 = this;
                java.util.concurrent.BlockingQueue r0 = r2.a
                java.lang.Object r1 = rx.internal.operators.v.b()
                r0.offer(r1)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.BlockingQueue r0 = r1.a
                java.lang.Object r2 = rx.internal.operators.v.c(r2)
                r0.offer(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                java.util.concurrent.BlockingQueue r0 = r1.a
                java.lang.Object r2 = rx.internal.operators.v.j(r2)
                r0.offer(r2)
                return
        }

        public void onStart() {
                r2 = this;
                java.util.concurrent.BlockingQueue r0 = r2.a
                java.lang.Object r1 = rx.observables.b.b
                r0.offer(r1)
                return
        }

        public void setProducer(rx.g r3) {
                r2 = this;
                rx.g[] r0 = r2.b
                r1 = 0
                r0[r1] = r3
                java.util.concurrent.BlockingQueue r3 = r2.a
                java.lang.Object r0 = rx.observables.b.c
                r3.offer(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g implements rx.functions.a {
        final /* synthetic */ java.util.concurrent.BlockingQueue a;
        final /* synthetic */ rx.observables.b b;

        g(rx.observables.b r1, java.util.concurrent.BlockingQueue r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void call() {
                r2 = this;
                java.util.concurrent.BlockingQueue r0 = r2.a
                java.lang.Object r1 = rx.observables.b.d
                r0.offer(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class h implements rx.functions.b<java.lang.Throwable> {
        final /* synthetic */ rx.observables.b a;

        h(rx.observables.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.call(r1)
                return
        }

        public void call(java.lang.Throwable r2) {
                r1 = this;
                rx.exceptions.OnErrorNotImplementedException r0 = new rx.exceptions.OnErrorNotImplementedException
                r0.<init>(r2)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class i implements rx.f<T> {
        final /* synthetic */ rx.functions.b a;
        final /* synthetic */ rx.functions.b b;
        final /* synthetic */ rx.functions.a c;
        final /* synthetic */ rx.observables.b d;

        i(rx.observables.b r1, rx.functions.b r2, rx.functions.b r3, rx.functions.a r4) {
                r0 = this;
                r0.d = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.<init>()
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.functions.a r0 = r1.c
                r0.call()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.functions.b r0 = r1.b
                r0.call(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                rx.functions.b r0 = r1.a
                r0.call(r2)
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            rx.observables.b.b = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            rx.observables.b.c = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            rx.observables.b.d = r0
            return
    }

    private b(rx.e<? extends T> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private T a(rx.e<? extends T> r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch
            r3 = 1
            r2.<init>(r3)
            rx.observables.b$c r3 = new rx.observables.b$c
            r3.<init>(r4, r2, r1, r0)
            rx.m r5 = r5.r5(r3)
            rx.internal.util.d.a(r2, r5)
            java.lang.Object r5 = r1.get()
            if (r5 == 0) goto L2b
            java.lang.Object r5 = r1.get()
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            rx.exceptions.a.c(r5)
        L2b:
            java.lang.Object r5 = r0.get()
            return r5
    }

    public static <T> rx.observables.b<T> g(rx.e<? extends T> r1) {
            rx.observables.b r0 = new rx.observables.b
            r0.<init>(r1)
            return r0
    }

    public java.lang.Iterable<T> A() {
            r1 = this;
            rx.observables.b$b r0 = new rx.observables.b$b
            r0.<init>(r1)
            return r0
    }

    public T b() {
            r1 = this;
            rx.e<? extends T> r0 = r1.a
            rx.e r0 = r0.X1()
            java.lang.Object r0 = r1.a(r0)
            return r0
    }

    public T c(rx.functions.p<? super T, java.lang.Boolean> r2) {
            r1 = this;
            rx.e<? extends T> r0 = r1.a
            rx.e r2 = r0.Y1(r2)
            java.lang.Object r2 = r1.a(r2)
            return r2
    }

    public T d(T r3) {
            r2 = this;
            rx.e<? extends T> r0 = r2.a
            rx.functions.p r1 = rx.internal.util.n.c()
            rx.e r0 = r0.c3(r1)
            rx.e r3 = r0.Z1(r3)
            java.lang.Object r3 = r2.a(r3)
            return r3
    }

    public T e(T r2, rx.functions.p<? super T, java.lang.Boolean> r3) {
            r1 = this;
            rx.e<? extends T> r0 = r1.a
            rx.e r3 = r0.V1(r3)
            rx.functions.p r0 = rx.internal.util.n.c()
            rx.e r3 = r3.c3(r0)
            rx.e r2 = r3.Z1(r2)
            java.lang.Object r2 = r1.a(r2)
            return r2
    }

    public void f(rx.functions.b<? super T> r5) {
            r4 = this;
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            rx.e<? extends T> r2 = r4.a
            rx.observables.b$a r3 = new rx.observables.b$a
            r3.<init>(r4, r0, r1, r5)
            rx.m r5 = r2.r5(r3)
            rx.internal.util.d.a(r0, r5)
            java.lang.Object r5 = r1.get()
            if (r5 == 0) goto L28
            java.lang.Object r5 = r1.get()
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            rx.exceptions.a.c(r5)
        L28:
            return
    }

    public java.util.Iterator<T> h() {
            r1 = this;
            rx.e<? extends T> r0 = r1.a
            java.util.Iterator r0 = rx.internal.operators.f.a(r0)
            return r0
    }

    public T i() {
            r1 = this;
            rx.e<? extends T> r0 = r1.a
            rx.e r0 = r0.W2()
            java.lang.Object r0 = r1.a(r0)
            return r0
    }

    public T j(rx.functions.p<? super T, java.lang.Boolean> r2) {
            r1 = this;
            rx.e<? extends T> r0 = r1.a
            rx.e r2 = r0.X2(r2)
            java.lang.Object r2 = r1.a(r2)
            return r2
    }

    public T k(T r3) {
            r2 = this;
            rx.e<? extends T> r0 = r2.a
            rx.functions.p r1 = rx.internal.util.n.c()
            rx.e r0 = r0.c3(r1)
            rx.e r3 = r0.Y2(r3)
            java.lang.Object r3 = r2.a(r3)
            return r3
    }

    public T l(T r2, rx.functions.p<? super T, java.lang.Boolean> r3) {
            r1 = this;
            rx.e<? extends T> r0 = r1.a
            rx.e r3 = r0.V1(r3)
            rx.functions.p r0 = rx.internal.util.n.c()
            rx.e r3 = r3.c3(r0)
            rx.e r2 = r3.Y2(r2)
            java.lang.Object r2 = r1.a(r2)
            return r2
    }

    public java.lang.Iterable<T> m() {
            r1 = this;
            rx.e<? extends T> r0 = r1.a
            java.lang.Iterable r0 = rx.internal.operators.b.a(r0)
            return r0
    }

    public java.lang.Iterable<T> n(T r2) {
            r1 = this;
            rx.e<? extends T> r0 = r1.a
            java.lang.Iterable r2 = rx.internal.operators.c.a(r0, r2)
            return r2
    }

    public java.lang.Iterable<T> o() {
            r1 = this;
            rx.e<? extends T> r0 = r1.a
            java.lang.Iterable r0 = rx.internal.operators.d.a(r0)
            return r0
    }

    public T p() {
            r1 = this;
            rx.e<? extends T> r0 = r1.a
            rx.e r0 = r0.Q4()
            java.lang.Object r0 = r1.a(r0)
            return r0
    }

    public T q(rx.functions.p<? super T, java.lang.Boolean> r2) {
            r1 = this;
            rx.e<? extends T> r0 = r1.a
            rx.e r2 = r0.R4(r2)
            java.lang.Object r2 = r1.a(r2)
            return r2
    }

    public T r(T r3) {
            r2 = this;
            rx.e<? extends T> r0 = r2.a
            rx.functions.p r1 = rx.internal.util.n.c()
            rx.e r0 = r0.c3(r1)
            rx.e r3 = r0.S4(r3)
            java.lang.Object r3 = r2.a(r3)
            return r3
    }

    public T s(T r2, rx.functions.p<? super T, java.lang.Boolean> r3) {
            r1 = this;
            rx.e<? extends T> r0 = r1.a
            rx.e r3 = r0.V1(r3)
            rx.functions.p r0 = rx.internal.util.n.c()
            rx.e r3 = r3.c3(r0)
            rx.e r2 = r3.S4(r2)
            java.lang.Object r2 = r1.a(r2)
            return r2
    }

    public void t() {
            r5 = this;
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
            r2 = 0
            r3 = 0
            r1[r2] = r3
            rx.e<? extends T> r3 = r5.a
            rx.observables.b$d r4 = new rx.observables.b$d
            r4.<init>(r5, r1, r0)
            rx.m r3 = r3.r5(r4)
            rx.internal.util.d.a(r0, r3)
            r0 = r1[r2]
            if (r0 == 0) goto L21
            rx.exceptions.a.c(r0)
        L21:
            return
    }

    public void u(rx.f<? super T> r4) {
            r3 = this;
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            rx.e<? extends T> r1 = r3.a
            rx.observables.b$e r2 = new rx.observables.b$e
            r2.<init>(r3, r0)
            rx.m r1 = r1.r5(r2)
        L10:
            java.lang.Object r2 = r0.poll()     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
            if (r2 != 0) goto L1f
            java.lang.Object r2 = r0.take()     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
            goto L1f
        L1b:
            r4 = move-exception
            goto L37
        L1d:
            r0 = move-exception
            goto L29
        L1f:
            boolean r2 = rx.internal.operators.v.a(r4, r2)     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
            if (r2 == 0) goto L10
            r1.unsubscribe()
            return
        L29:
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L1b
            r2.interrupt()     // Catch: java.lang.Throwable -> L1b
            r4.onError(r0)     // Catch: java.lang.Throwable -> L1b
            r1.unsubscribe()
            return
        L37:
            r1.unsubscribe()
            throw r4
    }

    public void v(rx.l<? super T> r7) {
            r6 = this;
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            r1 = 1
            rx.g[] r1 = new rx.g[r1]
            r2 = 0
            r3 = 0
            r1[r2] = r3
            rx.observables.b$f r3 = new rx.observables.b$f
            r3.<init>(r6, r0, r1)
            r7.add(r3)
            rx.observables.b$g r4 = new rx.observables.b$g
            r4.<init>(r6, r0)
            rx.m r4 = rx.subscriptions.f.a(r4)
            r7.add(r4)
            rx.e<? extends T> r4 = r6.a
            r4.r5(r3)
        L25:
            boolean r4 = r7.isUnsubscribed()     // Catch: java.lang.Throwable -> L37 java.lang.InterruptedException -> L39
            if (r4 == 0) goto L2c
            goto L62
        L2c:
            java.lang.Object r4 = r0.poll()     // Catch: java.lang.Throwable -> L37 java.lang.InterruptedException -> L39
            if (r4 != 0) goto L3b
            java.lang.Object r4 = r0.take()     // Catch: java.lang.Throwable -> L37 java.lang.InterruptedException -> L39
            goto L3b
        L37:
            r7 = move-exception
            goto L74
        L39:
            r0 = move-exception
            goto L66
        L3b:
            boolean r5 = r7.isUnsubscribed()     // Catch: java.lang.Throwable -> L37 java.lang.InterruptedException -> L39
            if (r5 != 0) goto L62
            java.lang.Object r5 = rx.observables.b.d     // Catch: java.lang.Throwable -> L37 java.lang.InterruptedException -> L39
            if (r4 != r5) goto L46
            goto L62
        L46:
            java.lang.Object r5 = rx.observables.b.b     // Catch: java.lang.Throwable -> L37 java.lang.InterruptedException -> L39
            if (r4 != r5) goto L4e
            r7.onStart()     // Catch: java.lang.Throwable -> L37 java.lang.InterruptedException -> L39
            goto L25
        L4e:
            java.lang.Object r5 = rx.observables.b.c     // Catch: java.lang.Throwable -> L37 java.lang.InterruptedException -> L39
            if (r4 != r5) goto L58
            r4 = r1[r2]     // Catch: java.lang.Throwable -> L37 java.lang.InterruptedException -> L39
            r7.setProducer(r4)     // Catch: java.lang.Throwable -> L37 java.lang.InterruptedException -> L39
            goto L25
        L58:
            boolean r4 = rx.internal.operators.v.a(r7, r4)     // Catch: java.lang.Throwable -> L37 java.lang.InterruptedException -> L39
            if (r4 == 0) goto L25
            r3.unsubscribe()
            return
        L62:
            r3.unsubscribe()
            return
        L66:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L37
            r1.interrupt()     // Catch: java.lang.Throwable -> L37
            r7.onError(r0)     // Catch: java.lang.Throwable -> L37
            r3.unsubscribe()
            return
        L74:
            r3.unsubscribe()
            throw r7
    }

    public void w(rx.functions.b<? super T> r3) {
            r2 = this;
            rx.observables.b$h r0 = new rx.observables.b$h
            r0.<init>(r2)
            rx.functions.m$m r1 = rx.functions.m.a()
            r2.y(r3, r0, r1)
            return
    }

    public void x(rx.functions.b<? super T> r2, rx.functions.b<? super java.lang.Throwable> r3) {
            r1 = this;
            rx.functions.m$m r0 = rx.functions.m.a()
            r1.y(r2, r3, r0)
            return
    }

    public void y(rx.functions.b<? super T> r2, rx.functions.b<? super java.lang.Throwable> r3, rx.functions.a r4) {
            r1 = this;
            rx.observables.b$i r0 = new rx.observables.b$i
            r0.<init>(r1, r2, r3, r4)
            r1.u(r0)
            return
    }

    public java.util.concurrent.Future<T> z() {
            r1 = this;
            rx.e<? extends T> r0 = r1.a
            java.util.concurrent.Future r0 = rx.internal.operators.e.a(r0)
            return r0
    }
}
