package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class t3<T> implements rx.e.b<rx.schedulers.e<T>, T> {
    final rx.h a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<T> {
        private long a;
        final /* synthetic */ rx.l b;
        final /* synthetic */ rx.internal.operators.t3 c;

        a(rx.internal.operators.t3 r1, rx.l r2, rx.l r3) {
                r0 = this;
                r0.c = r1
                r0.b = r3
                r0.<init>(r2)
                rx.h r1 = r1.a
                long r1 = r1.b()
                r0.a = r1
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.l r0 = r1.b
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.l r0 = r1.b
                r0.onError(r2)
                return
        }

        public void onNext(T r7) {
                r6 = this;
                rx.internal.operators.t3 r0 = r6.c
                rx.h r0 = r0.a
                long r0 = r0.b()
                rx.l r2 = r6.b
                rx.schedulers.e r3 = new rx.schedulers.e
                long r4 = r6.a
                long r4 = r0 - r4
                r3.<init>(r4, r7)
                r2.onNext(r3)
                r6.a = r0
                return
        }
    }

    public t3(rx.h r1) {
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

    public rx.l<? super T> call(rx.l<? super rx.schedulers.e<T>> r2) {
            r1 = this;
            rx.internal.operators.t3$a r0 = new rx.internal.operators.t3$a
            r0.<init>(r1, r2, r2)
            return r0
    }
}
