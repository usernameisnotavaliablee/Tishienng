package io.netty.channel.sctp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface SctpServerChannelConfig extends io.netty.channel.ChannelConfig {
    int getBacklog();

    com.sun.nio.sctp.SctpStandardSocketOptions.InitMaxStreams getInitMaxStreams();

    int getReceiveBufferSize();

    int getSendBufferSize();

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.sctp.SctpServerChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.sctp.SctpServerChannelConfig setAutoClose(boolean r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.sctp.SctpServerChannelConfig setAutoRead(boolean r1);

    io.netty.channel.sctp.SctpServerChannelConfig setBacklog(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.sctp.SctpServerChannelConfig setConnectTimeoutMillis(int r1);

    io.netty.channel.sctp.SctpServerChannelConfig setInitMaxStreams(com.sun.nio.sctp.SctpStandardSocketOptions.InitMaxStreams r1);

    @Override // io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    io.netty.channel.sctp.SctpServerChannelConfig setMaxMessagesPerRead(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.sctp.SctpServerChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1);

    io.netty.channel.sctp.SctpServerChannelConfig setReceiveBufferSize(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.sctp.SctpServerChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1);

    io.netty.channel.sctp.SctpServerChannelConfig setSendBufferSize(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.sctp.SctpServerChannelConfig setWriteBufferHighWaterMark(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.sctp.SctpServerChannelConfig setWriteBufferLowWaterMark(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.sctp.SctpServerChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.sctp.SctpServerChannelConfig setWriteSpinCount(int r1);
}
