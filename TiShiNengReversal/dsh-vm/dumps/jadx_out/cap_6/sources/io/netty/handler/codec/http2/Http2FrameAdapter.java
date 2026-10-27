package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Http2FrameAdapter implements io.netty.handler.codec.http2.Http2FrameListener {
    public Http2FrameAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListener
    public int onDataRead(io.netty.channel.ChannelHandlerContext r1, int r2, io.netty.buffer.ByteBuf r3, int r4, boolean r5) throws io.netty.handler.codec.http2.Http2Exception {
            r0 = this;
            int r1 = r3.readableBytes()
            int r1 = r1 + r4
            return r1
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListener
    public void onGoAwayRead(io.netty.channel.ChannelHandlerContext r1, int r2, long r3, io.netty.buffer.ByteBuf r5) throws io.netty.handler.codec.http2.Http2Exception {
            r0 = this;
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListener
    public void onHeadersRead(io.netty.channel.ChannelHandlerContext r1, int r2, io.netty.handler.codec.http2.Http2Headers r3, int r4, short r5, boolean r6, int r7, boolean r8) throws io.netty.handler.codec.http2.Http2Exception {
            r0 = this;
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListener
    public void onHeadersRead(io.netty.channel.ChannelHandlerContext r1, int r2, io.netty.handler.codec.http2.Http2Headers r3, int r4, boolean r5) throws io.netty.handler.codec.http2.Http2Exception {
            r0 = this;
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListener
    public void onPingAckRead(io.netty.channel.ChannelHandlerContext r1, long r2) throws io.netty.handler.codec.http2.Http2Exception {
            r0 = this;
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListener
    public void onPingRead(io.netty.channel.ChannelHandlerContext r1, long r2) throws io.netty.handler.codec.http2.Http2Exception {
            r0 = this;
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListener
    public void onPriorityRead(io.netty.channel.ChannelHandlerContext r1, int r2, int r3, short r4, boolean r5) throws io.netty.handler.codec.http2.Http2Exception {
            r0 = this;
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListener
    public void onPushPromiseRead(io.netty.channel.ChannelHandlerContext r1, int r2, int r3, io.netty.handler.codec.http2.Http2Headers r4, int r5) throws io.netty.handler.codec.http2.Http2Exception {
            r0 = this;
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListener
    public void onRstStreamRead(io.netty.channel.ChannelHandlerContext r1, int r2, long r3) throws io.netty.handler.codec.http2.Http2Exception {
            r0 = this;
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListener
    public void onSettingsAckRead(io.netty.channel.ChannelHandlerContext r1) throws io.netty.handler.codec.http2.Http2Exception {
            r0 = this;
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListener
    public void onSettingsRead(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http2.Http2Settings r2) throws io.netty.handler.codec.http2.Http2Exception {
            r0 = this;
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListener
    public void onUnknownFrame(io.netty.channel.ChannelHandlerContext r1, byte r2, int r3, io.netty.handler.codec.http2.Http2Flags r4, io.netty.buffer.ByteBuf r5) {
            r0 = this;
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListener
    public void onWindowUpdateRead(io.netty.channel.ChannelHandlerContext r1, int r2, int r3) throws io.netty.handler.codec.http2.Http2Exception {
            r0 = this;
            return
    }
}
