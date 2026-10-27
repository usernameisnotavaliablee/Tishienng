package io.netty.channel.sctp.nio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class NioSctpServerChannel extends io.netty.channel.nio.AbstractNioMessageChannel implements io.netty.channel.sctp.SctpServerChannel {
    private static final io.netty.channel.ChannelMetadata METADATA = null;
    private final io.netty.channel.sctp.SctpServerChannelConfig config;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class NioSctpServerChannelConfig extends io.netty.channel.sctp.DefaultSctpServerChannelConfig {
        final /* synthetic */ io.netty.channel.sctp.nio.NioSctpServerChannel this$0;

        private NioSctpServerChannelConfig(io.netty.channel.sctp.nio.NioSctpServerChannel r1, io.netty.channel.sctp.nio.NioSctpServerChannel r2, com.sun.nio.sctp.SctpServerChannel r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2, r3)
                return
        }

        /* synthetic */ NioSctpServerChannelConfig(io.netty.channel.sctp.nio.NioSctpServerChannel r1, io.netty.channel.sctp.nio.NioSctpServerChannel r2, com.sun.nio.sctp.SctpServerChannel r3, io.netty.channel.sctp.nio.NioSctpServerChannel.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // io.netty.channel.DefaultChannelConfig
        protected void autoReadCleared() {
                r1 = this;
                io.netty.channel.sctp.nio.NioSctpServerChannel r0 = r1.this$0
                io.netty.channel.sctp.nio.NioSctpServerChannel.access$100(r0)
                return
        }
    }

    static {
            io.netty.channel.ChannelMetadata r0 = new io.netty.channel.ChannelMetadata
            r1 = 0
            r2 = 16
            r0.<init>(r1, r2)
            io.netty.channel.sctp.nio.NioSctpServerChannel.METADATA = r0
            return
    }

    public NioSctpServerChannel() {
            r3 = this;
            com.sun.nio.sctp.SctpServerChannel r0 = newSocket()
            r1 = 16
            r2 = 0
            r3.<init>(r2, r0, r1)
            io.netty.channel.sctp.nio.NioSctpServerChannel$NioSctpServerChannelConfig r0 = new io.netty.channel.sctp.nio.NioSctpServerChannel$NioSctpServerChannelConfig
            com.sun.nio.sctp.SctpServerChannel r1 = r3.javaChannel()
            r0.<init>(r3, r3, r1, r2)
            r3.config = r0
            return
    }

    static /* synthetic */ void access$100(io.netty.channel.sctp.nio.NioSctpServerChannel r0) {
            r0.clearReadPending()
            return
    }

    private static com.sun.nio.sctp.SctpServerChannel newSocket() {
            com.sun.nio.sctp.SctpServerChannel r0 = com.sun.nio.sctp.SctpServerChannel.open()     // Catch: java.io.IOException -> L5
            return r0
        L5:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            java.lang.String r2 = "Failed to open a server socket."
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // io.netty.channel.sctp.SctpServerChannel
    public java.util.Set<java.net.InetSocketAddress> allLocalAddresses() {
            r3 = this;
            com.sun.nio.sctp.SctpServerChannel r0 = r3.javaChannel()     // Catch: java.lang.Throwable -> L28
            java.util.Set r0 = r0.getAllLocalAddresses()     // Catch: java.lang.Throwable -> L28
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L28
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L28
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L28
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L28
        L15:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L27
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L28
            java.net.SocketAddress r2 = (java.net.SocketAddress) r2     // Catch: java.lang.Throwable -> L28
            java.net.InetSocketAddress r2 = (java.net.InetSocketAddress) r2     // Catch: java.lang.Throwable -> L28
            r1.add(r2)     // Catch: java.lang.Throwable -> L28
            goto L15
        L27:
            return r1
        L28:
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
    }

    @Override // io.netty.channel.sctp.SctpServerChannel
    public io.netty.channel.ChannelFuture bindAddress(java.net.InetAddress r2) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r2 = r1.bindAddress(r2, r0)
            return r2
    }

    @Override // io.netty.channel.sctp.SctpServerChannel
    public io.netty.channel.ChannelFuture bindAddress(java.net.InetAddress r3, io.netty.channel.ChannelPromise r4) {
            r2 = this;
            io.netty.channel.nio.NioEventLoop r0 = r2.eventLoop()
            boolean r0 = r0.inEventLoop()
            if (r0 == 0) goto L1a
            com.sun.nio.sctp.SctpServerChannel r0 = r2.javaChannel()     // Catch: java.lang.Throwable -> L15
            r0.bindAddress(r3)     // Catch: java.lang.Throwable -> L15
            r4.setSuccess()     // Catch: java.lang.Throwable -> L15
            return r4
        L15:
            r3 = move-exception
            r4.setFailure(r3)
            return r4
        L1a:
            io.netty.channel.nio.NioEventLoop r0 = r2.eventLoop()
            io.netty.channel.sctp.nio.NioSctpServerChannel$1 r1 = new io.netty.channel.sctp.nio.NioSctpServerChannel$1
            r1.<init>(r2, r3, r4)
            r0.execute(r1)
            return r4
    }

    @Override // io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig config() {
            r1 = this;
            io.netty.channel.sctp.SctpServerChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.sctp.SctpServerChannelConfig config() {
            r1 = this;
            io.netty.channel.sctp.SctpServerChannelConfig r0 = r1.config
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doBind(java.net.SocketAddress r3) throws java.lang.Exception {
            r2 = this;
            com.sun.nio.sctp.SctpServerChannel r0 = r2.javaChannel()
            io.netty.channel.sctp.SctpServerChannelConfig r1 = r2.config
            int r1 = r1.getBacklog()
            r0.bind(r3, r1)
            return
    }

    @Override // io.netty.channel.nio.AbstractNioChannel, io.netty.channel.AbstractChannel
    protected void doClose() throws java.lang.Exception {
            r1 = this;
            com.sun.nio.sctp.SctpServerChannel r0 = r1.javaChannel()
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
    protected int doReadMessages(java.util.List<java.lang.Object> r3) throws java.lang.Exception {
            r2 = this;
            com.sun.nio.sctp.SctpServerChannel r0 = r2.javaChannel()
            com.sun.nio.sctp.SctpChannel r0 = r0.accept()
            if (r0 != 0) goto Lc
            r3 = 0
            return r3
        Lc:
            io.netty.channel.sctp.nio.NioSctpChannel r1 = new io.netty.channel.sctp.nio.NioSctpChannel
            r1.<init>(r2, r0)
            r3.add(r1)
            r3 = 1
            return r3
    }

    @Override // io.netty.channel.nio.AbstractNioMessageChannel
    protected boolean doWriteMessage(java.lang.Object r1, io.netty.channel.ChannelOutboundBuffer r2) throws java.lang.Exception {
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
            if (r0 == 0) goto L12
            java.util.Set r0 = r1.allLocalAddresses()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    protected com.sun.nio.sctp.SctpServerChannel javaChannel() {
            r1 = this;
            java.nio.channels.SelectableChannel r0 = super.mo176javaChannel()
            com.sun.nio.sctp.SctpServerChannel r0 = (com.sun.nio.sctp.SctpServerChannel) r0
            return r0
    }

    @Override // io.netty.channel.nio.AbstractNioChannel
    /* renamed from: javaChannel */
    protected /* bridge */ /* synthetic */ java.nio.channels.SelectableChannel mo176javaChannel() {
            r1 = this;
            com.sun.nio.sctp.SctpServerChannel r0 = r1.javaChannel()
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
            r2 = this;
            com.sun.nio.sctp.SctpServerChannel r0 = r2.javaChannel()     // Catch: java.io.IOException -> L19
            java.util.Set r0 = r0.getAllLocalAddresses()     // Catch: java.io.IOException -> L19
            java.util.Iterator r0 = r0.iterator()     // Catch: java.io.IOException -> L19
            boolean r1 = r0.hasNext()     // Catch: java.io.IOException -> L19
            if (r1 == 0) goto L19
            java.lang.Object r0 = r0.next()     // Catch: java.io.IOException -> L19
            java.net.SocketAddress r0 = (java.net.SocketAddress) r0     // Catch: java.io.IOException -> L19
            return r0
        L19:
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.ChannelMetadata metadata() {
            r1 = this;
            io.netty.channel.ChannelMetadata r0 = io.netty.channel.sctp.nio.NioSctpServerChannel.METADATA
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

    @Override // io.netty.channel.sctp.SctpServerChannel
    public io.netty.channel.ChannelFuture unbindAddress(java.net.InetAddress r2) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r2 = r1.unbindAddress(r2, r0)
            return r2
    }

    @Override // io.netty.channel.sctp.SctpServerChannel
    public io.netty.channel.ChannelFuture unbindAddress(java.net.InetAddress r3, io.netty.channel.ChannelPromise r4) {
            r2 = this;
            io.netty.channel.nio.NioEventLoop r0 = r2.eventLoop()
            boolean r0 = r0.inEventLoop()
            if (r0 == 0) goto L1a
            com.sun.nio.sctp.SctpServerChannel r0 = r2.javaChannel()     // Catch: java.lang.Throwable -> L15
            r0.unbindAddress(r3)     // Catch: java.lang.Throwable -> L15
            r4.setSuccess()     // Catch: java.lang.Throwable -> L15
            return r4
        L15:
            r3 = move-exception
            r4.setFailure(r3)
            return r4
        L1a:
            io.netty.channel.nio.NioEventLoop r0 = r2.eventLoop()
            io.netty.channel.sctp.nio.NioSctpServerChannel$2 r1 = new io.netty.channel.sctp.nio.NioSctpServerChannel$2
            r1.<init>(r2, r3, r4)
            r0.execute(r1)
            return r4
    }
}
