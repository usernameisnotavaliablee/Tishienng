package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Lz4FrameEncoder extends io.netty.handler.codec.MessageToByteEncoder<io.netty.buffer.ByteBuf> {
    static final int DEFAULT_MAX_ENCODE_SIZE = Integer.MAX_VALUE;
    private final int blockSize;
    private io.netty.buffer.ByteBuf buffer;
    private final io.netty.handler.codec.compression.ByteBufChecksum checksum;
    private final int compressionLevel;
    private final net.jpountz.lz4.LZ4Compressor compressor;
    private volatile io.netty.channel.ChannelHandlerContext ctx;
    private volatile boolean finished;
    private final int maxEncodeSize;




    public Lz4FrameEncoder() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public Lz4FrameEncoder(net.jpountz.lz4.LZ4Factory r7, boolean r8, int r9, java.util.zip.Checksum r10) {
            r6 = this;
            r5 = 2147483647(0x7fffffff, float:NaN)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public Lz4FrameEncoder(net.jpountz.lz4.LZ4Factory r1, boolean r2, int r3, java.util.zip.Checksum r4, int r5) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L36
            if (r4 == 0) goto L2e
            if (r2 == 0) goto Le
            net.jpountz.lz4.LZ4Compressor r1 = r1.highCompressor()
            goto L12
        Le:
            net.jpountz.lz4.LZ4Compressor r1 = r1.fastCompressor()
        L12:
            r0.compressor = r1
            io.netty.handler.codec.compression.ByteBufChecksum r1 = io.netty.handler.codec.compression.ByteBufChecksum.wrapChecksum(r4)
            r0.checksum = r1
            int r1 = compressionLevel(r3)
            r0.compressionLevel = r1
            r0.blockSize = r3
            java.lang.String r1 = "maxEncodeSize"
            int r1 = io.netty.util.internal.ObjectUtil.checkPositive(r5, r1)
            r0.maxEncodeSize = r1
            r1 = 0
            r0.finished = r1
            return
        L2e:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "checksum"
            r1.<init>(r2)
            throw r1
        L36:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "factory"
            r1.<init>(r2)
            throw r1
    }

    public Lz4FrameEncoder(boolean r4) {
            r3 = this;
            net.jpountz.lz4.LZ4Factory r0 = net.jpountz.lz4.LZ4Factory.fastestInstance()
            io.netty.handler.codec.compression.Lz4XXHash32 r1 = new io.netty.handler.codec.compression.Lz4XXHash32
            r2 = -1756908916(0xffffffff9747b28c, float:-6.4525726E-25)
            r1.<init>(r2)
            r2 = 65536(0x10000, float:9.1835E-41)
            r3.<init>(r0, r4, r2, r1)
            return
    }

    static /* synthetic */ io.netty.channel.ChannelHandlerContext access$000(io.netty.handler.codec.compression.Lz4FrameEncoder r0) {
            io.netty.channel.ChannelHandlerContext r0 = r0.ctx()
            return r0
    }

    static /* synthetic */ io.netty.channel.ChannelFuture access$100(io.netty.handler.codec.compression.Lz4FrameEncoder r0, io.netty.channel.ChannelHandlerContext r1, io.netty.channel.ChannelPromise r2) {
            io.netty.channel.ChannelFuture r0 = r0.finishEncode(r1, r2)
            return r0
    }

    private io.netty.buffer.ByteBuf allocateBuffer(io.netty.channel.ChannelHandlerContext r5, io.netty.buffer.ByteBuf r6, boolean r7, boolean r8) {
            r4 = this;
            int r6 = r6.readableBytes()
            io.netty.buffer.ByteBuf r0 = r4.buffer
            int r0 = r0.readableBytes()
            int r6 = r6 + r0
            if (r6 < 0) goto L63
            r0 = 0
            r1 = 0
        Lf:
            if (r6 <= 0) goto L22
            int r2 = r4.blockSize
            int r2 = java.lang.Math.min(r2, r6)
            int r6 = r6 - r2
            net.jpountz.lz4.LZ4Compressor r3 = r4.compressor
            int r2 = r3.maxCompressedLength(r2)
            int r2 = r2 + 21
            int r1 = r1 + r2
            goto Lf
        L22:
            int r6 = r4.maxEncodeSize
            if (r1 > r6) goto L45
            if (r1 < 0) goto L45
            if (r8 == 0) goto L31
            int r6 = r4.blockSize
            if (r1 >= r6) goto L31
            io.netty.buffer.ByteBuf r5 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r5
        L31:
            if (r7 == 0) goto L3c
            io.netty.buffer.ByteBufAllocator r5 = r5.alloc()
            io.netty.buffer.ByteBuf r5 = r5.ioBuffer(r1, r1)
            return r5
        L3c:
            io.netty.buffer.ByteBufAllocator r5 = r5.alloc()
            io.netty.buffer.ByteBuf r5 = r5.heapBuffer(r1, r1)
            return r5
        L45:
            io.netty.handler.codec.EncoderException r5 = new io.netty.handler.codec.EncoderException
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            int r7 = r4.maxEncodeSize
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r0] = r6
            r6 = 1
            r8[r6] = r7
            java.lang.String r6 = "requested encode buffer size (%d bytes) exceeds the maximum allowable size (%d bytes)"
            java.lang.String r6 = java.lang.String.format(r6, r8)
            r5.<init>(r6)
            throw r5
        L63:
            io.netty.handler.codec.EncoderException r5 = new io.netty.handler.codec.EncoderException
            java.lang.String r6 = "too much data to allocate a buffer for compression"
            r5.<init>(r6)
            throw r5
    }

    private static int compressionLevel(int r6) {
            r0 = 0
            r1 = 1
            r2 = 33554432(0x2000000, float:9.403955E-38)
            r3 = 64
            if (r6 < r3) goto L16
            if (r6 > r2) goto L16
            int r6 = r6 - r1
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = 22 - r6
            int r6 = java.lang.Math.max(r0, r6)
            return r6
        L16:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r0] = r6
            r5[r1] = r3
            r6 = 2
            r5[r6] = r2
            java.lang.String r6 = "blockSize: %d (expected: %d-%d)"
            java.lang.String r6 = java.lang.String.format(r6, r5)
            r4.<init>(r6)
            throw r4
    }

    private io.netty.channel.ChannelHandlerContext ctx() {
            r2 = this;
            io.netty.channel.ChannelHandlerContext r0 = r2.ctx
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "not added to a pipeline"
            r0.<init>(r1)
            throw r0
    }

    private io.netty.channel.ChannelFuture finishEncode(io.netty.channel.ChannelHandlerContext r5, io.netty.channel.ChannelPromise r6) {
            r4 = this;
            boolean r0 = r4.finished
            if (r0 == 0) goto L8
            r6.setSuccess()
            return r6
        L8:
            r0 = 1
            r4.finished = r0
            io.netty.buffer.ByteBufAllocator r0 = r5.alloc()
            net.jpountz.lz4.LZ4Compressor r1 = r4.compressor
            io.netty.buffer.ByteBuf r2 = r4.buffer
            int r2 = r2.readableBytes()
            int r1 = r1.maxCompressedLength(r2)
            int r1 = r1 + 21
            io.netty.buffer.ByteBuf r0 = r0.heapBuffer(r1)
            r4.flushBufferedData(r0)
            int r1 = r0.writerIndex()
            r2 = 5501767354678207339(0x4c5a34426c6f636b, double:6.579441740982069E59)
            r0.setLong(r1, r2)
            int r2 = r1 + 8
            int r3 = r4.compressionLevel
            r3 = r3 | 16
            byte r3 = (byte) r3
            r0.setByte(r2, r3)
            int r2 = r1 + 9
            r3 = 0
            r0.setInt(r2, r3)
            int r2 = r1 + 13
            r0.setInt(r2, r3)
            int r2 = r1 + 17
            r0.setInt(r2, r3)
            int r1 = r1 + 21
            r0.writerIndex(r1)
            io.netty.channel.ChannelFuture r5 = r5.writeAndFlush(r0, r6)
            return r5
    }

    private void flushBufferedData(io.netty.buffer.ByteBuf r10) {
            r9 = this;
            io.netty.buffer.ByteBuf r0 = r9.buffer
            int r0 = r0.readableBytes()
            if (r0 != 0) goto L9
            return
        L9:
            io.netty.handler.codec.compression.ByteBufChecksum r1 = r9.checksum
            r1.reset()
            io.netty.handler.codec.compression.ByteBufChecksum r1 = r9.checksum
            io.netty.buffer.ByteBuf r2 = r9.buffer
            int r3 = r2.readerIndex()
            r1.update(r2, r3, r0)
            io.netty.handler.codec.compression.ByteBufChecksum r1 = r9.checksum
            long r1 = r1.getValue()
            int r2 = (int) r1
            net.jpountz.lz4.LZ4Compressor r1 = r9.compressor
            int r1 = r1.maxCompressedLength(r0)
            int r1 = r1 + 21
            r10.ensureWritable(r1)
            int r1 = r10.writerIndex()
            int r3 = r1 + 21
            int r4 = r10.writableBytes()     // Catch: net.jpountz.lz4.LZ4Exception -> L8e
            int r4 = r4 + (-21)
            java.nio.ByteBuffer r4 = r10.internalNioBuffer(r3, r4)     // Catch: net.jpountz.lz4.LZ4Exception -> L8e
            int r5 = r4.position()     // Catch: net.jpountz.lz4.LZ4Exception -> L8e
            net.jpountz.lz4.LZ4Compressor r6 = r9.compressor     // Catch: net.jpountz.lz4.LZ4Exception -> L8e
            io.netty.buffer.ByteBuf r7 = r9.buffer     // Catch: net.jpountz.lz4.LZ4Exception -> L8e
            int r8 = r7.readerIndex()     // Catch: net.jpountz.lz4.LZ4Exception -> L8e
            java.nio.ByteBuffer r7 = r7.internalNioBuffer(r8, r0)     // Catch: net.jpountz.lz4.LZ4Exception -> L8e
            r6.compress(r7, r4)     // Catch: net.jpountz.lz4.LZ4Exception -> L8e
            int r4 = r4.position()     // Catch: net.jpountz.lz4.LZ4Exception -> L8e
            int r4 = r4 - r5
            if (r4 < r0) goto L5f
            io.netty.buffer.ByteBuf r4 = r9.buffer
            r5 = 0
            r10.setBytes(r3, r4, r5, r0)
            r4 = 16
            r5 = r0
            goto L64
        L5f:
            r5 = 32
            r5 = r4
            r4 = 32
        L64:
            r6 = 5501767354678207339(0x4c5a34426c6f636b, double:6.579441740982069E59)
            r10.setLong(r1, r6)
            int r6 = r1 + 8
            int r7 = r9.compressionLevel
            r4 = r4 | r7
            byte r4 = (byte) r4
            r10.setByte(r6, r4)
            int r4 = r1 + 9
            r10.setIntLE(r4, r5)
            int r4 = r1 + 13
            r10.setIntLE(r4, r0)
            int r1 = r1 + 17
            r10.setIntLE(r1, r2)
            int r3 = r3 + r5
            r10.writerIndex(r3)
            io.netty.buffer.ByteBuf r10 = r9.buffer
            r10.clear()
            return
        L8e:
            r10 = move-exception
            io.netty.handler.codec.compression.CompressionException r0 = new io.netty.handler.codec.compression.CompressionException
            r0.<init>(r10)
            throw r0
    }

    /* renamed from: allocateBuffer, reason: avoid collision after fix types in other method */
    protected io.netty.buffer.ByteBuf allocateBuffer2(io.netty.channel.ChannelHandlerContext r2, io.netty.buffer.ByteBuf r3, boolean r4) {
            r1 = this;
            r0 = 1
            io.netty.buffer.ByteBuf r2 = r1.allocateBuffer(r2, r3, r4, r0)
            return r2
    }

    @Override // io.netty.handler.codec.MessageToByteEncoder
    protected /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf allocateBuffer(io.netty.channel.ChannelHandlerContext r1, io.netty.buffer.ByteBuf r2, boolean r3) throws java.lang.Exception {
            r0 = this;
            io.netty.buffer.ByteBuf r2 = (io.netty.buffer.ByteBuf) r2
            io.netty.buffer.ByteBuf r1 = r0.allocateBuffer2(r1, r2, r3)
            return r1
    }

    public io.netty.channel.ChannelFuture close() {
            r1 = this;
            io.netty.channel.ChannelHandlerContext r0 = r1.ctx()
            io.netty.channel.ChannelPromise r0 = r0.newPromise()
            io.netty.channel.ChannelFuture r0 = r1.close(r0)
            return r0
    }

    public io.netty.channel.ChannelFuture close(io.netty.channel.ChannelPromise r4) {
            r3 = this;
            io.netty.channel.ChannelHandlerContext r0 = r3.ctx()
            io.netty.util.concurrent.EventExecutor r1 = r0.executor()
            boolean r2 = r1.inEventLoop()
            if (r2 == 0) goto L13
            io.netty.channel.ChannelFuture r4 = r3.finishEncode(r0, r4)
            return r4
        L13:
            io.netty.handler.codec.compression.Lz4FrameEncoder$1 r0 = new io.netty.handler.codec.compression.Lz4FrameEncoder$1
            r0.<init>(r3, r4)
            r1.execute(r0)
            return r4
    }

    @Override // io.netty.channel.ChannelOutboundHandlerAdapter, io.netty.channel.ChannelOutboundHandler
    public void close(io.netty.channel.ChannelHandlerContext r4, io.netty.channel.ChannelPromise r5) throws java.lang.Exception {
            r3 = this;
            io.netty.channel.ChannelPromise r0 = r4.newPromise()
            io.netty.channel.ChannelFuture r0 = r3.finishEncode(r4, r0)
            io.netty.handler.codec.compression.Lz4FrameEncoder$2 r1 = new io.netty.handler.codec.compression.Lz4FrameEncoder$2
            r1.<init>(r3, r4, r5)
            r0.addListener(r1)
            boolean r0 = r0.isDone()
            if (r0 != 0) goto L26
            io.netty.util.concurrent.EventExecutor r0 = r4.executor()
            io.netty.handler.codec.compression.Lz4FrameEncoder$3 r1 = new io.netty.handler.codec.compression.Lz4FrameEncoder$3
            r1.<init>(r3, r4, r5)
            r4 = 10
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            r0.schedule(r1, r4, r2)
        L26:
            return
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r3, io.netty.buffer.ByteBuf r4, io.netty.buffer.ByteBuf r5) throws java.lang.Exception {
            r2 = this;
            boolean r3 = r2.finished
            if (r3 == 0) goto L1a
            int r3 = r4.readableBytes()
            boolean r3 = r5.isWritable(r3)
            if (r3 == 0) goto L12
            r5.writeBytes(r4)
            return
        L12:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "encode finished and not enough space to write remaining data"
            r3.<init>(r4)
            throw r3
        L1a:
            io.netty.buffer.ByteBuf r3 = r2.buffer
        L1c:
            int r0 = r4.readableBytes()
            if (r0 <= 0) goto L37
            int r1 = r3.writableBytes()
            int r0 = java.lang.Math.min(r0, r1)
            r4.readBytes(r3, r0)
            boolean r0 = r3.isWritable()
            if (r0 != 0) goto L1c
            r2.flushBufferedData(r5)
            goto L1c
        L37:
            return
    }

    @Override // io.netty.handler.codec.MessageToByteEncoder
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, io.netty.buffer.ByteBuf r2, io.netty.buffer.ByteBuf r3) throws java.lang.Exception {
            r0 = this;
            io.netty.buffer.ByteBuf r2 = (io.netty.buffer.ByteBuf) r2
            r0.encode2(r1, r2, r3)
            return
    }

    @Override // io.netty.channel.ChannelOutboundHandlerAdapter, io.netty.channel.ChannelOutboundHandler
    public void flush(io.netty.channel.ChannelHandlerContext r4) throws java.lang.Exception {
            r3 = this;
            io.netty.buffer.ByteBuf r0 = r3.buffer
            if (r0 == 0) goto L1b
            boolean r0 = r0.isReadable()
            if (r0 == 0) goto L1b
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            boolean r1 = r3.isPreferDirect()
            r2 = 0
            io.netty.buffer.ByteBuf r0 = r3.allocateBuffer(r4, r0, r1, r2)
            r3.flushBufferedData(r0)
            r4.write(r0)
        L1b:
            r4.flush()
            return
    }

    final io.netty.buffer.ByteBuf getBackingBuffer() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            return r0
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerAdded(io.netty.channel.ChannelHandlerContext r1) {
            r0 = this;
            r0.ctx = r1
            int r1 = r0.blockSize
            byte[] r1 = new byte[r1]
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.wrappedBuffer(r1)
            r0.buffer = r1
            r1.clear()
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerRemoved(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            super.handlerRemoved(r1)
            io.netty.buffer.ByteBuf r1 = r0.buffer
            if (r1 == 0) goto Ld
            r1.release()
            r1 = 0
            r0.buffer = r1
        Ld:
            return
    }

    public boolean isClosed() {
            r1 = this;
            boolean r0 = r1.finished
            return r0
    }
}
