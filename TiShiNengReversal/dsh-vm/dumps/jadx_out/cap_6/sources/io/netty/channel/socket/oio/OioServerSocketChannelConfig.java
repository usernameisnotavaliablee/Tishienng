package io.netty.channel.socket.oio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface OioServerSocketChannelConfig extends io.netty.channel.socket.ServerSocketChannelConfig {
    int getSoTimeout();

    @Override // io.netty.channel.socket.ServerSocketChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioServerSocketChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioServerSocketChannelConfig setAutoClose(boolean r1);

    @Override // io.netty.channel.socket.ServerSocketChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioServerSocketChannelConfig setAutoRead(boolean r1);

    @Override // io.netty.channel.socket.ServerSocketChannelConfig
    io.netty.channel.socket.oio.OioServerSocketChannelConfig setBacklog(int r1);

    @Override // io.netty.channel.socket.ServerSocketChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioServerSocketChannelConfig setConnectTimeoutMillis(int r1);

    @Override // io.netty.channel.socket.ServerSocketChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    io.netty.channel.socket.oio.OioServerSocketChannelConfig setMaxMessagesPerRead(int r1);

    @Override // io.netty.channel.socket.ServerSocketChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioServerSocketChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1);

    @Override // io.netty.channel.socket.ServerSocketChannelConfig
    io.netty.channel.socket.oio.OioServerSocketChannelConfig setPerformancePreferences(int r1, int r2, int r3);

    @Override // io.netty.channel.socket.ServerSocketChannelConfig
    io.netty.channel.socket.oio.OioServerSocketChannelConfig setReceiveBufferSize(int r1);

    @Override // io.netty.channel.socket.ServerSocketChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioServerSocketChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1);

    @Override // io.netty.channel.socket.ServerSocketChannelConfig
    io.netty.channel.socket.oio.OioServerSocketChannelConfig setReuseAddress(boolean r1);

    io.netty.channel.socket.oio.OioServerSocketChannelConfig setSoTimeout(int r1);

    @Override // io.netty.channel.socket.ServerSocketChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioServerSocketChannelConfig setWriteBufferHighWaterMark(int r1);

    @Override // io.netty.channel.socket.ServerSocketChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioServerSocketChannelConfig setWriteBufferLowWaterMark(int r1);

    @Override // io.netty.channel.socket.ServerSocketChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioServerSocketChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1);

    @Override // io.netty.channel.socket.ServerSocketChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioServerSocketChannelConfig setWriteSpinCount(int r1);
}
