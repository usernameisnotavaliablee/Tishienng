package io.netty.util.internal.shaded.org.jctools.queues.atomic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
abstract class AtomicReferenceArrayQueue<E> extends java.util.AbstractQueue<E> implements io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue, io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue<E> {
    protected final java.util.concurrent.atomic.AtomicReferenceArray<E> buffer;
    protected final int mask;

    public AtomicReferenceArrayQueue(int r2) {
            r1 = this;
            r1.<init>()
            int r2 = io.netty.util.internal.shaded.org.jctools.util.Pow2.roundToPowerOfTwo(r2)
            int r0 = r2 + (-1)
            r1.mask = r0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r0.<init>(r2)
            r1.buffer = r0
            return
    }

    public static <E> E lpElement(java.util.concurrent.atomic.AtomicReferenceArray<E> r0, int r1) {
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    public static <E> E lvElement(java.util.concurrent.atomic.AtomicReferenceArray<E> r0, int r1) {
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    public static <E> void soElement(java.util.concurrent.atomic.AtomicReferenceArray<E> r0, int r1, E r2) {
            r0.lazySet(r1, r2)
            return
    }

    public static <E> void spElement(java.util.concurrent.atomic.AtomicReferenceArray<E> r0, int r1, E r2) {
            r0.lazySet(r1, r2)
            return
    }

    public static <E> void svElement(java.util.concurrent.atomic.AtomicReferenceArray<E> r0, int r1, E r2) {
            r0.set(r1, r2)
            return
    }

    protected final int calcElementOffset(long r1) {
            r0 = this;
            int r2 = (int) r1
            int r1 = r0.mask
            r1 = r1 & r2
            return r1
    }

    protected final int calcElementOffset(long r1, int r3) {
            r0 = this;
            int r2 = (int) r1
            r1 = r2 & r3
            return r1
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public final int capacity() {
            r1 = this;
            int r0 = r1.mask
            int r0 = r0 + 1
            return r0
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

    protected final E lpElement(int r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<E> r0 = r1.buffer
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    protected final E lvElement(int r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<E> r0 = r1.buffer
            java.lang.Object r2 = lvElement(r0, r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public final int size() {
            r1 = this;
            int r0 = io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil.size(r1)
            return r0
    }

    protected final void soElement(int r2, E r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<E> r0 = r1.buffer
            r0.lazySet(r2, r3)
            return
    }

    protected final void spElement(int r2, E r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<E> r0 = r1.buffer
            r0.lazySet(r2, r3)
            return
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getName()
            return r0
    }
}
