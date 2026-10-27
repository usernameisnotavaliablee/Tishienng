package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class PendingWriteQueue {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int PENDING_WRITE_OVERHEAD = 0;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private long bytes;
    private final io.netty.channel.ChannelHandlerContext ctx;
    private io.netty.channel.PendingWriteQueue.PendingWrite head;
    private int size;
    private io.netty.channel.PendingWriteQueue.PendingWrite tail;
    private final io.netty.channel.PendingBytesTracker tracker;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.channel.PendingWriteQueue$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class PendingWrite {
        private static final io.netty.util.Recycler<io.netty.channel.PendingWriteQueue.PendingWrite> RECYCLER = null;
        private final io.netty.util.Recycler.Handle<io.netty.channel.PendingWriteQueue.PendingWrite> handle;
        private java.lang.Object msg;
        private io.netty.channel.PendingWriteQueue.PendingWrite next;
        private io.netty.channel.ChannelPromise promise;
        private long size;


        static {
                io.netty.channel.PendingWriteQueue$PendingWrite$1 r0 = new io.netty.channel.PendingWriteQueue$PendingWrite$1
                r0.<init>()
                io.netty.channel.PendingWriteQueue.PendingWrite.RECYCLER = r0
                return
        }

        private PendingWrite(io.netty.util.Recycler.Handle<io.netty.channel.PendingWriteQueue.PendingWrite> r1) {
                r0 = this;
                r0.<init>()
                r0.handle = r1
                return
        }

        /* synthetic */ PendingWrite(io.netty.util.Recycler.Handle r1, io.netty.channel.PendingWriteQueue.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ io.netty.channel.PendingWriteQueue.PendingWrite access$000(io.netty.channel.PendingWriteQueue.PendingWrite r0) {
                io.netty.channel.PendingWriteQueue$PendingWrite r0 = r0.next
                return r0
        }

        static /* synthetic */ io.netty.channel.PendingWriteQueue.PendingWrite access$002(io.netty.channel.PendingWriteQueue.PendingWrite r0, io.netty.channel.PendingWriteQueue.PendingWrite r1) {
                r0.next = r1
                return r1
        }

        static /* synthetic */ long access$100(io.netty.channel.PendingWriteQueue.PendingWrite r2) {
                long r0 = r2.size
                return r0
        }

        static /* synthetic */ java.lang.Object access$200(io.netty.channel.PendingWriteQueue.PendingWrite r0) {
                java.lang.Object r0 = r0.msg
                return r0
        }

        static /* synthetic */ io.netty.channel.ChannelPromise access$300(io.netty.channel.PendingWriteQueue.PendingWrite r0) {
                io.netty.channel.ChannelPromise r0 = r0.promise
                return r0
        }

        static /* synthetic */ void access$400(io.netty.channel.PendingWriteQueue.PendingWrite r0) {
                r0.recycle()
                return
        }

        static io.netty.channel.PendingWriteQueue.PendingWrite newInstance(java.lang.Object r3, int r4, io.netty.channel.ChannelPromise r5) {
                io.netty.util.Recycler<io.netty.channel.PendingWriteQueue$PendingWrite> r0 = io.netty.channel.PendingWriteQueue.PendingWrite.RECYCLER
                java.lang.Object r0 = r0.get()
                io.netty.channel.PendingWriteQueue$PendingWrite r0 = (io.netty.channel.PendingWriteQueue.PendingWrite) r0
                long r1 = (long) r4
                r0.size = r1
                r0.msg = r3
                r0.promise = r5
                return r0
        }

        private void recycle() {
                r2 = this;
                r0 = 0
                r2.size = r0
                r0 = 0
                r2.next = r0
                r2.msg = r0
                r2.promise = r0
                io.netty.util.Recycler$Handle<io.netty.channel.PendingWriteQueue$PendingWrite> r0 = r2.handle
                r0.recycle(r2)
                return
        }
    }

    static {
            java.lang.Class<io.netty.channel.PendingWriteQueue> r0 = io.netty.channel.PendingWriteQueue.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.PendingWriteQueue.logger = r0
            java.lang.String r0 = "io.netty.transport.pendingWriteSizeOverhead"
            r1 = 64
            int r0 = io.netty.util.internal.SystemPropertyUtil.getInt(r0, r1)
            io.netty.channel.PendingWriteQueue.PENDING_WRITE_OVERHEAD = r0
            return
    }

    public PendingWriteQueue(io.netty.channel.ChannelHandlerContext r2) {
            r1 = this;
            r1.<init>()
            io.netty.channel.Channel r0 = r2.channel()
            io.netty.channel.PendingBytesTracker r0 = io.netty.channel.PendingBytesTracker.newTracker(r0)
            r1.tracker = r0
            r1.ctx = r2
            return
    }

    private void assertEmpty() {
            r0 = this;
            return
    }

    private void recycle(io.netty.channel.PendingWriteQueue.PendingWrite r6, boolean r7) {
            r5 = this;
            io.netty.channel.PendingWriteQueue$PendingWrite r0 = io.netty.channel.PendingWriteQueue.PendingWrite.access$000(r6)
            long r1 = io.netty.channel.PendingWriteQueue.PendingWrite.access$100(r6)
            if (r7 == 0) goto L26
            if (r0 != 0) goto L19
            r7 = 0
            r5.tail = r7
            r5.head = r7
            r7 = 0
            r5.size = r7
            r3 = 0
            r5.bytes = r3
            goto L26
        L19:
            r5.head = r0
            int r7 = r5.size
            int r7 = r7 + (-1)
            r5.size = r7
            long r3 = r5.bytes
            long r3 = r3 - r1
            r5.bytes = r3
        L26:
            io.netty.channel.PendingWriteQueue.PendingWrite.access$400(r6)
            io.netty.channel.PendingBytesTracker r6 = r5.tracker
            r6.decrementPendingOutboundBytes(r1)
            return
    }

    private static void safeFail(io.netty.channel.ChannelPromise r2, java.lang.Throwable r3) {
            boolean r0 = r2 instanceof io.netty.channel.VoidChannelPromise
            if (r0 != 0) goto L11
            boolean r0 = r2.tryFailure(r3)
            if (r0 != 0) goto L11
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.PendingWriteQueue.logger
            java.lang.String r1 = "Failed to mark a promise as failure because it's done already: {}"
            r0.warn(r1, r2, r3)
        L11:
            return
    }

    private int size(java.lang.Object r2) {
            r1 = this;
            io.netty.channel.PendingBytesTracker r0 = r1.tracker
            int r2 = r0.size(r2)
            if (r2 >= 0) goto L9
            r2 = 0
        L9:
            int r0 = io.netty.channel.PendingWriteQueue.PENDING_WRITE_OVERHEAD
            int r2 = r2 + r0
            return r2
    }

    public void add(java.lang.Object r6, io.netty.channel.ChannelPromise r7) {
            r5 = this;
            if (r6 == 0) goto L38
            if (r7 == 0) goto L30
            int r0 = r5.size(r6)
            io.netty.channel.PendingWriteQueue$PendingWrite r6 = io.netty.channel.PendingWriteQueue.PendingWrite.newInstance(r6, r0, r7)
            io.netty.channel.PendingWriteQueue$PendingWrite r7 = r5.tail
            if (r7 != 0) goto L15
            r5.head = r6
            r5.tail = r6
            goto L1a
        L15:
            io.netty.channel.PendingWriteQueue.PendingWrite.access$002(r7, r6)
            r5.tail = r6
        L1a:
            int r7 = r5.size
            int r7 = r7 + 1
            r5.size = r7
            long r1 = r5.bytes
            long r3 = (long) r0
            long r1 = r1 + r3
            r5.bytes = r1
            io.netty.channel.PendingBytesTracker r7 = r5.tracker
            long r0 = io.netty.channel.PendingWriteQueue.PendingWrite.access$100(r6)
            r7.incrementPendingOutboundBytes(r0)
            return
        L30:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "promise"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "msg"
            r6.<init>(r7)
            throw r6
    }

    public long bytes() {
            r2 = this;
            long r0 = r2.bytes
            return r0
    }

    public java.lang.Object current() {
            r1 = this;
            io.netty.channel.PendingWriteQueue$PendingWrite r0 = r1.head
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = io.netty.channel.PendingWriteQueue.PendingWrite.access$200(r0)
            return r0
    }

    public boolean isEmpty() {
            r1 = this;
            io.netty.channel.PendingWriteQueue$PendingWrite r0 = r1.head
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public io.netty.channel.ChannelPromise remove() {
            r3 = this;
            io.netty.channel.PendingWriteQueue$PendingWrite r0 = r3.head
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            io.netty.channel.ChannelPromise r1 = io.netty.channel.PendingWriteQueue.PendingWrite.access$300(r0)
            java.lang.Object r2 = io.netty.channel.PendingWriteQueue.PendingWrite.access$200(r0)
            io.netty.util.ReferenceCountUtil.safeRelease(r2)
            r2 = 1
            r3.recycle(r0, r2)
            return r1
    }

    public void removeAndFail(java.lang.Throwable r3) {
            r2 = this;
            if (r3 == 0) goto L1a
            io.netty.channel.PendingWriteQueue$PendingWrite r0 = r2.head
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.Object r1 = io.netty.channel.PendingWriteQueue.PendingWrite.access$200(r0)
            io.netty.util.ReferenceCountUtil.safeRelease(r1)
            io.netty.channel.ChannelPromise r1 = io.netty.channel.PendingWriteQueue.PendingWrite.access$300(r0)
            safeFail(r1, r3)
            r3 = 1
            r2.recycle(r0, r3)
            return
        L1a:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "cause"
            r3.<init>(r0)
            throw r3
    }

    public void removeAndFailAll(java.lang.Throwable r5) {
            r4 = this;
            if (r5 == 0) goto L2f
        L2:
            io.netty.channel.PendingWriteQueue$PendingWrite r0 = r4.head
            if (r0 == 0) goto L2b
            r1 = 0
            r4.tail = r1
            r4.head = r1
            r1 = 0
            r4.size = r1
            r2 = 0
            r4.bytes = r2
        L12:
            if (r0 == 0) goto L2
            io.netty.channel.PendingWriteQueue$PendingWrite r2 = io.netty.channel.PendingWriteQueue.PendingWrite.access$000(r0)
            java.lang.Object r3 = io.netty.channel.PendingWriteQueue.PendingWrite.access$200(r0)
            io.netty.util.ReferenceCountUtil.safeRelease(r3)
            io.netty.channel.ChannelPromise r3 = io.netty.channel.PendingWriteQueue.PendingWrite.access$300(r0)
            r4.recycle(r0, r1)
            safeFail(r3, r5)
            r0 = r2
            goto L12
        L2b:
            r4.assertEmpty()
            return
        L2f:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "cause"
            r5.<init>(r0)
            throw r5
    }

    public io.netty.channel.ChannelFuture removeAndWrite() {
            r4 = this;
            io.netty.channel.PendingWriteQueue$PendingWrite r0 = r4.head
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r1 = io.netty.channel.PendingWriteQueue.PendingWrite.access$200(r0)
            io.netty.channel.ChannelPromise r2 = io.netty.channel.PendingWriteQueue.PendingWrite.access$300(r0)
            r3 = 1
            r4.recycle(r0, r3)
            io.netty.channel.ChannelHandlerContext r0 = r4.ctx
            io.netty.channel.ChannelFuture r0 = r0.write(r1, r2)
            return r0
    }

    public io.netty.channel.ChannelFuture removeAndWriteAll() {
            r8 = this;
            boolean r0 = r8.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            io.netty.channel.ChannelHandlerContext r0 = r8.ctx
            io.netty.channel.ChannelPromise r0 = r0.newPromise()
            io.netty.util.concurrent.PromiseCombiner r2 = new io.netty.util.concurrent.PromiseCombiner
            io.netty.channel.ChannelHandlerContext r3 = r8.ctx
            io.netty.util.concurrent.EventExecutor r3 = r3.executor()
            r2.<init>(r3)
        L19:
            io.netty.channel.PendingWriteQueue$PendingWrite r3 = r8.head     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L4a
            r8.tail = r1     // Catch: java.lang.Throwable -> L41
            r8.head = r1     // Catch: java.lang.Throwable -> L41
            r4 = 0
            r8.size = r4     // Catch: java.lang.Throwable -> L41
            r5 = 0
            r8.bytes = r5     // Catch: java.lang.Throwable -> L41
        L28:
            if (r3 == 0) goto L19
            io.netty.channel.PendingWriteQueue$PendingWrite r5 = io.netty.channel.PendingWriteQueue.PendingWrite.access$000(r3)     // Catch: java.lang.Throwable -> L41
            java.lang.Object r6 = io.netty.channel.PendingWriteQueue.PendingWrite.access$200(r3)     // Catch: java.lang.Throwable -> L41
            io.netty.channel.ChannelPromise r7 = io.netty.channel.PendingWriteQueue.PendingWrite.access$300(r3)     // Catch: java.lang.Throwable -> L41
            r8.recycle(r3, r4)     // Catch: java.lang.Throwable -> L41
            boolean r3 = r7 instanceof io.netty.channel.VoidChannelPromise     // Catch: java.lang.Throwable -> L41
            if (r3 != 0) goto L43
            r2.add(r7)     // Catch: java.lang.Throwable -> L41
            goto L43
        L41:
            r1 = move-exception
            goto L4e
        L43:
            io.netty.channel.ChannelHandlerContext r3 = r8.ctx     // Catch: java.lang.Throwable -> L41
            r3.write(r6, r7)     // Catch: java.lang.Throwable -> L41
            r3 = r5
            goto L28
        L4a:
            r2.finish(r0)     // Catch: java.lang.Throwable -> L41
            goto L51
        L4e:
            r0.setFailure(r1)
        L51:
            r8.assertEmpty()
            return r0
    }

    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }
}
