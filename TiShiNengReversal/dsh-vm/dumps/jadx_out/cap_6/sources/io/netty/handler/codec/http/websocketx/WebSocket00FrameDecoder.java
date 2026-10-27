package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class WebSocket00FrameDecoder extends io.netty.handler.codec.ReplayingDecoder<java.lang.Void> implements io.netty.handler.codec.http.websocketx.WebSocketFrameDecoder {
    static final int DEFAULT_MAX_FRAME_SIZE = 16384;
    private final long maxFrameSize;
    private boolean receivedClosingHandshake;

    public WebSocket00FrameDecoder() {
            r1 = this;
            r0 = 16384(0x4000, float:2.2959E-41)
            r1.<init>(r0)
            return
    }

    public WebSocket00FrameDecoder(int r3) {
            r2 = this;
            r2.<init>()
            long r0 = (long) r3
            r2.maxFrameSize = r0
            return
    }

    public WebSocket00FrameDecoder(io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "decoderConfig"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r3 = (io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig) r3
            int r3 = r3.maxFramePayloadLength()
            long r0 = (long) r3
            r2.maxFrameSize = r0
            return
    }

    private io.netty.handler.codec.http.websocketx.WebSocketFrame decodeBinaryFrame(io.netty.channel.ChannelHandlerContext r11, byte r12, io.netty.buffer.ByteBuf r13) {
            r10 = this;
            r0 = 0
            r2 = 0
            r3 = r0
            r5 = 0
        L5:
            byte r6 = r13.readByte()
            r7 = 7
            long r3 = r3 << r7
            r7 = r6 & 127(0x7f, float:1.78E-43)
            long r7 = (long) r7
            long r3 = r3 | r7
            long r7 = r10.maxFrameSize
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 > 0) goto L4d
            r7 = 1
            int r5 = r5 + r7
            r8 = 8
            if (r5 > r8) goto L47
            r6 = r6 & 128(0x80, float:1.8E-43)
            r8 = 128(0x80, float:1.8E-43)
            if (r6 == r8) goto L5
            r5 = -1
            if (r12 != r5) goto L38
            int r12 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r12 != 0) goto L38
            r10.receivedClosingHandshake = r7
            io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r12 = new io.netty.handler.codec.http.websocketx.CloseWebSocketFrame
            io.netty.buffer.ByteBufAllocator r11 = r11.alloc()
            io.netty.buffer.ByteBuf r11 = r11.buffer(r2)
            r12.<init>(r7, r2, r11)
            return r12
        L38:
            io.netty.buffer.ByteBufAllocator r11 = r11.alloc()
            int r12 = (int) r3
            io.netty.buffer.ByteBuf r11 = io.netty.buffer.ByteBufUtil.readBytes(r11, r13, r12)
            io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame r12 = new io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame
            r12.<init>(r11)
            return r12
        L47:
            io.netty.handler.codec.TooLongFrameException r11 = new io.netty.handler.codec.TooLongFrameException
            r11.<init>()
            throw r11
        L4d:
            io.netty.handler.codec.TooLongFrameException r11 = new io.netty.handler.codec.TooLongFrameException
            r11.<init>()
            throw r11
    }

    private io.netty.handler.codec.http.websocketx.WebSocketFrame decodeTextFrame(io.netty.channel.ChannelHandlerContext r8, io.netty.buffer.ByteBuf r9) {
            r7 = this;
            int r0 = r9.readerIndex()
            int r1 = r7.actualReadableBytes()
            int r2 = r0 + r1
            r3 = -1
            int r2 = r9.indexOf(r0, r2, r3)
            if (r2 != r3) goto L20
            long r8 = (long) r1
            long r0 = r7.maxFrameSize
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 > 0) goto L1a
            r8 = 0
            return r8
        L1a:
            io.netty.handler.codec.TooLongFrameException r8 = new io.netty.handler.codec.TooLongFrameException
            r8.<init>()
            throw r8
        L20:
            int r2 = r2 - r0
            long r0 = (long) r2
            long r4 = r7.maxFrameSize
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 > 0) goto L53
            io.netty.buffer.ByteBufAllocator r8 = r8.alloc()
            io.netty.buffer.ByteBuf r8 = io.netty.buffer.ByteBufUtil.readBytes(r8, r9, r2)
            r0 = 1
            r9.skipBytes(r0)
            int r9 = r8.readerIndex()
            int r0 = r8.writerIndex()
            int r9 = r8.indexOf(r9, r0, r3)
            if (r9 >= 0) goto L48
            io.netty.handler.codec.http.websocketx.TextWebSocketFrame r9 = new io.netty.handler.codec.http.websocketx.TextWebSocketFrame
            r9.<init>(r8)
            return r9
        L48:
            r8.release()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "a text frame should not contain 0xFF."
            r8.<init>(r9)
            throw r8
        L53:
            io.netty.handler.codec.TooLongFrameException r8 = new io.netty.handler.codec.TooLongFrameException
            r8.<init>()
            throw r8
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r4, io.netty.buffer.ByteBuf r5, java.util.List<java.lang.Object> r6) throws java.lang.Exception {
            r3 = this;
            boolean r0 = r3.receivedClosingHandshake
            if (r0 == 0) goto Lc
            int r4 = r3.actualReadableBytes()
            r5.skipBytes(r4)
            return
        Lc:
            byte r0 = r5.readByte()
            r1 = r0 & 128(0x80, float:1.8E-43)
            r2 = 128(0x80, float:1.8E-43)
            if (r1 != r2) goto L1b
            io.netty.handler.codec.http.websocketx.WebSocketFrame r4 = r3.decodeBinaryFrame(r4, r0, r5)
            goto L1f
        L1b:
            io.netty.handler.codec.http.websocketx.WebSocketFrame r4 = r3.decodeTextFrame(r4, r5)
        L1f:
            if (r4 == 0) goto L24
            r6.add(r4)
        L24:
            return
    }
}
