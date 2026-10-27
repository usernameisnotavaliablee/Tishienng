package rx.internal.util.atomic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class LinkedQueueNode<E> extends java.util.concurrent.atomic.AtomicReference<rx.internal.util.atomic.LinkedQueueNode<E>> {
    private static final long serialVersionUID = 2404266111789071508L;
    private E value;

    public LinkedQueueNode() {
            r0 = this;
            r0.<init>()
            return
    }

    public LinkedQueueNode(E r1) {
            r0 = this;
            r0.<init>()
            r0.spValue(r1)
            return
    }

    public E getAndNullValue() {
            r2 = this;
            java.lang.Object r0 = r2.lpValue()
            r1 = 0
            r2.spValue(r1)
            return r0
    }

    public E lpValue() {
            r1 = this;
            E r0 = r1.value
            return r0
    }

    public rx.internal.util.atomic.LinkedQueueNode<E> lvNext() {
            r1 = this;
            java.lang.Object r0 = r1.get()
            rx.internal.util.atomic.LinkedQueueNode r0 = (rx.internal.util.atomic.LinkedQueueNode) r0
            return r0
    }

    public void soNext(rx.internal.util.atomic.LinkedQueueNode<E> r1) {
            r0 = this;
            r0.lazySet(r1)
            return
    }

    public void spValue(E r1) {
            r0 = this;
            r0.value = r1
            return
    }
}
