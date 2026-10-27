package rx.observables;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class c<T> extends rx.e<T> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.functions.b<rx.m> {
        final /* synthetic */ rx.m[] a;
        final /* synthetic */ rx.observables.c b;

        a(rx.observables.c r1, rx.m[] r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                rx.m r1 = (rx.m) r1
                r0.call(r1)
                return
        }

        public void call(rx.m r3) {
                r2 = this;
                rx.m[] r0 = r2.a
                r1 = 0
                r0[r1] = r3
                return
        }
    }

    protected c(rx.e.a<T> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public abstract void A7(rx.functions.b<? super rx.m> r1);

    public rx.e<T> B7() {
            r1 = this;
            rx.internal.operators.z0 r0 = new rx.internal.operators.z0
            r0.<init>(r1)
            rx.e r0 = rx.e.I6(r0)
            return r0
    }

    public rx.e<T> w7() {
            r1 = this;
            r0 = 1
            rx.e r0 = r1.x7(r0)
            return r0
    }

    public rx.e<T> x7(int r2) {
            r1 = this;
            rx.functions.m$m r0 = rx.functions.m.a()
            rx.e r2 = r1.y7(r2, r0)
            return r2
    }

    public rx.e<T> y7(int r2, rx.functions.b<? super rx.m> r3) {
            r1 = this;
            if (r2 > 0) goto L6
            r1.A7(r3)
            return r1
        L6:
            rx.internal.operators.OnSubscribeAutoConnect r0 = new rx.internal.operators.OnSubscribeAutoConnect
            r0.<init>(r1, r2, r3)
            rx.e r2 = rx.e.I6(r0)
            return r2
    }

    public final rx.m z7() {
            r2 = this;
            r0 = 1
            rx.m[] r0 = new rx.m[r0]
            rx.observables.c$a r1 = new rx.observables.c$a
            r1.<init>(r2, r0)
            r2.A7(r1)
            r1 = 0
            r0 = r0[r1]
            return r0
    }
}
