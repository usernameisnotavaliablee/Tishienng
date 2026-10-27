package rx.internal.util.unsafe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@rx.internal.util.SuppressAnimalSniffer
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
abstract class b<E> extends rx.internal.util.unsafe.d<E> {
    protected static final long H = 0;
    protected rx.internal.util.atomic.LinkedQueueNode<E> consumerNode;

    static {
            java.lang.Class<rx.internal.util.unsafe.b> r0 = rx.internal.util.unsafe.b.class
            java.lang.String r1 = "consumerNode"
            long r0 = rx.internal.util.unsafe.n0.a(r0, r1)
            rx.internal.util.unsafe.b.H = r0
            return
    }

    b() {
            r0 = this;
            r0.<init>()
            return
    }

    protected final rx.internal.util.atomic.LinkedQueueNode<E> f() {
            r1 = this;
            rx.internal.util.atomic.LinkedQueueNode<E> r0 = r1.consumerNode
            return r0
    }

    protected final rx.internal.util.atomic.LinkedQueueNode<E> g() {
            r3 = this;
            sun.misc.Unsafe r0 = rx.internal.util.unsafe.n0.a
            long r1 = rx.internal.util.unsafe.b.H
            java.lang.Object r0 = r0.getObjectVolatile(r3, r1)
            rx.internal.util.atomic.LinkedQueueNode r0 = (rx.internal.util.atomic.LinkedQueueNode) r0
            return r0
    }

    protected final void j(rx.internal.util.atomic.LinkedQueueNode<E> r1) {
            r0 = this;
            r0.consumerNode = r1
            return
    }
}
