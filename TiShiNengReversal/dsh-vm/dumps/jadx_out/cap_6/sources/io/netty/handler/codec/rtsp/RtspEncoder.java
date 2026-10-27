package io.netty.handler.codec.rtsp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class RtspEncoder extends io.netty.handler.codec.http.HttpObjectEncoder<io.netty.handler.codec.http.HttpMessage> {
    private static final int CRLF_SHORT = 3338;

    public RtspEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.handler.codec.http.HttpObjectEncoder, io.netty.handler.codec.MessageToMessageEncoder
    public boolean acceptOutboundMessage(java.lang.Object r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = super.acceptOutboundMessage(r2)
            if (r0 == 0) goto L10
            boolean r0 = r2 instanceof io.netty.handler.codec.http.HttpRequest
            if (r0 != 0) goto Le
            boolean r2 = r2 instanceof io.netty.handler.codec.http.HttpResponse
            if (r2 == 0) goto L10
        Le:
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    @Override // io.netty.handler.codec.http.HttpObjectEncoder
    protected void encodeInitialLine(io.netty.buffer.ByteBuf r5, io.netty.handler.codec.http.HttpMessage r6) throws java.lang.Exception {
            r4 = this;
            boolean r0 = r6 instanceof io.netty.handler.codec.http.HttpRequest
            r1 = 3338(0xd0a, float:4.678E-42)
            r2 = 32
            if (r0 == 0) goto L35
            io.netty.handler.codec.http.HttpRequest r6 = (io.netty.handler.codec.http.HttpRequest) r6
            io.netty.handler.codec.http.HttpMethod r0 = r6.method()
            io.netty.util.AsciiString r0 = r0.asciiName()
            io.netty.buffer.ByteBufUtil.copy(r0, r5)
            r5.writeByte(r2)
            java.lang.String r0 = r6.uri()
            java.nio.charset.Charset r3 = io.netty.util.CharsetUtil.UTF_8
            r5.writeCharSequence(r0, r3)
            r5.writeByte(r2)
            io.netty.handler.codec.http.HttpVersion r6 = r6.protocolVersion()
            java.lang.String r6 = r6.toString()
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.US_ASCII
            r5.writeCharSequence(r6, r0)
            io.netty.buffer.ByteBufUtil.writeShortBE(r5, r1)
            return
        L35:
            boolean r0 = r6 instanceof io.netty.handler.codec.http.HttpResponse
            if (r0 == 0) goto L68
            io.netty.handler.codec.http.HttpResponse r6 = (io.netty.handler.codec.http.HttpResponse) r6
            io.netty.handler.codec.http.HttpVersion r0 = r6.protocolVersion()
            java.lang.String r0 = r0.toString()
            java.nio.charset.Charset r3 = io.netty.util.CharsetUtil.US_ASCII
            r5.writeCharSequence(r0, r3)
            r5.writeByte(r2)
            io.netty.handler.codec.http.HttpResponseStatus r0 = r6.status()
            io.netty.util.AsciiString r0 = r0.codeAsText()
            io.netty.buffer.ByteBufUtil.copy(r0, r5)
            r5.writeByte(r2)
            io.netty.handler.codec.http.HttpResponseStatus r6 = r6.status()
            java.lang.String r6 = r6.reasonPhrase()
            r5.writeCharSequence(r6, r3)
            io.netty.buffer.ByteBufUtil.writeShortBE(r5, r1)
            return
        L68:
            io.netty.handler.codec.UnsupportedMessageTypeException r5 = new io.netty.handler.codec.UnsupportedMessageTypeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported type "
            r0.append(r1)
            java.lang.String r6 = io.netty.util.internal.StringUtil.simpleClassName(r6)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
    }
}
