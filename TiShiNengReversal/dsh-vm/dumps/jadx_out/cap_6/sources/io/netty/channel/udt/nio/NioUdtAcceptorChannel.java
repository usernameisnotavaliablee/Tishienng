package io.netty.channel.udt.nio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class NioUdtAcceptorChannel extends io.netty.channel.nio.AbstractNioMessageChannel implements io.netty.channel.udt.UdtServerChannel {
    private static final io.netty.channel.ChannelMetadata METADATA = null;
    protected static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.channel.udt.UdtServerChannelConfig config;

    static {
            java.lang.Class<io.netty.channel.udt.nio.NioUdtAcceptorChannel> r0 = io.netty.channel.udt.nio.NioUdtAcceptorChannel.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.udt.nio.NioUdtAcceptorChannel.logger = r0
            io.netty.channel.ChannelMetadata r0 = new io.netty.channel.ChannelMetadata
            r1 = 0
            r2 = 16
            r0.<init>(r1, r2)
            io.netty.channel.udt.nio.NioUdtAcceptorChannel.METADATA = r0
            return
    }

    protected NioUdtAcceptorChannel(com.barchart.udt.TypeUDT r1) {
            r0 = this;
            com.barchart.udt.nio.ServerSocketChannelUDT r1 = io.netty.channel.udt.nio.NioUdtProvider.newAcceptorChannelUDT(r1)
            r0.<init>(r1)
            return
    }

    protected NioUdtAcceptorChannel(com.barchart.udt.nio.ServerSocketChannelUDT r4) {
            r3 = this;
            r0 = 0
            r1 = 16
            r3.<init>(r0, r4, r1)
            r0 = 0
            r4.configureBlocking(r0)     // Catch: java.lang.Exception -> L13
            io.netty.channel.udt.DefaultUdtServerChannelConfig r0 = new io.netty.channel.udt.DefaultUdtServerChannelConfig     // Catch: java.lang.Exception -> L13
            r1 = 1
            r0.<init>(r3, r4, r1)     // Catch: java.lang.Exception -> L13
            r3.config = r0     // Catch: java.lang.Exception -> L13
            return
        L13:
            r0 = move-exception
            r4.close()     // Catch: java.lang.Exception -> L18
            goto L28
        L18:
            r4 = move-exception
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.channel.udt.nio.NioUdtAcceptorChannel.logger
            boolean r1 = r1.isWarnEnabled()
            if (r1 == 0) goto L28
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.channel.udt.nio.NioUdtAcceptorChannel.logger
            java.lang.String r2 = "Failed to close channel."
            r1.warn(r2, r4)
        L28:
            io.netty.channel.ChannelException r4 = new io.netty.channel.ChannelException
            java.lang.String r1 = "Failed to configure channel."
            r4.<init>(r1, r0)
            throw r4
    }

    @Override // io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig config() {
            r1 = this;
            io.netty.channel.udt.UdtServerChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.udt.UdtChannelConfig config() {
            r1 = this;
            io.netty.channel.udt.UdtServerChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.udt.UdtServerChannelConfig config() {
            r1 = this;
            io.netty.channel.udt.UdtServerChannelConfig r0 = r1.config
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doBind(java.net.SocketAddress r3) throws java.lang.Exception {
            r2 = this;
            com.barchart.udt.nio.ServerSocketChannelUDT r0 = r2.javaChannel()
            com.barchart.udt.nio.NioServerSocketUDT r0 = r0.socket()
            io.netty.channel.udt.UdtServerChannelConfig r1 = r2.config
            int r1 = r1.getBacklog()
            r0.bind(r3, r1)
            return
    }

    @Override // io.netty.channel.nio.AbstractNioChannel, io.netty.channel.AbstractChannel
    protected void doClose() throws java.lang.Exception {
            r1 = this;
            com.barchart.udt.nio.ServerSocketChannelUDT r0 = r1.javaChannel()
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
    protected int doReadMessages(java.util.List<java.lang.Object> r2) throws java.lang.Exception {
            r1 = this;
            com.barchart.udt.nio.ServerSocketChannelUDT r0 = r1.javaChannel()
            java.nio.channels.SocketChannel r0 = io.netty.util.internal.SocketUtils.accept(r0)
            com.barchart.udt.nio.SocketChannelUDT r0 = (com.barchart.udt.nio.SocketChannelUDT) r0
            if (r0 != 0) goto Le
            r2 = 0
            return r2
        Le:
            io.netty.channel.udt.UdtChannel r0 = r1.newConnectorChannel(r0)
            r2.add(r0)
            r2 = 1
            return r2
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
            com.barchart.udt.nio.ServerSocketChannelUDT r0 = r1.javaChannel()
            com.barchart.udt.nio.NioServerSocketUDT r0 = r0.socket()
            boolean r0 = r0.isBound()
            return r0
    }

    protected com.barchart.udt.nio.ServerSocketChannelUDT javaChannel() {
            r1 = this;
            java.nio.channels.SelectableChannel r0 = super.mo176javaChannel()
            com.barchart.udt.nio.ServerSocketChannelUDT r0 = (com.barchart.udt.nio.ServerSocketChannelUDT) r0
            return r0
    }

    @Override // io.netty.channel.nio.AbstractNioChannel
    /* renamed from: javaChannel */
    protected /* bridge */ /* synthetic */ java.nio.channels.SelectableChannel mo176javaChannel() {
            r1 = this;
            com.barchart.udt.nio.ServerSocketChannelUDT r0 = r1.javaChannel()
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
            com.barchart.udt.nio.ServerSocketChannelUDT r0 = r1.javaChannel()
            com.barchart.udt.nio.NioServerSocketUDT r0 = r0.socket()
            java.net.SocketAddress r0 = io.netty.util.internal.SocketUtils.localSocketAddress(r0)
            return r0
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.ChannelMetadata metadata() {
            r1 = this;
            io.netty.channel.ChannelMetadata r0 = io.netty.channel.udt.nio.NioUdtAcceptorChannel.METADATA
            return r0
    }

    protected abstract io.netty.channel.udt.UdtChannel newConnectorChannel(com.barchart.udt.nio.SocketChannelUDT r1);

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
