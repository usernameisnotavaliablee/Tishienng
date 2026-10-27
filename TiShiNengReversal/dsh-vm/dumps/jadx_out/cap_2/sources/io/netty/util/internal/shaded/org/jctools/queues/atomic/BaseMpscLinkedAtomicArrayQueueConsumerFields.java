package io.netty.util.internal.shaded.org.jctools.queues.atomic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
abstract class BaseMpscLinkedAtomicArrayQueueConsumerFields<E> extends io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueuePad2<E> {
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater<io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueConsumerFields> C_INDEX_UPDATER = null;
    protected java.util.concurrent.atomic.AtomicReferenceArray<E> consumerBuffer;
    protected volatile long consumerIndex;
    protected long consumerMask;

    static {
            java.lang.Class<io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueConsumerFields> r0 = io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueConsumerFields.class
            java.lang.String r1 = "consumerIndex"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r0, r1)
            io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueConsumerFields.C_INDEX_UPDATER = r0
            return
    }

    BaseMpscLinkedAtomicArrayQueueConsumerFields() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvConsumerIndex() {
            r2 = this;
            long r0 = r2.consumerIndex
            return r0
    }

    final void soConsumerIndex(long r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater<io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueConsumerFields> r0 = io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueConsumerFields.C_INDEX_UPDATER
            r0.lazySet(r1, r2)
            return
    }
}
