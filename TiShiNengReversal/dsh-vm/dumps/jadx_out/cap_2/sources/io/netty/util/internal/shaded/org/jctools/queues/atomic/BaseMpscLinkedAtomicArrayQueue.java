package io.netty.util.internal.shaded.org.jctools.queues.atomic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class BaseMpscLinkedAtomicArrayQueue<E> extends io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueColdProducerFields<E> implements io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue<E>, io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators {
    private static final java.lang.Object JUMP = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue.JUMP = r0
            return
    }

    public BaseMpscLinkedAtomicArrayQueue(int r3) {
            r2 = this;
            r2.<init>()
            r0 = 2
            java.lang.String r1 = "initialCapacity"
            io.netty.util.internal.shaded.org.jctools.util.RangeUtil.checkGreaterThanOrEqual(r3, r0, r1)
            int r3 = io.netty.util.internal.shaded.org.jctools.util.Pow2.roundToPowerOfTwo(r3)
            int r0 = r3 + (-1)
            int r0 = r0 << 1
            long r0 = (long) r0
            int r3 = r3 + 1
            java.util.concurrent.atomic.AtomicReferenceArray r3 = io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.allocate(r3)
            r2.producerBuffer = r3
            r2.producerMask = r0
            r2.consumerBuffer = r3
            r2.consumerMask = r0
            r2.soProducerLimit(r0)
            return
    }

    private java.util.concurrent.atomic.AtomicReferenceArray<E> getNextBuffer(java.util.concurrent.atomic.AtomicReferenceArray<E> r2, long r3) {
            r1 = this;
            int r3 = r1.nextArrayOffset(r3)
            java.lang.Object r4 = io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.lvElement(r2, r3)
            java.util.concurrent.atomic.AtomicReferenceArray r4 = (java.util.concurrent.atomic.AtomicReferenceArray) r4
            r0 = 0
            io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.soElement(r2, r3, r0)
            return r4
    }

    private int newBufferAndOffset(java.util.concurrent.atomic.AtomicReferenceArray<E> r3, long r4) {
            r2 = this;
            r2.consumerBuffer = r3
            int r3 = io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.length(r3)
            int r3 = r3 + (-2)
            int r3 = r3 << 1
            long r0 = (long) r3
            r2.consumerMask = r0
            int r3 = io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.modifiedCalcElementOffset(r4, r0)
            return r3
    }

    private E newBufferPeek(java.util.concurrent.atomic.AtomicReferenceArray<E> r1, long r2) {
            r0 = this;
            int r2 = r0.newBufferAndOffset(r1, r2)
            java.lang.Object r1 = io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.lvElement(r1, r2)
            if (r1 == 0) goto Lb
            return r1
        Lb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "new buffer must have at least one element"
            r1.<init>(r2)
            throw r1
    }

    private E newBufferPoll(java.util.concurrent.atomic.AtomicReferenceArray<E> r5, long r6) {
            r4 = this;
            int r0 = r4.newBufferAndOffset(r5, r6)
            java.lang.Object r1 = io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.lvElement(r5, r0)
            if (r1 == 0) goto L15
            r2 = 0
            io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.soElement(r5, r0, r2)
            r2 = 2
            long r6 = r6 + r2
            r4.soConsumerIndex(r6)
            return r1
        L15:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "new buffer must have at least one element"
            r5.<init>(r6)
            throw r5
    }

    private int nextArrayOffset(long r3) {
            r2 = this;
            r0 = 2
            long r3 = r3 + r0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r3 = io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.modifiedCalcElementOffset(r3, r0)
            return r3
    }

    private int offerSlowPath(long r5, long r7, long r9) {
            r4 = this;
            long r0 = r4.lvConsumerIndex()
            long r5 = r4.getCurrentBufferCapacity(r5)
            long r5 = r5 + r0
            r2 = 1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L17
            boolean r5 = r4.casProducerLimit(r9, r5)
            if (r5 != 0) goto L15
            return r2
        L15:
            r5 = 0
            return r5
        L17:
            long r5 = r4.availableInQueue(r7, r0)
            r9 = 0
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 > 0) goto L23
            r5 = 2
            return r5
        L23:
            r5 = 1
            long r5 = r5 + r7
            boolean r5 = r4.casProducerIndex(r7, r5)
            if (r5 == 0) goto L2e
            r5 = 3
            return r5
        L2e:
            return r2
    }

    private void resize(long r6, java.util.concurrent.atomic.AtomicReferenceArray<E> r8, long r9, E r11) {
            r5 = this;
            int r0 = r5.getNextBufferSize(r8)
            java.util.concurrent.atomic.AtomicReferenceArray r1 = io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.allocate(r0)
            r5.producerBuffer = r1
            int r0 = r0 + (-2)
            int r0 = r0 << 1
            long r2 = (long) r0
            r5.producerMask = r2
            int r0 = io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.modifiedCalcElementOffset(r9, r6)
            int r4 = io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.modifiedCalcElementOffset(r9, r2)
            io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.soElement(r1, r4, r11)
            int r6 = r5.nextArrayOffset(r6)
            io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.soElement(r8, r6, r1)
            long r6 = r5.lvConsumerIndex()
            long r6 = r5.availableInQueue(r9, r6)
            java.lang.String r11 = "availableInQueue"
            io.netty.util.internal.shaded.org.jctools.util.RangeUtil.checkPositive(r6, r11)
            long r6 = java.lang.Math.min(r2, r6)
            long r6 = r6 + r9
            r5.soProducerLimit(r6)
            r6 = 2
            long r9 = r9 + r6
            r5.soProducerIndex(r9)
            java.lang.Object r6 = io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue.JUMP
            io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.soElement(r8, r0, r6)
            return
    }

    protected abstract long availableInQueue(long r1, long r3);

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public abstract int capacity();

    @Override // io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators
    public long currentConsumerIndex() {
            r4 = this;
            long r0 = r4.lvConsumerIndex()
            r2 = 2
            long r0 = r0 / r2
            return r0
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators
    public long currentProducerIndex() {
            r4 = this;
            long r0 = r4.lvProducerIndex()
            r2 = 2
            long r0 = r0 / r2
            return r0
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int drain(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Consumer<E> r2) {
            r1 = this;
            int r0 = r1.capacity()
            int r2 = r1.drain(r2, r0)
            return r2
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int drain(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Consumer<E> r3, int r4) {
            r2 = this;
            r0 = 0
        L1:
            if (r0 >= r4) goto Lf
            java.lang.Object r1 = r2.relaxedPoll()
            if (r1 == 0) goto Lf
            r3.accept(r1)
            int r0 = r0 + 1
            goto L1
        Lf:
            return r0
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public void drain(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Consumer<E> r4, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.WaitStrategy r5, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.ExitCondition r6) {
            r3 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            boolean r2 = r6.keepRunning()
            if (r2 == 0) goto L17
            java.lang.Object r2 = r3.relaxedPoll()
            if (r2 != 0) goto L13
            int r1 = r5.idle(r1)
            goto L2
        L13:
            r4.accept(r2)
            goto L1
        L17:
            return
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
        L0:
            long r5 = r13.lvProducerLimit()
            long r3 = r13.lvProducerIndex()
            r1 = 1
            long r7 = r3 & r1
            int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r9 != 0) goto L11
            goto L0
        L11:
            long r1 = r13.producerMask
            java.util.concurrent.atomic.AtomicReferenceArray<E> r7 = r13.producerBuffer
            r8 = 2
            int r9 = r15 * 2
            long r9 = (long) r9
            long r9 = r9 + r3
            long r9 = java.lang.Math.min(r5, r9)
            r11 = 0
            int r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r12 == 0) goto L27
            int r12 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r12 >= 0) goto L34
        L27:
            r0 = r13
            int r5 = r0.offerSlowPath(r1, r3, r5)
            r12 = 1
            if (r5 == r12) goto L0
            if (r5 == r8) goto L5f
            r6 = 3
            if (r5 == r6) goto L54
        L34:
            boolean r5 = r13.casProducerIndex(r3, r9)
            if (r5 == 0) goto L0
            long r9 = r9 - r3
            r5 = 2
            long r9 = r9 / r5
            int r5 = (int) r9
        L3f:
            if (r11 >= r5) goto L53
            int r6 = r11 * 2
            long r8 = (long) r6
            long r8 = r8 + r3
            int r6 = io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.modifiedCalcElementOffset(r8, r1)
            java.lang.Object r8 = r14.get()
            io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.soElement(r7, r6, r8)
            int r11 = r11 + 1
            goto L3f
        L53:
            return r5
        L54:
            java.lang.Object r6 = r14.get()
            r0 = r13
            r4 = r3
            r3 = r7
            r0.resize(r1, r3, r4, r6)
            return r12
        L5f:
            return r11
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public void fill(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Supplier<E> r3, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.WaitStrategy r4, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.ExitCondition r5) {
            r2 = this;
        L0:
            boolean r0 = r5.keepRunning()
            if (r0 == 0) goto L29
        L6:
            int r0 = io.netty.util.internal.shaded.org.jctools.util.PortableJvmInfo.RECOMENDED_OFFER_BATCH
            int r0 = r2.fill(r3, r0)
            if (r0 == 0) goto L15
            boolean r0 = r5.keepRunning()
            if (r0 == 0) goto L15
            goto L6
        L15:
            r0 = 0
        L16:
            boolean r1 = r5.keepRunning()
            if (r1 == 0) goto L0
            int r1 = io.netty.util.internal.shaded.org.jctools.util.PortableJvmInfo.RECOMENDED_OFFER_BATCH
            int r1 = r2.fill(r3, r1)
            if (r1 != 0) goto L0
            int r0 = r4.idle(r0)
            goto L16
        L29:
            return
    }

    protected abstract long getCurrentBufferCapacity(long r1);

    protected abstract int getNextBufferSize(java.util.concurrent.atomic.AtomicReferenceArray<E> r1);

    @Override // java.util.AbstractCollection, java.util.Collection, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public final boolean isEmpty() {
            r5 = this;
            long r0 = r5.lvConsumerIndex()
            long r2 = r5.lvProducerIndex()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            r0 = 1
            return r0
        Le:
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

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public boolean offer(E r12) {
            r11 = this;
            if (r12 == 0) goto L46
        L2:
            long r5 = r11.lvProducerLimit()
            long r3 = r11.lvProducerIndex()
            r1 = 1
            long r7 = r3 & r1
            int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r9 != 0) goto L13
            goto L2
        L13:
            long r1 = r11.producerMask
            java.util.concurrent.atomic.AtomicReferenceArray<E> r7 = r11.producerBuffer
            r8 = 1
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 > 0) goto L29
            r0 = r11
            int r5 = r0.offerSlowPath(r1, r3, r5)
            if (r5 == r8) goto L2
            r0 = 2
            if (r5 == r0) goto L33
            r0 = 3
            if (r5 == r0) goto L2b
        L29:
            r5 = r7
            goto L35
        L2b:
            r0 = r11
            r6 = r12
            r4 = r3
            r3 = r7
            r0.resize(r1, r3, r4, r6)
            return r8
        L33:
            r1 = 0
            return r1
        L35:
            r9 = 2
            long r9 = r9 + r3
            boolean r7 = r11.casProducerIndex(r3, r9)
            if (r7 == 0) goto L2
            int r1 = io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.modifiedCalcElementOffset(r3, r1)
            io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.soElement(r5, r1, r12)
            return r8
        L46:
            r1 = 0
            throw r1
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E peek() {
            r10 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<E> r0 = r10.consumerBuffer
            long r1 = r10.consumerIndex
            long r3 = r10.consumerMask
            int r5 = io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.modifiedCalcElementOffset(r1, r3)
            java.lang.Object r6 = io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.lvElement(r0, r5)
            if (r6 != 0) goto L1f
            long r7 = r10.lvProducerIndex()
            int r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r9 == 0) goto L1f
        L18:
            java.lang.Object r6 = io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.lvElement(r0, r5)
            if (r6 != 0) goto L1f
            goto L18
        L1f:
            java.lang.Object r5 = io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue.JUMP
            if (r6 != r5) goto L2c
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r10.getNextBuffer(r0, r3)
            java.lang.Object r0 = r10.newBufferPeek(r0, r1)
            return r0
        L2c:
            return r6
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E poll() {
            r10 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<E> r0 = r10.consumerBuffer
            long r1 = r10.consumerIndex
            long r3 = r10.consumerMask
            int r5 = io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.modifiedCalcElementOffset(r1, r3)
            java.lang.Object r6 = io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.lvElement(r0, r5)
            r7 = 0
            if (r6 != 0) goto L21
            long r8 = r10.lvProducerIndex()
            int r6 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r6 == 0) goto L20
        L19:
            java.lang.Object r6 = io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.lvElement(r0, r5)
            if (r6 == 0) goto L19
            goto L21
        L20:
            return r7
        L21:
            java.lang.Object r8 = io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue.JUMP
            if (r6 != r8) goto L2e
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r10.getNextBuffer(r0, r3)
            java.lang.Object r0 = r10.newBufferPoll(r0, r1)
            return r0
        L2e:
            io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.soElement(r0, r5, r7)
            r3 = 2
            long r1 = r1 + r3
            r10.soConsumerIndex(r1)
            return r6
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public boolean relaxedOffer(E r1) {
            r0 = this;
            boolean r1 = r0.offer(r1)
            return r1
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E relaxedPeek() {
            r7 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<E> r0 = r7.consumerBuffer
            long r1 = r7.consumerIndex
            long r3 = r7.consumerMask
            int r5 = io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.modifiedCalcElementOffset(r1, r3)
            java.lang.Object r5 = io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.lvElement(r0, r5)
            java.lang.Object r6 = io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue.JUMP
            if (r5 != r6) goto L1b
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r7.getNextBuffer(r0, r3)
            java.lang.Object r0 = r7.newBufferPeek(r0, r1)
            return r0
        L1b:
            return r5
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E relaxedPoll() {
            r9 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<E> r0 = r9.consumerBuffer
            long r1 = r9.consumerIndex
            long r3 = r9.consumerMask
            int r5 = io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.modifiedCalcElementOffset(r1, r3)
            java.lang.Object r6 = io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.lvElement(r0, r5)
            r7 = 0
            if (r6 != 0) goto L12
            return r7
        L12:
            java.lang.Object r8 = io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue.JUMP
            if (r6 != r8) goto L1f
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r9.getNextBuffer(r0, r3)
            java.lang.Object r0 = r9.newBufferPoll(r0, r1)
            return r0
        L1f:
            io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.soElement(r0, r5, r7)
            r3 = 2
            long r1 = r1 + r3
            r9.soConsumerIndex(r1)
            return r6
    }

    @Override // java.util.AbstractCollection, java.util.Collection, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public final int size() {
            r7 = this;
            long r0 = r7.lvConsumerIndex()
        L4:
            long r2 = r7.lvProducerIndex()
            long r4 = r7.lvConsumerIndex()
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L21
            long r2 = r2 - r4
            r0 = 1
            long r0 = r2 >> r0
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1f
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
        L1f:
            int r1 = (int) r0
            return r1
        L21:
            r0 = r4
            goto L4
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getName()
            return r0
    }
}
