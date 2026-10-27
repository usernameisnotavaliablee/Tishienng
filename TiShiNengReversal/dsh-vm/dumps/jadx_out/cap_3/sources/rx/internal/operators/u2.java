package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class u2<T> implements rx.e.b<T, T> {
    final rx.functions.p<? super java.lang.Throwable, ? extends rx.e<? extends T>> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements rx.functions.p<java.lang.Throwable, rx.e<? extends T>> {
        final /* synthetic */ rx.functions.p a;

        a(rx.functions.p r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                rx.e r1 = r0.call(r1)
                return r1
        }

        public rx.e<? extends T> call(java.lang.Throwable r2) {
                r1 = this;
                rx.functions.p r0 = r1.a
                java.lang.Object r2 = r0.call(r2)
                rx.e r2 = rx.e.M2(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b implements rx.functions.p<java.lang.Throwable, rx.e<? extends T>> {
        final /* synthetic */ rx.e a;

        b(rx.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                rx.e r1 = r0.call(r1)
                return r1
        }

        public rx.e<? extends T> call(java.lang.Throwable r1) {
                r0 = this;
                rx.e r1 = r0.a
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class c implements rx.functions.p<java.lang.Throwable, rx.e<? extends T>> {
        final /* synthetic */ rx.e a;

        c(rx.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                rx.e r1 = r0.call(r1)
                return r1
        }

        public rx.e<? extends T> call(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.Exception
                if (r0 == 0) goto L7
                rx.e r2 = r1.a
                return r2
            L7:
                rx.e r2 = rx.e.T1(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends rx.l<T> {
        private boolean a;
        long b;
        final /* synthetic */ rx.l c;
        final /* synthetic */ rx.internal.producers.a d;
        final /* synthetic */ rx.subscriptions.e e;
        final /* synthetic */ rx.internal.operators.u2 f;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends rx.l<T> {
            final /* synthetic */ rx.internal.operators.u2.d a;

            a(rx.internal.operators.u2.d r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void onCompleted() {
                    r1 = this;
                    rx.internal.operators.u2$d r0 = r1.a
                    rx.l r0 = r0.c
                    r0.onCompleted()
                    return
            }

            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    rx.internal.operators.u2$d r0 = r1.a
                    rx.l r0 = r0.c
                    r0.onError(r2)
                    return
            }

            public void onNext(T r2) {
                    r1 = this;
                    rx.internal.operators.u2$d r0 = r1.a
                    rx.l r0 = r0.c
                    r0.onNext(r2)
                    return
            }

            public void setProducer(rx.g r2) {
                    r1 = this;
                    rx.internal.operators.u2$d r0 = r1.a
                    rx.internal.producers.a r0 = r0.d
                    r0.c(r2)
                    return
            }
        }

        d(rx.internal.operators.u2 r1, rx.l r2, rx.internal.producers.a r3, rx.subscriptions.e r4) {
                r0 = this;
                r0.f = r1
                r0.c = r2
                r0.d = r3
                r0.e = r4
                r0.<init>()
                return
        }

        public void onCompleted() {
                r1 = this;
                boolean r0 = r1.a
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.a = r0
                rx.l r0 = r1.c
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r7) {
                r6 = this;
                boolean r0 = r6.a
                if (r0 == 0) goto Lb
                rx.exceptions.a.e(r7)
                rx.plugins.c.I(r7)
                return
            Lb:
                r0 = 1
                r6.a = r0
                r6.unsubscribe()     // Catch: java.lang.Throwable -> L29
                rx.internal.operators.u2$d$a r0 = new rx.internal.operators.u2$d$a     // Catch: java.lang.Throwable -> L29
                r0.<init>(r6)     // Catch: java.lang.Throwable -> L29
                rx.subscriptions.e r1 = r6.e     // Catch: java.lang.Throwable -> L29
                r1.b(r0)     // Catch: java.lang.Throwable -> L29
                long r1 = r6.b     // Catch: java.lang.Throwable -> L29
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L2b
                rx.internal.producers.a r3 = r6.d     // Catch: java.lang.Throwable -> L29
                r3.b(r1)     // Catch: java.lang.Throwable -> L29
                goto L2b
            L29:
                r7 = move-exception
                goto L39
            L2b:
                rx.internal.operators.u2 r1 = r6.f     // Catch: java.lang.Throwable -> L29
                rx.functions.p<? super java.lang.Throwable, ? extends rx.e<? extends T>> r1 = r1.a     // Catch: java.lang.Throwable -> L29
                java.lang.Object r7 = r1.call(r7)     // Catch: java.lang.Throwable -> L29
                rx.e r7 = (rx.e) r7     // Catch: java.lang.Throwable -> L29
                r7.J6(r0)     // Catch: java.lang.Throwable -> L29
                return
            L39:
                rx.l r0 = r6.c
                rx.exceptions.a.f(r7, r0)
                return
        }

        public void onNext(T r5) {
                r4 = this;
                boolean r0 = r4.a
                if (r0 == 0) goto L5
                return
            L5:
                long r0 = r4.b
                r2 = 1
                long r0 = r0 + r2
                r4.b = r0
                rx.l r0 = r4.c
                r0.onNext(r5)
                return
        }

        public void setProducer(rx.g r2) {
                r1 = this;
                rx.internal.producers.a r0 = r1.d
                r0.c(r2)
                return
        }
    }

    public u2(rx.functions.p<? super java.lang.Throwable, ? extends rx.e<? extends T>> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static <T> rx.internal.operators.u2<T> a(rx.e<? extends T> r2) {
            rx.internal.operators.u2 r0 = new rx.internal.operators.u2
            rx.internal.operators.u2$c r1 = new rx.internal.operators.u2$c
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static <T> rx.internal.operators.u2<T> b(rx.e<? extends T> r2) {
            rx.internal.operators.u2 r0 = new rx.internal.operators.u2
            rx.internal.operators.u2$b r1 = new rx.internal.operators.u2$b
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static <T> rx.internal.operators.u2<T> c(rx.functions.p<? super java.lang.Throwable, ? extends T> r2) {
            rx.internal.operators.u2 r0 = new rx.internal.operators.u2
            rx.internal.operators.u2$a r1 = new rx.internal.operators.u2$a
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super T> r4) {
            r3 = this;
            rx.internal.producers.a r0 = new rx.internal.producers.a
            r0.<init>()
            rx.subscriptions.e r1 = new rx.subscriptions.e
            r1.<init>()
            rx.internal.operators.u2$d r2 = new rx.internal.operators.u2$d
            r2.<init>(r3, r4, r0, r1)
            r1.b(r2)
            r4.add(r1)
            r4.setProducer(r0)
            return r2
    }
}
