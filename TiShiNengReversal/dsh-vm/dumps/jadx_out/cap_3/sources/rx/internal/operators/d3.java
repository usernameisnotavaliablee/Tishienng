package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class d3<T> implements rx.e.b<T, T> {
    private final boolean a;
    private final T b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a {
        static final rx.internal.operators.d3<?> a = null;

        static {
                rx.internal.operators.d3 r0 = new rx.internal.operators.d3
                r0.<init>()
                rx.internal.operators.d3.a.a = r0
                return
        }

        a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T> extends rx.l<T> {
        private final rx.l<? super T> a;
        private final boolean b;
        private final T c;
        private T d;
        private boolean e;
        private boolean f;

        b(rx.l<? super T> r1, boolean r2, T r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r1 = 2
                r0.request(r1)
                return
        }

        public void onCompleted() {
                r4 = this;
                boolean r0 = r4.f
                if (r0 != 0) goto L36
                boolean r0 = r4.e
                if (r0 == 0) goto L17
                rx.l<? super T> r0 = r4.a
                rx.internal.producers.SingleProducer r1 = new rx.internal.producers.SingleProducer
                rx.l<? super T> r2 = r4.a
                T r3 = r4.d
                r1.<init>(r2, r3)
                r0.setProducer(r1)
                return
            L17:
                boolean r0 = r4.b
                if (r0 == 0) goto L2a
                rx.l<? super T> r0 = r4.a
                rx.internal.producers.SingleProducer r1 = new rx.internal.producers.SingleProducer
                rx.l<? super T> r2 = r4.a
                T r3 = r4.c
                r1.<init>(r2, r3)
                r0.setProducer(r1)
                return
            L2a:
                rx.l<? super T> r0 = r4.a
                java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
                java.lang.String r2 = "Sequence contains no elements"
                r1.<init>(r2)
                r0.onError(r1)
            L36:
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.f
                if (r0 == 0) goto L8
                rx.plugins.c.I(r2)
                return
            L8:
                rx.l<? super T> r0 = r1.a
                r0.onError(r2)
                return
        }

        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.f
                if (r0 != 0) goto L1f
                boolean r0 = r2.e
                r1 = 1
                if (r0 == 0) goto L1b
                r2.f = r1
                rx.l<? super T> r3 = r2.a
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Sequence contains too many elements"
                r0.<init>(r1)
                r3.onError(r0)
                r2.unsubscribe()
                return
            L1b:
                r2.d = r3
                r2.e = r1
            L1f:
                return
        }
    }

    d3() {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    public d3(T r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0, r2)
            return
    }

    private d3(boolean r1, T r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public static <T> rx.internal.operators.d3<T> a() {
            rx.internal.operators.d3<?> r0 = rx.internal.operators.d3.a.a
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super T> r4) {
            r3 = this;
            rx.internal.operators.d3$b r0 = new rx.internal.operators.d3$b
            boolean r1 = r3.a
            T r2 = r3.b
            r0.<init>(r4, r1, r2)
            r4.add(r0)
            return r0
    }
}
