package io.netty.channel.udt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface UdtServerChannelConfig extends io.netty.channel.udt.UdtChannelConfig {
    int getBacklog();

    @Override // io.netty.channel.udt.UdtChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.udt.UdtServerChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1);

    @Override // io.netty.channel.udt.UdtChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.udt.UdtServerChannelConfig setAutoClose(boolean r1);

    @Override // io.netty.channel.udt.UdtChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.udt.UdtServerChannelConfig setAutoRead(boolean r1);

    io.netty.channel.udt.UdtServerChannelConfig setBacklog(int r1);

    @Override // io.netty.channel.udt.UdtChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.udt.UdtServerChannelConfig setConnectTimeoutMillis(int r1);

    @Override // io.netty.channel.udt.UdtChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    io.netty.channel.udt.UdtServerChannelConfig setMaxMessagesPerRead(int r1);

    @Override // io.netty.channel.udt.UdtChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.udt.UdtServerChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1);

    @Override // io.netty.channel.udt.UdtChannelConfig
    io.netty.channel.udt.UdtServerChannelConfig setProtocolReceiveBufferSize(int r1);

    @Override // io.netty.channel.udt.UdtChannelConfig
    io.netty.channel.udt.UdtServerChannelConfig setProtocolSendBufferSize(int r1);

    @Override // io.netty.channel.udt.UdtChannelConfig
    io.netty.channel.udt.UdtServerChannelConfig setReceiveBufferSize(int r1);

    @Override // io.netty.channel.udt.UdtChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.udt.UdtServerChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1);

    @Override // io.netty.channel.udt.UdtChannelConfig
    io.netty.channel.udt.UdtServerChannelConfig setReuseAddress(boolean r1);

    @Override // io.netty.channel.udt.UdtChannelConfig
    io.netty.channel.udt.UdtServerChannelConfig setSendBufferSize(int r1);

    @Override // io.netty.channel.udt.UdtChannelConfig
    io.netty.channel.udt.UdtServerChannelConfig setSoLinger(int r1);

    @Override // io.netty.channel.udt.UdtChannelConfig
    io.netty.channel.udt.UdtServerChannelConfig setSystemReceiveBufferSize(int r1);

    @Override // io.netty.channel.udt.UdtChannelConfig
    io.netty.channel.udt.UdtServerChannelConfig setSystemSendBufferSize(int r1);

    @Override // io.netty.channel.udt.UdtChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.udt.UdtServerChannelConfig setWriteBufferHighWaterMark(int r1);

    @Override // io.netty.channel.udt.UdtChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.udt.UdtServerChannelConfig setWriteBufferLowWaterMark(int r1);

    @Override // io.netty.channel.udt.UdtChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.udt.UdtServerChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1);

    @Override // io.netty.channel.udt.UdtChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.udt.UdtServerChannelConfig setWriteSpinCount(int r1);
}
