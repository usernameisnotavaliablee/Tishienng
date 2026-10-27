package io.netty.channel.epoll;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class EpollServerDomainSocketChannel extends io.netty.channel.epoll.AbstractEpollServerChannel implements io.netty.channel.unix.ServerDomainSocketChannel {
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.channel.epoll.EpollServerChannelConfig config;
    private volatile io.netty.channel.unix.DomainSocketAddress local;

    static {
            java.lang.Class<io.netty.channel.epoll.EpollServerDomainSocketChannel> r0 = io.netty.channel.epoll.EpollServerDomainSocketChannel.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.epoll.EpollServerDomainSocketChannel.logger = r0
            return
    }

    public EpollServerDomainSocketChannel() {
            r2 = this;
            io.netty.channel.epoll.LinuxSocket r0 = io.netty.channel.epoll.LinuxSocket.newSocketDomain()
            r1 = 0
            r2.<init>(r0, r1)
            io.netty.channel.epoll.EpollServerChannelConfig r0 = new io.netty.channel.epoll.EpollServerChannelConfig
            r0.<init>(r2)
            r2.config = r0
            return
    }

    public EpollServerDomainSocketChannel(int r1) {
            r0 = this;
            r0.<init>(r1)
            io.netty.channel.epoll.EpollServerChannelConfig r1 = new io.netty.channel.epoll.EpollServerChannelConfig
            r1.<init>(r0)
            r0.config = r1
            return
    }

    EpollServerDomainSocketChannel(io.netty.channel.epoll.LinuxSocket r1) {
            r0 = this;
            r0.<init>(r1)
            io.netty.channel.epoll.EpollServerChannelConfig r1 = new io.netty.channel.epoll.EpollServerChannelConfig
            r1.<init>(r0)
            r0.config = r1
            return
    }

    EpollServerDomainSocketChannel(io.netty.channel.epoll.LinuxSocket r1, boolean r2) {
            r0 = this;
            r0.<init>(r1, r2)
            io.netty.channel.epoll.EpollServerChannelConfig r1 = new io.netty.channel.epoll.EpollServerChannelConfig
            r1.<init>(r0)
            r0.config = r1
            return
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig config() {
            r1 = this;
            io.netty.channel.epoll.EpollServerChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig config() {
            r1 = this;
            io.netty.channel.epoll.EpollServerChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.Channel
    public io.netty.channel.epoll.EpollServerChannelConfig config() {
            r1 = this;
            io.netty.channel.epoll.EpollServerChannelConfig r0 = r1.config
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.AbstractChannel
    protected void doBind(java.net.SocketAddress r3) throws java.lang.Exception {
            r2 = this;
            io.netty.channel.epoll.LinuxSocket r0 = r2.socket
            r0.bind(r3)
            io.netty.channel.epoll.LinuxSocket r0 = r2.socket
            io.netty.channel.epoll.EpollServerChannelConfig r1 = r2.config
            int r1 = r1.getBacklog()
            r0.listen(r1)
            io.netty.channel.unix.DomainSocketAddress r3 = (io.netty.channel.unix.DomainSocketAddress) r3
            r2.local = r3
            r3 = 1
            r2.active = r3
            return
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.AbstractChannel
    protected void doClose() throws java.lang.Exception {
            r5 = this;
            java.lang.String r0 = "Failed to delete a domain socket file: {}"
            super.doClose()     // Catch: java.lang.Throwable -> L28
            io.netty.channel.unix.DomainSocketAddress r1 = r5.local
            if (r1 == 0) goto L27
            java.io.File r2 = new java.io.File
            java.lang.String r3 = r1.path()
            r2.<init>(r3)
            boolean r2 = r2.delete()
            if (r2 != 0) goto L27
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.channel.epoll.EpollServerDomainSocketChannel.logger
            boolean r3 = r2.isDebugEnabled()
            if (r3 == 0) goto L27
            java.lang.String r1 = r1.path()
            r2.debug(r0, r1)
        L27:
            return
        L28:
            r1 = move-exception
            io.netty.channel.unix.DomainSocketAddress r2 = r5.local
            if (r2 == 0) goto L4b
            java.io.File r3 = new java.io.File
            java.lang.String r4 = r2.path()
            r3.<init>(r4)
            boolean r3 = r3.delete()
            if (r3 != 0) goto L4b
            io.netty.util.internal.logging.InternalLogger r3 = io.netty.channel.epoll.EpollServerDomainSocketChannel.logger
            boolean r4 = r3.isDebugEnabled()
            if (r4 == 0) goto L4b
            java.lang.String r2 = r2.path()
            r3.debug(r0, r2)
        L4b:
            throw r1
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public io.netty.channel.unix.DomainSocketAddress localAddress() {
            r1 = this;
            java.net.SocketAddress r0 = super.localAddress()
            io.netty.channel.unix.DomainSocketAddress r0 = (io.netty.channel.unix.DomainSocketAddress) r0
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ java.net.SocketAddress localAddress() {
            r1 = this;
            io.netty.channel.unix.DomainSocketAddress r0 = r1.localAddress()
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.AbstractChannel
    protected io.netty.channel.unix.DomainSocketAddress localAddress0() {
            r1 = this;
            io.netty.channel.unix.DomainSocketAddress r0 = r1.local
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.AbstractChannel
    protected /* bridge */ /* synthetic */ java.net.SocketAddress localAddress0() {
            r1 = this;
            io.netty.channel.unix.DomainSocketAddress r0 = r1.localAddress0()
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollServerChannel
    protected io.netty.channel.Channel newChildChannel(int r1, byte[] r2, int r3, int r4) throws java.lang.Exception {
            r0 = this;
            io.netty.channel.epoll.EpollDomainSocketChannel r2 = new io.netty.channel.epoll.EpollDomainSocketChannel
            io.netty.channel.unix.Socket r3 = new io.netty.channel.unix.Socket
            r3.<init>(r1)
            r2.<init>(r0, r3)
            return r2
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public io.netty.channel.unix.DomainSocketAddress remoteAddress() {
            r1 = this;
            java.net.SocketAddress r0 = super.remoteAddress()
            io.netty.channel.unix.DomainSocketAddress r0 = (io.netty.channel.unix.DomainSocketAddress) r0
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ java.net.SocketAddress remoteAddress() {
            r1 = this;
            io.netty.channel.unix.DomainSocketAddress r0 = r1.remoteAddress()
            return r0
    }
}
