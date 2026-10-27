package io.netty.channel.socket.nio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class NioServerSocketChannel extends io.netty.channel.nio.AbstractNioMessageChannel implements io.netty.channel.socket.ServerSocketChannel {
    private static final java.nio.channels.spi.SelectorProvider DEFAULT_SELECTOR_PROVIDER = null;
    private static final io.netty.channel.ChannelMetadata METADATA = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.channel.socket.ServerSocketChannelConfig config;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.channel.socket.nio.NioServerSocketChannel$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class NioServerSocketChannelConfig extends io.netty.channel.socket.DefaultServerSocketChannelConfig {
        final /* synthetic */ io.netty.channel.socket.nio.NioServerSocketChannel this$0;

        private NioServerSocketChannelConfig(io.netty.channel.socket.nio.NioServerSocketChannel r1, io.netty.channel.socket.nio.NioServerSocketChannel r2, java.net.ServerSocket r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2, r3)
                return
        }

        /* synthetic */ NioServerSocketChannelConfig(io.netty.channel.socket.nio.NioServerSocketChannel r1, io.netty.channel.socket.nio.NioServerSocketChannel r2, java.net.ServerSocket r3, io.netty.channel.socket.nio.NioServerSocketChannel.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        private java.nio.channels.ServerSocketChannel jdkChannel() {
                r1 = this;
                io.netty.channel.Channel r0 = r1.channel
                io.netty.channel.socket.nio.NioServerSocketChannel r0 = (io.netty.channel.socket.nio.NioServerSocketChannel) r0
                java.nio.channels.ServerSocketChannel r0 = r0.mo176javaChannel()
                return r0
        }

        @Override // io.netty.channel.DefaultChannelConfig
        protected void autoReadCleared() {
                r1 = this;
                io.netty.channel.socket.nio.NioServerSocketChannel r0 = r1.this$0
                io.netty.channel.socket.nio.NioServerSocketChannel.access$100(r0)
                return
        }

        @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
        public <T> T getOption(io.netty.channel.ChannelOption<T> r3) {
                r2 = this;
                int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
                r1 = 7
                if (r0 < r1) goto L16
                boolean r0 = r3 instanceof io.netty.channel.socket.nio.NioChannelOption
                if (r0 == 0) goto L16
                java.nio.channels.ServerSocketChannel r0 = r2.jdkChannel()
                io.netty.channel.socket.nio.NioChannelOption r3 = (io.netty.channel.socket.nio.NioChannelOption) r3
                java.lang.Object r3 = io.netty.channel.socket.nio.NioChannelOption.getOption(r0, r3)
                return r3
            L16:
                java.lang.Object r3 = super.getOption(r3)
                return r3
        }

        @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
        public java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> getOptions() {
                r2 = this;
                int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
                r1 = 7
                if (r0 < r1) goto L18
                java.util.Map r0 = super.getOptions()
                java.nio.channels.ServerSocketChannel r1 = r2.jdkChannel()
                io.netty.channel.ChannelOption[] r1 = io.netty.channel.socket.nio.NioChannelOption.getOptions(r1)
                java.util.Map r0 = r2.getOptions(r0, r1)
                return r0
            L18:
                java.util.Map r0 = super.getOptions()
                return r0
        }

        @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
        public <T> boolean setOption(io.netty.channel.ChannelOption<T> r3, T r4) {
                r2 = this;
                int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
                r1 = 7
                if (r0 < r1) goto L16
                boolean r0 = r3 instanceof io.netty.channel.socket.nio.NioChannelOption
                if (r0 == 0) goto L16
                java.nio.channels.ServerSocketChannel r0 = r2.jdkChannel()
                io.netty.channel.socket.nio.NioChannelOption r3 = (io.netty.channel.socket.nio.NioChannelOption) r3
                boolean r3 = io.netty.channel.socket.nio.NioChannelOption.setOption(r0, r3, r4)
                return r3
            L16:
                boolean r3 = super.setOption(r3, r4)
                return r3
        }
    }

    static {
            io.netty.channel.ChannelMetadata r0 = new io.netty.channel.ChannelMetadata
            r1 = 0
            r2 = 16
            r0.<init>(r1, r2)
            io.netty.channel.socket.nio.NioServerSocketChannel.METADATA = r0
            java.nio.channels.spi.SelectorProvider r0 = java.nio.channels.spi.SelectorProvider.provider()
            io.netty.channel.socket.nio.NioServerSocketChannel.DEFAULT_SELECTOR_PROVIDER = r0
            java.lang.Class<io.netty.channel.socket.nio.NioServerSocketChannel> r0 = io.netty.channel.socket.nio.NioServerSocketChannel.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.socket.nio.NioServerSocketChannel.logger = r0
            return
    }

    public NioServerSocketChannel() {
            r1 = this;
            java.nio.channels.spi.SelectorProvider r0 = io.netty.channel.socket.nio.NioServerSocketChannel.DEFAULT_SELECTOR_PROVIDER
            java.nio.channels.ServerSocketChannel r0 = newSocket(r0)
            r1.<init>(r0)
            return
    }

    public NioServerSocketChannel(java.nio.channels.ServerSocketChannel r3) {
            r2 = this;
            r0 = 16
            r1 = 0
            r2.<init>(r1, r3, r0)
            io.netty.channel.socket.nio.NioServerSocketChannel$NioServerSocketChannelConfig r3 = new io.netty.channel.socket.nio.NioServerSocketChannel$NioServerSocketChannelConfig
            java.nio.channels.ServerSocketChannel r0 = r2.mo176javaChannel()
            java.net.ServerSocket r0 = r0.socket()
            r3.<init>(r2, r2, r0, r1)
            r2.config = r3
            return
    }

    public NioServerSocketChannel(java.nio.channels.spi.SelectorProvider r1) {
            r0 = this;
            java.nio.channels.ServerSocketChannel r1 = newSocket(r1)
            r0.<init>(r1)
            return
    }

    static /* synthetic */ void access$100(io.netty.channel.socket.nio.NioServerSocketChannel r0) {
            r0.clearReadPending()
            return
    }

    private static java.nio.channels.ServerSocketChannel newSocket(java.nio.channels.spi.SelectorProvider r2) {
            java.nio.channels.ServerSocketChannel r2 = r2.openServerSocketChannel()     // Catch: java.io.IOException -> L5
            return r2
        L5:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            java.lang.String r1 = "Failed to open a server socket."
            r0.<init>(r1, r2)
            throw r0
    }

    @Override // io.netty.channel.nio.AbstractNioMessageChannel
    protected boolean closeOnReadError(java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = super.closeOnReadError(r1)
            return r1
    }

    @Override // io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig config() {
            r1 = this;
            io.netty.channel.socket.ServerSocketChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.socket.ServerSocketChannelConfig config() {
            r1 = this;
            io.netty.channel.socket.ServerSocketChannelConfig r0 = r1.config
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doBind(java.net.SocketAddress r3) throws java.lang.Exception {
            r2 = this;
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto L15
            java.nio.channels.ServerSocketChannel r0 = r2.mo176javaChannel()
            io.netty.channel.socket.ServerSocketChannelConfig r1 = r2.config
            int r1 = r1.getBacklog()
            io.netty.channel.socket.nio.n.a(r0, r3, r1)
            return
        L15:
            java.nio.channels.ServerSocketChannel r0 = r2.mo176javaChannel()
            java.net.ServerSocket r0 = r0.socket()
            io.netty.channel.socket.ServerSocketChannelConfig r1 = r2.config
            int r1 = r1.getBacklog()
            r0.bind(r3, r1)
            return
    }

    @Override // io.netty.channel.nio.AbstractNioChannel, io.netty.channel.AbstractChannel
    protected void doClose() throws java.lang.Exception {
            r1 = this;
            java.nio.channels.ServerSocketChannel r0 = r1.mo176javaChannel()
            r0.close()
            return
    }

    @Override // io.netty.channel.nio.AbstractNioChannel
    protected boolean doConnect(java.net.SocketAddress r1, java.net.SocketAddress r2) throws java.lang.Exception {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doDisconnect() throws java.lang.Exception {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.channel.nio.AbstractNioChannel
    protected void doFinishConnect() throws java.lang.Exception {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.channel.nio.AbstractNioMessageChannel
    protected int doReadMessages(java.util.List<java.lang.Object> r4) throws java.lang.Exception {
            r3 = this;
            java.nio.channels.ServerSocketChannel r0 = r3.mo176javaChannel()
            java.nio.channels.SocketChannel r0 = io.netty.util.internal.SocketUtils.accept(r0)
            if (r0 == 0) goto L28
            io.netty.channel.socket.nio.NioSocketChannel r1 = new io.netty.channel.socket.nio.NioSocketChannel     // Catch: java.lang.Throwable -> L14
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L14
            r4.add(r1)     // Catch: java.lang.Throwable -> L14
            r4 = 1
            return r4
        L14:
            r4 = move-exception
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.channel.socket.nio.NioServerSocketChannel.logger
            java.lang.String r2 = "Failed to create a new channel from an accepted socket."
            r1.warn(r2, r4)
            r0.close()     // Catch: java.lang.Throwable -> L20
            goto L28
        L20:
            r4 = move-exception
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.socket.nio.NioServerSocketChannel.logger
            java.lang.String r1 = "Failed to close a socket."
            r0.warn(r1, r4)
        L28:
            r4 = 0
            return r4
    }

    @Override // io.netty.channel.nio.AbstractNioMessageChannel
    protected boolean doWriteMessage(java.lang.Object r1, io.netty.channel.ChannelOutboundBuffer r2) throws java.lang.Exception {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.channel.AbstractChannel
    protected final java.lang.Object filterOutboundMessage(java.lang.Object r1) throws java.lang.Exception {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.channel.Channel
    public boolean isActive() {
            r1 = this;
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L16
            java.nio.channels.ServerSocketChannel r0 = r1.mo176javaChannel()
            java.net.ServerSocket r0 = r0.socket()
            boolean r0 = r0.isBound()
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.nio.AbstractNioChannel
    /* renamed from: javaChannel */
    protected /* bridge */ /* synthetic */ java.nio.channels.SelectableChannel mo176javaChannel() {
            r1 = this;
            java.nio.channels.ServerSocketChannel r0 = r1.mo176javaChannel()
            return r0
    }

    @Override // io.netty.channel.nio.AbstractNioChannel
    /* renamed from: javaChannel */
    protected java.nio.channels.ServerSocketChannel mo176javaChannel() {
            r1 = this;
            java.nio.channels.SelectableChannel r0 = super.mo176javaChannel()
            java.nio.channels.ServerSocketChannel r0 = (java.nio.channels.ServerSocketChannel) r0
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
            java.nio.channels.ServerSocketChannel r0 = r1.mo176javaChannel()
            java.net.ServerSocket r0 = r0.socket()
            java.net.SocketAddress r0 = io.netty.util.internal.SocketUtils.localSocketAddress(r0)
            return r0
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.ChannelMetadata metadata() {
            r1 = this;
            io.netty.channel.ChannelMetadata r0 = io.netty.channel.socket.nio.NioServerSocketChannel.METADATA
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public java.net.InetSocketAddress remoteAddress() {
            r1 = this;
            r0 = 0
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
            r0 = 0
            return r0
    }
}
