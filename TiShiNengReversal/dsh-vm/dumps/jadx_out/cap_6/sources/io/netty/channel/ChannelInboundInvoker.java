package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface ChannelInboundInvoker {
    io.netty.channel.ChannelInboundInvoker fireChannelActive();

    io.netty.channel.ChannelInboundInvoker fireChannelInactive();

    io.netty.channel.ChannelInboundInvoker fireChannelRead(java.lang.Object r1);

    io.netty.channel.ChannelInboundInvoker fireChannelReadComplete();

    io.netty.channel.ChannelInboundInvoker fireChannelRegistered();

    io.netty.channel.ChannelInboundInvoker fireChannelUnregistered();

    io.netty.channel.ChannelInboundInvoker fireChannelWritabilityChanged();

    io.netty.channel.ChannelInboundInvoker fireExceptionCaught(java.lang.Throwable r1);

    io.netty.channel.ChannelInboundInvoker fireUserEventTriggered(java.lang.Object r1);
}
