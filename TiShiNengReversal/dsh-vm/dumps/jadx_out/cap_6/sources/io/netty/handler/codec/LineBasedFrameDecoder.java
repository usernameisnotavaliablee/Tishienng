package io.netty.handler.codec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class LineBasedFrameDecoder extends io.netty.handler.codec.ByteToMessageDecoder {
    private int discardedBytes;
    private boolean discarding;
    private final boolean failFast;
    private final int maxLength;
    private int offset;
    private final boolean stripDelimiter;

    public LineBasedFrameDecoder(int r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public LineBasedFrameDecoder(int r1, boolean r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.maxLength = r1
            r0.failFast = r3
            r0.stripDelimiter = r2
            return
    }

    private void fail(io.netty.channel.ChannelHandlerContext r1, int r2) {
            r0 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.fail(r1, r2)
            return
    }

    private void fail(io.netty.channel.ChannelHandlerContext r4, java.lang.String r5) {
            r3 = this;
            io.netty.handler.codec.TooLongFrameException r0 = new io.netty.handler.codec.TooLongFrameException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "frame length ("
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = ") exceeds the allowed maximum ("
            r1.append(r5)
            int r5 = r3.maxLength
            r1.append(r5)
            r5 = 41
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            r4.fireExceptionCaught(r0)
            return
    }

    private int findEndOfLine(io.netty.buffer.ByteBuf r5) {
            r4 = this;
            int r0 = r5.readableBytes()
            int r1 = r5.readerIndex()
            int r2 = r4.offset
            int r1 = r1 + r2
            int r2 = r0 - r2
            io.netty.util.ByteProcessor r3 = io.netty.util.ByteProcessor.FIND_LF
            int r1 = r5.forEachByte(r1, r2, r3)
            if (r1 < 0) goto L27
            r0 = 0
            r4.offset = r0
            if (r1 <= 0) goto L26
            int r0 = r1 + (-1)
            byte r5 = r5.getByte(r0)
            r0 = 13
            if (r5 != r0) goto L26
            int r1 = r1 + (-1)
        L26:
            return r1
        L27:
            r4.offset = r0
            return r1
    }

    protected java.lang.Object decode(io.netty.channel.ChannelHandlerContext r9, io.netty.buffer.ByteBuf r10) throws java.lang.Exception {
            r8 = this;
            int r0 = r8.findEndOfLine(r10)
            boolean r1 = r8.discarding
            r2 = 2
            r3 = 13
            r4 = 0
            r5 = 1
            r6 = 0
            if (r1 != 0) goto L6c
            if (r0 < 0) goto L3c
            int r1 = r10.readerIndex()
            int r1 = r0 - r1
            byte r6 = r10.getByte(r0)
            if (r6 != r3) goto L1d
            goto L1e
        L1d:
            r2 = 1
        L1e:
            int r3 = r8.maxLength
            if (r1 <= r3) goto L2a
            int r0 = r0 + r2
            r10.readerIndex(r0)
            r8.fail(r9, r1)
            return r4
        L2a:
            boolean r9 = r8.stripDelimiter
            if (r9 == 0) goto L36
            io.netty.buffer.ByteBuf r9 = r10.readRetainedSlice(r1)
            r10.skipBytes(r2)
            return r9
        L36:
            int r1 = r1 + r2
            io.netty.buffer.ByteBuf r9 = r10.readRetainedSlice(r1)
            return r9
        L3c:
            int r0 = r10.readableBytes()
            int r1 = r8.maxLength
            if (r0 <= r1) goto L6b
            r8.discardedBytes = r0
            int r0 = r10.writerIndex()
            r10.readerIndex(r0)
            r8.discarding = r5
            r8.offset = r6
            boolean r10 = r8.failFast
            if (r10 == 0) goto L6b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "over "
            r10.append(r0)
            int r0 = r8.discardedBytes
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r8.fail(r9, r10)
        L6b:
            return r4
        L6c:
            if (r0 < 0) goto L8e
            int r1 = r8.discardedBytes
            int r1 = r1 + r0
            int r7 = r10.readerIndex()
            int r1 = r1 - r7
            byte r7 = r10.getByte(r0)
            if (r7 != r3) goto L7d
            goto L7e
        L7d:
            r2 = 1
        L7e:
            int r0 = r0 + r2
            r10.readerIndex(r0)
            r8.discardedBytes = r6
            r8.discarding = r6
            boolean r10 = r8.failFast
            if (r10 != 0) goto La0
            r8.fail(r9, r1)
            goto La0
        L8e:
            int r9 = r8.discardedBytes
            int r0 = r10.readableBytes()
            int r9 = r9 + r0
            r8.discardedBytes = r9
            int r9 = r10.writerIndex()
            r10.readerIndex(r9)
            r8.offset = r6
        La0:
            return r4
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
