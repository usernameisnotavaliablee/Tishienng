package io.netty.channel.socket;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface DatagramChannelConfig extends io.netty.channel.ChannelConfig {
    java.net.InetAddress getInterface();

    java.net.NetworkInterface getNetworkInterface();

    int getReceiveBufferSize();

    int getSendBufferSize();

    int getTimeToLive();

    int getTrafficClass();

    boolean isBroadcast();

    boolean isLoopbackModeDisabled();

    boolean isReuseAddress();

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.DatagramChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.DatagramChannelConfig setAutoClose(boolean r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.DatagramChannelConfig setAutoRead(boolean r1);

    io.netty.channel.socket.DatagramChannelConfig setBroadcast(boolean r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.DatagramChannelConfig setConnectTimeoutMillis(int r1);

    io.netty.channel.socket.DatagramChannelConfig setInterface(java.net.InetAddress r1);

    io.netty.channel.socket.DatagramChannelConfig setLoopbackModeDisabled(boolean r1);

    @Override // io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    io.netty.channel.socket.DatagramChannelConfig setMaxMessagesPerRead(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.DatagramChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1);

    io.netty.channel.socket.DatagramChannelConfig setNetworkInterface(java.net.NetworkInterface r1);

    io.netty.channel.socket.DatagramChannelConfig setReceiveBufferSize(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.DatagramChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1);

    io.netty.channel.socket.DatagramChannelConfig setReuseAddress(boolean r1);

    io.netty.channel.socket.DatagramChannelConfig setSendBufferSize(int r1);

    io.netty.channel.socket.DatagramChannelConfig setTimeToLive(int r1);

    io.netty.channel.socket.DatagramChannelConfig setTrafficClass(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.DatagramChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.socket.DatagramChannelConfig setWriteSpinCount(int r1);
}
