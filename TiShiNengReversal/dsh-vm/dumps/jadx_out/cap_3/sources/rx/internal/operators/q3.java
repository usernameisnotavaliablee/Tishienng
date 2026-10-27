package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class q3<T> implements rx.e.b<T, T> {
    final rx.functions.p<? super T, java.lang.Boolean> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.g {
        final /* synthetic */ rx.internal.operators.q3.b a;
        final /* synthetic */ rx.internal.operators.q3 b;

        a(rx.internal.operators.q3 r1, rx.internal.operators.q3.b r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void request(long r2) {
                r1 = this;
                rx.internal.operators.q3$b r0 = r1.a
                r0.g(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class b extends rx.l<T> {
        private final rx.l<? super T> a;
        private boolean b;
        final /* synthetic */ rx.internal.operators.q3 c;

        b(rx.internal.operators.q3 r1, rx.l<? super T> r2) {
                r0 = this;
                r0.c = r1
                r0.<init>()
                r0.a = r2
                return
        }

        void g(long r1) {
                r0 = this;
                r0.request(r1)
                return
        }

        public void onCompleted() {
                r1 = this;
                boolean r0 = r1.b
                if (r0 != 0) goto L9
                rx.l<? super T> r0 = r1.a
                r0.onCompleted()
            L9:
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.b
                if (r0 != 0) goto L9
                rx.l<? super T> r0 = r1.a
                r0.onError(r2)
            L9:
                return
        }

        public void onNext(T r3) {
                r2 = this;
                rx.l<? super T> r0 = r2.a
                r0.onNext(r3)
                r0 = 1
                rx.internal.operators.q3 r1 = r2.c     // Catch: java.lang.Throwable -> L21
                rx.functions.p<? super T, java.lang.Boolean> r1 = r1.a     // Catch: java.lang.Throwable -> L21
                java.lang.Object r1 = r1.call(r3)     // Catch: java.lang.Throwable -> L21
                java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L21
                boolean r3 = r1.booleanValue()     // Catch: java.lang.Throwable -> L21
                if (r3 == 0) goto L20
                r2.b = r0
                rx.l<? super T> r3 = r2.a
                r3.onCompleted()
                r2.unsubscribe()
            L20:
                return
            L21:
                r1 = move-exception
                r2.b = r0
                rx.l<? super T> r0 = r2.a
                rx.exceptions.a.g(r1, r0, r3)
                r2.unsubscribe()
                return
        }
    }

    public q3(rx.functions.p<? super T, java.lang.Boolean> r1) {
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
            rx.internal.operators.q3$b r0 = new rx.internal.operators.q3$b
            r0.<init>(r2, r3)
            r3.add(r0)
            rx.internal.operators.q3$a r1 = new rx.internal.operators.q3$a
            r1.<init>(r2, r0)
            r3.setProducer(r1)
            return r0
    }
}
