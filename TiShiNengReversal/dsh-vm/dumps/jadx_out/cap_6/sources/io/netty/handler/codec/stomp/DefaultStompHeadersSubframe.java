package io.netty.handler.codec.stomp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultStompHeadersSubframe implements io.netty.handler.codec.stomp.StompHeadersSubframe {
    protected final io.netty.handler.codec.stomp.StompCommand command;
    protected io.netty.handler.codec.DecoderResult decoderResult;
    protected final io.netty.handler.codec.stomp.DefaultStompHeaders headers;

    public DefaultStompHeadersSubframe(io.netty.handler.codec.stomp.StompCommand r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    DefaultStompHeadersSubframe(io.netty.handler.codec.stomp.StompCommand r2, io.netty.handler.codec.stomp.DefaultStompHeaders r3) {
            r1 = this;
            r1.<init>()
            io.netty.handler.codec.DecoderResult r0 = io.netty.handler.codec.DecoderResult.SUCCESS
            r1.decoderResult = r0
            if (r2 == 0) goto L15
            r1.command = r2
            if (r3 != 0) goto L12
            io.netty.handler.codec.stomp.DefaultStompHeaders r3 = new io.netty.handler.codec.stomp.DefaultStompHeaders
            r3.<init>()
        L12:
            r1.headers = r3
            return
        L15:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "command"
            r2.<init>(r3)
            throw r2
    }

    @Override // io.netty.handler.codec.stomp.StompHeadersSubframe
    public io.netty.handler.codec.stomp.StompCommand command() {
            r1 = this;
            io.netty.handler.codec.stomp.StompCommand r0 = r1.command
            return r0
    }

    @Override // io.netty.handler.codec.DecoderResultProvider
    public io.netty.handler.codec.DecoderResult decoderResult() {
            r1 = this;
            io.netty.handler.codec.DecoderResult r0 = r1.decoderResult
            return r0
    }

    @Override // io.netty.handler.codec.stomp.StompHeadersSubframe
    public io.netty.handler.codec.stomp.StompHeaders headers() {
            r1 = this;
            io.netty.handler.codec.stomp.DefaultStompHeaders r0 = r1.headers
            return r0
    }

    @Override // io.netty.handler.codec.DecoderResultProvider
    public void setDecoderResult(io.netty.handler.codec.DecoderResult r1) {
            r0 = this;
            r0.decoderResult = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "StompFrame{command="
            r0.append(r1)
            io.netty.handler.codec.stomp.StompCommand r1 = r2.command
            r0.append(r1)
            java.lang.String r1 = ", headers="
            r0.append(r1)
            io.netty.handler.codec.stomp.DefaultStompHeaders r1 = r2.headers
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
