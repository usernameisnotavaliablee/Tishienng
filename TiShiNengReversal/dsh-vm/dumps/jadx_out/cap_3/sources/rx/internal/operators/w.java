package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class w<T> implements rx.e.a<T> {
    final java.lang.Iterable<? extends rx.e<? extends T>> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.functions.a {
        final /* synthetic */ rx.internal.operators.w.d a;
        final /* synthetic */ rx.internal.operators.w b;

        a(rx.internal.operators.w r1, rx.internal.operators.w.d r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void call() {
                r1 = this;
                rx.internal.operators.w$d r0 = r1.a
                java.lang.Object r0 = r0.get()
                rx.internal.operators.w$c r0 = (rx.internal.operators.w.c) r0
                if (r0 == 0) goto Ld
                r0.unsubscribe()
            Ld:
                rx.internal.operators.w$d r0 = r1.a
                java.util.Collection<rx.internal.operators.w$c<T>> r0 = r0.a
                rx.internal.operators.w.j(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements rx.g {
        final /* synthetic */ rx.internal.operators.w.d a;
        final /* synthetic */ rx.internal.operators.w b;

        b(rx.internal.operators.w r1, rx.internal.operators.w.d r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void request(long r4) {
                r3 = this;
                rx.internal.operators.w$d r0 = r3.a
                java.lang.Object r0 = r0.get()
                rx.internal.operators.w$c r0 = (rx.internal.operators.w.c) r0
                if (r0 == 0) goto Le
                rx.internal.operators.w.c.g(r0, r4)
                return
            Le:
                rx.internal.operators.w$d r0 = r3.a
                java.util.Collection<rx.internal.operators.w$c<T>> r0 = r0.a
                java.util.Iterator r0 = r0.iterator()
            L16:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L38
                java.lang.Object r1 = r0.next()
                rx.internal.operators.w$c r1 = (rx.internal.operators.w.c) r1
                boolean r2 = r1.isUnsubscribed()
                if (r2 != 0) goto L16
                rx.internal.operators.w$d r2 = r3.a
                java.lang.Object r2 = r2.get()
                if (r2 != r1) goto L34
                rx.internal.operators.w.c.g(r1, r4)
                return
            L34:
                rx.internal.operators.w.c.g(r1, r4)
                goto L16
            L38:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c<T> extends rx.l<T> {
        private final rx.l<? super T> a;
        private final rx.internal.operators.w.d<T> b;
        private boolean c;

        c(long r1, rx.l<? super T> r3, rx.internal.operators.w.d<T> r4) {
                r0 = this;
                r0.<init>()
                r0.a = r3
                r0.b = r4
                r0.request(r1)
                return
        }

        static /* synthetic */ void g(rx.internal.operators.w.c r0, long r1) {
                r0.s(r1)
                return
        }

        private boolean j() {
                r3 = this;
                boolean r0 = r3.c
                r1 = 1
                if (r0 == 0) goto L6
                return r1
            L6:
                rx.internal.operators.w$d<T> r0 = r3.b
                java.lang.Object r0 = r0.get()
                if (r0 != r3) goto L11
                r3.c = r1
                return r1
            L11:
                rx.internal.operators.w$d<T> r0 = r3.b
                r2 = 0
                boolean r0 = r0.compareAndSet(r2, r3)
                if (r0 == 0) goto L22
                rx.internal.operators.w$d<T> r0 = r3.b
                r0.b(r3)
                r3.c = r1
                return r1
            L22:
                rx.internal.operators.w$d<T> r0 = r3.b
                r0.a()
                r0 = 0
                return r0
        }

        private void s(long r1) {
                r0 = this;
                r0.request(r1)
                return
        }

        public void onCompleted() {
                r1 = this;
                boolean r0 = r1.j()
                if (r0 == 0) goto Lb
                rx.l<? super T> r0 = r1.a
                r0.onCompleted()
            Lb:
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.j()
                if (r0 == 0) goto Lb
                rx.l<? super T> r0 = r1.a
                r0.onError(r2)
            Lb:
                return
        }

        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.j()
                if (r0 == 0) goto Lb
                rx.l<? super T> r0 = r1.a
                r0.onNext(r2)
            Lb:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class d<T> extends java.util.concurrent.atomic.AtomicReference<rx.internal.operators.w.c<T>> {
        final java.util.Collection<rx.internal.operators.w.c<T>> a;

        d() {
                r1 = this;
                r1.<init>()
                java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
                r0.<init>()
                r1.a = r0
                return
        }

        public void a() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                rx.internal.operators.w$c r0 = (rx.internal.operators.w.c) r0
                if (r0 == 0) goto Lb
                r1.b(r0)
            Lb:
                return
        }

        public void b(rx.internal.operators.w.c<T> r3) {
                r2 = this;
                java.util.Collection<rx.internal.operators.w$c<T>> r0 = r2.a
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L18
                java.lang.Object r1 = r0.next()
                rx.internal.operators.w$c r1 = (rx.internal.operators.w.c) r1
                if (r1 == r3) goto L6
                r1.unsubscribe()
                goto L6
            L18:
                java.util.Collection<rx.internal.operators.w$c<T>> r3 = r2.a
                r3.clear()
                return
        }
    }

    private w(java.lang.Iterable<? extends rx.e<? extends T>> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static <T> rx.e.a<T> a(java.lang.Iterable<? extends rx.e<? extends T>> r1) {
            rx.internal.operators.w r0 = new rx.internal.operators.w
            r0.<init>(r1)
            return r0
    }

    public static <T> rx.e.a<T> b(rx.e<? extends T> r1, rx.e<? extends T> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r1)
            r0.add(r2)
            rx.e$a r1 = a(r0)
            return r1
    }

    public static <T> rx.e.a<T> c(rx.e<? extends T> r1, rx.e<? extends T> r2, rx.e<? extends T> r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r1)
            r0.add(r2)
            r0.add(r3)
            rx.e$a r1 = a(r0)
            return r1
    }

    public static <T> rx.e.a<T> d(rx.e<? extends T> r1, rx.e<? extends T> r2, rx.e<? extends T> r3, rx.e<? extends T> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r1)
            r0.add(r2)
            r0.add(r3)
            r0.add(r4)
            rx.e$a r1 = a(r0)
            return r1
    }

    public static <T> rx.e.a<T> e(rx.e<? extends T> r1, rx.e<? extends T> r2, rx.e<? extends T> r3, rx.e<? extends T> r4, rx.e<? extends T> r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r1)
            r0.add(r2)
            r0.add(r3)
            r0.add(r4)
            r0.add(r5)
            rx.e$a r1 = a(r0)
            return r1
    }

    public static <T> rx.e.a<T> f(rx.e<? extends T> r1, rx.e<? extends T> r2, rx.e<? extends T> r3, rx.e<? extends T> r4, rx.e<? extends T> r5, rx.e<? extends T> r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r1)
            r0.add(r2)
            r0.add(r3)
            r0.add(r4)
            r0.add(r5)
            r0.add(r6)
            rx.e$a r1 = a(r0)
            return r1
    }

    public static <T> rx.e.a<T> g(rx.e<? extends T> r1, rx.e<? extends T> r2, rx.e<? extends T> r3, rx.e<? extends T> r4, rx.e<? extends T> r5, rx.e<? extends T> r6, rx.e<? extends T> r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r1)
            r0.add(r2)
            r0.add(r3)
            r0.add(r4)
            r0.add(r5)
            r0.add(r6)
            r0.add(r7)
            rx.e$a r1 = a(r0)
            return r1
    }

    public static <T> rx.e.a<T> h(rx.e<? extends T> r1, rx.e<? extends T> r2, rx.e<? extends T> r3, rx.e<? extends T> r4, rx.e<? extends T> r5, rx.e<? extends T> r6, rx.e<? extends T> r7, rx.e<? extends T> r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r1)
            r0.add(r2)
            r0.add(r3)
            r0.add(r4)
            r0.add(r5)
            r0.add(r6)
            r0.add(r7)
            r0.add(r8)
            rx.e$a r1 = a(r0)
            return r1
    }

    public static <T> rx.e.a<T> i(rx.e<? extends T> r1, rx.e<? extends T> r2, rx.e<? extends T> r3, rx.e<? extends T> r4, rx.e<? extends T> r5, rx.e<? extends T> r6, rx.e<? extends T> r7, rx.e<? extends T> r8, rx.e<? extends T> r9) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r1)
            r0.add(r2)
            r0.add(r3)
            r0.add(r4)
            r0.add(r5)
            r0.add(r6)
            r0.add(r7)
            r0.add(r8)
            r0.add(r9)
            rx.e$a r1 = a(r0)
            return r1
    }

    static <T> void j(java.util.Collection<rx.internal.operators.w.c<T>> r2) {
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L1d
            java.util.Iterator r0 = r2.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            rx.internal.operators.w$c r1 = (rx.internal.operators.w.c) r1
            r1.unsubscribe()
            goto La
        L1a:
            r2.clear()
        L1d:
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super T> r7) {
            r6 = this;
            rx.internal.operators.w$d r0 = new rx.internal.operators.w$d
            r0.<init>()
            rx.internal.operators.w$a r1 = new rx.internal.operators.w$a
            r1.<init>(r6, r0)
            rx.m r1 = rx.subscriptions.f.a(r1)
            r7.add(r1)
            java.lang.Iterable<? extends rx.e<? extends T>> r1 = r6.a
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L46
            java.lang.Object r2 = r1.next()
            rx.e r2 = (rx.e) r2
            boolean r3 = r7.isUnsubscribed()
            if (r3 == 0) goto L2a
            goto L46
        L2a:
            rx.internal.operators.w$c r3 = new rx.internal.operators.w$c
            r4 = 0
            r3.<init>(r4, r7, r0)
            java.util.Collection<rx.internal.operators.w$c<T>> r4 = r0.a
            r4.add(r3)
            java.lang.Object r4 = r0.get()
            rx.internal.operators.w$c r4 = (rx.internal.operators.w.c) r4
            if (r4 == 0) goto L42
            r0.b(r4)
            return
        L42:
            r2.J6(r3)
            goto L17
        L46:
            boolean r1 = r7.isUnsubscribed()
            if (r1 == 0) goto L51
            java.util.Collection<rx.internal.operators.w$c<T>> r1 = r0.a
            j(r1)
        L51:
            rx.internal.operators.w$b r1 = new rx.internal.operators.w$b
            r1.<init>(r6, r0)
            r7.setProducer(r1)
            return
    }
}
