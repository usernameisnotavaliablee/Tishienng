package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class HttpContentDecoder extends io.netty.handler.codec.MessageToMessageDecoder<io.netty.handler.codec.http.HttpObject> {
    static final java.lang.String IDENTITY = null;
    private boolean continueResponse;
    protected io.netty.channel.ChannelHandlerContext ctx;
    private io.netty.channel.embedded.EmbeddedChannel decoder;
    private boolean needRead;

    static {
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderValues.IDENTITY
            java.lang.String r0 = r0.toString()
            io.netty.handler.codec.http.HttpContentDecoder.IDENTITY = r0
            return
    }

    public HttpContentDecoder() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.needRead = r0
            return
    }

    private void cleanup() {
            r1 = this;
            io.netty.channel.embedded.EmbeddedChannel r0 = r1.decoder
            if (r0 == 0) goto La
            r0.finishAndReleaseAll()
            r0 = 0
            r1.decoder = r0
        La:
            return
    }

    private void cleanupSafely(io.netty.channel.ChannelHandlerContext r2) {
            r1 = this;
            r1.cleanup()     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r0 = move-exception
            r2.fireExceptionCaught(r0)
            return
    }

    private void decode(io.netty.buffer.ByteBuf r4, java.util.List<java.lang.Object> r5) {
            r3 = this;
            io.netty.channel.embedded.EmbeddedChannel r0 = r3.decoder
            io.netty.buffer.ByteBuf r4 = r4.retain()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r0.writeInbound(r1)
            r3.fetchDecoderOutput(r5)
            return
    }

    private void decodeContent(io.netty.handler.codec.http.HttpContent r3, java.util.List<java.lang.Object> r4) {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r3.content()
            r2.decode(r0, r4)
            boolean r0 = r3 instanceof io.netty.handler.codec.http.LastHttpContent
            if (r0 == 0) goto L2a
            r2.finishDecode(r4)
            io.netty.handler.codec.http.LastHttpContent r3 = (io.netty.handler.codec.http.LastHttpContent) r3
            io.netty.handler.codec.http.HttpHeaders r3 = r3.trailingHeaders()
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L20
            io.netty.handler.codec.http.LastHttpContent r3 = io.netty.handler.codec.http.LastHttpContent.EMPTY_LAST_CONTENT
            r4.add(r3)
            return
        L20:
            io.netty.handler.codec.http.ComposedLastHttpContent r0 = new io.netty.handler.codec.http.ComposedLastHttpContent
            io.netty.handler.codec.DecoderResult r1 = io.netty.handler.codec.DecoderResult.SUCCESS
            r0.<init>(r3, r1)
            r4.add(r0)
        L2a:
            return
    }

    private void fetchDecoderOutput(java.util.List<java.lang.Object> r3) {
            r2 = this;
        L0:
            io.netty.channel.embedded.EmbeddedChannel r0 = r2.decoder
            java.lang.Object r0 = r0.readInbound()
            io.netty.buffer.ByteBuf r0 = (io.netty.buffer.ByteBuf) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            boolean r1 = r0.isReadable()
            if (r1 != 0) goto L15
            r0.release()
            goto L0
        L15:
            io.netty.handler.codec.http.DefaultHttpContent r1 = new io.netty.handler.codec.http.DefaultHttpContent
            r1.<init>(r0)
            r3.add(r1)
            goto L0
    }

    private void finishDecode(java.util.List<java.lang.Object> r2) {
            r1 = this;
            io.netty.channel.embedded.EmbeddedChannel r0 = r1.decoder
            boolean r0 = r0.finish()
            if (r0 == 0) goto Lb
            r1.fetchDecoderOutput(r2)
        Lb:
            r2 = 0
            r1.decoder = r2
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelInactive(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r0.cleanupSafely(r1)
            super.channelInactive(r1)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelReadComplete(io.netty.channel.ChannelHandlerContext r3) throws java.lang.Exception {
            r2 = this;
            boolean r0 = r2.needRead
            r1 = 1
            r2.needRead = r1
            r3.fireChannelReadComplete()     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1b
            io.netty.channel.Channel r0 = r3.channel()
            io.netty.channel.ChannelConfig r0 = r0.config()
            boolean r0 = r0.isAutoRead()
            if (r0 != 0) goto L1b
            r3.read()
        L1b:
            return
        L1c:
            r1 = move-exception
            if (r0 == 0) goto L30
            io.netty.channel.Channel r0 = r3.channel()
            io.netty.channel.ChannelConfig r0 = r0.config()
            boolean r0 = r0.isAutoRead()
            if (r0 != 0) goto L30
            r3.read()
        L30:
            throw r1
    }

    /* renamed from: decode, reason: avoid collision after fix types in other method */
    protected void decode2(io.netty.channel.ChannelHandlerContext r6, io.netty.handler.codec.http.HttpObject r7, java.util.List<java.lang.Object> r8) throws java.lang.Exception {
            r5 = this;
            boolean r6 = r7 instanceof io.netty.handler.codec.http.HttpResponse     // Catch: java.lang.Throwable -> L1b
            if (r6 == 0) goto L2c
            r6 = r7
            io.netty.handler.codec.http.HttpResponse r6 = (io.netty.handler.codec.http.HttpResponse) r6     // Catch: java.lang.Throwable -> L1b
            io.netty.handler.codec.http.HttpResponseStatus r6 = r6.status()     // Catch: java.lang.Throwable -> L1b
            int r6 = r6.code()     // Catch: java.lang.Throwable -> L1b
            r0 = 100
            if (r6 != r0) goto L2c
            boolean r6 = r7 instanceof io.netty.handler.codec.http.LastHttpContent     // Catch: java.lang.Throwable -> L1b
            if (r6 != 0) goto L1e
            r6 = 1
            r5.continueResponse = r6     // Catch: java.lang.Throwable -> L1b
            goto L1e
        L1b:
            r6 = move-exception
            goto L11d
        L1e:
            java.lang.Object r6 = io.netty.util.ReferenceCountUtil.retain(r7)     // Catch: java.lang.Throwable -> L1b
            r8.add(r6)     // Catch: java.lang.Throwable -> L1b
        L25:
            boolean r6 = r8.isEmpty()
            r5.needRead = r6
            return
        L2c:
            boolean r6 = r5.continueResponse     // Catch: java.lang.Throwable -> L1b
            if (r6 == 0) goto L3f
            boolean r6 = r7 instanceof io.netty.handler.codec.http.LastHttpContent     // Catch: java.lang.Throwable -> L1b
            if (r6 == 0) goto L37
            r6 = 0
            r5.continueResponse = r6     // Catch: java.lang.Throwable -> L1b
        L37:
            java.lang.Object r6 = io.netty.util.ReferenceCountUtil.retain(r7)     // Catch: java.lang.Throwable -> L1b
            r8.add(r6)     // Catch: java.lang.Throwable -> L1b
            goto L25
        L3f:
            boolean r6 = r7 instanceof io.netty.handler.codec.http.HttpMessage     // Catch: java.lang.Throwable -> L1b
            if (r6 == 0) goto L105
            r5.cleanup()     // Catch: java.lang.Throwable -> L1b
            r6 = r7
            io.netty.handler.codec.http.HttpMessage r6 = (io.netty.handler.codec.http.HttpMessage) r6     // Catch: java.lang.Throwable -> L1b
            io.netty.handler.codec.http.HttpHeaders r0 = r6.headers()     // Catch: java.lang.Throwable -> L1b
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_ENCODING     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L5a
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L1b
            goto L5c
        L5a:
            java.lang.String r2 = io.netty.handler.codec.http.HttpContentDecoder.IDENTITY     // Catch: java.lang.Throwable -> L1b
        L5c:
            io.netty.channel.embedded.EmbeddedChannel r3 = r5.newContentDecoder(r2)     // Catch: java.lang.Throwable -> L1b
            r5.decoder = r3     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto L72
            boolean r7 = r6 instanceof io.netty.handler.codec.http.HttpContent     // Catch: java.lang.Throwable -> L1b
            if (r7 == 0) goto L6e
            r7 = r6
            io.netty.handler.codec.http.HttpContent r7 = (io.netty.handler.codec.http.HttpContent) r7     // Catch: java.lang.Throwable -> L1b
            r7.mo39retain()     // Catch: java.lang.Throwable -> L1b
        L6e:
            r8.add(r6)     // Catch: java.lang.Throwable -> L1b
            goto L25
        L72:
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_LENGTH     // Catch: java.lang.Throwable -> L1b
            boolean r4 = r0.contains(r3)     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L84
            r0.remove(r3)     // Catch: java.lang.Throwable -> L1b
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderNames.TRANSFER_ENCODING     // Catch: java.lang.Throwable -> L1b
            io.netty.util.AsciiString r4 = io.netty.handler.codec.http.HttpHeaderValues.CHUNKED     // Catch: java.lang.Throwable -> L1b
            r0.set(r3, r4)     // Catch: java.lang.Throwable -> L1b
        L84:
            java.lang.String r2 = r5.getTargetContentEncoding(r2)     // Catch: java.lang.Throwable -> L1b
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderValues.IDENTITY     // Catch: java.lang.Throwable -> L1b
            boolean r3 = r3.contentEquals(r2)     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L94
            r0.remove(r1)     // Catch: java.lang.Throwable -> L1b
            goto L97
        L94:
            r0.set(r1, r2)     // Catch: java.lang.Throwable -> L1b
        L97:
            boolean r0 = r6 instanceof io.netty.handler.codec.http.HttpContent     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L102
            boolean r0 = r6 instanceof io.netty.handler.codec.http.HttpRequest     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto Lb4
            r0 = r6
            io.netty.handler.codec.http.HttpRequest r0 = (io.netty.handler.codec.http.HttpRequest) r0     // Catch: java.lang.Throwable -> L1b
            io.netty.handler.codec.http.DefaultHttpRequest r1 = new io.netty.handler.codec.http.DefaultHttpRequest     // Catch: java.lang.Throwable -> L1b
            io.netty.handler.codec.http.HttpVersion r2 = r0.protocolVersion()     // Catch: java.lang.Throwable -> L1b
            io.netty.handler.codec.http.HttpMethod r3 = r0.method()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r0.uri()     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r2, r3, r0)     // Catch: java.lang.Throwable -> L1b
            goto Lc8
        Lb4:
            boolean r0 = r6 instanceof io.netty.handler.codec.http.HttpResponse     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto Lde
            r0 = r6
            io.netty.handler.codec.http.HttpResponse r0 = (io.netty.handler.codec.http.HttpResponse) r0     // Catch: java.lang.Throwable -> L1b
            io.netty.handler.codec.http.DefaultHttpResponse r1 = new io.netty.handler.codec.http.DefaultHttpResponse     // Catch: java.lang.Throwable -> L1b
            io.netty.handler.codec.http.HttpVersion r2 = r0.protocolVersion()     // Catch: java.lang.Throwable -> L1b
            io.netty.handler.codec.http.HttpResponseStatus r0 = r0.status()     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L1b
        Lc8:
            io.netty.handler.codec.http.HttpHeaders r0 = r1.headers()     // Catch: java.lang.Throwable -> L1b
            io.netty.handler.codec.http.HttpHeaders r2 = r6.headers()     // Catch: java.lang.Throwable -> L1b
            r0.set(r2)     // Catch: java.lang.Throwable -> L1b
            io.netty.handler.codec.DecoderResult r6 = r6.decoderResult()     // Catch: java.lang.Throwable -> L1b
            r1.setDecoderResult(r6)     // Catch: java.lang.Throwable -> L1b
            r8.add(r1)     // Catch: java.lang.Throwable -> L1b
            goto L105
        Lde:
            io.netty.handler.codec.CodecException r7 = new io.netty.handler.codec.CodecException     // Catch: java.lang.Throwable -> L1b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            r0.<init>()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "Object of class "
            r0.append(r1)     // Catch: java.lang.Throwable -> L1b
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L1b
            r0.append(r6)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r6 = " is not a HttpRequest or HttpResponse"
            r0.append(r6)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> L1b
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L1b
            throw r7     // Catch: java.lang.Throwable -> L1b
        L102:
            r8.add(r6)     // Catch: java.lang.Throwable -> L1b
        L105:
            boolean r6 = r7 instanceof io.netty.handler.codec.http.HttpContent     // Catch: java.lang.Throwable -> L1b
            if (r6 == 0) goto L25
            io.netty.handler.codec.http.HttpContent r7 = (io.netty.handler.codec.http.HttpContent) r7     // Catch: java.lang.Throwable -> L1b
            io.netty.channel.embedded.EmbeddedChannel r6 = r5.decoder     // Catch: java.lang.Throwable -> L1b
            if (r6 != 0) goto L118
            io.netty.handler.codec.http.HttpContent r6 = r7.mo39retain()     // Catch: java.lang.Throwable -> L1b
            r8.add(r6)     // Catch: java.lang.Throwable -> L1b
            goto L25
        L118:
            r5.decodeContent(r7, r8)     // Catch: java.lang.Throwable -> L1b
            goto L25
        L11d:
            boolean r7 = r8.isEmpty()
            r5.needRead = r7
            throw r6
    }

    @Override // io.netty.handler.codec.MessageToMessageDecoder
    protected /* bridge */ /* synthetic */ void decode(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http.HttpObject r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.HttpObject r2 = (io.netty.handler.codec.http.HttpObject) r2
            r0.decode2(r1, r2, r3)
            return
    }

    protected java.lang.String getTargetContentEncoding(java.lang.String r1) throws java.lang.Exception {
            r0 = this;
            java.lang.String r1 = io.netty.handler.codec.http.HttpContentDecoder.IDENTITY
            return r1
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerAdded(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r0.ctx = r1
            super.handlerAdded(r1)
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerRemoved(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r0.cleanupSafely(r1)
            super.handlerRemoved(r1)
            return
    }

    protected abstract io.netty.channel.embedded.EmbeddedChannel newContentDecoder(java.lang.String r1) throws java.lang.Exception;
}
