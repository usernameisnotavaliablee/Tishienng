package io.netty.util.internal.shaded.org.jctools.queues.atomic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class MpscAtomicArrayQueue<E> extends io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL3Pad<E> {
    public MpscAtomicArrayQueue(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ void clear() {
            r0 = this;
            super.clear()
            return
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int drain(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Consumer<E> r2) {
            r1 = this;
            int r0 = r1.capacity()
            int r2 = r1.drain(r2, r0)
            return r2
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int drain(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Consumer<E> r12, int r13) {
            r11 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<E> r0 = r11.buffer
            int r1 = r11.mask
            long r2 = r11.lpConsumerIndex()
            r4 = 0
        L9:
            if (r4 >= r13) goto L28
            long r5 = (long) r4
            long r5 = r5 + r2
            int r7 = r11.calcElementOffset(r5, r1)
            java.lang.Object r8 = io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue.lvElement(r0, r7)
            if (r8 != 0) goto L18
            return r4
        L18:
            r9 = 0
            io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue.spElement(r0, r7, r9)
            r9 = 1
            long r5 = r5 + r9
            r11.soConsumerIndex(r5)
            r12.accept(r8)
            int r4 = r4 + 1
            goto L9
        L28:
            return r13
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public void drain(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Consumer<E> r12, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.WaitStrategy r13, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.ExitCondition r14) {
            r11 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<E> r0 = r11.buffer
            int r1 = r11.mask
            long r2 = r11.lpConsumerIndex()
            r4 = 0
            r5 = 0
        La:
            boolean r6 = r14.keepRunning()
            if (r6 == 0) goto L35
            r6 = 0
        L11:
            r7 = 4096(0x1000, float:5.74E-42)
            if (r6 >= r7) goto La
            int r7 = r11.calcElementOffset(r2, r1)
            java.lang.Object r8 = io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue.lvElement(r0, r7)
            if (r8 != 0) goto L24
            int r5 = r13.idle(r5)
            goto L32
        L24:
            r9 = 1
            long r2 = r2 + r9
            r5 = 0
            io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue.spElement(r0, r7, r5)
            r11.soConsumerIndex(r2)
            r12.accept(r8)
            r5 = 0
        L32:
            int r6 = r6 + 1
            goto L11
        L35:
            return
    }

    public final int failFastOffer(E r9) {
            r8 = this;
            if (r9 == 0) goto L37
            int r0 = r8.mask
            int r1 = r0 + 1
            long r1 = (long) r1
            long r3 = r8.lvProducerIndex()
            long r5 = r8.lvProducerLimit()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L21
            long r5 = r8.lvConsumerIndex()
            long r5 = r5 + r1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L1e
            r9 = 1
            return r9
        L1e:
            r8.soProducerLimit(r5)
        L21:
            r1 = 1
            long r1 = r1 + r3
            boolean r1 = r8.casProducerIndex(r3, r1)
            if (r1 != 0) goto L2c
            r9 = -1
            return r9
        L2c:
            int r0 = r8.calcElementOffset(r3, r0)
            java.util.concurrent.atomic.AtomicReferenceArray<E> r1 = r8.buffer
            io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue.soElement(r1, r0, r9)
            r9 = 0
            return r9
        L37:
            r9 = 0
            throw r9
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int fill(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Supplier<E> r7) {
            r6 = this;
            int r0 = r6.capacity()
            r1 = 0
        L6:
            int r3 = io.netty.util.internal.shaded.org.jctools.util.PortableJvmInfo.RECOMENDED_OFFER_BATCH
            int r3 = r6.fill(r7, r3)
            if (r3 != 0) goto L10
            int r7 = (int) r1
            return r7
        L10:
            long r3 = (long) r3
            long r1 = r1 + r3
            long r3 = (long) r0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L6
            int r7 = (int) r1
            return r7
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int fill(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Supplier<E> r14, int r15) {
            r13 = this;
            int r0 = r13.mask
            int r1 = r0 + 1
            long r1 = (long) r1
            long r3 = r13.lvProducerLimit()
        L9:
            long r5 = r13.lvProducerIndex()
            long r7 = r3 - r5
            r9 = 0
            r10 = 0
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 > 0) goto L25
            long r3 = r13.lvConsumerIndex()
            long r3 = r3 + r1
            long r7 = r3 - r5
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 > 0) goto L22
            return r9
        L22:
            r13.soProducerLimit(r3)
        L25:
            int r8 = (int) r7
            int r7 = java.lang.Math.min(r8, r15)
            long r10 = (long) r7
            long r10 = r10 + r5
            boolean r8 = r13.casProducerIndex(r5, r10)
            if (r8 == 0) goto L9
            java.util.concurrent.atomic.AtomicReferenceArray<E> r15 = r13.buffer
        L34:
            if (r9 >= r7) goto L46
            long r1 = (long) r9
            long r1 = r1 + r5
            int r1 = r13.calcElementOffset(r1, r0)
            java.lang.Object r2 = r14.get()
            io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue.soElement(r15, r1, r2)
            int r9 = r9 + 1
            goto L34
        L46:
            return r7
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public void fill(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Supplier<E> r4, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.WaitStrategy r5, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.ExitCondition r6) {
            r3 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            boolean r2 = r6.keepRunning()
            if (r2 == 0) goto L15
            int r2 = io.netty.util.internal.shaded.org.jctools.util.PortableJvmInfo.RECOMENDED_OFFER_BATCH
            int r2 = r3.fill(r4, r2)
            if (r2 != 0) goto L1
            int r1 = r5.idle(r1)
            goto L2
        L15:
            return
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            java.util.Iterator r0 = super.iterator()
            return r0
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public boolean offer(E r10) {
            r9 = this;
            if (r10 == 0) goto L34
            int r0 = r9.mask
            long r1 = r9.lvProducerLimit()
        L8:
            long r3 = r9.lvProducerIndex()
            r5 = 1
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 < 0) goto L22
            long r1 = r9.lvConsumerIndex()
            long r7 = (long) r0
            long r1 = r1 + r7
            long r1 = r1 + r5
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 < 0) goto L1f
            r10 = 0
            return r10
        L1f:
            r9.soProducerLimit(r1)
        L22:
            long r5 = r5 + r3
            boolean r5 = r9.casProducerIndex(r3, r5)
            if (r5 == 0) goto L8
            int r0 = r9.calcElementOffset(r3, r0)
            java.util.concurrent.atomic.AtomicReferenceArray<E> r1 = r9.buffer
            io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue.soElement(r1, r0, r10)
            r10 = 1
            return r10
        L34:
            r10 = 0
            throw r10
    }

    public boolean offerIfBelowThreshold(E r13, int r14) {
            r12 = this;
            if (r13 == 0) goto L3c
            int r0 = r12.mask
            int r1 = r0 + 1
            long r1 = (long) r1
            long r3 = r12.lvProducerLimit()
        Lb:
            long r5 = r12.lvProducerIndex()
            long r7 = r3 - r5
            long r7 = r1 - r7
            long r9 = (long) r14
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L28
            long r3 = r12.lvConsumerIndex()
            long r7 = r5 - r3
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L24
            r13 = 0
            return r13
        L24:
            long r3 = r3 + r1
            r12.soProducerLimit(r3)
        L28:
            r7 = 1
            long r7 = r7 + r5
            boolean r7 = r12.casProducerIndex(r5, r7)
            if (r7 == 0) goto Lb
            int r14 = r12.calcElementOffset(r5, r0)
            java.util.concurrent.atomic.AtomicReferenceArray<E> r0 = r12.buffer
            io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue.soElement(r0, r14, r13)
            r13 = 1
            return r13
        L3c:
            r13 = 0
            throw r13
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E peek() {
            r7 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<E> r0 = r7.buffer
            long r1 = r7.lpConsumerIndex()
            int r3 = r7.calcElementOffset(r1)
            java.lang.Object r4 = io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue.lvElement(r0, r3)
            if (r4 != 0) goto L21
            long r4 = r7.lvProducerIndex()
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 == 0) goto L1f
        L18:
            java.lang.Object r1 = io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue.lvElement(r0, r3)
            if (r1 == 0) goto L18
            return r1
        L1f:
            r0 = 0
            return r0
        L21:
            return r4
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E poll() {
            r8 = this;
            long r0 = r8.lpConsumerIndex()
            int r2 = r8.calcElementOffset(r0)
            java.util.concurrent.atomic.AtomicReferenceArray<E> r3 = r8.buffer
            java.lang.Object r4 = io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue.lvElement(r3, r2)
            r5 = 0
            if (r4 != 0) goto L21
            long r6 = r8.lvProducerIndex()
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 == 0) goto L20
        L19:
            java.lang.Object r4 = io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue.lvElement(r3, r2)
            if (r4 == 0) goto L19
            goto L21
        L20:
            return r5
        L21:
            io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue.spElement(r3, r2, r5)
            r2 = 1
            long r0 = r0 + r2
            r8.soConsumerIndex(r0)
            return r4
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public boolean relaxedOffer(E r1) {
            r0 = this;
            boolean r1 = r0.offer(r1)
            return r1
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E relaxedPeek() {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<E> r0 = r4.buffer
            int r1 = r4.mask
            long r2 = r4.lpConsumerIndex()
            int r1 = r4.calcElementOffset(r2, r1)
            java.lang.Object r0 = io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue.lvElement(r0, r1)
            return r0
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E relaxedPoll() {
            r7 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<E> r0 = r7.buffer
            long r1 = r7.lpConsumerIndex()
            int r3 = r7.calcElementOffset(r1)
            java.lang.Object r4 = io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue.lvElement(r0, r3)
            r5 = 0
            if (r4 != 0) goto L12
            return r5
        L12:
            io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue.spElement(r0, r3, r5)
            r5 = 1
            long r1 = r1 + r5
            r7.soConsumerIndex(r1)
            return r4
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue, java.util.AbstractCollection
    public /* bridge */ /* synthetic */ java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            return r0
    }

    @java.lang.Deprecated
    public int weakOffer(E r1) {
            r0 = this;
            int r1 = r0.failFastOffer(r1)
            return r1
    }
}
