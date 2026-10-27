package io.netty.util.internal.shaded.org.jctools.queues;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class SpscLinkedQueue<E> extends io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue<E> {
    public SpscLinkedQueue() {
            r2 = this;
            r2.<init>()
            io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode r0 = r2.newNode()
            r2.spProducerNode(r0)
            r2.spConsumerNode(r0)
            r1 = 0
            r0.soNext(r1)
            return
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int capacity() {
            r1 = this;
            int r0 = super.capacity()
            return r0
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int drain(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Consumer r1) {
            r0 = this;
            int r1 = super.drain(r1)
            return r1
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int drain(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Consumer r1, int r2) {
            r0 = this;
            int r1 = super.drain(r1, r2)
            return r1
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ void drain(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Consumer r1, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.WaitStrategy r2, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.ExitCondition r3) {
            r0 = this;
            super.drain(r1, r2, r3)
            return
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int fill(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Supplier<E> r6) {
            r5 = this;
            r0 = 0
        L2:
            r2 = 4096(0x1000, float:5.74E-42)
            r5.fill(r6, r2)
            r2 = 4096(0x1000, double:2.0237E-320)
            long r0 = r0 + r2
            r2 = 2147479551(0x7fffefff, double:1.0609958713E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L2
            int r6 = (int) r0
            return r6
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int fill(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Supplier<E> r5, int r6) {
            r4 = this;
            if (r6 != 0) goto L4
            r5 = 0
            return r5
        L4:
            java.lang.Object r0 = r5.get()
            io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode r0 = r4.newNode(r0)
            r1 = 1
            r2 = r0
        Le:
            if (r1 >= r6) goto L1f
            java.lang.Object r3 = r5.get()
            io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode r3 = r4.newNode(r3)
            r2.soNext(r3)
            int r1 = r1 + 1
            r2 = r3
            goto Le
        L1f:
            io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode r5 = r4.lpProducerNode()
            r5.soNext(r0)
            r4.spProducerNode(r2)
            return r6
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public void fill(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Supplier<E> r3, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.WaitStrategy r4, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.ExitCondition r5) {
            r2 = this;
            io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode<E> r4 = r2.producerNode
        L2:
            boolean r0 = r5.keepRunning()
            if (r0 == 0) goto L1e
            r0 = 0
        L9:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 >= r1) goto L2
            java.lang.Object r1 = r3.get()
            io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode r1 = r2.newNode(r1)
            r4.soNext(r1)
            r2.producerNode = r1
            int r0 = r0 + 1
            r4 = r1
            goto L9
        L1e:
            return
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public boolean offer(E r2) {
            r1 = this;
            if (r2 == 0) goto L12
            io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode r2 = r1.newNode(r2)
            io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode r0 = r1.lpProducerNode()
            r0.soNext(r2)
            r1.spProducerNode(r2)
            r2 = 1
            return r2
        L12:
            r2 = 0
            throw r2
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E peek() {
            r1 = this;
            java.lang.Object r0 = r1.relaxedPeek()
            return r0
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E poll() {
            r1 = this;
            java.lang.Object r0 = r1.relaxedPoll()
            return r0
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ boolean relaxedOffer(java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.relaxedOffer(r1)
            return r1
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ java.lang.Object relaxedPeek() {
            r1 = this;
            java.lang.Object r0 = super.relaxedPeek()
            return r0
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ java.lang.Object relaxedPoll() {
            r1 = this;
            java.lang.Object r0 = super.relaxedPoll()
            return r0
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue, java.util.AbstractCollection
    public /* bridge */ /* synthetic */ java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            return r0
    }
}
