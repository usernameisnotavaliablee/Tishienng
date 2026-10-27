package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface Http2ConnectionEncoder extends io.netty.handler.codec.http2.Http2FrameWriter {
    io.netty.handler.codec.http2.Http2Connection connection();

    io.netty.handler.codec.http2.Http2RemoteFlowController flowController();

    io.netty.handler.codec.http2.Http2FrameWriter frameWriter();

    void lifecycleManager(io.netty.handler.codec.http2.Http2LifecycleManager r1);

    io.netty.handler.codec.http2.Http2Settings pollSentSettings();

    void remoteSettings(io.netty.handler.codec.http2.Http2Settings r1) throws io.netty.handler.codec.http2.Http2Exception;

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    io.netty.channel.ChannelFuture writeFrame(io.netty.channel.ChannelHandlerContext r1, byte r2, int r3, io.netty.handler.codec.http2.Http2Flags r4, io.netty.buffer.ByteBuf r5, io.netty.channel.ChannelPromise r6);
}
