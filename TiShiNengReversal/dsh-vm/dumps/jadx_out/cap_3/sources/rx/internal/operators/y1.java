package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class y1<T, V> implements rx.e.b<T, T> {
    final rx.e<? extends T> a;
    final rx.functions.p<? super T, ? extends rx.e<V>> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<T> {
        final /* synthetic */ rx.subjects.c a;
        final /* synthetic */ rx.observers.g b;
        final /* synthetic */ rx.internal.operators.y1 c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.operators.y1$a$a, reason: collision with other inner class name */
        class C0033a implements rx.functions.p<V, T> {
            final /* synthetic */ java.lang.Object a;
            final /* synthetic */ rx.internal.operators.y1.a b;

            C0033a(rx.internal.operators.y1.a r1, java.lang.Object r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            public T call(V r1) {
                    r0 = this;
                    java.lang.Object r1 = r0.a
                    return r1
            }
        }

        a(rx.internal.operators.y1 r1, rx.l r2, rx.subjects.c r3, rx.observers.g r4) {
                r0 = this;
                r0.c = r1
                r0.a = r3
                r0.b = r4
                r0.<init>(r2)
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.subjects.c r0 = r1.a
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.observers.g r0 = r1.b
                r0.onError(r2)
                return
        }

        public void onNext(T r4) {
                r3 = this;
                rx.subjects.c r0 = r3.a     // Catch: java.lang.Throwable -> L23
                rx.internal.operators.y1 r1 = r3.c     // Catch: java.lang.Throwable -> L23
                rx.functions.p<? super T, ? extends rx.e<V>> r1 = r1.b     // Catch: java.lang.Throwable -> L23
                java.lang.Object r1 = r1.call(r4)     // Catch: java.lang.Throwable -> L23
                rx.e r1 = (rx.e) r1     // Catch: java.lang.Throwable -> L23
                r2 = 1
                rx.e r1 = r1.D5(r2)     // Catch: java.lang.Throwable -> L23
                r2 = 0
                rx.e r1 = r1.q1(r2)     // Catch: java.lang.Throwable -> L23
                rx.internal.operators.y1$a$a r2 = new rx.internal.operators.y1$a$a     // Catch: java.lang.Throwable -> L23
                r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L23
                rx.e r4 = r1.c3(r2)     // Catch: java.lang.Throwable -> L23
                r0.onNext(r4)     // Catch: java.lang.Throwable -> L23
                return
            L23:
                r4 = move-exception
                rx.exceptions.a.f(r4, r3)
                return
        }
    }

    public y1(rx.e<? extends T> r1, rx.functions.p<? super T, ? extends rx.e<V>> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super T> r5) {
            r4 = this;
            rx.observers.g r0 = new rx.observers.g
            r0.<init>(r5)
            rx.subjects.c r1 = rx.subjects.c.y7()
            rx.e r2 = rx.e.h3(r1)
            rx.l r3 = rx.observers.h.e(r0)
            rx.m r2 = r2.J6(r3)
            r5.add(r2)
            rx.internal.operators.y1$a r2 = new rx.internal.operators.y1$a
            r2.<init>(r4, r5, r1, r0)
            return r2
    }
}
