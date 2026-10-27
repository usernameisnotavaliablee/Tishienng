package rx.internal.util.unsafe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class g0<E> extends rx.internal.util.unsafe.a<E> {
    public g0() {
            r2 = this;
            r2.<init>()
            rx.internal.util.atomic.LinkedQueueNode r0 = new rx.internal.util.atomic.LinkedQueueNode
            r0.<init>()
            r2.e(r0)
            rx.internal.util.atomic.LinkedQueueNode<E> r0 = r2.producerNode
            r2.j(r0)
            rx.internal.util.atomic.LinkedQueueNode<E> r0 = r2.consumerNode
            r1 = 0
            r0.soNext(r1)
            return
    }

    @Override // java.util.Queue
    public boolean offer(E r2) {
            r1 = this;
            if (r2 == 0) goto L10
            rx.internal.util.atomic.LinkedQueueNode r0 = new rx.internal.util.atomic.LinkedQueueNode
            r0.<init>(r2)
            rx.internal.util.atomic.LinkedQueueNode<E> r2 = r1.producerNode
            r2.soNext(r0)
            r1.producerNode = r0
            r2 = 1
            return r2
        L10:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "null elements not allowed"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Queue
    public E peek() {
            r1 = this;
            rx.internal.util.atomic.LinkedQueueNode<E> r0 = r1.consumerNode
            rx.internal.util.atomic.LinkedQueueNode r0 = r0.lvNext()
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r0.lpValue()
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // java.util.Queue
    public E poll() {
            r2 = this;
            rx.internal.util.atomic.LinkedQueueNode<E> r0 = r2.consumerNode
            rx.internal.util.atomic.LinkedQueueNode r0 = r0.lvNext()
            if (r0 == 0) goto Lf
            java.lang.Object r1 = r0.getAndNullValue()
            r2.consumerNode = r0
            return r1
        Lf:
            r0 = 0
            return r0
    }
}
