package rx.internal.util.atomic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
abstract class b<E> extends java.util.AbstractQueue<E> {
    private final java.util.concurrent.atomic.AtomicReference<rx.internal.util.atomic.LinkedQueueNode<E>> a;
    private final java.util.concurrent.atomic.AtomicReference<rx.internal.util.atomic.LinkedQueueNode<E>> b;

    public b() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.a = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.b = r0
            return
    }

    protected final rx.internal.util.atomic.LinkedQueueNode<E> a() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<rx.internal.util.atomic.LinkedQueueNode<E>> r0 = r1.b
            java.lang.Object r0 = r0.get()
            rx.internal.util.atomic.LinkedQueueNode r0 = (rx.internal.util.atomic.LinkedQueueNode) r0
            return r0
    }

    protected final rx.internal.util.atomic.LinkedQueueNode<E> d() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<rx.internal.util.atomic.LinkedQueueNode<E>> r0 = r1.a
            java.lang.Object r0 = r0.get()
            rx.internal.util.atomic.LinkedQueueNode r0 = (rx.internal.util.atomic.LinkedQueueNode) r0
            return r0
    }

    protected final rx.internal.util.atomic.LinkedQueueNode<E> e() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<rx.internal.util.atomic.LinkedQueueNode<E>> r0 = r1.b
            java.lang.Object r0 = r0.get()
            rx.internal.util.atomic.LinkedQueueNode r0 = (rx.internal.util.atomic.LinkedQueueNode) r0
            return r0
    }

    protected final rx.internal.util.atomic.LinkedQueueNode<E> f() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<rx.internal.util.atomic.LinkedQueueNode<E>> r0 = r1.a
            java.lang.Object r0 = r0.get()
            rx.internal.util.atomic.LinkedQueueNode r0 = (rx.internal.util.atomic.LinkedQueueNode) r0
            return r0
    }

    protected final void g(rx.internal.util.atomic.LinkedQueueNode<E> r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<rx.internal.util.atomic.LinkedQueueNode<E>> r0 = r1.b
            r0.lazySet(r2)
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
            r2 = this;
            rx.internal.util.atomic.LinkedQueueNode r0 = r2.e()
            rx.internal.util.atomic.LinkedQueueNode r1 = r2.f()
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<E> iterator() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    protected final void j(rx.internal.util.atomic.LinkedQueueNode<E> r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<rx.internal.util.atomic.LinkedQueueNode<E>> r0 = r1.a
            r0.lazySet(r2)
            return
    }

    protected final rx.internal.util.atomic.LinkedQueueNode<E> m(rx.internal.util.atomic.LinkedQueueNode<E> r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<rx.internal.util.atomic.LinkedQueueNode<E>> r0 = r1.a
            java.lang.Object r2 = r0.getAndSet(r2)
            rx.internal.util.atomic.LinkedQueueNode r2 = (rx.internal.util.atomic.LinkedQueueNode) r2
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
            r4 = this;
            rx.internal.util.atomic.LinkedQueueNode r0 = r4.e()
            rx.internal.util.atomic.LinkedQueueNode r1 = r4.f()
            r2 = 0
        L9:
            if (r0 == r1) goto L1b
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 >= r3) goto L1b
        L10:
            rx.internal.util.atomic.LinkedQueueNode r3 = r0.lvNext()
            if (r3 != 0) goto L17
            goto L10
        L17:
            int r2 = r2 + 1
            r0 = r3
            goto L9
        L1b:
            return r2
    }
}
