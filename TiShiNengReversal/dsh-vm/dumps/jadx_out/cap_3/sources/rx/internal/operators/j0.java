package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class j0<T, R> implements rx.e.a<R> {
    final rx.e<T> a;
    final rx.functions.p<? super T, ? extends rx.i<? extends R>> b;
    final boolean c;
    final int d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T, R> extends rx.l<T> {
        final rx.l<? super R> a;
        final rx.functions.p<? super T, ? extends rx.i<? extends R>> b;
        final boolean c;
        final int d;
        final java.util.concurrent.atomic.AtomicInteger e;
        final java.util.concurrent.atomic.AtomicInteger f;
        final rx.subscriptions.b g;
        final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> h;
        final java.util.Queue<java.lang.Object> i;
        final rx.internal.operators.j0.a<T, R>.b j;
        volatile boolean k;
        volatile boolean l;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.operators.j0$a$a, reason: collision with other inner class name */
        final class C0012a extends rx.k<R> {
            final /* synthetic */ rx.internal.operators.j0.a b;

            C0012a(rx.internal.operators.j0.a r1) {
                    r0 = this;
                    r0.b = r1
                    r0.<init>()
                    return
            }

            public void d(R r2) {
                    r1 = this;
                    rx.internal.operators.j0$a r0 = r1.b
                    r0.s(r1, r2)
                    return
            }

            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    rx.internal.operators.j0$a r0 = r1.b
                    r0.j(r1, r2)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        final class b extends java.util.concurrent.atomic.AtomicLong implements rx.g, rx.m {
            private static final long serialVersionUID = -887187595446742742L;
            final /* synthetic */ rx.internal.operators.j0.a a;

            b(rx.internal.operators.j0.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            void a(long r1) {
                    r0 = this;
                    rx.internal.operators.a.i(r0, r1)
                    return
            }

            public boolean isUnsubscribed() {
                    r1 = this;
                    rx.internal.operators.j0$a r0 = r1.a
                    boolean r0 = r0.l
                    return r0
            }

            public void request(long r4) {
                    r3 = this;
                    r0 = 0
                    int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                    if (r2 <= 0) goto Le
                    rx.internal.operators.a.b(r3, r4)
                    rx.internal.operators.j0$a r4 = r3.a
                    r4.g()
                Le:
                    return
            }

            public void unsubscribe() {
                    r2 = this;
                    rx.internal.operators.j0$a r0 = r2.a
                    r1 = 1
                    r0.l = r1
                    rx.internal.operators.j0$a r0 = r2.a
                    r0.unsubscribe()
                    rx.internal.operators.j0$a r0 = r2.a
                    java.util.concurrent.atomic.AtomicInteger r0 = r0.e
                    int r0 = r0.getAndIncrement()
                    if (r0 != 0) goto L1b
                    rx.internal.operators.j0$a r0 = r2.a
                    java.util.Queue<java.lang.Object> r0 = r0.i
                    r0.clear()
                L1b:
                    return
            }
        }

        a(rx.l<? super R> r1, rx.functions.p<? super T, ? extends rx.i<? extends R>> r2, boolean r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r1.<init>()
                r0.e = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.h = r1
                rx.internal.operators.j0$a$b r1 = new rx.internal.operators.j0$a$b
                r1.<init>(r0)
                r0.j = r1
                rx.subscriptions.b r1 = new rx.subscriptions.b
                r1.<init>()
                r0.g = r1
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r1.<init>()
                r0.f = r1
                boolean r1 = rx.internal.util.unsafe.n0.f()
                if (r1 == 0) goto L3c
                rx.internal.util.unsafe.o r1 = new rx.internal.util.unsafe.o
                r1.<init>()
                r0.i = r1
                goto L43
            L3c:
                rx.internal.util.atomic.c r1 = new rx.internal.util.atomic.c
                r1.<init>()
                r0.i = r1
            L43:
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r4 == r1) goto L4a
                long r1 = (long) r4
                goto L4f
            L4a:
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L4f:
                r0.request(r1)
                return
        }

        void g() {
                r17 = this;
                r0 = r17
                java.util.concurrent.atomic.AtomicInteger r1 = r0.e
                int r1 = r1.getAndIncrement()
                if (r1 == 0) goto Lc
                goto Lfe
            Lc:
                rx.l<? super R> r1 = r0.a
                java.util.Queue<java.lang.Object> r2 = r0.i
                boolean r3 = r0.c
                java.util.concurrent.atomic.AtomicInteger r4 = r0.f
                r5 = 1
                r6 = 1
            L16:
                rx.internal.operators.j0$a<T, R>$b r7 = r0.j
                long r7 = r7.get()
                r9 = 0
                r11 = r9
            L1f:
                int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                if (r13 == 0) goto L83
                boolean r14 = r0.l
                if (r14 == 0) goto L2b
                r2.clear()
                return
            L2b:
                boolean r14 = r0.k
                if (r3 != 0) goto L48
                if (r14 == 0) goto L48
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r15 = r0.h
                java.lang.Object r15 = r15.get()
                java.lang.Throwable r15 = (java.lang.Throwable) r15
                if (r15 == 0) goto L48
                r2.clear()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r2 = r0.h
                java.lang.Throwable r2 = rx.internal.util.ExceptionsUtils.terminate(r2)
                r1.onError(r2)
                return
            L48:
                java.lang.Object r15 = r2.poll()
                if (r15 != 0) goto L51
                r16 = 1
                goto L53
            L51:
                r16 = 0
            L53:
                if (r14 == 0) goto L75
                int r14 = r4.get()
                if (r14 != 0) goto L75
                if (r16 == 0) goto L75
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r2 = r0.h
                java.lang.Object r2 = r2.get()
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                if (r2 == 0) goto L71
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r2 = r0.h
                java.lang.Throwable r2 = rx.internal.util.ExceptionsUtils.terminate(r2)
                r1.onError(r2)
                return
            L71:
                r1.onCompleted()
                return
            L75:
                if (r16 == 0) goto L78
                goto L83
            L78:
                java.lang.Object r13 = rx.internal.operators.v.e(r15)
                r1.onNext(r13)
                r13 = 1
                long r11 = r11 + r13
                goto L1f
            L83:
                if (r13 != 0) goto Lde
                boolean r7 = r0.l
                if (r7 == 0) goto L8d
                r2.clear()
                return
            L8d:
                boolean r7 = r0.k
                if (r7 == 0) goto Lde
                if (r3 == 0) goto Lb7
                int r7 = r4.get()
                if (r7 != 0) goto Lde
                boolean r7 = r2.isEmpty()
                if (r7 == 0) goto Lde
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r2 = r0.h
                java.lang.Object r2 = r2.get()
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                if (r2 == 0) goto Lb3
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r2 = r0.h
                java.lang.Throwable r2 = rx.internal.util.ExceptionsUtils.terminate(r2)
                r1.onError(r2)
                return
            Lb3:
                r1.onCompleted()
                return
            Lb7:
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r7 = r0.h
                java.lang.Object r7 = r7.get()
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto Lce
                r2.clear()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r2 = r0.h
                java.lang.Throwable r2 = rx.internal.util.ExceptionsUtils.terminate(r2)
                r1.onError(r2)
                return
            Lce:
                int r7 = r4.get()
                if (r7 != 0) goto Lde
                boolean r7 = r2.isEmpty()
                if (r7 == 0) goto Lde
                r1.onCompleted()
                return
            Lde:
                int r7 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r7 == 0) goto Lf5
                rx.internal.operators.j0$a<T, R>$b r7 = r0.j
                r7.a(r11)
                boolean r7 = r0.k
                if (r7 != 0) goto Lf5
                int r7 = r0.d
                r8 = 2147483647(0x7fffffff, float:NaN)
                if (r7 == r8) goto Lf5
                r0.request(r11)
            Lf5:
                java.util.concurrent.atomic.AtomicInteger r7 = r0.e
                int r6 = -r6
                int r6 = r7.addAndGet(r6)
                if (r6 != 0) goto L16
            Lfe:
                return
        }

        void j(rx.internal.operators.j0.a<T, R>.C0012a r2, java.lang.Throwable r3) {
                r1 = this;
                boolean r0 = r1.c
                if (r0 == 0) goto L1f
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.h
                rx.internal.util.ExceptionsUtils.addThrowable(r0, r3)
                rx.subscriptions.b r3 = r1.g
                r3.f(r2)
                boolean r2 = r1.k
                if (r2 != 0) goto L37
                int r2 = r1.d
                r3 = 2147483647(0x7fffffff, float:NaN)
                if (r2 == r3) goto L37
                r2 = 1
                r1.request(r2)
                goto L37
            L1f:
                rx.subscriptions.b r2 = r1.g
                r2.unsubscribe()
                r1.unsubscribe()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r2 = r1.h
                r0 = 0
                boolean r2 = androidx.camera.view.p.a(r2, r0, r3)
                if (r2 != 0) goto L34
                rx.plugins.c.I(r3)
                return
            L34:
                r2 = 1
                r1.k = r2
            L37:
                java.util.concurrent.atomic.AtomicInteger r2 = r1.f
                r2.decrementAndGet()
                r1.g()
                return
        }

        public void onCompleted() {
                r1 = this;
                r0 = 1
                r1.k = r0
                r1.g()
                return
        }

        public void onError(java.lang.Throwable r3) {
                r2 = this;
                boolean r0 = r2.c
                if (r0 == 0) goto La
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r2.h
                rx.internal.util.ExceptionsUtils.addThrowable(r0, r3)
                goto L1c
            La:
                rx.subscriptions.b r0 = r2.g
                r0.unsubscribe()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r2.h
                r1 = 0
                boolean r0 = androidx.camera.view.p.a(r0, r1, r3)
                if (r0 != 0) goto L1c
                rx.plugins.c.I(r3)
                return
            L1c:
                r3 = 1
                r2.k = r3
                r2.g()
                return
        }

        public void onNext(T r3) {
                r2 = this;
                rx.functions.p<? super T, ? extends rx.i<? extends R>> r0 = r2.b     // Catch: java.lang.Throwable -> L25
                java.lang.Object r3 = r0.call(r3)     // Catch: java.lang.Throwable -> L25
                rx.i r3 = (rx.i) r3     // Catch: java.lang.Throwable -> L25
                if (r3 == 0) goto L1d
                rx.internal.operators.j0$a$a r0 = new rx.internal.operators.j0$a$a
                r0.<init>(r2)
                rx.subscriptions.b r1 = r2.g
                r1.a(r0)
                java.util.concurrent.atomic.AtomicInteger r1 = r2.f
                r1.incrementAndGet()
                r3.j0(r0)
                return
            L1d:
                java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L25
                java.lang.String r0 = "The mapper returned a null Single"
                r3.<init>(r0)     // Catch: java.lang.Throwable -> L25
                throw r3     // Catch: java.lang.Throwable -> L25
            L25:
                r3 = move-exception
                rx.exceptions.a.e(r3)
                r2.unsubscribe()
                r2.onError(r3)
                return
        }

        void s(rx.internal.operators.j0.a<T, R>.C0012a r2, R r3) {
                r1 = this;
                java.util.Queue<java.lang.Object> r0 = r1.i
                java.lang.Object r3 = rx.internal.operators.v.j(r3)
                r0.offer(r3)
                rx.subscriptions.b r3 = r1.g
                r3.f(r2)
                java.util.concurrent.atomic.AtomicInteger r2 = r1.f
                r2.decrementAndGet()
                r1.g()
                return
        }
    }

    public j0(rx.e<T> r1, rx.functions.p<? super T, ? extends rx.i<? extends R>> r2, boolean r3, int r4) {
            r0 = this;
            r0.<init>()
            if (r2 == 0) goto L27
            if (r4 <= 0) goto L10
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
        L10:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "maxConcurrency > 0 required but it was "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L27:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "mapper is null"
            r1.<init>(r2)
            throw r1
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super R> r5) {
            r4 = this;
            rx.internal.operators.j0$a r0 = new rx.internal.operators.j0$a
            rx.functions.p<? super T, ? extends rx.i<? extends R>> r1 = r4.b
            boolean r2 = r4.c
            int r3 = r4.d
            r0.<init>(r5, r1, r2, r3)
            rx.subscriptions.b r1 = r0.g
            r5.add(r1)
            rx.internal.operators.j0$a<T, R>$b r1 = r0.j
            r5.add(r1)
            rx.internal.operators.j0$a<T, R>$b r1 = r0.j
            r5.setProducer(r1)
            rx.e<T> r5 = r4.a
            r5.J6(r0)
            return
    }
}
