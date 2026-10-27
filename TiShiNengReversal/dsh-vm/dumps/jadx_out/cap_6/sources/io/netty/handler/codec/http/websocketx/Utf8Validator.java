package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class Utf8Validator implements io.netty.util.ByteProcessor {
    private static final byte[] STATES = null;
    private static final byte[] TYPES = null;
    private static final int UTF8_ACCEPT = 0;
    private static final int UTF8_REJECT = 12;
    private boolean checking;
    private int codep;
    private int state;

    static {
            r0 = 256(0x100, float:3.59E-43)
            byte[] r0 = new byte[r0]
            r0 = {x0014: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 10, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 3, 3, 11, 6, 6, 6, 5, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8} // fill-array
            io.netty.handler.codec.http.websocketx.Utf8Validator.TYPES = r0
            r0 = 108(0x6c, float:1.51E-43)
            byte[] r0 = new byte[r0]
            r0 = {x0098: FILL_ARRAY_DATA , data: [0, 12, 24, 36, 60, 96, 84, 12, 12, 12, 48, 72, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 0, 12, 12, 12, 12, 12, 0, 12, 0, 12, 12, 12, 24, 12, 12, 12, 12, 12, 24, 12, 24, 12, 12, 12, 12, 12, 12, 12, 12, 12, 24, 12, 12, 12, 12, 12, 24, 12, 12, 12, 12, 12, 12, 12, 24, 12, 12, 12, 12, 12, 12, 12, 12, 12, 36, 12, 36, 12, 12, 12, 36, 12, 12, 12, 12, 12, 36, 12, 36, 12, 12, 12, 36, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12} // fill-array
            io.netty.handler.codec.http.websocketx.Utf8Validator.STATES = r0
            return
    }

    Utf8Validator() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.state = r0
            return
    }

    public void check(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            r0 = 1
            r1.checking = r0
            r2.forEachByte(r1)
            return
    }

    public void finish() {
            r3 = this;
            r0 = 0
            r3.checking = r0
            r3.codep = r0
            int r1 = r3.state
            if (r1 != 0) goto La
            return
        La:
            r3.state = r0
            io.netty.handler.codec.http.websocketx.CorruptedWebSocketFrameException r0 = new io.netty.handler.codec.http.websocketx.CorruptedWebSocketFrameException
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r1 = io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.INVALID_PAYLOAD_DATA
            java.lang.String r2 = "bytes are not UTF-8"
            r0.<init>(r1, r2)
            throw r0
    }

    public boolean isChecking() {
            r1 = this;
            boolean r0 = r1.checking
            return r0
    }

    public boolean process(byte r4) throws java.lang.Exception {
            r3 = this;
            byte[] r0 = io.netty.handler.codec.http.websocketx.Utf8Validator.TYPES
            r1 = r4 & 255(0xff, float:3.57E-43)
            r0 = r0[r1]
            int r1 = r3.state
            if (r1 == 0) goto L12
            r4 = r4 & 63
            int r2 = r3.codep
            int r2 = r2 << 6
            r4 = r4 | r2
            goto L16
        L12:
            r2 = 255(0xff, float:3.57E-43)
            int r2 = r2 >> r0
            r4 = r4 & r2
        L16:
            r3.codep = r4
            byte[] r4 = io.netty.handler.codec.http.websocketx.Utf8Validator.STATES
            int r1 = r1 + r0
            r4 = r4[r1]
            r3.state = r4
            r0 = 12
            if (r4 == r0) goto L25
            r4 = 1
            return r4
        L25:
            r4 = 0
            r3.checking = r4
            io.netty.handler.codec.http.websocketx.CorruptedWebSocketFrameException r4 = new io.netty.handler.codec.http.websocketx.CorruptedWebSocketFrameException
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r0 = io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.INVALID_PAYLOAD_DATA
            java.lang.String r1 = "bytes are not UTF-8"
            r4.<init>(r0, r1)
            throw r4
    }
}
