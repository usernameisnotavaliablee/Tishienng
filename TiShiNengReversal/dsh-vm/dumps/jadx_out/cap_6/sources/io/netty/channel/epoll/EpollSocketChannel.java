package io.netty.channel.epoll;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class EpollSocketChannel extends io.netty.channel.epoll.AbstractEpollStreamChannel implements io.netty.channel.socket.SocketChannel {
    private final io.netty.channel.epoll.EpollSocketChannelConfig config;
    private volatile java.util.Collection<java.net.InetAddress> tcpMd5SigAddresses;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.channel.epoll.EpollSocketChannel$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class EpollSocketChannelUnsafe extends io.netty.channel.epoll.AbstractEpollStreamChannel.EpollStreamUnsafe {
        final /* synthetic */ io.netty.channel.epoll.EpollSocketChannel this$0;

        private EpollSocketChannelUnsafe(io.netty.channel.epoll.EpollSocketChannel r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        /* synthetic */ EpollSocketChannelUnsafe(io.netty.channel.epoll.EpollSocketChannel r1, io.netty.channel.epoll.EpollSocketChannel.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.netty.channel.epoll.AbstractEpollStreamChannel.EpollStreamUnsafe, io.netty.channel.AbstractChannel.AbstractUnsafe
        protected java.util.concurrent.Executor prepareToClose() {
                r2 = this;
                io.netty.channel.epoll.EpollSocketChannel r0 = r2.this$0     // Catch: java.lang.Throwable -> L24
                boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L24
                if (r0 == 0) goto L24
                io.netty.channel.epoll.EpollSocketChannel r0 = r2.this$0     // Catch: java.lang.Throwable -> L24
                io.netty.channel.epoll.EpollSocketChannelConfig r0 = r0.config()     // Catch: java.lang.Throwable -> L24
                int r0 = r0.getSoLinger()     // Catch: java.lang.Throwable -> L24
                if (r0 <= 0) goto L24
                io.netty.channel.epoll.EpollSocketChannel r0 = r2.this$0     // Catch: java.lang.Throwable -> L24
                io.netty.channel.EventLoop r0 = r0.eventLoop()     // Catch: java.lang.Throwable -> L24
                io.netty.channel.epoll.EpollEventLoop r0 = (io.netty.channel.epoll.EpollEventLoop) r0     // Catch: java.lang.Throwable -> L24
                io.netty.channel.epoll.EpollSocketChannel r1 = r2.this$0     // Catch: java.lang.Throwable -> L24
                r0.remove(r1)     // Catch: java.lang.Throwable -> L24
                io.netty.util.concurrent.GlobalEventExecutor r0 = io.netty.util.concurrent.GlobalEventExecutor.INSTANCE     // Catch: java.lang.Throwable -> L24
                return r0
            L24:
                r0 = 0
                return r0
        }
    }

    public EpollSocketChannel() {
            r2 = this;
            io.netty.channel.epoll.LinuxSocket r0 = io.netty.channel.epoll.LinuxSocket.newSocketStream()
            r1 = 0
            r2.<init>(r0, r1)
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r2.tcpMd5SigAddresses = r0
            io.netty.channel.epoll.EpollSocketChannelConfig r0 = new io.netty.channel.epoll.EpollSocketChannelConfig
            r0.<init>(r2)
            r2.config = r0
            return
    }

    public EpollSocketChannel(int r1) {
            r0 = this;
            r0.<init>(r1)
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            r0.tcpMd5SigAddresses = r1
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = new io.netty.channel.epoll.EpollSocketChannelConfig
            r1.<init>(r0)
            r0.config = r1
            return
    }

    EpollSocketChannel(io.netty.channel.Channel r1, io.netty.channel.epoll.LinuxSocket r2, java.net.InetSocketAddress r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            r0.tcpMd5SigAddresses = r2
            io.netty.channel.epoll.EpollSocketChannelConfig r2 = new io.netty.channel.epoll.EpollSocketChannelConfig
            r2.<init>(r0)
            r0.config = r2
            boolean r2 = r1 instanceof io.netty.channel.epoll.EpollServerSocketChannel
            if (r2 == 0) goto L1a
            io.netty.channel.epoll.EpollServerSocketChannel r1 = (io.netty.channel.epoll.EpollServerSocketChannel) r1
            java.util.Collection r1 = r1.tcpMd5SigAddresses()
            r0.tcpMd5SigAddresses = r1
        L1a:
            return
    }

    EpollSocketChannel(io.netty.channel.epoll.LinuxSocket r1, boolean r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            r0.tcpMd5SigAddresses = r1
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = new io.netty.channel.epoll.EpollSocketChannelConfig
            r1.<init>(r0)
            r0.config = r1
            return
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig config() {
            r1 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig config() {
            r1 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.Channel
    public io.netty.channel.epoll.EpollSocketChannelConfig config() {
            r1 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r0 = r1.config
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig config() {
            r1 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r0 = r1.config()
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

    @Override // io.netty.channel.epoll.AbstractEpollStreamChannel, io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.AbstractChannel
    protected /* bridge */ /* synthetic */ io.netty.channel.AbstractChannel.AbstractUnsafe newUnsafe() {
            r1 = this;
            io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe r0 = r1.newUnsafe()
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollStreamChannel, io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.AbstractChannel
    protected io.netty.channel.epoll.AbstractEpollChannel.AbstractEpollUnsafe newUnsafe() {
            r2 = this;
            io.netty.channel.epoll.EpollSocketChannel$EpollSocketChannelUnsafe r0 = new io.netty.channel.epoll.EpollSocketChannel$EpollSocketChannelUnsafe
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

    void setTcpMd5Sig(java.util.Map<java.net.InetAddress, byte[]> r2) throws java.io.IOException {
            r1 = this;
            java.util.Collection<java.net.InetAddress> r0 = r1.tcpMd5SigAddresses
            java.util.Collection r2 = io.netty.channel.epoll.TcpMd5Util.newTcpMd5Sigs(r1, r0, r2)
            r1.tcpMd5SigAddresses = r2
            return
    }

    public io.netty.channel.epoll.EpollTcpInfo tcpInfo() {
            r1 = this;
            io.netty.channel.epoll.EpollTcpInfo r0 = new io.netty.channel.epoll.EpollTcpInfo
            r0.<init>()
            io.netty.channel.epoll.EpollTcpInfo r0 = r1.tcpInfo(r0)
            return r0
    }

    public io.netty.channel.epoll.EpollTcpInfo tcpInfo(io.netty.channel.epoll.EpollTcpInfo r2) {
            r1 = this;
            io.netty.channel.epoll.LinuxSocket r0 = r1.socket     // Catch: java.io.IOException -> L6
            r0.getTcpInfo(r2)     // Catch: java.io.IOException -> L6
            return r2
        L6:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }
}
