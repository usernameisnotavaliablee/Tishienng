package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class HttpToHttp2ConnectionHandler extends io.netty.handler.codec.http2.Http2ConnectionHandler {
    private int currentStreamId;
    private final boolean validateHeaders;

    protected HttpToHttp2ConnectionHandler(io.netty.handler.codec.http2.Http2ConnectionDecoder r1, io.netty.handler.codec.http2.Http2ConnectionEncoder r2, io.netty.handler.codec.http2.Http2Settings r3, boolean r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.validateHeaders = r4
            return
    }

    protected HttpToHttp2ConnectionHandler(io.netty.handler.codec.http2.Http2ConnectionDecoder r1, io.netty.handler.codec.http2.Http2ConnectionEncoder r2, io.netty.handler.codec.http2.Http2Settings r3, boolean r4, boolean r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r5)
            r0.validateHeaders = r4
            return
    }

    private int getStreamId(io.netty.handler.codec.http.HttpHeaders r3) throws java.lang.Exception {
            r2 = this;
            io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames r0 = io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames.STREAM_ID
            io.netty.util.AsciiString r0 = r0.text()
            io.netty.handler.codec.http2.Http2Connection r1 = r2.connection()
            io.netty.handler.codec.http2.Http2Connection$Endpoint r1 = r1.local()
            int r1 = r1.incrementAndGetNextStreamId()
            int r3 = r3.getInt(r0, r1)
            return r3
    }

    private static void writeHeaders(io.netty.channel.ChannelHandlerContext r13, io.netty.handler.codec.http2.Http2ConnectionEncoder r14, int r15, io.netty.handler.codec.http.HttpHeaders r16, io.netty.handler.codec.http2.Http2Headers r17, boolean r18, io.netty.handler.codec.http2.Http2CodecUtil.SimpleChannelPromiseAggregator r19) {
            r0 = r16
            io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames r1 = io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames.STREAM_DEPENDENCY_ID
            io.netty.util.AsciiString r1 = r1.text()
            r2 = 0
            int r7 = r0.getInt(r1, r2)
            io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames r1 = io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames.STREAM_WEIGHT
            io.netty.util.AsciiString r1 = r1.text()
            r2 = 16
            short r8 = r0.getShort(r1, r2)
            r10 = 0
            io.netty.channel.ChannelPromise r12 = r19.newPromise()
            r9 = 0
            r4 = r13
            r3 = r14
            r5 = r15
            r6 = r17
            r11 = r18
            r3.writeHeaders(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionHandler, io.netty.channel.ChannelOutboundHandler
    public void write(io.netty.channel.ChannelHandlerContext r11, java.lang.Object r12, io.netty.channel.ChannelPromise r13) {
            r10 = this;
            boolean r0 = r12 instanceof io.netty.handler.codec.http.HttpMessage
            if (r0 != 0) goto Lc
            boolean r0 = r12 instanceof io.netty.handler.codec.http.HttpContent
            if (r0 != 0) goto Lc
            r11.write(r12, r13)
            return
        Lc:
            io.netty.handler.codec.http2.Http2CodecUtil$SimpleChannelPromiseAggregator r7 = new io.netty.handler.codec.http2.Http2CodecUtil$SimpleChannelPromiseAggregator
            io.netty.channel.Channel r0 = r11.channel()
            io.netty.util.concurrent.EventExecutor r1 = r11.executor()
            r7.<init>(r13, r0, r1)
            r13 = 1
            io.netty.handler.codec.http2.Http2ConnectionEncoder r2 = r10.encoder()     // Catch: java.lang.Throwable -> L49
            boolean r0 = r12 instanceof io.netty.handler.codec.http.HttpMessage     // Catch: java.lang.Throwable -> L49
            r8 = 0
            if (r0 == 0) goto L5c
            r0 = r12
            io.netty.handler.codec.http.HttpMessage r0 = (io.netty.handler.codec.http.HttpMessage) r0     // Catch: java.lang.Throwable -> L49
            io.netty.handler.codec.http.HttpHeaders r1 = r0.headers()     // Catch: java.lang.Throwable -> L49
            int r1 = r10.getStreamId(r1)     // Catch: java.lang.Throwable -> L49
            r10.currentStreamId = r1     // Catch: java.lang.Throwable -> L49
            boolean r1 = r10.validateHeaders     // Catch: java.lang.Throwable -> L49
            io.netty.handler.codec.http2.Http2Headers r5 = io.netty.handler.codec.http2.HttpConversionUtil.toHttp2Headers(r0, r1)     // Catch: java.lang.Throwable -> L49
            boolean r1 = r12 instanceof io.netty.handler.codec.http.FullHttpMessage     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L4e
            r1 = r12
            io.netty.handler.codec.http.FullHttpMessage r1 = (io.netty.handler.codec.http.FullHttpMessage) r1     // Catch: java.lang.Throwable -> L49
            io.netty.buffer.ByteBuf r1 = r1.content()     // Catch: java.lang.Throwable -> L49
            boolean r1 = r1.isReadable()     // Catch: java.lang.Throwable -> L49
            if (r1 != 0) goto L4e
            r6 = 1
            goto L4f
        L49:
            r0 = move-exception
            r1 = r11
        L4b:
            r8 = 1
            goto Lb8
        L4e:
            r6 = 0
        L4f:
            int r3 = r10.currentStreamId     // Catch: java.lang.Throwable -> L49
            io.netty.handler.codec.http.HttpHeaders r4 = r0.headers()     // Catch: java.lang.Throwable -> L49
            r1 = r11
            writeHeaders(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            r0 = move-exception
            goto L4b
        L5c:
            r1 = r11
            r6 = 0
        L5e:
            if (r6 != 0) goto Laf
            boolean r11 = r12 instanceof io.netty.handler.codec.http.HttpContent     // Catch: java.lang.Throwable -> L5a
            if (r11 == 0) goto Laf
            io.netty.handler.codec.http.EmptyHttpHeaders r11 = io.netty.handler.codec.http.EmptyHttpHeaders.INSTANCE     // Catch: java.lang.Throwable -> L5a
            io.netty.handler.codec.http2.EmptyHttp2Headers r0 = io.netty.handler.codec.http2.EmptyHttp2Headers.INSTANCE     // Catch: java.lang.Throwable -> L5a
            boolean r3 = r12 instanceof io.netty.handler.codec.http.LastHttpContent     // Catch: java.lang.Throwable -> L5a
            if (r3 == 0) goto L7c
            r11 = r12
            io.netty.handler.codec.http.LastHttpContent r11 = (io.netty.handler.codec.http.LastHttpContent) r11     // Catch: java.lang.Throwable -> L5a
            io.netty.handler.codec.http.HttpHeaders r11 = r11.trailingHeaders()     // Catch: java.lang.Throwable -> L5a
            boolean r0 = r10.validateHeaders     // Catch: java.lang.Throwable -> L5a
            io.netty.handler.codec.http2.Http2Headers r0 = io.netty.handler.codec.http2.HttpConversionUtil.toHttp2Headers(r11, r0)     // Catch: java.lang.Throwable -> L5a
            r9 = r0
            r0 = 1
            goto L7e
        L7c:
            r9 = r0
            r0 = 0
        L7e:
            r3 = r12
            io.netty.handler.codec.http.HttpContent r3 = (io.netty.handler.codec.http.HttpContent) r3     // Catch: java.lang.Throwable -> L5a
            io.netty.buffer.ByteBuf r3 = r3.content()     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L90
            boolean r0 = r11.isEmpty()     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L90
            r5 = 1
        L8e:
            r0 = r2
            goto L92
        L90:
            r5 = 0
            goto L8e
        L92:
            int r2 = r10.currentStreamId     // Catch: java.lang.Throwable -> Lac
            io.netty.channel.ChannelPromise r6 = r7.newPromise()     // Catch: java.lang.Throwable -> Lac
            r4 = 0
            r0.writeData(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lac
            r2 = r0
            boolean r0 = r11.isEmpty()     // Catch: java.lang.Throwable -> Lac
            if (r0 != 0) goto Lae
            int r3 = r10.currentStreamId     // Catch: java.lang.Throwable -> Lac
            r6 = 1
            r4 = r11
            r5 = r9
            writeHeaders(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lac
            goto Lae
        Lac:
            r0 = move-exception
            goto Lb8
        Lae:
            r13 = 0
        Laf:
            if (r13 == 0) goto Lb4
            io.netty.util.ReferenceCountUtil.release(r12)
        Lb4:
            r7.doneAllocatingPromises()
            return
        Lb8:
            r10.onError(r1, r13, r0)     // Catch: java.lang.Throwable -> Lc7
            r7.setFailure(r0)     // Catch: java.lang.Throwable -> Lc7
            if (r8 == 0) goto Lc3
            io.netty.util.ReferenceCountUtil.release(r12)
        Lc3:
            r7.doneAllocatingPromises()
            return
        Lc7:
            r0 = move-exception
            r11 = r0
            if (r8 == 0) goto Lce
            io.netty.util.ReferenceCountUtil.release(r12)
        Lce:
            r7.doneAllocatingPromises()
            throw r11
    }
}
