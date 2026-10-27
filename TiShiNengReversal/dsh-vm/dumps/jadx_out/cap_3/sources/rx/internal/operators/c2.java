package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class c2<T> implements rx.e.b<T, T> {
    final rx.functions.a a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<T> {
        final /* synthetic */ rx.l a;
        final /* synthetic */ rx.internal.operators.c2 b;

        a(rx.internal.operators.c2 r1, rx.l r2, rx.l r3) {
                r0 = this;
                r0.b = r1
                r0.a = r3
                r0.<init>(r2)
                return
        }

        void g() {
                r1 = this;
                rx.internal.operators.c2 r0 = r1.b     // Catch: java.lang.Throwable -> L8
                rx.functions.a r0 = r0.a     // Catch: java.lang.Throwable -> L8
                r0.call()     // Catch: java.lang.Throwable -> L8
                return
            L8:
                r0 = move-exception
                rx.exceptions.a.e(r0)
                rx.plugins.c.I(r0)
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.l r0 = r1.a     // Catch: java.lang.Throwable -> L9
                r0.onCompleted()     // Catch: java.lang.Throwable -> L9
                r1.g()
                return
            L9:
                r0 = move-exception
                r1.g()
                throw r0
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.l r0 = r1.a     // Catch: java.lang.Throwable -> L9
                r0.onError(r2)     // Catch: java.lang.Throwable -> L9
                r1.g()
                return
            L9:
                r2 = move-exception
                r1.g()
                throw r2
        }

        public void onNext(T r2) {
                r1 = this;
                rx.l r0 = r1.a
                r0.onNext(r2)
                return
        }
    }

    public c2(rx.functions.a r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.a = r2
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "Action can not be null"
            r2.<init>(r0)
            throw r2
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super T> r2) {
            r1 = this;
            rx.internal.operators.c2$a r0 = new rx.internal.operators.c2$a
            r0.<init>(r1, r2, r2)
            return r0
    }
}
