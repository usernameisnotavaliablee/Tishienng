package io.netty.util.internal.shaded.org.jctools.queues.atomic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
abstract class BaseMpscLinkedAtomicArrayQueueColdProducerFields<E> extends io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueuePad3<E> {
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater<io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueColdProducerFields> P_LIMIT_UPDATER = null;
    protected java.util.concurrent.atomic.AtomicReferenceArray<E> producerBuffer;
    protected volatile long producerLimit;
    protected long producerMask;

    static {
            java.lang.Class<io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueColdProducerFields> r0 = io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueColdProducerFields.class
            java.lang.String r1 = "producerLimit"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r0, r1)
            io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueColdProducerFields.P_LIMIT_UPDATER = r0
            return
    }

    BaseMpscLinkedAtomicArrayQueueColdProducerFields() {
            r0 = this;
            r0.<init>()
            return
    }

    final boolean casProducerLimit(long r7, long r9) {
            r6 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater<io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueColdProducerFields> r0 = io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueColdProducerFields.P_LIMIT_UPDATER
            r1 = r6
            r2 = r7
            r4 = r9
            boolean r7 = r0.compareAndSet(r1, r2, r4)
            return r7
    }

    final long lvProducerLimit() {
            r2 = this;
            long r0 = r2.producerLimit
            return r0
    }

    final void soProducerLimit(long r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater<io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueColdProducerFields> r0 = io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueColdProducerFields.P_LIMIT_UPDATER
            r0.lazySet(r1, r2)
            return
    }
}
