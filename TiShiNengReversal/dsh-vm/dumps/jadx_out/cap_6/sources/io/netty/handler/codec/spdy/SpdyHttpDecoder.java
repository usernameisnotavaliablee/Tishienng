package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SpdyHttpDecoder extends io.netty.handler.codec.MessageToMessageDecoder<io.netty.handler.codec.spdy.SpdyFrame> {
    private final int maxContentLength;
    private final java.util.Map<java.lang.Integer, io.netty.handler.codec.http.FullHttpMessage> messageMap;
    private final int spdyVersion;
    private final boolean validateHeaders;

    public SpdyHttpDecoder(io.netty.handler.codec.spdy.SpdyVersion r3, int r4) {
            r2 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 1
            r2.<init>(r3, r4, r0, r1)
            return
    }

    protected SpdyHttpDecoder(io.netty.handler.codec.spdy.SpdyVersion r2, int r3, java.util.Map<java.lang.Integer, io.netty.handler.codec.http.FullHttpMessage> r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r4, r0)
            return
    }

    protected SpdyHttpDecoder(io.netty.handler.codec.spdy.SpdyVersion r2, int r3, java.util.Map<java.lang.Integer, io.netty.handler.codec.http.FullHttpMessage> r4, boolean r5) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L17
            java.lang.String r0 = "maxContentLength"
            io.netty.util.internal.ObjectUtil.checkPositive(r3, r0)
            int r2 = r2.getVersion()
            r1.spdyVersion = r2
            r1.maxContentLength = r3
            r1.messageMap = r4
            r1.validateHeaders = r5
            return
        L17:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "version"
            r2.<init>(r3)
            throw r2
    }

    public SpdyHttpDecoder(io.netty.handler.codec.spdy.SpdyVersion r2, int r3, boolean r4) {
            r1 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.<init>(r2, r3, r0, r4)
            return
    }

    private static io.netty.handler.codec.http.FullHttpRequest createHttpRequest(io.netty.handler.codec.spdy.SpdyHeadersFrame r7, io.netty.buffer.ByteBufAllocator r8) throws java.lang.Exception {
            io.netty.handler.codec.spdy.SpdyHeaders r0 = r7.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.spdy.SpdyHeaders.HttpNames.METHOD
            java.lang.String r2 = r0.getAsString(r1)
            io.netty.handler.codec.http.HttpMethod r2 = io.netty.handler.codec.http.HttpMethod.valueOf(r2)
            io.netty.util.AsciiString r3 = io.netty.handler.codec.spdy.SpdyHeaders.HttpNames.PATH
            java.lang.String r4 = r0.getAsString(r3)
            io.netty.util.AsciiString r5 = io.netty.handler.codec.spdy.SpdyHeaders.HttpNames.VERSION
            java.lang.String r6 = r0.getAsString(r5)
            io.netty.handler.codec.http.HttpVersion r6 = io.netty.handler.codec.http.HttpVersion.valueOf(r6)
            r0.remove(r1)
            r0.remove(r3)
            r0.remove(r5)
            io.netty.buffer.ByteBuf r8 = r8.buffer()
            io.netty.handler.codec.http.DefaultFullHttpRequest r1 = new io.netty.handler.codec.http.DefaultFullHttpRequest     // Catch: java.lang.Throwable -> L6f
            r1.<init>(r6, r2, r4, r8)     // Catch: java.lang.Throwable -> L6f
            io.netty.util.AsciiString r2 = io.netty.handler.codec.spdy.SpdyHeaders.HttpNames.SCHEME     // Catch: java.lang.Throwable -> L6f
            r0.remove(r2)     // Catch: java.lang.Throwable -> L6f
            io.netty.util.AsciiString r2 = io.netty.handler.codec.spdy.SpdyHeaders.HttpNames.HOST     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r3 = r0.get(r2)     // Catch: java.lang.Throwable -> L6f
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch: java.lang.Throwable -> L6f
            r0.remove(r2)     // Catch: java.lang.Throwable -> L6f
            io.netty.handler.codec.http.HttpHeaders r0 = r1.headers()     // Catch: java.lang.Throwable -> L6f
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderNames.HOST     // Catch: java.lang.Throwable -> L6f
            r0.set(r2, r3)     // Catch: java.lang.Throwable -> L6f
            io.netty.handler.codec.spdy.SpdyHeaders r7 = r7.headers()     // Catch: java.lang.Throwable -> L6f
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L6f
        L51:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L6f
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L6f
            io.netty.handler.codec.http.HttpHeaders r2 = r1.headers()     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r3 = r0.getKey()     // Catch: java.lang.Throwable -> L6f
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L6f
            r2.add(r3, r0)     // Catch: java.lang.Throwable -> L6f
            goto L51
        L6f:
            r7 = move-exception
            goto L7f
        L71:
            r7 = 1
            io.netty.handler.codec.http.HttpUtil.setKeepAlive(r1, r7)     // Catch: java.lang.Throwable -> L6f
            io.netty.handler.codec.http.HttpHeaders r7 = r1.headers()     // Catch: java.lang.Throwable -> L6f
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.TRANSFER_ENCODING     // Catch: java.lang.Throwable -> L6f
            r7.remove(r0)     // Catch: java.lang.Throwable -> L6f
            return r1
        L7f:
            r8.release()
            throw r7
    }

    private static io.netty.handler.codec.http.FullHttpResponse createHttpResponse(io.netty.handler.codec.spdy.SpdyHeadersFrame r5, io.netty.buffer.ByteBufAllocator r6, boolean r7) throws java.lang.Exception {
            io.netty.handler.codec.spdy.SpdyHeaders r0 = r5.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.spdy.SpdyHeaders.HttpNames.STATUS
            java.lang.Object r2 = r0.get(r1)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            io.netty.handler.codec.http.HttpResponseStatus r2 = io.netty.handler.codec.http.HttpResponseStatus.parseLine(r2)
            io.netty.util.AsciiString r3 = io.netty.handler.codec.spdy.SpdyHeaders.HttpNames.VERSION
            java.lang.String r4 = r0.getAsString(r3)
            io.netty.handler.codec.http.HttpVersion r4 = io.netty.handler.codec.http.HttpVersion.valueOf(r4)
            r0.remove(r1)
            r0.remove(r3)
            io.netty.buffer.ByteBuf r6 = r6.buffer()
            io.netty.handler.codec.http.DefaultFullHttpResponse r0 = new io.netty.handler.codec.http.DefaultFullHttpResponse     // Catch: java.lang.Throwable -> L4f
            r0.<init>(r4, r2, r6, r7)     // Catch: java.lang.Throwable -> L4f
            io.netty.handler.codec.spdy.SpdyHeaders r5 = r5.headers()     // Catch: java.lang.Throwable -> L4f
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L4f
        L31:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> L4f
            if (r7 == 0) goto L51
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L4f
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Throwable -> L4f
            io.netty.handler.codec.http.HttpHeaders r1 = r0.headers()     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r2 = r7.getKey()     // Catch: java.lang.Throwable -> L4f
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> L4f
            r1.add(r2, r7)     // Catch: java.lang.Throwable -> L4f
            goto L31
        L4f:
            r5 = move-exception
            goto L68
        L51:
            r5 = 1
            io.netty.handler.codec.http.HttpUtil.setKeepAlive(r0, r5)     // Catch: java.lang.Throwable -> L4f
            io.netty.handler.codec.http.HttpHeaders r5 = r0.headers()     // Catch: java.lang.Throwable -> L4f
            io.netty.util.AsciiString r7 = io.netty.handler.codec.http.HttpHeaderNames.TRANSFER_ENCODING     // Catch: java.lang.Throwable -> L4f
            r5.remove(r7)     // Catch: java.lang.Throwable -> L4f
            io.netty.handler.codec.http.HttpHeaders r5 = r0.headers()     // Catch: java.lang.Throwable -> L4f
            io.netty.util.AsciiString r7 = io.netty.handler.codec.http.HttpHeaderNames.TRAILER     // Catch: java.lang.Throwable -> L4f
            r5.remove(r7)     // Catch: java.lang.Throwable -> L4f
            return r0
        L68:
            r6.release()
            throw r5
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelInactive(io.netty.channel.ChannelHandlerContext r3) throws java.lang.Exception {
            r2 = this;
            java.util.Map<java.lang.Integer, io.netty.handler.codec.http.FullHttpMessage> r0 = r2.messageMap
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            io.netty.util.ReferenceCountUtil.safeRelease(r1)
            goto La
        L1e:
            java.util.Map<java.lang.Integer, io.netty.handler.codec.http.FullHttpMessage> r0 = r2.messageMap
            r0.clear()
            super.channelInactive(r3)
            return
    }

    /* renamed from: decode, reason: avoid collision after fix types in other method */
    protected void decode2(io.netty.channel.ChannelHandlerContext r7, io.netty.handler.codec.spdy.SpdyFrame r8, java.util.List<java.lang.Object> r9) throws java.lang.Exception {
            r6 = this;
            boolean r0 = r8 instanceof io.netty.handler.codec.spdy.SpdySynStreamFrame
            if (r0 == 0) goto Le8
            io.netty.handler.codec.spdy.SpdySynStreamFrame r8 = (io.netty.handler.codec.spdy.SpdySynStreamFrame) r8
            int r0 = r8.streamId()
            boolean r1 = io.netty.handler.codec.spdy.SpdyCodecUtil.isServerId(r0)
            if (r1 == 0) goto L7b
            int r1 = r8.associatedStreamId()
            if (r1 != 0) goto L21
            io.netty.handler.codec.spdy.DefaultSpdyRstStreamFrame r8 = new io.netty.handler.codec.spdy.DefaultSpdyRstStreamFrame
            io.netty.handler.codec.spdy.SpdyStreamStatus r9 = io.netty.handler.codec.spdy.SpdyStreamStatus.INVALID_STREAM
            r8.<init>(r0, r9)
            r7.writeAndFlush(r8)
            return
        L21:
            boolean r2 = r8.isLast()
            if (r2 == 0) goto L32
            io.netty.handler.codec.spdy.DefaultSpdyRstStreamFrame r8 = new io.netty.handler.codec.spdy.DefaultSpdyRstStreamFrame
            io.netty.handler.codec.spdy.SpdyStreamStatus r9 = io.netty.handler.codec.spdy.SpdyStreamStatus.PROTOCOL_ERROR
            r8.<init>(r0, r9)
            r7.writeAndFlush(r8)
            return
        L32:
            boolean r2 = r8.isTruncated()
            if (r2 == 0) goto L43
            io.netty.handler.codec.spdy.DefaultSpdyRstStreamFrame r8 = new io.netty.handler.codec.spdy.DefaultSpdyRstStreamFrame
            io.netty.handler.codec.spdy.SpdyStreamStatus r9 = io.netty.handler.codec.spdy.SpdyStreamStatus.INTERNAL_ERROR
            r8.<init>(r0, r9)
            r7.writeAndFlush(r8)
            return
        L43:
            io.netty.buffer.ByteBufAllocator r2 = r7.alloc()     // Catch: java.lang.Throwable -> L6f
            io.netty.handler.codec.http.FullHttpRequest r2 = createHttpRequest(r8, r2)     // Catch: java.lang.Throwable -> L6f
            io.netty.handler.codec.http.HttpHeaders r3 = r2.headers()     // Catch: java.lang.Throwable -> L6f
            io.netty.util.AsciiString r4 = io.netty.handler.codec.spdy.SpdyHttpHeaders.Names.STREAM_ID     // Catch: java.lang.Throwable -> L6f
            r3.setInt(r4, r0)     // Catch: java.lang.Throwable -> L6f
            io.netty.handler.codec.http.HttpHeaders r3 = r2.headers()     // Catch: java.lang.Throwable -> L6f
            io.netty.util.AsciiString r4 = io.netty.handler.codec.spdy.SpdyHttpHeaders.Names.ASSOCIATED_TO_STREAM_ID     // Catch: java.lang.Throwable -> L6f
            r3.setInt(r4, r1)     // Catch: java.lang.Throwable -> L6f
            io.netty.handler.codec.http.HttpHeaders r1 = r2.headers()     // Catch: java.lang.Throwable -> L6f
            io.netty.util.AsciiString r3 = io.netty.handler.codec.spdy.SpdyHttpHeaders.Names.PRIORITY     // Catch: java.lang.Throwable -> L6f
            byte r8 = r8.priority()     // Catch: java.lang.Throwable -> L6f
            r1.setInt(r3, r8)     // Catch: java.lang.Throwable -> L6f
            r9.add(r2)     // Catch: java.lang.Throwable -> L6f
            goto L24a
        L6f:
            io.netty.handler.codec.spdy.DefaultSpdyRstStreamFrame r8 = new io.netty.handler.codec.spdy.DefaultSpdyRstStreamFrame
            io.netty.handler.codec.spdy.SpdyStreamStatus r9 = io.netty.handler.codec.spdy.SpdyStreamStatus.PROTOCOL_ERROR
            r8.<init>(r0, r9)
            r7.writeAndFlush(r8)
            goto L24a
        L7b:
            boolean r1 = r8.isTruncated()
            r2 = 1
            if (r1 == 0) goto La4
            io.netty.handler.codec.spdy.DefaultSpdySynReplyFrame r8 = new io.netty.handler.codec.spdy.DefaultSpdySynReplyFrame
            r8.<init>(r0)
            r8.setLast(r2)
            io.netty.handler.codec.spdy.SpdyHeaders r9 = r8.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.spdy.SpdyHeaders.HttpNames.STATUS
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.REQUEST_HEADER_FIELDS_TOO_LARGE
            int r1 = r1.code()
            r9.setInt(r0, r1)
            io.netty.util.AsciiString r0 = io.netty.handler.codec.spdy.SpdyHeaders.HttpNames.VERSION
            io.netty.handler.codec.http.HttpVersion r1 = io.netty.handler.codec.http.HttpVersion.HTTP_1_0
            r9.setObject(r0, r1)
            r7.writeAndFlush(r8)
            return
        La4:
            io.netty.buffer.ByteBufAllocator r1 = r7.alloc()     // Catch: java.lang.Throwable -> Lc5
            io.netty.handler.codec.http.FullHttpRequest r1 = createHttpRequest(r8, r1)     // Catch: java.lang.Throwable -> Lc5
            io.netty.handler.codec.http.HttpHeaders r3 = r1.headers()     // Catch: java.lang.Throwable -> Lc5
            io.netty.util.AsciiString r4 = io.netty.handler.codec.spdy.SpdyHttpHeaders.Names.STREAM_ID     // Catch: java.lang.Throwable -> Lc5
            r3.setInt(r4, r0)     // Catch: java.lang.Throwable -> Lc5
            boolean r8 = r8.isLast()     // Catch: java.lang.Throwable -> Lc5
            if (r8 == 0) goto Lc0
            r9.add(r1)     // Catch: java.lang.Throwable -> Lc5
            goto L24a
        Lc0:
            r6.putMessage(r0, r1)     // Catch: java.lang.Throwable -> Lc5
            goto L24a
        Lc5:
            io.netty.handler.codec.spdy.DefaultSpdySynReplyFrame r8 = new io.netty.handler.codec.spdy.DefaultSpdySynReplyFrame
            r8.<init>(r0)
            r8.setLast(r2)
            io.netty.handler.codec.spdy.SpdyHeaders r9 = r8.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.spdy.SpdyHeaders.HttpNames.STATUS
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.BAD_REQUEST
            int r1 = r1.code()
            r9.setInt(r0, r1)
            io.netty.util.AsciiString r0 = io.netty.handler.codec.spdy.SpdyHeaders.HttpNames.VERSION
            io.netty.handler.codec.http.HttpVersion r1 = io.netty.handler.codec.http.HttpVersion.HTTP_1_0
            r9.setObject(r0, r1)
            r7.writeAndFlush(r8)
            goto L24a
        Le8:
            boolean r0 = r8 instanceof io.netty.handler.codec.spdy.SpdySynReplyFrame
            r1 = 0
            if (r0 == 0) goto L137
            io.netty.handler.codec.spdy.SpdySynReplyFrame r8 = (io.netty.handler.codec.spdy.SpdySynReplyFrame) r8
            int r0 = r8.streamId()
            boolean r3 = r8.isTruncated()
            if (r3 == 0) goto L105
            io.netty.handler.codec.spdy.DefaultSpdyRstStreamFrame r8 = new io.netty.handler.codec.spdy.DefaultSpdyRstStreamFrame
            io.netty.handler.codec.spdy.SpdyStreamStatus r9 = io.netty.handler.codec.spdy.SpdyStreamStatus.INTERNAL_ERROR
            r8.<init>(r0, r9)
            r7.writeAndFlush(r8)
            return
        L105:
            io.netty.buffer.ByteBufAllocator r3 = r7.alloc()     // Catch: java.lang.Throwable -> L12b
            boolean r4 = r6.validateHeaders     // Catch: java.lang.Throwable -> L12b
            io.netty.handler.codec.http.FullHttpResponse r3 = createHttpResponse(r8, r3, r4)     // Catch: java.lang.Throwable -> L12b
            io.netty.handler.codec.http.HttpHeaders r4 = r3.headers()     // Catch: java.lang.Throwable -> L12b
            io.netty.util.AsciiString r5 = io.netty.handler.codec.spdy.SpdyHttpHeaders.Names.STREAM_ID     // Catch: java.lang.Throwable -> L12b
            r4.setInt(r5, r0)     // Catch: java.lang.Throwable -> L12b
            boolean r8 = r8.isLast()     // Catch: java.lang.Throwable -> L12b
            if (r8 == 0) goto L126
            io.netty.handler.codec.http.HttpUtil.setContentLength(r3, r1)     // Catch: java.lang.Throwable -> L12b
            r9.add(r3)     // Catch: java.lang.Throwable -> L12b
            goto L24a
        L126:
            r6.putMessage(r0, r3)     // Catch: java.lang.Throwable -> L12b
            goto L24a
        L12b:
            io.netty.handler.codec.spdy.DefaultSpdyRstStreamFrame r8 = new io.netty.handler.codec.spdy.DefaultSpdyRstStreamFrame
            io.netty.handler.codec.spdy.SpdyStreamStatus r9 = io.netty.handler.codec.spdy.SpdyStreamStatus.PROTOCOL_ERROR
            r8.<init>(r0, r9)
            r7.writeAndFlush(r8)
            goto L24a
        L137:
            boolean r0 = r8 instanceof io.netty.handler.codec.spdy.SpdyHeadersFrame
            if (r0 == 0) goto L1d2
            io.netty.handler.codec.spdy.SpdyHeadersFrame r8 = (io.netty.handler.codec.spdy.SpdyHeadersFrame) r8
            int r0 = r8.streamId()
            io.netty.handler.codec.http.FullHttpMessage r3 = r6.getMessage(r0)
            if (r3 != 0) goto L18d
            boolean r3 = io.netty.handler.codec.spdy.SpdyCodecUtil.isServerId(r0)
            if (r3 == 0) goto L24a
            boolean r3 = r8.isTruncated()
            if (r3 == 0) goto L15e
            io.netty.handler.codec.spdy.DefaultSpdyRstStreamFrame r8 = new io.netty.handler.codec.spdy.DefaultSpdyRstStreamFrame
            io.netty.handler.codec.spdy.SpdyStreamStatus r9 = io.netty.handler.codec.spdy.SpdyStreamStatus.INTERNAL_ERROR
            r8.<init>(r0, r9)
            r7.writeAndFlush(r8)
            return
        L15e:
            io.netty.buffer.ByteBufAllocator r3 = r7.alloc()     // Catch: java.lang.Throwable -> L182
            boolean r4 = r6.validateHeaders     // Catch: java.lang.Throwable -> L182
            io.netty.handler.codec.http.FullHttpResponse r3 = createHttpResponse(r8, r3, r4)     // Catch: java.lang.Throwable -> L182
            io.netty.handler.codec.http.HttpHeaders r4 = r3.headers()     // Catch: java.lang.Throwable -> L182
            io.netty.util.AsciiString r5 = io.netty.handler.codec.spdy.SpdyHttpHeaders.Names.STREAM_ID     // Catch: java.lang.Throwable -> L182
            r4.setInt(r5, r0)     // Catch: java.lang.Throwable -> L182
            boolean r8 = r8.isLast()     // Catch: java.lang.Throwable -> L182
            if (r8 == 0) goto L17e
            io.netty.handler.codec.http.HttpUtil.setContentLength(r3, r1)     // Catch: java.lang.Throwable -> L182
            r9.add(r3)     // Catch: java.lang.Throwable -> L182
            return
        L17e:
            r6.putMessage(r0, r3)     // Catch: java.lang.Throwable -> L182
            return
        L182:
            io.netty.handler.codec.spdy.DefaultSpdyRstStreamFrame r8 = new io.netty.handler.codec.spdy.DefaultSpdyRstStreamFrame
            io.netty.handler.codec.spdy.SpdyStreamStatus r9 = io.netty.handler.codec.spdy.SpdyStreamStatus.PROTOCOL_ERROR
            r8.<init>(r0, r9)
            r7.writeAndFlush(r8)
            return
        L18d:
            boolean r7 = r8.isTruncated()
            if (r7 != 0) goto L1b9
            io.netty.handler.codec.spdy.SpdyHeaders r7 = r8.headers()
            java.util.Iterator r7 = r7.iterator()
        L19b:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L1b9
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            io.netty.handler.codec.http.HttpHeaders r2 = r3.headers()
            java.lang.Object r4 = r1.getKey()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.Object r1 = r1.getValue()
            r2.add(r4, r1)
            goto L19b
        L1b9:
            boolean r7 = r8.isLast()
            if (r7 == 0) goto L24a
            io.netty.buffer.ByteBuf r7 = r3.content()
            int r7 = r7.readableBytes()
            long r7 = (long) r7
            io.netty.handler.codec.http.HttpUtil.setContentLength(r3, r7)
            r6.removeMessage(r0)
            r9.add(r3)
            return
        L1d2:
            boolean r7 = r8 instanceof io.netty.handler.codec.spdy.SpdyDataFrame
            if (r7 == 0) goto L23d
            io.netty.handler.codec.spdy.SpdyDataFrame r8 = (io.netty.handler.codec.spdy.SpdyDataFrame) r8
            int r7 = r8.streamId()
            io.netty.handler.codec.http.FullHttpMessage r0 = r6.getMessage(r7)
            if (r0 != 0) goto L1e3
            goto L24a
        L1e3:
            io.netty.buffer.ByteBuf r1 = r0.content()
            int r2 = r1.readableBytes()
            int r3 = r6.maxContentLength
            io.netty.buffer.ByteBuf r4 = r8.content()
            int r4 = r4.readableBytes()
            int r3 = r3 - r4
            if (r2 > r3) goto L21c
            io.netty.buffer.ByteBuf r2 = r8.content()
            int r3 = r2.readableBytes()
            int r4 = r2.readerIndex()
            r1.writeBytes(r2, r4, r3)
            boolean r8 = r8.isLast()
            if (r8 == 0) goto L24a
            int r8 = r1.readableBytes()
            long r1 = (long) r8
            io.netty.handler.codec.http.HttpUtil.setContentLength(r0, r1)
            r6.removeMessage(r7)
            r9.add(r0)
            return
        L21c:
            r6.removeMessage(r7)
            io.netty.handler.codec.TooLongFrameException r7 = new io.netty.handler.codec.TooLongFrameException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "HTTP content length exceeded "
            r8.append(r9)
            int r9 = r6.maxContentLength
            r8.append(r9)
            java.lang.String r9 = " bytes."
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L23d:
            boolean r7 = r8 instanceof io.netty.handler.codec.spdy.SpdyRstStreamFrame
            if (r7 == 0) goto L24a
            io.netty.handler.codec.spdy.SpdyRstStreamFrame r8 = (io.netty.handler.codec.spdy.SpdyRstStreamFrame) r8
            int r7 = r8.streamId()
            r6.removeMessage(r7)
        L24a:
            return
    }

    @Override // io.netty.handler.codec.MessageToMessageDecoder
    protected /* bridge */ /* synthetic */ void decode(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.spdy.SpdyFrame r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.spdy.SpdyFrame r2 = (io.netty.handler.codec.spdy.SpdyFrame) r2
            r0.decode2(r1, r2, r3)
            return
    }

    protected io.netty.handler.codec.http.FullHttpMessage getMessage(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, io.netty.handler.codec.http.FullHttpMessage> r0 = r1.messageMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            io.netty.handler.codec.http.FullHttpMessage r2 = (io.netty.handler.codec.http.FullHttpMessage) r2
            return r2
    }

    protected io.netty.handler.codec.http.FullHttpMessage putMessage(int r2, io.netty.handler.codec.http.FullHttpMessage r3) {
            r1 = this;
            java.util.Map<java.lang.Integer, io.netty.handler.codec.http.FullHttpMessage> r0 = r1.messageMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.put(r2, r3)
            io.netty.handler.codec.http.FullHttpMessage r2 = (io.netty.handler.codec.http.FullHttpMessage) r2
            return r2
    }

    protected io.netty.handler.codec.http.FullHttpMessage removeMessage(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, io.netty.handler.codec.http.FullHttpMessage> r0 = r1.messageMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.remove(r2)
            io.netty.handler.codec.http.FullHttpMessage r2 = (io.netty.handler.codec.http.FullHttpMessage) r2
            return r2
    }
}
