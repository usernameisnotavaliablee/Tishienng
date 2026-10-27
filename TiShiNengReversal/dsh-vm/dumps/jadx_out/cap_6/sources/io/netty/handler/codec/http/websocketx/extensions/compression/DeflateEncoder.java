package io.netty.handler.codec.http.websocketx.extensions.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class DeflateEncoder extends io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionEncoder {
    private final int compressionLevel;
    private io.netty.channel.embedded.EmbeddedChannel encoder;
    private final io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilter extensionEncoderFilter;
    private final boolean noContext;
    private final int windowSize;

    DeflateEncoder(int r1, int r2, boolean r3, io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilter r4) {
            r0 = this;
            r0.<init>()
            r0.compressionLevel = r1
            r0.windowSize = r2
            r0.noContext = r3
            java.lang.String r1 = "extensionEncoderFilter"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r1)
            io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilter r1 = (io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilter) r1
            r0.extensionEncoderFilter = r1
            return
    }

    private void cleanup() {
            r1 = this;
            io.netty.channel.embedded.EmbeddedChannel r0 = r1.encoder
            if (r0 == 0) goto L1c
            boolean r0 = r0.finish()
            if (r0 == 0) goto L19
        La:
            io.netty.channel.embedded.EmbeddedChannel r0 = r1.encoder
            java.lang.Object r0 = r0.readOutbound()
            io.netty.buffer.ByteBuf r0 = (io.netty.buffer.ByteBuf) r0
            if (r0 != 0) goto L15
            goto L19
        L15:
            r0.release()
            goto La
        L19:
            r0 = 0
            r1.encoder = r0
        L1c:
            return
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r8, io.netty.handler.codec.http.websocketx.WebSocketFrame r9, java.util.List<java.lang.Object> r10) throws java.lang.Exception {
            r7 = this;
            io.netty.channel.embedded.EmbeddedChannel r0 = r7.encoder
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L1d
            io.netty.channel.embedded.EmbeddedChannel r0 = new io.netty.channel.embedded.EmbeddedChannel
            io.netty.handler.codec.compression.ZlibWrapper r3 = io.netty.handler.codec.compression.ZlibWrapper.NONE
            int r4 = r7.compressionLevel
            int r5 = r7.windowSize
            r6 = 8
            io.netty.handler.codec.compression.ZlibEncoder r3 = io.netty.handler.codec.compression.ZlibCodecFactory.newZlibEncoder(r3, r4, r5, r6)
            io.netty.channel.ChannelHandler[] r4 = new io.netty.channel.ChannelHandler[r2]
            r4[r1] = r3
            r0.<init>(r4)
            r7.encoder = r0
        L1d:
            io.netty.channel.embedded.EmbeddedChannel r0 = r7.encoder
            io.netty.buffer.ByteBuf r3 = r9.content()
            io.netty.buffer.ByteBuf r3 = r3.retain()
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r1] = r3
            r0.writeOutbound(r4)
            io.netty.buffer.ByteBufAllocator r8 = r8.alloc()
            io.netty.buffer.CompositeByteBuf r8 = r8.compositeBuffer()
        L36:
            io.netty.channel.embedded.EmbeddedChannel r0 = r7.encoder
            java.lang.Object r0 = r0.readOutbound()
            io.netty.buffer.ByteBuf r0 = (io.netty.buffer.ByteBuf) r0
            if (r0 != 0) goto Lcb
            int r0 = r8.numComponents()
            if (r0 <= 0) goto Lc0
            boolean r0 = r9.isFinalFragment()
            if (r0 == 0) goto L53
            boolean r0 = r7.noContext
            if (r0 == 0) goto L53
            r7.cleanup()
        L53:
            boolean r0 = r7.removeFrameTail(r9)
            if (r0 == 0) goto L68
            int r0 = r8.readableBytes()
            io.netty.buffer.ByteBuf r2 = io.netty.handler.codec.http.websocketx.extensions.compression.DeflateDecoder.FRAME_TAIL
            int r2 = r2.readableBytes()
            int r0 = r0 - r2
            io.netty.buffer.ByteBuf r8 = r8.slice(r1, r0)
        L68:
            boolean r0 = r9 instanceof io.netty.handler.codec.http.websocketx.TextWebSocketFrame
            if (r0 == 0) goto L7a
            io.netty.handler.codec.http.websocketx.TextWebSocketFrame r0 = new io.netty.handler.codec.http.websocketx.TextWebSocketFrame
            boolean r1 = r9.isFinalFragment()
            int r9 = r7.rsv(r9)
            r0.<init>(r1, r9, r8)
            goto L9d
        L7a:
            boolean r0 = r9 instanceof io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame
            if (r0 == 0) goto L8c
            io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame r0 = new io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame
            boolean r1 = r9.isFinalFragment()
            int r9 = r7.rsv(r9)
            r0.<init>(r1, r9, r8)
            goto L9d
        L8c:
            boolean r0 = r9 instanceof io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame
            if (r0 == 0) goto La1
            io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r0 = new io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame
            boolean r1 = r9.isFinalFragment()
            int r9 = r7.rsv(r9)
            r0.<init>(r1, r9, r8)
        L9d:
            r10.add(r0)
            return
        La1:
            io.netty.handler.codec.CodecException r8 = new io.netty.handler.codec.CodecException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "unexpected frame type: "
            r10.append(r0)
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        Lc0:
            r8.release()
            io.netty.handler.codec.CodecException r8 = new io.netty.handler.codec.CodecException
            java.lang.String r9 = "cannot read compressed buffer"
            r8.<init>(r9)
            throw r8
        Lcb:
            boolean r3 = r0.isReadable()
            if (r3 != 0) goto Ld6
            r0.release()
            goto L36
        Ld6:
            r8.addComponent(r2, r0)
            goto L36
    }

    @Override // io.netty.handler.codec.MessageToMessageEncoder
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http.websocketx.WebSocketFrame r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.websocketx.WebSocketFrame r2 = (io.netty.handler.codec.http.websocketx.WebSocketFrame) r2
            r0.encode2(r1, r2, r3)
            return
    }

    protected io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilter extensionEncoderFilter() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilter r0 = r1.extensionEncoderFilter
            return r0
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerRemoved(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r0.cleanup()
            super.handlerRemoved(r1)
            return
    }

    protected abstract boolean removeFrameTail(io.netty.handler.codec.http.websocketx.WebSocketFrame r1);

    protected abstract int rsv(io.netty.handler.codec.http.websocketx.WebSocketFrame r1);
}
