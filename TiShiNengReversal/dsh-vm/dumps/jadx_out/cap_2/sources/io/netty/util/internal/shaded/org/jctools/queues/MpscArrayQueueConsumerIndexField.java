package io.netty.util.internal.shaded.org.jctools.queues;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
abstract class MpscArrayQueueConsumerIndexField<E> extends io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL2Pad<E> {
    private static final long C_INDEX_OFFSET = 0;
    protected long consumerIndex;

    static {
            sun.misc.Unsafe r0 = io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess.UNSAFE     // Catch: java.lang.NoSuchFieldException -> L11
            java.lang.Class<io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueConsumerIndexField> r1 = io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueConsumerIndexField.class
            java.lang.String r2 = "consumerIndex"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L11
            long r0 = r0.objectFieldOffset(r1)     // Catch: java.lang.NoSuchFieldException -> L11
            io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueConsumerIndexField.C_INDEX_OFFSET = r0     // Catch: java.lang.NoSuchFieldException -> L11
            return
        L11:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public MpscArrayQueueConsumerIndexField(int r1) {
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
            r3 = this;
            sun.misc.Unsafe r0 = io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess.UNSAFE
            long r1 = io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueConsumerIndexField.C_INDEX_OFFSET
            long r0 = r0.getLongVolatile(r3, r1)
            return r0
    }

    protected void soConsumerIndex(long r7) {
            r6 = this;
            sun.misc.Unsafe r0 = io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess.UNSAFE
            long r2 = io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueConsumerIndexField.C_INDEX_OFFSET
            r1 = r6
            r4 = r7
            r0.putOrderedLong(r1, r2, r4)
            return
    }
}
