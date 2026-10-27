package io.netty.handler.codec.http.websocketx.extensions.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class DeflateDecoder extends io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionDecoder {
    static final io.netty.buffer.ByteBuf FRAME_TAIL = null;
    private io.netty.channel.embedded.EmbeddedChannel decoder;
    private final io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilter extensionDecoderFilter;
    private final boolean noContext;

    static {
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x0016: FILL_ARRAY_DATA , data: [0, 0, -1, -1} // fill-array
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.wrappedBuffer(r0)
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.unreleasableBuffer(r0)
            io.netty.buffer.ByteBuf r0 = r0.asReadOnly()
            io.netty.handler.codec.http.websocketx.extensions.compression.DeflateDecoder.FRAME_TAIL = r0
            return
    }

    DeflateDecoder(boolean r1, io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilter r2) {
            r0 = this;
            r0.<init>()
            r0.noContext = r1
            java.lang.String r1 = "extensionDecoderFilter"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r1)
            io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilter r1 = (io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilter) r1
            r0.extensionDecoderFilter = r1
            return
    }

    private void cleanup() {
            r1 = this;
            io.netty.channel.embedded.EmbeddedChannel r0 = r1.decoder
            if (r0 == 0) goto L1c
            boolean r0 = r0.finish()
            if (r0 == 0) goto L19
        La:
            io.netty.channel.embedded.EmbeddedChannel r0 = r1.decoder
            java.lang.Object r0 = r0.readOutbound()
            io.netty.buffer.ByteBuf r0 = (io.netty.buffer.ByteBuf) r0
            if (r0 != 0) goto L15
            goto L19
        L15:
            r0.release()
            goto La
        L19:
            r0 = 0
            r1.decoder = r0
        L1c:
            return
    }

    protected abstract boolean appendFrameTail(io.netty.handler.codec.http.websocketx.WebSocketFrame r1);

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelInactive(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r0.cleanup()
            super.channelInactive(r1)
            return
    }

    /* renamed from: decode, reason: avoid collision after fix types in other method */
    protected void decode2(io.netty.channel.ChannelHandlerContext r7, io.netty.handler.codec.http.websocketx.WebSocketFrame r8, java.util.List<java.lang.Object> r9) throws java.lang.Exception {
            r6 = this;
            io.netty.channel.embedded.EmbeddedChannel r0 = r6.decoder
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L3f
            boolean r0 = r8 instanceof io.netty.handler.codec.http.websocketx.TextWebSocketFrame
            if (r0 != 0) goto L2e
            boolean r0 = r8 instanceof io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame
            if (r0 == 0) goto Lf
            goto L2e
        Lf:
            io.netty.handler.codec.CodecException r7 = new io.netty.handler.codec.CodecException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "unexpected initial frame type: "
            r9.append(r0)
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8)
            throw r7
        L2e:
            io.netty.channel.embedded.EmbeddedChannel r0 = new io.netty.channel.embedded.EmbeddedChannel
            io.netty.handler.codec.compression.ZlibWrapper r3 = io.netty.handler.codec.compression.ZlibWrapper.NONE
            io.netty.handler.codec.compression.ZlibDecoder r3 = io.netty.handler.codec.compression.ZlibCodecFactory.newZlibDecoder(r3)
            io.netty.channel.ChannelHandler[] r4 = new io.netty.channel.ChannelHandler[r2]
            r4[r1] = r3
            r0.<init>(r4)
            r6.decoder = r0
        L3f:
            io.netty.buffer.ByteBuf r0 = r8.content()
            boolean r0 = r0.isReadable()
            io.netty.channel.embedded.EmbeddedChannel r3 = r6.decoder
            io.netty.buffer.ByteBuf r4 = r8.content()
            io.netty.buffer.ByteBuf r4 = r4.retain()
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r1] = r4
            r3.writeInbound(r5)
            boolean r3 = r6.appendFrameTail(r8)
            if (r3 == 0) goto L6d
            io.netty.channel.embedded.EmbeddedChannel r3 = r6.decoder
            io.netty.buffer.ByteBuf r4 = io.netty.handler.codec.http.websocketx.extensions.compression.DeflateDecoder.FRAME_TAIL
            io.netty.buffer.ByteBuf r4 = r4.duplicate()
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r1] = r4
            r3.writeInbound(r5)
        L6d:
            io.netty.buffer.ByteBufAllocator r7 = r7.alloc()
            io.netty.buffer.CompositeByteBuf r7 = r7.compositeBuffer()
        L75:
            io.netty.channel.embedded.EmbeddedChannel r1 = r6.decoder
            java.lang.Object r1 = r1.readInbound()
            io.netty.buffer.ByteBuf r1 = (io.netty.buffer.ByteBuf) r1
            if (r1 != 0) goto Lf8
            if (r0 == 0) goto L93
            int r0 = r7.numComponents()
            if (r0 <= 0) goto L88
            goto L93
        L88:
            r7.release()
            io.netty.handler.codec.CodecException r7 = new io.netty.handler.codec.CodecException
            java.lang.String r8 = "cannot read uncompressed buffer"
            r7.<init>(r8)
            throw r7
        L93:
            boolean r0 = r8.isFinalFragment()
            if (r0 == 0) goto La0
            boolean r0 = r6.noContext
            if (r0 == 0) goto La0
            r6.cleanup()
        La0:
            boolean r0 = r8 instanceof io.netty.handler.codec.http.websocketx.TextWebSocketFrame
            if (r0 == 0) goto Lb2
            io.netty.handler.codec.http.websocketx.TextWebSocketFrame r0 = new io.netty.handler.codec.http.websocketx.TextWebSocketFrame
            boolean r1 = r8.isFinalFragment()
            int r8 = r6.newRsv(r8)
            r0.<init>(r1, r8, r7)
            goto Ld5
        Lb2:
            boolean r0 = r8 instanceof io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame
            if (r0 == 0) goto Lc4
            io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame r0 = new io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame
            boolean r1 = r8.isFinalFragment()
            int r8 = r6.newRsv(r8)
            r0.<init>(r1, r8, r7)
            goto Ld5
        Lc4:
            boolean r0 = r8 instanceof io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame
            if (r0 == 0) goto Ld9
            io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r0 = new io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame
            boolean r1 = r8.isFinalFragment()
            int r8 = r6.newRsv(r8)
            r0.<init>(r1, r8, r7)
        Ld5:
            r9.add(r0)
            return
        Ld9:
            io.netty.handler.codec.CodecException r7 = new io.netty.handler.codec.CodecException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "unexpected frame type: "
            r9.append(r0)
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8)
            throw r7
        Lf8:
            boolean r3 = r1.isReadable()
            if (r3 != 0) goto L103
            r1.release()
            goto L75
        L103:
            r7.addComponent(r2, r1)
            goto L75
    }

    @Override // io.netty.handler.codec.MessageToMessageDecoder
    protected /* bridge */ /* synthetic */ void decode(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http.websocketx.WebSocketFrame r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.websocketx.WebSocketFrame r2 = (io.netty.handler.codec.http.websocketx.WebSocketFrame) r2
            r0.decode2(r1, r2, r3)
            return
    }

    protected io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilter extensionDecoderFilter() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilter r0 = r1.extensionDecoderFilter
            return r0
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerRemoved(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r0.cleanup()
            super.handlerRemoved(r1)
            return
    }

    protected abstract int newRsv(io.netty.handler.codec.http.websocketx.WebSocketFrame r1);
}
