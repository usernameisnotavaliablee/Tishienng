package io.netty.util.internal.shaded.org.jctools.queues;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
abstract class BaseMpscLinkedArrayQueueProducerFields<E> extends io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueuePad1<E> {
    private static final long P_INDEX_OFFSET = 0;
    protected long producerIndex;

    static {
            java.lang.Class<io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueueProducerFields> r0 = io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueueProducerFields.class
            java.lang.String r1 = "producerIndex"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> L11
            sun.misc.Unsafe r1 = io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess.UNSAFE     // Catch: java.lang.NoSuchFieldException -> L11
            long r0 = r1.objectFieldOffset(r0)     // Catch: java.lang.NoSuchFieldException -> L11
            io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueueProducerFields.P_INDEX_OFFSET = r0     // Catch: java.lang.NoSuchFieldException -> L11
            return
        L11:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    BaseMpscLinkedArrayQueueProducerFields() {
            r0 = this;
            r0.<init>()
            return
    }

    final boolean casProducerIndex(long r9, long r11) {
            r8 = this;
            sun.misc.Unsafe r0 = io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess.UNSAFE
            long r2 = io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueueProducerFields.P_INDEX_OFFSET
            r1 = r8
            r4 = r9
            r6 = r11
            boolean r9 = r0.compareAndSwapLong(r1, r2, r4, r6)
            return r9
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvProducerIndex() {
            r3 = this;
            sun.misc.Unsafe r0 = io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess.UNSAFE
            long r1 = io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueueProducerFields.P_INDEX_OFFSET
            long r0 = r0.getLongVolatile(r3, r1)
            return r0
    }

    final void soProducerIndex(long r7) {
            r6 = this;
            sun.misc.Unsafe r0 = io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess.UNSAFE
            long r2 = io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueueProducerFields.P_INDEX_OFFSET
            r1 = r6
            r4 = r7
            r0.putOrderedLong(r1, r2, r4)
            return
    }
}
