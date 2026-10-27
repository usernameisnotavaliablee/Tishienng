package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class SpdyHeaderBlockJZlibEncoder extends io.netty.handler.codec.spdy.SpdyHeaderBlockRawEncoder {
    private boolean finished;
    private final com.jcraft.jzlib.Deflater z;

    SpdyHeaderBlockJZlibEncoder(io.netty.handler.codec.spdy.SpdyVersion r3, int r4, int r5, int r6) {
            r2 = this;
            r2.<init>(r3)
            com.jcraft.jzlib.Deflater r3 = new com.jcraft.jzlib.Deflater
            r3.<init>()
            r2.z = r3
            if (r4 < 0) goto L93
            r0 = 9
            if (r4 > r0) goto L93
            if (r5 < r0) goto L77
            r1 = 15
            if (r5 > r1) goto L77
            r1 = 1
            if (r6 < r1) goto L5b
            if (r6 > r0) goto L5b
            com.jcraft.jzlib.JZlib$WrapperType r0 = com.jcraft.jzlib.JZlib.W_ZLIB
            int r4 = r3.deflateInit(r4, r5, r6, r0)
            if (r4 != 0) goto L44
            byte[] r4 = io.netty.handler.codec.spdy.SpdyCodecUtil.SPDY_DICT
            int r5 = r4.length
            int r3 = r3.deflateSetDictionary(r4, r5)
            if (r3 != 0) goto L2d
            return
        L2d:
            io.netty.handler.codec.compression.CompressionException r4 = new io.netty.handler.codec.compression.CompressionException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "failed to set the SPDY dictionary: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L44:
            io.netty.handler.codec.compression.CompressionException r3 = new io.netty.handler.codec.compression.CompressionException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "failed to initialize an SPDY header block deflater: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        L5b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "memLevel: "
            r4.append(r5)
            r4.append(r6)
            java.lang.String r5 = " (expected: 1-9)"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L77:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "windowBits: "
            r4.append(r6)
            r4.append(r5)
            java.lang.String r5 = " (expected: 9-15)"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L93:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "compressionLevel: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = " (expected: 0-9)"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
    }

    private io.netty.buffer.ByteBuf encode(io.netty.buffer.ByteBufAllocator r8) {
            r7 = this;
            r0 = 0
            com.jcraft.jzlib.Deflater r1 = r7.z     // Catch: java.lang.Throwable -> L87
            int r1 = r1.next_in_index     // Catch: java.lang.Throwable -> L87
            com.jcraft.jzlib.Deflater r2 = r7.z     // Catch: java.lang.Throwable -> L87
            int r2 = r2.next_out_index     // Catch: java.lang.Throwable -> L87
            com.jcraft.jzlib.Deflater r3 = r7.z     // Catch: java.lang.Throwable -> L87
            byte[] r3 = r3.next_in     // Catch: java.lang.Throwable -> L87
            int r3 = r3.length     // Catch: java.lang.Throwable -> L87
            double r3 = (double) r3     // Catch: java.lang.Throwable -> L87
            r5 = 4607186922399644778(0x3ff004189374bc6a, double:1.001)
            double r3 = r3 * r5
            double r3 = java.lang.Math.ceil(r3)     // Catch: java.lang.Throwable -> L87
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L87
            int r3 = r3 + 12
            io.netty.buffer.ByteBuf r8 = r8.heapBuffer(r3)     // Catch: java.lang.Throwable -> L87
            com.jcraft.jzlib.Deflater r4 = r7.z     // Catch: java.lang.Throwable -> L5b
            byte[] r5 = r8.array()     // Catch: java.lang.Throwable -> L5b
            r4.next_out = r5     // Catch: java.lang.Throwable -> L5b
            com.jcraft.jzlib.Deflater r4 = r7.z     // Catch: java.lang.Throwable -> L5b
            int r5 = r8.arrayOffset()     // Catch: java.lang.Throwable -> L5b
            int r6 = r8.writerIndex()     // Catch: java.lang.Throwable -> L5b
            int r5 = r5 + r6
            r4.next_out_index = r5     // Catch: java.lang.Throwable -> L5b
            com.jcraft.jzlib.Deflater r4 = r7.z     // Catch: java.lang.Throwable -> L5b
            r4.avail_out = r3     // Catch: java.lang.Throwable -> L5b
            com.jcraft.jzlib.Deflater r3 = r7.z     // Catch: java.lang.Throwable -> L7d
            r4 = 2
            int r3 = r3.deflate(r4)     // Catch: java.lang.Throwable -> L7d
            com.jcraft.jzlib.Deflater r4 = r7.z     // Catch: java.lang.Throwable -> L5b
            int r4 = r4.next_in_index     // Catch: java.lang.Throwable -> L5b
            int r4 = r4 - r1
            r8.skipBytes(r4)     // Catch: java.lang.Throwable -> L5b
            if (r3 != 0) goto L66
            com.jcraft.jzlib.Deflater r1 = r7.z     // Catch: java.lang.Throwable -> L5b
            int r1 = r1.next_out_index     // Catch: java.lang.Throwable -> L5b
            int r1 = r1 - r2
            if (r1 <= 0) goto L5d
            int r2 = r8.writerIndex()     // Catch: java.lang.Throwable -> L5b
            int r2 = r2 + r1
            r8.writerIndex(r2)     // Catch: java.lang.Throwable -> L5b
            goto L5d
        L5b:
            r1 = move-exception
            goto L89
        L5d:
            com.jcraft.jzlib.Deflater r1 = r7.z
            r1.next_in = r0
            com.jcraft.jzlib.Deflater r1 = r7.z
            r1.next_out = r0
            return r8
        L66:
            io.netty.handler.codec.compression.CompressionException r1 = new io.netty.handler.codec.compression.CompressionException     // Catch: java.lang.Throwable -> L5b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r2.<init>()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = "compression failure: "
            r2.append(r4)     // Catch: java.lang.Throwable -> L5b
            r2.append(r3)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L5b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L5b
            throw r1     // Catch: java.lang.Throwable -> L5b
        L7d:
            r2 = move-exception
            com.jcraft.jzlib.Deflater r3 = r7.z     // Catch: java.lang.Throwable -> L5b
            int r3 = r3.next_in_index     // Catch: java.lang.Throwable -> L5b
            int r3 = r3 - r1
            r8.skipBytes(r3)     // Catch: java.lang.Throwable -> L5b
            throw r2     // Catch: java.lang.Throwable -> L5b
        L87:
            r1 = move-exception
            r8 = r0
        L89:
            com.jcraft.jzlib.Deflater r2 = r7.z
            r2.next_in = r0
            com.jcraft.jzlib.Deflater r2 = r7.z
            r2.next_out = r0
            if (r8 == 0) goto L96
            r8.release()
        L96:
            throw r1
    }

    private void setInput(io.netty.buffer.ByteBuf r4) {
            r3 = this;
            int r0 = r4.readableBytes()
            boolean r1 = r4.hasArray()
            if (r1 == 0) goto L18
            byte[] r1 = r4.array()
            int r2 = r4.arrayOffset()
            int r4 = r4.readerIndex()
            int r2 = r2 + r4
            goto L22
        L18:
            byte[] r1 = new byte[r0]
            int r2 = r4.readerIndex()
            r4.getBytes(r2, r1)
            r2 = 0
        L22:
            com.jcraft.jzlib.Deflater r4 = r3.z
            r4.next_in = r1
            com.jcraft.jzlib.Deflater r4 = r3.z
            r4.next_in_index = r2
            com.jcraft.jzlib.Deflater r4 = r3.z
            r4.avail_in = r0
            return
    }

    @Override // io.netty.handler.codec.spdy.SpdyHeaderBlockRawEncoder, io.netty.handler.codec.spdy.SpdyHeaderBlockEncoder
    public io.netty.buffer.ByteBuf encode(io.netty.buffer.ByteBufAllocator r2, io.netty.handler.codec.spdy.SpdyHeadersFrame r3) throws java.lang.Exception {
            r1 = this;
            if (r3 == 0) goto L2a
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
            goto L26
        L1b:
            r1.setInput(r3)     // Catch: java.lang.Throwable -> L19
            io.netty.buffer.ByteBuf r2 = r1.encode(r2)     // Catch: java.lang.Throwable -> L19
            r3.release()
            return r2
        L26:
            r3.release()
            throw r2
        L2a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "frame"
            r2.<init>(r3)
            throw r2
    }

    @Override // io.netty.handler.codec.spdy.SpdyHeaderBlockRawEncoder, io.netty.handler.codec.spdy.SpdyHeaderBlockEncoder
    public void end() {
            r2 = this;
            boolean r0 = r2.finished
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.finished = r0
            com.jcraft.jzlib.Deflater r0 = r2.z
            r0.deflateEnd()
            com.jcraft.jzlib.Deflater r0 = r2.z
            r1 = 0
            r0.next_in = r1
            com.jcraft.jzlib.Deflater r0 = r2.z
            r0.next_out = r1
            return
    }
}
