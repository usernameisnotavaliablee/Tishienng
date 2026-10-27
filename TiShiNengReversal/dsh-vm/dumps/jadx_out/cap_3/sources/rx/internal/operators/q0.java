package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class q0<T, R> implements rx.e.a<R> {
    final rx.e.a<T> a;
    final rx.e.b<? extends R, ? super T> b;

    public q0(rx.e.a<T> r1, rx.e.b<? extends R, ? super T> r2) {
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

    public void call(rx.l<? super R> r3) {
            r2 = this;
            rx.e$b<? extends R, ? super T> r0 = r2.b     // Catch: java.lang.Throwable -> L1d
            rx.e$b r0 = rx.plugins.c.M(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r0 = r0.call(r3)     // Catch: java.lang.Throwable -> L1d
            rx.l r0 = (rx.l) r0     // Catch: java.lang.Throwable -> L1d
            r0.onStart()     // Catch: java.lang.Throwable -> L15
            rx.e$a<T> r1 = r2.a     // Catch: java.lang.Throwable -> L15
            r1.call(r0)     // Catch: java.lang.Throwable -> L15
            goto L24
        L15:
            r1 = move-exception
            rx.exceptions.a.e(r1)     // Catch: java.lang.Throwable -> L1d
            r0.onError(r1)     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r0 = move-exception
            rx.exceptions.a.e(r0)
            r3.onError(r0)
        L24:
            return
    }
}
