package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class t4<T> implements rx.i.t<T> {
    final rx.i<? extends T> a;
    final rx.e<?> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.k<T> {
        final /* synthetic */ rx.k b;
        final /* synthetic */ rx.internal.operators.t4 c;

        a(rx.internal.operators.t4 r1, rx.k r2) {
                r0 = this;
                r0.c = r1
                r0.b = r2
                r0.<init>()
                return
        }

        public void d(T r2) {
                r1 = this;
                rx.k r0 = r1.b
                r0.d(r2)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.k r0 = r1.b
                r0.onError(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends rx.l<java.lang.Object> {
        boolean a;
        final /* synthetic */ rx.k b;
        final /* synthetic */ rx.subscriptions.e c;
        final /* synthetic */ rx.internal.operators.t4 d;

        b(rx.internal.operators.t4 r1, rx.k r2, rx.subscriptions.e r3) {
                r0 = this;
                r0.d = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        public void onCompleted() {
                r2 = this;
                boolean r0 = r2.a
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r2.a = r0
                rx.subscriptions.e r0 = r2.c
                rx.k r1 = r2.b
                r0.b(r1)
                rx.internal.operators.t4 r0 = r2.d
                rx.i<? extends T> r0 = r0.a
                rx.k r1 = r2.b
                r0.j0(r1)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.a
                if (r0 == 0) goto L8
                rx.plugins.c.I(r2)
                return
            L8:
                r0 = 1
                r1.a = r0
                rx.k r0 = r1.b
                r0.onError(r2)
                return
        }

        public void onNext(java.lang.Object r1) {
                r0 = this;
                r0.onCompleted()
                return
        }
    }

    public t4(rx.i<? extends T> r1, rx.e<?> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.k r1 = (rx.k) r1
            r0.call(r1)
            return
    }

    public void call(rx.k<? super T> r3) {
            r2 = this;
            rx.internal.operators.t4$a r0 = new rx.internal.operators.t4$a
            r0.<init>(r2, r3)
            rx.subscriptions.e r1 = new rx.subscriptions.e
            r1.<init>()
            r3.b(r1)
            rx.internal.operators.t4$b r3 = new rx.internal.operators.t4$b
            r3.<init>(r2, r0, r1)
            r1.b(r3)
            rx.e<?> r0 = r2.b
            r0.r5(r3)
            return
    }
}
