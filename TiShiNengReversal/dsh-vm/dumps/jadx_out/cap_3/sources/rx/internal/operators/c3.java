package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class c3<T> implements rx.e.b<T, T> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<T> {
        final /* synthetic */ rx.l a;
        final /* synthetic */ rx.internal.operators.c3 b;

        a(rx.internal.operators.c3 r1, rx.l r2, rx.l r3) {
                r0 = this;
                r0.b = r1
                r0.a = r3
                r0.<init>(r2)
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.l r0 = r1.a
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.l r0 = r1.a
                r0.onError(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                rx.l r0 = r1.a
                r0.onNext(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b {
        static final rx.internal.operators.c3<java.lang.Object> a = null;

        static {
                rx.internal.operators.c3 r0 = new rx.internal.operators.c3
                r0.<init>()
                rx.internal.operators.c3.b.a = r0
                return
        }

        b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    c3() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> rx.internal.operators.c3<T> a() {
            rx.internal.operators.c3<java.lang.Object> r0 = rx.internal.operators.c3.b.a
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super T> r3) {
            r2 = this;
            rx.observers.g r0 = new rx.observers.g
            rx.internal.operators.c3$a r1 = new rx.internal.operators.c3$a
            r1.<init>(r2, r3, r3)
            r0.<init>(r1)
            return r0
    }
}
