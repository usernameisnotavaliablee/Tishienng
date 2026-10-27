package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class WebSocketScheme {
    public static final io.netty.handler.codec.http.websocketx.WebSocketScheme WS = null;
    public static final io.netty.handler.codec.http.websocketx.WebSocketScheme WSS = null;
    private final io.netty.util.AsciiString name;
    private final int port;

    static {
            io.netty.handler.codec.http.websocketx.WebSocketScheme r0 = new io.netty.handler.codec.http.websocketx.WebSocketScheme
            r1 = 80
            java.lang.String r2 = "ws"
            r0.<init>(r1, r2)
            io.netty.handler.codec.http.websocketx.WebSocketScheme.WS = r0
            io.netty.handler.codec.http.websocketx.WebSocketScheme r0 = new io.netty.handler.codec.http.websocketx.WebSocketScheme
            r1 = 443(0x1bb, float:6.21E-43)
            java.lang.String r2 = "wss"
            r0.<init>(r1, r2)
            io.netty.handler.codec.http.websocketx.WebSocketScheme.WSS = r0
            return
    }

    private WebSocketScheme(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.port = r1
            io.netty.util.AsciiString r1 = io.netty.util.AsciiString.cached(r2)
            r0.name = r1
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof io.netty.handler.codec.http.websocketx.WebSocketScheme
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            io.netty.handler.codec.http.websocketx.WebSocketScheme r4 = (io.netty.handler.codec.http.websocketx.WebSocketScheme) r4
            int r0 = r4.port()
            int r2 = r3.port
            if (r0 != r2) goto L1e
            io.netty.util.AsciiString r4 = r4.name()
            io.netty.util.AsciiString r0 = r3.name
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L1e
            r4 = 1
            return r4
        L1e:
            return r1
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.port
            int r0 = r0 * 31
            io.netty.util.AsciiString r1 = r2.name
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public io.netty.util.AsciiString name() {
            r1 = this;
            io.netty.util.AsciiString r0 = r1.name
            return r0
    }

    public int port() {
            r1 = this;
            int r0 = r1.port
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            io.netty.util.AsciiString r0 = r1.name
            java.lang.String r0 = r0.toString()
            return r0
    }
}
