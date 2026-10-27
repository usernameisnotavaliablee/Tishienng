package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface SpdySynReplyFrame extends io.netty.handler.codec.spdy.SpdyHeadersFrame {
    @Override // io.netty.handler.codec.spdy.SpdyHeadersFrame
    io.netty.handler.codec.spdy.SpdySynReplyFrame setInvalid();

    @Override // io.netty.handler.codec.spdy.SpdyHeadersFrame, io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    io.netty.handler.codec.spdy.SpdySynReplyFrame setLast(boolean r1);

    @Override // io.netty.handler.codec.spdy.SpdyHeadersFrame, io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    io.netty.handler.codec.spdy.SpdySynReplyFrame setStreamId(int r1);
}
