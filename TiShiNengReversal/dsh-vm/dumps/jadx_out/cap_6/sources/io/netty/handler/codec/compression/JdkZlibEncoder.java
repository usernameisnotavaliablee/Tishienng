package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class JdkZlibEncoder extends io.netty.handler.codec.compression.ZlibEncoder {
    private static final byte[] gzipHeader = null;
    private final java.util.zip.CRC32 crc;
    private volatile io.netty.channel.ChannelHandlerContext ctx;
    private final java.util.zip.Deflater deflater;
    private volatile boolean finished;
    private final io.netty.handler.codec.compression.ZlibWrapper wrapper;
    private boolean writeHeader;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.compression.JdkZlibEncoder$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$compression$ZlibWrapper = null;

        static {
                io.netty.handler.codec.compression.ZlibWrapper[] r0 = io.netty.handler.codec.compression.ZlibWrapper.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.compression.JdkZlibEncoder.AnonymousClass4.$SwitchMap$io$netty$handler$codec$compression$ZlibWrapper = r0
                io.netty.handler.codec.compression.ZlibWrapper r1 = io.netty.handler.codec.compression.ZlibWrapper.GZIP     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.compression.JdkZlibEncoder.AnonymousClass4.$SwitchMap$io$netty$handler$codec$compression$ZlibWrapper     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.compression.ZlibWrapper r1 = io.netty.handler.codec.compression.ZlibWrapper.ZLIB     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }

        public AnonymousClass4() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            r0 = 10
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [31, -117, 8, 0, 0, 0, 0, 0, 0, 0} // fill-array
            io.netty.handler.codec.compression.JdkZlibEncoder.gzipHeader = r0
            return
    }

    public JdkZlibEncoder() {
            r1 = this;
            r0 = 6
            r1.<init>(r0)
            return
    }

    public JdkZlibEncoder(int r2) {
            r1 = this;
            io.netty.handler.codec.compression.ZlibWrapper r0 = io.netty.handler.codec.compression.ZlibWrapper.ZLIB
            r1.<init>(r0, r2)
            return
    }

    public JdkZlibEncoder(int r3, byte[] r4) {
            r2 = this;
            r2.<init>()
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r2.crc = r0
            r0 = 1
            r2.writeHeader = r0
            if (r3 < 0) goto L2c
            r0 = 9
            if (r3 > r0) goto L2c
            if (r4 == 0) goto L24
            io.netty.handler.codec.compression.ZlibWrapper r0 = io.netty.handler.codec.compression.ZlibWrapper.ZLIB
            r2.wrapper = r0
            java.util.zip.Deflater r0 = new java.util.zip.Deflater
            r0.<init>(r3)
            r2.deflater = r0
            r0.setDictionary(r4)
            return
        L24:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "dictionary"
            r3.<init>(r4)
            throw r3
        L2c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "compressionLevel: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " (expected: 0-9)"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    public JdkZlibEncoder(io.netty.handler.codec.compression.ZlibWrapper r2) {
            r1 = this;
            r0 = 6
            r1.<init>(r2, r0)
            return
    }

    public JdkZlibEncoder(io.netty.handler.codec.compression.ZlibWrapper r4, int r5) {
            r3 = this;
            r3.<init>()
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r3.crc = r0
            r0 = 1
            r3.writeHeader = r0
            if (r5 < 0) goto L4d
            r1 = 9
            if (r5 > r1) goto L4d
            if (r4 == 0) goto L45
            io.netty.handler.codec.compression.ZlibWrapper r1 = io.netty.handler.codec.compression.ZlibWrapper.ZLIB_OR_NONE
            if (r4 == r1) goto L29
            r3.wrapper = r4
            java.util.zip.Deflater r1 = new java.util.zip.Deflater
            io.netty.handler.codec.compression.ZlibWrapper r2 = io.netty.handler.codec.compression.ZlibWrapper.ZLIB
            if (r4 == r2) goto L22
            goto L23
        L22:
            r0 = 0
        L23:
            r1.<init>(r5, r0)
            r3.deflater = r1
            return
        L29:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "wrapper '"
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = "' is not allowed for compression."
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L45:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "wrapper"
            r4.<init>(r5)
            throw r4
        L4d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "compressionLevel: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = " (expected: 0-9)"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
    }

    public JdkZlibEncoder(byte[] r2) {
            r1 = this;
            r0 = 6
            r1.<init>(r0, r2)
            return
    }

    static /* synthetic */ io.netty.channel.ChannelHandlerContext access$000(io.netty.handler.codec.compression.JdkZlibEncoder r0) {
            io.netty.channel.ChannelHandlerContext r0 = r0.ctx()
            return r0
    }

    static /* synthetic */ io.netty.channel.ChannelFuture access$100(io.netty.handler.codec.compression.JdkZlibEncoder r0, io.netty.channel.ChannelHandlerContext r1, io.netty.channel.ChannelPromise r2) {
            io.netty.channel.ChannelFuture r0 = r0.finishEncode(r1, r2)
            return r0
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

    private void deflate(io.netty.buffer.ByteBuf r7) {
            r6 = this;
        L0:
            int r0 = r7.writerIndex()
            java.util.zip.Deflater r1 = r6.deflater
            byte[] r2 = r7.array()
            int r3 = r7.arrayOffset()
            int r3 = r3 + r0
            int r4 = r7.writableBytes()
            r5 = 2
            int r1 = r1.deflate(r2, r3, r4, r5)
            int r0 = r0 + r1
            r7.writerIndex(r0)
            if (r1 > 0) goto L0
            return
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
            io.netty.buffer.ByteBuf r0 = r0.heapBuffer()
            boolean r1 = r4.writeHeader
            if (r1 == 0) goto L25
            io.netty.handler.codec.compression.ZlibWrapper r1 = r4.wrapper
            io.netty.handler.codec.compression.ZlibWrapper r2 = io.netty.handler.codec.compression.ZlibWrapper.GZIP
            if (r1 != r2) goto L25
            r1 = 0
            r4.writeHeader = r1
            byte[] r1 = io.netty.handler.codec.compression.JdkZlibEncoder.gzipHeader
            r0.writeBytes(r1)
        L25:
            java.util.zip.Deflater r1 = r4.deflater
            r1.finish()
        L2a:
            java.util.zip.Deflater r1 = r4.deflater
            boolean r1 = r1.finished()
            if (r1 != 0) goto L47
            r4.deflate(r0)
            boolean r1 = r0.isWritable()
            if (r1 != 0) goto L2a
            r5.write(r0)
            io.netty.buffer.ByteBufAllocator r0 = r5.alloc()
            io.netty.buffer.ByteBuf r0 = r0.heapBuffer()
            goto L2a
        L47:
            io.netty.handler.codec.compression.ZlibWrapper r1 = r4.wrapper
            io.netty.handler.codec.compression.ZlibWrapper r2 = io.netty.handler.codec.compression.ZlibWrapper.GZIP
            if (r1 != r2) goto L7e
            java.util.zip.CRC32 r1 = r4.crc
            long r1 = r1.getValue()
            int r2 = (int) r1
            java.util.zip.Deflater r1 = r4.deflater
            int r1 = r1.getTotalIn()
            r0.writeByte(r2)
            int r3 = r2 >>> 8
            r0.writeByte(r3)
            int r3 = r2 >>> 16
            r0.writeByte(r3)
            int r2 = r2 >>> 24
            r0.writeByte(r2)
            r0.writeByte(r1)
            int r2 = r1 >>> 8
            r0.writeByte(r2)
            int r2 = r1 >>> 16
            r0.writeByte(r2)
            int r1 = r1 >>> 24
            r0.writeByte(r1)
        L7e:
            java.util.zip.Deflater r1 = r4.deflater
            r1.end()
            io.netty.channel.ChannelFuture r5 = r5.writeAndFlush(r0, r6)
            return r5
    }

    /* renamed from: allocateBuffer, reason: avoid collision after fix types in other method */
    protected final io.netty.buffer.ByteBuf allocateBuffer2(io.netty.channel.ChannelHandlerContext r3, io.netty.buffer.ByteBuf r4, boolean r5) throws java.lang.Exception {
            r2 = this;
            int r4 = r4.readableBytes()
            double r4 = (double) r4
            r0 = 4607186922399644778(0x3ff004189374bc6a, double:1.001)
            double r4 = r4 * r0
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
            int r5 = r4 + 12
            boolean r0 = r2.writeHeader
            if (r0 == 0) goto L2f
            int[] r0 = io.netty.handler.codec.compression.JdkZlibEncoder.AnonymousClass4.$SwitchMap$io$netty$handler$codec$compression$ZlibWrapper
            io.netty.handler.codec.compression.ZlibWrapper r1 = r2.wrapper
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L2b
            r1 = 2
            if (r0 == r1) goto L28
            goto L2f
        L28:
            int r5 = r4 + 14
            goto L2f
        L2b:
            byte[] r4 = io.netty.handler.codec.compression.JdkZlibEncoder.gzipHeader
            int r4 = r4.length
            int r5 = r5 + r4
        L2f:
            io.netty.buffer.ByteBufAllocator r3 = r3.alloc()
            io.netty.buffer.ByteBuf r3 = r3.heapBuffer(r5)
            return r3
    }

    @Override // io.netty.handler.codec.MessageToByteEncoder
    protected /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf allocateBuffer(io.netty.channel.ChannelHandlerContext r1, io.netty.buffer.ByteBuf r2, boolean r3) throws java.lang.Exception {
            r0 = this;
            io.netty.buffer.ByteBuf r2 = (io.netty.buffer.ByteBuf) r2
            io.netty.buffer.ByteBuf r1 = r0.allocateBuffer2(r1, r2, r3)
            return r1
    }

    @Override // io.netty.handler.codec.compression.ZlibEncoder
    public io.netty.channel.ChannelFuture close() {
            r1 = this;
            io.netty.channel.ChannelHandlerContext r0 = r1.ctx()
            io.netty.channel.ChannelPromise r0 = r0.newPromise()
            io.netty.channel.ChannelFuture r0 = r1.close(r0)
            return r0
    }

    @Override // io.netty.handler.codec.compression.ZlibEncoder
    public io.netty.channel.ChannelFuture close(io.netty.channel.ChannelPromise r4) {
            r3 = this;
            io.netty.channel.ChannelHandlerContext r0 = r3.ctx()
            io.netty.util.concurrent.EventExecutor r1 = r0.executor()
            boolean r2 = r1.inEventLoop()
            if (r2 == 0) goto L13
            io.netty.channel.ChannelFuture r4 = r3.finishEncode(r0, r4)
            return r4
        L13:
            io.netty.channel.ChannelPromise r0 = r0.newPromise()
            io.netty.handler.codec.compression.JdkZlibEncoder$1 r2 = new io.netty.handler.codec.compression.JdkZlibEncoder$1
            r2.<init>(r3, r0, r4)
            r1.execute(r2)
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundHandlerAdapter, io.netty.channel.ChannelOutboundHandler
    public void close(io.netty.channel.ChannelHandlerContext r4, io.netty.channel.ChannelPromise r5) throws java.lang.Exception {
            r3 = this;
            io.netty.channel.ChannelPromise r0 = r4.newPromise()
            io.netty.channel.ChannelFuture r0 = r3.finishEncode(r4, r0)
            io.netty.handler.codec.compression.JdkZlibEncoder$2 r1 = new io.netty.handler.codec.compression.JdkZlibEncoder$2
            r1.<init>(r3, r4, r5)
            r0.addListener(r1)
            boolean r0 = r0.isDone()
            if (r0 != 0) goto L26
            io.netty.util.concurrent.EventExecutor r0 = r4.executor()
            io.netty.handler.codec.compression.JdkZlibEncoder$3 r1 = new io.netty.handler.codec.compression.JdkZlibEncoder$3
            r1.<init>(r3, r4, r5)
            r4 = 10
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            r0.schedule(r1, r4, r2)
        L26:
            return
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r5, io.netty.buffer.ByteBuf r6, io.netty.buffer.ByteBuf r7) throws java.lang.Exception {
            r4 = this;
            boolean r5 = r4.finished
            if (r5 == 0) goto L8
            r7.writeBytes(r6)
            return
        L8:
            int r5 = r6.readableBytes()
            if (r5 != 0) goto Lf
            goto L59
        Lf:
            boolean r0 = r6.hasArray()
            r1 = 0
            if (r0 == 0) goto L27
            byte[] r0 = r6.array()
            int r2 = r6.arrayOffset()
            int r3 = r6.readerIndex()
            int r2 = r2 + r3
            r6.skipBytes(r5)
            goto L2d
        L27:
            byte[] r0 = new byte[r5]
            r6.readBytes(r0)
            r2 = 0
        L2d:
            boolean r6 = r4.writeHeader
            if (r6 == 0) goto L3e
            r4.writeHeader = r1
            io.netty.handler.codec.compression.ZlibWrapper r6 = r4.wrapper
            io.netty.handler.codec.compression.ZlibWrapper r1 = io.netty.handler.codec.compression.ZlibWrapper.GZIP
            if (r6 != r1) goto L3e
            byte[] r6 = io.netty.handler.codec.compression.JdkZlibEncoder.gzipHeader
            r7.writeBytes(r6)
        L3e:
            io.netty.handler.codec.compression.ZlibWrapper r6 = r4.wrapper
            io.netty.handler.codec.compression.ZlibWrapper r1 = io.netty.handler.codec.compression.ZlibWrapper.GZIP
            if (r6 != r1) goto L49
            java.util.zip.CRC32 r6 = r4.crc
            r6.update(r0, r2, r5)
        L49:
            java.util.zip.Deflater r6 = r4.deflater
            r6.setInput(r0, r2, r5)
        L4e:
            r4.deflate(r7)
            java.util.zip.Deflater r5 = r4.deflater
            boolean r5 = r5.needsInput()
            if (r5 == 0) goto L5a
        L59:
            return
        L5a:
            boolean r5 = r7.isWritable()
            if (r5 != 0) goto L4e
            int r5 = r7.writerIndex()
            r7.ensureWritable(r5)
            goto L4e
    }

    @Override // io.netty.handler.codec.MessageToByteEncoder
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, io.netty.buffer.ByteBuf r2, io.netty.buffer.ByteBuf r3) throws java.lang.Exception {
            r0 = this;
            io.netty.buffer.ByteBuf r2 = (io.netty.buffer.ByteBuf) r2
            r0.encode2(r1, r2, r3)
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerAdded(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r0.ctx = r1
            return
    }

    @Override // io.netty.handler.codec.compression.ZlibEncoder
    public boolean isClosed() {
            r1 = this;
            boolean r0 = r1.finished
            return r0
    }
}
