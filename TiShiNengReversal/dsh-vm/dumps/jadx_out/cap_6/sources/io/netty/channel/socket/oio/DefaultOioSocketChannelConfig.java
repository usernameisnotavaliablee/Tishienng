package io.netty.channel.socket.oio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultOioSocketChannelConfig extends io.netty.channel.socket.DefaultSocketChannelConfig implements io.netty.channel.socket.oio.OioSocketChannelConfig {
    @java.lang.Deprecated
    public DefaultOioSocketChannelConfig(io.netty.channel.socket.SocketChannel r1, java.net.Socket r2) {
            r0 = this;
            r0.<init>(r1, r2)
            io.netty.channel.PreferHeapByteBufAllocator r1 = new io.netty.channel.PreferHeapByteBufAllocator
            io.netty.buffer.ByteBufAllocator r2 = r0.getAllocator()
            r1.<init>(r2)
            r0.setAllocator(r1)
            return
    }

    DefaultOioSocketChannelConfig(io.netty.channel.socket.oio.OioSocketChannel r1, java.net.Socket r2) {
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
            boolean r1 = r0 instanceof io.netty.channel.socket.oio.OioSocketChannel
            if (r1 == 0) goto Lb
            io.netty.channel.socket.oio.OioSocketChannel r0 = (io.netty.channel.socket.oio.OioSocketChannel) r0
            r0.clearReadPending0()
        Lb:
            return
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
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

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
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

    @Override // io.netty.channel.socket.oio.OioSocketChannelConfig
    public int getSoTimeout() {
            r2 = this;
            java.net.Socket r0 = r2.javaSocket     // Catch: java.io.IOException -> L7
            int r0 = r0.getSoTimeout()     // Catch: java.io.IOException -> L7
            return r0
        L7:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioSocketChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            super.setAllocator(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.socket.SocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setAllowHalfClosure(boolean r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setAllowHalfClosure(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.socket.SocketChannelConfig
    public io.netty.channel.socket.oio.OioSocketChannelConfig setAllowHalfClosure(boolean r1) {
            r0 = this;
            super.setAllowHalfClosure(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAutoClose(boolean r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setAutoClose(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setAutoClose(boolean r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setAutoClose(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioSocketChannelConfig setAutoClose(boolean r1) {
            r0 = this;
            super.setAutoClose(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioSocketChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            super.setAutoRead(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioSocketChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            super.setConnectTimeoutMillis(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.socket.SocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setKeepAlive(boolean r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setKeepAlive(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.socket.SocketChannelConfig
    public io.netty.channel.socket.oio.OioSocketChannelConfig setKeepAlive(boolean r1) {
            r0 = this;
            super.setKeepAlive(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public io.netty.channel.socket.oio.OioSocketChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            super.setMaxMessagesPerRead(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioSocketChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            super.setMessageSizeEstimator(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
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

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.socket.SocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setPerformancePreferences(int r1, int r2, int r3) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setPerformancePreferences(r1, r2, r3)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.socket.SocketChannelConfig
    public io.netty.channel.socket.oio.OioSocketChannelConfig setPerformancePreferences(int r1, int r2, int r3) {
            r0 = this;
            super.setPerformancePreferences(r1, r2, r3)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.socket.SocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setReceiveBufferSize(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setReceiveBufferSize(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.socket.SocketChannelConfig
    public io.netty.channel.socket.oio.OioSocketChannelConfig setReceiveBufferSize(int r1) {
            r0 = this;
            super.setReceiveBufferSize(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioSocketChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            super.setRecvByteBufAllocator(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.socket.SocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setReuseAddress(boolean r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setReuseAddress(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.socket.SocketChannelConfig
    public io.netty.channel.socket.oio.OioSocketChannelConfig setReuseAddress(boolean r1) {
            r0 = this;
            super.setReuseAddress(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.socket.SocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setSendBufferSize(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setSendBufferSize(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.socket.SocketChannelConfig
    public io.netty.channel.socket.oio.OioSocketChannelConfig setSendBufferSize(int r1) {
            r0 = this;
            super.setSendBufferSize(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.socket.SocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setSoLinger(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setSoLinger(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.socket.SocketChannelConfig
    public io.netty.channel.socket.oio.OioSocketChannelConfig setSoLinger(int r1) {
            r0 = this;
            super.setSoLinger(r1)
            return r0
    }

    @Override // io.netty.channel.socket.oio.OioSocketChannelConfig
    public io.netty.channel.socket.oio.OioSocketChannelConfig setSoTimeout(int r2) {
            r1 = this;
            java.net.Socket r0 = r1.javaSocket     // Catch: java.io.IOException -> L6
            r0.setSoTimeout(r2)     // Catch: java.io.IOException -> L6
            return r1
        L6:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.socket.SocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setTcpNoDelay(boolean r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setTcpNoDelay(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.socket.SocketChannelConfig
    public io.netty.channel.socket.oio.OioSocketChannelConfig setTcpNoDelay(boolean r1) {
            r0 = this;
            super.setTcpNoDelay(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.socket.SocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setTrafficClass(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setTrafficClass(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.socket.SocketChannelConfig
    public io.netty.channel.socket.oio.OioSocketChannelConfig setTrafficClass(int r1) {
            r0 = this;
            super.setTrafficClass(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setWriteBufferHighWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setWriteBufferHighWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioSocketChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferHighWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setWriteBufferLowWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setWriteBufferLowWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioSocketChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferLowWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioSocketChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            super.setWriteBufferWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultSocketChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioSocketChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            super.setWriteSpinCount(r1)
            return r0
    }
}
