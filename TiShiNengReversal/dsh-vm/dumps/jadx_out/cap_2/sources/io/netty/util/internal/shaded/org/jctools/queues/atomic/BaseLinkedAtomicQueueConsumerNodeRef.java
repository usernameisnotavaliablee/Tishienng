package io.netty.util.internal.shaded.org.jctools.queues.atomic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
abstract class BaseLinkedAtomicQueueConsumerNodeRef<E> extends io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad1<E> {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueConsumerNodeRef, io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode> C_NODE_UPDATER = null;
    protected volatile io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode<E> consumerNode;

    static {
            java.lang.Class<io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode> r0 = io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode.class
            java.lang.String r1 = "consumerNode"
            java.lang.Class<io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueConsumerNodeRef> r2 = io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueConsumerNodeRef.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueConsumerNodeRef.C_NODE_UPDATER = r0
            return
    }

    BaseLinkedAtomicQueueConsumerNodeRef() {
            r0 = this;
            r0.<init>()
            return
    }

    protected final io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode<E> lpConsumerNode() {
            r1 = this;
            io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode<E> r0 = r1.consumerNode
            return r0
    }

    protected final io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode<E> lvConsumerNode() {
            r1 = this;
            io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode<E> r0 = r1.consumerNode
            return r0
    }

    protected final void spConsumerNode(io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode<E> r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueConsumerNodeRef, io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode> r0 = io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueConsumerNodeRef.C_NODE_UPDATER
            r0.lazySet(r1, r2)
            return
    }
}
