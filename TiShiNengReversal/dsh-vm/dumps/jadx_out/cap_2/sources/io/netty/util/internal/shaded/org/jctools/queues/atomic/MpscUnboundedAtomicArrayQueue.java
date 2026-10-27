package io.netty.util.internal.shaded.org.jctools.queues.atomic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class MpscUnboundedAtomicArrayQueue<E> extends io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue<E> {
    long p0;
    long p1;
    long p10;
    long p11;
    long p12;
    long p13;
    long p14;
    long p15;
    long p16;
    long p17;
    long p2;
    long p3;
    long p4;
    long p5;
    long p6;
    long p7;

    public MpscUnboundedAtomicArrayQueue(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue
    protected long availableInQueue(long r1, long r3) {
            r0 = this;
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            return r1
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int capacity() {
            r1 = this;
            r0 = -1
            return r0
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int drain(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Consumer<E> r2) {
            r1 = this;
            r0 = 4096(0x1000, float:5.74E-42)
            int r2 = r1.drain(r2, r0)
            return r2
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int fill(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Supplier<E> r6) {
            r5 = this;
            r0 = 0
        L2:
            int r2 = io.netty.util.internal.shaded.org.jctools.util.PortableJvmInfo.RECOMENDED_OFFER_BATCH
            int r2 = r5.fill(r6, r2)
            if (r2 != 0) goto Lc
            int r6 = (int) r0
            return r6
        Lc:
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = 4096(0x1000, double:2.0237E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L2
            int r6 = (int) r0
            return r6
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue
    protected long getCurrentBufferCapacity(long r1) {
            r0 = this;
            return r1
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue
    protected int getNextBufferSize(java.util.concurrent.atomic.AtomicReferenceArray<E> r1) {
            r0 = this;
            int r1 = io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.length(r1)
            return r1
    }
}
