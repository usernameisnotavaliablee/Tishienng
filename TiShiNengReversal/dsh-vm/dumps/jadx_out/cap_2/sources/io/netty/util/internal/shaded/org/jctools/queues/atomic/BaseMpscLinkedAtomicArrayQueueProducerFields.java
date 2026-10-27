package io.netty.util.internal.shaded.org.jctools.queues.atomic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
abstract class BaseMpscLinkedAtomicArrayQueueProducerFields<E> extends io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueuePad1<E> {
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater<io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueProducerFields> P_INDEX_UPDATER = null;
    protected volatile long producerIndex;

    static {
            java.lang.Class<io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueProducerFields> r0 = io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueProducerFields.class
            java.lang.String r1 = "producerIndex"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r0, r1)
            io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueProducerFields.P_INDEX_UPDATER = r0
            return
    }

    BaseMpscLinkedAtomicArrayQueueProducerFields() {
            r0 = this;
            r0.<init>()
            return
    }

    final boolean casProducerIndex(long r7, long r9) {
            r6 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater<io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueProducerFields> r0 = io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueProducerFields.P_INDEX_UPDATER
            r1 = r6
            r2 = r7
            r4 = r9
            boolean r7 = r0.compareAndSet(r1, r2, r4)
            return r7
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvProducerIndex() {
            r2 = this;
            long r0 = r2.producerIndex
            return r0
    }

    final void soProducerIndex(long r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater<io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueProducerFields> r0 = io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueProducerFields.P_INDEX_UPDATER
            r0.lazySet(r1, r2)
            return
    }
}
