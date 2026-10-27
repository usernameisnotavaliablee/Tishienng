package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class d2<T> implements rx.e.b<T, T> {
    final rx.functions.b<? super java.lang.Long> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.g {
        final /* synthetic */ rx.internal.operators.d2.b a;
        final /* synthetic */ rx.internal.operators.d2 b;

        a(rx.internal.operators.d2 r1, rx.internal.operators.d2.b r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void request(long r3) {
                r2 = this;
                rx.internal.operators.d2 r0 = r2.b
                rx.functions.b<? super java.lang.Long> r0 = r0.a
                java.lang.Long r1 = java.lang.Long.valueOf(r3)
                r0.call(r1)
                rx.internal.operators.d2$b r0 = r2.a
                rx.internal.operators.d2.b.g(r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T> extends rx.l<T> {
        private final rx.l<? super T> a;

        b(rx.l<? super T> r3) {
                r2 = this;
                r2.<init>()
                r2.a = r3
                r0 = 0
                r2.request(r0)
                return
        }

        static /* synthetic */ void g(rx.internal.operators.d2.b r0, long r1) {
                r0.j(r1)
                return
        }

        private void j(long r1) {
                r0 = this;
                r0.request(r1)
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.l<? super T> r0 = r1.a
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.l<? super T> r0 = r1.a
                r0.onError(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                rx.l<? super T> r0 = r1.a
                r0.onNext(r2)
                return
        }
    }

    public d2(rx.functions.b<? super java.lang.Long> r1) {
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
            rx.internal.operators.d2$b r0 = new rx.internal.operators.d2$b
            r0.<init>(r3)
            rx.internal.operators.d2$a r1 = new rx.internal.operators.d2$a
            r1.<init>(r2, r0)
            r3.setProducer(r1)
            r3.add(r0)
            return r0
    }
}
