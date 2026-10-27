package io.netty.util.internal.shaded.org.jctools.queues.atomic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
abstract class BaseLinkedAtomicQueue<E> extends io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad2<E> {
    BaseLinkedAtomicQueue() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int capacity() {
            r1 = this;
            r0 = -1
            return r0
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int drain(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Consumer<E> r7) {
            r6 = this;
            r0 = 0
        L2:
            r2 = 4096(0x1000, float:5.74E-42)
            int r3 = r6.drain(r7, r2)
            long r4 = (long) r3
            long r0 = r0 + r4
            if (r3 != r2) goto L13
            r2 = 2147479551(0x7fffefff, double:1.0609958713E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L2
        L13:
            int r7 = (int) r0
            return r7
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int drain(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Consumer<E> r4, int r5) {
            r3 = this;
            io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode<E> r0 = r3.consumerNode
            r1 = 0
        L3:
            if (r1 >= r5) goto L17
            io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode r2 = r0.lvNext()
            if (r2 != 0) goto Lc
            return r1
        Lc:
            java.lang.Object r0 = r3.getSingleConsumerNodeValue(r0, r2)
            r4.accept(r0)
            int r1 = r1 + 1
            r0 = r2
            goto L3
        L17:
            return r5
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public void drain(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Consumer<E> r6, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.WaitStrategy r7, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.ExitCondition r8) {
            r5 = this;
            io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode<E> r0 = r5.consumerNode
            r1 = 0
            r2 = 0
        L4:
            boolean r3 = r8.keepRunning()
            if (r3 == 0) goto L26
            r3 = 0
        Lb:
            r4 = 4096(0x1000, float:5.74E-42)
            if (r3 >= r4) goto L4
            io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode r4 = r0.lvNext()
            if (r4 != 0) goto L1a
            int r2 = r7.idle(r2)
            goto L23
        L1a:
            java.lang.Object r0 = r5.getSingleConsumerNodeValue(r0, r4)
            r6.accept(r0)
            r0 = r4
            r2 = 0
        L23:
            int r3 = r3 + 1
            goto Lb
        L26:
            return
    }

    protected E getSingleConsumerNodeValue(io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode<E> r2, io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode<E> r3) {
            r1 = this;
            java.lang.Object r0 = r3.getAndNullValue()
            r2.soNext(r2)
            r1.spConsumerNode(r3)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public final boolean isEmpty() {
            r2 = this;
            io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode r0 = r2.lvConsumerNode()
            io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode r1 = r2.lvProducerNode()
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

    protected final io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode<E> newNode() {
            r1 = this;
            io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode r0 = new io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode
            r0.<init>()
            return r0
    }

    protected final io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode<E> newNode(E r2) {
            r1 = this;
            io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode r0 = new io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode
            r0.<init>(r2)
            return r0
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public boolean relaxedOffer(E r1) {
            r0 = this;
            boolean r1 = r0.offer(r1)
            return r1
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E relaxedPeek() {
            r1 = this;
            io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode r0 = r1.lpConsumerNode()
            io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode r0 = r0.lvNext()
            if (r0 == 0) goto Lf
            java.lang.Object r0 = r0.lpValue()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E relaxedPoll() {
            r2 = this;
            io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode r0 = r2.lpConsumerNode()
            io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode r1 = r0.lvNext()
            if (r1 == 0) goto Lf
            java.lang.Object r0 = r2.getSingleConsumerNodeValue(r0, r1)
            return r0
        Lf:
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public final int size() {
            r4 = this;
            io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode r0 = r4.lvConsumerNode()
            io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode r1 = r4.lvProducerNode()
            r2 = 0
        L9:
            if (r0 == r1) goto L1d
            if (r0 == 0) goto L1d
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 >= r3) goto L1d
            io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode r3 = r0.lvNext()
            if (r3 != r0) goto L19
            goto L1d
        L19:
            int r2 = r2 + 1
            r0 = r3
            goto L9
        L1d:
            return r2
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getName()
            return r0
    }
}
