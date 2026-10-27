package io.netty.handler.codec.http.websocketx.extensions.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class PerFrameDeflateDecoder extends io.netty.handler.codec.http.websocketx.extensions.compression.DeflateDecoder {
    PerFrameDeflateDecoder(boolean r2) {
            r1 = this;
            io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilter r0 = io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilter.NEVER_SKIP
            r1.<init>(r2, r0)
            return
    }

    PerFrameDeflateDecoder(boolean r1, io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilter r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // io.netty.handler.codec.MessageToMessageDecoder
    public boolean acceptInboundMessage(java.lang.Object r4) throws java.lang.Exception {
            r3 = this;
            boolean r0 = super.acceptInboundMessage(r4)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = r4
            io.netty.handler.codec.http.websocketx.WebSocketFrame r0 = (io.netty.handler.codec.http.websocketx.WebSocketFrame) r0
            io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilter r2 = r3.extensionDecoderFilter()
            boolean r2 = r2.mustSkip(r0)
            if (r2 == 0) goto L16
            return r1
        L16:
            boolean r2 = r4 instanceof io.netty.handler.codec.http.websocketx.TextWebSocketFrame
            if (r2 != 0) goto L22
            boolean r2 = r4 instanceof io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame
            if (r2 != 0) goto L22
            boolean r4 = r4 instanceof io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame
            if (r4 == 0) goto L2c
        L22:
            int r4 = r0.rsv()
            r4 = r4 & 4
            if (r4 <= 0) goto L2c
            r4 = 1
            return r4
        L2c:
            return r1
    }

    @Override // io.netty.handler.codec.http.websocketx.extensions.compression.DeflateDecoder
    protected boolean appendFrameTail(io.netty.handler.codec.http.websocketx.WebSocketFrame r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // io.netty.handler.codec.http.websocketx.extensions.compression.DeflateDecoder
    protected int newRsv(io.netty.handler.codec.http.websocketx.WebSocketFrame r1) {
            r0 = this;
            int r1 = r1.rsv()
            r1 = r1 ^ 4
            return r1
    }
}
