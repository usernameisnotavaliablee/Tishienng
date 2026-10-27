package io.netty.channel.kqueue;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class KQueueServerSocketChannelConfig extends io.netty.channel.kqueue.KQueueServerChannelConfig implements io.netty.channel.socket.ServerSocketChannelConfig {
    KQueueServerSocketChannelConfig(io.netty.channel.kqueue.KQueueServerSocketChannel r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.setReuseAddress(r1)
            return
    }

    public io.netty.channel.kqueue.AcceptFilter getAcceptFilter() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.kqueue.KQueueServerSocketChannel r0 = (io.netty.channel.kqueue.KQueueServerSocketChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.kqueue.BsdSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            io.netty.channel.kqueue.AcceptFilter r0 = r0.getAcceptFilter()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> T getOption(io.netty.channel.ChannelOption<T> r2) {
            r1 = this;
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.unix.UnixChannelOption.SO_REUSEPORT
            if (r2 != r0) goto Ld
            boolean r2 = r1.isReusePort()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        Ld:
            io.netty.channel.ChannelOption<io.netty.channel.kqueue.AcceptFilter> r0 = io.netty.channel.kqueue.KQueueChannelOption.SO_ACCEPTFILTER
            if (r2 != r0) goto L16
            io.netty.channel.kqueue.AcceptFilter r2 = r1.getAcceptFilter()
            return r2
        L16:
            java.lang.Object r2 = super.getOption(r2)
            return r2
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> getOptions() {
            r4 = this;
            java.util.Map r0 = super.getOptions()
            r1 = 2
            io.netty.channel.ChannelOption[] r1 = new io.netty.channel.ChannelOption[r1]
            io.netty.channel.ChannelOption<java.lang.Boolean> r2 = io.netty.channel.unix.UnixChannelOption.SO_REUSEPORT
            r3 = 0
            r1[r3] = r2
            io.netty.channel.ChannelOption<io.netty.channel.kqueue.AcceptFilter> r2 = io.netty.channel.kqueue.KQueueChannelOption.SO_ACCEPTFILTER
            r3 = 1
            r1[r3] = r2
            java.util.Map r0 = r4.getOptions(r0, r1)
            return r0
    }

    public boolean isReusePort() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.kqueue.KQueueServerSocketChannel r0 = (io.netty.channel.kqueue.KQueueServerSocketChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.kqueue.BsdSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            boolean r0 = r0.isReusePort()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    public io.netty.channel.kqueue.KQueueServerSocketChannelConfig setAcceptFilter(io.netty.channel.kqueue.AcceptFilter r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.kqueue.KQueueServerSocketChannel r0 = (io.netty.channel.kqueue.KQueueServerSocketChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.kqueue.BsdSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setAcceptFilter(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueServerChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.kqueue.KQueueServerSocketChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            super.setAllocator(r1)
            return r0
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueServerChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.kqueue.KQueueServerSocketChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            super.setAutoRead(r1)
            return r0
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueServerChannelConfig setBacklog(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setBacklog(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public io.netty.channel.kqueue.KQueueServerSocketChannelConfig setBacklog(int r1) {
            r0 = this;
            super.setBacklog(r1)
            return r0
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setBacklog(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setBacklog(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueServerChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.kqueue.KQueueServerSocketChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            super.setConnectTimeoutMillis(r1)
            return r0
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueServerChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public io.netty.channel.kqueue.KQueueServerSocketChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            super.setMaxMessagesPerRead(r1)
            return r0
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueServerChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.kqueue.KQueueServerSocketChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            super.setMessageSizeEstimator(r1)
            return r0
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> boolean setOption(io.netty.channel.ChannelOption<T> r2, T r3) {
            r1 = this;
            r1.validate(r2, r3)
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.unix.UnixChannelOption.SO_REUSEPORT
            if (r2 != r0) goto L11
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setReusePort(r2)
            goto L1a
        L11:
            io.netty.channel.ChannelOption<io.netty.channel.kqueue.AcceptFilter> r0 = io.netty.channel.kqueue.KQueueChannelOption.SO_ACCEPTFILTER
            if (r2 != r0) goto L1c
            io.netty.channel.kqueue.AcceptFilter r3 = (io.netty.channel.kqueue.AcceptFilter) r3
            r1.setAcceptFilter(r3)
        L1a:
            r2 = 1
            return r2
        L1c:
            boolean r2 = super.setOption(r2, r3)
            return r2
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueServerChannelConfig setPerformancePreferences(int r1, int r2, int r3) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setPerformancePreferences(r1, r2, r3)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public io.netty.channel.kqueue.KQueueServerSocketChannelConfig setPerformancePreferences(int r1, int r2, int r3) {
            r0 = this;
            return r0
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setPerformancePreferences(int r1, int r2, int r3) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setPerformancePreferences(r1, r2, r3)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueChannelConfig setRcvAllocTransportProvidesGuess(boolean r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setRcvAllocTransportProvidesGuess(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueServerChannelConfig setRcvAllocTransportProvidesGuess(boolean r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setRcvAllocTransportProvidesGuess(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig
    public io.netty.channel.kqueue.KQueueServerSocketChannelConfig setRcvAllocTransportProvidesGuess(boolean r1) {
            r0 = this;
            super.setRcvAllocTransportProvidesGuess(r1)
            return r0
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueServerChannelConfig setReceiveBufferSize(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setReceiveBufferSize(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public io.netty.channel.kqueue.KQueueServerSocketChannelConfig setReceiveBufferSize(int r1) {
            r0 = this;
            super.setReceiveBufferSize(r1)
            return r0
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setReceiveBufferSize(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setReceiveBufferSize(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueServerChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.kqueue.KQueueServerSocketChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            super.setRecvByteBufAllocator(r1)
            return r0
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueServerChannelConfig setReuseAddress(boolean r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setReuseAddress(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public io.netty.channel.kqueue.KQueueServerSocketChannelConfig setReuseAddress(boolean r1) {
            r0 = this;
            super.setReuseAddress(r1)
            return r0
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setReuseAddress(boolean r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setReuseAddress(r1)
            return r1
    }

    public io.netty.channel.kqueue.KQueueServerSocketChannelConfig setReusePort(boolean r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.kqueue.KQueueServerSocketChannel r0 = (io.netty.channel.kqueue.KQueueServerSocketChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.kqueue.BsdSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setReusePort(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setWriteBufferHighWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setWriteBufferHighWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueServerChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setWriteBufferHighWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public io.netty.channel.kqueue.KQueueServerSocketChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferHighWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setWriteBufferHighWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setWriteBufferLowWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setWriteBufferLowWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueServerChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setWriteBufferLowWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public io.netty.channel.kqueue.KQueueServerSocketChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferLowWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setWriteBufferLowWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueServerChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.kqueue.KQueueServerSocketChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            super.setWriteBufferWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueServerChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.kqueue.KQueueServerSocketChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            super.setWriteSpinCount(r1)
            return r0
    }

    @Override // io.netty.channel.kqueue.KQueueServerChannelConfig, io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerSocketChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }
}
