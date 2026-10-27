package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class SpdyHeaderBlockZlibDecoder extends io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder {
    private static final int DEFAULT_BUFFER_CAPACITY = 4096;
    private static final io.netty.handler.codec.spdy.SpdyProtocolException INVALID_HEADER_BLOCK = null;
    private io.netty.buffer.ByteBuf decompressed;
    private final java.util.zip.Inflater decompressor;

    static {
            io.netty.handler.codec.spdy.SpdyProtocolException r0 = new io.netty.handler.codec.spdy.SpdyProtocolException
            java.lang.String r1 = "Invalid Header Block"
            r0.<init>(r1)
            io.netty.handler.codec.spdy.SpdyHeaderBlockZlibDecoder.INVALID_HEADER_BLOCK = r0
            return
    }

    SpdyHeaderBlockZlibDecoder(io.netty.handler.codec.spdy.SpdyVersion r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.util.zip.Inflater r1 = new java.util.zip.Inflater
            r1.<init>()
            r0.decompressor = r1
            return
    }

    private int decompress(io.netty.buffer.ByteBufAllocator r4, io.netty.handler.codec.spdy.SpdyHeadersFrame r5) throws java.lang.Exception {
            r3 = this;
            r3.ensureBuffer(r4)
            io.netty.buffer.ByteBuf r4 = r3.decompressed
            byte[] r4 = r4.array()
            io.netty.buffer.ByteBuf r0 = r3.decompressed
            int r0 = r0.arrayOffset()
            io.netty.buffer.ByteBuf r1 = r3.decompressed
            int r1 = r1.writerIndex()
            int r0 = r0 + r1
            java.util.zip.Inflater r1 = r3.decompressor     // Catch: java.util.zip.DataFormatException -> L40
            io.netty.buffer.ByteBuf r2 = r3.decompressed     // Catch: java.util.zip.DataFormatException -> L40
            int r2 = r2.writableBytes()     // Catch: java.util.zip.DataFormatException -> L40
            int r1 = r1.inflate(r4, r0, r2)     // Catch: java.util.zip.DataFormatException -> L40
            if (r1 != 0) goto L45
            java.util.zip.Inflater r2 = r3.decompressor     // Catch: java.util.zip.DataFormatException -> L40
            boolean r2 = r2.needsDictionary()     // Catch: java.util.zip.DataFormatException -> L40
            if (r2 == 0) goto L45
            java.util.zip.Inflater r1 = r3.decompressor     // Catch: java.util.zip.DataFormatException -> L40 java.lang.IllegalArgumentException -> L42
            byte[] r2 = io.netty.handler.codec.spdy.SpdyCodecUtil.SPDY_DICT     // Catch: java.util.zip.DataFormatException -> L40 java.lang.IllegalArgumentException -> L42
            r1.setDictionary(r2)     // Catch: java.util.zip.DataFormatException -> L40 java.lang.IllegalArgumentException -> L42
            java.util.zip.Inflater r1 = r3.decompressor     // Catch: java.util.zip.DataFormatException -> L40
            io.netty.buffer.ByteBuf r2 = r3.decompressed     // Catch: java.util.zip.DataFormatException -> L40
            int r2 = r2.writableBytes()     // Catch: java.util.zip.DataFormatException -> L40
            int r1 = r1.inflate(r4, r0, r2)     // Catch: java.util.zip.DataFormatException -> L40
            goto L45
        L40:
            r4 = move-exception
            goto L5c
        L42:
            io.netty.handler.codec.spdy.SpdyProtocolException r4 = io.netty.handler.codec.spdy.SpdyHeaderBlockZlibDecoder.INVALID_HEADER_BLOCK     // Catch: java.util.zip.DataFormatException -> L40
            throw r4     // Catch: java.util.zip.DataFormatException -> L40
        L45:
            if (r5 == 0) goto L5b
            io.netty.buffer.ByteBuf r4 = r3.decompressed     // Catch: java.util.zip.DataFormatException -> L40
            int r0 = r4.writerIndex()     // Catch: java.util.zip.DataFormatException -> L40
            int r0 = r0 + r1
            r4.writerIndex(r0)     // Catch: java.util.zip.DataFormatException -> L40
            io.netty.buffer.ByteBuf r4 = r3.decompressed     // Catch: java.util.zip.DataFormatException -> L40
            r3.decodeHeaderBlock(r4, r5)     // Catch: java.util.zip.DataFormatException -> L40
            io.netty.buffer.ByteBuf r4 = r3.decompressed     // Catch: java.util.zip.DataFormatException -> L40
            r4.discardReadBytes()     // Catch: java.util.zip.DataFormatException -> L40
        L5b:
            return r1
        L5c:
            io.netty.handler.codec.spdy.SpdyProtocolException r5 = new io.netty.handler.codec.spdy.SpdyProtocolException
            java.lang.String r0 = "Received invalid header block"
            r5.<init>(r0, r4)
            throw r5
    }

    private void ensureBuffer(io.netty.buffer.ByteBufAllocator r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.decompressed
            if (r0 != 0) goto Lc
            r0 = 4096(0x1000, float:5.74E-42)
            io.netty.buffer.ByteBuf r2 = r2.heapBuffer(r0)
            r1.decompressed = r2
        Lc:
            io.netty.buffer.ByteBuf r2 = r1.decompressed
            r0 = 1
            r2.ensureWritable(r0)
            return
    }

    private void releaseBuffer() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.decompressed
            if (r0 == 0) goto La
            r0.release()
            r0 = 0
            r1.decompressed = r0
        La:
            return
    }

    private int setInput(io.netty.buffer.ByteBuf r5) {
            r4 = this;
            int r0 = r5.readableBytes()
            boolean r1 = r5.hasArray()
            if (r1 == 0) goto L1d
            java.util.zip.Inflater r1 = r4.decompressor
            byte[] r2 = r5.array()
            int r3 = r5.arrayOffset()
            int r5 = r5.readerIndex()
            int r3 = r3 + r5
            r1.setInput(r2, r3, r0)
            return r0
        L1d:
            byte[] r1 = new byte[r0]
            int r2 = r5.readerIndex()
            r5.getBytes(r2, r1)
            java.util.zip.Inflater r5 = r4.decompressor
            r2 = 0
            r5.setInput(r1, r2, r0)
            return r0
    }

    @Override // io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder, io.netty.handler.codec.spdy.SpdyHeaderBlockDecoder
    void decode(io.netty.buffer.ByteBufAllocator r3, io.netty.buffer.ByteBuf r4, io.netty.handler.codec.spdy.SpdyHeadersFrame r5) throws java.lang.Exception {
            r2 = this;
            int r0 = r2.setInput(r4)
        L4:
            int r1 = r2.decompress(r3, r5)
            if (r1 > 0) goto L4
            java.util.zip.Inflater r3 = r2.decompressor
            int r3 = r3.getRemaining()
            if (r3 != 0) goto L16
            r4.skipBytes(r0)
            return
        L16:
            io.netty.handler.codec.spdy.SpdyProtocolException r3 = io.netty.handler.codec.spdy.SpdyHeaderBlockZlibDecoder.INVALID_HEADER_BLOCK
            throw r3
    }

    @Override // io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder, io.netty.handler.codec.spdy.SpdyHeaderBlockDecoder
    public void end() {
            r1 = this;
            super.end()
            r1.releaseBuffer()
            java.util.zip.Inflater r0 = r1.decompressor
            r0.end()
            return
    }

    @Override // io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder, io.netty.handler.codec.spdy.SpdyHeaderBlockDecoder
    void endHeaderBlock(io.netty.handler.codec.spdy.SpdyHeadersFrame r1) throws java.lang.Exception {
            r0 = this;
            super.endHeaderBlock(r1)
            r0.releaseBuffer()
            return
    }
}
