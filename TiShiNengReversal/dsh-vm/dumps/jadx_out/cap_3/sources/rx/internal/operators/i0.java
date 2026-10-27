package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class i0<T> implements rx.e.a<T> {
    final rx.e<T> a;
    final rx.functions.p<? super T, ? extends rx.b> b;
    final boolean c;
    final int d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends rx.l<T> {
        final rx.l<? super T> a;
        final rx.functions.p<? super T, ? extends rx.b> b;
        final boolean c;
        final int d;
        final java.util.concurrent.atomic.AtomicInteger e;
        final rx.subscriptions.b f;
        final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> g;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.operators.i0$a$a, reason: collision with other inner class name */
        final class C0011a extends java.util.concurrent.atomic.AtomicReference<rx.m> implements rx.d, rx.m {
            private static final long serialVersionUID = -8588259593722659900L;
            final /* synthetic */ rx.internal.operators.i0.a a;

            C0011a(rx.internal.operators.i0.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void a(rx.m r2) {
                    r1 = this;
                    r0 = 0
                    boolean r0 = r1.compareAndSet(r0, r2)
                    if (r0 != 0) goto L1a
                    r2.unsubscribe()
                    java.lang.Object r2 = r1.get()
                    if (r2 == r1) goto L1a
                    java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                    java.lang.String r0 = "Subscription already set!"
                    r2.<init>(r0)
                    rx.plugins.c.I(r2)
                L1a:
                    return
            }

            public boolean isUnsubscribed() {
                    r1 = this;
                    java.lang.Object r0 = r1.get()
                    if (r0 != r1) goto L8
                    r0 = 1
                    return r0
                L8:
                    r0 = 0
                    return r0
            }

            public void onCompleted() {
                    r1 = this;
                    rx.internal.operators.i0$a r0 = r1.a
                    r0.j(r1)
                    return
            }

            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    rx.internal.operators.i0$a r0 = r1.a
                    r0.s(r1, r2)
                    return
            }

            public void unsubscribe() {
                    r1 = this;
                    java.lang.Object r0 = r1.getAndSet(r1)
                    rx.m r0 = (rx.m) r0
                    if (r0 == 0) goto Ld
                    if (r0 == r1) goto Ld
                    r0.unsubscribe()
                Ld:
                    return
            }
        }

        a(rx.l<? super T> r1, rx.functions.p<? super T, ? extends rx.b> r2, boolean r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r2 = 1
                r1.<init>(r2)
                r0.e = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.g = r1
                rx.subscriptions.b r1 = new rx.subscriptions.b
                r1.<init>()
                r0.f = r1
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r4 == r1) goto L28
                long r1 = (long) r4
                goto L2d
            L28:
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L2d:
                r0.request(r1)
                return
        }

        boolean g() {
                r2 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r2.e
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto L1d
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r2.g
                java.lang.Throwable r0 = rx.internal.util.ExceptionsUtils.terminate(r0)
                if (r0 == 0) goto L16
                rx.l<? super T> r1 = r2.a
                r1.onError(r0)
                goto L1b
            L16:
                rx.l<? super T> r0 = r2.a
                r0.onCompleted()
            L1b:
                r0 = 1
                return r0
            L1d:
                r0 = 0
                return r0
        }

        public void j(rx.internal.operators.i0.a<T>.C0011a r3) {
                r2 = this;
                rx.subscriptions.b r0 = r2.f
                r0.f(r3)
                boolean r3 = r2.g()
                if (r3 != 0) goto L17
                int r3 = r2.d
                r0 = 2147483647(0x7fffffff, float:NaN)
                if (r3 == r0) goto L17
                r0 = 1
                r2.request(r0)
            L17:
                return
        }

        public void onCompleted() {
                r0 = this;
                r0.g()
                return
        }

        public void onError(java.lang.Throwable r3) {
                r2 = this;
                boolean r0 = r2.c
                if (r0 == 0) goto Ld
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r2.g
                rx.internal.util.ExceptionsUtils.addThrowable(r0, r3)
                r2.onCompleted()
                return
            Ld:
                rx.subscriptions.b r0 = r2.f
                r0.unsubscribe()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r2.g
                r1 = 0
                boolean r0 = androidx.camera.view.p.a(r0, r1, r3)
                if (r0 == 0) goto L27
                rx.l<? super T> r3 = r2.a
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r2.g
                java.lang.Throwable r0 = rx.internal.util.ExceptionsUtils.terminate(r0)
                r3.onError(r0)
                return
            L27:
                rx.plugins.c.I(r3)
                return
        }

        public void onNext(T r3) {
                r2 = this;
                rx.functions.p<? super T, ? extends rx.b> r0 = r2.b     // Catch: java.lang.Throwable -> L25
                java.lang.Object r3 = r0.call(r3)     // Catch: java.lang.Throwable -> L25
                rx.b r3 = (rx.b) r3     // Catch: java.lang.Throwable -> L25
                if (r3 == 0) goto L1d
                rx.internal.operators.i0$a$a r0 = new rx.internal.operators.i0$a$a
                r0.<init>(r2)
                rx.subscriptions.b r1 = r2.f
                r1.a(r0)
                java.util.concurrent.atomic.AtomicInteger r1 = r2.e
                r1.getAndIncrement()
                r3.G0(r0)
                return
            L1d:
                java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L25
                java.lang.String r0 = "The mapper returned a null Completable"
                r3.<init>(r0)     // Catch: java.lang.Throwable -> L25
                throw r3     // Catch: java.lang.Throwable -> L25
            L25:
                r3 = move-exception
                rx.exceptions.a.e(r3)
                r2.unsubscribe()
                r2.onError(r3)
                return
        }

        public void s(rx.internal.operators.i0.a<T>.C0011a r2, java.lang.Throwable r3) {
                r1 = this;
                rx.subscriptions.b r0 = r1.f
                r0.f(r2)
                boolean r2 = r1.c
                if (r2 == 0) goto L21
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r2 = r1.g
                rx.internal.util.ExceptionsUtils.addThrowable(r2, r3)
                boolean r2 = r1.g()
                if (r2 != 0) goto L20
                int r2 = r1.d
                r3 = 2147483647(0x7fffffff, float:NaN)
                if (r2 == r3) goto L20
                r2 = 1
                r1.request(r2)
            L20:
                return
            L21:
                rx.subscriptions.b r2 = r1.f
                r2.unsubscribe()
                r1.unsubscribe()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r2 = r1.g
                r0 = 0
                boolean r2 = androidx.camera.view.p.a(r2, r0, r3)
                if (r2 == 0) goto L3e
                rx.l<? super T> r2 = r1.a
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r3 = r1.g
                java.lang.Throwable r3 = rx.internal.util.ExceptionsUtils.terminate(r3)
                r2.onError(r3)
                return
            L3e:
                rx.plugins.c.I(r3)
                return
        }
    }

    public i0(rx.e<T> r1, rx.functions.p<? super T, ? extends rx.b> r2, boolean r3, int r4) {
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

    public void call(rx.l<? super T> r5) {
            r4 = this;
            rx.internal.operators.i0$a r0 = new rx.internal.operators.i0$a
            rx.functions.p<? super T, ? extends rx.b> r1 = r4.b
            boolean r2 = r4.c
            int r3 = r4.d
            r0.<init>(r5, r1, r2, r3)
            r5.add(r0)
            rx.subscriptions.b r1 = r0.f
            r5.add(r1)
            rx.e<T> r5 = r4.a
            r5.J6(r0)
            return
    }
}
