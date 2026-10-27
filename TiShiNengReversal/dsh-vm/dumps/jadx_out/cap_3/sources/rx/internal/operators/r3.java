package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class r3<T> implements rx.e.b<T, T> {
    final rx.functions.q<? super T, ? super java.lang.Integer, java.lang.Boolean> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.functions.q<T, java.lang.Integer, java.lang.Boolean> {
        final /* synthetic */ rx.functions.p a;

        a(rx.functions.p r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public java.lang.Boolean call(T r1, java.lang.Integer r2) {
                r0 = this;
                rx.functions.p r2 = r0.a
                java.lang.Object r1 = r2.call(r1)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                return r1
        }

        public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Integer r2 = (java.lang.Integer) r2
                java.lang.Boolean r1 = r0.call(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends rx.l<T> {
        private int a;
        private boolean b;
        final /* synthetic */ rx.l c;
        final /* synthetic */ rx.internal.operators.r3 d;

        b(rx.internal.operators.r3 r1, rx.l r2, boolean r3, rx.l r4) {
                r0 = this;
                r0.d = r1
                r0.c = r4
                r0.<init>(r2, r3)
                return
        }

        public void onCompleted() {
                r1 = this;
                boolean r0 = r1.b
                if (r0 != 0) goto L9
                rx.l r0 = r1.c
                r0.onCompleted()
            L9:
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.b
                if (r0 != 0) goto L9
                rx.l r0 = r1.c
                r0.onError(r2)
            L9:
                return
        }

        public void onNext(T r5) {
                r4 = this;
                r0 = 1
                rx.internal.operators.r3 r1 = r4.d     // Catch: java.lang.Throwable -> L2c
                rx.functions.q<? super T, ? super java.lang.Integer, java.lang.Boolean> r1 = r1.a     // Catch: java.lang.Throwable -> L2c
                int r2 = r4.a     // Catch: java.lang.Throwable -> L2c
                int r3 = r2 + 1
                r4.a = r3     // Catch: java.lang.Throwable -> L2c
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L2c
                java.lang.Object r1 = r1.call(r5, r2)     // Catch: java.lang.Throwable -> L2c
                java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L2c
                boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L2c
                if (r1 == 0) goto L21
                rx.l r0 = r4.c
                r0.onNext(r5)
                return
            L21:
                r4.b = r0
                rx.l r5 = r4.c
                r5.onCompleted()
                r4.unsubscribe()
                return
            L2c:
                r1 = move-exception
                r4.b = r0
                rx.l r0 = r4.c
                rx.exceptions.a.g(r1, r0, r5)
                r4.unsubscribe()
                return
        }
    }

    public r3(rx.functions.p<? super T, java.lang.Boolean> r2) {
            r1 = this;
            rx.internal.operators.r3$a r0 = new rx.internal.operators.r3$a
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public r3(rx.functions.q<? super T, ? super java.lang.Integer, java.lang.Boolean> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super T> r3) {
            r2 = this;
            rx.internal.operators.r3$b r0 = new rx.internal.operators.r3$b
            r1 = 0
            r0.<init>(r2, r3, r1, r3)
            r3.add(r0)
            return r0
    }
}
