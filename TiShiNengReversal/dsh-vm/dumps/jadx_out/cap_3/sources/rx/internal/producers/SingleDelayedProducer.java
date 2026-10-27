package rx.internal.producers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class SingleDelayedProducer<T> extends java.util.concurrent.atomic.AtomicInteger implements rx.g {
    static final int HAS_REQUEST_HAS_VALUE = 3;
    static final int HAS_REQUEST_NO_VALUE = 2;
    static final int NO_REQUEST_HAS_VALUE = 1;
    static final int NO_REQUEST_NO_VALUE = 0;
    private static final long serialVersionUID = -2873467947112093874L;
    final rx.l<? super T> child;
    T value;

    public SingleDelayedProducer(rx.l<? super T> r1) {
            r0 = this;
            r0.<init>()
            r0.child = r1
            return
    }

    private static <T> void emit(rx.l<? super T> r1, T r2) {
            boolean r0 = r1.isUnsubscribed()
            if (r0 == 0) goto L7
            goto L10
        L7:
            r1.onNext(r2)     // Catch: java.lang.Throwable -> L15
            boolean r2 = r1.isUnsubscribed()
            if (r2 == 0) goto L11
        L10:
            return
        L11:
            r1.onCompleted()
            return
        L15:
            r0 = move-exception
            rx.exceptions.a.g(r0, r1, r2)
            return
    }

    public void request(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L2a
            if (r2 != 0) goto L9
            goto L29
        L9:
            int r4 = r3.get()
            if (r4 != 0) goto L18
            r4 = 0
            r5 = 2
            boolean r4 = r3.compareAndSet(r4, r5)
            if (r4 != 0) goto L29
            goto L9
        L18:
            r5 = 1
            if (r4 != r5) goto L29
            r4 = 3
            boolean r4 = r3.compareAndSet(r5, r4)
            if (r4 == 0) goto L29
            rx.l<? super T> r4 = r3.child
            T r5 = r3.value
            emit(r4, r5)
        L29:
            return
        L2a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "n >= 0 required"
            r4.<init>(r5)
            throw r4
    }

    public void setValue(T r3) {
            r2 = this;
        L0:
            int r0 = r2.get()
            if (r0 != 0) goto L11
            r2.value = r3
            r0 = 0
            r1 = 1
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 != 0) goto L20
            goto L0
        L11:
            r1 = 2
            if (r0 != r1) goto L20
            r0 = 3
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L20
            rx.l<? super T> r0 = r2.child
            emit(r0, r3)
        L20:
            return
    }
}
