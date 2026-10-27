package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum WebSocketVersion extends java.lang.Enum<io.netty.handler.codec.http.websocketx.WebSocketVersion> {
    private static final /* synthetic */ io.netty.handler.codec.http.websocketx.WebSocketVersion[] $VALUES = null;
    public static final io.netty.handler.codec.http.websocketx.WebSocketVersion UNKNOWN = null;
    public static final io.netty.handler.codec.http.websocketx.WebSocketVersion V00 = null;
    public static final io.netty.handler.codec.http.websocketx.WebSocketVersion V07 = null;
    public static final io.netty.handler.codec.http.websocketx.WebSocketVersion V08 = null;
    public static final io.netty.handler.codec.http.websocketx.WebSocketVersion V13 = null;

    static {
            io.netty.handler.codec.http.websocketx.WebSocketVersion r0 = new io.netty.handler.codec.http.websocketx.WebSocketVersion
            java.lang.String r1 = "UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2)
            io.netty.handler.codec.http.websocketx.WebSocketVersion.UNKNOWN = r0
            io.netty.handler.codec.http.websocketx.WebSocketVersion r1 = new io.netty.handler.codec.http.websocketx.WebSocketVersion
            java.lang.String r3 = "V00"
            r4 = 1
            r1.<init>(r3, r4)
            io.netty.handler.codec.http.websocketx.WebSocketVersion.V00 = r1
            io.netty.handler.codec.http.websocketx.WebSocketVersion r3 = new io.netty.handler.codec.http.websocketx.WebSocketVersion
            java.lang.String r5 = "V07"
            r6 = 2
            r3.<init>(r5, r6)
            io.netty.handler.codec.http.websocketx.WebSocketVersion.V07 = r3
            io.netty.handler.codec.http.websocketx.WebSocketVersion r5 = new io.netty.handler.codec.http.websocketx.WebSocketVersion
            java.lang.String r7 = "V08"
            r8 = 3
            r5.<init>(r7, r8)
            io.netty.handler.codec.http.websocketx.WebSocketVersion.V08 = r5
            io.netty.handler.codec.http.websocketx.WebSocketVersion r7 = new io.netty.handler.codec.http.websocketx.WebSocketVersion
            java.lang.String r9 = "V13"
            r10 = 4
            r7.<init>(r9, r10)
            io.netty.handler.codec.http.websocketx.WebSocketVersion.V13 = r7
            r9 = 5
            io.netty.handler.codec.http.websocketx.WebSocketVersion[] r9 = new io.netty.handler.codec.http.websocketx.WebSocketVersion[r9]
            r9[r2] = r0
            r9[r4] = r1
            r9[r6] = r3
            r9[r8] = r5
            r9[r10] = r7
            io.netty.handler.codec.http.websocketx.WebSocketVersion.$VALUES = r9
            return
    }

    WebSocketVersion(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static io.netty.handler.codec.http.websocketx.WebSocketVersion valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.codec.http.websocketx.WebSocketVersion> r0 = io.netty.handler.codec.http.websocketx.WebSocketVersion.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.codec.http.websocketx.WebSocketVersion r1 = (io.netty.handler.codec.http.websocketx.WebSocketVersion) r1
            return r1
    }

    public static io.netty.handler.codec.http.websocketx.WebSocketVersion[] values() {
            io.netty.handler.codec.http.websocketx.WebSocketVersion[] r0 = io.netty.handler.codec.http.websocketx.WebSocketVersion.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.codec.http.websocketx.WebSocketVersion[] r0 = (io.netty.handler.codec.http.websocketx.WebSocketVersion[]) r0
            return r0
    }

    public java.lang.String toHttpHeaderValue() {
            r3 = this;
            io.netty.handler.codec.http.websocketx.WebSocketVersion r0 = io.netty.handler.codec.http.websocketx.WebSocketVersion.V00
            if (r3 != r0) goto L7
            java.lang.String r0 = "0"
            return r0
        L7:
            io.netty.handler.codec.http.websocketx.WebSocketVersion r0 = io.netty.handler.codec.http.websocketx.WebSocketVersion.V07
            if (r3 != r0) goto Le
            java.lang.String r0 = "7"
            return r0
        Le:
            io.netty.handler.codec.http.websocketx.WebSocketVersion r0 = io.netty.handler.codec.http.websocketx.WebSocketVersion.V08
            if (r3 != r0) goto L15
            java.lang.String r0 = "8"
            return r0
        L15:
            io.netty.handler.codec.http.websocketx.WebSocketVersion r0 = io.netty.handler.codec.http.websocketx.WebSocketVersion.V13
            if (r3 != r0) goto L1c
            java.lang.String r0 = "13"
            return r0
        L1c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown web socket version: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
