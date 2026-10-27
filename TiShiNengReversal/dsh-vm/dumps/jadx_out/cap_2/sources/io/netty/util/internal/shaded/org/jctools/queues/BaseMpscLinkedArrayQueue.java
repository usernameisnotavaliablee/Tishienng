package io.netty.util.internal.shaded.org.jctools.queues;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class BaseMpscLinkedArrayQueue<E> extends io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueueColdProducerFields<E> implements io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue<E>, io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators {
    private static final int CONTINUE_TO_P_INDEX_CAS = 0;
    private static final java.lang.Object JUMP = null;
    private static final int QUEUE_FULL = 2;
    private static final int QUEUE_RESIZE = 3;
    private static final int RETRY = 1;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueue.JUMP = r0
            return
    }

    public BaseMpscLinkedArrayQueue(int r3) {
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
            java.lang.Object[] r3 = io.netty.util.internal.shaded.org.jctools.queues.CircularArrayOffsetCalculator.allocate(r3)
            r2.producerBuffer = r3
            r2.producerMask = r0
            r2.consumerBuffer = r3
            r2.consumerMask = r0
            r2.soProducerLimit(r0)
            return
    }

    private E[] getNextBuffer(E[] r3, long r4) {
            r2 = this;
            long r4 = r2.nextArrayOffset(r4)
            java.lang.Object r0 = io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.lvElement(r3, r4)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = 0
            io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.soElement(r3, r4, r1)
            return r0
    }

    private long newBufferAndOffset(E[] r3, long r4) {
            r2 = this;
            r2.consumerBuffer = r3
            int r3 = io.netty.util.internal.shaded.org.jctools.queues.LinkedArrayQueueUtil.length(r3)
            int r3 = r3 + (-2)
            int r3 = r3 << 1
            long r0 = (long) r3
            r2.consumerMask = r0
            long r3 = io.netty.util.internal.shaded.org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcElementOffset(r4, r0)
            return r3
    }

    private E newBufferPeek(E[] r1, long r2) {
            r0 = this;
            long r2 = r0.newBufferAndOffset(r1, r2)
            java.lang.Object r1 = io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.lvElement(r1, r2)
            if (r1 == 0) goto Lb
            return r1
        Lb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "new buffer must have at least one element"
            r1.<init>(r2)
            throw r1
    }

    private E newBufferPoll(E[] r5, long r6) {
            r4 = this;
            long r0 = r4.newBufferAndOffset(r5, r6)
            java.lang.Object r2 = io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.lvElement(r5, r0)
            if (r2 == 0) goto L15
            r3 = 0
            io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.soElement(r5, r0, r3)
            r0 = 2
            long r6 = r6 + r0
            r4.soConsumerIndex(r6)
            return r2
        L15:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "new buffer must have at least one element"
            r5.<init>(r6)
            throw r5
    }

    private long nextArrayOffset(long r3) {
            r2 = this;
            r0 = 2
            long r3 = r3 + r0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r3 = io.netty.util.internal.shaded.org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcElementOffset(r3, r0)
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

    private void resize(long r9, E[] r11, long r12, E r14) {
            r8 = this;
            int r0 = r8.getNextBufferSize(r11)
            java.lang.Object[] r1 = io.netty.util.internal.shaded.org.jctools.queues.CircularArrayOffsetCalculator.allocate(r0)
            r8.producerBuffer = r1
            int r0 = r0 + (-2)
            int r0 = r0 << 1
            long r2 = (long) r0
            r8.producerMask = r2
            long r4 = io.netty.util.internal.shaded.org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcElementOffset(r12, r9)
            long r6 = io.netty.util.internal.shaded.org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcElementOffset(r12, r2)
            io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.soElement(r1, r6, r14)
            long r9 = r8.nextArrayOffset(r9)
            io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.soElement(r11, r9, r1)
            long r9 = r8.lvConsumerIndex()
            long r9 = r8.availableInQueue(r12, r9)
            java.lang.String r14 = "availableInQueue"
            io.netty.util.internal.shaded.org.jctools.util.RangeUtil.checkPositive(r9, r14)
            long r9 = java.lang.Math.min(r2, r9)
            long r9 = r9 + r12
            r8.soProducerLimit(r9)
            r9 = 2
            long r12 = r12 + r9
            r8.soProducerIndex(r12)
            java.lang.Object r9 = io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueue.JUMP
            io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.soElement(r11, r4, r9)
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
            E[] r7 = r13.producerBuffer
            r8 = 2
            int r9 = r15 * 2
            long r9 = (long) r9
            long r9 = r9 + r3
            long r9 = java.lang.Math.min(r5, r9)
            r11 = 0
            int r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r12 >= 0) goto L27
            int r12 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r12 >= 0) goto L36
        L27:
            r0 = r13
            int r5 = r0.offerSlowPath(r1, r3, r5)
            if (r5 == 0) goto L0
            r12 = 1
            if (r5 == r12) goto L0
            if (r5 == r8) goto L61
            r6 = 3
            if (r5 == r6) goto L56
        L36:
            boolean r5 = r13.casProducerIndex(r3, r9)
            if (r5 == 0) goto L0
            long r9 = r9 - r3
            r5 = 2
            long r9 = r9 / r5
            int r5 = (int) r9
        L41:
            if (r11 >= r5) goto L55
            int r6 = r11 * 2
            long r8 = (long) r6
            long r8 = r8 + r3
            long r8 = io.netty.util.internal.shaded.org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcElementOffset(r8, r1)
            java.lang.Object r6 = r14.get()
            io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.soElement(r7, r8, r6)
            int r11 = r11 + 1
            goto L41
        L55:
            return r5
        L56:
            java.lang.Object r6 = r14.get()
            r0 = r13
            r4 = r3
            r3 = r7
            r0.resize(r1, r3, r4, r6)
            return r12
        L61:
            return r11
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public void fill(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Supplier<E> r3, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.WaitStrategy r4, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.ExitCondition r5) {
            r2 = this;
        L0:
            boolean r0 = r5.keepRunning()
            if (r0 == 0) goto L22
            int r0 = io.netty.util.internal.shaded.org.jctools.util.PortableJvmInfo.RECOMENDED_OFFER_BATCH
            int r0 = r2.fill(r3, r0)
            if (r0 != 0) goto L0
            r0 = 0
        Lf:
            boolean r1 = r5.keepRunning()
            if (r1 == 0) goto L0
            int r1 = io.netty.util.internal.shaded.org.jctools.util.PortableJvmInfo.RECOMENDED_OFFER_BATCH
            int r1 = r2.fill(r3, r1)
            if (r1 != 0) goto L0
            int r0 = r4.idle(r0)
            goto Lf
        L22:
            return
    }

    protected abstract long getCurrentBufferCapacity(long r1);

    protected abstract int getNextBufferSize(E[] r1);

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
            E[] r7 = r11.producerBuffer
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
            long r1 = io.netty.util.internal.shaded.org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcElementOffset(r3, r1)
            io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.soElement(r5, r1, r12)
            return r8
        L46:
            r1 = 0
            throw r1
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E peek() {
            r11 = this;
            E[] r0 = r11.consumerBuffer
            long r1 = r11.consumerIndex
            long r3 = r11.consumerMask
            long r5 = io.netty.util.internal.shaded.org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcElementOffset(r1, r3)
            java.lang.Object r7 = io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.lvElement(r0, r5)
            if (r7 != 0) goto L1e
            long r8 = r11.lvProducerIndex()
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 == 0) goto L1e
        L18:
            java.lang.Object r7 = io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.lvElement(r0, r5)
            if (r7 == 0) goto L18
        L1e:
            java.lang.Object r5 = io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueue.JUMP
            if (r7 != r5) goto L2b
            java.lang.Object[] r0 = r11.getNextBuffer(r0, r3)
            java.lang.Object r0 = r11.newBufferPeek(r0, r1)
            return r0
        L2b:
            return r7
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E poll() {
            r11 = this;
            E[] r0 = r11.consumerBuffer
            long r1 = r11.consumerIndex
            long r3 = r11.consumerMask
            long r5 = io.netty.util.internal.shaded.org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcElementOffset(r1, r3)
            java.lang.Object r7 = io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.lvElement(r0, r5)
            r8 = 0
            if (r7 != 0) goto L21
            long r9 = r11.lvProducerIndex()
            int r7 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r7 == 0) goto L20
        L19:
            java.lang.Object r7 = io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.lvElement(r0, r5)
            if (r7 == 0) goto L19
            goto L21
        L20:
            return r8
        L21:
            java.lang.Object r9 = io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueue.JUMP
            if (r7 != r9) goto L2e
            java.lang.Object[] r0 = r11.getNextBuffer(r0, r3)
            java.lang.Object r0 = r11.newBufferPoll(r0, r1)
            return r0
        L2e:
            io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.soElement(r0, r5, r8)
            r3 = 2
            long r1 = r1 + r3
            r11.soConsumerIndex(r1)
            return r7
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
            E[] r0 = r7.consumerBuffer
            long r1 = r7.consumerIndex
            long r3 = r7.consumerMask
            long r5 = io.netty.util.internal.shaded.org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcElementOffset(r1, r3)
            java.lang.Object r5 = io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.lvElement(r0, r5)
            java.lang.Object r6 = io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueue.JUMP
            if (r5 != r6) goto L1b
            java.lang.Object[] r0 = r7.getNextBuffer(r0, r3)
            java.lang.Object r0 = r7.newBufferPeek(r0, r1)
            return r0
        L1b:
            return r5
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E relaxedPoll() {
            r10 = this;
            E[] r0 = r10.consumerBuffer
            long r1 = r10.consumerIndex
            long r3 = r10.consumerMask
            long r5 = io.netty.util.internal.shaded.org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcElementOffset(r1, r3)
            java.lang.Object r7 = io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.lvElement(r0, r5)
            r8 = 0
            if (r7 != 0) goto L12
            return r8
        L12:
            java.lang.Object r9 = io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueue.JUMP
            if (r7 != r9) goto L1f
            java.lang.Object[] r0 = r10.getNextBuffer(r0, r3)
            java.lang.Object r0 = r10.newBufferPoll(r0, r1)
            return r0
        L1f:
            io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.soElement(r0, r5, r8)
            r3 = 2
            long r1 = r1 + r3
            r10.soConsumerIndex(r1)
            return r7
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
