package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class e4<T, R> implements rx.e.a<R> {
    final rx.e<T> a;
    final rx.e<?>[] b;
    final java.lang.Iterable<rx.e<?>> c;
    final rx.functions.y<R> d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T, R> extends rx.l<T> {
        static final java.lang.Object f = null;
        final rx.l<? super R> a;
        final rx.functions.y<R> b;
        final java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> c;
        final java.util.concurrent.atomic.AtomicInteger d;
        boolean e;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                rx.internal.operators.e4.a.f = r0
                return
        }

        public a(rx.l<? super R> r2, rx.functions.y<R> r3, int r4) {
                r1 = this;
                r1.<init>()
                r1.a = r2
                r1.b = r3
                java.util.concurrent.atomic.AtomicReferenceArray r2 = new java.util.concurrent.atomic.AtomicReferenceArray
                int r3 = r4 + 1
                r2.<init>(r3)
                r3 = 0
            Lf:
                if (r3 > r4) goto L19
                java.lang.Object r0 = rx.internal.operators.e4.a.f
                r2.lazySet(r3, r0)
                int r3 = r3 + 1
                goto Lf
            L19:
                r1.c = r2
                java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
                r2.<init>(r4)
                r1.d = r2
                r2 = 0
                r1.request(r2)
                return
        }

        void g(int r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r0 = r1.c
                java.lang.Object r2 = r0.get(r2)
                java.lang.Object r0 = rx.internal.operators.e4.a.f
                if (r2 != r0) goto Ld
                r1.onCompleted()
            Ld:
                return
        }

        void j(int r1, java.lang.Throwable r2) {
                r0 = this;
                r0.onError(r2)
                return
        }

        public void onCompleted() {
                r1 = this;
                boolean r0 = r1.e
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.e = r0
                r1.unsubscribe()
                rx.l<? super R> r0 = r1.a
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.e
                if (r0 == 0) goto L8
                rx.plugins.c.I(r2)
                return
            L8:
                r0 = 1
                r1.e = r0
                r1.unsubscribe()
                rx.l<? super R> r0 = r1.a
                r0.onError(r2)
                return
        }

        public void onNext(T r5) {
                r4 = this;
                boolean r0 = r4.e
                if (r0 == 0) goto L5
                return
            L5:
                java.util.concurrent.atomic.AtomicInteger r0 = r4.d
                int r0 = r0.get()
                if (r0 != 0) goto L3c
                java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r0 = r4.c
                int r1 = r0.length()
                r2 = 0
                r0.lazySet(r2, r5)
                int r5 = r0.length()
                java.lang.Object[] r5 = new java.lang.Object[r5]
            L1d:
                if (r2 >= r1) goto L28
                java.lang.Object r3 = r0.get(r2)
                r5[r2] = r3
                int r2 = r2 + 1
                goto L1d
            L28:
                rx.functions.y<R> r0 = r4.b     // Catch: java.lang.Throwable -> L34
                java.lang.Object r5 = r0.call(r5)     // Catch: java.lang.Throwable -> L34
                rx.l<? super R> r0 = r4.a
                r0.onNext(r5)
                return
            L34:
                r5 = move-exception
                rx.exceptions.a.e(r5)
                r4.onError(r5)
                return
            L3c:
                r0 = 1
                r4.request(r0)
                return
        }

        void s(int r2, java.lang.Object r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r0 = r1.c
                java.lang.Object r2 = r0.getAndSet(r2, r3)
                java.lang.Object r3 = rx.internal.operators.e4.a.f
                if (r2 != r3) goto Lf
                java.util.concurrent.atomic.AtomicInteger r2 = r1.d
                r2.decrementAndGet()
            Lf:
                return
        }

        public void setProducer(rx.g r2) {
                r1 = this;
                super.setProducer(r2)
                rx.l<? super R> r0 = r1.a
                r0.setProducer(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b extends rx.l<java.lang.Object> {
        final rx.internal.operators.e4.a<?, ?> a;
        final int b;

        public b(rx.internal.operators.e4.a<?, ?> r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public void onCompleted() {
                r2 = this;
                rx.internal.operators.e4$a<?, ?> r0 = r2.a
                int r1 = r2.b
                r0.g(r1)
                return
        }

        public void onError(java.lang.Throwable r3) {
                r2 = this;
                rx.internal.operators.e4$a<?, ?> r0 = r2.a
                int r1 = r2.b
                r0.j(r1, r3)
                return
        }

        public void onNext(java.lang.Object r3) {
                r2 = this;
                rx.internal.operators.e4$a<?, ?> r0 = r2.a
                int r1 = r2.b
                r0.s(r1, r3)
                return
        }
    }

    public e4(rx.e<T> r1, rx.e<?>[] r2, java.lang.Iterable<rx.e<?>> r3, rx.functions.y<R> r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super R> r8) {
            r7 = this;
            rx.observers.g r0 = new rx.observers.g
            r0.<init>(r8)
            rx.e<?>[] r1 = r7.b
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.length
            goto L36
        Lc:
            r1 = 8
            rx.e[] r1 = new rx.e[r1]
            java.lang.Iterable<rx.e<?>> r3 = r7.c
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L17:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L35
            java.lang.Object r5 = r3.next()
            rx.e r5 = (rx.e) r5
            int r6 = r1.length
            if (r4 != r6) goto L2f
            int r6 = r4 >> 2
            int r6 = r6 + r4
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r6)
            rx.e[] r1 = (rx.e[]) r1
        L2f:
            int r6 = r4 + 1
            r1[r4] = r5
            r4 = r6
            goto L17
        L35:
            r3 = r4
        L36:
            rx.internal.operators.e4$a r4 = new rx.internal.operators.e4$a
            rx.functions.y<R> r5 = r7.d
            r4.<init>(r8, r5, r3)
            r0.add(r4)
        L40:
            if (r2 >= r3) goto L5a
            boolean r8 = r0.isUnsubscribed()
            if (r8 == 0) goto L49
            return
        L49:
            rx.internal.operators.e4$b r8 = new rx.internal.operators.e4$b
            int r5 = r2 + 1
            r8.<init>(r4, r5)
            r4.add(r8)
            r2 = r1[r2]
            r2.J6(r8)
            r2 = r5
            goto L40
        L5a:
            rx.e<T> r8 = r7.a
            r8.J6(r4)
            return
    }
}
