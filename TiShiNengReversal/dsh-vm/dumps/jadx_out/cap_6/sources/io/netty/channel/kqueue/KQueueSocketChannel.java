package io.netty.channel.kqueue;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class KQueueSocketChannel extends io.netty.channel.kqueue.AbstractKQueueStreamChannel implements io.netty.channel.socket.SocketChannel {
    private final io.netty.channel.kqueue.KQueueSocketChannelConfig config;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.channel.kqueue.KQueueSocketChannel$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class KQueueSocketChannelUnsafe extends io.netty.channel.kqueue.AbstractKQueueStreamChannel.KQueueStreamUnsafe {
        final /* synthetic */ io.netty.channel.kqueue.KQueueSocketChannel this$0;

        private KQueueSocketChannelUnsafe(io.netty.channel.kqueue.KQueueSocketChannel r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        /* synthetic */ KQueueSocketChannelUnsafe(io.netty.channel.kqueue.KQueueSocketChannel r1, io.netty.channel.kqueue.KQueueSocketChannel.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.netty.channel.kqueue.AbstractKQueueStreamChannel.KQueueStreamUnsafe, io.netty.channel.AbstractChannel.AbstractUnsafe
        protected java.util.concurrent.Executor prepareToClose() {
                r2 = this;
                io.netty.channel.kqueue.KQueueSocketChannel r0 = r2.this$0     // Catch: java.lang.Throwable -> L24
                boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L24
                if (r0 == 0) goto L24
                io.netty.channel.kqueue.KQueueSocketChannel r0 = r2.this$0     // Catch: java.lang.Throwable -> L24
                io.netty.channel.kqueue.KQueueSocketChannelConfig r0 = r0.config()     // Catch: java.lang.Throwable -> L24
                int r0 = r0.getSoLinger()     // Catch: java.lang.Throwable -> L24
                if (r0 <= 0) goto L24
                io.netty.channel.kqueue.KQueueSocketChannel r0 = r2.this$0     // Catch: java.lang.Throwable -> L24
                io.netty.channel.EventLoop r0 = r0.eventLoop()     // Catch: java.lang.Throwable -> L24
                io.netty.channel.kqueue.KQueueEventLoop r0 = (io.netty.channel.kqueue.KQueueEventLoop) r0     // Catch: java.lang.Throwable -> L24
                io.netty.channel.kqueue.KQueueSocketChannel r1 = r2.this$0     // Catch: java.lang.Throwable -> L24
                r0.remove(r1)     // Catch: java.lang.Throwable -> L24
                io.netty.util.concurrent.GlobalEventExecutor r0 = io.netty.util.concurrent.GlobalEventExecutor.INSTANCE     // Catch: java.lang.Throwable -> L24
                return r0
            L24:
                r0 = 0
                return r0
        }
    }

    public KQueueSocketChannel() {
            r3 = this;
            io.netty.channel.kqueue.BsdSocket r0 = io.netty.channel.kqueue.BsdSocket.newSocketStream()
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            io.netty.channel.kqueue.KQueueSocketChannelConfig r0 = new io.netty.channel.kqueue.KQueueSocketChannelConfig
            r0.<init>(r3)
            r3.config = r0
            return
    }

    public KQueueSocketChannel(int r2) {
            r1 = this;
            io.netty.channel.kqueue.BsdSocket r0 = new io.netty.channel.kqueue.BsdSocket
            r0.<init>(r2)
            r1.<init>(r0)
            io.netty.channel.kqueue.KQueueSocketChannelConfig r2 = new io.netty.channel.kqueue.KQueueSocketChannelConfig
            r2.<init>(r1)
            r1.config = r2
            return
    }

    KQueueSocketChannel(io.netty.channel.Channel r1, io.netty.channel.kqueue.BsdSocket r2, java.net.InetSocketAddress r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            io.netty.channel.kqueue.KQueueSocketChannelConfig r1 = new io.netty.channel.kqueue.KQueueSocketChannelConfig
            r1.<init>(r0)
            r0.config = r1
            return
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig config() {
            r1 = this;
            io.netty.channel.kqueue.KQueueSocketChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueChannelConfig config() {
            r1 = this;
            io.netty.channel.kqueue.KQueueSocketChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.Channel
    public io.netty.channel.kqueue.KQueueSocketChannelConfig config() {
            r1 = this;
            io.netty.channel.kqueue.KQueueSocketChannelConfig r0 = r1.config
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig config() {
            r1 = this;
            io.netty.channel.kqueue.KQueueSocketChannelConfig r0 = r1.config()
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

    @Override // io.netty.channel.kqueue.AbstractKQueueStreamChannel, io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.AbstractChannel
    protected /* bridge */ /* synthetic */ io.netty.channel.AbstractChannel.AbstractUnsafe newUnsafe() {
            r1 = this;
            io.netty.channel.kqueue.AbstractKQueueChannel$AbstractKQueueUnsafe r0 = r1.newUnsafe()
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueStreamChannel, io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.AbstractChannel
    protected io.netty.channel.kqueue.AbstractKQueueChannel.AbstractKQueueUnsafe newUnsafe() {
            r2 = this;
            io.netty.channel.kqueue.KQueueSocketChannel$KQueueSocketChannelUnsafe r0 = new io.netty.channel.kqueue.KQueueSocketChannel$KQueueSocketChannelUnsafe
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
}
