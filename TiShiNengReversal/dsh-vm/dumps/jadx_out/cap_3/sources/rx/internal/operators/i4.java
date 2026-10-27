package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class i4<T> implements rx.i.t<T> {
    final rx.i<T> a;
    final rx.functions.a b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends rx.k<T> {
        final rx.k<? super T> b;
        final rx.functions.a c;

        public a(rx.k<? super T> r1, rx.functions.a r2) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                r0.c = r2
                return
        }

        public void d(T r2) {
                r1 = this;
                rx.k<? super T> r0 = r1.b     // Catch: java.lang.Throwable -> L9
                r0.d(r2)     // Catch: java.lang.Throwable -> L9
                r1.e()
                return
            L9:
                r2 = move-exception
                r1.e()
                throw r2
        }

        void e() {
                r1 = this;
                rx.functions.a r0 = r1.c     // Catch: java.lang.Throwable -> L6
                r0.call()     // Catch: java.lang.Throwable -> L6
                return
            L6:
                r0 = move-exception
                rx.exceptions.a.e(r0)
                rx.plugins.c.I(r0)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.k<? super T> r0 = r1.b     // Catch: java.lang.Throwable -> L9
                r0.onError(r2)     // Catch: java.lang.Throwable -> L9
                r1.e()
                return
            L9:
                r2 = move-exception
                r1.e()
                throw r2
        }
    }

    public i4(rx.i<T> r1, rx.functions.a r2) {
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
            rx.internal.operators.i4$a r0 = new rx.internal.operators.i4$a
            rx.functions.a r1 = r2.b
            r0.<init>(r3, r1)
            r3.b(r0)
            rx.i<T> r3 = r2.a
            r3.j0(r0)
            return
    }
}
