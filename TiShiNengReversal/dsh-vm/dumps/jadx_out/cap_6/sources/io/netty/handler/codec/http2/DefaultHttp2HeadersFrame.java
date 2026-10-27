package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class DefaultHttp2HeadersFrame extends io.netty.handler.codec.http2.AbstractHttp2StreamFrame implements io.netty.handler.codec.http2.Http2HeadersFrame {
    private final boolean endStream;
    private final io.netty.handler.codec.http2.Http2Headers headers;
    private final int padding;

    public DefaultHttp2HeadersFrame(io.netty.handler.codec.http2.Http2Headers r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public DefaultHttp2HeadersFrame(io.netty.handler.codec.http2.Http2Headers r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public DefaultHttp2HeadersFrame(io.netty.handler.codec.http2.Http2Headers r2, boolean r3, int r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "headers"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.http2.Http2Headers r2 = (io.netty.handler.codec.http2.Http2Headers) r2
            r1.headers = r2
            r1.endStream = r3
            io.netty.handler.codec.http2.Http2CodecUtil.verifyPadding(r4)
            r1.padding = r4
            return
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2StreamFrame
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof io.netty.handler.codec.http2.DefaultHttp2HeadersFrame
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            io.netty.handler.codec.http2.DefaultHttp2HeadersFrame r4 = (io.netty.handler.codec.http2.DefaultHttp2HeadersFrame) r4
            boolean r0 = super.equals(r4)
            if (r0 == 0) goto L26
            io.netty.handler.codec.http2.Http2Headers r0 = r3.headers
            io.netty.handler.codec.http2.Http2Headers r2 = r4.headers
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L26
            boolean r0 = r3.endStream
            boolean r2 = r4.endStream
            if (r0 != r2) goto L26
            int r0 = r3.padding
            int r4 = r4.padding
            if (r0 != r4) goto L26
            r4 = 1
            return r4
        L26:
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2StreamFrame
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            io.netty.handler.codec.http2.Http2Headers r1 = r2.headers
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.endStream
            r1 = r1 ^ 1
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.padding
            int r0 = r0 + r1
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2HeadersFrame
    public io.netty.handler.codec.http2.Http2Headers headers() {
            r1 = this;
            io.netty.handler.codec.http2.Http2Headers r0 = r1.headers
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2HeadersFrame
    public boolean isEndStream() {
            r1 = this;
            boolean r0 = r1.endStream
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2Frame
    public java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "HEADERS"
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2HeadersFrame
    public int padding() {
            r1 = this;
            int r0 = r1.padding
            return r0
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2StreamFrame, io.netty.handler.codec.http2.Http2StreamFrame
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.AbstractHttp2StreamFrame stream(io.netty.handler.codec.http2.Http2FrameStream r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2HeadersFrame r1 = r0.stream(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2StreamFrame, io.netty.handler.codec.http2.Http2StreamFrame
    public io.netty.handler.codec.http2.DefaultHttp2HeadersFrame stream(io.netty.handler.codec.http2.Http2FrameStream r1) {
            r0 = this;
            super.stream(r1)
            return r0
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2StreamFrame, io.netty.handler.codec.http2.Http2StreamFrame
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2StreamFrame stream(io.netty.handler.codec.http2.Http2FrameStream r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2HeadersFrame r1 = r0.stream(r1)
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.append(r1)
            java.lang.String r1 = "(stream="
            r0.append(r1)
            io.netty.handler.codec.http2.Http2FrameStream r1 = r2.stream()
            r0.append(r1)
            java.lang.String r1 = ", headers="
            r0.append(r1)
            io.netty.handler.codec.http2.Http2Headers r1 = r2.headers
            r0.append(r1)
            java.lang.String r1 = ", endStream="
            r0.append(r1)
            boolean r1 = r2.endStream
            r0.append(r1)
            java.lang.String r1 = ", padding="
            r0.append(r1)
            int r1 = r2.padding
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
