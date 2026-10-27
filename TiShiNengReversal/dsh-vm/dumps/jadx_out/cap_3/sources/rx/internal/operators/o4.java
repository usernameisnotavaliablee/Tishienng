package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class o4<T> implements rx.i.t<T> {
    final java.util.concurrent.Future<? extends T> a;
    final long b;
    final java.util.concurrent.TimeUnit c;

    public o4(java.util.concurrent.Future<? extends T> r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r4
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.k r1 = (rx.k) r1
            r0.call(r1)
            return
    }

    public void call(rx.k<? super T> r7) {
            r6 = this;
            java.util.concurrent.Future<? extends T> r0 = r6.a
            rx.m r1 = rx.subscriptions.f.c(r0)
            r7.b(r1)
            long r1 = r6.b     // Catch: java.lang.Throwable -> L16
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L18
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L16
            goto L1e
        L16:
            r0 = move-exception
            goto L22
        L18:
            java.util.concurrent.TimeUnit r3 = r6.c     // Catch: java.lang.Throwable -> L16
            java.lang.Object r0 = r0.get(r1, r3)     // Catch: java.lang.Throwable -> L16
        L1e:
            r7.d(r0)
            return
        L22:
            rx.exceptions.a.e(r0)
            r7.onError(r0)
            return
    }
}
