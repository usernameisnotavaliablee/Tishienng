package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class a2<T, U> implements rx.e.b<T, T> {
    final rx.functions.p<? super T, ? extends U> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<T> {
        java.util.Set<U> a;
        final /* synthetic */ rx.l b;
        final /* synthetic */ rx.internal.operators.a2 c;

        a(rx.internal.operators.a2 r1, rx.l r2, rx.l r3) {
                r0 = this;
                r0.c = r1
                r0.b = r3
                r0.<init>(r2)
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                r0.a = r1
                return
        }

        public void onCompleted() {
                r1 = this;
                r0 = 0
                r1.a = r0
                rx.l r0 = r1.b
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r0 = 0
                r1.a = r0
                rx.l r0 = r1.b
                r0.onError(r2)
                return
        }

        public void onNext(T r3) {
                r2 = this;
                rx.internal.operators.a2 r0 = r2.c
                rx.functions.p<? super T, ? extends U> r0 = r0.a
                java.lang.Object r0 = r0.call(r3)
                java.util.Set<U> r1 = r2.a
                boolean r0 = r1.add(r0)
                if (r0 == 0) goto L16
                rx.l r0 = r2.b
                r0.onNext(r3)
                return
            L16:
                r0 = 1
                r2.request(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b {
        static final rx.internal.operators.a2<?, ?> a = null;

        static {
                rx.internal.operators.a2 r0 = new rx.internal.operators.a2
                rx.functions.p r1 = rx.internal.util.n.c()
                r0.<init>(r1)
                rx.internal.operators.a2.b.a = r0
                return
        }

        b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public a2(rx.functions.p<? super T, ? extends U> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static <T> rx.internal.operators.a2<T, T> a() {
            rx.internal.operators.a2<?, ?> r0 = rx.internal.operators.a2.b.a
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super T> r2) {
            r1 = this;
            rx.internal.operators.a2$a r0 = new rx.internal.operators.a2$a
            r0.<init>(r1, r2, r2)
            return r0
    }
}
