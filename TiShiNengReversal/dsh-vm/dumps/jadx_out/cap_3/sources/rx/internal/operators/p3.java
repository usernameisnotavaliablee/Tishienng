package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class p3<T, E> implements rx.e.b<T, T> {
    private final rx.e<? extends E> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<T> {
        final /* synthetic */ rx.l a;
        final /* synthetic */ rx.internal.operators.p3 b;

        a(rx.internal.operators.p3 r1, rx.l r2, boolean r3, rx.l r4) {
                r0 = this;
                r0.b = r1
                r0.a = r4
                r0.<init>(r2, r3)
                return
        }

        public void onCompleted() {
                r2 = this;
                rx.l r0 = r2.a     // Catch: java.lang.Throwable -> Lb
                r0.onCompleted()     // Catch: java.lang.Throwable -> Lb
                rx.l r0 = r2.a
                r0.unsubscribe()
                return
            Lb:
                r0 = move-exception
                rx.l r1 = r2.a
                r1.unsubscribe()
                throw r0
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.l r0 = r1.a     // Catch: java.lang.Throwable -> Lb
                r0.onError(r2)     // Catch: java.lang.Throwable -> Lb
                rx.l r2 = r1.a
                r2.unsubscribe()
                return
            Lb:
                r2 = move-exception
                rx.l r0 = r1.a
                r0.unsubscribe()
                throw r2
        }

        public void onNext(T r2) {
                r1 = this;
                rx.l r0 = r1.a
                r0.onNext(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends rx.l<E> {
        final /* synthetic */ rx.l a;
        final /* synthetic */ rx.internal.operators.p3 b;

        b(rx.internal.operators.p3 r1, rx.l r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
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

        public void onNext(E r1) {
                r0 = this;
                r0.onCompleted()
                return
        }

        public void onStart() {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r2.request(r0)
                return
        }
    }

    public p3(rx.e<? extends E> r1) {
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
            r1 = 0
            r0.<init>(r4, r1)
            rx.internal.operators.p3$a r2 = new rx.internal.operators.p3$a
            r2.<init>(r3, r0, r1, r0)
            rx.internal.operators.p3$b r1 = new rx.internal.operators.p3$b
            r1.<init>(r3, r2)
            r0.add(r2)
            r0.add(r1)
            r4.add(r0)
            rx.e<? extends E> r4 = r3.a
            r4.J6(r1)
            return r2
    }
}
