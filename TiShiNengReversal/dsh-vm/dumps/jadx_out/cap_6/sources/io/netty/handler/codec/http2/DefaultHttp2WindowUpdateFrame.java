package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultHttp2WindowUpdateFrame extends io.netty.handler.codec.http2.AbstractHttp2StreamFrame implements io.netty.handler.codec.http2.Http2WindowUpdateFrame {
    private final int windowUpdateIncrement;

    public DefaultHttp2WindowUpdateFrame(int r1) {
            r0 = this;
            r0.<init>()
            r0.windowUpdateIncrement = r1
            return
    }

    @Override // io.netty.handler.codec.http2.Http2Frame
    public java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "WINDOW_UPDATE"
            return r0
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2StreamFrame, io.netty.handler.codec.http2.Http2StreamFrame
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.AbstractHttp2StreamFrame stream(io.netty.handler.codec.http2.Http2FrameStream r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2WindowUpdateFrame r1 = r0.stream(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2StreamFrame, io.netty.handler.codec.http2.Http2StreamFrame
    public io.netty.handler.codec.http2.DefaultHttp2WindowUpdateFrame stream(io.netty.handler.codec.http2.Http2FrameStream r1) {
            r0 = this;
            super.stream(r1)
            return r0
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2StreamFrame, io.netty.handler.codec.http2.Http2StreamFrame
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2StreamFrame stream(io.netty.handler.codec.http2.Http2FrameStream r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2WindowUpdateFrame r1 = r0.stream(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.Http2WindowUpdateFrame
    public int windowSizeIncrement() {
            r1 = this;
            int r0 = r1.windowUpdateIncrement
            return r0
    }
}
