package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class b0<T> implements rx.e.a<T> {
    final rx.functions.o<? extends rx.e<? extends T>> a;

    public b0(rx.functions.o<? extends rx.e<? extends T>> r1) {
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
            rx.functions.o<? extends rx.e<? extends T>> r0 = r1.a     // Catch: java.lang.Throwable -> L10
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L10
            rx.e r0 = (rx.e) r0     // Catch: java.lang.Throwable -> L10
            rx.l r2 = rx.observers.h.f(r2)
            r0.J6(r2)
            return
        L10:
            r0 = move-exception
            rx.exceptions.a.f(r0, r2)
            return
    }
}
