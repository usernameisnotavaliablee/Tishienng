package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface ChannelConfig {
    io.netty.buffer.ByteBufAllocator getAllocator();

    int getConnectTimeoutMillis();

    @java.lang.Deprecated
    int getMaxMessagesPerRead();

    io.netty.channel.MessageSizeEstimator getMessageSizeEstimator();

    <T> T getOption(io.netty.channel.ChannelOption<T> r1);

    java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> getOptions();

    <T extends io.netty.channel.RecvByteBufAllocator> T getRecvByteBufAllocator();

    int getWriteBufferHighWaterMark();

    int getWriteBufferLowWaterMark();

    io.netty.channel.WriteBufferWaterMark getWriteBufferWaterMark();

    int getWriteSpinCount();

    boolean isAutoClose();

    boolean isAutoRead();

    io.netty.channel.ChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1);

    io.netty.channel.ChannelConfig setAutoClose(boolean r1);

    io.netty.channel.ChannelConfig setAutoRead(boolean r1);

    io.netty.channel.ChannelConfig setConnectTimeoutMillis(int r1);

    @java.lang.Deprecated
    io.netty.channel.ChannelConfig setMaxMessagesPerRead(int r1);

    io.netty.channel.ChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1);

    <T> boolean setOption(io.netty.channel.ChannelOption<T> r1, T r2);

    boolean setOptions(java.util.Map<io.netty.channel.ChannelOption<?>, ?> r1);

    io.netty.channel.ChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1);

    io.netty.channel.ChannelConfig setWriteBufferHighWaterMark(int r1);

    io.netty.channel.ChannelConfig setWriteBufferLowWaterMark(int r1);

    io.netty.channel.ChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1);

    io.netty.channel.ChannelConfig setWriteSpinCount(int r1);
}
