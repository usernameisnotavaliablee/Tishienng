package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class n3<T> implements rx.e.b<T, T> {
    final long a;
    final rx.h b;
    final int c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.g {
        final /* synthetic */ rx.internal.operators.n3.b a;
        final /* synthetic */ rx.internal.operators.n3 b;

        a(rx.internal.operators.n3 r1, rx.internal.operators.n3.b r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void request(long r2) {
                r1 = this;
                rx.internal.operators.n3$b r0 = r1.a
                r0.j(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T> extends rx.l<T> implements rx.functions.p<java.lang.Object, T> {
        final rx.l<? super T> a;
        final long b;
        final rx.h c;
        final int d;
        final java.util.concurrent.atomic.AtomicLong e;
        final java.util.ArrayDeque<java.lang.Object> f;
        final java.util.ArrayDeque<java.lang.Long> g;

        public b(rx.l<? super T> r1, int r2, long r3, rx.h r5) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.d = r2
                r0.b = r3
                r0.c = r5
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.e = r1
                java.util.ArrayDeque r1 = new java.util.ArrayDeque
                r1.<init>()
                r0.f = r1
                java.util.ArrayDeque r1 = new java.util.ArrayDeque
                r1.<init>()
                r0.g = r1
                return
        }

        public T call(java.lang.Object r1) {
                r0 = this;
                java.lang.Object r1 = rx.internal.operators.v.e(r1)
                return r1
        }

        protected void g(long r4) {
                r3 = this;
                long r0 = r3.b
                long r4 = r4 - r0
            L3:
                java.util.ArrayDeque<java.lang.Long> r0 = r3.g
                java.lang.Object r0 = r0.peek()
                java.lang.Long r0 = (java.lang.Long) r0
                if (r0 == 0) goto L21
                long r0 = r0.longValue()
                int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r2 < 0) goto L16
                goto L21
            L16:
                java.util.ArrayDeque<java.lang.Object> r0 = r3.f
                r0.poll()
                java.util.ArrayDeque<java.lang.Long> r0 = r3.g
                r0.poll()
                goto L3
            L21:
                return
        }

        void j(long r7) {
                r6 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r6.e
                java.util.ArrayDeque<java.lang.Object> r3 = r6.f
                rx.l<? super T> r4 = r6.a
                r5 = r6
                r1 = r7
                rx.internal.operators.a.h(r0, r1, r3, r4, r5)
                return
        }

        public void onCompleted() {
                r3 = this;
                rx.h r0 = r3.c
                long r0 = r0.b()
                r3.g(r0)
                java.util.ArrayDeque<java.lang.Long> r0 = r3.g
                r0.clear()
                java.util.concurrent.atomic.AtomicLong r0 = r3.e
                java.util.ArrayDeque<java.lang.Object> r1 = r3.f
                rx.l<? super T> r2 = r3.a
                rx.internal.operators.a.e(r0, r1, r2, r3)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.ArrayDeque<java.lang.Object> r0 = r1.f
                r0.clear()
                java.util.ArrayDeque<java.lang.Long> r0 = r1.g
                r0.clear()
                rx.l<? super T> r0 = r1.a
                r0.onError(r2)
                return
        }

        public void onNext(T r5) {
                r4 = this;
                int r0 = r4.d
                if (r0 == 0) goto L33
                rx.h r0 = r4.c
                long r0 = r0.b()
                java.util.ArrayDeque<java.lang.Object> r2 = r4.f
                int r2 = r2.size()
                int r3 = r4.d
                if (r2 != r3) goto L1e
                java.util.ArrayDeque<java.lang.Object> r2 = r4.f
                r2.poll()
                java.util.ArrayDeque<java.lang.Long> r2 = r4.g
                r2.poll()
            L1e:
                r4.g(r0)
                java.util.ArrayDeque<java.lang.Object> r2 = r4.f
                java.lang.Object r5 = rx.internal.operators.v.j(r5)
                r2.offer(r5)
                java.util.ArrayDeque<java.lang.Long> r5 = r4.g
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r5.offer(r0)
            L33:
                return
        }
    }

    public n3(int r1, long r2, java.util.concurrent.TimeUnit r4, rx.h r5) {
            r0 = this;
            r0.<init>()
            if (r1 < 0) goto L10
            long r2 = r4.toMillis(r2)
            r0.a = r2
            r0.b = r5
            r0.c = r1
            return
        L10:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = "count could not be negative"
            r1.<init>(r2)
            throw r1
    }

    public n3(long r1, java.util.concurrent.TimeUnit r3, rx.h r4) {
            r0 = this;
            r0.<init>()
            long r1 = r3.toMillis(r1)
            r0.a = r1
            r0.b = r4
            r1 = -1
            r0.c = r1
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super T> r7) {
            r6 = this;
            rx.internal.operators.n3$b r0 = new rx.internal.operators.n3$b
            int r2 = r6.c
            long r3 = r6.a
            rx.h r5 = r6.b
            r1 = r7
            r0.<init>(r1, r2, r3, r5)
            r1.add(r0)
            rx.internal.operators.n3$a r7 = new rx.internal.operators.n3$a
            r7.<init>(r6, r0)
            r1.setProducer(r7)
            return r0
    }
}
