package io.netty.handler.codec.http.websocketx.extensions.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class WebSocketServerCompressionHandler extends io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtensionHandler {
    public WebSocketServerCompressionHandler() {
            r4 = this;
            io.netty.handler.codec.http.websocketx.extensions.compression.PerMessageDeflateServerExtensionHandshaker r0 = new io.netty.handler.codec.http.websocketx.extensions.compression.PerMessageDeflateServerExtensionHandshaker
            r0.<init>()
            io.netty.handler.codec.http.websocketx.extensions.compression.DeflateFrameServerExtensionHandshaker r1 = new io.netty.handler.codec.http.websocketx.extensions.compression.DeflateFrameServerExtensionHandshaker
            r1.<init>()
            r2 = 2
            io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtensionHandshaker[] r2 = new io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtensionHandshaker[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            r4.<init>(r2)
            return
    }
}
