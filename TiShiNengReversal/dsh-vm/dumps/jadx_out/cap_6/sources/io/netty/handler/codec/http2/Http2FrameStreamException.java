package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class Http2FrameStreamException extends java.lang.Exception {
    private static final long serialVersionUID = -4407186173493887044L;
    private final io.netty.handler.codec.http2.Http2Error error;
    private final io.netty.handler.codec.http2.Http2FrameStream stream;

    public Http2FrameStreamException(io.netty.handler.codec.http2.Http2FrameStream r2, io.netty.handler.codec.http2.Http2Error r3, java.lang.Throwable r4) {
            r1 = this;
            java.lang.String r0 = r4.getMessage()
            r1.<init>(r0, r4)
            java.lang.String r4 = "stream"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r4)
            io.netty.handler.codec.http2.Http2FrameStream r2 = (io.netty.handler.codec.http2.Http2FrameStream) r2
            r1.stream = r2
            java.lang.String r2 = "error"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r2)
            io.netty.handler.codec.http2.Http2Error r2 = (io.netty.handler.codec.http2.Http2Error) r2
            r1.error = r2
            return
    }

    public io.netty.handler.codec.http2.Http2Error error() {
            r1 = this;
            io.netty.handler.codec.http2.Http2Error r0 = r1.error
            return r0
    }

    public io.netty.handler.codec.http2.Http2FrameStream stream() {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameStream r0 = r1.stream
            return r0
    }
}
