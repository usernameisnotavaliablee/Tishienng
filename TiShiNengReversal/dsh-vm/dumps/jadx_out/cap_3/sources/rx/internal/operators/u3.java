package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class u3<T> implements rx.e.b<rx.schedulers.f<T>, T> {
    final rx.h a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<T> {
        final /* synthetic */ rx.l a;
        final /* synthetic */ rx.internal.operators.u3 b;

        a(rx.internal.operators.u3 r1, rx.l r2, rx.l r3) {
                r0 = this;
                r0.b = r1
                r0.a = r3
                r0.<init>(r2)
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

        public void onNext(T r5) {
                r4 = this;
                rx.l r0 = r4.a
                rx.schedulers.f r1 = new rx.schedulers.f
                rx.internal.operators.u3 r2 = r4.b
                rx.h r2 = r2.a
                long r2 = r2.b()
                r1.<init>(r2, r5)
                r0.onNext(r1)
                return
        }
    }

    public u3(rx.h r1) {
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

    public rx.l<? super T> call(rx.l<? super rx.schedulers.f<T>> r2) {
            r1 = this;
            rx.internal.operators.u3$a r0 = new rx.internal.operators.u3$a
            r0.<init>(r1, r2, r2)
            return r0
    }
}
