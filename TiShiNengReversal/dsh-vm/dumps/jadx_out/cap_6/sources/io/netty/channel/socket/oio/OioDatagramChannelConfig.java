package io.netty.channel.socket.oio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface OioDatagramChannelConfig extends io.netty.channel.socket.DatagramChannelConfig {
    int getSoTimeout();

    @Override // io.netty.channel.socket.DatagramChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioDatagramChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1);

    @Override // io.netty.channel.socket.DatagramChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioDatagramChannelConfig setAutoClose(boolean r1);

    @Override // io.netty.channel.socket.DatagramChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioDatagramChannelConfig setAutoRead(boolean r1);

    @Override // io.netty.channel.socket.DatagramChannelConfig
    io.netty.channel.socket.oio.OioDatagramChannelConfig setBroadcast(boolean r1);

    @Override // io.netty.channel.socket.DatagramChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioDatagramChannelConfig setConnectTimeoutMillis(int r1);

    @Override // io.netty.channel.socket.DatagramChannelConfig
    io.netty.channel.socket.oio.OioDatagramChannelConfig setInterface(java.net.InetAddress r1);

    @Override // io.netty.channel.socket.DatagramChannelConfig
    io.netty.channel.socket.oio.OioDatagramChannelConfig setLoopbackModeDisabled(boolean r1);

    @Override // io.netty.channel.socket.DatagramChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioDatagramChannelConfig setMaxMessagesPerRead(int r1);

    @Override // io.netty.channel.socket.DatagramChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioDatagramChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1);

    @Override // io.netty.channel.socket.DatagramChannelConfig
    io.netty.channel.socket.oio.OioDatagramChannelConfig setNetworkInterface(java.net.NetworkInterface r1);

    @Override // io.netty.channel.socket.DatagramChannelConfig
    io.netty.channel.socket.oio.OioDatagramChannelConfig setReceiveBufferSize(int r1);

    @Override // io.netty.channel.socket.DatagramChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioDatagramChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1);

    @Override // io.netty.channel.socket.DatagramChannelConfig
    io.netty.channel.socket.oio.OioDatagramChannelConfig setReuseAddress(boolean r1);

    @Override // io.netty.channel.socket.DatagramChannelConfig
    io.netty.channel.socket.oio.OioDatagramChannelConfig setSendBufferSize(int r1);

    io.netty.channel.socket.oio.OioDatagramChannelConfig setSoTimeout(int r1);

    @Override // io.netty.channel.socket.DatagramChannelConfig
    io.netty.channel.socket.oio.OioDatagramChannelConfig setTimeToLive(int r1);

    @Override // io.netty.channel.socket.DatagramChannelConfig
    io.netty.channel.socket.oio.OioDatagramChannelConfig setTrafficClass(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioDatagramChannelConfig setWriteBufferHighWaterMark(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioDatagramChannelConfig setWriteBufferLowWaterMark(int r1);

    @Override // io.netty.channel.socket.DatagramChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioDatagramChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1);

    @Override // io.netty.channel.socket.DatagramChannelConfig, io.netty.channel.ChannelConfig
    io.netty.channel.socket.oio.OioDatagramChannelConfig setWriteSpinCount(int r1);
}
