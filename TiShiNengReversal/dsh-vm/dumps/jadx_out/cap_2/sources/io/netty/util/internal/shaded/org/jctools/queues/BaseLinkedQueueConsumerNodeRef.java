package io.netty.util.internal.shaded.org.jctools.queues;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
abstract class BaseLinkedQueueConsumerNodeRef<E> extends io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad1<E> {
    protected static final long C_NODE_OFFSET = 0;
    protected io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode<E> consumerNode;

    static {
            java.lang.Class<io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueConsumerNodeRef> r0 = io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueConsumerNodeRef.class
            java.lang.String r1 = "consumerNode"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> L11
            sun.misc.Unsafe r1 = io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess.UNSAFE     // Catch: java.lang.NoSuchFieldException -> L11
            long r0 = r1.objectFieldOffset(r0)     // Catch: java.lang.NoSuchFieldException -> L11
            io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueConsumerNodeRef.C_NODE_OFFSET = r0     // Catch: java.lang.NoSuchFieldException -> L11
            return
        L11:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    BaseLinkedQueueConsumerNodeRef() {
            r0 = this;
            r0.<init>()
            return
    }

    protected final io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode<E> lpConsumerNode() {
            r1 = this;
            io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode<E> r0 = r1.consumerNode
            return r0
    }

    protected final io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode<E> lvConsumerNode() {
            r3 = this;
            sun.misc.Unsafe r0 = io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess.UNSAFE
            long r1 = io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueConsumerNodeRef.C_NODE_OFFSET
            java.lang.Object r0 = r0.getObjectVolatile(r3, r1)
            io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode r0 = (io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode) r0
            return r0
    }

    protected final void spConsumerNode(io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode<E> r1) {
            r0 = this;
            r0.consumerNode = r1
            return
    }
}
