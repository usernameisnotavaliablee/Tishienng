package io.netty.channel.epoll;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class EpollServerSocketChannel extends io.netty.channel.epoll.AbstractEpollServerChannel implements io.netty.channel.socket.ServerSocketChannel {
    private final io.netty.channel.epoll.EpollServerSocketChannelConfig config;
    private volatile java.util.Collection<java.net.InetAddress> tcpMd5SigAddresses;

    public EpollServerSocketChannel() {
            r2 = this;
            io.netty.channel.epoll.LinuxSocket r0 = io.netty.channel.epoll.LinuxSocket.newSocketStream()
            r1 = 0
            r2.<init>(r0, r1)
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r2.tcpMd5SigAddresses = r0
            io.netty.channel.epoll.EpollServerSocketChannelConfig r0 = new io.netty.channel.epoll.EpollServerSocketChannelConfig
            r0.<init>(r2)
            r2.config = r0
            return
    }

    public EpollServerSocketChannel(int r2) {
            r1 = this;
            io.netty.channel.epoll.LinuxSocket r0 = new io.netty.channel.epoll.LinuxSocket
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    EpollServerSocketChannel(io.netty.channel.epoll.LinuxSocket r1) {
            r0 = this;
            r0.<init>(r1)
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            r0.tcpMd5SigAddresses = r1
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = new io.netty.channel.epoll.EpollServerSocketChannelConfig
            r1.<init>(r0)
            r0.config = r1
            return
    }

    EpollServerSocketChannel(io.netty.channel.epoll.LinuxSocket r1, boolean r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            r0.tcpMd5SigAddresses = r1
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = new io.netty.channel.epoll.EpollServerSocketChannelConfig
            r1.<init>(r0)
            r0.config = r1
            return
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig config() {
            r1 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig config() {
            r1 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.Channel
    public io.netty.channel.epoll.EpollServerSocketChannelConfig config() {
            r1 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r0 = r1.config
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig config() {
            r1 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.AbstractChannel
    protected void doBind(java.net.SocketAddress r2) throws java.lang.Exception {
            r1 = this;
            super.doBind(r2)
            boolean r2 = io.netty.channel.epoll.Native.IS_SUPPORTING_TCP_FASTOPEN
            if (r2 == 0) goto L1a
            io.netty.channel.epoll.EpollServerSocketChannelConfig r2 = r1.config
            int r2 = r2.getTcpFastopen()
            if (r2 <= 0) goto L1a
            io.netty.channel.epoll.LinuxSocket r2 = r1.socket
            io.netty.channel.epoll.EpollServerSocketChannelConfig r0 = r1.config
            int r0 = r0.getTcpFastopen()
            r2.setTcpFastOpen(r0)
        L1a:
            io.netty.channel.epoll.LinuxSocket r2 = r1.socket
            io.netty.channel.epoll.EpollServerSocketChannelConfig r0 = r1.config
            int r0 = r0.getBacklog()
            r2.listen(r0)
            r2 = 1
            r1.active = r2
            return
    }

    @Override // io.netty.channel.epoll.AbstractEpollServerChannel, io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.AbstractChannel
    protected boolean isCompatible(io.netty.channel.EventLoop r1) {
            r0 = this;
            boolean r1 = r1 instanceof io.netty.channel.epoll.EpollEventLoop
            return r1
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

    @Override // io.netty.channel.epoll.AbstractEpollServerChannel
    protected io.netty.channel.Channel newChildChannel(int r3, byte[] r4, int r5, int r6) throws java.lang.Exception {
            r2 = this;
            io.netty.channel.epoll.EpollSocketChannel r0 = new io.netty.channel.epoll.EpollSocketChannel
            io.netty.channel.epoll.LinuxSocket r1 = new io.netty.channel.epoll.LinuxSocket
            r1.<init>(r3)
            java.net.InetSocketAddress r3 = io.netty.channel.unix.NativeInetAddress.address(r4, r5, r6)
            r0.<init>(r2, r1, r3)
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

    void setTcpMd5Sig(java.util.Map<java.net.InetAddress, byte[]> r2) throws java.io.IOException {
            r1 = this;
            java.util.Collection<java.net.InetAddress> r0 = r1.tcpMd5SigAddresses
            java.util.Collection r2 = io.netty.channel.epoll.TcpMd5Util.newTcpMd5Sigs(r1, r0, r2)
            r1.tcpMd5SigAddresses = r2
            return
    }

    java.util.Collection<java.net.InetAddress> tcpMd5SigAddresses() {
            r1 = this;
            java.util.Collection<java.net.InetAddress> r0 = r1.tcpMd5SigAddresses
            return r0
    }
}
