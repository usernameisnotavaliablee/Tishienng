package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class m3<T> implements rx.e.b<T, T> {
    final int a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.g {
        final /* synthetic */ rx.internal.operators.m3.b a;
        final /* synthetic */ rx.internal.operators.m3 b;

        a(rx.internal.operators.m3 r1, rx.internal.operators.m3.b r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void request(long r2) {
                r1 = this;
                rx.internal.operators.m3$b r0 = r1.a
                r0.g(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T> extends rx.l<T> implements rx.functions.p<java.lang.Object, T> {
        final rx.l<? super T> a;
        final java.util.concurrent.atomic.AtomicLong b;
        final java.util.ArrayDeque<java.lang.Object> c;
        final int d;

        public b(rx.l<? super T> r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.d = r2
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.b = r1
                java.util.ArrayDeque r1 = new java.util.ArrayDeque
                r1.<init>()
                r0.c = r1
                return
        }

        public T call(java.lang.Object r1) {
                r0 = this;
                java.lang.Object r1 = rx.internal.operators.v.e(r1)
                return r1
        }

        void g(long r10) {
                r9 = this;
                r0 = 0
                int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r2 <= 0) goto L11
                java.util.concurrent.atomic.AtomicLong r3 = r9.b
                java.util.ArrayDeque<java.lang.Object> r6 = r9.c
                rx.l<? super T> r7 = r9.a
                r8 = r9
                r4 = r10
                rx.internal.operators.a.h(r3, r4, r6, r7, r8)
            L11:
                return
        }

        public void onCompleted() {
                r3 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r3.b
                java.util.ArrayDeque<java.lang.Object> r1 = r3.c
                rx.l<? super T> r2 = r3.a
                rx.internal.operators.a.e(r0, r1, r2, r3)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.ArrayDeque<java.lang.Object> r0 = r1.c
                r0.clear()
                rx.l<? super T> r0 = r1.a
                r0.onError(r2)
                return
        }

        public void onNext(T r3) {
                r2 = this;
                java.util.ArrayDeque<java.lang.Object> r0 = r2.c
                int r0 = r0.size()
                int r1 = r2.d
                if (r0 != r1) goto Lf
                java.util.ArrayDeque<java.lang.Object> r0 = r2.c
                r0.poll()
            Lf:
                java.util.ArrayDeque<java.lang.Object> r0 = r2.c
                java.lang.Object r3 = rx.internal.operators.v.j(r3)
                r0.offer(r3)
                return
        }
    }

    public m3(int r2) {
            r1 = this;
            r1.<init>()
            if (r2 < 0) goto L8
            r1.a = r2
            return
        L8:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "count cannot be negative"
            r2.<init>(r0)
            throw r2
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super T> r3) {
            r2 = this;
            rx.internal.operators.m3$b r0 = new rx.internal.operators.m3$b
            int r1 = r2.a
            r0.<init>(r3, r1)
            r3.add(r0)
            rx.internal.operators.m3$a r1 = new rx.internal.operators.m3$a
            r1.<init>(r2, r0)
            r3.setProducer(r1)
            return r0
    }
}
