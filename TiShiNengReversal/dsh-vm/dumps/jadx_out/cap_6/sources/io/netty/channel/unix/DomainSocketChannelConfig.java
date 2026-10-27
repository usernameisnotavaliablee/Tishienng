package io.netty.channel.unix;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface DomainSocketChannelConfig extends io.netty.channel.ChannelConfig {
    io.netty.channel.unix.DomainSocketReadMode getReadMode();

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.unix.DomainSocketChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.unix.DomainSocketChannelConfig setAutoClose(boolean r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.unix.DomainSocketChannelConfig setAutoRead(boolean r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.unix.DomainSocketChannelConfig setConnectTimeoutMillis(int r1);

    @Override // io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    io.netty.channel.unix.DomainSocketChannelConfig setMaxMessagesPerRead(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.unix.DomainSocketChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1);

    io.netty.channel.unix.DomainSocketChannelConfig setReadMode(io.netty.channel.unix.DomainSocketReadMode r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.unix.DomainSocketChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1);

    @Override // io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    io.netty.channel.unix.DomainSocketChannelConfig setWriteBufferHighWaterMark(int r1);

    @Override // io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    io.netty.channel.unix.DomainSocketChannelConfig setWriteBufferLowWaterMark(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.unix.DomainSocketChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.unix.DomainSocketChannelConfig setWriteSpinCount(int r1);
}
