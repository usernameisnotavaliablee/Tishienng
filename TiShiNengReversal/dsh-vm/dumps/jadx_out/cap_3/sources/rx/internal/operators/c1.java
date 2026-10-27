package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class c1<T> implements rx.e.a<T> {
    final rx.e<? extends T> a;
    final rx.e<? extends T> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends rx.l<T> {
        private final rx.internal.producers.a a;
        private final rx.l<? super T> b;

        a(rx.l<? super T> r1, rx.internal.producers.a r2) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                r0.a = r2
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.l<? super T> r0 = r1.b
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.l<? super T> r0 = r1.b
                r0.onError(r2)
                return
        }

        public void onNext(T r3) {
                r2 = this;
                rx.l<? super T> r0 = r2.b
                r0.onNext(r3)
                rx.internal.producers.a r3 = r2.a
                r0 = 1
                r3.b(r0)
                return
        }

        public void setProducer(rx.g r2) {
                r1 = this;
                rx.internal.producers.a r0 = r1.a
                r0.c(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T> extends rx.l<T> {
        private boolean a;
        private final rx.l<? super T> b;
        private final rx.subscriptions.e c;
        private final rx.internal.producers.a d;
        private final rx.e<? extends T> e;
        final java.util.concurrent.atomic.AtomicInteger f;
        volatile boolean g;

        b(rx.l<? super T> r2, rx.subscriptions.e r3, rx.internal.producers.a r4, rx.e<? extends T> r5) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.a = r0
                r1.b = r2
                r1.c = r3
                r1.d = r4
                r1.e = r5
                java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
                r2.<init>()
                r1.f = r2
                return
        }

        void g(rx.e<? extends T> r5) {
                r4 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r4.f
                int r0 = r0.getAndIncrement()
                if (r0 != 0) goto L3c
            L8:
                rx.l<? super T> r0 = r4.b
                boolean r0 = r0.isUnsubscribed()
                if (r0 == 0) goto L11
                goto L3c
            L11:
                boolean r0 = r4.g
                if (r0 != 0) goto L34
                r0 = 1
                if (r5 != 0) goto L2e
                rx.internal.operators.c1$a r1 = new rx.internal.operators.c1$a
                rx.l<? super T> r2 = r4.b
                rx.internal.producers.a r3 = r4.d
                r1.<init>(r2, r3)
                rx.subscriptions.e r2 = r4.c
                r2.b(r1)
                r4.g = r0
                rx.e<? extends T> r0 = r4.e
                r0.J6(r1)
                goto L34
            L2e:
                r4.g = r0
                r5.J6(r4)
                r5 = 0
            L34:
                java.util.concurrent.atomic.AtomicInteger r0 = r4.f
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto L8
            L3c:
                return
        }

        public void onCompleted() {
                r1 = this;
                boolean r0 = r1.a
                if (r0 != 0) goto La
                rx.l<? super T> r0 = r1.b
                r0.onCompleted()
                return
            La:
                rx.l<? super T> r0 = r1.b
                boolean r0 = r0.isUnsubscribed()
                if (r0 != 0) goto L19
                r0 = 0
                r1.g = r0
                r0 = 0
                r1.g(r0)
            L19:
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.l<? super T> r0 = r1.b
                r0.onError(r2)
                return
        }

        public void onNext(T r3) {
                r2 = this;
                r0 = 0
                r2.a = r0
                rx.l<? super T> r0 = r2.b
                r0.onNext(r3)
                rx.internal.producers.a r3 = r2.d
                r0 = 1
                r3.b(r0)
                return
        }

        public void setProducer(rx.g r2) {
                r1 = this;
                rx.internal.producers.a r0 = r1.d
                r0.c(r2)
                return
        }
    }

    public c1(rx.e<? extends T> r1, rx.e<? extends T> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super T> r5) {
            r4 = this;
            rx.subscriptions.e r0 = new rx.subscriptions.e
            r0.<init>()
            rx.internal.producers.a r1 = new rx.internal.producers.a
            r1.<init>()
            rx.internal.operators.c1$b r2 = new rx.internal.operators.c1$b
            rx.e<? extends T> r3 = r4.b
            r2.<init>(r5, r0, r1, r3)
            r0.b(r2)
            r5.add(r0)
            r5.setProducer(r1)
            rx.e<? extends T> r5 = r4.a
            r2.g(r5)
            return
    }
}
