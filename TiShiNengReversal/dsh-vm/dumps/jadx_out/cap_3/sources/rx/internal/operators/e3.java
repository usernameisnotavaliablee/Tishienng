package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class e3<T> implements rx.e.b<T, T> {
    final int a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<T> {
        int a;
        final /* synthetic */ rx.l b;
        final /* synthetic */ rx.internal.operators.e3 c;

        a(rx.internal.operators.e3 r1, rx.l r2, rx.l r3) {
                r0 = this;
                r0.c = r1
                r0.b = r3
                r0.<init>(r2)
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

        public void onNext(T r3) {
                r2 = this;
                int r0 = r2.a
                rx.internal.operators.e3 r1 = r2.c
                int r1 = r1.a
                if (r0 < r1) goto Le
                rx.l r0 = r2.b
                r0.onNext(r3)
                return
            Le:
                int r0 = r0 + 1
                r2.a = r0
                return
        }

        public void setProducer(rx.g r3) {
                r2 = this;
                rx.l r0 = r2.b
                r0.setProducer(r3)
                rx.internal.operators.e3 r0 = r2.c
                int r0 = r0.a
                long r0 = (long) r0
                r3.request(r0)
                return
        }
    }

    public e3(int r4) {
            r3 = this;
            r3.<init>()
            if (r4 < 0) goto L8
            r3.a = r4
            return
        L8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "n >= 0 required but it was "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super T> r2) {
            r1 = this;
            rx.internal.operators.e3$a r0 = new rx.internal.operators.e3$a
            r0.<init>(r1, r2, r2)
            return r0
    }
}
