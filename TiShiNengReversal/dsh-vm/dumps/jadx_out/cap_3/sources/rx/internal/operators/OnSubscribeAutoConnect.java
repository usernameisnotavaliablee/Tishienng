package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class OnSubscribeAutoConnect<T> extends java.util.concurrent.atomic.AtomicInteger implements rx.e.a<T> {
    final rx.functions.b<? super rx.m> connection;
    final int numberOfSubscribers;
    final rx.observables.c<? extends T> source;

    public OnSubscribeAutoConnect(rx.observables.c<? extends T> r1, int r2, rx.functions.b<? super rx.m> r3) {
            r0 = this;
            r0.<init>()
            if (r2 <= 0) goto Lc
            r0.source = r1
            r0.numberOfSubscribers = r2
            r0.connection = r3
            return
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "numberOfSubscribers > 0 required"
            r1.<init>(r2)
            throw r1
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super T> r2) {
            r1 = this;
            rx.observables.c<? extends T> r0 = r1.source
            rx.l r2 = rx.observers.h.f(r2)
            r0.J6(r2)
            int r2 = r1.incrementAndGet()
            int r0 = r1.numberOfSubscribers
            if (r2 != r0) goto L18
            rx.observables.c<? extends T> r2 = r1.source
            rx.functions.b<? super rx.m> r0 = r1.connection
            r2.A7(r0)
        L18:
            return
    }
}
