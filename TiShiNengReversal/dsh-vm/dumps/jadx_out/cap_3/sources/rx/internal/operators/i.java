package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class i<T> implements rx.b.j0 {
    final rx.i<T> a;
    final rx.functions.p<? super T, ? extends rx.b> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends rx.k<T> implements rx.d {
        final rx.d b;
        final rx.functions.p<? super T, ? extends rx.b> c;

        public a(rx.d r1, rx.functions.p<? super T, ? extends rx.b> r2) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                r0.c = r2
                return
        }

        public void a(rx.m r1) {
                r0 = this;
                r0.b(r1)
                return
        }

        public void d(T r2) {
                r1 = this;
                rx.functions.p<? super T, ? extends rx.b> r0 = r1.c     // Catch: java.lang.Throwable -> L19
                java.lang.Object r2 = r0.call(r2)     // Catch: java.lang.Throwable -> L19
                rx.b r2 = (rx.b) r2     // Catch: java.lang.Throwable -> L19
                if (r2 != 0) goto L15
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "The mapper returned a null Completable"
                r2.<init>(r0)
                r1.onError(r2)
                return
            L15:
                r2.q0(r1)
                return
            L19:
                r2 = move-exception
                rx.exceptions.a.e(r2)
                r1.onError(r2)
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.d r0 = r1.b
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.d r0 = r1.b
                r0.onError(r2)
                return
        }
    }

    public i(rx.i<T> r1, rx.functions.p<? super T, ? extends rx.b> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.d r1 = (rx.d) r1
            r0.call(r1)
            return
    }

    public void call(rx.d r3) {
            r2 = this;
            rx.internal.operators.i$a r0 = new rx.internal.operators.i$a
            rx.functions.p<? super T, ? extends rx.b> r1 = r2.b
            r0.<init>(r3, r1)
            r3.a(r0)
            rx.i<T> r3 = r2.a
            r3.j0(r0)
            return
    }
}
