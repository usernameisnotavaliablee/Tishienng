package rx.internal.producers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class SingleProducer<T> extends java.util.concurrent.atomic.AtomicBoolean implements rx.g {
    private static final long serialVersionUID = -3353584923995471404L;
    final rx.l<? super T> child;
    final T value;

    public SingleProducer(rx.l<? super T> r1, T r2) {
            r0 = this;
            r0.<init>()
            r0.child = r1
            r0.value = r2
            return
    }

    public void request(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L2f
            if (r2 != 0) goto L9
            goto L2e
        L9:
            r4 = 0
            r5 = 1
            boolean r4 = r3.compareAndSet(r4, r5)
            if (r4 == 0) goto L2e
            rx.l<? super T> r4 = r3.child
            boolean r5 = r4.isUnsubscribed()
            if (r5 == 0) goto L1a
            goto L2e
        L1a:
            T r5 = r3.value
            r4.onNext(r5)     // Catch: java.lang.Throwable -> L2a
            boolean r5 = r4.isUnsubscribed()
            if (r5 == 0) goto L26
            goto L2e
        L26:
            r4.onCompleted()
            return
        L2a:
            r0 = move-exception
            rx.exceptions.a.g(r0, r4, r5)
        L2e:
            return
        L2f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "n >= 0 required"
            r4.<init>(r5)
            throw r4
    }
}
