package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class SpdyHeaderBlockZlibEncoder extends io.netty.handler.codec.spdy.SpdyHeaderBlockRawEncoder {
    private final java.util.zip.Deflater compressor;
    private boolean finished;

    SpdyHeaderBlockZlibEncoder(io.netty.handler.codec.spdy.SpdyVersion r3, int r4) {
            r2 = this;
            r2.<init>(r3)
            if (r4 < 0) goto L16
            r3 = 9
            if (r4 > r3) goto L16
            java.util.zip.Deflater r3 = new java.util.zip.Deflater
            r3.<init>(r4)
            r2.compressor = r3
            byte[] r4 = io.netty.handler.codec.spdy.SpdyCodecUtil.SPDY_DICT
            r3.setDictionary(r4)
            return
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "compressionLevel: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " (expected: 0-9)"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    private boolean compressInto(io.netty.buffer.ByteBuf r6) {
            r5 = this;
            byte[] r0 = r6.array()
            int r1 = r6.arrayOffset()
            int r2 = r6.writerIndex()
            int r1 = r1 + r2
            int r2 = r6.writableBytes()
            java.util.zip.Deflater r3 = r5.compressor
            r4 = 2
            int r0 = r3.deflate(r0, r1, r2, r4)
            int r1 = r6.writerIndex()
            int r1 = r1 + r0
            r6.writerIndex(r1)
            if (r0 != r2) goto L24
            r6 = 1
            return r6
        L24:
            r6 = 0
            return r6
    }

    private io.netty.buffer.ByteBuf encode(io.netty.buffer.ByteBufAllocator r1, int r2) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r1.heapBuffer(r2)
        L4:
            boolean r2 = r0.compressInto(r1)     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L16
            int r2 = r1.capacity()     // Catch: java.lang.Throwable -> L14
            int r2 = r2 << 1
            r1.ensureWritable(r2)     // Catch: java.lang.Throwable -> L14
            goto L4
        L14:
            r2 = move-exception
            goto L17
        L16:
            return r1
        L17:
            r1.release()
            throw r2
    }

    private int setInput(io.netty.buffer.ByteBuf r5) {
            r4 = this;
            int r0 = r5.readableBytes()
            boolean r1 = r5.hasArray()
            if (r1 == 0) goto L1d
            java.util.zip.Deflater r1 = r4.compressor
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
            java.util.zip.Deflater r5 = r4.compressor
            r2 = 0
            r5.setInput(r1, r2, r0)
            return r0
    }

    @Override // io.netty.handler.codec.spdy.SpdyHeaderBlockRawEncoder, io.netty.handler.codec.spdy.SpdyHeaderBlockEncoder
    public io.netty.buffer.ByteBuf encode(io.netty.buffer.ByteBufAllocator r2, io.netty.handler.codec.spdy.SpdyHeadersFrame r3) throws java.lang.Exception {
            r1 = this;
            if (r3 == 0) goto L2b
            boolean r0 = r1.finished
            if (r0 == 0) goto L9
            io.netty.buffer.ByteBuf r2 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r2
        L9:
            io.netty.buffer.ByteBuf r3 = super.encode(r2, r3)
            boolean r0 = r3.isReadable()     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L1b
            io.netty.buffer.ByteBuf r2 = io.netty.buffer.Unpooled.EMPTY_BUFFER     // Catch: java.lang.Throwable -> L19
            r3.release()
            return r2
        L19:
            r2 = move-exception
            goto L27
        L1b:
            int r0 = r1.setInput(r3)     // Catch: java.lang.Throwable -> L19
            io.netty.buffer.ByteBuf r2 = r1.encode(r2, r0)     // Catch: java.lang.Throwable -> L19
            r3.release()
            return r2
        L27:
            r3.release()
            throw r2
        L2b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "frame"
            r2.<init>(r3)
            throw r2
    }

    @Override // io.netty.handler.codec.spdy.SpdyHeaderBlockRawEncoder, io.netty.handler.codec.spdy.SpdyHeaderBlockEncoder
    public void end() {
            r1 = this;
            boolean r0 = r1.finished
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.finished = r0
            java.util.zip.Deflater r0 = r1.compressor
            r0.end()
            super.end()
            return
    }
}
