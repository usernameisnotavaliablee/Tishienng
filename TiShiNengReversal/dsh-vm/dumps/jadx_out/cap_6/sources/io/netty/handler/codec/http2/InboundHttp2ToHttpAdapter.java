package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class InboundHttp2ToHttpAdapter extends io.netty.handler.codec.http2.Http2EventAdapter {
    private static final io.netty.handler.codec.http2.InboundHttp2ToHttpAdapter.ImmediateSendDetector DEFAULT_SEND_DETECTOR = null;
    protected final io.netty.handler.codec.http2.Http2Connection connection;
    private final int maxContentLength;
    private final io.netty.handler.codec.http2.Http2Connection.PropertyKey messageKey;
    private final boolean propagateSettings;
    private final io.netty.handler.codec.http2.InboundHttp2ToHttpAdapter.ImmediateSendDetector sendDetector;
    protected final boolean validateHttpHeaders;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface ImmediateSendDetector {
        io.netty.handler.codec.http.FullHttpMessage copyIfNeeded(io.netty.handler.codec.http.FullHttpMessage r1);

        boolean mustSendImmediately(io.netty.handler.codec.http.FullHttpMessage r1);
    }

    static {
            io.netty.handler.codec.http2.InboundHttp2ToHttpAdapter$1 r0 = new io.netty.handler.codec.http2.InboundHttp2ToHttpAdapter$1
            r0.<init>()
            io.netty.handler.codec.http2.InboundHttp2ToHttpAdapter.DEFAULT_SEND_DETECTOR = r0
            return
    }

    protected InboundHttp2ToHttpAdapter(io.netty.handler.codec.http2.Http2Connection r2, int r3, boolean r4, boolean r5) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "connection"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            if (r3 <= 0) goto L1d
            r1.connection = r2
            r1.maxContentLength = r3
            r1.validateHttpHeaders = r4
            r1.propagateSettings = r5
            io.netty.handler.codec.http2.InboundHttp2ToHttpAdapter$ImmediateSendDetector r3 = io.netty.handler.codec.http2.InboundHttp2ToHttpAdapter.DEFAULT_SEND_DETECTOR
            r1.sendDetector = r3
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r2 = r2.newKey()
            r1.messageKey = r2
            return
        L1d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "maxContentLength: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = " (expected: > 0)"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
    }

    private void processHeadersEnd(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http2.Http2Stream r2, io.netty.handler.codec.http.FullHttpMessage r3, boolean r4) {
            r0 = this;
            if (r4 == 0) goto Lf
            io.netty.handler.codec.http.FullHttpMessage r4 = r0.getMessage(r2)
            if (r4 == r3) goto La
            r4 = 1
            goto Lb
        La:
            r4 = 0
        Lb:
            r0.fireChannelRead(r1, r3, r4, r2)
            return
        Lf:
            r0.putMessage(r2, r3)
            return
    }

    protected void fireChannelRead(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http.FullHttpMessage r2, boolean r3, io.netty.handler.codec.http2.Http2Stream r4) {
            r0 = this;
            r0.removeMessage(r4, r3)
            io.netty.buffer.ByteBuf r3 = r2.content()
            int r3 = r3.readableBytes()
            long r3 = (long) r3
            io.netty.handler.codec.http.HttpUtil.setContentLength(r2, r3)
            r1.fireChannelRead(r2)
            return
    }

    protected final io.netty.handler.codec.http.FullHttpMessage getMessage(io.netty.handler.codec.http2.Http2Stream r2) {
            r1 = this;
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r0 = r1.messageKey
            java.lang.Object r2 = r2.getProperty(r0)
            io.netty.handler.codec.http.FullHttpMessage r2 = (io.netty.handler.codec.http.FullHttpMessage) r2
            return r2
    }

    protected io.netty.handler.codec.http.FullHttpMessage newMessage(io.netty.handler.codec.http2.Http2Stream r2, io.netty.handler.codec.http2.Http2Headers r3, boolean r4, io.netty.buffer.ByteBufAllocator r5) throws io.netty.handler.codec.http2.Http2Exception {
            r1 = this;
            io.netty.handler.codec.http2.Http2Connection r0 = r1.connection
            boolean r0 = r0.isServer()
            if (r0 == 0) goto L11
            int r2 = r2.id()
            io.netty.handler.codec.http.FullHttpRequest r2 = io.netty.handler.codec.http2.HttpConversionUtil.toFullHttpRequest(r2, r3, r5, r4)
            return r2
        L11:
            int r2 = r2.id()
            io.netty.handler.codec.http.FullHttpResponse r2 = io.netty.handler.codec.http2.HttpConversionUtil.toFullHttpResponse(r2, r3, r5, r4)
            return r2
    }

    @Override // io.netty.handler.codec.http2.Http2EventAdapter, io.netty.handler.codec.http2.Http2FrameListener
    public int onDataRead(io.netty.channel.ChannelHandlerContext r10, int r11, io.netty.buffer.ByteBuf r12, int r13, boolean r14) throws io.netty.handler.codec.http2.Http2Exception {
            r9 = this;
            io.netty.handler.codec.http2.Http2Connection r0 = r9.connection
            io.netty.handler.codec.http2.Http2Stream r0 = r0.stream(r11)
            io.netty.handler.codec.http.FullHttpMessage r1 = r9.getMessage(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L46
            io.netty.buffer.ByteBuf r4 = r1.content()
            int r5 = r12.readableBytes()
            int r6 = r4.readableBytes()
            int r7 = r9.maxContentLength
            int r8 = r7 - r5
            if (r6 > r8) goto L2e
            int r11 = r12.readerIndex()
            r4.writeBytes(r12, r11, r5)
            if (r14 == 0) goto L2c
            r9.fireChannelRead(r10, r1, r3, r0)
        L2c:
            int r5 = r5 + r13
            return r5
        L2e:
            io.netty.handler.codec.http2.Http2Error r10 = io.netty.handler.codec.http2.Http2Error.INTERNAL_ERROR
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13 = 2
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r13[r3] = r12
            r13[r2] = r11
            java.lang.String r11 = "Content length exceeded max of %d for stream id %d"
            io.netty.handler.codec.http2.Http2Exception r10 = io.netty.handler.codec.http2.Http2Exception.connectionError(r10, r11, r13)
            throw r10
        L46:
            io.netty.handler.codec.http2.Http2Error r10 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r3] = r11
            java.lang.String r11 = "Data Frame received for unknown stream id %d"
            io.netty.handler.codec.http2.Http2Exception r10 = io.netty.handler.codec.http2.Http2Exception.connectionError(r10, r11, r12)
            throw r10
    }

    @Override // io.netty.handler.codec.http2.Http2EventAdapter, io.netty.handler.codec.http2.Http2FrameListener
    public void onHeadersRead(io.netty.channel.ChannelHandlerContext r8, int r9, io.netty.handler.codec.http2.Http2Headers r10, int r11, short r12, boolean r13, int r14, boolean r15) throws io.netty.handler.codec.http2.Http2Exception {
            r7 = this;
            io.netty.handler.codec.http2.Http2Connection r13 = r7.connection
            io.netty.handler.codec.http2.Http2Stream r2 = r13.stream(r9)
            r5 = 1
            r6 = 1
            r0 = r7
            r1 = r8
            r3 = r10
            r4 = r15
            io.netty.handler.codec.http.FullHttpMessage r8 = r0.processHeadersBegin(r1, r2, r3, r4, r5, r6)
            if (r8 == 0) goto L31
            if (r11 == 0) goto L21
            io.netty.handler.codec.http.HttpHeaders r9 = r8.headers()
            io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames r10 = io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames.STREAM_DEPENDENCY_ID
            io.netty.util.AsciiString r10 = r10.text()
            r9.setInt(r10, r11)
        L21:
            io.netty.handler.codec.http.HttpHeaders r9 = r8.headers()
            io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames r10 = io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames.STREAM_WEIGHT
            io.netty.util.AsciiString r10 = r10.text()
            r9.setShort(r10, r12)
            r7.processHeadersEnd(r1, r2, r8, r4)
        L31:
            return
    }

    @Override // io.netty.handler.codec.http2.Http2EventAdapter, io.netty.handler.codec.http2.Http2FrameListener
    public void onHeadersRead(io.netty.channel.ChannelHandlerContext r8, int r9, io.netty.handler.codec.http2.Http2Headers r10, int r11, boolean r12) throws io.netty.handler.codec.http2.Http2Exception {
            r7 = this;
            io.netty.handler.codec.http2.Http2Connection r11 = r7.connection
            io.netty.handler.codec.http2.Http2Stream r2 = r11.stream(r9)
            r5 = 1
            r6 = 1
            r0 = r7
            r1 = r8
            r3 = r10
            r4 = r12
            io.netty.handler.codec.http.FullHttpMessage r8 = r0.processHeadersBegin(r1, r2, r3, r4, r5, r6)
            if (r8 == 0) goto L15
            r7.processHeadersEnd(r1, r2, r8, r4)
        L15:
            return
    }

    @Override // io.netty.handler.codec.http2.Http2EventAdapter, io.netty.handler.codec.http2.Http2FrameListener
    public void onPushPromiseRead(io.netty.channel.ChannelHandlerContext r8, int r9, int r10, io.netty.handler.codec.http2.Http2Headers r11, int r12) throws io.netty.handler.codec.http2.Http2Exception {
            r7 = this;
            io.netty.handler.codec.http2.Http2Connection r12 = r7.connection
            io.netty.handler.codec.http2.Http2Stream r2 = r12.stream(r10)
            java.lang.CharSequence r12 = r11.status()
            if (r12 != 0) goto L15
            io.netty.handler.codec.http.HttpResponseStatus r12 = io.netty.handler.codec.http.HttpResponseStatus.OK
            io.netty.util.AsciiString r12 = r12.codeAsText()
            r11.status(r12)
        L15:
            r5 = 0
            r6 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r3 = r11
            io.netty.handler.codec.http.FullHttpMessage r8 = r0.processHeadersBegin(r1, r2, r3, r4, r5, r6)
            r11 = 0
            if (r8 == 0) goto L42
            io.netty.handler.codec.http.HttpHeaders r10 = r8.headers()
            io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames r12 = io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames.STREAM_PROMISE_ID
            io.netty.util.AsciiString r12 = r12.text()
            r10.setInt(r12, r9)
            io.netty.handler.codec.http.HttpHeaders r9 = r8.headers()
            io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames r10 = io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames.STREAM_WEIGHT
            io.netty.util.AsciiString r10 = r10.text()
            r12 = 16
            r9.setShort(r10, r12)
            r7.processHeadersEnd(r1, r2, r8, r11)
            return
        L42:
            io.netty.handler.codec.http2.Http2Error r8 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r10 = 1
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r11] = r9
            java.lang.String r9 = "Push Promise Frame received for pre-existing stream id %d"
            io.netty.handler.codec.http2.Http2Exception r8 = io.netty.handler.codec.http2.Http2Exception.connectionError(r8, r9, r10)
            throw r8
    }

    @Override // io.netty.handler.codec.http2.Http2EventAdapter, io.netty.handler.codec.http2.Http2FrameListener
    public void onRstStreamRead(io.netty.channel.ChannelHandlerContext r3, int r4, long r5) throws io.netty.handler.codec.http2.Http2Exception {
            r2 = this;
            io.netty.handler.codec.http2.Http2Connection r0 = r2.connection
            io.netty.handler.codec.http2.Http2Stream r0 = r0.stream(r4)
            io.netty.handler.codec.http.FullHttpMessage r1 = r2.getMessage(r0)
            if (r1 == 0) goto Lf
            r2.onRstStreamRead(r0, r1)
        Lf:
            io.netty.handler.codec.http2.Http2Error r5 = io.netty.handler.codec.http2.Http2Error.valueOf(r5)
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r0 = "HTTP/2 to HTTP layer caught stream reset"
            io.netty.handler.codec.http2.Http2Exception r4 = io.netty.handler.codec.http2.Http2Exception.streamError(r4, r5, r0, r6)
            r3.fireExceptionCaught(r4)
            return
    }

    protected void onRstStreamRead(io.netty.handler.codec.http2.Http2Stream r1, io.netty.handler.codec.http.FullHttpMessage r2) {
            r0 = this;
            r2 = 1
            r0.removeMessage(r1, r2)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2EventAdapter, io.netty.handler.codec.http2.Http2FrameListener
    public void onSettingsRead(io.netty.channel.ChannelHandlerContext r2, io.netty.handler.codec.http2.Http2Settings r3) throws io.netty.handler.codec.http2.Http2Exception {
            r1 = this;
            boolean r0 = r1.propagateSettings
            if (r0 == 0) goto L7
            r2.fireChannelRead(r3)
        L7:
            return
    }

    @Override // io.netty.handler.codec.http2.Http2EventAdapter, io.netty.handler.codec.http2.Http2Connection.Listener
    public void onStreamRemoved(io.netty.handler.codec.http2.Http2Stream r2) {
            r1 = this;
            r0 = 1
            r1.removeMessage(r2, r0)
            return
    }

    protected io.netty.handler.codec.http.FullHttpMessage processHeadersBegin(io.netty.channel.ChannelHandlerContext r4, io.netty.handler.codec.http2.Http2Stream r5, io.netty.handler.codec.http2.Http2Headers r6, boolean r7, boolean r8, boolean r9) throws io.netty.handler.codec.http2.Http2Exception {
            r3 = this;
            io.netty.handler.codec.http.FullHttpMessage r0 = r3.getMessage(r5)
            r1 = 0
            if (r0 != 0) goto L13
            boolean r8 = r3.validateHttpHeaders
            io.netty.buffer.ByteBufAllocator r9 = r4.alloc()
            io.netty.handler.codec.http.FullHttpMessage r0 = r3.newMessage(r5, r6, r8, r9)
            r6 = 1
            goto L21
        L13:
            r2 = 0
            if (r8 == 0) goto L1f
            int r8 = r5.id()
            io.netty.handler.codec.http2.HttpConversionUtil.addHttp2ToHttpHeaders(r8, r6, r0, r9)
        L1d:
            r6 = 0
            goto L21
        L1f:
            r0 = r1
            goto L1d
        L21:
            io.netty.handler.codec.http2.InboundHttp2ToHttpAdapter$ImmediateSendDetector r8 = r3.sendDetector
            boolean r8 = r8.mustSendImmediately(r0)
            if (r8 == 0) goto L36
            if (r7 == 0) goto L2c
            goto L32
        L2c:
            io.netty.handler.codec.http2.InboundHttp2ToHttpAdapter$ImmediateSendDetector r7 = r3.sendDetector
            io.netty.handler.codec.http.FullHttpMessage r1 = r7.copyIfNeeded(r0)
        L32:
            r3.fireChannelRead(r4, r0, r6, r5)
            return r1
        L36:
            return r0
    }

    protected final void putMessage(io.netty.handler.codec.http2.Http2Stream r2, io.netty.handler.codec.http.FullHttpMessage r3) {
            r1 = this;
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r0 = r1.messageKey
            java.lang.Object r2 = r2.setProperty(r0, r3)
            io.netty.handler.codec.http.FullHttpMessage r2 = (io.netty.handler.codec.http.FullHttpMessage) r2
            if (r2 == r3) goto Lf
            if (r2 == 0) goto Lf
            r2.release()
        Lf:
            return
    }

    protected final void removeMessage(io.netty.handler.codec.http2.Http2Stream r2, boolean r3) {
            r1 = this;
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r0 = r1.messageKey
            java.lang.Object r2 = r2.removeProperty(r0)
            io.netty.handler.codec.http.FullHttpMessage r2 = (io.netty.handler.codec.http.FullHttpMessage) r2
            if (r3 == 0) goto Lf
            if (r2 == 0) goto Lf
            r2.release()
        Lf:
            return
    }
}
