package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class g4<T1, T2, R> implements rx.e.b<R, T1> {
    final java.lang.Iterable<? extends T2> a;
    final rx.functions.q<? super T1, ? super T2, ? extends R> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<T1> {
        boolean a;
        final /* synthetic */ rx.l b;
        final /* synthetic */ java.util.Iterator c;
        final /* synthetic */ rx.internal.operators.g4 d;

        a(rx.internal.operators.g4 r1, rx.l r2, rx.l r3, java.util.Iterator r4) {
                r0 = this;
                r0.d = r1
                r0.b = r3
                r0.c = r4
                r0.<init>(r2)
                return
        }

        public void onCompleted() {
                r1 = this;
                boolean r0 = r1.a
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.a = r0
                rx.l r0 = r1.b
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.a
                if (r0 == 0) goto L8
                rx.exceptions.a.e(r2)
                return
            L8:
                r0 = 1
                r1.a = r0
                rx.l r0 = r1.b
                r0.onError(r2)
                return
        }

        public void onNext(T1 r4) {
                r3 = this;
                boolean r0 = r3.a
                if (r0 == 0) goto L5
                goto L26
            L5:
                rx.l r0 = r3.b     // Catch: java.lang.Throwable -> L24
                rx.internal.operators.g4 r1 = r3.d     // Catch: java.lang.Throwable -> L24
                rx.functions.q<? super T1, ? super T2, ? extends R> r1 = r1.b     // Catch: java.lang.Throwable -> L24
                java.util.Iterator r2 = r3.c     // Catch: java.lang.Throwable -> L24
                java.lang.Object r2 = r2.next()     // Catch: java.lang.Throwable -> L24
                java.lang.Object r4 = r1.call(r4, r2)     // Catch: java.lang.Throwable -> L24
                r0.onNext(r4)     // Catch: java.lang.Throwable -> L24
                java.util.Iterator r4 = r3.c     // Catch: java.lang.Throwable -> L24
                boolean r4 = r4.hasNext()     // Catch: java.lang.Throwable -> L24
                if (r4 != 0) goto L26
                r3.onCompleted()     // Catch: java.lang.Throwable -> L24
                return
            L24:
                r4 = move-exception
                goto L27
            L26:
                return
            L27:
                rx.exceptions.a.f(r4, r3)
                return
        }
    }

    public g4(java.lang.Iterable<? extends T2> r1, rx.functions.q<? super T1, ? super T2, ? extends R> r2) {
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

    public rx.l<? super T1> call(rx.l<? super R> r3) {
            r2 = this;
            java.lang.Iterable<? extends T2> r0 = r2.a
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L16
            r3.onCompleted()     // Catch: java.lang.Throwable -> L14
            rx.l r3 = rx.observers.h.d()     // Catch: java.lang.Throwable -> L14
            return r3
        L14:
            r0 = move-exception
            goto L1c
        L16:
            rx.internal.operators.g4$a r1 = new rx.internal.operators.g4$a
            r1.<init>(r2, r3, r3, r0)
            return r1
        L1c:
            rx.exceptions.a.f(r0, r3)
            rx.l r3 = rx.observers.h.d()
            return r3
    }
}
