package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class d0<T, U> implements rx.e.a<T> {
    final rx.e<? extends T> a;
    final rx.e<U> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<U> {
        boolean a;
        final /* synthetic */ rx.l b;
        final /* synthetic */ rx.subscriptions.e c;
        final /* synthetic */ rx.internal.operators.d0 d;

        a(rx.internal.operators.d0 r1, rx.l r2, rx.subscriptions.e r3) {
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
                rx.m r1 = rx.subscriptions.f.e()
                r0.b(r1)
                rx.internal.operators.d0 r0 = r2.d
                rx.e<? extends T> r0 = r0.a
                rx.l r1 = r2.b
                r0.J6(r1)
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
                rx.l r0 = r1.b
                r0.onError(r2)
                return
        }

        public void onNext(U r1) {
                r0 = this;
                r0.onCompleted()
                return
        }
    }

    public d0(rx.e<? extends T> r1, rx.e<U> r2) {
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

    public void call(rx.l<? super T> r3) {
            r2 = this;
            rx.subscriptions.e r0 = new rx.subscriptions.e
            r0.<init>()
            r3.add(r0)
            rx.l r3 = rx.observers.h.f(r3)
            rx.internal.operators.d0$a r1 = new rx.internal.operators.d0$a
            r1.<init>(r2, r3, r0)
            r0.b(r1)
            rx.e<U> r3 = r2.b
            r3.J6(r1)
            return
    }
}
