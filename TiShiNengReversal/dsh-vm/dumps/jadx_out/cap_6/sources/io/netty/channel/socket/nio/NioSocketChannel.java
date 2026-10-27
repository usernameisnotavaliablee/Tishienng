package io.netty.channel.socket.nio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class NioSocketChannel extends io.netty.channel.nio.AbstractNioByteChannel implements io.netty.channel.socket.SocketChannel {
    private static final java.nio.channels.spi.SelectorProvider DEFAULT_SELECTOR_PROVIDER = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.channel.socket.SocketChannelConfig config;





    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class NioSocketChannelConfig extends io.netty.channel.socket.DefaultSocketChannelConfig {
        private volatile int maxBytesPerGatheringWrite;
        final /* synthetic */ io.netty.channel.socket.nio.NioSocketChannel this$0;

        private NioSocketChannelConfig(io.netty.channel.socket.nio.NioSocketChannel r1, io.netty.channel.socket.nio.NioSocketChannel r2, java.net.Socket r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2, r3)
                r1 = 2147483647(0x7fffffff, float:NaN)
                r0.maxBytesPerGatheringWrite = r1
                r0.calculateMaxBytesPerGatheringWrite()
                return
        }

        /* synthetic */ NioSocketChannelConfig(io.netty.channel.socket.nio.NioSocketChannel r1, io.netty.channel.socket.nio.NioSocketChannel r2, java.net.Socket r3, io.netty.channel.socket.nio.NioSocketChannel.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        private void calculateMaxBytesPerGatheringWrite() {
                r1 = this;
                int r0 = r1.getSendBufferSize()
                int r0 = r0 << 1
                if (r0 <= 0) goto L11
                int r0 = r1.getSendBufferSize()
                int r0 = r0 << 1
                r1.setMaxBytesPerGatheringWrite(r0)
            L11:
                return
        }

        private java.nio.channels.SocketChannel jdkChannel() {
                r1 = this;
                io.netty.channel.Channel r0 = r1.channel
                io.netty.channel.socket.nio.NioSocketChannel r0 = (io.netty.channel.socket.nio.NioSocketChannel) r0
                java.nio.channels.SocketChannel r0 = r0.mo176javaChannel()
                return r0
        }

        @Override // io.netty.channel.DefaultChannelConfig
        protected void autoReadCleared() {
                r1 = this;
                io.netty.channel.socket.nio.NioSocketChannel r0 = r1.this$0
                io.netty.channel.socket.nio.NioSocketChannel.access$600(r0)
                return
        }

        int getMaxBytesPerGatheringWrite() {
                r1 = this;
                int r0 = r1.maxBytesPerGatheringWrite
                return r0
        }

        @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
        public <T> T getOption(io.netty.channel.ChannelOption<T> r3) {
                r2 = this;
                int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
                r1 = 7
                if (r0 < r1) goto L16
                boolean r0 = r3 instanceof io.netty.channel.socket.nio.NioChannelOption
                if (r0 == 0) goto L16
                java.nio.channels.SocketChannel r0 = r2.jdkChannel()
                io.netty.channel.socket.nio.NioChannelOption r3 = (io.netty.channel.socket.nio.NioChannelOption) r3
                java.lang.Object r3 = io.netty.channel.socket.nio.NioChannelOption.getOption(r0, r3)
                return r3
            L16:
                java.lang.Object r3 = super.getOption(r3)
                return r3
        }

        @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
        public java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> getOptions() {
                r2 = this;
                int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
                r1 = 7
                if (r0 < r1) goto L18
                java.util.Map r0 = super.getOptions()
                java.nio.channels.SocketChannel r1 = r2.jdkChannel()
                io.netty.channel.ChannelOption[] r1 = io.netty.channel.socket.nio.NioChannelOption.getOptions(r1)
                java.util.Map r0 = r2.getOptions(r0, r1)
                return r0
            L18:
                java.util.Map r0 = super.getOptions()
                return r0
        }

        void setMaxBytesPerGatheringWrite(int r1) {
                r0 = this;
                r0.maxBytesPerGatheringWrite = r1
                return
        }

        @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
        public <T> boolean setOption(io.netty.channel.ChannelOption<T> r3, T r4) {
                r2 = this;
                int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
                r1 = 7
                if (r0 < r1) goto L16
                boolean r0 = r3 instanceof io.netty.channel.socket.nio.NioChannelOption
                if (r0 == 0) goto L16
                java.nio.channels.SocketChannel r0 = r2.jdkChannel()
                io.netty.channel.socket.nio.NioChannelOption r3 = (io.netty.channel.socket.nio.NioChannelOption) r3
                boolean r3 = io.netty.channel.socket.nio.NioChannelOption.setOption(r0, r3, r4)
                return r3
            L16:
                boolean r3 = super.setOption(r3, r4)
                return r3
        }

        @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.socket.SocketChannelConfig
        public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setSendBufferSize(int r1) {
                r0 = this;
                io.netty.channel.socket.nio.NioSocketChannel$NioSocketChannelConfig r1 = r0.setSendBufferSize(r1)
                return r1
        }

        @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.socket.SocketChannelConfig
        public io.netty.channel.socket.nio.NioSocketChannel.NioSocketChannelConfig setSendBufferSize(int r1) {
                r0 = this;
                super.setSendBufferSize(r1)
                r0.calculateMaxBytesPerGatheringWrite()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class NioSocketChannelUnsafe extends io.netty.channel.nio.AbstractNioByteChannel.NioByteUnsafe {
        final /* synthetic */ io.netty.channel.socket.nio.NioSocketChannel this$0;

        private NioSocketChannelUnsafe(io.netty.channel.socket.nio.NioSocketChannel r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        /* synthetic */ NioSocketChannelUnsafe(io.netty.channel.socket.nio.NioSocketChannel r1, io.netty.channel.socket.nio.NioSocketChannel.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.netty.channel.AbstractChannel.AbstractUnsafe
        protected java.util.concurrent.Executor prepareToClose() {
                r1 = this;
                io.netty.channel.socket.nio.NioSocketChannel r0 = r1.this$0     // Catch: java.lang.Throwable -> L20
                java.nio.channels.SocketChannel r0 = r0.mo176javaChannel()     // Catch: java.lang.Throwable -> L20
                boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L20
                if (r0 == 0) goto L20
                io.netty.channel.socket.nio.NioSocketChannel r0 = r1.this$0     // Catch: java.lang.Throwable -> L20
                io.netty.channel.socket.SocketChannelConfig r0 = r0.config()     // Catch: java.lang.Throwable -> L20
                int r0 = r0.getSoLinger()     // Catch: java.lang.Throwable -> L20
                if (r0 <= 0) goto L20
                io.netty.channel.socket.nio.NioSocketChannel r0 = r1.this$0     // Catch: java.lang.Throwable -> L20
                io.netty.channel.socket.nio.NioSocketChannel.access$500(r0)     // Catch: java.lang.Throwable -> L20
                io.netty.util.concurrent.GlobalEventExecutor r0 = io.netty.util.concurrent.GlobalEventExecutor.INSTANCE     // Catch: java.lang.Throwable -> L20
                return r0
            L20:
                r0 = 0
                return r0
        }
    }

    static {
            java.lang.Class<io.netty.channel.socket.nio.NioSocketChannel> r0 = io.netty.channel.socket.nio.NioSocketChannel.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.socket.nio.NioSocketChannel.logger = r0
            java.nio.channels.spi.SelectorProvider r0 = java.nio.channels.spi.SelectorProvider.provider()
            io.netty.channel.socket.nio.NioSocketChannel.DEFAULT_SELECTOR_PROVIDER = r0
            return
    }

    public NioSocketChannel() {
            r1 = this;
            java.nio.channels.spi.SelectorProvider r0 = io.netty.channel.socket.nio.NioSocketChannel.DEFAULT_SELECTOR_PROVIDER
            r1.<init>(r0)
            return
    }

    public NioSocketChannel(io.netty.channel.Channel r2, java.nio.channels.SocketChannel r3) {
            r1 = this;
            r1.<init>(r2, r3)
            io.netty.channel.socket.nio.NioSocketChannel$NioSocketChannelConfig r2 = new io.netty.channel.socket.nio.NioSocketChannel$NioSocketChannelConfig
            java.net.Socket r3 = r3.socket()
            r0 = 0
            r2.<init>(r1, r1, r3, r0)
            r1.config = r2
            return
    }

    public NioSocketChannel(java.nio.channels.SocketChannel r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public NioSocketChannel(java.nio.channels.spi.SelectorProvider r1) {
            r0 = this;
            java.nio.channels.SocketChannel r1 = newSocket(r1)
            r0.<init>(r1)
            return
    }

    static /* synthetic */ void access$100(io.netty.channel.socket.nio.NioSocketChannel r0, io.netty.channel.ChannelPromise r1) {
            r0.shutdownInput0(r1)
            return
    }

    static /* synthetic */ void access$200(io.netty.channel.socket.nio.NioSocketChannel r0, io.netty.channel.ChannelFuture r1, io.netty.channel.ChannelPromise r2) {
            r0.shutdownOutputDone(r1, r2)
            return
    }

    static /* synthetic */ void access$300(io.netty.channel.ChannelFuture r0, io.netty.channel.ChannelFuture r1, io.netty.channel.ChannelPromise r2) {
            shutdownDone(r0, r1, r2)
            return
    }

    static /* synthetic */ void access$500(io.netty.channel.socket.nio.NioSocketChannel r0) throws java.lang.Exception {
            r0.doDeregister()
            return
    }

    static /* synthetic */ void access$600(io.netty.channel.socket.nio.NioSocketChannel r0) {
            r0.clearReadPending()
            return
    }

    private void adjustMaxBytesPerGatheringWrite(int r1, int r2, int r3) {
            r0 = this;
            if (r1 != r2) goto Le
            int r1 = r1 << 1
            if (r1 <= r3) goto L1d
            io.netty.channel.socket.SocketChannelConfig r2 = r0.config
            io.netty.channel.socket.nio.NioSocketChannel$NioSocketChannelConfig r2 = (io.netty.channel.socket.nio.NioSocketChannel.NioSocketChannelConfig) r2
            r2.setMaxBytesPerGatheringWrite(r1)
            return
        Le:
            r3 = 4096(0x1000, float:5.74E-42)
            if (r1 <= r3) goto L1d
            int r1 = r1 >>> 1
            if (r2 >= r1) goto L1d
            io.netty.channel.socket.SocketChannelConfig r2 = r0.config
            io.netty.channel.socket.nio.NioSocketChannel$NioSocketChannelConfig r2 = (io.netty.channel.socket.nio.NioSocketChannel.NioSocketChannelConfig) r2
            r2.setMaxBytesPerGatheringWrite(r1)
        L1d:
            return
    }

    private void doBind0(java.net.SocketAddress r3) throws java.lang.Exception {
            r2 = this;
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto Lf
            java.nio.channels.SocketChannel r0 = r2.mo176javaChannel()
            io.netty.util.internal.SocketUtils.bind(r0, r3)
            return
        Lf:
            java.nio.channels.SocketChannel r0 = r2.mo176javaChannel()
            java.net.Socket r0 = r0.socket()
            io.netty.util.internal.SocketUtils.bind(r0, r3)
            return
    }

    private static java.nio.channels.SocketChannel newSocket(java.nio.channels.spi.SelectorProvider r2) {
            java.nio.channels.SocketChannel r2 = r2.openSocketChannel()     // Catch: java.io.IOException -> L5
            return r2
        L5:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            java.lang.String r1 = "Failed to open a socket."
            r0.<init>(r1, r2)
            throw r0
    }

    private static void shutdownDone(io.netty.channel.ChannelFuture r2, io.netty.channel.ChannelFuture r3, io.netty.channel.ChannelPromise r4) {
            java.lang.Throwable r2 = r2.cause()
            java.lang.Throwable r3 = r3.cause()
            if (r2 == 0) goto L17
            if (r3 == 0) goto L13
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.socket.nio.NioSocketChannel.logger
            java.lang.String r1 = "Exception suppressed because a previous exception occurred."
            r0.debug(r1, r3)
        L13:
            r4.setFailure(r2)
            return
        L17:
            if (r3 == 0) goto L1d
            r4.setFailure(r3)
            return
        L1d:
            r4.setSuccess()
            return
    }

    private void shutdownInput0() throws java.lang.Exception {
            r2 = this;
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto Lf
            java.nio.channels.SocketChannel r0 = r2.mo176javaChannel()
            io.netty.channel.socket.nio.p.a(r0)
            return
        Lf:
            java.nio.channels.SocketChannel r0 = r2.mo176javaChannel()
            java.net.Socket r0 = r0.socket()
            r0.shutdownInput()
            return
    }

    private void shutdownInput0(io.netty.channel.ChannelPromise r2) {
            r1 = this;
            r1.shutdownInput0()     // Catch: java.lang.Throwable -> L7
            r2.setSuccess()     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r0 = move-exception
            r2.setFailure(r0)
            return
    }

    private void shutdownOutputDone(io.netty.channel.ChannelFuture r3, io.netty.channel.ChannelPromise r4) {
            r2 = this;
            io.netty.channel.ChannelFuture r0 = r2.shutdownInput()
            boolean r1 = r0.isDone()
            if (r1 == 0) goto Le
            shutdownDone(r3, r0, r4)
            return
        Le:
            io.netty.channel.socket.nio.NioSocketChannel$4 r1 = new io.netty.channel.socket.nio.NioSocketChannel$4
            r1.<init>(r2, r3, r4)
            r0.addListener(r1)
            return
    }

    @Override // io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig config() {
            r1 = this;
            io.netty.channel.socket.SocketChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.socket.SocketChannelConfig config() {
            r1 = this;
            io.netty.channel.socket.SocketChannelConfig r0 = r1.config
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doBind(java.net.SocketAddress r1) throws java.lang.Exception {
            r0 = this;
            r0.doBind0(r1)
            return
    }

    @Override // io.netty.channel.nio.AbstractNioChannel, io.netty.channel.AbstractChannel
    protected void doClose() throws java.lang.Exception {
            r1 = this;
            super.doClose()
            java.nio.channels.SocketChannel r0 = r1.mo176javaChannel()
            r0.close()
            return
    }

    @Override // io.netty.channel.nio.AbstractNioChannel
    protected boolean doConnect(java.net.SocketAddress r2, java.net.SocketAddress r3) throws java.lang.Exception {
            r1 = this;
            if (r3 == 0) goto L5
            r1.doBind0(r3)
        L5:
            java.nio.channels.SocketChannel r3 = r1.mo176javaChannel()     // Catch: java.lang.Throwable -> L19
            boolean r2 = io.netty.util.internal.SocketUtils.connect(r3, r2)     // Catch: java.lang.Throwable -> L19
            if (r2 != 0) goto L1b
            java.nio.channels.SelectionKey r3 = r1.selectionKey()     // Catch: java.lang.Throwable -> L19
            r0 = 8
            r3.interestOps(r0)     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r2 = move-exception
            goto L1c
        L1b:
            return r2
        L1c:
            r1.doClose()
            throw r2
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doDisconnect() throws java.lang.Exception {
            r0 = this;
            r0.doClose()
            return
    }

    @Override // io.netty.channel.nio.AbstractNioChannel
    protected void doFinishConnect() throws java.lang.Exception {
            r1 = this;
            java.nio.channels.SocketChannel r0 = r1.mo176javaChannel()
            boolean r0 = r0.finishConnect()
            if (r0 == 0) goto Lb
            return
        Lb:
            java.lang.Error r0 = new java.lang.Error
            r0.<init>()
            throw r0
    }

    @Override // io.netty.channel.nio.AbstractNioByteChannel
    protected int doReadBytes(io.netty.buffer.ByteBuf r3) throws java.lang.Exception {
            r2 = this;
            io.netty.channel.nio.AbstractNioChannel$NioUnsafe r0 = r2.unsafe()
            io.netty.channel.RecvByteBufAllocator$Handle r0 = r0.recvBufAllocHandle()
            int r1 = r3.writableBytes()
            r0.attemptedBytesRead(r1)
            java.nio.channels.SocketChannel r1 = r2.mo176javaChannel()
            int r0 = r0.attemptedBytesRead()
            int r3 = r3.writeBytes(r1, r0)
            return r3
    }

    @Override // io.netty.channel.AbstractChannel
    protected final void doShutdownOutput() throws java.lang.Exception {
            r2 = this;
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto Lf
            java.nio.channels.SocketChannel r0 = r2.mo176javaChannel()
            io.netty.channel.socket.nio.o.a(r0)
            return
        Lf:
            java.nio.channels.SocketChannel r0 = r2.mo176javaChannel()
            java.net.Socket r0 = r0.socket()
            r0.shutdownOutput()
            return
    }

    @Override // io.netty.channel.nio.AbstractNioByteChannel, io.netty.channel.AbstractChannel
    protected void doWrite(io.netty.channel.ChannelOutboundBuffer r13) throws java.lang.Exception {
            r12 = this;
            java.nio.channels.SocketChannel r0 = r12.mo176javaChannel()
            io.netty.channel.socket.SocketChannelConfig r1 = r12.config()
            int r1 = r1.getWriteSpinCount()
        Lc:
            boolean r2 = r13.isEmpty()
            if (r2 == 0) goto L16
            r12.clearOpWrite()
            return
        L16:
            io.netty.channel.socket.SocketChannelConfig r2 = r12.config
            io.netty.channel.socket.nio.NioSocketChannel$NioSocketChannelConfig r2 = (io.netty.channel.socket.nio.NioSocketChannel.NioSocketChannelConfig) r2
            int r2 = r2.getMaxBytesPerGatheringWrite()
            r3 = 1024(0x400, float:1.435E-42)
            long r4 = (long) r2
            java.nio.ByteBuffer[] r3 = r13.nioBuffers(r3, r4)
            int r4 = r13.nioBufferCount()
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L64
            if (r4 == r6) goto L4c
            long r7 = r13.nioBufferSize()
            long r3 = r0.write(r3, r5, r4)
            r9 = 0
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 > 0) goto L41
            r12.incompleteWrite(r6)
            return
        L41:
            int r8 = (int) r7
            int r7 = (int) r3
            r12.adjustMaxBytesPerGatheringWrite(r8, r7, r2)
            r13.removeBytes(r3)
        L49:
            int r1 = r1 + (-1)
            goto L69
        L4c:
            r3 = r3[r5]
            int r4 = r3.remaining()
            int r3 = r0.write(r3)
            if (r3 > 0) goto L5c
            r12.incompleteWrite(r6)
            return
        L5c:
            r12.adjustMaxBytesPerGatheringWrite(r4, r3, r2)
            long r2 = (long) r3
            r13.removeBytes(r2)
            goto L49
        L64:
            int r2 = r12.doWrite0(r13)
            int r1 = r1 - r2
        L69:
            if (r1 > 0) goto Lc
            if (r1 >= 0) goto L6e
            r5 = 1
        L6e:
            r12.incompleteWrite(r5)
            return
    }

    @Override // io.netty.channel.nio.AbstractNioByteChannel
    protected int doWriteBytes(io.netty.buffer.ByteBuf r3) throws java.lang.Exception {
            r2 = this;
            int r0 = r3.readableBytes()
            java.nio.channels.SocketChannel r1 = r2.mo176javaChannel()
            int r3 = r3.readBytes(r1, r0)
            return r3
    }

    @Override // io.netty.channel.nio.AbstractNioByteChannel
    protected long doWriteFileRegion(io.netty.channel.FileRegion r4) throws java.lang.Exception {
            r3 = this;
            long r0 = r4.transferred()
            java.nio.channels.SocketChannel r2 = r3.mo176javaChannel()
            long r0 = r4.transferTo(r2, r0)
            return r0
    }

    @Override // io.netty.channel.Channel
    public boolean isActive() {
            r2 = this;
            java.nio.channels.SocketChannel r0 = r2.mo176javaChannel()
            boolean r1 = r0.isOpen()
            if (r1 == 0) goto L12
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.socket.DuplexChannel
    public boolean isInputShutdown() {
            r1 = this;
            java.nio.channels.SocketChannel r0 = r1.mo176javaChannel()
            java.net.Socket r0 = r0.socket()
            boolean r0 = r0.isInputShutdown()
            if (r0 != 0) goto L17
            boolean r0 = r1.isActive()
            if (r0 != 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    @Override // io.netty.channel.nio.AbstractNioByteChannel
    protected boolean isInputShutdown0() {
            r1 = this;
            boolean r0 = r1.isInputShutdown()
            return r0
    }

    @Override // io.netty.channel.socket.DuplexChannel
    public boolean isOutputShutdown() {
            r1 = this;
            java.nio.channels.SocketChannel r0 = r1.mo176javaChannel()
            java.net.Socket r0 = r0.socket()
            boolean r0 = r0.isOutputShutdown()
            if (r0 != 0) goto L17
            boolean r0 = r1.isActive()
            if (r0 != 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    @Override // io.netty.channel.socket.DuplexChannel
    public boolean isShutdown() {
            r2 = this;
            java.nio.channels.SocketChannel r0 = r2.mo176javaChannel()
            java.net.Socket r0 = r0.socket()
            boolean r1 = r0.isInputShutdown()
            if (r1 == 0) goto L14
            boolean r0 = r0.isOutputShutdown()
            if (r0 != 0) goto L1a
        L14:
            boolean r0 = r2.isActive()
            if (r0 != 0) goto L1c
        L1a:
            r0 = 1
            return r0
        L1c:
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.nio.AbstractNioChannel
    /* renamed from: javaChannel */
    protected /* bridge */ /* synthetic */ java.nio.channels.SelectableChannel mo176javaChannel() {
            r1 = this;
            java.nio.channels.SocketChannel r0 = r1.mo176javaChannel()
            return r0
    }

    @Override // io.netty.channel.nio.AbstractNioChannel
    /* renamed from: javaChannel */
    protected java.nio.channels.SocketChannel mo176javaChannel() {
            r1 = this;
            java.nio.channels.SelectableChannel r0 = super.mo176javaChannel()
            java.nio.channels.SocketChannel r0 = (java.nio.channels.SocketChannel) r0
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public java.net.InetSocketAddress localAddress() {
            r1 = this;
            java.net.SocketAddress r0 = super.localAddress()
            java.net.InetSocketAddress r0 = (java.net.InetSocketAddress) r0
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ java.net.SocketAddress localAddress() {
            r1 = this;
            java.net.InetSocketAddress r0 = r1.localAddress()
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected java.net.SocketAddress localAddress0() {
            r1 = this;
            java.nio.channels.SocketChannel r0 = r1.mo176javaChannel()
            java.net.Socket r0 = r0.socket()
            java.net.SocketAddress r0 = r0.getLocalSocketAddress()
            return r0
    }

    @Override // io.netty.channel.nio.AbstractNioByteChannel, io.netty.channel.AbstractChannel
    protected /* bridge */ /* synthetic */ io.netty.channel.AbstractChannel.AbstractUnsafe newUnsafe() {
            r1 = this;
            io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe r0 = r1.newUnsafe()
            return r0
    }

    @Override // io.netty.channel.nio.AbstractNioByteChannel, io.netty.channel.AbstractChannel
    protected io.netty.channel.nio.AbstractNioChannel.AbstractNioUnsafe newUnsafe() {
            r2 = this;
            io.netty.channel.socket.nio.NioSocketChannel$NioSocketChannelUnsafe r0 = new io.netty.channel.socket.nio.NioSocketChannel$NioSocketChannelUnsafe
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.Channel parent() {
            r1 = this;
            io.netty.channel.socket.ServerSocketChannel r0 = r1.parent()
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public io.netty.channel.socket.ServerSocketChannel parent() {
            r1 = this;
            io.netty.channel.Channel r0 = super.parent()
            io.netty.channel.socket.ServerSocketChannel r0 = (io.netty.channel.socket.ServerSocketChannel) r0
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public java.net.InetSocketAddress remoteAddress() {
            r1 = this;
            java.net.SocketAddress r0 = super.remoteAddress()
            java.net.InetSocketAddress r0 = (java.net.InetSocketAddress) r0
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ java.net.SocketAddress remoteAddress() {
            r1 = this;
            java.net.InetSocketAddress r0 = r1.remoteAddress()
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected java.net.SocketAddress remoteAddress0() {
            r1 = this;
            java.nio.channels.SocketChannel r0 = r1.mo176javaChannel()
            java.net.Socket r0 = r0.socket()
            java.net.SocketAddress r0 = r0.getRemoteSocketAddress()
            return r0
    }

    @Override // io.netty.channel.socket.DuplexChannel
    public io.netty.channel.ChannelFuture shutdown() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r0 = r1.shutdown(r0)
            return r0
    }

    @Override // io.netty.channel.socket.DuplexChannel
    public io.netty.channel.ChannelFuture shutdown(io.netty.channel.ChannelPromise r3) {
            r2 = this;
            io.netty.channel.ChannelFuture r0 = r2.shutdownOutput()
            boolean r1 = r0.isDone()
            if (r1 == 0) goto Le
            r2.shutdownOutputDone(r0, r3)
            return r3
        Le:
            io.netty.channel.socket.nio.NioSocketChannel$3 r1 = new io.netty.channel.socket.nio.NioSocketChannel$3
            r1.<init>(r2, r3)
            r0.addListener(r1)
            return r3
    }

    @Override // io.netty.channel.nio.AbstractNioByteChannel, io.netty.channel.socket.DuplexChannel
    public io.netty.channel.ChannelFuture shutdownInput() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r0 = r1.shutdownInput(r0)
            return r0
    }

    @Override // io.netty.channel.socket.DuplexChannel
    public io.netty.channel.ChannelFuture shutdownInput(io.netty.channel.ChannelPromise r3) {
            r2 = this;
            io.netty.channel.nio.NioEventLoop r0 = r2.eventLoop()
            boolean r1 = r0.inEventLoop()
            if (r1 == 0) goto Le
            r2.shutdownInput0(r3)
            return r3
        Le:
            io.netty.channel.socket.nio.NioSocketChannel$2 r1 = new io.netty.channel.socket.nio.NioSocketChannel$2
            r1.<init>(r2, r3)
            r0.execute(r1)
            return r3
    }

    @Override // io.netty.channel.socket.DuplexChannel
    public io.netty.channel.ChannelFuture shutdownOutput() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r0 = r1.shutdownOutput(r0)
            return r0
    }

    @Override // io.netty.channel.socket.DuplexChannel
    public io.netty.channel.ChannelFuture shutdownOutput(io.netty.channel.ChannelPromise r3) {
            r2 = this;
            io.netty.channel.nio.NioEventLoop r0 = r2.eventLoop()
            boolean r1 = r0.inEventLoop()
            if (r1 == 0) goto L14
            io.netty.channel.nio.AbstractNioChannel$NioUnsafe r0 = r2.unsafe()
            io.netty.channel.AbstractChannel$AbstractUnsafe r0 = (io.netty.channel.AbstractChannel.AbstractUnsafe) r0
            r0.shutdownOutput(r3)
            return r3
        L14:
            io.netty.channel.socket.nio.NioSocketChannel$1 r1 = new io.netty.channel.socket.nio.NioSocketChannel$1
            r1.<init>(r2, r3)
            r0.execute(r1)
            return r3
    }
}
