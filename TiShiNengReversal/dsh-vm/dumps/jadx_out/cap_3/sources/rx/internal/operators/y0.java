package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class y0<T, R> implements rx.e.a<R> {
    final rx.e<T> a;
    final R b;
    final rx.functions.q<R, ? super T, R> c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T, R> extends rx.internal.operators.t<T, R> {
        final rx.functions.q<R, ? super T, R> i;

        public a(rx.l<? super R> r1, R r2, rx.functions.q<R, ? super T, R> r3) {
                r0 = this;
                r0.<init>(r1)
                r0.c = r2
                r1 = 1
                r0.b = r1
                r0.i = r3
                return
        }

        public void onNext(T r3) {
                r2 = this;
                rx.functions.q<R, ? super T, R> r0 = r2.i     // Catch: java.lang.Throwable -> Lb
                R r1 = r2.c     // Catch: java.lang.Throwable -> Lb
                java.lang.Object r3 = r0.call(r1, r3)     // Catch: java.lang.Throwable -> Lb
                r2.c = r3     // Catch: java.lang.Throwable -> Lb
                return
            Lb:
                r3 = move-exception
                rx.exceptions.a.e(r3)
                r2.unsubscribe()
                rx.l<? super R> r0 = r2.a
                r0.onError(r3)
                return
        }
    }

    public y0(rx.e<T> r1, R r2, rx.functions.q<R, ? super T, R> r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super R> r4) {
            r3 = this;
            rx.internal.operators.y0$a r0 = new rx.internal.operators.y0$a
            R r1 = r3.b
            rx.functions.q<R, ? super T, R> r2 = r3.c
            r0.<init>(r4, r1, r2)
            rx.e<T> r4 = r3.a
            r0.B(r4)
            return
    }
}
