package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface ChannelOutboundHandler extends io.netty.channel.ChannelHandler {
    void bind(io.netty.channel.ChannelHandlerContext r1, java.net.SocketAddress r2, io.netty.channel.ChannelPromise r3) throws java.lang.Exception;

    void close(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.ChannelPromise r2) throws java.lang.Exception;

    void connect(io.netty.channel.ChannelHandlerContext r1, java.net.SocketAddress r2, java.net.SocketAddress r3, io.netty.channel.ChannelPromise r4) throws java.lang.Exception;

    void deregister(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.ChannelPromise r2) throws java.lang.Exception;

    void disconnect(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.ChannelPromise r2) throws java.lang.Exception;

    void flush(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception;

    void read(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception;

    void write(io.netty.channel.ChannelHandlerContext r1, java.lang.Object r2, io.netty.channel.ChannelPromise r3) throws java.lang.Exception;
}
