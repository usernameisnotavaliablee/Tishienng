package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class v1<T, U> implements rx.e.b<T, T> {
    final rx.functions.p<? super T, ? extends rx.e<U>> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<T> {
        final rx.internal.operators.w1.b<T> a;
        final rx.l<?> b;
        final /* synthetic */ rx.observers.g c;
        final /* synthetic */ rx.subscriptions.e d;
        final /* synthetic */ rx.internal.operators.v1 e;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.operators.v1$a$a, reason: collision with other inner class name */
        class C0027a extends rx.l<U> {
            final /* synthetic */ int a;
            final /* synthetic */ rx.internal.operators.v1.a b;

            C0027a(rx.internal.operators.v1.a r1, int r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            public void onCompleted() {
                    r4 = this;
                    rx.internal.operators.v1$a r0 = r4.b
                    rx.internal.operators.w1$b<T> r1 = r0.a
                    int r2 = r4.a
                    rx.observers.g r3 = r0.c
                    rx.l<?> r0 = r0.b
                    r1.b(r2, r3, r0)
                    r4.unsubscribe()
                    return
            }

            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    rx.internal.operators.v1$a r0 = r1.b
                    rx.l<?> r0 = r0.b
                    r0.onError(r2)
                    return
            }

            public void onNext(U r1) {
                    r0 = this;
                    r0.onCompleted()
                    return
            }
        }

        a(rx.internal.operators.v1 r1, rx.l r2, rx.observers.g r3, rx.subscriptions.e r4) {
                r0 = this;
                r0.e = r1
                r0.c = r3
                r0.d = r4
                r0.<init>(r2)
                rx.internal.operators.w1$b r1 = new rx.internal.operators.w1$b
                r1.<init>()
                r0.a = r1
                r0.b = r0
                return
        }

        public void onCompleted() {
                r2 = this;
                rx.internal.operators.w1$b<T> r0 = r2.a
                rx.observers.g r1 = r2.c
                r0.c(r1, r2)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.observers.g r0 = r1.c
                r0.onError(r2)
                r1.unsubscribe()
                rx.internal.operators.w1$b<T> r2 = r1.a
                r2.a()
                return
        }

        public void onNext(T r3) {
                r2 = this;
                rx.internal.operators.v1 r0 = r2.e     // Catch: java.lang.Throwable -> L1e
                rx.functions.p<? super T, ? extends rx.e<U>> r0 = r0.a     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r0 = r0.call(r3)     // Catch: java.lang.Throwable -> L1e
                rx.e r0 = (rx.e) r0     // Catch: java.lang.Throwable -> L1e
                rx.internal.operators.w1$b<T> r1 = r2.a
                int r3 = r1.d(r3)
                rx.internal.operators.v1$a$a r1 = new rx.internal.operators.v1$a$a
                r1.<init>(r2, r3)
                rx.subscriptions.e r3 = r2.d
                r3.b(r1)
                r0.J6(r1)
                return
            L1e:
                r3 = move-exception
                rx.exceptions.a.f(r3, r2)
                return
        }

        public void onStart() {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r2.request(r0)
                return
        }
    }

    public v1(rx.functions.p<? super T, ? extends rx.e<U>> r1) {
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

    public rx.l<? super T> call(rx.l<? super T> r4) {
            r3 = this;
            rx.observers.g r0 = new rx.observers.g
            r0.<init>(r4)
            rx.subscriptions.e r1 = new rx.subscriptions.e
            r1.<init>()
            r4.add(r1)
            rx.internal.operators.v1$a r2 = new rx.internal.operators.v1$a
            r2.<init>(r3, r4, r0, r1)
            return r2
    }
}
