package io.netty.util.internal.shaded.org.jctools.queues.atomic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
abstract class MpscChunkedAtomicArrayQueueColdProducerFields<E> extends io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue<E> {
    protected final long maxQueueCapacity;

    public MpscChunkedAtomicArrayQueueColdProducerFields(int r3, int r4) {
            r2 = this;
            r2.<init>(r3)
            r0 = 4
            java.lang.String r1 = "maxCapacity"
            io.netty.util.internal.shaded.org.jctools.util.RangeUtil.checkGreaterThanOrEqual(r4, r0, r1)
            int r3 = io.netty.util.internal.shaded.org.jctools.util.Pow2.roundToPowerOfTwo(r3)
            int r0 = io.netty.util.internal.shaded.org.jctools.util.Pow2.roundToPowerOfTwo(r4)
            java.lang.String r1 = "initialCapacity"
            io.netty.util.internal.shaded.org.jctools.util.RangeUtil.checkLessThan(r3, r0, r1)
            int r3 = io.netty.util.internal.shaded.org.jctools.util.Pow2.roundToPowerOfTwo(r4)
            long r3 = (long) r3
            r0 = 1
            long r3 = r3 << r0
            r2.maxQueueCapacity = r3
            return
    }
}
