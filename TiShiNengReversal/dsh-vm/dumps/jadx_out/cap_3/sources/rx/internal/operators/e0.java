package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class e0<T, U> implements rx.e.a<T> {
    final rx.e<? extends T> a;
    final rx.functions.o<? extends rx.e<U>> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<U> {
        final /* synthetic */ rx.l a;
        final /* synthetic */ rx.internal.operators.e0 b;

        a(rx.internal.operators.e0 r1, rx.l r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void onCompleted() {
                r2 = this;
                rx.internal.operators.e0 r0 = r2.b
                rx.e<? extends T> r0 = r0.a
                rx.l r1 = r2.a
                rx.l r1 = rx.observers.h.f(r1)
                r0.J6(r1)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.l r0 = r1.a
                r0.onError(r2)
                return
        }

        public void onNext(U r1) {
                r0 = this;
                return
        }
    }

    public e0(rx.e<? extends T> r1, rx.functions.o<? extends rx.e<U>> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
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
            rx.functions.o<? extends rx.e<U>> r0 = r2.b     // Catch: java.lang.Throwable -> L16
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L16
            rx.e r0 = (rx.e) r0     // Catch: java.lang.Throwable -> L16
            r1 = 1
            rx.e r0 = r0.D5(r1)     // Catch: java.lang.Throwable -> L16
            rx.internal.operators.e0$a r1 = new rx.internal.operators.e0$a     // Catch: java.lang.Throwable -> L16
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L16
            r0.J6(r1)     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r0 = move-exception
            rx.exceptions.a.f(r0, r3)
            return
    }
}
