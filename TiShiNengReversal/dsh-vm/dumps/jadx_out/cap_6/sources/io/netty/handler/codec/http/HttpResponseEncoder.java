package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class HttpResponseEncoder extends io.netty.handler.codec.http.HttpObjectEncoder<io.netty.handler.codec.http.HttpResponse> {
    public HttpResponseEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.handler.codec.http.HttpObjectEncoder, io.netty.handler.codec.MessageToMessageEncoder
    public boolean acceptOutboundMessage(java.lang.Object r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = super.acceptOutboundMessage(r2)
            if (r0 == 0) goto Lc
            boolean r2 = r2 instanceof io.netty.handler.codec.http.HttpRequest
            if (r2 != 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    @Override // io.netty.handler.codec.http.HttpObjectEncoder
    protected /* bridge */ /* synthetic */ void encodeInitialLine(io.netty.buffer.ByteBuf r1, io.netty.handler.codec.http.HttpResponse r2) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.HttpResponse r2 = (io.netty.handler.codec.http.HttpResponse) r2
            r0.encodeInitialLine2(r1, r2)
            return
    }

    /* renamed from: encodeInitialLine, reason: avoid collision after fix types in other method */
    protected void encodeInitialLine2(io.netty.buffer.ByteBuf r2, io.netty.handler.codec.http.HttpResponse r3) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.http.HttpVersion r0 = r3.protocolVersion()
            r0.encode(r2)
            r0 = 32
            r2.writeByte(r0)
            io.netty.handler.codec.http.HttpResponseStatus r3 = r3.status()
            r3.encode(r2)
            r3 = 3338(0xd0a, float:4.678E-42)
            io.netty.buffer.ByteBufUtil.writeShortBE(r2, r3)
            return
    }

    @Override // io.netty.handler.codec.http.HttpObjectEncoder
    protected /* bridge */ /* synthetic */ boolean isContentAlwaysEmpty(io.netty.handler.codec.http.HttpResponse r1) {
            r0 = this;
            io.netty.handler.codec.http.HttpResponse r1 = (io.netty.handler.codec.http.HttpResponse) r1
            boolean r1 = r0.isContentAlwaysEmpty2(r1)
            return r1
    }

    /* renamed from: isContentAlwaysEmpty, reason: avoid collision after fix types in other method */
    protected boolean isContentAlwaysEmpty2(io.netty.handler.codec.http.HttpResponse r5) {
            r4 = this;
            io.netty.handler.codec.http.HttpResponseStatus r0 = r5.status()
            io.netty.handler.codec.http.HttpStatusClass r1 = r0.codeClass()
            io.netty.handler.codec.http.HttpStatusClass r2 = io.netty.handler.codec.http.HttpStatusClass.INFORMATIONAL
            r3 = 1
            if (r1 != r2) goto L25
            int r0 = r0.code()
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.SWITCHING_PROTOCOLS
            int r1 = r1.code()
            if (r0 != r1) goto L24
            io.netty.handler.codec.http.HttpHeaders r5 = r5.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_VERSION
            boolean r5 = r5.contains(r0)
            return r5
        L24:
            return r3
        L25:
            int r5 = r0.code()
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.NO_CONTENT
            int r1 = r1.code()
            if (r5 == r1) goto L4c
            int r5 = r0.code()
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.NOT_MODIFIED
            int r1 = r1.code()
            if (r5 == r1) goto L4c
            int r5 = r0.code()
            io.netty.handler.codec.http.HttpResponseStatus r0 = io.netty.handler.codec.http.HttpResponseStatus.RESET_CONTENT
            int r0 = r0.code()
            if (r5 != r0) goto L4a
            goto L4c
        L4a:
            r5 = 0
            return r5
        L4c:
            return r3
    }

    @Override // io.netty.handler.codec.http.HttpObjectEncoder
    protected /* bridge */ /* synthetic */ void sanitizeHeadersBeforeEncode(io.netty.handler.codec.http.HttpResponse r1, boolean r2) {
            r0 = this;
            io.netty.handler.codec.http.HttpResponse r1 = (io.netty.handler.codec.http.HttpResponse) r1
            r0.sanitizeHeadersBeforeEncode2(r1, r2)
            return
    }

    /* renamed from: sanitizeHeadersBeforeEncode, reason: avoid collision after fix types in other method */
    protected void sanitizeHeadersBeforeEncode2(io.netty.handler.codec.http.HttpResponse r3, boolean r4) {
            r2 = this;
            if (r4 == 0) goto L4d
            io.netty.handler.codec.http.HttpResponseStatus r4 = r3.status()
            io.netty.handler.codec.http.HttpStatusClass r0 = r4.codeClass()
            io.netty.handler.codec.http.HttpStatusClass r1 = io.netty.handler.codec.http.HttpStatusClass.INFORMATIONAL
            if (r0 == r1) goto L3b
            int r0 = r4.code()
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.NO_CONTENT
            int r1 = r1.code()
            if (r0 != r1) goto L1b
            goto L3b
        L1b:
            int r4 = r4.code()
            io.netty.handler.codec.http.HttpResponseStatus r0 = io.netty.handler.codec.http.HttpResponseStatus.RESET_CONTENT
            int r0 = r0.code()
            if (r4 != r0) goto L4d
            io.netty.handler.codec.http.HttpHeaders r4 = r3.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.TRANSFER_ENCODING
            r4.remove(r0)
            io.netty.handler.codec.http.HttpHeaders r3 = r3.headers()
            io.netty.util.AsciiString r4 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_LENGTH
            r0 = 0
            r3.setInt(r4, r0)
            return
        L3b:
            io.netty.handler.codec.http.HttpHeaders r4 = r3.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_LENGTH
            r4.remove(r0)
            io.netty.handler.codec.http.HttpHeaders r3 = r3.headers()
            io.netty.util.AsciiString r4 = io.netty.handler.codec.http.HttpHeaderNames.TRANSFER_ENCODING
            r3.remove(r4)
        L4d:
            return
    }
}
