package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class m4<T> implements rx.i.t<T> {
    final java.util.concurrent.Callable<? extends T> a;

    public m4(java.util.concurrent.Callable<? extends T> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
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
            java.util.concurrent.Callable<? extends T> r0 = r1.a     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> La
            r2.d(r0)
            return
        La:
            r0 = move-exception
            rx.exceptions.a.e(r0)
            r2.onError(r0)
            return
    }
}
