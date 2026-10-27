package io.netty.channel.socket;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface ServerSocketChannelConfig extends io.netty.channel.ChannelConfig {
    int getBacklog();

    int getReceiveBufferSize();

    boolean isReuseAddress();

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.ServerSocketChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.ServerSocketChannelConfig setAutoRead(boolean r1);

    io.netty.channel.socket.ServerSocketChannelConfig setBacklog(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.ServerSocketChannelConfig setConnectTimeoutMillis(int r1);

    @Override // io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    io.netty.channel.socket.ServerSocketChannelConfig setMaxMessagesPerRead(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.ServerSocketChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1);

    io.netty.channel.socket.ServerSocketChannelConfig setPerformancePreferences(int r1, int r2, int r3);

    io.netty.channel.socket.ServerSocketChannelConfig setReceiveBufferSize(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.ServerSocketChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1);

    io.netty.channel.socket.ServerSocketChannelConfig setReuseAddress(boolean r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.ServerSocketChannelConfig setWriteBufferHighWaterMark(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.ServerSocketChannelConfig setWriteBufferLowWaterMark(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.ServerSocketChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.ServerSocketChannelConfig setWriteSpinCount(int r1);
}
