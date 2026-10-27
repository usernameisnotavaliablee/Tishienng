package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface Http2ConnectionDecoder extends java.io.Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    io.netty.handler.codec.http2.Http2Connection connection();

    void decodeFrame(io.netty.channel.ChannelHandlerContext r1, io.netty.buffer.ByteBuf r2, java.util.List<java.lang.Object> r3) throws io.netty.handler.codec.http2.Http2Exception;

    io.netty.handler.codec.http2.Http2LocalFlowController flowController();

    io.netty.handler.codec.http2.Http2FrameListener frameListener();

    void frameListener(io.netty.handler.codec.http2.Http2FrameListener r1);

    void lifecycleManager(io.netty.handler.codec.http2.Http2LifecycleManager r1);

    io.netty.handler.codec.http2.Http2Settings localSettings();

    boolean prefaceReceived();
}
