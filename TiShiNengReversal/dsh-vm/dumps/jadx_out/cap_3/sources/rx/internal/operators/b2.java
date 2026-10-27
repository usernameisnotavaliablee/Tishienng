package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class b2<T, U> implements rx.e.b<T, T>, rx.functions.q<U, U, java.lang.Boolean> {
    final rx.functions.p<? super T, ? extends U> a;
    final rx.functions.q<? super U, ? super U, java.lang.Boolean> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<T> {
        U a;
        boolean b;
        final /* synthetic */ rx.l c;
        final /* synthetic */ rx.internal.operators.b2 d;

        a(rx.internal.operators.b2 r1, rx.l r2, rx.l r3) {
                r0 = this;
                r0.d = r1
                r0.c = r3
                r0.<init>(r2)
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.l r0 = r1.c
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.l r0 = r1.c
                r0.onError(r2)
                return
        }

        public void onNext(T r4) {
                r3 = this;
                rx.internal.operators.b2 r0 = r3.d     // Catch: java.lang.Throwable -> L3c
                rx.functions.p<? super T, ? extends U> r0 = r0.a     // Catch: java.lang.Throwable -> L3c
                java.lang.Object r0 = r0.call(r4)     // Catch: java.lang.Throwable -> L3c
                U r1 = r3.a
                r3.a = r0
                boolean r2 = r3.b
                if (r2 == 0) goto L33
                rx.internal.operators.b2 r2 = r3.d     // Catch: java.lang.Throwable -> L2c
                rx.functions.q<? super U, ? super U, java.lang.Boolean> r2 = r2.b     // Catch: java.lang.Throwable -> L2c
                java.lang.Object r1 = r2.call(r1, r0)     // Catch: java.lang.Throwable -> L2c
                java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L2c
                boolean r0 = r1.booleanValue()     // Catch: java.lang.Throwable -> L2c
                if (r0 != 0) goto L26
                rx.l r0 = r3.c
                r0.onNext(r4)
                return
            L26:
                r0 = 1
                r3.request(r0)
                return
            L2c:
                r4 = move-exception
                rx.l r1 = r3.c
                rx.exceptions.a.g(r4, r1, r0)
                return
            L33:
                r0 = 1
                r3.b = r0
                rx.l r0 = r3.c
                r0.onNext(r4)
                return
            L3c:
                r0 = move-exception
                rx.l r1 = r3.c
                rx.exceptions.a.g(r0, r1, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b {
        static final rx.internal.operators.b2<?, ?> a = null;

        static {
                rx.internal.operators.b2 r0 = new rx.internal.operators.b2
                rx.functions.p r1 = rx.internal.util.n.c()
                r0.<init>(r1)
                rx.internal.operators.b2.b.a = r0
                return
        }

        b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public b2(rx.functions.p<? super T, ? extends U> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r0
            return
    }

    public b2(rx.functions.q<? super U, ? super U, java.lang.Boolean> r2) {
            r1 = this;
            r1.<init>()
            rx.functions.p r0 = rx.internal.util.n.c()
            r1.a = r0
            r1.b = r2
            return
    }

    public static <T> rx.internal.operators.b2<T, T> a() {
            rx.internal.operators.b2<?, ?> r0 = rx.internal.operators.b2.b.a
            return r0
    }

    public java.lang.Boolean call(U r1, U r2) {
            r0 = this;
            if (r1 == r2) goto Ld
            if (r1 == 0) goto Lb
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            goto Le
        Ld:
            r1 = 1
        Le:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    /* renamed from: call, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m15call(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Boolean r1 = r0.call(r1, r2)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super T> r2) {
            r1 = this;
            rx.internal.operators.b2$a r0 = new rx.internal.operators.b2$a
            r0.<init>(r1, r2, r2)
            return r0
    }
}
