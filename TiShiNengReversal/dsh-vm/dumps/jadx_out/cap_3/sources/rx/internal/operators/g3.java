package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class g3<T> implements rx.e.b<T, T> {
    final long a;
    final rx.h b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<T> {
        private java.util.Deque<rx.schedulers.f<T>> a;
        final /* synthetic */ rx.l b;
        final /* synthetic */ rx.internal.operators.g3 c;

        a(rx.internal.operators.g3 r1, rx.l r2, rx.l r3) {
                r0 = this;
                r0.c = r1
                r0.b = r3
                r0.<init>(r2)
                java.util.ArrayDeque r1 = new java.util.ArrayDeque
                r1.<init>()
                r0.a = r1
                return
        }

        private void g(long r5) {
                r4 = this;
                rx.internal.operators.g3 r0 = r4.c
                long r0 = r0.a
                long r5 = r5 - r0
            L5:
                java.util.Deque<rx.schedulers.f<T>> r0 = r4.a
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L2c
                java.util.Deque<rx.schedulers.f<T>> r0 = r4.a
                java.lang.Object r0 = r0.getFirst()
                rx.schedulers.f r0 = (rx.schedulers.f) r0
                long r1 = r0.a()
                int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r3 >= 0) goto L2c
                java.util.Deque<rx.schedulers.f<T>> r1 = r4.a
                r1.removeFirst()
                rx.l r1 = r4.b
                java.lang.Object r0 = r0.b()
                r1.onNext(r0)
                goto L5
            L2c:
                return
        }

        public void onCompleted() {
                r2 = this;
                rx.internal.operators.g3 r0 = r2.c
                rx.h r0 = r0.b
                long r0 = r0.b()
                r2.g(r0)
                rx.l r0 = r2.b
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.l r0 = r1.b
                r0.onError(r2)
                return
        }

        public void onNext(T r5) {
                r4 = this;
                rx.internal.operators.g3 r0 = r4.c
                rx.h r0 = r0.b
                long r0 = r0.b()
                r4.g(r0)
                java.util.Deque<rx.schedulers.f<T>> r2 = r4.a
                rx.schedulers.f r3 = new rx.schedulers.f
                r3.<init>(r0, r5)
                r2.offerLast(r3)
                return
        }
    }

    public g3(long r1, java.util.concurrent.TimeUnit r3, rx.h r4) {
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
            rx.internal.operators.g3$a r0 = new rx.internal.operators.g3$a
            r0.<init>(r1, r2, r2)
            return r0
    }
}
