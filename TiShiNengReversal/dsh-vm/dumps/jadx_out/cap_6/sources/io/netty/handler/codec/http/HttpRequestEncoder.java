package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class HttpRequestEncoder extends io.netty.handler.codec.http.HttpObjectEncoder<io.netty.handler.codec.http.HttpRequest> {
    private static final char QUESTION_MARK = '?';
    private static final char SLASH = '/';
    private static final int SLASH_AND_SPACE_SHORT = 12064;
    private static final int SPACE_SLASH_AND_SPACE_MEDIUM = 2109216;

    public HttpRequestEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.handler.codec.http.HttpObjectEncoder, io.netty.handler.codec.MessageToMessageEncoder
    public boolean acceptOutboundMessage(java.lang.Object r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = super.acceptOutboundMessage(r2)
            if (r0 == 0) goto Lc
            boolean r2 = r2 instanceof io.netty.handler.codec.http.HttpResponse
            if (r2 != 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    @Override // io.netty.handler.codec.http.HttpObjectEncoder
    protected /* bridge */ /* synthetic */ void encodeInitialLine(io.netty.buffer.ByteBuf r1, io.netty.handler.codec.http.HttpRequest r2) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.HttpRequest r2 = (io.netty.handler.codec.http.HttpRequest) r2
            r0.encodeInitialLine2(r1, r2)
            return
    }

    /* renamed from: encodeInitialLine, reason: avoid collision after fix types in other method */
    protected void encodeInitialLine2(io.netty.buffer.ByteBuf r7, io.netty.handler.codec.http.HttpRequest r8) throws java.lang.Exception {
            r6 = this;
            io.netty.handler.codec.http.HttpMethod r0 = r8.method()
            io.netty.util.AsciiString r0 = r0.asciiName()
            io.netty.buffer.ByteBufUtil.copy(r0, r7)
            java.lang.String r0 = r8.uri()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1c
            r0 = 2109216(0x202f20, float:2.955641E-39)
            io.netty.buffer.ByteBufUtil.writeMediumBE(r7, r0)
            goto L65
        L1c:
            java.lang.String r1 = "://"
            int r1 = r0.indexOf(r1)
            r2 = -1
            r3 = 0
            if (r1 == r2) goto L4f
            char r4 = r0.charAt(r3)
            r5 = 47
            if (r4 == r5) goto L4f
            int r1 = r1 + 3
            r4 = 63
            int r4 = r0.indexOf(r4, r1)
            if (r4 != r2) goto L40
            int r2 = r0.lastIndexOf(r5)
            if (r2 >= r1) goto L4f
            r3 = 1
            goto L4f
        L40:
            int r2 = r0.lastIndexOf(r5, r4)
            if (r2 >= r1) goto L4f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.StringBuilder r0 = r1.insert(r4, r5)
        L4f:
            r1 = 32
            io.netty.buffer.ByteBuf r2 = r7.writeByte(r1)
            java.nio.charset.Charset r4 = io.netty.util.CharsetUtil.UTF_8
            r2.writeCharSequence(r0, r4)
            if (r3 == 0) goto L62
            r0 = 12064(0x2f20, float:1.6905E-41)
            io.netty.buffer.ByteBufUtil.writeShortBE(r7, r0)
            goto L65
        L62:
            r7.writeByte(r1)
        L65:
            io.netty.handler.codec.http.HttpVersion r8 = r8.protocolVersion()
            r8.encode(r7)
            r8 = 3338(0xd0a, float:4.678E-42)
            io.netty.buffer.ByteBufUtil.writeShortBE(r7, r8)
            return
    }
}
