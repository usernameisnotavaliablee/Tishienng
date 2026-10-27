package io.netty.util.internal.shaded.org.jctools.queues;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class MpscArrayQueue<E> extends io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL3Pad<E> {
    public MpscArrayQueue(int r1) {
            r0 = this;
            r0.<init>(r1)
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
    public int drain(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Consumer<E> r13, int r14) {
            r12 = this;
            E[] r0 = r12.buffer
            long r1 = r12.mask
            long r3 = r12.lpConsumerIndex()
            r5 = 0
        L9:
            if (r5 >= r14) goto L28
            long r6 = (long) r5
            long r6 = r6 + r3
            long r8 = io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue.calcElementOffset(r6, r1)
            java.lang.Object r10 = io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.lvElement(r0, r8)
            if (r10 != 0) goto L18
            return r5
        L18:
            r11 = 0
            io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.spElement(r0, r8, r11)
            r8 = 1
            long r6 = r6 + r8
            r12.soConsumerIndex(r6)
            r13.accept(r10)
            int r5 = r5 + 1
            goto L9
        L28:
            return r14
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public void drain(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Consumer<E> r15, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.WaitStrategy r16, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.ExitCondition r17) {
            r14 = this;
            E[] r0 = r14.buffer
            long r1 = r14.mask
            long r3 = r14.lpConsumerIndex()
            r5 = 0
            r6 = 0
        La:
            boolean r7 = r17.keepRunning()
            if (r7 == 0) goto L3c
            r7 = 0
        L11:
            r8 = 4096(0x1000, float:5.74E-42)
            if (r7 >= r8) goto L39
            long r8 = io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue.calcElementOffset(r3, r1)
            java.lang.Object r10 = io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.lvElement(r0, r8)
            if (r10 != 0) goto L26
            r11 = r16
            int r6 = r11.idle(r6)
            goto L36
        L26:
            r11 = r16
            r12 = 1
            long r3 = r3 + r12
            r6 = 0
            io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.spElement(r0, r8, r6)
            r14.soConsumerIndex(r3)
            r15.accept(r10)
            r6 = 0
        L36:
            int r7 = r7 + 1
            goto L11
        L39:
            r11 = r16
            goto La
        L3c:
            return
    }

    public final int failFastOffer(E r12) {
            r11 = this;
            if (r12 == 0) goto L36
            long r0 = r11.mask
            r2 = 1
            long r4 = r0 + r2
            long r6 = r11.lvProducerIndex()
            long r8 = r11.lvProducerLimit()
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L22
            long r8 = r11.lvConsumerIndex()
            long r8 = r8 + r4
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 < 0) goto L1f
            r12 = 1
            return r12
        L1f:
            r11.soProducerLimit(r8)
        L22:
            long r2 = r2 + r6
            boolean r2 = r11.casProducerIndex(r6, r2)
            if (r2 != 0) goto L2b
            r12 = -1
            return r12
        L2b:
            long r0 = io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue.calcElementOffset(r6, r0)
            E[] r2 = r11.buffer
            io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.soElement(r2, r0, r12)
            r12 = 0
            return r12
        L36:
            r12 = 0
            throw r12
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
    public int fill(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Supplier<E> r15, int r16) {
            r14 = this;
            long r0 = r14.mask
            r2 = 1
            long r2 = r2 + r0
            long r4 = r14.lvProducerLimit()
        L9:
            long r6 = r14.lvProducerIndex()
            long r8 = r4 - r6
            r10 = 0
            r11 = 0
            int r13 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r13 > 0) goto L25
            long r4 = r14.lvConsumerIndex()
            long r4 = r4 + r2
            long r8 = r4 - r6
            int r13 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r13 > 0) goto L22
            return r10
        L22:
            r14.soProducerLimit(r4)
        L25:
            int r9 = (int) r8
            r8 = r16
            int r9 = java.lang.Math.min(r9, r8)
            long r11 = (long) r9
            long r11 = r11 + r6
            boolean r11 = r14.casProducerIndex(r6, r11)
            if (r11 == 0) goto L9
            E[] r2 = r14.buffer
        L36:
            if (r10 >= r9) goto L48
            long r3 = (long) r10
            long r3 = r3 + r6
            long r3 = io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue.calcElementOffset(r3, r0)
            java.lang.Object r5 = r15.get()
            io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.soElement(r2, r3, r5)
            int r10 = r10 + 1
            goto L36
        L48:
            return r9
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

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public boolean offer(E r10) {
            r9 = this;
            if (r10 == 0) goto L33
            long r0 = r9.mask
            long r2 = r9.lvProducerLimit()
        L8:
            long r4 = r9.lvProducerIndex()
            r6 = 1
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 < 0) goto L21
            long r2 = r9.lvConsumerIndex()
            long r2 = r2 + r0
            long r2 = r2 + r6
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 < 0) goto L1e
            r10 = 0
            return r10
        L1e:
            r9.soProducerLimit(r2)
        L21:
            long r6 = r6 + r4
            boolean r6 = r9.casProducerIndex(r4, r6)
            if (r6 == 0) goto L8
            long r0 = io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue.calcElementOffset(r4, r0)
            E[] r2 = r9.buffer
            io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.soElement(r2, r0, r10)
            r10 = 1
            return r10
        L33:
            r10 = 0
            throw r10
    }

    public boolean offerIfBelowThreshold(E r19, int r20) {
            r18 = this;
            r0 = r18
            r1 = r19
            if (r1 == 0) goto L45
            long r2 = r0.mask
            r4 = 1
            long r6 = r2 + r4
            long r8 = r0.lvProducerLimit()
        L10:
            long r10 = r0.lvProducerIndex()
            long r12 = r8 - r10
            long r12 = r6 - r12
            r14 = r20
            r15 = r4
            long r4 = (long) r14
            int r17 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r17 < 0) goto L30
            long r8 = r0.lvConsumerIndex()
            long r12 = r10 - r8
            int r17 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r17 < 0) goto L2c
            r1 = 0
            return r1
        L2c:
            long r8 = r8 + r6
            r0.soProducerLimit(r8)
        L30:
            long r4 = r10 + r15
            boolean r4 = r0.casProducerIndex(r10, r4)
            if (r4 == 0) goto L43
            long r2 = io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue.calcElementOffset(r10, r2)
            E[] r4 = r0.buffer
            io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.soElement(r4, r2, r1)
            r1 = 1
            return r1
        L43:
            r4 = r15
            goto L10
        L45:
            r1 = 0
            throw r1
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E peek() {
            r8 = this;
            E[] r0 = r8.buffer
            long r1 = r8.lpConsumerIndex()
            long r3 = r8.calcElementOffset(r1)
            java.lang.Object r5 = io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.lvElement(r0, r3)
            if (r5 != 0) goto L21
            long r5 = r8.lvProducerIndex()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L1f
        L18:
            java.lang.Object r1 = io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.lvElement(r0, r3)
            if (r1 == 0) goto L18
            return r1
        L1f:
            r0 = 0
            return r0
        L21:
            return r5
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E poll() {
            r9 = this;
            long r0 = r9.lpConsumerIndex()
            long r2 = r9.calcElementOffset(r0)
            E[] r4 = r9.buffer
            java.lang.Object r5 = io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.lvElement(r4, r2)
            r6 = 0
            if (r5 != 0) goto L21
            long r7 = r9.lvProducerIndex()
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 == 0) goto L20
        L19:
            java.lang.Object r5 = io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.lvElement(r4, r2)
            if (r5 == 0) goto L19
            goto L21
        L20:
            return r6
        L21:
            io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.spElement(r4, r2, r6)
            r2 = 1
            long r0 = r0 + r2
            r9.soConsumerIndex(r0)
            return r5
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public boolean relaxedOffer(E r1) {
            r0 = this;
            boolean r1 = r0.offer(r1)
            return r1
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E relaxedPeek() {
            r5 = this;
            E[] r0 = r5.buffer
            long r1 = r5.mask
            long r3 = r5.lpConsumerIndex()
            long r1 = io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue.calcElementOffset(r3, r1)
            java.lang.Object r0 = io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.lvElement(r0, r1)
            return r0
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E relaxedPoll() {
            r7 = this;
            E[] r0 = r7.buffer
            long r1 = r7.lpConsumerIndex()
            long r3 = r7.calcElementOffset(r1)
            java.lang.Object r5 = io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.lvElement(r0, r3)
            r6 = 0
            if (r5 != 0) goto L12
            return r6
        L12:
            io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.spElement(r0, r3, r6)
            r3 = 1
            long r1 = r1 + r3
            r7.soConsumerIndex(r1)
            return r5
    }
}
