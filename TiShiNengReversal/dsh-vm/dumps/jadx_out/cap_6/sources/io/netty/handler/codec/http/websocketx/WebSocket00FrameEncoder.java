package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class WebSocket00FrameEncoder extends io.netty.handler.codec.MessageToMessageEncoder<io.netty.handler.codec.http.websocketx.WebSocketFrame> implements io.netty.handler.codec.http.websocketx.WebSocketFrameEncoder {
    private static final io.netty.buffer.ByteBuf _0X00 = null;
    private static final io.netty.buffer.ByteBuf _0XFF = null;
    private static final io.netty.buffer.ByteBuf _0XFF_0X00 = null;

    static {
            r0 = 1
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.directBuffer(r0, r0)
            r2 = 0
            io.netty.buffer.ByteBuf r1 = r1.writeByte(r2)
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.unreleasableBuffer(r1)
            io.netty.handler.codec.http.websocketx.WebSocket00FrameEncoder._0X00 = r1
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.directBuffer(r0, r0)
            r1 = -1
            io.netty.buffer.ByteBuf r0 = r0.writeByte(r1)
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.unreleasableBuffer(r0)
            io.netty.handler.codec.http.websocketx.WebSocket00FrameEncoder._0XFF = r0
            r0 = 2
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.directBuffer(r0, r0)
            io.netty.buffer.ByteBuf r0 = r0.writeByte(r1)
            io.netty.buffer.ByteBuf r0 = r0.writeByte(r2)
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.unreleasableBuffer(r0)
            io.netty.handler.codec.http.websocketx.WebSocket00FrameEncoder._0XFF_0X00 = r0
            return
    }

    public WebSocket00FrameEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r5, io.netty.handler.codec.http.websocketx.WebSocketFrame r6, java.util.List<java.lang.Object> r7) throws java.lang.Exception {
            r4 = this;
            boolean r0 = r6 instanceof io.netty.handler.codec.http.websocketx.TextWebSocketFrame
            if (r0 == 0) goto L22
            io.netty.buffer.ByteBuf r5 = r6.content()
            io.netty.buffer.ByteBuf r6 = io.netty.handler.codec.http.websocketx.WebSocket00FrameEncoder._0X00
            io.netty.buffer.ByteBuf r6 = r6.duplicate()
            r7.add(r6)
            io.netty.buffer.ByteBuf r5 = r5.retain()
            r7.add(r5)
            io.netty.buffer.ByteBuf r5 = io.netty.handler.codec.http.websocketx.WebSocket00FrameEncoder._0XFF
            io.netty.buffer.ByteBuf r5 = r5.duplicate()
            r7.add(r5)
            return
        L22:
            boolean r0 = r6 instanceof io.netty.handler.codec.http.websocketx.CloseWebSocketFrame
            if (r0 == 0) goto L30
            io.netty.buffer.ByteBuf r5 = io.netty.handler.codec.http.websocketx.WebSocket00FrameEncoder._0XFF_0X00
            io.netty.buffer.ByteBuf r5 = r5.duplicate()
            r7.add(r5)
            return
        L30:
            io.netty.buffer.ByteBuf r6 = r6.content()
            int r0 = r6.readableBytes()
            io.netty.buffer.ByteBufAllocator r5 = r5.alloc()
            r1 = 5
            io.netty.buffer.ByteBuf r5 = r5.buffer(r1)
            r1 = -128(0xffffffffffffff80, float:NaN)
            r5.writeByte(r1)     // Catch: java.lang.Throwable -> L5e
            int r1 = r0 >>> 28
            r1 = r1 & 127(0x7f, float:1.78E-43)
            int r2 = r0 >>> 14
            r2 = r2 & 127(0x7f, float:1.78E-43)
            int r3 = r0 >>> 7
            r3 = r3 & 127(0x7f, float:1.78E-43)
            r0 = r0 & 127(0x7f, float:1.78E-43)
            if (r1 != 0) goto L77
            if (r2 != 0) goto L69
            if (r3 != 0) goto L60
            r5.writeByte(r0)     // Catch: java.lang.Throwable -> L5e
            goto L89
        L5e:
            r6 = move-exception
            goto L94
        L60:
            r1 = r3 | 128(0x80, float:1.8E-43)
            r5.writeByte(r1)     // Catch: java.lang.Throwable -> L5e
            r5.writeByte(r0)     // Catch: java.lang.Throwable -> L5e
            goto L89
        L69:
            r1 = r2 | 128(0x80, float:1.8E-43)
            r5.writeByte(r1)     // Catch: java.lang.Throwable -> L5e
            r1 = r3 | 128(0x80, float:1.8E-43)
            r5.writeByte(r1)     // Catch: java.lang.Throwable -> L5e
            r5.writeByte(r0)     // Catch: java.lang.Throwable -> L5e
            goto L89
        L77:
            r1 = r1 | 128(0x80, float:1.8E-43)
            r5.writeByte(r1)     // Catch: java.lang.Throwable -> L5e
            r1 = r2 | 128(0x80, float:1.8E-43)
            r5.writeByte(r1)     // Catch: java.lang.Throwable -> L5e
            r1 = r3 | 128(0x80, float:1.8E-43)
            r5.writeByte(r1)     // Catch: java.lang.Throwable -> L5e
            r5.writeByte(r0)     // Catch: java.lang.Throwable -> L5e
        L89:
            r7.add(r5)     // Catch: java.lang.Throwable -> L5e
            io.netty.buffer.ByteBuf r6 = r6.retain()     // Catch: java.lang.Throwable -> L5e
            r7.add(r6)     // Catch: java.lang.Throwable -> L5e
            return
        L94:
            r5.release()
            throw r6
    }

    @Override // io.netty.handler.codec.MessageToMessageEncoder
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http.websocketx.WebSocketFrame r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.websocketx.WebSocketFrame r2 = (io.netty.handler.codec.http.websocketx.WebSocketFrame) r2
            r0.encode2(r1, r2, r3)
            return
    }
}
