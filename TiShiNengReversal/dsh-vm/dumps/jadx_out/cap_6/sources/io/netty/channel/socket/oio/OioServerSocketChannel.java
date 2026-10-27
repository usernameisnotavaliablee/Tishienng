package io.netty.channel.socket.oio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class OioServerSocketChannel extends io.netty.channel.oio.AbstractOioMessageChannel implements io.netty.channel.socket.ServerSocketChannel {
    private static final io.netty.channel.ChannelMetadata METADATA = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.channel.socket.oio.OioServerSocketChannelConfig config;
    final java.util.concurrent.locks.Lock shutdownLock;
    final java.net.ServerSocket socket;

    static {
            java.lang.Class<io.netty.channel.socket.oio.OioServerSocketChannel> r0 = io.netty.channel.socket.oio.OioServerSocketChannel.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.socket.oio.OioServerSocketChannel.logger = r0
            io.netty.channel.ChannelMetadata r0 = new io.netty.channel.ChannelMetadata
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2)
            io.netty.channel.socket.oio.OioServerSocketChannel.METADATA = r0
            return
    }

    public OioServerSocketChannel() {
            r1 = this;
            java.net.ServerSocket r0 = newServerSocket()
            r1.<init>(r0)
            return
    }

    public OioServerSocketChannel(java.net.ServerSocket r4) {
            r3 = this;
            r0 = 0
            r3.<init>(r0)
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r3.shutdownLock = r0
            if (r4 == 0) goto L3c
            r0 = 1000(0x3e8, float:1.401E-42)
            r4.setSoTimeout(r0)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            r3.socket = r4
            io.netty.channel.socket.oio.DefaultOioServerSocketChannelConfig r0 = new io.netty.channel.socket.oio.DefaultOioServerSocketChannelConfig
            r0.<init>(r3, r4)
            r3.config = r0
            return
        L1c:
            r0 = move-exception
            goto L27
        L1e:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "Failed to set the server socket timeout."
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L1c
            throw r1     // Catch: java.lang.Throwable -> L1c
        L27:
            r4.close()     // Catch: java.io.IOException -> L2b
            goto L3b
        L2b:
            r4 = move-exception
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.channel.socket.oio.OioServerSocketChannel.logger
            boolean r1 = r1.isWarnEnabled()
            if (r1 == 0) goto L3b
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.channel.socket.oio.OioServerSocketChannel.logger
            java.lang.String r2 = "Failed to close a partially initialized socket."
            r1.warn(r2, r4)
        L3b:
            throw r0
        L3c:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "socket"
            r4.<init>(r0)
            throw r4
    }

    private static java.net.ServerSocket newServerSocket() {
            java.net.ServerSocket r0 = new java.net.ServerSocket     // Catch: java.io.IOException -> L6
            r0.<init>()     // Catch: java.io.IOException -> L6
            return r0
        L6:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            java.lang.String r2 = "failed to create a server socket"
            r1.<init>(r2, r0)
            throw r1
    }

    final void clearReadPending0() {
            r0 = this;
            super.clearReadPending()
            return
    }

    @Override // io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig config() {
            r1 = this;
            io.netty.channel.socket.oio.OioServerSocketChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig config() {
            r1 = this;
            io.netty.channel.socket.oio.OioServerSocketChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.socket.oio.OioServerSocketChannelConfig config() {
            r1 = this;
            io.netty.channel.socket.oio.OioServerSocketChannelConfig r0 = r1.config
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doBind(java.net.SocketAddress r3) throws java.lang.Exception {
            r2 = this;
            java.net.ServerSocket r0 = r2.socket
            io.netty.channel.socket.oio.OioServerSocketChannelConfig r1 = r2.config
            int r1 = r1.getBacklog()
            r0.bind(r3, r1)
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doClose() throws java.lang.Exception {
            r1 = this;
            java.net.ServerSocket r0 = r1.socket
            r0.close()
            return
    }

    @Override // io.netty.channel.oio.AbstractOioChannel
    protected void doConnect(java.net.SocketAddress r1, java.net.SocketAddress r2) throws java.lang.Exception {
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

    @Override // io.netty.channel.oio.AbstractOioMessageChannel
    protected int doReadMessages(java.util.List<java.lang.Object> r4) throws java.lang.Exception {
            r3 = this;
            java.net.ServerSocket r0 = r3.socket
            boolean r0 = r0.isClosed()
            if (r0 == 0) goto La
            r4 = -1
            return r4
        La:
            java.net.ServerSocket r0 = r3.socket     // Catch: java.net.SocketTimeoutException -> L2e
            java.net.Socket r0 = r0.accept()     // Catch: java.net.SocketTimeoutException -> L2e
            io.netty.channel.socket.oio.OioSocketChannel r1 = new io.netty.channel.socket.oio.OioSocketChannel     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L1a
            r4.add(r1)     // Catch: java.lang.Throwable -> L1a
            r4 = 1
            return r4
        L1a:
            r4 = move-exception
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.channel.socket.oio.OioServerSocketChannel.logger     // Catch: java.net.SocketTimeoutException -> L2e
            java.lang.String r2 = "Failed to create a new channel from an accepted socket."
            r1.warn(r2, r4)     // Catch: java.net.SocketTimeoutException -> L2e
            r0.close()     // Catch: java.lang.Throwable -> L26
            goto L2e
        L26:
            r4 = move-exception
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.socket.oio.OioServerSocketChannel.logger     // Catch: java.net.SocketTimeoutException -> L2e
            java.lang.String r1 = "Failed to close a socket."
            r0.warn(r1, r4)     // Catch: java.net.SocketTimeoutException -> L2e
        L2e:
            r4 = 0
            return r4
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doWrite(io.netty.channel.ChannelOutboundBuffer r1) throws java.lang.Exception {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.channel.AbstractChannel
    protected java.lang.Object filterOutboundMessage(java.lang.Object r1) throws java.lang.Exception {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.channel.Channel
    public boolean isActive() {
            r1 = this;
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L10
            java.net.ServerSocket r0 = r1.socket
            boolean r0 = r0.isBound()
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.Channel
    public boolean isOpen() {
            r1 = this;
            java.net.ServerSocket r0 = r1.socket
            boolean r0 = r0.isClosed()
            r0 = r0 ^ 1
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
            java.net.ServerSocket r0 = r1.socket
            java.net.SocketAddress r0 = io.netty.util.internal.SocketUtils.localSocketAddress(r0)
            return r0
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.ChannelMetadata metadata() {
            r1 = this;
            io.netty.channel.ChannelMetadata r0 = io.netty.channel.socket.oio.OioServerSocketChannel.METADATA
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

    @Override // io.netty.channel.oio.AbstractOioChannel
    @java.lang.Deprecated
    protected void setReadPending(boolean r1) {
            r0 = this;
            super.setReadPending(r1)
            return
    }
}
