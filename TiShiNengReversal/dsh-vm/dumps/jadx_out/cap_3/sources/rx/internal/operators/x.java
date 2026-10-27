package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class x<T, R> implements rx.e.a<R> {
    final rx.e<T> a;
    final rx.functions.o<R> b;
    final rx.functions.c<R, ? super T> c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T, R> extends rx.internal.operators.u<T, R> {
        final rx.functions.c<R, ? super T> j;

        public a(rx.l<? super R> r1, R r2, rx.functions.c<R, ? super T> r3) {
                r0 = this;
                r0.<init>(r1)
                r0.c = r2
                r1 = 1
                r0.b = r1
                r0.j = r3
                return
        }

        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.i
                if (r0 == 0) goto L5
                return
            L5:
                rx.functions.c<R, ? super T> r0 = r2.j     // Catch: java.lang.Throwable -> Ld
                R r1 = r2.c     // Catch: java.lang.Throwable -> Ld
                r0.call(r1, r3)     // Catch: java.lang.Throwable -> Ld
                return
            Ld:
                r3 = move-exception
                rx.exceptions.a.e(r3)
                r2.unsubscribe()
                r2.onError(r3)
                return
        }
    }

    public x(rx.e<T> r1, rx.functions.o<R> r2, rx.functions.c<R, ? super T> r3) {
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
            rx.functions.o<R> r0 = r3.b     // Catch: java.lang.Throwable -> L13
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L13
            rx.internal.operators.x$a r1 = new rx.internal.operators.x$a
            rx.functions.c<R, ? super T> r2 = r3.c
            r1.<init>(r4, r0, r2)
            rx.e<T> r4 = r3.a
            r1.B(r4)
            return
        L13:
            r0 = move-exception
            rx.exceptions.a.e(r0)
            r4.onError(r0)
            return
    }
}
