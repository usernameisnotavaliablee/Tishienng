package io.netty.handler.codec.http.websocketx.extensions.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class PerMessageDeflateDecoder extends io.netty.handler.codec.http.websocketx.extensions.compression.DeflateDecoder {
    private boolean compressing;

    PerMessageDeflateDecoder(boolean r2) {
            r1 = this;
            io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilter r0 = io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilter.NEVER_SKIP
            r1.<init>(r2, r0)
            return
    }

    PerMessageDeflateDecoder(boolean r1, io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilter r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // io.netty.handler.codec.MessageToMessageDecoder
    public boolean acceptInboundMessage(java.lang.Object r3) throws java.lang.Exception {
            r2 = this;
            boolean r0 = super.acceptInboundMessage(r3)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            io.netty.handler.codec.http.websocketx.WebSocketFrame r3 = (io.netty.handler.codec.http.websocketx.WebSocketFrame) r3
            io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilter r0 = r2.extensionDecoderFilter()
            boolean r0 = r0.mustSkip(r3)
            if (r0 == 0) goto L21
            boolean r3 = r2.compressing
            if (r3 != 0) goto L19
            return r1
        L19:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot skip per message deflate decoder, compression in progress"
            r3.<init>(r0)
            throw r3
        L21:
            boolean r0 = r3 instanceof io.netty.handler.codec.http.websocketx.TextWebSocketFrame
            if (r0 != 0) goto L29
            boolean r0 = r3 instanceof io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame
            if (r0 == 0) goto L31
        L29:
            int r0 = r3.rsv()
            r0 = r0 & 4
            if (r0 > 0) goto L3b
        L31:
            boolean r3 = r3 instanceof io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame
            if (r3 == 0) goto L3a
            boolean r3 = r2.compressing
            if (r3 == 0) goto L3a
            goto L3b
        L3a:
            return r1
        L3b:
            r3 = 1
            return r3
    }

    @Override // io.netty.handler.codec.http.websocketx.extensions.compression.DeflateDecoder
    protected boolean appendFrameTail(io.netty.handler.codec.http.websocketx.WebSocketFrame r1) {
            r0 = this;
            boolean r1 = r1.isFinalFragment()
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.handler.codec.http.websocketx.extensions.compression.DeflateDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http.websocketx.WebSocketFrame r2, java.util.List<java.lang.Object> r3) throws java.lang.Exception {
            r0 = this;
            super.decode2(r1, r2, r3)
            boolean r1 = r2.isFinalFragment()
            if (r1 == 0) goto Ld
            r1 = 0
            r0.compressing = r1
            return
        Ld:
            boolean r1 = r2 instanceof io.netty.handler.codec.http.websocketx.TextWebSocketFrame
            if (r1 != 0) goto L17
            boolean r1 = r2 instanceof io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame
            if (r1 == 0) goto L16
            goto L17
        L16:
            return
        L17:
            r1 = 1
            r0.compressing = r1
            return
    }

    @Override // io.netty.handler.codec.http.websocketx.extensions.compression.DeflateDecoder, io.netty.handler.codec.MessageToMessageDecoder
    protected /* bridge */ /* synthetic */ void decode(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http.websocketx.WebSocketFrame r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.websocketx.WebSocketFrame r2 = (io.netty.handler.codec.http.websocketx.WebSocketFrame) r2
            r0.decode(r1, r2, r3)
            return
    }

    @Override // io.netty.handler.codec.http.websocketx.extensions.compression.DeflateDecoder
    protected int newRsv(io.netty.handler.codec.http.websocketx.WebSocketFrame r2) {
            r1 = this;
            int r0 = r2.rsv()
            r0 = r0 & 4
            if (r0 <= 0) goto Lf
            int r2 = r2.rsv()
            r2 = r2 ^ 4
            return r2
        Lf:
            int r2 = r2.rsv()
            return r2
    }
}
