package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class CorruptedWebSocketFrameException extends io.netty.handler.codec.CorruptedFrameException {
    private static final long serialVersionUID = 3918055132492988338L;
    private final io.netty.handler.codec.http.websocketx.WebSocketCloseStatus closeStatus;

    public CorruptedWebSocketFrameException() {
            r2 = this;
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r0 = io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.PROTOCOL_ERROR
            r1 = 0
            r2.<init>(r0, r1, r1)
            return
    }

    public CorruptedWebSocketFrameException(io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public CorruptedWebSocketFrameException(io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r1, java.lang.String r2, java.lang.Throwable r3) {
            r0 = this;
            if (r2 != 0) goto L6
            java.lang.String r2 = r1.reasonText()
        L6:
            r0.<init>(r2, r3)
            r0.closeStatus = r1
            return
    }

    public CorruptedWebSocketFrameException(io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r2, java.lang.Throwable r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    public io.netty.handler.codec.http.websocketx.WebSocketCloseStatus closeStatus() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r0 = r1.closeStatus
            return r0
    }
}
