package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class g0<T> implements rx.e.a<T> {
    private final rx.f<? super T> a;
    private final rx.e<T> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a<T> extends rx.l<T> {
        private final rx.l<? super T> a;
        private final rx.f<? super T> b;
        private boolean c;

        a(rx.l<? super T> r1, rx.f<? super T> r2) {
                r0 = this;
                r0.<init>(r1)
                r0.a = r1
                r0.b = r2
                return
        }

        public void onCompleted() {
                r1 = this;
                boolean r0 = r1.c
                if (r0 == 0) goto L5
                return
            L5:
                rx.f<? super T> r0 = r1.b     // Catch: java.lang.Throwable -> L13
                r0.onCompleted()     // Catch: java.lang.Throwable -> L13
                r0 = 1
                r1.c = r0
                rx.l<? super T> r0 = r1.a
                r0.onCompleted()
                return
            L13:
                r0 = move-exception
                rx.exceptions.a.f(r0, r1)
                return
        }

        public void onError(java.lang.Throwable r7) {
                r6 = this;
                boolean r0 = r6.c
                if (r0 == 0) goto L8
                rx.plugins.c.I(r7)
                return
            L8:
                r0 = 1
                r6.c = r0
                rx.f<? super T> r1 = r6.b     // Catch: java.lang.Throwable -> L16
                r1.onError(r7)     // Catch: java.lang.Throwable -> L16
                rx.l<? super T> r0 = r6.a
                r0.onError(r7)
                return
            L16:
                r1 = move-exception
                rx.exceptions.a.e(r1)
                rx.l<? super T> r2 = r6.a
                rx.exceptions.CompositeException r3 = new rx.exceptions.CompositeException
                r4 = 2
                java.lang.Throwable[] r4 = new java.lang.Throwable[r4]
                r5 = 0
                r4[r5] = r7
                r4[r0] = r1
                java.util.List r7 = java.util.Arrays.asList(r4)
                r3.<init>(r7)
                r2.onError(r3)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.c
                if (r0 == 0) goto L5
                return
            L5:
                rx.f<? super T> r0 = r1.b     // Catch: java.lang.Throwable -> L10
                r0.onNext(r2)     // Catch: java.lang.Throwable -> L10
                rx.l<? super T> r0 = r1.a
                r0.onNext(r2)
                return
            L10:
                r0 = move-exception
                rx.exceptions.a.g(r0, r1, r2)
                return
        }
    }

    public g0(rx.e<T> r1, rx.f<? super T> r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.a = r2
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super T> r4) {
            r3 = this;
            rx.e<T> r0 = r3.b
            rx.internal.operators.g0$a r1 = new rx.internal.operators.g0$a
            rx.f<? super T> r2 = r3.a
            r1.<init>(r4, r2)
            r0.J6(r1)
            return
    }
}
