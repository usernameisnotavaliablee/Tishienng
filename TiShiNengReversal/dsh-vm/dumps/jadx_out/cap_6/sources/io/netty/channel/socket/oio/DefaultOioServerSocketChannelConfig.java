package io.netty.channel.socket.oio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultOioServerSocketChannelConfig extends io.netty.channel.socket.DefaultServerSocketChannelConfig implements io.netty.channel.socket.oio.OioServerSocketChannelConfig {
    @java.lang.Deprecated
    public DefaultOioServerSocketChannelConfig(io.netty.channel.socket.ServerSocketChannel r1, java.net.ServerSocket r2) {
            r0 = this;
            r0.<init>(r1, r2)
            io.netty.channel.PreferHeapByteBufAllocator r1 = new io.netty.channel.PreferHeapByteBufAllocator
            io.netty.buffer.ByteBufAllocator r2 = r0.getAllocator()
            r1.<init>(r2)
            r0.setAllocator(r1)
            return
    }

    DefaultOioServerSocketChannelConfig(io.netty.channel.socket.oio.OioServerSocketChannel r1, java.net.ServerSocket r2) {
            r0 = this;
            r0.<init>(r1, r2)
            io.netty.channel.PreferHeapByteBufAllocator r1 = new io.netty.channel.PreferHeapByteBufAllocator
            io.netty.buffer.ByteBufAllocator r2 = r0.getAllocator()
            r1.<init>(r2)
            r0.setAllocator(r1)
            return
    }

    @Override // io.netty.channel.DefaultChannelConfig
    protected void autoReadCleared() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel
            boolean r1 = r0 instanceof io.netty.channel.socket.oio.OioServerSocketChannel
            if (r1 == 0) goto Lb
            io.netty.channel.socket.oio.OioServerSocketChannel r0 = (io.netty.channel.socket.oio.OioServerSocketChannel) r0
            r0.clearReadPending0()
        Lb:
            return
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> T getOption(io.netty.channel.ChannelOption<T> r2) {
            r1 = this;
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_TIMEOUT
            if (r2 != r0) goto Ld
            int r2 = r1.getSoTimeout()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        Ld:
            java.lang.Object r2 = super.getOption(r2)
            return r2
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> getOptions() {
            r4 = this;
            java.util.Map r0 = super.getOptions()
            r1 = 1
            io.netty.channel.ChannelOption[] r1 = new io.netty.channel.ChannelOption[r1]
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.ChannelOption.SO_TIMEOUT
            r3 = 0
            r1[r3] = r2
            java.util.Map r0 = r4.getOptions(r0, r1)
            return r0
    }

    @Override // io.netty.channel.socket.oio.OioServerSocketChannelConfig
    public int getSoTimeout() {
            r2 = this;
            java.net.ServerSocket r0 = r2.javaSocket     // Catch: java.io.IOException -> L7
            int r0 = r0.getSoTimeout()     // Catch: java.io.IOException -> L7
            return r0
        L7:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioServerSocketChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioServerSocketChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioServerSocketChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            super.setAllocator(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAutoClose(boolean r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioServerSocketChannelConfig r1 = r0.setAutoClose(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioServerSocketChannelConfig setAutoClose(boolean r1) {
            r0 = this;
            super.setAutoClose(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioServerSocketChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioServerSocketChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioServerSocketChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            super.setAutoRead(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setBacklog(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioServerSocketChannelConfig r1 = r0.setBacklog(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public io.netty.channel.socket.oio.OioServerSocketChannelConfig setBacklog(int r1) {
            r0 = this;
            super.setBacklog(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioServerSocketChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioServerSocketChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioServerSocketChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            super.setConnectTimeoutMillis(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioServerSocketChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioServerSocketChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public io.netty.channel.socket.oio.OioServerSocketChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            super.setMaxMessagesPerRead(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioServerSocketChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioServerSocketChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioServerSocketChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            super.setMessageSizeEstimator(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> boolean setOption(io.netty.channel.ChannelOption<T> r2, T r3) {
            r1 = this;
            r1.validate(r2, r3)
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_TIMEOUT
            if (r2 != r0) goto L12
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setSoTimeout(r2)
            r2 = 1
            return r2
        L12:
            boolean r2 = super.setOption(r2, r3)
            return r2
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setPerformancePreferences(int r1, int r2, int r3) {
            r0 = this;
            io.netty.channel.socket.oio.OioServerSocketChannelConfig r1 = r0.setPerformancePreferences(r1, r2, r3)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public io.netty.channel.socket.oio.OioServerSocketChannelConfig setPerformancePreferences(int r1, int r2, int r3) {
            r0 = this;
            super.setPerformancePreferences(r1, r2, r3)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setReceiveBufferSize(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioServerSocketChannelConfig r1 = r0.setReceiveBufferSize(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public io.netty.channel.socket.oio.OioServerSocketChannelConfig setReceiveBufferSize(int r1) {
            r0 = this;
            super.setReceiveBufferSize(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioServerSocketChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioServerSocketChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioServerSocketChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            super.setRecvByteBufAllocator(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setReuseAddress(boolean r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioServerSocketChannelConfig r1 = r0.setReuseAddress(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public io.netty.channel.socket.oio.OioServerSocketChannelConfig setReuseAddress(boolean r1) {
            r0 = this;
            super.setReuseAddress(r1)
            return r0
    }

    @Override // io.netty.channel.socket.oio.OioServerSocketChannelConfig
    public io.netty.channel.socket.oio.OioServerSocketChannelConfig setSoTimeout(int r2) {
            r1 = this;
            java.net.ServerSocket r0 = r1.javaSocket     // Catch: java.io.IOException -> L6
            r0.setSoTimeout(r2)     // Catch: java.io.IOException -> L6
            return r1
        L6:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioServerSocketChannelConfig r1 = r0.setWriteBufferHighWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioServerSocketChannelConfig r1 = r0.setWriteBufferHighWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioServerSocketChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferHighWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioServerSocketChannelConfig r1 = r0.setWriteBufferLowWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioServerSocketChannelConfig r1 = r0.setWriteBufferLowWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioServerSocketChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferLowWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioServerSocketChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioServerSocketChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioServerSocketChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            super.setWriteBufferWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioServerSocketChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioServerSocketChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultServerSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioServerSocketChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            super.setWriteSpinCount(r1)
            return r0
    }
}
