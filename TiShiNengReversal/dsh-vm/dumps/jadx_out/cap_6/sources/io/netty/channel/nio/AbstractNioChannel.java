package io.netty.channel.nio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractNioChannel extends io.netty.channel.AbstractChannel {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final java.nio.channels.SelectableChannel ch;
    private final java.lang.Runnable clearReadPendingRunnable;
    private io.netty.channel.ChannelPromise connectPromise;
    private java.util.concurrent.ScheduledFuture<?> connectTimeoutFuture;
    protected final int readInterestOp;
    boolean readPending;
    private java.net.SocketAddress requestedRemoteAddress;
    volatile java.nio.channels.SelectionKey selectionKey;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected abstract class AbstractNioUnsafe extends io.netty.channel.AbstractChannel.AbstractUnsafe implements io.netty.channel.nio.AbstractNioChannel.NioUnsafe {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        final /* synthetic */ io.netty.channel.nio.AbstractNioChannel this$0;



        static {
                return
        }

        protected AbstractNioUnsafe(io.netty.channel.nio.AbstractNioChannel r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        private void fulfillConnectPromise(io.netty.channel.ChannelPromise r1, java.lang.Throwable r2) {
                r0 = this;
                if (r1 != 0) goto L3
                return
            L3:
                r1.tryFailure(r2)
                r0.closeIfClosed()
                return
        }

        private void fulfillConnectPromise(io.netty.channel.ChannelPromise r2, boolean r3) {
                r1 = this;
                if (r2 != 0) goto L3
                goto L23
            L3:
                io.netty.channel.nio.AbstractNioChannel r0 = r1.this$0
                boolean r0 = r0.isActive()
                boolean r2 = r2.trySuccess()
                if (r3 != 0) goto L1a
                if (r0 == 0) goto L1a
                io.netty.channel.nio.AbstractNioChannel r3 = r1.this$0
                io.netty.channel.ChannelPipeline r3 = r3.pipeline()
                r3.fireChannelActive()
            L1a:
                if (r2 != 0) goto L23
                io.netty.channel.ChannelPromise r2 = r1.voidPromise()
                r1.close(r2)
            L23:
                return
        }

        private boolean isFlushPending() {
                r2 = this;
                io.netty.channel.nio.AbstractNioChannel r0 = r2.this$0
                java.nio.channels.SelectionKey r0 = r0.selectionKey()
                boolean r1 = r0.isValid()
                if (r1 == 0) goto L16
                int r0 = r0.interestOps()
                r0 = r0 & 4
                if (r0 == 0) goto L16
                r0 = 1
                return r0
            L16:
                r0 = 0
                return r0
        }

        @Override // io.netty.channel.nio.AbstractNioChannel.NioUnsafe
        public final java.nio.channels.SelectableChannel ch() {
                r1 = this;
                io.netty.channel.nio.AbstractNioChannel r0 = r1.this$0
                java.nio.channels.SelectableChannel r0 = r0.mo176javaChannel()
                return r0
        }

        @Override // io.netty.channel.Channel.Unsafe
        public final void connect(java.net.SocketAddress r6, java.net.SocketAddress r7, io.netty.channel.ChannelPromise r8) {
                r5 = this;
                boolean r0 = r8.setUncancellable()
                if (r0 == 0) goto L6d
                boolean r0 = r5.ensureOpen(r8)
                if (r0 != 0) goto Ld
                goto L6d
            Ld:
                io.netty.channel.nio.AbstractNioChannel r0 = r5.this$0     // Catch: java.lang.Throwable -> L27
                io.netty.channel.ChannelPromise r0 = io.netty.channel.nio.AbstractNioChannel.access$200(r0)     // Catch: java.lang.Throwable -> L27
                if (r0 != 0) goto L5d
                io.netty.channel.nio.AbstractNioChannel r0 = r5.this$0     // Catch: java.lang.Throwable -> L27
                boolean r0 = r0.isActive()     // Catch: java.lang.Throwable -> L27
                io.netty.channel.nio.AbstractNioChannel r1 = r5.this$0     // Catch: java.lang.Throwable -> L27
                boolean r7 = r1.doConnect(r6, r7)     // Catch: java.lang.Throwable -> L27
                if (r7 == 0) goto L29
                r5.fulfillConnectPromise(r8, r0)     // Catch: java.lang.Throwable -> L27
                return
            L27:
                r7 = move-exception
                goto L63
            L29:
                io.netty.channel.nio.AbstractNioChannel r7 = r5.this$0     // Catch: java.lang.Throwable -> L27
                io.netty.channel.nio.AbstractNioChannel.access$202(r7, r8)     // Catch: java.lang.Throwable -> L27
                io.netty.channel.nio.AbstractNioChannel r7 = r5.this$0     // Catch: java.lang.Throwable -> L27
                io.netty.channel.nio.AbstractNioChannel.access$302(r7, r6)     // Catch: java.lang.Throwable -> L27
                io.netty.channel.nio.AbstractNioChannel r7 = r5.this$0     // Catch: java.lang.Throwable -> L27
                io.netty.channel.ChannelConfig r7 = r7.config()     // Catch: java.lang.Throwable -> L27
                int r7 = r7.getConnectTimeoutMillis()     // Catch: java.lang.Throwable -> L27
                if (r7 <= 0) goto L54
                io.netty.channel.nio.AbstractNioChannel r0 = r5.this$0     // Catch: java.lang.Throwable -> L27
                io.netty.channel.nio.NioEventLoop r1 = r0.eventLoop()     // Catch: java.lang.Throwable -> L27
                io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe$1 r2 = new io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe$1     // Catch: java.lang.Throwable -> L27
                r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L27
                long r3 = (long) r7     // Catch: java.lang.Throwable -> L27
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L27
                io.netty.util.concurrent.ScheduledFuture r7 = r1.schedule(r2, r3, r7)     // Catch: java.lang.Throwable -> L27
                io.netty.channel.nio.AbstractNioChannel.access$402(r0, r7)     // Catch: java.lang.Throwable -> L27
            L54:
                io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe$2 r7 = new io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe$2     // Catch: java.lang.Throwable -> L27
                r7.<init>(r5)     // Catch: java.lang.Throwable -> L27
                r8.addListener(r7)     // Catch: java.lang.Throwable -> L27
                return
            L5d:
                java.nio.channels.ConnectionPendingException r7 = new java.nio.channels.ConnectionPendingException     // Catch: java.lang.Throwable -> L27
                r7.<init>()     // Catch: java.lang.Throwable -> L27
                throw r7     // Catch: java.lang.Throwable -> L27
            L63:
                java.lang.Throwable r6 = r5.annotateConnectException(r7, r6)
                r8.tryFailure(r6)
                r5.closeIfClosed()
            L6d:
                return
        }

        @Override // io.netty.channel.nio.AbstractNioChannel.NioUnsafe
        public final void finishConnect() {
                r5 = this;
                r0 = 0
                r1 = 0
                io.netty.channel.nio.AbstractNioChannel r2 = r5.this$0     // Catch: java.lang.Throwable -> L2d
                boolean r2 = r2.isActive()     // Catch: java.lang.Throwable -> L2d
                io.netty.channel.nio.AbstractNioChannel r3 = r5.this$0     // Catch: java.lang.Throwable -> L2d
                r3.doFinishConnect()     // Catch: java.lang.Throwable -> L2d
                io.netty.channel.nio.AbstractNioChannel r3 = r5.this$0     // Catch: java.lang.Throwable -> L2d
                io.netty.channel.ChannelPromise r3 = io.netty.channel.nio.AbstractNioChannel.access$200(r3)     // Catch: java.lang.Throwable -> L2d
                r5.fulfillConnectPromise(r3, r2)     // Catch: java.lang.Throwable -> L2d
                io.netty.channel.nio.AbstractNioChannel r2 = r5.this$0
                java.util.concurrent.ScheduledFuture r2 = io.netty.channel.nio.AbstractNioChannel.access$400(r2)
                if (r2 == 0) goto L27
            L1e:
                io.netty.channel.nio.AbstractNioChannel r2 = r5.this$0
                java.util.concurrent.ScheduledFuture r2 = io.netty.channel.nio.AbstractNioChannel.access$400(r2)
                r2.cancel(r1)
            L27:
                io.netty.channel.nio.AbstractNioChannel r1 = r5.this$0
                io.netty.channel.nio.AbstractNioChannel.access$202(r1, r0)
                return
            L2d:
                r2 = move-exception
                io.netty.channel.nio.AbstractNioChannel r3 = r5.this$0     // Catch: java.lang.Throwable -> L4a
                io.netty.channel.ChannelPromise r3 = io.netty.channel.nio.AbstractNioChannel.access$200(r3)     // Catch: java.lang.Throwable -> L4a
                io.netty.channel.nio.AbstractNioChannel r4 = r5.this$0     // Catch: java.lang.Throwable -> L4a
                java.net.SocketAddress r4 = io.netty.channel.nio.AbstractNioChannel.access$300(r4)     // Catch: java.lang.Throwable -> L4a
                java.lang.Throwable r2 = r5.annotateConnectException(r2, r4)     // Catch: java.lang.Throwable -> L4a
                r5.fulfillConnectPromise(r3, r2)     // Catch: java.lang.Throwable -> L4a
                io.netty.channel.nio.AbstractNioChannel r2 = r5.this$0
                java.util.concurrent.ScheduledFuture r2 = io.netty.channel.nio.AbstractNioChannel.access$400(r2)
                if (r2 == 0) goto L27
                goto L1e
            L4a:
                r2 = move-exception
                io.netty.channel.nio.AbstractNioChannel r3 = r5.this$0
                java.util.concurrent.ScheduledFuture r3 = io.netty.channel.nio.AbstractNioChannel.access$400(r3)
                if (r3 == 0) goto L5c
                io.netty.channel.nio.AbstractNioChannel r3 = r5.this$0
                java.util.concurrent.ScheduledFuture r3 = io.netty.channel.nio.AbstractNioChannel.access$400(r3)
                r3.cancel(r1)
            L5c:
                io.netty.channel.nio.AbstractNioChannel r1 = r5.this$0
                io.netty.channel.nio.AbstractNioChannel.access$202(r1, r0)
                throw r2
        }

        @Override // io.netty.channel.AbstractChannel.AbstractUnsafe
        protected final void flush0() {
                r1 = this;
                boolean r0 = r1.isFlushPending()
                if (r0 != 0) goto L9
                super.flush0()
            L9:
                return
        }

        @Override // io.netty.channel.nio.AbstractNioChannel.NioUnsafe
        public final void forceFlush() {
                r0 = this;
                super.flush0()
                return
        }

        protected final void removeReadOp() {
                r4 = this;
                io.netty.channel.nio.AbstractNioChannel r0 = r4.this$0
                java.nio.channels.SelectionKey r0 = r0.selectionKey()
                boolean r1 = r0.isValid()
                if (r1 != 0) goto Ld
                goto L1e
            Ld:
                int r1 = r0.interestOps()
                io.netty.channel.nio.AbstractNioChannel r2 = r4.this$0
                int r2 = r2.readInterestOp
                r3 = r1 & r2
                if (r3 == 0) goto L1e
                int r2 = ~r2
                r1 = r1 & r2
                r0.interestOps(r1)
            L1e:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface NioUnsafe extends io.netty.channel.Channel.Unsafe {
        java.nio.channels.SelectableChannel ch();

        void finishConnect();

        void forceFlush();

        void read();
    }

    static {
            java.lang.Class<io.netty.channel.nio.AbstractNioChannel> r0 = io.netty.channel.nio.AbstractNioChannel.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.nio.AbstractNioChannel.logger = r0
            return
    }

    protected AbstractNioChannel(io.netty.channel.Channel r2, java.nio.channels.SelectableChannel r3, int r4) {
            r1 = this;
            r1.<init>(r2)
            io.netty.channel.nio.AbstractNioChannel$1 r2 = new io.netty.channel.nio.AbstractNioChannel$1
            r2.<init>(r1)
            r1.clearReadPendingRunnable = r2
            r1.ch = r3
            r1.readInterestOp = r4
            r2 = 0
            r3.configureBlocking(r2)     // Catch: java.io.IOException -> L13
            return
        L13:
            r2 = move-exception
            r3.close()     // Catch: java.io.IOException -> L18
            goto L28
        L18:
            r3 = move-exception
            io.netty.util.internal.logging.InternalLogger r4 = io.netty.channel.nio.AbstractNioChannel.logger
            boolean r4 = r4.isWarnEnabled()
            if (r4 == 0) goto L28
            io.netty.util.internal.logging.InternalLogger r4 = io.netty.channel.nio.AbstractNioChannel.logger
            java.lang.String r0 = "Failed to close a partially initialized socket."
            r4.warn(r0, r3)
        L28:
            io.netty.channel.ChannelException r3 = new io.netty.channel.ChannelException
            java.lang.String r4 = "Failed to enter non-blocking mode."
            r3.<init>(r4, r2)
            throw r3
    }

    static /* synthetic */ void access$000(io.netty.channel.nio.AbstractNioChannel r0) {
            r0.clearReadPending0()
            return
    }

    static /* synthetic */ void access$100(io.netty.channel.nio.AbstractNioChannel r0, boolean r1) {
            r0.setReadPending0(r1)
            return
    }

    static /* synthetic */ io.netty.channel.ChannelPromise access$200(io.netty.channel.nio.AbstractNioChannel r0) {
            io.netty.channel.ChannelPromise r0 = r0.connectPromise
            return r0
    }

    static /* synthetic */ io.netty.channel.ChannelPromise access$202(io.netty.channel.nio.AbstractNioChannel r0, io.netty.channel.ChannelPromise r1) {
            r0.connectPromise = r1
            return r1
    }

    static /* synthetic */ java.net.SocketAddress access$300(io.netty.channel.nio.AbstractNioChannel r0) {
            java.net.SocketAddress r0 = r0.requestedRemoteAddress
            return r0
    }

    static /* synthetic */ java.net.SocketAddress access$302(io.netty.channel.nio.AbstractNioChannel r0, java.net.SocketAddress r1) {
            r0.requestedRemoteAddress = r1
            return r1
    }

    static /* synthetic */ java.util.concurrent.ScheduledFuture access$400(io.netty.channel.nio.AbstractNioChannel r0) {
            java.util.concurrent.ScheduledFuture<?> r0 = r0.connectTimeoutFuture
            return r0
    }

    static /* synthetic */ java.util.concurrent.ScheduledFuture access$402(io.netty.channel.nio.AbstractNioChannel r0, java.util.concurrent.ScheduledFuture r1) {
            r0.connectTimeoutFuture = r1
            return r1
    }

    private void clearReadPending0() {
            r1 = this;
            r0 = 0
            r1.readPending = r0
            io.netty.channel.nio.AbstractNioChannel$NioUnsafe r0 = r1.unsafe()
            io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe r0 = (io.netty.channel.nio.AbstractNioChannel.AbstractNioUnsafe) r0
            r0.removeReadOp()
            return
    }

    private void setReadPending0(boolean r1) {
            r0 = this;
            r0.readPending = r1
            if (r1 != 0) goto Ld
            io.netty.channel.nio.AbstractNioChannel$NioUnsafe r1 = r0.unsafe()
            io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe r1 = (io.netty.channel.nio.AbstractNioChannel.AbstractNioUnsafe) r1
            r1.removeReadOp()
        Ld:
            return
    }

    protected final void clearReadPending() {
            r2 = this;
            boolean r0 = r2.isRegistered()
            if (r0 == 0) goto L1a
            io.netty.channel.nio.NioEventLoop r0 = r2.eventLoop()
            boolean r1 = r0.inEventLoop()
            if (r1 == 0) goto L14
            r2.clearReadPending0()
            return
        L14:
            java.lang.Runnable r1 = r2.clearReadPendingRunnable
            r0.execute(r1)
            return
        L1a:
            r0 = 0
            r2.readPending = r0
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doBeginRead() throws java.lang.Exception {
            r4 = this;
            java.nio.channels.SelectionKey r0 = r4.selectionKey
            boolean r1 = r0.isValid()
            if (r1 != 0) goto L9
            goto L1a
        L9:
            r1 = 1
            r4.readPending = r1
            int r1 = r0.interestOps()
            int r2 = r4.readInterestOp
            r3 = r1 & r2
            if (r3 != 0) goto L1a
            r1 = r1 | r2
            r0.interestOps(r1)
        L1a:
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doClose() throws java.lang.Exception {
            r3 = this;
            io.netty.channel.ChannelPromise r0 = r3.connectPromise
            r1 = 0
            if (r0 == 0) goto Lf
            java.nio.channels.ClosedChannelException r2 = new java.nio.channels.ClosedChannelException
            r2.<init>()
            r0.tryFailure(r2)
            r3.connectPromise = r1
        Lf:
            java.util.concurrent.ScheduledFuture<?> r0 = r3.connectTimeoutFuture
            if (r0 == 0) goto L19
            r2 = 0
            r0.cancel(r2)
            r3.connectTimeoutFuture = r1
        L19:
            return
    }

    protected abstract boolean doConnect(java.net.SocketAddress r1, java.net.SocketAddress r2) throws java.lang.Exception;

    @Override // io.netty.channel.AbstractChannel
    protected void doDeregister() throws java.lang.Exception {
            r2 = this;
            io.netty.channel.nio.NioEventLoop r0 = r2.eventLoop()
            java.nio.channels.SelectionKey r1 = r2.selectionKey()
            r0.cancel(r1)
            return
    }

    protected abstract void doFinishConnect() throws java.lang.Exception;

    @Override // io.netty.channel.AbstractChannel
    protected void doRegister() throws java.lang.Exception {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            java.nio.channels.SelectableChannel r2 = r4.mo176javaChannel()     // Catch: java.nio.channels.CancelledKeyException -> L15
            io.netty.channel.nio.NioEventLoop r3 = r4.eventLoop()     // Catch: java.nio.channels.CancelledKeyException -> L15
            java.nio.channels.Selector r3 = r3.unwrappedSelector()     // Catch: java.nio.channels.CancelledKeyException -> L15
            java.nio.channels.SelectionKey r2 = r2.register(r3, r0, r4)     // Catch: java.nio.channels.CancelledKeyException -> L15
            r4.selectionKey = r2     // Catch: java.nio.channels.CancelledKeyException -> L15
            return
        L15:
            r2 = move-exception
            if (r1 != 0) goto L21
            io.netty.channel.nio.NioEventLoop r1 = r4.eventLoop()
            r1.selectNow()
            r1 = 1
            goto L2
        L21:
            throw r2
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.EventLoop eventLoop() {
            r1 = this;
            io.netty.channel.nio.NioEventLoop r0 = r1.eventLoop()
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public io.netty.channel.nio.NioEventLoop eventLoop() {
            r1 = this;
            io.netty.channel.EventLoop r0 = super.eventLoop()
            io.netty.channel.nio.NioEventLoop r0 = (io.netty.channel.nio.NioEventLoop) r0
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected boolean isCompatible(io.netty.channel.EventLoop r1) {
            r0 = this;
            boolean r1 = r1 instanceof io.netty.channel.nio.NioEventLoop
            return r1
    }

    @Override // io.netty.channel.Channel
    public boolean isOpen() {
            r1 = this;
            java.nio.channels.SelectableChannel r0 = r1.ch
            boolean r0 = r0.isOpen()
            return r0
    }

    @java.lang.Deprecated
    protected boolean isReadPending() {
            r1 = this;
            boolean r0 = r1.readPending
            return r0
    }

    /* renamed from: javaChannel */
    protected java.nio.channels.SelectableChannel mo176javaChannel() {
            r1 = this;
            java.nio.channels.SelectableChannel r0 = r1.ch
            return r0
    }

    protected final io.netty.buffer.ByteBuf newDirectBuffer(io.netty.buffer.ByteBuf r4) {
            r3 = this;
            int r0 = r4.readableBytes()
            if (r0 != 0) goto Lc
            io.netty.util.ReferenceCountUtil.safeRelease(r4)
            io.netty.buffer.ByteBuf r4 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r4
        Lc:
            io.netty.buffer.ByteBufAllocator r1 = r3.alloc()
            boolean r2 = r1.isDirectBufferPooled()
            if (r2 == 0) goto L25
            io.netty.buffer.ByteBuf r1 = r1.directBuffer(r0)
            int r2 = r4.readerIndex()
            r1.writeBytes(r4, r2, r0)
            io.netty.util.ReferenceCountUtil.safeRelease(r4)
            return r1
        L25:
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.ByteBufUtil.threadLocalDirectBuffer()
            if (r1 == 0) goto L36
            int r2 = r4.readerIndex()
            r1.writeBytes(r4, r2, r0)
            io.netty.util.ReferenceCountUtil.safeRelease(r4)
            return r1
        L36:
            return r4
    }

    protected final io.netty.buffer.ByteBuf newDirectBuffer(io.netty.util.ReferenceCounted r4, io.netty.buffer.ByteBuf r5) {
            r3 = this;
            int r0 = r5.readableBytes()
            if (r0 != 0) goto Lc
            io.netty.util.ReferenceCountUtil.safeRelease(r4)
            io.netty.buffer.ByteBuf r4 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r4
        Lc:
            io.netty.buffer.ByteBufAllocator r1 = r3.alloc()
            boolean r2 = r1.isDirectBufferPooled()
            if (r2 == 0) goto L25
            io.netty.buffer.ByteBuf r1 = r1.directBuffer(r0)
            int r2 = r5.readerIndex()
            r1.writeBytes(r5, r2, r0)
            io.netty.util.ReferenceCountUtil.safeRelease(r4)
            return r1
        L25:
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.ByteBufUtil.threadLocalDirectBuffer()
            if (r1 == 0) goto L36
            int r2 = r5.readerIndex()
            r1.writeBytes(r5, r2, r0)
            io.netty.util.ReferenceCountUtil.safeRelease(r4)
            return r1
        L36:
            if (r4 == r5) goto L3e
            r5.retain()
            io.netty.util.ReferenceCountUtil.safeRelease(r4)
        L3e:
            return r5
    }

    protected java.nio.channels.SelectionKey selectionKey() {
            r1 = this;
            java.nio.channels.SelectionKey r0 = r1.selectionKey
            return r0
    }

    @java.lang.Deprecated
    protected void setReadPending(boolean r3) {
            r2 = this;
            boolean r0 = r2.isRegistered()
            if (r0 == 0) goto L1d
            io.netty.channel.nio.NioEventLoop r0 = r2.eventLoop()
            boolean r1 = r0.inEventLoop()
            if (r1 == 0) goto L14
            r2.setReadPending0(r3)
            return
        L14:
            io.netty.channel.nio.AbstractNioChannel$2 r1 = new io.netty.channel.nio.AbstractNioChannel$2
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
        L1d:
            r2.readPending = r3
            return
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.Channel.Unsafe unsafe() {
            r1 = this;
            io.netty.channel.nio.AbstractNioChannel$NioUnsafe r0 = r1.unsafe()
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public io.netty.channel.nio.AbstractNioChannel.NioUnsafe unsafe() {
            r1 = this;
            io.netty.channel.Channel$Unsafe r0 = super.unsafe()
            io.netty.channel.nio.AbstractNioChannel$NioUnsafe r0 = (io.netty.channel.nio.AbstractNioChannel.NioUnsafe) r0
            return r0
    }
}
