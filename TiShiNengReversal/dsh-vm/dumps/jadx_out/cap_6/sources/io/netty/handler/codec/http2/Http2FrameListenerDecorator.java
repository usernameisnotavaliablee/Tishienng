package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Http2FrameListenerDecorator implements io.netty.handler.codec.http2.Http2FrameListener {
    protected final io.netty.handler.codec.http2.Http2FrameListener listener;

    public Http2FrameListenerDecorator(io.netty.handler.codec.http2.Http2FrameListener r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "listener"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.http2.Http2FrameListener r2 = (io.netty.handler.codec.http2.Http2FrameListener) r2
            r1.listener = r2
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListener
    public int onDataRead(io.netty.channel.ChannelHandlerContext r7, int r8, io.netty.buffer.ByteBuf r9, int r10, boolean r11) throws io.netty.handler.codec.http2.Http2Exception {
            r6 = this;
            io.netty.handler.codec.http2.Http2FrameListener r0 = r6.listener
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            int r7 = r0.onDataRead(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListener
    public void onGoAwayRead(io.netty.channel.ChannelHandlerContext r7, int r8, long r9, io.netty.buffer.ByteBuf r11) throws io.netty.handler.codec.http2.Http2Exception {
            r6 = this;
            io.netty.handler.codec.http2.Http2FrameListener r0 = r6.listener
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r0.onGoAwayRead(r1, r2, r3, r5)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListener
    public void onHeadersRead(io.netty.channel.ChannelHandlerContext r10, int r11, io.netty.handler.codec.http2.Http2Headers r12, int r13, short r14, boolean r15, int r16, boolean r17) throws io.netty.handler.codec.http2.Http2Exception {
            r9 = this;
            io.netty.handler.codec.http2.Http2FrameListener r0 = r9.listener
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r0.onHeadersRead(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListener
    public void onHeadersRead(io.netty.channel.ChannelHandlerContext r7, int r8, io.netty.handler.codec.http2.Http2Headers r9, int r10, boolean r11) throws io.netty.handler.codec.http2.Http2Exception {
            r6 = this;
            io.netty.handler.codec.http2.Http2FrameListener r0 = r6.listener
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.onHeadersRead(r1, r2, r3, r4, r5)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListener
    public void onPingAckRead(io.netty.channel.ChannelHandlerContext r2, long r3) throws io.netty.handler.codec.http2.Http2Exception {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameListener r0 = r1.listener
            r0.onPingAckRead(r2, r3)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListener
    public void onPingRead(io.netty.channel.ChannelHandlerContext r2, long r3) throws io.netty.handler.codec.http2.Http2Exception {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameListener r0 = r1.listener
            r0.onPingRead(r2, r3)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListener
    public void onPriorityRead(io.netty.channel.ChannelHandlerContext r7, int r8, int r9, short r10, boolean r11) throws io.netty.handler.codec.http2.Http2Exception {
            r6 = this;
            io.netty.handler.codec.http2.Http2FrameListener r0 = r6.listener
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.onPriorityRead(r1, r2, r3, r4, r5)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListener
    public void onPushPromiseRead(io.netty.channel.ChannelHandlerContext r7, int r8, int r9, io.netty.handler.codec.http2.Http2Headers r10, int r11) throws io.netty.handler.codec.http2.Http2Exception {
            r6 = this;
            io.netty.handler.codec.http2.Http2FrameListener r0 = r6.listener
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.onPushPromiseRead(r1, r2, r3, r4, r5)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListener
    public void onRstStreamRead(io.netty.channel.ChannelHandlerContext r2, int r3, long r4) throws io.netty.handler.codec.http2.Http2Exception {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameListener r0 = r1.listener
            r0.onRstStreamRead(r2, r3, r4)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListener
    public void onSettingsAckRead(io.netty.channel.ChannelHandlerContext r2) throws io.netty.handler.codec.http2.Http2Exception {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameListener r0 = r1.listener
            r0.onSettingsAckRead(r2)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListener
    public void onSettingsRead(io.netty.channel.ChannelHandlerContext r2, io.netty.handler.codec.http2.Http2Settings r3) throws io.netty.handler.codec.http2.Http2Exception {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameListener r0 = r1.listener
            r0.onSettingsRead(r2, r3)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListener
    public void onUnknownFrame(io.netty.channel.ChannelHandlerContext r7, byte r8, int r9, io.netty.handler.codec.http2.Http2Flags r10, io.netty.buffer.ByteBuf r11) throws io.netty.handler.codec.http2.Http2Exception {
            r6 = this;
            io.netty.handler.codec.http2.Http2FrameListener r0 = r6.listener
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.onUnknownFrame(r1, r2, r3, r4, r5)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListener
    public void onWindowUpdateRead(io.netty.channel.ChannelHandlerContext r2, int r3, int r4) throws io.netty.handler.codec.http2.Http2Exception {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameListener r0 = r1.listener
            r0.onWindowUpdateRead(r2, r3, r4)
            return
    }
}
