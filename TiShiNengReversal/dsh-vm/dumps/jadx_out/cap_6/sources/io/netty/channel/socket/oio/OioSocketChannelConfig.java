package io.netty.channel.socket.oio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface OioSocketChannelConfig extends io.netty.channel.socket.SocketChannelConfig {
    int getSoTimeout();

    @Override // io.netty.channel.socket.SocketChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioSocketChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1);

    @Override // io.netty.channel.socket.SocketChannelConfig
    io.netty.channel.socket.oio.OioSocketChannelConfig setAllowHalfClosure(boolean r1);

    @Override // io.netty.channel.socket.SocketChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioSocketChannelConfig setAutoClose(boolean r1);

    @Override // io.netty.channel.socket.SocketChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioSocketChannelConfig setAutoRead(boolean r1);

    @Override // io.netty.channel.socket.SocketChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioSocketChannelConfig setConnectTimeoutMillis(int r1);

    @Override // io.netty.channel.socket.SocketChannelConfig
    io.netty.channel.socket.oio.OioSocketChannelConfig setKeepAlive(boolean r1);

    @Override // io.netty.channel.socket.SocketChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    io.netty.channel.socket.oio.OioSocketChannelConfig setMaxMessagesPerRead(int r1);

    @Override // io.netty.channel.socket.SocketChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioSocketChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1);

    @Override // io.netty.channel.socket.SocketChannelConfig
    io.netty.channel.socket.oio.OioSocketChannelConfig setPerformancePreferences(int r1, int r2, int r3);

    @Override // io.netty.channel.socket.SocketChannelConfig
    io.netty.channel.socket.oio.OioSocketChannelConfig setReceiveBufferSize(int r1);

    @Override // io.netty.channel.socket.SocketChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioSocketChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1);

    @Override // io.netty.channel.socket.SocketChannelConfig
    io.netty.channel.socket.oio.OioSocketChannelConfig setReuseAddress(boolean r1);

    @Override // io.netty.channel.socket.SocketChannelConfig
    io.netty.channel.socket.oio.OioSocketChannelConfig setSendBufferSize(int r1);

    @Override // io.netty.channel.socket.SocketChannelConfig
    io.netty.channel.socket.oio.OioSocketChannelConfig setSoLinger(int r1);

    io.netty.channel.socket.oio.OioSocketChannelConfig setSoTimeout(int r1);

    @Override // io.netty.channel.socket.SocketChannelConfig
    io.netty.channel.socket.oio.OioSocketChannelConfig setTcpNoDelay(boolean r1);

    @Override // io.netty.channel.socket.SocketChannelConfig
    io.netty.channel.socket.oio.OioSocketChannelConfig setTrafficClass(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioSocketChannelConfig setWriteBufferHighWaterMark(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioSocketChannelConfig setWriteBufferLowWaterMark(int r1);

    @Override // io.netty.channel.socket.SocketChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioSocketChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1);

    @Override // io.netty.channel.socket.SocketChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioSocketChannelConfig setWriteSpinCount(int r1);
}
