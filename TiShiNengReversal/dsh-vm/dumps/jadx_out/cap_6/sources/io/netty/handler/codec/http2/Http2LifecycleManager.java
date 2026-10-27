package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface Http2LifecycleManager {
    void closeStream(io.netty.handler.codec.http2.Http2Stream r1, io.netty.channel.ChannelFuture r2);

    void closeStreamLocal(io.netty.handler.codec.http2.Http2Stream r1, io.netty.channel.ChannelFuture r2);

    void closeStreamRemote(io.netty.handler.codec.http2.Http2Stream r1, io.netty.channel.ChannelFuture r2);

    io.netty.channel.ChannelFuture goAway(io.netty.channel.ChannelHandlerContext r1, int r2, long r3, io.netty.buffer.ByteBuf r5, io.netty.channel.ChannelPromise r6);

    void onError(io.netty.channel.ChannelHandlerContext r1, boolean r2, java.lang.Throwable r3);

    io.netty.channel.ChannelFuture resetStream(io.netty.channel.ChannelHandlerContext r1, int r2, long r3, io.netty.channel.ChannelPromise r5);
}
