package rx.observables;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class e<S, T> implements rx.e.a<T> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements rx.functions.q<S, rx.f<? super T>, S> {
        final /* synthetic */ rx.functions.c a;

        a(rx.functions.c r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                rx.f r2 = (rx.f) r2
                java.lang.Object r1 = r0.call(r1, r2)
                return r1
        }

        public S call(S r2, rx.f<? super T> r3) {
                r1 = this;
                rx.functions.c r0 = r1.a
                r0.call(r2, r3)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b implements rx.functions.q<S, rx.f<? super T>, S> {
        final /* synthetic */ rx.functions.c a;

        b(rx.functions.c r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                rx.f r2 = (rx.f) r2
                java.lang.Object r1 = r0.call(r1, r2)
                return r1
        }

        public S call(S r2, rx.f<? super T> r3) {
                r1 = this;
                rx.functions.c r0 = r1.a
                r0.call(r2, r3)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class c implements rx.functions.q<java.lang.Void, rx.f<? super T>, java.lang.Void> {
        final /* synthetic */ rx.functions.b a;

        c(rx.functions.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Void r1 = (java.lang.Void) r1
                rx.f r2 = (rx.f) r2
                java.lang.Void r1 = r0.call(r1, r2)
                return r1
        }

        public java.lang.Void call(java.lang.Void r2, rx.f<? super T> r3) {
                r1 = this;
                rx.functions.b r0 = r1.a
                r0.call(r3)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class d implements rx.functions.q<java.lang.Void, rx.f<? super T>, java.lang.Void> {
        final /* synthetic */ rx.functions.b a;

        d(rx.functions.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Void r1 = (java.lang.Void) r1
                rx.f r2 = (rx.f) r2
                java.lang.Void r1 = r0.call(r1, r2)
                return r1
        }

        public java.lang.Void call(java.lang.Void r1, rx.f<? super T> r2) {
                r0 = this;
                rx.functions.b r1 = r0.a
                r1.call(r2)
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: rx.observables.e$e, reason: collision with other inner class name */
    static class C0049e implements rx.functions.b<java.lang.Void> {
        final /* synthetic */ rx.functions.a a;

        C0049e(rx.functions.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                java.lang.Void r1 = (java.lang.Void) r1
                r0.call(r1)
                return
        }

        public void call(java.lang.Void r1) {
                r0 = this;
                rx.functions.a r1 = r0.a
                r1.call()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class f<S, T> extends java.util.concurrent.atomic.AtomicLong implements rx.g, rx.m, rx.f<T> {
        private static final long serialVersionUID = -3736864024352728072L;
        private final rx.l<? super T> a;
        private final rx.observables.e<S, T> b;
        private boolean c;
        private boolean d;
        private S e;

        f(rx.l<? super T> r1, rx.observables.e<S, T> r2, S r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.e = r3
                return
        }

        private void d() {
                r2 = this;
                rx.observables.e<S, T> r0 = r2.b     // Catch: java.lang.Throwable -> L8
                S r1 = r2.e     // Catch: java.lang.Throwable -> L8
                r0.i(r1)     // Catch: java.lang.Throwable -> L8
                return
            L8:
                r0 = move-exception
                rx.exceptions.a.e(r0)
                rx.plugins.c.I(r0)
                return
        }

        private void e() {
                r3 = this;
                rx.observables.e<S, T> r0 = r3.b
                rx.l<? super T> r1 = r3.a
            L4:
                r2 = 0
                r3.c = r2     // Catch: java.lang.Throwable -> L11
                r3.g(r0)     // Catch: java.lang.Throwable -> L11
                boolean r2 = r3.s()
                if (r2 == 0) goto L4
                return
            L11:
                r0 = move-exception
                r3.f(r1, r0)
                return
        }

        private void f(rx.l<? super T> r2, java.lang.Throwable r3) {
                r1 = this;
                boolean r0 = r1.d
                if (r0 == 0) goto L8
                rx.plugins.c.I(r3)
                return
            L8:
                r0 = 1
                r1.d = r0
                r2.onError(r3)
                r1.unsubscribe()
                return
        }

        private void g(rx.observables.e<S, T> r2) {
                r1 = this;
                S r0 = r1.e
                java.lang.Object r2 = r2.h(r0, r1)
                r1.e = r2
                return
        }

        private void j(long r8) {
                r7 = this;
                rx.observables.e<S, T> r0 = r7.b
                rx.l<? super T> r1 = r7.a
            L4:
                r2 = r8
            L5:
                r4 = 0
                r7.c = r4     // Catch: java.lang.Throwable -> L2c
                r7.g(r0)     // Catch: java.lang.Throwable -> L2c
                boolean r4 = r7.s()
                if (r4 == 0) goto L12
                return
            L12:
                boolean r4 = r7.c
                if (r4 == 0) goto L19
                r4 = 1
                long r2 = r2 - r4
            L19:
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L5
                long r8 = -r8
                long r8 = r7.addAndGet(r8)
                int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r2 > 0) goto L4
                r7.s()
                return
            L2c:
                r8 = move-exception
                r7.f(r1, r8)
                return
        }

        private boolean s() {
                r5 = this;
                boolean r0 = r5.d
                r1 = -1
                if (r0 != 0) goto L11
                long r3 = r5.get()
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 >= 0) goto Lf
                goto L11
            Lf:
                r0 = 0
                return r0
            L11:
                r5.set(r1)
                r5.d()
                r0 = 1
                return r0
        }

        public boolean isUnsubscribed() {
                r5 = this;
                long r0 = r5.get()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 >= 0) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        public void onCompleted() {
                r2 = this;
                boolean r0 = r2.d
                if (r0 != 0) goto L15
                r0 = 1
                r2.d = r0
                rx.l<? super T> r0 = r2.a
                boolean r0 = r0.isUnsubscribed()
                if (r0 != 0) goto L14
                rx.l<? super T> r0 = r2.a
                r0.onCompleted()
            L14:
                return
            L15:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Terminal event already emitted."
                r0.<init>(r1)
                throw r0
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.d
                if (r0 != 0) goto L15
                r0 = 1
                r1.d = r0
                rx.l<? super T> r0 = r1.a
                boolean r0 = r0.isUnsubscribed()
                if (r0 != 0) goto L14
                rx.l<? super T> r0 = r1.a
                r0.onError(r2)
            L14:
                return
            L15:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Terminal event already emitted."
                r2.<init>(r0)
                throw r2
        }

        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.c
                if (r0 != 0) goto Ld
                r0 = 1
                r1.c = r0
                rx.l<? super T> r0 = r1.a
                r0.onNext(r2)
                return
            Ld:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "onNext called multiple times!"
                r2.<init>(r0)
                throw r2
        }

        public void request(long r6) {
                r5 = this;
                r0 = 0
                int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r2 <= 0) goto L1e
                long r2 = rx.internal.operators.a.b(r5, r6)
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L1e
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r2 != 0) goto L1b
                r5.e()
                return
            L1b:
                r5.j(r6)
            L1e:
                return
        }

        public void unsubscribe() {
                r6 = this;
            L0:
                long r0 = r6.get()
                r2 = 0
                r4 = -1
                boolean r2 = r6.compareAndSet(r2, r4)
                if (r2 == 0) goto L12
                r6.d()
                return
            L12:
                r2 = -2
                boolean r0 = r6.compareAndSet(r0, r2)
                if (r0 == 0) goto L0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class g<S, T> extends rx.observables.e<S, T> {
        private final rx.functions.o<? extends S> a;
        private final rx.functions.q<? super S, ? super rx.f<? super T>, ? extends S> b;
        private final rx.functions.b<? super S> c;

        public g(rx.functions.o<? extends S> r2, rx.functions.q<? super S, ? super rx.f<? super T>, ? extends S> r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        g(rx.functions.o<? extends S> r1, rx.functions.q<? super S, ? super rx.f<? super T>, ? extends S> r2, rx.functions.b<? super S> r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                return
        }

        public g(rx.functions.q<S, rx.f<? super T>, S> r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0, r2, r0)
                return
        }

        public g(rx.functions.q<S, rx.f<? super T>, S> r2, rx.functions.b<? super S> r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r0, r2, r3)
                return
        }

        @Override // rx.observables.e
        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                rx.l r1 = (rx.l) r1
                super.call(r1)
                return
        }

        @Override // rx.observables.e
        protected S g() {
                r1 = this;
                rx.functions.o<? extends S> r0 = r1.a
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.Object r0 = r0.call()
                return r0
        }

        @Override // rx.observables.e
        protected S h(S r2, rx.f<? super T> r3) {
                r1 = this;
                rx.functions.q<? super S, ? super rx.f<? super T>, ? extends S> r0 = r1.b
                java.lang.Object r2 = r0.call(r2, r3)
                return r2
        }

        @Override // rx.observables.e
        protected void i(S r2) {
                r1 = this;
                rx.functions.b<? super S> r0 = r1.c
                if (r0 == 0) goto L7
                r0.call(r2)
            L7:
                return
        }
    }

    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <S, T> rx.observables.e<S, T> a(rx.functions.o<? extends S> r1, rx.functions.c<? super S, ? super rx.f<? super T>> r2) {
            rx.observables.e$a r0 = new rx.observables.e$a
            r0.<init>(r2)
            rx.observables.e$g r2 = new rx.observables.e$g
            r2.<init>(r1, r0)
            return r2
    }

    public static <S, T> rx.observables.e<S, T> b(rx.functions.o<? extends S> r1, rx.functions.c<? super S, ? super rx.f<? super T>> r2, rx.functions.b<? super S> r3) {
            rx.observables.e$b r0 = new rx.observables.e$b
            r0.<init>(r2)
            rx.observables.e$g r2 = new rx.observables.e$g
            r2.<init>(r1, r0, r3)
            return r2
    }

    public static <S, T> rx.observables.e<S, T> c(rx.functions.o<? extends S> r1, rx.functions.q<? super S, ? super rx.f<? super T>, ? extends S> r2) {
            rx.observables.e$g r0 = new rx.observables.e$g
            r0.<init>(r1, r2)
            return r0
    }

    public static <S, T> rx.observables.e<S, T> d(rx.functions.o<? extends S> r1, rx.functions.q<? super S, ? super rx.f<? super T>, ? extends S> r2, rx.functions.b<? super S> r3) {
            rx.observables.e$g r0 = new rx.observables.e$g
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static <T> rx.observables.e<java.lang.Void, T> e(rx.functions.b<? super rx.f<? super T>> r1) {
            rx.observables.e$c r0 = new rx.observables.e$c
            r0.<init>(r1)
            rx.observables.e$g r1 = new rx.observables.e$g
            r1.<init>(r0)
            return r1
    }

    public static <T> rx.observables.e<java.lang.Void, T> f(rx.functions.b<? super rx.f<? super T>> r1, rx.functions.a r2) {
            rx.observables.e$d r0 = new rx.observables.e$d
            r0.<init>(r1)
            rx.observables.e$e r1 = new rx.observables.e$e
            r1.<init>(r2)
            rx.observables.e$g r2 = new rx.observables.e$g
            r2.<init>(r0, r1)
            return r2
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public final void call(rx.l<? super T> r3) {
            r2 = this;
            java.lang.Object r0 = r2.g()     // Catch: java.lang.Throwable -> L10
            rx.observables.e$f r1 = new rx.observables.e$f
            r1.<init>(r3, r2, r0)
            r3.add(r1)
            r3.setProducer(r1)
            return
        L10:
            r0 = move-exception
            rx.exceptions.a.e(r0)
            r3.onError(r0)
            return
    }

    protected abstract S g();

    protected abstract S h(S r1, rx.f<? super T> r2);

    protected void i(S r1) {
            r0 = this;
            return
    }
}
