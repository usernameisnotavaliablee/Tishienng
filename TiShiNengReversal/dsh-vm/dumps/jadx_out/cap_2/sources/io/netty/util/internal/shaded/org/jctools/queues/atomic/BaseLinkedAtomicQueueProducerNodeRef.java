package io.netty.util.internal.shaded.org.jctools.queues.atomic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
abstract class BaseLinkedAtomicQueueProducerNodeRef<E> extends io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad0<E> {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef, io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode> P_NODE_UPDATER = null;
    protected volatile io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode<E> producerNode;

    static {
            java.lang.Class<io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode> r0 = io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode.class
            java.lang.String r1 = "producerNode"
            java.lang.Class<io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef> r2 = io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef.P_NODE_UPDATER = r0
            return
    }

    BaseLinkedAtomicQueueProducerNodeRef() {
            r0 = this;
            r0.<init>()
            return
    }

    protected final boolean casProducerNode(io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode<E> r2, io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode<E> r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef, io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode> r0 = io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef.P_NODE_UPDATER
            boolean r2 = androidx.concurrent.futures.a.a(r0, r1, r2, r3)
            return r2
    }

    protected final io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode<E> lpProducerNode() {
            r1 = this;
            io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode<E> r0 = r1.producerNode
            return r0
    }

    protected final io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode<E> lvProducerNode() {
            r1 = this;
            io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode<E> r0 = r1.producerNode
            return r0
    }

    protected final void spProducerNode(io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode<E> r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef, io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode> r0 = io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef.P_NODE_UPDATER
            r0.lazySet(r1, r2)
            return
    }

    protected final io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode<E> xchgProducerNode(io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode<E> r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef, io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode> r0 = io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef.P_NODE_UPDATER
            java.lang.Object r2 = r0.getAndSet(r1, r2)
            io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode r2 = (io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode) r2
            return r2
    }
}
