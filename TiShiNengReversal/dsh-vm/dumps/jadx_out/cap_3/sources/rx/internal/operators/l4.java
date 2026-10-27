package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class l4<T> implements rx.i.t<T> {
    final rx.i.t<T> a;
    final rx.functions.a b;

    public l4(rx.i.t<T> r1, rx.functions.a r2) {
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

    public void call(rx.k<? super T> r2) {
            r1 = this;
            rx.functions.a r0 = r1.b
            rx.m r0 = rx.subscriptions.f.a(r0)
            r2.b(r0)
            rx.i$t<T> r0 = r1.a
            r0.call(r2)
            return
    }
}
