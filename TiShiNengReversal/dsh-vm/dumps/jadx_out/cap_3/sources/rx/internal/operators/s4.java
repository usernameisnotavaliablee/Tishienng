package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class s4<T> implements rx.i.t<T> {
    final rx.i.t<T> a;
    final rx.functions.p<java.lang.Throwable, ? extends T> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends rx.k<T> {
        final rx.k<? super T> b;
        final rx.functions.p<java.lang.Throwable, ? extends T> c;

        public a(rx.k<? super T> r1, rx.functions.p<java.lang.Throwable, ? extends T> r2) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                r0.c = r2
                return
        }

        public void d(T r2) {
                r1 = this;
                rx.k<? super T> r0 = r1.b
                r0.d(r2)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.functions.p<java.lang.Throwable, ? extends T> r0 = r1.c     // Catch: java.lang.Throwable -> Lc
                java.lang.Object r2 = r0.call(r2)     // Catch: java.lang.Throwable -> Lc
                rx.k<? super T> r0 = r1.b
                r0.d(r2)
                return
            Lc:
                r2 = move-exception
                rx.exceptions.a.e(r2)
                rx.k<? super T> r0 = r1.b
                r0.onError(r2)
                return
        }
    }

    public s4(rx.i.t<T> r1, rx.functions.p<java.lang.Throwable, ? extends T> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.k r1 = (rx.k) r1
            r0.call(r1)
            return
    }

    public void call(rx.k<? super T> r3) {
            r2 = this;
            rx.internal.operators.s4$a r0 = new rx.internal.operators.s4$a
            rx.functions.p<java.lang.Throwable, ? extends T> r1 = r2.b
            r0.<init>(r3, r1)
            r3.b(r0)
            rx.i$t<T> r3 = r2.a
            r3.call(r0)
            return
    }
}
