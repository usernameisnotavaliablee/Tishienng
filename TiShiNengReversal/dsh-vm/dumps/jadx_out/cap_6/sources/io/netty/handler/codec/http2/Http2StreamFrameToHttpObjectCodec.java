package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Http2StreamFrameToHttpObjectCodec extends io.netty.handler.codec.MessageToMessageCodec<io.netty.handler.codec.http2.Http2StreamFrame, io.netty.handler.codec.http.HttpObject> {
    private static final io.netty.util.AttributeKey<io.netty.handler.codec.http.HttpScheme> SCHEME_ATTR_KEY = null;
    private final boolean isServer;
    private final boolean validateHeaders;

    static {
            java.lang.Class<io.netty.handler.codec.http.HttpScheme> r0 = io.netty.handler.codec.http.HttpScheme.class
            java.lang.String r1 = "STREAMFRAMECODEC_SCHEME"
            io.netty.util.AttributeKey r0 = io.netty.util.AttributeKey.valueOf(r0, r1)
            io.netty.handler.codec.http2.Http2StreamFrameToHttpObjectCodec.SCHEME_ATTR_KEY = r0
            return
    }

    public Http2StreamFrameToHttpObjectCodec(boolean r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public Http2StreamFrameToHttpObjectCodec(boolean r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.isServer = r1
            r0.validateHeaders = r2
            return
    }

    private static io.netty.channel.Channel connectionChannel(io.netty.channel.ChannelHandlerContext r1) {
            io.netty.channel.Channel r1 = r1.channel()
            boolean r0 = r1 instanceof io.netty.handler.codec.http2.Http2StreamChannel
            if (r0 == 0) goto Lc
            io.netty.channel.Channel r1 = r1.parent()
        Lc:
            return r1
    }

    private static io.netty.handler.codec.http.HttpScheme connectionScheme(io.netty.channel.ChannelHandlerContext r0) {
            io.netty.util.Attribute r0 = connectionSchemeAttribute(r0)
            java.lang.Object r0 = r0.get()
            io.netty.handler.codec.http.HttpScheme r0 = (io.netty.handler.codec.http.HttpScheme) r0
            if (r0 != 0) goto Le
            io.netty.handler.codec.http.HttpScheme r0 = io.netty.handler.codec.http.HttpScheme.HTTP
        Le:
            return r0
    }

    private static io.netty.util.Attribute<io.netty.handler.codec.http.HttpScheme> connectionSchemeAttribute(io.netty.channel.ChannelHandlerContext r1) {
            io.netty.channel.Channel r1 = connectionChannel(r1)
            io.netty.util.AttributeKey<io.netty.handler.codec.http.HttpScheme> r0 = io.netty.handler.codec.http2.Http2StreamFrameToHttpObjectCodec.SCHEME_ATTR_KEY
            io.netty.util.Attribute r1 = r1.attr(r0)
            return r1
    }

    private void encodeLastContent(io.netty.handler.codec.http.LastHttpContent r5, java.util.List<java.lang.Object> r6) {
            r4 = this;
            boolean r0 = r5 instanceof io.netty.handler.codec.http.FullHttpMessage
            r1 = 1
            if (r0 != 0) goto L11
            io.netty.handler.codec.http.HttpHeaders r0 = r5.trailingHeaders()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            io.netty.buffer.ByteBuf r2 = r5.content()
            boolean r2 = r2.isReadable()
            if (r2 != 0) goto L1e
            if (r0 == 0) goto L36
        L1e:
            io.netty.handler.codec.http2.DefaultHttp2DataFrame r0 = new io.netty.handler.codec.http2.DefaultHttp2DataFrame
            io.netty.buffer.ByteBuf r2 = r5.content()
            io.netty.buffer.ByteBuf r2 = r2.retain()
            io.netty.handler.codec.http.HttpHeaders r3 = r5.trailingHeaders()
            boolean r3 = r3.isEmpty()
            r0.<init>(r2, r3)
            r6.add(r0)
        L36:
            io.netty.handler.codec.http.HttpHeaders r0 = r5.trailingHeaders()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L52
            io.netty.handler.codec.http.HttpHeaders r5 = r5.trailingHeaders()
            boolean r0 = r4.validateHeaders
            io.netty.handler.codec.http2.Http2Headers r5 = io.netty.handler.codec.http2.HttpConversionUtil.toHttp2Headers(r5, r0)
            io.netty.handler.codec.http2.DefaultHttp2HeadersFrame r0 = new io.netty.handler.codec.http2.DefaultHttp2HeadersFrame
            r0.<init>(r5, r1)
            r6.add(r0)
        L52:
            return
    }

    private io.netty.handler.codec.http.FullHttpMessage newFullMessage(int r2, io.netty.handler.codec.http2.Http2Headers r3, io.netty.buffer.ByteBufAllocator r4) throws io.netty.handler.codec.http2.Http2Exception {
            r1 = this;
            boolean r0 = r1.isServer
            if (r0 == 0) goto Lb
            boolean r0 = r1.validateHeaders
            io.netty.handler.codec.http.FullHttpRequest r2 = io.netty.handler.codec.http2.HttpConversionUtil.toFullHttpRequest(r2, r3, r4, r0)
            return r2
        Lb:
            boolean r0 = r1.validateHeaders
            io.netty.handler.codec.http.FullHttpResponse r2 = io.netty.handler.codec.http2.HttpConversionUtil.toFullHttpResponse(r2, r3, r4, r0)
            return r2
    }

    private io.netty.handler.codec.http.HttpMessage newMessage(int r2, io.netty.handler.codec.http2.Http2Headers r3) throws io.netty.handler.codec.http2.Http2Exception {
            r1 = this;
            boolean r0 = r1.isServer
            if (r0 == 0) goto Lb
            boolean r0 = r1.validateHeaders
            io.netty.handler.codec.http.HttpRequest r2 = io.netty.handler.codec.http2.HttpConversionUtil.toHttpRequest(r2, r3, r0)
            return r2
        Lb:
            boolean r0 = r1.validateHeaders
            io.netty.handler.codec.http.HttpResponse r2 = io.netty.handler.codec.http2.HttpConversionUtil.toHttpResponse(r2, r3, r0)
            return r2
    }

    private io.netty.handler.codec.http2.Http2Headers toHttp2Headers(io.netty.channel.ChannelHandlerContext r3, io.netty.handler.codec.http.HttpMessage r4) {
            r2 = this;
            boolean r0 = r4 instanceof io.netty.handler.codec.http.HttpRequest
            if (r0 == 0) goto L15
            io.netty.handler.codec.http.HttpHeaders r0 = r4.headers()
            io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames r1 = io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames.SCHEME
            io.netty.util.AsciiString r1 = r1.text()
            io.netty.handler.codec.http.HttpScheme r3 = connectionScheme(r3)
            r0.set(r1, r3)
        L15:
            boolean r3 = r2.validateHeaders
            io.netty.handler.codec.http2.Http2Headers r3 = io.netty.handler.codec.http2.HttpConversionUtil.toHttp2Headers(r4, r3)
            return r3
    }

    @Override // io.netty.handler.codec.MessageToMessageCodec
    public boolean acceptInboundMessage(java.lang.Object r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.handler.codec.http2.Http2HeadersFrame
            if (r0 != 0) goto Lb
            boolean r2 = r2 instanceof io.netty.handler.codec.http2.Http2DataFrame
            if (r2 == 0) goto L9
            goto Lb
        L9:
            r2 = 0
            return r2
        Lb:
            r2 = 1
            return r2
    }

    /* renamed from: decode, reason: avoid collision after fix types in other method */
    protected void decode2(io.netty.channel.ChannelHandlerContext r7, io.netty.handler.codec.http2.Http2StreamFrame r8, java.util.List<java.lang.Object> r9) throws java.lang.Exception {
            r6 = this;
            boolean r0 = r8 instanceof io.netty.handler.codec.http2.Http2HeadersFrame
            if (r0 == 0) goto L7f
            io.netty.handler.codec.http2.Http2HeadersFrame r8 = (io.netty.handler.codec.http2.Http2HeadersFrame) r8
            io.netty.handler.codec.http2.Http2Headers r1 = r8.headers()
            io.netty.handler.codec.http2.Http2FrameStream r0 = r8.stream()
            if (r0 != 0) goto L12
            r0 = 0
            goto L16
        L12:
            int r0 = r0.id()
        L16:
            java.lang.CharSequence r2 = r1.status()
            if (r2 == 0) goto L34
            io.netty.handler.codec.http.HttpResponseStatus r3 = io.netty.handler.codec.http.HttpResponseStatus.CONTINUE
            io.netty.util.AsciiString r3 = r3.codeAsText()
            boolean r3 = r3.contentEquals(r2)
            if (r3 == 0) goto L34
            io.netty.buffer.ByteBufAllocator r7 = r7.alloc()
            io.netty.handler.codec.http.FullHttpMessage r7 = r6.newFullMessage(r0, r1, r7)
            r9.add(r7)
            return
        L34:
            boolean r8 = r8.isEndStream()
            if (r8 == 0) goto L66
            java.lang.CharSequence r8 = r1.method()
            if (r8 != 0) goto L5a
            if (r2 != 0) goto L5a
            io.netty.handler.codec.http.DefaultLastHttpContent r7 = new io.netty.handler.codec.http.DefaultLastHttpContent
            io.netty.buffer.ByteBuf r8 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            boolean r2 = r6.validateHeaders
            r7.<init>(r8, r2)
            io.netty.handler.codec.http.HttpHeaders r2 = r7.trailingHeaders()
            io.netty.handler.codec.http.HttpVersion r3 = io.netty.handler.codec.http.HttpVersion.HTTP_1_1
            r4 = 1
            r5 = 1
            io.netty.handler.codec.http2.HttpConversionUtil.addHttp2ToHttpHeaders(r0, r1, r2, r3, r4, r5)
            r9.add(r7)
            return
        L5a:
            io.netty.buffer.ByteBufAllocator r7 = r7.alloc()
            io.netty.handler.codec.http.FullHttpMessage r7 = r6.newFullMessage(r0, r1, r7)
            r9.add(r7)
            return
        L66:
            io.netty.handler.codec.http.HttpMessage r7 = r6.newMessage(r0, r1)
            boolean r8 = io.netty.handler.codec.http.HttpUtil.isContentLengthSet(r7)
            if (r8 != 0) goto L7b
            io.netty.handler.codec.http.HttpHeaders r8 = r7.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.TRANSFER_ENCODING
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderValues.CHUNKED
            r8.add(r0, r1)
        L7b:
            r9.add(r7)
            return
        L7f:
            boolean r7 = r8 instanceof io.netty.handler.codec.http2.Http2DataFrame
            if (r7 == 0) goto Lae
            io.netty.handler.codec.http2.Http2DataFrame r8 = (io.netty.handler.codec.http2.Http2DataFrame) r8
            boolean r7 = r8.isEndStream()
            if (r7 == 0) goto L9e
            io.netty.handler.codec.http.DefaultLastHttpContent r7 = new io.netty.handler.codec.http.DefaultLastHttpContent
            io.netty.buffer.ByteBuf r8 = r8.content()
            io.netty.buffer.ByteBuf r8 = r8.retain()
            boolean r0 = r6.validateHeaders
            r7.<init>(r8, r0)
            r9.add(r7)
            return
        L9e:
            io.netty.handler.codec.http.DefaultHttpContent r7 = new io.netty.handler.codec.http.DefaultHttpContent
            io.netty.buffer.ByteBuf r8 = r8.content()
            io.netty.buffer.ByteBuf r8 = r8.retain()
            r7.<init>(r8)
            r9.add(r7)
        Lae:
            return
    }

    @Override // io.netty.handler.codec.MessageToMessageCodec
    protected /* bridge */ /* synthetic */ void decode(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http2.Http2StreamFrame r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http2.Http2StreamFrame r2 = (io.netty.handler.codec.http2.Http2StreamFrame) r2
            r0.decode2(r1, r2, r3)
            return
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r5, io.netty.handler.codec.http.HttpObject r6, java.util.List<java.lang.Object> r7) throws java.lang.Exception {
            r4 = this;
            boolean r0 = r6 instanceof io.netty.handler.codec.http.HttpResponse
            r1 = 0
            if (r0 == 0) goto L40
            r0 = r6
            io.netty.handler.codec.http.HttpResponse r0 = (io.netty.handler.codec.http.HttpResponse) r0
            io.netty.handler.codec.http.HttpResponseStatus r2 = r0.status()
            io.netty.handler.codec.http.HttpResponseStatus r3 = io.netty.handler.codec.http.HttpResponseStatus.CONTINUE
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L40
            boolean r6 = r0 instanceof io.netty.handler.codec.http.FullHttpResponse
            if (r6 == 0) goto L25
            io.netty.handler.codec.http2.Http2Headers r5 = r4.toHttp2Headers(r5, r0)
            io.netty.handler.codec.http2.DefaultHttp2HeadersFrame r6 = new io.netty.handler.codec.http2.DefaultHttp2HeadersFrame
            r6.<init>(r5, r1)
            r7.add(r6)
            return
        L25:
            io.netty.handler.codec.EncoderException r5 = new io.netty.handler.codec.EncoderException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r3.toString()
            r6.append(r7)
            java.lang.String r7 = " must be a FullHttpResponse"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L40:
            boolean r0 = r6 instanceof io.netty.handler.codec.http.HttpMessage
            if (r0 == 0) goto L71
            r0 = r6
            io.netty.handler.codec.http.HttpMessage r0 = (io.netty.handler.codec.http.HttpMessage) r0
            io.netty.handler.codec.http2.Http2Headers r5 = r4.toHttp2Headers(r5, r0)
            boolean r0 = r6 instanceof io.netty.handler.codec.http.FullHttpMessage
            if (r0 == 0) goto L68
            r0 = r6
            io.netty.handler.codec.http.FullHttpMessage r0 = (io.netty.handler.codec.http.FullHttpMessage) r0
            io.netty.buffer.ByteBuf r2 = r0.content()
            boolean r2 = r2.isReadable()
            if (r2 != 0) goto L68
            io.netty.handler.codec.http.HttpHeaders r0 = r0.trailingHeaders()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L68
            r0 = 1
            goto L69
        L68:
            r0 = 0
        L69:
            io.netty.handler.codec.http2.DefaultHttp2HeadersFrame r2 = new io.netty.handler.codec.http2.DefaultHttp2HeadersFrame
            r2.<init>(r5, r0)
            r7.add(r2)
        L71:
            boolean r5 = r6 instanceof io.netty.handler.codec.http.LastHttpContent
            if (r5 == 0) goto L7b
            io.netty.handler.codec.http.LastHttpContent r6 = (io.netty.handler.codec.http.LastHttpContent) r6
            r4.encodeLastContent(r6, r7)
            return
        L7b:
            boolean r5 = r6 instanceof io.netty.handler.codec.http.HttpContent
            if (r5 == 0) goto L91
            io.netty.handler.codec.http.HttpContent r6 = (io.netty.handler.codec.http.HttpContent) r6
            io.netty.handler.codec.http2.DefaultHttp2DataFrame r5 = new io.netty.handler.codec.http2.DefaultHttp2DataFrame
            io.netty.buffer.ByteBuf r6 = r6.content()
            io.netty.buffer.ByteBuf r6 = r6.retain()
            r5.<init>(r6, r1)
            r7.add(r5)
        L91:
            return
    }

    @Override // io.netty.handler.codec.MessageToMessageCodec
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http.HttpObject r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.HttpObject r2 = (io.netty.handler.codec.http.HttpObject) r2
            r0.encode2(r1, r2, r3)
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerAdded(io.netty.channel.ChannelHandlerContext r3) throws java.lang.Exception {
            r2 = this;
            super.handlerAdded(r3)
            io.netty.util.Attribute r0 = connectionSchemeAttribute(r3)
            java.lang.Object r1 = r0.get()
            if (r1 != 0) goto L1b
            boolean r3 = r2.isSsl(r3)
            if (r3 == 0) goto L16
            io.netty.handler.codec.http.HttpScheme r3 = io.netty.handler.codec.http.HttpScheme.HTTPS
            goto L18
        L16:
            io.netty.handler.codec.http.HttpScheme r3 = io.netty.handler.codec.http.HttpScheme.HTTP
        L18:
            r0.set(r3)
        L1b:
            return
    }

    protected boolean isSsl(io.netty.channel.ChannelHandlerContext r2) {
            r1 = this;
            io.netty.channel.Channel r2 = connectionChannel(r2)
            io.netty.channel.ChannelPipeline r2 = r2.pipeline()
            java.lang.Class<io.netty.handler.ssl.SslHandler> r0 = io.netty.handler.ssl.SslHandler.class
            io.netty.channel.ChannelHandler r2 = r2.get(r0)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }
}
