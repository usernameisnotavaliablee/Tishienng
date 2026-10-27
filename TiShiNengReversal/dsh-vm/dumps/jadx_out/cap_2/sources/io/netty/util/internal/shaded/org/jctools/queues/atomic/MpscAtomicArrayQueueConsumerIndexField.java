package io.netty.util.internal.shaded.org.jctools.queues.atomic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
abstract class MpscAtomicArrayQueueConsumerIndexField<E> extends io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL2Pad<E> {
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater<io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueConsumerIndexField> C_INDEX_UPDATER = null;
    protected volatile long consumerIndex;

    static {
            java.lang.Class<io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueConsumerIndexField> r0 = io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueConsumerIndexField.class
            java.lang.String r1 = "consumerIndex"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r0, r1)
            io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueConsumerIndexField.C_INDEX_UPDATER = r0
            return
    }

    public MpscAtomicArrayQueueConsumerIndexField(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    protected final long lpConsumerIndex() {
            r2 = this;
            long r0 = r2.consumerIndex
            return r0
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvConsumerIndex() {
            r2 = this;
            long r0 = r2.consumerIndex
            return r0
    }

    protected void soConsumerIndex(long r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater<io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueConsumerIndexField> r0 = io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueConsumerIndexField.C_INDEX_UPDATER
            r0.lazySet(r1, r2)
            return
    }
}
