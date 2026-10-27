package io.netty.util.internal.shaded.org.jctools.queues.atomic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class MpscGrowableAtomicArrayQueue<E> extends io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscChunkedAtomicArrayQueue<E> {
    public MpscGrowableAtomicArrayQueue(int r3) {
            r2 = this;
            int r0 = r3 / 8
            int r0 = io.netty.util.internal.shaded.org.jctools.util.Pow2.roundToPowerOfTwo(r0)
            r1 = 2
            int r0 = java.lang.Math.max(r1, r0)
            r2.<init>(r0, r3)
            return
    }

    public MpscGrowableAtomicArrayQueue(int r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscChunkedAtomicArrayQueue, io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue
    protected long getCurrentBufferCapacity(long r6) {
            r5 = this;
            r0 = 2
            long r0 = r0 + r6
            long r2 = r5.maxQueueCapacity
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            return r2
        La:
            return r6
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscChunkedAtomicArrayQueue, io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue
    protected int getNextBufferSize(java.util.concurrent.atomic.AtomicReferenceArray<E> r5) {
            r4 = this;
            long r0 = r4.maxQueueCapacity
            r2 = 2
            long r0 = r0 / r2
            int r2 = io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.length(r5)
            java.lang.String r3 = "buffer.length"
            io.netty.util.internal.shaded.org.jctools.util.RangeUtil.checkLessThanOrEqual(r2, r0, r3)
            int r5 = io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedAtomicArrayQueueUtil.length(r5)
            int r5 = r5 + (-1)
            int r5 = r5 * 2
            int r5 = r5 + 1
            return r5
    }
}
