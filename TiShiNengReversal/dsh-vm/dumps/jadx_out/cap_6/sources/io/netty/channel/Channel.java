package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface Channel extends io.netty.util.AttributeMap, io.netty.channel.ChannelOutboundInvoker, java.lang.Comparable<io.netty.channel.Channel> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Unsafe {
        void beginRead();

        void bind(java.net.SocketAddress r1, io.netty.channel.ChannelPromise r2);

        void close(io.netty.channel.ChannelPromise r1);

        void closeForcibly();

        void connect(java.net.SocketAddress r1, java.net.SocketAddress r2, io.netty.channel.ChannelPromise r3);

        void deregister(io.netty.channel.ChannelPromise r1);

        void disconnect(io.netty.channel.ChannelPromise r1);

        void flush();

        java.net.SocketAddress localAddress();

        io.netty.channel.ChannelOutboundBuffer outboundBuffer();

        io.netty.channel.RecvByteBufAllocator.Handle recvBufAllocHandle();

        void register(io.netty.channel.EventLoop r1, io.netty.channel.ChannelPromise r2);

        java.net.SocketAddress remoteAddress();

        io.netty.channel.ChannelPromise voidPromise();

        void write(java.lang.Object r1, io.netty.channel.ChannelPromise r2);
    }

    io.netty.buffer.ByteBufAllocator alloc();

    long bytesBeforeUnwritable();

    long bytesBeforeWritable();

    io.netty.channel.ChannelFuture closeFuture();

    io.netty.channel.ChannelConfig config();

    io.netty.channel.EventLoop eventLoop();

    io.netty.channel.Channel flush();

    io.netty.channel.ChannelId id();

    boolean isActive();

    boolean isOpen();

    boolean isRegistered();

    boolean isWritable();

    java.net.SocketAddress localAddress();

    io.netty.channel.ChannelMetadata metadata();

    io.netty.channel.Channel parent();

    io.netty.channel.ChannelPipeline pipeline();

    io.netty.channel.Channel read();

    java.net.SocketAddress remoteAddress();

    io.netty.channel.Channel.Unsafe unsafe();
}
