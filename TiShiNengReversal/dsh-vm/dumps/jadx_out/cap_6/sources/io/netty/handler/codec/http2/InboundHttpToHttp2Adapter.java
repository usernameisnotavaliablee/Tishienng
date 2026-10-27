package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class InboundHttpToHttp2Adapter extends io.netty.channel.ChannelInboundHandlerAdapter {
    private final io.netty.handler.codec.http2.Http2Connection connection;
    private final io.netty.handler.codec.http2.Http2FrameListener listener;

    public InboundHttpToHttp2Adapter(io.netty.handler.codec.http2.Http2Connection r1, io.netty.handler.codec.http2.Http2FrameListener r2) {
            r0 = this;
            r0.<init>()
            r0.connection = r1
            r0.listener = r2
            return
    }

    private static int getStreamId(io.netty.handler.codec.http2.Http2Connection r1, io.netty.handler.codec.http.HttpHeaders r2) {
            io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames r0 = io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames.STREAM_ID
            io.netty.util.AsciiString r0 = r0.text()
            io.netty.handler.codec.http2.Http2Connection$Endpoint r1 = r1.remote()
            int r1 = r1.incrementAndGetNextStreamId()
            int r1 = r2.getInt(r0, r1)
            return r1
    }

    static void handle(io.netty.channel.ChannelHandlerContext r9, io.netty.handler.codec.http2.Http2Connection r10, io.netty.handler.codec.http2.Http2FrameListener r11, io.netty.handler.codec.http.FullHttpMessage r12) throws io.netty.handler.codec.http2.Http2Exception {
            io.netty.handler.codec.http.HttpHeaders r0 = r12.headers()     // Catch: java.lang.Throwable -> L18
            int r3 = getStreamId(r10, r0)     // Catch: java.lang.Throwable -> L18
            io.netty.handler.codec.http2.Http2Stream r0 = r10.stream(r3)     // Catch: java.lang.Throwable -> L18
            r1 = 0
            if (r0 != 0) goto L1b
            io.netty.handler.codec.http2.Http2Connection$Endpoint r10 = r10.remote()     // Catch: java.lang.Throwable -> L18
            io.netty.handler.codec.http2.Http2Stream r0 = r10.createStream(r3, r1)     // Catch: java.lang.Throwable -> L18
            goto L1b
        L18:
            r0 = move-exception
            r9 = r0
            goto L73
        L1b:
            io.netty.handler.codec.http.HttpHeaders r10 = r12.headers()     // Catch: java.lang.Throwable -> L18
            io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames r2 = io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames.SCHEME     // Catch: java.lang.Throwable -> L18
            io.netty.util.AsciiString r2 = r2.text()     // Catch: java.lang.Throwable -> L18
            io.netty.handler.codec.http.HttpScheme r4 = io.netty.handler.codec.http.HttpScheme.HTTP     // Catch: java.lang.Throwable -> L18
            io.netty.util.AsciiString r4 = r4.name()     // Catch: java.lang.Throwable -> L18
            r10.set(r2, r4)     // Catch: java.lang.Throwable -> L18
            r10 = 1
            io.netty.handler.codec.http2.Http2Headers r4 = io.netty.handler.codec.http2.HttpConversionUtil.toHttp2Headers(r12, r10)     // Catch: java.lang.Throwable -> L18
            io.netty.buffer.ByteBuf r2 = r12.content()     // Catch: java.lang.Throwable -> L18
            boolean r7 = r2.isReadable()     // Catch: java.lang.Throwable -> L18
            io.netty.handler.codec.http.HttpHeaders r2 = r12.trailingHeaders()     // Catch: java.lang.Throwable -> L18
            boolean r8 = r2.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r7 != 0) goto L49
            if (r8 == 0) goto L49
            r6 = 1
            goto L4a
        L49:
            r6 = 0
        L4a:
            r5 = 0
            r2 = r9
            r1 = r11
            r1.onHeadersRead(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L18
            if (r7 == 0) goto L5c
            io.netty.buffer.ByteBuf r4 = r12.content()     // Catch: java.lang.Throwable -> L18
            r5 = 0
            r6 = r8
            r1.onDataRead(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L18
            goto L5d
        L5c:
            r6 = r8
        L5d:
            if (r6 != 0) goto L6c
            io.netty.handler.codec.http.HttpHeaders r9 = r12.trailingHeaders()     // Catch: java.lang.Throwable -> L18
            io.netty.handler.codec.http2.Http2Headers r4 = io.netty.handler.codec.http2.HttpConversionUtil.toHttp2Headers(r9, r10)     // Catch: java.lang.Throwable -> L18
            r5 = 0
            r6 = 1
            r1.onHeadersRead(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L18
        L6c:
            r0.closeRemoteSide()     // Catch: java.lang.Throwable -> L18
            r12.release()
            return
        L73:
            r12.release()
            throw r9
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRead(io.netty.channel.ChannelHandlerContext r3, java.lang.Object r4) throws java.lang.Exception {
            r2 = this;
            boolean r0 = r4 instanceof io.netty.handler.codec.http.FullHttpMessage
            if (r0 == 0) goto Le
            io.netty.handler.codec.http2.Http2Connection r0 = r2.connection
            io.netty.handler.codec.http2.Http2FrameListener r1 = r2.listener
            io.netty.handler.codec.http.FullHttpMessage r4 = (io.netty.handler.codec.http.FullHttpMessage) r4
            handle(r3, r0, r1, r4)
            return
        Le:
            super.channelRead(r3, r4)
            return
    }
}
