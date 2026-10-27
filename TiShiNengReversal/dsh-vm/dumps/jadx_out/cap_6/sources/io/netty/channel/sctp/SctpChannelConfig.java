package io.netty.channel.sctp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface SctpChannelConfig extends io.netty.channel.ChannelConfig {
    com.sun.nio.sctp.SctpStandardSocketOptions.InitMaxStreams getInitMaxStreams();

    int getReceiveBufferSize();

    int getSendBufferSize();

    boolean isSctpNoDelay();

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.sctp.SctpChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.sctp.SctpChannelConfig setAutoClose(boolean r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.sctp.SctpChannelConfig setAutoRead(boolean r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.sctp.SctpChannelConfig setConnectTimeoutMillis(int r1);

    io.netty.channel.sctp.SctpChannelConfig setInitMaxStreams(com.sun.nio.sctp.SctpStandardSocketOptions.InitMaxStreams r1);

    @Override // io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    io.netty.channel.sctp.SctpChannelConfig setMaxMessagesPerRead(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.sctp.SctpChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1);

    io.netty.channel.sctp.SctpChannelConfig setReceiveBufferSize(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.sctp.SctpChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1);

    io.netty.channel.sctp.SctpChannelConfig setSctpNoDelay(boolean r1);

    io.netty.channel.sctp.SctpChannelConfig setSendBufferSize(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.sctp.SctpChannelConfig setWriteBufferHighWaterMark(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.sctp.SctpChannelConfig setWriteBufferLowWaterMark(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.sctp.SctpChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.sctp.SctpChannelConfig setWriteSpinCount(int r1);
}
