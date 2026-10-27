package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class j4<T> implements rx.i.t<T> {
    final rx.i<T> a;
    final rx.functions.b<? super T> b;
    final rx.functions.b<java.lang.Throwable> c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends rx.k<T> {
        final rx.k<? super T> b;
        final rx.functions.b<? super T> c;
        final rx.functions.b<java.lang.Throwable> d;

        a(rx.k<? super T> r1, rx.functions.b<? super T> r2, rx.functions.b<java.lang.Throwable> r3) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                r0.c = r2
                r0.d = r3
                return
        }

        public void d(T r2) {
                r1 = this;
                rx.functions.b<? super T> r0 = r1.c     // Catch: java.lang.Throwable -> Lb
                r0.call(r2)     // Catch: java.lang.Throwable -> Lb
                rx.k<? super T> r0 = r1.b
                r0.d(r2)
                return
            Lb:
                r0 = move-exception
                rx.exceptions.a.i(r0, r1, r2)
                return
        }

        public void onError(java.lang.Throwable r6) {
                r5 = this;
                rx.functions.b<java.lang.Throwable> r0 = r5.d     // Catch: java.lang.Throwable -> Lb
                r0.call(r6)     // Catch: java.lang.Throwable -> Lb
                rx.k<? super T> r0 = r5.b
                r0.onError(r6)
                return
            Lb:
                r0 = move-exception
                rx.exceptions.a.e(r0)
                rx.k<? super T> r1 = r5.b
                rx.exceptions.CompositeException r2 = new rx.exceptions.CompositeException
                r3 = 2
                java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
                r4 = 0
                r3[r4] = r6
                r6 = 1
                r3[r6] = r0
                r2.<init>(r3)
                r1.onError(r2)
                return
        }
    }

    public j4(rx.i<T> r1, rx.functions.b<? super T> r2, rx.functions.b<java.lang.Throwable> r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.k r1 = (rx.k) r1
            r0.call(r1)
            return
    }

    public void call(rx.k<? super T> r4) {
            r3 = this;
            rx.internal.operators.j4$a r0 = new rx.internal.operators.j4$a
            rx.functions.b<? super T> r1 = r3.b
            rx.functions.b<java.lang.Throwable> r2 = r3.c
            r0.<init>(r4, r1, r2)
            r4.b(r0)
            rx.i<T> r4 = r3.a
            r4.j0(r0)
            return
    }
}
