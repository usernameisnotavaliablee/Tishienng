package io.netty.util.internal.shaded.org.jctools.queues;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class LinkedQueueNode<E> {
    private static final long NEXT_OFFSET = 0;
    private volatile io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode<E> next;
    private E value;

    static {
            sun.misc.Unsafe r0 = io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess.UNSAFE     // Catch: java.lang.NoSuchFieldException -> L11
            java.lang.Class<io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode> r1 = io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode.class
            java.lang.String r2 = "next"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L11
            long r0 = r0.objectFieldOffset(r1)     // Catch: java.lang.NoSuchFieldException -> L11
            io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode.NEXT_OFFSET = r0     // Catch: java.lang.NoSuchFieldException -> L11
            return
        L11:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    LinkedQueueNode() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    LinkedQueueNode(E r1) {
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

    public io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode<E> lvNext() {
            r1 = this;
            io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode<E> r0 = r1.next
            return r0
    }

    public void soNext(io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode<E> r4) {
            r3 = this;
            sun.misc.Unsafe r0 = io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess.UNSAFE
            long r1 = io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode.NEXT_OFFSET
            r0.putOrderedObject(r3, r1, r4)
            return
    }

    public void spValue(E r1) {
            r0 = this;
            r0.value = r1
            return
    }
}
