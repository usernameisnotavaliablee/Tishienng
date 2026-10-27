package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class SegmentPool {
    private static final int HASH_BUCKET_COUNT = 0;

    @org.jetbrains.annotations.NotNull
    public static final okio.SegmentPool INSTANCE = null;

    @org.jetbrains.annotations.NotNull
    private static final okio.Segment LOCK = null;
    private static final int MAX_SIZE = 0;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReference<okio.Segment>[] hashBuckets = null;

    static {
            okio.SegmentPool r0 = new okio.SegmentPool
            r0.<init>()
            okio.SegmentPool.INSTANCE = r0
            r0 = 65536(0x10000, float:9.1835E-41)
            okio.SegmentPool.MAX_SIZE = r0
            okio.Segment r1 = new okio.Segment
            r0 = 0
            byte[] r2 = new byte[r0]
            r5 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            okio.SegmentPool.LOCK = r1
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            int r1 = r1.availableProcessors()
            int r1 = r1 * 2
            int r1 = r1 + (-1)
            int r1 = java.lang.Integer.highestOneBit(r1)
            okio.SegmentPool.HASH_BUCKET_COUNT = r1
            java.util.concurrent.atomic.AtomicReference[] r2 = new java.util.concurrent.atomic.AtomicReference[r1]
        L2d:
            if (r0 >= r1) goto L39
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>()
            r2[r0] = r3
            int r0 = r0 + 1
            goto L2d
        L39:
            okio.SegmentPool.hashBuckets = r2
            return
    }

    private SegmentPool() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.util.concurrent.atomic.AtomicReference<okio.Segment> firstRef() {
            r6 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            int r2 = okio.SegmentPool.HASH_BUCKET_COUNT
            long r2 = (long) r2
            r4 = 1
            long r2 = r2 - r4
            long r0 = r0 & r2
            int r1 = (int) r0
            java.util.concurrent.atomic.AtomicReference<okio.Segment>[] r0 = okio.SegmentPool.hashBuckets
            r0 = r0[r1]
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final void recycle(@org.jetbrains.annotations.NotNull okio.Segment r5) {
            java.lang.String r0 = "segment"
            kotlin.jvm.internal.g0.p(r5, r0)
            okio.Segment r0 = r5.next
            if (r0 != 0) goto L3e
            okio.Segment r0 = r5.prev
            if (r0 != 0) goto L3e
            boolean r0 = r5.shared
            if (r0 == 0) goto L12
            goto L22
        L12:
            okio.SegmentPool r0 = okio.SegmentPool.INSTANCE
            java.util.concurrent.atomic.AtomicReference r0 = r0.firstRef()
            okio.Segment r1 = okio.SegmentPool.LOCK
            java.lang.Object r2 = r0.getAndSet(r1)
            okio.Segment r2 = (okio.Segment) r2
            if (r2 != r1) goto L23
        L22:
            return
        L23:
            r1 = 0
            if (r2 == 0) goto L29
            int r3 = r2.limit
            goto L2a
        L29:
            r3 = 0
        L2a:
            int r4 = okio.SegmentPool.MAX_SIZE
            if (r3 < r4) goto L32
            r0.set(r2)
            return
        L32:
            r5.next = r2
            r5.pos = r1
            int r3 = r3 + 8192
            r5.limit = r3
            r0.set(r5)
            return
        L3e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            r5.<init>(r0)
            throw r5
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.Segment take() {
            okio.SegmentPool r0 = okio.SegmentPool.INSTANCE
            java.util.concurrent.atomic.AtomicReference r0 = r0.firstRef()
            okio.Segment r1 = okio.SegmentPool.LOCK
            java.lang.Object r2 = r0.getAndSet(r1)
            okio.Segment r2 = (okio.Segment) r2
            if (r2 != r1) goto L16
            okio.Segment r0 = new okio.Segment
            r0.<init>()
            return r0
        L16:
            r1 = 0
            if (r2 != 0) goto L22
            r0.set(r1)
            okio.Segment r0 = new okio.Segment
            r0.<init>()
            return r0
        L22:
            okio.Segment r3 = r2.next
            r0.set(r3)
            r2.next = r1
            r0 = 0
            r2.limit = r0
            return r2
    }

    public final int getByteCount() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.firstRef()
            java.lang.Object r0 = r0.get()
            okio.Segment r0 = (okio.Segment) r0
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            int r0 = r0.limit
            return r0
    }

    public final int getMAX_SIZE() {
            r1 = this;
            int r0 = okio.SegmentPool.MAX_SIZE
            return r0
    }
}
