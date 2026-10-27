package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class WebSocket08FrameEncoder extends io.netty.handler.codec.MessageToMessageEncoder<io.netty.handler.codec.http.websocketx.WebSocketFrame> implements io.netty.handler.codec.http.websocketx.WebSocketFrameEncoder {
    private static final int GATHERING_WRITE_THRESHOLD = 1024;
    private static final byte OPCODE_BINARY = 2;
    private static final byte OPCODE_CLOSE = 8;
    private static final byte OPCODE_CONT = 0;
    private static final byte OPCODE_PING = 9;
    private static final byte OPCODE_PONG = 10;
    private static final byte OPCODE_TEXT = 1;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final boolean maskPayload;

    static {
            java.lang.Class<io.netty.handler.codec.http.websocketx.WebSocket08FrameEncoder> r0 = io.netty.handler.codec.http.websocketx.WebSocket08FrameEncoder.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.codec.http.websocketx.WebSocket08FrameEncoder.logger = r0
            return
    }

    public WebSocket08FrameEncoder(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.maskPayload = r1
            return
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r18, io.netty.handler.codec.http.websocketx.WebSocketFrame r19, java.util.List<java.lang.Object> r20) throws java.lang.Exception {
            r17 = this;
            r1 = r17
            r0 = r19
            r2 = r20
            io.netty.buffer.ByteBuf r3 = r0.content()
            boolean r4 = r0 instanceof io.netty.handler.codec.http.websocketx.TextWebSocketFrame
            r6 = 9
            r7 = 2
            r8 = 8
            r9 = 1
            r10 = 0
            if (r4 == 0) goto L17
            r4 = 1
            goto L37
        L17:
            boolean r4 = r0 instanceof io.netty.handler.codec.http.websocketx.PingWebSocketFrame
            if (r4 == 0) goto L1e
            r4 = 9
            goto L37
        L1e:
            boolean r4 = r0 instanceof io.netty.handler.codec.http.websocketx.PongWebSocketFrame
            if (r4 == 0) goto L25
            r4 = 10
            goto L37
        L25:
            boolean r4 = r0 instanceof io.netty.handler.codec.http.websocketx.CloseWebSocketFrame
            if (r4 == 0) goto L2c
            r4 = 8
            goto L37
        L2c:
            boolean r4 = r0 instanceof io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame
            if (r4 == 0) goto L32
            r4 = 2
            goto L37
        L32:
            boolean r4 = r0 instanceof io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame
            if (r4 == 0) goto L1ae
            r4 = 0
        L37:
            int r11 = r3.readableBytes()
            io.netty.util.internal.logging.InternalLogger r12 = io.netty.handler.codec.http.websocketx.WebSocket08FrameEncoder.logger
            boolean r13 = r12.isDebugEnabled()
            if (r13 == 0) goto L5f
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Encoding WebSocket Frame opCode="
            r13.append(r14)
            r13.append(r4)
            java.lang.String r14 = " length="
            r13.append(r14)
            r13.append(r11)
            java.lang.String r13 = r13.toString()
            r12.debug(r13)
        L5f:
            boolean r12 = r0.isFinalFragment()
            r13 = 128(0x80, float:1.8E-43)
            if (r12 == 0) goto L6a
            r12 = 128(0x80, float:1.8E-43)
            goto L6b
        L6a:
            r12 = 0
        L6b:
            int r0 = r0.rsv()
            int r0 = r0 % r8
            r14 = 4
            int r0 = r0 << r14
            r0 = r0 | r12
            int r12 = r4 % 128
            r0 = r0 | r12
            r12 = 125(0x7d, float:1.75E-43)
            if (r4 != r6) goto L94
            if (r11 > r12) goto L7d
            goto L94
        L7d:
            io.netty.handler.codec.TooLongFrameException r0 = new io.netty.handler.codec.TooLongFrameException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "invalid payload for PING (payload length must be <= 125, was "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L94:
            boolean r6 = r1.maskPayload     // Catch: java.lang.Throwable -> Lc4
            if (r6 == 0) goto L9a
            r15 = 4
            goto L9b
        L9a:
            r15 = 0
        L9b:
            r4 = 1024(0x400, float:1.435E-42)
            r16 = 10
            r5 = 255(0xff, float:3.57E-43)
            if (r11 > r12) goto Lc8
            int r15 = r15 + r7
            if (r6 != 0) goto La8
            if (r11 > r4) goto La9
        La8:
            int r15 = r15 + r11
        La9:
            io.netty.buffer.ByteBufAllocator r4 = r18.alloc()     // Catch: java.lang.Throwable -> Lc4
            io.netty.buffer.ByteBuf r4 = r4.buffer(r15)     // Catch: java.lang.Throwable -> Lc4
            r4.writeByte(r0)     // Catch: java.lang.Throwable -> Lc1
            boolean r0 = r1.maskPayload     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto Lbb
            byte r0 = (byte) r11     // Catch: java.lang.Throwable -> Lc1
            r0 = r0 | r13
            goto Lbc
        Lbb:
            byte r0 = (byte) r11     // Catch: java.lang.Throwable -> Lc1
        Lbc:
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> Lc1
            r4.writeByte(r0)     // Catch: java.lang.Throwable -> Lc1
            goto L118
        Lc1:
            r0 = move-exception
            goto L1a8
        Lc4:
            r0 = move-exception
            r4 = 0
            goto L1a8
        Lc8:
            r12 = 65535(0xffff, float:9.1834E-41)
            if (r11 > r12) goto Lf6
            int r15 = r15 + r14
            if (r6 != 0) goto Ld2
            if (r11 > r4) goto Ld3
        Ld2:
            int r15 = r15 + r11
        Ld3:
            io.netty.buffer.ByteBufAllocator r4 = r18.alloc()     // Catch: java.lang.Throwable -> Lc4
            io.netty.buffer.ByteBuf r4 = r4.buffer(r15)     // Catch: java.lang.Throwable -> Lc4
            r4.writeByte(r0)     // Catch: java.lang.Throwable -> Lc1
            boolean r0 = r1.maskPayload     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto Le5
            r0 = 254(0xfe, float:3.56E-43)
            goto Le7
        Le5:
            r0 = 126(0x7e, float:1.77E-43)
        Le7:
            r4.writeByte(r0)     // Catch: java.lang.Throwable -> Lc1
            int r0 = r11 >>> 8
            r0 = r0 & r5
            r4.writeByte(r0)     // Catch: java.lang.Throwable -> Lc1
            r0 = r11 & 255(0xff, float:3.57E-43)
            r4.writeByte(r0)     // Catch: java.lang.Throwable -> Lc1
            goto L118
        Lf6:
            int r15 = r15 + 10
            if (r6 != 0) goto Lfc
            if (r11 > r4) goto Lfd
        Lfc:
            int r15 = r15 + r11
        Lfd:
            io.netty.buffer.ByteBufAllocator r4 = r18.alloc()     // Catch: java.lang.Throwable -> Lc4
            io.netty.buffer.ByteBuf r4 = r4.buffer(r15)     // Catch: java.lang.Throwable -> Lc4
            r4.writeByte(r0)     // Catch: java.lang.Throwable -> Lc1
            boolean r0 = r1.maskPayload     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto L10f
            r0 = 255(0xff, float:3.57E-43)
            goto L111
        L10f:
            r0 = 127(0x7f, float:1.78E-43)
        L111:
            r4.writeByte(r0)     // Catch: java.lang.Throwable -> Lc1
            long r11 = (long) r11     // Catch: java.lang.Throwable -> Lc1
            r4.writeLong(r11)     // Catch: java.lang.Throwable -> Lc1
        L118:
            boolean r0 = r1.maskPayload     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto L18c
            double r11 = java.lang.Math.random()     // Catch: java.lang.Throwable -> Lc1
            r15 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            double r11 = r11 * r15
            int r0 = (int) r11     // Catch: java.lang.Throwable -> Lc1
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r14)     // Catch: java.lang.Throwable -> Lc1
            java.nio.ByteBuffer r0 = r6.putInt(r0)     // Catch: java.lang.Throwable -> Lc1
            byte[] r0 = r0.array()     // Catch: java.lang.Throwable -> Lc1
            r4.writeBytes(r0)     // Catch: java.lang.Throwable -> Lc1
            java.nio.ByteOrder r6 = r3.order()     // Catch: java.lang.Throwable -> Lc1
            java.nio.ByteOrder r11 = r4.order()     // Catch: java.lang.Throwable -> Lc1
            int r12 = r3.readerIndex()     // Catch: java.lang.Throwable -> Lc1
            int r13 = r3.writerIndex()     // Catch: java.lang.Throwable -> Lc1
            if (r6 != r11) goto L175
            r11 = r0[r10]     // Catch: java.lang.Throwable -> Lc1
            r11 = r11 & r5
            int r11 = r11 << 24
            r9 = r0[r9]     // Catch: java.lang.Throwable -> Lc1
            r9 = r9 & r5
            int r9 = r9 << 16
            r9 = r9 | r11
            r7 = r0[r7]     // Catch: java.lang.Throwable -> Lc1
            r7 = r7 & r5
            int r7 = r7 << r8
            r7 = r7 | r9
            r8 = 3
            r8 = r0[r8]     // Catch: java.lang.Throwable -> Lc1
            r5 = r5 & r8
            r5 = r5 | r7
            java.nio.ByteOrder r7 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> Lc1
            if (r6 != r7) goto L166
            int r5 = java.lang.Integer.reverseBytes(r5)     // Catch: java.lang.Throwable -> Lc1
        L166:
            int r6 = r12 + 3
            if (r6 >= r13) goto L175
            int r6 = r3.getInt(r12)     // Catch: java.lang.Throwable -> Lc1
            r6 = r6 ^ r5
            r4.writeInt(r6)     // Catch: java.lang.Throwable -> Lc1
            int r12 = r12 + 4
            goto L166
        L175:
            if (r12 >= r13) goto L188
            byte r5 = r3.getByte(r12)     // Catch: java.lang.Throwable -> Lc1
            int r6 = r10 + 1
            int r10 = r10 % r14
            r7 = r0[r10]     // Catch: java.lang.Throwable -> Lc1
            r5 = r5 ^ r7
            r4.writeByte(r5)     // Catch: java.lang.Throwable -> Lc1
            int r12 = r12 + 1
            r10 = r6
            goto L175
        L188:
            r2.add(r4)     // Catch: java.lang.Throwable -> Lc1
            goto L1a7
        L18c:
            int r0 = r4.writableBytes()     // Catch: java.lang.Throwable -> Lc1
            int r5 = r3.readableBytes()     // Catch: java.lang.Throwable -> Lc1
            if (r0 < r5) goto L19d
            r4.writeBytes(r3)     // Catch: java.lang.Throwable -> Lc1
            r2.add(r4)     // Catch: java.lang.Throwable -> Lc1
            goto L1a7
        L19d:
            r2.add(r4)     // Catch: java.lang.Throwable -> Lc1
            io.netty.buffer.ByteBuf r0 = r3.retain()     // Catch: java.lang.Throwable -> Lc1
            r2.add(r0)     // Catch: java.lang.Throwable -> Lc1
        L1a7:
            return
        L1a8:
            if (r4 == 0) goto L1ad
            r4.release()
        L1ad:
            throw r0
        L1ae:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot encode frame of type: "
            r3.append(r4)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.handler.codec.MessageToMessageEncoder
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http.websocketx.WebSocketFrame r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.websocketx.WebSocketFrame r2 = (io.netty.handler.codec.http.websocketx.WebSocketFrame) r2
            r0.encode2(r1, r2, r3)
            return
    }
}
