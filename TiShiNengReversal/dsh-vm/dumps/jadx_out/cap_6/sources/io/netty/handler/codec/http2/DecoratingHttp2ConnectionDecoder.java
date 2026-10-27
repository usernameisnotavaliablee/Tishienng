package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DecoratingHttp2ConnectionDecoder implements io.netty.handler.codec.http2.Http2ConnectionDecoder {
    private final io.netty.handler.codec.http2.Http2ConnectionDecoder delegate;

    public DecoratingHttp2ConnectionDecoder(io.netty.handler.codec.http2.Http2ConnectionDecoder r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "delegate"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.http2.Http2ConnectionDecoder r2 = (io.netty.handler.codec.http2.Http2ConnectionDecoder) r2
            r1.delegate = r2
            return
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionDecoder, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            io.netty.handler.codec.http2.Http2ConnectionDecoder r0 = r1.delegate
            r0.close()
            return
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionDecoder
    public io.netty.handler.codec.http2.Http2Connection connection() {
            r1 = this;
            io.netty.handler.codec.http2.Http2ConnectionDecoder r0 = r1.delegate
            io.netty.handler.codec.http2.Http2Connection r0 = r0.connection()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionDecoder
    public void decodeFrame(io.netty.channel.ChannelHandlerContext r2, io.netty.buffer.ByteBuf r3, java.util.List<java.lang.Object> r4) throws io.netty.handler.codec.http2.Http2Exception {
            r1 = this;
            io.netty.handler.codec.http2.Http2ConnectionDecoder r0 = r1.delegate
            r0.decodeFrame(r2, r3, r4)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionDecoder
    public io.netty.handler.codec.http2.Http2LocalFlowController flowController() {
            r1 = this;
            io.netty.handler.codec.http2.Http2ConnectionDecoder r0 = r1.delegate
            io.netty.handler.codec.http2.Http2LocalFlowController r0 = r0.flowController()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionDecoder
    public io.netty.handler.codec.http2.Http2FrameListener frameListener() {
            r1 = this;
            io.netty.handler.codec.http2.Http2ConnectionDecoder r0 = r1.delegate
            io.netty.handler.codec.http2.Http2FrameListener r0 = r0.frameListener()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionDecoder
    public void frameListener(io.netty.handler.codec.http2.Http2FrameListener r2) {
            r1 = this;
            io.netty.handler.codec.http2.Http2ConnectionDecoder r0 = r1.delegate
            r0.frameListener(r2)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionDecoder
    public void lifecycleManager(io.netty.handler.codec.http2.Http2LifecycleManager r2) {
            r1 = this;
            io.netty.handler.codec.http2.Http2ConnectionDecoder r0 = r1.delegate
            r0.lifecycleManager(r2)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionDecoder
    public io.netty.handler.codec.http2.Http2Settings localSettings() {
            r1 = this;
            io.netty.handler.codec.http2.Http2ConnectionDecoder r0 = r1.delegate
            io.netty.handler.codec.http2.Http2Settings r0 = r0.localSettings()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionDecoder
    public boolean prefaceReceived() {
            r1 = this;
            io.netty.handler.codec.http2.Http2ConnectionDecoder r0 = r1.delegate
            boolean r0 = r0.prefaceReceived()
            return r0
    }
}
