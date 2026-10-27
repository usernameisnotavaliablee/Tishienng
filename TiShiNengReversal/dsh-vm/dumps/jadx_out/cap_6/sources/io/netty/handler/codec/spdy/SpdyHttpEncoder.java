package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SpdyHttpEncoder extends io.netty.handler.codec.MessageToMessageEncoder<io.netty.handler.codec.http.HttpObject> {
    private int currentStreamId;
    private final boolean headersToLowerCase;
    private final boolean validateHeaders;

    public SpdyHttpEncoder(io.netty.handler.codec.spdy.SpdyVersion r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0, r0)
            return
    }

    public SpdyHttpEncoder(io.netty.handler.codec.spdy.SpdyVersion r1, boolean r2, boolean r3) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto La
            r0.headersToLowerCase = r2
            r0.validateHeaders = r3
            return
        La:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "version"
            r1.<init>(r2)
            throw r1
    }

    private io.netty.handler.codec.spdy.SpdyHeadersFrame createHeadersFrame(io.netty.handler.codec.http.HttpResponse r7) throws java.lang.Exception {
            r6 = this;
            io.netty.handler.codec.http.HttpHeaders r0 = r7.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.spdy.SpdyHttpHeaders.Names.STREAM_ID
            java.lang.Integer r2 = r0.getInt(r1)
            int r2 = r2.intValue()
            r0.remove(r1)
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.CONNECTION
            r0.remove(r1)
            java.lang.String r1 = "Keep-Alive"
            r0.remove(r1)
            java.lang.String r1 = "Proxy-Connection"
            r0.remove(r1)
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.TRANSFER_ENCODING
            r0.remove(r1)
            boolean r1 = io.netty.handler.codec.spdy.SpdyCodecUtil.isServerId(r2)
            if (r1 == 0) goto L33
            io.netty.handler.codec.spdy.DefaultSpdyHeadersFrame r1 = new io.netty.handler.codec.spdy.DefaultSpdyHeadersFrame
            boolean r3 = r6.validateHeaders
            r1.<init>(r2, r3)
            goto L3a
        L33:
            io.netty.handler.codec.spdy.DefaultSpdySynReplyFrame r1 = new io.netty.handler.codec.spdy.DefaultSpdySynReplyFrame
            boolean r3 = r6.validateHeaders
            r1.<init>(r2, r3)
        L3a:
            io.netty.handler.codec.spdy.SpdyHeaders r3 = r1.headers()
            io.netty.util.AsciiString r4 = io.netty.handler.codec.spdy.SpdyHeaders.HttpNames.STATUS
            io.netty.handler.codec.http.HttpResponseStatus r5 = r7.status()
            io.netty.util.AsciiString r5 = r5.codeAsText()
            r3.set(r4, r5)
            io.netty.util.AsciiString r4 = io.netty.handler.codec.spdy.SpdyHeaders.HttpNames.VERSION
            io.netty.handler.codec.http.HttpVersion r5 = r7.protocolVersion()
            java.lang.String r5 = r5.text()
            r3.set(r4, r5)
            java.util.Iterator r0 = r0.iteratorCharSequence()
        L5c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L8d
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            boolean r4 = r6.headersToLowerCase
            if (r4 == 0) goto L7b
            java.lang.Object r4 = r3.getKey()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            io.netty.util.AsciiString r4 = io.netty.util.AsciiString.of(r4)
            io.netty.util.AsciiString r4 = r4.toLowerCase()
            goto L81
        L7b:
            java.lang.Object r4 = r3.getKey()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
        L81:
            io.netty.handler.codec.spdy.SpdyHeaders r5 = r1.headers()
            java.lang.Object r3 = r3.getValue()
            r5.add(r4, r3)
            goto L5c
        L8d:
            r6.currentStreamId = r2
            boolean r7 = isLast(r7)
            r1.setLast(r7)
            return r1
    }

    private io.netty.handler.codec.spdy.SpdySynStreamFrame createSynStreamFrame(io.netty.handler.codec.http.HttpRequest r10) throws java.lang.Exception {
            r9 = this;
            io.netty.handler.codec.http.HttpHeaders r0 = r10.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.spdy.SpdyHttpHeaders.Names.STREAM_ID
            java.lang.Integer r2 = r0.getInt(r1)
            int r2 = r2.intValue()
            io.netty.util.AsciiString r3 = io.netty.handler.codec.spdy.SpdyHttpHeaders.Names.ASSOCIATED_TO_STREAM_ID
            r4 = 0
            int r5 = r0.getInt(r3, r4)
            io.netty.util.AsciiString r6 = io.netty.handler.codec.spdy.SpdyHttpHeaders.Names.PRIORITY
            int r4 = r0.getInt(r6, r4)
            byte r4 = (byte) r4
            io.netty.util.AsciiString r7 = io.netty.handler.codec.spdy.SpdyHttpHeaders.Names.SCHEME
            java.lang.String r8 = r0.get(r7)
            r0.remove(r1)
            r0.remove(r3)
            r0.remove(r6)
            r0.remove(r7)
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.CONNECTION
            r0.remove(r1)
            java.lang.String r1 = "Keep-Alive"
            r0.remove(r1)
            java.lang.String r1 = "Proxy-Connection"
            r0.remove(r1)
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.TRANSFER_ENCODING
            r0.remove(r1)
            io.netty.handler.codec.spdy.DefaultSpdySynStreamFrame r1 = new io.netty.handler.codec.spdy.DefaultSpdySynStreamFrame
            boolean r3 = r9.validateHeaders
            r1.<init>(r2, r5, r4, r3)
            io.netty.handler.codec.spdy.SpdyHeaders r2 = r1.headers()
            io.netty.util.AsciiString r3 = io.netty.handler.codec.spdy.SpdyHeaders.HttpNames.METHOD
            io.netty.handler.codec.http.HttpMethod r4 = r10.method()
            java.lang.String r4 = r4.name()
            r2.set(r3, r4)
            io.netty.util.AsciiString r3 = io.netty.handler.codec.spdy.SpdyHeaders.HttpNames.PATH
            java.lang.String r4 = r10.uri()
            r2.set(r3, r4)
            io.netty.util.AsciiString r3 = io.netty.handler.codec.spdy.SpdyHeaders.HttpNames.VERSION
            io.netty.handler.codec.http.HttpVersion r4 = r10.protocolVersion()
            java.lang.String r4 = r4.text()
            r2.set(r3, r4)
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderNames.HOST
            java.lang.String r4 = r0.get(r3)
            r0.remove(r3)
            io.netty.util.AsciiString r3 = io.netty.handler.codec.spdy.SpdyHeaders.HttpNames.HOST
            r2.set(r3, r4)
            if (r8 != 0) goto L82
            java.lang.String r8 = "https"
        L82:
            io.netty.util.AsciiString r3 = io.netty.handler.codec.spdy.SpdyHeaders.HttpNames.SCHEME
            r2.set(r3, r8)
            java.util.Iterator r0 = r0.iteratorCharSequence()
        L8b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lb8
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            boolean r4 = r9.headersToLowerCase
            if (r4 == 0) goto Laa
            java.lang.Object r4 = r3.getKey()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            io.netty.util.AsciiString r4 = io.netty.util.AsciiString.of(r4)
            io.netty.util.AsciiString r4 = r4.toLowerCase()
            goto Lb0
        Laa:
            java.lang.Object r4 = r3.getKey()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
        Lb0:
            java.lang.Object r3 = r3.getValue()
            r2.add(r4, r3)
            goto L8b
        Lb8:
            int r0 = r1.streamId()
            r9.currentStreamId = r0
            if (r5 != 0) goto Lc8
            boolean r10 = isLast(r10)
            r1.setLast(r10)
            return r1
        Lc8:
            r10 = 1
            r1.setUnidirectional(r10)
            return r1
    }

    private static boolean isLast(io.netty.handler.codec.http.HttpMessage r1) {
            boolean r0 = r1 instanceof io.netty.handler.codec.http.FullHttpMessage
            if (r0 == 0) goto L1c
            io.netty.handler.codec.http.FullHttpMessage r1 = (io.netty.handler.codec.http.FullHttpMessage) r1
            io.netty.handler.codec.http.HttpHeaders r0 = r1.trailingHeaders()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1c
            io.netty.buffer.ByteBuf r1 = r1.content()
            boolean r1 = r1.isReadable()
            if (r1 != 0) goto L1c
            r1 = 1
            return r1
        L1c:
            r1 = 0
            return r1
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r8, io.netty.handler.codec.http.HttpObject r9, java.util.List<java.lang.Object> r10) throws java.lang.Exception {
            r7 = this;
            boolean r8 = r9 instanceof io.netty.handler.codec.http.HttpRequest
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L22
            r8 = r9
            io.netty.handler.codec.http.HttpRequest r8 = (io.netty.handler.codec.http.HttpRequest) r8
            io.netty.handler.codec.spdy.SpdySynStreamFrame r8 = r7.createSynStreamFrame(r8)
            r10.add(r8)
            boolean r2 = r8.isLast()
            if (r2 != 0) goto L1f
            boolean r8 = r8.isUnidirectional()
            if (r8 == 0) goto L1d
            goto L1f
        L1d:
            r8 = 0
            goto L20
        L1f:
            r8 = 1
        L20:
            r2 = 1
            goto L24
        L22:
            r8 = 0
            r2 = 0
        L24:
            boolean r3 = r9 instanceof io.netty.handler.codec.http.HttpResponse
            if (r3 == 0) goto L37
            r8 = r9
            io.netty.handler.codec.http.HttpResponse r8 = (io.netty.handler.codec.http.HttpResponse) r8
            io.netty.handler.codec.spdy.SpdyHeadersFrame r8 = r7.createHeadersFrame(r8)
            r10.add(r8)
            boolean r8 = r8.isLast()
            r2 = 1
        L37:
            boolean r3 = r9 instanceof io.netty.handler.codec.http.HttpContent
            if (r3 == 0) goto Lb5
            if (r8 != 0) goto Lb5
            r8 = r9
            io.netty.handler.codec.http.HttpContent r8 = (io.netty.handler.codec.http.HttpContent) r8
            io.netty.buffer.ByteBuf r2 = r8.content()
            r2.retain()
            io.netty.handler.codec.spdy.DefaultSpdyDataFrame r2 = new io.netty.handler.codec.spdy.DefaultSpdyDataFrame
            int r3 = r7.currentStreamId
            io.netty.buffer.ByteBuf r4 = r8.content()
            r2.<init>(r3, r4)
            boolean r3 = r8 instanceof io.netty.handler.codec.http.LastHttpContent
            if (r3 == 0) goto Lb1
            io.netty.handler.codec.http.LastHttpContent r8 = (io.netty.handler.codec.http.LastHttpContent) r8
            io.netty.handler.codec.http.HttpHeaders r8 = r8.trailingHeaders()
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L69
            r2.setLast(r0)
            r10.add(r2)
            goto Lb6
        L69:
            io.netty.handler.codec.spdy.DefaultSpdyHeadersFrame r3 = new io.netty.handler.codec.spdy.DefaultSpdyHeadersFrame
            int r4 = r7.currentStreamId
            boolean r5 = r7.validateHeaders
            r3.<init>(r4, r5)
            r3.setLast(r0)
            java.util.Iterator r8 = r8.iteratorCharSequence()
        L79:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto Laa
            java.lang.Object r4 = r8.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            boolean r5 = r7.headersToLowerCase
            if (r5 == 0) goto L98
            java.lang.Object r5 = r4.getKey()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            io.netty.util.AsciiString r5 = io.netty.util.AsciiString.of(r5)
            io.netty.util.AsciiString r5 = r5.toLowerCase()
            goto L9e
        L98:
            java.lang.Object r5 = r4.getKey()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
        L9e:
            io.netty.handler.codec.spdy.SpdyHeaders r6 = r3.headers()
            java.lang.Object r4 = r4.getValue()
            r6.add(r5, r4)
            goto L79
        Laa:
            r10.add(r2)
            r10.add(r3)
            goto Lb6
        Lb1:
            r10.add(r2)
            goto Lb6
        Lb5:
            r0 = r2
        Lb6:
            if (r0 == 0) goto Lb9
            return
        Lb9:
            io.netty.handler.codec.UnsupportedMessageTypeException r8 = new io.netty.handler.codec.UnsupportedMessageTypeException
            java.lang.Class[] r10 = new java.lang.Class[r1]
            r8.<init>(r9, r10)
            throw r8
    }

    @Override // io.netty.handler.codec.MessageToMessageEncoder
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http.HttpObject r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.HttpObject r2 = (io.netty.handler.codec.http.HttpObject) r2
            r0.encode2(r1, r2, r3)
            return
    }
}
