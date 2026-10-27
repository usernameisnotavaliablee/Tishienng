package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class WebSocketClientHandshakerFactory {
    private WebSocketClientHandshakerFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker newHandshaker(java.net.URI r6, io.netty.handler.codec.http.websocketx.WebSocketVersion r7, java.lang.String r8, boolean r9, io.netty.handler.codec.http.HttpHeaders r10) {
            r5 = 65536(0x10000, float:9.1835E-41)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker r6 = newHandshaker(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker newHandshaker(java.net.URI r8, io.netty.handler.codec.http.websocketx.WebSocketVersion r9, java.lang.String r10, boolean r11, io.netty.handler.codec.http.HttpHeaders r12, int r13) {
            r6 = 1
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker r8 = newHandshaker(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker newHandshaker(java.net.URI r10, io.netty.handler.codec.http.websocketx.WebSocketVersion r11, java.lang.String r12, boolean r13, io.netty.handler.codec.http.HttpHeaders r14, int r15, boolean r16, boolean r17) {
            r7 = 0
            r8 = -1
            r6 = 1
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker r10 = newHandshaker(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    public static io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker newHandshaker(java.net.URI r12, io.netty.handler.codec.http.websocketx.WebSocketVersion r13, java.lang.String r14, boolean r15, io.netty.handler.codec.http.HttpHeaders r16, int r17, boolean r18, boolean r19, long r20) {
            io.netty.handler.codec.http.websocketx.WebSocketVersion r2 = io.netty.handler.codec.http.websocketx.WebSocketVersion.V13
            if (r13 != r2) goto L17
            io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker13 r0 = new io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker13
            r1 = r12
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        L17:
            io.netty.handler.codec.http.websocketx.WebSocketVersion r3 = io.netty.handler.codec.http.websocketx.WebSocketVersion.V08
            if (r13 != r3) goto L2e
            io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker08 r1 = new io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker08
            r2 = r12
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
        L2e:
            io.netty.handler.codec.http.websocketx.WebSocketVersion r3 = io.netty.handler.codec.http.websocketx.WebSocketVersion.V07
            if (r13 != r3) goto L45
            io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker07 r1 = new io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker07
            r2 = r12
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
        L45:
            io.netty.handler.codec.http.websocketx.WebSocketVersion r3 = io.netty.handler.codec.http.websocketx.WebSocketVersion.V00
            if (r13 != r3) goto L57
            io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker00 r1 = new io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker00
            r2 = r12
            r4 = r14
            r5 = r16
            r6 = r17
            r7 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        L57:
            io.netty.handler.codec.http.websocketx.WebSocketHandshakeException r12 = new io.netty.handler.codec.http.websocketx.WebSocketHandshakeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Protocol version "
            r14.append(r15)
            r14.append(r13)
            java.lang.String r13 = " not supported."
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            r12.<init>(r13)
            throw r12
    }

    public static io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker newHandshaker(java.net.URI r13, io.netty.handler.codec.http.websocketx.WebSocketVersion r14, java.lang.String r15, boolean r16, io.netty.handler.codec.http.HttpHeaders r17, int r18, boolean r19, boolean r20, long r21, boolean r23) {
            io.netty.handler.codec.http.websocketx.WebSocketVersion r2 = io.netty.handler.codec.http.websocketx.WebSocketVersion.V13
            if (r14 != r2) goto L1a
            io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker13 r0 = new io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker13
            r1 = r13
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r11 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11)
            return r0
        L1a:
            io.netty.handler.codec.http.websocketx.WebSocketVersion r3 = io.netty.handler.codec.http.websocketx.WebSocketVersion.V08
            if (r14 != r3) goto L34
            io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker08 r1 = new io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker08
            r2 = r13
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r12 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return r1
        L34:
            io.netty.handler.codec.http.websocketx.WebSocketVersion r3 = io.netty.handler.codec.http.websocketx.WebSocketVersion.V07
            if (r14 != r3) goto L4e
            io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker07 r1 = new io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker07
            r2 = r13
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r12 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return r1
        L4e:
            io.netty.handler.codec.http.websocketx.WebSocketVersion r3 = io.netty.handler.codec.http.websocketx.WebSocketVersion.V00
            if (r14 != r3) goto L62
            io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker00 r1 = new io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker00
            r2 = r13
            r4 = r15
            r5 = r17
            r6 = r18
            r7 = r21
            r9 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7, r9)
            return r1
        L62:
            io.netty.handler.codec.http.websocketx.WebSocketHandshakeException r13 = new io.netty.handler.codec.http.websocketx.WebSocketHandshakeException
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "Protocol version "
            r15.append(r0)
            r15.append(r14)
            java.lang.String r14 = " not supported."
            r15.append(r14)
            java.lang.String r14 = r15.toString()
            r13.<init>(r14)
            throw r13
    }
}
