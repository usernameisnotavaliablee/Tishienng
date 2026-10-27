package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ChannelOutboundBuffer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int CHANNEL_OUTBOUND_BUFFER_ENTRY_OVERHEAD = 0;
    private static final io.netty.util.concurrent.FastThreadLocal<java.nio.ByteBuffer[]> NIO_BUFFERS = null;
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater<io.netty.channel.ChannelOutboundBuffer> TOTAL_PENDING_SIZE_UPDATER = null;
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.channel.ChannelOutboundBuffer> UNWRITABLE_UPDATER = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.channel.Channel channel;
    private volatile java.lang.Runnable fireChannelWritabilityChangedTask;
    private int flushed;
    private io.netty.channel.ChannelOutboundBuffer.Entry flushedEntry;
    private boolean inFail;
    private int nioBufferCount;
    private long nioBufferSize;
    private io.netty.channel.ChannelOutboundBuffer.Entry tailEntry;
    private volatile long totalPendingSize;
    private io.netty.channel.ChannelOutboundBuffer.Entry unflushedEntry;
    private volatile int unwritable;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class Entry {
        private static final io.netty.util.Recycler<io.netty.channel.ChannelOutboundBuffer.Entry> RECYCLER = null;
        java.nio.ByteBuffer buf;
        java.nio.ByteBuffer[] bufs;
        boolean cancelled;
        int count;
        private final io.netty.util.Recycler.Handle<io.netty.channel.ChannelOutboundBuffer.Entry> handle;
        java.lang.Object msg;
        io.netty.channel.ChannelOutboundBuffer.Entry next;
        int pendingSize;
        long progress;
        io.netty.channel.ChannelPromise promise;
        long total;


        static {
                io.netty.channel.ChannelOutboundBuffer$Entry$1 r0 = new io.netty.channel.ChannelOutboundBuffer$Entry$1
                r0.<init>()
                io.netty.channel.ChannelOutboundBuffer.Entry.RECYCLER = r0
                return
        }

        private Entry(io.netty.util.Recycler.Handle<io.netty.channel.ChannelOutboundBuffer.Entry> r2) {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.count = r0
                r1.handle = r2
                return
        }

        /* synthetic */ Entry(io.netty.util.Recycler.Handle r1, io.netty.channel.ChannelOutboundBuffer.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static io.netty.channel.ChannelOutboundBuffer.Entry newInstance(java.lang.Object r1, int r2, long r3, io.netty.channel.ChannelPromise r5) {
                io.netty.util.Recycler<io.netty.channel.ChannelOutboundBuffer$Entry> r0 = io.netty.channel.ChannelOutboundBuffer.Entry.RECYCLER
                java.lang.Object r0 = r0.get()
                io.netty.channel.ChannelOutboundBuffer$Entry r0 = (io.netty.channel.ChannelOutboundBuffer.Entry) r0
                r0.msg = r1
                int r1 = io.netty.channel.ChannelOutboundBuffer.CHANNEL_OUTBOUND_BUFFER_ENTRY_OVERHEAD
                int r2 = r2 + r1
                r0.pendingSize = r2
                r0.total = r3
                r0.promise = r5
                return r0
        }

        int cancel() {
                r3 = this;
                boolean r0 = r3.cancelled
                r1 = 0
                if (r0 != 0) goto L21
                r0 = 1
                r3.cancelled = r0
                int r0 = r3.pendingSize
                java.lang.Object r2 = r3.msg
                io.netty.util.ReferenceCountUtil.safeRelease(r2)
                io.netty.buffer.ByteBuf r2 = io.netty.buffer.Unpooled.EMPTY_BUFFER
                r3.msg = r2
                r3.pendingSize = r1
                r1 = 0
                r3.total = r1
                r3.progress = r1
                r1 = 0
                r3.bufs = r1
                r3.buf = r1
                return r0
            L21:
                return r1
        }

        void recycle() {
                r2 = this;
                r0 = 0
                r2.next = r0
                r2.bufs = r0
                r2.buf = r0
                r2.msg = r0
                r2.promise = r0
                r0 = 0
                r2.progress = r0
                r2.total = r0
                r0 = 0
                r2.pendingSize = r0
                r1 = -1
                r2.count = r1
                r2.cancelled = r0
                io.netty.util.Recycler$Handle<io.netty.channel.ChannelOutboundBuffer$Entry> r0 = r2.handle
                r0.recycle(r2)
                return
        }

        io.netty.channel.ChannelOutboundBuffer.Entry recycleAndGetNext() {
                r1 = this;
                io.netty.channel.ChannelOutboundBuffer$Entry r0 = r1.next
                r1.recycle()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface MessageProcessor {
        boolean processMessage(java.lang.Object r1) throws java.lang.Exception;
    }

    static {
            java.lang.String r0 = "io.netty.transport.outboundBufferEntrySizeOverhead"
            r1 = 96
            int r0 = io.netty.util.internal.SystemPropertyUtil.getInt(r0, r1)
            io.netty.channel.ChannelOutboundBuffer.CHANNEL_OUTBOUND_BUFFER_ENTRY_OVERHEAD = r0
            java.lang.Class<io.netty.channel.ChannelOutboundBuffer> r0 = io.netty.channel.ChannelOutboundBuffer.class
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.ChannelOutboundBuffer.logger = r1
            io.netty.channel.ChannelOutboundBuffer$1 r1 = new io.netty.channel.ChannelOutboundBuffer$1
            r1.<init>()
            io.netty.channel.ChannelOutboundBuffer.NIO_BUFFERS = r1
            java.lang.String r1 = "totalPendingSize"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r0, r1)
            io.netty.channel.ChannelOutboundBuffer.TOTAL_PENDING_SIZE_UPDATER = r1
            java.lang.String r1 = "unwritable"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            io.netty.channel.ChannelOutboundBuffer.UNWRITABLE_UPDATER = r0
            return
    }

    ChannelOutboundBuffer(io.netty.channel.AbstractChannel r1) {
            r0 = this;
            r0.<init>()
            r0.channel = r1
            return
    }

    private void clearNioBuffers() {
            r4 = this;
            int r0 = r4.nioBufferCount
            if (r0 <= 0) goto L13
            r1 = 0
            r4.nioBufferCount = r1
            io.netty.util.concurrent.FastThreadLocal<java.nio.ByteBuffer[]> r2 = io.netty.channel.ChannelOutboundBuffer.NIO_BUFFERS
            java.lang.Object r2 = r2.get()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r3 = 0
            java.util.Arrays.fill(r2, r1, r0, r3)
        L13:
            return
    }

    private void clearUserDefinedWritability(int r4) {
            r3 = this;
            int r4 = writabilityMask(r4)
        L4:
            int r0 = r3.unwritable
            r1 = r0 | r4
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.channel.ChannelOutboundBuffer> r2 = io.netty.channel.ChannelOutboundBuffer.UNWRITABLE_UPDATER
            boolean r2 = r2.compareAndSet(r3, r0, r1)
            if (r2 == 0) goto L4
            if (r0 != 0) goto L18
            if (r1 == 0) goto L18
            r4 = 1
            r3.fireChannelWritabilityChanged(r4)
        L18:
            return
    }

    private void decrementPendingOutboundBytes(long r4, boolean r6, boolean r7) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L7
            goto L22
        L7:
            java.util.concurrent.atomic.AtomicLongFieldUpdater<io.netty.channel.ChannelOutboundBuffer> r0 = io.netty.channel.ChannelOutboundBuffer.TOTAL_PENDING_SIZE_UPDATER
            long r4 = -r4
            long r4 = r0.addAndGet(r3, r4)
            if (r7 == 0) goto L22
            io.netty.channel.Channel r7 = r3.channel
            io.netty.channel.ChannelConfig r7 = r7.config()
            int r7 = r7.getWriteBufferLowWaterMark()
            long r0 = (long) r7
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 >= 0) goto L22
            r3.setWritable(r6)
        L22:
            return
    }

    private static java.nio.ByteBuffer[] expandNioBufferArray(java.nio.ByteBuffer[] r1, int r2, int r3) {
            int r0 = r1.length
        L1:
            int r0 = r0 << 1
            if (r0 < 0) goto Le
            if (r2 > r0) goto L1
            java.nio.ByteBuffer[] r2 = new java.nio.ByteBuffer[r0]
            r0 = 0
            java.lang.System.arraycopy(r1, r0, r2, r0, r3)
            return r2
        Le:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
    }

    private void fireChannelWritabilityChanged(boolean r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel
            io.netty.channel.ChannelPipeline r0 = r0.pipeline()
            if (r2 == 0) goto L1d
            java.lang.Runnable r2 = r1.fireChannelWritabilityChangedTask
            if (r2 != 0) goto L13
            io.netty.channel.ChannelOutboundBuffer$2 r2 = new io.netty.channel.ChannelOutboundBuffer$2
            r2.<init>(r1, r0)
            r1.fireChannelWritabilityChangedTask = r2
        L13:
            io.netty.channel.Channel r0 = r1.channel
            io.netty.channel.EventLoop r0 = r0.eventLoop()
            r0.execute(r2)
            return
        L1d:
            r0.fireChannelWritabilityChanged()
            return
    }

    private void incrementPendingOutboundBytes(long r4, boolean r6) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L7
            goto L1f
        L7:
            java.util.concurrent.atomic.AtomicLongFieldUpdater<io.netty.channel.ChannelOutboundBuffer> r0 = io.netty.channel.ChannelOutboundBuffer.TOTAL_PENDING_SIZE_UPDATER
            long r4 = r0.addAndGet(r3, r4)
            io.netty.channel.Channel r0 = r3.channel
            io.netty.channel.ChannelConfig r0 = r0.config()
            int r0 = r0.getWriteBufferHighWaterMark()
            long r0 = (long) r0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L1f
            r3.setUnwritable(r6)
        L1f:
            return
    }

    private boolean isFlushedEntry(io.netty.channel.ChannelOutboundBuffer.Entry r2) {
            r1 = this;
            if (r2 == 0) goto L8
            io.netty.channel.ChannelOutboundBuffer$Entry r0 = r1.unflushedEntry
            if (r2 == r0) goto L8
            r2 = 1
            return r2
        L8:
            r2 = 0
            return r2
    }

    private static int nioBuffers(io.netty.channel.ChannelOutboundBuffer.Entry r2, io.netty.buffer.ByteBuf r3, java.nio.ByteBuffer[] r4, int r5, int r6) {
            java.nio.ByteBuffer[] r0 = r2.bufs
            if (r0 != 0) goto La
            java.nio.ByteBuffer[] r0 = r3.nioBuffers()
            r2.bufs = r0
        La:
            r2 = 0
        Lb:
            int r3 = r0.length
            if (r2 >= r3) goto L24
            if (r5 >= r6) goto L24
            r3 = r0[r2]
            if (r3 != 0) goto L15
            goto L24
        L15:
            boolean r1 = r3.hasRemaining()
            if (r1 != 0) goto L1c
            goto L21
        L1c:
            int r1 = r5 + 1
            r4[r5] = r3
            r5 = r1
        L21:
            int r2 = r2 + 1
            goto Lb
        L24:
            return r5
    }

    private boolean remove0(java.lang.Throwable r7, boolean r8) {
            r6 = this;
            io.netty.channel.ChannelOutboundBuffer$Entry r0 = r6.flushedEntry
            r1 = 0
            if (r0 != 0) goto L9
            r6.clearNioBuffers()
            return r1
        L9:
            java.lang.Object r2 = r0.msg
            io.netty.channel.ChannelPromise r3 = r0.promise
            int r4 = r0.pendingSize
            r6.removeEntry(r0)
            boolean r5 = r0.cancelled
            if (r5 != 0) goto L20
            io.netty.util.ReferenceCountUtil.safeRelease(r2)
            safeFail(r3, r7)
            long r2 = (long) r4
            r6.decrementPendingOutboundBytes(r2, r1, r8)
        L20:
            r0.recycle()
            r7 = 1
            return r7
    }

    private void removeEntry(io.netty.channel.ChannelOutboundBuffer.Entry r3) {
            r2 = this;
            int r0 = r2.flushed
            int r0 = r0 + (-1)
            r2.flushed = r0
            if (r0 != 0) goto L14
            r0 = 0
            r2.flushedEntry = r0
            io.netty.channel.ChannelOutboundBuffer$Entry r1 = r2.tailEntry
            if (r3 != r1) goto L13
            r2.tailEntry = r0
            r2.unflushedEntry = r0
        L13:
            return
        L14:
            io.netty.channel.ChannelOutboundBuffer$Entry r3 = r3.next
            r2.flushedEntry = r3
            return
    }

    private static void safeFail(io.netty.channel.ChannelPromise r1, java.lang.Throwable r2) {
            boolean r0 = r1 instanceof io.netty.channel.VoidChannelPromise
            if (r0 == 0) goto L6
            r0 = 0
            goto L8
        L6:
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.ChannelOutboundBuffer.logger
        L8:
            io.netty.util.internal.PromiseNotificationUtil.tryFailure(r1, r2, r0)
            return
    }

    private static void safeSuccess(io.netty.channel.ChannelPromise r2) {
            boolean r0 = r2 instanceof io.netty.channel.VoidChannelPromise
            r1 = 0
            if (r0 == 0) goto L7
            r0 = r1
            goto L9
        L7:
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.ChannelOutboundBuffer.logger
        L9:
            io.netty.util.internal.PromiseNotificationUtil.trySuccess(r2, r1, r0)
            return
    }

    private void setUnwritable(boolean r4) {
            r3 = this;
        L0:
            int r0 = r3.unwritable
            r1 = r0 | 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.channel.ChannelOutboundBuffer> r2 = io.netty.channel.ChannelOutboundBuffer.UNWRITABLE_UPDATER
            boolean r2 = r2.compareAndSet(r3, r0, r1)
            if (r2 == 0) goto L0
            if (r0 != 0) goto L13
            if (r1 == 0) goto L13
            r3.fireChannelWritabilityChanged(r4)
        L13:
            return
    }

    private void setUserDefinedWritability(int r4) {
            r3 = this;
            int r4 = writabilityMask(r4)
            int r4 = ~r4
        L5:
            int r0 = r3.unwritable
            r1 = r0 & r4
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.channel.ChannelOutboundBuffer> r2 = io.netty.channel.ChannelOutboundBuffer.UNWRITABLE_UPDATER
            boolean r2 = r2.compareAndSet(r3, r0, r1)
            if (r2 == 0) goto L5
            if (r0 == 0) goto L19
            if (r1 != 0) goto L19
            r4 = 1
            r3.fireChannelWritabilityChanged(r4)
        L19:
            return
    }

    private void setWritable(boolean r4) {
            r3 = this;
        L0:
            int r0 = r3.unwritable
            r1 = r0 & (-2)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.channel.ChannelOutboundBuffer> r2 = io.netty.channel.ChannelOutboundBuffer.UNWRITABLE_UPDATER
            boolean r2 = r2.compareAndSet(r3, r0, r1)
            if (r2 == 0) goto L0
            if (r0 == 0) goto L13
            if (r1 != 0) goto L13
            r3.fireChannelWritabilityChanged(r4)
        L13:
            return
    }

    private static long total(java.lang.Object r2) {
            boolean r0 = r2 instanceof io.netty.buffer.ByteBuf
            if (r0 == 0) goto Lc
            io.netty.buffer.ByteBuf r2 = (io.netty.buffer.ByteBuf) r2
            int r2 = r2.readableBytes()
            long r0 = (long) r2
            return r0
        Lc:
            boolean r0 = r2 instanceof io.netty.channel.FileRegion
            if (r0 == 0) goto L17
            io.netty.channel.FileRegion r2 = (io.netty.channel.FileRegion) r2
            long r0 = r2.count()
            return r0
        L17:
            boolean r0 = r2 instanceof io.netty.buffer.ByteBufHolder
            if (r0 == 0) goto L27
            io.netty.buffer.ByteBufHolder r2 = (io.netty.buffer.ByteBufHolder) r2
            io.netty.buffer.ByteBuf r2 = r2.content()
            int r2 = r2.readableBytes()
            long r0 = (long) r2
            return r0
        L27:
            r0 = -1
            return r0
    }

    private static int writabilityMask(int r3) {
            r0 = 1
            if (r3 < r0) goto La
            r1 = 31
            if (r3 > r1) goto La
            int r3 = r0 << r3
            return r3
        La:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "index: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " (expected: 1~31)"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public void addFlush() {
            r5 = this;
            io.netty.channel.ChannelOutboundBuffer$Entry r0 = r5.unflushedEntry
            if (r0 == 0) goto L28
            io.netty.channel.ChannelOutboundBuffer$Entry r1 = r5.flushedEntry
            if (r1 != 0) goto La
            r5.flushedEntry = r0
        La:
            int r1 = r5.flushed
            r2 = 1
            int r1 = r1 + r2
            r5.flushed = r1
            io.netty.channel.ChannelPromise r1 = r0.promise
            boolean r1 = r1.setUncancellable()
            if (r1 != 0) goto L21
            int r1 = r0.cancel()
            long r3 = (long) r1
            r1 = 0
            r5.decrementPendingOutboundBytes(r3, r1, r2)
        L21:
            io.netty.channel.ChannelOutboundBuffer$Entry r0 = r0.next
            if (r0 != 0) goto La
            r0 = 0
            r5.unflushedEntry = r0
        L28:
            return
    }

    public void addMessage(java.lang.Object r3, int r4, io.netty.channel.ChannelPromise r5) {
            r2 = this;
            long r0 = total(r3)
            io.netty.channel.ChannelOutboundBuffer$Entry r3 = io.netty.channel.ChannelOutboundBuffer.Entry.newInstance(r3, r4, r0, r5)
            io.netty.channel.ChannelOutboundBuffer$Entry r4 = r2.tailEntry
            if (r4 != 0) goto L10
            r4 = 0
            r2.flushedEntry = r4
            goto L12
        L10:
            r4.next = r3
        L12:
            r2.tailEntry = r3
            io.netty.channel.ChannelOutboundBuffer$Entry r4 = r2.unflushedEntry
            if (r4 != 0) goto L1a
            r2.unflushedEntry = r3
        L1a:
            int r3 = r3.pendingSize
            long r3 = (long) r3
            r5 = 0
            r2.incrementPendingOutboundBytes(r3, r5)
            return
    }

    public long bytesBeforeUnwritable() {
            r5 = this;
            io.netty.channel.Channel r0 = r5.channel
            io.netty.channel.ChannelConfig r0 = r0.config()
            int r0 = r0.getWriteBufferHighWaterMark()
            long r0 = (long) r0
            long r2 = r5.totalPendingSize
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1b
            boolean r4 = r5.isWritable()
            if (r4 == 0) goto L1b
            return r0
        L1b:
            return r2
    }

    public long bytesBeforeWritable() {
            r5 = this;
            long r0 = r5.totalPendingSize
            io.netty.channel.Channel r2 = r5.channel
            io.netty.channel.ChannelConfig r2 = r2.config()
            int r2 = r2.getWriteBufferLowWaterMark()
            long r2 = (long) r2
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1c
            boolean r4 = r5.isWritable()
            if (r4 == 0) goto L1b
            return r2
        L1b:
            return r0
        L1c:
            return r2
    }

    void close(java.lang.Throwable r6, boolean r7) {
            r5 = this;
            boolean r0 = r5.inFail
            if (r0 == 0) goto L13
            io.netty.channel.Channel r0 = r5.channel
            io.netty.channel.EventLoop r0 = r0.eventLoop()
            io.netty.channel.ChannelOutboundBuffer$3 r1 = new io.netty.channel.ChannelOutboundBuffer$3
            r1.<init>(r5, r6, r7)
            r0.execute(r1)
            return
        L13:
            r0 = 1
            r5.inFail = r0
            if (r7 != 0) goto L29
            io.netty.channel.Channel r7 = r5.channel
            boolean r7 = r7.isOpen()
            if (r7 != 0) goto L21
            goto L29
        L21:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "close() must be invoked after the channel is closed."
            r6.<init>(r7)
            throw r6
        L29:
            boolean r7 = r5.isEmpty()
            if (r7 == 0) goto L5c
            r7 = 0
            io.netty.channel.ChannelOutboundBuffer$Entry r0 = r5.unflushedEntry     // Catch: java.lang.Throwable -> L4c
        L32:
            if (r0 == 0) goto L53
            int r1 = r0.pendingSize     // Catch: java.lang.Throwable -> L4c
            java.util.concurrent.atomic.AtomicLongFieldUpdater<io.netty.channel.ChannelOutboundBuffer> r2 = io.netty.channel.ChannelOutboundBuffer.TOTAL_PENDING_SIZE_UPDATER     // Catch: java.lang.Throwable -> L4c
            int r1 = -r1
            long r3 = (long) r1     // Catch: java.lang.Throwable -> L4c
            r2.addAndGet(r5, r3)     // Catch: java.lang.Throwable -> L4c
            boolean r1 = r0.cancelled     // Catch: java.lang.Throwable -> L4c
            if (r1 != 0) goto L4e
            java.lang.Object r1 = r0.msg     // Catch: java.lang.Throwable -> L4c
            io.netty.util.ReferenceCountUtil.safeRelease(r1)     // Catch: java.lang.Throwable -> L4c
            io.netty.channel.ChannelPromise r1 = r0.promise     // Catch: java.lang.Throwable -> L4c
            safeFail(r1, r6)     // Catch: java.lang.Throwable -> L4c
            goto L4e
        L4c:
            r6 = move-exception
            goto L59
        L4e:
            io.netty.channel.ChannelOutboundBuffer$Entry r0 = r0.recycleAndGetNext()     // Catch: java.lang.Throwable -> L4c
            goto L32
        L53:
            r5.inFail = r7
            r5.clearNioBuffers()
            return
        L59:
            r5.inFail = r7
            throw r6
        L5c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "close() must be invoked after all flushed writes are handled."
            r6.<init>(r7)
            throw r6
    }

    void close(java.nio.channels.ClosedChannelException r2) {
            r1 = this;
            r0 = 0
            r1.close(r2, r0)
            return
    }

    public java.lang.Object current() {
            r1 = this;
            io.netty.channel.ChannelOutboundBuffer$Entry r0 = r1.flushedEntry
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.msg
            return r0
    }

    public long currentProgress() {
            r2 = this;
            io.netty.channel.ChannelOutboundBuffer$Entry r0 = r2.flushedEntry
            if (r0 != 0) goto L7
            r0 = 0
            return r0
        L7:
            long r0 = r0.progress
            return r0
    }

    void decrementPendingOutboundBytes(long r2) {
            r1 = this;
            r0 = 1
            r1.decrementPendingOutboundBytes(r2, r0, r0)
            return
    }

    void failFlushed(java.lang.Throwable r3, boolean r4) {
            r2 = this;
            boolean r0 = r2.inFail
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1 = 0
            r2.inFail = r0     // Catch: java.lang.Throwable -> L12
        L9:
            boolean r0 = r2.remove0(r3, r4)     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L9
            r2.inFail = r1
            return
        L12:
            r3 = move-exception
            r2.inFail = r1
            throw r3
    }

    public void forEachFlushedMessage(io.netty.channel.ChannelOutboundBuffer.MessageProcessor r3) throws java.lang.Exception {
            r2 = this;
            if (r3 == 0) goto L1d
            io.netty.channel.ChannelOutboundBuffer$Entry r0 = r2.flushedEntry
            if (r0 != 0) goto L7
            goto L1c
        L7:
            boolean r1 = r0.cancelled
            if (r1 != 0) goto L14
            java.lang.Object r1 = r0.msg
            boolean r1 = r3.processMessage(r1)
            if (r1 != 0) goto L14
            goto L1c
        L14:
            io.netty.channel.ChannelOutboundBuffer$Entry r0 = r0.next
            boolean r1 = r2.isFlushedEntry(r0)
            if (r1 != 0) goto L7
        L1c:
            return
        L1d:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "processor"
            r3.<init>(r0)
            throw r3
    }

    public boolean getUserDefinedWritability(int r2) {
            r1 = this;
            int r0 = r1.unwritable
            int r2 = writabilityMask(r2)
            r2 = r2 & r0
            if (r2 != 0) goto Lb
            r2 = 1
            return r2
        Lb:
            r2 = 0
            return r2
    }

    void incrementPendingOutboundBytes(long r2) {
            r1 = this;
            r0 = 1
            r1.incrementPendingOutboundBytes(r2, r0)
            return
    }

    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.flushed
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public boolean isWritable() {
            r1 = this;
            int r0 = r1.unwritable
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public int nioBufferCount() {
            r1 = this;
            int r0 = r1.nioBufferCount
            return r0
    }

    public long nioBufferSize() {
            r2 = this;
            long r0 = r2.nioBufferSize
            return r0
    }

    public java.nio.ByteBuffer[] nioBuffers() {
            r3 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            java.nio.ByteBuffer[] r0 = r3.nioBuffers(r0, r1)
            return r0
    }

    public java.nio.ByteBuffer[] nioBuffers(int r17, long r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            io.netty.util.internal.InternalThreadLocalMap r2 = io.netty.util.internal.InternalThreadLocalMap.get()
            io.netty.util.concurrent.FastThreadLocal<java.nio.ByteBuffer[]> r3 = io.netty.channel.ChannelOutboundBuffer.NIO_BUFFERS
            java.lang.Object r3 = r3.get(r2)
            java.nio.ByteBuffer[] r3 = (java.nio.ByteBuffer[]) r3
            io.netty.channel.ChannelOutboundBuffer$Entry r4 = r0.flushedEntry
            r5 = 0
            r7 = 0
        L15:
            boolean r8 = r0.isFlushedEntry(r4)
            if (r8 == 0) goto L77
            java.lang.Object r8 = r4.msg
            boolean r9 = r8 instanceof io.netty.buffer.ByteBuf
            if (r9 == 0) goto L77
            boolean r9 = r4.cancelled
            if (r9 != 0) goto L74
            io.netty.buffer.ByteBuf r8 = (io.netty.buffer.ByteBuf) r8
            int r9 = r8.readerIndex()
            int r10 = r8.writerIndex()
            int r10 = r10 - r9
            if (r10 <= 0) goto L74
            long r11 = (long) r10
            long r13 = r18 - r11
            int r15 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r15 >= 0) goto L3c
            if (r7 == 0) goto L3c
            goto L77
        L3c:
            long r5 = r5 + r11
            int r11 = r4.count
            r12 = -1
            if (r11 != r12) goto L48
            int r11 = r8.nioBufferCount()
            r4.count = r11
        L48:
            int r12 = r7 + r11
            int r12 = java.lang.Math.min(r1, r12)
            int r13 = r3.length
            if (r12 <= r13) goto L5a
            java.nio.ByteBuffer[] r3 = expandNioBufferArray(r3, r12, r7)
            io.netty.util.concurrent.FastThreadLocal<java.nio.ByteBuffer[]> r12 = io.netty.channel.ChannelOutboundBuffer.NIO_BUFFERS
            r12.set(r2, r3)
        L5a:
            r12 = 1
            if (r11 != r12) goto L6d
            java.nio.ByteBuffer r11 = r4.buf
            if (r11 != 0) goto L67
            java.nio.ByteBuffer r11 = r8.internalNioBuffer(r9, r10)
            r4.buf = r11
        L67:
            int r8 = r7 + 1
            r3[r7] = r11
            r7 = r8
            goto L71
        L6d:
            int r7 = nioBuffers(r4, r8, r3, r7, r1)
        L71:
            if (r7 != r1) goto L74
            goto L77
        L74:
            io.netty.channel.ChannelOutboundBuffer$Entry r4 = r4.next
            goto L15
        L77:
            r0.nioBufferCount = r7
            r0.nioBufferSize = r5
            return r3
    }

    public void progress(long r5) {
            r4 = this;
            io.netty.channel.ChannelOutboundBuffer$Entry r0 = r4.flushedEntry
            io.netty.channel.ChannelPromise r1 = r0.promise
            long r2 = r0.progress
            long r2 = r2 + r5
            r0.progress = r2
            boolean r5 = r1 instanceof io.netty.channel.ChannelProgressivePromise
            if (r5 == 0) goto L14
            io.netty.channel.ChannelProgressivePromise r1 = (io.netty.channel.ChannelProgressivePromise) r1
            long r5 = r0.total
            r1.tryProgress(r2, r5)
        L14:
            return
    }

    @java.lang.Deprecated
    public void recycle() {
            r0 = this;
            return
    }

    public boolean remove() {
            r7 = this;
            io.netty.channel.ChannelOutboundBuffer$Entry r0 = r7.flushedEntry
            r1 = 0
            if (r0 != 0) goto L9
            r7.clearNioBuffers()
            return r1
        L9:
            java.lang.Object r2 = r0.msg
            io.netty.channel.ChannelPromise r3 = r0.promise
            int r4 = r0.pendingSize
            r7.removeEntry(r0)
            boolean r5 = r0.cancelled
            r6 = 1
            if (r5 != 0) goto L21
            io.netty.util.ReferenceCountUtil.safeRelease(r2)
            safeSuccess(r3)
            long r2 = (long) r4
            r7.decrementPendingOutboundBytes(r2, r1, r6)
        L21:
            r0.recycle()
            return r6
    }

    public boolean remove(java.lang.Throwable r2) {
            r1 = this;
            r0 = 1
            boolean r2 = r1.remove0(r2, r0)
            return r2
    }

    public void removeBytes(long r8) {
            r7 = this;
        L0:
            java.lang.Object r0 = r7.current()
            boolean r1 = r0 instanceof io.netty.buffer.ByteBuf
            if (r1 != 0) goto L9
            goto L33
        L9:
            io.netty.buffer.ByteBuf r0 = (io.netty.buffer.ByteBuf) r0
            int r1 = r0.readerIndex()
            int r2 = r0.writerIndex()
            int r2 = r2 - r1
            long r2 = (long) r2
            r4 = 0
            int r6 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r6 > 0) goto L27
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 == 0) goto L23
            r7.progress(r2)
            long r8 = r8 - r2
        L23:
            r7.remove()
            goto L0
        L27:
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 == 0) goto L33
            int r2 = (int) r8
            int r1 = r1 + r2
            r0.readerIndex(r1)
            r7.progress(r8)
        L33:
            r7.clearNioBuffers()
            return
    }

    public void setUserDefinedWritability(int r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L6
            r0.setUserDefinedWritability(r1)
            return
        L6:
            r0.clearUserDefinedWritability(r1)
            return
    }

    public int size() {
            r1 = this;
            int r0 = r1.flushed
            return r0
    }

    public long totalPendingWriteBytes() {
            r2 = this;
            long r0 = r2.totalPendingSize
            return r0
    }
}
