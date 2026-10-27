package io.netty.util.internal.shaded.org.jctools.queues;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class IndexedQueueSizeUtil {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface IndexedQueue {
        long lvConsumerIndex();

        long lvProducerIndex();
    }

    public IndexedQueueSizeUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isEmpty(io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue r4) {
            long r0 = r4.lvConsumerIndex()
            long r2 = r4.lvProducerIndex()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            r4 = 1
            return r4
        Le:
            r4 = 0
            return r4
    }

    public static int size(io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue r7) {
            long r0 = r7.lvConsumerIndex()
        L4:
            long r2 = r7.lvProducerIndex()
            long r4 = r7.lvConsumerIndex()
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L1e
            long r2 = r2 - r4
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 <= 0) goto L1c
            r7 = 2147483647(0x7fffffff, float:NaN)
            return r7
        L1c:
            int r7 = (int) r2
            return r7
        L1e:
            r0 = r4
            goto L4
    }
}
