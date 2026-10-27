package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class q4<T, R> implements rx.i.t<R> {
    final rx.i.t<T> a;
    final rx.e.b<? extends R, ? super T> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends rx.k<T> {
        final rx.l<? super T> b;

        a(rx.l<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                return
        }

        public void d(T r4) {
                r3 = this;
                rx.l<? super T> r0 = r3.b
                rx.internal.producers.SingleProducer r1 = new rx.internal.producers.SingleProducer
                rx.l<? super T> r2 = r3.b
                r1.<init>(r2, r4)
                r0.setProducer(r1)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.l<? super T> r0 = r1.b
                r0.onError(r2)
                return
        }
    }

    public q4(rx.i.t<T> r1, rx.e.b<? extends R, ? super T> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public static <T> rx.k<T> a(rx.l<T> r1) {
            rx.internal.operators.q4$a r0 = new rx.internal.operators.q4$a
            r0.<init>(r1)
            r1.add(r0)
            return r0
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.k r1 = (rx.k) r1
            r0.call(r1)
            return
    }

    public void call(rx.k<? super R> r3) {
            r2 = this;
            rx.internal.operators.p4$a r0 = new rx.internal.operators.p4$a
            r0.<init>(r3)
            r3.b(r0)
            rx.e$b<? extends R, ? super T> r1 = r2.b     // Catch: java.lang.Throwable -> L21
            rx.e$b r1 = rx.plugins.c.R(r1)     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = r1.call(r0)     // Catch: java.lang.Throwable -> L21
            rx.l r0 = (rx.l) r0     // Catch: java.lang.Throwable -> L21
            rx.k r1 = a(r0)     // Catch: java.lang.Throwable -> L21
            r0.onStart()     // Catch: java.lang.Throwable -> L21
            rx.i$t<T> r0 = r2.a     // Catch: java.lang.Throwable -> L21
            r0.call(r1)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r0 = move-exception
            rx.exceptions.a.h(r0, r3)
            return
    }
}
