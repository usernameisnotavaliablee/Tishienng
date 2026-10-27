package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class x2<T> implements rx.e.b<T, rx.e<T>> {
    final rx.functions.q<java.lang.Integer, java.lang.Throwable, java.lang.Boolean> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends rx.l<rx.e<T>> {
        final rx.l<? super T> a;
        final rx.functions.q<java.lang.Integer, java.lang.Throwable, java.lang.Boolean> b;
        final rx.h.a c;
        final rx.subscriptions.e d;
        final rx.internal.producers.a e;
        final java.util.concurrent.atomic.AtomicInteger f;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.operators.x2$a$a, reason: collision with other inner class name */
        class C0031a implements rx.functions.a {
            final /* synthetic */ rx.e a;
            final /* synthetic */ rx.internal.operators.x2.a b;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: rx.internal.operators.x2$a$a$a, reason: collision with other inner class name */
            class C0032a extends rx.l<T> {
                boolean a;
                final /* synthetic */ rx.functions.a b;
                final /* synthetic */ rx.internal.operators.x2.a.C0031a c;

                C0032a(rx.internal.operators.x2.a.C0031a r1, rx.functions.a r2) {
                        r0 = this;
                        r0.c = r1
                        r0.b = r2
                        r0.<init>()
                        return
                }

                public void onCompleted() {
                        r1 = this;
                        boolean r0 = r1.a
                        if (r0 != 0) goto L10
                        r0 = 1
                        r1.a = r0
                        rx.internal.operators.x2$a$a r0 = r1.c
                        rx.internal.operators.x2$a r0 = r0.b
                        rx.l<? super T> r0 = r0.a
                        r0.onCompleted()
                    L10:
                        return
                }

                public void onError(java.lang.Throwable r3) {
                        r2 = this;
                        boolean r0 = r2.a
                        if (r0 != 0) goto L44
                        r0 = 1
                        r2.a = r0
                        rx.internal.operators.x2$a$a r0 = r2.c
                        rx.internal.operators.x2$a r0 = r0.b
                        rx.functions.q<java.lang.Integer, java.lang.Throwable, java.lang.Boolean> r1 = r0.b
                        java.util.concurrent.atomic.AtomicInteger r0 = r0.f
                        int r0 = r0.get()
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                        java.lang.Object r0 = r1.call(r0, r3)
                        java.lang.Boolean r0 = (java.lang.Boolean) r0
                        boolean r0 = r0.booleanValue()
                        if (r0 == 0) goto L3b
                        rx.internal.operators.x2$a$a r0 = r2.c
                        rx.internal.operators.x2$a r0 = r0.b
                        rx.h$a r0 = r0.c
                        boolean r0 = r0.isUnsubscribed()
                        if (r0 != 0) goto L3b
                        rx.internal.operators.x2$a$a r3 = r2.c
                        rx.internal.operators.x2$a r3 = r3.b
                        rx.h$a r3 = r3.c
                        rx.functions.a r0 = r2.b
                        r3.d(r0)
                        return
                    L3b:
                        rx.internal.operators.x2$a$a r0 = r2.c
                        rx.internal.operators.x2$a r0 = r0.b
                        rx.l<? super T> r0 = r0.a
                        r0.onError(r3)
                    L44:
                        return
                }

                public void onNext(T r3) {
                        r2 = this;
                        boolean r0 = r2.a
                        if (r0 != 0) goto L18
                        rx.internal.operators.x2$a$a r0 = r2.c
                        rx.internal.operators.x2$a r0 = r0.b
                        rx.l<? super T> r0 = r0.a
                        r0.onNext(r3)
                        rx.internal.operators.x2$a$a r3 = r2.c
                        rx.internal.operators.x2$a r3 = r3.b
                        rx.internal.producers.a r3 = r3.e
                        r0 = 1
                        r3.b(r0)
                    L18:
                        return
                }

                public void setProducer(rx.g r2) {
                        r1 = this;
                        rx.internal.operators.x2$a$a r0 = r1.c
                        rx.internal.operators.x2$a r0 = r0.b
                        rx.internal.producers.a r0 = r0.e
                        r0.c(r2)
                        return
                }
            }

            C0031a(rx.internal.operators.x2.a r1, rx.e r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            public void call() {
                    r2 = this;
                    rx.internal.operators.x2$a r0 = r2.b
                    java.util.concurrent.atomic.AtomicInteger r0 = r0.f
                    r0.incrementAndGet()
                    rx.internal.operators.x2$a$a$a r0 = new rx.internal.operators.x2$a$a$a
                    r0.<init>(r2, r2)
                    rx.internal.operators.x2$a r1 = r2.b
                    rx.subscriptions.e r1 = r1.d
                    r1.b(r0)
                    rx.e r1 = r2.a
                    r1.J6(r0)
                    return
            }
        }

        public a(rx.l<? super T> r2, rx.functions.q<java.lang.Integer, java.lang.Throwable, java.lang.Boolean> r3, rx.h.a r4, rx.subscriptions.e r5, rx.internal.producers.a r6) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>()
                r1.f = r0
                r1.a = r2
                r1.b = r3
                r1.c = r4
                r1.d = r5
                r1.e = r6
                return
        }

        public void g(rx.e<T> r3) {
                r2 = this;
                rx.h$a r0 = r2.c
                rx.internal.operators.x2$a$a r1 = new rx.internal.operators.x2$a$a
                r1.<init>(r2, r3)
                r0.d(r1)
                return
        }

        public void onCompleted() {
                r0 = this;
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.l<? super T> r0 = r1.a
                r0.onError(r2)
                return
        }

        public /* bridge */ /* synthetic */ void onNext(java.lang.Object r1) {
                r0 = this;
                rx.e r1 = (rx.e) r1
                r0.g(r1)
                return
        }
    }

    public x2(rx.functions.q<java.lang.Integer, java.lang.Throwable, java.lang.Boolean> r1) {
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

    public rx.l<? super rx.e<T>> call(rx.l<? super T> r8) {
            r7 = this;
            rx.h r0 = rx.schedulers.c.m()
            rx.h$a r4 = r0.a()
            r8.add(r4)
            rx.subscriptions.e r5 = new rx.subscriptions.e
            r5.<init>()
            r8.add(r5)
            rx.internal.producers.a r6 = new rx.internal.producers.a
            r6.<init>()
            r8.setProducer(r6)
            rx.internal.operators.x2$a r1 = new rx.internal.operators.x2$a
            rx.functions.q<java.lang.Integer, java.lang.Throwable, java.lang.Boolean> r3 = r7.a
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }
}
