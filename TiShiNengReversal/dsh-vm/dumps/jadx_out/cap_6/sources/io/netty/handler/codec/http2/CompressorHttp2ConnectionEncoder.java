package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class CompressorHttp2ConnectionEncoder extends io.netty.handler.codec.http2.DecoratingHttp2ConnectionEncoder {
    public static final int DEFAULT_COMPRESSION_LEVEL = 6;
    public static final int DEFAULT_MEM_LEVEL = 8;
    public static final int DEFAULT_WINDOW_BITS = 15;
    private final int compressionLevel;
    private final int memLevel;
    private final io.netty.handler.codec.http2.Http2Connection.PropertyKey propertyKey;
    private final int windowBits;


    public CompressorHttp2ConnectionEncoder(io.netty.handler.codec.http2.Http2ConnectionEncoder r4) {
            r3 = this;
            r0 = 15
            r1 = 8
            r2 = 6
            r3.<init>(r4, r2, r0, r1)
            return
    }

    public CompressorHttp2ConnectionEncoder(io.netty.handler.codec.http2.Http2ConnectionEncoder r2, int r3, int r4, int r5) {
            r1 = this;
            r1.<init>(r2)
            if (r3 < 0) goto L69
            r2 = 9
            if (r3 > r2) goto L69
            if (r4 < r2) goto L4d
            r0 = 15
            if (r4 > r0) goto L4d
            r0 = 1
            if (r5 < r0) goto L31
            if (r5 > r2) goto L31
            r1.compressionLevel = r3
            r1.windowBits = r4
            r1.memLevel = r5
            io.netty.handler.codec.http2.Http2Connection r2 = r1.connection()
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r2 = r2.newKey()
            r1.propertyKey = r2
            io.netty.handler.codec.http2.Http2Connection r2 = r1.connection()
            io.netty.handler.codec.http2.CompressorHttp2ConnectionEncoder$1 r3 = new io.netty.handler.codec.http2.CompressorHttp2ConnectionEncoder$1
            r3.<init>(r1)
            r2.addListener(r3)
            return
        L31:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "memLevel: "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r4 = " (expected: 1-9)"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L4d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "windowBits: "
            r3.append(r5)
            r3.append(r4)
            java.lang.String r4 = " (expected: 9-15)"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L69:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "compressionLevel: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = " (expected: 0-9)"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
    }

    static /* synthetic */ io.netty.handler.codec.http2.Http2Connection.PropertyKey access$000(io.netty.handler.codec.http2.CompressorHttp2ConnectionEncoder r0) {
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r0 = r0.propertyKey
            return r0
    }

    private void bindCompressorToStream(io.netty.channel.embedded.EmbeddedChannel r2, int r3) {
            r1 = this;
            if (r2 == 0) goto L11
            io.netty.handler.codec.http2.Http2Connection r0 = r1.connection()
            io.netty.handler.codec.http2.Http2Stream r3 = r0.stream(r3)
            if (r3 == 0) goto L11
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r0 = r1.propertyKey
            r3.setProperty(r0, r2)
        L11:
            return
    }

    private io.netty.channel.embedded.EmbeddedChannel newCompressionChannel(io.netty.channel.ChannelHandlerContext r7, io.netty.handler.codec.compression.ZlibWrapper r8) {
            r6 = this;
            io.netty.channel.embedded.EmbeddedChannel r0 = new io.netty.channel.embedded.EmbeddedChannel
            io.netty.channel.Channel r1 = r7.channel()
            io.netty.channel.ChannelId r1 = r1.id()
            io.netty.channel.Channel r2 = r7.channel()
            io.netty.channel.ChannelMetadata r2 = r2.metadata()
            boolean r2 = r2.hasDisconnect()
            io.netty.channel.Channel r7 = r7.channel()
            io.netty.channel.ChannelConfig r7 = r7.config()
            int r3 = r6.compressionLevel
            int r4 = r6.windowBits
            int r5 = r6.memLevel
            io.netty.handler.codec.compression.ZlibEncoder r8 = io.netty.handler.codec.compression.ZlibCodecFactory.newZlibEncoder(r8, r3, r4, r5)
            r3 = 1
            io.netty.channel.ChannelHandler[] r3 = new io.netty.channel.ChannelHandler[r3]
            r4 = 0
            r3[r4] = r8
            r0.<init>(r1, r2, r7, r3)
            return r0
    }

    private io.netty.channel.embedded.EmbeddedChannel newCompressor(io.netty.channel.ChannelHandlerContext r3, io.netty.handler.codec.http2.Http2Headers r4, boolean r5) throws io.netty.handler.codec.http2.Http2Exception {
            r2 = this;
            if (r5 == 0) goto L4
            r3 = 0
            return r3
        L4:
            io.netty.util.AsciiString r5 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_ENCODING
            java.lang.Object r0 = r4.get(r5)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 != 0) goto L10
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderValues.IDENTITY
        L10:
            io.netty.channel.embedded.EmbeddedChannel r3 = r2.newContentCompressor(r3, r0)
            if (r3 == 0) goto L2e
            java.lang.CharSequence r0 = r2.getTargetContentEncoding(r0)
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderValues.IDENTITY
            boolean r1 = r1.contentEqualsIgnoreCase(r0)
            if (r1 == 0) goto L26
            r4.remove(r5)
            goto L29
        L26:
            r4.set(r5, r0)
        L29:
            io.netty.util.AsciiString r5 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_LENGTH
            r4.remove(r5)
        L2e:
            return r3
    }

    private static io.netty.buffer.ByteBuf nextReadableBuf(io.netty.channel.embedded.EmbeddedChannel r2) {
        L0:
            java.lang.Object r0 = r2.readOutbound()
            io.netty.buffer.ByteBuf r0 = (io.netty.buffer.ByteBuf) r0
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            boolean r1 = r0.isReadable()
            if (r1 != 0) goto L14
            r0.release()
            goto L0
        L14:
            return r0
    }

    void cleanup(io.netty.handler.codec.http2.Http2Stream r2, io.netty.channel.embedded.EmbeddedChannel r3) {
            r1 = this;
            boolean r0 = r3.finish()
            if (r0 == 0) goto L13
        L6:
            java.lang.Object r0 = r3.readOutbound()
            io.netty.buffer.ByteBuf r0 = (io.netty.buffer.ByteBuf) r0
            if (r0 != 0) goto Lf
            goto L13
        Lf:
            r0.release()
            goto L6
        L13:
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r3 = r1.propertyKey
            r2.removeProperty(r3)
            return
    }

    protected java.lang.CharSequence getTargetContentEncoding(java.lang.CharSequence r1) throws io.netty.handler.codec.http2.Http2Exception {
            r0 = this;
            return r1
    }

    protected io.netty.channel.embedded.EmbeddedChannel newContentCompressor(io.netty.channel.ChannelHandlerContext r2, java.lang.CharSequence r3) throws io.netty.handler.codec.http2.Http2Exception {
            r1 = this;
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderValues.GZIP
            boolean r0 = r0.contentEqualsIgnoreCase(r3)
            if (r0 != 0) goto L2b
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderValues.X_GZIP
            boolean r0 = r0.contentEqualsIgnoreCase(r3)
            if (r0 == 0) goto L11
            goto L2b
        L11:
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderValues.DEFLATE
            boolean r0 = r0.contentEqualsIgnoreCase(r3)
            if (r0 != 0) goto L24
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderValues.X_DEFLATE
            boolean r3 = r0.contentEqualsIgnoreCase(r3)
            if (r3 == 0) goto L22
            goto L24
        L22:
            r2 = 0
            return r2
        L24:
            io.netty.handler.codec.compression.ZlibWrapper r3 = io.netty.handler.codec.compression.ZlibWrapper.ZLIB
            io.netty.channel.embedded.EmbeddedChannel r2 = r1.newCompressionChannel(r2, r3)
            return r2
        L2b:
            io.netty.handler.codec.compression.ZlibWrapper r3 = io.netty.handler.codec.compression.ZlibWrapper.GZIP
            io.netty.channel.embedded.EmbeddedChannel r2 = r1.newCompressionChannel(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.http2.DecoratingHttp2FrameWriter, io.netty.handler.codec.http2.Http2DataWriter
    public io.netty.channel.ChannelFuture writeData(io.netty.channel.ChannelHandlerContext r15, int r16, io.netty.buffer.ByteBuf r17, int r18, boolean r19, io.netty.channel.ChannelPromise r20) {
            r14 = this;
            io.netty.handler.codec.http2.Http2Connection r0 = r14.connection()
            r3 = r16
            io.netty.handler.codec.http2.Http2Stream r8 = r0.stream(r3)
            if (r8 != 0) goto Lf
            r0 = 0
        Ld:
            r9 = r0
            goto L18
        Lf:
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r0 = r14.propertyKey
            java.lang.Object r0 = r8.getProperty(r0)
            io.netty.channel.embedded.EmbeddedChannel r0 = (io.netty.channel.embedded.EmbeddedChannel) r0
            goto Ld
        L18:
            if (r9 != 0) goto L1f
            io.netty.channel.ChannelFuture r15 = super.writeData(r15, r16, r17, r18, r19, r20)
            return r15
        L1f:
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L5b
            r10 = 0
            r1[r10] = r17     // Catch: java.lang.Throwable -> L5b
            r9.writeOutbound(r1)     // Catch: java.lang.Throwable -> L5b
            io.netty.buffer.ByteBuf r1 = nextReadableBuf(r9)     // Catch: java.lang.Throwable -> L5b
            if (r1 != 0) goto L6c
            if (r19 == 0) goto L5f
            boolean r0 = r9.finish()     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L41
            io.netty.buffer.ByteBuf r1 = nextReadableBuf(r9)     // Catch: java.lang.Throwable -> L3b
            goto L41
        L3b:
            r0 = move-exception
            r15 = r0
            r11 = r20
            goto Lb4
        L41:
            if (r1 != 0) goto L45
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.EMPTY_BUFFER     // Catch: java.lang.Throwable -> L3b
        L45:
            r4 = r1
            r6 = 1
            r1 = r14
            r2 = r15
            r5 = r18
            r7 = r20
            io.netty.channel.ChannelFuture r15 = super.writeData(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L57
            if (r19 == 0) goto L56
            r14.cleanup(r8, r9)
        L56:
            return r15
        L57:
            r0 = move-exception
            r11 = r7
        L59:
            r15 = r0
            goto Lb4
        L5b:
            r0 = move-exception
            r11 = r20
            goto L59
        L5f:
            r11 = r20
            r11.setSuccess()     // Catch: java.lang.Throwable -> L6a
            if (r19 == 0) goto L69
            r14.cleanup(r8, r9)
        L69:
            return r11
        L6a:
            r0 = move-exception
            goto L59
        L6c:
            r11 = r20
            io.netty.util.concurrent.PromiseCombiner r12 = new io.netty.util.concurrent.PromiseCombiner     // Catch: java.lang.Throwable -> L6a
            io.netty.util.concurrent.EventExecutor r3 = r15.executor()     // Catch: java.lang.Throwable -> L6a
            r12.<init>(r3)     // Catch: java.lang.Throwable -> L6a
            r5 = r18
            r4 = r1
        L7a:
            io.netty.buffer.ByteBuf r1 = nextReadableBuf(r9)     // Catch: java.lang.Throwable -> L6a
            if (r1 != 0) goto L84
            if (r19 == 0) goto L84
            r3 = 1
            goto L85
        L84:
            r3 = 0
        L85:
            if (r3 == 0) goto L96
            boolean r6 = r9.finish()     // Catch: java.lang.Throwable -> L6a
            if (r6 == 0) goto L96
            io.netty.buffer.ByteBuf r1 = nextReadableBuf(r9)     // Catch: java.lang.Throwable -> L6a
            if (r1 != 0) goto L95
            r3 = 1
            goto L96
        L95:
            r3 = 0
        L96:
            r13 = r1
            r6 = r3
            io.netty.channel.ChannelPromise r7 = r15.newPromise()     // Catch: java.lang.Throwable -> L6a
            r12.add(r7)     // Catch: java.lang.Throwable -> L6a
            r1 = r14
            r2 = r15
            r3 = r16
            super.writeData(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L6a
            if (r13 != 0) goto Lb1
            r12.finish(r11)     // Catch: java.lang.Throwable -> L6a
            if (r19 == 0) goto Lbc
            r14.cleanup(r8, r9)
            return r11
        Lb1:
            r4 = r13
            r5 = 0
            goto L7a
        Lb4:
            r11.tryFailure(r15)     // Catch: java.lang.Throwable -> Lbd
            if (r19 == 0) goto Lbc
            r14.cleanup(r8, r9)
        Lbc:
            return r11
        Lbd:
            r0 = move-exception
            r15 = r0
            if (r19 == 0) goto Lc4
            r14.cleanup(r8, r9)
        Lc4:
            throw r15
    }

    @Override // io.netty.handler.codec.http2.DecoratingHttp2FrameWriter, io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeHeaders(io.netty.channel.ChannelHandlerContext r2, int r3, io.netty.handler.codec.http2.Http2Headers r4, int r5, short r6, boolean r7, int r8, boolean r9, io.netty.channel.ChannelPromise r10) {
            r1 = this;
            io.netty.channel.embedded.EmbeddedChannel r0 = r1.newCompressor(r2, r4, r9)     // Catch: java.lang.Throwable -> L11
            io.netty.channel.ChannelFuture r2 = super.writeHeaders(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L11
            r4 = r3
            r3 = r1
            r1.bindCompressorToStream(r0, r4)     // Catch: java.lang.Throwable -> Le
            return r2
        Le:
            r0 = move-exception
        Lf:
            r2 = r0
            goto L14
        L11:
            r0 = move-exception
            r3 = r1
            goto Lf
        L14:
            r10.tryFailure(r2)
            return r10
    }

    @Override // io.netty.handler.codec.http2.DecoratingHttp2FrameWriter, io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeHeaders(io.netty.channel.ChannelHandlerContext r2, int r3, io.netty.handler.codec.http2.Http2Headers r4, int r5, boolean r6, io.netty.channel.ChannelPromise r7) {
            r1 = this;
            io.netty.channel.embedded.EmbeddedChannel r0 = r1.newCompressor(r2, r4, r6)     // Catch: java.lang.Throwable -> L11
            io.netty.channel.ChannelFuture r2 = super.writeHeaders(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L11
            r4 = r3
            r3 = r1
            r1.bindCompressorToStream(r0, r4)     // Catch: java.lang.Throwable -> Le
            return r2
        Le:
            r0 = move-exception
        Lf:
            r2 = r0
            goto L14
        L11:
            r0 = move-exception
            r3 = r1
            goto Lf
        L14:
            r7.tryFailure(r2)
            return r7
    }
}
