package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class x3<T> implements rx.e.b<T, T> {
    final rx.h a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<T> {
        final /* synthetic */ rx.l a;
        final /* synthetic */ rx.internal.operators.x3 b;

        a(rx.internal.operators.x3 r1, rx.l r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.l r0 = r1.a
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.l r0 = r1.a
                r0.onError(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                rx.l r0 = r1.a
                r0.onNext(r2)
                return
        }

        public void setProducer(rx.g r2) {
                r1 = this;
                rx.l r0 = r1.a
                r0.setProducer(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements rx.functions.a {
        final /* synthetic */ rx.l a;
        final /* synthetic */ rx.internal.operators.x3 b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements rx.functions.a {
            final /* synthetic */ rx.h.a a;
            final /* synthetic */ rx.internal.operators.x3.b b;

            a(rx.internal.operators.x3.b r1, rx.h.a r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            public void call() {
                    r1 = this;
                    rx.internal.operators.x3$b r0 = r1.b
                    rx.l r0 = r0.a
                    r0.unsubscribe()
                    rx.h$a r0 = r1.a
                    r0.unsubscribe()
                    return
            }
        }

        b(rx.internal.operators.x3 r1, rx.l r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void call() {
                r2 = this;
                rx.internal.operators.x3 r0 = r2.b
                rx.h r0 = r0.a
                rx.h$a r0 = r0.a()
                rx.internal.operators.x3$b$a r1 = new rx.internal.operators.x3$b$a
                r1.<init>(r2, r0)
                r0.d(r1)
                return
        }
    }

    public x3(rx.h r1) {
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
            rx.internal.operators.x3$a r0 = new rx.internal.operators.x3$a
            r0.<init>(r2, r3)
            rx.internal.operators.x3$b r1 = new rx.internal.operators.x3$b
            r1.<init>(r2, r0)
            rx.m r1 = rx.subscriptions.f.a(r1)
            r3.add(r1)
            return r0
    }
}
