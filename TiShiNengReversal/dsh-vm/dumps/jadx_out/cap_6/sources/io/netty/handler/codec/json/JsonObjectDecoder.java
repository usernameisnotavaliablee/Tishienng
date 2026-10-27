package io.netty.handler.codec.json;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class JsonObjectDecoder extends io.netty.handler.codec.ByteToMessageDecoder {
    private static final int ST_CORRUPTED = -1;
    private static final int ST_DECODING_ARRAY_STREAM = 2;
    private static final int ST_DECODING_NORMAL = 1;
    private static final int ST_INIT = 0;
    private int idx;
    private boolean insideString;
    private int lastReaderIndex;
    private final int maxObjectLength;
    private int openBraces;
    private int state;
    private final boolean streamArrayElements;

    public JsonObjectDecoder() {
            r1 = this;
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1.<init>(r0)
            return
    }

    public JsonObjectDecoder(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public JsonObjectDecoder(int r2, boolean r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            if (r2 < r0) goto Lb
            r1.maxObjectLength = r2
            r1.streamArrayElements = r3
            return
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "maxObjectLength must be a positive int"
            r2.<init>(r3)
            throw r2
    }

    public JsonObjectDecoder(boolean r2) {
            r1 = this;
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1.<init>(r0, r2)
            return
    }

    private void decodeByte(byte r4, io.netty.buffer.ByteBuf r5, int r6) {
            r3 = this;
            r0 = 123(0x7b, float:1.72E-43)
            r1 = 1
            if (r4 == r0) goto L9
            r0 = 91
            if (r4 != r0) goto L13
        L9:
            boolean r0 = r3.insideString
            if (r0 != 0) goto L13
            int r4 = r3.openBraces
            int r4 = r4 + r1
            r3.openBraces = r4
            return
        L13:
            r0 = 125(0x7d, float:1.75E-43)
            if (r4 == r0) goto L1b
            r0 = 93
            if (r4 != r0) goto L25
        L1b:
            boolean r0 = r3.insideString
            if (r0 != 0) goto L25
            int r4 = r3.openBraces
            int r4 = r4 - r1
            r3.openBraces = r4
            return
        L25:
            r0 = 34
            if (r4 != r0) goto L49
            boolean r4 = r3.insideString
            if (r4 != 0) goto L30
            r3.insideString = r1
            return
        L30:
            int r6 = r6 + (-1)
            r4 = 0
            r0 = 0
        L34:
            if (r6 < 0) goto L43
            byte r1 = r5.getByte(r6)
            r2 = 92
            if (r1 != r2) goto L43
            int r0 = r0 + 1
            int r6 = r6 + (-1)
            goto L34
        L43:
            int r0 = r0 % 2
            if (r0 != 0) goto L49
            r3.insideString = r4
        L49:
            return
    }

    private void initDecoding(byte r3) {
            r2 = this;
            r0 = 1
            r2.openBraces = r0
            r1 = 91
            if (r3 != r1) goto Lf
            boolean r3 = r2.streamArrayElements
            if (r3 == 0) goto Lf
            r3 = 2
            r2.state = r3
            return
        Lf:
            r2.state = r0
            return
    }

    private void reset() {
            r1 = this;
            r0 = 0
            r1.insideString = r0
            r1.state = r0
            r1.openBraces = r0
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r10, io.netty.buffer.ByteBuf r11, java.util.List<java.lang.Object> r12) throws java.lang.Exception {
            r9 = this;
            int r0 = r9.state
            r1 = -1
            if (r0 != r1) goto Ld
            int r10 = r11.readableBytes()
            r11.skipBytes(r10)
            return
        Ld:
            int r0 = r9.idx
            int r2 = r11.readerIndex()
            if (r0 <= r2) goto L29
            int r0 = r9.lastReaderIndex
            int r2 = r11.readerIndex()
            if (r0 == r2) goto L29
            int r0 = r11.readerIndex()
            int r2 = r9.idx
            int r3 = r9.lastReaderIndex
            int r2 = r2 - r3
            int r0 = r0 + r2
            r9.idx = r0
        L29:
            int r0 = r9.idx
            int r2 = r11.writerIndex()
            int r3 = r9.maxObjectLength
            java.lang.String r4 = ": "
            if (r2 > r3) goto L11b
        L35:
            if (r0 >= r2) goto L108
            byte r3 = r11.getByte(r0)
            int r5 = r9.state
            r6 = 1
            if (r5 != r6) goto L64
            r9.decodeByte(r3, r11, r0)
            int r3 = r9.openBraces
            if (r3 != 0) goto L104
            int r3 = r11.readerIndex()
            int r5 = r0 + 1
            int r6 = r11.readerIndex()
            int r6 = r5 - r6
            io.netty.buffer.ByteBuf r3 = r9.extractObject(r10, r11, r3, r6)
            if (r3 == 0) goto L5c
            r12.add(r3)
        L5c:
            r11.readerIndex(r5)
            r9.reset()
            goto L104
        L64:
            r7 = 2
            if (r5 != r7) goto Lc4
            r9.decodeByte(r3, r11, r0)
            boolean r5 = r9.insideString
            if (r5 != 0) goto L104
            int r5 = r9.openBraces
            r7 = 93
            if (r5 != r6) goto L78
            r8 = 44
            if (r3 == r8) goto L7c
        L78:
            if (r5 != 0) goto L104
            if (r3 != r7) goto L104
        L7c:
            int r5 = r11.readerIndex()
        L80:
            byte r8 = r11.getByte(r5)
            boolean r8 = java.lang.Character.isWhitespace(r8)
            if (r8 == 0) goto L90
            r11.skipBytes(r6)
            int r5 = r5 + 1
            goto L80
        L90:
            int r5 = r0 + (-1)
        L92:
            int r6 = r11.readerIndex()
            if (r5 < r6) goto La5
            byte r6 = r11.getByte(r5)
            boolean r6 = java.lang.Character.isWhitespace(r6)
            if (r6 == 0) goto La5
            int r5 = r5 + (-1)
            goto L92
        La5:
            int r6 = r11.readerIndex()
            int r5 = r5 + 1
            int r8 = r11.readerIndex()
            int r5 = r5 - r8
            io.netty.buffer.ByteBuf r5 = r9.extractObject(r10, r11, r6, r5)
            if (r5 == 0) goto Lb9
            r12.add(r5)
        Lb9:
            int r5 = r0 + 1
            r11.readerIndex(r5)
            if (r3 != r7) goto L104
            r9.reset()
            goto L104
        Lc4:
            r5 = 123(0x7b, float:1.72E-43)
            if (r3 == r5) goto Lfa
            r5 = 91
            if (r3 != r5) goto Lcd
            goto Lfa
        Lcd:
            boolean r3 = java.lang.Character.isWhitespace(r3)
            if (r3 == 0) goto Ld7
            r11.skipBytes(r6)
            goto L104
        Ld7:
            r9.state = r1
            io.netty.handler.codec.CorruptedFrameException r10 = new io.netty.handler.codec.CorruptedFrameException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "invalid JSON received at byte position "
            r12.append(r1)
            r12.append(r0)
            r12.append(r4)
            java.lang.String r11 = io.netty.buffer.ByteBufUtil.hexDump(r11)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        Lfa:
            r9.initDecoding(r3)
            int r3 = r9.state
            if (r3 != r7) goto L104
            r11.skipBytes(r6)
        L104:
            int r0 = r0 + 1
            goto L35
        L108:
            int r10 = r11.readableBytes()
            if (r10 != 0) goto L112
            r10 = 0
            r9.idx = r10
            goto L114
        L112:
            r9.idx = r0
        L114:
            int r10 = r11.readerIndex()
            r9.lastReaderIndex = r10
            return
        L11b:
            int r10 = r11.readableBytes()
            r11.skipBytes(r10)
            r9.reset()
            io.netty.handler.codec.TooLongFrameException r10 = new io.netty.handler.codec.TooLongFrameException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "object length exceeds "
            r11.append(r12)
            int r12 = r9.maxObjectLength
            r11.append(r12)
            r11.append(r4)
            r11.append(r2)
            java.lang.String r12 = " bytes discarded"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
    }

    protected io.netty.buffer.ByteBuf extractObject(io.netty.channel.ChannelHandlerContext r1, io.netty.buffer.ByteBuf r2, int r3, int r4) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r2.retainedSlice(r3, r4)
            return r1
    }
}
