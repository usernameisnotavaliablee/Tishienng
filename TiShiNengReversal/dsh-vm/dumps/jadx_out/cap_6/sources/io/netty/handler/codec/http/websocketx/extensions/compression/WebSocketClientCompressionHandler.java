package io.netty.handler.codec.http.websocketx.extensions.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class WebSocketClientCompressionHandler extends io.netty.handler.codec.http.websocketx.extensions.WebSocketClientExtensionHandler {
    public static final io.netty.handler.codec.http.websocketx.extensions.compression.WebSocketClientCompressionHandler INSTANCE = null;

    static {
            io.netty.handler.codec.http.websocketx.extensions.compression.WebSocketClientCompressionHandler r0 = new io.netty.handler.codec.http.websocketx.extensions.compression.WebSocketClientCompressionHandler
            r0.<init>()
            io.netty.handler.codec.http.websocketx.extensions.compression.WebSocketClientCompressionHandler.INSTANCE = r0
            return
    }

    private WebSocketClientCompressionHandler() {
            r6 = this;
            io.netty.handler.codec.http.websocketx.extensions.compression.PerMessageDeflateClientExtensionHandshaker r0 = new io.netty.handler.codec.http.websocketx.extensions.compression.PerMessageDeflateClientExtensionHandshaker
            r0.<init>()
            io.netty.handler.codec.http.websocketx.extensions.compression.DeflateFrameClientExtensionHandshaker r1 = new io.netty.handler.codec.http.websocketx.extensions.compression.DeflateFrameClientExtensionHandshaker
            r2 = 0
            r1.<init>(r2)
            io.netty.handler.codec.http.websocketx.extensions.compression.DeflateFrameClientExtensionHandshaker r3 = new io.netty.handler.codec.http.websocketx.extensions.compression.DeflateFrameClientExtensionHandshaker
            r4 = 1
            r3.<init>(r4)
            r5 = 3
            io.netty.handler.codec.http.websocketx.extensions.WebSocketClientExtensionHandshaker[] r5 = new io.netty.handler.codec.http.websocketx.extensions.WebSocketClientExtensionHandshaker[r5]
            r5[r2] = r0
            r5[r4] = r1
            r0 = 2
            r5[r0] = r3
            r6.<init>(r5)
            return
    }
}
