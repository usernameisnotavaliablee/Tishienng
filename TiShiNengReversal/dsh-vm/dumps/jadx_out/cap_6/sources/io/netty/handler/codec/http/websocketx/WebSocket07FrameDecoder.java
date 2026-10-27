package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class WebSocket07FrameDecoder extends io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder {
    public WebSocket07FrameDecoder(io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public WebSocket07FrameDecoder(boolean r2, boolean r3, int r4) {
            r1 = this;
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r0 = io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig.newBuilder()
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r2 = r0.expectMaskedFrames(r2)
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r2 = r2.allowExtensions(r3)
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r2 = r2.maxFramePayloadLength(r4)
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r2 = r2.build()
            r1.<init>(r2)
            return
    }

    public WebSocket07FrameDecoder(boolean r2, boolean r3, int r4, boolean r5) {
            r1 = this;
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r0 = io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig.newBuilder()
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r2 = r0.expectMaskedFrames(r2)
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r2 = r2.allowExtensions(r3)
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r2 = r2.maxFramePayloadLength(r4)
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r2 = r2.allowMaskMismatch(r5)
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r2 = r2.build()
            r1.<init>(r2)
            return
    }
}
