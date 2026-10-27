package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class s3<T> implements rx.e.b<T, T> {
    final long a;
    final rx.h b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<T> {
        private long a;
        final /* synthetic */ rx.l b;
        final /* synthetic */ rx.internal.operators.s3 c;

        a(rx.internal.operators.s3 r1, rx.l r2, rx.l r3) {
                r0 = this;
                r0.c = r1
                r0.b = r3
                r0.<init>(r2)
                r1 = -1
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

        public void onNext(T r8) {
                r7 = this;
                rx.internal.operators.s3 r0 = r7.c
                rx.h r0 = r0.b
                long r0 = r0.b()
                long r2 = r7.a
                r4 = -1
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 == 0) goto L20
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 < 0) goto L20
                long r2 = r0 - r2
                rx.internal.operators.s3 r4 = r7.c
                long r4 = r4.a
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L1f
                goto L20
            L1f:
                return
            L20:
                r7.a = r0
                rx.l r0 = r7.b
                r0.onNext(r8)
                return
        }

        public void onStart() {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r2.request(r0)
                return
        }
    }

    public s3(long r1, java.util.concurrent.TimeUnit r3, rx.h r4) {
            r0 = this;
            r0.<init>()
            long r1 = r3.toMillis(r1)
            r0.a = r1
            r0.b = r4
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super T> r2) {
            r1 = this;
            rx.internal.operators.s3$a r0 = new rx.internal.operators.s3$a
            r0.<init>(r1, r2, r2)
            return r0
    }
}
