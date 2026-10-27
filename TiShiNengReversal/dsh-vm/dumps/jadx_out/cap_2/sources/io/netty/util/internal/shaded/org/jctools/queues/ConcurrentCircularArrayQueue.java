package io.netty.util.internal.shaded.org.jctools.queues;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class ConcurrentCircularArrayQueue<E> extends io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueueL0Pad<E> {
    protected final E[] buffer;
    protected final long mask;

    public ConcurrentCircularArrayQueue(int r3) {
            r2 = this;
            r2.<init>()
            int r3 = io.netty.util.internal.shaded.org.jctools.util.Pow2.roundToPowerOfTwo(r3)
            int r0 = r3 + (-1)
            long r0 = (long) r0
            r2.mask = r0
            java.lang.Object[] r3 = io.netty.util.internal.shaded.org.jctools.queues.CircularArrayOffsetCalculator.allocate(r3)
            r2.buffer = r3
            return
    }

    protected static long calcElementOffset(long r0, long r2) {
            long r0 = io.netty.util.internal.shaded.org.jctools.queues.CircularArrayOffsetCalculator.calcElementOffset(r0, r2)
            return r0
    }

    protected final long calcElementOffset(long r3) {
            r2 = this;
            long r0 = r2.mask
            long r3 = calcElementOffset(r3, r0)
            return r3
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int capacity() {
            r4 = this;
            long r0 = r4.mask
            r2 = 1
            long r0 = r0 + r2
            int r1 = (int) r0
            return r1
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public void clear() {
            r1 = this;
        L0:
            java.lang.Object r0 = r1.poll()
            if (r0 == 0) goto L7
            goto L0
        L7:
            return
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators
    public final long currentConsumerIndex() {
            r2 = this;
            long r0 = r2.lvConsumerIndex()
            return r0
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators
    public final long currentProducerIndex() {
            r2 = this;
            long r0 = r2.lvProducerIndex()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public final boolean isEmpty() {
            r1 = this;
            boolean r0 = io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil.isEmpty(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public final int size() {
            r1 = this;
            int r0 = io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil.size(r1)
            return r0
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getName()
            return r0
    }
}
