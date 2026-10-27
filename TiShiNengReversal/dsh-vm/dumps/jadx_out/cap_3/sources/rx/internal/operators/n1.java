package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class n1<T> implements rx.e.b<java.lang.Boolean, T> {
    final rx.functions.p<? super T, java.lang.Boolean> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<T> {
        boolean a;
        final /* synthetic */ rx.internal.producers.SingleDelayedProducer b;
        final /* synthetic */ rx.l c;
        final /* synthetic */ rx.internal.operators.n1 d;

        a(rx.internal.operators.n1 r1, rx.internal.producers.SingleDelayedProducer r2, rx.l r3) {
                r0 = this;
                r0.d = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        public void onCompleted() {
                r2 = this;
                boolean r0 = r2.a
                if (r0 != 0) goto Le
                r0 = 1
                r2.a = r0
                rx.internal.producers.SingleDelayedProducer r0 = r2.b
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r0.setValue(r1)
            Le:
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.a
                if (r0 != 0) goto Ld
                r0 = 1
                r1.a = r0
                rx.l r0 = r1.c
                r0.onError(r2)
                return
            Ld:
                rx.plugins.c.I(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.a
                if (r0 == 0) goto L5
                goto L22
            L5:
                rx.internal.operators.n1 r0 = r1.d     // Catch: java.lang.Throwable -> L23
                rx.functions.p<? super T, java.lang.Boolean> r0 = r0.a     // Catch: java.lang.Throwable -> L23
                java.lang.Object r0 = r0.call(r2)     // Catch: java.lang.Throwable -> L23
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L23
                boolean r2 = r0.booleanValue()
                if (r2 != 0) goto L22
                r2 = 1
                r1.a = r2
                rx.internal.producers.SingleDelayedProducer r2 = r1.b
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                r2.setValue(r0)
                r1.unsubscribe()
            L22:
                return
            L23:
                r0 = move-exception
                rx.exceptions.a.g(r0, r1, r2)
                return
        }
    }

    public n1(rx.functions.p<? super T, java.lang.Boolean> r1) {
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

    public rx.l<? super T> call(rx.l<? super java.lang.Boolean> r3) {
            r2 = this;
            rx.internal.producers.SingleDelayedProducer r0 = new rx.internal.producers.SingleDelayedProducer
            r0.<init>(r3)
            rx.internal.operators.n1$a r1 = new rx.internal.operators.n1$a
            r1.<init>(r2, r0, r3)
            r3.add(r1)
            r3.setProducer(r0)
            return r1
    }
}
