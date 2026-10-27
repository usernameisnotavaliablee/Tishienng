package io.netty.channel.kqueue;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class KQueueServerSocketChannel extends io.netty.channel.kqueue.AbstractKQueueServerChannel implements io.netty.channel.socket.ServerSocketChannel {
    private final io.netty.channel.kqueue.KQueueServerSocketChannelConfig config;

    public KQueueServerSocketChannel() {
            r2 = this;
            io.netty.channel.kqueue.BsdSocket r0 = io.netty.channel.kqueue.BsdSocket.newSocketStream()
            r1 = 0
            r2.<init>(r0, r1)
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r0 = new io.netty.channel.kqueue.KQueueServerSocketChannelConfig
            r0.<init>(r2)
            r2.config = r0
            return
    }

    public KQueueServerSocketChannel(int r2) {
            r1 = this;
            io.netty.channel.kqueue.BsdSocket r0 = new io.netty.channel.kqueue.BsdSocket
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    KQueueServerSocketChannel(io.netty.channel.kqueue.BsdSocket r1) {
            r0 = this;
            r0.<init>(r1)
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = new io.netty.channel.kqueue.KQueueServerSocketChannelConfig
            r1.<init>(r0)
            r0.config = r1
            return
    }

    KQueueServerSocketChannel(io.netty.channel.kqueue.BsdSocket r1, boolean r2) {
            r0 = this;
            r0.<init>(r1, r2)
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = new io.netty.channel.kqueue.KQueueServerSocketChannelConfig
            r1.<init>(r0)
            r0.config = r1
            return
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig config() {
            r1 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueChannelConfig config() {
            r1 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.Channel
    public io.netty.channel.kqueue.KQueueServerSocketChannelConfig config() {
            r1 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r0 = r1.config
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig config() {
            r1 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.AbstractChannel
    protected void doBind(java.net.SocketAddress r2) throws java.lang.Exception {
            r1 = this;
            super.doBind(r2)
            io.netty.channel.kqueue.BsdSocket r2 = r1.socket
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r0 = r1.config
            int r0 = r0.getBacklog()
            r2.listen(r0)
            r2 = 1
            r1.active = r2
            return
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueServerChannel, io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.AbstractChannel
    protected boolean isCompatible(io.netty.channel.EventLoop r1) {
            r0 = this;
            boolean r1 = r1 instanceof io.netty.channel.kqueue.KQueueEventLoop
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

    @Override // io.netty.channel.kqueue.AbstractKQueueServerChannel
    protected io.netty.channel.Channel newChildChannel(int r3, byte[] r4, int r5, int r6) throws java.lang.Exception {
            r2 = this;
            io.netty.channel.kqueue.KQueueSocketChannel r0 = new io.netty.channel.kqueue.KQueueSocketChannel
            io.netty.channel.kqueue.BsdSocket r1 = new io.netty.channel.kqueue.BsdSocket
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
}
