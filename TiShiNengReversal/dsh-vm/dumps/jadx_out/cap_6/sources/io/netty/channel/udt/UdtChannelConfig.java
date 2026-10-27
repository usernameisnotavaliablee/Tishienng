package io.netty.channel.udt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface UdtChannelConfig extends io.netty.channel.ChannelConfig {
    int getProtocolReceiveBufferSize();

    int getProtocolSendBufferSize();

    int getReceiveBufferSize();

    int getSendBufferSize();

    int getSoLinger();

    int getSystemReceiveBufferSize();

    int getSystemSendBufferSize();

    boolean isReuseAddress();

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.udt.UdtChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.udt.UdtChannelConfig setAutoClose(boolean r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.udt.UdtChannelConfig setAutoRead(boolean r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.udt.UdtChannelConfig setConnectTimeoutMillis(int r1);

    @Override // io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    io.netty.channel.udt.UdtChannelConfig setMaxMessagesPerRead(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.udt.UdtChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1);

    io.netty.channel.udt.UdtChannelConfig setProtocolReceiveBufferSize(int r1);

    io.netty.channel.udt.UdtChannelConfig setProtocolSendBufferSize(int r1);

    io.netty.channel.udt.UdtChannelConfig setReceiveBufferSize(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.udt.UdtChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1);

    io.netty.channel.udt.UdtChannelConfig setReuseAddress(boolean r1);

    io.netty.channel.udt.UdtChannelConfig setSendBufferSize(int r1);

    io.netty.channel.udt.UdtChannelConfig setSoLinger(int r1);

    io.netty.channel.udt.UdtChannelConfig setSystemReceiveBufferSize(int r1);

    io.netty.channel.udt.UdtChannelConfig setSystemSendBufferSize(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.udt.UdtChannelConfig setWriteBufferHighWaterMark(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.udt.UdtChannelConfig setWriteBufferLowWaterMark(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.udt.UdtChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.udt.UdtChannelConfig setWriteSpinCount(int r1);
}
