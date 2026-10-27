package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface Http2FrameReader extends java.io.Closeable {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Configuration {
        io.netty.handler.codec.http2.Http2FrameSizePolicy frameSizePolicy();

        io.netty.handler.codec.http2.Http2HeadersDecoder.Configuration headersConfiguration();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    io.netty.handler.codec.http2.Http2FrameReader.Configuration configuration();

    void readFrame(io.netty.channel.ChannelHandlerContext r1, io.netty.buffer.ByteBuf r2, io.netty.handler.codec.http2.Http2FrameListener r3) throws io.netty.handler.codec.http2.Http2Exception;
}
