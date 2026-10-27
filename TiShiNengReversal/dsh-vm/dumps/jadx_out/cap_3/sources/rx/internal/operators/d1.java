package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class d1<T> implements rx.e.a<T> {
    final rx.e<T> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends rx.internal.operators.t<T, T> {
        static final java.lang.Object i = null;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                rx.internal.operators.d1.a.i = r0
                return
        }

        public a(rx.l<? super T> r1) {
                r0 = this;
                r0.<init>(r1)
                java.lang.Object r1 = rx.internal.operators.d1.a.i
                r0.c = r1
                return
        }

        @Override // rx.internal.operators.t
        public void onCompleted() {
                r2 = this;
                R r0 = r2.c
                java.lang.Object r1 = rx.internal.operators.d1.a.i
                if (r0 != r1) goto La
                r2.g()
                return
            La:
                r2.j(r0)
                return
        }

        public void onNext(T r1) {
                r0 = this;
                r0.c = r1
                return
        }
    }

    public d1(rx.e<T> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super T> r2) {
            r1 = this;
            rx.internal.operators.d1$a r0 = new rx.internal.operators.d1$a
            r0.<init>(r2)
            rx.e<T> r2 = r1.a
            r0.B(r2)
            return
    }
}
