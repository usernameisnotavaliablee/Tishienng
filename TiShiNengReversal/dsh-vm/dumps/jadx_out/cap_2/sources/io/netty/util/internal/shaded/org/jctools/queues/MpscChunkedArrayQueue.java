package io.netty.util.internal.shaded.org.jctools.queues;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class MpscChunkedArrayQueue<E> extends io.netty.util.internal.shaded.org.jctools.queues.MpscChunkedArrayQueueColdProducerFields<E> {
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

    public MpscChunkedArrayQueue(int r3) {
            r2 = this;
            int r0 = r3 / 8
            int r0 = io.netty.util.internal.shaded.org.jctools.util.Pow2.roundToPowerOfTwo(r0)
            r1 = 1024(0x400, float:1.435E-42)
            int r0 = java.lang.Math.min(r1, r0)
            r1 = 2
            int r0 = java.lang.Math.max(r1, r0)
            r2.<init>(r0, r3)
            return
    }

    public MpscChunkedArrayQueue(int r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueue
    protected long availableInQueue(long r3, long r5) {
            r2 = this;
            long r0 = r2.maxQueueCapacity
            long r3 = r3 - r5
            long r0 = r0 - r3
            return r0
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int capacity() {
            r4 = this;
            long r0 = r4.maxQueueCapacity
            r2 = 2
            long r0 = r0 / r2
            int r1 = (int) r0
            return r1
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueue
    protected long getCurrentBufferCapacity(long r1) {
            r0 = this;
            return r1
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueue
    protected int getNextBufferSize(E[] r1) {
            r0 = this;
            int r1 = io.netty.util.internal.shaded.org.jctools.queues.LinkedArrayQueueUtil.length(r1)
            return r1
    }
}
