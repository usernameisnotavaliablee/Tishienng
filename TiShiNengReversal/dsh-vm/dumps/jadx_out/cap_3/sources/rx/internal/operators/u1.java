package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class u1<T, R> implements rx.e.b<R, T> {
    final java.lang.Class<R> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T, R> extends rx.l<T> {
        final rx.l<? super R> a;
        final java.lang.Class<R> b;
        boolean c;

        public a(rx.l<? super R> r1, java.lang.Class<R> r2) {
                r0 = this;
                r0.<init>()
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
                rx.l<? super R> r0 = r1.a
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
                rx.l<? super R> r0 = r1.a
                r0.onError(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                java.lang.Class<R> r0 = r1.b     // Catch: java.lang.Throwable -> Lc
                java.lang.Object r2 = r0.cast(r2)     // Catch: java.lang.Throwable -> Lc
                rx.l<? super R> r0 = r1.a
                r0.onNext(r2)
                return
            Lc:
                r0 = move-exception
                rx.exceptions.a.e(r0)
                r1.unsubscribe()
                java.lang.Throwable r2 = rx.exceptions.OnErrorThrowable.addValueAsLastCause(r0, r2)
                r1.onError(r2)
                return
        }

        public void setProducer(rx.g r2) {
                r1 = this;
                rx.l<? super R> r0 = r1.a
                r0.setProducer(r2)
                return
        }
    }

    public u1(java.lang.Class<R> r1) {
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

    public rx.l<? super T> call(rx.l<? super R> r3) {
            r2 = this;
            rx.internal.operators.u1$a r0 = new rx.internal.operators.u1$a
            java.lang.Class<R> r1 = r2.a
            r0.<init>(r3, r1)
            r3.add(r0)
            return r0
    }
}
