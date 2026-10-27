package io.netty.handler.codec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DelimiterBasedFrameDecoder extends io.netty.handler.codec.ByteToMessageDecoder {
    private final io.netty.buffer.ByteBuf[] delimiters;
    private boolean discardingTooLongFrame;
    private final boolean failFast;
    private final io.netty.handler.codec.LineBasedFrameDecoder lineBasedDecoder;
    private final int maxFrameLength;
    private final boolean stripDelimiter;
    private int tooLongFrameLength;

    public DelimiterBasedFrameDecoder(int r2, io.netty.buffer.ByteBuf r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0, r3)
            return
    }

    public DelimiterBasedFrameDecoder(int r2, boolean r3, io.netty.buffer.ByteBuf r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0, r4)
            return
    }

    public DelimiterBasedFrameDecoder(int r3, boolean r4, boolean r5, io.netty.buffer.ByteBuf r6) {
            r2 = this;
            int r0 = r6.readerIndex()
            int r1 = r6.readableBytes()
            io.netty.buffer.ByteBuf r6 = r6.slice(r0, r1)
            r0 = 1
            io.netty.buffer.ByteBuf[] r0 = new io.netty.buffer.ByteBuf[r0]
            r1 = 0
            r0[r1] = r6
            r2.<init>(r3, r4, r5, r0)
            return
    }

    public DelimiterBasedFrameDecoder(int r7, boolean r8, boolean r9, io.netty.buffer.ByteBuf... r10) {
            r6 = this;
            r6.<init>()
            validateMaxFrameLength(r7)
            if (r10 == 0) goto L54
            int r0 = r10.length
            if (r0 == 0) goto L4c
            boolean r0 = isLineBased(r10)
            r1 = 0
            if (r0 == 0) goto L22
            boolean r0 = r6.isSubclass()
            if (r0 != 0) goto L22
            io.netty.handler.codec.LineBasedFrameDecoder r10 = new io.netty.handler.codec.LineBasedFrameDecoder
            r10.<init>(r7, r8, r9)
            r6.lineBasedDecoder = r10
            r6.delimiters = r1
            goto L45
        L22:
            int r0 = r10.length
            io.netty.buffer.ByteBuf[] r0 = new io.netty.buffer.ByteBuf[r0]
            r6.delimiters = r0
            r0 = 0
        L28:
            int r2 = r10.length
            if (r0 >= r2) goto L43
            r2 = r10[r0]
            validateDelimiter(r2)
            io.netty.buffer.ByteBuf[] r3 = r6.delimiters
            int r4 = r2.readerIndex()
            int r5 = r2.readableBytes()
            io.netty.buffer.ByteBuf r2 = r2.slice(r4, r5)
            r3[r0] = r2
            int r0 = r0 + 1
            goto L28
        L43:
            r6.lineBasedDecoder = r1
        L45:
            r6.maxFrameLength = r7
            r6.stripDelimiter = r8
            r6.failFast = r9
            return
        L4c:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "empty delimiters"
            r7.<init>(r8)
            throw r7
        L54:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "delimiters"
            r7.<init>(r8)
            throw r7
    }

    public DelimiterBasedFrameDecoder(int r2, boolean r3, io.netty.buffer.ByteBuf... r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0, r4)
            return
    }

    public DelimiterBasedFrameDecoder(int r2, io.netty.buffer.ByteBuf... r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0, r3)
            return
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

    private static int indexOf(io.netty.buffer.ByteBuf r6, io.netty.buffer.ByteBuf r7) {
            int r0 = r6.readerIndex()
        L4:
            int r1 = r6.writerIndex()
            r2 = -1
            if (r0 >= r1) goto L41
            r1 = 0
            r3 = r0
        Ld:
            int r4 = r7.capacity()
            if (r1 >= r4) goto L32
            byte r4 = r6.getByte(r3)
            byte r5 = r7.getByte(r1)
            if (r4 == r5) goto L1e
            goto L32
        L1e:
            int r3 = r3 + 1
            int r4 = r6.writerIndex()
            if (r3 != r4) goto L2f
            int r4 = r7.capacity()
            int r4 = r4 + (-1)
            if (r1 == r4) goto L2f
            return r2
        L2f:
            int r1 = r1 + 1
            goto Ld
        L32:
            int r2 = r7.capacity()
            if (r1 != r2) goto L3e
            int r6 = r6.readerIndex()
            int r0 = r0 - r6
            return r0
        L3e:
            int r0 = r0 + 1
            goto L4
        L41:
            return r2
    }

    private static boolean isLineBased(io.netty.buffer.ByteBuf[] r7) {
            int r0 = r7.length
            r1 = 0
            r2 = 2
            if (r0 == r2) goto L6
            return r1
        L6:
            r0 = r7[r1]
            r3 = 1
            r4 = r7[r3]
            int r5 = r0.capacity()
            int r6 = r4.capacity()
            if (r5 >= r6) goto L19
            r0 = r7[r3]
            r4 = r7[r1]
        L19:
            int r7 = r0.capacity()
            if (r7 != r2) goto L3c
            int r7 = r4.capacity()
            if (r7 != r3) goto L3c
            byte r7 = r0.getByte(r1)
            r2 = 13
            if (r7 != r2) goto L3c
            byte r7 = r0.getByte(r3)
            r0 = 10
            if (r7 != r0) goto L3c
            byte r7 = r4.getByte(r1)
            if (r7 != r0) goto L3c
            return r3
        L3c:
            return r1
    }

    private boolean isSubclass() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            java.lang.Class<io.netty.handler.codec.DelimiterBasedFrameDecoder> r1 = io.netty.handler.codec.DelimiterBasedFrameDecoder.class
            if (r0 == r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    private static void validateDelimiter(io.netty.buffer.ByteBuf r1) {
            if (r1 == 0) goto L11
            boolean r1 = r1.isReadable()
            if (r1 == 0) goto L9
            return
        L9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "empty delimiter"
            r1.<init>(r0)
            throw r1
        L11:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "delimiter"
            r1.<init>(r0)
            throw r1
    }

    private static void validateMaxFrameLength(int r1) {
            java.lang.String r0 = "maxFrameLength"
            io.netty.util.internal.ObjectUtil.checkPositive(r1, r0)
            return
    }

    protected java.lang.Object decode(io.netty.channel.ChannelHandlerContext r9, io.netty.buffer.ByteBuf r10) throws java.lang.Exception {
            r8 = this;
            io.netty.handler.codec.LineBasedFrameDecoder r0 = r8.lineBasedDecoder
            if (r0 == 0) goto L9
            java.lang.Object r9 = r0.decode(r9, r10)
            return r9
        L9:
            io.netty.buffer.ByteBuf[] r9 = r8.delimiters
            int r0 = r9.length
            r1 = 0
            r2 = 0
            r3 = 2147483647(0x7fffffff, float:NaN)
            r5 = r2
            r4 = 0
        L13:
            if (r4 >= r0) goto L24
            r6 = r9[r4]
            int r7 = indexOf(r10, r6)
            if (r7 < 0) goto L21
            if (r7 >= r3) goto L21
            r5 = r6
            r3 = r7
        L21:
            int r4 = r4 + 1
            goto L13
        L24:
            if (r5 == 0) goto L60
            int r9 = r5.capacity()
            boolean r0 = r8.discardingTooLongFrame
            if (r0 == 0) goto L41
            r8.discardingTooLongFrame = r1
            int r3 = r3 + r9
            r10.skipBytes(r3)
            int r9 = r8.tooLongFrameLength
            r8.tooLongFrameLength = r1
            boolean r10 = r8.failFast
            if (r10 != 0) goto L40
            long r9 = (long) r9
            r8.fail(r9)
        L40:
            return r2
        L41:
            int r0 = r8.maxFrameLength
            if (r3 <= r0) goto L4e
            int r9 = r9 + r3
            r10.skipBytes(r9)
            long r9 = (long) r3
            r8.fail(r9)
            return r2
        L4e:
            boolean r0 = r8.stripDelimiter
            if (r0 == 0) goto L5a
            io.netty.buffer.ByteBuf r0 = r10.readRetainedSlice(r3)
            r10.skipBytes(r9)
            return r0
        L5a:
            int r3 = r3 + r9
            io.netty.buffer.ByteBuf r9 = r10.readRetainedSlice(r3)
            return r9
        L60:
            boolean r9 = r8.discardingTooLongFrame
            if (r9 != 0) goto L87
            int r9 = r10.readableBytes()
            int r0 = r8.maxFrameLength
            if (r9 <= r0) goto L97
            int r9 = r10.readableBytes()
            r8.tooLongFrameLength = r9
            int r9 = r10.readableBytes()
            r10.skipBytes(r9)
            r9 = 1
            r8.discardingTooLongFrame = r9
            boolean r9 = r8.failFast
            if (r9 == 0) goto L97
            int r9 = r8.tooLongFrameLength
            long r9 = (long) r9
            r8.fail(r9)
            goto L97
        L87:
            int r9 = r8.tooLongFrameLength
            int r0 = r10.readableBytes()
            int r9 = r9 + r0
            r8.tooLongFrameLength = r9
            int r9 = r10.readableBytes()
            r10.skipBytes(r9)
        L97:
            return r2
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
}
