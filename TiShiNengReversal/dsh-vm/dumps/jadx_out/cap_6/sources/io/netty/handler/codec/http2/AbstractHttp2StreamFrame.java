package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractHttp2StreamFrame implements io.netty.handler.codec.http2.Http2StreamFrame {
    private io.netty.handler.codec.http2.Http2FrameStream stream;

    public AbstractHttp2StreamFrame() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof io.netty.handler.codec.http2.Http2StreamFrame
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            io.netty.handler.codec.http2.Http2StreamFrame r4 = (io.netty.handler.codec.http2.Http2StreamFrame) r4
            io.netty.handler.codec.http2.Http2FrameStream r0 = r3.stream
            io.netty.handler.codec.http2.Http2FrameStream r2 = r4.stream()
            if (r0 == r2) goto L20
            io.netty.handler.codec.http2.Http2FrameStream r0 = r3.stream
            if (r0 == 0) goto L1f
            io.netty.handler.codec.http2.Http2FrameStream r4 = r4.stream()
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L1f
            goto L20
        L1f:
            return r1
        L20:
            r4 = 1
            return r4
    }

    public int hashCode() {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameStream r0 = r1.stream
            if (r0 != 0) goto L9
            int r0 = super.hashCode()
            return r0
        L9:
            int r0 = r0.hashCode()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2StreamFrame
    public io.netty.handler.codec.http2.AbstractHttp2StreamFrame stream(io.netty.handler.codec.http2.Http2FrameStream r1) {
            r0 = this;
            r0.stream = r1
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2StreamFrame
    public io.netty.handler.codec.http2.Http2FrameStream stream() {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameStream r0 = r1.stream
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2StreamFrame
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2StreamFrame stream(io.netty.handler.codec.http2.Http2FrameStream r1) {
            r0 = this;
            io.netty.handler.codec.http2.AbstractHttp2StreamFrame r1 = r0.stream(r1)
            return r1
    }
}
