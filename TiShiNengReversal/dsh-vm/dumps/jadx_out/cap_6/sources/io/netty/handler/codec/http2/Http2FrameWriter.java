package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface Http2FrameWriter extends io.netty.handler.codec.http2.Http2DataWriter, java.io.Closeable {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Configuration {
        io.netty.handler.codec.http2.Http2FrameSizePolicy frameSizePolicy();

        io.netty.handler.codec.http2.Http2HeadersEncoder.Configuration headersConfiguration();
    }

    void close();

    io.netty.handler.codec.http2.Http2FrameWriter.Configuration configuration();

    io.netty.channel.ChannelFuture writeFrame(io.netty.channel.ChannelHandlerContext r1, byte r2, int r3, io.netty.handler.codec.http2.Http2Flags r4, io.netty.buffer.ByteBuf r5, io.netty.channel.ChannelPromise r6);

    io.netty.channel.ChannelFuture writeGoAway(io.netty.channel.ChannelHandlerContext r1, int r2, long r3, io.netty.buffer.ByteBuf r5, io.netty.channel.ChannelPromise r6);

    io.netty.channel.ChannelFuture writeHeaders(io.netty.channel.ChannelHandlerContext r1, int r2, io.netty.handler.codec.http2.Http2Headers r3, int r4, short r5, boolean r6, int r7, boolean r8, io.netty.channel.ChannelPromise r9);

    io.netty.channel.ChannelFuture writeHeaders(io.netty.channel.ChannelHandlerContext r1, int r2, io.netty.handler.codec.http2.Http2Headers r3, int r4, boolean r5, io.netty.channel.ChannelPromise r6);

    io.netty.channel.ChannelFuture writePing(io.netty.channel.ChannelHandlerContext r1, boolean r2, long r3, io.netty.channel.ChannelPromise r5);

    io.netty.channel.ChannelFuture writePriority(io.netty.channel.ChannelHandlerContext r1, int r2, int r3, short r4, boolean r5, io.netty.channel.ChannelPromise r6);

    io.netty.channel.ChannelFuture writePushPromise(io.netty.channel.ChannelHandlerContext r1, int r2, int r3, io.netty.handler.codec.http2.Http2Headers r4, int r5, io.netty.channel.ChannelPromise r6);

    io.netty.channel.ChannelFuture writeRstStream(io.netty.channel.ChannelHandlerContext r1, int r2, long r3, io.netty.channel.ChannelPromise r5);

    io.netty.channel.ChannelFuture writeSettings(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http2.Http2Settings r2, io.netty.channel.ChannelPromise r3);

    io.netty.channel.ChannelFuture writeSettingsAck(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.ChannelPromise r2);

    io.netty.channel.ChannelFuture writeWindowUpdate(io.netty.channel.ChannelHandlerContext r1, int r2, int r3, io.netty.channel.ChannelPromise r4);
}
