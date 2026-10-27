package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class f4<R> implements rx.e.b<R, rx.e<?>[]> {
    final rx.functions.y<? extends R> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<R> extends java.util.concurrent.atomic.AtomicLong {
        static final int g = 0;
        private static final long serialVersionUID = 5995274816189928317L;
        final rx.f<? super R> a;
        private final rx.functions.y<? extends R> b;
        private final rx.subscriptions.b c;
        int d;
        private volatile java.lang.Object[] e;
        private java.util.concurrent.atomic.AtomicLong f;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.operators.f4$a$a, reason: collision with other inner class name */
        final class C0009a extends rx.l {
            final rx.internal.util.j a;
            final /* synthetic */ rx.internal.operators.f4.a b;

            C0009a(rx.internal.operators.f4.a r1) {
                    r0 = this;
                    r0.b = r1
                    r0.<init>()
                    rx.internal.util.j r1 = rx.internal.util.j.g()
                    r0.a = r1
                    return
            }

            public void g(long r1) {
                    r0 = this;
                    r0.request(r1)
                    return
            }

            public void onCompleted() {
                    r1 = this;
                    rx.internal.util.j r0 = r1.a
                    r0.H()
                    rx.internal.operators.f4$a r0 = r1.b
                    r0.b()
                    return
            }

            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    rx.internal.operators.f4$a r0 = r1.b
                    rx.f<? super R> r0 = r0.a
                    r0.onError(r2)
                    return
            }

            public void onNext(java.lang.Object r2) {
                    r1 = this;
                    rx.internal.util.j r0 = r1.a     // Catch: rx.exceptions.MissingBackpressureException -> L6
                    r0.P(r2)     // Catch: rx.exceptions.MissingBackpressureException -> L6
                    goto La
                L6:
                    r2 = move-exception
                    r1.onError(r2)
                La:
                    rx.internal.operators.f4$a r2 = r1.b
                    r2.b()
                    return
            }

            public void onStart() {
                    r2 = this;
                    int r0 = rx.internal.util.j.d
                    long r0 = (long) r0
                    r2.request(r0)
                    return
            }
        }

        static {
                int r0 = rx.internal.util.j.d
                double r0 = (double) r0
                r2 = 4604480259023595110(0x3fe6666666666666, double:0.7)
                double r0 = r0 * r2
                int r0 = (int) r0
                rx.internal.operators.f4.a.g = r0
                return
        }

        public a(rx.l<? super R> r2, rx.functions.y<? extends R> r3) {
                r1 = this;
                r1.<init>()
                rx.subscriptions.b r0 = new rx.subscriptions.b
                r0.<init>()
                r1.c = r0
                r1.a = r2
                r1.b = r3
                r2.add(r0)
                return
        }

        public void a(rx.e[] r6, java.util.concurrent.atomic.AtomicLong r7) {
                r5 = this;
                int r0 = r6.length
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                r2 = 0
            L5:
                int r3 = r6.length
                if (r2 >= r3) goto L17
                rx.internal.operators.f4$a$a r3 = new rx.internal.operators.f4$a$a
                r3.<init>(r5)
                r0[r2] = r3
                rx.subscriptions.b r4 = r5.c
                r4.a(r3)
                int r2 = r2 + 1
                goto L5
            L17:
                r5.f = r7
                r5.e = r0
            L1b:
                int r7 = r6.length
                if (r1 >= r7) goto L2a
                r7 = r6[r1]
                r2 = r0[r1]
                rx.internal.operators.f4$a$a r2 = (rx.internal.operators.f4.a.C0009a) r2
                r7.J6(r2)
                int r1 = r1 + 1
                goto L1b
            L2a:
                return
        }

        void b() {
                r14 = this;
                java.lang.Object[] r0 = r14.e
                if (r0 != 0) goto L6
                goto La9
            L6:
                long r1 = r14.getAndIncrement()
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 != 0) goto La9
                int r1 = r0.length
                rx.f<? super R> r2 = r14.a
                java.util.concurrent.atomic.AtomicLong r5 = r14.f
            L15:
                java.lang.Object[] r6 = new java.lang.Object[r1]
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 1
            L1b:
                if (r9 >= r1) goto L43
                r11 = r0[r9]
                rx.internal.operators.f4$a$a r11 = (rx.internal.operators.f4.a.C0009a) r11
                rx.internal.util.j r11 = r11.a
                java.lang.Object r12 = r11.Q()
                if (r12 != 0) goto L2b
                r10 = 0
                goto L40
            L2b:
                boolean r13 = r11.A(r12)
                if (r13 == 0) goto L3a
                r2.onCompleted()
                rx.subscriptions.b r0 = r14.c
                r0.unsubscribe()
                return
            L3a:
                java.lang.Object r11 = r11.s(r12)
                r6[r9] = r11
            L40:
                int r9 = r9 + 1
                goto L1b
            L43:
                if (r10 == 0) goto La1
                long r9 = r5.get()
                int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r11 <= 0) goto La1
                rx.functions.y<? extends R> r9 = r14.b     // Catch: java.lang.Throwable -> L9c
                java.lang.Object r9 = r9.call(r6)     // Catch: java.lang.Throwable -> L9c
                r2.onNext(r9)     // Catch: java.lang.Throwable -> L9c
                r5.decrementAndGet()     // Catch: java.lang.Throwable -> L9c
                int r9 = r14.d     // Catch: java.lang.Throwable -> L9c
                int r9 = r9 + r8
                r14.d = r9     // Catch: java.lang.Throwable -> L9c
                int r6 = r0.length
                r8 = 0
            L60:
                if (r8 >= r6) goto L81
                r9 = r0[r8]
                rx.internal.operators.f4$a$a r9 = (rx.internal.operators.f4.a.C0009a) r9
                rx.internal.util.j r9 = r9.a
                r9.R()
                java.lang.Object r10 = r9.Q()
                boolean r9 = r9.A(r10)
                if (r9 == 0) goto L7e
                r2.onCompleted()
                rx.subscriptions.b r0 = r14.c
                r0.unsubscribe()
                return
            L7e:
                int r8 = r8 + 1
                goto L60
            L81:
                int r6 = r14.d
                int r8 = rx.internal.operators.f4.a.g
                if (r6 <= r8) goto L15
                int r6 = r0.length
                r8 = 0
            L89:
                if (r8 >= r6) goto L98
                r9 = r0[r8]
                rx.internal.operators.f4$a$a r9 = (rx.internal.operators.f4.a.C0009a) r9
                int r10 = r14.d
                long r10 = (long) r10
                r9.g(r10)
                int r8 = r8 + 1
                goto L89
            L98:
                r14.d = r7
                goto L15
            L9c:
                r0 = move-exception
                rx.exceptions.a.g(r0, r2, r6)
                return
            La1:
                long r6 = r14.decrementAndGet()
                int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r8 > 0) goto L15
            La9:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<R> extends java.util.concurrent.atomic.AtomicLong implements rx.g {
        private static final long serialVersionUID = -1216676403723546796L;
        final rx.internal.operators.f4.a<R> a;

        public b(rx.internal.operators.f4.a<R> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public void request(long r1) {
                r0 = this;
                rx.internal.operators.a.b(r0, r1)
                rx.internal.operators.f4$a<R> r1 = r0.a
                r1.b()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class c extends rx.l<rx.e[]> {
        final rx.l<? super R> a;
        final rx.internal.operators.f4.a<R> b;
        final rx.internal.operators.f4.b<R> c;
        boolean d;
        final /* synthetic */ rx.internal.operators.f4 e;

        public c(rx.internal.operators.f4 r1, rx.l<? super R> r2, rx.internal.operators.f4.a<R> r3, rx.internal.operators.f4.b<R> r4) {
                r0 = this;
                r0.e = r1
                r0.<init>()
                r0.a = r2
                r0.b = r3
                r0.c = r4
                return
        }

        public void g(rx.e[] r3) {
                r2 = this;
                if (r3 == 0) goto L11
                int r0 = r3.length
                if (r0 != 0) goto L6
                goto L11
            L6:
                r0 = 1
                r2.d = r0
                rx.internal.operators.f4$a<R> r0 = r2.b
                rx.internal.operators.f4$b<R> r1 = r2.c
                r0.a(r3, r1)
                return
            L11:
                rx.l<? super R> r3 = r2.a
                r3.onCompleted()
                return
        }

        public void onCompleted() {
                r1 = this;
                boolean r0 = r1.d
                if (r0 != 0) goto L9
                rx.l<? super R> r0 = r1.a
                r0.onCompleted()
            L9:
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.l<? super R> r0 = r1.a
                r0.onError(r2)
                return
        }

        public /* bridge */ /* synthetic */ void onNext(java.lang.Object r1) {
                r0 = this;
                rx.e[] r1 = (rx.e[]) r1
                r0.g(r1)
                return
        }
    }

    public f4(rx.functions.q r1) {
            r0 = this;
            r0.<init>()
            rx.functions.y r1 = rx.functions.a0.g(r1)
            r0.a = r1
            return
    }

    public f4(rx.functions.r r1) {
            r0 = this;
            r0.<init>()
            rx.functions.y r1 = rx.functions.a0.h(r1)
            r0.a = r1
            return
    }

    public f4(rx.functions.s r1) {
            r0 = this;
            r0.<init>()
            rx.functions.y r1 = rx.functions.a0.i(r1)
            r0.a = r1
            return
    }

    public f4(rx.functions.t r1) {
            r0 = this;
            r0.<init>()
            rx.functions.y r1 = rx.functions.a0.j(r1)
            r0.a = r1
            return
    }

    public f4(rx.functions.u r1) {
            r0 = this;
            r0.<init>()
            rx.functions.y r1 = rx.functions.a0.k(r1)
            r0.a = r1
            return
    }

    public f4(rx.functions.v r1) {
            r0 = this;
            r0.<init>()
            rx.functions.y r1 = rx.functions.a0.l(r1)
            r0.a = r1
            return
    }

    public f4(rx.functions.w r1) {
            r0 = this;
            r0.<init>()
            rx.functions.y r1 = rx.functions.a0.m(r1)
            r0.a = r1
            return
    }

    public f4(rx.functions.x r1) {
            r0 = this;
            r0.<init>()
            rx.functions.y r1 = rx.functions.a0.n(r1)
            r0.a = r1
            return
    }

    public f4(rx.functions.y<? extends R> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super rx.e[]> call(rx.l<? super R> r4) {
            r3 = this;
            rx.internal.operators.f4$a r0 = new rx.internal.operators.f4$a
            rx.functions.y<? extends R> r1 = r3.a
            r0.<init>(r4, r1)
            rx.internal.operators.f4$b r1 = new rx.internal.operators.f4$b
            r1.<init>(r0)
            rx.internal.operators.f4$c r2 = new rx.internal.operators.f4$c
            r2.<init>(r3, r4, r0, r1)
            r4.add(r2)
            r4.setProducer(r1)
            return r2
    }
}
