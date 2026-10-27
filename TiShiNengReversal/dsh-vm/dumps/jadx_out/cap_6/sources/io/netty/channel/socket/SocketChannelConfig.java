package io.netty.channel.socket;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface SocketChannelConfig extends io.netty.channel.ChannelConfig {
    int getReceiveBufferSize();

    int getSendBufferSize();

    int getSoLinger();

    int getTrafficClass();

    boolean isAllowHalfClosure();

    boolean isKeepAlive();

    boolean isReuseAddress();

    boolean isTcpNoDelay();

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.SocketChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1);

    io.netty.channel.socket.SocketChannelConfig setAllowHalfClosure(boolean r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.SocketChannelConfig setAutoClose(boolean r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.SocketChannelConfig setAutoRead(boolean r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.SocketChannelConfig setConnectTimeoutMillis(int r1);

    io.netty.channel.socket.SocketChannelConfig setKeepAlive(boolean r1);

    @Override // io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    io.netty.channel.socket.SocketChannelConfig setMaxMessagesPerRead(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.SocketChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1);

    io.netty.channel.socket.SocketChannelConfig setPerformancePreferences(int r1, int r2, int r3);

    io.netty.channel.socket.SocketChannelConfig setReceiveBufferSize(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.SocketChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1);

    io.netty.channel.socket.SocketChannelConfig setReuseAddress(boolean r1);

    io.netty.channel.socket.SocketChannelConfig setSendBufferSize(int r1);

    io.netty.channel.socket.SocketChannelConfig setSoLinger(int r1);

    io.netty.channel.socket.SocketChannelConfig setTcpNoDelay(boolean r1);

    io.netty.channel.socket.SocketChannelConfig setTrafficClass(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.SocketChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.SocketChannelConfig setWriteSpinCount(int r1);
}
