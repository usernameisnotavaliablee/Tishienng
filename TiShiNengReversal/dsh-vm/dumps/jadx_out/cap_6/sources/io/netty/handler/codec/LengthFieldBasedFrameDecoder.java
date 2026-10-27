package io.netty.handler.codec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class LengthFieldBasedFrameDecoder extends io.netty.handler.codec.ByteToMessageDecoder {
    private final java.nio.ByteOrder byteOrder;
    private long bytesToDiscard;
    private boolean discardingTooLongFrame;
    private final boolean failFast;
    private final int initialBytesToStrip;
    private final int lengthAdjustment;
    private final int lengthFieldEndOffset;
    private final int lengthFieldLength;
    private final int lengthFieldOffset;
    private final int maxFrameLength;
    private long tooLongFrameLength;

    public LengthFieldBasedFrameDecoder(int r7, int r8, int r9) {
            r6 = this;
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public LengthFieldBasedFrameDecoder(int r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            r6 = 1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public LengthFieldBasedFrameDecoder(int r9, int r10, int r11, int r12, int r13, boolean r14) {
            r8 = this;
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r0 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public LengthFieldBasedFrameDecoder(java.nio.ByteOrder r2, int r3, int r4, int r5, int r6, int r7, boolean r8) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L56
            java.lang.String r0 = "maxFrameLength"
            io.netty.util.internal.ObjectUtil.checkPositive(r3, r0)
            java.lang.String r0 = "lengthFieldOffset"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r4, r0)
            java.lang.String r0 = "initialBytesToStrip"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r7, r0)
            int r0 = r3 - r5
            if (r4 > r0) goto L2a
            r1.byteOrder = r2
            r1.maxFrameLength = r3
            r1.lengthFieldOffset = r4
            r1.lengthFieldLength = r5
            r1.lengthAdjustment = r6
            int r4 = r4 + r5
            r1.lengthFieldEndOffset = r4
            r1.initialBytesToStrip = r7
            r1.failFast = r8
            return
        L2a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "maxFrameLength ("
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = ") must be equal to or greater than lengthFieldOffset ("
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = ") + lengthFieldLength ("
            r6.append(r3)
            r6.append(r5)
            java.lang.String r3 = ")."
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r2.<init>(r3)
            throw r2
        L56:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "byteOrder"
            r2.<init>(r3)
            throw r2
    }

    private void discardingTooLongFrame(io.netty.buffer.ByteBuf r5) {
            r4 = this;
            long r0 = r4.bytesToDiscard
            int r2 = r5.readableBytes()
            long r2 = (long) r2
            long r2 = java.lang.Math.min(r0, r2)
            int r3 = (int) r2
            r5.skipBytes(r3)
            long r2 = (long) r3
            long r0 = r0 - r2
            r4.bytesToDiscard = r0
            r5 = 0
            r4.failIfNecessary(r5)
            return
    }

    private void exceededFrameLength(io.netty.buffer.ByteBuf r7, long r8) {
            r6 = this;
            int r0 = r7.readableBytes()
            long r0 = (long) r0
            long r0 = r8 - r0
            r6.tooLongFrameLength = r8
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L15
            int r9 = (int) r8
            r7.skipBytes(r9)
            goto L20
        L15:
            r6.discardingTooLongFrame = r4
            r6.bytesToDiscard = r0
            int r8 = r7.readableBytes()
            r7.skipBytes(r8)
        L20:
            r6.failIfNecessary(r4)
            return
    }

    private void fail(long r5) {
            r4 = this;
            r0 = 0
            java.lang.String r2 = "Adjusted frame length exceeds "
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 <= 0) goto L2c
            io.netty.handler.codec.TooLongFrameException r0 = new io.netty.handler.codec.TooLongFrameException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            int r2 = r4.maxFrameLength
            r1.append(r2)
            java.lang.String r2 = ": "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " - discarded"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L2c:
            io.netty.handler.codec.TooLongFrameException r5 = new io.netty.handler.codec.TooLongFrameException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            int r0 = r4.maxFrameLength
            r6.append(r0)
            java.lang.String r0 = " - discarding"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    private void failIfNecessary(boolean r6) {
            r5 = this;
            long r0 = r5.bytesToDiscard
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L19
            long r0 = r5.tooLongFrameLength
            r5.tooLongFrameLength = r2
            r2 = 0
            r5.discardingTooLongFrame = r2
            boolean r2 = r5.failFast
            if (r2 == 0) goto L15
            if (r6 == 0) goto L24
        L15:
            r5.fail(r0)
            return
        L19:
            boolean r0 = r5.failFast
            if (r0 == 0) goto L24
            if (r6 == 0) goto L24
            long r0 = r5.tooLongFrameLength
            r5.fail(r0)
        L24:
            return
    }

    private static void failOnFrameLengthLessThanInitialBytesToStrip(io.netty.buffer.ByteBuf r2, long r3, int r5) {
            int r0 = (int) r3
            r2.skipBytes(r0)
            io.netty.handler.codec.CorruptedFrameException r2 = new io.netty.handler.codec.CorruptedFrameException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Adjusted frame length ("
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ") is less than initialBytesToStrip: "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    private static void failOnFrameLengthLessThanLengthFieldEndOffset(io.netty.buffer.ByteBuf r2, long r3, int r5) {
            r2.skipBytes(r5)
            io.netty.handler.codec.CorruptedFrameException r2 = new io.netty.handler.codec.CorruptedFrameException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Adjusted frame length ("
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ") is less than lengthFieldEndOffset: "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    private static void failOnNegativeLengthField(io.netty.buffer.ByteBuf r1, long r2, int r4) {
            r1.skipBytes(r4)
            io.netty.handler.codec.CorruptedFrameException r1 = new io.netty.handler.codec.CorruptedFrameException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "negative pre-adjustment length field: "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2)
            throw r1
    }

    protected java.lang.Object decode(io.netty.channel.ChannelHandlerContext r8, io.netty.buffer.ByteBuf r9) throws java.lang.Exception {
            r7 = this;
            boolean r0 = r7.discardingTooLongFrame
            if (r0 == 0) goto L7
            r7.discardingTooLongFrame(r9)
        L7:
            int r0 = r9.readableBytes()
            int r1 = r7.lengthFieldEndOffset
            r2 = 0
            if (r0 >= r1) goto L11
            return r2
        L11:
            int r0 = r9.readerIndex()
            int r1 = r7.lengthFieldOffset
            int r0 = r0 + r1
            int r1 = r7.lengthFieldLength
            java.nio.ByteOrder r3 = r7.byteOrder
            long r0 = r7.getUnadjustedFrameLength(r9, r0, r1, r3)
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto L2b
            int r3 = r7.lengthFieldEndOffset
            failOnNegativeLengthField(r9, r0, r3)
        L2b:
            int r3 = r7.lengthAdjustment
            int r4 = r7.lengthFieldEndOffset
            int r3 = r3 + r4
            long r5 = (long) r3
            long r0 = r0 + r5
            long r5 = (long) r4
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 >= 0) goto L3a
            failOnFrameLengthLessThanLengthFieldEndOffset(r9, r0, r4)
        L3a:
            int r3 = r7.maxFrameLength
            long r3 = (long) r3
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L45
            r7.exceededFrameLength(r9, r0)
            return r2
        L45:
            int r3 = (int) r0
            int r4 = r9.readableBytes()
            if (r4 >= r3) goto L4d
            return r2
        L4d:
            int r2 = r7.initialBytesToStrip
            if (r2 <= r3) goto L54
            failOnFrameLengthLessThanInitialBytesToStrip(r9, r0, r2)
        L54:
            int r0 = r7.initialBytesToStrip
            r9.skipBytes(r0)
            int r0 = r9.readerIndex()
            int r1 = r7.initialBytesToStrip
            int r3 = r3 - r1
            io.netty.buffer.ByteBuf r8 = r7.extractFrame(r8, r9, r0, r3)
            int r0 = r0 + r3
            r9.readerIndex(r0)
            return r8
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected final void decode(io.netty.channel.ChannelHandlerContext r1, io.netty.buffer.ByteBuf r2, java.util.List<java.lang.Object> r3) throws java.lang.Exception {
            r0 = this;
            java.lang.Object r1 = r0.decode(r1, r2)
            if (r1 == 0) goto L9
            r3.add(r1)
        L9:
            return
    }

    protected io.netty.buffer.ByteBuf extractFrame(io.netty.channel.ChannelHandlerContext r1, io.netty.buffer.ByteBuf r2, int r3, int r4) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r2.retainedSlice(r3, r4)
            return r1
    }

    protected long getUnadjustedFrameLength(io.netty.buffer.ByteBuf r1, int r2, int r3, java.nio.ByteOrder r4) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r1.order(r4)
            r4 = 1
            if (r3 == r4) goto L47
            r4 = 2
            if (r3 == r4) goto L42
            r4 = 3
            if (r3 == r4) goto L3c
            r4 = 4
            if (r3 == r4) goto L37
            r4 = 8
            if (r3 != r4) goto L19
            long r1 = r1.getLong(r2)
            return r1
        L19:
            io.netty.handler.codec.DecoderException r1 = new io.netty.handler.codec.DecoderException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "unsupported lengthFieldLength: "
            r2.append(r3)
            int r3 = r0.lengthFieldLength
            r2.append(r3)
            java.lang.String r3 = " (expected: 1, 2, 3, 4, or 8)"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L37:
            long r1 = r1.getUnsignedInt(r2)
            return r1
        L3c:
            int r1 = r1.getUnsignedMedium(r2)
        L40:
            long r1 = (long) r1
            return r1
        L42:
            int r1 = r1.getUnsignedShort(r2)
            goto L40
        L47:
            short r1 = r1.getUnsignedByte(r2)
            goto L40
    }
}
