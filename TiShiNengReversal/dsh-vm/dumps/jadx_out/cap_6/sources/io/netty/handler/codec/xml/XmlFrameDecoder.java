package io.netty.handler.codec.xml;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class XmlFrameDecoder extends io.netty.handler.codec.ByteToMessageDecoder {
    private final int maxFrameLength;

    public XmlFrameDecoder(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            if (r2 < r0) goto L9
            r1.maxFrameLength = r2
            return
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "maxFrameLength must be a positive int"
            r2.<init>(r0)
            throw r2
    }

    private static io.netty.buffer.ByteBuf extractFrame(io.netty.buffer.ByteBuf r0, int r1, int r2) {
            io.netty.buffer.ByteBuf r0 = r0.copy(r1, r2)
            return r0
    }

    private void fail(long r5) {
            r4 = this;
            r0 = 0
            java.lang.String r2 = "frame length exceeds "
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

    private static void fail(io.netty.channel.ChannelHandlerContext r2) {
            io.netty.handler.codec.CorruptedFrameException r0 = new io.netty.handler.codec.CorruptedFrameException
            java.lang.String r1 = "frame contains content before the xml starts"
            r0.<init>(r1)
            r2.fireExceptionCaught(r0)
            return
    }

    private static boolean isCDATABlockStart(io.netty.buffer.ByteBuf r4, int r5) {
            int r0 = r4.writerIndex()
            int r0 = r0 + (-8)
            if (r5 >= r0) goto L4c
            int r0 = r5 + 2
            byte r0 = r4.getByte(r0)
            r1 = 91
            if (r0 != r1) goto L4c
            int r0 = r5 + 3
            byte r0 = r4.getByte(r0)
            r2 = 67
            if (r0 != r2) goto L4c
            int r0 = r5 + 4
            byte r0 = r4.getByte(r0)
            r2 = 68
            if (r0 != r2) goto L4c
            int r0 = r5 + 5
            byte r0 = r4.getByte(r0)
            r2 = 65
            if (r0 != r2) goto L4c
            int r0 = r5 + 6
            byte r0 = r4.getByte(r0)
            r3 = 84
            if (r0 != r3) goto L4c
            int r0 = r5 + 7
            byte r0 = r4.getByte(r0)
            if (r0 != r2) goto L4c
            int r5 = r5 + 8
            byte r4 = r4.getByte(r5)
            if (r4 != r1) goto L4c
            r4 = 1
            return r4
        L4c:
            r4 = 0
            return r4
    }

    private static boolean isCommentBlockStart(io.netty.buffer.ByteBuf r2, int r3) {
            int r0 = r2.writerIndex()
            int r0 = r0 + (-3)
            if (r3 >= r0) goto L1c
            int r0 = r3 + 2
            byte r0 = r2.getByte(r0)
            r1 = 45
            if (r0 != r1) goto L1c
            int r3 = r3 + 3
            byte r2 = r2.getByte(r3)
            if (r2 != r1) goto L1c
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
    }

    private static boolean isValidStartCharForXmlElement(byte r1) {
            r0 = 97
            if (r1 < r0) goto L8
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 <= r0) goto L1b
        L8:
            r0 = 65
            if (r1 < r0) goto L10
            r0 = 90
            if (r1 <= r0) goto L1b
        L10:
            r0 = 58
            if (r1 == r0) goto L1b
            r0 = 95
            if (r1 != r0) goto L19
            goto L1b
        L19:
            r1 = 0
            return r1
        L1b:
            r1 = 1
            return r1
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r21, io.netty.buffer.ByteBuf r22, java.util.List<java.lang.Object> r23) throws java.lang.Exception {
            r20 = this;
            r0 = r20
            r1 = r22
            int r2 = r1.writerIndex()
            int r3 = r0.maxFrameLength
            if (r2 <= r3) goto L18
            int r3 = r1.readableBytes()
            r1.skipBytes(r3)
            long r1 = (long) r2
            r0.fail(r1)
            return
        L18:
            int r3 = r1.readerIndex()
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
        L23:
            if (r3 >= r2) goto Leb
            byte r14 = r1.getByte(r3)
            if (r7 != 0) goto L37
            boolean r15 = java.lang.Character.isWhitespace(r14)
            if (r15 == 0) goto L37
            int r8 = r8 + 1
            r16 = 0
            goto Le7
        L37:
            r15 = 60
            if (r7 != 0) goto L48
            if (r14 == r15) goto L48
            fail(r21)
            int r2 = r1.readableBytes()
            r1.skipBytes(r2)
            return
        L48:
            r4 = 63
            r16 = 0
            r5 = 47
            r6 = 62
            r18 = 1
            if (r9 != 0) goto L99
            if (r14 != r15) goto L99
            int r7 = r2 + (-1)
            r14 = 1
            if (r3 >= r7) goto L97
            int r15 = r3 + 1
            byte r15 = r1.getByte(r15)
            if (r15 != r5) goto L73
            int r4 = r3 + 2
        L65:
            if (r4 > r7) goto L97
            byte r5 = r1.getByte(r4)
            if (r5 != r6) goto L70
            long r10 = r10 - r18
            goto L97
        L70:
            int r4 = r4 + 1
            goto L65
        L73:
            boolean r5 = isValidStartCharForXmlElement(r15)
            if (r5 == 0) goto L7d
            long r10 = r10 + r18
            r13 = 1
            goto L97
        L7d:
            r5 = 33
            if (r15 != r5) goto L94
            boolean r4 = isCommentBlockStart(r1, r3)
            if (r4 == 0) goto L8a
        L87:
            long r10 = r10 + r18
            goto L97
        L8a:
            boolean r4 = isCDATABlockStart(r1, r3)
            if (r4 == 0) goto L97
            long r10 = r10 + r18
            r9 = 1
            goto L97
        L94:
            if (r15 != r4) goto L97
            goto L87
        L97:
            r7 = 1
            goto Le7
        L99:
            if (r9 != 0) goto Lac
            if (r14 != r5) goto Lac
            int r4 = r2 + (-1)
            if (r3 >= r4) goto Le7
            int r4 = r3 + 1
            byte r4 = r1.getByte(r4)
            if (r4 != r6) goto Le7
            long r10 = r10 - r18
            goto Le7
        Lac:
            if (r14 != r6) goto Le7
            int r12 = r3 + 1
            int r5 = r3 + (-1)
            r6 = -1
            if (r5 <= r6) goto Le0
            byte r5 = r1.getByte(r5)
            if (r9 != 0) goto Lcf
            if (r5 != r4) goto Lc0
        Lbd:
            long r10 = r10 - r18
            goto Le0
        Lc0:
            r4 = 45
            if (r5 != r4) goto Le0
            int r5 = r3 + (-2)
            if (r5 <= r6) goto Le0
            byte r5 = r1.getByte(r5)
            if (r5 != r4) goto Le0
            goto Lbd
        Lcf:
            r4 = 93
            if (r5 != r4) goto Le0
            int r5 = r3 + (-2)
            if (r5 <= r6) goto Le0
            byte r5 = r1.getByte(r5)
            if (r5 != r4) goto Le0
            long r10 = r10 - r18
            r9 = 0
        Le0:
            if (r13 == 0) goto Le7
            int r4 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r4 != 0) goto Le7
            goto Led
        Le7:
            int r3 = r3 + 1
            goto L23
        Leb:
            r16 = 0
        Led:
            int r3 = r1.readerIndex()
            int r12 = r12 - r3
            int r4 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r4 != 0) goto L10f
            if (r12 <= 0) goto L10f
            int r4 = r3 + r12
            if (r4 < r2) goto L100
            int r12 = r1.readableBytes()
        L100:
            int r3 = r3 + r8
            int r2 = r12 - r8
            io.netty.buffer.ByteBuf r2 = extractFrame(r1, r3, r2)
            r1.skipBytes(r12)
            r1 = r23
            r1.add(r2)
        L10f:
            return
    }
}
