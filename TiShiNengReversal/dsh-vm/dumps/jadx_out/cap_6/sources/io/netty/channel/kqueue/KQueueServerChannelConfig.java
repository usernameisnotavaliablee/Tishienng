package io.netty.channel.kqueue;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class KQueueServerChannelConfig extends io.netty.channel.kqueue.KQueueChannelConfig implements io.netty.channel.socket.ServerSocketChannelConfig {
    private volatile int backlog;

    KQueueServerChannelConfig(io.netty.channel.kqueue.AbstractKQueueChannel r1) {
            r0 = this;
            r0.<init>(r1)
            int r1 = io.netty.util.NetUtil.SOMAXCONN
            r0.backlog = r1
            return
    }

    @Override // io.netty.channel.socket.ServerSocketChannelConfig
    public int getBacklog() {
            r1 = this;
            int r0 = r1.backlog
            return r0
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> T getOption(io.netty.channel.ChannelOption<T> r2) {
            r1 = this;
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_RCVBUF
            if (r2 != r0) goto Ld
            int r2 = r1.getReceiveBufferSize()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        Ld:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.SO_REUSEADDR
            if (r2 != r0) goto L1a
            boolean r2 = r1.isReuseAddress()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L1a:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_BACKLOG
            if (r2 != r0) goto L27
            int r2 = r1.getBacklog()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L27:
            java.lang.Object r2 = super.getOption(r2)
            return r2
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> getOptions() {
            r4 = this;
            java.util.Map r0 = super.getOptions()
            r1 = 3
            io.netty.channel.ChannelOption[] r1 = new io.netty.channel.ChannelOption[r1]
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.ChannelOption.SO_RCVBUF
            r3 = 0
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Boolean> r2 = io.netty.channel.ChannelOption.SO_REUSEADDR
            r3 = 1
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.ChannelOption.SO_BACKLOG
            r3 = 2
            r1[r3] = r2
            java.util.Map r0 = r4.getOptions(r0, r1)
            return r0
    }

    @Override // io.netty.channel.socket.ServerSocketChannelConfig
    public int getReceiveBufferSize() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.kqueue.AbstractKQueueChannel r0 = (io.netty.channel.kqueue.AbstractKQueueChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.kqueue.BsdSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            int r0 = r0.getReceiveBufferSize()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.socket.ServerSocketChannelConfig
    public boolean isReuseAddress() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.kqueue.AbstractKQueueChannel r0 = (io.netty.channel.kqueue.AbstractKQueueChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.kqueue.BsdSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            boolean r0 = r0.isReuseAddress()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.kqueue.KQueueServerChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            super.setAllocator(r1)
            return r0
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.kqueue.KQueueServerChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            super.setAutoRead(r1)
            return r0
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.socket.ServerSocketChannelConfig
    public io.netty.channel.kqueue.KQueueServerChannelConfig setBacklog(int r2) {
            r1 = this;
            java.lang.String r0 = "backlog"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r2, r0)
            r1.backlog = r2
            return r1
    }

    @Override // io.netty.channel.socket.ServerSocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setBacklog(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setBacklog(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.kqueue.KQueueServerChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            super.setConnectTimeoutMillis(r1)
            return r0
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public io.netty.channel.kqueue.KQueueServerChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            super.setMaxMessagesPerRead(r1)
            return r0
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.kqueue.KQueueServerChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            super.setMessageSizeEstimator(r1)
            return r0
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> boolean setOption(io.netty.channel.ChannelOption<T> r2, T r3) {
            r1 = this;
            r1.validate(r2, r3)
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_RCVBUF
            if (r2 != r0) goto L11
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setReceiveBufferSize(r2)
            goto L2c
        L11:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.SO_REUSEADDR
            if (r2 != r0) goto L1f
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setReuseAddress(r2)
            goto L2c
        L1f:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_BACKLOG
            if (r2 != r0) goto L2e
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setBacklog(r2)
        L2c:
            r2 = 1
            return r2
        L2e:
            boolean r2 = super.setOption(r2, r3)
            return r2
    }

    @Override // io.netty.channel.socket.ServerSocketChannelConfig
    public io.netty.channel.kqueue.KQueueServerChannelConfig setPerformancePreferences(int r1, int r2, int r3) {
            r0 = this;
            return r0
    }

    @Override // io.netty.channel.socket.ServerSocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setPerformancePreferences(int r1, int r2, int r3) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setPerformancePreferences(r1, r2, r3)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueChannelConfig setRcvAllocTransportProvidesGuess(boolean r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setRcvAllocTransportProvidesGuess(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig
    public io.netty.channel.kqueue.KQueueServerChannelConfig setRcvAllocTransportProvidesGuess(boolean r1) {
            r0 = this;
            super.setRcvAllocTransportProvidesGuess(r1)
            return r0
    }

    @Override // io.netty.channel.socket.ServerSocketChannelConfig
    public io.netty.channel.kqueue.KQueueServerChannelConfig setReceiveBufferSize(int r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.kqueue.AbstractKQueueChannel r0 = (io.netty.channel.kqueue.AbstractKQueueChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.kqueue.BsdSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setReceiveBufferSize(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.ServerSocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setReceiveBufferSize(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setReceiveBufferSize(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.kqueue.KQueueServerChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            super.setRecvByteBufAllocator(r1)
            return r0
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.socket.ServerSocketChannelConfig
    public io.netty.channel.kqueue.KQueueServerChannelConfig setReuseAddress(boolean r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.kqueue.AbstractKQueueChannel r0 = (io.netty.channel.kqueue.AbstractKQueueChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.kqueue.BsdSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setReuseAddress(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.ServerSocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setReuseAddress(boolean r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setReuseAddress(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setWriteBufferHighWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setWriteBufferHighWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public io.netty.channel.kqueue.KQueueServerChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferHighWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setWriteBufferHighWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setWriteBufferLowWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setWriteBufferLowWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public io.netty.channel.kqueue.KQueueServerChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferLowWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setWriteBufferLowWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.kqueue.KQueueServerChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            super.setWriteBufferWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.kqueue.KQueueServerChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            super.setWriteSpinCount(r1)
            return r0
    }

    @Override // io.netty.channel.kqueue.KQueueChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.kqueue.KQueueServerChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }
}
