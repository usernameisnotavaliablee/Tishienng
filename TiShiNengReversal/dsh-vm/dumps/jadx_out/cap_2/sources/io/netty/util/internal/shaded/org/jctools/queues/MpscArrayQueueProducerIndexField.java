package io.netty.util.internal.shaded.org.jctools.queues;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
abstract class MpscArrayQueueProducerIndexField<E> extends io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL1Pad<E> {
    private static final long P_INDEX_OFFSET = 0;
    private volatile long producerIndex;

    static {
            sun.misc.Unsafe r0 = io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess.UNSAFE     // Catch: java.lang.NoSuchFieldException -> L11
            java.lang.Class<io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerIndexField> r1 = io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerIndexField.class
            java.lang.String r2 = "producerIndex"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L11
            long r0 = r0.objectFieldOffset(r1)     // Catch: java.lang.NoSuchFieldException -> L11
            io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerIndexField.P_INDEX_OFFSET = r0     // Catch: java.lang.NoSuchFieldException -> L11
            return
        L11:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public MpscArrayQueueProducerIndexField(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    protected final boolean casProducerIndex(long r9, long r11) {
            r8 = this;
            sun.misc.Unsafe r0 = io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess.UNSAFE
            long r2 = io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerIndexField.P_INDEX_OFFSET
            r1 = r8
            r4 = r9
            r6 = r11
            boolean r9 = r0.compareAndSwapLong(r1, r2, r4, r6)
            return r9
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvProducerIndex() {
            r2 = this;
            long r0 = r2.producerIndex
            return r0
    }
}
