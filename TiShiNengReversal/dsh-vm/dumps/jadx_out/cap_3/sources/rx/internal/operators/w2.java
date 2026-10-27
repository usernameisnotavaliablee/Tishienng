package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class w2<T> extends rx.observables.c<T> implements rx.m {
    static final rx.functions.o e = null;
    final rx.e<? extends T> b;
    final java.util.concurrent.atomic.AtomicReference<rx.internal.operators.w2.l<T>> c;
    final rx.functions.o<? extends rx.internal.operators.w2.k<T>> d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements rx.functions.o {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.Object call() {
                r2 = this;
                rx.internal.operators.w2$o r0 = new rx.internal.operators.w2$o
                r1 = 16
                r0.<init>(r1)
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b<R> implements rx.e.a<R> {
        final /* synthetic */ rx.functions.o a;
        final /* synthetic */ rx.functions.p b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements rx.functions.b<rx.m> {
            final /* synthetic */ rx.l a;
            final /* synthetic */ rx.internal.operators.w2.b b;

            a(rx.internal.operators.w2.b r1, rx.l r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                    r0 = this;
                    rx.m r1 = (rx.m) r1
                    r0.call(r1)
                    return
            }

            public void call(rx.m r2) {
                    r1 = this;
                    rx.l r0 = r1.a
                    r0.add(r2)
                    return
            }
        }

        b(rx.functions.o r1, rx.functions.p r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                rx.l r1 = (rx.l) r1
                r0.call(r1)
                return
        }

        public void call(rx.l<? super R> r3) {
                r2 = this;
                rx.functions.o r0 = r2.a     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L1c
                rx.observables.c r0 = (rx.observables.c) r0     // Catch: java.lang.Throwable -> L1c
                rx.functions.p r1 = r2.b     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r1 = r1.call(r0)     // Catch: java.lang.Throwable -> L1c
                rx.e r1 = (rx.e) r1     // Catch: java.lang.Throwable -> L1c
                r1.r5(r3)
                rx.internal.operators.w2$b$a r1 = new rx.internal.operators.w2$b$a
                r1.<init>(r2, r3)
                r0.A7(r1)
                return
            L1c:
                r0 = move-exception
                rx.exceptions.a.f(r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class c implements rx.e.a<T> {
        final /* synthetic */ rx.e a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends rx.l<T> {
            final /* synthetic */ rx.l a;
            final /* synthetic */ rx.internal.operators.w2.c b;

            a(rx.internal.operators.w2.c r1, rx.l r2, rx.l r3) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r3
                    r0.<init>(r2)
                    return
            }

            public void onCompleted() {
                    r1 = this;
                    rx.l r0 = r1.a
                    r0.onCompleted()
                    return
            }

            public void onError(java.lang.Throwable r2) {
                    r1 = this;
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

        c(rx.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
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
                rx.e r0 = r2.a
                rx.internal.operators.w2$c$a r1 = new rx.internal.operators.w2$c$a
                r1.<init>(r2, r3, r3)
                r0.J6(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class d extends rx.observables.c<T> {
        final /* synthetic */ rx.observables.c b;

        d(rx.e.a r1, rx.observables.c r2) {
                r0 = this;
                r0.b = r2
                r0.<init>(r1)
                return
        }

        @Override // rx.observables.c
        public void A7(rx.functions.b<? super rx.m> r2) {
                r1 = this;
                rx.observables.c r0 = r1.b
                r0.A7(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class e implements rx.functions.o<rx.internal.operators.w2.k<T>> {
        final /* synthetic */ int a;

        e(int r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call() {
                r1 = this;
                rx.internal.operators.w2$k r0 = r1.m22call()
                return r0
        }

        /* renamed from: call, reason: collision with other method in class */
        public rx.internal.operators.w2.k<T> m22call() {
                r2 = this;
                rx.internal.operators.w2$n r0 = new rx.internal.operators.w2$n
                int r1 = r2.a
                r0.<init>(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class f implements rx.functions.o<rx.internal.operators.w2.k<T>> {
        final /* synthetic */ int a;
        final /* synthetic */ long b;
        final /* synthetic */ rx.h c;

        f(int r1, long r2, rx.h r4) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r4
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call() {
                r1 = this;
                rx.internal.operators.w2$k r0 = r1.m23call()
                return r0
        }

        /* renamed from: call, reason: collision with other method in class */
        public rx.internal.operators.w2.k<T> m23call() {
                r5 = this;
                rx.internal.operators.w2$m r0 = new rx.internal.operators.w2$m
                int r1 = r5.a
                long r2 = r5.b
                rx.h r4 = r5.c
                r0.<init>(r1, r2, r4)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class g implements rx.e.a<T> {
        final /* synthetic */ java.util.concurrent.atomic.AtomicReference a;
        final /* synthetic */ rx.functions.o b;

        g(java.util.concurrent.atomic.AtomicReference r1, rx.functions.o r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                rx.l r1 = (rx.l) r1
                r0.call(r1)
                return
        }

        public void call(rx.l<? super T> r4) {
                r3 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference r0 = r3.a
                java.lang.Object r0 = r0.get()
                rx.internal.operators.w2$l r0 = (rx.internal.operators.w2.l) r0
                if (r0 != 0) goto L24
                rx.internal.operators.w2$l r1 = new rx.internal.operators.w2$l
                rx.functions.o r2 = r3.b
                java.lang.Object r2 = r2.call()
                rx.internal.operators.w2$k r2 = (rx.internal.operators.w2.k) r2
                r1.<init>(r2)
                r1.s()
                java.util.concurrent.atomic.AtomicReference r2 = r3.a
                boolean r0 = androidx.camera.view.p.a(r2, r0, r1)
                if (r0 != 0) goto L23
                goto L0
            L23:
                r0 = r1
            L24:
                rx.internal.operators.w2$i r1 = new rx.internal.operators.w2$i
                r1.<init>(r0, r4)
                r0.g(r1)
                r4.add(r1)
                rx.internal.operators.w2$k<T> r0 = r0.a
                r0.a(r1)
                r4.setProducer(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class h<T> extends java.util.concurrent.atomic.AtomicReference<rx.internal.operators.w2.j> implements rx.internal.operators.w2.k<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        rx.internal.operators.w2.j a;
        int b;
        long c;

        public h() {
                r4 = this;
                r4.<init>()
                rx.internal.operators.w2$j r0 = new rx.internal.operators.w2$j
                r1 = 0
                r2 = 0
                r0.<init>(r1, r2)
                r4.a = r0
                r4.set(r0)
                return
        }

        @Override // rx.internal.operators.w2.k
        public final void a(rx.internal.operators.w2.i<T> r12) {
                r11 = this;
                monitor-enter(r12)
                boolean r0 = r12.e     // Catch: java.lang.Throwable -> La
                r1 = 1
                if (r0 == 0) goto Ld
                r12.f = r1     // Catch: java.lang.Throwable -> La
                monitor-exit(r12)     // Catch: java.lang.Throwable -> La
                return
            La:
                r0 = move-exception
                goto Lad
            Ld:
                r12.e = r1     // Catch: java.lang.Throwable -> La
                monitor-exit(r12)     // Catch: java.lang.Throwable -> La
            L10:
                boolean r0 = r12.isUnsubscribed()
                if (r0 == 0) goto L18
                goto L87
            L18:
                java.lang.Object r0 = r12.b()
                rx.internal.operators.w2$j r0 = (rx.internal.operators.w2.j) r0
                if (r0 != 0) goto L2b
                rx.internal.operators.w2$j r0 = r11.e()
                r12.c = r0
                long r1 = r0.b
                r12.a(r1)
            L2b:
                boolean r1 = r12.isUnsubscribed()
                if (r1 == 0) goto L32
                goto L87
            L32:
                rx.l<? super T> r1 = r12.b
                if (r1 != 0) goto L37
                goto L87
            L37:
                long r2 = r12.get()
                r4 = 0
                r6 = r4
            L3e:
                int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r8 == 0) goto L88
                java.lang.Object r8 = r0.get()
                rx.internal.operators.w2$j r8 = (rx.internal.operators.w2.j) r8
                if (r8 == 0) goto L88
                java.lang.Object r0 = r8.a
                java.lang.Object r0 = r11.h(r0)
                r9 = 0
                boolean r10 = rx.internal.operators.v.a(r1, r0)     // Catch: java.lang.Throwable -> L5a
                if (r10 == 0) goto L5c
                r12.c = r9     // Catch: java.lang.Throwable -> L5a
                return
            L5a:
                r2 = move-exception
                goto L68
            L5c:
                r9 = 1
                long r6 = r6 + r9
                boolean r0 = r12.isUnsubscribed()
                if (r0 == 0) goto L66
                goto L87
            L66:
                r0 = r8
                goto L3e
            L68:
                r12.c = r9
                rx.exceptions.a.e(r2)
                r12.unsubscribe()
                boolean r12 = rx.internal.operators.v.g(r0)
                if (r12 != 0) goto L87
                boolean r12 = rx.internal.operators.v.f(r0)
                if (r12 != 0) goto L87
                java.lang.Object r12 = rx.internal.operators.v.e(r0)
                java.lang.Throwable r12 = rx.exceptions.OnErrorThrowable.addValueAsLastCause(r2, r12)
                r1.onError(r12)
            L87:
                return
            L88:
                int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r1 == 0) goto L9a
                r12.c = r0
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 == 0) goto L9a
                r12.d(r6)
            L9a:
                monitor-enter(r12)
                boolean r0 = r12.f     // Catch: java.lang.Throwable -> La4
                r1 = 0
                if (r0 != 0) goto La6
                r12.e = r1     // Catch: java.lang.Throwable -> La4
                monitor-exit(r12)     // Catch: java.lang.Throwable -> La4
                return
            La4:
                r0 = move-exception
                goto Lab
            La6:
                r12.f = r1     // Catch: java.lang.Throwable -> La4
                monitor-exit(r12)     // Catch: java.lang.Throwable -> La4
                goto L10
            Lab:
                monitor-exit(r12)     // Catch: java.lang.Throwable -> La4
                throw r0
            Lad:
                monitor-exit(r12)     // Catch: java.lang.Throwable -> La
                throw r0
        }

        final void b(rx.internal.operators.w2.j r2) {
                r1 = this;
                rx.internal.operators.w2$j r0 = r1.a
                r0.set(r2)
                r1.a = r2
                int r2 = r1.b
                int r2 = r2 + 1
                r1.b = r2
                return
        }

        final void c(java.util.Collection<? super T> r4) {
                r3 = this;
                rx.internal.operators.w2$j r0 = r3.e()
            L4:
                java.lang.Object r0 = r0.get()
                rx.internal.operators.w2$j r0 = (rx.internal.operators.w2.j) r0
                if (r0 == 0) goto L27
                java.lang.Object r1 = r0.a
                java.lang.Object r1 = r3.h(r1)
                boolean r2 = rx.internal.operators.v.f(r1)
                if (r2 != 0) goto L27
                boolean r2 = rx.internal.operators.v.g(r1)
                if (r2 == 0) goto L1f
                goto L27
            L1f:
                java.lang.Object r1 = rx.internal.operators.v.e(r1)
                r4.add(r1)
                goto L4
            L27:
                return
        }

        @Override // rx.internal.operators.w2.k
        public final void complete() {
                r6 = this;
                java.lang.Object r0 = rx.internal.operators.v.b()
                java.lang.Object r0 = r6.d(r0)
                rx.internal.operators.w2$j r1 = new rx.internal.operators.w2$j
                long r2 = r6.c
                r4 = 1
                long r2 = r2 + r4
                r6.c = r2
                r1.<init>(r0, r2)
                r6.b(r1)
                r6.m()
                return
        }

        java.lang.Object d(java.lang.Object r1) {
                r0 = this;
                return r1
        }

        rx.internal.operators.w2.j e() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                rx.internal.operators.w2$j r0 = (rx.internal.operators.w2.j) r0
                return r0
        }

        @Override // rx.internal.operators.w2.k
        public final void error(java.lang.Throwable r6) {
                r5 = this;
                java.lang.Object r6 = rx.internal.operators.v.c(r6)
                java.lang.Object r6 = r5.d(r6)
                rx.internal.operators.w2$j r0 = new rx.internal.operators.w2$j
                long r1 = r5.c
                r3 = 1
                long r1 = r1 + r3
                r5.c = r1
                r0.<init>(r6, r1)
                r5.b(r0)
                r5.m()
                return
        }

        boolean f() {
                r1 = this;
                rx.internal.operators.w2$j r0 = r1.a
                java.lang.Object r0 = r0.a
                if (r0 == 0) goto L12
                java.lang.Object r0 = r1.h(r0)
                boolean r0 = rx.internal.operators.v.f(r0)
                if (r0 == 0) goto L12
                r0 = 1
                return r0
            L12:
                r0 = 0
                return r0
        }

        boolean g() {
                r1 = this;
                rx.internal.operators.w2$j r0 = r1.a
                java.lang.Object r0 = r0.a
                if (r0 == 0) goto L12
                java.lang.Object r0 = r1.h(r0)
                boolean r0 = rx.internal.operators.v.g(r0)
                if (r0 == 0) goto L12
                r0 = 1
                return r0
            L12:
                r0 = 0
                return r0
        }

        java.lang.Object h(java.lang.Object r1) {
                r0 = this;
                return r1
        }

        final void i() {
                r2 = this;
                java.lang.Object r0 = r2.get()
                rx.internal.operators.w2$j r0 = (rx.internal.operators.w2.j) r0
                java.lang.Object r0 = r0.get()
                rx.internal.operators.w2$j r0 = (rx.internal.operators.w2.j) r0
                if (r0 == 0) goto L18
                int r1 = r2.b
                int r1 = r1 + (-1)
                r2.b = r1
                r2.k(r0)
                return
            L18:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Empty list!"
                r0.<init>(r1)
                throw r0
        }

        final void j(int r3) {
                r2 = this;
                java.lang.Object r0 = r2.get()
                rx.internal.operators.w2$j r0 = (rx.internal.operators.w2.j) r0
            L6:
                if (r3 <= 0) goto L17
                java.lang.Object r0 = r0.get()
                rx.internal.operators.w2$j r0 = (rx.internal.operators.w2.j) r0
                int r3 = r3 + (-1)
                int r1 = r2.b
                int r1 = r1 + (-1)
                r2.b = r1
                goto L6
            L17:
                r2.k(r0)
                return
        }

        final void k(rx.internal.operators.w2.j r1) {
                r0 = this;
                r0.set(r1)
                return
        }

        void l() {
                r0 = this;
                return
        }

        void m() {
                r0 = this;
                return
        }

        @Override // rx.internal.operators.w2.k
        public final void next(T r6) {
                r5 = this;
                java.lang.Object r6 = rx.internal.operators.v.j(r6)
                java.lang.Object r6 = r5.d(r6)
                rx.internal.operators.w2$j r0 = new rx.internal.operators.w2$j
                long r1 = r5.c
                r3 = 1
                long r1 = r1 + r3
                r5.c = r1
                r0.<init>(r6, r1)
                r5.b(r0)
                r5.l()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class i<T> extends java.util.concurrent.atomic.AtomicLong implements rx.g, rx.m {
        static final long g = Long.MIN_VALUE;
        private static final long serialVersionUID = -4453897557930727610L;
        final rx.internal.operators.w2.l<T> a;
        rx.l<? super T> b;
        java.lang.Object c;
        final java.util.concurrent.atomic.AtomicLong d;
        boolean e;
        boolean f;

        public i(rx.internal.operators.w2.l<T> r1, rx.l<? super T> r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.d = r1
                return
        }

        void a(long r8) {
                r7 = this;
            L0:
                java.util.concurrent.atomic.AtomicLong r0 = r7.d
                long r0 = r0.get()
                long r2 = r0 + r8
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 >= 0) goto L13
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L13:
                java.util.concurrent.atomic.AtomicLong r4 = r7.d
                boolean r0 = r4.compareAndSet(r0, r2)
                if (r0 == 0) goto L0
                return
        }

        <U> U b() {
                r1 = this;
                java.lang.Object r0 = r1.c
                return r0
        }

        public long d(long r8) {
                r7 = this;
                r0 = 0
                int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r2 <= 0) goto L42
            L6:
                long r2 = r7.get()
                r4 = -9223372036854775808
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L11
                return r4
            L11:
                long r4 = r2 - r8
                int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r6 < 0) goto L1e
                boolean r2 = r7.compareAndSet(r2, r4)
                if (r2 == 0) goto L6
                return r4
            L1e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "More produced ("
                r1.append(r4)
                r1.append(r8)
                java.lang.String r8 = ") than requested ("
                r1.append(r8)
                r1.append(r2)
                java.lang.String r8 = ")"
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                r0.<init>(r8)
                throw r0
            L42:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r9 = "Cant produce zero or less"
                r8.<init>(r9)
                throw r8
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

        public void request(long r9) {
                r8 = this;
                r0 = 0
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 >= 0) goto L7
                goto L18
            L7:
                long r3 = r8.get()
                r5 = -9223372036854775808
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 != 0) goto L12
                goto L18
            L12:
                int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r5 < 0) goto L19
                if (r2 != 0) goto L19
            L18:
                return
            L19:
                long r5 = r3 + r9
                int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r7 >= 0) goto L24
                r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L24:
                boolean r3 = r8.compareAndSet(r3, r5)
                if (r3 == 0) goto L7
                r8.a(r9)
                rx.internal.operators.w2$l<T> r9 = r8.a
                r9.B(r8)
                rx.internal.operators.w2$l<T> r9 = r8.a
                rx.internal.operators.w2$k<T> r9 = r9.a
                r9.a(r8)
                return
        }

        public void unsubscribe() {
                r5 = this;
                long r0 = r5.get()
                r2 = -9223372036854775808
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L1f
                long r0 = r5.getAndSet(r2)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L1f
                rx.internal.operators.w2$l<T> r0 = r5.a
                r0.G(r5)
                rx.internal.operators.w2$l<T> r0 = r5.a
                r0.B(r5)
                r0 = 0
                r5.b = r0
            L1f:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class j extends java.util.concurrent.atomic.AtomicReference<rx.internal.operators.w2.j> {
        private static final long serialVersionUID = 245354315435971818L;
        final java.lang.Object a;
        final long b;

        public j(java.lang.Object r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface k<T> {
        void a(rx.internal.operators.w2.i<T> r1);

        void complete();

        void error(java.lang.Throwable r1);

        void next(T r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class l<T> extends rx.l<T> implements rx.m {
        static final rx.internal.operators.w2.i[] p = null;
        static final rx.internal.operators.w2.i[] q = null;
        final rx.internal.operators.w2.k<T> a;
        boolean b;
        volatile boolean c;
        final rx.internal.util.h<rx.internal.operators.w2.i<T>> d;
        rx.internal.operators.w2.i<T>[] e;
        volatile long f;
        long g;
        final java.util.concurrent.atomic.AtomicBoolean h;
        boolean i;
        boolean j;
        long k;
        long l;
        volatile rx.g m;
        java.util.List<rx.internal.operators.w2.i<T>> n;
        boolean o;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements rx.functions.a {
            final /* synthetic */ rx.internal.operators.w2.l a;

            a(rx.internal.operators.w2.l r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void call() {
                    r6 = this;
                    rx.internal.operators.w2$l r0 = r6.a
                    boolean r0 = r0.c
                    if (r0 != 0) goto L2d
                    rx.internal.operators.w2$l r0 = r6.a
                    rx.internal.util.h<rx.internal.operators.w2$i<T>> r0 = r0.d
                    monitor-enter(r0)
                    rx.internal.operators.w2$l r1 = r6.a     // Catch: java.lang.Throwable -> L27
                    boolean r1 = r1.c     // Catch: java.lang.Throwable -> L27
                    if (r1 != 0) goto L29
                    rx.internal.operators.w2$l r1 = r6.a     // Catch: java.lang.Throwable -> L27
                    rx.internal.util.h<rx.internal.operators.w2$i<T>> r1 = r1.d     // Catch: java.lang.Throwable -> L27
                    r1.h()     // Catch: java.lang.Throwable -> L27
                    rx.internal.operators.w2$l r1 = r6.a     // Catch: java.lang.Throwable -> L27
                    long r2 = r1.f     // Catch: java.lang.Throwable -> L27
                    r4 = 1
                    long r2 = r2 + r4
                    r1.f = r2     // Catch: java.lang.Throwable -> L27
                    rx.internal.operators.w2$l r1 = r6.a     // Catch: java.lang.Throwable -> L27
                    r2 = 1
                    r1.c = r2     // Catch: java.lang.Throwable -> L27
                    goto L29
                L27:
                    r1 = move-exception
                    goto L2b
                L29:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
                    return
                L2b:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
                    throw r1
                L2d:
                    return
            }
        }

        static {
                r0 = 0
                rx.internal.operators.w2$i[] r1 = new rx.internal.operators.w2.i[r0]
                rx.internal.operators.w2.l.p = r1
                rx.internal.operators.w2$i[] r0 = new rx.internal.operators.w2.i[r0]
                rx.internal.operators.w2.l.q = r0
                return
        }

        public l(rx.internal.operators.w2.k<T> r3) {
                r2 = this;
                r2.<init>()
                r2.a = r3
                rx.internal.util.h r3 = new rx.internal.util.h
                r3.<init>()
                r2.d = r3
                rx.internal.operators.w2$i[] r3 = rx.internal.operators.w2.l.p
                r2.e = r3
                java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
                r3.<init>()
                r2.h = r3
                r0 = 0
                r2.request(r0)
                return
        }

        void A(long r7, long r9) {
                r6 = this;
                long r0 = r6.l
                rx.g r2 = r6.m
                long r9 = r7 - r9
                r3 = 0
                int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r5 == 0) goto L2c
                r6.k = r7
                if (r2 == 0) goto L1f
                int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r7 == 0) goto L1b
                r6.l = r3
                long r0 = r0 + r9
                r2.request(r0)
                return
            L1b:
                r2.request(r9)
                return
            L1f:
                long r0 = r0 + r9
                int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r7 >= 0) goto L29
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L29:
                r6.l = r0
                return
            L2c:
                int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r7 == 0) goto L37
                if (r2 == 0) goto L37
                r6.l = r3
                r2.request(r0)
            L37:
                return
        }

        void B(rx.internal.operators.w2.i<T> r10) {
                r9 = this;
                boolean r0 = r9.isUnsubscribed()
                if (r0 == 0) goto L7
                goto L5f
            L7:
                monitor-enter(r9)
                boolean r0 = r9.i     // Catch: java.lang.Throwable -> L1b
                r1 = 1
                if (r0 == 0) goto L28
                if (r10 == 0) goto L22
                java.util.List<rx.internal.operators.w2$i<T>> r0 = r9.n     // Catch: java.lang.Throwable -> L1b
                if (r0 != 0) goto L1e
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1b
                r0.<init>()     // Catch: java.lang.Throwable -> L1b
                r9.n = r0     // Catch: java.lang.Throwable -> L1b
                goto L1e
            L1b:
                r10 = move-exception
                goto Lb9
            L1e:
                r0.add(r10)     // Catch: java.lang.Throwable -> L1b
                goto L24
            L22:
                r9.o = r1     // Catch: java.lang.Throwable -> L1b
            L24:
                r9.j = r1     // Catch: java.lang.Throwable -> L1b
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L1b
                return
            L28:
                r9.i = r1     // Catch: java.lang.Throwable -> L1b
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L1b
                long r0 = r9.k
                r2 = 0
                if (r10 == 0) goto L3b
                java.util.concurrent.atomic.AtomicLong r10 = r10.d
                long r3 = r10.get()
                long r3 = java.lang.Math.max(r0, r3)
                goto L56
            L3b:
                rx.internal.operators.w2$i[] r10 = r9.j()
                int r3 = r10.length
                r4 = r0
                r6 = 0
            L42:
                if (r6 >= r3) goto L55
                r7 = r10[r6]
                if (r7 == 0) goto L52
                java.util.concurrent.atomic.AtomicLong r7 = r7.d
                long r7 = r7.get()
                long r4 = java.lang.Math.max(r4, r7)
            L52:
                int r6 = r6 + 1
                goto L42
            L55:
                r3 = r4
            L56:
                r9.A(r3, r0)
            L59:
                boolean r10 = r9.isUnsubscribed()
                if (r10 == 0) goto L60
            L5f:
                return
            L60:
                monitor-enter(r9)
                boolean r10 = r9.j     // Catch: java.lang.Throwable -> L69
                if (r10 != 0) goto L6b
                r9.i = r2     // Catch: java.lang.Throwable -> L69
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L69
                return
            L69:
                r10 = move-exception
                goto Lb7
            L6b:
                r9.j = r2     // Catch: java.lang.Throwable -> L69
                java.util.List<rx.internal.operators.w2$i<T>> r10 = r9.n     // Catch: java.lang.Throwable -> L69
                r0 = 0
                r9.n = r0     // Catch: java.lang.Throwable -> L69
                boolean r0 = r9.o     // Catch: java.lang.Throwable -> L69
                r9.o = r2     // Catch: java.lang.Throwable -> L69
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L69
                long r3 = r9.k
                if (r10 == 0) goto L97
                java.util.Iterator r10 = r10.iterator()
                r5 = r3
            L80:
                boolean r1 = r10.hasNext()
                if (r1 == 0) goto L98
                java.lang.Object r1 = r10.next()
                rx.internal.operators.w2$i r1 = (rx.internal.operators.w2.i) r1
                java.util.concurrent.atomic.AtomicLong r1 = r1.d
                long r7 = r1.get()
                long r5 = java.lang.Math.max(r5, r7)
                goto L80
            L97:
                r5 = r3
            L98:
                if (r0 == 0) goto Lb3
                rx.internal.operators.w2$i[] r10 = r9.j()
                int r0 = r10.length
                r1 = 0
            La0:
                if (r1 >= r0) goto Lb3
                r7 = r10[r1]
                if (r7 == 0) goto Lb0
                java.util.concurrent.atomic.AtomicLong r7 = r7.d
                long r7 = r7.get()
                long r5 = java.lang.Math.max(r5, r7)
            Lb0:
                int r1 = r1 + 1
                goto La0
            Lb3:
                r9.A(r5, r3)
                goto L59
            Lb7:
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L69
                throw r10
            Lb9:
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L1b
                throw r10
        }

        void G(rx.internal.operators.w2.i<T> r6) {
                r5 = this;
                boolean r0 = r5.c
                if (r0 == 0) goto L5
                return
            L5:
                rx.internal.util.h<rx.internal.operators.w2$i<T>> r0 = r5.d
                monitor-enter(r0)
                boolean r1 = r5.c     // Catch: java.lang.Throwable -> Le
                if (r1 == 0) goto L10
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
                return
            Le:
                r6 = move-exception
                goto L2a
            L10:
                rx.internal.util.h<rx.internal.operators.w2$i<T>> r1 = r5.d     // Catch: java.lang.Throwable -> Le
                r1.f(r6)     // Catch: java.lang.Throwable -> Le
                rx.internal.util.h<rx.internal.operators.w2$i<T>> r6 = r5.d     // Catch: java.lang.Throwable -> Le
                boolean r6 = r6.c()     // Catch: java.lang.Throwable -> Le
                if (r6 == 0) goto L21
                rx.internal.operators.w2$i[] r6 = rx.internal.operators.w2.l.p     // Catch: java.lang.Throwable -> Le
                r5.e = r6     // Catch: java.lang.Throwable -> Le
            L21:
                long r1 = r5.f     // Catch: java.lang.Throwable -> Le
                r3 = 1
                long r1 = r1 + r3
                r5.f = r1     // Catch: java.lang.Throwable -> Le
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
                return
            L2a:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
                throw r6
        }

        void H() {
                r7 = this;
                rx.internal.operators.w2$i<T>[] r0 = r7.e
                long r1 = r7.g
                long r3 = r7.f
                r5 = 0
                int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r6 == 0) goto L2c
                rx.internal.util.h<rx.internal.operators.w2$i<T>> r1 = r7.d
                monitor-enter(r1)
                rx.internal.operators.w2$i<T>[] r0 = r7.e     // Catch: java.lang.Throwable -> L1f
                rx.internal.util.h<rx.internal.operators.w2$i<T>> r2 = r7.d     // Catch: java.lang.Throwable -> L1f
                java.lang.Object[] r2 = r2.i()     // Catch: java.lang.Throwable -> L1f
                int r3 = r2.length     // Catch: java.lang.Throwable -> L1f
                int r4 = r0.length     // Catch: java.lang.Throwable -> L1f
                if (r4 == r3) goto L21
                rx.internal.operators.w2$i[] r0 = new rx.internal.operators.w2.i[r3]     // Catch: java.lang.Throwable -> L1f
                r7.e = r0     // Catch: java.lang.Throwable -> L1f
                goto L21
            L1f:
                r0 = move-exception
                goto L2a
            L21:
                java.lang.System.arraycopy(r2, r5, r0, r5, r3)     // Catch: java.lang.Throwable -> L1f
                long r2 = r7.f     // Catch: java.lang.Throwable -> L1f
                r7.g = r2     // Catch: java.lang.Throwable -> L1f
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
                goto L2c
            L2a:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
                throw r0
            L2c:
                rx.internal.operators.w2$k<T> r1 = r7.a
                int r2 = r0.length
            L2f:
                if (r5 >= r2) goto L3b
                r3 = r0[r5]
                if (r3 == 0) goto L38
                r1.a(r3)
            L38:
                int r5 = r5 + 1
                goto L2f
            L3b:
                return
        }

        boolean g(rx.internal.operators.w2.i<T> r6) {
                r5 = this;
                r6.getClass()
                boolean r0 = r5.c
                r1 = 0
                if (r0 == 0) goto L9
                return r1
            L9:
                rx.internal.util.h<rx.internal.operators.w2$i<T>> r0 = r5.d
                monitor-enter(r0)
                boolean r2 = r5.c     // Catch: java.lang.Throwable -> L12
                if (r2 == 0) goto L14
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
                return r1
            L12:
                r6 = move-exception
                goto L23
            L14:
                rx.internal.util.h<rx.internal.operators.w2$i<T>> r1 = r5.d     // Catch: java.lang.Throwable -> L12
                r1.a(r6)     // Catch: java.lang.Throwable -> L12
                long r1 = r5.f     // Catch: java.lang.Throwable -> L12
                r3 = 1
                long r1 = r1 + r3
                r5.f = r1     // Catch: java.lang.Throwable -> L12
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
                r6 = 1
                return r6
            L23:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
                throw r6
        }

        rx.internal.operators.w2.i<T>[] j() {
                r5 = this;
                rx.internal.util.h<rx.internal.operators.w2$i<T>> r0 = r5.d
                monitor-enter(r0)
                rx.internal.util.h<rx.internal.operators.w2$i<T>> r1 = r5.d     // Catch: java.lang.Throwable -> L12
                java.lang.Object[] r1 = r1.i()     // Catch: java.lang.Throwable -> L12
                int r2 = r1.length     // Catch: java.lang.Throwable -> L12
                rx.internal.operators.w2$i[] r3 = new rx.internal.operators.w2.i[r2]     // Catch: java.lang.Throwable -> L12
                r4 = 0
                java.lang.System.arraycopy(r1, r4, r3, r4, r2)     // Catch: java.lang.Throwable -> L12
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
                return r3
            L12:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
                throw r1
        }

        public void onCompleted() {
                r1 = this;
                boolean r0 = r1.b
                if (r0 != 0) goto L18
                r0 = 1
                r1.b = r0
                rx.internal.operators.w2$k<T> r0 = r1.a     // Catch: java.lang.Throwable -> L13
                r0.complete()     // Catch: java.lang.Throwable -> L13
                r1.H()     // Catch: java.lang.Throwable -> L13
                r1.unsubscribe()
                return
            L13:
                r0 = move-exception
                r1.unsubscribe()
                throw r0
            L18:
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.b
                if (r0 != 0) goto L18
                r0 = 1
                r1.b = r0
                rx.internal.operators.w2$k<T> r0 = r1.a     // Catch: java.lang.Throwable -> L13
                r0.error(r2)     // Catch: java.lang.Throwable -> L13
                r1.H()     // Catch: java.lang.Throwable -> L13
                r1.unsubscribe()
                return
            L13:
                r2 = move-exception
                r1.unsubscribe()
                throw r2
            L18:
                return
        }

        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.b
                if (r0 != 0) goto Lc
                rx.internal.operators.w2$k<T> r0 = r1.a
                r0.next(r2)
                r1.H()
            Lc:
                return
        }

        void s() {
                r1 = this;
                rx.internal.operators.w2$l$a r0 = new rx.internal.operators.w2$l$a
                r0.<init>(r1)
                rx.m r0 = rx.subscriptions.f.a(r0)
                r1.add(r0)
                return
        }

        public void setProducer(rx.g r2) {
                r1 = this;
                rx.g r0 = r1.m
                if (r0 != 0) goto Le
                r1.m = r2
                r2 = 0
                r1.B(r2)
                r1.H()
                return
            Le:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Only a single producer can be set on a Subscriber."
                r2.<init>(r0)
                throw r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class m<T> extends rx.internal.operators.w2.h<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        final rx.h d;
        final long e;
        final int f;

        public m(int r1, long r2, rx.h r4) {
                r0 = this;
                r0.<init>()
                r0.d = r4
                r0.f = r1
                r0.e = r2
                return
        }

        @Override // rx.internal.operators.w2.h
        java.lang.Object d(java.lang.Object r4) {
                r3 = this;
                rx.schedulers.f r0 = new rx.schedulers.f
                rx.h r1 = r3.d
                long r1 = r1.b()
                r0.<init>(r1, r4)
                return r0
        }

        @Override // rx.internal.operators.w2.h
        rx.internal.operators.w2.j e() {
                r8 = this;
                rx.h r0 = r8.d
                long r0 = r0.b()
                long r2 = r8.e
                long r0 = r0 - r2
                java.lang.Object r2 = r8.get()
                rx.internal.operators.w2$j r2 = (rx.internal.operators.w2.j) r2
                java.lang.Object r3 = r2.get()
                rx.internal.operators.w2$j r3 = (rx.internal.operators.w2.j) r3
            L15:
                r7 = r3
                r3 = r2
                r2 = r7
                if (r2 == 0) goto L3e
                java.lang.Object r4 = r2.a
                java.lang.Object r5 = r8.h(r4)
                boolean r6 = rx.internal.operators.v.f(r5)
                if (r6 != 0) goto L3e
                boolean r5 = rx.internal.operators.v.g(r5)
                if (r5 == 0) goto L2d
                goto L3e
            L2d:
                rx.schedulers.f r4 = (rx.schedulers.f) r4
                long r4 = r4.a()
                int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r6 > 0) goto L3e
                java.lang.Object r3 = r2.get()
                rx.internal.operators.w2$j r3 = (rx.internal.operators.w2.j) r3
                goto L15
            L3e:
                return r3
        }

        @Override // rx.internal.operators.w2.h
        java.lang.Object h(java.lang.Object r1) {
                r0 = this;
                rx.schedulers.f r1 = (rx.schedulers.f) r1
                java.lang.Object r1 = r1.b()
                return r1
        }

        @Override // rx.internal.operators.w2.h
        void l() {
                r9 = this;
                rx.h r0 = r9.d
                long r0 = r0.b()
                long r2 = r9.e
                long r0 = r0 - r2
                java.lang.Object r2 = r9.get()
                rx.internal.operators.w2$j r2 = (rx.internal.operators.w2.j) r2
                java.lang.Object r3 = r2.get()
                rx.internal.operators.w2$j r3 = (rx.internal.operators.w2.j) r3
                r4 = 0
            L16:
                r8 = r3
                r3 = r2
                r2 = r8
                if (r2 == 0) goto L49
                int r5 = r9.b
                int r6 = r9.f
                if (r5 <= r6) goto L2e
                int r4 = r4 + 1
                int r5 = r5 + (-1)
                r9.b = r5
                java.lang.Object r3 = r2.get()
                rx.internal.operators.w2$j r3 = (rx.internal.operators.w2.j) r3
                goto L16
            L2e:
                java.lang.Object r5 = r2.a
                rx.schedulers.f r5 = (rx.schedulers.f) r5
                long r5 = r5.a()
                int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r7 > 0) goto L49
                int r4 = r4 + 1
                int r3 = r9.b
                int r3 = r3 + (-1)
                r9.b = r3
                java.lang.Object r3 = r2.get()
                rx.internal.operators.w2$j r3 = (rx.internal.operators.w2.j) r3
                goto L16
            L49:
                if (r4 == 0) goto L4e
                r9.k(r3)
            L4e:
                return
        }

        @Override // rx.internal.operators.w2.h
        void m() {
                r10 = this;
                rx.h r0 = r10.d
                long r0 = r0.b()
                long r2 = r10.e
                long r0 = r0 - r2
                java.lang.Object r2 = r10.get()
                rx.internal.operators.w2$j r2 = (rx.internal.operators.w2.j) r2
                java.lang.Object r3 = r2.get()
                rx.internal.operators.w2$j r3 = (rx.internal.operators.w2.j) r3
                r4 = 0
            L16:
                r9 = r3
                r3 = r2
                r2 = r9
                if (r2 == 0) goto L3a
                int r5 = r10.b
                r6 = 1
                if (r5 <= r6) goto L3a
                java.lang.Object r5 = r2.a
                rx.schedulers.f r5 = (rx.schedulers.f) r5
                long r7 = r5.a()
                int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r5 > 0) goto L3a
                int r4 = r4 + 1
                int r3 = r10.b
                int r3 = r3 - r6
                r10.b = r3
                java.lang.Object r3 = r2.get()
                rx.internal.operators.w2$j r3 = (rx.internal.operators.w2.j) r3
                goto L16
            L3a:
                if (r4 == 0) goto L3f
                r10.k(r3)
            L3f:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class n<T> extends rx.internal.operators.w2.h<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        final int d;

        public n(int r1) {
                r0 = this;
                r0.<init>()
                r0.d = r1
                return
        }

        @Override // rx.internal.operators.w2.h
        void l() {
                r2 = this;
                int r0 = r2.b
                int r1 = r2.d
                if (r0 <= r1) goto L9
                r2.i()
            L9:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class o<T> extends java.util.ArrayList<java.lang.Object> implements rx.internal.operators.w2.k<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        volatile int a;

        public o(int r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // rx.internal.operators.w2.k
        public void a(rx.internal.operators.w2.i<T> r13) {
                r12 = this;
                monitor-enter(r13)
                boolean r0 = r13.e     // Catch: java.lang.Throwable -> La
                r1 = 1
                if (r0 == 0) goto Ld
                r13.f = r1     // Catch: java.lang.Throwable -> La
                monitor-exit(r13)     // Catch: java.lang.Throwable -> La
                return
            La:
                r0 = move-exception
                goto L99
            Ld:
                r13.e = r1     // Catch: java.lang.Throwable -> La
                monitor-exit(r13)     // Catch: java.lang.Throwable -> La
            L10:
                boolean r0 = r13.isUnsubscribed()
                if (r0 == 0) goto L17
                goto L70
            L17:
                int r0 = r12.a
                java.lang.Object r1 = r13.b()
                java.lang.Integer r1 = (java.lang.Integer) r1
                r2 = 0
                if (r1 == 0) goto L27
                int r1 = r1.intValue()
                goto L28
            L27:
                r1 = 0
            L28:
                rx.l<? super T> r3 = r13.b
                if (r3 != 0) goto L2d
                goto L70
            L2d:
                long r4 = r13.get()
                r6 = 0
                r8 = r6
            L34:
                int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r10 == 0) goto L71
                if (r1 >= r0) goto L71
                java.lang.Object r10 = r12.get(r1)
                boolean r10 = rx.internal.operators.v.a(r3, r10)     // Catch: java.lang.Throwable -> L52
                if (r10 == 0) goto L45
                goto L70
            L45:
                boolean r10 = r13.isUnsubscribed()
                if (r10 == 0) goto L4c
                goto L70
            L4c:
                int r1 = r1 + 1
                r10 = 1
                long r8 = r8 + r10
                goto L34
            L52:
                r0 = move-exception
                rx.exceptions.a.e(r0)
                r13.unsubscribe()
                boolean r13 = rx.internal.operators.v.g(r10)
                if (r13 != 0) goto L70
                boolean r13 = rx.internal.operators.v.f(r10)
                if (r13 != 0) goto L70
                java.lang.Object r13 = rx.internal.operators.v.e(r10)
                java.lang.Throwable r13 = rx.exceptions.OnErrorThrowable.addValueAsLastCause(r0, r13)
                r3.onError(r13)
            L70:
                return
            L71:
                int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r0 == 0) goto L87
                java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                r13.c = r0
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r3 == 0) goto L87
                r13.d(r8)
            L87:
                monitor-enter(r13)
                boolean r0 = r13.f     // Catch: java.lang.Throwable -> L90
                if (r0 != 0) goto L92
                r13.e = r2     // Catch: java.lang.Throwable -> L90
                monitor-exit(r13)     // Catch: java.lang.Throwable -> L90
                return
            L90:
                r0 = move-exception
                goto L97
            L92:
                r13.f = r2     // Catch: java.lang.Throwable -> L90
                monitor-exit(r13)     // Catch: java.lang.Throwable -> L90
                goto L10
            L97:
                monitor-exit(r13)     // Catch: java.lang.Throwable -> L90
                throw r0
            L99:
                monitor-exit(r13)     // Catch: java.lang.Throwable -> La
                throw r0
        }

        @Override // rx.internal.operators.w2.k
        public void complete() {
                r1 = this;
                java.lang.Object r0 = rx.internal.operators.v.b()
                r1.add(r0)
                int r0 = r1.a
                int r0 = r0 + 1
                r1.a = r0
                return
        }

        @Override // rx.internal.operators.w2.k
        public void error(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Object r1 = rx.internal.operators.v.c(r1)
                r0.add(r1)
                int r1 = r0.a
                int r1 = r1 + 1
                r0.a = r1
                return
        }

        @Override // rx.internal.operators.w2.k
        public void next(T r1) {
                r0 = this;
                java.lang.Object r1 = rx.internal.operators.v.j(r1)
                r0.add(r1)
                int r1 = r0.a
                int r1 = r1 + 1
                r0.a = r1
                return
        }
    }

    static {
            rx.internal.operators.w2$a r0 = new rx.internal.operators.w2$a
            r0.<init>()
            rx.internal.operators.w2.e = r0
            return
    }

    private w2(rx.e.a<T> r1, rx.e<? extends T> r2, java.util.concurrent.atomic.AtomicReference<rx.internal.operators.w2.l<T>> r3, rx.functions.o<? extends rx.internal.operators.w2.k<T>> r4) {
            r0 = this;
            r0.<init>(r1)
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public static <T> rx.observables.c<T> C7(rx.e<? extends T> r1) {
            rx.functions.o r0 = rx.internal.operators.w2.e
            rx.observables.c r1 = G7(r1, r0)
            return r1
    }

    public static <T> rx.observables.c<T> D7(rx.e<? extends T> r1, int r2) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r0) goto La
            rx.observables.c r1 = C7(r1)
            return r1
        La:
            rx.internal.operators.w2$e r0 = new rx.internal.operators.w2$e
            r0.<init>(r2)
            rx.observables.c r1 = G7(r1, r0)
            return r1
    }

    public static <T> rx.observables.c<T> E7(rx.e<? extends T> r6, long r7, java.util.concurrent.TimeUnit r9, rx.h r10) {
            r5 = 2147483647(0x7fffffff, float:NaN)
            r0 = r6
            r1 = r7
            r3 = r9
            r4 = r10
            rx.observables.c r6 = F7(r0, r1, r3, r4, r5)
            return r6
    }

    public static <T> rx.observables.c<T> F7(rx.e<? extends T> r0, long r1, java.util.concurrent.TimeUnit r3, rx.h r4, int r5) {
            long r1 = r3.toMillis(r1)
            rx.internal.operators.w2$f r3 = new rx.internal.operators.w2$f
            r3.<init>(r5, r1, r4)
            rx.observables.c r0 = G7(r0, r3)
            return r0
    }

    static <T> rx.observables.c<T> G7(rx.e<? extends T> r3, rx.functions.o<? extends rx.internal.operators.w2.k<T>> r4) {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            rx.internal.operators.w2$g r1 = new rx.internal.operators.w2$g
            r1.<init>(r0, r4)
            rx.internal.operators.w2 r2 = new rx.internal.operators.w2
            r2.<init>(r1, r3, r0, r4)
            return r2
    }

    public static <T, U, R> rx.e<R> H7(rx.functions.o<? extends rx.observables.c<U>> r1, rx.functions.p<? super rx.e<U>, ? extends rx.e<R>> r2) {
            rx.internal.operators.w2$b r0 = new rx.internal.operators.w2$b
            r0.<init>(r1, r2)
            rx.e r1 = rx.e.I6(r0)
            return r1
    }

    public static <T> rx.observables.c<T> I7(rx.observables.c<T> r1, rx.h r2) {
            rx.e r2 = r1.I3(r2)
            rx.internal.operators.w2$c r0 = new rx.internal.operators.w2$c
            r0.<init>(r2)
            rx.internal.operators.w2$d r2 = new rx.internal.operators.w2$d
            r2.<init>(r0, r1)
            return r2
    }

    @Override // rx.observables.c
    public void A7(rx.functions.b<? super rx.m> r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<rx.internal.operators.w2$l<T>> r0 = r4.c
            java.lang.Object r0 = r0.get()
            rx.internal.operators.w2$l r0 = (rx.internal.operators.w2.l) r0
            if (r0 == 0) goto L10
            boolean r1 = r0.isUnsubscribed()
            if (r1 == 0) goto L2a
        L10:
            rx.internal.operators.w2$l r1 = new rx.internal.operators.w2$l
            rx.functions.o<? extends rx.internal.operators.w2$k<T>> r2 = r4.d
            java.lang.Object r2 = r2.call()
            rx.internal.operators.w2$k r2 = (rx.internal.operators.w2.k) r2
            r1.<init>(r2)
            r1.s()
            java.util.concurrent.atomic.AtomicReference<rx.internal.operators.w2$l<T>> r2 = r4.c
            boolean r0 = androidx.camera.view.p.a(r2, r0, r1)
            if (r0 != 0) goto L29
            goto L0
        L29:
            r0 = r1
        L2a:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.h
            boolean r1 = r1.get()
            r2 = 0
            if (r1 != 0) goto L3d
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.h
            r3 = 1
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L3d
            r2 = 1
        L3d:
            r5.call(r0)
            if (r2 == 0) goto L47
            rx.e<? extends T> r5 = r4.b
            r5.J6(r0)
        L47:
            return
    }

    public boolean isUnsubscribed() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<rx.internal.operators.w2$l<T>> r0 = r1.c
            java.lang.Object r0 = r0.get()
            rx.internal.operators.w2$l r0 = (rx.internal.operators.w2.l) r0
            if (r0 == 0) goto L13
            boolean r0 = r0.isUnsubscribed()
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            return r0
        L13:
            r0 = 1
            return r0
    }

    public void unsubscribe() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<rx.internal.operators.w2$l<T>> r0 = r2.c
            r1 = 0
            r0.lazySet(r1)
            return
    }
}
