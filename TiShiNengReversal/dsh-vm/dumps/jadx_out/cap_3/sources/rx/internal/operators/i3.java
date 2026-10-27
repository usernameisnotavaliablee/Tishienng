package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class i3<T> implements rx.e.b<T, T> {
    final rx.functions.q<? super T, java.lang.Integer, java.lang.Boolean> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<T> {
        boolean a;
        int b;
        final /* synthetic */ rx.l c;
        final /* synthetic */ rx.internal.operators.i3 d;

        a(rx.internal.operators.i3 r1, rx.l r2, rx.l r3) {
                r0 = this;
                r0.d = r1
                r0.c = r3
                r0.<init>(r2)
                r1 = 1
                r0.a = r1
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.l r0 = r1.c
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.l r0 = r1.c
                r0.onError(r2)
                return
        }

        public void onNext(T r4) {
                r3 = this;
                boolean r0 = r3.a
                if (r0 != 0) goto La
                rx.l r0 = r3.c
                r0.onNext(r4)
                return
            La:
                rx.internal.operators.i3 r0 = r3.d     // Catch: java.lang.Throwable -> L33
                rx.functions.q<? super T, java.lang.Integer, java.lang.Boolean> r0 = r0.a     // Catch: java.lang.Throwable -> L33
                int r1 = r3.b     // Catch: java.lang.Throwable -> L33
                int r2 = r1 + 1
                r3.b = r2     // Catch: java.lang.Throwable -> L33
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L33
                java.lang.Object r0 = r0.call(r4, r1)     // Catch: java.lang.Throwable -> L33
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L33
                boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L33
                if (r0 != 0) goto L2d
                r0 = 0
                r3.a = r0
                rx.l r0 = r3.c
                r0.onNext(r4)
                return
            L2d:
                r0 = 1
                r3.request(r0)
                return
            L33:
                r0 = move-exception
                rx.l r1 = r3.c
                rx.exceptions.a.g(r0, r1, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b implements rx.functions.q<T, java.lang.Integer, java.lang.Boolean> {
        final /* synthetic */ rx.functions.p a;

        b(rx.functions.p r1) {
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

    public i3(rx.functions.q<? super T, java.lang.Integer, java.lang.Boolean> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static <T> rx.functions.q<T, java.lang.Integer, java.lang.Boolean> a(rx.functions.p<? super T, java.lang.Boolean> r1) {
            rx.internal.operators.i3$b r0 = new rx.internal.operators.i3$b
            r0.<init>(r1)
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super T> r2) {
            r1 = this;
            rx.internal.operators.i3$a r0 = new rx.internal.operators.i3$a
            r0.<init>(r1, r2, r2)
            return r0
    }
}
