package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class h0<T> implements rx.e.a<T> {
    final rx.e<T> a;
    final rx.functions.p<? super T, java.lang.Boolean> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends rx.l<T> {
        final rx.l<? super T> a;
        final rx.functions.p<? super T, java.lang.Boolean> b;
        boolean c;

        public a(rx.l<? super T> r1, rx.functions.p<? super T, java.lang.Boolean> r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r1 = 0
                r0.request(r1)
                return
        }

        public void onCompleted() {
                r1 = this;
                boolean r0 = r1.c
                if (r0 == 0) goto L5
                return
            L5:
                rx.l<? super T> r0 = r1.a
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.c
                if (r0 == 0) goto L8
                rx.plugins.c.I(r2)
                return
            L8:
                r0 = 1
                r1.c = r0
                rx.l<? super T> r0 = r1.a
                r0.onError(r2)
                return
        }

        public void onNext(T r3) {
                r2 = this;
                rx.functions.p<? super T, java.lang.Boolean> r0 = r2.b     // Catch: java.lang.Throwable -> L1a
                java.lang.Object r0 = r0.call(r3)     // Catch: java.lang.Throwable -> L1a
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L1a
                boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L1a
                if (r0 == 0) goto L14
                rx.l<? super T> r0 = r2.a
                r0.onNext(r3)
                return
            L14:
                r0 = 1
                r2.request(r0)
                return
            L1a:
                r0 = move-exception
                rx.exceptions.a.e(r0)
                r2.unsubscribe()
                java.lang.Throwable r3 = rx.exceptions.OnErrorThrowable.addValueAsLastCause(r0, r3)
                r2.onError(r3)
                return
        }

        public void setProducer(rx.g r2) {
                r1 = this;
                super.setProducer(r2)
                rx.l<? super T> r0 = r1.a
                r0.setProducer(r2)
                return
        }
    }

    public h0(rx.e<T> r1, rx.functions.p<? super T, java.lang.Boolean> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super T> r3) {
            r2 = this;
            rx.internal.operators.h0$a r0 = new rx.internal.operators.h0$a
            rx.functions.p<? super T, java.lang.Boolean> r1 = r2.b
            r0.<init>(r3, r1)
            r3.add(r0)
            rx.e<T> r3 = r2.a
            r3.J6(r0)
            return
    }
}
