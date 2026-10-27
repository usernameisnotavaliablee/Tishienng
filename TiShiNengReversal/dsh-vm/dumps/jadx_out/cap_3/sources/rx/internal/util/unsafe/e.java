package rx.internal.util.unsafe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@rx.internal.util.SuppressAnimalSniffer
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
abstract class e<E> extends rx.internal.util.unsafe.c<E> {
    protected static final long q = 0;
    protected rx.internal.util.atomic.LinkedQueueNode<E> producerNode;

    static {
            java.lang.Class<rx.internal.util.unsafe.e> r0 = rx.internal.util.unsafe.e.class
            java.lang.String r1 = "producerNode"
            long r0 = rx.internal.util.unsafe.n0.a(r0, r1)
            rx.internal.util.unsafe.e.q = r0
            return
    }

    e() {
            r0 = this;
            r0.<init>()
            return
    }

    protected final rx.internal.util.atomic.LinkedQueueNode<E> a() {
            r1 = this;
            rx.internal.util.atomic.LinkedQueueNode<E> r0 = r1.producerNode
            return r0
    }

    protected final rx.internal.util.atomic.LinkedQueueNode<E> d() {
            r3 = this;
            sun.misc.Unsafe r0 = rx.internal.util.unsafe.n0.a
            long r1 = rx.internal.util.unsafe.e.q
            java.lang.Object r0 = r0.getObjectVolatile(r3, r1)
            rx.internal.util.atomic.LinkedQueueNode r0 = (rx.internal.util.atomic.LinkedQueueNode) r0
            return r0
    }

    protected final void e(rx.internal.util.atomic.LinkedQueueNode<E> r1) {
            r0 = this;
            r0.producerNode = r1
            return
    }
}
