package io.netty.util.internal.shaded.org.jctools.queues;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
abstract class MpscArrayQueueProducerLimitField<E> extends io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueMidPad<E> {
    private static final long P_LIMIT_OFFSET = 0;
    private volatile long producerLimit;

    static {
            sun.misc.Unsafe r0 = io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess.UNSAFE     // Catch: java.lang.NoSuchFieldException -> L11
            java.lang.Class<io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerLimitField> r1 = io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerLimitField.class
            java.lang.String r2 = "producerLimit"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L11
            long r0 = r0.objectFieldOffset(r1)     // Catch: java.lang.NoSuchFieldException -> L11
            io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerLimitField.P_LIMIT_OFFSET = r0     // Catch: java.lang.NoSuchFieldException -> L11
            return
        L11:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public MpscArrayQueueProducerLimitField(int r3) {
            r2 = this;
            r2.<init>(r3)
            long r0 = (long) r3
            r2.producerLimit = r0
            return
    }

    protected final long lvProducerLimit() {
            r2 = this;
            long r0 = r2.producerLimit
            return r0
    }

    protected final void soProducerLimit(long r7) {
            r6 = this;
            sun.misc.Unsafe r0 = io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess.UNSAFE
            long r2 = io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerLimitField.P_LIMIT_OFFSET
            r1 = r6
            r4 = r7
            r0.putOrderedLong(r1, r2, r4)
            return
    }
}
