package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class o1<T> implements rx.e.b<java.lang.Boolean, T> {
    final rx.functions.p<? super T, java.lang.Boolean> a;
    final boolean b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<T> {
        boolean a;
        boolean b;
        final /* synthetic */ rx.internal.producers.SingleDelayedProducer c;
        final /* synthetic */ rx.l d;
        final /* synthetic */ rx.internal.operators.o1 e;

        a(rx.internal.operators.o1 r1, rx.internal.producers.SingleDelayedProducer r2, rx.l r3) {
                r0 = this;
                r0.e = r1
                r0.c = r2
                r0.d = r3
                r0.<init>()
                return
        }

        public void onCompleted() {
                r2 = this;
                boolean r0 = r2.b
                if (r0 != 0) goto L20
                r0 = 1
                r2.b = r0
                boolean r0 = r2.a
                if (r0 == 0) goto L13
                rx.internal.producers.SingleDelayedProducer r0 = r2.c
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                r0.setValue(r1)
                return
            L13:
                rx.internal.producers.SingleDelayedProducer r0 = r2.c
                rx.internal.operators.o1 r1 = r2.e
                boolean r1 = r1.b
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r0.setValue(r1)
            L20:
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.b
                if (r0 != 0) goto Ld
                r0 = 1
                r1.b = r0
                rx.l r0 = r1.d
                r0.onError(r2)
                return
            Ld:
                rx.plugins.c.I(r2)
                return
        }

        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.b
                if (r0 == 0) goto L5
                goto L2b
            L5:
                r0 = 1
                r2.a = r0
                rx.internal.operators.o1 r1 = r2.e     // Catch: java.lang.Throwable -> L2c
                rx.functions.p<? super T, java.lang.Boolean> r1 = r1.a     // Catch: java.lang.Throwable -> L2c
                java.lang.Object r1 = r1.call(r3)     // Catch: java.lang.Throwable -> L2c
                java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L2c
                boolean r3 = r1.booleanValue()     // Catch: java.lang.Throwable -> L2c
                if (r3 == 0) goto L2b
                r2.b = r0
                rx.internal.producers.SingleDelayedProducer r3 = r2.c
                rx.internal.operators.o1 r1 = r2.e
                boolean r1 = r1.b
                r0 = r0 ^ r1
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r3.setValue(r0)
                r2.unsubscribe()
            L2b:
                return
            L2c:
                r0 = move-exception
                rx.exceptions.a.g(r0, r2, r3)
                return
        }
    }

    public o1(rx.functions.p<? super T, java.lang.Boolean> r1, boolean r2) {
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

    public rx.l<? super T> call(rx.l<? super java.lang.Boolean> r3) {
            r2 = this;
            rx.internal.producers.SingleDelayedProducer r0 = new rx.internal.producers.SingleDelayedProducer
            r0.<init>(r3)
            rx.internal.operators.o1$a r1 = new rx.internal.operators.o1$a
            r1.<init>(r2, r0, r3)
            r3.add(r1)
            r3.setProducer(r0)
            return r1
    }
}
